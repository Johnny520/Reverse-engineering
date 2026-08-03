.class final Lcom/alibaba/fastjson2/JSONBDump;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static GB18030:Ljava/nio/charset/Charset;


# instance fields
.field final bytes:[B

.field final jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

.field lastReference:Ljava/lang/String;

.field offset:I

.field final raw:Z

.field strBegin:I

.field strlen:I

.field strtype:B

.field final symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

.field final symbols:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field type:B


# direct methods
.method public constructor <init>([BLcom/alibaba/fastjson2/SymbolTable;Z)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->symbols:Ljava/util/Map;

    .line 30
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 31
    iput-boolean p3, p0, Lcom/alibaba/fastjson2/JSONBDump;->raw:Z

    .line 32
    iput-object p2, p0, Lcom/alibaba/fastjson2/JSONBDump;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 33
    invoke-static {}, Lcom/alibaba/fastjson2/JSONWriter;->ofPretty()Lcom/alibaba/fastjson2/JSONWriter;

    move-result-object p1

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 34
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONBDump;->dumpAny()V

    return-void
.end method

.method public constructor <init>([BZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->symbols:Ljava/util/Map;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 12
    .line 13
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/JSONBDump;->raw:Z

    .line 14
    .line 15
    invoke-static {}, Lcom/alibaba/fastjson2/JSONWriter;->ofPretty()Lcom/alibaba/fastjson2/JSONWriter;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONBDump;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 23
    .line 24
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONBDump;->dumpAny()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private dumpAny()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 4
    .line 5
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-lt v1, v3, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    add-int/lit8 v3, v1, 0x1

    .line 12
    .line 13
    iput v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 14
    .line 15
    aget-byte v4, v2, v1

    .line 16
    .line 17
    iput-byte v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->type:B

    .line 18
    .line 19
    const/16 v5, -0x5a

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    if-eq v4, v5, :cond_21

    .line 23
    .line 24
    const/16 v7, 0x48

    .line 25
    .line 26
    const/16 v9, 0x10

    .line 27
    .line 28
    const/16 v10, 0x8

    .line 29
    .line 30
    if-eq v4, v7, :cond_20

    .line 31
    .line 32
    const/16 v11, -0x58

    .line 33
    .line 34
    if-eq v4, v11, :cond_1f

    .line 35
    .line 36
    const/16 v11, -0x57

    .line 37
    .line 38
    if-eq v4, v11, :cond_1e

    .line 39
    .line 40
    const/4 v11, 0x0

    .line 41
    const/4 v12, 0x1

    .line 42
    const-string v13, "#"

    .line 43
    .line 44
    packed-switch v4, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    const/16 v5, 0x3f

    .line 48
    .line 49
    const/16 v14, 0x2f

    .line 50
    .line 51
    const/16 v15, -0x10

    .line 52
    .line 53
    const/16 v16, 0x38

    .line 54
    .line 55
    const/16 v17, 0x18

    .line 56
    .line 57
    const/16 v8, 0x30

    .line 58
    .line 59
    const-wide/16 v18, 0xff

    .line 60
    .line 61
    packed-switch v4, :pswitch_data_1

    .line 62
    .line 63
    .line 64
    packed-switch v4, :pswitch_data_2

    .line 65
    .line 66
    .line 67
    if-lt v4, v15, :cond_1

    .line 68
    .line 69
    if-gt v4, v14, :cond_1

    .line 70
    .line 71
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 72
    .line 73
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(I)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_1
    const/16 v6, -0x28

    .line 78
    .line 79
    if-lt v4, v6, :cond_2

    .line 80
    .line 81
    const/16 v6, -0x11

    .line 82
    .line 83
    if-gt v4, v6, :cond_2

    .line 84
    .line 85
    add-int/lit8 v4, v4, 0x20

    .line 86
    .line 87
    int-to-long v1, v4

    .line 88
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 89
    .line 90
    invoke-virtual {v3, v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_2
    if-lt v4, v8, :cond_3

    .line 95
    .line 96
    if-gt v4, v5, :cond_3

    .line 97
    .line 98
    add-int/lit8 v4, v4, -0x38

    .line 99
    .line 100
    shl-int/2addr v4, v10

    .line 101
    add-int/lit8 v1, v1, 0x2

    .line 102
    .line 103
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 104
    .line 105
    aget-byte v1, v2, v3

    .line 106
    .line 107
    and-int/lit16 v1, v1, 0xff

    .line 108
    .line 109
    add-int/2addr v4, v1

    .line 110
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 111
    .line 112
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(I)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_3
    const/16 v5, 0x40

    .line 117
    .line 118
    if-lt v4, v5, :cond_4

    .line 119
    .line 120
    const/16 v5, 0x47

    .line 121
    .line 122
    if-gt v4, v5, :cond_4

    .line 123
    .line 124
    add-int/lit8 v4, v4, -0x44

    .line 125
    .line 126
    shl-int/2addr v4, v9

    .line 127
    add-int/lit8 v5, v1, 0x2

    .line 128
    .line 129
    iput v5, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 130
    .line 131
    aget-byte v3, v2, v3

    .line 132
    .line 133
    and-int/lit16 v3, v3, 0xff

    .line 134
    .line 135
    shl-int/2addr v3, v10

    .line 136
    add-int/2addr v4, v3

    .line 137
    add-int/lit8 v1, v1, 0x3

    .line 138
    .line 139
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 140
    .line 141
    aget-byte v1, v2, v5

    .line 142
    .line 143
    and-int/lit16 v1, v1, 0xff

    .line 144
    .line 145
    add-int/2addr v4, v1

    .line 146
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 147
    .line 148
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(I)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_4
    const/16 v5, -0x38

    .line 153
    .line 154
    if-lt v4, v5, :cond_5

    .line 155
    .line 156
    const/16 v5, -0x29

    .line 157
    .line 158
    if-gt v4, v5, :cond_5

    .line 159
    .line 160
    add-int/lit8 v4, v4, 0x30

    .line 161
    .line 162
    shl-int/2addr v4, v10

    .line 163
    add-int/lit8 v1, v1, 0x2

    .line 164
    .line 165
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 166
    .line 167
    aget-byte v1, v2, v3

    .line 168
    .line 169
    and-int/lit16 v1, v1, 0xff

    .line 170
    .line 171
    add-int/2addr v4, v1

    .line 172
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 173
    .line 174
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(I)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_5
    const/16 v5, -0x40

    .line 179
    .line 180
    if-lt v4, v5, :cond_6

    .line 181
    .line 182
    const/16 v5, -0x39

    .line 183
    .line 184
    if-gt v4, v5, :cond_6

    .line 185
    .line 186
    add-int/lit8 v4, v4, 0x3c

    .line 187
    .line 188
    shl-int/2addr v4, v9

    .line 189
    add-int/lit8 v5, v1, 0x2

    .line 190
    .line 191
    iput v5, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 192
    .line 193
    aget-byte v3, v2, v3

    .line 194
    .line 195
    and-int/lit16 v3, v3, 0xff

    .line 196
    .line 197
    shl-int/2addr v3, v10

    .line 198
    add-int/2addr v4, v3

    .line 199
    add-int/lit8 v1, v1, 0x3

    .line 200
    .line 201
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 202
    .line 203
    aget-byte v1, v2, v5

    .line 204
    .line 205
    and-int/lit16 v1, v1, 0xff

    .line 206
    .line 207
    add-int/2addr v4, v1

    .line 208
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 209
    .line 210
    int-to-long v2, v4

    .line 211
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :cond_6
    const/16 v1, -0x6c

    .line 216
    .line 217
    if-lt v4, v1, :cond_7

    .line 218
    .line 219
    const/16 v1, -0x5c

    .line 220
    .line 221
    if-gt v4, v1, :cond_7

    .line 222
    .line 223
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONBDump;->dumpArray()V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_7
    const/16 v1, 0x49

    .line 228
    .line 229
    if-lt v4, v1, :cond_a

    .line 230
    .line 231
    const/16 v1, 0x79

    .line 232
    .line 233
    if-gt v4, v1, :cond_a

    .line 234
    .line 235
    const/16 v1, 0x79

    .line 236
    .line 237
    if-ne v4, v1, :cond_8

    .line 238
    .line 239
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readLength()I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    goto :goto_0

    .line 244
    :cond_8
    add-int/lit8 v1, v4, -0x49

    .line 245
    .line 246
    :goto_0
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->strlen:I

    .line 247
    .line 248
    if-gez v1, :cond_9

    .line 249
    .line 250
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 251
    .line 252
    const-string v2, "{\"$symbol\":"

    .line 253
    .line 254
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 258
    .line 259
    iget v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->strlen:I

    .line 260
    .line 261
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(I)V

    .line 262
    .line 263
    .line 264
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 265
    .line 266
    const-string v2, "}"

    .line 267
    .line 268
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :cond_9
    new-instance v2, Ljava/lang/String;

    .line 273
    .line 274
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 275
    .line 276
    iget v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 277
    .line 278
    sget-object v5, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 279
    .line 280
    invoke-direct {v2, v3, v4, v1, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 281
    .line 282
    .line 283
    iget v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 284
    .line 285
    iget v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->strlen:I

    .line 286
    .line 287
    add-int/2addr v1, v3

    .line 288
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 289
    .line 290
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 291
    .line 292
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_a
    iget-byte v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->type:B

    .line 297
    .line 298
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    const-string v2, ", offset "

    .line 303
    .line 304
    iget v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 305
    .line 306
    const-string v4, "not support type : "

    .line 307
    .line 308
    invoke-static {v3, v1, v2, v4}, Lah/a;->f(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :pswitch_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->isInt()Z

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    if-eqz v1, :cond_c

    .line 317
    .line 318
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->raw:Z

    .line 323
    .line 324
    if-eqz v2, :cond_b

    .line 325
    .line 326
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 327
    .line 328
    new-instance v3, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    invoke-direct {v3, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :cond_b
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONBDump;->getString(I)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 349
    .line 350
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    return-void

    .line 354
    :cond_c
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 359
    .line 360
    .line 361
    move-result v2

    .line 362
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->symbols:Ljava/util/Map;

    .line 363
    .line 364
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    iget-boolean v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->raw:Z

    .line 372
    .line 373
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 374
    .line 375
    if-eqz v3, :cond_d

    .line 376
    .line 377
    new-instance v3, Ljava/lang/StringBuilder;

    .line 378
    .line 379
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-virtual {v4, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    return-void

    .line 399
    :cond_d
    invoke-virtual {v4, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    return-void

    .line 403
    :pswitch_1
    sget-object v1, Lcom/alibaba/fastjson2/JSONBDump;->GB18030:Ljava/nio/charset/Charset;

    .line 404
    .line 405
    if-nez v1, :cond_e

    .line 406
    .line 407
    const-string v1, "GB18030"

    .line 408
    .line 409
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    sput-object v1, Lcom/alibaba/fastjson2/JSONBDump;->GB18030:Ljava/nio/charset/Charset;

    .line 414
    .line 415
    :cond_e
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readLength()I

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    new-instance v2, Ljava/lang/String;

    .line 420
    .line 421
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 422
    .line 423
    iget v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 424
    .line 425
    sget-object v5, Lcom/alibaba/fastjson2/JSONBDump;->GB18030:Ljava/nio/charset/Charset;

    .line 426
    .line 427
    invoke-direct {v2, v3, v4, v1, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 428
    .line 429
    .line 430
    iget v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 431
    .line 432
    add-int/2addr v3, v1

    .line 433
    iput v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 434
    .line 435
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 436
    .line 437
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    return-void

    .line 441
    :pswitch_2
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readLength()I

    .line 442
    .line 443
    .line 444
    move-result v1

    .line 445
    new-instance v2, Ljava/lang/String;

    .line 446
    .line 447
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 448
    .line 449
    iget v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 450
    .line 451
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 452
    .line 453
    invoke-direct {v2, v3, v4, v1, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 454
    .line 455
    .line 456
    iget v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 457
    .line 458
    add-int/2addr v3, v1

    .line 459
    iput v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 460
    .line 461
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 462
    .line 463
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    return-void

    .line 467
    :pswitch_3
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readLength()I

    .line 468
    .line 469
    .line 470
    move-result v1

    .line 471
    new-instance v2, Ljava/lang/String;

    .line 472
    .line 473
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 474
    .line 475
    iget v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 476
    .line 477
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 478
    .line 479
    invoke-direct {v2, v3, v4, v1, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 480
    .line 481
    .line 482
    iget v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 483
    .line 484
    add-int/2addr v3, v1

    .line 485
    iput v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 486
    .line 487
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 488
    .line 489
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    return-void

    .line 493
    :pswitch_4
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readLength()I

    .line 494
    .line 495
    .line 496
    move-result v1

    .line 497
    new-instance v2, Ljava/lang/String;

    .line 498
    .line 499
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 500
    .line 501
    iget v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 502
    .line 503
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 504
    .line 505
    invoke-direct {v2, v3, v4, v1, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 506
    .line 507
    .line 508
    iget v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 509
    .line 510
    add-int/2addr v3, v1

    .line 511
    iput v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 512
    .line 513
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 514
    .line 515
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    return-void

    .line 519
    :pswitch_5
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readLength()I

    .line 520
    .line 521
    .line 522
    move-result v1

    .line 523
    new-instance v2, Ljava/lang/String;

    .line 524
    .line 525
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 526
    .line 527
    iget v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 528
    .line 529
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 530
    .line 531
    invoke-direct {v2, v3, v4, v1, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 532
    .line 533
    .line 534
    iget v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 535
    .line 536
    add-int/2addr v3, v1

    .line 537
    iput v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 538
    .line 539
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 540
    .line 541
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    return-void

    .line 545
    :pswitch_6
    add-int/lit8 v4, v1, 0x4

    .line 546
    .line 547
    aget-byte v4, v2, v4

    .line 548
    .line 549
    and-int/lit16 v4, v4, 0xff

    .line 550
    .line 551
    add-int/lit8 v5, v1, 0x3

    .line 552
    .line 553
    aget-byte v5, v2, v5

    .line 554
    .line 555
    and-int/lit16 v5, v5, 0xff

    .line 556
    .line 557
    shl-int/2addr v5, v10

    .line 558
    add-int/2addr v4, v5

    .line 559
    add-int/lit8 v5, v1, 0x2

    .line 560
    .line 561
    aget-byte v5, v2, v5

    .line 562
    .line 563
    and-int/lit16 v5, v5, 0xff

    .line 564
    .line 565
    shl-int/2addr v5, v9

    .line 566
    add-int/2addr v4, v5

    .line 567
    aget-byte v2, v2, v3

    .line 568
    .line 569
    shl-int/lit8 v2, v2, 0x18

    .line 570
    .line 571
    add-int/2addr v4, v2

    .line 572
    add-int/lit8 v1, v1, 0x5

    .line 573
    .line 574
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 575
    .line 576
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 577
    .line 578
    int-to-long v2, v4

    .line 579
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 580
    .line 581
    .line 582
    return-void

    .line 583
    :pswitch_7
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 584
    .line 585
    add-int/lit8 v1, v1, 0x2

    .line 586
    .line 587
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 588
    .line 589
    aget-byte v1, v2, v3

    .line 590
    .line 591
    invoke-virtual {v4, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt8(B)V

    .line 592
    .line 593
    .line 594
    return-void

    .line 595
    :pswitch_8
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 596
    .line 597
    add-int/lit8 v5, v1, 0x2

    .line 598
    .line 599
    iput v5, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 600
    .line 601
    aget-byte v3, v2, v3

    .line 602
    .line 603
    shl-int/2addr v3, v10

    .line 604
    add-int/lit8 v1, v1, 0x3

    .line 605
    .line 606
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 607
    .line 608
    aget-byte v1, v2, v5

    .line 609
    .line 610
    and-int/lit16 v1, v1, 0xff

    .line 611
    .line 612
    add-int/2addr v3, v1

    .line 613
    int-to-short v1, v3

    .line 614
    invoke-virtual {v4, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt16(S)V

    .line 615
    .line 616
    .line 617
    return-void

    .line 618
    :pswitch_9
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 619
    .line 620
    .line 621
    move-result v1

    .line 622
    new-array v2, v1, [B

    .line 623
    .line 624
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 625
    .line 626
    iget v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 627
    .line 628
    invoke-static {v3, v4, v2, v11, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 629
    .line 630
    .line 631
    iget v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 632
    .line 633
    add-int/2addr v3, v1

    .line 634
    iput v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 635
    .line 636
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 637
    .line 638
    new-instance v3, Ljava/math/BigInteger;

    .line 639
    .line 640
    invoke-direct {v3, v2}, Ljava/math/BigInteger;-><init>([B)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeBigInt(Ljava/math/BigInteger;)V

    .line 644
    .line 645
    .line 646
    return-void

    .line 647
    :pswitch_a
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 648
    .line 649
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt64Value()J

    .line 650
    .line 651
    .line 652
    move-result-wide v2

    .line 653
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 654
    .line 655
    .line 656
    return-void

    .line 657
    :pswitch_b
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 658
    .line 659
    .line 660
    move-result v1

    .line 661
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 662
    .line 663
    iget v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 664
    .line 665
    add-int/lit8 v4, v3, 0x1

    .line 666
    .line 667
    iput v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 668
    .line 669
    aget-byte v12, v2, v3

    .line 670
    .line 671
    const/16 v13, -0x46

    .line 672
    .line 673
    if-eq v12, v13, :cond_15

    .line 674
    .line 675
    const/16 v13, -0x42

    .line 676
    .line 677
    if-eq v12, v13, :cond_13

    .line 678
    .line 679
    if-eq v12, v7, :cond_12

    .line 680
    .line 681
    if-lt v12, v15, :cond_f

    .line 682
    .line 683
    if-gt v12, v14, :cond_f

    .line 684
    .line 685
    int-to-long v2, v12

    .line 686
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    goto/16 :goto_2

    .line 691
    .line 692
    :cond_f
    if-lt v12, v8, :cond_10

    .line 693
    .line 694
    if-gt v12, v5, :cond_10

    .line 695
    .line 696
    add-int/lit8 v12, v12, -0x38

    .line 697
    .line 698
    shl-int/lit8 v5, v12, 0x8

    .line 699
    .line 700
    add-int/lit8 v3, v3, 0x2

    .line 701
    .line 702
    iput v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 703
    .line 704
    aget-byte v2, v2, v4

    .line 705
    .line 706
    and-int/lit16 v2, v2, 0xff

    .line 707
    .line 708
    add-int/2addr v5, v2

    .line 709
    int-to-long v2, v5

    .line 710
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    goto :goto_2

    .line 715
    :cond_10
    const/16 v5, 0x40

    .line 716
    .line 717
    if-lt v12, v5, :cond_11

    .line 718
    .line 719
    const/16 v5, 0x47

    .line 720
    .line 721
    if-gt v12, v5, :cond_11

    .line 722
    .line 723
    add-int/lit8 v12, v12, -0x44

    .line 724
    .line 725
    shl-int/lit8 v5, v12, 0x10

    .line 726
    .line 727
    add-int/lit8 v7, v3, 0x2

    .line 728
    .line 729
    iput v7, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 730
    .line 731
    aget-byte v4, v2, v4

    .line 732
    .line 733
    and-int/lit16 v4, v4, 0xff

    .line 734
    .line 735
    shl-int/2addr v4, v10

    .line 736
    add-int/2addr v5, v4

    .line 737
    add-int/lit8 v3, v3, 0x3

    .line 738
    .line 739
    iput v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 740
    .line 741
    aget-byte v2, v2, v7

    .line 742
    .line 743
    and-int/lit16 v2, v2, 0xff

    .line 744
    .line 745
    add-int/2addr v5, v2

    .line 746
    int-to-long v2, v5

    .line 747
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 748
    .line 749
    .line 750
    move-result-object v2

    .line 751
    goto :goto_2

    .line 752
    :cond_11
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 753
    .line 754
    .line 755
    move-result v2

    .line 756
    new-array v3, v2, [B

    .line 757
    .line 758
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 759
    .line 760
    iget v5, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 761
    .line 762
    invoke-static {v4, v5, v3, v11, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 763
    .line 764
    .line 765
    iget v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 766
    .line 767
    add-int/2addr v4, v2

    .line 768
    iput v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 769
    .line 770
    new-instance v2, Ljava/math/BigInteger;

    .line 771
    .line 772
    invoke-direct {v2, v3}, Ljava/math/BigInteger;-><init>([B)V

    .line 773
    .line 774
    .line 775
    goto :goto_2

    .line 776
    :cond_12
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 777
    .line 778
    .line 779
    move-result v2

    .line 780
    int-to-long v2, v2

    .line 781
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    goto :goto_2

    .line 786
    :cond_13
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 787
    .line 788
    sget-wide v7, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 789
    .line 790
    int-to-long v4, v4

    .line 791
    add-long/2addr v7, v4

    .line 792
    invoke-virtual {v3, v2, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 793
    .line 794
    .line 795
    move-result-wide v2

    .line 796
    sget-boolean v4, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 797
    .line 798
    if-eqz v4, :cond_14

    .line 799
    .line 800
    goto :goto_1

    .line 801
    :cond_14
    invoke-static {v2, v3}, Ljava/lang/Long;->reverseBytes(J)J

    .line 802
    .line 803
    .line 804
    move-result-wide v2

    .line 805
    :goto_1
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 806
    .line 807
    .line 808
    move-result-object v2

    .line 809
    iget v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 810
    .line 811
    add-int/2addr v3, v10

    .line 812
    iput v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 813
    .line 814
    goto :goto_2

    .line 815
    :cond_15
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt64Value()J

    .line 816
    .line 817
    .line 818
    move-result-wide v2

    .line 819
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 820
    .line 821
    .line 822
    move-result-object v2

    .line 823
    :goto_2
    if-nez v1, :cond_16

    .line 824
    .line 825
    new-instance v1, Ljava/math/BigDecimal;

    .line 826
    .line 827
    invoke-direct {v1, v2}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 828
    .line 829
    .line 830
    goto :goto_3

    .line 831
    :cond_16
    new-instance v3, Ljava/math/BigDecimal;

    .line 832
    .line 833
    invoke-direct {v3, v2, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 834
    .line 835
    .line 836
    move-object v1, v3

    .line 837
    :goto_3
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 838
    .line 839
    const-wide/16 v3, 0x0

    .line 840
    .line 841
    invoke-virtual {v2, v1, v3, v4, v6}, Lcom/alibaba/fastjson2/JSONWriter;->writeDecimal(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    .line 842
    .line 843
    .line 844
    return-void

    .line 845
    :pswitch_c
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 846
    .line 847
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt64Value()J

    .line 848
    .line 849
    .line 850
    move-result-wide v2

    .line 851
    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 852
    .line 853
    .line 854
    move-result-object v2

    .line 855
    const-wide/16 v3, 0x0

    .line 856
    .line 857
    invoke-virtual {v1, v2, v3, v4, v6}, Lcom/alibaba/fastjson2/JSONWriter;->writeDecimal(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    .line 858
    .line 859
    .line 860
    return-void

    .line 861
    :pswitch_d
    add-int/lit8 v4, v1, 0x4

    .line 862
    .line 863
    aget-byte v4, v2, v4

    .line 864
    .line 865
    and-int/lit16 v4, v4, 0xff

    .line 866
    .line 867
    add-int/lit8 v5, v1, 0x3

    .line 868
    .line 869
    aget-byte v5, v2, v5

    .line 870
    .line 871
    and-int/lit16 v5, v5, 0xff

    .line 872
    .line 873
    shl-int/2addr v5, v10

    .line 874
    add-int/2addr v4, v5

    .line 875
    add-int/lit8 v5, v1, 0x2

    .line 876
    .line 877
    aget-byte v5, v2, v5

    .line 878
    .line 879
    and-int/lit16 v5, v5, 0xff

    .line 880
    .line 881
    shl-int/2addr v5, v9

    .line 882
    add-int/2addr v4, v5

    .line 883
    aget-byte v2, v2, v3

    .line 884
    .line 885
    shl-int/lit8 v2, v2, 0x18

    .line 886
    .line 887
    add-int/2addr v4, v2

    .line 888
    add-int/lit8 v1, v1, 0x5

    .line 889
    .line 890
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 891
    .line 892
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 893
    .line 894
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 895
    .line 896
    .line 897
    move-result v2

    .line 898
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeFloat(F)V

    .line 899
    .line 900
    .line 901
    return-void

    .line 902
    :pswitch_e
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 903
    .line 904
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 905
    .line 906
    .line 907
    move-result v2

    .line 908
    int-to-float v2, v2

    .line 909
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeFloat(F)V

    .line 910
    .line 911
    .line 912
    return-void

    .line 913
    :pswitch_f
    add-int/lit8 v4, v1, 0x8

    .line 914
    .line 915
    aget-byte v4, v2, v4

    .line 916
    .line 917
    int-to-long v4, v4

    .line 918
    and-long v4, v4, v18

    .line 919
    .line 920
    add-int/lit8 v6, v1, 0x7

    .line 921
    .line 922
    aget-byte v6, v2, v6

    .line 923
    .line 924
    int-to-long v6, v6

    .line 925
    and-long v6, v6, v18

    .line 926
    .line 927
    shl-long/2addr v6, v10

    .line 928
    add-long/2addr v4, v6

    .line 929
    add-int/lit8 v6, v1, 0x6

    .line 930
    .line 931
    aget-byte v6, v2, v6

    .line 932
    .line 933
    int-to-long v6, v6

    .line 934
    and-long v6, v6, v18

    .line 935
    .line 936
    shl-long/2addr v6, v9

    .line 937
    add-long/2addr v4, v6

    .line 938
    add-int/lit8 v6, v1, 0x5

    .line 939
    .line 940
    aget-byte v6, v2, v6

    .line 941
    .line 942
    int-to-long v6, v6

    .line 943
    and-long v6, v6, v18

    .line 944
    .line 945
    shl-long v6, v6, v17

    .line 946
    .line 947
    add-long/2addr v4, v6

    .line 948
    add-int/lit8 v6, v1, 0x4

    .line 949
    .line 950
    aget-byte v6, v2, v6

    .line 951
    .line 952
    int-to-long v6, v6

    .line 953
    and-long v6, v6, v18

    .line 954
    .line 955
    const/16 v9, 0x20

    .line 956
    .line 957
    shl-long/2addr v6, v9

    .line 958
    add-long/2addr v4, v6

    .line 959
    add-int/lit8 v6, v1, 0x3

    .line 960
    .line 961
    aget-byte v6, v2, v6

    .line 962
    .line 963
    int-to-long v6, v6

    .line 964
    and-long v6, v6, v18

    .line 965
    .line 966
    const/16 v9, 0x28

    .line 967
    .line 968
    shl-long/2addr v6, v9

    .line 969
    add-long/2addr v4, v6

    .line 970
    add-int/lit8 v6, v1, 0x2

    .line 971
    .line 972
    aget-byte v6, v2, v6

    .line 973
    .line 974
    int-to-long v6, v6

    .line 975
    and-long v6, v6, v18

    .line 976
    .line 977
    shl-long/2addr v6, v8

    .line 978
    add-long/2addr v4, v6

    .line 979
    aget-byte v2, v2, v3

    .line 980
    .line 981
    int-to-long v2, v2

    .line 982
    shl-long v2, v2, v16

    .line 983
    .line 984
    add-long/2addr v4, v2

    .line 985
    add-int/lit8 v1, v1, 0x9

    .line 986
    .line 987
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 988
    .line 989
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 990
    .line 991
    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 992
    .line 993
    .line 994
    move-result-wide v2

    .line 995
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeDouble(D)V

    .line 996
    .line 997
    .line 998
    return-void

    .line 999
    :pswitch_10
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1000
    .line 1001
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt64Value()J

    .line 1002
    .line 1003
    .line 1004
    move-result-wide v2

    .line 1005
    long-to-double v2, v2

    .line 1006
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeDouble(D)V

    .line 1007
    .line 1008
    .line 1009
    return-void

    .line 1010
    :pswitch_11
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1011
    .line 1012
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 1013
    .line 1014
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeDouble(D)V

    .line 1015
    .line 1016
    .line 1017
    return-void

    .line 1018
    :pswitch_12
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1019
    .line 1020
    const-wide/16 v2, 0x0

    .line 1021
    .line 1022
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeDouble(D)V

    .line 1023
    .line 1024
    .line 1025
    return-void

    .line 1026
    :pswitch_13
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1027
    .line 1028
    invoke-virtual {v1, v12}, Lcom/alibaba/fastjson2/JSONWriter;->writeBool(Z)V

    .line 1029
    .line 1030
    .line 1031
    return-void

    .line 1032
    :pswitch_14
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1033
    .line 1034
    invoke-virtual {v1, v11}, Lcom/alibaba/fastjson2/JSONWriter;->writeBool(Z)V

    .line 1035
    .line 1036
    .line 1037
    return-void

    .line 1038
    :pswitch_15
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1039
    .line 1040
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 1041
    .line 1042
    .line 1043
    return-void

    .line 1044
    :pswitch_16
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt64Value()J

    .line 1045
    .line 1046
    .line 1047
    move-result-wide v1

    .line 1048
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 1049
    .line 1050
    .line 1051
    move-result v3

    .line 1052
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1053
    .line 1054
    invoke-virtual {v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInstant(JI)V

    .line 1055
    .line 1056
    .line 1057
    return-void

    .line 1058
    :pswitch_17
    add-int/lit8 v4, v1, 0x8

    .line 1059
    .line 1060
    aget-byte v4, v2, v4

    .line 1061
    .line 1062
    int-to-long v4, v4

    .line 1063
    and-long v4, v4, v18

    .line 1064
    .line 1065
    add-int/lit8 v6, v1, 0x7

    .line 1066
    .line 1067
    aget-byte v6, v2, v6

    .line 1068
    .line 1069
    int-to-long v6, v6

    .line 1070
    and-long v6, v6, v18

    .line 1071
    .line 1072
    shl-long/2addr v6, v10

    .line 1073
    add-long/2addr v4, v6

    .line 1074
    add-int/lit8 v6, v1, 0x6

    .line 1075
    .line 1076
    aget-byte v6, v2, v6

    .line 1077
    .line 1078
    int-to-long v6, v6

    .line 1079
    and-long v6, v6, v18

    .line 1080
    .line 1081
    shl-long/2addr v6, v9

    .line 1082
    add-long/2addr v4, v6

    .line 1083
    add-int/lit8 v6, v1, 0x5

    .line 1084
    .line 1085
    aget-byte v6, v2, v6

    .line 1086
    .line 1087
    int-to-long v6, v6

    .line 1088
    and-long v6, v6, v18

    .line 1089
    .line 1090
    shl-long v6, v6, v17

    .line 1091
    .line 1092
    add-long/2addr v4, v6

    .line 1093
    add-int/lit8 v6, v1, 0x4

    .line 1094
    .line 1095
    aget-byte v6, v2, v6

    .line 1096
    .line 1097
    int-to-long v6, v6

    .line 1098
    and-long v6, v6, v18

    .line 1099
    .line 1100
    const/16 v9, 0x20

    .line 1101
    .line 1102
    shl-long/2addr v6, v9

    .line 1103
    add-long/2addr v4, v6

    .line 1104
    add-int/lit8 v6, v1, 0x3

    .line 1105
    .line 1106
    aget-byte v6, v2, v6

    .line 1107
    .line 1108
    int-to-long v6, v6

    .line 1109
    and-long v6, v6, v18

    .line 1110
    .line 1111
    const/16 v9, 0x28

    .line 1112
    .line 1113
    shl-long/2addr v6, v9

    .line 1114
    add-long/2addr v4, v6

    .line 1115
    add-int/lit8 v6, v1, 0x2

    .line 1116
    .line 1117
    aget-byte v6, v2, v6

    .line 1118
    .line 1119
    int-to-long v6, v6

    .line 1120
    and-long v6, v6, v18

    .line 1121
    .line 1122
    shl-long/2addr v6, v8

    .line 1123
    add-long/2addr v4, v6

    .line 1124
    aget-byte v2, v2, v3

    .line 1125
    .line 1126
    int-to-long v2, v2

    .line 1127
    shl-long v2, v2, v16

    .line 1128
    .line 1129
    add-long/2addr v4, v2

    .line 1130
    add-int/lit8 v1, v1, 0x9

    .line 1131
    .line 1132
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1133
    .line 1134
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1135
    .line 1136
    invoke-virtual {v1, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 1137
    .line 1138
    .line 1139
    return-void

    .line 1140
    :pswitch_18
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONBDump;->dumpReference()V

    .line 1141
    .line 1142
    .line 1143
    return-void

    .line 1144
    :pswitch_19
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->isInt()Z

    .line 1145
    .line 1146
    .line 1147
    move-result v1

    .line 1148
    if-eqz v1, :cond_17

    .line 1149
    .line 1150
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 1151
    .line 1152
    .line 1153
    move-result v1

    .line 1154
    goto :goto_4

    .line 1155
    :cond_17
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readString()Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v6

    .line 1159
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 1160
    .line 1161
    .line 1162
    move-result v1

    .line 1163
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->symbols:Ljava/util/Map;

    .line 1164
    .line 1165
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v3

    .line 1169
    invoke-interface {v2, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1170
    .line 1171
    .line 1172
    :goto_4
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->raw:Z

    .line 1173
    .line 1174
    if-nez v2, :cond_19

    .line 1175
    .line 1176
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 1177
    .line 1178
    iget v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1179
    .line 1180
    aget-byte v2, v2, v3

    .line 1181
    .line 1182
    if-ne v2, v5, :cond_19

    .line 1183
    .line 1184
    if-nez v6, :cond_18

    .line 1185
    .line 1186
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONBDump;->getString(I)Ljava/lang/String;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v6

    .line 1190
    :cond_18
    iget v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1191
    .line 1192
    add-int/2addr v1, v12

    .line 1193
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1194
    .line 1195
    invoke-direct {v0, v6}, Lcom/alibaba/fastjson2/JSONBDump;->dumpObject(Ljava/lang/String;)V

    .line 1196
    .line 1197
    .line 1198
    return-void

    .line 1199
    :cond_19
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1200
    .line 1201
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->startObject()V

    .line 1202
    .line 1203
    .line 1204
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1205
    .line 1206
    const-string v3, "@type"

    .line 1207
    .line 1208
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 1209
    .line 1210
    .line 1211
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1212
    .line 1213
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeColon()V

    .line 1214
    .line 1215
    .line 1216
    if-nez v6, :cond_1c

    .line 1217
    .line 1218
    if-gez v1, :cond_1b

    .line 1219
    .line 1220
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->raw:Z

    .line 1221
    .line 1222
    if-eqz v2, :cond_1a

    .line 1223
    .line 1224
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1225
    .line 1226
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1227
    .line 1228
    invoke-direct {v3, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v1

    .line 1238
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 1239
    .line 1240
    .line 1241
    goto :goto_5

    .line 1242
    :cond_1a
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 1243
    .line 1244
    neg-int v1, v1

    .line 1245
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/SymbolTable;->getName(I)Ljava/lang/String;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v1

    .line 1249
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1250
    .line 1251
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 1252
    .line 1253
    .line 1254
    goto :goto_5

    .line 1255
    :cond_1b
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1256
    .line 1257
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1258
    .line 1259
    invoke-direct {v3, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v1

    .line 1269
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 1270
    .line 1271
    .line 1272
    goto :goto_5

    .line 1273
    :cond_1c
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->raw:Z

    .line 1274
    .line 1275
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1276
    .line 1277
    if-eqz v2, :cond_1d

    .line 1278
    .line 1279
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1280
    .line 1281
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1291
    .line 1292
    .line 1293
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v1

    .line 1297
    invoke-virtual {v3, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 1298
    .line 1299
    .line 1300
    goto :goto_5

    .line 1301
    :cond_1d
    invoke-virtual {v3, v6}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 1302
    .line 1303
    .line 1304
    :goto_5
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1305
    .line 1306
    const-string v2, "@value"

    .line 1307
    .line 1308
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 1309
    .line 1310
    .line 1311
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1312
    .line 1313
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeColon()V

    .line 1314
    .line 1315
    .line 1316
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONBDump;->dumpAny()V

    .line 1317
    .line 1318
    .line 1319
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1320
    .line 1321
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->endObject()V

    .line 1322
    .line 1323
    .line 1324
    return-void

    .line 1325
    :pswitch_1a
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 1326
    .line 1327
    .line 1328
    move-result v1

    .line 1329
    new-array v2, v1, [B

    .line 1330
    .line 1331
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 1332
    .line 1333
    iget v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1334
    .line 1335
    invoke-static {v3, v4, v2, v11, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1336
    .line 1337
    .line 1338
    iget v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1339
    .line 1340
    add-int/2addr v3, v1

    .line 1341
    iput v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1342
    .line 1343
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1344
    .line 1345
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeBinary([B)V

    .line 1346
    .line 1347
    .line 1348
    return-void

    .line 1349
    :pswitch_1b
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 1350
    .line 1351
    .line 1352
    move-result v1

    .line 1353
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1354
    .line 1355
    int-to-char v1, v1

    .line 1356
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeChar(C)V

    .line 1357
    .line 1358
    .line 1359
    return-void

    .line 1360
    :cond_1e
    add-int/lit8 v4, v1, 0x2

    .line 1361
    .line 1362
    iput v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1363
    .line 1364
    aget-byte v3, v2, v3

    .line 1365
    .line 1366
    shl-int/2addr v3, v10

    .line 1367
    add-int/lit8 v5, v1, 0x3

    .line 1368
    .line 1369
    iput v5, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1370
    .line 1371
    aget-byte v4, v2, v4

    .line 1372
    .line 1373
    and-int/lit16 v4, v4, 0xff

    .line 1374
    .line 1375
    add-int/2addr v3, v4

    .line 1376
    add-int/lit8 v4, v1, 0x4

    .line 1377
    .line 1378
    iput v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1379
    .line 1380
    aget-byte v5, v2, v5

    .line 1381
    .line 1382
    add-int/lit8 v1, v1, 0x5

    .line 1383
    .line 1384
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1385
    .line 1386
    aget-byte v1, v2, v4

    .line 1387
    .line 1388
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1389
    .line 1390
    invoke-virtual {v2, v3, v5, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateYYYMMDD10(III)V

    .line 1391
    .line 1392
    .line 1393
    return-void

    .line 1394
    :cond_1f
    add-int/lit8 v4, v1, 0x2

    .line 1395
    .line 1396
    iput v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1397
    .line 1398
    aget-byte v3, v2, v3

    .line 1399
    .line 1400
    shl-int/2addr v3, v10

    .line 1401
    add-int/lit8 v5, v1, 0x3

    .line 1402
    .line 1403
    iput v5, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1404
    .line 1405
    aget-byte v4, v2, v4

    .line 1406
    .line 1407
    and-int/lit16 v4, v4, 0xff

    .line 1408
    .line 1409
    add-int v11, v3, v4

    .line 1410
    .line 1411
    add-int/lit8 v3, v1, 0x4

    .line 1412
    .line 1413
    iput v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1414
    .line 1415
    aget-byte v12, v2, v5

    .line 1416
    .line 1417
    add-int/lit8 v4, v1, 0x5

    .line 1418
    .line 1419
    iput v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1420
    .line 1421
    aget-byte v13, v2, v3

    .line 1422
    .line 1423
    add-int/lit8 v3, v1, 0x6

    .line 1424
    .line 1425
    iput v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1426
    .line 1427
    aget-byte v14, v2, v4

    .line 1428
    .line 1429
    add-int/lit8 v4, v1, 0x7

    .line 1430
    .line 1431
    iput v4, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1432
    .line 1433
    aget-byte v15, v2, v3

    .line 1434
    .line 1435
    add-int/2addr v1, v10

    .line 1436
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1437
    .line 1438
    aget-byte v16, v2, v4

    .line 1439
    .line 1440
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 1441
    .line 1442
    .line 1443
    move-result v17

    .line 1444
    invoke-static/range {v11 .. v17}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v1

    .line 1448
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1449
    .line 1450
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeLocalDateTime(Ljava/time/LocalDateTime;)V

    .line 1451
    .line 1452
    .line 1453
    return-void

    .line 1454
    :cond_20
    const/16 v17, 0x18

    .line 1455
    .line 1456
    :pswitch_1c
    add-int/lit8 v4, v1, 0x4

    .line 1457
    .line 1458
    aget-byte v4, v2, v4

    .line 1459
    .line 1460
    and-int/lit16 v4, v4, 0xff

    .line 1461
    .line 1462
    add-int/lit8 v5, v1, 0x3

    .line 1463
    .line 1464
    aget-byte v5, v2, v5

    .line 1465
    .line 1466
    and-int/lit16 v5, v5, 0xff

    .line 1467
    .line 1468
    shl-int/2addr v5, v10

    .line 1469
    add-int/2addr v4, v5

    .line 1470
    add-int/lit8 v5, v1, 0x2

    .line 1471
    .line 1472
    aget-byte v5, v2, v5

    .line 1473
    .line 1474
    and-int/lit16 v5, v5, 0xff

    .line 1475
    .line 1476
    shl-int/2addr v5, v9

    .line 1477
    add-int/2addr v4, v5

    .line 1478
    aget-byte v2, v2, v3

    .line 1479
    .line 1480
    shl-int/lit8 v2, v2, 0x18

    .line 1481
    .line 1482
    add-int/2addr v4, v2

    .line 1483
    add-int/lit8 v1, v1, 0x5

    .line 1484
    .line 1485
    iput v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 1486
    .line 1487
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 1488
    .line 1489
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(I)V

    .line 1490
    .line 1491
    .line 1492
    return-void

    .line 1493
    :cond_21
    invoke-direct {v0, v6}, Lcom/alibaba/fastjson2/JSONBDump;->dumpObject(Ljava/lang/String;)V

    .line 1494
    .line 1495
    .line 1496
    return-void

    .line 1497
    :pswitch_data_0
    .packed-switch -0x70
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
    .end packed-switch

    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    :pswitch_data_1
    .packed-switch -0x55
        :pswitch_17
        :pswitch_1c
        :pswitch_1c
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
        :pswitch_17
        :pswitch_6
    .end packed-switch

    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    :pswitch_data_2
    .packed-switch 0x7a
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private dumpArray()V
    .locals 3

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->type:B

    .line 2
    .line 3
    const/16 v1, -0x5c

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->readLength()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    add-int/lit8 v0, v0, 0x6c

    .line 13
    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 17
    .line 18
    const-string v1, "[]"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const/4 v1, 0x1

    .line 25
    if-ne v0, v1, :cond_3

    .line 26
    .line 27
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 28
    .line 29
    iget v2, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 30
    .line 31
    aget-byte v1, v1, v2

    .line 32
    .line 33
    iput-byte v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->type:B

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->isInt()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    iget-byte v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->type:B

    .line 42
    .line 43
    const/16 v2, -0x51

    .line 44
    .line 45
    if-eq v1, v2, :cond_2

    .line 46
    .line 47
    const/16 v2, 0x49

    .line 48
    .line 49
    if-lt v1, v2, :cond_3

    .line 50
    .line 51
    const/16 v2, 0x78

    .line 52
    .line 53
    if-gt v1, v2, :cond_3

    .line 54
    .line 55
    :cond_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 56
    .line 57
    const-string v1, "["

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONBDump;->dumpAny()V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 66
    .line 67
    const-string v1, "]"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->startArray()V

    .line 76
    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    :goto_1
    if-ge v1, v0, :cond_6

    .line 80
    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeComma()V

    .line 86
    .line 87
    .line 88
    :cond_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->isReference()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONBDump;->dumpReference()V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONBDump;->dumpAny()V

    .line 99
    .line 100
    .line 101
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_6
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriter;->endArray()V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method private dumpObject(Ljava/lang/String;)V
    .locals 6

    .line 1
    const/16 v0, -0x5b

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->startObject()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 11
    .line 12
    const-string v2, "@type"

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeColon()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 29
    .line 30
    iget v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 31
    .line 32
    aget-byte p1, p1, v1

    .line 33
    .line 34
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 35
    .line 36
    if-ne p1, v0, :cond_1

    .line 37
    .line 38
    const-string p1, "{}"

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget p1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 44
    .line 45
    add-int/lit8 p1, p1, 0x1

    .line 46
    .line 47
    iput p1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->startObject()V

    .line 51
    .line 52
    .line 53
    :goto_0
    const/4 p1, 0x0

    .line 54
    :goto_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 55
    .line 56
    iget v2, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 57
    .line 58
    aget-byte v1, v1, v2

    .line 59
    .line 60
    const/16 v3, -0x6d

    .line 61
    .line 62
    if-eq v1, v3, :cond_e

    .line 63
    .line 64
    if-eq v1, v0, :cond_d

    .line 65
    .line 66
    const/16 v3, 0x7f

    .line 67
    .line 68
    if-eq v1, v3, :cond_8

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->isString()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->readString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_2

    .line 86
    .line 87
    :cond_2
    const/16 v2, -0x10

    .line 88
    .line 89
    if-lt v1, v2, :cond_3

    .line 90
    .line 91
    const/16 v2, 0x48

    .line 92
    .line 93
    if-gt v1, v2, :cond_3

    .line 94
    .line 95
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(I)V

    .line 102
    .line 103
    .line 104
    goto/16 :goto_2

    .line 105
    .line 106
    :cond_3
    const/16 v2, -0x28

    .line 107
    .line 108
    if-lt v1, v2, :cond_4

    .line 109
    .line 110
    const/16 v2, -0x11

    .line 111
    .line 112
    if-le v1, v2, :cond_5

    .line 113
    .line 114
    :cond_4
    const/16 v2, -0x42

    .line 115
    .line 116
    if-ne v1, v2, :cond_6

    .line 117
    .line 118
    :cond_5
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt64Value()J

    .line 121
    .line 122
    .line 123
    move-result-wide v2

    .line 124
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(J)V

    .line 125
    .line 126
    .line 127
    goto/16 :goto_2

    .line 128
    .line 129
    :cond_6
    if-eqz p1, :cond_7

    .line 130
    .line 131
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 132
    .line 133
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeComma()V

    .line 134
    .line 135
    .line 136
    :cond_7
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONBDump;->dumpAny()V

    .line 137
    .line 138
    .line 139
    goto/16 :goto_2

    .line 140
    .line 141
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 142
    .line 143
    iput v2, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 144
    .line 145
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->isInt()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    const-string v2, "#"

    .line 150
    .line 151
    if-eqz v1, :cond_b

    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    iget-boolean v3, p0, Lcom/alibaba/fastjson2/JSONBDump;->raw:Z

    .line 158
    .line 159
    if-eqz v3, :cond_9

    .line 160
    .line 161
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 162
    .line 163
    new-instance v4, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v3, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_9
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONBDump;->symbols:Ljava/util/Map;

    .line 180
    .line 181
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    check-cast v2, Ljava/lang/String;

    .line 190
    .line 191
    if-eqz v2, :cond_a

    .line 192
    .line 193
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 194
    .line 195
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_a
    const-string p1, "symbol not found "

    .line 200
    .line 201
    invoke-static {v1, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :cond_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->readString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->readInt32Value()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONBDump;->symbols:Ljava/util/Map;

    .line 218
    .line 219
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-interface {v4, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    iget-boolean v4, p0, Lcom/alibaba/fastjson2/JSONBDump;->raw:Z

    .line 227
    .line 228
    iget-object v5, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 229
    .line 230
    if-eqz v4, :cond_c

    .line 231
    .line 232
    new-instance v4, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-virtual {v5, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_c
    invoke-virtual {v5, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_d
    add-int/lit8 v2, v2, 0x1

    .line 259
    .line 260
    iput v2, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 261
    .line 262
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 263
    .line 264
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->endObject()V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :cond_e
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONBDump;->dumpReference()V

    .line 269
    .line 270
    .line 271
    :goto_2
    add-int/lit8 p1, p1, 0x1

    .line 272
    .line 273
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 274
    .line 275
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeColon()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->isReference()Z

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-eqz v1, :cond_f

    .line 283
    .line 284
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONBDump;->dumpReference()V

    .line 285
    .line 286
    .line 287
    goto/16 :goto_1

    .line 288
    .line 289
    :cond_f
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONBDump;->dumpAny()V

    .line 290
    .line 291
    .line 292
    goto/16 :goto_1
.end method

.method private dumpReference()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 2
    .line 3
    const-string v1, "{\"$ref\":"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->readReference()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v1, "#-1"

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->lastReference:Ljava/lang/String;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 28
    .line 29
    const-string v1, "}"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public getString(I)Ljava/lang/String;
    .locals 2

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 4
    .line 5
    neg-int v1, p1

    .line 6
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/SymbolTable;->getName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->symbols:Ljava/util/Map;

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    :goto_0
    if-eqz v0, :cond_1

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    const-string v0, "symbol not found : "

    .line 27
    .line 28
    invoke-static {p1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    return-object p1
.end method

.method public isInt()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v1, -0x46

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x48

    .line 12
    .line 13
    if-le v0, v1, :cond_2

    .line 14
    .line 15
    :cond_0
    const/16 v1, -0x53

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    const/16 v1, -0x54

    .line 20
    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    .line 23
    const/16 v1, -0x55

    .line 24
    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    return v0

    .line 30
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 31
    return v0
.end method

.method public isReference()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-ge v0, v2, :cond_0

    .line 7
    .line 8
    aget-byte v0, v1, v0

    .line 9
    .line 10
    const/16 v1, -0x6d

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public isString()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v1, 0x49

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x7d

    .line 12
    .line 13
    if-gt v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public readInt32Value()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 8
    .line 9
    aget-byte v3, v0, v1

    .line 10
    .line 11
    const/16 v4, -0x10

    .line 12
    .line 13
    if-lt v3, v4, :cond_0

    .line 14
    .line 15
    const/16 v4, 0x2f

    .line 16
    .line 17
    if-gt v3, v4, :cond_0

    .line 18
    .line 19
    return v3

    .line 20
    :cond_0
    const/16 v4, 0x30

    .line 21
    .line 22
    if-lt v3, v4, :cond_1

    .line 23
    .line 24
    const/16 v4, 0x3f

    .line 25
    .line 26
    if-gt v3, v4, :cond_1

    .line 27
    .line 28
    add-int/lit8 v3, v3, -0x38

    .line 29
    .line 30
    shl-int/lit8 v3, v3, 0x8

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x2

    .line 33
    .line 34
    iput v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 35
    .line 36
    aget-byte v0, v0, v2

    .line 37
    .line 38
    and-int/lit16 v0, v0, 0xff

    .line 39
    .line 40
    add-int/2addr v3, v0

    .line 41
    return v3

    .line 42
    :cond_1
    const/16 v4, 0x40

    .line 43
    .line 44
    if-lt v3, v4, :cond_2

    .line 45
    .line 46
    const/16 v4, 0x47

    .line 47
    .line 48
    if-gt v3, v4, :cond_2

    .line 49
    .line 50
    add-int/lit8 v3, v3, -0x44

    .line 51
    .line 52
    shl-int/lit8 v3, v3, 0x10

    .line 53
    .line 54
    add-int/lit8 v4, v1, 0x2

    .line 55
    .line 56
    iput v4, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 57
    .line 58
    aget-byte v2, v0, v2

    .line 59
    .line 60
    and-int/lit16 v2, v2, 0xff

    .line 61
    .line 62
    shl-int/lit8 v2, v2, 0x8

    .line 63
    .line 64
    add-int/2addr v3, v2

    .line 65
    add-int/lit8 v1, v1, 0x3

    .line 66
    .line 67
    iput v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 68
    .line 69
    aget-byte v0, v0, v4

    .line 70
    .line 71
    and-int/lit16 v0, v0, 0xff

    .line 72
    .line 73
    add-int/2addr v3, v0

    .line 74
    return v3

    .line 75
    :cond_2
    const/16 v4, -0x54

    .line 76
    .line 77
    if-eq v3, v4, :cond_4

    .line 78
    .line 79
    const/16 v4, -0x53

    .line 80
    .line 81
    if-eq v3, v4, :cond_4

    .line 82
    .line 83
    const/16 v4, 0x48

    .line 84
    .line 85
    if-ne v3, v4, :cond_3

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    invoke-static {v3}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 93
    .line 94
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 95
    .line 96
    array-length v2, v2

    .line 97
    const-string v3, "readInt32Value not support "

    .line 98
    .line 99
    invoke-static {v3, v1, v2, v0}, Lah/a;->l(Ljava/lang/String;IILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    return v0

    .line 104
    :cond_4
    :goto_0
    add-int/lit8 v3, v1, 0x4

    .line 105
    .line 106
    aget-byte v3, v0, v3

    .line 107
    .line 108
    and-int/lit16 v3, v3, 0xff

    .line 109
    .line 110
    add-int/lit8 v4, v1, 0x3

    .line 111
    .line 112
    aget-byte v4, v0, v4

    .line 113
    .line 114
    and-int/lit16 v4, v4, 0xff

    .line 115
    .line 116
    shl-int/lit8 v4, v4, 0x8

    .line 117
    .line 118
    add-int/2addr v3, v4

    .line 119
    add-int/lit8 v4, v1, 0x2

    .line 120
    .line 121
    aget-byte v4, v0, v4

    .line 122
    .line 123
    and-int/lit16 v4, v4, 0xff

    .line 124
    .line 125
    shl-int/lit8 v4, v4, 0x10

    .line 126
    .line 127
    add-int/2addr v3, v4

    .line 128
    aget-byte v0, v0, v2

    .line 129
    .line 130
    shl-int/lit8 v0, v0, 0x18

    .line 131
    .line 132
    add-int/2addr v3, v0

    .line 133
    add-int/lit8 v1, v1, 0x5

    .line 134
    .line 135
    iput v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 136
    .line 137
    return v3
.end method

.method public readInt64Value()J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 6
    .line 7
    add-int/lit8 v3, v2, 0x1

    .line 8
    .line 9
    iput v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 10
    .line 11
    aget-byte v4, v1, v2

    .line 12
    .line 13
    const/16 v5, -0x10

    .line 14
    .line 15
    if-lt v4, v5, :cond_0

    .line 16
    .line 17
    const/16 v5, 0x2f

    .line 18
    .line 19
    if-gt v4, v5, :cond_0

    .line 20
    .line 21
    int-to-long v1, v4

    .line 22
    return-wide v1

    .line 23
    :cond_0
    const/16 v5, 0x38

    .line 24
    .line 25
    const/16 v6, 0x30

    .line 26
    .line 27
    const/16 v7, 0x8

    .line 28
    .line 29
    if-lt v4, v6, :cond_1

    .line 30
    .line 31
    const/16 v8, 0x3f

    .line 32
    .line 33
    if-gt v4, v8, :cond_1

    .line 34
    .line 35
    sub-int/2addr v4, v5

    .line 36
    shl-int/2addr v4, v7

    .line 37
    add-int/lit8 v2, v2, 0x2

    .line 38
    .line 39
    iput v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 40
    .line 41
    aget-byte v1, v1, v3

    .line 42
    .line 43
    and-int/lit16 v1, v1, 0xff

    .line 44
    .line 45
    add-int/2addr v4, v1

    .line 46
    int-to-long v1, v4

    .line 47
    return-wide v1

    .line 48
    :cond_1
    const/16 v8, 0x40

    .line 49
    .line 50
    const/16 v9, 0x10

    .line 51
    .line 52
    if-lt v4, v8, :cond_2

    .line 53
    .line 54
    const/16 v8, 0x47

    .line 55
    .line 56
    if-gt v4, v8, :cond_2

    .line 57
    .line 58
    add-int/lit8 v4, v4, -0x44

    .line 59
    .line 60
    shl-int/2addr v4, v9

    .line 61
    add-int/lit8 v5, v2, 0x2

    .line 62
    .line 63
    iput v5, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 64
    .line 65
    aget-byte v3, v1, v3

    .line 66
    .line 67
    and-int/lit16 v3, v3, 0xff

    .line 68
    .line 69
    shl-int/2addr v3, v7

    .line 70
    add-int/2addr v4, v3

    .line 71
    add-int/lit8 v2, v2, 0x3

    .line 72
    .line 73
    iput v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 74
    .line 75
    aget-byte v1, v1, v5

    .line 76
    .line 77
    and-int/lit16 v1, v1, 0xff

    .line 78
    .line 79
    add-int/2addr v4, v1

    .line 80
    int-to-long v1, v4

    .line 81
    return-wide v1

    .line 82
    :cond_2
    const/16 v8, -0x28

    .line 83
    .line 84
    if-lt v4, v8, :cond_3

    .line 85
    .line 86
    const/16 v10, -0x11

    .line 87
    .line 88
    if-gt v4, v10, :cond_3

    .line 89
    .line 90
    sub-int/2addr v4, v8

    .line 91
    int-to-long v1, v4

    .line 92
    const-wide/16 v3, -0x8

    .line 93
    .line 94
    add-long/2addr v1, v3

    .line 95
    return-wide v1

    .line 96
    :cond_3
    const/16 v8, -0x38

    .line 97
    .line 98
    if-lt v4, v8, :cond_4

    .line 99
    .line 100
    const/16 v8, -0x29

    .line 101
    .line 102
    if-gt v4, v8, :cond_4

    .line 103
    .line 104
    add-int/lit8 v4, v4, 0x30

    .line 105
    .line 106
    shl-int/2addr v4, v7

    .line 107
    add-int/lit8 v2, v2, 0x2

    .line 108
    .line 109
    iput v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 110
    .line 111
    aget-byte v1, v1, v3

    .line 112
    .line 113
    and-int/lit16 v1, v1, 0xff

    .line 114
    .line 115
    add-int/2addr v4, v1

    .line 116
    int-to-long v1, v4

    .line 117
    return-wide v1

    .line 118
    :cond_4
    const/16 v8, -0x40

    .line 119
    .line 120
    if-lt v4, v8, :cond_5

    .line 121
    .line 122
    const/16 v8, -0x39

    .line 123
    .line 124
    if-gt v4, v8, :cond_5

    .line 125
    .line 126
    add-int/lit8 v4, v4, 0x3c

    .line 127
    .line 128
    shl-int/2addr v4, v9

    .line 129
    add-int/lit8 v5, v2, 0x2

    .line 130
    .line 131
    iput v5, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 132
    .line 133
    aget-byte v3, v1, v3

    .line 134
    .line 135
    and-int/lit16 v3, v3, 0xff

    .line 136
    .line 137
    shl-int/2addr v3, v7

    .line 138
    add-int/2addr v4, v3

    .line 139
    add-int/lit8 v2, v2, 0x3

    .line 140
    .line 141
    iput v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 142
    .line 143
    aget-byte v1, v1, v5

    .line 144
    .line 145
    and-int/lit16 v1, v1, 0xff

    .line 146
    .line 147
    add-int/2addr v4, v1

    .line 148
    int-to-long v1, v4

    .line 149
    return-wide v1

    .line 150
    :cond_5
    const/16 v8, -0x55

    .line 151
    .line 152
    const/16 v10, 0x18

    .line 153
    .line 154
    if-eq v4, v8, :cond_7

    .line 155
    .line 156
    const/16 v8, 0x48

    .line 157
    .line 158
    if-eq v4, v8, :cond_6

    .line 159
    .line 160
    packed-switch v4, :pswitch_data_0

    .line 161
    .line 162
    .line 163
    invoke-static {v4}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iget v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 168
    .line 169
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 170
    .line 171
    array-length v3, v3

    .line 172
    const-string v4, "readInt64Value not support "

    .line 173
    .line 174
    invoke-static {v4, v2, v3, v1}, Lah/a;->l(Ljava/lang/String;IILjava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    const-wide/16 v1, 0x0

    .line 178
    .line 179
    return-wide v1

    .line 180
    :pswitch_0
    add-int/lit8 v2, v2, 0x2

    .line 181
    .line 182
    iput v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 183
    .line 184
    aget-byte v1, v1, v3

    .line 185
    .line 186
    int-to-long v1, v1

    .line 187
    return-wide v1

    .line 188
    :pswitch_1
    add-int/lit8 v4, v2, 0x2

    .line 189
    .line 190
    aget-byte v4, v1, v4

    .line 191
    .line 192
    and-int/lit16 v4, v4, 0xff

    .line 193
    .line 194
    aget-byte v1, v1, v3

    .line 195
    .line 196
    shl-int/2addr v1, v7

    .line 197
    add-int/2addr v4, v1

    .line 198
    add-int/lit8 v2, v2, 0x3

    .line 199
    .line 200
    iput v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 201
    .line 202
    int-to-long v1, v4

    .line 203
    return-wide v1

    .line 204
    :cond_6
    :pswitch_2
    add-int/lit8 v4, v2, 0x4

    .line 205
    .line 206
    aget-byte v4, v1, v4

    .line 207
    .line 208
    and-int/lit16 v4, v4, 0xff

    .line 209
    .line 210
    add-int/lit8 v5, v2, 0x3

    .line 211
    .line 212
    aget-byte v5, v1, v5

    .line 213
    .line 214
    and-int/lit16 v5, v5, 0xff

    .line 215
    .line 216
    shl-int/2addr v5, v7

    .line 217
    add-int/2addr v4, v5

    .line 218
    add-int/lit8 v5, v2, 0x2

    .line 219
    .line 220
    aget-byte v5, v1, v5

    .line 221
    .line 222
    and-int/lit16 v5, v5, 0xff

    .line 223
    .line 224
    shl-int/2addr v5, v9

    .line 225
    add-int/2addr v4, v5

    .line 226
    aget-byte v1, v1, v3

    .line 227
    .line 228
    shl-int/2addr v1, v10

    .line 229
    add-int/2addr v4, v1

    .line 230
    add-int/lit8 v2, v2, 0x5

    .line 231
    .line 232
    iput v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 233
    .line 234
    int-to-long v1, v4

    .line 235
    return-wide v1

    .line 236
    :cond_7
    :pswitch_3
    add-int/lit8 v4, v2, 0x8

    .line 237
    .line 238
    aget-byte v4, v1, v4

    .line 239
    .line 240
    int-to-long v11, v4

    .line 241
    const-wide/16 v13, 0xff

    .line 242
    .line 243
    and-long/2addr v11, v13

    .line 244
    add-int/lit8 v4, v2, 0x7

    .line 245
    .line 246
    aget-byte v4, v1, v4

    .line 247
    .line 248
    move v8, v5

    .line 249
    move v15, v6

    .line 250
    int-to-long v5, v4

    .line 251
    and-long v4, v5, v13

    .line 252
    .line 253
    shl-long/2addr v4, v7

    .line 254
    add-long/2addr v11, v4

    .line 255
    add-int/lit8 v4, v2, 0x6

    .line 256
    .line 257
    aget-byte v4, v1, v4

    .line 258
    .line 259
    int-to-long v4, v4

    .line 260
    and-long/2addr v4, v13

    .line 261
    shl-long/2addr v4, v9

    .line 262
    add-long/2addr v11, v4

    .line 263
    add-int/lit8 v4, v2, 0x5

    .line 264
    .line 265
    aget-byte v4, v1, v4

    .line 266
    .line 267
    int-to-long v4, v4

    .line 268
    and-long/2addr v4, v13

    .line 269
    shl-long/2addr v4, v10

    .line 270
    add-long/2addr v11, v4

    .line 271
    add-int/lit8 v4, v2, 0x4

    .line 272
    .line 273
    aget-byte v4, v1, v4

    .line 274
    .line 275
    int-to-long v4, v4

    .line 276
    and-long/2addr v4, v13

    .line 277
    const/16 v6, 0x20

    .line 278
    .line 279
    shl-long/2addr v4, v6

    .line 280
    add-long/2addr v11, v4

    .line 281
    add-int/lit8 v4, v2, 0x3

    .line 282
    .line 283
    aget-byte v4, v1, v4

    .line 284
    .line 285
    int-to-long v4, v4

    .line 286
    and-long/2addr v4, v13

    .line 287
    const/16 v6, 0x28

    .line 288
    .line 289
    shl-long/2addr v4, v6

    .line 290
    add-long/2addr v11, v4

    .line 291
    add-int/lit8 v4, v2, 0x2

    .line 292
    .line 293
    aget-byte v4, v1, v4

    .line 294
    .line 295
    int-to-long v4, v4

    .line 296
    and-long/2addr v4, v13

    .line 297
    shl-long/2addr v4, v15

    .line 298
    add-long/2addr v11, v4

    .line 299
    aget-byte v1, v1, v3

    .line 300
    .line 301
    int-to-long v3, v1

    .line 302
    shl-long/2addr v3, v8

    .line 303
    add-long/2addr v11, v3

    .line 304
    add-int/lit8 v2, v2, 0x9

    .line 305
    .line 306
    iput v2, v0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 307
    .line 308
    return-wide v11

    .line 309
    :pswitch_data_0
    .packed-switch -0x44
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public readLength()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 8
    .line 9
    aget-byte v3, v0, v1

    .line 10
    .line 11
    const/16 v4, -0x10

    .line 12
    .line 13
    if-lt v3, v4, :cond_0

    .line 14
    .line 15
    const/16 v4, 0x2f

    .line 16
    .line 17
    if-gt v3, v4, :cond_0

    .line 18
    .line 19
    return v3

    .line 20
    :cond_0
    const/16 v4, 0x40

    .line 21
    .line 22
    if-lt v3, v4, :cond_1

    .line 23
    .line 24
    const/16 v4, 0x47

    .line 25
    .line 26
    if-gt v3, v4, :cond_1

    .line 27
    .line 28
    add-int/lit8 v3, v3, -0x44

    .line 29
    .line 30
    shl-int/lit8 v3, v3, 0x10

    .line 31
    .line 32
    add-int/lit8 v4, v1, 0x2

    .line 33
    .line 34
    iput v4, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 35
    .line 36
    aget-byte v2, v0, v2

    .line 37
    .line 38
    and-int/lit16 v2, v2, 0xff

    .line 39
    .line 40
    shl-int/lit8 v2, v2, 0x8

    .line 41
    .line 42
    add-int/2addr v3, v2

    .line 43
    add-int/lit8 v1, v1, 0x3

    .line 44
    .line 45
    iput v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 46
    .line 47
    aget-byte v0, v0, v4

    .line 48
    .line 49
    :goto_0
    and-int/lit16 v0, v0, 0xff

    .line 50
    .line 51
    add-int/2addr v3, v0

    .line 52
    return v3

    .line 53
    :cond_1
    const/16 v4, 0x30

    .line 54
    .line 55
    if-lt v3, v4, :cond_2

    .line 56
    .line 57
    const/16 v4, 0x3f

    .line 58
    .line 59
    if-gt v3, v4, :cond_2

    .line 60
    .line 61
    add-int/lit8 v3, v3, -0x38

    .line 62
    .line 63
    shl-int/lit8 v3, v3, 0x8

    .line 64
    .line 65
    add-int/lit8 v1, v1, 0x2

    .line 66
    .line 67
    iput v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 68
    .line 69
    aget-byte v0, v0, v2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const/16 v4, 0x48

    .line 73
    .line 74
    if-ne v3, v4, :cond_3

    .line 75
    .line 76
    add-int/lit8 v3, v1, 0x2

    .line 77
    .line 78
    iput v3, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 79
    .line 80
    aget-byte v2, v0, v2

    .line 81
    .line 82
    shl-int/lit8 v2, v2, 0x18

    .line 83
    .line 84
    add-int/lit8 v4, v1, 0x3

    .line 85
    .line 86
    iput v4, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 87
    .line 88
    aget-byte v3, v0, v3

    .line 89
    .line 90
    and-int/lit16 v3, v3, 0xff

    .line 91
    .line 92
    shl-int/lit8 v3, v3, 0x10

    .line 93
    .line 94
    add-int/2addr v2, v3

    .line 95
    add-int/lit8 v3, v1, 0x4

    .line 96
    .line 97
    iput v3, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 98
    .line 99
    aget-byte v4, v0, v4

    .line 100
    .line 101
    and-int/lit16 v4, v4, 0xff

    .line 102
    .line 103
    shl-int/lit8 v4, v4, 0x8

    .line 104
    .line 105
    add-int/2addr v2, v4

    .line 106
    add-int/lit8 v1, v1, 0x5

    .line 107
    .line 108
    iput v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 109
    .line 110
    aget-byte v0, v0, v3

    .line 111
    .line 112
    and-int/lit16 v0, v0, 0xff

    .line 113
    .line 114
    add-int/2addr v2, v0

    .line 115
    return v2

    .line 116
    :cond_3
    const-string v0, "not support length type : "

    .line 117
    .line 118
    invoke-static {v3, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const/4 v0, 0x0

    .line 126
    return v0
.end method

.method public readReference()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    const/16 v2, -0x6d

    .line 8
    .line 9
    if-eq v0, v2, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    iput v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->isString()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->readString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->type:B

    .line 29
    .line 30
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "reference not support input "

    .line 35
    .line 36
    invoke-static {v0, v1}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    return-object v0
.end method

.method public readString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 8
    .line 9
    aget-byte v0, v0, v1

    .line 10
    .line 11
    iput-byte v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->strtype:B

    .line 12
    .line 13
    const/16 v1, -0x51

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iput v2, p0, Lcom/alibaba/fastjson2/JSONBDump;->strBegin:I

    .line 20
    .line 21
    const/16 v1, 0x49

    .line 22
    .line 23
    if-lt v0, v1, :cond_2

    .line 24
    .line 25
    const/16 v2, 0x79

    .line 26
    .line 27
    if-gt v0, v2, :cond_2

    .line 28
    .line 29
    if-ne v0, v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->readLength()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->strlen:I

    .line 36
    .line 37
    iget v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 38
    .line 39
    iput v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->strBegin:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    sub-int/2addr v0, v1

    .line 43
    iput v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->strlen:I

    .line 44
    .line 45
    :goto_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    const/16 v1, 0x7a

    .line 49
    .line 50
    if-ne v0, v1, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->readLength()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->strlen:I

    .line 57
    .line 58
    iget v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 59
    .line 60
    iput v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->strBegin:I

    .line 61
    .line 62
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    const/16 v1, 0x7b

    .line 66
    .line 67
    if-ne v0, v1, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->readLength()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iput v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->strlen:I

    .line 74
    .line 75
    iget v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 76
    .line 77
    iput v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->strBegin:I

    .line 78
    .line 79
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    const/16 v1, 0x7c

    .line 83
    .line 84
    if-ne v0, v1, :cond_5

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->readLength()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iput v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->strlen:I

    .line 91
    .line 92
    iget v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 93
    .line 94
    iput v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->strBegin:I

    .line 95
    .line 96
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    const/16 v1, 0x7d

    .line 100
    .line 101
    if-ne v0, v1, :cond_7

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONBDump;->readLength()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    iput v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->strlen:I

    .line 108
    .line 109
    iget v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 110
    .line 111
    iput v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->strBegin:I

    .line 112
    .line 113
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 114
    .line 115
    :goto_1
    iget v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->strlen:I

    .line 116
    .line 117
    if-gez v1, :cond_6

    .line 118
    .line 119
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 120
    .line 121
    neg-int v1, v1

    .line 122
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/SymbolTable;->getName(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    return-object v0

    .line 127
    :cond_6
    new-instance v2, Ljava/lang/String;

    .line 128
    .line 129
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 130
    .line 131
    iget v4, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 132
    .line 133
    invoke-direct {v2, v3, v4, v1, v0}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 134
    .line 135
    .line 136
    iget v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 137
    .line 138
    iget v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->strlen:I

    .line 139
    .line 140
    add-int/2addr v0, v1

    .line 141
    iput v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 142
    .line 143
    return-object v2

    .line 144
    :cond_7
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->strtype:B

    .line 145
    .line 146
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    iget v1, p0, Lcom/alibaba/fastjson2/JSONBDump;->offset:I

    .line 151
    .line 152
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONBDump;->bytes:[B

    .line 153
    .line 154
    array-length v2, v2

    .line 155
    const-string v3, "readString not support type "

    .line 156
    .line 157
    invoke-static {v3, v1, v2, v0}, Lah/a;->l(Ljava/lang/String;IILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    const/4 v0, 0x0

    .line 161
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONBDump;->jsonWriter:Lcom/alibaba/fastjson2/JSONWriter;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
