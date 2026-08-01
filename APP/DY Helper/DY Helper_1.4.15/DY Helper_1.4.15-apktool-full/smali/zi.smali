.class public final synthetic Lzi;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzi;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lzi;->ζ:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lzi;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    sget-object v5, Ls62;->α:Ls62;

    .line 8
    .line 9
    iget-object p0, p0, Lzi;->ζ:[Ljava/lang/String;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    array-length v0, p0

    .line 18
    move v1, v3

    .line 19
    :goto_0
    if-ge v1, v0, :cond_1

    .line 20
    .line 21
    aget-object v2, p0, v1

    .line 22
    .line 23
    sget-object v5, Lpr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-static {v5, v2}, Lpr1;->ι(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v3, v4

    .line 40
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_0
    move-object v6, p1

    .line 46
    check-cast v6, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const/4 v10, 0x6

    .line 52
    const/4 v11, 0x0

    .line 53
    const-string v7, "void"

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    invoke-static/range {v6 .. v11}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 58
    .line 59
    .line 60
    array-length p1, p0

    .line 61
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, [Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v6, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 68
    .line 69
    .line 70
    return-object v5

    .line 71
    :pswitch_1
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance v0, Lzi;

    .line 77
    .line 78
    const/4 v1, 0x7

    .line 79
    invoke-direct {v0, p0, v1}, Lzi;-><init>([Ljava/lang/String;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 83
    .line 84
    .line 85
    return-object v5

    .line 86
    :pswitch_2
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance v0, Lzi;

    .line 92
    .line 93
    invoke-direct {v0, p0, v2}, Lzi;-><init>([Ljava/lang/String;I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 97
    .line 98
    .line 99
    return-object v5

    .line 100
    :pswitch_3
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    array-length v0, p0

    .line 106
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, [Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 113
    .line 114
    .line 115
    return-object v5

    .line 116
    :pswitch_4
    move-object v6, p1

    .line 117
    check-cast v6, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 118
    .line 119
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    const/4 v10, 0x6

    .line 123
    const/4 v11, 0x0

    .line 124
    const-string v7, "void"

    .line 125
    .line 126
    const/4 v8, 0x0

    .line 127
    const/4 v9, 0x0

    .line 128
    invoke-static/range {v6 .. v11}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 129
    .line 130
    .line 131
    const-string p1, "int"

    .line 132
    .line 133
    filled-new-array {p1}, [Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {v6, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 138
    .line 139
    .line 140
    array-length p1, p0

    .line 141
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    check-cast p0, [Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v6, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 148
    .line 149
    .line 150
    return-object v5

    .line 151
    :pswitch_5
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    new-instance v0, Lzi;

    .line 157
    .line 158
    invoke-direct {v0, p0, v1}, Lzi;-><init>([Ljava/lang/String;I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 162
    .line 163
    .line 164
    return-object v5

    .line 165
    :pswitch_6
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    const-string v0, "void"

    .line 171
    .line 172
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setReturnType(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    array-length v0, p0

    .line 176
    if-eq v0, v4, :cond_5

    .line 177
    .line 178
    const/4 v6, 0x2

    .line 179
    if-eq v0, v6, :cond_4

    .line 180
    .line 181
    if-eq v0, v1, :cond_3

    .line 182
    .line 183
    if-eq v0, v2, :cond_2

    .line 184
    .line 185
    aget-object v0, p0, v3

    .line 186
    .line 187
    aget-object v3, p0, v4

    .line 188
    .line 189
    aget-object v4, p0, v6

    .line 190
    .line 191
    aget-object v1, p0, v1

    .line 192
    .line 193
    aget-object p0, p0, v2

    .line 194
    .line 195
    filled-new-array {v0, v3, v4, v1, p0}, [Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_2
    aget-object v0, p0, v3

    .line 204
    .line 205
    aget-object v2, p0, v4

    .line 206
    .line 207
    aget-object v3, p0, v6

    .line 208
    .line 209
    aget-object p0, p0, v1

    .line 210
    .line 211
    filled-new-array {v0, v2, v3, p0}, [Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_3
    aget-object v0, p0, v3

    .line 220
    .line 221
    aget-object v1, p0, v4

    .line 222
    .line 223
    aget-object p0, p0, v6

    .line 224
    .line 225
    filled-new-array {v0, v1, p0}, [Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 230
    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_4
    aget-object v0, p0, v3

    .line 234
    .line 235
    aget-object p0, p0, v4

    .line 236
    .line 237
    filled-new-array {v0, p0}, [Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 242
    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_5
    aget-object p0, p0, v3

    .line 246
    .line 247
    filled-new-array {p0}, [Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 252
    .line 253
    .line 254
    :goto_2
    return-object v5

    .line 255
    :pswitch_7
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 256
    .line 257
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    new-instance v0, Lzi;

    .line 261
    .line 262
    invoke-direct {v0, p0, v4}, Lzi;-><init>([Ljava/lang/String;I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 266
    .line 267
    .line 268
    return-object v5

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
