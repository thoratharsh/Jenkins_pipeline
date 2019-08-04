# Jenkins_pipeline

# commands to start jenkins
[Tutorial to start pipeline](https://jenkins.io/doc/book/pipeline/)

1. cd C:/Program Files(X86)/ Jenkins

2. java -jar Jenkins.war

3. If gets error that some process is using 8080 port try with 8081 port [link to this tutorial](https://javabypatel.blogspot.com/2017/10/kill-process-on-port-8080-in-windows.html)

	```
	java -jar Jenkins.war httpPort=8081
	```

4. Even gets error kill the peocess running on 8081 by below commands
	```
	netstat -aon | findstr <PortNumber>
	screen will show PID with running process . get PID from commands prompt
	taskkill /F /PID <PID>
	```

5. Start jenkins by below command:
	```
	java -jar Jenkins.war
	```

6. Accecss jenkins in browser with http://localhost: <portNumber>
