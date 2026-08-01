.class public final synthetic Lxhss/ᛴᛶᛲᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛳᲇᛶ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᛴᛶᛲᛶ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ()Ljava/lang/Object;
    .locals 5

    .line 1
    iget p0, p0, Lxhss/ᛴᛶᛲᛶ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    const/4 v1, 0x2

    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance p0, Lxhss/ᛶᲀᛴᲁ;

    .line 10
    .line 11
    sget-object v0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛴᛷᛱ:Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-direct {p0, v0}, Lxhss/ᛶᲀᛴᲁ;-><init>(Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;)V

    .line 16
    .line 17
    .line 18
    move-object v2, p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-wide v0, -0xd0251b858845L

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-object v2

    .line 33
    :pswitch_0
    sget-object p0, Lxhss/ᲇᲁᛱᛸ;->ᲇᛴᲇᛵ:Lcom/xingin/xhss/ModuleMain;

    .line 34
    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    move-object v2, p0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-wide v0, -0xd00a1b858845L

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    return-object v2

    .line 52
    :pswitch_1
    sget-object p0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛶᲈᛶ()Landroid/content/pm/ApplicationInfo;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_2
    sget-object p0, Lxhss/ᛳᲈᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᲇ;

    .line 65
    .line 66
    sget-object p0, Lxhss/ᛳᛲᛳᛲ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛲᛳᛲ;

    .line 67
    .line 68
    new-instance v0, Lxhss/ᲇᛸᲈᛳ;

    .line 69
    .line 70
    invoke-direct {v0}, Lxhss/ᲁᛳᛶᛴ;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v0}, Lxhss/ᛱᛷᛵᛷ;->ᛸᛶᲈᛶ(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛴᛵᛳᛵ;)Lxhss/ᛴᛵᛳᛵ;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    new-instance v0, Lxhss/ᛶᛸᲀᛷ;

    .line 78
    .line 79
    sget-object v1, Lxhss/ᛳᛴᲀᲁ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᲀᲁ;

    .line 80
    .line 81
    invoke-interface {p0, v1}, Lxhss/ᛴᛵᛳᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    new-instance v1, Lxhss/ᲁᛳᛶᛴ;

    .line 89
    .line 90
    invoke-direct {v1}, Lxhss/ᲁᛳᛶᛴ;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-interface {p0, v1}, Lxhss/ᛴᛵᛳᛵ;->ᲀᲇᛳᲁ(Lxhss/ᛴᛵᛳᛵ;)Lxhss/ᛴᛵᛳᛵ;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    :goto_2
    invoke-direct {v0, p0}, Lxhss/ᛶᛸᲀᛷ;-><init>(Lxhss/ᛴᛵᛳᛵ;)V

    .line 98
    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_3
    sget-object p0, Lxhss/ᲈᛵᲈᛶ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛵᲈᛶ;

    .line 102
    .line 103
    :try_start_0
    invoke-virtual {p0}, Lxhss/ᲇᛱᲈᛸ;->ᛷᛵᛵᲈ()Ljava/lang/ClassLoader;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    const-wide v0, -0x117c01b858845L

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    const-wide v0, -0x117d81b858845L

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const-class v1, Ljava/lang/Object;

    .line 130
    .line 131
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {p0, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 136
    .line 137
    .line 138
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    goto :goto_3

    .line 140
    :catchall_0
    move-exception p0

    .line 141
    new-instance v0, Lxhss/ᲈᛳᛱᲇ;

    .line 142
    .line 143
    invoke-direct {v0, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    move-object p0, v0

    .line 147
    :goto_3
    invoke-static {p0}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    if-eqz v0, :cond_3

    .line 152
    .line 153
    const-wide v3, -0x117dd1b858845L

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    const-wide v0, -0xfd081b858845L

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    :cond_3
    instance-of v0, p0, Lxhss/ᲈᛳᛱᲇ;

    .line 173
    .line 174
    if-eqz v0, :cond_4

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_4
    move-object v2, p0

    .line 178
    :goto_4
    check-cast v2, Ljava/lang/reflect/Method;

    .line 179
    .line 180
    return-object v2

    .line 181
    :pswitch_4
    new-instance p0, Landroid/os/Handler;

    .line 182
    .line 183
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 188
    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_5
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-virtual {p0}, Ljava/lang/Runtime;->maxMemory()J

    .line 196
    .line 197
    .line 198
    move-result-wide v0

    .line 199
    const-wide/16 v2, 0x400

    .line 200
    .line 201
    div-long/2addr v0, v2

    .line 202
    long-to-int p0, v0

    .line 203
    div-int/lit8 p0, p0, 0x10

    .line 204
    .line 205
    const/16 v0, 0x2000

    .line 206
    .line 207
    const v1, 0x8000

    .line 208
    .line 209
    .line 210
    invoke-static {p0, v0, v1}, Lxhss/ᛵᛵᛲᲈ;->ᲀᲇᛳᲁ(III)I

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    new-instance v0, Lxhss/ᲀᛶᲇᛴ;

    .line 215
    .line 216
    invoke-direct {v0, p0}, Landroid/util/LruCache;-><init>(I)V

    .line 217
    .line 218
    .line 219
    return-object v0

    .line 220
    :pswitch_6
    const-class p0, Lxhss/ᲁᛴᛱᛱ;

    .line 221
    .line 222
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    const-string v0, "android.os.Build"

    .line 227
    .line 228
    sget v1, Lxhss/ᛱᛳᛵᛳ;->ᛷᛵᛵᲈ:I

    .line 229
    .line 230
    :try_start_1
    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 234
    if-eqz p0, :cond_5

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_5
    move-object p0, v2

    .line 238
    goto :goto_5

    .line 239
    :catchall_1
    move-exception p0

    .line 240
    new-instance v0, Lxhss/ᲈᛳᛱᲇ;

    .line 241
    .line 242
    invoke-direct {v0, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 243
    .line 244
    .line 245
    move-object p0, v0

    .line 246
    :goto_5
    instance-of v0, p0, Lxhss/ᲈᛳᛱᲇ;

    .line 247
    .line 248
    if-eqz v0, :cond_6

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_6
    move-object v2, p0

    .line 252
    :goto_6
    check-cast v2, Ljava/lang/Class;

    .line 253
    .line 254
    if-eqz v2, :cond_7

    .line 255
    .line 256
    const/4 p0, 0x1

    .line 257
    goto :goto_7

    .line 258
    :cond_7
    const/4 p0, 0x0

    .line 259
    :goto_7
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    return-object p0

    .line 264
    :pswitch_7
    const-string p0, "KavaRef"

    .line 265
    .line 266
    invoke-static {p0}, Lxhss/ᲁᲇᛴᲀ;->ᛳᲁᲇᛸ(Ljava/lang/String;)Lxhss/ᲀᛶᛶᲀ;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    return-object p0

    .line 271
    :pswitch_8
    new-instance p0, Lxhss/ᲈᛲᛶᛴ;

    .line 272
    .line 273
    sget-object v0, Lxhss/ᛵᛶᛱᛸ;->ᛸᛶᲈᛶ:Lxhss/ᛵᛶᛱᛸ;

    .line 274
    .line 275
    invoke-direct {p0, v0}, Lxhss/ᲈᛲᛶᛴ;-><init>(Lxhss/ᛵᛶᛱᛸ;)V

    .line 276
    .line 277
    .line 278
    return-object p0

    .line 279
    :pswitch_9
    new-instance p0, Lxhss/ᛵᛶᛱᛸ;

    .line 280
    .line 281
    invoke-direct {p0}, Lxhss/ᛵᛶᛱᛸ;-><init>()V

    .line 282
    .line 283
    .line 284
    sget-object v0, Lxhss/ᛱᲀᛸᛸ;->ᛷᛴᛷᛱ:Lxhss/ᛱᲀᛸᛸ;

    .line 285
    .line 286
    iput-object v0, p0, Lxhss/ᛵᛶᛱᛸ;->ᛷᛴᛷᛱ:Lxhss/ᛱᲀᛸᛸ;

    .line 287
    .line 288
    new-instance v0, Lxhss/ᲈᛲᛶᛴ;

    .line 289
    .line 290
    invoke-direct {v0, p0}, Lxhss/ᲈᛲᛶᛴ;-><init>(Lxhss/ᛵᛶᛱᛸ;)V

    .line 291
    .line 292
    .line 293
    return-object v0

    .line 294
    :pswitch_a
    new-instance p0, Lxhss/ᛷᛶᛱᛶ;

    .line 295
    .line 296
    invoke-direct {p0}, Lxhss/ᛷᛶᛱᛶ;-><init>()V

    .line 297
    .line 298
    .line 299
    const-wide/16 v0, 0xa

    .line 300
    .line 301
    invoke-static {v0, v1}, Lxhss/ᛶᛴᲀᛲ;->ᛱᛱᛲᲇ(J)I

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    iput v0, p0, Lxhss/ᛷᛶᛱᛶ;->ᛸᛷᲈᲈ:I

    .line 306
    .line 307
    const-wide/16 v0, 0x1e

    .line 308
    .line 309
    invoke-static {v0, v1}, Lxhss/ᛶᛴᲀᛲ;->ᛱᛱᛲᲇ(J)I

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    iput v2, p0, Lxhss/ᛷᛶᛱᛶ;->ᲈᛳᲀ:I

    .line 314
    .line 315
    invoke-static {v0, v1}, Lxhss/ᛶᛴᲀᛲ;->ᛱᛱᛲᲇ(J)I

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    iput v0, p0, Lxhss/ᛷᛶᛱᛶ;->ᛷᲁᲁ:I

    .line 320
    .line 321
    new-instance v0, Lxhss/ᛵᛸᛷᛲ;

    .line 322
    .line 323
    invoke-direct {v0, p0}, Lxhss/ᛵᛸᛷᛲ;-><init>(Lxhss/ᛷᛶᛱᛶ;)V

    .line 324
    .line 325
    .line 326
    return-object v0

    .line 327
    :pswitch_b
    const-wide v2, -0xd3f31b858845L

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    const-wide v2, -0xd3fa1b858845L

    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    sget-object v3, Lcom/tencent/mmkv/MMKV;->ᛷᛵᛵᲈ:Ljava/util/EnumMap;

    .line 346
    .line 347
    new-instance v3, Lxhss/ᛱᲇᛴᲇ;

    .line 348
    .line 349
    invoke-direct {v3, v0}, Lxhss/ᛱᲇᛴᲇ;-><init>(I)V

    .line 350
    .line 351
    .line 352
    iput v1, v3, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 353
    .line 354
    iput-object v2, v3, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 355
    .line 356
    invoke-static {p0, v3}, Lcom/tencent/mmkv/MMKV;->ᛷᛴᛷᛱ(Ljava/lang/String;Lxhss/ᛱᲇᛴᲇ;)Lcom/tencent/mmkv/MMKV;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    const-wide v0, -0xd41b1b858845L

    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    return-object p0

    .line 369
    :pswitch_c
    const-wide v2, -0xd3bb1b858845L

    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    const-wide v2, -0xd3c21b858845L

    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    sget-object v3, Lcom/tencent/mmkv/MMKV;->ᛷᛵᛵᲈ:Ljava/util/EnumMap;

    .line 388
    .line 389
    new-instance v3, Lxhss/ᛱᲇᛴᲇ;

    .line 390
    .line 391
    invoke-direct {v3, v0}, Lxhss/ᛱᲇᛴᲇ;-><init>(I)V

    .line 392
    .line 393
    .line 394
    iput v1, v3, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 395
    .line 396
    iput-object v2, v3, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 397
    .line 398
    invoke-static {p0, v3}, Lcom/tencent/mmkv/MMKV;->ᛷᛴᛷᛱ(Ljava/lang/String;Lxhss/ᛱᲇᛴᲇ;)Lcom/tencent/mmkv/MMKV;

    .line 399
    .line 400
    .line 401
    move-result-object p0

    .line 402
    const-wide v0, -0xd3e31b858845L

    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    return-object p0

    .line 411
    :pswitch_d
    sget-object p0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 412
    .line 413
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    sget-object p0, Lxhss/ᲇᲁᛱᛸ;->ᛸᛶᲈᛶ:Lxhss/ᛴᛷᛱ;

    .line 417
    .line 418
    invoke-virtual {p0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object p0

    .line 422
    check-cast p0, Lxhss/ᛶᲀᛴᲁ;

    .line 423
    .line 424
    invoke-virtual {p0}, Lxhss/ᛶᲀᛴᲁ;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 425
    .line 426
    .line 427
    move-result-object p0

    .line 428
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 429
    .line 430
    return-object p0

    .line 431
    :pswitch_e
    sget-object p0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 432
    .line 433
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    sget-object p0, Lxhss/ᲇᲁᛱᛸ;->ᛸᛶᲈᛶ:Lxhss/ᛴᛷᛱ;

    .line 437
    .line 438
    invoke-virtual {p0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    check-cast p0, Lxhss/ᛶᲀᛴᲁ;

    .line 443
    .line 444
    return-object p0

    .line 445
    :pswitch_f
    sget-object p0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 446
    .line 447
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    sget-object p0, Lxhss/ᲇᲁᛱᛸ;->ᛸᛶᲈᛶ:Lxhss/ᛴᛷᛱ;

    .line 451
    .line 452
    invoke-virtual {p0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    check-cast p0, Lxhss/ᛶᲀᛴᲁ;

    .line 457
    .line 458
    invoke-virtual {p0}, Lxhss/ᛶᲀᛴᲁ;->getDefaultClassLoader()Ljava/lang/ClassLoader;

    .line 459
    .line 460
    .line 461
    move-result-object p0

    .line 462
    return-object p0

    .line 463
    :pswitch_data_0
    .packed-switch 0x0
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
