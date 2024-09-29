SELECT PRODUCT_CODE, SUM(SALES_AMOUNT* PRICE) AS 'SALES'
FROM PRODUCT A JOIN OFFLINE_SALE B ON A.PRODUCT_ID = B.PRODUCT_ID
GROUP BY PRODUCT_CODE 
ORDER BY SALES DESC, PRODUCT_CODE ASC;