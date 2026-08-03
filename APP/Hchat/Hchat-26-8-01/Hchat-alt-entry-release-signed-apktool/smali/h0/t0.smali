.class public final synthetic Lh0/t0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lh0/d1;


# direct methods
.method public synthetic constructor <init>(Lh0/d1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh0/t0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lh0/t0;->h:Lh0/d1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lh0/t0;->g:I

    .line 4
    .line 5
    iget-object v2, v0, Lh0/t0;->h:Lh0/d1;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Le1/b;

    .line 13
    .line 14
    invoke-virtual {v2}, Lh0/d1;->r()V

    .line 15
    .line 16
    .line 17
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, Li0/a0;

    .line 23
    .line 24
    new-instance v1, Lb0/m;

    .line 25
    .line 26
    const/4 v3, 0x6

    .line 27
    invoke-direct {v1, v2, v3}, Lb0/m;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_1
    move-object/from16 v1, p1

    .line 32
    .line 33
    check-cast v1, Lv1/t;

    .line 34
    .line 35
    iget-object v3, v2, Lh0/d1;->d:Lw/q0;

    .line 36
    .line 37
    sget-object v4, Le1/c;->e:Le1/c;

    .line 38
    .line 39
    if-eqz v3, :cond_7

    .line 40
    .line 41
    iget-boolean v6, v3, Lw/q0;->p:Z

    .line 42
    .line 43
    if-nez v6, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v3, 0x0

    .line 47
    :goto_0
    if-eqz v3, :cond_7

    .line 48
    .line 49
    iget-object v6, v2, Lh0/d1;->b:Lb5/k;

    .line 50
    .line 51
    invoke-virtual {v2}, Lh0/d1;->n()Ln2/s;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    iget-wide v7, v7, Ln2/s;->b:J

    .line 56
    .line 57
    sget v9, Li2/m0;->c:I

    .line 58
    .line 59
    const/16 v9, 0x20

    .line 60
    .line 61
    shr-long/2addr v7, v9

    .line 62
    long-to-int v7, v7

    .line 63
    invoke-virtual {v6, v7}, Lb5/k;->l(I)I

    .line 64
    .line 65
    .line 66
    iget-object v6, v2, Lh0/d1;->b:Lb5/k;

    .line 67
    .line 68
    invoke-virtual {v2}, Lh0/d1;->n()Ln2/s;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    iget-wide v10, v8, Ln2/s;->b:J

    .line 73
    .line 74
    const-wide v12, 0xffffffffL

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    and-long/2addr v10, v12

    .line 80
    long-to-int v8, v10

    .line 81
    invoke-virtual {v6, v8}, Lb5/k;->l(I)I

    .line 82
    .line 83
    .line 84
    iget-object v6, v2, Lh0/d1;->d:Lw/q0;

    .line 85
    .line 86
    const-wide/16 v10, 0x0

    .line 87
    .line 88
    if-eqz v6, :cond_1

    .line 89
    .line 90
    invoke-virtual {v6}, Lw/q0;->c()Lv1/t;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    if-eqz v6, :cond_1

    .line 95
    .line 96
    const/4 v14, 0x1

    .line 97
    invoke-virtual {v2, v14}, Lh0/d1;->l(Z)J

    .line 98
    .line 99
    .line 100
    move-result-wide v14

    .line 101
    invoke-interface {v6, v14, v15}, Lv1/t;->m0(J)J

    .line 102
    .line 103
    .line 104
    move-result-wide v14

    .line 105
    goto :goto_1

    .line 106
    :cond_1
    move-wide v14, v10

    .line 107
    :goto_1
    iget-object v6, v2, Lh0/d1;->d:Lw/q0;

    .line 108
    .line 109
    if-eqz v6, :cond_2

    .line 110
    .line 111
    invoke-virtual {v6}, Lw/q0;->c()Lv1/t;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    if-eqz v6, :cond_2

    .line 116
    .line 117
    const/4 v10, 0x0

    .line 118
    invoke-virtual {v2, v10}, Lh0/d1;->l(Z)J

    .line 119
    .line 120
    .line 121
    move-result-wide v10

    .line 122
    invoke-interface {v6, v10, v11}, Lv1/t;->m0(J)J

    .line 123
    .line 124
    .line 125
    move-result-wide v10

    .line 126
    :cond_2
    iget-object v6, v2, Lh0/d1;->d:Lw/q0;

    .line 127
    .line 128
    const/16 v16, 0x0

    .line 129
    .line 130
    if-eqz v6, :cond_4

    .line 131
    .line 132
    invoke-virtual {v6}, Lw/q0;->c()Lv1/t;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    if-eqz v6, :cond_4

    .line 137
    .line 138
    invoke-virtual {v3}, Lw/q0;->d()Lw/m1;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    if-eqz v5, :cond_3

    .line 143
    .line 144
    iget-object v5, v5, Lw/m1;->a:Li2/k0;

    .line 145
    .line 146
    invoke-virtual {v5, v7}, Li2/k0;->c(I)Le1/c;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    iget v5, v5, Le1/c;->b:F

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_3
    move/from16 v5, v16

    .line 154
    .line 155
    :goto_2
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    move/from16 v17, v9

    .line 160
    .line 161
    move-wide/from16 v18, v10

    .line 162
    .line 163
    int-to-long v9, v7

    .line 164
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    move-wide/from16 v20, v12

    .line 169
    .line 170
    int-to-long v12, v5

    .line 171
    shl-long v9, v9, v17

    .line 172
    .line 173
    and-long v11, v12, v20

    .line 174
    .line 175
    or-long/2addr v9, v11

    .line 176
    invoke-interface {v6, v9, v10}, Lv1/t;->m0(J)J

    .line 177
    .line 178
    .line 179
    move-result-wide v5

    .line 180
    and-long v5, v5, v20

    .line 181
    .line 182
    long-to-int v5, v5

    .line 183
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    goto :goto_3

    .line 188
    :cond_4
    move/from16 v17, v9

    .line 189
    .line 190
    move-wide/from16 v18, v10

    .line 191
    .line 192
    move-wide/from16 v20, v12

    .line 193
    .line 194
    move/from16 v5, v16

    .line 195
    .line 196
    :goto_3
    iget-object v6, v2, Lh0/d1;->d:Lw/q0;

    .line 197
    .line 198
    if-eqz v6, :cond_6

    .line 199
    .line 200
    invoke-virtual {v6}, Lw/q0;->c()Lv1/t;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    if-eqz v6, :cond_6

    .line 205
    .line 206
    invoke-virtual {v3}, Lw/q0;->d()Lw/m1;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    if-eqz v7, :cond_5

    .line 211
    .line 212
    iget-object v7, v7, Lw/m1;->a:Li2/k0;

    .line 213
    .line 214
    invoke-virtual {v7, v8}, Li2/k0;->c(I)Le1/c;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    iget v7, v7, Le1/c;->b:F

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_5
    move/from16 v7, v16

    .line 222
    .line 223
    :goto_4
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    int-to-long v8, v8

    .line 228
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    int-to-long v10, v7

    .line 233
    shl-long v7, v8, v17

    .line 234
    .line 235
    and-long v9, v10, v20

    .line 236
    .line 237
    or-long/2addr v7, v9

    .line 238
    invoke-interface {v6, v7, v8}, Lv1/t;->m0(J)J

    .line 239
    .line 240
    .line 241
    move-result-wide v6

    .line 242
    and-long v6, v6, v20

    .line 243
    .line 244
    long-to-int v6, v6

    .line 245
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 246
    .line 247
    .line 248
    move-result v16

    .line 249
    :cond_6
    move/from16 v6, v16

    .line 250
    .line 251
    shr-long v7, v14, v17

    .line 252
    .line 253
    long-to-int v7, v7

    .line 254
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 255
    .line 256
    .line 257
    move-result v8

    .line 258
    shr-long v9, v18, v17

    .line 259
    .line 260
    long-to-int v9, v9

    .line 261
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 262
    .line 263
    .line 264
    move-result v10

    .line 265
    invoke-static {v8, v10}, Ljava/lang/Math;->min(FF)F

    .line 266
    .line 267
    .line 268
    move-result v8

    .line 269
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 274
    .line 275
    .line 276
    move-result v9

    .line 277
    invoke-static {v7, v9}, Ljava/lang/Math;->max(FF)F

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    and-long v9, v14, v20

    .line 286
    .line 287
    long-to-int v6, v9

    .line 288
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 289
    .line 290
    .line 291
    move-result v6

    .line 292
    and-long v9, v18, v20

    .line 293
    .line 294
    long-to-int v9, v9

    .line 295
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    invoke-static {v6, v9}, Ljava/lang/Math;->max(FF)F

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    const/16 v9, 0x19

    .line 304
    .line 305
    int-to-float v9, v9

    .line 306
    iget-object v3, v3, Lw/q0;->a:Lw/x0;

    .line 307
    .line 308
    iget-object v3, v3, Lw/x0;->g:Lu2/c;

    .line 309
    .line 310
    invoke-interface {v3}, Lu2/c;->d()F

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    mul-float/2addr v3, v9

    .line 315
    add-float/2addr v3, v6

    .line 316
    new-instance v6, Le1/c;

    .line 317
    .line 318
    invoke-direct {v6, v8, v5, v7, v3}, Le1/c;-><init>(FFFF)V

    .line 319
    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_7
    move-object v6, v4

    .line 323
    :goto_5
    iget-object v2, v2, Lh0/d1;->d:Lw/q0;

    .line 324
    .line 325
    if-eqz v2, :cond_a

    .line 326
    .line 327
    invoke-virtual {v2}, Lw/q0;->c()Lv1/t;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    if-nez v2, :cond_8

    .line 332
    .line 333
    goto :goto_6

    .line 334
    :cond_8
    invoke-interface {v2}, Lv1/t;->C()Z

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    if-eqz v3, :cond_b

    .line 339
    .line 340
    invoke-interface {v1}, Lv1/t;->C()Z

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    if-nez v3, :cond_9

    .line 345
    .line 346
    goto :goto_7

    .line 347
    :cond_9
    invoke-virtual {v6}, Le1/c;->d()J

    .line 348
    .line 349
    .line 350
    move-result-wide v3

    .line 351
    invoke-static {v2}, Lv1/w;->h(Lv1/t;)Lv1/t;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-interface {v1, v2, v3, v4}, Lv1/t;->w(Lv1/t;J)J

    .line 356
    .line 357
    .line 358
    move-result-wide v1

    .line 359
    invoke-virtual {v6}, Le1/c;->c()J

    .line 360
    .line 361
    .line 362
    move-result-wide v3

    .line 363
    invoke-static {v1, v2, v3, v4}, Lac/p;->a(JJ)Le1/c;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    goto :goto_7

    .line 368
    :cond_a
    :goto_6
    const/4 v4, 0x0

    .line 369
    :cond_b
    :goto_7
    return-object v4

    .line 370
    nop

    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
