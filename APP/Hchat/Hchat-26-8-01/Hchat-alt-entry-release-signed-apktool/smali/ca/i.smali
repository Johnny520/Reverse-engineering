.class public final synthetic Lca/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lca/e0;

.field public final synthetic i:Landroid/app/Activity;

.field public final synthetic j:J


# direct methods
.method public synthetic constructor <init>(Lca/e0;JLandroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lca/i;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lca/i;->h:Lca/e0;

    .line 8
    .line 9
    iput-wide p2, p0, Lca/i;->j:J

    .line 10
    .line 11
    iput-object p4, p0, Lca/i;->i:Landroid/app/Activity;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lca/e0;Landroid/app/Activity;JI)V
    .locals 0

    .line 14
    iput p5, p0, Lca/i;->g:I

    iput-object p1, p0, Lca/i;->h:Lca/e0;

    iput-object p2, p0, Lca/i;->i:Landroid/app/Activity;

    iput-wide p3, p0, Lca/i;->j:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lca/i;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    if-ne v1, v3, :cond_0

    .line 19
    .line 20
    move v9, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v9, v2

    .line 23
    :goto_0
    iget-object v5, v0, Lca/i;->h:Lca/e0;

    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v1, Ldb/a;

    .line 29
    .line 30
    const/4 v4, 0x7

    .line 31
    iget-wide v7, v0, Lca/i;->j:J

    .line 32
    .line 33
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-direct {v1, v4, v6}, Ldb/a;-><init>(ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v9, v1}, La/a;->a1(ILjava/util/List;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v6, v0, Lca/i;->i:Landroid/app/Activity;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v5, v6, v1}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_1
    if-ne v9, v3, :cond_2

    .line 57
    .line 58
    move v15, v3

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v15, v2

    .line 61
    :goto_1
    if-eqz v15, :cond_3

    .line 62
    .line 63
    const-string v1, "\u9009\u62e9\u5b98\u65b9\u7fa4\u53d1\u597d\u53cb"

    .line 64
    .line 65
    :goto_2
    move-object v13, v1

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    const-string v1, "\u9009\u62e9\u7fa4\u53d1\u5bf9\u8c61"

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :goto_3
    new-instance v4, Lca/u;

    .line 71
    .line 72
    invoke-direct/range {v4 .. v9}, Lca/u;-><init>(Lca/e0;Landroid/app/Activity;JI)V

    .line 73
    .line 74
    .line 75
    const-string v14, "\u53d1\u9001"

    .line 76
    .line 77
    move-object v12, v4

    .line 78
    move-object v10, v5

    .line 79
    move-object v11, v6

    .line 80
    invoke-virtual/range {v10 .. v15}, Lca/e0;->p(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    :goto_4
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 84
    .line 85
    return-object v1

    .line 86
    :pswitch_0
    move-object/from16 v5, p1

    .line 87
    .line 88
    check-cast v5, Ljava/util/List;

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v2, v0, Lca/i;->h:Lca/e0;

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance v1, Ldb/a;

    .line 99
    .line 100
    const/4 v3, 0x7

    .line 101
    iget-wide v6, v0, Lca/i;->j:J

    .line 102
    .line 103
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-direct {v1, v3, v4}, Ldb/a;-><init>(ILjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    iget-object v3, v0, Lca/i;->i:Landroid/app/Activity;

    .line 115
    .line 116
    const/4 v6, 0x0

    .line 117
    const-string v7, "\u8f6c\u53d1\u81f3\u6807\u7b7e"

    .line 118
    .line 119
    invoke-virtual/range {v2 .. v7}, Lca/e0;->n(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :goto_5
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 123
    .line 124
    return-object v1

    .line 125
    :pswitch_1
    move-object/from16 v1, p1

    .line 126
    .line 127
    check-cast v1, Ljava/util/List;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    new-instance v5, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_4

    .line 150
    .line 151
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    check-cast v2, Lwb/jv;

    .line 156
    .line 157
    iget-object v2, v2, Lwb/jv;->a:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_4
    iget-object v2, v0, Lca/i;->h:Lca/e0;

    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance v1, Ldb/a;

    .line 169
    .line 170
    const/4 v3, 0x7

    .line 171
    iget-wide v6, v0, Lca/i;->j:J

    .line 172
    .line 173
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-direct {v1, v3, v4}, Ldb/a;-><init>(ILjava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    iget-object v3, v0, Lca/i;->i:Landroid/app/Activity;

    .line 185
    .line 186
    const/4 v6, 0x0

    .line 187
    const-string v7, "\u8f6c\u53d1\u7ed9\u597d\u53cb"

    .line 188
    .line 189
    invoke-virtual/range {v2 .. v7}, Lca/e0;->n(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V

    .line 190
    .line 191
    .line 192
    goto :goto_5

    .line 193
    :pswitch_2
    move-object/from16 v1, p1

    .line 194
    .line 195
    check-cast v1, Ljava/lang/Integer;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    iget-object v2, v0, Lca/i;->h:Lca/e0;

    .line 202
    .line 203
    iget-object v3, v0, Lca/i;->i:Landroid/app/Activity;

    .line 204
    .line 205
    iget-wide v5, v0, Lca/i;->j:J

    .line 206
    .line 207
    if-eqz v1, :cond_9

    .line 208
    .line 209
    const/4 v4, 0x1

    .line 210
    if-eq v1, v4, :cond_8

    .line 211
    .line 212
    const/4 v4, 0x2

    .line 213
    if-eq v1, v4, :cond_7

    .line 214
    .line 215
    const/4 v4, 0x3

    .line 216
    if-eq v1, v4, :cond_6

    .line 217
    .line 218
    const/4 v4, 0x4

    .line 219
    if-eq v1, v4, :cond_5

    .line 220
    .line 221
    goto/16 :goto_7

    .line 222
    .line 223
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-object v4, v3

    .line 227
    move-object v3, v2

    .line 228
    new-instance v2, Lca/i;

    .line 229
    .line 230
    const/4 v7, 0x2

    .line 231
    invoke-direct/range {v2 .. v7}, Lca/i;-><init>(Lca/e0;Landroid/app/Activity;JI)V

    .line 232
    .line 233
    .line 234
    new-instance v1, Lca/l;

    .line 235
    .line 236
    invoke-direct {v1, v3, v4, v2}, Lca/l;-><init>(Lca/e0;Landroid/app/Activity;Lfg/l;)V

    .line 237
    .line 238
    .line 239
    const-string v2, "\u8f6c\u53d1\u81f3\u6807\u7b7e"

    .line 240
    .line 241
    const/4 v5, 0x0

    .line 242
    invoke-virtual {v3, v4, v1, v2, v5}, Lca/e0;->e(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Z)V

    .line 243
    .line 244
    .line 245
    goto/16 :goto_7

    .line 246
    .line 247
    :cond_6
    move-object v4, v3

    .line 248
    move-object v3, v2

    .line 249
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    new-instance v1, Lsf/e;

    .line 253
    .line 254
    const-string v2, "\u6a21\u5757\u901a\u9053"

    .line 255
    .line 256
    const-string v7, "\u652f\u6301\u597d\u53cb\u3001\u7fa4\u804a\u3001\u516c\u4f17\u53f7\u548c\u6807\u7b7e"

    .line 257
    .line 258
    invoke-direct {v1, v2, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    new-instance v2, Lsf/e;

    .line 262
    .line 263
    const-string v7, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b"

    .line 264
    .line 265
    const-string v8, "\u4ec5\u9009\u62e9\u597d\u53cb\u5e76\u6309\u539f\u751f\u961f\u5217\u53d1\u9001"

    .line 266
    .line 267
    invoke-direct {v2, v7, v8}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    filled-new-array {v1, v2}, [Lsf/e;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    new-instance v7, Lca/i;

    .line 279
    .line 280
    invoke-direct {v7, v3, v5, v6, v4}, Lca/i;-><init>(Lca/e0;JLandroid/app/Activity;)V

    .line 281
    .line 282
    .line 283
    new-instance v8, Lbi/c;

    .line 284
    .line 285
    const/4 v2, 0x7

    .line 286
    invoke-direct {v8, v2}, Lbi/c;-><init>(I)V

    .line 287
    .line 288
    .line 289
    sget-object v9, Lwb/lv;->j:Lwb/lv;

    .line 290
    .line 291
    move-object v3, v4

    .line 292
    const-string v4, "\u9009\u62e9\u7fa4\u53d1\u901a\u9053"

    .line 293
    .line 294
    const-string v5, ""

    .line 295
    .line 296
    move-object v6, v1

    .line 297
    invoke-static/range {v3 .. v9}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 298
    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_7
    move-object v4, v3

    .line 302
    move-object v3, v2

    .line 303
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    move-wide v1, v5

    .line 307
    new-instance v6, Lca/o;

    .line 308
    .line 309
    const/4 v5, 0x0

    .line 310
    invoke-direct {v6, v3, v4, v5}, Lca/o;-><init>(Lca/e0;Landroid/app/Activity;I)V

    .line 311
    .line 312
    .line 313
    const-string v7, "\u5206\u4eab\u6536\u85cf"

    .line 314
    .line 315
    move-object v5, v4

    .line 316
    move-wide/from16 v16, v1

    .line 317
    .line 318
    move-object v2, v3

    .line 319
    move-wide/from16 v3, v16

    .line 320
    .line 321
    invoke-virtual/range {v2 .. v7}, Lca/e0;->f(JLandroid/app/Activity;Lfg/l;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_8
    move-object v4, v3

    .line 326
    move-object v3, v2

    .line 327
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    new-instance v2, Lca/i;

    .line 331
    .line 332
    const/4 v7, 0x1

    .line 333
    invoke-direct/range {v2 .. v7}, Lca/i;-><init>(Lca/e0;Landroid/app/Activity;JI)V

    .line 334
    .line 335
    .line 336
    const-string v5, "\u9009\u62e9\u8f6c\u53d1\u5bf9\u8c61"

    .line 337
    .line 338
    const-string v6, "\u8f6c\u53d1"

    .line 339
    .line 340
    const/4 v7, 0x0

    .line 341
    move-object/from16 v16, v4

    .line 342
    .line 343
    move-object v4, v2

    .line 344
    move-object v2, v3

    .line 345
    move-object/from16 v3, v16

    .line 346
    .line 347
    invoke-virtual/range {v2 .. v7}, Lca/e0;->p(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 348
    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_9
    move-object v4, v3

    .line 352
    move-object v3, v2

    .line 353
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    move-wide v1, v5

    .line 357
    new-instance v6, Lca/o;

    .line 358
    .line 359
    invoke-direct {v6, v4, v3}, Lca/o;-><init>(Landroid/app/Activity;Lca/e0;)V

    .line 360
    .line 361
    .line 362
    const-string v7, "\u8f6c\u53d1\u5230\u670b\u53cb\u5708"

    .line 363
    .line 364
    move-object v5, v4

    .line 365
    move-wide/from16 v16, v1

    .line 366
    .line 367
    move-object v2, v3

    .line 368
    move-wide/from16 v3, v16

    .line 369
    .line 370
    invoke-virtual/range {v2 .. v7}, Lca/e0;->f(JLandroid/app/Activity;Lfg/l;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    :goto_7
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 374
    .line 375
    return-object v1

    .line 376
    nop

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
