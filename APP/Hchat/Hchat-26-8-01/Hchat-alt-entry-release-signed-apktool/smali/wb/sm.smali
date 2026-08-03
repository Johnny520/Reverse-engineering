.class public final synthetic Lwb/sm;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/sm;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/sm;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwb/sm;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/d;

    .line 4
    .line 5
    check-cast p2, Li0/h0;

    .line 6
    .line 7
    check-cast p3, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    and-int/lit8 p1, p3, 0x11

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    move p1, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    and-int/2addr p3, v1

    .line 30
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    new-instance p1, Lwb/l8;

    .line 37
    .line 38
    const/16 p3, 0x16

    .line 39
    .line 40
    iget-object v0, p0, Lwb/sm;->h:Landroid/content/SharedPreferences;

    .line 41
    .line 42
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 43
    .line 44
    .line 45
    const p3, -0x6d340bb6

    .line 46
    .line 47
    .line 48
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/16 p3, 0x30

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 60
    .line 61
    .line 62
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_0
    const/16 v0, 0x10

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    if-eq p1, v0, :cond_2

    .line 69
    .line 70
    move p1, v1

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    const/4 p1, 0x0

    .line 73
    :goto_2
    and-int/2addr p3, v1

    .line 74
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    new-instance p1, Lwb/l8;

    .line 81
    .line 82
    const/4 p3, 0x6

    .line 83
    iget-object v0, p0, Lwb/sm;->h:Landroid/content/SharedPreferences;

    .line 84
    .line 85
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 86
    .line 87
    .line 88
    const p3, 0x72d808c

    .line 89
    .line 90
    .line 91
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const/16 p3, 0x30

    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 103
    .line 104
    .line 105
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 106
    .line 107
    return-object p1

    .line 108
    :pswitch_1
    const/16 v0, 0x10

    .line 109
    .line 110
    const/4 v1, 0x1

    .line 111
    if-eq p1, v0, :cond_4

    .line 112
    .line 113
    move p1, v1

    .line 114
    goto :goto_4

    .line 115
    :cond_4
    const/4 p1, 0x0

    .line 116
    :goto_4
    and-int/2addr p3, v1

    .line 117
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_5

    .line 122
    .line 123
    new-instance p1, Lwb/l8;

    .line 124
    .line 125
    const/16 p3, 0x1b

    .line 126
    .line 127
    iget-object v0, p0, Lwb/sm;->h:Landroid/content/SharedPreferences;

    .line 128
    .line 129
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 130
    .line 131
    .line 132
    const p3, 0x7b8f0cce

    .line 133
    .line 134
    .line 135
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    const/16 p3, 0x30

    .line 140
    .line 141
    const/4 v0, 0x0

    .line 142
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 143
    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 147
    .line 148
    .line 149
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 150
    .line 151
    return-object p1

    .line 152
    :pswitch_2
    const/16 v0, 0x10

    .line 153
    .line 154
    const/4 v1, 0x1

    .line 155
    if-eq p1, v0, :cond_6

    .line 156
    .line 157
    move p1, v1

    .line 158
    goto :goto_6

    .line 159
    :cond_6
    const/4 p1, 0x0

    .line 160
    :goto_6
    and-int/2addr p3, v1

    .line 161
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-eqz p1, :cond_7

    .line 166
    .line 167
    new-instance p1, Lwb/l8;

    .line 168
    .line 169
    const/16 p3, 0xb

    .line 170
    .line 171
    iget-object v0, p0, Lwb/sm;->h:Landroid/content/SharedPreferences;

    .line 172
    .line 173
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 174
    .line 175
    .line 176
    const p3, -0x634cdf98

    .line 177
    .line 178
    .line 179
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    const/16 p3, 0x30

    .line 184
    .line 185
    const/4 v0, 0x0

    .line 186
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 187
    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 191
    .line 192
    .line 193
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 194
    .line 195
    return-object p1

    .line 196
    :pswitch_3
    const/16 v0, 0x10

    .line 197
    .line 198
    const/4 v1, 0x1

    .line 199
    if-eq p1, v0, :cond_8

    .line 200
    .line 201
    move p1, v1

    .line 202
    goto :goto_8

    .line 203
    :cond_8
    const/4 p1, 0x0

    .line 204
    :goto_8
    and-int/2addr p3, v1

    .line 205
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-eqz p1, :cond_9

    .line 210
    .line 211
    new-instance p1, Lwb/l8;

    .line 212
    .line 213
    const/16 p3, 0xa

    .line 214
    .line 215
    iget-object v0, p0, Lwb/sm;->h:Landroid/content/SharedPreferences;

    .line 216
    .line 217
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 218
    .line 219
    .line 220
    const p3, -0x5546e256

    .line 221
    .line 222
    .line 223
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    const/16 p3, 0x30

    .line 228
    .line 229
    const/4 v0, 0x0

    .line 230
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 231
    .line 232
    .line 233
    goto :goto_9

    .line 234
    :cond_9
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 235
    .line 236
    .line 237
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 238
    .line 239
    return-object p1

    .line 240
    :pswitch_4
    const/16 v0, 0x10

    .line 241
    .line 242
    const/4 v1, 0x1

    .line 243
    if-eq p1, v0, :cond_a

    .line 244
    .line 245
    move p1, v1

    .line 246
    goto :goto_a

    .line 247
    :cond_a
    const/4 p1, 0x0

    .line 248
    :goto_a
    and-int/2addr p3, v1

    .line 249
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    if-eqz p1, :cond_b

    .line 254
    .line 255
    new-instance p1, Lwb/l8;

    .line 256
    .line 257
    const/16 p3, 0x13

    .line 258
    .line 259
    iget-object v0, p0, Lwb/sm;->h:Landroid/content/SharedPreferences;

    .line 260
    .line 261
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 262
    .line 263
    .line 264
    const p3, 0x37642080

    .line 265
    .line 266
    .line 267
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    const/16 p3, 0x30

    .line 272
    .line 273
    const/4 v0, 0x0

    .line 274
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 275
    .line 276
    .line 277
    goto :goto_b

    .line 278
    :cond_b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 279
    .line 280
    .line 281
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 282
    .line 283
    return-object p1

    .line 284
    :pswitch_5
    const/16 v0, 0x10

    .line 285
    .line 286
    const/4 v1, 0x1

    .line 287
    if-eq p1, v0, :cond_c

    .line 288
    .line 289
    move p1, v1

    .line 290
    goto :goto_c

    .line 291
    :cond_c
    const/4 p1, 0x0

    .line 292
    :goto_c
    and-int/2addr p3, v1

    .line 293
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    if-eqz p1, :cond_d

    .line 298
    .line 299
    new-instance p1, Lwb/l8;

    .line 300
    .line 301
    const/16 p3, 0xc

    .line 302
    .line 303
    iget-object v0, p0, Lwb/sm;->h:Landroid/content/SharedPreferences;

    .line 304
    .line 305
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 306
    .line 307
    .line 308
    const p3, -0x7b498571

    .line 309
    .line 310
    .line 311
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    const/16 p3, 0x30

    .line 316
    .line 317
    const/4 v0, 0x0

    .line 318
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 319
    .line 320
    .line 321
    goto :goto_d

    .line 322
    :cond_d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 323
    .line 324
    .line 325
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 326
    .line 327
    return-object p1

    .line 328
    :pswitch_6
    const/16 v0, 0x10

    .line 329
    .line 330
    const/4 v1, 0x1

    .line 331
    if-eq p1, v0, :cond_e

    .line 332
    .line 333
    move p1, v1

    .line 334
    goto :goto_e

    .line 335
    :cond_e
    const/4 p1, 0x0

    .line 336
    :goto_e
    and-int/2addr p3, v1

    .line 337
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    if-eqz p1, :cond_f

    .line 342
    .line 343
    new-instance p1, Lwb/l8;

    .line 344
    .line 345
    const/16 p3, 0xf

    .line 346
    .line 347
    iget-object v0, p0, Lwb/sm;->h:Landroid/content/SharedPreferences;

    .line 348
    .line 349
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 350
    .line 351
    .line 352
    const p3, 0x553e7f10

    .line 353
    .line 354
    .line 355
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    const/16 p3, 0x30

    .line 360
    .line 361
    const/4 v0, 0x0

    .line 362
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 363
    .line 364
    .line 365
    goto :goto_f

    .line 366
    :cond_f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 367
    .line 368
    .line 369
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 370
    .line 371
    return-object p1

    .line 372
    :pswitch_7
    const/16 v0, 0x10

    .line 373
    .line 374
    const/4 v1, 0x1

    .line 375
    if-eq p1, v0, :cond_10

    .line 376
    .line 377
    move p1, v1

    .line 378
    goto :goto_10

    .line 379
    :cond_10
    const/4 p1, 0x0

    .line 380
    :goto_10
    and-int/2addr p3, v1

    .line 381
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 382
    .line 383
    .line 384
    move-result p1

    .line 385
    if-eqz p1, :cond_11

    .line 386
    .line 387
    new-instance p1, Lwb/sb;

    .line 388
    .line 389
    const/4 p3, 0x0

    .line 390
    const/4 v0, 0x0

    .line 391
    iget-object v2, p0, Lwb/sm;->h:Landroid/content/SharedPreferences;

    .line 392
    .line 393
    invoke-direct {p1, v2, p3, v0}, Lwb/sb;-><init>(Landroid/content/SharedPreferences;IB)V

    .line 394
    .line 395
    .line 396
    const p3, -0x766ea817

    .line 397
    .line 398
    .line 399
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    const/16 p3, 0x30

    .line 404
    .line 405
    const/4 v0, 0x0

    .line 406
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 407
    .line 408
    .line 409
    goto :goto_11

    .line 410
    :cond_11
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 411
    .line 412
    .line 413
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 414
    .line 415
    return-object p1

    .line 416
    nop

    .line 417
    :pswitch_data_0
    .packed-switch 0x0
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
