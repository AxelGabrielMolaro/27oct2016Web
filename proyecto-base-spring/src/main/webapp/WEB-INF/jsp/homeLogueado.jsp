	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	    pageEncoding="ISO-8859-1"%>
	    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<link rel="stylesheet" href="css/index.css">
	<title>Home</title>
</head>
<body>
	<jsp:include page="headerLogeado.jsp" />
	
	<div class="container-fluid">
		<div class="row">

			

			<div class="col-md-6 col-offset-3 ">
				<form:form action="buscar" modelAttribute="torneo" method="POST" >

				<div class="form-group">
					<form:label path="nombre"> Nombre del torneo</form:label>
					<form:input class="form-control" placeholder="Buscar" path="nombre"/>
					<div class="form-group">
						<input class="btn btn-warning" type="submit" value="Buscar">
					</div>
				</div>
				</form:form>

			</div>
		</div>
	</div>

			</div> 
		</div>
	</div>


</body>
</html>