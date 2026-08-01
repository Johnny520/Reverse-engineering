.class public abstract Lbsh/飘花落叶言子苏世哲楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:Lbsh/Primitive;

.field public static final 飘花落叶言子楪世苏兰哲:Lbsh/Primitive;

.field public static final 飘花落叶言子楪世苏哲兰:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lbsh/Types$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lbsh/Types$1;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 11
    .line 12
    new-instance v0, Lbsh/Primitive;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1}, Lbsh/Primitive;-><init>(I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:Lbsh/Primitive;

    .line 19
    .line 20
    new-instance v0, Lbsh/Primitive;

    .line 21
    .line 22
    const/4 v1, -0x1

    .line 23
    invoke-direct {v0, v1}, Lbsh/Primitive;-><init>(I)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰:Lbsh/Primitive;

    .line 27
    .line 28
    return-void
.end method

.method public static 飘花落叶言子世楪苏哲兰(Ljava/lang/Class;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/Class;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, "[]"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static 飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;
    .locals 2

    .line 1
    if-nez p0, :cond_3

    .line 2
    .line 3
    if-nez p2, :cond_2

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_1

    .line 10
    .line 11
    const-class p0, Ljava/math/BigInteger;

    .line 12
    .line 13
    if-eq p1, p0, :cond_1

    .line 14
    .line 15
    const-class p0, Ljava/math/BigDecimal;

    .line 16
    .line 17
    if-ne p1, p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {p1}, Lbsh/Primitive;->isWrapperType(Ljava/lang/Class;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    sget-object p0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    :goto_0
    invoke-static {p1}, Lbsh/Primitive;->getDefaultValue(Ljava/lang/Class;)Lbsh/Primitive;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string p1, "Cast error: null fromValue for toType: "

    .line 39
    .line 40
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_3
    const/4 v0, 0x0

    .line 50
    invoke-static {p0, v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Z)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {p1, v1, p0, p2, v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;IZ)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static 飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;IZ)Ljava/lang/Object;
    .locals 11

    .line 1
    if-eqz p0, :cond_36

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_d

    .line 6
    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    if-eqz p1, :cond_19

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_19

    .line 17
    .line 18
    const-class v2, Ljava/util/Collection;

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_19

    .line 27
    .line 28
    :cond_1
    if-eqz p4, :cond_2

    .line 29
    .line 30
    goto/16 :goto_e

    .line 31
    .line 32
    :cond_2
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-eqz p3, :cond_7

    .line 37
    .line 38
    const-class p3, Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {p3, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-nez p3, :cond_5

    .line 45
    .line 46
    const-class p3, Ljava/util/Queue;

    .line 47
    .line 48
    if-ne p3, p0, :cond_3

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    const-class p3, Ljava/util/ArrayDeque;

    .line 52
    .line 53
    invoke-virtual {p0, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    if-eqz p3, :cond_4

    .line 58
    .line 59
    new-instance p0, Ljava/util/ArrayDeque;

    .line 60
    .line 61
    invoke-static {p2, v1, v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, [Ljava/lang/Object;

    .line 66
    .line 67
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {p0, p1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_4
    const-class p3, Ljava/util/LinkedHashSet;

    .line 76
    .line 77
    invoke-virtual {p0, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    if-eqz p3, :cond_7

    .line 82
    .line 83
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 84
    .line 85
    invoke-static {p2, v1, v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, [Ljava/lang/Object;

    .line 90
    .line 91
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-direct {p0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 96
    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_5
    :goto_0
    const-class p3, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {p0, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    if-eqz p3, :cond_6

    .line 106
    .line 107
    new-instance p0, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-static {p2, v1, v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, [Ljava/lang/Object;

    .line 114
    .line 115
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 120
    .line 121
    .line 122
    return-object p0

    .line 123
    :cond_6
    const-class p3, Ljava/util/LinkedList;

    .line 124
    .line 125
    invoke-virtual {p0, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    if-eqz p3, :cond_7

    .line 130
    .line 131
    new-instance p0, Ljava/util/LinkedList;

    .line 132
    .line 133
    invoke-static {p2, v1, v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, [Ljava/lang/Object;

    .line 138
    .line 139
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-direct {p0, p1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 144
    .line 145
    .line 146
    return-object p0

    .line 147
    :cond_7
    invoke-static {p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    const-class p3, Ljava/util/Map;

    .line 152
    .line 153
    invoke-virtual {p3, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 154
    .line 155
    .line 156
    move-result p3

    .line 157
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 158
    .line 159
    const-wide/16 v4, 0x0

    .line 160
    .line 161
    const/4 p4, 0x0

    .line 162
    const-class v6, Ljava/util/Map$Entry;

    .line 163
    .line 164
    if-eqz p3, :cond_c

    .line 165
    .line 166
    invoke-virtual {v6, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 167
    .line 168
    .line 169
    move-result p3

    .line 170
    if-eqz p3, :cond_9

    .line 171
    .line 172
    check-cast p2, [Ljava/util/Map$Entry;

    .line 173
    .line 174
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 175
    .line 176
    array-length p1, p2

    .line 177
    invoke-direct {p0, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 178
    .line 179
    .line 180
    array-length p1, p2

    .line 181
    :goto_1
    if-ge v0, p1, :cond_8

    .line 182
    .line 183
    aget-object p3, p2, v0

    .line 184
    .line 185
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p4

    .line 189
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p3

    .line 193
    invoke-interface {p0, p4, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    add-int/lit8 v0, v0, 0x1

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_8
    return-object p0

    .line 200
    :cond_9
    const-class p3, Ljava/util/LinkedHashMap;

    .line 201
    .line 202
    invoke-virtual {p0, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 203
    .line 204
    .line 205
    move-result p3

    .line 206
    if-eqz p3, :cond_c

    .line 207
    .line 208
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 209
    .line 210
    .line 211
    move-result p0

    .line 212
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 213
    .line 214
    int-to-double v6, p0

    .line 215
    add-double/2addr v6, v4

    .line 216
    div-double/2addr v6, v2

    .line 217
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 218
    .line 219
    .line 220
    move-result-wide v1

    .line 221
    double-to-int p3, v1

    .line 222
    invoke-direct {p1, p3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 223
    .line 224
    .line 225
    :goto_2
    if-ge v0, p0, :cond_b

    .line 226
    .line 227
    invoke-static {p2, v0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p3

    .line 231
    add-int/lit8 v1, v0, 0x1

    .line 232
    .line 233
    if-ge v1, p0, :cond_a

    .line 234
    .line 235
    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    goto :goto_3

    .line 240
    :cond_a
    move-object v1, p4

    .line 241
    :goto_3
    invoke-interface {p1, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    add-int/lit8 v0, v0, 0x2

    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_b
    return-object p1

    .line 248
    :cond_c
    invoke-static {p2}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)[I

    .line 249
    .line 250
    .line 251
    move-result-object p3

    .line 252
    aget v7, p3, v0

    .line 253
    .line 254
    if-nez v7, :cond_d

    .line 255
    .line 256
    invoke-static {p0, p3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    return-object p0

    .line 261
    :cond_d
    if-eq v1, p1, :cond_e

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_e
    move-object v9, p4

    .line 265
    move v8, v0

    .line 266
    :goto_4
    if-ge v8, v7, :cond_10

    .line 267
    .line 268
    invoke-static {p2, v0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v10

    .line 272
    invoke-static {v10, v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Z)Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    invoke-static {v9, v10}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    move-result-object v9

    .line 280
    if-ne v1, v9, :cond_f

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_f
    add-int/lit8 v8, v8, 0x1

    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_10
    :goto_5
    if-eqz v9, :cond_11

    .line 287
    .line 288
    if-eq v9, p1, :cond_11

    .line 289
    .line 290
    move-object p1, v9

    .line 291
    :cond_11
    :goto_6
    invoke-virtual {v6, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    if-eqz v1, :cond_18

    .line 296
    .line 297
    invoke-virtual {v6, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 298
    .line 299
    .line 300
    move-result p0

    .line 301
    if-eqz p0, :cond_13

    .line 302
    .line 303
    const-class p0, Lbsh/Types$MapEntry;

    .line 304
    .line 305
    if-eq p0, p1, :cond_12

    .line 306
    .line 307
    return-object p2

    .line 308
    :cond_12
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 309
    .line 310
    .line 311
    move-result p0

    .line 312
    new-array p0, p0, [Ljava/util/Map$Entry;

    .line 313
    .line 314
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    invoke-static {v6, p0, p1}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    return-object p0

    .line 322
    :cond_13
    const/4 p0, 0x1

    .line 323
    if-ne v7, p0, :cond_14

    .line 324
    .line 325
    new-instance p0, Lbsh/Types$MapEntry;

    .line 326
    .line 327
    invoke-static {p2, v0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    invoke-direct {p0, p1, p4}, Lbsh/Types$MapEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    return-object p0

    .line 335
    :cond_14
    const/4 p1, 0x2

    .line 336
    if-ne v7, p1, :cond_15

    .line 337
    .line 338
    new-instance p1, Lbsh/Types$MapEntry;

    .line 339
    .line 340
    invoke-static {p2, v0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object p3

    .line 344
    invoke-static {p2, p0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    invoke-direct {p1, p3, p0}, Lbsh/Types$MapEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    return-object p1

    .line 352
    :cond_15
    int-to-double p0, v7

    .line 353
    add-double/2addr p0, v4

    .line 354
    div-double/2addr p0, v2

    .line 355
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    .line 356
    .line 357
    .line 358
    move-result-wide p0

    .line 359
    double-to-int p0, p0

    .line 360
    new-array p0, p0, [Ljava/util/Map$Entry;

    .line 361
    .line 362
    move p1, v0

    .line 363
    :goto_7
    if-ge v0, v7, :cond_17

    .line 364
    .line 365
    add-int/lit8 p3, p1, 0x1

    .line 366
    .line 367
    new-instance v1, Lbsh/Types$MapEntry;

    .line 368
    .line 369
    invoke-static {p2, v0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    add-int/lit8 v3, v0, 0x1

    .line 374
    .line 375
    if-ge v3, v7, :cond_16

    .line 376
    .line 377
    invoke-static {p2, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    goto :goto_8

    .line 382
    :cond_16
    move-object v3, p4

    .line 383
    :goto_8
    invoke-direct {v1, v2, v3}, Lbsh/Types$MapEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    aput-object v1, p0, p1

    .line 387
    .line 388
    add-int/lit8 v0, v0, 0x2

    .line 389
    .line 390
    move p1, p3

    .line 391
    goto :goto_7

    .line 392
    :cond_17
    return-object p0

    .line 393
    :cond_18
    invoke-static {p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    invoke-static {p0, p3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object p2

    .line 405
    invoke-static {p0, p1, p2}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    return-object p1

    .line 409
    :cond_19
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    const-string v3, "[-+0-9.]*"

    .line 414
    .line 415
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 416
    .line 417
    if-eqz v2, :cond_23

    .line 418
    .line 419
    if-eq p1, v4, :cond_21

    .line 420
    .line 421
    if-eqz p1, :cond_21

    .line 422
    .line 423
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-eqz v0, :cond_1a

    .line 428
    .line 429
    goto :goto_a

    .line 430
    :cond_1a
    invoke-static {p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/Class;)Z

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    if-nez v0, :cond_1b

    .line 435
    .line 436
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-virtual {v0, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    if-eqz v0, :cond_1c

    .line 445
    .line 446
    :cond_1b
    invoke-static {p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/Class;)Z

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    if-nez v0, :cond_1f

    .line 451
    .line 452
    :cond_1c
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 453
    .line 454
    if-ne p0, v0, :cond_1d

    .line 455
    .line 456
    goto :goto_9

    .line 457
    :cond_1d
    if-eqz p4, :cond_1e

    .line 458
    .line 459
    goto/16 :goto_b

    .line 460
    .line 461
    :cond_1e
    invoke-static {p0}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    invoke-static {p1}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object p1

    .line 469
    invoke-static {p0, p1, p2, p3}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lbsh/UtilEvalError;

    .line 470
    .line 471
    .line 472
    move-result-object p0

    .line 473
    throw p0

    .line 474
    :cond_1f
    :goto_9
    if-eqz p4, :cond_20

    .line 475
    .line 476
    goto/16 :goto_e

    .line 477
    .line 478
    :cond_20
    invoke-static {p0, p2}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    invoke-static {p1, p0}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object p0

    .line 486
    return-object p0

    .line 487
    :cond_21
    :goto_a
    const-class v0, Lbsh/Primitive;

    .line 488
    .line 489
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    if-nez v0, :cond_22

    .line 494
    .line 495
    invoke-static {p2, p1}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object p2

    .line 499
    :cond_22
    check-cast p2, Lbsh/Primitive;

    .line 500
    .line 501
    invoke-static {p0, p1, p2, p4, p3}, Lbsh/Primitive;->castPrimitive(Ljava/lang/Class;Ljava/lang/Class;Lbsh/Primitive;ZI)Lbsh/Primitive;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    return-object p0

    .line 506
    :cond_23
    if-eq p1, v4, :cond_30

    .line 507
    .line 508
    if-eqz p1, :cond_30

    .line 509
    .line 510
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    if-nez v2, :cond_30

    .line 515
    .line 516
    const-class v2, Ljava/lang/Boolean;

    .line 517
    .line 518
    if-eq p0, v2, :cond_30

    .line 519
    .line 520
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    invoke-virtual {v2, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 525
    .line 526
    .line 527
    move-result v2

    .line 528
    if-eqz v2, :cond_24

    .line 529
    .line 530
    invoke-static {p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/Class;)Z

    .line 531
    .line 532
    .line 533
    move-result v2

    .line 534
    if-eqz v2, :cond_24

    .line 535
    .line 536
    goto/16 :goto_c

    .line 537
    .line 538
    :cond_24
    invoke-static {p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;)Z

    .line 539
    .line 540
    .line 541
    move-result v1

    .line 542
    if-eqz v1, :cond_27

    .line 543
    .line 544
    instance-of v1, p2, Lbsh/飘花落叶言子楪哲世苏兰;

    .line 545
    .line 546
    if-eqz v1, :cond_27

    .line 547
    .line 548
    if-eqz p4, :cond_25

    .line 549
    .line 550
    goto/16 :goto_e

    .line 551
    .line 552
    :cond_25
    check-cast p2, Lbsh/飘花落叶言子楪哲世苏兰;

    .line 553
    .line 554
    iget-object p1, p2, Lbsh/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 555
    .line 556
    const/4 p3, 0x4

    .line 557
    invoke-static {p1, p0, p3}, Lbsh/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;I)Z

    .line 558
    .line 559
    .line 560
    move-result p1

    .line 561
    if-eqz p1, :cond_26

    .line 562
    .line 563
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 564
    .line 565
    .line 566
    move-result-object p1

    .line 567
    filled-new-array {p0}, [Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    move-result-object p0

    .line 571
    new-instance p3, Lbsh/飘花落叶言子楪苏哲兰世;

    .line 572
    .line 573
    invoke-direct {p3, p2, v0}, Lbsh/飘花落叶言子楪苏哲兰世;-><init>(Ljava/lang/Object;I)V

    .line 574
    .line 575
    .line 576
    invoke-static {p1, p0, p3}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 580
    return-object p0

    .line 581
    :catchall_0
    move-exception p0

    .line 582
    new-instance p1, Lbsh/UtilEvalError;

    .line 583
    .line 584
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object p2

    .line 588
    new-instance p3, Ljava/lang/StringBuilder;

    .line 589
    .line 590
    const-string p4, "Can\'t create a instance for the generate class for the BshLambda: "

    .line 591
    .line 592
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object p2

    .line 602
    invoke-direct {p1, p2, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 603
    .line 604
    .line 605
    throw p1

    .line 606
    :cond_26
    new-instance p1, Lbsh/UtilEvalError;

    .line 607
    .line 608
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object p0

    .line 612
    const-string p2, "This BshLambda can\'t be converted to "

    .line 613
    .line 614
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object p0

    .line 618
    invoke-direct {p1, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    throw p1

    .line 622
    :cond_27
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 623
    .line 624
    .line 625
    move-result v0

    .line 626
    if-eqz v0, :cond_29

    .line 627
    .line 628
    if-eqz p4, :cond_28

    .line 629
    .line 630
    goto/16 :goto_e

    .line 631
    .line 632
    :cond_28
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 633
    .line 634
    .line 635
    move-result p3

    .line 636
    if-eqz p3, :cond_37

    .line 637
    .line 638
    invoke-static {p1}, Ljava/lang/reflect/Proxy;->isProxyClass(Ljava/lang/Class;)Z

    .line 639
    .line 640
    .line 641
    move-result p1

    .line 642
    if-nez p1, :cond_37

    .line 643
    .line 644
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object p0

    .line 648
    invoke-static {p2, p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;

    .line 649
    .line 650
    .line 651
    move-result-object p0

    .line 652
    return-object p0

    .line 653
    :cond_29
    const-class v0, Lbsh/This;

    .line 654
    .line 655
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v1

    .line 659
    if-eqz v1, :cond_2a

    .line 660
    .line 661
    move-object v1, p2

    .line 662
    check-cast v1, Lbsh/This;

    .line 663
    .line 664
    invoke-virtual {v1}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    iget-object v1, v1, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 669
    .line 670
    if-ne v1, p0, :cond_2a

    .line 671
    .line 672
    if-eqz p4, :cond_37

    .line 673
    .line 674
    goto/16 :goto_e

    .line 675
    .line 676
    :cond_2a
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 677
    .line 678
    .line 679
    move-result v1

    .line 680
    if-eqz v1, :cond_2c

    .line 681
    .line 682
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 683
    .line 684
    .line 685
    move-result v0

    .line 686
    if-eqz v0, :cond_2c

    .line 687
    .line 688
    if-eqz p4, :cond_2b

    .line 689
    .line 690
    goto/16 :goto_e

    .line 691
    .line 692
    :cond_2b
    check-cast p2, Lbsh/This;

    .line 693
    .line 694
    invoke-virtual {p2, p0}, Lbsh/This;->getInterface(Ljava/lang/Class;)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object p0

    .line 698
    return-object p0

    .line 699
    :cond_2c
    invoke-static {p0}, Lbsh/Primitive;->isWrapperType(Ljava/lang/Class;)Z

    .line 700
    .line 701
    .line 702
    move-result v0

    .line 703
    if-eqz v0, :cond_2e

    .line 704
    .line 705
    invoke-static {p1}, Lbsh/Primitive;->isWrapperType(Ljava/lang/Class;)Z

    .line 706
    .line 707
    .line 708
    move-result v0

    .line 709
    if-eqz v0, :cond_2e

    .line 710
    .line 711
    if-eqz p4, :cond_2d

    .line 712
    .line 713
    goto :goto_e

    .line 714
    :cond_2d
    invoke-static {p0, p2}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object p0

    .line 718
    return-object p0

    .line 719
    :cond_2e
    if-eqz p4, :cond_2f

    .line 720
    .line 721
    :goto_b
    sget-object p0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰:Lbsh/Primitive;

    .line 722
    .line 723
    return-object p0

    .line 724
    :cond_2f
    invoke-static {p0}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;)Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object p0

    .line 728
    invoke-static {p1}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;)Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object p1

    .line 732
    invoke-static {p0, p1, p2, p3}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lbsh/UtilEvalError;

    .line 733
    .line 734
    .line 735
    move-result-object p0

    .line 736
    throw p0

    .line 737
    :cond_30
    :goto_c
    invoke-static {p0}, Lbsh/Primitive;->isWrapperType(Ljava/lang/Class;)Z

    .line 738
    .line 739
    .line 740
    move-result v0

    .line 741
    if-eqz v0, :cond_32

    .line 742
    .line 743
    if-eq p1, v4, :cond_32

    .line 744
    .line 745
    if-eqz p1, :cond_32

    .line 746
    .line 747
    if-eqz p4, :cond_31

    .line 748
    .line 749
    goto :goto_e

    .line 750
    :cond_31
    invoke-static {p0}, Lbsh/Primitive;->unboxType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 751
    .line 752
    .line 753
    move-result-object p0

    .line 754
    invoke-static {p0, p2}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object p0

    .line 758
    return-object p0

    .line 759
    :cond_32
    if-ne p0, v1, :cond_34

    .line 760
    .line 761
    if-eq p1, v4, :cond_34

    .line 762
    .line 763
    if-eqz p1, :cond_34

    .line 764
    .line 765
    if-eqz p4, :cond_33

    .line 766
    .line 767
    goto :goto_e

    .line 768
    :cond_33
    invoke-static {p2}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object p0

    .line 772
    return-object p0

    .line 773
    :cond_34
    if-eqz p1, :cond_35

    .line 774
    .line 775
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 776
    .line 777
    .line 778
    move-result v0

    .line 779
    if-nez v0, :cond_35

    .line 780
    .line 781
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 782
    .line 783
    .line 784
    move-result v0

    .line 785
    if-eqz v0, :cond_35

    .line 786
    .line 787
    if-eqz p4, :cond_37

    .line 788
    .line 789
    goto :goto_e

    .line 790
    :cond_35
    check-cast p2, Lbsh/Primitive;

    .line 791
    .line 792
    invoke-static {p0, p1, p2, p4, p3}, Lbsh/Primitive;->castPrimitive(Ljava/lang/Class;Ljava/lang/Class;Lbsh/Primitive;ZI)Lbsh/Primitive;

    .line 793
    .line 794
    .line 795
    move-result-object p0

    .line 796
    return-object p0

    .line 797
    :cond_36
    :goto_d
    if-eqz p4, :cond_37

    .line 798
    .line 799
    :goto_e
    sget-object p0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:Lbsh/Primitive;

    .line 800
    .line 801
    return-object p0

    .line 802
    :cond_37
    return-object p2
.end method

.method public static 飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lbsh/UtilEvalError;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, " to "

    .line 3
    .line 4
    const-string v2, "\""

    .line 5
    .line 6
    const-string v3, " with value \""

    .line 7
    .line 8
    const-string v4, ""

    .line 9
    .line 10
    if-ne p3, v0, :cond_1

    .line 11
    .line 12
    new-instance p3, Lbsh/UtilEvalError;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v5, "Cannot assign "

    .line 17
    .line 18
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    :goto_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-direct {p3, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object p3

    .line 59
    :cond_1
    new-instance p3, Ljava/lang/ClassCastException;

    .line 60
    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v5, "Cannot cast "

    .line 64
    .line 65
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    if-nez p2, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-direct {p3, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    new-instance p0, Lbsh/UtilTargetError;

    .line 106
    .line 107
    invoke-direct {p0, p3}, Lbsh/UtilTargetError;-><init>(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    return-object p0
.end method

.method public static 飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)I
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

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
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/16 v0, 0x5b

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    add-int/lit8 p0, p0, 0x1

    .line 21
    .line 22
    return p0

    .line 23
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public static 飘花落叶言子楪世苏哲兰([Ljava/lang/Class;[Ljava/lang/Class;)Z
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    array-length v1, p1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v2

    .line 7
    :cond_0
    move v0, v2

    .line 8
    :goto_0
    array-length v1, p0

    .line 9
    if-ge v0, v1, :cond_2

    .line 10
    .line 11
    aget-object v1, p0, v0

    .line 12
    .line 13
    aget-object v3, p1, v0

    .line 14
    .line 15
    if-eq v1, v3, :cond_1

    .line 16
    .line 17
    return v2

    .line 18
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    const/4 p0, 0x1

    .line 22
    return p0
.end method

.method public static 飘花落叶言子楪兰世哲苏(Ljava/lang/Class;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lbsh/Primitive;->boxType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v0, p0

    .line 13
    :goto_0
    const-class v1, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_3

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-static {p0}, Lbsh/Primitive;->boxType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :cond_1
    const-class v0, Ljava/lang/Character;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 43
    return p0
.end method

.method public static 飘花落叶言子楪兰世苏哲(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-class v1, Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne p0, v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    if-nez p1, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_2

    .line 24
    .line 25
    return v2

    .line 26
    :cond_2
    return v0

    .line 27
    :cond_3
    const-class v0, Ljava/lang/Number;

    .line 28
    .line 29
    if-ne p0, v0, :cond_4

    .line 30
    .line 31
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    if-eq p1, v0, :cond_4

    .line 34
    .line 35
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    if-eq p1, v0, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    sget-object v0, Lbsh/Primitive;->wrapperMap:Ljava/util/Map;

    .line 41
    .line 42
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-ne v0, p1, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    invoke-static {p0, p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0
.end method

.method public static 飘花落叶言子楪兰哲世苏([Ljava/lang/Class;[Ljava/lang/Class;I)Z
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eq p2, v0, :cond_0

    .line 4
    .line 5
    array-length v0, p0

    .line 6
    array-length v2, p1

    .line 7
    if-eq v0, v2, :cond_0

    .line 8
    .line 9
    return v1

    .line 10
    :cond_0
    move v0, v1

    .line 11
    :goto_0
    array-length v2, p0

    .line 12
    if-ge v0, v2, :cond_2

    .line 13
    .line 14
    aget-object v2, p0, v0

    .line 15
    .line 16
    aget-object v3, p1, v0

    .line 17
    .line 18
    invoke-static {v2, v3, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/Class;I)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public static 飘花落叶言子楪兰哲苏世([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eq p2, v0, :cond_0

    .line 4
    .line 5
    array-length v0, p0

    .line 6
    array-length v2, p1

    .line 7
    if-eq v0, v2, :cond_0

    .line 8
    .line 9
    return v1

    .line 10
    :cond_0
    move v0, v1

    .line 11
    :goto_0
    array-length v2, p0

    .line 12
    if-ge v0, v2, :cond_2

    .line 13
    .line 14
    aget-object v2, p0, v0

    .line 15
    .line 16
    aget-object v3, p1, v0

    .line 17
    .line 18
    invoke-static {v2, v3, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public static 飘花落叶言子楪兰苏世哲(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of p0, p0, Ljava/lang/Character;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public static 飘花落叶言子楪兰苏哲世(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-class v0, Ljava/util/Map$Entry;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public static 飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    invoke-static {p0, p1, v0, v1, v1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;IZ)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:Lbsh/Primitive;
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :catch_0
    move-exception p0

    .line 15
    const-string p1, "err in cast check: "

    .line 16
    .line 17
    invoke-static {p1, p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public static 飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Type;Ljava/lang/Class;I)Z
    .locals 6

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0, p1, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Type;Ljava/lang/Class;I)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0, p1, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Type;Ljava/lang/Class;I)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    array-length v0, p0

    .line 38
    move v3, v2

    .line 39
    :goto_0
    if-ge v3, v0, :cond_3

    .line 40
    .line 41
    aget-object v4, p0, v3

    .line 42
    .line 43
    invoke-static {v4, p1, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Type;Ljava/lang/Class;I)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    return v2

    .line 50
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return v1

    .line 54
    :cond_4
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 55
    .line 56
    if-eqz v0, :cond_9

    .line 57
    .line 58
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 59
    .line 60
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    array-length v3, v0

    .line 65
    move v4, v2

    .line 66
    :goto_1
    if-ge v4, v3, :cond_6

    .line 67
    .line 68
    aget-object v5, v0, v4

    .line 69
    .line 70
    invoke-static {v5, p1, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Type;Ljava/lang/Class;I)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-nez v5, :cond_5

    .line 75
    .line 76
    return v2

    .line 77
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_6
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    array-length v0, p0

    .line 85
    move v3, v2

    .line 86
    :goto_2
    if-ge v3, v0, :cond_8

    .line 87
    .line 88
    aget-object v4, p0, v3

    .line 89
    .line 90
    invoke-static {p1, v4, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-nez v4, :cond_7

    .line 95
    .line 96
    return v2

    .line 97
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_8
    return v1

    .line 101
    :cond_9
    if-nez p1, :cond_a

    .line 102
    .line 103
    return v1

    .line 104
    :cond_a
    return v2
.end method

.method public static 飘花落叶言子楪哲兰世苏(Ljava/lang/Class;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_3

    .line 11
    :cond_0
    const-class v1, Ljava/lang/FunctionalInterface;

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    array-length v1, p0

    .line 26
    move v3, v0

    .line 27
    move v4, v3

    .line 28
    :goto_0
    if-ge v3, v1, :cond_4

    .line 29
    .line 30
    aget-object v5, p0, v3

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_3

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-nez v6, :cond_3

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-nez v6, :cond_3

    .line 53
    .line 54
    :try_start_0
    const-class v6, Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v6, v7, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catch_0
    add-int/lit8 v5, v4, 0x1

    .line 69
    .line 70
    if-le v4, v2, :cond_2

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_2
    move v4, v5

    .line 74
    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    if-ne v4, v2, :cond_5

    .line 78
    .line 79
    :goto_2
    return v2

    .line 80
    :cond_5
    :goto_3
    return v0
.end method

.method public static 飘花落叶言子楪哲兰苏世(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    if-nez p1, :cond_2

    .line 7
    .line 8
    const-class p1, Ljava/lang/String;

    .line 9
    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v1

    .line 13
    :cond_1
    return v0

    .line 14
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_5

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_5

    .line 25
    .line 26
    if-ne p0, p1, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    sget-object v2, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {v2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_8

    .line 36
    .line 37
    invoke-interface {v2, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_8

    .line 42
    .line 43
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-ge p1, p0, :cond_4

    .line 64
    .line 65
    return v1

    .line 66
    :cond_4
    return v0

    .line 67
    :cond_5
    const-class v2, Ljava/math/BigInteger;

    .line 68
    .line 69
    if-eq p0, v2, :cond_6

    .line 70
    .line 71
    const-class v2, Ljava/math/BigDecimal;

    .line 72
    .line 73
    if-ne p0, v2, :cond_7

    .line 74
    .line 75
    :cond_6
    invoke-static {p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/Class;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_7

    .line 80
    .line 81
    return v1

    .line 82
    :cond_7
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-eqz p0, :cond_8

    .line 87
    .line 88
    return v1

    .line 89
    :cond_8
    return v0
.end method

.method public static 飘花落叶言子楪哲苏世兰(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    const-class v0, Ljava/util/Collection;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-class v0, Ljava/util/Map;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-class v0, Ljava/util/Map$Entry;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public static 飘花落叶言子楪哲苏兰世(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Float;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Ljava/lang/Double;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    instance-of p0, p0, Ljava/math/BigDecimal;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static 飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Class;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_5

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    sget-object v0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-lt v1, v0, :cond_2

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_2
    :goto_0
    return-object p1

    .line 51
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-class v0, Ljava/lang/Object;

    .line 56
    .line 57
    if-eqz p0, :cond_4

    .line 58
    .line 59
    if-eq v0, p0, :cond_4

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_4
    return-object v0

    .line 69
    :cond_5
    :goto_1
    return-object p0
.end method

.method public static 飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "$"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static 飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/Class;I)Z
    .locals 2

    .line 1
    invoke-static {p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p0, p1, p2}, Lbsh/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    if-eq p2, v1, :cond_4

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    if-eq p2, v0, :cond_3

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    if-eq p2, v0, :cond_2

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    if-ne p2, v0, :cond_1

    .line 25
    .line 26
    invoke-static {p1, p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_1
    const-string p0, "bad case"

    .line 32
    .line 33
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_3
    invoke-static {p1, p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :cond_4
    invoke-static {p1, p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0
.end method

.method public static 飘花落叶言子楪苏兰哲世(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z
    .locals 6

    .line 1
    instance-of v0, p1, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {p0, p1, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/Class;I)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p0, p1, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_1
    instance-of v0, p1, Ljava/lang/reflect/TypeVariable;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    check-cast p1, Ljava/lang/reflect/TypeVariable;

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    array-length v0, p1

    .line 40
    move v3, v2

    .line 41
    :goto_0
    if-ge v3, v0, :cond_3

    .line 42
    .line 43
    aget-object v4, p1, v3

    .line 44
    .line 45
    invoke-static {p0, v4, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    return v2

    .line 52
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    return v1

    .line 56
    :cond_4
    instance-of v0, p1, Ljava/lang/reflect/WildcardType;

    .line 57
    .line 58
    if-eqz v0, :cond_9

    .line 59
    .line 60
    check-cast p1, Ljava/lang/reflect/WildcardType;

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    array-length v3, v0

    .line 67
    move v4, v2

    .line 68
    :goto_1
    if-ge v4, v3, :cond_6

    .line 69
    .line 70
    aget-object v5, v0, v4

    .line 71
    .line 72
    invoke-static {p0, v5, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-nez v5, :cond_5

    .line 77
    .line 78
    return v2

    .line 79
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_6
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    array-length v0, p1

    .line 87
    move v3, v2

    .line 88
    :goto_2
    if-ge v3, v0, :cond_8

    .line 89
    .line 90
    aget-object v4, p1, v3

    .line 91
    .line 92
    invoke-static {v4, p0, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Type;Ljava/lang/Class;I)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-nez v4, :cond_7

    .line 97
    .line 98
    return v2

    .line 99
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_8
    return v1

    .line 103
    :cond_9
    if-nez p1, :cond_a

    .line 104
    .line 105
    return v1

    .line 106
    :cond_a
    return v2
.end method

.method public static 飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Z)Ljava/lang/Class;
    .locals 1

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 4
    .line 5
    if-ne v0, p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    instance-of v0, p0, Lbsh/Primitive;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    check-cast p0, Lbsh/Primitive;

    .line 15
    .line 16
    invoke-virtual {p0}, Lbsh/Primitive;->getType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    instance-of p1, p0, Lbsh/飘花落叶言子楪哲世苏兰;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    check-cast p0, Lbsh/飘花落叶言子楪哲世苏兰;

    .line 26
    .line 27
    iget-object p0, p0, Lbsh/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    invoke-static {p0}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public static 飘花落叶言子楪苏哲兰世([Ljava/lang/Object;)[Ljava/lang/Class;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲:[Ljava/lang/Class;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    array-length v0, p0

    .line 7
    new-array v0, v0, [Ljava/lang/Class;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    array-length v3, p0

    .line 12
    if-ge v2, v3, :cond_1

    .line 13
    .line 14
    aget-object v3, p0, v2

    .line 15
    .line 16
    invoke-static {v3, v1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Z)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    aput-object v3, v0, v2

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-object v0
.end method
