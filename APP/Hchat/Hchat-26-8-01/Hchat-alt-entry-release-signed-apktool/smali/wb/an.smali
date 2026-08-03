.class public final synthetic Lwb/an;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lsh/x;

.field public final synthetic i:Lr/z;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lfg/l;

.field public final synthetic l:Ljava/util/ArrayList;

.field public final synthetic m:Lfg/p;

.field public final synthetic n:Lfg/l;

.field public final synthetic o:Lfg/l;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lsh/x;Lr/z;Ljava/lang/String;Lfg/l;Ljava/util/ArrayList;Lfg/p;Lfg/l;Lfg/l;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p11, p0, Lwb/an;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/an;->h:Lsh/x;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/an;->i:Lr/z;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/an;->j:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/an;->k:Lfg/l;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/an;->l:Ljava/util/ArrayList;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/an;->m:Lfg/p;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/an;->n:Lfg/l;

    .line 16
    .line 17
    iput-object p8, p0, Lwb/an;->o:Lfg/l;

    .line 18
    .line 19
    iput-object p9, p0, Lwb/an;->p:Li0/a1;

    .line 20
    .line 21
    iput-object p10, p0, Lwb/an;->q:Li0/a1;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/an;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lp/x0;

    .line 11
    .line 12
    move-object/from16 v11, p2

    .line 13
    .line 14
    check-cast v11, Li0/h0;

    .line 15
    .line 16
    move-object/from16 v2, p3

    .line 17
    .line 18
    check-cast v2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v3, v2, 0x6

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v3, 0x2

    .line 40
    :goto_0
    or-int/2addr v2, v3

    .line 41
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 42
    .line 43
    const/16 v4, 0x12

    .line 44
    .line 45
    const/4 v5, 0x1

    .line 46
    if-eq v3, v4, :cond_2

    .line 47
    .line 48
    move v3, v5

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const/4 v3, 0x0

    .line 51
    :goto_1
    and-int/2addr v2, v5

    .line 52
    invoke-virtual {v11, v2, v3}, Li0/h0;->S(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_5

    .line 57
    .line 58
    sget-object v2, Lp/h1;->c:Lp/a0;

    .line 59
    .line 60
    iget-object v3, v0, Lwb/an;->h:Lsh/x;

    .line 61
    .line 62
    iget-object v3, v3, Lsh/x;->e:Lm/a;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-static {v2, v3, v4}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {v1}, Lp/x0;->c()F

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    const/16 v4, 0x8

    .line 74
    .line 75
    int-to-float v4, v4

    .line 76
    add-float/2addr v3, v4

    .line 77
    invoke-interface {v1}, Lp/x0;->a()F

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const/16 v4, 0x54

    .line 82
    .line 83
    int-to-float v4, v4

    .line 84
    add-float/2addr v1, v4

    .line 85
    const/4 v4, 0x5

    .line 86
    invoke-static {v3, v1, v4}, Lp/d;->b(FFI)Lp/z0;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    iget-object v14, v0, Lwb/an;->j:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v11, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    iget-object v15, v0, Lwb/an;->k:Lfg/l;

    .line 97
    .line 98
    invoke-virtual {v11, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    or-int/2addr v1, v3

    .line 103
    iget-object v13, v0, Lwb/an;->l:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {v11, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    or-int/2addr v1, v3

    .line 110
    iget-object v3, v0, Lwb/an;->m:Lfg/p;

    .line 111
    .line 112
    invoke-virtual {v11, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    or-int/2addr v1, v5

    .line 117
    iget-object v5, v0, Lwb/an;->n:Lfg/l;

    .line 118
    .line 119
    invoke-virtual {v11, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    or-int/2addr v1, v6

    .line 124
    iget-object v6, v0, Lwb/an;->o:Lfg/l;

    .line 125
    .line 126
    invoke-virtual {v11, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    or-int/2addr v1, v7

    .line 131
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    if-nez v1, :cond_3

    .line 136
    .line 137
    sget-object v1, Li0/l;->a:Li0/e;

    .line 138
    .line 139
    if-ne v7, v1, :cond_4

    .line 140
    .line 141
    :cond_3
    new-instance v12, Lwb/f9;

    .line 142
    .line 143
    const/16 v21, 0x0

    .line 144
    .line 145
    iget-object v1, v0, Lwb/an;->p:Li0/a1;

    .line 146
    .line 147
    iget-object v7, v0, Lwb/an;->q:Li0/a1;

    .line 148
    .line 149
    move-object/from16 v19, v1

    .line 150
    .line 151
    move-object/from16 v16, v3

    .line 152
    .line 153
    move-object/from16 v17, v5

    .line 154
    .line 155
    move-object/from16 v18, v6

    .line 156
    .line 157
    move-object/from16 v20, v7

    .line 158
    .line 159
    invoke-direct/range {v12 .. v21}, Lwb/f9;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Lfg/l;Lfg/p;Lfg/l;Lfg/l;Li0/a1;Li0/a1;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    move-object v7, v12

    .line 166
    :cond_4
    move-object v10, v7

    .line 167
    check-cast v10, Lfg/l;

    .line 168
    .line 169
    const/4 v12, 0x0

    .line 170
    const/16 v13, 0x1f8

    .line 171
    .line 172
    iget-object v3, v0, Lwb/an;->i:Lr/z;

    .line 173
    .line 174
    const/4 v5, 0x0

    .line 175
    const/4 v6, 0x0

    .line 176
    const/4 v7, 0x0

    .line 177
    const/4 v8, 0x0

    .line 178
    const/4 v9, 0x0

    .line 179
    invoke-static/range {v2 .. v13}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_5
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 184
    .line 185
    .line 186
    :goto_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 187
    .line 188
    return-object v1

    .line 189
    :pswitch_0
    move-object/from16 v1, p1

    .line 190
    .line 191
    check-cast v1, Lp/x0;

    .line 192
    .line 193
    move-object/from16 v11, p2

    .line 194
    .line 195
    check-cast v11, Li0/h0;

    .line 196
    .line 197
    move-object/from16 v2, p3

    .line 198
    .line 199
    check-cast v2, Ljava/lang/Integer;

    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    and-int/lit8 v3, v2, 0x6

    .line 209
    .line 210
    if-nez v3, :cond_7

    .line 211
    .line 212
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-eqz v3, :cond_6

    .line 217
    .line 218
    const/4 v3, 0x4

    .line 219
    goto :goto_3

    .line 220
    :cond_6
    const/4 v3, 0x2

    .line 221
    :goto_3
    or-int/2addr v2, v3

    .line 222
    :cond_7
    and-int/lit8 v3, v2, 0x13

    .line 223
    .line 224
    const/16 v4, 0x12

    .line 225
    .line 226
    const/4 v5, 0x1

    .line 227
    if-eq v3, v4, :cond_8

    .line 228
    .line 229
    move v3, v5

    .line 230
    goto :goto_4

    .line 231
    :cond_8
    const/4 v3, 0x0

    .line 232
    :goto_4
    and-int/2addr v2, v5

    .line 233
    invoke-virtual {v11, v2, v3}, Li0/h0;->S(IZ)Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-eqz v2, :cond_b

    .line 238
    .line 239
    sget-object v2, Lp/h1;->c:Lp/a0;

    .line 240
    .line 241
    iget-object v3, v0, Lwb/an;->h:Lsh/x;

    .line 242
    .line 243
    iget-object v3, v3, Lsh/x;->e:Lm/a;

    .line 244
    .line 245
    const/4 v4, 0x0

    .line 246
    invoke-static {v2, v3, v4}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-interface {v1}, Lp/x0;->c()F

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    const/16 v4, 0x8

    .line 255
    .line 256
    int-to-float v4, v4

    .line 257
    add-float/2addr v3, v4

    .line 258
    invoke-interface {v1}, Lp/x0;->a()F

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    const/16 v4, 0x54

    .line 263
    .line 264
    int-to-float v4, v4

    .line 265
    add-float/2addr v1, v4

    .line 266
    const/4 v4, 0x5

    .line 267
    invoke-static {v3, v1, v4}, Lp/d;->b(FFI)Lp/z0;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    iget-object v14, v0, Lwb/an;->j:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v11, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    iget-object v15, v0, Lwb/an;->k:Lfg/l;

    .line 278
    .line 279
    invoke-virtual {v11, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    or-int/2addr v1, v3

    .line 284
    iget-object v13, v0, Lwb/an;->l:Ljava/util/ArrayList;

    .line 285
    .line 286
    invoke-virtual {v11, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    or-int/2addr v1, v3

    .line 291
    iget-object v3, v0, Lwb/an;->m:Lfg/p;

    .line 292
    .line 293
    invoke-virtual {v11, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    or-int/2addr v1, v5

    .line 298
    iget-object v5, v0, Lwb/an;->n:Lfg/l;

    .line 299
    .line 300
    invoke-virtual {v11, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v6

    .line 304
    or-int/2addr v1, v6

    .line 305
    iget-object v6, v0, Lwb/an;->o:Lfg/l;

    .line 306
    .line 307
    invoke-virtual {v11, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v7

    .line 311
    or-int/2addr v1, v7

    .line 312
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v7

    .line 316
    if-nez v1, :cond_9

    .line 317
    .line 318
    sget-object v1, Li0/l;->a:Li0/e;

    .line 319
    .line 320
    if-ne v7, v1, :cond_a

    .line 321
    .line 322
    :cond_9
    new-instance v12, Lwb/f9;

    .line 323
    .line 324
    const/16 v21, 0x1

    .line 325
    .line 326
    iget-object v1, v0, Lwb/an;->p:Li0/a1;

    .line 327
    .line 328
    iget-object v7, v0, Lwb/an;->q:Li0/a1;

    .line 329
    .line 330
    move-object/from16 v19, v1

    .line 331
    .line 332
    move-object/from16 v16, v3

    .line 333
    .line 334
    move-object/from16 v17, v5

    .line 335
    .line 336
    move-object/from16 v18, v6

    .line 337
    .line 338
    move-object/from16 v20, v7

    .line 339
    .line 340
    invoke-direct/range {v12 .. v21}, Lwb/f9;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Lfg/l;Lfg/p;Lfg/l;Lfg/l;Li0/a1;Li0/a1;I)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    move-object v7, v12

    .line 347
    :cond_a
    move-object v10, v7

    .line 348
    check-cast v10, Lfg/l;

    .line 349
    .line 350
    const/4 v12, 0x0

    .line 351
    const/16 v13, 0x1f8

    .line 352
    .line 353
    iget-object v3, v0, Lwb/an;->i:Lr/z;

    .line 354
    .line 355
    const/4 v5, 0x0

    .line 356
    const/4 v6, 0x0

    .line 357
    const/4 v7, 0x0

    .line 358
    const/4 v8, 0x0

    .line 359
    const/4 v9, 0x0

    .line 360
    invoke-static/range {v2 .. v13}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 361
    .line 362
    .line 363
    goto :goto_5

    .line 364
    :cond_b
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 365
    .line 366
    .line 367
    :goto_5
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 368
    .line 369
    return-object v1

    .line 370
    nop

    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
