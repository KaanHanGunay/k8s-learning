Ingress aktif etme
kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/controller-v0.41.2/deploy/static/provider/cloud/deploy.yaml

docker build kaanhangunay/sp-1:1.0 .
docker push kaanhangunay/sp-1:1.0