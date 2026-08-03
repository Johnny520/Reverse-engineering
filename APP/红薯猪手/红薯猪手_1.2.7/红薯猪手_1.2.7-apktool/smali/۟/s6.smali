.class public final L۟/s6;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Lorg/json/JSONObject;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ:L۟/s6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/s6;

    invoke-direct {v0}, L۟/s6;-><init>()V

    sput-object v0, L۟/s6;->ۥ:L۟/s6;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Lorg/json/JSONObject;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    new-array v1, v1, [B

    .line 7
    .line 8
    fill-array-data v1, :array_0

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x6

    .line 12
    new-array v3, v2, [B

    .line 13
    .line 14
    fill-array-data v3, :array_1

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1, v0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-boolean v1, L۟/y2;->ۥ:Z

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    new-array v3, v1, [B

    .line 28
    .line 29
    fill-array-data v3, :array_2

    .line 30
    .line 31
    .line 32
    new-array v4, v2, [B

    .line 33
    .line 34
    fill-array-data v4, :array_3

    .line 35
    .line 36
    .line 37
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    new-array v3, v1, [B

    .line 41
    .line 42
    fill-array-data v3, :array_4

    .line 43
    .line 44
    .line 45
    new-array v4, v2, [B

    .line 46
    .line 47
    fill-array-data v4, :array_5

    .line 48
    .line 49
    .line 50
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const/4 v4, 0x5

    .line 59
    const/4 v5, 0x0

    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    new-array v6, v4, [B

    .line 63
    .line 64
    fill-array-data v6, :array_6

    .line 65
    .line 66
    .line 67
    new-array v7, v2, [B

    .line 68
    .line 69
    fill-array-data v7, :array_7

    .line 70
    .line 71
    .line 72
    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    goto :goto_0

    .line 81
    :cond_0
    move-object v3, v5

    .line 82
    :goto_0
    if-eqz v3, :cond_b

    .line 83
    .line 84
    sget v6, L۟/o;->ۥ:I

    .line 85
    .line 86
    invoke-static {v3}, L۟/o;->ۥ۟ۡ(Lorg/json/JSONArray;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    const/4 v7, 0x0

    .line 91
    const/4 v8, 0x1

    .line 92
    if-ne v6, v8, :cond_1

    .line 93
    .line 94
    move v6, v8

    .line 95
    goto :goto_1

    .line 96
    :cond_1
    move v6, v7

    .line 97
    :goto_1
    if-eqz v6, :cond_b

    .line 98
    .line 99
    invoke-static {v3}, L۟/o;->ۥ۟ۤ(Lorg/json/JSONArray;)I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    :goto_2
    const/4 v9, -0x1

    .line 104
    if-ge v9, v6, :cond_b

    .line 105
    .line 106
    invoke-virtual {v3, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    if-eqz v9, :cond_a

    .line 111
    .line 112
    sget-object v10, L۟/y2;->ۥ۟ۡ:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    if-lez v10, :cond_2

    .line 119
    .line 120
    move v10, v8

    .line 121
    goto :goto_3

    .line 122
    :cond_2
    move v10, v7

    .line 123
    :goto_3
    const-string v11, "compile(...)"

    .line 124
    .line 125
    const-string v12, "pattern"

    .line 126
    .line 127
    const-string v13, ""

    .line 128
    .line 129
    const/16 v14, 0x42

    .line 130
    .line 131
    if-eqz v10, :cond_6

    .line 132
    .line 133
    new-array v10, v1, [B

    .line 134
    .line 135
    fill-array-data v10, :array_8

    .line 136
    .line 137
    .line 138
    new-array v15, v2, [B

    .line 139
    .line 140
    fill-array-data v15, :array_9

    .line 141
    .line 142
    .line 143
    invoke-static {v10, v15}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    if-eqz v10, :cond_3

    .line 152
    .line 153
    const/16 v15, 0x8

    .line 154
    .line 155
    new-array v15, v15, [B

    .line 156
    .line 157
    fill-array-data v15, :array_a

    .line 158
    .line 159
    .line 160
    new-array v1, v2, [B

    .line 161
    .line 162
    fill-array-data v1, :array_b

    .line 163
    .line 164
    .line 165
    invoke-static {v15, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    goto :goto_4

    .line 174
    :cond_3
    move-object v1, v5

    .line 175
    :goto_4
    if-nez v1, :cond_4

    .line 176
    .line 177
    move-object v1, v13

    .line 178
    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    if-lez v10, :cond_5

    .line 183
    .line 184
    move v10, v8

    .line 185
    goto :goto_5

    .line 186
    :cond_5
    move v10, v7

    .line 187
    :goto_5
    if-eqz v10, :cond_6

    .line 188
    .line 189
    sget-object v10, L۟/y2;->ۥ۟ۡ:Ljava/lang/String;

    .line 190
    .line 191
    sget-object v15, L۟/u8;->ۥ:[L۟/u8;

    .line 192
    .line 193
    invoke-static {v12, v10}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v10, v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 197
    .line 198
    .line 199
    move-result-object v10

    .line 200
    invoke-static {v11, v10}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v10, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-eqz v1, :cond_6

    .line 212
    .line 213
    goto :goto_9

    .line 214
    :cond_6
    sget-object v1, L۟/y2;->ۥ۟۠:Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-lez v1, :cond_7

    .line 221
    .line 222
    move v1, v8

    .line 223
    goto :goto_6

    .line 224
    :cond_7
    move v1, v7

    .line 225
    :goto_6
    if-eqz v1, :cond_a

    .line 226
    .line 227
    new-array v1, v4, [B

    .line 228
    .line 229
    fill-array-data v1, :array_c

    .line 230
    .line 231
    .line 232
    new-array v10, v2, [B

    .line 233
    .line 234
    fill-array-data v10, :array_d

    .line 235
    .line 236
    .line 237
    invoke-static {v1, v10}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    if-nez v1, :cond_8

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_8
    move-object v13, v1

    .line 249
    :goto_7
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    if-lez v1, :cond_9

    .line 254
    .line 255
    move v1, v8

    .line 256
    goto :goto_8

    .line 257
    :cond_9
    move v1, v7

    .line 258
    :goto_8
    if-eqz v1, :cond_a

    .line 259
    .line 260
    sget-object v1, L۟/y2;->ۥ۟۠:Ljava/lang/String;

    .line 261
    .line 262
    sget-object v9, L۟/u8;->ۥ:[L۟/u8;

    .line 263
    .line 264
    invoke-static {v12, v1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v1, v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-static {v11, v1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v13}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-eqz v1, :cond_a

    .line 283
    .line 284
    :goto_9
    invoke-virtual {v3, v6}, Lorg/json/JSONArray;->remove(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    :cond_a
    add-int/lit8 v6, v6, -0x1

    .line 288
    .line 289
    const/4 v1, 0x4

    .line 290
    goto/16 :goto_2

    .line 291
    .line 292
    :cond_b
    return-object v0

    .line 293
    :array_0
    .array-data 1
        -0x74t
        0x6dt
    .end array-data

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    nop

    .line 299
    :array_1
    .array-data 1
        -0x1bt
        0x19t
        -0x49t
        -0x32t
        0x35t
        -0x2bt
    .end array-data

    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    nop

    .line 307
    :array_2
    .array-data 1
        0xft
        0x6at
        0x31t
        -0x6dt
    .end array-data

    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    :array_3
    .array-data 1
        0x65t
        0x19t
        0x5et
        -0x3t
        0x10t
        -0x65t
    .end array-data

    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    nop

    .line 321
    :array_4
    .array-data 1
        0x75t
        -0x7ct
        0x14t
        0x69t
    .end array-data

    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    :array_5
    .array-data 1
        0x11t
        -0x1bt
        0x60t
        0x8t
        0x2ct
        0x58t
    .end array-data

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    nop

    .line 335
    :array_6
    .array-data 1
        0x77t
        0x54t
        0x1at
        0x55t
        -0x24t
    .end array-data

    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    nop

    .line 343
    :array_7
    .array-data 1
        0x19t
        0x3bt
        0x6et
        0x30t
        -0x51t
        0x5t
    .end array-data

    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    nop

    .line 351
    :array_8
    .array-data 1
        0x7ft
        -0x79t
        0x24t
        0xet
    .end array-data

    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    :array_9
    .array-data 1
        0xat
        -0xct
        0x41t
        0x7ct
        0x2at
        0x33t
    .end array-data

    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    nop

    .line 365
    :array_a
    .array-data 1
        -0x1bt
        0x32t
        -0x33t
        0x33t
        0x1dt
        -0x62t
        -0x1at
        0x3et
    .end array-data

    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    :array_b
    .array-data 1
        -0x75t
        0x5bt
        -0x52t
        0x58t
        0x73t
        -0x1t
    .end array-data

    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    nop

    .line 381
    :array_c
    .array-data 1
        -0x9t
        0x42t
        0x7bt
        -0x57t
        0x3bt
    .end array-data

    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    nop

    .line 389
    :array_d
    .array-data 1
        -0x7dt
        0x2bt
        0xft
        -0x3bt
        0x5et
        0x4t
    .end array-data
.end method
