<#-- @ftlvariable name="" type="com.paralect.dropwiz.PersonView" -->
<html>
<body style="background-color: gray; color:white;">
<!-- calls getPerson().getName() and sanitizes it -->
<h1>Hello, ${name?html}!</h1>

You position is <b>${position?html}</b>

</body>
</html>