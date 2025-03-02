# Vending Machine Project

### Aim of The Project


The Vending Machine Project is a Java-based application that simulates a vending machine, showcasing the principles of Object-Oriented Programming (OOP). This program allows users to interact with a virtual vending machine, where they can view a well-stuctured menu of items, add funds, and select products for purchase. Additionally, an admin interface is provided for managing the inventory in real-time.

### Project Description


This terminal-based vending machine program loads its inventory from a text file, serving as a simple database. When the program starts, it retrieves the available stock and any remaining balance from previous transactions. The data is updated dynamically, ensuring that any changes made by users or admins are saved immediately. The program is designed to handle exceptions, preventing crashes due to invalid selections or empty slots. At the end of a transaction, users have the option to save a receipt to their documents as a text file if they made a purchase.

****

## Core Features

- Item Display: View available items along with their prices and quantities in a user-friendly format.
- Fund Management: Users can add funds to the vending machine before making a purchase.
- Product Selection: Users can select items using unique codes assigned to each product.
- Admin Controls: Admins can manage the vending machine's inventory, including adding, removing and restock pre-existing items.
- Real-Time Updates: Any modifications made by users or admins are immediately reflected in the inventory.
- Receipt Generation: After a purchase, users can choose to save a detailed receipt to their documents.

****

## Classes Overview

### Item Class

The Item class is responsible for creating product objects within the vending machine. It allows for the following attributes:

- Type: The category of the product.
- Name: The name of the product.
- Price: The cost of the product.
- Quantity: The available stock of the product.

#### Subclasses of Item:

- Bag: Represents snack bags.
- Can: may represent canned beverages or food if any.
- Bottle: Represents bottled drinks.
- Sweet: Represents candies and sweets.

### Order Class

The Order class manages the user's purchase list and includes the following methods:

- addProduct: Adds a product to the user's order list.
- checkDuplicate: Checks for duplicate items in the order list. If a duplicate is found, the quantity is incremented by 1.
- listOrders: Generates a receipt by writing the order details to a text file in the user's documents.

****

### Suggestions

Your contributions and suggestions are always welcome to enhance this project.

## Acknowledgments

This project was developed by three future computer engineers:

- Jean El Beainy
- Jad Fahed
- Anthony Farhat
