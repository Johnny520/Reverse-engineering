.class public abstract Li5;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static volatile a:J

.field public static volatile b:J

.field public static volatile c:Ljava/util/ArrayList;

.field public static final d:[I

.field public static final e:[Ljava/lang/Object;

.field public static final f:[B

.field public static volatile g:Ljava/util/List;

.field public static volatile h:J

.field public static final i:[B

.field public static final j:[I

.field public static final k:[B

.field public static final l:[Ljava/lang/String;

.field public static final m:[Ljava/lang/String;

.field public static final n:[Ljava/lang/String;

.field public static volatile o:Z

.field public static final p:[Ljava/lang/String;

.field public static final q:[I

.field public static final r:[I

.field public static final s:[B

.field public static volatile t:J

.field public static volatile u:Ljava/lang/ClassLoader;

.field public static volatile v:Ljava/lang/ClassLoader;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 19

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Li5;->d:[I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    new-array v0, v0, [Ljava/lang/Object;

    .line 11
    .line 12
    sput-object v0, Li5;->e:[Ljava/lang/Object;

    .line 13
    .line 14
    const/16 v0, 0xa

    .line 15
    .line 16
    new-array v0, v0, [B

    .line 17
    .line 18
    fill-array-data v0, :array_1

    .line 19
    .line 20
    .line 21
    sput-object v0, Li5;->f:[B

    .line 22
    .line 23
    const/16 v0, 0x1e

    .line 24
    .line 25
    new-array v0, v0, [B

    .line 26
    .line 27
    fill-array-data v0, :array_2

    .line 28
    .line 29
    .line 30
    sput-object v0, Li5;->i:[B

    .line 31
    .line 32
    const/4 v0, 0x7

    .line 33
    new-array v0, v0, [I

    .line 34
    .line 35
    fill-array-data v0, :array_3

    .line 36
    .line 37
    .line 38
    sput-object v0, Li5;->j:[I

    .line 39
    .line 40
    const/16 v0, 0x9

    .line 41
    .line 42
    new-array v1, v0, [B

    .line 43
    .line 44
    fill-array-data v1, :array_4

    .line 45
    .line 46
    .line 47
    sput-object v1, Li5;->k:[B

    .line 48
    .line 49
    const-string v1, "initMicroAppEntryLayout."

    .line 50
    .line 51
    const-string v2, "init Mini App, cost="

    .line 52
    .line 53
    const-string v3, "initMiniAppEntryLayout."

    .line 54
    .line 55
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sput-object v1, Li5;->l:[Ljava/lang/String;

    .line 60
    .line 61
    const-string v6, "text"

    .line 62
    .line 63
    const-string v7, "content"

    .line 64
    .line 65
    const-string v2, "summary"

    .line 66
    .line 67
    const-string v3, "name"

    .line 68
    .line 69
    const-string v4, "desc"

    .line 70
    .line 71
    const-string v5, "title"

    .line 72
    .line 73
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    sput-object v1, Li5;->m:[Ljava/lang/String;

    .line 78
    .line 79
    const-string v1, "pic"

    .line 80
    .line 81
    const-string v2, "image"

    .line 82
    .line 83
    const-string v3, "summary"

    .line 84
    .line 85
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    sput-object v1, Li5;->n:[Ljava/lang/String;

    .line 90
    .line 91
    const-string v17, "com.tencent.mobileqq.aio.msglist.holder.component.sysface.AIOSingleSysFaceContentComponent"

    .line 92
    .line 93
    const-string v18, "com.tencent.mobileqq.aio.msglist.holder.component.mix.AIOMixContentComponent"

    .line 94
    .line 95
    const-string v2, "com.tencent.mobileqq.aio.msglist.holder.component.text.AIOTextContentComponent"

    .line 96
    .line 97
    const-string v3, "com.tencent.mobileqq.aio.msglist.holder.component.pic.AIOPicContentComponent"

    .line 98
    .line 99
    const-string v4, "com.tencent.mobileqq.aio.msglist.holder.component.file.AIOFileContentComponent"

    .line 100
    .line 101
    const-string v5, "com.tencent.mobileqq.aio.msglist.holder.component.ptt.AIOPttContentComponent"

    .line 102
    .line 103
    const-string v6, "com.tencent.mobileqq.aio.msglist.holder.component.reply.AIOReplyComponent"

    .line 104
    .line 105
    const-string v7, "com.tencent.mobileqq.aio.msglist.holder.component.ark.AIOArkContentComponent"

    .line 106
    .line 107
    const-string v8, "com.tencent.mobileqq.aio.msglist.holder.component.flashpic.AIOFlashPicContentComponent"

    .line 108
    .line 109
    const-string v9, "com.tencent.mobileqq.aio.msglist.holder.component.video.AIOVideoContentComponent"

    .line 110
    .line 111
    const-string v10, "com.tencent.mobileqq.aio.msglist.holder.component.markdown.AIORichContentComponent"

    .line 112
    .line 113
    const-string v11, "com.tencent.mobileqq.aio.msglist.holder.component.template.AIOTemplateMsgComponent"

    .line 114
    .line 115
    const-string v12, "com.tencent.mobileqq.aio.msglist.holder.component.marketface.AIOMarketFaceComponent"

    .line 116
    .line 117
    const-string v13, "com.tencent.mobileqq.aio.msglist.holder.component.facebubble.AIOFaceBubbleContentComponent"

    .line 118
    .line 119
    const-string v14, "com.tencent.mobileqq.aio.msglist.holder.component.filtervideo.AIOLiveVideoContentComponent"

    .line 120
    .line 121
    const-string v15, "com.tencent.mobileqq.aio.msglist.holder.component.videochat.AIOVideoResultContentComponent"

    .line 122
    .line 123
    const-string v16, "com.tencent.mobileqq.aio.msglist.holder.component.anisticker.AIOAniStickerContentComponent"

    .line 124
    .line 125
    filled-new-array/range {v2 .. v18}, [Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    sput-object v1, Li5;->p:[Ljava/lang/String;

    .line 130
    .line 131
    const/16 v1, 0x37

    .line 132
    .line 133
    new-array v1, v1, [I

    .line 134
    .line 135
    fill-array-data v1, :array_5

    .line 136
    .line 137
    .line 138
    sput-object v1, Li5;->q:[I

    .line 139
    .line 140
    const/16 v1, 0x10

    .line 141
    .line 142
    new-array v1, v1, [I

    .line 143
    .line 144
    fill-array-data v1, :array_6

    .line 145
    .line 146
    .line 147
    sput-object v1, Li5;->r:[I

    .line 148
    .line 149
    new-array v0, v0, [B

    .line 150
    .line 151
    fill-array-data v0, :array_7

    .line 152
    .line 153
    .line 154
    sput-object v0, Li5;->s:[B

    .line 155
    .line 156
    return-void

    .line 157
    :array_0
    .array-data 4
        0x3e8
        0x3eb
        0x3ed
        0x3f8
        0x3e9
        0x3ee
    .end array-data

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    :array_1
    .array-data 1
        0x2t
        0x23t
        0x21t
        0x53t
        0x49t
        0x4ct
        0x4bt
        0x5ft
        0x56t
        0x33t
    .end array-data

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    nop

    .line 183
    :array_2
    .array-data 1
        0x1ct
        0x1at
        0x2bt
        0x1dt
        0x1ft
        0x3dt
        0x22t
        0x31t
        0x33t
        0x38t
        0x34t
        0x4at
        0x29t
        0x3et
        0x42t
        0x2et
        0x19t
        0x39t
        0x33t
        0x46t
        0x21t
        0x2dt
        0x27t
        0x1bt
        0x44t
        0x3at
        0x2et
        0x3bt
        0x3bt
        0x3ft
    .end array-data

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    nop

    .line 203
    :array_3
    .array-data 4
        0x1f40
        0x2ee0
        0x3e80
        0x5dc0
        0x8ca0
        0xac44
        0xbb80
    .end array-data

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    :array_4
    .array-data 1
        0x23t
        0x21t
        0x53t
        0x49t
        0x4ct
        0x4bt
        0x5ft
        0x56t
        0x33t
    .end array-data

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    nop

    .line 231
    :array_5
    .array-data 4
        0x6d94
        0x5b2a
        0x58a0
        0x7487
        0x5b58
        0x6581
        0x9352
        0x62cc
        0x7e56
        0x95b2
        0x5c84
        0x6f70
        0x6fc2
        0x85c9
        0x60a7
        0x95c5
        0x9e43
        0x4ebe
        0x93c4
        0x579c
        0x7481
        0x4f34
        0x654a
        0x55ed
        0x7d35
        0x9359
        0x935a
        0x6d93
        0x5d87
        0x6b91
        0x93b4
        0x621c
        0x7d98
        0x6d60
        0x6828
        0x6e41
        0x93c9
        0x30e5
        0x57cc
        0x6769
        0x6b13
        0x5677
        0x95c8
        0x70b0
        0x7b09
        0x7edb
        0x590a
        0x7ddf
        0x9365
        0x70b6
        0x769f
        0x5bb8
        0x53c9
        0x5f41
        0x6d5c
    .end array-data

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    :array_6
    .array-data 4
        0x951b
        0x9286
        0x20ac
        0x6d94
        0x5b2b
        0x7487
        0x95c5
        0x55ed
        0x7d35
        0x9359
        0x935a
        0x93b4
        0x6769
        0x6d63
        0x7edb
        0x5bb8
    .end array-data

    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    :array_7
    .array-data 1
        0x23t
        0x21t
        0x53t
        0x49t
        0x4ct
        0x4bt
        0x5ft
        0x56t
        0x33t
    .end array-data
.end method

.method public static A(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_6

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/16 v2, 0x8

    .line 27
    .line 28
    if-le v1, v2, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-ge v1, v2, :cond_5

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/16 v3, 0x61

    .line 43
    .line 44
    if-lt v2, v3, :cond_2

    .line 45
    .line 46
    const/16 v3, 0x7a

    .line 47
    .line 48
    if-le v2, v3, :cond_3

    .line 49
    .line 50
    :cond_2
    const/16 v3, 0x30

    .line 51
    .line 52
    if-lt v2, v3, :cond_4

    .line 53
    .line 54
    const/16 v3, 0x39

    .line 55
    .line 56
    if-le v2, v3, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_4
    :goto_1
    return-object v0

    .line 63
    :cond_5
    return-object p0

    .line 64
    :cond_6
    :goto_2
    return-object v0
.end method

.method public static A0(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_6

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    :try_start_0
    new-instance v1, Ljava/net/URI;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p0, "https"

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_6

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/net/URI;->getUserInfo()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v1}, Ljava/net/URI;->getPort()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    const/4 v2, -0x1

    .line 40
    if-eq p0, v2, :cond_2

    .line 41
    .line 42
    const/16 v2, 0x1bb

    .line 43
    .line 44
    if-eq p0, v2, :cond_2

    .line 45
    .line 46
    return v0

    .line 47
    :cond_2
    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-nez p0, :cond_3

    .line 52
    .line 53
    return v0

    .line 54
    :cond_3
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const-string v1, "weshineapp.com"

    .line 61
    .line 62
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_5

    .line 67
    .line 68
    const-string v1, ".weshineapp.com"

    .line 69
    .line 70
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    return v0

    .line 78
    :cond_5
    :goto_0
    const/4 p0, 0x1

    .line 79
    return p0

    .line 80
    :catchall_0
    :cond_6
    :goto_1
    return v0
.end method

.method public static A1(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lb9;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object v2, v1, Lb9;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v2}, Li5;->O0(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iget-object v2, v1, Lb9;->b:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-lez v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    new-instance p0, Lb9;

    .line 55
    .line 56
    const-string v1, "\u82f9\u679c\u9999-\u5973\u751f"

    .line 57
    .line 58
    const-string v2, "\u63a8\u8350"

    .line 59
    .line 60
    const-string v3, "94b8f3ec59b18723224b7ac5e3fa3a07"

    .line 61
    .line 62
    invoke-direct {p0, v3, v1, v2}, Lb9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    :cond_2
    return-object v0
.end method

.method public static B(Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 v0, 0x0

    .line 15
    move v1, v0

    .line 16
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v1, v2, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {v2}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_3

    .line 31
    .line 32
    const/16 v3, 0x2c

    .line 33
    .line 34
    if-eq v2, v3, :cond_3

    .line 35
    .line 36
    const/16 v3, 0x3b

    .line 37
    .line 38
    if-eq v2, v3, :cond_3

    .line 39
    .line 40
    const v3, 0xff0c

    .line 41
    .line 42
    .line 43
    if-eq v2, v3, :cond_3

    .line 44
    .line 45
    const v3, 0xff1b

    .line 46
    .line 47
    .line 48
    if-ne v2, v3, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 v1, -0x1

    .line 55
    :cond_3
    :goto_1
    if-ltz v1, :cond_4

    .line 56
    .line 57
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-ge v0, v2, :cond_a

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    const/16 v3, 0x30

    .line 81
    .line 82
    if-lt v2, v3, :cond_5

    .line 83
    .line 84
    const/16 v3, 0x39

    .line 85
    .line 86
    if-le v2, v3, :cond_8

    .line 87
    .line 88
    :cond_5
    const/16 v3, 0x61

    .line 89
    .line 90
    if-lt v2, v3, :cond_6

    .line 91
    .line 92
    const/16 v3, 0x7a

    .line 93
    .line 94
    if-le v2, v3, :cond_8

    .line 95
    .line 96
    :cond_6
    const/16 v3, 0x41

    .line 97
    .line 98
    if-lt v2, v3, :cond_7

    .line 99
    .line 100
    const/16 v3, 0x5a

    .line 101
    .line 102
    if-le v2, v3, :cond_8

    .line 103
    .line 104
    :cond_7
    const/16 v3, 0x5f

    .line 105
    .line 106
    if-eq v2, v3, :cond_8

    .line 107
    .line 108
    const/16 v3, 0x2d

    .line 109
    .line 110
    if-ne v2, v3, :cond_9

    .line 111
    .line 112
    :cond_8
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    :cond_9
    add-int/lit8 v0, v0, 0x1

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_a
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0
.end method

.method public static B0(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    :try_start_0
    new-instance v1, Ljava/net/URI;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p0, "https"

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_3

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/net/URI;->getUserInfo()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v1}, Ljava/net/URI;->getPort()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    const/4 v2, -0x1

    .line 40
    if-eq p0, v2, :cond_2

    .line 41
    .line 42
    const/16 v2, 0x1bb

    .line 43
    .line 44
    if-eq p0, v2, :cond_2

    .line 45
    .line 46
    return v0

    .line 47
    :cond_2
    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eqz p0, :cond_3

    .line 52
    .line 53
    const-string v1, "oiapi.net"

    .line 54
    .line 55
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 56
    .line 57
    invoke-virtual {p0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    if-eqz p0, :cond_3

    .line 66
    .line 67
    const/4 p0, 0x1

    .line 68
    return p0

    .line 69
    :catchall_0
    :cond_3
    :goto_0
    return v0
.end method

.method public static B1(Ljava/lang/Class;)Z
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
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-nez v1, :cond_3

    .line 11
    .line 12
    const-class v1, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_3

    .line 19
    .line 20
    const-class v1, Ljava/util/Map;

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    const-class v1, Ljava/util/Collection;

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string v1, "list"

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    const-string v1, "map"

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    const-string v1, "cache"

    .line 64
    .line 65
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_3

    .line 70
    .line 71
    const-string v1, "repo"

    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    return v0

    .line 81
    :cond_3
    :goto_0
    return v2
.end method

.method public static C(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Li5;->B(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x5

    .line 10
    const-string v2, ""

    .line 11
    .line 12
    if-lt v0, v1, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v1, 0xc

    .line 19
    .line 20
    if-le v0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-ge v0, v1, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-object p0

    .line 45
    :cond_3
    :goto_1
    return-object v2
.end method

.method public static C0(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v0, "quibadge"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    const-string v0, "badge"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    const-string v0, "unread"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 41
    return p0
.end method

.method public static C1(Ljava/util/ArrayList;Ljava/lang/Object;Z)V
    .locals 17

    .line 1
    sget-object v1, Li5;->n:[Ljava/lang/String;

    .line 2
    .line 3
    sget-object v2, Li5;->m:[Ljava/lang/String;

    .line 4
    .line 5
    if-eqz p0, :cond_14

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_c

    .line 14
    .line 15
    :cond_0
    const-string v0, "pic_summary_text"

    .line 16
    .line 17
    const-string v3, "[\u56fe\u7247]"

    .line 18
    .line 19
    invoke-static {v0, v3}, Lcom/mr/elaris/HookEntry;->runtimeString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    move-object v3, v0

    .line 32
    :cond_1
    const-string v0, "chatType"

    .line 33
    .line 34
    const/4 v4, -0x1

    .line 35
    move-object/from16 v5, p1

    .line 36
    .line 37
    invoke-static {v5, v0, v4}, Lw4;->c(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    const/4 v10, 0x0

    .line 49
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_11

    .line 54
    .line 55
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    :try_start_0
    const-string v12, "picElement"

    .line 63
    .line 64
    invoke-static {v0, v12}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    const-string v13, "\u200b"

    .line 69
    .line 70
    const-string v14, "summary"

    .line 71
    .line 72
    if-eqz v12, :cond_6

    .line 73
    .line 74
    const-string v15, "fileName"

    .line 75
    .line 76
    const-string v6, "picSummary"

    .line 77
    .line 78
    const-string v11, "originImageSummary"

    .line 79
    .line 80
    if-eqz p2, :cond_4

    .line 81
    .line 82
    if-nez v10, :cond_3

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_3
    :try_start_1
    invoke-static {v12, v14, v13}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v12, v11, v13}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v12, v6, v13}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v12, v15, v13}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    const/4 v6, 0x1

    .line 98
    invoke-static {v12, v13, v6, v2}, Li5;->N1(Ljava/lang/Object;Ljava/lang/String;Z[Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0, v13, v6, v1}, Li5;->N1(Ljava/lang/Object;Ljava/lang/String;Z[Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    goto :goto_4

    .line 105
    :catchall_0
    move-exception v0

    .line 106
    :goto_1
    move-object/from16 v16, v1

    .line 107
    .line 108
    :goto_2
    const/4 v11, 0x0

    .line 109
    goto/16 :goto_a

    .line 110
    .line 111
    :cond_4
    :goto_3
    invoke-static {v12, v14, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v12, v11, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v12, v6, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v12, v15, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    const-string v6, "picSubType"

    .line 124
    .line 125
    const/4 v11, 0x0

    .line 126
    invoke-static {v12, v6, v11}, Lw4;->c(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 127
    .line 128
    .line 129
    move-result v15

    .line 130
    if-eqz v15, :cond_5

    .line 131
    .line 132
    const/4 v11, 0x4

    .line 133
    if-eq v4, v11, :cond_5

    .line 134
    .line 135
    const/4 v11, 0x7

    .line 136
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v11

    .line 140
    invoke-static {v12, v6, v11}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_5
    const/4 v11, 0x0

    .line 144
    invoke-static {v12, v3, v11, v2}, Li5;->N1(Ljava/lang/Object;Ljava/lang/String;Z[Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v3, v11, v1}, Li5;->N1(Ljava/lang/Object;Ljava/lang/String;Z[Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    add-int/lit8 v7, v7, 0x1

    .line 151
    .line 152
    const/4 v10, 0x1

    .line 153
    :cond_6
    :goto_4
    const-string v6, "marketFaceElement"

    .line 154
    .line 155
    invoke-static {v0, v6}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 159
    const-string v11, "faceName"

    .line 160
    .line 161
    const-string v12, "faceSummary"

    .line 162
    .line 163
    if-eqz v6, :cond_9

    .line 164
    .line 165
    if-eqz p2, :cond_8

    .line 166
    .line 167
    if-nez v10, :cond_7

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_7
    :try_start_2
    invoke-static {v6, v11, v13}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v6, v14, v13}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v6, v12, v13}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    const/4 v15, 0x1

    .line 180
    invoke-static {v6, v13, v15, v2}, Li5;->N1(Ljava/lang/Object;Ljava/lang/String;Z[Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_8
    :goto_5
    invoke-static {v6, v11, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v6, v14, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-static {v6, v12, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    const/4 v15, 0x0

    .line 194
    invoke-static {v6, v3, v15, v2}, Li5;->N1(Ljava/lang/Object;Ljava/lang/String;Z[Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    add-int/lit8 v8, v8, 0x1

    .line 198
    .line 199
    const/4 v10, 0x1

    .line 200
    :cond_9
    :goto_6
    const-string v6, "faceBubbleElement"

    .line 201
    .line 202
    invoke-static {v0, v6}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    if-nez v6, :cond_a

    .line 207
    .line 208
    const-string v6, "faceElement"

    .line 209
    .line 210
    invoke-static {v0, v6}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 214
    :cond_a
    const-string v15, "content"

    .line 215
    .line 216
    if-eqz v6, :cond_d

    .line 217
    .line 218
    if-eqz p2, :cond_b

    .line 219
    .line 220
    if-nez v10, :cond_c

    .line 221
    .line 222
    :cond_b
    move-object/from16 v16, v1

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_c
    :try_start_3
    invoke-static {v6, v15, v13}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    invoke-static {v6, v12, v13}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v6, v14, v13}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 232
    .line 233
    .line 234
    move-object/from16 v16, v1

    .line 235
    .line 236
    const/4 v1, 0x1

    .line 237
    :try_start_4
    invoke-static {v6, v13, v1, v2}, Li5;->N1(Ljava/lang/Object;Ljava/lang/String;Z[Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    goto :goto_8

    .line 241
    :catchall_1
    move-exception v0

    .line 242
    goto/16 :goto_1

    .line 243
    .line 244
    :goto_7
    invoke-static {v6, v15, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v6, v12, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-static {v6, v14, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    const/4 v1, 0x0

    .line 254
    invoke-static {v6, v3, v1, v2}, Li5;->N1(Ljava/lang/Object;Ljava/lang/String;Z[Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    add-int/lit8 v9, v9, 0x1

    .line 258
    .line 259
    const/4 v10, 0x1

    .line 260
    goto :goto_8

    .line 261
    :cond_d
    move-object/from16 v16, v1

    .line 262
    .line 263
    :goto_8
    const-string v1, "giphyElement"

    .line 264
    .line 265
    invoke-static {v0, v1}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    if-eqz v0, :cond_f

    .line 270
    .line 271
    if-eqz p2, :cond_10

    .line 272
    .line 273
    if-nez v10, :cond_e

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_e
    invoke-static {v0}, Li5;->D(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    :cond_f
    const/4 v11, 0x0

    .line 280
    goto :goto_b

    .line 281
    :catchall_2
    move-exception v0

    .line 282
    goto/16 :goto_2

    .line 283
    .line 284
    :cond_10
    :goto_9
    invoke-static {v0, v15, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    const-string v1, "text"

    .line 288
    .line 289
    invoke-static {v0, v1, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    const-string v1, "name"

    .line 293
    .line 294
    invoke-static {v0, v1, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    invoke-static {v0, v14, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    invoke-static {v0, v11, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    invoke-static {v0, v12, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 304
    .line 305
    .line 306
    const/4 v11, 0x0

    .line 307
    :try_start_5
    invoke-static {v0, v3, v11, v2}, Li5;->N1(Ljava/lang/Object;Ljava/lang/String;Z[Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 308
    .line 309
    .line 310
    add-int/lit8 v9, v9, 0x1

    .line 311
    .line 312
    const/4 v10, 0x1

    .line 313
    goto :goto_b

    .line 314
    :catchall_3
    move-exception v0

    .line 315
    :goto_a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    const-string v6, "rewriteOutgoingPicSummary failed: "

    .line 318
    .line 319
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    :goto_b
    move-object/from16 v1, v16

    .line 333
    .line 334
    goto/16 :goto_0

    .line 335
    .line 336
    :cond_11
    sget-boolean v0, Li5;->o:Z

    .line 337
    .line 338
    if-eqz v0, :cond_12

    .line 339
    .line 340
    goto :goto_c

    .line 341
    :cond_12
    if-gtz v7, :cond_13

    .line 342
    .line 343
    if-gtz v8, :cond_13

    .line 344
    .line 345
    if-lez v9, :cond_14

    .line 346
    .line 347
    :cond_13
    const/4 v15, 0x1

    .line 348
    sput-boolean v15, Li5;->o:Z

    .line 349
    .line 350
    new-instance v0, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    const-string v1, "pic summary rewritten: pic="

    .line 353
    .line 354
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    const-string v1, ", marketFace="

    .line 361
    .line 362
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    const-string v1, ", faceBubble="

    .line 369
    .line 370
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    const-string v1, ", chatType="

    .line 377
    .line 378
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    :cond_14
    :goto_c
    return-void
.end method

.method public static D(Ljava/lang/Object;)V
    .locals 3

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    const-string v1, "\u200b"

    .line 4
    .line 5
    invoke-static {p0, v0, v1}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "text"

    .line 9
    .line 10
    invoke-static {p0, v0, v1}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "name"

    .line 14
    .line 15
    invoke-static {p0, v0, v1}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "summary"

    .line 19
    .line 20
    invoke-static {p0, v0, v1}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "faceName"

    .line 24
    .line 25
    invoke-static {p0, v0, v1}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "faceSummary"

    .line 29
    .line 30
    invoke-static {p0, v0, v1}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Li5;->m:[Ljava/lang/String;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-static {p0, v1, v2, v0}, Li5;->N1(Ljava/lang/Object;Ljava/lang/String;Z[Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static D0(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, "friend"

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    const-string v1, "buddy"

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    const-string v1, "contact"

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    const-string v1, "relation"

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    const-string v1, "c2c"

    .line 44
    .line 45
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    const-string v1, "uin"

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    const-string v1, "uid"

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    return v0

    .line 69
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 70
    return p0
.end method

.method public static D1(Landroid/content/Context;IIF)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p3}, Li5;->a0(Landroid/content/Context;F)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    int-to-float p1, p1

    .line 14
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 15
    .line 16
    .line 17
    const/high16 p1, 0x3f800000    # 1.0f

    .line 18
    .line 19
    invoke-static {p0, p1}, Li5;->a0(Landroid/content/Context;F)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-virtual {v0, p0, p2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static E(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    :catchall_0
    :goto_0
    return-void
.end method

.method public static E0(Ljava/lang/CharSequence;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v1, "99+"

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    const-string v1, "99\uff0b"

    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    const-string v1, "99"

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return v0

    .line 39
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 40
    return p0
.end method

.method public static E1(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 v0, 0xa

    .line 7
    .line 8
    const/16 v1, 0x20

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/16 v0, 0xd

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static F(Ljava/net/HttpURLConnection;Ll8;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    iget-object v1, p1, Ll8;->c:Ljava/net/HttpURLConnection;

    .line 9
    .line 10
    if-ne v1, p0, :cond_1

    .line 11
    .line 12
    iput-object v0, p1, Ll8;->c:Ljava/net/HttpURLConnection;

    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    iget-object v1, p1, Ll8;->c:Ljava/net/HttpURLConnection;

    .line 16
    .line 17
    if-ne v1, p0, :cond_1

    .line 18
    .line 19
    iput-object v0, p1, Ll8;->c:Ljava/net/HttpURLConnection;

    .line 20
    .line 21
    :cond_1
    :goto_0
    return-void
.end method

.method public static F0(Ljava/lang/String;ZZZ)Z
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    return p1

    .line 4
    :cond_0
    if-nez p1, :cond_2

    .line 5
    .line 6
    if-nez p3, :cond_2

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-static {p0, p1}, Li5;->n1(Ljava/lang/String;Z)Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    return p1

    .line 21
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 22
    return p0
.end method

.method public static F1(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/16 v0, 0xa

    .line 11
    .line 12
    const/16 v1, 0x20

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/16 v0, 0xd

    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-le v0, p1, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_1
    return-object p0
.end method

.method public static G(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    :catchall_0
    :goto_0
    return-void
.end method

.method public static G0(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "troop"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_5

    .line 26
    .line 27
    const-string v1, "group"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_5

    .line 34
    .line 35
    const-string v1, "guild"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_5

    .line 42
    .line 43
    const-string v1, "discuss"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    const-string v0, "groupUin"

    .line 53
    .line 54
    const-string v1, "guildId"

    .line 55
    .line 56
    const-string v2, "troopuin"

    .line 57
    .line 58
    const-string v3, "troopUin"

    .line 59
    .line 60
    const-string v4, "troopCode"

    .line 61
    .line 62
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {p0, v0}, Li5;->c2(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, La7;->q(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    const-string v0, "type"

    .line 78
    .line 79
    const-string v1, "mUinType"

    .line 80
    .line 81
    const-string v2, "chatType"

    .line 82
    .line 83
    const-string v3, "uinType"

    .line 84
    .line 85
    const-string v4, "contactType"

    .line 86
    .line 87
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {p0, v0}, Li5;->c2(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const/high16 v1, -0x80000000

    .line 100
    .line 101
    if-nez v0, :cond_3

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    :catchall_0
    :goto_0
    const/4 p0, 0x2

    .line 109
    if-eq v1, p0, :cond_5

    .line 110
    .line 111
    const/4 p0, 0x4

    .line 112
    if-eq v1, p0, :cond_5

    .line 113
    .line 114
    const/16 p0, 0x271e

    .line 115
    .line 116
    if-ne v1, p0, :cond_4

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 120
    return p0

    .line 121
    :cond_5
    :goto_2
    const/4 p0, 0x1

    .line 122
    return p0
.end method

.method public static G1(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    const-string v1, "other"

    .line 17
    .line 18
    invoke-virtual {v1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_3

    .line 23
    .line 24
    const-string v1, "__uncategorized__"

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/16 v1, 0x14

    .line 38
    .line 39
    if-gt v0, v1, :cond_2

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_2
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_3
    :goto_0
    return-object v0
.end method

.method public static H(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    :catchall_0
    :goto_0
    return-void
.end method

.method public static H0(Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x3

    .line 14
    if-lt v1, v2, :cond_6

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/16 v2, 0x40

    .line 21
    .line 22
    if-le v1, v2, :cond_1

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    const-string v1, "u_"

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v3, 0x4

    .line 39
    if-le v1, v3, :cond_2

    .line 40
    .line 41
    return v2

    .line 42
    :cond_2
    move v1, v0

    .line 43
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-ge v1, v3, :cond_5

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const/16 v4, 0x30

    .line 54
    .line 55
    if-lt v3, v4, :cond_4

    .line 56
    .line 57
    const/16 v4, 0x39

    .line 58
    .line 59
    if-le v3, v4, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    :goto_1
    return v0

    .line 66
    :cond_5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    const/4 v1, 0x5

    .line 71
    if-lt p0, v1, :cond_6

    .line 72
    .line 73
    return v2

    .line 74
    :cond_6
    :goto_2
    return v0
.end method

.method public static H1(Ljava/lang/CharSequence;I)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    goto :goto_0

    .line 6
    :catchall_0
    move-exception p0

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v1, "<error "

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, ">"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    const/16 v0, 0xd

    .line 27
    .line 28
    const/16 v1, 0x20

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const/16 v0, 0xa

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-lez p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-gt v0, p1, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    const/4 v0, 0x0

    .line 50
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string p1, "..."

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :cond_1
    :goto_1
    return-object p0
.end method

.method public static I(Ljava/lang/Object;Ljava/util/LinkedHashMap;Z)V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v5

    .line 10
    new-instance v6, Lq2;

    .line 11
    .line 12
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    move-object v1, p0

    .line 17
    move-object v2, p1

    .line 18
    move v3, p2

    .line 19
    invoke-static/range {v1 .. v6}, Li5;->d(Ljava/lang/Object;Ljava/util/LinkedHashMap;ZILjava/util/Set;Lq2;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static I0(Landroid/graphics/Bitmap;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    :cond_0
    move/from16 v16, v1

    .line 13
    .line 14
    goto/16 :goto_2

    .line 15
    .line 16
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-lez v2, :cond_2

    .line 25
    .line 26
    if-gtz v3, :cond_3

    .line 27
    .line 28
    :cond_2
    move/from16 v16, v1

    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_3
    div-int/lit8 v4, v2, 0xc

    .line 33
    .line 34
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    div-int/lit8 v5, v3, 0xc

    .line 39
    .line 40
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    div-int/lit8 v6, v5, 0x2

    .line 45
    .line 46
    const/4 v7, 0x0

    .line 47
    move v8, v7

    .line 48
    move v9, v8

    .line 49
    move v10, v9

    .line 50
    :goto_0
    if-ge v6, v3, :cond_9

    .line 51
    .line 52
    div-int/lit8 v11, v4, 0x2

    .line 53
    .line 54
    :goto_1
    if-ge v11, v2, :cond_8

    .line 55
    .line 56
    invoke-virtual {v0, v11, v6}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 57
    .line 58
    .line 59
    move-result v12

    .line 60
    ushr-int/lit8 v13, v12, 0x18

    .line 61
    .line 62
    and-int/lit16 v13, v13, 0xff

    .line 63
    .line 64
    ushr-int/lit8 v14, v12, 0x10

    .line 65
    .line 66
    and-int/lit16 v14, v14, 0xff

    .line 67
    .line 68
    ushr-int/lit8 v15, v12, 0x8

    .line 69
    .line 70
    and-int/lit16 v15, v15, 0xff

    .line 71
    .line 72
    and-int/lit16 v12, v12, 0xff

    .line 73
    .line 74
    add-int/lit8 v8, v8, 0x1

    .line 75
    .line 76
    move/from16 v16, v1

    .line 77
    .line 78
    invoke-static {v15, v12}, Ljava/lang/Math;->max(II)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-static {v14, v1}, Ljava/lang/Math;->max(II)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-static {v15, v12}, Ljava/lang/Math;->min(II)I

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    invoke-static {v14, v12}, Ljava/lang/Math;->min(II)I

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    const/16 v14, 0x20

    .line 95
    .line 96
    if-lt v13, v14, :cond_4

    .line 97
    .line 98
    sub-int v14, v1, v12

    .line 99
    .line 100
    const/16 v15, 0x16

    .line 101
    .line 102
    if-gt v14, v15, :cond_5

    .line 103
    .line 104
    const/16 v14, 0xb4

    .line 105
    .line 106
    if-lt v12, v14, :cond_5

    .line 107
    .line 108
    const/16 v14, 0xf8

    .line 109
    .line 110
    if-gt v1, v14, :cond_5

    .line 111
    .line 112
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 113
    .line 114
    :cond_5
    const/16 v14, 0x40

    .line 115
    .line 116
    if-le v13, v14, :cond_7

    .line 117
    .line 118
    const/16 v13, 0x78

    .line 119
    .line 120
    if-lt v12, v13, :cond_6

    .line 121
    .line 122
    sub-int/2addr v1, v12

    .line 123
    const/16 v12, 0x30

    .line 124
    .line 125
    if-le v1, v12, :cond_7

    .line 126
    .line 127
    :cond_6
    add-int/lit8 v10, v10, 0x1

    .line 128
    .line 129
    :cond_7
    add-int/2addr v11, v4

    .line 130
    move/from16 v1, v16

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_8
    move/from16 v16, v1

    .line 134
    .line 135
    add-int/2addr v6, v5

    .line 136
    goto :goto_0

    .line 137
    :cond_9
    move/from16 v16, v1

    .line 138
    .line 139
    if-lez v8, :cond_a

    .line 140
    .line 141
    mul-int/lit8 v9, v9, 0x64

    .line 142
    .line 143
    div-int/2addr v9, v8

    .line 144
    const/16 v0, 0x50

    .line 145
    .line 146
    if-lt v9, v0, :cond_a

    .line 147
    .line 148
    mul-int/lit8 v10, v10, 0x64

    .line 149
    .line 150
    div-int/2addr v10, v8

    .line 151
    const/16 v0, 0x8

    .line 152
    .line 153
    if-gt v10, v0, :cond_a

    .line 154
    .line 155
    return v16

    .line 156
    :cond_a
    return v7

    .line 157
    :goto_2
    return v16
.end method

.method public static I1(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_6

    .line 8
    .line 9
    if-gtz p1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-lez v0, :cond_5

    .line 21
    .line 22
    if-gtz v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    int-to-float p1, p1

    .line 26
    int-to-float v2, v0

    .line 27
    div-float v3, p1, v2

    .line 28
    .line 29
    int-to-float v4, v1

    .line 30
    div-float/2addr p1, v4

    .line 31
    invoke-static {v3, p1}, Ljava/lang/Math;->min(FF)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/4 v3, 0x0

    .line 36
    cmpg-float v3, p1, v3

    .line 37
    .line 38
    if-gtz v3, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    mul-float/2addr v2, p1

    .line 42
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/4 v3, 0x1

    .line 47
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    mul-float/2addr v4, p1

    .line 52
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-ne v2, v0, :cond_3

    .line 61
    .line 62
    if-ne p1, v1, :cond_3

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-static {p0, v2, p1, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p2, :cond_4

    .line 70
    .line 71
    if-eq p1, p0, :cond_4

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 74
    .line 75
    .line 76
    :cond_4
    return-object p1

    .line 77
    :cond_5
    :goto_0
    return-object p0

    .line 78
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 79
    return-object p0
.end method

.method public static J(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/lang/String;ILjava/util/Set;)V
    .locals 9

    .line 1
    if-eqz p0, :cond_e

    .line 2
    .line 3
    const/4 v4, 0x5

    .line 4
    if-le p4, v4, :cond_0

    .line 5
    .line 6
    goto/16 :goto_4

    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    invoke-static {v4}, Li5;->M0(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    invoke-static {p0}, Li5;->B(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {p1, v0, p3}, Li5;->g(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    :try_start_0
    invoke-interface {p5, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    if-nez v4, :cond_2

    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :catchall_0
    :cond_2
    invoke-static {p0}, Li5;->t0(Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {v4}, Li5;->B(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {p1, v4, p3}, Li5;->g(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_3

    .line 47
    .line 48
    invoke-static {p0}, Li5;->h1(Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-static {p0}, Li5;->u0(Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-static {p2, v4, v6, v7}, Li5;->s1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    instance-of v4, p0, Ljava/util/Map$Entry;

    .line 60
    .line 61
    if-eqz v4, :cond_6

    .line 62
    .line 63
    move-object v0, p0

    .line 64
    check-cast v0, Ljava/util/Map$Entry;

    .line 65
    .line 66
    move-object v4, v0

    .line 67
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {v4}, Li5;->B(Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {v0}, Li5;->h1(Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-static {v0}, Li5;->u0(Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-gtz v8, :cond_4

    .line 92
    .line 93
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-lez v8, :cond_5

    .line 98
    .line 99
    :cond_4
    invoke-static {p1, v4, p3}, Li5;->g(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-eqz v8, :cond_5

    .line 104
    .line 105
    invoke-static {p2, v4, v6, v7}, Li5;->s1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_5
    add-int/lit8 v4, p4, 0x1

    .line 109
    .line 110
    move-object v1, p1

    .line 111
    move-object v2, p2

    .line 112
    move-object v3, p3

    .line 113
    move-object v5, p5

    .line 114
    invoke-static/range {v0 .. v5}, Li5;->J(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/lang/String;ILjava/util/Set;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_6
    instance-of v1, p0, Ljava/util/Map;

    .line 119
    .line 120
    const/16 v6, 0x3e8

    .line 121
    .line 122
    const/4 v2, 0x0

    .line 123
    if-eqz v1, :cond_8

    .line 124
    .line 125
    move-object v0, p0

    .line 126
    check-cast v0, Ljava/util/Map;

    .line 127
    .line 128
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_e

    .line 141
    .line 142
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    add-int/lit8 v8, v2, 0x1

    .line 147
    .line 148
    if-le v8, v6, :cond_7

    .line 149
    .line 150
    goto/16 :goto_4

    .line 151
    .line 152
    :cond_7
    add-int/lit8 v4, p4, 0x1

    .line 153
    .line 154
    move-object v1, p1

    .line 155
    move-object v2, p2

    .line 156
    move-object v3, p3

    .line 157
    move-object v5, p5

    .line 158
    invoke-static/range {v0 .. v5}, Li5;->J(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/lang/String;ILjava/util/Set;)V

    .line 159
    .line 160
    .line 161
    move v2, v8

    .line 162
    goto :goto_0

    .line 163
    :cond_8
    instance-of v1, p0, Ljava/lang/Iterable;

    .line 164
    .line 165
    if-eqz v1, :cond_a

    .line 166
    .line 167
    move-object v0, p0

    .line 168
    check-cast v0, Ljava/lang/Iterable;

    .line 169
    .line 170
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_e

    .line 179
    .line 180
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    add-int/lit8 v8, v2, 0x1

    .line 185
    .line 186
    if-le v8, v6, :cond_9

    .line 187
    .line 188
    goto/16 :goto_4

    .line 189
    .line 190
    :cond_9
    add-int/lit8 v4, p4, 0x1

    .line 191
    .line 192
    move-object v1, p1

    .line 193
    move-object v2, p2

    .line 194
    move-object v3, p3

    .line 195
    move-object v5, p5

    .line 196
    invoke-static/range {v0 .. v5}, Li5;->J(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/lang/String;ILjava/util/Set;)V

    .line 197
    .line 198
    .line 199
    move v2, v8

    .line 200
    goto :goto_1

    .line 201
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-eqz v3, :cond_b

    .line 210
    .line 211
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    move v8, v2

    .line 220
    :goto_2
    if-ge v8, v7, :cond_e

    .line 221
    .line 222
    invoke-static {p0, v8}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    add-int/lit8 v5, p4, 0x1

    .line 227
    .line 228
    move-object v2, p1

    .line 229
    move-object v3, p2

    .line 230
    move-object v4, p3

    .line 231
    move-object v6, p5

    .line 232
    invoke-static/range {v1 .. v6}, Li5;->J(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/lang/String;ILjava/util/Set;)V

    .line 233
    .line 234
    .line 235
    add-int/lit8 v8, v8, 0x1

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_b
    const/4 v2, 0x3

    .line 239
    if-lt p4, v2, :cond_c

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_c
    invoke-static {v1}, Li5;->j(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    :catchall_1
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    if-eqz v1, :cond_e

    .line 255
    .line 256
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    check-cast v1, Ljava/lang/reflect/Field;

    .line 261
    .line 262
    invoke-static {v1, p4}, Li5;->O1(Ljava/lang/reflect/Field;I)Z

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    if-nez v2, :cond_d

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_d
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    add-int/lit8 v5, p4, 0x1

    .line 274
    .line 275
    move-object v2, p1

    .line 276
    move-object v3, p2

    .line 277
    move-object v4, p3

    .line 278
    move-object v6, p5

    .line 279
    invoke-static/range {v1 .. v6}, Li5;->J(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/lang/String;ILjava/util/Set;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 280
    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_e
    :goto_4
    return-void
.end method

.method public static J0(Landroid/view/View;I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    if-gtz p1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    return v0

    .line 14
    :catchall_0
    :cond_1
    const/4 v1, 0x1

    .line 15
    invoke-static {p0, v1}, Li5;->e2(Landroid/view/View;Z)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-static {p0, v0}, Li5;->e2(Landroid/view/View;Z)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-lez v2, :cond_4

    .line 24
    .line 25
    if-gtz p0, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    mul-int/lit8 p1, p1, 0x6

    .line 29
    .line 30
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-gt v2, p1, :cond_3

    .line 35
    .line 36
    if-gt p0, p1, :cond_3

    .line 37
    .line 38
    move v0, v1

    .line 39
    :cond_3
    return v0

    .line 40
    :cond_4
    :goto_0
    return v1

    .line 41
    :cond_5
    :goto_1
    return v0
.end method

.method public static J1(JJ)J
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    const-wide/16 v1, -0x1

    .line 6
    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    return-wide v1

    .line 10
    :cond_0
    :try_start_0
    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->multiplyExact(JJ)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-wide p0

    .line 15
    :catch_0
    return-wide v1
.end method

.method public static K(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)V
    .locals 10

    .line 1
    if-eqz p1, :cond_13

    .line 2
    .line 3
    if-eqz p3, :cond_13

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    if-gt p0, v0, :cond_13

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x30

    .line 13
    .line 14
    if-ge v0, v1, :cond_13

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    aget v1, p4, v0

    .line 18
    .line 19
    const/16 v2, 0xb4

    .line 20
    .line 21
    if-le v1, v2, :cond_0

    .line 22
    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_0
    invoke-interface {p3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :cond_1
    aget v1, p4, v0

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    add-int/2addr v1, v2

    .line 37
    aput v1, p4, v0

    .line 38
    .line 39
    instance-of v1, p1, Ljava/lang/CharSequence;

    .line 40
    .line 41
    if-eqz v1, :cond_7

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-nez p0, :cond_2

    .line 48
    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_13

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    const/16 p3, 0x140

    .line 66
    .line 67
    if-le p1, p3, :cond_3

    .line 68
    .line 69
    goto/16 :goto_6

    .line 70
    .line 71
    :cond_3
    const-string p1, "file://"

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_4

    .line 78
    .line 79
    const/4 p1, 0x7

    .line 80
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    :cond_4
    const-string p1, "/storage/"

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-lez p1, :cond_5

    .line 91
    .line 92
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    :cond_5
    const-string p1, "/"

    .line 97
    .line 98
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_6

    .line 103
    .line 104
    const-string p1, "\\"

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_13

    .line 111
    .line 112
    :cond_6
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-nez p1, :cond_13

    .line 117
    .line 118
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_7
    instance-of v1, p1, Ljava/lang/Number;

    .line 123
    .line 124
    if-nez v1, :cond_13

    .line 125
    .line 126
    instance-of v1, p1, Ljava/lang/Boolean;

    .line 127
    .line 128
    if-nez v1, :cond_13

    .line 129
    .line 130
    instance-of v1, p1, Ljava/lang/Class;

    .line 131
    .line 132
    if-eqz v1, :cond_8

    .line 133
    .line 134
    goto/16 :goto_6

    .line 135
    .line 136
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    const/16 v4, 0x28

    .line 145
    .line 146
    if-eqz v3, :cond_9

    .line 147
    .line 148
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    :goto_0
    if-ge v0, v1, :cond_13

    .line 157
    .line 158
    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    add-int/lit8 v4, p0, 0x1

    .line 163
    .line 164
    invoke-static {v4, v3, p2, p3, p4}, Li5;->K(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)V

    .line 165
    .line 166
    .line 167
    add-int/lit8 v0, v0, 0x1

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_9
    instance-of v3, p1, Ljava/lang/Iterable;

    .line 171
    .line 172
    if-eqz v3, :cond_a

    .line 173
    .line 174
    check-cast p1, Ljava/lang/Iterable;

    .line 175
    .line 176
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eqz v1, :cond_13

    .line 185
    .line 186
    if-ge v0, v4, :cond_13

    .line 187
    .line 188
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    add-int/lit8 v3, p0, 0x1

    .line 193
    .line 194
    invoke-static {v3, v1, p2, p3, p4}, Li5;->K(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)V

    .line 195
    .line 196
    .line 197
    add-int/lit8 v0, v0, 0x1

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_a
    instance-of v3, p1, Ljava/util/Map;

    .line 201
    .line 202
    if-eqz v3, :cond_c

    .line 203
    .line 204
    check-cast p1, Ljava/util/Map;

    .line 205
    .line 206
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-eqz v1, :cond_13

    .line 219
    .line 220
    if-ge v0, v4, :cond_13

    .line 221
    .line 222
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    instance-of v3, v1, Ljava/util/Map$Entry;

    .line 227
    .line 228
    if-eqz v3, :cond_b

    .line 229
    .line 230
    check-cast v1, Ljava/util/Map$Entry;

    .line 231
    .line 232
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    add-int/lit8 v5, p0, 0x1

    .line 237
    .line 238
    invoke-static {v5, v3, p2, p3, p4}, Li5;->K(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)V

    .line 239
    .line 240
    .line 241
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-static {v5, v1, p2, p3, p4}, Li5;->K(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)V

    .line 246
    .line 247
    .line 248
    :cond_b
    add-int/lit8 v0, v0, 0x1

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_c
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    const-string v4, "java."

    .line 256
    .line 257
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    if-nez v4, :cond_13

    .line 262
    .line 263
    const-string v4, "android."

    .line 264
    .line 265
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    if-eqz v3, :cond_d

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_d
    move v3, v0

    .line 273
    :goto_3
    if-eqz v1, :cond_13

    .line 274
    .line 275
    const-class v4, Ljava/lang/Object;

    .line 276
    .line 277
    if-eq v1, v4, :cond_13

    .line 278
    .line 279
    const/16 v4, 0x34

    .line 280
    .line 281
    if-ge v3, v4, :cond_13

    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    move v6, v0

    .line 288
    :goto_4
    array-length v7, v5

    .line 289
    if-ge v6, v7, :cond_12

    .line 290
    .line 291
    if-ge v3, v4, :cond_12

    .line 292
    .line 293
    aget-object v7, v5, v6

    .line 294
    .line 295
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 296
    .line 297
    .line 298
    move-result v8

    .line 299
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 300
    .line 301
    .line 302
    move-result v8

    .line 303
    if-eqz v8, :cond_e

    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_e
    add-int/lit8 v3, v3, 0x1

    .line 307
    .line 308
    :try_start_0
    invoke-virtual {v7, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v7, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    instance-of v8, v7, Ljava/lang/CharSequence;

    .line 316
    .line 317
    if-nez v8, :cond_10

    .line 318
    .line 319
    if-eqz v7, :cond_11

    .line 320
    .line 321
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    move-result-object v8

    .line 325
    invoke-virtual {v8}, Ljava/lang/Class;->isPrimitive()Z

    .line 326
    .line 327
    .line 328
    move-result v9

    .line 329
    if-nez v9, :cond_11

    .line 330
    .line 331
    invoke-virtual {v8}, Ljava/lang/Class;->isEnum()Z

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    if-eqz v9, :cond_f

    .line 336
    .line 337
    goto :goto_5

    .line 338
    :cond_f
    const-class v9, Ljava/lang/Number;

    .line 339
    .line 340
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 341
    .line 342
    .line 343
    move-result v9

    .line 344
    if-nez v9, :cond_11

    .line 345
    .line 346
    const-class v9, Ljava/lang/Boolean;

    .line 347
    .line 348
    if-eq v9, v8, :cond_11

    .line 349
    .line 350
    const-class v9, Ljava/lang/Character;

    .line 351
    .line 352
    if-ne v9, v8, :cond_10

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_10
    add-int/lit8 v8, p0, 0x1

    .line 356
    .line 357
    invoke-static {v8, v7, p2, p3, p4}, Li5;->K(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 358
    .line 359
    .line 360
    :catchall_0
    :cond_11
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 361
    .line 362
    goto :goto_4

    .line 363
    :cond_12
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    goto :goto_3

    .line 368
    :cond_13
    :goto_6
    return-void
.end method

.method public static K0(Ljava/io/IOException;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Li5;->E1(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "too large"

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    const-string v0, "storage"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    const-string v0, "space"

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    const-string v0, "cancel"

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_0

    .line 46
    .line 47
    const-string v0, "changed"

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    const-string v0, "incomplete"

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_0

    .line 62
    .line 63
    const/4 p0, 0x1

    .line 64
    return p0

    .line 65
    :cond_0
    const/4 p0, 0x0

    .line 66
    return p0
.end method

.method public static K1(Ljava/util/LinkedHashSet;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    const/4 v2, 0x6

    .line 8
    if-ge v1, v2, :cond_2

    .line 9
    .line 10
    sget-object v2, Li5;->d:[I

    .line 11
    .line 12
    aget v2, v2, v1

    .line 13
    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-interface {p0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-lez v3, :cond_1

    .line 30
    .line 31
    const/16 v3, 0x2c

    .line 32
    .line 33
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public static L(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x12

    .line 11
    .line 12
    if-gt v0, v1, :cond_1

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/16 v2, 0x9

    .line 22
    .line 23
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, "..."

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/lit8 v1, v1, -0x6

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static L0(Ljava/io/IOException;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-eqz p0, :cond_2

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    if-ge v1, v2, :cond_2

    .line 8
    .line 9
    instance-of v2, p0, Ljava/net/SocketTimeoutException;

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    instance-of v2, p0, Ljava/net/ConnectException;

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    instance-of v2, p0, Ljava/net/NoRouteToHostException;

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    instance-of v2, p0, Ljava/net/UnknownHostException;

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    instance-of v2, p0, Ljava/io/EOFException;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    :goto_1
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_2
    return v0
.end method

.method public static L1(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "duplicate"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p0, "\u8fd9\u4e2a\u8868\u60c5\u5df2\u7ecf\u4e0a\u4f20\u8fc7"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "rate_limited"

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string p0, "\u4e0a\u4f20\u8fc7\u4e8e\u9891\u7e41\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    const-string v0, "too_many_pending"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const-string p0, "\u5f85\u5ba1\u6838\u8868\u60c5\u8fc7\u591a\uff0c\u8bf7\u7b49\u5f85\u5ba1\u6838"

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    const-string v0, "invalid_image"

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    const-string p0, "\u6240\u9009\u6587\u4ef6\u4e0d\u662f\u652f\u6301\u7684\u8868\u60c5\u56fe\u7247"

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    const-string v0, "body_too_large"

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_4

    .line 52
    .line 53
    const-string p0, "\u8868\u60c5\u6587\u4ef6\u8fc7\u5927"

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    const-string p0, "\u4e91\u7aef\u8868\u60c5\u670d\u52a1\u6682\u65f6\u4e0d\u53ef\u7528"

    .line 57
    .line 58
    return-object p0
.end method

.method public static M(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    if-nez p0, :cond_1

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_1
    if-nez p1, :cond_2

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_2
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static M0(Ljava/lang/Class;)Z
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-class v0, Ljava/lang/String;

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const-class v0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    const-class v0, Ljava/lang/Boolean;

    .line 22
    .line 23
    if-eq v0, p0, :cond_1

    .line 24
    .line 25
    const-class v0, Ljava/lang/Character;

    .line 26
    .line 27
    if-eq v0, p0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "android.view."

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string v0, "android.widget."

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/4 p0, 0x0

    .line 61
    return p0

    .line 62
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 63
    return p0
.end method

.method public static M1(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget v0, p1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 2
    .line 3
    if-ltz v0, :cond_1

    .line 4
    .line 5
    iget v1, p1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 6
    .line 7
    if-ltz v1, :cond_1

    .line 8
    .line 9
    int-to-long v2, v0

    .line 10
    int-to-long v0, v1

    .line 11
    add-long/2addr v2, v0

    .line 12
    invoke-virtual {p0}, Ljava/nio/Buffer;->capacity()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-long v0, v0

    .line 17
    cmp-long v0, v2, v0

    .line 18
    .line 19
    if-gtz v0, :cond_0

    .line 20
    .line 21
    iget p1, p1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 24
    .line 25
    .line 26
    long-to-int p1, v2

    .line 27
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-static {p2}, Lu2;->c(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    invoke-static {p2}, Lu2;->c(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static N(Landroid/app/Dialog;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 1

    .line 1
    invoke-static {}, La9;->b()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 6
    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    :catchall_0
    return-void
.end method

.method public static N0(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "image/jpeg"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-string v0, "image/png"

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string v0, "image/gif"

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    const-string v0, "image/webp"

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 p0, 0x0

    .line 45
    return p0

    .line 46
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 47
    return p0
.end method

.method public static varargs N1(Ljava/lang/Object;Ljava/lang/String;Z[Ljava/lang/String;)V
    .locals 11

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_4

    .line 6
    .line 7
    const-class v1, Ljava/lang/Object;

    .line 8
    .line 9
    if-eq v0, v1, :cond_4

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_1
    if-ge v4, v2, :cond_3

    .line 19
    .line 20
    aget-object v5, v1, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    .line 22
    :try_start_1
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-nez v6, :cond_2

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    const-class v7, Ljava/lang/String;

    .line 37
    .line 38
    if-ne v6, v7, :cond_2

    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    array-length v7, p3

    .line 51
    move v8, v3

    .line 52
    :goto_2
    if-ge v8, v7, :cond_2

    .line 53
    .line 54
    aget-object v9, p3, v8

    .line 55
    .line 56
    if-eqz v9, :cond_1

    .line 57
    .line 58
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    if-lez v10, :cond_1

    .line 63
    .line 64
    invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    invoke-virtual {v6, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    if-eqz v9, :cond_1

    .line 73
    .line 74
    const/4 v6, 0x1

    .line 75
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    check-cast v6, Ljava/lang/String;

    .line 83
    .line 84
    if-nez p2, :cond_0

    .line 85
    .line 86
    if-eqz v6, :cond_0

    .line 87
    .line 88
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-eqz v7, :cond_0

    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eqz v7, :cond_0

    .line 103
    .line 104
    const-string v7, "[\u56fe\u7247]"

    .line 105
    .line 106
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-nez v7, :cond_0

    .line 111
    .line 112
    const-string v7, "[\u56fe]"

    .line 113
    .line 114
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-nez v7, :cond_0

    .line 119
    .line 120
    const-string v7, "\u56fe\u7247"

    .line 121
    .line 122
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-nez v7, :cond_0

    .line 127
    .line 128
    const-string v7, "[pic]"

    .line 129
    .line 130
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    if-nez v7, :cond_0

    .line 135
    .line 136
    const-string v7, "[image]"

    .line 137
    .line 138
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-eqz v6, :cond_2

    .line 143
    .line 144
    :cond_0
    invoke-virtual {v5, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :catchall_0
    :cond_2
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 152
    .line 153
    goto/16 :goto_1

    .line 154
    .line 155
    :cond_3
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :catchall_1
    :cond_4
    return-void
.end method

.method public static O(Landroid/view/View;I)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    const/4 v1, 0x5

    .line 5
    if-gt p1, v1, :cond_2

    .line 6
    .line 7
    instance-of v1, p0, Landroid/widget/TextView;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    move-object v1, p0

    .line 13
    check-cast v1, Landroid/widget/TextView;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const-string v3, "\u901a\u77e5"

    .line 22
    .line 23
    invoke-virtual {v3, v1}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    check-cast p0, Landroid/view/ViewGroup;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/16 v3, 0x28

    .line 41
    .line 42
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    move v3, v0

    .line 47
    :goto_0
    if-ge v3, v1, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    add-int/lit8 v5, p1, 0x1

    .line 54
    .line 55
    invoke-static {v4, v5}, Li5;->O(Landroid/view/View;I)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    :goto_1
    return v2

    .line 62
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    return v0
.end method

.method public static O0(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v2, 0x80

    .line 13
    .line 14
    if-le v0, v2, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    move v0, v1

    .line 18
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ge v0, v2, :cond_5

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/16 v3, 0x61

    .line 29
    .line 30
    if-lt v2, v3, :cond_1

    .line 31
    .line 32
    const/16 v3, 0x7a

    .line 33
    .line 34
    if-le v2, v3, :cond_4

    .line 35
    .line 36
    :cond_1
    const/16 v3, 0x41

    .line 37
    .line 38
    if-lt v2, v3, :cond_2

    .line 39
    .line 40
    const/16 v3, 0x5a

    .line 41
    .line 42
    if-le v2, v3, :cond_4

    .line 43
    .line 44
    :cond_2
    const/16 v3, 0x30

    .line 45
    .line 46
    if-lt v2, v3, :cond_3

    .line 47
    .line 48
    const/16 v3, 0x39

    .line 49
    .line 50
    if-le v2, v3, :cond_4

    .line 51
    .line 52
    :cond_3
    const/16 v3, 0x2d

    .line 53
    .line 54
    if-eq v2, v3, :cond_4

    .line 55
    .line 56
    const/16 v3, 0x5f

    .line 57
    .line 58
    if-ne v2, v3, :cond_6

    .line 59
    .line 60
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_5
    const/4 p0, 0x1

    .line 64
    return p0

    .line 65
    :cond_6
    :goto_1
    return v1
.end method

.method public static O1(Ljava/lang/reflect/Field;I)Z
    .locals 2

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Li5;->M0(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const/4 v1, 0x1

    .line 36
    if-gt p1, v1, :cond_2

    .line 37
    .line 38
    invoke-static {p0}, Li5;->D0(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-static {v0}, Li5;->B1(Ljava/lang/Class;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-nez p0, :cond_4

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    const-string p0, ""

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :goto_0
    invoke-static {p0}, Li5;->D0(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_5

    .line 65
    .line 66
    :cond_4
    :goto_1
    return v1

    .line 67
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 68
    return p0
.end method

.method public static P(Landroid/view/View;Landroid/widget/EditText;I[I)Z
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_c

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-gt p2, v1, :cond_c

    .line 6
    .line 7
    aget v2, p3, v0

    .line 8
    .line 9
    const/16 v3, 0x20

    .line 10
    .line 11
    if-le v2, v3, :cond_0

    .line 12
    .line 13
    goto/16 :goto_6

    .line 14
    .line 15
    :cond_0
    const/4 v4, 0x1

    .line 16
    add-int/2addr v2, v4

    .line 17
    aput v2, p3, v0

    .line 18
    .line 19
    instance-of v2, p0, Landroid/widget/TextView;

    .line 20
    .line 21
    if-eqz v2, :cond_9

    .line 22
    .line 23
    if-eq p0, p1, :cond_9

    .line 24
    .line 25
    move-object v2, p0

    .line 26
    check-cast v2, Landroid/widget/TextView;

    .line 27
    .line 28
    :try_start_0
    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_1

    .line 33
    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_1
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    if-nez v5, :cond_3

    .line 41
    .line 42
    :cond_2
    :goto_0
    move v6, v0

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    invoke-interface {v5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_2

    .line 57
    .line 58
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const/16 v8, 0x8c

    .line 63
    .line 64
    if-le v7, v8, :cond_4

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    const-string v7, "\u53d1\u9001"

    .line 68
    .line 69
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-nez v7, :cond_2

    .line 74
    .line 75
    const-string v7, "\u8f93\u5165\u6d88\u606f"

    .line 76
    .line 77
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-nez v7, :cond_2

    .line 82
    .line 83
    const-string v7, "\u6309\u4f4f \u8bf4\u8bdd"

    .line 84
    .line 85
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-eqz v7, :cond_5

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_5
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-nez v7, :cond_6

    .line 97
    .line 98
    move v6, v0

    .line 99
    goto :goto_1

    .line 100
    :cond_6
    const-string v7, "[ELARIS_FAV:"

    .line 101
    .line 102
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    :goto_1
    xor-int/2addr v6, v4

    .line 107
    :goto_2
    if-nez v6, :cond_7

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_7
    new-array v6, v1, [I

    .line 111
    .line 112
    new-array v1, v1, [I

    .line 113
    .line 114
    invoke-virtual {p1, v6}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 118
    .line 119
    .line 120
    aget v6, v6, v4

    .line 121
    .line 122
    aget v1, v1, v4

    .line 123
    .line 124
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    add-int/2addr v2, v1

    .line 129
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    const/16 v8, 0xa0

    .line 134
    .line 135
    invoke-static {v7, v8}, Li5;->b0(Landroid/content/Context;I)I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    const/16 v9, 0x18

    .line 144
    .line 145
    invoke-static {v8, v9}, Li5;->b0(Landroid/content/Context;I)I

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    sub-int v7, v6, v7

    .line 150
    .line 151
    if-lt v2, v7, :cond_9

    .line 152
    .line 153
    add-int/2addr v6, v8

    .line 154
    if-le v1, v6, :cond_8

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_8
    invoke-static {v5}, Li5;->c1(Ljava/lang/CharSequence;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_a

    .line 162
    .line 163
    invoke-static {v5}, Li5;->b1(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    if-eqz v1, :cond_9

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :catchall_0
    :cond_9
    :goto_3
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 171
    .line 172
    if-eqz v1, :cond_c

    .line 173
    .line 174
    check-cast p0, Landroid/view/ViewGroup;

    .line 175
    .line 176
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    move v2, v0

    .line 185
    :goto_4
    if-ge v2, v1, :cond_c

    .line 186
    .line 187
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    add-int/lit8 v5, p2, 0x1

    .line 192
    .line 193
    invoke-static {v3, p1, v5, p3}, Li5;->P(Landroid/view/View;Landroid/widget/EditText;I[I)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-eqz v3, :cond_b

    .line 198
    .line 199
    :cond_a
    :goto_5
    return v4

    .line 200
    :cond_b
    add-int/lit8 v2, v2, 0x1

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_c
    :goto_6
    return v0
.end method

.method public static P0(Ljava/lang/ClassLoader;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "null"

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-object v1, v0

    .line 14
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/16 v3, 0x78

    .line 19
    .line 20
    if-le v2, v3, :cond_1

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v3, "@"

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v0, "["

    .line 69
    .line 70
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, "]"

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method

.method public static P1(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;)V
    .locals 14

    .line 1
    invoke-static {p0}, Li5;->z0(Landroid/app/Activity;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    goto/16 :goto_0

    .line 12
    .line 13
    :cond_0
    new-instance v2, Landroid/app/Dialog;

    .line 14
    .line 15
    invoke-direct {v2, p0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Lu9;->d(Landroid/app/Dialog;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lx8;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Li5;->m1(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    const/high16 v1, 0x41880000    # 17.0f

    .line 31
    .line 32
    invoke-static {p0}, Lu9;->G(Landroid/content/Context;)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const-string v4, "\u6587\u5b57\u8f6c\u8bed\u97f3"

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    invoke-static {p0, v4, v1, v3, v5}, Li5;->U1(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v3, "\u5173\u95ed"

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-static {p0, v3, v4}, Li5;->t(Landroid/content/Context;Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    new-instance v3, Landroid/widget/LinearLayout;

    .line 51
    .line 52
    invoke-direct {v3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 53
    .line 54
    .line 55
    const/16 v6, 0x10

    .line 56
    .line 57
    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 58
    .line 59
    .line 60
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 61
    .line 62
    const/4 v9, -0x2

    .line 63
    const/high16 v10, 0x3f800000    # 1.0f

    .line 64
    .line 65
    invoke-direct {v6, v4, v9, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 69
    .line 70
    .line 71
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 72
    .line 73
    const/high16 v6, 0x42680000    # 58.0f

    .line 74
    .line 75
    invoke-static {p0, v6}, Li5;->a0(Landroid/content/Context;F)I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    const/high16 v9, 0x42000000    # 32.0f

    .line 80
    .line 81
    invoke-static {p0, v9}, Li5;->a0(Landroid/content/Context;F)I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    invoke-direct {v1, v6, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 89
    .line 90
    .line 91
    invoke-static {}, Li5;->d1()Landroid/widget/LinearLayout$LayoutParams;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v7, v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 96
    .line 97
    .line 98
    const/high16 v1, 0x41400000    # 12.0f

    .line 99
    .line 100
    invoke-static {p0}, Lu9;->E(Landroid/content/Context;)I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    const-string v6, "\u6b63\u5728\u52a0\u8f7d\u97f3\u8272"

    .line 105
    .line 106
    invoke-static {p0, v6, v1, v3, v4}, Li5;->U1(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    invoke-static {}, Li5;->d1()Landroid/widget/LinearLayout$LayoutParams;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    const/high16 v3, 0x40c00000    # 6.0f

    .line 115
    .line 116
    invoke-static {p0, v3}, Li5;->a0(Landroid/content/Context;F)I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 121
    .line 122
    invoke-virtual {v7, v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 123
    .line 124
    .line 125
    new-instance v10, Landroid/widget/ListView;

    .line 126
    .line 127
    invoke-direct {v10, p0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 128
    .line 129
    .line 130
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 131
    .line 132
    invoke-direct {v1, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v10, v1}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 136
    .line 137
    .line 138
    const/high16 v11, 0x41000000    # 8.0f

    .line 139
    .line 140
    invoke-static {p0, v11}, Li5;->a0(Landroid/content/Context;F)I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    invoke-virtual {v10, v1}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 145
    .line 146
    .line 147
    const/4 v12, 0x2

    .line 148
    invoke-virtual {v10, v12}, Landroid/view/View;->setOverScrollMode(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v10, v5}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v10, v4}, Landroid/view/View;->setVisibility(I)V

    .line 155
    .line 156
    .line 157
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 158
    .line 159
    invoke-direct {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 160
    .line 161
    .line 162
    new-instance v13, Lz8;

    .line 163
    .line 164
    new-instance v1, Lo8;

    .line 165
    .line 166
    move-object v4, p0

    .line 167
    move-object v5, p1

    .line 168
    move-object/from16 v6, p2

    .line 169
    .line 170
    invoke-direct/range {v1 .. v6}, Lo8;-><init>(Landroid/app/Dialog;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;)V

    .line 171
    .line 172
    .line 173
    move-object p1, v1

    .line 174
    invoke-direct {v13, p0, p1}, Lz8;-><init>(Landroid/app/Activity;Lo8;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v10, v13}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 178
    .line 179
    .line 180
    invoke-static {p0}, Lu9;->z(Landroid/app/Activity;)I

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 185
    .line 186
    const/4 v4, -0x1

    .line 187
    invoke-direct {v3, v4, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 188
    .line 189
    .line 190
    invoke-static {p0, v11}, Li5;->a0(Landroid/content/Context;F)I

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    iput p1, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 195
    .line 196
    invoke-virtual {v7, v10, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 197
    .line 198
    .line 199
    new-instance p1, Lj6;

    .line 200
    .line 201
    invoke-direct {p1, v2, v12}, Lj6;-><init>(Landroid/app/Dialog;I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v8, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 205
    .line 206
    .line 207
    new-instance p1, Lt8;

    .line 208
    .line 209
    invoke-direct {p1, v0}, Lt8;-><init>(Lx8;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, p1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v7}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 216
    .line 217
    .line 218
    invoke-static {p0}, Lu9;->A(Landroid/app/Activity;)I

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    invoke-static {v2, p1}, Li5;->o(Landroid/app/Dialog;I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 226
    .line 227
    .line 228
    invoke-static {p0}, Lu9;->A(Landroid/app/Activity;)I

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    invoke-static {v2, p1}, Li5;->o(Landroid/app/Dialog;I)V

    .line 233
    .line 234
    .line 235
    move-object v1, p0

    .line 236
    move-object v6, v0

    .line 237
    move-object v3, v9

    .line 238
    move-object v4, v10

    .line 239
    move-object v5, v13

    .line 240
    invoke-static/range {v1 .. v6}, Li5;->T0(Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/ListView;Lz8;Lx8;)V

    .line 241
    .line 242
    .line 243
    :cond_1
    :goto_0
    return-void
.end method

.method public static Q(Landroid/view/View;Ljava/lang/String;I)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    if-eqz p1, :cond_5

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    if-gt p2, v1, :cond_5

    .line 8
    .line 9
    instance-of v1, p0, Landroid/widget/TextView;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    move-object v1, p0

    .line 15
    check-cast v1, Landroid/widget/TextView;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v1}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    :cond_0
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    :cond_1
    return v2

    .line 50
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 51
    .line 52
    .line 53
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    const/4 v1, 0x0

    .line 56
    :goto_0
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    return v2

    .line 69
    :cond_3
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 70
    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    check-cast p0, Landroid/view/ViewGroup;

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    const/16 v3, 0x28

    .line 80
    .line 81
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    move v3, v0

    .line 86
    :goto_1
    if-ge v3, v1, :cond_5

    .line 87
    .line 88
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    add-int/lit8 v5, p2, 0x1

    .line 93
    .line 94
    invoke-static {v4, p1, v5}, Li5;->Q(Landroid/view/View;Ljava/lang/String;I)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_4

    .line 99
    .line 100
    return v2

    .line 101
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    return v0
.end method

.method public static Q0(Lj5;)Lmd;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lmd;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lmd;-><init>(Lj5;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static Q1(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Lb9;Ljava/lang/String;)V
    .locals 14

    .line 1
    move-object/from16 v7, p3

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    invoke-static {p0}, Li5;->z0(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    if-nez v7, :cond_0

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    new-instance v4, Landroid/app/Dialog;

    .line 16
    .line 17
    invoke-direct {v4, p0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v4}, Lu9;->d(Landroid/app/Dialog;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Li5;->m1(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    iget-object v1, v7, Lb9;->b:Ljava/lang/String;

    .line 28
    .line 29
    const/high16 v2, 0x41880000    # 17.0f

    .line 30
    .line 31
    invoke-static {p0}, Lu9;->G(Landroid/content/Context;)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const/4 v5, 0x1

    .line 36
    invoke-static {p0, v1, v2, v3, v5}, Li5;->U1(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {}, Li5;->d1()Landroid/widget/LinearLayout$LayoutParams;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v8, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Landroid/widget/EditText;

    .line 48
    .line 49
    invoke-direct {v1, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    const-string v2, "\u8f93\u5165\u8981\u8f6c\u6362\u7684\u6587\u5b57\uff08\u6700\u591a 200 \u5b57\uff09"

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0}, Lu9;->G(Landroid/content/Context;)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_1

    .line 69
    .line 70
    const v2, -0x70695d

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    const v2, -0x635c51

    .line 75
    .line 76
    .line 77
    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 78
    .line 79
    .line 80
    const/high16 v2, 0x41700000    # 15.0f

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 83
    .line 84
    .line 85
    const v2, 0x800033

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 89
    .line 90
    .line 91
    const/4 v9, 0x0

    .line 92
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 93
    .line 94
    .line 95
    const/4 v2, 0x3

    .line 96
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMinLines(I)V

    .line 97
    .line 98
    .line 99
    const/4 v2, 0x6

    .line 100
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 101
    .line 102
    .line 103
    const/high16 v2, 0x41400000    # 12.0f

    .line 104
    .line 105
    invoke-static {p0, v2}, Li5;->a0(Landroid/content/Context;F)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    const/high16 v6, 0x41200000    # 10.0f

    .line 110
    .line 111
    invoke-static {p0, v6}, Li5;->a0(Landroid/content/Context;F)I

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    invoke-static {p0, v2}, Li5;->a0(Landroid/content/Context;F)I

    .line 116
    .line 117
    .line 118
    move-result v11

    .line 119
    invoke-static {p0, v6}, Li5;->a0(Landroid/content/Context;F)I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-virtual {v1, v3, v10, v11, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 124
    .line 125
    .line 126
    const v3, 0x24001

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setInputType(I)V

    .line 130
    .line 131
    .line 132
    new-instance v3, Landroid/text/InputFilter$LengthFilter;

    .line 133
    .line 134
    const/16 v6, 0x190

    .line 135
    .line 136
    invoke-direct {v3, v6}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 137
    .line 138
    .line 139
    new-array v6, v5, [Landroid/text/InputFilter;

    .line 140
    .line 141
    aput-object v3, v6, v9

    .line 142
    .line 143
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 144
    .line 145
    .line 146
    if-eqz v0, :cond_2

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-lez v3, :cond_2

    .line 153
    .line 154
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Landroid/widget/TextView;->length()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 162
    .line 163
    .line 164
    :cond_2
    invoke-static {p0}, Lu9;->y(Landroid/content/Context;)I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-eqz v3, :cond_3

    .line 173
    .line 174
    const v3, -0xb3aea2

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_3
    const v3, -0x1c1813

    .line 179
    .line 180
    .line 181
    :goto_1
    invoke-static {p0, v0, v3, v2}, Li5;->D1(Landroid/content/Context;IIF)Landroid/graphics/drawable/GradientDrawable;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 186
    .line 187
    .line 188
    invoke-static {}, Li5;->d1()Landroid/widget/LinearLayout$LayoutParams;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    const/high16 v10, 0x41600000    # 14.0f

    .line 193
    .line 194
    invoke-static {p0, v10}, Li5;->a0(Landroid/content/Context;F)I

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 199
    .line 200
    invoke-virtual {v8, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 201
    .line 202
    .line 203
    new-instance v11, Landroid/widget/LinearLayout;

    .line 204
    .line 205
    invoke-direct {v11, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 206
    .line 207
    .line 208
    const/16 v0, 0x10

    .line 209
    .line 210
    invoke-virtual {v11, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 211
    .line 212
    .line 213
    const-string v0, "\u8fd4\u56de"

    .line 214
    .line 215
    invoke-static {p0, v0, v9}, Li5;->t(Landroid/content/Context;Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    new-instance v2, Lq8;

    .line 220
    .line 221
    move-object/from16 v6, p2

    .line 222
    .line 223
    invoke-direct {v2, v4, p0, p1, v6}, Lq8;-><init>(Landroid/app/Dialog;Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 227
    .line 228
    .line 229
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 230
    .line 231
    const/4 v12, -0x1

    .line 232
    const/high16 v13, 0x3f800000    # 1.0f

    .line 233
    .line 234
    invoke-direct {v2, v9, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 235
    .line 236
    .line 237
    iput v9, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 238
    .line 239
    invoke-virtual {v11, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 240
    .line 241
    .line 242
    const-string v0, "\u751f\u6210\u5e76\u53d1\u9001"

    .line 243
    .line 244
    invoke-static {p0, v0, v5}, Li5;->t(Landroid/content/Context;Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    move-object v3, v0

    .line 249
    new-instance v0, Lr8;

    .line 250
    .line 251
    move-object v2, p0

    .line 252
    move-object v5, p1

    .line 253
    invoke-direct/range {v0 .. v7}, Lr8;-><init>(Landroid/widget/EditText;Landroid/app/Activity;Landroid/widget/TextView;Landroid/app/Dialog;Ljava/lang/ClassLoader;Lpd;Lb9;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x41000000    # 8.0f

    .line 260
    .line 261
    invoke-static {p0, v0}, Li5;->a0(Landroid/content/Context;F)I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 266
    .line 267
    invoke-direct {v5, v9, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 268
    .line 269
    .line 270
    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 271
    .line 272
    invoke-virtual {v11, v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 273
    .line 274
    .line 275
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 276
    .line 277
    const/high16 v3, 0x42200000    # 40.0f

    .line 278
    .line 279
    invoke-static {p0, v3}, Li5;->a0(Landroid/content/Context;F)I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    invoke-direct {v0, v12, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 284
    .line 285
    .line 286
    invoke-static {p0, v10}, Li5;->a0(Landroid/content/Context;F)I

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    iput v3, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 291
    .line 292
    invoke-virtual {v8, v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4, v8}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 296
    .line 297
    .line 298
    const/high16 v0, 0x43d20000    # 420.0f

    .line 299
    .line 300
    invoke-static {p0, v4, v0}, Li5;->n(Landroid/app/Activity;Landroid/app/Dialog;F)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v4}, Landroid/app/Dialog;->show()V

    .line 304
    .line 305
    .line 306
    invoke-static {p0, v4, v0}, Li5;->n(Landroid/app/Activity;Landroid/app/Dialog;F)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 310
    .line 311
    .line 312
    :cond_4
    :goto_2
    return-void
.end method

.method public static R(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_a

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :cond_0
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_a

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    cmp-long p0, v2, v4

    .line 30
    .line 31
    if-gtz p0, :cond_1

    .line 32
    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_1
    new-instance p0, Landroid/graphics/BitmapFactory$Options;

    .line 36
    .line 37
    invoke-direct {p0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    iput-boolean v2, p0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v3, p0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 48
    .line 49
    .line 50
    iget v3, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 51
    .line 52
    if-lez v3, :cond_a

    .line 53
    .line 54
    iget p0, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 55
    .line 56
    if-gtz p0, :cond_2

    .line 57
    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :cond_2
    invoke-static {v3, p0}, Ljava/lang/Math;->max(II)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    mul-int/lit8 v3, p1, 0x2

    .line 65
    .line 66
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    move v4, v2

    .line 71
    :goto_0
    div-int v5, p0, v4

    .line 72
    .line 73
    if-le v5, v3, :cond_3

    .line 74
    .line 75
    const/16 v5, 0x40

    .line 76
    .line 77
    if-ge v4, v5, :cond_3

    .line 78
    .line 79
    mul-int/lit8 v4, v4, 0x2

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    new-instance p0, Landroid/graphics/BitmapFactory$Options;

    .line 83
    .line 84
    invoke-direct {p0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 85
    .line 86
    .line 87
    iput v4, p0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 88
    .line 89
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 90
    .line 91
    iput-object v3, p0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v1, p0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    if-nez p0, :cond_4

    .line 102
    .line 103
    return-object v0

    .line 104
    :cond_4
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-lez v1, :cond_9

    .line 113
    .line 114
    if-gtz v3, :cond_5

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    int-to-float p1, p1

    .line 118
    int-to-float v4, v1

    .line 119
    div-float v5, p1, v4

    .line 120
    .line 121
    int-to-float v6, v3

    .line 122
    div-float/2addr p1, v6

    .line 123
    invoke-static {v5, p1}, Ljava/lang/Math;->min(FF)F

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    const/4 v5, 0x0

    .line 128
    cmpg-float v5, p1, v5

    .line 129
    .line 130
    if-gtz v5, :cond_6

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_6
    mul-float/2addr v4, p1

    .line 134
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    mul-float/2addr v6, p1

    .line 143
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-ne v4, v1, :cond_7

    .line 152
    .line 153
    if-ne p1, v3, :cond_7

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_7
    invoke-static {p0, v4, p1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-eq p1, p0, :cond_8

    .line 161
    .line 162
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    .line 164
    .line 165
    :cond_8
    return-object p1

    .line 166
    :cond_9
    :goto_1
    return-object p0

    .line 167
    :catchall_0
    :cond_a
    :goto_2
    return-object v0
.end method

.method public static R0(Ljava/lang/String;Ljava/lang/String;)Ly;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x28

    .line 11
    .line 12
    if-gt v0, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_0
    invoke-static {p1}, Li5;->G1(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v2, "__uncategorized__"

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    move-object v0, v2

    .line 32
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    const-string v2, "UTF-8"

    .line 37
    .line 38
    if-lez p1, :cond_2

    .line 39
    .line 40
    new-instance p1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v3, "https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/stickers/list?limit=60&q="

    .line 43
    .line 44
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const-string p0, "https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/stickers/list?limit=60"

    .line 60
    .line 61
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-lez p1, :cond_3

    .line 66
    .line 67
    new-instance p1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string p0, "&folder="

    .line 76
    .line 77
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    :cond_3
    const-string p1, "GET"

    .line 92
    .line 93
    const/4 v0, 0x0

    .line 94
    invoke-static {p1, p0, v0, v0}, Li5;->y1(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    const-string p1, "items"

    .line 99
    .line 100
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    new-instance v0, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v2, "id"

    .line 110
    .line 111
    const-string v3, ""

    .line 112
    .line 113
    if-eqz p1, :cond_c

    .line 114
    .line 115
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    const/16 v5, 0x3c

    .line 120
    .line 121
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    move v5, v1

    .line 126
    :goto_2
    if-ge v5, v4, :cond_c

    .line 127
    .line 128
    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    if-nez v6, :cond_4

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_4
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    const-string v8, "contentUrl"

    .line 144
    .line 145
    invoke-virtual {v6, v8, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    if-eqz v8, :cond_8

    .line 150
    .line 151
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    if-nez v9, :cond_5

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_5
    const-string v9, "https://"

    .line 159
    .line 160
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    if-nez v9, :cond_9

    .line 165
    .line 166
    const-string v9, "http://"

    .line 167
    .line 168
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    if-eqz v9, :cond_6

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_6
    const-string v9, "/"

    .line 176
    .line 177
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 178
    .line 179
    .line 180
    move-result v9

    .line 181
    if-eqz v9, :cond_7

    .line 182
    .line 183
    const-string v9, "https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com"

    .line 184
    .line 185
    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    goto :goto_4

    .line 190
    :cond_7
    const-string v9, "https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/stickers/"

    .line 191
    .line 192
    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    goto :goto_4

    .line 197
    :cond_8
    :goto_3
    move-object v8, v3

    .line 198
    :cond_9
    :goto_4
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 199
    .line 200
    .line 201
    move-result v9

    .line 202
    if-eqz v9, :cond_b

    .line 203
    .line 204
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    if-nez v9, :cond_a

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_a
    new-instance v9, Ll1;

    .line 212
    .line 213
    const-string v10, "title"

    .line 214
    .line 215
    invoke-virtual {v6, v10, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    invoke-static {v10}, Li5;->W(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v10

    .line 223
    const-string v11, "mime"

    .line 224
    .line 225
    const-string v12, "image/png"

    .line 226
    .line 227
    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-direct {v9, v7, v10, v6, v8}, Ll1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    :cond_b
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_c
    new-instance p1, Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 243
    .line 244
    .line 245
    const-string v4, "folders"

    .line 246
    .line 247
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    if-eqz p0, :cond_f

    .line 252
    .line 253
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    const/16 v5, 0x1e

    .line 258
    .line 259
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    move v5, v1

    .line 264
    :goto_6
    if-ge v5, v4, :cond_f

    .line 265
    .line 266
    invoke-virtual {p0, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    if-nez v6, :cond_d

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_d
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    const-string v8, "name"

    .line 282
    .line 283
    invoke-virtual {v6, v8, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    if-lez v9, :cond_e

    .line 296
    .line 297
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 298
    .line 299
    .line 300
    move-result v9

    .line 301
    if-lez v9, :cond_e

    .line 302
    .line 303
    new-instance v9, Lk1;

    .line 304
    .line 305
    const-string v10, "count"

    .line 306
    .line 307
    invoke-virtual {v6, v10, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 308
    .line 309
    .line 310
    invoke-direct {v9, v7, v8}, Lk1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    :cond_e
    :goto_7
    add-int/lit8 v5, v5, 0x1

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_f
    new-instance p0, Ly;

    .line 320
    .line 321
    invoke-direct {p0, v0, p1}, Ly;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    return-object p0
.end method

.method public static R1(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x40

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    instance-of v1, p0, Landroid/view/View;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    check-cast p0, Landroid/view/View;

    .line 43
    .line 44
    :try_start_0
    const-string v1, "[id="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, ",size="

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const/16 v1, 0x78

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const/16 p0, 0x5d

    .line 81
    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    :catchall_0
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    const/16 v0, 0xf0

    .line 90
    .line 91
    invoke-static {p0, v0}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0
.end method

.method public static S(Landroid/content/Context;Ljava/io/File;IILve;)Lt0;
    .locals 33

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    const-string v1, "channel-count"

    .line 4
    .line 5
    const-string v2, "sample-rate"

    .line 6
    .line 7
    const-string v3, "pcm-encoding"

    .line 8
    .line 9
    invoke-static/range {p0 .. p0}, Li5;->u(Landroid/content/Context;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v4}, Ljava/io/File;->getUsableSpace()J

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    const-wide/32 v7, 0x4200000

    .line 18
    .line 19
    .line 20
    cmp-long v7, v5, v7

    .line 21
    .line 22
    const-string v8, "not enough storage for decoded audio"

    .line 23
    .line 24
    if-ltz v7, :cond_1e

    .line 25
    .line 26
    const-string v7, "Elaris-local-audio-pcm-"

    .line 27
    .line 28
    const-string v10, ".pcm"

    .line 29
    .line 30
    invoke-static {v4, v7, v10}, Li5;->j1(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 31
    .line 32
    .line 33
    move-result-object v12

    .line 34
    new-instance v4, Landroid/media/MediaExtractor;

    .line 35
    .line 36
    invoke-direct {v4}, Landroid/media/MediaExtractor;-><init>()V

    .line 37
    .line 38
    .line 39
    :try_start_0
    invoke-static/range {p4 .. p4}, Li5;->y(Lve;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v10

    .line 46
    invoke-virtual {v4, v10}, Landroid/media/MediaExtractor;->setDataSource(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 v10, 0x0

    .line 50
    :goto_0
    invoke-virtual {v4}, Landroid/media/MediaExtractor;->getTrackCount()I

    .line 51
    .line 52
    .line 53
    move-result v11
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 54
    const-string v13, "application/ogg"

    .line 55
    .line 56
    const-string v14, "audio/"

    .line 57
    .line 58
    const-string v15, "mime"

    .line 59
    .line 60
    if-ge v10, v11, :cond_4

    .line 61
    .line 62
    :try_start_1
    invoke-virtual {v4, v10}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    invoke-virtual {v11, v15}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    if-nez v11, :cond_1

    .line 71
    .line 72
    :cond_0
    const/4 v7, 0x0

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 75
    .line 76
    invoke-virtual {v11, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-virtual {v7, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    if-nez v11, :cond_2

    .line 85
    .line 86
    invoke-virtual {v13, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    if-eqz v7, :cond_0

    .line 91
    .line 92
    :cond_2
    const/4 v7, 0x1

    .line 93
    :goto_1
    if-eqz v7, :cond_3

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :catchall_0
    :cond_3
    add-int/lit8 v10, v10, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    const/4 v10, -0x1

    .line 100
    :goto_2
    if-ltz v10, :cond_1b

    .line 101
    .line 102
    :try_start_2
    invoke-virtual {v4, v10}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-virtual {v7, v15}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    if-nez v11, :cond_5

    .line 111
    .line 112
    const-string v15, ""

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :catchall_1
    move-exception v0

    .line 116
    const/4 v7, 0x0

    .line 117
    const/4 v9, 0x0

    .line 118
    :goto_3
    const/16 v32, 0x0

    .line 119
    .line 120
    goto/16 :goto_21

    .line 121
    .line 122
    :catch_0
    move-exception v0

    .line 123
    const/4 v7, 0x0

    .line 124
    const/4 v9, 0x0

    .line 125
    :goto_4
    const/16 v32, 0x0

    .line 126
    .line 127
    goto/16 :goto_22

    .line 128
    .line 129
    :cond_5
    sget-object v15, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 130
    .line 131
    invoke-virtual {v11, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v15

    .line 135
    :goto_5
    if-nez v15, :cond_7

    .line 136
    .line 137
    :cond_6
    const/4 v9, 0x0

    .line 138
    goto :goto_6

    .line 139
    :cond_7
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 140
    .line 141
    invoke-virtual {v15, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    invoke-virtual {v9, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v14

    .line 149
    if-nez v14, :cond_8

    .line 150
    .line 151
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    if-eqz v9, :cond_6

    .line 156
    .line 157
    :cond_8
    const/4 v9, 0x1

    .line 158
    :goto_6
    if-eqz v9, :cond_1a

    .line 159
    .line 160
    const-string v9, "durationUs"
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 161
    .line 162
    :try_start_3
    invoke-virtual {v7, v9}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v13

    .line 166
    if-eqz v13, :cond_9

    .line 167
    .line 168
    invoke-virtual {v7, v9}, Landroid/media/MediaFormat;->getLong(Ljava/lang/String;)J

    .line 169
    .line 170
    .line 171
    move-result-wide v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 172
    :goto_7
    move-wide/from16 v17, v5

    .line 173
    .line 174
    goto :goto_8

    .line 175
    :catchall_2
    :cond_9
    const-wide/16 v13, -0x1

    .line 176
    .line 177
    goto :goto_7

    .line 178
    :goto_8
    const-wide/16 v5, 0x0

    .line 179
    .line 180
    cmp-long v9, v13, v5

    .line 181
    .line 182
    const-wide/16 v5, 0x1

    .line 183
    .line 184
    if-gtz v9, :cond_a

    .line 185
    .line 186
    const-wide/16 v13, 0x0

    .line 187
    .line 188
    goto :goto_9

    .line 189
    :cond_a
    move/from16 v9, p3

    .line 190
    .line 191
    move-wide/from16 v21, v13

    .line 192
    .line 193
    int-to-long v13, v9

    .line 194
    :try_start_4
    invoke-static {v5, v6, v13, v14}, Ljava/lang/Math;->max(JJ)J

    .line 195
    .line 196
    .line 197
    move-result-wide v13

    .line 198
    mul-long v13, v13, v21

    .line 199
    .line 200
    const-wide/32 v21, 0x7a1200

    .line 201
    .line 202
    .line 203
    div-long v13, v13, v21

    .line 204
    .line 205
    :goto_9
    const-wide/32 v21, 0x800000

    .line 206
    .line 207
    .line 208
    add-long v13, v13, v21

    .line 209
    .line 210
    move-wide/from16 v21, v5

    .line 211
    .line 212
    const-wide/32 v5, 0x2000000

    .line 213
    .line 214
    .line 215
    invoke-static {v5, v6, v13, v14}, Ljava/lang/Math;->max(JJ)J

    .line 216
    .line 217
    .line 218
    move-result-wide v13
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 219
    sub-long v5, v17, v5

    .line 220
    .line 221
    sub-long/2addr v5, v13

    .line 222
    const-wide/32 v13, 0x200000

    .line 223
    .line 224
    .line 225
    cmp-long v9, v5, v13

    .line 226
    .line 227
    if-ltz v9, :cond_19

    .line 228
    .line 229
    const/4 v8, 0x2

    .line 230
    :try_start_5
    invoke-virtual {v7, v3, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 231
    .line 232
    .line 233
    :catchall_3
    :try_start_6
    invoke-virtual {v4, v10}, Landroid/media/MediaExtractor;->selectTrack(I)V

    .line 234
    .line 235
    .line 236
    invoke-static {v11}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 237
    .line 238
    .line 239
    move-result-object v9
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 240
    const/4 v10, 0x0

    .line 241
    const/4 v11, 0x0

    .line 242
    :try_start_7
    invoke-virtual {v9, v7, v10, v10, v11}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v9}, Landroid/media/MediaCodec;->start()V

    .line 246
    .line 247
    .line 248
    const v10, 0xac44

    .line 249
    .line 250
    .line 251
    invoke-static {v7, v2, v10}, Li5;->e1(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    const/4 v11, 0x1

    .line 256
    invoke-static {v7, v1, v11}, Li5;->e1(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    .line 257
    .line 258
    .line 259
    move-result v13

    .line 260
    invoke-static {v7, v3, v8}, Li5;->e1(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    .line 261
    .line 262
    .line 263
    move-result v7

    .line 264
    new-instance v14, Ljava/io/FileOutputStream;

    .line 265
    .line 266
    invoke-direct {v14, v12}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_e
    .catchall {:try_start_7 .. :try_end_7} :catchall_15

    .line 267
    .line 268
    .line 269
    move/from16 p1, v8

    .line 270
    .line 271
    :try_start_8
    new-instance v8, Lta;

    .line 272
    .line 273
    invoke-direct {v8, v0, v14, v5, v6}, Lta;-><init>(ILjava/io/FileOutputStream;J)V

    .line 274
    .line 275
    .line 276
    new-instance v5, Landroid/media/MediaCodec$BufferInfo;

    .line 277
    .line 278
    invoke-direct {v5}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 282
    .line 283
    .line 284
    move-result-wide v16
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_d
    .catchall {:try_start_8 .. :try_end_8} :catchall_14

    .line 285
    move v11, v13

    .line 286
    move-wide/from16 v30, v16

    .line 287
    .line 288
    const/4 v6, 0x0

    .line 289
    const/4 v13, 0x0

    .line 290
    :goto_a
    if-nez v6, :cond_16

    .line 291
    .line 292
    :try_start_9
    invoke-static/range {p4 .. p4}, Li5;->y(Lve;)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8
    .catchall {:try_start_9 .. :try_end_9} :catchall_c

    .line 293
    .line 294
    .line 295
    move-object/from16 v18, v12

    .line 296
    .line 297
    move/from16 p3, v13

    .line 298
    .line 299
    const-wide/16 v12, 0x2710

    .line 300
    .line 301
    if-nez p3, :cond_e

    .line 302
    .line 303
    move/from16 v16, v6

    .line 304
    .line 305
    :try_start_a
    invoke-virtual {v9, v12, v13}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    if-ltz v6, :cond_d

    .line 310
    .line 311
    invoke-virtual {v9, v6}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 312
    .line 313
    .line 314
    move-result-object v12

    .line 315
    if-eqz v12, :cond_c

    .line 316
    .line 317
    invoke-virtual {v12}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 318
    .line 319
    .line 320
    move-object/from16 v32, v14

    .line 321
    .line 322
    :try_start_b
    invoke-virtual {v4}, Landroid/media/MediaExtractor;->getSampleTime()J

    .line 323
    .line 324
    .line 325
    move-result-wide v13

    .line 326
    move/from16 v24, v6

    .line 327
    .line 328
    const/4 v6, 0x0

    .line 329
    invoke-virtual {v4, v12, v6}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    .line 330
    .line 331
    .line 332
    move-result v26
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 333
    if-gez v26, :cond_b

    .line 334
    .line 335
    const-wide/16 v27, 0x0

    .line 336
    .line 337
    const/16 v29, 0x4

    .line 338
    .line 339
    const/16 v25, 0x0

    .line 340
    .line 341
    const/16 v26, 0x0

    .line 342
    .line 343
    move-object/from16 v23, v9

    .line 344
    .line 345
    :try_start_c
    invoke-virtual/range {v23 .. v29}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 346
    .line 347
    .line 348
    move-object v6, v8

    .line 349
    move-object/from16 v8, v23

    .line 350
    .line 351
    const/16 p3, 0x1

    .line 352
    .line 353
    :goto_b
    const/4 v9, 0x1

    .line 354
    :goto_c
    const-wide/16 v12, 0x2710

    .line 355
    .line 356
    goto/16 :goto_15

    .line 357
    .line 358
    :catchall_4
    move-exception v0

    .line 359
    move-object/from16 v12, v18

    .line 360
    .line 361
    move-object/from16 v9, v23

    .line 362
    .line 363
    :goto_d
    const/4 v7, 0x0

    .line 364
    goto/16 :goto_21

    .line 365
    .line 366
    :catch_1
    move-exception v0

    .line 367
    move-object/from16 v12, v18

    .line 368
    .line 369
    move-object/from16 v9, v23

    .line 370
    .line 371
    :goto_e
    const/4 v7, 0x0

    .line 372
    goto/16 :goto_22

    .line 373
    .line 374
    :cond_b
    move-object v6, v8

    .line 375
    move-object/from16 v23, v9

    .line 376
    .line 377
    const-wide/16 v8, 0x0

    .line 378
    .line 379
    :try_start_d
    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->max(JJ)J

    .line 380
    .line 381
    .line 382
    move-result-wide v27

    .line 383
    const/16 v29, 0x0

    .line 384
    .line 385
    const/16 v25, 0x0

    .line 386
    .line 387
    invoke-virtual/range {v23 .. v29}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 388
    .line 389
    .line 390
    move-object/from16 v8, v23

    .line 391
    .line 392
    :try_start_e
    invoke-virtual {v4}, Landroid/media/MediaExtractor;->advance()Z

    .line 393
    .line 394
    .line 395
    goto :goto_b

    .line 396
    :catchall_5
    move-exception v0

    .line 397
    :goto_f
    move-object v9, v8

    .line 398
    :goto_10
    move-object/from16 v12, v18

    .line 399
    .line 400
    goto :goto_d

    .line 401
    :catch_2
    move-exception v0

    .line 402
    :goto_11
    move-object v9, v8

    .line 403
    :goto_12
    move-object/from16 v12, v18

    .line 404
    .line 405
    goto :goto_e

    .line 406
    :catchall_6
    move-exception v0

    .line 407
    move-object/from16 v8, v23

    .line 408
    .line 409
    goto :goto_f

    .line 410
    :catch_3
    move-exception v0

    .line 411
    move-object/from16 v8, v23

    .line 412
    .line 413
    goto :goto_11

    .line 414
    :catchall_7
    move-exception v0

    .line 415
    move-object v8, v9

    .line 416
    goto :goto_10

    .line 417
    :catch_4
    move-exception v0

    .line 418
    move-object v8, v9

    .line 419
    goto :goto_12

    .line 420
    :catchall_8
    move-exception v0

    .line 421
    move-object v8, v9

    .line 422
    move-object/from16 v32, v14

    .line 423
    .line 424
    goto :goto_10

    .line 425
    :catch_5
    move-exception v0

    .line 426
    move-object v8, v9

    .line 427
    move-object/from16 v32, v14

    .line 428
    .line 429
    goto :goto_12

    .line 430
    :cond_c
    move-object v8, v9

    .line 431
    move-object/from16 v32, v14

    .line 432
    .line 433
    new-instance v0, Ljava/io/IOException;

    .line 434
    .line 435
    const-string v1, "audio decoder input missing"

    .line 436
    .line 437
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    throw v0
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_2
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 441
    :cond_d
    :goto_13
    move-object v6, v8

    .line 442
    move-object v8, v9

    .line 443
    move-object/from16 v32, v14

    .line 444
    .line 445
    goto :goto_14

    .line 446
    :cond_e
    move/from16 v16, v6

    .line 447
    .line 448
    goto :goto_13

    .line 449
    :goto_14
    const/4 v9, 0x0

    .line 450
    goto :goto_c

    .line 451
    :goto_15
    :try_start_f
    invoke-virtual {v8, v5, v12, v13}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 452
    .line 453
    .line 454
    move-result v12
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_7
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    .line 455
    const/4 v13, -0x2

    .line 456
    if-ne v12, v13, :cond_10

    .line 457
    .line 458
    :try_start_10
    invoke-virtual {v8}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 459
    .line 460
    .line 461
    move-result-object v9

    .line 462
    invoke-static {v9, v2, v10}, Li5;->e1(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    .line 463
    .line 464
    .line 465
    move-result v10

    .line 466
    invoke-static {v9, v1, v11}, Li5;->e1(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    .line 467
    .line 468
    .line 469
    move-result v11

    .line 470
    invoke-static {v9, v3, v7}, Li5;->e1(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    .line 471
    .line 472
    .line 473
    move-result v7
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_2
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    .line 474
    const/4 v9, 0x1

    .line 475
    :cond_f
    const/4 v13, 0x0

    .line 476
    goto :goto_1a

    .line 477
    :cond_10
    if-ltz v12, :cond_f

    .line 478
    .line 479
    :try_start_11
    iget v9, v5, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 480
    .line 481
    if-lez v9, :cond_12

    .line 482
    .line 483
    iget v9, v5, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 484
    .line 485
    and-int/lit8 v9, v9, 0x2

    .line 486
    .line 487
    if-nez v9, :cond_12

    .line 488
    .line 489
    invoke-virtual {v8, v12}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 490
    .line 491
    .line 492
    move-result-object v9

    .line 493
    if-eqz v9, :cond_11

    .line 494
    .line 495
    const-string v13, "audio decoder output invalid"

    .line 496
    .line 497
    invoke-static {v9, v5, v13}, Li5;->M1(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v6, v9, v10, v11, v7}, Lta;->g(Ljava/nio/ByteBuffer;III)V

    .line 501
    .line 502
    .line 503
    goto :goto_16

    .line 504
    :catchall_9
    move-exception v0

    .line 505
    const/4 v13, 0x0

    .line 506
    goto :goto_19

    .line 507
    :cond_11
    new-instance v0, Ljava/io/IOException;

    .line 508
    .line 509
    const-string v1, "audio decoder output missing"

    .line 510
    .line 511
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    throw v0

    .line 515
    :cond_12
    :goto_16
    iget v9, v5, Landroid/media/MediaCodec$BufferInfo;->flags:I
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 516
    .line 517
    and-int/lit8 v9, v9, 0x4

    .line 518
    .line 519
    if-eqz v9, :cond_13

    .line 520
    .line 521
    const/16 v16, 0x1

    .line 522
    .line 523
    :cond_13
    const/4 v13, 0x0

    .line 524
    :try_start_12
    invoke-virtual {v8, v12, v13}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 525
    .line 526
    .line 527
    const/4 v9, 0x1

    .line 528
    goto :goto_1a

    .line 529
    :catchall_a
    move-exception v0

    .line 530
    :goto_17
    move-object v9, v8

    .line 531
    move v7, v13

    .line 532
    move-object/from16 v12, v18

    .line 533
    .line 534
    goto/16 :goto_21

    .line 535
    .line 536
    :catch_6
    move-exception v0

    .line 537
    :goto_18
    move-object v9, v8

    .line 538
    move v7, v13

    .line 539
    move-object/from16 v12, v18

    .line 540
    .line 541
    goto/16 :goto_22

    .line 542
    .line 543
    :goto_19
    invoke-virtual {v8, v12, v13}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 544
    .line 545
    .line 546
    throw v0

    .line 547
    :goto_1a
    if-eqz v9, :cond_14

    .line 548
    .line 549
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 550
    .line 551
    .line 552
    move-result-wide v23

    .line 553
    move-wide/from16 v30, v23

    .line 554
    .line 555
    goto :goto_1b

    .line 556
    :cond_14
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 557
    .line 558
    .line 559
    move-result-wide v23

    .line 560
    sub-long v23, v23, v30

    .line 561
    .line 562
    const-wide v25, 0x6fc23ac00L

    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    cmp-long v9, v23, v25

    .line 568
    .line 569
    if-gtz v9, :cond_15

    .line 570
    .line 571
    :goto_1b
    move/from16 v13, p3

    .line 572
    .line 573
    move-object v9, v8

    .line 574
    move-object/from16 v12, v18

    .line 575
    .line 576
    move-object/from16 v14, v32

    .line 577
    .line 578
    move-object v8, v6

    .line 579
    move/from16 v6, v16

    .line 580
    .line 581
    goto/16 :goto_a

    .line 582
    .line 583
    :cond_15
    new-instance v0, Ljava/io/IOException;

    .line 584
    .line 585
    const-string v1, "audio decoder stalled"

    .line 586
    .line 587
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    throw v0
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_6
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 591
    :catchall_b
    move-exception v0

    .line 592
    const/4 v13, 0x0

    .line 593
    goto :goto_17

    .line 594
    :catch_7
    move-exception v0

    .line 595
    const/4 v13, 0x0

    .line 596
    goto :goto_18

    .line 597
    :catchall_c
    move-exception v0

    .line 598
    move-object v8, v9

    .line 599
    move-object/from16 v18, v12

    .line 600
    .line 601
    move-object/from16 v32, v14

    .line 602
    .line 603
    const/4 v13, 0x0

    .line 604
    move v7, v13

    .line 605
    goto/16 :goto_21

    .line 606
    .line 607
    :catch_8
    move-exception v0

    .line 608
    move-object v8, v9

    .line 609
    move-object/from16 v18, v12

    .line 610
    .line 611
    move-object/from16 v32, v14

    .line 612
    .line 613
    const/4 v13, 0x0

    .line 614
    move v7, v13

    .line 615
    goto/16 :goto_22

    .line 616
    .line 617
    :cond_16
    move-object v6, v8

    .line 618
    move-object v8, v9

    .line 619
    move-object/from16 v18, v12

    .line 620
    .line 621
    move-object/from16 v32, v14

    .line 622
    .line 623
    const/4 v13, 0x0

    .line 624
    :try_start_13
    invoke-virtual {v6}, Lta;->e()V

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v32 .. v32}, Ljava/io/OutputStream;->flush()V

    .line 628
    .line 629
    .line 630
    move v1, v13

    .line 631
    invoke-virtual/range {v18 .. v18}, Ljava/io/File;->length()J

    .line 632
    .line 633
    .line 634
    move-result-wide v13

    .line 635
    iget-wide v2, v6, Lta;->l:J

    .line 636
    .line 637
    const-wide/16 v5, 0x2

    .line 638
    .line 639
    cmp-long v5, v13, v5

    .line 640
    .line 641
    if-ltz v5, :cond_18

    .line 642
    .line 643
    const-wide/16 v19, 0x0

    .line 644
    .line 645
    cmp-long v5, v2, v19

    .line 646
    .line 647
    if-lez v5, :cond_18

    .line 648
    .line 649
    int-to-long v5, v0

    .line 650
    add-long v19, v2, v5

    .line 651
    .line 652
    sub-long v19, v19, v21

    .line 653
    .line 654
    div-long v5, v19, v5

    .line 655
    .line 656
    const-wide/32 v19, 0x7fffffff

    .line 657
    .line 658
    .line 659
    cmp-long v9, v5, v19

    .line 660
    .line 661
    if-lez v9, :cond_17

    .line 662
    .line 663
    const v5, 0x7fffffff

    .line 664
    .line 665
    .line 666
    move-wide/from16 v19, v2

    .line 667
    .line 668
    goto :goto_1c

    .line 669
    :cond_17
    move-wide/from16 v19, v2

    .line 670
    .line 671
    move-wide/from16 v1, v21

    .line 672
    .line 673
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 674
    .line 675
    .line 676
    move-result-wide v1

    .line 677
    long-to-int v5, v1

    .line 678
    :goto_1c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 679
    .line 680
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 681
    .line 682
    .line 683
    const-string v2, "local voice audio decoded mime="

    .line 684
    .line 685
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    .line 688
    invoke-static {v15}, Li5;->E1(Ljava/lang/String;)Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    const-string v2, " source_rate="

    .line 696
    .line 697
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    const-string v2, " source_channels="

    .line 704
    .line 705
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 706
    .line 707
    .line 708
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    const-string v2, " pcm_encoding="

    .line 712
    .line 713
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 717
    .line 718
    .line 719
    const-string v2, " output_rate="

    .line 720
    .line 721
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 725
    .line 726
    .line 727
    const-string v0, " seconds="

    .line 728
    .line 729
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 733
    .line 734
    .line 735
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_b
    .catchall {:try_start_13 .. :try_end_13} :catchall_12

    .line 740
    .line 741
    .line 742
    :try_start_14
    new-instance v11, Lt0;
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_a
    .catchall {:try_start_14 .. :try_end_14} :catchall_11

    .line 743
    .line 744
    move/from16 v17, v5

    .line 745
    .line 746
    move-object/from16 v12, v18

    .line 747
    .line 748
    move-wide/from16 v15, v19

    .line 749
    .line 750
    const/4 v1, 0x1

    .line 751
    :try_start_15
    invoke-direct/range {v11 .. v17}, Lt0;-><init>(Ljava/io/File;JJI)V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_9
    .catchall {:try_start_15 .. :try_end_15} :catchall_10

    .line 752
    .line 753
    .line 754
    invoke-static/range {v32 .. v32}, Li5;->H(Ljava/io/Closeable;)V

    .line 755
    .line 756
    .line 757
    :try_start_16
    invoke-virtual {v8}, Landroid/media/MediaCodec;->stop()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_d

    .line 758
    .line 759
    .line 760
    :catchall_d
    :try_start_17
    invoke-virtual {v8}, Landroid/media/MediaCodec;->release()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_e

    .line 761
    .line 762
    .line 763
    :catchall_e
    :try_start_18
    invoke-virtual {v4}, Landroid/media/MediaExtractor;->release()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_f

    .line 764
    .line 765
    .line 766
    :catchall_f
    return-object v11

    .line 767
    :catchall_10
    move-exception v0

    .line 768
    :goto_1d
    move v7, v1

    .line 769
    move-object v9, v8

    .line 770
    goto :goto_21

    .line 771
    :catch_9
    move-exception v0

    .line 772
    :goto_1e
    move v7, v1

    .line 773
    move-object v9, v8

    .line 774
    goto/16 :goto_22

    .line 775
    .line 776
    :catchall_11
    move-exception v0

    .line 777
    move-object/from16 v12, v18

    .line 778
    .line 779
    const/4 v1, 0x1

    .line 780
    goto :goto_1d

    .line 781
    :catch_a
    move-exception v0

    .line 782
    move-object/from16 v12, v18

    .line 783
    .line 784
    const/4 v1, 0x1

    .line 785
    goto :goto_1e

    .line 786
    :catchall_12
    move-exception v0

    .line 787
    move-object/from16 v12, v18

    .line 788
    .line 789
    :goto_1f
    move-object v9, v8

    .line 790
    goto/16 :goto_d

    .line 791
    .line 792
    :catch_b
    move-exception v0

    .line 793
    move-object/from16 v12, v18

    .line 794
    .line 795
    :goto_20
    move-object v9, v8

    .line 796
    goto/16 :goto_e

    .line 797
    .line 798
    :cond_18
    move-object/from16 v12, v18

    .line 799
    .line 800
    :try_start_19
    new-instance v0, Ljava/io/IOException;

    .line 801
    .line 802
    const-string v1, "audio decode empty"

    .line 803
    .line 804
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    throw v0
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_c
    .catchall {:try_start_19 .. :try_end_19} :catchall_13

    .line 808
    :catchall_13
    move-exception v0

    .line 809
    goto :goto_1f

    .line 810
    :catch_c
    move-exception v0

    .line 811
    goto :goto_20

    .line 812
    :catchall_14
    move-exception v0

    .line 813
    move-object v8, v9

    .line 814
    move-object/from16 v32, v14

    .line 815
    .line 816
    goto/16 :goto_d

    .line 817
    .line 818
    :catch_d
    move-exception v0

    .line 819
    move-object v8, v9

    .line 820
    move-object/from16 v32, v14

    .line 821
    .line 822
    goto/16 :goto_e

    .line 823
    .line 824
    :catchall_15
    move-exception v0

    .line 825
    move-object v8, v9

    .line 826
    const/4 v7, 0x0

    .line 827
    goto/16 :goto_3

    .line 828
    .line 829
    :catch_e
    move-exception v0

    .line 830
    move-object v8, v9

    .line 831
    const/4 v7, 0x0

    .line 832
    goto/16 :goto_4

    .line 833
    .line 834
    :cond_19
    :try_start_1a
    new-instance v0, Ljava/io/IOException;

    .line 835
    .line 836
    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 837
    .line 838
    .line 839
    throw v0

    .line 840
    :cond_1a
    new-instance v0, Ljava/io/IOException;

    .line 841
    .line 842
    const-string v1, "audio mime missing"

    .line 843
    .line 844
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    throw v0

    .line 848
    :cond_1b
    new-instance v0, Ljava/io/IOException;

    .line 849
    .line 850
    const-string v1, "audio track missing"

    .line 851
    .line 852
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    throw v0
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_0
    .catchall {:try_start_1a .. :try_end_1a} :catchall_1

    .line 856
    :goto_21
    :try_start_1b
    new-instance v1, Ljava/io/IOException;

    .line 857
    .line 858
    new-instance v2, Ljava/lang/StringBuilder;

    .line 859
    .line 860
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 861
    .line 862
    .line 863
    const-string v3, "audio decode failed: "

    .line 864
    .line 865
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 866
    .line 867
    .line 868
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v0

    .line 876
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 877
    .line 878
    .line 879
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    throw v1

    .line 887
    :catchall_16
    move-exception v0

    .line 888
    goto :goto_23

    .line 889
    :goto_22
    throw v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_16

    .line 890
    :goto_23
    invoke-static/range {v32 .. v32}, Li5;->H(Ljava/io/Closeable;)V

    .line 891
    .line 892
    .line 893
    if-eqz v9, :cond_1c

    .line 894
    .line 895
    :try_start_1c
    invoke-virtual {v9}, Landroid/media/MediaCodec;->stop()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_17

    .line 896
    .line 897
    .line 898
    :catchall_17
    :try_start_1d
    invoke-virtual {v9}, Landroid/media/MediaCodec;->release()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_18

    .line 899
    .line 900
    .line 901
    :catchall_18
    :cond_1c
    :try_start_1e
    invoke-virtual {v4}, Landroid/media/MediaExtractor;->release()V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_19

    .line 902
    .line 903
    .line 904
    :catchall_19
    if-nez v7, :cond_1d

    .line 905
    .line 906
    invoke-static {v12}, Li5;->U(Ljava/io/File;)V

    .line 907
    .line 908
    .line 909
    :cond_1d
    throw v0

    .line 910
    :cond_1e
    invoke-static {v8}, Lu2;->c(Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    const/16 v16, 0x0

    .line 914
    .line 915
    return-object v16
.end method

.method public static S0(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public static S1(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static T(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_8

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    if-ne p0, v1, :cond_1

    .line 14
    .line 15
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-ne p0, v1, :cond_2

    .line 22
    .line 23
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_2
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    if-ne p0, v1, :cond_3

    .line 31
    .line 32
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_3
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    if-ne p0, v1, :cond_4

    .line 40
    .line 41
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_4
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 47
    .line 48
    if-ne p0, v1, :cond_5

    .line 49
    .line 50
    const-wide/16 v0, 0x0

    .line 51
    .line 52
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_5
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    if-ne p0, v1, :cond_6

    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_6
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    if-ne p0, v1, :cond_7

    .line 70
    .line 71
    const-wide/16 v0, 0x0

    .line 72
    .line 73
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :cond_7
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    if-ne p0, v1, :cond_8

    .line 81
    .line 82
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_8
    :goto_0
    return-object v0
.end method

.method public static T0(Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/ListView;Lz8;Lx8;)V
    .locals 9

    .line 1
    iget-object v0, p5, Lx8;->a:Ll8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ll8;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p5, Lx8;->a:Ll8;

    .line 10
    .line 11
    new-instance v1, Ll8;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v2, La9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ll8;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    if-eq v2, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v2}, Ll8;->a()V

    .line 29
    .line 30
    .line 31
    :cond_1
    iput-object v1, p5, Lx8;->a:Ll8;

    .line 32
    .line 33
    const-string v2, "\u6b63\u5728\u52a0\u8f7d\u97f3\u8272"

    .line 34
    .line 35
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Lu9;->E(Landroid/content/Context;)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 43
    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-virtual {p2, v2}, Landroid/view/View;->setClickable(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    .line 51
    .line 52
    new-instance v2, Landroid/os/Handler;

    .line 53
    .line 54
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {v2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, Lu8;

    .line 62
    .line 63
    move-object v8, p0

    .line 64
    move-object v4, p1

    .line 65
    move-object v6, p2

    .line 66
    move-object v7, p3

    .line 67
    move-object v5, p4

    .line 68
    move-object v3, p5

    .line 69
    invoke-direct/range {v0 .. v8}, Lu8;-><init>(Ll8;Landroid/os/Handler;Lx8;Landroid/app/Dialog;Lz8;Landroid/widget/TextView;Landroid/widget/ListView;Landroid/app/Activity;)V

    .line 70
    .line 71
    .line 72
    sget-object v2, La9;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 73
    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    :try_start_0
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :catch_0
    :cond_2
    invoke-static {v1}, La9;->a(Ll8;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ll8;->a()V

    .line 84
    .line 85
    .line 86
    const-string v0, "kk tts catalog task rejected"

    .line 87
    .line 88
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const-string v0, "\u97f3\u8272\u52a0\u8f7d\u5931\u8d25\uff0c\u70b9\u51fb\u91cd\u8bd5"

    .line 92
    .line 93
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0}, Lu9;->c(Landroid/content/Context;)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 101
    .line 102
    .line 103
    const/4 v0, 0x1

    .line 104
    invoke-virtual {p2, v0}, Landroid/view/View;->setClickable(Z)V

    .line 105
    .line 106
    .line 107
    new-instance v0, Lp8;

    .line 108
    .line 109
    const/4 v7, 0x0

    .line 110
    move-object v1, p0

    .line 111
    move-object v2, p1

    .line 112
    move-object v3, p2

    .line 113
    move-object v4, p3

    .line 114
    move-object v5, p4

    .line 115
    move-object v6, p5

    .line 116
    invoke-direct/range {v0 .. v7}, Lp8;-><init>(Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/ListView;Lz8;Lx8;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public static T1(I)[B
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/4 v2, 0x7

    .line 4
    if-ge v1, v2, :cond_1

    .line 5
    .line 6
    sget-object v2, Li5;->j:[I

    .line 7
    .line 8
    aget v2, v2, v1

    .line 9
    .line 10
    if-ne v2, p0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v1, -0x1

    .line 17
    :goto_1
    if-ltz v1, :cond_2

    .line 18
    .line 19
    const/16 p0, 0xa

    .line 20
    .line 21
    new-array p0, p0, [B

    .line 22
    .line 23
    int-to-byte v1, v1

    .line 24
    aput-byte v1, p0, v0

    .line 25
    .line 26
    const/16 v1, 0x9

    .line 27
    .line 28
    sget-object v2, Li5;->k:[B

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-static {v2, v0, p0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    const-string p0, "silk sample rate unsupported"

    .line 36
    .line 37
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public static U(Ljava/io/File;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method public static U0(Landroid/content/Context;Ljava/lang/Object;ILjava/lang/String;)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p2, :cond_9

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    :goto_0
    if-eqz v1, :cond_9

    .line 9
    .line 10
    const-class v2, Ljava/lang/Object;

    .line 11
    .line 12
    if-eq v1, v2, :cond_9

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_1

    .line 19
    :catchall_0
    move-object v3, v0

    .line 20
    :goto_1
    if-eqz v3, :cond_8

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    :goto_2
    array-length v5, v3

    .line 24
    if-ge v4, v5, :cond_8

    .line 25
    .line 26
    aget-object v5, v3, v4

    .line 27
    .line 28
    if-eqz v5, :cond_7

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-virtual {p3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-nez v6, :cond_0

    .line 39
    .line 40
    goto :goto_5

    .line 41
    :cond_0
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_1

    .line 50
    .line 51
    goto :goto_5

    .line 52
    :cond_1
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    if-eqz v6, :cond_7

    .line 57
    .line 58
    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    if-eq v6, v7, :cond_7

    .line 61
    .line 62
    invoke-virtual {v6}, Ljava/lang/Class;->isPrimitive()Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_2

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_2
    const-class v7, Landroid/graphics/drawable/Drawable;

    .line 70
    .line 71
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-nez v7, :cond_3

    .line 76
    .line 77
    if-eq v6, v2, :cond_3

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_3
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    array-length v6, v6

    .line 85
    const/4 v7, 0x6

    .line 86
    if-gt v6, v7, :cond_7

    .line 87
    .line 88
    :try_start_1
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-static {p0, v6, p2}, Li5;->i0(Landroid/content/Context;[Ljava/lang/Class;I)[Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    if-nez v6, :cond_5

    .line 97
    .line 98
    :catchall_1
    :cond_4
    :goto_3
    move-object v5, v0

    .line 99
    goto :goto_4

    .line 100
    :cond_5
    const/4 v7, 0x1

    .line 101
    invoke-virtual {v5, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    instance-of v6, v5, Landroid/graphics/drawable/Drawable;

    .line 109
    .line 110
    if-nez v6, :cond_6

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_6
    check-cast v5, Landroid/graphics/drawable/Drawable;

    .line 114
    .line 115
    invoke-static {v5, p2}, Li5;->c0(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/Bitmap;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    if-eqz v5, :cond_4

    .line 120
    .line 121
    invoke-static {v5}, Li5;->I0(Landroid/graphics/Bitmap;)Z

    .line 122
    .line 123
    .line 124
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 125
    if-nez v6, :cond_4

    .line 126
    .line 127
    :goto_4
    if-eqz v5, :cond_7

    .line 128
    .line 129
    return-object v5

    .line 130
    :cond_7
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    goto/16 :goto_0

    .line 138
    .line 139
    :cond_9
    return-object v0
.end method

.method public static U1(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 13
    .line 14
    .line 15
    if-eqz p4, :cond_0

    .line 16
    .line 17
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object v0
.end method

.method public static V(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;
    .locals 11

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
    const/4 v0, 0x3

    .line 7
    if-le p1, v0, :cond_1

    .line 8
    .line 9
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/16 p1, 0xf0

    .line 14
    .line 15
    invoke-static {p0, p1}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_1
    instance-of v0, p0, Ljava/lang/CharSequence;

    .line 21
    .line 22
    if-nez v0, :cond_15

    .line 23
    .line 24
    instance-of v0, p0, Ljava/lang/Number;

    .line 25
    .line 26
    if-nez v0, :cond_15

    .line 27
    .line 28
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 29
    .line 30
    if-nez v0, :cond_15

    .line 31
    .line 32
    instance-of v0, p0, Ljava/lang/Enum;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    goto/16 :goto_9

    .line 37
    .line 38
    :cond_2
    instance-of v0, p0, Landroid/view/View;

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-static {p0}, Li5;->R1(Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_3
    if-eqz p2, :cond_4

    .line 48
    .line 49
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    new-instance p1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string p2, "<seen "

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p0, ">"

    .line 74
    .line 75
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :cond_4
    instance-of v0, p0, Landroid/os/Bundle;

    .line 84
    .line 85
    const/16 v1, 0x7d

    .line 86
    .line 87
    const/16 v2, 0x3d

    .line 88
    .line 89
    const/16 v3, 0x384

    .line 90
    .line 91
    const/16 v4, 0x14

    .line 92
    .line 93
    const-string v5, ", "

    .line 94
    .line 95
    const/4 v6, 0x0

    .line 96
    if-eqz v0, :cond_8

    .line 97
    .line 98
    check-cast p0, Landroid/os/Bundle;

    .line 99
    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v7, "Bundle{"

    .line 103
    .line 104
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :try_start_0
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-nez v8, :cond_5

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    check-cast v8, Ljava/lang/String;

    .line 127
    .line 128
    add-int/lit8 v9, v6, 0x1

    .line 129
    .line 130
    if-lez v6, :cond_6

    .line 131
    .line 132
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :catchall_0
    move-exception p0

    .line 137
    goto :goto_2

    .line 138
    :cond_6
    :goto_1
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v8}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    add-int/lit8 v8, p1, 0x1

    .line 149
    .line 150
    invoke-static {v6, v8, p2}, Li5;->V(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    .line 156
    .line 157
    if-lt v9, v4, :cond_7

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    move v6, v9

    .line 161
    goto :goto_0

    .line 162
    :goto_2
    const-string p1, "error="

    .line 163
    .line 164
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-static {p0, v3}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    return-object p0

    .line 182
    :cond_8
    instance-of v0, p0, Ljava/util/Map;

    .line 183
    .line 184
    const-string v7, ", ..."

    .line 185
    .line 186
    if-eqz v0, :cond_c

    .line 187
    .line 188
    new-instance v0, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    const-string v8, "Map{"

    .line 191
    .line 192
    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    check-cast p0, Ljava/util/Map;

    .line 196
    .line 197
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    if-nez p0, :cond_9

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_9
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    check-cast p0, Ljava/util/Map$Entry;

    .line 217
    .line 218
    add-int/lit8 v9, v6, 0x1

    .line 219
    .line 220
    if-lez v6, :cond_a

    .line 221
    .line 222
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    :cond_a
    add-int/lit8 v6, p1, 0x1

    .line 226
    .line 227
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    invoke-static {v10, v6, p2}, Li5;->V(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v10

    .line 235
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    invoke-static {p0, v6, p2}, Li5;->V(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    if-lt v9, v4, :cond_b

    .line 253
    .line 254
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    :goto_5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    invoke-static {p0, v3}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    return-object p0

    .line 269
    :cond_b
    move v6, v9

    .line 270
    goto :goto_4

    .line 271
    :cond_c
    instance-of v0, p0, Ljava/lang/Iterable;

    .line 272
    .line 273
    const/16 v1, 0x5d

    .line 274
    .line 275
    if-nez v0, :cond_11

    .line 276
    .line 277
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    if-nez v2, :cond_d

    .line 286
    .line 287
    new-instance p1, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p2

    .line 296
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    const-string p2, "{"

    .line 300
    .line 301
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    const-string p0, "}"

    .line 312
    .line 313
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    const/16 p1, 0x2bc

    .line 321
    .line 322
    invoke-static {p0, p1}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    return-object p0

    .line 327
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    const-string v2, "Array["

    .line 330
    .line 331
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    :goto_6
    if-ge v6, v2, :cond_f

    .line 343
    .line 344
    if-lez v6, :cond_e

    .line 345
    .line 346
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    :cond_e
    invoke-static {p0, v6}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    add-int/lit8 v8, p1, 0x1

    .line 354
    .line 355
    invoke-static {v4, v8, p2}, Li5;->V(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    add-int/lit8 v6, v6, 0x1

    .line 363
    .line 364
    goto :goto_6

    .line 365
    :cond_f
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 366
    .line 367
    .line 368
    move-result p0

    .line 369
    if-le p0, v2, :cond_10

    .line 370
    .line 371
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    :cond_10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    invoke-static {p0, v3}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    return-object p0

    .line 386
    :cond_11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 387
    .line 388
    const-string v2, "Iterable["

    .line 389
    .line 390
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    check-cast p0, Ljava/lang/Iterable;

    .line 394
    .line 395
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 400
    .line 401
    .line 402
    move-result p0

    .line 403
    if-nez p0, :cond_12

    .line 404
    .line 405
    goto :goto_8

    .line 406
    :cond_12
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object p0

    .line 410
    add-int/lit8 v8, v6, 0x1

    .line 411
    .line 412
    if-lez v6, :cond_13

    .line 413
    .line 414
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    :cond_13
    add-int/lit8 v6, p1, 0x1

    .line 418
    .line 419
    invoke-static {p0, v6, p2}, Li5;->V(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object p0

    .line 423
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    if-lt v8, v4, :cond_14

    .line 427
    .line 428
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    :goto_8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object p0

    .line 438
    invoke-static {p0, v3}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    return-object p0

    .line 443
    :cond_14
    move v6, v8

    .line 444
    goto :goto_7

    .line 445
    :cond_15
    :goto_9
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object p0

    .line 449
    const/16 p1, 0x1f4

    .line 450
    .line 451
    invoke-static {p0, p1}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object p0

    .line 455
    return-object p0
.end method

.method public static V0(Ll8;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    sget-object v0, Li5;->g:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    sget-wide v3, Li5;->h:J

    .line 10
    .line 11
    sub-long/2addr v1, v3

    .line 12
    const-wide/32 v3, 0x927c0

    .line 13
    .line 14
    .line 15
    cmp-long v1, v1, v3

    .line 16
    .line 17
    if-gez v1, :cond_0

    .line 18
    .line 19
    new-instance p0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    :try_start_0
    invoke-static {p0}, Li5;->k0(Ll8;)Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    sput-object v1, Li5;->g:Ljava/util/List;

    .line 39
    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    sput-wide v1, Li5;->h:J

    .line 45
    .line 46
    new-instance v1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    :catch_0
    move-exception p0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_1

    .line 60
    .line 61
    new-instance p0, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v1, "kk tts catalog stale fallback count="

    .line 64
    .line 65
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    new-instance p0, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 85
    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_1
    throw p0
.end method

.method public static final V1(Ljava/util/Collection;)[Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    :goto_0
    sget-object p0, Li5;->e:[Ljava/lang/Object;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    new-array v0, v0, [Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_1
    add-int/lit8 v2, v1, 0x1

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    aput-object v3, v0, v1

    .line 31
    .line 32
    array-length v1, v0

    .line 33
    if-lt v2, v1, :cond_6

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    mul-int/lit8 v1, v2, 0x3

    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    ushr-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    if-gt v1, v2, :cond_4

    .line 49
    .line 50
    const v1, 0x7ffffffd

    .line 51
    .line 52
    .line 53
    if-ge v2, v1, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    new-instance p0, Ljava/lang/OutOfMemoryError;

    .line 57
    .line 58
    invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V

    .line 59
    .line 60
    .line 61
    throw p0

    .line 62
    :cond_4
    :goto_2
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :cond_5
    move v1, v2

    .line 67
    goto :goto_1

    .line 68
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_5

    .line 73
    .line 74
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public static W(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    move-object p0, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    const-string v1, "\u7528\u6237\u4e0a\u4f20"

    .line 12
    .line 13
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_3

    .line 18
    .line 19
    const-string v1, "User upload"

    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/16 v1, 0x1e

    .line 33
    .line 34
    if-gt v0, v1, :cond_2

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_3
    :goto_1
    return-object v0
.end method

.method public static W0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "group admin: group="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, ", sender="

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p0, ", event="

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p0, ", detail="

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static final W1(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    array-length p0, p1

    .line 10
    if-lez p0, :cond_1

    .line 11
    .line 12
    aput-object v1, p1, v2

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    array-length p0, p1

    .line 26
    if-lez p0, :cond_1

    .line 27
    .line 28
    aput-object v1, p1, v2

    .line 29
    .line 30
    :cond_1
    return-object p1

    .line 31
    :cond_2
    array-length v3, p1

    .line 32
    if-gt v0, v3, :cond_3

    .line 33
    .line 34
    move-object v0, p1

    .line 35
    goto :goto_0

    .line 36
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v3, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    check-cast v0, [Ljava/lang/Object;

    .line 52
    .line 53
    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 54
    .line 55
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    aput-object v4, v0, v2

    .line 60
    .line 61
    array-length v2, v0

    .line 62
    if-lt v3, v2, :cond_8

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_4

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_4
    mul-int/lit8 v2, v3, 0x3

    .line 72
    .line 73
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    ushr-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    if-gt v2, v3, :cond_6

    .line 78
    .line 79
    const v2, 0x7ffffffd

    .line 80
    .line 81
    .line 82
    if-ge v3, v2, :cond_5

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    new-instance p0, Ljava/lang/OutOfMemoryError;

    .line 86
    .line 87
    invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V

    .line 88
    .line 89
    .line 90
    throw p0

    .line 91
    :cond_6
    :goto_1
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :cond_7
    move v2, v3

    .line 96
    goto :goto_0

    .line 97
    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-nez v2, :cond_7

    .line 102
    .line 103
    if-ne v0, p1, :cond_9

    .line 104
    .line 105
    aput-object v1, p1, v3

    .line 106
    .line 107
    return-object p1

    .line 108
    :cond_9
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0
.end method

.method public static X(Landroid/content/Context;Ll1;)Ljava/io/File;
    .locals 9

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v1, "elaris_cloud_stickers"

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

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
    const-string p0, "cache_unavailable"

    .line 27
    .line 28
    invoke-static {p0}, Lu2;->b(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_1
    :goto_0
    iget-object p0, p1, Ll1;->c:Ljava/lang/String;

    .line 33
    .line 34
    const-string v2, "image/jpeg"

    .line 35
    .line 36
    invoke-virtual {v2, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    const-string p0, "jpg"

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const-string v2, "image/gif"

    .line 46
    .line 47
    invoke-virtual {v2, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    const-string p0, "gif"

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    const-string v2, "image/webp"

    .line 57
    .line 58
    invoke-virtual {v2, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_4

    .line 63
    .line 64
    const-string p0, "webp"

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    const-string p0, "png"

    .line 68
    .line 69
    :goto_1
    new-instance v2, Ljava/io/File;

    .line 70
    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    iget-object v4, p1, Ll1;->a:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v4, "."

    .line 82
    .line 83
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-direct {v2, v0, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    const-wide/16 v3, 0x0

    .line 101
    .line 102
    if-eqz p0, :cond_5

    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 105
    .line 106
    .line 107
    move-result-wide v5

    .line 108
    cmp-long p0, v5, v3

    .line 109
    .line 110
    if-lez p0, :cond_5

    .line 111
    .line 112
    return-object v2

    .line 113
    :cond_5
    const-string p0, "GET"

    .line 114
    .line 115
    iget-object p1, p1, Ll1;->d:Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {p0, p1}, Li5;->k1(Ljava/lang/String;Ljava/lang/String;)Ljava/net/HttpURLConnection;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    const/16 v0, 0xc8

    .line 126
    .line 127
    if-lt p1, v0, :cond_8

    .line 128
    .line 129
    const/16 v0, 0x12c

    .line 130
    .line 131
    if-ge p1, v0, :cond_8

    .line 132
    .line 133
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 134
    .line 135
    .line 136
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 137
    :try_start_1
    new-instance v0, Ljava/io/FileOutputStream;

    .line 138
    .line 139
    invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 140
    .line 141
    .line 142
    const/16 v1, 0x4000

    .line 143
    .line 144
    :try_start_2
    new-array v1, v1, [B

    .line 145
    .line 146
    :goto_2
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-ltz v5, :cond_7

    .line 151
    .line 152
    int-to-long v6, v5

    .line 153
    add-long/2addr v3, v6

    .line 154
    const-wide/32 v6, 0x500000

    .line 155
    .line 156
    .line 157
    cmp-long v6, v3, v6

    .line 158
    .line 159
    if-gtz v6, :cond_6

    .line 160
    .line 161
    const/4 v6, 0x0

    .line 162
    invoke-virtual {v0, v1, v6, v5}, Ljava/io/FileOutputStream;->write([BII)V

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :catchall_0
    move-exception v1

    .line 167
    goto :goto_3

    .line 168
    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 169
    .line 170
    const-string v3, "download_too_large"

    .line 171
    .line 172
    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v1

    .line 176
    :cond_7
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 177
    .line 178
    .line 179
    invoke-static {p1}, Li5;->E(Ljava/io/Closeable;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v0}, Li5;->E(Ljava/io/Closeable;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 186
    .line 187
    .line 188
    return-object v2

    .line 189
    :catchall_1
    move-exception v0

    .line 190
    move-object v8, v1

    .line 191
    move-object v1, v0

    .line 192
    move-object v0, v8

    .line 193
    goto :goto_3

    .line 194
    :catchall_2
    move-exception p1

    .line 195
    move-object v0, v1

    .line 196
    move-object v1, p1

    .line 197
    move-object p1, v0

    .line 198
    :goto_3
    :try_start_3
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 199
    .line 200
    .line 201
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 202
    :catchall_3
    move-exception v1

    .line 203
    invoke-static {p1}, Li5;->E(Ljava/io/Closeable;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v0}, Li5;->E(Ljava/io/Closeable;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 210
    .line 211
    .line 212
    throw v1

    .line 213
    :cond_8
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 214
    .line 215
    .line 216
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 217
    .line 218
    new-instance v0, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    const-string v1, "download_http_"

    .line 221
    .line 222
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw p0
.end method

.method public static X0(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, Li5;->a:J

    .line 6
    .line 7
    sub-long v2, v0, v2

    .line 8
    .line 9
    const-wide/16 v4, 0x1388

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    if-gez v2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sput-wide v0, Li5;->a:J

    .line 17
    .line 18
    const-string v0, "friend-list empty reason="

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static X1(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

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
    const/4 v0, 0x0

    .line 11
    :try_start_0
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method public static Y(Ll1;)[B
    .locals 3

    .line 1
    const-string v0, "GET"

    .line 2
    .line 3
    iget-object p0, p0, Ll1;->d:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, p0}, Li5;->k1(Ljava/lang/String;Ljava/lang/String;)Ljava/net/HttpURLConnection;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0xc8

    .line 14
    .line 15
    if-lt v0, v1, :cond_0

    .line 16
    .line 17
    const/16 v1, 0x12c

    .line 18
    .line 19
    if-ge v0, v1, :cond_0

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-wide/32 v1, 0x500000

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1, v2}, Li5;->v1(Ljava/io/InputStream;J)[B

    .line 29
    .line 30
    .line 31
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 42
    .line 43
    .line 44
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v2, "preview_http_"

    .line 49
    .line 50
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0
.end method

.method public static Y0(Ljava/lang/String;IIILjava/io/File;)V
    .locals 6

    .line 1
    invoke-virtual {p4}, Ljava/io/File;->length()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    if-gtz p3, :cond_0

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-wide/16 v2, 0x8

    .line 11
    .line 12
    mul-long/2addr v2, v0

    .line 13
    const/4 p4, 0x1

    .line 14
    invoke-static {p4, p3}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result p4

    .line 18
    int-to-long v4, p4

    .line 19
    div-long/2addr v2, v4

    .line 20
    :goto_0
    new-instance p4, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v4, "local voice audio transcode codec="

    .line 23
    .line 24
    invoke-direct {p4, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Li5;->E1(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, " sample_rate="

    .line 35
    .line 36
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p0, " target_bps="

    .line 43
    .line 44
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p0, " actual_bps="

    .line 51
    .line 52
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p0, " seconds="

    .line 59
    .line 60
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string p0, " bytes="

    .line 67
    .line 68
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public static Y1(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/Object;ZLt4;)Ljava/lang/CharSequence;
    .locals 11

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    if-nez p4, :cond_16

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 p4, 0x2

    .line 12
    invoke-static {p0, p4}, Li5;->b0(Landroid/content/Context;I)I

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz p0, :cond_14

    .line 18
    .line 19
    if-nez p3, :cond_1

    .line 20
    .line 21
    goto/16 :goto_9

    .line 22
    .line 23
    :cond_1
    const/16 p3, 0x22

    .line 24
    .line 25
    invoke-static {p0, p3}, Li5;->b0(Landroid/content/Context;I)I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    const-string v2, "getZoomDrawable"

    .line 30
    .line 31
    invoke-static {p0, p2, p3, v2}, Li5;->U0(Landroid/content/Context;Ljava/lang/Object;ILjava/lang/String;)Landroid/graphics/Bitmap;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const-string v2, "getDrawable"

    .line 39
    .line 40
    invoke-static {p0, p2, p3, v2}, Li5;->U0(Landroid/content/Context;Ljava/lang/Object;ILjava/lang/String;)Landroid/graphics/Bitmap;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    :goto_0
    if-eqz v2, :cond_3

    .line 45
    .line 46
    goto/16 :goto_8

    .line 47
    .line 48
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v2, "path"

    .line 54
    .line 55
    invoke-static {p2, v2}, Li5;->l0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-nez v2, :cond_4

    .line 60
    .line 61
    move-object v2, v1

    .line 62
    goto :goto_1

    .line 63
    :cond_4
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    :goto_1
    const-string v3, "resID"

    .line 68
    .line 69
    invoke-static {p2, v3}, Li5;->l0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    if-nez v3, :cond_5

    .line 74
    .line 75
    move-object v3, v1

    .line 76
    goto :goto_2

    .line 77
    :cond_5
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    :goto_2
    invoke-static {v2, p0}, Li5;->i(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v3, p0}, Li5;->i(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 85
    .line 86
    .line 87
    if-eqz v2, :cond_11

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-lez v4, :cond_11

    .line 94
    .line 95
    new-instance v4, Ljava/io/File;

    .line 96
    .line 97
    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    if-nez v3, :cond_7

    .line 105
    .line 106
    :cond_6
    move-object v7, v1

    .line 107
    goto :goto_6

    .line 108
    :cond_7
    const-string v5, "_"

    .line 109
    .line 110
    invoke-virtual {v3, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    move v6, v0

    .line 115
    :goto_3
    array-length v7, v5

    .line 116
    if-ge v6, v7, :cond_6

    .line 117
    .line 118
    aget-object v7, v5, v6

    .line 119
    .line 120
    if-eqz v7, :cond_c

    .line 121
    .line 122
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    const/16 v9, 0x10

    .line 127
    .line 128
    if-lt v8, v9, :cond_c

    .line 129
    .line 130
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    if-nez v8, :cond_8

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_8
    move v8, v0

    .line 138
    :goto_4
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    if-ge v8, v9, :cond_d

    .line 143
    .line 144
    invoke-virtual {v7, v8}, Ljava/lang/String;->charAt(I)C

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    const/16 v10, 0x30

    .line 149
    .line 150
    if-lt v9, v10, :cond_9

    .line 151
    .line 152
    const/16 v10, 0x39

    .line 153
    .line 154
    if-le v9, v10, :cond_b

    .line 155
    .line 156
    :cond_9
    const/16 v10, 0x61

    .line 157
    .line 158
    if-lt v9, v10, :cond_a

    .line 159
    .line 160
    const/16 v10, 0x66

    .line 161
    .line 162
    if-le v9, v10, :cond_b

    .line 163
    .line 164
    :cond_a
    const/16 v10, 0x41

    .line 165
    .line 166
    if-lt v9, v10, :cond_c

    .line 167
    .line 168
    const/16 v10, 0x46

    .line 169
    .line 170
    if-gt v9, v10, :cond_c

    .line 171
    .line 172
    :cond_b
    add-int/lit8 v8, v8, 0x1

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_c
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_d
    :goto_6
    const/16 v5, 0x5f

    .line 179
    .line 180
    if-eqz v3, :cond_f

    .line 181
    .line 182
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    if-lez v6, :cond_f

    .line 187
    .line 188
    new-instance v6, Ljava/io/File;

    .line 189
    .line 190
    invoke-direct {v6, v4, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    invoke-static {v6, p0}, Li5;->i(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    if-ltz v6, :cond_e

    .line 205
    .line 206
    add-int/lit8 v8, v6, 0x1

    .line 207
    .line 208
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 209
    .line 210
    .line 211
    move-result v9

    .line 212
    if-ge v8, v9, :cond_e

    .line 213
    .line 214
    new-instance v8, Ljava/io/File;

    .line 215
    .line 216
    new-instance v9, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    invoke-direct {v8, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    invoke-static {v6, p0}, Li5;->i(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 247
    .line 248
    .line 249
    :cond_e
    invoke-static {v4, v7, p0}, Li5;->e(Ljava/io/File;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 250
    .line 251
    .line 252
    invoke-static {v4, v7, p0}, Li5;->h(Ljava/io/File;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 253
    .line 254
    .line 255
    :cond_f
    if-eqz v2, :cond_11

    .line 256
    .line 257
    if-eqz v3, :cond_11

    .line 258
    .line 259
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    if-lez v6, :cond_11

    .line 264
    .line 265
    new-instance v6, Ljava/io/File;

    .line 266
    .line 267
    invoke-direct {v6, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    invoke-static {v6, p0}, Li5;->i(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    if-ltz v5, :cond_10

    .line 282
    .line 283
    add-int/lit8 v6, v5, 0x1

    .line 284
    .line 285
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 286
    .line 287
    .line 288
    move-result v8

    .line 289
    if-ge v6, v8, :cond_10

    .line 290
    .line 291
    new-instance v6, Ljava/io/File;

    .line 292
    .line 293
    new-instance v8, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    invoke-direct {v6, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    invoke-static {v3, p0}, Li5;->i(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 324
    .line 325
    .line 326
    :cond_10
    invoke-static {v2, v7, p0}, Li5;->e(Ljava/io/File;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 327
    .line 328
    .line 329
    invoke-static {v2, v7, p0}, Li5;->h(Ljava/io/File;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 330
    .line 331
    .line 332
    :cond_11
    move v2, v0

    .line 333
    :goto_7
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    if-ge v2, v3, :cond_13

    .line 338
    .line 339
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    check-cast v3, Ljava/lang/String;

    .line 344
    .line 345
    invoke-static {v3, p3}, Li5;->R(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    if-eqz v3, :cond_12

    .line 350
    .line 351
    move-object v2, v3

    .line 352
    goto :goto_8

    .line 353
    :cond_12
    add-int/lit8 v2, v2, 0x1

    .line 354
    .line 355
    goto :goto_7

    .line 356
    :cond_13
    const-string v2, "favorite"

    .line 357
    .line 358
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 359
    .line 360
    .line 361
    move-result p0

    .line 362
    invoke-static {p2, v2, p0}, Li5;->a1(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 363
    .line 364
    .line 365
    move-object v2, v1

    .line 366
    :goto_8
    if-nez v2, :cond_15

    .line 367
    .line 368
    :cond_14
    :goto_9
    move-object p4, v1

    .line 369
    goto :goto_a

    .line 370
    :cond_15
    new-instance p0, Lt4;

    .line 371
    .line 372
    invoke-direct {p0, v2, p4, p3}, Lt4;-><init>(Landroid/graphics/Bitmap;II)V

    .line 373
    .line 374
    .line 375
    move-object p4, p0

    .line 376
    :cond_16
    :goto_a
    if-nez p4, :cond_17

    .line 377
    .line 378
    const-string p0, "token"

    .line 379
    .line 380
    const/4 p3, -0x2

    .line 381
    invoke-static {p2, p0, p3}, Li5;->a1(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 382
    .line 383
    .line 384
    return-object p1

    .line 385
    :cond_17
    new-instance p0, Landroid/text/SpannableStringBuilder;

    .line 386
    .line 387
    invoke-direct {p0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 391
    .line 392
    .line 393
    move-result p1

    .line 394
    const/16 p2, 0x21

    .line 395
    .line 396
    invoke-virtual {p0, p4, v0, p1, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 397
    .line 398
    .line 399
    return-object p0
.end method

.method public static Z(Landroid/content/Context;Ljava/lang/String;Ll8;)Ljava/io/File;
    .locals 7

    .line 1
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    move v1, p1

    .line 8
    :goto_0
    const/4 v2, 0x0

    .line 9
    const-string v3, "script silk redirect rejected"

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    if-gt v1, v4, :cond_b

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    invoke-static {v5}, Li5;->B0(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_a

    .line 23
    .line 24
    :try_start_0
    invoke-static {v0, p2}, Li5;->l1(Ljava/net/URL;Ll8;)Ljava/net/HttpURLConnection;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2, p1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 29
    .line 30
    .line 31
    const-string v5, "Accept"

    .line 32
    .line 33
    const-string v6, "audio/*,application/octet-stream"

    .line 34
    .line 35
    invoke-virtual {v2, v5, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 39
    .line 40
    .line 41
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    const/16 v6, 0x12d

    .line 43
    .line 44
    if-eq v5, v6, :cond_8

    .line 45
    .line 46
    const/16 v6, 0x12e

    .line 47
    .line 48
    if-eq v5, v6, :cond_8

    .line 49
    .line 50
    const/16 v6, 0x12f

    .line 51
    .line 52
    if-eq v5, v6, :cond_8

    .line 53
    .line 54
    const/16 v6, 0x133

    .line 55
    .line 56
    if-eq v5, v6, :cond_8

    .line 57
    .line 58
    const/16 v6, 0x134

    .line 59
    .line 60
    if-ne v5, v6, :cond_0

    .line 61
    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :cond_0
    const/16 v0, 0xc8

    .line 65
    .line 66
    if-eq v5, v0, :cond_4

    .line 67
    .line 68
    const/16 p0, 0x1ad

    .line 69
    .line 70
    if-eq v5, p0, :cond_1

    .line 71
    .line 72
    const/16 p0, 0x1f4

    .line 73
    .line 74
    if-lt v5, p0, :cond_2

    .line 75
    .line 76
    const/16 p0, 0x257

    .line 77
    .line 78
    if-gt v5, p0, :cond_2

    .line 79
    .line 80
    :cond_1
    const/4 p1, 0x1

    .line 81
    :cond_2
    const-string p0, "script silk download http "

    .line 82
    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    :try_start_1
    new-instance p1, Ln8;

    .line 86
    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1

    .line 106
    :catchall_0
    move-exception p0

    .line 107
    goto/16 :goto_3

    .line 108
    .line 109
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 110
    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    :cond_4
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentLengthLong()J

    .line 131
    .line 132
    .line 133
    move-result-wide v0

    .line 134
    const-wide/32 v3, 0xc00000

    .line 135
    .line 136
    .line 137
    cmp-long p1, v0, v3

    .line 138
    .line 139
    if-gtz p1, :cond_7

    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-eqz p1, :cond_6

    .line 146
    .line 147
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 148
    .line 149
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    const-string v0, "text/"

    .line 154
    .line 155
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-nez v0, :cond_5

    .line 160
    .line 161
    const-string v0, "json"

    .line 162
    .line 163
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-nez p1, :cond_5

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_5
    new-instance p0, Ljava/io/IOException;

    .line 171
    .line 172
    const-string p1, "script silk content invalid"

    .line 173
    .line 174
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw p0

    .line 178
    :cond_6
    :goto_1
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-static {p0, p1, p2}, Li5;->h2(Landroid/content/Context;Ljava/io/InputStream;Ll8;)Ljava/io/File;

    .line 183
    .line 184
    .line 185
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    invoke-static {v2, p2}, Li5;->F(Ljava/net/HttpURLConnection;Ll8;)V

    .line 187
    .line 188
    .line 189
    return-object p0

    .line 190
    :cond_7
    :try_start_2
    new-instance p0, Ljava/io/IOException;

    .line 191
    .line 192
    const-string p1, "script silk file too large"

    .line 193
    .line 194
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p0

    .line 198
    :cond_8
    :goto_2
    const-string v5, "Location"

    .line 199
    .line 200
    invoke-virtual {v2, v5}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    if-eqz v5, :cond_9

    .line 205
    .line 206
    if-ge v1, v4, :cond_9

    .line 207
    .line 208
    new-instance v3, Ljava/net/URL;

    .line 209
    .line 210
    invoke-direct {v3, v0, v5}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 211
    .line 212
    .line 213
    invoke-static {v2, p2}, Li5;->F(Ljava/net/HttpURLConnection;Ll8;)V

    .line 214
    .line 215
    .line 216
    add-int/lit8 v1, v1, 0x1

    .line 217
    .line 218
    move-object v0, v3

    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_9
    :try_start_3
    new-instance p0, Ljava/io/IOException;

    .line 222
    .line 223
    invoke-direct {p0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 227
    :goto_3
    invoke-static {v2, p2}, Li5;->F(Ljava/net/HttpURLConnection;Ll8;)V

    .line 228
    .line 229
    .line 230
    throw p0

    .line 231
    :cond_a
    const-string p0, "script silk url rejected"

    .line 232
    .line 233
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    return-object v2

    .line 237
    :cond_b
    invoke-static {v3}, Lu2;->c(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    return-object v2
.end method

.method public static Z0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "group admin error: group="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, ", event="

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p0, ", "

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string p0, "group-admin"

    .line 35
    .line 36
    invoke-static {p0, p1, p2}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static Z1(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "%20"

    .line 4
    .line 5
    const-string v2, "+"

    .line 6
    .line 7
    const-string v3, "UTF-8"

    .line 8
    .line 9
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v4, v0}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v4, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-wide/32 v6, 0x500000

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v6, v7}, Li5;->v1(Ljava/io/InputStream;J)[B

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/16 v4, 0xff

    .line 29
    .line 30
    const/4 v8, 0x2

    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v10, 0x1

    .line 33
    const-string v11, ""

    .line 34
    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    invoke-static {v5}, Li5;->N0(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v12

    .line 41
    if-nez v12, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    move-wide/from16 v16, v6

    .line 45
    .line 46
    goto/16 :goto_2

    .line 47
    .line 48
    :cond_1
    :goto_1
    if-nez v0, :cond_3

    .line 49
    .line 50
    move-wide/from16 v16, v6

    .line 51
    .line 52
    :cond_2
    move-object v5, v11

    .line 53
    goto/16 :goto_2

    .line 54
    .line 55
    :cond_3
    array-length v5, v0

    .line 56
    const/4 v12, 0x3

    .line 57
    if-lt v5, v12, :cond_4

    .line 58
    .line 59
    aget-byte v5, v0, v9

    .line 60
    .line 61
    and-int/2addr v5, v4

    .line 62
    if-ne v5, v4, :cond_4

    .line 63
    .line 64
    aget-byte v5, v0, v10

    .line 65
    .line 66
    and-int/2addr v5, v4

    .line 67
    const/16 v13, 0xd8

    .line 68
    .line 69
    if-ne v5, v13, :cond_4

    .line 70
    .line 71
    aget-byte v5, v0, v8

    .line 72
    .line 73
    and-int/2addr v5, v4

    .line 74
    if-ne v5, v4, :cond_4

    .line 75
    .line 76
    const-string v5, "image/jpeg"

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    array-length v5, v0

    .line 80
    const/16 v13, 0x50

    .line 81
    .line 82
    const/16 v14, 0x8

    .line 83
    .line 84
    if-lt v5, v14, :cond_5

    .line 85
    .line 86
    aget-byte v5, v0, v9

    .line 87
    .line 88
    and-int/2addr v5, v4

    .line 89
    const/16 v15, 0x89

    .line 90
    .line 91
    if-ne v5, v15, :cond_5

    .line 92
    .line 93
    aget-byte v5, v0, v10

    .line 94
    .line 95
    if-ne v5, v13, :cond_5

    .line 96
    .line 97
    aget-byte v5, v0, v8

    .line 98
    .line 99
    const/16 v15, 0x4e

    .line 100
    .line 101
    if-ne v5, v15, :cond_5

    .line 102
    .line 103
    aget-byte v5, v0, v12

    .line 104
    .line 105
    const/16 v15, 0x47

    .line 106
    .line 107
    if-ne v5, v15, :cond_5

    .line 108
    .line 109
    const-string v5, "image/png"

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    array-length v5, v0

    .line 113
    const/4 v15, 0x6

    .line 114
    if-lt v5, v15, :cond_7

    .line 115
    .line 116
    new-instance v5, Ljava/lang/String;

    .line 117
    .line 118
    move-wide/from16 v16, v6

    .line 119
    .line 120
    sget-object v6, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 121
    .line 122
    invoke-direct {v5, v0, v9, v15, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 123
    .line 124
    .line 125
    const-string v6, "GIF87a"

    .line 126
    .line 127
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-nez v6, :cond_6

    .line 132
    .line 133
    const-string v6, "GIF89a"

    .line 134
    .line 135
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_8

    .line 140
    .line 141
    :cond_6
    const-string v5, "image/gif"

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_7
    move-wide/from16 v16, v6

    .line 145
    .line 146
    :cond_8
    array-length v5, v0

    .line 147
    const/16 v6, 0xc

    .line 148
    .line 149
    if-lt v5, v6, :cond_2

    .line 150
    .line 151
    aget-byte v5, v0, v9

    .line 152
    .line 153
    const/16 v6, 0x52

    .line 154
    .line 155
    if-ne v5, v6, :cond_2

    .line 156
    .line 157
    aget-byte v5, v0, v10

    .line 158
    .line 159
    const/16 v6, 0x49

    .line 160
    .line 161
    if-ne v5, v6, :cond_2

    .line 162
    .line 163
    aget-byte v5, v0, v8

    .line 164
    .line 165
    const/16 v6, 0x46

    .line 166
    .line 167
    if-ne v5, v6, :cond_2

    .line 168
    .line 169
    aget-byte v5, v0, v12

    .line 170
    .line 171
    if-ne v5, v6, :cond_2

    .line 172
    .line 173
    aget-byte v5, v0, v14

    .line 174
    .line 175
    const/16 v6, 0x57

    .line 176
    .line 177
    if-ne v5, v6, :cond_2

    .line 178
    .line 179
    const/16 v5, 0x9

    .line 180
    .line 181
    aget-byte v5, v0, v5

    .line 182
    .line 183
    const/16 v6, 0x45

    .line 184
    .line 185
    if-ne v5, v6, :cond_2

    .line 186
    .line 187
    const/16 v5, 0xa

    .line 188
    .line 189
    aget-byte v5, v0, v5

    .line 190
    .line 191
    const/16 v6, 0x42

    .line 192
    .line 193
    if-ne v5, v6, :cond_2

    .line 194
    .line 195
    const/16 v5, 0xb

    .line 196
    .line 197
    aget-byte v5, v0, v5

    .line 198
    .line 199
    if-ne v5, v13, :cond_2

    .line 200
    .line 201
    const-string v5, "image/webp"

    .line 202
    .line 203
    :goto_2
    array-length v6, v0

    .line 204
    int-to-long v6, v6

    .line 205
    invoke-static {v5}, Li5;->N0(Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v12

    .line 209
    if-nez v12, :cond_9

    .line 210
    .line 211
    const-string v6, "\u4ec5\u652f\u6301 JPG\u3001PNG\u3001GIF \u548c WebP \u8868\u60c5"

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_9
    const-wide/16 v12, 0x0

    .line 215
    .line 216
    cmp-long v12, v6, v12

    .line 217
    .line 218
    if-gtz v12, :cond_a

    .line 219
    .line 220
    const-string v6, "\u65e0\u6cd5\u8bfb\u53d6\u6240\u9009\u8868\u60c5"

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_a
    cmp-long v6, v6, v16

    .line 224
    .line 225
    if-lez v6, :cond_b

    .line 226
    .line 227
    const-string v6, "\u8868\u60c5\u4e0d\u80fd\u8d85\u8fc7 5 MB"

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_b
    move-object v6, v11

    .line 231
    :goto_3
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    if-gtz v7, :cond_12

    .line 236
    .line 237
    invoke-static/range {p2 .. p2}, Li5;->W(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    invoke-static/range {p3 .. p3}, Li5;->G1(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    const-string v12, "SHA-256"

    .line 246
    .line 247
    invoke-static {v12}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 248
    .line 249
    .line 250
    move-result-object v12

    .line 251
    invoke-virtual {v12, v0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 252
    .line 253
    .line 254
    move-result-object v12

    .line 255
    new-instance v13, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    array-length v14, v12

    .line 258
    mul-int/2addr v14, v8

    .line 259
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 260
    .line 261
    .line 262
    move v8, v9

    .line 263
    :goto_4
    array-length v14, v12

    .line 264
    if-ge v8, v14, :cond_c

    .line 265
    .line 266
    sget-object v14, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 267
    .line 268
    aget-byte v15, v12, v8

    .line 269
    .line 270
    and-int/2addr v15, v4

    .line 271
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 272
    .line 273
    .line 274
    move-result-object v15

    .line 275
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v15

    .line 279
    const-string v4, "%02x"

    .line 280
    .line 281
    invoke-static {v14, v4, v15}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    add-int/lit8 v8, v8, 0x1

    .line 289
    .line 290
    const/16 v4, 0xff

    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_c
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    const-string v8, "http_"

    .line 298
    .line 299
    const-string v12, "POST"

    .line 300
    .line 301
    const-string v13, "https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/stickers/upload"

    .line 302
    .line 303
    invoke-static {v12, v13}, Li5;->k1(Ljava/lang/String;Ljava/lang/String;)Ljava/net/HttpURLConnection;

    .line 304
    .line 305
    .line 306
    move-result-object v12

    .line 307
    :try_start_0
    invoke-virtual {v12, v10}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 308
    .line 309
    .line 310
    const-string v13, "Content-Type"

    .line 311
    .line 312
    invoke-virtual {v12, v13, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    const-string v5, "X-Elaris-Upload-Key"

    .line 316
    .line 317
    invoke-static/range {p0 .. p0}, Li5;->a2(Landroid/content/Context;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v13

    .line 321
    invoke-virtual {v12, v5, v13}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    const-string v5, "X-Elaris-Upload-Title"

    .line 325
    .line 326
    invoke-static {v6, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    invoke-virtual {v6, v2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v6

    .line 334
    invoke-virtual {v12, v5, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    const-string v5, "X-Elaris-Upload-Category"

    .line 338
    .line 339
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 340
    .line 341
    .line 342
    move-result v6

    .line 343
    if-nez v6, :cond_d

    .line 344
    .line 345
    const-string v7, "other"

    .line 346
    .line 347
    goto :goto_5

    .line 348
    :catchall_0
    move-exception v0

    .line 349
    goto/16 :goto_9

    .line 350
    .line 351
    :cond_d
    :goto_5
    invoke-static {v7, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    invoke-virtual {v3, v2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-virtual {v12, v5, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    const-string v1, "X-Elaris-Upload-Sha256"

    .line 363
    .line 364
    invoke-virtual {v12, v1, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    array-length v1, v0

    .line 368
    invoke-virtual {v12, v1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 369
    .line 370
    .line 371
    :try_start_1
    invoke-virtual {v12}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 372
    .line 373
    .line 374
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 375
    :try_start_2
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 379
    .line 380
    .line 381
    :try_start_3
    invoke-static {v1}, Li5;->E(Ljava/io/Closeable;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    const/16 v1, 0xc8

    .line 389
    .line 390
    const/16 v2, 0x12c

    .line 391
    .line 392
    if-lt v0, v1, :cond_e

    .line 393
    .line 394
    if-ge v0, v2, :cond_e

    .line 395
    .line 396
    invoke-virtual {v12}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    goto :goto_6

    .line 401
    :cond_e
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    :goto_6
    new-instance v4, Ljava/lang/String;

    .line 406
    .line 407
    const-wide/32 v5, 0x80000

    .line 408
    .line 409
    .line 410
    invoke-static {v3, v5, v6}, Li5;->v1(Ljava/io/InputStream;J)[B

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 415
    .line 416
    invoke-direct {v4, v3, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    if-nez v3, :cond_f

    .line 424
    .line 425
    new-instance v3, Lorg/json/JSONObject;

    .line 426
    .line 427
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 428
    .line 429
    .line 430
    goto :goto_7

    .line 431
    :cond_f
    new-instance v3, Lorg/json/JSONObject;

    .line 432
    .line 433
    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    :goto_7
    if-lt v0, v1, :cond_11

    .line 437
    .line 438
    if-ge v0, v2, :cond_11

    .line 439
    .line 440
    const-string v1, "ok"

    .line 441
    .line 442
    if-ge v0, v2, :cond_10

    .line 443
    .line 444
    move v9, v10

    .line 445
    :cond_10
    invoke-virtual {v3, v1, v9}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 446
    .line 447
    .line 448
    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 449
    if-eqz v1, :cond_11

    .line 450
    .line 451
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 452
    .line 453
    .line 454
    const-string v0, "id"

    .line 455
    .line 456
    invoke-virtual {v3, v0, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    return-void

    .line 460
    :cond_11
    :try_start_4
    new-instance v1, Lm1;

    .line 461
    .line 462
    const-string v2, "message"

    .line 463
    .line 464
    new-instance v4, Ljava/lang/StringBuilder;

    .line 465
    .line 466
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    invoke-virtual {v3, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    invoke-static {v0}, Li5;->L1(Ljava/lang/String;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    throw v1

    .line 488
    :catchall_1
    move-exception v0

    .line 489
    goto :goto_8

    .line 490
    :catchall_2
    move-exception v0

    .line 491
    const/4 v1, 0x0

    .line 492
    :goto_8
    invoke-static {v1}, Li5;->E(Ljava/io/Closeable;)V

    .line 493
    .line 494
    .line 495
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 496
    :goto_9
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 497
    .line 498
    .line 499
    throw v0

    .line 500
    :cond_12
    new-instance v0, Lm1;

    .line 501
    .line 502
    invoke-direct {v0, v6}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    throw v0
.end method

.method public static a(Ljava/io/File;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method public static a0(Landroid/content/Context;F)I
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/high16 p0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 15
    .line 16
    :goto_0
    mul-float/2addr p1, p0

    .line 17
    const/high16 p0, 0x3f000000    # 0.5f

    .line 18
    .line 19
    add-float/2addr p1, p0

    .line 20
    float-to-int p0, p1

    .line 21
    const/4 p1, 0x1

    .line 22
    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
.end method

.method public static a1(Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 6

    .line 1
    const-string v0, "debug_log"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

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
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sget-wide v2, Li5;->t:J

    .line 15
    .line 16
    sub-long v2, v0, v2

    .line 17
    .line 18
    const-wide/16 v4, 0xbb8

    .line 19
    .line 20
    cmp-long v2, v2, v4

    .line 21
    .line 22
    if-gez v2, :cond_1

    .line 23
    .line 24
    :goto_0
    return-void

    .line 25
    :cond_1
    sput-wide v0, Li5;->t:J

    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v1, "favorite emoticon preview miss source="

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p1, " candidates="

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p1, " object="

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, Li5;->j0(Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static a2(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "elaris_cloud_stickers"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string v0, ""

    .line 9
    .line 10
    const-string v1, "upload_token"

    .line 11
    .line 12
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/16 v3, 0x20

    .line 23
    .line 24
    if-lt v2, v3, :cond_0

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 67
    .line 68
    .line 69
    return-object v0
.end method

.method public static b(Landroid/content/Context;)Landroid/app/Activity;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0x8

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-ge v0, v1, :cond_2

    .line 6
    .line 7
    if-eqz p0, :cond_2

    .line 8
    .line 9
    instance-of v1, p0, Landroid/app/Activity;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast p0, Landroid/app/Activity;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v1, p0, Landroid/content/ContextWrapper;

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    check-cast p0, Landroid/content/ContextWrapper;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    return-object v2
.end method

.method public static b0(Landroid/content/Context;I)I
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 13
    .line 14
    int-to-float v0, p1

    .line 15
    mul-float/2addr v0, p0

    .line 16
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 22
    .line 23
    .line 24
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    return p0

    .line 26
    :catchall_0
    :goto_0
    return p1
.end method

.method public static b1(Ljava/lang/CharSequence;)Z
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
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_6

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/16 v2, 0x8c

    .line 24
    .line 25
    if-le v1, v2, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const-string v1, "\u53d1\u9001"

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_6

    .line 35
    .line 36
    const-string v1, "\u8f93\u5165\u6d88\u606f"

    .line 37
    .line 38
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const-string v1, "[\u52a8\u753b\u8868\u60c5]"

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/4 v2, 0x1

    .line 52
    if-nez v1, :cond_5

    .line 53
    .line 54
    const-string v1, "[\u8868\u60c5]"

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_5

    .line 61
    .line 62
    const-string v1, "[\u56fe\u7247]"

    .line 63
    .line 64
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    const-string v1, ":["

    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_5

    .line 78
    .line 79
    const-string v1, "\uff1a["

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-eqz p0, :cond_4

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    return v0

    .line 89
    :cond_5
    :goto_0
    return v2

    .line 90
    :cond_6
    :goto_1
    return v0
.end method

.method public static b2(JJ)Ljava/lang/String;
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p0, v0

    .line 4
    .line 5
    if-gtz v2, :cond_0

    .line 6
    .line 7
    const-string p0, "\u89c6\u9891\u6587\u4ef6\u4e3a\u7a7a"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-wide/32 v2, 0xc800000

    .line 11
    .line 12
    .line 13
    cmp-long p0, p0, v2

    .line 14
    .line 15
    if-lez p0, :cond_1

    .line 16
    .line 17
    const-string p0, "\u89c6\u9891\u8d85\u8fc7 200 MB"

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    cmp-long p0, p2, v0

    .line 21
    .line 22
    if-gtz p0, :cond_2

    .line 23
    .line 24
    const-string p0, "\u65e0\u6cd5\u8bfb\u53d6\u89c6\u9891\u65f6\u957f"

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    const-wide/32 p0, 0xea60

    .line 28
    .line 29
    .line 30
    cmp-long p0, p2, p0

    .line 31
    .line 32
    if-lez p0, :cond_3

    .line 33
    .line 34
    const-string p0, "\u89c6\u9891\u6ce1\u6ce1\u6682\u652f\u6301 60 \u79d2\u4ee5\u5185\u7684\u89c6\u9891"

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    const-string p0, ""

    .line 38
    .line 39
    return-object p0
.end method

.method public static c(Ljava/lang/Object;Ljava/util/LinkedHashMap;Z)V
    .locals 5

    .line 1
    if-eqz p0, :cond_7

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Li5;->M0(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-static {p0}, Li5;->t0(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Li5;->B(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Li5;->H0(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_1
    if-eqz p2, :cond_6

    .line 31
    .line 32
    invoke-static {p0}, Li5;->G0(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-eqz p2, :cond_2

    .line 37
    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 49
    .line 50
    invoke-virtual {p2, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    const-string v1, "friend"

    .line 55
    .line 56
    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_6

    .line 61
    .line 62
    const-string v1, "buddy"

    .line 63
    .line 64
    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_6

    .line 69
    .line 70
    const-string v1, "c2c"

    .line 71
    .line 72
    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_6

    .line 77
    .line 78
    const-string v1, "contact"

    .line 79
    .line 80
    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-eqz p2, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    const-string p2, "u_"

    .line 88
    .line 89
    invoke-virtual {v0, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-eqz p2, :cond_4

    .line 94
    .line 95
    invoke-static {p0}, Li5;->h1(Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-lez p2, :cond_4

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    const-string p2, "type"

    .line 107
    .line 108
    const-string v1, "mUinType"

    .line 109
    .line 110
    const-string v2, "chatType"

    .line 111
    .line 112
    const-string v3, "uinType"

    .line 113
    .line 114
    const-string v4, "contactType"

    .line 115
    .line 116
    filled-new-array {v2, v3, v4, p2, v1}, [Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-static {p0, p2}, Li5;->c2(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    const/high16 v2, -0x80000000

    .line 129
    .line 130
    if-nez v1, :cond_5

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_5
    :try_start_0
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    :catchall_0
    :goto_0
    if-eqz v2, :cond_6

    .line 138
    .line 139
    const/4 p2, 0x1

    .line 140
    if-ne v2, p2, :cond_7

    .line 141
    .line 142
    :cond_6
    :goto_1
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 143
    .line 144
    .line 145
    invoke-static {p0}, Li5;->h1(Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-static {p0}, Li5;->u0(Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-static {p1, v0, p2, p0}, Li5;->s1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 157
    .line 158
    .line 159
    :cond_7
    :goto_2
    return-void
.end method

.method public static c0(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    if-gtz p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    :try_start_0
    instance-of v1, p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    move-object v1, p0

    .line 13
    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    invoke-static {v1, p1, v2}, Li5;->I1(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-gtz v1, :cond_2

    .line 41
    .line 42
    move v1, p1

    .line 43
    :cond_2
    if-gtz v3, :cond_3

    .line 44
    .line 45
    move v3, p1

    .line 46
    :cond_3
    const/4 v4, 0x1

    .line 47
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    mul-int/lit8 v5, p1, 0x3

    .line 52
    .line 53
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 66
    .line 67
    invoke-static {v1, v3, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    new-instance v6, Landroid/graphics/Canvas;

    .line 72
    .line 73
    invoke-direct {v6, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->copyBounds()Landroid/graphics/Rect;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-virtual {p0, v2, v2, v1, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v6}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v7}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v5, p1, v4}, Li5;->I1(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0}, Li5;->I0(Landroid/graphics/Bitmap;)Z

    .line 94
    .line 95
    .line 96
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    if-eqz p1, :cond_4

    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_4
    return-object p0

    .line 101
    :catchall_0
    :cond_5
    :goto_0
    return-object v0
.end method

.method public static c1(Ljava/lang/CharSequence;)Z
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
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_4

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/16 v2, 0x8c

    .line 24
    .line 25
    if-le v1, v2, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "reply"

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_3

    .line 41
    .line 42
    const-string v2, "quote"

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_3

    .line 49
    .line 50
    const-string v1, "\u56de\u590d"

    .line 51
    .line 52
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_3

    .line 57
    .line 58
    const-string v1, "\u5f15\u7528"

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    return v0

    .line 68
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 69
    return p0

    .line 70
    :cond_4
    :goto_1
    return v0
.end method

.method public static varargs c2(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_3

    .line 6
    .line 7
    aget-object v2, p1, v1

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {v3, v2}, Li5;->o0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    :goto_1
    invoke-static {v3}, Li5;->S1(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    if-lez v4, :cond_1

    .line 34
    .line 35
    return-object v3

    .line 36
    :catchall_0
    :cond_1
    invoke-static {p0, v2}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-lez v3, :cond_2

    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const-string p0, ""

    .line 51
    .line 52
    return-object p0
.end method

.method public static d(Ljava/lang/Object;Ljava/util/LinkedHashMap;ZILjava/util/Set;Lq2;)V
    .locals 10

    .line 1
    move-object v5, p5

    .line 2
    if-eqz p0, :cond_14

    .line 3
    .line 4
    const/4 v3, 0x4

    .line 5
    if-gt p3, v3, :cond_14

    .line 6
    .line 7
    iget v4, v5, Lq2;->a:I

    .line 8
    .line 9
    add-int/lit8 v4, v4, 0x1

    .line 10
    .line 11
    iput v4, v5, Lq2;->a:I

    .line 12
    .line 13
    const/16 v6, 0x708

    .line 14
    .line 15
    if-gt v4, v6, :cond_14

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-static {v4}, Li5;->M0(Ljava/lang/Class;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    :try_start_0
    invoke-interface {p4, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    if-nez v6, :cond_1

    .line 33
    .line 34
    goto/16 :goto_8

    .line 35
    .line 36
    :catchall_0
    :cond_1
    invoke-static/range {p0 .. p2}, Li5;->c(Ljava/lang/Object;Ljava/util/LinkedHashMap;Z)V

    .line 37
    .line 38
    .line 39
    instance-of v6, p0, Ljava/util/Map$Entry;

    .line 40
    .line 41
    if-eqz v6, :cond_5

    .line 42
    .line 43
    move-object v6, p0

    .line 44
    check-cast v6, Ljava/util/Map$Entry;

    .line 45
    .line 46
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v0}, Li5;->B(Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    instance-of v7, v3, Ljava/lang/CharSequence;

    .line 59
    .line 60
    if-eqz v7, :cond_2

    .line 61
    .line 62
    invoke-static {v3}, Li5;->S1(Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-static {v3}, Li5;->h1(Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    :goto_0
    invoke-static {v3}, Li5;->u0(Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-static {v0}, Li5;->H0(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_4

    .line 80
    .line 81
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-lez v9, :cond_4

    .line 86
    .line 87
    if-eqz p2, :cond_3

    .line 88
    .line 89
    invoke-static {v3}, Li5;->G0(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    if-nez v9, :cond_4

    .line 94
    .line 95
    :cond_3
    invoke-static {p1, v0, v7, v8}, Li5;->s1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_4
    invoke-static {v3, p1, p2}, Li5;->c(Ljava/lang/Object;Ljava/util/LinkedHashMap;Z)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    add-int/lit8 v3, p3, 0x1

    .line 106
    .line 107
    move-object v1, p1

    .line 108
    move v2, p2

    .line 109
    move-object v4, p4

    .line 110
    invoke-static/range {v0 .. v5}, Li5;->d(Ljava/lang/Object;Ljava/util/LinkedHashMap;ZILjava/util/Set;Lq2;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    move-object v5, p5

    .line 118
    invoke-static/range {v0 .. v5}, Li5;->d(Ljava/lang/Object;Ljava/util/LinkedHashMap;ZILjava/util/Set;Lq2;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_5
    instance-of v1, p0, Ljava/util/Map;

    .line 123
    .line 124
    const/16 v6, 0x258

    .line 125
    .line 126
    const/4 v2, 0x0

    .line 127
    if-eqz v1, :cond_7

    .line 128
    .line 129
    move-object v0, p0

    .line 130
    check-cast v0, Ljava/util/Map;

    .line 131
    .line 132
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_14

    .line 145
    .line 146
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    add-int/lit8 v8, v2, 0x1

    .line 151
    .line 152
    if-le v8, v6, :cond_6

    .line 153
    .line 154
    goto/16 :goto_8

    .line 155
    .line 156
    :cond_6
    add-int/lit8 v3, p3, 0x1

    .line 157
    .line 158
    move-object v1, p1

    .line 159
    move v2, p2

    .line 160
    move-object v4, p4

    .line 161
    move-object v5, p5

    .line 162
    invoke-static/range {v0 .. v5}, Li5;->d(Ljava/lang/Object;Ljava/util/LinkedHashMap;ZILjava/util/Set;Lq2;)V

    .line 163
    .line 164
    .line 165
    move v2, v8

    .line 166
    goto :goto_1

    .line 167
    :cond_7
    instance-of v1, p0, Ljava/lang/Iterable;

    .line 168
    .line 169
    if-eqz v1, :cond_9

    .line 170
    .line 171
    move-object v0, p0

    .line 172
    check-cast v0, Ljava/lang/Iterable;

    .line 173
    .line 174
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_14

    .line 183
    .line 184
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    add-int/lit8 v8, v2, 0x1

    .line 189
    .line 190
    if-le v8, v6, :cond_8

    .line 191
    .line 192
    goto/16 :goto_8

    .line 193
    .line 194
    :cond_8
    add-int/lit8 v3, p3, 0x1

    .line 195
    .line 196
    move-object v1, p1

    .line 197
    move v2, p2

    .line 198
    move-object v4, p4

    .line 199
    move-object v5, p5

    .line 200
    invoke-static/range {v0 .. v5}, Li5;->d(Ljava/lang/Object;Ljava/util/LinkedHashMap;ZILjava/util/Set;Lq2;)V

    .line 201
    .line 202
    .line 203
    move v2, v8

    .line 204
    goto :goto_2

    .line 205
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    invoke-virtual {v7}, Ljava/lang/Class;->isArray()Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-eqz v1, :cond_a

    .line 214
    .line 215
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    move v8, v2

    .line 224
    :goto_3
    if-ge v8, v7, :cond_14

    .line 225
    .line 226
    invoke-static {p0, v8}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    add-int/lit8 v4, p3, 0x1

    .line 231
    .line 232
    move-object v2, p1

    .line 233
    move v3, p2

    .line 234
    move-object v5, p4

    .line 235
    move-object v6, p5

    .line 236
    invoke-static/range {v1 .. v6}, Li5;->d(Ljava/lang/Object;Ljava/util/LinkedHashMap;ZILjava/util/Set;Lq2;)V

    .line 237
    .line 238
    .line 239
    add-int/lit8 v8, v8, 0x1

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_a
    if-lt p3, v3, :cond_b

    .line 243
    .line 244
    goto/16 :goto_8

    .line 245
    .line 246
    :cond_b
    invoke-static {v7}, Li5;->j(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-eqz v1, :cond_d

    .line 259
    .line 260
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    check-cast v1, Ljava/lang/reflect/Field;

    .line 265
    .line 266
    invoke-static {v1, p3}, Li5;->O1(Ljava/lang/reflect/Field;I)Z

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    if-nez v2, :cond_c

    .line 271
    .line 272
    goto :goto_4

    .line 273
    :cond_c
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 277
    add-int/lit8 v4, p3, 0x1

    .line 278
    .line 279
    move-object v2, p1

    .line 280
    move v3, p2

    .line 281
    move-object v5, p4

    .line 282
    move-object v6, p5

    .line 283
    :try_start_2
    invoke-static/range {v1 .. v6}, Li5;->d(Ljava/lang/Object;Ljava/util/LinkedHashMap;ZILjava/util/Set;Lq2;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 284
    .line 285
    .line 286
    move-object v5, v6

    .line 287
    goto :goto_4

    .line 288
    :catchall_1
    move-object v5, v6

    .line 289
    goto :goto_4

    .line 290
    :catchall_2
    move-object v5, p5

    .line 291
    goto :goto_4

    .line 292
    :cond_d
    move-object v5, p5

    .line 293
    invoke-static {v7}, Li5;->k(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v7

    .line 301
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    if-eqz v1, :cond_14

    .line 306
    .line 307
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, Ljava/lang/reflect/Method;

    .line 312
    .line 313
    iget v2, v5, Lq2;->b:I

    .line 314
    .line 315
    add-int/lit8 v2, v2, 0x1

    .line 316
    .line 317
    iput v2, v5, Lq2;->b:I

    .line 318
    .line 319
    const/16 v3, 0xa0

    .line 320
    .line 321
    if-gt v2, v3, :cond_13

    .line 322
    .line 323
    if-eqz v1, :cond_13

    .line 324
    .line 325
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    if-nez v2, :cond_13

    .line 334
    .line 335
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    array-length v2, v2

    .line 340
    if-eqz v2, :cond_e

    .line 341
    .line 342
    goto/16 :goto_7

    .line 343
    .line 344
    :cond_e
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 349
    .line 350
    if-eq v2, v3, :cond_13

    .line 351
    .line 352
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    invoke-static {v2}, Li5;->M0(Ljava/lang/Class;)Z

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    if-eqz v2, :cond_f

    .line 361
    .line 362
    goto :goto_7

    .line 363
    :cond_f
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    const-string v3, "getClass"

    .line 368
    .line 369
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    if-nez v3, :cond_13

    .line 374
    .line 375
    const-string v3, "clone"

    .line 376
    .line 377
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    if-nez v3, :cond_13

    .line 382
    .line 383
    const-string v3, "hashCode"

    .line 384
    .line 385
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    if-nez v3, :cond_13

    .line 390
    .line 391
    const-string v3, "toString"

    .line 392
    .line 393
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    if-eqz v3, :cond_10

    .line 398
    .line 399
    goto :goto_7

    .line 400
    :cond_10
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    invoke-static {v3}, Li5;->B1(Ljava/lang/Class;)Z

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    if-nez v3, :cond_12

    .line 409
    .line 410
    invoke-static {v2}, Li5;->D0(Ljava/lang/String;)Z

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-nez v2, :cond_12

    .line 415
    .line 416
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    if-nez v2, :cond_11

    .line 421
    .line 422
    const-string v2, ""

    .line 423
    .line 424
    goto :goto_6

    .line 425
    :cond_11
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    :goto_6
    invoke-static {v2}, Li5;->D0(Ljava/lang/String;)Z

    .line 430
    .line 431
    .line 432
    move-result v2

    .line 433
    if-eqz v2, :cond_13

    .line 434
    .line 435
    :cond_12
    const/4 v2, 0x0

    .line 436
    :try_start_3
    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    add-int/lit8 v4, p3, 0x1

    .line 441
    .line 442
    move-object v2, p1

    .line 443
    move v3, p2

    .line 444
    move-object v6, v5

    .line 445
    move-object v5, p4

    .line 446
    invoke-static/range {v1 .. v6}, Li5;->d(Ljava/lang/Object;Ljava/util/LinkedHashMap;ZILjava/util/Set;Lq2;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 447
    .line 448
    .line 449
    :catchall_3
    :cond_13
    :goto_7
    move-object v5, p5

    .line 450
    goto/16 :goto_5

    .line 451
    .line 452
    :cond_14
    :goto_8
    return-void
.end method

.method public static d0(II)Z
    .locals 6

    .line 1
    if-lez p0, :cond_3

    .line 2
    .line 3
    if-gtz p1, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    int-to-long v0, p1

    .line 7
    const-wide/16 v2, 0x3e8

    .line 8
    .line 9
    mul-long/2addr v0, v2

    .line 10
    int-to-long p0, p0

    .line 11
    mul-long/2addr v2, p0

    .line 12
    cmp-long v4, v2, v0

    .line 13
    .line 14
    if-ltz v4, :cond_1

    .line 15
    .line 16
    sub-long/2addr v2, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    sub-long v2, v0, v2

    .line 19
    .line 20
    :goto_0
    const-wide/16 v4, 0x14

    .line 21
    .line 22
    mul-long/2addr p0, v4

    .line 23
    cmp-long v4, p0, v0

    .line 24
    .line 25
    if-ltz v4, :cond_2

    .line 26
    .line 27
    sub-long/2addr p0, v0

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    sub-long p0, v0, p0

    .line 30
    .line 31
    :goto_1
    cmp-long p0, v2, p0

    .line 32
    .line 33
    if-gtz p0, :cond_3

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_3
    :goto_2
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static d1()Landroid/widget/LinearLayout$LayoutParams;
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, -0x2

    .line 5
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static d2(Ljava/io/File;JJ)V
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    cmp-long p1, v0, p1

    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    const-wide/16 p1, 0x0

    .line 12
    .line 13
    cmp-long p1, p3, p1

    .line 14
    .line 15
    if-lez p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/io/File;->lastModified()J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    cmp-long p0, p0, p3

    .line 22
    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :cond_1
    const-string p0, "audio source changed or incomplete"

    .line 27
    .line 28
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static e(Ljava/io/File;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

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
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {p0, p1, p2}, Li5;->f(Ljava/io/File;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    invoke-static {p0, v1, p2}, Li5;->f(Ljava/io/File;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    invoke-static {p0, v0, p2}, Li5;->f(Ljava/io/File;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    return-void
.end method

.method public static e0(Ljava/lang/String;Z)Ljava/util/LinkedHashSet;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Li5;->n1(Ljava/lang/String;Z)Ljava/util/LinkedHashSet;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-object v0

    .line 26
    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    .line 27
    .line 28
    const/16 p0, 0x3ed

    .line 29
    .line 30
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    const/16 p0, 0x3f8

    .line 38
    .line 39
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_2
    return-object v0
.end method

.method public static e1(Landroid/media/MediaFormat;Ljava/lang/String;I)I
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    return p0

    .line 14
    :catchall_0
    :cond_0
    return p2
.end method

.method public static e2(Landroid/view/View;Z)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    if-eqz p1, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move v1, v0

    .line 18
    :goto_0
    if-gtz v1, :cond_3

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    :try_start_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 28
    .line 29
    .line 30
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    :catchall_1
    :cond_3
    :goto_1
    if-gtz v1, :cond_5

    .line 32
    .line 33
    :try_start_2
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz p0, :cond_5

    .line 38
    .line 39
    if-eqz p1, :cond_4

    .line 40
    .line 41
    iget p0, p0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 42
    .line 43
    :goto_2
    move v1, p0

    .line 44
    goto :goto_3

    .line 45
    :cond_4
    iget p0, p0, Landroid/view/ViewGroup$LayoutParams;->height:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catchall_2
    :cond_5
    :goto_3
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0
.end method

.method public static f(Ljava/io/File;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

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
    new-instance v0, Ljava/io/File;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, p2}, Li5;->i(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Ljava/io/File;

    .line 23
    .line 24
    const-string v1, ".png"

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0, p2}, Li5;->i(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Ljava/io/File;

    .line 41
    .line 42
    const-string v1, ".jpg"

    .line 43
    .line 44
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0, p2}, Li5;->i(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Ljava/io/File;

    .line 59
    .line 60
    const-string v1, ".jpeg"

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0, p2}, Li5;->i(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 74
    .line 75
    .line 76
    new-instance v0, Ljava/io/File;

    .line 77
    .line 78
    const-string v1, ".gif"

    .line 79
    .line 80
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0, p2}, Li5;->i(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 92
    .line 93
    .line 94
    new-instance v0, Ljava/io/File;

    .line 95
    .line 96
    const-string v1, ".webp"

    .line 97
    .line 98
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0, p2}, Li5;->i(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 110
    .line 111
    .line 112
    :cond_1
    :goto_0
    return-void
.end method

.method public static f0(Ljava/io/File;Ljava/io/File;ZLve;)V
    .locals 27

    .line 1
    const/4 v1, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    :try_start_0
    const-string v0, "audio/amr-wb"

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    move-object v3, v1

    .line 9
    move-object v7, v3

    .line 10
    goto/16 :goto_10

    .line 11
    .line 12
    :catch_0
    move-exception v0

    .line 13
    move-object v3, v1

    .line 14
    move-object v7, v3

    .line 15
    goto/16 :goto_11

    .line 16
    .line 17
    :cond_0
    const-string v0, "audio/3gpp"

    .line 18
    .line 19
    :goto_0
    if-eqz p2, :cond_1

    .line 20
    .line 21
    const/16 v2, 0x3e80

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/16 v2, 0x1f40

    .line 25
    .line 26
    :goto_1
    if-eqz p2, :cond_2

    .line 27
    .line 28
    const/16 v3, 0x5d2a

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    const/16 v3, 0x2fa8

    .line 32
    .line 33
    :goto_2
    if-eqz p2, :cond_3

    .line 34
    .line 35
    const/16 v4, 0x280

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    const/16 v4, 0x140

    .line 39
    .line 40
    :goto_3
    const/4 v5, 0x1

    .line 41
    invoke-static {v0, v2, v5}, Landroid/media/MediaFormat;->createAudioFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    const-string v7, "bitrate"

    .line 46
    .line 47
    invoke-virtual {v6, v7, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    const-string v3, "max-input-size"

    .line 51
    .line 52
    mul-int/lit8 v7, v4, 0x8

    .line 53
    .line 54
    invoke-virtual {v6, v3, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 58
    .line 59
    .line 60
    move-result-object v8
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    :try_start_1
    invoke-virtual {v8, v6, v1, v1, v5}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v8}, Landroid/media/MediaCodec;->start()V

    .line 65
    .line 66
    .line 67
    new-instance v3, Ljava/io/FileOutputStream;

    .line 68
    .line 69
    move-object/from16 v6, p1

    .line 70
    .line 71
    invoke-direct {v3, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 72
    .line 73
    .line 74
    if-eqz p2, :cond_4

    .line 75
    .line 76
    :try_start_2
    const-string v0, "#!AMR-WB\n"

    .line 77
    .line 78
    goto :goto_6

    .line 79
    :catchall_1
    move-exception v0

    .line 80
    move-object v7, v1

    .line 81
    :goto_4
    move-object v1, v8

    .line 82
    goto/16 :goto_10

    .line 83
    .line 84
    :catch_1
    move-exception v0

    .line 85
    move-object v7, v1

    .line 86
    :goto_5
    move-object v1, v8

    .line 87
    goto/16 :goto_11

    .line 88
    .line 89
    :cond_4
    const-string v0, "#!AMR\n"

    .line 90
    .line 91
    :goto_6
    const-string v7, "US-ASCII"

    .line 92
    .line 93
    invoke-virtual {v0, v7}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v3, v0}, Ljava/io/FileOutputStream;->write([B)V

    .line 98
    .line 99
    .line 100
    new-instance v7, Ljava/io/FileInputStream;

    .line 101
    .line 102
    move-object/from16 v0, p0

    .line 103
    .line 104
    invoke-direct {v7, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 105
    .line 106
    .line 107
    :try_start_3
    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    .line 108
    .line 109
    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 113
    .line 114
    .line 115
    move-result-wide v9

    .line 116
    const/4 v15, 0x0

    .line 117
    const-wide/16 v11, 0x0

    .line 118
    .line 119
    move-wide/from16 v16, v9

    .line 120
    .line 121
    move-wide/from16 v18, v11

    .line 122
    .line 123
    move/from16 v20, v15

    .line 124
    .line 125
    move/from16 v21, v20

    .line 126
    .line 127
    :goto_7
    if-nez v20, :cond_14

    .line 128
    .line 129
    invoke-static/range {p3 .. p3}, Li5;->y(Lve;)V

    .line 130
    .line 131
    .line 132
    const-wide/16 v9, 0x2710

    .line 133
    .line 134
    if-nez v21, :cond_d

    .line 135
    .line 136
    move-wide v10, v9

    .line 137
    invoke-virtual {v8, v10, v11}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-ltz v9, :cond_d

    .line 142
    .line 143
    invoke-virtual {v8, v9}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    if-eqz v12, :cond_c

    .line 148
    .line 149
    invoke-virtual {v12}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12}, Ljava/nio/Buffer;->capacity()I

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    div-int/2addr v13, v4

    .line 157
    mul-int/2addr v13, v4

    .line 158
    if-lt v13, v4, :cond_b

    .line 159
    .line 160
    const/high16 v14, 0x10000

    .line 161
    .line 162
    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    .line 163
    .line 164
    .line 165
    move-result v13

    .line 166
    if-eqz v1, :cond_5

    .line 167
    .line 168
    array-length v14, v1

    .line 169
    if-ge v14, v13, :cond_6

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :catchall_2
    move-exception v0

    .line 173
    goto :goto_4

    .line 174
    :catch_2
    move-exception v0

    .line 175
    goto :goto_5

    .line 176
    :cond_5
    :goto_8
    new-array v1, v13, [B

    .line 177
    .line 178
    :cond_6
    invoke-static {v7, v1, v13}, Li5;->u1(Ljava/io/FileInputStream;[BI)I

    .line 179
    .line 180
    .line 181
    move-result v13

    .line 182
    const-wide/32 v22, 0xf4240

    .line 183
    .line 184
    .line 185
    const-wide/16 v24, 0x2

    .line 186
    .line 187
    if-gtz v13, :cond_7

    .line 188
    .line 189
    div-long v12, v18, v24

    .line 190
    .line 191
    mul-long v12, v12, v22

    .line 192
    .line 193
    move/from16 v26, v5

    .line 194
    .line 195
    int-to-long v5, v2

    .line 196
    div-long/2addr v12, v5

    .line 197
    const/4 v14, 0x4

    .line 198
    move-wide v5, v10

    .line 199
    const/4 v10, 0x0

    .line 200
    const/4 v11, 0x0

    .line 201
    invoke-virtual/range {v8 .. v14}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 202
    .line 203
    .line 204
    move-wide v10, v5

    .line 205
    move/from16 v5, v26

    .line 206
    .line 207
    move/from16 v21, v5

    .line 208
    .line 209
    goto :goto_b

    .line 210
    :cond_7
    move/from16 v26, v5

    .line 211
    .line 212
    move-wide v5, v10

    .line 213
    add-int v10, v13, v4

    .line 214
    .line 215
    add-int/lit8 v10, v10, -0x1

    .line 216
    .line 217
    div-int/2addr v10, v4

    .line 218
    mul-int/2addr v10, v4

    .line 219
    invoke-virtual {v12}, Ljava/nio/Buffer;->capacity()I

    .line 220
    .line 221
    .line 222
    move-result v11

    .line 223
    if-le v10, v11, :cond_8

    .line 224
    .line 225
    rem-int v10, v13, v4

    .line 226
    .line 227
    sub-int v10, v13, v10

    .line 228
    .line 229
    if-lez v10, :cond_9

    .line 230
    .line 231
    :cond_8
    move v11, v10

    .line 232
    goto :goto_9

    .line 233
    :cond_9
    new-instance v0, Ljava/io/IOException;

    .line 234
    .line 235
    const-string v1, "audio encoder frame size"

    .line 236
    .line 237
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v0

    .line 241
    :goto_9
    if-le v11, v13, :cond_a

    .line 242
    .line 243
    invoke-static {v1, v13, v11, v15}, Ljava/util/Arrays;->fill([BIIB)V

    .line 244
    .line 245
    .line 246
    :cond_a
    invoke-virtual {v12, v1, v15, v11}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 247
    .line 248
    .line 249
    div-long v12, v18, v24

    .line 250
    .line 251
    mul-long v12, v12, v22

    .line 252
    .line 253
    int-to-long v5, v2

    .line 254
    div-long/2addr v12, v5

    .line 255
    const/4 v10, 0x0

    .line 256
    const/4 v14, 0x0

    .line 257
    invoke-virtual/range {v8 .. v14}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 258
    .line 259
    .line 260
    int-to-long v5, v11

    .line 261
    add-long v18, v18, v5

    .line 262
    .line 263
    move/from16 v5, v26

    .line 264
    .line 265
    :goto_a
    const-wide/16 v10, 0x2710

    .line 266
    .line 267
    goto :goto_b

    .line 268
    :cond_b
    new-instance v0, Ljava/io/IOException;

    .line 269
    .line 270
    const-string v1, "audio encoder input buffer too small"

    .line 271
    .line 272
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v0

    .line 276
    :cond_c
    new-instance v0, Ljava/io/IOException;

    .line 277
    .line 278
    const-string v1, "audio encoder input missing"

    .line 279
    .line 280
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw v0

    .line 284
    :cond_d
    move/from16 v26, v5

    .line 285
    .line 286
    move v5, v15

    .line 287
    goto :goto_a

    .line 288
    :goto_b
    invoke-virtual {v8, v0, v10, v11}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 289
    .line 290
    .line 291
    move-result v6
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 292
    if-ltz v6, :cond_11

    .line 293
    .line 294
    :try_start_4
    iget v5, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 295
    .line 296
    if-lez v5, :cond_f

    .line 297
    .line 298
    iget v5, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 299
    .line 300
    and-int/lit8 v5, v5, 0x2

    .line 301
    .line 302
    if-nez v5, :cond_f

    .line 303
    .line 304
    invoke-virtual {v8, v6}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    if-eqz v5, :cond_e

    .line 309
    .line 310
    const-string v9, "audio encoder output invalid"

    .line 311
    .line 312
    invoke-static {v5, v0, v9}, Li5;->M1(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    iget v9, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 316
    .line 317
    new-array v9, v9, [B

    .line 318
    .line 319
    invoke-virtual {v5, v9}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3, v9}, Ljava/io/FileOutputStream;->write([B)V

    .line 323
    .line 324
    .line 325
    goto :goto_c

    .line 326
    :catchall_3
    move-exception v0

    .line 327
    goto :goto_d

    .line 328
    :cond_e
    new-instance v0, Ljava/io/IOException;

    .line 329
    .line 330
    const-string v1, "audio encoder output missing"

    .line 331
    .line 332
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw v0

    .line 336
    :cond_f
    :goto_c
    iget v5, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 337
    .line 338
    and-int/lit8 v5, v5, 0x4

    .line 339
    .line 340
    if-eqz v5, :cond_10

    .line 341
    .line 342
    move/from16 v20, v26

    .line 343
    .line 344
    :cond_10
    :try_start_5
    invoke-virtual {v8, v6, v15}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 345
    .line 346
    .line 347
    move/from16 v5, v26

    .line 348
    .line 349
    goto :goto_e

    .line 350
    :goto_d
    invoke-virtual {v8, v6, v15}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 351
    .line 352
    .line 353
    throw v0

    .line 354
    :cond_11
    :goto_e
    if-eqz v5, :cond_12

    .line 355
    .line 356
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 357
    .line 358
    .line 359
    move-result-wide v5

    .line 360
    move-wide/from16 v16, v5

    .line 361
    .line 362
    goto :goto_f

    .line 363
    :cond_12
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 364
    .line 365
    .line 366
    move-result-wide v5

    .line 367
    sub-long v5, v5, v16

    .line 368
    .line 369
    const-wide v9, 0x6fc23ac00L

    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    cmp-long v5, v5, v9

    .line 375
    .line 376
    if-gtz v5, :cond_13

    .line 377
    .line 378
    :goto_f
    move-object/from16 v6, p1

    .line 379
    .line 380
    move/from16 v5, v26

    .line 381
    .line 382
    goto/16 :goto_7

    .line 383
    .line 384
    :cond_13
    new-instance v0, Ljava/io/IOException;

    .line 385
    .line 386
    const-string v1, "audio encoder stalled"

    .line 387
    .line 388
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    throw v0

    .line 392
    :cond_14
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->length()J

    .line 396
    .line 397
    .line 398
    move-result-wide v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 399
    const-wide/16 v4, 0x8

    .line 400
    .line 401
    cmp-long v0, v0, v4

    .line 402
    .line 403
    if-lez v0, :cond_15

    .line 404
    .line 405
    invoke-static {v7}, Li5;->H(Ljava/io/Closeable;)V

    .line 406
    .line 407
    .line 408
    invoke-static {v3}, Li5;->H(Ljava/io/Closeable;)V

    .line 409
    .line 410
    .line 411
    :try_start_6
    invoke-virtual {v8}, Landroid/media/MediaCodec;->stop()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 412
    .line 413
    .line 414
    :catchall_4
    :try_start_7
    invoke-virtual {v8}, Landroid/media/MediaCodec;->release()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 415
    .line 416
    .line 417
    :catchall_5
    return-void

    .line 418
    :cond_15
    :try_start_8
    new-instance v0, Ljava/io/IOException;

    .line 419
    .line 420
    const-string v1, "audio encode empty"

    .line 421
    .line 422
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    throw v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 426
    :catchall_6
    move-exception v0

    .line 427
    move-object v3, v1

    .line 428
    move-object v7, v3

    .line 429
    goto/16 :goto_4

    .line 430
    .line 431
    :catch_3
    move-exception v0

    .line 432
    move-object v3, v1

    .line 433
    move-object v7, v3

    .line 434
    goto/16 :goto_5

    .line 435
    .line 436
    :goto_10
    :try_start_9
    new-instance v2, Ljava/io/IOException;

    .line 437
    .line 438
    new-instance v4, Ljava/lang/StringBuilder;

    .line 439
    .line 440
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 441
    .line 442
    .line 443
    const-string v5, "audio encode failed: "

    .line 444
    .line 445
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    throw v2

    .line 467
    :catchall_7
    move-exception v0

    .line 468
    goto :goto_12

    .line 469
    :goto_11
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 470
    :goto_12
    invoke-static {v7}, Li5;->H(Ljava/io/Closeable;)V

    .line 471
    .line 472
    .line 473
    invoke-static {v3}, Li5;->H(Ljava/io/Closeable;)V

    .line 474
    .line 475
    .line 476
    if-eqz v1, :cond_16

    .line 477
    .line 478
    :try_start_a
    invoke-virtual {v1}, Landroid/media/MediaCodec;->stop()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 479
    .line 480
    .line 481
    :catchall_8
    :try_start_b
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 482
    .line 483
    .line 484
    :catchall_9
    :cond_16
    invoke-static/range {p1 .. p1}, Li5;->U(Ljava/io/File;)V

    .line 485
    .line 486
    .line 487
    throw v0
.end method

.method public static f1(JLjava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x50

    .line 8
    .line 9
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ge v1, v3, :cond_5

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-ge v3, v2, :cond_5

    .line 28
    .line 29
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/16 v4, 0x61

    .line 34
    .line 35
    if-lt v3, v4, :cond_0

    .line 36
    .line 37
    const/16 v4, 0x7a

    .line 38
    .line 39
    if-le v3, v4, :cond_3

    .line 40
    .line 41
    :cond_0
    const/16 v4, 0x41

    .line 42
    .line 43
    if-lt v3, v4, :cond_1

    .line 44
    .line 45
    const/16 v4, 0x5a

    .line 46
    .line 47
    if-le v3, v4, :cond_3

    .line 48
    .line 49
    :cond_1
    const/16 v4, 0x30

    .line 50
    .line 51
    if-lt v3, v4, :cond_2

    .line 52
    .line 53
    const/16 v4, 0x39

    .line 54
    .line 55
    if-le v3, v4, :cond_3

    .line 56
    .line 57
    :cond_2
    const/16 v4, 0x5f

    .line 58
    .line 59
    if-eq v3, v4, :cond_3

    .line 60
    .line 61
    const/16 v4, 0x2d

    .line 62
    .line 63
    if-ne v3, v4, :cond_4

    .line 64
    .line 65
    :cond_3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_6

    .line 80
    .line 81
    const-string p2, "elaris_video"

    .line 82
    .line 83
    :cond_6
    const-string v0, "{\"mission_id\":\""

    .line 84
    .line 85
    const-string v1, "\",\"filter_id\":\"\",\"caption_json\":\"\",\"change_voice_style_id\":\"\",\"key_audio_chunked_encode_session_id\":\"\",\"bgm_path\":\"\",\"duration_ms\":"

    .line 86
    .line 87
    invoke-static {v0, p2, v1}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    const-wide/16 v0, 0x0

    .line 92
    .line 93
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->max(JJ)J

    .line 94
    .line 95
    .line 96
    move-result-wide p0

    .line 97
    invoke-virtual {p2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string p0, ",\"is_composed_in_page\":true}"

    .line 101
    .line 102
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0
.end method

.method public static f2(ILl8;)V
    .locals 4

    .line 1
    add-int/lit8 p0, p0, -0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    const-wide/16 v0, 0xfa

    .line 9
    .line 10
    shl-long/2addr v0, p0

    .line 11
    const-wide/16 v2, 0x3e8

    .line 12
    .line 13
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    :goto_0
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    cmp-long p0, v0, v2

    .line 20
    .line 21
    if-lez p0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Ll8;->b()V

    .line 24
    .line 25
    .line 26
    const-wide/16 v2, 0x64

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    sub-long/2addr v0, v2

    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-exception p0

    .line 38
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 43
    .line 44
    .line 45
    new-instance p1, Ljava/io/IOException;

    .line 46
    .line 47
    const-string v0, "tts cancelled"

    .line 48
    .line 49
    invoke-direct {p1, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_0
    return-void
.end method

.method public static g(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p1}, Li5;->B(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Li5;->H0(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_2
    const/4 p0, 0x1

    .line 30
    return p0
.end method

.method public static g0(Landroid/content/Context;Ljava/io/File;Ljava/io/File;IILve;)V
    .locals 20

    .line 1
    const-string v0, "a"

    .line 2
    .line 3
    const-string v1, "b"

    .line 4
    .line 5
    const-class v2, Landroid/content/Context;

    .line 6
    .line 7
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    const-string v5, "com.tencent.mobileqq.utils.SilkCodecWrapper"

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    invoke-static {v5, v6, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    const/4 v5, 0x1

    .line 19
    :try_start_1
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-virtual {v4, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    invoke-virtual {v7, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 28
    .line 29
    .line 30
    filled-new-array/range {p0 .. p0}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    invoke-virtual {v7, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    goto :goto_4

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    move-object/from16 v8, p2

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    :goto_0
    const/4 v5, 0x0

    .line 44
    :goto_1
    const/16 v16, 0x0

    .line 45
    .line 46
    goto/16 :goto_14

    .line 47
    .line 48
    :catch_0
    move-exception v0

    .line 49
    move-object/from16 v8, p2

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    :goto_2
    const/4 v5, 0x0

    .line 53
    :goto_3
    const/16 v16, 0x0

    .line 54
    .line 55
    goto/16 :goto_15

    .line 56
    .line 57
    :catch_1
    :try_start_2
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    filled-new-array {v2, v7}, [Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v4, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 68
    .line 69
    .line 70
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 71
    .line 72
    move-object/from16 v8, p0

    .line 73
    .line 74
    filled-new-array {v8, v7}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-virtual {v2, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    :goto_4
    :try_start_3
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    filled-new-array {v7, v7, v7}, [Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-virtual {v4, v1, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    invoke-virtual {v8, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 93
    .line 94
    .line 95
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    filled-new-array {v9, v10, v11}, [Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    invoke-virtual {v8, v2, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    div-int/lit8 v8, p3, 0x32

    .line 115
    .line 116
    const/4 v9, 0x2

    .line 117
    mul-int/2addr v8, v9

    .line 118
    const-string v10, "p"

    .line 119
    .line 120
    invoke-static {v2, v10}, Li5;->w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v10
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 124
    :try_start_4
    instance-of v11, v10, Ljava/lang/Number;

    .line 125
    .line 126
    if-eqz v11, :cond_0

    .line 127
    .line 128
    check-cast v10, Ljava/lang/Number;

    .line 129
    .line 130
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v10
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_7
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 134
    goto :goto_5

    .line 135
    :cond_0
    move v10, v8

    .line 136
    :goto_5
    if-ne v10, v8, :cond_b

    .line 137
    .line 138
    :try_start_5
    const-class v8, [B

    .line 139
    .line 140
    filled-new-array {v8, v7, v7}, [Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-virtual {v4, v0, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 149
    .line 150
    .line 151
    new-instance v5, Ljava/io/FileInputStream;

    .line 152
    .line 153
    move-object/from16 v7, p1

    .line 154
    .line 155
    invoke-direct {v5, v7}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 156
    .line 157
    .line 158
    :try_start_6
    new-instance v7, Ljava/io/FileOutputStream;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 159
    .line 160
    move-object/from16 v8, p2

    .line 161
    .line 162
    :try_start_7
    invoke-direct {v7, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 163
    .line 164
    .line 165
    :try_start_8
    invoke-static/range {p3 .. p3}, Li5;->T1(I)[B

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    invoke-virtual {v7, v11}, Ljava/io/FileOutputStream;->write([B)V

    .line 170
    .line 171
    .line 172
    new-array v11, v10, [B

    .line 173
    .line 174
    move v12, v6

    .line 175
    :goto_6
    invoke-static/range {p5 .. p5}, Li5;->y(Lve;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v5, v11, v10}, Li5;->u1(Ljava/io/FileInputStream;[BI)I

    .line 179
    .line 180
    .line 181
    move-result v13
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 182
    const-string v14, "silk encode empty"

    .line 183
    .line 184
    if-gtz v13, :cond_1

    .line 185
    .line 186
    goto/16 :goto_d

    .line 187
    .line 188
    :cond_1
    if-ge v13, v10, :cond_2

    .line 189
    .line 190
    :try_start_9
    invoke-static {v11, v13, v10, v6}, Ljava/util/Arrays;->fill([BIIB)V

    .line 191
    .line 192
    .line 193
    goto :goto_7

    .line 194
    :catchall_1
    move-exception v0

    .line 195
    move-object v3, v2

    .line 196
    move-object/from16 v16, v7

    .line 197
    .line 198
    goto/16 :goto_14

    .line 199
    .line 200
    :catch_2
    move-exception v0

    .line 201
    move-object v3, v2

    .line 202
    move-object/from16 v16, v7

    .line 203
    .line 204
    goto/16 :goto_15

    .line 205
    .line 206
    :cond_2
    :goto_7
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v15

    .line 210
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    filled-new-array {v11, v15, v3}, [Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-virtual {v4, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    if-nez v3, :cond_3

    .line 223
    .line 224
    const/4 v15, 0x0

    .line 225
    goto :goto_8

    .line 226
    :cond_3
    const-string v15, "c"

    .line 227
    .line 228
    invoke-static {v3, v15}, Li5;->w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v15

    .line 232
    check-cast v15, [B

    .line 233
    .line 234
    :goto_8
    if-nez v3, :cond_4

    .line 235
    .line 236
    const/4 v6, 0x0

    .line 237
    goto :goto_9

    .line 238
    :cond_4
    invoke-static {v3, v1}, Li5;->w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v17

    .line 242
    move-object/from16 v6, v17

    .line 243
    .line 244
    :goto_9
    instance-of v9, v6, Ljava/lang/Number;

    .line 245
    .line 246
    if-eqz v9, :cond_5

    .line 247
    .line 248
    check-cast v6, Ljava/lang/Number;

    .line 249
    .line 250
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    goto :goto_a

    .line 255
    :cond_5
    const/4 v6, 0x0

    .line 256
    :goto_a
    if-nez v3, :cond_6

    .line 257
    .line 258
    const/4 v3, 0x0

    .line 259
    goto :goto_b

    .line 260
    :cond_6
    invoke-static {v3, v0}, Li5;->w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    :goto_b
    instance-of v9, v3, Ljava/lang/Number;

    .line 265
    .line 266
    if-eqz v9, :cond_7

    .line 267
    .line 268
    check-cast v3, Ljava/lang/Number;

    .line 269
    .line 270
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    goto :goto_c

    .line 275
    :cond_7
    const/4 v3, 0x0

    .line 276
    :goto_c
    if-eqz v15, :cond_a

    .line 277
    .line 278
    if-ltz v6, :cond_a

    .line 279
    .line 280
    const/4 v9, 0x2

    .line 281
    if-le v3, v9, :cond_a

    .line 282
    .line 283
    move/from16 v17, v10

    .line 284
    .line 285
    int-to-long v9, v6

    .line 286
    move-object/from16 v18, v0

    .line 287
    .line 288
    move-object/from16 v19, v1

    .line 289
    .line 290
    int-to-long v0, v3

    .line 291
    add-long/2addr v9, v0

    .line 292
    array-length v0, v15

    .line 293
    int-to-long v0, v0

    .line 294
    cmp-long v0, v9, v0

    .line 295
    .line 296
    if-gtz v0, :cond_a

    .line 297
    .line 298
    invoke-virtual {v7, v15, v6, v3}, Ljava/io/FileOutputStream;->write([BII)V

    .line 299
    .line 300
    .line 301
    add-int/lit8 v12, v12, 0x1

    .line 302
    .line 303
    move/from16 v10, v17

    .line 304
    .line 305
    if-ge v13, v10, :cond_9

    .line 306
    .line 307
    :goto_d
    invoke-virtual {v7}, Ljava/io/OutputStream;->flush()V

    .line 308
    .line 309
    .line 310
    if-lez v12, :cond_8

    .line 311
    .line 312
    invoke-virtual {v8}, Ljava/io/File;->length()J

    .line 313
    .line 314
    .line 315
    move-result-wide v0
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 316
    const-wide/16 v3, 0xc

    .line 317
    .line 318
    cmp-long v0, v0, v3

    .line 319
    .line 320
    if-lez v0, :cond_8

    .line 321
    .line 322
    invoke-static {v5}, Li5;->H(Ljava/io/Closeable;)V

    .line 323
    .line 324
    .line 325
    invoke-static {v7}, Li5;->H(Ljava/io/Closeable;)V

    .line 326
    .line 327
    .line 328
    invoke-static {v2}, Li5;->x1(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    return-void

    .line 332
    :cond_8
    :try_start_a
    new-instance v0, Ljava/io/IOException;

    .line 333
    .line 334
    invoke-direct {v0, v14}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    throw v0

    .line 338
    :cond_9
    move-object/from16 v0, v18

    .line 339
    .line 340
    move-object/from16 v1, v19

    .line 341
    .line 342
    const/4 v6, 0x0

    .line 343
    const/4 v9, 0x2

    .line 344
    goto/16 :goto_6

    .line 345
    .line 346
    :cond_a
    new-instance v0, Ljava/io/IOException;

    .line 347
    .line 348
    invoke-direct {v0, v14}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    throw v0
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 352
    :catchall_2
    move-exception v0

    .line 353
    :goto_e
    move-object v3, v2

    .line 354
    goto/16 :goto_1

    .line 355
    .line 356
    :catch_3
    move-exception v0

    .line 357
    :goto_f
    move-object v3, v2

    .line 358
    goto/16 :goto_3

    .line 359
    .line 360
    :catchall_3
    move-exception v0

    .line 361
    move-object/from16 v8, p2

    .line 362
    .line 363
    goto :goto_e

    .line 364
    :catch_4
    move-exception v0

    .line 365
    move-object/from16 v8, p2

    .line 366
    .line 367
    goto :goto_f

    .line 368
    :catchall_4
    move-exception v0

    .line 369
    :goto_10
    move-object/from16 v8, p2

    .line 370
    .line 371
    :goto_11
    move-object v3, v2

    .line 372
    goto/16 :goto_0

    .line 373
    .line 374
    :catch_5
    move-exception v0

    .line 375
    :goto_12
    move-object/from16 v8, p2

    .line 376
    .line 377
    :goto_13
    move-object v3, v2

    .line 378
    goto/16 :goto_2

    .line 379
    .line 380
    :cond_b
    move-object/from16 v8, p2

    .line 381
    .line 382
    :try_start_b
    new-instance v0, Ljava/io/IOException;

    .line 383
    .line 384
    const-string v1, "silk frame size mismatch"

    .line 385
    .line 386
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    throw v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_6
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 390
    :catchall_5
    move-exception v0

    .line 391
    goto :goto_11

    .line 392
    :catch_6
    move-exception v0

    .line 393
    goto :goto_13

    .line 394
    :catchall_6
    move-exception v0

    .line 395
    goto :goto_10

    .line 396
    :catch_7
    move-exception v0

    .line 397
    goto :goto_12

    .line 398
    :goto_14
    :try_start_c
    new-instance v1, Ljava/io/IOException;

    .line 399
    .line 400
    new-instance v2, Ljava/lang/StringBuilder;

    .line 401
    .line 402
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 403
    .line 404
    .line 405
    const-string v4, "silk encode failed: "

    .line 406
    .line 407
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw v1

    .line 429
    :catchall_7
    move-exception v0

    .line 430
    goto :goto_16

    .line 431
    :goto_15
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 432
    :goto_16
    invoke-static {v5}, Li5;->H(Ljava/io/Closeable;)V

    .line 433
    .line 434
    .line 435
    invoke-static/range {v16 .. v16}, Li5;->H(Ljava/io/Closeable;)V

    .line 436
    .line 437
    .line 438
    invoke-static {v3}, Li5;->x1(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    invoke-static {v8}, Li5;->U(Ljava/io/File;)V

    .line 442
    .line 443
    .line 444
    throw v0
.end method

.method public static g1(Ljava/lang/String;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    move v0, v1

    .line 10
    move v2, v0

    .line 11
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-ge v0, v3, :cond_5

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const v4, 0xfffd

    .line 22
    .line 23
    .line 24
    if-eq v3, v4, :cond_3

    .line 25
    .line 26
    const/16 v4, 0xc3

    .line 27
    .line 28
    if-eq v3, v4, :cond_3

    .line 29
    .line 30
    const/16 v4, 0xc2

    .line 31
    .line 32
    if-ne v3, v4, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    move v4, v1

    .line 36
    :goto_1
    const/16 v5, 0x37

    .line 37
    .line 38
    if-ge v4, v5, :cond_4

    .line 39
    .line 40
    sget-object v5, Li5;->q:[I

    .line 41
    .line 42
    aget v5, v5, v4

    .line 43
    .line 44
    if-ne v5, v3, :cond_2

    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x4

    .line 53
    .line 54
    :cond_4
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    move v0, v1

    .line 58
    :goto_4
    const/16 v3, 0x10

    .line 59
    .line 60
    if-ge v0, v3, :cond_9

    .line 61
    .line 62
    sget-object v3, Li5;->r:[I

    .line 63
    .line 64
    aget v3, v3, v0

    .line 65
    .line 66
    move v4, v1

    .line 67
    :goto_5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-ge v4, v5, :cond_7

    .line 72
    .line 73
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-ne v5, v3, :cond_6

    .line 78
    .line 79
    goto :goto_6

    .line 80
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_7
    const/4 v4, -0x1

    .line 84
    :goto_6
    if-ltz v4, :cond_8

    .line 85
    .line 86
    add-int/lit8 v2, v2, 0x2

    .line 87
    .line 88
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_9
    return v2
.end method

.method public static g2(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "getWrapperSession"

    .line 2
    .line 3
    invoke-static {p0, v0}, Li5;->v(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getQQNTWrapperSession"

    .line 8
    .line 9
    invoke-static {p0, v1}, Li5;->v(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "getKernelSession"

    .line 14
    .line 15
    invoke-static {p0, v2}, Li5;->v(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "getSession"

    .line 20
    .line 21
    invoke-static {p0, v3}, Li5;->v(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    filled-new-array {v0, v1, v2, p0}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const/4 v0, 0x0

    .line 30
    :goto_0
    const/4 v1, 0x4

    .line 31
    if-ge v0, v1, :cond_1

    .line 32
    .line 33
    aget-object v1, p0, v0

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method

.method public static h(Ljava/io/File;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 9

    .line 1
    if-eqz p1, :cond_9

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    move v1, v0

    .line 21
    move v2, v1

    .line 22
    :goto_0
    array-length v3, p0

    .line 23
    if-ge v1, v3, :cond_9

    .line 24
    .line 25
    const/16 v3, 0xa0

    .line 26
    .line 27
    if-ge v2, v3, :cond_9

    .line 28
    .line 29
    aget-object v3, p0, v1

    .line 30
    .line 31
    if-nez v3, :cond_2

    .line 32
    .line 33
    goto/16 :goto_3

    .line 34
    .line 35
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {p1, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v4, p2}, Li5;->i(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_8

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 73
    .line 74
    .line 75
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 76
    if-nez v4, :cond_4

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    :try_start_1
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    if-nez v3, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    move v4, v0

    .line 87
    move v5, v4

    .line 88
    :goto_1
    array-length v6, v3

    .line 89
    if-ge v4, v6, :cond_8

    .line 90
    .line 91
    const/16 v6, 0x50

    .line 92
    .line 93
    if-ge v5, v6, :cond_8

    .line 94
    .line 95
    aget-object v6, v3, v4

    .line 96
    .line 97
    if-eqz v6, :cond_7

    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_6

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 107
    .line 108
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    if-eqz v7, :cond_7

    .line 113
    .line 114
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 115
    .line 116
    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-virtual {p1, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    if-eqz v7, :cond_7

    .line 129
    .line 130
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-static {v6, p2}, Li5;->i(Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 135
    .line 136
    .line 137
    :cond_7
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :catchall_0
    :cond_8
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :catchall_1
    :cond_9
    :goto_4
    return-void
.end method

.method public static h0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Li5;->h1(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Li5;->S1(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    filled-new-array {v0, p0}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Li5;->s0([Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static h1(Ljava/lang/Object;)Ljava/lang/String;
    .locals 13

    .line 1
    const-string v11, "mName"

    .line 2
    .line 3
    const-string v12, "mNick"

    .line 4
    .line 5
    const-string v0, "remark"

    .line 6
    .line 7
    const-string v1, "remarkName"

    .line 8
    .line 9
    const-string v2, "name"

    .line 10
    .line 11
    const-string v3, "nick"

    .line 12
    .line 13
    const-string v4, "nickname"

    .line 14
    .line 15
    const-string v5, "displayName"

    .line 16
    .line 17
    const-string v6, "uinName"

    .line 18
    .line 19
    const-string v7, "contactName"

    .line 20
    .line 21
    const-string v8, "friendName"

    .line 22
    .line 23
    const-string v9, "friendNick"

    .line 24
    .line 25
    const-string v10, "buddyName"

    .line 26
    .line 27
    filled-new-array/range {v0 .. v12}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {p0, v0}, Li5;->c2(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v0, "getRemark"

    .line 36
    .line 37
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v0, "getRemarkName"

    .line 42
    .line 43
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const-string v0, "getName"

    .line 48
    .line 49
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    const-string v0, "getNick"

    .line 54
    .line 55
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    const-string v0, "getNickname"

    .line 60
    .line 61
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    const-string v0, "getDisplayName"

    .line 66
    .line 67
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    const-string v0, "getContactName"

    .line 72
    .line 73
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, Li5;->s0([Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method

.method public static h2(Landroid/content/Context;Ljava/io/InputStream;Ll8;)Ljava/io/File;
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    const-string v1, "tts cache unavailable"

    .line 7
    .line 8
    if-eqz p0, :cond_e

    .line 9
    .line 10
    new-instance v2, Ljava/io/File;

    .line 11
    .line 12
    const-string v3, "elaris_tts_voice"

    .line 13
    .line 14
    invoke-direct {v2, p0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v1}, Lu2;->c(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_1
    :goto_0
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_d

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/io/File;->canWrite()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_d

    .line 45
    .line 46
    invoke-static {v2, v0}, Li5;->r1(Ljava/io/File;Ljava/io/File;)V

    .line 47
    .line 48
    .line 49
    const-string p0, "Elaris-kk-tts-script-"

    .line 50
    .line 51
    const-string v1, ".silk"

    .line 52
    .line 53
    invoke-static {p0, v1, v2}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const/4 v1, 0x0

    .line 58
    :try_start_0
    new-instance v3, Ljava/io/FileOutputStream;

    .line 59
    .line 60
    invoke-direct {v3, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 61
    .line 62
    .line 63
    const/16 v4, 0x2000

    .line 64
    .line 65
    :try_start_1
    new-array v4, v4, [B

    .line 66
    .line 67
    const-wide/16 v5, 0x0

    .line 68
    .line 69
    :goto_1
    invoke-virtual {p2}, Ll8;->b()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v4}, Ljava/io/InputStream;->read([B)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-gez v7, :cond_9

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    .line 80
    .line 81
    const-wide/16 v7, 0x80

    .line 82
    .line 83
    cmp-long p2, v5, v7

    .line 84
    .line 85
    if-ltz p2, :cond_8

    .line 86
    .line 87
    :try_start_2
    new-instance p2, Ljava/io/FileInputStream;

    .line 88
    .line 89
    invoke-direct {p2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 90
    .line 91
    .line 92
    const/16 v0, 0xa

    .line 93
    .line 94
    :try_start_3
    new-array v4, v0, [B

    .line 95
    .line 96
    move v7, v1

    .line 97
    :goto_2
    if-ge v7, v0, :cond_4

    .line 98
    .line 99
    rsub-int/lit8 v8, v7, 0xa

    .line 100
    .line 101
    invoke-virtual {p2, v4, v7, v8}, Ljava/io/FileInputStream;->read([BII)I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-gez v8, :cond_2

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_2
    if-nez v8, :cond_3

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    add-int/2addr v7, v8

    .line 112
    goto :goto_2

    .line 113
    :catchall_0
    move-exception v0

    .line 114
    goto :goto_5

    .line 115
    :cond_4
    :goto_3
    if-lt v7, v0, :cond_7

    .line 116
    .line 117
    move v7, v1

    .line 118
    :goto_4
    sget-object v8, Li5;->f:[B

    .line 119
    .line 120
    if-ge v7, v0, :cond_5

    .line 121
    .line 122
    aget-byte v9, v4, v7

    .line 123
    .line 124
    aget-byte v8, v8, v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 125
    .line 126
    if-ne v9, v8, :cond_7

    .line 127
    .line 128
    add-int/lit8 v7, v7, 0x1

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_5
    :try_start_4
    invoke-static {p2}, Li5;->G(Ljava/io/Closeable;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v2, p0}, Li5;->r1(Ljava/io/File;Ljava/io/File;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    if-eqz p2, :cond_6

    .line 142
    .line 143
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 144
    .line 145
    .line 146
    move-result-wide v7

    .line 147
    cmp-long p2, v7, v5

    .line 148
    .line 149
    if-nez p2, :cond_6

    .line 150
    .line 151
    const/4 v1, 0x1

    .line 152
    new-instance p2, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string v0, "kk tts script silk downloaded bytes="

    .line 158
    .line 159
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    invoke-static {p2}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 170
    .line 171
    .line 172
    invoke-static {v3}, Li5;->G(Ljava/io/Closeable;)V

    .line 173
    .line 174
    .line 175
    invoke-static {p1}, Li5;->G(Ljava/io/Closeable;)V

    .line 176
    .line 177
    .line 178
    return-object p0

    .line 179
    :catchall_1
    move-exception p2

    .line 180
    move-object v0, v3

    .line 181
    goto :goto_6

    .line 182
    :cond_6
    :try_start_5
    new-instance p2, Ljava/io/IOException;

    .line 183
    .line 184
    const-string v0, "script silk cache unavailable"

    .line 185
    .line 186
    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 190
    :cond_7
    :try_start_6
    new-instance v0, Ljava/io/IOException;

    .line 191
    .line 192
    const-string v2, "script silk header invalid"

    .line 193
    .line 194
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 198
    :catchall_2
    move-exception p2

    .line 199
    move-object v10, v0

    .line 200
    move-object v0, p2

    .line 201
    move-object p2, v10

    .line 202
    :goto_5
    :try_start_7
    invoke-static {p2}, Li5;->G(Ljava/io/Closeable;)V

    .line 203
    .line 204
    .line 205
    throw v0

    .line 206
    :cond_8
    new-instance p2, Ln8;

    .line 207
    .line 208
    const-string v0, "script silk file empty"

    .line 209
    .line 210
    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw p2

    .line 214
    :cond_9
    if-nez v7, :cond_a

    .line 215
    .line 216
    goto/16 :goto_1

    .line 217
    .line 218
    :cond_a
    int-to-long v8, v7

    .line 219
    add-long/2addr v5, v8

    .line 220
    const-wide/32 v8, 0xc00000

    .line 221
    .line 222
    .line 223
    cmp-long v8, v5, v8

    .line 224
    .line 225
    if-gtz v8, :cond_b

    .line 226
    .line 227
    invoke-virtual {v3, v4, v1, v7}, Ljava/io/FileOutputStream;->write([BII)V

    .line 228
    .line 229
    .line 230
    goto/16 :goto_1

    .line 231
    .line 232
    :cond_b
    new-instance p2, Ljava/io/IOException;

    .line 233
    .line 234
    const-string v0, "script silk file too large"

    .line 235
    .line 236
    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 240
    :catchall_3
    move-exception p2

    .line 241
    :goto_6
    invoke-static {v0}, Li5;->G(Ljava/io/Closeable;)V

    .line 242
    .line 243
    .line 244
    invoke-static {p1}, Li5;->G(Ljava/io/Closeable;)V

    .line 245
    .line 246
    .line 247
    if-nez v1, :cond_c

    .line 248
    .line 249
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    if-eqz p1, :cond_c

    .line 254
    .line 255
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 256
    .line 257
    .line 258
    :cond_c
    throw p2

    .line 259
    :cond_d
    invoke-static {v1}, Lu2;->c(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    return-object v0

    .line 263
    :cond_e
    invoke-static {v1}, Lu2;->c(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    return-object v0
.end method

.method public static i(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

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
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method public static i0(Landroid/content/Context;[Ljava/lang/Class;I)[Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    new-array p0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    array-length v1, p1

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    :goto_0
    array-length v2, p1

    .line 11
    if-ge v0, v2, :cond_d

    .line 12
    .line 13
    aget-object v2, p1, v0

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    const-class v4, Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {v4, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_2

    .line 26
    .line 27
    aput-object p0, v1, v0

    .line 28
    .line 29
    goto :goto_6

    .line 30
    :cond_2
    const-string v4, "android.content.res.Resources"

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    goto :goto_6

    .line 49
    :cond_3
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    if-eq v2, v4, :cond_c

    .line 52
    .line 53
    const-class v4, Ljava/lang/Integer;

    .line 54
    .line 55
    if-ne v2, v4, :cond_4

    .line 56
    .line 57
    goto :goto_5

    .line 58
    :cond_4
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    if-eq v2, v4, :cond_b

    .line 61
    .line 62
    const-class v4, Ljava/lang/Boolean;

    .line 63
    .line 64
    if-ne v2, v4, :cond_5

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_5
    sget-object v4, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    if-eq v2, v4, :cond_a

    .line 70
    .line 71
    const-class v4, Ljava/lang/Float;

    .line 72
    .line 73
    if-ne v2, v4, :cond_6

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_6
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    if-eq v2, v4, :cond_9

    .line 79
    .line 80
    const-class v4, Ljava/lang/Long;

    .line 81
    .line 82
    if-ne v2, v4, :cond_7

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-nez v2, :cond_8

    .line 90
    .line 91
    aput-object v3, v1, v0

    .line 92
    .line 93
    goto :goto_6

    .line 94
    :cond_8
    :goto_1
    return-object v3

    .line 95
    :cond_9
    :goto_2
    int-to-long v2, p2

    .line 96
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    aput-object v2, v1, v0

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_a
    :goto_3
    int-to-float v2, p2

    .line 104
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    aput-object v2, v1, v0

    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_b
    :goto_4
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 112
    .line 113
    aput-object v2, v1, v0

    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_c
    :goto_5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    aput-object v2, v1, v0

    .line 121
    .line 122
    :goto_6
    add-int/lit8 v0, v0, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_d
    return-object v1
.end method

.method public static i1()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public static j(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    if-eq p0, v1, :cond_1

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    array-length v2, v1

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_1
    if-ge v3, v2, :cond_0

    .line 19
    .line 20
    aget-object v4, v1, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    :try_start_1
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    :catchall_0
    :try_start_2
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 27
    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catchall_1
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-object v0
.end method

.method public static j0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "emoId"

    .line 18
    .line 19
    invoke-static {v0, p0, v1}, Li5;->m(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, "path"

    .line 23
    .line 24
    invoke-static {v0, p0, v1}, Li5;->m(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v1, "resID"

    .line 28
    .line 29
    invoke-static {v0, p0, v1}, Li5;->m(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v1, "md5"

    .line 33
    .line 34
    invoke-static {v0, p0, v1}, Li5;->m(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, "epId"

    .line 38
    .line 39
    invoke-static {v0, p0, v1}, Li5;->m(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/16 v1, 0x104

    .line 51
    .line 52
    if-le v0, v1, :cond_0

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    :cond_0
    return-object p0
.end method

.method public static j1(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "yyyyMMdd-HHmmss"

    .line 4
    .line 5
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/util/Date;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/io/File;

    .line 20
    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p1, "-"

    .line 33
    .line 34
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {v1, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-nez p0, :cond_0

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_0

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_0
    const-string p0, "voice cache file failed"

    .line 72
    .line 73
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const/4 p0, 0x0

    .line 77
    return-object p0
.end method

.method public static k(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    if-eq p0, v1, :cond_1

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    array-length v2, v1

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_1
    if-ge v3, v2, :cond_0

    .line 19
    .line 20
    aget-object v4, v1, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    :try_start_1
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    :catchall_0
    :try_start_2
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 27
    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catchall_1
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-object v0
.end method

.method public static k0(Ll8;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Ljava/net/URL;

    .line 4
    .line 5
    const-string v2, "https://api-v2.yuafeng.cn/API/kktts.php?action=list"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "catalog"

    .line 11
    .line 12
    const/high16 v3, 0x200000

    .line 13
    .line 14
    invoke-static {v1, v3, p0, v2}, Li5;->z1(Ljava/net/URL;ILl8;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance v1, Lorg/json/JSONObject;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string p0, "code"

    .line 24
    .line 25
    const/4 v2, -0x1

    .line 26
    invoke-virtual {v1, p0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_6

    .line 31
    .line 32
    const-string p0, "list"

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_5

    .line 39
    .line 40
    new-instance v1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v2, Ljava/util/HashSet;

    .line 46
    .line 47
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-ge v3, v4, :cond_3

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    const/16 v5, 0x1f4

    .line 62
    .line 63
    if-ge v4, v5, :cond_3

    .line 64
    .line 65
    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    if-nez v4, :cond_0

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_0
    const-string v5, "id"

    .line 73
    .line 74
    invoke-virtual {v4, v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    const/16 v6, 0x80

    .line 79
    .line 80
    invoke-static {v5, v6}, Li5;->F1(Ljava/lang/String;I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    const-string v6, "name"

    .line 85
    .line 86
    invoke-virtual {v4, v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    const/16 v7, 0xa0

    .line 91
    .line 92
    invoke-static {v6, v7}, Li5;->F1(Ljava/lang/String;I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-static {v5}, Li5;->O0(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-eqz v7, :cond_2

    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-eqz v7, :cond_2

    .line 107
    .line 108
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-nez v7, :cond_1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    const-string v7, "category"

    .line 116
    .line 117
    const-string v8, "\u5176\u4ed6"

    .line 118
    .line 119
    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    const/16 v7, 0x50

    .line 124
    .line 125
    invoke-static {v4, v7}, Li5;->F1(Ljava/lang/String;I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    new-instance v7, Lb9;

    .line 130
    .line 131
    invoke-direct {v7, v5, v6, v4}, Lb9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_3
    invoke-static {v1}, Li5;->A1(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_4

    .line 149
    .line 150
    return-object p0

    .line 151
    :cond_4
    new-instance p0, Ljava/io/IOException;

    .line 152
    .line 153
    const-string v0, "tts catalog empty"

    .line 154
    .line 155
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p0

    .line 159
    :cond_5
    new-instance p0, Ljava/io/IOException;

    .line 160
    .line 161
    const-string v0, "tts catalog missing"

    .line 162
    .line 163
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p0

    .line 167
    :cond_6
    new-instance p0, Ljava/io/IOException;

    .line 168
    .line 169
    const-string v0, "tts catalog rejected"

    .line 170
    .line 171
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    :catchall_0
    move-exception p0

    .line 176
    new-instance v0, Ljava/io/IOException;

    .line 177
    .line 178
    const-string v1, "tts catalog invalid"

    .line 179
    .line 180
    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 181
    .line 182
    .line 183
    throw v0

    .line 184
    :catch_0
    move-exception p0

    .line 185
    throw p0
.end method

.method public static k1(Ljava/lang/String;Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 1

    .line 1
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/16 p0, 0x1388

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 18
    .line 19
    .line 20
    const/16 p0, 0x2ee0

    .line 21
    .line 22
    invoke-virtual {p1, p0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    invoke-virtual {p1, p0}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 27
    .line 28
    .line 29
    const-string p0, "Accept"

    .line 30
    .line 31
    const-string v0, "application/json,image/*;q=0.9,*/*;q=0.1"

    .line 32
    .line 33
    invoke-virtual {p1, p0, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object p1
.end method

.method public static l(Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "mqq.app.MobileQQ"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v2, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v1, "sMobileQQ"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 10
    .line 11
    :try_start_1
    invoke-static {p0, v1}, Li5;->o0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    :catchall_0
    move-object v1, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    :goto_0
    if-nez v1, :cond_3

    .line 24
    .line 25
    :try_start_2
    const-string v1, "getMobileQQ"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    :try_start_3
    invoke-static {p0, v1}, Li5;->q0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-virtual {v1, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 40
    goto :goto_2

    .line 41
    :catchall_1
    :cond_2
    :goto_1
    move-object v1, v0

    .line 42
    :cond_3
    :goto_2
    if-nez v1, :cond_6

    .line 43
    .line 44
    :try_start_4
    const-string v1, "getContext"
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 45
    .line 46
    if-eqz p0, :cond_5

    .line 47
    .line 48
    :try_start_5
    invoke-static {p0, v1}, Li5;->q0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-nez p0, :cond_4

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_4
    invoke-virtual {p0, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 59
    move-object v1, p0

    .line 60
    goto :goto_4

    .line 61
    :catchall_2
    :cond_5
    :goto_3
    move-object v1, v0

    .line 62
    :cond_6
    :goto_4
    if-nez v1, :cond_7

    .line 63
    .line 64
    goto :goto_5

    .line 65
    :cond_7
    :try_start_6
    const-string p0, "peekAppRuntime"

    .line 66
    .line 67
    filled-new-array {p0}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    aget-object p0, p0, v2

    .line 72
    .line 73
    invoke-static {v1, p0}, Li5;->v(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-eqz p0, :cond_8

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    const-string v2, "mAppRuntime"

    .line 85
    .line 86
    invoke-static {p0, v2}, Li5;->o0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-nez p0, :cond_9

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_9
    invoke-virtual {p0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 97
    :catchall_3
    :goto_5
    return-object v0
.end method

.method public static l0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-class v1, Ljava/lang/Object;

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public static l1(Ljava/net/URL;Ll8;)Ljava/net/HttpURLConnection;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ll8;->b()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ljava/net/HttpURLConnection;

    .line 9
    .line 10
    const-string v0, "GET"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/16 v0, 0x3a98

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 18
    .line 19
    .line 20
    const/16 v0, 0x7530

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "User-Agent"

    .line 33
    .line 34
    const-string v1, "Elaris-TTS"

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p1, Ll8;->b:Ljava/lang/Thread;

    .line 44
    .line 45
    iput-object p0, p1, Ll8;->c:Ljava/net/HttpURLConnection;

    .line 46
    .line 47
    invoke-virtual {p1}, Ll8;->b()V

    .line 48
    .line 49
    .line 50
    return-object p0
.end method

.method public static m(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Li5;->l0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/16 v0, 0x20

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/16 p2, 0x3d

    .line 17
    .line 18
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    const/16 v0, 0x50

    .line 30
    .line 31
    if-gt p2, v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p2, 0x0

    .line 35
    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static m0(Ljava/lang/String;)Lo4;
    .locals 8

    .line 1
    new-instance v0, Lo4;

    .line 2
    .line 3
    invoke-direct {v0}, Lo4;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_c

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_a

    .line 15
    .line 16
    :cond_0
    :try_start_0
    new-instance v1, Ljava/util/zip/ZipFile;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    move v2, p0

    .line 23
    :goto_0
    const/16 v3, 0x40

    .line 24
    .line 25
    if-ge v2, v3, :cond_b

    .line 26
    .line 27
    if-ne v2, p0, :cond_1

    .line 28
    .line 29
    :try_start_1
    const-string v3, "classes.dex"

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto/16 :goto_7

    .line 34
    .line 35
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v4, "classes"

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v4, ".dex"

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    :goto_1
    invoke-virtual {v1, v3}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 58
    .line 59
    .line 60
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    const/16 v3, 0x8

    .line 64
    .line 65
    if-le v2, v3, :cond_a

    .line 66
    .line 67
    goto/16 :goto_9

    .line 68
    .line 69
    :cond_2
    :try_start_2
    invoke-virtual {v1, v3}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 70
    .line 71
    .line 72
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 73
    :try_start_3
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    .line 74
    .line 75
    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 76
    .line 77
    .line 78
    const/16 v5, 0x4000

    .line 79
    .line 80
    new-array v5, v5, [B

    .line 81
    .line 82
    :goto_2
    invoke-virtual {v3, v5}, Ljava/io/InputStream;->read([B)I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    const/4 v7, 0x0

    .line 87
    if-lez v6, :cond_3

    .line 88
    .line 89
    invoke-virtual {v4, v5, v7, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    array-length v5, v4

    .line 98
    const/16 v6, 0x70

    .line 99
    .line 100
    if-lt v5, v6, :cond_8

    .line 101
    .line 102
    aget-byte v5, v4, v7

    .line 103
    .line 104
    const/16 v6, 0x64

    .line 105
    .line 106
    if-ne v5, v6, :cond_8

    .line 107
    .line 108
    aget-byte v5, v4, p0

    .line 109
    .line 110
    const/16 v6, 0x65

    .line 111
    .line 112
    if-ne v5, v6, :cond_8

    .line 113
    .line 114
    const/4 v5, 0x2

    .line 115
    aget-byte v5, v4, v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 116
    .line 117
    const/16 v6, 0x78

    .line 118
    .line 119
    if-eq v5, v6, :cond_4

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_4
    :try_start_4
    new-instance v5, Lz9;

    .line 123
    .line 124
    invoke-direct {v5, v4}, Lz9;-><init>([B)V

    .line 125
    .line 126
    .line 127
    const-string v4, "Lcom/tencent/qqnt/chats/view/MiniOldStyleHeaderNew;"

    .line 128
    .line 129
    invoke-virtual {v5, v4}, Lz9;->m(Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-ltz v4, :cond_5

    .line 134
    .line 135
    iget-object v6, v0, Lo4;->a:Ljava/lang/String;

    .line 136
    .line 137
    if-nez v6, :cond_5

    .line 138
    .line 139
    new-instance v6, Ly;

    .line 140
    .line 141
    invoke-direct {v6, v5, v0}, Ly;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5, v4, v6}, Lz9;->e(ILba;)V

    .line 145
    .line 146
    .line 147
    :cond_5
    const-string v4, "Lcom/tencent/mobileqq/activity/home/Conversation;"

    .line 148
    .line 149
    invoke-virtual {v5, v4}, Lz9;->m(Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-ltz v4, :cond_6

    .line 154
    .line 155
    invoke-virtual {v5, v4, v0}, Lz9;->j(ILo4;)V

    .line 156
    .line 157
    .line 158
    :cond_6
    const-string v4, "Lcom/tencent/mobileqq/activity/Conversation;"

    .line 159
    .line 160
    invoke-virtual {v5, v4}, Lz9;->m(Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-ltz v4, :cond_7

    .line 165
    .line 166
    invoke-virtual {v5, v4, v0}, Lz9;->j(ILo4;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 167
    .line 168
    .line 169
    :catchall_1
    :cond_7
    :try_start_5
    iget-object v4, v0, Lo4;->a:Ljava/lang/String;

    .line 170
    .line 171
    if-eqz v4, :cond_8

    .line 172
    .line 173
    iget-object v4, v0, Lo4;->c:Ljava/io/Serializable;

    .line 174
    .line 175
    check-cast v4, Ljava/util/HashSet;

    .line 176
    .line 177
    invoke-virtual {v4}, Ljava/util/HashSet;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 181
    if-nez v4, :cond_8

    .line 182
    .line 183
    :try_start_6
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 184
    .line 185
    .line 186
    goto :goto_9

    .line 187
    :catchall_2
    move-exception v4

    .line 188
    goto :goto_4

    .line 189
    :cond_8
    :goto_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 190
    .line 191
    .line 192
    goto :goto_6

    .line 193
    :goto_4
    if-eqz v3, :cond_9

    .line 194
    .line 195
    :try_start_7
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :catchall_3
    move-exception v3

    .line 200
    :try_start_8
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 201
    .line 202
    .line 203
    :cond_9
    :goto_5
    throw v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 204
    :catchall_4
    :cond_a
    :goto_6
    add-int/lit8 v2, v2, 0x1

    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :goto_7
    :try_start_9
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 209
    .line 210
    .line 211
    goto :goto_8

    .line 212
    :catchall_5
    move-exception v1

    .line 213
    :try_start_a
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    :goto_8
    throw p0

    .line 217
    :cond_b
    :goto_9
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 218
    .line 219
    .line 220
    :catchall_6
    :cond_c
    :goto_a
    return-object v0
.end method

.method public static m1(Landroid/content/Context;)Landroid/widget/LinearLayout;
    .locals 5

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    const/high16 v1, 0x41900000    # 18.0f

    .line 11
    .line 12
    invoke-static {p0, v1}, Li5;->a0(Landroid/content/Context;F)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/high16 v3, 0x41800000    # 16.0f

    .line 17
    .line 18
    invoke-static {p0, v3}, Li5;->a0(Landroid/content/Context;F)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-static {p0, v1}, Li5;->a0(Landroid/content/Context;F)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/high16 v4, 0x41600000    # 14.0f

    .line 27
    .line 28
    invoke-static {p0, v4}, Li5;->a0(Landroid/content/Context;F)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Lu9;->y(Landroid/content/Context;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    const v2, -0xb3aea2

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const v2, -0x17130e

    .line 50
    .line 51
    .line 52
    :goto_0
    const/high16 v3, 0x41c00000    # 24.0f

    .line 53
    .line 54
    invoke-static {p0, v1, v2, v3}, Li5;->D1(Landroid/content/Context;IIF)Landroid/graphics/drawable/GradientDrawable;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method

.method public static n(Landroid/app/Activity;Landroid/app/Dialog;F)V
    .locals 3

    .line 1
    const/high16 v0, 0x43870000    # 270.0f

    .line 2
    .line 3
    invoke-static {p0, v0}, Li5;->a0(Landroid/content/Context;F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p0, p2}, Li5;->a0(Landroid/content/Context;F)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 20
    .line 21
    const/high16 v2, 0x42200000    # 40.0f

    .line 22
    .line 23
    invoke-static {p0, v2}, Li5;->a0(Landroid/content/Context;F)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    sub-int/2addr v1, p0

    .line 28
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p1, p0}, Li5;->o(Landroid/app/Dialog;I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static n0(Landroid/view/View;Lh4;I)V
    .locals 6

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    if-le p2, v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :catchall_0
    :cond_1
    instance-of v0, p0, Landroid/widget/ImageView;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    move-object v0, p0

    .line 21
    check-cast v0, Landroid/widget/ImageView;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    invoke-static {v0, v2}, Li5;->e2(Landroid/view/View;Z)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    invoke-static {v0, v1}, Li5;->e2(Landroid/view/View;Z)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    mul-int/2addr v3, v4

    .line 62
    iget v4, p1, Lh4;->a:I

    .line 63
    .line 64
    if-le v3, v4, :cond_2

    .line 65
    .line 66
    iput-object v0, p1, Lh4;->b:Ljava/lang/Object;

    .line 67
    .line 68
    iput v3, p1, Lh4;->a:I

    .line 69
    .line 70
    :cond_2
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 71
    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    check-cast p0, Landroid/view/ViewGroup;

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    const/16 v3, 0x18

    .line 82
    .line 83
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    :goto_0
    if-ge v1, v0, :cond_4

    .line 88
    .line 89
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    add-int/lit8 v4, p2, 0x1

    .line 94
    .line 95
    invoke-static {v3, p1, v4}, Li5;->n0(Landroid/view/View;Lh4;I)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 v1, v1, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    :goto_1
    return-void
.end method

.method public static n1(Ljava/lang/String;Z)Ljava/util/LinkedHashSet;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    sget-object v2, Li5;->d:[I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz p0, :cond_4

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v4, "[^0-9]+"

    .line 28
    .line 29
    invoke-virtual {p0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    array-length v4, p0

    .line 34
    move v5, v3

    .line 35
    :goto_0
    if-ge v5, v4, :cond_4

    .line 36
    .line 37
    aget-object v6, p0, v5

    .line 38
    .line 39
    if-eqz v6, :cond_3

    .line 40
    .line 41
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-nez v7, :cond_1

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    :try_start_0
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    move v7, v3

    .line 53
    :goto_1
    if-ge v7, v1, :cond_3

    .line 54
    .line 55
    aget v8, v2, v7

    .line 56
    .line 57
    if-ne v8, v6, :cond_2

    .line 58
    .line 59
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v0, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catch_0
    :cond_3
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    :goto_3
    if-eqz p1, :cond_8

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_5

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_5
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 83
    .line 84
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 85
    .line 86
    .line 87
    :goto_4
    if-ge v3, v1, :cond_7

    .line 88
    .line 89
    aget p1, v2, v3

    .line 90
    .line 91
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_6

    .line 100
    .line 101
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_7
    return-object p0

    .line 108
    :cond_8
    :goto_5
    return-object v0
.end method

.method public static o(Landroid/app/Dialog;I)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const v0, 0x106000d

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 12
    .line 13
    .line 14
    const/16 v0, 0x11

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/Window;->setGravity(I)V

    .line 17
    .line 18
    .line 19
    const/16 v1, 0x10

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput p1, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 29
    .line 30
    const/4 p1, -0x2

    .line 31
    iput p1, v1, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 32
    .line 33
    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 37
    .line 38
    const v0, 0x3ecccccd    # 0.4f

    .line 39
    .line 40
    .line 41
    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 44
    .line 45
    .line 46
    iget v0, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 47
    .line 48
    invoke-virtual {p0, v0, p1}, Landroid/view/Window;->setLayout(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :catchall_0
    :goto_0
    return-void
.end method

.method public static o0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    :goto_0
    if-eqz p0, :cond_1

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :catchall_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    :goto_1
    return-object v0
.end method

.method public static o1(Ljava/lang/Object;Ljava/util/LinkedHashMap;)V
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/util/Map;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p0, Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v1, v0, Ljava/util/Map$Entry;

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    check-cast v0, Ljava/util/Map$Entry;

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Li5;->B(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Li5;->h0(Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v1}, Li5;->H0(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-lez v2, :cond_0

    .line 59
    .line 60
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    instance-of v0, p0, Ljava/lang/Iterable;

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    check-cast p0, Ljava/lang/Iterable;

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0}, Li5;->t0(Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {v1}, Li5;->B(Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v0}, Li5;->h0(Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v1}, Li5;->H0(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_3

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-lez v2, :cond_3

    .line 107
    .line 108
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_4
    return-void
.end method

.method public static p(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-nez p0, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static varargs p0(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/HashSet;
    .locals 11

    .line 1
    new-instance v5, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_c

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_c

    .line 13
    .line 14
    array-length v0, p2

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_c

    .line 18
    .line 19
    :cond_0
    :try_start_0
    new-instance v6, Ljava/util/zip/ZipFile;

    .line 20
    .line 21
    invoke-direct {v6, p0}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 22
    .line 23
    .line 24
    :try_start_1
    new-instance v4, Ljava/util/HashSet;

    .line 25
    .line 26
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    move v7, p0

    .line 31
    :goto_0
    const/16 v0, 0x40

    .line 32
    .line 33
    if-ge v7, v0, :cond_b

    .line 34
    .line 35
    if-ne v7, p0, :cond_1

    .line 36
    .line 37
    const-string v0, "classes.dex"

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p0, v0

    .line 42
    goto/16 :goto_a

    .line 43
    .line 44
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v1, "classes"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ".dex"

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_1
    invoke-virtual {v6, v0}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 67
    .line 68
    .line 69
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    const/16 v0, 0x8

    .line 73
    .line 74
    if-le v7, v0, :cond_2

    .line 75
    .line 76
    goto/16 :goto_9

    .line 77
    .line 78
    :catchall_1
    :cond_2
    move-object v2, p2

    .line 79
    goto/16 :goto_8

    .line 80
    .line 81
    :cond_3
    :try_start_2
    invoke-virtual {v6, v0}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 82
    .line 83
    .line 84
    move-result-object v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 85
    :try_start_3
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 88
    .line 89
    .line 90
    const/16 v1, 0x4000

    .line 91
    .line 92
    new-array v1, v1, [B

    .line 93
    .line 94
    :goto_2
    invoke-virtual {v8, v1}, Ljava/io/InputStream;->read([B)I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    const/4 v3, 0x0

    .line 99
    if-lez v2, :cond_4

    .line 100
    .line 101
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    array-length v1, v0

    .line 110
    const/16 v2, 0x70

    .line 111
    .line 112
    if-lt v1, v2, :cond_9

    .line 113
    .line 114
    aget-byte v1, v0, v3

    .line 115
    .line 116
    const/16 v2, 0x64

    .line 117
    .line 118
    if-ne v1, v2, :cond_9

    .line 119
    .line 120
    aget-byte v1, v0, p0

    .line 121
    .line 122
    const/16 v2, 0x65

    .line 123
    .line 124
    if-ne v1, v2, :cond_9

    .line 125
    .line 126
    const/4 v1, 0x2

    .line 127
    aget-byte v1, v0, v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 128
    .line 129
    const/16 v2, 0x78

    .line 130
    .line 131
    if-eq v1, v2, :cond_5

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_5
    :try_start_4
    new-instance v1, Lz9;

    .line 135
    .line 136
    invoke-direct {v1, v0}, Lz9;-><init>([B)V

    .line 137
    .line 138
    .line 139
    array-length v0, p2

    .line 140
    if-nez v0, :cond_6

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_6
    move v9, v3

    .line 144
    :goto_3
    iget v0, v1, Lz9;->i:I

    .line 145
    .line 146
    if-ge v9, v0, :cond_9

    .line 147
    .line 148
    iget v0, v1, Lz9;->j:I

    .line 149
    .line 150
    mul-int/lit8 v2, v9, 0x20

    .line 151
    .line 152
    add-int/2addr v2, v0

    .line 153
    invoke-virtual {v1, v2}, Lz9;->o(I)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    invoke-virtual {v1, v0}, Lz9;->l(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-nez v0, :cond_7

    .line 166
    .line 167
    :goto_4
    move-object v2, p2

    .line 168
    goto :goto_5

    .line 169
    :cond_7
    add-int/lit8 v2, v2, 0x18

    .line 170
    .line 171
    invoke-virtual {v1, v2}, Lz9;->o(I)I

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    if-gtz v10, :cond_8

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_8
    new-instance v0, Lw6;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 179
    .line 180
    move-object v2, p2

    .line 181
    :try_start_5
    invoke-direct/range {v0 .. v5}, Lw6;-><init>(Lz9;[Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;Ljava/util/HashSet;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v10, v0}, Lz9;->g(ILba;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 185
    .line 186
    .line 187
    :goto_5
    add-int/lit8 v9, v9, 0x1

    .line 188
    .line 189
    move-object p2, v2

    .line 190
    goto :goto_3

    .line 191
    :catchall_2
    :cond_9
    :goto_6
    move-object v2, p2

    .line 192
    :catchall_3
    :try_start_6
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 193
    .line 194
    .line 195
    goto :goto_8

    .line 196
    :catchall_4
    move-exception v0

    .line 197
    move-object v2, p2

    .line 198
    move-object p2, v0

    .line 199
    if-eqz v8, :cond_a

    .line 200
    .line 201
    :try_start_7
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 202
    .line 203
    .line 204
    goto :goto_7

    .line 205
    :catchall_5
    move-exception v0

    .line 206
    :try_start_8
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    :cond_a
    :goto_7
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 210
    :catchall_6
    :goto_8
    add-int/lit8 v7, v7, 0x1

    .line 211
    .line 212
    move-object p2, v2

    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_b
    :goto_9
    :try_start_9
    invoke-virtual {v6}, Ljava/util/zip/ZipFile;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 216
    .line 217
    .line 218
    goto :goto_c

    .line 219
    :goto_a
    :try_start_a
    invoke-virtual {v6}, Ljava/util/zip/ZipFile;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 220
    .line 221
    .line 222
    goto :goto_b

    .line 223
    :catchall_7
    move-exception v0

    .line 224
    move-object p1, v0

    .line 225
    :try_start_b
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 226
    .line 227
    .line 228
    :goto_b
    throw p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 229
    :catchall_8
    :cond_c
    :goto_c
    return-object v5
.end method

.method public static p1(Ljava/lang/String;)J
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, -0x1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-wide v1

    .line 10
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-wide v0

    .line 15
    :catch_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_1
    const-string v0, "\u96f6"

    .line 23
    .line 24
    const-string v3, ""

    .line 25
    .line 26
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string v0, "\u3007"

    .line 31
    .line 32
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const/16 v0, 0x5341

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-ltz v0, :cond_5

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    const-wide/16 v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 v3, 0x0

    .line 50
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v3}, Li5;->z(Ljava/lang/String;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v3

    .line 58
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    add-int/lit8 v5, v5, -0x1

    .line 63
    .line 64
    const-wide/16 v6, 0x0

    .line 65
    .line 66
    if-ne v0, v5, :cond_3

    .line 67
    .line 68
    move-wide v8, v6

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p0}, Li5;->z(Ljava/lang/String;)J

    .line 77
    .line 78
    .line 79
    move-result-wide v8

    .line 80
    :goto_1
    cmp-long p0, v3, v6

    .line 81
    .line 82
    if-ltz p0, :cond_6

    .line 83
    .line 84
    cmp-long p0, v8, v6

    .line 85
    .line 86
    if-gez p0, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    const-wide/16 v0, 0xa

    .line 90
    .line 91
    mul-long/2addr v3, v0

    .line 92
    add-long v1, v3, v8

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    invoke-static {p0}, Li5;->z(Ljava/lang/String;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v1

    .line 99
    :cond_6
    :goto_2
    return-wide v1
.end method

.method public static q(Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, Li5;->k(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :catchall_0
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_b

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/reflect/Method;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const/4 v4, 0x1

    .line 54
    :try_start_0
    invoke-virtual {v2, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 55
    .line 56
    .line 57
    array-length v5, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    const-class v6, Ljava/lang/String;

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    if-ne v5, v4, :cond_5

    .line 62
    .line 63
    :try_start_1
    aget-object v5, v3, v7

    .line 64
    .line 65
    if-ne v5, v6, :cond_5

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_4

    .line 76
    .line 77
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    check-cast v4, Ljava/lang/String;

    .line 82
    .line 83
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v2, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-static {v5}, Li5;->h0(Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-lez v6, :cond_3

    .line 100
    .line 101
    invoke-virtual {v0, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-nez v2, :cond_1

    .line 110
    .line 111
    goto/16 :goto_4

    .line 112
    .line 113
    :cond_5
    array-length v5, v3

    .line 114
    if-ne v5, v4, :cond_7

    .line 115
    .line 116
    const-class v5, Ljava/util/Collection;

    .line 117
    .line 118
    aget-object v8, v3, v7

    .line 119
    .line 120
    invoke-virtual {v5, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-nez v5, :cond_6

    .line 125
    .line 126
    const-class v5, Ljava/lang/Iterable;

    .line 127
    .line 128
    aget-object v8, v3, v7

    .line 129
    .line 130
    invoke-virtual {v5, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-nez v5, :cond_6

    .line 135
    .line 136
    const-class v5, Ljava/util/List;

    .line 137
    .line 138
    aget-object v8, v3, v7

    .line 139
    .line 140
    invoke-virtual {v5, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_7

    .line 145
    .line 146
    :cond_6
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v2, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-static {v2, v0}, Li5;->o1(Ljava/lang/Object;Ljava/util/LinkedHashMap;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-nez v2, :cond_1

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_7
    array-length v5, v3

    .line 165
    const/4 v8, 0x2

    .line 166
    if-ne v5, v8, :cond_1

    .line 167
    .line 168
    aget-object v5, v3, v7

    .line 169
    .line 170
    if-ne v5, v6, :cond_1

    .line 171
    .line 172
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    :cond_8
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    if-eqz v7, :cond_a

    .line 181
    .line 182
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    check-cast v7, Ljava/lang/String;

    .line 187
    .line 188
    aget-object v8, v3, v4

    .line 189
    .line 190
    if-ne v8, v6, :cond_9

    .line 191
    .line 192
    const-string v8, ""

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_9
    invoke-static {v8}, Li5;->T(Ljava/lang/Class;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    :goto_3
    filled-new-array {v7, v8}, [Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    invoke-virtual {v2, p0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    invoke-static {v8}, Li5;->h0(Ljava/lang/Object;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 212
    .line 213
    .line 214
    move-result v9

    .line 215
    if-lez v9, :cond_8

    .line 216
    .line 217
    invoke-virtual {v0, v7, v8}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_a
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 222
    .line 223
    .line 224
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 225
    if-nez v2, :cond_1

    .line 226
    .line 227
    :cond_b
    :goto_4
    return-object v0
.end method

.method public static q0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 2

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p0}, Li5;->k(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/reflect/Method;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    array-length v1, v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method

.method public static q1(Landroid/view/View;I)Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    if-lez p1, :cond_1

    .line 5
    .line 6
    invoke-static {p0, p1}, Li5;->J0(Landroid/view/View;I)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, Lh4;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {p0, v1, v2}, Li5;->n0(Landroid/view/View;Lh4;I)V

    .line 20
    .line 21
    .line 22
    iget-object p0, v1, Lh4;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Landroid/widget/ImageView;

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0, p1}, Li5;->c0(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/Bitmap;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-static {p0}, Li5;->I0(Landroid/graphics/Bitmap;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    const-string v1, "https://api-v2.yuafeng.cn/API/kktts.php?action=voice&content="

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    move-object p0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    if-nez p0, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :goto_1
    const/4 v3, 0x0

    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_2

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->codePointCount(II)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    :cond_3
    :goto_2
    const/4 v2, 0x0

    .line 41
    if-lez v3, :cond_5

    .line 42
    .line 43
    const/16 v4, 0xc8

    .line 44
    .line 45
    if-gt v3, v4, :cond_5

    .line 46
    .line 47
    invoke-static {p1}, Li5;->O0(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_4

    .line 52
    .line 53
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p0, "&voice_id="

    .line 66
    .line 67
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    return-object p0

    .line 82
    :catchall_0
    move-exception p0

    .line 83
    new-instance p1, Ljava/io/IOException;

    .line 84
    .line 85
    const-string v0, "tts request encoding failed"

    .line 86
    .line 87
    invoke-direct {p1, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :cond_4
    const-string p0, "tts voice invalid"

    .line 92
    .line 93
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object v2

    .line 97
    :cond_5
    const-string p0, "tts text invalid"

    .line 98
    .line 99
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object v2
.end method

.method public static r0(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/util/LinkedHashMap;)Ljava/util/ArrayList;
    .locals 17

    .line 1
    invoke-virtual/range {p2 .. p2}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :cond_0
    move-object/from16 v3, p2

    .line 8
    .line 9
    goto/16 :goto_7

    .line 10
    .line 11
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual/range {p2 .. p2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lh5;

    .line 35
    .line 36
    if-eqz v1, :cond_c

    .line 37
    .line 38
    iget-object v2, v1, Lh5;->a:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, v1, Lh5;->c:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-gtz v3, :cond_c

    .line 47
    .line 48
    const-string v3, "u_"

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    const-string v4, ""

    .line 62
    .line 63
    if-nez v3, :cond_4

    .line 64
    .line 65
    :cond_3
    move-object/from16 v9, p0

    .line 66
    .line 67
    goto/16 :goto_6

    .line 68
    .line 69
    :cond_4
    const-string v3, "com.tencent.qqnt.ntrelation.friendsinfo.api.IFriendsInfoService"

    .line 70
    .line 71
    const-string v5, "com.tencent.qqnt.ntrelation.friendsinfo.api.IQQFriendsInfoApi"

    .line 72
    .line 73
    const-string v6, "com.tencent.relation.common.api.IRelationNTUinAndUidApi"

    .line 74
    .line 75
    filled-new-array {v6, v3, v5}, [Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    const-string v5, "getUin"

    .line 80
    .line 81
    const-string v6, "getFriendUinFromUid"

    .line 82
    .line 83
    const-string v7, "getUinFromUid"

    .line 84
    .line 85
    const-string v8, "getUinByUid"

    .line 86
    .line 87
    filled-new-array {v7, v8, v5, v6}, [Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    const/4 v7, 0x0

    .line 92
    :goto_1
    const/4 v8, 0x3

    .line 93
    if-ge v7, v8, :cond_3

    .line 94
    .line 95
    aget-object v8, v3, v7

    .line 96
    .line 97
    move-object/from16 v9, p0

    .line 98
    .line 99
    invoke-static {v9, v8}, Li5;->t1(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    if-nez v8, :cond_6

    .line 104
    .line 105
    :cond_5
    const/16 v16, 0x0

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_6
    const/4 v10, 0x0

    .line 109
    :goto_2
    const/4 v11, 0x4

    .line 110
    if-ge v10, v11, :cond_5

    .line 111
    .line 112
    aget-object v11, v5, v10

    .line 113
    .line 114
    if-nez v11, :cond_7

    .line 115
    .line 116
    const/4 v12, 0x0

    .line 117
    const/16 v16, 0x0

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_7
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    invoke-static {v13}, Li5;->k(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    :catchall_0
    :cond_8
    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v14

    .line 136
    if-eqz v14, :cond_a

    .line 137
    .line 138
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v14

    .line 142
    check-cast v14, Ljava/lang/reflect/Method;

    .line 143
    .line 144
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v15

    .line 148
    const/16 v16, 0x0

    .line 149
    .line 150
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    if-eqz v6, :cond_8

    .line 159
    .line 160
    array-length v6, v15

    .line 161
    const/4 v12, 0x1

    .line 162
    if-ne v6, v12, :cond_8

    .line 163
    .line 164
    aget-object v6, v15, v16

    .line 165
    .line 166
    const-class v15, Ljava/lang/String;

    .line 167
    .line 168
    if-eq v6, v15, :cond_9

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_9
    :try_start_0
    invoke-virtual {v14, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 172
    .line 173
    .line 174
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-virtual {v14, v8, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    goto :goto_4

    .line 183
    :cond_a
    const/16 v16, 0x0

    .line 184
    .line 185
    const/4 v12, 0x0

    .line 186
    :goto_4
    invoke-static {v12}, Li5;->C(Ljava/lang/Object;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 191
    .line 192
    .line 193
    move-result v11

    .line 194
    if-lez v11, :cond_b

    .line 195
    .line 196
    move-object v4, v6

    .line 197
    goto :goto_6

    .line 198
    :cond_b
    add-int/lit8 v10, v10, 0x1

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :goto_5
    add-int/lit8 v7, v7, 0x1

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :goto_6
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-lez v3, :cond_d

    .line 209
    .line 210
    iget-object v1, v1, Lh5;->b:Ljava/lang/String;

    .line 211
    .line 212
    move-object/from16 v3, p2

    .line 213
    .line 214
    invoke-static {v3, v2, v1, v4}, Li5;->s1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_c
    move-object/from16 v9, p0

    .line 220
    .line 221
    :cond_d
    move-object/from16 v3, p2

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :goto_7
    const-string v0, "debug_log"

    .line 226
    .line 227
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_e

    .line 232
    .line 233
    const-string v0, "friend-list loaded source="

    .line 234
    .line 235
    const-string v1, ", count="

    .line 236
    .line 237
    move-object/from16 v2, p1

    .line 238
    .line 239
    invoke-static {v0, v2, v1}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {v3}, Ljava/util/AbstractMap;->size()I

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    :cond_e
    new-instance v0, Ljava/util/ArrayList;

    .line 258
    .line 259
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 264
    .line 265
    .line 266
    sput-object v0, Li5;->c:Ljava/util/ArrayList;

    .line 267
    .line 268
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 269
    .line 270
    .line 271
    move-result-wide v1

    .line 272
    sput-wide v1, Li5;->b:J

    .line 273
    .line 274
    new-instance v1, Ljava/util/ArrayList;

    .line 275
    .line 276
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 277
    .line 278
    .line 279
    return-object v1
.end method

.method public static r1(Ljava/io/File;Ljava/io/File;)V
    .locals 11

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    const-wide/32 v3, 0x5265c00

    .line 17
    .line 18
    .line 19
    sub-long/2addr v1, v3

    .line 20
    array-length v3, v0

    .line 21
    const/4 v4, 0x0

    .line 22
    move v5, v4

    .line 23
    :goto_0
    if-ge v5, v3, :cond_2

    .line 24
    .line 25
    aget-object v6, v0, v5

    .line 26
    .line 27
    if-eqz v6, :cond_1

    .line 28
    .line 29
    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-eqz v7, :cond_1

    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/io/File;->lastModified()J

    .line 36
    .line 37
    .line 38
    move-result-wide v7

    .line 39
    cmp-long v7, v7, v1

    .line 40
    .line 41
    if-gez v7, :cond_1

    .line 42
    .line 43
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_8

    .line 54
    .line 55
    array-length v0, p0

    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_3
    new-instance v0, Lm8;

    .line 60
    .line 61
    invoke-direct {v0, p1}, Lm8;-><init>(Ljava/io/File;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 65
    .line 66
    .line 67
    array-length p1, p0

    .line 68
    const-wide/16 v0, 0x0

    .line 69
    .line 70
    move-wide v5, v0

    .line 71
    move v2, v4

    .line 72
    :goto_1
    if-ge v4, p1, :cond_8

    .line 73
    .line 74
    aget-object v3, p0, v4

    .line 75
    .line 76
    if-eqz v3, :cond_7

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-nez v7, :cond_4

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 86
    .line 87
    .line 88
    move-result-wide v7

    .line 89
    invoke-static {v0, v1, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 90
    .line 91
    .line 92
    move-result-wide v7

    .line 93
    const/16 v9, 0x18

    .line 94
    .line 95
    if-ge v2, v9, :cond_6

    .line 96
    .line 97
    add-long/2addr v7, v5

    .line 98
    const-wide/32 v9, 0x3000000

    .line 99
    .line 100
    .line 101
    cmp-long v9, v7, v9

    .line 102
    .line 103
    if-lez v9, :cond_5

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 107
    .line 108
    move-wide v5, v7

    .line 109
    goto :goto_3

    .line 110
    :cond_6
    :goto_2
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    :cond_7
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_8
    :goto_4
    return-void

    .line 117
    :catchall_0
    move-exception p0

    .line 118
    const-string p1, "kk-tts"

    .line 119
    .line 120
    const-string v0, "cache-prune"

    .line 121
    .line 122
    invoke-static {p1, v0, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public static s(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "https://oiapi.net/API/Mp32Silk?url="

    .line 2
    .line 3
    invoke-static {p0}, Li5;->A0(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "UTF-8"

    .line 15
    .line 16
    invoke-static {p0, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    return-object p0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    new-instance v0, Ljava/io/IOException;

    .line 30
    .line 31
    const-string v1, "script silk request encoding failed"

    .line 32
    .line 33
    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_0
    const-string p0, "tts audio url rejected"

    .line 38
    .line 39
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public static varargs s0([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    .line 5
    aget-object v2, p0, v1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-lez v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const-string p0, ""

    .line 28
    .line 29
    return-object p0
.end method

.method public static s1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1}, Li5;->B(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Li5;->H0(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    const-string v0, ""

    .line 14
    .line 15
    if-nez p2, :cond_1

    .line 16
    .line 17
    move-object p2, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    invoke-static {p2}, Li5;->B(Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_5

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const-string v1, "UID "

    .line 48
    .line 49
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_4

    .line 54
    .line 55
    invoke-static {p1}, Li5;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    move-object v0, p2

    .line 67
    :cond_5
    :goto_1
    invoke-static {p3}, Li5;->C(Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    check-cast p3, Lh5;

    .line 76
    .line 77
    if-nez p3, :cond_7

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    if-nez p3, :cond_6

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_6
    new-instance p3, Lh5;

    .line 87
    .line 88
    invoke-direct {p3, p1, v0, p2}, Lh5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_7
    iget-object v1, p3, Lh5;->c:Ljava/lang/String;

    .line 96
    .line 97
    iget-object p3, p3, Lh5;->b:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_8

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-gtz v2, :cond_9

    .line 110
    .line 111
    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_c

    .line 116
    .line 117
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-lez v2, :cond_c

    .line 122
    .line 123
    :cond_9
    new-instance v2, Lh5;

    .line 124
    .line 125
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-lez v3, :cond_a

    .line 130
    .line 131
    move-object v0, p3

    .line 132
    :cond_a
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 133
    .line 134
    .line 135
    move-result p3

    .line 136
    if-lez p3, :cond_b

    .line 137
    .line 138
    move-object p2, v1

    .line 139
    :cond_b
    invoke-direct {v2, p1, v0, p2}, Lh5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {p0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    :cond_c
    :goto_2
    return-void
.end method

.method public static t(Landroid/content/Context;Ljava/lang/String;Z)Landroid/widget/TextView;
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p0}, Lu9;->c(Landroid/content/Context;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :goto_0
    const/high16 v1, 0x41600000    # 14.0f

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-static {p0, p1, v1, v0, v2}, Li5;->U1(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/16 v0, 0x11

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 22
    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    invoke-static {p0}, Lu9;->c(Landroid/content/Context;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    const v0, -0xdcd3c5

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const v0, -0x90501

    .line 42
    .line 43
    .line 44
    :goto_1
    if-eqz p2, :cond_3

    .line 45
    .line 46
    invoke-static {p0}, Lu9;->c(Landroid/content/Context;)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    goto :goto_2

    .line 51
    :cond_3
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_4

    .line 56
    .line 57
    const p2, -0xcaad89

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    const p2, -0x3b2709

    .line 62
    .line 63
    .line 64
    :goto_2
    const/high16 v1, 0x41a00000    # 20.0f

    .line 65
    .line 66
    invoke-static {p0, v0, p2, v1}, Li5;->D1(Landroid/content/Context;IIF)Landroid/graphics/drawable/GradientDrawable;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 71
    .line 72
    .line 73
    return-object p1
.end method

.method public static t0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 12

    .line 1
    const-string v10, "contactId"

    .line 2
    .line 3
    const-string v11, "uinId"

    .line 4
    .line 5
    const-string v0, "uid"

    .line 6
    .line 7
    const-string v1, "peerUid"

    .line 8
    .line 9
    const-string v2, "friendUid"

    .line 10
    .line 11
    const-string v3, "buddyUid"

    .line 12
    .line 13
    const-string v4, "uin"

    .line 14
    .line 15
    const-string v5, "friendUin"

    .line 16
    .line 17
    const-string v6, "frienduin"

    .line 18
    .line 19
    const-string v7, "uinStr"

    .line 20
    .line 21
    const-string v8, "uinCode"

    .line 22
    .line 23
    const-string v9, "uinNum"

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p0, v0}, Li5;->c2(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    const-string v0, "getUid"

    .line 40
    .line 41
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v0, "getUin"

    .line 46
    .line 47
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const-string v0, "getPeerUid"

    .line 52
    .line 53
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const-string v0, "getPeerUin"

    .line 58
    .line 59
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    const-string v0, "getFriendUid"

    .line 64
    .line 65
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    const-string v0, "getFriendUin"

    .line 70
    .line 71
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    const-string v0, "getBuddyUid"

    .line 76
    .line 77
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    const-string v0, "getBuddyUin"

    .line 82
    .line 83
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    const-string v0, "getContactId"

    .line 88
    .line 89
    invoke-static {p0, v0}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Li5;->s0([Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :cond_0
    return-object v0
.end method

.method public static t1(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "com.tencent.mobileqq.qroute.QRoute"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v2, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p1, v2, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string p1, "api"

    .line 14
    .line 15
    const-class v2, Ljava/lang/Class;

    .line 16
    .line 17
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, p1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    return-object p0

    .line 34
    :catchall_0
    return-object v0
.end method

.method public static u(Landroid/content/Context;)Ljava/io/File;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    move-object p0, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    const-string v1, "voice cache unavailable"

    .line 11
    .line 12
    if-eqz p0, :cond_8

    .line 13
    .line 14
    new-instance v2, Ljava/io/File;

    .line 15
    .line 16
    const-string v3, "elaris_local_voice"

    .line 17
    .line 18
    invoke-direct {v2, p0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const-string p0, "voice cache mkdir failed"

    .line 35
    .line 36
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    :goto_1
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_7

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/io/File;->canWrite()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_7

    .line 51
    .line 52
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-nez p0, :cond_3

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    const-wide/32 v3, 0x5265c00

    .line 64
    .line 65
    .line 66
    sub-long/2addr v0, v3

    .line 67
    array-length v3, p0

    .line 68
    const/4 v4, 0x0

    .line 69
    :goto_2
    if-ge v4, v3, :cond_6

    .line 70
    .line 71
    aget-object v5, p0, v4

    .line 72
    .line 73
    if-eqz v5, :cond_5

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_5

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    .line 82
    .line 83
    .line 84
    move-result-wide v6

    .line 85
    cmp-long v6, v6, v0

    .line 86
    .line 87
    if-ltz v6, :cond_4

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    const-string v7, "Elaris-local-audio-pcm-"

    .line 95
    .line 96
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_5

    .line 101
    .line 102
    invoke-virtual {v5}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    .line 105
    :cond_5
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :catchall_0
    :cond_6
    :goto_4
    return-object v2

    .line 109
    :cond_7
    invoke-static {v1}, Lu2;->c(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-object v0

    .line 113
    :cond_8
    invoke-static {v1}, Lu2;->c(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object v0
.end method

.method public static u0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v4, "uinCode"

    .line 2
    .line 3
    const-string v5, "uinNum"

    .line 4
    .line 5
    const-string v0, "uin"

    .line 6
    .line 7
    const-string v1, "friendUin"

    .line 8
    .line 9
    const-string v2, "frienduin"

    .line 10
    .line 11
    const-string v3, "uinStr"

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p0, v0}, Li5;->c2(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "getUin"

    .line 22
    .line 23
    invoke-static {p0, v1}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "getFriendUin"

    .line 28
    .line 29
    invoke-static {p0, v2}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "getBuddyUin"

    .line 34
    .line 35
    invoke-static {p0, v3}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    filled-new-array {v0, v1, v2, p0}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Li5;->s0([Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Li5;->C(Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method public static u1(Ljava/io/FileInputStream;[BI)I
    .locals 2

    .line 1
    if-gtz p2, :cond_0

    .line 2
    .line 3
    const/4 p0, -0x1

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    if-ge v0, p2, :cond_3

    .line 7
    .line 8
    sub-int v1, p2, v0

    .line 9
    .line 10
    invoke-virtual {p0, p1, v0, v1}, Ljava/io/InputStream;->read([BII)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-gez v1, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    if-nez v1, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    add-int/2addr v0, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_3
    :goto_1
    return v0
.end method

.method public static v(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1, p1}, Li5;->q0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    return-object p0

    .line 23
    :catchall_0
    :cond_2
    :goto_0
    return-object v0
.end method

.method public static v0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ll8;)Ljava/io/File;
    .locals 5

    .line 1
    const-string v0, "code"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    move-object p1, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :goto_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    move-object v2, v1

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :goto_1
    const/4 v3, 0x0

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_2

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->codePointCount(II)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    :cond_3
    :goto_2
    const/4 v2, 0x0

    .line 40
    if-lez v3, :cond_e

    .line 41
    .line 42
    const/16 v4, 0xc8

    .line 43
    .line 44
    if-gt v3, v4, :cond_e

    .line 45
    .line 46
    invoke-static {p2}, Li5;->O0(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_d

    .line 51
    .line 52
    if-eqz p0, :cond_c

    .line 53
    .line 54
    invoke-virtual {p3}, Ll8;->b()V

    .line 55
    .line 56
    .line 57
    :try_start_0
    new-instance v3, Ljava/net/URL;

    .line 58
    .line 59
    invoke-static {p1, p2}, Li5;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {v3, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string p1, "voice-api"

    .line 67
    .line 68
    const/high16 p2, 0x10000

    .line 69
    .line 70
    invoke-static {v3, p2, p3, p1}, Li5;->z1(Ljava/net/URL;ILl8;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-instance v3, Lorg/json/JSONObject;

    .line 75
    .line 76
    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 p1, -0x1

    .line 80
    invoke-virtual {v3, v0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-nez v4, :cond_b

    .line 85
    .line 86
    const-string v4, "data"

    .line 87
    .line 88
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    if-nez v3, :cond_4

    .line 93
    .line 94
    move-object v3, v1

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    const-string v4, "url"

    .line 97
    .line 98
    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    :goto_3
    invoke-static {v3}, Li5;->A0(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 106
    if-eqz v4, :cond_a

    .line 107
    .line 108
    invoke-virtual {p3}, Ll8;->b()V

    .line 109
    .line 110
    .line 111
    :try_start_1
    new-instance v4, Ljava/net/URL;

    .line 112
    .line 113
    invoke-static {v3}, Li5;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-direct {v4, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const-string v3, "script-silk-api"

    .line 121
    .line 122
    invoke-static {v4, p2, p3, v3}, Li5;->z1(Ljava/net/URL;ILl8;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    new-instance v3, Lorg/json/JSONObject;

    .line 127
    .line 128
    invoke-direct {v3, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, v0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    const/4 p2, 0x1

    .line 136
    if-ne p1, p2, :cond_9

    .line 137
    .line 138
    const-string p1, "message"

    .line 139
    .line 140
    invoke-virtual {v3, p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const/16 v0, 0x400

    .line 145
    .line 146
    invoke-static {p1, v0}, Li5;->F1(Ljava/lang/String;I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {p1}, Li5;->B0(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 154
    if-eqz v0, :cond_8

    .line 155
    .line 156
    invoke-virtual {p3}, Ll8;->b()V

    .line 157
    .line 158
    .line 159
    :goto_4
    const/4 v0, 0x3

    .line 160
    if-gt p2, v0, :cond_7

    .line 161
    .line 162
    :try_start_2
    invoke-static {p0, p1, p3}, Li5;->Z(Landroid/content/Context;Ljava/lang/String;Ll8;)Ljava/io/File;

    .line 163
    .line 164
    .line 165
    move-result-object p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 166
    return-object p0

    .line 167
    :catch_0
    move-exception v1

    .line 168
    iget-boolean v3, p3, Ll8;->a:Z

    .line 169
    .line 170
    if-nez v3, :cond_6

    .line 171
    .line 172
    if-ge p2, v0, :cond_6

    .line 173
    .line 174
    instance-of v0, v1, Ln8;

    .line 175
    .line 176
    if-nez v0, :cond_5

    .line 177
    .line 178
    invoke-static {v1}, Li5;->L0(Ljava/io/IOException;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_6

    .line 183
    .line 184
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    const-string v3, "kk tts retry stage=script-silk-download error="

    .line 187
    .line 188
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string v1, " attempt="

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-static {p2, p3}, Li5;->f2(ILl8;)V

    .line 218
    .line 219
    .line 220
    add-int/lit8 p2, p2, 0x1

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_6
    throw v1

    .line 224
    :cond_7
    const-string p0, "script silk download retry exhausted"

    .line 225
    .line 226
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    return-object v2

    .line 230
    :cond_8
    :try_start_3
    new-instance p0, Ljava/io/IOException;

    .line 231
    .line 232
    const-string p1, "script silk url rejected"

    .line 233
    .line 234
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw p0

    .line 238
    :cond_9
    new-instance p0, Ljava/io/IOException;

    .line 239
    .line 240
    const-string p1, "script silk api rejected"

    .line 241
    .line 242
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw p0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 246
    :catchall_0
    move-exception p0

    .line 247
    new-instance p1, Ljava/io/IOException;

    .line 248
    .line 249
    const-string p2, "script silk response invalid"

    .line 250
    .line 251
    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 252
    .line 253
    .line 254
    throw p1

    .line 255
    :catch_1
    move-exception p0

    .line 256
    throw p0

    .line 257
    :cond_a
    :try_start_4
    new-instance p0, Ljava/io/IOException;

    .line 258
    .line 259
    const-string p1, "tts audio url rejected"

    .line 260
    .line 261
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw p0

    .line 265
    :cond_b
    new-instance p0, Ljava/io/IOException;

    .line 266
    .line 267
    const-string p1, "tts api rejected"

    .line 268
    .line 269
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 273
    :catchall_1
    move-exception p0

    .line 274
    new-instance p1, Ljava/io/IOException;

    .line 275
    .line 276
    const-string p2, "tts response invalid"

    .line 277
    .line 278
    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 279
    .line 280
    .line 281
    throw p1

    .line 282
    :catch_2
    move-exception p0

    .line 283
    throw p0

    .line 284
    :cond_c
    const-string p0, "tts cache unavailable"

    .line 285
    .line 286
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    return-object v2

    .line 290
    :cond_d
    const-string p0, "tts voice invalid"

    .line 291
    .line 292
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    return-object v2

    .line 296
    :cond_e
    const-string p0, "tts text invalid"

    .line 297
    .line 298
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    return-object v2
.end method

.method public static v1(Ljava/io/InputStream;J)[B
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    new-array p0, v0, [B

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 10
    .line 11
    .line 12
    const/16 v2, 0x4000

    .line 13
    .line 14
    :try_start_0
    new-array v2, v2, [B

    .line 15
    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-ltz v5, :cond_2

    .line 23
    .line 24
    int-to-long v6, v5

    .line 25
    add-long/2addr v3, v6

    .line 26
    cmp-long v6, v3, p1

    .line 27
    .line 28
    if-gtz v6, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1, v2, v0, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    new-instance p1, Lm1;

    .line 37
    .line 38
    const-string p2, "\u6587\u4ef6\u8d85\u8fc7\u5927\u5c0f\u9650\u5236"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_2
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 45
    .line 46
    .line 47
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    invoke-static {p0}, Li5;->E(Ljava/io/Closeable;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Li5;->E(Ljava/io/Closeable;)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :goto_1
    invoke-static {p0}, Li5;->E(Ljava/io/Closeable;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, Li5;->E(Ljava/io/Closeable;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public static w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Li5;->v(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Li5;->S1(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static w0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    move-object v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const-class v2, Ljava/lang/Object;

    .line 13
    .line 14
    if-eq v1, v2, :cond_1

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    return-object p0

    .line 29
    :catch_0
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-object v0
.end method

.method public static w1(Ljava/io/InputStream;ILl8;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x1000

    .line 7
    .line 8
    :try_start_0
    new-array v1, v1, [B

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    invoke-virtual {p2}, Ll8;->b()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-gez v4, :cond_0

    .line 20
    .line 21
    new-instance p1, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 28
    .line 29
    invoke-direct {p1, p2, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Li5;->G(Ljava/io/Closeable;)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    if-nez v4, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    add-int/2addr v3, v4

    .line 42
    if-gt v3, p1, :cond_2

    .line 43
    .line 44
    :try_start_1
    invoke-virtual {v0, v1, v2, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 49
    .line 50
    const-string p2, "tts response too large"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    :goto_1
    invoke-static {p0}, Li5;->G(Ljava/io/Closeable;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method

.method public static x(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    sget-object v0, Li5;->u:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sput-object p0, Li5;->u:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "host runtime classloader captured source="

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p2, ", process="

    .line 21
    .line 22
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p1, ", loader="

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Li5;->P0(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void
.end method

.method public static final x0(Lj1;)Ljava/lang/Class;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lj1;->a:Ljava/lang/Class;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_0

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    sparse-switch v1, :sswitch_data_0

    .line 23
    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :sswitch_0
    const-string v1, "short"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const-class p0, Ljava/lang/Short;

    .line 37
    .line 38
    return-object p0

    .line 39
    :sswitch_1
    const-string v1, "float"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const-class p0, Ljava/lang/Float;

    .line 49
    .line 50
    return-object p0

    .line 51
    :sswitch_2
    const-string v1, "boolean"

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const-class p0, Ljava/lang/Boolean;

    .line 61
    .line 62
    return-object p0

    .line 63
    :sswitch_3
    const-string v1, "void"

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    const-class p0, Ljava/lang/Void;

    .line 73
    .line 74
    return-object p0

    .line 75
    :sswitch_4
    const-string v1, "long"

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_5

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    const-class p0, Ljava/lang/Long;

    .line 85
    .line 86
    return-object p0

    .line 87
    :sswitch_5
    const-string v1, "char"

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_6

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_6
    const-class p0, Ljava/lang/Character;

    .line 97
    .line 98
    return-object p0

    .line 99
    :sswitch_6
    const-string v1, "byte"

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_7

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_7
    const-class p0, Ljava/lang/Byte;

    .line 109
    .line 110
    return-object p0

    .line 111
    :sswitch_7
    const-string v1, "int"

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_8

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_8
    const-class p0, Ljava/lang/Integer;

    .line 121
    .line 122
    return-object p0

    .line 123
    :sswitch_8
    const-string v1, "double"

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-nez v0, :cond_9

    .line 130
    .line 131
    :goto_0
    return-object p0

    .line 132
    :cond_9
    const-class p0, Ljava/lang/Double;

    .line 133
    .line 134
    return-object p0

    .line 135
    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_8
        0x197ef -> :sswitch_7
        0x2e6108 -> :sswitch_6
        0x2e9356 -> :sswitch_5
        0x32c67c -> :sswitch_4
        0x375194 -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x685847c -> :sswitch_0
    .end sparse-switch
.end method

.method public static x1(Ljava/lang/Object;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const-string v3, "release"

    .line 11
    .line 12
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "close"

    .line 28
    .line 29
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    .line 39
    :catchall_1
    :goto_0
    return-void
.end method

.method public static y(Lve;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lve;->b:Ljava/lang/Thread;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lve;->b:Ljava/lang/Thread;

    .line 10
    .line 11
    :cond_0
    iget-boolean p0, p0, Lve;->a:Z

    .line 12
    .line 13
    const-string v0, "voice conversion cancelled"

    .line 14
    .line 15
    if-nez p0, :cond_2

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-static {v0}, Lu2;->c(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    invoke-static {v0}, Lu2;->c(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static y0(Landroid/view/View;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-eqz p0, :cond_2

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    if-ge v1, v2, :cond_2

    .line 7
    .line 8
    invoke-static {p0}, Li5;->C0(Landroid/view/View;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    instance-of v2, p0, Landroid/view/View;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    check-cast p0, Landroid/view/View;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    return v0
.end method

.method public static y1(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 4

    .line 1
    invoke-static {p0, p1}, Li5;->k1(Ljava/lang/String;Ljava/lang/String;)Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-lez p1, :cond_0

    .line 12
    .line 13
    const-string p1, "X-Elaris-Upload-Key"

    .line 14
    .line 15
    invoke-virtual {p0, p1, p3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 p1, 0x1

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    sget-object p3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 26
    .line 27
    invoke-virtual {p2, p3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p0, p1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 32
    .line 33
    .line 34
    const-string p3, "Content-Type"

    .line 35
    .line 36
    const-string v0, "application/json; charset=utf-8"

    .line 37
    .line 38
    invoke-virtual {p0, p3, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    array-length p3, p2

    .line 42
    invoke-virtual {p0, p3}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-virtual {p3, p2}, Ljava/io/OutputStream;->write([B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3}, Ljava/io/OutputStream;->close()V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    const/16 p3, 0xc8

    .line 60
    .line 61
    const/16 v0, 0x12c

    .line 62
    .line 63
    if-lt p2, p3, :cond_2

    .line 64
    .line 65
    if-ge p2, v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :goto_0
    const-wide/32 v2, 0x80000

    .line 77
    .line 78
    .line 79
    :try_start_0
    invoke-static {v1, v2, v3}, Li5;->v1(Ljava/io/InputStream;J)[B

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    new-instance v2, Ljava/lang/String;

    .line 84
    .line 85
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 86
    .line 87
    invoke-direct {v2, v1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-nez p0, :cond_3

    .line 98
    .line 99
    new-instance p0, Lorg/json/JSONObject;

    .line 100
    .line 101
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    new-instance p0, Lorg/json/JSONObject;

    .line 106
    .line 107
    invoke-direct {p0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :goto_1
    if-lt p2, p3, :cond_5

    .line 111
    .line 112
    if-ge p2, v0, :cond_5

    .line 113
    .line 114
    if-ge p2, v0, :cond_4

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    const/4 p1, 0x0

    .line 118
    :goto_2
    const-string p3, "ok"

    .line 119
    .line 120
    invoke-virtual {p0, p3, p1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_5

    .line 125
    .line 126
    return-object p0

    .line 127
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string p3, "http_"

    .line 130
    .line 131
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    const-string p2, "message"

    .line 142
    .line 143
    invoke-virtual {p0, p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    new-instance p1, Lm1;

    .line 148
    .line 149
    invoke-static {p0}, Li5;->L1(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p1

    .line 157
    :catchall_0
    move-exception p1

    .line 158
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 159
    .line 160
    .line 161
    throw p1
.end method

.method public static z(Ljava/lang/String;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    sparse-switch p0, :sswitch_data_0

    .line 24
    .line 25
    .line 26
    :goto_0
    const-wide/16 v0, -0x1

    .line 27
    .line 28
    return-wide v0

    .line 29
    :sswitch_0
    const-wide/16 v0, 0x4

    .line 30
    .line 31
    return-wide v0

    .line 32
    :sswitch_1
    const-wide/16 v0, 0x6

    .line 33
    .line 34
    return-wide v0

    .line 35
    :sswitch_2
    const-wide/16 v0, 0x8

    .line 36
    .line 37
    return-wide v0

    .line 38
    :sswitch_3
    const-wide/16 v0, 0x5

    .line 39
    .line 40
    return-wide v0

    .line 41
    :sswitch_4
    const-wide/16 v0, 0x9

    .line 42
    .line 43
    return-wide v0

    .line 44
    :sswitch_5
    const-wide/16 v0, 0x2

    .line 45
    .line 46
    return-wide v0

    .line 47
    :sswitch_6
    const-wide/16 v0, 0x3

    .line 48
    .line 49
    return-wide v0

    .line 50
    :sswitch_7
    const-wide/16 v0, 0x7

    .line 51
    .line 52
    return-wide v0

    .line 53
    :sswitch_8
    const-wide/16 v0, 0x1

    .line 54
    .line 55
    return-wide v0

    .line 56
    nop

    .line 57
    :sswitch_data_0
    .sparse-switch
        0x4e00 -> :sswitch_8
        0x4e03 -> :sswitch_7
        0x4e09 -> :sswitch_6
        0x4e24 -> :sswitch_5
        0x4e5d -> :sswitch_4
        0x4e8c -> :sswitch_5
        0x4e94 -> :sswitch_3
        0x4f0d -> :sswitch_3
        0x516b -> :sswitch_2
        0x516d -> :sswitch_1
        0x53c1 -> :sswitch_6
        0x56db -> :sswitch_0
        0x58f9 -> :sswitch_8
        0x634c -> :sswitch_2
        0x67d2 -> :sswitch_7
        0x7396 -> :sswitch_4
        0x8086 -> :sswitch_0
        0x8d30 -> :sswitch_5
        0x9646 -> :sswitch_1
    .end sparse-switch
.end method

.method public static z0(Landroid/app/Activity;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static z1(Ljava/net/URL;ILl8;Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 1
    const-string v0, "application/json"

    .line 2
    .line 3
    const-string v1, " attempt="

    .line 4
    .line 5
    const-string v2, "kk tts retry stage="

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    move v4, v3

    .line 9
    :goto_0
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x3

    .line 11
    if-gt v4, v6, :cond_5

    .line 12
    .line 13
    :try_start_0
    invoke-static {p0, p2}, Li5;->l1(Ljava/net/URL;Ll8;)Ljava/net/HttpURLConnection;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    const-string v7, "Accept"

    .line 18
    .line 19
    invoke-virtual {v5, v7, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    const/16 v8, 0xc8

    .line 27
    .line 28
    if-ne v7, v8, :cond_0

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    invoke-static {v7, p1, p2}, Li5;->w1(Ljava/io/InputStream;ILl8;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    invoke-static {v5, p2}, Li5;->F(Ljava/net/HttpURLConnection;Ll8;)V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto/16 :goto_6

    .line 44
    .line 45
    :catch_0
    move-exception v7

    .line 46
    goto :goto_4

    .line 47
    :cond_0
    const/16 v8, 0x1ad

    .line 48
    .line 49
    if-eq v7, v8, :cond_2

    .line 50
    .line 51
    const/16 v8, 0x1f4

    .line 52
    .line 53
    if-lt v7, v8, :cond_1

    .line 54
    .line 55
    const/16 v8, 0x257

    .line 56
    .line 57
    if-gt v7, v8, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const/4 v8, 0x0

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    :goto_1
    move v8, v3

    .line 63
    :goto_2
    if-eqz v8, :cond_3

    .line 64
    .line 65
    if-ge v4, v6, :cond_3

    .line 66
    .line 67
    :try_start_1
    new-instance v8, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v8, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v9, " status="

    .line 79
    .line 80
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-static {v7}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    .line 99
    :goto_3
    invoke-static {v5, p2}, Li5;->F(Ljava/net/HttpURLConnection;Ll8;)V

    .line 100
    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_3
    :try_start_2
    new-instance v8, Ljava/io/IOException;

    .line 104
    .line 105
    new-instance v9, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v9, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v10, " http "

    .line 114
    .line 115
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    invoke-direct {v8, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v8
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 129
    :goto_4
    :try_start_3
    iget-boolean v8, p2, Ll8;->a:Z

    .line 130
    .line 131
    if-nez v8, :cond_4

    .line 132
    .line 133
    if-ge v4, v6, :cond_4

    .line 134
    .line 135
    invoke-static {v7}, Li5;->L0(Ljava/io/IOException;)Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-eqz v6, :cond_4

    .line 140
    .line 141
    new-instance v6, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v8, " error="

    .line 153
    .line 154
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-static {v6}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :goto_5
    invoke-static {v4, p2}, Li5;->f2(ILl8;)V

    .line 183
    .line 184
    .line 185
    add-int/lit8 v4, v4, 0x1

    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :cond_4
    :try_start_4
    throw v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 190
    :goto_6
    invoke-static {v5, p2}, Li5;->F(Ljava/net/HttpURLConnection;Ll8;)V

    .line 191
    .line 192
    .line 193
    throw p0

    .line 194
    :cond_5
    const-string p0, " retry exhausted"

    .line 195
    .line 196
    invoke-virtual {p3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return-object v5
.end method
