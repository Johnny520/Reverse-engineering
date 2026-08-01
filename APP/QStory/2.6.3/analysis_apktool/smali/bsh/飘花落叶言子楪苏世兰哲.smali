.class public final Lbsh/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    move-object v0, p1

    .line 19
    :goto_0
    if-eqz v0, :cond_d

    .line 20
    .line 21
    sget-object v1, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {}, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    sget-object v1, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰苏哲:Ljava/util/regex/Pattern;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_c

    .line 44
    .line 45
    :cond_0
    sget-object v1, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/util/regex/Pattern;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_2

    .line 80
    .line 81
    invoke-static {}, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_c

    .line 86
    .line 87
    :cond_2
    if-ne p1, v0, :cond_3

    .line 88
    .line 89
    const/4 v1, 0x0

    .line 90
    goto :goto_1

    .line 91
    :cond_3
    sget-object v1, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 92
    .line 93
    invoke-virtual {v1, v0}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 98
    .line 99
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    array-length v3, v2

    .line 104
    const/4 v4, 0x0

    .line 105
    move v5, v4

    .line 106
    :goto_2
    if-ge v5, v3, :cond_6

    .line 107
    .line 108
    aget-object v6, v2, v5

    .line 109
    .line 110
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-nez v7, :cond_4

    .line 119
    .line 120
    invoke-static {}, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰()Z

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-eqz v7, :cond_5

    .line 125
    .line 126
    :cond_4
    new-instance v7, Lbsh/飘花落叶言子世苏哲楪兰;

    .line 127
    .line 128
    invoke-direct {v7, v6}, Lbsh/飘花落叶言子世苏哲楪兰;-><init>(Ljava/lang/reflect/Field;)V

    .line 129
    .line 130
    .line 131
    iget-object v6, p0, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 132
    .line 133
    iget-object v8, v7, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v6, v8}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    if-nez v9, :cond_5

    .line 140
    .line 141
    invoke-virtual {v6, v8, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    array-length v3, v2

    .line 152
    move v5, v4

    .line 153
    :goto_3
    if-ge v5, v3, :cond_a

    .line 154
    .line 155
    aget-object v6, v2, v5

    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    if-nez v7, :cond_7

    .line 166
    .line 167
    invoke-static {}, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰()Z

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    if-eqz v7, :cond_9

    .line 172
    .line 173
    :cond_7
    if-ne p1, v0, :cond_8

    .line 174
    .line 175
    new-instance v7, Lbsh/飘花落叶言子世哲兰楪苏;

    .line 176
    .line 177
    invoke-direct {v7, v6}, Lbsh/飘花落叶言子世哲兰楪苏;-><init>(Ljava/lang/reflect/Method;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0, v7}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Lbsh/飘花落叶言子世哲苏楪兰;)V

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_8
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    invoke-virtual {v1, v7, v6}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-virtual {p0, v6}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Lbsh/飘花落叶言子世哲苏楪兰;)V

    .line 197
    .line 198
    .line 199
    :cond_9
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    array-length v3, v2

    .line 207
    :goto_5
    if-ge v4, v3, :cond_c

    .line 208
    .line 209
    aget-object v5, v2, v4

    .line 210
    .line 211
    if-ne p1, v0, :cond_b

    .line 212
    .line 213
    new-instance v6, Lbsh/飘花落叶言子世苏楪哲兰;

    .line 214
    .line 215
    invoke-direct {v6, v5}, Lbsh/飘花落叶言子世苏楪哲兰;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, v6}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Lbsh/飘花落叶言子世哲苏楪兰;)V

    .line 219
    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_b
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getName()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-virtual {v1, v6, v5}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-virtual {p0, v5}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Lbsh/飘花落叶言子世哲苏楪兰;)V

    .line 235
    .line 236
    .line 237
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-virtual {p0, v1}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰([Ljava/lang/Class;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :cond_d
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lbsh/飘花落叶言子世哲苏楪兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lbsh/飘花落叶言子世哲苏楪兰;

    .line 28
    .line 29
    invoke-virtual {p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲世苏兰()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_1
    const/4 p0, 0x0

    .line 37
    return-object p0
.end method

.method public final varargs 飘花落叶言子楪世哲兰苏(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/飘花落叶言子世哲苏楪兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const/4 v0, 0x1

    .line 26
    if-ne p1, v0, :cond_2

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lbsh/飘花落叶言子世哲苏楪兰;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_2
    sget-object p1, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 37
    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v0, "find most specific Invocable for: "

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p2, p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲兰苏([Ljava/lang/Class;Ljava/util/List;)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    const/4 p2, -0x1

    .line 68
    if-ne p1, p2, :cond_3

    .line 69
    .line 70
    :goto_0
    const/4 p0, 0x0

    .line 71
    return-object p0

    .line 72
    :cond_3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Lbsh/飘花落叶言子世哲苏楪兰;

    .line 77
    .line 78
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Lbsh/飘花落叶言子世哲苏楪兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lbsh/飘花落叶言子世哲苏楪兰;

    .line 28
    .line 29
    invoke-virtual {p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏兰世哲()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_1
    const/4 p0, 0x0

    .line 37
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/String;Lbsh/飘花落叶言子世哲苏楪兰;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    return v2

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ne v1, v2, :cond_2

    .line 32
    .line 33
    new-instance v1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {p0, p1}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-interface {p0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lbsh/飘花落叶言子世哲苏楪兰;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏兰世哲()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p1, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲世苏兰()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v1, p1}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Lbsh/飘花落叶言子世哲苏楪兰;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    const-string v0, "[gs]et|is"

    .line 23
    .line 24
    const-string v2, ""

    .line 25
    .line 26
    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eq v2, v3, :cond_2

    .line 36
    .line 37
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-static {v2}, Ljava/lang/Character;->isLowerCase(C)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v2, 0x0

    .line 52
    aget-char v3, v0, v2

    .line 53
    .line 54
    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    aput-char v3, v0, v2

    .line 59
    .line 60
    new-instance v2, Ljava/lang/String;

    .line 61
    .line 62
    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([C)V

    .line 63
    .line 64
    .line 65
    move-object v0, v2

    .line 66
    :cond_3
    invoke-virtual {p0, v1, p1}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Lbsh/飘花落叶言子世哲苏楪兰;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    invoke-virtual {p0, v0, p1}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Lbsh/飘花落叶言子世哲苏楪兰;)Z

    .line 73
    .line 74
    .line 75
    :cond_4
    :goto_0
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰([Ljava/lang/Class;)V
    .locals 12

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_6

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    sget-object v4, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {}, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰()Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-nez v4, :cond_0

    .line 15
    .line 16
    sget-object v4, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰苏哲:Ljava/util/regex/Pattern;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-virtual {v4, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-nez v4, :cond_5

    .line 31
    .line 32
    :cond_0
    sget-object v4, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 33
    .line 34
    invoke-virtual {v4, v3}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    array-length v6, v5

    .line 45
    move v7, v1

    .line 46
    :goto_1
    if-ge v7, v6, :cond_2

    .line 47
    .line 48
    aget-object v8, v5, v7

    .line 49
    .line 50
    new-instance v9, Lbsh/飘花落叶言子世苏哲楪兰;

    .line 51
    .line 52
    invoke-direct {v9, v8}, Lbsh/飘花落叶言子世苏哲楪兰;-><init>(Ljava/lang/reflect/Field;)V

    .line 53
    .line 54
    .line 55
    iget-object v8, p0, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 56
    .line 57
    iget-object v10, v9, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v8, v10}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v11

    .line 63
    if-nez v11, :cond_1

    .line 64
    .line 65
    invoke-virtual {v8, v10, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    array-length v6, v5

    .line 76
    move v7, v1

    .line 77
    :goto_2
    if-ge v7, v6, :cond_5

    .line 78
    .line 79
    aget-object v8, v5, v7

    .line 80
    .line 81
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    if-nez v9, :cond_3

    .line 90
    .line 91
    invoke-static {}, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰()Z

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    if-eqz v9, :cond_4

    .line 96
    .line 97
    :cond_3
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-virtual {v4, v9, v8}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    invoke-virtual {p0, v8}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Lbsh/飘花落叶言子世哲苏楪兰;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {p0, v3}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰([Ljava/lang/Class;)V

    .line 120
    .line 121
    .line 122
    add-int/lit8 v2, v2, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_6
    return-void
.end method
