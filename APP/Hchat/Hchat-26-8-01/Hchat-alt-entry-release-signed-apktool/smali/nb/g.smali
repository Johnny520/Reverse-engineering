.class public final synthetic Lnb/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lnb/w;

.field public final synthetic i:J

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lnb/w;JLjava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lnb/g;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lnb/g;->h:Lnb/w;

    .line 8
    .line 9
    iput-wide p2, p0, Lnb/g;->i:J

    .line 10
    .line 11
    iput-object p4, p0, Lnb/g;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p5, p0, Lnb/g;->l:Ljava/lang/Object;

    .line 14
    .line 15
    iput p6, p0, Lnb/g;->j:I

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Lnb/w;Lnb/k;JLnb/m;I)V
    .locals 1

    .line 18
    const/4 v0, 0x1

    iput v0, p0, Lnb/g;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/g;->h:Lnb/w;

    iput-object p2, p0, Lnb/g;->k:Ljava/lang/Object;

    iput-wide p3, p0, Lnb/g;->i:J

    iput-object p5, p0, Lnb/g;->l:Ljava/lang/Object;

    iput p6, p0, Lnb/g;->j:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lnb/g;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lnb/g;->h:Lnb/w;

    .line 7
    .line 8
    iget-object v0, p0, Lnb/g;->k:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, v0

    .line 11
    check-cast v3, Lnb/k;

    .line 12
    .line 13
    iget-wide v4, p0, Lnb/g;->i:J

    .line 14
    .line 15
    iget-object v0, p0, Lnb/g;->l:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lnb/m;

    .line 18
    .line 19
    iget v1, p0, Lnb/g;->j:I

    .line 20
    .line 21
    invoke-virtual {v2, v3, v4, v5}, Lnb/w;->f(Lnb/k;J)Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-nez v6, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v1, v2, Lnb/w;->d:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 31
    .line 32
    iget-object v3, v3, Lnb/k;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    new-instance v1, Lnb/o;

    .line 38
    .line 39
    iget-object v3, v0, Lnb/m;->a:Ljava/lang/String;

    .line 40
    .line 41
    iget v0, v0, Lnb/m;->b:I

    .line 42
    .line 43
    invoke-direct {v1, v3, v0}, Lnb/o;-><init>(Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lnb/w;->y()Lnb/z;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v3, "text_speech_enable"

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    iget-object v0, v2, Lnb/w;->c:Ljava/util/ArrayDeque;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Lnb/w;->n()V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    add-int/lit8 v6, v1, 0x1

    .line 69
    .line 70
    const/16 v0, 0x78

    .line 71
    .line 72
    if-ge v6, v0, :cond_3

    .line 73
    .line 74
    iget-object v0, v2, Lnb/w;->b:Landroid/os/Handler;

    .line 75
    .line 76
    new-instance v1, Lnb/h;

    .line 77
    .line 78
    invoke-direct/range {v1 .. v6}, Lnb/h;-><init>(Lnb/w;Lnb/k;JI)V

    .line 79
    .line 80
    .line 81
    const-wide/16 v2, 0x1f4

    .line 82
    .line 83
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    iget-object v0, v2, Lnb/w;->d:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 88
    .line 89
    iget-object v1, v3, Lnb/k;->a:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    iget-object v0, v3, Lnb/k;->b:Ljava/lang/String;

    .line 95
    .line 96
    iget-wide v1, v3, Lnb/k;->c:J

    .line 97
    .line 98
    iget-wide v4, v3, Lnb/k;->d:J

    .line 99
    .line 100
    iget-object v3, v3, Lnb/k;->j:Ljava/lang/String;

    .line 101
    .line 102
    const-string v6, "[Hchat:TextSpeech] \u7b49\u5f85\u8bed\u97f3\u6587\u4ef6\u8d85\u65f6: talker="

    .line 103
    .line 104
    const-string v7, " msgId="

    .line 105
    .line 106
    invoke-static {v6, v0, v7, v1, v2}, Leh/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v1, " msgSvrId="

    .line 111
    .line 112
    const-string v2, " "

    .line 113
    .line 114
    invoke-static {v0, v1, v4, v5, v2}, Lj8/b;->s(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :goto_0
    return-void

    .line 128
    :pswitch_0
    iget-object v1, p0, Lnb/g;->h:Lnb/w;

    .line 129
    .line 130
    iget-object v2, v1, Lnb/w;->b:Landroid/os/Handler;

    .line 131
    .line 132
    iget-wide v3, p0, Lnb/g;->i:J

    .line 133
    .line 134
    iget-object v0, p0, Lnb/g;->k:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Ljava/lang/String;

    .line 137
    .line 138
    iget-object v5, p0, Lnb/g;->l:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v5, Ljava/lang/String;

    .line 141
    .line 142
    iget v6, p0, Lnb/g;->j:I

    .line 143
    .line 144
    iget-wide v7, v1, Lnb/w;->i:J

    .line 145
    .line 146
    cmp-long v3, v3, v7

    .line 147
    .line 148
    if-eqz v3, :cond_4

    .line 149
    .line 150
    goto/16 :goto_b

    .line 151
    .line 152
    :cond_4
    iget-object v3, v1, Lnb/w;->j:Lca/r;

    .line 153
    .line 154
    if-eqz v3, :cond_5

    .line 155
    .line 156
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 157
    .line 158
    .line 159
    :cond_5
    const/4 v3, 0x0

    .line 160
    iput-object v3, v1, Lnb/w;->j:Lca/r;

    .line 161
    .line 162
    const/4 v4, 0x0

    .line 163
    iput-boolean v4, v1, Lnb/w;->h:Z

    .line 164
    .line 165
    invoke-virtual {v1}, Lnb/w;->y()Lnb/z;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    const-string v8, "text_speech_enable"

    .line 170
    .line 171
    invoke-virtual {v7, v8}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    if-nez v7, :cond_6

    .line 176
    .line 177
    invoke-virtual {v1}, Lnb/w;->w()V

    .line 178
    .line 179
    .line 180
    goto/16 :goto_b

    .line 181
    .line 182
    :cond_6
    invoke-virtual {v1}, Lnb/w;->y()Lnb/z;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    invoke-virtual {v7}, Lnb/z;->c()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    invoke-static {v0, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-nez v0, :cond_7

    .line 195
    .line 196
    invoke-virtual {v1}, Lnb/w;->t()V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_b

    .line 200
    .line 201
    :cond_7
    if-nez v6, :cond_19

    .line 202
    .line 203
    iget-object v0, v1, Lnb/w;->f:Landroid/speech/tts/TextToSpeech;

    .line 204
    .line 205
    if-nez v0, :cond_8

    .line 206
    .line 207
    goto/16 :goto_a

    .line 208
    .line 209
    :cond_8
    const-string v6, "mCurrentEngine"

    .line 210
    .line 211
    invoke-static {v0, v6}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    instance-of v6, v0, Ljava/lang/String;

    .line 216
    .line 217
    if-eqz v6, :cond_9

    .line 218
    .line 219
    check-cast v0, Ljava/lang/String;

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_9
    move-object v0, v3

    .line 223
    :goto_1
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    if-nez v6, :cond_b

    .line 228
    .line 229
    if-eqz v0, :cond_b

    .line 230
    .line 231
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    if-eqz v6, :cond_a

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_a
    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    if-nez v6, :cond_b

    .line 243
    .line 244
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 245
    .line 246
    const-string v3, "\u5f15\u64ce "

    .line 247
    .line 248
    const-string v4, " \u8fde\u63a5\u5931\u8d25\uff0c\u7cfb\u7edf\u56de\u9000\u5230 "

    .line 249
    .line 250
    invoke-static {v3, v5, v4, v0}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1, v2}, Lnb/w;->v(Ljava/lang/Throwable;)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_b

    .line 261
    .line 262
    :cond_b
    :goto_2
    iput v4, v1, Lnb/w;->k:I

    .line 263
    .line 264
    iget-object v4, v1, Lnb/w;->f:Landroid/speech/tts/TextToSpeech;

    .line 265
    .line 266
    const/4 v5, 0x1

    .line 267
    if-eqz v4, :cond_15

    .line 268
    .line 269
    :try_start_0
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 270
    .line 271
    invoke-virtual {v4, v0}, Landroid/speech/tts/TextToSpeech;->setLanguage(Ljava/util/Locale;)I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 279
    goto :goto_3

    .line 280
    :catchall_0
    move-exception v0

    .line 281
    new-instance v6, Lsf/f;

    .line 282
    .line 283
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 284
    .line 285
    .line 286
    move-object v0, v6

    .line 287
    :goto_3
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    if-nez v6, :cond_14

    .line 292
    .line 293
    check-cast v0, Ljava/lang/Number;

    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    const/4 v6, -0x2

    .line 300
    if-eq v0, v6, :cond_13

    .line 301
    .line 302
    const/4 v6, -0x1

    .line 303
    if-eq v0, v6, :cond_13

    .line 304
    .line 305
    invoke-virtual {v1}, Lnb/w;->y()Lnb/z;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    const-string v6, "text_speech_tts_voice"

    .line 310
    .line 311
    const-string v7, ""

    .line 312
    .line 313
    invoke-virtual {v0, v6, v7}, Lnb/z;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    if-nez v0, :cond_12

    .line 330
    .line 331
    :try_start_1
    invoke-virtual {v4}, Landroid/speech/tts/TextToSpeech;->getVoices()Ljava/util/Set;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    if-nez v0, :cond_c

    .line 336
    .line 337
    sget-object v0, Ltf/v;->g:Ltf/v;

    .line 338
    .line 339
    goto :goto_4

    .line 340
    :catchall_1
    move-exception v0

    .line 341
    goto :goto_6

    .line 342
    :cond_c
    :goto_4
    check-cast v0, Ljava/lang/Iterable;

    .line 343
    .line 344
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v7

    .line 352
    if-eqz v7, :cond_e

    .line 353
    .line 354
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v7

    .line 358
    move-object v8, v7

    .line 359
    check-cast v8, Landroid/speech/tts/Voice;

    .line 360
    .line 361
    invoke-virtual {v8}, Landroid/speech/tts/Voice;->getName()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v8

    .line 365
    invoke-static {v8, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v8

    .line 369
    if-eqz v8, :cond_d

    .line 370
    .line 371
    goto :goto_5

    .line 372
    :cond_e
    move-object v7, v3

    .line 373
    :goto_5
    check-cast v7, Landroid/speech/tts/Voice;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 374
    .line 375
    goto :goto_7

    .line 376
    :goto_6
    new-instance v7, Lsf/f;

    .line 377
    .line 378
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 379
    .line 380
    .line 381
    :goto_7
    instance-of v0, v7, Lsf/f;

    .line 382
    .line 383
    if-eqz v0, :cond_f

    .line 384
    .line 385
    move-object v7, v3

    .line 386
    :cond_f
    check-cast v7, Landroid/speech/tts/Voice;

    .line 387
    .line 388
    if-eqz v7, :cond_11

    .line 389
    .line 390
    :try_start_2
    invoke-virtual {v4, v7}, Landroid/speech/tts/TextToSpeech;->setVoice(Landroid/speech/tts/Voice;)I

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 395
    .line 396
    .line 397
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 398
    goto :goto_8

    .line 399
    :catchall_2
    move-exception v0

    .line 400
    new-instance v7, Lsf/f;

    .line 401
    .line 402
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 403
    .line 404
    .line 405
    move-object v0, v7

    .line 406
    :goto_8
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 407
    .line 408
    .line 409
    move-result-object v7

    .line 410
    const-string v8, "\u6240\u9009\u64ad\u62a5\u89d2\u8272\u8bbe\u7f6e\u5931\u8d25: "

    .line 411
    .line 412
    if-nez v7, :cond_10

    .line 413
    .line 414
    check-cast v0, Ljava/lang/Number;

    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    if-eqz v0, :cond_12

    .line 421
    .line 422
    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    goto :goto_9

    .line 427
    :cond_10
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    const-string v3, "[Hchat:TextSpeech] \u8bbe\u7f6e\u64ad\u62a5\u89d2\u8272\u5931\u8d25: voice="

    .line 432
    .line 433
    const-string v4, ", error="

    .line 434
    .line 435
    invoke-static {v3, v6, v4, v0, v7}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    goto :goto_9

    .line 443
    :cond_11
    const-string v0, "\u6240\u9009\u64ad\u62a5\u89d2\u8272\u5df2\u4e0d\u53ef\u7528: "

    .line 444
    .line 445
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v3

    .line 449
    goto :goto_9

    .line 450
    :cond_12
    :try_start_3
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    .line 451
    .line 452
    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v5}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-virtual {v0, v5}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-virtual {v4, v0}, Landroid/speech/tts/TextToSpeech;->setAudioAttributes(Landroid/media/AudioAttributes;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 468
    .line 469
    .line 470
    :catchall_3
    new-instance v0, Lnb/r;

    .line 471
    .line 472
    invoke-direct {v0, v1}, Lnb/r;-><init>(Lnb/w;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v4, v0}, Landroid/speech/tts/TextToSpeech;->setOnUtteranceProgressListener(Landroid/speech/tts/UtteranceProgressListener;)I

    .line 476
    .line 477
    .line 478
    goto :goto_9

    .line 479
    :cond_13
    const-string v3, "\u6240\u9009\u6587\u5b57\u8f6c\u8bed\u97f3\u5f15\u64ce\u7f3a\u5c11\u4e2d\u6587\u8bed\u97f3\u6570\u636e\u6216\u4e0d\u652f\u6301\u4e2d\u6587"

    .line 480
    .line 481
    goto :goto_9

    .line 482
    :cond_14
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    const-string v3, "[Hchat:TextSpeech] \u8bbe\u7f6e\u4e2d\u6587\u8bed\u97f3\u5931\u8d25: "

    .line 487
    .line 488
    invoke-static {v3, v0, v6}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 489
    .line 490
    .line 491
    const-string v3, "\u6240\u9009\u6587\u5b57\u8f6c\u8bed\u97f3\u5f15\u64ce\u8bbe\u7f6e\u4e2d\u6587\u8bed\u97f3\u5931\u8d25"

    .line 492
    .line 493
    goto :goto_9

    .line 494
    :cond_15
    const-string v3, "\u6587\u5b57\u8f6c\u8bed\u97f3\u5f15\u64ce\u672a\u521d\u59cb\u5316"

    .line 495
    .line 496
    :goto_9
    if-eqz v3, :cond_18

    .line 497
    .line 498
    invoke-virtual {v1}, Lnb/w;->w()V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v1}, Lnb/w;->e()Z

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    if-eqz v0, :cond_16

    .line 506
    .line 507
    new-instance v0, Lnb/e;

    .line 508
    .line 509
    const/4 v3, 0x3

    .line 510
    invoke-direct {v0, v1, v3}, Lnb/e;-><init>(Lnb/w;I)V

    .line 511
    .line 512
    .line 513
    const-wide/16 v3, 0x320

    .line 514
    .line 515
    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 516
    .line 517
    .line 518
    goto :goto_b

    .line 519
    :cond_16
    invoke-virtual {v1}, Lnb/w;->y()Lnb/z;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-virtual {v0}, Lnb/z;->c()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 528
    .line 529
    .line 530
    move-result v2

    .line 531
    if-eqz v2, :cond_17

    .line 532
    .line 533
    const-string v0, "\u7cfb\u7edf\u9ed8\u8ba4"

    .line 534
    .line 535
    :cond_17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 536
    .line 537
    const-string v4, "[Hchat:TextSpeech] "

    .line 538
    .line 539
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    const-string v3, ", engine="

    .line 546
    .line 547
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v1}, Lnb/w;->p()V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v1}, Lnb/w;->i()V

    .line 564
    .line 565
    .line 566
    goto :goto_b

    .line 567
    :cond_18
    iput-boolean v5, v1, Lnb/w;->g:Z

    .line 568
    .line 569
    invoke-virtual {v1}, Lnb/w;->n()V

    .line 570
    .line 571
    .line 572
    goto :goto_b

    .line 573
    :cond_19
    :goto_a
    invoke-virtual {v1, v3}, Lnb/w;->v(Ljava/lang/Throwable;)V

    .line 574
    .line 575
    .line 576
    :goto_b
    return-void

    .line 577
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
