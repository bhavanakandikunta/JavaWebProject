<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
 <link rel="icon" href="Images/favicon_oes.jpeg" type="image/x-icon">
<link href="Login/AdminLogin.css" rel="stylesheet" type="text/css"> 
    <style>
        @charset "ISO-8859-1";
        img {
   padding-left:225px;
    margin-right: 10px; 
}
body { 
            padding: 0; 
            margin: 0; 
            overflow-y: hidden;
        } 
        div.flex-container {
            display:flex;
            flex-direction:row;
        }

        div.column1 {
            width: 60%;
           height: 100vh;
           padding-top:200px;
    background-image: url('Images/online.png');
    background-repeat: no-repeat;
     background-size:100% 80%;
   
    }

        div.column2 {
        overflow:hidden;
            width:40%;
             height:100vh;
        }

        h1.adminStyle {
            text-align: center;
            color: rgb(132, 216, 156); ;
            padding:40px;
            /*border:2px solid skyblue;*/
        }
   form {
   margin:20px;
   padding:20px;
    
}
input[type="text"],
input[type="password"] {
    border: 3px groove turquoise;
    border-radius: 5px;
    padding: 5px;
    font-size: 14px;
    outline: none;
    color: turquoise;
    margin-bottom: 10px;
    width: 50%;
    box-sizing: border-box;
}

input[type="text"]:focus,
input[type="password"]:focus {
    outline: none;
    border: 3px groove turquoise;
}

input[type="text"]:hover,
input[type="password"]:hover {
    border: 3px ridge turquoise;
    border-radius: 5px;
    padding: 5px;
    font-size: 14px;
    outline: none;
    color: turquoise;
    margin-bottom: 10px;
    width: 50%;
    box-sizing: border-box;
}
input[type="submit"]:hover,
        input[type="button"]:hover {
           background-color: turquoise;
           border:3px ridge balck;
            color: white;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;	
            width: 25%;
            box-sizing: border-box;
        }


        input[type="submit"],
        input[type="button"] {
           background-color: turquoise;
            color: white;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;	
            width: 25%;
            box-sizing: border-box;
        }
/*input[type="submit"]:hover,
input[type="button"]:hover {
    background-color: turquoise;
    color: white;
    padding: 10px 20px;
    font-size: 16px;
    cursor: pointer;
    width: 25%;
    box-sizing: border-box;
}*/

input[type="submit"]:hover,
input[type="button"]:hover {
    background-color: #48D1CC; 
    color: white;
    padding: 10px 20px;
    font-size: 16px;
    cursor: pointer;
    width: 25%;
    box-sizing: border-box;
}

        .message1 {
            color: red;
        }

        .message2 {
            color: green;
        }
        .name{
        color: turquoise;
        font-size:20px;
       font-family: Calibri, Arial, sans-serif;
        }
    </style>
</head>
<body>
    <div class="flex-container">
        <div class="column1"></div>
        <div class="column2">
        <!-- -- 
        <h1 class="adminStyle">Admin Login</h1>-->
                    <img src="Images/admin.png" alt="Admin Image" width="150" height="150">

                       <!--  <input type="checkbox" id="modeToggle">
  <label for="modeToggle" class="toggle-label"></label>
            -->
            <div class="message2">
                <% if(request.getParameter("msg2") != null) out.print(request.getParameter("msg2")); %>
            </div>
            
            <div class="message1">
                <% if(request.getParameter("msg1") != null) out.print(request.getParameter("msg1")); %>
            </div>
            
            <form action="exam.controller.AdminValidation" method="post">
                <pre>
                    <label for="username" class="name" >USERNAME</label>
                    <input type="text" name="username">
                    <label for="username" class="name" >PASSWORD</label>
                    <input type="password" name="password">    
                    <input type="submit" value="Login">     <input onclick="location.href='index.html'" type="button" value="Exit">   
                </pre>
            </form>
        </div>
    </div>
</body>
</html>