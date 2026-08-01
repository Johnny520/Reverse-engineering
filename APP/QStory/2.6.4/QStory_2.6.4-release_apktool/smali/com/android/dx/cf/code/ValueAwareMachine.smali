.class public Lcom/android/dx/cf/code/ValueAwareMachine;
.super Lcom/android/dx/cf/code/BaseMachine;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/type/Prototype;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/BaseMachine;-><init>(Lcom/android/dx/rop/type/Prototype;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public run(Lcom/android/dx/cf/code/Frame;II)V
    .locals 2

    .line 1
    if-eqz p3, :cond_6

    .line 2
    .line 3
    const/16 v0, 0x14

    .line 4
    .line 5
    if-eq p3, v0, :cond_5

    .line 6
    .line 7
    const/16 v0, 0x15

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eq p3, v0, :cond_4

    .line 11
    .line 12
    const/16 v0, 0xab

    .line 13
    .line 14
    if-eq p3, v0, :cond_6

    .line 15
    .line 16
    const/16 v0, 0xac

    .line 17
    .line 18
    if-eq p3, v0, :cond_6

    .line 19
    .line 20
    sparse-switch p3, :sswitch_data_0

    .line 21
    .line 22
    .line 23
    packed-switch p3, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    packed-switch p3, :pswitch_data_1

    .line 27
    .line 28
    .line 29
    packed-switch p3, :pswitch_data_2

    .line 30
    .line 31
    .line 32
    packed-switch p3, :pswitch_data_3

    .line 33
    .line 34
    .line 35
    const-string p0, "shouldn\'t happen: "

    .line 36
    .line 37
    invoke-static {p3}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_0
    sget-object p2, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 46
    .line 47
    invoke-virtual {p0, p2}, Lcom/android/dx/cf/code/BaseMachine;->setResult(Lcom/android/dx/rop/type/TypeBearer;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :pswitch_1
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxCst()Lcom/android/dx/rop/cst/Constant;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, Lcom/android/dx/rop/cst/CstType;

    .line 57
    .line 58
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p2}, Lcom/android/dx/rop/type/Type;->getArrayType()Lcom/android/dx/rop/type/Type;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p0, p2}, Lcom/android/dx/cf/code/BaseMachine;->setResult(Lcom/android/dx/rop/type/TypeBearer;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :pswitch_2
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxCst()Lcom/android/dx/rop/cst/Constant;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    check-cast p2, Lcom/android/dx/rop/cst/CstType;

    .line 76
    .line 77
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p0, p2}, Lcom/android/dx/cf/code/BaseMachine;->setResult(Lcom/android/dx/rop/type/TypeBearer;)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_1

    .line 85
    .line 86
    :pswitch_3
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxCst()Lcom/android/dx/rop/cst/Constant;

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    check-cast p3, Lcom/android/dx/rop/cst/CstType;

    .line 91
    .line 92
    invoke-virtual {p3}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    invoke-virtual {p3, p2}, Lcom/android/dx/rop/type/Type;->asUninitialized(I)Lcom/android/dx/rop/type/Type;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-virtual {p0, p2}, Lcom/android/dx/cf/code/BaseMachine;->setResult(Lcom/android/dx/rop/type/TypeBearer;)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :pswitch_4
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxCst()Lcom/android/dx/rop/cst/Constant;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    check-cast p2, Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 110
    .line 111
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstCallSiteRef;->getReturnType()Lcom/android/dx/rop/type/Type;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    sget-object p3, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 116
    .line 117
    if-ne p2, p3, :cond_0

    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->clearResult()V

    .line 120
    .line 121
    .line 122
    goto/16 :goto_1

    .line 123
    .line 124
    :cond_0
    invoke-virtual {p0, p2}, Lcom/android/dx/cf/code/BaseMachine;->setResult(Lcom/android/dx/rop/type/TypeBearer;)V

    .line 125
    .line 126
    .line 127
    goto/16 :goto_1

    .line 128
    .line 129
    :pswitch_5
    invoke-virtual {p0, v1}, Lcom/android/dx/cf/code/BaseMachine;->arg(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-interface {p2}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-virtual {p2}, Lcom/android/dx/rop/type/Type;->isUninitialized()Z

    .line 138
    .line 139
    .line 140
    move-result p3

    .line 141
    if-eqz p3, :cond_1

    .line 142
    .line 143
    invoke-virtual {p1, p2}, Lcom/android/dx/cf/code/Frame;->makeInitialized(Lcom/android/dx/rop/type/Type;)V

    .line 144
    .line 145
    .line 146
    :cond_1
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxCst()Lcom/android/dx/rop/cst/Constant;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    check-cast p2, Lcom/android/dx/rop/type/TypeBearer;

    .line 151
    .line 152
    invoke-interface {p2}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    sget-object p3, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 157
    .line 158
    if-ne p2, p3, :cond_2

    .line 159
    .line 160
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->clearResult()V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_2
    invoke-virtual {p0, p2}, Lcom/android/dx/cf/code/BaseMachine;->setResult(Lcom/android/dx/rop/type/TypeBearer;)V

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :pswitch_6
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxCst()Lcom/android/dx/rop/cst/Constant;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    check-cast p2, Lcom/android/dx/rop/type/TypeBearer;

    .line 173
    .line 174
    invoke-interface {p2}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    sget-object p3, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 179
    .line 180
    if-ne p2, p3, :cond_3

    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->clearResult()V

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_3
    invoke-virtual {p0, p2}, Lcom/android/dx/cf/code/BaseMachine;->setResult(Lcom/android/dx/rop/type/TypeBearer;)V

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :pswitch_7
    new-instance p2, Lcom/android/dx/cf/code/ReturnAddress;

    .line 191
    .line 192
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxTarget()I

    .line 193
    .line 194
    .line 195
    move-result p3

    .line 196
    invoke-direct {p2, p3}, Lcom/android/dx/cf/code/ReturnAddress;-><init>(I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, p2}, Lcom/android/dx/cf/code/BaseMachine;->setResult(Lcom/android/dx/rop/type/TypeBearer;)V

    .line 200
    .line 201
    .line 202
    goto :goto_1

    .line 203
    :pswitch_8
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->clearResult()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxInt()I

    .line 207
    .line 208
    .line 209
    move-result p2

    .line 210
    :goto_0
    if-eqz p2, :cond_7

    .line 211
    .line 212
    and-int/lit8 p3, p2, 0xf

    .line 213
    .line 214
    add-int/lit8 p3, p3, -0x1

    .line 215
    .line 216
    invoke-virtual {p0, p3}, Lcom/android/dx/cf/code/BaseMachine;->arg(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 217
    .line 218
    .line 219
    move-result-object p3

    .line 220
    invoke-virtual {p0, p3}, Lcom/android/dx/cf/code/BaseMachine;->addResult(Lcom/android/dx/rop/type/TypeBearer;)V

    .line 221
    .line 222
    .line 223
    shr-int/lit8 p2, p2, 0x4

    .line 224
    .line 225
    goto :goto_0

    .line 226
    :pswitch_9
    :sswitch_0
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxType()Lcom/android/dx/rop/type/Type;

    .line 227
    .line 228
    .line 229
    move-result-object p2

    .line 230
    invoke-virtual {p0, p2}, Lcom/android/dx/cf/code/BaseMachine;->setResult(Lcom/android/dx/rop/type/TypeBearer;)V

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_4
    :sswitch_1
    invoke-virtual {p0, v1}, Lcom/android/dx/cf/code/BaseMachine;->arg(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 235
    .line 236
    .line 237
    move-result-object p2

    .line 238
    invoke-virtual {p0, p2}, Lcom/android/dx/cf/code/BaseMachine;->setResult(Lcom/android/dx/rop/type/TypeBearer;)V

    .line 239
    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_5
    :sswitch_2
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxCst()Lcom/android/dx/rop/cst/Constant;

    .line 243
    .line 244
    .line 245
    move-result-object p2

    .line 246
    check-cast p2, Lcom/android/dx/rop/type/TypeBearer;

    .line 247
    .line 248
    invoke-virtual {p0, p2}, Lcom/android/dx/cf/code/BaseMachine;->setResult(Lcom/android/dx/rop/type/TypeBearer;)V

    .line 249
    .line 250
    .line 251
    goto :goto_1

    .line 252
    :cond_6
    :pswitch_a
    :sswitch_3
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->clearResult()V

    .line 253
    .line 254
    .line 255
    :cond_7
    :goto_1
    invoke-virtual {p0, p1}, Lcom/android/dx/cf/code/BaseMachine;->storeResults(Lcom/android/dx/cf/code/Frame;)V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x12 -> :sswitch_2
        0x2e -> :sswitch_0
        0x36 -> :sswitch_1
        0x4f -> :sswitch_3
        0x64 -> :sswitch_0
        0x68 -> :sswitch_0
        0x6c -> :sswitch_0
        0x70 -> :sswitch_0
        0x74 -> :sswitch_0
        0x78 -> :sswitch_0
        0x7a -> :sswitch_0
        0x7c -> :sswitch_0
        0x7e -> :sswitch_0
        0x80 -> :sswitch_0
        0x82 -> :sswitch_0
    .end sparse-switch

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    :pswitch_data_0
    .packed-switch 0x57
        :pswitch_a
        :pswitch_a
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_9
    .end packed-switch

    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    :pswitch_data_1
    .packed-switch 0x84
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_7
        :pswitch_a
    .end packed-switch

    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    :pswitch_data_2
    .packed-switch 0xb1
        :pswitch_a
        :pswitch_6
        :pswitch_a
        :pswitch_6
        :pswitch_a
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_6
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_9
        :pswitch_a
        :pswitch_2
        :pswitch_0
        :pswitch_a
        :pswitch_a
    .end packed-switch

    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    :pswitch_data_3
    .packed-switch 0xc5
        :pswitch_2
        :pswitch_a
        :pswitch_a
    .end packed-switch
.end method
