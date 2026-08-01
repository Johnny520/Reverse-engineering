.class public final L飘花落叶言世哲子苏楪兰/飘花落叶言子世苏哲楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言世哲子苏楪兰/飘花落叶言子苏世哲兰楪;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子世苏哲楪兰;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子世苏哲楪兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子世苏哲楪兰;

    .line 7
    .line 8
    new-instance v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子苏世哲兰楪;

    .line 9
    .line 10
    const-string v1, "kotlin.time.Instant"

    .line 11
    .line 12
    sget-object v2, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲:L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世哲兰苏;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子苏世哲兰楪;-><init>(Ljava/lang/String;L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世哲兰苏;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲子苏楪兰/飘花落叶言子苏世哲兰楪;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final deserialize(L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 26

    .line 1
    sget-object v0, Lkotlin/time/Instant;->Companion:Lkotlin/time/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/String;

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
    if-lt v7, v15, :cond_4

    .line 119
    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v2, "Expected at most 9 digits for the year number or year 1000000000, got "

    .line 123
    .line 124
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    goto/16 :goto_16

    .line 142
    .line 143
    :cond_4
    const/4 v7, 0x4

    .line 144
    if-ge v10, v7, :cond_5

    .line 145
    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v2, "The year number must be padded to 4 digits, got "

    .line 149
    .line 150
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    goto/16 :goto_16

    .line 168
    .line 169
    :cond_5
    if-ne v2, v4, :cond_6

    .line 170
    .line 171
    if-ne v10, v7, :cond_6

    .line 172
    .line 173
    const-string v0, "The \'+\' sign at the start is only valid for year numbers longer than 4 digits"

    .line 174
    .line 175
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    goto/16 :goto_16

    .line 180
    .line 181
    :cond_6
    if-ne v2, v3, :cond_7

    .line 182
    .line 183
    if-eq v10, v7, :cond_7

    .line 184
    .line 185
    const-string v0, "A \'+\' or \'-\' sign is required for year numbers longer than 4 digits"

    .line 186
    .line 187
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    goto/16 :goto_16

    .line 192
    .line 193
    :cond_7
    if-ne v2, v5, :cond_8

    .line 194
    .line 195
    neg-int v9, v9

    .line 196
    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    add-int/lit8 v3, v8, 0x10

    .line 201
    .line 202
    if-ge v2, v3, :cond_9

    .line 203
    .line 204
    const-string v0, "The input string is too short"

    .line 205
    .line 206
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    goto/16 :goto_16

    .line 211
    .line 212
    :cond_9
    new-instance v2, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 213
    .line 214
    invoke-direct {v2, v14}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 215
    .line 216
    .line 217
    const-string v10, "\'-\'"

    .line 218
    .line 219
    invoke-static {v1, v10, v8, v2}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;IL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    if-eqz v2, :cond_a

    .line 224
    .line 225
    :goto_2
    move-object v0, v2

    .line 226
    goto/16 :goto_16

    .line 227
    .line 228
    :cond_a
    add-int/lit8 v2, v8, 0x3

    .line 229
    .line 230
    new-instance v15, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 231
    .line 232
    const/16 v0, 0xb

    .line 233
    .line 234
    invoke-direct {v15, v0}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 235
    .line 236
    .line 237
    invoke-static {v1, v10, v2, v15}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;IL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    if-eqz v2, :cond_b

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_b
    add-int/lit8 v2, v8, 0x6

    .line 245
    .line 246
    new-instance v10, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 247
    .line 248
    const/16 v15, 0xc

    .line 249
    .line 250
    invoke-direct {v10, v15}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 251
    .line 252
    .line 253
    move/from16 p1, v15

    .line 254
    .line 255
    const-string v15, "\'T\' or \'t\'"

    .line 256
    .line 257
    invoke-static {v1, v15, v2, v10}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;IL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    if-eqz v2, :cond_c

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_c
    add-int/lit8 v2, v8, 0x9

    .line 265
    .line 266
    new-instance v10, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 267
    .line 268
    const/16 v15, 0xd

    .line 269
    .line 270
    invoke-direct {v10, v15}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 271
    .line 272
    .line 273
    const-string v0, "\':\'"

    .line 274
    .line 275
    invoke-static {v1, v0, v2, v10}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;IL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    if-eqz v2, :cond_d

    .line 280
    .line 281
    goto :goto_2

    .line 282
    :cond_d
    add-int/lit8 v2, v8, 0xc

    .line 283
    .line 284
    new-instance v10, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 285
    .line 286
    const/16 v7, 0xe

    .line 287
    .line 288
    invoke-direct {v10, v7}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 289
    .line 290
    .line 291
    invoke-static {v1, v0, v2, v10}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;IL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    if-eqz v0, :cond_e

    .line 296
    .line 297
    goto/16 :goto_16

    .line 298
    .line 299
    :cond_e
    const/4 v0, 0x0

    .line 300
    :goto_3
    const/16 v2, 0xf

    .line 301
    .line 302
    if-ge v0, v14, :cond_10

    .line 303
    .line 304
    sget-object v7, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:[I

    .line 305
    .line 306
    aget v7, v7, v0

    .line 307
    .line 308
    add-int/2addr v7, v8

    .line 309
    new-instance v10, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 310
    .line 311
    invoke-direct {v10, v2}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 312
    .line 313
    .line 314
    const-string v2, "an ASCII digit"

    .line 315
    .line 316
    invoke-static {v1, v2, v7, v10}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;IL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    if-eqz v2, :cond_f

    .line 321
    .line 322
    goto :goto_2

    .line 323
    :cond_f
    add-int/lit8 v0, v0, 0x1

    .line 324
    .line 325
    goto :goto_3

    .line 326
    :cond_10
    add-int/lit8 v0, v8, 0x1

    .line 327
    .line 328
    invoke-static {v0, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    add-int/lit8 v7, v8, 0x4

    .line 333
    .line 334
    invoke-static {v7, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 335
    .line 336
    .line 337
    move-result v7

    .line 338
    add-int/lit8 v10, v8, 0x7

    .line 339
    .line 340
    invoke-static {v10, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 341
    .line 342
    .line 343
    move-result v10

    .line 344
    move/from16 v18, v2

    .line 345
    .line 346
    add-int/lit8 v2, v8, 0xa

    .line 347
    .line 348
    invoke-static {v2, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    add-int/lit8 v15, v8, 0xd

    .line 353
    .line 354
    invoke-static {v15, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 355
    .line 356
    .line 357
    move-result v15

    .line 358
    add-int/lit8 v8, v8, 0xf

    .line 359
    .line 360
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    const/16 v4, 0x2e

    .line 365
    .line 366
    const/16 v14, 0x9

    .line 367
    .line 368
    if-ne v5, v4, :cond_13

    .line 369
    .line 370
    move v8, v3

    .line 371
    const/4 v4, 0x0

    .line 372
    :goto_4
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    if-ge v8, v5, :cond_11

    .line 377
    .line 378
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    if-gt v12, v5, :cond_11

    .line 383
    .line 384
    if-ge v5, v11, :cond_11

    .line 385
    .line 386
    mul-int/lit8 v4, v4, 0xa

    .line 387
    .line 388
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 389
    .line 390
    .line 391
    move-result v5

    .line 392
    sub-int/2addr v5, v12

    .line 393
    add-int/2addr v4, v5

    .line 394
    add-int/lit8 v8, v8, 0x1

    .line 395
    .line 396
    goto :goto_4

    .line 397
    :cond_11
    sub-int v3, v8, v3

    .line 398
    .line 399
    if-gt v6, v3, :cond_12

    .line 400
    .line 401
    const/16 v5, 0xa

    .line 402
    .line 403
    if-ge v3, v5, :cond_12

    .line 404
    .line 405
    sget-object v5, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:[I

    .line 406
    .line 407
    rsub-int/lit8 v3, v3, 0x9

    .line 408
    .line 409
    aget v3, v5, v3

    .line 410
    .line 411
    mul-int/2addr v4, v3

    .line 412
    goto :goto_5

    .line 413
    :cond_12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 414
    .line 415
    const-string v2, "1..9 digits are supported for the fraction of the second, got "

    .line 416
    .line 417
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    goto/16 :goto_16

    .line 435
    .line 436
    :cond_13
    const/4 v4, 0x0

    .line 437
    :goto_5
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    if-lt v8, v3, :cond_14

    .line 442
    .line 443
    const-string v0, "The UTC offset at the end of the string is missing"

    .line 444
    .line 445
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    goto/16 :goto_16

    .line 450
    .line 451
    :cond_14
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 452
    .line 453
    .line 454
    move-result v3

    .line 455
    const/4 v13, 0x2

    .line 456
    move/from16 v21, v6

    .line 457
    .line 458
    const/16 v6, 0x27

    .line 459
    .line 460
    const-string v5, ", got \'"

    .line 461
    .line 462
    const/16 v12, 0x2b

    .line 463
    .line 464
    if-eq v3, v12, :cond_17

    .line 465
    .line 466
    const/16 v12, 0x2d

    .line 467
    .line 468
    if-eq v3, v12, :cond_17

    .line 469
    .line 470
    const/16 v11, 0x5a

    .line 471
    .line 472
    if-eq v3, v11, :cond_15

    .line 473
    .line 474
    const/16 v11, 0x7a

    .line 475
    .line 476
    if-eq v3, v11, :cond_15

    .line 477
    .line 478
    new-instance v0, Ljava/lang/StringBuilder;

    .line 479
    .line 480
    const-string v2, "Expected the UTC offset at position "

    .line 481
    .line 482
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    goto/16 :goto_16

    .line 506
    .line 507
    :cond_15
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 508
    .line 509
    .line 510
    move-result v3

    .line 511
    add-int/lit8 v8, v8, 0x1

    .line 512
    .line 513
    if-ne v3, v8, :cond_16

    .line 514
    .line 515
    const/4 v5, 0x0

    .line 516
    :goto_6
    move/from16 v3, v21

    .line 517
    .line 518
    goto/16 :goto_10

    .line 519
    .line 520
    :cond_16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 521
    .line 522
    const-string v2, "Extra text after the instant at position "

    .line 523
    .line 524
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    goto/16 :goto_16

    .line 539
    .line 540
    :cond_17
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 541
    .line 542
    .line 543
    move-result v12

    .line 544
    sub-int/2addr v12, v8

    .line 545
    if-le v12, v14, :cond_18

    .line 546
    .line 547
    new-instance v0, Ljava/lang/StringBuilder;

    .line 548
    .line 549
    const-string v2, "The UTC offset string \""

    .line 550
    .line 551
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    invoke-virtual {v1, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    const/16 v3, 0x10

    .line 567
    .line 568
    invoke-static {v3, v2}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    const-string v2, "\" is too long"

    .line 576
    .line 577
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    goto/16 :goto_16

    .line 589
    .line 590
    :cond_18
    rem-int/lit8 v20, v12, 0x3

    .line 591
    .line 592
    if-eqz v20, :cond_19

    .line 593
    .line 594
    new-instance v0, Ljava/lang/StringBuilder;

    .line 595
    .line 596
    const-string v2, "Invalid UTC offset string \""

    .line 597
    .line 598
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 602
    .line 603
    .line 604
    move-result v2

    .line 605
    invoke-virtual {v1, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 614
    .line 615
    .line 616
    const/16 v2, 0x22

    .line 617
    .line 618
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    goto/16 :goto_16

    .line 630
    .line 631
    :cond_19
    const/4 v14, 0x0

    .line 632
    :goto_7
    if-ge v14, v13, :cond_1c

    .line 633
    .line 634
    sget-object v24, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:[I

    .line 635
    .line 636
    aget v24, v24, v14

    .line 637
    .line 638
    add-int v13, v8, v24

    .line 639
    .line 640
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 641
    .line 642
    .line 643
    move-result v6

    .line 644
    if-lt v13, v6, :cond_1a

    .line 645
    .line 646
    goto :goto_8

    .line 647
    :cond_1a
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 648
    .line 649
    .line 650
    move-result v6

    .line 651
    if-eq v6, v11, :cond_1b

    .line 652
    .line 653
    const-string v0, "Expected \':\' at index "

    .line 654
    .line 655
    invoke-static {v13, v0, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 660
    .line 661
    .line 662
    move-result v2

    .line 663
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 664
    .line 665
    .line 666
    const/16 v2, 0x27

    .line 667
    .line 668
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    goto/16 :goto_16

    .line 680
    .line 681
    :cond_1b
    add-int/lit8 v14, v14, 0x1

    .line 682
    .line 683
    const/16 v6, 0x27

    .line 684
    .line 685
    const/4 v13, 0x2

    .line 686
    goto :goto_7

    .line 687
    :cond_1c
    :goto_8
    const/4 v6, 0x0

    .line 688
    :goto_9
    const/4 v13, 0x6

    .line 689
    if-ge v6, v13, :cond_1f

    .line 690
    .line 691
    sget-object v13, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:[I

    .line 692
    .line 693
    aget v13, v13, v6

    .line 694
    .line 695
    add-int/2addr v13, v8

    .line 696
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 697
    .line 698
    .line 699
    move-result v14

    .line 700
    if-lt v13, v14, :cond_1d

    .line 701
    .line 702
    goto :goto_a

    .line 703
    :cond_1d
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 704
    .line 705
    .line 706
    move-result v14

    .line 707
    move/from16 v25, v6

    .line 708
    .line 709
    const/16 v6, 0x30

    .line 710
    .line 711
    if-gt v6, v14, :cond_1e

    .line 712
    .line 713
    if-ge v14, v11, :cond_1e

    .line 714
    .line 715
    add-int/lit8 v13, v25, 0x1

    .line 716
    .line 717
    move v6, v13

    .line 718
    goto :goto_9

    .line 719
    :cond_1e
    const-string v0, "Expected an ASCII digit at index "

    .line 720
    .line 721
    invoke-static {v13, v0, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 726
    .line 727
    .line 728
    move-result v2

    .line 729
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 730
    .line 731
    .line 732
    const/16 v2, 0x27

    .line 733
    .line 734
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    goto/16 :goto_16

    .line 746
    .line 747
    :cond_1f
    :goto_a
    add-int/lit8 v5, v8, 0x1

    .line 748
    .line 749
    invoke-static {v5, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 750
    .line 751
    .line 752
    move-result v5

    .line 753
    const/4 v6, 0x3

    .line 754
    if-le v12, v6, :cond_20

    .line 755
    .line 756
    add-int/lit8 v6, v8, 0x4

    .line 757
    .line 758
    invoke-static {v6, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 759
    .line 760
    .line 761
    move-result v6

    .line 762
    :goto_b
    const/4 v13, 0x6

    .line 763
    goto :goto_c

    .line 764
    :cond_20
    const/4 v6, 0x0

    .line 765
    goto :goto_b

    .line 766
    :goto_c
    if-le v12, v13, :cond_21

    .line 767
    .line 768
    add-int/lit8 v11, v8, 0x7

    .line 769
    .line 770
    invoke-static {v11, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)I

    .line 771
    .line 772
    .line 773
    move-result v11

    .line 774
    :goto_d
    const/16 v12, 0x3b

    .line 775
    .line 776
    goto :goto_e

    .line 777
    :cond_21
    const/4 v11, 0x0

    .line 778
    goto :goto_d

    .line 779
    :goto_e
    if-le v6, v12, :cond_22

    .line 780
    .line 781
    new-instance v0, Ljava/lang/StringBuilder;

    .line 782
    .line 783
    const-string v2, "Expected offset-minute-of-hour in 0..59, got "

    .line 784
    .line 785
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    goto/16 :goto_16

    .line 800
    .line 801
    :cond_22
    if-le v11, v12, :cond_23

    .line 802
    .line 803
    new-instance v0, Ljava/lang/StringBuilder;

    .line 804
    .line 805
    const-string v2, "Expected offset-second-of-minute in 0..59, got "

    .line 806
    .line 807
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 811
    .line 812
    .line 813
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    goto/16 :goto_16

    .line 822
    .line 823
    :cond_23
    const/16 v12, 0x11

    .line 824
    .line 825
    if-le v5, v12, :cond_25

    .line 826
    .line 827
    const/16 v12, 0x12

    .line 828
    .line 829
    if-ne v5, v12, :cond_24

    .line 830
    .line 831
    if-nez v6, :cond_24

    .line 832
    .line 833
    if-eqz v11, :cond_25

    .line 834
    .line 835
    :cond_24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 836
    .line 837
    const-string v2, "Expected an offset in -18:00..+18:00, got "

    .line 838
    .line 839
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 840
    .line 841
    .line 842
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 843
    .line 844
    .line 845
    move-result v2

    .line 846
    invoke-virtual {v1, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 847
    .line 848
    .line 849
    move-result-object v2

    .line 850
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v2

    .line 854
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    goto/16 :goto_16

    .line 866
    .line 867
    :cond_25
    mul-int/lit16 v5, v5, 0xe10

    .line 868
    .line 869
    const/16 v8, 0x3c

    .line 870
    .line 871
    invoke-static {v6, v8, v5, v11}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 872
    .line 873
    .line 874
    move-result v5

    .line 875
    const/16 v12, 0x2d

    .line 876
    .line 877
    if-ne v3, v12, :cond_26

    .line 878
    .line 879
    const/4 v3, -0x1

    .line 880
    goto :goto_f

    .line 881
    :cond_26
    move/from16 v3, v21

    .line 882
    .line 883
    :goto_f
    mul-int/2addr v5, v3

    .line 884
    goto/16 :goto_6

    .line 885
    .line 886
    :goto_10
    if-gt v3, v0, :cond_34

    .line 887
    .line 888
    const/16 v6, 0xd

    .line 889
    .line 890
    if-ge v0, v6, :cond_34

    .line 891
    .line 892
    if-gt v3, v7, :cond_33

    .line 893
    .line 894
    and-int/lit8 v3, v9, 0x3

    .line 895
    .line 896
    if-nez v3, :cond_28

    .line 897
    .line 898
    rem-int/lit8 v6, v9, 0x64

    .line 899
    .line 900
    if-nez v6, :cond_27

    .line 901
    .line 902
    rem-int/lit16 v6, v9, 0x190

    .line 903
    .line 904
    if-nez v6, :cond_28

    .line 905
    .line 906
    :cond_27
    const/4 v6, 0x1

    .line 907
    :goto_11
    const/4 v8, 0x2

    .line 908
    goto :goto_12

    .line 909
    :cond_28
    const/4 v6, 0x0

    .line 910
    goto :goto_11

    .line 911
    :goto_12
    if-eq v0, v8, :cond_2a

    .line 912
    .line 913
    const/4 v8, 0x4

    .line 914
    if-eq v0, v8, :cond_29

    .line 915
    .line 916
    const/4 v13, 0x6

    .line 917
    if-eq v0, v13, :cond_29

    .line 918
    .line 919
    const/16 v6, 0x9

    .line 920
    .line 921
    if-eq v0, v6, :cond_29

    .line 922
    .line 923
    const/16 v6, 0xb

    .line 924
    .line 925
    if-eq v0, v6, :cond_29

    .line 926
    .line 927
    const/16 v6, 0x1f

    .line 928
    .line 929
    goto :goto_13

    .line 930
    :cond_29
    const/16 v6, 0x1e

    .line 931
    .line 932
    goto :goto_13

    .line 933
    :cond_2a
    if-eqz v6, :cond_2b

    .line 934
    .line 935
    const/16 v6, 0x1d

    .line 936
    .line 937
    goto :goto_13

    .line 938
    :cond_2b
    const/16 v6, 0x1c

    .line 939
    .line 940
    :goto_13
    if-gt v7, v6, :cond_33

    .line 941
    .line 942
    const/16 v6, 0x17

    .line 943
    .line 944
    if-le v10, v6, :cond_2c

    .line 945
    .line 946
    new-instance v0, Ljava/lang/StringBuilder;

    .line 947
    .line 948
    const-string v2, "Expected hour in 0..23, got "

    .line 949
    .line 950
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 954
    .line 955
    .line 956
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v0

    .line 960
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 961
    .line 962
    .line 963
    move-result-object v0

    .line 964
    goto/16 :goto_16

    .line 965
    .line 966
    :cond_2c
    const/16 v12, 0x3b

    .line 967
    .line 968
    if-le v2, v12, :cond_2d

    .line 969
    .line 970
    new-instance v0, Ljava/lang/StringBuilder;

    .line 971
    .line 972
    const-string v3, "Expected minute-of-hour in 0..59, got "

    .line 973
    .line 974
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 978
    .line 979
    .line 980
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 985
    .line 986
    .line 987
    move-result-object v0

    .line 988
    goto/16 :goto_16

    .line 989
    .line 990
    :cond_2d
    if-le v15, v12, :cond_2e

    .line 991
    .line 992
    new-instance v0, Ljava/lang/StringBuilder;

    .line 993
    .line 994
    const-string v2, "Expected second-of-minute in 0..59, got "

    .line 995
    .line 996
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 997
    .line 998
    .line 999
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    goto/16 :goto_16

    .line 1011
    .line 1012
    :cond_2e
    int-to-long v11, v9

    .line 1013
    const-wide/16 v13, 0x16d

    .line 1014
    .line 1015
    mul-long/2addr v13, v11

    .line 1016
    const-wide/16 v16, 0x0

    .line 1017
    .line 1018
    cmp-long v1, v11, v16

    .line 1019
    .line 1020
    if-ltz v1, :cond_2f

    .line 1021
    .line 1022
    const-wide/16 v16, 0x3

    .line 1023
    .line 1024
    add-long v16, v11, v16

    .line 1025
    .line 1026
    const-wide/16 v18, 0x4

    .line 1027
    .line 1028
    div-long v16, v16, v18

    .line 1029
    .line 1030
    const-wide/16 v18, 0x63

    .line 1031
    .line 1032
    add-long v18, v11, v18

    .line 1033
    .line 1034
    const-wide/16 v22, 0x64

    .line 1035
    .line 1036
    div-long v18, v18, v22

    .line 1037
    .line 1038
    sub-long v16, v16, v18

    .line 1039
    .line 1040
    const-wide/16 v18, 0x18f

    .line 1041
    .line 1042
    add-long v11, v11, v18

    .line 1043
    .line 1044
    const-wide/16 v18, 0x190

    .line 1045
    .line 1046
    div-long v11, v11, v18

    .line 1047
    .line 1048
    add-long v11, v11, v16

    .line 1049
    .line 1050
    add-long/2addr v11, v13

    .line 1051
    goto :goto_14

    .line 1052
    :cond_2f
    const-wide/16 v16, -0x4

    .line 1053
    .line 1054
    div-long v16, v11, v16

    .line 1055
    .line 1056
    const-wide/16 v18, -0x64

    .line 1057
    .line 1058
    div-long v18, v11, v18

    .line 1059
    .line 1060
    sub-long v16, v16, v18

    .line 1061
    .line 1062
    const-wide/16 v18, -0x190

    .line 1063
    .line 1064
    div-long v11, v11, v18

    .line 1065
    .line 1066
    add-long v11, v11, v16

    .line 1067
    .line 1068
    sub-long v11, v13, v11

    .line 1069
    .line 1070
    :goto_14
    mul-int/lit16 v1, v0, 0x16f

    .line 1071
    .line 1072
    add-int/lit16 v1, v1, -0x16a

    .line 1073
    .line 1074
    div-int/lit8 v1, v1, 0xc

    .line 1075
    .line 1076
    int-to-long v13, v1

    .line 1077
    add-long/2addr v11, v13

    .line 1078
    const/16 v21, 0x1

    .line 1079
    .line 1080
    add-int/lit8 v7, v7, -0x1

    .line 1081
    .line 1082
    int-to-long v6, v7

    .line 1083
    add-long/2addr v11, v6

    .line 1084
    const/4 v8, 0x2

    .line 1085
    if-le v0, v8, :cond_32

    .line 1086
    .line 1087
    const-wide/16 v0, -0x1

    .line 1088
    .line 1089
    add-long/2addr v0, v11

    .line 1090
    if-nez v3, :cond_31

    .line 1091
    .line 1092
    rem-int/lit8 v3, v9, 0x64

    .line 1093
    .line 1094
    if-nez v3, :cond_30

    .line 1095
    .line 1096
    rem-int/lit16 v9, v9, 0x190

    .line 1097
    .line 1098
    if-nez v9, :cond_31

    .line 1099
    .line 1100
    :cond_30
    move-wide v11, v0

    .line 1101
    goto :goto_15

    .line 1102
    :cond_31
    const-wide/16 v0, -0x2

    .line 1103
    .line 1104
    add-long/2addr v11, v0

    .line 1105
    :cond_32
    :goto_15
    const-wide/32 v0, 0xafaa8

    .line 1106
    .line 1107
    .line 1108
    sub-long/2addr v11, v0

    .line 1109
    mul-int/lit16 v10, v10, 0xe10

    .line 1110
    .line 1111
    const/16 v8, 0x3c

    .line 1112
    .line 1113
    invoke-static {v2, v8, v10, v15}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 1114
    .line 1115
    .line 1116
    move-result v0

    .line 1117
    const-wide/32 v1, 0x15180

    .line 1118
    .line 1119
    .line 1120
    mul-long/2addr v11, v1

    .line 1121
    int-to-long v0, v0

    .line 1122
    add-long/2addr v11, v0

    .line 1123
    int-to-long v0, v5

    .line 1124
    sub-long/2addr v11, v0

    .line 1125
    new-instance v0, Lkotlin/time/飘花落叶言子楪苏哲世兰;

    .line 1126
    .line 1127
    invoke-direct {v0, v11, v12, v4}, Lkotlin/time/飘花落叶言子楪苏哲世兰;-><init>(JI)V

    .line 1128
    .line 1129
    .line 1130
    goto :goto_16

    .line 1131
    :cond_33
    const-string v2, " of year "

    .line 1132
    .line 1133
    const-string v3, ", got "

    .line 1134
    .line 1135
    const-string v4, "Expected a valid day-of-month for month "

    .line 1136
    .line 1137
    invoke-static {v0, v9, v4, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v0

    .line 1148
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v0

    .line 1152
    goto :goto_16

    .line 1153
    :cond_34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1154
    .line 1155
    const-string v3, "Expected a month number in 1..12, got "

    .line 1156
    .line 1157
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v0

    .line 1167
    invoke-static {v1, v0}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)Lkotlin/time/飘花落叶言子楪苏世兰哲;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v0

    .line 1171
    :goto_16
    invoke-interface {v0}, Lkotlin/time/飘花落叶言子楪苏哲兰世;->toInstant()Lkotlin/time/Instant;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v0

    .line 1175
    return-object v0
.end method

.method public final getDescriptor()L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世哲子苏楪兰/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲子苏楪兰/飘花落叶言子苏世哲兰楪;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
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
    invoke-interface {p1, p0}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子苏世哲兰楪(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
