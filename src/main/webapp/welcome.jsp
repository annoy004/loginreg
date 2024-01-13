<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Recommendations</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f2f2f2;
            margin: 20px;
        }

        h2 {
            color: #333;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
            margin: 0 auto;
        }

        label {
            display: block;
            margin: 10px 0;
            color: #555;
        }

        select {
            width: 100%;
            padding: 8px;
            margin: 5px 0 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4caf50;
            color: #fff;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <h2>Book Recommendations</h2>

    <form action="RecommendationServlet" method="post">
        <label for="year">Select a year:</label>
        <select name="year" id="year">
            <% 
                int currentYear = java.time.Year.now().getValue();
                for (int i = 1800; i <= currentYear; i++) {
            %>
                <option value="<%= i %>"><%= i %></option>
            <%
                }
            %>
        </select>
        <br>

        <label for="genre">Select a genre:</label>
        <select name="genre" id="genre">
            <option value="fiction">Fiction</option>
            <option value="nonfiction">Non-Fiction</option>
            <option value="novel">novel</option>
            <!-- Add more genres as needed -->
        </select>
        <br>

        <input type="submit" value="Get Recommendations">
    </form>

</body>
</html>