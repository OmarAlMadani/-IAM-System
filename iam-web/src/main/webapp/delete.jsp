<%@page import="fr.tbr.iamcore.datamodel.Identity"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete</title>
<link xmlns="http://www.w3.org/1999/xhtml" rel="stylesheet"
	href="css/bootstrap.min.css" />
</head>

<body>
	<div class="container">
       <h2 class="text-info">you can delete a user by entering the username</h2>  
    </div>
    
    <form class="form-horizontal" role="form" method="POST" action="Delete">
        <div class="col-sm-10">
          <input input style="float:right; margin-right:15px; name="uNamemodif" type="text" class="form-control" id="uNamemodif" placeholder="UserName"/>
           </div> 
              <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button input style="float:right; margin-right:15px; type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>	   
        </div>
    </form>	
 
</body>
</html>