.class public final Lorg/luckypray/dexkit/util/OpCodeUtil;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/util/OpCodeUtil;

.field private static final opFormat:[Ljava/lang/String;

.field private static final opFormatMap$delegate:Le9;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/util/OpCodeUtil;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/util/OpCodeUtil;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil;->INSTANCE:Lorg/luckypray/dexkit/util/OpCodeUtil;

    .line 7
    .line 8
    const/16 v0, 0x100

    .line 9
    .line 10
    new-array v0, v0, [Ljava/lang/String;

    .line 11
    .line 12
    const-string v1, "nop"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    aput-object v1, v0, v2

    .line 16
    .line 17
    const-string v1, "move"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    aput-object v1, v0, v2

    .line 21
    .line 22
    const-string v1, "move/from16"

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    aput-object v1, v0, v2

    .line 26
    .line 27
    const-string v1, "move/16"

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    aput-object v1, v0, v2

    .line 31
    .line 32
    const-string v1, "move-wide"

    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    aput-object v1, v0, v2

    .line 36
    .line 37
    const-string v1, "move-wide/from16"

    .line 38
    .line 39
    const/4 v2, 0x5

    .line 40
    aput-object v1, v0, v2

    .line 41
    .line 42
    const-string v1, "move-wide/16"

    .line 43
    .line 44
    const/4 v2, 0x6

    .line 45
    aput-object v1, v0, v2

    .line 46
    .line 47
    const-string v1, "move-object"

    .line 48
    .line 49
    const/4 v2, 0x7

    .line 50
    aput-object v1, v0, v2

    .line 51
    .line 52
    const-string v1, "move-object/from16"

    .line 53
    .line 54
    const/16 v2, 0x8

    .line 55
    .line 56
    aput-object v1, v0, v2

    .line 57
    .line 58
    const-string v1, "move-object/16"

    .line 59
    .line 60
    const/16 v2, 0x9

    .line 61
    .line 62
    aput-object v1, v0, v2

    .line 63
    .line 64
    const-string v1, "move-result"

    .line 65
    .line 66
    const/16 v2, 0xa

    .line 67
    .line 68
    aput-object v1, v0, v2

    .line 69
    .line 70
    const-string v1, "move-result-wide"

    .line 71
    .line 72
    const/16 v2, 0xb

    .line 73
    .line 74
    aput-object v1, v0, v2

    .line 75
    .line 76
    const-string v1, "move-result-object"

    .line 77
    .line 78
    const/16 v2, 0xc

    .line 79
    .line 80
    aput-object v1, v0, v2

    .line 81
    .line 82
    const-string v1, "move-exception"

    .line 83
    .line 84
    const/16 v2, 0xd

    .line 85
    .line 86
    aput-object v1, v0, v2

    .line 87
    .line 88
    const-string v1, "return-void"

    .line 89
    .line 90
    const/16 v2, 0xe

    .line 91
    .line 92
    aput-object v1, v0, v2

    .line 93
    .line 94
    const-string v1, "return"

    .line 95
    .line 96
    const/16 v2, 0xf

    .line 97
    .line 98
    aput-object v1, v0, v2

    .line 99
    .line 100
    const-string v1, "return-wide"

    .line 101
    .line 102
    const/16 v2, 0x10

    .line 103
    .line 104
    aput-object v1, v0, v2

    .line 105
    .line 106
    const-string v1, "return-object"

    .line 107
    .line 108
    const/16 v2, 0x11

    .line 109
    .line 110
    aput-object v1, v0, v2

    .line 111
    .line 112
    const-string v1, "const/4"

    .line 113
    .line 114
    const/16 v2, 0x12

    .line 115
    .line 116
    aput-object v1, v0, v2

    .line 117
    .line 118
    const-string v1, "const/16"

    .line 119
    .line 120
    const/16 v2, 0x13

    .line 121
    .line 122
    aput-object v1, v0, v2

    .line 123
    .line 124
    const-string v1, "const"

    .line 125
    .line 126
    const/16 v2, 0x14

    .line 127
    .line 128
    aput-object v1, v0, v2

    .line 129
    .line 130
    const-string v1, "const/high16"

    .line 131
    .line 132
    const/16 v2, 0x15

    .line 133
    .line 134
    aput-object v1, v0, v2

    .line 135
    .line 136
    const-string v1, "const-wide/16"

    .line 137
    .line 138
    const/16 v2, 0x16

    .line 139
    .line 140
    aput-object v1, v0, v2

    .line 141
    .line 142
    const-string v1, "const-wide/32"

    .line 143
    .line 144
    const/16 v2, 0x17

    .line 145
    .line 146
    aput-object v1, v0, v2

    .line 147
    .line 148
    const-string v1, "const-wide"

    .line 149
    .line 150
    const/16 v2, 0x18

    .line 151
    .line 152
    aput-object v1, v0, v2

    .line 153
    .line 154
    const-string v1, "const-wide/high16"

    .line 155
    .line 156
    const/16 v2, 0x19

    .line 157
    .line 158
    aput-object v1, v0, v2

    .line 159
    .line 160
    const-string v1, "const-string"

    .line 161
    .line 162
    const/16 v2, 0x1a

    .line 163
    .line 164
    aput-object v1, v0, v2

    .line 165
    .line 166
    const-string v1, "const-string/jumbo"

    .line 167
    .line 168
    const/16 v2, 0x1b

    .line 169
    .line 170
    aput-object v1, v0, v2

    .line 171
    .line 172
    const-string v1, "const-class"

    .line 173
    .line 174
    const/16 v2, 0x1c

    .line 175
    .line 176
    aput-object v1, v0, v2

    .line 177
    .line 178
    const-string v1, "monitor-enter"

    .line 179
    .line 180
    const/16 v2, 0x1d

    .line 181
    .line 182
    aput-object v1, v0, v2

    .line 183
    .line 184
    const-string v1, "monitor-exit"

    .line 185
    .line 186
    const/16 v2, 0x1e

    .line 187
    .line 188
    aput-object v1, v0, v2

    .line 189
    .line 190
    const-string v1, "check-cast"

    .line 191
    .line 192
    const/16 v2, 0x1f

    .line 193
    .line 194
    aput-object v1, v0, v2

    .line 195
    .line 196
    const-string v1, "instance-of"

    .line 197
    .line 198
    const/16 v2, 0x20

    .line 199
    .line 200
    aput-object v1, v0, v2

    .line 201
    .line 202
    const-string v1, "array-length"

    .line 203
    .line 204
    const/16 v2, 0x21

    .line 205
    .line 206
    aput-object v1, v0, v2

    .line 207
    .line 208
    const-string v1, "new-instance"

    .line 209
    .line 210
    const/16 v2, 0x22

    .line 211
    .line 212
    aput-object v1, v0, v2

    .line 213
    .line 214
    const-string v1, "new-array"

    .line 215
    .line 216
    const/16 v2, 0x23

    .line 217
    .line 218
    aput-object v1, v0, v2

    .line 219
    .line 220
    const-string v1, "filled-new-array"

    .line 221
    .line 222
    const/16 v2, 0x24

    .line 223
    .line 224
    aput-object v1, v0, v2

    .line 225
    .line 226
    const-string v1, "filled-new-array/range"

    .line 227
    .line 228
    const/16 v2, 0x25

    .line 229
    .line 230
    aput-object v1, v0, v2

    .line 231
    .line 232
    const-string v1, "fill-array-data"

    .line 233
    .line 234
    const/16 v2, 0x26

    .line 235
    .line 236
    aput-object v1, v0, v2

    .line 237
    .line 238
    const-string v1, "throw"

    .line 239
    .line 240
    const/16 v2, 0x27

    .line 241
    .line 242
    aput-object v1, v0, v2

    .line 243
    .line 244
    const-string v1, "goto"

    .line 245
    .line 246
    const/16 v2, 0x28

    .line 247
    .line 248
    aput-object v1, v0, v2

    .line 249
    .line 250
    const-string v1, "goto/16"

    .line 251
    .line 252
    const/16 v2, 0x29

    .line 253
    .line 254
    aput-object v1, v0, v2

    .line 255
    .line 256
    const-string v1, "goto/32"

    .line 257
    .line 258
    const/16 v2, 0x2a

    .line 259
    .line 260
    aput-object v1, v0, v2

    .line 261
    .line 262
    const-string v1, "packed-switch"

    .line 263
    .line 264
    const/16 v2, 0x2b

    .line 265
    .line 266
    aput-object v1, v0, v2

    .line 267
    .line 268
    const-string v1, "sparse-switch"

    .line 269
    .line 270
    const/16 v2, 0x2c

    .line 271
    .line 272
    aput-object v1, v0, v2

    .line 273
    .line 274
    const-string v1, "cmpl-float"

    .line 275
    .line 276
    const/16 v2, 0x2d

    .line 277
    .line 278
    aput-object v1, v0, v2

    .line 279
    .line 280
    const-string v1, "cmpg-float"

    .line 281
    .line 282
    const/16 v2, 0x2e

    .line 283
    .line 284
    aput-object v1, v0, v2

    .line 285
    .line 286
    const-string v1, "cmpl-double"

    .line 287
    .line 288
    const/16 v2, 0x2f

    .line 289
    .line 290
    aput-object v1, v0, v2

    .line 291
    .line 292
    const-string v1, "cmpg-double"

    .line 293
    .line 294
    const/16 v2, 0x30

    .line 295
    .line 296
    aput-object v1, v0, v2

    .line 297
    .line 298
    const-string v1, "cmp-long"

    .line 299
    .line 300
    const/16 v2, 0x31

    .line 301
    .line 302
    aput-object v1, v0, v2

    .line 303
    .line 304
    const-string v1, "if-eq"

    .line 305
    .line 306
    const/16 v2, 0x32

    .line 307
    .line 308
    aput-object v1, v0, v2

    .line 309
    .line 310
    const-string v1, "if-ne"

    .line 311
    .line 312
    const/16 v2, 0x33

    .line 313
    .line 314
    aput-object v1, v0, v2

    .line 315
    .line 316
    const-string v1, "if-lt"

    .line 317
    .line 318
    const/16 v2, 0x34

    .line 319
    .line 320
    aput-object v1, v0, v2

    .line 321
    .line 322
    const-string v1, "if-ge"

    .line 323
    .line 324
    const/16 v2, 0x35

    .line 325
    .line 326
    aput-object v1, v0, v2

    .line 327
    .line 328
    const-string v1, "if-gt"

    .line 329
    .line 330
    const/16 v2, 0x36

    .line 331
    .line 332
    aput-object v1, v0, v2

    .line 333
    .line 334
    const-string v1, "if-le"

    .line 335
    .line 336
    const/16 v2, 0x37

    .line 337
    .line 338
    aput-object v1, v0, v2

    .line 339
    .line 340
    const-string v1, "if-eqz"

    .line 341
    .line 342
    const/16 v2, 0x38

    .line 343
    .line 344
    aput-object v1, v0, v2

    .line 345
    .line 346
    const-string v1, "if-nez"

    .line 347
    .line 348
    const/16 v2, 0x39

    .line 349
    .line 350
    aput-object v1, v0, v2

    .line 351
    .line 352
    const-string v1, "if-ltz"

    .line 353
    .line 354
    const/16 v2, 0x3a

    .line 355
    .line 356
    aput-object v1, v0, v2

    .line 357
    .line 358
    const-string v1, "if-gez"

    .line 359
    .line 360
    const/16 v2, 0x3b

    .line 361
    .line 362
    aput-object v1, v0, v2

    .line 363
    .line 364
    const-string v1, "if-gtz"

    .line 365
    .line 366
    const/16 v2, 0x3c

    .line 367
    .line 368
    aput-object v1, v0, v2

    .line 369
    .line 370
    const-string v1, "if-lez"

    .line 371
    .line 372
    const/16 v2, 0x3d

    .line 373
    .line 374
    aput-object v1, v0, v2

    .line 375
    .line 376
    const-string v1, "unused-3e"

    .line 377
    .line 378
    const/16 v2, 0x3e

    .line 379
    .line 380
    aput-object v1, v0, v2

    .line 381
    .line 382
    const-string v1, "unused-3f"

    .line 383
    .line 384
    const/16 v2, 0x3f

    .line 385
    .line 386
    aput-object v1, v0, v2

    .line 387
    .line 388
    const-string v1, "unused-40"

    .line 389
    .line 390
    const/16 v2, 0x40

    .line 391
    .line 392
    aput-object v1, v0, v2

    .line 393
    .line 394
    const-string v1, "unused-41"

    .line 395
    .line 396
    const/16 v2, 0x41

    .line 397
    .line 398
    aput-object v1, v0, v2

    .line 399
    .line 400
    const-string v1, "unused-42"

    .line 401
    .line 402
    const/16 v2, 0x42

    .line 403
    .line 404
    aput-object v1, v0, v2

    .line 405
    .line 406
    const-string v1, "unused-43"

    .line 407
    .line 408
    const/16 v2, 0x43

    .line 409
    .line 410
    aput-object v1, v0, v2

    .line 411
    .line 412
    const-string v1, "aget"

    .line 413
    .line 414
    const/16 v2, 0x44

    .line 415
    .line 416
    aput-object v1, v0, v2

    .line 417
    .line 418
    const-string v1, "aget-wide"

    .line 419
    .line 420
    const/16 v2, 0x45

    .line 421
    .line 422
    aput-object v1, v0, v2

    .line 423
    .line 424
    const-string v1, "aget-object"

    .line 425
    .line 426
    const/16 v2, 0x46

    .line 427
    .line 428
    aput-object v1, v0, v2

    .line 429
    .line 430
    const-string v1, "aget-boolean"

    .line 431
    .line 432
    const/16 v2, 0x47

    .line 433
    .line 434
    aput-object v1, v0, v2

    .line 435
    .line 436
    const-string v1, "aget-byte"

    .line 437
    .line 438
    const/16 v2, 0x48

    .line 439
    .line 440
    aput-object v1, v0, v2

    .line 441
    .line 442
    const-string v1, "aget-char"

    .line 443
    .line 444
    const/16 v2, 0x49

    .line 445
    .line 446
    aput-object v1, v0, v2

    .line 447
    .line 448
    const-string v1, "aget-short"

    .line 449
    .line 450
    const/16 v2, 0x4a

    .line 451
    .line 452
    aput-object v1, v0, v2

    .line 453
    .line 454
    const-string v1, "aput"

    .line 455
    .line 456
    const/16 v2, 0x4b

    .line 457
    .line 458
    aput-object v1, v0, v2

    .line 459
    .line 460
    const-string v1, "aput-wide"

    .line 461
    .line 462
    const/16 v2, 0x4c

    .line 463
    .line 464
    aput-object v1, v0, v2

    .line 465
    .line 466
    const-string v1, "aput-object"

    .line 467
    .line 468
    const/16 v2, 0x4d

    .line 469
    .line 470
    aput-object v1, v0, v2

    .line 471
    .line 472
    const-string v1, "aput-boolean"

    .line 473
    .line 474
    const/16 v2, 0x4e

    .line 475
    .line 476
    aput-object v1, v0, v2

    .line 477
    .line 478
    const-string v1, "aput-byte"

    .line 479
    .line 480
    const/16 v2, 0x4f

    .line 481
    .line 482
    aput-object v1, v0, v2

    .line 483
    .line 484
    const-string v1, "aput-char"

    .line 485
    .line 486
    const/16 v2, 0x50

    .line 487
    .line 488
    aput-object v1, v0, v2

    .line 489
    .line 490
    const-string v1, "aput-short"

    .line 491
    .line 492
    const/16 v2, 0x51

    .line 493
    .line 494
    aput-object v1, v0, v2

    .line 495
    .line 496
    const-string v1, "iget"

    .line 497
    .line 498
    const/16 v2, 0x52

    .line 499
    .line 500
    aput-object v1, v0, v2

    .line 501
    .line 502
    const-string v1, "iget-wide"

    .line 503
    .line 504
    const/16 v2, 0x53

    .line 505
    .line 506
    aput-object v1, v0, v2

    .line 507
    .line 508
    const-string v1, "iget-object"

    .line 509
    .line 510
    const/16 v2, 0x54

    .line 511
    .line 512
    aput-object v1, v0, v2

    .line 513
    .line 514
    const-string v1, "iget-boolean"

    .line 515
    .line 516
    const/16 v2, 0x55

    .line 517
    .line 518
    aput-object v1, v0, v2

    .line 519
    .line 520
    const-string v1, "iget-byte"

    .line 521
    .line 522
    const/16 v2, 0x56

    .line 523
    .line 524
    aput-object v1, v0, v2

    .line 525
    .line 526
    const-string v1, "iget-char"

    .line 527
    .line 528
    const/16 v2, 0x57

    .line 529
    .line 530
    aput-object v1, v0, v2

    .line 531
    .line 532
    const-string v1, "iget-short"

    .line 533
    .line 534
    const/16 v2, 0x58

    .line 535
    .line 536
    aput-object v1, v0, v2

    .line 537
    .line 538
    const-string v1, "iput"

    .line 539
    .line 540
    const/16 v2, 0x59

    .line 541
    .line 542
    aput-object v1, v0, v2

    .line 543
    .line 544
    const-string v1, "iput-wide"

    .line 545
    .line 546
    const/16 v2, 0x5a

    .line 547
    .line 548
    aput-object v1, v0, v2

    .line 549
    .line 550
    const-string v1, "iput-object"

    .line 551
    .line 552
    const/16 v2, 0x5b

    .line 553
    .line 554
    aput-object v1, v0, v2

    .line 555
    .line 556
    const-string v1, "iput-boolean"

    .line 557
    .line 558
    const/16 v2, 0x5c

    .line 559
    .line 560
    aput-object v1, v0, v2

    .line 561
    .line 562
    const-string v1, "iput-byte"

    .line 563
    .line 564
    const/16 v2, 0x5d

    .line 565
    .line 566
    aput-object v1, v0, v2

    .line 567
    .line 568
    const-string v1, "iput-char"

    .line 569
    .line 570
    const/16 v2, 0x5e

    .line 571
    .line 572
    aput-object v1, v0, v2

    .line 573
    .line 574
    const-string v1, "iput-short"

    .line 575
    .line 576
    const/16 v2, 0x5f

    .line 577
    .line 578
    aput-object v1, v0, v2

    .line 579
    .line 580
    const-string v1, "sget"

    .line 581
    .line 582
    const/16 v2, 0x60

    .line 583
    .line 584
    aput-object v1, v0, v2

    .line 585
    .line 586
    const-string v1, "sget-wide"

    .line 587
    .line 588
    const/16 v2, 0x61

    .line 589
    .line 590
    aput-object v1, v0, v2

    .line 591
    .line 592
    const-string v1, "sget-object"

    .line 593
    .line 594
    const/16 v2, 0x62

    .line 595
    .line 596
    aput-object v1, v0, v2

    .line 597
    .line 598
    const-string v1, "sget-boolean"

    .line 599
    .line 600
    const/16 v2, 0x63

    .line 601
    .line 602
    aput-object v1, v0, v2

    .line 603
    .line 604
    const-string v1, "sget-byte"

    .line 605
    .line 606
    const/16 v2, 0x64

    .line 607
    .line 608
    aput-object v1, v0, v2

    .line 609
    .line 610
    const-string v1, "sget-char"

    .line 611
    .line 612
    const/16 v2, 0x65

    .line 613
    .line 614
    aput-object v1, v0, v2

    .line 615
    .line 616
    const-string v1, "sget-short"

    .line 617
    .line 618
    const/16 v2, 0x66

    .line 619
    .line 620
    aput-object v1, v0, v2

    .line 621
    .line 622
    const-string v1, "sput"

    .line 623
    .line 624
    const/16 v2, 0x67

    .line 625
    .line 626
    aput-object v1, v0, v2

    .line 627
    .line 628
    const-string v1, "sput-wide"

    .line 629
    .line 630
    const/16 v2, 0x68

    .line 631
    .line 632
    aput-object v1, v0, v2

    .line 633
    .line 634
    const-string v1, "sput-object"

    .line 635
    .line 636
    const/16 v2, 0x69

    .line 637
    .line 638
    aput-object v1, v0, v2

    .line 639
    .line 640
    const-string v1, "sput-boolean"

    .line 641
    .line 642
    const/16 v2, 0x6a

    .line 643
    .line 644
    aput-object v1, v0, v2

    .line 645
    .line 646
    const-string v1, "sput-byte"

    .line 647
    .line 648
    const/16 v2, 0x6b

    .line 649
    .line 650
    aput-object v1, v0, v2

    .line 651
    .line 652
    const-string v1, "sput-char"

    .line 653
    .line 654
    const/16 v2, 0x6c

    .line 655
    .line 656
    aput-object v1, v0, v2

    .line 657
    .line 658
    const-string v1, "sput-short"

    .line 659
    .line 660
    const/16 v2, 0x6d

    .line 661
    .line 662
    aput-object v1, v0, v2

    .line 663
    .line 664
    const-string v1, "invoke-virtual"

    .line 665
    .line 666
    const/16 v2, 0x6e

    .line 667
    .line 668
    aput-object v1, v0, v2

    .line 669
    .line 670
    const-string v1, "invoke-super"

    .line 671
    .line 672
    const/16 v2, 0x6f

    .line 673
    .line 674
    aput-object v1, v0, v2

    .line 675
    .line 676
    const-string v1, "invoke-direct"

    .line 677
    .line 678
    const/16 v2, 0x70

    .line 679
    .line 680
    aput-object v1, v0, v2

    .line 681
    .line 682
    const-string v1, "invoke-static"

    .line 683
    .line 684
    const/16 v2, 0x71

    .line 685
    .line 686
    aput-object v1, v0, v2

    .line 687
    .line 688
    const-string v1, "invoke-interface"

    .line 689
    .line 690
    const/16 v2, 0x72

    .line 691
    .line 692
    aput-object v1, v0, v2

    .line 693
    .line 694
    const-string v1, "return-void-no-barrier"

    .line 695
    .line 696
    const/16 v2, 0x73

    .line 697
    .line 698
    aput-object v1, v0, v2

    .line 699
    .line 700
    const-string v1, "invoke-virtual/range"

    .line 701
    .line 702
    const/16 v2, 0x74

    .line 703
    .line 704
    aput-object v1, v0, v2

    .line 705
    .line 706
    const-string v1, "invoke-super/range"

    .line 707
    .line 708
    const/16 v2, 0x75

    .line 709
    .line 710
    aput-object v1, v0, v2

    .line 711
    .line 712
    const-string v1, "invoke-direct/range"

    .line 713
    .line 714
    const/16 v2, 0x76

    .line 715
    .line 716
    aput-object v1, v0, v2

    .line 717
    .line 718
    const-string v1, "invoke-static/range"

    .line 719
    .line 720
    const/16 v2, 0x77

    .line 721
    .line 722
    aput-object v1, v0, v2

    .line 723
    .line 724
    const-string v1, "invoke-interface/range"

    .line 725
    .line 726
    const/16 v2, 0x78

    .line 727
    .line 728
    aput-object v1, v0, v2

    .line 729
    .line 730
    const-string v1, "unused-79"

    .line 731
    .line 732
    const/16 v2, 0x79

    .line 733
    .line 734
    aput-object v1, v0, v2

    .line 735
    .line 736
    const-string v1, "unused-7a"

    .line 737
    .line 738
    const/16 v2, 0x7a

    .line 739
    .line 740
    aput-object v1, v0, v2

    .line 741
    .line 742
    const-string v1, "neg-int"

    .line 743
    .line 744
    const/16 v2, 0x7b

    .line 745
    .line 746
    aput-object v1, v0, v2

    .line 747
    .line 748
    const-string v1, "not-int"

    .line 749
    .line 750
    const/16 v2, 0x7c

    .line 751
    .line 752
    aput-object v1, v0, v2

    .line 753
    .line 754
    const-string v1, "neg-long"

    .line 755
    .line 756
    const/16 v2, 0x7d

    .line 757
    .line 758
    aput-object v1, v0, v2

    .line 759
    .line 760
    const-string v1, "not-long"

    .line 761
    .line 762
    const/16 v2, 0x7e

    .line 763
    .line 764
    aput-object v1, v0, v2

    .line 765
    .line 766
    const-string v1, "neg-float"

    .line 767
    .line 768
    const/16 v2, 0x7f

    .line 769
    .line 770
    aput-object v1, v0, v2

    .line 771
    .line 772
    const-string v1, "neg-double"

    .line 773
    .line 774
    const/16 v2, 0x80

    .line 775
    .line 776
    aput-object v1, v0, v2

    .line 777
    .line 778
    const-string v1, "int-to-long"

    .line 779
    .line 780
    const/16 v2, 0x81

    .line 781
    .line 782
    aput-object v1, v0, v2

    .line 783
    .line 784
    const-string v1, "int-to-float"

    .line 785
    .line 786
    const/16 v2, 0x82

    .line 787
    .line 788
    aput-object v1, v0, v2

    .line 789
    .line 790
    const-string v1, "int-to-double"

    .line 791
    .line 792
    const/16 v2, 0x83

    .line 793
    .line 794
    aput-object v1, v0, v2

    .line 795
    .line 796
    const-string v1, "long-to-int"

    .line 797
    .line 798
    const/16 v2, 0x84

    .line 799
    .line 800
    aput-object v1, v0, v2

    .line 801
    .line 802
    const-string v1, "long-to-float"

    .line 803
    .line 804
    const/16 v2, 0x85

    .line 805
    .line 806
    aput-object v1, v0, v2

    .line 807
    .line 808
    const-string v1, "long-to-double"

    .line 809
    .line 810
    const/16 v2, 0x86

    .line 811
    .line 812
    aput-object v1, v0, v2

    .line 813
    .line 814
    const-string v1, "float-to-int"

    .line 815
    .line 816
    const/16 v2, 0x87

    .line 817
    .line 818
    aput-object v1, v0, v2

    .line 819
    .line 820
    const-string v1, "float-to-long"

    .line 821
    .line 822
    const/16 v2, 0x88

    .line 823
    .line 824
    aput-object v1, v0, v2

    .line 825
    .line 826
    const-string v1, "float-to-double"

    .line 827
    .line 828
    const/16 v2, 0x89

    .line 829
    .line 830
    aput-object v1, v0, v2

    .line 831
    .line 832
    const-string v1, "double-to-int"

    .line 833
    .line 834
    const/16 v2, 0x8a

    .line 835
    .line 836
    aput-object v1, v0, v2

    .line 837
    .line 838
    const-string v1, "double-to-long"

    .line 839
    .line 840
    const/16 v2, 0x8b

    .line 841
    .line 842
    aput-object v1, v0, v2

    .line 843
    .line 844
    const-string v1, "double-to-float"

    .line 845
    .line 846
    const/16 v2, 0x8c

    .line 847
    .line 848
    aput-object v1, v0, v2

    .line 849
    .line 850
    const-string v1, "int-to-byte"

    .line 851
    .line 852
    const/16 v2, 0x8d

    .line 853
    .line 854
    aput-object v1, v0, v2

    .line 855
    .line 856
    const-string v1, "int-to-char"

    .line 857
    .line 858
    const/16 v2, 0x8e

    .line 859
    .line 860
    aput-object v1, v0, v2

    .line 861
    .line 862
    const-string v1, "int-to-short"

    .line 863
    .line 864
    const/16 v2, 0x8f

    .line 865
    .line 866
    aput-object v1, v0, v2

    .line 867
    .line 868
    const-string v1, "add-int"

    .line 869
    .line 870
    const/16 v2, 0x90

    .line 871
    .line 872
    aput-object v1, v0, v2

    .line 873
    .line 874
    const-string v1, "sub-int"

    .line 875
    .line 876
    const/16 v2, 0x91

    .line 877
    .line 878
    aput-object v1, v0, v2

    .line 879
    .line 880
    const-string v1, "mul-int"

    .line 881
    .line 882
    const/16 v2, 0x92

    .line 883
    .line 884
    aput-object v1, v0, v2

    .line 885
    .line 886
    const-string v1, "div-int"

    .line 887
    .line 888
    const/16 v2, 0x93

    .line 889
    .line 890
    aput-object v1, v0, v2

    .line 891
    .line 892
    const-string v1, "rem-int"

    .line 893
    .line 894
    const/16 v2, 0x94

    .line 895
    .line 896
    aput-object v1, v0, v2

    .line 897
    .line 898
    const-string v1, "and-int"

    .line 899
    .line 900
    const/16 v2, 0x95

    .line 901
    .line 902
    aput-object v1, v0, v2

    .line 903
    .line 904
    const-string v1, "or-int"

    .line 905
    .line 906
    const/16 v2, 0x96

    .line 907
    .line 908
    aput-object v1, v0, v2

    .line 909
    .line 910
    const-string v1, "xor-int"

    .line 911
    .line 912
    const/16 v2, 0x97

    .line 913
    .line 914
    aput-object v1, v0, v2

    .line 915
    .line 916
    const-string v1, "shl-int"

    .line 917
    .line 918
    const/16 v2, 0x98

    .line 919
    .line 920
    aput-object v1, v0, v2

    .line 921
    .line 922
    const-string v1, "shr-int"

    .line 923
    .line 924
    const/16 v2, 0x99

    .line 925
    .line 926
    aput-object v1, v0, v2

    .line 927
    .line 928
    const-string v1, "ushr-int"

    .line 929
    .line 930
    const/16 v2, 0x9a

    .line 931
    .line 932
    aput-object v1, v0, v2

    .line 933
    .line 934
    const-string v1, "add-long"

    .line 935
    .line 936
    const/16 v2, 0x9b

    .line 937
    .line 938
    aput-object v1, v0, v2

    .line 939
    .line 940
    const-string v1, "sub-long"

    .line 941
    .line 942
    const/16 v2, 0x9c

    .line 943
    .line 944
    aput-object v1, v0, v2

    .line 945
    .line 946
    const-string v1, "mul-long"

    .line 947
    .line 948
    const/16 v2, 0x9d

    .line 949
    .line 950
    aput-object v1, v0, v2

    .line 951
    .line 952
    const-string v1, "div-long"

    .line 953
    .line 954
    const/16 v2, 0x9e

    .line 955
    .line 956
    aput-object v1, v0, v2

    .line 957
    .line 958
    const-string v1, "rem-long"

    .line 959
    .line 960
    const/16 v2, 0x9f

    .line 961
    .line 962
    aput-object v1, v0, v2

    .line 963
    .line 964
    const-string v1, "and-long"

    .line 965
    .line 966
    const/16 v2, 0xa0

    .line 967
    .line 968
    aput-object v1, v0, v2

    .line 969
    .line 970
    const-string v1, "or-long"

    .line 971
    .line 972
    const/16 v2, 0xa1

    .line 973
    .line 974
    aput-object v1, v0, v2

    .line 975
    .line 976
    const-string v1, "xor-long"

    .line 977
    .line 978
    const/16 v2, 0xa2

    .line 979
    .line 980
    aput-object v1, v0, v2

    .line 981
    .line 982
    const-string v1, "shl-long"

    .line 983
    .line 984
    const/16 v2, 0xa3

    .line 985
    .line 986
    aput-object v1, v0, v2

    .line 987
    .line 988
    const-string v1, "shr-long"

    .line 989
    .line 990
    const/16 v2, 0xa4

    .line 991
    .line 992
    aput-object v1, v0, v2

    .line 993
    .line 994
    const-string v1, "ushr-long"

    .line 995
    .line 996
    const/16 v2, 0xa5

    .line 997
    .line 998
    aput-object v1, v0, v2

    .line 999
    .line 1000
    const-string v1, "add-float"

    .line 1001
    .line 1002
    const/16 v2, 0xa6

    .line 1003
    .line 1004
    aput-object v1, v0, v2

    .line 1005
    .line 1006
    const-string v1, "sub-float"

    .line 1007
    .line 1008
    const/16 v2, 0xa7

    .line 1009
    .line 1010
    aput-object v1, v0, v2

    .line 1011
    .line 1012
    const-string v1, "mul-float"

    .line 1013
    .line 1014
    const/16 v2, 0xa8

    .line 1015
    .line 1016
    aput-object v1, v0, v2

    .line 1017
    .line 1018
    const-string v1, "div-float"

    .line 1019
    .line 1020
    const/16 v2, 0xa9

    .line 1021
    .line 1022
    aput-object v1, v0, v2

    .line 1023
    .line 1024
    const-string v1, "rem-float"

    .line 1025
    .line 1026
    const/16 v2, 0xaa

    .line 1027
    .line 1028
    aput-object v1, v0, v2

    .line 1029
    .line 1030
    const-string v1, "add-double"

    .line 1031
    .line 1032
    const/16 v2, 0xab

    .line 1033
    .line 1034
    aput-object v1, v0, v2

    .line 1035
    .line 1036
    const-string v1, "sub-double"

    .line 1037
    .line 1038
    const/16 v2, 0xac

    .line 1039
    .line 1040
    aput-object v1, v0, v2

    .line 1041
    .line 1042
    const-string v1, "mul-double"

    .line 1043
    .line 1044
    const/16 v2, 0xad

    .line 1045
    .line 1046
    aput-object v1, v0, v2

    .line 1047
    .line 1048
    const-string v1, "div-double"

    .line 1049
    .line 1050
    const/16 v2, 0xae

    .line 1051
    .line 1052
    aput-object v1, v0, v2

    .line 1053
    .line 1054
    const-string v1, "rem-double"

    .line 1055
    .line 1056
    const/16 v2, 0xaf

    .line 1057
    .line 1058
    aput-object v1, v0, v2

    .line 1059
    .line 1060
    const-string v1, "add-int/2addr"

    .line 1061
    .line 1062
    const/16 v2, 0xb0

    .line 1063
    .line 1064
    aput-object v1, v0, v2

    .line 1065
    .line 1066
    const-string v1, "sub-int/2addr"

    .line 1067
    .line 1068
    const/16 v2, 0xb1

    .line 1069
    .line 1070
    aput-object v1, v0, v2

    .line 1071
    .line 1072
    const-string v1, "mul-int/2addr"

    .line 1073
    .line 1074
    const/16 v2, 0xb2

    .line 1075
    .line 1076
    aput-object v1, v0, v2

    .line 1077
    .line 1078
    const-string v1, "div-int/2addr"

    .line 1079
    .line 1080
    const/16 v2, 0xb3

    .line 1081
    .line 1082
    aput-object v1, v0, v2

    .line 1083
    .line 1084
    const-string v1, "rem-int/2addr"

    .line 1085
    .line 1086
    const/16 v2, 0xb4

    .line 1087
    .line 1088
    aput-object v1, v0, v2

    .line 1089
    .line 1090
    const-string v1, "and-int/2addr"

    .line 1091
    .line 1092
    const/16 v2, 0xb5

    .line 1093
    .line 1094
    aput-object v1, v0, v2

    .line 1095
    .line 1096
    const-string v1, "or-int/2addr"

    .line 1097
    .line 1098
    const/16 v2, 0xb6

    .line 1099
    .line 1100
    aput-object v1, v0, v2

    .line 1101
    .line 1102
    const-string v1, "xor-int/2addr"

    .line 1103
    .line 1104
    const/16 v2, 0xb7

    .line 1105
    .line 1106
    aput-object v1, v0, v2

    .line 1107
    .line 1108
    const-string v1, "shl-int/2addr"

    .line 1109
    .line 1110
    const/16 v2, 0xb8

    .line 1111
    .line 1112
    aput-object v1, v0, v2

    .line 1113
    .line 1114
    const-string v1, "shr-int/2addr"

    .line 1115
    .line 1116
    const/16 v2, 0xb9

    .line 1117
    .line 1118
    aput-object v1, v0, v2

    .line 1119
    .line 1120
    const-string v1, "ushr-int/2addr"

    .line 1121
    .line 1122
    const/16 v2, 0xba

    .line 1123
    .line 1124
    aput-object v1, v0, v2

    .line 1125
    .line 1126
    const-string v1, "add-long/2addr"

    .line 1127
    .line 1128
    const/16 v2, 0xbb

    .line 1129
    .line 1130
    aput-object v1, v0, v2

    .line 1131
    .line 1132
    const-string v1, "sub-long/2addr"

    .line 1133
    .line 1134
    const/16 v2, 0xbc

    .line 1135
    .line 1136
    aput-object v1, v0, v2

    .line 1137
    .line 1138
    const-string v1, "mul-long/2addr"

    .line 1139
    .line 1140
    const/16 v2, 0xbd

    .line 1141
    .line 1142
    aput-object v1, v0, v2

    .line 1143
    .line 1144
    const-string v1, "div-long/2addr"

    .line 1145
    .line 1146
    const/16 v2, 0xbe

    .line 1147
    .line 1148
    aput-object v1, v0, v2

    .line 1149
    .line 1150
    const-string v1, "rem-long/2addr"

    .line 1151
    .line 1152
    const/16 v2, 0xbf

    .line 1153
    .line 1154
    aput-object v1, v0, v2

    .line 1155
    .line 1156
    const-string v1, "and-long/2addr"

    .line 1157
    .line 1158
    const/16 v2, 0xc0

    .line 1159
    .line 1160
    aput-object v1, v0, v2

    .line 1161
    .line 1162
    const-string v1, "or-long/2addr"

    .line 1163
    .line 1164
    const/16 v2, 0xc1

    .line 1165
    .line 1166
    aput-object v1, v0, v2

    .line 1167
    .line 1168
    const-string v1, "xor-long/2addr"

    .line 1169
    .line 1170
    const/16 v2, 0xc2

    .line 1171
    .line 1172
    aput-object v1, v0, v2

    .line 1173
    .line 1174
    const-string v1, "shl-long/2addr"

    .line 1175
    .line 1176
    const/16 v2, 0xc3

    .line 1177
    .line 1178
    aput-object v1, v0, v2

    .line 1179
    .line 1180
    const-string v1, "shr-long/2addr"

    .line 1181
    .line 1182
    const/16 v2, 0xc4

    .line 1183
    .line 1184
    aput-object v1, v0, v2

    .line 1185
    .line 1186
    const-string v1, "ushr-long/2addr"

    .line 1187
    .line 1188
    const/16 v2, 0xc5

    .line 1189
    .line 1190
    aput-object v1, v0, v2

    .line 1191
    .line 1192
    const-string v1, "add-float/2addr"

    .line 1193
    .line 1194
    const/16 v2, 0xc6

    .line 1195
    .line 1196
    aput-object v1, v0, v2

    .line 1197
    .line 1198
    const-string v1, "sub-float/2addr"

    .line 1199
    .line 1200
    const/16 v2, 0xc7

    .line 1201
    .line 1202
    aput-object v1, v0, v2

    .line 1203
    .line 1204
    const-string v1, "mul-float/2addr"

    .line 1205
    .line 1206
    const/16 v2, 0xc8

    .line 1207
    .line 1208
    aput-object v1, v0, v2

    .line 1209
    .line 1210
    const-string v1, "div-float/2addr"

    .line 1211
    .line 1212
    const/16 v2, 0xc9

    .line 1213
    .line 1214
    aput-object v1, v0, v2

    .line 1215
    .line 1216
    const-string v1, "rem-float/2addr"

    .line 1217
    .line 1218
    const/16 v2, 0xca

    .line 1219
    .line 1220
    aput-object v1, v0, v2

    .line 1221
    .line 1222
    const-string v1, "add-double/2addr"

    .line 1223
    .line 1224
    const/16 v2, 0xcb

    .line 1225
    .line 1226
    aput-object v1, v0, v2

    .line 1227
    .line 1228
    const-string v1, "sub-double/2addr"

    .line 1229
    .line 1230
    const/16 v2, 0xcc

    .line 1231
    .line 1232
    aput-object v1, v0, v2

    .line 1233
    .line 1234
    const-string v1, "mul-double/2addr"

    .line 1235
    .line 1236
    const/16 v2, 0xcd

    .line 1237
    .line 1238
    aput-object v1, v0, v2

    .line 1239
    .line 1240
    const-string v1, "div-double/2addr"

    .line 1241
    .line 1242
    const/16 v2, 0xce

    .line 1243
    .line 1244
    aput-object v1, v0, v2

    .line 1245
    .line 1246
    const-string v1, "rem-double/2addr"

    .line 1247
    .line 1248
    const/16 v2, 0xcf

    .line 1249
    .line 1250
    aput-object v1, v0, v2

    .line 1251
    .line 1252
    const-string v1, "add-int/lit16"

    .line 1253
    .line 1254
    const/16 v2, 0xd0

    .line 1255
    .line 1256
    aput-object v1, v0, v2

    .line 1257
    .line 1258
    const-string v1, "rsub-int"

    .line 1259
    .line 1260
    const/16 v2, 0xd1

    .line 1261
    .line 1262
    aput-object v1, v0, v2

    .line 1263
    .line 1264
    const-string v1, "mul-int/lit16"

    .line 1265
    .line 1266
    const/16 v2, 0xd2

    .line 1267
    .line 1268
    aput-object v1, v0, v2

    .line 1269
    .line 1270
    const-string v1, "div-int/lit16"

    .line 1271
    .line 1272
    const/16 v2, 0xd3

    .line 1273
    .line 1274
    aput-object v1, v0, v2

    .line 1275
    .line 1276
    const-string v1, "rem-int/lit16"

    .line 1277
    .line 1278
    const/16 v2, 0xd4

    .line 1279
    .line 1280
    aput-object v1, v0, v2

    .line 1281
    .line 1282
    const-string v1, "and-int/lit16"

    .line 1283
    .line 1284
    const/16 v2, 0xd5

    .line 1285
    .line 1286
    aput-object v1, v0, v2

    .line 1287
    .line 1288
    const-string v1, "or-int/lit16"

    .line 1289
    .line 1290
    const/16 v2, 0xd6

    .line 1291
    .line 1292
    aput-object v1, v0, v2

    .line 1293
    .line 1294
    const-string v1, "xor-int/lit16"

    .line 1295
    .line 1296
    const/16 v2, 0xd7

    .line 1297
    .line 1298
    aput-object v1, v0, v2

    .line 1299
    .line 1300
    const-string v1, "add-int/lit8"

    .line 1301
    .line 1302
    const/16 v2, 0xd8

    .line 1303
    .line 1304
    aput-object v1, v0, v2

    .line 1305
    .line 1306
    const-string v1, "rsub-int/lit8"

    .line 1307
    .line 1308
    const/16 v2, 0xd9

    .line 1309
    .line 1310
    aput-object v1, v0, v2

    .line 1311
    .line 1312
    const-string v1, "mul-int/lit8"

    .line 1313
    .line 1314
    const/16 v2, 0xda

    .line 1315
    .line 1316
    aput-object v1, v0, v2

    .line 1317
    .line 1318
    const-string v1, "div-int/lit8"

    .line 1319
    .line 1320
    const/16 v2, 0xdb

    .line 1321
    .line 1322
    aput-object v1, v0, v2

    .line 1323
    .line 1324
    const-string v1, "rem-int/lit8"

    .line 1325
    .line 1326
    const/16 v2, 0xdc

    .line 1327
    .line 1328
    aput-object v1, v0, v2

    .line 1329
    .line 1330
    const-string v1, "and-int/lit8"

    .line 1331
    .line 1332
    const/16 v2, 0xdd

    .line 1333
    .line 1334
    aput-object v1, v0, v2

    .line 1335
    .line 1336
    const-string v1, "or-int/lit8"

    .line 1337
    .line 1338
    const/16 v2, 0xde

    .line 1339
    .line 1340
    aput-object v1, v0, v2

    .line 1341
    .line 1342
    const-string v1, "xor-int/lit8"

    .line 1343
    .line 1344
    const/16 v2, 0xdf

    .line 1345
    .line 1346
    aput-object v1, v0, v2

    .line 1347
    .line 1348
    const-string v1, "shl-int/lit8"

    .line 1349
    .line 1350
    const/16 v2, 0xe0

    .line 1351
    .line 1352
    aput-object v1, v0, v2

    .line 1353
    .line 1354
    const-string v1, "shr-int/lit8"

    .line 1355
    .line 1356
    const/16 v2, 0xe1

    .line 1357
    .line 1358
    aput-object v1, v0, v2

    .line 1359
    .line 1360
    const-string v1, "ushr-int/lit8"

    .line 1361
    .line 1362
    const/16 v2, 0xe2

    .line 1363
    .line 1364
    aput-object v1, v0, v2

    .line 1365
    .line 1366
    const-string v1, "iget-quick"

    .line 1367
    .line 1368
    const/16 v2, 0xe3

    .line 1369
    .line 1370
    aput-object v1, v0, v2

    .line 1371
    .line 1372
    const-string v1, "iget-wide-quick"

    .line 1373
    .line 1374
    const/16 v2, 0xe4

    .line 1375
    .line 1376
    aput-object v1, v0, v2

    .line 1377
    .line 1378
    const-string v1, "iget-object-quick"

    .line 1379
    .line 1380
    const/16 v2, 0xe5

    .line 1381
    .line 1382
    aput-object v1, v0, v2

    .line 1383
    .line 1384
    const-string v1, "iput-quick"

    .line 1385
    .line 1386
    const/16 v2, 0xe6

    .line 1387
    .line 1388
    aput-object v1, v0, v2

    .line 1389
    .line 1390
    const-string v1, "iput-wide-quick"

    .line 1391
    .line 1392
    const/16 v2, 0xe7

    .line 1393
    .line 1394
    aput-object v1, v0, v2

    .line 1395
    .line 1396
    const-string v1, "iput-object-quick"

    .line 1397
    .line 1398
    const/16 v2, 0xe8

    .line 1399
    .line 1400
    aput-object v1, v0, v2

    .line 1401
    .line 1402
    const-string v1, "invoke-virtual-quick"

    .line 1403
    .line 1404
    const/16 v2, 0xe9

    .line 1405
    .line 1406
    aput-object v1, v0, v2

    .line 1407
    .line 1408
    const-string v1, "invoke-virtual/range-quick"

    .line 1409
    .line 1410
    const/16 v2, 0xea

    .line 1411
    .line 1412
    aput-object v1, v0, v2

    .line 1413
    .line 1414
    const-string v1, "iput-boolean-quick"

    .line 1415
    .line 1416
    const/16 v2, 0xeb

    .line 1417
    .line 1418
    aput-object v1, v0, v2

    .line 1419
    .line 1420
    const-string v1, "iput-byte-quick"

    .line 1421
    .line 1422
    const/16 v2, 0xec

    .line 1423
    .line 1424
    aput-object v1, v0, v2

    .line 1425
    .line 1426
    const-string v1, "iput-char-quick"

    .line 1427
    .line 1428
    const/16 v2, 0xed

    .line 1429
    .line 1430
    aput-object v1, v0, v2

    .line 1431
    .line 1432
    const-string v1, "iput-short-quick"

    .line 1433
    .line 1434
    const/16 v2, 0xee

    .line 1435
    .line 1436
    aput-object v1, v0, v2

    .line 1437
    .line 1438
    const-string v1, "iget-boolean-quick"

    .line 1439
    .line 1440
    const/16 v2, 0xef

    .line 1441
    .line 1442
    aput-object v1, v0, v2

    .line 1443
    .line 1444
    const-string v1, "iget-byte-quick"

    .line 1445
    .line 1446
    const/16 v2, 0xf0

    .line 1447
    .line 1448
    aput-object v1, v0, v2

    .line 1449
    .line 1450
    const-string v1, "iget-char-quick"

    .line 1451
    .line 1452
    const/16 v2, 0xf1

    .line 1453
    .line 1454
    aput-object v1, v0, v2

    .line 1455
    .line 1456
    const-string v1, "iget-short-quick"

    .line 1457
    .line 1458
    const/16 v2, 0xf2

    .line 1459
    .line 1460
    aput-object v1, v0, v2

    .line 1461
    .line 1462
    const-string v1, "unused-f3"

    .line 1463
    .line 1464
    const/16 v2, 0xf3

    .line 1465
    .line 1466
    aput-object v1, v0, v2

    .line 1467
    .line 1468
    const-string v1, "unused-f4"

    .line 1469
    .line 1470
    const/16 v2, 0xf4

    .line 1471
    .line 1472
    aput-object v1, v0, v2

    .line 1473
    .line 1474
    const-string v1, "unused-f5"

    .line 1475
    .line 1476
    const/16 v2, 0xf5

    .line 1477
    .line 1478
    aput-object v1, v0, v2

    .line 1479
    .line 1480
    const-string v1, "unused-f6"

    .line 1481
    .line 1482
    const/16 v2, 0xf6

    .line 1483
    .line 1484
    aput-object v1, v0, v2

    .line 1485
    .line 1486
    const-string v1, "unused-f7"

    .line 1487
    .line 1488
    const/16 v2, 0xf7

    .line 1489
    .line 1490
    aput-object v1, v0, v2

    .line 1491
    .line 1492
    const-string v1, "unused-f8"

    .line 1493
    .line 1494
    const/16 v2, 0xf8

    .line 1495
    .line 1496
    aput-object v1, v0, v2

    .line 1497
    .line 1498
    const-string v1, "unused-f9"

    .line 1499
    .line 1500
    const/16 v2, 0xf9

    .line 1501
    .line 1502
    aput-object v1, v0, v2

    .line 1503
    .line 1504
    const-string v1, "invoke-polymorphic"

    .line 1505
    .line 1506
    const/16 v2, 0xfa

    .line 1507
    .line 1508
    aput-object v1, v0, v2

    .line 1509
    .line 1510
    const-string v1, "invoke-polymorphic/range"

    .line 1511
    .line 1512
    const/16 v2, 0xfb

    .line 1513
    .line 1514
    aput-object v1, v0, v2

    .line 1515
    .line 1516
    const-string v1, "invoke-custom"

    .line 1517
    .line 1518
    const/16 v2, 0xfc

    .line 1519
    .line 1520
    aput-object v1, v0, v2

    .line 1521
    .line 1522
    const-string v1, "invoke-custom/range"

    .line 1523
    .line 1524
    const/16 v2, 0xfd

    .line 1525
    .line 1526
    aput-object v1, v0, v2

    .line 1527
    .line 1528
    const-string v1, "const-method-handle"

    .line 1529
    .line 1530
    const/16 v2, 0xfe

    .line 1531
    .line 1532
    aput-object v1, v0, v2

    .line 1533
    .line 1534
    const-string v1, "const-method-type"

    .line 1535
    .line 1536
    const/16 v2, 0xff

    .line 1537
    .line 1538
    aput-object v1, v0, v2

    .line 1539
    .line 1540
    sput-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil;->opFormat:[Ljava/lang/String;

    .line 1541
    .line 1542
    sget-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2;->INSTANCE:Lorg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2;

    .line 1543
    .line 1544
    invoke-static {v0}, Li5;->Q0(Lj5;)Lmd;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v0

    .line 1548
    sput-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil;->opFormatMap$delegate:Le9;

    .line 1549
    .line 1550
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getOpFormat$p()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil;->opFormat:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getOpCode(Ljava/lang/String;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil;->INSTANCE:Lorg/luckypray/dexkit/util/OpCodeUtil;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/util/OpCodeUtil;->getOpFormatMap()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Integer;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v2, "opFormat: "

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p0, " is not found"

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method

.method public static final getOpFormat(I)Ljava/lang/String;
    .locals 3

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil;->opFormat:[Ljava/lang/String;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    if-ge p0, v1, :cond_0

    .line 7
    .line 8
    aget-object p0, v0, p0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const/16 v1, 0x10

    .line 14
    .line 15
    invoke-static {p0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "opcode: "

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, " is out of range"

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method

.method private final getOpFormatMap()Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p0, Lorg/luckypray/dexkit/util/OpCodeUtil;->opFormatMap$delegate:Le9;

    .line 2
    .line 3
    invoke-interface {p0}, Le9;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/Map;

    .line 8
    .line 9
    return-object p0
.end method
