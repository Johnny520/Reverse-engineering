.class Lbsh/Operators;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbsh/ParserConstants;


# static fields
.field private static final COMPARABLE_OPS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final OVERFLOW_OPS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const/16 v0, 0x68

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x69

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0x6a

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/16 v3, 0x74

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lbsh/Operators;->OVERFLOW_OPS:Ljava/util/List;

    .line 34
    .line 35
    const/16 v0, 0x58

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/16 v0, 0x59

    .line 42
    .line 43
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const/16 v0, 0x56

    .line 48
    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const/16 v0, 0x57

    .line 54
    .line 55
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    const/16 v0, 0x5c

    .line 60
    .line 61
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    const/16 v0, 0x5d

    .line 66
    .line 67
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    const/16 v0, 0x5e

    .line 72
    .line 73
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    const/16 v0, 0x5f

    .line 78
    .line 79
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    const/16 v0, 0x60

    .line 84
    .line 85
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    const/16 v0, 0x61

    .line 90
    .line 91
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    filled-new-array/range {v1 .. v10}, [Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, Lbsh/Operators;->COMPARABLE_OPS:Ljava/util/List;

    .line 104
    .line 105
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static arbitraryObjectsBinaryOperation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 4

    .line 1
    const/16 v0, 0x5c

    .line 2
    .line 3
    if-ne p2, v0, :cond_1

    .line 4
    .line 5
    if-ne p0, p1, :cond_0

    .line 6
    .line 7
    sget-object p0, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    const/16 v0, 0x61

    .line 14
    .line 15
    if-ne p2, v0, :cond_3

    .line 16
    .line 17
    if-eq p0, p1, :cond_2

    .line 18
    .line 19
    sget-object p0, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_2
    sget-object p0, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_3
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 26
    .line 27
    if-eq p0, v0, :cond_1c

    .line 28
    .line 29
    if-eq p1, v0, :cond_1c

    .line 30
    .line 31
    const/16 v0, 0x91

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    if-ne p2, v0, :cond_8

    .line 37
    .line 38
    instance-of p2, p0, Ljava/lang/Comparable;

    .line 39
    .line 40
    if-nez p2, :cond_5

    .line 41
    .line 42
    instance-of p2, p1, Ljava/lang/Comparable;

    .line 43
    .line 44
    if-eqz p2, :cond_4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    new-instance p2, Lbsh/b;

    .line 48
    .line 49
    const/16 v0, 0xd

    .line 50
    .line 51
    invoke-direct {p2, v0}, Lbsh/b;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-static {p2}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-static {p2}, Ljava/util/Comparator;->nullsFirst(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-static {p0}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-interface {p2, p0, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    goto :goto_1

    .line 75
    :cond_5
    :goto_0
    invoke-static {}, Ljava/util/Comparator;->naturalOrder()Ljava/util/Comparator;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-static {p2}, Ljava/util/Comparator;->nullsFirst(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-static {p0}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Ljava/lang/Comparable;

    .line 88
    .line 89
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Ljava/lang/Comparable;

    .line 94
    .line 95
    invoke-interface {p2, p0, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    :goto_1
    if-gez p0, :cond_6

    .line 100
    .line 101
    const/4 v1, -0x1

    .line 102
    goto :goto_2

    .line 103
    :cond_6
    if-lez p0, :cond_7

    .line 104
    .line 105
    const/4 v1, 0x1

    .line 106
    :cond_7
    :goto_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0, v2}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_8
    const/16 v0, 0x68

    .line 116
    .line 117
    if-ne p2, v0, :cond_f

    .line 118
    .line 119
    instance-of v0, p0, Ljava/lang/String;

    .line 120
    .line 121
    if-nez v0, :cond_d

    .line 122
    .line 123
    instance-of v0, p1, Ljava/lang/String;

    .line 124
    .line 125
    if-eqz v0, :cond_9

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_a

    .line 137
    .line 138
    instance-of v0, p1, Ljava/util/List;

    .line 139
    .line 140
    if-eqz v0, :cond_a

    .line 141
    .line 142
    check-cast p1, Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {p1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_b

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_b

    .line 167
    .line 168
    invoke-static {p0, p1}, Lbsh/BshArray;->concat(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    return-object p0

    .line 173
    :cond_b
    instance-of v0, p0, Ljava/util/List;

    .line 174
    .line 175
    if-eqz v0, :cond_c

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-virtual {v3}, Ljava/lang/Class;->isArray()Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eqz v3, :cond_c

    .line 186
    .line 187
    const-class v3, Ljava/util/List;

    .line 188
    .line 189
    invoke-static {p1, v3, v1}, Lbsh/Types;->castObject(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    :cond_c
    if-eqz v0, :cond_f

    .line 194
    .line 195
    instance-of v0, p1, Ljava/util/List;

    .line 196
    .line 197
    if-eqz v0, :cond_f

    .line 198
    .line 199
    check-cast p0, Ljava/util/List;

    .line 200
    .line 201
    check-cast p1, Ljava/util/List;

    .line 202
    .line 203
    invoke-static {p0, p1}, Lbsh/BshArray;->concat(Ljava/util/List;Ljava/util/List;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    return-object p0

    .line 208
    :cond_d
    :goto_3
    sget-boolean p2, Lbsh/BSHLiteral;->internStrings:Z

    .line 209
    .line 210
    if-eqz p2, :cond_e

    .line 211
    .line 212
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    return-object p0

    .line 229
    :cond_e
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    return-object p0

    .line 242
    :cond_f
    const/16 v0, 0x6a

    .line 243
    .line 244
    if-ne p2, v0, :cond_17

    .line 245
    .line 246
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_10

    .line 255
    .line 256
    invoke-static {v2, p1}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    check-cast p1, Ljava/lang/Integer;

    .line 261
    .line 262
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    invoke-static {p0, p1}, Lbsh/BshArray;->repeat(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    return-object p0

    .line 271
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_11

    .line 280
    .line 281
    invoke-static {v2, p0}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    check-cast p0, Ljava/lang/Integer;

    .line 286
    .line 287
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 288
    .line 289
    .line 290
    move-result p0

    .line 291
    invoke-static {p1, p0}, Lbsh/BshArray;->repeat(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    return-object p0

    .line 296
    :cond_11
    instance-of v0, p0, Ljava/util/List;

    .line 297
    .line 298
    if-eqz v0, :cond_12

    .line 299
    .line 300
    check-cast p0, Ljava/util/List;

    .line 301
    .line 302
    invoke-static {v2, p1}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    check-cast p1, Ljava/lang/Integer;

    .line 307
    .line 308
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    invoke-static {p0, p1}, Lbsh/BshArray;->repeat(Ljava/util/List;I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    return-object p0

    .line 317
    :cond_12
    instance-of v0, p1, Ljava/util/List;

    .line 318
    .line 319
    if-eqz v0, :cond_13

    .line 320
    .line 321
    check-cast p1, Ljava/util/List;

    .line 322
    .line 323
    invoke-static {v2, p0}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object p0

    .line 327
    check-cast p0, Ljava/lang/Integer;

    .line 328
    .line 329
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 330
    .line 331
    .line 332
    move-result p0

    .line 333
    invoke-static {p1, p0}, Lbsh/BshArray;->repeat(Ljava/util/List;I)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    return-object p0

    .line 338
    :cond_13
    :try_start_0
    instance-of v0, p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 339
    .line 340
    const-string v1, "\u0000"

    .line 341
    .line 342
    if-eqz v0, :cond_15

    .line 343
    .line 344
    :try_start_1
    sget-boolean p2, Lbsh/BSHLiteral;->internStrings:Z

    .line 345
    .line 346
    if-eqz p2, :cond_14

    .line 347
    .line 348
    new-instance p2, Ljava/lang/String;

    .line 349
    .line 350
    invoke-static {v2, p1}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    check-cast p1, Ljava/lang/Integer;

    .line 355
    .line 356
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 357
    .line 358
    .line 359
    move-result p1

    .line 360
    new-array p1, p1, [C

    .line 361
    .line 362
    invoke-direct {p2, p1}, Ljava/lang/String;-><init>([C)V

    .line 363
    .line 364
    .line 365
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    invoke-virtual {p2, v1, p0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object p0

    .line 377
    return-object p0

    .line 378
    :cond_14
    new-instance p2, Ljava/lang/String;

    .line 379
    .line 380
    invoke-static {v2, p1}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    check-cast p1, Ljava/lang/Integer;

    .line 385
    .line 386
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 387
    .line 388
    .line 389
    move-result p1

    .line 390
    new-array p1, p1, [C

    .line 391
    .line 392
    invoke-direct {p2, p1}, Ljava/lang/String;-><init>([C)V

    .line 393
    .line 394
    .line 395
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    invoke-virtual {p2, v1, p0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    return-object p0

    .line 404
    :cond_15
    instance-of v0, p1, Ljava/lang/String;

    .line 405
    .line 406
    if-eqz v0, :cond_17

    .line 407
    .line 408
    sget-boolean p2, Lbsh/BSHLiteral;->internStrings:Z

    .line 409
    .line 410
    if-eqz p2, :cond_16

    .line 411
    .line 412
    new-instance p2, Ljava/lang/String;

    .line 413
    .line 414
    invoke-static {v2, p0}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object p0

    .line 418
    check-cast p0, Ljava/lang/Integer;

    .line 419
    .line 420
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 421
    .line 422
    .line 423
    move-result p0

    .line 424
    new-array p0, p0, [C

    .line 425
    .line 426
    invoke-direct {p2, p0}, Ljava/lang/String;-><init>([C)V

    .line 427
    .line 428
    .line 429
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object p0

    .line 433
    invoke-virtual {p2, v1, p0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    return-object p0

    .line 442
    :cond_16
    new-instance p2, Ljava/lang/String;

    .line 443
    .line 444
    invoke-static {v2, p0}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    check-cast p0, Ljava/lang/Integer;

    .line 449
    .line 450
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 451
    .line 452
    .line 453
    move-result p0

    .line 454
    new-array p0, p0, [C

    .line 455
    .line 456
    invoke-direct {p2, p0}, Ljava/lang/String;-><init>([C)V

    .line 457
    .line 458
    .line 459
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object p0

    .line 463
    invoke-virtual {p2, v1, p0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 467
    return-object p0

    .line 468
    :catch_0
    move-exception p0

    .line 469
    new-instance p1, Lbsh/UtilEvalError;

    .line 470
    .line 471
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object p2

    .line 475
    new-instance v0, Ljava/lang/StringBuilder;

    .line 476
    .line 477
    const-string v1, "Negative repeat operand: "

    .line 478
    .line 479
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object p2

    .line 489
    invoke-direct {p1, p2, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 490
    .line 491
    .line 492
    throw p1

    .line 493
    :cond_17
    instance-of v0, p0, Ljava/lang/String;

    .line 494
    .line 495
    if-nez v0, :cond_1b

    .line 496
    .line 497
    instance-of v0, p1, Ljava/lang/String;

    .line 498
    .line 499
    if-nez v0, :cond_1b

    .line 500
    .line 501
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    if-nez v0, :cond_1a

    .line 510
    .line 511
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    if-nez v0, :cond_1a

    .line 520
    .line 521
    instance-of v0, p0, Ljava/util/List;

    .line 522
    .line 523
    if-nez v0, :cond_1a

    .line 524
    .line 525
    instance-of v0, p1, Ljava/util/List;

    .line 526
    .line 527
    if-nez v0, :cond_1a

    .line 528
    .line 529
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 530
    .line 531
    if-eq p0, v0, :cond_19

    .line 532
    .line 533
    if-ne p1, v0, :cond_18

    .line 534
    .line 535
    goto :goto_4

    .line 536
    :cond_18
    new-instance p0, Lbsh/UtilEvalError;

    .line 537
    .line 538
    new-instance p1, Ljava/lang/StringBuilder;

    .line 539
    .line 540
    const-string v0, "Operator: "

    .line 541
    .line 542
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    sget-object v0, Lbsh/ParserConstants;->tokenImage:[Ljava/lang/String;

    .line 546
    .line 547
    aget-object p2, v0, p2

    .line 548
    .line 549
    const-string v0, " inappropriate for objects"

    .line 550
    .line 551
    invoke-static {p1, p2, v0}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object p1

    .line 555
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    throw p0

    .line 559
    :cond_19
    :goto_4
    new-instance p0, Lbsh/UtilEvalError;

    .line 560
    .line 561
    const-string p1, "illegal use of null value or \'null\' literal"

    .line 562
    .line 563
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    throw p0

    .line 567
    :cond_1a
    new-instance p0, Lbsh/UtilEvalError;

    .line 568
    .line 569
    new-instance p1, Ljava/lang/StringBuilder;

    .line 570
    .line 571
    const-string v0, "Use of invalid operator "

    .line 572
    .line 573
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    sget-object v0, Lbsh/ParserConstants;->tokenImage:[Ljava/lang/String;

    .line 577
    .line 578
    aget-object p2, v0, p2

    .line 579
    .line 580
    const-string v0, " with array or List type"

    .line 581
    .line 582
    invoke-static {p1, p2, v0}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object p1

    .line 586
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    throw p0

    .line 590
    :cond_1b
    new-instance p0, Lbsh/UtilEvalError;

    .line 591
    .line 592
    const-string p1, "Use of non + operator with String"

    .line 593
    .line 594
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    throw p0

    .line 598
    :cond_1c
    new-instance p0, Lbsh/UtilEvalError;

    .line 599
    .line 600
    const-string p1, "illegal use of undefined variable, class, or \'void\' literal"

    .line 601
    .line 602
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    throw p0
.end method

.method public static bigDecimalBinaryOperation(Ljava/math/BigDecimal;Ljava/math/BigDecimal;I)Ljava/lang/Object;
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_1

    .line 5
    .line 6
    .line 7
    const-string p0, "Unimplemented binary float operator"

    .line 8
    .line 9
    invoke-static {p0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :pswitch_0
    new-instance p0, Lbsh/UtilEvalError;

    .line 15
    .line 16
    const-string p1, "Can\'t shift floatingpoint values"

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    :pswitch_1
    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->pow(I)Ljava/math/BigDecimal;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_2
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->remainder(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_3
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_4
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_5
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_6
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x68
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    :pswitch_data_1
    .packed-switch 0x72
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static bigDecimalUnaryOperation(Ljava/math/BigDecimal;I)Ljava/math/BigDecimal;
    .locals 1

    .line 1
    const/16 v0, 0x5b

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string p0, "bad big decimal unaryOperation"

    .line 9
    .line 10
    invoke-static {p0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    invoke-virtual {p0}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :pswitch_1
    return-object p0

    .line 20
    :pswitch_2
    sget-object p1, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_3
    sget-object p1, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_0
    invoke-virtual {p0}, Ljava/math/BigDecimal;->signum()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const/4 v0, 0x1

    .line 39
    if-ne p1, v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :cond_1
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x66
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static bigIntegerBinaryOperation(Ljava/math/BigInteger;Ljava/math/BigInteger;I)Ljava/lang/Object;
    .locals 1

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string p0, "Unimplemented binary integer operator"

    .line 5
    .line 6
    invoke-static {p0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Ljava/math/BigInteger;->signum()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-ltz p2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    sget-object p2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    invoke-virtual {p2, v0}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v0, p2}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    invoke-virtual {p2, v0}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0, p2}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_1
    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_2
    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :pswitch_3
    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :pswitch_4
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :pswitch_5
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->xor(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_6
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :pswitch_7
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :pswitch_8
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :pswitch_9
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    return-object p0

    .line 131
    :pswitch_a
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    :pswitch_b
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0

    .line 141
    :pswitch_data_0
    .packed-switch 0x68
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static bigIntegerUnaryOperation(Ljava/math/BigInteger;I)Ljava/math/BigInteger;
    .locals 1

    .line 1
    const/16 v0, 0x5b

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string p0, "bad big integer unaryOperation"

    .line 9
    .line 10
    invoke-static {p0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    invoke-virtual {p0}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :pswitch_1
    return-object p0

    .line 20
    :pswitch_2
    sget-object p1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_3
    sget-object p1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_0
    invoke-virtual {p0}, Ljava/math/BigInteger;->not()Ljava/math/BigInteger;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x66
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static binaryOperation(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {p0}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0}, Lbsh/Types;->isNumeric(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {v1}, Lbsh/Types;->isNumeric(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-static {v0, v1}, Lbsh/Operators;->promotePrimitives(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    aget-object v1, v0, v1

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    aget-object v0, v0, v2

    .line 30
    .line 31
    move-object v4, v1

    .line 32
    move-object v1, v0

    .line 33
    move-object v0, v4

    .line 34
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    if-ne v2, v3, :cond_5

    .line 43
    .line 44
    :try_start_0
    invoke-static {v0, v1, p2}, Lbsh/Operators;->binaryOperationImpl(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    instance-of v1, p2, Ljava/lang/Boolean;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    check-cast p2, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_1

    .line 59
    .line 60
    sget-object p0, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_1
    sget-object p0, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_2
    instance-of p0, p0, Lbsh/Primitive;

    .line 67
    .line 68
    if-eqz p0, :cond_4

    .line 69
    .line 70
    instance-of p0, p1, Lbsh/Primitive;

    .line 71
    .line 72
    if-eqz p0, :cond_4

    .line 73
    .line 74
    invoke-static {p2}, Lbsh/Types;->isFloatingpoint(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_3

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    const-class p1, Ljava/math/BigDecimal;

    .line 85
    .line 86
    if-ne p0, p1, :cond_3

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p2, p0}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_3
    invoke-static {p2}, Lbsh/Primitive;->shrinkWrap(Ljava/lang/Object;)Lbsh/Primitive;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :cond_4
    invoke-static {p2}, Lbsh/Primitive;->shrinkWrap(Ljava/lang/Object;)Lbsh/Primitive;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p0}, Lbsh/Primitive;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :catch_0
    move-exception p0

    .line 112
    new-instance p1, Lbsh/UtilTargetError;

    .line 113
    .line 114
    const-string p2, "Arithemetic Exception in binary op"

    .line 115
    .line 116
    invoke-direct {p1, p2, p0}, Lbsh/UtilTargetError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_5
    new-instance p0, Lbsh/UtilEvalError;

    .line 121
    .line 122
    new-instance p1, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string p2, "Type mismatch in operator.  "

    .line 125
    .line 126
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    const-string v0, " cannot be used with "

    .line 141
    .line 142
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p0
.end method

.method public static binaryOperationImpl(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x91

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Comparable;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Boolean;

    .line 21
    .line 22
    check-cast p1, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-static {p0, p1, p2}, Lbsh/Operators;->booleanBinaryOperation(Ljava/lang/Boolean;Ljava/lang/Boolean;I)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    sget-object v0, Lbsh/Operators;->COMPARABLE_OPS:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    check-cast p0, Ljava/lang/Comparable;

    .line 42
    .line 43
    invoke-static {p0, p1, p2}, Lbsh/Operators;->comparableBinaryBooleanOperations(Ljava/lang/Comparable;Ljava/lang/Object;I)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_2
    instance-of v0, p0, Ljava/math/BigInteger;

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    check-cast p0, Ljava/math/BigInteger;

    .line 53
    .line 54
    check-cast p1, Ljava/math/BigInteger;

    .line 55
    .line 56
    invoke-static {p0, p1, p2}, Lbsh/Operators;->bigIntegerBinaryOperation(Ljava/math/BigInteger;Ljava/math/BigInteger;I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_3
    instance-of v0, p0, Ljava/math/BigDecimal;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    check-cast p0, Ljava/math/BigDecimal;

    .line 66
    .line 67
    check-cast p1, Ljava/math/BigDecimal;

    .line 68
    .line 69
    invoke-static {p0, p1, p2}, Lbsh/Operators;->bigDecimalBinaryOperation(Ljava/math/BigDecimal;Ljava/math/BigDecimal;I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :cond_4
    invoke-static {p0}, Lbsh/Types;->isFloatingpoint(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    instance-of v0, p0, Ljava/lang/Float;

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    check-cast p0, Ljava/lang/Float;

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    check-cast p1, Ljava/lang/Float;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    invoke-static {p0, p1, p2}, Lbsh/Operators;->floatBinaryOperation(FFI)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :cond_5
    check-cast p0, Ljava/lang/Double;

    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    check-cast p1, Ljava/lang/Double;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 110
    .line 111
    .line 112
    move-result-wide p0

    .line 113
    invoke-static {v0, v1, p0, p1, p2}, Lbsh/Operators;->doubleBinaryOperation(DDI)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :cond_6
    instance-of v0, p0, Ljava/lang/Number;

    .line 119
    .line 120
    if-eqz v0, :cond_7

    .line 121
    .line 122
    check-cast p0, Ljava/lang/Long;

    .line 123
    .line 124
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 125
    .line 126
    .line 127
    move-result-wide v0

    .line 128
    check-cast p1, Ljava/lang/Long;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 131
    .line 132
    .line 133
    move-result-wide p0

    .line 134
    invoke-static {v0, v1, p0, p1, p2}, Lbsh/Operators;->longBinaryOperation(JJI)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0

    .line 139
    :cond_7
    new-instance p0, Lbsh/UtilEvalError;

    .line 140
    .line 141
    const-string p1, "Invalid types in binary operator"

    .line 142
    .line 143
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p0
.end method

.method public static booleanBinaryOperation(Ljava/lang/Boolean;Ljava/lang/Boolean;I)Ljava/lang/Boolean;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x5c

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eq p2, v1, :cond_1

    .line 14
    .line 15
    packed-switch p2, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    packed-switch p2, :pswitch_data_1

    .line 19
    .line 20
    .line 21
    const-string p0, "unimplemented binary operator"

    .line 22
    .line 23
    invoke-static {p0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :pswitch_0
    xor-int/2addr p0, v0

    .line 29
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    or-int/2addr p0, v0

    .line 35
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_2
    and-int/2addr p0, v0

    .line 41
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_3
    return-object p1

    .line 47
    :pswitch_4
    if-eq p0, v0, :cond_0

    .line 48
    .line 49
    move v2, v3

    .line 50
    :cond_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_1
    if-ne p0, v0, :cond_2

    .line 56
    .line 57
    move v2, v3

    .line 58
    :cond_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x61
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    :pswitch_data_1
    .packed-switch 0x6c
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static booleanUnaryOperation(Ljava/lang/Boolean;I)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x5a

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    new-instance p0, Lbsh/UtilEvalError;

    .line 13
    .line 14
    const-string p1, "Operator inappropriate for boolean"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public static comparableBinaryBooleanOperations(Ljava/lang/Comparable;Ljava/lang/Object;I)Ljava/lang/Boolean;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Comparable<",
            "TT;>;TT;I)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_1
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    move v0, v1

    .line 25
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_2
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-ltz p0, :cond_2

    .line 35
    .line 36
    move v0, v1

    .line 37
    :cond_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_3
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-gtz p0, :cond_3

    .line 47
    .line 48
    move v0, v1

    .line 49
    :cond_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_4
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-gez p0, :cond_4

    .line 59
    .line 60
    move v0, v1

    .line 61
    :cond_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_5
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-lez p0, :cond_5

    .line 71
    .line 72
    move v0, v1

    .line 73
    :cond_5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x56
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static doubleBinaryOperation(DDI)Ljava/lang/Object;
    .locals 4

    .line 1
    const-wide v0, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    packed-switch p4, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    packed-switch p4, :pswitch_data_1

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :pswitch_0
    new-instance p0, Lbsh/UtilEvalError;

    .line 16
    .line 17
    const-string p1, "Can\'t shift floatingpoint values"

    .line 18
    .line 19
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p0

    .line 23
    :pswitch_1
    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->pow(DD)D

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_2
    rem-double/2addr p0, p2

    .line 40
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_3
    div-double/2addr p0, p2

    .line 46
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_4
    cmpl-double v2, p0, v2

    .line 52
    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    div-double/2addr v0, p0

    .line 56
    cmpg-double v0, v0, p2

    .line 57
    .line 58
    if-gez v0, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    mul-double/2addr p0, p2

    .line 62
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :pswitch_5
    cmpg-double v0, p0, v2

    .line 68
    .line 69
    if-gez v0, :cond_2

    .line 70
    .line 71
    const-wide v0, -0x10000000000001L

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    sub-double/2addr v0, p0

    .line 77
    neg-double v2, p2

    .line 78
    cmpl-double v0, v0, v2

    .line 79
    .line 80
    if-lez v0, :cond_2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    sub-double/2addr p0, p2

    .line 84
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :pswitch_6
    cmpl-double v2, p0, v2

    .line 90
    .line 91
    if-lez v2, :cond_4

    .line 92
    .line 93
    sub-double/2addr v0, p0

    .line 94
    cmpg-double v0, v0, p2

    .line 95
    .line 96
    if-gez v0, :cond_4

    .line 97
    .line 98
    :goto_0
    sget-object v0, Lbsh/Operators;->OVERFLOW_OPS:Ljava/util/List;

    .line 99
    .line 100
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_3

    .line 109
    .line 110
    invoke-static {p0, p1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p2, p3}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p0, p1, p4}, Lbsh/Operators;->bigDecimalBinaryOperation(Ljava/math/BigDecimal;Ljava/math/BigDecimal;I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :cond_3
    const-string p0, "Unimplemented binary double operator"

    .line 124
    .line 125
    invoke-static {p0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    const/4 p0, 0x0

    .line 129
    return-object p0

    .line 130
    :cond_4
    add-double/2addr p0, p2

    .line 131
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x68
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    :pswitch_data_1
    .packed-switch 0x72
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static doubleUnaryOperation(Ljava/lang/Double;I)D
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const-string p0, "bad double unaryOperation"

    .line 11
    .line 12
    invoke-static {p0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-wide/16 p0, 0x0

    .line 16
    .line 17
    return-wide p0

    .line 18
    :pswitch_0
    neg-double p0, v0

    .line 19
    return-wide p0

    .line 20
    :pswitch_1
    return-wide v0

    .line 21
    :pswitch_2
    sub-double/2addr v0, v2

    .line 22
    return-wide v0

    .line 23
    :pswitch_3
    add-double/2addr v0, v2

    .line 24
    return-wide v0

    .line 25
    :pswitch_data_0
    .packed-switch 0x66
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static floatBinaryOperation(FFI)Ljava/lang/Object;
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 4
    .line 5
    .line 6
    packed-switch p2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    packed-switch p2, :pswitch_data_1

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_0
    new-instance p0, Lbsh/UtilEvalError;

    .line 14
    .line 15
    const-string p1, "Can\'t shift floatingpoint values"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0

    .line 21
    :pswitch_1
    float-to-double v0, p0

    .line 22
    float-to-double v2, p1

    .line 23
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_2
    rem-float/2addr p0, p1

    .line 40
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_3
    div-float/2addr p0, p1

    .line 46
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_4
    const/4 v0, 0x0

    .line 52
    cmpl-float v0, p0, v0

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    div-float/2addr v2, p0

    .line 57
    cmpg-float v0, v2, p1

    .line 58
    .line 59
    if-gez v0, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    mul-float/2addr p0, p1

    .line 63
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :pswitch_5
    float-to-double v2, p0

    .line 69
    cmpg-double v0, v2, v0

    .line 70
    .line 71
    if-gez v0, :cond_2

    .line 72
    .line 73
    const v0, -0x800001

    .line 74
    .line 75
    .line 76
    sub-float/2addr v0, p0

    .line 77
    neg-float v1, p1

    .line 78
    cmpl-float v0, v0, v1

    .line 79
    .line 80
    if-lez v0, :cond_2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    sub-float/2addr p0, p1

    .line 84
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :pswitch_6
    float-to-double v3, p0

    .line 90
    cmpl-double v0, v3, v0

    .line 91
    .line 92
    if-lez v0, :cond_4

    .line 93
    .line 94
    sub-float/2addr v2, p0

    .line 95
    cmpg-float v0, v2, p1

    .line 96
    .line 97
    if-gez v0, :cond_4

    .line 98
    .line 99
    :goto_0
    sget-object v0, Lbsh/Operators;->OVERFLOW_OPS:Ljava/util/List;

    .line 100
    .line 101
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    float-to-double v0, p0

    .line 112
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    float-to-double v0, p1

    .line 117
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {p0, p1, p2}, Lbsh/Operators;->bigDecimalBinaryOperation(Ljava/math/BigDecimal;Ljava/math/BigDecimal;I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :cond_3
    const-string p0, "Unimplemented binary double operator"

    .line 127
    .line 128
    invoke-static {p0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const/4 p0, 0x0

    .line 132
    return-object p0

    .line 133
    :cond_4
    add-float/2addr p0, p1

    .line 134
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0

    .line 139
    :pswitch_data_0
    .packed-switch 0x68
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    :pswitch_data_1
    .packed-switch 0x72
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static floatUnaryOperation(Ljava/lang/Float;I)F
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const-string p0, "bad float unaryOperation"

    .line 11
    .line 12
    invoke-static {p0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :pswitch_0
    neg-float p0, p0

    .line 18
    :pswitch_1
    return p0

    .line 19
    :pswitch_2
    sub-float/2addr p0, v0

    .line 20
    return p0

    .line 21
    :pswitch_3
    add-float/2addr p0, v0

    .line 22
    return p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x66
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static intUnaryOperation(Ljava/lang/Integer;I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x5b

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const-string p0, "bad integer unaryOperation"

    .line 13
    .line 14
    invoke-static {p0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :pswitch_0
    neg-int p0, p0

    .line 20
    :pswitch_1
    return p0

    .line 21
    :pswitch_2
    add-int/lit8 p0, p0, -0x1

    .line 22
    .line 23
    return p0

    .line 24
    :pswitch_3
    add-int/lit8 p0, p0, 0x1

    .line 25
    .line 26
    return p0

    .line 27
    :cond_0
    not-int p0, p0

    .line 28
    return p0

    .line 29
    :pswitch_data_0
    .packed-switch 0x66
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static longBinaryOperation(JJI)Ljava/lang/Object;
    .locals 4

    .line 1
    const-wide v0, 0x7fffffffffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    packed-switch p4, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    goto/16 :goto_0

    .line 12
    .line 13
    :pswitch_0
    long-to-int p2, p2

    .line 14
    ushr-long/2addr p0, p2

    .line 15
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :pswitch_1
    long-to-int p2, p2

    .line 21
    shr-long/2addr p0, p2

    .line 22
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_2
    long-to-int p2, p2

    .line 28
    shl-long/2addr p0, p2

    .line 29
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_3
    long-to-double v0, p0

    .line 35
    long-to-double v2, p2

    .line 36
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    sget-object v3, Lbsh/Primitive;->LONG_MIN:Ljava/math/BigInteger;

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-ltz v3, :cond_2

    .line 55
    .line 56
    sget-object v3, Lbsh/Primitive;->LONG_MAX:Ljava/math/BigInteger;

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-gtz v2, :cond_2

    .line 63
    .line 64
    double-to-long p0, v0

    .line 65
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :pswitch_4
    rem-long/2addr p0, p2

    .line 71
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :pswitch_5
    xor-long/2addr p0, p2

    .line 77
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :pswitch_6
    or-long/2addr p0, p2

    .line 83
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_7
    and-long/2addr p0, p2

    .line 89
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :pswitch_8
    div-long/2addr p0, p2

    .line 95
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :pswitch_9
    cmp-long v2, p0, v2

    .line 101
    .line 102
    if-eqz v2, :cond_0

    .line 103
    .line 104
    div-long/2addr v0, p0

    .line 105
    cmp-long v0, v0, p2

    .line 106
    .line 107
    if-gez v0, :cond_0

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    mul-long/2addr p0, p2

    .line 111
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :pswitch_a
    cmp-long v0, p0, v2

    .line 117
    .line 118
    if-gez v0, :cond_1

    .line 119
    .line 120
    const-wide/high16 v0, -0x8000000000000000L

    .line 121
    .line 122
    sub-long/2addr v0, p0

    .line 123
    neg-long v2, p2

    .line 124
    cmp-long v0, v0, v2

    .line 125
    .line 126
    if-lez v0, :cond_1

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_1
    sub-long/2addr p0, p2

    .line 130
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :pswitch_b
    cmp-long v2, p0, v2

    .line 136
    .line 137
    if-lez v2, :cond_4

    .line 138
    .line 139
    sub-long/2addr v0, p0

    .line 140
    cmp-long v0, v0, p2

    .line 141
    .line 142
    if-gez v0, :cond_4

    .line 143
    .line 144
    :cond_2
    :goto_0
    sget-object v0, Lbsh/Operators;->OVERFLOW_OPS:Ljava/util/List;

    .line 145
    .line 146
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_3

    .line 155
    .line 156
    invoke-static {p0, p1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-static {p2, p3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {p0, p1, p4}, Lbsh/Operators;->bigIntegerBinaryOperation(Ljava/math/BigInteger;Ljava/math/BigInteger;I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0

    .line 169
    :cond_3
    const-string p0, "Unimplemented binary long operator"

    .line 170
    .line 171
    invoke-static {p0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    const/4 p0, 0x0

    .line 175
    return-object p0

    .line 176
    :cond_4
    add-long/2addr p0, p2

    .line 177
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    return-object p0

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x68
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static longUnaryOperation(Ljava/lang/Long;I)J
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 p0, 0x5b

    .line 6
    .line 7
    if-eq p1, p0, :cond_0

    .line 8
    .line 9
    const-wide/16 v2, 0x1

    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const-string p0, "bad long unaryOperation"

    .line 15
    .line 16
    invoke-static {p0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-wide/16 p0, 0x0

    .line 20
    .line 21
    return-wide p0

    .line 22
    :pswitch_0
    neg-long p0, v0

    .line 23
    return-wide p0

    .line 24
    :pswitch_1
    return-wide v0

    .line 25
    :pswitch_2
    sub-long/2addr v0, v2

    .line 26
    return-wide v0

    .line 27
    :pswitch_3
    add-long/2addr v0, v2

    .line 28
    return-wide v0

    .line 29
    :cond_0
    not-long p0, v0

    .line 30
    return-wide p0

    .line 31
    :pswitch_data_0
    .packed-switch 0x66
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static promotePrimitives(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {p0}, Lbsh/Operators;->promoteToInteger(Ljava/lang/Object;)Ljava/lang/Number;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lbsh/Operators;->promoteToInteger(Ljava/lang/Object;)Ljava/lang/Number;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    instance-of v2, p0, Ljava/math/BigDecimal;

    .line 10
    .line 11
    const-class v3, Ljava/math/BigDecimal;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    instance-of v0, p1, Ljava/math/BigDecimal;

    .line 16
    .line 17
    if-nez v0, :cond_b

    .line 18
    .line 19
    invoke-static {v3, v1}, Lbsh/Primitive;->castNumber(Ljava/lang/Class;Ljava/lang/Number;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    instance-of v2, p1, Ljava/math/BigDecimal;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-static {v3, v0}, Lbsh/Primitive;->castNumber(Ljava/lang/Class;Ljava/lang/Number;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_1
    invoke-static {p0}, Lbsh/Types;->isFloatingpoint(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_6

    .line 40
    .line 41
    invoke-static {p1}, Lbsh/Types;->isFloatingpoint(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    instance-of v2, p0, Ljava/math/BigInteger;

    .line 49
    .line 50
    const-class v3, Ljava/math/BigInteger;

    .line 51
    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    instance-of v0, p1, Ljava/math/BigInteger;

    .line 55
    .line 56
    if-nez v0, :cond_b

    .line 57
    .line 58
    invoke-static {v3, v1}, Lbsh/Primitive;->castNumber(Ljava/lang/Class;Ljava/lang/Number;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    instance-of v2, p1, Ljava/math/BigInteger;

    .line 64
    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    invoke-static {v3, v0}, Lbsh/Primitive;->castNumber(Ljava/lang/Class;Ljava/lang/Number;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    goto :goto_2

    .line 72
    :cond_4
    instance-of v2, p0, Ljava/lang/Long;

    .line 73
    .line 74
    if-nez v2, :cond_5

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    :cond_5
    instance-of v0, p1, Ljava/lang/Long;

    .line 85
    .line 86
    if-nez v0, :cond_b

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 89
    .line 90
    .line 91
    move-result-wide v0

    .line 92
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    goto :goto_2

    .line 97
    :cond_6
    :goto_0
    instance-of v2, p0, Ljava/lang/Double;

    .line 98
    .line 99
    if-nez v2, :cond_9

    .line 100
    .line 101
    instance-of v3, p1, Ljava/lang/Double;

    .line 102
    .line 103
    if-eqz v3, :cond_7

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_7
    instance-of v2, p0, Ljava/lang/Float;

    .line 107
    .line 108
    if-nez v2, :cond_8

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    :cond_8
    instance-of v0, p1, Ljava/lang/Float;

    .line 119
    .line 120
    if-nez v0, :cond_b

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    goto :goto_2

    .line 131
    :cond_9
    :goto_1
    if-nez v2, :cond_a

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 134
    .line 135
    .line 136
    move-result-wide v2

    .line 137
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    :cond_a
    instance-of v0, p1, Ljava/lang/Double;

    .line 142
    .line 143
    if-nez v0, :cond_b

    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 146
    .line 147
    .line 148
    move-result-wide v0

    .line 149
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    :cond_b
    :goto_2
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0
.end method

.method public static promoteToInteger(Ljava/lang/Object;)Ljava/lang/Number;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Character;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Character;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/Byte;

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    instance-of v0, p0, Ljava/lang/Short;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    check-cast p0, Ljava/lang/Number;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    :goto_0
    check-cast p0, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static unaryOperation(Lbsh/Primitive;I)Lbsh/Primitive;
    .locals 3

    .line 1
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 2
    .line 3
    if-eq p0, v0, :cond_d

    .line 4
    .line 5
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 6
    .line 7
    if-eq p0, v0, :cond_c

    .line 8
    .line 9
    invoke-virtual {p0}, Lbsh/Primitive;->getType()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lbsh/Primitive;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-static {p0, p1}, Lbsh/Operators;->booleanUnaryOperation(Ljava/lang/Boolean;I)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    sget-object p0, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    sget-object p0, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    invoke-virtual {p0}, Lbsh/Primitive;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Lbsh/Operators;->promoteToInteger(Ljava/lang/Object;)Ljava/lang/Number;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    instance-of v1, p0, Ljava/lang/Integer;

    .line 44
    .line 45
    if-eqz v1, :cond_6

    .line 46
    .line 47
    check-cast p0, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-static {p0, p1}, Lbsh/Operators;->intUnaryOperation(Ljava/lang/Integer;I)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    const/16 v1, 0x66

    .line 54
    .line 55
    if-eq p1, v1, :cond_2

    .line 56
    .line 57
    const/16 v1, 0x67

    .line 58
    .line 59
    if-ne p1, v1, :cond_5

    .line 60
    .line 61
    :cond_2
    sget-object p1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    if-ne v0, p1, :cond_3

    .line 64
    .line 65
    new-instance p1, Lbsh/Primitive;

    .line 66
    .line 67
    int-to-byte p0, p0

    .line 68
    invoke-direct {p1, p0}, Lbsh/Primitive;-><init>(B)V

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_3
    sget-object p1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    if-ne v0, p1, :cond_4

    .line 75
    .line 76
    new-instance p1, Lbsh/Primitive;

    .line 77
    .line 78
    int-to-short p0, p0

    .line 79
    invoke-direct {p1, p0}, Lbsh/Primitive;-><init>(S)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_4
    sget-object p1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 84
    .line 85
    if-ne v0, p1, :cond_5

    .line 86
    .line 87
    new-instance p1, Lbsh/Primitive;

    .line 88
    .line 89
    int-to-char p0, p0

    .line 90
    invoke-direct {p1, p0}, Lbsh/Primitive;-><init>(C)V

    .line 91
    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_5
    new-instance p1, Lbsh/Primitive;

    .line 95
    .line 96
    invoke-direct {p1, p0}, Lbsh/Primitive;-><init>(I)V

    .line 97
    .line 98
    .line 99
    return-object p1

    .line 100
    :cond_6
    instance-of v0, p0, Ljava/lang/Long;

    .line 101
    .line 102
    if-eqz v0, :cond_7

    .line 103
    .line 104
    new-instance v0, Lbsh/Primitive;

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 107
    .line 108
    .line 109
    move-result-wide v1

    .line 110
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p0, p1}, Lbsh/Operators;->longUnaryOperation(Ljava/lang/Long;I)J

    .line 115
    .line 116
    .line 117
    move-result-wide p0

    .line 118
    invoke-direct {v0, p0, p1}, Lbsh/Primitive;-><init>(J)V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :cond_7
    instance-of v0, p0, Ljava/lang/Float;

    .line 123
    .line 124
    if-eqz v0, :cond_8

    .line 125
    .line 126
    new-instance v0, Lbsh/Primitive;

    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p0, p1}, Lbsh/Operators;->floatUnaryOperation(Ljava/lang/Float;I)F

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    invoke-direct {v0, p0}, Lbsh/Primitive;-><init>(F)V

    .line 141
    .line 142
    .line 143
    return-object v0

    .line 144
    :cond_8
    instance-of v0, p0, Ljava/lang/Double;

    .line 145
    .line 146
    if-eqz v0, :cond_9

    .line 147
    .line 148
    new-instance v0, Lbsh/Primitive;

    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 151
    .line 152
    .line 153
    move-result-wide v1

    .line 154
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-static {p0, p1}, Lbsh/Operators;->doubleUnaryOperation(Ljava/lang/Double;I)D

    .line 159
    .line 160
    .line 161
    move-result-wide p0

    .line 162
    invoke-direct {v0, p0, p1}, Lbsh/Primitive;-><init>(D)V

    .line 163
    .line 164
    .line 165
    return-object v0

    .line 166
    :cond_9
    instance-of v0, p0, Ljava/math/BigInteger;

    .line 167
    .line 168
    if-eqz v0, :cond_a

    .line 169
    .line 170
    new-instance v0, Lbsh/Primitive;

    .line 171
    .line 172
    check-cast p0, Ljava/math/BigInteger;

    .line 173
    .line 174
    invoke-static {p0, p1}, Lbsh/Operators;->bigIntegerUnaryOperation(Ljava/math/BigInteger;I)Ljava/math/BigInteger;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-direct {v0, p0}, Lbsh/Primitive;-><init>(Ljava/math/BigInteger;)V

    .line 179
    .line 180
    .line 181
    return-object v0

    .line 182
    :cond_a
    instance-of v0, p0, Ljava/math/BigDecimal;

    .line 183
    .line 184
    if-eqz v0, :cond_b

    .line 185
    .line 186
    new-instance v0, Lbsh/Primitive;

    .line 187
    .line 188
    check-cast p0, Ljava/math/BigDecimal;

    .line 189
    .line 190
    invoke-static {p0, p1}, Lbsh/Operators;->bigDecimalUnaryOperation(Ljava/math/BigDecimal;I)Ljava/math/BigDecimal;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-direct {v0, p0}, Lbsh/Primitive;-><init>(Ljava/math/BigDecimal;)V

    .line 195
    .line 196
    .line 197
    return-object v0

    .line 198
    :cond_b
    const-string p0, "An error occurred.  Please call technical support."

    .line 199
    .line 200
    invoke-static {p0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    const/4 p0, 0x0

    .line 204
    return-object p0

    .line 205
    :cond_c
    new-instance p0, Lbsh/UtilEvalError;

    .line 206
    .line 207
    const-string p1, "illegal use of undefined object or \'void\' literal"

    .line 208
    .line 209
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p0

    .line 213
    :cond_d
    new-instance p0, Lbsh/UtilEvalError;

    .line 214
    .line 215
    const-string p1, "illegal use of null object or \'null\' literal"

    .line 216
    .line 217
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw p0
.end method
