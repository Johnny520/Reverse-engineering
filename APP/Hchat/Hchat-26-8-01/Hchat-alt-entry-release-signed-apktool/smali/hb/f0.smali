.class public final synthetic Lhb/f0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/app/Activity;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Lhb/i0;

.field public final synthetic k:Lb/e;


# direct methods
.method public synthetic constructor <init>(ILandroid/app/Activity;Lb/e;Lhb/i0;Ljava/util/List;)V
    .locals 0

    .line 16
    iput p1, p0, Lhb/f0;->g:I

    iput-object p2, p0, Lhb/f0;->h:Landroid/app/Activity;

    iput-object p4, p0, Lhb/f0;->j:Lhb/i0;

    iput-object p5, p0, Lhb/f0;->i:Ljava/util/List;

    iput-object p3, p0, Lhb/f0;->k:Lb/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/util/List;Lhb/i0;Lb/e;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lhb/f0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lhb/f0;->h:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lhb/f0;->i:Ljava/util/List;

    .line 10
    .line 11
    iput-object p3, p0, Lhb/f0;->j:Lhb/i0;

    .line 12
    .line 13
    iput-object p4, p0, Lhb/f0;->k:Lb/e;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lhb/f0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v5, p0, Lhb/f0;->h:Landroid/app/Activity;

    .line 7
    .line 8
    iget-object v2, p0, Lhb/f0;->j:Lhb/i0;

    .line 9
    .line 10
    iget-object v0, p0, Lhb/f0;->i:Ljava/util/List;

    .line 11
    .line 12
    iget-object v7, p0, Lhb/f0;->k:Lb/e;

    .line 13
    .line 14
    check-cast p1, Ljava/util/List;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v8, Lgg/u;

    .line 20
    .line 21
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 28
    .line 29
    .line 30
    const-string v4, "Hchat_selected_messages_config"

    .line 31
    .line 32
    invoke-static {v5, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const-string v6, "selected_messages_background_silent_send"

    .line 37
    .line 38
    invoke-interface {v4, v6, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    :goto_0
    move-object v4, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance v1, Lca/p;

    .line 48
    .line 49
    const/4 v4, 0x2

    .line 50
    invoke-direct {v1, v3, v8, v4}, Lca/p;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lgg/u;I)V

    .line 51
    .line 52
    .line 53
    const-string v4, "\u6a21\u5757\u7fa4\u53d1"

    .line 54
    .line 55
    const-string v6, "\u6b63\u5728\u53d1\u9001..."

    .line 56
    .line 57
    invoke-static {v5, v1, v4, v6}, Lwb/y2;->X1(Landroid/app/Activity;Lfg/a;Ljava/lang/String;Ljava/lang/String;)Lwb/kv;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    goto :goto_0

    .line 62
    :goto_1
    iget-object v9, v2, Lhb/i0;->g:Lhb/r;

    .line 63
    .line 64
    new-instance v10, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-direct {v10, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_1

    .line 82
    .line 83
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Lwb/jv;

    .line 88
    .line 89
    iget-object v1, v1, Lwb/jv;->a:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_1
    new-instance v1, Lhb/y;

    .line 96
    .line 97
    const/4 v6, 0x0

    .line 98
    invoke-direct/range {v1 .. v6}, Lhb/y;-><init>(Lhb/i0;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Landroid/app/Activity;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v9, v0, v10, v1}, Lhb/r;->g(Ljava/util/List;Ljava/util/List;Lfg/q;)Lhb/s;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput-object p1, v8, Lgg/u;->g:Ljava/lang/Object;

    .line 109
    .line 110
    if-nez p1, :cond_3

    .line 111
    .line 112
    const/4 p1, 0x1

    .line 113
    invoke-virtual {v3, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 114
    .line 115
    .line 116
    if-eqz v4, :cond_2

    .line 117
    .line 118
    invoke-interface {v4}, Lwb/kv;->close()V

    .line 119
    .line 120
    .line 121
    :cond_2
    const-string p1, "\u6a21\u5757\u7fa4\u53d1\u542f\u52a8\u5931\u8d25"

    .line 122
    .line 123
    invoke-virtual {v2, v5, p1}, Lhb/i0;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_3
    iget-object p1, v2, Lhb/i0;->b:Lab/b;

    .line 128
    .line 129
    invoke-virtual {v7, p1}, Lb/e;->r(Lfg/p;)V

    .line 130
    .line 131
    .line 132
    const-string p1, "\u5df2\u5f00\u59cb\u6a21\u5757\u7fa4\u53d1"

    .line 133
    .line 134
    invoke-virtual {v2, v5, p1}, Lhb/i0;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 138
    .line 139
    return-object p1

    .line 140
    :pswitch_0
    iget-object v4, p0, Lhb/f0;->h:Landroid/app/Activity;

    .line 141
    .line 142
    iget-object v1, p0, Lhb/f0;->j:Lhb/i0;

    .line 143
    .line 144
    iget-object v6, p0, Lhb/f0;->i:Ljava/util/List;

    .line 145
    .line 146
    iget-object v7, p0, Lhb/f0;->k:Lb/e;

    .line 147
    .line 148
    check-cast p1, Ljava/util/List;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    new-instance v8, Lgg/u;

    .line 154
    .line 155
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 156
    .line 157
    .line 158
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 159
    .line 160
    const/4 v0, 0x0

    .line 161
    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 162
    .line 163
    .line 164
    const-string v3, "Hchat_selected_messages_config"

    .line 165
    .line 166
    invoke-static {v4, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    const-string v5, "selected_messages_background_silent_send"

    .line 171
    .line 172
    invoke-interface {v3, v5, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_4

    .line 177
    .line 178
    const/4 v0, 0x0

    .line 179
    :goto_4
    move-object v3, v0

    .line 180
    goto :goto_5

    .line 181
    :cond_4
    new-instance v0, Lca/p;

    .line 182
    .line 183
    const/4 v3, 0x3

    .line 184
    invoke-direct {v0, v2, v8, v3}, Lca/p;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lgg/u;I)V

    .line 185
    .line 186
    .line 187
    const-string v3, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b"

    .line 188
    .line 189
    const-string v5, "\u6b63\u5728\u53d1\u9001..."

    .line 190
    .line 191
    invoke-static {v4, v0, v3, v5}, Lwb/y2;->X1(Landroid/app/Activity;Lfg/a;Ljava/lang/String;Ljava/lang/String;)Lwb/kv;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    goto :goto_4

    .line 196
    :goto_5
    iget-object v9, v1, Lhb/i0;->i:Lhb/k;

    .line 197
    .line 198
    new-instance v10, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 205
    .line 206
    .line 207
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_5

    .line 216
    .line 217
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    check-cast v0, Lwb/jv;

    .line 222
    .line 223
    iget-object v0, v0, Lwb/jv;->a:Ljava/lang/String;

    .line 224
    .line 225
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_5
    new-instance v0, Lhb/y;

    .line 230
    .line 231
    const/4 v5, 0x1

    .line 232
    invoke-direct/range {v0 .. v5}, Lhb/y;-><init>(Lhb/i0;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Landroid/app/Activity;I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v9, v6, v10, v0}, Lhb/k;->f(Ljava/util/List;Ljava/util/List;Lfg/q;)Lhb/s;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    iput-object p1, v8, Lgg/u;->g:Ljava/lang/Object;

    .line 240
    .line 241
    if-nez p1, :cond_7

    .line 242
    .line 243
    const/4 p1, 0x1

    .line 244
    invoke-virtual {v2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 245
    .line 246
    .line 247
    if-eqz v3, :cond_6

    .line 248
    .line 249
    invoke-interface {v3}, Lwb/kv;->close()V

    .line 250
    .line 251
    .line 252
    :cond_6
    const-string p1, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u542f\u52a8\u5931\u8d25"

    .line 253
    .line 254
    invoke-virtual {v1, v4, p1}, Lhb/i0;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_7
    iget-object p1, v1, Lhb/i0;->b:Lab/b;

    .line 259
    .line 260
    invoke-virtual {v7, p1}, Lb/e;->r(Lfg/p;)V

    .line 261
    .line 262
    .line 263
    const-string p1, "\u5df2\u5f00\u59cb\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1"

    .line 264
    .line 265
    invoke-virtual {v1, v4, p1}, Lhb/i0;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 269
    .line 270
    return-object p1

    .line 271
    :pswitch_1
    iget-object v1, p0, Lhb/f0;->h:Landroid/app/Activity;

    .line 272
    .line 273
    iget-object v5, p0, Lhb/f0;->i:Ljava/util/List;

    .line 274
    .line 275
    iget-object v0, p0, Lhb/f0;->j:Lhb/i0;

    .line 276
    .line 277
    iget-object v3, p0, Lhb/f0;->k:Lb/e;

    .line 278
    .line 279
    check-cast p1, Ljava/lang/Integer;

    .line 280
    .line 281
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_8

    .line 290
    .line 291
    goto/16 :goto_c

    .line 292
    .line 293
    :cond_8
    const/4 v2, 0x0

    .line 294
    const/4 v4, 0x1

    .line 295
    if-ne p1, v4, :cond_9

    .line 296
    .line 297
    move p1, v2

    .line 298
    move-object v2, v1

    .line 299
    move v1, v4

    .line 300
    goto :goto_8

    .line 301
    :cond_9
    move p1, v2

    .line 302
    move-object v2, v1

    .line 303
    move v1, p1

    .line 304
    :goto_8
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 305
    .line 306
    .line 307
    move-result v6

    .line 308
    if-eqz v6, :cond_a

    .line 309
    .line 310
    const-string v6, "\u8bf7\u9009\u62e9\u53d1\u9001\u5185\u5bb9"

    .line 311
    .line 312
    goto :goto_9

    .line 313
    :cond_a
    sget-object v6, La/a;->g:Lhb/k0;

    .line 314
    .line 315
    if-eqz v6, :cond_e

    .line 316
    .line 317
    if-eq v1, v4, :cond_b

    .line 318
    .line 319
    const/4 v6, 0x0

    .line 320
    goto :goto_9

    .line 321
    :cond_b
    iget-object v7, v6, Lhb/k0;->c:Lhb/k;

    .line 322
    .line 323
    invoke-virtual {v7}, Lhb/k;->g()Z

    .line 324
    .line 325
    .line 326
    move-result v7

    .line 327
    if-nez v7, :cond_c

    .line 328
    .line 329
    const-string v6, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u901a\u9053\u4e0d\u53ef\u7528"

    .line 330
    .line 331
    goto :goto_9

    .line 332
    :cond_c
    iget-object v7, v6, Lhb/k0;->c:Lhb/k;

    .line 333
    .line 334
    invoke-virtual {v7, v5}, Lhb/k;->o(Ljava/util/List;)Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v8

    .line 338
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 339
    .line 340
    .line 341
    move-result v7

    .line 342
    if-nez v7, :cond_d

    .line 343
    .line 344
    const/4 v12, 0x0

    .line 345
    const/16 v13, 0x3e

    .line 346
    .line 347
    const-string v9, "\u3001"

    .line 348
    .line 349
    const/4 v10, 0x0

    .line 350
    const/4 v11, 0x0

    .line 351
    invoke-static/range {v8 .. v13}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    const-string v7, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u4e0d\u652f\u6301: "

    .line 356
    .line 357
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    goto :goto_9

    .line 362
    :cond_d
    iget-object v6, v6, Lhb/k0;->c:Lhb/k;

    .line 363
    .line 364
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-static {v5}, Lhb/k;->j(Ljava/util/List;)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v6

    .line 371
    goto :goto_9

    .line 372
    :cond_e
    const-string v6, "\u7fa4\u53d1\u52a9\u624b\u5c1a\u672a\u5c31\u7eea"

    .line 373
    .line 374
    :goto_9
    if-eqz v6, :cond_f

    .line 375
    .line 376
    invoke-virtual {v0, v2, v6}, Lhb/i0;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    goto :goto_c

    .line 380
    :cond_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    if-ne v1, v4, :cond_10

    .line 384
    .line 385
    move p1, v4

    .line 386
    :cond_10
    if-eqz p1, :cond_11

    .line 387
    .line 388
    const-string v4, "\u9009\u62e9\u5b9a\u65f6\u7fa4\u53d1\u597d\u53cb"

    .line 389
    .line 390
    :goto_a
    move-object v6, v4

    .line 391
    move-object v4, v0

    .line 392
    goto :goto_b

    .line 393
    :cond_11
    const-string v4, "\u9009\u62e9\u5b9a\u65f6\u53d1\u9001\u5bf9\u8c61"

    .line 394
    .line 395
    goto :goto_a

    .line 396
    :goto_b
    new-instance v0, Lhb/w;

    .line 397
    .line 398
    invoke-direct/range {v0 .. v5}, Lhb/w;-><init>(ILandroid/app/Activity;Lb/e;Lhb/i0;Ljava/util/List;)V

    .line 399
    .line 400
    .line 401
    const-string v1, "\u4e0b\u4e00\u6b65"

    .line 402
    .line 403
    move-object v3, v2

    .line 404
    move-object v2, v0

    .line 405
    move-object v0, v4

    .line 406
    move-object v4, v1

    .line 407
    move-object v1, v3

    .line 408
    move v5, p1

    .line 409
    move-object v3, v6

    .line 410
    invoke-virtual/range {v0 .. v5}, Lhb/i0;->d(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 411
    .line 412
    .line 413
    :goto_c
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 414
    .line 415
    return-object p1

    .line 416
    :pswitch_2
    iget-object v1, p0, Lhb/f0;->h:Landroid/app/Activity;

    .line 417
    .line 418
    iget-object v0, p0, Lhb/f0;->j:Lhb/i0;

    .line 419
    .line 420
    iget-object v5, p0, Lhb/f0;->i:Ljava/util/List;

    .line 421
    .line 422
    iget-object v3, p0, Lhb/f0;->k:Lb/e;

    .line 423
    .line 424
    check-cast p1, Ljava/lang/Integer;

    .line 425
    .line 426
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 427
    .line 428
    .line 429
    move-result p1

    .line 430
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    if-eqz v2, :cond_12

    .line 435
    .line 436
    goto :goto_d

    .line 437
    :cond_12
    if-nez p1, :cond_13

    .line 438
    .line 439
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    new-instance v2, Lhb/f0;

    .line 443
    .line 444
    move-object v4, v0

    .line 445
    move-object v0, v2

    .line 446
    move-object v2, v1

    .line 447
    const/4 v1, 0x3

    .line 448
    invoke-direct/range {v0 .. v5}, Lhb/f0;-><init>(ILandroid/app/Activity;Lb/e;Lhb/i0;Ljava/util/List;)V

    .line 449
    .line 450
    .line 451
    const-string v3, "\u9009\u62e9\u7fa4\u53d1\u5bf9\u8c61"

    .line 452
    .line 453
    move-object v1, v2

    .line 454
    move-object v2, v0

    .line 455
    move-object v0, v4

    .line 456
    const-string v4, "\u53d1\u9001"

    .line 457
    .line 458
    const/4 v5, 0x0

    .line 459
    invoke-virtual/range {v0 .. v5}, Lhb/i0;->d(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 460
    .line 461
    .line 462
    goto :goto_d

    .line 463
    :cond_13
    move-object v4, v0

    .line 464
    move-object v2, v1

    .line 465
    iget-object p1, v4, Lhb/i0;->i:Lhb/k;

    .line 466
    .line 467
    invoke-virtual {p1, v5}, Lhb/k;->o(Ljava/util/List;)Ljava/util/List;

    .line 468
    .line 469
    .line 470
    move-result-object v6

    .line 471
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 472
    .line 473
    .line 474
    move-result p1

    .line 475
    if-nez p1, :cond_14

    .line 476
    .line 477
    const/4 v10, 0x0

    .line 478
    const/16 v11, 0x3e

    .line 479
    .line 480
    const-string v7, "\u3001"

    .line 481
    .line 482
    const/4 v8, 0x0

    .line 483
    const/4 v9, 0x0

    .line 484
    invoke-static/range {v6 .. v11}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    const-string v0, "\u539f\u751f\u7fa4\u53d1\u4e0d\u652f\u6301: "

    .line 489
    .line 490
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object p1

    .line 494
    invoke-virtual {v4, v2, p1}, Lhb/i0;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    goto :goto_d

    .line 498
    :cond_14
    invoke-static {v5}, Lhb/k;->j(Ljava/util/List;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object p1

    .line 502
    if-eqz p1, :cond_15

    .line 503
    .line 504
    invoke-virtual {v4, v2, p1}, Lhb/i0;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    goto :goto_d

    .line 508
    :cond_15
    new-instance v0, Lhb/f0;

    .line 509
    .line 510
    const/4 v1, 0x2

    .line 511
    invoke-direct/range {v0 .. v5}, Lhb/f0;-><init>(ILandroid/app/Activity;Lb/e;Lhb/i0;Ljava/util/List;)V

    .line 512
    .line 513
    .line 514
    const-string v3, "\u9009\u62e9\u5b98\u65b9\u7fa4\u53d1\u597d\u53cb"

    .line 515
    .line 516
    move-object v1, v2

    .line 517
    move-object v2, v0

    .line 518
    move-object v0, v4

    .line 519
    const-string v4, "\u53d1\u9001"

    .line 520
    .line 521
    const/4 v5, 0x1

    .line 522
    invoke-virtual/range {v0 .. v5}, Lhb/i0;->d(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 523
    .line 524
    .line 525
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 526
    .line 527
    return-object p1

    .line 528
    nop

    .line 529
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
