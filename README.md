# devops-hf

kubernetes deployment {
    adatbázis,
    backend,
    frontend,
    reverse proxy,
}

GitHub CICD (backend)

2 branch 2 féle backend impl.

A B teszt (Canary deployments) => yaeger tracing (lehet hogy nem yäger lesz)


Lesz benne: CICD, kubernetes (helm), yaeger, proof concept AB teszt, trafic controll proxyzás

Kapcsolodó, de nem fektetek rá hangsúlyt: AB teszt kiértékelése, mért eretményeket csak felszínesen értékelem ki, legegyszerűb proxi, rollback nem automatikus

Átolvasott irodalom:

- https://glasnostic.com/blog/how-canary-deployments-work-1-kubernetes-istio-linkerd
- https://glasnostic.com/blog/how-canary-deployments-work-2-developer-vs-operator-concerns
- https://istio.io/latest/blog/2017/0.1-canary/ -> complex selectors, even regex
- https://www.getambassador.io/docs/edge-stack/latest/topics/using/canary/ -> weighted round robin
- https://www.mirantis.com/blog/your-app-deserves-more-than-kubernetes-ingress-kubernetes-ingress-vs-istio-gateway-webinar/

Apply all:

```bash
ka -f virtual-services.yaml -f ingress.yaml -f destination-rules.yaml -f deployments-be.yaml -f deployments-fe.yaml -f services.yaml
```
