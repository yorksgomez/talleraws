# Utiliza una imagen base de Nginx oficial desde Docker Hub
FROM nginx:latest

# Copia los archivos estáticos de tu aplicación a la carpeta de trabajo en el contenedor
COPY ./* /usr/share/nginx/html

# Exponer el puerto 80 para que el servidor web Nginx pueda escuchar las solicitudes
EXPOSE 80

# Comando para iniciar el servidor web Nginx cuando se inicie el contenedor
CMD ["nginx", "-g", "daemon off;"]
