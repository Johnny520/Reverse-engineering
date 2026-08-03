.class public final synthetic Lt/f;
.super Lgg/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Li0/a1;Li0/a1;)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lt/f;->n:I

    .line 3
    .line 4
    iput-object p1, p0, Lt/f;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lt/f;->p:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lt/f;->q:Ljava/lang/Object;

    .line 9
    .line 10
    const-class p1, Lgg/k;

    .line 11
    .line 12
    invoke-static {p1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v4, "SelectedMessagesMiuixPage$startSend(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V"

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v1, 0x0

    .line 20
    const-string v3, "startSend"

    .line 21
    .line 22
    move-object v0, p0

    .line 23
    invoke-direct/range {v0 .. v5}, Lgg/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Lt/h;Lx1/i1;Lc1/b;)V
    .locals 7

    const/4 v0, 0x0

    iput v0, p0, Lt/f;->n:I

    .line 27
    iput-object p1, p0, Lt/f;->o:Ljava/lang/Object;

    iput-object p2, p0, Lt/f;->p:Ljava/lang/Object;

    iput-object p3, p0, Lt/f;->q:Ljava/lang/Object;

    const-string v5, "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;"

    const/4 v6, 0x0

    const/4 v2, 0x0

    const-class v3, Lgg/k;

    const-string v4, "localRect"

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lgg/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lt/f;->n:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lt/f;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/content/Context;

    .line 11
    .line 12
    iget-object v2, v0, Lt/f;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Li0/a1;

    .line 15
    .line 16
    iget-object v3, v0, Lt/f;->q:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Li0/a1;

    .line 19
    .line 20
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Ldb/c;

    .line 35
    .line 36
    invoke-static {v5}, Lwb/ho;->T6(Ldb/c;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-static {v4, v5}, La/a;->a1(ILjava/util/List;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-string v5, "\u8bf7\u9009\u62e9\u7fa4\u53d1\u5bf9\u8c61"

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Ldb/c;

    .line 55
    .line 56
    iget-object v4, v4, Ldb/c;->f:Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    move-object v4, v5

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move-object v4, v6

    .line 67
    :goto_0
    const/4 v7, 0x0

    .line 68
    if-eqz v4, :cond_2

    .line 69
    .line 70
    invoke-static {v1, v4, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_a

    .line 78
    .line 79
    :cond_2
    instance-of v4, v1, Landroid/app/Activity;

    .line 80
    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    move-object v4, v1

    .line 84
    check-cast v4, Landroid/app/Activity;

    .line 85
    .line 86
    move-object v12, v4

    .line 87
    goto :goto_1

    .line 88
    :cond_3
    move-object v12, v6

    .line 89
    :goto_1
    if-nez v12, :cond_4

    .line 90
    .line 91
    const-string v2, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u542f\u52a8\u7fa4\u53d1"

    .line 92
    .line 93
    invoke-static {v1, v2, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_a

    .line 101
    .line 102
    :cond_4
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Ljava/lang/Number;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Ldb/c;

    .line 117
    .line 118
    invoke-static {v2}, Lwb/ho;->T6(Ldb/c;)Ljava/util/ArrayList;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    check-cast v4, Ldb/c;

    .line 127
    .line 128
    iget-object v4, v4, Ldb/c;->f:Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    check-cast v8, Ldb/c;

    .line 135
    .line 136
    iget v14, v8, Ldb/c;->j:I

    .line 137
    .line 138
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    check-cast v3, Ldb/c;

    .line 143
    .line 144
    iget v3, v3, Ldb/c;->k:I

    .line 145
    .line 146
    invoke-static {v2}, La/a;->E0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    new-instance v8, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-static {v4}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    if-eqz v9, :cond_5

    .line 168
    .line 169
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    check-cast v9, Ljava/lang/String;

    .line 174
    .line 175
    invoke-static {v9, v8}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_5
    new-instance v4, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    :cond_6
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v9

    .line 192
    if-eqz v9, :cond_7

    .line 193
    .line 194
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    move-object v10, v9

    .line 199
    check-cast v10, Ljava/lang/String;

    .line 200
    .line 201
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    if-nez v10, :cond_6

    .line 206
    .line 207
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_7
    invoke-static {v4}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-static {v4}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v15

    .line 219
    invoke-static {v1, v2}, La/a;->a1(ILjava/util/List;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    if-eqz v4, :cond_8

    .line 224
    .line 225
    new-instance v1, Landroid/os/Handler;

    .line 226
    .line 227
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 232
    .line 233
    .line 234
    new-instance v2, Lc9/t;

    .line 235
    .line 236
    const/4 v3, 0x7

    .line 237
    invoke-direct {v2, v12, v4, v3}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 241
    .line 242
    .line 243
    goto/16 :goto_a

    .line 244
    .line 245
    :cond_8
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-eqz v4, :cond_9

    .line 250
    .line 251
    invoke-static {v12, v5}, La/a;->S0(Landroid/app/Activity;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_a

    .line 255
    .line 256
    :cond_9
    sget-object v4, La/a;->g:Lhb/k0;

    .line 257
    .line 258
    if-eqz v4, :cond_13

    .line 259
    .line 260
    new-instance v5, Lgg/u;

    .line 261
    .line 262
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 263
    .line 264
    .line 265
    const/4 v8, 0x1

    .line 266
    if-ne v1, v8, :cond_a

    .line 267
    .line 268
    move v13, v8

    .line 269
    goto :goto_4

    .line 270
    :cond_a
    move v13, v7

    .line 271
    :goto_4
    new-instance v10, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 272
    .line 273
    invoke-direct {v10, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 274
    .line 275
    .line 276
    const-string v1, "Hchat_selected_messages_config"

    .line 277
    .line 278
    invoke-static {v12, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    const-string v9, "selected_messages_background_silent_send"

    .line 283
    .line 284
    invoke-interface {v1, v9, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-eqz v1, :cond_b

    .line 289
    .line 290
    move-object v11, v6

    .line 291
    goto :goto_6

    .line 292
    :cond_b
    new-instance v1, Lca/p;

    .line 293
    .line 294
    const/4 v7, 0x4

    .line 295
    invoke-direct {v1, v10, v5, v7}, Lca/p;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lgg/u;I)V

    .line 296
    .line 297
    .line 298
    if-eqz v13, :cond_c

    .line 299
    .line 300
    const-string v7, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b"

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_c
    const-string v7, "\u6a21\u5757\u7fa4\u53d1"

    .line 304
    .line 305
    :goto_5
    const-string v9, "\u6b63\u5728\u53d1\u9001..."

    .line 306
    .line 307
    invoke-static {v12, v1, v7, v9}, Lwb/y2;->X1(Landroid/app/Activity;Lfg/a;Ljava/lang/String;Ljava/lang/String;)Lwb/kv;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    move-object v11, v1

    .line 312
    :goto_6
    new-instance v18, Lhb/j0;

    .line 313
    .line 314
    const/4 v9, 0x0

    .line 315
    move v1, v8

    .line 316
    move-object/from16 v8, v18

    .line 317
    .line 318
    invoke-direct/range {v8 .. v13}, Lhb/j0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 319
    .line 320
    .line 321
    move v7, v13

    .line 322
    if-eqz v7, :cond_d

    .line 323
    .line 324
    iget-object v3, v4, Lhb/k0;->c:Lhb/k;

    .line 325
    .line 326
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    invoke-static {v2}, Lhb/k;->c(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    if-eqz v2, :cond_e

    .line 334
    .line 335
    invoke-virtual {v3, v2, v15, v8}, Lhb/k;->f(Ljava/util/List;Ljava/util/List;Lfg/q;)Lhb/s;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    goto :goto_7

    .line 340
    :cond_d
    iget-object v13, v4, Lhb/k0;->a:Lhb/c;

    .line 341
    .line 342
    move/from16 v17, v3

    .line 343
    .line 344
    move-object/from16 v18, v8

    .line 345
    .line 346
    move/from16 v16, v14

    .line 347
    .line 348
    move-object v14, v2

    .line 349
    invoke-virtual/range {v13 .. v18}, Lhb/c;->h(Ljava/util/ArrayList;Ljava/util/List;IILfg/q;)Lhb/s;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    :cond_e
    :goto_7
    iput-object v6, v5, Lgg/u;->g:Ljava/lang/Object;

    .line 354
    .line 355
    if-nez v6, :cond_11

    .line 356
    .line 357
    invoke-virtual {v10, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 358
    .line 359
    .line 360
    if-eqz v11, :cond_f

    .line 361
    .line 362
    invoke-interface {v11}, Lwb/kv;->close()V

    .line 363
    .line 364
    .line 365
    :cond_f
    if-eqz v7, :cond_10

    .line 366
    .line 367
    const-string v1, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u542f\u52a8\u5931\u8d25"

    .line 368
    .line 369
    goto :goto_8

    .line 370
    :cond_10
    const-string v1, "\u6a21\u5757\u7fa4\u53d1\u542f\u52a8\u5931\u8d25"

    .line 371
    .line 372
    :goto_8
    invoke-static {v12, v1}, La/a;->S0(Landroid/app/Activity;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    goto :goto_a

    .line 376
    :cond_11
    if-eqz v7, :cond_12

    .line 377
    .line 378
    const-string v1, "\u5df2\u5f00\u59cb\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1"

    .line 379
    .line 380
    goto :goto_9

    .line 381
    :cond_12
    const-string v1, "\u5df2\u5f00\u59cb\u6a21\u5757\u7fa4\u53d1"

    .line 382
    .line 383
    :goto_9
    invoke-static {v12, v1}, La/a;->S0(Landroid/app/Activity;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    :cond_13
    :goto_a
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 387
    .line 388
    return-object v1

    .line 389
    :pswitch_0
    iget-object v1, v0, Lt/f;->o:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v1, Lt/h;

    .line 392
    .line 393
    iget-object v2, v0, Lt/f;->p:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v2, Lx1/i1;

    .line 396
    .line 397
    iget-object v3, v0, Lt/f;->q:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v3, Lc1/b;

    .line 400
    .line 401
    invoke-static {v1, v2, v3}, Lt/h;->k1(Lt/h;Lx1/i1;Lc1/b;)Le1/c;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    return-object v1

    .line 406
    nop

    .line 407
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
