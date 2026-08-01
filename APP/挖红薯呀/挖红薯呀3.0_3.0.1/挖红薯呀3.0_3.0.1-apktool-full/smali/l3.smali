.class public final synthetic Ll3;
.super Lhx;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 1

    .line 1
    iput p7, p0, Ll3;->d:I

    .line 2
    .line 3
    move-object v0, p4

    .line 4
    move-object p4, p2

    .line 5
    move p2, p6

    .line 6
    move-object p6, p5

    .line 7
    move-object p5, v0

    .line 8
    invoke-direct/range {p0 .. p6}, Lgx;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ll3;->d:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x7

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lqc;->receiver:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lgv;

    .line 14
    .line 15
    iget-object v0, v0, Lgv;->y:Ldv;

    .line 16
    .line 17
    invoke-virtual {v0, v5}, Ldv;->D0(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :pswitch_0
    iget-object v0, v0, Lqc;->receiver:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Luu;

    .line 29
    .line 30
    iget-object v1, v0, Luu;->c:Lkh0;

    .line 31
    .line 32
    iget-object v6, v0, Luu;->d:Lkh0;

    .line 33
    .line 34
    iget-object v7, v0, Luu;->a:Lzu;

    .line 35
    .line 36
    invoke-virtual {v7}, Lzu;->f()Ldv;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const/16 v15, 0x8

    .line 46
    .line 47
    const/16 v16, 0x0

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    if-nez v8, :cond_3

    .line 51
    .line 52
    iget-object v2, v6, Lkh0;->b:[Ljava/lang/Object;

    .line 53
    .line 54
    iget-object v8, v6, Lkh0;->a:[J

    .line 55
    .line 56
    move/from16 v17, v5

    .line 57
    .line 58
    array-length v5, v8

    .line 59
    sub-int/2addr v5, v4

    .line 60
    if-ltz v5, :cond_10

    .line 61
    .line 62
    move v4, v3

    .line 63
    const-wide/16 v18, 0x80

    .line 64
    .line 65
    :goto_0
    aget-wide v9, v8, v4

    .line 66
    .line 67
    const-wide/16 v20, 0xff

    .line 68
    .line 69
    not-long v11, v9

    .line 70
    shl-long v11, v11, v17

    .line 71
    .line 72
    and-long/2addr v11, v9

    .line 73
    and-long/2addr v11, v13

    .line 74
    cmp-long v11, v11, v13

    .line 75
    .line 76
    if-eqz v11, :cond_2

    .line 77
    .line 78
    sub-int v11, v4, v5

    .line 79
    .line 80
    not-int v11, v11

    .line 81
    ushr-int/lit8 v11, v11, 0x1f

    .line 82
    .line 83
    rsub-int/lit8 v11, v11, 0x8

    .line 84
    .line 85
    move v12, v3

    .line 86
    :goto_1
    if-ge v12, v11, :cond_1

    .line 87
    .line 88
    and-long v22, v9, v20

    .line 89
    .line 90
    cmp-long v22, v22, v18

    .line 91
    .line 92
    if-ltz v22, :cond_0

    .line 93
    .line 94
    shr-long/2addr v9, v15

    .line 95
    add-int/lit8 v12, v12, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_0
    shl-int/lit8 v0, v4, 0x3

    .line 99
    .line 100
    add-int/2addr v0, v12

    .line 101
    aget-object v0, v2, v0

    .line 102
    .line 103
    check-cast v0, Lu9;

    .line 104
    .line 105
    invoke-virtual {v0}, Lu9;->x0()V

    .line 106
    .line 107
    .line 108
    throw v16

    .line 109
    :cond_1
    if-ne v11, v15, :cond_10

    .line 110
    .line 111
    :cond_2
    if-eq v4, v5, :cond_10

    .line 112
    .line 113
    add-int/lit8 v4, v4, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_3
    move/from16 v17, v5

    .line 117
    .line 118
    const-wide/16 v18, 0x80

    .line 119
    .line 120
    const-wide/16 v20, 0xff

    .line 121
    .line 122
    iget-boolean v5, v8, Loe0;->q:Z

    .line 123
    .line 124
    if-eqz v5, :cond_10

    .line 125
    .line 126
    invoke-virtual {v1, v8}, Lkh0;->c(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-eqz v5, :cond_4

    .line 131
    .line 132
    invoke-virtual {v8}, Ldv;->C0()V

    .line 133
    .line 134
    .line 135
    :cond_4
    invoke-virtual {v8}, Ldv;->B0()Lcv;

    .line 136
    .line 137
    .line 138
    iget-object v5, v8, Loe0;->d:Loe0;

    .line 139
    .line 140
    iget-boolean v5, v5, Loe0;->q:Z

    .line 141
    .line 142
    if-nez v5, :cond_5

    .line 143
    .line 144
    const-string v5, "visitAncestors called on an unattached node"

    .line 145
    .line 146
    invoke-static {v5}, Lw10;->b(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :cond_5
    iget-object v5, v8, Loe0;->d:Loe0;

    .line 150
    .line 151
    invoke-static {v8}, Lpf1;->Q(Lrm;)Lb60;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    move v9, v3

    .line 156
    :goto_2
    if-eqz v8, :cond_c

    .line 157
    .line 158
    iget-object v10, v8, Lb60;->I:Lmj0;

    .line 159
    .line 160
    iget-object v10, v10, Lmj0;->f:Loe0;

    .line 161
    .line 162
    iget v10, v10, Loe0;->g:I

    .line 163
    .line 164
    and-int/lit16 v10, v10, 0x1400

    .line 165
    .line 166
    if-eqz v10, :cond_a

    .line 167
    .line 168
    :goto_3
    if-eqz v5, :cond_a

    .line 169
    .line 170
    iget v10, v5, Loe0;->f:I

    .line 171
    .line 172
    and-int/lit16 v11, v10, 0x1400

    .line 173
    .line 174
    if-eqz v11, :cond_9

    .line 175
    .line 176
    and-int/lit16 v10, v10, 0x400

    .line 177
    .line 178
    if-eqz v10, :cond_6

    .line 179
    .line 180
    add-int/lit8 v9, v9, 0x1

    .line 181
    .line 182
    :cond_6
    instance-of v10, v5, Lu9;

    .line 183
    .line 184
    if-eqz v10, :cond_9

    .line 185
    .line 186
    invoke-virtual {v6, v5}, Lkh0;->c(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    if-nez v10, :cond_7

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_7
    if-gt v9, v2, :cond_8

    .line 194
    .line 195
    check-cast v5, Lu9;

    .line 196
    .line 197
    invoke-virtual {v5}, Lu9;->x0()V

    .line 198
    .line 199
    .line 200
    throw v16

    .line 201
    :cond_8
    check-cast v5, Lu9;

    .line 202
    .line 203
    invoke-virtual {v5}, Lu9;->x0()V

    .line 204
    .line 205
    .line 206
    throw v16

    .line 207
    :cond_9
    :goto_4
    iget-object v5, v5, Loe0;->h:Loe0;

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_a
    invoke-virtual {v8}, Lb60;->v()Lb60;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    if-eqz v8, :cond_b

    .line 215
    .line 216
    iget-object v5, v8, Lb60;->I:Lmj0;

    .line 217
    .line 218
    if-eqz v5, :cond_b

    .line 219
    .line 220
    iget-object v5, v5, Lmj0;->e:Ld61;

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_b
    move-object/from16 v5, v16

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_c
    iget-object v2, v6, Lkh0;->b:[Ljava/lang/Object;

    .line 227
    .line 228
    iget-object v5, v6, Lkh0;->a:[J

    .line 229
    .line 230
    array-length v8, v5

    .line 231
    sub-int/2addr v8, v4

    .line 232
    if-ltz v8, :cond_10

    .line 233
    .line 234
    move v4, v3

    .line 235
    :goto_5
    aget-wide v9, v5, v4

    .line 236
    .line 237
    not-long v11, v9

    .line 238
    shl-long v11, v11, v17

    .line 239
    .line 240
    and-long/2addr v11, v9

    .line 241
    and-long/2addr v11, v13

    .line 242
    cmp-long v11, v11, v13

    .line 243
    .line 244
    if-eqz v11, :cond_f

    .line 245
    .line 246
    sub-int v11, v4, v8

    .line 247
    .line 248
    not-int v11, v11

    .line 249
    ushr-int/lit8 v11, v11, 0x1f

    .line 250
    .line 251
    rsub-int/lit8 v11, v11, 0x8

    .line 252
    .line 253
    move v12, v3

    .line 254
    :goto_6
    if-ge v12, v11, :cond_e

    .line 255
    .line 256
    and-long v22, v9, v20

    .line 257
    .line 258
    cmp-long v22, v22, v18

    .line 259
    .line 260
    if-ltz v22, :cond_d

    .line 261
    .line 262
    shr-long/2addr v9, v15

    .line 263
    add-int/lit8 v12, v12, 0x1

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_d
    shl-int/lit8 v0, v4, 0x3

    .line 267
    .line 268
    add-int/2addr v0, v12

    .line 269
    aget-object v0, v2, v0

    .line 270
    .line 271
    check-cast v0, Lu9;

    .line 272
    .line 273
    invoke-virtual {v0}, Lu9;->x0()V

    .line 274
    .line 275
    .line 276
    throw v16

    .line 277
    :cond_e
    if-ne v11, v15, :cond_10

    .line 278
    .line 279
    :cond_f
    if-eq v4, v8, :cond_10

    .line 280
    .line 281
    add-int/lit8 v4, v4, 0x1

    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_10
    invoke-virtual {v7}, Lzu;->f()Ldv;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    if-eqz v2, :cond_11

    .line 289
    .line 290
    iget-object v2, v7, Lzu;->c:Ldv;

    .line 291
    .line 292
    invoke-virtual {v2}, Ldv;->B0()Lcv;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    sget-object v4, Lcv;->f:Lcv;

    .line 297
    .line 298
    if-ne v2, v4, :cond_12

    .line 299
    .line 300
    :cond_11
    invoke-virtual {v7}, Lzu;->c()V

    .line 301
    .line 302
    .line 303
    :cond_12
    invoke-virtual {v1}, Lkh0;->b()V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v6}, Lkh0;->b()V

    .line 307
    .line 308
    .line 309
    iput-boolean v3, v0, Luu;->e:Z

    .line 310
    .line 311
    sget-object v0, Lna1;->a:Lna1;

    .line 312
    .line 313
    return-object v0

    .line 314
    :pswitch_1
    const/16 v16, 0x0

    .line 315
    .line 316
    iget-object v0, v0, Lqc;->receiver:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v0, Landroid/view/View;

    .line 319
    .line 320
    invoke-virtual {v0, v2}, Landroid/view/View;->setImportantForContentCapture(I)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0}, Landroid/view/View;->getContentCaptureSession()Landroid/view/contentcapture/ContentCaptureSession;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    if-nez v1, :cond_13

    .line 328
    .line 329
    move-object/from16 v3, v16

    .line 330
    .line 331
    goto :goto_7

    .line 332
    :cond_13
    new-instance v3, Ld;

    .line 333
    .line 334
    invoke-direct {v3, v4, v1, v0}, Ld;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    :goto_7
    return-object v3

    .line 338
    nop

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
