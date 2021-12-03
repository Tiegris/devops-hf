FROM nginx:1.19.0-alpine
WORKDIR /app
EXPOSE 80
COPY ./nginx.conf /etc/nginx/nginx.conf
COPY . /app/wwwroot
