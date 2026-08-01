.class public final Lbsh/飘花落叶言子楪苏兰哲世;
.super Lbsh/飘花落叶言子楪哲世苏兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

.field public final 飘花落叶言子楪苏世兰哲:Z

.field public final 飘花落叶言子楪苏世哲兰:Ljava/lang/String;

.field public final 飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

.field public final 飘花落叶言子楪苏哲兰世:[Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Lbsh/飘花落叶言子世兰苏楪哲;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/飘花落叶言子楪哲世苏兰;-><init>(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lbsh/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p3, p0, Lbsh/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世哲兰:Ljava/lang/String;

    .line 7
    .line 8
    instance-of p1, p2, Lbsh/飘花落叶言子楪兰哲世苏;

    .line 9
    .line 10
    iput-boolean p1, p0, Lbsh/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    check-cast p2, Lbsh/飘花落叶言子楪兰哲世苏;

    .line 15
    .line 16
    iget-object p1, p2, Lbsh/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    iput-object p1, p0, Lbsh/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-class p2, Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    filled-new-array {p1, p2}, [[Ljava/lang/reflect/Method;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏世兰([[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, [Ljava/lang/reflect/Method;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :goto_1
    iput-object p1, p0, Lbsh/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲兰世:[Ljava/lang/reflect/Method;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Method;I)Z
    .locals 8

    .line 1
    iget-boolean v0, p0, Lbsh/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:Z

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世哲兰:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lbsh/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    array-length v0, p0

    .line 15
    move v2, v3

    .line 16
    :goto_0
    if-ge v2, v0, :cond_b

    .line 17
    .line 18
    aget-object v4, p0, v2

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    sget-object v5, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-static {v5, v6, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰哲苏世([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-nez v5, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-static {v4, v5, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-nez v4, :cond_a

    .line 72
    .line 73
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    const-string v0, "new"

    .line 77
    .line 78
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    array-length v0, p0

    .line 89
    move v1, v3

    .line 90
    :goto_2
    if-ge v1, v0, :cond_b

    .line 91
    .line 92
    aget-object v4, p0, v1

    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-static {v4, v5, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰哲苏世([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-nez v4, :cond_4

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-static {v2, v4, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-nez v4, :cond_a

    .line 118
    .line 119
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    iget-object p0, p0, Lbsh/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲兰世:[Ljava/lang/reflect/Method;

    .line 123
    .line 124
    array-length v0, p0

    .line 125
    move v4, v3

    .line 126
    :goto_4
    if-ge v4, v0, :cond_b

    .line 127
    .line 128
    aget-object v5, p0, v4

    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    if-nez v6, :cond_6

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_6
    sget-object v6, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 142
    .line 143
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_8

    .line 152
    .line 153
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    invoke-static {v6, v7, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰哲苏世([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-nez v6, :cond_7

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_7
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    invoke-static {v5, v6, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-nez v5, :cond_a

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_8
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    filled-new-array {v6, v7}, [[Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-static {v6}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏世兰([[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    check-cast v6, [Ljava/lang/Class;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    invoke-static {v6, v7, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰哲苏世([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-nez v6, :cond_9

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_9
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-static {v5, v6, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-nez v5, :cond_a

    .line 225
    .line 226
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_a
    const/4 p0, 0x1

    .line 230
    return p0

    .line 231
    :cond_b
    return v3
.end method

.method public final 飘花落叶言子楪世苏哲兰([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v5, p0, Lbsh/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世哲兰:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    :try_start_0
    new-instance v1, Lbsh/NameSpace;

    .line 7
    .line 8
    const-string v2, "MethodReferenceLambda"

    .line 9
    .line 10
    invoke-direct {v1, v2}, Lbsh/NameSpace;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v4, Lbsh/CallStack;

    .line 14
    .line 15
    invoke-direct {v4, v1}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lbsh/Interpreter;

    .line 19
    .line 20
    invoke-direct {v3, v1}, Lbsh/Interpreter;-><init>(Lbsh/NameSpace;)V

    .line 21
    .line 22
    .line 23
    iget-boolean v2, p0, Lbsh/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:Z

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lbsh/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v1, p0, Lbsh/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世哲兰:Ljava/lang/String;

    .line 30
    .line 31
    move-object v2, p1

    .line 32
    invoke-static/range {v0 .. v5}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰哲苏世(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :catch_0
    move-exception v0

    .line 38
    move-object p0, v0

    .line 39
    goto/16 :goto_3

    .line 40
    .line 41
    :cond_0
    move-object v2, p1

    .line 42
    const-string p1, "new"

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    iget-object v3, p0, Lbsh/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 49
    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    :try_start_1
    invoke-static {v3, v6, v2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_1
    array-length p1, v2

    .line 58
    if-eqz p1, :cond_7

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    aget-object v4, v2, p1

    .line 62
    .line 63
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_2

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    invoke-static {v2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    array-length v3, v1

    .line 75
    const/4 v4, 0x1

    .line 76
    invoke-static {v1, v4, v3}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, [Ljava/lang/Class;

    .line 81
    .line 82
    iget-object p0, p0, Lbsh/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲兰世:[Ljava/lang/reflect/Method;

    .line 83
    .line 84
    array-length v7, p0

    .line 85
    move v8, p1

    .line 86
    :goto_0
    if-ge v8, v7, :cond_6

    .line 87
    .line 88
    aget-object v9, p0, v8

    .line 89
    .line 90
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v10
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    .line 98
    if-nez v10, :cond_3

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    :try_start_2
    sget-object v10, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 102
    .line 103
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-eqz v10, :cond_4

    .line 112
    .line 113
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    invoke-static {v1, v10, v4}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰哲苏世([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-eqz v10, :cond_5

    .line 122
    .line 123
    invoke-virtual {v9, v6, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :cond_4
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    invoke-static {v3, v10, v4}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰哲苏世([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    if-eqz v10, :cond_5

    .line 137
    .line 138
    aget-object v10, v2, p1

    .line 139
    .line 140
    array-length v11, v2

    .line 141
    invoke-static {v2, v4, v11}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    invoke-virtual {v9, v10, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_0

    .line 149
    return-object p0

    .line 150
    :catch_1
    :cond_5
    :goto_1
    add-int/lit8 v8, v8, 0x1

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_6
    :try_start_3
    new-instance p0, Lbsh/UtilEvalError;

    .line 154
    .line 155
    const-string p1, "Can\'t invoke lambda made from method reference!"

    .line 156
    .line 157
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw p0

    .line 161
    :cond_7
    :goto_2
    invoke-virtual {v1}, Lbsh/NameSpace;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-static {p0, v3, v0, v2, v5}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏哲兰(Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0
    :try_end_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_0

    .line 169
    return-object p0

    .line 170
    :goto_3
    new-instance p1, Lbsh/TargetError;

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-direct {p1, p0, v5, v6}, Lbsh/TargetError;-><init>(Ljava/lang/Throwable;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 177
    .line 178
    .line 179
    throw p1
.end method
