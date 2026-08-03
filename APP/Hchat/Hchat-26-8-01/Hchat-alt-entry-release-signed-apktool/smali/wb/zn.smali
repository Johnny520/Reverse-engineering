.class public final Lwb/zn;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public h:Ls1/t;

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lfg/l;

.field public final synthetic l:Lwb/c0;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Lwb/c0;Lwf/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/zn;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/zn;->k:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/zn;->l:Lwb/c0;

    .line 6
    .line 7
    invoke-direct {p0, p3}, Lyf/h;-><init>(Lwf/c;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 4

    .line 1
    iget v0, p0, Lwb/zn;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lwb/zn;

    .line 7
    .line 8
    iget-object v1, p0, Lwb/zn;->l:Lwb/c0;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iget-object v3, p0, Lwb/zn;->k:Lfg/l;

    .line 12
    .line 13
    invoke-direct {v0, v3, v1, p2, v2}, Lwb/zn;-><init>(Lfg/l;Lwb/c0;Lwf/c;I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Lwb/zn;->j:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, Lwb/zn;

    .line 20
    .line 21
    iget-object v1, p0, Lwb/zn;->l:Lwb/c0;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iget-object v3, p0, Lwb/zn;->k:Lfg/l;

    .line 25
    .line 26
    invoke-direct {v0, v3, v1, p2, v2}, Lwb/zn;-><init>(Lfg/l;Lwb/c0;Lwf/c;I)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, Lwb/zn;->j:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwb/zn;->g:I

    .line 2
    .line 3
    check-cast p1, Ls1/k0;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lwb/zn;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lwb/zn;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lwb/zn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lwb/zn;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lwb/zn;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lwb/zn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/zn;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/zn;->l:Lwb/c0;

    .line 9
    .line 10
    iget v2, v1, Lwb/c0;->c:F

    .line 11
    .line 12
    iget v1, v1, Lwb/c0;->b:F

    .line 13
    .line 14
    iget-object v3, v0, Lwb/zn;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Ls1/k0;

    .line 17
    .line 18
    iget v4, v0, Lwb/zn;->i:I

    .line 19
    .line 20
    iget-object v5, v0, Lwb/zn;->k:Lfg/l;

    .line 21
    .line 22
    const/4 v6, 0x2

    .line 23
    const/4 v7, 0x1

    .line 24
    const-wide v8, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    sget-object v10, Lxf/a;->g:Lxf/a;

    .line 30
    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    if-eq v4, v7, :cond_1

    .line 34
    .line 35
    if-ne v4, v6, :cond_0

    .line 36
    .line 37
    iget-object v4, v0, Lwb/zn;->h:Ls1/t;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object/from16 v7, p1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v10, 0x0

    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_1
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object/from16 v4, p1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iput-object v3, v0, Lwb/zn;->j:Ljava/lang/Object;

    .line 63
    .line 64
    iput v7, v0, Lwb/zn;->i:I

    .line 65
    .line 66
    invoke-static {v3, v0, v6}, Lm/y2;->b(Ls1/k0;Lwf/c;I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    if-ne v4, v10, :cond_3

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    :goto_0
    check-cast v4, Ls1/t;

    .line 74
    .line 75
    iget-wide v11, v4, Ls1/t;->c:J

    .line 76
    .line 77
    and-long/2addr v11, v8

    .line 78
    long-to-int v7, v11

    .line 79
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    iget-object v11, v3, Ls1/k0;->l:Ls1/l0;

    .line 84
    .line 85
    iget-wide v11, v11, Ls1/l0;->E:J

    .line 86
    .line 87
    and-long/2addr v11, v8

    .line 88
    long-to-int v11, v11

    .line 89
    int-to-float v11, v11

    .line 90
    invoke-static {v1, v2, v7, v11}, Lwb/ho;->x4(FFFF)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-interface {v5, v7}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    :cond_4
    iput-object v3, v0, Lwb/zn;->j:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v4, v0, Lwb/zn;->h:Ls1/t;

    .line 100
    .line 101
    iput v6, v0, Lwb/zn;->i:I

    .line 102
    .line 103
    sget-object v7, Ls1/l;->h:Ls1/l;

    .line 104
    .line 105
    invoke-virtual {v3, v7, v0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    if-ne v7, v10, :cond_5

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    :goto_1
    check-cast v7, Ls1/k;

    .line 113
    .line 114
    iget-object v7, v7, Ls1/k;->a:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    :cond_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    if-eqz v11, :cond_7

    .line 125
    .line 126
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    move-object v12, v11

    .line 131
    check-cast v12, Ls1/t;

    .line 132
    .line 133
    iget-wide v12, v12, Ls1/t;->a:J

    .line 134
    .line 135
    iget-wide v14, v4, Ls1/t;->a:J

    .line 136
    .line 137
    invoke-static {v12, v13, v14, v15}, Ls1/s;->e(JJ)Z

    .line 138
    .line 139
    .line 140
    move-result v12

    .line 141
    if-eqz v12, :cond_6

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_7
    const/4 v11, 0x0

    .line 145
    :goto_2
    check-cast v11, Ls1/t;

    .line 146
    .line 147
    if-eqz v11, :cond_8

    .line 148
    .line 149
    iget-wide v12, v11, Ls1/t;->c:J

    .line 150
    .line 151
    and-long/2addr v12, v8

    .line 152
    long-to-int v7, v12

    .line 153
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    iget-object v12, v3, Ls1/k0;->l:Ls1/l0;

    .line 158
    .line 159
    iget-wide v12, v12, Ls1/l0;->E:J

    .line 160
    .line 161
    and-long/2addr v12, v8

    .line 162
    long-to-int v12, v12

    .line 163
    int-to-float v12, v12

    .line 164
    invoke-static {v1, v2, v7, v12}, Lwb/ho;->x4(FFFF)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    invoke-interface {v5, v7}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v11}, Ls1/t;->a()V

    .line 172
    .line 173
    .line 174
    iget-boolean v7, v11, Ls1/t;->d:Z

    .line 175
    .line 176
    if-nez v7, :cond_4

    .line 177
    .line 178
    :cond_8
    sget-object v10, Lsf/n;->a:Lsf/n;

    .line 179
    .line 180
    :goto_3
    return-object v10

    .line 181
    :pswitch_0
    iget-object v1, v0, Lwb/zn;->l:Lwb/c0;

    .line 182
    .line 183
    iget v1, v1, Lwb/c0;->a:F

    .line 184
    .line 185
    iget-object v2, v0, Lwb/zn;->j:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v2, Ls1/k0;

    .line 188
    .line 189
    iget v3, v0, Lwb/zn;->i:I

    .line 190
    .line 191
    const/16 v6, 0x20

    .line 192
    .line 193
    iget-object v7, v0, Lwb/zn;->k:Lfg/l;

    .line 194
    .line 195
    const/4 v8, 0x2

    .line 196
    const/4 v9, 0x1

    .line 197
    sget-object v10, Lxf/a;->g:Lxf/a;

    .line 198
    .line 199
    if-eqz v3, :cond_b

    .line 200
    .line 201
    if-eq v3, v9, :cond_a

    .line 202
    .line 203
    if-ne v3, v8, :cond_9

    .line 204
    .line 205
    iget-object v3, v0, Lwb/zn;->h:Ls1/t;

    .line 206
    .line 207
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    move-object/from16 v4, p1

    .line 211
    .line 212
    const-wide v15, 0xffffffffL

    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_9
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 219
    .line 220
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    const/4 v10, 0x0

    .line 224
    goto/16 :goto_9

    .line 225
    .line 226
    :cond_a
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    move-object/from16 v3, p1

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_b
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    iput-object v2, v0, Lwb/zn;->j:Ljava/lang/Object;

    .line 236
    .line 237
    iput v9, v0, Lwb/zn;->i:I

    .line 238
    .line 239
    invoke-static {v2, v0, v8}, Lm/y2;->b(Ls1/k0;Lwf/c;I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    if-ne v3, v10, :cond_c

    .line 244
    .line 245
    goto :goto_9

    .line 246
    :cond_c
    :goto_4
    check-cast v3, Ls1/t;

    .line 247
    .line 248
    iget-wide v11, v3, Ls1/t;->c:J

    .line 249
    .line 250
    iget-object v9, v2, Ls1/k0;->l:Ls1/l0;

    .line 251
    .line 252
    iget-wide v13, v9, Ls1/l0;->E:J

    .line 253
    .line 254
    const-wide v15, 0xffffffffL

    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    shr-long v4, v13, v6

    .line 260
    .line 261
    long-to-int v4, v4

    .line 262
    int-to-float v4, v4

    .line 263
    and-long/2addr v13, v15

    .line 264
    long-to-int v5, v13

    .line 265
    int-to-float v5, v5

    .line 266
    invoke-static {v1, v4, v5, v11, v12}, Lwb/ho;->y4(FFFJ)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    invoke-interface {v7, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    :goto_5
    iput-object v2, v0, Lwb/zn;->j:Ljava/lang/Object;

    .line 274
    .line 275
    iput-object v3, v0, Lwb/zn;->h:Ls1/t;

    .line 276
    .line 277
    iput v8, v0, Lwb/zn;->i:I

    .line 278
    .line 279
    sget-object v4, Ls1/l;->h:Ls1/l;

    .line 280
    .line 281
    invoke-virtual {v2, v4, v0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    if-ne v4, v10, :cond_d

    .line 286
    .line 287
    goto :goto_9

    .line 288
    :cond_d
    :goto_6
    check-cast v4, Ls1/k;

    .line 289
    .line 290
    iget-object v4, v4, Ls1/k;->a:Ljava/lang/Object;

    .line 291
    .line 292
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    :cond_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v5

    .line 300
    if-eqz v5, :cond_f

    .line 301
    .line 302
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    move-object v9, v5

    .line 307
    check-cast v9, Ls1/t;

    .line 308
    .line 309
    iget-wide v11, v9, Ls1/t;->a:J

    .line 310
    .line 311
    iget-wide v13, v3, Ls1/t;->a:J

    .line 312
    .line 313
    invoke-static {v11, v12, v13, v14}, Ls1/s;->e(JJ)Z

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    if-eqz v9, :cond_e

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_f
    const/4 v5, 0x0

    .line 321
    :goto_7
    check-cast v5, Ls1/t;

    .line 322
    .line 323
    if-eqz v5, :cond_11

    .line 324
    .line 325
    iget-wide v11, v5, Ls1/t;->c:J

    .line 326
    .line 327
    iget-object v4, v2, Ls1/k0;->l:Ls1/l0;

    .line 328
    .line 329
    iget-wide v13, v4, Ls1/l0;->E:J

    .line 330
    .line 331
    shr-long v8, v13, v6

    .line 332
    .line 333
    long-to-int v8, v8

    .line 334
    int-to-float v8, v8

    .line 335
    and-long/2addr v13, v15

    .line 336
    long-to-int v9, v13

    .line 337
    int-to-float v9, v9

    .line 338
    invoke-static {v1, v8, v9, v11, v12}, Lwb/ho;->y4(FFFJ)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v8

    .line 342
    invoke-interface {v7, v8}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v5}, Ls1/t;->a()V

    .line 346
    .line 347
    .line 348
    iget-boolean v5, v5, Ls1/t;->d:Z

    .line 349
    .line 350
    if-nez v5, :cond_10

    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_10
    const/4 v8, 0x2

    .line 354
    goto :goto_5

    .line 355
    :cond_11
    :goto_8
    sget-object v10, Lsf/n;->a:Lsf/n;

    .line 356
    .line 357
    :goto_9
    return-object v10

    .line 358
    nop

    .line 359
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
