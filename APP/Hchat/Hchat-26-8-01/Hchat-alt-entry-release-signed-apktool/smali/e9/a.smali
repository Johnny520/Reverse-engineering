.class public final synthetic Le9/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lf8/d;
.implements Li0/e2;
.implements Lk7/f;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Le9/a;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Le9/a;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Le9/a;->h:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 8

    .line 1
    iget-object v0, p0, Le9/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls/z0;

    .line 4
    .line 5
    iget-object v1, p0, Le9/a;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ls/c;

    .line 8
    .line 9
    iget-boolean v2, v0, Ls/z0;->q:Z

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ls/z0;->h()V

    .line 14
    .line 15
    .line 16
    iget-wide v2, v0, Ls/z0;->o:J

    .line 17
    .line 18
    iget-wide v4, v1, Ls/c;->a:J

    .line 19
    .line 20
    invoke-static {v2, v3, v4, v5}, Ls/c;->a(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    iput-wide v2, v1, Ls/c;->a:J

    .line 25
    .line 26
    iget-wide v4, v0, Ls/z0;->n:J

    .line 27
    .line 28
    iget-wide v6, v1, Ls/c;->b:J

    .line 29
    .line 30
    add-long/2addr v2, v6

    .line 31
    invoke-virtual {v0, v4, v5, v2, v3}, Ls/z0;->g(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    xor-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    iput-boolean v1, v0, Ls/z0;->q:Z

    .line 38
    .line 39
    :cond_0
    iget-boolean v0, v0, Ls/z0;->q:Z

    .line 40
    .line 41
    return v0
.end method

.method public b(Ljava/lang/Object;)V
    .locals 9

    .line 1
    iget v0, p0, Le9/a;->g:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x3

    .line 5
    const/16 v3, 0xc

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/16 v5, 0x8

    .line 9
    .line 10
    sget-object v6, Lr8/c;->j:Lr8/c;

    .line 11
    .line 12
    iget-object v7, p0, Le9/a;->h:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v8, p0, Le9/a;->i:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    :pswitch_0
    check-cast v8, Lc9/g;

    .line 20
    .line 21
    check-cast v7, Lr8/g;

    .line 22
    .line 23
    check-cast p1, Lf8/e;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->l()Lk8/p;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    const-string p1, "[Hchat:KeywordNotification] \u6d88\u606f\u89c2\u5bdf API \u672a\u5c31\u7eea"

    .line 42
    .line 43
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v0, Le9/b;

    .line 48
    .line 49
    invoke-direct {v0, v7, v2}, Le9/b;-><init>(Lr8/g;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lk8/p;->e(Lk8/n;)La2/a;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {v8, p1}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    return-void

    .line 60
    :pswitch_1
    check-cast v8, Lc9/g;

    .line 61
    .line 62
    check-cast v7, Lr8/g;

    .line 63
    .line 64
    check-cast p1, Lf8/e;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->l()Lk8/p;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-nez p1, :cond_1

    .line 81
    .line 82
    const-string p1, "[Hchat:AutoReply] \u6d88\u606f\u89c2\u5bdf API \u672a\u5c31\u7eea"

    .line 83
    .line 84
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    new-instance v0, Le9/b;

    .line 89
    .line 90
    const/4 v1, 0x2

    .line 91
    invoke-direct {v0, v7, v1}, Le9/b;-><init>(Lr8/g;I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0}, Lk8/p;->e(Lk8/n;)La2/a;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v8, p1}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :goto_1
    sget-object p1, Leb/k;->a:Leb/k;

    .line 102
    .line 103
    invoke-virtual {p1, v7}, Leb/k;->j(Lr8/g;)V

    .line 104
    .line 105
    .line 106
    new-instance p1, Lc9/o1;

    .line 107
    .line 108
    invoke-direct {p1, v7}, Lc9/o1;-><init>(Lr8/g;)V

    .line 109
    .line 110
    .line 111
    sget-object v0, Leb/k;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 112
    .line 113
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    new-instance p1, La2/a;

    .line 117
    .line 118
    const/16 v0, 0x9

    .line 119
    .line 120
    invoke-direct {p1, v0}, La2/a;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8, p1}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_2
    check-cast v8, Lc9/g;

    .line 128
    .line 129
    check-cast v7, Lr8/g;

    .line 130
    .line 131
    check-cast p1, Lf8/e;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    sget-object p1, Lr8/e;->a:Landroid/os/Handler;

    .line 137
    .line 138
    new-instance p1, Lsh/v1;

    .line 139
    .line 140
    const/4 v0, 0x5

    .line 141
    invoke-direct {p1, v7, v0, v8}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    const-string v0, "protobuf_packet"

    .line 145
    .line 146
    const-string v1, "Protobuf"

    .line 147
    .line 148
    invoke-static {v5, p1, v0, v1, v6}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :pswitch_3
    check-cast v8, Lb9/a;

    .line 153
    .line 154
    check-cast v7, Lr8/g;

    .line 155
    .line 156
    check-cast p1, Lf8/e;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    iget-object p1, v8, Lb9/a;->f:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast p1, Lv8/q;

    .line 164
    .line 165
    if-eqz p1, :cond_2

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_2
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->l()Lk8/p;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    if-nez p1, :cond_3

    .line 180
    .line 181
    const-string p1, "[Hchat:AutoMessageForward] \u6d88\u606f\u89c2\u5bdf API \u672a\u5c31\u7eea"

    .line 182
    .line 183
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_3
    new-instance v0, Lv8/q;

    .line 188
    .line 189
    iget-object v1, v7, Lr8/g;->a:Landroid/content/Context;

    .line 190
    .line 191
    new-instance v3, Li2/y;

    .line 192
    .line 193
    const/16 v4, 0x1c

    .line 194
    .line 195
    invoke-direct {v3, v4}, Li2/y;-><init>(I)V

    .line 196
    .line 197
    .line 198
    invoke-direct {v0, v1, v3}, Lv8/q;-><init>(Landroid/content/Context;Li2/y;)V

    .line 199
    .line 200
    .line 201
    iput-object v0, v8, Lb9/a;->f:Ljava/lang/Object;

    .line 202
    .line 203
    new-instance v1, Lna/c;

    .line 204
    .line 205
    invoke-direct {v1, v0, v2}, Lna/c;-><init>(Ljava/lang/Object;I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, v1}, Lk8/p;->e(Lk8/n;)La2/a;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {v8, p1}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :goto_2
    return-void

    .line 216
    :pswitch_4
    check-cast v8, Lua/b;

    .line 217
    .line 218
    check-cast v7, Lr8/g;

    .line 219
    .line 220
    check-cast p1, Lf8/e;

    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    sget-object p1, Lr8/e;->a:Landroid/os/Handler;

    .line 226
    .line 227
    new-instance p1, Lsh/v1;

    .line 228
    .line 229
    invoke-direct {p1, v7, v1, v8}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    const-string v0, "auto_transfer"

    .line 233
    .line 234
    const-string v1, "\u81ea\u52a8\u6536\u6b3e"

    .line 235
    .line 236
    invoke-static {v5, p1, v0, v1, v6}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :pswitch_5
    check-cast v8, Lc9/g;

    .line 241
    .line 242
    check-cast v7, Lr8/g;

    .line 243
    .line 244
    check-cast p1, Lf8/e;

    .line 245
    .line 246
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->l()Lk8/p;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    if-nez p1, :cond_4

    .line 261
    .line 262
    const-string p1, "[Hchat:BlockAtAllNotification] \u6d88\u606f\u89c2\u5bdf API \u672a\u5c31\u7eea"

    .line 263
    .line 264
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_4
    new-instance v0, Le9/b;

    .line 269
    .line 270
    invoke-direct {v0, v7, v1}, Le9/b;-><init>(Lr8/g;I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, v0}, Lk8/p;->e(Lk8/n;)La2/a;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-virtual {v8, p1}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :goto_3
    return-void

    .line 281
    :pswitch_6
    check-cast v8, Ls8/c;

    .line 282
    .line 283
    check-cast v7, Lr8/g;

    .line 284
    .line 285
    check-cast p1, Lf8/e;

    .line 286
    .line 287
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    new-instance p1, Laa/c;

    .line 291
    .line 292
    const/16 v0, 0x1d

    .line 293
    .line 294
    invoke-direct {p1, v8, v0, v7}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    const-string v0, "anti_recall"

    .line 298
    .line 299
    const-string v1, "\u9632\u64a4\u56de"

    .line 300
    .line 301
    invoke-static {v3, p1, v0, v1, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :pswitch_7
    check-cast v8, Lob/f;

    .line 306
    .line 307
    check-cast v7, Lr8/g;

    .line 308
    .line 309
    check-cast p1, Lf8/e;

    .line 310
    .line 311
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    sget-object p1, Lr8/e;->a:Landroid/os/Handler;

    .line 315
    .line 316
    new-instance p1, Lc9/f;

    .line 317
    .line 318
    const/4 v0, 0x6

    .line 319
    invoke-direct {p1, v7, v0}, Lc9/f;-><init>(Lr8/g;I)V

    .line 320
    .line 321
    .line 322
    const-string v0, "shared:send_button"

    .line 323
    .line 324
    const-string v1, "\u804a\u5929\u53d1\u9001\u6309\u94ae"

    .line 325
    .line 326
    invoke-static {v5, p1, v0, v1, v6}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 327
    .line 328
    .line 329
    new-instance p1, Li/e0;

    .line 330
    .line 331
    const/16 v0, 0xa

    .line 332
    .line 333
    invoke-direct {p1, v8, v0}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 334
    .line 335
    .line 336
    const-string v0, "text_voice"

    .line 337
    .line 338
    const-string v1, "\u6587\u672c\u8f6c\u8bed\u97f3"

    .line 339
    .line 340
    invoke-static {v3, p1, v0, v1, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :pswitch_8
    check-cast v8, Lb9/a;

    .line 345
    .line 346
    check-cast v7, Lr8/g;

    .line 347
    .line 348
    check-cast p1, Lf8/e;

    .line 349
    .line 350
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    sget-object p1, Lr8/e;->a:Landroid/os/Handler;

    .line 354
    .line 355
    new-instance p1, Laa/c;

    .line 356
    .line 357
    const/16 v0, 0x16

    .line 358
    .line 359
    invoke-direct {p1, v8, v0, v7}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    const-string v0, "auto_redpacket"

    .line 363
    .line 364
    const-string v1, "\u81ea\u52a8\u62a2\u7ea2\u5305"

    .line 365
    .line 366
    invoke-static {v5, p1, v0, v1, v6}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 367
    .line 368
    .line 369
    return-void

    .line 370
    :pswitch_9
    check-cast v8, Lia/u;

    .line 371
    .line 372
    check-cast v7, Lr8/g;

    .line 373
    .line 374
    check-cast p1, Lf8/e;

    .line 375
    .line 376
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    new-instance p1, Laa/c;

    .line 380
    .line 381
    const/16 v0, 0x12

    .line 382
    .line 383
    invoke-direct {p1, v8, v0, v7}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    const-string v0, "moments_fake_interaction_sns_menu"

    .line 387
    .line 388
    const-string v1, "\u670b\u53cb\u5708\u4f2a\u4e92\u52a8"

    .line 389
    .line 390
    invoke-static {v3, p1, v0, v1, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :pswitch_a
    check-cast v8, Lc9/g;

    .line 395
    .line 396
    check-cast v7, Lr8/g;

    .line 397
    .line 398
    check-cast p1, Lf8/e;

    .line 399
    .line 400
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->l()Lk8/p;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    if-nez p1, :cond_5

    .line 415
    .line 416
    const-string p1, "[Hchat:CustomNotification] \u6d88\u606f\u89c2\u5bdf API \u672a\u5c31\u7eea"

    .line 417
    .line 418
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    goto :goto_4

    .line 422
    :cond_5
    new-instance v0, Le9/b;

    .line 423
    .line 424
    const/4 v1, 0x0

    .line 425
    invoke-direct {v0, v7, v1}, Le9/b;-><init>(Lr8/g;I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {p1, v0}, Lk8/p;->e(Lk8/n;)La2/a;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    invoke-virtual {v8, p1}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    :goto_4
    return-void

    .line 436
    nop

    .line 437
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public c(Ljava/io/InputStream;J)Ljava/lang/Object;
    .locals 64

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Le9/a;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lbc/q;

    .line 6
    .line 7
    iget-object v2, v0, Le9/a;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lbc/o;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v3, v2, Lbc/o;->b:Lbc/p;

    .line 15
    .line 16
    iget-object v2, v2, Lbc/o;->a:Ljava/lang/String;

    .line 17
    .line 18
    sget-object v4, Lbc/p;->i:Lbc/p;

    .line 19
    .line 20
    if-ne v3, v4, :cond_4b

    .line 21
    .line 22
    iget-object v1, v1, Lbc/q;->b:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v3, 0x0

    .line 29
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ldf/h;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const-string v4, ".arsc"

    .line 45
    .line 46
    invoke-virtual {v2, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_1

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    new-instance v4, Ldf/g;

    .line 55
    .line 56
    iget-object v3, v3, Ldf/h;->a:Lud/u;

    .line 57
    .line 58
    invoke-direct {v4, v3}, Ldf/g;-><init>(Lud/u;)V

    .line 59
    .line 60
    .line 61
    move-object v3, v4

    .line 62
    :goto_0
    if-eqz v3, :cond_0

    .line 63
    .line 64
    :cond_2
    if-eqz v3, :cond_4a

    .line 65
    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 67
    .line 68
    .line 69
    move-result-wide v1

    .line 70
    new-instance v4, Ldf/e;

    .line 71
    .line 72
    new-instance v6, Ljava/io/BufferedInputStream;

    .line 73
    .line 74
    const v7, 0x8000

    .line 75
    .line 76
    .line 77
    move-object/from16 v8, p1

    .line 78
    .line 79
    invoke-direct {v6, v8, v7}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v4, v6}, Ldf/e;-><init>(Ljava/io/InputStream;)V

    .line 83
    .line 84
    .line 85
    iput-object v4, v3, Ldf/b;->b:Ldf/e;

    .line 86
    .line 87
    new-instance v4, Ldf/i;

    .line 88
    .line 89
    iget-object v6, v3, Ldf/g;->d:Lud/u;

    .line 90
    .line 91
    iget-object v7, v6, Lud/u;->a:Lbc/g;

    .line 92
    .line 93
    iget-object v8, v7, Lbc/g;->K:Lad/c;

    .line 94
    .line 95
    invoke-direct {v4, v8}, Ldf/i;-><init>(Lad/c;)V

    .line 96
    .line 97
    .line 98
    iput-object v4, v3, Ldf/g;->e:Ldf/i;

    .line 99
    .line 100
    sget-object v4, Ldf/g;->g:Lmh/b;

    .line 101
    .line 102
    iget-object v8, v3, Ldf/b;->b:Ldf/e;

    .line 103
    .line 104
    const-string v9, "Not a table chunk"

    .line 105
    .line 106
    const/4 v10, 0x2

    .line 107
    invoke-virtual {v8, v10, v9}, Ldf/e;->a(ILjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object v8, v3, Ldf/b;->b:Ldf/e;

    .line 111
    .line 112
    const-string v9, "Unexpected table header size"

    .line 113
    .line 114
    const/16 v11, 0xc

    .line 115
    .line 116
    invoke-virtual {v8, v11, v9}, Ldf/e;->a(ILjava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget-object v8, v3, Ldf/b;->b:Ldf/e;

    .line 120
    .line 121
    invoke-virtual {v8}, Ldf/e;->e()I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    iget-object v9, v3, Ldf/b;->b:Ldf/e;

    .line 126
    .line 127
    invoke-virtual {v9}, Ldf/e;->e()I

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    const/4 v13, 0x0

    .line 132
    :goto_1
    iget-object v14, v3, Ldf/b;->b:Ldf/e;

    .line 133
    .line 134
    move/from16 p2, v13

    .line 135
    .line 136
    iget-wide v12, v14, Ldf/e;->h:J

    .line 137
    .line 138
    move-object v15, v6

    .line 139
    const/16 p3, 0x0

    .line 140
    .line 141
    int-to-long v5, v8

    .line 142
    cmp-long v5, v12, v5

    .line 143
    .line 144
    if-gez v5, :cond_47

    .line 145
    .line 146
    invoke-virtual {v14}, Ldf/e;->c()I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    iget-object v6, v3, Ldf/b;->b:Ldf/e;

    .line 151
    .line 152
    invoke-virtual {v6}, Ldf/e;->c()I

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    iget-object v14, v3, Ldf/b;->b:Ldf/e;

    .line 157
    .line 158
    invoke-virtual {v14}, Ldf/e;->e()I

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    move/from16 v16, v10

    .line 163
    .line 164
    int-to-long v10, v14

    .line 165
    const-wide v17, 0xffffffffL

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    and-long v10, v10, v17

    .line 171
    .line 172
    add-long/2addr v10, v12

    .line 173
    const/4 v14, 0x1

    .line 174
    if-eq v5, v14, :cond_46

    .line 175
    .line 176
    const/16 v14, 0x200

    .line 177
    .line 178
    if-eq v5, v14, :cond_3

    .line 179
    .line 180
    move-wide/from16 v26, v1

    .line 181
    .line 182
    move-object/from16 v42, v7

    .line 183
    .line 184
    move/from16 v28, v8

    .line 185
    .line 186
    move/from16 v29, v9

    .line 187
    .line 188
    move-object/from16 v40, v15

    .line 189
    .line 190
    goto/16 :goto_30

    .line 191
    .line 192
    :cond_3
    iget-object v5, v3, Ldf/b;->b:Ldf/e;

    .line 193
    .line 194
    const/16 v14, 0x11c

    .line 195
    .line 196
    if-lt v6, v14, :cond_45

    .line 197
    .line 198
    invoke-virtual {v5}, Ldf/e;->e()I

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    iget-object v14, v3, Ldf/b;->b:Ldf/e;

    .line 203
    .line 204
    const/16 v0, 0x80

    .line 205
    .line 206
    invoke-virtual {v14, v0}, Ldf/e;->i(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v14

    .line 210
    iget-object v0, v3, Ldf/b;->b:Ldf/e;

    .line 211
    .line 212
    invoke-virtual {v0}, Ldf/e;->e()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    move-wide/from16 v26, v1

    .line 217
    .line 218
    int-to-long v0, v0

    .line 219
    add-long/2addr v0, v12

    .line 220
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 221
    .line 222
    invoke-virtual {v2}, Ldf/e;->e()I

    .line 223
    .line 224
    .line 225
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 226
    .line 227
    invoke-virtual {v2}, Ldf/e;->e()I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    move/from16 v28, v8

    .line 232
    .line 233
    move/from16 v29, v9

    .line 234
    .line 235
    int-to-long v8, v2

    .line 236
    add-long/2addr v8, v12

    .line 237
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 238
    .line 239
    invoke-virtual {v2}, Ldf/e;->e()I

    .line 240
    .line 241
    .line 242
    const/16 v2, 0x120

    .line 243
    .line 244
    if-lt v6, v2, :cond_4

    .line 245
    .line 246
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 247
    .line 248
    invoke-virtual {v2}, Ldf/e;->e()I

    .line 249
    .line 250
    .line 251
    :cond_4
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 252
    .line 253
    move/from16 v30, v5

    .line 254
    .line 255
    int-to-long v5, v6

    .line 256
    add-long/2addr v12, v5

    .line 257
    const-string v5, "package header end"

    .line 258
    .line 259
    invoke-virtual {v2, v12, v13, v5}, Ldf/e;->k(JLjava/lang/String;)V

    .line 260
    .line 261
    .line 262
    const-wide/16 v5, 0x0

    .line 263
    .line 264
    cmp-long v2, v0, v5

    .line 265
    .line 266
    if-eqz v2, :cond_5

    .line 267
    .line 268
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 269
    .line 270
    const-string v12, "Expected typeStrings string pool"

    .line 271
    .line 272
    invoke-virtual {v2, v0, v1, v12}, Ldf/e;->k(JLjava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3}, Ldf/b;->b()Ldf/a;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    goto :goto_2

    .line 280
    :cond_5
    move-object/from16 v0, p3

    .line 281
    .line 282
    :goto_2
    cmp-long v1, v8, v5

    .line 283
    .line 284
    if-eqz v1, :cond_6

    .line 285
    .line 286
    iget-object v1, v3, Ldf/b;->b:Ldf/e;

    .line 287
    .line 288
    const-string v2, "Expected keyStrings string pool"

    .line 289
    .line 290
    invoke-virtual {v1, v8, v9, v2}, Ldf/e;->k(JLjava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v3}, Ldf/b;->b()Ldf/a;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    goto :goto_3

    .line 298
    :cond_6
    move-object/from16 v1, p3

    .line 299
    .line 300
    :goto_3
    iget-object v2, v3, Ldf/g;->e:Ldf/i;

    .line 301
    .line 302
    iget-object v5, v2, Ldf/i;->b:Lad/c;

    .line 303
    .line 304
    iget-object v5, v5, Lad/c;->a:Ljava/util/Set;

    .line 305
    .line 306
    sget-object v6, Lzc/a;->g:Lzc/a;

    .line 307
    .line 308
    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    if-eqz v5, :cond_8

    .line 313
    .line 314
    sget-object v5, Lkd/d;->a:Ljava/util/regex/Pattern;

    .line 315
    .line 316
    sget-object v5, Lxe/q;->b:Lxe/q;

    .line 317
    .line 318
    if-eqz v14, :cond_7

    .line 319
    .line 320
    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    if-nez v5, :cond_7

    .line 325
    .line 326
    sget-object v5, Lkd/d;->c:Ljava/util/HashSet;

    .line 327
    .line 328
    invoke-virtual {v5, v14}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    if-nez v5, :cond_7

    .line 333
    .line 334
    sget-object v5, Lkd/d;->b:Ljava/util/regex/Pattern;

    .line 335
    .line 336
    invoke-virtual {v5, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 337
    .line 338
    .line 339
    move-result-object v5

    .line 340
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    if-eqz v5, :cond_7

    .line 345
    .line 346
    goto :goto_4

    .line 347
    :cond_7
    sget-object v5, Lad/c;->c:Lmh/b;

    .line 348
    .line 349
    const-string v6, "App package \'{}\' has invalid format and will be ignored"

    .line 350
    .line 351
    invoke-interface {v5, v14, v6}, Lmh/b;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    const-string v5, "INVALID_PACKAGE"

    .line 355
    .line 356
    goto :goto_5

    .line 357
    :cond_8
    :goto_4
    move-object v5, v14

    .line 358
    :goto_5
    iput-object v5, v2, Ldf/i;->c:Ljava/lang/String;

    .line 359
    .line 360
    :goto_6
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 361
    .line 362
    iget-wide v5, v2, Ldf/e;->h:J

    .line 363
    .line 364
    cmp-long v8, v5, v10

    .line 365
    .line 366
    if-gez v8, :cond_44

    .line 367
    .line 368
    invoke-virtual {v2}, Ldf/e;->c()I

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 373
    .line 374
    .line 375
    move-result-object v8

    .line 376
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 377
    .line 378
    .line 379
    move-result-object v9

    .line 380
    const-string v12, "res package chunk start at {} type {}"

    .line 381
    .line 382
    invoke-interface {v4, v8, v12, v9}, Lmh/b;->p(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    if-eqz v2, :cond_43

    .line 386
    .line 387
    const/16 v8, 0x10

    .line 388
    .line 389
    packed-switch v2, :pswitch_data_0

    .line 390
    .line 391
    .line 392
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    const-string v6, "Unknown chunk type {} encountered at offset {}"

    .line 401
    .line 402
    invoke-interface {v4, v2, v6, v5}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    :goto_7
    move-object/from16 v62, v0

    .line 406
    .line 407
    move-object/from16 v63, v1

    .line 408
    .line 409
    move-object/from16 v42, v7

    .line 410
    .line 411
    move-wide/from16 v33, v10

    .line 412
    .line 413
    move-object/from16 v23, v14

    .line 414
    .line 415
    move-object/from16 v40, v15

    .line 416
    .line 417
    const/4 v8, 0x1

    .line 418
    goto/16 :goto_2f

    .line 419
    .line 420
    :pswitch_0
    const-string v2, "parsing staged alias chunk starting at offset {}"

    .line 421
    .line 422
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 423
    .line 424
    .line 425
    move-result-object v8

    .line 426
    invoke-interface {v4, v2, v8}, Lmh/b;->k(Ljava/lang/String;Ljava/lang/Long;)V

    .line 427
    .line 428
    .line 429
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 430
    .line 431
    invoke-virtual {v2}, Ldf/e;->c()I

    .line 432
    .line 433
    .line 434
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 435
    .line 436
    invoke-virtual {v2}, Ldf/e;->e()I

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    int-to-long v8, v2

    .line 441
    add-long/2addr v5, v8

    .line 442
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 443
    .line 444
    invoke-virtual {v2}, Ldf/e;->e()I

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    const/4 v8, 0x0

    .line 449
    :goto_8
    iget-object v9, v3, Ldf/b;->b:Ldf/e;

    .line 450
    .line 451
    if-ge v8, v2, :cond_9

    .line 452
    .line 453
    invoke-virtual {v9}, Ldf/e;->e()I

    .line 454
    .line 455
    .line 456
    move-result v9

    .line 457
    iget-object v12, v3, Ldf/b;->b:Ldf/e;

    .line 458
    .line 459
    invoke-virtual {v12}, Ldf/e;->e()I

    .line 460
    .line 461
    .line 462
    move-result v12

    .line 463
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 468
    .line 469
    .line 470
    move-result-object v12

    .line 471
    const-string v13, "Staged alias: stagedResId {} finalizedResId {}"

    .line 472
    .line 473
    invoke-interface {v4, v9, v13, v12}, Lmh/b;->y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    add-int/lit8 v8, v8, 0x1

    .line 477
    .line 478
    goto :goto_8

    .line 479
    :cond_9
    const-string v2, "staged alias chunk end"

    .line 480
    .line 481
    invoke-virtual {v9, v5, v6, v2}, Ldf/e;->k(JLjava/lang/String;)V

    .line 482
    .line 483
    .line 484
    goto :goto_7

    .line 485
    :pswitch_1
    new-instance v0, Ljava/io/IOException;

    .line 486
    .line 487
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    const-string v2, "Encountered unsupported chunk type RES_TABLE_TYPE_OVERLAY_POLICY at offset 0x%x "

    .line 496
    .line 497
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    throw v0

    .line 505
    :pswitch_2
    const-string v2, "parsing overlay type chunk starting at offset {}"

    .line 506
    .line 507
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 508
    .line 509
    .line 510
    move-result-object v8

    .line 511
    invoke-interface {v4, v2, v8}, Lmh/b;->k(Ljava/lang/String;Ljava/lang/Long;)V

    .line 512
    .line 513
    .line 514
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 515
    .line 516
    invoke-virtual {v2}, Ldf/e;->c()I

    .line 517
    .line 518
    .line 519
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 520
    .line 521
    invoke-virtual {v2}, Ldf/e;->e()I

    .line 522
    .line 523
    .line 524
    move-result v2

    .line 525
    int-to-long v8, v2

    .line 526
    add-long/2addr v5, v8

    .line 527
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 528
    .line 529
    const/16 v8, 0x100

    .line 530
    .line 531
    invoke-virtual {v2, v8}, Ldf/e;->i(I)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    iget-object v9, v3, Ldf/b;->b:Ldf/e;

    .line 536
    .line 537
    invoke-virtual {v9, v8}, Ldf/e;->i(I)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v8

    .line 541
    const-string v9, "Overlay header data: name={} actor={}"

    .line 542
    .line 543
    invoke-interface {v4, v2, v9, v8}, Lmh/b;->p(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 547
    .line 548
    const-string v8, "overlay chunk end"

    .line 549
    .line 550
    invoke-virtual {v2, v5, v6, v8}, Ldf/e;->k(JLjava/lang/String;)V

    .line 551
    .line 552
    .line 553
    goto/16 :goto_7

    .line 554
    .line 555
    :pswitch_3
    const-string v2, "parsing library type chunk starting at offset {}"

    .line 556
    .line 557
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 558
    .line 559
    .line 560
    move-result-object v8

    .line 561
    invoke-interface {v4, v2, v8}, Lmh/b;->k(Ljava/lang/String;Ljava/lang/Long;)V

    .line 562
    .line 563
    .line 564
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 565
    .line 566
    const-string v8, "Unexpected header size"

    .line 567
    .line 568
    const/16 v9, 0xc

    .line 569
    .line 570
    invoke-virtual {v2, v9, v8}, Ldf/e;->a(ILjava/lang/String;)V

    .line 571
    .line 572
    .line 573
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 574
    .line 575
    invoke-virtual {v2}, Ldf/e;->e()I

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    int-to-long v12, v2

    .line 580
    add-long/2addr v12, v5

    .line 581
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 582
    .line 583
    invoke-virtual {v2}, Ldf/e;->e()I

    .line 584
    .line 585
    .line 586
    move-result v2

    .line 587
    const/4 v8, 0x0

    .line 588
    :goto_9
    iget-object v9, v3, Ldf/b;->b:Ldf/e;

    .line 589
    .line 590
    if-ge v8, v2, :cond_b

    .line 591
    .line 592
    invoke-virtual {v9}, Ldf/e;->e()I

    .line 593
    .line 594
    .line 595
    move-result v9

    .line 596
    move/from16 v20, v2

    .line 597
    .line 598
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 599
    .line 600
    move/from16 v21, v8

    .line 601
    .line 602
    const/16 v8, 0x80

    .line 603
    .line 604
    invoke-virtual {v2, v8}, Ldf/e;->i(I)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 609
    .line 610
    .line 611
    move-result-object v9

    .line 612
    invoke-interface {v4, v9, v2}, Lmh/b;->f(Ljava/lang/Integer;Ljava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 616
    .line 617
    iget-wide v8, v2, Ldf/e;->h:J

    .line 618
    .line 619
    cmp-long v2, v8, v12

    .line 620
    .line 621
    if-gtz v2, :cond_a

    .line 622
    .line 623
    add-int/lit8 v8, v21, 0x1

    .line 624
    .line 625
    move/from16 v2, v20

    .line 626
    .line 627
    goto :goto_9

    .line 628
    :cond_a
    const-string v0, "reading after chunk end"

    .line 629
    .line 630
    invoke-static {v0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    return-object p3

    .line 634
    :cond_b
    iget-wide v8, v9, Ldf/e;->h:J

    .line 635
    .line 636
    cmp-long v2, v8, v12

    .line 637
    .line 638
    if-nez v2, :cond_c

    .line 639
    .line 640
    :goto_a
    goto/16 :goto_7

    .line 641
    .line 642
    :cond_c
    new-instance v0, Ljava/io/IOException;

    .line 643
    .line 644
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    const-string v2, "Error reading library chunk at offset 0x%x"

    .line 653
    .line 654
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v1

    .line 658
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    throw v0

    .line 662
    :pswitch_4
    move v2, v8

    .line 663
    iget-object v8, v3, Ldf/b;->b:Ldf/e;

    .line 664
    .line 665
    const-string v9, "Unexpected type spec header size"

    .line 666
    .line 667
    invoke-virtual {v8, v2, v9}, Ldf/e;->a(ILjava/lang/String;)V

    .line 668
    .line 669
    .line 670
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 671
    .line 672
    invoke-virtual {v2}, Ldf/e;->e()I

    .line 673
    .line 674
    .line 675
    move-result v2

    .line 676
    int-to-long v8, v2

    .line 677
    add-long/2addr v8, v5

    .line 678
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 679
    .line 680
    invoke-virtual {v2}, Ldf/e;->g()I

    .line 681
    .line 682
    .line 683
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 684
    .line 685
    const-wide/16 v12, 0x3

    .line 686
    .line 687
    invoke-virtual {v2, v12, v13}, Ldf/e;->skip(J)J

    .line 688
    .line 689
    .line 690
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 691
    .line 692
    invoke-virtual {v2}, Ldf/e;->e()I

    .line 693
    .line 694
    .line 695
    move-result v2

    .line 696
    const/4 v12, 0x0

    .line 697
    :goto_b
    iget-object v13, v3, Ldf/b;->b:Ldf/e;

    .line 698
    .line 699
    if-ge v12, v2, :cond_d

    .line 700
    .line 701
    invoke-virtual {v13}, Ldf/e;->e()I

    .line 702
    .line 703
    .line 704
    add-int/lit8 v12, v12, 0x1

    .line 705
    .line 706
    goto :goto_b

    .line 707
    :cond_d
    iget-wide v12, v13, Ldf/e;->h:J

    .line 708
    .line 709
    cmp-long v2, v12, v8

    .line 710
    .line 711
    if-nez v2, :cond_e

    .line 712
    .line 713
    goto :goto_a

    .line 714
    :cond_e
    new-instance v0, Ljava/io/IOException;

    .line 715
    .line 716
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    const-string v2, "Error reading type spec chunk at offset 0x%x"

    .line 725
    .line 726
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    throw v0

    .line 734
    :pswitch_5
    move v2, v8

    .line 735
    iget-object v8, v3, Ldf/b;->b:Ldf/e;

    .line 736
    .line 737
    invoke-virtual {v8}, Ldf/e;->c()I

    .line 738
    .line 739
    .line 740
    iget-object v8, v3, Ldf/b;->b:Ldf/e;

    .line 741
    .line 742
    invoke-virtual {v8}, Ldf/e;->e()I

    .line 743
    .line 744
    .line 745
    move-result v8

    .line 746
    int-to-long v8, v8

    .line 747
    and-long v8, v8, v17

    .line 748
    .line 749
    add-long v12, v5, v8

    .line 750
    .line 751
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 752
    .line 753
    long-to-int v8, v8

    .line 754
    invoke-virtual {v2, v8}, Ldf/e;->mark(I)V

    .line 755
    .line 756
    .line 757
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 758
    .line 759
    invoke-virtual {v2}, Ldf/e;->g()I

    .line 760
    .line 761
    .line 762
    move-result v2

    .line 763
    add-int/lit8 v8, v2, -0x1

    .line 764
    .line 765
    invoke-virtual {v0, v8}, Ldf/a;->a(I)Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v9

    .line 769
    move/from16 v31, v2

    .line 770
    .line 771
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 772
    .line 773
    invoke-virtual {v2}, Ldf/e;->g()I

    .line 774
    .line 775
    .line 776
    move-result v2

    .line 777
    and-int/lit8 v20, v2, 0x1

    .line 778
    .line 779
    if-eqz v20, :cond_f

    .line 780
    .line 781
    const/16 v32, 0x1

    .line 782
    .line 783
    goto :goto_c

    .line 784
    :cond_f
    const/16 v32, 0x0

    .line 785
    .line 786
    :goto_c
    and-int/lit8 v2, v2, 0x2

    .line 787
    .line 788
    if-eqz v2, :cond_10

    .line 789
    .line 790
    const/16 v20, 0x1

    .line 791
    .line 792
    goto :goto_d

    .line 793
    :cond_10
    const/16 v20, 0x0

    .line 794
    .line 795
    :goto_d
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 796
    .line 797
    invoke-virtual {v2}, Ldf/e;->c()I

    .line 798
    .line 799
    .line 800
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 801
    .line 802
    invoke-virtual {v2}, Ldf/e;->e()I

    .line 803
    .line 804
    .line 805
    move-result v2

    .line 806
    move-wide/from16 v21, v5

    .line 807
    .line 808
    iget-object v5, v3, Ldf/b;->b:Ldf/e;

    .line 809
    .line 810
    invoke-virtual {v5}, Ldf/e;->e()I

    .line 811
    .line 812
    .line 813
    move-result v5

    .line 814
    int-to-long v5, v5

    .line 815
    add-long v5, v21, v5

    .line 816
    .line 817
    move-object/from16 v23, v14

    .line 818
    .line 819
    iget-object v14, v3, Ldf/b;->b:Ldf/e;

    .line 820
    .line 821
    move-wide/from16 v33, v10

    .line 822
    .line 823
    iget-wide v10, v14, Ldf/e;->h:J

    .line 824
    .line 825
    invoke-virtual {v14}, Ldf/e;->e()I

    .line 826
    .line 827
    .line 828
    move-result v14

    .line 829
    move-wide/from16 v21, v10

    .line 830
    .line 831
    const/4 v10, 0x4

    .line 832
    if-lt v14, v10, :cond_42

    .line 833
    .line 834
    add-int/lit8 v11, v14, -0x4

    .line 835
    .line 836
    const/16 v10, 0x34

    .line 837
    .line 838
    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    .line 839
    .line 840
    .line 841
    move-result v10

    .line 842
    new-array v10, v10, [B

    .line 843
    .line 844
    move-object/from16 v25, v15

    .line 845
    .line 846
    iget-object v15, v3, Ldf/b;->b:Ldf/e;

    .line 847
    .line 848
    move-wide/from16 v60, v12

    .line 849
    .line 850
    iget-wide v12, v15, Ldf/e;->h:J

    .line 851
    .line 852
    move-wide/from16 v35, v12

    .line 853
    .line 854
    int-to-long v12, v11

    .line 855
    add-long v12, v35, v12

    .line 856
    .line 857
    iput-wide v12, v15, Ldf/e;->h:J

    .line 858
    .line 859
    if-ltz v11, :cond_41

    .line 860
    .line 861
    const/4 v12, 0x0

    .line 862
    :goto_e
    if-ge v12, v11, :cond_12

    .line 863
    .line 864
    iget-object v13, v15, Ldf/e;->g:Ljava/io/InputStream;

    .line 865
    .line 866
    move/from16 v35, v11

    .line 867
    .line 868
    sub-int v11, v35, v12

    .line 869
    .line 870
    invoke-virtual {v13, v10, v12, v11}, Ljava/io/InputStream;->read([BII)I

    .line 871
    .line 872
    .line 873
    move-result v11

    .line 874
    if-ltz v11, :cond_11

    .line 875
    .line 876
    add-int/2addr v12, v11

    .line 877
    move/from16 v11, v35

    .line 878
    .line 879
    goto :goto_e

    .line 880
    :cond_11
    invoke-static {}, Lj8/o;->a()V

    .line 881
    .line 882
    .line 883
    return-object p3

    .line 884
    :cond_12
    new-instance v11, Ldf/e;

    .line 885
    .line 886
    new-instance v12, Ljava/io/ByteArrayInputStream;

    .line 887
    .line 888
    invoke-direct {v12, v10}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 889
    .line 890
    .line 891
    invoke-direct {v11, v12}, Ldf/e;-><init>(Ljava/io/InputStream;)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v11}, Ldf/e;->c()I

    .line 895
    .line 896
    .line 897
    move-result v10

    .line 898
    int-to-short v10, v10

    .line 899
    invoke-virtual {v11}, Ldf/e;->c()I

    .line 900
    .line 901
    .line 902
    move-result v12

    .line 903
    int-to-short v12, v12

    .line 904
    invoke-virtual {v11}, Ldf/e;->g()I

    .line 905
    .line 906
    .line 907
    move-result v13

    .line 908
    int-to-byte v13, v13

    .line 909
    invoke-virtual {v11}, Ldf/e;->g()I

    .line 910
    .line 911
    .line 912
    move-result v15

    .line 913
    int-to-byte v15, v15

    .line 914
    move/from16 v36, v10

    .line 915
    .line 916
    const/16 v10, 0x61

    .line 917
    .line 918
    invoke-static {v13, v15, v10}, Ldf/g;->f(BBC)[C

    .line 919
    .line 920
    .line 921
    move-result-object v38

    .line 922
    invoke-virtual {v11}, Ldf/e;->g()I

    .line 923
    .line 924
    .line 925
    move-result v10

    .line 926
    int-to-byte v10, v10

    .line 927
    invoke-virtual {v11}, Ldf/e;->g()I

    .line 928
    .line 929
    .line 930
    move-result v13

    .line 931
    int-to-byte v13, v13

    .line 932
    const/16 v15, 0x30

    .line 933
    .line 934
    invoke-static {v10, v13, v15}, Ldf/g;->f(BBC)[C

    .line 935
    .line 936
    .line 937
    move-result-object v39

    .line 938
    invoke-virtual {v11}, Ldf/e;->g()I

    .line 939
    .line 940
    .line 941
    move-result v10

    .line 942
    int-to-byte v10, v10

    .line 943
    invoke-virtual {v11}, Ldf/e;->g()I

    .line 944
    .line 945
    .line 946
    move-result v13

    .line 947
    int-to-byte v13, v13

    .line 948
    invoke-virtual {v11}, Ldf/e;->c()I

    .line 949
    .line 950
    .line 951
    move-result v42

    .line 952
    invoke-virtual {v11}, Ldf/e;->g()I

    .line 953
    .line 954
    .line 955
    move-result v15

    .line 956
    int-to-byte v15, v15

    .line 957
    move/from16 v40, v10

    .line 958
    .line 959
    invoke-virtual {v11}, Ldf/e;->g()I

    .line 960
    .line 961
    .line 962
    move-result v10

    .line 963
    int-to-byte v10, v10

    .line 964
    move/from16 v44, v10

    .line 965
    .line 966
    invoke-virtual {v11}, Ldf/e;->g()I

    .line 967
    .line 968
    .line 969
    move-result v10

    .line 970
    int-to-byte v10, v10

    .line 971
    move/from16 v45, v10

    .line 972
    .line 973
    invoke-virtual {v11}, Ldf/e;->g()I

    .line 974
    .line 975
    .line 976
    move-result v10

    .line 977
    int-to-byte v10, v10

    .line 978
    move/from16 v46, v10

    .line 979
    .line 980
    invoke-virtual {v11}, Ldf/e;->c()I

    .line 981
    .line 982
    .line 983
    move-result v10

    .line 984
    int-to-short v10, v10

    .line 985
    move/from16 v47, v10

    .line 986
    .line 987
    invoke-virtual {v11}, Ldf/e;->c()I

    .line 988
    .line 989
    .line 990
    move-result v10

    .line 991
    int-to-short v10, v10

    .line 992
    move/from16 v48, v10

    .line 993
    .line 994
    invoke-virtual {v11}, Ldf/e;->c()I

    .line 995
    .line 996
    .line 997
    move-result v10

    .line 998
    int-to-short v10, v10

    .line 999
    invoke-virtual {v11}, Ldf/e;->c()I

    .line 1000
    .line 1001
    .line 1002
    move/from16 v49, v10

    .line 1003
    .line 1004
    invoke-virtual {v11}, Ldf/e;->g()I

    .line 1005
    .line 1006
    .line 1007
    move-result v10

    .line 1008
    int-to-byte v10, v10

    .line 1009
    move/from16 v50, v10

    .line 1010
    .line 1011
    invoke-virtual {v11}, Ldf/e;->g()I

    .line 1012
    .line 1013
    .line 1014
    move-result v10

    .line 1015
    int-to-byte v10, v10

    .line 1016
    move/from16 v51, v10

    .line 1017
    .line 1018
    invoke-virtual {v11}, Ldf/e;->c()I

    .line 1019
    .line 1020
    .line 1021
    move-result v10

    .line 1022
    int-to-short v10, v10

    .line 1023
    move/from16 v52, v10

    .line 1024
    .line 1025
    invoke-virtual {v11}, Ldf/e;->c()I

    .line 1026
    .line 1027
    .line 1028
    move-result v10

    .line 1029
    int-to-short v10, v10

    .line 1030
    move/from16 v53, v10

    .line 1031
    .line 1032
    invoke-virtual {v11}, Ldf/e;->c()I

    .line 1033
    .line 1034
    .line 1035
    move-result v10

    .line 1036
    int-to-short v10, v10

    .line 1037
    move/from16 v54, v10

    .line 1038
    .line 1039
    const/4 v10, 0x4

    .line 1040
    invoke-static {v10, v11}, Ldf/g;->e(ILdf/e;)Ljava/lang/String;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v35

    .line 1044
    invoke-virtual/range {v35 .. v35}, Ljava/lang/String;->toCharArray()[C

    .line 1045
    .line 1046
    .line 1047
    move-result-object v10

    .line 1048
    move/from16 v37, v12

    .line 1049
    .line 1050
    const/16 v12, 0x8

    .line 1051
    .line 1052
    invoke-static {v12, v11}, Ldf/g;->e(ILdf/e;)Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v12

    .line 1056
    invoke-virtual {v12}, Ljava/lang/String;->toCharArray()[C

    .line 1057
    .line 1058
    .line 1059
    move-result-object v12

    .line 1060
    move-object/from16 v35, v11

    .line 1061
    .line 1062
    invoke-virtual/range {v35 .. v35}, Ldf/e;->g()I

    .line 1063
    .line 1064
    .line 1065
    move-result v11

    .line 1066
    int-to-byte v11, v11

    .line 1067
    move/from16 v57, v11

    .line 1068
    .line 1069
    invoke-virtual/range {v35 .. v35}, Ldf/e;->g()I

    .line 1070
    .line 1071
    .line 1072
    move-result v11

    .line 1073
    int-to-byte v11, v11

    .line 1074
    invoke-virtual/range {v35 .. v35}, Ldf/e;->c()I

    .line 1075
    .line 1076
    .line 1077
    move/from16 v58, v11

    .line 1078
    .line 1079
    iget-object v11, v3, Ldf/b;->b:Ldf/e;

    .line 1080
    .line 1081
    move-object/from16 v62, v0

    .line 1082
    .line 1083
    move-object/from16 v63, v1

    .line 1084
    .line 1085
    int-to-long v0, v14

    .line 1086
    add-long v0, v21, v0

    .line 1087
    .line 1088
    move/from16 v41, v13

    .line 1089
    .line 1090
    const-string v13, "Config skip trailing bytes"

    .line 1091
    .line 1092
    invoke-virtual {v11, v0, v1, v13}, Ldf/e;->b(JLjava/lang/String;)V

    .line 1093
    .line 1094
    .line 1095
    new-instance v35, Lef/a;

    .line 1096
    .line 1097
    array-length v0, v10

    .line 1098
    if-nez v0, :cond_13

    .line 1099
    .line 1100
    move-object/from16 v55, p3

    .line 1101
    .line 1102
    goto :goto_f

    .line 1103
    :cond_13
    move-object/from16 v55, v10

    .line 1104
    .line 1105
    :goto_f
    array-length v0, v12

    .line 1106
    if-nez v0, :cond_14

    .line 1107
    .line 1108
    move-object/from16 v56, p3

    .line 1109
    .line 1110
    :goto_10
    move/from16 v59, v14

    .line 1111
    .line 1112
    move/from16 v43, v15

    .line 1113
    .line 1114
    goto :goto_11

    .line 1115
    :cond_14
    move-object/from16 v56, v12

    .line 1116
    .line 1117
    goto :goto_10

    .line 1118
    :goto_11
    invoke-direct/range {v35 .. v59}, Lef/a;-><init>(SS[C[CBBIBBBBSSSBBSSS[C[CBBI)V

    .line 1119
    .line 1120
    .line 1121
    move-object/from16 v0, v35

    .line 1122
    .line 1123
    iget-boolean v1, v0, Lef/a;->k:Z

    .line 1124
    .line 1125
    if-eqz v1, :cond_15

    .line 1126
    .line 1127
    const-string v1, "Invalid config flags detected: {}{}"

    .line 1128
    .line 1129
    iget-object v10, v0, Lef/a;->l:Ljava/lang/String;

    .line 1130
    .line 1131
    invoke-interface {v4, v9, v1, v10}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1132
    .line 1133
    .line 1134
    :cond_15
    new-instance v1, Ljava/util/ArrayList;

    .line 1135
    .line 1136
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1137
    .line 1138
    .line 1139
    if-eqz v32, :cond_16

    .line 1140
    .line 1141
    const/4 v10, 0x0

    .line 1142
    :goto_12
    if-ge v10, v2, :cond_19

    .line 1143
    .line 1144
    iget-object v11, v3, Ldf/b;->b:Ldf/e;

    .line 1145
    .line 1146
    invoke-virtual {v11}, Ldf/e;->c()I

    .line 1147
    .line 1148
    .line 1149
    move-result v11

    .line 1150
    iget-object v12, v3, Ldf/b;->b:Ldf/e;

    .line 1151
    .line 1152
    invoke-virtual {v12}, Ldf/e;->c()I

    .line 1153
    .line 1154
    .line 1155
    move-result v12

    .line 1156
    const/16 v24, 0x4

    .line 1157
    .line 1158
    mul-int/lit8 v12, v12, 0x4

    .line 1159
    .line 1160
    new-instance v13, Ldf/f;

    .line 1161
    .line 1162
    invoke-direct {v13, v11, v12}, Ldf/f;-><init>(II)V

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1166
    .line 1167
    .line 1168
    add-int/lit8 v10, v10, 0x1

    .line 1169
    .line 1170
    goto :goto_12

    .line 1171
    :cond_16
    if-eqz v20, :cond_18

    .line 1172
    .line 1173
    const/4 v10, 0x0

    .line 1174
    :goto_13
    if-ge v10, v2, :cond_19

    .line 1175
    .line 1176
    iget-object v11, v3, Ldf/b;->b:Ldf/e;

    .line 1177
    .line 1178
    invoke-virtual {v11}, Ldf/e;->c()I

    .line 1179
    .line 1180
    .line 1181
    move-result v11

    .line 1182
    const v12, 0xffff

    .line 1183
    .line 1184
    .line 1185
    if-eq v11, v12, :cond_17

    .line 1186
    .line 1187
    new-instance v12, Ldf/f;

    .line 1188
    .line 1189
    mul-int/lit8 v11, v11, 0x4

    .line 1190
    .line 1191
    invoke-direct {v12, v10, v11}, Ldf/f;-><init>(II)V

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1195
    .line 1196
    .line 1197
    :cond_17
    add-int/lit8 v10, v10, 0x1

    .line 1198
    .line 1199
    goto :goto_13

    .line 1200
    :cond_18
    const/4 v10, 0x0

    .line 1201
    :goto_14
    if-ge v10, v2, :cond_19

    .line 1202
    .line 1203
    new-instance v11, Ldf/f;

    .line 1204
    .line 1205
    iget-object v12, v3, Ldf/b;->b:Ldf/e;

    .line 1206
    .line 1207
    invoke-virtual {v12}, Ldf/e;->e()I

    .line 1208
    .line 1209
    .line 1210
    move-result v12

    .line 1211
    invoke-direct {v11, v10, v12}, Ldf/f;-><init>(II)V

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1215
    .line 1216
    .line 1217
    add-int/lit8 v10, v10, 0x1

    .line 1218
    .line 1219
    goto :goto_14

    .line 1220
    :cond_19
    iget-object v2, v3, Ldf/b;->b:Ldf/e;

    .line 1221
    .line 1222
    const-string v10, "Failed to skip to entries start"

    .line 1223
    .line 1224
    invoke-virtual {v2, v5, v6, v10}, Ldf/e;->k(JLjava/lang/String;)V

    .line 1225
    .line 1226
    .line 1227
    new-instance v2, Ljava/util/HashSet;

    .line 1228
    .line 1229
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1230
    .line 1231
    .line 1232
    move-result v10

    .line 1233
    mul-int/lit8 v10, v10, 0x2

    .line 1234
    .line 1235
    invoke-direct {v2, v10}, Ljava/util/HashSet;-><init>(I)V

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v1

    .line 1242
    const/4 v10, 0x0

    .line 1243
    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1244
    .line 1245
    .line 1246
    move-result v11

    .line 1247
    if-eqz v11, :cond_3f

    .line 1248
    .line 1249
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v11

    .line 1253
    check-cast v11, Ldf/f;

    .line 1254
    .line 1255
    iget v12, v11, Ldf/f;->b:I

    .line 1256
    .line 1257
    const/4 v13, -0x1

    .line 1258
    if-ne v12, v13, :cond_1a

    .line 1259
    .line 1260
    :goto_16
    move-object/from16 v36, v1

    .line 1261
    .line 1262
    move-object/from16 v37, v2

    .line 1263
    .line 1264
    :goto_17
    move-wide/from16 v38, v5

    .line 1265
    .line 1266
    move-object/from16 v42, v7

    .line 1267
    .line 1268
    move/from16 v41, v8

    .line 1269
    .line 1270
    move/from16 v43, v10

    .line 1271
    .line 1272
    move-object/from16 v40, v25

    .line 1273
    .line 1274
    const/16 v2, 0x10

    .line 1275
    .line 1276
    const/4 v8, 0x1

    .line 1277
    goto/16 :goto_2e

    .line 1278
    .line 1279
    :cond_1a
    iget v11, v11, Ldf/f;->a:I

    .line 1280
    .line 1281
    if-eqz v32, :cond_1b

    .line 1282
    .line 1283
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v14

    .line 1287
    invoke-virtual {v2, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1288
    .line 1289
    .line 1290
    move-result v14

    .line 1291
    if-nez v14, :cond_1b

    .line 1292
    .line 1293
    goto :goto_16

    .line 1294
    :cond_1b
    int-to-long v14, v12

    .line 1295
    add-long/2addr v14, v5

    .line 1296
    cmp-long v12, v14, v60

    .line 1297
    .line 1298
    if-ltz v12, :cond_1c

    .line 1299
    .line 1300
    add-int/lit8 v10, v10, 0x1

    .line 1301
    .line 1302
    goto :goto_15

    .line 1303
    :cond_1c
    iget-object v12, v3, Ldf/b;->b:Ldf/e;

    .line 1304
    .line 1305
    move-wide/from16 v20, v14

    .line 1306
    .line 1307
    iget-wide v13, v12, Ldf/e;->h:J

    .line 1308
    .line 1309
    cmp-long v13, v20, v13

    .line 1310
    .line 1311
    if-gez v13, :cond_1d

    .line 1312
    .line 1313
    invoke-virtual {v12}, Ldf/e;->reset()V

    .line 1314
    .line 1315
    .line 1316
    :cond_1d
    iget-object v12, v3, Ldf/b;->b:Ldf/e;

    .line 1317
    .line 1318
    new-instance v13, Ljava/lang/StringBuilder;

    .line 1319
    .line 1320
    const-string v14, "Expected start of entry "

    .line 1321
    .line 1322
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v13

    .line 1332
    move-wide/from16 v14, v20

    .line 1333
    .line 1334
    invoke-virtual {v12, v14, v15, v13}, Ldf/e;->k(JLjava/lang/String;)V

    .line 1335
    .line 1336
    .line 1337
    iget-object v12, v3, Ldf/b;->b:Ldf/e;

    .line 1338
    .line 1339
    invoke-virtual {v12}, Ldf/e;->c()I

    .line 1340
    .line 1341
    .line 1342
    move-result v12

    .line 1343
    iget-object v13, v3, Ldf/b;->b:Ldf/e;

    .line 1344
    .line 1345
    invoke-virtual {v13}, Ldf/e;->c()I

    .line 1346
    .line 1347
    .line 1348
    move-result v13

    .line 1349
    and-int/lit8 v14, v13, 0x1

    .line 1350
    .line 1351
    if-eqz v14, :cond_1e

    .line 1352
    .line 1353
    const/4 v14, 0x1

    .line 1354
    goto :goto_18

    .line 1355
    :cond_1e
    const/4 v14, 0x0

    .line 1356
    :goto_18
    and-int/lit8 v15, v13, 0x8

    .line 1357
    .line 1358
    if-eqz v15, :cond_1f

    .line 1359
    .line 1360
    const/4 v15, 0x1

    .line 1361
    goto :goto_19

    .line 1362
    :cond_1f
    const/4 v15, 0x0

    .line 1363
    :goto_19
    move-object/from16 v36, v1

    .line 1364
    .line 1365
    if-eqz v15, :cond_20

    .line 1366
    .line 1367
    move v1, v12

    .line 1368
    :goto_1a
    move-object/from16 v37, v2

    .line 1369
    .line 1370
    const/4 v2, -0x1

    .line 1371
    goto :goto_1b

    .line 1372
    :cond_20
    iget-object v1, v3, Ldf/b;->b:Ldf/e;

    .line 1373
    .line 1374
    invoke-virtual {v1}, Ldf/e;->e()I

    .line 1375
    .line 1376
    .line 1377
    move-result v1

    .line 1378
    goto :goto_1a

    .line 1379
    :goto_1b
    if-ne v1, v2, :cond_21

    .line 1380
    .line 1381
    goto :goto_17

    .line 1382
    :cond_21
    shl-int/lit8 v2, v30, 0x18

    .line 1383
    .line 1384
    shl-int/lit8 v20, v31, 0x10

    .line 1385
    .line 1386
    or-int v2, v2, v20

    .line 1387
    .line 1388
    or-int v21, v2, v11

    .line 1389
    .line 1390
    move-object/from16 v22, v23

    .line 1391
    .line 1392
    move-object/from16 v2, v62

    .line 1393
    .line 1394
    invoke-virtual {v2, v8}, Ldf/a;->a(I)Ljava/lang/String;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v23

    .line 1398
    move-object/from16 v11, v63

    .line 1399
    .line 1400
    invoke-virtual {v11, v1}, Ldf/a;->a(I)Ljava/lang/String;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v1

    .line 1404
    iget-object v2, v7, Lbc/g;->K:Lad/c;

    .line 1405
    .line 1406
    iget-object v2, v2, Lad/c;->b:Lrf/b;

    .line 1407
    .line 1408
    invoke-interface {v2, v1}, Lrf/b;->c(Ljava/lang/String;)Z

    .line 1409
    .line 1410
    .line 1411
    move-result v2

    .line 1412
    if-nez v2, :cond_22

    .line 1413
    .line 1414
    sget-object v1, Ldf/g;->h:Lef/c;

    .line 1415
    .line 1416
    move-wide/from16 v38, v5

    .line 1417
    .line 1418
    move-object/from16 v42, v7

    .line 1419
    .line 1420
    move/from16 v41, v8

    .line 1421
    .line 1422
    move/from16 v43, v10

    .line 1423
    .line 1424
    move-object/from16 v63, v11

    .line 1425
    .line 1426
    move-object/from16 v23, v22

    .line 1427
    .line 1428
    move-object/from16 v40, v25

    .line 1429
    .line 1430
    goto/16 :goto_2b

    .line 1431
    .line 1432
    :cond_22
    iget-object v2, v3, Ldf/g;->e:Ldf/i;

    .line 1433
    .line 1434
    iget-object v2, v2, Ldf/i;->e:Ljava/util/HashMap;

    .line 1435
    .line 1436
    move-wide/from16 v38, v5

    .line 1437
    .line 1438
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v5

    .line 1442
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v2

    .line 1446
    check-cast v2, Ljava/lang/String;

    .line 1447
    .line 1448
    if-eqz v2, :cond_23

    .line 1449
    .line 1450
    move-object/from16 v24, v2

    .line 1451
    .line 1452
    move-object/from16 v42, v7

    .line 1453
    .line 1454
    move/from16 v41, v8

    .line 1455
    .line 1456
    move/from16 v43, v10

    .line 1457
    .line 1458
    move-object/from16 v63, v11

    .line 1459
    .line 1460
    move-object/from16 v40, v25

    .line 1461
    .line 1462
    goto/16 :goto_29

    .line 1463
    .line 1464
    :cond_23
    move-object/from16 v2, v25

    .line 1465
    .line 1466
    iget-object v5, v2, Lud/u;->d:Lj8/f;

    .line 1467
    .line 1468
    iget-object v5, v5, Lj8/f;->b:Ljava/lang/Object;

    .line 1469
    .line 1470
    check-cast v5, Lod/b;

    .line 1471
    .line 1472
    iget-object v5, v5, Lod/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1473
    .line 1474
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v6

    .line 1478
    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v5

    .line 1482
    check-cast v5, Lud/l;

    .line 1483
    .line 1484
    instance-of v6, v5, Lud/g;

    .line 1485
    .line 1486
    if-eqz v6, :cond_24

    .line 1487
    .line 1488
    check-cast v5, Lud/g;

    .line 1489
    .line 1490
    goto :goto_1c

    .line 1491
    :cond_24
    move-object/from16 v5, p3

    .line 1492
    .line 1493
    :goto_1c
    if-eqz v5, :cond_29

    .line 1494
    .line 1495
    iget-object v6, v5, Lud/g;->k:Lud/e;

    .line 1496
    .line 1497
    invoke-virtual {v6}, Lud/e;->a0()Lud/e;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v6

    .line 1501
    move-object/from16 v40, v2

    .line 1502
    .line 1503
    sget-object v2, Lmd/a;->m:Lmd/a;

    .line 1504
    .line 1505
    iget-object v6, v6, Lmd/e;->g:Lmd/f;

    .line 1506
    .line 1507
    invoke-virtual {v6, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 1508
    .line 1509
    .line 1510
    move-result v2

    .line 1511
    if-eqz v2, :cond_25

    .line 1512
    .line 1513
    :goto_1d
    move/from16 v41, v8

    .line 1514
    .line 1515
    goto :goto_1e

    .line 1516
    :cond_25
    iget v2, v7, Lbc/g;->T:I

    .line 1517
    .line 1518
    iget-object v6, v5, Lud/g;->l:Lod/c;

    .line 1519
    .line 1520
    iget-object v6, v6, Lod/c;->h:Ljava/lang/String;

    .line 1521
    .line 1522
    move/from16 v20, v2

    .line 1523
    .line 1524
    invoke-static/range {v20 .. v20}, Lt3/c;->b(I)I

    .line 1525
    .line 1526
    .line 1527
    move-result v2

    .line 1528
    if-eqz v2, :cond_28

    .line 1529
    .line 1530
    move/from16 v41, v8

    .line 1531
    .line 1532
    const/4 v8, 0x1

    .line 1533
    if-eq v2, v8, :cond_27

    .line 1534
    .line 1535
    move/from16 v8, v16

    .line 1536
    .line 1537
    if-ne v2, v8, :cond_26

    .line 1538
    .line 1539
    goto :goto_20

    .line 1540
    :cond_26
    invoke-static/range {v20 .. v20}, Lbc/e;->w(I)Ljava/lang/String;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v0

    .line 1544
    const-string v1, "Unexpected ResourceNameSource value: "

    .line 1545
    .line 1546
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v0

    .line 1550
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 1551
    .line 1552
    .line 1553
    return-object p3

    .line 1554
    :cond_27
    :goto_1e
    move/from16 v8, v16

    .line 1555
    .line 1556
    goto :goto_1f

    .line 1557
    :cond_28
    move/from16 v41, v8

    .line 1558
    .line 1559
    move/from16 v8, v16

    .line 1560
    .line 1561
    invoke-static {v1, v6}, Lxe/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v6

    .line 1565
    goto :goto_20

    .line 1566
    :cond_29
    move-object/from16 v40, v2

    .line 1567
    .line 1568
    goto :goto_1d

    .line 1569
    :goto_1f
    move-object v6, v1

    .line 1570
    :goto_20
    invoke-virtual {v7}, Lbc/g;->a()Z

    .line 1571
    .line 1572
    .line 1573
    move-result v2

    .line 1574
    if-eqz v2, :cond_34

    .line 1575
    .line 1576
    iget-object v2, v7, Lbc/g;->D:Ljava/util/EnumSet;

    .line 1577
    .line 1578
    sget-object v8, Lbc/f;->i:Lbc/f;

    .line 1579
    .line 1580
    invoke-interface {v2, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1581
    .line 1582
    .line 1583
    move-result v2

    .line 1584
    xor-int/lit8 v8, v2, 0x1

    .line 1585
    .line 1586
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v24

    .line 1590
    move/from16 v25, v2

    .line 1591
    .line 1592
    filled-new-array/range {v24 .. v24}, [Ljava/lang/Object;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v2

    .line 1596
    move-object/from16 v42, v7

    .line 1597
    .line 1598
    const-string v7, "_res_0x%08x"

    .line 1599
    .line 1600
    invoke-static {v7, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v2

    .line 1604
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 1605
    .line 1606
    .line 1607
    move-result v7

    .line 1608
    if-eqz v7, :cond_2a

    .line 1609
    .line 1610
    move/from16 v43, v10

    .line 1611
    .line 1612
    move-object/from16 v63, v11

    .line 1613
    .line 1614
    goto/16 :goto_28

    .line 1615
    .line 1616
    :cond_2a
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1617
    .line 1618
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1619
    .line 1620
    .line 1621
    move-result v24

    .line 1622
    move/from16 v43, v10

    .line 1623
    .line 1624
    const/16 v19, 0x1

    .line 1625
    .line 1626
    add-int/lit8 v10, v24, 0x1

    .line 1627
    .line 1628
    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1629
    .line 1630
    .line 1631
    move-object/from16 v63, v11

    .line 1632
    .line 1633
    const/4 v10, 0x0

    .line 1634
    invoke-virtual {v6, v10}, Ljava/lang/String;->codePointAt(I)I

    .line 1635
    .line 1636
    .line 1637
    move-result v11

    .line 1638
    if-eqz v25, :cond_2c

    .line 1639
    .line 1640
    invoke-static {v11}, Lkd/d;->b(I)Z

    .line 1641
    .line 1642
    .line 1643
    move-result v24

    .line 1644
    if-eqz v24, :cond_2b

    .line 1645
    .line 1646
    goto :goto_21

    .line 1647
    :cond_2b
    const/16 v10, 0x5f

    .line 1648
    .line 1649
    goto :goto_23

    .line 1650
    :cond_2c
    :goto_21
    const/16 v10, 0x370

    .line 1651
    .line 1652
    if-ge v11, v10, :cond_2d

    .line 1653
    .line 1654
    invoke-static {v11}, Ljava/lang/Character;->isUnicodeIdentifierStart(I)Z

    .line 1655
    .line 1656
    .line 1657
    move-result v10

    .line 1658
    if-eqz v10, :cond_2d

    .line 1659
    .line 1660
    const/16 v10, 0x5f

    .line 1661
    .line 1662
    goto :goto_22

    .line 1663
    :cond_2d
    const/16 v10, 0x5f

    .line 1664
    .line 1665
    if-ne v11, v10, :cond_2e

    .line 1666
    .line 1667
    :goto_22
    sget-object v20, Lkd/d;->a:Ljava/util/regex/Pattern;

    .line 1668
    .line 1669
    invoke-static {v11}, Ljava/lang/Character;->isJavaIdentifierStart(I)Z

    .line 1670
    .line 1671
    .line 1672
    move-result v20

    .line 1673
    if-eqz v20, :cond_2e

    .line 1674
    .line 1675
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 1676
    .line 1677
    .line 1678
    const/4 v10, 0x0

    .line 1679
    goto :goto_24

    .line 1680
    :cond_2e
    :goto_23
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1681
    .line 1682
    .line 1683
    invoke-static {v11, v8}, Lf8/i;->b0(IZ)Z

    .line 1684
    .line 1685
    .line 1686
    move-result v10

    .line 1687
    if-eqz v10, :cond_2f

    .line 1688
    .line 1689
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 1690
    .line 1691
    .line 1692
    :cond_2f
    const/4 v10, 0x1

    .line 1693
    :goto_24
    invoke-static {v11}, Ljava/lang/Character;->charCount(I)I

    .line 1694
    .line 1695
    .line 1696
    move-result v11

    .line 1697
    move/from16 v24, v10

    .line 1698
    .line 1699
    :goto_25
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1700
    .line 1701
    .line 1702
    move-result v10

    .line 1703
    if-ge v11, v10, :cond_31

    .line 1704
    .line 1705
    invoke-virtual {v6, v11}, Ljava/lang/String;->codePointAt(I)I

    .line 1706
    .line 1707
    .line 1708
    move-result v10

    .line 1709
    invoke-static {v10, v8}, Lf8/i;->b0(IZ)Z

    .line 1710
    .line 1711
    .line 1712
    move-result v25

    .line 1713
    if-eqz v25, :cond_30

    .line 1714
    .line 1715
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 1716
    .line 1717
    .line 1718
    move-object/from16 v25, v6

    .line 1719
    .line 1720
    goto :goto_26

    .line 1721
    :cond_30
    move-object/from16 v25, v6

    .line 1722
    .line 1723
    const/16 v6, 0x5f

    .line 1724
    .line 1725
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1726
    .line 1727
    .line 1728
    const/16 v24, 0x1

    .line 1729
    .line 1730
    :goto_26
    invoke-static {v10}, Ljava/lang/Character;->charCount(I)I

    .line 1731
    .line 1732
    .line 1733
    move-result v6

    .line 1734
    add-int/2addr v11, v6

    .line 1735
    move-object/from16 v6, v25

    .line 1736
    .line 1737
    goto :goto_25

    .line 1738
    :cond_31
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v6

    .line 1742
    sget-object v7, Lkd/d;->c:Ljava/util/HashSet;

    .line 1743
    .line 1744
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1745
    .line 1746
    .line 1747
    move-result v7

    .line 1748
    if-eqz v7, :cond_32

    .line 1749
    .line 1750
    const/4 v8, 0x1

    .line 1751
    goto :goto_27

    .line 1752
    :cond_32
    move/from16 v8, v24

    .line 1753
    .line 1754
    :goto_27
    if-eqz v8, :cond_33

    .line 1755
    .line 1756
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v2

    .line 1760
    goto :goto_28

    .line 1761
    :cond_33
    move-object v2, v6

    .line 1762
    goto :goto_28

    .line 1763
    :cond_34
    move-object/from16 v25, v6

    .line 1764
    .line 1765
    move-object/from16 v42, v7

    .line 1766
    .line 1767
    move/from16 v43, v10

    .line 1768
    .line 1769
    move-object/from16 v63, v11

    .line 1770
    .line 1771
    move-object/from16 v2, v25

    .line 1772
    .line 1773
    :goto_28
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1774
    .line 1775
    .line 1776
    move-result v6

    .line 1777
    if-nez v6, :cond_35

    .line 1778
    .line 1779
    iget-object v6, v3, Ldf/g;->e:Ldf/i;

    .line 1780
    .line 1781
    iget-object v6, v6, Ldf/i;->e:Ljava/util/HashMap;

    .line 1782
    .line 1783
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v7

    .line 1787
    invoke-virtual {v6, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1788
    .line 1789
    .line 1790
    :cond_35
    if-eqz v5, :cond_36

    .line 1791
    .line 1792
    const/16 v6, 0x2e

    .line 1793
    .line 1794
    const/16 v10, 0x5f

    .line 1795
    .line 1796
    invoke-virtual {v2, v6, v10}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v6

    .line 1800
    iget-object v7, v5, Lud/g;->l:Lod/c;

    .line 1801
    .line 1802
    iput-object v6, v7, Lod/c;->j:Ljava/lang/String;

    .line 1803
    .line 1804
    sget-object v6, Lmd/a;->x:Lmd/a;

    .line 1805
    .line 1806
    invoke-virtual {v5, v6}, Lmd/e;->w(Lmd/a;)V

    .line 1807
    .line 1808
    .line 1809
    :cond_36
    move-object/from16 v24, v2

    .line 1810
    .line 1811
    :goto_29
    new-instance v20, Lef/c;

    .line 1812
    .line 1813
    iget-object v2, v0, Lef/a;->l:Ljava/lang/String;

    .line 1814
    .line 1815
    move-object/from16 v25, v2

    .line 1816
    .line 1817
    invoke-direct/range {v20 .. v25}, Lef/c;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1818
    .line 1819
    .line 1820
    move-object/from16 v5, v20

    .line 1821
    .line 1822
    move/from16 v2, v21

    .line 1823
    .line 1824
    move-object/from16 v23, v22

    .line 1825
    .line 1826
    iget-object v6, v3, Ldf/g;->e:Ldf/i;

    .line 1827
    .line 1828
    iget-object v6, v6, Ldf/i;->d:Ljava/util/TreeMap;

    .line 1829
    .line 1830
    invoke-virtual {v6, v5}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v6

    .line 1834
    check-cast v6, Lef/c;

    .line 1835
    .line 1836
    if-eqz v6, :cond_39

    .line 1837
    .line 1838
    iget v7, v6, Lef/c;->a:I

    .line 1839
    .line 1840
    if-ne v7, v2, :cond_37

    .line 1841
    .line 1842
    const-string v2, "ResourceEntries with duplicate resource id found: {} {}"

    .line 1843
    .line 1844
    invoke-interface {v4, v6, v2, v5}, Lmh/b;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1845
    .line 1846
    .line 1847
    move-object v2, v1

    .line 1848
    goto :goto_2a

    .line 1849
    :cond_37
    move-object/from16 v2, v24

    .line 1850
    .line 1851
    :goto_2a
    invoke-virtual {v5, v2}, Lef/c;->a(Ljava/lang/String;)Lef/c;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v5

    .line 1855
    invoke-virtual {v6, v2}, Lef/c;->a(Ljava/lang/String;)Lef/c;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v2

    .line 1859
    iget-object v7, v2, Lef/c;->d:Ljava/lang/String;

    .line 1860
    .line 1861
    const-string v8, "Resource name collision - renamed to {} and {}"

    .line 1862
    .line 1863
    iget-object v10, v5, Lef/c;->d:Ljava/lang/String;

    .line 1864
    .line 1865
    invoke-interface {v4, v10, v8, v7}, Lmh/b;->p(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1866
    .line 1867
    .line 1868
    iget-object v8, v3, Ldf/g;->e:Ldf/i;

    .line 1869
    .line 1870
    iget-object v8, v8, Ldf/i;->a:Ljava/util/ArrayList;

    .line 1871
    .line 1872
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 1873
    .line 1874
    .line 1875
    move-result v6

    .line 1876
    const/4 v10, -0x1

    .line 1877
    if-eq v6, v10, :cond_38

    .line 1878
    .line 1879
    invoke-virtual {v8, v6, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1880
    .line 1881
    .line 1882
    :cond_38
    iget-object v6, v3, Ldf/g;->e:Ldf/i;

    .line 1883
    .line 1884
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1885
    .line 1886
    .line 1887
    iget v2, v2, Lef/c;->a:I

    .line 1888
    .line 1889
    iget-object v6, v6, Ldf/i;->e:Ljava/util/HashMap;

    .line 1890
    .line 1891
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1892
    .line 1893
    .line 1894
    move-result-object v2

    .line 1895
    invoke-virtual {v6, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1896
    .line 1897
    .line 1898
    :cond_39
    iget-object v2, v5, Lef/c;->d:Ljava/lang/String;

    .line 1899
    .line 1900
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1901
    .line 1902
    .line 1903
    move-result v1

    .line 1904
    if-nez v1, :cond_3a

    .line 1905
    .line 1906
    iget-object v1, v3, Ldf/g;->e:Ldf/i;

    .line 1907
    .line 1908
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1909
    .line 1910
    .line 1911
    iget v6, v5, Lef/c;->a:I

    .line 1912
    .line 1913
    iget-object v1, v1, Ldf/i;->e:Ljava/util/HashMap;

    .line 1914
    .line 1915
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v6

    .line 1919
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1920
    .line 1921
    .line 1922
    :cond_3a
    iget-object v1, v3, Ldf/g;->e:Ldf/i;

    .line 1923
    .line 1924
    iget-object v2, v1, Ldf/i;->a:Ljava/util/ArrayList;

    .line 1925
    .line 1926
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1927
    .line 1928
    .line 1929
    iget-object v1, v1, Ldf/i;->d:Ljava/util/TreeMap;

    .line 1930
    .line 1931
    invoke-virtual {v1, v5, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1932
    .line 1933
    .line 1934
    move-object v1, v5

    .line 1935
    :goto_2b
    if-eqz v15, :cond_3b

    .line 1936
    .line 1937
    shr-int/lit8 v2, v13, 0x8

    .line 1938
    .line 1939
    iget-object v5, v3, Ldf/b;->b:Ldf/e;

    .line 1940
    .line 1941
    invoke-virtual {v5}, Ldf/e;->e()I

    .line 1942
    .line 1943
    .line 1944
    move-result v5

    .line 1945
    new-instance v6, Lb5/k;

    .line 1946
    .line 1947
    const/4 v8, 0x1

    .line 1948
    invoke-direct {v6, v2, v5, v8}, Lb5/k;-><init>(III)V

    .line 1949
    .line 1950
    .line 1951
    iput-object v6, v1, Lef/c;->f:Lb5/k;

    .line 1952
    .line 1953
    const/16 v2, 0x10

    .line 1954
    .line 1955
    goto :goto_2e

    .line 1956
    :cond_3b
    const/4 v8, 0x1

    .line 1957
    const/16 v2, 0x10

    .line 1958
    .line 1959
    if-nez v14, :cond_3d

    .line 1960
    .line 1961
    if-ne v12, v2, :cond_3c

    .line 1962
    .line 1963
    goto :goto_2c

    .line 1964
    :cond_3c
    invoke-virtual {v3}, Ldf/g;->d()Lb5/k;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v5

    .line 1968
    iput-object v5, v1, Lef/c;->f:Lb5/k;

    .line 1969
    .line 1970
    goto :goto_2e

    .line 1971
    :cond_3d
    :goto_2c
    iget-object v5, v3, Ldf/b;->b:Ldf/e;

    .line 1972
    .line 1973
    invoke-virtual {v5}, Ldf/e;->e()I

    .line 1974
    .line 1975
    .line 1976
    iget-object v5, v3, Ldf/b;->b:Ldf/e;

    .line 1977
    .line 1978
    invoke-virtual {v5}, Ldf/e;->e()I

    .line 1979
    .line 1980
    .line 1981
    move-result v5

    .line 1982
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1983
    .line 1984
    .line 1985
    new-instance v6, Ljava/util/ArrayList;

    .line 1986
    .line 1987
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1988
    .line 1989
    .line 1990
    const/4 v7, 0x0

    .line 1991
    :goto_2d
    if-ge v7, v5, :cond_3e

    .line 1992
    .line 1993
    iget-object v10, v3, Ldf/b;->b:Ldf/e;

    .line 1994
    .line 1995
    invoke-virtual {v10}, Ldf/e;->e()I

    .line 1996
    .line 1997
    .line 1998
    move-result v10

    .line 1999
    new-instance v11, Lef/b;

    .line 2000
    .line 2001
    invoke-virtual {v3}, Ldf/g;->d()Lb5/k;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v12

    .line 2005
    invoke-direct {v11, v10, v12}, Lef/b;-><init>(ILb5/k;)V

    .line 2006
    .line 2007
    .line 2008
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2009
    .line 2010
    .line 2011
    add-int/lit8 v7, v7, 0x1

    .line 2012
    .line 2013
    goto :goto_2d

    .line 2014
    :cond_3e
    iput-object v6, v1, Lef/c;->g:Ljava/util/ArrayList;

    .line 2015
    .line 2016
    :goto_2e
    move-object/from16 v1, v36

    .line 2017
    .line 2018
    move-object/from16 v2, v37

    .line 2019
    .line 2020
    move-wide/from16 v5, v38

    .line 2021
    .line 2022
    move-object/from16 v25, v40

    .line 2023
    .line 2024
    move/from16 v8, v41

    .line 2025
    .line 2026
    move-object/from16 v7, v42

    .line 2027
    .line 2028
    move/from16 v10, v43

    .line 2029
    .line 2030
    const/16 v16, 0x2

    .line 2031
    .line 2032
    goto/16 :goto_15

    .line 2033
    .line 2034
    :cond_3f
    move-object/from16 v42, v7

    .line 2035
    .line 2036
    move/from16 v43, v10

    .line 2037
    .line 2038
    move-object/from16 v40, v25

    .line 2039
    .line 2040
    const/4 v8, 0x1

    .line 2041
    if-lez v43, :cond_40

    .line 2042
    .line 2043
    const-string v0, "{} entries of type {} has been ignored (invalid offset)"

    .line 2044
    .line 2045
    invoke-static/range {v43 .. v43}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v1

    .line 2049
    invoke-interface {v4, v1, v0, v9}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2050
    .line 2051
    .line 2052
    :cond_40
    iget-object v0, v3, Ldf/b;->b:Ldf/e;

    .line 2053
    .line 2054
    const-string v1, "End of chunk"

    .line 2055
    .line 2056
    move-wide/from16 v5, v60

    .line 2057
    .line 2058
    invoke-virtual {v0, v5, v6, v1}, Ldf/e;->k(JLjava/lang/String;)V

    .line 2059
    .line 2060
    .line 2061
    goto :goto_2f

    .line 2062
    :cond_41
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 2063
    .line 2064
    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 2065
    .line 2066
    .line 2067
    throw v0

    .line 2068
    :cond_42
    const-string v0, "Config size < 4"

    .line 2069
    .line 2070
    invoke-static {v0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 2071
    .line 2072
    .line 2073
    return-object p3

    .line 2074
    :cond_43
    move-object/from16 v62, v0

    .line 2075
    .line 2076
    move-object/from16 v63, v1

    .line 2077
    .line 2078
    move-wide/from16 v21, v5

    .line 2079
    .line 2080
    move-object/from16 v42, v7

    .line 2081
    .line 2082
    move-wide/from16 v33, v10

    .line 2083
    .line 2084
    move-object/from16 v23, v14

    .line 2085
    .line 2086
    move-object/from16 v40, v15

    .line 2087
    .line 2088
    const/4 v8, 0x1

    .line 2089
    const-string v0, "Null chunk type encountered at offset {}"

    .line 2090
    .line 2091
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v1

    .line 2095
    invoke-interface {v4, v1, v0}, Lmh/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2096
    .line 2097
    .line 2098
    :goto_2f
    move-object/from16 v14, v23

    .line 2099
    .line 2100
    move-wide/from16 v10, v33

    .line 2101
    .line 2102
    move-object/from16 v15, v40

    .line 2103
    .line 2104
    move-object/from16 v7, v42

    .line 2105
    .line 2106
    move-object/from16 v0, v62

    .line 2107
    .line 2108
    move-object/from16 v1, v63

    .line 2109
    .line 2110
    const/16 v16, 0x2

    .line 2111
    .line 2112
    goto/16 :goto_6

    .line 2113
    .line 2114
    :cond_44
    move-object/from16 v42, v7

    .line 2115
    .line 2116
    move-wide/from16 v33, v10

    .line 2117
    .line 2118
    move-object/from16 v40, v15

    .line 2119
    .line 2120
    add-int/lit8 v13, p2, 0x1

    .line 2121
    .line 2122
    goto :goto_31

    .line 2123
    :cond_45
    iget-wide v0, v5, Ldf/e;->h:J

    .line 2124
    .line 2125
    invoke-static {v0, v1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 2126
    .line 2127
    .line 2128
    move-result-object v0

    .line 2129
    const-string v1, "Decode error: Package header size too small, position: 0x"

    .line 2130
    .line 2131
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v0

    .line 2135
    invoke-static {v0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 2136
    .line 2137
    .line 2138
    return-object p3

    .line 2139
    :cond_46
    move-wide/from16 v26, v1

    .line 2140
    .line 2141
    move-object/from16 v42, v7

    .line 2142
    .line 2143
    move/from16 v28, v8

    .line 2144
    .line 2145
    move/from16 v29, v9

    .line 2146
    .line 2147
    move-object/from16 v40, v15

    .line 2148
    .line 2149
    invoke-virtual {v3, v12, v13, v10, v11}, Ldf/b;->c(JJ)Ldf/a;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v0

    .line 2153
    iput-object v0, v3, Ldf/g;->f:Ldf/a;

    .line 2154
    .line 2155
    :goto_30
    move/from16 v13, p2

    .line 2156
    .line 2157
    :goto_31
    iget-object v0, v3, Ldf/b;->b:Ldf/e;

    .line 2158
    .line 2159
    const-string v1, "Skip to table chunk end"

    .line 2160
    .line 2161
    invoke-virtual {v0, v10, v11, v1}, Ldf/e;->k(JLjava/lang/String;)V

    .line 2162
    .line 2163
    .line 2164
    move-object/from16 v0, p0

    .line 2165
    .line 2166
    move-wide/from16 v1, v26

    .line 2167
    .line 2168
    move/from16 v8, v28

    .line 2169
    .line 2170
    move/from16 v9, v29

    .line 2171
    .line 2172
    move-object/from16 v6, v40

    .line 2173
    .line 2174
    move-object/from16 v7, v42

    .line 2175
    .line 2176
    const/4 v10, 0x2

    .line 2177
    const/16 v11, 0xc

    .line 2178
    .line 2179
    goto/16 :goto_1

    .line 2180
    .line 2181
    :cond_47
    move/from16 v12, p2

    .line 2182
    .line 2183
    move-wide/from16 v26, v1

    .line 2184
    .line 2185
    move v0, v9

    .line 2186
    if-eq v12, v0, :cond_48

    .line 2187
    .line 2188
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2189
    .line 2190
    .line 2191
    move-result-object v1

    .line 2192
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2193
    .line 2194
    .line 2195
    move-result-object v0

    .line 2196
    const-string v2, "Unexpected package chunks, read: {}, expected: {}"

    .line 2197
    .line 2198
    invoke-interface {v4, v1, v2, v0}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2199
    .line 2200
    .line 2201
    :cond_48
    iget-object v0, v3, Ldf/g;->e:Ldf/i;

    .line 2202
    .line 2203
    iget-object v1, v0, Ldf/i;->a:Ljava/util/ArrayList;

    .line 2204
    .line 2205
    new-instance v2, Lae/a;

    .line 2206
    .line 2207
    const/4 v5, 0x7

    .line 2208
    invoke-direct {v2, v5}, Lae/a;-><init>(I)V

    .line 2209
    .line 2210
    .line 2211
    invoke-static {v2}, Ljava/util/Comparator;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    .line 2212
    .line 2213
    .line 2214
    move-result-object v2

    .line 2215
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 2216
    .line 2217
    .line 2218
    iget-object v1, v0, Ldf/i;->d:Ljava/util/TreeMap;

    .line 2219
    .line 2220
    invoke-virtual {v1}, Ljava/util/TreeMap;->clear()V

    .line 2221
    .line 2222
    .line 2223
    iget-object v0, v0, Ldf/i;->e:Ljava/util/HashMap;

    .line 2224
    .line 2225
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 2226
    .line 2227
    .line 2228
    invoke-interface {v4}, Lmh/b;->d()Z

    .line 2229
    .line 2230
    .line 2231
    move-result v0

    .line 2232
    if-eqz v0, :cond_49

    .line 2233
    .line 2234
    iget-object v0, v3, Ldf/g;->e:Ldf/i;

    .line 2235
    .line 2236
    iget-object v0, v0, Ldf/i;->a:Ljava/util/ArrayList;

    .line 2237
    .line 2238
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 2239
    .line 2240
    .line 2241
    move-result v0

    .line 2242
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2243
    .line 2244
    .line 2245
    move-result-object v0

    .line 2246
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2247
    .line 2248
    .line 2249
    move-result-wide v1

    .line 2250
    sub-long v1, v1, v26

    .line 2251
    .line 2252
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2253
    .line 2254
    .line 2255
    move-result-object v1

    .line 2256
    const-string v2, "Resource table parsed: size: {}, time: {}ms"

    .line 2257
    .line 2258
    invoke-interface {v4, v0, v2, v1}, Lmh/b;->y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2259
    .line 2260
    .line 2261
    :cond_49
    return-object v3

    .line 2262
    :cond_4a
    const/16 p3, 0x0

    .line 2263
    .line 2264
    const-string v0, "Unknown type of resource file: "

    .line 2265
    .line 2266
    invoke-static {v0, v2}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2267
    .line 2268
    .line 2269
    move-result-object v0

    .line 2270
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 2271
    .line 2272
    .line 2273
    return-object p3

    .line 2274
    :cond_4b
    const/16 p3, 0x0

    .line 2275
    .line 2276
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2277
    .line 2278
    .line 2279
    move-result-object v0

    .line 2280
    const-string v1, "Unexpected resource type for decode: "

    .line 2281
    .line 2282
    const-string v2, ", expect \'.pb\'/\'.arsc\'"

    .line 2283
    .line 2284
    invoke-static {v1, v0, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2285
    .line 2286
    .line 2287
    move-result-object v0

    .line 2288
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 2289
    .line 2290
    .line 2291
    return-object p3

    .line 2292
    nop

    .line 2293
    :pswitch_data_0
    .packed-switch 0x201
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public n()Lk7/a;
    .locals 4

    .line 1
    iget-object v0, p0, Le9/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lokio/a;

    .line 4
    .line 5
    iget-object v1, p0, Le9/a;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lp7/i;

    .line 8
    .line 9
    iget-object v1, v1, Lp7/i;->u:Lr7/c;

    .line 10
    .line 11
    iget-object v1, v1, Lr7/b;->k:[B

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    aget-byte v1, v1, v2

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    and-int/2addr v1, v3

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    move v2, v3

    .line 21
    :cond_0
    iget v0, v0, Lokio/a;->g:I

    .line 22
    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    new-instance v0, Lr7/y;

    .line 27
    .line 28
    invoke-direct {v0, v2}, Lr7/s;-><init>(Z)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_0
    new-instance v0, Lr7/x;

    .line 33
    .line 34
    invoke-direct {v0, v2}, Lr7/s;-><init>(Z)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_1
    new-instance v0, Lr7/q;

    .line 39
    .line 40
    invoke-direct {v0, v2}, Lr7/s;-><init>(Z)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_2
    new-instance v0, Lr7/o;

    .line 45
    .line 46
    invoke-direct {v0, v2}, Lr7/s;-><init>(Z)V

    .line 47
    .line 48
    .line 49
    :goto_0
    return-object v0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
