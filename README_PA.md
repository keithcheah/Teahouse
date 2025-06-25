B.  Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.
    1. README_PA.md: file created to document notes and line change locations for the project.

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.
    1. mainscreen.html: lines 14, 21, 53  modified to add shop name, product names and part names.

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
    1. about.html: created file to describe company to user.
    2. AboutController.java: created file to handle user navigation to and from about.html
    3. mainscreen.html: line 12 added to create link to about.html

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.
    1. BootStrapData.java: lines 73-92 added to create initial sample data for tea parts and tea service products
    2. InhousePart.java: lines 20-22 added to create constructor function for ease of creating new instances
    3. OutsourcedPart.java: lines 20-22 added to create constructor function for ease of creating new instances

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
    1. mainscreen.html: lines 86-87 added Buy Now button to Product List.
    2. AddProductController.java: lines 180-193 added buyProduct function to handle the logic for user pressing said button.
    3. failure.html: created file to display to user that the product purchase was unsuccessful.
    4. success.html: created file to display to user that the product purchase was successful.


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
