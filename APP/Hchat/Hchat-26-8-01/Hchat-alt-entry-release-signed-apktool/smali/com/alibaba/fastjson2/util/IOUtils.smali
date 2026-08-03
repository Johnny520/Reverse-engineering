.class public Lcom/alibaba/fastjson2/util/IOUtils;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final CA:[C

.field public static final DIGITS_K:[I

.field static final IA:[I

.field private static final MIN_INT_BYTES:[B

.field private static final MIN_INT_CHARS:[C

.field private static final MIN_LONG:[B

.field public static final PACKED_DIGITS:[S

.field public static final PACKED_DIGITS_UTF16:[I

.field static final sizeTable:[I


# direct methods
.method static constructor <clinit>()V
    .locals 44

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Lcom/alibaba/fastjson2/util/IOUtils;->sizeTable:[I

    .line 9
    .line 10
    const/16 v1, 0x3e8

    .line 11
    .line 12
    new-array v1, v1, [I

    .line 13
    .line 14
    sput-object v1, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 15
    .line 16
    const-string v1, "-2147483648"

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    sput-object v2, Lcom/alibaba/fastjson2/util/IOUtils;->MIN_INT_BYTES:[B

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sput-object v1, Lcom/alibaba/fastjson2/util/IOUtils;->MIN_INT_CHARS:[C

    .line 29
    .line 30
    const-string v1, "-9223372036854775808"

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    sput-object v1, Lcom/alibaba/fastjson2/util/IOUtils;->MIN_LONG:[B

    .line 37
    .line 38
    const-string v1, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sput-object v1, Lcom/alibaba/fastjson2/util/IOUtils;->CA:[C

    .line 45
    .line 46
    const/16 v1, 0x100

    .line 47
    .line 48
    new-array v1, v1, [I

    .line 49
    .line 50
    sput-object v1, Lcom/alibaba/fastjson2/util/IOUtils;->IA:[I

    .line 51
    .line 52
    const/16 v1, 0x64

    .line 53
    .line 54
    new-array v2, v1, [S

    .line 55
    .line 56
    const/16 v3, 0x3030

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    aput-short v3, v2, v4

    .line 60
    .line 61
    const/16 v3, 0x3130

    .line 62
    .line 63
    const/4 v5, 0x1

    .line 64
    aput-short v3, v2, v5

    .line 65
    .line 66
    const/16 v3, 0x3230

    .line 67
    .line 68
    const/4 v6, 0x2

    .line 69
    aput-short v3, v2, v6

    .line 70
    .line 71
    const/16 v3, 0x3330

    .line 72
    .line 73
    const/4 v7, 0x3

    .line 74
    aput-short v3, v2, v7

    .line 75
    .line 76
    const/16 v3, 0x3430

    .line 77
    .line 78
    const/4 v8, 0x4

    .line 79
    aput-short v3, v2, v8

    .line 80
    .line 81
    const/16 v3, 0x3530

    .line 82
    .line 83
    const/4 v9, 0x5

    .line 84
    aput-short v3, v2, v9

    .line 85
    .line 86
    const/16 v3, 0x3630

    .line 87
    .line 88
    const/4 v10, 0x6

    .line 89
    aput-short v3, v2, v10

    .line 90
    .line 91
    const/16 v3, 0x3730

    .line 92
    .line 93
    const/4 v11, 0x7

    .line 94
    aput-short v3, v2, v11

    .line 95
    .line 96
    const/16 v3, 0x3830

    .line 97
    .line 98
    const/16 v12, 0x8

    .line 99
    .line 100
    aput-short v3, v2, v12

    .line 101
    .line 102
    const/16 v3, 0x3930

    .line 103
    .line 104
    const/16 v13, 0x9

    .line 105
    .line 106
    aput-short v3, v2, v13

    .line 107
    .line 108
    const/16 v3, 0x3031

    .line 109
    .line 110
    aput-short v3, v2, v0

    .line 111
    .line 112
    const/16 v3, 0x3131

    .line 113
    .line 114
    const/16 v14, 0xb

    .line 115
    .line 116
    aput-short v3, v2, v14

    .line 117
    .line 118
    const/16 v3, 0x3231

    .line 119
    .line 120
    const/16 v15, 0xc

    .line 121
    .line 122
    aput-short v3, v2, v15

    .line 123
    .line 124
    const/16 v3, 0x3331

    .line 125
    .line 126
    const/16 v16, 0xd

    .line 127
    .line 128
    aput-short v3, v2, v16

    .line 129
    .line 130
    const/16 v3, 0x3431

    .line 131
    .line 132
    const/16 v17, 0xe

    .line 133
    .line 134
    aput-short v3, v2, v17

    .line 135
    .line 136
    const/16 v3, 0x3531

    .line 137
    .line 138
    const/16 v18, 0xf

    .line 139
    .line 140
    aput-short v3, v2, v18

    .line 141
    .line 142
    const/16 v3, 0x3631

    .line 143
    .line 144
    const/16 v19, 0x10

    .line 145
    .line 146
    aput-short v3, v2, v19

    .line 147
    .line 148
    const/16 v3, 0x3731

    .line 149
    .line 150
    const/16 v20, 0x11

    .line 151
    .line 152
    aput-short v3, v2, v20

    .line 153
    .line 154
    const/16 v3, 0x3831

    .line 155
    .line 156
    const/16 v21, 0x12

    .line 157
    .line 158
    aput-short v3, v2, v21

    .line 159
    .line 160
    const/16 v3, 0x3931

    .line 161
    .line 162
    const/16 v22, 0x13

    .line 163
    .line 164
    aput-short v3, v2, v22

    .line 165
    .line 166
    const/16 v3, 0x3032

    .line 167
    .line 168
    const/16 v23, 0x14

    .line 169
    .line 170
    aput-short v3, v2, v23

    .line 171
    .line 172
    const/16 v3, 0x3132

    .line 173
    .line 174
    const/16 v24, 0x15

    .line 175
    .line 176
    aput-short v3, v2, v24

    .line 177
    .line 178
    const/16 v3, 0x3232

    .line 179
    .line 180
    const/16 v25, 0x16

    .line 181
    .line 182
    aput-short v3, v2, v25

    .line 183
    .line 184
    const/16 v3, 0x3332

    .line 185
    .line 186
    const/16 v26, 0x17

    .line 187
    .line 188
    aput-short v3, v2, v26

    .line 189
    .line 190
    const/16 v3, 0x3432

    .line 191
    .line 192
    const/16 v27, 0x18

    .line 193
    .line 194
    aput-short v3, v2, v27

    .line 195
    .line 196
    const/16 v3, 0x3532

    .line 197
    .line 198
    const/16 v28, 0x19

    .line 199
    .line 200
    aput-short v3, v2, v28

    .line 201
    .line 202
    const/16 v3, 0x3632

    .line 203
    .line 204
    const/16 v29, 0x1a

    .line 205
    .line 206
    aput-short v3, v2, v29

    .line 207
    .line 208
    const/16 v3, 0x3732

    .line 209
    .line 210
    const/16 v30, 0x1b

    .line 211
    .line 212
    aput-short v3, v2, v30

    .line 213
    .line 214
    const/16 v3, 0x3832

    .line 215
    .line 216
    const/16 v31, 0x1c

    .line 217
    .line 218
    aput-short v3, v2, v31

    .line 219
    .line 220
    const/16 v3, 0x3932

    .line 221
    .line 222
    const/16 v32, 0x1d

    .line 223
    .line 224
    aput-short v3, v2, v32

    .line 225
    .line 226
    const/16 v3, 0x3033

    .line 227
    .line 228
    const/16 v33, 0x1e

    .line 229
    .line 230
    aput-short v3, v2, v33

    .line 231
    .line 232
    const/16 v3, 0x3133

    .line 233
    .line 234
    const/16 v34, 0x1f

    .line 235
    .line 236
    aput-short v3, v2, v34

    .line 237
    .line 238
    const/16 v3, 0x3233

    .line 239
    .line 240
    const/16 v35, 0x20

    .line 241
    .line 242
    aput-short v3, v2, v35

    .line 243
    .line 244
    const/16 v3, 0x3333

    .line 245
    .line 246
    const/16 v36, 0x21

    .line 247
    .line 248
    aput-short v3, v2, v36

    .line 249
    .line 250
    const/16 v3, 0x3433

    .line 251
    .line 252
    const/16 v37, 0x22

    .line 253
    .line 254
    aput-short v3, v2, v37

    .line 255
    .line 256
    const/16 v3, 0x3533

    .line 257
    .line 258
    const/16 v38, 0x23

    .line 259
    .line 260
    aput-short v3, v2, v38

    .line 261
    .line 262
    const/16 v3, 0x3633

    .line 263
    .line 264
    const/16 v39, 0x24

    .line 265
    .line 266
    aput-short v3, v2, v39

    .line 267
    .line 268
    const/16 v3, 0x25

    .line 269
    .line 270
    const/16 v40, 0x3733

    .line 271
    .line 272
    aput-short v40, v2, v3

    .line 273
    .line 274
    const/16 v3, 0x26

    .line 275
    .line 276
    const/16 v40, 0x3833

    .line 277
    .line 278
    aput-short v40, v2, v3

    .line 279
    .line 280
    const/16 v3, 0x27

    .line 281
    .line 282
    const/16 v40, 0x3933

    .line 283
    .line 284
    aput-short v40, v2, v3

    .line 285
    .line 286
    const/16 v3, 0x28

    .line 287
    .line 288
    const/16 v40, 0x3034

    .line 289
    .line 290
    aput-short v40, v2, v3

    .line 291
    .line 292
    const/16 v3, 0x29

    .line 293
    .line 294
    const/16 v40, 0x3134

    .line 295
    .line 296
    aput-short v40, v2, v3

    .line 297
    .line 298
    const/16 v3, 0x2a

    .line 299
    .line 300
    const/16 v40, 0x3234

    .line 301
    .line 302
    aput-short v40, v2, v3

    .line 303
    .line 304
    const/16 v3, 0x2b

    .line 305
    .line 306
    const/16 v40, 0x3334

    .line 307
    .line 308
    aput-short v40, v2, v3

    .line 309
    .line 310
    const/16 v3, 0x2c

    .line 311
    .line 312
    const/16 v40, 0x3434

    .line 313
    .line 314
    aput-short v40, v2, v3

    .line 315
    .line 316
    const/16 v3, 0x2d

    .line 317
    .line 318
    const/16 v40, 0x3534

    .line 319
    .line 320
    aput-short v40, v2, v3

    .line 321
    .line 322
    const/16 v3, 0x2e

    .line 323
    .line 324
    const/16 v40, 0x3634

    .line 325
    .line 326
    aput-short v40, v2, v3

    .line 327
    .line 328
    const/16 v3, 0x2f

    .line 329
    .line 330
    const/16 v40, 0x3734

    .line 331
    .line 332
    aput-short v40, v2, v3

    .line 333
    .line 334
    const/16 v3, 0x3834

    .line 335
    .line 336
    const/16 v40, 0x30

    .line 337
    .line 338
    aput-short v3, v2, v40

    .line 339
    .line 340
    const/16 v3, 0x31

    .line 341
    .line 342
    const/16 v41, 0x3934

    .line 343
    .line 344
    aput-short v41, v2, v3

    .line 345
    .line 346
    const/16 v3, 0x32

    .line 347
    .line 348
    const/16 v41, 0x3035

    .line 349
    .line 350
    aput-short v41, v2, v3

    .line 351
    .line 352
    const/16 v3, 0x33

    .line 353
    .line 354
    const/16 v41, 0x3135

    .line 355
    .line 356
    aput-short v41, v2, v3

    .line 357
    .line 358
    const/16 v3, 0x34

    .line 359
    .line 360
    const/16 v41, 0x3235

    .line 361
    .line 362
    aput-short v41, v2, v3

    .line 363
    .line 364
    const/16 v3, 0x35

    .line 365
    .line 366
    const/16 v41, 0x3335

    .line 367
    .line 368
    aput-short v41, v2, v3

    .line 369
    .line 370
    const/16 v3, 0x36

    .line 371
    .line 372
    const/16 v41, 0x3435

    .line 373
    .line 374
    aput-short v41, v2, v3

    .line 375
    .line 376
    const/16 v3, 0x37

    .line 377
    .line 378
    const/16 v41, 0x3535

    .line 379
    .line 380
    aput-short v41, v2, v3

    .line 381
    .line 382
    const/16 v3, 0x38

    .line 383
    .line 384
    const/16 v41, 0x3635

    .line 385
    .line 386
    aput-short v41, v2, v3

    .line 387
    .line 388
    const/16 v3, 0x39

    .line 389
    .line 390
    const/16 v41, 0x3735

    .line 391
    .line 392
    aput-short v41, v2, v3

    .line 393
    .line 394
    const/16 v3, 0x3a

    .line 395
    .line 396
    const/16 v41, 0x3835

    .line 397
    .line 398
    aput-short v41, v2, v3

    .line 399
    .line 400
    const/16 v3, 0x3b

    .line 401
    .line 402
    const/16 v41, 0x3935

    .line 403
    .line 404
    aput-short v41, v2, v3

    .line 405
    .line 406
    const/16 v3, 0x3c

    .line 407
    .line 408
    const/16 v41, 0x3036

    .line 409
    .line 410
    aput-short v41, v2, v3

    .line 411
    .line 412
    const/16 v3, 0x3136

    .line 413
    .line 414
    const/16 v41, 0x3d

    .line 415
    .line 416
    aput-short v3, v2, v41

    .line 417
    .line 418
    const/16 v3, 0x3e

    .line 419
    .line 420
    const/16 v42, 0x3236

    .line 421
    .line 422
    aput-short v42, v2, v3

    .line 423
    .line 424
    const/16 v3, 0x3f

    .line 425
    .line 426
    const/16 v42, 0x3336

    .line 427
    .line 428
    aput-short v42, v2, v3

    .line 429
    .line 430
    const/16 v3, 0x40

    .line 431
    .line 432
    const/16 v42, 0x3436

    .line 433
    .line 434
    aput-short v42, v2, v3

    .line 435
    .line 436
    const/16 v3, 0x41

    .line 437
    .line 438
    const/16 v42, 0x3536

    .line 439
    .line 440
    aput-short v42, v2, v3

    .line 441
    .line 442
    const/16 v3, 0x42

    .line 443
    .line 444
    const/16 v42, 0x3636

    .line 445
    .line 446
    aput-short v42, v2, v3

    .line 447
    .line 448
    const/16 v3, 0x43

    .line 449
    .line 450
    const/16 v42, 0x3736

    .line 451
    .line 452
    aput-short v42, v2, v3

    .line 453
    .line 454
    const/16 v3, 0x44

    .line 455
    .line 456
    const/16 v42, 0x3836

    .line 457
    .line 458
    aput-short v42, v2, v3

    .line 459
    .line 460
    const/16 v3, 0x45

    .line 461
    .line 462
    const/16 v42, 0x3936

    .line 463
    .line 464
    aput-short v42, v2, v3

    .line 465
    .line 466
    const/16 v3, 0x46

    .line 467
    .line 468
    const/16 v42, 0x3037

    .line 469
    .line 470
    aput-short v42, v2, v3

    .line 471
    .line 472
    const/16 v3, 0x47

    .line 473
    .line 474
    const/16 v42, 0x3137

    .line 475
    .line 476
    aput-short v42, v2, v3

    .line 477
    .line 478
    const/16 v3, 0x48

    .line 479
    .line 480
    const/16 v42, 0x3237

    .line 481
    .line 482
    aput-short v42, v2, v3

    .line 483
    .line 484
    const/16 v3, 0x49

    .line 485
    .line 486
    const/16 v42, 0x3337

    .line 487
    .line 488
    aput-short v42, v2, v3

    .line 489
    .line 490
    const/16 v3, 0x4a

    .line 491
    .line 492
    const/16 v42, 0x3437

    .line 493
    .line 494
    aput-short v42, v2, v3

    .line 495
    .line 496
    const/16 v3, 0x4b

    .line 497
    .line 498
    const/16 v42, 0x3537

    .line 499
    .line 500
    aput-short v42, v2, v3

    .line 501
    .line 502
    const/16 v3, 0x4c

    .line 503
    .line 504
    const/16 v42, 0x3637

    .line 505
    .line 506
    aput-short v42, v2, v3

    .line 507
    .line 508
    const/16 v3, 0x4d

    .line 509
    .line 510
    const/16 v42, 0x3737

    .line 511
    .line 512
    aput-short v42, v2, v3

    .line 513
    .line 514
    const/16 v3, 0x4e

    .line 515
    .line 516
    const/16 v42, 0x3837

    .line 517
    .line 518
    aput-short v42, v2, v3

    .line 519
    .line 520
    const/16 v3, 0x4f

    .line 521
    .line 522
    const/16 v42, 0x3937

    .line 523
    .line 524
    aput-short v42, v2, v3

    .line 525
    .line 526
    const/16 v3, 0x50

    .line 527
    .line 528
    const/16 v42, 0x3038

    .line 529
    .line 530
    aput-short v42, v2, v3

    .line 531
    .line 532
    const/16 v3, 0x51

    .line 533
    .line 534
    const/16 v42, 0x3138

    .line 535
    .line 536
    aput-short v42, v2, v3

    .line 537
    .line 538
    const/16 v3, 0x52

    .line 539
    .line 540
    const/16 v42, 0x3238

    .line 541
    .line 542
    aput-short v42, v2, v3

    .line 543
    .line 544
    const/16 v3, 0x53

    .line 545
    .line 546
    const/16 v42, 0x3338

    .line 547
    .line 548
    aput-short v42, v2, v3

    .line 549
    .line 550
    const/16 v3, 0x54

    .line 551
    .line 552
    const/16 v42, 0x3438

    .line 553
    .line 554
    aput-short v42, v2, v3

    .line 555
    .line 556
    const/16 v3, 0x55

    .line 557
    .line 558
    const/16 v42, 0x3538

    .line 559
    .line 560
    aput-short v42, v2, v3

    .line 561
    .line 562
    const/16 v3, 0x56

    .line 563
    .line 564
    const/16 v42, 0x3638

    .line 565
    .line 566
    aput-short v42, v2, v3

    .line 567
    .line 568
    const/16 v3, 0x57

    .line 569
    .line 570
    const/16 v42, 0x3738

    .line 571
    .line 572
    aput-short v42, v2, v3

    .line 573
    .line 574
    const/16 v3, 0x58

    .line 575
    .line 576
    const/16 v42, 0x3838

    .line 577
    .line 578
    aput-short v42, v2, v3

    .line 579
    .line 580
    const/16 v3, 0x59

    .line 581
    .line 582
    const/16 v42, 0x3938

    .line 583
    .line 584
    aput-short v42, v2, v3

    .line 585
    .line 586
    const/16 v3, 0x5a

    .line 587
    .line 588
    const/16 v42, 0x3039

    .line 589
    .line 590
    aput-short v42, v2, v3

    .line 591
    .line 592
    const/16 v3, 0x5b

    .line 593
    .line 594
    const/16 v42, 0x3139

    .line 595
    .line 596
    aput-short v42, v2, v3

    .line 597
    .line 598
    const/16 v3, 0x5c

    .line 599
    .line 600
    const/16 v42, 0x3239

    .line 601
    .line 602
    aput-short v42, v2, v3

    .line 603
    .line 604
    const/16 v3, 0x5d

    .line 605
    .line 606
    const/16 v42, 0x3339

    .line 607
    .line 608
    aput-short v42, v2, v3

    .line 609
    .line 610
    const/16 v3, 0x5e

    .line 611
    .line 612
    const/16 v42, 0x3439

    .line 613
    .line 614
    aput-short v42, v2, v3

    .line 615
    .line 616
    const/16 v3, 0x5f

    .line 617
    .line 618
    const/16 v42, 0x3539

    .line 619
    .line 620
    aput-short v42, v2, v3

    .line 621
    .line 622
    const/16 v3, 0x60

    .line 623
    .line 624
    const/16 v42, 0x3639

    .line 625
    .line 626
    aput-short v42, v2, v3

    .line 627
    .line 628
    const/16 v3, 0x61

    .line 629
    .line 630
    const/16 v42, 0x3739

    .line 631
    .line 632
    aput-short v42, v2, v3

    .line 633
    .line 634
    const/16 v3, 0x62

    .line 635
    .line 636
    const/16 v42, 0x3839

    .line 637
    .line 638
    aput-short v42, v2, v3

    .line 639
    .line 640
    const/16 v3, 0x3939

    .line 641
    .line 642
    const/16 v42, 0x63

    .line 643
    .line 644
    aput-short v3, v2, v42

    .line 645
    .line 646
    new-array v3, v1, [I

    .line 647
    .line 648
    const v43, 0x300030

    .line 649
    .line 650
    .line 651
    aput v43, v3, v4

    .line 652
    .line 653
    const v43, 0x310030    # 4.500007E-39f

    .line 654
    .line 655
    .line 656
    aput v43, v3, v5

    .line 657
    .line 658
    const v5, 0x320030

    .line 659
    .line 660
    .line 661
    aput v5, v3, v6

    .line 662
    .line 663
    const v5, 0x330030

    .line 664
    .line 665
    .line 666
    aput v5, v3, v7

    .line 667
    .line 668
    const v5, 0x340030

    .line 669
    .line 670
    .line 671
    aput v5, v3, v8

    .line 672
    .line 673
    const v5, 0x350030

    .line 674
    .line 675
    .line 676
    aput v5, v3, v9

    .line 677
    .line 678
    const v5, 0x360030

    .line 679
    .line 680
    .line 681
    aput v5, v3, v10

    .line 682
    .line 683
    const v5, 0x370030

    .line 684
    .line 685
    .line 686
    aput v5, v3, v11

    .line 687
    .line 688
    const v5, 0x380030

    .line 689
    .line 690
    .line 691
    aput v5, v3, v12

    .line 692
    .line 693
    const v5, 0x390030

    .line 694
    .line 695
    .line 696
    aput v5, v3, v13

    .line 697
    .line 698
    const v5, 0x300031

    .line 699
    .line 700
    .line 701
    aput v5, v3, v0

    .line 702
    .line 703
    const v5, 0x310031    # 4.500008E-39f

    .line 704
    .line 705
    .line 706
    aput v5, v3, v14

    .line 707
    .line 708
    const v5, 0x320031

    .line 709
    .line 710
    .line 711
    aput v5, v3, v15

    .line 712
    .line 713
    const v5, 0x330031

    .line 714
    .line 715
    .line 716
    aput v5, v3, v16

    .line 717
    .line 718
    const v5, 0x340031

    .line 719
    .line 720
    .line 721
    aput v5, v3, v17

    .line 722
    .line 723
    const v5, 0x350031

    .line 724
    .line 725
    .line 726
    aput v5, v3, v18

    .line 727
    .line 728
    const v5, 0x360031

    .line 729
    .line 730
    .line 731
    aput v5, v3, v19

    .line 732
    .line 733
    const v5, 0x370031

    .line 734
    .line 735
    .line 736
    aput v5, v3, v20

    .line 737
    .line 738
    const v5, 0x380031

    .line 739
    .line 740
    .line 741
    aput v5, v3, v21

    .line 742
    .line 743
    const v5, 0x390031

    .line 744
    .line 745
    .line 746
    aput v5, v3, v22

    .line 747
    .line 748
    const v5, 0x300032

    .line 749
    .line 750
    .line 751
    aput v5, v3, v23

    .line 752
    .line 753
    const v5, 0x310032    # 4.50001E-39f

    .line 754
    .line 755
    .line 756
    aput v5, v3, v24

    .line 757
    .line 758
    const v5, 0x320032

    .line 759
    .line 760
    .line 761
    aput v5, v3, v25

    .line 762
    .line 763
    const v5, 0x330032

    .line 764
    .line 765
    .line 766
    aput v5, v3, v26

    .line 767
    .line 768
    const v5, 0x340032

    .line 769
    .line 770
    .line 771
    aput v5, v3, v27

    .line 772
    .line 773
    const v5, 0x350032

    .line 774
    .line 775
    .line 776
    aput v5, v3, v28

    .line 777
    .line 778
    const v5, 0x360032

    .line 779
    .line 780
    .line 781
    aput v5, v3, v29

    .line 782
    .line 783
    const v5, 0x370032

    .line 784
    .line 785
    .line 786
    aput v5, v3, v30

    .line 787
    .line 788
    const v5, 0x380032

    .line 789
    .line 790
    .line 791
    aput v5, v3, v31

    .line 792
    .line 793
    const v5, 0x390032

    .line 794
    .line 795
    .line 796
    aput v5, v3, v32

    .line 797
    .line 798
    const v5, 0x300033

    .line 799
    .line 800
    .line 801
    aput v5, v3, v33

    .line 802
    .line 803
    const v5, 0x310033    # 4.500011E-39f

    .line 804
    .line 805
    .line 806
    aput v5, v3, v34

    .line 807
    .line 808
    const v5, 0x320033

    .line 809
    .line 810
    .line 811
    aput v5, v3, v35

    .line 812
    .line 813
    const v5, 0x330033

    .line 814
    .line 815
    .line 816
    aput v5, v3, v36

    .line 817
    .line 818
    const v5, 0x340033

    .line 819
    .line 820
    .line 821
    aput v5, v3, v37

    .line 822
    .line 823
    const v5, 0x350033

    .line 824
    .line 825
    .line 826
    aput v5, v3, v38

    .line 827
    .line 828
    const v5, 0x360033

    .line 829
    .line 830
    .line 831
    aput v5, v3, v39

    .line 832
    .line 833
    const/16 v5, 0x25

    .line 834
    .line 835
    const v6, 0x370033

    .line 836
    .line 837
    .line 838
    aput v6, v3, v5

    .line 839
    .line 840
    const/16 v5, 0x26

    .line 841
    .line 842
    const v6, 0x380033

    .line 843
    .line 844
    .line 845
    aput v6, v3, v5

    .line 846
    .line 847
    const/16 v5, 0x27

    .line 848
    .line 849
    const v6, 0x390033

    .line 850
    .line 851
    .line 852
    aput v6, v3, v5

    .line 853
    .line 854
    const/16 v5, 0x28

    .line 855
    .line 856
    const v6, 0x300034

    .line 857
    .line 858
    .line 859
    aput v6, v3, v5

    .line 860
    .line 861
    const/16 v5, 0x29

    .line 862
    .line 863
    const v6, 0x310034    # 4.500012E-39f

    .line 864
    .line 865
    .line 866
    aput v6, v3, v5

    .line 867
    .line 868
    const/16 v5, 0x2a

    .line 869
    .line 870
    const v6, 0x320034

    .line 871
    .line 872
    .line 873
    aput v6, v3, v5

    .line 874
    .line 875
    const/16 v5, 0x2b

    .line 876
    .line 877
    const v6, 0x330034

    .line 878
    .line 879
    .line 880
    aput v6, v3, v5

    .line 881
    .line 882
    const/16 v5, 0x2c

    .line 883
    .line 884
    const v6, 0x340034

    .line 885
    .line 886
    .line 887
    aput v6, v3, v5

    .line 888
    .line 889
    const/16 v5, 0x2d

    .line 890
    .line 891
    const v6, 0x350034

    .line 892
    .line 893
    .line 894
    aput v6, v3, v5

    .line 895
    .line 896
    const/16 v5, 0x2e

    .line 897
    .line 898
    const v6, 0x360034

    .line 899
    .line 900
    .line 901
    aput v6, v3, v5

    .line 902
    .line 903
    const/16 v5, 0x2f

    .line 904
    .line 905
    const v6, 0x370034

    .line 906
    .line 907
    .line 908
    aput v6, v3, v5

    .line 909
    .line 910
    const v5, 0x380034

    .line 911
    .line 912
    .line 913
    aput v5, v3, v40

    .line 914
    .line 915
    const/16 v5, 0x31

    .line 916
    .line 917
    const v6, 0x390034

    .line 918
    .line 919
    .line 920
    aput v6, v3, v5

    .line 921
    .line 922
    const/16 v5, 0x32

    .line 923
    .line 924
    const v6, 0x300035

    .line 925
    .line 926
    .line 927
    aput v6, v3, v5

    .line 928
    .line 929
    const/16 v5, 0x33

    .line 930
    .line 931
    const v6, 0x310035    # 4.500014E-39f

    .line 932
    .line 933
    .line 934
    aput v6, v3, v5

    .line 935
    .line 936
    const/16 v5, 0x34

    .line 937
    .line 938
    const v6, 0x320035

    .line 939
    .line 940
    .line 941
    aput v6, v3, v5

    .line 942
    .line 943
    const/16 v5, 0x35

    .line 944
    .line 945
    const v6, 0x330035

    .line 946
    .line 947
    .line 948
    aput v6, v3, v5

    .line 949
    .line 950
    const/16 v5, 0x36

    .line 951
    .line 952
    const v6, 0x340035

    .line 953
    .line 954
    .line 955
    aput v6, v3, v5

    .line 956
    .line 957
    const/16 v5, 0x37

    .line 958
    .line 959
    const v6, 0x350035

    .line 960
    .line 961
    .line 962
    aput v6, v3, v5

    .line 963
    .line 964
    const/16 v5, 0x38

    .line 965
    .line 966
    const v6, 0x360035

    .line 967
    .line 968
    .line 969
    aput v6, v3, v5

    .line 970
    .line 971
    const/16 v5, 0x39

    .line 972
    .line 973
    const v6, 0x370035

    .line 974
    .line 975
    .line 976
    aput v6, v3, v5

    .line 977
    .line 978
    const/16 v5, 0x3a

    .line 979
    .line 980
    const v6, 0x380035

    .line 981
    .line 982
    .line 983
    aput v6, v3, v5

    .line 984
    .line 985
    const/16 v5, 0x3b

    .line 986
    .line 987
    const v6, 0x390035

    .line 988
    .line 989
    .line 990
    aput v6, v3, v5

    .line 991
    .line 992
    const/16 v5, 0x3c

    .line 993
    .line 994
    const v6, 0x300036

    .line 995
    .line 996
    .line 997
    aput v6, v3, v5

    .line 998
    .line 999
    const v5, 0x310036    # 4.500015E-39f

    .line 1000
    .line 1001
    .line 1002
    aput v5, v3, v41

    .line 1003
    .line 1004
    const/16 v5, 0x3e

    .line 1005
    .line 1006
    const v6, 0x320036

    .line 1007
    .line 1008
    .line 1009
    aput v6, v3, v5

    .line 1010
    .line 1011
    const/16 v5, 0x3f

    .line 1012
    .line 1013
    const v6, 0x330036

    .line 1014
    .line 1015
    .line 1016
    aput v6, v3, v5

    .line 1017
    .line 1018
    const/16 v5, 0x40

    .line 1019
    .line 1020
    const v6, 0x340036

    .line 1021
    .line 1022
    .line 1023
    aput v6, v3, v5

    .line 1024
    .line 1025
    const/16 v5, 0x41

    .line 1026
    .line 1027
    const v6, 0x350036

    .line 1028
    .line 1029
    .line 1030
    aput v6, v3, v5

    .line 1031
    .line 1032
    const/16 v5, 0x42

    .line 1033
    .line 1034
    const v6, 0x360036

    .line 1035
    .line 1036
    .line 1037
    aput v6, v3, v5

    .line 1038
    .line 1039
    const/16 v5, 0x43

    .line 1040
    .line 1041
    const v6, 0x370036

    .line 1042
    .line 1043
    .line 1044
    aput v6, v3, v5

    .line 1045
    .line 1046
    const/16 v5, 0x44

    .line 1047
    .line 1048
    const v6, 0x380036

    .line 1049
    .line 1050
    .line 1051
    aput v6, v3, v5

    .line 1052
    .line 1053
    const/16 v5, 0x45

    .line 1054
    .line 1055
    const v6, 0x390036

    .line 1056
    .line 1057
    .line 1058
    aput v6, v3, v5

    .line 1059
    .line 1060
    const/16 v5, 0x46

    .line 1061
    .line 1062
    const v6, 0x300037

    .line 1063
    .line 1064
    .line 1065
    aput v6, v3, v5

    .line 1066
    .line 1067
    const/16 v5, 0x47

    .line 1068
    .line 1069
    const v6, 0x310037    # 4.500016E-39f

    .line 1070
    .line 1071
    .line 1072
    aput v6, v3, v5

    .line 1073
    .line 1074
    const/16 v5, 0x48

    .line 1075
    .line 1076
    const v6, 0x320037

    .line 1077
    .line 1078
    .line 1079
    aput v6, v3, v5

    .line 1080
    .line 1081
    const/16 v5, 0x49

    .line 1082
    .line 1083
    const v6, 0x330037

    .line 1084
    .line 1085
    .line 1086
    aput v6, v3, v5

    .line 1087
    .line 1088
    const/16 v5, 0x4a

    .line 1089
    .line 1090
    const v6, 0x340037

    .line 1091
    .line 1092
    .line 1093
    aput v6, v3, v5

    .line 1094
    .line 1095
    const/16 v5, 0x4b

    .line 1096
    .line 1097
    const v6, 0x350037

    .line 1098
    .line 1099
    .line 1100
    aput v6, v3, v5

    .line 1101
    .line 1102
    const/16 v5, 0x4c

    .line 1103
    .line 1104
    const v6, 0x360037

    .line 1105
    .line 1106
    .line 1107
    aput v6, v3, v5

    .line 1108
    .line 1109
    const/16 v5, 0x4d

    .line 1110
    .line 1111
    const v6, 0x370037

    .line 1112
    .line 1113
    .line 1114
    aput v6, v3, v5

    .line 1115
    .line 1116
    const/16 v5, 0x4e

    .line 1117
    .line 1118
    const v6, 0x380037

    .line 1119
    .line 1120
    .line 1121
    aput v6, v3, v5

    .line 1122
    .line 1123
    const/16 v5, 0x4f

    .line 1124
    .line 1125
    const v6, 0x390037

    .line 1126
    .line 1127
    .line 1128
    aput v6, v3, v5

    .line 1129
    .line 1130
    const/16 v5, 0x50

    .line 1131
    .line 1132
    const v6, 0x300038

    .line 1133
    .line 1134
    .line 1135
    aput v6, v3, v5

    .line 1136
    .line 1137
    const/16 v5, 0x51

    .line 1138
    .line 1139
    const v6, 0x310038    # 4.500018E-39f

    .line 1140
    .line 1141
    .line 1142
    aput v6, v3, v5

    .line 1143
    .line 1144
    const/16 v5, 0x52

    .line 1145
    .line 1146
    const v6, 0x320038

    .line 1147
    .line 1148
    .line 1149
    aput v6, v3, v5

    .line 1150
    .line 1151
    const/16 v5, 0x53

    .line 1152
    .line 1153
    const v6, 0x330038

    .line 1154
    .line 1155
    .line 1156
    aput v6, v3, v5

    .line 1157
    .line 1158
    const/16 v5, 0x54

    .line 1159
    .line 1160
    const v6, 0x340038

    .line 1161
    .line 1162
    .line 1163
    aput v6, v3, v5

    .line 1164
    .line 1165
    const/16 v5, 0x55

    .line 1166
    .line 1167
    const v6, 0x350038

    .line 1168
    .line 1169
    .line 1170
    aput v6, v3, v5

    .line 1171
    .line 1172
    const/16 v5, 0x56

    .line 1173
    .line 1174
    const v6, 0x360038

    .line 1175
    .line 1176
    .line 1177
    aput v6, v3, v5

    .line 1178
    .line 1179
    const/16 v5, 0x57

    .line 1180
    .line 1181
    const v6, 0x370038

    .line 1182
    .line 1183
    .line 1184
    aput v6, v3, v5

    .line 1185
    .line 1186
    const/16 v5, 0x58

    .line 1187
    .line 1188
    const v6, 0x380038

    .line 1189
    .line 1190
    .line 1191
    aput v6, v3, v5

    .line 1192
    .line 1193
    const/16 v5, 0x59

    .line 1194
    .line 1195
    const v6, 0x390038

    .line 1196
    .line 1197
    .line 1198
    aput v6, v3, v5

    .line 1199
    .line 1200
    const/16 v5, 0x5a

    .line 1201
    .line 1202
    const v6, 0x300039

    .line 1203
    .line 1204
    .line 1205
    aput v6, v3, v5

    .line 1206
    .line 1207
    const/16 v5, 0x5b

    .line 1208
    .line 1209
    const v6, 0x310039    # 4.500019E-39f

    .line 1210
    .line 1211
    .line 1212
    aput v6, v3, v5

    .line 1213
    .line 1214
    const/16 v5, 0x5c

    .line 1215
    .line 1216
    const v6, 0x320039

    .line 1217
    .line 1218
    .line 1219
    aput v6, v3, v5

    .line 1220
    .line 1221
    const/16 v5, 0x5d

    .line 1222
    .line 1223
    const v6, 0x330039

    .line 1224
    .line 1225
    .line 1226
    aput v6, v3, v5

    .line 1227
    .line 1228
    const/16 v5, 0x5e

    .line 1229
    .line 1230
    const v6, 0x340039

    .line 1231
    .line 1232
    .line 1233
    aput v6, v3, v5

    .line 1234
    .line 1235
    const/16 v5, 0x5f

    .line 1236
    .line 1237
    const v6, 0x350039

    .line 1238
    .line 1239
    .line 1240
    aput v6, v3, v5

    .line 1241
    .line 1242
    const/16 v5, 0x60

    .line 1243
    .line 1244
    const v6, 0x360039

    .line 1245
    .line 1246
    .line 1247
    aput v6, v3, v5

    .line 1248
    .line 1249
    const/16 v5, 0x61

    .line 1250
    .line 1251
    const v6, 0x370039

    .line 1252
    .line 1253
    .line 1254
    aput v6, v3, v5

    .line 1255
    .line 1256
    const/16 v5, 0x62

    .line 1257
    .line 1258
    const v6, 0x380039

    .line 1259
    .line 1260
    .line 1261
    aput v6, v3, v5

    .line 1262
    .line 1263
    const v5, 0x390039

    .line 1264
    .line 1265
    .line 1266
    aput v5, v3, v42

    .line 1267
    .line 1268
    sget-boolean v5, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 1269
    .line 1270
    if-eqz v5, :cond_1

    .line 1271
    .line 1272
    move v5, v4

    .line 1273
    :goto_0
    if-ge v5, v1, :cond_0

    .line 1274
    .line 1275
    aget-short v6, v2, v5

    .line 1276
    .line 1277
    invoke-static {v6}, Ljava/lang/Short;->reverseBytes(S)S

    .line 1278
    .line 1279
    .line 1280
    move-result v6

    .line 1281
    aput-short v6, v2, v5

    .line 1282
    .line 1283
    add-int/lit8 v5, v5, 0x1

    .line 1284
    .line 1285
    goto :goto_0

    .line 1286
    :cond_0
    move v5, v4

    .line 1287
    :goto_1
    if-ge v5, v1, :cond_1

    .line 1288
    .line 1289
    aget v6, v3, v5

    .line 1290
    .line 1291
    shl-int/2addr v6, v12

    .line 1292
    invoke-static {v6}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 1293
    .line 1294
    .line 1295
    move-result v6

    .line 1296
    aput v6, v3, v5

    .line 1297
    .line 1298
    add-int/lit8 v5, v5, 0x1

    .line 1299
    .line 1300
    goto :goto_1

    .line 1301
    :cond_1
    sput-object v2, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS:[S

    .line 1302
    .line 1303
    sput-object v3, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS_UTF16:[I

    .line 1304
    .line 1305
    sget-object v2, Lcom/alibaba/fastjson2/util/IOUtils;->IA:[I

    .line 1306
    .line 1307
    const/4 v3, -0x1

    .line 1308
    invoke-static {v2, v3}, Ljava/util/Arrays;->fill([II)V

    .line 1309
    .line 1310
    .line 1311
    sget-object v2, Lcom/alibaba/fastjson2/util/IOUtils;->CA:[C

    .line 1312
    .line 1313
    array-length v2, v2

    .line 1314
    move v3, v4

    .line 1315
    :goto_2
    if-ge v3, v2, :cond_2

    .line 1316
    .line 1317
    sget-object v5, Lcom/alibaba/fastjson2/util/IOUtils;->IA:[I

    .line 1318
    .line 1319
    sget-object v6, Lcom/alibaba/fastjson2/util/IOUtils;->CA:[C

    .line 1320
    .line 1321
    aget-char v6, v6, v3

    .line 1322
    .line 1323
    aput v3, v5, v6

    .line 1324
    .line 1325
    add-int/lit8 v3, v3, 0x1

    .line 1326
    .line 1327
    goto :goto_2

    .line 1328
    :cond_2
    sget-object v2, Lcom/alibaba/fastjson2/util/IOUtils;->IA:[I

    .line 1329
    .line 1330
    aput v4, v2, v41

    .line 1331
    .line 1332
    move v2, v4

    .line 1333
    :goto_3
    sget-object v3, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 1334
    .line 1335
    array-length v5, v3

    .line 1336
    if-ge v2, v5, :cond_5

    .line 1337
    .line 1338
    if-ge v2, v0, :cond_3

    .line 1339
    .line 1340
    const/high16 v5, 0x2000000

    .line 1341
    .line 1342
    goto :goto_4

    .line 1343
    :cond_3
    if-ge v2, v1, :cond_4

    .line 1344
    .line 1345
    const/high16 v5, 0x1000000

    .line 1346
    .line 1347
    goto :goto_4

    .line 1348
    :cond_4
    move v5, v4

    .line 1349
    :goto_4
    div-int/lit8 v6, v2, 0x64

    .line 1350
    .line 1351
    add-int/lit8 v6, v6, 0x30

    .line 1352
    .line 1353
    shl-int/lit8 v6, v6, 0x10

    .line 1354
    .line 1355
    add-int/2addr v5, v6

    .line 1356
    div-int/lit8 v6, v2, 0xa

    .line 1357
    .line 1358
    rem-int/2addr v6, v0

    .line 1359
    add-int/lit8 v6, v6, 0x30

    .line 1360
    .line 1361
    shl-int/2addr v6, v12

    .line 1362
    add-int/2addr v5, v6

    .line 1363
    rem-int/lit8 v6, v2, 0xa

    .line 1364
    .line 1365
    add-int/2addr v6, v5

    .line 1366
    add-int/lit8 v6, v6, 0x30

    .line 1367
    .line 1368
    aput v6, v3, v2

    .line 1369
    .line 1370
    add-int/lit8 v2, v2, 0x1

    .line 1371
    .line 1372
    goto :goto_3

    .line 1373
    :cond_5
    return-void

    .line 1374
    nop

    .line 1375
    :array_0
    .array-data 4
        0x9
        0x63
        0x3e7
        0x270f
        0x1869f
        0xf423f
        0x98967f
        0x5f5e0ff
        0x3b9ac9ff
        0x7fffffff
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static close(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    .line 7
    :catch_0
    return-void
.end method

.method public static decodeBase64(Ljava/lang/String;)[B
    .locals 15

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-array p0, v1, [B

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    add-int/lit8 v2, v0, -0x1

    .line 12
    .line 13
    move v3, v1

    .line 14
    :goto_0
    if-ge v3, v2, :cond_1

    .line 15
    .line 16
    sget-object v4, Lcom/alibaba/fastjson2/util/IOUtils;->IA:[I

    .line 17
    .line 18
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    and-int/lit16 v5, v5, 0xff

    .line 23
    .line 24
    aget v4, v4, v5

    .line 25
    .line 26
    if-gez v4, :cond_1

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    :goto_1
    if-lez v2, :cond_2

    .line 32
    .line 33
    sget-object v4, Lcom/alibaba/fastjson2/util/IOUtils;->IA:[I

    .line 34
    .line 35
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    and-int/lit16 v5, v5, 0xff

    .line 40
    .line 41
    aget v4, v4, v5

    .line 42
    .line 43
    if-gez v4, :cond_2

    .line 44
    .line 45
    add-int/lit8 v2, v2, -0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    const/16 v5, 0x3d

    .line 53
    .line 54
    const/4 v6, 0x1

    .line 55
    if-ne v4, v5, :cond_4

    .line 56
    .line 57
    add-int/lit8 v4, v2, -0x1

    .line 58
    .line 59
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-ne v4, v5, :cond_3

    .line 64
    .line 65
    const/4 v4, 0x2

    .line 66
    goto :goto_2

    .line 67
    :cond_3
    move v4, v6

    .line 68
    goto :goto_2

    .line 69
    :cond_4
    move v4, v1

    .line 70
    :goto_2
    sub-int v5, v2, v3

    .line 71
    .line 72
    add-int/2addr v5, v6

    .line 73
    const/16 v7, 0x4c

    .line 74
    .line 75
    if-le v0, v7, :cond_6

    .line 76
    .line 77
    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    const/16 v7, 0xd

    .line 82
    .line 83
    if-ne v0, v7, :cond_5

    .line 84
    .line 85
    div-int/lit8 v0, v5, 0x4e

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    move v0, v1

    .line 89
    :goto_3
    shl-int/2addr v0, v6

    .line 90
    goto :goto_4

    .line 91
    :cond_6
    move v0, v1

    .line 92
    :goto_4
    sub-int/2addr v5, v0

    .line 93
    mul-int/lit8 v5, v5, 0x6

    .line 94
    .line 95
    shr-int/lit8 v5, v5, 0x3

    .line 96
    .line 97
    sub-int/2addr v5, v4

    .line 98
    new-array v7, v5, [B

    .line 99
    .line 100
    div-int/lit8 v8, v5, 0x3

    .line 101
    .line 102
    mul-int/lit8 v8, v8, 0x3

    .line 103
    .line 104
    move v9, v1

    .line 105
    move v10, v9

    .line 106
    :goto_5
    if-ge v9, v8, :cond_8

    .line 107
    .line 108
    sget-object v11, Lcom/alibaba/fastjson2/util/IOUtils;->IA:[I

    .line 109
    .line 110
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 111
    .line 112
    .line 113
    move-result v12

    .line 114
    aget v12, v11, v12

    .line 115
    .line 116
    shl-int/lit8 v12, v12, 0x12

    .line 117
    .line 118
    add-int/lit8 v13, v3, 0x1

    .line 119
    .line 120
    invoke-virtual {p0, v13}, Ljava/lang/String;->charAt(I)C

    .line 121
    .line 122
    .line 123
    move-result v13

    .line 124
    aget v13, v11, v13

    .line 125
    .line 126
    shl-int/lit8 v13, v13, 0xc

    .line 127
    .line 128
    or-int/2addr v12, v13

    .line 129
    add-int/lit8 v13, v3, 0x2

    .line 130
    .line 131
    invoke-virtual {p0, v13}, Ljava/lang/String;->charAt(I)C

    .line 132
    .line 133
    .line 134
    move-result v13

    .line 135
    aget v13, v11, v13

    .line 136
    .line 137
    shl-int/lit8 v13, v13, 0x6

    .line 138
    .line 139
    or-int/2addr v12, v13

    .line 140
    add-int/lit8 v13, v3, 0x3

    .line 141
    .line 142
    invoke-virtual {p0, v13}, Ljava/lang/String;->charAt(I)C

    .line 143
    .line 144
    .line 145
    move-result v13

    .line 146
    aget v11, v11, v13

    .line 147
    .line 148
    or-int/2addr v11, v12

    .line 149
    add-int/lit8 v12, v3, 0x4

    .line 150
    .line 151
    shr-int/lit8 v13, v11, 0x10

    .line 152
    .line 153
    int-to-byte v13, v13

    .line 154
    aput-byte v13, v7, v9

    .line 155
    .line 156
    add-int/lit8 v13, v9, 0x1

    .line 157
    .line 158
    shr-int/lit8 v14, v11, 0x8

    .line 159
    .line 160
    int-to-byte v14, v14

    .line 161
    aput-byte v14, v7, v13

    .line 162
    .line 163
    add-int/lit8 v13, v9, 0x2

    .line 164
    .line 165
    int-to-byte v11, v11

    .line 166
    aput-byte v11, v7, v13

    .line 167
    .line 168
    add-int/lit8 v9, v9, 0x3

    .line 169
    .line 170
    if-lez v0, :cond_7

    .line 171
    .line 172
    add-int/lit8 v10, v10, 0x1

    .line 173
    .line 174
    const/16 v11, 0x13

    .line 175
    .line 176
    if-ne v10, v11, :cond_7

    .line 177
    .line 178
    add-int/lit8 v3, v3, 0x6

    .line 179
    .line 180
    move v10, v1

    .line 181
    goto :goto_5

    .line 182
    :cond_7
    move v3, v12

    .line 183
    goto :goto_5

    .line 184
    :cond_8
    if-ge v9, v5, :cond_a

    .line 185
    .line 186
    move v0, v1

    .line 187
    :goto_6
    sub-int v8, v2, v4

    .line 188
    .line 189
    if-gt v3, v8, :cond_9

    .line 190
    .line 191
    sget-object v8, Lcom/alibaba/fastjson2/util/IOUtils;->IA:[I

    .line 192
    .line 193
    add-int/lit8 v10, v3, 0x1

    .line 194
    .line 195
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    aget v3, v8, v3

    .line 200
    .line 201
    mul-int/lit8 v8, v0, 0x6

    .line 202
    .line 203
    rsub-int/lit8 v8, v8, 0x12

    .line 204
    .line 205
    shl-int/2addr v3, v8

    .line 206
    or-int/2addr v1, v3

    .line 207
    add-int/2addr v0, v6

    .line 208
    move v3, v10

    .line 209
    goto :goto_6

    .line 210
    :cond_9
    const/16 p0, 0x10

    .line 211
    .line 212
    :goto_7
    if-ge v9, v5, :cond_a

    .line 213
    .line 214
    add-int/lit8 v0, v9, 0x1

    .line 215
    .line 216
    shr-int v2, v1, p0

    .line 217
    .line 218
    int-to-byte v2, v2

    .line 219
    aput-byte v2, v7, v9

    .line 220
    .line 221
    add-int/lit8 p0, p0, -0x8

    .line 222
    .line 223
    move v9, v0

    .line 224
    goto :goto_7

    .line 225
    :cond_a
    return-object v7
.end method

.method public static digit2([BI)I
    .locals 3

    .line 43
    aget-byte v0, p0, p1

    add-int/lit8 p1, p1, 0x1

    aget-byte p0, p0, p1

    shl-int/lit8 p0, p0, 0x8

    or-int/2addr p0, v0

    const p1, 0xf0f0

    and-int v0, p0, p1

    add-int/lit16 v0, v0, -0x3030

    and-int/lit16 v1, p0, 0xf0f

    add-int/lit16 v2, v1, 0x606

    and-int/2addr p1, v2

    or-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    and-int/lit8 p0, p0, 0xf

    mul-int/lit8 p0, p0, 0xa

    shr-int/lit8 p1, v1, 0x8

    add-int/2addr p0, p1

    return p0
.end method

.method public static digit2([CI)I
    .locals 3

    .line 1
    aget-char v0, p0, p1

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    aget-char p0, p0, p1

    .line 6
    .line 7
    shl-int/lit8 p0, p0, 0x10

    .line 8
    .line 9
    or-int/2addr p0, v0

    .line 10
    const p1, -0xf0010

    .line 11
    .line 12
    .line 13
    and-int/2addr p1, p0

    .line 14
    const v0, 0x300030

    .line 15
    .line 16
    .line 17
    sub-int/2addr p1, v0

    .line 18
    const v0, 0xf000f

    .line 19
    .line 20
    .line 21
    and-int/2addr v0, p0

    .line 22
    const v1, 0x60006

    .line 23
    .line 24
    .line 25
    add-int/2addr v1, v0

    .line 26
    const v2, 0xf000f0

    .line 27
    .line 28
    .line 29
    and-int/2addr v1, v2

    .line 30
    or-int/2addr p1, v1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    const/4 p0, -0x1

    .line 34
    return p0

    .line 35
    :cond_0
    and-int/lit8 p0, p0, 0xf

    .line 36
    .line 37
    mul-int/lit8 p0, p0, 0xa

    .line 38
    .line 39
    shr-int/lit8 p1, v0, 0x10

    .line 40
    .line 41
    add-int/2addr p0, p1

    .line 42
    return p0
.end method

.method public static digit4([CI)I
    .locals 8

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    .line 4
    .line 5
    int-to-long v3, p1

    .line 6
    const/4 p1, 0x1

    .line 7
    shl-long/2addr v3, p1

    .line 8
    add-long/2addr v1, v3

    .line 9
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    sget-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {p0, p1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    :cond_0
    const-wide v0, -0xf000f000f0010L

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v0, p0

    .line 27
    const-wide v2, 0x30003000300030L

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    sub-long/2addr v0, v2

    .line 33
    const-wide v2, 0xf000f000f000fL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v2, p0

    .line 39
    const-wide v4, 0x6000600060006L

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    add-long/2addr v4, v2

    .line 45
    const-wide v6, 0xf000f000f000f0L

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    and-long/2addr v4, v6

    .line 51
    or-long/2addr v0, v4

    .line 52
    const-wide/16 v4, 0x0

    .line 53
    .line 54
    cmp-long v0, v0, v4

    .line 55
    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    const/4 p0, -0x1

    .line 59
    return p0

    .line 60
    :cond_1
    const-wide/16 v0, 0xf

    .line 61
    .line 62
    and-long/2addr p0, v0

    .line 63
    const-wide/16 v4, 0xa

    .line 64
    .line 65
    mul-long/2addr p0, v4

    .line 66
    const/16 v6, 0x10

    .line 67
    .line 68
    shr-long v6, v2, v6

    .line 69
    .line 70
    and-long/2addr v6, v0

    .line 71
    add-long/2addr p0, v6

    .line 72
    mul-long/2addr p0, v4

    .line 73
    const/16 v6, 0x20

    .line 74
    .line 75
    shr-long v6, v2, v6

    .line 76
    .line 77
    and-long/2addr v0, v6

    .line 78
    add-long/2addr p0, v0

    .line 79
    mul-long/2addr p0, v4

    .line 80
    const/16 v0, 0x30

    .line 81
    .line 82
    shr-long v0, v2, v0

    .line 83
    .line 84
    add-long/2addr p0, v0

    .line 85
    long-to-int p0, p0

    .line 86
    return p0
.end method

.method public static encodeUTF8([BII[BI)I
    .locals 8

    add-int/2addr p2, p1

    :goto_0
    if-ge p1, p2, :cond_6

    .line 191
    aget-byte v0, p0, p1

    add-int/lit8 v1, p1, 0x1

    .line 192
    aget-byte v1, p0, v1

    add-int/lit8 v2, p1, 0x2

    if-nez v1, :cond_0

    if-ltz v0, :cond_0

    add-int/lit8 p1, p4, 0x1

    .line 193
    aput-byte v0, p3, p4

    :goto_1
    move p4, p1

    :goto_2
    move p1, v2

    goto :goto_0

    :cond_0
    and-int/lit16 v0, v0, 0xff

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    int-to-char v0, v0

    const/16 v1, 0x800

    if-ge v0, v1, :cond_1

    shr-int/lit8 p1, v0, 0x6

    or-int/lit16 p1, p1, 0xc0

    int-to-byte p1, p1

    .line 194
    aput-byte p1, p3, p4

    add-int/lit8 p1, p4, 0x1

    and-int/lit8 v0, v0, 0x3f

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    .line 195
    aput-byte v0, p3, p1

    add-int/lit8 p4, p4, 0x2

    goto :goto_2

    :cond_1
    const v1, 0xd800

    const/16 v3, 0x3f

    if-lt v0, v1, :cond_5

    const v1, 0xe000

    if-ge v0, v1, :cond_5

    add-int/lit8 v4, p1, 0x1

    const v5, 0xdc00

    const/4 v6, -0x1

    if-ge v0, v5, :cond_4

    sub-int v4, p2, v4

    const/4 v7, 0x2

    if-ge v4, v7, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v2, p1, 0x2

    .line 196
    aget-byte v2, p0, v2

    add-int/lit8 v4, p1, 0x3

    .line 197
    aget-byte v4, p0, v4

    and-int/lit16 v2, v2, 0xff

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v2, v4

    int-to-char v2, v2

    if-lt v2, v5, :cond_4

    if-ge v2, v1, :cond_4

    add-int/lit8 p1, p1, 0x4

    shl-int/lit8 v0, v0, 0xa

    add-int/2addr v0, v2

    const v1, -0x35fdc00

    add-int v6, v0, v1

    move v2, p1

    :goto_3
    if-gez v6, :cond_3

    add-int/lit8 p1, p4, 0x1

    .line 198
    aput-byte v3, p3, p4

    goto :goto_1

    :cond_3
    shr-int/lit8 p1, v6, 0x12

    or-int/lit16 p1, p1, 0xf0

    int-to-byte p1, p1

    .line 199
    aput-byte p1, p3, p4

    add-int/lit8 p1, p4, 0x1

    shr-int/lit8 v0, v6, 0xc

    and-int/2addr v0, v3

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    .line 200
    aput-byte v0, p3, p1

    add-int/lit8 p1, p4, 0x2

    shr-int/lit8 v0, v6, 0x6

    and-int/2addr v0, v3

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    .line 201
    aput-byte v0, p3, p1

    add-int/lit8 p1, p4, 0x3

    and-int/lit8 v0, v6, 0x3f

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    .line 202
    aput-byte v0, p3, p1

    add-int/lit8 p1, p4, 0x4

    goto/16 :goto_1

    :cond_4
    return v6

    :cond_5
    shr-int/lit8 p1, v0, 0xc

    or-int/lit16 p1, p1, 0xe0

    int-to-byte p1, p1

    .line 203
    aput-byte p1, p3, p4

    add-int/lit8 p1, p4, 0x1

    shr-int/lit8 v1, v0, 0x6

    and-int/2addr v1, v3

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    .line 204
    aput-byte v1, p3, p1

    add-int/lit8 p1, p4, 0x2

    and-int/lit8 v0, v0, 0x3f

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    .line 205
    aput-byte v0, p3, p1

    add-int/lit8 p4, p4, 0x3

    goto/16 :goto_2

    :cond_6
    return p4
.end method

.method public static encodeUTF8([CII[BI)I
    .locals 9

    .line 1
    add-int v0, p1, p2

    .line 2
    .line 3
    array-length v1, p3

    .line 4
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    add-int/2addr p2, p4

    .line 9
    :goto_0
    const/16 v1, 0x80

    .line 10
    .line 11
    if-ge p4, p2, :cond_0

    .line 12
    .line 13
    aget-char v2, p0, p1

    .line 14
    .line 15
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    add-int/lit8 v1, p4, 0x1

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    int-to-byte v2, v2

    .line 22
    aput-byte v2, p3, p4

    .line 23
    .line 24
    move p4, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    :goto_1
    if-ge p1, v0, :cond_8

    .line 27
    .line 28
    add-int/lit8 p2, p1, 0x1

    .line 29
    .line 30
    aget-char v2, p0, p1

    .line 31
    .line 32
    if-ge v2, v1, :cond_1

    .line 33
    .line 34
    add-int/lit8 p1, p4, 0x1

    .line 35
    .line 36
    int-to-byte v2, v2

    .line 37
    aput-byte v2, p3, p4

    .line 38
    .line 39
    goto/16 :goto_3

    .line 40
    .line 41
    :cond_1
    const/16 v3, 0x800

    .line 42
    .line 43
    if-ge v2, v3, :cond_2

    .line 44
    .line 45
    shr-int/lit8 p1, v2, 0x6

    .line 46
    .line 47
    or-int/lit16 p1, p1, 0xc0

    .line 48
    .line 49
    int-to-byte p1, p1

    .line 50
    aput-byte p1, p3, p4

    .line 51
    .line 52
    add-int/lit8 p1, p4, 0x1

    .line 53
    .line 54
    and-int/lit8 v2, v2, 0x3f

    .line 55
    .line 56
    or-int/2addr v2, v1

    .line 57
    int-to-byte v2, v2

    .line 58
    aput-byte v2, p3, p1

    .line 59
    .line 60
    add-int/lit8 p4, p4, 0x2

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_2
    const v3, 0xd800

    .line 64
    .line 65
    .line 66
    const/16 v4, 0x3f

    .line 67
    .line 68
    if-lt v2, v3, :cond_7

    .line 69
    .line 70
    const v3, 0xe000

    .line 71
    .line 72
    .line 73
    if-ge v2, v3, :cond_7

    .line 74
    .line 75
    const v5, 0xdc00

    .line 76
    .line 77
    .line 78
    if-ge v2, v5, :cond_6

    .line 79
    .line 80
    sub-int v6, v0, p1

    .line 81
    .line 82
    const/4 v7, 0x2

    .line 83
    if-ge v6, v7, :cond_3

    .line 84
    .line 85
    const/4 v2, -0x1

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    add-int/lit8 v6, p1, 0x1

    .line 88
    .line 89
    aget-char v6, p0, v6

    .line 90
    .line 91
    if-lt v6, v5, :cond_5

    .line 92
    .line 93
    if-ge v6, v3, :cond_5

    .line 94
    .line 95
    shl-int/lit8 v2, v2, 0xa

    .line 96
    .line 97
    add-int/2addr v2, v6

    .line 98
    const v3, -0x35fdc00

    .line 99
    .line 100
    .line 101
    add-int/2addr v2, v3

    .line 102
    :goto_2
    if-gez v2, :cond_4

    .line 103
    .line 104
    add-int/lit8 p1, p4, 0x1

    .line 105
    .line 106
    aput-byte v4, p3, p4

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    shr-int/lit8 p2, v2, 0x12

    .line 110
    .line 111
    or-int/lit16 p2, p2, 0xf0

    .line 112
    .line 113
    int-to-byte p2, p2

    .line 114
    aput-byte p2, p3, p4

    .line 115
    .line 116
    add-int/lit8 p2, p4, 0x1

    .line 117
    .line 118
    shr-int/lit8 v3, v2, 0xc

    .line 119
    .line 120
    and-int/2addr v3, v4

    .line 121
    or-int/2addr v3, v1

    .line 122
    int-to-byte v3, v3

    .line 123
    aput-byte v3, p3, p2

    .line 124
    .line 125
    add-int/lit8 p2, p4, 0x2

    .line 126
    .line 127
    shr-int/lit8 v3, v2, 0x6

    .line 128
    .line 129
    and-int/2addr v3, v4

    .line 130
    or-int/2addr v3, v1

    .line 131
    int-to-byte v3, v3

    .line 132
    aput-byte v3, p3, p2

    .line 133
    .line 134
    add-int/lit8 p2, p4, 0x3

    .line 135
    .line 136
    and-int/lit8 v2, v2, 0x3f

    .line 137
    .line 138
    or-int/2addr v2, v1

    .line 139
    int-to-byte v2, v2

    .line 140
    aput-byte v2, p3, p2

    .line 141
    .line 142
    add-int/lit8 p2, p4, 0x4

    .line 143
    .line 144
    add-int/lit8 p1, p1, 0x2

    .line 145
    .line 146
    move v8, p2

    .line 147
    move p2, p1

    .line 148
    move p1, v8

    .line 149
    goto :goto_3

    .line 150
    :cond_5
    add-int/lit8 p1, p4, 0x1

    .line 151
    .line 152
    aput-byte v4, p3, p4

    .line 153
    .line 154
    :goto_3
    move p4, p1

    .line 155
    :goto_4
    move p1, p2

    .line 156
    goto/16 :goto_1

    .line 157
    .line 158
    :cond_6
    add-int/lit8 p1, p4, 0x1

    .line 159
    .line 160
    aput-byte v4, p3, p4

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_7
    shr-int/lit8 p1, v2, 0xc

    .line 164
    .line 165
    or-int/lit16 p1, p1, 0xe0

    .line 166
    .line 167
    int-to-byte p1, p1

    .line 168
    aput-byte p1, p3, p4

    .line 169
    .line 170
    add-int/lit8 p1, p4, 0x1

    .line 171
    .line 172
    shr-int/lit8 v3, v2, 0x6

    .line 173
    .line 174
    and-int/2addr v3, v4

    .line 175
    or-int/2addr v3, v1

    .line 176
    int-to-byte v3, v3

    .line 177
    aput-byte v3, p3, p1

    .line 178
    .line 179
    add-int/lit8 p1, p4, 0x2

    .line 180
    .line 181
    and-int/lit8 v2, v2, 0x3f

    .line 182
    .line 183
    or-int/2addr v2, v1

    .line 184
    int-to-byte v2, v2

    .line 185
    aput-byte v2, p3, p1

    .line 186
    .line 187
    add-int/lit8 p4, p4, 0x3

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_8
    return p4
.end method

.method public static getChars(II[B)V
    .locals 8

    const/4 v0, 0x1

    if-gez p0, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    neg-int p0, p0

    :cond_1
    :goto_1
    const/16 v2, -0x64

    if-gt p0, v2, :cond_2

    .line 126
    div-int/lit8 v2, p0, 0x64

    mul-int/lit8 v3, v2, 0x64

    sub-int/2addr v3, p0

    add-int/lit8 p1, p1, -0x2

    .line 127
    sget-object p0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    int-to-long v6, p1

    add-long/2addr v4, v6

    sget-object v6, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS:[S

    aget-short v3, v6, v3

    invoke-virtual {p0, p2, v4, v5, v3}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    move p0, v2

    goto :goto_1

    :cond_2
    const/16 v2, -0x9

    if-ge p0, v2, :cond_3

    add-int/lit8 p1, p1, -0x2

    .line 128
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    int-to-long v5, p1

    add-long/2addr v3, v5

    sget-object v5, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS:[S

    neg-int p0, p0

    aget-short p0, v5, p0

    invoke-virtual {v2, p2, v3, v4, p0}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    goto :goto_2

    :cond_3
    add-int/lit8 p1, p1, -0x1

    rsub-int/lit8 p0, p0, 0x30

    int-to-byte p0, p0

    .line 129
    aput-byte p0, p2, p1

    :goto_2
    if-eqz v1, :cond_4

    sub-int/2addr p1, v0

    const/16 p0, 0x2d

    .line 130
    aput-byte p0, p2, p1

    :cond_4
    return-void
.end method

.method public static getChars(II[C)V
    .locals 8

    const/4 v0, 0x1

    if-gez p0, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    neg-int p0, p0

    :cond_1
    :goto_1
    const/16 v2, -0x64

    if-gt p0, v2, :cond_2

    .line 114
    div-int/lit8 v2, p0, 0x64

    mul-int/lit8 v3, v2, 0x64

    sub-int/2addr v3, p0

    add-int/lit8 p1, p1, -0x2

    .line 115
    sget-object p0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v4, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    shl-int/lit8 v6, p1, 0x1

    int-to-long v6, v6

    add-long/2addr v4, v6

    sget-object v6, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS_UTF16:[I

    aget v3, v6, v3

    invoke-virtual {p0, p2, v4, v5, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move p0, v2

    goto :goto_1

    :cond_2
    const/16 v2, -0x9

    if-ge p0, v2, :cond_3

    add-int/lit8 p1, p1, -0x2

    .line 116
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    shl-int/lit8 v5, p1, 0x1

    int-to-long v5, v5

    add-long/2addr v3, v5

    sget-object v5, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS_UTF16:[I

    neg-int p0, p0

    aget p0, v5, p0

    invoke-virtual {v2, p2, v3, v4, p0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_2

    :cond_3
    add-int/lit8 p1, p1, -0x1

    rsub-int/lit8 p0, p0, 0x30

    int-to-char p0, p0

    .line 117
    aput-char p0, p2, p1

    :goto_2
    if-eqz v1, :cond_4

    sub-int/2addr p1, v0

    const/16 p0, 0x2d

    .line 118
    aput-char p0, p2, p1

    :cond_4
    return-void
.end method

.method public static getChars(JI[B)V
    .locals 11

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    const/4 v1, 0x1

    if-gez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    neg-long p0, p0

    :cond_1
    :goto_1
    const-wide/32 v2, -0x80000000

    cmp-long v2, p0, v2

    if-gtz v2, :cond_2

    const-wide/16 v2, 0x64

    .line 119
    div-long v4, p0, v2

    add-int/lit8 p2, p2, -0x2

    .line 120
    sget-object v6, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v7, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    int-to-long v9, p2

    add-long/2addr v7, v9

    sget-object v9, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS:[S

    mul-long/2addr v2, v4

    sub-long/2addr v2, p0

    long-to-int p0, v2

    aget-short p0, v9, p0

    invoke-virtual {v6, p3, v7, v8, p0}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    move-wide p0, v4

    goto :goto_1

    :cond_2
    long-to-int p0, p0

    :goto_2
    const/16 p1, -0x64

    if-gt p0, p1, :cond_3

    .line 121
    div-int/lit8 p1, p0, 0x64

    add-int/lit8 p2, p2, -0x2

    .line 122
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    int-to-long v5, p2

    add-long/2addr v3, v5

    sget-object v5, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS:[S

    mul-int/lit8 v6, p1, 0x64

    sub-int/2addr v6, p0

    aget-short p0, v5, v6

    invoke-virtual {v2, p3, v3, v4, p0}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    move p0, p1

    goto :goto_2

    :cond_3
    const/16 p1, -0x9

    if-ge p0, p1, :cond_4

    add-int/lit8 p2, p2, -0x2

    .line 123
    sget-object p1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v2, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    int-to-long v4, p2

    add-long/2addr v2, v4

    sget-object v4, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS:[S

    neg-int p0, p0

    aget-short p0, v4, p0

    invoke-virtual {p1, p3, v2, v3, p0}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    goto :goto_3

    :cond_4
    add-int/lit8 p2, p2, -0x1

    rsub-int/lit8 p0, p0, 0x30

    int-to-byte p0, p0

    .line 124
    aput-byte p0, p3, p2

    :goto_3
    if-eqz v0, :cond_5

    sub-int/2addr p2, v1

    const/16 p0, 0x2d

    .line 125
    aput-byte p0, p3, p2

    :cond_5
    return-void
.end method

.method public static getChars(JI[C)V
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-nez v0, :cond_1

    .line 11
    .line 12
    neg-long p0, p0

    .line 13
    :cond_1
    :goto_1
    const-wide/32 v1, -0x80000000

    .line 14
    .line 15
    .line 16
    cmp-long v1, p0, v1

    .line 17
    .line 18
    if-gtz v1, :cond_2

    .line 19
    .line 20
    const-wide/16 v1, 0x64

    .line 21
    .line 22
    div-long v3, p0, v1

    .line 23
    .line 24
    add-int/lit8 p2, p2, -0x2

    .line 25
    .line 26
    sget-object v5, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 27
    .line 28
    sget-wide v6, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    .line 29
    .line 30
    shl-int/lit8 v8, p2, 0x1

    .line 31
    .line 32
    int-to-long v8, v8

    .line 33
    add-long/2addr v6, v8

    .line 34
    sget-object v8, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS_UTF16:[I

    .line 35
    .line 36
    mul-long/2addr v1, v3

    .line 37
    sub-long/2addr v1, p0

    .line 38
    long-to-int p0, v1

    .line 39
    aget p0, v8, p0

    .line 40
    .line 41
    invoke-virtual {v5, p3, v6, v7, p0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 42
    .line 43
    .line 44
    move-wide p0, v3

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    long-to-int p0, p0

    .line 47
    :goto_2
    const/16 p1, -0x64

    .line 48
    .line 49
    if-gt p0, p1, :cond_3

    .line 50
    .line 51
    div-int/lit8 p1, p0, 0x64

    .line 52
    .line 53
    add-int/lit8 p2, p2, -0x2

    .line 54
    .line 55
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 56
    .line 57
    sget-wide v2, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    .line 58
    .line 59
    shl-int/lit8 v4, p2, 0x1

    .line 60
    .line 61
    int-to-long v4, v4

    .line 62
    add-long/2addr v2, v4

    .line 63
    sget-object v4, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS_UTF16:[I

    .line 64
    .line 65
    mul-int/lit8 v5, p1, 0x64

    .line 66
    .line 67
    sub-int/2addr v5, p0

    .line 68
    aget p0, v4, v5

    .line 69
    .line 70
    invoke-virtual {v1, p3, v2, v3, p0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 71
    .line 72
    .line 73
    move p0, p1

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    const/16 p1, -0x9

    .line 76
    .line 77
    if-ge p0, p1, :cond_4

    .line 78
    .line 79
    add-int/lit8 p2, p2, -0x2

    .line 80
    .line 81
    sget-object p1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 82
    .line 83
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    .line 84
    .line 85
    shl-int/lit8 v3, p2, 0x1

    .line 86
    .line 87
    int-to-long v3, v3

    .line 88
    add-long/2addr v1, v3

    .line 89
    sget-object v3, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS_UTF16:[I

    .line 90
    .line 91
    neg-int p0, p0

    .line 92
    aget p0, v3, p0

    .line 93
    .line 94
    invoke-virtual {p1, p3, v1, v2, p0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    add-int/lit8 p2, p2, -0x1

    .line 99
    .line 100
    rsub-int/lit8 p0, p0, 0x30

    .line 101
    .line 102
    int-to-char p0, p0

    .line 103
    aput-char p0, p3, p2

    .line 104
    .line 105
    :goto_3
    if-eqz v0, :cond_5

    .line 106
    .line 107
    add-int/lit8 p2, p2, -0x1

    .line 108
    .line 109
    const/16 p0, 0x2d

    .line 110
    .line 111
    aput-char p0, p3, p2

    .line 112
    .line 113
    :cond_5
    return-void
.end method

.method public static getInt([BI)I
    .locals 5

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 4
    .line 5
    int-to-long v3, p1

    .line 6
    add-long/2addr v1, v3

    .line 7
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    sget-boolean p1, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public static indexOfChar([BIII)I
    .locals 1

    .line 1
    :goto_0
    if-ge p2, p3, :cond_1

    .line 2
    .line 3
    aget-byte v0, p0, p2

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    return p2

    .line 8
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const/4 p0, -0x1

    .line 12
    return p0
.end method

.method public static indexOfChar([CIII)I
    .locals 1

    :goto_0
    if-ge p2, p3, :cond_1

    .line 13
    aget-char v0, p0, p2

    if-ne v0, p1, :cond_0

    return p2

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static isNumber(Ljava/lang/String;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    move v2, v1

    .line 10
    :goto_0
    const/4 v3, 0x1

    .line 11
    if-ge v2, v0, :cond_6

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const/16 v5, 0x2b

    .line 18
    .line 19
    if-eq v4, v5, :cond_3

    .line 20
    .line 21
    const/16 v5, 0x2d

    .line 22
    .line 23
    if-ne v4, v5, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/16 v3, 0x30

    .line 27
    .line 28
    if-lt v4, v3, :cond_2

    .line 29
    .line 30
    const/16 v3, 0x39

    .line 31
    .line 32
    if-le v4, v3, :cond_4

    .line 33
    .line 34
    :cond_2
    return v1

    .line 35
    :cond_3
    :goto_1
    if-nez v2, :cond_5

    .line 36
    .line 37
    if-ne v0, v3, :cond_4

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_5
    :goto_2
    return v1

    .line 44
    :cond_6
    return v3
.end method

.method public static isNumber([BII)Z
    .locals 6

    const/4 v0, 0x0

    if-gtz p2, :cond_0

    return v0

    :cond_0
    add-int v1, p1, p2

    move v2, p1

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v1, :cond_6

    .line 46
    aget-byte v4, p0, v2

    int-to-char v4, v4

    const/16 v5, 0x2b

    if-eq v4, v5, :cond_3

    const/16 v5, 0x2d

    if-ne v4, v5, :cond_1

    goto :goto_1

    :cond_1
    const/16 v3, 0x30

    if-lt v4, v3, :cond_2

    const/16 v3, 0x39

    if-le v4, v3, :cond_4

    :cond_2
    return v0

    :cond_3
    :goto_1
    if-ne v2, p1, :cond_5

    if-ne p2, v3, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    :goto_2
    return v0

    :cond_6
    return v3
.end method

.method public static isNumber([CII)Z
    .locals 6

    const/4 v0, 0x0

    if-gtz p2, :cond_0

    return v0

    :cond_0
    add-int v1, p1, p2

    move v2, p1

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v1, :cond_6

    .line 45
    aget-char v4, p0, v2

    const/16 v5, 0x2b

    if-eq v4, v5, :cond_3

    const/16 v5, 0x2d

    if-ne v4, v5, :cond_1

    goto :goto_1

    :cond_1
    const/16 v3, 0x30

    if-lt v4, v3, :cond_2

    const/16 v3, 0x39

    if-le v4, v3, :cond_4

    :cond_2
    return v0

    :cond_3
    :goto_1
    if-ne v2, p1, :cond_5

    if-ne p2, v3, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    :goto_2
    return v0

    :cond_6
    return v3
.end method

.method public static stringSize(I)I
    .locals 2

    const/4 v0, 0x0

    .line 19
    :goto_0
    sget-object v1, Lcom/alibaba/fastjson2/util/IOUtils;->sizeTable:[I

    aget v1, v1, v0

    if-gt p0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static stringSize(J)I
    .locals 6

    .line 1
    const-wide/16 v0, 0xa

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    move-wide v3, v0

    .line 5
    :goto_0
    const/16 v5, 0x13

    .line 6
    .line 7
    if-ge v2, v5, :cond_1

    .line 8
    .line 9
    cmp-long v5, p0, v3

    .line 10
    .line 11
    if-gez v5, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    mul-long/2addr v3, v0

    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    return v5
.end method

.method public static writeDecimal([BIJI)I
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p2, v0

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    add-int/lit8 v0, p1, 0x1

    .line 8
    .line 9
    const/16 v1, 0x2d

    .line 10
    .line 11
    aput-byte v1, p0, p1

    .line 12
    .line 13
    neg-long p2, p2

    .line 14
    move p1, v0

    .line 15
    :cond_0
    if-nez p4, :cond_1

    .line 16
    .line 17
    invoke-static {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt64([BIJ)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_1
    invoke-static {p2, p3}, Lcom/alibaba/fastjson2/util/IOUtils;->stringSize(J)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sub-int/2addr v0, p4

    .line 27
    const/16 v1, 0x2e

    .line 28
    .line 29
    const/16 v2, 0x30

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    aput-byte v2, p0, p1

    .line 34
    .line 35
    add-int/lit8 v2, p1, 0x1

    .line 36
    .line 37
    aput-byte v1, p0, v2

    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    if-gez v0, :cond_3

    .line 43
    .line 44
    aput-byte v2, p0, p1

    .line 45
    .line 46
    add-int/lit8 v3, p1, 0x1

    .line 47
    .line 48
    aput-byte v1, p0, v3

    .line 49
    .line 50
    add-int/lit8 p1, p1, 0x2

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    :goto_0
    neg-int v4, v0

    .line 54
    if-ge v3, v4, :cond_3

    .line 55
    .line 56
    add-int/lit8 v4, p1, 0x1

    .line 57
    .line 58
    aput-byte v2, p0, p1

    .line 59
    .line 60
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    move p1, v4

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    :goto_1
    invoke-static {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt64([BIJ)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-lez v0, :cond_4

    .line 69
    .line 70
    sub-int p2, p1, p4

    .line 71
    .line 72
    add-int/lit8 p3, p2, 0x1

    .line 73
    .line 74
    invoke-static {p0, p2, p0, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 75
    .line 76
    .line 77
    aput-byte v1, p0, p2

    .line 78
    .line 79
    add-int/lit8 p1, p1, 0x1

    .line 80
    .line 81
    :cond_4
    return p1
.end method

.method public static writeDecimal([CIJI)I
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gez v0, :cond_0

    add-int/lit8 v0, p1, 0x1

    const/16 v1, 0x2d

    .line 82
    aput-char v1, p0, p1

    neg-long p2, p2

    move p1, v0

    :cond_0
    if-nez p4, :cond_1

    .line 83
    invoke-static {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt64([CIJ)I

    move-result p0

    return p0

    .line 84
    :cond_1
    invoke-static {p2, p3}, Lcom/alibaba/fastjson2/util/IOUtils;->stringSize(J)I

    move-result v0

    sub-int/2addr v0, p4

    const/16 v1, 0x2e

    const/16 v2, 0x30

    if-nez v0, :cond_2

    .line 85
    aput-char v2, p0, p1

    add-int/lit8 v2, p1, 0x1

    .line 86
    aput-char v1, p0, v2

    add-int/lit8 p1, p1, 0x2

    goto :goto_1

    :cond_2
    if-gez v0, :cond_3

    .line 87
    aput-char v2, p0, p1

    add-int/lit8 v3, p1, 0x1

    .line 88
    aput-char v1, p0, v3

    add-int/lit8 p1, p1, 0x2

    const/4 v3, 0x0

    :goto_0
    neg-int v4, v0

    if-ge v3, v4, :cond_3

    add-int/lit8 v4, p1, 0x1

    .line 89
    aput-char v2, p0, p1

    add-int/lit8 v3, v3, 0x1

    move p1, v4

    goto :goto_0

    .line 90
    :cond_3
    :goto_1
    invoke-static {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt64([CIJ)I

    move-result p1

    if-lez v0, :cond_4

    sub-int p2, p1, p4

    add-int/lit8 p3, p2, 0x1

    .line 91
    invoke-static {p0, p2, p0, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 92
    aput-char v1, p0, p2

    add-int/lit8 p1, p1, 0x1

    :cond_4
    return p1
.end method

.method public static writeInt32([BII)I
    .locals 5

    if-gez p2, :cond_1

    const/high16 v0, -0x80000000

    if-ne p2, v0, :cond_0

    .line 283
    sget-object p2, Lcom/alibaba/fastjson2/util/IOUtils;->MIN_INT_BYTES:[B

    const/4 v0, 0x0

    array-length v1, p2

    invoke-static {p2, v0, p0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 284
    array-length p0, p2

    add-int/2addr p1, p0

    return p1

    :cond_0
    neg-int p2, p2

    add-int/lit8 v0, p1, 0x1

    const/16 v1, 0x2d

    .line 285
    aput-byte v1, p0, p1

    move p1, v0

    :cond_1
    const/16 v0, 0x3e8

    const/4 v1, 0x1

    if-ge p2, v0, :cond_4

    .line 286
    sget-object v0, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    aget p2, v0, p2

    shr-int/lit8 v0, p2, 0x18

    if-nez v0, :cond_2

    shr-int/lit8 v0, p2, 0x10

    int-to-byte v0, v0

    .line 287
    aput-byte v0, p0, p1

    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x8

    int-to-byte v1, v1

    .line 288
    aput-byte v1, p0, v0

    add-int/lit8 p1, p1, 0x2

    goto :goto_0

    :cond_2
    if-ne v0, v1, :cond_3

    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x8

    int-to-byte v1, v1

    .line 289
    aput-byte v1, p0, p1

    move p1, v0

    :cond_3
    :goto_0
    add-int/lit8 v0, p1, 0x1

    int-to-byte p2, p2

    .line 290
    aput-byte p2, p0, p1

    return v0

    .line 291
    :cond_4
    div-int/lit16 v0, p2, 0x3e8

    mul-int/lit16 v2, v0, 0x3e8

    sub-int v2, p2, v2

    .line 292
    sget-object v3, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    aget v2, v3, v2

    const v4, 0xf4240

    if-ge p2, v4, :cond_7

    .line 293
    aget p2, v3, v0

    shr-int/lit8 v0, p2, 0x18

    if-nez v0, :cond_5

    shr-int/lit8 v0, p2, 0x10

    int-to-byte v0, v0

    .line 294
    aput-byte v0, p0, p1

    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x8

    int-to-byte v1, v1

    .line 295
    aput-byte v1, p0, v0

    add-int/lit8 p1, p1, 0x2

    goto :goto_1

    :cond_5
    if-ne v0, v1, :cond_6

    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x8

    int-to-byte v1, v1

    .line 296
    aput-byte v1, p0, p1

    move p1, v0

    :cond_6
    :goto_1
    int-to-byte p2, p2

    .line 297
    aput-byte p2, p0, p1

    add-int/lit8 p2, p1, 0x1

    shr-int/lit8 v0, v2, 0x10

    int-to-byte v0, v0

    .line 298
    aput-byte v0, p0, p2

    add-int/lit8 p2, p1, 0x2

    shr-int/lit8 v0, v2, 0x8

    int-to-byte v0, v0

    .line 299
    aput-byte v0, p0, p2

    add-int/lit8 p2, p1, 0x3

    int-to-byte v0, v2

    .line 300
    aput-byte v0, p0, p2

    add-int/lit8 p1, p1, 0x4

    return p1

    .line 301
    :cond_7
    div-int/lit16 p2, v0, 0x3e8

    mul-int/lit16 v4, p2, 0x3e8

    sub-int/2addr v0, v4

    .line 302
    div-int/lit16 v4, p2, 0x3e8

    .line 303
    aget v0, v3, v0

    if-nez v4, :cond_a

    .line 304
    aget p2, v3, p2

    shr-int/lit8 v3, p2, 0x18

    if-nez v3, :cond_8

    shr-int/lit8 v1, p2, 0x10

    int-to-byte v1, v1

    .line 305
    aput-byte v1, p0, p1

    add-int/lit8 v1, p1, 0x1

    shr-int/lit8 v3, p2, 0x8

    int-to-byte v3, v3

    .line 306
    aput-byte v3, p0, v1

    add-int/lit8 p1, p1, 0x2

    goto :goto_2

    :cond_8
    if-ne v3, v1, :cond_9

    add-int/lit8 v1, p1, 0x1

    shr-int/lit8 v3, p2, 0x8

    int-to-byte v3, v3

    .line 307
    aput-byte v3, p0, p1

    move p1, v1

    :cond_9
    :goto_2
    add-int/lit8 v1, p1, 0x1

    int-to-byte p2, p2

    .line 308
    aput-byte p2, p0, p1

    goto :goto_3

    :cond_a
    mul-int/lit16 v1, v4, 0x3e8

    sub-int/2addr p2, v1

    add-int/lit8 v4, v4, 0x30

    int-to-byte v1, v4

    .line 309
    aput-byte v1, p0, p1

    .line 310
    aget p2, v3, p2

    add-int/lit8 v1, p1, 0x1

    shr-int/lit8 v3, p2, 0x10

    int-to-byte v3, v3

    .line 311
    aput-byte v3, p0, v1

    add-int/lit8 v1, p1, 0x2

    shr-int/lit8 v3, p2, 0x8

    int-to-byte v3, v3

    .line 312
    aput-byte v3, p0, v1

    add-int/lit8 v1, p1, 0x3

    int-to-byte p2, p2

    .line 313
    aput-byte p2, p0, v1

    add-int/lit8 v1, p1, 0x4

    :goto_3
    shr-int/lit8 p1, v0, 0x10

    int-to-byte p1, p1

    .line 314
    aput-byte p1, p0, v1

    add-int/lit8 p1, v1, 0x1

    shr-int/lit8 p2, v0, 0x8

    int-to-byte p2, p2

    .line 315
    aput-byte p2, p0, p1

    add-int/lit8 p1, v1, 0x2

    int-to-byte p2, v0

    .line 316
    aput-byte p2, p0, p1

    add-int/lit8 p1, v1, 0x3

    shr-int/lit8 p2, v2, 0x10

    int-to-byte p2, p2

    .line 317
    aput-byte p2, p0, p1

    add-int/lit8 p1, v1, 0x4

    shr-int/lit8 p2, v2, 0x8

    int-to-byte p2, p2

    .line 318
    aput-byte p2, p0, p1

    add-int/lit8 p1, v1, 0x5

    int-to-byte p2, v2

    .line 319
    aput-byte p2, p0, p1

    add-int/lit8 v1, v1, 0x6

    return v1
.end method

.method public static writeInt32([CII)I
    .locals 5

    .line 1
    if-gez p2, :cond_1

    .line 2
    .line 3
    const/high16 v0, -0x80000000

    .line 4
    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    sget-object p2, Lcom/alibaba/fastjson2/util/IOUtils;->MIN_INT_CHARS:[C

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    array-length v1, p2

    .line 11
    invoke-static {p2, v0, p0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 12
    .line 13
    .line 14
    array-length p0, p2

    .line 15
    add-int/2addr p1, p0

    .line 16
    return p1

    .line 17
    :cond_0
    neg-int p2, p2

    .line 18
    add-int/lit8 v0, p1, 0x1

    .line 19
    .line 20
    const/16 v1, 0x2d

    .line 21
    .line 22
    aput-char v1, p0, p1

    .line 23
    .line 24
    move p1, v0

    .line 25
    :cond_1
    const/16 v0, 0x3e8

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    if-ge p2, v0, :cond_4

    .line 29
    .line 30
    sget-object v0, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 31
    .line 32
    aget p2, v0, p2

    .line 33
    .line 34
    shr-int/lit8 v0, p2, 0x18

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    shr-int/lit8 v0, p2, 0x10

    .line 39
    .line 40
    int-to-byte v0, v0

    .line 41
    int-to-char v0, v0

    .line 42
    aput-char v0, p0, p1

    .line 43
    .line 44
    add-int/lit8 v0, p1, 0x1

    .line 45
    .line 46
    shr-int/lit8 v1, p2, 0x8

    .line 47
    .line 48
    int-to-byte v1, v1

    .line 49
    int-to-char v1, v1

    .line 50
    aput-char v1, p0, v0

    .line 51
    .line 52
    add-int/lit8 p1, p1, 0x2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    if-ne v0, v1, :cond_3

    .line 56
    .line 57
    add-int/lit8 v0, p1, 0x1

    .line 58
    .line 59
    shr-int/lit8 v1, p2, 0x8

    .line 60
    .line 61
    int-to-byte v1, v1

    .line 62
    int-to-char v1, v1

    .line 63
    aput-char v1, p0, p1

    .line 64
    .line 65
    move p1, v0

    .line 66
    :cond_3
    :goto_0
    add-int/lit8 v0, p1, 0x1

    .line 67
    .line 68
    int-to-byte p2, p2

    .line 69
    int-to-char p2, p2

    .line 70
    aput-char p2, p0, p1

    .line 71
    .line 72
    return v0

    .line 73
    :cond_4
    div-int/lit16 v0, p2, 0x3e8

    .line 74
    .line 75
    mul-int/lit16 v2, v0, 0x3e8

    .line 76
    .line 77
    sub-int v2, p2, v2

    .line 78
    .line 79
    sget-object v3, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 80
    .line 81
    aget v2, v3, v2

    .line 82
    .line 83
    const v4, 0xf4240

    .line 84
    .line 85
    .line 86
    if-ge p2, v4, :cond_7

    .line 87
    .line 88
    aget p2, v3, v0

    .line 89
    .line 90
    shr-int/lit8 v0, p2, 0x18

    .line 91
    .line 92
    if-nez v0, :cond_5

    .line 93
    .line 94
    shr-int/lit8 v0, p2, 0x10

    .line 95
    .line 96
    int-to-byte v0, v0

    .line 97
    int-to-char v0, v0

    .line 98
    aput-char v0, p0, p1

    .line 99
    .line 100
    add-int/lit8 v0, p1, 0x1

    .line 101
    .line 102
    shr-int/lit8 v1, p2, 0x8

    .line 103
    .line 104
    int-to-byte v1, v1

    .line 105
    int-to-char v1, v1

    .line 106
    aput-char v1, p0, v0

    .line 107
    .line 108
    add-int/lit8 p1, p1, 0x2

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_5
    if-ne v0, v1, :cond_6

    .line 112
    .line 113
    add-int/lit8 v0, p1, 0x1

    .line 114
    .line 115
    shr-int/lit8 v1, p2, 0x8

    .line 116
    .line 117
    int-to-byte v1, v1

    .line 118
    int-to-char v1, v1

    .line 119
    aput-char v1, p0, p1

    .line 120
    .line 121
    move p1, v0

    .line 122
    :cond_6
    :goto_1
    int-to-byte p2, p2

    .line 123
    int-to-char p2, p2

    .line 124
    aput-char p2, p0, p1

    .line 125
    .line 126
    add-int/lit8 p2, p1, 0x1

    .line 127
    .line 128
    shr-int/lit8 v0, v2, 0x10

    .line 129
    .line 130
    int-to-byte v0, v0

    .line 131
    int-to-char v0, v0

    .line 132
    aput-char v0, p0, p2

    .line 133
    .line 134
    add-int/lit8 p2, p1, 0x2

    .line 135
    .line 136
    shr-int/lit8 v0, v2, 0x8

    .line 137
    .line 138
    int-to-byte v0, v0

    .line 139
    int-to-char v0, v0

    .line 140
    aput-char v0, p0, p2

    .line 141
    .line 142
    add-int/lit8 p2, p1, 0x3

    .line 143
    .line 144
    int-to-byte v0, v2

    .line 145
    int-to-char v0, v0

    .line 146
    aput-char v0, p0, p2

    .line 147
    .line 148
    add-int/lit8 p1, p1, 0x4

    .line 149
    .line 150
    return p1

    .line 151
    :cond_7
    div-int/lit16 p2, v0, 0x3e8

    .line 152
    .line 153
    mul-int/lit16 v4, p2, 0x3e8

    .line 154
    .line 155
    sub-int/2addr v0, v4

    .line 156
    div-int/lit16 v4, p2, 0x3e8

    .line 157
    .line 158
    aget v0, v3, v0

    .line 159
    .line 160
    if-nez v4, :cond_a

    .line 161
    .line 162
    aget p2, v3, p2

    .line 163
    .line 164
    shr-int/lit8 v3, p2, 0x18

    .line 165
    .line 166
    if-nez v3, :cond_8

    .line 167
    .line 168
    shr-int/lit8 v1, p2, 0x10

    .line 169
    .line 170
    int-to-byte v1, v1

    .line 171
    int-to-char v1, v1

    .line 172
    aput-char v1, p0, p1

    .line 173
    .line 174
    add-int/lit8 v1, p1, 0x1

    .line 175
    .line 176
    shr-int/lit8 v3, p2, 0x8

    .line 177
    .line 178
    int-to-byte v3, v3

    .line 179
    int-to-char v3, v3

    .line 180
    aput-char v3, p0, v1

    .line 181
    .line 182
    add-int/lit8 p1, p1, 0x2

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_8
    if-ne v3, v1, :cond_9

    .line 186
    .line 187
    add-int/lit8 v1, p1, 0x1

    .line 188
    .line 189
    shr-int/lit8 v3, p2, 0x8

    .line 190
    .line 191
    int-to-byte v3, v3

    .line 192
    int-to-char v3, v3

    .line 193
    aput-char v3, p0, p1

    .line 194
    .line 195
    move p1, v1

    .line 196
    :cond_9
    :goto_2
    add-int/lit8 v1, p1, 0x1

    .line 197
    .line 198
    int-to-byte p2, p2

    .line 199
    int-to-char p2, p2

    .line 200
    aput-char p2, p0, p1

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_a
    mul-int/lit16 v1, v4, 0x3e8

    .line 204
    .line 205
    sub-int/2addr p2, v1

    .line 206
    add-int/lit8 v4, v4, 0x30

    .line 207
    .line 208
    int-to-byte v1, v4

    .line 209
    int-to-char v1, v1

    .line 210
    aput-char v1, p0, p1

    .line 211
    .line 212
    aget p2, v3, p2

    .line 213
    .line 214
    add-int/lit8 v1, p1, 0x1

    .line 215
    .line 216
    shr-int/lit8 v3, p2, 0x10

    .line 217
    .line 218
    int-to-byte v3, v3

    .line 219
    int-to-char v3, v3

    .line 220
    aput-char v3, p0, v1

    .line 221
    .line 222
    add-int/lit8 v1, p1, 0x2

    .line 223
    .line 224
    shr-int/lit8 v3, p2, 0x8

    .line 225
    .line 226
    int-to-byte v3, v3

    .line 227
    int-to-char v3, v3

    .line 228
    aput-char v3, p0, v1

    .line 229
    .line 230
    add-int/lit8 v1, p1, 0x3

    .line 231
    .line 232
    int-to-byte p2, p2

    .line 233
    int-to-char p2, p2

    .line 234
    aput-char p2, p0, v1

    .line 235
    .line 236
    add-int/lit8 v1, p1, 0x4

    .line 237
    .line 238
    :goto_3
    shr-int/lit8 p1, v0, 0x10

    .line 239
    .line 240
    int-to-byte p1, p1

    .line 241
    int-to-char p1, p1

    .line 242
    aput-char p1, p0, v1

    .line 243
    .line 244
    add-int/lit8 p1, v1, 0x1

    .line 245
    .line 246
    shr-int/lit8 p2, v0, 0x8

    .line 247
    .line 248
    int-to-byte p2, p2

    .line 249
    int-to-char p2, p2

    .line 250
    aput-char p2, p0, p1

    .line 251
    .line 252
    add-int/lit8 p1, v1, 0x2

    .line 253
    .line 254
    int-to-byte p2, v0

    .line 255
    int-to-char p2, p2

    .line 256
    aput-char p2, p0, p1

    .line 257
    .line 258
    add-int/lit8 p1, v1, 0x3

    .line 259
    .line 260
    shr-int/lit8 p2, v2, 0x10

    .line 261
    .line 262
    int-to-byte p2, p2

    .line 263
    int-to-char p2, p2

    .line 264
    aput-char p2, p0, p1

    .line 265
    .line 266
    add-int/lit8 p1, v1, 0x4

    .line 267
    .line 268
    shr-int/lit8 p2, v2, 0x8

    .line 269
    .line 270
    int-to-byte p2, p2

    .line 271
    int-to-char p2, p2

    .line 272
    aput-char p2, p0, p1

    .line 273
    .line 274
    add-int/lit8 p1, v1, 0x5

    .line 275
    .line 276
    int-to-byte p2, v2

    .line 277
    int-to-char p2, p2

    .line 278
    aput-char p2, p0, p1

    .line 279
    .line 280
    add-int/lit8 v1, v1, 0x6

    .line 281
    .line 282
    return v1
.end method

.method public static writeInt64([BIJ)I
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-wide/from16 v2, p2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-gez v4, :cond_1

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v4, v2, v4

    if-nez v4, :cond_0

    .line 750
    sget-object v2, Lcom/alibaba/fastjson2/util/IOUtils;->MIN_LONG:[B

    const/4 v3, 0x0

    array-length v4, v2

    invoke-static {v2, v3, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 751
    array-length v0, v2

    add-int/2addr v0, v1

    return v0

    :cond_0
    neg-long v2, v2

    add-int/lit8 v4, v1, 0x1

    const/16 v5, 0x2d

    .line 752
    aput-byte v5, v0, v1

    move v1, v4

    :cond_1
    const-wide/16 v4, 0x3e8

    cmp-long v6, v2, v4

    const/4 v7, 0x1

    if-gez v6, :cond_4

    .line 753
    sget-object v4, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    long-to-int v2, v2

    aget v2, v4, v2

    shr-int/lit8 v3, v2, 0x18

    if-nez v3, :cond_2

    shr-int/lit8 v3, v2, 0x10

    int-to-byte v3, v3

    .line 754
    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x1

    shr-int/lit8 v4, v2, 0x8

    int-to-byte v4, v4

    .line 755
    aput-byte v4, v0, v3

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_2
    if-ne v3, v7, :cond_3

    add-int/lit8 v3, v1, 0x1

    shr-int/lit8 v4, v2, 0x8

    int-to-byte v4, v4

    .line 756
    aput-byte v4, v0, v1

    move v1, v3

    :cond_3
    :goto_0
    add-int/lit8 v3, v1, 0x1

    int-to-byte v2, v2

    .line 757
    aput-byte v2, v0, v1

    return v3

    .line 758
    :cond_4
    div-long v8, v2, v4

    mul-long v10, v8, v4

    sub-long v10, v2, v10

    long-to-int v6, v10

    .line 759
    sget-object v10, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    aget v6, v10, v6

    const-wide/32 v11, 0xf4240

    cmp-long v11, v2, v11

    if-gez v11, :cond_7

    long-to-int v2, v8

    .line 760
    aget v2, v10, v2

    shr-int/lit8 v3, v2, 0x18

    if-nez v3, :cond_5

    shr-int/lit8 v3, v2, 0x10

    int-to-byte v3, v3

    .line 761
    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x1

    shr-int/lit8 v4, v2, 0x8

    int-to-byte v4, v4

    .line 762
    aput-byte v4, v0, v3

    add-int/lit8 v1, v1, 0x2

    goto :goto_1

    :cond_5
    if-ne v3, v7, :cond_6

    add-int/lit8 v3, v1, 0x1

    shr-int/lit8 v4, v2, 0x8

    int-to-byte v4, v4

    .line 763
    aput-byte v4, v0, v1

    move v1, v3

    :cond_6
    :goto_1
    int-to-byte v2, v2

    .line 764
    aput-byte v2, v0, v1

    add-int/lit8 v2, v1, 0x1

    shr-int/lit8 v3, v6, 0x10

    int-to-byte v3, v3

    .line 765
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x2

    shr-int/lit8 v3, v6, 0x8

    int-to-byte v3, v3

    .line 766
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x3

    int-to-byte v3, v6

    .line 767
    aput-byte v3, v0, v2

    add-int/lit8 v1, v1, 0x4

    return v1

    .line 768
    :cond_7
    div-long v11, v8, v4

    mul-long v13, v11, v4

    sub-long/2addr v8, v13

    long-to-int v8, v8

    .line 769
    aget v8, v10, v8

    const-wide/32 v13, 0x3b9aca00

    cmp-long v9, v2, v13

    if-gez v9, :cond_a

    long-to-int v2, v11

    .line 770
    aget v2, v10, v2

    shr-int/lit8 v3, v2, 0x18

    if-nez v3, :cond_8

    shr-int/lit8 v3, v2, 0x10

    int-to-byte v3, v3

    .line 771
    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x1

    shr-int/lit8 v4, v2, 0x8

    int-to-byte v4, v4

    .line 772
    aput-byte v4, v0, v3

    add-int/lit8 v1, v1, 0x2

    goto :goto_2

    :cond_8
    if-ne v3, v7, :cond_9

    add-int/lit8 v3, v1, 0x1

    shr-int/lit8 v4, v2, 0x8

    int-to-byte v4, v4

    .line 773
    aput-byte v4, v0, v1

    move v1, v3

    :cond_9
    :goto_2
    int-to-byte v2, v2

    .line 774
    aput-byte v2, v0, v1

    add-int/lit8 v2, v1, 0x1

    shr-int/lit8 v3, v8, 0x10

    int-to-byte v3, v3

    .line 775
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x2

    shr-int/lit8 v3, v8, 0x8

    int-to-byte v3, v3

    .line 776
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x3

    int-to-byte v3, v8

    .line 777
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x4

    shr-int/lit8 v3, v6, 0x10

    int-to-byte v3, v3

    .line 778
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x5

    shr-int/lit8 v3, v6, 0x8

    int-to-byte v3, v3

    .line 779
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x6

    int-to-byte v3, v6

    .line 780
    aput-byte v3, v0, v2

    add-int/lit8 v1, v1, 0x7

    return v1

    .line 781
    :cond_a
    div-long v13, v11, v4

    mul-long v15, v13, v4

    sub-long/2addr v11, v15

    long-to-int v9, v11

    .line 782
    aget v9, v10, v9

    const-wide v11, 0xe8d4a51000L

    cmp-long v11, v2, v11

    if-gez v11, :cond_d

    long-to-int v2, v13

    .line 783
    aget v2, v10, v2

    shr-int/lit8 v3, v2, 0x18

    if-nez v3, :cond_b

    shr-int/lit8 v3, v2, 0x10

    int-to-byte v3, v3

    .line 784
    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x1

    shr-int/lit8 v4, v2, 0x8

    int-to-byte v4, v4

    .line 785
    aput-byte v4, v0, v3

    add-int/lit8 v1, v1, 0x2

    goto :goto_3

    :cond_b
    if-ne v3, v7, :cond_c

    add-int/lit8 v3, v1, 0x1

    shr-int/lit8 v4, v2, 0x8

    int-to-byte v4, v4

    .line 786
    aput-byte v4, v0, v1

    move v1, v3

    :cond_c
    :goto_3
    int-to-byte v2, v2

    .line 787
    aput-byte v2, v0, v1

    add-int/lit8 v2, v1, 0x1

    shr-int/lit8 v3, v9, 0x10

    int-to-byte v3, v3

    .line 788
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x2

    shr-int/lit8 v3, v9, 0x8

    int-to-byte v3, v3

    .line 789
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x3

    int-to-byte v3, v9

    .line 790
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x4

    shr-int/lit8 v3, v8, 0x10

    int-to-byte v3, v3

    .line 791
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x5

    shr-int/lit8 v3, v8, 0x8

    int-to-byte v3, v3

    .line 792
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x6

    int-to-byte v3, v8

    .line 793
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x7

    shr-int/lit8 v3, v6, 0x10

    int-to-byte v3, v3

    .line 794
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x8

    shr-int/lit8 v3, v6, 0x8

    int-to-byte v3, v3

    .line 795
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x9

    int-to-byte v3, v6

    .line 796
    aput-byte v3, v0, v2

    add-int/lit8 v1, v1, 0xa

    return v1

    .line 797
    :cond_d
    div-long v4, v13, v4

    long-to-int v4, v4

    mul-int/lit16 v5, v4, 0x3e8

    int-to-long v11, v5

    sub-long/2addr v13, v11

    long-to-int v5, v13

    .line 798
    aget v5, v10, v5

    const-wide v11, 0x38d7ea4c68000L

    cmp-long v2, v2, v11

    if-gez v2, :cond_10

    .line 799
    aget v2, v10, v4

    shr-int/lit8 v3, v2, 0x18

    if-nez v3, :cond_e

    shr-int/lit8 v3, v2, 0x10

    int-to-byte v3, v3

    .line 800
    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x1

    shr-int/lit8 v4, v2, 0x8

    int-to-byte v4, v4

    .line 801
    aput-byte v4, v0, v3

    add-int/lit8 v1, v1, 0x2

    goto :goto_4

    :cond_e
    if-ne v3, v7, :cond_f

    add-int/lit8 v3, v1, 0x1

    shr-int/lit8 v4, v2, 0x8

    int-to-byte v4, v4

    .line 802
    aput-byte v4, v0, v1

    move v1, v3

    :cond_f
    :goto_4
    int-to-byte v2, v2

    .line 803
    aput-byte v2, v0, v1

    add-int/lit8 v2, v1, 0x1

    shr-int/lit8 v3, v5, 0x10

    int-to-byte v3, v3

    .line 804
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x2

    shr-int/lit8 v3, v5, 0x8

    int-to-byte v3, v3

    .line 805
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x3

    int-to-byte v3, v5

    .line 806
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x4

    shr-int/lit8 v3, v9, 0x10

    int-to-byte v3, v3

    .line 807
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x5

    shr-int/lit8 v3, v9, 0x8

    int-to-byte v3, v3

    .line 808
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x6

    int-to-byte v3, v9

    .line 809
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x7

    shr-int/lit8 v3, v8, 0x10

    int-to-byte v3, v3

    .line 810
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x8

    shr-int/lit8 v3, v8, 0x8

    int-to-byte v3, v3

    .line 811
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x9

    int-to-byte v3, v8

    .line 812
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0xa

    shr-int/lit8 v3, v6, 0x10

    int-to-byte v3, v3

    .line 813
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0xb

    shr-int/lit8 v3, v6, 0x8

    int-to-byte v3, v3

    .line 814
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0xc

    int-to-byte v3, v6

    .line 815
    aput-byte v3, v0, v2

    add-int/lit8 v1, v1, 0xd

    return v1

    .line 816
    :cond_10
    div-int/lit16 v2, v4, 0x3e8

    mul-int/lit16 v3, v2, 0x3e8

    sub-int/2addr v4, v3

    .line 817
    div-int/lit16 v3, v2, 0x3e8

    .line 818
    aget v4, v10, v4

    if-nez v3, :cond_13

    .line 819
    aget v2, v10, v2

    shr-int/lit8 v3, v2, 0x18

    if-nez v3, :cond_11

    shr-int/lit8 v3, v2, 0x10

    int-to-byte v3, v3

    .line 820
    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x1

    shr-int/lit8 v7, v2, 0x8

    int-to-byte v7, v7

    .line 821
    aput-byte v7, v0, v3

    add-int/lit8 v1, v1, 0x2

    goto :goto_5

    :cond_11
    if-ne v3, v7, :cond_12

    add-int/lit8 v3, v1, 0x1

    shr-int/lit8 v7, v2, 0x8

    int-to-byte v7, v7

    .line 822
    aput-byte v7, v0, v1

    move v1, v3

    :cond_12
    :goto_5
    add-int/lit8 v3, v1, 0x1

    int-to-byte v2, v2

    .line 823
    aput-byte v2, v0, v1

    goto :goto_6

    :cond_13
    mul-int/lit16 v7, v3, 0x3e8

    sub-int/2addr v2, v7

    add-int/lit8 v3, v3, 0x30

    int-to-byte v3, v3

    .line 824
    aput-byte v3, v0, v1

    .line 825
    aget v2, v10, v2

    add-int/lit8 v3, v1, 0x1

    shr-int/lit8 v7, v2, 0x10

    int-to-byte v7, v7

    .line 826
    aput-byte v7, v0, v3

    add-int/lit8 v3, v1, 0x2

    shr-int/lit8 v7, v2, 0x8

    int-to-byte v7, v7

    .line 827
    aput-byte v7, v0, v3

    add-int/lit8 v3, v1, 0x3

    int-to-byte v2, v2

    .line 828
    aput-byte v2, v0, v3

    add-int/lit8 v3, v1, 0x4

    :goto_6
    shr-int/lit8 v1, v4, 0x10

    int-to-byte v1, v1

    .line 829
    aput-byte v1, v0, v3

    add-int/lit8 v1, v3, 0x1

    shr-int/lit8 v2, v4, 0x8

    int-to-byte v2, v2

    .line 830
    aput-byte v2, v0, v1

    add-int/lit8 v1, v3, 0x2

    int-to-byte v2, v4

    .line 831
    aput-byte v2, v0, v1

    add-int/lit8 v1, v3, 0x3

    shr-int/lit8 v2, v5, 0x10

    int-to-byte v2, v2

    .line 832
    aput-byte v2, v0, v1

    add-int/lit8 v1, v3, 0x4

    shr-int/lit8 v2, v5, 0x8

    int-to-byte v2, v2

    .line 833
    aput-byte v2, v0, v1

    add-int/lit8 v1, v3, 0x5

    int-to-byte v2, v5

    .line 834
    aput-byte v2, v0, v1

    add-int/lit8 v1, v3, 0x6

    shr-int/lit8 v2, v9, 0x10

    int-to-byte v2, v2

    .line 835
    aput-byte v2, v0, v1

    add-int/lit8 v1, v3, 0x7

    shr-int/lit8 v2, v9, 0x8

    int-to-byte v2, v2

    .line 836
    aput-byte v2, v0, v1

    add-int/lit8 v1, v3, 0x8

    int-to-byte v2, v9

    .line 837
    aput-byte v2, v0, v1

    add-int/lit8 v1, v3, 0x9

    shr-int/lit8 v2, v8, 0x10

    int-to-byte v2, v2

    .line 838
    aput-byte v2, v0, v1

    add-int/lit8 v1, v3, 0xa

    shr-int/lit8 v2, v8, 0x8

    int-to-byte v2, v2

    .line 839
    aput-byte v2, v0, v1

    add-int/lit8 v1, v3, 0xb

    int-to-byte v2, v8

    .line 840
    aput-byte v2, v0, v1

    add-int/lit8 v1, v3, 0xc

    shr-int/lit8 v2, v6, 0x10

    int-to-byte v2, v2

    .line 841
    aput-byte v2, v0, v1

    add-int/lit8 v1, v3, 0xd

    shr-int/lit8 v2, v6, 0x8

    int-to-byte v2, v2

    .line 842
    aput-byte v2, v0, v1

    add-int/lit8 v1, v3, 0xe

    int-to-byte v2, v6

    .line 843
    aput-byte v2, v0, v1

    add-int/lit8 v3, v3, 0xf

    return v3
.end method

.method public static writeInt64([CIJ)I
    .locals 16

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-gez v2, :cond_2

    .line 8
    .line 9
    const-wide/high16 v2, -0x8000000000000000L

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :goto_0
    sget-object v1, Lcom/alibaba/fastjson2/util/IOUtils;->MIN_LONG:[B

    .line 17
    .line 18
    array-length v2, v1

    .line 19
    if-ge v0, v2, :cond_0

    .line 20
    .line 21
    add-int v2, p1, v0

    .line 22
    .line 23
    aget-byte v1, v1, v0

    .line 24
    .line 25
    int-to-char v1, v1

    .line 26
    aput-char v1, p0, v2

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    array-length v0, v1

    .line 32
    add-int v0, p1, v0

    .line 33
    .line 34
    return v0

    .line 35
    :cond_1
    neg-long v0, v0

    .line 36
    add-int/lit8 v2, p1, 0x1

    .line 37
    .line 38
    const/16 v3, 0x2d

    .line 39
    .line 40
    aput-char v3, p0, p1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move/from16 v2, p1

    .line 44
    .line 45
    :goto_1
    const-wide/16 v3, 0x3e8

    .line 46
    .line 47
    cmp-long v5, v0, v3

    .line 48
    .line 49
    const/4 v6, 0x1

    .line 50
    if-gez v5, :cond_5

    .line 51
    .line 52
    sget-object v3, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 53
    .line 54
    long-to-int v0, v0

    .line 55
    aget v0, v3, v0

    .line 56
    .line 57
    shr-int/lit8 v1, v0, 0x18

    .line 58
    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    shr-int/lit8 v1, v0, 0x10

    .line 62
    .line 63
    int-to-byte v1, v1

    .line 64
    int-to-char v1, v1

    .line 65
    aput-char v1, p0, v2

    .line 66
    .line 67
    add-int/lit8 v1, v2, 0x1

    .line 68
    .line 69
    shr-int/lit8 v3, v0, 0x8

    .line 70
    .line 71
    int-to-byte v3, v3

    .line 72
    int-to-char v3, v3

    .line 73
    aput-char v3, p0, v1

    .line 74
    .line 75
    add-int/lit8 v2, v2, 0x2

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    if-ne v1, v6, :cond_4

    .line 79
    .line 80
    add-int/lit8 v1, v2, 0x1

    .line 81
    .line 82
    shr-int/lit8 v3, v0, 0x8

    .line 83
    .line 84
    int-to-byte v3, v3

    .line 85
    int-to-char v3, v3

    .line 86
    aput-char v3, p0, v2

    .line 87
    .line 88
    move v2, v1

    .line 89
    :cond_4
    :goto_2
    add-int/lit8 v1, v2, 0x1

    .line 90
    .line 91
    int-to-byte v0, v0

    .line 92
    int-to-char v0, v0

    .line 93
    aput-char v0, p0, v2

    .line 94
    .line 95
    return v1

    .line 96
    :cond_5
    div-long v7, v0, v3

    .line 97
    .line 98
    mul-long v9, v7, v3

    .line 99
    .line 100
    sub-long v9, v0, v9

    .line 101
    .line 102
    long-to-int v5, v9

    .line 103
    sget-object v9, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 104
    .line 105
    aget v5, v9, v5

    .line 106
    .line 107
    const-wide/32 v10, 0xf4240

    .line 108
    .line 109
    .line 110
    cmp-long v10, v0, v10

    .line 111
    .line 112
    if-gez v10, :cond_8

    .line 113
    .line 114
    long-to-int v0, v7

    .line 115
    aget v0, v9, v0

    .line 116
    .line 117
    shr-int/lit8 v1, v0, 0x18

    .line 118
    .line 119
    if-nez v1, :cond_6

    .line 120
    .line 121
    shr-int/lit8 v1, v0, 0x10

    .line 122
    .line 123
    int-to-byte v1, v1

    .line 124
    int-to-char v1, v1

    .line 125
    aput-char v1, p0, v2

    .line 126
    .line 127
    add-int/lit8 v1, v2, 0x1

    .line 128
    .line 129
    shr-int/lit8 v3, v0, 0x8

    .line 130
    .line 131
    int-to-byte v3, v3

    .line 132
    int-to-char v3, v3

    .line 133
    aput-char v3, p0, v1

    .line 134
    .line 135
    add-int/lit8 v2, v2, 0x2

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_6
    if-ne v1, v6, :cond_7

    .line 139
    .line 140
    add-int/lit8 v1, v2, 0x1

    .line 141
    .line 142
    shr-int/lit8 v3, v0, 0x8

    .line 143
    .line 144
    int-to-byte v3, v3

    .line 145
    int-to-char v3, v3

    .line 146
    aput-char v3, p0, v2

    .line 147
    .line 148
    move v2, v1

    .line 149
    :cond_7
    :goto_3
    int-to-byte v0, v0

    .line 150
    int-to-char v0, v0

    .line 151
    aput-char v0, p0, v2

    .line 152
    .line 153
    add-int/lit8 v0, v2, 0x1

    .line 154
    .line 155
    shr-int/lit8 v1, v5, 0x10

    .line 156
    .line 157
    int-to-byte v1, v1

    .line 158
    int-to-char v1, v1

    .line 159
    aput-char v1, p0, v0

    .line 160
    .line 161
    add-int/lit8 v0, v2, 0x2

    .line 162
    .line 163
    shr-int/lit8 v1, v5, 0x8

    .line 164
    .line 165
    int-to-byte v1, v1

    .line 166
    int-to-char v1, v1

    .line 167
    aput-char v1, p0, v0

    .line 168
    .line 169
    add-int/lit8 v0, v2, 0x3

    .line 170
    .line 171
    int-to-byte v1, v5

    .line 172
    int-to-char v1, v1

    .line 173
    aput-char v1, p0, v0

    .line 174
    .line 175
    add-int/lit8 v2, v2, 0x4

    .line 176
    .line 177
    return v2

    .line 178
    :cond_8
    div-long v10, v7, v3

    .line 179
    .line 180
    mul-long v12, v10, v3

    .line 181
    .line 182
    sub-long/2addr v7, v12

    .line 183
    long-to-int v7, v7

    .line 184
    aget v7, v9, v7

    .line 185
    .line 186
    const-wide/32 v12, 0x3b9aca00

    .line 187
    .line 188
    .line 189
    cmp-long v8, v0, v12

    .line 190
    .line 191
    if-gez v8, :cond_b

    .line 192
    .line 193
    long-to-int v0, v10

    .line 194
    aget v0, v9, v0

    .line 195
    .line 196
    shr-int/lit8 v1, v0, 0x18

    .line 197
    .line 198
    if-nez v1, :cond_9

    .line 199
    .line 200
    shr-int/lit8 v1, v0, 0x10

    .line 201
    .line 202
    int-to-byte v1, v1

    .line 203
    int-to-char v1, v1

    .line 204
    aput-char v1, p0, v2

    .line 205
    .line 206
    add-int/lit8 v1, v2, 0x1

    .line 207
    .line 208
    shr-int/lit8 v3, v0, 0x8

    .line 209
    .line 210
    int-to-byte v3, v3

    .line 211
    int-to-char v3, v3

    .line 212
    aput-char v3, p0, v1

    .line 213
    .line 214
    add-int/lit8 v2, v2, 0x2

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_9
    if-ne v1, v6, :cond_a

    .line 218
    .line 219
    add-int/lit8 v1, v2, 0x1

    .line 220
    .line 221
    shr-int/lit8 v3, v0, 0x8

    .line 222
    .line 223
    int-to-byte v3, v3

    .line 224
    int-to-char v3, v3

    .line 225
    aput-char v3, p0, v2

    .line 226
    .line 227
    move v2, v1

    .line 228
    :cond_a
    :goto_4
    int-to-byte v0, v0

    .line 229
    int-to-char v0, v0

    .line 230
    aput-char v0, p0, v2

    .line 231
    .line 232
    add-int/lit8 v0, v2, 0x1

    .line 233
    .line 234
    shr-int/lit8 v1, v7, 0x10

    .line 235
    .line 236
    int-to-byte v1, v1

    .line 237
    int-to-char v1, v1

    .line 238
    aput-char v1, p0, v0

    .line 239
    .line 240
    add-int/lit8 v0, v2, 0x2

    .line 241
    .line 242
    shr-int/lit8 v1, v7, 0x8

    .line 243
    .line 244
    int-to-byte v1, v1

    .line 245
    int-to-char v1, v1

    .line 246
    aput-char v1, p0, v0

    .line 247
    .line 248
    add-int/lit8 v0, v2, 0x3

    .line 249
    .line 250
    int-to-byte v1, v7

    .line 251
    int-to-char v1, v1

    .line 252
    aput-char v1, p0, v0

    .line 253
    .line 254
    add-int/lit8 v0, v2, 0x4

    .line 255
    .line 256
    shr-int/lit8 v1, v5, 0x10

    .line 257
    .line 258
    int-to-byte v1, v1

    .line 259
    int-to-char v1, v1

    .line 260
    aput-char v1, p0, v0

    .line 261
    .line 262
    add-int/lit8 v0, v2, 0x5

    .line 263
    .line 264
    shr-int/lit8 v1, v5, 0x8

    .line 265
    .line 266
    int-to-byte v1, v1

    .line 267
    int-to-char v1, v1

    .line 268
    aput-char v1, p0, v0

    .line 269
    .line 270
    add-int/lit8 v0, v2, 0x6

    .line 271
    .line 272
    int-to-byte v1, v5

    .line 273
    int-to-char v1, v1

    .line 274
    aput-char v1, p0, v0

    .line 275
    .line 276
    add-int/lit8 v2, v2, 0x7

    .line 277
    .line 278
    return v2

    .line 279
    :cond_b
    div-long v12, v10, v3

    .line 280
    .line 281
    mul-long v14, v12, v3

    .line 282
    .line 283
    sub-long/2addr v10, v14

    .line 284
    long-to-int v8, v10

    .line 285
    aget v8, v9, v8

    .line 286
    .line 287
    const-wide v10, 0xe8d4a51000L

    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    cmp-long v10, v0, v10

    .line 293
    .line 294
    if-gez v10, :cond_e

    .line 295
    .line 296
    long-to-int v0, v12

    .line 297
    aget v0, v9, v0

    .line 298
    .line 299
    shr-int/lit8 v1, v0, 0x18

    .line 300
    .line 301
    if-nez v1, :cond_c

    .line 302
    .line 303
    shr-int/lit8 v1, v0, 0x10

    .line 304
    .line 305
    int-to-byte v1, v1

    .line 306
    int-to-char v1, v1

    .line 307
    aput-char v1, p0, v2

    .line 308
    .line 309
    add-int/lit8 v1, v2, 0x1

    .line 310
    .line 311
    shr-int/lit8 v3, v0, 0x8

    .line 312
    .line 313
    int-to-byte v3, v3

    .line 314
    int-to-char v3, v3

    .line 315
    aput-char v3, p0, v1

    .line 316
    .line 317
    add-int/lit8 v2, v2, 0x2

    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_c
    if-ne v1, v6, :cond_d

    .line 321
    .line 322
    add-int/lit8 v1, v2, 0x1

    .line 323
    .line 324
    shr-int/lit8 v3, v0, 0x8

    .line 325
    .line 326
    int-to-byte v3, v3

    .line 327
    int-to-char v3, v3

    .line 328
    aput-char v3, p0, v2

    .line 329
    .line 330
    move v2, v1

    .line 331
    :cond_d
    :goto_5
    int-to-byte v0, v0

    .line 332
    int-to-char v0, v0

    .line 333
    aput-char v0, p0, v2

    .line 334
    .line 335
    add-int/lit8 v0, v2, 0x1

    .line 336
    .line 337
    shr-int/lit8 v1, v8, 0x10

    .line 338
    .line 339
    int-to-byte v1, v1

    .line 340
    int-to-char v1, v1

    .line 341
    aput-char v1, p0, v0

    .line 342
    .line 343
    add-int/lit8 v0, v2, 0x2

    .line 344
    .line 345
    shr-int/lit8 v1, v8, 0x8

    .line 346
    .line 347
    int-to-byte v1, v1

    .line 348
    int-to-char v1, v1

    .line 349
    aput-char v1, p0, v0

    .line 350
    .line 351
    add-int/lit8 v0, v2, 0x3

    .line 352
    .line 353
    int-to-byte v1, v8

    .line 354
    int-to-char v1, v1

    .line 355
    aput-char v1, p0, v0

    .line 356
    .line 357
    add-int/lit8 v0, v2, 0x4

    .line 358
    .line 359
    shr-int/lit8 v1, v7, 0x10

    .line 360
    .line 361
    int-to-byte v1, v1

    .line 362
    int-to-char v1, v1

    .line 363
    aput-char v1, p0, v0

    .line 364
    .line 365
    add-int/lit8 v0, v2, 0x5

    .line 366
    .line 367
    shr-int/lit8 v1, v7, 0x8

    .line 368
    .line 369
    int-to-byte v1, v1

    .line 370
    int-to-char v1, v1

    .line 371
    aput-char v1, p0, v0

    .line 372
    .line 373
    add-int/lit8 v0, v2, 0x6

    .line 374
    .line 375
    int-to-byte v1, v7

    .line 376
    int-to-char v1, v1

    .line 377
    aput-char v1, p0, v0

    .line 378
    .line 379
    add-int/lit8 v0, v2, 0x7

    .line 380
    .line 381
    shr-int/lit8 v1, v5, 0x10

    .line 382
    .line 383
    int-to-byte v1, v1

    .line 384
    int-to-char v1, v1

    .line 385
    aput-char v1, p0, v0

    .line 386
    .line 387
    add-int/lit8 v0, v2, 0x8

    .line 388
    .line 389
    shr-int/lit8 v1, v5, 0x8

    .line 390
    .line 391
    int-to-byte v1, v1

    .line 392
    int-to-char v1, v1

    .line 393
    aput-char v1, p0, v0

    .line 394
    .line 395
    add-int/lit8 v0, v2, 0x9

    .line 396
    .line 397
    int-to-byte v1, v5

    .line 398
    int-to-char v1, v1

    .line 399
    aput-char v1, p0, v0

    .line 400
    .line 401
    add-int/lit8 v2, v2, 0xa

    .line 402
    .line 403
    return v2

    .line 404
    :cond_e
    div-long v3, v12, v3

    .line 405
    .line 406
    long-to-int v3, v3

    .line 407
    mul-int/lit16 v4, v3, 0x3e8

    .line 408
    .line 409
    int-to-long v10, v4

    .line 410
    sub-long/2addr v12, v10

    .line 411
    long-to-int v4, v12

    .line 412
    aget v4, v9, v4

    .line 413
    .line 414
    const-wide v10, 0x38d7ea4c68000L

    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    cmp-long v0, v0, v10

    .line 420
    .line 421
    if-gez v0, :cond_11

    .line 422
    .line 423
    aget v0, v9, v3

    .line 424
    .line 425
    shr-int/lit8 v1, v0, 0x18

    .line 426
    .line 427
    if-nez v1, :cond_f

    .line 428
    .line 429
    shr-int/lit8 v1, v0, 0x10

    .line 430
    .line 431
    int-to-byte v1, v1

    .line 432
    int-to-char v1, v1

    .line 433
    aput-char v1, p0, v2

    .line 434
    .line 435
    add-int/lit8 v1, v2, 0x1

    .line 436
    .line 437
    shr-int/lit8 v3, v0, 0x8

    .line 438
    .line 439
    int-to-byte v3, v3

    .line 440
    int-to-char v3, v3

    .line 441
    aput-char v3, p0, v1

    .line 442
    .line 443
    add-int/lit8 v2, v2, 0x2

    .line 444
    .line 445
    goto :goto_6

    .line 446
    :cond_f
    if-ne v1, v6, :cond_10

    .line 447
    .line 448
    add-int/lit8 v1, v2, 0x1

    .line 449
    .line 450
    shr-int/lit8 v3, v0, 0x8

    .line 451
    .line 452
    int-to-byte v3, v3

    .line 453
    int-to-char v3, v3

    .line 454
    aput-char v3, p0, v2

    .line 455
    .line 456
    move v2, v1

    .line 457
    :cond_10
    :goto_6
    int-to-byte v0, v0

    .line 458
    int-to-char v0, v0

    .line 459
    aput-char v0, p0, v2

    .line 460
    .line 461
    add-int/lit8 v0, v2, 0x1

    .line 462
    .line 463
    shr-int/lit8 v1, v4, 0x10

    .line 464
    .line 465
    int-to-byte v1, v1

    .line 466
    int-to-char v1, v1

    .line 467
    aput-char v1, p0, v0

    .line 468
    .line 469
    add-int/lit8 v0, v2, 0x2

    .line 470
    .line 471
    shr-int/lit8 v1, v4, 0x8

    .line 472
    .line 473
    int-to-byte v1, v1

    .line 474
    int-to-char v1, v1

    .line 475
    aput-char v1, p0, v0

    .line 476
    .line 477
    add-int/lit8 v0, v2, 0x3

    .line 478
    .line 479
    int-to-byte v1, v4

    .line 480
    int-to-char v1, v1

    .line 481
    aput-char v1, p0, v0

    .line 482
    .line 483
    add-int/lit8 v0, v2, 0x4

    .line 484
    .line 485
    shr-int/lit8 v1, v8, 0x10

    .line 486
    .line 487
    int-to-byte v1, v1

    .line 488
    int-to-char v1, v1

    .line 489
    aput-char v1, p0, v0

    .line 490
    .line 491
    add-int/lit8 v0, v2, 0x5

    .line 492
    .line 493
    shr-int/lit8 v1, v8, 0x8

    .line 494
    .line 495
    int-to-byte v1, v1

    .line 496
    int-to-char v1, v1

    .line 497
    aput-char v1, p0, v0

    .line 498
    .line 499
    add-int/lit8 v0, v2, 0x6

    .line 500
    .line 501
    int-to-byte v1, v8

    .line 502
    int-to-char v1, v1

    .line 503
    aput-char v1, p0, v0

    .line 504
    .line 505
    add-int/lit8 v0, v2, 0x7

    .line 506
    .line 507
    shr-int/lit8 v1, v7, 0x10

    .line 508
    .line 509
    int-to-byte v1, v1

    .line 510
    int-to-char v1, v1

    .line 511
    aput-char v1, p0, v0

    .line 512
    .line 513
    add-int/lit8 v0, v2, 0x8

    .line 514
    .line 515
    shr-int/lit8 v1, v7, 0x8

    .line 516
    .line 517
    int-to-byte v1, v1

    .line 518
    int-to-char v1, v1

    .line 519
    aput-char v1, p0, v0

    .line 520
    .line 521
    add-int/lit8 v0, v2, 0x9

    .line 522
    .line 523
    int-to-byte v1, v7

    .line 524
    int-to-char v1, v1

    .line 525
    aput-char v1, p0, v0

    .line 526
    .line 527
    add-int/lit8 v0, v2, 0xa

    .line 528
    .line 529
    shr-int/lit8 v1, v5, 0x10

    .line 530
    .line 531
    int-to-byte v1, v1

    .line 532
    int-to-char v1, v1

    .line 533
    aput-char v1, p0, v0

    .line 534
    .line 535
    add-int/lit8 v0, v2, 0xb

    .line 536
    .line 537
    shr-int/lit8 v1, v5, 0x8

    .line 538
    .line 539
    int-to-byte v1, v1

    .line 540
    int-to-char v1, v1

    .line 541
    aput-char v1, p0, v0

    .line 542
    .line 543
    add-int/lit8 v0, v2, 0xc

    .line 544
    .line 545
    int-to-byte v1, v5

    .line 546
    int-to-char v1, v1

    .line 547
    aput-char v1, p0, v0

    .line 548
    .line 549
    add-int/lit8 v2, v2, 0xd

    .line 550
    .line 551
    return v2

    .line 552
    :cond_11
    div-int/lit16 v0, v3, 0x3e8

    .line 553
    .line 554
    mul-int/lit16 v1, v0, 0x3e8

    .line 555
    .line 556
    sub-int/2addr v3, v1

    .line 557
    div-int/lit16 v1, v0, 0x3e8

    .line 558
    .line 559
    aget v3, v9, v3

    .line 560
    .line 561
    if-nez v1, :cond_14

    .line 562
    .line 563
    aget v0, v9, v0

    .line 564
    .line 565
    shr-int/lit8 v1, v0, 0x18

    .line 566
    .line 567
    if-nez v1, :cond_12

    .line 568
    .line 569
    shr-int/lit8 v1, v0, 0x10

    .line 570
    .line 571
    int-to-byte v1, v1

    .line 572
    int-to-char v1, v1

    .line 573
    aput-char v1, p0, v2

    .line 574
    .line 575
    add-int/lit8 v1, v2, 0x1

    .line 576
    .line 577
    shr-int/lit8 v6, v0, 0x8

    .line 578
    .line 579
    int-to-byte v6, v6

    .line 580
    int-to-char v6, v6

    .line 581
    aput-char v6, p0, v1

    .line 582
    .line 583
    add-int/lit8 v2, v2, 0x2

    .line 584
    .line 585
    goto :goto_7

    .line 586
    :cond_12
    if-ne v1, v6, :cond_13

    .line 587
    .line 588
    add-int/lit8 v1, v2, 0x1

    .line 589
    .line 590
    shr-int/lit8 v6, v0, 0x8

    .line 591
    .line 592
    int-to-byte v6, v6

    .line 593
    int-to-char v6, v6

    .line 594
    aput-char v6, p0, v2

    .line 595
    .line 596
    move v2, v1

    .line 597
    :cond_13
    :goto_7
    add-int/lit8 v1, v2, 0x1

    .line 598
    .line 599
    int-to-byte v0, v0

    .line 600
    int-to-char v0, v0

    .line 601
    aput-char v0, p0, v2

    .line 602
    .line 603
    goto :goto_8

    .line 604
    :cond_14
    mul-int/lit16 v6, v1, 0x3e8

    .line 605
    .line 606
    sub-int/2addr v0, v6

    .line 607
    add-int/lit8 v1, v1, 0x30

    .line 608
    .line 609
    int-to-byte v1, v1

    .line 610
    int-to-char v1, v1

    .line 611
    aput-char v1, p0, v2

    .line 612
    .line 613
    aget v0, v9, v0

    .line 614
    .line 615
    add-int/lit8 v1, v2, 0x1

    .line 616
    .line 617
    shr-int/lit8 v6, v0, 0x10

    .line 618
    .line 619
    int-to-byte v6, v6

    .line 620
    int-to-char v6, v6

    .line 621
    aput-char v6, p0, v1

    .line 622
    .line 623
    add-int/lit8 v1, v2, 0x2

    .line 624
    .line 625
    shr-int/lit8 v6, v0, 0x8

    .line 626
    .line 627
    int-to-byte v6, v6

    .line 628
    int-to-char v6, v6

    .line 629
    aput-char v6, p0, v1

    .line 630
    .line 631
    add-int/lit8 v1, v2, 0x3

    .line 632
    .line 633
    int-to-byte v0, v0

    .line 634
    int-to-char v0, v0

    .line 635
    aput-char v0, p0, v1

    .line 636
    .line 637
    add-int/lit8 v1, v2, 0x4

    .line 638
    .line 639
    :goto_8
    shr-int/lit8 v0, v3, 0x10

    .line 640
    .line 641
    int-to-byte v0, v0

    .line 642
    int-to-char v0, v0

    .line 643
    aput-char v0, p0, v1

    .line 644
    .line 645
    add-int/lit8 v0, v1, 0x1

    .line 646
    .line 647
    shr-int/lit8 v2, v3, 0x8

    .line 648
    .line 649
    int-to-byte v2, v2

    .line 650
    int-to-char v2, v2

    .line 651
    aput-char v2, p0, v0

    .line 652
    .line 653
    add-int/lit8 v0, v1, 0x2

    .line 654
    .line 655
    int-to-byte v2, v3

    .line 656
    int-to-char v2, v2

    .line 657
    aput-char v2, p0, v0

    .line 658
    .line 659
    add-int/lit8 v0, v1, 0x3

    .line 660
    .line 661
    shr-int/lit8 v2, v4, 0x10

    .line 662
    .line 663
    int-to-byte v2, v2

    .line 664
    int-to-char v2, v2

    .line 665
    aput-char v2, p0, v0

    .line 666
    .line 667
    add-int/lit8 v0, v1, 0x4

    .line 668
    .line 669
    shr-int/lit8 v2, v4, 0x8

    .line 670
    .line 671
    int-to-byte v2, v2

    .line 672
    int-to-char v2, v2

    .line 673
    aput-char v2, p0, v0

    .line 674
    .line 675
    add-int/lit8 v0, v1, 0x5

    .line 676
    .line 677
    int-to-byte v2, v4

    .line 678
    int-to-char v2, v2

    .line 679
    aput-char v2, p0, v0

    .line 680
    .line 681
    add-int/lit8 v0, v1, 0x6

    .line 682
    .line 683
    shr-int/lit8 v2, v8, 0x10

    .line 684
    .line 685
    int-to-byte v2, v2

    .line 686
    int-to-char v2, v2

    .line 687
    aput-char v2, p0, v0

    .line 688
    .line 689
    add-int/lit8 v0, v1, 0x7

    .line 690
    .line 691
    shr-int/lit8 v2, v8, 0x8

    .line 692
    .line 693
    int-to-byte v2, v2

    .line 694
    int-to-char v2, v2

    .line 695
    aput-char v2, p0, v0

    .line 696
    .line 697
    add-int/lit8 v0, v1, 0x8

    .line 698
    .line 699
    int-to-byte v2, v8

    .line 700
    int-to-char v2, v2

    .line 701
    aput-char v2, p0, v0

    .line 702
    .line 703
    add-int/lit8 v0, v1, 0x9

    .line 704
    .line 705
    shr-int/lit8 v2, v7, 0x10

    .line 706
    .line 707
    int-to-byte v2, v2

    .line 708
    int-to-char v2, v2

    .line 709
    aput-char v2, p0, v0

    .line 710
    .line 711
    add-int/lit8 v0, v1, 0xa

    .line 712
    .line 713
    shr-int/lit8 v2, v7, 0x8

    .line 714
    .line 715
    int-to-byte v2, v2

    .line 716
    int-to-char v2, v2

    .line 717
    aput-char v2, p0, v0

    .line 718
    .line 719
    add-int/lit8 v0, v1, 0xb

    .line 720
    .line 721
    int-to-byte v2, v7

    .line 722
    int-to-char v2, v2

    .line 723
    aput-char v2, p0, v0

    .line 724
    .line 725
    add-int/lit8 v0, v1, 0xc

    .line 726
    .line 727
    shr-int/lit8 v2, v5, 0x10

    .line 728
    .line 729
    int-to-byte v2, v2

    .line 730
    int-to-char v2, v2

    .line 731
    aput-char v2, p0, v0

    .line 732
    .line 733
    add-int/lit8 v0, v1, 0xd

    .line 734
    .line 735
    shr-int/lit8 v2, v5, 0x8

    .line 736
    .line 737
    int-to-byte v2, v2

    .line 738
    int-to-char v2, v2

    .line 739
    aput-char v2, p0, v0

    .line 740
    .line 741
    add-int/lit8 v0, v1, 0xe

    .line 742
    .line 743
    int-to-byte v2, v5

    .line 744
    int-to-char v2, v2

    .line 745
    aput-char v2, p0, v0

    .line 746
    .line 747
    add-int/lit8 v1, v1, 0xf

    .line 748
    .line 749
    return v1
.end method

.method public static writeLocalDate([BIIII)I
    .locals 10

    const/16 v0, 0x2d

    if-gez p2, :cond_0

    add-int/lit8 v1, p1, 0x1

    .line 102
    aput-byte v0, p0, p1

    neg-int p2, p2

    :goto_0
    move p1, v1

    goto :goto_1

    :cond_0
    const/16 v1, 0x270f

    if-le p2, v1, :cond_1

    add-int/lit8 v1, p1, 0x1

    const/16 v2, 0x2b

    .line 103
    aput-byte v2, p0, p1

    goto :goto_0

    :cond_1
    :goto_1
    const/16 v1, 0x2710

    if-ge p2, v1, :cond_2

    .line 104
    div-int/lit8 v1, p2, 0x64

    mul-int/lit8 v2, v1, 0x64

    sub-int/2addr p2, v2

    .line 105
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    int-to-long v5, p1

    add-long v7, v3, v5

    sget-object v9, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS:[S

    aget-short v1, v9, v1

    invoke-virtual {v2, p0, v7, v8, v1}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    add-long/2addr v3, v5

    const-wide/16 v5, 0x2

    add-long/2addr v3, v5

    .line 106
    aget-short p2, v9, p2

    invoke-virtual {v2, p0, v3, v4, p2}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    add-int/lit8 p1, p1, 0x4

    goto :goto_2

    .line 107
    :cond_2
    invoke-static {p0, p1, p2}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt32([BII)I

    move-result p1

    .line 108
    :goto_2
    aput-byte v0, p0, p1

    .line 109
    sget-object p2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    int-to-long v3, p1

    add-long v5, v1, v3

    const-wide/16 v7, 0x1

    add-long/2addr v5, v7

    sget-object v7, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS:[S

    aget-short p3, v7, p3

    invoke-virtual {p2, p0, v5, v6, p3}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    add-int/lit8 p3, p1, 0x3

    .line 110
    aput-byte v0, p0, p3

    add-long/2addr v1, v3

    const-wide/16 v3, 0x4

    add-long/2addr v1, v3

    .line 111
    aget-short p3, v7, p4

    invoke-virtual {p2, p0, v1, v2, p3}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    add-int/lit8 p1, p1, 0x6

    return p1
.end method

.method public static writeLocalDate([CIIII)I
    .locals 8

    .line 1
    const/16 v0, 0x2d

    .line 2
    .line 3
    if-gez p2, :cond_0

    .line 4
    .line 5
    add-int/lit8 v1, p1, 0x1

    .line 6
    .line 7
    aput-char v0, p0, p1

    .line 8
    .line 9
    neg-int p2, p2

    .line 10
    :goto_0
    move p1, v1

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const/16 v1, 0x270f

    .line 13
    .line 14
    if-le p2, v1, :cond_1

    .line 15
    .line 16
    add-int/lit8 v1, p1, 0x1

    .line 17
    .line 18
    const/16 v2, 0x2b

    .line 19
    .line 20
    aput-char v2, p0, p1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    :goto_1
    const/16 v1, 0x2710

    .line 24
    .line 25
    if-ge p2, v1, :cond_2

    .line 26
    .line 27
    div-int/lit8 v1, p2, 0x64

    .line 28
    .line 29
    mul-int/lit8 v2, v1, 0x64

    .line 30
    .line 31
    sub-int/2addr p2, v2

    .line 32
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 33
    .line 34
    sget-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    .line 35
    .line 36
    shl-int/lit8 v5, p1, 0x1

    .line 37
    .line 38
    int-to-long v5, v5

    .line 39
    add-long/2addr v5, v3

    .line 40
    sget-object v7, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS_UTF16:[I

    .line 41
    .line 42
    aget v1, v7, v1

    .line 43
    .line 44
    invoke-virtual {v2, p0, v5, v6, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v1, p1, 0x2

    .line 48
    .line 49
    shl-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    int-to-long v5, v1

    .line 52
    add-long/2addr v3, v5

    .line 53
    aget p2, v7, p2

    .line 54
    .line 55
    invoke-virtual {v2, p0, v3, v4, p2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 p1, p1, 0x4

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-static {p0, p1, p2}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt32([CII)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    :goto_2
    aput-char v0, p0, p1

    .line 66
    .line 67
    sget-object p2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 68
    .line 69
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    .line 70
    .line 71
    add-int/lit8 v3, p1, 0x1

    .line 72
    .line 73
    shl-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    int-to-long v3, v3

    .line 76
    add-long/2addr v3, v1

    .line 77
    sget-object v5, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS_UTF16:[I

    .line 78
    .line 79
    aget p3, v5, p3

    .line 80
    .line 81
    invoke-virtual {p2, p0, v3, v4, p3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 p3, p1, 0x3

    .line 85
    .line 86
    aput-char v0, p0, p3

    .line 87
    .line 88
    add-int/lit8 p3, p1, 0x4

    .line 89
    .line 90
    shl-int/lit8 p3, p3, 0x1

    .line 91
    .line 92
    int-to-long v3, p3

    .line 93
    add-long/2addr v1, v3

    .line 94
    aget p3, v5, p4

    .line 95
    .line 96
    invoke-virtual {p2, p0, v1, v2, p3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 p1, p1, 0x6

    .line 100
    .line 101
    return p1
.end method

.method public static writeLocalTime([BILjava/time/LocalTime;)I
    .locals 6

    .line 183
    sget-object v0, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    invoke-virtual {p2}, Ljava/time/LocalTime;->getHour()I

    move-result v1

    aget v1, v0, v1

    shr-int/lit8 v2, v1, 0x8

    int-to-byte v2, v2

    .line 184
    aput-byte v2, p0, p1

    add-int/lit8 v2, p1, 0x1

    int-to-byte v1, v1

    .line 185
    aput-byte v1, p0, v2

    add-int/lit8 v1, p1, 0x2

    const/16 v2, 0x3a

    .line 186
    aput-byte v2, p0, v1

    .line 187
    invoke-virtual {p2}, Ljava/time/LocalTime;->getMinute()I

    move-result v1

    aget v1, v0, v1

    add-int/lit8 v3, p1, 0x3

    shr-int/lit8 v4, v1, 0x8

    int-to-byte v4, v4

    .line 188
    aput-byte v4, p0, v3

    add-int/lit8 v3, p1, 0x4

    int-to-byte v1, v1

    .line 189
    aput-byte v1, p0, v3

    add-int/lit8 v1, p1, 0x5

    .line 190
    aput-byte v2, p0, v1

    .line 191
    invoke-virtual {p2}, Ljava/time/LocalTime;->getSecond()I

    move-result v1

    aget v1, v0, v1

    add-int/lit8 v2, p1, 0x6

    shr-int/lit8 v3, v1, 0x8

    int-to-byte v3, v3

    .line 192
    aput-byte v3, p0, v2

    add-int/lit8 v2, p1, 0x7

    int-to-byte v1, v1

    .line 193
    aput-byte v1, p0, v2

    add-int/lit8 v1, p1, 0x8

    .line 194
    invoke-virtual {p2}, Ljava/time/LocalTime;->getNano()I

    move-result p2

    if-eqz p2, :cond_3

    .line 195
    div-int/lit16 v2, p2, 0x3e8

    .line 196
    div-int/lit16 v3, v2, 0x3e8

    mul-int/lit16 v4, v2, 0x3e8

    sub-int/2addr p2, v4

    const/16 v4, 0x2e

    .line 197
    aput-byte v4, p0, v1

    .line 198
    aget v1, v0, v3

    add-int/lit8 v4, p1, 0x9

    shr-int/lit8 v5, v1, 0x10

    int-to-byte v5, v5

    .line 199
    aput-byte v5, p0, v4

    add-int/lit8 v4, p1, 0xa

    shr-int/lit8 v5, v1, 0x8

    int-to-byte v5, v5

    .line 200
    aput-byte v5, p0, v4

    add-int/lit8 v4, p1, 0xb

    int-to-byte v1, v1

    .line 201
    aput-byte v1, p0, v4

    add-int/lit8 v1, p1, 0xc

    if-nez p2, :cond_1

    mul-int/lit16 v3, v3, 0x3e8

    sub-int/2addr v2, v3

    if-nez v2, :cond_0

    return v1

    .line 202
    :cond_0
    aget v2, v0, v2

    goto :goto_0

    :cond_1
    mul-int/lit16 v3, v3, 0x3e8

    sub-int/2addr v2, v3

    .line 203
    aget v2, v0, v2

    :goto_0
    shr-int/lit8 v3, v2, 0x10

    int-to-byte v3, v3

    .line 204
    aput-byte v3, p0, v1

    add-int/lit8 v1, p1, 0xd

    shr-int/lit8 v3, v2, 0x8

    int-to-byte v3, v3

    .line 205
    aput-byte v3, p0, v1

    add-int/lit8 v1, p1, 0xe

    int-to-byte v2, v2

    .line 206
    aput-byte v2, p0, v1

    add-int/lit8 v1, p1, 0xf

    if-nez p2, :cond_2

    return v1

    .line 207
    :cond_2
    aget p2, v0, p2

    shr-int/lit8 v0, p2, 0x10

    int-to-byte v0, v0

    .line 208
    aput-byte v0, p0, v1

    add-int/lit8 v0, p1, 0x10

    shr-int/lit8 v1, p2, 0x8

    int-to-byte v1, v1

    .line 209
    aput-byte v1, p0, v0

    add-int/lit8 v0, p1, 0x11

    int-to-byte p2, p2

    .line 210
    aput-byte p2, p0, v0

    add-int/lit8 p1, p1, 0x12

    return p1

    :cond_3
    return v1
.end method

.method public static writeLocalTime([CILjava/time/LocalTime;)I
    .locals 6

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/IOUtils;->DIGITS_K:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/time/LocalTime;->getHour()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v1, v0, v1

    .line 8
    .line 9
    shr-int/lit8 v2, v1, 0x8

    .line 10
    .line 11
    int-to-byte v2, v2

    .line 12
    int-to-char v2, v2

    .line 13
    aput-char v2, p0, p1

    .line 14
    .line 15
    add-int/lit8 v2, p1, 0x1

    .line 16
    .line 17
    int-to-byte v1, v1

    .line 18
    int-to-char v1, v1

    .line 19
    aput-char v1, p0, v2

    .line 20
    .line 21
    add-int/lit8 v1, p1, 0x2

    .line 22
    .line 23
    const/16 v2, 0x3a

    .line 24
    .line 25
    aput-char v2, p0, v1

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/time/LocalTime;->getMinute()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    aget v1, v0, v1

    .line 32
    .line 33
    add-int/lit8 v3, p1, 0x3

    .line 34
    .line 35
    shr-int/lit8 v4, v1, 0x8

    .line 36
    .line 37
    int-to-byte v4, v4

    .line 38
    int-to-char v4, v4

    .line 39
    aput-char v4, p0, v3

    .line 40
    .line 41
    add-int/lit8 v3, p1, 0x4

    .line 42
    .line 43
    int-to-byte v1, v1

    .line 44
    int-to-char v1, v1

    .line 45
    aput-char v1, p0, v3

    .line 46
    .line 47
    add-int/lit8 v1, p1, 0x5

    .line 48
    .line 49
    aput-char v2, p0, v1

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/time/LocalTime;->getSecond()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    aget v1, v0, v1

    .line 56
    .line 57
    add-int/lit8 v2, p1, 0x6

    .line 58
    .line 59
    shr-int/lit8 v3, v1, 0x8

    .line 60
    .line 61
    int-to-byte v3, v3

    .line 62
    int-to-char v3, v3

    .line 63
    aput-char v3, p0, v2

    .line 64
    .line 65
    add-int/lit8 v2, p1, 0x7

    .line 66
    .line 67
    int-to-byte v1, v1

    .line 68
    int-to-char v1, v1

    .line 69
    aput-char v1, p0, v2

    .line 70
    .line 71
    add-int/lit8 v1, p1, 0x8

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/time/LocalTime;->getNano()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_3

    .line 78
    .line 79
    div-int/lit16 v2, p2, 0x3e8

    .line 80
    .line 81
    div-int/lit16 v3, v2, 0x3e8

    .line 82
    .line 83
    mul-int/lit16 v4, v2, 0x3e8

    .line 84
    .line 85
    sub-int/2addr p2, v4

    .line 86
    const/16 v4, 0x2e

    .line 87
    .line 88
    aput-char v4, p0, v1

    .line 89
    .line 90
    aget v1, v0, v3

    .line 91
    .line 92
    add-int/lit8 v4, p1, 0x9

    .line 93
    .line 94
    shr-int/lit8 v5, v1, 0x10

    .line 95
    .line 96
    int-to-byte v5, v5

    .line 97
    int-to-char v5, v5

    .line 98
    aput-char v5, p0, v4

    .line 99
    .line 100
    add-int/lit8 v4, p1, 0xa

    .line 101
    .line 102
    shr-int/lit8 v5, v1, 0x8

    .line 103
    .line 104
    int-to-byte v5, v5

    .line 105
    int-to-char v5, v5

    .line 106
    aput-char v5, p0, v4

    .line 107
    .line 108
    add-int/lit8 v4, p1, 0xb

    .line 109
    .line 110
    int-to-byte v1, v1

    .line 111
    int-to-char v1, v1

    .line 112
    aput-char v1, p0, v4

    .line 113
    .line 114
    add-int/lit8 v1, p1, 0xc

    .line 115
    .line 116
    if-nez p2, :cond_1

    .line 117
    .line 118
    mul-int/lit16 v3, v3, 0x3e8

    .line 119
    .line 120
    sub-int/2addr v2, v3

    .line 121
    if-nez v2, :cond_0

    .line 122
    .line 123
    return v1

    .line 124
    :cond_0
    aget v2, v0, v2

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_1
    mul-int/lit16 v3, v3, 0x3e8

    .line 128
    .line 129
    sub-int/2addr v2, v3

    .line 130
    aget v2, v0, v2

    .line 131
    .line 132
    :goto_0
    shr-int/lit8 v3, v2, 0x10

    .line 133
    .line 134
    int-to-byte v3, v3

    .line 135
    int-to-char v3, v3

    .line 136
    aput-char v3, p0, v1

    .line 137
    .line 138
    add-int/lit8 v1, p1, 0xd

    .line 139
    .line 140
    shr-int/lit8 v3, v2, 0x8

    .line 141
    .line 142
    int-to-byte v3, v3

    .line 143
    int-to-char v3, v3

    .line 144
    aput-char v3, p0, v1

    .line 145
    .line 146
    add-int/lit8 v1, p1, 0xe

    .line 147
    .line 148
    int-to-byte v2, v2

    .line 149
    int-to-char v2, v2

    .line 150
    aput-char v2, p0, v1

    .line 151
    .line 152
    add-int/lit8 v1, p1, 0xf

    .line 153
    .line 154
    if-nez p2, :cond_2

    .line 155
    .line 156
    return v1

    .line 157
    :cond_2
    aget p2, v0, p2

    .line 158
    .line 159
    shr-int/lit8 v0, p2, 0x10

    .line 160
    .line 161
    int-to-byte v0, v0

    .line 162
    int-to-char v0, v0

    .line 163
    aput-char v0, p0, v1

    .line 164
    .line 165
    add-int/lit8 v0, p1, 0x10

    .line 166
    .line 167
    shr-int/lit8 v1, p2, 0x8

    .line 168
    .line 169
    int-to-byte v1, v1

    .line 170
    int-to-char v1, v1

    .line 171
    aput-char v1, p0, v0

    .line 172
    .line 173
    add-int/lit8 v0, p1, 0x11

    .line 174
    .line 175
    int-to-byte p2, p2

    .line 176
    int-to-char p2, p2

    .line 177
    aput-char p2, p0, v0

    .line 178
    .line 179
    add-int/lit8 p1, p1, 0x12

    .line 180
    .line 181
    return p1

    .line 182
    :cond_3
    return v1
.end method

.method public static writeLocalTime([BIIII)V
    .locals 12

    .line 211
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    int-to-long v3, p1

    add-long v5, v1, v3

    sget-object v7, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS:[S

    aget-short p2, v7, p2

    invoke-virtual {v0, p0, v5, v6, p2}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    add-int/lit8 p2, p1, 0x2

    const/16 v5, 0x3a

    .line 212
    aput-byte v5, p0, p2

    add-long v8, v1, v3

    const-wide/16 v10, 0x3

    add-long/2addr v8, v10

    .line 213
    aget-short p2, v7, p3

    invoke-virtual {v0, p0, v8, v9, p2}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    add-int/lit8 p1, p1, 0x5

    .line 214
    aput-byte v5, p0, p1

    add-long/2addr v1, v3

    const-wide/16 p1, 0x6

    add-long/2addr v1, p1

    .line 215
    aget-short p1, v7, p4

    invoke-virtual {v0, p0, v1, v2, p1}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    return-void
.end method

.method public static writeLocalTime([CIIII)V
    .locals 8

    .line 216
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    shl-int/lit8 v3, p1, 0x1

    int-to-long v3, v3

    add-long/2addr v3, v1

    sget-object v5, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS_UTF16:[I

    aget p2, v5, p2

    invoke-virtual {v0, p0, v3, v4, p2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 p2, p1, 0x2

    const/16 v3, 0x3a

    .line 217
    aput-char v3, p0, p2

    add-int/lit8 p2, p1, 0x3

    shl-int/lit8 p2, p2, 0x1

    int-to-long v6, p2

    add-long/2addr v6, v1

    .line 218
    aget p2, v5, p3

    invoke-virtual {v0, p0, v6, v7, p2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 p2, p1, 0x5

    .line 219
    aput-char v3, p0, p2

    add-int/lit8 p1, p1, 0x6

    shl-int/lit8 p1, p1, 0x1

    int-to-long p1, p1

    add-long/2addr v1, p1

    .line 220
    aget p1, v5, p4

    invoke-virtual {v0, p0, v1, v2, p1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return-void
.end method
