.class public final synthetic Leb/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 22
    iput p8, p0, Leb/m;->g:I

    iput-object p1, p0, Leb/m;->h:Ljava/lang/Object;

    iput-object p2, p0, Leb/m;->i:Ljava/lang/Object;

    iput-object p3, p0, Leb/m;->j:Ljava/lang/Object;

    iput-object p4, p0, Leb/m;->m:Ljava/lang/Object;

    iput-object p5, p0, Leb/m;->n:Ljava/lang/Object;

    iput-object p6, p0, Leb/m;->k:Ljava/lang/Object;

    iput-object p7, p0, Leb/m;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Leb/m;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Leb/m;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Leb/m;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Leb/m;->m:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Leb/m;->n:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Leb/m;->j:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Leb/m;->k:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p7, p0, Leb/m;->l:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Lwb/hq;Ljava/lang/String;Li0/a1;Li0/a1;Ljava/util/List;Lfg/a;Landroid/content/Context;)V
    .locals 1

    .line 23
    const/4 v0, 0x5

    iput v0, p0, Leb/m;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/m;->i:Ljava/lang/Object;

    iput-object p2, p0, Leb/m;->h:Ljava/lang/Object;

    iput-object p3, p0, Leb/m;->j:Ljava/lang/Object;

    iput-object p4, p0, Leb/m;->m:Ljava/lang/Object;

    iput-object p5, p0, Leb/m;->n:Ljava/lang/Object;

    iput-object p6, p0, Leb/m;->k:Ljava/lang/Object;

    iput-object p7, p0, Leb/m;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Leb/m;->g:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Leb/m;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, v1, Leb/m;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Li0/a1;

    .line 15
    .line 16
    iget-object v3, v1, Leb/m;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Li0/a1;

    .line 19
    .line 20
    iget-object v4, v1, Leb/m;->m:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v4, Li0/a1;

    .line 23
    .line 24
    iget-object v5, v1, Leb/m;->n:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v5, Li0/a1;

    .line 27
    .line 28
    iget-object v6, v1, Leb/m;->k:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v6, Li0/a1;

    .line 31
    .line 32
    iget-object v7, v1, Leb/m;->l:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v7, Li0/a1;

    .line 35
    .line 36
    move-object/from16 v8, p1

    .line 37
    .line 38
    check-cast v8, Li0/a0;

    .line 39
    .line 40
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    if-eqz v9, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    :try_start_0
    new-instance v9, Landroid/media/MediaPlayer;

    .line 53
    .line 54
    invoke-direct {v9}, Landroid/media/MediaPlayer;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v9, v0}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lwb/fv;

    .line 61
    .line 62
    invoke-direct {v0, v2, v3, v4, v5}, Lwb/fv;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v9, v0}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Lwb/gv;

    .line 69
    .line 70
    invoke-direct {v0, v8, v4, v5}, Lwb/gv;-><init>(Li0/a0;Li0/a1;Li0/a1;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v9, v0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 74
    .line 75
    .line 76
    new-instance v0, Lwb/hv;

    .line 77
    .line 78
    invoke-direct {v0, v3, v4, v6}, Lwb/hv;-><init>(Li0/a1;Li0/a1;Li0/a1;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v9, v0}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v7, v9}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v9}, Landroid/media/MediaPlayer;->prepareAsync()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    new-instance v9, Lsf/f;

    .line 93
    .line 94
    invoke-direct {v9, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    :goto_0
    invoke-static {v9}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-eqz v0, :cond_1

    .line 102
    .line 103
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-interface {v3, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v4, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    const-string v0, "\u9884\u89c8\u64ad\u653e\u5931\u8d25"

    .line 112
    .line 113
    invoke-interface {v6, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_1
    :goto_1
    new-instance v0, Lw/g1;

    .line 117
    .line 118
    invoke-direct {v0, v7, v8}, Lw/g1;-><init>(Li0/a1;Li0/a0;)V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_0
    iget-object v0, v1, Leb/m;->h:Ljava/lang/Object;

    .line 123
    .line 124
    move-object v3, v0

    .line 125
    check-cast v3, Landroid/content/SharedPreferences;

    .line 126
    .line 127
    iget-object v0, v1, Leb/m;->i:Ljava/lang/Object;

    .line 128
    .line 129
    move-object v4, v0

    .line 130
    check-cast v4, Li0/a1;

    .line 131
    .line 132
    iget-object v0, v1, Leb/m;->j:Ljava/lang/Object;

    .line 133
    .line 134
    move-object v5, v0

    .line 135
    check-cast v5, Li0/a1;

    .line 136
    .line 137
    iget-object v0, v1, Leb/m;->m:Ljava/lang/Object;

    .line 138
    .line 139
    move-object v6, v0

    .line 140
    check-cast v6, Li0/a1;

    .line 141
    .line 142
    iget-object v0, v1, Leb/m;->n:Ljava/lang/Object;

    .line 143
    .line 144
    move-object v7, v0

    .line 145
    check-cast v7, Li0/a1;

    .line 146
    .line 147
    iget-object v0, v1, Leb/m;->k:Ljava/lang/Object;

    .line 148
    .line 149
    move-object v8, v0

    .line 150
    check-cast v8, Li0/a1;

    .line 151
    .line 152
    iget-object v0, v1, Leb/m;->l:Ljava/lang/Object;

    .line 153
    .line 154
    move-object v9, v0

    .line 155
    check-cast v9, Li0/a1;

    .line 156
    .line 157
    move-object/from16 v0, p1

    .line 158
    .line 159
    check-cast v0, Li0/a0;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    new-instance v2, Lwb/tn;

    .line 165
    .line 166
    invoke-direct/range {v2 .. v9}, Lwb/tn;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 167
    .line 168
    .line 169
    return-object v2

    .line 170
    :pswitch_1
    iget-object v0, v1, Leb/m;->h:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Landroid/content/Context;

    .line 173
    .line 174
    iget-object v2, v1, Leb/m;->i:Ljava/lang/Object;

    .line 175
    .line 176
    move-object v4, v2

    .line 177
    check-cast v4, Li0/a1;

    .line 178
    .line 179
    iget-object v2, v1, Leb/m;->j:Ljava/lang/Object;

    .line 180
    .line 181
    move-object v5, v2

    .line 182
    check-cast v5, Li0/a1;

    .line 183
    .line 184
    iget-object v2, v1, Leb/m;->m:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v2, Li0/a1;

    .line 187
    .line 188
    iget-object v3, v1, Leb/m;->n:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v3, Landroid/content/SharedPreferences;

    .line 191
    .line 192
    iget-object v6, v1, Leb/m;->k:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v6, Li0/a1;

    .line 195
    .line 196
    iget-object v7, v1, Leb/m;->l:Ljava/lang/Object;

    .line 197
    .line 198
    move-object v11, v7

    .line 199
    check-cast v11, Li0/a1;

    .line 200
    .line 201
    move-object/from16 v7, p1

    .line 202
    .line 203
    check-cast v7, Ljava/util/List;

    .line 204
    .line 205
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    new-instance v12, Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-static {v7}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    invoke-direct {v12, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 215
    .line 216
    .line 217
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v8

    .line 225
    const/4 v9, 0x1

    .line 226
    if-eqz v8, :cond_b

    .line 227
    .line 228
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    check-cast v8, Lwb/m5;

    .line 233
    .line 234
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    check-cast v10, Ljava/util/List;

    .line 239
    .line 240
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v15

    .line 244
    check-cast v15, Ljava/util/List;

    .line 245
    .line 246
    iget-object v13, v8, Lwb/m5;->a:Lwb/s0;

    .line 247
    .line 248
    iget-object v13, v13, Lwb/s0;->a:Ljava/lang/String;

    .line 249
    .line 250
    invoke-static {v13}, La7/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v13

    .line 254
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v15

    .line 258
    :cond_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v16

    .line 262
    if-eqz v16, :cond_3

    .line 263
    .line 264
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v16

    .line 268
    move-object/from16 v14, v16

    .line 269
    .line 270
    check-cast v14, Lna/i;

    .line 271
    .line 272
    iget-object v14, v14, Lna/i;->b:Ljava/lang/String;

    .line 273
    .line 274
    invoke-static {v14}, La7/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v14

    .line 278
    invoke-static {v14, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v14

    .line 282
    if-eqz v14, :cond_2

    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_3
    const/16 v16, 0x0

    .line 286
    .line 287
    :goto_3
    move-object/from16 v13, v16

    .line 288
    .line 289
    check-cast v13, Lna/i;

    .line 290
    .line 291
    iget-object v8, v8, Lwb/m5;->a:Lwb/s0;

    .line 292
    .line 293
    iget-object v14, v8, Lwb/s0;->a:Ljava/lang/String;

    .line 294
    .line 295
    invoke-static {v14}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 296
    .line 297
    .line 298
    move-result-object v14

    .line 299
    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v20

    .line 303
    if-eqz v13, :cond_4

    .line 304
    .line 305
    iget-object v14, v13, Lna/i;->a:Ljava/lang/String;

    .line 306
    .line 307
    if-eqz v14, :cond_4

    .line 308
    .line 309
    :goto_4
    move-object/from16 v19, v14

    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_4
    invoke-static/range {v20 .. v20}, La7/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v14

    .line 316
    goto :goto_4

    .line 317
    :goto_5
    if-eqz v13, :cond_6

    .line 318
    .line 319
    iget-object v14, v13, Lna/i;->c:Ljava/lang/String;

    .line 320
    .line 321
    if-eqz v14, :cond_6

    .line 322
    .line 323
    invoke-static {v14}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 324
    .line 325
    .line 326
    move-result v15

    .line 327
    if-nez v15, :cond_5

    .line 328
    .line 329
    goto :goto_6

    .line 330
    :cond_5
    const/4 v14, 0x0

    .line 331
    :goto_6
    if-eqz v14, :cond_6

    .line 332
    .line 333
    :goto_7
    move-object/from16 v21, v14

    .line 334
    .line 335
    goto :goto_8

    .line 336
    :cond_6
    iget-object v8, v8, Lwb/s0;->b:Ljava/lang/String;

    .line 337
    .line 338
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 339
    .line 340
    .line 341
    move-result v14

    .line 342
    if-eqz v14, :cond_7

    .line 343
    .line 344
    move-object/from16 v14, v20

    .line 345
    .line 346
    goto :goto_7

    .line 347
    :cond_7
    move-object v14, v8

    .line 348
    goto :goto_7

    .line 349
    :goto_8
    if-eqz v13, :cond_8

    .line 350
    .line 351
    iget-boolean v14, v13, Lna/i;->d:Z

    .line 352
    .line 353
    move/from16 v22, v14

    .line 354
    .line 355
    goto :goto_9

    .line 356
    :cond_8
    const/16 v22, 0x0

    .line 357
    .line 358
    :goto_9
    if-eqz v13, :cond_9

    .line 359
    .line 360
    iget-object v8, v13, Lna/i;->e:Ljava/lang/String;

    .line 361
    .line 362
    if-eqz v8, :cond_9

    .line 363
    .line 364
    :goto_a
    move-object/from16 v23, v8

    .line 365
    .line 366
    goto :goto_b

    .line 367
    :cond_9
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 368
    .line 369
    .line 370
    move-result v8

    .line 371
    if-ne v8, v9, :cond_a

    .line 372
    .line 373
    invoke-static {v10}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v8

    .line 377
    check-cast v8, Lna/j;

    .line 378
    .line 379
    iget-object v8, v8, Lna/j;->a:Ljava/lang/String;

    .line 380
    .line 381
    goto :goto_a

    .line 382
    :cond_a
    const-string v8, ""

    .line 383
    .line 384
    goto :goto_a

    .line 385
    :goto_b
    new-instance v18, Lna/i;

    .line 386
    .line 387
    const/16 v24, 0x0

    .line 388
    .line 389
    const/16 v25, 0x0

    .line 390
    .line 391
    invoke-direct/range {v18 .. v25}, Lna/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLna/j;)V

    .line 392
    .line 393
    .line 394
    move-object/from16 v8, v18

    .line 395
    .line 396
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    goto/16 :goto_2

    .line 400
    .line 401
    :cond_b
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 402
    .line 403
    .line 404
    move-result v7

    .line 405
    if-ne v7, v9, :cond_12

    .line 406
    .line 407
    invoke-static {v12}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    check-cast v0, Lna/i;

    .line 412
    .line 413
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    check-cast v3, Ljava/util/List;

    .line 418
    .line 419
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    const/4 v4, 0x0

    .line 424
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 425
    .line 426
    .line 427
    move-result v6

    .line 428
    if-eqz v6, :cond_d

    .line 429
    .line 430
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v6

    .line 434
    check-cast v6, Lna/i;

    .line 435
    .line 436
    iget-object v6, v6, Lna/i;->b:Ljava/lang/String;

    .line 437
    .line 438
    iget-object v7, v0, Lna/i;->b:Ljava/lang/String;

    .line 439
    .line 440
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v6

    .line 444
    if-eqz v6, :cond_c

    .line 445
    .line 446
    goto :goto_d

    .line 447
    :cond_c
    add-int/lit8 v4, v4, 0x1

    .line 448
    .line 449
    goto :goto_c

    .line 450
    :cond_d
    const/4 v4, -0x1

    .line 451
    :goto_d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    if-ltz v4, :cond_e

    .line 456
    .line 457
    goto :goto_e

    .line 458
    :cond_e
    const/4 v3, 0x0

    .line 459
    :goto_e
    if-eqz v3, :cond_f

    .line 460
    .line 461
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 462
    .line 463
    .line 464
    move-result v3

    .line 465
    goto :goto_f

    .line 466
    :cond_f
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    check-cast v3, Ljava/util/List;

    .line 471
    .line 472
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 473
    .line 474
    .line 475
    move-result v3

    .line 476
    :goto_f
    if-ltz v4, :cond_10

    .line 477
    .line 478
    move v14, v9

    .line 479
    goto :goto_10

    .line 480
    :cond_10
    const/4 v14, 0x0

    .line 481
    :goto_10
    new-instance v4, Lwb/hq;

    .line 482
    .line 483
    invoke-direct {v4, v3, v0, v14}, Lwb/hq;-><init>(ILna/i;Z)V

    .line 484
    .line 485
    .line 486
    invoke-interface {v2, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    :cond_11
    :goto_11
    const/4 v0, 0x0

    .line 490
    goto :goto_12

    .line 491
    :cond_12
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 492
    .line 493
    .line 494
    move-result v2

    .line 495
    if-nez v2, :cond_11

    .line 496
    .line 497
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    check-cast v2, Ljava/util/List;

    .line 502
    .line 503
    invoke-static {v2, v12}, Lwb/ho;->t7(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 504
    .line 505
    .line 506
    move-result-object v8

    .line 507
    invoke-interface {v5, v8}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    const/4 v9, 0x0

    .line 511
    const/16 v10, 0x50

    .line 512
    .line 513
    const/4 v7, 0x0

    .line 514
    invoke-static/range {v3 .. v10}, Lwb/ho;->Y2(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;I)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    const-string v3, "\u5df2\u6dfb\u52a0 "

    .line 522
    .line 523
    const-string v4, " \u4e2a\u9002\u7528\u804a\u5929"

    .line 524
    .line 525
    const/4 v5, 0x0

    .line 526
    invoke-static {v3, v2, v4, v0, v5}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 527
    .line 528
    .line 529
    goto :goto_11

    .line 530
    :goto_12
    invoke-interface {v11, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 534
    .line 535
    return-object v0

    .line 536
    :pswitch_2
    iget-object v0, v1, Leb/m;->h:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v0, Lx8/r;

    .line 539
    .line 540
    iget-object v2, v1, Leb/m;->i:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v2, Landroid/content/Context;

    .line 543
    .line 544
    iget-object v3, v1, Leb/m;->j:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast v3, Li0/a1;

    .line 547
    .line 548
    iget-object v4, v1, Leb/m;->m:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v4, Li0/a1;

    .line 551
    .line 552
    iget-object v5, v1, Leb/m;->n:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v5, Li0/a1;

    .line 555
    .line 556
    iget-object v6, v1, Leb/m;->k:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v6, Li0/a1;

    .line 559
    .line 560
    iget-object v7, v1, Leb/m;->l:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v7, Li0/a1;

    .line 563
    .line 564
    move-object/from16 v27, p1

    .line 565
    .line 566
    check-cast v27, Ljava/util/List;

    .line 567
    .line 568
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v3

    .line 575
    check-cast v3, Ljava/lang/String;

    .line 576
    .line 577
    const-string v8, "autoAccept"

    .line 578
    .line 579
    invoke-static {v3, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v8

    .line 583
    const/4 v9, 0x0

    .line 584
    if-eqz v8, :cond_14

    .line 585
    .line 586
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    const-string v3, "auto_accept_steps_v1"

    .line 590
    .line 591
    invoke-static/range {v27 .. v27}, Lr9/e0;->B(Ljava/util/List;)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v4

    .line 595
    invoke-virtual {v0, v3, v4}, Lx8/r;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    :cond_13
    :goto_13
    move-object v4, v9

    .line 599
    goto/16 :goto_19

    .line 600
    .line 601
    :cond_14
    const-string v8, "greetAccepted"

    .line 602
    .line 603
    invoke-static {v3, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v3

    .line 607
    if-eqz v3, :cond_15

    .line 608
    .line 609
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    const-string v3, "greet_accepted_steps_v1"

    .line 613
    .line 614
    invoke-static/range {v27 .. v27}, Lr9/e0;->B(Ljava/util/List;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v4

    .line 618
    invoke-virtual {v0, v3, v4}, Lx8/r;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    goto :goto_13

    .line 622
    :cond_15
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v3

    .line 626
    check-cast v3, Ljava/lang/String;

    .line 627
    .line 628
    if-eqz v3, :cond_13

    .line 629
    .line 630
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v4

    .line 634
    check-cast v4, Lx8/b;

    .line 635
    .line 636
    if-eqz v4, :cond_16

    .line 637
    .line 638
    :goto_14
    move-object v8, v4

    .line 639
    goto :goto_16

    .line 640
    :cond_16
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v4

    .line 644
    check-cast v4, Ljava/util/List;

    .line 645
    .line 646
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 647
    .line 648
    .line 649
    move-result-object v4

    .line 650
    :cond_17
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 651
    .line 652
    .line 653
    move-result v8

    .line 654
    if-eqz v8, :cond_18

    .line 655
    .line 656
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v8

    .line 660
    move-object v10, v8

    .line 661
    check-cast v10, Lx8/b;

    .line 662
    .line 663
    iget-object v10, v10, Lx8/b;->a:Ljava/lang/String;

    .line 664
    .line 665
    invoke-static {v10, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    move-result v10

    .line 669
    if-eqz v10, :cond_17

    .line 670
    .line 671
    goto :goto_15

    .line 672
    :cond_18
    move-object v8, v9

    .line 673
    :goto_15
    move-object v4, v8

    .line 674
    check-cast v4, Lx8/b;

    .line 675
    .line 676
    goto :goto_14

    .line 677
    :goto_16
    if-eqz v8, :cond_19

    .line 678
    .line 679
    const/16 v26, 0x0

    .line 680
    .line 681
    const v28, 0x3ffff

    .line 682
    .line 683
    .line 684
    move-object v4, v9

    .line 685
    const/4 v9, 0x0

    .line 686
    const/4 v10, 0x0

    .line 687
    const/4 v11, 0x0

    .line 688
    const/4 v12, 0x0

    .line 689
    const/4 v13, 0x0

    .line 690
    const/4 v14, 0x0

    .line 691
    const/4 v15, 0x0

    .line 692
    const/16 v16, 0x0

    .line 693
    .line 694
    const/16 v17, 0x0

    .line 695
    .line 696
    const/16 v18, 0x0

    .line 697
    .line 698
    const/16 v19, 0x0

    .line 699
    .line 700
    const/16 v20, 0x0

    .line 701
    .line 702
    const/16 v21, 0x0

    .line 703
    .line 704
    const/16 v22, 0x0

    .line 705
    .line 706
    const/16 v23, 0x0

    .line 707
    .line 708
    const-wide/16 v24, 0x0

    .line 709
    .line 710
    invoke-static/range {v8 .. v28}, Lx8/b;->a(Lx8/b;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;IILjava/lang/String;Ljava/lang/String;IJZLjava/util/List;I)Lx8/b;

    .line 711
    .line 712
    .line 713
    move-result-object v9

    .line 714
    goto :goto_17

    .line 715
    :cond_19
    move-object v4, v9

    .line 716
    :goto_17
    if-eqz v9, :cond_1c

    .line 717
    .line 718
    invoke-interface {v5, v9}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 719
    .line 720
    .line 721
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v5

    .line 725
    check-cast v5, Ljava/util/List;

    .line 726
    .line 727
    new-instance v8, Ljava/util/ArrayList;

    .line 728
    .line 729
    invoke-static {v5}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 730
    .line 731
    .line 732
    move-result v10

    .line 733
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 734
    .line 735
    .line 736
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 737
    .line 738
    .line 739
    move-result-object v5

    .line 740
    :goto_18
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 741
    .line 742
    .line 743
    move-result v10

    .line 744
    if-eqz v10, :cond_1b

    .line 745
    .line 746
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v10

    .line 750
    check-cast v10, Lx8/b;

    .line 751
    .line 752
    iget-object v11, v10, Lx8/b;->a:Ljava/lang/String;

    .line 753
    .line 754
    invoke-static {v11, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    move-result v11

    .line 758
    if-eqz v11, :cond_1a

    .line 759
    .line 760
    move-object v10, v9

    .line 761
    :cond_1a
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    goto :goto_18

    .line 765
    :cond_1b
    invoke-static {v0, v6, v8}, Lwb/ho;->B(Lx8/r;Li0/a1;Ljava/util/ArrayList;)V

    .line 766
    .line 767
    .line 768
    :cond_1c
    :goto_19
    const-string v0, "\u56de\u590d\u6b65\u9aa4\u5df2\u4fdd\u5b58"

    .line 769
    .line 770
    const/4 v3, 0x0

    .line 771
    invoke-static {v2, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 776
    .line 777
    .line 778
    invoke-interface {v7, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 779
    .line 780
    .line 781
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 782
    .line 783
    return-object v0

    .line 784
    :pswitch_3
    iget-object v0, v1, Leb/m;->h:Ljava/lang/Object;

    .line 785
    .line 786
    move-object v5, v0

    .line 787
    check-cast v5, Li0/a1;

    .line 788
    .line 789
    iget-object v0, v1, Leb/m;->i:Ljava/lang/Object;

    .line 790
    .line 791
    move-object v4, v0

    .line 792
    check-cast v4, Landroid/content/SharedPreferences;

    .line 793
    .line 794
    iget-object v0, v1, Leb/m;->j:Ljava/lang/Object;

    .line 795
    .line 796
    move-object v7, v0

    .line 797
    check-cast v7, Li0/a1;

    .line 798
    .line 799
    iget-object v0, v1, Leb/m;->m:Ljava/lang/Object;

    .line 800
    .line 801
    move-object v3, v0

    .line 802
    check-cast v3, Ljava/util/List;

    .line 803
    .line 804
    iget-object v0, v1, Leb/m;->n:Ljava/lang/Object;

    .line 805
    .line 806
    move-object v6, v0

    .line 807
    check-cast v6, Lfg/p;

    .line 808
    .line 809
    iget-object v0, v1, Leb/m;->k:Ljava/lang/Object;

    .line 810
    .line 811
    check-cast v0, Ljava/util/List;

    .line 812
    .line 813
    iget-object v2, v1, Leb/m;->l:Ljava/lang/Object;

    .line 814
    .line 815
    move-object v9, v2

    .line 816
    check-cast v9, Lfg/l;

    .line 817
    .line 818
    move-object/from16 v10, p1

    .line 819
    .line 820
    check-cast v10, Lr/h;

    .line 821
    .line 822
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v2

    .line 829
    check-cast v2, Ljava/lang/String;

    .line 830
    .line 831
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 832
    .line 833
    .line 834
    move-result v2

    .line 835
    const/4 v11, 0x3

    .line 836
    const/4 v12, 0x0

    .line 837
    const/4 v13, 0x1

    .line 838
    if-eqz v2, :cond_1d

    .line 839
    .line 840
    new-instance v0, Lwb/t7;

    .line 841
    .line 842
    invoke-direct {v0, v4, v5, v7}, Lwb/t7;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V

    .line 843
    .line 844
    .line 845
    new-instance v2, Ls0/d;

    .line 846
    .line 847
    const v3, 0x569bbbfc

    .line 848
    .line 849
    .line 850
    invoke-direct {v2, v3, v0, v13}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 851
    .line 852
    .line 853
    invoke-static {v10, v12, v2, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 854
    .line 855
    .line 856
    goto :goto_1a

    .line 857
    :cond_1d
    new-instance v2, Lwb/nd;

    .line 858
    .line 859
    const/4 v8, 0x4

    .line 860
    invoke-direct {v2, v8, v3}, Lwb/nd;-><init>(ILjava/util/List;)V

    .line 861
    .line 862
    .line 863
    new-instance v8, Ls0/d;

    .line 864
    .line 865
    const v14, -0xc07807b

    .line 866
    .line 867
    .line 868
    invoke-direct {v8, v14, v2, v13}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 869
    .line 870
    .line 871
    invoke-static {v10, v12, v8, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 872
    .line 873
    .line 874
    new-instance v2, Lwb/xc;

    .line 875
    .line 876
    const/16 v8, 0xa

    .line 877
    .line 878
    invoke-direct/range {v2 .. v8}, Lwb/xc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lfg/p;Ljava/lang/Object;I)V

    .line 879
    .line 880
    .line 881
    new-instance v3, Ls0/d;

    .line 882
    .line 883
    const v6, -0x6edfae84

    .line 884
    .line 885
    .line 886
    invoke-direct {v3, v6, v2, v13}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 887
    .line 888
    .line 889
    invoke-static {v10, v12, v3, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 890
    .line 891
    .line 892
    new-instance v2, Lwb/nd;

    .line 893
    .line 894
    const/4 v3, 0x5

    .line 895
    invoke-direct {v2, v3, v0}, Lwb/nd;-><init>(ILjava/util/List;)V

    .line 896
    .line 897
    .line 898
    new-instance v3, Ls0/d;

    .line 899
    .line 900
    const v6, 0x1211b0bd

    .line 901
    .line 902
    .line 903
    invoke-direct {v3, v6, v2, v13}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 904
    .line 905
    .line 906
    invoke-static {v10, v12, v3, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 907
    .line 908
    .line 909
    new-instance v2, Lwb/xc;

    .line 910
    .line 911
    move-object v3, v0

    .line 912
    move-object v6, v9

    .line 913
    invoke-direct/range {v2 .. v7}, Lwb/xc;-><init>(Ljava/util/List;Landroid/content/SharedPreferences;Li0/a1;Lfg/l;Li0/a1;)V

    .line 914
    .line 915
    .line 916
    new-instance v0, Ls0/d;

    .line 917
    .line 918
    const v3, -0x6cfcf002

    .line 919
    .line 920
    .line 921
    invoke-direct {v0, v3, v2, v13}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 922
    .line 923
    .line 924
    invoke-static {v10, v12, v0, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 925
    .line 926
    .line 927
    :goto_1a
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 928
    .line 929
    return-object v0

    .line 930
    :pswitch_4
    iget-object v0, v1, Leb/m;->h:Ljava/lang/Object;

    .line 931
    .line 932
    check-cast v0, Lwb/nu;

    .line 933
    .line 934
    iget-object v2, v1, Leb/m;->i:Ljava/lang/Object;

    .line 935
    .line 936
    check-cast v2, Li0/a1;

    .line 937
    .line 938
    iget-object v3, v1, Leb/m;->j:Ljava/lang/Object;

    .line 939
    .line 940
    check-cast v3, Ljava/util/List;

    .line 941
    .line 942
    iget-object v4, v1, Leb/m;->m:Ljava/lang/Object;

    .line 943
    .line 944
    check-cast v4, Li0/a1;

    .line 945
    .line 946
    iget-object v5, v1, Leb/m;->n:Ljava/lang/Object;

    .line 947
    .line 948
    check-cast v5, Li0/a1;

    .line 949
    .line 950
    iget-object v6, v1, Leb/m;->k:Ljava/lang/Object;

    .line 951
    .line 952
    check-cast v6, Landroid/content/Context;

    .line 953
    .line 954
    iget-object v7, v1, Leb/m;->l:Ljava/lang/Object;

    .line 955
    .line 956
    check-cast v7, Lfg/a;

    .line 957
    .line 958
    move-object/from16 v8, p1

    .line 959
    .line 960
    check-cast v8, Lr/h;

    .line 961
    .line 962
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 963
    .line 964
    .line 965
    sget-object v9, Lwb/p0;->x5:Ls0/d;

    .line 966
    .line 967
    const/4 v10, 0x0

    .line 968
    const/4 v11, 0x3

    .line 969
    invoke-static {v8, v10, v9, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 970
    .line 971
    .line 972
    new-instance v9, Lwb/s1;

    .line 973
    .line 974
    const/16 v12, 0xd

    .line 975
    .line 976
    invoke-direct {v9, v2, v12}, Lwb/s1;-><init>(Li0/a1;I)V

    .line 977
    .line 978
    .line 979
    new-instance v12, Ls0/d;

    .line 980
    .line 981
    const v13, 0xde98a41

    .line 982
    .line 983
    .line 984
    const/4 v14, 0x1

    .line 985
    invoke-direct {v12, v13, v9, v14}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 986
    .line 987
    .line 988
    invoke-static {v8, v10, v12, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 989
    .line 990
    .line 991
    sget-object v9, Lwb/p0;->y5:Ls0/d;

    .line 992
    .line 993
    invoke-static {v8, v10, v9, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 994
    .line 995
    .line 996
    new-instance v9, Lwb/qc;

    .line 997
    .line 998
    const/4 v12, 0x2

    .line 999
    invoke-direct {v9, v3, v2, v12}, Lwb/qc;-><init>(Ljava/util/List;Li0/a1;I)V

    .line 1000
    .line 1001
    .line 1002
    new-instance v3, Ls0/d;

    .line 1003
    .line 1004
    const v12, 0x604b5743

    .line 1005
    .line 1006
    .line 1007
    invoke-direct {v3, v12, v9, v14}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 1008
    .line 1009
    .line 1010
    invoke-static {v8, v10, v3, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1011
    .line 1012
    .line 1013
    sget-object v3, Lwb/p0;->z5:Ls0/d;

    .line 1014
    .line 1015
    invoke-static {v8, v10, v3, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1016
    .line 1017
    .line 1018
    new-instance v3, Lwb/t1;

    .line 1019
    .line 1020
    const/16 v9, 0x9

    .line 1021
    .line 1022
    invoke-direct {v3, v9, v2, v4}, Lwb/t1;-><init>(ILi0/a1;Li0/a1;)V

    .line 1023
    .line 1024
    .line 1025
    new-instance v4, Ls0/d;

    .line 1026
    .line 1027
    const v9, -0x4d52dbbb

    .line 1028
    .line 1029
    .line 1030
    invoke-direct {v4, v9, v3, v14}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 1031
    .line 1032
    .line 1033
    invoke-static {v8, v10, v4, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1034
    .line 1035
    .line 1036
    sget-object v3, Lwb/p0;->A5:Ls0/d;

    .line 1037
    .line 1038
    invoke-static {v8, v10, v3, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1039
    .line 1040
    .line 1041
    new-instance v3, Lwb/t1;

    .line 1042
    .line 1043
    const/16 v4, 0xa

    .line 1044
    .line 1045
    invoke-direct {v3, v4, v2, v5}, Lwb/t1;-><init>(ILi0/a1;Li0/a1;)V

    .line 1046
    .line 1047
    .line 1048
    new-instance v4, Ls0/d;

    .line 1049
    .line 1050
    const v5, 0x50ef147

    .line 1051
    .line 1052
    .line 1053
    invoke-direct {v4, v5, v3, v14}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 1054
    .line 1055
    .line 1056
    invoke-static {v8, v10, v4, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1057
    .line 1058
    .line 1059
    sget-object v3, Lwb/p0;->B5:Ls0/d;

    .line 1060
    .line 1061
    invoke-static {v8, v10, v3, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1062
    .line 1063
    .line 1064
    new-instance v3, Lwb/oa;

    .line 1065
    .line 1066
    const/4 v4, 0x2

    .line 1067
    invoke-direct {v3, v6, v2, v4}, Lwb/oa;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 1068
    .line 1069
    .line 1070
    new-instance v2, Ls0/d;

    .line 1071
    .line 1072
    const v4, 0x5770be49    # 2.6470006E14f

    .line 1073
    .line 1074
    .line 1075
    invoke-direct {v2, v4, v3, v14}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 1076
    .line 1077
    .line 1078
    invoke-static {v8, v10, v2, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1079
    .line 1080
    .line 1081
    iget-boolean v0, v0, Lwb/nu;->c:Z

    .line 1082
    .line 1083
    if-eqz v0, :cond_1e

    .line 1084
    .line 1085
    sget-object v0, Lwb/p0;->C5:Ls0/d;

    .line 1086
    .line 1087
    invoke-static {v8, v10, v0, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1088
    .line 1089
    .line 1090
    new-instance v0, Lwb/x6;

    .line 1091
    .line 1092
    const/16 v2, 0x10

    .line 1093
    .line 1094
    invoke-direct {v0, v7, v2}, Lwb/x6;-><init>(Lfg/a;I)V

    .line 1095
    .line 1096
    .line 1097
    new-instance v2, Ls0/d;

    .line 1098
    .line 1099
    const v3, -0x780679a4

    .line 1100
    .line 1101
    .line 1102
    invoke-direct {v2, v3, v0, v14}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 1103
    .line 1104
    .line 1105
    invoke-static {v8, v10, v2, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1106
    .line 1107
    .line 1108
    :cond_1e
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1109
    .line 1110
    return-object v0

    .line 1111
    :pswitch_5
    iget-object v0, v1, Leb/m;->i:Ljava/lang/Object;

    .line 1112
    .line 1113
    check-cast v0, Lwb/hq;

    .line 1114
    .line 1115
    iget-object v2, v1, Leb/m;->h:Ljava/lang/Object;

    .line 1116
    .line 1117
    check-cast v2, Ljava/lang/String;

    .line 1118
    .line 1119
    iget-object v3, v1, Leb/m;->j:Ljava/lang/Object;

    .line 1120
    .line 1121
    check-cast v3, Li0/a1;

    .line 1122
    .line 1123
    iget-object v4, v1, Leb/m;->m:Ljava/lang/Object;

    .line 1124
    .line 1125
    check-cast v4, Li0/a1;

    .line 1126
    .line 1127
    iget-object v5, v1, Leb/m;->n:Ljava/lang/Object;

    .line 1128
    .line 1129
    check-cast v5, Ljava/util/List;

    .line 1130
    .line 1131
    iget-object v6, v1, Leb/m;->k:Ljava/lang/Object;

    .line 1132
    .line 1133
    check-cast v6, Lfg/a;

    .line 1134
    .line 1135
    iget-object v7, v1, Leb/m;->l:Ljava/lang/Object;

    .line 1136
    .line 1137
    check-cast v7, Landroid/content/Context;

    .line 1138
    .line 1139
    move-object/from16 v8, p1

    .line 1140
    .line 1141
    check-cast v8, Lr/h;

    .line 1142
    .line 1143
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1144
    .line 1145
    .line 1146
    sget-object v9, Lwb/p0;->P4:Ls0/d;

    .line 1147
    .line 1148
    const/4 v10, 0x0

    .line 1149
    const/4 v11, 0x3

    .line 1150
    invoke-static {v8, v10, v9, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1151
    .line 1152
    .line 1153
    new-instance v9, Lc9/h0;

    .line 1154
    .line 1155
    const/16 v12, 0x16

    .line 1156
    .line 1157
    invoke-direct {v9, v12, v0, v3, v2}, Lc9/h0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1158
    .line 1159
    .line 1160
    new-instance v2, Ls0/d;

    .line 1161
    .line 1162
    const v3, 0x4f82bb48

    .line 1163
    .line 1164
    .line 1165
    const/4 v12, 0x1

    .line 1166
    invoke-direct {v2, v3, v9, v12}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 1167
    .line 1168
    .line 1169
    invoke-static {v8, v10, v2, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1170
    .line 1171
    .line 1172
    sget-object v2, Lwb/p0;->Q4:Ls0/d;

    .line 1173
    .line 1174
    invoke-static {v8, v10, v2, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1175
    .line 1176
    .line 1177
    new-instance v2, Lwb/qc;

    .line 1178
    .line 1179
    const/4 v3, 0x5

    .line 1180
    invoke-direct {v2, v4, v5, v3}, Lwb/qc;-><init>(Li0/a1;Ljava/util/List;I)V

    .line 1181
    .line 1182
    .line 1183
    new-instance v3, Ls0/d;

    .line 1184
    .line 1185
    const v4, -0x10edb9fa

    .line 1186
    .line 1187
    .line 1188
    invoke-direct {v3, v4, v2, v12}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 1189
    .line 1190
    .line 1191
    invoke-static {v8, v10, v3, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1192
    .line 1193
    .line 1194
    iget-boolean v0, v0, Lwb/hq;->c:Z

    .line 1195
    .line 1196
    if-eqz v0, :cond_1f

    .line 1197
    .line 1198
    sget-object v0, Lwb/p0;->R4:Ls0/d;

    .line 1199
    .line 1200
    invoke-static {v8, v10, v0, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1201
    .line 1202
    .line 1203
    new-instance v0, Lwb/dc;

    .line 1204
    .line 1205
    const/4 v2, 0x3

    .line 1206
    invoke-direct {v0, v6, v7, v2}, Lwb/dc;-><init>(Lfg/a;Landroid/content/Context;I)V

    .line 1207
    .line 1208
    .line 1209
    new-instance v2, Ls0/d;

    .line 1210
    .line 1211
    const v3, -0x623ab033

    .line 1212
    .line 1213
    .line 1214
    invoke-direct {v2, v3, v0, v12}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 1215
    .line 1216
    .line 1217
    invoke-static {v8, v10, v2, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1218
    .line 1219
    .line 1220
    :cond_1f
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1221
    .line 1222
    return-object v0

    .line 1223
    :pswitch_6
    iget-object v0, v1, Leb/m;->h:Ljava/lang/Object;

    .line 1224
    .line 1225
    check-cast v0, Ljava/util/ArrayList;

    .line 1226
    .line 1227
    iget-object v2, v1, Leb/m;->i:Ljava/lang/Object;

    .line 1228
    .line 1229
    check-cast v2, Ljava/util/List;

    .line 1230
    .line 1231
    iget-object v3, v1, Leb/m;->j:Ljava/lang/Object;

    .line 1232
    .line 1233
    check-cast v3, Li0/a1;

    .line 1234
    .line 1235
    iget-object v4, v1, Leb/m;->m:Ljava/lang/Object;

    .line 1236
    .line 1237
    check-cast v4, Li0/a1;

    .line 1238
    .line 1239
    iget-object v5, v1, Leb/m;->n:Ljava/lang/Object;

    .line 1240
    .line 1241
    check-cast v5, Li0/a1;

    .line 1242
    .line 1243
    iget-object v6, v1, Leb/m;->k:Ljava/lang/Object;

    .line 1244
    .line 1245
    check-cast v6, Li0/a1;

    .line 1246
    .line 1247
    iget-object v7, v1, Leb/m;->l:Ljava/lang/Object;

    .line 1248
    .line 1249
    check-cast v7, Li0/a1;

    .line 1250
    .line 1251
    move-object/from16 v8, p1

    .line 1252
    .line 1253
    check-cast v8, Lr/h;

    .line 1254
    .line 1255
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1256
    .line 1257
    .line 1258
    new-instance v9, Lwb/u1;

    .line 1259
    .line 1260
    const/4 v10, 0x2

    .line 1261
    invoke-direct {v9, v2, v3, v4, v10}, Lwb/u1;-><init>(Ljava/util/List;Li0/a1;Li0/a1;I)V

    .line 1262
    .line 1263
    .line 1264
    new-instance v2, Ls0/d;

    .line 1265
    .line 1266
    const v3, -0x2cb83282

    .line 1267
    .line 1268
    .line 1269
    const/4 v4, 0x1

    .line 1270
    invoke-direct {v2, v3, v9, v4}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 1271
    .line 1272
    .line 1273
    const/4 v3, 0x0

    .line 1274
    const/4 v9, 0x3

    .line 1275
    invoke-static {v8, v3, v2, v9}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1276
    .line 1277
    .line 1278
    new-instance v2, Lwb/s1;

    .line 1279
    .line 1280
    const/16 v10, 0x11

    .line 1281
    .line 1282
    invoke-direct {v2, v5, v10}, Lwb/s1;-><init>(Li0/a1;I)V

    .line 1283
    .line 1284
    .line 1285
    new-instance v10, Ls0/d;

    .line 1286
    .line 1287
    const v11, 0x24e6ea75

    .line 1288
    .line 1289
    .line 1290
    invoke-direct {v10, v11, v2, v4}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 1291
    .line 1292
    .line 1293
    invoke-static {v8, v3, v10, v9}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1294
    .line 1295
    .line 1296
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v2

    .line 1300
    check-cast v2, Ljava/lang/Boolean;

    .line 1301
    .line 1302
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1303
    .line 1304
    .line 1305
    move-result v2

    .line 1306
    if-eqz v2, :cond_20

    .line 1307
    .line 1308
    sget-object v0, Lwb/p0;->D3:Ls0/d;

    .line 1309
    .line 1310
    invoke-static {v8, v3, v0, v9}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1311
    .line 1312
    .line 1313
    goto :goto_1c

    .line 1314
    :cond_20
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v2

    .line 1318
    check-cast v2, Ljava/lang/String;

    .line 1319
    .line 1320
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1321
    .line 1322
    .line 1323
    move-result v2

    .line 1324
    if-lez v2, :cond_21

    .line 1325
    .line 1326
    new-instance v0, Lwb/s1;

    .line 1327
    .line 1328
    const/16 v2, 0x12

    .line 1329
    .line 1330
    invoke-direct {v0, v7, v2}, Lwb/s1;-><init>(Li0/a1;I)V

    .line 1331
    .line 1332
    .line 1333
    new-instance v2, Ls0/d;

    .line 1334
    .line 1335
    const v5, 0x3e23a11f

    .line 1336
    .line 1337
    .line 1338
    invoke-direct {v2, v5, v0, v4}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 1339
    .line 1340
    .line 1341
    invoke-static {v8, v3, v2, v9}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1342
    .line 1343
    .line 1344
    goto :goto_1c

    .line 1345
    :cond_21
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1346
    .line 1347
    .line 1348
    move-result v2

    .line 1349
    if-eqz v2, :cond_22

    .line 1350
    .line 1351
    sget-object v0, Lwb/p0;->F3:Ls0/d;

    .line 1352
    .line 1353
    invoke-static {v8, v3, v0, v9}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1354
    .line 1355
    .line 1356
    goto :goto_1c

    .line 1357
    :cond_22
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v0

    .line 1361
    :goto_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1362
    .line 1363
    .line 1364
    move-result v2

    .line 1365
    if-eqz v2, :cond_23

    .line 1366
    .line 1367
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v2

    .line 1371
    check-cast v2, Lwb/s0;

    .line 1372
    .line 1373
    new-instance v6, Lwb/v1;

    .line 1374
    .line 1375
    const/4 v7, 0x1

    .line 1376
    invoke-direct {v6, v2, v5, v7}, Lwb/v1;-><init>(Lwb/s0;Li0/a1;I)V

    .line 1377
    .line 1378
    .line 1379
    new-instance v2, Ls0/d;

    .line 1380
    .line 1381
    const v7, 0x42a23d9d

    .line 1382
    .line 1383
    .line 1384
    invoke-direct {v2, v7, v6, v4}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 1385
    .line 1386
    .line 1387
    invoke-static {v8, v3, v2, v9}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1388
    .line 1389
    .line 1390
    goto :goto_1b

    .line 1391
    :cond_23
    :goto_1c
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1392
    .line 1393
    return-object v0

    .line 1394
    :pswitch_7
    iget-object v0, v1, Leb/m;->h:Ljava/lang/Object;

    .line 1395
    .line 1396
    move-object v3, v0

    .line 1397
    check-cast v3, Landroid/content/SharedPreferences;

    .line 1398
    .line 1399
    iget-object v0, v1, Leb/m;->i:Ljava/lang/Object;

    .line 1400
    .line 1401
    check-cast v0, Ljava/util/Set;

    .line 1402
    .line 1403
    iget-object v2, v1, Leb/m;->j:Ljava/lang/Object;

    .line 1404
    .line 1405
    check-cast v2, Lfg/a;

    .line 1406
    .line 1407
    iget-object v4, v1, Leb/m;->m:Ljava/lang/Object;

    .line 1408
    .line 1409
    check-cast v4, Li0/a1;

    .line 1410
    .line 1411
    iget-object v5, v1, Leb/m;->n:Ljava/lang/Object;

    .line 1412
    .line 1413
    check-cast v5, Li0/a1;

    .line 1414
    .line 1415
    iget-object v6, v1, Leb/m;->k:Ljava/lang/Object;

    .line 1416
    .line 1417
    check-cast v6, Li0/a1;

    .line 1418
    .line 1419
    iget-object v7, v1, Leb/m;->l:Ljava/lang/Object;

    .line 1420
    .line 1421
    check-cast v7, Li0/a1;

    .line 1422
    .line 1423
    move-object/from16 v8, p1

    .line 1424
    .line 1425
    check-cast v8, Lr/h;

    .line 1426
    .line 1427
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1428
    .line 1429
    .line 1430
    sget-object v9, Lwb/p0;->T1:Ls0/d;

    .line 1431
    .line 1432
    const/4 v10, 0x0

    .line 1433
    const/4 v11, 0x3

    .line 1434
    invoke-static {v8, v10, v9, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1435
    .line 1436
    .line 1437
    new-instance v9, Lc9/h0;

    .line 1438
    .line 1439
    const/16 v12, 0x13

    .line 1440
    .line 1441
    invoke-direct {v9, v3, v0, v2, v12}, Lc9/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1442
    .line 1443
    .line 1444
    new-instance v0, Ls0/d;

    .line 1445
    .line 1446
    const v2, 0x5f5fdeeb

    .line 1447
    .line 1448
    .line 1449
    const/4 v12, 0x1

    .line 1450
    invoke-direct {v0, v2, v9, v12}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 1451
    .line 1452
    .line 1453
    invoke-static {v8, v10, v0, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1454
    .line 1455
    .line 1456
    sget-object v0, Lwb/p0;->U1:Ls0/d;

    .line 1457
    .line 1458
    invoke-static {v8, v10, v0, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1459
    .line 1460
    .line 1461
    new-instance v0, Lwb/vc;

    .line 1462
    .line 1463
    const/4 v2, 0x1

    .line 1464
    invoke-direct {v0, v3, v4, v2}, Lwb/vc;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1465
    .line 1466
    .line 1467
    new-instance v2, Ls0/d;

    .line 1468
    .line 1469
    const v4, -0x33683213    # -7.9589224E7f

    .line 1470
    .line 1471
    .line 1472
    invoke-direct {v2, v4, v0, v12}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 1473
    .line 1474
    .line 1475
    invoke-static {v8, v10, v2, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1476
    .line 1477
    .line 1478
    sget-object v0, Lwb/p0;->V1:Ls0/d;

    .line 1479
    .line 1480
    invoke-static {v8, v10, v0, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1481
    .line 1482
    .line 1483
    new-instance v2, Lwb/pa;

    .line 1484
    .line 1485
    move-object v4, v5

    .line 1486
    move-object v5, v6

    .line 1487
    move-object v6, v7

    .line 1488
    const/4 v7, 0x2

    .line 1489
    invoke-direct/range {v2 .. v7}, Lwb/pa;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 1490
    .line 1491
    .line 1492
    new-instance v0, Ls0/d;

    .line 1493
    .line 1494
    const v3, 0x39cfbcef

    .line 1495
    .line 1496
    .line 1497
    invoke-direct {v0, v3, v2, v12}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 1498
    .line 1499
    .line 1500
    invoke-static {v8, v10, v0, v11}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 1501
    .line 1502
    .line 1503
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1504
    .line 1505
    return-object v0

    .line 1506
    :pswitch_8
    iget-object v0, v1, Leb/m;->h:Ljava/lang/Object;

    .line 1507
    .line 1508
    move-object v3, v0

    .line 1509
    check-cast v3, Li0/l2;

    .line 1510
    .line 1511
    iget-object v0, v1, Leb/m;->i:Ljava/lang/Object;

    .line 1512
    .line 1513
    move-object v4, v0

    .line 1514
    check-cast v4, Li0/l2;

    .line 1515
    .line 1516
    iget-object v0, v1, Leb/m;->j:Ljava/lang/Object;

    .line 1517
    .line 1518
    move-object v5, v0

    .line 1519
    check-cast v5, Li0/l2;

    .line 1520
    .line 1521
    iget-object v0, v1, Leb/m;->m:Ljava/lang/Object;

    .line 1522
    .line 1523
    move-object v6, v0

    .line 1524
    check-cast v6, Li0/l2;

    .line 1525
    .line 1526
    iget-object v0, v1, Leb/m;->n:Ljava/lang/Object;

    .line 1527
    .line 1528
    move-object v7, v0

    .line 1529
    check-cast v7, Li0/l2;

    .line 1530
    .line 1531
    iget-object v0, v1, Leb/m;->k:Ljava/lang/Object;

    .line 1532
    .line 1533
    move-object v8, v0

    .line 1534
    check-cast v8, Li0/l2;

    .line 1535
    .line 1536
    iget-object v0, v1, Leb/m;->l:Ljava/lang/Object;

    .line 1537
    .line 1538
    move-object v9, v0

    .line 1539
    check-cast v9, Lf1/j;

    .line 1540
    .line 1541
    move-object/from16 v0, p1

    .line 1542
    .line 1543
    check-cast v0, Lc1/d;

    .line 1544
    .line 1545
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1546
    .line 1547
    .line 1548
    iget-object v2, v0, Lc1/d;->g:Lc1/a;

    .line 1549
    .line 1550
    invoke-interface {v2}, Lc1/a;->a()J

    .line 1551
    .line 1552
    .line 1553
    move-result-wide v10

    .line 1554
    const/16 v2, 0x20

    .line 1555
    .line 1556
    shr-long/2addr v10, v2

    .line 1557
    long-to-int v10, v10

    .line 1558
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1559
    .line 1560
    .line 1561
    move-result v10

    .line 1562
    const v11, 0x3db851ec    # 0.09f

    .line 1563
    .line 1564
    .line 1565
    mul-float v21, v10, v11

    .line 1566
    .line 1567
    iget-object v10, v0, Lc1/d;->g:Lc1/a;

    .line 1568
    .line 1569
    invoke-interface {v10}, Lc1/a;->a()J

    .line 1570
    .line 1571
    .line 1572
    move-result-wide v10

    .line 1573
    shr-long/2addr v10, v2

    .line 1574
    long-to-int v10, v10

    .line 1575
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1576
    .line 1577
    .line 1578
    move-result v10

    .line 1579
    const/4 v11, 0x2

    .line 1580
    int-to-float v11, v11

    .line 1581
    div-float v19, v10, v11

    .line 1582
    .line 1583
    iget-object v10, v0, Lc1/d;->g:Lc1/a;

    .line 1584
    .line 1585
    invoke-interface {v10}, Lc1/a;->a()J

    .line 1586
    .line 1587
    .line 1588
    move-result-wide v12

    .line 1589
    const-wide v14, 0xffffffffL

    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    and-long/2addr v12, v14

    .line 1595
    long-to-int v10, v12

    .line 1596
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1597
    .line 1598
    .line 1599
    move-result v10

    .line 1600
    div-float v20, v10, v11

    .line 1601
    .line 1602
    const/high16 v10, 0x41b80000    # 23.0f

    .line 1603
    .line 1604
    div-float v11, v10, v11

    .line 1605
    .line 1606
    const/high16 v12, 0x40a00000    # 5.0f

    .line 1607
    .line 1608
    sub-float/2addr v12, v11

    .line 1609
    div-float/2addr v12, v10

    .line 1610
    iget-object v13, v0, Lc1/d;->g:Lc1/a;

    .line 1611
    .line 1612
    invoke-interface {v13}, Lc1/a;->a()J

    .line 1613
    .line 1614
    .line 1615
    move-result-wide v16

    .line 1616
    move/from16 p1, v2

    .line 1617
    .line 1618
    move-object/from16 v22, v3

    .line 1619
    .line 1620
    shr-long v2, v16, p1

    .line 1621
    .line 1622
    long-to-int v2, v2

    .line 1623
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1624
    .line 1625
    .line 1626
    move-result v2

    .line 1627
    mul-float/2addr v2, v12

    .line 1628
    add-float v2, v2, v19

    .line 1629
    .line 1630
    const v3, 0x41166666    # 9.4f

    .line 1631
    .line 1632
    .line 1633
    sub-float/2addr v3, v11

    .line 1634
    div-float/2addr v3, v10

    .line 1635
    iget-object v12, v0, Lc1/d;->g:Lc1/a;

    .line 1636
    .line 1637
    invoke-interface {v12}, Lc1/a;->a()J

    .line 1638
    .line 1639
    .line 1640
    move-result-wide v12

    .line 1641
    and-long/2addr v12, v14

    .line 1642
    long-to-int v12, v12

    .line 1643
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1644
    .line 1645
    .line 1646
    move-result v12

    .line 1647
    mul-float/2addr v12, v3

    .line 1648
    add-float v12, v12, v20

    .line 1649
    .line 1650
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1651
    .line 1652
    .line 1653
    move-result v2

    .line 1654
    int-to-long v2, v2

    .line 1655
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1656
    .line 1657
    .line 1658
    move-result v12

    .line 1659
    int-to-long v12, v12

    .line 1660
    shl-long v2, v2, p1

    .line 1661
    .line 1662
    and-long/2addr v12, v14

    .line 1663
    or-long/2addr v2, v12

    .line 1664
    const v12, 0x4124cccd    # 10.3f

    .line 1665
    .line 1666
    .line 1667
    sub-float/2addr v12, v11

    .line 1668
    div-float/2addr v12, v10

    .line 1669
    iget-object v13, v0, Lc1/d;->g:Lc1/a;

    .line 1670
    .line 1671
    invoke-interface {v13}, Lc1/a;->a()J

    .line 1672
    .line 1673
    .line 1674
    move-result-wide v16

    .line 1675
    move v13, v10

    .line 1676
    move/from16 v18, v11

    .line 1677
    .line 1678
    shr-long v10, v16, p1

    .line 1679
    .line 1680
    long-to-int v10, v10

    .line 1681
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1682
    .line 1683
    .line 1684
    move-result v10

    .line 1685
    mul-float/2addr v10, v12

    .line 1686
    add-float v10, v10, v19

    .line 1687
    .line 1688
    const v11, 0x416e6666    # 14.9f

    .line 1689
    .line 1690
    .line 1691
    sub-float v11, v11, v18

    .line 1692
    .line 1693
    div-float/2addr v11, v13

    .line 1694
    iget-object v12, v0, Lc1/d;->g:Lc1/a;

    .line 1695
    .line 1696
    invoke-interface {v12}, Lc1/a;->a()J

    .line 1697
    .line 1698
    .line 1699
    move-result-wide v16

    .line 1700
    move v12, v13

    .line 1701
    move-wide/from16 v23, v14

    .line 1702
    .line 1703
    and-long v13, v16, v23

    .line 1704
    .line 1705
    long-to-int v13, v13

    .line 1706
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1707
    .line 1708
    .line 1709
    move-result v13

    .line 1710
    mul-float/2addr v13, v11

    .line 1711
    add-float v13, v13, v20

    .line 1712
    .line 1713
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1714
    .line 1715
    .line 1716
    move-result v10

    .line 1717
    int-to-long v10, v10

    .line 1718
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1719
    .line 1720
    .line 1721
    move-result v13

    .line 1722
    int-to-long v13, v13

    .line 1723
    shl-long v10, v10, p1

    .line 1724
    .line 1725
    and-long v13, v13, v23

    .line 1726
    .line 1727
    or-long v15, v10, v13

    .line 1728
    .line 1729
    const v10, 0x418f3333    # 17.9f

    .line 1730
    .line 1731
    .line 1732
    sub-float v10, v10, v18

    .line 1733
    .line 1734
    div-float/2addr v10, v12

    .line 1735
    iget-object v11, v0, Lc1/d;->g:Lc1/a;

    .line 1736
    .line 1737
    invoke-interface {v11}, Lc1/a;->a()J

    .line 1738
    .line 1739
    .line 1740
    move-result-wide v13

    .line 1741
    shr-long v13, v13, p1

    .line 1742
    .line 1743
    long-to-int v11, v13

    .line 1744
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1745
    .line 1746
    .line 1747
    move-result v11

    .line 1748
    mul-float/2addr v11, v10

    .line 1749
    add-float v11, v11, v19

    .line 1750
    .line 1751
    const v10, 0x40a33333    # 5.1f

    .line 1752
    .line 1753
    .line 1754
    sub-float v10, v10, v18

    .line 1755
    .line 1756
    div-float/2addr v10, v12

    .line 1757
    iget-object v12, v0, Lc1/d;->g:Lc1/a;

    .line 1758
    .line 1759
    invoke-interface {v12}, Lc1/a;->a()J

    .line 1760
    .line 1761
    .line 1762
    move-result-wide v12

    .line 1763
    and-long v12, v12, v23

    .line 1764
    .line 1765
    long-to-int v12, v12

    .line 1766
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1767
    .line 1768
    .line 1769
    move-result v12

    .line 1770
    mul-float/2addr v12, v10

    .line 1771
    add-float v12, v12, v20

    .line 1772
    .line 1773
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1774
    .line 1775
    .line 1776
    move-result v10

    .line 1777
    int-to-long v10, v10

    .line 1778
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1779
    .line 1780
    .line 1781
    move-result v12

    .line 1782
    int-to-long v12, v12

    .line 1783
    shl-long v10, v10, p1

    .line 1784
    .line 1785
    and-long v12, v12, v23

    .line 1786
    .line 1787
    or-long v17, v10, v12

    .line 1788
    .line 1789
    new-instance v10, Lsh/l;

    .line 1790
    .line 1791
    move-wide v13, v2

    .line 1792
    move-object v12, v10

    .line 1793
    invoke-direct/range {v12 .. v21}, Lsh/l;-><init>(JJJFFF)V

    .line 1794
    .line 1795
    .line 1796
    new-instance v11, Lh1/g;

    .line 1797
    .line 1798
    const/high16 v14, 0x41200000    # 10.0f

    .line 1799
    .line 1800
    const/16 v17, 0x10

    .line 1801
    .line 1802
    const/4 v15, 0x1

    .line 1803
    const/16 v16, 0x1

    .line 1804
    .line 1805
    move-object v12, v11

    .line 1806
    move/from16 v13, v21

    .line 1807
    .line 1808
    invoke-direct/range {v12 .. v17}, Lh1/g;-><init>(FFIII)V

    .line 1809
    .line 1810
    .line 1811
    new-instance v2, Li0/w1;

    .line 1812
    .line 1813
    const/4 v12, 0x1

    .line 1814
    move-object/from16 v3, v22

    .line 1815
    .line 1816
    invoke-direct/range {v2 .. v12}, Li0/w1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1817
    .line 1818
    .line 1819
    new-instance v3, Lb1/f;

    .line 1820
    .line 1821
    const/4 v4, 0x1

    .line 1822
    invoke-direct {v3, v2, v4}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 1823
    .line 1824
    .line 1825
    invoke-virtual {v0, v3}, Lc1/d;->e(Lfg/l;)Landroidx/lifecycle/x;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v0

    .line 1829
    return-object v0

    .line 1830
    :pswitch_9
    iget-object v0, v1, Leb/m;->h:Ljava/lang/Object;

    .line 1831
    .line 1832
    move-object v2, v0

    .line 1833
    check-cast v2, Ljava/lang/String;

    .line 1834
    .line 1835
    iget-object v0, v1, Leb/m;->i:Ljava/lang/Object;

    .line 1836
    .line 1837
    move-object v3, v0

    .line 1838
    check-cast v3, Ljava/lang/String;

    .line 1839
    .line 1840
    iget-object v0, v1, Leb/m;->m:Ljava/lang/Object;

    .line 1841
    .line 1842
    move-object v4, v0

    .line 1843
    check-cast v4, Ljava/util/ArrayList;

    .line 1844
    .line 1845
    iget-object v0, v1, Leb/m;->n:Ljava/lang/Object;

    .line 1846
    .line 1847
    move-object v5, v0

    .line 1848
    check-cast v5, Ljava/util/Set;

    .line 1849
    .line 1850
    iget-object v0, v1, Leb/m;->j:Ljava/lang/Object;

    .line 1851
    .line 1852
    move-object v6, v0

    .line 1853
    check-cast v6, Ljava/lang/String;

    .line 1854
    .line 1855
    iget-object v0, v1, Leb/m;->k:Ljava/lang/Object;

    .line 1856
    .line 1857
    move-object v7, v0

    .line 1858
    check-cast v7, Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 1859
    .line 1860
    iget-object v0, v1, Leb/m;->l:Ljava/lang/Object;

    .line 1861
    .line 1862
    move-object v8, v0

    .line 1863
    check-cast v8, Ljava/util/function/Consumer;

    .line 1864
    .line 1865
    move-object/from16 v9, p1

    .line 1866
    .line 1867
    check-cast v9, Landroid/app/Activity;

    .line 1868
    .line 1869
    invoke-static/range {v2 .. v9}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->e(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Landroid/app/Activity;)Lsf/n;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v0

    .line 1873
    return-object v0

    .line 1874
    :pswitch_a
    iget-object v0, v1, Leb/m;->h:Ljava/lang/Object;

    .line 1875
    .line 1876
    move-object v2, v0

    .line 1877
    check-cast v2, Ljava/lang/String;

    .line 1878
    .line 1879
    iget-object v0, v1, Leb/m;->i:Ljava/lang/Object;

    .line 1880
    .line 1881
    move-object v3, v0

    .line 1882
    check-cast v3, Ljava/lang/String;

    .line 1883
    .line 1884
    iget-object v0, v1, Leb/m;->j:Ljava/lang/Object;

    .line 1885
    .line 1886
    move-object v4, v0

    .line 1887
    check-cast v4, Ljava/lang/String;

    .line 1888
    .line 1889
    iget-object v0, v1, Leb/m;->m:Ljava/lang/Object;

    .line 1890
    .line 1891
    move-object v5, v0

    .line 1892
    check-cast v5, Ljava/lang/String;

    .line 1893
    .line 1894
    iget-object v0, v1, Leb/m;->n:Ljava/lang/Object;

    .line 1895
    .line 1896
    move-object v6, v0

    .line 1897
    check-cast v6, Ljava/lang/String;

    .line 1898
    .line 1899
    iget-object v0, v1, Leb/m;->k:Ljava/lang/Object;

    .line 1900
    .line 1901
    move-object v7, v0

    .line 1902
    check-cast v7, Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 1903
    .line 1904
    iget-object v0, v1, Leb/m;->l:Ljava/lang/Object;

    .line 1905
    .line 1906
    move-object v8, v0

    .line 1907
    check-cast v8, Ljava/util/function/Consumer;

    .line 1908
    .line 1909
    move-object/from16 v9, p1

    .line 1910
    .line 1911
    check-cast v9, Landroid/app/Activity;

    .line 1912
    .line 1913
    invoke-static/range {v2 .. v9}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Landroid/app/Activity;)Lsf/n;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v0

    .line 1917
    return-object v0

    .line 1918
    nop

    .line 1919
    :pswitch_data_0
    .packed-switch 0x0
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
