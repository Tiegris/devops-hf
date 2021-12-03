mdata = []

function fetchList() {
    fetch('nevnap')
        .then(response => response.json())
        .then(data => setData(data)).catch((error) => {
            var list = document.getElementById("loading_sign");
            list.innerHTML = "Can't reach database";
        });
}

function setData(x) {
    mdata = x;
    renderList();
}

function renderList() {
    var list = document.getElementById("list");
    list.innerHTML = "";

    mdata.forEach(scheme => {
        var head = document.createElement("div");
        head.className = "d-flex";
        var head_name = document.createElement("div");
        head_name.innerHTML = scheme.name;
        head.appendChild(head_name);

        var date = document.createElement("div");
        date.innerHTML = scheme.date;

        var buttons = document.createElement("div");
        buttons.className = "d-flex";
        var buttons_aligner = document.createElement("div");
        buttons_aligner.className = "btn-group ml-auto";

        var btnDelete = document.createElement("button");
        btnDelete.className = "btn btn-outline-danger fas fa-trash"
        btnDelete.onclick = function () {
            deleteNN(scheme.id);
        }
        buttons_aligner.appendChild(btnDelete);

        buttons.appendChild(buttons_aligner);

        var row = document.createElement("div");
        row.className = "list-group-item col";
        row.appendChild(head);
        row.appendChild(date);
        row.appendChild(buttons);

        list.appendChild(row)
    });

}

function sendForm() {
    form = document.getElementById("editForm");
    let name = form.querySelector('input[id="name"]').value;
    let date = form.querySelector('input[id="date"]').value;
    sd = { name, date }

    jsonData = JSON.stringify(sd);

    console.log(jsonData)

    $.ajax({
        url: '/nameday',
        type: 'POST',
        data: jsonData,
        dataType: 'json',
        processData: false,
        'contentType': 'application/json',
        success: function () {
            fetchList()
            document.getElementById("name").value = null;
            document.getElementById("date").value = null;
        }
    });

}

function deleteNN(id) {
    $.ajax({
        url: '/nameday' + id,
        type: 'DELETE',
        success: function () {
            fetchList()
        }
    });
}

fetchList();
