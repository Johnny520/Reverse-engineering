.class public final synthetic Lc9/n0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 20
    iput p5, p0, Lc9/n0;->g:I

    iput-object p1, p0, Lc9/n0;->k:Ljava/lang/Object;

    iput-object p2, p0, Lc9/n0;->h:Ljava/lang/Object;

    iput-object p3, p0, Lc9/n0;->i:Ljava/lang/Object;

    iput-object p4, p0, Lc9/n0;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lfg/l;Ljava/lang/Object;I)V
    .locals 0

    .line 17
    iput p5, p0, Lc9/n0;->g:I

    iput-object p1, p0, Lc9/n0;->h:Ljava/lang/Object;

    iput-object p2, p0, Lc9/n0;->i:Ljava/lang/Object;

    iput-object p3, p0, Lc9/n0;->k:Ljava/lang/Object;

    iput-object p4, p0, Lc9/n0;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 18
    iput p5, p0, Lc9/n0;->g:I

    iput-object p1, p0, Lc9/n0;->h:Ljava/lang/Object;

    iput-object p2, p0, Lc9/n0;->i:Ljava/lang/Object;

    iput-object p3, p0, Lc9/n0;->j:Ljava/lang/Object;

    iput-object p4, p0, Lc9/n0;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 19
    iput p5, p0, Lc9/n0;->g:I

    iput-object p1, p0, Lc9/n0;->h:Ljava/lang/Object;

    iput-object p3, p0, Lc9/n0;->j:Ljava/lang/Object;

    iput-object p4, p0, Lc9/n0;->k:Ljava/lang/Object;

    iput-object p2, p0, Lc9/n0;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lqb/k;Lqb/i;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iput v0, p0, Lc9/n0;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lc9/n0;->h:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lc9/n0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Lc9/n0;->i:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p4, p0, Lc9/n0;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lc9/n0;->g:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/16 v3, 0x40

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Long;

    .line 17
    .line 18
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lfg/a;

    .line 21
    .line 22
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Landroid/app/Activity;

    .line 25
    .line 26
    iget-object v4, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Lfg/l;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v7

    .line 36
    invoke-interface {v2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    new-instance v0, Lq2/e;

    .line 40
    .line 41
    invoke-direct {v0, v4, v7, v8, v6}, Lq2/e;-><init>(Ljava/lang/Object;JI)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    new-instance v4, Lwb/vu;

    .line 57
    .line 58
    invoke-direct {v4, v3, v0}, Lwb/vu;-><init>(Landroid/app/Activity;Lfg/a;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v4}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_0
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 70
    .line 71
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, Lfg/a;

    .line 74
    .line 75
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v3, Landroid/app/Activity;

    .line 78
    .line 79
    iget-object v4, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v4, Lfg/l;

    .line 82
    .line 83
    invoke-virtual {v0, v5, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_1

    .line 88
    .line 89
    invoke-interface {v2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    new-instance v0, Lc9/o0;

    .line 93
    .line 94
    const/16 v2, 0xa

    .line 95
    .line 96
    invoke-direct {v0, v4, v2}, Lc9/o0;-><init>(Lfg/l;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    if-eqz v2, :cond_1

    .line 104
    .line 105
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    if-eqz v2, :cond_1

    .line 110
    .line 111
    new-instance v4, Lwb/vu;

    .line 112
    .line 113
    invoke-direct {v4, v3, v0}, Lwb/vu;-><init>(Landroid/app/Activity;Lfg/a;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v4}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 117
    .line 118
    .line 119
    :cond_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_1
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lfb/d1;

    .line 125
    .line 126
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v2, Li0/a1;

    .line 129
    .line 130
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v3, Li0/a1;

    .line 133
    .line 134
    iget-object v5, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v5, Li0/a1;

    .line 137
    .line 138
    iget-object v6, v0, Lfb/d1;->b:Ljava/lang/String;

    .line 139
    .line 140
    invoke-interface {v2, v6}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iget-object v0, v0, Lfb/d1;->a:Ljava/lang/String;

    .line 144
    .line 145
    invoke-interface {v3, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v5, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 152
    .line 153
    return-object v0

    .line 154
    :pswitch_2
    iget-object v0, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v0, Lfg/l;

    .line 157
    .line 158
    iget-object v2, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v2, Lfg/l;

    .line 161
    .line 162
    iget-object v3, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v3, Li0/a1;

    .line 165
    .line 166
    iget-object v4, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v4, Li0/a1;

    .line 169
    .line 170
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    check-cast v5, Ljava/lang/String;

    .line 175
    .line 176
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-nez v5, :cond_3

    .line 181
    .line 182
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    check-cast v5, Ljava/lang/String;

    .line 187
    .line 188
    const-string v6, "rename"

    .line 189
    .line 190
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-eqz v5, :cond_2

    .line 195
    .line 196
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    check-cast v2, Ljava/lang/String;

    .line 201
    .line 202
    invoke-interface {v0, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    goto :goto_0

    .line 206
    :cond_2
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, Ljava/lang/String;

    .line 211
    .line 212
    invoke-interface {v2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    :goto_0
    const-string v0, ""

    .line 216
    .line 217
    invoke-interface {v4, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    :cond_3
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 221
    .line 222
    return-object v0

    .line 223
    :pswitch_3
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, Ljava/util/List;

    .line 226
    .line 227
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v2, Lr/z;

    .line 230
    .line 231
    iget-object v3, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v3, Lfg/l;

    .line 234
    .line 235
    iget-object v6, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v6, Li0/a1;

    .line 238
    .line 239
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    check-cast v7, Ljava/lang/String;

    .line 244
    .line 245
    invoke-interface {v6, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    if-eqz v7, :cond_7

    .line 249
    .line 250
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-eqz v4, :cond_5

    .line 259
    .line 260
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    check-cast v4, Lwb/ut;

    .line 265
    .line 266
    iget-object v4, v4, Lwb/ut;->b:Lfb/c;

    .line 267
    .line 268
    iget-object v4, v4, Lfb/c;->c:Ljava/lang/String;

    .line 269
    .line 270
    invoke-static {v4, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    if-eqz v4, :cond_4

    .line 275
    .line 276
    goto :goto_2

    .line 277
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 278
    .line 279
    goto :goto_1

    .line 280
    :cond_5
    const/4 v5, -0x1

    .line 281
    :goto_2
    if-ltz v5, :cond_6

    .line 282
    .line 283
    invoke-static {v2, v5}, Lr/z;->l(Lr/z;I)V

    .line 284
    .line 285
    .line 286
    :cond_6
    invoke-interface {v3, v7}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    :cond_7
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 290
    .line 291
    return-object v0

    .line 292
    :pswitch_4
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v0, Landroid/content/Context;

    .line 295
    .line 296
    iget-object v7, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v7, Ljava/lang/String;

    .line 299
    .line 300
    iget-object v8, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v8, Li0/j1;

    .line 303
    .line 304
    iget-object v9, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v9, Li0/j1;

    .line 307
    .line 308
    invoke-virtual {v8}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v8

    .line 312
    check-cast v8, Ljava/lang/Boolean;

    .line 313
    .line 314
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 315
    .line 316
    .line 317
    move-result v8

    .line 318
    if-eqz v8, :cond_8

    .line 319
    .line 320
    goto/16 :goto_4

    .line 321
    .line 322
    :cond_8
    instance-of v8, v0, Landroid/app/Activity;

    .line 323
    .line 324
    if-eqz v8, :cond_9

    .line 325
    .line 326
    move-object v4, v0

    .line 327
    check-cast v4, Landroid/app/Activity;

    .line 328
    .line 329
    :cond_9
    if-nez v4, :cond_a

    .line 330
    .line 331
    const-string v2, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6\u9009\u62e9\u5668"

    .line 332
    .line 333
    invoke-static {v0, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 338
    .line 339
    .line 340
    goto/16 :goto_4

    .line 341
    .line 342
    :cond_a
    sget-object v5, Lwb/hr;->a:Lwb/hr;

    .line 343
    .line 344
    sget-object v8, Lfb/g1;->a:Lfb/g1;

    .line 345
    .line 346
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    new-instance v8, Ljava/io/File;

    .line 350
    .line 351
    invoke-static {v0}, Lfb/g1;->a(Landroid/content/Context;)Ljava/io/File;

    .line 352
    .line 353
    .line 354
    move-result-object v10

    .line 355
    invoke-static {v7}, Lfb/g1;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v7

    .line 359
    invoke-direct {v8, v10, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .line 363
    .line 364
    .line 365
    new-instance v7, Lwb/ns;

    .line 366
    .line 367
    invoke-direct {v7, v0, v9, v2}, Lwb/ns;-><init>(Landroid/content/Context;Li0/j1;I)V

    .line 368
    .line 369
    .line 370
    monitor-enter v5

    .line 371
    :try_start_0
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .line 372
    .line 373
    .line 374
    new-instance v0, Lwb/gr;

    .line 375
    .line 376
    invoke-direct {v0, v4, v8, v7}, Lwb/gr;-><init>(Landroid/app/Activity;Ljava/io/File;Lwb/ns;)V

    .line 377
    .line 378
    .line 379
    sput-object v0, Lwb/hr;->c:Lwb/gr;

    .line 380
    .line 381
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-virtual {v5, v0}, Lwb/hr;->a(Ljava/lang/Class;)V

    .line 386
    .line 387
    .line 388
    const-class v0, Landroid/app/Activity;

    .line 389
    .line 390
    invoke-virtual {v5, v0}, Lwb/hr;->a(Ljava/lang/Class;)V

    .line 391
    .line 392
    .line 393
    new-instance v0, Landroid/content/Intent;

    .line 394
    .line 395
    const-string v2, "android.intent.action.OPEN_DOCUMENT"

    .line 396
    .line 397
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    const-string v2, "android.intent.category.OPENABLE"

    .line 401
    .line 402
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 403
    .line 404
    .line 405
    const-string v2, "*/*"

    .line 406
    .line 407
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 408
    .line 409
    .line 410
    const-string v2, "android.intent.extra.ALLOW_MULTIPLE"

    .line 411
    .line 412
    invoke-virtual {v0, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v0, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 419
    .line 420
    .line 421
    invoke-static {v4, v0}, Lwb/ho;->B4(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 422
    .line 423
    .line 424
    const v2, 0x4843525e    # 200009.47f

    .line 425
    .line 426
    .line 427
    :try_start_1
    invoke-virtual {v4, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 428
    .line 429
    .line 430
    goto :goto_3

    .line 431
    :catchall_0
    :try_start_2
    new-instance v0, Landroid/content/Intent;

    .line 432
    .line 433
    const-string v3, "android.intent.action.GET_CONTENT"

    .line 434
    .line 435
    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    const-string v3, "android.intent.category.OPENABLE"

    .line 439
    .line 440
    invoke-virtual {v0, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 441
    .line 442
    .line 443
    const-string v3, "*/*"

    .line 444
    .line 445
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 446
    .line 447
    .line 448
    const-string v3, "android.intent.extra.ALLOW_MULTIPLE"

    .line 449
    .line 450
    invoke-virtual {v0, v3, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 454
    .line 455
    .line 456
    const-string v3, "\u9009\u62e9\u6587\u4ef6\u6216\u56fe\u7247"

    .line 457
    .line 458
    invoke-static {v0, v3}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-virtual {v4, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 463
    .line 464
    .line 465
    :goto_3
    monitor-exit v5

    .line 466
    :goto_4
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 467
    .line 468
    return-object v0

    .line 469
    :catchall_1
    move-exception v0

    .line 470
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 471
    throw v0

    .line 472
    :pswitch_5
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v0, Lfg/p;

    .line 475
    .line 476
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v2, Lfb/d1;

    .line 479
    .line 480
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v3, Li0/a1;

    .line 483
    .line 484
    iget-object v5, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v5, Li0/a1;

    .line 487
    .line 488
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v6

    .line 492
    check-cast v6, Ljava/lang/String;

    .line 493
    .line 494
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 495
    .line 496
    .line 497
    move-result v6

    .line 498
    if-nez v6, :cond_b

    .line 499
    .line 500
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    check-cast v3, Ljava/lang/String;

    .line 505
    .line 506
    invoke-interface {v0, v2, v3}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    invoke-interface {v5, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    :cond_b
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 513
    .line 514
    return-object v0

    .line 515
    :pswitch_6
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast v0, Landroid/content/Context;

    .line 518
    .line 519
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast v2, Li0/a1;

    .line 522
    .line 523
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v3, Lwb/v3;

    .line 526
    .line 527
    iget-object v4, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v4, Li0/a1;

    .line 530
    .line 531
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v6

    .line 535
    check-cast v6, Ljava/util/List;

    .line 536
    .line 537
    new-instance v7, Ljava/util/ArrayList;

    .line 538
    .line 539
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 540
    .line 541
    .line 542
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 543
    .line 544
    .line 545
    move-result-object v6

    .line 546
    :cond_c
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 547
    .line 548
    .line 549
    move-result v8

    .line 550
    if-eqz v8, :cond_d

    .line 551
    .line 552
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v8

    .line 556
    move-object v9, v8

    .line 557
    check-cast v9, Ln9/a;

    .line 558
    .line 559
    iget-object v9, v9, Ln9/a;->a:Ljava/lang/String;

    .line 560
    .line 561
    move-object v10, v3

    .line 562
    check-cast v10, Lwb/s3;

    .line 563
    .line 564
    iget-object v10, v10, Lwb/s3;->a:Ln9/a;

    .line 565
    .line 566
    iget-object v10, v10, Ln9/a;->a:Ljava/lang/String;

    .line 567
    .line 568
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v9

    .line 572
    if-nez v9, :cond_c

    .line 573
    .line 574
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    goto :goto_5

    .line 578
    :cond_d
    invoke-static {v0, v2, v7}, Lwb/ho;->e1(Landroid/content/Context;Li0/a1;Ljava/util/ArrayList;)V

    .line 579
    .line 580
    .line 581
    const-string v2, "\u7fa4\u804a\u6807\u7b7e\u5df2\u5220\u9664"

    .line 582
    .line 583
    invoke-static {v0, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 588
    .line 589
    .line 590
    sget-object v0, Lwb/u3;->a:Lwb/u3;

    .line 591
    .line 592
    invoke-interface {v4, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 596
    .line 597
    return-object v0

    .line 598
    :pswitch_7
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 599
    .line 600
    check-cast v0, Lv8/r;

    .line 601
    .line 602
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 603
    .line 604
    check-cast v2, Li0/a1;

    .line 605
    .line 606
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 607
    .line 608
    check-cast v3, Li0/a1;

    .line 609
    .line 610
    iget-object v4, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v4, Li0/a1;

    .line 613
    .line 614
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    check-cast v2, Ljava/util/List;

    .line 619
    .line 620
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 621
    .line 622
    .line 623
    move-result v2

    .line 624
    add-int/2addr v2, v6

    .line 625
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    new-instance v5, Lv8/a;

    .line 629
    .line 630
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v6

    .line 638
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    const-string v0, "\u8f6c\u53d1\u89c4\u5219 "

    .line 642
    .line 643
    invoke-static {v2, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v7

    .line 647
    const-string v18, ""

    .line 648
    .line 649
    sget-object v10, Ltf/v;->g:Ltf/v;

    .line 650
    .line 651
    sget-object v13, Lv8/r;->b:Ljava/util/LinkedHashSet;

    .line 652
    .line 653
    const/16 v17, 0x0

    .line 654
    .line 655
    const/16 v19, 0x0

    .line 656
    .line 657
    const/4 v8, 0x1

    .line 658
    const/4 v9, 0x0

    .line 659
    const/4 v14, 0x0

    .line 660
    const-wide/16 v15, 0x0

    .line 661
    .line 662
    move-object v11, v10

    .line 663
    move-object v12, v10

    .line 664
    move-object/from16 v20, v18

    .line 665
    .line 666
    invoke-direct/range {v5 .. v20}, Lv8/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;)V

    .line 667
    .line 668
    .line 669
    invoke-interface {v3, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    sget-object v0, Lwb/g;->i:Lwb/g;

    .line 673
    .line 674
    invoke-interface {v4, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 678
    .line 679
    return-object v0

    .line 680
    :pswitch_8
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 681
    .line 682
    check-cast v0, Landroid/content/Context;

    .line 683
    .line 684
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast v2, Li0/a1;

    .line 687
    .line 688
    iget-object v5, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 689
    .line 690
    check-cast v5, Li0/a1;

    .line 691
    .line 692
    iget-object v7, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 693
    .line 694
    check-cast v7, Li0/a1;

    .line 695
    .line 696
    instance-of v8, v0, Landroid/app/Activity;

    .line 697
    .line 698
    if-eqz v8, :cond_e

    .line 699
    .line 700
    move-object v4, v0

    .line 701
    check-cast v4, Landroid/app/Activity;

    .line 702
    .line 703
    :cond_e
    if-nez v4, :cond_f

    .line 704
    .line 705
    const-string v3, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6\u9009\u62e9\u5668"

    .line 706
    .line 707
    invoke-static {v0, v2, v3}, Lwb/ho;->h(Landroid/content/Context;Li0/a1;Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    goto :goto_7

    .line 711
    :cond_f
    sget-object v8, Lwb/d;->a:Lwb/d;

    .line 712
    .line 713
    new-instance v0, Lwb/la;

    .line 714
    .line 715
    const/16 v9, 0xe

    .line 716
    .line 717
    invoke-direct {v0, v5, v7, v2, v9}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 718
    .line 719
    .line 720
    monitor-enter v8

    .line 721
    :try_start_4
    sput-object v0, Lwb/d;->c:Lwb/la;

    .line 722
    .line 723
    sput-object v4, Lwb/d;->e:Landroid/app/Activity;

    .line 724
    .line 725
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    invoke-virtual {v8, v0}, Lwb/d;->a(Ljava/lang/Class;)V

    .line 730
    .line 731
    .line 732
    const-class v0, Landroid/app/Activity;

    .line 733
    .line 734
    invoke-virtual {v8, v0}, Lwb/d;->a(Ljava/lang/Class;)V

    .line 735
    .line 736
    .line 737
    new-instance v0, Landroid/content/Intent;

    .line 738
    .line 739
    const-string v2, "android.intent.action.OPEN_DOCUMENT"

    .line 740
    .line 741
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    const-string v2, "android.intent.category.OPENABLE"

    .line 745
    .line 746
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 747
    .line 748
    .line 749
    const-string v2, "*/*"

    .line 750
    .line 751
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 752
    .line 753
    .line 754
    invoke-virtual {v0, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 758
    .line 759
    .line 760
    invoke-static {v4, v0}, Lwb/ho;->B4(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 761
    .line 762
    .line 763
    const v2, 0x4843525b    # 200009.42f

    .line 764
    .line 765
    .line 766
    :try_start_5
    invoke-virtual {v4, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 767
    .line 768
    .line 769
    goto :goto_6

    .line 770
    :catchall_2
    :try_start_6
    new-instance v0, Landroid/content/Intent;

    .line 771
    .line 772
    const-string v3, "android.intent.action.GET_CONTENT"

    .line 773
    .line 774
    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 775
    .line 776
    .line 777
    const-string v3, "android.intent.category.OPENABLE"

    .line 778
    .line 779
    invoke-virtual {v0, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 780
    .line 781
    .line 782
    const-string v3, "*/*"

    .line 783
    .line 784
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v0, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 788
    .line 789
    .line 790
    const-string v3, "\u9009\u62e9\u97f3\u9891\u6587\u4ef6"

    .line 791
    .line 792
    invoke-static {v0, v3}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    invoke-virtual {v4, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 797
    .line 798
    .line 799
    :goto_6
    monitor-exit v8

    .line 800
    :goto_7
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 801
    .line 802
    return-object v0

    .line 803
    :catchall_3
    move-exception v0

    .line 804
    :try_start_7
    monitor-exit v8
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 805
    throw v0

    .line 806
    :pswitch_9
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 807
    .line 808
    check-cast v0, Lwb/i5;

    .line 809
    .line 810
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 811
    .line 812
    check-cast v2, Landroid/content/SharedPreferences;

    .line 813
    .line 814
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 815
    .line 816
    check-cast v3, Li0/a1;

    .line 817
    .line 818
    iget-object v5, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 819
    .line 820
    check-cast v5, Li0/a1;

    .line 821
    .line 822
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v6

    .line 826
    check-cast v6, Ljava/util/List;

    .line 827
    .line 828
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 829
    .line 830
    .line 831
    move-result v6

    .line 832
    iget v0, v0, Lwb/i5;->a:I

    .line 833
    .line 834
    if-ltz v0, :cond_10

    .line 835
    .line 836
    if-ge v0, v6, :cond_10

    .line 837
    .line 838
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v6

    .line 842
    check-cast v6, Ljava/util/List;

    .line 843
    .line 844
    invoke-static {v6}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 845
    .line 846
    .line 847
    move-result-object v6

    .line 848
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    invoke-interface {v3, v6}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 852
    .line 853
    .line 854
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    const-string v2, "message_block_bindings"

    .line 859
    .line 860
    invoke-static {v6}, La2/a;->e(Ljava/util/List;)Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object v3

    .line 864
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 869
    .line 870
    .line 871
    :cond_10
    invoke-interface {v5, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 872
    .line 873
    .line 874
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 875
    .line 876
    return-object v0

    .line 877
    :pswitch_a
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 878
    .line 879
    move-object v2, v0

    .line 880
    check-cast v2, Landroid/content/Context;

    .line 881
    .line 882
    const-string v0, "\u6211\u540c\u610f"

    .line 883
    .line 884
    iget-object v3, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v3, Lfg/a;

    .line 887
    .line 888
    iget-object v4, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 889
    .line 890
    check-cast v4, Li0/a1;

    .line 891
    .line 892
    iget-object v7, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 893
    .line 894
    check-cast v7, Li0/a1;

    .line 895
    .line 896
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v8

    .line 900
    check-cast v8, Ljava/lang/Number;

    .line 901
    .line 902
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 903
    .line 904
    .line 905
    move-result v8

    .line 906
    if-lez v8, :cond_11

    .line 907
    .line 908
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    check-cast v0, Ljava/lang/Number;

    .line 913
    .line 914
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 915
    .line 916
    .line 917
    move-result v0

    .line 918
    const-string v3, "\u8bf7\u7b49\u5f85 "

    .line 919
    .line 920
    const-string v4, " \u79d2\u540e\u7ee7\u7eed"

    .line 921
    .line 922
    invoke-static {v3, v0, v4, v2, v5}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 923
    .line 924
    .line 925
    goto/16 :goto_d

    .line 926
    .line 927
    :cond_11
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v4

    .line 931
    check-cast v4, Ljava/lang/String;

    .line 932
    .line 933
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 934
    .line 935
    .line 936
    move-result-object v4

    .line 937
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v4

    .line 941
    invoke-static {v4, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 942
    .line 943
    .line 944
    move-result v0

    .line 945
    if-eqz v0, :cond_17

    .line 946
    .line 947
    const-string v4, "[Hchat:Storage] \u5173\u95ed\u5931\u6548\u914d\u7f6e\u5931\u8d25: Hchat_global_config "

    .line 948
    .line 949
    const-string v7, "Hchat_global_config"

    .line 950
    .line 951
    sget-object v0, Lub/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 952
    .line 953
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    if-eqz v0, :cond_12

    .line 958
    .line 959
    move-object v8, v0

    .line 960
    goto :goto_8

    .line 961
    :cond_12
    move-object v8, v2

    .line 962
    :goto_8
    invoke-static {v8}, Lub/b;->d(Landroid/content/Context;)Ljava/io/File;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    invoke-static {v0}, Lub/b;->b(Ljava/io/File;)Z

    .line 967
    .line 968
    .line 969
    move-result v9

    .line 970
    if-eqz v9, :cond_13

    .line 971
    .line 972
    invoke-static {v8, v7}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    goto :goto_b

    .line 977
    :cond_13
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v9

    .line 981
    const-string v10, ":Hchat_global_config"

    .line 982
    .line 983
    invoke-static {v9, v10}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v9

    .line 987
    sget-object v10, Lub/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 988
    .line 989
    monitor-enter v10

    .line 990
    :try_start_8
    invoke-static {v0}, Lub/b;->b(Ljava/io/File;)Z

    .line 991
    .line 992
    .line 993
    move-result v0

    .line 994
    if-eqz v0, :cond_14

    .line 995
    .line 996
    invoke-static {v8, v7}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 997
    .line 998
    .line 999
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 1000
    :goto_9
    monitor-exit v10

    .line 1001
    goto :goto_b

    .line 1002
    :catchall_4
    move-exception v0

    .line 1003
    goto/16 :goto_c

    .line 1004
    .line 1005
    :cond_14
    :try_start_9
    invoke-virtual {v10, v9}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v0

    .line 1009
    check-cast v0, Landroid/content/SharedPreferences;

    .line 1010
    .line 1011
    instance-of v11, v0, Lac/o;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 1012
    .line 1013
    if-eqz v11, :cond_15

    .line 1014
    .line 1015
    :try_start_a
    check-cast v0, Lac/o;

    .line 1016
    .line 1017
    invoke-virtual {v0}, Lac/o;->c()V

    .line 1018
    .line 1019
    .line 1020
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 1021
    .line 1022
    goto :goto_a

    .line 1023
    :catchall_5
    move-exception v0

    .line 1024
    :try_start_b
    new-instance v11, Lsf/f;

    .line 1025
    .line 1026
    invoke-direct {v11, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1027
    .line 1028
    .line 1029
    move-object v0, v11

    .line 1030
    :goto_a
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    if-eqz v0, :cond_15

    .line 1035
    .line 1036
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v11

    .line 1040
    new-instance v12, Ljava/lang/StringBuilder;

    .line 1041
    .line 1042
    invoke-direct {v12, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v4

    .line 1052
    invoke-static {v4, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1053
    .line 1054
    .line 1055
    :cond_15
    invoke-static {v8, v7}, Lub/b;->a(Landroid/content/Context;Ljava/lang/String;)Lac/o;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    sget-object v4, Lub/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1060
    .line 1061
    invoke-virtual {v4, v9, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 1062
    .line 1063
    .line 1064
    goto :goto_9

    .line 1065
    :goto_b
    :try_start_c
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v4

    .line 1069
    const-string v7, "terms_accepted"

    .line 1070
    .line 1071
    invoke-interface {v4, v7, v6}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v4

    .line 1075
    const-string v7, "terms_version"

    .line 1076
    .line 1077
    invoke-interface {v4, v7, v6}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v4

    .line 1081
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1082
    .line 1083
    .line 1084
    move-result v4

    .line 1085
    if-eqz v4, :cond_16

    .line 1086
    .line 1087
    const-string v4, "terms_accepted"

    .line 1088
    .line 1089
    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1090
    .line 1091
    .line 1092
    move-result v4

    .line 1093
    if-eqz v4, :cond_16

    .line 1094
    .line 1095
    const-string v4, "terms_version"

    .line 1096
    .line 1097
    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1098
    .line 1099
    .line 1100
    move-result v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 1101
    if-ne v0, v6, :cond_16

    .line 1102
    .line 1103
    invoke-interface {v3}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    goto :goto_d

    .line 1107
    :catchall_6
    move-exception v0

    .line 1108
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v3

    .line 1112
    const-string v4, "[Hchat:TermsGate] \u4fdd\u5b58\u534f\u8bae\u72b6\u6001\u5931\u8d25: "

    .line 1113
    .line 1114
    invoke-static {v4, v3, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1115
    .line 1116
    .line 1117
    :cond_16
    const-string v0, "\u534f\u8bae\u72b6\u6001\u4fdd\u5b58\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    .line 1118
    .line 1119
    invoke-static {v2, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1124
    .line 1125
    .line 1126
    goto :goto_d

    .line 1127
    :goto_c
    monitor-exit v10

    .line 1128
    throw v0

    .line 1129
    :cond_17
    const-string v0, "\u8bf7\u8f93\u5165\u201c\u6211\u540c\u610f\u201d\u540e\u7ee7\u7eed"

    .line 1130
    .line 1131
    invoke-static {v2, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1136
    .line 1137
    .line 1138
    :goto_d
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1139
    .line 1140
    return-object v0

    .line 1141
    :pswitch_b
    iget-object v0, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 1142
    .line 1143
    check-cast v0, Lfg/l;

    .line 1144
    .line 1145
    iget-object v3, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 1146
    .line 1147
    check-cast v3, Lx8/s;

    .line 1148
    .line 1149
    iget-object v4, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 1150
    .line 1151
    move-object v9, v4

    .line 1152
    check-cast v9, Lwb/u0;

    .line 1153
    .line 1154
    iget-object v4, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 1155
    .line 1156
    check-cast v4, Lfg/l;

    .line 1157
    .line 1158
    new-instance v7, Lwb/v0;

    .line 1159
    .line 1160
    iget v8, v3, Lx8/s;->b:I

    .line 1161
    .line 1162
    invoke-static {v8}, Lwb/ho;->N4(I)Ljava/lang/String;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v8

    .line 1166
    iget-object v10, v3, Lx8/s;->c:Ljava/lang/String;

    .line 1167
    .line 1168
    invoke-static {v10}, Lwb/ho;->P4(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v10

    .line 1172
    invoke-static {v10}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v11

    .line 1176
    new-instance v12, Lwb/kj;

    .line 1177
    .line 1178
    invoke-direct {v12, v4, v3, v2}, Lwb/kj;-><init>(Lfg/l;Lx8/s;I)V

    .line 1179
    .line 1180
    .line 1181
    iget v2, v3, Lx8/s;->b:I

    .line 1182
    .line 1183
    const/4 v3, 0x6

    .line 1184
    if-ne v2, v3, :cond_18

    .line 1185
    .line 1186
    move v13, v6

    .line 1187
    goto :goto_e

    .line 1188
    :cond_18
    move v13, v5

    .line 1189
    :goto_e
    const/16 v14, 0xc0

    .line 1190
    .line 1191
    const/4 v10, 0x1

    .line 1192
    invoke-direct/range {v7 .. v14}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 1193
    .line 1194
    .line 1195
    invoke-interface {v0, v7}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1196
    .line 1197
    .line 1198
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1199
    .line 1200
    return-object v0

    .line 1201
    :pswitch_c
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 1202
    .line 1203
    check-cast v0, Lqg/t;

    .line 1204
    .line 1205
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 1206
    .line 1207
    check-cast v2, Li0/a1;

    .line 1208
    .line 1209
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 1210
    .line 1211
    check-cast v3, Li0/a1;

    .line 1212
    .line 1213
    iget-object v4, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 1214
    .line 1215
    check-cast v4, Li0/a1;

    .line 1216
    .line 1217
    invoke-static {v0, v2, v3, v4, v6}, Lwb/ho;->s(Lqg/t;Li0/a1;Li0/a1;Li0/a1;Z)V

    .line 1218
    .line 1219
    .line 1220
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1221
    .line 1222
    return-object v0

    .line 1223
    :pswitch_d
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 1224
    .line 1225
    move-object v2, v0

    .line 1226
    check-cast v2, Landroid/app/Activity;

    .line 1227
    .line 1228
    iget-object v0, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 1229
    .line 1230
    check-cast v0, Lba/n;

    .line 1231
    .line 1232
    iget-object v4, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 1233
    .line 1234
    check-cast v4, Lfg/a;

    .line 1235
    .line 1236
    iget-object v7, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 1237
    .line 1238
    check-cast v7, Landroid/content/Context;

    .line 1239
    .line 1240
    new-instance v8, Lwb/dj;

    .line 1241
    .line 1242
    invoke-direct {v8, v4, v7, v0, v6}, Lwb/dj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1243
    .line 1244
    .line 1245
    sget-object v4, Lba/g;->a:Lba/g;

    .line 1246
    .line 1247
    sget-object v4, Lsf/n;->a:Lsf/n;

    .line 1248
    .line 1249
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1250
    .line 1251
    .line 1252
    sget-object v7, Lba/g;->a:Lba/g;

    .line 1253
    .line 1254
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v9

    .line 1258
    invoke-virtual {v7, v9}, Lba/g;->a(Ljava/lang/Class;)V

    .line 1259
    .line 1260
    .line 1261
    const-class v9, Landroid/app/Activity;

    .line 1262
    .line 1263
    invoke-virtual {v7, v9}, Lba/g;->a(Ljava/lang/Class;)V

    .line 1264
    .line 1265
    .line 1266
    sget-object v7, Lba/g;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1267
    .line 1268
    new-instance v9, Lba/c;

    .line 1269
    .line 1270
    invoke-direct {v9, v5}, Lba/c;-><init>(I)V

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v7, v9}, Ljava/util/concurrent/atomic/AtomicInteger;->updateAndGet(Ljava/util/function/IntUnaryOperator;)I

    .line 1274
    .line 1275
    .line 1276
    move-result v5

    .line 1277
    sget-object v7, Lba/g;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1278
    .line 1279
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v9

    .line 1283
    new-instance v10, Lba/d;

    .line 1284
    .line 1285
    invoke-direct {v10, v2, v0, v8}, Lba/d;-><init>(Landroid/app/Activity;Lba/n;Lwb/dj;)V

    .line 1286
    .line 1287
    .line 1288
    invoke-virtual {v7, v9, v10}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1289
    .line 1290
    .line 1291
    new-instance v0, Landroid/content/Intent;

    .line 1292
    .line 1293
    const-string v8, "android.intent.action.OPEN_DOCUMENT"

    .line 1294
    .line 1295
    invoke-direct {v0, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1296
    .line 1297
    .line 1298
    const-string v8, "android.intent.category.OPENABLE"

    .line 1299
    .line 1300
    invoke-virtual {v0, v8}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 1301
    .line 1302
    .line 1303
    const-string v9, "image/*"

    .line 1304
    .line 1305
    invoke-virtual {v0, v9}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v0, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1312
    .line 1313
    .line 1314
    :try_start_d
    invoke-virtual {v2, v0, v5}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 1315
    .line 1316
    .line 1317
    move-object v3, v4

    .line 1318
    goto :goto_f

    .line 1319
    :catchall_7
    move-exception v0

    .line 1320
    new-instance v3, Lsf/f;

    .line 1321
    .line 1322
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1323
    .line 1324
    .line 1325
    :goto_f
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v0

    .line 1329
    if-eqz v0, :cond_19

    .line 1330
    .line 1331
    new-instance v0, Landroid/content/Intent;

    .line 1332
    .line 1333
    const-string v3, "android.intent.action.GET_CONTENT"

    .line 1334
    .line 1335
    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1336
    .line 1337
    .line 1338
    invoke-virtual {v0, v8}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual {v0, v9}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1342
    .line 1343
    .line 1344
    invoke-virtual {v0, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1345
    .line 1346
    .line 1347
    :try_start_e
    const-string v3, "\u9009\u62e9\u6d88\u606f\u6c14\u6ce1\u56fe\u7247"

    .line 1348
    .line 1349
    invoke-static {v0, v3}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v0

    .line 1353
    invoke-virtual {v2, v0, v5}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 1354
    .line 1355
    .line 1356
    move-object v2, v4

    .line 1357
    goto :goto_10

    .line 1358
    :catchall_8
    move-exception v0

    .line 1359
    new-instance v2, Lsf/f;

    .line 1360
    .line 1361
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1362
    .line 1363
    .line 1364
    :goto_10
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v0

    .line 1368
    if-eqz v0, :cond_19

    .line 1369
    .line 1370
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v0

    .line 1374
    invoke-virtual {v7, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v0

    .line 1378
    check-cast v0, Lba/d;

    .line 1379
    .line 1380
    if-eqz v0, :cond_19

    .line 1381
    .line 1382
    iget-object v0, v0, Lba/d;->c:Lwb/dj;

    .line 1383
    .line 1384
    sget-object v2, Lba/b;->i:Lba/b;

    .line 1385
    .line 1386
    invoke-virtual {v0, v2}, Lwb/dj;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1387
    .line 1388
    .line 1389
    :cond_19
    return-object v4

    .line 1390
    :pswitch_e
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 1391
    .line 1392
    check-cast v0, Landroid/content/Context;

    .line 1393
    .line 1394
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 1395
    .line 1396
    check-cast v2, Ljava/util/List;

    .line 1397
    .line 1398
    iget-object v3, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 1399
    .line 1400
    check-cast v3, Lfg/l;

    .line 1401
    .line 1402
    iget-object v6, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 1403
    .line 1404
    check-cast v6, Ldb/c;

    .line 1405
    .line 1406
    instance-of v7, v0, Landroid/app/Activity;

    .line 1407
    .line 1408
    if-eqz v7, :cond_1a

    .line 1409
    .line 1410
    move-object v4, v0

    .line 1411
    check-cast v4, Landroid/app/Activity;

    .line 1412
    .line 1413
    :cond_1a
    if-nez v4, :cond_1b

    .line 1414
    .line 1415
    const-string v2, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u65f6\u95f4\u9009\u62e9\u5668"

    .line 1416
    .line 1417
    invoke-static {v0, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v0

    .line 1421
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1422
    .line 1423
    .line 1424
    goto :goto_13

    .line 1425
    :cond_1b
    invoke-static {v2}, Ltf/m;->C1(Ljava/util/List;)Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v0

    .line 1429
    check-cast v0, Ljava/lang/Long;

    .line 1430
    .line 1431
    const-wide/32 v7, 0x493e0

    .line 1432
    .line 1433
    .line 1434
    if-eqz v0, :cond_1c

    .line 1435
    .line 1436
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 1437
    .line 1438
    .line 1439
    move-result-wide v9

    .line 1440
    :goto_11
    add-long/2addr v9, v7

    .line 1441
    goto :goto_12

    .line 1442
    :cond_1c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1443
    .line 1444
    .line 1445
    move-result-wide v9

    .line 1446
    goto :goto_11

    .line 1447
    :goto_12
    new-instance v0, Lwb/dj;

    .line 1448
    .line 1449
    invoke-direct {v0, v3, v6, v2, v5}, Lwb/dj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1450
    .line 1451
    .line 1452
    invoke-static {v4, v9, v10, v0}, Lwb/ho;->g7(Landroid/app/Activity;JLfg/l;)V

    .line 1453
    .line 1454
    .line 1455
    :goto_13
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1456
    .line 1457
    return-object v0

    .line 1458
    :pswitch_f
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 1459
    .line 1460
    move-object v7, v0

    .line 1461
    check-cast v7, Lwb/s0;

    .line 1462
    .line 1463
    iget-object v0, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 1464
    .line 1465
    move-object v8, v0

    .line 1466
    check-cast v8, Landroid/content/Context;

    .line 1467
    .line 1468
    iget-object v0, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 1469
    .line 1470
    check-cast v0, Li0/a1;

    .line 1471
    .line 1472
    iget-object v2, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 1473
    .line 1474
    move-object v9, v2

    .line 1475
    check-cast v9, Li0/a1;

    .line 1476
    .line 1477
    iget-object v2, v7, Lwb/s0;->a:Ljava/lang/String;

    .line 1478
    .line 1479
    invoke-interface {v0, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1480
    .line 1481
    .line 1482
    instance-of v0, v8, Landroid/app/Activity;

    .line 1483
    .line 1484
    if-eqz v0, :cond_1d

    .line 1485
    .line 1486
    move-object v4, v8

    .line 1487
    check-cast v4, Landroid/app/Activity;

    .line 1488
    .line 1489
    :cond_1d
    move-object v6, v4

    .line 1490
    if-eqz v6, :cond_1e

    .line 1491
    .line 1492
    iget-object v11, v7, Lwb/s0;->b:Ljava/lang/String;

    .line 1493
    .line 1494
    const-string v12, "\u7ba1\u7406\u81ea\u5b9a\u4e49\u597d\u53cb\u5934\u50cf"

    .line 1495
    .line 1496
    const-string v0, "\u66f4\u6362\u5934\u50cf"

    .line 1497
    .line 1498
    const-string v2, "\u91cd\u65b0\u9009\u62e9\u4e00\u5f20\u672c\u5730\u56fe\u7247"

    .line 1499
    .line 1500
    new-instance v3, Lsf/e;

    .line 1501
    .line 1502
    invoke-direct {v3, v0, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1503
    .line 1504
    .line 1505
    const-string v0, "\u6062\u590d\u5fae\u4fe1\u5934\u50cf"

    .line 1506
    .line 1507
    const-string v2, "\u5220\u9664\u5f53\u524d\u81ea\u5b9a\u4e49\u5934\u50cf"

    .line 1508
    .line 1509
    new-instance v4, Lsf/e;

    .line 1510
    .line 1511
    invoke-direct {v4, v0, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1512
    .line 1513
    .line 1514
    filled-new-array {v3, v4}, [Lsf/e;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v0

    .line 1518
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v13

    .line 1522
    new-instance v5, Lc9/k;

    .line 1523
    .line 1524
    const/16 v10, 0x11

    .line 1525
    .line 1526
    invoke-direct/range {v5 .. v10}, Lc9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1527
    .line 1528
    .line 1529
    new-instance v15, Lk/s1;

    .line 1530
    .line 1531
    const/16 v0, 0x19

    .line 1532
    .line 1533
    invoke-direct {v15, v0}, Lk/s1;-><init>(I)V

    .line 1534
    .line 1535
    .line 1536
    sget-object v16, Lwb/lv;->j:Lwb/lv;

    .line 1537
    .line 1538
    move-object v14, v5

    .line 1539
    move-object v10, v6

    .line 1540
    invoke-static/range {v10 .. v16}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 1541
    .line 1542
    .line 1543
    :cond_1e
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1544
    .line 1545
    return-object v0

    .line 1546
    :pswitch_10
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 1547
    .line 1548
    check-cast v0, Lwb/b3;

    .line 1549
    .line 1550
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 1551
    .line 1552
    check-cast v2, Landroid/content/Context;

    .line 1553
    .line 1554
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 1555
    .line 1556
    check-cast v3, Lfg/a;

    .line 1557
    .line 1558
    iget-object v4, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 1559
    .line 1560
    check-cast v4, Li0/a1;

    .line 1561
    .line 1562
    iget-boolean v6, v0, Lwb/b3;->d:Z

    .line 1563
    .line 1564
    if-nez v6, :cond_1f

    .line 1565
    .line 1566
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v6

    .line 1570
    check-cast v6, Ljava/util/Set;

    .line 1571
    .line 1572
    invoke-interface {v6}, Ljava/util/Set;->isEmpty()Z

    .line 1573
    .line 1574
    .line 1575
    move-result v6

    .line 1576
    if-eqz v6, :cond_1f

    .line 1577
    .line 1578
    const-string v0, "\u8bf7\u9009\u62e9\u6536\u85cf"

    .line 1579
    .line 1580
    invoke-static {v2, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v0

    .line 1584
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1585
    .line 1586
    .line 1587
    goto/16 :goto_17

    .line 1588
    .line 1589
    :cond_1f
    iget-object v2, v0, Lwb/b3;->c:Lfg/l;

    .line 1590
    .line 1591
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v4

    .line 1595
    check-cast v4, Ljava/util/Set;

    .line 1596
    .line 1597
    check-cast v4, Ljava/lang/Iterable;

    .line 1598
    .line 1599
    iget-object v6, v0, Lwb/b3;->e:Ljava/lang/String;

    .line 1600
    .line 1601
    iget-boolean v0, v0, Lwb/b3;->d:Z

    .line 1602
    .line 1603
    new-instance v5, Ljava/util/ArrayList;

    .line 1604
    .line 1605
    invoke-static {v4}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 1606
    .line 1607
    .line 1608
    move-result v7

    .line 1609
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1610
    .line 1611
    .line 1612
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v4

    .line 1616
    :goto_14
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1617
    .line 1618
    .line 1619
    move-result v7

    .line 1620
    if-eqz v7, :cond_20

    .line 1621
    .line 1622
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v7

    .line 1626
    check-cast v7, Ljava/lang/String;

    .line 1627
    .line 1628
    invoke-static {v7, v5}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1629
    .line 1630
    .line 1631
    goto :goto_14

    .line 1632
    :cond_20
    new-instance v4, Ljava/util/ArrayList;

    .line 1633
    .line 1634
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1635
    .line 1636
    .line 1637
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v5

    .line 1641
    :cond_21
    :goto_15
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1642
    .line 1643
    .line 1644
    move-result v7

    .line 1645
    if-eqz v7, :cond_22

    .line 1646
    .line 1647
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v7

    .line 1651
    move-object v8, v7

    .line 1652
    check-cast v8, Ljava/lang/String;

    .line 1653
    .line 1654
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 1655
    .line 1656
    .line 1657
    move-result v8

    .line 1658
    if-lez v8, :cond_21

    .line 1659
    .line 1660
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1661
    .line 1662
    .line 1663
    goto :goto_15

    .line 1664
    :cond_22
    invoke-static {v4}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v4

    .line 1668
    invoke-static {v4}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v5

    .line 1672
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 1673
    .line 1674
    .line 1675
    move-result v4

    .line 1676
    if-eqz v4, :cond_23

    .line 1677
    .line 1678
    const-string v0, ""

    .line 1679
    .line 1680
    goto :goto_16

    .line 1681
    :cond_23
    if-eqz v0, :cond_24

    .line 1682
    .line 1683
    const/4 v9, 0x0

    .line 1684
    const/16 v10, 0x3e

    .line 1685
    .line 1686
    const/4 v7, 0x0

    .line 1687
    const/4 v8, 0x0

    .line 1688
    invoke-static/range {v5 .. v10}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v0

    .line 1692
    goto :goto_16

    .line 1693
    :cond_24
    invoke-static {v5}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v0

    .line 1697
    check-cast v0, Ljava/lang/String;

    .line 1698
    .line 1699
    :goto_16
    invoke-interface {v2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1700
    .line 1701
    .line 1702
    invoke-interface {v3}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 1703
    .line 1704
    .line 1705
    :goto_17
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1706
    .line 1707
    return-object v0

    .line 1708
    :pswitch_11
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 1709
    .line 1710
    check-cast v0, Lwb/t5;

    .line 1711
    .line 1712
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 1713
    .line 1714
    check-cast v2, Lfg/a;

    .line 1715
    .line 1716
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 1717
    .line 1718
    check-cast v3, Li0/a1;

    .line 1719
    .line 1720
    iget-object v5, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 1721
    .line 1722
    check-cast v5, Li0/a1;

    .line 1723
    .line 1724
    if-nez v0, :cond_25

    .line 1725
    .line 1726
    invoke-interface {v2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 1727
    .line 1728
    .line 1729
    goto :goto_18

    .line 1730
    :cond_25
    invoke-interface {v3, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1731
    .line 1732
    .line 1733
    const-string v0, ""

    .line 1734
    .line 1735
    invoke-interface {v5, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1736
    .line 1737
    .line 1738
    :goto_18
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1739
    .line 1740
    return-object v0

    .line 1741
    :pswitch_12
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 1742
    .line 1743
    check-cast v0, Lfg/q;

    .line 1744
    .line 1745
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 1746
    .line 1747
    check-cast v2, Li0/a1;

    .line 1748
    .line 1749
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 1750
    .line 1751
    check-cast v3, Li0/a1;

    .line 1752
    .line 1753
    iget-object v4, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 1754
    .line 1755
    check-cast v4, Li0/a1;

    .line 1756
    .line 1757
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v2

    .line 1761
    check-cast v2, Ljava/lang/String;

    .line 1762
    .line 1763
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v3

    .line 1767
    check-cast v3, Ljava/lang/String;

    .line 1768
    .line 1769
    invoke-static {v3}, La7/a;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v3

    .line 1773
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1774
    .line 1775
    .line 1776
    move-result-object v4

    .line 1777
    check-cast v4, Ljava/lang/String;

    .line 1778
    .line 1779
    invoke-static {v4}, La7/a;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v4

    .line 1783
    invoke-interface {v0, v2, v3, v4}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1784
    .line 1785
    .line 1786
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1787
    .line 1788
    return-object v0

    .line 1789
    :pswitch_13
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 1790
    .line 1791
    check-cast v0, Landroid/content/Context;

    .line 1792
    .line 1793
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 1794
    .line 1795
    check-cast v2, Lwb/a1;

    .line 1796
    .line 1797
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 1798
    .line 1799
    check-cast v3, Li0/a1;

    .line 1800
    .line 1801
    iget-object v4, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 1802
    .line 1803
    check-cast v4, Li0/a1;

    .line 1804
    .line 1805
    check-cast v2, Lwb/x0;

    .line 1806
    .line 1807
    iget-object v2, v2, Lwb/x0;->a:Lc9/a;

    .line 1808
    .line 1809
    iget-object v2, v2, Lc9/a;->a:Ljava/lang/String;

    .line 1810
    .line 1811
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1812
    .line 1813
    .line 1814
    invoke-static {v2}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v2

    .line 1818
    invoke-static {v0, v2}, Lc9/o2;->e(Landroid/content/Context;Ljava/util/Collection;)Z

    .line 1819
    .line 1820
    .line 1821
    move-result v2

    .line 1822
    if-eqz v2, :cond_26

    .line 1823
    .line 1824
    const-string v6, "\u5206\u7ec4\u5df2\u5220\u9664"

    .line 1825
    .line 1826
    goto :goto_19

    .line 1827
    :cond_26
    const-string v6, "\u5206\u7ec4\u5220\u9664\u5931\u8d25"

    .line 1828
    .line 1829
    :goto_19
    invoke-static {v0, v6, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v5

    .line 1833
    invoke-virtual {v5}, Landroid/widget/Toast;->show()V

    .line 1834
    .line 1835
    .line 1836
    if-eqz v2, :cond_27

    .line 1837
    .line 1838
    invoke-static {v0}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v2

    .line 1842
    invoke-interface {v3, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1843
    .line 1844
    .line 1845
    invoke-static {v0}, Lc9/d2;->y(Landroid/content/Context;)V

    .line 1846
    .line 1847
    .line 1848
    sget-object v0, Lwb/y0;->a:Lwb/y0;

    .line 1849
    .line 1850
    invoke-interface {v4, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1851
    .line 1852
    .line 1853
    :cond_27
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1854
    .line 1855
    return-object v0

    .line 1856
    :pswitch_14
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 1857
    .line 1858
    check-cast v0, Lqb/k;

    .line 1859
    .line 1860
    iget-object v2, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 1861
    .line 1862
    check-cast v2, Lqb/i;

    .line 1863
    .line 1864
    iget-object v3, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 1865
    .line 1866
    check-cast v3, Ljava/lang/String;

    .line 1867
    .line 1868
    iget-object v4, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 1869
    .line 1870
    check-cast v4, Landroid/app/Activity;

    .line 1871
    .line 1872
    invoke-virtual {v0, v2, v3}, Lqb/k;->G(Lqb/i;Ljava/lang/String;)Z

    .line 1873
    .line 1874
    .line 1875
    move-result v0

    .line 1876
    if-eqz v0, :cond_28

    .line 1877
    .line 1878
    const-string v2, "\u6536\u85cf\u8bed\u97f3\u5df2\u53d1\u9001"

    .line 1879
    .line 1880
    goto :goto_1a

    .line 1881
    :cond_28
    const-string v2, "\u6536\u85cf\u8bed\u97f3\u53d1\u9001\u5931\u8d25"

    .line 1882
    .line 1883
    :goto_1a
    invoke-static {v4, v2}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1884
    .line 1885
    .line 1886
    if-eqz v0, :cond_29

    .line 1887
    .line 1888
    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    .line 1889
    .line 1890
    .line 1891
    move-result v0

    .line 1892
    if-nez v0, :cond_29

    .line 1893
    .line 1894
    invoke-virtual {v4}, Landroid/app/Activity;->finish()V

    .line 1895
    .line 1896
    .line 1897
    :cond_29
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1898
    .line 1899
    return-object v0

    .line 1900
    :pswitch_15
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 1901
    .line 1902
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1903
    .line 1904
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 1905
    .line 1906
    check-cast v2, Lqb/k;

    .line 1907
    .line 1908
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 1909
    .line 1910
    check-cast v3, Ljava/util/ArrayList;

    .line 1911
    .line 1912
    iget-object v4, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 1913
    .line 1914
    check-cast v4, Landroid/app/Activity;

    .line 1915
    .line 1916
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1917
    .line 1918
    .line 1919
    move-result v0

    .line 1920
    if-nez v0, :cond_2a

    .line 1921
    .line 1922
    invoke-static {v3}, Lqb/k;->e(Ljava/util/Collection;)V

    .line 1923
    .line 1924
    .line 1925
    :cond_2a
    iget-object v0, v2, Lqb/k;->l:Ljava/util/Set;

    .line 1926
    .line 1927
    invoke-interface {v0, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1928
    .line 1929
    .line 1930
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1931
    .line 1932
    return-object v0

    .line 1933
    :pswitch_16
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 1934
    .line 1935
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1936
    .line 1937
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 1938
    .line 1939
    check-cast v2, Lgg/t;

    .line 1940
    .line 1941
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 1942
    .line 1943
    check-cast v3, Lgg/u;

    .line 1944
    .line 1945
    iget-object v4, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 1946
    .line 1947
    check-cast v4, Lgg/u;

    .line 1948
    .line 1949
    invoke-virtual {v0, v5, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1950
    .line 1951
    .line 1952
    move-result v0

    .line 1953
    if-eqz v0, :cond_2b

    .line 1954
    .line 1955
    sget-object v0, Lnb/f0;->a:Landroid/os/Handler;

    .line 1956
    .line 1957
    new-instance v5, Lac/l;

    .line 1958
    .line 1959
    const/16 v6, 0x16

    .line 1960
    .line 1961
    invoke-direct {v5, v2, v3, v4, v6}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1962
    .line 1963
    .line 1964
    invoke-virtual {v0, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1965
    .line 1966
    .line 1967
    :cond_2b
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1968
    .line 1969
    return-object v0

    .line 1970
    :pswitch_17
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 1971
    .line 1972
    move-object v10, v0

    .line 1973
    check-cast v10, Ljava/lang/Float;

    .line 1974
    .line 1975
    iget-object v0, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 1976
    .line 1977
    check-cast v0, Li/d0;

    .line 1978
    .line 1979
    iget-object v2, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 1980
    .line 1981
    move-object v11, v2

    .line 1982
    check-cast v11, Ljava/lang/Float;

    .line 1983
    .line 1984
    iget-object v2, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 1985
    .line 1986
    move-object v8, v2

    .line 1987
    check-cast v8, Li/c0;

    .line 1988
    .line 1989
    iget-object v2, v0, Li/d0;->g:Ljava/lang/Float;

    .line 1990
    .line 1991
    invoke-virtual {v10, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1992
    .line 1993
    .line 1994
    move-result v2

    .line 1995
    if-eqz v2, :cond_2c

    .line 1996
    .line 1997
    iget-object v2, v0, Li/d0;->h:Ljava/lang/Float;

    .line 1998
    .line 1999
    invoke-virtual {v11, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2000
    .line 2001
    .line 2002
    move-result v2

    .line 2003
    if-nez v2, :cond_2d

    .line 2004
    .line 2005
    :cond_2c
    iput-object v10, v0, Li/d0;->g:Ljava/lang/Float;

    .line 2006
    .line 2007
    iput-object v11, v0, Li/d0;->h:Ljava/lang/Float;

    .line 2008
    .line 2009
    new-instance v7, Li/z0;

    .line 2010
    .line 2011
    sget-object v9, Li/d;->j:Li/m1;

    .line 2012
    .line 2013
    const/4 v12, 0x0

    .line 2014
    invoke-direct/range {v7 .. v12}, Li/z0;-><init>(Li/k;Li/m1;Ljava/lang/Object;Ljava/lang/Object;Li/q;)V

    .line 2015
    .line 2016
    .line 2017
    iput-object v7, v0, Li/d0;->j:Li/z0;

    .line 2018
    .line 2019
    iget-object v2, v0, Li/d0;->n:Li/g0;

    .line 2020
    .line 2021
    iget-object v2, v2, Li/g0;->b:Li0/j1;

    .line 2022
    .line 2023
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2024
    .line 2025
    invoke-virtual {v2, v3}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 2026
    .line 2027
    .line 2028
    iput-boolean v5, v0, Li/d0;->k:Z

    .line 2029
    .line 2030
    iput-boolean v6, v0, Li/d0;->l:Z

    .line 2031
    .line 2032
    :cond_2d
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2033
    .line 2034
    return-object v0

    .line 2035
    :pswitch_18
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 2036
    .line 2037
    check-cast v0, Lf9/e;

    .line 2038
    .line 2039
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 2040
    .line 2041
    check-cast v2, Lf9/h;

    .line 2042
    .line 2043
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 2044
    .line 2045
    check-cast v3, Lf9/c;

    .line 2046
    .line 2047
    iget-object v7, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 2048
    .line 2049
    check-cast v7, Landroid/app/Activity;

    .line 2050
    .line 2051
    iget-object v0, v0, Lf9/e;->a:Lr8/g;

    .line 2052
    .line 2053
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 2054
    .line 2055
    iget-wide v8, v2, Lf9/h;->a:J

    .line 2056
    .line 2057
    iget-object v2, v3, Lf9/c;->b:Ljava/lang/Object;

    .line 2058
    .line 2059
    const-string v3, "Hchat_edit_message_backup"

    .line 2060
    .line 2061
    invoke-static {v0, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 2062
    .line 2063
    .line 2064
    move-result-object v10

    .line 2065
    invoke-static {v8, v9}, Lbe/h;->l(J)Ljava/lang/String;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v11

    .line 2069
    const-string v12, ""

    .line 2070
    .line 2071
    invoke-interface {v10, v11, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v10

    .line 2075
    if-eqz v10, :cond_32

    .line 2076
    .line 2077
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 2078
    .line 2079
    .line 2080
    move-result v11

    .line 2081
    if-lez v11, :cond_2e

    .line 2082
    .line 2083
    move-object v4, v10

    .line 2084
    :cond_2e
    if-eqz v4, :cond_32

    .line 2085
    .line 2086
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v10

    .line 2090
    if-eqz v10, :cond_31

    .line 2091
    .line 2092
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->m()Lk8/s;

    .line 2093
    .line 2094
    .line 2095
    move-result-object v10

    .line 2096
    if-eqz v10, :cond_31

    .line 2097
    .line 2098
    invoke-virtual {v10, v8, v9}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2099
    .line 2100
    .line 2101
    move-result-object v10

    .line 2102
    if-eqz v10, :cond_31

    .line 2103
    .line 2104
    iget-object v15, v10, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 2105
    .line 2106
    invoke-static {v10, v4, v2}, Lbe/h;->f0(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;Ljava/lang/Object;)Lf9/f;

    .line 2107
    .line 2108
    .line 2109
    move-result-object v2

    .line 2110
    iget-boolean v11, v2, Lf9/f;->a:Z

    .line 2111
    .line 2112
    if-eqz v11, :cond_2f

    .line 2113
    .line 2114
    invoke-static {v10, v4}, Lbe/h;->a0(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)V

    .line 2115
    .line 2116
    .line 2117
    invoke-static {v0, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v0

    .line 2121
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2122
    .line 2123
    .line 2124
    move-result-object v0

    .line 2125
    invoke-static {v8, v9}, Lbe/h;->l(J)Ljava/lang/String;

    .line 2126
    .line 2127
    .line 2128
    move-result-object v3

    .line 2129
    invoke-interface {v0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v0

    .line 2133
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2134
    .line 2135
    .line 2136
    :cond_2f
    new-instance v12, Lf9/g;

    .line 2137
    .line 2138
    iget-boolean v0, v2, Lf9/f;->a:Z

    .line 2139
    .line 2140
    if-eqz v0, :cond_30

    .line 2141
    .line 2142
    iget-boolean v2, v2, Lf9/f;->b:Z

    .line 2143
    .line 2144
    if-nez v2, :cond_30

    .line 2145
    .line 2146
    move/from16 v20, v6

    .line 2147
    .line 2148
    goto :goto_1b

    .line 2149
    :cond_30
    move/from16 v20, v5

    .line 2150
    .line 2151
    :goto_1b
    iget-wide v13, v10, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 2152
    .line 2153
    invoke-virtual {v10}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 2154
    .line 2155
    .line 2156
    move-result v21

    .line 2157
    invoke-static {v10, v15}, Lbe/h;->s(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 2158
    .line 2159
    .line 2160
    move-result-object v17

    .line 2161
    invoke-static {v10, v4}, Lbe/h;->s(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 2162
    .line 2163
    .line 2164
    move-result-object v18

    .line 2165
    move/from16 v19, v0

    .line 2166
    .line 2167
    move-object/from16 v16, v4

    .line 2168
    .line 2169
    invoke-direct/range {v12 .. v21}, Lf9/g;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 2170
    .line 2171
    .line 2172
    goto :goto_1c

    .line 2173
    :cond_31
    new-instance v12, Lf9/g;

    .line 2174
    .line 2175
    invoke-direct {v12}, Lf9/g;-><init>()V

    .line 2176
    .line 2177
    .line 2178
    goto :goto_1c

    .line 2179
    :cond_32
    new-instance v12, Lf9/g;

    .line 2180
    .line 2181
    invoke-direct {v12}, Lf9/g;-><init>()V

    .line 2182
    .line 2183
    .line 2184
    :goto_1c
    iget-boolean v0, v12, Lf9/g;->a:Z

    .line 2185
    .line 2186
    if-nez v0, :cond_33

    .line 2187
    .line 2188
    const-string v2, "\u6ca1\u6709\u53ef\u6062\u590d\u5185\u5bb9"

    .line 2189
    .line 2190
    goto :goto_1d

    .line 2191
    :cond_33
    iget-boolean v2, v12, Lf9/g;->b:Z

    .line 2192
    .line 2193
    if-eqz v2, :cond_34

    .line 2194
    .line 2195
    const-string v2, "\u5df2\u6062\u590d\uff0c\u9000\u51fa\u91cd\u8fdb\u804a\u5929\u540e\u751f\u6548"

    .line 2196
    .line 2197
    goto :goto_1d

    .line 2198
    :cond_34
    const-string v2, "\u5df2\u6062\u590d"

    .line 2199
    .line 2200
    :goto_1d
    invoke-static {v7, v2}, Lf9/e;->d(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2201
    .line 2202
    .line 2203
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2204
    .line 2205
    .line 2206
    move-result-object v0

    .line 2207
    return-object v0

    .line 2208
    :pswitch_19
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 2209
    .line 2210
    check-cast v0, Ljava/util/function/Consumer;

    .line 2211
    .line 2212
    iget-object v2, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 2213
    .line 2214
    check-cast v2, Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 2215
    .line 2216
    iget-object v3, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 2217
    .line 2218
    check-cast v3, Ljava/util/List;

    .line 2219
    .line 2220
    iget-object v4, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 2221
    .line 2222
    check-cast v4, Ljava/lang/String;

    .line 2223
    .line 2224
    invoke-static {v0, v2, v3, v4}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->E(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/List;Ljava/lang/String;)Lsf/n;

    .line 2225
    .line 2226
    .line 2227
    move-result-object v0

    .line 2228
    return-object v0

    .line 2229
    :pswitch_1a
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 2230
    .line 2231
    check-cast v0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 2232
    .line 2233
    iget-object v2, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 2234
    .line 2235
    check-cast v2, Landroid/view/View;

    .line 2236
    .line 2237
    iget-object v3, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 2238
    .line 2239
    check-cast v3, Ljava/util/Map;

    .line 2240
    .line 2241
    iget-object v4, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 2242
    .line 2243
    check-cast v4, Ljava/lang/String;

    .line 2244
    .line 2245
    invoke-static {v0, v2, v3, v4}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->r(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Landroid/view/View;Ljava/util/Map;Ljava/lang/String;)Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;

    .line 2246
    .line 2247
    .line 2248
    move-result-object v0

    .line 2249
    return-object v0

    .line 2250
    :pswitch_1b
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 2251
    .line 2252
    check-cast v0, Lfg/a;

    .line 2253
    .line 2254
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 2255
    .line 2256
    move-object v8, v2

    .line 2257
    check-cast v8, Landroid/app/Activity;

    .line 2258
    .line 2259
    iget-object v2, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 2260
    .line 2261
    check-cast v2, Lfg/a;

    .line 2262
    .line 2263
    iget-object v3, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 2264
    .line 2265
    check-cast v3, Lfg/a;

    .line 2266
    .line 2267
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 2268
    .line 2269
    .line 2270
    sget-object v7, Lc9/e;->a:Lc9/e;

    .line 2271
    .line 2272
    new-instance v11, Lb0/s;

    .line 2273
    .line 2274
    const/4 v0, 0x3

    .line 2275
    invoke-direct {v11, v2, v8, v3, v0}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 2276
    .line 2277
    .line 2278
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2279
    .line 2280
    .line 2281
    new-instance v10, Landroid/content/Intent;

    .line 2282
    .line 2283
    const-string v0, "android.intent.action.OPEN_DOCUMENT"

    .line 2284
    .line 2285
    invoke-direct {v10, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2286
    .line 2287
    .line 2288
    const-string v0, "android.intent.category.OPENABLE"

    .line 2289
    .line 2290
    invoke-virtual {v10, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 2291
    .line 2292
    .line 2293
    const-string v0, "application/json"

    .line 2294
    .line 2295
    invoke-virtual {v10, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 2296
    .line 2297
    .line 2298
    invoke-virtual {v10, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 2299
    .line 2300
    .line 2301
    invoke-static {v8, v10}, Lc9/e;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 2302
    .line 2303
    .line 2304
    sget-object v9, Lc9/c;->b:Lc9/c;

    .line 2305
    .line 2306
    new-instance v12, Lbi/c;

    .line 2307
    .line 2308
    const/4 v0, 0x5

    .line 2309
    invoke-direct {v12, v0}, Lbi/c;-><init>(I)V

    .line 2310
    .line 2311
    .line 2312
    invoke-virtual/range {v7 .. v12}, Lc9/e;->a(Landroid/app/Activity;Lc9/o2;Landroid/content/Intent;Lfg/l;Lbi/c;)V

    .line 2313
    .line 2314
    .line 2315
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2316
    .line 2317
    return-object v0

    .line 2318
    :pswitch_1c
    iget-object v0, v1, Lc9/n0;->h:Ljava/lang/Object;

    .line 2319
    .line 2320
    check-cast v0, Lc9/o2;

    .line 2321
    .line 2322
    iget-object v2, v1, Lc9/n0;->i:Ljava/lang/Object;

    .line 2323
    .line 2324
    check-cast v2, Ljava/lang/String;

    .line 2325
    .line 2326
    iget-object v3, v1, Lc9/n0;->j:Ljava/lang/Object;

    .line 2327
    .line 2328
    check-cast v3, Lc9/c1;

    .line 2329
    .line 2330
    iget-object v3, v3, Lc9/c1;->a:Ljava/lang/String;

    .line 2331
    .line 2332
    iget-object v5, v1, Lc9/n0;->k:Ljava/lang/Object;

    .line 2333
    .line 2334
    check-cast v5, Lfg/l;

    .line 2335
    .line 2336
    instance-of v0, v0, Lc9/f1;

    .line 2337
    .line 2338
    if-eqz v0, :cond_35

    .line 2339
    .line 2340
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2341
    .line 2342
    .line 2343
    move-result v0

    .line 2344
    if-eqz v0, :cond_35

    .line 2345
    .line 2346
    invoke-interface {v5, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2347
    .line 2348
    .line 2349
    goto :goto_1e

    .line 2350
    :cond_35
    invoke-interface {v5, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2351
    .line 2352
    .line 2353
    :goto_1e
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2354
    .line 2355
    return-object v0

    .line 2356
    nop

    .line 2357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
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
