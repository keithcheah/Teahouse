B.  Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.
    1. mainscreen.html: line 14  modified
        To: "<title>Casual Tea Shop</title>"
        From: "<title>My Bicycle Shop</title>"
        
    2. mainscreen.html: line 21 modified
        To: "<h2>Original Sources</h2>"
        From: "<h2>Parts</h2>"
    
    3. mainscreen.html: line 53 modified
        To: "<h2>Preset Tastings</h2>"
        From: "<h2>Products</h2>"

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
    1. about.html in resources/templates folder. Created file and added lines 1-24:
        To: "<!DOCTYPE html>
        <html lang="en" xmlns:th="http://www.thymeleaf.org">
        <head>
            <meta charset="UTF-8">

            <!-- Required meta tags -->
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
        
            <!-- Bootstrap CSS -->
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
                  integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        
            <title>Our Story</title>
        </head>
        <body>
            <h1>Casual Tea Shop's History</h1>
            <a href="mainscreen" class="btn btn-primary btn-sm mb3">Return to Homepage</a>
        
            <p>Casual Tea Shop is not concerned with how long it has been open, just that it has had the honor of satisfying several
            consumers in the past and that it is thankful to still be open today to serve you, if you so desire. We serve tea here and offer preset tastings.</p>
        
        </body>
        </html>"
        From: ""
    2. AboutController.java in controllers folder. Created file and added lines 1-12:
        To: "package com.example.demo.controllers;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        
        @Controller
        public class AboutController {
            @GetMapping("/about")
            public String about() {
            return "about";
            }
        }"
        From: ""
    3. mainscreen.html: Added new line 12 by inserting between old line 11 and old line 12:
        To:"<a href="/about">About Page</a>"
        From: ""

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
• The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

J.  Remove the class files for any unused validators in order to clean your code.

K.  Demonstrate professional communication in the content and presentation of your submission.
