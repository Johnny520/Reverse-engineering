.class public final synthetic Lm/e3;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:F

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lm/e3;->g:I

    .line 2
    .line 3
    iput p1, p0, Lm/e3;->h:F

    .line 4
    .line 5
    iput-object p2, p0, Lm/e3;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lm/e3;->j:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FLjava/lang/Object;I)V
    .locals 0

    .line 13
    iput p4, p0, Lm/e3;->g:I

    iput-object p1, p0, Lm/e3;->i:Ljava/lang/Object;

    iput p2, p0, Lm/e3;->h:F

    iput-object p3, p0, Lm/e3;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lm/e3;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/e3;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Li0/a1;

    .line 9
    .line 10
    iget-object v1, p0, Lm/e3;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Li/c;

    .line 13
    .line 14
    check-cast p1, Lf1/d0;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-lez v2, :cond_0

    .line 30
    .line 31
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    int-to-float v0, v0

    .line 42
    invoke-interface {p1}, Lu2/c;->d()F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    iget v3, p0, Lm/e3;->h:F

    .line 47
    .line 48
    mul-float/2addr v2, v3

    .line 49
    add-float/2addr v2, v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/high16 v2, 0x43fa0000    # 500.0f

    .line 52
    .line 53
    :goto_0
    invoke-virtual {v1}, Li/c;->d()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    mul-float/2addr v0, v2

    .line 64
    invoke-interface {p1, v0}, Lf1/d0;->g(F)V

    .line 65
    .line 66
    .line 67
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 68
    .line 69
    return-object p1

    .line 70
    :pswitch_0
    iget v0, p0, Lm/e3;->h:F

    .line 71
    .line 72
    iget-object v1, p0, Lm/e3;->i:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v3, v1

    .line 75
    check-cast v3, Lf1/g;

    .line 76
    .line 77
    iget-object v1, p0, Lm/e3;->j:Ljava/lang/Object;

    .line 78
    .line 79
    move-object v7, v1

    .line 80
    check-cast v7, Lf1/n;

    .line 81
    .line 82
    move-object v2, p1

    .line 83
    check-cast v2, Lx1/h0;

    .line 84
    .line 85
    invoke-virtual {v2}, Lx1/h0;->e()V

    .line 86
    .line 87
    .line 88
    iget-object p1, v2, Lx1/h0;->g:Lh1/b;

    .line 89
    .line 90
    iget-object p1, p1, Lh1/b;->h:Lb5/c;

    .line 91
    .line 92
    invoke-virtual {p1}, Lb5/c;->v()J

    .line 93
    .line 94
    .line 95
    move-result-wide v10

    .line 96
    invoke-virtual {p1}, Lb5/c;->p()Lf1/u;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-interface {v1}, Lf1/u;->e()V

    .line 101
    .line 102
    .line 103
    :try_start_0
    iget-object v1, p1, Lb5/c;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v1, Landroidx/lifecycle/x;

    .line 106
    .line 107
    const/4 v4, 0x0

    .line 108
    invoke-virtual {v1, v0, v4}, Landroidx/lifecycle/x;->c0(FF)V

    .line 109
    .line 110
    .line 111
    iget-object v0, v1, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Lb5/c;

    .line 114
    .line 115
    invoke-virtual {v0}, Lb5/c;->p()Lf1/u;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const-wide/16 v4, 0x0

    .line 120
    .line 121
    long-to-int v1, v4

    .line 122
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    invoke-interface {v0, v4, v5}, Lf1/u;->m(FF)V

    .line 131
    .line 132
    .line 133
    invoke-interface {v0}, Lf1/u;->n()V

    .line 134
    .line 135
    .line 136
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    neg-float v4, v4

    .line 141
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    neg-float v1, v1

    .line 146
    invoke-interface {v0, v4, v1}, Lf1/u;->m(FF)V

    .line 147
    .line 148
    .line 149
    const/4 v8, 0x0

    .line 150
    const/16 v9, 0x2e

    .line 151
    .line 152
    const-wide/16 v4, 0x0

    .line 153
    .line 154
    const/4 v6, 0x0

    .line 155
    invoke-static/range {v2 .. v9}, Lh1/d;->U(Lh1/d;Lf1/g;JFLf1/n;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Lb5/c;->p()Lf1/u;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-interface {v0}, Lf1/u;->p()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v10, v11}, Lb5/c;->U(J)V

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :catchall_0
    move-exception v0

    .line 170
    invoke-virtual {p1}, Lb5/c;->p()Lf1/u;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-interface {v1}, Lf1/u;->p()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v10, v11}, Lb5/c;->U(J)V

    .line 178
    .line 179
    .line 180
    throw v0

    .line 181
    :pswitch_1
    iget-object v0, p0, Lm/e3;->i:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v0, Lgg/r;

    .line 184
    .line 185
    iget-object v1, p0, Lm/e3;->j:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v1, Lm/k2;

    .line 188
    .line 189
    check-cast p1, Li/j;

    .line 190
    .line 191
    iget v2, p0, Lm/e3;->h:F

    .line 192
    .line 193
    const/4 v3, 0x0

    .line 194
    cmpl-float v4, v2, v3

    .line 195
    .line 196
    if-lez v4, :cond_2

    .line 197
    .line 198
    iget-object v3, p1, Li/j;->e:Li0/j1;

    .line 199
    .line 200
    invoke-virtual {v3}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    check-cast v3, Ljava/lang/Number;

    .line 205
    .line 206
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    cmpl-float v4, v3, v2

    .line 211
    .line 212
    if-lez v4, :cond_1

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_1
    move v2, v3

    .line 216
    :goto_2
    move v3, v2

    .line 217
    goto :goto_3

    .line 218
    :cond_2
    cmpg-float v4, v2, v3

    .line 219
    .line 220
    if-gez v4, :cond_3

    .line 221
    .line 222
    iget-object v3, p1, Li/j;->e:Li0/j1;

    .line 223
    .line 224
    invoke-virtual {v3}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    check-cast v3, Ljava/lang/Number;

    .line 229
    .line 230
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    cmpg-float v4, v3, v2

    .line 235
    .line 236
    if-gez v4, :cond_1

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_3
    :goto_3
    iget v2, v0, Lgg/r;->g:F

    .line 240
    .line 241
    sub-float v2, v3, v2

    .line 242
    .line 243
    iget-object v1, v1, Lm/k2;->b:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v1, Lm/u1;

    .line 246
    .line 247
    invoke-interface {v1, v2}, Lm/u1;->a(F)F

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    cmpg-float v1, v2, v1

    .line 252
    .line 253
    if-nez v1, :cond_4

    .line 254
    .line 255
    iget-object v1, p1, Li/j;->e:Li0/j1;

    .line 256
    .line 257
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    check-cast v1, Ljava/lang/Number;

    .line 262
    .line 263
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    cmpg-float v1, v3, v1

    .line 268
    .line 269
    if-nez v1, :cond_4

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_4
    invoke-virtual {p1}, Li/j;->a()V

    .line 273
    .line 274
    .line 275
    :goto_4
    iget p1, v0, Lgg/r;->g:F

    .line 276
    .line 277
    add-float/2addr p1, v2

    .line 278
    iput p1, v0, Lgg/r;->g:F

    .line 279
    .line 280
    goto/16 :goto_1

    .line 281
    .line 282
    :pswitch_2
    iget-object v0, p0, Lm/e3;->i:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v0, Lm/g3;

    .line 285
    .line 286
    iget-object v1, p0, Lm/e3;->j:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v1, Lfg/l;

    .line 289
    .line 290
    check-cast p1, Ljava/lang/Long;

    .line 291
    .line 292
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 293
    .line 294
    .line 295
    move-result-wide v2

    .line 296
    iget-wide v4, v0, Lm/g3;->b:J

    .line 297
    .line 298
    const-wide/high16 v6, -0x8000000000000000L

    .line 299
    .line 300
    cmp-long p1, v4, v6

    .line 301
    .line 302
    if-nez p1, :cond_5

    .line 303
    .line 304
    iput-wide v2, v0, Lm/g3;->b:J

    .line 305
    .line 306
    :cond_5
    new-instance v7, Li/m;

    .line 307
    .line 308
    iget p1, v0, Lm/g3;->e:F

    .line 309
    .line 310
    invoke-direct {v7, p1}, Li/m;-><init>(F)V

    .line 311
    .line 312
    .line 313
    const/4 v4, 0x0

    .line 314
    iget v5, p0, Lm/e3;->h:F

    .line 315
    .line 316
    cmpg-float v4, v5, v4

    .line 317
    .line 318
    sget-object v8, Lm/g3;->f:Li/m;

    .line 319
    .line 320
    if-nez v4, :cond_6

    .line 321
    .line 322
    iget-object v4, v0, Lm/g3;->a:Li/n1;

    .line 323
    .line 324
    new-instance v5, Li/m;

    .line 325
    .line 326
    invoke-direct {v5, p1}, Li/m;-><init>(F)V

    .line 327
    .line 328
    .line 329
    iget-object p1, v0, Lm/g3;->c:Li/m;

    .line 330
    .line 331
    invoke-interface {v4, v5, v8, p1}, Li/n1;->b(Li/q;Li/q;Li/q;)J

    .line 332
    .line 333
    .line 334
    move-result-wide v4

    .line 335
    :goto_5
    move-wide v5, v4

    .line 336
    goto :goto_6

    .line 337
    :cond_6
    iget-wide v9, v0, Lm/g3;->b:J

    .line 338
    .line 339
    sub-long v9, v2, v9

    .line 340
    .line 341
    long-to-float p1, v9

    .line 342
    div-float/2addr p1, v5

    .line 343
    float-to-double v4, p1

    .line 344
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    .line 345
    .line 346
    .line 347
    move-result p1

    .line 348
    if-nez p1, :cond_7

    .line 349
    .line 350
    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    .line 351
    .line 352
    .line 353
    move-result-wide v4

    .line 354
    goto :goto_5

    .line 355
    :goto_6
    iget-object v4, v0, Lm/g3;->a:Li/n1;

    .line 356
    .line 357
    iget-object v9, v0, Lm/g3;->c:Li/m;

    .line 358
    .line 359
    invoke-interface/range {v4 .. v9}, Li/n1;->w(JLi/q;Li/q;Li/q;)Li/q;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    check-cast p1, Li/m;

    .line 364
    .line 365
    iget p1, p1, Li/m;->a:F

    .line 366
    .line 367
    iget-object v4, v0, Lm/g3;->a:Li/n1;

    .line 368
    .line 369
    iget-object v9, v0, Lm/g3;->c:Li/m;

    .line 370
    .line 371
    invoke-interface/range {v4 .. v9}, Li/n1;->n(JLi/q;Li/q;Li/q;)Li/q;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    check-cast v4, Li/m;

    .line 376
    .line 377
    iput-object v4, v0, Lm/g3;->c:Li/m;

    .line 378
    .line 379
    iput-wide v2, v0, Lm/g3;->b:J

    .line 380
    .line 381
    iget v2, v0, Lm/g3;->e:F

    .line 382
    .line 383
    sub-float/2addr v2, p1

    .line 384
    iput p1, v0, Lm/g3;->e:F

    .line 385
    .line 386
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    invoke-interface {v1, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 394
    .line 395
    goto :goto_7

    .line 396
    :cond_7
    const-string p1, "Cannot round NaN value."

    .line 397
    .line 398
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    const/4 p1, 0x0

    .line 402
    :goto_7
    return-object p1

    .line 403
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
