number = int(input())

for i in range(0,number):
    word = input()
    for j in range (0, len(word)):
        if j % 2 == 0:
            print(word[j], end="")
    print(" ", end="")
    
    for j in range (0, len(word)):
        if j % 2 != 0:
            print(word[j], end="")
    print("")
      
        