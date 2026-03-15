import pandas as pd
df = pd.read_csv('sales_data.csv')
print(df)
df["date"]= pd.to_datetime(df["date"])
total_sales = df["amount"].sum()

product_sales = df.groupby("product")["amount"].sum()
customer_sales = df.groupby("customer")["amount"].sum()
avg_invoice = df["amount"].mean()

print("Total Sales:", total_sales)
print("Sales by Product:\n", product_sales)
print("Sales by Customer:\n", customer_sales)
print("Average Invoice Amount:", avg_invoice)













//docker login
//docker build -t imagename .
//docker run -it imagename
