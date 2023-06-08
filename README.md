# AnalyzeData

The program reads population data from a CSV file and allows the user to interactively retrieve information about specific countries. 
Here's a brief description of what the program does:

It reads a CSV file containing population data for various countries.
The data from the file is parsed and stored in different ArrayLists.
For each country, a Country object is created with attributes such as the country name, country code, latest population, population from one year earlier, and the difference in population compared to the previous year.
The Country objects are stored in an ArrayList called countryList.
The program prompts the user to enter a country name.
It checks if the entered country name matches any of the country names in the countryList.
If a match is found, the program asks the user if they want to see more details about the country.
If the user chooses to see more details, the program displays information about the selected country, including its name, country code, latest population, population from one year earlier, and the difference in population compared to the previous year.
The program terminates after displaying the information or if no country match is found.
The program also includes some commented-out code that performs additional operations, such as printing the data stored in the ArrayLists and searching for email addresses within the CSV file.
In summary, the program reads population data, allows the user to search for specific countries, and provides detailed information about the population statistics of the selected country.
