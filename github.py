'pip install selenium'
from selenium import webdriver

# Initialize the Chrome webdriver without specifying an executable path
driver = webdriver.Chrome()

# Open Google in the Chrome browser
driver.get("https://github.com")

# The browser will open to Google's homepage. You can now automate interactions with the webpage as needed.

# To close the browser when you're done:
driver.quit()
