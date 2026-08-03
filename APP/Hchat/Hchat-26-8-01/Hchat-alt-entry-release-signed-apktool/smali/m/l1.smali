.class public final Lm/l1;
.super Lm/o1;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final f:Lm/a;

.field public final g:Lsg/c;

.field public h:Lqg/e1;


# direct methods
.method public constructor <init>(Lm/o2;Lm/a;Lm/d2;Lu2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3, p4}, Lm/o1;-><init>(Lm/o2;Lfg/p;Lu2/c;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lm/l1;->f:Lm/a;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    const/4 p2, 0x6

    .line 8
    const p3, 0x7fffffff

    .line 9
    .line 10
    .line 11
    invoke-static {p3, p2, p1}, Lsg/j;->a(IILsg/a;)Lsg/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lm/l1;->g:Lsg/c;

    .line 16
    .line 17
    return-void
.end method

.method public static final c(Lm/l1;Lm/o2;Lm/h1;FFLyf/c;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move-object/from16 v1, p5

    .line 8
    .line 9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v9, v5, Lm/o1;->e:Lb/e;

    .line 13
    .line 14
    instance-of v2, v1, Lm/i1;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    move-object v2, v1

    .line 19
    check-cast v2, Lm/i1;

    .line 20
    .line 21
    iget v3, v2, Lm/i1;->l:I

    .line 22
    .line 23
    const/high16 v4, -0x80000000

    .line 24
    .line 25
    and-int v6, v3, v4

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    sub-int/2addr v3, v4

    .line 30
    iput v3, v2, Lm/i1;->l:I

    .line 31
    .line 32
    :goto_0
    move-object v10, v2

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    new-instance v2, Lm/i1;

    .line 35
    .line 36
    invoke-direct {v2, v5, v1}, Lm/i1;-><init>(Lm/l1;Lyf/c;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    iget-object v1, v10, Lm/i1;->j:Ljava/lang/Object;

    .line 41
    .line 42
    iget v2, v10, Lm/i1;->l:I

    .line 43
    .line 44
    sget-object v12, Lsf/n;->a:Lsf/n;

    .line 45
    .line 46
    const/4 v13, 0x2

    .line 47
    const/4 v14, 0x1

    .line 48
    sget-object v15, Lxf/a;->g:Lxf/a;

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    if-eq v2, v14, :cond_2

    .line 53
    .line 54
    if-ne v2, v13, :cond_1

    .line 55
    .line 56
    invoke-static {v1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-object v12

    .line 60
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    return-object v0

    .line 67
    :cond_2
    iget v0, v10, Lm/i1;->i:F

    .line 68
    .line 69
    iget-object v2, v10, Lm/i1;->h:Lgg/r;

    .line 70
    .line 71
    iget-object v3, v10, Lm/i1;->g:Lm/o2;

    .line 72
    .line 73
    invoke-static {v1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move-object/from16 v16, v12

    .line 77
    .line 78
    goto/16 :goto_2

    .line 79
    .line 80
    :cond_3
    invoke-static {v1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    new-instance v3, Lgg/u;

    .line 84
    .line 85
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object v0, v3, Lgg/u;->g:Ljava/lang/Object;

    .line 89
    .line 90
    iget-wide v1, v0, Lm/h1;->b:J

    .line 91
    .line 92
    iget-wide v13, v0, Lm/h1;->a:J

    .line 93
    .line 94
    iget-object v0, v9, Lb/e;->h:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lt1/d;

    .line 97
    .line 98
    const/16 v4, 0x20

    .line 99
    .line 100
    move-object/from16 v16, v12

    .line 101
    .line 102
    shr-long v11, v13, v4

    .line 103
    .line 104
    long-to-int v6, v11

    .line 105
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    invoke-virtual {v0, v1, v2, v6}, Lt1/d;->a(JF)V

    .line 110
    .line 111
    .line 112
    iget-object v0, v9, Lb/e;->i:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, Lt1/d;

    .line 115
    .line 116
    const-wide v11, 0xffffffffL

    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    and-long/2addr v13, v11

    .line 122
    long-to-int v6, v13

    .line 123
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    invoke-virtual {v0, v1, v2, v6}, Lt1/d;->a(JF)V

    .line 128
    .line 129
    .line 130
    iget-object v0, v5, Lm/l1;->g:Lsg/c;

    .line 131
    .line 132
    invoke-static {v0}, Lm/l1;->g(Lsg/c;)Lm/h1;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    if-eqz v0, :cond_4

    .line 137
    .line 138
    iget-wide v1, v0, Lm/h1;->b:J

    .line 139
    .line 140
    iget-wide v13, v0, Lm/h1;->a:J

    .line 141
    .line 142
    iget-object v6, v9, Lb/e;->h:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v6, Lt1/d;

    .line 145
    .line 146
    move-wide/from16 v17, v11

    .line 147
    .line 148
    shr-long v11, v13, v4

    .line 149
    .line 150
    long-to-int v4, v11

    .line 151
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    invoke-virtual {v6, v1, v2, v4}, Lt1/d;->a(JF)V

    .line 156
    .line 157
    .line 158
    iget-object v4, v9, Lb/e;->i:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v4, Lt1/d;

    .line 161
    .line 162
    and-long v11, v13, v17

    .line 163
    .line 164
    long-to-int v6, v11

    .line 165
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    invoke-virtual {v4, v1, v2, v6}, Lt1/d;->a(JF)V

    .line 170
    .line 171
    .line 172
    iget-object v1, v3, Lgg/u;->g:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v1, Lm/h1;

    .line 175
    .line 176
    invoke-virtual {v1, v0}, Lm/h1;->a(Lm/h1;)Lm/h1;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iput-object v0, v3, Lgg/u;->g:Ljava/lang/Object;

    .line 181
    .line 182
    :cond_4
    new-instance v1, Lgg/r;

    .line 183
    .line 184
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 185
    .line 186
    .line 187
    iget-object v0, v3, Lgg/u;->g:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, Lm/h1;

    .line 190
    .line 191
    iget-wide v11, v0, Lm/h1;->a:J

    .line 192
    .line 193
    invoke-virtual {v7, v11, v12}, Lm/o2;->e(J)J

    .line 194
    .line 195
    .line 196
    move-result-wide v11

    .line 197
    invoke-virtual {v7, v11, v12}, Lm/o2;->g(J)F

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    iput v0, v1, Lgg/r;->g:F

    .line 202
    .line 203
    invoke-static {v0}, Lm/m1;->a(F)Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-eqz v0, :cond_5

    .line 208
    .line 209
    goto/16 :goto_6

    .line 210
    .line 211
    :cond_5
    new-instance v2, Lgg/u;

    .line 212
    .line 213
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 214
    .line 215
    .line 216
    const/16 v0, 0x1e

    .line 217
    .line 218
    const/4 v4, 0x0

    .line 219
    invoke-static {v4, v4, v0}, Li/d;->b(FFI)Li/l;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    iput-object v0, v2, Lgg/u;->g:Ljava/lang/Object;

    .line 224
    .line 225
    new-instance v0, Lm/j1;

    .line 226
    .line 227
    const/4 v8, 0x0

    .line 228
    move/from16 v4, p3

    .line 229
    .line 230
    move/from16 v6, p4

    .line 231
    .line 232
    invoke-direct/range {v0 .. v8}, Lm/j1;-><init>(Lgg/r;Lgg/u;Lgg/u;FLm/l1;FLm/o2;Lwf/c;)V

    .line 233
    .line 234
    .line 235
    iput-object v7, v10, Lm/i1;->g:Lm/o2;

    .line 236
    .line 237
    iput-object v1, v10, Lm/i1;->h:Lgg/r;

    .line 238
    .line 239
    iput v6, v10, Lm/i1;->i:F

    .line 240
    .line 241
    const/4 v2, 0x1

    .line 242
    iput v2, v10, Lm/i1;->l:I

    .line 243
    .line 244
    invoke-virtual {v5, v0, v10}, Lm/o1;->b(Lfg/p;Lyf/c;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    if-ne v0, v15, :cond_6

    .line 249
    .line 250
    goto/16 :goto_5

    .line 251
    .line 252
    :cond_6
    move-object v2, v1

    .line 253
    move v0, v6

    .line 254
    move-object v3, v7

    .line 255
    :goto_2
    iget-object v1, v9, Lb/e;->h:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v1, Lt1/d;

    .line 258
    .line 259
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1, v4}, Lt1/d;->b(F)F

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    iget-object v6, v9, Lb/e;->i:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v6, Lt1/d;

    .line 269
    .line 270
    invoke-virtual {v6, v4}, Lt1/d;->b(F)F

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    invoke-static {v1, v4}, La/a;->d(FF)J

    .line 275
    .line 276
    .line 277
    move-result-wide v6

    .line 278
    const-wide/16 v8, 0x0

    .line 279
    .line 280
    cmp-long v1, v6, v8

    .line 281
    .line 282
    if-nez v1, :cond_9

    .line 283
    .line 284
    iget v1, v2, Lgg/r;->g:F

    .line 285
    .line 286
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    const/16 v4, 0x64

    .line 291
    .line 292
    int-to-float v4, v4

    .line 293
    div-float/2addr v1, v4

    .line 294
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    iget v1, v2, Lgg/r;->g:F

    .line 299
    .line 300
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    invoke-virtual {v3, v1}, Lm/o2;->d(F)F

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    mul-float/2addr v1, v0

    .line 309
    const/16 v0, 0x3e8

    .line 310
    .line 311
    int-to-float v0, v0

    .line 312
    mul-float/2addr v1, v0

    .line 313
    const/4 v4, 0x0

    .line 314
    cmpg-float v0, v1, v4

    .line 315
    .line 316
    if-nez v0, :cond_7

    .line 317
    .line 318
    move-wide v6, v8

    .line 319
    goto :goto_4

    .line 320
    :cond_7
    iget-object v0, v3, Lm/o2;->d:Lm/p1;

    .line 321
    .line 322
    sget-object v2, Lm/p1;->h:Lm/p1;

    .line 323
    .line 324
    if-ne v0, v2, :cond_8

    .line 325
    .line 326
    invoke-static {v1, v4}, La/a;->d(FF)J

    .line 327
    .line 328
    .line 329
    move-result-wide v0

    .line 330
    :goto_3
    move-wide v6, v0

    .line 331
    goto :goto_4

    .line 332
    :cond_8
    invoke-static {v4, v1}, La/a;->d(FF)J

    .line 333
    .line 334
    .line 335
    move-result-wide v0

    .line 336
    goto :goto_3

    .line 337
    :cond_9
    :goto_4
    iget-object v0, v5, Lm/o1;->b:Lgg/a;

    .line 338
    .line 339
    new-instance v1, Lu2/q;

    .line 340
    .line 341
    invoke-direct {v1, v6, v7}, Lu2/q;-><init>(J)V

    .line 342
    .line 343
    .line 344
    const/4 v2, 0x0

    .line 345
    iput-object v2, v10, Lm/i1;->g:Lm/o2;

    .line 346
    .line 347
    iput-object v2, v10, Lm/i1;->h:Lgg/r;

    .line 348
    .line 349
    const/4 v2, 0x2

    .line 350
    iput v2, v10, Lm/i1;->l:I

    .line 351
    .line 352
    invoke-interface {v0, v1, v10}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    if-ne v0, v15, :cond_a

    .line 357
    .line 358
    :goto_5
    return-object v15

    .line 359
    :cond_a
    :goto_6
    return-object v16
.end method

.method public static final d(Lm/l1;Lgg/u;Lgg/r;Lm/o2;Lgg/u;JLyf/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-wide/from16 v0, p5

    .line 2
    .line 3
    move-object/from16 v2, p7

    .line 4
    .line 5
    instance-of v3, v2, Lm/k1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Lm/k1;

    .line 11
    .line 12
    iget v4, v3, Lm/k1;->m:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Lm/k1;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Lm/k1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Lyf/c;-><init>(Lwf/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Lm/k1;->l:Ljava/lang/Object;

    .line 30
    .line 31
    iget v4, v3, Lm/k1;->m:I

    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    if-ne v4, v5, :cond_1

    .line 37
    .line 38
    iget-object p0, v3, Lm/k1;->k:Lgg/u;

    .line 39
    .line 40
    iget-object p1, v3, Lm/k1;->j:Lm/o2;

    .line 41
    .line 42
    iget-object v0, v3, Lm/k1;->i:Lgg/r;

    .line 43
    .line 44
    iget-object v1, v3, Lm/k1;->h:Lgg/u;

    .line 45
    .line 46
    iget-object v3, v3, Lm/k1;->g:Lm/l1;

    .line 47
    .line 48
    invoke-static {v2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object v7, p0

    .line 52
    move-object v6, p1

    .line 53
    move-object p1, v1

    .line 54
    move-object p0, v3

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    return-object p0

    .line 63
    :cond_2
    invoke-static {v2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const-wide/16 v6, 0x0

    .line 67
    .line 68
    cmp-long v2, v0, v6

    .line 69
    .line 70
    if-gez v2, :cond_3

    .line 71
    .line 72
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_3
    new-instance v2, Lci/c;

    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/4 v6, 0x7

    .line 79
    invoke-direct {v2, p0, v4, v6}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 80
    .line 81
    .line 82
    iput-object p0, v3, Lm/k1;->g:Lm/l1;

    .line 83
    .line 84
    iput-object p1, v3, Lm/k1;->h:Lgg/u;

    .line 85
    .line 86
    iput-object p2, v3, Lm/k1;->i:Lgg/r;

    .line 87
    .line 88
    iput-object p3, v3, Lm/k1;->j:Lm/o2;

    .line 89
    .line 90
    iput-object p4, v3, Lm/k1;->k:Lgg/u;

    .line 91
    .line 92
    iput v5, v3, Lm/k1;->m:I

    .line 93
    .line 94
    invoke-static {v0, v1, v2, v3}, Lqg/v;->y(JLfg/p;Lyf/c;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 99
    .line 100
    if-ne v2, v0, :cond_4

    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_4
    move-object v0, p2

    .line 104
    move-object v6, p3

    .line 105
    move-object v7, p4

    .line 106
    :goto_1
    check-cast v2, Lm/h1;

    .line 107
    .line 108
    if-eqz v2, :cond_5

    .line 109
    .line 110
    iget-object v1, p1, Lgg/u;->g:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v1, Lm/h1;

    .line 113
    .line 114
    iget-boolean v1, v1, Lm/h1;->c:Z

    .line 115
    .line 116
    iget-wide v3, v2, Lm/h1;->a:J

    .line 117
    .line 118
    iget-wide v8, v2, Lm/h1;->b:J

    .line 119
    .line 120
    new-instance v10, Lm/h1;

    .line 121
    .line 122
    move/from16 p7, v1

    .line 123
    .line 124
    move-wide p3, v3

    .line 125
    move-wide/from16 p5, v8

    .line 126
    .line 127
    move-object p2, v10

    .line 128
    invoke-direct/range {p2 .. p7}, Lm/h1;-><init>(JJZ)V

    .line 129
    .line 130
    .line 131
    move-object v1, p2

    .line 132
    iput-object v1, p1, Lgg/u;->g:Ljava/lang/Object;

    .line 133
    .line 134
    invoke-virtual {v6, v3, v4}, Lm/o2;->e(J)J

    .line 135
    .line 136
    .line 137
    move-result-wide v3

    .line 138
    invoke-virtual {v6, v3, v4}, Lm/o2;->i(J)F

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    iput p1, v0, Lgg/r;->g:F

    .line 143
    .line 144
    const/16 p1, 0x1e

    .line 145
    .line 146
    const/4 v1, 0x0

    .line 147
    invoke-static {v1, v1, p1}, Li/d;->b(FFI)Li/l;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iput-object p1, v7, Lgg/u;->g:Ljava/lang/Object;

    .line 152
    .line 153
    iget-object p0, p0, Lm/o1;->e:Lb/e;

    .line 154
    .line 155
    iget-wide v3, v2, Lm/h1;->b:J

    .line 156
    .line 157
    iget-wide v1, v2, Lm/h1;->a:J

    .line 158
    .line 159
    iget-object p1, p0, Lb/e;->h:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p1, Lt1/d;

    .line 162
    .line 163
    const/16 v6, 0x20

    .line 164
    .line 165
    shr-long v6, v1, v6

    .line 166
    .line 167
    long-to-int v6, v6

    .line 168
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    invoke-virtual {p1, v3, v4, v6}, Lt1/d;->a(JF)V

    .line 173
    .line 174
    .line 175
    iget-object p0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast p0, Lt1/d;

    .line 178
    .line 179
    const-wide v6, 0xffffffffL

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    and-long/2addr v1, v6

    .line 185
    long-to-int p1, v1

    .line 186
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    invoke-virtual {p0, v3, v4, p1}, Lt1/d;->a(JF)V

    .line 191
    .line 192
    .line 193
    iget p0, v0, Lgg/r;->g:F

    .line 194
    .line 195
    invoke-static {p0}, Lm/m1;->a(F)Z

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    xor-int/2addr p0, v5

    .line 200
    goto :goto_2

    .line 201
    :cond_5
    const/4 p0, 0x0

    .line 202
    :goto_2
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    return-object p0
.end method

.method public static g(Lsg/c;)Lm/h1;
    .locals 3

    .line 1
    new-instance v0, Lm/g1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lm/g1;-><init>(Lsg/g;I)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Ld9/k;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {p0, v0, v2, v1}, Ld9/k;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lfb/v0;->B(Lfg/p;)Lng/k;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-virtual {p0}, Lng/k;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lng/k;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lm/h1;

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    :goto_1
    move-object v2, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v2, v0}, Lm/h1;->a(Lm/h1;)Lm/h1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    return-object v2
.end method


# virtual methods
.method public final e(Lm/m2;F)F
    .locals 4

    .line 1
    iget-object v0, p0, Lm/o1;->a:Lm/o2;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lm/o2;->d(F)F

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {v0, p2}, Lm/o2;->h(F)J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    iget-object p1, p1, Lm/m2;->a:Lm/o2;

    .line 12
    .line 13
    iget-object p2, p1, Lm/o2;->k:Lm/u1;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-virtual {p1, p2, v1, v2, v3}, Lm/o2;->c(Lm/u1;JI)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    invoke-virtual {v0, p1, p2}, Lm/o2;->e(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    invoke-virtual {v0, p1, p2}, Lm/o2;->g(J)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1
.end method

.method public final f(Ls1/k;)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lm/l1;->f:Lm/a;

    .line 2
    .line 3
    iget-object v0, v0, Lm/a;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/view/ViewConfiguration;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledVerticalScrollFactor()F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    neg-float v1, v1

    .line 12
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledHorizontalScrollFactor()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    neg-float v0, v0

    .line 17
    iget-object v2, p1, Ls1/k;->a:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance v3, Le1/b;

    .line 20
    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    invoke-direct {v3, v4, v5}, Le1/b;-><init>(J)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/4 v5, 0x0

    .line 31
    move v6, v5

    .line 32
    :goto_0
    iget-wide v7, v3, Le1/b;->a:J

    .line 33
    .line 34
    if-ge v6, v4, :cond_0

    .line 35
    .line 36
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ls1/t;

    .line 41
    .line 42
    iget-wide v9, v3, Ls1/t;->j:J

    .line 43
    .line 44
    invoke-static {v7, v8, v9, v10}, Le1/b;->e(JJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v7

    .line 48
    new-instance v3, Le1/b;

    .line 49
    .line 50
    invoke-direct {v3, v7, v8}, Le1/b;-><init>(J)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 v6, v6, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/16 v2, 0x20

    .line 57
    .line 58
    shr-long v3, v7, v2

    .line 59
    .line 60
    long-to-int v3, v3

    .line 61
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    mul-float/2addr v3, v0

    .line 66
    const-wide v9, 0xffffffffL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    and-long v6, v7, v9

    .line 72
    .line 73
    long-to-int v0, v6

    .line 74
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    mul-float/2addr v0, v1

    .line 79
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    int-to-long v3, v1

    .line 84
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    int-to-long v0, v0

    .line 89
    shl-long v2, v3, v2

    .line 90
    .line 91
    and-long/2addr v0, v9

    .line 92
    or-long v7, v2, v0

    .line 93
    .line 94
    iget-object v0, p0, Lm/o1;->a:Lm/o2;

    .line 95
    .line 96
    invoke-virtual {v0, v7, v8}, Lm/o2;->e(J)J

    .line 97
    .line 98
    .line 99
    move-result-wide v1

    .line 100
    invoke-virtual {v0, v1, v2}, Lm/o2;->i(J)F

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    const/4 v2, 0x0

    .line 105
    cmpg-float v3, v1, v2

    .line 106
    .line 107
    if-nez v3, :cond_1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_1
    cmpl-float v1, v1, v2

    .line 111
    .line 112
    iget-object v0, v0, Lm/o2;->a:Lm/i2;

    .line 113
    .line 114
    if-lez v1, :cond_2

    .line 115
    .line 116
    invoke-interface {v0}, Lm/i2;->d()Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    goto :goto_1

    .line 121
    :cond_2
    invoke-interface {v0}, Lm/i2;->c()Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    :goto_1
    if-eqz v5, :cond_3

    .line 126
    .line 127
    new-instance v6, Lm/h1;

    .line 128
    .line 129
    iget-object p1, p1, Ls1/k;->a:Ljava/lang/Object;

    .line 130
    .line 131
    invoke-static {p1}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Ls1/t;

    .line 136
    .line 137
    iget-wide v9, p1, Ls1/t;->b:J

    .line 138
    .line 139
    const/4 v11, 0x0

    .line 140
    invoke-direct/range {v6 .. v11}, Lm/h1;-><init>(JJZ)V

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lm/l1;->g:Lsg/c;

    .line 144
    .line 145
    invoke-interface {p1, v6}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    instance-of p1, p1, Lsg/i;

    .line 150
    .line 151
    xor-int/lit8 p1, p1, 0x1

    .line 152
    .line 153
    return p1

    .line 154
    :cond_3
    iget-boolean p1, p0, Lm/o1;->d:Z

    .line 155
    .line 156
    return p1
.end method
