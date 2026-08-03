.class public final Lcom/alibaba/fastjson2/JSONWriter$Path;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson2/JSONWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Path"
.end annotation


# static fields
.field public static final ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;


# instance fields
.field child0:Lcom/alibaba/fastjson2/JSONWriter$Path;

.field child1:Lcom/alibaba/fastjson2/JSONWriter$Path;

.field fullPath:Ljava/lang/String;

.field final index:I

.field final name:Ljava/lang/String;

.field public final parent:Lcom/alibaba/fastjson2/JSONWriter$Path;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "$"

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriter$Path;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Path;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/JSONWriter$Path;I)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->parent:Lcom/alibaba/fastjson2/JSONWriter$Path;

    const/4 p1, 0x0

    .line 14
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->name:Ljava/lang/String;

    .line 15
    iput p2, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->index:I

    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/JSONWriter$Path;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->parent:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->name:Ljava/lang/String;

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->index:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_5

    .line 7
    .line 8
    const-class v2, Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 18
    .line 19
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->index:I

    .line 20
    .line 21
    iget v3, p1, Lcom/alibaba/fastjson2/JSONWriter$Path;->index:I

    .line 22
    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->parent:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 26
    .line 27
    iget-object v3, p1, Lcom/alibaba/fastjson2/JSONWriter$Path;->parent:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 28
    .line 29
    if-eq v2, v3, :cond_4

    .line 30
    .line 31
    :cond_2
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->parent:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 32
    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    iget-object v3, p1, Lcom/alibaba/fastjson2/JSONWriter$Path;->parent:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter$Path;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->name:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v3, p1, Lcom/alibaba/fastjson2/JSONWriter$Path;->name:Ljava/lang/String;

    .line 46
    .line 47
    if-eq v2, v3, :cond_4

    .line 48
    .line 49
    :cond_3
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->name:Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v2, :cond_5

    .line 52
    .line 53
    iget-object p1, p1, Lcom/alibaba/fastjson2/JSONWriter$Path;->name:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    :cond_4
    return v0

    .line 62
    :cond_5
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->parent:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->name:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->index:I

    .line 6
    .line 7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->fullPath:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const/16 v0, 0x10

    .line 7
    .line 8
    new-array v0, v0, [B

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    new-array v2, v1, [Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    move-object v4, p0

    .line 15
    move v5, v3

    .line 16
    :goto_0
    if-eqz v4, :cond_2

    .line 17
    .line 18
    array-length v6, v2

    .line 19
    if-ne v6, v5, :cond_1

    .line 20
    .line 21
    array-length v6, v2

    .line 22
    add-int/2addr v6, v1

    .line 23
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, [Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 28
    .line 29
    :cond_1
    aput-object v4, v2, v5

    .line 30
    .line 31
    add-int/lit8 v5, v5, 0x1

    .line 32
    .line 33
    iget-object v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Path;->parent:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 v1, 0x1

    .line 37
    sub-int/2addr v5, v1

    .line 38
    move v7, v1

    .line 39
    move v6, v3

    .line 40
    move v4, v5

    .line 41
    :goto_1
    if-ltz v4, :cond_16

    .line 42
    .line 43
    aget-object v8, v2, v4

    .line 44
    .line 45
    iget-object v9, v8, Lcom/alibaba/fastjson2/JSONWriter$Path;->name:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v10, 0x2

    .line 48
    if-nez v9, :cond_4

    .line 49
    .line 50
    iget v8, v8, Lcom/alibaba/fastjson2/JSONWriter$Path;->index:I

    .line 51
    .line 52
    invoke-static {v8}, Lcom/alibaba/fastjson2/util/IOUtils;->stringSize(I)I

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    :goto_2
    add-int v11, v6, v9

    .line 57
    .line 58
    add-int/2addr v11, v10

    .line 59
    array-length v12, v0

    .line 60
    if-lt v11, v12, :cond_3

    .line 61
    .line 62
    array-length v11, v0

    .line 63
    array-length v12, v0

    .line 64
    shr-int/2addr v12, v1

    .line 65
    add-int/2addr v11, v12

    .line 66
    invoke-static {v0, v11}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    add-int/lit8 v9, v6, 0x1

    .line 72
    .line 73
    const/16 v10, 0x5b

    .line 74
    .line 75
    aput-byte v10, v0, v6

    .line 76
    .line 77
    invoke-static {v0, v9, v8}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt32([BII)I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    add-int/lit8 v8, v6, 0x1

    .line 82
    .line 83
    const/16 v9, 0x5d

    .line 84
    .line 85
    aput-byte v9, v0, v6

    .line 86
    .line 87
    move v6, v8

    .line 88
    goto/16 :goto_8

    .line 89
    .line 90
    :cond_4
    add-int/lit8 v8, v6, 0x1

    .line 91
    .line 92
    array-length v11, v0

    .line 93
    if-lt v8, v11, :cond_5

    .line 94
    .line 95
    array-length v11, v0

    .line 96
    array-length v12, v0

    .line 97
    shr-int/2addr v12, v1

    .line 98
    add-int/2addr v11, v12

    .line 99
    invoke-static {v0, v11}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :cond_5
    if-eq v4, v5, :cond_6

    .line 104
    .line 105
    const/16 v11, 0x2e

    .line 106
    .line 107
    aput-byte v11, v0, v6

    .line 108
    .line 109
    move v6, v8

    .line 110
    :cond_6
    move v8, v3

    .line 111
    :goto_3
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-ge v8, v11, :cond_15

    .line 116
    .line 117
    invoke-virtual {v9, v8}, Ljava/lang/String;->charAt(I)C

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    const/16 v12, 0x60

    .line 122
    .line 123
    if-eq v11, v12, :cond_13

    .line 124
    .line 125
    const/16 v12, 0x7e

    .line 126
    .line 127
    if-eq v11, v12, :cond_13

    .line 128
    .line 129
    packed-switch v11, :pswitch_data_0

    .line 130
    .line 131
    .line 132
    packed-switch v11, :pswitch_data_1

    .line 133
    .line 134
    .line 135
    packed-switch v11, :pswitch_data_2

    .line 136
    .line 137
    .line 138
    packed-switch v11, :pswitch_data_3

    .line 139
    .line 140
    .line 141
    packed-switch v11, :pswitch_data_4

    .line 142
    .line 143
    .line 144
    if-lt v11, v1, :cond_8

    .line 145
    .line 146
    const/16 v12, 0x7f

    .line 147
    .line 148
    if-gt v11, v12, :cond_8

    .line 149
    .line 150
    array-length v12, v0

    .line 151
    if-ne v6, v12, :cond_7

    .line 152
    .line 153
    array-length v12, v0

    .line 154
    array-length v13, v0

    .line 155
    shr-int/2addr v13, v1

    .line 156
    add-int/2addr v12, v13

    .line 157
    invoke-static {v0, v12}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    :cond_7
    add-int/lit8 v12, v6, 0x1

    .line 162
    .line 163
    int-to-byte v11, v11

    .line 164
    aput-byte v11, v0, v6

    .line 165
    .line 166
    move v6, v12

    .line 167
    goto/16 :goto_7

    .line 168
    .line 169
    :cond_8
    const v7, 0xd800

    .line 170
    .line 171
    .line 172
    const/16 v12, 0x3f

    .line 173
    .line 174
    if-lt v11, v7, :cond_f

    .line 175
    .line 176
    const v7, 0xe000

    .line 177
    .line 178
    .line 179
    if-ge v11, v7, :cond_f

    .line 180
    .line 181
    const v13, 0xdc00

    .line 182
    .line 183
    .line 184
    if-ge v11, v13, :cond_e

    .line 185
    .line 186
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 187
    .line 188
    .line 189
    move-result v14

    .line 190
    sub-int/2addr v14, v4

    .line 191
    if-ge v14, v10, :cond_9

    .line 192
    .line 193
    const/4 v7, -0x1

    .line 194
    goto :goto_4

    .line 195
    :cond_9
    add-int/lit8 v14, v4, 0x1

    .line 196
    .line 197
    invoke-virtual {v9, v14}, Ljava/lang/String;->charAt(I)C

    .line 198
    .line 199
    .line 200
    move-result v14

    .line 201
    if-lt v14, v13, :cond_d

    .line 202
    .line 203
    if-ge v14, v7, :cond_d

    .line 204
    .line 205
    shl-int/lit8 v7, v11, 0xa

    .line 206
    .line 207
    add-int/2addr v7, v14

    .line 208
    const v11, -0x35fdc00

    .line 209
    .line 210
    .line 211
    add-int/2addr v7, v11

    .line 212
    :goto_4
    if-gez v7, :cond_b

    .line 213
    .line 214
    array-length v7, v0

    .line 215
    if-ne v6, v7, :cond_a

    .line 216
    .line 217
    array-length v7, v0

    .line 218
    array-length v11, v0

    .line 219
    shr-int/2addr v11, v1

    .line 220
    add-int/2addr v7, v11

    .line 221
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    :cond_a
    add-int/lit8 v7, v6, 0x1

    .line 226
    .line 227
    aput-byte v12, v0, v6

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_b
    add-int/lit8 v11, v6, 0x3

    .line 231
    .line 232
    array-length v13, v0

    .line 233
    if-lt v11, v13, :cond_c

    .line 234
    .line 235
    array-length v11, v0

    .line 236
    array-length v13, v0

    .line 237
    shr-int/2addr v13, v1

    .line 238
    add-int/2addr v11, v13

    .line 239
    invoke-static {v0, v11}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    :cond_c
    add-int/lit8 v11, v6, 0x1

    .line 244
    .line 245
    shr-int/lit8 v13, v7, 0x12

    .line 246
    .line 247
    or-int/lit16 v13, v13, 0xf0

    .line 248
    .line 249
    int-to-byte v13, v13

    .line 250
    aput-byte v13, v0, v6

    .line 251
    .line 252
    add-int/lit8 v13, v6, 0x2

    .line 253
    .line 254
    shr-int/lit8 v14, v7, 0xc

    .line 255
    .line 256
    and-int/2addr v14, v12

    .line 257
    or-int/lit16 v14, v14, 0x80

    .line 258
    .line 259
    int-to-byte v14, v14

    .line 260
    aput-byte v14, v0, v11

    .line 261
    .line 262
    add-int/lit8 v11, v6, 0x3

    .line 263
    .line 264
    shr-int/lit8 v14, v7, 0x6

    .line 265
    .line 266
    and-int/2addr v12, v14

    .line 267
    or-int/lit16 v12, v12, 0x80

    .line 268
    .line 269
    int-to-byte v12, v12

    .line 270
    aput-byte v12, v0, v13

    .line 271
    .line 272
    add-int/lit8 v6, v6, 0x4

    .line 273
    .line 274
    and-int/lit8 v7, v7, 0x3f

    .line 275
    .line 276
    or-int/lit16 v7, v7, 0x80

    .line 277
    .line 278
    int-to-byte v7, v7

    .line 279
    aput-byte v7, v0, v11

    .line 280
    .line 281
    add-int/lit8 v8, v8, 0x1

    .line 282
    .line 283
    move v7, v6

    .line 284
    :goto_5
    move v6, v7

    .line 285
    :goto_6
    move v7, v3

    .line 286
    goto :goto_7

    .line 287
    :cond_d
    add-int/lit8 v7, v6, 0x1

    .line 288
    .line 289
    aput-byte v12, v0, v6

    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_e
    add-int/lit8 v7, v6, 0x1

    .line 293
    .line 294
    aput-byte v12, v0, v6

    .line 295
    .line 296
    goto :goto_5

    .line 297
    :cond_f
    const/16 v7, 0x7ff

    .line 298
    .line 299
    if-le v11, v7, :cond_11

    .line 300
    .line 301
    add-int/lit8 v7, v6, 0x2

    .line 302
    .line 303
    array-length v13, v0

    .line 304
    if-lt v7, v13, :cond_10

    .line 305
    .line 306
    array-length v7, v0

    .line 307
    array-length v13, v0

    .line 308
    shr-int/2addr v13, v1

    .line 309
    add-int/2addr v7, v13

    .line 310
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    :cond_10
    add-int/lit8 v7, v6, 0x1

    .line 315
    .line 316
    shr-int/lit8 v13, v11, 0xc

    .line 317
    .line 318
    and-int/lit8 v13, v13, 0xf

    .line 319
    .line 320
    or-int/lit16 v13, v13, 0xe0

    .line 321
    .line 322
    int-to-byte v13, v13

    .line 323
    aput-byte v13, v0, v6

    .line 324
    .line 325
    add-int/lit8 v13, v6, 0x2

    .line 326
    .line 327
    shr-int/lit8 v14, v11, 0x6

    .line 328
    .line 329
    and-int/2addr v12, v14

    .line 330
    or-int/lit16 v12, v12, 0x80

    .line 331
    .line 332
    int-to-byte v12, v12

    .line 333
    aput-byte v12, v0, v7

    .line 334
    .line 335
    add-int/lit8 v6, v6, 0x3

    .line 336
    .line 337
    and-int/lit8 v7, v11, 0x3f

    .line 338
    .line 339
    or-int/lit16 v7, v7, 0x80

    .line 340
    .line 341
    int-to-byte v7, v7

    .line 342
    aput-byte v7, v0, v13

    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_11
    add-int/lit8 v7, v6, 0x1

    .line 346
    .line 347
    array-length v12, v0

    .line 348
    if-lt v7, v12, :cond_12

    .line 349
    .line 350
    array-length v12, v0

    .line 351
    array-length v13, v0

    .line 352
    shr-int/2addr v13, v1

    .line 353
    add-int/2addr v12, v13

    .line 354
    invoke-static {v0, v12}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    :cond_12
    shr-int/lit8 v12, v11, 0x6

    .line 359
    .line 360
    and-int/lit8 v12, v12, 0x1f

    .line 361
    .line 362
    or-int/lit16 v12, v12, 0xc0

    .line 363
    .line 364
    int-to-byte v12, v12

    .line 365
    aput-byte v12, v0, v6

    .line 366
    .line 367
    add-int/lit8 v6, v6, 0x2

    .line 368
    .line 369
    and-int/lit8 v11, v11, 0x3f

    .line 370
    .line 371
    or-int/lit16 v11, v11, 0x80

    .line 372
    .line 373
    int-to-byte v11, v11

    .line 374
    aput-byte v11, v0, v7

    .line 375
    .line 376
    goto :goto_6

    .line 377
    :cond_13
    :pswitch_0
    add-int/lit8 v12, v6, 0x1

    .line 378
    .line 379
    array-length v13, v0

    .line 380
    if-lt v12, v13, :cond_14

    .line 381
    .line 382
    array-length v13, v0

    .line 383
    array-length v14, v0

    .line 384
    shr-int/2addr v14, v1

    .line 385
    add-int/2addr v13, v14

    .line 386
    invoke-static {v0, v13}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    :cond_14
    const/16 v13, 0x5c

    .line 391
    .line 392
    aput-byte v13, v0, v6

    .line 393
    .line 394
    add-int/lit8 v6, v6, 0x2

    .line 395
    .line 396
    int-to-byte v11, v11

    .line 397
    aput-byte v11, v0, v12

    .line 398
    .line 399
    :goto_7
    add-int/2addr v8, v1

    .line 400
    goto/16 :goto_3

    .line 401
    .line 402
    :cond_15
    :goto_8
    add-int/lit8 v4, v4, -0x1

    .line 403
    .line 404
    goto/16 :goto_1

    .line 405
    .line 406
    :cond_16
    new-instance v1, Ljava/lang/String;

    .line 407
    .line 408
    if-eqz v7, :cond_17

    .line 409
    .line 410
    sget-object v2, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 411
    .line 412
    goto :goto_9

    .line 413
    :cond_17
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 414
    .line 415
    :goto_9
    invoke-direct {v1, v0, v3, v6, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 416
    .line 417
    .line 418
    iput-object v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Path;->fullPath:Ljava/lang/String;

    .line 419
    .line 420
    return-object v1

    .line 421
    :pswitch_data_0
    .packed-switch 0x21
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    :pswitch_data_1
    .packed-switch 0x25
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    :pswitch_data_2
    .packed-switch 0x2d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    :pswitch_data_3
    .packed-switch 0x3a
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    :pswitch_data_4
    .packed-switch 0x5b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
