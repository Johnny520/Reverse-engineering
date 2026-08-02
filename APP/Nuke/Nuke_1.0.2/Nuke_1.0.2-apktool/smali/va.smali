.class public final synthetic Lva;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lun0;II)V
    .locals 0

    .line 19
    iput p5, p0, Lva;->h:I

    iput-object p1, p0, Lva;->j:Ljava/lang/Object;

    iput-object p2, p0, Lva;->k:Ljava/lang/Object;

    iput-object p3, p0, Lva;->l:Ljava/lang/Object;

    iput p4, p0, Lva;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkw;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    .line 17
    const/4 v0, 0x3

    iput v0, p0, Lva;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lva;->l:Ljava/lang/Object;

    iput-object p2, p0, Lva;->j:Ljava/lang/Object;

    iput-object p3, p0, Lva;->k:Ljava/lang/Object;

    iput p4, p0, Lva;->i:I

    return-void
.end method

.method public synthetic constructor <init>(Lt81;Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    const/16 p5, 0x8

    .line 2
    .line 3
    iput p5, p0, Lva;->h:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lva;->j:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lva;->k:Ljava/lang/Object;

    .line 11
    .line 12
    iput p3, p0, Lva;->i:I

    .line 13
    .line 14
    iput-object p4, p0, Lva;->l:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(Luh1;Ljava/lang/Object;Ljava/lang/Object;III)V
    .locals 0

    .line 18
    iput p6, p0, Lva;->h:I

    iput-object p1, p0, Lva;->j:Ljava/lang/Object;

    iput-object p2, p0, Lva;->k:Ljava/lang/Object;

    iput-object p3, p0, Lva;->l:Ljava/lang/Object;

    iput p5, p0, Lva;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lva;->h:I

    .line 4
    .line 5
    iget v2, v0, Lva;->i:I

    .line 6
    .line 7
    iget-object v3, v0, Lva;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Lva;->k:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v5, La83;->a:La83;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    iget-object v7, v0, Lva;->j:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v7, Ldc2;

    .line 20
    .line 21
    check-cast v3, Lkw;

    .line 22
    .line 23
    move-object/from16 v0, p1

    .line 24
    .line 25
    check-cast v0, Lpx;

    .line 26
    .line 27
    move-object/from16 v1, p2

    .line 28
    .line 29
    check-cast v1, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    or-int/lit8 v1, v2, 0x1

    .line 35
    .line 36
    invoke-static {v1}, Lpp0;->N(I)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v7, v4, v3, v0, v1}, Ldc2;->e(Ljava/lang/Object;Lkw;Lpx;I)V

    .line 41
    .line 42
    .line 43
    return-object v5

    .line 44
    :pswitch_0
    check-cast v7, Lci1;

    .line 45
    .line 46
    check-cast v4, Lxm0;

    .line 47
    .line 48
    check-cast v3, Lin0;

    .line 49
    .line 50
    move-object/from16 v0, p1

    .line 51
    .line 52
    check-cast v0, Lpx;

    .line 53
    .line 54
    move-object/from16 v1, p2

    .line 55
    .line 56
    check-cast v1, Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    or-int/lit8 v1, v2, 0x1

    .line 62
    .line 63
    invoke-static {v1}, Lpp0;->N(I)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-static {v7, v4, v3, v0, v1}, Lpp0;->e(Lci1;Lxm0;Lin0;Lpx;I)V

    .line 68
    .line 69
    .line 70
    return-object v5

    .line 71
    :pswitch_1
    check-cast v7, Lia1;

    .line 72
    .line 73
    check-cast v4, Lpa1;

    .line 74
    .line 75
    check-cast v3, Lin0;

    .line 76
    .line 77
    move-object/from16 v0, p1

    .line 78
    .line 79
    check-cast v0, Lpx;

    .line 80
    .line 81
    move-object/from16 v1, p2

    .line 82
    .line 83
    check-cast v1, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    or-int/lit8 v1, v2, 0x1

    .line 89
    .line 90
    invoke-static {v1}, Lpp0;->N(I)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-static {v7, v4, v3, v0, v1}, Leu;->i(Lia1;Lpa1;Lin0;Lpx;I)V

    .line 95
    .line 96
    .line 97
    return-object v5

    .line 98
    :pswitch_2
    check-cast v7, Lg91;

    .line 99
    .line 100
    check-cast v3, Lkw;

    .line 101
    .line 102
    move-object/from16 v0, p1

    .line 103
    .line 104
    check-cast v0, Lpx;

    .line 105
    .line 106
    move-object/from16 v1, p2

    .line 107
    .line 108
    check-cast v1, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    or-int/lit8 v1, v2, 0x1

    .line 114
    .line 115
    invoke-static {v1}, Lpp0;->N(I)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-virtual {v7, v4, v3, v0, v1}, Lg91;->e(Ljava/lang/Object;Lkw;Lpx;I)V

    .line 120
    .line 121
    .line 122
    return-object v5

    .line 123
    :pswitch_3
    move-object v8, v7

    .line 124
    check-cast v8, Lt81;

    .line 125
    .line 126
    move-object/from16 v12, p1

    .line 127
    .line 128
    check-cast v12, Lpx;

    .line 129
    .line 130
    move-object/from16 v1, p2

    .line 131
    .line 132
    check-cast v1, Ljava/lang/Integer;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-static {v6}, Lpp0;->N(I)I

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    iget-object v9, v0, Lva;->k:Ljava/lang/Object;

    .line 142
    .line 143
    iget v10, v0, Lva;->i:I

    .line 144
    .line 145
    iget-object v11, v0, Lva;->l:Ljava/lang/Object;

    .line 146
    .line 147
    invoke-static/range {v8 .. v13}, Lse;->s(Lt81;Ljava/lang/Object;ILjava/lang/Object;Lpx;I)V

    .line 148
    .line 149
    .line 150
    return-object v5

    .line 151
    :pswitch_4
    move-object v14, v7

    .line 152
    check-cast v14, Luh1;

    .line 153
    .line 154
    move-object v15, v4

    .line 155
    check-cast v15, Ljava/lang/String;

    .line 156
    .line 157
    move-object/from16 v16, v3

    .line 158
    .line 159
    check-cast v16, Ljava/lang/String;

    .line 160
    .line 161
    move-object/from16 v17, p1

    .line 162
    .line 163
    check-cast v17, Lpx;

    .line 164
    .line 165
    move-object/from16 v1, p2

    .line 166
    .line 167
    check-cast v1, Ljava/lang/Integer;

    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {v6}, Lpp0;->N(I)I

    .line 173
    .line 174
    .line 175
    move-result v18

    .line 176
    iget v0, v0, Lva;->i:I

    .line 177
    .line 178
    move/from16 v19, v0

    .line 179
    .line 180
    invoke-static/range {v14 .. v19}, Lci0;->g(Luh1;Ljava/lang/String;Ljava/lang/String;Lpx;II)V

    .line 181
    .line 182
    .line 183
    return-object v5

    .line 184
    :pswitch_5
    check-cast v7, Lcz2;

    .line 185
    .line 186
    check-cast v4, Lry2;

    .line 187
    .line 188
    check-cast v3, Lxm0;

    .line 189
    .line 190
    move-object/from16 v0, p1

    .line 191
    .line 192
    check-cast v0, Lpx;

    .line 193
    .line 194
    move-object/from16 v1, p2

    .line 195
    .line 196
    check-cast v1, Ljava/lang/Integer;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 199
    .line 200
    .line 201
    or-int/lit8 v1, v2, 0x1

    .line 202
    .line 203
    invoke-static {v1}, Lpp0;->N(I)I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    invoke-static {v7, v4, v3, v0, v1}, Lk60;->c(Lcz2;Lry2;Lxm0;Lpx;I)V

    .line 208
    .line 209
    .line 210
    return-object v5

    .line 211
    :pswitch_6
    check-cast v7, Lm00;

    .line 212
    .line 213
    check-cast v4, Luh1;

    .line 214
    .line 215
    check-cast v3, Lkw;

    .line 216
    .line 217
    move-object/from16 v0, p1

    .line 218
    .line 219
    check-cast v0, Lpx;

    .line 220
    .line 221
    move-object/from16 v1, p2

    .line 222
    .line 223
    check-cast v1, Ljava/lang/Integer;

    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    or-int/lit8 v1, v2, 0x1

    .line 229
    .line 230
    invoke-static {v1}, Lpp0;->N(I)I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    invoke-static {v7, v4, v3, v0, v1}, Lr00;->a(Lm00;Luh1;Lkw;Lpx;I)V

    .line 235
    .line 236
    .line 237
    return-object v5

    .line 238
    :pswitch_7
    move-object v8, v7

    .line 239
    check-cast v8, Luh1;

    .line 240
    .line 241
    move-object v9, v4

    .line 242
    check-cast v9, Lm00;

    .line 243
    .line 244
    move-object v10, v3

    .line 245
    check-cast v10, Lin0;

    .line 246
    .line 247
    move-object/from16 v11, p1

    .line 248
    .line 249
    check-cast v11, Lpx;

    .line 250
    .line 251
    move-object/from16 v1, p2

    .line 252
    .line 253
    check-cast v1, Ljava/lang/Integer;

    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-static {v6}, Lpp0;->N(I)I

    .line 259
    .line 260
    .line 261
    move-result v12

    .line 262
    iget v13, v0, Lva;->i:I

    .line 263
    .line 264
    invoke-static/range {v8 .. v13}, Lr00;->b(Luh1;Lm00;Lin0;Lpx;II)V

    .line 265
    .line 266
    .line 267
    return-object v5

    .line 268
    :pswitch_8
    check-cast v3, Lkw;

    .line 269
    .line 270
    move-object/from16 v0, p1

    .line 271
    .line 272
    check-cast v0, Lpx;

    .line 273
    .line 274
    move-object/from16 v1, p2

    .line 275
    .line 276
    check-cast v1, Ljava/lang/Integer;

    .line 277
    .line 278
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-static {v2}, Lpp0;->N(I)I

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    or-int/2addr v1, v6

    .line 286
    invoke-virtual {v3, v7, v4, v0, v1}, Lkw;->l(Ljava/lang/Object;Ljava/lang/Object;Lpx;I)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    return-object v5

    .line 290
    :pswitch_9
    check-cast v7, Luh1;

    .line 291
    .line 292
    check-cast v4, Le42;

    .line 293
    .line 294
    check-cast v3, Lkw;

    .line 295
    .line 296
    move-object/from16 v0, p1

    .line 297
    .line 298
    check-cast v0, Lpx;

    .line 299
    .line 300
    move-object/from16 v1, p2

    .line 301
    .line 302
    check-cast v1, Ljava/lang/Integer;

    .line 303
    .line 304
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    or-int/lit8 v1, v2, 0x1

    .line 308
    .line 309
    invoke-static {v1}, Lpp0;->N(I)I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    invoke-static {v7, v4, v3, v0, v1}, Lrp0;->I(Luh1;Le42;Lkw;Lpx;I)V

    .line 314
    .line 315
    .line 316
    return-object v5

    .line 317
    :pswitch_a
    check-cast v7, Lde;

    .line 318
    .line 319
    check-cast v4, Lxm0;

    .line 320
    .line 321
    check-cast v3, Lin0;

    .line 322
    .line 323
    move-object/from16 v0, p1

    .line 324
    .line 325
    check-cast v0, Lpx;

    .line 326
    .line 327
    move-object/from16 v1, p2

    .line 328
    .line 329
    check-cast v1, Ljava/lang/Integer;

    .line 330
    .line 331
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    or-int/lit8 v1, v2, 0x1

    .line 335
    .line 336
    invoke-static {v1}, Lpp0;->N(I)I

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    invoke-static {v7, v4, v3, v0, v1}, Lrg3;->a(Lde;Lxm0;Lin0;Lpx;I)V

    .line 341
    .line 342
    .line 343
    return-object v5

    .line 344
    :pswitch_b
    check-cast v7, Lws1;

    .line 345
    .line 346
    check-cast v4, Lr5;

    .line 347
    .line 348
    check-cast v3, Lkw;

    .line 349
    .line 350
    move-object/from16 v0, p1

    .line 351
    .line 352
    check-cast v0, Lpx;

    .line 353
    .line 354
    move-object/from16 v1, p2

    .line 355
    .line 356
    check-cast v1, Ljava/lang/Integer;

    .line 357
    .line 358
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    or-int/lit8 v1, v2, 0x1

    .line 362
    .line 363
    invoke-static {v1}, Lpp0;->N(I)I

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    invoke-static {v7, v4, v3, v0, v1}, Lrp0;->G(Lws1;Lr5;Lkw;Lpx;I)V

    .line 368
    .line 369
    .line 370
    return-object v5

    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
