.class public final synthetic Lr8/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 14
    iput p4, p0, Lr8/b;->g:I

    iput-object p1, p0, Lr8/b;->i:Ljava/lang/Object;

    iput-object p2, p0, Lr8/b;->h:Ljava/lang/Object;

    iput-object p3, p0, Lr8/b;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr9/d0;Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lr8/b;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lr8/b;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lr8/b;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lr8/b;->h:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lr8/b;->g:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v1, Lr8/b;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lxa/m;

    .line 14
    .line 15
    iget-object v2, v1, Lr8/b;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Landroid/app/Activity;

    .line 18
    .line 19
    iget-object v4, v1, Lr8/b;->j:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Lxa/h;

    .line 22
    .line 23
    new-instance v5, Lxa/i;

    .line 24
    .line 25
    iget-object v4, v4, Lxa/h;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct {v5, v2, v4, v3}, Lxa/i;-><init>(Landroid/app/Activity;Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v5}, Lxa/m;->i(Lxa/i;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    iget-object v0, v1, Lr8/b;->i:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Landroid/content/Context;

    .line 37
    .line 38
    iget-object v2, v1, Lr8/b;->h:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Lx8/r;

    .line 41
    .line 42
    iget-object v3, v1, Lr8/b;->j:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Lk8/o;

    .line 45
    .line 46
    sget-object v4, Lx8/q;->a:Ljava/util/concurrent/ExecutorService;

    .line 47
    .line 48
    :try_start_0
    invoke-static {v0, v2, v3}, Lx8/q;->p(Landroid/content/Context;Lx8/r;Lk8/o;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v2, v3}, Lx8/q;->o(Landroid/content/Context;Lx8/r;Lk8/o;)V

    .line 52
    .line 53
    .line 54
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    new-instance v2, Lsf/f;

    .line 59
    .line 60
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    move-object v0, v2

    .line 64
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-eqz v0, :cond_0

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const-string v3, "[Hchat:AutoReply] \u5904\u7406\u6d88\u606f\u5931\u8d25: "

    .line 75
    .line 76
    invoke-static {v3, v2, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    :cond_0
    return-void

    .line 80
    :pswitch_1
    iget-object v0, v1, Lr8/b;->i:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 83
    .line 84
    iget-object v3, v1, Lr8/b;->h:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 87
    .line 88
    iget-object v4, v1, Lr8/b;->j:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v4, Lgg/u;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_2

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Lx8/n;

    .line 103
    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    iget-object v3, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 107
    .line 108
    if-eqz v3, :cond_1

    .line 109
    .line 110
    check-cast v3, Lx8/m;

    .line 111
    .line 112
    invoke-virtual {v0, v3}, Lx8/n;->b(Lx8/m;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    const-string v0, "socketRequest"

    .line 117
    .line 118
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v2

    .line 122
    :cond_2
    :goto_1
    return-void

    .line 123
    :pswitch_2
    iget-object v0, v1, Lr8/b;->i:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, Ljava/io/Serializable;

    .line 126
    .line 127
    iget-object v2, v1, Lr8/b;->h:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v2, Li0/a1;

    .line 130
    .line 131
    iget-object v5, v1, Lr8/b;->j:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v5, Landroid/content/Context;

    .line 134
    .line 135
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-interface {v2, v6}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    instance-of v2, v0, Lsf/f;

    .line 141
    .line 142
    if-nez v2, :cond_3

    .line 143
    .line 144
    move-object v2, v0

    .line 145
    check-cast v2, Ljava/lang/String;

    .line 146
    .line 147
    const-string v2, "\u8fde\u63a5\u6210\u529f"

    .line 148
    .line 149
    invoke-static {v5, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 154
    .line 155
    .line 156
    :cond_3
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-eqz v0, :cond_5

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-eqz v0, :cond_4

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_4
    const-string v0, "\u8fde\u63a5\u5931\u8d25"

    .line 170
    .line 171
    :goto_2
    invoke-static {v5, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 176
    .line 177
    .line 178
    :cond_5
    return-void

    .line 179
    :pswitch_3
    iget-object v0, v1, Lr8/b;->i:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Ljava/util/ArrayList;

    .line 182
    .line 183
    iget-object v2, v1, Lr8/b;->h:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v2, Landroid/content/Context;

    .line 186
    .line 187
    iget-object v4, v1, Lr8/b;->j:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v4, Li0/a1;

    .line 190
    .line 191
    :try_start_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    if-eqz v5, :cond_6

    .line 200
    .line 201
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    check-cast v5, Lfb/d1;

    .line 206
    .line 207
    sget-object v6, Lfb/g1;->a:Lfb/g1;

    .line 208
    .line 209
    invoke-static {v2, v5}, Lfb/g1;->n(Landroid/content/Context;Lfb/d1;)V

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :catchall_1
    move-exception v0

    .line 214
    goto :goto_4

    .line 215
    :cond_6
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :goto_4
    new-instance v2, Lsf/f;

    .line 219
    .line 220
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    move-object v0, v2

    .line 224
    :goto_5
    nop

    .line 225
    instance-of v2, v0, Lsf/f;

    .line 226
    .line 227
    if-nez v2, :cond_7

    .line 228
    .line 229
    move-object v2, v0

    .line 230
    check-cast v2, Lsf/n;

    .line 231
    .line 232
    new-instance v2, Landroid/os/Handler;

    .line 233
    .line 234
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-direct {v2, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 239
    .line 240
    .line 241
    new-instance v5, Lwb/uk;

    .line 242
    .line 243
    invoke-direct {v5, v4, v3}, Lwb/uk;-><init>(Li0/a1;I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 247
    .line 248
    .line 249
    :cond_7
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    if-eqz v0, :cond_8

    .line 254
    .line 255
    const-string v2, "[Hchat:ScriptAgent] \u4fdd\u5b58\u5386\u53f2\u4f1a\u8bdd\u6392\u5e8f\u5931\u8d25"

    .line 256
    .line 257
    invoke-static {v2, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 258
    .line 259
    .line 260
    :cond_8
    return-void

    .line 261
    :pswitch_4
    iget-object v0, v1, Lr8/b;->i:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v0, Lfb/v;

    .line 264
    .line 265
    iget-object v5, v1, Lr8/b;->h:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v5, Li0/a1;

    .line 268
    .line 269
    iget-object v6, v1, Lr8/b;->j:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v6, Landroid/content/Context;

    .line 272
    .line 273
    sget-object v7, Lfb/u;->a:Ljava/util/Set;

    .line 274
    .line 275
    iget-object v7, v0, Lfb/v;->d:Ljava/lang/String;

    .line 276
    .line 277
    :try_start_2
    iget-object v8, v0, Lfb/v;->a:Ljava/lang/String;

    .line 278
    .line 279
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 280
    .line 281
    .line 282
    move-result v8

    .line 283
    if-nez v8, :cond_a

    .line 284
    .line 285
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 286
    .line 287
    .line 288
    move-result v8

    .line 289
    if-nez v8, :cond_9

    .line 290
    .line 291
    new-instance v8, Lorg/json/JSONObject;

    .line 292
    .line 293
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 294
    .line 295
    .line 296
    const-string v9, "model"

    .line 297
    .line 298
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    invoke-virtual {v8, v9, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 307
    .line 308
    .line 309
    const-string v7, "stream"

    .line 310
    .line 311
    invoke-virtual {v8, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 312
    .line 313
    .line 314
    const-string v7, "messages"

    .line 315
    .line 316
    new-instance v9, Lorg/json/JSONArray;

    .line 317
    .line 318
    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    .line 319
    .line 320
    .line 321
    new-instance v10, Lorg/json/JSONObject;

    .line 322
    .line 323
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 324
    .line 325
    .line 326
    const-string v11, "role"

    .line 327
    .line 328
    const-string v12, "user"

    .line 329
    .line 330
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 331
    .line 332
    .line 333
    const-string v11, "content"

    .line 334
    .line 335
    const-string v12, "\u53ea\u56de\u590d OK"

    .line 336
    .line 337
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v9, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v8, v7, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 344
    .line 345
    .line 346
    invoke-static {v0}, Lfb/u;->i0(Lfb/v;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    sget-object v9, Lfb/u;->b:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 351
    .line 352
    invoke-virtual {v9, v7}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 356
    xor-int/2addr v3, v10

    .line 357
    :try_start_3
    invoke-static {v0, v8, v2, v3}, Lfb/u;->w(Lfb/v;Lorg/json/JSONObject;Lfb/b;Z)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v2
    :try_end_3
    .catch Lfb/n; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 361
    goto :goto_6

    .line 362
    :catch_0
    :try_start_4
    invoke-static {v0, v8, v2, v4}, Lfb/u;->w(Lfb/v;Lorg/json/JSONObject;Lfb/b;Z)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-interface {v9, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    :goto_6
    invoke-static {v0, v2}, Lfb/u;->x(Lfb/v;Ljava/lang/String;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    if-eqz v2, :cond_b

    .line 378
    .line 379
    const-string v0, "\u8fde\u63a5\u6210\u529f"

    .line 380
    .line 381
    goto :goto_8

    .line 382
    :catchall_2
    move-exception v0

    .line 383
    goto :goto_7

    .line 384
    :cond_9
    const-string v0, "\u8bf7\u586b\u5199\u6a21\u578b"

    .line 385
    .line 386
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 387
    .line 388
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    throw v2

    .line 392
    :cond_a
    const-string v0, "\u8bf7\u586b\u5199 API \u5730\u5740"

    .line 393
    .line 394
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 395
    .line 396
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 400
    :goto_7
    new-instance v2, Lsf/f;

    .line 401
    .line 402
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 403
    .line 404
    .line 405
    move-object v0, v2

    .line 406
    :cond_b
    :goto_8
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    if-eqz v2, :cond_c

    .line 411
    .line 412
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    const-string v4, "[Hchat:ScriptAgent] \u6d4b\u8bd5\u8fde\u63a5\u5931\u8d25: "

    .line 417
    .line 418
    invoke-static {v4, v3, v2}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 419
    .line 420
    .line 421
    :cond_c
    new-instance v2, Landroid/os/Handler;

    .line 422
    .line 423
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 428
    .line 429
    .line 430
    new-instance v3, Lr8/b;

    .line 431
    .line 432
    const/16 v4, 0x9

    .line 433
    .line 434
    invoke-direct {v3, v0, v5, v6, v4}, Lr8/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 438
    .line 439
    .line 440
    return-void

    .line 441
    :pswitch_5
    iget-object v0, v1, Lr8/b;->i:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v0, Lwb/au;

    .line 444
    .line 445
    iget-object v3, v1, Lr8/b;->h:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v3, Li0/a1;

    .line 448
    .line 449
    iget-object v5, v1, Lr8/b;->j:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v5, Li0/a1;

    .line 452
    .line 453
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    check-cast v6, Lwb/au;

    .line 458
    .line 459
    if-ne v6, v0, :cond_d

    .line 460
    .line 461
    invoke-interface {v3, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    invoke-static {v5, v4}, Lwb/y2;->S0(Li0/a1;Z)V

    .line 465
    .line 466
    .line 467
    :cond_d
    return-void

    .line 468
    :pswitch_6
    iget-object v0, v1, Lr8/b;->i:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v0, Lwb/la;

    .line 471
    .line 472
    iget-object v3, v1, Lr8/b;->h:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v3, Ljava/util/List;

    .line 475
    .line 476
    iget-object v4, v1, Lr8/b;->j:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v4, Ljava/util/List;

    .line 479
    .line 480
    new-instance v5, Lwb/j5;

    .line 481
    .line 482
    invoke-direct {v5, v3, v4}, Lwb/j5;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0, v5, v2}, Lwb/la;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    return-void

    .line 489
    :pswitch_7
    sget-object v5, Lwb/l5;->i:Lwb/l5;

    .line 490
    .line 491
    sget-object v6, Lwb/l5;->h:Lwb/l5;

    .line 492
    .line 493
    sget-object v7, Lwb/l5;->g:Lwb/l5;

    .line 494
    .line 495
    iget-object v0, v1, Lr8/b;->i:Ljava/lang/Object;

    .line 496
    .line 497
    move-object v8, v0

    .line 498
    check-cast v8, Lg8/i;

    .line 499
    .line 500
    iget-object v0, v1, Lr8/b;->h:Ljava/lang/Object;

    .line 501
    .line 502
    move-object v9, v0

    .line 503
    check-cast v9, Landroid/os/Handler;

    .line 504
    .line 505
    iget-object v0, v1, Lr8/b;->j:Ljava/lang/Object;

    .line 506
    .line 507
    move-object v10, v0

    .line 508
    check-cast v10, Lwb/la;

    .line 509
    .line 510
    sget-object v11, Ltf/t;->g:Ltf/t;

    .line 511
    .line 512
    :try_start_5
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 513
    .line 514
    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 515
    .line 516
    .line 517
    :try_start_6
    invoke-virtual {v8}, Lg8/i;->p()Ljava/util/ArrayList;

    .line 518
    .line 519
    .line 520
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 521
    goto :goto_9

    .line 522
    :catchall_3
    move-exception v0

    .line 523
    :try_start_7
    new-instance v13, Lsf/f;

    .line 524
    .line 525
    invoke-direct {v13, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 526
    .line 527
    .line 528
    move-object v0, v13

    .line 529
    :goto_9
    nop

    .line 530
    instance-of v13, v0, Lsf/f;

    .line 531
    .line 532
    if-eqz v13, :cond_e

    .line 533
    .line 534
    move-object v0, v11

    .line 535
    :cond_e
    check-cast v0, Ljava/lang/Iterable;

    .line 536
    .line 537
    new-instance v13, Ljava/util/ArrayList;

    .line 538
    .line 539
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 540
    .line 541
    .line 542
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 543
    .line 544
    .line 545
    move-result-object v14

    .line 546
    :goto_a
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    if-eqz v0, :cond_1b

    .line 551
    .line 552
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    check-cast v0, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 557
    .line 558
    iget-object v15, v0, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 559
    .line 560
    invoke-static {v15}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 561
    .line 562
    .line 563
    move-result-object v15

    .line 564
    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v15

    .line 568
    iget-object v2, v0, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 569
    .line 570
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 579
    .line 580
    .line 581
    move-result v16

    .line 582
    if-eqz v16, :cond_f

    .line 583
    .line 584
    move-object v2, v15

    .line 585
    :cond_f
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 586
    .line 587
    .line 588
    move-result v16

    .line 589
    if-eqz v16, :cond_10

    .line 590
    .line 591
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 592
    .line 593
    .line 594
    move-result v16

    .line 595
    if-eqz v16, :cond_10

    .line 596
    .line 597
    const/4 v3, 0x0

    .line 598
    goto/16 :goto_11

    .line 599
    .line 600
    :catchall_4
    move-exception v0

    .line 601
    goto/16 :goto_19

    .line 602
    .line 603
    :cond_10
    iget-object v0, v0, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 604
    .line 605
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 606
    .line 607
    .line 608
    move-result v16

    .line 609
    if-eqz v16, :cond_13

    .line 610
    .line 611
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 612
    .line 613
    .line 614
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 615
    if-eqz v0, :cond_11

    .line 616
    .line 617
    move-object v0, v11

    .line 618
    goto :goto_c

    .line 619
    :cond_11
    :try_start_8
    invoke-virtual {v8, v15}, Lg8/i;->o(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 620
    .line 621
    .line 622
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 623
    goto :goto_b

    .line 624
    :catchall_5
    move-exception v0

    .line 625
    :try_start_9
    new-instance v3, Lsf/f;

    .line 626
    .line 627
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 628
    .line 629
    .line 630
    move-object v0, v3

    .line 631
    :goto_b
    nop

    .line 632
    instance-of v3, v0, Lsf/f;

    .line 633
    .line 634
    if-eqz v3, :cond_12

    .line 635
    .line 636
    move-object v0, v11

    .line 637
    :cond_12
    check-cast v0, Ljava/util/List;

    .line 638
    .line 639
    :cond_13
    :goto_c
    new-instance v3, Ljava/util/ArrayList;

    .line 640
    .line 641
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 642
    .line 643
    .line 644
    move-result v4

    .line 645
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 646
    .line 647
    .line 648
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 653
    .line 654
    .line 655
    move-result v4

    .line 656
    if-eqz v4, :cond_14

    .line 657
    .line 658
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v4

    .line 662
    check-cast v4, Ljava/lang/String;

    .line 663
    .line 664
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 665
    .line 666
    .line 667
    move-result-object v4

    .line 668
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v4

    .line 672
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    goto :goto_d

    .line 676
    :cond_14
    new-instance v0, Ljava/util/ArrayList;

    .line 677
    .line 678
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 682
    .line 683
    .line 684
    move-result-object v3

    .line 685
    :cond_15
    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 686
    .line 687
    .line 688
    move-result v4

    .line 689
    if-eqz v4, :cond_16

    .line 690
    .line 691
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v4

    .line 695
    move-object/from16 v18, v4

    .line 696
    .line 697
    check-cast v18, Ljava/lang/String;

    .line 698
    .line 699
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 700
    .line 701
    .line 702
    move-result v18

    .line 703
    if-lez v18, :cond_15

    .line 704
    .line 705
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 706
    .line 707
    .line 708
    goto :goto_e

    .line 709
    :cond_16
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 718
    .line 719
    .line 720
    move-result-object v3

    .line 721
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 722
    .line 723
    .line 724
    move-result v4

    .line 725
    if-eqz v4, :cond_18

    .line 726
    .line 727
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v4

    .line 731
    check-cast v4, Ljava/lang/String;

    .line 732
    .line 733
    invoke-virtual {v12, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v18

    .line 737
    if-nez v18, :cond_17

    .line 738
    .line 739
    move-object/from16 v19, v3

    .line 740
    .line 741
    new-instance v3, Ljava/util/ArrayList;

    .line 742
    .line 743
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 744
    .line 745
    .line 746
    invoke-interface {v12, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-object/from16 v18, v3

    .line 750
    .line 751
    goto :goto_10

    .line 752
    :cond_17
    move-object/from16 v19, v3

    .line 753
    .line 754
    :goto_10
    move-object/from16 v3, v18

    .line 755
    .line 756
    check-cast v3, Ljava/util/List;

    .line 757
    .line 758
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 759
    .line 760
    .line 761
    move-object/from16 v3, v19

    .line 762
    .line 763
    goto :goto_f

    .line 764
    :cond_18
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 765
    .line 766
    .line 767
    move-result v3

    .line 768
    if-eqz v3, :cond_19

    .line 769
    .line 770
    move-object v15, v2

    .line 771
    :cond_19
    new-instance v3, Lwb/t5;

    .line 772
    .line 773
    invoke-direct {v3, v15, v2, v0}, Lwb/t5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 774
    .line 775
    .line 776
    :goto_11
    if-eqz v3, :cond_1a

    .line 777
    .line 778
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 779
    .line 780
    .line 781
    :cond_1a
    const/4 v2, 0x0

    .line 782
    const/4 v3, 0x1

    .line 783
    const/4 v4, 0x0

    .line 784
    goto/16 :goto_a

    .line 785
    .line 786
    :cond_1b
    new-instance v0, Lwb/e2;

    .line 787
    .line 788
    const/16 v2, 0x8

    .line 789
    .line 790
    invoke-direct {v0, v2}, Lwb/e2;-><init>(I)V

    .line 791
    .line 792
    .line 793
    invoke-static {v13, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 798
    .line 799
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v8}, Lg8/i;->y()Ljava/util/ArrayList;

    .line 803
    .line 804
    .line 805
    move-result-object v4

    .line 806
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 807
    .line 808
    .line 809
    move-result-object v4

    .line 810
    :goto_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 811
    .line 812
    .line 813
    move-result v11

    .line 814
    if-eqz v11, :cond_1c

    .line 815
    .line 816
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v11

    .line 820
    check-cast v11, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 821
    .line 822
    const/4 v13, 0x0

    .line 823
    invoke-static {v3, v12, v11, v7, v13}, Lwb/ho;->f6(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Lh/Hchat/hooks/api/model/WeChatContact;Lwb/l5;Z)V

    .line 824
    .line 825
    .line 826
    goto :goto_12

    .line 827
    :cond_1c
    invoke-virtual {v8}, Lg8/i;->x()Ljava/util/ArrayList;

    .line 828
    .line 829
    .line 830
    move-result-object v4

    .line 831
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 832
    .line 833
    .line 834
    move-result-object v4

    .line 835
    :goto_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 836
    .line 837
    .line 838
    move-result v11

    .line 839
    if-eqz v11, :cond_1d

    .line 840
    .line 841
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v11

    .line 845
    check-cast v11, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 846
    .line 847
    const/4 v13, 0x1

    .line 848
    invoke-static {v3, v12, v11, v6, v13}, Lwb/ho;->f6(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Lh/Hchat/hooks/api/model/WeChatContact;Lwb/l5;Z)V

    .line 849
    .line 850
    .line 851
    goto :goto_13

    .line 852
    :cond_1d
    const-string v4, "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE \'gh\\_%\' ESCAPE \'\\\' OR (r.verifyFlag IS NOT NULL AND r.verifyFlag!=0)"

    .line 853
    .line 854
    const/4 v11, 0x0

    .line 855
    invoke-virtual {v8, v4, v11}, Lg8/i;->U(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 856
    .line 857
    .line 858
    move-result-object v4

    .line 859
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 860
    .line 861
    .line 862
    move-result-object v4

    .line 863
    :goto_14
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 864
    .line 865
    .line 866
    move-result v11

    .line 867
    if-eqz v11, :cond_1e

    .line 868
    .line 869
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v11

    .line 873
    check-cast v11, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 874
    .line 875
    const/4 v13, 0x0

    .line 876
    invoke-static {v3, v12, v11, v5, v13}, Lwb/ho;->f6(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Lh/Hchat/hooks/api/model/WeChatContact;Lwb/l5;Z)V

    .line 877
    .line 878
    .line 879
    goto :goto_14

    .line 880
    :cond_1e
    new-instance v4, Ljava/util/ArrayList;

    .line 881
    .line 882
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 883
    .line 884
    .line 885
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 886
    .line 887
    .line 888
    move-result-object v11

    .line 889
    :goto_15
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 890
    .line 891
    .line 892
    move-result v13

    .line 893
    if-eqz v13, :cond_1f

    .line 894
    .line 895
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v13

    .line 899
    check-cast v13, Lwb/t5;

    .line 900
    .line 901
    iget-object v13, v13, Lwb/t5;->c:Ljava/util/List;

    .line 902
    .line 903
    invoke-static {v4, v13}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 904
    .line 905
    .line 906
    goto :goto_15

    .line 907
    :cond_1f
    invoke-static {v4}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 908
    .line 909
    .line 910
    move-result-object v4

    .line 911
    invoke-static {v4}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 912
    .line 913
    .line 914
    move-result-object v4

    .line 915
    new-instance v11, Ljava/util/ArrayList;

    .line 916
    .line 917
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 918
    .line 919
    .line 920
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 921
    .line 922
    .line 923
    move-result-object v4

    .line 924
    :cond_20
    :goto_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 925
    .line 926
    .line 927
    move-result v13

    .line 928
    if-eqz v13, :cond_21

    .line 929
    .line 930
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v13

    .line 934
    move-object v14, v13

    .line 935
    check-cast v14, Ljava/lang/String;

    .line 936
    .line 937
    invoke-virtual {v3, v14}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 938
    .line 939
    .line 940
    move-result v14

    .line 941
    if-nez v14, :cond_20

    .line 942
    .line 943
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 944
    .line 945
    .line 946
    goto :goto_16

    .line 947
    :cond_21
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 948
    .line 949
    .line 950
    move-result v4

    .line 951
    if-nez v4, :cond_24

    .line 952
    .line 953
    invoke-virtual {v8, v11}, Lg8/i;->q(Ljava/util/List;)Ljava/util/ArrayList;

    .line 954
    .line 955
    .line 956
    move-result-object v4

    .line 957
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 958
    .line 959
    .line 960
    move-result-object v4

    .line 961
    :goto_17
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 962
    .line 963
    .line 964
    move-result v8

    .line 965
    if-eqz v8, :cond_24

    .line 966
    .line 967
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 968
    .line 969
    .line 970
    move-result-object v8

    .line 971
    check-cast v8, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 972
    .line 973
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatContact;->isGroup()Z

    .line 974
    .line 975
    .line 976
    move-result v11

    .line 977
    if-eqz v11, :cond_22

    .line 978
    .line 979
    move-object v11, v6

    .line 980
    goto :goto_18

    .line 981
    :cond_22
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatContact;->isOfficialAccount()Z

    .line 982
    .line 983
    .line 984
    move-result v11

    .line 985
    if-eqz v11, :cond_23

    .line 986
    .line 987
    move-object v11, v5

    .line 988
    goto :goto_18

    .line 989
    :cond_23
    move-object v11, v7

    .line 990
    :goto_18
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatContact;->isGroup()Z

    .line 991
    .line 992
    .line 993
    move-result v13

    .line 994
    invoke-static {v3, v12, v8, v11, v13}, Lwb/ho;->f6(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Lh/Hchat/hooks/api/model/WeChatContact;Lwb/l5;Z)V

    .line 995
    .line 996
    .line 997
    goto :goto_17

    .line 998
    :cond_24
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 999
    .line 1000
    .line 1001
    move-result-object v3

    .line 1002
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    check-cast v3, Ljava/lang/Iterable;

    .line 1006
    .line 1007
    new-instance v4, Lwb/e2;

    .line 1008
    .line 1009
    const/4 v5, 0x7

    .line 1010
    invoke-direct {v4, v5}, Lwb/e2;-><init>(I)V

    .line 1011
    .line 1012
    .line 1013
    new-instance v5, Lwb/kn;

    .line 1014
    .line 1015
    invoke-direct {v5, v4, v2}, Lwb/kn;-><init>(Ljava/lang/Object;I)V

    .line 1016
    .line 1017
    .line 1018
    invoke-static {v3, v5}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v2

    .line 1022
    new-instance v3, Lr8/b;

    .line 1023
    .line 1024
    const/4 v4, 0x5

    .line 1025
    invoke-direct {v3, v10, v2, v0, v4}, Lr8/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v9, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 1029
    .line 1030
    .line 1031
    goto :goto_1a

    .line 1032
    :goto_19
    new-instance v2, Lrb/g;

    .line 1033
    .line 1034
    const/16 v3, 0xa

    .line 1035
    .line 1036
    invoke-direct {v2, v10, v3, v0}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v9, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1040
    .line 1041
    .line 1042
    :goto_1a
    return-void

    .line 1043
    :pswitch_8
    iget-object v0, v1, Lr8/b;->i:Ljava/lang/Object;

    .line 1044
    .line 1045
    check-cast v0, Lra/c;

    .line 1046
    .line 1047
    iget-object v2, v1, Lr8/b;->h:Ljava/lang/Object;

    .line 1048
    .line 1049
    check-cast v2, Ljava/lang/String;

    .line 1050
    .line 1051
    iget-object v3, v1, Lr8/b;->j:Ljava/lang/Object;

    .line 1052
    .line 1053
    check-cast v3, Ljava/lang/String;

    .line 1054
    .line 1055
    new-instance v4, Lsa/b;

    .line 1056
    .line 1057
    const/4 v13, 0x0

    .line 1058
    invoke-direct {v4, v13, v2, v3}, Lsa/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 1059
    .line 1060
    .line 1061
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1062
    .line 1063
    .line 1064
    move-result v2

    .line 1065
    if-eqz v2, :cond_25

    .line 1066
    .line 1067
    invoke-virtual {v0, v4}, Lra/c;->o(Lsa/b;)V

    .line 1068
    .line 1069
    .line 1070
    goto :goto_1b

    .line 1071
    :cond_25
    iget-boolean v2, v0, Lra/c;->a:Z

    .line 1072
    .line 1073
    if-eqz v2, :cond_26

    .line 1074
    .line 1075
    iget-object v2, v0, Lra/c;->j:Ljava/lang/Object;

    .line 1076
    .line 1077
    check-cast v2, Landroid/speech/tts/TextToSpeech;

    .line 1078
    .line 1079
    if-eqz v2, :cond_26

    .line 1080
    .line 1081
    invoke-virtual {v0, v4}, Lra/c;->v(Lsa/b;)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v2

    .line 1085
    if-nez v2, :cond_27

    .line 1086
    .line 1087
    invoke-virtual {v0, v4}, Lra/c;->s(Lsa/b;)V

    .line 1088
    .line 1089
    .line 1090
    goto :goto_1b

    .line 1091
    :cond_26
    iget-object v2, v0, Lra/c;->g:Ljava/lang/Object;

    .line 1092
    .line 1093
    check-cast v2, Ljava/util/ArrayDeque;

    .line 1094
    .line 1095
    invoke-virtual {v2, v4}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 1096
    .line 1097
    .line 1098
    invoke-virtual {v0}, Lra/c;->f()V

    .line 1099
    .line 1100
    .line 1101
    :cond_27
    :goto_1b
    return-void

    .line 1102
    :pswitch_9
    iget-object v0, v1, Lr8/b;->i:Ljava/lang/Object;

    .line 1103
    .line 1104
    move-object v2, v0

    .line 1105
    check-cast v2, Lr9/d0;

    .line 1106
    .line 1107
    iget-object v0, v1, Lr8/b;->h:Ljava/lang/Object;

    .line 1108
    .line 1109
    check-cast v0, Lr9/y;

    .line 1110
    .line 1111
    iget-object v3, v1, Lr8/b;->j:Ljava/lang/Object;

    .line 1112
    .line 1113
    move-object v5, v3

    .line 1114
    check-cast v5, Landroid/widget/TextView;

    .line 1115
    .line 1116
    iget-object v3, v2, Lr9/d0;->v:Ljava/util/WeakHashMap;

    .line 1117
    .line 1118
    monitor-enter v3

    .line 1119
    :try_start_a
    iget-object v4, v2, Lr9/d0;->v:Ljava/util/WeakHashMap;

    .line 1120
    .line 1121
    invoke-virtual {v4, v5}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v4

    .line 1125
    check-cast v4, Lr9/y;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 1126
    .line 1127
    monitor-exit v3

    .line 1128
    if-eq v4, v0, :cond_28

    .line 1129
    .line 1130
    goto :goto_1c

    .line 1131
    :cond_28
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v3

    .line 1135
    if-eqz v3, :cond_29

    .line 1136
    .line 1137
    invoke-virtual {v5}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v3

    .line 1141
    const-string v4, "hchat_message_details_view"

    .line 1142
    .line 1143
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1144
    .line 1145
    .line 1146
    move-result v3

    .line 1147
    if-eqz v3, :cond_29

    .line 1148
    .line 1149
    iget-object v3, v0, Lr9/y;->d:Ljava/lang/Object;

    .line 1150
    .line 1151
    const/4 v11, 0x0

    .line 1152
    const/4 v13, 0x0

    .line 1153
    invoke-virtual {v2, v3, v11, v13}, Lr9/d0;->X(Ljava/lang/Object;Ljava/lang/Integer;Z)Lr9/f0;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v8

    .line 1157
    iget-object v3, v0, Lr9/y;->a:Landroid/view/View;

    .line 1158
    .line 1159
    iget-object v4, v0, Lr9/y;->b:Landroid/widget/TextView;

    .line 1160
    .line 1161
    iget-object v6, v0, Lr9/y;->c:Ljava/lang/Object;

    .line 1162
    .line 1163
    iget-object v7, v0, Lr9/y;->d:Ljava/lang/Object;

    .line 1164
    .line 1165
    invoke-virtual/range {v2 .. v8}, Lr9/d0;->E(Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/Object;Ljava/lang/Object;Lr9/f0;)Z

    .line 1166
    .line 1167
    .line 1168
    :cond_29
    :goto_1c
    return-void

    .line 1169
    :catchall_6
    move-exception v0

    .line 1170
    monitor-exit v3

    .line 1171
    throw v0

    .line 1172
    :pswitch_a
    iget-object v0, v1, Lr8/b;->i:Ljava/lang/Object;

    .line 1173
    .line 1174
    check-cast v0, Lr9/d0;

    .line 1175
    .line 1176
    iget-object v2, v1, Lr8/b;->j:Ljava/lang/Object;

    .line 1177
    .line 1178
    check-cast v2, Landroid/widget/TextView;

    .line 1179
    .line 1180
    iget-object v3, v1, Lr8/b;->h:Ljava/lang/Object;

    .line 1181
    .line 1182
    check-cast v3, Ljava/lang/String;

    .line 1183
    .line 1184
    const-string v4, "red_packet_details_enable"

    .line 1185
    .line 1186
    iget-object v0, v0, Lr9/d0;->c:Landroid/content/SharedPreferences;

    .line 1187
    .line 1188
    const/4 v13, 0x0

    .line 1189
    invoke-interface {v0, v4, v13}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1190
    .line 1191
    .line 1192
    move-result v0

    .line 1193
    if-eqz v0, :cond_2a

    .line 1194
    .line 1195
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1196
    .line 1197
    .line 1198
    :cond_2a
    return-void

    .line 1199
    :pswitch_b
    iget-object v0, v1, Lr8/b;->i:Ljava/lang/Object;

    .line 1200
    .line 1201
    move-object v2, v0

    .line 1202
    check-cast v2, Lr8/d;

    .line 1203
    .line 1204
    iget-object v0, v1, Lr8/b;->h:Ljava/lang/Object;

    .line 1205
    .line 1206
    move-object v3, v0

    .line 1207
    check-cast v3, Ljava/lang/String;

    .line 1208
    .line 1209
    iget-object v0, v1, Lr8/b;->j:Ljava/lang/Object;

    .line 1210
    .line 1211
    check-cast v0, Lfg/a;

    .line 1212
    .line 1213
    const-string v4, "[Hchat:DexInstall] "

    .line 1214
    .line 1215
    :try_start_b
    sget-object v5, Lr8/e;->d:Ljava/lang/Object;

    .line 1216
    .line 1217
    monitor-enter v5
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 1218
    :try_start_c
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v0

    .line 1222
    check-cast v0, Ljava/lang/Boolean;

    .line 1223
    .line 1224
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 1225
    .line 1226
    .line 1227
    :try_start_d
    monitor-exit v5

    .line 1228
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1229
    .line 1230
    .line 1231
    move-result v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 1232
    if-eqz v0, :cond_2b

    .line 1233
    .line 1234
    iget-object v4, v2, Lr8/d;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1235
    .line 1236
    const/4 v13, 0x1

    .line 1237
    invoke-virtual {v4, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1238
    .line 1239
    .line 1240
    :cond_2b
    iget-object v4, v2, Lr8/d;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1241
    .line 1242
    const/4 v13, 0x0

    .line 1243
    invoke-virtual {v4, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1244
    .line 1245
    .line 1246
    move/from16 v17, v0

    .line 1247
    .line 1248
    goto :goto_1e

    .line 1249
    :catchall_7
    move-exception v0

    .line 1250
    goto :goto_1d

    .line 1251
    :catchall_8
    move-exception v0

    .line 1252
    :try_start_e
    monitor-exit v5

    .line 1253
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 1254
    :goto_1d
    :try_start_f
    iget-object v5, v2, Lr8/d;->a:Ljava/lang/String;

    .line 1255
    .line 1256
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v6

    .line 1260
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1261
    .line 1262
    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1266
    .line 1267
    .line 1268
    const-string v4, " \u5b89\u88c5\u5f02\u5e38: "

    .line 1269
    .line 1270
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v4

    .line 1280
    invoke-static {v4, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 1281
    .line 1282
    .line 1283
    iget-object v0, v2, Lr8/d;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1284
    .line 1285
    const/4 v13, 0x0

    .line 1286
    invoke-virtual {v0, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1287
    .line 1288
    .line 1289
    move/from16 v17, v13

    .line 1290
    .line 1291
    :goto_1e
    if-nez v17, :cond_31

    .line 1292
    .line 1293
    iget-object v0, v2, Lr8/d;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1294
    .line 1295
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1296
    .line 1297
    .line 1298
    move-result v0

    .line 1299
    if-eqz v0, :cond_2c

    .line 1300
    .line 1301
    goto :goto_20

    .line 1302
    :cond_2c
    iget-object v0, v2, Lr8/d;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1303
    .line 1304
    const/4 v4, 0x1

    .line 1305
    invoke-virtual {v0, v13, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1306
    .line 1307
    .line 1308
    move-result v0

    .line 1309
    if-nez v0, :cond_2d

    .line 1310
    .line 1311
    goto :goto_20

    .line 1312
    :cond_2d
    iget-object v0, v2, Lr8/d;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1313
    .line 1314
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 1315
    .line 1316
    .line 1317
    move-result v0

    .line 1318
    const/4 v4, 0x6

    .line 1319
    if-lt v0, v4, :cond_2e

    .line 1320
    .line 1321
    iget-object v0, v2, Lr8/d;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1322
    .line 1323
    invoke-virtual {v0, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1324
    .line 1325
    .line 1326
    iget-object v0, v2, Lr8/d;->a:Ljava/lang/String;

    .line 1327
    .line 1328
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1329
    .line 1330
    const-string v3, "[Hchat:DexInstall] "

    .line 1331
    .line 1332
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1336
    .line 1337
    .line 1338
    const-string v0, " \u591a\u6b21\u5b89\u88c5\u5931\u8d25\uff0c\u505c\u6b62\u672c\u8f6e\u91cd\u8bd5"

    .line 1339
    .line 1340
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1341
    .line 1342
    .line 1343
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v0

    .line 1347
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 1348
    .line 1349
    .line 1350
    goto :goto_20

    .line 1351
    :cond_2e
    sget-object v4, Lr8/e;->a:Landroid/os/Handler;

    .line 1352
    .line 1353
    new-instance v5, La1/d;

    .line 1354
    .line 1355
    const/16 v6, 0x1c

    .line 1356
    .line 1357
    invoke-direct {v5, v2, v6, v3}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1358
    .line 1359
    .line 1360
    if-gtz v0, :cond_2f

    .line 1361
    .line 1362
    const-wide/16 v2, 0x3e8

    .line 1363
    .line 1364
    goto :goto_1f

    .line 1365
    :cond_2f
    const-wide/16 v2, 0xbb8

    .line 1366
    .line 1367
    const/4 v13, 0x1

    .line 1368
    if-ne v0, v13, :cond_30

    .line 1369
    .line 1370
    goto :goto_1f

    .line 1371
    :cond_30
    const-wide/16 v6, 0x1

    .line 1372
    .line 1373
    sub-int/2addr v0, v13

    .line 1374
    shl-long/2addr v6, v0

    .line 1375
    mul-long/2addr v6, v2

    .line 1376
    const-wide/32 v2, 0xea60

    .line 1377
    .line 1378
    .line 1379
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 1380
    .line 1381
    .line 1382
    move-result-wide v2

    .line 1383
    :goto_1f
    invoke-virtual {v4, v5, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1384
    .line 1385
    .line 1386
    :cond_31
    :goto_20
    return-void

    .line 1387
    :catchall_9
    move-exception v0

    .line 1388
    iget-object v2, v2, Lr8/d;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1389
    .line 1390
    const/4 v13, 0x0

    .line 1391
    invoke-virtual {v2, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1392
    .line 1393
    .line 1394
    throw v0

    .line 1395
    :pswitch_data_0
    .packed-switch 0x0
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
