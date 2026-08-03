.class public final synthetic Lwb/aa;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ILandroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 18
    iput p1, p0, Lwb/aa;->g:I

    iput-object p2, p0, Lwb/aa;->i:Landroid/content/Context;

    iput-object p4, p0, Lwb/aa;->j:Li0/a1;

    iput-object p3, p0, Lwb/aa;->h:Landroid/content/SharedPreferences;

    iput-object p5, p0, Lwb/aa;->k:Li0/a1;

    iput-object p6, p0, Lwb/aa;->l:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/aa;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/aa;->i:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/aa;->h:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/aa;->j:Li0/a1;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/aa;->k:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/aa;->l:Li0/a1;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 19
    const/4 v0, 0x1

    iput v0, p0, Lwb/aa;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/aa;->h:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/aa;->i:Landroid/content/Context;

    iput-object p3, p0, Lwb/aa;->j:Li0/a1;

    iput-object p4, p0, Lwb/aa;->k:Li0/a1;

    iput-object p5, p0, Lwb/aa;->l:Li0/a1;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Landroid/content/Context;Li0/a1;)V
    .locals 1

    .line 20
    const/4 v0, 0x3

    iput v0, p0, Lwb/aa;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/aa;->h:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/aa;->j:Li0/a1;

    iput-object p3, p0, Lwb/aa;->k:Li0/a1;

    iput-object p4, p0, Lwb/aa;->i:Landroid/content/Context;

    iput-object p5, p0, Lwb/aa;->l:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/aa;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lna/i;

    .line 31
    .line 32
    iget-object v2, v2, Lna/i;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v5, p0, Lwb/aa;->j:Li0/a1;

    .line 39
    .line 40
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/util/List;

    .line 45
    .line 46
    new-instance v8, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    move-object v3, v2

    .line 66
    check-cast v3, Lna/i;

    .line 67
    .line 68
    iget-object v3, v3, Lna/i;->a:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_1

    .line 75
    .line 76
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    invoke-interface {v5, v8}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    const/4 v9, 0x0

    .line 84
    const/16 v10, 0x50

    .line 85
    .line 86
    iget-object v3, p0, Lwb/aa;->h:Landroid/content/SharedPreferences;

    .line 87
    .line 88
    iget-object v4, p0, Lwb/aa;->k:Li0/a1;

    .line 89
    .line 90
    iget-object v6, p0, Lwb/aa;->l:Li0/a1;

    .line 91
    .line 92
    const/4 v7, 0x0

    .line 93
    invoke-static/range {v3 .. v10}, Lwb/ho;->Y2(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;I)V

    .line 94
    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    const-string v0, " \u4e2a\u9002\u7528\u804a\u5929"

    .line 101
    .line 102
    :goto_2
    const/4 v1, 0x0

    .line 103
    const-string v2, "\u5df2\u5220\u9664 "

    .line 104
    .line 105
    iget-object v3, p0, Lwb/aa;->i:Landroid/content/Context;

    .line 106
    .line 107
    invoke-static {v2, p1, v0, v3, v1}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 108
    .line 109
    .line 110
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 111
    .line 112
    return-object p1

    .line 113
    :pswitch_0
    check-cast p1, Lr/h;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    sget-object v0, Lwb/p0;->B2:Ls0/d;

    .line 119
    .line 120
    const/4 v1, 0x0

    .line 121
    const/4 v2, 0x3

    .line 122
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 123
    .line 124
    .line 125
    new-instance v0, Lwb/t7;

    .line 126
    .line 127
    const/16 v3, 0xc

    .line 128
    .line 129
    iget-object v4, p0, Lwb/aa;->h:Landroid/content/SharedPreferences;

    .line 130
    .line 131
    iget-object v5, p0, Lwb/aa;->j:Li0/a1;

    .line 132
    .line 133
    iget-object v6, p0, Lwb/aa;->k:Li0/a1;

    .line 134
    .line 135
    invoke-direct {v0, v4, v5, v6, v3}, Lwb/t7;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 136
    .line 137
    .line 138
    new-instance v3, Ls0/d;

    .line 139
    .line 140
    const v4, -0x557ce228

    .line 141
    .line 142
    .line 143
    const/4 v7, 0x1

    .line 144
    invoke-direct {v3, v4, v0, v7}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 145
    .line 146
    .line 147
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Ljava/lang/Boolean;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_7

    .line 161
    .line 162
    sget-object v0, Lwb/p0;->C2:Ls0/d;

    .line 163
    .line 164
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 165
    .line 166
    .line 167
    new-instance v0, Lwb/oa;

    .line 168
    .line 169
    const/4 v3, 0x4

    .line 170
    iget-object v4, p0, Lwb/aa;->i:Landroid/content/Context;

    .line 171
    .line 172
    iget-object v5, p0, Lwb/aa;->l:Li0/a1;

    .line 173
    .line 174
    invoke-direct {v0, v4, v5, v3}, Lwb/oa;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 175
    .line 176
    .line 177
    new-instance v3, Ls0/d;

    .line 178
    .line 179
    const v8, -0x59b754cd

    .line 180
    .line 181
    .line 182
    invoke-direct {v3, v8, v0, v7}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 183
    .line 184
    .line 185
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 186
    .line 187
    .line 188
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, Ljava/lang/Boolean;

    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_3

    .line 199
    .line 200
    sget-object v0, Lwb/p0;->D2:Ls0/d;

    .line 201
    .line 202
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 203
    .line 204
    .line 205
    new-instance v0, Lwb/oa;

    .line 206
    .line 207
    const/4 v3, 0x5

    .line 208
    invoke-direct {v0, v4, v5, v3}, Lwb/oa;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 209
    .line 210
    .line 211
    new-instance v3, Ls0/d;

    .line 212
    .line 213
    const v8, 0x538d82ce

    .line 214
    .line 215
    .line 216
    invoke-direct {v3, v8, v0, v7}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 217
    .line 218
    .line 219
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 220
    .line 221
    .line 222
    :cond_3
    invoke-static {}, Lba/a;->values()[Lba/a;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    new-instance v3, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 229
    .line 230
    .line 231
    array-length v8, v0

    .line 232
    const/4 v9, 0x0

    .line 233
    :goto_3
    if-ge v9, v8, :cond_5

    .line 234
    .line 235
    aget-object v10, v0, v9

    .line 236
    .line 237
    sget-object v11, Lba/a;->h:Lba/a;

    .line 238
    .line 239
    if-eq v10, v11, :cond_4

    .line 240
    .line 241
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    :cond_6
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    if-eqz v3, :cond_7

    .line 256
    .line 257
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    check-cast v3, Lba/a;

    .line 262
    .line 263
    new-instance v8, Lf0/h;

    .line 264
    .line 265
    const/16 v9, 0xc

    .line 266
    .line 267
    invoke-direct {v8, v3, v9}, Lf0/h;-><init>(Ljava/lang/Object;I)V

    .line 268
    .line 269
    .line 270
    new-instance v9, Ls0/d;

    .line 271
    .line 272
    const v10, -0x2d334434

    .line 273
    .line 274
    .line 275
    invoke-direct {v9, v10, v8, v7}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 276
    .line 277
    .line 278
    invoke-static {p1, v1, v9, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 279
    .line 280
    .line 281
    new-instance v8, Lwb/zm;

    .line 282
    .line 283
    const/4 v9, 0x0

    .line 284
    invoke-direct {v8, v3, v4, v5, v9}, Lwb/zm;-><init>(Lba/a;Landroid/content/Context;Li0/a1;I)V

    .line 285
    .line 286
    .line 287
    new-instance v9, Ls0/d;

    .line 288
    .line 289
    const v10, -0x6e08e4bd

    .line 290
    .line 291
    .line 292
    invoke-direct {v9, v10, v8, v7}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 293
    .line 294
    .line 295
    invoke-static {p1, v1, v9, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 296
    .line 297
    .line 298
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    check-cast v8, Ljava/lang/Boolean;

    .line 303
    .line 304
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    if-eqz v8, :cond_6

    .line 309
    .line 310
    new-instance v8, Lwb/zm;

    .line 311
    .line 312
    const/4 v9, 0x1

    .line 313
    invoke-direct {v8, v3, v4, v5, v9}, Lwb/zm;-><init>(Lba/a;Landroid/content/Context;Li0/a1;I)V

    .line 314
    .line 315
    .line 316
    new-instance v3, Ls0/d;

    .line 317
    .line 318
    const v9, -0x380a8b99

    .line 319
    .line 320
    .line 321
    invoke-direct {v3, v9, v8, v7}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 322
    .line 323
    .line 324
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 325
    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 329
    .line 330
    return-object p1

    .line 331
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 332
    .line 333
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    new-instance v0, Ljava/util/HashSet;

    .line 337
    .line 338
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 339
    .line 340
    .line 341
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    if-eqz v2, :cond_8

    .line 350
    .line 351
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    check-cast v2, Lua/h;

    .line 356
    .line 357
    iget-object v2, v2, Lua/h;->a:Ljava/lang/String;

    .line 358
    .line 359
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    goto :goto_5

    .line 363
    :cond_8
    iget-object v5, p0, Lwb/aa;->j:Li0/a1;

    .line 364
    .line 365
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    check-cast v1, Ljava/util/List;

    .line 370
    .line 371
    new-instance v2, Ljava/util/ArrayList;

    .line 372
    .line 373
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 374
    .line 375
    .line 376
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    :cond_9
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    if-eqz v3, :cond_a

    .line 385
    .line 386
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    move-object v4, v3

    .line 391
    check-cast v4, Lua/h;

    .line 392
    .line 393
    iget-object v4, v4, Lua/h;->a:Ljava/lang/String;

    .line 394
    .line 395
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v4

    .line 399
    if-nez v4, :cond_9

    .line 400
    .line 401
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    goto :goto_6

    .line 405
    :cond_a
    invoke-interface {v5, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    move-object v8, v0

    .line 413
    check-cast v8, Ljava/util/List;

    .line 414
    .line 415
    const/4 v9, 0x0

    .line 416
    const/16 v10, 0x50

    .line 417
    .line 418
    iget-object v3, p0, Lwb/aa;->h:Landroid/content/SharedPreferences;

    .line 419
    .line 420
    iget-object v4, p0, Lwb/aa;->k:Li0/a1;

    .line 421
    .line 422
    iget-object v6, p0, Lwb/aa;->l:Li0/a1;

    .line 423
    .line 424
    const/4 v7, 0x0

    .line 425
    invoke-static/range {v3 .. v10}, Lwb/ho;->J(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;I)V

    .line 426
    .line 427
    .line 428
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 429
    .line 430
    .line 431
    move-result p1

    .line 432
    const-string v0, " \u4e2a\u9002\u7528\u804a\u5929"

    .line 433
    .line 434
    goto/16 :goto_2

    .line 435
    .line 436
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 437
    .line 438
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    iget-object v1, p0, Lwb/aa;->j:Li0/a1;

    .line 443
    .line 444
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    iget-object p1, p0, Lwb/aa;->k:Li0/a1;

    .line 448
    .line 449
    const-string v1, ""

    .line 450
    .line 451
    invoke-interface {p1, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    iget-object v2, p0, Lwb/aa;->h:Landroid/content/SharedPreferences;

    .line 455
    .line 456
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    const-string v4, "hb_notify_sound_mode"

    .line 461
    .line 462
    invoke-interface {v3, v4, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    const-string v4, "hb_notify_sound_uri"

    .line 467
    .line 468
    invoke-interface {v3, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 473
    .line 474
    .line 475
    iget-object v1, p0, Lwb/aa;->l:Li0/a1;

    .line 476
    .line 477
    const/4 v3, 0x0

    .line 478
    invoke-interface {v1, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    iget-object v1, p0, Lwb/aa;->i:Landroid/content/Context;

    .line 482
    .line 483
    instance-of v4, v1, Landroid/app/Activity;

    .line 484
    .line 485
    if-eqz v4, :cond_b

    .line 486
    .line 487
    move-object v3, v1

    .line 488
    check-cast v3, Landroid/app/Activity;

    .line 489
    .line 490
    :cond_b
    if-nez v3, :cond_c

    .line 491
    .line 492
    const-string p1, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u94c3\u58f0\u9009\u62e9\u5668"

    .line 493
    .line 494
    const/4 v0, 0x0

    .line 495
    invoke-static {v1, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 500
    .line 501
    .line 502
    goto :goto_7

    .line 503
    :cond_c
    new-instance v4, Lca/k;

    .line 504
    .line 505
    invoke-direct {v4, v2, v1, p1, v0}, Lca/k;-><init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;I)V

    .line 506
    .line 507
    .line 508
    const/4 v1, 0x1

    .line 509
    if-ne v0, v1, :cond_d

    .line 510
    .line 511
    sget-object p1, Lwb/vq;->a:Lwb/vq;

    .line 512
    .line 513
    invoke-virtual {p1, v3, v4}, Lwb/vq;->c(Landroid/app/Activity;Lfg/l;)V

    .line 514
    .line 515
    .line 516
    goto :goto_7

    .line 517
    :cond_d
    sget-object v0, Lwb/vq;->a:Lwb/vq;

    .line 518
    .line 519
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object p1

    .line 523
    check-cast p1, Ljava/lang/String;

    .line 524
    .line 525
    invoke-virtual {v0, v3, p1, v4}, Lwb/vq;->d(Landroid/app/Activity;Ljava/lang/String;Lfg/l;)V

    .line 526
    .line 527
    .line 528
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 529
    .line 530
    return-object p1

    .line 531
    :pswitch_3
    check-cast p1, Li0/a0;

    .line 532
    .line 533
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 537
    .line 538
    new-instance v0, Lwb/id;

    .line 539
    .line 540
    const/4 v1, 0x0

    .line 541
    iget-object v2, p0, Lwb/aa;->i:Landroid/content/Context;

    .line 542
    .line 543
    iget-object v3, p0, Lwb/aa;->h:Landroid/content/SharedPreferences;

    .line 544
    .line 545
    iget-object v4, p0, Lwb/aa;->j:Li0/a1;

    .line 546
    .line 547
    iget-object v5, p0, Lwb/aa;->k:Li0/a1;

    .line 548
    .line 549
    iget-object v6, p0, Lwb/aa;->l:Li0/a1;

    .line 550
    .line 551
    invoke-direct/range {v0 .. v6}, Lwb/id;-><init>(ILandroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {p1, v2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->subscribePluginCatalog(Landroid/content/Context;Lfg/a;)Leb/b0;

    .line 555
    .line 556
    .line 557
    move-result-object p1

    .line 558
    new-instance v0, Lwb/bo;

    .line 559
    .line 560
    invoke-direct {v0, p1, v1}, Lwb/bo;-><init>(Leb/b0;I)V

    .line 561
    .line 562
    .line 563
    return-object v0

    .line 564
    nop

    .line 565
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
