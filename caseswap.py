global lst
lst=[]
st=" "


def caseswap(string):
    for i in string:
        if i.islower():
            x=i.upper()
            lst.append(x)
        elif i.isupper():
            y=i.lower()
            lst.append(y)

a=input("enter the name: ")
caseswap(a)
for i in lst:
    st=st+i
print(st)
