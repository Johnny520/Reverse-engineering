.class public final synthetic Lwb/re;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Landroid/content/SharedPreferences;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Z

.field public final synthetic j:Lwb/q;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lfg/a;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:Lfg/a;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Li0/a1;

.field public final synthetic u:Li0/a1;

.field public final synthetic v:Li0/a1;

.field public final synthetic w:Li0/a1;

.field public final synthetic x:Li0/a1;

.field public final synthetic y:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Ljava/lang/String;ZLwb/q;Ljava/lang/String;Lfg/a;Ljava/lang/String;Ljava/util/List;Lfg/a;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/re;->g:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/re;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p3, p0, Lwb/re;->i:Z

    .line 9
    .line 10
    iput-object p4, p0, Lwb/re;->j:Lwb/q;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/re;->k:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/re;->l:Lfg/a;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/re;->m:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/re;->n:Ljava/util/List;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/re;->o:Lfg/a;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/re;->p:Li0/a1;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/re;->q:Li0/a1;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/re;->r:Li0/a1;

    .line 27
    .line 28
    iput-object p13, p0, Lwb/re;->s:Li0/a1;

    .line 29
    .line 30
    iput-object p14, p0, Lwb/re;->t:Li0/a1;

    .line 31
    .line 32
    iput-object p15, p0, Lwb/re;->u:Li0/a1;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lwb/re;->v:Li0/a1;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Lwb/re;->w:Li0/a1;

    .line 41
    .line 42
    move-object/from16 p1, p18

    .line 43
    .line 44
    iput-object p1, p0, Lwb/re;->x:Li0/a1;

    .line 45
    .line 46
    move-object/from16 p1, p19

    .line 47
    .line 48
    iput-object p1, p0, Lwb/re;->y:Li0/a1;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    check-cast v6, Li0/h0;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v9, 0x1

    .line 19
    const/4 v10, 0x0

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v9

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v10

    .line 25
    :goto_0
    and-int/2addr v1, v9

    .line 26
    invoke-virtual {v6, v1, v2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_18

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    const/16 v7, 0x6d80

    .line 34
    .line 35
    iget-object v1, v0, Lwb/re;->g:Landroid/content/SharedPreferences;

    .line 36
    .line 37
    iget-object v2, v0, Lwb/re;->h:Ljava/lang/String;

    .line 38
    .line 39
    const-string v3, "\u542f\u7528"

    .line 40
    .line 41
    const-string v4, "\u5f00\u542f\u540e\u81ea\u52a8\u5904\u7406\u8fd9\u4e2a\u573a\u666f"

    .line 42
    .line 43
    invoke-static/range {v1 .. v7}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 44
    .line 45
    .line 46
    move-object v7, v1

    .line 47
    const/4 v11, 0x0

    .line 48
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 49
    .line 50
    .line 51
    iget-object v1, v0, Lwb/re;->p:Li0/a1;

    .line 52
    .line 53
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    move-object v3, v2

    .line 58
    check-cast v3, Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    sget-object v12, Li0/l;->a:Li0/e;

    .line 65
    .line 66
    if-ne v2, v12, :cond_1

    .line 67
    .line 68
    new-instance v2, Lwb/tg;

    .line 69
    .line 70
    const/16 v4, 0xc

    .line 71
    .line 72
    invoke-direct {v2, v1, v4}, Lwb/tg;-><init>(Li0/a1;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    move-object v4, v2

    .line 79
    check-cast v4, Lfg/l;

    .line 80
    .line 81
    move-object v5, v6

    .line 82
    const/16 v6, 0xc36

    .line 83
    .line 84
    const-string v1, "\u5ef6\u8fdf\u53d1\u9001"

    .line 85
    .line 86
    const-string v2, "\u5355\u4f4d ms\uff0c\u901a\u8fc7\u597d\u53cb\u540e\u7b49\u5f85\u518d\u53d1\u6b22\u8fce\u5185\u5bb9"

    .line 87
    .line 88
    invoke-static/range {v1 .. v6}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 89
    .line 90
    .line 91
    move-object v6, v5

    .line 92
    iget-boolean v1, v0, Lwb/re;->i:Z

    .line 93
    .line 94
    const/4 v13, 0x6

    .line 95
    if-eqz v1, :cond_13

    .line 96
    .line 97
    const v1, 0x1219cf62

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 101
    .line 102
    .line 103
    iget-object v14, v0, Lwb/re;->j:Lwb/q;

    .line 104
    .line 105
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 109
    .line 110
    .line 111
    iget-object v2, v14, Lwb/q;->a:Ljava/lang/String;

    .line 112
    .line 113
    const/4 v5, 0x0

    .line 114
    move-object v1, v7

    .line 115
    const/16 v7, 0x6d80

    .line 116
    .line 117
    const-string v3, "\u81ea\u52a8\u6807\u7b7e\u65b0\u52a0\u597d\u53cb"

    .line 118
    .line 119
    const-string v4, "\u7ed9\u597d\u53cb\u6dfb\u52a0\u201c\u65b0\u52a0\u597d\u53cb\u201d\u6807\u7b7e"

    .line 120
    .line 121
    invoke-static/range {v1 .. v7}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 122
    .line 123
    .line 124
    move-object v15, v1

    .line 125
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 126
    .line 127
    .line 128
    iget-object v1, v0, Lwb/re;->q:Li0/a1;

    .line 129
    .line 130
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-virtual {v6, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-virtual {v6, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    or-int/2addr v3, v4

    .line 149
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    if-nez v3, :cond_2

    .line 154
    .line 155
    if-ne v4, v12, :cond_3

    .line 156
    .line 157
    :cond_2
    new-instance v4, Lwb/zg;

    .line 158
    .line 159
    const/4 v3, 0x0

    .line 160
    invoke-direct {v4, v15, v14, v1, v3}, Lwb/zg;-><init>(Landroid/content/SharedPreferences;Lwb/q;Li0/a1;I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_3
    move-object v5, v4

    .line 167
    check-cast v5, Lfg/l;

    .line 168
    .line 169
    const/16 v7, 0x1b0

    .line 170
    .line 171
    const/16 v8, 0x8

    .line 172
    .line 173
    move-object v3, v1

    .line 174
    move v1, v2

    .line 175
    const-string v2, "\u81ea\u52a8\u6807\u7b7e\u65e5\u671f"

    .line 176
    .line 177
    move-object v4, v3

    .line 178
    const-string v3, "\u6309\u65e5\u671f\u683c\u5f0f\u751f\u6210\u4e00\u4e2a\u6807\u7b7e"

    .line 179
    .line 180
    move-object/from16 v16, v4

    .line 181
    .line 182
    const/4 v4, 0x0

    .line 183
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 184
    .line 185
    .line 186
    invoke-interface/range {v16 .. v16}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v1, Ljava/lang/Boolean;

    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_5

    .line 197
    .line 198
    const v1, 0x122085d3

    .line 199
    .line 200
    .line 201
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 202
    .line 203
    .line 204
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 205
    .line 206
    .line 207
    iget-object v1, v0, Lwb/re;->r:Li0/a1;

    .line 208
    .line 209
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    move-object v3, v2

    .line 214
    check-cast v3, Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    if-ne v2, v12, :cond_4

    .line 221
    .line 222
    new-instance v2, Lwb/tg;

    .line 223
    .line 224
    const/16 v4, 0xd

    .line 225
    .line 226
    invoke-direct {v2, v1, v4}, Lwb/tg;-><init>(Li0/a1;I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    :cond_4
    move-object v5, v2

    .line 233
    check-cast v5, Lfg/l;

    .line 234
    .line 235
    const/16 v7, 0x6036

    .line 236
    .line 237
    const/16 v8, 0x8

    .line 238
    .line 239
    const-string v1, "\u6807\u7b7e\u65e5\u671f\u683c\u5f0f"

    .line 240
    .line 241
    const-string v2, "\u4f8b\u5982 yyyy-MM-dd"

    .line 242
    .line 243
    const/4 v4, 0x0

    .line 244
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 248
    .line 249
    .line 250
    goto :goto_1

    .line 251
    :cond_5
    const v1, 0x12231a83

    .line 252
    .line 253
    .line 254
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 258
    .line 259
    .line 260
    :goto_1
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 261
    .line 262
    .line 263
    iget-object v1, v0, Lwb/re;->s:Li0/a1;

    .line 264
    .line 265
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    check-cast v2, Ljava/lang/Boolean;

    .line 270
    .line 271
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    invoke-virtual {v6, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    invoke-virtual {v6, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    or-int/2addr v3, v4

    .line 284
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    if-nez v3, :cond_6

    .line 289
    .line 290
    if-ne v4, v12, :cond_7

    .line 291
    .line 292
    :cond_6
    new-instance v4, Lwb/zg;

    .line 293
    .line 294
    const/4 v3, 0x1

    .line 295
    invoke-direct {v4, v15, v14, v1, v3}, Lwb/zg;-><init>(Landroid/content/SharedPreferences;Lwb/q;Li0/a1;I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    :cond_7
    move-object v5, v4

    .line 302
    check-cast v5, Lfg/l;

    .line 303
    .line 304
    const/16 v7, 0x1b0

    .line 305
    .line 306
    const/16 v8, 0x8

    .line 307
    .line 308
    move-object v3, v1

    .line 309
    move v1, v2

    .line 310
    const-string v2, "\u81ea\u52a8\u6807\u7b7e\u5df2\u6709\u6807\u7b7e"

    .line 311
    .line 312
    move-object v4, v3

    .line 313
    const-string v3, "\u628a\u597d\u53cb\u52a0\u5165\u5df2\u9009\u62e9\u7684\u5fae\u4fe1\u6807\u7b7e"

    .line 314
    .line 315
    move-object/from16 v16, v4

    .line 316
    .line 317
    const/4 v4, 0x0

    .line 318
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 319
    .line 320
    .line 321
    invoke-interface/range {v16 .. v16}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    check-cast v1, Ljava/lang/Boolean;

    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    if-eqz v1, :cond_a

    .line 332
    .line 333
    const v1, 0x122864f2

    .line 334
    .line 335
    .line 336
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 337
    .line 338
    .line 339
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 340
    .line 341
    .line 342
    iget-object v1, v0, Lwb/re;->k:Ljava/lang/String;

    .line 343
    .line 344
    invoke-static {v1}, Lwb/ho;->h7(Ljava/lang/String;)Ljava/util/List;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    if-eqz v2, :cond_8

    .line 353
    .line 354
    const-string v1, "\u672a\u9009\u62e9"

    .line 355
    .line 356
    goto :goto_3

    .line 357
    :cond_8
    const/4 v2, 0x3

    .line 358
    invoke-static {v2, v1}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v16

    .line 362
    const/16 v20, 0x0

    .line 363
    .line 364
    const/16 v21, 0x3e

    .line 365
    .line 366
    const-string v17, "\u3001"

    .line 367
    .line 368
    const/16 v18, 0x0

    .line 369
    .line 370
    const/16 v19, 0x0

    .line 371
    .line 372
    invoke-static/range {v16 .. v21}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    if-le v4, v2, :cond_9

    .line 381
    .line 382
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    const-string v2, " \u7b49 "

    .line 387
    .line 388
    const-string v4, " \u4e2a"

    .line 389
    .line 390
    invoke-static {v1, v2, v4}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    goto :goto_2

    .line 395
    :cond_9
    const-string v1, ""

    .line 396
    .line 397
    :goto_2
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    :goto_3
    iget-object v2, v0, Lwb/re;->l:Lfg/a;

    .line 402
    .line 403
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    const-string v3, "\u9009\u62e9\u6807\u7b7e"

    .line 407
    .line 408
    invoke-static {v3, v1, v2, v6, v13}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 412
    .line 413
    .line 414
    goto :goto_4

    .line 415
    :cond_a
    const v1, 0x122afd63

    .line 416
    .line 417
    .line 418
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 422
    .line 423
    .line 424
    :goto_4
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 425
    .line 426
    .line 427
    iget-object v2, v14, Lwb/q;->f:Ljava/lang/String;

    .line 428
    .line 429
    const/4 v5, 0x0

    .line 430
    const/16 v7, 0x6d80

    .line 431
    .line 432
    const-string v3, "\u81ea\u52a8\u5907\u6ce8\u65b0\u52a0\u597d\u53cb"

    .line 433
    .line 434
    const-string v4, "\u5907\u6ce8\u91cc\u52a0\u5165\u201c\u65b0\u52a0\u597d\u53cb\u201d"

    .line 435
    .line 436
    move-object v1, v15

    .line 437
    invoke-static/range {v1 .. v7}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 438
    .line 439
    .line 440
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 441
    .line 442
    .line 443
    iget-object v2, v14, Lwb/q;->g:Ljava/lang/String;

    .line 444
    .line 445
    const-string v3, "\u52a0\u6635\u79f0\u540e\u9762"

    .line 446
    .line 447
    const-string v4, "\u5907\u6ce8\u683c\u5f0f\u4e3a\u5fae\u4fe1\u6635\u79f0 + \u5907\u6ce8\u5185\u5bb9"

    .line 448
    .line 449
    invoke-static/range {v1 .. v7}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 450
    .line 451
    .line 452
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 453
    .line 454
    .line 455
    iget-object v1, v0, Lwb/re;->t:Li0/a1;

    .line 456
    .line 457
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    check-cast v2, Ljava/lang/Boolean;

    .line 462
    .line 463
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 464
    .line 465
    .line 466
    move-result v2

    .line 467
    invoke-virtual {v6, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    invoke-virtual {v6, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    or-int/2addr v3, v4

    .line 476
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v4

    .line 480
    if-nez v3, :cond_b

    .line 481
    .line 482
    if-ne v4, v12, :cond_c

    .line 483
    .line 484
    :cond_b
    new-instance v4, Lwb/zg;

    .line 485
    .line 486
    const/4 v3, 0x2

    .line 487
    invoke-direct {v4, v15, v14, v1, v3}, Lwb/zg;-><init>(Landroid/content/SharedPreferences;Lwb/q;Li0/a1;I)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    :cond_c
    move-object v5, v4

    .line 494
    check-cast v5, Lfg/l;

    .line 495
    .line 496
    const/16 v7, 0x1b0

    .line 497
    .line 498
    const/16 v8, 0x8

    .line 499
    .line 500
    move-object v3, v1

    .line 501
    move v1, v2

    .line 502
    const-string v2, "\u81ea\u52a8\u5907\u6ce8\u65e5\u671f"

    .line 503
    .line 504
    move-object v4, v3

    .line 505
    const-string v3, "\u5907\u6ce8\u91cc\u52a0\u5165\u65e5\u671f"

    .line 506
    .line 507
    move-object/from16 v16, v4

    .line 508
    .line 509
    const/4 v4, 0x0

    .line 510
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 511
    .line 512
    .line 513
    invoke-interface/range {v16 .. v16}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    check-cast v1, Ljava/lang/Boolean;

    .line 518
    .line 519
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 520
    .line 521
    .line 522
    move-result v1

    .line 523
    if-eqz v1, :cond_e

    .line 524
    .line 525
    const v1, 0x12344a55

    .line 526
    .line 527
    .line 528
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 529
    .line 530
    .line 531
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 532
    .line 533
    .line 534
    iget-object v1, v0, Lwb/re;->u:Li0/a1;

    .line 535
    .line 536
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    move-object v3, v2

    .line 541
    check-cast v3, Ljava/lang/String;

    .line 542
    .line 543
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    if-ne v2, v12, :cond_d

    .line 548
    .line 549
    new-instance v2, Lwb/tg;

    .line 550
    .line 551
    const/16 v4, 0xe

    .line 552
    .line 553
    invoke-direct {v2, v1, v4}, Lwb/tg;-><init>(Li0/a1;I)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    :cond_d
    move-object v5, v2

    .line 560
    check-cast v5, Lfg/l;

    .line 561
    .line 562
    const/16 v7, 0x6036

    .line 563
    .line 564
    const/16 v8, 0x8

    .line 565
    .line 566
    const-string v1, "\u5907\u6ce8\u65e5\u671f\u683c\u5f0f"

    .line 567
    .line 568
    const-string v2, "\u4f8b\u5982 yyMMdd"

    .line 569
    .line 570
    const/4 v4, 0x0

    .line 571
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 575
    .line 576
    .line 577
    goto :goto_5

    .line 578
    :cond_e
    const v1, 0x1236d783

    .line 579
    .line 580
    .line 581
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 585
    .line 586
    .line 587
    :goto_5
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 588
    .line 589
    .line 590
    iget-object v1, v0, Lwb/re;->v:Li0/a1;

    .line 591
    .line 592
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    check-cast v2, Ljava/lang/Boolean;

    .line 597
    .line 598
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 599
    .line 600
    .line 601
    move-result v2

    .line 602
    invoke-virtual {v6, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    move-result v3

    .line 606
    invoke-virtual {v6, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v4

    .line 610
    or-int/2addr v3, v4

    .line 611
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v4

    .line 615
    if-nez v3, :cond_f

    .line 616
    .line 617
    if-ne v4, v12, :cond_10

    .line 618
    .line 619
    :cond_f
    new-instance v4, Lwb/zg;

    .line 620
    .line 621
    const/4 v3, 0x3

    .line 622
    invoke-direct {v4, v15, v14, v1, v3}, Lwb/zg;-><init>(Landroid/content/SharedPreferences;Lwb/q;Li0/a1;I)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    :cond_10
    move-object v5, v4

    .line 629
    check-cast v5, Lfg/l;

    .line 630
    .line 631
    const/16 v7, 0x1b0

    .line 632
    .line 633
    const/16 v8, 0x8

    .line 634
    .line 635
    move-object v3, v1

    .line 636
    move v1, v2

    .line 637
    const-string v2, "\u81ea\u52a8\u5907\u6ce8\u81ea\u5b9a\u4e49\u6587\u672c"

    .line 638
    .line 639
    move-object v4, v3

    .line 640
    const-string v3, "\u5907\u6ce8\u91cc\u52a0\u5165\u81ea\u5b9a\u4e49\u5185\u5bb9"

    .line 641
    .line 642
    move-object v14, v4

    .line 643
    const/4 v4, 0x0

    .line 644
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 645
    .line 646
    .line 647
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    check-cast v1, Ljava/lang/Boolean;

    .line 652
    .line 653
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 654
    .line 655
    .line 656
    move-result v1

    .line 657
    if-eqz v1, :cond_12

    .line 658
    .line 659
    const v1, 0x123c0a17

    .line 660
    .line 661
    .line 662
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 663
    .line 664
    .line 665
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 666
    .line 667
    .line 668
    iget-object v1, v0, Lwb/re;->w:Li0/a1;

    .line 669
    .line 670
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    move-object v3, v2

    .line 675
    check-cast v3, Ljava/lang/String;

    .line 676
    .line 677
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    if-ne v2, v12, :cond_11

    .line 682
    .line 683
    new-instance v2, Lwb/tg;

    .line 684
    .line 685
    const/16 v4, 0xf

    .line 686
    .line 687
    invoke-direct {v2, v1, v4}, Lwb/tg;-><init>(Li0/a1;I)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    :cond_11
    move-object v5, v2

    .line 694
    check-cast v5, Lfg/l;

    .line 695
    .line 696
    const/16 v7, 0x6036

    .line 697
    .line 698
    const/16 v8, 0x8

    .line 699
    .line 700
    const-string v1, "\u5907\u6ce8\u81ea\u5b9a\u4e49\u6587\u672c"

    .line 701
    .line 702
    const-string v2, "\u4f8b\u5982 \u6e20\u9053A"

    .line 703
    .line 704
    const/4 v4, 0x0

    .line 705
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 709
    .line 710
    .line 711
    goto :goto_6

    .line 712
    :cond_12
    const v1, 0x123e8fc3

    .line 713
    .line 714
    .line 715
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 719
    .line 720
    .line 721
    :goto_6
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 722
    .line 723
    .line 724
    goto/16 :goto_8

    .line 725
    .line 726
    :cond_13
    move-object v15, v7

    .line 727
    const v1, 0x123f3606

    .line 728
    .line 729
    .line 730
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 731
    .line 732
    .line 733
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 734
    .line 735
    .line 736
    iget-object v14, v0, Lwb/re;->x:Li0/a1;

    .line 737
    .line 738
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v1

    .line 742
    check-cast v1, Ljava/lang/Boolean;

    .line 743
    .line 744
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 745
    .line 746
    .line 747
    move-result v1

    .line 748
    invoke-virtual {v6, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 749
    .line 750
    .line 751
    move-result v2

    .line 752
    iget-object v3, v0, Lwb/re;->m:Ljava/lang/String;

    .line 753
    .line 754
    invoke-virtual {v6, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    move-result v4

    .line 758
    or-int/2addr v2, v4

    .line 759
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v4

    .line 763
    if-nez v2, :cond_14

    .line 764
    .line 765
    if-ne v4, v12, :cond_15

    .line 766
    .line 767
    :cond_14
    new-instance v4, Lwb/vb;

    .line 768
    .line 769
    const/4 v2, 0x6

    .line 770
    invoke-direct {v4, v15, v3, v14, v2}, Lwb/vb;-><init>(Landroid/content/SharedPreferences;Ljava/lang/String;Li0/a1;I)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 774
    .line 775
    .line 776
    :cond_15
    move-object v5, v4

    .line 777
    check-cast v5, Lfg/l;

    .line 778
    .line 779
    const/16 v7, 0x1b0

    .line 780
    .line 781
    const/16 v8, 0x8

    .line 782
    .line 783
    const-string v2, "\u81ea\u52a8\u6253\u6807\u7b7e"

    .line 784
    .line 785
    const-string v3, "\u5904\u7406\u540e\u628a\u597d\u53cb\u52a0\u5165\u6307\u5b9a\u6807\u7b7e"

    .line 786
    .line 787
    const/4 v4, 0x0

    .line 788
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 789
    .line 790
    .line 791
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    check-cast v1, Ljava/lang/Boolean;

    .line 796
    .line 797
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 798
    .line 799
    .line 800
    move-result v1

    .line 801
    if-eqz v1, :cond_17

    .line 802
    .line 803
    const v1, 0x12439988

    .line 804
    .line 805
    .line 806
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 807
    .line 808
    .line 809
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 810
    .line 811
    .line 812
    iget-object v1, v0, Lwb/re;->y:Li0/a1;

    .line 813
    .line 814
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v2

    .line 818
    move-object v3, v2

    .line 819
    check-cast v3, Ljava/lang/String;

    .line 820
    .line 821
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v2

    .line 825
    if-ne v2, v12, :cond_16

    .line 826
    .line 827
    new-instance v2, Lwb/tg;

    .line 828
    .line 829
    const/16 v4, 0x10

    .line 830
    .line 831
    invoke-direct {v2, v1, v4}, Lwb/tg;-><init>(Li0/a1;I)V

    .line 832
    .line 833
    .line 834
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 835
    .line 836
    .line 837
    :cond_16
    move-object v5, v2

    .line 838
    check-cast v5, Lfg/l;

    .line 839
    .line 840
    const/16 v7, 0x6036

    .line 841
    .line 842
    const/16 v8, 0x8

    .line 843
    .line 844
    const-string v1, "\u6807\u7b7e\u540d\u79f0"

    .line 845
    .line 846
    const-string v2, "\u6807\u7b7e\u9700\u8981\u5fae\u4fe1\u91cc\u5df2\u5b58\u5728"

    .line 847
    .line 848
    const/4 v4, 0x0

    .line 849
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 850
    .line 851
    .line 852
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 853
    .line 854
    .line 855
    goto :goto_7

    .line 856
    :cond_17
    const v1, 0x1245df63

    .line 857
    .line 858
    .line 859
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 860
    .line 861
    .line 862
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 863
    .line 864
    .line 865
    :goto_7
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 866
    .line 867
    .line 868
    :goto_8
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 869
    .line 870
    .line 871
    const-string v1, "\u56de\u590d\u6b65\u9aa4"

    .line 872
    .line 873
    iget-object v2, v0, Lwb/re;->n:Ljava/util/List;

    .line 874
    .line 875
    invoke-static {v2}, Lwb/ho;->l5(Ljava/util/List;)Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v2

    .line 879
    iget-object v3, v0, Lwb/re;->o:Lfg/a;

    .line 880
    .line 881
    invoke-static {v1, v2, v3, v6, v13}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 882
    .line 883
    .line 884
    goto :goto_9

    .line 885
    :cond_18
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 886
    .line 887
    .line 888
    :goto_9
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 889
    .line 890
    return-object v1
.end method
