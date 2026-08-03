.class public final synthetic Lwb/oe;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Lvb/a;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lvb/a;Lfg/a;II)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/oe;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/oe;->i:Lvb/a;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/oe;->j:Lfg/a;

    .line 8
    .line 9
    iput p4, p0, Lwb/oe;->k:I

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwb/oe;->g:I

    .line 2
    .line 3
    check-cast p1, Li0/h0;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget p2, p0, Lwb/oe;->k:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p2}, Li0/r;->C(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 22
    .line 23
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 24
    .line 25
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 26
    .line 27
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->z0(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 28
    .line 29
    .line 30
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_0
    iget p2, p0, Lwb/oe;->k:I

    .line 34
    .line 35
    or-int/lit8 p2, p2, 0x1

    .line 36
    .line 37
    invoke-static {p2}, Li0/r;->C(I)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 42
    .line 43
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 44
    .line 45
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 46
    .line 47
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->A3(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_1
    iget p2, p0, Lwb/oe;->k:I

    .line 52
    .line 53
    or-int/lit8 p2, p2, 0x1

    .line 54
    .line 55
    invoke-static {p2}, Li0/r;->C(I)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 60
    .line 61
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 62
    .line 63
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 64
    .line 65
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->R2(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :pswitch_2
    iget p2, p0, Lwb/oe;->k:I

    .line 70
    .line 71
    or-int/lit8 p2, p2, 0x1

    .line 72
    .line 73
    invoke-static {p2}, Li0/r;->C(I)I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 78
    .line 79
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 80
    .line 81
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 82
    .line 83
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->T2(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :pswitch_3
    iget p2, p0, Lwb/oe;->k:I

    .line 88
    .line 89
    or-int/lit8 p2, p2, 0x1

    .line 90
    .line 91
    invoke-static {p2}, Li0/r;->C(I)I

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 96
    .line 97
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 98
    .line 99
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 100
    .line 101
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->M0(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :pswitch_4
    iget p2, p0, Lwb/oe;->k:I

    .line 106
    .line 107
    or-int/lit8 p2, p2, 0x1

    .line 108
    .line 109
    invoke-static {p2}, Li0/r;->C(I)I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 114
    .line 115
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 116
    .line 117
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 118
    .line 119
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->h3(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :pswitch_5
    iget p2, p0, Lwb/oe;->k:I

    .line 124
    .line 125
    or-int/lit8 p2, p2, 0x1

    .line 126
    .line 127
    invoke-static {p2}, Li0/r;->C(I)I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 132
    .line 133
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 134
    .line 135
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 136
    .line 137
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->Q2(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :pswitch_6
    iget p2, p0, Lwb/oe;->k:I

    .line 142
    .line 143
    or-int/lit8 p2, p2, 0x1

    .line 144
    .line 145
    invoke-static {p2}, Li0/r;->C(I)I

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 150
    .line 151
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 152
    .line 153
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 154
    .line 155
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->u2(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 156
    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :pswitch_7
    iget p2, p0, Lwb/oe;->k:I

    .line 161
    .line 162
    or-int/lit8 p2, p2, 0x1

    .line 163
    .line 164
    invoke-static {p2}, Li0/r;->C(I)I

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 169
    .line 170
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 171
    .line 172
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 173
    .line 174
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->I1(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :pswitch_8
    iget p2, p0, Lwb/oe;->k:I

    .line 180
    .line 181
    or-int/lit8 p2, p2, 0x1

    .line 182
    .line 183
    invoke-static {p2}, Li0/r;->C(I)I

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 188
    .line 189
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 190
    .line 191
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 192
    .line 193
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->N3(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 194
    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :pswitch_9
    iget p2, p0, Lwb/oe;->k:I

    .line 199
    .line 200
    or-int/lit8 p2, p2, 0x1

    .line 201
    .line 202
    invoke-static {p2}, Li0/r;->C(I)I

    .line 203
    .line 204
    .line 205
    move-result p2

    .line 206
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 207
    .line 208
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 209
    .line 210
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 211
    .line 212
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->u4(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :pswitch_a
    iget p2, p0, Lwb/oe;->k:I

    .line 218
    .line 219
    or-int/lit8 p2, p2, 0x1

    .line 220
    .line 221
    invoke-static {p2}, Li0/r;->C(I)I

    .line 222
    .line 223
    .line 224
    move-result p2

    .line 225
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 226
    .line 227
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 228
    .line 229
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 230
    .line 231
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->b2(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 232
    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :pswitch_b
    iget p2, p0, Lwb/oe;->k:I

    .line 237
    .line 238
    or-int/lit8 p2, p2, 0x1

    .line 239
    .line 240
    invoke-static {p2}, Li0/r;->C(I)I

    .line 241
    .line 242
    .line 243
    move-result p2

    .line 244
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 245
    .line 246
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 247
    .line 248
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 249
    .line 250
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->h1(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 251
    .line 252
    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :pswitch_c
    iget p2, p0, Lwb/oe;->k:I

    .line 256
    .line 257
    or-int/lit8 p2, p2, 0x1

    .line 258
    .line 259
    invoke-static {p2}, Li0/r;->C(I)I

    .line 260
    .line 261
    .line 262
    move-result p2

    .line 263
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 264
    .line 265
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 266
    .line 267
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 268
    .line 269
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->I3(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 270
    .line 271
    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :pswitch_d
    iget p2, p0, Lwb/oe;->k:I

    .line 275
    .line 276
    or-int/lit8 p2, p2, 0x1

    .line 277
    .line 278
    invoke-static {p2}, Li0/r;->C(I)I

    .line 279
    .line 280
    .line 281
    move-result p2

    .line 282
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 283
    .line 284
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 285
    .line 286
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 287
    .line 288
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->C2(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 289
    .line 290
    .line 291
    goto/16 :goto_0

    .line 292
    .line 293
    :pswitch_e
    iget p2, p0, Lwb/oe;->k:I

    .line 294
    .line 295
    or-int/lit8 p2, p2, 0x1

    .line 296
    .line 297
    invoke-static {p2}, Li0/r;->C(I)I

    .line 298
    .line 299
    .line 300
    move-result p2

    .line 301
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 302
    .line 303
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 304
    .line 305
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 306
    .line 307
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->W2(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 308
    .line 309
    .line 310
    goto/16 :goto_0

    .line 311
    .line 312
    :pswitch_f
    iget p2, p0, Lwb/oe;->k:I

    .line 313
    .line 314
    or-int/lit8 p2, p2, 0x1

    .line 315
    .line 316
    invoke-static {p2}, Li0/r;->C(I)I

    .line 317
    .line 318
    .line 319
    move-result p2

    .line 320
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 321
    .line 322
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 323
    .line 324
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 325
    .line 326
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->m4(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 327
    .line 328
    .line 329
    goto/16 :goto_0

    .line 330
    .line 331
    :pswitch_10
    iget p2, p0, Lwb/oe;->k:I

    .line 332
    .line 333
    or-int/lit8 p2, p2, 0x1

    .line 334
    .line 335
    invoke-static {p2}, Li0/r;->C(I)I

    .line 336
    .line 337
    .line 338
    move-result p2

    .line 339
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 340
    .line 341
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 342
    .line 343
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 344
    .line 345
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->K2(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_0

    .line 349
    .line 350
    :pswitch_11
    iget p2, p0, Lwb/oe;->k:I

    .line 351
    .line 352
    or-int/lit8 p2, p2, 0x1

    .line 353
    .line 354
    invoke-static {p2}, Li0/r;->C(I)I

    .line 355
    .line 356
    .line 357
    move-result p2

    .line 358
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 359
    .line 360
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 361
    .line 362
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 363
    .line 364
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->t1(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 365
    .line 366
    .line 367
    goto/16 :goto_0

    .line 368
    .line 369
    :pswitch_12
    iget p2, p0, Lwb/oe;->k:I

    .line 370
    .line 371
    or-int/lit8 p2, p2, 0x1

    .line 372
    .line 373
    invoke-static {p2}, Li0/r;->C(I)I

    .line 374
    .line 375
    .line 376
    move-result p2

    .line 377
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 378
    .line 379
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 380
    .line 381
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 382
    .line 383
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->M3(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 384
    .line 385
    .line 386
    goto/16 :goto_0

    .line 387
    .line 388
    :pswitch_13
    iget p2, p0, Lwb/oe;->k:I

    .line 389
    .line 390
    or-int/lit8 p2, p2, 0x1

    .line 391
    .line 392
    invoke-static {p2}, Li0/r;->C(I)I

    .line 393
    .line 394
    .line 395
    move-result p2

    .line 396
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 397
    .line 398
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 399
    .line 400
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 401
    .line 402
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->o(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 403
    .line 404
    .line 405
    goto/16 :goto_0

    .line 406
    .line 407
    :pswitch_14
    iget p2, p0, Lwb/oe;->k:I

    .line 408
    .line 409
    or-int/lit8 p2, p2, 0x1

    .line 410
    .line 411
    invoke-static {p2}, Li0/r;->C(I)I

    .line 412
    .line 413
    .line 414
    move-result p2

    .line 415
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 416
    .line 417
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 418
    .line 419
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 420
    .line 421
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->i2(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 422
    .line 423
    .line 424
    goto/16 :goto_0

    .line 425
    .line 426
    :pswitch_15
    iget p2, p0, Lwb/oe;->k:I

    .line 427
    .line 428
    or-int/lit8 p2, p2, 0x1

    .line 429
    .line 430
    invoke-static {p2}, Li0/r;->C(I)I

    .line 431
    .line 432
    .line 433
    move-result p2

    .line 434
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 435
    .line 436
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 437
    .line 438
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 439
    .line 440
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->J3(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 441
    .line 442
    .line 443
    goto/16 :goto_0

    .line 444
    .line 445
    :pswitch_16
    iget p2, p0, Lwb/oe;->k:I

    .line 446
    .line 447
    or-int/lit8 p2, p2, 0x1

    .line 448
    .line 449
    invoke-static {p2}, Li0/r;->C(I)I

    .line 450
    .line 451
    .line 452
    move-result p2

    .line 453
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 454
    .line 455
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 456
    .line 457
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 458
    .line 459
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->O1(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 460
    .line 461
    .line 462
    goto/16 :goto_0

    .line 463
    .line 464
    :pswitch_17
    iget p2, p0, Lwb/oe;->k:I

    .line 465
    .line 466
    or-int/lit8 p2, p2, 0x1

    .line 467
    .line 468
    invoke-static {p2}, Li0/r;->C(I)I

    .line 469
    .line 470
    .line 471
    move-result p2

    .line 472
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 473
    .line 474
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 475
    .line 476
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 477
    .line 478
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->Q(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 479
    .line 480
    .line 481
    goto/16 :goto_0

    .line 482
    .line 483
    :pswitch_18
    iget p2, p0, Lwb/oe;->k:I

    .line 484
    .line 485
    or-int/lit8 p2, p2, 0x1

    .line 486
    .line 487
    invoke-static {p2}, Li0/r;->C(I)I

    .line 488
    .line 489
    .line 490
    move-result p2

    .line 491
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 492
    .line 493
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 494
    .line 495
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 496
    .line 497
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->P1(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 498
    .line 499
    .line 500
    goto/16 :goto_0

    .line 501
    .line 502
    :pswitch_19
    iget p2, p0, Lwb/oe;->k:I

    .line 503
    .line 504
    or-int/lit8 p2, p2, 0x1

    .line 505
    .line 506
    invoke-static {p2}, Li0/r;->C(I)I

    .line 507
    .line 508
    .line 509
    move-result p2

    .line 510
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 511
    .line 512
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 513
    .line 514
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 515
    .line 516
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->w0(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 517
    .line 518
    .line 519
    goto/16 :goto_0

    .line 520
    .line 521
    :pswitch_1a
    iget p2, p0, Lwb/oe;->k:I

    .line 522
    .line 523
    or-int/lit8 p2, p2, 0x1

    .line 524
    .line 525
    invoke-static {p2}, Li0/r;->C(I)I

    .line 526
    .line 527
    .line 528
    move-result p2

    .line 529
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 530
    .line 531
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 532
    .line 533
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 534
    .line 535
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->D3(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 536
    .line 537
    .line 538
    goto/16 :goto_0

    .line 539
    .line 540
    :pswitch_1b
    iget p2, p0, Lwb/oe;->k:I

    .line 541
    .line 542
    or-int/lit8 p2, p2, 0x1

    .line 543
    .line 544
    invoke-static {p2}, Li0/r;->C(I)I

    .line 545
    .line 546
    .line 547
    move-result p2

    .line 548
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 549
    .line 550
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 551
    .line 552
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 553
    .line 554
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->d0(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 555
    .line 556
    .line 557
    goto/16 :goto_0

    .line 558
    .line 559
    :pswitch_1c
    iget p2, p0, Lwb/oe;->k:I

    .line 560
    .line 561
    or-int/lit8 p2, p2, 0x1

    .line 562
    .line 563
    invoke-static {p2}, Li0/r;->C(I)I

    .line 564
    .line 565
    .line 566
    move-result p2

    .line 567
    iget-object v0, p0, Lwb/oe;->h:Landroid/content/Context;

    .line 568
    .line 569
    iget-object v1, p0, Lwb/oe;->i:Lvb/a;

    .line 570
    .line 571
    iget-object v2, p0, Lwb/oe;->j:Lfg/a;

    .line 572
    .line 573
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->T0(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V

    .line 574
    .line 575
    .line 576
    goto/16 :goto_0

    .line 577
    .line 578
    nop

    .line 579
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
