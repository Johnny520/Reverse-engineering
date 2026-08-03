.class public final synthetic Lwb/l6;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/io/Serializable;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/l6;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p14, p0, Lwb/l6;->h:Z

    .line 8
    .line 9
    iput-object p1, p0, Lwb/l6;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, p0, Lwb/l6;->j:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p11, p0, Lwb/l6;->k:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p12, p0, Lwb/l6;->l:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p3, p0, Lwb/l6;->m:Li0/a1;

    .line 18
    .line 19
    iput-object p4, p0, Lwb/l6;->n:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p5, p0, Lwb/l6;->o:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p13, p0, Lwb/l6;->p:Ljava/io/Serializable;

    .line 24
    .line 25
    iput-object p6, p0, Lwb/l6;->q:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object p7, p0, Lwb/l6;->r:Ljava/lang/Object;

    .line 28
    .line 29
    iput-object p8, p0, Lwb/l6;->s:Ljava/lang/Object;

    .line 30
    .line 31
    iput-object p9, p0, Lwb/l6;->t:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object p10, p0, Lwb/l6;->u:Ljava/lang/Object;

    .line 34
    .line 35
    return-void
.end method

.method public synthetic constructor <init>(Li0/j1;Lc9/a1;Landroid/app/Activity;Li0/j1;Li0/j1;Lgg/q;Lwb/o6;Lgg/u;Ljava/util/ArrayList;Lgg/u;Landroid/view/ViewGroup;Li0/j1;Li0/j1;Z)V
    .locals 1

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lwb/l6;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/l6;->i:Ljava/lang/Object;

    iput-object p2, p0, Lwb/l6;->n:Ljava/lang/Object;

    iput-object p3, p0, Lwb/l6;->o:Ljava/lang/Object;

    iput-object p4, p0, Lwb/l6;->j:Ljava/lang/Object;

    iput-object p5, p0, Lwb/l6;->k:Ljava/lang/Object;

    iput-object p6, p0, Lwb/l6;->p:Ljava/io/Serializable;

    iput-object p7, p0, Lwb/l6;->q:Ljava/lang/Object;

    iput-object p8, p0, Lwb/l6;->r:Ljava/lang/Object;

    iput-object p9, p0, Lwb/l6;->t:Ljava/lang/Object;

    iput-object p10, p0, Lwb/l6;->s:Ljava/lang/Object;

    iput-object p11, p0, Lwb/l6;->u:Ljava/lang/Object;

    iput-object p12, p0, Lwb/l6;->l:Ljava/lang/Object;

    iput-object p13, p0, Lwb/l6;->m:Li0/a1;

    iput-boolean p14, p0, Lwb/l6;->h:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/l6;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/l6;->i:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, v1

    .line 11
    check-cast v3, Landroid/content/Context;

    .line 12
    .line 13
    iget-object v1, v0, Lwb/l6;->j:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, Landroid/content/SharedPreferences;

    .line 17
    .line 18
    iget-object v1, v0, Lwb/l6;->k:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v13, v1

    .line 21
    check-cast v13, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, v0, Lwb/l6;->l:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v14, v1

    .line 26
    check-cast v14, Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, v0, Lwb/l6;->n:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, v1

    .line 31
    check-cast v6, Li0/a1;

    .line 32
    .line 33
    iget-object v1, v0, Lwb/l6;->o:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v7, v1

    .line 36
    check-cast v7, Li0/a1;

    .line 37
    .line 38
    iget-object v1, v0, Lwb/l6;->p:Ljava/io/Serializable;

    .line 39
    .line 40
    move-object v15, v1

    .line 41
    check-cast v15, Ljava/lang/String;

    .line 42
    .line 43
    iget-object v1, v0, Lwb/l6;->q:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v8, v1

    .line 46
    check-cast v8, Li0/a1;

    .line 47
    .line 48
    iget-object v1, v0, Lwb/l6;->r:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v9, v1

    .line 51
    check-cast v9, Li0/a1;

    .line 52
    .line 53
    iget-object v1, v0, Lwb/l6;->s:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v10, v1

    .line 56
    check-cast v10, Li0/a1;

    .line 57
    .line 58
    iget-object v1, v0, Lwb/l6;->t:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v11, v1

    .line 61
    check-cast v11, Li0/a1;

    .line 62
    .line 63
    iget-object v1, v0, Lwb/l6;->u:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v12, v1

    .line 66
    check-cast v12, Li0/a1;

    .line 67
    .line 68
    move-object/from16 v1, p1

    .line 69
    .line 70
    check-cast v1, Li0/h0;

    .line 71
    .line 72
    move-object/from16 v2, p2

    .line 73
    .line 74
    check-cast v2, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    and-int/lit8 v5, v2, 0x3

    .line 81
    .line 82
    move/from16 p1, v2

    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    move-object/from16 v16, v12

    .line 86
    .line 87
    const/4 v12, 0x1

    .line 88
    if-eq v5, v2, :cond_0

    .line 89
    .line 90
    move v2, v12

    .line 91
    goto :goto_0

    .line 92
    :cond_0
    const/4 v2, 0x0

    .line 93
    :goto_0
    and-int/lit8 v5, p1, 0x1

    .line 94
    .line 95
    invoke-virtual {v1, v5, v2}, Li0/h0;->S(IZ)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_8

    .line 100
    .line 101
    iget-boolean v2, v0, Lwb/l6;->h:Z

    .line 102
    .line 103
    if-eqz v2, :cond_1

    .line 104
    .line 105
    const-string v5, "\u6e05\u9664\u4f2a\u96c6\u8d5e"

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    const-string v5, "\u6e05\u9664\u4f2a\u8bc4\u8bba"

    .line 109
    .line 110
    :goto_1
    if-eqz v2, :cond_2

    .line 111
    .line 112
    const-string v17, "\u6e05\u7a7a\u5df2\u4fdd\u5b58\u7684\u672c\u5730\u70b9\u8d5e\uff0c\u4fdd\u7559\u5f53\u524d\u529f\u80fd\u8bbe\u7f6e"

    .line 113
    .line 114
    :goto_2
    move-object/from16 v12, v17

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_2
    const-string v17, "\u6e05\u7a7a\u5df2\u4fdd\u5b58\u7684\u672c\u5730\u8bc4\u8bba\uff0c\u4fdd\u7559\u5f53\u524d\u529f\u80fd\u8bbe\u7f6e"

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :goto_3
    invoke-virtual {v1, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v17

    .line 124
    invoke-virtual {v1, v2}, Li0/h0;->g(Z)Z

    .line 125
    .line 126
    .line 127
    move-result v18

    .line 128
    or-int v17, v17, v18

    .line 129
    .line 130
    invoke-virtual {v1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v18

    .line 134
    or-int v17, v17, v18

    .line 135
    .line 136
    move-object/from16 v18, v11

    .line 137
    .line 138
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    move-object/from16 v19, v10

    .line 143
    .line 144
    sget-object v10, Li0/l;->a:Li0/e;

    .line 145
    .line 146
    if-nez v17, :cond_3

    .line 147
    .line 148
    if-ne v11, v10, :cond_4

    .line 149
    .line 150
    :cond_3
    new-instance v11, Lwb/ec;

    .line 151
    .line 152
    invoke-direct {v11, v3, v2, v4}, Lwb/ec;-><init>(Landroid/content/Context;ZLandroid/content/SharedPreferences;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_4
    check-cast v11, Lfg/a;

    .line 159
    .line 160
    move-object/from16 v17, v10

    .line 161
    .line 162
    const/4 v10, 0x0

    .line 163
    invoke-static {v5, v12, v11, v1, v10}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 164
    .line 165
    .line 166
    const/4 v5, 0x0

    .line 167
    const/4 v11, 0x1

    .line 168
    invoke-static {v5, v1, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 169
    .line 170
    .line 171
    if-eqz v2, :cond_5

    .line 172
    .line 173
    const-string v5, "\u5173\u95ed\u4f2a\u96c6\u8d5e\u5e76\u6e05\u7a7a\u5df2\u4fdd\u5b58\u7684\u672c\u5730\u70b9\u8d5e"

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_5
    const-string v5, "\u5173\u95ed\u4f2a\u8bc4\u8bba\u5e76\u6e05\u7a7a\u5df2\u4fdd\u5b58\u7684\u672c\u5730\u8bc4\u8bba"

    .line 177
    .line 178
    :goto_4
    invoke-virtual {v1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v11

    .line 182
    invoke-virtual {v1, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v12

    .line 186
    or-int/2addr v11, v12

    .line 187
    invoke-virtual {v1, v10}, Li0/h0;->g(Z)Z

    .line 188
    .line 189
    .line 190
    move-result v12

    .line 191
    or-int v10, v11, v12

    .line 192
    .line 193
    invoke-virtual {v1, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    or-int/2addr v10, v11

    .line 198
    invoke-virtual {v1, v2}, Li0/h0;->g(Z)Z

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    or-int/2addr v10, v11

    .line 203
    invoke-virtual {v1, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v11

    .line 207
    or-int/2addr v10, v11

    .line 208
    move-object v11, v5

    .line 209
    iget-object v5, v0, Lwb/l6;->m:Li0/a1;

    .line 210
    .line 211
    invoke-virtual {v1, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v12

    .line 215
    or-int/2addr v10, v12

    .line 216
    invoke-virtual {v1, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v12

    .line 220
    or-int/2addr v10, v12

    .line 221
    const/4 v12, 0x0

    .line 222
    invoke-virtual {v1, v12}, Li0/h0;->g(Z)Z

    .line 223
    .line 224
    .line 225
    move-result v20

    .line 226
    or-int v10, v10, v20

    .line 227
    .line 228
    invoke-virtual {v1, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v20

    .line 232
    or-int v10, v10, v20

    .line 233
    .line 234
    invoke-virtual {v1, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v20

    .line 238
    or-int v10, v10, v20

    .line 239
    .line 240
    invoke-virtual {v1, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v20

    .line 244
    or-int v10, v10, v20

    .line 245
    .line 246
    invoke-virtual {v1, v12}, Li0/h0;->g(Z)Z

    .line 247
    .line 248
    .line 249
    move-result v12

    .line 250
    or-int/2addr v10, v12

    .line 251
    invoke-virtual {v1, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v12

    .line 255
    or-int/2addr v10, v12

    .line 256
    move-object/from16 v12, v19

    .line 257
    .line 258
    invoke-virtual {v1, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v19

    .line 262
    or-int v10, v10, v19

    .line 263
    .line 264
    move/from16 v19, v2

    .line 265
    .line 266
    move-object/from16 v2, v18

    .line 267
    .line 268
    invoke-virtual {v1, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v18

    .line 272
    or-int v10, v10, v18

    .line 273
    .line 274
    move-object/from16 v18, v2

    .line 275
    .line 276
    move-object/from16 v2, v16

    .line 277
    .line 278
    invoke-virtual {v1, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v16

    .line 282
    or-int v10, v10, v16

    .line 283
    .line 284
    move-object/from16 v16, v2

    .line 285
    .line 286
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    if-nez v10, :cond_7

    .line 291
    .line 292
    move-object/from16 v10, v17

    .line 293
    .line 294
    if-ne v2, v10, :cond_6

    .line 295
    .line 296
    goto :goto_5

    .line 297
    :cond_6
    move-object v0, v11

    .line 298
    goto :goto_6

    .line 299
    :cond_7
    :goto_5
    new-instance v2, Lwb/fc;

    .line 300
    .line 301
    move-object v0, v11

    .line 302
    move-object v10, v12

    .line 303
    move-object/from16 v12, v16

    .line 304
    .line 305
    move-object/from16 v11, v18

    .line 306
    .line 307
    move/from16 v16, v19

    .line 308
    .line 309
    invoke-direct/range {v2 .. v16}, Lwb/fc;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    :goto_6
    check-cast v2, Lfg/a;

    .line 316
    .line 317
    const/4 v3, 0x6

    .line 318
    const-string v4, "\u6062\u590d\u9ed8\u8ba4"

    .line 319
    .line 320
    invoke-static {v4, v0, v2, v1, v3}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 321
    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_8
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 325
    .line 326
    .line 327
    :goto_7
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 328
    .line 329
    return-object v0

    .line 330
    :pswitch_0
    iget-object v1, v0, Lwb/l6;->i:Ljava/lang/Object;

    .line 331
    .line 332
    move-object/from16 v17, v1

    .line 333
    .line 334
    check-cast v17, Li0/j1;

    .line 335
    .line 336
    iget-object v1, v0, Lwb/l6;->n:Ljava/lang/Object;

    .line 337
    .line 338
    move-object v13, v1

    .line 339
    check-cast v13, Lc9/a1;

    .line 340
    .line 341
    iget-object v1, v0, Lwb/l6;->o:Ljava/lang/Object;

    .line 342
    .line 343
    move-object v3, v1

    .line 344
    check-cast v3, Landroid/app/Activity;

    .line 345
    .line 346
    iget-object v1, v0, Lwb/l6;->j:Ljava/lang/Object;

    .line 347
    .line 348
    move-object v4, v1

    .line 349
    check-cast v4, Li0/j1;

    .line 350
    .line 351
    iget-object v1, v0, Lwb/l6;->k:Ljava/lang/Object;

    .line 352
    .line 353
    move-object v5, v1

    .line 354
    check-cast v5, Li0/j1;

    .line 355
    .line 356
    iget-object v1, v0, Lwb/l6;->p:Ljava/io/Serializable;

    .line 357
    .line 358
    move-object v7, v1

    .line 359
    check-cast v7, Lgg/q;

    .line 360
    .line 361
    iget-object v1, v0, Lwb/l6;->q:Ljava/lang/Object;

    .line 362
    .line 363
    move-object v8, v1

    .line 364
    check-cast v8, Lwb/o6;

    .line 365
    .line 366
    iget-object v1, v0, Lwb/l6;->r:Ljava/lang/Object;

    .line 367
    .line 368
    move-object v9, v1

    .line 369
    check-cast v9, Lgg/u;

    .line 370
    .line 371
    iget-object v1, v0, Lwb/l6;->t:Ljava/lang/Object;

    .line 372
    .line 373
    move-object v10, v1

    .line 374
    check-cast v10, Ljava/util/ArrayList;

    .line 375
    .line 376
    iget-object v1, v0, Lwb/l6;->s:Ljava/lang/Object;

    .line 377
    .line 378
    move-object v11, v1

    .line 379
    check-cast v11, Lgg/u;

    .line 380
    .line 381
    iget-object v1, v0, Lwb/l6;->u:Ljava/lang/Object;

    .line 382
    .line 383
    move-object v12, v1

    .line 384
    check-cast v12, Landroid/view/ViewGroup;

    .line 385
    .line 386
    iget-object v1, v0, Lwb/l6;->l:Ljava/lang/Object;

    .line 387
    .line 388
    move-object v15, v1

    .line 389
    check-cast v15, Li0/j1;

    .line 390
    .line 391
    iget-object v1, v0, Lwb/l6;->m:Li0/a1;

    .line 392
    .line 393
    move-object/from16 v16, v1

    .line 394
    .line 395
    check-cast v16, Li0/j1;

    .line 396
    .line 397
    move-object/from16 v1, p1

    .line 398
    .line 399
    check-cast v1, Li0/h0;

    .line 400
    .line 401
    move-object/from16 v2, p2

    .line 402
    .line 403
    check-cast v2, Ljava/lang/Integer;

    .line 404
    .line 405
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    and-int/lit8 v6, v2, 0x3

    .line 410
    .line 411
    const/4 v14, 0x2

    .line 412
    const/16 v18, 0x1

    .line 413
    .line 414
    if-eq v6, v14, :cond_9

    .line 415
    .line 416
    move/from16 v6, v18

    .line 417
    .line 418
    goto :goto_8

    .line 419
    :cond_9
    const/4 v6, 0x0

    .line 420
    :goto_8
    and-int/lit8 v2, v2, 0x1

    .line 421
    .line 422
    invoke-virtual {v1, v2, v6}, Li0/h0;->S(IZ)Z

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    if-eqz v2, :cond_a

    .line 427
    .line 428
    invoke-virtual/range {v17 .. v17}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    move-object v6, v2

    .line 433
    check-cast v6, Lwb/x2;

    .line 434
    .line 435
    invoke-static {v1}, Lr/b0;->a(Li0/h0;)Lr/z;

    .line 436
    .line 437
    .line 438
    move-result-object v14

    .line 439
    sget-object v2, Ls3/b;->a:Li0/u;

    .line 440
    .line 441
    invoke-virtual {v2, v13}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    move-object/from16 v18, v2

    .line 446
    .line 447
    new-instance v2, Lwb/n6;

    .line 448
    .line 449
    move-object/from16 p1, v2

    .line 450
    .line 451
    iget-boolean v2, v0, Lwb/l6;->h:Z

    .line 452
    .line 453
    move-object/from16 v0, v18

    .line 454
    .line 455
    move/from16 v18, v2

    .line 456
    .line 457
    move-object/from16 v2, p1

    .line 458
    .line 459
    invoke-direct/range {v2 .. v18}, Lwb/n6;-><init>(Landroid/app/Activity;Li0/j1;Li0/j1;Lwb/x2;Lgg/q;Lwb/o6;Lgg/u;Ljava/util/ArrayList;Lgg/u;Landroid/view/ViewGroup;Lc9/a1;Lr/z;Li0/j1;Li0/j1;Li0/j1;Z)V

    .line 460
    .line 461
    .line 462
    const v3, -0x3dedfb8a

    .line 463
    .line 464
    .line 465
    invoke-static {v3, v2, v1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    const/16 v3, 0x30

    .line 470
    .line 471
    invoke-static {v0, v2, v1, v3}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 472
    .line 473
    .line 474
    goto :goto_9

    .line 475
    :cond_a
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 476
    .line 477
    .line 478
    :goto_9
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 479
    .line 480
    return-object v0

    .line 481
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
