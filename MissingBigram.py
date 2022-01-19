def to_sequence(bigrams):
    result = ''
    for bigram in bigrams:
        result += bigram[0]
    return result + bigrams[-1][-1]

def missing_biagram(bigrams):
    for i in range(len(bigrams) - 1):
        if not bigrams[i][1] == bigrams[i + 1][0]:
            bigrams.insert(i + 1, bigrams[i][1] + bigrams[i + 1][0])
            return
    # error in the end/start
    bigrams.append(bigrams[-1][-1] + "a")

# read input
t = int(input())
for i in range(t):
    n = int(input()) 
    bigrams = input().split(" ")
    missing_biagram(bigrams)
    result = to_sequence(bigrams)
    print(result)




# what we want to find
# abbaaba

# ab bb ba aa ab ba
             
# abbaaba 


