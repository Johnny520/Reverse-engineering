.class public final synthetic Ljt1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p2, p0, Ljt1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Ljt1;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Ljt1;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x4

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    iget-object v6, p0, Ljt1;->ζ:Landroid/app/Activity;

    .line 9
    .line 10
    sget-object v7, Ls62;->α:Ls62;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, La80;

    .line 16
    .line 17
    const-string p0, "#99FFFFFF"

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    :try_start_0
    const-string v0, "seekbar_time_color"

    .line 23
    .line 24
    invoke-static {v0, p0}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    goto :goto_0

    .line 33
    :catch_0
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    :goto_0
    new-instance v0, Lhu;

    .line 38
    .line 39
    const/4 v1, 0x7

    .line 40
    invoke-direct {v0, p1, v6, v1}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 41
    .line 42
    .line 43
    const-string p1, "\u8bbe\u7f6e\u65f6\u95f4\u6587\u5b57\u989c\u8272"

    .line 44
    .line 45
    invoke-static {v6, p1, p0, v5, v0}, Lcom/example/dyhelper/ui/μ;->δ(Landroid/content/Context;Ljava/lang/String;IZLa80;)V

    .line 46
    .line 47
    .line 48
    return-object v7

    .line 49
    :pswitch_0
    check-cast p1, La80;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const-string p0, "\u66f4\u65b0\u4e2d\u2026"

    .line 55
    .line 56
    invoke-interface {p1, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    new-instance p0, Lhu;

    .line 60
    .line 61
    const/4 v0, 0x5

    .line 62
    invoke-direct {p0, p1, v6, v0}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v6, v4, p0}, Lpf1;->δ(Landroid/app/Activity;Lky1;La80;)V

    .line 66
    .line 67
    .line 68
    return-object v7

    .line 69
    :pswitch_1
    check-cast p1, La80;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    sget-object v0, Lbv1;->α:Lbv1;

    .line 75
    .line 76
    const-string v0, "pet_elf_auto_feed_max_price"

    .line 77
    .line 78
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-interface {v1, v0, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 83
    .line 84
    .line 85
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    :catchall_0
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    new-instance v13, Lhu;

    .line 91
    .line 92
    const/16 v0, 0xd

    .line 93
    .line 94
    iget-object v8, p0, Ljt1;->ζ:Landroid/app/Activity;

    .line 95
    .line 96
    invoke-direct {v13, v8, p1, v0}, Lhu;-><init>(Landroid/app/Activity;La80;I)V

    .line 97
    .line 98
    .line 99
    const-string v9, "\u8bbe\u7f6e\u6295\u5582\u4ef7\u683c\u4e0a\u9650"

    .line 100
    .line 101
    const-string v10, "\u8f93\u5165 0~100\uff1b\u8bbe\u7f6e\u4e3a 0 \u6700\u5b89\u5168\uff0c\u53ea\u5141\u8bb8\u5b9e\u65f6\u4ef7\u683c\u4e3a 0 \u7684\u98df\u7269"

    .line 102
    .line 103
    const/4 v12, 0x2

    .line 104
    invoke-static/range {v8 .. v13}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 105
    .line 106
    .line 107
    return-object v7

    .line 108
    :pswitch_2
    check-cast p1, La80;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sget-object p0, Lbv1;->α:Lbv1;

    .line 114
    .line 115
    const-string p0, "spark_message_source"

    .line 116
    .line 117
    const-string v0, "custom"

    .line 118
    .line 119
    invoke-static {p0, v0}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    sget-object v0, Lkn0;->η:[Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v0, p0}, Lg7;->е([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    if-ltz p0, :cond_0

    .line 134
    .line 135
    move-object v4, v0

    .line 136
    :cond_0
    if-eqz v4, :cond_1

    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    :cond_1
    sget-object p0, Lkn0;->ζ:[Ljava/lang/String;

    .line 143
    .line 144
    new-instance v0, Lhu;

    .line 145
    .line 146
    const/4 v1, 0x3

    .line 147
    invoke-direct {v0, p1, v6, v1}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 148
    .line 149
    .line 150
    const-string p1, "\u9009\u62e9\u7eed\u671f\u6d88\u606f\u6765\u6e90"

    .line 151
    .line 152
    invoke-static {v6, p1, p0, v5, v0}, Lbv1;->Ω(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILa80;)V

    .line 153
    .line 154
    .line 155
    return-object v7

    .line 156
    :pswitch_3
    check-cast p1, La80;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    sget-object v0, Lbv1;->α:Lbv1;

    .line 162
    .line 163
    const-string v0, "spark_message"

    .line 164
    .line 165
    const-string v1, "\u706b\u82b1"

    .line 166
    .line 167
    invoke-static {v0, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    new-instance v13, Lhu;

    .line 172
    .line 173
    iget-object v8, p0, Ljt1;->ζ:Landroid/app/Activity;

    .line 174
    .line 175
    invoke-direct {v13, v8, p1, v3}, Lhu;-><init>(Landroid/app/Activity;La80;I)V

    .line 176
    .line 177
    .line 178
    const-string v9, "\u8bbe\u7f6e\u7eed\u671f\u6d88\u606f"

    .line 179
    .line 180
    const-string v10, "\u8f93\u5165\u7eed\u671f\u65f6\u53d1\u9001\u7684\u6d88\u606f\u5185\u5bb9"

    .line 181
    .line 182
    const/4 v12, 0x1

    .line 183
    invoke-static/range {v8 .. v13}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 184
    .line 185
    .line 186
    return-object v7

    .line 187
    :pswitch_4
    check-cast p1, La80;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    sget-object v0, Lbv1;->α:Lbv1;

    .line 193
    .line 194
    const-string v0, "spark_auto_renew_trigger_hour"

    .line 195
    .line 196
    const/4 v1, -0x1

    .line 197
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 202
    .line 203
    .line 204
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 205
    :catchall_1
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    new-instance v13, Lhu;

    .line 210
    .line 211
    iget-object v8, p0, Ljt1;->ζ:Landroid/app/Activity;

    .line 212
    .line 213
    invoke-direct {v13, p1, v8, v2}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 214
    .line 215
    .line 216
    const-string v9, "\u8bbe\u7f6e\u89e6\u53d1\u5c0f\u65f6"

    .line 217
    .line 218
    const-string v10, "\u8f93\u5165 -1\uff08\u65e5\u671f\u5207\u6362\uff09\u6216 0~23\uff08\u6307\u5b9a\u5c0f\u65f6\uff09"

    .line 219
    .line 220
    const/16 v12, 0x1002

    .line 221
    .line 222
    invoke-static/range {v8 .. v13}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 223
    .line 224
    .line 225
    return-object v7

    .line 226
    :pswitch_5
    check-cast p1, La80;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    sget-object v0, Lbv1;->α:Lbv1;

    .line 232
    .line 233
    const-string v0, "pet_elf_mutual_message"

    .line 234
    .line 235
    const-string v1, "\u706b\u661f\u4efb\u52a1"

    .line 236
    .line 237
    invoke-static {v0, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    new-instance v13, Lhu;

    .line 242
    .line 243
    const/16 v0, 0xa

    .line 244
    .line 245
    iget-object v8, p0, Ljt1;->ζ:Landroid/app/Activity;

    .line 246
    .line 247
    invoke-direct {v13, v8, p1, v0}, Lhu;-><init>(Landroid/app/Activity;La80;I)V

    .line 248
    .line 249
    .line 250
    const-string v9, "\u8bbe\u7f6e\u4e92\u53d1\u6d88\u606f\u9ed8\u8ba4\u5185\u5bb9"

    .line 251
    .line 252
    const-string v10, "\u7528\u4e8e\u6bcf\u65e5\u706b\u661f\u4e92\u53d1\u6d88\u606f\u4efb\u52a1\uff0c\u6700\u591a 48 \u4e2a\u5b57\u7b26"

    .line 253
    .line 254
    const/4 v12, 0x1

    .line 255
    invoke-static/range {v8 .. v13}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 256
    .line 257
    .line 258
    return-object v7

    .line 259
    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    .line 260
    .line 261
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    sget-object p1, Lbv1;->α:Lbv1;

    .line 266
    .line 267
    const-string p1, "comment_bg_image_blur_radius"

    .line 268
    .line 269
    invoke-static {p1, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 270
    .line 271
    .line 272
    invoke-static {v6}, Ljx0;->ν(Landroid/content/Context;)V

    .line 273
    .line 274
    .line 275
    return-object v7

    .line 276
    :pswitch_7
    check-cast p1, La80;

    .line 277
    .line 278
    const-string p0, "#FF1A1A2E"

    .line 279
    .line 280
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    :try_start_3
    const-string v0, "comment_bg_color"

    .line 284
    .line 285
    invoke-static {v0, p0}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 290
    .line 291
    .line 292
    move-result p0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 293
    goto :goto_1

    .line 294
    :catch_1
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 295
    .line 296
    .line 297
    move-result p0

    .line 298
    :goto_1
    new-instance v0, Lhu;

    .line 299
    .line 300
    const/16 v2, 0x10

    .line 301
    .line 302
    invoke-direct {v0, p1, v6, v2}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 303
    .line 304
    .line 305
    const-string p1, "\u8bbe\u7f6e\u80cc\u666f\u989c\u8272"

    .line 306
    .line 307
    invoke-static {v6, p1, p0, v1, v0}, Lcom/example/dyhelper/ui/μ;->δ(Landroid/content/Context;Ljava/lang/String;IZLa80;)V

    .line 308
    .line 309
    .line 310
    return-object v7

    .line 311
    :pswitch_8
    check-cast p1, La80;

    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    new-instance p0, Lnt;

    .line 317
    .line 318
    invoke-direct {p0, p1, v2}, Lnt;-><init>(La80;I)V

    .line 319
    .line 320
    .line 321
    sget-object p1, Lwv1;->α:Ljava/util/concurrent/ExecutorService;

    .line 322
    .line 323
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    .line 327
    .line 328
    .line 329
    move-result p1

    .line 330
    if-nez p1, :cond_3

    .line 331
    .line 332
    invoke-virtual {v6}, Landroid/app/Activity;->isDestroyed()Z

    .line 333
    .line 334
    .line 335
    move-result p1

    .line 336
    if-eqz p1, :cond_2

    .line 337
    .line 338
    goto :goto_2

    .line 339
    :cond_2
    new-instance p1, Lii0;

    .line 340
    .line 341
    const/16 v0, 0x19

    .line 342
    .line 343
    invoke-direct {p1, v6, v0, p0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v6, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 347
    .line 348
    .line 349
    :cond_3
    :goto_2
    return-object v7

    .line 350
    :pswitch_9
    check-cast p1, La80;

    .line 351
    .line 352
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    sget-object p0, Lia0;->α:Landroid/app/AlertDialog;

    .line 356
    .line 357
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    new-instance p0, Ln9;

    .line 361
    .line 362
    const/16 p1, 0xf

    .line 363
    .line 364
    invoke-direct {p0, v6, p1}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v6, p0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 368
    .line 369
    .line 370
    return-object v7

    .line 371
    :pswitch_a
    check-cast p1, La80;

    .line 372
    .line 373
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    sget-object v0, Lbv1;->α:Lbv1;

    .line 377
    .line 378
    const-string v0, "video_length_alert_toast_msg"

    .line 379
    .line 380
    const-string v1, "\u5f53\u524d\u89c6\u9891\u65f6\u957f\u8d85\u8fc7 %d \u5206\u949f"

    .line 381
    .line 382
    invoke-static {v0, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v11

    .line 386
    new-instance v13, Lxj0;

    .line 387
    .line 388
    invoke-direct {v13, p1, v3}, Lxj0;-><init>(La80;I)V

    .line 389
    .line 390
    .line 391
    iget-object v8, p0, Ljt1;->ζ:Landroid/app/Activity;

    .line 392
    .line 393
    const-string v9, "\u8bbe\u7f6e\u63d0\u9192\u6587\u6848"

    .line 394
    .line 395
    const-string v10, "\u4f7f\u7528 %d \u4ee3\u8868\u89c6\u9891\u65f6\u957f\u5206\u949f\u6570"

    .line 396
    .line 397
    const/4 v12, 0x1

    .line 398
    invoke-static/range {v8 .. v13}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 399
    .line 400
    .line 401
    return-object v7

    .line 402
    :pswitch_b
    check-cast p1, La80;

    .line 403
    .line 404
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    invoke-static {v6}, Lu72;->ε(Landroid/content/Context;)V

    .line 408
    .line 409
    .line 410
    invoke-static {v1}, Lu72;->α(Z)V

    .line 411
    .line 412
    .line 413
    const-string p0, "\u68c0\u67e5\u4e2d..."

    .line 414
    .line 415
    invoke-interface {p1, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    const-string p0, "\u6b63\u5728\u68c0\u67e5\u66f4\u65b0"

    .line 419
    .line 420
    invoke-static {v6, p0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 425
    .line 426
    .line 427
    return-object v7

    .line 428
    :pswitch_c
    check-cast p1, La80;

    .line 429
    .line 430
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    sget-object v0, Lbv1;->α:Lbv1;

    .line 434
    .line 435
    const-string v0, "precise_time_format"

    .line 436
    .line 437
    const-string v1, "yyyy-MM-dd HH:mm"

    .line 438
    .line 439
    invoke-static {v0, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v11

    .line 443
    new-instance v13, Lhu;

    .line 444
    .line 445
    const/16 v0, 0x15

    .line 446
    .line 447
    iget-object v8, p0, Ljt1;->ζ:Landroid/app/Activity;

    .line 448
    .line 449
    invoke-direct {v13, v8, p1, v0}, Lhu;-><init>(Landroid/app/Activity;La80;I)V

    .line 450
    .line 451
    .line 452
    const-string v9, "\u8bbe\u7f6e\u65f6\u95f4\u683c\u5f0f"

    .line 453
    .line 454
    const-string v10, ""

    .line 455
    .line 456
    const/4 v12, 0x1

    .line 457
    invoke-static/range {v8 .. v13}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 458
    .line 459
    .line 460
    return-object v7

    .line 461
    :pswitch_d
    check-cast p1, La80;

    .line 462
    .line 463
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    sget-object v0, Lbv1;->α:Lbv1;

    .line 467
    .line 468
    const-string v0, "hidden_contact_peek_duration_seconds"

    .line 469
    .line 470
    const/16 v1, 0x1e

    .line 471
    .line 472
    :try_start_4
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 477
    .line 478
    .line 479
    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 480
    :catchall_2
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v11

    .line 484
    new-instance v13, Lhu;

    .line 485
    .line 486
    const/16 v0, 0xc

    .line 487
    .line 488
    iget-object v8, p0, Ljt1;->ζ:Landroid/app/Activity;

    .line 489
    .line 490
    invoke-direct {v13, v8, p1, v0}, Lhu;-><init>(Landroid/app/Activity;La80;I)V

    .line 491
    .line 492
    .line 493
    const-string v9, "\u53cc\u51fb\u663e\u793a\u65f6\u957f"

    .line 494
    .line 495
    const-string v10, "\u8f93\u5165 5~300 \u7684\u6574\u6570\uff08\u79d2\uff09"

    .line 496
    .line 497
    const/4 v12, 0x2

    .line 498
    invoke-static/range {v8 .. v13}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 499
    .line 500
    .line 501
    return-object v7

    .line 502
    :pswitch_e
    check-cast p1, La80;

    .line 503
    .line 504
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    sget-object v0, Lbv1;->α:Lbv1;

    .line 508
    .line 509
    const-string v0, "duration_alert_message"

    .line 510
    .line 511
    const-string v1, "\u4f60\u5df2\u7ecf\u5237\u4e86 %d \u5206\u949f\u4e86,\u4f11\u606f\u4e00\u4e0b\u5427~"

    .line 512
    .line 513
    invoke-static {v0, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v11

    .line 517
    new-instance v13, Lxj0;

    .line 518
    .line 519
    const/4 v0, 0x6

    .line 520
    invoke-direct {v13, p1, v0}, Lxj0;-><init>(La80;I)V

    .line 521
    .line 522
    .line 523
    iget-object v8, p0, Ljt1;->ζ:Landroid/app/Activity;

    .line 524
    .line 525
    const-string v9, "\u8bbe\u7f6e\u63d0\u9192\u6587\u6848"

    .line 526
    .line 527
    const-string v10, "\u4f7f\u7528 %d \u4ee3\u8868\u5df2\u89c2\u770b\u7684\u5206\u949f\u6570"

    .line 528
    .line 529
    const/4 v12, 0x1

    .line 530
    invoke-static/range {v8 .. v13}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 531
    .line 532
    .line 533
    return-object v7

    .line 534
    nop

    .line 535
    :pswitch_data_0
    .packed-switch 0x0
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
