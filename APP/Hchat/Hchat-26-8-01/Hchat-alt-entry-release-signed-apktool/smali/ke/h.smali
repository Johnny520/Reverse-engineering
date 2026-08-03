.class public final synthetic Lke/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lke/d;
.implements Lf8/d;
.implements Lokhttp3/EventListener$Factory;
.implements Lj6/o;
.implements Lz7/t;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lke/h;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lke/h;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lke/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo7/b;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lo7/b;->Q(I)Lk7/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, p2}, Lo7/b;->Q(I)Lk7/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lk7/a;->H(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0, p2}, Lk7/a;->H(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 11

    .line 1
    iget v0, p0, Lke/h;->g:I

    .line 2
    .line 3
    sget-object v1, Lr8/c;->i:Lr8/c;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    sget-object v3, Lr8/c;->j:Lr8/c;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/16 v5, 0xb

    .line 10
    .line 11
    const/4 v6, 0x4

    .line 12
    const/16 v7, 0x8

    .line 13
    .line 14
    const/16 v8, 0xc

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    iget-object v10, p0, Lke/h;->h:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    :pswitch_0
    check-cast v10, Lpb/a;

    .line 23
    .line 24
    check-cast p1, Lf8/e;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance p1, Li/e0;

    .line 30
    .line 31
    invoke-direct {p1, v10, v5}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    const-string v0, "block_typing_report"

    .line 35
    .line 36
    const-string v1, "\u62e6\u622a\u6b63\u5728\u8f93\u5165\u4e0a\u62a5"

    .line 37
    .line 38
    invoke-static {v8, p1, v0, v1, v9}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_1
    check-cast v10, Lo9/p;

    .line 43
    .line 44
    check-cast p1, Lf8/e;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v10}, Lo9/p;->z()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_2
    check-cast v10, Lb9/a;

    .line 54
    .line 55
    check-cast p1, Lf8/e;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->l()Lk8/p;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-nez p1, :cond_0

    .line 72
    .line 73
    const-string p1, "[Hchat:TextSpeech] \u6d88\u606f\u89c2\u5bdf API \u672a\u5c31\u7eea"

    .line 74
    .line 75
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    new-instance v0, Lna/c;

    .line 80
    .line 81
    invoke-direct {v0, v10, v4}, Lna/c;-><init>(Ljava/lang/Object;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0}, Lk8/p;->e(Lk8/n;)La2/a;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {v10, p1}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :goto_0
    return-void

    .line 92
    :pswitch_3
    check-cast v10, Lma/a;

    .line 93
    .line 94
    check-cast p1, Lf8/e;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance p1, Li/e0;

    .line 100
    .line 101
    const/16 v0, 0x9

    .line 102
    .line 103
    invoke-direct {p1, v10, v0}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    const-string v0, "disable_pat"

    .line 107
    .line 108
    const-string v1, "\u7981\u6b62\u62cd\u4e00\u62cd"

    .line 109
    .line 110
    invoke-static {v8, p1, v0, v1, v9}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :pswitch_4
    check-cast v10, Lm9/a;

    .line 115
    .line 116
    check-cast p1, Lf8/e;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    sget-object p1, Lr8/e;->a:Landroid/os/Handler;

    .line 122
    .line 123
    new-instance p1, Li/e0;

    .line 124
    .line 125
    invoke-direct {p1, v10, v2}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    const-string v0, "game_emoji_result"

    .line 129
    .line 130
    const-string v1, "\u6307\u5b9a\u9ab0\u5b50\u731c\u62f3"

    .line 131
    .line 132
    invoke-static {v7, p1, v0, v1, v3}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :pswitch_5
    check-cast v10, Llb/k;

    .line 137
    .line 138
    check-cast p1, Lf8/e;

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v10}, Llb/k;->k()V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_6
    check-cast v10, Ljb/a;

    .line 148
    .line 149
    check-cast p1, Lf8/e;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    new-instance p1, Li/e0;

    .line 155
    .line 156
    invoke-direct {p1, v10, v6}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 157
    .line 158
    .line 159
    const-string v0, "finder_media_download"

    .line 160
    .line 161
    const-string v1, "\u89c6\u9891\u53f7\u5a92\u4f53\u4e0b\u8f7d"

    .line 162
    .line 163
    invoke-static {v8, p1, v0, v1, v9}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :pswitch_7
    check-cast v10, Lja/a;

    .line 168
    .line 169
    check-cast p1, Lf8/e;

    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    new-instance p1, Li/e0;

    .line 175
    .line 176
    const/4 v0, 0x3

    .line 177
    invoke-direct {p1, v10, v0}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 178
    .line 179
    .line 180
    const-string v0, "multi_recall"

    .line 181
    .line 182
    const-string v1, "\u591a\u9009\u64a4\u56de"

    .line 183
    .line 184
    invoke-static {v8, p1, v0, v1, v9}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :pswitch_8
    check-cast v10, Lj9/a;

    .line 189
    .line 190
    check-cast p1, Lf8/e;

    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    sget-object p1, Lr8/e;->a:Landroid/os/Handler;

    .line 196
    .line 197
    new-instance p1, Li/e0;

    .line 198
    .line 199
    const/4 v0, 0x2

    .line 200
    invoke-direct {p1, v10, v0}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 201
    .line 202
    .line 203
    const-string v0, "fake_voice_duration"

    .line 204
    .line 205
    const-string v2, "\u4f2a\u9020\u8bed\u97f3\u65f6\u957f"

    .line 206
    .line 207
    invoke-static {v7, p1, v0, v2, v1}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :pswitch_9
    check-cast v10, Lb9/a;

    .line 212
    .line 213
    check-cast p1, Lf8/e;

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    new-instance p1, Li/e0;

    .line 219
    .line 220
    invoke-direct {p1, v10, v4}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 221
    .line 222
    .line 223
    const-string v0, "fake_scan_camera"

    .line 224
    .line 225
    const-string v1, "\u6a21\u62df\u76f8\u673a\u626b\u7801"

    .line 226
    .line 227
    invoke-static {v6, p1, v0, v1, v9}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :pswitch_a
    check-cast v10, Lhb/u;

    .line 232
    .line 233
    check-cast p1, Lf8/e;

    .line 234
    .line 235
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    new-instance p1, Lab/a;

    .line 239
    .line 240
    const/16 v0, 0x1d

    .line 241
    .line 242
    invoke-direct {p1, v10, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 243
    .line 244
    .line 245
    const-string v0, "selected_messages"

    .line 246
    .line 247
    const-string v1, "\u7fa4\u53d1\u52a9\u624b"

    .line 248
    .line 249
    invoke-static {v8, p1, v0, v1, v9}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :pswitch_b
    check-cast v10, Lb9/a;

    .line 254
    .line 255
    check-cast p1, Lf8/e;

    .line 256
    .line 257
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    new-instance p1, Lab/a;

    .line 261
    .line 262
    const/16 v0, 0x1c

    .line 263
    .line 264
    invoke-direct {p1, v10, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 265
    .line 266
    .line 267
    const-string v0, "original_moments_upload"

    .line 268
    .line 269
    const-string v1, "\u670b\u53cb\u5708\u539f\u56fe\u4e0a\u4f20"

    .line 270
    .line 271
    invoke-static {v8, p1, v0, v1, v9}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :pswitch_c
    check-cast v10, Lha/e0;

    .line 276
    .line 277
    check-cast p1, Lf8/e;

    .line 278
    .line 279
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    sget-object p1, Lr8/e;->a:Landroid/os/Handler;

    .line 283
    .line 284
    new-instance p1, Lab/a;

    .line 285
    .line 286
    const/16 v0, 0x1b

    .line 287
    .line 288
    invoke-direct {p1, v10, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 289
    .line 290
    .line 291
    const-string v0, "moments_upload_tail"

    .line 292
    .line 293
    const-string v1, "\u670b\u53cb\u5708\u4e0a\u4f20\u5c3e\u5df4"

    .line 294
    .line 295
    invoke-static {v7, p1, v0, v1, v3}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :pswitch_d
    check-cast v10, Lha/v;

    .line 300
    .line 301
    check-cast p1, Lf8/e;

    .line 302
    .line 303
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v10}, Lha/v;->k()V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :pswitch_e
    check-cast v10, Lha/o;

    .line 311
    .line 312
    check-cast p1, Lf8/e;

    .line 313
    .line 314
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v10}, Lha/o;->k()V

    .line 318
    .line 319
    .line 320
    return-void

    .line 321
    :pswitch_f
    check-cast v10, Lh9/a;

    .line 322
    .line 323
    check-cast p1, Lf8/e;

    .line 324
    .line 325
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    sget-object p1, Lr8/e;->a:Landroid/os/Handler;

    .line 329
    .line 330
    new-instance p1, Lab/a;

    .line 331
    .line 332
    const/16 v0, 0x18

    .line 333
    .line 334
    invoke-direct {p1, v10, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 335
    .line 336
    .line 337
    const-string v0, "fake_location"

    .line 338
    .line 339
    const-string v2, "\u865a\u62df\u5b9a\u4f4d"

    .line 340
    .line 341
    invoke-static {v7, p1, v0, v2, v1}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :pswitch_10
    check-cast v10, Lg9/a;

    .line 346
    .line 347
    check-cast p1, Lf8/e;

    .line 348
    .line 349
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    new-instance p1, Lab/a;

    .line 353
    .line 354
    const/16 v0, 0x17

    .line 355
    .line 356
    invoke-direct {p1, v10, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 357
    .line 358
    .line 359
    const-string v0, "emoji_save"

    .line 360
    .line 361
    const-string v1, "\u4fdd\u5b58\u8868\u60c5"

    .line 362
    .line 363
    invoke-static {v8, p1, v0, v1, v9}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 364
    .line 365
    .line 366
    return-void

    .line 367
    :pswitch_11
    check-cast v10, Lf9/a;

    .line 368
    .line 369
    check-cast p1, Lf8/e;

    .line 370
    .line 371
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    new-instance p1, Lab/a;

    .line 375
    .line 376
    const/16 v0, 0x13

    .line 377
    .line 378
    invoke-direct {p1, v10, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 379
    .line 380
    .line 381
    const-string v0, "edit_message"

    .line 382
    .line 383
    const-string v1, "\u4fee\u6539\u804a\u5929\u8bb0\u5f55"

    .line 384
    .line 385
    invoke-static {v8, p1, v0, v1, v9}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 386
    .line 387
    .line 388
    return-void

    .line 389
    :pswitch_12
    check-cast v10, Ld9/d;

    .line 390
    .line 391
    check-cast p1, Lf8/e;

    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    new-instance p1, Lab/a;

    .line 397
    .line 398
    invoke-direct {p1, v10, v8}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 399
    .line 400
    .line 401
    const-string v0, "custom_friend_avatar"

    .line 402
    .line 403
    const-string v1, "\u81ea\u5b9a\u4e49\u597d\u53cb\u5934\u50cf"

    .line 404
    .line 405
    invoke-static {v8, p1, v0, v1, v9}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :pswitch_13
    check-cast v10, Lb9/a;

    .line 410
    .line 411
    check-cast p1, Lf8/e;

    .line 412
    .line 413
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    new-instance p1, Lab/a;

    .line 417
    .line 418
    invoke-direct {p1, v10, v5}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 419
    .line 420
    .line 421
    const-string v0, "round_avatar"

    .line 422
    .line 423
    const-string v1, "\u5706\u89d2\u5934\u50cf"

    .line 424
    .line 425
    invoke-static {v8, p1, v0, v1, v9}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 426
    .line 427
    .line 428
    return-void

    .line 429
    :pswitch_14
    check-cast v10, Lca/f;

    .line 430
    .line 431
    check-cast p1, Lf8/e;

    .line 432
    .line 433
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v10}, Lca/f;->k()V

    .line 437
    .line 438
    .line 439
    return-void

    .line 440
    :pswitch_15
    check-cast v10, Lbb/e;

    .line 441
    .line 442
    check-cast p1, Lf8/e;

    .line 443
    .line 444
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    new-instance p1, Lab/a;

    .line 448
    .line 449
    invoke-direct {p1, v10, v2}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 450
    .line 451
    .line 452
    const-string v0, "real_name_tail"

    .line 453
    .line 454
    const-string v1, "\u5b9e\u540d\u5c3e\u5b57"

    .line 455
    .line 456
    invoke-static {v8, p1, v0, v1, v9}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 457
    .line 458
    .line 459
    return-void

    .line 460
    :pswitch_16
    check-cast v10, Lb9/a;

    .line 461
    .line 462
    check-cast p1, Lf8/e;

    .line 463
    .line 464
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    new-instance p1, Lab/a;

    .line 468
    .line 469
    invoke-direct {p1, v10, v6}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 470
    .line 471
    .line 472
    const-string v0, "chat_time_style"

    .line 473
    .line 474
    const-string v1, "\u4f1a\u8bdd\u65f6\u95f4\u6837\u5f0f"

    .line 475
    .line 476
    invoke-static {v8, p1, v0, v1, v9}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 477
    .line 478
    .line 479
    return-void

    .line 480
    :pswitch_17
    check-cast v10, Lab/c;

    .line 481
    .line 482
    check-cast p1, Lf8/e;

    .line 483
    .line 484
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    new-instance p1, Lab/a;

    .line 488
    .line 489
    const/4 v0, 0x0

    .line 490
    invoke-direct {p1, v10, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 491
    .line 492
    .line 493
    const-string v0, "quote_delete_clear"

    .line 494
    .line 495
    const-string v1, "\u5220\u9664\u952e\u6e05\u5f15\u7528"

    .line 496
    .line 497
    invoke-static {v8, p1, v0, v1, v9}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 498
    .line 499
    .line 500
    return-void

    .line 501
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_17
        :pswitch_0
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
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public c(Lud/r;Lud/n;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lke/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lae/h;

    .line 20
    .line 21
    iget-object v3, v2, Lae/h;->m:Lud/a;

    .line 22
    .line 23
    invoke-interface {p2}, Lud/n;->u()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-static {p2, v2, v3}, Lke/i;->t0(Lud/n;Lae/h;Lud/a;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    const-string v1, "Can\'t wrap try/catch for region: "

    .line 44
    .line 45
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p1, p2}, Lnd/b0;->K(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_2

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_2
    const/4 p1, 0x0

    .line 64
    return p1
.end method

.method public create(Lokhttp3/Call;)Lokhttp3/EventListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lke/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lokhttp3/EventListener;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lokhttp3/internal/Util;->a(Lokhttp3/EventListener;Lokhttp3/Call;)Lokhttp3/EventListener;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public d()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lke/h;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lke/h;->h:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Ljava/lang/Class;

    .line 9
    .line 10
    :try_start_0
    sget-object v0, Lj6/v;->a:Lj6/v;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lj6/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object v0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    new-instance v2, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v4, "Unable to create instance of "

    .line 23
    .line 24
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."

    .line 31
    .line 32
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v2

    .line 43
    :pswitch_0
    check-cast v1, Ljava/lang/reflect/Constructor;

    .line 44
    .line 45
    const-string v0, "\' with no args"

    .line 46
    .line 47
    const-string v2, "Failed to invoke constructor \'"

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    :try_start_1
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 54
    goto :goto_0

    .line 55
    :catch_1
    move-exception v0

    .line 56
    sget-object v1, Ll6/c;->a:Lf8/i;

    .line 57
    .line 58
    const-string v1, "Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    .line 59
    .line 60
    invoke-static {v1, v0}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catch_2
    move-exception v4

    .line 65
    new-instance v5, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v1}, Ll6/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v4}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {v0, v1}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :goto_0
    return-object v3

    .line 92
    :catch_3
    move-exception v3

    .line 93
    new-instance v4, Ljava/lang/RuntimeException;

    .line 94
    .line 95
    invoke-static {v1}, Ll6/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    new-instance v5, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-direct {v4, v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    throw v4

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method
