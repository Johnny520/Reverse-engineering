.class public final synthetic Lei0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lli0;


# direct methods
.method public synthetic constructor <init>(Lli0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lei0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lei0;->ζ:Lli0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 11

    .line 1
    iget p1, p0, Lei0;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lei0;->ζ:Lli0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lli0;->ζ:Landroid/widget/EditText;

    .line 9
    .line 10
    iget-object v0, p0, Lli0;->α:Landroid/app/Activity;

    .line 11
    .line 12
    iget-object v1, p0, Lli0;->φ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    iget-boolean v1, p0, Lli0;->Γ:Z

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance v0, Lfi0;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {v0, p0, v1}, Lfi0;-><init>(Lli0;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    return-void

    .line 53
    :pswitch_0
    iget-boolean p1, p0, Lli0;->Γ:Z

    .line 54
    .line 55
    if-nez p1, :cond_2

    .line 56
    .line 57
    iget-boolean p1, p0, Lli0;->Δ:Z

    .line 58
    .line 59
    if-nez p1, :cond_2

    .line 60
    .line 61
    new-instance p1, Landroid/app/AlertDialog$Builder;

    .line 62
    .line 63
    iget-object v0, p0, Lli0;->α:Landroid/app/Activity;

    .line 64
    .line 65
    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 66
    .line 67
    .line 68
    const-string v0, "\u786e\u8ba4\u6e05\u7406\u5168\u90e8\u4e92\u52a8\u6d88\u606f"

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string v0, "\u5c06\u5206\u9875\u8bfb\u53d6\u5168\u90e8\u4e92\u52a8\u6d88\u606f\uff0c\u5e76\u9010\u6761\u8c03\u7528\u6296\u97f3\u539f\u751f\u670d\u52a1\u7aef\u5220\u9664\u63a5\u53e3\u3002\n\n\u53ea\u6709\u670d\u52a1\u5668\u660e\u786e\u8fd4\u56de\u6210\u529f\u624d\u8ba1\u4e3a\u5df2\u5220\u9664\uff0c\u64cd\u4f5c\u5b8c\u6210\u540e\u65e0\u6cd5\u6062\u590d\u3002"

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string v0, "\u53d6\u6d88"

    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const-string v0, "\u5168\u90e8\u6e05\u7406"

    .line 88
    .line 89
    new-instance v1, Lgd0;

    .line 90
    .line 91
    const/4 v2, 0x1

    .line 92
    invoke-direct {v1, v2, p0}, Lgd0;-><init>(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 100
    .line 101
    .line 102
    :cond_2
    return-void

    .line 103
    :pswitch_1
    iget-boolean p1, p0, Lli0;->Γ:Z

    .line 104
    .line 105
    if-nez p1, :cond_c

    .line 106
    .line 107
    iget-boolean p1, p0, Lli0;->Δ:Z

    .line 108
    .line 109
    if-nez p1, :cond_c

    .line 110
    .line 111
    iget-object p1, p0, Lli0;->τ:Lij0;

    .line 112
    .line 113
    monitor-enter p1

    .line 114
    :try_start_0
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 115
    .line 116
    iget-object v1, p1, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 117
    .line 118
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    .line 121
    monitor-exit p1

    .line 122
    iget-object p1, p0, Lli0;->χ:Ljava/util/List;

    .line 123
    .line 124
    new-instance v1, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_4

    .line 138
    .line 139
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    move-object v3, v2

    .line 144
    check-cast v3, Lxi0;

    .line 145
    .line 146
    iget-object v4, v3, Lxi0;->α:Ljava/lang/String;

    .line 147
    .line 148
    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_3

    .line 153
    .line 154
    invoke-virtual {v3}, Lxi0;->α()Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-eqz v3, :cond_3

    .line 159
    .line 160
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_5

    .line 169
    .line 170
    iget-object p0, p0, Lli0;->α:Landroid/app/Activity;

    .line 171
    .line 172
    const-string p1, "\u8bf7\u5148\u9009\u62e9\u4f1a\u8bdd"

    .line 173
    .line 174
    const/4 v0, 0x0

    .line 175
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_6

    .line 183
    .line 184
    :cond_5
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 185
    .line 186
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-eqz v2, :cond_7

    .line 198
    .line 199
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    check-cast v2, Lxi0;

    .line 204
    .line 205
    iget-object v2, v2, Lxi0;->ε:Lnj0;

    .line 206
    .line 207
    iget-object v2, v2, Lnj0;->ε:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {p1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    if-nez v3, :cond_6

    .line 214
    .line 215
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-nez v4, :cond_6

    .line 220
    .line 221
    new-instance v3, Lsm1;

    .line 222
    .line 223
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 224
    .line 225
    .line 226
    :cond_6
    check-cast v3, Lsm1;

    .line 227
    .line 228
    iget v4, v3, Lsm1;->ε:I

    .line 229
    .line 230
    add-int/lit8 v4, v4, 0x1

    .line 231
    .line 232
    iput v4, v3, Lsm1;->ε:I

    .line 233
    .line 234
    invoke-interface {p1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_7
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    check-cast v0, Ljava/lang/Iterable;

    .line 243
    .line 244
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    const/4 v3, 0x0

    .line 253
    if-eqz v2, :cond_a

    .line 254
    .line 255
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    check-cast v2, Ljava/util/Map$Entry;

    .line 260
    .line 261
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    instance-of v4, v2, Llo0;

    .line 265
    .line 266
    if-eqz v4, :cond_9

    .line 267
    .line 268
    instance-of v4, v2, Loo0;

    .line 269
    .line 270
    if-eqz v4, :cond_8

    .line 271
    .line 272
    goto :goto_4

    .line 273
    :cond_8
    const-string p0, "kotlin.collections.MutableMap.MutableEntry"

    .line 274
    .line 275
    invoke-static {v2, p0}, Lh62;->Н(Ljava/lang/Object;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    throw v3

    .line 279
    :cond_9
    :goto_4
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    check-cast v3, Lsm1;

    .line 284
    .line 285
    iget v3, v3, Lsm1;->ε:I

    .line 286
    .line 287
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-interface {v2, v3}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    goto :goto_3

    .line 295
    :cond_a
    invoke-static {p1}, Lh62;->θ(Ljava/lang/Object;)Ljava/util/Map;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    move-object v4, p1

    .line 304
    check-cast v4, Ljava/lang/Iterable;

    .line 305
    .line 306
    const-string v5, " \u00b7 "

    .line 307
    .line 308
    new-instance v9, Lsh0;

    .line 309
    .line 310
    const/16 p1, 0x10

    .line 311
    .line 312
    invoke-direct {v9, p1}, Lsh0;-><init>(I)V

    .line 313
    .line 314
    .line 315
    const/16 v10, 0x1e

    .line 316
    .line 317
    const/4 v6, 0x0

    .line 318
    const/4 v7, 0x0

    .line 319
    const/4 v8, 0x0

    .line 320
    invoke-static/range {v4 .. v10}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    const/16 v0, 0x8

    .line 325
    .line 326
    invoke-static {v1, v0}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    const-string v5, "\u3001"

    .line 331
    .line 332
    new-instance v9, Lsh0;

    .line 333
    .line 334
    const/16 v2, 0x11

    .line 335
    .line 336
    invoke-direct {v9, v2}, Lsh0;-><init>(I)V

    .line 337
    .line 338
    .line 339
    invoke-static/range {v4 .. v10}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-le v4, v0, :cond_b

    .line 348
    .line 349
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    const-string v4, " \u7b49 "

    .line 354
    .line 355
    const-string v5, " \u4e2a"

    .line 356
    .line 357
    invoke-static {v4, v0, v5}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    goto :goto_5

    .line 362
    :cond_b
    const-string v0, ""

    .line 363
    .line 364
    :goto_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 365
    .line 366
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    new-instance v6, Ljava/lang/StringBuilder;

    .line 374
    .line 375
    const-string v7, "\u5c06\u901a\u8fc7\u6296\u97f3\u670d\u52a1\u7aef\u5220\u9664 "

    .line 376
    .line 377
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    const-string v5, " \u4e2a\u5355\u804a\u4f1a\u8bdd\u3002\n"

    .line 384
    .line 385
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    const-string p1, "\n\n"

    .line 399
    .line 400
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    const-string p1, "\n\n\u5220\u9664\u540e\u65e0\u6cd5\u6062\u590d\u3002"

    .line 410
    .line 411
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 419
    .line 420
    iget-object v2, p0, Lli0;->α:Landroid/app/Activity;

    .line 421
    .line 422
    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 423
    .line 424
    .line 425
    const-string v2, "\u786e\u8ba4\u5220\u9664\u4e91\u7aef\u4f1a\u8bdd"

    .line 426
    .line 427
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 432
    .line 433
    .line 434
    move-result-object p1

    .line 435
    const-string v0, "\u53d6\u6d88"

    .line 436
    .line 437
    invoke-virtual {p1, v0, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 438
    .line 439
    .line 440
    move-result-object p1

    .line 441
    const-string v0, "\u5220\u9664"

    .line 442
    .line 443
    new-instance v2, Lbc0;

    .line 444
    .line 445
    const/4 v3, 0x1

    .line 446
    invoke-direct {v2, p0, v3, v1}, Lbc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {p1, v0, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 450
    .line 451
    .line 452
    move-result-object p0

    .line 453
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 454
    .line 455
    .line 456
    goto :goto_6

    .line 457
    :catchall_0
    move-exception v0

    .line 458
    move-object p0, v0

    .line 459
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 460
    throw p0

    .line 461
    :cond_c
    :goto_6
    return-void

    .line 462
    :pswitch_2
    iget-object p1, p0, Lli0;->Λ:Ln5;

    .line 463
    .line 464
    iget-object p0, p0, Lli0;->μ:Landroid/widget/TextView;

    .line 465
    .line 466
    const/4 v0, 0x0

    .line 467
    if-eqz p1, :cond_d

    .line 468
    .line 469
    iget-object v1, p1, Ln5;->η:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 472
    .line 473
    const/4 v2, 0x1

    .line 474
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    if-eqz v1, :cond_d

    .line 479
    .line 480
    iget-object p1, p1, Ln5;->ζ:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast p1, Lp3;

    .line 483
    .line 484
    invoke-virtual {p1}, Lp3;->invoke()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    :cond_d
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 488
    .line 489
    .line 490
    const p1, 0x3ee66666    # 0.45f

    .line 491
    .line 492
    .line 493
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 494
    .line 495
    .line 496
    const-string p1, "\u6b63\u5728\u505c\u6b62"

    .line 497
    .line 498
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 499
    .line 500
    .line 501
    return-void

    .line 502
    :pswitch_3
    iget-boolean p1, p0, Lli0;->Γ:Z

    .line 503
    .line 504
    if-nez p1, :cond_10

    .line 505
    .line 506
    iget-object p1, p0, Lli0;->τ:Lij0;

    .line 507
    .line 508
    iget-object v0, p0, Lli0;->ψ:Ljava/lang/Object;

    .line 509
    .line 510
    monitor-enter p1

    .line 511
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    new-instance v1, Lf7;

    .line 515
    .line 516
    const/4 v2, 0x1

    .line 517
    invoke-direct {v1, v2, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    new-instance v0, Lfj0;

    .line 521
    .line 522
    const/4 v2, 0x1

    .line 523
    invoke-direct {v0, v2}, Lfj0;-><init>(I)V

    .line 524
    .line 525
    .line 526
    new-instance v2, Ly30;

    .line 527
    .line 528
    const/4 v3, 0x1

    .line 529
    invoke-direct {v2, v1, v3, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 530
    .line 531
    .line 532
    new-instance v0, Lx30;

    .line 533
    .line 534
    invoke-direct {v0, v2}, Lx30;-><init>(Ly30;)V

    .line 535
    .line 536
    .line 537
    :cond_e
    :goto_7
    invoke-virtual {v0}, Lx30;->hasNext()Z

    .line 538
    .line 539
    .line 540
    move-result v1

    .line 541
    if-eqz v1, :cond_f

    .line 542
    .line 543
    invoke-virtual {v0}, Lx30;->next()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    check-cast v1, Lxi0;

    .line 548
    .line 549
    iget-object v2, p1, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 550
    .line 551
    iget-object v3, v1, Lxi0;->α:Ljava/lang/String;

    .line 552
    .line 553
    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v2

    .line 557
    if-nez v2, :cond_e

    .line 558
    .line 559
    iget-object v2, p1, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 560
    .line 561
    iget-object v1, v1, Lxi0;->α:Ljava/lang/String;

    .line 562
    .line 563
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    goto :goto_7

    .line 567
    :catchall_1
    move-exception v0

    .line 568
    move-object p0, v0

    .line 569
    goto :goto_8

    .line 570
    :cond_f
    iget-object v0, p1, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 571
    .line 572
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 573
    .line 574
    .line 575
    monitor-exit p1

    .line 576
    invoke-virtual {p0}, Lli0;->θ()V

    .line 577
    .line 578
    .line 579
    goto :goto_9

    .line 580
    :goto_8
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 581
    throw p0

    .line 582
    :cond_10
    :goto_9
    return-void

    .line 583
    :pswitch_4
    iget-boolean p1, p0, Lli0;->Γ:Z

    .line 584
    .line 585
    if-nez p1, :cond_12

    .line 586
    .line 587
    iget-object p1, p0, Lli0;->τ:Lij0;

    .line 588
    .line 589
    iget-object v0, p0, Lli0;->ψ:Ljava/lang/Object;

    .line 590
    .line 591
    monitor-enter p1

    .line 592
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    new-instance v1, Lf7;

    .line 596
    .line 597
    const/4 v2, 0x1

    .line 598
    invoke-direct {v1, v2, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    new-instance v0, Lfj0;

    .line 602
    .line 603
    const/4 v2, 0x2

    .line 604
    invoke-direct {v0, v2}, Lfj0;-><init>(I)V

    .line 605
    .line 606
    .line 607
    new-instance v2, Ly30;

    .line 608
    .line 609
    const/4 v3, 0x1

    .line 610
    invoke-direct {v2, v1, v3, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 611
    .line 612
    .line 613
    iget-object v0, p1, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 614
    .line 615
    invoke-interface {v2}, Lss1;->iterator()Ljava/util/Iterator;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 620
    .line 621
    .line 622
    move-result v2

    .line 623
    if-eqz v2, :cond_11

    .line 624
    .line 625
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    check-cast v2, Lxi0;

    .line 630
    .line 631
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    iget-object v2, v2, Lxi0;->α:Ljava/lang/String;

    .line 635
    .line 636
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    goto :goto_a

    .line 640
    :catchall_2
    move-exception v0

    .line 641
    move-object p0, v0

    .line 642
    goto :goto_b

    .line 643
    :cond_11
    iget-object v0, p1, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 644
    .line 645
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 646
    .line 647
    .line 648
    monitor-exit p1

    .line 649
    invoke-virtual {p0}, Lli0;->θ()V

    .line 650
    .line 651
    .line 652
    goto :goto_c

    .line 653
    :goto_b
    :try_start_5
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 654
    throw p0

    .line 655
    :cond_12
    :goto_c
    return-void

    .line 656
    :pswitch_5
    iget-boolean p1, p0, Lli0;->Γ:Z

    .line 657
    .line 658
    if-nez p1, :cond_13

    .line 659
    .line 660
    iget-boolean p1, p0, Lli0;->Δ:Z

    .line 661
    .line 662
    if-nez p1, :cond_13

    .line 663
    .line 664
    iget-object p0, p0, Lli0;->σ:Landroid/app/AlertDialog;

    .line 665
    .line 666
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 667
    .line 668
    .line 669
    :cond_13
    return-void

    .line 670
    nop

    .line 671
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
