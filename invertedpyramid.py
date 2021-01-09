num= int(input("enter number of rows : "))
for i in range (num):
    for j in range (num-i):
        print("*",end=' ')
    print()