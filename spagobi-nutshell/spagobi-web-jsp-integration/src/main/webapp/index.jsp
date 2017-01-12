<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spagobi" tagdir="/WEB-INF/tags/spagobi" %>
<html>
<head>
    <title>SpagoBI Web Jsp Integration</title>
</head>
<body>

<spagobi:execution
        spagobiContext="http://localhost:8080/SpagoBI/"
        userId="biadmin"
        password="biadmin"
        documentId="23"
        iframeStyle="height:700px; width:100%"
        displayToolbar="<%= Boolean.TRUE %>"
        displaySliders="<%= Boolean.TRUE %>" />

<!-- Just change documentId to see different spagoBI view -->
</body>
</html>
