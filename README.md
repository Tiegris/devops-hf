# devops-hf

Átolvasott irodalom:

- https://glasnostic.com/blog/how-canary-deployments-work-1-kubernetes-istio-linkerd
- https://glasnostic.com/blog/how-canary-deployments-work-2-developer-vs-operator-concerns
- https://istio.io/latest/blog/2017/0.1-canary/ -> complex selectors, even regex
- https://www.getambassador.io/docs/edge-stack/latest/topics/using/canary/ -> weighted round robin
- https://www.mirantis.com/blog/your-app-deserves-more-than-kubernetes-ingress-kubernetes-ingress-vs-istio-gateway-webinar/
- https://harness.io/blog/blue-green-canary-deployment-strategies/

Apply all:

```bash
ka -f virtual-services.yaml -f ingress.yaml -f destination-rules.yaml -f deployments-be.yaml -f deployments-fe.yaml -f services.yaml -f database.yaml
```
