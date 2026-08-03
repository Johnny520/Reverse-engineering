.class public Lbsh/BshArray;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/BshArray$SteppedSubList;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(I)I
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/BshArray;->lambda$castArray$0(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static castArray(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

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
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    const-class v0, Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const-class v2, Ljava/lang/Object;

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    const-class v0, Ljava/util/Queue;

    .line 21
    .line 22
    if-ne v0, p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-class v0, Ljava/util/ArrayDeque;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    new-instance p0, Ljava/util/ArrayDeque;

    .line 34
    .line 35
    invoke-static {p2, v2, v1}, Lbsh/Types;->castObject(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, [Ljava/lang/Object;

    .line 40
    .line 41
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_1
    const-class v0, Ljava/util/LinkedHashSet;

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 58
    .line 59
    invoke-static {p2, v2, v1}, Lbsh/Types;->castObject(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, [Ljava/lang/Object;

    .line 64
    .line 65
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-direct {p0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 70
    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_2
    :goto_0
    const-class v0, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    new-instance p0, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-static {p2, v2, v1}, Lbsh/Types;->castObject(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, [Ljava/lang/Object;

    .line 88
    .line 89
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 94
    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_3
    const-class v0, Ljava/util/LinkedList;

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    new-instance p0, Ljava/util/LinkedList;

    .line 106
    .line 107
    invoke-static {p2, v2, v1}, Lbsh/Types;->castObject(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, [Ljava/lang/Object;

    .line 112
    .line 113
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-direct {p0, p1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 118
    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_4
    invoke-static {p1}, Lbsh/Types;->arrayElementType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    const-class v0, Ljava/util/Map;

    .line 126
    .line 127
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 132
    .line 133
    const-wide/16 v4, 0x0

    .line 134
    .line 135
    const/4 v6, 0x0

    .line 136
    const-class v7, Ljava/util/Map$Entry;

    .line 137
    .line 138
    if-eqz v0, :cond_8

    .line 139
    .line 140
    invoke-virtual {v7, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_5

    .line 145
    .line 146
    check-cast p2, [Ljava/util/Map$Entry;

    .line 147
    .line 148
    invoke-static {p2}, Lbsh/BshArray;->mapOfEntries([Ljava/util/Map$Entry;)Ljava/util/Map;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :cond_5
    const-class v0, Ljava/util/LinkedHashMap;

    .line 154
    .line 155
    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_8

    .line 160
    .line 161
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 166
    .line 167
    int-to-double v7, p0

    .line 168
    add-double/2addr v7, v4

    .line 169
    div-double/2addr v7, v2

    .line 170
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 171
    .line 172
    .line 173
    move-result-wide v2

    .line 174
    double-to-int v0, v2

    .line 175
    invoke-direct {p1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 176
    .line 177
    .line 178
    :goto_1
    if-ge v1, p0, :cond_7

    .line 179
    .line 180
    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    add-int/lit8 v2, v1, 0x1

    .line 185
    .line 186
    if-ge v2, p0, :cond_6

    .line 187
    .line 188
    invoke-static {p2, v2}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    goto :goto_2

    .line 193
    :cond_6
    move-object v2, v6

    .line 194
    :goto_2
    invoke-interface {p1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    add-int/lit8 v1, v1, 0x2

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_7
    return-object p1

    .line 201
    :cond_8
    invoke-static {p2}, Lbsh/BshArray;->dimensions(Ljava/lang/Object;)[I

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    aget v8, v0, v1

    .line 206
    .line 207
    if-nez v8, :cond_9

    .line 208
    .line 209
    invoke-static {p0, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    return-object p0

    .line 214
    :cond_9
    new-instance v9, Lbsh/c;

    .line 215
    .line 216
    invoke-direct {v9, v8}, Lbsh/c;-><init>(I)V

    .line 217
    .line 218
    .line 219
    invoke-static {p1, p2, v9}, Lbsh/BshArray;->commonType(Ljava/lang/Class;Ljava/lang/Object;Ljava/util/function/IntSupplier;)Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {v7, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    if-eqz v9, :cond_10

    .line 228
    .line 229
    invoke-virtual {v7, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 230
    .line 231
    .line 232
    move-result p0

    .line 233
    if-eqz p0, :cond_b

    .line 234
    .line 235
    const-class p0, Lbsh/Types$MapEntry;

    .line 236
    .line 237
    if-eq p0, p1, :cond_a

    .line 238
    .line 239
    return-object p2

    .line 240
    :cond_a
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 241
    .line 242
    .line 243
    move-result p0

    .line 244
    new-array p0, p0, [Ljava/util/Map$Entry;

    .line 245
    .line 246
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-static {v7, p0, p1}, Lbsh/BshArray;->copy(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    return-object p0

    .line 254
    :cond_b
    const/4 p0, 0x1

    .line 255
    if-ne v8, p0, :cond_c

    .line 256
    .line 257
    new-instance p0, Lbsh/Types$MapEntry;

    .line 258
    .line 259
    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-direct {p0, p1, v6}, Lbsh/Types$MapEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    return-object p0

    .line 267
    :cond_c
    const/4 p1, 0x2

    .line 268
    if-ne v8, p1, :cond_d

    .line 269
    .line 270
    new-instance p1, Lbsh/Types$MapEntry;

    .line 271
    .line 272
    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-static {p2, p0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    invoke-direct {p1, v0, p0}, Lbsh/Types$MapEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    return-object p1

    .line 284
    :cond_d
    int-to-double p0, v8

    .line 285
    add-double/2addr p0, v4

    .line 286
    div-double/2addr p0, v2

    .line 287
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    .line 288
    .line 289
    .line 290
    move-result-wide p0

    .line 291
    double-to-int p0, p0

    .line 292
    new-array p0, p0, [Ljava/util/Map$Entry;

    .line 293
    .line 294
    move p1, v1

    .line 295
    :goto_3
    if-ge v1, v8, :cond_f

    .line 296
    .line 297
    add-int/lit8 v0, p1, 0x1

    .line 298
    .line 299
    new-instance v2, Lbsh/Types$MapEntry;

    .line 300
    .line 301
    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    add-int/lit8 v4, v1, 0x1

    .line 306
    .line 307
    if-ge v4, v8, :cond_e

    .line 308
    .line 309
    invoke-static {p2, v4}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    goto :goto_4

    .line 314
    :cond_e
    move-object v4, v6

    .line 315
    :goto_4
    invoke-direct {v2, v3, v4}, Lbsh/Types$MapEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    aput-object v2, p0, p1

    .line 319
    .line 320
    add-int/lit8 v1, v1, 0x2

    .line 321
    .line 322
    move p1, v0

    .line 323
    goto :goto_3

    .line 324
    :cond_f
    return-object p0

    .line 325
    :cond_10
    invoke-static {p0}, Lbsh/Types;->arrayElementType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    invoke-static {p0, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p2

    .line 337
    invoke-static {p0, p1, p2}, Lbsh/BshArray;->copy(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    return-object p1
.end method

.method public static commonType(Ljava/lang/Class;Ljava/lang/Object;Ljava/util/function/IntSupplier;)Ljava/lang/Class;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/util/function/IntSupplier;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    if-eq v0, p0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    invoke-interface {p2}, Ljava/util/function/IntSupplier;->getAsInt()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v1

    .line 13
    :goto_0
    if-ge v3, p2, :cond_2

    .line 14
    .line 15
    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {v4}, Lbsh/Types;->getType(Ljava/lang/Object;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {v2, v4}, Lbsh/Types;->getCommonType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-ne v0, v2, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, p0, :cond_3

    .line 36
    .line 37
    return-object v2

    .line 38
    :cond_3
    :goto_2
    return-object p0
.end method

.method public static concat(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0}, Lbsh/Types;->arrayDimensions(Ljava/lang/Class;)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v1}, Lbsh/Types;->arrayDimensions(Ljava/lang/Class;)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    invoke-static {v0}, Lbsh/Types;->arrayElementType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v1}, Lbsh/Types;->arrayElementType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v0, v1}, Lbsh/Types;->getCommonType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {p0}, Lbsh/BshArray;->dimensions(Ljava/lang/Object;)[I

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    add-int/2addr v3, v2

    .line 44
    const/4 v2, 0x0

    .line 45
    aput v3, v1, v2

    .line 46
    .line 47
    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {v0, v1, p0}, Lbsh/BshArray;->copy(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_0
    new-instance v0, Lbsh/UtilEvalError;

    .line 60
    .line 61
    invoke-static {p0}, Lbsh/StringUtil;->typeString(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p1}, Lbsh/StringUtil;->typeString(Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v2, "Cannot concat arrays with inconsistent dimensions. Attempting to concat array of type "

    .line 72
    .line 73
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string p0, " with array of type "

    .line 80
    .line 81
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string p0, "."

    .line 88
    .line 89
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-direct {v0, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v0
.end method

.method public static concat(Ljava/util/List;Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;",
            "Ljava/util/List<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 100
    instance-of v0, p0, Ljava/util/Queue;

    if-eqz v0, :cond_0

    .line 101
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0, p0}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    .line 102
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 103
    :goto_0
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method private static varargs copy(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v1, p2, v0

    .line 3
    .line 4
    invoke-static {v1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    array-length v2, p2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-le v2, v3, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v2, v1

    .line 18
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-static {v4}, Lbsh/Types;->arrayDimensions(Ljava/lang/Class;)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-ne v4, v3, :cond_a

    .line 27
    .line 28
    move v3, v0

    .line 29
    move v4, v3

    .line 30
    move v5, v4

    .line 31
    :goto_1
    if-ge v3, v2, :cond_e

    .line 32
    .line 33
    aget-object v6, p2, v4

    .line 34
    .line 35
    add-int/lit8 v7, v5, 0x1

    .line 36
    .line 37
    invoke-static {v6, v5}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    :try_start_0
    invoke-static {v5, p0, v0}, Lbsh/Types;->castObject(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-static {v6}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    :catch_0
    sget-object v6, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    if-ne v6, p0, :cond_1

    .line 52
    .line 53
    check-cast v5, Ljava/lang/Byte;

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Byte;->byteValue()B

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-static {p1, v3, v5}, Ljava/lang/reflect/Array;->setByte(Ljava/lang/Object;IB)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    sget-object v6, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 64
    .line 65
    if-ne v6, p0, :cond_2

    .line 66
    .line 67
    check-cast v5, Ljava/lang/Short;

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/Short;->shortValue()S

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    invoke-static {p1, v3, v5}, Ljava/lang/reflect/Array;->setShort(Ljava/lang/Object;IS)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 78
    .line 79
    if-ne v6, p0, :cond_3

    .line 80
    .line 81
    check-cast v5, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    invoke-static {p1, v3, v5}, Ljava/lang/reflect/Array;->setInt(Ljava/lang/Object;II)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 92
    .line 93
    if-ne v6, p0, :cond_4

    .line 94
    .line 95
    check-cast v5, Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v5

    .line 101
    invoke-static {p1, v3, v5, v6}, Ljava/lang/reflect/Array;->setLong(Ljava/lang/Object;IJ)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 106
    .line 107
    if-ne v6, p0, :cond_5

    .line 108
    .line 109
    check-cast v5, Ljava/lang/Float;

    .line 110
    .line 111
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    invoke-static {p1, v3, v5}, Ljava/lang/reflect/Array;->setFloat(Ljava/lang/Object;IF)V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 120
    .line 121
    if-ne v6, p0, :cond_6

    .line 122
    .line 123
    check-cast v5, Ljava/lang/Double;

    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 126
    .line 127
    .line 128
    move-result-wide v5

    .line 129
    invoke-static {p1, v3, v5, v6}, Ljava/lang/reflect/Array;->setDouble(Ljava/lang/Object;ID)V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_6
    sget-object v6, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 134
    .line 135
    if-ne v6, p0, :cond_7

    .line 136
    .line 137
    check-cast v5, Ljava/lang/Character;

    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/lang/Character;->charValue()C

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    invoke-static {p1, v3, v5}, Ljava/lang/reflect/Array;->setChar(Ljava/lang/Object;IC)V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_7
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 148
    .line 149
    if-ne v6, p0, :cond_8

    .line 150
    .line 151
    check-cast v5, Ljava/lang/Boolean;

    .line 152
    .line 153
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    invoke-static {p1, v3, v5}, Ljava/lang/reflect/Array;->setBoolean(Ljava/lang/Object;IZ)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_8
    invoke-static {p1, v3, v5}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :goto_2
    if-ge v1, v2, :cond_9

    .line 165
    .line 166
    if-ne v7, v1, :cond_9

    .line 167
    .line 168
    add-int/lit8 v5, v4, 0x1

    .line 169
    .line 170
    array-length v6, p2

    .line 171
    if-ge v5, v6, :cond_9

    .line 172
    .line 173
    aget-object v1, p2, v5

    .line 174
    .line 175
    invoke-static {v1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    move v4, v5

    .line 180
    move v5, v0

    .line 181
    goto :goto_3

    .line 182
    :cond_9
    move v5, v7

    .line 183
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 184
    .line 185
    goto/16 :goto_1

    .line 186
    .line 187
    :cond_a
    move v3, v0

    .line 188
    move v4, v3

    .line 189
    move v5, v4

    .line 190
    :goto_4
    if-ge v3, v2, :cond_e

    .line 191
    .line 192
    if-ge v1, v2, :cond_b

    .line 193
    .line 194
    if-ne v4, v1, :cond_b

    .line 195
    .line 196
    add-int/lit8 v6, v5, 0x1

    .line 197
    .line 198
    array-length v7, p2

    .line 199
    if-ge v6, v7, :cond_b

    .line 200
    .line 201
    aget-object v1, p2, v6

    .line 202
    .line 203
    invoke-static {v1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    move v4, v0

    .line 208
    move v5, v6

    .line 209
    :cond_b
    aget-object v6, p2, v5

    .line 210
    .line 211
    add-int/lit8 v7, v4, 0x1

    .line 212
    .line 213
    invoke-static {v6, v4}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    if-nez v4, :cond_c

    .line 218
    .line 219
    const/4 v4, 0x0

    .line 220
    invoke-static {p1, v3, v4}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_c
    invoke-static {p1, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    invoke-static {v4}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    invoke-static {v6}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 233
    .line 234
    .line 235
    move-result v9

    .line 236
    if-eq v8, v9, :cond_d

    .line 237
    .line 238
    invoke-static {v4}, Lbsh/BshArray;->dimensions(Ljava/lang/Object;)[I

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    invoke-static {p0, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    invoke-static {p1, v3, v6}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :cond_d
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-static {p0, v6, v4}, Lbsh/BshArray;->copy(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 257
    .line 258
    move v4, v7

    .line 259
    goto :goto_4

    .line 260
    :cond_e
    return-void
.end method

.method public static dimensions(Ljava/lang/Object;)[I
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lbsh/Types;->arrayDimensions(Ljava/lang/Class;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-array v1, v0, [I

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    aput v2, v1, v3

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const/4 v2, 0x1

    .line 24
    :goto_0
    if-ge v2, v0, :cond_1

    .line 25
    .line 26
    invoke-static {p0, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    aput v4, v1, v2

    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    :goto_1
    return-object v1
.end method

.method public static getIndex(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, ", index="

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "getIndex: "

    .line 8
    .line 9
    filled-new-array {v2, p0, v0, v1}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    instance-of v0, p0, Ljava/util/List;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p0

    .line 21
    check-cast v0, Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {p0, p1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Lbsh/Types;->arrayElementType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v0, v1}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    return-object p0

    .line 47
    :goto_0
    instance-of v1, p0, Ljava/util/List;

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    check-cast p0, Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    :goto_1
    new-instance v1, Lbsh/UtilTargetError;

    .line 63
    .line 64
    const-string v2, "Index "

    .line 65
    .line 66
    const-string v3, " out-of-bounds for length "

    .line 67
    .line 68
    invoke-static {p1, v2, v3, p0}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-direct {v1, p0, v0}, Lbsh/UtilTargetError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw v1
.end method

.method private static synthetic lambda$castArray$0(I)I
    .locals 0

    .line 1
    return p0
.end method

.method private static varargs mapOfEntries([Ljava/util/Map$Entry;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/util/Map$Entry<",
            "**>;)",
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, p0, v2

    .line 12
    .line 13
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-object v0
.end method

.method public static repeat(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 4

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lbsh/Types;->arrayElementType(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ge p1, v1, :cond_0

    .line 50
    invoke-static {v0, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 51
    :cond_0
    invoke-static {p0}, Lbsh/BshArray;->dimensions(Ljava/lang/Object;)[I

    move-result-object v1

    .line 52
    aget v3, v1, v2

    mul-int/2addr p1, v3

    .line 53
    aput p1, v1, v2

    .line 54
    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    move v1, v2

    :goto_0
    if-ge v1, p1, :cond_1

    .line 55
    invoke-static {p0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v1, v3

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static repeat(Ljava/util/List;I)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ge p1, v0, :cond_1

    .line 3
    .line 4
    instance-of p0, p0, Ljava/util/Queue;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    new-instance p0, Ljava/util/LinkedList;

    .line 9
    .line 10
    invoke-direct {p0}, Ljava/util/LinkedList;-><init>()V

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    instance-of v1, p0, Ljava/util/Queue;

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    new-instance v1, Ljava/util/LinkedList;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    if-ne p1, v0, :cond_3

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    :goto_1
    add-int/lit8 v2, p1, -0x1

    .line 40
    .line 41
    if-le p1, v0, :cond_4

    .line 42
    .line 43
    invoke-interface {v1, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 44
    .line 45
    .line 46
    move p1, v2

    .line 47
    goto :goto_1

    .line 48
    :cond_4
    :goto_2
    return-object v1
.end method

.method public static setIndex(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p2}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    instance-of v0, p0, Ljava/util/List;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    check-cast v0, Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    move-exception p2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {p0, p1, p2}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :goto_0
    instance-of v0, p0, Ljava/util/List;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    check-cast p0, Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    :goto_1
    new-instance v0, Lbsh/UtilTargetError;

    .line 38
    .line 39
    const-string v1, "Index "

    .line 40
    .line 41
    const-string v2, " out-of-bounds for length "

    .line 42
    .line 43
    invoke-static {p1, v1, v2, p0}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-direct {v0, p0, p2}, Lbsh/UtilTargetError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :catch_1
    move-exception p0

    .line 52
    new-instance p1, Lbsh/UtilTargetError;

    .line 53
    .line 54
    new-instance p2, Ljava/lang/ArrayStoreException;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-direct {p2, p0}, Ljava/lang/ArrayStoreException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p1, p2}, Lbsh/UtilTargetError;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw p1
.end method

.method public static slice(Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lbsh/Types;->arrayElementType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-le p2, v1, :cond_0

    .line 14
    .line 15
    move p2, v1

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    if-gez p1, :cond_1

    .line 18
    .line 19
    move p1, v1

    .line 20
    :cond_1
    sub-int/2addr p2, p1

    .line 21
    if-gtz p2, :cond_2

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_2
    if-eqz p3, :cond_7

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    if-ne p3, v2, :cond_3

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_3
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    int-to-double v4, p2

    .line 37
    add-double/2addr v4, v2

    .line 38
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    int-to-double v2, v2

    .line 43
    div-double/2addr v4, v2

    .line 44
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    double-to-int v2, v2

    .line 49
    new-array v3, v2, [Ljava/lang/Object;

    .line 50
    .line 51
    move v4, v1

    .line 52
    :goto_0
    if-ge v1, p2, :cond_6

    .line 53
    .line 54
    rem-int v5, v1, p3

    .line 55
    .line 56
    if-nez v5, :cond_5

    .line 57
    .line 58
    add-int/lit8 v5, v4, 0x1

    .line 59
    .line 60
    if-gez p3, :cond_4

    .line 61
    .line 62
    add-int/lit8 v6, p2, -0x1

    .line 63
    .line 64
    sub-int/2addr v6, v1

    .line 65
    goto :goto_1

    .line 66
    :cond_4
    add-int v6, v1, p1

    .line 67
    .line 68
    :goto_1
    invoke-static {p0, v6}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    aput-object v6, v3, v4

    .line 73
    .line 74
    move v4, v5

    .line 75
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_6
    invoke-static {v0, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {v0, p0, p1}, Lbsh/BshArray;->copy(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_7
    :goto_2
    invoke-static {v0, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    invoke-static {p0, p1, p3, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    .line 96
    .line 97
    return-object p3
.end method

.method public static slice(Ljava/util/List;III)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;III)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 98
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-le p2, v0, :cond_0

    move p2, v0

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    move p1, v0

    :cond_1
    sub-int v1, p2, p1

    if-gtz v1, :cond_2

    .line 99
    invoke-interface {p0, v0, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_2
    if-eqz p3, :cond_7

    const/4 v2, 0x1

    if-ne p3, v2, :cond_3

    goto :goto_2

    .line 100
    :cond_3
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-ge v0, v1, :cond_6

    .line 101
    rem-int v2, v0, p3

    if-nez v2, :cond_5

    if-gez p3, :cond_4

    add-int/lit8 v2, v1, -0x1

    sub-int/2addr v2, v0

    goto :goto_1

    :cond_4
    add-int v2, v0, p1

    .line 102
    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 103
    :cond_6
    new-instance p1, Lbsh/BshArray$SteppedSubList;

    invoke-direct {p1, p0, p2}, Lbsh/BshArray$SteppedSubList;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p1

    .line 104
    :cond_7
    :goto_2
    invoke-interface {p0, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
