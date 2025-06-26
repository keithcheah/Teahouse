B.  Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.
1. README_PA.md: file created to document notes and line change locations for the project.

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
1. mainscreen.html: lines 14, 21, 53  modified to add shop name, product names and part names.

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
1. about.html: created file to describe company to user.
2. AboutController.java: created file to handle user navigation to and from about.html
3. mainscreen.html: line 12 added to create link to about.html

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
1. BootStrapData.java: lines 73-92 added to create initial sample data for tea parts and tea service products
2. InhousePart.java: lines 20-22 added to create constructor function for ease of creating new instances
3. OutsourcedPart.java: lines 20-22 added to create constructor function for ease of creating new instances

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
1. mainscreen.html: lines 86-87 added Buy Now button to Product List.
2. AddProductController.java: lines 180-193 added buyProduct function to handle the logic for user pressing said button.
3. failure.html: created file to display to user that the product purchase was unsuccessful.
4. success.html: created file to display to user that the product purchase was successful.

G.  Modify the parts to track maximum and minimum inventory by doing the following:
1. Part.java: lines 31-34, 80-102 added to create max and min inventory variables, getters, and setters.
2. mainscreen.html: lines 39-40, 49-50 added to add max and min inventory columns to harvests table.
3. Part.java: lines 56-64 added to create new constructor to handle max and min fields in addition to others.
4. InhousePart.java: lines 23-26 added to create new constructor to handle max and min fields in addition to others.
5. OutsourcedPart.java: lines 23-26 added to create new constructor to handle max and min fields in addition to others.
6. applications.properties: lines 6 modified to update database name.
7. OutsourcedPartForm.html: lines 27-32 added to add min and max inventory HTML elements to the form.
8. InhousePartForm.html: lines 27-32 added to add min and max inventory HTML elements to the form. 
9. ValidInventory.java: created to create function to check for valid inventory. 
10. InventoryValidator.java: created to create validator to use ValidInventory function.
11. OutsourcedPartForm.html: lines 33-38 added to display errors to user.
12. InhousePartForm.html: lines 33-38 added to display errors to user.


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
Note: error handling for updating parts if inventory is less than minimum or greater than maximum were handled in previous section.
1. AddProductController.java: lines 56-94 modified submit form function 
2. EnufPartsValidator.java: line 36 updated if condition to make sure each part used for the product does not fall below its minimum threshold if the desired amount of product were to be created.

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

J.  Remove the class files for any unused validators in order to clean your code.

K.  Demonstrate professional communication in the content and presentation of your submission.
