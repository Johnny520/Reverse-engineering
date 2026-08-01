.class public final synthetic Lwa;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lci0;Ljava/lang/ClassLoader;Lbi0;)V
    .locals 0

    .line 16
    const/16 p1, 0x13

    iput p1, p0, Lwa;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lwa;->η:Ljava/lang/Object;

    iput-object p3, p0, Lwa;->ζ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Le80;Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    iput v0, p0, Lwa;->ε:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    check-cast p1, Lp80;

    .line 9
    .line 10
    iput-object p1, p0, Lwa;->η:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, p0, Lwa;->ζ:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 17
    iput p2, p0, Lwa;->ε:I

    iput-object p1, p0, Lwa;->η:Ljava/lang/Object;

    iput-object p3, p0, Lwa;->ζ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lwa;Ljx;)V
    .locals 1

    .line 15
    const/16 v0, 0x9

    iput v0, p0, Lwa;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwa;->η:Ljava/lang/Object;

    iput-object p2, p0, Lwa;->ζ:Ljava/lang/Object;

    return-void
.end method

.method private final β(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lwa;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Class;

    .line 4
    .line 5
    iget-object p0, p0, Lwa;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/Class;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/reflect/Method;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lx;->ι(Ljava/lang/Class;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x2

    .line 40
    const/4 v5, 0x1

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    move-object v8, v3

    .line 50
    check-cast v8, Ljava/lang/reflect/Method;

    .line 51
    .line 52
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    array-length v9, v8

    .line 57
    const/4 v10, 0x4

    .line 58
    if-ne v9, v10, :cond_0

    .line 59
    .line 60
    aget-object v9, v8, v6

    .line 61
    .line 62
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 63
    .line 64
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    if-eqz v9, :cond_0

    .line 69
    .line 70
    aget-object v9, v8, v5

    .line 71
    .line 72
    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    invoke-static {v9, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-eqz v9, :cond_0

    .line 79
    .line 80
    aget-object v9, v8, v4

    .line 81
    .line 82
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-eqz v9, :cond_0

    .line 87
    .line 88
    const/4 v9, 0x3

    .line 89
    aget-object v8, v8, v9

    .line 90
    .line 91
    invoke-virtual {v0, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_0

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    move-object v3, v7

    .line 99
    :goto_0
    check-cast v3, Ljava/lang/reflect/Method;

    .line 100
    .line 101
    if-nez v3, :cond_2

    .line 102
    .line 103
    :goto_1
    move-object p0, v7

    .line 104
    goto/16 :goto_d

    .line 105
    .line 106
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eqz v8, :cond_4

    .line 120
    .line 121
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    move-object v9, v8

    .line 126
    check-cast v9, Ljava/lang/reflect/Method;

    .line 127
    .line 128
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    if-nez v9, :cond_3

    .line 141
    .line 142
    array-length v9, v10

    .line 143
    if-ne v9, v4, :cond_3

    .line 144
    .line 145
    const-class v9, Ljava/util/List;

    .line 146
    .line 147
    aget-object v11, v10, v6

    .line 148
    .line 149
    invoke-virtual {v9, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    if-eqz v9, :cond_3

    .line 154
    .line 155
    aget-object v9, v10, v5

    .line 156
    .line 157
    invoke-virtual {v0, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    if-eqz v9, :cond_3

    .line 162
    .line 163
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-eqz v4, :cond_c

    .line 176
    .line 177
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    move-object v8, v4

    .line 182
    check-cast v8, Ljava/lang/reflect/Method;

    .line 183
    .line 184
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    aget-object v8, v8, v6

    .line 189
    .line 190
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    instance-of v9, v8, Ljava/lang/reflect/ParameterizedType;

    .line 194
    .line 195
    if-eqz v9, :cond_6

    .line 196
    .line 197
    check-cast v8, Ljava/lang/reflect/ParameterizedType;

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_6
    move-object v8, v7

    .line 201
    :goto_3
    if-eqz v8, :cond_b

    .line 202
    .line 203
    invoke-interface {v8}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    if-eqz v8, :cond_b

    .line 208
    .line 209
    array-length v9, v8

    .line 210
    if-ne v9, v5, :cond_7

    .line 211
    .line 212
    aget-object v8, v8, v6

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_7
    move-object v8, v7

    .line 216
    :goto_4
    if-nez v8, :cond_8

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_8
    instance-of v9, v8, Ljava/lang/Class;

    .line 220
    .line 221
    if-eqz v9, :cond_9

    .line 222
    .line 223
    check-cast v8, Ljava/lang/Class;

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_9
    instance-of v9, v8, Ljava/lang/reflect/WildcardType;

    .line 227
    .line 228
    if-eqz v9, :cond_b

    .line 229
    .line 230
    check-cast v8, Ljava/lang/reflect/WildcardType;

    .line 231
    .line 232
    invoke-interface {v8}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    array-length v9, v8

    .line 240
    if-ne v9, v5, :cond_a

    .line 241
    .line 242
    aget-object v8, v8, v6

    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_a
    move-object v8, v7

    .line 246
    :goto_5
    instance-of v9, v8, Ljava/lang/Class;

    .line 247
    .line 248
    if-eqz v9, :cond_b

    .line 249
    .line 250
    check-cast v8, Ljava/lang/Class;

    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_b
    :goto_6
    move-object v8, v7

    .line 254
    :goto_7
    invoke-static {v8, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v8

    .line 258
    if-eqz v8, :cond_5

    .line 259
    .line 260
    goto :goto_8

    .line 261
    :cond_c
    move-object v4, v7

    .line 262
    :goto_8
    check-cast v4, Ljava/lang/reflect/Method;

    .line 263
    .line 264
    if-eqz v4, :cond_d

    .line 265
    .line 266
    goto :goto_c

    .line 267
    :cond_d
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    move-object v1, v7

    .line 272
    :cond_e
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    if-eqz v4, :cond_10

    .line 277
    .line 278
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    move-object v8, v4

    .line 283
    check-cast v8, Ljava/lang/reflect/Method;

    .line 284
    .line 285
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    move-result-object v8

    .line 289
    aget-object v8, v8, v5

    .line 290
    .line 291
    invoke-static {v8, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v8

    .line 295
    if-eqz v8, :cond_e

    .line 296
    .line 297
    if-eqz v6, :cond_f

    .line 298
    .line 299
    :goto_a
    move-object v1, v7

    .line 300
    goto :goto_b

    .line 301
    :cond_f
    move-object v1, v4

    .line 302
    move v6, v5

    .line 303
    goto :goto_9

    .line 304
    :cond_10
    if-nez v6, :cond_11

    .line 305
    .line 306
    goto :goto_a

    .line 307
    :cond_11
    :goto_b
    move-object v4, v1

    .line 308
    check-cast v4, Ljava/lang/reflect/Method;

    .line 309
    .line 310
    if-eqz v4, :cond_12

    .line 311
    .line 312
    goto :goto_c

    .line 313
    :cond_12
    invoke-static {v2}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    move-object v4, p0

    .line 318
    check-cast v4, Ljava/lang/reflect/Method;

    .line 319
    .line 320
    :goto_c
    if-nez v4, :cond_13

    .line 321
    .line 322
    goto/16 :goto_1

    .line 323
    .line 324
    :cond_13
    new-instance p0, Lob0;

    .line 325
    .line 326
    invoke-direct {p0, v3, v4}, Lob0;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 327
    .line 328
    .line 329
    :goto_d
    if-eqz p0, :cond_14

    .line 330
    .line 331
    new-instance v0, Ll91;

    .line 332
    .line 333
    invoke-direct {v0, p1, p0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    return-object v0

    .line 337
    :cond_14
    return-object v7
.end method

.method private final γ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lwa;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/ClassLoader;

    .line 4
    .line 5
    iget-object p0, p0, Lwa;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lbi0;

    .line 8
    .line 9
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v2, :cond_3

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    if-eq v2, v4, :cond_2

    .line 28
    .line 29
    const/4 v4, 0x2

    .line 30
    if-eq v2, v4, :cond_1

    .line 31
    .line 32
    const/4 v4, 0x3

    .line 33
    if-ne v2, v4, :cond_0

    .line 34
    .line 35
    new-instance v2, Lxh0;

    .line 36
    .line 37
    const/4 v4, 0x3

    .line 38
    invoke-direct {v2, p1, v0, v4}, Lxh0;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;I)V

    .line 39
    .line 40
    .line 41
    const-string v4, "AccountProxyService no-arg methods"

    .line 42
    .line 43
    invoke-static {p0, v1, v4, v2}, Lci0;->ζ(Lbi0;Ljava/util/LinkedHashSet;Ljava/lang/String;Lp70;)V

    .line 44
    .line 45
    .line 46
    sget-object v2, Lci0;->γ:[Ljava/lang/String;

    .line 47
    .line 48
    array-length v4, v2

    .line 49
    :goto_0
    if-ge v3, v4, :cond_4

    .line 50
    .line 51
    aget-object v5, v2, v3

    .line 52
    .line 53
    const-string v6, "fallback uid class "

    .line 54
    .line 55
    invoke-static {v6, v5}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    new-instance v7, Lxi;

    .line 60
    .line 61
    const/4 v8, 0x2

    .line 62
    invoke-direct {v7, p1, v5, v0, v8}, Lxi;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Ljava/lang/ClassLoader;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v1, v6, v7}, Lci0;->ζ(Lbi0;Ljava/util/LinkedHashSet;Ljava/lang/String;Lp70;)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 72
    .line 73
    .line 74
    :goto_1
    const/4 p0, 0x0

    .line 75
    return-object p0

    .line 76
    :cond_1
    new-instance v2, Lxh0;

    .line 77
    .line 78
    const/4 v3, 0x2

    .line 79
    invoke-direct {v2, p1, v0, v3}, Lxh0;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;I)V

    .line 80
    .line 81
    .line 82
    const-string p1, "IConversationListModel return void"

    .line 83
    .line 84
    invoke-static {p0, v1, p1, v2}, Lci0;->ζ(Lbi0;Ljava/util/LinkedHashSet;Ljava/lang/String;Lp70;)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_2
    new-instance v2, Lxh0;

    .line 89
    .line 90
    const/4 v3, 0x1

    .line 91
    invoke-direct {v2, p1, v0, v3}, Lxh0;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;I)V

    .line 92
    .line 93
    .line 94
    const-string p1, "IConversationListModel return List"

    .line 95
    .line 96
    invoke-static {p0, v1, p1, v2}, Lci0;->ζ(Lbi0;Ljava/util/LinkedHashSet;Ljava/lang/String;Lp70;)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_3
    new-instance v2, Lxh0;

    .line 101
    .line 102
    const/4 v4, 0x0

    .line 103
    invoke-direct {v2, p1, v0, v4}, Lxh0;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;I)V

    .line 104
    .line 105
    .line 106
    const-string v4, "return IConversationListModel"

    .line 107
    .line 108
    invoke-static {p0, v1, v4, v2}, Lci0;->ζ(Lbi0;Ljava/util/LinkedHashSet;Ljava/lang/String;Lp70;)V

    .line 109
    .line 110
    .line 111
    sget-object v2, Lci0;->β:[Ljava/lang/String;

    .line 112
    .line 113
    array-length v4, v2

    .line 114
    :goto_2
    if-ge v3, v4, :cond_4

    .line 115
    .line 116
    aget-object v5, v2, v3

    .line 117
    .line 118
    const-string v6, "known provider class "

    .line 119
    .line 120
    invoke-static {v6, v5}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    new-instance v7, Lxi;

    .line 125
    .line 126
    const/4 v8, 0x1

    .line 127
    invoke-direct {v7, p1, v5, v0, v8}, Lxi;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Ljava/lang/ClassLoader;I)V

    .line 128
    .line 129
    .line 130
    invoke-static {p0, v1, v6, v7}, Lci0;->ζ(Lbi0;Ljava/util/LinkedHashSet;Ljava/lang/String;Lp70;)V

    .line 131
    .line 132
    .line 133
    add-int/lit8 v3, v3, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    :goto_3
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-static {p0, p1}, Lci0;->μ(Lbi0;Ljava/util/List;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-nez v1, :cond_5

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_5
    invoke-static {v0, p0}, Lci0;->ξ(Ljava/lang/ClassLoader;Lbi0;)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    :goto_4
    invoke-static {p0, p1}, Lci0;->μ(Lbi0;Ljava/util/List;)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_6

    .line 164
    .line 165
    return-object p1

    .line 166
    :cond_6
    iget-object p0, p0, Lbi0;->ζ:Ljava/lang/String;

    .line 167
    .line 168
    const-string p1, " \u672a\u5b9a\u4f4d\u5230\u6709\u6548\u7ed3\u679c"

    .line 169
    .line 170
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    goto :goto_1
.end method

.method private final δ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lwa;->η:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p0, Lwa;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Le80;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/reflect/Field;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, p1, v0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v0, v2

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    new-instance v0, Leo1;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    instance-of p0, v0, Leo1;

    .line 50
    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object v2, v0

    .line 55
    :goto_1
    return-object v2
.end method

.method private final ζ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lwa;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc91;

    .line 4
    .line 5
    iget-object p0, p0, Lwa;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lch1;

    .line 8
    .line 9
    check-cast p1, Lbh1;

    .line 10
    .line 11
    iget-boolean v1, v0, Lc91;->ψ:Z

    .line 12
    .line 13
    iget v2, v0, Lc91;->τ:F

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {p1, v2}, Lyr;->Ξ(F)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget v0, v0, Lc91;->υ:F

    .line 22
    .line 23
    invoke-interface {p1, v0}, Lyr;->Ξ(F)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {p1, p0, v1, v0}, Lbh1;->ξ(Lbh1;Lch1;II)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {p1, v2}, Lyr;->Ξ(F)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget v0, v0, Lc91;->υ:F

    .line 36
    .line 37
    invoke-interface {p1, v0}, Lyr;->Ξ(F)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {p1, p0, v1, v0}, Lbh1;->λ(Lbh1;Lch1;II)V

    .line 42
    .line 43
    .line 44
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 45
    .line 46
    return-object p0
.end method

.method private final η(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, Lky1;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-wide v1, p1, Lky1;->β:J

    .line 7
    .line 8
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v3, p0, Lwa;->η:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lsd;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    new-instance v0, Lsd;

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lsd;-><init>(J)V

    .line 25
    .line 26
    .line 27
    :cond_0
    move-object v7, v0

    .line 28
    iget-object v3, p1, Lky1;->α:Ljava/lang/String;

    .line 29
    .line 30
    iget-wide v4, p1, Lky1;->γ:J

    .line 31
    .line 32
    sget-object v0, Lry1;->α:Lry1;

    .line 33
    .line 34
    invoke-static {p1}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    const-string v0, "\u4f1a\u8bdd "

    .line 45
    .line 46
    invoke-static {v1, v2, v0}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_1
    move-object v6, v0

    .line 51
    invoke-static {p1, v7}, Lry1;->Ρ(Lky1;Lsd;)Lsd;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object p0, p0, Lwa;->ζ:Ljava/lang/Object;

    .line 60
    .line 61
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    move-object v9, p0

    .line 66
    check-cast v9, Lid;

    .line 67
    .line 68
    new-instance v0, Lec1;

    .line 69
    .line 70
    invoke-direct/range {v0 .. v9}, Lec1;-><init>(JLjava/lang/String;JLjava/lang/String;Lsd;Lsd;Lid;)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method private final θ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lwa;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map;

    .line 4
    .line 5
    iget-object p0, p0, Lwa;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    check-cast p1, Lbe1;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    xor-int/lit8 p0, p0, 0x1

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method private final ι(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lwa;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;

    .line 4
    .line 5
    iget-object p0, p0, Lwa;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    check-cast p1, Lce1;

    .line 10
    .line 11
    sget v1, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->μ:I

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->κ:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v1}, Lyh;->Κ(Ljava/util/Collection;)Lxm0;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    new-instance v7, Lm3;

    .line 23
    .line 24
    const/4 v1, 0x7

    .line 25
    invoke-direct {v7, v0, p1, p0, v1}, Lm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    const/16 v8, 0x1e

    .line 29
    .line 30
    const-string v3, "\uff0c"

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    invoke-static/range {v2 .. v8}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object p1, p1, Lce1;->α:Ljava/lang/String;

    .line 40
    .line 41
    const-string v0, "\uff1a"

    .line 42
    .line 43
    invoke-static {p1, v0, p0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method private final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, Lwa;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/app/Activity;

    .line 4
    .line 5
    iget-object p0, p0, Lwa;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lxg1;

    .line 8
    .line 9
    move-object v2, p1

    .line 10
    check-cast v2, Landroid/net/Uri;

    .line 11
    .line 12
    if-eqz v2, :cond_4

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v3, "_display_name"

    .line 20
    .line 21
    filled-new-array {v3}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 29
    .line 30
    .line 31
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v4, 0x1

    .line 39
    if-ne v3, v4, :cond_0

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object v3, p1

    .line 48
    :goto_0
    if-eqz v1, :cond_2

    .line 49
    .line 50
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-object v1, p1

    .line 55
    :catchall_1
    if-eqz v1, :cond_1

    .line 56
    .line 57
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 58
    .line 59
    .line 60
    :cond_1
    move-object v3, p1

    .line 61
    :cond_2
    :goto_1
    if-nez v3, :cond_3

    .line 62
    .line 63
    const-string v3, "\u6240\u9009\u56fe\u7247"

    .line 64
    .line 65
    :cond_3
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 66
    .line 67
    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 68
    .line 69
    .line 70
    const-string v4, "\u786e\u8ba4\u53d1\u9001\u56fe\u7247"

    .line 71
    .line 72
    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v4, p0, Lxg1;->β:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v5, p0, Lxg1;->γ:Ljava/util/ArrayList;

    .line 79
    .line 80
    iget-object v6, p0, Lxg1;->δ:Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-static {v5, v6}, Lxh;->ｋ(Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    new-instance v12, Lcf1;

    .line 87
    .line 88
    const/16 v5, 0x10

    .line 89
    .line 90
    invoke-direct {v12, v5}, Lcf1;-><init>(I)V

    .line 91
    .line 92
    .line 93
    const/16 v13, 0x1e

    .line 94
    .line 95
    const-string v8, "\n"

    .line 96
    .line 97
    const/4 v9, 0x0

    .line 98
    const/4 v10, 0x0

    .line 99
    const/4 v11, 0x0

    .line 100
    invoke-static/range {v7 .. v13}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    const-string v6, "\n\u6587\u4ef6\uff1a"

    .line 105
    .line 106
    const-string v7, "\n\n\u8fdb\u884c\u4e2d\u7684\u76f8\u5173\u4efb\u52a1\uff1a\n"

    .line 107
    .line 108
    const-string v8, "\u76ee\u6807\uff1a"

    .line 109
    .line 110
    invoke-static {v8, v4, v6, v3, v7}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v4, "\n\n\u786e\u8ba4\u540e\u4f1a\u901a\u8fc7\u5bbf\u4e3b\u5b98\u65b9\u56fe\u7247\u94fe\u53d1\u9001\u4e00\u6761\u771f\u5b9e\u79c1\u4fe1\u3002"

    .line 118
    .line 119
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v1, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    new-instance v3, Ldd0;

    .line 131
    .line 132
    const/4 v4, 0x2

    .line 133
    invoke-direct {v3, v0, p0, v2, v4}, Ldd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 134
    .line 135
    .line 136
    const-string p0, "\u53d1\u9001"

    .line 137
    .line 138
    invoke-virtual {v1, p0, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    const-string v0, "\u53d6\u6d88"

    .line 143
    .line 144
    invoke-virtual {p0, v0, p1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 149
    .line 150
    .line 151
    :cond_4
    sget-object p0, Ls62;->α:Ls62;

    .line 152
    .line 153
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwa;->ε:I

    .line 4
    .line 5
    const/16 v2, 0x3c

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    const-string v4, "):"

    .line 10
    .line 11
    const-string v5, "("

    .line 12
    .line 13
    const-string v6, "#"

    .line 14
    .line 15
    const-wide/16 v7, 0x0

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v11, 0x1

    .line 19
    sget-object v12, Ls62;->α:Ls62;

    .line 20
    .line 21
    iget-object v13, v0, Lwa;->ζ:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v14, v0, Lwa;->η:Ljava/lang/Object;

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    check-cast v14, Landroid/view/ViewGroup;

    .line 29
    .line 30
    check-cast v13, Ljava/util/ArrayList;

    .line 31
    .line 32
    move-object/from16 v1, p1

    .line 33
    .line 34
    check-cast v1, Landroid/view/View;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/view/View;->isShown()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v2, -0x1

    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    goto/16 :goto_8

    .line 47
    .line 48
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 57
    .line 58
    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const-string v5, "pager"

    .line 66
    .line 67
    invoke-static {v4, v5, v9}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-nez v5, :cond_1

    .line 72
    .line 73
    goto/16 :goto_8

    .line 74
    .line 75
    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    const-string v3, "mainscrollableviewpager"

    .line 83
    .line 84
    invoke-static {v0, v3, v9}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-nez v3, :cond_11

    .line 89
    .line 90
    const-string v3, "nearby"

    .line 91
    .line 92
    invoke-static {v0, v3, v9}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_2

    .line 97
    .line 98
    const-string v3, "multitab"

    .line 99
    .line 100
    invoke-static {v0, v3, v9}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    goto/16 :goto_8

    .line 107
    .line 108
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    int-to-float v0, v0

    .line 113
    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    int-to-float v3, v3

    .line 118
    const v5, 0x3f0ccccd    # 0.55f

    .line 119
    .line 120
    .line 121
    mul-float/2addr v3, v5

    .line 122
    cmpg-float v0, v0, v3

    .line 123
    .line 124
    if-gez v0, :cond_3

    .line 125
    .line 126
    goto/16 :goto_8

    .line 127
    .line 128
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    int-to-float v0, v0

    .line 133
    invoke-virtual {v14}, Landroid/view/View;->getHeight()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    int-to-float v3, v3

    .line 138
    const v5, 0x3ee66666    # 0.45f

    .line 139
    .line 140
    .line 141
    mul-float/2addr v3, v5

    .line 142
    cmpg-float v0, v0, v3

    .line 143
    .line 144
    if-gez v0, :cond_4

    .line 145
    .line 146
    goto/16 :goto_8

    .line 147
    .line 148
    :cond_4
    const-string v0, "viewpager2"

    .line 149
    .line 150
    invoke-static {v4, v0, v9}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_8

    .line 155
    .line 156
    :try_start_0
    const-string v0, "getOrientation"

    .line 157
    .line 158
    new-array v3, v9, [Ljava/lang/Object;

    .line 159
    .line 160
    invoke-static {v1, v0, v3}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    instance-of v3, v0, Ljava/lang/Integer;

    .line 165
    .line 166
    if-eqz v3, :cond_5

    .line 167
    .line 168
    check-cast v0, Ljava/lang/Integer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :catchall_0
    move-exception v0

    .line 172
    goto :goto_0

    .line 173
    :cond_5
    const/4 v0, 0x0

    .line 174
    goto :goto_1

    .line 175
    :goto_0
    new-instance v3, Leo1;

    .line 176
    .line 177
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    move-object v0, v3

    .line 181
    :goto_1
    instance-of v3, v0, Leo1;

    .line 182
    .line 183
    if-eqz v3, :cond_6

    .line 184
    .line 185
    const/4 v10, 0x0

    .line 186
    goto :goto_2

    .line 187
    :cond_6
    move-object v10, v0

    .line 188
    :goto_2
    check-cast v10, Ljava/lang/Integer;

    .line 189
    .line 190
    if-eqz v10, :cond_7

    .line 191
    .line 192
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eq v0, v11, :cond_7

    .line 197
    .line 198
    goto :goto_8

    .line 199
    :cond_7
    const/16 v0, 0x28

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_8
    move v0, v9

    .line 203
    :goto_3
    invoke-virtual {v1, v11}, Landroid/view/View;->canScrollVertically(I)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-nez v3, :cond_9

    .line 208
    .line 209
    invoke-virtual {v1, v2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-eqz v3, :cond_a

    .line 214
    .line 215
    :cond_9
    add-int/lit8 v0, v0, 0x32

    .line 216
    .line 217
    :cond_a
    const-string v3, "vertical"

    .line 218
    .line 219
    invoke-static {v4, v3, v9}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-eqz v3, :cond_b

    .line 224
    .line 225
    add-int/lit8 v0, v0, 0x1e

    .line 226
    .line 227
    :cond_b
    const-string v3, "feed"

    .line 228
    .line 229
    invoke-static {v4, v3, v9}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    if-eqz v3, :cond_c

    .line 234
    .line 235
    add-int/lit8 v0, v0, 0x14

    .line 236
    .line 237
    :cond_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    :goto_4
    if-eqz v3, :cond_e

    .line 242
    .line 243
    const-class v4, Landroid/view/View;

    .line 244
    .line 245
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-nez v4, :cond_e

    .line 250
    .line 251
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    const-string v5, "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F23F37A5F0AB93F0714122F07952088CF32781F7A07FEC215334EF1F2F65A2"

    .line 256
    .line 257
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-eqz v4, :cond_d

    .line 266
    .line 267
    add-int/lit16 v0, v0, 0xc8

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_d
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    goto :goto_4

    .line 275
    :cond_e
    :goto_5
    invoke-virtual {v1, v11}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-nez v3, :cond_10

    .line 280
    .line 281
    invoke-virtual {v1, v2}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    if-eqz v2, :cond_f

    .line 286
    .line 287
    goto :goto_7

    .line 288
    :cond_f
    :goto_6
    move v2, v0

    .line 289
    goto :goto_8

    .line 290
    :cond_10
    :goto_7
    add-int/lit8 v0, v0, -0x19

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_11
    :goto_8
    if-lez v2, :cond_12

    .line 294
    .line 295
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    new-instance v2, Ll91;

    .line 300
    .line 301
    invoke-direct {v2, v1, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    :cond_12
    return-object v12

    .line 308
    :pswitch_0
    invoke-direct/range {p0 .. p1}, Lwa;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    return-object v0

    .line 313
    :pswitch_1
    invoke-direct/range {p0 .. p1}, Lwa;->ι(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    return-object v0

    .line 318
    :pswitch_2
    invoke-direct/range {p0 .. p1}, Lwa;->θ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    return-object v0

    .line 323
    :pswitch_3
    invoke-direct/range {p0 .. p1}, Lwa;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    return-object v0

    .line 328
    :pswitch_4
    invoke-direct/range {p0 .. p1}, Lwa;->ζ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    return-object v0

    .line 333
    :pswitch_5
    check-cast v14, Landroid/app/Activity;

    .line 334
    .line 335
    check-cast v13, Lp3;

    .line 336
    .line 337
    move-object/from16 v0, p1

    .line 338
    .line 339
    check-cast v0, Ljava/lang/Boolean;

    .line 340
    .line 341
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    new-instance v1, Lhy0;

    .line 346
    .line 347
    invoke-direct {v1, v0, v14, v13}, Lhy0;-><init>(ZLandroid/app/Activity;Lp3;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v14, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 351
    .line 352
    .line 353
    return-object v12

    .line 354
    :pswitch_6
    check-cast v14, Lq41;

    .line 355
    .line 356
    check-cast v13, Lch1;

    .line 357
    .line 358
    move-object/from16 v0, p1

    .line 359
    .line 360
    check-cast v0, Lbh1;

    .line 361
    .line 362
    iget-boolean v1, v14, Lq41;->φ:Z

    .line 363
    .line 364
    iget v2, v14, Lq41;->τ:F

    .line 365
    .line 366
    if-eqz v1, :cond_13

    .line 367
    .line 368
    invoke-interface {v0, v2}, Lyr;->Ξ(F)I

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    iget v2, v14, Lq41;->υ:F

    .line 373
    .line 374
    invoke-interface {v0, v2}, Lyr;->Ξ(F)I

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    invoke-static {v0, v13, v1, v2}, Lbh1;->ξ(Lbh1;Lch1;II)V

    .line 379
    .line 380
    .line 381
    goto :goto_9

    .line 382
    :cond_13
    invoke-interface {v0, v2}, Lyr;->Ξ(F)I

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    iget v2, v14, Lq41;->υ:F

    .line 387
    .line 388
    invoke-interface {v0, v2}, Lyr;->Ξ(F)I

    .line 389
    .line 390
    .line 391
    move-result v2

    .line 392
    invoke-static {v0, v13, v1, v2}, Lbh1;->λ(Lbh1;Lch1;II)V

    .line 393
    .line 394
    .line 395
    :goto_9
    return-object v12

    .line 396
    :pswitch_7
    invoke-direct/range {p0 .. p1}, Lwa;->δ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    return-object v0

    .line 401
    :pswitch_8
    check-cast v14, Lgt0;

    .line 402
    .line 403
    check-cast v13, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;

    .line 404
    .line 405
    move-object/from16 v0, p1

    .line 406
    .line 407
    check-cast v0, Los0;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    iget-boolean v0, v14, Lgt0;->ι:Z

    .line 413
    .line 414
    if-eqz v0, :cond_15

    .line 415
    .line 416
    iget-object v0, v14, Lgt0;->κ:Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;

    .line 417
    .line 418
    if-eq v0, v13, :cond_14

    .line 419
    .line 420
    goto :goto_a

    .line 421
    :cond_14
    iget-object v0, v14, Lgt0;->ε:Lx91;

    .line 422
    .line 423
    invoke-virtual {v0}, Lx91;->getValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    move-object v2, v1

    .line 428
    check-cast v2, Lps0;

    .line 429
    .line 430
    const/4 v7, 0x0

    .line 431
    const/16 v8, 0x19

    .line 432
    .line 433
    const/4 v3, 0x0

    .line 434
    const/4 v4, 0x0

    .line 435
    const/4 v5, 0x0

    .line 436
    const/4 v6, 0x0

    .line 437
    invoke-static/range {v2 .. v8}, Lps0;->α(Lps0;Ljava/util/ArrayList;Landroid/graphics/Bitmap;IZFI)Lps0;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-virtual {v0, v1}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    :cond_15
    :goto_a
    return-object v12

    .line 445
    :pswitch_9
    invoke-direct/range {p0 .. p1}, Lwa;->γ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    return-object v0

    .line 450
    :pswitch_a
    check-cast v14, Lnc0;

    .line 451
    .line 452
    check-cast v13, Lｓ;

    .line 453
    .line 454
    move-object/from16 v0, p1

    .line 455
    .line 456
    check-cast v0, Ljava/lang/Throwable;

    .line 457
    .line 458
    iget-object v0, v14, Lnc0;->η:Landroid/os/Handler;

    .line 459
    .line 460
    invoke-virtual {v0, v13}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 461
    .line 462
    .line 463
    return-object v12

    .line 464
    :pswitch_b
    invoke-direct/range {p0 .. p1}, Lwa;->β(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    return-object v0

    .line 469
    :pswitch_c
    check-cast v13, Ljava/lang/reflect/Method;

    .line 470
    .line 471
    move-object/from16 v1, p1

    .line 472
    .line 473
    check-cast v1, Lth0;

    .line 474
    .line 475
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    iget-object v2, v1, Lth0;->α:Ljava/lang/String;

    .line 479
    .line 480
    :try_start_1
    invoke-virtual {v13, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 481
    .line 482
    .line 483
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual {v13, v14, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 491
    goto :goto_b

    .line 492
    :catchall_1
    move-exception v0

    .line 493
    new-instance v3, Leo1;

    .line 494
    .line 495
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 496
    .line 497
    .line 498
    move-object v0, v3

    .line 499
    :goto_b
    instance-of v3, v0, Leo1;

    .line 500
    .line 501
    if-eqz v3, :cond_16

    .line 502
    .line 503
    const/4 v0, 0x0

    .line 504
    :cond_16
    if-nez v0, :cond_18

    .line 505
    .line 506
    :cond_17
    :goto_c
    const/4 v10, 0x0

    .line 507
    goto/16 :goto_13

    .line 508
    .line 509
    :cond_18
    const-string v3, "isGroupChat"

    .line 510
    .line 511
    invoke-static {v0, v3}, Lx;->ψ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v3

    .line 515
    instance-of v4, v3, Ljava/lang/Boolean;

    .line 516
    .line 517
    if-eqz v4, :cond_19

    .line 518
    .line 519
    check-cast v3, Ljava/lang/Boolean;

    .line 520
    .line 521
    goto :goto_d

    .line 522
    :cond_19
    const/4 v3, 0x0

    .line 523
    :goto_d
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 524
    .line 525
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v3

    .line 529
    if-nez v3, :cond_1a

    .line 530
    .line 531
    goto :goto_c

    .line 532
    :cond_1a
    const-string v3, "getConversationShortId"

    .line 533
    .line 534
    invoke-static {v0, v3}, Lx;->ψ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v3

    .line 538
    invoke-static {v3}, Lx;->Λ(Ljava/lang/Object;)Ljava/lang/Long;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    if-eqz v3, :cond_17

    .line 543
    .line 544
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 545
    .line 546
    .line 547
    move-result-wide v17

    .line 548
    cmp-long v3, v17, v7

    .line 549
    .line 550
    if-gtz v3, :cond_1b

    .line 551
    .line 552
    goto :goto_c

    .line 553
    :cond_1b
    const-string v3, "getMember"

    .line 554
    .line 555
    invoke-static {v0, v3}, Lx;->ψ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v3

    .line 559
    if-nez v3, :cond_1c

    .line 560
    .line 561
    goto :goto_c

    .line 562
    :cond_1c
    const-string v4, "getRole"

    .line 563
    .line 564
    invoke-static {v3, v4}, Lx;->ψ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    invoke-static {v3}, Lx;->Ι(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 569
    .line 570
    .line 571
    move-result-object v3

    .line 572
    if-eqz v3, :cond_17

    .line 573
    .line 574
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 575
    .line 576
    .line 577
    move-result v3

    .line 578
    if-eq v3, v11, :cond_1d

    .line 579
    .line 580
    const/4 v4, 0x2

    .line 581
    if-ne v3, v4, :cond_17

    .line 582
    .line 583
    :cond_1d
    const-string v4, "getCoreInfo"

    .line 584
    .line 585
    invoke-static {v0, v4}, Lx;->ψ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    const-string v4, "getName"

    .line 590
    .line 591
    invoke-static {v0, v4}, Lx;->ψ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    instance-of v4, v0, Ljava/lang/String;

    .line 596
    .line 597
    if-eqz v4, :cond_1e

    .line 598
    .line 599
    check-cast v0, Ljava/lang/String;

    .line 600
    .line 601
    goto :goto_e

    .line 602
    :cond_1e
    const/4 v0, 0x0

    .line 603
    :goto_e
    const/16 v4, 0x1f4

    .line 604
    .line 605
    if-eqz v0, :cond_20

    .line 606
    .line 607
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    if-eqz v0, :cond_20

    .line 616
    .line 617
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 618
    .line 619
    .line 620
    move-result v5

    .line 621
    if-nez v5, :cond_1f

    .line 622
    .line 623
    goto :goto_f

    .line 624
    :cond_1f
    const/4 v0, 0x0

    .line 625
    :goto_f
    if-eqz v0, :cond_20

    .line 626
    .line 627
    invoke-static {v0, v4}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    :goto_10
    move-object/from16 v19, v0

    .line 632
    .line 633
    goto :goto_12

    .line 634
    :cond_20
    iget-object v0, v1, Lth0;->δ:Ljava/lang/String;

    .line 635
    .line 636
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 645
    .line 646
    .line 647
    move-result v1

    .line 648
    if-nez v1, :cond_21

    .line 649
    .line 650
    move-object v10, v0

    .line 651
    goto :goto_11

    .line 652
    :cond_21
    const/4 v10, 0x0

    .line 653
    :goto_11
    if-eqz v10, :cond_22

    .line 654
    .line 655
    invoke-static {v10, v4}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    goto :goto_10

    .line 660
    :cond_22
    const-string v0, "\u672a\u547d\u540d\u7fa4\u804a"

    .line 661
    .line 662
    goto :goto_10

    .line 663
    :goto_12
    new-instance v15, Luw0;

    .line 664
    .line 665
    move-object/from16 v16, v2

    .line 666
    .line 667
    move/from16 v20, v3

    .line 668
    .line 669
    invoke-direct/range {v15 .. v20}, Luw0;-><init>(Ljava/lang/String;JLjava/lang/String;I)V

    .line 670
    .line 671
    .line 672
    move-object v10, v15

    .line 673
    :goto_13
    return-object v10

    .line 674
    :pswitch_d
    check-cast v14, Lg50;

    .line 675
    .line 676
    check-cast v13, Lm62;

    .line 677
    .line 678
    move-object/from16 v0, p1

    .line 679
    .line 680
    check-cast v0, La80;

    .line 681
    .line 682
    iget-object v0, v14, Lg50;->δ:Lk50;

    .line 683
    .line 684
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    iget-object v0, v14, Lg50;->ε:Lrk0;

    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    iget-object v0, v13, Lm62;->α:Lbr;

    .line 693
    .line 694
    if-eqz v0, :cond_24

    .line 695
    .line 696
    instance-of v0, v0, Lbr;

    .line 697
    .line 698
    if-eqz v0, :cond_23

    .line 699
    .line 700
    goto :goto_14

    .line 701
    :cond_23
    const/4 v1, 0x0

    .line 702
    goto :goto_16

    .line 703
    :cond_24
    :goto_14
    iget-object v0, v13, Lm62;->β:Ld60;

    .line 704
    .line 705
    iget v1, v13, Lm62;->γ:I

    .line 706
    .line 707
    if-nez v1, :cond_25

    .line 708
    .line 709
    sget-object v2, Ld60;->η:Ld60;

    .line 710
    .line 711
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v2

    .line 715
    if-eqz v2, :cond_25

    .line 716
    .line 717
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 718
    .line 719
    goto :goto_15

    .line 720
    :cond_25
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 721
    .line 722
    iget v0, v0, Ld60;->ε:I

    .line 723
    .line 724
    if-ne v1, v11, :cond_26

    .line 725
    .line 726
    move v9, v11

    .line 727
    :cond_26
    invoke-static {v2, v0, v9}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    :goto_15
    new-instance v1, Ln62;

    .line 732
    .line 733
    invoke-direct {v1, v0}, Ln62;-><init>(Landroid/graphics/Typeface;)V

    .line 734
    .line 735
    .line 736
    :goto_16
    if-eqz v1, :cond_27

    .line 737
    .line 738
    move-object v10, v1

    .line 739
    goto :goto_17

    .line 740
    :cond_27
    const-string v0, "Could not load font"

    .line 741
    .line 742
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    const/4 v10, 0x0

    .line 746
    :goto_17
    return-object v10

    .line 747
    :pswitch_e
    check-cast v14, Ljava/lang/ClassLoader;

    .line 748
    .line 749
    check-cast v13, Lg30;

    .line 750
    .line 751
    move-object/from16 v0, p1

    .line 752
    .line 753
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 754
    .line 755
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 756
    .line 757
    .line 758
    sget-object v1, Lh30;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 759
    .line 760
    :try_start_2
    new-instance v1, Lf30;

    .line 761
    .line 762
    invoke-direct {v1, v13, v11}, Lf30;-><init>(Lg30;I)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findField(La80;)Lorg/luckypray/dexkit/result/FieldDataList;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    new-instance v1, Ljava/util/ArrayList;

    .line 770
    .line 771
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    :cond_28
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 779
    .line 780
    .line 781
    move-result v2

    .line 782
    if-eqz v2, :cond_29

    .line 783
    .line 784
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v2

    .line 788
    check-cast v2, Lorg/luckypray/dexkit/result/FieldData;

    .line 789
    .line 790
    invoke-virtual {v2, v14}, Lorg/luckypray/dexkit/result/FieldData;->getFieldInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    if-eqz v2, :cond_28

    .line 795
    .line 796
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 797
    .line 798
    .line 799
    goto :goto_18

    .line 800
    :catchall_2
    move-exception v0

    .line 801
    goto :goto_1c

    .line 802
    :cond_29
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 807
    .line 808
    .line 809
    move-result v2

    .line 810
    if-eqz v2, :cond_2a

    .line 811
    .line 812
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    check-cast v2, Ljava/lang/reflect/Field;

    .line 817
    .line 818
    invoke-virtual {v2, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 819
    .line 820
    .line 821
    goto :goto_19

    .line 822
    :cond_2a
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 827
    .line 828
    .line 829
    move-result v1

    .line 830
    if-nez v1, :cond_2b

    .line 831
    .line 832
    const/4 v1, 0x0

    .line 833
    goto :goto_1a

    .line 834
    :cond_2b
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v1

    .line 838
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 839
    .line 840
    .line 841
    move-result v2

    .line 842
    if-nez v2, :cond_2c

    .line 843
    .line 844
    goto :goto_1a

    .line 845
    :cond_2c
    move-object v2, v1

    .line 846
    check-cast v2, Ljava/lang/reflect/Field;

    .line 847
    .line 848
    invoke-static {v2, v13}, Lh30;->ζ(Ljava/lang/reflect/Field;Lg30;)I

    .line 849
    .line 850
    .line 851
    move-result v2

    .line 852
    :cond_2d
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v3

    .line 856
    move-object v4, v3

    .line 857
    check-cast v4, Ljava/lang/reflect/Field;

    .line 858
    .line 859
    invoke-static {v4, v13}, Lh30;->ζ(Ljava/lang/reflect/Field;Lg30;)I

    .line 860
    .line 861
    .line 862
    move-result v4

    .line 863
    if-ge v2, v4, :cond_2e

    .line 864
    .line 865
    move-object v1, v3

    .line 866
    move v2, v4

    .line 867
    :cond_2e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 868
    .line 869
    .line 870
    move-result v3

    .line 871
    if-nez v3, :cond_2d

    .line 872
    .line 873
    :goto_1a
    check-cast v1, Ljava/lang/reflect/Field;

    .line 874
    .line 875
    if-eqz v1, :cond_2f

    .line 876
    .line 877
    invoke-static {v1, v13}, Lh30;->ζ(Ljava/lang/reflect/Field;Lg30;)I

    .line 878
    .line 879
    .line 880
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 881
    const/16 v2, 0xbb8

    .line 882
    .line 883
    if-lt v0, v2, :cond_2f

    .line 884
    .line 885
    move-object v10, v1

    .line 886
    goto :goto_1d

    .line 887
    :cond_2f
    :goto_1b
    const/4 v10, 0x0

    .line 888
    goto :goto_1d

    .line 889
    :goto_1c
    iget-object v1, v13, Lg30;->ε:Lkx;

    .line 890
    .line 891
    iget-object v1, v1, Lkx;->ε:Ljava/lang/String;

    .line 892
    .line 893
    const-string v2, "DexKit \u5b9a\u4f4d\u89c6\u9891\u5b57\u6bb5\u5931\u8d25 key="

    .line 894
    .line 895
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v1

    .line 899
    const-string v2, "r45da87c70c377d6f"

    .line 900
    .line 901
    invoke-static {v2, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 902
    .line 903
    .line 904
    goto :goto_1b

    .line 905
    :goto_1d
    if-nez v10, :cond_30

    .line 906
    .line 907
    invoke-static {v14, v13}, Lh30;->γ(Ljava/lang/ClassLoader;Lg30;)Ljava/lang/reflect/Field;

    .line 908
    .line 909
    .line 910
    move-result-object v10

    .line 911
    :cond_30
    return-object v10

    .line 912
    :pswitch_f
    check-cast v14, Lp80;

    .line 913
    .line 914
    check-cast v13, Ljava/lang/ClassLoader;

    .line 915
    .line 916
    move-object/from16 v0, p1

    .line 917
    .line 918
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 919
    .line 920
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 921
    .line 922
    .line 923
    invoke-interface {v14, v0, v13}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    check-cast v0, Ljava/util/List;

    .line 928
    .line 929
    return-object v0

    .line 930
    :pswitch_10
    check-cast v14, Ljava/util/ArrayList;

    .line 931
    .line 932
    check-cast v13, La80;

    .line 933
    .line 934
    move-object/from16 v0, p1

    .line 935
    .line 936
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 937
    .line 938
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 939
    .line 940
    .line 941
    invoke-interface {v13, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    check-cast v0, Ljava/lang/Iterable;

    .line 946
    .line 947
    invoke-static {v14, v0}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    invoke-static {v0}, Lpd2;->ο(Ljava/util/List;)Ljava/util/ArrayList;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    return-object v0

    .line 956
    :pswitch_11
    check-cast v14, Ljava/lang/ClassLoader;

    .line 957
    .line 958
    check-cast v13, Ljava/lang/reflect/Method;

    .line 959
    .line 960
    move-object/from16 v0, p1

    .line 961
    .line 962
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 963
    .line 964
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    sget-object v1, Lx00;->α:Lx00;

    .line 968
    .line 969
    :try_start_3
    new-instance v1, Lnb;

    .line 970
    .line 971
    invoke-direct {v1, v11, v13}, Lnb;-><init>(ILjava/lang/reflect/Method;)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    new-instance v1, Ljava/util/ArrayList;

    .line 979
    .line 980
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 981
    .line 982
    .line 983
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 984
    .line 985
    .line 986
    move-result-object v2

    .line 987
    :cond_31
    :goto_1e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 988
    .line 989
    .line 990
    move-result v0

    .line 991
    if-eqz v0, :cond_33

    .line 992
    .line 993
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 994
    .line 995
    .line 996
    move-result-object v0

    .line 997
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 998
    .line 999
    :try_start_4
    invoke-virtual {v0, v14}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 1003
    goto :goto_1f

    .line 1004
    :catchall_3
    move-exception v0

    .line 1005
    :try_start_5
    new-instance v3, Leo1;

    .line 1006
    .line 1007
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1008
    .line 1009
    .line 1010
    move-object v0, v3

    .line 1011
    :goto_1f
    instance-of v3, v0, Leo1;

    .line 1012
    .line 1013
    if-eqz v3, :cond_32

    .line 1014
    .line 1015
    const/4 v0, 0x0

    .line 1016
    :cond_32
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1017
    .line 1018
    if-eqz v0, :cond_31

    .line 1019
    .line 1020
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1021
    .line 1022
    .line 1023
    goto :goto_1e

    .line 1024
    :catchall_4
    move-exception v0

    .line 1025
    goto/16 :goto_24

    .line 1026
    .line 1027
    :cond_33
    new-instance v0, Ljava/util/ArrayList;

    .line 1028
    .line 1029
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v1

    .line 1036
    :cond_34
    :goto_20
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1037
    .line 1038
    .line 1039
    move-result v2

    .line 1040
    if-eqz v2, :cond_35

    .line 1041
    .line 1042
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v2

    .line 1046
    move-object v3, v2

    .line 1047
    check-cast v3, Ljava/lang/reflect/Method;

    .line 1048
    .line 1049
    invoke-static {v3, v13}, Lx00;->ε(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z

    .line 1050
    .line 1051
    .line 1052
    move-result v3

    .line 1053
    if-eqz v3, :cond_34

    .line 1054
    .line 1055
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1056
    .line 1057
    .line 1058
    goto :goto_20

    .line 1059
    :cond_35
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v1

    .line 1063
    :goto_21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1064
    .line 1065
    .line 1066
    move-result v2

    .line 1067
    if-eqz v2, :cond_36

    .line 1068
    .line 1069
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v2

    .line 1073
    check-cast v2, Ljava/lang/reflect/Method;

    .line 1074
    .line 1075
    invoke-virtual {v2, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1076
    .line 1077
    .line 1078
    goto :goto_21

    .line 1079
    :cond_36
    new-instance v1, Ljava/util/HashSet;

    .line 1080
    .line 1081
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1082
    .line 1083
    .line 1084
    new-instance v2, Ljava/util/ArrayList;

    .line 1085
    .line 1086
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1094
    .line 1095
    .line 1096
    move-result v3

    .line 1097
    if-eqz v3, :cond_39

    .line 1098
    .line 1099
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v3

    .line 1103
    move-object v7, v3

    .line 1104
    check-cast v7, Ljava/lang/reflect/Method;

    .line 1105
    .line 1106
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v8

    .line 1113
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v8

    .line 1117
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v10

    .line 1121
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v11

    .line 1128
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v11

    .line 1132
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v12

    .line 1136
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1137
    .line 1138
    .line 1139
    new-instance v14, Ljava/util/ArrayList;

    .line 1140
    .line 1141
    array-length v15, v12

    .line 1142
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 1143
    .line 1144
    .line 1145
    array-length v15, v12

    .line 1146
    :goto_23
    if-ge v9, v15, :cond_37

    .line 1147
    .line 1148
    aget-object v16, v12, v9

    .line 1149
    .line 1150
    move-object/from16 p0, v0

    .line 1151
    .line 1152
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1157
    .line 1158
    .line 1159
    add-int/lit8 v9, v9, 0x1

    .line 1160
    .line 1161
    move-object/from16 v0, p0

    .line 1162
    .line 1163
    goto :goto_23

    .line 1164
    :cond_37
    move-object/from16 p0, v0

    .line 1165
    .line 1166
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1167
    .line 1168
    .line 1169
    move-result v0

    .line 1170
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1171
    .line 1172
    .line 1173
    const-string v15, ","

    .line 1174
    .line 1175
    const/16 v19, 0x0

    .line 1176
    .line 1177
    const/16 v20, 0x3e

    .line 1178
    .line 1179
    const/16 v16, 0x0

    .line 1180
    .line 1181
    const/16 v17, 0x0

    .line 1182
    .line 1183
    const/16 v18, 0x0

    .line 1184
    .line 1185
    invoke-static/range {v14 .. v20}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v0

    .line 1189
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1190
    .line 1191
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v0

    .line 1219
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1220
    .line 1221
    .line 1222
    move-result v0

    .line 1223
    if-eqz v0, :cond_38

    .line 1224
    .line 1225
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 1226
    .line 1227
    .line 1228
    :cond_38
    move-object/from16 v0, p0

    .line 1229
    .line 1230
    const/4 v9, 0x0

    .line 1231
    goto/16 :goto_22

    .line 1232
    .line 1233
    :goto_24
    new-instance v2, Leo1;

    .line 1234
    .line 1235
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1236
    .line 1237
    .line 1238
    :cond_39
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v0

    .line 1242
    if-eqz v0, :cond_3a

    .line 1243
    .line 1244
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v1

    .line 1248
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v0

    .line 1252
    const-string v3, "r9da2d880fcceba3c"

    .line 1253
    .line 1254
    invoke-static {v3, v1, v0}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1255
    .line 1256
    .line 1257
    :cond_3a
    instance-of v0, v2, Leo1;

    .line 1258
    .line 1259
    if-eqz v0, :cond_3b

    .line 1260
    .line 1261
    sget-object v2, Ljz;->ε:Ljz;

    .line 1262
    .line 1263
    :cond_3b
    check-cast v2, Ljava/util/List;

    .line 1264
    .line 1265
    return-object v2

    .line 1266
    :pswitch_12
    check-cast v14, Ljava/lang/ClassLoader;

    .line 1267
    .line 1268
    check-cast v13, Lr00;

    .line 1269
    .line 1270
    move-object/from16 v1, p1

    .line 1271
    .line 1272
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1273
    .line 1274
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1275
    .line 1276
    .line 1277
    sget-object v0, Ls00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1278
    .line 1279
    :try_start_6
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 1280
    .line 1281
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1282
    .line 1283
    .line 1284
    const-string v0, "int"

    .line 1285
    .line 1286
    const-string v3, "java.lang.Integer"

    .line 1287
    .line 1288
    const-string v4, "boolean"

    .line 1289
    .line 1290
    const-string v5, "java.lang.Boolean"

    .line 1291
    .line 1292
    filled-new-array {v0, v3, v4, v5}, [Ljava/lang/String;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v0

    .line 1296
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v0

    .line 1300
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v3

    .line 1304
    :cond_3c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1305
    .line 1306
    .line 1307
    move-result v0

    .line 1308
    if-eqz v0, :cond_3f

    .line 1309
    .line 1310
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v0

    .line 1314
    check-cast v0, Ljava/lang/String;

    .line 1315
    .line 1316
    new-instance v4, Ls9;

    .line 1317
    .line 1318
    const/16 v5, 0x11

    .line 1319
    .line 1320
    invoke-direct {v4, v0, v5}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 1321
    .line 1322
    .line 1323
    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findField(La80;)Lorg/luckypray/dexkit/result/FieldDataList;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v0

    .line 1327
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v4

    .line 1331
    :cond_3d
    :goto_25
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1332
    .line 1333
    .line 1334
    move-result v0

    .line 1335
    if-eqz v0, :cond_3c

    .line 1336
    .line 1337
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    check-cast v0, Lorg/luckypray/dexkit/result/FieldData;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1342
    .line 1343
    :try_start_7
    invoke-virtual {v0, v14}, Lorg/luckypray/dexkit/result/FieldData;->getFieldInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 1347
    goto :goto_26

    .line 1348
    :catchall_5
    move-exception v0

    .line 1349
    :try_start_8
    new-instance v5, Leo1;

    .line 1350
    .line 1351
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1352
    .line 1353
    .line 1354
    move-object v0, v5

    .line 1355
    :goto_26
    instance-of v5, v0, Leo1;

    .line 1356
    .line 1357
    if-eqz v5, :cond_3e

    .line 1358
    .line 1359
    const/4 v0, 0x0

    .line 1360
    :cond_3e
    check-cast v0, Ljava/lang/reflect/Field;

    .line 1361
    .line 1362
    if-eqz v0, :cond_3d

    .line 1363
    .line 1364
    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1365
    .line 1366
    .line 1367
    goto :goto_25

    .line 1368
    :catchall_6
    move-exception v0

    .line 1369
    goto :goto_27

    .line 1370
    :cond_3f
    invoke-static {v2, v13}, Ls00;->ε(Ljava/util/AbstractCollection;Lr00;)Ljava/lang/reflect/Field;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 1374
    goto :goto_28

    .line 1375
    :goto_27
    new-instance v1, Leo1;

    .line 1376
    .line 1377
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1378
    .line 1379
    .line 1380
    move-object v0, v1

    .line 1381
    :goto_28
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v1

    .line 1385
    if-eqz v1, :cond_40

    .line 1386
    .line 1387
    iget-object v2, v13, Lr00;->ε:Lkx;

    .line 1388
    .line 1389
    iget-object v2, v2, Lkx;->ε:Ljava/lang/String;

    .line 1390
    .line 1391
    const-string v3, "DexKit \u5b9a\u4f4d\u6587\u7ae0\u6a21\u5f0f\u5b57\u6bb5\u5931\u8d25 key="

    .line 1392
    .line 1393
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v2

    .line 1397
    const-string v3, "re7f25b3ea5f98fa0"

    .line 1398
    .line 1399
    invoke-static {v3, v2, v1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1400
    .line 1401
    .line 1402
    :cond_40
    instance-of v1, v0, Leo1;

    .line 1403
    .line 1404
    if-eqz v1, :cond_41

    .line 1405
    .line 1406
    const/4 v10, 0x0

    .line 1407
    goto :goto_29

    .line 1408
    :cond_41
    move-object v10, v0

    .line 1409
    :goto_29
    check-cast v10, Ljava/lang/reflect/Field;

    .line 1410
    .line 1411
    if-nez v10, :cond_42

    .line 1412
    .line 1413
    invoke-static {v14, v13}, Ls00;->γ(Ljava/lang/ClassLoader;Lr00;)Ljava/lang/reflect/Field;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v10

    .line 1417
    :cond_42
    return-object v10

    .line 1418
    :pswitch_13
    check-cast v14, Lwa;

    .line 1419
    .line 1420
    check-cast v13, Ljx;

    .line 1421
    .line 1422
    move-object/from16 v0, p1

    .line 1423
    .line 1424
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1425
    .line 1426
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 1427
    .line 1428
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v14, v0}, Lwa;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v0

    .line 1435
    check-cast v0, Ljava/lang/String;

    .line 1436
    .line 1437
    if-eqz v0, :cond_43

    .line 1438
    .line 1439
    new-instance v1, Lcx;

    .line 1440
    .line 1441
    invoke-direct {v1, v0}, Lcx;-><init>(Ljava/lang/String;)V

    .line 1442
    .line 1443
    .line 1444
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v1

    .line 1448
    sget-object v2, Lkx;->Α:Lkx;

    .line 1449
    .line 1450
    invoke-virtual {v13, v2, v1}, Ljx;->θ(Lkx;Ljava/util/List;)V

    .line 1451
    .line 1452
    .line 1453
    const-string v1, "DexKit query class done, key=comment_control_legacy_holder_class_v2, className="

    .line 1454
    .line 1455
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v1

    .line 1459
    invoke-static {v1}, Lox;->ξ(Ljava/lang/String;)V

    .line 1460
    .line 1461
    .line 1462
    goto :goto_2a

    .line 1463
    :cond_43
    const-string v1, "DexKit query class empty, key=comment_control_legacy_holder_class_v2"

    .line 1464
    .line 1465
    invoke-static {v1}, Lox;->ξ(Ljava/lang/String;)V

    .line 1466
    .line 1467
    .line 1468
    :goto_2a
    return-object v0

    .line 1469
    :pswitch_14
    check-cast v14, Law;

    .line 1470
    .line 1471
    check-cast v13, Lch1;

    .line 1472
    .line 1473
    move-object/from16 v0, p1

    .line 1474
    .line 1475
    check-cast v0, Lbh1;

    .line 1476
    .line 1477
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1478
    .line 1479
    .line 1480
    iget-boolean v1, v14, Law;->Α:Z

    .line 1481
    .line 1482
    if-eqz v1, :cond_44

    .line 1483
    .line 1484
    iget-object v1, v14, Law;->Ι:Lθ;

    .line 1485
    .line 1486
    invoke-static {v0, v13}, Lbh1;->γ(Lbh1;Lch1;)V

    .line 1487
    .line 1488
    .line 1489
    iget-wide v2, v13, Lch1;->ι:J

    .line 1490
    .line 1491
    invoke-static {v7, v8, v2, v3}, Lum0;->γ(JJ)J

    .line 1492
    .line 1493
    .line 1494
    move-result-wide v2

    .line 1495
    const/4 v0, 0x0

    .line 1496
    invoke-virtual {v13, v2, v3, v0, v1}, Lch1;->у(JFLa80;)V

    .line 1497
    .line 1498
    .line 1499
    goto :goto_2b

    .line 1500
    :cond_44
    invoke-static {v0, v13, v7, v8}, Lbh1;->μ(Lbh1;Lch1;J)V

    .line 1501
    .line 1502
    .line 1503
    :goto_2b
    return-object v12

    .line 1504
    :pswitch_15
    check-cast v14, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1505
    .line 1506
    check-cast v13, Lθ;

    .line 1507
    .line 1508
    move-object/from16 v0, p1

    .line 1509
    .line 1510
    check-cast v0, Lf8;

    .line 1511
    .line 1512
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1513
    .line 1514
    .line 1515
    sget-object v1, Lpq;->δ:Landroid/os/Handler;

    .line 1516
    .line 1517
    new-instance v2, Le9;

    .line 1518
    .line 1519
    const/16 v3, 0x9

    .line 1520
    .line 1521
    invoke-direct {v2, v14, v13, v0, v3}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1522
    .line 1523
    .line 1524
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1525
    .line 1526
    .line 1527
    return-object v12

    .line 1528
    :pswitch_16
    move-object/from16 v17, v14

    .line 1529
    .line 1530
    check-cast v17, Lkk;

    .line 1531
    .line 1532
    check-cast v13, Ljava/lang/ClassLoader;

    .line 1533
    .line 1534
    move-object/from16 v0, p1

    .line 1535
    .line 1536
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1537
    .line 1538
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1539
    .line 1540
    .line 1541
    :try_start_9
    new-instance v1, Lwj;

    .line 1542
    .line 1543
    const/4 v2, 0x7

    .line 1544
    invoke-direct {v1, v2}, Lwj;-><init>(I)V

    .line 1545
    .line 1546
    .line 1547
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(La80;)Lorg/luckypray/dexkit/result/ClassDataList;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v0

    .line 1551
    invoke-static {v0}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v0

    .line 1555
    new-instance v1, Lbb;

    .line 1556
    .line 1557
    invoke-direct {v1, v13, v3}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 1558
    .line 1559
    .line 1560
    invoke-static {v0, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v0

    .line 1564
    new-instance v15, Lng;

    .line 1565
    .line 1566
    const-class v18, Lkk;

    .line 1567
    .line 1568
    const-string v19, "isLegacyHolderClass"

    .line 1569
    .line 1570
    const-string v20, "isLegacyHolderClass(Ljava/lang/Class;)Z"

    .line 1571
    .line 1572
    const/16 v21, 0x0

    .line 1573
    .line 1574
    const/16 v22, 0x1

    .line 1575
    .line 1576
    const/16 v16, 0x1

    .line 1577
    .line 1578
    invoke-direct/range {v15 .. v22}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 1579
    .line 1580
    .line 1581
    new-instance v1, Ly30;

    .line 1582
    .line 1583
    invoke-direct {v1, v0, v11, v15}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1584
    .line 1585
    .line 1586
    new-instance v0, Lx30;

    .line 1587
    .line 1588
    invoke-direct {v0, v1}, Lx30;-><init>(Ly30;)V

    .line 1589
    .line 1590
    .line 1591
    invoke-virtual {v0}, Lx30;->hasNext()Z

    .line 1592
    .line 1593
    .line 1594
    move-result v1

    .line 1595
    if-nez v1, :cond_45

    .line 1596
    .line 1597
    const/4 v1, 0x0

    .line 1598
    goto :goto_2c

    .line 1599
    :cond_45
    invoke-virtual {v0}, Lx30;->next()Ljava/lang/Object;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v1

    .line 1603
    invoke-virtual {v0}, Lx30;->hasNext()Z

    .line 1604
    .line 1605
    .line 1606
    move-result v2

    .line 1607
    if-nez v2, :cond_46

    .line 1608
    .line 1609
    goto :goto_2c

    .line 1610
    :cond_46
    move-object v2, v1

    .line 1611
    check-cast v2, Ljava/lang/Class;

    .line 1612
    .line 1613
    invoke-static {v2}, Lkk;->κ(Ljava/lang/Class;)I

    .line 1614
    .line 1615
    .line 1616
    move-result v2

    .line 1617
    :cond_47
    invoke-virtual {v0}, Lx30;->next()Ljava/lang/Object;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v3

    .line 1621
    move-object v4, v3

    .line 1622
    check-cast v4, Ljava/lang/Class;

    .line 1623
    .line 1624
    invoke-static {v4}, Lkk;->κ(Ljava/lang/Class;)I

    .line 1625
    .line 1626
    .line 1627
    move-result v4

    .line 1628
    if-ge v2, v4, :cond_48

    .line 1629
    .line 1630
    move-object v1, v3

    .line 1631
    move v2, v4

    .line 1632
    :cond_48
    invoke-virtual {v0}, Lx30;->hasNext()Z

    .line 1633
    .line 1634
    .line 1635
    move-result v3

    .line 1636
    if-nez v3, :cond_47

    .line 1637
    .line 1638
    :goto_2c
    check-cast v1, Ljava/lang/Class;

    .line 1639
    .line 1640
    if-eqz v1, :cond_49

    .line 1641
    .line 1642
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 1646
    goto :goto_2e

    .line 1647
    :catchall_7
    move-exception v0

    .line 1648
    goto :goto_2d

    .line 1649
    :cond_49
    const/4 v0, 0x0

    .line 1650
    goto :goto_2e

    .line 1651
    :goto_2d
    new-instance v1, Leo1;

    .line 1652
    .line 1653
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1654
    .line 1655
    .line 1656
    move-object v0, v1

    .line 1657
    :goto_2e
    instance-of v1, v0, Leo1;

    .line 1658
    .line 1659
    if-eqz v1, :cond_4a

    .line 1660
    .line 1661
    const/4 v10, 0x0

    .line 1662
    goto :goto_2f

    .line 1663
    :cond_4a
    move-object v10, v0

    .line 1664
    :goto_2f
    check-cast v10, Ljava/lang/String;

    .line 1665
    .line 1666
    return-object v10

    .line 1667
    :pswitch_17
    check-cast v14, Ldj;

    .line 1668
    .line 1669
    check-cast v13, Lej;

    .line 1670
    .line 1671
    move-object/from16 v0, p1

    .line 1672
    .line 1673
    check-cast v0, Ljava/io/OutputStream;

    .line 1674
    .line 1675
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1676
    .line 1677
    .line 1678
    iget-object v1, v14, Ldj;->γ:Ljava/io/File;

    .line 1679
    .line 1680
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 1681
    .line 1682
    .line 1683
    move-result-wide v4

    .line 1684
    iget v2, v13, Lej;->γ:I

    .line 1685
    .line 1686
    const/16 v6, 0x8

    .line 1687
    .line 1688
    const/4 v7, 0x4

    .line 1689
    const/4 v8, 0x3

    .line 1690
    if-eq v2, v8, :cond_4c

    .line 1691
    .line 1692
    if-eq v2, v7, :cond_4b

    .line 1693
    .line 1694
    move v9, v3

    .line 1695
    goto :goto_30

    .line 1696
    :cond_4b
    const/16 v9, 0x20

    .line 1697
    .line 1698
    goto :goto_30

    .line 1699
    :cond_4c
    move v9, v6

    .line 1700
    :goto_30
    iget v10, v13, Lej;->β:I

    .line 1701
    .line 1702
    if-ge v10, v11, :cond_4d

    .line 1703
    .line 1704
    move v10, v11

    .line 1705
    :cond_4d
    iget v13, v13, Lej;->α:I

    .line 1706
    .line 1707
    const/16 v14, 0x1f40

    .line 1708
    .line 1709
    if-ge v13, v14, :cond_4e

    .line 1710
    .line 1711
    move v13, v14

    .line 1712
    :cond_4e
    mul-int v14, v10, v9

    .line 1713
    .line 1714
    div-int/2addr v14, v6

    .line 1715
    mul-int v6, v13, v14

    .line 1716
    .line 1717
    const-wide/16 v15, 0x24

    .line 1718
    .line 1719
    add-long/2addr v15, v4

    .line 1720
    const-wide/32 v17, 0x7fffffff

    .line 1721
    .line 1722
    .line 1723
    cmp-long v19, v15, v17

    .line 1724
    .line 1725
    if-lez v19, :cond_4f

    .line 1726
    .line 1727
    move-object/from16 v19, v12

    .line 1728
    .line 1729
    move-wide/from16 v11, v17

    .line 1730
    .line 1731
    goto :goto_31

    .line 1732
    :cond_4f
    move-object/from16 v19, v12

    .line 1733
    .line 1734
    move-wide v11, v15

    .line 1735
    :goto_31
    long-to-int v11, v11

    .line 1736
    cmp-long v12, v4, v17

    .line 1737
    .line 1738
    if-lez v12, :cond_50

    .line 1739
    .line 1740
    move-wide/from16 v4, v17

    .line 1741
    .line 1742
    :cond_50
    long-to-int v4, v4

    .line 1743
    const/16 v5, 0x2c

    .line 1744
    .line 1745
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v5

    .line 1749
    sget-object v12, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1750
    .line 1751
    invoke-virtual {v5, v12}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v5

    .line 1755
    sget-object v12, Lmf;->β:Ljava/nio/charset/Charset;

    .line 1756
    .line 1757
    const-string v15, "RIFF"

    .line 1758
    .line 1759
    invoke-virtual {v15, v12}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 1760
    .line 1761
    .line 1762
    move-result-object v15

    .line 1763
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1764
    .line 1765
    .line 1766
    invoke-virtual {v5, v15}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1767
    .line 1768
    .line 1769
    invoke-virtual {v5, v11}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 1770
    .line 1771
    .line 1772
    const-string v11, "WAVE"

    .line 1773
    .line 1774
    invoke-virtual {v11, v12}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 1775
    .line 1776
    .line 1777
    move-result-object v11

    .line 1778
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1779
    .line 1780
    .line 1781
    invoke-virtual {v5, v11}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1782
    .line 1783
    .line 1784
    const-string v11, "fmt "

    .line 1785
    .line 1786
    invoke-virtual {v11, v12}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 1787
    .line 1788
    .line 1789
    move-result-object v11

    .line 1790
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1791
    .line 1792
    .line 1793
    invoke-virtual {v5, v11}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1794
    .line 1795
    .line 1796
    invoke-virtual {v5, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 1797
    .line 1798
    .line 1799
    if-ne v2, v7, :cond_51

    .line 1800
    .line 1801
    move v11, v8

    .line 1802
    goto :goto_32

    .line 1803
    :cond_51
    const/4 v11, 0x1

    .line 1804
    :goto_32
    int-to-short v2, v11

    .line 1805
    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1806
    .line 1807
    .line 1808
    int-to-short v2, v10

    .line 1809
    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1810
    .line 1811
    .line 1812
    invoke-virtual {v5, v13}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 1813
    .line 1814
    .line 1815
    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 1816
    .line 1817
    .line 1818
    int-to-short v2, v14

    .line 1819
    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1820
    .line 1821
    .line 1822
    int-to-short v2, v9

    .line 1823
    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1824
    .line 1825
    .line 1826
    const-string v2, "data"

    .line 1827
    .line 1828
    invoke-virtual {v2, v12}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 1829
    .line 1830
    .line 1831
    move-result-object v2

    .line 1832
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1833
    .line 1834
    .line 1835
    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1836
    .line 1837
    .line 1838
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 1839
    .line 1840
    .line 1841
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    .line 1842
    .line 1843
    .line 1844
    move-result-object v2

    .line 1845
    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write([B)V

    .line 1846
    .line 1847
    .line 1848
    new-instance v2, Ljava/io/FileInputStream;

    .line 1849
    .line 1850
    invoke-direct {v2, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 1851
    .line 1852
    .line 1853
    const/high16 v1, 0x20000

    .line 1854
    .line 1855
    :try_start_a
    invoke-static {v2, v0, v1}, Lh62;->Δ(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 1856
    .line 1857
    .line 1858
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 1859
    .line 1860
    .line 1861
    return-object v19

    .line 1862
    :catchall_8
    move-exception v0

    .line 1863
    move-object v1, v0

    .line 1864
    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 1865
    :catchall_9
    move-exception v0

    .line 1866
    invoke-static {v2, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1867
    .line 1868
    .line 1869
    throw v0

    .line 1870
    :pswitch_18
    move-object/from16 v19, v12

    .line 1871
    .line 1872
    check-cast v14, Lkh;

    .line 1873
    .line 1874
    check-cast v13, Ljava/lang/ClassLoader;

    .line 1875
    .line 1876
    move-object/from16 v1, p1

    .line 1877
    .line 1878
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1879
    .line 1880
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1881
    .line 1882
    .line 1883
    sget-object v0, Lkh;->α:Lkh;

    .line 1884
    .line 1885
    const/4 v2, 0x0

    .line 1886
    invoke-virtual {v14, v13, v2}, Lkh;->ν(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v0

    .line 1890
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1891
    .line 1892
    .line 1893
    move-result v2

    .line 1894
    if-eqz v2, :cond_52

    .line 1895
    .line 1896
    invoke-static {v13}, Lkh;->κ(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v0

    .line 1900
    :cond_52
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 1901
    .line 1902
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1903
    .line 1904
    .line 1905
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1906
    .line 1907
    .line 1908
    move-result-object v3

    .line 1909
    :cond_53
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1910
    .line 1911
    .line 1912
    move-result v0

    .line 1913
    if-eqz v0, :cond_57

    .line 1914
    .line 1915
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v0

    .line 1919
    move-object v4, v0

    .line 1920
    check-cast v4, Ljava/lang/Class;

    .line 1921
    .line 1922
    sget-object v0, Lkh;->γ:Ljava/util/List;

    .line 1923
    .line 1924
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v5

    .line 1928
    :cond_54
    :goto_33
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1929
    .line 1930
    .line 1931
    move-result v0

    .line 1932
    if-eqz v0, :cond_53

    .line 1933
    .line 1934
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v0

    .line 1938
    move-object v6, v0

    .line 1939
    check-cast v6, Ljava/lang/String;

    .line 1940
    .line 1941
    :try_start_c
    new-instance v0, Lfh;

    .line 1942
    .line 1943
    const/4 v7, 0x0

    .line 1944
    invoke-direct {v0, v7, v4, v6}, Lfh;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 1945
    .line 1946
    .line 1947
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1948
    .line 1949
    .line 1950
    move-result-object v0

    .line 1951
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v0

    .line 1955
    :catchall_a
    :cond_55
    :goto_34
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1956
    .line 1957
    .line 1958
    move-result v7

    .line 1959
    if-eqz v7, :cond_56

    .line 1960
    .line 1961
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v7

    .line 1965
    check-cast v7, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .line 1966
    .line 1967
    :try_start_d
    invoke-virtual {v7, v13}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v7

    .line 1971
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v8

    .line 1975
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v8

    .line 1979
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v9

    .line 1983
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1984
    .line 1985
    .line 1986
    move-result v8

    .line 1987
    if-eqz v8, :cond_55

    .line 1988
    .line 1989
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1990
    .line 1991
    .line 1992
    move-result v8

    .line 1993
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1994
    .line 1995
    .line 1996
    move-result v8

    .line 1997
    if-nez v8, :cond_55

    .line 1998
    .line 1999
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2000
    .line 2001
    .line 2002
    move-result v8

    .line 2003
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 2004
    .line 2005
    .line 2006
    move-result v8

    .line 2007
    if-nez v8, :cond_55

    .line 2008
    .line 2009
    const/4 v8, 0x1

    .line 2010
    invoke-virtual {v7, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 2011
    .line 2012
    .line 2013
    invoke-virtual {v2, v7}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    .line 2014
    .line 2015
    .line 2016
    goto :goto_34

    .line 2017
    :catchall_b
    move-exception v0

    .line 2018
    goto :goto_35

    .line 2019
    :cond_56
    move-object/from16 v7, v19

    .line 2020
    .line 2021
    goto :goto_36

    .line 2022
    :goto_35
    new-instance v7, Leo1;

    .line 2023
    .line 2024
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2025
    .line 2026
    .line 2027
    :goto_36
    invoke-static {v7}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v0

    .line 2031
    if-eqz v0, :cond_54

    .line 2032
    .line 2033
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v7

    .line 2037
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v0

    .line 2041
    new-instance v8, Ljava/lang/StringBuilder;

    .line 2042
    .line 2043
    const-string v9, "ra843337d996e6c9f"

    .line 2044
    .line 2045
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2046
    .line 2047
    .line 2048
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2049
    .line 2050
    .line 2051
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2052
    .line 2053
    .line 2054
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2055
    .line 2056
    .line 2057
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v0

    .line 2061
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 2062
    .line 2063
    .line 2064
    goto/16 :goto_33

    .line 2065
    .line 2066
    :cond_57
    invoke-static {v13}, Lkh;->ι(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v0

    .line 2070
    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 2071
    .line 2072
    .line 2073
    new-instance v0, Ljava/util/HashSet;

    .line 2074
    .line 2075
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 2076
    .line 2077
    .line 2078
    new-instance v1, Ljava/util/ArrayList;

    .line 2079
    .line 2080
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2081
    .line 2082
    .line 2083
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v2

    .line 2087
    :cond_58
    :goto_37
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2088
    .line 2089
    .line 2090
    move-result v3

    .line 2091
    if-eqz v3, :cond_59

    .line 2092
    .line 2093
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2094
    .line 2095
    .line 2096
    move-result-object v3

    .line 2097
    move-object v4, v3

    .line 2098
    check-cast v4, Ljava/lang/reflect/Method;

    .line 2099
    .line 2100
    invoke-static {v4}, Lkh;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v4

    .line 2104
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2105
    .line 2106
    .line 2107
    move-result v4

    .line 2108
    if-eqz v4, :cond_58

    .line 2109
    .line 2110
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2111
    .line 2112
    .line 2113
    goto :goto_37

    .line 2114
    :cond_59
    return-object v1

    .line 2115
    :pswitch_19
    move-object/from16 v19, v12

    .line 2116
    .line 2117
    check-cast v14, Lzg;

    .line 2118
    .line 2119
    check-cast v13, Lη;

    .line 2120
    .line 2121
    move-object/from16 v0, p1

    .line 2122
    .line 2123
    check-cast v0, Ljava/lang/Boolean;

    .line 2124
    .line 2125
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2126
    .line 2127
    .line 2128
    move-result v0

    .line 2129
    iget-object v1, v14, Lzg;->α:Lbh;

    .line 2130
    .line 2131
    sget-object v2, Lui1;->α:Ljava/lang/Object;

    .line 2132
    .line 2133
    iget-object v2, v1, Lbh;->ε:Ljava/lang/String;

    .line 2134
    .line 2135
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2136
    .line 2137
    const-string v4, "clean_misc_control_"

    .line 2138
    .line 2139
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2140
    .line 2141
    .line 2142
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2143
    .line 2144
    .line 2145
    const-string v2, "_enabled"

    .line 2146
    .line 2147
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2148
    .line 2149
    .line 2150
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2151
    .line 2152
    .line 2153
    move-result-object v3

    .line 2154
    invoke-static {v3, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 2155
    .line 2156
    .line 2157
    iget-object v0, v1, Lbh;->ε:Ljava/lang/String;

    .line 2158
    .line 2159
    invoke-static {v4, v0, v2}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v0

    .line 2163
    sget-object v1, Lug;->α:Ltg;

    .line 2164
    .line 2165
    const-string v1, "clean_misc_dialog"

    .line 2166
    .line 2167
    invoke-static {v0, v1}, Ltg;->Ω(Ljava/lang/String;Ljava/lang/String;)V

    .line 2168
    .line 2169
    .line 2170
    invoke-virtual {v13}, Lη;->invoke()Ljava/lang/Object;

    .line 2171
    .line 2172
    .line 2173
    return-object v19

    .line 2174
    :pswitch_1a
    check-cast v14, Laf;

    .line 2175
    .line 2176
    check-cast v13, Ljava/lang/ClassLoader;

    .line 2177
    .line 2178
    move-object/from16 v0, p1

    .line 2179
    .line 2180
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2181
    .line 2182
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2183
    .line 2184
    .line 2185
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 2186
    .line 2187
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2188
    .line 2189
    .line 2190
    new-instance v2, Lwe;

    .line 2191
    .line 2192
    const/4 v3, 0x5

    .line 2193
    invoke-direct {v2, v3}, Lwe;-><init>(I)V

    .line 2194
    .line 2195
    .line 2196
    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 2197
    .line 2198
    .line 2199
    move-result-object v0

    .line 2200
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2201
    .line 2202
    .line 2203
    move-result-object v2

    .line 2204
    :goto_38
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2205
    .line 2206
    .line 2207
    move-result v0

    .line 2208
    if-eqz v0, :cond_5e

    .line 2209
    .line 2210
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2211
    .line 2212
    .line 2213
    move-result-object v0

    .line 2214
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    .line 2215
    .line 2216
    :try_start_e
    invoke-virtual {v0, v13}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 2217
    .line 2218
    .line 2219
    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_c

    .line 2220
    goto :goto_39

    .line 2221
    :catchall_c
    move-exception v0

    .line 2222
    new-instance v3, Leo1;

    .line 2223
    .line 2224
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2225
    .line 2226
    .line 2227
    move-object v0, v3

    .line 2228
    :goto_39
    instance-of v3, v0, Leo1;

    .line 2229
    .line 2230
    if-eqz v3, :cond_5a

    .line 2231
    .line 2232
    const/4 v0, 0x0

    .line 2233
    :cond_5a
    check-cast v0, Ljava/lang/reflect/Method;

    .line 2234
    .line 2235
    if-nez v0, :cond_5c

    .line 2236
    .line 2237
    :cond_5b
    move-object/from16 p0, v2

    .line 2238
    .line 2239
    const/4 v2, 0x1

    .line 2240
    goto :goto_3b

    .line 2241
    :cond_5c
    sget-object v3, Laf;->α:Laf;

    .line 2242
    .line 2243
    invoke-static {v0}, Laf;->ζ(Ljava/lang/reflect/Method;)Z

    .line 2244
    .line 2245
    .line 2246
    move-result v3

    .line 2247
    if-eqz v3, :cond_5b

    .line 2248
    .line 2249
    const/4 v8, 0x1

    .line 2250
    invoke-virtual {v0, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 2251
    .line 2252
    .line 2253
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2254
    .line 2255
    .line 2256
    move-result-object v3

    .line 2257
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2258
    .line 2259
    .line 2260
    move-result-object v3

    .line 2261
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v7

    .line 2265
    invoke-static {v7, v0}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2266
    .line 2267
    .line 2268
    move-result-object v8

    .line 2269
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2270
    .line 2271
    .line 2272
    move-result-object v9

    .line 2273
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2274
    .line 2275
    .line 2276
    new-instance v11, Ljava/util/ArrayList;

    .line 2277
    .line 2278
    array-length v12, v9

    .line 2279
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 2280
    .line 2281
    .line 2282
    array-length v12, v9

    .line 2283
    const/4 v15, 0x0

    .line 2284
    :goto_3a
    if-ge v15, v12, :cond_5d

    .line 2285
    .line 2286
    aget-object v10, v9, v15

    .line 2287
    .line 2288
    move-object/from16 p0, v2

    .line 2289
    .line 2290
    const/4 v2, 0x1

    .line 2291
    invoke-static {v10, v11, v15, v2}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 2292
    .line 2293
    .line 2294
    move-result v15

    .line 2295
    move-object/from16 v2, p0

    .line 2296
    .line 2297
    goto :goto_3a

    .line 2298
    :cond_5d
    move-object/from16 p0, v2

    .line 2299
    .line 2300
    const/4 v2, 0x1

    .line 2301
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2302
    .line 2303
    .line 2304
    move-result v9

    .line 2305
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 2306
    .line 2307
    .line 2308
    const/16 v27, 0x0

    .line 2309
    .line 2310
    const/16 v28, 0x3e

    .line 2311
    .line 2312
    const-string v23, ","

    .line 2313
    .line 2314
    const/16 v24, 0x0

    .line 2315
    .line 2316
    const/16 v25, 0x0

    .line 2317
    .line 2318
    const/16 v26, 0x0

    .line 2319
    .line 2320
    move-object/from16 v22, v11

    .line 2321
    .line 2322
    invoke-static/range {v22 .. v28}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 2323
    .line 2324
    .line 2325
    move-result-object v9

    .line 2326
    invoke-static {v3, v6, v7, v5, v9}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2327
    .line 2328
    .line 2329
    move-result-object v3

    .line 2330
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2331
    .line 2332
    .line 2333
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2334
    .line 2335
    .line 2336
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2337
    .line 2338
    .line 2339
    move-result-object v3

    .line 2340
    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2341
    .line 2342
    .line 2343
    :goto_3b
    move-object/from16 v2, p0

    .line 2344
    .line 2345
    goto/16 :goto_38

    .line 2346
    .line 2347
    :cond_5e
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 2348
    .line 2349
    .line 2350
    move-result-object v0

    .line 2351
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2352
    .line 2353
    .line 2354
    check-cast v0, Ljava/lang/Iterable;

    .line 2355
    .line 2356
    new-instance v1, Lze;

    .line 2357
    .line 2358
    const/4 v2, 0x0

    .line 2359
    invoke-direct {v1, v14, v2}, Lze;-><init>(Laf;I)V

    .line 2360
    .line 2361
    .line 2362
    invoke-static {v0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2363
    .line 2364
    .line 2365
    move-result-object v0

    .line 2366
    invoke-static {v0}, Laf;->β(Ljava/util/List;)Ljava/util/ArrayList;

    .line 2367
    .line 2368
    .line 2369
    move-result-object v0

    .line 2370
    return-object v0

    .line 2371
    :pswitch_1b
    move-object/from16 v19, v12

    .line 2372
    .line 2373
    check-cast v14, Lr81;

    .line 2374
    .line 2375
    check-cast v13, Lkn0;

    .line 2376
    .line 2377
    move-object/from16 v0, p1

    .line 2378
    .line 2379
    check-cast v0, Laq0;

    .line 2380
    .line 2381
    invoke-virtual {v0}, Laq0;->γ()V

    .line 2382
    .line 2383
    .line 2384
    iget-object v1, v14, Lr81;->α:Lz91;

    .line 2385
    .line 2386
    const/4 v3, 0x0

    .line 2387
    invoke-static {v0, v1, v13, v3, v2}, Lcw;->г(Lcw;Lz91;Lkn0;Ly02;I)V

    .line 2388
    .line 2389
    .line 2390
    return-object v19

    .line 2391
    :pswitch_1c
    move-object/from16 v19, v12

    .line 2392
    .line 2393
    const/4 v3, 0x0

    .line 2394
    check-cast v14, Lx2;

    .line 2395
    .line 2396
    check-cast v13, Lkn0;

    .line 2397
    .line 2398
    move-object/from16 v0, p1

    .line 2399
    .line 2400
    check-cast v0, Laq0;

    .line 2401
    .line 2402
    invoke-virtual {v0}, Laq0;->γ()V

    .line 2403
    .line 2404
    .line 2405
    invoke-static {v0, v14, v13, v3, v2}, Lcw;->г(Lcw;Lz91;Lkn0;Ly02;I)V

    .line 2406
    .line 2407
    .line 2408
    return-object v19

    .line 2409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
