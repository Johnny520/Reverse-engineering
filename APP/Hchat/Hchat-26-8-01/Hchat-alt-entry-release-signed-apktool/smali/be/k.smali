.class public final Lbe/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li2/t;


# instance fields
.field public a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    .line 673
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 674
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lbe/k;->b:Ljava/lang/Object;

    .line 675
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lbe/k;->a:Ljava/lang/Object;

    .line 676
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lbe/k;->c:Ljava/lang/Object;

    .line 677
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lbe/k;->d:Ljava/lang/Object;

    .line 678
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lbe/k;->e:Ljava/lang/Object;

    return-void

    .line 679
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 680
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 681
    iput-object p1, p0, Lbe/k;->b:Ljava/lang/Object;

    .line 682
    new-instance p1, Ls0/a;

    const/4 v0, 0x0

    .line 683
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 684
    iput-object p1, p0, Lbe/k;->c:Ljava/lang/Object;

    .line 685
    new-instance p1, Lf/f0;

    invoke-direct {p1}, Lf/f0;-><init>()V

    .line 686
    iput-object p1, p0, Lbe/k;->d:Ljava/lang/Object;

    .line 687
    new-instance p1, Lf/f0;

    invoke-direct {p1}, Lf/f0;-><init>()V

    .line 688
    iput-object p1, p0, Lbe/k;->e:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/text/Layout;)V
    .locals 5

    .line 663
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/k;->b:Ljava/lang/Object;

    .line 664
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    .line 665
    :cond_0
    iget-object v2, p0, Lbe/k;->b:Ljava/lang/Object;

    check-cast v2, Landroid/text/Layout;

    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    const/16 v3, 0xa

    const/4 v4, 0x4

    invoke-static {v2, v3, v1, v4}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    move-result v1

    if-gez v1, :cond_1

    .line 666
    iget-object v1, p0, Lbe/k;->b:Ljava/lang/Object;

    check-cast v1, Landroid/text/Layout;

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 667
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 668
    iget-object v2, p0, Lbe/k;->b:Ljava/lang/Object;

    check-cast v2, Landroid/text/Layout;

    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lt v1, v2, :cond_0

    .line 669
    iput-object p1, p0, Lbe/k;->a:Ljava/lang/Object;

    .line 670
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v0, p1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    iput-object v1, p0, Lbe/k;->c:Ljava/lang/Object;

    .line 671
    iget-object p1, p0, Lbe/k;->a:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Z

    iput-object p1, p0, Lbe/k;->d:Ljava/lang/Object;

    .line 672
    iget-object p1, p0, Lbe/k;->a:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    return-void
.end method

.method public constructor <init>(Li2/g;Li2/n0;Ljava/util/List;Lu2/c;Lm2/d;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v1, v0, Lbe/k;->b:Ljava/lang/Object;

    .line 11
    .line 12
    move-object/from16 v3, p3

    .line 13
    .line 14
    iput-object v3, v0, Lbe/k;->c:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v3, Li2/p;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v3, v0, v4}, Li2/p;-><init>(Lbe/k;I)V

    .line 20
    .line 21
    .line 22
    sget-object v5, Lsf/d;->h:Lsf/d;

    .line 23
    .line 24
    invoke-static {v5, v3}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iput-object v3, v0, Lbe/k;->d:Ljava/lang/Object;

    .line 29
    .line 30
    new-instance v3, Li2/p;

    .line 31
    .line 32
    const/4 v6, 0x1

    .line 33
    invoke-direct {v3, v0, v6}, Li2/p;-><init>(Lbe/k;I)V

    .line 34
    .line 35
    .line 36
    invoke-static {v5, v3}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iput-object v3, v0, Lbe/k;->e:Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v3, v2, Li2/n0;->b:Li2/u;

    .line 43
    .line 44
    sget-object v5, Li2/h;->a:Li2/g;

    .line 45
    .line 46
    iget-object v5, v1, Li2/g;->j:Ljava/util/ArrayList;

    .line 47
    .line 48
    iget-object v7, v1, Li2/g;->h:Ljava/lang/String;

    .line 49
    .line 50
    sget-object v8, Ltf/t;->g:Ltf/t;

    .line 51
    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    new-instance v9, Li2/f;

    .line 55
    .line 56
    invoke-direct {v9, v6}, Li2/f;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-static {v5, v9}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move-object v5, v8

    .line 65
    :goto_0
    new-instance v6, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    new-instance v9, Ltf/k;

    .line 71
    .line 72
    invoke-direct {v9}, Ltf/k;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    move v11, v4

    .line 80
    move v12, v11

    .line 81
    :goto_1
    if-ge v11, v10, :cond_9

    .line 82
    .line 83
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    check-cast v13, Li2/e;

    .line 88
    .line 89
    iget-object v14, v13, Li2/e;->a:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v14, Li2/u;

    .line 92
    .line 93
    invoke-virtual {v3, v14}, Li2/u;->a(Li2/u;)Li2/u;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    const/16 v15, 0xe

    .line 98
    .line 99
    invoke-static {v13, v14, v4, v15}, Li2/e;->a(Li2/e;Li2/u;II)Li2/e;

    .line 100
    .line 101
    .line 102
    move-result-object v13

    .line 103
    iget-object v14, v13, Li2/e;->a:Ljava/lang/Object;

    .line 104
    .line 105
    iget v15, v13, Li2/e;->c:I

    .line 106
    .line 107
    iget v13, v13, Li2/e;->b:I

    .line 108
    .line 109
    :goto_2
    if-ge v12, v13, :cond_3

    .line 110
    .line 111
    invoke-virtual {v9}, Ltf/k;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v16

    .line 115
    if-nez v16, :cond_3

    .line 116
    .line 117
    invoke-virtual {v9}, Ltf/k;->last()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v16

    .line 121
    move-object/from16 v4, v16

    .line 122
    .line 123
    check-cast v4, Li2/e;

    .line 124
    .line 125
    move-object/from16 v16, v5

    .line 126
    .line 127
    iget v5, v4, Li2/e;->c:I

    .line 128
    .line 129
    move-object/from16 v17, v8

    .line 130
    .line 131
    iget-object v8, v4, Li2/e;->a:Ljava/lang/Object;

    .line 132
    .line 133
    if-ge v13, v5, :cond_1

    .line 134
    .line 135
    new-instance v4, Li2/e;

    .line 136
    .line 137
    invoke-direct {v4, v12, v13, v8}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move v12, v13

    .line 144
    move-object/from16 v5, v16

    .line 145
    .line 146
    move-object/from16 v8, v17

    .line 147
    .line 148
    :goto_3
    const/4 v4, 0x0

    .line 149
    goto :goto_2

    .line 150
    :cond_1
    move/from16 v18, v10

    .line 151
    .line 152
    new-instance v10, Li2/e;

    .line 153
    .line 154
    invoke-direct {v10, v12, v5, v8}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    iget v12, v4, Li2/e;->c:I

    .line 161
    .line 162
    :goto_4
    invoke-virtual {v9}, Ltf/k;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-nez v4, :cond_2

    .line 167
    .line 168
    invoke-virtual {v9}, Ltf/k;->last()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    check-cast v4, Li2/e;

    .line 173
    .line 174
    iget v4, v4, Li2/e;->c:I

    .line 175
    .line 176
    if-ne v12, v4, :cond_2

    .line 177
    .line 178
    invoke-virtual {v9}, Ltf/k;->removeLast()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_2
    move-object/from16 v5, v16

    .line 183
    .line 184
    move-object/from16 v8, v17

    .line 185
    .line 186
    move/from16 v10, v18

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_3
    move-object/from16 v16, v5

    .line 190
    .line 191
    move-object/from16 v17, v8

    .line 192
    .line 193
    move/from16 v18, v10

    .line 194
    .line 195
    if-ge v12, v13, :cond_4

    .line 196
    .line 197
    new-instance v4, Li2/e;

    .line 198
    .line 199
    invoke-direct {v4, v12, v13, v3}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move v12, v13

    .line 206
    :cond_4
    invoke-virtual {v9}, Ltf/k;->g()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    check-cast v4, Li2/e;

    .line 211
    .line 212
    if-eqz v4, :cond_8

    .line 213
    .line 214
    iget v5, v4, Li2/e;->c:I

    .line 215
    .line 216
    iget-object v8, v4, Li2/e;->a:Ljava/lang/Object;

    .line 217
    .line 218
    iget v4, v4, Li2/e;->b:I

    .line 219
    .line 220
    if-ne v4, v13, :cond_5

    .line 221
    .line 222
    if-ne v5, v15, :cond_5

    .line 223
    .line 224
    invoke-virtual {v9}, Ltf/k;->removeLast()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    new-instance v4, Li2/e;

    .line 228
    .line 229
    check-cast v8, Li2/u;

    .line 230
    .line 231
    check-cast v14, Li2/u;

    .line 232
    .line 233
    invoke-virtual {v8, v14}, Li2/u;->a(Li2/u;)Li2/u;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    invoke-direct {v4, v13, v15, v5}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v9, v4}, Ltf/k;->addLast(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_5
    if-ne v4, v5, :cond_6

    .line 245
    .line 246
    new-instance v10, Li2/e;

    .line 247
    .line 248
    invoke-direct {v10, v4, v5, v8}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    invoke-virtual {v9}, Ltf/k;->removeLast()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    new-instance v4, Li2/e;

    .line 258
    .line 259
    invoke-direct {v4, v13, v15, v14}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v9, v4}, Ltf/k;->addLast(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_6
    if-lt v5, v15, :cond_7

    .line 267
    .line 268
    new-instance v4, Li2/e;

    .line 269
    .line 270
    check-cast v8, Li2/u;

    .line 271
    .line 272
    check-cast v14, Li2/u;

    .line 273
    .line 274
    invoke-virtual {v8, v14}, Li2/u;->a(Li2/u;)Li2/u;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    invoke-direct {v4, v13, v15, v5}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v9, v4}, Ltf/k;->addLast(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_7
    invoke-static {}, Lj8/o;->o()V

    .line 286
    .line 287
    .line 288
    const/4 v1, 0x0

    .line 289
    throw v1

    .line 290
    :cond_8
    new-instance v4, Li2/e;

    .line 291
    .line 292
    invoke-direct {v4, v13, v15, v14}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v9, v4}, Ltf/k;->addLast(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    :goto_5
    add-int/lit8 v11, v11, 0x1

    .line 299
    .line 300
    move-object/from16 v5, v16

    .line 301
    .line 302
    move-object/from16 v8, v17

    .line 303
    .line 304
    move/from16 v10, v18

    .line 305
    .line 306
    const/4 v4, 0x0

    .line 307
    goto/16 :goto_1

    .line 308
    .line 309
    :cond_9
    move-object/from16 v17, v8

    .line 310
    .line 311
    :goto_6
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    if-gt v12, v4, :cond_b

    .line 316
    .line 317
    invoke-virtual {v9}, Ltf/k;->isEmpty()Z

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    if-nez v4, :cond_b

    .line 322
    .line 323
    invoke-virtual {v9}, Ltf/k;->last()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    check-cast v4, Li2/e;

    .line 328
    .line 329
    new-instance v5, Li2/e;

    .line 330
    .line 331
    iget-object v8, v4, Li2/e;->a:Ljava/lang/Object;

    .line 332
    .line 333
    iget v4, v4, Li2/e;->c:I

    .line 334
    .line 335
    invoke-direct {v5, v12, v4, v8}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    :goto_7
    invoke-virtual {v9}, Ltf/k;->isEmpty()Z

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    if-nez v5, :cond_a

    .line 346
    .line 347
    invoke-virtual {v9}, Ltf/k;->last()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v5

    .line 351
    check-cast v5, Li2/e;

    .line 352
    .line 353
    iget v5, v5, Li2/e;->c:I

    .line 354
    .line 355
    if-ne v4, v5, :cond_a

    .line 356
    .line 357
    invoke-virtual {v9}, Ltf/k;->removeLast()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    goto :goto_7

    .line 361
    :cond_a
    move v12, v4

    .line 362
    goto :goto_6

    .line 363
    :cond_b
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 364
    .line 365
    .line 366
    move-result v4

    .line 367
    if-ge v12, v4, :cond_c

    .line 368
    .line 369
    new-instance v4, Li2/e;

    .line 370
    .line 371
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 372
    .line 373
    .line 374
    move-result v5

    .line 375
    invoke-direct {v4, v12, v5, v3}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    :cond_c
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    if-eqz v4, :cond_d

    .line 386
    .line 387
    new-instance v4, Li2/e;

    .line 388
    .line 389
    const/4 v5, 0x0

    .line 390
    invoke-direct {v4, v5, v5, v3}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    goto :goto_8

    .line 397
    :cond_d
    const/4 v5, 0x0

    .line 398
    :goto_8
    new-instance v4, Ljava/util/ArrayList;

    .line 399
    .line 400
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 408
    .line 409
    .line 410
    move-result v8

    .line 411
    move v9, v5

    .line 412
    :goto_9
    if-ge v9, v8, :cond_15

    .line 413
    .line 414
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v10

    .line 418
    check-cast v10, Li2/e;

    .line 419
    .line 420
    iget v11, v10, Li2/e;->b:I

    .line 421
    .line 422
    iget v12, v10, Li2/e;->c:I

    .line 423
    .line 424
    new-instance v13, Li2/g;

    .line 425
    .line 426
    if-eq v11, v12, :cond_e

    .line 427
    .line 428
    invoke-virtual {v7, v11, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v14

    .line 432
    goto :goto_a

    .line 433
    :cond_e
    const-string v14, ""

    .line 434
    .line 435
    :goto_a
    new-instance v15, Lg0/o;

    .line 436
    .line 437
    const/16 v5, 0x1d

    .line 438
    .line 439
    invoke-direct {v15, v5}, Lg0/o;-><init>(I)V

    .line 440
    .line 441
    .line 442
    invoke-static {v1, v11, v12, v15}, Li2/h;->a(Li2/g;IILg0/o;)Ljava/util/List;

    .line 443
    .line 444
    .line 445
    move-result-object v5

    .line 446
    if-nez v5, :cond_f

    .line 447
    .line 448
    move-object/from16 v5, v17

    .line 449
    .line 450
    :cond_f
    invoke-direct {v13, v14, v5}, Li2/g;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 451
    .line 452
    .line 453
    iget-object v5, v10, Li2/e;->a:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v5, Li2/u;

    .line 456
    .line 457
    iget v10, v5, Li2/u;->b:I

    .line 458
    .line 459
    if-nez v10, :cond_10

    .line 460
    .line 461
    iget v10, v3, Li2/u;->b:I

    .line 462
    .line 463
    iget v15, v5, Li2/u;->a:I

    .line 464
    .line 465
    move-object/from16 v29, v6

    .line 466
    .line 467
    move-object/from16 v16, v7

    .line 468
    .line 469
    iget-wide v6, v5, Li2/u;->c:J

    .line 470
    .line 471
    iget-object v1, v5, Li2/u;->d:Lt2/q;

    .line 472
    .line 473
    move-object/from16 v23, v1

    .line 474
    .line 475
    iget-object v1, v5, Li2/u;->e:Li2/w;

    .line 476
    .line 477
    move-object/from16 v24, v1

    .line 478
    .line 479
    iget-object v1, v5, Li2/u;->f:Lt2/i;

    .line 480
    .line 481
    move-object/from16 v25, v1

    .line 482
    .line 483
    iget v1, v5, Li2/u;->g:I

    .line 484
    .line 485
    move/from16 v26, v1

    .line 486
    .line 487
    iget v1, v5, Li2/u;->h:I

    .line 488
    .line 489
    iget-object v5, v5, Li2/u;->i:Lt2/s;

    .line 490
    .line 491
    new-instance v18, Li2/u;

    .line 492
    .line 493
    move/from16 v27, v1

    .line 494
    .line 495
    move-object/from16 v28, v5

    .line 496
    .line 497
    move-wide/from16 v21, v6

    .line 498
    .line 499
    move/from16 v20, v10

    .line 500
    .line 501
    move/from16 v19, v15

    .line 502
    .line 503
    invoke-direct/range {v18 .. v28}, Li2/u;-><init>(IIJLt2/q;Li2/w;Lt2/i;IILt2/s;)V

    .line 504
    .line 505
    .line 506
    move-object/from16 v5, v18

    .line 507
    .line 508
    goto :goto_b

    .line 509
    :cond_10
    move-object/from16 v29, v6

    .line 510
    .line 511
    move-object/from16 v16, v7

    .line 512
    .line 513
    :goto_b
    new-instance v1, Li2/s;

    .line 514
    .line 515
    new-instance v6, Li2/n0;

    .line 516
    .line 517
    iget-object v7, v2, Li2/n0;->a:Li2/f0;

    .line 518
    .line 519
    invoke-virtual {v3, v5}, Li2/u;->a(Li2/u;)Li2/u;

    .line 520
    .line 521
    .line 522
    move-result-object v5

    .line 523
    invoke-direct {v6, v7, v5}, Li2/n0;-><init>(Li2/f0;Li2/u;)V

    .line 524
    .line 525
    .line 526
    iget-object v5, v13, Li2/g;->g:Ljava/util/List;

    .line 527
    .line 528
    if-nez v5, :cond_11

    .line 529
    .line 530
    move-object/from16 v21, v17

    .line 531
    .line 532
    goto :goto_c

    .line 533
    :cond_11
    move-object/from16 v21, v5

    .line 534
    .line 535
    :goto_c
    iget-object v5, v0, Lbe/k;->c:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v5, Ljava/util/List;

    .line 538
    .line 539
    new-instance v7, Ljava/util/ArrayList;

    .line 540
    .line 541
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 542
    .line 543
    .line 544
    move-result v10

    .line 545
    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 546
    .line 547
    .line 548
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 549
    .line 550
    .line 551
    move-result v10

    .line 552
    const/4 v13, 0x0

    .line 553
    :goto_d
    if-ge v13, v10, :cond_14

    .line 554
    .line 555
    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v15

    .line 559
    check-cast v15, Li2/e;

    .line 560
    .line 561
    iget v2, v15, Li2/e;->b:I

    .line 562
    .line 563
    move-object/from16 v25, v3

    .line 564
    .line 565
    iget v3, v15, Li2/e;->c:I

    .line 566
    .line 567
    invoke-static {v11, v12, v2, v3}, Li2/h;->b(IIII)Z

    .line 568
    .line 569
    .line 570
    move-result v18

    .line 571
    if-eqz v18, :cond_13

    .line 572
    .line 573
    if-gt v11, v2, :cond_12

    .line 574
    .line 575
    if-gt v3, v12, :cond_12

    .line 576
    .line 577
    :goto_e
    move/from16 v18, v2

    .line 578
    .line 579
    goto :goto_f

    .line 580
    :cond_12
    const-string v18, "placeholder can not overlap with paragraph."

    .line 581
    .line 582
    invoke-static/range {v18 .. v18}, Lo2/a;->a(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    goto :goto_e

    .line 586
    :goto_f
    new-instance v2, Li2/e;

    .line 587
    .line 588
    iget-object v15, v15, Li2/e;->a:Ljava/lang/Object;

    .line 589
    .line 590
    move/from16 v19, v3

    .line 591
    .line 592
    sub-int v3, v18, v11

    .line 593
    .line 594
    move-object/from16 v18, v5

    .line 595
    .line 596
    sub-int v5, v19, v11

    .line 597
    .line 598
    invoke-direct {v2, v3, v5, v15}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    goto :goto_10

    .line 605
    :cond_13
    move-object/from16 v18, v5

    .line 606
    .line 607
    :goto_10
    add-int/lit8 v13, v13, 0x1

    .line 608
    .line 609
    move-object/from16 v2, p2

    .line 610
    .line 611
    move-object/from16 v5, v18

    .line 612
    .line 613
    move-object/from16 v3, v25

    .line 614
    .line 615
    goto :goto_d

    .line 616
    :cond_14
    move-object/from16 v25, v3

    .line 617
    .line 618
    new-instance v18, Lq2/d;

    .line 619
    .line 620
    move-object/from16 v24, p4

    .line 621
    .line 622
    move-object/from16 v23, p5

    .line 623
    .line 624
    move-object/from16 v20, v6

    .line 625
    .line 626
    move-object/from16 v22, v7

    .line 627
    .line 628
    move-object/from16 v19, v14

    .line 629
    .line 630
    invoke-direct/range {v18 .. v24}, Lq2/d;-><init>(Ljava/lang/String;Li2/n0;Ljava/util/List;Ljava/util/List;Lm2/d;Lu2/c;)V

    .line 631
    .line 632
    .line 633
    move-object/from16 v2, v18

    .line 634
    .line 635
    invoke-direct {v1, v2, v11, v12}, Li2/s;-><init>(Lq2/d;II)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    add-int/lit8 v9, v9, 0x1

    .line 642
    .line 643
    move-object/from16 v1, p1

    .line 644
    .line 645
    move-object/from16 v2, p2

    .line 646
    .line 647
    move-object/from16 v7, v16

    .line 648
    .line 649
    move-object/from16 v6, v29

    .line 650
    .line 651
    const/4 v5, 0x0

    .line 652
    goto/16 :goto_9

    .line 653
    .line 654
    :cond_15
    iput-object v4, v0, Lbe/k;->a:Ljava/lang/Object;

    .line 655
    .line 656
    return-void
.end method

.method public constructor <init>(Ll3/l;Lna/k;Lb5/c;Lsa/c;Lb5/c;)V
    .locals 0

    .line 657
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 658
    iput-object p1, p0, Lbe/k;->b:Ljava/lang/Object;

    .line 659
    iput-object p2, p0, Lbe/k;->a:Ljava/lang/Object;

    .line 660
    iput-object p3, p0, Lbe/k;->c:Ljava/lang/Object;

    .line 661
    iput-object p4, p0, Lbe/k;->d:Ljava/lang/Object;

    .line 662
    iput-object p5, p0, Lbe/k;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lud/e;Ljava/util/ArrayList;)V
    .locals 1

    .line 689
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 690
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbe/k;->c:Ljava/lang/Object;

    .line 691
    iput-object p1, p0, Lbe/k;->b:Ljava/lang/Object;

    .line 692
    iput-object p2, p0, Lbe/k;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lbe/k;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Li2/s;

    .line 18
    .line 19
    iget-object v4, v4, Li2/s;->a:Lq2/d;

    .line 20
    .line 21
    invoke-virtual {v4}, Lq2/d;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return v2
.end method

.method public b()F
    .locals 1

    .line 1
    iget-object v0, p0, Lbe/k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public c()F
    .locals 1

    .line 1
    iget-object v0, p0, Lbe/k;->e:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public d(Ls0/b;Lfg/a;)Li0/f;
    .locals 7

    .line 1
    new-instance v0, Lgg/s;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    iput v1, v0, Lgg/s;->g:I

    .line 8
    .line 9
    iget-object v1, p0, Lbe/k;->b:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    iget-object v2, p0, Lbe/k;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Throwable;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, v2}, Ls0/b;->b(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Li0/e;->h:Lg1/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit v1

    .line 24
    return-object p1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto/16 :goto_5

    .line 27
    .line 28
    :cond_0
    :try_start_1
    iget-object v2, p0, Lbe/k;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Ls0/a;

    .line 31
    .line 32
    :cond_1
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    add-int/lit8 v4, v3, 0x1

    .line 37
    .line 38
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    const v2, 0x7ffffff

    .line 45
    .line 46
    .line 47
    and-int/2addr v2, v4

    .line 48
    const/4 v3, 0x1

    .line 49
    const/4 v5, 0x0

    .line 50
    if-ne v2, v3, :cond_2

    .line 51
    .line 52
    move v2, v3

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move v2, v5

    .line 55
    :goto_0
    ushr-int/lit8 v4, v4, 0x1b

    .line 56
    .line 57
    and-int/lit8 v4, v4, 0xf

    .line 58
    .line 59
    iput v4, v0, Lgg/s;->g:I

    .line 60
    .line 61
    iget-object v4, p0, Lbe/k;->d:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, Lf/f0;

    .line 64
    .line 65
    invoke-virtual {v4, p1}, Lf/f0;->a(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    monitor-exit v1

    .line 69
    if-eqz v2, :cond_6

    .line 70
    .line 71
    if-eqz p2, :cond_6

    .line 72
    .line 73
    :try_start_2
    invoke-interface {p2}, Lfg/a;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    .line 75
    .line 76
    goto :goto_4

    .line 77
    :catchall_1
    move-exception p2

    .line 78
    iget-object v1, p0, Lbe/k;->b:Ljava/lang/Object;

    .line 79
    .line 80
    monitor-enter v1

    .line 81
    :try_start_3
    iget-object v2, p0, Lbe/k;->a:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Ljava/lang/Throwable;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 84
    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    :goto_1
    monitor-exit v1

    .line 88
    goto :goto_4

    .line 89
    :cond_3
    :try_start_4
    iput-object p2, p0, Lbe/k;->a:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object v2, p0, Lbe/k;->d:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, Lf/f0;

    .line 94
    .line 95
    iget-object v4, v2, Lf/f0;->a:[Ljava/lang/Object;

    .line 96
    .line 97
    iget v2, v2, Lf/f0;->b:I

    .line 98
    .line 99
    :goto_2
    if-ge v5, v2, :cond_4

    .line 100
    .line 101
    aget-object v6, v4, v5

    .line 102
    .line 103
    check-cast v6, Ls0/b;

    .line 104
    .line 105
    invoke-virtual {v6, p2}, Ls0/b;->b(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 v5, v5, 0x1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :catchall_2
    move-exception p1

    .line 112
    goto :goto_3

    .line 113
    :cond_4
    iget-object p2, p0, Lbe/k;->d:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p2, Lf/f0;

    .line 116
    .line 117
    invoke-virtual {p2}, Lf/f0;->d()V

    .line 118
    .line 119
    .line 120
    iget-object p2, p0, Lbe/k;->c:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p2, Ls0/a;

    .line 123
    .line 124
    :cond_5
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    ushr-int/lit8 v4, v2, 0x1b

    .line 129
    .line 130
    and-int/lit8 v4, v4, 0xf

    .line 131
    .line 132
    add-int/2addr v4, v3

    .line 133
    and-int/lit8 v4, v4, 0xf

    .line 134
    .line 135
    shl-int/lit8 v4, v4, 0x1b

    .line 136
    .line 137
    invoke-virtual {p2, v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 138
    .line 139
    .line 140
    move-result v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 141
    if-eqz v2, :cond_5

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :goto_3
    monitor-exit v1

    .line 145
    throw p1

    .line 146
    :cond_6
    :goto_4
    new-instance p2, Lb/e;

    .line 147
    .line 148
    new-instance v1, Lab/e;

    .line 149
    .line 150
    const/16 v2, 0xc

    .line 151
    .line 152
    invoke-direct {v1, p1, p0, v0, v2}, Lab/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 153
    .line 154
    .line 155
    invoke-direct {p2, v1}, Lb/e;-><init>(Lab/e;)V

    .line 156
    .line 157
    .line 158
    return-object p2

    .line 159
    :goto_5
    monitor-exit v1

    .line 160
    throw p1
.end method

.method public e(I)Ljava/text/Bidi;
    .locals 14

    .line 1
    iget-object v0, p0, Lbe/k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/text/Layout;

    .line 4
    .line 5
    iget-object v1, p0, Lbe/k;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v2, p0, Lbe/k;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v3, p0, Lbe/k;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, [Z

    .line 16
    .line 17
    aget-boolean v4, v3, p1

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/text/Bidi;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    const/4 v4, 0x0

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    move v5, v4

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    add-int/lit8 v5, p1, -0x1

    .line 34
    .line 35
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    :goto_0
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/lang/Number;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    sub-int v11, v1, v5

    .line 56
    .line 57
    iget-object v6, p0, Lbe/k;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, [C

    .line 60
    .line 61
    if-eqz v6, :cond_3

    .line 62
    .line 63
    array-length v7, v6

    .line 64
    if-ge v7, v11, :cond_2

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    :goto_1
    move-object v7, v6

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    :goto_2
    new-array v6, v11, [C

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :goto_3
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-static {v6, v5, v1, v7, v4}, Landroid/text/TextUtils;->getChars(Ljava/lang/CharSequence;II[CI)V

    .line 77
    .line 78
    .line 79
    invoke-static {v7, v4, v11}, Ljava/text/Bidi;->requiresBidi([CII)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    const/4 v5, 0x0

    .line 84
    const/4 v13, 0x1

    .line 85
    if-eqz v1, :cond_5

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lbe/k;->k(I)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const/4 v1, -0x1

    .line 100
    if-ne v0, v1, :cond_4

    .line 101
    .line 102
    move v12, v13

    .line 103
    goto :goto_4

    .line 104
    :cond_4
    move v12, v4

    .line 105
    :goto_4
    new-instance v6, Ljava/text/Bidi;

    .line 106
    .line 107
    const/4 v9, 0x0

    .line 108
    const/4 v10, 0x0

    .line 109
    const/4 v8, 0x0

    .line 110
    invoke-direct/range {v6 .. v12}, Ljava/text/Bidi;-><init>([CI[BIII)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/text/Bidi;->getRunCount()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-ne v0, v13, :cond_6

    .line 118
    .line 119
    :cond_5
    move-object v6, v5

    .line 120
    :cond_6
    invoke-virtual {v2, p1, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    aput-boolean v13, v3, p1

    .line 124
    .line 125
    if-eqz v6, :cond_8

    .line 126
    .line 127
    iget-object p1, p0, Lbe/k;->e:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p1, [C

    .line 130
    .line 131
    if-ne v7, p1, :cond_7

    .line 132
    .line 133
    move-object v7, v5

    .line 134
    goto :goto_5

    .line 135
    :cond_7
    move-object v7, p1

    .line 136
    :cond_8
    :goto_5
    iput-object v7, p0, Lbe/k;->e:Ljava/lang/Object;

    .line 137
    .line 138
    return-object v6
.end method

.method public f(Lfg/l;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lbe/k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lbe/k;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lf/f0;

    .line 7
    .line 8
    iget-object v2, p0, Lbe/k;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lf/f0;

    .line 11
    .line 12
    iput-object v2, p0, Lbe/k;->d:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v1, p0, Lbe/k;->e:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v2, p0, Lbe/k;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Ls0/a;

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    ushr-int/lit8 v4, v3, 0x1b

    .line 25
    .line 26
    and-int/lit8 v4, v4, 0xf

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    and-int/lit8 v4, v4, 0xf

    .line 31
    .line 32
    shl-int/lit8 v4, v4, 0x1b

    .line 33
    .line 34
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    iget v2, v1, Lf/f0;->b:I

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    :goto_0
    if-ge v3, v2, :cond_1

    .line 44
    .line 45
    invoke-virtual {v1, v3}, Lf/f0;->f(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {p1, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {v1}, Lf/f0;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :goto_1
    monitor-exit v0

    .line 63
    throw p1
.end method

.method public g(IZ)F
    .locals 2

    .line 1
    iget-object v0, p0, Lbe/k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/text/Layout;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineEnd(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-le p1, v1, :cond_0

    .line 14
    .line 15
    move p1, v1

    .line 16
    :cond_0
    if-eqz p2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_1
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getSecondaryHorizontal(I)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method

.method public h(Lod/c;)Lod/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lbe/k;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lbe/k;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lod/c;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v1, p0, Lbe/k;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v1, p1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    monitor-exit v0

    .line 30
    return-object p1

    .line 31
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw p1
.end method

.method public i(IZZ)F
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v0, Lbe/k;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Landroid/text/Layout;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    invoke-virtual/range {p0 .. p2}, Lbe/k;->g(IZ)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    return v1

    .line 18
    :cond_0
    invoke-static {v3, v1, v2}, Lj2/g;->d(Landroid/text/Layout;IZ)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineStart(I)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineEnd(I)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eq v1, v5, :cond_1

    .line 31
    .line 32
    if-eq v1, v6, :cond_1

    .line 33
    .line 34
    invoke-virtual/range {p0 .. p2}, Lbe/k;->g(IZ)F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    return v1

    .line 39
    :cond_1
    if-eqz v1, :cond_22

    .line 40
    .line 41
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-ne v1, v7, :cond_2

    .line 50
    .line 51
    goto/16 :goto_10

    .line 52
    .line 53
    :cond_2
    invoke-virtual {v0, v1, v2}, Lbe/k;->j(IZ)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {v0, v2}, Lbe/k;->k(I)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    invoke-virtual {v3, v7}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    invoke-virtual {v3, v7}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    const/4 v8, -0x1

    .line 70
    const/4 v10, 0x1

    .line 71
    if-ne v7, v8, :cond_3

    .line 72
    .line 73
    move v7, v10

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    const/4 v7, 0x0

    .line 76
    :goto_0
    invoke-virtual {v0, v6, v5}, Lbe/k;->l(II)I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    invoke-virtual {v0, v2}, Lbe/k;->k(I)I

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    sub-int v12, v5, v11

    .line 85
    .line 86
    sub-int v11, v6, v11

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Lbe/k;->e(I)Ljava/text/Bidi;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    if-eqz v2, :cond_4

    .line 93
    .line 94
    invoke-virtual {v2, v12, v11}, Ljava/text/Bidi;->createLineBidi(II)Ljava/text/Bidi;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    goto :goto_1

    .line 99
    :cond_4
    const/4 v2, 0x0

    .line 100
    :goto_1
    if-eqz v2, :cond_5

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    .line 103
    .line 104
    .line 105
    move-result v11

    .line 106
    if-ne v11, v10, :cond_6

    .line 107
    .line 108
    :cond_5
    const/4 v13, 0x0

    .line 109
    goto/16 :goto_d

    .line 110
    .line 111
    :cond_6
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    new-array v12, v11, [Lj2/e;

    .line 116
    .line 117
    const/4 v13, 0x0

    .line 118
    :goto_2
    if-ge v13, v11, :cond_8

    .line 119
    .line 120
    new-instance v14, Lj2/e;

    .line 121
    .line 122
    invoke-virtual {v2, v13}, Ljava/text/Bidi;->getRunStart(I)I

    .line 123
    .line 124
    .line 125
    move-result v15

    .line 126
    add-int/2addr v15, v5

    .line 127
    invoke-virtual {v2, v13}, Ljava/text/Bidi;->getRunLimit(I)I

    .line 128
    .line 129
    .line 130
    move-result v16

    .line 131
    add-int v8, v16, v5

    .line 132
    .line 133
    invoke-virtual {v2, v13}, Ljava/text/Bidi;->getRunLevel(I)I

    .line 134
    .line 135
    .line 136
    move-result v16

    .line 137
    rem-int/lit8 v9, v16, 0x2

    .line 138
    .line 139
    if-ne v9, v10, :cond_7

    .line 140
    .line 141
    move v9, v10

    .line 142
    goto :goto_3

    .line 143
    :cond_7
    const/4 v9, 0x0

    .line 144
    :goto_3
    invoke-direct {v14, v15, v8, v9}, Lj2/e;-><init>(IIZ)V

    .line 145
    .line 146
    .line 147
    aput-object v14, v12, v13

    .line 148
    .line 149
    add-int/lit8 v13, v13, 0x1

    .line 150
    .line 151
    const/4 v8, -0x1

    .line 152
    goto :goto_2

    .line 153
    :cond_8
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    new-array v9, v8, [B

    .line 158
    .line 159
    const/4 v13, 0x0

    .line 160
    :goto_4
    if-ge v13, v8, :cond_9

    .line 161
    .line 162
    invoke-virtual {v2, v13}, Ljava/text/Bidi;->getRunLevel(I)I

    .line 163
    .line 164
    .line 165
    move-result v14

    .line 166
    int-to-byte v14, v14

    .line 167
    aput-byte v14, v9, v13

    .line 168
    .line 169
    add-int/lit8 v13, v13, 0x1

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_9
    const/4 v13, 0x0

    .line 173
    invoke-static {v9, v13, v12, v13, v11}, Ljava/text/Bidi;->reorderVisually([BI[Ljava/lang/Object;II)V

    .line 174
    .line 175
    .line 176
    if-ne v1, v5, :cond_12

    .line 177
    .line 178
    move v2, v13

    .line 179
    :goto_5
    if-ge v2, v11, :cond_b

    .line 180
    .line 181
    aget-object v5, v12, v2

    .line 182
    .line 183
    iget v5, v5, Lj2/e;->a:I

    .line 184
    .line 185
    if-ne v5, v1, :cond_a

    .line 186
    .line 187
    move v8, v2

    .line 188
    goto :goto_6

    .line 189
    :cond_a
    add-int/lit8 v2, v2, 0x1

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_b
    const/4 v8, -0x1

    .line 193
    :goto_6
    aget-object v1, v12, v8

    .line 194
    .line 195
    if-nez p2, :cond_d

    .line 196
    .line 197
    iget-boolean v1, v1, Lj2/e;->c:Z

    .line 198
    .line 199
    if-ne v7, v1, :cond_c

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_c
    move v9, v7

    .line 203
    goto :goto_8

    .line 204
    :cond_d
    :goto_7
    if-nez v7, :cond_e

    .line 205
    .line 206
    move v9, v10

    .line 207
    goto :goto_8

    .line 208
    :cond_e
    move v9, v13

    .line 209
    :goto_8
    if-nez v8, :cond_f

    .line 210
    .line 211
    if-eqz v9, :cond_f

    .line 212
    .line 213
    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineLeft(I)F

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    return v1

    .line 218
    :cond_f
    sub-int/2addr v11, v10

    .line 219
    if-ne v8, v11, :cond_10

    .line 220
    .line 221
    if-nez v9, :cond_10

    .line 222
    .line 223
    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineRight(I)F

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    return v1

    .line 228
    :cond_10
    if-eqz v9, :cond_11

    .line 229
    .line 230
    sub-int/2addr v8, v10

    .line 231
    aget-object v1, v12, v8

    .line 232
    .line 233
    iget v1, v1, Lj2/e;->a:I

    .line 234
    .line 235
    invoke-virtual {v3, v1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    return v1

    .line 240
    :cond_11
    add-int/2addr v8, v10

    .line 241
    aget-object v1, v12, v8

    .line 242
    .line 243
    iget v1, v1, Lj2/e;->a:I

    .line 244
    .line 245
    invoke-virtual {v3, v1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    return v1

    .line 250
    :cond_12
    if-le v1, v6, :cond_13

    .line 251
    .line 252
    invoke-virtual {v0, v1, v5}, Lbe/k;->l(II)I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    :cond_13
    move v2, v13

    .line 257
    :goto_9
    if-ge v2, v11, :cond_15

    .line 258
    .line 259
    aget-object v5, v12, v2

    .line 260
    .line 261
    iget v5, v5, Lj2/e;->b:I

    .line 262
    .line 263
    if-ne v5, v1, :cond_14

    .line 264
    .line 265
    move v8, v2

    .line 266
    goto :goto_a

    .line 267
    :cond_14
    add-int/lit8 v2, v2, 0x1

    .line 268
    .line 269
    goto :goto_9

    .line 270
    :cond_15
    const/4 v8, -0x1

    .line 271
    :goto_a
    aget-object v1, v12, v8

    .line 272
    .line 273
    if-nez p2, :cond_18

    .line 274
    .line 275
    iget-boolean v1, v1, Lj2/e;->c:Z

    .line 276
    .line 277
    if-ne v7, v1, :cond_16

    .line 278
    .line 279
    goto :goto_b

    .line 280
    :cond_16
    if-nez v7, :cond_17

    .line 281
    .line 282
    move v9, v10

    .line 283
    goto :goto_c

    .line 284
    :cond_17
    move v9, v13

    .line 285
    goto :goto_c

    .line 286
    :cond_18
    :goto_b
    move v9, v7

    .line 287
    :goto_c
    if-nez v8, :cond_19

    .line 288
    .line 289
    if-eqz v9, :cond_19

    .line 290
    .line 291
    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineLeft(I)F

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    return v1

    .line 296
    :cond_19
    sub-int/2addr v11, v10

    .line 297
    if-ne v8, v11, :cond_1a

    .line 298
    .line 299
    if-nez v9, :cond_1a

    .line 300
    .line 301
    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineRight(I)F

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    return v1

    .line 306
    :cond_1a
    if-eqz v9, :cond_1b

    .line 307
    .line 308
    sub-int/2addr v8, v10

    .line 309
    aget-object v1, v12, v8

    .line 310
    .line 311
    iget v1, v1, Lj2/e;->b:I

    .line 312
    .line 313
    invoke-virtual {v3, v1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    return v1

    .line 318
    :cond_1b
    add-int/2addr v8, v10

    .line 319
    aget-object v1, v12, v8

    .line 320
    .line 321
    iget v1, v1, Lj2/e;->b:I

    .line 322
    .line 323
    invoke-virtual {v3, v1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    return v1

    .line 328
    :goto_d
    invoke-virtual {v3, v5}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    if-nez p2, :cond_1c

    .line 333
    .line 334
    if-ne v7, v2, :cond_1e

    .line 335
    .line 336
    :cond_1c
    if-nez v7, :cond_1d

    .line 337
    .line 338
    move v7, v10

    .line 339
    goto :goto_e

    .line 340
    :cond_1d
    move v7, v13

    .line 341
    :cond_1e
    :goto_e
    if-ne v1, v5, :cond_1f

    .line 342
    .line 343
    move v9, v7

    .line 344
    goto :goto_f

    .line 345
    :cond_1f
    if-nez v7, :cond_20

    .line 346
    .line 347
    move v9, v10

    .line 348
    goto :goto_f

    .line 349
    :cond_20
    move v9, v13

    .line 350
    :goto_f
    if-eqz v9, :cond_21

    .line 351
    .line 352
    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineLeft(I)F

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    return v1

    .line 357
    :cond_21
    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineRight(I)F

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    return v1

    .line 362
    :cond_22
    :goto_10
    invoke-virtual/range {p0 .. p2}, Lbe/k;->g(IZ)F

    .line 363
    .line 364
    .line 365
    move-result v1

    .line 366
    return v1
.end method

.method public j(IZ)I
    .locals 2

    .line 1
    iget-object v0, p0, Lbe/k;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, La/a;->p(Ljava/util/ArrayList;Ljava/lang/Comparable;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-gez v1, :cond_0

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    neg-int v1, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    :goto_0
    if-eqz p2, :cond_1

    .line 22
    .line 23
    if-lez v1, :cond_1

    .line 24
    .line 25
    add-int/lit8 p2, v1, -0x1

    .line 26
    .line 27
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-ne p1, v0, :cond_1

    .line 38
    .line 39
    return p2

    .line 40
    :cond_1
    return v1
.end method

.method public k(I)I
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    iget-object v0, p0, Lbe/k;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    add-int/lit8 p1, p1, -0x1

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public l(II)I
    .locals 2

    .line 1
    :goto_0
    if-le p1, p2, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lbe/k;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/text/Layout;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    add-int/lit8 v1, p1, -0x1

    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x20

    .line 18
    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    const/16 v1, 0xa

    .line 22
    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    const/16 v1, 0x1680

    .line 26
    .line 27
    if-eq v0, v1, :cond_2

    .line 28
    .line 29
    const/16 v1, 0x2000

    .line 30
    .line 31
    invoke-static {v0, v1}, Lgg/l;->c(II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ltz v1, :cond_0

    .line 36
    .line 37
    const/16 v1, 0x200a

    .line 38
    .line 39
    invoke-static {v0, v1}, Lgg/l;->c(II)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-gtz v1, :cond_0

    .line 44
    .line 45
    const/16 v1, 0x2007

    .line 46
    .line 47
    if-ne v0, v1, :cond_2

    .line 48
    .line 49
    :cond_0
    const/16 v1, 0x205f

    .line 50
    .line 51
    if-eq v0, v1, :cond_2

    .line 52
    .line 53
    const/16 v1, 0x3000

    .line 54
    .line 55
    if-ne v0, v1, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    return p1

    .line 59
    :cond_2
    :goto_1
    add-int/lit8 p1, p1, -0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    return p1
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lna/a;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p2

    .line 4
    .line 5
    move-object/from16 v1, p4

    .line 6
    .line 7
    iget-object v2, v0, Lbe/k;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lb5/c;

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p2}, Lbe/k;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    iget-object v3, v0, Lbe/k;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Lb5/c;

    .line 18
    .line 19
    iget-object v4, v3, Lb5/c;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Landroid/content/Context;

    .line 22
    .line 23
    iget-object v3, v3, Lb5/c;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Lna/k;

    .line 26
    .line 27
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    const-string v8, "Hchat_redpacket_config"

    .line 32
    .line 33
    const-string v9, ""

    .line 34
    .line 35
    const/4 v10, 0x1

    .line 36
    const/4 v11, 0x0

    .line 37
    if-eqz v7, :cond_0

    .line 38
    .line 39
    :catchall_0
    move v7, v11

    .line 40
    goto :goto_3

    .line 41
    :cond_0
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-eqz v7, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    if-eqz v6, :cond_3

    .line 49
    .line 50
    iget-object v7, v3, Lna/k;->a:Ljava/util/Set;

    .line 51
    .line 52
    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    invoke-static {v6}, Lf8/i;->s0(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v12

    .line 67
    if-nez v12, :cond_3

    .line 68
    .line 69
    iget-object v12, v3, Lna/k;->b:Ljava/util/Set;

    .line 70
    .line 71
    invoke-interface {v12, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_3

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    :goto_0
    invoke-static {v6}, Lf8/i;->s0(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    if-nez v12, :cond_4

    .line 87
    .line 88
    const-string v12, "sendid:"

    .line 89
    .line 90
    invoke-virtual {v12, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    goto :goto_1

    .line 95
    :cond_4
    if-eqz v6, :cond_5

    .line 96
    .line 97
    move-object v7, v6

    .line 98
    goto :goto_1

    .line 99
    :cond_5
    move-object v7, v9

    .line 100
    :goto_1
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result v12

    .line 104
    if-nez v12, :cond_6

    .line 105
    .line 106
    iget-object v12, v3, Lna/k;->c:Ljava/util/Set;

    .line 107
    .line 108
    invoke-interface {v12, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eqz v7, :cond_6

    .line 113
    .line 114
    :goto_2
    move v7, v10

    .line 115
    goto :goto_3

    .line 116
    :cond_6
    :try_start_0
    invoke-static {v4, v8}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-static {v6}, Lb5/c;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    invoke-interface {v7, v12, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 125
    .line 126
    .line 127
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    :goto_3
    if-eqz v7, :cond_7

    .line 129
    .line 130
    goto/16 :goto_8

    .line 131
    .line 132
    :cond_7
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_8

    .line 137
    .line 138
    const-string v7, "f_"

    .line 139
    .line 140
    const-string v12, "_"

    .line 141
    .line 142
    move-object/from16 v13, p3

    .line 143
    .line 144
    invoke-static {v7, v5, v12, v13}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    goto :goto_4

    .line 149
    :cond_8
    move-object v7, v6

    .line 150
    :goto_4
    const-string v12, "hb_stats_failed"

    .line 151
    .line 152
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    if-nez v13, :cond_9

    .line 157
    .line 158
    move-object v13, v6

    .line 159
    goto :goto_5

    .line 160
    :cond_9
    move-object v13, v7

    .line 161
    :goto_5
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 162
    .line 163
    .line 164
    move-result v14

    .line 165
    if-nez v14, :cond_b

    .line 166
    .line 167
    const-string v14, "stat:"

    .line 168
    .line 169
    invoke-static {v14, v13}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 174
    .line 175
    .line 176
    move-result v14

    .line 177
    if-nez v14, :cond_a

    .line 178
    .line 179
    iget-object v3, v3, Lna/k;->e:Ljava/util/Set;

    .line 180
    .line 181
    invoke-interface {v3, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eqz v3, :cond_a

    .line 186
    .line 187
    move v3, v10

    .line 188
    goto :goto_6

    .line 189
    :cond_a
    move v3, v11

    .line 190
    :goto_6
    if-nez v3, :cond_b

    .line 191
    .line 192
    goto :goto_7

    .line 193
    :cond_b
    :try_start_1
    invoke-static {v4, v8}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-interface {v3, v12, v11}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    add-int/2addr v3, v10

    .line 206
    invoke-interface {v4, v12, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 211
    .line 212
    .line 213
    :catchall_1
    :goto_7
    iget-boolean v8, v1, Lna/a;->E:Z

    .line 214
    .line 215
    iget-boolean v3, v1, Lna/a;->F:Z

    .line 216
    .line 217
    if-nez v8, :cond_c

    .line 218
    .line 219
    if-nez v3, :cond_c

    .line 220
    .line 221
    goto :goto_8

    .line 222
    :cond_c
    move v4, v10

    .line 223
    iget-boolean v10, v1, Lna/a;->y:Z

    .line 224
    .line 225
    move v12, v11

    .line 226
    iget-boolean v11, v1, Lna/a;->A:Z

    .line 227
    .line 228
    move v13, v12

    .line 229
    iget-object v12, v1, Lna/a;->B:Ljava/lang/String;

    .line 230
    .line 231
    iget-object v14, v0, Lbe/k;->a:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v14, Lna/k;

    .line 234
    .line 235
    const-string v15, "notify:"

    .line 236
    .line 237
    invoke-static {v15, v7}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 242
    .line 243
    .line 244
    move-result v15

    .line 245
    if-nez v15, :cond_d

    .line 246
    .line 247
    iget-object v14, v14, Lna/k;->e:Ljava/util/Set;

    .line 248
    .line 249
    invoke-interface {v14, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    if-eqz v7, :cond_d

    .line 254
    .line 255
    move v13, v4

    .line 256
    :cond_d
    if-nez v13, :cond_e

    .line 257
    .line 258
    :goto_8
    return-void

    .line 259
    :cond_e
    iget-object v4, v0, Lbe/k;->d:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v4, Lsa/c;

    .line 262
    .line 263
    iget-object v7, v0, Lbe/k;->b:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v7, Ll3/l;

    .line 266
    .line 267
    const-string v13, "hb_notify_failed_title"

    .line 268
    .line 269
    const-string v14, "\u672a\u62a2\u5230\u7ea2\u5305"

    .line 270
    .line 271
    invoke-virtual {v7, v13, v14}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    invoke-virtual {v2, v7, v9, v5, v6}, Lb5/c;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    iget-object v13, v1, Lna/a;->G:Ljava/lang/String;

    .line 280
    .line 281
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 282
    .line 283
    .line 284
    move-result v15

    .line 285
    if-eqz v15, :cond_f

    .line 286
    .line 287
    move-object v13, v14

    .line 288
    :cond_f
    invoke-virtual {v2, v13, v9, v5, v6}, Lb5/c;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v13

    .line 292
    iget-object v1, v1, Lna/a;->H:Ljava/lang/String;

    .line 293
    .line 294
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 295
    .line 296
    .line 297
    move-result v15

    .line 298
    if-eqz v15, :cond_10

    .line 299
    .line 300
    goto :goto_9

    .line 301
    :cond_10
    move-object v14, v1

    .line 302
    :goto_9
    invoke-virtual {v2, v14, v9, v5, v6}, Lb5/c;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    move-object v2, v7

    .line 307
    const v7, 0x186a0

    .line 308
    .line 309
    .line 310
    move-object v9, v4

    .line 311
    move-object v4, v1

    .line 312
    move-object v1, v9

    .line 313
    move v9, v3

    .line 314
    move-object v3, v13

    .line 315
    invoke-virtual/range {v1 .. v12}, Lsa/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZZZLjava/lang/String;)V

    .line 316
    .line 317
    .line 318
    return-void
.end method

.method public n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lna/a;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v6, p3

    .line 6
    .line 7
    move-object/from16 v2, p4

    .line 8
    .line 9
    iget-object v3, v0, Lbe/k;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lb5/c;

    .line 12
    .line 13
    move-object/from16 v4, p2

    .line 14
    .line 15
    invoke-virtual {v0, v4, v6}, Lbe/k;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iget-object v4, v0, Lbe/k;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Lb5/c;

    .line 22
    .line 23
    const-string v7, "hb_stats_amount"

    .line 24
    .line 25
    iget-object v8, v4, Lb5/c;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v8, Lna/k;

    .line 28
    .line 29
    iget-object v8, v8, Lna/k;->c:Ljava/util/Set;

    .line 30
    .line 31
    const-string v9, "\u8bb0\u5f55\u672c\u4eba\u5b9e\u6536\u91d1\u989d: "

    .line 32
    .line 33
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    const-string v11, "\u5143"

    .line 38
    .line 39
    const-string v12, ""

    .line 40
    .line 41
    if-nez v10, :cond_0

    .line 42
    .line 43
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    if-eqz v10, :cond_1

    .line 48
    .line 49
    :catchall_0
    :cond_0
    :goto_0
    move-object/from16 v18, v3

    .line 50
    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    const/4 v13, 0x0

    .line 58
    if-eqz v10, :cond_2

    .line 59
    .line 60
    :catchall_1
    :goto_1
    move v10, v13

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    :try_start_0
    const-string v10, "[^0-9.\\-]"

    .line 63
    .line 64
    invoke-virtual {v1, v10, v12}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v14

    .line 72
    if-eqz v14, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    invoke-static {v10}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 76
    .line 77
    .line 78
    move-result-wide v14

    .line 79
    const-wide/high16 v16, 0x4059000000000000L    # 100.0

    .line 80
    .line 81
    mul-double v14, v14, v16

    .line 82
    .line 83
    invoke-static {v14, v15}, Ljava/lang/Math;->round(D)J

    .line 84
    .line 85
    .line 86
    move-result-wide v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 87
    long-to-int v10, v14

    .line 88
    :goto_2
    if-gtz v10, :cond_4

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    :try_start_1
    iget-object v14, v4, Lb5/c;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v14, Landroid/content/Context;

    .line 94
    .line 95
    const-string v15, "Hchat_redpacket_config"

    .line 96
    .line 97
    invoke-static {v14, v15}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 98
    .line 99
    .line 100
    move-result-object v14

    .line 101
    invoke-static {v6}, Lb5/c;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v15

    .line 105
    invoke-interface {v14, v15, v13}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 106
    .line 107
    .line 108
    move-result v16

    .line 109
    if-nez v16, :cond_0

    .line 110
    .line 111
    invoke-static {v6}, Lf8/i;->s0(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v13

    .line 115
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    move/from16 v17, v10

    .line 120
    .line 121
    const-string v10, "sendid:"

    .line 122
    .line 123
    if-nez v16, :cond_5

    .line 124
    .line 125
    :try_start_2
    invoke-virtual {v10, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    goto :goto_3

    .line 130
    :cond_5
    if-eqz v6, :cond_6

    .line 131
    .line 132
    move-object v13, v6

    .line 133
    goto :goto_3

    .line 134
    :cond_6
    move-object v13, v12

    .line 135
    :goto_3
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 136
    .line 137
    .line 138
    move-result v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 139
    move-object/from16 v18, v3

    .line 140
    .line 141
    const/4 v3, 0x1

    .line 142
    if-nez v16, :cond_7

    .line 143
    .line 144
    :try_start_3
    invoke-interface {v8, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v13

    .line 148
    if-eqz v13, :cond_7

    .line 149
    .line 150
    move v13, v3

    .line 151
    goto :goto_4

    .line 152
    :cond_7
    const/4 v13, 0x0

    .line 153
    :goto_4
    if-eqz v13, :cond_8

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_8
    invoke-static {v6}, Lf8/i;->s0(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v13

    .line 160
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v16

    .line 164
    if-nez v16, :cond_9

    .line 165
    .line 166
    invoke-virtual {v10, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    goto :goto_5

    .line 171
    :cond_9
    if-eqz v6, :cond_a

    .line 172
    .line 173
    move-object v10, v6

    .line 174
    goto :goto_5

    .line 175
    :cond_a
    move-object v10, v12

    .line 176
    :goto_5
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 177
    .line 178
    .line 179
    move-result v13

    .line 180
    if-nez v13, :cond_b

    .line 181
    .line 182
    invoke-interface {v8, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v8

    .line 186
    if-eqz v8, :cond_b

    .line 187
    .line 188
    invoke-interface {v14}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    const/4 v10, 0x0

    .line 193
    invoke-interface {v14, v7, v10}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    add-int v10, v10, v17

    .line 198
    .line 199
    invoke-interface {v8, v7, v10}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    invoke-interface {v7, v15, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 208
    .line 209
    .line 210
    new-instance v3, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v3, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    iget-object v4, v4, Lb5/c;->c:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v4, Lna/b;

    .line 228
    .line 229
    iget-object v4, v4, Lna/b;->h:Lna/e;

    .line 230
    .line 231
    invoke-virtual {v4, v3}, Lna/e;->d(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 232
    .line 233
    .line 234
    :catchall_2
    :cond_b
    :goto_6
    iget-boolean v8, v2, Lna/a;->w:Z

    .line 235
    .line 236
    iget-boolean v9, v2, Lna/a;->x:Z

    .line 237
    .line 238
    if-nez v8, :cond_c

    .line 239
    .line 240
    if-nez v9, :cond_c

    .line 241
    .line 242
    goto/16 :goto_b

    .line 243
    .line 244
    :cond_c
    iget-boolean v10, v2, Lna/a;->y:Z

    .line 245
    .line 246
    iget-boolean v3, v2, Lna/a;->A:Z

    .line 247
    .line 248
    iget-object v4, v2, Lna/a;->B:Ljava/lang/String;

    .line 249
    .line 250
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    if-eqz v7, :cond_d

    .line 255
    .line 256
    const-string v7, "t_"

    .line 257
    .line 258
    const-string v13, "_"

    .line 259
    .line 260
    invoke-static {v7, v5, v13, v1}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    goto :goto_7

    .line 265
    :cond_d
    move-object v7, v6

    .line 266
    :goto_7
    iget-object v13, v0, Lbe/k;->a:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v13, Lna/k;

    .line 269
    .line 270
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 271
    .line 272
    .line 273
    move-result v14

    .line 274
    if-nez v14, :cond_12

    .line 275
    .line 276
    iget-object v13, v13, Lna/k;->d:Ljava/util/Set;

    .line 277
    .line 278
    if-eqz v7, :cond_e

    .line 279
    .line 280
    goto :goto_8

    .line 281
    :cond_e
    move-object v7, v12

    .line 282
    :goto_8
    invoke-interface {v13, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    if-eqz v7, :cond_12

    .line 287
    .line 288
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    if-eqz v7, :cond_f

    .line 293
    .line 294
    const-string v1, "\u672a\u77e5"

    .line 295
    .line 296
    goto :goto_9

    .line 297
    :cond_f
    invoke-virtual {v1, v11, v12}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    :goto_9
    iget-object v7, v0, Lbe/k;->d:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v7, Lsa/c;

    .line 304
    .line 305
    iget-object v11, v0, Lbe/k;->b:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v11, Ll3/l;

    .line 308
    .line 309
    const-string v12, "hb_notify_title"

    .line 310
    .line 311
    const-string v13, "\u81ea\u52a8\u62a2\u7ea2\u5305"

    .line 312
    .line 313
    invoke-virtual {v11, v12, v13}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v11

    .line 317
    move-object/from16 v12, v18

    .line 318
    .line 319
    invoke-virtual {v12, v11, v1, v5, v6}, Lb5/c;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v11

    .line 323
    iget-object v13, v2, Lna/a;->C:Ljava/lang/String;

    .line 324
    .line 325
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 326
    .line 327
    .line 328
    move-result v14

    .line 329
    const-string v15, "\u62a2\u5230\u7ea2\u5305 {amount} \u5143"

    .line 330
    .line 331
    if-eqz v14, :cond_10

    .line 332
    .line 333
    move-object v13, v15

    .line 334
    :cond_10
    invoke-virtual {v12, v13, v1, v5, v6}, Lb5/c;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v13

    .line 338
    iget-object v2, v2, Lna/a;->D:Ljava/lang/String;

    .line 339
    .line 340
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 341
    .line 342
    .line 343
    move-result v14

    .line 344
    if-eqz v14, :cond_11

    .line 345
    .line 346
    goto :goto_a

    .line 347
    :cond_11
    move-object v15, v2

    .line 348
    :goto_a
    invoke-virtual {v12, v15, v1, v5, v6}, Lb5/c;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    move-object v12, v4

    .line 353
    move-object v4, v1

    .line 354
    move-object v1, v7

    .line 355
    const/4 v7, 0x0

    .line 356
    move-object v2, v11

    .line 357
    move v11, v3

    .line 358
    move-object v3, v13

    .line 359
    invoke-virtual/range {v1 .. v12}, Lsa/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZZZLjava/lang/String;)V

    .line 360
    .line 361
    .line 362
    :cond_12
    :goto_b
    return-void
.end method

.method public o(Lod/d;)Lod/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lbe/k;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lbe/k;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lod/d;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v1, p0, Lbe/k;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v1, p1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    monitor-exit v0

    .line 30
    return-object p1

    .line 31
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw p1
.end method

.method public p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object p1, p0, Lbe/k;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Lna/k;

    .line 17
    .line 18
    iget-object p1, p1, Lna/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/lang/String;

    .line 25
    .line 26
    :cond_1
    :goto_0
    return-object p1
.end method
