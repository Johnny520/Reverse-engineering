.class public final synthetic Ls70;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lsz0;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lsz0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ls70;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ls70;->j:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Ls70;->i:Lsz0;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lsz0;Ljava/lang/String;I)V
    .locals 0

    .line 12
    iput p3, p0, Ls70;->h:I

    iput-object p1, p0, Ls70;->i:Lsz0;

    iput-object p2, p0, Ls70;->j:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ls70;->h:I

    .line 4
    .line 5
    iget-object v2, v0, Ls70;->j:Ljava/lang/String;

    .line 6
    .line 7
    sget-object v3, La83;->a:La83;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    iget-object v5, v0, Ls70;->i:Lsz0;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x2

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v0, p1

    .line 18
    .line 19
    check-cast v0, Lpx;

    .line 20
    .line 21
    move-object/from16 v1, p2

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    and-int/lit8 v8, v1, 0x3

    .line 30
    .line 31
    if-eq v8, v7, :cond_0

    .line 32
    .line 33
    move v7, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v7, v6

    .line 36
    :goto_0
    and-int/2addr v1, v4

    .line 37
    check-cast v0, Lgo0;

    .line 38
    .line 39
    invoke-virtual {v0, v1, v7}, Lgo0;->O(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-static {v5, v1, v2, v0, v6}, Ltl;->a(Lsz0;Luh1;Ljava/lang/String;Lpx;I)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {v0}, Lgo0;->R()V

    .line 51
    .line 52
    .line 53
    :goto_1
    return-object v3

    .line 54
    :pswitch_0
    move-object/from16 v0, p1

    .line 55
    .line 56
    check-cast v0, Lpx;

    .line 57
    .line 58
    move-object/from16 v1, p2

    .line 59
    .line 60
    check-cast v1, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    and-int/lit8 v8, v1, 0x3

    .line 67
    .line 68
    if-eq v8, v7, :cond_2

    .line 69
    .line 70
    move v6, v4

    .line 71
    :cond_2
    and-int/2addr v1, v4

    .line 72
    check-cast v0, Lgo0;

    .line 73
    .line 74
    invoke-virtual {v0, v1, v6}, Lgo0;->O(IZ)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    new-instance v1, Ls70;

    .line 81
    .line 82
    invoke-direct {v1, v5, v2, v7}, Ls70;-><init>(Lsz0;Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    const v2, 0x2f814a2f

    .line 86
    .line 87
    .line 88
    invoke-static {v2, v1, v0}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    const/16 v2, 0x30

    .line 93
    .line 94
    invoke-static {v1, v0, v2}, Lpp0;->d(Lkw;Lpx;I)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    invoke-virtual {v0}, Lgo0;->R()V

    .line 99
    .line 100
    .line 101
    :goto_2
    return-object v3

    .line 102
    :pswitch_1
    move-object/from16 v1, p1

    .line 103
    .line 104
    check-cast v1, Lpx;

    .line 105
    .line 106
    move-object/from16 v2, p2

    .line 107
    .line 108
    check-cast v2, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    and-int/lit8 v8, v2, 0x3

    .line 115
    .line 116
    if-eq v8, v7, :cond_4

    .line 117
    .line 118
    move v8, v4

    .line 119
    goto :goto_3

    .line 120
    :cond_4
    move v8, v6

    .line 121
    :goto_3
    and-int/2addr v2, v4

    .line 122
    check-cast v1, Lgo0;

    .line 123
    .line 124
    invoke-virtual {v1, v2, v8}, Lgo0;->O(IZ)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_8

    .line 129
    .line 130
    const/high16 v2, 0x41c00000    # 24.0f

    .line 131
    .line 132
    const/high16 v8, 0x41b00000    # 22.0f

    .line 133
    .line 134
    sget-object v9, Lrh1;->a:Lrh1;

    .line 135
    .line 136
    invoke-static {v9, v2, v8}, Lfg1;->D(Luh1;FF)Luh1;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    new-instance v8, Lxf;

    .line 141
    .line 142
    new-instance v9, Ls;

    .line 143
    .line 144
    invoke-direct {v9, v7}, Ls;-><init>(I)V

    .line 145
    .line 146
    .line 147
    const/high16 v7, 0x41800000    # 16.0f

    .line 148
    .line 149
    invoke-direct {v8, v7, v9}, Lxf;-><init>(FLs;)V

    .line 150
    .line 151
    .line 152
    sget-object v7, Lsn;->u:Lpk;

    .line 153
    .line 154
    const/4 v9, 0x6

    .line 155
    invoke-static {v8, v7, v1, v9}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    iget-wide v8, v1, Lgo0;->T:J

    .line 160
    .line 161
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    invoke-virtual {v1}, Lgo0;->l()Lyy1;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    invoke-static {v1, v2}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    sget-object v10, Lhx;->c:Lgx;

    .line 174
    .line 175
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    sget-object v10, Lgx;->b:Ljy;

    .line 179
    .line 180
    invoke-virtual {v1}, Lgo0;->Z()V

    .line 181
    .line 182
    .line 183
    iget-boolean v11, v1, Lgo0;->S:Z

    .line 184
    .line 185
    if-eqz v11, :cond_5

    .line 186
    .line 187
    invoke-virtual {v1, v10}, Lgo0;->k(Lxm0;)V

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_5
    invoke-virtual {v1}, Lgo0;->i0()V

    .line 192
    .line 193
    .line 194
    :goto_4
    sget-object v10, Lgx;->e:Llc;

    .line 195
    .line 196
    invoke-static {v1, v10, v7}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    sget-object v7, Lgx;->d:Llc;

    .line 200
    .line 201
    invoke-static {v1, v7, v9}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    sget-object v8, Lgx;->f:Llc;

    .line 209
    .line 210
    invoke-static {v1, v8, v7}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    sget-object v7, Lgx;->g:Lv6;

    .line 214
    .line 215
    invoke-static {v1, v7}, Lyf3;->b(Lpx;Lin0;)V

    .line 216
    .line 217
    .line 218
    sget-object v7, Lgx;->c:Llc;

    .line 219
    .line 220
    invoke-static {v1, v7, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    sget-object v2, Lru;->a:Ltu2;

    .line 224
    .line 225
    invoke-virtual {v1, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    check-cast v7, Lpu;

    .line 230
    .line 231
    iget-wide v11, v7, Lpu;->q:J

    .line 232
    .line 233
    const/16 v7, 0x14

    .line 234
    .line 235
    invoke-static {v7}, Lrg3;->D(I)J

    .line 236
    .line 237
    .line 238
    move-result-wide v13

    .line 239
    sget-object v15, Lim0;->l:Lim0;

    .line 240
    .line 241
    invoke-static {v6}, Lrg3;->D(I)J

    .line 242
    .line 243
    .line 244
    move-result-wide v16

    .line 245
    const/16 v27, 0x0

    .line 246
    .line 247
    const v28, 0x3feaa

    .line 248
    .line 249
    .line 250
    iget-object v9, v0, Ls70;->j:Ljava/lang/String;

    .line 251
    .line 252
    const/4 v10, 0x0

    .line 253
    const-wide/16 v18, 0x0

    .line 254
    .line 255
    const/16 v20, 0x0

    .line 256
    .line 257
    const/16 v21, 0x0

    .line 258
    .line 259
    const/16 v22, 0x0

    .line 260
    .line 261
    const/16 v23, 0x0

    .line 262
    .line 263
    const/16 v24, 0x0

    .line 264
    .line 265
    const v26, 0x6186000

    .line 266
    .line 267
    .line 268
    move-object/from16 v25, v1

    .line 269
    .line 270
    invoke-static/range {v9 .. v28}, Lv03;->b(Ljava/lang/String;Luh1;JJLim0;JJIZIILm13;Lpx;III)V

    .line 271
    .line 272
    .line 273
    iget-object v0, v5, Lsz0;->i:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v0, Lnx1;

    .line 276
    .line 277
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    move-object v9, v0

    .line 282
    check-cast v9, Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v1, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    check-cast v0, Lpu;

    .line 289
    .line 290
    iget-wide v11, v0, Lpu;->s:J

    .line 291
    .line 292
    const/16 v0, 0xe

    .line 293
    .line 294
    invoke-static {v0}, Lrg3;->D(I)J

    .line 295
    .line 296
    .line 297
    move-result-wide v13

    .line 298
    const/16 v0, 0x16

    .line 299
    .line 300
    invoke-static {v0}, Lrg3;->D(I)J

    .line 301
    .line 302
    .line 303
    move-result-wide v18

    .line 304
    invoke-static {v6}, Lrg3;->D(I)J

    .line 305
    .line 306
    .line 307
    move-result-wide v16

    .line 308
    const/16 v27, 0x30

    .line 309
    .line 310
    const v28, 0x3f6ea

    .line 311
    .line 312
    .line 313
    const/4 v15, 0x0

    .line 314
    const v26, 0x6006000

    .line 315
    .line 316
    .line 317
    invoke-static/range {v9 .. v28}, Lv03;->b(Ljava/lang/String;Luh1;JJLim0;JJIZIILm13;Lpx;III)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1, v5}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    if-nez v0, :cond_6

    .line 329
    .line 330
    sget-object v0, Lnx;->a:Leb;

    .line 331
    .line 332
    if-ne v2, v0, :cond_7

    .line 333
    .line 334
    :cond_6
    new-instance v2, Lta;

    .line 335
    .line 336
    const/4 v0, 0x7

    .line 337
    invoke-direct {v2, v0, v5}, Lta;-><init>(ILjava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v1, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    :cond_7
    move-object v9, v2

    .line 344
    check-cast v9, Lxm0;

    .line 345
    .line 346
    sget-object v0, Lte;->e:Lyi0;

    .line 347
    .line 348
    const/high16 v2, 0x40c00000    # 6.0f

    .line 349
    .line 350
    invoke-static {v0, v2}, Lte;->O(Luh1;F)Luh1;

    .line 351
    .line 352
    .line 353
    move-result-object v10

    .line 354
    const/16 v17, 0x0

    .line 355
    .line 356
    const/16 v19, 0x30

    .line 357
    .line 358
    const-wide/16 v11, 0x0

    .line 359
    .line 360
    const-wide/16 v13, 0x0

    .line 361
    .line 362
    const/4 v15, 0x0

    .line 363
    const/16 v16, 0x0

    .line 364
    .line 365
    move-object/from16 v18, v1

    .line 366
    .line 367
    invoke-static/range {v9 .. v19}, Lx32;->b(Lxm0;Luh1;JJIFLin0;Lpx;I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1, v4}, Lgo0;->p(Z)V

    .line 371
    .line 372
    .line 373
    goto :goto_5

    .line 374
    :cond_8
    invoke-virtual {v1}, Lgo0;->R()V

    .line 375
    .line 376
    .line 377
    :goto_5
    return-object v3

    .line 378
    nop

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
