.class public final synthetic Lpr;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lxk1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpr;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lpr;->i:Lxk1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lpr;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, La83;->a:La83;

    .line 5
    .line 6
    iget-object p0, p0, Lpr;->i:Lxk1;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-object v2

    .line 20
    :pswitch_0
    check-cast p1, Lh11;

    .line 21
    .line 22
    iget-wide v0, p1, Lh11;->a:J

    .line 23
    .line 24
    new-instance p1, Lh11;

    .line 25
    .line 26
    invoke-direct {p1, v0, v1}, Lh11;-><init>(J)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-object v2

    .line 33
    :pswitch_1
    check-cast p1, Lh11;

    .line 34
    .line 35
    iget-wide v0, p1, Lh11;->a:J

    .line 36
    .line 37
    new-instance p1, Lh11;

    .line 38
    .line 39
    invoke-direct {p1, v0, v1}, Lh11;-><init>(J)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :pswitch_2
    check-cast p1, Lrs1;

    .line 47
    .line 48
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Lin0;

    .line 53
    .line 54
    invoke-interface {p0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    return-object v2

    .line 58
    :pswitch_3
    check-cast p1, Lba0;

    .line 59
    .line 60
    new-instance p1, Lf8;

    .line 61
    .line 62
    const/16 v0, 0x9

    .line 63
    .line 64
    invoke-direct {p1, v0, p0}, Lf8;-><init>(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :pswitch_4
    check-cast p1, Ljava/lang/Float;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Lin0;

    .line 78
    .line 79
    invoke-interface {p0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, Ljava/lang/Number;

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-object v2

    .line 103
    :pswitch_6
    check-cast p1, Lc61;

    .line 104
    .line 105
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-object v2

    .line 109
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    return-object v2

    .line 118
    :pswitch_8
    check-cast p1, Lkl0;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Lkl0;->a()Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    return-object v2

    .line 135
    :pswitch_9
    check-cast p1, Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    return-object v2

    .line 144
    :pswitch_a
    check-cast p1, Lc61;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    return-object v2

    .line 153
    :pswitch_b
    check-cast p1, Lh11;

    .line 154
    .line 155
    iget-wide v0, p1, Lh11;->a:J

    .line 156
    .line 157
    new-instance p1, Lh11;

    .line 158
    .line 159
    invoke-direct {p1, v0, v1}, Lh11;-><init>(J)V

    .line 160
    .line 161
    .line 162
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    return-object v2

    .line 166
    :pswitch_c
    check-cast p1, Lh11;

    .line 167
    .line 168
    iget-wide v0, p1, Lh11;->a:J

    .line 169
    .line 170
    new-instance p1, Lh11;

    .line 171
    .line 172
    invoke-direct {p1, v0, v1}, Lh11;-><init>(J)V

    .line 173
    .line 174
    .line 175
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    return-object v2

    .line 179
    :pswitch_d
    check-cast p1, Lc61;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    const-wide/16 v0, 0x0

    .line 185
    .line 186
    invoke-interface {p1, v0, v1}, Lc61;->M(J)J

    .line 187
    .line 188
    .line 189
    move-result-wide v0

    .line 190
    new-instance p1, Lrs1;

    .line 191
    .line 192
    invoke-direct {p1, v0, v1}, Lrs1;-><init>(J)V

    .line 193
    .line 194
    .line 195
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    return-object v2

    .line 199
    :pswitch_e
    check-cast p1, Ljava/lang/Boolean;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 202
    .line 203
    .line 204
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    return-object v2

    .line 208
    :pswitch_f
    check-cast p1, Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    :goto_0
    if-ge v1, v3, :cond_1

    .line 223
    .line 224
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    invoke-static {v4}, Ljava/lang/Character;->isDigit(C)Z

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-eqz v5, :cond_0

    .line 233
    .line 234
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 235
    .line 236
    .line 237
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 238
    .line 239
    goto :goto_0

    .line 240
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    return-object v2

    .line 248
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    return-object v2

    .line 257
    :pswitch_11
    check-cast p1, Ljava/lang/String;

    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    return-object v2

    .line 266
    :pswitch_12
    check-cast p1, Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    new-instance v0, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    :goto_1
    if-ge v1, v3, :cond_3

    .line 281
    .line 282
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    invoke-static {v4}, Ljava/lang/Character;->isDigit(C)Z

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    if-eqz v5, :cond_2

    .line 291
    .line 292
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 293
    .line 294
    .line 295
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 296
    .line 297
    goto :goto_1

    .line 298
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    return-object v2

    .line 306
    :pswitch_13
    check-cast p1, Lir;

    .line 307
    .line 308
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    return-object v2

    .line 315
    :pswitch_14
    check-cast p1, Ler;

    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    return-object v2

    .line 324
    :pswitch_15
    check-cast p1, Ljava/lang/Boolean;

    .line 325
    .line 326
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 327
    .line 328
    .line 329
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    return-object v2

    .line 333
    :pswitch_16
    check-cast p1, Ljava/lang/String;

    .line 334
    .line 335
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    return-object v2

    .line 342
    :pswitch_17
    check-cast p1, Lgr;

    .line 343
    .line 344
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    return-object v2

    .line 351
    :pswitch_18
    check-cast p1, Ljava/lang/Boolean;

    .line 352
    .line 353
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 354
    .line 355
    .line 356
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    return-object v2

    .line 360
    :pswitch_19
    check-cast p1, Ljava/lang/Boolean;

    .line 361
    .line 362
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 363
    .line 364
    .line 365
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    return-object v2

    .line 369
    :pswitch_1a
    check-cast p1, Ljava/lang/String;

    .line 370
    .line 371
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    new-instance v0, Ljava/lang/StringBuilder;

    .line 375
    .line 376
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 377
    .line 378
    .line 379
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    :goto_2
    if-ge v1, v3, :cond_5

    .line 384
    .line 385
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    invoke-static {v4}, Ljava/lang/Character;->isDigit(C)Z

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    if-eqz v5, :cond_4

    .line 394
    .line 395
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 396
    .line 397
    .line 398
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 399
    .line 400
    goto :goto_2

    .line 401
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    const/16 v0, 0x8

    .line 406
    .line 407
    invoke-static {p1, v0}, Lpv2;->H0(Ljava/lang/String;I)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    return-object v2

    .line 415
    :pswitch_data_0
    .packed-switch 0x0
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
