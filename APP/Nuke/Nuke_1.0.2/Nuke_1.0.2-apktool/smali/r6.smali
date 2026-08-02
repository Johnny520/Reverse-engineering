.class public final synthetic Lr6;
.super Lyn0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 0

    .line 1
    iput p8, p0, Lr6;->o:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p7}, Lyn0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lr6;->o:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v0, v0, Lbp;->i:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, Lpp1;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lpp1;->f()Z

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
    check-cast v0, Lul0;

    .line 27
    .line 28
    iget-object v0, v0, Lul0;->C:Lpl0;

    .line 29
    .line 30
    invoke-static {v0}, Lpl0;->U0(Lpl0;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :pswitch_1
    check-cast v0, Lwk0;

    .line 40
    .line 41
    iget-object v1, v0, Lwk0;->c:Lsk1;

    .line 42
    .line 43
    iget-object v4, v0, Lwk0;->d:Lsk1;

    .line 44
    .line 45
    iget-object v5, v0, Lwk0;->a:Lbl0;

    .line 46
    .line 47
    invoke-virtual {v5}, Lbl0;->f()Lpl0;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    sget-object v7, Lkl0;->j:Lkl0;

    .line 52
    .line 53
    const/16 v15, 0x8

    .line 54
    .line 55
    if-nez v6, :cond_3

    .line 56
    .line 57
    iget-object v2, v4, Lsk1;->b:[Ljava/lang/Object;

    .line 58
    .line 59
    iget-object v6, v4, Lsk1;->a:[J

    .line 60
    .line 61
    const-wide/16 v16, 0x80

    .line 62
    .line 63
    array-length v8, v6

    .line 64
    add-int/lit8 v8, v8, -0x2

    .line 65
    .line 66
    if-ltz v8, :cond_10

    .line 67
    .line 68
    move v9, v3

    .line 69
    const-wide/16 v18, 0xff

    .line 70
    .line 71
    :goto_0
    aget-wide v10, v6, v9

    .line 72
    .line 73
    const/16 p0, 0x7

    .line 74
    .line 75
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    not-long v12, v10

    .line 81
    shl-long v12, v12, p0

    .line 82
    .line 83
    and-long/2addr v12, v10

    .line 84
    and-long v12, v12, v20

    .line 85
    .line 86
    cmp-long v12, v12, v20

    .line 87
    .line 88
    if-eqz v12, :cond_2

    .line 89
    .line 90
    sub-int v12, v9, v8

    .line 91
    .line 92
    not-int v12, v12

    .line 93
    ushr-int/lit8 v12, v12, 0x1f

    .line 94
    .line 95
    rsub-int/lit8 v12, v12, 0x8

    .line 96
    .line 97
    move v13, v3

    .line 98
    :goto_1
    if-ge v13, v12, :cond_1

    .line 99
    .line 100
    and-long v22, v10, v18

    .line 101
    .line 102
    cmp-long v14, v22, v16

    .line 103
    .line 104
    if-gez v14, :cond_0

    .line 105
    .line 106
    shl-int/lit8 v14, v9, 0x3

    .line 107
    .line 108
    add-int/2addr v14, v13

    .line 109
    aget-object v14, v2, v14

    .line 110
    .line 111
    check-cast v14, Lpk0;

    .line 112
    .line 113
    invoke-interface {v14, v7}, Lpk0;->Z(Lkl0;)V

    .line 114
    .line 115
    .line 116
    :cond_0
    shr-long/2addr v10, v15

    .line 117
    add-int/lit8 v13, v13, 0x1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_1
    if-ne v12, v15, :cond_10

    .line 121
    .line 122
    :cond_2
    if-eq v9, v8, :cond_10

    .line 123
    .line 124
    add-int/lit8 v9, v9, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    const/16 p0, 0x7

    .line 128
    .line 129
    const-wide/16 v16, 0x80

    .line 130
    .line 131
    const-wide/16 v18, 0xff

    .line 132
    .line 133
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    iget-boolean v8, v6, Lth1;->u:Z

    .line 139
    .line 140
    if-eqz v8, :cond_10

    .line 141
    .line 142
    invoke-virtual {v1, v6}, Lsk1;->c(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-eqz v8, :cond_4

    .line 147
    .line 148
    invoke-virtual {v6}, Lpl0;->S0()V

    .line 149
    .line 150
    .line 151
    :cond_4
    invoke-virtual {v6}, Lpl0;->R0()Lkl0;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    iget-object v9, v6, Lth1;->h:Lth1;

    .line 156
    .line 157
    iget-boolean v9, v9, Lth1;->u:Z

    .line 158
    .line 159
    if-nez v9, :cond_5

    .line 160
    .line 161
    const-string v9, "visitAncestors called on an unattached node"

    .line 162
    .line 163
    invoke-static {v9}, Lkz0;->b(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :cond_5
    iget-object v9, v6, Lth1;->h:Lth1;

    .line 167
    .line 168
    invoke-static {v6}, Lsp0;->c0(Lt60;)Lr61;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    move v10, v3

    .line 173
    :goto_2
    if-eqz v6, :cond_c

    .line 174
    .line 175
    iget-object v11, v6, Lr61;->M:Lvn1;

    .line 176
    .line 177
    iget-object v11, v11, Lvn1;->g:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v11, Lth1;

    .line 180
    .line 181
    iget v11, v11, Lth1;->k:I

    .line 182
    .line 183
    and-int/lit16 v11, v11, 0x1400

    .line 184
    .line 185
    if-eqz v11, :cond_a

    .line 186
    .line 187
    :goto_3
    if-eqz v9, :cond_a

    .line 188
    .line 189
    iget v11, v9, Lth1;->j:I

    .line 190
    .line 191
    and-int/lit16 v12, v11, 0x1400

    .line 192
    .line 193
    if-eqz v12, :cond_9

    .line 194
    .line 195
    and-int/lit16 v11, v11, 0x400

    .line 196
    .line 197
    if-eqz v11, :cond_6

    .line 198
    .line 199
    add-int/lit8 v10, v10, 0x1

    .line 200
    .line 201
    :cond_6
    instance-of v11, v9, Lpk0;

    .line 202
    .line 203
    if-eqz v11, :cond_9

    .line 204
    .line 205
    invoke-virtual {v4, v9}, Lsk1;->c(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v11

    .line 209
    if-nez v11, :cond_7

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_7
    const/4 v11, 0x1

    .line 213
    if-gt v10, v11, :cond_8

    .line 214
    .line 215
    move-object v11, v9

    .line 216
    check-cast v11, Lpk0;

    .line 217
    .line 218
    invoke-interface {v11, v8}, Lpk0;->Z(Lkl0;)V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_8
    move-object v11, v9

    .line 223
    check-cast v11, Lpk0;

    .line 224
    .line 225
    sget-object v12, Lkl0;->i:Lkl0;

    .line 226
    .line 227
    invoke-interface {v11, v12}, Lpk0;->Z(Lkl0;)V

    .line 228
    .line 229
    .line 230
    :goto_4
    invoke-virtual {v4, v9}, Lsk1;->l(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    :cond_9
    :goto_5
    iget-object v9, v9, Lth1;->l:Lth1;

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_a
    invoke-virtual {v6}, Lr61;->u()Lr61;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    if-eqz v6, :cond_b

    .line 241
    .line 242
    iget-object v9, v6, Lr61;->M:Lvn1;

    .line 243
    .line 244
    if-eqz v9, :cond_b

    .line 245
    .line 246
    iget-object v9, v9, Lvn1;->f:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v9, Lqx2;

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_b
    move-object v9, v2

    .line 252
    goto :goto_2

    .line 253
    :cond_c
    iget-object v2, v4, Lsk1;->b:[Ljava/lang/Object;

    .line 254
    .line 255
    iget-object v6, v4, Lsk1;->a:[J

    .line 256
    .line 257
    array-length v8, v6

    .line 258
    add-int/lit8 v8, v8, -0x2

    .line 259
    .line 260
    if-ltz v8, :cond_10

    .line 261
    .line 262
    move v9, v3

    .line 263
    :goto_6
    aget-wide v10, v6, v9

    .line 264
    .line 265
    not-long v12, v10

    .line 266
    shl-long v12, v12, p0

    .line 267
    .line 268
    and-long/2addr v12, v10

    .line 269
    and-long v12, v12, v20

    .line 270
    .line 271
    cmp-long v12, v12, v20

    .line 272
    .line 273
    if-eqz v12, :cond_f

    .line 274
    .line 275
    sub-int v12, v9, v8

    .line 276
    .line 277
    not-int v12, v12

    .line 278
    ushr-int/lit8 v12, v12, 0x1f

    .line 279
    .line 280
    rsub-int/lit8 v12, v12, 0x8

    .line 281
    .line 282
    move v13, v3

    .line 283
    :goto_7
    if-ge v13, v12, :cond_e

    .line 284
    .line 285
    and-long v22, v10, v18

    .line 286
    .line 287
    cmp-long v14, v22, v16

    .line 288
    .line 289
    if-gez v14, :cond_d

    .line 290
    .line 291
    shl-int/lit8 v14, v9, 0x3

    .line 292
    .line 293
    add-int/2addr v14, v13

    .line 294
    aget-object v14, v2, v14

    .line 295
    .line 296
    check-cast v14, Lpk0;

    .line 297
    .line 298
    invoke-interface {v14, v7}, Lpk0;->Z(Lkl0;)V

    .line 299
    .line 300
    .line 301
    :cond_d
    shr-long/2addr v10, v15

    .line 302
    add-int/lit8 v13, v13, 0x1

    .line 303
    .line 304
    goto :goto_7

    .line 305
    :cond_e
    if-ne v12, v15, :cond_10

    .line 306
    .line 307
    :cond_f
    if-eq v9, v8, :cond_10

    .line 308
    .line 309
    add-int/lit8 v9, v9, 0x1

    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_10
    invoke-virtual {v5}, Lbl0;->f()Lpl0;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    if-eqz v2, :cond_11

    .line 317
    .line 318
    iget-object v2, v5, Lbl0;->c:Lpl0;

    .line 319
    .line 320
    invoke-virtual {v2}, Lpl0;->R0()Lkl0;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    if-ne v2, v7, :cond_12

    .line 325
    .line 326
    :cond_11
    invoke-virtual {v5}, Lbl0;->c()V

    .line 327
    .line 328
    .line 329
    :cond_12
    invoke-virtual {v1}, Lsk1;->b()V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v4}, Lsk1;->b()V

    .line 333
    .line 334
    .line 335
    iput-boolean v3, v0, Lwk0;->e:Z

    .line 336
    .line 337
    sget-object v0, La83;->a:La83;

    .line 338
    .line 339
    return-object v0

    .line 340
    :pswitch_2
    check-cast v0, Lry2;

    .line 341
    .line 342
    invoke-interface {v0}, Lry2;->v0()Lqy2;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    return-object v0

    .line 347
    :pswitch_3
    check-cast v0, Landroid/view/View;

    .line 348
    .line 349
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 350
    .line 351
    const/16 v4, 0x1e

    .line 352
    .line 353
    if-lt v1, v4, :cond_13

    .line 354
    .line 355
    invoke-static {v0}, Lg4;->f(Landroid/view/View;)V

    .line 356
    .line 357
    .line 358
    :cond_13
    const/16 v4, 0x1d

    .line 359
    .line 360
    if-lt v1, v4, :cond_15

    .line 361
    .line 362
    invoke-static {v0}, Lb00;->a(Landroid/view/View;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    if-nez v1, :cond_14

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_14
    new-instance v2, Lsz0;

    .line 370
    .line 371
    const/4 v4, 0x6

    .line 372
    invoke-direct {v2, v4, v1, v0, v3}, Lsz0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 373
    .line 374
    .line 375
    :cond_15
    :goto_8
    return-object v2

    .line 376
    nop

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
