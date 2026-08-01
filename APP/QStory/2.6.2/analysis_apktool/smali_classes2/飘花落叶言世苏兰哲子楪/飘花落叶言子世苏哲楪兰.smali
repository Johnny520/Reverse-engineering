.class public final L飘花落叶言世苏兰哲子楪/飘花落叶言子世苏哲楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲子楪/飘花落叶言子世苏哲楪兰;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世苏兰哲子楪/飘花落叶言子世苏哲楪兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世苏兰哲子楪/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲子楪/飘花落叶言子世苏哲楪兰;

    .line 7
    .line 8
    new-instance v0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 9
    .line 10
    const-string v1, "kotlin.time.Instant"

    .line 11
    .line 12
    sget-object v2, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲世苏兰:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;-><init>(Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, L飘花落叶言世苏兰哲子楪/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final deserialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 25

    .line 1
    sget-object v0, Lkotlin/time/Instant;->Companion:Lkotlin/time/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰苏哲()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 20
    .line 21
    const-string v2, "An empty string is not a valid Instant"

    .line 22
    .line 23
    invoke-direct {v0, v2, v1}, Lkotlin/time/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto/16 :goto_16

    .line 27
    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/16 v3, 0x20

    .line 34
    .line 35
    const/16 v4, 0x2b

    .line 36
    .line 37
    const/16 v5, 0x2d

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    if-eq v2, v4, :cond_1

    .line 41
    .line 42
    if-eq v2, v5, :cond_1

    .line 43
    .line 44
    move v7, v0

    .line 45
    move v2, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move v7, v6

    .line 48
    :goto_0
    move v9, v0

    .line 49
    move v8, v7

    .line 50
    :goto_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    const/16 v11, 0x3a

    .line 55
    .line 56
    const/16 v12, 0x30

    .line 57
    .line 58
    if-ge v8, v10, :cond_2

    .line 59
    .line 60
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    if-gt v12, v10, :cond_2

    .line 65
    .line 66
    if-ge v10, v11, :cond_2

    .line 67
    .line 68
    mul-int/lit8 v9, v9, 0xa

    .line 69
    .line 70
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    sub-int/2addr v10, v12

    .line 75
    add-int/2addr v9, v10

    .line 76
    add-int/lit8 v8, v8, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    sub-int v10, v8, v7

    .line 80
    .line 81
    const-string v13, " digits"

    .line 82
    .line 83
    const/16 v14, 0xa

    .line 84
    .line 85
    if-le v10, v14, :cond_3

    .line 86
    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v2, "Expected at most 10 digits for the year number, got "

    .line 90
    .line 91
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    goto/16 :goto_16

    .line 109
    .line 110
    :cond_3
    if-ne v10, v14, :cond_4

    .line 111
    .line 112
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    const/16 v15, 0x32

    .line 117
    .line 118
    invoke-static {v7, v15}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-ltz v7, :cond_4

    .line 123
    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v2, "Expected at most 9 digits for the year number or year 1000000000, got "

    .line 127
    .line 128
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    goto/16 :goto_16

    .line 146
    .line 147
    :cond_4
    const/4 v7, 0x4

    .line 148
    if-ge v10, v7, :cond_5

    .line 149
    .line 150
    new-instance v0, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    const-string v2, "The year number must be padded to 4 digits, got "

    .line 153
    .line 154
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    goto/16 :goto_16

    .line 172
    .line 173
    :cond_5
    if-ne v2, v4, :cond_6

    .line 174
    .line 175
    if-ne v10, v7, :cond_6

    .line 176
    .line 177
    const-string v0, "The \'+\' sign at the start is only valid for year numbers longer than 4 digits"

    .line 178
    .line 179
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    goto/16 :goto_16

    .line 184
    .line 185
    :cond_6
    if-ne v2, v3, :cond_7

    .line 186
    .line 187
    if-eq v10, v7, :cond_7

    .line 188
    .line 189
    const-string v0, "A \'+\' or \'-\' sign is required for year numbers longer than 4 digits"

    .line 190
    .line 191
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    goto/16 :goto_16

    .line 196
    .line 197
    :cond_7
    if-ne v2, v5, :cond_8

    .line 198
    .line 199
    neg-int v9, v9

    .line 200
    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    add-int/lit8 v3, v8, 0x10

    .line 205
    .line 206
    if-ge v2, v3, :cond_9

    .line 207
    .line 208
    const-string v0, "The input string is too short"

    .line 209
    .line 210
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    goto/16 :goto_16

    .line 215
    .line 216
    :cond_9
    new-instance v2, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 217
    .line 218
    const/4 v10, 0x7

    .line 219
    invoke-direct {v2, v10}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 220
    .line 221
    .line 222
    const-string v10, "\'-\'"

    .line 223
    .line 224
    invoke-static {v1, v10, v8, v2}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    if-eqz v2, :cond_a

    .line 229
    .line 230
    :goto_2
    move-object v0, v2

    .line 231
    goto/16 :goto_16

    .line 232
    .line 233
    :cond_a
    add-int/lit8 v2, v8, 0x3

    .line 234
    .line 235
    new-instance v15, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 236
    .line 237
    const/16 v0, 0x8

    .line 238
    .line 239
    invoke-direct {v15, v0}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 240
    .line 241
    .line 242
    invoke-static {v1, v10, v2, v15}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    if-eqz v0, :cond_b

    .line 247
    .line 248
    goto/16 :goto_16

    .line 249
    .line 250
    :cond_b
    add-int/lit8 v0, v8, 0x6

    .line 251
    .line 252
    new-instance v2, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 253
    .line 254
    const/16 v10, 0x9

    .line 255
    .line 256
    invoke-direct {v2, v10}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 257
    .line 258
    .line 259
    const-string v15, "\'T\' or \'t\'"

    .line 260
    .line 261
    invoke-static {v1, v15, v0, v2}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    if-eqz v0, :cond_c

    .line 266
    .line 267
    goto/16 :goto_16

    .line 268
    .line 269
    :cond_c
    add-int/lit8 v0, v8, 0x9

    .line 270
    .line 271
    new-instance v2, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 272
    .line 273
    invoke-direct {v2, v14}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 274
    .line 275
    .line 276
    const-string v15, "\':\'"

    .line 277
    .line 278
    invoke-static {v1, v15, v0, v2}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    if-eqz v0, :cond_d

    .line 283
    .line 284
    goto/16 :goto_16

    .line 285
    .line 286
    :cond_d
    add-int/lit8 v0, v8, 0xc

    .line 287
    .line 288
    new-instance v2, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 289
    .line 290
    const/16 v7, 0xb

    .line 291
    .line 292
    invoke-direct {v2, v7}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 293
    .line 294
    .line 295
    invoke-static {v1, v15, v0, v2}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    if-eqz v0, :cond_e

    .line 300
    .line 301
    goto/16 :goto_16

    .line 302
    .line 303
    :cond_e
    const/4 v0, 0x0

    .line 304
    :goto_3
    const/16 v2, 0xc

    .line 305
    .line 306
    if-ge v0, v14, :cond_10

    .line 307
    .line 308
    sget-object v15, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:[I

    .line 309
    .line 310
    aget v15, v15, v0

    .line 311
    .line 312
    add-int/2addr v15, v8

    .line 313
    new-instance v7, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 314
    .line 315
    invoke-direct {v7, v2}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 316
    .line 317
    .line 318
    const-string v2, "an ASCII digit"

    .line 319
    .line 320
    invoke-static {v1, v2, v15, v7}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    if-eqz v2, :cond_f

    .line 325
    .line 326
    goto :goto_2

    .line 327
    :cond_f
    add-int/lit8 v0, v0, 0x1

    .line 328
    .line 329
    const/16 v7, 0xb

    .line 330
    .line 331
    goto :goto_3

    .line 332
    :cond_10
    add-int/lit8 v0, v8, 0x1

    .line 333
    .line 334
    invoke-static {v0, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    add-int/lit8 v7, v8, 0x4

    .line 339
    .line 340
    invoke-static {v7, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 341
    .line 342
    .line 343
    move-result v7

    .line 344
    add-int/lit8 v15, v8, 0x7

    .line 345
    .line 346
    invoke-static {v15, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 347
    .line 348
    .line 349
    move-result v15

    .line 350
    move/from16 v16, v2

    .line 351
    .line 352
    add-int/lit8 v2, v8, 0xa

    .line 353
    .line 354
    invoke-static {v2, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    move/from16 v17, v10

    .line 359
    .line 360
    add-int/lit8 v10, v8, 0xd

    .line 361
    .line 362
    invoke-static {v10, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 363
    .line 364
    .line 365
    move-result v10

    .line 366
    add-int/lit8 v8, v8, 0xf

    .line 367
    .line 368
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    const/16 v4, 0x2e

    .line 373
    .line 374
    if-ne v5, v4, :cond_13

    .line 375
    .line 376
    move v8, v3

    .line 377
    const/4 v4, 0x0

    .line 378
    :goto_4
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    if-ge v8, v5, :cond_11

    .line 383
    .line 384
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 385
    .line 386
    .line 387
    move-result v5

    .line 388
    if-gt v12, v5, :cond_11

    .line 389
    .line 390
    if-ge v5, v11, :cond_11

    .line 391
    .line 392
    mul-int/lit8 v4, v4, 0xa

    .line 393
    .line 394
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    sub-int/2addr v5, v12

    .line 399
    add-int/2addr v4, v5

    .line 400
    add-int/lit8 v8, v8, 0x1

    .line 401
    .line 402
    goto :goto_4

    .line 403
    :cond_11
    sub-int v3, v8, v3

    .line 404
    .line 405
    if-gt v6, v3, :cond_12

    .line 406
    .line 407
    if-ge v3, v14, :cond_12

    .line 408
    .line 409
    sget-object v5, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:[I

    .line 410
    .line 411
    rsub-int/lit8 v3, v3, 0x9

    .line 412
    .line 413
    aget v3, v5, v3

    .line 414
    .line 415
    mul-int/2addr v4, v3

    .line 416
    goto :goto_5

    .line 417
    :cond_12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    const-string v2, "1..9 digits are supported for the fraction of the second, got "

    .line 420
    .line 421
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    goto/16 :goto_16

    .line 439
    .line 440
    :cond_13
    const/4 v4, 0x0

    .line 441
    :goto_5
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    if-lt v8, v3, :cond_14

    .line 446
    .line 447
    const-string v0, "The UTC offset at the end of the string is missing"

    .line 448
    .line 449
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    goto/16 :goto_16

    .line 454
    .line 455
    :cond_14
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 456
    .line 457
    .line 458
    move-result v3

    .line 459
    const/4 v13, 0x2

    .line 460
    const/16 v14, 0x27

    .line 461
    .line 462
    move/from16 v19, v6

    .line 463
    .line 464
    const-string v6, ", got \'"

    .line 465
    .line 466
    const/16 v12, 0x2b

    .line 467
    .line 468
    if-eq v3, v12, :cond_17

    .line 469
    .line 470
    const/16 v12, 0x2d

    .line 471
    .line 472
    if-eq v3, v12, :cond_17

    .line 473
    .line 474
    const/16 v11, 0x5a

    .line 475
    .line 476
    if-eq v3, v11, :cond_15

    .line 477
    .line 478
    const/16 v11, 0x7a

    .line 479
    .line 480
    if-eq v3, v11, :cond_15

    .line 481
    .line 482
    new-instance v0, Ljava/lang/StringBuilder;

    .line 483
    .line 484
    const-string v2, "Expected the UTC offset at position "

    .line 485
    .line 486
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    goto/16 :goto_16

    .line 510
    .line 511
    :cond_15
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    add-int/lit8 v8, v8, 0x1

    .line 516
    .line 517
    if-ne v3, v8, :cond_16

    .line 518
    .line 519
    const/4 v5, 0x0

    .line 520
    :goto_6
    move/from16 v3, v19

    .line 521
    .line 522
    goto/16 :goto_10

    .line 523
    .line 524
    :cond_16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 525
    .line 526
    const-string v2, "Extra text after the instant at position "

    .line 527
    .line 528
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    goto/16 :goto_16

    .line 543
    .line 544
    :cond_17
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 545
    .line 546
    .line 547
    move-result v12

    .line 548
    sub-int/2addr v12, v8

    .line 549
    move/from16 v5, v17

    .line 550
    .line 551
    if-le v12, v5, :cond_18

    .line 552
    .line 553
    new-instance v0, Ljava/lang/StringBuilder;

    .line 554
    .line 555
    const-string v2, "The UTC offset string \""

    .line 556
    .line 557
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 561
    .line 562
    .line 563
    move-result v2

    .line 564
    invoke-virtual {v1, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 565
    .line 566
    .line 567
    move-result-object v2

    .line 568
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    const/16 v3, 0x10

    .line 573
    .line 574
    invoke-static {v3, v2}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    const-string v2, "\" is too long"

    .line 582
    .line 583
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    goto/16 :goto_16

    .line 595
    .line 596
    :cond_18
    rem-int/lit8 v5, v12, 0x3

    .line 597
    .line 598
    if-eqz v5, :cond_19

    .line 599
    .line 600
    new-instance v0, Ljava/lang/StringBuilder;

    .line 601
    .line 602
    const-string v2, "Invalid UTC offset string \""

    .line 603
    .line 604
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    invoke-virtual {v1, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    const/16 v2, 0x22

    .line 623
    .line 624
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    goto/16 :goto_16

    .line 636
    .line 637
    :cond_19
    const/4 v5, 0x0

    .line 638
    :goto_7
    if-ge v5, v13, :cond_1c

    .line 639
    .line 640
    sget-object v22, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:[I

    .line 641
    .line 642
    aget v22, v22, v5

    .line 643
    .line 644
    add-int v13, v8, v22

    .line 645
    .line 646
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 647
    .line 648
    .line 649
    move-result v14

    .line 650
    if-lt v13, v14, :cond_1a

    .line 651
    .line 652
    goto :goto_8

    .line 653
    :cond_1a
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 654
    .line 655
    .line 656
    move-result v14

    .line 657
    if-eq v14, v11, :cond_1b

    .line 658
    .line 659
    const-string v0, "Expected \':\' at index "

    .line 660
    .line 661
    invoke-static {v13, v0, v6}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 666
    .line 667
    .line 668
    move-result v2

    .line 669
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 670
    .line 671
    .line 672
    const/16 v2, 0x27

    .line 673
    .line 674
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    goto/16 :goto_16

    .line 686
    .line 687
    :cond_1b
    add-int/lit8 v5, v5, 0x1

    .line 688
    .line 689
    const/4 v13, 0x2

    .line 690
    const/16 v14, 0x27

    .line 691
    .line 692
    goto :goto_7

    .line 693
    :cond_1c
    :goto_8
    const/4 v5, 0x0

    .line 694
    :goto_9
    const/4 v13, 0x6

    .line 695
    if-ge v5, v13, :cond_1f

    .line 696
    .line 697
    sget-object v13, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:[I

    .line 698
    .line 699
    aget v13, v13, v5

    .line 700
    .line 701
    add-int/2addr v13, v8

    .line 702
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 703
    .line 704
    .line 705
    move-result v14

    .line 706
    if-lt v13, v14, :cond_1d

    .line 707
    .line 708
    goto :goto_a

    .line 709
    :cond_1d
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 710
    .line 711
    .line 712
    move-result v14

    .line 713
    move/from16 v23, v5

    .line 714
    .line 715
    const/16 v5, 0x30

    .line 716
    .line 717
    if-gt v5, v14, :cond_1e

    .line 718
    .line 719
    if-ge v14, v11, :cond_1e

    .line 720
    .line 721
    add-int/lit8 v13, v23, 0x1

    .line 722
    .line 723
    move v5, v13

    .line 724
    goto :goto_9

    .line 725
    :cond_1e
    const-string v0, "Expected an ASCII digit at index "

    .line 726
    .line 727
    invoke-static {v13, v0, v6}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 732
    .line 733
    .line 734
    move-result v2

    .line 735
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 736
    .line 737
    .line 738
    const/16 v2, 0x27

    .line 739
    .line 740
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 741
    .line 742
    .line 743
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    goto/16 :goto_16

    .line 752
    .line 753
    :cond_1f
    :goto_a
    add-int/lit8 v5, v8, 0x1

    .line 754
    .line 755
    invoke-static {v5, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 756
    .line 757
    .line 758
    move-result v5

    .line 759
    const/4 v6, 0x3

    .line 760
    if-le v12, v6, :cond_20

    .line 761
    .line 762
    add-int/lit8 v6, v8, 0x4

    .line 763
    .line 764
    invoke-static {v6, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 765
    .line 766
    .line 767
    move-result v6

    .line 768
    :goto_b
    const/4 v13, 0x6

    .line 769
    goto :goto_c

    .line 770
    :cond_20
    const/4 v6, 0x0

    .line 771
    goto :goto_b

    .line 772
    :goto_c
    if-le v12, v13, :cond_21

    .line 773
    .line 774
    add-int/lit8 v11, v8, 0x7

    .line 775
    .line 776
    invoke-static {v11, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 777
    .line 778
    .line 779
    move-result v11

    .line 780
    :goto_d
    const/16 v12, 0x3b

    .line 781
    .line 782
    goto :goto_e

    .line 783
    :cond_21
    const/4 v11, 0x0

    .line 784
    goto :goto_d

    .line 785
    :goto_e
    if-le v6, v12, :cond_22

    .line 786
    .line 787
    new-instance v0, Ljava/lang/StringBuilder;

    .line 788
    .line 789
    const-string v2, "Expected offset-minute-of-hour in 0..59, got "

    .line 790
    .line 791
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    goto/16 :goto_16

    .line 806
    .line 807
    :cond_22
    if-le v11, v12, :cond_23

    .line 808
    .line 809
    new-instance v0, Ljava/lang/StringBuilder;

    .line 810
    .line 811
    const-string v2, "Expected offset-second-of-minute in 0..59, got "

    .line 812
    .line 813
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    goto/16 :goto_16

    .line 828
    .line 829
    :cond_23
    const/16 v12, 0x11

    .line 830
    .line 831
    if-le v5, v12, :cond_25

    .line 832
    .line 833
    const/16 v12, 0x12

    .line 834
    .line 835
    if-ne v5, v12, :cond_24

    .line 836
    .line 837
    if-nez v6, :cond_24

    .line 838
    .line 839
    if-eqz v11, :cond_25

    .line 840
    .line 841
    :cond_24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 842
    .line 843
    const-string v2, "Expected an offset in -18:00..+18:00, got "

    .line 844
    .line 845
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 849
    .line 850
    .line 851
    move-result v2

    .line 852
    invoke-virtual {v1, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 853
    .line 854
    .line 855
    move-result-object v2

    .line 856
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v2

    .line 860
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 861
    .line 862
    .line 863
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v0

    .line 867
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    goto/16 :goto_16

    .line 872
    .line 873
    :cond_25
    mul-int/lit16 v5, v5, 0xe10

    .line 874
    .line 875
    const/16 v8, 0x3c

    .line 876
    .line 877
    invoke-static {v6, v8, v5, v11}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 878
    .line 879
    .line 880
    move-result v5

    .line 881
    const/16 v12, 0x2d

    .line 882
    .line 883
    if-ne v3, v12, :cond_26

    .line 884
    .line 885
    const/4 v3, -0x1

    .line 886
    goto :goto_f

    .line 887
    :cond_26
    move/from16 v3, v19

    .line 888
    .line 889
    :goto_f
    mul-int/2addr v5, v3

    .line 890
    goto/16 :goto_6

    .line 891
    .line 892
    :goto_10
    if-gt v3, v0, :cond_34

    .line 893
    .line 894
    const/16 v6, 0xd

    .line 895
    .line 896
    if-ge v0, v6, :cond_34

    .line 897
    .line 898
    if-gt v3, v7, :cond_33

    .line 899
    .line 900
    and-int/lit8 v3, v9, 0x3

    .line 901
    .line 902
    if-nez v3, :cond_28

    .line 903
    .line 904
    rem-int/lit8 v6, v9, 0x64

    .line 905
    .line 906
    if-nez v6, :cond_27

    .line 907
    .line 908
    rem-int/lit16 v6, v9, 0x190

    .line 909
    .line 910
    if-nez v6, :cond_28

    .line 911
    .line 912
    :cond_27
    const/4 v6, 0x1

    .line 913
    :goto_11
    const/4 v8, 0x2

    .line 914
    goto :goto_12

    .line 915
    :cond_28
    const/4 v6, 0x0

    .line 916
    goto :goto_11

    .line 917
    :goto_12
    if-eq v0, v8, :cond_2a

    .line 918
    .line 919
    const/4 v8, 0x4

    .line 920
    if-eq v0, v8, :cond_29

    .line 921
    .line 922
    const/4 v13, 0x6

    .line 923
    if-eq v0, v13, :cond_29

    .line 924
    .line 925
    const/16 v6, 0x9

    .line 926
    .line 927
    if-eq v0, v6, :cond_29

    .line 928
    .line 929
    const/16 v6, 0xb

    .line 930
    .line 931
    if-eq v0, v6, :cond_29

    .line 932
    .line 933
    const/16 v6, 0x1f

    .line 934
    .line 935
    goto :goto_13

    .line 936
    :cond_29
    const/16 v6, 0x1e

    .line 937
    .line 938
    goto :goto_13

    .line 939
    :cond_2a
    if-eqz v6, :cond_2b

    .line 940
    .line 941
    const/16 v6, 0x1d

    .line 942
    .line 943
    goto :goto_13

    .line 944
    :cond_2b
    const/16 v6, 0x1c

    .line 945
    .line 946
    :goto_13
    if-gt v7, v6, :cond_33

    .line 947
    .line 948
    const/16 v6, 0x17

    .line 949
    .line 950
    if-le v15, v6, :cond_2c

    .line 951
    .line 952
    new-instance v0, Ljava/lang/StringBuilder;

    .line 953
    .line 954
    const-string v2, "Expected hour in 0..23, got "

    .line 955
    .line 956
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 957
    .line 958
    .line 959
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 960
    .line 961
    .line 962
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    goto/16 :goto_16

    .line 971
    .line 972
    :cond_2c
    const/16 v12, 0x3b

    .line 973
    .line 974
    if-le v2, v12, :cond_2d

    .line 975
    .line 976
    new-instance v0, Ljava/lang/StringBuilder;

    .line 977
    .line 978
    const-string v3, "Expected minute-of-hour in 0..59, got "

    .line 979
    .line 980
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 981
    .line 982
    .line 983
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 984
    .line 985
    .line 986
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 991
    .line 992
    .line 993
    move-result-object v0

    .line 994
    goto/16 :goto_16

    .line 995
    .line 996
    :cond_2d
    if-le v10, v12, :cond_2e

    .line 997
    .line 998
    new-instance v0, Ljava/lang/StringBuilder;

    .line 999
    .line 1000
    const-string v2, "Expected second-of-minute in 0..59, got "

    .line 1001
    .line 1002
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v0

    .line 1012
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v0

    .line 1016
    goto/16 :goto_16

    .line 1017
    .line 1018
    :cond_2e
    int-to-long v11, v9

    .line 1019
    const-wide/16 v13, 0x16d

    .line 1020
    .line 1021
    mul-long/2addr v13, v11

    .line 1022
    const-wide/16 v17, 0x0

    .line 1023
    .line 1024
    cmp-long v1, v11, v17

    .line 1025
    .line 1026
    if-ltz v1, :cond_2f

    .line 1027
    .line 1028
    const-wide/16 v17, 0x3

    .line 1029
    .line 1030
    add-long v17, v11, v17

    .line 1031
    .line 1032
    const-wide/16 v20, 0x4

    .line 1033
    .line 1034
    div-long v17, v17, v20

    .line 1035
    .line 1036
    const-wide/16 v20, 0x63

    .line 1037
    .line 1038
    add-long v20, v11, v20

    .line 1039
    .line 1040
    const-wide/16 v23, 0x64

    .line 1041
    .line 1042
    div-long v20, v20, v23

    .line 1043
    .line 1044
    sub-long v17, v17, v20

    .line 1045
    .line 1046
    const-wide/16 v20, 0x18f

    .line 1047
    .line 1048
    add-long v11, v11, v20

    .line 1049
    .line 1050
    const-wide/16 v20, 0x190

    .line 1051
    .line 1052
    div-long v11, v11, v20

    .line 1053
    .line 1054
    add-long v11, v11, v17

    .line 1055
    .line 1056
    add-long/2addr v11, v13

    .line 1057
    goto :goto_14

    .line 1058
    :cond_2f
    const-wide/16 v17, -0x4

    .line 1059
    .line 1060
    div-long v17, v11, v17

    .line 1061
    .line 1062
    const-wide/16 v20, -0x64

    .line 1063
    .line 1064
    div-long v20, v11, v20

    .line 1065
    .line 1066
    sub-long v17, v17, v20

    .line 1067
    .line 1068
    const-wide/16 v20, -0x190

    .line 1069
    .line 1070
    div-long v11, v11, v20

    .line 1071
    .line 1072
    add-long v11, v11, v17

    .line 1073
    .line 1074
    sub-long v11, v13, v11

    .line 1075
    .line 1076
    :goto_14
    mul-int/lit16 v1, v0, 0x16f

    .line 1077
    .line 1078
    add-int/lit16 v1, v1, -0x16a

    .line 1079
    .line 1080
    div-int/lit8 v1, v1, 0xc

    .line 1081
    .line 1082
    int-to-long v13, v1

    .line 1083
    add-long/2addr v11, v13

    .line 1084
    const/16 v19, 0x1

    .line 1085
    .line 1086
    add-int/lit8 v7, v7, -0x1

    .line 1087
    .line 1088
    int-to-long v6, v7

    .line 1089
    add-long/2addr v11, v6

    .line 1090
    const/4 v8, 0x2

    .line 1091
    if-le v0, v8, :cond_32

    .line 1092
    .line 1093
    const-wide/16 v0, -0x1

    .line 1094
    .line 1095
    add-long/2addr v0, v11

    .line 1096
    if-nez v3, :cond_31

    .line 1097
    .line 1098
    rem-int/lit8 v3, v9, 0x64

    .line 1099
    .line 1100
    if-nez v3, :cond_30

    .line 1101
    .line 1102
    rem-int/lit16 v9, v9, 0x190

    .line 1103
    .line 1104
    if-nez v9, :cond_31

    .line 1105
    .line 1106
    :cond_30
    move-wide v11, v0

    .line 1107
    goto :goto_15

    .line 1108
    :cond_31
    const-wide/16 v0, -0x2

    .line 1109
    .line 1110
    add-long/2addr v11, v0

    .line 1111
    :cond_32
    :goto_15
    const-wide/32 v0, 0xafaa8

    .line 1112
    .line 1113
    .line 1114
    sub-long/2addr v11, v0

    .line 1115
    mul-int/lit16 v15, v15, 0xe10

    .line 1116
    .line 1117
    const/16 v8, 0x3c

    .line 1118
    .line 1119
    invoke-static {v2, v8, v15, v10}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 1120
    .line 1121
    .line 1122
    move-result v0

    .line 1123
    const-wide/32 v1, 0x15180

    .line 1124
    .line 1125
    .line 1126
    mul-long/2addr v11, v1

    .line 1127
    int-to-long v0, v0

    .line 1128
    add-long/2addr v11, v0

    .line 1129
    int-to-long v0, v5

    .line 1130
    sub-long/2addr v11, v0

    .line 1131
    new-instance v0, Lkotlin/time/飘花落叶言子楪苏哲世兰;

    .line 1132
    .line 1133
    invoke-direct {v0, v11, v12, v4}, Lkotlin/time/飘花落叶言子楪苏哲世兰;-><init>(JI)V

    .line 1134
    .line 1135
    .line 1136
    goto :goto_16

    .line 1137
    :cond_33
    const-string v2, " of year "

    .line 1138
    .line 1139
    const-string v3, ", got "

    .line 1140
    .line 1141
    const-string v4, "Expected a valid day-of-month for month "

    .line 1142
    .line 1143
    invoke-static {v0, v9, v4, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v0

    .line 1147
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v0

    .line 1154
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v0

    .line 1158
    goto :goto_16

    .line 1159
    :cond_34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1160
    .line 1161
    const-string v3, "Expected a month number in 1..12, got "

    .line 1162
    .line 1163
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v0

    .line 1173
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    :goto_16
    invoke-interface {v0}, Lkotlin/time/飘花落叶言子楪苏哲兰世;->toInstant()Lkotlin/time/Instant;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v0

    .line 1181
    return-object v0
.end method

.method public final getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lkotlin/time/Instant;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Lkotlin/time/Instant;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子苏世哲兰楪(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
