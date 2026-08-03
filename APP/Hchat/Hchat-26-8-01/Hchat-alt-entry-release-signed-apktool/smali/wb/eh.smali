.class public final synthetic Lwb/eh;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 18
    iput p6, p0, Lwb/eh;->g:I

    iput-object p1, p0, Lwb/eh;->h:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/eh;->i:Li0/a1;

    iput-object p3, p0, Lwb/eh;->j:Li0/a1;

    iput-object p4, p0, Lwb/eh;->k:Li0/a1;

    iput-object p5, p0, Lwb/eh;->l:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Li0/a1;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/eh;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/eh;->i:Li0/a1;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/eh;->j:Li0/a1;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/eh;->h:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/eh;->k:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/eh;->l:Li0/a1;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;Landroid/content/SharedPreferences;Li0/a1;)V
    .locals 1

    .line 19
    const/4 v0, 0x5

    iput v0, p0, Lwb/eh;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/eh;->i:Li0/a1;

    iput-object p2, p0, Lwb/eh;->j:Li0/a1;

    iput-object p3, p0, Lwb/eh;->k:Li0/a1;

    iput-object p4, p0, Lwb/eh;->h:Landroid/content/SharedPreferences;

    iput-object p5, p0, Lwb/eh;->l:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/eh;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lwb/ho;->y6(Ljava/lang/String;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/lang/Iterable;

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iget-object v4, p0, Lwb/eh;->i:Li0/a1;

    .line 35
    .line 36
    iget-object v3, p0, Lwb/eh;->j:Li0/a1;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v5, 0x1

    .line 40
    if-eqz v1, :cond_4

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    move-object v7, v1

    .line 47
    check-cast v7, Ljava/lang/String;

    .line 48
    .line 49
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    move-object v6, v4

    .line 70
    check-cast v6, Lua/h;

    .line 71
    .line 72
    iget-object v6, v6, Lua/h;->b:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_0

    .line 79
    .line 80
    move-object v2, v4

    .line 81
    :cond_1
    check-cast v2, Lua/h;

    .line 82
    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_2
    new-instance v6, Lua/h;

    .line 87
    .line 88
    invoke-static {v7}, Lwb/ho;->k7(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-ne v1, v5, :cond_3

    .line 103
    .line 104
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, Ljava/util/List;

    .line 109
    .line 110
    invoke-static {v1}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Lua/i;

    .line 115
    .line 116
    iget-object v1, v1, Lua/i;->a:Ljava/lang/String;

    .line 117
    .line 118
    :goto_1
    move-object v10, v1

    .line 119
    goto :goto_2

    .line 120
    :cond_3
    const-string v1, ""

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :goto_2
    const/4 v11, 0x0

    .line 124
    move-object v8, v7

    .line 125
    invoke-direct/range {v6 .. v11}, Lua/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 126
    .line 127
    .line 128
    move-object v2, v6

    .line 129
    :goto_3
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-ne p1, v5, :cond_a

    .line 138
    .line 139
    invoke-static {v0}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, Lua/h;

    .line 144
    .line 145
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Ljava/util/List;

    .line 150
    .line 151
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    const/4 v1, 0x0

    .line 156
    move v3, v1

    .line 157
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    if-eqz v6, :cond_6

    .line 162
    .line 163
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    check-cast v6, Lua/h;

    .line 168
    .line 169
    iget-object v6, v6, Lua/h;->b:Ljava/lang/String;

    .line 170
    .line 171
    iget-object v7, p1, Lua/h;->b:Ljava/lang/String;

    .line 172
    .line 173
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-eqz v6, :cond_5

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_6
    const/4 v3, -0x1

    .line 184
    :goto_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    if-ltz v3, :cond_7

    .line 189
    .line 190
    move-object v2, v0

    .line 191
    :cond_7
    if-eqz v2, :cond_8

    .line 192
    .line 193
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    goto :goto_6

    .line 198
    :cond_8
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Ljava/util/List;

    .line 203
    .line 204
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    :goto_6
    if-ltz v3, :cond_9

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_9
    move v5, v1

    .line 212
    :goto_7
    new-instance v1, Lwb/mu;

    .line 213
    .line 214
    invoke-direct {v1, v0, p1, v5}, Lwb/mu;-><init>(ILua/h;Z)V

    .line 215
    .line 216
    .line 217
    iget-object p1, p0, Lwb/eh;->k:Li0/a1;

    .line 218
    .line 219
    invoke-interface {p1, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    goto :goto_8

    .line 223
    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    if-nez p1, :cond_b

    .line 228
    .line 229
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    check-cast p1, Ljava/util/List;

    .line 234
    .line 235
    invoke-static {p1, v0}, Lwb/ho;->u7(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-interface {v4, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    move-object v7, p1

    .line 247
    check-cast v7, Ljava/util/List;

    .line 248
    .line 249
    const/4 v8, 0x0

    .line 250
    const/16 v9, 0x50

    .line 251
    .line 252
    iget-object v2, p0, Lwb/eh;->h:Landroid/content/SharedPreferences;

    .line 253
    .line 254
    iget-object v5, p0, Lwb/eh;->l:Li0/a1;

    .line 255
    .line 256
    const/4 v6, 0x0

    .line 257
    invoke-static/range {v2 .. v9}, Lwb/ho;->J(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;I)V

    .line 258
    .line 259
    .line 260
    :cond_b
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 261
    .line 262
    return-object p1

    .line 263
    :pswitch_0
    check-cast p1, Lr/h;

    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    sget-object v0, Lwb/p0;->G:Ls0/d;

    .line 269
    .line 270
    const/4 v1, 0x0

    .line 271
    const/4 v2, 0x3

    .line 272
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 273
    .line 274
    .line 275
    new-instance v3, Lwb/bb;

    .line 276
    .line 277
    const/4 v9, 0x0

    .line 278
    iget-object v4, p0, Lwb/eh;->h:Landroid/content/SharedPreferences;

    .line 279
    .line 280
    iget-object v5, p0, Lwb/eh;->i:Li0/a1;

    .line 281
    .line 282
    iget-object v6, p0, Lwb/eh;->j:Li0/a1;

    .line 283
    .line 284
    iget-object v7, p0, Lwb/eh;->k:Li0/a1;

    .line 285
    .line 286
    iget-object v8, p0, Lwb/eh;->l:Li0/a1;

    .line 287
    .line 288
    invoke-direct/range {v3 .. v9}, Lwb/bb;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 289
    .line 290
    .line 291
    new-instance v0, Ls0/d;

    .line 292
    .line 293
    const v4, 0x7ee6c45b

    .line 294
    .line 295
    .line 296
    const/4 v5, 0x1

    .line 297
    invoke-direct {v0, v4, v3, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 298
    .line 299
    .line 300
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 301
    .line 302
    .line 303
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 304
    .line 305
    return-object p1

    .line 306
    :pswitch_1
    check-cast p1, Lr/h;

    .line 307
    .line 308
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    sget-object v0, Lwb/p0;->h0:Ls0/d;

    .line 312
    .line 313
    const/4 v1, 0x0

    .line 314
    const/4 v2, 0x3

    .line 315
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 316
    .line 317
    .line 318
    new-instance v3, Lwb/bb;

    .line 319
    .line 320
    const/4 v9, 0x5

    .line 321
    iget-object v4, p0, Lwb/eh;->h:Landroid/content/SharedPreferences;

    .line 322
    .line 323
    iget-object v5, p0, Lwb/eh;->i:Li0/a1;

    .line 324
    .line 325
    iget-object v6, p0, Lwb/eh;->j:Li0/a1;

    .line 326
    .line 327
    iget-object v7, p0, Lwb/eh;->k:Li0/a1;

    .line 328
    .line 329
    iget-object v8, p0, Lwb/eh;->l:Li0/a1;

    .line 330
    .line 331
    invoke-direct/range {v3 .. v9}, Lwb/bb;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 332
    .line 333
    .line 334
    new-instance v0, Ls0/d;

    .line 335
    .line 336
    const v4, -0x2cb7ca60

    .line 337
    .line 338
    .line 339
    const/4 v5, 0x1

    .line 340
    invoke-direct {v0, v4, v3, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 341
    .line 342
    .line 343
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 344
    .line 345
    .line 346
    goto :goto_9

    .line 347
    :pswitch_2
    check-cast p1, Lr/h;

    .line 348
    .line 349
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    sget-object v0, Lwb/p0;->z2:Ls0/d;

    .line 353
    .line 354
    const/4 v1, 0x0

    .line 355
    const/4 v2, 0x3

    .line 356
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 357
    .line 358
    .line 359
    new-instance v0, Lwb/t7;

    .line 360
    .line 361
    const/4 v3, 0x6

    .line 362
    iget-object v4, p0, Lwb/eh;->h:Landroid/content/SharedPreferences;

    .line 363
    .line 364
    iget-object v5, p0, Lwb/eh;->i:Li0/a1;

    .line 365
    .line 366
    iget-object v6, p0, Lwb/eh;->j:Li0/a1;

    .line 367
    .line 368
    invoke-direct {v0, v4, v5, v6, v3}, Lwb/t7;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 369
    .line 370
    .line 371
    new-instance v3, Ls0/d;

    .line 372
    .line 373
    const v6, -0x19878dc9

    .line 374
    .line 375
    .line 376
    const/4 v7, 0x1

    .line 377
    invoke-direct {v3, v6, v0, v7}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 378
    .line 379
    .line 380
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 381
    .line 382
    .line 383
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    check-cast v0, Ljava/lang/Boolean;

    .line 388
    .line 389
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-eqz v0, :cond_c

    .line 394
    .line 395
    sget-object v0, Lwb/p0;->A2:Ls0/d;

    .line 396
    .line 397
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 398
    .line 399
    .line 400
    new-instance v0, Lwb/t7;

    .line 401
    .line 402
    const/4 v3, 0x7

    .line 403
    iget-object v5, p0, Lwb/eh;->k:Li0/a1;

    .line 404
    .line 405
    iget-object v6, p0, Lwb/eh;->l:Li0/a1;

    .line 406
    .line 407
    invoke-direct {v0, v4, v5, v6, v3}, Lwb/t7;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 408
    .line 409
    .line 410
    new-instance v3, Ls0/d;

    .line 411
    .line 412
    const v4, 0x2fb8e512

    .line 413
    .line 414
    .line 415
    invoke-direct {v3, v4, v0, v7}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 416
    .line 417
    .line 418
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 419
    .line 420
    .line 421
    :cond_c
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 422
    .line 423
    return-object p1

    .line 424
    :pswitch_3
    check-cast p1, Lr/h;

    .line 425
    .line 426
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    sget-object v0, Lwb/p0;->E2:Ls0/d;

    .line 430
    .line 431
    const/4 v1, 0x0

    .line 432
    const/4 v2, 0x3

    .line 433
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 434
    .line 435
    .line 436
    new-instance v0, Lwb/r6;

    .line 437
    .line 438
    const/4 v3, 0x6

    .line 439
    iget-object v4, p0, Lwb/eh;->h:Landroid/content/SharedPreferences;

    .line 440
    .line 441
    invoke-direct {v0, v4, v3}, Lwb/r6;-><init>(Landroid/content/SharedPreferences;I)V

    .line 442
    .line 443
    .line 444
    new-instance v3, Ls0/d;

    .line 445
    .line 446
    const v4, 0x231952be

    .line 447
    .line 448
    .line 449
    const/4 v5, 0x1

    .line 450
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 451
    .line 452
    .line 453
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 454
    .line 455
    .line 456
    sget-object v0, Lwb/p0;->F2:Ls0/d;

    .line 457
    .line 458
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 459
    .line 460
    .line 461
    new-instance v6, Lwb/f8;

    .line 462
    .line 463
    const/4 v11, 0x0

    .line 464
    iget-object v7, p0, Lwb/eh;->i:Li0/a1;

    .line 465
    .line 466
    iget-object v8, p0, Lwb/eh;->j:Li0/a1;

    .line 467
    .line 468
    iget-object v9, p0, Lwb/eh;->k:Li0/a1;

    .line 469
    .line 470
    iget-object v10, p0, Lwb/eh;->l:Li0/a1;

    .line 471
    .line 472
    invoke-direct/range {v6 .. v11}, Lwb/f8;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 473
    .line 474
    .line 475
    new-instance v0, Ls0/d;

    .line 476
    .line 477
    const v3, 0x40e9cefc

    .line 478
    .line 479
    .line 480
    invoke-direct {v0, v3, v6, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 481
    .line 482
    .line 483
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 484
    .line 485
    .line 486
    goto/16 :goto_9

    .line 487
    .line 488
    :pswitch_4
    check-cast p1, Lwb/bp;

    .line 489
    .line 490
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    iget-object v1, p0, Lwb/eh;->i:Li0/a1;

    .line 494
    .line 495
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    check-cast v0, Ljava/util/List;

    .line 500
    .line 501
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    iget p1, p1, Lwb/bp;->b:I

    .line 506
    .line 507
    if-ltz p1, :cond_d

    .line 508
    .line 509
    if-ge p1, v0, :cond_d

    .line 510
    .line 511
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    check-cast v0, Ljava/util/List;

    .line 516
    .line 517
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object p1

    .line 521
    check-cast p1, Lna/j;

    .line 522
    .line 523
    iget-object p1, p1, Lna/j;->a:Ljava/lang/String;

    .line 524
    .line 525
    :goto_a
    move-object v6, p1

    .line 526
    goto :goto_b

    .line 527
    :cond_d
    const-string p1, ""

    .line 528
    .line 529
    goto :goto_a

    .line 530
    :goto_b
    iget-object v3, p0, Lwb/eh;->j:Li0/a1;

    .line 531
    .line 532
    invoke-interface {v3, v6}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 533
    .line 534
    .line 535
    const/4 v5, 0x0

    .line 536
    const/16 v7, 0x30

    .line 537
    .line 538
    iget-object v0, p0, Lwb/eh;->h:Landroid/content/SharedPreferences;

    .line 539
    .line 540
    iget-object v2, p0, Lwb/eh;->k:Li0/a1;

    .line 541
    .line 542
    const/4 v4, 0x0

    .line 543
    invoke-static/range {v0 .. v7}, Lwb/ho;->Y2(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;I)V

    .line 544
    .line 545
    .line 546
    const/4 p1, 0x0

    .line 547
    iget-object v0, p0, Lwb/eh;->l:Li0/a1;

    .line 548
    .line 549
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    goto/16 :goto_9

    .line 553
    .line 554
    nop

    .line 555
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
