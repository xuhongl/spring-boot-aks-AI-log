# spring-boot-aks-AI-log

1. create a spring boot app with AI integrated https://medium.com/analytics-vidhya/using-azure-application-insights-to-provide-business-kpis-in-java-applications-5f8b4dd80b09
2. containerize the app https://docs.oracle.com/en-us/iaas/developer-tutorials/tutorials/spring-on-k8s/01oci-spring-k8s-summary.htm#create-spring-boot
3. spring boot log is configured in logback.xml, using logback appender, sended over to the AI workspace configured
4. enable stdout log https://stackify.com/logging-logback/, log will be outputed to console and captured by container log https://vincentlauzon.com/2019/01/30/custom-logs-on-aks-azure-monitor/
5. enable container insights in your AKS cluster
6. go to "containerlogs" table, your stdout log will be shown there
