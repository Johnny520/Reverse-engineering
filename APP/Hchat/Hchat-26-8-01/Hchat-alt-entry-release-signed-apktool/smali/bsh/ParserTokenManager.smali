.class public Lbsh/ParserTokenManager;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbsh/ParserConstants;


# static fields
.field static final jjbitVec0:[J

.field static final jjbitVec1:[J

.field static final jjbitVec3:[J

.field static final jjbitVec4:[J

.field static final jjbitVec5:[J

.field static final jjbitVec6:[J

.field static final jjbitVec7:[J

.field static final jjbitVec8:[J

.field public static final jjnewLexState:[I

.field static final jjnextStates:[I

.field public static final jjstrLiteralImages:[Ljava/lang/String;

.field static final jjtoMore:[J

.field static final jjtoSkip:[J

.field static final jjtoSpecial:[J

.field static final jjtoToken:[J

.field public static final lexStateNames:[Ljava/lang/String;


# instance fields
.field protected curChar:I

.field curLexState:I

.field defaultLexState:I

.field private image:Ljava/lang/StringBuilder;

.field protected input_stream:Lbsh/JavaCharStream;

.field private final jjimage:Ljava/lang/StringBuilder;

.field private jjimageLen:I

.field jjmatchedKind:I

.field jjmatchedPos:I

.field jjnewStateCnt:I

.field jjround:I

.field private final jjrounds:[I

.field private final jjstateSet:[I

.field private lengthOfMatch:I


# direct methods
.method static constructor <clinit>()V
    .locals 156

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [J

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v1, Lbsh/ParserTokenManager;->jjbitVec0:[J

    .line 8
    .line 9
    new-array v1, v0, [J

    .line 10
    .line 11
    fill-array-data v1, :array_1

    .line 12
    .line 13
    .line 14
    sput-object v1, Lbsh/ParserTokenManager;->jjbitVec1:[J

    .line 15
    .line 16
    new-array v1, v0, [J

    .line 17
    .line 18
    fill-array-data v1, :array_2

    .line 19
    .line 20
    .line 21
    sput-object v1, Lbsh/ParserTokenManager;->jjbitVec3:[J

    .line 22
    .line 23
    new-array v1, v0, [J

    .line 24
    .line 25
    fill-array-data v1, :array_3

    .line 26
    .line 27
    .line 28
    sput-object v1, Lbsh/ParserTokenManager;->jjbitVec4:[J

    .line 29
    .line 30
    new-array v1, v0, [J

    .line 31
    .line 32
    fill-array-data v1, :array_4

    .line 33
    .line 34
    .line 35
    sput-object v1, Lbsh/ParserTokenManager;->jjbitVec5:[J

    .line 36
    .line 37
    new-array v1, v0, [J

    .line 38
    .line 39
    fill-array-data v1, :array_5

    .line 40
    .line 41
    .line 42
    sput-object v1, Lbsh/ParserTokenManager;->jjbitVec6:[J

    .line 43
    .line 44
    new-array v1, v0, [J

    .line 45
    .line 46
    fill-array-data v1, :array_6

    .line 47
    .line 48
    .line 49
    sput-object v1, Lbsh/ParserTokenManager;->jjbitVec7:[J

    .line 50
    .line 51
    new-array v0, v0, [J

    .line 52
    .line 53
    fill-array-data v0, :array_7

    .line 54
    .line 55
    .line 56
    sput-object v0, Lbsh/ParserTokenManager;->jjbitVec8:[J

    .line 57
    .line 58
    const-string v154, "?."

    .line 59
    .line 60
    const-string v155, "default:"

    .line 61
    .line 62
    const-string v1, ""

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    const/4 v3, 0x0

    .line 66
    const/4 v4, 0x0

    .line 67
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v8, 0x0

    .line 71
    const/4 v9, 0x0

    .line 72
    const/4 v10, 0x0

    .line 73
    const/4 v11, 0x0

    .line 74
    const-string v12, "abstract"

    .line 75
    .line 76
    const-string v13, "boolean"

    .line 77
    .line 78
    const-string v14, "break"

    .line 79
    .line 80
    const-string v15, "class"

    .line 81
    .line 82
    const-string v16, "byte"

    .line 83
    .line 84
    const-string v17, "case"

    .line 85
    .line 86
    const-string v18, "catch"

    .line 87
    .line 88
    const-string v19, "char"

    .line 89
    .line 90
    const-string v20, "const"

    .line 91
    .line 92
    const-string v21, "continue"

    .line 93
    .line 94
    const-string v22, "default"

    .line 95
    .line 96
    const-string v23, "do"

    .line 97
    .line 98
    const-string v24, "double"

    .line 99
    .line 100
    const-string v25, "else"

    .line 101
    .line 102
    const-string v26, "enum"

    .line 103
    .line 104
    const-string v27, "extends"

    .line 105
    .line 106
    const-string v28, "false"

    .line 107
    .line 108
    const-string v29, "final"

    .line 109
    .line 110
    const-string v30, "finally"

    .line 111
    .line 112
    const-string v31, "float"

    .line 113
    .line 114
    const-string v32, "for"

    .line 115
    .line 116
    const-string v33, "goto"

    .line 117
    .line 118
    const-string v34, "if"

    .line 119
    .line 120
    const-string v35, "implements"

    .line 121
    .line 122
    const-string v36, "import"

    .line 123
    .line 124
    const-string v37, "instanceof"

    .line 125
    .line 126
    const-string v38, "int"

    .line 127
    .line 128
    const-string v39, "interface"

    .line 129
    .line 130
    const-string v40, "long"

    .line 131
    .line 132
    const-string v41, "native"

    .line 133
    .line 134
    const-string v42, "new"

    .line 135
    .line 136
    const-string v43, "null"

    .line 137
    .line 138
    const-string v44, "package"

    .line 139
    .line 140
    const-string v45, "private"

    .line 141
    .line 142
    const-string v46, "protected"

    .line 143
    .line 144
    const-string v47, "public"

    .line 145
    .line 146
    const-string v48, "return"

    .line 147
    .line 148
    const-string v49, "short"

    .line 149
    .line 150
    const-string v50, "static"

    .line 151
    .line 152
    const-string v51, "strictfp"

    .line 153
    .line 154
    const-string v52, "switch"

    .line 155
    .line 156
    const-string v53, "synchronized"

    .line 157
    .line 158
    const-string v54, "transient"

    .line 159
    .line 160
    const-string v55, "throw"

    .line 161
    .line 162
    const-string v56, "throws"

    .line 163
    .line 164
    const-string v57, "true"

    .line 165
    .line 166
    const-string v58, "try"

    .line 167
    .line 168
    const-string v59, "void"

    .line 169
    .line 170
    const-string v60, "volatile"

    .line 171
    .line 172
    const-string v61, "when"

    .line 173
    .line 174
    const-string v62, "while"

    .line 175
    .line 176
    const/16 v63, 0x0

    .line 177
    .line 178
    const/16 v64, 0x0

    .line 179
    .line 180
    const/16 v65, 0x0

    .line 181
    .line 182
    const/16 v66, 0x0

    .line 183
    .line 184
    const/16 v67, 0x0

    .line 185
    .line 186
    const/16 v68, 0x0

    .line 187
    .line 188
    const/16 v69, 0x0

    .line 189
    .line 190
    const/16 v70, 0x0

    .line 191
    .line 192
    const/16 v71, 0x0

    .line 193
    .line 194
    const/16 v72, 0x0

    .line 195
    .line 196
    const/16 v73, 0x0

    .line 197
    .line 198
    const/16 v74, 0x0

    .line 199
    .line 200
    const/16 v75, 0x0

    .line 201
    .line 202
    const/16 v76, 0x0

    .line 203
    .line 204
    const-string v77, "("

    .line 205
    .line 206
    const-string v78, ")"

    .line 207
    .line 208
    const-string v79, "{"

    .line 209
    .line 210
    const-string v80, "}"

    .line 211
    .line 212
    const-string v81, "["

    .line 213
    .line 214
    const-string v82, "]"

    .line 215
    .line 216
    const-string v83, ";"

    .line 217
    .line 218
    const-string v84, ","

    .line 219
    .line 220
    const-string v85, "."

    .line 221
    .line 222
    const-string v86, "="

    .line 223
    .line 224
    const-string v87, ">"

    .line 225
    .line 226
    const-string v88, "@gt"

    .line 227
    .line 228
    const-string v89, "<"

    .line 229
    .line 230
    const-string v90, "@lt"

    .line 231
    .line 232
    const-string v91, "!"

    .line 233
    .line 234
    const-string v92, "~"

    .line 235
    .line 236
    const-string v93, "=="

    .line 237
    .line 238
    const-string v94, "<="

    .line 239
    .line 240
    const-string v95, "@lteq"

    .line 241
    .line 242
    const-string v96, ">="

    .line 243
    .line 244
    const-string v97, "@gteq"

    .line 245
    .line 246
    const-string v98, "!="

    .line 247
    .line 248
    const-string v99, "||"

    .line 249
    .line 250
    const-string v100, "@or"

    .line 251
    .line 252
    const-string v101, "&&"

    .line 253
    .line 254
    const-string v102, "@and"

    .line 255
    .line 256
    const-string v103, "++"

    .line 257
    .line 258
    const-string v104, "--"

    .line 259
    .line 260
    const-string v105, "+"

    .line 261
    .line 262
    const-string v106, "-"

    .line 263
    .line 264
    const-string v107, "*"

    .line 265
    .line 266
    const-string v108, "/"

    .line 267
    .line 268
    const-string v109, "&"

    .line 269
    .line 270
    const-string v110, "@bitwise_and"

    .line 271
    .line 272
    const-string v111, "|"

    .line 273
    .line 274
    const-string v112, "@bitwise_or"

    .line 275
    .line 276
    const-string v113, "^"

    .line 277
    .line 278
    const-string v114, "@bitwise_xor"

    .line 279
    .line 280
    const-string v115, "%"

    .line 281
    .line 282
    const-string v116, "@mod"

    .line 283
    .line 284
    const-string v117, "**"

    .line 285
    .line 286
    const-string v118, "@pow"

    .line 287
    .line 288
    const-string v119, "<<"

    .line 289
    .line 290
    const-string v120, "@left_shift"

    .line 291
    .line 292
    const-string v121, ">>"

    .line 293
    .line 294
    const-string v122, "@right_shift"

    .line 295
    .line 296
    const-string v123, ">>>"

    .line 297
    .line 298
    const-string v124, "@right_unsigned_shift"

    .line 299
    .line 300
    const-string v125, "+="

    .line 301
    .line 302
    const-string v126, "-="

    .line 303
    .line 304
    const-string v127, "*="

    .line 305
    .line 306
    const-string v128, "/="

    .line 307
    .line 308
    const-string v129, "&="

    .line 309
    .line 310
    const-string v130, "@and_assign"

    .line 311
    .line 312
    const-string v131, "|="

    .line 313
    .line 314
    const-string v132, "@or_assign"

    .line 315
    .line 316
    const-string v133, "^="

    .line 317
    .line 318
    const-string v134, "@xor_assign"

    .line 319
    .line 320
    const-string v135, "%="

    .line 321
    .line 322
    const-string v136, "@mod_assign"

    .line 323
    .line 324
    const-string v137, "**="

    .line 325
    .line 326
    const-string v138, "@pow_assign"

    .line 327
    .line 328
    const-string v139, "<<="

    .line 329
    .line 330
    const-string v140, "@left_shift_assign"

    .line 331
    .line 332
    const-string v141, ">>="

    .line 333
    .line 334
    const-string v142, "@right_shift_assign"

    .line 335
    .line 336
    const-string v143, ">>>="

    .line 337
    .line 338
    const-string v144, "@right_unsigned_shift_assign"

    .line 339
    .line 340
    const-string v145, "->"

    .line 341
    .line 342
    const-string v146, "<=>"

    .line 343
    .line 344
    const-string v147, "??="

    .line 345
    .line 346
    const-string v148, "??"

    .line 347
    .line 348
    const-string v149, "?:"

    .line 349
    .line 350
    const-string v150, "?"

    .line 351
    .line 352
    const-string v151, ":"

    .line 353
    .line 354
    const-string v152, "::"

    .line 355
    .line 356
    const-string v153, "..."

    .line 357
    .line 358
    filled-new-array/range {v1 .. v155}, [Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    sput-object v0, Lbsh/ParserTokenManager;->jjstrLiteralImages:[Ljava/lang/String;

    .line 363
    .line 364
    const/16 v0, 0x35

    .line 365
    .line 366
    new-array v0, v0, [I

    .line 367
    .line 368
    fill-array-data v0, :array_8

    .line 369
    .line 370
    .line 371
    sput-object v0, Lbsh/ParserTokenManager;->jjnextStates:[I

    .line 372
    .line 373
    const-string v0, "DEFAULT"

    .line 374
    .line 375
    filled-new-array {v0}, [Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    sput-object v0, Lbsh/ParserTokenManager;->lexStateNames:[Ljava/lang/String;

    .line 380
    .line 381
    const/16 v0, 0x9b

    .line 382
    .line 383
    new-array v0, v0, [I

    .line 384
    .line 385
    fill-array-data v0, :array_9

    .line 386
    .line 387
    .line 388
    sput-object v0, Lbsh/ParserTokenManager;->jjnewLexState:[I

    .line 389
    .line 390
    const/4 v0, 0x3

    .line 391
    new-array v1, v0, [J

    .line 392
    .line 393
    fill-array-data v1, :array_a

    .line 394
    .line 395
    .line 396
    sput-object v1, Lbsh/ParserTokenManager;->jjtoToken:[J

    .line 397
    .line 398
    new-array v1, v0, [J

    .line 399
    .line 400
    fill-array-data v1, :array_b

    .line 401
    .line 402
    .line 403
    sput-object v1, Lbsh/ParserTokenManager;->jjtoSkip:[J

    .line 404
    .line 405
    new-array v1, v0, [J

    .line 406
    .line 407
    fill-array-data v1, :array_c

    .line 408
    .line 409
    .line 410
    sput-object v1, Lbsh/ParserTokenManager;->jjtoSpecial:[J

    .line 411
    .line 412
    new-array v0, v0, [J

    .line 413
    .line 414
    fill-array-data v0, :array_d

    .line 415
    .line 416
    .line 417
    sput-object v0, Lbsh/ParserTokenManager;->jjtoMore:[J

    .line 418
    .line 419
    return-void

    .line 420
    nop

    .line 421
    :array_0
    .array-data 8
        0x0
        0x0
        -0x1
        -0x1
    .end array-data

    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
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
    :array_1
    .array-data 8
        -0x2
        -0x1
        -0x1
        -0x1
    .end array-data

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
    :array_2
    .array-data 8
        0x1ff00000fffffffeL
        -0x4000
        0xffffffffL
        0x600000000000000L
    .end array-data

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
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    :array_3
    .array-data 8
        0x0
        0x0
        0x0
        -0x80000000800001L
    .end array-data

    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    :array_4
    .array-data 8
        0x0
        -0x1
        -0x1
        -0x1
    .end array-data

    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    :array_5
    .array-data 8
        -0x1
        -0x1
        0xffff
        0x0
    .end array-data

    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    :array_6
    .array-data 8
        -0x1
        -0x1
        0x0
        0x0
    .end array-data

    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    :array_7
    .array-data 8
        0x3fffffffffffL
        0x0
        0x0
        0x0
    .end array-data

    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    :array_8
    .array-data 4
        0x2
        0x4
        0x6
        0x7
        0x2c
        0x2d
        0x32
        0x33
        0x37
        0x38
        0x3b
        0x3c
        0x45
        0x4a
        0x18
        0x19
        0x1b
        0x3e
        0x40
        0x43
        0x10
        0x1d
        0x1e
        0x20
        0x46
        0x47
        0x49
        0x9
        0xa
        0xc
        0x12
        0x13
        0x16
        0x22
        0x23
        0x26
        0x2e
        0x2f
        0x16
        0x41
        0x42
        0x10
        0x4c
        0x4d
        0x4f
        0x14
        0x15
        0x30
        0x31
        0x35
        0x36
        0x39
        0x3a
    .end array-data

    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    :array_9
    .array-data 4
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
    .end array-data

    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    :array_a
    .array-data 8
        0x7ffffffffffff801L
        -0xc38
        0x7ffffff
    .end array-data

    :array_b
    .array-data 8
        0x7fe
        0x0
        0x0
    .end array-data

    :array_c
    .array-data 8
        0x700
        0x0
        0x0
    .end array-data

    :array_d
    .array-data 8
        0x0
        0x0
        0x0
    .end array-data
.end method

.method public constructor <init>(Lbsh/JavaCharStream;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 38
    iput v0, p0, Lbsh/ParserTokenManager;->curLexState:I

    .line 39
    iput v0, p0, Lbsh/ParserTokenManager;->defaultLexState:I

    const/16 v0, 0x50

    .line 40
    new-array v0, v0, [I

    iput-object v0, p0, Lbsh/ParserTokenManager;->jjrounds:[I

    const/16 v0, 0xa0

    .line 41
    new-array v0, v0, [I

    iput-object v0, p0, Lbsh/ParserTokenManager;->jjstateSet:[I

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lbsh/ParserTokenManager;->jjimage:Ljava/lang/StringBuilder;

    .line 43
    iput-object v0, p0, Lbsh/ParserTokenManager;->image:Ljava/lang/StringBuilder;

    .line 44
    iput-object p1, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    return-void
.end method

.method public constructor <init>(Lbsh/JavaCharStream;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lbsh/ParserTokenManager;->curLexState:I

    .line 6
    .line 7
    iput v0, p0, Lbsh/ParserTokenManager;->defaultLexState:I

    .line 8
    .line 9
    const/16 v0, 0x50

    .line 10
    .line 11
    new-array v0, v0, [I

    .line 12
    .line 13
    iput-object v0, p0, Lbsh/ParserTokenManager;->jjrounds:[I

    .line 14
    .line 15
    const/16 v0, 0xa0

    .line 16
    .line 17
    new-array v0, v0, [I

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/ParserTokenManager;->jjstateSet:[I

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lbsh/ParserTokenManager;->jjimage:Ljava/lang/StringBuilder;

    .line 27
    .line 28
    iput-object v0, p0, Lbsh/ParserTokenManager;->image:Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lbsh/ParserTokenManager;->ReInit(Lbsh/JavaCharStream;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p2}, Lbsh/ParserTokenManager;->SwitchTo(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method private ReInitRounds()V
    .locals 3

    .line 1
    const v0, -0x7fffffff

    .line 2
    .line 3
    .line 4
    iput v0, p0, Lbsh/ParserTokenManager;->jjround:I

    .line 5
    .line 6
    const/16 v0, 0x50

    .line 7
    .line 8
    :goto_0
    add-int/lit8 v1, v0, -0x1

    .line 9
    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lbsh/ParserTokenManager;->jjrounds:[I

    .line 13
    .line 14
    const/high16 v2, -0x80000000

    .line 15
    .line 16
    aput v2, v0, v1

    .line 17
    .line 18
    move v0, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method

.method private jjAddStates(II)V
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, Lbsh/ParserTokenManager;->jjstateSet:[I

    .line 2
    .line 3
    iget v1, p0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 8
    .line 9
    sget-object v2, Lbsh/ParserTokenManager;->jjnextStates:[I

    .line 10
    .line 11
    aget v2, v2, p1

    .line 12
    .line 13
    aput v2, v0, v1

    .line 14
    .line 15
    add-int/lit8 v0, p1, 0x1

    .line 16
    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    move p1, v0

    .line 21
    goto :goto_0
.end method

.method private static final jjCanMove_0(IIIJJ)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    return p1

    .line 5
    :cond_0
    sget-object p0, Lbsh/ParserTokenManager;->jjbitVec0:[J

    .line 6
    .line 7
    aget-wide p2, p0, p2

    .line 8
    .line 9
    and-long/2addr p2, p5

    .line 10
    const-wide/16 p4, 0x0

    .line 11
    .line 12
    cmp-long p0, p2, p4

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_1
    return p1
.end method

.method private static final jjCanMove_1(IIIJJ)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    sget-object p0, Lbsh/ParserTokenManager;->jjbitVec1:[J

    .line 8
    .line 9
    aget-wide p1, p0, p1

    .line 10
    .line 11
    and-long p0, p1, p3

    .line 12
    .line 13
    cmp-long p0, p0, v2

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    return v0

    .line 19
    :cond_1
    sget-object p0, Lbsh/ParserTokenManager;->jjbitVec0:[J

    .line 20
    .line 21
    aget-wide p1, p0, p2

    .line 22
    .line 23
    and-long p0, p1, p5

    .line 24
    .line 25
    cmp-long p0, p0, v2

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    return v0
.end method

.method private static final jjCanMove_2(IIIJJ)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    if-eqz p0, :cond_9

    .line 6
    .line 7
    const/16 v4, 0x33

    .line 8
    .line 9
    if-eq p0, v4, :cond_7

    .line 10
    .line 11
    const/16 v4, 0x3d

    .line 12
    .line 13
    if-eq p0, v4, :cond_5

    .line 14
    .line 15
    const/16 v4, 0x30

    .line 16
    .line 17
    if-eq p0, v4, :cond_3

    .line 18
    .line 19
    const/16 v4, 0x31

    .line 20
    .line 21
    if-eq p0, v4, :cond_1

    .line 22
    .line 23
    sget-object p0, Lbsh/ParserTokenManager;->jjbitVec3:[J

    .line 24
    .line 25
    aget-wide p1, p0, p1

    .line 26
    .line 27
    and-long p0, p1, p3

    .line 28
    .line 29
    cmp-long p0, p0, v2

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    return v1

    .line 34
    :cond_0
    return v0

    .line 35
    :cond_1
    sget-object p0, Lbsh/ParserTokenManager;->jjbitVec6:[J

    .line 36
    .line 37
    aget-wide p1, p0, p2

    .line 38
    .line 39
    and-long p0, p1, p5

    .line 40
    .line 41
    cmp-long p0, p0, v2

    .line 42
    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    return v1

    .line 46
    :cond_2
    return v0

    .line 47
    :cond_3
    sget-object p0, Lbsh/ParserTokenManager;->jjbitVec5:[J

    .line 48
    .line 49
    aget-wide p1, p0, p2

    .line 50
    .line 51
    and-long p0, p1, p5

    .line 52
    .line 53
    cmp-long p0, p0, v2

    .line 54
    .line 55
    if-eqz p0, :cond_4

    .line 56
    .line 57
    return v1

    .line 58
    :cond_4
    return v0

    .line 59
    :cond_5
    sget-object p0, Lbsh/ParserTokenManager;->jjbitVec8:[J

    .line 60
    .line 61
    aget-wide p1, p0, p2

    .line 62
    .line 63
    and-long p0, p1, p5

    .line 64
    .line 65
    cmp-long p0, p0, v2

    .line 66
    .line 67
    if-eqz p0, :cond_6

    .line 68
    .line 69
    return v1

    .line 70
    :cond_6
    return v0

    .line 71
    :cond_7
    sget-object p0, Lbsh/ParserTokenManager;->jjbitVec7:[J

    .line 72
    .line 73
    aget-wide p1, p0, p2

    .line 74
    .line 75
    and-long p0, p1, p5

    .line 76
    .line 77
    cmp-long p0, p0, v2

    .line 78
    .line 79
    if-eqz p0, :cond_8

    .line 80
    .line 81
    return v1

    .line 82
    :cond_8
    return v0

    .line 83
    :cond_9
    sget-object p0, Lbsh/ParserTokenManager;->jjbitVec4:[J

    .line 84
    .line 85
    aget-wide p1, p0, p2

    .line 86
    .line 87
    and-long p0, p1, p5

    .line 88
    .line 89
    cmp-long p0, p0, v2

    .line 90
    .line 91
    if-eqz p0, :cond_a

    .line 92
    .line 93
    return v1

    .line 94
    :cond_a
    return v0
.end method

.method private jjCheckNAdd(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lbsh/ParserTokenManager;->jjrounds:[I

    .line 2
    .line 3
    aget v1, v0, p1

    .line 4
    .line 5
    iget v2, p0, Lbsh/ParserTokenManager;->jjround:I

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lbsh/ParserTokenManager;->jjstateSet:[I

    .line 10
    .line 11
    iget v3, p0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 12
    .line 13
    add-int/lit8 v4, v3, 0x1

    .line 14
    .line 15
    iput v4, p0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 16
    .line 17
    aput p1, v1, v3

    .line 18
    .line 19
    aput v2, v0, p1

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method private jjCheckNAddStates(II)V
    .locals 1

    .line 1
    :goto_0
    sget-object v0, Lbsh/ParserTokenManager;->jjnextStates:[I

    .line 2
    .line 3
    aget v0, v0, p1

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 6
    .line 7
    .line 8
    add-int/lit8 v0, p1, 0x1

    .line 9
    .line 10
    if-ne p1, p2, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    move p1, v0

    .line 14
    goto :goto_0
.end method

.method private jjCheckNAddTwoStates(II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private jjMoveNfa_0(II)I
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x50

    .line 4
    .line 5
    iput v1, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 6
    .line 7
    iget-object v1, v0, Lbsh/ParserTokenManager;->jjstateSet:[I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput p1, v1, v2

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    const v3, 0x7fffffff

    .line 14
    .line 15
    .line 16
    move v5, v1

    .line 17
    move v6, v2

    .line 18
    move v4, v3

    .line 19
    move/from16 v3, p2

    .line 20
    .line 21
    :goto_0
    iget v7, v0, Lbsh/ParserTokenManager;->jjround:I

    .line 22
    .line 23
    add-int/2addr v7, v1

    .line 24
    iput v7, v0, Lbsh/ParserTokenManager;->jjround:I

    .line 25
    .line 26
    const v8, 0x7fffffff

    .line 27
    .line 28
    .line 29
    if-ne v7, v8, :cond_0

    .line 30
    .line 31
    invoke-direct {v0}, Lbsh/ParserTokenManager;->ReInitRounds()V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 35
    .line 36
    const/16 v8, 0x40

    .line 37
    .line 38
    const/16 v10, 0x1a

    .line 39
    .line 40
    const/16 v11, 0x4b

    .line 41
    .line 42
    const/16 v15, 0x4c

    .line 43
    .line 44
    const/4 v13, 0x3

    .line 45
    const/16 v1, 0x2a

    .line 46
    .line 47
    const/16 v9, 0x8

    .line 48
    .line 49
    const/16 v12, 0x3e

    .line 50
    .line 51
    const-wide/16 v22, 0x0

    .line 52
    .line 53
    if-ge v7, v8, :cond_3c

    .line 54
    .line 55
    const-wide/16 v24, 0x1

    .line 56
    .line 57
    shl-long v24, v24, v7

    .line 58
    .line 59
    :goto_1
    iget-object v7, v0, Lbsh/ParserTokenManager;->jjstateSet:[I

    .line 60
    .line 61
    add-int/lit8 v5, v5, -0x1

    .line 62
    .line 63
    aget v8, v7, v5

    .line 64
    .line 65
    const/4 v14, 0x7

    .line 66
    const-wide/high16 v27, 0x3ff000000000000L

    .line 67
    .line 68
    packed-switch v8, :pswitch_data_0

    .line 69
    .line 70
    .line 71
    :pswitch_0
    goto/16 :goto_7

    .line 72
    .line 73
    :pswitch_1
    const-wide v27, -0x6800004000002401L

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    and-long v27, v24, v27

    .line 79
    .line 80
    cmp-long v8, v27, v22

    .line 81
    .line 82
    if-eqz v8, :cond_1

    .line 83
    .line 84
    invoke-direct {v0, v2, v13}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_1
    iget v8, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 89
    .line 90
    if-ne v8, v12, :cond_3

    .line 91
    .line 92
    if-le v4, v14, :cond_2

    .line 93
    .line 94
    move v4, v14

    .line 95
    :cond_2
    invoke-direct {v0, v14}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    const/16 v14, 0x26

    .line 100
    .line 101
    if-ne v8, v14, :cond_4

    .line 102
    .line 103
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 104
    .line 105
    add-int/lit8 v14, v8, 0x1

    .line 106
    .line 107
    iput v14, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 108
    .line 109
    aput v13, v7, v8

    .line 110
    .line 111
    :cond_4
    :goto_2
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 112
    .line 113
    if-ne v7, v12, :cond_3a

    .line 114
    .line 115
    iget-object v7, v0, Lbsh/ParserTokenManager;->jjstateSet:[I

    .line 116
    .line 117
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 118
    .line 119
    add-int/lit8 v14, v8, 0x1

    .line 120
    .line 121
    iput v14, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 122
    .line 123
    const/4 v14, 0x5

    .line 124
    aput v14, v7, v8

    .line 125
    .line 126
    goto/16 :goto_7

    .line 127
    .line 128
    :pswitch_2
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 129
    .line 130
    const/16 v8, 0x2f

    .line 131
    .line 132
    if-ne v7, v8, :cond_3a

    .line 133
    .line 134
    const/16 v7, 0xa

    .line 135
    .line 136
    if-le v4, v7, :cond_3a

    .line 137
    .line 138
    const/16 v4, 0xa

    .line 139
    .line 140
    goto/16 :goto_7

    .line 141
    .line 142
    :pswitch_3
    const-wide v7, -0x40000000001L

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    and-long v7, v24, v7

    .line 148
    .line 149
    cmp-long v7, v7, v22

    .line 150
    .line 151
    if-eqz v7, :cond_3a

    .line 152
    .line 153
    const/16 v7, 0x4e

    .line 154
    .line 155
    invoke-direct {v0, v7, v15}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 156
    .line 157
    .line 158
    goto/16 :goto_7

    .line 159
    .line 160
    :pswitch_4
    const-wide v7, -0x840000000001L

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    and-long v7, v24, v7

    .line 166
    .line 167
    cmp-long v7, v7, v22

    .line 168
    .line 169
    if-eqz v7, :cond_3a

    .line 170
    .line 171
    const/16 v7, 0x4e

    .line 172
    .line 173
    invoke-direct {v0, v7, v15}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 174
    .line 175
    .line 176
    goto/16 :goto_7

    .line 177
    .line 178
    :pswitch_5
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 179
    .line 180
    if-ne v7, v1, :cond_3a

    .line 181
    .line 182
    const/16 v7, 0x2c

    .line 183
    .line 184
    invoke-direct {v0, v1, v7}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_7

    .line 188
    .line 189
    :pswitch_6
    const-wide v7, -0x40000000001L

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    and-long v7, v24, v7

    .line 195
    .line 196
    cmp-long v7, v7, v22

    .line 197
    .line 198
    if-eqz v7, :cond_3a

    .line 199
    .line 200
    invoke-direct {v0, v11, v15}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_7

    .line 204
    .line 205
    :pswitch_7
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 206
    .line 207
    if-ne v7, v1, :cond_3a

    .line 208
    .line 209
    invoke-direct {v0, v11, v15}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_7

    .line 213
    .line 214
    :pswitch_8
    iget v8, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 215
    .line 216
    const/16 v14, 0xd

    .line 217
    .line 218
    if-ne v8, v14, :cond_3a

    .line 219
    .line 220
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 221
    .line 222
    add-int/lit8 v14, v8, 0x1

    .line 223
    .line 224
    iput v14, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 225
    .line 226
    const/16 v14, 0x48

    .line 227
    .line 228
    aput v14, v7, v8

    .line 229
    .line 230
    goto/16 :goto_7

    .line 231
    .line 232
    :pswitch_9
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 233
    .line 234
    const/16 v8, 0xa

    .line 235
    .line 236
    if-ne v7, v8, :cond_3a

    .line 237
    .line 238
    if-le v4, v9, :cond_3a

    .line 239
    .line 240
    :goto_3
    move v4, v9

    .line 241
    goto/16 :goto_7

    .line 242
    .line 243
    :pswitch_a
    const-wide/16 v7, 0x2400

    .line 244
    .line 245
    and-long v7, v24, v7

    .line 246
    .line 247
    cmp-long v7, v7, v22

    .line 248
    .line 249
    if-eqz v7, :cond_3a

    .line 250
    .line 251
    if-le v4, v9, :cond_3a

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :pswitch_b
    const-wide/16 v7, -0x2401

    .line 255
    .line 256
    and-long v7, v24, v7

    .line 257
    .line 258
    cmp-long v7, v7, v22

    .line 259
    .line 260
    if-nez v7, :cond_5

    .line 261
    .line 262
    goto/16 :goto_7

    .line 263
    .line 264
    :cond_5
    if-le v4, v9, :cond_6

    .line 265
    .line 266
    move v4, v9

    .line 267
    :cond_6
    const/16 v7, 0x18

    .line 268
    .line 269
    invoke-direct {v0, v7, v10}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 270
    .line 271
    .line 272
    goto/16 :goto_7

    .line 273
    .line 274
    :pswitch_c
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 275
    .line 276
    if-ne v7, v1, :cond_7

    .line 277
    .line 278
    invoke-direct {v0, v11, v15}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 279
    .line 280
    .line 281
    goto/16 :goto_7

    .line 282
    .line 283
    :cond_7
    const/16 v8, 0x2f

    .line 284
    .line 285
    if-ne v7, v8, :cond_3a

    .line 286
    .line 287
    if-le v4, v9, :cond_8

    .line 288
    .line 289
    move v4, v9

    .line 290
    :cond_8
    const/16 v7, 0x18

    .line 291
    .line 292
    invoke-direct {v0, v7, v10}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 293
    .line 294
    .line 295
    goto/16 :goto_7

    .line 296
    .line 297
    :pswitch_d
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 298
    .line 299
    const/16 v8, 0x2f

    .line 300
    .line 301
    if-ne v7, v8, :cond_3a

    .line 302
    .line 303
    const/16 v7, 0xc

    .line 304
    .line 305
    const/16 v8, 0xd

    .line 306
    .line 307
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjAddStates(II)V

    .line 308
    .line 309
    .line 310
    goto/16 :goto_7

    .line 311
    .line 312
    :pswitch_e
    const-wide/high16 v7, 0xff000000000000L

    .line 313
    .line 314
    and-long v7, v24, v7

    .line 315
    .line 316
    cmp-long v7, v7, v22

    .line 317
    .line 318
    if-nez v7, :cond_9

    .line 319
    .line 320
    goto/16 :goto_7

    .line 321
    .line 322
    :cond_9
    if-le v4, v12, :cond_a

    .line 323
    .line 324
    move v4, v12

    .line 325
    :cond_a
    const/16 v7, 0x10

    .line 326
    .line 327
    const/16 v8, 0x43

    .line 328
    .line 329
    invoke-direct {v0, v8, v7}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 330
    .line 331
    .line 332
    goto/16 :goto_7

    .line 333
    .line 334
    :pswitch_f
    const/16 v7, 0x10

    .line 335
    .line 336
    const-wide/high16 v27, 0x3000000000000L

    .line 337
    .line 338
    and-long v27, v24, v27

    .line 339
    .line 340
    cmp-long v8, v27, v22

    .line 341
    .line 342
    if-nez v8, :cond_b

    .line 343
    .line 344
    goto/16 :goto_7

    .line 345
    .line 346
    :cond_b
    if-le v4, v12, :cond_c

    .line 347
    .line 348
    move v4, v12

    .line 349
    :cond_c
    invoke-direct {v0, v7}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 350
    .line 351
    .line 352
    goto/16 :goto_7

    .line 353
    .line 354
    :pswitch_10
    const-wide/high16 v7, 0x3000000000000L

    .line 355
    .line 356
    and-long v7, v24, v7

    .line 357
    .line 358
    cmp-long v7, v7, v22

    .line 359
    .line 360
    if-nez v7, :cond_d

    .line 361
    .line 362
    goto/16 :goto_7

    .line 363
    .line 364
    :cond_d
    if-le v4, v12, :cond_e

    .line 365
    .line 366
    move v4, v12

    .line 367
    :cond_e
    const/16 v7, 0x29

    .line 368
    .line 369
    const/16 v8, 0x27

    .line 370
    .line 371
    invoke-direct {v0, v8, v7}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 372
    .line 373
    .line 374
    goto/16 :goto_7

    .line 375
    .line 376
    :pswitch_11
    and-long v7, v24, v27

    .line 377
    .line 378
    cmp-long v7, v7, v22

    .line 379
    .line 380
    if-nez v7, :cond_f

    .line 381
    .line 382
    goto/16 :goto_7

    .line 383
    .line 384
    :cond_f
    if-le v4, v12, :cond_10

    .line 385
    .line 386
    move v4, v12

    .line 387
    :cond_10
    const/16 v7, 0x3f

    .line 388
    .line 389
    const/16 v8, 0x10

    .line 390
    .line 391
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 392
    .line 393
    .line 394
    goto/16 :goto_7

    .line 395
    .line 396
    :pswitch_12
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 397
    .line 398
    const/16 v8, 0x30

    .line 399
    .line 400
    if-eq v7, v8, :cond_11

    .line 401
    .line 402
    goto/16 :goto_7

    .line 403
    .line 404
    :cond_11
    if-le v4, v12, :cond_12

    .line 405
    .line 406
    move v4, v12

    .line 407
    :cond_12
    const/16 v7, 0x11

    .line 408
    .line 409
    const/16 v8, 0x14

    .line 410
    .line 411
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 412
    .line 413
    .line 414
    goto/16 :goto_7

    .line 415
    .line 416
    :pswitch_13
    and-long v7, v24, v27

    .line 417
    .line 418
    cmp-long v7, v7, v22

    .line 419
    .line 420
    if-eqz v7, :cond_3a

    .line 421
    .line 422
    const/16 v7, 0x3b

    .line 423
    .line 424
    const/16 v8, 0x3c

    .line 425
    .line 426
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 427
    .line 428
    .line 429
    goto/16 :goto_7

    .line 430
    .line 431
    :pswitch_14
    and-long v7, v24, v27

    .line 432
    .line 433
    cmp-long v7, v7, v22

    .line 434
    .line 435
    if-nez v7, :cond_13

    .line 436
    .line 437
    goto/16 :goto_7

    .line 438
    .line 439
    :cond_13
    const/16 v8, 0x43

    .line 440
    .line 441
    if-le v4, v8, :cond_14

    .line 442
    .line 443
    const/16 v4, 0x43

    .line 444
    .line 445
    :cond_14
    const/16 v7, 0x3a

    .line 446
    .line 447
    const/16 v8, 0x16

    .line 448
    .line 449
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 450
    .line 451
    .line 452
    goto/16 :goto_7

    .line 453
    .line 454
    :pswitch_15
    const-wide v7, 0x280000000000L

    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    and-long v7, v24, v7

    .line 460
    .line 461
    cmp-long v7, v7, v22

    .line 462
    .line 463
    if-eqz v7, :cond_3a

    .line 464
    .line 465
    const/16 v7, 0x3a

    .line 466
    .line 467
    invoke-direct {v0, v7}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 468
    .line 469
    .line 470
    goto/16 :goto_7

    .line 471
    .line 472
    :pswitch_16
    and-long v7, v24, v27

    .line 473
    .line 474
    cmp-long v7, v7, v22

    .line 475
    .line 476
    if-eqz v7, :cond_3a

    .line 477
    .line 478
    const/16 v7, 0x37

    .line 479
    .line 480
    const/16 v8, 0x38

    .line 481
    .line 482
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 483
    .line 484
    .line 485
    goto/16 :goto_7

    .line 486
    .line 487
    :pswitch_17
    and-long v7, v24, v27

    .line 488
    .line 489
    cmp-long v7, v7, v22

    .line 490
    .line 491
    if-nez v7, :cond_15

    .line 492
    .line 493
    goto/16 :goto_7

    .line 494
    .line 495
    :cond_15
    const/16 v8, 0x43

    .line 496
    .line 497
    if-le v4, v8, :cond_16

    .line 498
    .line 499
    const/16 v4, 0x43

    .line 500
    .line 501
    :cond_16
    const/16 v7, 0x36

    .line 502
    .line 503
    const/16 v8, 0x16

    .line 504
    .line 505
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 506
    .line 507
    .line 508
    goto/16 :goto_7

    .line 509
    .line 510
    :pswitch_18
    const-wide v7, 0x280000000000L

    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    and-long v7, v24, v7

    .line 516
    .line 517
    cmp-long v7, v7, v22

    .line 518
    .line 519
    if-eqz v7, :cond_3a

    .line 520
    .line 521
    const/16 v7, 0x36

    .line 522
    .line 523
    invoke-direct {v0, v7}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 524
    .line 525
    .line 526
    goto/16 :goto_7

    .line 527
    .line 528
    :pswitch_19
    iget v8, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 529
    .line 530
    const/16 v14, 0x2e

    .line 531
    .line 532
    if-ne v8, v14, :cond_3a

    .line 533
    .line 534
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 535
    .line 536
    add-int/lit8 v14, v8, 0x1

    .line 537
    .line 538
    iput v14, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 539
    .line 540
    const/16 v14, 0x34

    .line 541
    .line 542
    aput v14, v7, v8

    .line 543
    .line 544
    goto/16 :goto_7

    .line 545
    .line 546
    :pswitch_1a
    and-long v7, v24, v27

    .line 547
    .line 548
    cmp-long v7, v7, v22

    .line 549
    .line 550
    if-eqz v7, :cond_3a

    .line 551
    .line 552
    const/16 v7, 0x32

    .line 553
    .line 554
    const/16 v8, 0x33

    .line 555
    .line 556
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 557
    .line 558
    .line 559
    goto/16 :goto_7

    .line 560
    .line 561
    :pswitch_1b
    and-long v7, v24, v27

    .line 562
    .line 563
    cmp-long v7, v7, v22

    .line 564
    .line 565
    if-nez v7, :cond_17

    .line 566
    .line 567
    goto/16 :goto_7

    .line 568
    .line 569
    :cond_17
    const/16 v8, 0x43

    .line 570
    .line 571
    if-le v4, v8, :cond_18

    .line 572
    .line 573
    const/16 v4, 0x43

    .line 574
    .line 575
    :cond_18
    const/16 v7, 0x31

    .line 576
    .line 577
    const/16 v8, 0x16

    .line 578
    .line 579
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 580
    .line 581
    .line 582
    goto/16 :goto_7

    .line 583
    .line 584
    :pswitch_1c
    const-wide v7, 0x280000000000L

    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    and-long v7, v24, v7

    .line 590
    .line 591
    cmp-long v7, v7, v22

    .line 592
    .line 593
    if-eqz v7, :cond_3a

    .line 594
    .line 595
    const/16 v7, 0x31

    .line 596
    .line 597
    invoke-direct {v0, v7}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 598
    .line 599
    .line 600
    goto/16 :goto_7

    .line 601
    .line 602
    :pswitch_1d
    and-long v7, v24, v27

    .line 603
    .line 604
    cmp-long v7, v7, v22

    .line 605
    .line 606
    if-nez v7, :cond_19

    .line 607
    .line 608
    goto/16 :goto_7

    .line 609
    .line 610
    :cond_19
    const/16 v8, 0x43

    .line 611
    .line 612
    if-le v4, v8, :cond_1a

    .line 613
    .line 614
    const/16 v4, 0x43

    .line 615
    .line 616
    :cond_1a
    const/16 v7, 0x24

    .line 617
    .line 618
    const/16 v8, 0x26

    .line 619
    .line 620
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 621
    .line 622
    .line 623
    goto/16 :goto_7

    .line 624
    .line 625
    :pswitch_1e
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 626
    .line 627
    const/16 v8, 0x2e

    .line 628
    .line 629
    if-ne v7, v8, :cond_3a

    .line 630
    .line 631
    const/16 v7, 0x2e

    .line 632
    .line 633
    invoke-direct {v0, v7}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 634
    .line 635
    .line 636
    goto/16 :goto_7

    .line 637
    .line 638
    :pswitch_1f
    and-long v7, v24, v27

    .line 639
    .line 640
    cmp-long v7, v7, v22

    .line 641
    .line 642
    if-eqz v7, :cond_3a

    .line 643
    .line 644
    const/16 v7, 0x2c

    .line 645
    .line 646
    const/16 v8, 0x2d

    .line 647
    .line 648
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 649
    .line 650
    .line 651
    goto/16 :goto_7

    .line 652
    .line 653
    :pswitch_20
    and-long v7, v24, v27

    .line 654
    .line 655
    cmp-long v7, v7, v22

    .line 656
    .line 657
    if-eqz v7, :cond_3a

    .line 658
    .line 659
    const/4 v7, 0x4

    .line 660
    const/16 v8, 0xb

    .line 661
    .line 662
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 663
    .line 664
    .line 665
    goto/16 :goto_7

    .line 666
    .line 667
    :pswitch_21
    const-wide v7, 0x3ff001000000000L

    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    and-long v7, v24, v7

    .line 673
    .line 674
    cmp-long v7, v7, v22

    .line 675
    .line 676
    if-nez v7, :cond_1b

    .line 677
    .line 678
    goto/16 :goto_7

    .line 679
    .line 680
    :cond_1b
    const/16 v7, 0x49

    .line 681
    .line 682
    if-le v4, v7, :cond_1c

    .line 683
    .line 684
    move/from16 v19, v7

    .line 685
    .line 686
    goto :goto_4

    .line 687
    :cond_1c
    move/from16 v19, v4

    .line 688
    .line 689
    :goto_4
    invoke-direct {v0, v1}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 690
    .line 691
    .line 692
    move/from16 v4, v19

    .line 693
    .line 694
    goto/16 :goto_7

    .line 695
    .line 696
    :pswitch_22
    const/16 v7, 0x49

    .line 697
    .line 698
    iget v8, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 699
    .line 700
    const/16 v14, 0x24

    .line 701
    .line 702
    if-eq v8, v14, :cond_1d

    .line 703
    .line 704
    goto/16 :goto_7

    .line 705
    .line 706
    :cond_1d
    if-le v4, v7, :cond_1e

    .line 707
    .line 708
    const/16 v4, 0x49

    .line 709
    .line 710
    :cond_1e
    invoke-direct {v0, v1}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 711
    .line 712
    .line 713
    goto/16 :goto_7

    .line 714
    .line 715
    :pswitch_23
    iget v8, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 716
    .line 717
    const/16 v14, 0x22

    .line 718
    .line 719
    if-ne v8, v14, :cond_3a

    .line 720
    .line 721
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 722
    .line 723
    add-int/lit8 v10, v8, 0x1

    .line 724
    .line 725
    iput v10, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 726
    .line 727
    const/16 v21, 0x27

    .line 728
    .line 729
    aput v21, v7, v8

    .line 730
    .line 731
    goto/16 :goto_7

    .line 732
    .line 733
    :pswitch_24
    const/16 v14, 0x22

    .line 734
    .line 735
    iget v8, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 736
    .line 737
    if-ne v8, v14, :cond_3a

    .line 738
    .line 739
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 740
    .line 741
    add-int/lit8 v10, v8, 0x1

    .line 742
    .line 743
    iput v10, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 744
    .line 745
    const/16 v10, 0x21

    .line 746
    .line 747
    aput v10, v7, v8

    .line 748
    .line 749
    goto/16 :goto_7

    .line 750
    .line 751
    :pswitch_25
    const/16 v14, 0x22

    .line 752
    .line 753
    iget v8, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 754
    .line 755
    if-ne v8, v14, :cond_3a

    .line 756
    .line 757
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 758
    .line 759
    add-int/lit8 v10, v8, 0x1

    .line 760
    .line 761
    iput v10, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 762
    .line 763
    const/16 v10, 0x25

    .line 764
    .line 765
    aput v10, v7, v8

    .line 766
    .line 767
    goto/16 :goto_7

    .line 768
    .line 769
    :pswitch_26
    const/16 v14, 0x22

    .line 770
    .line 771
    iget v8, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 772
    .line 773
    if-ne v8, v14, :cond_3a

    .line 774
    .line 775
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 776
    .line 777
    add-int/lit8 v10, v8, 0x1

    .line 778
    .line 779
    iput v10, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 780
    .line 781
    const/16 v10, 0x24

    .line 782
    .line 783
    aput v10, v7, v8

    .line 784
    .line 785
    goto/16 :goto_7

    .line 786
    .line 787
    :pswitch_27
    const/16 v14, 0x22

    .line 788
    .line 789
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 790
    .line 791
    if-ne v7, v14, :cond_3a

    .line 792
    .line 793
    const/16 v7, 0x48

    .line 794
    .line 795
    if-le v4, v7, :cond_3a

    .line 796
    .line 797
    const/16 v4, 0x48

    .line 798
    .line 799
    goto/16 :goto_7

    .line 800
    .line 801
    :pswitch_28
    const-wide v7, -0x400000001L

    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    and-long v7, v24, v7

    .line 807
    .line 808
    cmp-long v7, v7, v22

    .line 809
    .line 810
    if-eqz v7, :cond_3a

    .line 811
    .line 812
    const/16 v7, 0x21

    .line 813
    .line 814
    const/16 v8, 0x23

    .line 815
    .line 816
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 817
    .line 818
    .line 819
    goto/16 :goto_7

    .line 820
    .line 821
    :pswitch_29
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 822
    .line 823
    const/16 v14, 0x22

    .line 824
    .line 825
    if-ne v7, v14, :cond_3a

    .line 826
    .line 827
    const/16 v7, 0x26

    .line 828
    .line 829
    invoke-direct {v0, v14, v7}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 830
    .line 831
    .line 832
    goto/16 :goto_7

    .line 833
    .line 834
    :pswitch_2a
    const/16 v14, 0x22

    .line 835
    .line 836
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 837
    .line 838
    if-ne v7, v14, :cond_3a

    .line 839
    .line 840
    const/16 v7, 0x47

    .line 841
    .line 842
    if-le v4, v7, :cond_3a

    .line 843
    .line 844
    const/16 v4, 0x47

    .line 845
    .line 846
    goto/16 :goto_7

    .line 847
    .line 848
    :pswitch_2b
    const/16 v7, 0x17

    .line 849
    .line 850
    const/16 v8, 0x15

    .line 851
    .line 852
    invoke-direct {v0, v8, v7}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 853
    .line 854
    .line 855
    goto/16 :goto_7

    .line 856
    .line 857
    :pswitch_2c
    const/16 v7, 0x17

    .line 858
    .line 859
    const/16 v8, 0x15

    .line 860
    .line 861
    const-wide v17, -0x400002401L

    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    and-long v17, v24, v17

    .line 867
    .line 868
    cmp-long v10, v17, v22

    .line 869
    .line 870
    if-eqz v10, :cond_3a

    .line 871
    .line 872
    invoke-direct {v0, v8, v7}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 873
    .line 874
    .line 875
    goto/16 :goto_7

    .line 876
    .line 877
    :pswitch_2d
    const/16 v7, 0x17

    .line 878
    .line 879
    const/16 v8, 0x15

    .line 880
    .line 881
    iget v10, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 882
    .line 883
    const/16 v14, 0x22

    .line 884
    .line 885
    if-ne v10, v14, :cond_3a

    .line 886
    .line 887
    invoke-direct {v0, v8, v7}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 888
    .line 889
    .line 890
    goto/16 :goto_7

    .line 891
    .line 892
    :pswitch_2e
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 893
    .line 894
    const/16 v8, 0x27

    .line 895
    .line 896
    if-ne v7, v8, :cond_3a

    .line 897
    .line 898
    const/16 v7, 0x46

    .line 899
    .line 900
    if-le v4, v7, :cond_3a

    .line 901
    .line 902
    const/16 v4, 0x46

    .line 903
    .line 904
    goto/16 :goto_7

    .line 905
    .line 906
    :pswitch_2f
    const/16 v7, 0xe

    .line 907
    .line 908
    const/16 v8, 0x10

    .line 909
    .line 910
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 911
    .line 912
    .line 913
    goto/16 :goto_7

    .line 914
    .line 915
    :pswitch_30
    const/16 v7, 0xe

    .line 916
    .line 917
    const/16 v8, 0x10

    .line 918
    .line 919
    const-wide v27, -0x8000002401L

    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    and-long v27, v24, v27

    .line 925
    .line 926
    cmp-long v10, v27, v22

    .line 927
    .line 928
    if-eqz v10, :cond_3a

    .line 929
    .line 930
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 931
    .line 932
    .line 933
    goto/16 :goto_7

    .line 934
    .line 935
    :pswitch_31
    const/16 v7, 0xe

    .line 936
    .line 937
    const/16 v8, 0x10

    .line 938
    .line 939
    iget v10, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 940
    .line 941
    const/16 v14, 0x27

    .line 942
    .line 943
    if-ne v10, v14, :cond_3a

    .line 944
    .line 945
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 946
    .line 947
    .line 948
    goto/16 :goto_7

    .line 949
    .line 950
    :pswitch_32
    and-long v7, v24, v27

    .line 951
    .line 952
    cmp-long v7, v7, v22

    .line 953
    .line 954
    if-nez v7, :cond_1f

    .line 955
    .line 956
    goto/16 :goto_7

    .line 957
    .line 958
    :cond_1f
    const/16 v8, 0x43

    .line 959
    .line 960
    if-le v4, v8, :cond_20

    .line 961
    .line 962
    const/16 v4, 0x43

    .line 963
    .line 964
    :cond_20
    const/16 v7, 0x16

    .line 965
    .line 966
    const/16 v8, 0x15

    .line 967
    .line 968
    invoke-direct {v0, v8, v7}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 969
    .line 970
    .line 971
    goto/16 :goto_7

    .line 972
    .line 973
    :pswitch_33
    const/16 v8, 0x15

    .line 974
    .line 975
    const-wide v27, 0x280000000000L

    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    and-long v27, v24, v27

    .line 981
    .line 982
    cmp-long v7, v27, v22

    .line 983
    .line 984
    if-eqz v7, :cond_3a

    .line 985
    .line 986
    invoke-direct {v0, v8}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 987
    .line 988
    .line 989
    goto/16 :goto_7

    .line 990
    .line 991
    :pswitch_34
    and-long v7, v24, v27

    .line 992
    .line 993
    cmp-long v7, v7, v22

    .line 994
    .line 995
    if-nez v7, :cond_21

    .line 996
    .line 997
    goto/16 :goto_7

    .line 998
    .line 999
    :cond_21
    const/16 v8, 0x43

    .line 1000
    .line 1001
    if-le v4, v8, :cond_22

    .line 1002
    .line 1003
    const/16 v4, 0x43

    .line 1004
    .line 1005
    :cond_22
    const/16 v7, 0x1e

    .line 1006
    .line 1007
    const/16 v8, 0x20

    .line 1008
    .line 1009
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1010
    .line 1011
    .line 1012
    goto/16 :goto_7

    .line 1013
    .line 1014
    :pswitch_35
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1015
    .line 1016
    const/16 v8, 0x2e

    .line 1017
    .line 1018
    if-ne v7, v8, :cond_3a

    .line 1019
    .line 1020
    const/16 v7, 0x12

    .line 1021
    .line 1022
    invoke-direct {v0, v7}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 1023
    .line 1024
    .line 1025
    goto/16 :goto_7

    .line 1026
    .line 1027
    :pswitch_36
    and-long v7, v24, v27

    .line 1028
    .line 1029
    cmp-long v7, v7, v22

    .line 1030
    .line 1031
    if-nez v7, :cond_23

    .line 1032
    .line 1033
    goto/16 :goto_7

    .line 1034
    .line 1035
    :cond_23
    if-le v4, v12, :cond_24

    .line 1036
    .line 1037
    move v4, v12

    .line 1038
    :cond_24
    const/16 v7, 0xf

    .line 1039
    .line 1040
    const/16 v8, 0x10

    .line 1041
    .line 1042
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 1043
    .line 1044
    .line 1045
    goto/16 :goto_7

    .line 1046
    .line 1047
    :pswitch_37
    const/16 v8, 0x10

    .line 1048
    .line 1049
    const-wide/high16 v27, 0x3fe000000000000L

    .line 1050
    .line 1051
    and-long v27, v24, v27

    .line 1052
    .line 1053
    cmp-long v7, v27, v22

    .line 1054
    .line 1055
    if-nez v7, :cond_25

    .line 1056
    .line 1057
    goto/16 :goto_7

    .line 1058
    .line 1059
    :cond_25
    if-le v4, v12, :cond_26

    .line 1060
    .line 1061
    move v4, v12

    .line 1062
    :cond_26
    const/16 v7, 0xf

    .line 1063
    .line 1064
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 1065
    .line 1066
    .line 1067
    goto/16 :goto_7

    .line 1068
    .line 1069
    :pswitch_38
    iget v8, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1070
    .line 1071
    const/16 v10, 0x23

    .line 1072
    .line 1073
    if-ne v8, v10, :cond_3a

    .line 1074
    .line 1075
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1076
    .line 1077
    add-int/lit8 v10, v8, 0x1

    .line 1078
    .line 1079
    iput v10, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1080
    .line 1081
    aput v9, v7, v8

    .line 1082
    .line 1083
    goto/16 :goto_7

    .line 1084
    .line 1085
    :pswitch_39
    iget v8, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1086
    .line 1087
    const/16 v10, 0xd

    .line 1088
    .line 1089
    if-ne v8, v10, :cond_3a

    .line 1090
    .line 1091
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1092
    .line 1093
    add-int/lit8 v10, v8, 0x1

    .line 1094
    .line 1095
    iput v10, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1096
    .line 1097
    const/16 v10, 0xb

    .line 1098
    .line 1099
    aput v10, v7, v8

    .line 1100
    .line 1101
    goto/16 :goto_7

    .line 1102
    .line 1103
    :pswitch_3a
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1104
    .line 1105
    const/16 v8, 0xa

    .line 1106
    .line 1107
    if-ne v7, v8, :cond_3a

    .line 1108
    .line 1109
    const/16 v7, 0x9

    .line 1110
    .line 1111
    if-le v4, v7, :cond_3a

    .line 1112
    .line 1113
    :goto_5
    const/16 v4, 0x9

    .line 1114
    .line 1115
    goto/16 :goto_7

    .line 1116
    .line 1117
    :pswitch_3b
    const-wide/16 v7, 0x2400

    .line 1118
    .line 1119
    and-long v7, v24, v7

    .line 1120
    .line 1121
    cmp-long v7, v7, v22

    .line 1122
    .line 1123
    if-eqz v7, :cond_3a

    .line 1124
    .line 1125
    const/16 v7, 0x9

    .line 1126
    .line 1127
    if-le v4, v7, :cond_3a

    .line 1128
    .line 1129
    goto :goto_5

    .line 1130
    :pswitch_3c
    const-wide/16 v7, -0x2401

    .line 1131
    .line 1132
    and-long v7, v24, v7

    .line 1133
    .line 1134
    cmp-long v7, v7, v22

    .line 1135
    .line 1136
    if-eqz v7, :cond_3a

    .line 1137
    .line 1138
    const/16 v7, 0x1b

    .line 1139
    .line 1140
    const/16 v8, 0x1d

    .line 1141
    .line 1142
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1143
    .line 1144
    .line 1145
    goto/16 :goto_7

    .line 1146
    .line 1147
    :pswitch_3d
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1148
    .line 1149
    const/16 v8, 0x21

    .line 1150
    .line 1151
    if-ne v7, v8, :cond_3a

    .line 1152
    .line 1153
    const/16 v7, 0x1b

    .line 1154
    .line 1155
    const/16 v8, 0x1d

    .line 1156
    .line 1157
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1158
    .line 1159
    .line 1160
    goto/16 :goto_7

    .line 1161
    .line 1162
    :pswitch_3e
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1163
    .line 1164
    if-eq v7, v12, :cond_27

    .line 1165
    .line 1166
    goto/16 :goto_7

    .line 1167
    .line 1168
    :cond_27
    if-le v4, v14, :cond_28

    .line 1169
    .line 1170
    move v4, v14

    .line 1171
    :cond_28
    invoke-direct {v0, v14}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 1172
    .line 1173
    .line 1174
    goto/16 :goto_7

    .line 1175
    .line 1176
    :pswitch_3f
    iget v8, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1177
    .line 1178
    if-ne v8, v12, :cond_3a

    .line 1179
    .line 1180
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1181
    .line 1182
    add-int/lit8 v10, v8, 0x1

    .line 1183
    .line 1184
    iput v10, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1185
    .line 1186
    const/4 v10, 0x5

    .line 1187
    aput v10, v7, v8

    .line 1188
    .line 1189
    goto/16 :goto_7

    .line 1190
    .line 1191
    :pswitch_40
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1192
    .line 1193
    const/16 v8, 0x2c

    .line 1194
    .line 1195
    if-ne v7, v8, :cond_3a

    .line 1196
    .line 1197
    invoke-direct {v0, v2, v13}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1198
    .line 1199
    .line 1200
    goto/16 :goto_7

    .line 1201
    .line 1202
    :pswitch_41
    iget v8, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1203
    .line 1204
    const/16 v10, 0x26

    .line 1205
    .line 1206
    if-ne v8, v10, :cond_3a

    .line 1207
    .line 1208
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1209
    .line 1210
    add-int/lit8 v10, v8, 0x1

    .line 1211
    .line 1212
    iput v10, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1213
    .line 1214
    aput v13, v7, v8

    .line 1215
    .line 1216
    goto/16 :goto_7

    .line 1217
    .line 1218
    :pswitch_42
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1219
    .line 1220
    const/16 v8, 0x20

    .line 1221
    .line 1222
    if-ne v7, v8, :cond_3a

    .line 1223
    .line 1224
    invoke-direct {v0, v2, v13}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1225
    .line 1226
    .line 1227
    goto/16 :goto_7

    .line 1228
    .line 1229
    :pswitch_43
    const-wide v7, -0x6800004000002401L

    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    and-long v7, v24, v7

    .line 1235
    .line 1236
    cmp-long v7, v7, v22

    .line 1237
    .line 1238
    if-eqz v7, :cond_3a

    .line 1239
    .line 1240
    invoke-direct {v0, v2, v13}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1241
    .line 1242
    .line 1243
    goto/16 :goto_7

    .line 1244
    .line 1245
    :pswitch_44
    const-wide v30, 0x1ffffffffL

    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    and-long v30, v24, v30

    .line 1251
    .line 1252
    cmp-long v8, v30, v22

    .line 1253
    .line 1254
    if-eqz v8, :cond_2a

    .line 1255
    .line 1256
    const/4 v8, 0x6

    .line 1257
    if-le v4, v8, :cond_29

    .line 1258
    .line 1259
    const/4 v4, 0x6

    .line 1260
    :cond_29
    invoke-direct {v0, v2}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 1261
    .line 1262
    .line 1263
    goto :goto_6

    .line 1264
    :cond_2a
    and-long v27, v24, v27

    .line 1265
    .line 1266
    cmp-long v8, v27, v22

    .line 1267
    .line 1268
    if-eqz v8, :cond_2b

    .line 1269
    .line 1270
    const/4 v7, 0x4

    .line 1271
    const/16 v8, 0xb

    .line 1272
    .line 1273
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1274
    .line 1275
    .line 1276
    goto :goto_6

    .line 1277
    :cond_2b
    iget v8, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1278
    .line 1279
    const/16 v10, 0x2f

    .line 1280
    .line 1281
    if-ne v8, v10, :cond_2c

    .line 1282
    .line 1283
    const/16 v7, 0xc

    .line 1284
    .line 1285
    const/16 v8, 0xd

    .line 1286
    .line 1287
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjAddStates(II)V

    .line 1288
    .line 1289
    .line 1290
    goto :goto_6

    .line 1291
    :cond_2c
    const/16 v10, 0x24

    .line 1292
    .line 1293
    if-ne v8, v10, :cond_2e

    .line 1294
    .line 1295
    const/16 v10, 0x49

    .line 1296
    .line 1297
    if-le v4, v10, :cond_2d

    .line 1298
    .line 1299
    const/16 v4, 0x49

    .line 1300
    .line 1301
    :cond_2d
    invoke-direct {v0, v1}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 1302
    .line 1303
    .line 1304
    goto :goto_6

    .line 1305
    :cond_2e
    const/16 v14, 0x22

    .line 1306
    .line 1307
    if-ne v8, v14, :cond_2f

    .line 1308
    .line 1309
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1310
    .line 1311
    add-int/lit8 v10, v8, 0x1

    .line 1312
    .line 1313
    iput v10, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1314
    .line 1315
    const/16 v14, 0x27

    .line 1316
    .line 1317
    aput v14, v7, v8

    .line 1318
    .line 1319
    goto :goto_6

    .line 1320
    :cond_2f
    const/16 v14, 0x27

    .line 1321
    .line 1322
    if-ne v8, v14, :cond_30

    .line 1323
    .line 1324
    const/16 v10, 0xe

    .line 1325
    .line 1326
    const/16 v14, 0x10

    .line 1327
    .line 1328
    invoke-direct {v0, v10, v14}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1329
    .line 1330
    .line 1331
    goto :goto_6

    .line 1332
    :cond_30
    const/16 v10, 0x2e

    .line 1333
    .line 1334
    if-ne v8, v10, :cond_31

    .line 1335
    .line 1336
    const/16 v7, 0x12

    .line 1337
    .line 1338
    invoke-direct {v0, v7}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 1339
    .line 1340
    .line 1341
    goto :goto_6

    .line 1342
    :cond_31
    const/16 v10, 0x23

    .line 1343
    .line 1344
    if-ne v8, v10, :cond_32

    .line 1345
    .line 1346
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1347
    .line 1348
    add-int/lit8 v10, v8, 0x1

    .line 1349
    .line 1350
    iput v10, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1351
    .line 1352
    aput v9, v7, v8

    .line 1353
    .line 1354
    goto :goto_6

    .line 1355
    :cond_32
    const/16 v7, 0x3c

    .line 1356
    .line 1357
    if-ne v8, v7, :cond_33

    .line 1358
    .line 1359
    invoke-direct {v0, v2, v13}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1360
    .line 1361
    .line 1362
    :cond_33
    :goto_6
    const-wide/high16 v7, 0x3fe000000000000L

    .line 1363
    .line 1364
    and-long v7, v24, v7

    .line 1365
    .line 1366
    cmp-long v7, v7, v22

    .line 1367
    .line 1368
    if-eqz v7, :cond_35

    .line 1369
    .line 1370
    if-le v4, v12, :cond_34

    .line 1371
    .line 1372
    move v4, v12

    .line 1373
    :cond_34
    const/16 v7, 0xf

    .line 1374
    .line 1375
    const/16 v8, 0x10

    .line 1376
    .line 1377
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 1378
    .line 1379
    .line 1380
    goto :goto_7

    .line 1381
    :cond_35
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1382
    .line 1383
    const/16 v8, 0x30

    .line 1384
    .line 1385
    if-ne v7, v8, :cond_37

    .line 1386
    .line 1387
    if-le v4, v12, :cond_36

    .line 1388
    .line 1389
    move v4, v12

    .line 1390
    :cond_36
    const/16 v7, 0x11

    .line 1391
    .line 1392
    const/16 v8, 0x14

    .line 1393
    .line 1394
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1395
    .line 1396
    .line 1397
    goto :goto_7

    .line 1398
    :cond_37
    const/16 v14, 0x22

    .line 1399
    .line 1400
    if-ne v7, v14, :cond_3a

    .line 1401
    .line 1402
    const/16 v7, 0x17

    .line 1403
    .line 1404
    const/16 v8, 0x15

    .line 1405
    .line 1406
    invoke-direct {v0, v8, v7}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1407
    .line 1408
    .line 1409
    goto :goto_7

    .line 1410
    :pswitch_45
    const-wide v7, 0x1ffffffffL

    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    and-long v7, v24, v7

    .line 1416
    .line 1417
    cmp-long v7, v7, v22

    .line 1418
    .line 1419
    if-nez v7, :cond_38

    .line 1420
    .line 1421
    goto :goto_7

    .line 1422
    :cond_38
    const/4 v8, 0x6

    .line 1423
    if-le v4, v8, :cond_39

    .line 1424
    .line 1425
    const/4 v4, 0x6

    .line 1426
    :cond_39
    invoke-direct {v0, v2}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 1427
    .line 1428
    .line 1429
    :cond_3a
    :goto_7
    if-ne v5, v6, :cond_3b

    .line 1430
    .line 1431
    goto/16 :goto_1b

    .line 1432
    .line 1433
    :cond_3b
    const/16 v10, 0x1a

    .line 1434
    .line 1435
    goto/16 :goto_1

    .line 1436
    .line 1437
    :cond_3c
    const/16 v8, 0x80

    .line 1438
    .line 1439
    if-ge v7, v8, :cond_4c

    .line 1440
    .line 1441
    and-int/lit8 v7, v7, 0x3f

    .line 1442
    .line 1443
    const-wide/16 v24, 0x1

    .line 1444
    .line 1445
    shl-long v24, v24, v7

    .line 1446
    .line 1447
    :cond_3d
    iget-object v7, v0, Lbsh/ParserTokenManager;->jjstateSet:[I

    .line 1448
    .line 1449
    add-int/lit8 v5, v5, -0x1

    .line 1450
    .line 1451
    aget v8, v7, v5

    .line 1452
    .line 1453
    sparse-switch v8, :sswitch_data_0

    .line 1454
    .line 1455
    .line 1456
    :goto_8
    goto :goto_9

    .line 1457
    :sswitch_0
    const/16 v7, 0x4e

    .line 1458
    .line 1459
    invoke-direct {v0, v7, v15}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 1460
    .line 1461
    .line 1462
    goto :goto_9

    .line 1463
    :sswitch_1
    invoke-direct {v0, v11, v15}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 1464
    .line 1465
    .line 1466
    goto :goto_9

    .line 1467
    :sswitch_2
    if-le v4, v9, :cond_3e

    .line 1468
    .line 1469
    move v4, v9

    .line 1470
    :cond_3e
    const/16 v7, 0x18

    .line 1471
    .line 1472
    const/16 v8, 0x1a

    .line 1473
    .line 1474
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjAddStates(II)V

    .line 1475
    .line 1476
    .line 1477
    :goto_9
    const/16 v8, 0x43

    .line 1478
    .line 1479
    const/16 v14, 0x27

    .line 1480
    .line 1481
    goto/16 :goto_c

    .line 1482
    .line 1483
    :sswitch_3
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1484
    .line 1485
    const/16 v8, 0x5f

    .line 1486
    .line 1487
    if-eq v7, v8, :cond_3f

    .line 1488
    .line 1489
    goto :goto_8

    .line 1490
    :cond_3f
    if-le v4, v12, :cond_40

    .line 1491
    .line 1492
    move v4, v12

    .line 1493
    :cond_40
    const/16 v7, 0x29

    .line 1494
    .line 1495
    const/16 v14, 0x27

    .line 1496
    .line 1497
    invoke-direct {v0, v14, v7}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1498
    .line 1499
    .line 1500
    :cond_41
    :goto_a
    const/16 v8, 0x43

    .line 1501
    .line 1502
    goto/16 :goto_c

    .line 1503
    .line 1504
    :sswitch_4
    const/16 v14, 0x27

    .line 1505
    .line 1506
    const-wide v7, 0x400000004L

    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    and-long v7, v24, v7

    .line 1512
    .line 1513
    cmp-long v7, v7, v22

    .line 1514
    .line 1515
    if-nez v7, :cond_42

    .line 1516
    .line 1517
    :goto_b
    goto :goto_a

    .line 1518
    :cond_42
    if-le v4, v12, :cond_43

    .line 1519
    .line 1520
    move v4, v12

    .line 1521
    :cond_43
    const/16 v7, 0x29

    .line 1522
    .line 1523
    invoke-direct {v0, v14, v7}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1524
    .line 1525
    .line 1526
    goto :goto_a

    .line 1527
    :sswitch_5
    const/16 v14, 0x27

    .line 1528
    .line 1529
    const-wide v7, 0x7e8000007eL

    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    and-long v7, v24, v7

    .line 1535
    .line 1536
    cmp-long v7, v7, v22

    .line 1537
    .line 1538
    if-nez v7, :cond_44

    .line 1539
    .line 1540
    goto :goto_b

    .line 1541
    :cond_44
    if-le v4, v12, :cond_45

    .line 1542
    .line 1543
    move v4, v12

    .line 1544
    :cond_45
    const/16 v7, 0x10

    .line 1545
    .line 1546
    const/16 v8, 0x3f

    .line 1547
    .line 1548
    invoke-direct {v0, v8, v7}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 1549
    .line 1550
    .line 1551
    goto :goto_a

    .line 1552
    :sswitch_6
    const/16 v8, 0x3f

    .line 1553
    .line 1554
    const/16 v14, 0x27

    .line 1555
    .line 1556
    const-wide v20, 0x100000001000000L

    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    and-long v20, v24, v20

    .line 1562
    .line 1563
    cmp-long v7, v20, v22

    .line 1564
    .line 1565
    if-eqz v7, :cond_41

    .line 1566
    .line 1567
    invoke-direct {v0, v8}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 1568
    .line 1569
    .line 1570
    goto :goto_a

    .line 1571
    :sswitch_7
    const/16 v8, 0x3f

    .line 1572
    .line 1573
    const/16 v14, 0x27

    .line 1574
    .line 1575
    const-wide v20, 0x5000000050L

    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    and-long v20, v24, v20

    .line 1581
    .line 1582
    cmp-long v7, v20, v22

    .line 1583
    .line 1584
    if-eqz v7, :cond_41

    .line 1585
    .line 1586
    const/16 v7, 0x43

    .line 1587
    .line 1588
    if-le v4, v7, :cond_46

    .line 1589
    .line 1590
    const/16 v4, 0x43

    .line 1591
    .line 1592
    goto :goto_a

    .line 1593
    :cond_46
    move v8, v7

    .line 1594
    goto/16 :goto_c

    .line 1595
    .line 1596
    :sswitch_8
    const/16 v8, 0x3f

    .line 1597
    .line 1598
    const/16 v14, 0x27

    .line 1599
    .line 1600
    const-wide v20, 0x2000000020L

    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    and-long v20, v24, v20

    .line 1606
    .line 1607
    cmp-long v7, v20, v22

    .line 1608
    .line 1609
    if-eqz v7, :cond_41

    .line 1610
    .line 1611
    const/16 v7, 0x33

    .line 1612
    .line 1613
    const/16 v10, 0x34

    .line 1614
    .line 1615
    invoke-direct {v0, v7, v10}, Lbsh/ParserTokenManager;->jjAddStates(II)V

    .line 1616
    .line 1617
    .line 1618
    goto :goto_a

    .line 1619
    :sswitch_9
    const/16 v8, 0x3f

    .line 1620
    .line 1621
    const/16 v14, 0x27

    .line 1622
    .line 1623
    const-wide v20, 0x2000000020L

    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    and-long v20, v24, v20

    .line 1629
    .line 1630
    cmp-long v7, v20, v22

    .line 1631
    .line 1632
    if-eqz v7, :cond_41

    .line 1633
    .line 1634
    const/16 v7, 0x31

    .line 1635
    .line 1636
    const/16 v10, 0x32

    .line 1637
    .line 1638
    invoke-direct {v0, v7, v10}, Lbsh/ParserTokenManager;->jjAddStates(II)V

    .line 1639
    .line 1640
    .line 1641
    goto/16 :goto_a

    .line 1642
    .line 1643
    :sswitch_a
    const/16 v8, 0x3f

    .line 1644
    .line 1645
    const/16 v14, 0x27

    .line 1646
    .line 1647
    const-wide v20, 0x2000000020L

    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    and-long v20, v24, v20

    .line 1653
    .line 1654
    cmp-long v7, v20, v22

    .line 1655
    .line 1656
    if-eqz v7, :cond_41

    .line 1657
    .line 1658
    const/16 v7, 0x2f

    .line 1659
    .line 1660
    const/16 v10, 0x30

    .line 1661
    .line 1662
    invoke-direct {v0, v7, v10}, Lbsh/ParserTokenManager;->jjAddStates(II)V

    .line 1663
    .line 1664
    .line 1665
    goto/16 :goto_a

    .line 1666
    .line 1667
    :sswitch_b
    const/16 v8, 0x3f

    .line 1668
    .line 1669
    const/16 v14, 0x27

    .line 1670
    .line 1671
    const/16 v7, 0x21

    .line 1672
    .line 1673
    const/16 v10, 0x23

    .line 1674
    .line 1675
    invoke-direct {v0, v7, v10}, Lbsh/ParserTokenManager;->jjAddStates(II)V

    .line 1676
    .line 1677
    .line 1678
    goto/16 :goto_a

    .line 1679
    .line 1680
    :sswitch_c
    const/16 v7, 0x17

    .line 1681
    .line 1682
    const/16 v8, 0x3f

    .line 1683
    .line 1684
    const/16 v10, 0x15

    .line 1685
    .line 1686
    const/16 v14, 0x27

    .line 1687
    .line 1688
    invoke-direct {v0, v10, v7}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1689
    .line 1690
    .line 1691
    goto/16 :goto_a

    .line 1692
    .line 1693
    :sswitch_d
    const/16 v8, 0x3f

    .line 1694
    .line 1695
    const/16 v14, 0x27

    .line 1696
    .line 1697
    iget v10, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1698
    .line 1699
    const/16 v8, 0x5c

    .line 1700
    .line 1701
    if-ne v10, v8, :cond_41

    .line 1702
    .line 1703
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1704
    .line 1705
    add-int/lit8 v10, v8, 0x1

    .line 1706
    .line 1707
    iput v10, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1708
    .line 1709
    const/16 v10, 0x1f

    .line 1710
    .line 1711
    aput v10, v7, v8

    .line 1712
    .line 1713
    goto/16 :goto_a

    .line 1714
    .line 1715
    :sswitch_e
    const/16 v14, 0x27

    .line 1716
    .line 1717
    const-wide/32 v7, -0x10000001

    .line 1718
    .line 1719
    .line 1720
    and-long v7, v24, v7

    .line 1721
    .line 1722
    cmp-long v7, v7, v22

    .line 1723
    .line 1724
    if-eqz v7, :cond_41

    .line 1725
    .line 1726
    const/16 v7, 0x17

    .line 1727
    .line 1728
    const/16 v8, 0x15

    .line 1729
    .line 1730
    invoke-direct {v0, v8, v7}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1731
    .line 1732
    .line 1733
    goto/16 :goto_a

    .line 1734
    .line 1735
    :sswitch_f
    const/16 v7, 0xe

    .line 1736
    .line 1737
    const/16 v8, 0x10

    .line 1738
    .line 1739
    const/16 v14, 0x27

    .line 1740
    .line 1741
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1742
    .line 1743
    .line 1744
    goto/16 :goto_a

    .line 1745
    .line 1746
    :sswitch_10
    const/16 v14, 0x27

    .line 1747
    .line 1748
    iget v8, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1749
    .line 1750
    const/16 v10, 0x5c

    .line 1751
    .line 1752
    if-ne v8, v10, :cond_41

    .line 1753
    .line 1754
    iget v8, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1755
    .line 1756
    add-int/lit8 v10, v8, 0x1

    .line 1757
    .line 1758
    iput v10, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 1759
    .line 1760
    const/16 v29, 0x1a

    .line 1761
    .line 1762
    aput v29, v7, v8

    .line 1763
    .line 1764
    goto/16 :goto_a

    .line 1765
    .line 1766
    :sswitch_11
    const/16 v14, 0x27

    .line 1767
    .line 1768
    const-wide/32 v7, -0x10000001

    .line 1769
    .line 1770
    .line 1771
    and-long v7, v24, v7

    .line 1772
    .line 1773
    cmp-long v7, v7, v22

    .line 1774
    .line 1775
    if-eqz v7, :cond_41

    .line 1776
    .line 1777
    const/16 v7, 0xe

    .line 1778
    .line 1779
    const/16 v8, 0x10

    .line 1780
    .line 1781
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1782
    .line 1783
    .line 1784
    goto/16 :goto_a

    .line 1785
    .line 1786
    :sswitch_12
    const/16 v14, 0x27

    .line 1787
    .line 1788
    const-wide v7, 0x80005000800050L

    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    and-long v7, v24, v7

    .line 1794
    .line 1795
    cmp-long v7, v7, v22

    .line 1796
    .line 1797
    if-eqz v7, :cond_41

    .line 1798
    .line 1799
    const/16 v8, 0x43

    .line 1800
    .line 1801
    if-le v4, v8, :cond_4b

    .line 1802
    .line 1803
    move v4, v8

    .line 1804
    goto/16 :goto_c

    .line 1805
    .line 1806
    :sswitch_13
    const/16 v8, 0x43

    .line 1807
    .line 1808
    const/16 v14, 0x27

    .line 1809
    .line 1810
    const-wide v26, 0x2000000020L

    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    and-long v26, v24, v26

    .line 1816
    .line 1817
    cmp-long v7, v26, v22

    .line 1818
    .line 1819
    if-eqz v7, :cond_4b

    .line 1820
    .line 1821
    const/16 v7, 0x2d

    .line 1822
    .line 1823
    const/16 v10, 0x2e

    .line 1824
    .line 1825
    invoke-direct {v0, v7, v10}, Lbsh/ParserTokenManager;->jjAddStates(II)V

    .line 1826
    .line 1827
    .line 1828
    goto :goto_c

    .line 1829
    :sswitch_14
    const/16 v8, 0x43

    .line 1830
    .line 1831
    const/16 v14, 0x27

    .line 1832
    .line 1833
    const-wide v26, 0x88920000889200L

    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    and-long v26, v24, v26

    .line 1839
    .line 1840
    cmp-long v7, v26, v22

    .line 1841
    .line 1842
    if-eqz v7, :cond_4b

    .line 1843
    .line 1844
    if-le v4, v12, :cond_4b

    .line 1845
    .line 1846
    move v4, v12

    .line 1847
    goto :goto_c

    .line 1848
    :sswitch_15
    const/16 v8, 0x43

    .line 1849
    .line 1850
    const/16 v14, 0x27

    .line 1851
    .line 1852
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 1853
    .line 1854
    const/16 v10, 0x5f

    .line 1855
    .line 1856
    if-eq v7, v10, :cond_47

    .line 1857
    .line 1858
    goto :goto_c

    .line 1859
    :cond_47
    if-le v4, v12, :cond_48

    .line 1860
    .line 1861
    move v4, v12

    .line 1862
    :cond_48
    const/16 v7, 0xf

    .line 1863
    .line 1864
    const/16 v10, 0x10

    .line 1865
    .line 1866
    invoke-direct {v0, v7, v10}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 1867
    .line 1868
    .line 1869
    goto :goto_c

    .line 1870
    :sswitch_16
    const/16 v8, 0x43

    .line 1871
    .line 1872
    const/16 v14, 0x27

    .line 1873
    .line 1874
    const/16 v7, 0x1b

    .line 1875
    .line 1876
    const/16 v10, 0x1d

    .line 1877
    .line 1878
    invoke-direct {v0, v7, v10}, Lbsh/ParserTokenManager;->jjAddStates(II)V

    .line 1879
    .line 1880
    .line 1881
    goto :goto_c

    .line 1882
    :sswitch_17
    const/16 v8, 0x43

    .line 1883
    .line 1884
    const/16 v14, 0x27

    .line 1885
    .line 1886
    const-wide v26, -0x1000000000000001L    # -3.1050361846014175E231

    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    and-long v26, v24, v26

    .line 1892
    .line 1893
    cmp-long v7, v26, v22

    .line 1894
    .line 1895
    if-eqz v7, :cond_4b

    .line 1896
    .line 1897
    invoke-direct {v0, v2, v13}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 1898
    .line 1899
    .line 1900
    goto :goto_c

    .line 1901
    :sswitch_18
    const/16 v8, 0x43

    .line 1902
    .line 1903
    const/16 v14, 0x27

    .line 1904
    .line 1905
    const-wide v26, 0x7fffffe87fffffeL

    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    and-long v26, v24, v26

    .line 1911
    .line 1912
    cmp-long v7, v26, v22

    .line 1913
    .line 1914
    if-nez v7, :cond_49

    .line 1915
    .line 1916
    goto :goto_c

    .line 1917
    :cond_49
    const/16 v7, 0x49

    .line 1918
    .line 1919
    if-le v4, v7, :cond_4a

    .line 1920
    .line 1921
    const/16 v4, 0x49

    .line 1922
    .line 1923
    :cond_4a
    invoke-direct {v0, v1}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 1924
    .line 1925
    .line 1926
    :cond_4b
    :goto_c
    if-ne v5, v6, :cond_3d

    .line 1927
    .line 1928
    goto/16 :goto_1b

    .line 1929
    .line 1930
    :cond_4c
    shr-int/lit8 v30, v7, 0x8

    .line 1931
    .line 1932
    shr-int/lit8 v31, v7, 0xe

    .line 1933
    .line 1934
    and-int/lit8 v8, v30, 0x3f

    .line 1935
    .line 1936
    const-wide/16 v20, 0x1

    .line 1937
    .line 1938
    shl-long v33, v20, v8

    .line 1939
    .line 1940
    and-int/lit16 v8, v7, 0xff

    .line 1941
    .line 1942
    const/4 v10, 0x6

    .line 1943
    shr-int/lit8 v32, v8, 0x6

    .line 1944
    .line 1945
    and-int/lit8 v7, v7, 0x3f

    .line 1946
    .line 1947
    shl-long v35, v20, v7

    .line 1948
    .line 1949
    :cond_4d
    iget-object v7, v0, Lbsh/ParserTokenManager;->jjstateSet:[I

    .line 1950
    .line 1951
    add-int/lit8 v5, v5, -0x1

    .line 1952
    .line 1953
    aget v7, v7, v5

    .line 1954
    .line 1955
    if-eqz v7, :cond_66

    .line 1956
    .line 1957
    const/4 v8, 0x1

    .line 1958
    if-eq v7, v8, :cond_61

    .line 1959
    .line 1960
    const/4 v10, 0x2

    .line 1961
    if-eq v7, v10, :cond_60

    .line 1962
    .line 1963
    const/16 v10, 0x9

    .line 1964
    .line 1965
    if-eq v7, v10, :cond_5f

    .line 1966
    .line 1967
    const/16 v10, 0x18

    .line 1968
    .line 1969
    if-eq v7, v10, :cond_5e

    .line 1970
    .line 1971
    const/16 v10, 0x1a

    .line 1972
    .line 1973
    if-eq v7, v10, :cond_5d

    .line 1974
    .line 1975
    const/16 v10, 0x1d

    .line 1976
    .line 1977
    if-eq v7, v10, :cond_5a

    .line 1978
    .line 1979
    const/16 v10, 0x1f

    .line 1980
    .line 1981
    if-eq v7, v10, :cond_5a

    .line 1982
    .line 1983
    const/16 v14, 0x22

    .line 1984
    .line 1985
    if-eq v7, v14, :cond_58

    .line 1986
    .line 1987
    const/16 v10, 0x46

    .line 1988
    .line 1989
    if-eq v7, v10, :cond_55

    .line 1990
    .line 1991
    if-eq v7, v11, :cond_54

    .line 1992
    .line 1993
    const/16 v10, 0x50

    .line 1994
    .line 1995
    if-eq v7, v10, :cond_53

    .line 1996
    .line 1997
    const/16 v10, 0x29

    .line 1998
    .line 1999
    if-eq v7, v10, :cond_50

    .line 2000
    .line 2001
    if-eq v7, v1, :cond_50

    .line 2002
    .line 2003
    const/16 v10, 0x4d

    .line 2004
    .line 2005
    if-eq v7, v10, :cond_4f

    .line 2006
    .line 2007
    const/16 v10, 0x4e

    .line 2008
    .line 2009
    if-eq v7, v10, :cond_4f

    .line 2010
    .line 2011
    :cond_4e
    :goto_d
    const/16 v8, 0x49

    .line 2012
    .line 2013
    const/16 v10, 0x1a

    .line 2014
    .line 2015
    :goto_e
    const/16 v12, 0x15

    .line 2016
    .line 2017
    goto/16 :goto_19

    .line 2018
    .line 2019
    :cond_4f
    invoke-static/range {v30 .. v36}, Lbsh/ParserTokenManager;->jjCanMove_1(IIIJJ)Z

    .line 2020
    .line 2021
    .line 2022
    move-result v7

    .line 2023
    if-eqz v7, :cond_4e

    .line 2024
    .line 2025
    const/16 v7, 0x4e

    .line 2026
    .line 2027
    invoke-direct {v0, v7, v15}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 2028
    .line 2029
    .line 2030
    goto :goto_d

    .line 2031
    :cond_50
    invoke-static/range {v30 .. v36}, Lbsh/ParserTokenManager;->jjCanMove_2(IIIJJ)Z

    .line 2032
    .line 2033
    .line 2034
    move-result v7

    .line 2035
    if-nez v7, :cond_51

    .line 2036
    .line 2037
    goto :goto_d

    .line 2038
    :cond_51
    const/16 v7, 0x49

    .line 2039
    .line 2040
    if-le v4, v7, :cond_52

    .line 2041
    .line 2042
    const/16 v7, 0x49

    .line 2043
    .line 2044
    goto :goto_f

    .line 2045
    :cond_52
    move v7, v4

    .line 2046
    :goto_f
    invoke-direct {v0, v1}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 2047
    .line 2048
    .line 2049
    move v4, v7

    .line 2050
    const/4 v7, 0x6

    .line 2051
    const/16 v8, 0x49

    .line 2052
    .line 2053
    const/16 v10, 0x1a

    .line 2054
    .line 2055
    :goto_10
    const/16 v12, 0x15

    .line 2056
    .line 2057
    goto/16 :goto_1a

    .line 2058
    .line 2059
    :cond_53
    :goto_11
    const/16 v10, 0x1a

    .line 2060
    .line 2061
    const/16 v12, 0x15

    .line 2062
    .line 2063
    goto/16 :goto_15

    .line 2064
    .line 2065
    :cond_54
    invoke-static/range {v30 .. v36}, Lbsh/ParserTokenManager;->jjCanMove_1(IIIJJ)Z

    .line 2066
    .line 2067
    .line 2068
    move-result v7

    .line 2069
    if-eqz v7, :cond_4e

    .line 2070
    .line 2071
    invoke-direct {v0, v11, v15}, Lbsh/ParserTokenManager;->jjCheckNAddTwoStates(II)V

    .line 2072
    .line 2073
    .line 2074
    goto :goto_d

    .line 2075
    :cond_55
    invoke-static/range {v30 .. v36}, Lbsh/ParserTokenManager;->jjCanMove_1(IIIJJ)Z

    .line 2076
    .line 2077
    .line 2078
    move-result v7

    .line 2079
    if-nez v7, :cond_56

    .line 2080
    .line 2081
    goto :goto_d

    .line 2082
    :cond_56
    if-le v4, v9, :cond_57

    .line 2083
    .line 2084
    move v4, v9

    .line 2085
    :cond_57
    const/16 v7, 0x18

    .line 2086
    .line 2087
    const/16 v10, 0x1a

    .line 2088
    .line 2089
    invoke-direct {v0, v7, v10}, Lbsh/ParserTokenManager;->jjAddStates(II)V

    .line 2090
    .line 2091
    .line 2092
    const/4 v7, 0x6

    .line 2093
    const/16 v8, 0x49

    .line 2094
    .line 2095
    goto :goto_10

    .line 2096
    :cond_58
    const/16 v10, 0x1a

    .line 2097
    .line 2098
    invoke-static/range {v30 .. v36}, Lbsh/ParserTokenManager;->jjCanMove_1(IIIJJ)Z

    .line 2099
    .line 2100
    .line 2101
    move-result v7

    .line 2102
    if-eqz v7, :cond_59

    .line 2103
    .line 2104
    const/16 v7, 0x21

    .line 2105
    .line 2106
    const/16 v12, 0x23

    .line 2107
    .line 2108
    invoke-direct {v0, v7, v12}, Lbsh/ParserTokenManager;->jjAddStates(II)V

    .line 2109
    .line 2110
    .line 2111
    :cond_59
    const/16 v8, 0x49

    .line 2112
    .line 2113
    goto :goto_e

    .line 2114
    :cond_5a
    const/16 v10, 0x1a

    .line 2115
    .line 2116
    const/16 v14, 0x22

    .line 2117
    .line 2118
    invoke-static/range {v30 .. v36}, Lbsh/ParserTokenManager;->jjCanMove_1(IIIJJ)Z

    .line 2119
    .line 2120
    .line 2121
    move-result v7

    .line 2122
    if-eqz v7, :cond_5c

    .line 2123
    .line 2124
    const/16 v7, 0x17

    .line 2125
    .line 2126
    const/16 v12, 0x15

    .line 2127
    .line 2128
    invoke-direct {v0, v12, v7}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 2129
    .line 2130
    .line 2131
    :cond_5b
    :goto_12
    const/16 v8, 0x49

    .line 2132
    .line 2133
    goto/16 :goto_19

    .line 2134
    .line 2135
    :cond_5c
    const/16 v12, 0x15

    .line 2136
    .line 2137
    goto :goto_12

    .line 2138
    :cond_5d
    :goto_13
    const/16 v7, 0x17

    .line 2139
    .line 2140
    const/16 v12, 0x15

    .line 2141
    .line 2142
    const/16 v14, 0x22

    .line 2143
    .line 2144
    goto :goto_14

    .line 2145
    :cond_5e
    const/16 v10, 0x1a

    .line 2146
    .line 2147
    goto :goto_13

    .line 2148
    :goto_14
    invoke-static/range {v30 .. v36}, Lbsh/ParserTokenManager;->jjCanMove_1(IIIJJ)Z

    .line 2149
    .line 2150
    .line 2151
    move-result v17

    .line 2152
    if-eqz v17, :cond_5b

    .line 2153
    .line 2154
    const/16 v7, 0xe

    .line 2155
    .line 2156
    const/16 v8, 0x10

    .line 2157
    .line 2158
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 2159
    .line 2160
    .line 2161
    goto :goto_12

    .line 2162
    :cond_5f
    const/16 v7, 0xe

    .line 2163
    .line 2164
    const/16 v8, 0x10

    .line 2165
    .line 2166
    const/16 v10, 0x1a

    .line 2167
    .line 2168
    const/16 v12, 0x15

    .line 2169
    .line 2170
    const/16 v14, 0x22

    .line 2171
    .line 2172
    invoke-static/range {v30 .. v36}, Lbsh/ParserTokenManager;->jjCanMove_1(IIIJJ)Z

    .line 2173
    .line 2174
    .line 2175
    move-result v16

    .line 2176
    if-eqz v16, :cond_5b

    .line 2177
    .line 2178
    const/16 v7, 0x1b

    .line 2179
    .line 2180
    const/16 v8, 0x1d

    .line 2181
    .line 2182
    invoke-direct {v0, v7, v8}, Lbsh/ParserTokenManager;->jjAddStates(II)V

    .line 2183
    .line 2184
    .line 2185
    goto :goto_12

    .line 2186
    :cond_60
    const/16 v14, 0x22

    .line 2187
    .line 2188
    goto/16 :goto_11

    .line 2189
    .line 2190
    :goto_15
    invoke-static/range {v30 .. v36}, Lbsh/ParserTokenManager;->jjCanMove_1(IIIJJ)Z

    .line 2191
    .line 2192
    .line 2193
    move-result v7

    .line 2194
    if-eqz v7, :cond_5b

    .line 2195
    .line 2196
    invoke-direct {v0, v2, v13}, Lbsh/ParserTokenManager;->jjCheckNAddStates(II)V

    .line 2197
    .line 2198
    .line 2199
    goto :goto_12

    .line 2200
    :cond_61
    const/16 v10, 0x1a

    .line 2201
    .line 2202
    const/16 v12, 0x15

    .line 2203
    .line 2204
    const/16 v14, 0x22

    .line 2205
    .line 2206
    invoke-static/range {v30 .. v36}, Lbsh/ParserTokenManager;->jjCanMove_0(IIIJJ)Z

    .line 2207
    .line 2208
    .line 2209
    move-result v7

    .line 2210
    if-eqz v7, :cond_63

    .line 2211
    .line 2212
    const/4 v8, 0x6

    .line 2213
    if-le v4, v8, :cond_62

    .line 2214
    .line 2215
    const/4 v8, 0x6

    .line 2216
    goto :goto_16

    .line 2217
    :cond_62
    move v8, v4

    .line 2218
    :goto_16
    invoke-direct {v0, v2}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 2219
    .line 2220
    .line 2221
    move v7, v8

    .line 2222
    goto :goto_17

    .line 2223
    :cond_63
    move v7, v4

    .line 2224
    :goto_17
    invoke-static/range {v30 .. v36}, Lbsh/ParserTokenManager;->jjCanMove_2(IIIJJ)Z

    .line 2225
    .line 2226
    .line 2227
    move-result v4

    .line 2228
    const/16 v8, 0x49

    .line 2229
    .line 2230
    if-eqz v4, :cond_65

    .line 2231
    .line 2232
    if-le v7, v8, :cond_64

    .line 2233
    .line 2234
    move v7, v8

    .line 2235
    :cond_64
    invoke-direct {v0, v1}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 2236
    .line 2237
    .line 2238
    :cond_65
    move v4, v7

    .line 2239
    :goto_18
    const/4 v7, 0x6

    .line 2240
    goto :goto_1a

    .line 2241
    :cond_66
    const/16 v8, 0x49

    .line 2242
    .line 2243
    const/16 v10, 0x1a

    .line 2244
    .line 2245
    const/16 v12, 0x15

    .line 2246
    .line 2247
    const/16 v14, 0x22

    .line 2248
    .line 2249
    invoke-static/range {v30 .. v36}, Lbsh/ParserTokenManager;->jjCanMove_0(IIIJJ)Z

    .line 2250
    .line 2251
    .line 2252
    move-result v7

    .line 2253
    if-nez v7, :cond_67

    .line 2254
    .line 2255
    :goto_19
    goto :goto_18

    .line 2256
    :cond_67
    const/4 v7, 0x6

    .line 2257
    if-le v4, v7, :cond_68

    .line 2258
    .line 2259
    move v4, v7

    .line 2260
    :cond_68
    invoke-direct {v0, v2}, Lbsh/ParserTokenManager;->jjCheckNAdd(I)V

    .line 2261
    .line 2262
    .line 2263
    :goto_1a
    if-ne v5, v6, :cond_4d

    .line 2264
    .line 2265
    :goto_1b
    const v1, 0x7fffffff

    .line 2266
    .line 2267
    .line 2268
    if-eq v4, v1, :cond_69

    .line 2269
    .line 2270
    iput v4, v0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 2271
    .line 2272
    iput v3, v0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 2273
    .line 2274
    const v1, 0x7fffffff

    .line 2275
    .line 2276
    .line 2277
    move v4, v1

    .line 2278
    :cond_69
    add-int/lit8 v3, v3, 0x1

    .line 2279
    .line 2280
    iget v5, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 2281
    .line 2282
    iput v6, v0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 2283
    .line 2284
    rsub-int/lit8 v6, v6, 0x50

    .line 2285
    .line 2286
    if-ne v5, v6, :cond_6a

    .line 2287
    .line 2288
    goto :goto_1c

    .line 2289
    :cond_6a
    :try_start_0
    iget-object v1, v0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 2290
    .line 2291
    invoke-virtual {v1}, Lbsh/JavaCharStream;->readChar()C

    .line 2292
    .line 2293
    .line 2294
    move-result v1

    .line 2295
    iput v1, v0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2296
    .line 2297
    const/4 v1, 0x1

    .line 2298
    goto/16 :goto_0

    .line 2299
    .line 2300
    :catch_0
    :goto_1c
    return v3

    .line 2301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_0
        :pswitch_35
        :pswitch_34
        :pswitch_0
        :pswitch_33
        :pswitch_32
        :pswitch_0
        :pswitch_31
        :pswitch_30
        :pswitch_0
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_0
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_29
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_0
        :pswitch_12
        :pswitch_0
        :pswitch_11
        :pswitch_0
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
    .end packed-switch

    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_18
        0x2 -> :sswitch_17
        0x9 -> :sswitch_16
        0xf -> :sswitch_15
        0x10 -> :sswitch_14
        0x13 -> :sswitch_13
        0x16 -> :sswitch_12
        0x18 -> :sswitch_11
        0x19 -> :sswitch_10
        0x1a -> :sswitch_f
        0x1d -> :sswitch_e
        0x1e -> :sswitch_d
        0x1f -> :sswitch_c
        0x22 -> :sswitch_b
        0x2a -> :sswitch_18
        0x2f -> :sswitch_a
        0x34 -> :sswitch_9
        0x38 -> :sswitch_8
        0x3c -> :sswitch_7
        0x3e -> :sswitch_6
        0x3f -> :sswitch_5
        0x40 -> :sswitch_4
        0x41 -> :sswitch_3
        0x46 -> :sswitch_2
        0x4b -> :sswitch_1
        0x4d -> :sswitch_0
        0x4e -> :sswitch_0
        0x50 -> :sswitch_17
    .end sparse-switch
.end method

.method private jjMoveStringLiteralDfa0_0()I
    .locals 8

    .line 1
    iget v0, p0, Lbsh/ParserTokenManager;->curChar:I

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_b

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    if-eq v0, v1, :cond_a

    .line 11
    .line 12
    const/16 v1, 0xc

    .line 13
    .line 14
    if-eq v0, v1, :cond_9

    .line 15
    .line 16
    const/16 v1, 0xd

    .line 17
    .line 18
    if-eq v0, v1, :cond_8

    .line 19
    .line 20
    const/16 v1, 0x20

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    if-eq v0, v1, :cond_7

    .line 24
    .line 25
    const/16 v1, 0x21

    .line 26
    .line 27
    if-eq v0, v1, :cond_6

    .line 28
    .line 29
    const/16 v1, 0x25

    .line 30
    .line 31
    if-eq v0, v1, :cond_5

    .line 32
    .line 33
    const/16 v1, 0x26

    .line 34
    .line 35
    if-eq v0, v1, :cond_4

    .line 36
    .line 37
    const/16 v1, 0x5d

    .line 38
    .line 39
    if-eq v0, v1, :cond_3

    .line 40
    .line 41
    const/16 v1, 0x5e

    .line 42
    .line 43
    if-eq v0, v1, :cond_2

    .line 44
    .line 45
    const/16 v1, 0x76

    .line 46
    .line 47
    if-eq v0, v1, :cond_1

    .line 48
    .line 49
    const/16 v1, 0x77

    .line 50
    .line 51
    if-eq v0, v1, :cond_0

    .line 52
    .line 53
    sparse-switch v0, :sswitch_data_0

    .line 54
    .line 55
    .line 56
    packed-switch v0, :pswitch_data_0

    .line 57
    .line 58
    .line 59
    packed-switch v0, :pswitch_data_1

    .line 60
    .line 61
    .line 62
    packed-switch v0, :pswitch_data_2

    .line 63
    .line 64
    .line 65
    invoke-direct {p0, v3, v2}, Lbsh/ParserTokenManager;->jjMoveNfa_0(II)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    return v0

    .line 70
    :pswitch_0
    const-wide/16 v4, 0x0

    .line 71
    .line 72
    const-wide/16 v6, 0x0

    .line 73
    .line 74
    const-wide/high16 v2, 0x3e0000000000000L

    .line 75
    .line 76
    move-object v1, p0

    .line 77
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    return v0

    .line 82
    :pswitch_1
    const-wide/16 v4, 0x0

    .line 83
    .line 84
    const-wide/16 v6, 0x0

    .line 85
    .line 86
    const-wide/high16 v2, 0x1f000000000000L

    .line 87
    .line 88
    move-object v1, p0

    .line 89
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    return v0

    .line 94
    :pswitch_2
    const-wide/16 v4, 0x0

    .line 95
    .line 96
    const-wide/16 v6, 0x0

    .line 97
    .line 98
    const-wide v2, 0x800000000000L

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    move-object v1, p0

    .line 104
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    return v0

    .line 109
    :pswitch_3
    const-wide/16 v4, 0x0

    .line 110
    .line 111
    const-wide/16 v6, 0x0

    .line 112
    .line 113
    const-wide v2, 0x100000000L

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    move-object v1, p0

    .line 119
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    return v0

    .line 124
    :pswitch_4
    const-wide/16 v4, 0x0

    .line 125
    .line 126
    const-wide/16 v6, 0x0

    .line 127
    .line 128
    const-wide v2, 0xf8000000L

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    move-object v1, p0

    .line 134
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    return v0

    .line 139
    :pswitch_5
    const-wide/16 v4, 0x0

    .line 140
    .line 141
    const-wide/16 v6, 0x0

    .line 142
    .line 143
    const-wide/32 v2, 0x7000000

    .line 144
    .line 145
    .line 146
    move-object v1, p0

    .line 147
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    return v0

    .line 152
    :pswitch_6
    const-wide/16 v4, 0x0

    .line 153
    .line 154
    const-wide/32 v6, 0x4000000

    .line 155
    .line 156
    .line 157
    const-wide/32 v2, 0xe00000

    .line 158
    .line 159
    .line 160
    move-object v1, p0

    .line 161
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    return v0

    .line 166
    :pswitch_7
    const-wide/16 v4, 0x0

    .line 167
    .line 168
    const-wide/16 v6, 0x0

    .line 169
    .line 170
    const-wide/32 v2, 0x1f4000

    .line 171
    .line 172
    .line 173
    move-object v1, p0

    .line 174
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    return v0

    .line 179
    :pswitch_8
    const-wide/16 v4, 0x0

    .line 180
    .line 181
    const-wide/16 v6, 0x0

    .line 182
    .line 183
    const-wide/32 v2, 0xb000

    .line 184
    .line 185
    .line 186
    move-object v1, p0

    .line 187
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    return v0

    .line 192
    :pswitch_9
    const-wide/16 v4, 0x0

    .line 193
    .line 194
    const-wide/16 v6, 0x0

    .line 195
    .line 196
    const-wide/16 v2, 0x800

    .line 197
    .line 198
    move-object v1, p0

    .line 199
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    return v0

    .line 204
    :pswitch_a
    const-wide v4, 0xaaaa02942800000L

    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    const-wide/32 v6, 0xaaaa

    .line 210
    .line 211
    .line 212
    const-wide/16 v2, 0x0

    .line 213
    .line 214
    move-object v1, p0

    .line 215
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    return v0

    .line 220
    :pswitch_b
    move-object v1, p0

    .line 221
    const/16 v0, 0x95

    .line 222
    .line 223
    iput v0, v1, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 224
    .line 225
    const-wide/16 v4, 0x0

    .line 226
    .line 227
    const-wide/32 v6, 0x21c0000

    .line 228
    .line 229
    .line 230
    const-wide/16 v2, 0x0

    .line 231
    .line 232
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    return v0

    .line 237
    :pswitch_c
    move-object v1, p0

    .line 238
    const/16 v0, 0x56

    .line 239
    .line 240
    iput v0, v1, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 241
    .line 242
    const-wide v4, 0x500000080000000L

    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    const-wide/16 v6, 0x5000

    .line 248
    .line 249
    const-wide/16 v2, 0x0

    .line 250
    .line 251
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    return v0

    .line 256
    :pswitch_d
    move-object v1, p0

    .line 257
    const/16 v0, 0x55

    .line 258
    .line 259
    iput v0, v1, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 260
    .line 261
    const-wide/32 v4, 0x10000000

    .line 262
    .line 263
    .line 264
    const-wide/16 v6, 0x0

    .line 265
    .line 266
    const-wide/16 v2, 0x0

    .line 267
    .line 268
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    return v0

    .line 273
    :pswitch_e
    move-object v1, p0

    .line 274
    const/16 v0, 0x58

    .line 275
    .line 276
    iput v0, v1, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 277
    .line 278
    const-wide v4, 0x40000020000000L

    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    const-wide/32 v6, 0x20400

    .line 284
    .line 285
    .line 286
    const-wide/16 v2, 0x0

    .line 287
    .line 288
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    return v0

    .line 293
    :pswitch_f
    move-object v1, p0

    .line 294
    const/16 v0, 0x52

    .line 295
    .line 296
    invoke-direct {p0, v2, v0}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    return v0

    .line 301
    :pswitch_10
    move-object v1, p0

    .line 302
    const/16 v0, 0x96

    .line 303
    .line 304
    iput v0, v1, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 305
    .line 306
    const-wide/16 v4, 0x0

    .line 307
    .line 308
    const-wide/32 v6, 0x800000

    .line 309
    .line 310
    .line 311
    const-wide/16 v2, 0x0

    .line 312
    .line 313
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    return v0

    .line 318
    :sswitch_0
    move-object v1, p0

    .line 319
    const/16 v0, 0x5b

    .line 320
    .line 321
    invoke-direct {p0, v2, v0}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    return v0

    .line 326
    :sswitch_1
    move-object v1, p0

    .line 327
    const/16 v0, 0x4f

    .line 328
    .line 329
    invoke-direct {p0, v2, v0}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    return v0

    .line 334
    :sswitch_2
    move-object v1, p0

    .line 335
    const/16 v0, 0x6e

    .line 336
    .line 337
    iput v0, v1, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 338
    .line 339
    const-wide v4, 0x400000000L

    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    const-wide/16 v6, 0x4

    .line 345
    .line 346
    const-wide/16 v2, 0x0

    .line 347
    .line 348
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    return v0

    .line 353
    :sswitch_3
    move-object v1, p0

    .line 354
    const/16 v0, 0x4e

    .line 355
    .line 356
    invoke-direct {p0, v2, v0}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    return v0

    .line 361
    :sswitch_4
    move-object v1, p0

    .line 362
    const-wide/16 v4, 0x0

    .line 363
    .line 364
    const-wide/16 v6, 0x0

    .line 365
    .line 366
    const-wide v2, 0x780000000000L

    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    return v0

    .line 376
    :sswitch_5
    const-wide/16 v4, 0x0

    .line 377
    .line 378
    const-wide/16 v6, 0x0

    .line 379
    .line 380
    const-wide v2, 0x70000000000L

    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    move-object v1, p0

    .line 386
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    return v0

    .line 391
    :sswitch_6
    const-wide/16 v4, 0x0

    .line 392
    .line 393
    const-wide/16 v6, 0x0

    .line 394
    .line 395
    const-wide v2, 0x8000000000L

    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    move-object v1, p0

    .line 401
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    return v0

    .line 406
    :sswitch_7
    const-wide/16 v4, 0x0

    .line 407
    .line 408
    const-wide/16 v6, 0x0

    .line 409
    .line 410
    const-wide v2, 0x7e00000000L

    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    move-object v1, p0

    .line 416
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    return v0

    .line 421
    :sswitch_8
    move-object v1, p0

    .line 422
    const/16 v0, 0x50

    .line 423
    .line 424
    invoke-direct {p0, v2, v0}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 425
    .line 426
    .line 427
    move-result v0

    .line 428
    return v0

    .line 429
    :sswitch_9
    move-object v1, p0

    .line 430
    const/16 v0, 0x6b

    .line 431
    .line 432
    iput v0, v1, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 433
    .line 434
    const-wide/high16 v4, -0x8000000000000000L

    .line 435
    .line 436
    const-wide/16 v6, 0x0

    .line 437
    .line 438
    const-wide/16 v2, 0x0

    .line 439
    .line 440
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    return v0

    .line 445
    :sswitch_a
    move-object v1, p0

    .line 446
    const/16 v0, 0x54

    .line 447
    .line 448
    iput v0, v1, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 449
    .line 450
    const-wide/16 v4, 0x0

    .line 451
    .line 452
    const-wide/32 v6, 0x1000000

    .line 453
    .line 454
    .line 455
    const-wide/16 v2, 0x0

    .line 456
    .line 457
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    return v0

    .line 462
    :sswitch_b
    move-object v1, p0

    .line 463
    const/16 v0, 0x69

    .line 464
    .line 465
    iput v0, v1, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 466
    .line 467
    const-wide v4, 0x2000008000000000L

    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    const-wide/32 v6, 0x10000

    .line 473
    .line 474
    .line 475
    const-wide/16 v2, 0x0

    .line 476
    .line 477
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    return v0

    .line 482
    :sswitch_c
    move-object v1, p0

    .line 483
    const/16 v0, 0x53

    .line 484
    .line 485
    invoke-direct {p0, v2, v0}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    return v0

    .line 490
    :sswitch_d
    move-object v1, p0

    .line 491
    const/16 v0, 0x68

    .line 492
    .line 493
    iput v0, v1, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 494
    .line 495
    const-wide v4, 0x1000004000000000L

    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    const-wide/16 v6, 0x0

    .line 501
    .line 502
    const-wide/16 v2, 0x0

    .line 503
    .line 504
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    return v0

    .line 509
    :sswitch_e
    move-object v1, p0

    .line 510
    const/16 v0, 0x6a

    .line 511
    .line 512
    iput v0, v1, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 513
    .line 514
    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    .line 515
    .line 516
    const-wide/16 v6, 0x100

    .line 517
    .line 518
    const-wide/16 v2, 0x0

    .line 519
    .line 520
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    return v0

    .line 525
    :sswitch_f
    move-object v1, p0

    .line 526
    const/16 v0, 0x4d

    .line 527
    .line 528
    invoke-direct {p0, v2, v0}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    return v0

    .line 533
    :sswitch_10
    move-object v1, p0

    .line 534
    const/16 v0, 0x4c

    .line 535
    .line 536
    invoke-direct {p0, v2, v0}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    return v0

    .line 541
    :cond_0
    move-object v1, p0

    .line 542
    const-wide/16 v4, 0x0

    .line 543
    .line 544
    const-wide/16 v6, 0x0

    .line 545
    .line 546
    const-wide/high16 v2, 0x3000000000000000L    # 1.727233711018889E-77

    .line 547
    .line 548
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    return v0

    .line 553
    :cond_1
    const-wide/16 v4, 0x0

    .line 554
    .line 555
    const-wide/16 v6, 0x0

    .line 556
    .line 557
    const-wide/high16 v2, 0xc00000000000000L

    .line 558
    .line 559
    move-object v1, p0

    .line 560
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    return v0

    .line 565
    :cond_2
    move-object v1, p0

    .line 566
    const/16 v0, 0x70

    .line 567
    .line 568
    iput v0, v1, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 569
    .line 570
    const-wide/16 v4, 0x0

    .line 571
    .line 572
    const-wide/16 v6, 0x10

    .line 573
    .line 574
    const-wide/16 v2, 0x0

    .line 575
    .line 576
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    return v0

    .line 581
    :cond_3
    move-object v1, p0

    .line 582
    const/16 v0, 0x51

    .line 583
    .line 584
    invoke-direct {p0, v2, v0}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    return v0

    .line 589
    :cond_4
    move-object v1, p0

    .line 590
    const/16 v0, 0x6c

    .line 591
    .line 592
    iput v0, v1, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 593
    .line 594
    const-wide v4, 0x1000000000L

    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    const-wide/16 v6, 0x1

    .line 600
    .line 601
    const-wide/16 v2, 0x0

    .line 602
    .line 603
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    return v0

    .line 608
    :cond_5
    move-object v1, p0

    .line 609
    const/16 v0, 0x72

    .line 610
    .line 611
    iput v0, v1, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 612
    .line 613
    const-wide/16 v4, 0x0

    .line 614
    .line 615
    const-wide/16 v6, 0x40

    .line 616
    .line 617
    const-wide/16 v2, 0x0

    .line 618
    .line 619
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 620
    .line 621
    .line 622
    move-result v0

    .line 623
    return v0

    .line 624
    :cond_6
    move-object v1, p0

    .line 625
    const/16 v0, 0x5a

    .line 626
    .line 627
    iput v0, v1, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 628
    .line 629
    const-wide v4, 0x200000000L

    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    const-wide/16 v6, 0x0

    .line 635
    .line 636
    const-wide/16 v2, 0x0

    .line 637
    .line 638
    invoke-direct/range {v1 .. v7}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa1_0(JJJ)I

    .line 639
    .line 640
    .line 641
    move-result v0

    .line 642
    return v0

    .line 643
    :cond_7
    move-object v1, p0

    .line 644
    invoke-direct {p0, v2, v3, v2}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 645
    .line 646
    .line 647
    move-result v0

    .line 648
    return v0

    .line 649
    :cond_8
    move-object v1, p0

    .line 650
    const/4 v0, 0x3

    .line 651
    invoke-direct {p0, v2, v0, v2}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    return v0

    .line 656
    :cond_9
    move-object v1, p0

    .line 657
    const/4 v0, 0x4

    .line 658
    invoke-direct {p0, v2, v0, v2}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    return v0

    .line 663
    :cond_a
    move-object v1, p0

    .line 664
    const/4 v0, 0x5

    .line 665
    invoke-direct {p0, v2, v0, v2}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 666
    .line 667
    .line 668
    move-result v0

    .line 669
    return v0

    .line 670
    :cond_b
    move-object v1, p0

    .line 671
    const/4 v0, 0x2

    .line 672
    invoke-direct {p0, v2, v0, v2}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 673
    .line 674
    .line 675
    move-result v0

    .line 676
    return v0

    .line 677
    :sswitch_data_0
    .sparse-switch
        0x28 -> :sswitch_10
        0x29 -> :sswitch_f
        0x2a -> :sswitch_e
        0x2b -> :sswitch_d
        0x2c -> :sswitch_c
        0x2d -> :sswitch_b
        0x2e -> :sswitch_a
        0x2f -> :sswitch_9
        0x5b -> :sswitch_8
        0x69 -> :sswitch_7
        0x6c -> :sswitch_6
        0x6e -> :sswitch_5
        0x70 -> :sswitch_4
        0x7b -> :sswitch_3
        0x7c -> :sswitch_2
        0x7d -> :sswitch_1
        0x7e -> :sswitch_0
    .end sparse-switch

    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    :pswitch_data_0
    .packed-switch 0x3a
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    :pswitch_data_1
    .packed-switch 0x61
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    :pswitch_data_2
    .packed-switch 0x72
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private jjMoveStringLiteralDfa10_0(JJJJJJ)I
    .locals 15

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    and-long v9, p11, p9

    .line 8
    .line 9
    or-long/2addr v3, v9

    .line 10
    const-wide/16 v7, 0x0

    .line 11
    .line 12
    cmp-long v0, v3, v7

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/16 v1, 0x8

    .line 17
    .line 18
    move-object v0, p0

    .line 19
    move-wide/from16 v2, p1

    .line 20
    .line 21
    move-wide/from16 v4, p5

    .line 22
    .line 23
    move-wide/from16 v6, p9

    .line 24
    .line 25
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    return v1

    .line 30
    :cond_0
    const/16 v3, 0xa

    .line 31
    .line 32
    :try_start_0
    iget-object v4, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 33
    .line 34
    invoke-virtual {v4}, Lbsh/JavaCharStream;->readChar()C

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    iput v4, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    const/16 v11, 0x65

    .line 41
    .line 42
    if-eq v4, v11, :cond_d

    .line 43
    .line 44
    const/16 v11, 0x66

    .line 45
    .line 46
    if-eq v4, v11, :cond_c

    .line 47
    .line 48
    const/16 v11, 0x69

    .line 49
    .line 50
    if-eq v4, v11, :cond_b

    .line 51
    .line 52
    const/16 v11, 0x72

    .line 53
    .line 54
    const/16 v12, 0x6f

    .line 55
    .line 56
    if-eq v4, v11, :cond_9

    .line 57
    .line 58
    const/16 v11, 0x74

    .line 59
    .line 60
    if-eq v4, v11, :cond_7

    .line 61
    .line 62
    const/16 v11, 0x6e

    .line 63
    .line 64
    if-eq v4, v11, :cond_2

    .line 65
    .line 66
    if-eq v4, v12, :cond_1

    .line 67
    .line 68
    goto/16 :goto_0

    .line 69
    .line 70
    :cond_1
    const-wide/high16 v7, 0x2000000000000L

    .line 71
    .line 72
    const-wide/16 v11, 0x0

    .line 73
    .line 74
    const-wide/16 v3, 0x0

    .line 75
    .line 76
    move-object v0, p0

    .line 77
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa11_0(JJJJJJ)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    return v1

    .line 82
    :cond_2
    const-wide/16 v11, 0x2

    .line 83
    .line 84
    and-long/2addr v11, v9

    .line 85
    cmp-long v4, v11, v7

    .line 86
    .line 87
    if-eqz v4, :cond_3

    .line 88
    .line 89
    const/16 v1, 0x81

    .line 90
    .line 91
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    return v1

    .line 96
    :cond_3
    const-wide/16 v11, 0x20

    .line 97
    .line 98
    and-long/2addr v11, v9

    .line 99
    cmp-long v4, v11, v7

    .line 100
    .line 101
    if-eqz v4, :cond_4

    .line 102
    .line 103
    const/16 v1, 0x85

    .line 104
    .line 105
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    return v1

    .line 110
    :cond_4
    const-wide/16 v11, 0x80

    .line 111
    .line 112
    and-long/2addr v11, v9

    .line 113
    cmp-long v4, v11, v7

    .line 114
    .line 115
    if-eqz v4, :cond_5

    .line 116
    .line 117
    const/16 v1, 0x87

    .line 118
    .line 119
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    return v1

    .line 124
    :cond_5
    const-wide/16 v11, 0x200

    .line 125
    .line 126
    and-long/2addr v11, v9

    .line 127
    cmp-long v4, v11, v7

    .line 128
    .line 129
    if-eqz v4, :cond_6

    .line 130
    .line 131
    const/16 v1, 0x89

    .line 132
    .line 133
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    return v1

    .line 138
    :cond_6
    const-wide v7, 0x200000000000L

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    const-wide/16 v11, 0x0

    .line 144
    .line 145
    const-wide/16 v3, 0x0

    .line 146
    .line 147
    move-object v0, p0

    .line 148
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa11_0(JJJJJJ)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    return v1

    .line 153
    :cond_7
    const-wide/high16 v11, 0x80000000000000L

    .line 154
    .line 155
    and-long/2addr v11, v5

    .line 156
    cmp-long v4, v11, v7

    .line 157
    .line 158
    if-eqz v4, :cond_8

    .line 159
    .line 160
    const/16 v4, 0x77

    .line 161
    .line 162
    iput v4, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 163
    .line 164
    iput v3, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 165
    .line 166
    :cond_8
    const-wide/16 v7, 0x0

    .line 167
    .line 168
    const-wide/16 v11, 0x800

    .line 169
    .line 170
    const-wide/16 v3, 0x0

    .line 171
    .line 172
    move-object v0, p0

    .line 173
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa11_0(JJJJJJ)I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    return v1

    .line 178
    :cond_9
    const-wide v13, 0x800000000000L

    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    and-long/2addr v13, v5

    .line 184
    cmp-long v4, v13, v7

    .line 185
    .line 186
    if-eqz v4, :cond_a

    .line 187
    .line 188
    invoke-direct {p0, v3, v12}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    return v1

    .line 193
    :cond_a
    :goto_0
    const/16 v3, 0x9

    .line 194
    .line 195
    move-object/from16 p1, p0

    .line 196
    .line 197
    move-wide/from16 p3, v1

    .line 198
    .line 199
    move/from16 p2, v3

    .line 200
    .line 201
    move-wide/from16 p5, v5

    .line 202
    .line 203
    move-wide/from16 p7, v9

    .line 204
    .line 205
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    return v0

    .line 210
    :cond_b
    const-wide/high16 v7, 0x800000000000000L

    .line 211
    .line 212
    const-wide/32 v11, 0x8000

    .line 213
    .line 214
    .line 215
    const-wide/16 v3, 0x0

    .line 216
    .line 217
    move-object v0, p0

    .line 218
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa11_0(JJJJJJ)I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    return v1

    .line 223
    :cond_c
    const-wide/high16 v7, 0x200000000000000L

    .line 224
    .line 225
    const-wide/16 v11, 0x2000

    .line 226
    .line 227
    const-wide/16 v3, 0x0

    .line 228
    .line 229
    move-object v0, p0

    .line 230
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa11_0(JJJJJJ)I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    return v1

    .line 235
    :cond_d
    const-wide/16 v7, 0x0

    .line 236
    .line 237
    const-wide/16 v11, 0x0

    .line 238
    .line 239
    const-wide/high16 v3, 0x10000000000000L

    .line 240
    .line 241
    move-object v0, p0

    .line 242
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa11_0(JJJJJJ)I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    return v1

    .line 247
    :catch_0
    const/16 v0, 0x9

    .line 248
    .line 249
    move-object/from16 p1, p0

    .line 250
    .line 251
    move/from16 p2, v0

    .line 252
    .line 253
    move-wide/from16 p3, v1

    .line 254
    .line 255
    move-wide/from16 p5, v5

    .line 256
    .line 257
    move-wide/from16 p7, v9

    .line 258
    .line 259
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 260
    .line 261
    .line 262
    return v3
.end method

.method private jjMoveStringLiteralDfa11_0(JJJJJJ)I
    .locals 13

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    and-long v9, p11, p9

    .line 8
    .line 9
    or-long/2addr v3, v9

    .line 10
    const-wide/16 v7, 0x0

    .line 11
    .line 12
    cmp-long v0, v3, v7

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/16 v1, 0x9

    .line 17
    .line 18
    move-object v0, p0

    .line 19
    move-wide v2, p1

    .line 20
    move-wide/from16 v4, p5

    .line 21
    .line 22
    move-wide/from16 v6, p9

    .line 23
    .line 24
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    return v1

    .line 29
    :cond_0
    const/16 v3, 0xb

    .line 30
    .line 31
    :try_start_0
    iget-object v4, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 32
    .line 33
    invoke-virtual {v4}, Lbsh/JavaCharStream;->readChar()C

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    iput v4, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    const/16 v11, 0x5f

    .line 40
    .line 41
    if-eq v4, v11, :cond_8

    .line 42
    .line 43
    const/16 v11, 0x64

    .line 44
    .line 45
    if-eq v4, v11, :cond_5

    .line 46
    .line 47
    const/16 v11, 0x67

    .line 48
    .line 49
    if-eq v4, v11, :cond_4

    .line 50
    .line 51
    const/16 v11, 0x72

    .line 52
    .line 53
    if-eq v4, v11, :cond_3

    .line 54
    .line 55
    const/16 v11, 0x74

    .line 56
    .line 57
    if-eq v4, v11, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const-wide/high16 v11, 0x200000000000000L

    .line 61
    .line 62
    and-long/2addr v11, v5

    .line 63
    cmp-long v4, v11, v7

    .line 64
    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    const/16 v4, 0x79

    .line 68
    .line 69
    iput v4, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 70
    .line 71
    iput v3, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 72
    .line 73
    :cond_2
    const-wide/16 v7, 0x0

    .line 74
    .line 75
    const-wide/16 v11, 0x2000

    .line 76
    .line 77
    const-wide/16 v3, 0x0

    .line 78
    .line 79
    move-object v0, p0

    .line 80
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa12_0(JJJJJJ)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    return v1

    .line 85
    :cond_3
    const-wide/high16 v11, 0x2000000000000L

    .line 86
    .line 87
    and-long/2addr v11, v5

    .line 88
    cmp-long v4, v11, v7

    .line 89
    .line 90
    if-eqz v4, :cond_7

    .line 91
    .line 92
    const/16 v1, 0x71

    .line 93
    .line 94
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    return v1

    .line 99
    :cond_4
    const-wide/high16 v7, 0x800000000000000L

    .line 100
    .line 101
    const-wide/32 v11, 0x8000

    .line 102
    .line 103
    .line 104
    const-wide/16 v3, 0x0

    .line 105
    .line 106
    move-object v0, p0

    .line 107
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa12_0(JJJJJJ)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    return v1

    .line 112
    :cond_5
    const-wide/high16 v11, 0x10000000000000L

    .line 113
    .line 114
    and-long/2addr v11, v1

    .line 115
    cmp-long v4, v11, v7

    .line 116
    .line 117
    if-eqz v4, :cond_6

    .line 118
    .line 119
    const/16 v1, 0x34

    .line 120
    .line 121
    const/16 v2, 0x2a

    .line 122
    .line 123
    invoke-direct {p0, v3, v1, v2}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    return v1

    .line 128
    :cond_6
    const-wide v11, 0x200000000000L

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    and-long/2addr v11, v5

    .line 134
    cmp-long v4, v11, v7

    .line 135
    .line 136
    if-eqz v4, :cond_7

    .line 137
    .line 138
    const/16 v1, 0x6d

    .line 139
    .line 140
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    return v1

    .line 145
    :cond_7
    :goto_0
    const/16 v3, 0xa

    .line 146
    .line 147
    move-object p1, p0

    .line 148
    move-wide/from16 p3, v1

    .line 149
    .line 150
    move p2, v3

    .line 151
    move-wide/from16 p5, v5

    .line 152
    .line 153
    move-wide/from16 p7, v9

    .line 154
    .line 155
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    return v0

    .line 160
    :cond_8
    const-wide/16 v7, 0x0

    .line 161
    .line 162
    const-wide/16 v11, 0x800

    .line 163
    .line 164
    const-wide/16 v3, 0x0

    .line 165
    .line 166
    move-object v0, p0

    .line 167
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa12_0(JJJJJJ)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    return v1

    .line 172
    :catch_0
    const/16 v0, 0xa

    .line 173
    .line 174
    move-object p1, p0

    .line 175
    move p2, v0

    .line 176
    move-wide/from16 p3, v1

    .line 177
    .line 178
    move-wide/from16 p5, v5

    .line 179
    .line 180
    move-wide/from16 p7, v9

    .line 181
    .line 182
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 183
    .line 184
    .line 185
    return v3
.end method

.method private jjMoveStringLiteralDfa12_0(JJJJJJ)I
    .locals 8

    .line 1
    and-long v0, p3, p1

    .line 2
    .line 3
    and-long v2, p7, p5

    .line 4
    .line 5
    or-long/2addr v0, v2

    .line 6
    and-long v4, p11, p9

    .line 7
    .line 8
    or-long/2addr v0, v4

    .line 9
    const-wide/16 v6, 0x0

    .line 10
    .line 11
    cmp-long v0, v0, v6

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/16 v1, 0xa

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-wide v2, p1

    .line 19
    move-wide v4, p5

    .line 20
    move-wide/from16 v6, p9

    .line 21
    .line 22
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    return v1

    .line 27
    :cond_0
    :try_start_0
    iget-object v1, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 28
    .line 29
    invoke-virtual {v1}, Lbsh/JavaCharStream;->readChar()C

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iput v1, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    const/16 v6, 0x5f

    .line 36
    .line 37
    if-eq v1, v6, :cond_3

    .line 38
    .line 39
    const/16 v6, 0x61

    .line 40
    .line 41
    if-eq v1, v6, :cond_2

    .line 42
    .line 43
    const/16 v6, 0x6e

    .line 44
    .line 45
    if-eq v1, v6, :cond_1

    .line 46
    .line 47
    const/16 v1, 0xb

    .line 48
    .line 49
    const-wide/16 v6, 0x0

    .line 50
    .line 51
    move-object p1, p0

    .line 52
    move p2, v1

    .line 53
    move-wide p5, v2

    .line 54
    move-wide p7, v4

    .line 55
    move-wide p3, v6

    .line 56
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    return v0

    .line 61
    :cond_1
    move-wide v0, v2

    .line 62
    move-wide v2, v4

    .line 63
    const-wide/high16 v4, 0x800000000000000L

    .line 64
    .line 65
    const-wide/32 v6, 0x8000

    .line 66
    .line 67
    .line 68
    move-object p1, p0

    .line 69
    move-wide p2, v0

    .line 70
    move-wide p6, v2

    .line 71
    move-wide p4, v4

    .line 72
    move-wide/from16 p8, v6

    .line 73
    .line 74
    invoke-direct/range {p1 .. p9}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa13_0(JJJJ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    return v0

    .line 79
    :cond_2
    move-wide v0, v2

    .line 80
    move-wide v2, v4

    .line 81
    const-wide/16 v4, 0x0

    .line 82
    .line 83
    const-wide/16 v6, 0x800

    .line 84
    .line 85
    move-object p1, p0

    .line 86
    move-wide p2, v0

    .line 87
    move-wide p6, v2

    .line 88
    move-wide p4, v4

    .line 89
    move-wide/from16 p8, v6

    .line 90
    .line 91
    invoke-direct/range {p1 .. p9}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa13_0(JJJJ)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    return v0

    .line 96
    :cond_3
    move-wide v0, v2

    .line 97
    move-wide v2, v4

    .line 98
    const-wide/16 v4, 0x0

    .line 99
    .line 100
    const-wide/16 v6, 0x2000

    .line 101
    .line 102
    move-object p1, p0

    .line 103
    move-wide p2, v0

    .line 104
    move-wide p6, v2

    .line 105
    move-wide p4, v4

    .line 106
    move-wide/from16 p8, v6

    .line 107
    .line 108
    invoke-direct/range {p1 .. p9}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa13_0(JJJJ)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    return v0

    .line 113
    :catch_0
    move-wide v0, v2

    .line 114
    move-wide v2, v4

    .line 115
    const/16 v4, 0xb

    .line 116
    .line 117
    const-wide/16 v5, 0x0

    .line 118
    .line 119
    move-object p1, p0

    .line 120
    move-wide p5, v0

    .line 121
    move-wide p7, v2

    .line 122
    move p2, v4

    .line 123
    move-wide p3, v5

    .line 124
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 125
    .line 126
    .line 127
    const/16 v0, 0xc

    .line 128
    .line 129
    return v0
.end method

.method private jjMoveStringLiteralDfa13_0(JJJJ)I
    .locals 9

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    const-wide/16 v7, 0x0

    .line 8
    .line 9
    cmp-long v0, v3, v7

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/16 v1, 0xb

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-wide v4, p1

    .line 19
    move-wide v6, p5

    .line 20
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    return v1

    .line 25
    :cond_0
    :try_start_0
    iget-object v3, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 26
    .line 27
    invoke-virtual {v3}, Lbsh/JavaCharStream;->readChar()C

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iput v3, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    const/16 v4, 0x61

    .line 34
    .line 35
    if-eq v3, v4, :cond_3

    .line 36
    .line 37
    const/16 v4, 0x65

    .line 38
    .line 39
    if-eq v3, v4, :cond_2

    .line 40
    .line 41
    const/16 v4, 0x73

    .line 42
    .line 43
    if-eq v3, v4, :cond_1

    .line 44
    .line 45
    const/16 v3, 0xc

    .line 46
    .line 47
    const-wide/16 v7, 0x0

    .line 48
    .line 49
    move-object p1, p0

    .line 50
    move-wide p5, v1

    .line 51
    move p2, v3

    .line 52
    move-wide/from16 p7, v5

    .line 53
    .line 54
    move-wide p3, v7

    .line 55
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    return v0

    .line 60
    :cond_1
    const-wide/16 v3, 0x0

    .line 61
    .line 62
    const-wide/16 v7, 0x800

    .line 63
    .line 64
    move-object v0, p0

    .line 65
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa14_0(JJJJ)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    return v1

    .line 70
    :cond_2
    const-wide/high16 v3, 0x800000000000000L

    .line 71
    .line 72
    const-wide/32 v7, 0x8000

    .line 73
    .line 74
    .line 75
    move-object v0, p0

    .line 76
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa14_0(JJJJ)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    return v1

    .line 81
    :cond_3
    const-wide/16 v3, 0x0

    .line 82
    .line 83
    const-wide/16 v7, 0x2000

    .line 84
    .line 85
    move-object v0, p0

    .line 86
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa14_0(JJJJ)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    return v1

    .line 91
    :catch_0
    const/16 v0, 0xc

    .line 92
    .line 93
    const-wide/16 v3, 0x0

    .line 94
    .line 95
    move-object p1, p0

    .line 96
    move p2, v0

    .line 97
    move-wide p5, v1

    .line 98
    move-wide p3, v3

    .line 99
    move-wide/from16 p7, v5

    .line 100
    .line 101
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 102
    .line 103
    .line 104
    const/16 v0, 0xd

    .line 105
    .line 106
    return v0
.end method

.method private jjMoveStringLiteralDfa14_0(JJJJ)I
    .locals 9

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    const-wide/16 v7, 0x0

    .line 8
    .line 9
    cmp-long v0, v3, v7

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/16 v1, 0xc

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-wide v4, p1

    .line 19
    move-wide v6, p5

    .line 20
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    return v1

    .line 25
    :cond_0
    :try_start_0
    iget-object v3, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 26
    .line 27
    invoke-virtual {v3}, Lbsh/JavaCharStream;->readChar()C

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iput v3, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    const/16 v4, 0x64

    .line 34
    .line 35
    if-eq v3, v4, :cond_2

    .line 36
    .line 37
    const/16 v4, 0x73

    .line 38
    .line 39
    if-eq v3, v4, :cond_1

    .line 40
    .line 41
    const/16 v3, 0xd

    .line 42
    .line 43
    const-wide/16 v7, 0x0

    .line 44
    .line 45
    move-object p1, p0

    .line 46
    move-wide p5, v1

    .line 47
    move p2, v3

    .line 48
    move-wide/from16 p7, v5

    .line 49
    .line 50
    move-wide p3, v7

    .line 51
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    return v0

    .line 56
    :cond_1
    const-wide/16 v3, 0x0

    .line 57
    .line 58
    const-wide/16 v7, 0x2800

    .line 59
    .line 60
    move-object v0, p0

    .line 61
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa15_0(JJJJ)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    return v1

    .line 66
    :cond_2
    const-wide/high16 v3, 0x800000000000000L

    .line 67
    .line 68
    const-wide/32 v7, 0x8000

    .line 69
    .line 70
    .line 71
    move-object v0, p0

    .line 72
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa15_0(JJJJ)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    return v1

    .line 77
    :catch_0
    const/16 v0, 0xd

    .line 78
    .line 79
    const-wide/16 v3, 0x0

    .line 80
    .line 81
    move-object p1, p0

    .line 82
    move p2, v0

    .line 83
    move-wide p5, v1

    .line 84
    move-wide p3, v3

    .line 85
    move-wide/from16 p7, v5

    .line 86
    .line 87
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 88
    .line 89
    .line 90
    const/16 v0, 0xe

    .line 91
    .line 92
    return v0
.end method

.method private jjMoveStringLiteralDfa15_0(JJJJ)I
    .locals 9

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    const-wide/16 v7, 0x0

    .line 8
    .line 9
    cmp-long v0, v3, v7

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/16 v1, 0xd

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-wide v4, p1

    .line 19
    move-wide v6, p5

    .line 20
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    return v1

    .line 25
    :cond_0
    :try_start_0
    iget-object v3, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 26
    .line 27
    invoke-virtual {v3}, Lbsh/JavaCharStream;->readChar()C

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iput v3, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    const/16 v4, 0x5f

    .line 34
    .line 35
    if-eq v3, v4, :cond_3

    .line 36
    .line 37
    const/16 v4, 0x69

    .line 38
    .line 39
    if-eq v3, v4, :cond_2

    .line 40
    .line 41
    const/16 v4, 0x73

    .line 42
    .line 43
    if-eq v3, v4, :cond_1

    .line 44
    .line 45
    const/16 v3, 0xe

    .line 46
    .line 47
    const-wide/16 v7, 0x0

    .line 48
    .line 49
    move-object p1, p0

    .line 50
    move-wide p5, v1

    .line 51
    move p2, v3

    .line 52
    move-wide/from16 p7, v5

    .line 53
    .line 54
    move-wide p3, v7

    .line 55
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    return v0

    .line 60
    :cond_1
    const-wide/16 v3, 0x0

    .line 61
    .line 62
    const-wide/16 v7, 0x2000

    .line 63
    .line 64
    move-object v0, p0

    .line 65
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa16_0(JJJJ)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    return v1

    .line 70
    :cond_2
    const-wide/16 v3, 0x0

    .line 71
    .line 72
    const-wide/16 v7, 0x800

    .line 73
    .line 74
    move-object v0, p0

    .line 75
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa16_0(JJJJ)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    return v1

    .line 80
    :cond_3
    const-wide/high16 v3, 0x800000000000000L

    .line 81
    .line 82
    const-wide/32 v7, 0x8000

    .line 83
    .line 84
    .line 85
    move-object v0, p0

    .line 86
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa16_0(JJJJ)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    return v1

    .line 91
    :catch_0
    const/16 v0, 0xe

    .line 92
    .line 93
    const-wide/16 v3, 0x0

    .line 94
    .line 95
    move-object p1, p0

    .line 96
    move p2, v0

    .line 97
    move-wide p5, v1

    .line 98
    move-wide p3, v3

    .line 99
    move-wide/from16 p7, v5

    .line 100
    .line 101
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 102
    .line 103
    .line 104
    const/16 v0, 0xf

    .line 105
    .line 106
    return v0
.end method

.method private jjMoveStringLiteralDfa16_0(JJJJ)I
    .locals 9

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    const-wide/16 v7, 0x0

    .line 8
    .line 9
    cmp-long v0, v3, v7

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/16 v1, 0xe

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-wide v4, p1

    .line 19
    move-wide v6, p5

    .line 20
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    return v1

    .line 25
    :cond_0
    :try_start_0
    iget-object v3, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 26
    .line 27
    invoke-virtual {v3}, Lbsh/JavaCharStream;->readChar()C

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iput v3, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    const/16 v4, 0x67

    .line 34
    .line 35
    if-eq v3, v4, :cond_3

    .line 36
    .line 37
    const/16 v4, 0x69

    .line 38
    .line 39
    if-eq v3, v4, :cond_2

    .line 40
    .line 41
    const/16 v4, 0x73

    .line 42
    .line 43
    if-eq v3, v4, :cond_1

    .line 44
    .line 45
    const/16 v3, 0xf

    .line 46
    .line 47
    const-wide/16 v7, 0x0

    .line 48
    .line 49
    move-object p1, p0

    .line 50
    move-wide p5, v1

    .line 51
    move p2, v3

    .line 52
    move-wide/from16 p7, v5

    .line 53
    .line 54
    move-wide p3, v7

    .line 55
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    return v0

    .line 60
    :cond_1
    const-wide/high16 v3, 0x800000000000000L

    .line 61
    .line 62
    const-wide/32 v7, 0x8000

    .line 63
    .line 64
    .line 65
    move-object v0, p0

    .line 66
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa17_0(JJJJ)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    return v1

    .line 71
    :cond_2
    const-wide/16 v3, 0x0

    .line 72
    .line 73
    const-wide/16 v7, 0x2000

    .line 74
    .line 75
    move-object v0, p0

    .line 76
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa17_0(JJJJ)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    return v1

    .line 81
    :cond_3
    const-wide/16 v3, 0x0

    .line 82
    .line 83
    const-wide/16 v7, 0x800

    .line 84
    .line 85
    move-object v0, p0

    .line 86
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa17_0(JJJJ)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    return v1

    .line 91
    :catch_0
    const/16 v0, 0xf

    .line 92
    .line 93
    const-wide/16 v3, 0x0

    .line 94
    .line 95
    move-object p1, p0

    .line 96
    move p2, v0

    .line 97
    move-wide p5, v1

    .line 98
    move-wide p3, v3

    .line 99
    move-wide/from16 p7, v5

    .line 100
    .line 101
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 102
    .line 103
    .line 104
    const/16 v0, 0x10

    .line 105
    .line 106
    return v0
.end method

.method private jjMoveStringLiteralDfa17_0(JJJJ)I
    .locals 11

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    const-wide/16 v7, 0x0

    .line 8
    .line 9
    cmp-long v0, v3, v7

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/16 v1, 0xf

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-wide v4, p1

    .line 19
    move-wide/from16 v6, p5

    .line 20
    .line 21
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    return v1

    .line 26
    :cond_0
    const/16 v3, 0x11

    .line 27
    .line 28
    :try_start_0
    iget-object v4, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 29
    .line 30
    invoke-virtual {v4}, Lbsh/JavaCharStream;->readChar()C

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    iput v4, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    const/16 v9, 0x67

    .line 37
    .line 38
    if-eq v4, v9, :cond_4

    .line 39
    .line 40
    const/16 v9, 0x68

    .line 41
    .line 42
    if-eq v4, v9, :cond_3

    .line 43
    .line 44
    const/16 v9, 0x6e

    .line 45
    .line 46
    if-eq v4, v9, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const-wide/16 v9, 0x800

    .line 50
    .line 51
    and-long/2addr v9, v5

    .line 52
    cmp-long v4, v9, v7

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    const/16 v1, 0x8b

    .line 57
    .line 58
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    return v1

    .line 63
    :cond_2
    :goto_0
    const/16 v3, 0x10

    .line 64
    .line 65
    const-wide/16 v7, 0x0

    .line 66
    .line 67
    move-object p1, p0

    .line 68
    move-wide/from16 p5, v1

    .line 69
    .line 70
    move p2, v3

    .line 71
    move-wide/from16 p7, v5

    .line 72
    .line 73
    move-wide p3, v7

    .line 74
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    return v0

    .line 79
    :cond_3
    const-wide/high16 v3, 0x800000000000000L

    .line 80
    .line 81
    const-wide/32 v7, 0x8000

    .line 82
    .line 83
    .line 84
    move-object v0, p0

    .line 85
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa18_0(JJJJ)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    return v1

    .line 90
    :cond_4
    const-wide/16 v3, 0x0

    .line 91
    .line 92
    const-wide/16 v7, 0x2000

    .line 93
    .line 94
    move-object v0, p0

    .line 95
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa18_0(JJJJ)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    return v1

    .line 100
    :catch_0
    const/16 v0, 0x10

    .line 101
    .line 102
    const-wide/16 v7, 0x0

    .line 103
    .line 104
    move-object p1, p0

    .line 105
    move p2, v0

    .line 106
    move-wide/from16 p5, v1

    .line 107
    .line 108
    move-wide/from16 p7, v5

    .line 109
    .line 110
    move-wide p3, v7

    .line 111
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 112
    .line 113
    .line 114
    return v3
.end method

.method private jjMoveStringLiteralDfa18_0(JJJJ)I
    .locals 11

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    const-wide/16 v7, 0x0

    .line 8
    .line 9
    cmp-long v0, v3, v7

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/16 v1, 0x10

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-wide v4, p1

    .line 19
    move-wide/from16 v6, p5

    .line 20
    .line 21
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    return v1

    .line 26
    :cond_0
    const/16 v3, 0x12

    .line 27
    .line 28
    :try_start_0
    iget-object v4, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 29
    .line 30
    invoke-virtual {v4}, Lbsh/JavaCharStream;->readChar()C

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    iput v4, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    const/16 v9, 0x69

    .line 37
    .line 38
    if-eq v4, v9, :cond_3

    .line 39
    .line 40
    const/16 v9, 0x6e

    .line 41
    .line 42
    if-eq v4, v9, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const-wide/16 v9, 0x2000

    .line 46
    .line 47
    and-long/2addr v9, v5

    .line 48
    cmp-long v4, v9, v7

    .line 49
    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    const/16 v1, 0x8d

    .line 53
    .line 54
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    return v1

    .line 59
    :cond_2
    :goto_0
    const/16 v3, 0x11

    .line 60
    .line 61
    const-wide/16 v7, 0x0

    .line 62
    .line 63
    move-object p1, p0

    .line 64
    move-wide/from16 p5, v1

    .line 65
    .line 66
    move p2, v3

    .line 67
    move-wide/from16 p7, v5

    .line 68
    .line 69
    move-wide p3, v7

    .line 70
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    return v0

    .line 75
    :cond_3
    const-wide/high16 v3, 0x800000000000000L

    .line 76
    .line 77
    const-wide/32 v7, 0x8000

    .line 78
    .line 79
    .line 80
    move-object v0, p0

    .line 81
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa19_0(JJJJ)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    return v1

    .line 86
    :catch_0
    const/16 v0, 0x11

    .line 87
    .line 88
    const-wide/16 v7, 0x0

    .line 89
    .line 90
    move-object p1, p0

    .line 91
    move p2, v0

    .line 92
    move-wide/from16 p5, v1

    .line 93
    .line 94
    move-wide/from16 p7, v5

    .line 95
    .line 96
    move-wide p3, v7

    .line 97
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 98
    .line 99
    .line 100
    return v3
.end method

.method private jjMoveStringLiteralDfa19_0(JJJJ)I
    .locals 9

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    const-wide/16 v7, 0x0

    .line 8
    .line 9
    cmp-long v0, v3, v7

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/16 v1, 0x11

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-wide v4, p1

    .line 19
    move-wide v6, p5

    .line 20
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    return v1

    .line 25
    :cond_0
    :try_start_0
    iget-object v3, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 26
    .line 27
    invoke-virtual {v3}, Lbsh/JavaCharStream;->readChar()C

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iput v3, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    const/16 v4, 0x66

    .line 34
    .line 35
    if-eq v3, v4, :cond_1

    .line 36
    .line 37
    const/16 v3, 0x12

    .line 38
    .line 39
    const-wide/16 v7, 0x0

    .line 40
    .line 41
    move-object p1, p0

    .line 42
    move-wide p5, v1

    .line 43
    move p2, v3

    .line 44
    move-wide/from16 p7, v5

    .line 45
    .line 46
    move-wide p3, v7

    .line 47
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    return v0

    .line 52
    :cond_1
    const-wide/high16 v3, 0x800000000000000L

    .line 53
    .line 54
    const-wide/32 v7, 0x8000

    .line 55
    .line 56
    .line 57
    move-object v0, p0

    .line 58
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa20_0(JJJJ)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    return v1

    .line 63
    :catch_0
    const/16 v0, 0x12

    .line 64
    .line 65
    const-wide/16 v3, 0x0

    .line 66
    .line 67
    move-object p1, p0

    .line 68
    move p2, v0

    .line 69
    move-wide p5, v1

    .line 70
    move-wide p3, v3

    .line 71
    move-wide/from16 p7, v5

    .line 72
    .line 73
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 74
    .line 75
    .line 76
    const/16 v0, 0x13

    .line 77
    .line 78
    return v0
.end method

.method private jjMoveStringLiteralDfa1_0(JJJ)I
    .locals 13

    .line 1
    const/4 v8, 0x1

    .line 2
    :try_start_0
    iget-object v1, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 3
    .line 4
    invoke-virtual {v1}, Lbsh/JavaCharStream;->readChar()C

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    iput v1, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    const/16 v2, 0x26

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    if-eq v1, v2, :cond_1f

    .line 15
    .line 16
    const/16 v2, 0x3a

    .line 17
    .line 18
    if-eq v1, v2, :cond_1d

    .line 19
    .line 20
    const/16 v2, 0x72

    .line 21
    .line 22
    if-eq v1, v2, :cond_1c

    .line 23
    .line 24
    const/16 v2, 0x62

    .line 25
    .line 26
    const/16 v5, 0x7c

    .line 27
    .line 28
    if-eq v1, v5, :cond_1b

    .line 29
    .line 30
    const/16 v6, 0x74

    .line 31
    .line 32
    const/16 v7, 0x2a

    .line 33
    .line 34
    if-eq v1, v7, :cond_19

    .line 35
    .line 36
    const/16 v9, 0x2b

    .line 37
    .line 38
    if-eq v1, v9, :cond_18

    .line 39
    .line 40
    const/16 v9, 0x2d

    .line 41
    .line 42
    if-eq v1, v9, :cond_17

    .line 43
    .line 44
    const/16 v9, 0x2e

    .line 45
    .line 46
    if-eq v1, v9, :cond_15

    .line 47
    .line 48
    const/16 v9, 0x61

    .line 49
    .line 50
    if-eq v1, v9, :cond_14

    .line 51
    .line 52
    if-eq v1, v2, :cond_13

    .line 53
    .line 54
    if-eq v1, v6, :cond_12

    .line 55
    .line 56
    const/16 v2, 0x75

    .line 57
    .line 58
    if-eq v1, v2, :cond_11

    .line 59
    .line 60
    const-wide v10, 0x200000000L

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    packed-switch v1, :pswitch_data_0

    .line 66
    .line 67
    .line 68
    packed-switch v1, :pswitch_data_1

    .line 69
    .line 70
    .line 71
    packed-switch v1, :pswitch_data_2

    .line 72
    .line 73
    .line 74
    packed-switch v1, :pswitch_data_3

    .line 75
    .line 76
    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :pswitch_0
    const-wide/16 v7, 0x0

    .line 80
    .line 81
    const-wide/16 v11, 0x0

    .line 82
    .line 83
    const-wide v3, 0x10000000008000L

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    move-object v0, p0

    .line 89
    move-wide v1, p1

    .line 90
    move-wide/from16 v5, p3

    .line 91
    .line 92
    move-wide/from16 v9, p5

    .line 93
    .line 94
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    return v1

    .line 99
    :pswitch_1
    const-wide/16 v7, 0x0

    .line 100
    .line 101
    const-wide/16 v11, 0x20

    .line 102
    .line 103
    const-wide/32 v3, 0x4000000

    .line 104
    .line 105
    .line 106
    move-object v0, p0

    .line 107
    move-wide v1, p1

    .line 108
    move-wide/from16 v5, p3

    .line 109
    .line 110
    move-wide/from16 v9, p5

    .line 111
    .line 112
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    return v1

    .line 117
    :pswitch_2
    const-wide/16 v7, 0x0

    .line 118
    .line 119
    const-wide/16 v11, 0x0

    .line 120
    .line 121
    const-wide/high16 v3, 0x8000000000000L

    .line 122
    .line 123
    move-object v0, p0

    .line 124
    move-wide v1, p1

    .line 125
    move-wide/from16 v5, p3

    .line 126
    .line 127
    move-wide/from16 v9, p5

    .line 128
    .line 129
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    return v1

    .line 134
    :pswitch_3
    const-wide/high16 v7, 0x20000000000000L

    .line 135
    .line 136
    const-wide/16 v11, 0x200

    .line 137
    .line 138
    const-wide/16 v3, 0x0

    .line 139
    .line 140
    move-object v0, p0

    .line 141
    move-wide v1, p1

    .line 142
    move-wide/from16 v5, p3

    .line 143
    .line 144
    move-wide/from16 v9, p5

    .line 145
    .line 146
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    return v1

    .line 151
    :pswitch_4
    const-wide/32 v1, 0x400000

    .line 152
    .line 153
    .line 154
    and-long/2addr v1, p1

    .line 155
    cmp-long v1, v1, v3

    .line 156
    .line 157
    if-eqz v1, :cond_0

    .line 158
    .line 159
    const/16 v1, 0x16

    .line 160
    .line 161
    iput v1, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 162
    .line 163
    iput v8, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 164
    .line 165
    :cond_0
    const-wide v7, 0x800000000L

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    const-wide/16 v11, 0x8

    .line 171
    .line 172
    const-wide v3, 0xc00008180981000L

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    move-object v0, p0

    .line 178
    move-wide v1, p1

    .line 179
    move-wide/from16 v5, p3

    .line 180
    .line 181
    move-wide/from16 v9, p5

    .line 182
    .line 183
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    return v1

    .line 188
    :pswitch_5
    const-wide/16 v7, 0x0

    .line 189
    .line 190
    const-wide/16 v11, 0x0

    .line 191
    .line 192
    const-wide v3, 0x7002000000L

    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    move-object v0, p0

    .line 198
    move-wide v1, p1

    .line 199
    move-wide/from16 v5, p3

    .line 200
    .line 201
    move-wide/from16 v9, p5

    .line 202
    .line 203
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    return v1

    .line 208
    :pswitch_6
    const-wide/high16 v7, 0x8000000000000L

    .line 209
    .line 210
    const-wide/16 v11, 0x80

    .line 211
    .line 212
    const-wide v3, 0xc00000000L

    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    move-object v0, p0

    .line 218
    move-wide v1, p1

    .line 219
    move-wide/from16 v5, p3

    .line 220
    .line 221
    move-wide/from16 v9, p5

    .line 222
    .line 223
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    return v1

    .line 228
    :pswitch_7
    const-wide v7, 0x80000042000000L

    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    const-wide/16 v11, 0x800

    .line 234
    .line 235
    const-wide/32 v3, 0x41004000

    .line 236
    .line 237
    .line 238
    move-object v0, p0

    .line 239
    move-wide v1, p1

    .line 240
    move-wide/from16 v5, p3

    .line 241
    .line 242
    move-wide/from16 v9, p5

    .line 243
    .line 244
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    return v1

    .line 249
    :pswitch_8
    const-wide/16 v7, 0x0

    .line 250
    .line 251
    const-wide/16 v11, 0x0

    .line 252
    .line 253
    const-wide/32 v3, 0x30000000

    .line 254
    .line 255
    .line 256
    move-object v0, p0

    .line 257
    move-wide v1, p1

    .line 258
    move-wide/from16 v5, p3

    .line 259
    .line 260
    move-wide/from16 v9, p5

    .line 261
    .line 262
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    return v1

    .line 267
    :pswitch_9
    const-wide/16 v7, 0x0

    .line 268
    .line 269
    const-wide/16 v11, 0x0

    .line 270
    .line 271
    const-wide v3, 0x30c1000000040000L    # 7.516921110766009E-74

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    move-object v0, p0

    .line 277
    move-wide v1, p1

    .line 278
    move-wide/from16 v5, p3

    .line 279
    .line 280
    move-wide/from16 v9, p5

    .line 281
    .line 282
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    return v1

    .line 287
    :pswitch_a
    const-wide v7, 0x100800000L

    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    const-wide/16 v11, 0x0

    .line 293
    .line 294
    const-wide/16 v3, 0x0

    .line 295
    .line 296
    move-object v0, p0

    .line 297
    move-wide v1, p1

    .line 298
    move-wide/from16 v5, p3

    .line 299
    .line 300
    move-wide/from16 v9, p5

    .line 301
    .line 302
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    return v1

    .line 307
    :pswitch_b
    and-long v1, p1, v10

    .line 308
    .line 309
    cmp-long v1, v1, v3

    .line 310
    .line 311
    if-eqz v1, :cond_20

    .line 312
    .line 313
    const/16 v1, 0x21

    .line 314
    .line 315
    invoke-direct {p0, v8, v1, v7}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    return v1

    .line 320
    :pswitch_c
    const-wide/16 v7, 0x0

    .line 321
    .line 322
    const-wide/32 v11, 0x4000000

    .line 323
    .line 324
    .line 325
    const-wide v3, 0x820000200000L

    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    move-object v0, p0

    .line 331
    move-wide v1, p1

    .line 332
    move-wide/from16 v5, p3

    .line 333
    .line 334
    move-wide/from16 v9, p5

    .line 335
    .line 336
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    return v1

    .line 341
    :pswitch_d
    const-wide/32 v1, 0x80000

    .line 342
    .line 343
    .line 344
    and-long v1, p5, v1

    .line 345
    .line 346
    cmp-long v1, v1, v3

    .line 347
    .line 348
    if-eqz v1, :cond_1

    .line 349
    .line 350
    const/16 v1, 0x93

    .line 351
    .line 352
    iput v1, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 353
    .line 354
    iput v8, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 355
    .line 356
    :cond_1
    const-wide/16 v7, 0x0

    .line 357
    .line 358
    const-wide/32 v11, 0x40000

    .line 359
    .line 360
    .line 361
    const-wide/16 v3, 0x0

    .line 362
    .line 363
    move-object v0, p0

    .line 364
    move-wide v1, p1

    .line 365
    move-wide/from16 v5, p3

    .line 366
    .line 367
    move-wide/from16 v9, p5

    .line 368
    .line 369
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    return v1

    .line 374
    :pswitch_e
    const-wide/high16 v1, 0x100000000000000L

    .line 375
    .line 376
    and-long v1, p3, v1

    .line 377
    .line 378
    cmp-long v1, v1, v3

    .line 379
    .line 380
    if-eqz v1, :cond_2

    .line 381
    .line 382
    const/16 v1, 0x78

    .line 383
    .line 384
    iput v1, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 385
    .line 386
    iput v8, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 387
    .line 388
    goto :goto_0

    .line 389
    :cond_2
    const-wide/32 v1, 0x10000

    .line 390
    .line 391
    .line 392
    and-long v1, p5, v1

    .line 393
    .line 394
    cmp-long v1, v1, v3

    .line 395
    .line 396
    if-eqz v1, :cond_3

    .line 397
    .line 398
    const/16 v1, 0x90

    .line 399
    .line 400
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    return v1

    .line 405
    :cond_3
    :goto_0
    const-wide/high16 v7, 0x400000000000000L

    .line 406
    .line 407
    const-wide/16 v11, 0x5000

    .line 408
    .line 409
    const-wide/16 v3, 0x0

    .line 410
    .line 411
    move-object v0, p0

    .line 412
    move-wide v1, p1

    .line 413
    move-wide/from16 v5, p3

    .line 414
    .line 415
    move-wide/from16 v9, p5

    .line 416
    .line 417
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    return v1

    .line 422
    :pswitch_f
    const-wide/32 v1, 0x10000000

    .line 423
    .line 424
    .line 425
    and-long v1, p3, v1

    .line 426
    .line 427
    cmp-long v1, v1, v3

    .line 428
    .line 429
    if-eqz v1, :cond_4

    .line 430
    .line 431
    const/16 v1, 0x5c

    .line 432
    .line 433
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    return v1

    .line 438
    :cond_4
    const-wide/32 v1, 0x20000000

    .line 439
    .line 440
    .line 441
    and-long v1, p3, v1

    .line 442
    .line 443
    cmp-long v1, v1, v3

    .line 444
    .line 445
    if-eqz v1, :cond_5

    .line 446
    .line 447
    const/16 v1, 0x5d

    .line 448
    .line 449
    iput v1, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 450
    .line 451
    iput v8, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 452
    .line 453
    goto/16 :goto_1

    .line 454
    .line 455
    :cond_5
    const-wide v1, 0x80000000L

    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    and-long v1, p3, v1

    .line 461
    .line 462
    cmp-long v1, v1, v3

    .line 463
    .line 464
    if-eqz v1, :cond_6

    .line 465
    .line 466
    const/16 v1, 0x5f

    .line 467
    .line 468
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    return v1

    .line 473
    :cond_6
    and-long v1, p3, v10

    .line 474
    .line 475
    cmp-long v1, v1, v3

    .line 476
    .line 477
    if-eqz v1, :cond_7

    .line 478
    .line 479
    invoke-direct {p0, v8, v9}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    return v1

    .line 484
    :cond_7
    const-wide/high16 v1, 0x1000000000000000L

    .line 485
    .line 486
    and-long v1, p3, v1

    .line 487
    .line 488
    cmp-long v1, v1, v3

    .line 489
    .line 490
    if-eqz v1, :cond_8

    .line 491
    .line 492
    invoke-direct {p0, v8, v5}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 493
    .line 494
    .line 495
    move-result v1

    .line 496
    return v1

    .line 497
    :cond_8
    const-wide/high16 v1, 0x2000000000000000L

    .line 498
    .line 499
    and-long v1, p3, v1

    .line 500
    .line 501
    cmp-long v1, v1, v3

    .line 502
    .line 503
    if-eqz v1, :cond_9

    .line 504
    .line 505
    const/16 v1, 0x7d

    .line 506
    .line 507
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 508
    .line 509
    .line 510
    move-result v1

    .line 511
    return v1

    .line 512
    :cond_9
    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    .line 513
    .line 514
    and-long v1, p3, v1

    .line 515
    .line 516
    cmp-long v1, v1, v3

    .line 517
    .line 518
    if-eqz v1, :cond_a

    .line 519
    .line 520
    const/16 v1, 0x7e

    .line 521
    .line 522
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 523
    .line 524
    .line 525
    move-result v1

    .line 526
    return v1

    .line 527
    :cond_a
    const-wide/high16 v1, -0x8000000000000000L

    .line 528
    .line 529
    and-long v1, p3, v1

    .line 530
    .line 531
    cmp-long v1, v1, v3

    .line 532
    .line 533
    if-eqz v1, :cond_b

    .line 534
    .line 535
    const/16 v1, 0x7f

    .line 536
    .line 537
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 538
    .line 539
    .line 540
    move-result v1

    .line 541
    return v1

    .line 542
    :cond_b
    const-wide/16 v1, 0x1

    .line 543
    .line 544
    and-long v1, p5, v1

    .line 545
    .line 546
    cmp-long v1, v1, v3

    .line 547
    .line 548
    if-eqz v1, :cond_c

    .line 549
    .line 550
    const/16 v1, 0x80

    .line 551
    .line 552
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 553
    .line 554
    .line 555
    move-result v1

    .line 556
    return v1

    .line 557
    :cond_c
    const-wide/16 v1, 0x4

    .line 558
    .line 559
    and-long v1, p5, v1

    .line 560
    .line 561
    cmp-long v1, v1, v3

    .line 562
    .line 563
    if-eqz v1, :cond_d

    .line 564
    .line 565
    const/16 v1, 0x82

    .line 566
    .line 567
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 568
    .line 569
    .line 570
    move-result v1

    .line 571
    return v1

    .line 572
    :cond_d
    const-wide/16 v1, 0x10

    .line 573
    .line 574
    and-long v1, p5, v1

    .line 575
    .line 576
    cmp-long v1, v1, v3

    .line 577
    .line 578
    if-eqz v1, :cond_e

    .line 579
    .line 580
    const/16 v1, 0x84

    .line 581
    .line 582
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    return v1

    .line 587
    :cond_e
    const-wide/16 v1, 0x40

    .line 588
    .line 589
    and-long v1, p5, v1

    .line 590
    .line 591
    cmp-long v1, v1, v3

    .line 592
    .line 593
    if-eqz v1, :cond_f

    .line 594
    .line 595
    const/16 v1, 0x86

    .line 596
    .line 597
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 598
    .line 599
    .line 600
    move-result v1

    .line 601
    return v1

    .line 602
    :cond_f
    :goto_1
    const-wide/16 v7, 0x0

    .line 603
    .line 604
    const-wide/32 v11, 0x20000

    .line 605
    .line 606
    .line 607
    const-wide/16 v3, 0x0

    .line 608
    .line 609
    move-object v0, p0

    .line 610
    move-wide v1, p1

    .line 611
    move-wide/from16 v5, p3

    .line 612
    .line 613
    move-wide/from16 v9, p5

    .line 614
    .line 615
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    return v1

    .line 620
    :pswitch_10
    const-wide/high16 v1, 0x40000000000000L

    .line 621
    .line 622
    and-long v1, p3, v1

    .line 623
    .line 624
    cmp-long v1, v1, v3

    .line 625
    .line 626
    if-eqz v1, :cond_10

    .line 627
    .line 628
    const/16 v1, 0x76

    .line 629
    .line 630
    iput v1, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 631
    .line 632
    iput v8, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 633
    .line 634
    :cond_10
    const-wide/16 v7, 0x0

    .line 635
    .line 636
    const-wide/16 v11, 0x400

    .line 637
    .line 638
    const-wide/16 v3, 0x0

    .line 639
    .line 640
    move-object v0, p0

    .line 641
    move-wide v1, p1

    .line 642
    move-wide/from16 v5, p3

    .line 643
    .line 644
    move-wide/from16 v9, p5

    .line 645
    .line 646
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 647
    .line 648
    .line 649
    move-result v1

    .line 650
    return v1

    .line 651
    :cond_11
    const-wide/16 v7, 0x0

    .line 652
    .line 653
    const-wide/16 v11, 0x0

    .line 654
    .line 655
    const-wide v3, 0x440000000000L

    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    move-object v0, p0

    .line 661
    move-wide v1, p1

    .line 662
    move-wide/from16 v5, p3

    .line 663
    .line 664
    move-wide/from16 v9, p5

    .line 665
    .line 666
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 667
    .line 668
    .line 669
    move-result v1

    .line 670
    return v1

    .line 671
    :cond_12
    const-wide/16 v7, 0x0

    .line 672
    .line 673
    const-wide/16 v11, 0x0

    .line 674
    .line 675
    const-wide/high16 v3, 0x6000000000000L

    .line 676
    .line 677
    move-object v0, p0

    .line 678
    move-wide v1, p1

    .line 679
    move-wide/from16 v5, p3

    .line 680
    .line 681
    move-wide/from16 v9, p5

    .line 682
    .line 683
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 684
    .line 685
    .line 686
    move-result v1

    .line 687
    return v1

    .line 688
    :cond_13
    const-wide v7, 0x2a00000000000L

    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    const-wide/16 v11, 0x0

    .line 694
    .line 695
    const-wide/16 v3, 0x800

    .line 696
    .line 697
    move-object v0, p0

    .line 698
    move-wide v1, p1

    .line 699
    move-wide/from16 v5, p3

    .line 700
    .line 701
    move-wide/from16 v9, p5

    .line 702
    .line 703
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 704
    .line 705
    .line 706
    move-result v1

    .line 707
    return v1

    .line 708
    :cond_14
    const-wide v7, 0x2000000000L

    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    const-wide/16 v11, 0x2

    .line 714
    .line 715
    const-wide v3, 0x90008030000L

    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    move-object v0, p0

    .line 721
    move-wide v1, p1

    .line 722
    move-wide/from16 v5, p3

    .line 723
    .line 724
    move-wide/from16 v9, p5

    .line 725
    .line 726
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 727
    .line 728
    .line 729
    move-result v1

    .line 730
    return v1

    .line 731
    :cond_15
    const-wide/32 v1, 0x2000000

    .line 732
    .line 733
    .line 734
    and-long v1, p5, v1

    .line 735
    .line 736
    cmp-long v1, v1, v3

    .line 737
    .line 738
    if-eqz v1, :cond_16

    .line 739
    .line 740
    const/16 v1, 0x99

    .line 741
    .line 742
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 743
    .line 744
    .line 745
    move-result v1

    .line 746
    return v1

    .line 747
    :cond_16
    const-wide/16 v7, 0x0

    .line 748
    .line 749
    const-wide/32 v11, 0x1000000

    .line 750
    .line 751
    .line 752
    const-wide/16 v3, 0x0

    .line 753
    .line 754
    move-object v0, p0

    .line 755
    move-wide v1, p1

    .line 756
    move-wide/from16 v5, p3

    .line 757
    .line 758
    move-wide/from16 v9, p5

    .line 759
    .line 760
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 761
    .line 762
    .line 763
    move-result v1

    .line 764
    return v1

    .line 765
    :cond_17
    const-wide v1, 0x8000000000L

    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    and-long v1, p3, v1

    .line 771
    .line 772
    cmp-long v1, v1, v3

    .line 773
    .line 774
    if-eqz v1, :cond_20

    .line 775
    .line 776
    const/16 v1, 0x67

    .line 777
    .line 778
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 779
    .line 780
    .line 781
    move-result v1

    .line 782
    return v1

    .line 783
    :cond_18
    const-wide v1, 0x4000000000L

    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    and-long v1, p3, v1

    .line 789
    .line 790
    cmp-long v1, v1, v3

    .line 791
    .line 792
    if-eqz v1, :cond_20

    .line 793
    .line 794
    const/16 v1, 0x66

    .line 795
    .line 796
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 797
    .line 798
    .line 799
    move-result v1

    .line 800
    return v1

    .line 801
    :cond_19
    const-wide/high16 v1, 0x10000000000000L

    .line 802
    .line 803
    and-long v1, p3, v1

    .line 804
    .line 805
    cmp-long v1, v1, v3

    .line 806
    .line 807
    if-eqz v1, :cond_1a

    .line 808
    .line 809
    iput v6, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 810
    .line 811
    iput v8, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 812
    .line 813
    :cond_1a
    const-wide/16 v7, 0x0

    .line 814
    .line 815
    const-wide/16 v11, 0x100

    .line 816
    .line 817
    const-wide/16 v3, 0x0

    .line 818
    .line 819
    move-object v0, p0

    .line 820
    move-wide v1, p1

    .line 821
    move-wide/from16 v5, p3

    .line 822
    .line 823
    move-wide/from16 v9, p5

    .line 824
    .line 825
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 826
    .line 827
    .line 828
    move-result v1

    .line 829
    return v1

    .line 830
    :cond_1b
    const-wide v5, 0x400000000L

    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    and-long v5, p3, v5

    .line 836
    .line 837
    cmp-long v1, v5, v3

    .line 838
    .line 839
    if-eqz v1, :cond_20

    .line 840
    .line 841
    invoke-direct {p0, v8, v2}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 842
    .line 843
    .line 844
    move-result v1

    .line 845
    return v1

    .line 846
    :cond_1c
    const-wide/high16 v7, 0xa00000000000000L

    .line 847
    .line 848
    const-wide/32 v11, 0xa000

    .line 849
    .line 850
    .line 851
    const-wide v3, 0x320300000002000L

    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    move-object v0, p0

    .line 857
    move-wide v1, p1

    .line 858
    move-wide/from16 v5, p3

    .line 859
    .line 860
    move-wide/from16 v9, p5

    .line 861
    .line 862
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa2_0(JJJJJJ)I

    .line 863
    .line 864
    .line 865
    move-result v1

    .line 866
    return v1

    .line 867
    :cond_1d
    const-wide/32 v1, 0x100000

    .line 868
    .line 869
    .line 870
    and-long v1, p5, v1

    .line 871
    .line 872
    cmp-long v1, v1, v3

    .line 873
    .line 874
    if-eqz v1, :cond_1e

    .line 875
    .line 876
    const/16 v1, 0x94

    .line 877
    .line 878
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 879
    .line 880
    .line 881
    move-result v1

    .line 882
    return v1

    .line 883
    :cond_1e
    const-wide/32 v1, 0x800000

    .line 884
    .line 885
    .line 886
    and-long v1, p5, v1

    .line 887
    .line 888
    cmp-long v1, v1, v3

    .line 889
    .line 890
    if-eqz v1, :cond_20

    .line 891
    .line 892
    const/16 v1, 0x97

    .line 893
    .line 894
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 895
    .line 896
    .line 897
    move-result v1

    .line 898
    return v1

    .line 899
    :cond_1f
    const-wide v1, 0x1000000000L

    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    and-long v1, p3, v1

    .line 905
    .line 906
    cmp-long v1, v1, v3

    .line 907
    .line 908
    if-eqz v1, :cond_20

    .line 909
    .line 910
    const/16 v1, 0x64

    .line 911
    .line 912
    invoke-direct {p0, v8, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 913
    .line 914
    .line 915
    move-result v1

    .line 916
    return v1

    .line 917
    :cond_20
    :goto_2
    const/4 v1, 0x0

    .line 918
    move-object v0, p0

    .line 919
    move-wide v2, p1

    .line 920
    move-wide/from16 v4, p3

    .line 921
    .line 922
    move-wide/from16 v6, p5

    .line 923
    .line 924
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 925
    .line 926
    .line 927
    move-result v1

    .line 928
    return v1

    .line 929
    :catch_0
    const/4 v1, 0x0

    .line 930
    move-object v0, p0

    .line 931
    move-wide v2, p1

    .line 932
    move-wide/from16 v4, p3

    .line 933
    .line 934
    move-wide/from16 v6, p5

    .line 935
    .line 936
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 937
    .line 938
    .line 939
    return v8

    .line 940
    nop

    .line 941
    :pswitch_data_0
    .packed-switch 0x3c
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    :pswitch_data_1
    .packed-switch 0x65
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    :pswitch_data_2
    .packed-switch 0x6c
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    :pswitch_data_3
    .packed-switch 0x77
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private jjMoveStringLiteralDfa20_0(JJJJ)I
    .locals 13

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    const-wide/16 v7, 0x0

    .line 8
    .line 9
    cmp-long v0, v3, v7

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/16 v1, 0x12

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-wide v4, p1

    .line 19
    move-wide/from16 v6, p5

    .line 20
    .line 21
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    return v1

    .line 26
    :cond_0
    const/16 v3, 0x14

    .line 27
    .line 28
    :try_start_0
    iget-object v4, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 29
    .line 30
    invoke-virtual {v4}, Lbsh/JavaCharStream;->readChar()C

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    iput v4, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    const/16 v9, 0x74

    .line 37
    .line 38
    if-eq v4, v9, :cond_1

    .line 39
    .line 40
    const/16 v3, 0x13

    .line 41
    .line 42
    const-wide/16 v7, 0x0

    .line 43
    .line 44
    move-object p1, p0

    .line 45
    move-wide/from16 p5, v1

    .line 46
    .line 47
    move p2, v3

    .line 48
    move-wide/from16 p7, v5

    .line 49
    .line 50
    move-wide/from16 p3, v7

    .line 51
    .line 52
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    return v0

    .line 57
    :cond_1
    move-wide v9, v5

    .line 58
    move-wide v4, v1

    .line 59
    const-wide/high16 v11, 0x800000000000000L

    .line 60
    .line 61
    and-long/2addr v11, v4

    .line 62
    cmp-long v0, v11, v7

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    const/16 v0, 0x7b

    .line 67
    .line 68
    iput v0, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 69
    .line 70
    iput v3, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 71
    .line 72
    :cond_2
    move-wide v1, v4

    .line 73
    const-wide/16 v3, 0x0

    .line 74
    .line 75
    const-wide/32 v7, 0x8000

    .line 76
    .line 77
    .line 78
    move-object v0, p0

    .line 79
    move-wide v5, v9

    .line 80
    invoke-direct/range {v0 .. v8}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa21_0(JJJJ)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    return v1

    .line 85
    :catch_0
    move-wide v9, v5

    .line 86
    const/16 v0, 0x13

    .line 87
    .line 88
    const-wide/16 v4, 0x0

    .line 89
    .line 90
    move-object p1, p0

    .line 91
    move p2, v0

    .line 92
    move-wide/from16 p5, v1

    .line 93
    .line 94
    move-wide/from16 p3, v4

    .line 95
    .line 96
    move-wide/from16 p7, v9

    .line 97
    .line 98
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 99
    .line 100
    .line 101
    return v3
.end method

.method private jjMoveStringLiteralDfa21_0(JJJJ)I
    .locals 8

    .line 1
    and-long v0, p3, p1

    .line 2
    .line 3
    and-long v2, p7, p5

    .line 4
    .line 5
    or-long/2addr v0, v2

    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    cmp-long v0, v0, v4

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/16 v1, 0x13

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    move-object v0, p0

    .line 17
    move-wide v4, p1

    .line 18
    move-wide v6, p5

    .line 19
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    return v1

    .line 24
    :cond_0
    :try_start_0
    iget-object v1, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 25
    .line 26
    invoke-virtual {v1}, Lbsh/JavaCharStream;->readChar()C

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iput v1, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    const/16 v4, 0x5f

    .line 33
    .line 34
    if-eq v1, v4, :cond_1

    .line 35
    .line 36
    const-wide/16 v4, 0x0

    .line 37
    .line 38
    const-wide/16 v6, 0x0

    .line 39
    .line 40
    const/16 v1, 0x14

    .line 41
    .line 42
    move-object p1, p0

    .line 43
    move p2, v1

    .line 44
    move-wide p7, v2

    .line 45
    move-wide p3, v4

    .line 46
    move-wide p5, v6

    .line 47
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    return v0

    .line 52
    :cond_1
    const-wide/32 v4, 0x8000

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, v2, v3, v4, v5}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa22_0(JJ)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    return v0

    .line 60
    :catch_0
    const-wide/16 v4, 0x0

    .line 61
    .line 62
    const-wide/16 v6, 0x0

    .line 63
    .line 64
    const/16 v0, 0x14

    .line 65
    .line 66
    move-object p1, p0

    .line 67
    move p2, v0

    .line 68
    move-wide p7, v2

    .line 69
    move-wide p3, v4

    .line 70
    move-wide p5, v6

    .line 71
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 72
    .line 73
    .line 74
    const/16 v0, 0x15

    .line 75
    .line 76
    return v0
.end method

.method private jjMoveStringLiteralDfa22_0(JJ)I
    .locals 8

    .line 1
    and-long v6, p3, p1

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v0, v6, v0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    const/16 v1, 0x14

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    move-wide v6, p1

    .line 17
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    return v1

    .line 22
    :cond_0
    :try_start_0
    iget-object v1, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 23
    .line 24
    invoke-virtual {v1}, Lbsh/JavaCharStream;->readChar()C

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iput v1, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    const/16 v2, 0x61

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    const-wide/16 v4, 0x0

    .line 37
    .line 38
    const/16 v1, 0x15

    .line 39
    .line 40
    move-object v0, p0

    .line 41
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    return v1

    .line 46
    :cond_1
    const-wide/32 v1, 0x8000

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v6, v7, v1, v2}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa23_0(JJ)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    return v1

    .line 54
    :catch_0
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    const-wide/16 v4, 0x0

    .line 57
    .line 58
    const/16 v1, 0x15

    .line 59
    .line 60
    move-object v0, p0

    .line 61
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 62
    .line 63
    .line 64
    const/16 v0, 0x16

    .line 65
    .line 66
    return v0
.end method

.method private jjMoveStringLiteralDfa23_0(JJ)I
    .locals 8

    .line 1
    and-long v6, p3, p1

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v0, v6, v0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    const/16 v1, 0x15

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    move-wide v6, p1

    .line 17
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    return v1

    .line 22
    :cond_0
    :try_start_0
    iget-object v1, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 23
    .line 24
    invoke-virtual {v1}, Lbsh/JavaCharStream;->readChar()C

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iput v1, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    const/16 v2, 0x73

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    const-wide/16 v4, 0x0

    .line 37
    .line 38
    const/16 v1, 0x16

    .line 39
    .line 40
    move-object v0, p0

    .line 41
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    return v1

    .line 46
    :cond_1
    const-wide/32 v1, 0x8000

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v6, v7, v1, v2}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa24_0(JJ)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    return v1

    .line 54
    :catch_0
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    const-wide/16 v4, 0x0

    .line 57
    .line 58
    const/16 v1, 0x16

    .line 59
    .line 60
    move-object v0, p0

    .line 61
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 62
    .line 63
    .line 64
    const/16 v0, 0x17

    .line 65
    .line 66
    return v0
.end method

.method private jjMoveStringLiteralDfa24_0(JJ)I
    .locals 8

    .line 1
    and-long v6, p3, p1

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v0, v6, v0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    const/16 v1, 0x16

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    move-wide v6, p1

    .line 17
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    return v1

    .line 22
    :cond_0
    :try_start_0
    iget-object v1, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 23
    .line 24
    invoke-virtual {v1}, Lbsh/JavaCharStream;->readChar()C

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iput v1, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    const/16 v2, 0x73

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    const-wide/16 v4, 0x0

    .line 37
    .line 38
    const/16 v1, 0x17

    .line 39
    .line 40
    move-object v0, p0

    .line 41
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    return v1

    .line 46
    :cond_1
    const-wide/32 v1, 0x8000

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v6, v7, v1, v2}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa25_0(JJ)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    return v1

    .line 54
    :catch_0
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    const-wide/16 v4, 0x0

    .line 57
    .line 58
    const/16 v1, 0x17

    .line 59
    .line 60
    move-object v0, p0

    .line 61
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 62
    .line 63
    .line 64
    const/16 v0, 0x18

    .line 65
    .line 66
    return v0
.end method

.method private jjMoveStringLiteralDfa25_0(JJ)I
    .locals 8

    .line 1
    and-long v6, p3, p1

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v0, v6, v0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    const/16 v1, 0x17

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    move-wide v6, p1

    .line 17
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    return v1

    .line 22
    :cond_0
    :try_start_0
    iget-object v1, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 23
    .line 24
    invoke-virtual {v1}, Lbsh/JavaCharStream;->readChar()C

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iput v1, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    const/16 v2, 0x69

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    const-wide/16 v4, 0x0

    .line 37
    .line 38
    const/16 v1, 0x18

    .line 39
    .line 40
    move-object v0, p0

    .line 41
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    return v1

    .line 46
    :cond_1
    const-wide/32 v1, 0x8000

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v6, v7, v1, v2}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa26_0(JJ)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    return v1

    .line 54
    :catch_0
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    const-wide/16 v4, 0x0

    .line 57
    .line 58
    const/16 v1, 0x18

    .line 59
    .line 60
    move-object v0, p0

    .line 61
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 62
    .line 63
    .line 64
    const/16 v0, 0x19

    .line 65
    .line 66
    return v0
.end method

.method private jjMoveStringLiteralDfa26_0(JJ)I
    .locals 8

    .line 1
    and-long v6, p3, p1

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v0, v6, v0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    const/16 v1, 0x18

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    move-wide v6, p1

    .line 17
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    return v1

    .line 22
    :cond_0
    :try_start_0
    iget-object v1, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 23
    .line 24
    invoke-virtual {v1}, Lbsh/JavaCharStream;->readChar()C

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iput v1, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    const/16 v2, 0x67

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    const-wide/16 v4, 0x0

    .line 37
    .line 38
    const/16 v1, 0x19

    .line 39
    .line 40
    move-object v0, p0

    .line 41
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    return v1

    .line 46
    :cond_1
    const-wide/32 v1, 0x8000

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v6, v7, v1, v2}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa27_0(JJ)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    return v1

    .line 54
    :catch_0
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    const-wide/16 v4, 0x0

    .line 57
    .line 58
    const/16 v1, 0x19

    .line 59
    .line 60
    move-object v0, p0

    .line 61
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 62
    .line 63
    .line 64
    const/16 v0, 0x1a

    .line 65
    .line 66
    return v0
.end method

.method private jjMoveStringLiteralDfa27_0(JJ)I
    .locals 9

    .line 1
    and-long v6, p3, p1

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v2, v6, v0

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    const/16 v1, 0x19

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    move-wide v6, p1

    .line 17
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    return v1

    .line 22
    :cond_0
    const/16 v8, 0x1b

    .line 23
    .line 24
    :try_start_0
    iget-object v3, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 25
    .line 26
    invoke-virtual {v3}, Lbsh/JavaCharStream;->readChar()C

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    iput v3, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    const/16 v4, 0x6e

    .line 33
    .line 34
    if-eq v3, v4, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-wide/32 v3, 0x8000

    .line 38
    .line 39
    .line 40
    and-long/2addr v3, v6

    .line 41
    cmp-long v0, v3, v0

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    const/16 v0, 0x8f

    .line 46
    .line 47
    invoke-direct {p0, v8, v0}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    return v0

    .line 52
    :cond_2
    :goto_0
    const-wide/16 v2, 0x0

    .line 53
    .line 54
    const-wide/16 v4, 0x0

    .line 55
    .line 56
    const/16 v1, 0x1a

    .line 57
    .line 58
    move-object v0, p0

    .line 59
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    return v1

    .line 64
    :catch_0
    const-wide/16 v2, 0x0

    .line 65
    .line 66
    const-wide/16 v4, 0x0

    .line 67
    .line 68
    const/16 v1, 0x1a

    .line 69
    .line 70
    move-object v0, p0

    .line 71
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 72
    .line 73
    .line 74
    return v8
.end method

.method private jjMoveStringLiteralDfa2_0(JJJJJJ)I
    .locals 15

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    and-long v9, p11, p9

    .line 8
    .line 9
    or-long/2addr v3, v9

    .line 10
    const-wide/16 v7, 0x0

    .line 11
    .line 12
    cmp-long v0, v3, v7

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    move-object v0, p0

    .line 18
    move-wide/from16 v2, p1

    .line 19
    .line 20
    move-wide/from16 v4, p5

    .line 21
    .line 22
    move-wide/from16 v6, p9

    .line 23
    .line 24
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    return v1

    .line 29
    :cond_0
    const/4 v3, 0x2

    .line 30
    :try_start_0
    iget-object v4, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 31
    .line 32
    invoke-virtual {v4}, Lbsh/JavaCharStream;->readChar()C

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    iput v4, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    const/16 v11, 0x2e

    .line 39
    .line 40
    if-eq v4, v11, :cond_13

    .line 41
    .line 42
    const/16 v11, 0x69

    .line 43
    .line 44
    if-eq v4, v11, :cond_12

    .line 45
    .line 46
    const/16 v11, 0x6c

    .line 47
    .line 48
    if-eq v4, v11, :cond_11

    .line 49
    .line 50
    const/16 v11, 0x77

    .line 51
    .line 52
    const/16 v12, 0x2a

    .line 53
    .line 54
    if-eq v4, v11, :cond_10

    .line 55
    .line 56
    const/16 v11, 0x79

    .line 57
    .line 58
    if-eq v4, v11, :cond_f

    .line 59
    .line 60
    const/16 v11, 0x3d

    .line 61
    .line 62
    if-eq v4, v11, :cond_b

    .line 63
    .line 64
    const/16 v11, 0x3e

    .line 65
    .line 66
    if-eq v4, v11, :cond_8

    .line 67
    .line 68
    const/16 v11, 0x65

    .line 69
    .line 70
    if-eq v4, v11, :cond_7

    .line 71
    .line 72
    const/16 v11, 0x66

    .line 73
    .line 74
    if-eq v4, v11, :cond_6

    .line 75
    .line 76
    packed-switch v4, :pswitch_data_0

    .line 77
    .line 78
    .line 79
    packed-switch v4, :pswitch_data_1

    .line 80
    .line 81
    .line 82
    packed-switch v4, :pswitch_data_2

    .line 83
    .line 84
    .line 85
    goto/16 :goto_2

    .line 86
    .line 87
    :pswitch_0
    const-wide/16 v7, 0x0

    .line 88
    .line 89
    const-wide/16 v11, 0x0

    .line 90
    .line 91
    const-wide v3, 0x100000002800000L

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    move-object v0, p0

    .line 97
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa3_0(JJJJJJ)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    return v1

    .line 102
    :pswitch_1
    const-wide v11, 0x2000000000L

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    and-long/2addr v11, v1

    .line 108
    cmp-long v4, v11, v7

    .line 109
    .line 110
    if-eqz v4, :cond_1

    .line 111
    .line 112
    const/16 v4, 0x25

    .line 113
    .line 114
    iput v4, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 115
    .line 116
    iput v3, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    const-wide/32 v11, 0x800000

    .line 120
    .line 121
    .line 122
    and-long/2addr v11, v5

    .line 123
    cmp-long v4, v11, v7

    .line 124
    .line 125
    if-eqz v4, :cond_2

    .line 126
    .line 127
    const/16 v4, 0x57

    .line 128
    .line 129
    iput v4, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 130
    .line 131
    iput v3, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_2
    const-wide/32 v11, 0x2000000

    .line 135
    .line 136
    .line 137
    and-long/2addr v11, v5

    .line 138
    cmp-long v4, v11, v7

    .line 139
    .line 140
    if-eqz v4, :cond_3

    .line 141
    .line 142
    const/16 v4, 0x59

    .line 143
    .line 144
    iput v4, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 145
    .line 146
    iput v3, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 147
    .line 148
    :cond_3
    :goto_0
    const-wide v7, 0x140000000L

    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    const-wide/16 v11, 0x0

    .line 154
    .line 155
    const-wide v3, 0x814104028000L

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    move-object v0, p0

    .line 161
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa3_0(JJJJJJ)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    return v1

    .line 166
    :pswitch_2
    const-wide/16 v7, 0x0

    .line 167
    .line 168
    const-wide/16 v11, 0x0

    .line 169
    .line 170
    const-wide v3, 0x1001010800L

    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    move-object v0, p0

    .line 176
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa3_0(JJJJJJ)I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    return v1

    .line 181
    :pswitch_3
    const-wide v13, 0x80000000L

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    and-long/2addr v13, v1

    .line 187
    cmp-long v4, v13, v7

    .line 188
    .line 189
    if-eqz v4, :cond_4

    .line 190
    .line 191
    const/16 v1, 0x1f

    .line 192
    .line 193
    invoke-direct {p0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    return v1

    .line 198
    :cond_4
    const-wide v11, 0x800000000L

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    and-long/2addr v11, v5

    .line 204
    cmp-long v4, v11, v7

    .line 205
    .line 206
    if-eqz v4, :cond_5

    .line 207
    .line 208
    const/16 v4, 0x63

    .line 209
    .line 210
    iput v4, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 211
    .line 212
    iput v3, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 213
    .line 214
    :cond_5
    const-wide/16 v7, 0x0

    .line 215
    .line 216
    const-wide/16 v11, 0x8

    .line 217
    .line 218
    const-wide/high16 v3, 0xc4000000000000L

    .line 219
    .line 220
    move-object v0, p0

    .line 221
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa3_0(JJJJJJ)I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    return v1

    .line 226
    :pswitch_4
    const-wide/16 v7, 0x0

    .line 227
    .line 228
    const-wide/16 v11, 0x0

    .line 229
    .line 230
    const-wide v3, 0xc00000000L

    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    move-object v0, p0

    .line 236
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa3_0(JJJJJJ)I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    return v1

    .line 241
    :pswitch_5
    const-wide/high16 v7, 0x28000000000000L

    .line 242
    .line 243
    const-wide/16 v11, 0x2a0

    .line 244
    .line 245
    const-wide v3, 0x1200040001000L

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    move-object v0, p0

    .line 251
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa3_0(JJJJJJ)I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    return v1

    .line 256
    :pswitch_6
    const-wide v7, 0x2000000000L

    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    const-wide/16 v11, 0x2

    .line 262
    .line 263
    const-wide v3, 0x10008030180000L

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    move-object v0, p0

    .line 269
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa3_0(JJJJJJ)I

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    return v1

    .line 274
    :pswitch_7
    const-wide/16 v7, 0x0

    .line 275
    .line 276
    const-wide/16 v11, 0x0

    .line 277
    .line 278
    const-wide v3, 0x80000000000L

    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    move-object v0, p0

    .line 284
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa3_0(JJJJJJ)I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    return v1

    .line 289
    :pswitch_8
    const-wide/16 v7, 0x0

    .line 290
    .line 291
    const-wide/16 v11, 0x0

    .line 292
    .line 293
    const-wide v3, 0x400000000000L

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    move-object v0, p0

    .line 299
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa3_0(JJJJJJ)I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    return v1

    .line 304
    :pswitch_9
    const-wide/16 v7, 0x0

    .line 305
    .line 306
    const-wide/16 v11, 0x0

    .line 307
    .line 308
    const-wide v3, 0x22000000044000L

    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    move-object v0, p0

    .line 314
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa3_0(JJJJJJ)I

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    return v1

    .line 319
    :cond_6
    const-wide/16 v7, 0x0

    .line 320
    .line 321
    const-wide/32 v11, 0x4000000

    .line 322
    .line 323
    .line 324
    const-wide/32 v3, 0x200000

    .line 325
    .line 326
    .line 327
    move-object v0, p0

    .line 328
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa3_0(JJJJJJ)I

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    return v1

    .line 333
    :cond_7
    const-wide/high16 v7, 0x80000000000000L

    .line 334
    .line 335
    const-wide/16 v11, 0x800

    .line 336
    .line 337
    const-wide v3, 0x1000000000002000L    # 1.28822975392177E-231

    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    move-object v0, p0

    .line 343
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa3_0(JJJJJJ)I

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    return v1

    .line 348
    :cond_8
    const-wide/high16 v11, 0x400000000000000L

    .line 349
    .line 350
    and-long/2addr v11, v5

    .line 351
    cmp-long v4, v11, v7

    .line 352
    .line 353
    if-eqz v4, :cond_9

    .line 354
    .line 355
    const/16 v4, 0x7a

    .line 356
    .line 357
    iput v4, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 358
    .line 359
    iput v3, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 360
    .line 361
    goto :goto_1

    .line 362
    :cond_9
    const-wide/32 v11, 0x20000

    .line 363
    .line 364
    .line 365
    and-long/2addr v11, v9

    .line 366
    cmp-long v4, v11, v7

    .line 367
    .line 368
    if-eqz v4, :cond_a

    .line 369
    .line 370
    const/16 v1, 0x91

    .line 371
    .line 372
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    return v1

    .line 377
    :cond_a
    :goto_1
    const-wide/16 v7, 0x0

    .line 378
    .line 379
    const-wide/16 v11, 0x4000

    .line 380
    .line 381
    const-wide/16 v3, 0x0

    .line 382
    .line 383
    move-object v0, p0

    .line 384
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa3_0(JJJJJJ)I

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    return v1

    .line 389
    :cond_b
    const-wide/16 v11, 0x100

    .line 390
    .line 391
    and-long/2addr v11, v9

    .line 392
    cmp-long v4, v11, v7

    .line 393
    .line 394
    if-eqz v4, :cond_c

    .line 395
    .line 396
    const/16 v1, 0x88

    .line 397
    .line 398
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    return v1

    .line 403
    :cond_c
    const-wide/16 v11, 0x400

    .line 404
    .line 405
    and-long/2addr v11, v9

    .line 406
    cmp-long v4, v11, v7

    .line 407
    .line 408
    if-eqz v4, :cond_d

    .line 409
    .line 410
    const/16 v1, 0x8a

    .line 411
    .line 412
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    return v1

    .line 417
    :cond_d
    const-wide/16 v11, 0x1000

    .line 418
    .line 419
    and-long/2addr v11, v9

    .line 420
    cmp-long v4, v11, v7

    .line 421
    .line 422
    if-eqz v4, :cond_e

    .line 423
    .line 424
    const/16 v1, 0x8c

    .line 425
    .line 426
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    return v1

    .line 431
    :cond_e
    const-wide/32 v11, 0x40000

    .line 432
    .line 433
    .line 434
    and-long/2addr v11, v9

    .line 435
    cmp-long v4, v11, v7

    .line 436
    .line 437
    if-eqz v4, :cond_14

    .line 438
    .line 439
    const/16 v1, 0x92

    .line 440
    .line 441
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 442
    .line 443
    .line 444
    move-result v1

    .line 445
    return v1

    .line 446
    :cond_f
    const-wide/high16 v13, 0x200000000000000L

    .line 447
    .line 448
    and-long/2addr v13, v1

    .line 449
    cmp-long v4, v13, v7

    .line 450
    .line 451
    if-eqz v4, :cond_14

    .line 452
    .line 453
    const/16 v1, 0x39

    .line 454
    .line 455
    invoke-direct {p0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    return v1

    .line 460
    :cond_10
    const-wide v13, 0x20000000000L

    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    and-long/2addr v13, v1

    .line 466
    cmp-long v4, v13, v7

    .line 467
    .line 468
    if-eqz v4, :cond_14

    .line 469
    .line 470
    const/16 v1, 0x29

    .line 471
    .line 472
    invoke-direct {p0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 473
    .line 474
    .line 475
    move-result v1

    .line 476
    return v1

    .line 477
    :cond_11
    const-wide/16 v7, 0x0

    .line 478
    .line 479
    const-wide/16 v11, 0x0

    .line 480
    .line 481
    const-wide v3, 0x800040008000000L

    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    move-object v0, p0

    .line 487
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa3_0(JJJJJJ)I

    .line 488
    .line 489
    .line 490
    move-result v1

    .line 491
    return v1

    .line 492
    :cond_12
    const-wide v7, 0xa02a00000000000L

    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    const-wide/32 v11, 0xa000

    .line 498
    .line 499
    .line 500
    const-wide v3, 0x2408100000000000L

    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    move-object v0, p0

    .line 506
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa3_0(JJJJJJ)I

    .line 507
    .line 508
    .line 509
    move-result v1

    .line 510
    return v1

    .line 511
    :cond_13
    const-wide/32 v11, 0x1000000

    .line 512
    .line 513
    .line 514
    and-long/2addr v11, v9

    .line 515
    cmp-long v4, v11, v7

    .line 516
    .line 517
    if-eqz v4, :cond_14

    .line 518
    .line 519
    const/16 v1, 0x98

    .line 520
    .line 521
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 522
    .line 523
    .line 524
    move-result v1

    .line 525
    return v1

    .line 526
    :cond_14
    :goto_2
    const/4 v3, 0x1

    .line 527
    move-object/from16 p1, p0

    .line 528
    .line 529
    move-wide/from16 p3, v1

    .line 530
    .line 531
    move/from16 p2, v3

    .line 532
    .line 533
    move-wide/from16 p5, v5

    .line 534
    .line 535
    move-wide/from16 p7, v9

    .line 536
    .line 537
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    return v0

    .line 542
    :catch_0
    const/4 v0, 0x1

    .line 543
    move-object/from16 p1, p0

    .line 544
    .line 545
    move/from16 p2, v0

    .line 546
    .line 547
    move-wide/from16 p3, v1

    .line 548
    .line 549
    move-wide/from16 p5, v5

    .line 550
    .line 551
    move-wide/from16 p7, v9

    .line 552
    .line 553
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 554
    .line 555
    .line 556
    return v3

    .line 557
    :pswitch_data_0
    .packed-switch 0x61
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    :pswitch_data_1
    .packed-switch 0x6e
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    :pswitch_data_2
    .packed-switch 0x72
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private jjMoveStringLiteralDfa3_0(JJJJJJ)I
    .locals 14

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    and-long v9, p11, p9

    .line 8
    .line 9
    or-long/2addr v3, v9

    .line 10
    const-wide/16 v7, 0x0

    .line 11
    .line 12
    cmp-long v0, v3, v7

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    move-object v0, p0

    .line 18
    move-wide v2, p1

    .line 19
    move-wide/from16 v4, p5

    .line 20
    .line 21
    move-wide/from16 v6, p9

    .line 22
    .line 23
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    return v1

    .line 28
    :cond_0
    const/4 v3, 0x3

    .line 29
    :try_start_0
    iget-object v4, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 30
    .line 31
    invoke-virtual {v4}, Lbsh/JavaCharStream;->readChar()C

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iput v4, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    const/16 v11, 0x3d

    .line 38
    .line 39
    if-eq v4, v11, :cond_10

    .line 40
    .line 41
    const/16 v11, 0x5f

    .line 42
    .line 43
    if-eq v4, v11, :cond_f

    .line 44
    .line 45
    const/16 v11, 0x69

    .line 46
    .line 47
    if-eq v4, v11, :cond_e

    .line 48
    .line 49
    const/16 v11, 0x2a

    .line 50
    .line 51
    packed-switch v4, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    packed-switch v4, :pswitch_data_1

    .line 55
    .line 56
    .line 57
    packed-switch v4, :pswitch_data_2

    .line 58
    .line 59
    .line 60
    goto/16 :goto_1

    .line 61
    .line 62
    :pswitch_0
    const-wide/high16 v11, 0x20000000000000L

    .line 63
    .line 64
    and-long/2addr v11, v5

    .line 65
    cmp-long v4, v11, v7

    .line 66
    .line 67
    if-eqz v4, :cond_1

    .line 68
    .line 69
    const/16 v4, 0x75

    .line 70
    .line 71
    iput v4, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 72
    .line 73
    iput v3, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 74
    .line 75
    :cond_1
    const-wide/16 v7, 0x0

    .line 76
    .line 77
    const-wide/16 v11, 0x200

    .line 78
    .line 79
    const-wide/16 v3, 0x0

    .line 80
    .line 81
    move-object v0, p0

    .line 82
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    return v1

    .line 87
    :pswitch_1
    const-wide/16 v7, 0x0

    .line 88
    .line 89
    const-wide/16 v11, 0x0

    .line 90
    .line 91
    const-wide v3, 0x100000000000L

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    move-object v0, p0

    .line 97
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    return v1

    .line 102
    :pswitch_2
    const-wide/16 v7, 0x0

    .line 103
    .line 104
    const-wide/16 v11, 0x0

    .line 105
    .line 106
    const-wide v3, 0x800000000000L

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    move-object v0, p0

    .line 112
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    return v1

    .line 117
    :pswitch_3
    const-wide v7, 0x2a00000000000L

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    const-wide/16 v11, 0x0

    .line 123
    .line 124
    const-wide v3, 0xa201000100800L

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    move-object v0, p0

    .line 130
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    return v1

    .line 135
    :pswitch_4
    const-wide/16 v7, 0x0

    .line 136
    .line 137
    const-wide/16 v11, 0x0

    .line 138
    .line 139
    const-wide/32 v3, 0x8084000

    .line 140
    .line 141
    .line 142
    move-object v0, p0

    .line 143
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    return v1

    .line 148
    :pswitch_5
    const-wide/32 v12, 0x40000

    .line 149
    .line 150
    .line 151
    and-long/2addr v12, v1

    .line 152
    cmp-long v4, v12, v7

    .line 153
    .line 154
    if-eqz v4, :cond_2

    .line 155
    .line 156
    const/16 v1, 0x12

    .line 157
    .line 158
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    return v1

    .line 163
    :cond_2
    const-wide/16 v7, 0x0

    .line 164
    .line 165
    const-wide/16 v11, 0x20

    .line 166
    .line 167
    const-wide/high16 v3, 0x1000000000000L

    .line 168
    .line 169
    move-object v0, p0

    .line 170
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    return v1

    .line 175
    :pswitch_6
    const-wide v12, 0x100000000L

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    and-long/2addr v12, v1

    .line 181
    cmp-long v4, v12, v7

    .line 182
    .line 183
    if-eqz v4, :cond_3

    .line 184
    .line 185
    const/16 v1, 0x20

    .line 186
    .line 187
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    return v1

    .line 192
    :cond_3
    const-wide/16 v7, 0x0

    .line 193
    .line 194
    const-wide/16 v11, 0x0

    .line 195
    .line 196
    const-wide v3, 0xc0000800000000L

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    move-object v0, p0

    .line 202
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    return v1

    .line 207
    :pswitch_7
    const-wide/high16 v12, 0x1000000000000000L

    .line 208
    .line 209
    and-long/2addr v12, v1

    .line 210
    cmp-long v4, v12, v7

    .line 211
    .line 212
    if-eqz v4, :cond_4

    .line 213
    .line 214
    const/16 v1, 0x3c

    .line 215
    .line 216
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    return v1

    .line 221
    :cond_4
    const-wide/16 v7, 0x0

    .line 222
    .line 223
    const-wide/16 v11, 0x0

    .line 224
    .line 225
    const-wide/high16 v3, 0x20000000000000L

    .line 226
    .line 227
    move-object v0, p0

    .line 228
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    return v1

    .line 233
    :pswitch_8
    const-wide/32 v12, 0x2000000

    .line 234
    .line 235
    .line 236
    and-long/2addr v12, v1

    .line 237
    cmp-long v4, v12, v7

    .line 238
    .line 239
    if-eqz v4, :cond_11

    .line 240
    .line 241
    const/16 v1, 0x19

    .line 242
    .line 243
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    return v1

    .line 248
    :pswitch_9
    const-wide v12, 0x40000000000L

    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    and-long/2addr v12, v1

    .line 254
    cmp-long v4, v12, v7

    .line 255
    .line 256
    if-eqz v4, :cond_5

    .line 257
    .line 258
    invoke-direct {p0, v3, v11, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    return v1

    .line 263
    :cond_5
    const-wide/16 v7, 0x0

    .line 264
    .line 265
    const-wide/16 v11, 0x0

    .line 266
    .line 267
    const-wide v3, 0x2000400400001000L

    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    move-object v0, p0

    .line 273
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    return v1

    .line 278
    :pswitch_a
    const-wide/16 v7, 0x0

    .line 279
    .line 280
    const-wide/16 v11, 0x0

    .line 281
    .line 282
    const-wide v3, 0x80000000000L

    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    move-object v0, p0

    .line 288
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    return v1

    .line 293
    :pswitch_b
    const-wide v12, 0x8000000000L

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    and-long/2addr v12, v1

    .line 299
    cmp-long v4, v12, v7

    .line 300
    .line 301
    if-eqz v4, :cond_6

    .line 302
    .line 303
    const/16 v1, 0x27

    .line 304
    .line 305
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    return v1

    .line 310
    :cond_6
    const-wide/high16 v7, 0xa00000000000000L

    .line 311
    .line 312
    const-wide/32 v11, 0xa000

    .line 313
    .line 314
    .line 315
    const-wide/16 v3, 0x0

    .line 316
    .line 317
    move-object v0, p0

    .line 318
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    return v1

    .line 323
    :pswitch_c
    const-wide/high16 v7, 0x80000000000000L

    .line 324
    .line 325
    const-wide/16 v11, 0x800

    .line 326
    .line 327
    const-wide/16 v3, 0x0

    .line 328
    .line 329
    move-object v0, p0

    .line 330
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    return v1

    .line 335
    :pswitch_d
    const-wide/32 v12, 0x8000

    .line 336
    .line 337
    .line 338
    and-long/2addr v12, v1

    .line 339
    cmp-long v4, v12, v7

    .line 340
    .line 341
    if-eqz v4, :cond_7

    .line 342
    .line 343
    const/16 v1, 0xf

    .line 344
    .line 345
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    return v1

    .line 350
    :cond_7
    const-wide/32 v12, 0x10000

    .line 351
    .line 352
    .line 353
    and-long/2addr v12, v1

    .line 354
    cmp-long v4, v12, v7

    .line 355
    .line 356
    if-eqz v4, :cond_8

    .line 357
    .line 358
    const/16 v1, 0x10

    .line 359
    .line 360
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    return v1

    .line 365
    :cond_8
    const-wide/32 v12, 0x1000000

    .line 366
    .line 367
    .line 368
    and-long/2addr v12, v1

    .line 369
    cmp-long v4, v12, v7

    .line 370
    .line 371
    if-eqz v4, :cond_9

    .line 372
    .line 373
    const/16 v1, 0x18

    .line 374
    .line 375
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    return v1

    .line 380
    :cond_9
    const-wide/high16 v12, 0x100000000000000L

    .line 381
    .line 382
    and-long/2addr v12, v1

    .line 383
    cmp-long v4, v12, v7

    .line 384
    .line 385
    if-eqz v4, :cond_a

    .line 386
    .line 387
    const/16 v1, 0x38

    .line 388
    .line 389
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    return v1

    .line 394
    :cond_a
    const-wide v7, 0x140000000L

    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    const-wide/16 v11, 0x0

    .line 400
    .line 401
    const-wide v3, 0x4004000000L

    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    move-object v0, p0

    .line 407
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    return v1

    .line 412
    :pswitch_e
    const-wide/high16 v12, 0x400000000000000L

    .line 413
    .line 414
    and-long/2addr v12, v1

    .line 415
    cmp-long v4, v12, v7

    .line 416
    .line 417
    if-eqz v4, :cond_b

    .line 418
    .line 419
    const/16 v1, 0x3a

    .line 420
    .line 421
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    return v1

    .line 426
    :cond_b
    const-wide v11, 0x2000000000L

    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    and-long/2addr v11, v5

    .line 432
    cmp-long v4, v11, v7

    .line 433
    .line 434
    if-eqz v4, :cond_c

    .line 435
    .line 436
    const/16 v4, 0x65

    .line 437
    .line 438
    iput v4, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 439
    .line 440
    iput v3, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 441
    .line 442
    goto :goto_0

    .line 443
    :cond_c
    const-wide/high16 v11, 0x8000000000000L

    .line 444
    .line 445
    and-long/2addr v11, v5

    .line 446
    cmp-long v4, v11, v7

    .line 447
    .line 448
    if-eqz v4, :cond_d

    .line 449
    .line 450
    const/16 v4, 0x73

    .line 451
    .line 452
    iput v4, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 453
    .line 454
    iput v3, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 455
    .line 456
    :cond_d
    :goto_0
    const-wide/16 v7, 0x0

    .line 457
    .line 458
    const-wide/16 v11, 0x82

    .line 459
    .line 460
    const-wide/16 v3, 0x0

    .line 461
    .line 462
    move-object v0, p0

    .line 463
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 464
    .line 465
    .line 466
    move-result v1

    .line 467
    return v1

    .line 468
    :pswitch_f
    const-wide/16 v7, 0x0

    .line 469
    .line 470
    const-wide/16 v11, 0x0

    .line 471
    .line 472
    const-wide v3, 0x10000000020000L

    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    move-object v0, p0

    .line 478
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 479
    .line 480
    .line 481
    move-result v1

    .line 482
    return v1

    .line 483
    :pswitch_10
    const-wide/16 v7, 0x0

    .line 484
    .line 485
    const-wide/16 v11, 0x0

    .line 486
    .line 487
    const-wide/32 v3, 0x800000

    .line 488
    .line 489
    .line 490
    move-object v0, p0

    .line 491
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    return v1

    .line 496
    :pswitch_11
    const-wide/16 v7, 0x0

    .line 497
    .line 498
    const-wide/32 v11, 0x4000000

    .line 499
    .line 500
    .line 501
    const-wide v3, 0x800000070202000L

    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    move-object v0, p0

    .line 507
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 508
    .line 509
    .line 510
    move-result v1

    .line 511
    return v1

    .line 512
    :cond_e
    const-wide/16 v7, 0x0

    .line 513
    .line 514
    const-wide/16 v11, 0x0

    .line 515
    .line 516
    const-wide v3, 0x4010000000000L

    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    move-object v0, p0

    .line 522
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 523
    .line 524
    .line 525
    move-result v1

    .line 526
    return v1

    .line 527
    :cond_f
    const-wide/16 v7, 0x0

    .line 528
    .line 529
    const-wide/16 v11, 0x8

    .line 530
    .line 531
    const-wide/16 v3, 0x0

    .line 532
    .line 533
    move-object v0, p0

    .line 534
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa4_0(JJJJJJ)I

    .line 535
    .line 536
    .line 537
    move-result v1

    .line 538
    return v1

    .line 539
    :cond_10
    const-wide/16 v11, 0x4000

    .line 540
    .line 541
    and-long/2addr v11, v9

    .line 542
    cmp-long v4, v11, v7

    .line 543
    .line 544
    if-eqz v4, :cond_11

    .line 545
    .line 546
    const/16 v1, 0x8e

    .line 547
    .line 548
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 549
    .line 550
    .line 551
    move-result v1

    .line 552
    return v1

    .line 553
    :cond_11
    :goto_1
    const/4 v3, 0x2

    .line 554
    move-object p1, p0

    .line 555
    move-wide/from16 p3, v1

    .line 556
    .line 557
    move/from16 p2, v3

    .line 558
    .line 559
    move-wide/from16 p5, v5

    .line 560
    .line 561
    move-wide/from16 p7, v9

    .line 562
    .line 563
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 564
    .line 565
    .line 566
    move-result v0

    .line 567
    return v0

    .line 568
    :catch_0
    const/4 v0, 0x2

    .line 569
    move-object p1, p0

    .line 570
    move/from16 p2, v0

    .line 571
    .line 572
    move-wide/from16 p3, v1

    .line 573
    .line 574
    move-wide/from16 p5, v5

    .line 575
    .line 576
    move-wide/from16 p7, v9

    .line 577
    .line 578
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 579
    .line 580
    .line 581
    return v3

    .line 582
    nop

    .line 583
    :pswitch_data_0
    .packed-switch 0x61
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch

    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    :pswitch_data_1
    .packed-switch 0x6b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    :pswitch_data_2
    .packed-switch 0x72
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private jjMoveStringLiteralDfa4_0(JJJJJJ)I
    .locals 16

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    and-long v9, p11, p9

    .line 8
    .line 9
    or-long/2addr v3, v9

    .line 10
    const-wide/16 v7, 0x0

    .line 11
    .line 12
    cmp-long v0, v3, v7

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    move-object/from16 v0, p0

    .line 18
    .line 19
    move-wide/from16 v2, p1

    .line 20
    .line 21
    move-wide/from16 v4, p5

    .line 22
    .line 23
    move-wide/from16 v6, p9

    .line 24
    .line 25
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    return v1

    .line 30
    :cond_0
    move-object/from16 v0, p0

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    :try_start_0
    iget-object v4, v0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 34
    .line 35
    invoke-virtual {v4}, Lbsh/JavaCharStream;->readChar()C

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    iput v4, v0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    const-wide/32 v11, 0x40000000

    .line 42
    .line 43
    .line 44
    const/16 v13, 0x2a

    .line 45
    .line 46
    packed-switch v4, :pswitch_data_0

    .line 47
    .line 48
    .line 49
    :pswitch_0
    goto/16 :goto_0

    .line 50
    .line 51
    :pswitch_1
    const-wide/high16 v11, 0x40000000000000L

    .line 52
    .line 53
    and-long/2addr v11, v1

    .line 54
    cmp-long v4, v11, v7

    .line 55
    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    const/16 v4, 0x36

    .line 59
    .line 60
    iput v4, v0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 61
    .line 62
    iput v3, v0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 63
    .line 64
    :cond_1
    const-wide v7, 0x2a00000000000L

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    const-wide/16 v11, 0x0

    .line 70
    .line 71
    const-wide/high16 v3, 0x80000000000000L

    .line 72
    .line 73
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa5_0(JJJJJJ)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    return v1

    .line 78
    :pswitch_2
    const-wide/16 v7, 0x0

    .line 79
    .line 80
    const-wide/16 v11, 0x0

    .line 81
    .line 82
    const-wide v3, 0x10000000000L

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    move-object/from16 v0, p0

    .line 88
    .line 89
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa5_0(JJJJJJ)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    return v1

    .line 94
    :pswitch_3
    const-wide/16 v7, 0x0

    .line 95
    .line 96
    const-wide/32 v11, 0x4000000

    .line 97
    .line 98
    .line 99
    const-wide/32 v3, 0x200000

    .line 100
    .line 101
    .line 102
    move-object/from16 v0, p0

    .line 103
    .line 104
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa5_0(JJJJJJ)I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    return v1

    .line 109
    :pswitch_4
    const-wide/32 v14, 0x80000

    .line 110
    .line 111
    .line 112
    and-long/2addr v14, v1

    .line 113
    cmp-long v4, v14, v7

    .line 114
    .line 115
    if-eqz v4, :cond_2

    .line 116
    .line 117
    const/16 v1, 0x13

    .line 118
    .line 119
    invoke-direct {v0, v3, v1, v13}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    return v1

    .line 124
    :cond_2
    and-long/2addr v11, v1

    .line 125
    cmp-long v4, v11, v7

    .line 126
    .line 127
    if-eqz v4, :cond_3

    .line 128
    .line 129
    const/16 v1, 0x1e

    .line 130
    .line 131
    invoke-direct {v0, v3, v1, v13}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    return v1

    .line 136
    :cond_3
    const-wide/high16 v11, 0x1000000000000L

    .line 137
    .line 138
    and-long/2addr v11, v1

    .line 139
    cmp-long v4, v11, v7

    .line 140
    .line 141
    if-eqz v4, :cond_4

    .line 142
    .line 143
    const/16 v1, 0x30

    .line 144
    .line 145
    invoke-direct {v0, v3, v1, v13}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    return v1

    .line 150
    :cond_4
    const-wide/high16 v7, 0x80000000000000L

    .line 151
    .line 152
    const-wide/16 v11, 0x800

    .line 153
    .line 154
    const-wide/high16 v3, 0x800000000000000L

    .line 155
    .line 156
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa5_0(JJJJJJ)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    return v1

    .line 161
    :pswitch_5
    const-wide/16 v11, 0x4000

    .line 162
    .line 163
    and-long/2addr v11, v1

    .line 164
    cmp-long v4, v11, v7

    .line 165
    .line 166
    if-eqz v4, :cond_5

    .line 167
    .line 168
    const/16 v1, 0xe

    .line 169
    .line 170
    invoke-direct {v0, v3, v1, v13}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    return v1

    .line 175
    :cond_5
    const-wide/16 v7, 0x0

    .line 176
    .line 177
    const-wide/16 v11, 0x0

    .line 178
    .line 179
    const-wide/high16 v3, 0x20000000000000L

    .line 180
    .line 181
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa5_0(JJJJJJ)I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    return v1

    .line 186
    :pswitch_6
    const-wide/16 v7, 0x0

    .line 187
    .line 188
    const-wide/16 v11, 0x0

    .line 189
    .line 190
    const-wide v3, 0x804800000800L

    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    move-object/from16 v0, p0

    .line 196
    .line 197
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa5_0(JJJJJJ)I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    return v1

    .line 202
    :pswitch_7
    and-long/2addr v11, v5

    .line 203
    cmp-long v4, v11, v7

    .line 204
    .line 205
    if-eqz v4, :cond_6

    .line 206
    .line 207
    const/16 v1, 0x5e

    .line 208
    .line 209
    invoke-direct {v0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    return v1

    .line 214
    :cond_6
    const-wide v11, 0x100000000L

    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    and-long/2addr v11, v5

    .line 220
    cmp-long v4, v11, v7

    .line 221
    .line 222
    if-eqz v4, :cond_8

    .line 223
    .line 224
    const/16 v1, 0x60

    .line 225
    .line 226
    invoke-direct {v0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    return v1

    .line 231
    :pswitch_8
    const-wide/16 v7, 0x0

    .line 232
    .line 233
    const-wide/16 v11, 0x0

    .line 234
    .line 235
    const-wide/32 v3, 0x4000000

    .line 236
    .line 237
    .line 238
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa5_0(JJJJJJ)I

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    return v1

    .line 243
    :pswitch_9
    const-wide/32 v11, 0x10000000

    .line 244
    .line 245
    .line 246
    and-long/2addr v11, v1

    .line 247
    cmp-long v4, v11, v7

    .line 248
    .line 249
    if-eqz v4, :cond_7

    .line 250
    .line 251
    const/16 v4, 0x1c

    .line 252
    .line 253
    iput v4, v0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 254
    .line 255
    iput v3, v0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 256
    .line 257
    :cond_7
    const-wide/16 v7, 0x0

    .line 258
    .line 259
    const-wide/16 v11, 0x0

    .line 260
    .line 261
    const-wide/32 v3, 0x20800000

    .line 262
    .line 263
    .line 264
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa5_0(JJJJJJ)I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    return v1

    .line 269
    :pswitch_a
    const-wide/16 v11, 0x2000

    .line 270
    .line 271
    and-long/2addr v11, v1

    .line 272
    cmp-long v4, v11, v7

    .line 273
    .line 274
    if-eqz v4, :cond_8

    .line 275
    .line 276
    const/16 v1, 0xd

    .line 277
    .line 278
    invoke-direct {v0, v3, v1, v13}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    return v1

    .line 283
    :cond_8
    :goto_0
    const/4 v3, 0x3

    .line 284
    move-object/from16 p1, v0

    .line 285
    .line 286
    move-wide/from16 p3, v1

    .line 287
    .line 288
    move/from16 p2, v3

    .line 289
    .line 290
    move-wide/from16 p5, v5

    .line 291
    .line 292
    move-wide/from16 p7, v9

    .line 293
    .line 294
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    return v0

    .line 299
    :pswitch_b
    const-wide/16 v7, 0x0

    .line 300
    .line 301
    const-wide/16 v11, 0x0

    .line 302
    .line 303
    const-wide v3, 0x2400000100000L

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    move-object/from16 v0, p0

    .line 309
    .line 310
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa5_0(JJJJJJ)I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    return v1

    .line 315
    :pswitch_c
    const-wide/32 v11, 0x20000

    .line 316
    .line 317
    .line 318
    and-long/2addr v11, v1

    .line 319
    cmp-long v4, v11, v7

    .line 320
    .line 321
    if-eqz v4, :cond_9

    .line 322
    .line 323
    const/16 v1, 0x11

    .line 324
    .line 325
    invoke-direct {v0, v3, v1, v13}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    return v1

    .line 330
    :cond_9
    const-wide/high16 v7, 0xa00000000000000L

    .line 331
    .line 332
    const-wide/32 v11, 0xa000

    .line 333
    .line 334
    .line 335
    const-wide/high16 v3, 0x10000000000000L

    .line 336
    .line 337
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa5_0(JJJJJJ)I

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    return v1

    .line 342
    :pswitch_d
    const-wide/32 v11, 0x8000000

    .line 343
    .line 344
    .line 345
    and-long/2addr v11, v1

    .line 346
    cmp-long v4, v11, v7

    .line 347
    .line 348
    if-eqz v4, :cond_a

    .line 349
    .line 350
    const/16 v1, 0x1b

    .line 351
    .line 352
    invoke-direct {v0, v3, v1, v13}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    return v1

    .line 357
    :cond_a
    const-wide/high16 v11, 0x2000000000000000L

    .line 358
    .line 359
    and-long/2addr v11, v1

    .line 360
    cmp-long v4, v11, v7

    .line 361
    .line 362
    if-eqz v4, :cond_b

    .line 363
    .line 364
    const/16 v1, 0x3d

    .line 365
    .line 366
    invoke-direct {v0, v3, v1, v13}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    return v1

    .line 371
    :cond_b
    const-wide/16 v7, 0x0

    .line 372
    .line 373
    const-wide/16 v11, 0x0

    .line 374
    .line 375
    const-wide v3, 0x200400001000L

    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa5_0(JJJJJJ)I

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    return v1

    .line 385
    :pswitch_e
    const-wide/16 v7, 0x0

    .line 386
    .line 387
    const-wide/16 v11, 0x0

    .line 388
    .line 389
    const-wide/high16 v3, 0xc000000000000L

    .line 390
    .line 391
    move-object/from16 v0, p0

    .line 392
    .line 393
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa5_0(JJJJJJ)I

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    return v1

    .line 398
    :pswitch_f
    const-wide/16 v7, 0x0

    .line 399
    .line 400
    const-wide/16 v11, 0x8

    .line 401
    .line 402
    const-wide v3, 0x181000000000L

    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    move-object/from16 v0, p0

    .line 408
    .line 409
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa5_0(JJJJJJ)I

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    return v1

    .line 414
    :pswitch_10
    const-wide/16 v7, 0x0

    .line 415
    .line 416
    const-wide/16 v11, 0x2a2

    .line 417
    .line 418
    const-wide/16 v3, 0x0

    .line 419
    .line 420
    move-object/from16 v0, p0

    .line 421
    .line 422
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa5_0(JJJJJJ)I

    .line 423
    .line 424
    .line 425
    move-result v1

    .line 426
    return v1

    .line 427
    :catch_0
    const/4 v0, 0x3

    .line 428
    move-object/from16 p1, p0

    .line 429
    .line 430
    move/from16 p2, v0

    .line 431
    .line 432
    move-wide/from16 p3, v1

    .line 433
    .line 434
    move-wide/from16 p5, v5

    .line 435
    .line 436
    move-wide/from16 p7, v9

    .line 437
    .line 438
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 439
    .line 440
    .line 441
    return v3

    .line 442
    nop

    .line 443
    :pswitch_data_0
    .packed-switch 0x5f
        :pswitch_10
        :pswitch_0
        :pswitch_f
        :pswitch_0
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_0
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private jjMoveStringLiteralDfa5_0(JJJJJJ)I
    .locals 14

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    and-long v9, p11, p9

    .line 8
    .line 9
    or-long/2addr v3, v9

    .line 10
    const-wide/16 v7, 0x0

    .line 11
    .line 12
    cmp-long v0, v3, v7

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    move-object v0, p0

    .line 18
    move-wide v2, p1

    .line 19
    move-wide/from16 v4, p5

    .line 20
    .line 21
    move-wide/from16 v6, p9

    .line 22
    .line 23
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    return v1

    .line 28
    :cond_0
    const/4 v3, 0x5

    .line 29
    :try_start_0
    iget-object v4, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 30
    .line 31
    invoke-virtual {v4}, Lbsh/JavaCharStream;->readChar()C

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iput v4, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    const/16 v11, 0x2a

    .line 38
    .line 39
    packed-switch v4, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    :pswitch_0
    goto/16 :goto_0

    .line 43
    .line 44
    :pswitch_1
    const-wide v12, 0x800000000L

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    and-long/2addr v12, v1

    .line 50
    cmp-long v4, v12, v7

    .line 51
    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    const/16 v1, 0x23

    .line 55
    .line 56
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    return v1

    .line 61
    :cond_1
    const-wide/high16 v7, 0xa00000000000000L

    .line 62
    .line 63
    const-wide/32 v11, 0xa000

    .line 64
    .line 65
    .line 66
    const-wide v3, 0x4100000000000L

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    move-object v0, p0

    .line 72
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa6_0(JJJJJJ)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    return v1

    .line 77
    :pswitch_2
    const-wide/high16 v12, 0x80000000000000L

    .line 78
    .line 79
    and-long/2addr v12, v1

    .line 80
    cmp-long v4, v12, v7

    .line 81
    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    const/16 v1, 0x37

    .line 85
    .line 86
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    return v1

    .line 91
    :cond_2
    const-wide/16 v7, 0x0

    .line 92
    .line 93
    const-wide/16 v11, 0x8

    .line 94
    .line 95
    const-wide/16 v3, 0x0

    .line 96
    .line 97
    move-object v0, p0

    .line 98
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa6_0(JJJJJJ)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    return v1

    .line 103
    :pswitch_3
    const-wide/16 v7, 0x0

    .line 104
    .line 105
    const-wide/16 v11, 0x0

    .line 106
    .line 107
    const-wide/high16 v3, 0x10000000000000L

    .line 108
    .line 109
    move-object v0, p0

    .line 110
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa6_0(JJJJJJ)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    return v1

    .line 115
    :pswitch_4
    const-wide v12, 0x800000000000L

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    and-long/2addr v12, v1

    .line 121
    cmp-long v4, v12, v7

    .line 122
    .line 123
    if-eqz v4, :cond_3

    .line 124
    .line 125
    const/16 v1, 0x2f

    .line 126
    .line 127
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    return v1

    .line 132
    :cond_3
    const-wide/16 v7, 0x0

    .line 133
    .line 134
    const-wide/16 v11, 0x0

    .line 135
    .line 136
    const-wide v3, 0x1000100000L

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    move-object v0, p0

    .line 142
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa6_0(JJJJJJ)I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    return v1

    .line 147
    :pswitch_5
    const-wide/16 v7, 0x0

    .line 148
    .line 149
    const-wide/16 v11, 0x0

    .line 150
    .line 151
    const-wide v3, 0x400000000L

    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    move-object v0, p0

    .line 157
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa6_0(JJJJJJ)I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    return v1

    .line 162
    :pswitch_6
    const-wide/16 v7, 0x0

    .line 163
    .line 164
    const-wide/32 v11, 0x4000000

    .line 165
    .line 166
    .line 167
    const-wide/32 v3, 0x20200000

    .line 168
    .line 169
    .line 170
    move-object v0, p0

    .line 171
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa6_0(JJJJJJ)I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    return v1

    .line 176
    :pswitch_7
    const-wide v7, 0x2a00000000000L

    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    const-wide/16 v11, 0x0

    .line 182
    .line 183
    const-wide/high16 v3, 0x820000000000000L

    .line 184
    .line 185
    move-object v0, p0

    .line 186
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa6_0(JJJJJJ)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    return v1

    .line 191
    :pswitch_8
    const-wide/high16 v12, 0x8000000000000L

    .line 192
    .line 193
    and-long/2addr v12, v1

    .line 194
    cmp-long v4, v12, v7

    .line 195
    .line 196
    if-eqz v4, :cond_5

    .line 197
    .line 198
    const/16 v1, 0x33

    .line 199
    .line 200
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    return v1

    .line 205
    :pswitch_9
    const-wide/16 v7, 0x0

    .line 206
    .line 207
    const-wide/16 v11, 0x0

    .line 208
    .line 209
    const-wide v3, 0x80000000000L

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    move-object v0, p0

    .line 215
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa6_0(JJJJJJ)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    return v1

    .line 220
    :pswitch_a
    const-wide/16 v7, 0x0

    .line 221
    .line 222
    const-wide/16 v11, 0x0

    .line 223
    .line 224
    const-wide v3, 0x4000000000L

    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    move-object v0, p0

    .line 230
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa6_0(JJJJJJ)I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    return v1

    .line 235
    :pswitch_b
    const-wide/32 v12, 0x800000

    .line 236
    .line 237
    .line 238
    and-long/2addr v12, v1

    .line 239
    cmp-long v4, v12, v7

    .line 240
    .line 241
    if-eqz v4, :cond_4

    .line 242
    .line 243
    const/16 v1, 0x17

    .line 244
    .line 245
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    return v1

    .line 250
    :cond_4
    const-wide v12, 0x10000000000L

    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    and-long/2addr v12, v1

    .line 256
    cmp-long v4, v12, v7

    .line 257
    .line 258
    if-eqz v4, :cond_5

    .line 259
    .line 260
    const/16 v1, 0x28

    .line 261
    .line 262
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    return v1

    .line 267
    :cond_5
    :goto_0
    const/4 v3, 0x4

    .line 268
    move-object p1, p0

    .line 269
    move-wide/from16 p3, v1

    .line 270
    .line 271
    move/from16 p2, v3

    .line 272
    .line 273
    move-wide/from16 p5, v5

    .line 274
    .line 275
    move-wide/from16 p7, v9

    .line 276
    .line 277
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    return v0

    .line 282
    :pswitch_c
    const-wide/16 v7, 0x0

    .line 283
    .line 284
    const-wide/16 v11, 0x0

    .line 285
    .line 286
    const-wide/32 v3, 0x4000000

    .line 287
    .line 288
    .line 289
    move-object v0, p0

    .line 290
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa6_0(JJJJJJ)I

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    return v1

    .line 295
    :pswitch_d
    const-wide v12, 0x400000000000L

    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    and-long/2addr v12, v1

    .line 301
    cmp-long v4, v12, v7

    .line 302
    .line 303
    if-eqz v4, :cond_6

    .line 304
    .line 305
    const/16 v1, 0x2e

    .line 306
    .line 307
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    return v1

    .line 312
    :cond_6
    const-wide/high16 v12, 0x2000000000000L

    .line 313
    .line 314
    and-long/2addr v12, v1

    .line 315
    cmp-long v4, v12, v7

    .line 316
    .line 317
    if-eqz v4, :cond_7

    .line 318
    .line 319
    const/16 v1, 0x31

    .line 320
    .line 321
    invoke-direct {p0, v3, v1, v11}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    return v1

    .line 326
    :cond_7
    const-wide/16 v7, 0x0

    .line 327
    .line 328
    const-wide/16 v11, 0x0

    .line 329
    .line 330
    const-wide v3, 0x200000000000L

    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    move-object v0, p0

    .line 336
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa6_0(JJJJJJ)I

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    return v1

    .line 341
    :pswitch_e
    const-wide/16 v7, 0x0

    .line 342
    .line 343
    const-wide/16 v11, 0x2a2

    .line 344
    .line 345
    const-wide/16 v3, 0x1800

    .line 346
    .line 347
    move-object v0, p0

    .line 348
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa6_0(JJJJJJ)I

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    return v1

    .line 353
    :pswitch_f
    const-wide/high16 v7, 0x80000000000000L

    .line 354
    .line 355
    const-wide/16 v11, 0x800

    .line 356
    .line 357
    const-wide/16 v3, 0x0

    .line 358
    .line 359
    move-object v0, p0

    .line 360
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa6_0(JJJJJJ)I

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    return v1

    .line 365
    :catch_0
    const/4 v0, 0x4

    .line 366
    move-object p1, p0

    .line 367
    move/from16 p2, v0

    .line 368
    .line 369
    move-wide/from16 p3, v1

    .line 370
    .line 371
    move-wide/from16 p5, v5

    .line 372
    .line 373
    move-wide/from16 p7, v9

    .line 374
    .line 375
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 376
    .line 377
    .line 378
    return v3

    .line 379
    :pswitch_data_0
    .packed-switch 0x5f
        :pswitch_f
        :pswitch_0
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private jjMoveStringLiteralDfa6_0(JJJJJJ)I
    .locals 15

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    and-long v9, p11, p9

    .line 8
    .line 9
    or-long/2addr v3, v9

    .line 10
    const-wide/16 v7, 0x0

    .line 11
    .line 12
    cmp-long v0, v3, v7

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    move-object v0, p0

    .line 18
    move-wide/from16 v2, p1

    .line 19
    .line 20
    move-wide/from16 v4, p5

    .line 21
    .line 22
    move-wide/from16 v6, p9

    .line 23
    .line 24
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    return v1

    .line 29
    :cond_0
    const/4 v3, 0x6

    .line 30
    :try_start_0
    iget-object v4, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 31
    .line 32
    invoke-virtual {v4}, Lbsh/JavaCharStream;->readChar()C

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    iput v4, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    const/16 v11, 0x5f

    .line 39
    .line 40
    if-eq v4, v11, :cond_e

    .line 41
    .line 42
    const/16 v11, 0x61

    .line 43
    .line 44
    if-eq v4, v11, :cond_d

    .line 45
    .line 46
    const/16 v11, 0x63

    .line 47
    .line 48
    if-eq v4, v11, :cond_c

    .line 49
    .line 50
    const/16 v11, 0x6c

    .line 51
    .line 52
    if-eq v4, v11, :cond_b

    .line 53
    .line 54
    const/16 v11, 0x79

    .line 55
    .line 56
    const/16 v12, 0x2a

    .line 57
    .line 58
    if-eq v4, v11, :cond_9

    .line 59
    .line 60
    const/16 v11, 0x65

    .line 61
    .line 62
    if-eq v4, v11, :cond_6

    .line 63
    .line 64
    const/16 v11, 0x66

    .line 65
    .line 66
    if-eq v4, v11, :cond_5

    .line 67
    .line 68
    const/16 v11, 0x6e

    .line 69
    .line 70
    if-eq v4, v11, :cond_4

    .line 71
    .line 72
    const/16 v11, 0x6f

    .line 73
    .line 74
    if-eq v4, v11, :cond_3

    .line 75
    .line 76
    packed-switch v4, :pswitch_data_0

    .line 77
    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :pswitch_0
    const-wide/16 v7, 0x0

    .line 82
    .line 83
    const-wide/16 v11, 0x0

    .line 84
    .line 85
    const-wide/32 v3, 0x100000

    .line 86
    .line 87
    .line 88
    move-object v0, p0

    .line 89
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa7_0(JJJJJJ)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    return v1

    .line 94
    :pswitch_1
    const-wide/32 v11, 0x200000

    .line 95
    .line 96
    .line 97
    and-long/2addr v11, v1

    .line 98
    cmp-long v4, v11, v7

    .line 99
    .line 100
    if-eqz v4, :cond_1

    .line 101
    .line 102
    const/16 v4, 0x15

    .line 103
    .line 104
    iput v4, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 105
    .line 106
    iput v3, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 107
    .line 108
    :cond_1
    const-wide/16 v7, 0x0

    .line 109
    .line 110
    const-wide/32 v11, 0x4000000

    .line 111
    .line 112
    .line 113
    const-wide v3, 0x200000000000L

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    move-object v0, p0

    .line 119
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa7_0(JJJJJJ)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    return v1

    .line 124
    :pswitch_2
    const-wide/32 v13, 0x4000000

    .line 125
    .line 126
    .line 127
    and-long/2addr v13, v1

    .line 128
    cmp-long v4, v13, v7

    .line 129
    .line 130
    if-eqz v4, :cond_2

    .line 131
    .line 132
    const/16 v1, 0x1a

    .line 133
    .line 134
    invoke-direct {p0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    return v1

    .line 139
    :cond_2
    const-wide v7, 0x82a00000000000L

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    const-wide/16 v11, 0xaaa

    .line 145
    .line 146
    const-wide/16 v3, 0x0

    .line 147
    .line 148
    move-object v0, p0

    .line 149
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa7_0(JJJJJJ)I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    return v1

    .line 154
    :cond_3
    const-wide/16 v7, 0x0

    .line 155
    .line 156
    const-wide/16 v11, 0x0

    .line 157
    .line 158
    const-wide/high16 v3, 0x10000000000000L

    .line 159
    .line 160
    move-object v0, p0

    .line 161
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa7_0(JJJJJJ)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    return v1

    .line 166
    :cond_4
    const-wide/16 v13, 0x1000

    .line 167
    .line 168
    and-long/2addr v13, v1

    .line 169
    cmp-long v4, v13, v7

    .line 170
    .line 171
    if-eqz v4, :cond_a

    .line 172
    .line 173
    const/16 v1, 0xc

    .line 174
    .line 175
    invoke-direct {p0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    return v1

    .line 180
    :cond_5
    const-wide/16 v7, 0x0

    .line 181
    .line 182
    const-wide/16 v11, 0x0

    .line 183
    .line 184
    const-wide/high16 v3, 0x4000000000000L

    .line 185
    .line 186
    move-object v0, p0

    .line 187
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa7_0(JJJJJJ)I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    return v1

    .line 192
    :cond_6
    const-wide v13, 0x80000000000L

    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    and-long/2addr v13, v1

    .line 198
    cmp-long v4, v13, v7

    .line 199
    .line 200
    if-eqz v4, :cond_7

    .line 201
    .line 202
    const/16 v1, 0x2b

    .line 203
    .line 204
    invoke-direct {p0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    return v1

    .line 209
    :cond_7
    const-wide v13, 0x100000000000L

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    and-long/2addr v13, v1

    .line 215
    cmp-long v4, v13, v7

    .line 216
    .line 217
    if-eqz v4, :cond_8

    .line 218
    .line 219
    const/16 v1, 0x2c

    .line 220
    .line 221
    invoke-direct {p0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    return v1

    .line 226
    :cond_8
    const-wide/16 v7, 0x0

    .line 227
    .line 228
    const-wide/16 v11, 0x0

    .line 229
    .line 230
    const-wide v3, 0x20000400000000L

    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    move-object v0, p0

    .line 236
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa7_0(JJJJJJ)I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    return v1

    .line 241
    :cond_9
    const-wide/32 v13, 0x20000000

    .line 242
    .line 243
    .line 244
    and-long/2addr v13, v1

    .line 245
    cmp-long v4, v13, v7

    .line 246
    .line 247
    if-eqz v4, :cond_a

    .line 248
    .line 249
    const/16 v1, 0x1d

    .line 250
    .line 251
    invoke-direct {p0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    return v1

    .line 256
    :cond_a
    :goto_0
    const/4 v3, 0x5

    .line 257
    move-object/from16 p1, p0

    .line 258
    .line 259
    move-wide/from16 p3, v1

    .line 260
    .line 261
    move/from16 p2, v3

    .line 262
    .line 263
    move-wide/from16 p5, v5

    .line 264
    .line 265
    move-wide/from16 p7, v9

    .line 266
    .line 267
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    return v0

    .line 272
    :cond_b
    const-wide/16 v7, 0x0

    .line 273
    .line 274
    const-wide/16 v11, 0x0

    .line 275
    .line 276
    const-wide/high16 v3, 0x800000000000000L

    .line 277
    .line 278
    move-object v0, p0

    .line 279
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa7_0(JJJJJJ)I

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    return v1

    .line 284
    :cond_c
    const-wide/16 v7, 0x0

    .line 285
    .line 286
    const-wide/16 v11, 0x0

    .line 287
    .line 288
    const-wide v3, 0x1000000800L

    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    move-object v0, p0

    .line 294
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa7_0(JJJJJJ)I

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    return v1

    .line 299
    :cond_d
    const-wide/16 v7, 0x0

    .line 300
    .line 301
    const-wide/16 v11, 0x0

    .line 302
    .line 303
    const-wide v3, 0x4000000000L

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    move-object v0, p0

    .line 309
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa7_0(JJJJJJ)I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    return v1

    .line 314
    :cond_e
    const-wide/high16 v7, 0xa00000000000000L

    .line 315
    .line 316
    const-wide/32 v11, 0xa000

    .line 317
    .line 318
    .line 319
    const-wide/16 v3, 0x0

    .line 320
    .line 321
    move-object v0, p0

    .line 322
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa7_0(JJJJJJ)I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    return v1

    .line 327
    :catch_0
    const/4 v0, 0x5

    .line 328
    move-object/from16 p1, p0

    .line 329
    .line 330
    move/from16 p2, v0

    .line 331
    .line 332
    move-wide/from16 p3, v1

    .line 333
    .line 334
    move-wide/from16 p5, v5

    .line 335
    .line 336
    move-wide/from16 p7, v9

    .line 337
    .line 338
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 339
    .line 340
    .line 341
    return v3

    .line 342
    nop

    .line 343
    :pswitch_data_0
    .packed-switch 0x73
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private jjMoveStringLiteralDfa7_0(JJJJJJ)I
    .locals 15

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    and-long v9, p11, p9

    .line 8
    .line 9
    or-long/2addr v3, v9

    .line 10
    const-wide/16 v7, 0x0

    .line 11
    .line 12
    cmp-long v0, v3, v7

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    move-object v0, p0

    .line 18
    move-wide/from16 v2, p1

    .line 19
    .line 20
    move-wide/from16 v4, p5

    .line 21
    .line 22
    move-wide/from16 v6, p9

    .line 23
    .line 24
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    return v1

    .line 29
    :cond_0
    const/4 v3, 0x7

    .line 30
    :try_start_0
    iget-object v4, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 31
    .line 32
    invoke-virtual {v4}, Lbsh/JavaCharStream;->readChar()C

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    iput v4, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    const/16 v11, 0x3a

    .line 39
    .line 40
    if-eq v4, v11, :cond_9

    .line 41
    .line 42
    const/16 v11, 0x63

    .line 43
    .line 44
    if-eq v4, v11, :cond_8

    .line 45
    .line 46
    const/16 v11, 0x65

    .line 47
    .line 48
    const/16 v12, 0x2a

    .line 49
    .line 50
    if-eq v4, v11, :cond_5

    .line 51
    .line 52
    const/16 v11, 0x6e

    .line 53
    .line 54
    if-eq v4, v11, :cond_4

    .line 55
    .line 56
    const/16 v11, 0x70

    .line 57
    .line 58
    if-eq v4, v11, :cond_3

    .line 59
    .line 60
    const/16 v11, 0x68

    .line 61
    .line 62
    if-eq v4, v11, :cond_2

    .line 63
    .line 64
    const/16 v11, 0x69

    .line 65
    .line 66
    if-eq v4, v11, :cond_1

    .line 67
    .line 68
    packed-switch v4, :pswitch_data_0

    .line 69
    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :pswitch_0
    const-wide/high16 v7, 0x800000000000000L

    .line 74
    .line 75
    const-wide/32 v11, 0x8000

    .line 76
    .line 77
    .line 78
    const-wide/16 v3, 0x0

    .line 79
    .line 80
    move-object v0, p0

    .line 81
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa8_0(JJJJJJ)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    return v1

    .line 86
    :pswitch_1
    const-wide/16 v13, 0x800

    .line 87
    .line 88
    and-long/2addr v13, v1

    .line 89
    cmp-long v4, v13, v7

    .line 90
    .line 91
    if-eqz v4, :cond_a

    .line 92
    .line 93
    const/16 v1, 0xb

    .line 94
    .line 95
    invoke-direct {p0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    return v1

    .line 100
    :pswitch_2
    const-wide/high16 v7, 0x200000000000000L

    .line 101
    .line 102
    const-wide/16 v11, 0x22a2

    .line 103
    .line 104
    const-wide/16 v3, 0x0

    .line 105
    .line 106
    move-object v0, p0

    .line 107
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa8_0(JJJJJJ)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    return v1

    .line 112
    :cond_1
    const-wide/16 v7, 0x0

    .line 113
    .line 114
    const-wide/16 v11, 0x8

    .line 115
    .line 116
    const-wide/16 v3, 0x0

    .line 117
    .line 118
    move-object v0, p0

    .line 119
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa8_0(JJJJJJ)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    return v1

    .line 124
    :cond_2
    const-wide/high16 v7, 0x80000000000000L

    .line 125
    .line 126
    const-wide/16 v11, 0x800

    .line 127
    .line 128
    const-wide/16 v3, 0x0

    .line 129
    .line 130
    move-object v0, p0

    .line 131
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa8_0(JJJJJJ)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    return v1

    .line 136
    :cond_3
    const-wide/high16 v13, 0x4000000000000L

    .line 137
    .line 138
    and-long/2addr v13, v1

    .line 139
    cmp-long v4, v13, v7

    .line 140
    .line 141
    if-eqz v4, :cond_a

    .line 142
    .line 143
    const/16 v1, 0x32

    .line 144
    .line 145
    invoke-direct {p0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    return v1

    .line 150
    :cond_4
    const-wide/16 v7, 0x0

    .line 151
    .line 152
    const-wide/16 v11, 0x0

    .line 153
    .line 154
    const-wide v3, 0x30000400000000L

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    move-object v0, p0

    .line 160
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa8_0(JJJJJJ)I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    return v1

    .line 165
    :cond_5
    const-wide/32 v13, 0x100000

    .line 166
    .line 167
    .line 168
    and-long/2addr v13, v1

    .line 169
    cmp-long v4, v13, v7

    .line 170
    .line 171
    if-eqz v4, :cond_6

    .line 172
    .line 173
    const/16 v1, 0x14

    .line 174
    .line 175
    invoke-direct {p0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    return v1

    .line 180
    :cond_6
    const-wide/high16 v13, 0x800000000000000L

    .line 181
    .line 182
    and-long/2addr v13, v1

    .line 183
    cmp-long v4, v13, v7

    .line 184
    .line 185
    if-eqz v4, :cond_7

    .line 186
    .line 187
    const/16 v1, 0x3b

    .line 188
    .line 189
    invoke-direct {p0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    return v1

    .line 194
    :cond_7
    const-wide v7, 0x2a00000000000L

    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    const-wide/16 v11, 0x0

    .line 200
    .line 201
    const-wide v3, 0x201000000000L

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    move-object v0, p0

    .line 207
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa8_0(JJJJJJ)I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    return v1

    .line 212
    :cond_8
    const-wide/16 v7, 0x0

    .line 213
    .line 214
    const-wide/16 v11, 0x0

    .line 215
    .line 216
    const-wide v3, 0x4000000000L

    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    move-object v0, p0

    .line 222
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa8_0(JJJJJJ)I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    return v1

    .line 227
    :cond_9
    const-wide/32 v11, 0x4000000

    .line 228
    .line 229
    .line 230
    and-long/2addr v11, v9

    .line 231
    cmp-long v4, v11, v7

    .line 232
    .line 233
    if-eqz v4, :cond_a

    .line 234
    .line 235
    const/16 v1, 0x9a

    .line 236
    .line 237
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    return v1

    .line 242
    :cond_a
    :goto_0
    const/4 v3, 0x6

    .line 243
    move-object/from16 p1, p0

    .line 244
    .line 245
    move-wide/from16 p3, v1

    .line 246
    .line 247
    move/from16 p2, v3

    .line 248
    .line 249
    move-wide/from16 p5, v5

    .line 250
    .line 251
    move-wide/from16 p7, v9

    .line 252
    .line 253
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    return v0

    .line 258
    :catch_0
    const/4 v0, 0x6

    .line 259
    move-object/from16 p1, p0

    .line 260
    .line 261
    move/from16 p2, v0

    .line 262
    .line 263
    move-wide/from16 p3, v1

    .line 264
    .line 265
    move-wide/from16 p5, v5

    .line 266
    .line 267
    move-wide/from16 p7, v9

    .line 268
    .line 269
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 270
    .line 271
    .line 272
    return v3

    .line 273
    :pswitch_data_0
    .packed-switch 0x73
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private jjMoveStringLiteralDfa8_0(JJJJJJ)I
    .locals 17

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    and-long v9, p11, p9

    .line 8
    .line 9
    or-long/2addr v3, v9

    .line 10
    const-wide/16 v7, 0x0

    .line 11
    .line 12
    cmp-long v0, v3, v7

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x6

    .line 17
    move-object/from16 v0, p0

    .line 18
    .line 19
    move-wide/from16 v2, p1

    .line 20
    .line 21
    move-wide/from16 v4, p5

    .line 22
    .line 23
    move-wide/from16 v6, p9

    .line 24
    .line 25
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    return v1

    .line 30
    :cond_0
    move-object/from16 v0, p0

    .line 31
    .line 32
    const/16 v3, 0x8

    .line 33
    .line 34
    :try_start_0
    iget-object v4, v0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 35
    .line 36
    invoke-virtual {v4}, Lbsh/JavaCharStream;->readChar()C

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    iput v4, v0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    const/16 v11, 0x5f

    .line 43
    .line 44
    if-eq v4, v11, :cond_8

    .line 45
    .line 46
    const/16 v11, 0x74

    .line 47
    .line 48
    const/16 v12, 0x2a

    .line 49
    .line 50
    if-eq v4, v11, :cond_6

    .line 51
    .line 52
    const/16 v11, 0x64

    .line 53
    .line 54
    if-eq v4, v11, :cond_4

    .line 55
    .line 56
    const/16 v11, 0x65

    .line 57
    .line 58
    if-eq v4, v11, :cond_3

    .line 59
    .line 60
    const/16 v3, 0x6e

    .line 61
    .line 62
    if-eq v4, v3, :cond_2

    .line 63
    .line 64
    const/16 v3, 0x6f

    .line 65
    .line 66
    if-eq v4, v3, :cond_1

    .line 67
    .line 68
    packed-switch v4, :pswitch_data_0

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :pswitch_0
    const-wide/high16 v7, 0x80000000000000L

    .line 73
    .line 74
    const-wide/16 v11, 0xaa2

    .line 75
    .line 76
    const-wide/high16 v3, 0x10000000000000L

    .line 77
    .line 78
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa9_0(JJJJJJ)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    return v1

    .line 83
    :pswitch_1
    const-wide/high16 v7, 0x200000000000000L

    .line 84
    .line 85
    const-wide/16 v11, 0x2000

    .line 86
    .line 87
    const-wide/16 v3, 0x0

    .line 88
    .line 89
    move-object/from16 v0, p0

    .line 90
    .line 91
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa9_0(JJJJJJ)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    return v1

    .line 96
    :pswitch_2
    const-wide/16 v7, 0x0

    .line 97
    .line 98
    const-wide/16 v11, 0x8

    .line 99
    .line 100
    const-wide/16 v3, 0x0

    .line 101
    .line 102
    move-object/from16 v0, p0

    .line 103
    .line 104
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa9_0(JJJJJJ)I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    return v1

    .line 109
    :cond_1
    const-wide/16 v7, 0x0

    .line 110
    .line 111
    const-wide/16 v11, 0x0

    .line 112
    .line 113
    const-wide v3, 0x1000000000L

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    move-object/from16 v0, p0

    .line 119
    .line 120
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa9_0(JJJJJJ)I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    return v1

    .line 125
    :cond_2
    const-wide/high16 v7, 0x800000000000000L

    .line 126
    .line 127
    const-wide/32 v11, 0x8000

    .line 128
    .line 129
    .line 130
    const-wide/16 v3, 0x0

    .line 131
    .line 132
    move-object/from16 v0, p0

    .line 133
    .line 134
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa9_0(JJJJJJ)I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    return v1

    .line 139
    :cond_3
    const-wide v13, 0x4000000000L

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    and-long/2addr v13, v1

    .line 145
    cmp-long v4, v13, v7

    .line 146
    .line 147
    if-eqz v4, :cond_5

    .line 148
    .line 149
    const/16 v1, 0x26

    .line 150
    .line 151
    invoke-direct {v0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    return v1

    .line 156
    :cond_4
    const-wide v13, 0x200000000000L

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    and-long/2addr v13, v1

    .line 162
    cmp-long v4, v13, v7

    .line 163
    .line 164
    if-eqz v4, :cond_5

    .line 165
    .line 166
    const/16 v1, 0x2d

    .line 167
    .line 168
    invoke-direct {v0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    return v1

    .line 173
    :cond_5
    :goto_0
    const/4 v3, 0x7

    .line 174
    move-object/from16 p1, v0

    .line 175
    .line 176
    move-wide/from16 p3, v1

    .line 177
    .line 178
    move/from16 p2, v3

    .line 179
    .line 180
    move-wide/from16 p5, v5

    .line 181
    .line 182
    move-wide/from16 p7, v9

    .line 183
    .line 184
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    move-object/from16 v1, p1

    .line 189
    .line 190
    return v0

    .line 191
    :cond_6
    move-wide v13, v9

    .line 192
    move-wide v9, v5

    .line 193
    move-wide v4, v1

    .line 194
    move-object v1, v0

    .line 195
    const-wide/high16 v15, 0x20000000000000L

    .line 196
    .line 197
    and-long/2addr v15, v4

    .line 198
    cmp-long v0, v15, v7

    .line 199
    .line 200
    if-eqz v0, :cond_7

    .line 201
    .line 202
    const/16 v0, 0x35

    .line 203
    .line 204
    invoke-direct {v1, v3, v0, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    return v0

    .line 209
    :cond_7
    const-wide/16 v7, 0x0

    .line 210
    .line 211
    const-wide/16 v11, 0x0

    .line 212
    .line 213
    move-wide v1, v4

    .line 214
    const-wide v3, 0x400000000L

    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    move-object/from16 v0, p0

    .line 220
    .line 221
    move-wide v5, v9

    .line 222
    move-wide v9, v13

    .line 223
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa9_0(JJJJJJ)I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    return v1

    .line 228
    :cond_8
    const-wide v7, 0x2a00000000000L

    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    const-wide/16 v11, 0x0

    .line 234
    .line 235
    const-wide/16 v3, 0x0

    .line 236
    .line 237
    move-object/from16 v0, p0

    .line 238
    .line 239
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa9_0(JJJJJJ)I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    return v1

    .line 244
    :catch_0
    const/4 v0, 0x7

    .line 245
    move-object/from16 p1, p0

    .line 246
    .line 247
    move/from16 p2, v0

    .line 248
    .line 249
    move-wide/from16 p3, v1

    .line 250
    .line 251
    move-wide/from16 p5, v5

    .line 252
    .line 253
    move-wide/from16 p7, v9

    .line 254
    .line 255
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 256
    .line 257
    .line 258
    return v3

    .line 259
    :pswitch_data_0
    .packed-switch 0x67
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private jjMoveStringLiteralDfa9_0(JJJJJJ)I
    .locals 15

    .line 1
    and-long v1, p3, p1

    .line 2
    .line 3
    and-long v5, p7, p5

    .line 4
    .line 5
    or-long v3, v1, v5

    .line 6
    .line 7
    and-long v9, p11, p9

    .line 8
    .line 9
    or-long/2addr v3, v9

    .line 10
    const-wide/16 v7, 0x0

    .line 11
    .line 12
    cmp-long v0, v3, v7

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x7

    .line 17
    move-object v0, p0

    .line 18
    move-wide/from16 v2, p1

    .line 19
    .line 20
    move-wide/from16 v4, p5

    .line 21
    .line 22
    move-wide/from16 v6, p9

    .line 23
    .line 24
    invoke-direct/range {v0 .. v7}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    return v1

    .line 29
    :cond_0
    const/16 v3, 0x9

    .line 30
    .line 31
    :try_start_0
    iget-object v4, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 32
    .line 33
    invoke-virtual {v4}, Lbsh/JavaCharStream;->readChar()C

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    iput v4, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    const/16 v11, 0x61

    .line 40
    .line 41
    if-eq v4, v11, :cond_c

    .line 42
    .line 43
    const/16 v11, 0x69

    .line 44
    .line 45
    if-eq v4, v11, :cond_b

    .line 46
    .line 47
    const/16 v11, 0x73

    .line 48
    .line 49
    const/16 v12, 0x2a

    .line 50
    .line 51
    if-eq v4, v11, :cond_9

    .line 52
    .line 53
    const/16 v11, 0x78

    .line 54
    .line 55
    if-eq v4, v11, :cond_8

    .line 56
    .line 57
    const/16 v11, 0x7a

    .line 58
    .line 59
    if-eq v4, v11, :cond_7

    .line 60
    .line 61
    const/16 v11, 0x66

    .line 62
    .line 63
    if-eq v4, v11, :cond_5

    .line 64
    .line 65
    const/16 v11, 0x67

    .line 66
    .line 67
    if-eq v4, v11, :cond_4

    .line 68
    .line 69
    const/16 v11, 0x6e

    .line 70
    .line 71
    if-eq v4, v11, :cond_2

    .line 72
    .line 73
    const/16 v3, 0x6f

    .line 74
    .line 75
    if-eq v4, v3, :cond_1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    const-wide v7, 0x800000000000L

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    const-wide/16 v11, 0x0

    .line 84
    .line 85
    const-wide/16 v3, 0x0

    .line 86
    .line 87
    move-object v0, p0

    .line 88
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa10_0(JJJJJJ)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    return v1

    .line 93
    :cond_2
    const-wide/16 v11, 0x8

    .line 94
    .line 95
    and-long/2addr v11, v9

    .line 96
    cmp-long v4, v11, v7

    .line 97
    .line 98
    if-eqz v4, :cond_3

    .line 99
    .line 100
    const/16 v1, 0x83

    .line 101
    .line 102
    invoke-direct {p0, v3, v1}, Lbsh/ParserTokenManager;->jjStopAtPos(II)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    return v1

    .line 107
    :cond_3
    :goto_0
    const/16 v3, 0x8

    .line 108
    .line 109
    move-object/from16 p1, p0

    .line 110
    .line 111
    move-wide/from16 p3, v1

    .line 112
    .line 113
    move/from16 p2, v3

    .line 114
    .line 115
    move-wide/from16 p5, v5

    .line 116
    .line 117
    move-wide/from16 p7, v9

    .line 118
    .line 119
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStartNfa_0(IJJJ)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    return v0

    .line 124
    :cond_4
    const-wide/16 v7, 0x0

    .line 125
    .line 126
    const-wide/16 v11, 0x2a2

    .line 127
    .line 128
    const-wide/16 v3, 0x0

    .line 129
    .line 130
    move-object v0, p0

    .line 131
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa10_0(JJJJJJ)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    return v1

    .line 136
    :cond_5
    const-wide v13, 0x1000000000L

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    and-long/2addr v13, v1

    .line 142
    cmp-long v4, v13, v7

    .line 143
    .line 144
    if-eqz v4, :cond_6

    .line 145
    .line 146
    const/16 v1, 0x24

    .line 147
    .line 148
    invoke-direct {p0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    return v1

    .line 153
    :cond_6
    const-wide/high16 v7, 0x80000000000000L

    .line 154
    .line 155
    const-wide/16 v11, 0x800

    .line 156
    .line 157
    const-wide/16 v3, 0x0

    .line 158
    .line 159
    move-object v0, p0

    .line 160
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa10_0(JJJJJJ)I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    return v1

    .line 165
    :cond_7
    const-wide/16 v7, 0x0

    .line 166
    .line 167
    const-wide/16 v11, 0x0

    .line 168
    .line 169
    const-wide/high16 v3, 0x10000000000000L

    .line 170
    .line 171
    move-object v0, p0

    .line 172
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa10_0(JJJJJJ)I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    return v1

    .line 177
    :cond_8
    const-wide/high16 v7, 0x2000000000000L

    .line 178
    .line 179
    const-wide/16 v11, 0x0

    .line 180
    .line 181
    const-wide/16 v3, 0x0

    .line 182
    .line 183
    move-object v0, p0

    .line 184
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa10_0(JJJJJJ)I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    return v1

    .line 189
    :cond_9
    const-wide v13, 0x400000000L

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    and-long/2addr v13, v1

    .line 195
    cmp-long v4, v13, v7

    .line 196
    .line 197
    if-eqz v4, :cond_a

    .line 198
    .line 199
    const/16 v1, 0x22

    .line 200
    .line 201
    invoke-direct {p0, v3, v1, v12}, Lbsh/ParserTokenManager;->jjStartNfaWithStates_0(III)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    return v1

    .line 206
    :cond_a
    const-wide/high16 v7, 0x800000000000000L

    .line 207
    .line 208
    const-wide/32 v11, 0x8000

    .line 209
    .line 210
    .line 211
    const-wide/16 v3, 0x0

    .line 212
    .line 213
    move-object v0, p0

    .line 214
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa10_0(JJJJJJ)I

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    return v1

    .line 219
    :cond_b
    const-wide/high16 v7, 0x200000000000000L

    .line 220
    .line 221
    const-wide/16 v11, 0x2000

    .line 222
    .line 223
    const-wide/16 v3, 0x0

    .line 224
    .line 225
    move-object v0, p0

    .line 226
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa10_0(JJJJJJ)I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    return v1

    .line 231
    :cond_c
    const-wide v7, 0x200000000000L

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    const-wide/16 v11, 0x0

    .line 237
    .line 238
    const-wide/16 v3, 0x0

    .line 239
    .line 240
    move-object v0, p0

    .line 241
    invoke-direct/range {v0 .. v12}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa10_0(JJJJJJ)I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    return v1

    .line 246
    :catch_0
    const/16 v0, 0x8

    .line 247
    .line 248
    move-object/from16 p1, p0

    .line 249
    .line 250
    move/from16 p2, v0

    .line 251
    .line 252
    move-wide/from16 p3, v1

    .line 253
    .line 254
    move-wide/from16 p5, v5

    .line 255
    .line 256
    move-wide/from16 p7, v9

    .line 257
    .line 258
    invoke-direct/range {p1 .. p8}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 259
    .line 260
    .line 261
    return v3
.end method

.method private jjStartNfaWithStates_0(III)I
    .locals 0

    .line 1
    iput p2, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 2
    .line 3
    iput p1, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 4
    .line 5
    :try_start_0
    iget-object p2, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 6
    .line 7
    invoke-virtual {p2}, Lbsh/JavaCharStream;->readChar()C

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    iput p2, p0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    add-int/lit8 p1, p1, 0x1

    .line 14
    .line 15
    invoke-direct {p0, p3, p1}, Lbsh/ParserTokenManager;->jjMoveNfa_0(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :catch_0
    add-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    return p1
.end method

.method private final jjStartNfa_0(IJJJ)I
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lbsh/ParserTokenManager;->jjStopStringLiteralDfa_0(IJJJ)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    move p3, p1

    .line 6
    move-object p1, p0

    .line 7
    add-int/lit8 p3, p3, 0x1

    .line 8
    .line 9
    invoke-direct {p0, p2, p3}, Lbsh/ParserTokenManager;->jjMoveNfa_0(II)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    return p2
.end method

.method private jjStopAtPos(II)I
    .locals 0

    .line 1
    iput p2, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 2
    .line 3
    iput p1, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    return p1
.end method

.method private final jjStopStringLiteralDfa_0(IJJJ)I
    .locals 10

    .line 1
    const/16 v0, 0x50

    .line 2
    .line 3
    const-wide/high16 v1, 0x10000000000000L

    .line 4
    .line 5
    const-wide/32 v3, 0x4000000

    .line 6
    .line 7
    .line 8
    const/16 v5, 0x49

    .line 9
    .line 10
    const/4 v6, -0x1

    .line 11
    const/16 v7, 0x2a

    .line 12
    .line 13
    const-wide/16 v8, 0x0

    .line 14
    .line 15
    packed-switch p1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    return v6

    .line 19
    :pswitch_0
    and-long p1, p2, v1

    .line 20
    .line 21
    cmp-long p1, p1, v8

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    return v7

    .line 26
    :cond_0
    return v6

    .line 27
    :pswitch_1
    and-long p1, p2, v1

    .line 28
    .line 29
    cmp-long p1, p1, v8

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    iget p1, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 34
    .line 35
    const/16 p2, 0xa

    .line 36
    .line 37
    if-eq p1, p2, :cond_1

    .line 38
    .line 39
    iput v5, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 40
    .line 41
    iput p2, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 42
    .line 43
    :cond_1
    return v7

    .line 44
    :cond_2
    return v6

    .line 45
    :pswitch_2
    const-wide p4, 0x1400000000L

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    and-long/2addr p4, p2

    .line 51
    cmp-long p1, p4, v8

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    return v7

    .line 56
    :cond_3
    and-long p1, p2, v1

    .line 57
    .line 58
    cmp-long p1, p1, v8

    .line 59
    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    iput v5, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 63
    .line 64
    const/16 p1, 0x9

    .line 65
    .line 66
    iput p1, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 67
    .line 68
    return v7

    .line 69
    :cond_4
    return v6

    .line 70
    :pswitch_3
    const-wide p4, 0x20204000000000L

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr p4, p2

    .line 76
    cmp-long p1, p4, v8

    .line 77
    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    return v7

    .line 81
    :cond_5
    const-wide p4, 0x10001400000000L

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    and-long p1, p2, p4

    .line 87
    .line 88
    cmp-long p1, p1, v8

    .line 89
    .line 90
    if-eqz p1, :cond_6

    .line 91
    .line 92
    iput v5, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 93
    .line 94
    const/16 p1, 0x8

    .line 95
    .line 96
    iput p1, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 97
    .line 98
    return v7

    .line 99
    :cond_6
    return v6

    .line 100
    :pswitch_4
    const-wide p4, 0x804000000100800L

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    and-long/2addr p4, p2

    .line 106
    cmp-long p1, p4, v8

    .line 107
    .line 108
    if-eqz p1, :cond_7

    .line 109
    .line 110
    return v7

    .line 111
    :cond_7
    const-wide p4, 0x30205400000000L

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    and-long p1, p2, p4

    .line 117
    .line 118
    cmp-long p1, p1, v8

    .line 119
    .line 120
    if-eqz p1, :cond_8

    .line 121
    .line 122
    iput v5, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 123
    .line 124
    const/4 p1, 0x7

    .line 125
    iput p1, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 126
    .line 127
    return v7

    .line 128
    :cond_8
    return v6

    .line 129
    :pswitch_5
    const-wide p4, 0x180024201000L

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    and-long/2addr p4, p2

    .line 135
    cmp-long p1, p4, v8

    .line 136
    .line 137
    if-nez p1, :cond_c

    .line 138
    .line 139
    and-long p4, p6, v3

    .line 140
    .line 141
    cmp-long p1, p4, v8

    .line 142
    .line 143
    if-eqz p1, :cond_9

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_9
    const-wide p4, 0x834205400100800L

    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    and-long p1, p2, p4

    .line 152
    .line 153
    cmp-long p1, p1, v8

    .line 154
    .line 155
    if-eqz p1, :cond_b

    .line 156
    .line 157
    iget p1, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 158
    .line 159
    const/4 p2, 0x6

    .line 160
    if-eq p1, p2, :cond_a

    .line 161
    .line 162
    iput v5, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 163
    .line 164
    iput p2, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 165
    .line 166
    :cond_a
    return v7

    .line 167
    :cond_b
    return v6

    .line 168
    :cond_c
    :goto_0
    return v7

    .line 169
    :pswitch_6
    const-wide p4, 0x834385424301800L

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    and-long/2addr p4, p2

    .line 175
    cmp-long p1, p4, v8

    .line 176
    .line 177
    if-nez p1, :cond_f

    .line 178
    .line 179
    and-long p4, p6, v3

    .line 180
    .line 181
    cmp-long p1, p4, v8

    .line 182
    .line 183
    if-eqz p1, :cond_d

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_d
    const-wide p4, 0x8ac10800800000L

    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    and-long p1, p2, p4

    .line 192
    .line 193
    cmp-long p1, p1, v8

    .line 194
    .line 195
    if-eqz p1, :cond_e

    .line 196
    .line 197
    return v7

    .line 198
    :cond_e
    return v6

    .line 199
    :cond_f
    :goto_1
    iput v5, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 200
    .line 201
    const/4 p1, 0x5

    .line 202
    iput p1, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 203
    .line 204
    return v7

    .line 205
    :pswitch_7
    const-wide p4, 0x20c10000780a6000L    # 6.491742504685056E-151

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    and-long/2addr p4, p2

    .line 211
    cmp-long p1, p4, v8

    .line 212
    .line 213
    if-eqz p1, :cond_10

    .line 214
    .line 215
    return v7

    .line 216
    :cond_10
    const-wide p4, 0x83ef95c04b01800L

    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    and-long p1, p2, p4

    .line 222
    .line 223
    cmp-long p1, p1, v8

    .line 224
    .line 225
    if-nez p1, :cond_12

    .line 226
    .line 227
    and-long p1, p6, v3

    .line 228
    .line 229
    cmp-long p1, p1, v8

    .line 230
    .line 231
    if-eqz p1, :cond_11

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_11
    return v6

    .line 235
    :cond_12
    :goto_2
    iget p1, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 236
    .line 237
    const/4 p2, 0x4

    .line 238
    if-eq p1, p2, :cond_13

    .line 239
    .line 240
    iput v5, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 241
    .line 242
    iput p2, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 243
    .line 244
    :cond_13
    return v7

    .line 245
    :pswitch_8
    const-wide p4, 0x1500048103058000L

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    and-long/2addr p4, p2

    .line 251
    cmp-long p1, p4, v8

    .line 252
    .line 253
    if-eqz p1, :cond_14

    .line 254
    .line 255
    return v7

    .line 256
    :cond_14
    const-wide p4, 0x28fff95c7cba7800L

    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    and-long p1, p2, p4

    .line 262
    .line 263
    cmp-long p1, p1, v8

    .line 264
    .line 265
    if-nez p1, :cond_16

    .line 266
    .line 267
    and-long p1, p6, v3

    .line 268
    .line 269
    cmp-long p1, p1, v8

    .line 270
    .line 271
    if-eqz p1, :cond_15

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_15
    return v6

    .line 275
    :cond_16
    :goto_3
    iget p1, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 276
    .line 277
    const/4 p2, 0x3

    .line 278
    if-eq p1, p2, :cond_17

    .line 279
    .line 280
    iput v5, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 281
    .line 282
    iput p2, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 283
    .line 284
    :cond_17
    return v7

    .line 285
    :pswitch_9
    const-wide p4, 0x200026080000000L

    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    and-long/2addr p4, p2

    .line 291
    cmp-long p1, p4, v8

    .line 292
    .line 293
    if-eqz p1, :cond_18

    .line 294
    .line 295
    return v7

    .line 296
    :cond_18
    const-wide p4, 0x3dfffd9d7fbff800L    # 4.655257288594862E-10

    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    and-long p1, p2, p4

    .line 302
    .line 303
    cmp-long p1, p1, v8

    .line 304
    .line 305
    if-nez p1, :cond_1a

    .line 306
    .line 307
    and-long p1, p6, v3

    .line 308
    .line 309
    cmp-long p1, p1, v8

    .line 310
    .line 311
    if-eqz p1, :cond_19

    .line 312
    .line 313
    goto :goto_4

    .line 314
    :cond_19
    return v6

    .line 315
    :cond_1a
    :goto_4
    iget p1, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 316
    .line 317
    const/4 p2, 0x2

    .line 318
    if-eq p1, p2, :cond_1b

    .line 319
    .line 320
    iput v5, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 321
    .line 322
    iput p2, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 323
    .line 324
    :cond_1b
    return v7

    .line 325
    :pswitch_a
    const-wide/high16 v1, 0x40000000000000L

    .line 326
    .line 327
    and-long/2addr p4, v1

    .line 328
    cmp-long p1, p4, v8

    .line 329
    .line 330
    if-nez p1, :cond_21

    .line 331
    .line 332
    const-wide/16 p4, 0x400

    .line 333
    .line 334
    and-long p4, p6, p4

    .line 335
    .line 336
    cmp-long p1, p4, v8

    .line 337
    .line 338
    if-eqz p1, :cond_1c

    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_1c
    const-wide p4, 0x200c00000L

    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    and-long/2addr p4, p2

    .line 347
    cmp-long p1, p4, v8

    .line 348
    .line 349
    if-eqz p1, :cond_1d

    .line 350
    .line 351
    return v7

    .line 352
    :cond_1d
    const-wide p4, 0x3ffffffdff3ff800L    # 1.9999980898569447

    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    and-long p1, p2, p4

    .line 358
    .line 359
    cmp-long p1, p1, v8

    .line 360
    .line 361
    if-nez p1, :cond_1f

    .line 362
    .line 363
    and-long p1, p6, v3

    .line 364
    .line 365
    cmp-long p1, p1, v8

    .line 366
    .line 367
    if-eqz p1, :cond_1e

    .line 368
    .line 369
    goto :goto_5

    .line 370
    :cond_1e
    return v6

    .line 371
    :cond_1f
    :goto_5
    iget p1, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 372
    .line 373
    const/4 p2, 0x1

    .line 374
    if-eq p1, p2, :cond_20

    .line 375
    .line 376
    iput v5, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 377
    .line 378
    iput p2, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 379
    .line 380
    :cond_20
    return v7

    .line 381
    :cond_21
    :goto_6
    return v0

    .line 382
    :pswitch_b
    const-wide v1, 0x40000021000000L

    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    and-long/2addr v1, p4

    .line 388
    cmp-long p1, v1, v8

    .line 389
    .line 390
    if-nez p1, :cond_29

    .line 391
    .line 392
    const-wide/32 v1, 0x20400

    .line 393
    .line 394
    .line 395
    and-long v1, p6, v1

    .line 396
    .line 397
    cmp-long p1, v1, v8

    .line 398
    .line 399
    if-eqz p1, :cond_22

    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_22
    const-wide/32 v0, 0x100000

    .line 403
    .line 404
    .line 405
    and-long/2addr v0, p4

    .line 406
    cmp-long p1, v0, v8

    .line 407
    .line 408
    if-nez p1, :cond_28

    .line 409
    .line 410
    const-wide/32 v0, 0x1000000

    .line 411
    .line 412
    .line 413
    and-long v0, p6, v0

    .line 414
    .line 415
    cmp-long p1, v0, v8

    .line 416
    .line 417
    if-eqz p1, :cond_23

    .line 418
    .line 419
    goto :goto_8

    .line 420
    :cond_23
    const-wide v0, -0x7ffff80000000000L    # -4.345847379897E-311

    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    and-long/2addr p4, v0

    .line 426
    cmp-long p1, p4, v8

    .line 427
    .line 428
    if-eqz p1, :cond_24

    .line 429
    .line 430
    const/16 p1, 0x45

    .line 431
    .line 432
    return p1

    .line 433
    :cond_24
    const-wide p4, 0x3ffffffffffff800L    # 1.9999999999995453

    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    and-long/2addr p4, p2

    .line 439
    cmp-long p1, p4, v8

    .line 440
    .line 441
    if-nez p1, :cond_27

    .line 442
    .line 443
    and-long p4, p6, v3

    .line 444
    .line 445
    cmp-long p1, p4, v8

    .line 446
    .line 447
    if-eqz p1, :cond_25

    .line 448
    .line 449
    goto :goto_7

    .line 450
    :cond_25
    const-wide/16 p4, 0x3e

    .line 451
    .line 452
    and-long p1, p2, p4

    .line 453
    .line 454
    cmp-long p1, p1, v8

    .line 455
    .line 456
    if-eqz p1, :cond_26

    .line 457
    .line 458
    const/4 p1, 0x0

    .line 459
    return p1

    .line 460
    :cond_26
    return v6

    .line 461
    :cond_27
    :goto_7
    iput v5, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 462
    .line 463
    return v7

    .line 464
    :cond_28
    :goto_8
    const/16 p1, 0x12

    .line 465
    .line 466
    return p1

    .line 467
    :cond_29
    :goto_9
    return v0

    .line 468
    nop

    .line 469
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


# virtual methods
.method public MoreLexicalActions()V
    .locals 2

    .line 1
    iget v0, p0, Lbsh/ParserTokenManager;->jjimageLen:I

    .line 2
    .line 3
    iget v1, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x1

    .line 6
    .line 7
    iput v1, p0, Lbsh/ParserTokenManager;->lengthOfMatch:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    iput v0, p0, Lbsh/ParserTokenManager;->jjimageLen:I

    .line 11
    .line 12
    return-void
.end method

.method public ReInit(Lbsh/JavaCharStream;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lbsh/ParserTokenManager;->jjnewStateCnt:I

    .line 3
    .line 4
    iput v0, p0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 5
    .line 6
    iget v0, p0, Lbsh/ParserTokenManager;->defaultLexState:I

    .line 7
    .line 8
    iput v0, p0, Lbsh/ParserTokenManager;->curLexState:I

    .line 9
    .line 10
    iput-object p1, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 11
    .line 12
    invoke-direct {p0}, Lbsh/ParserTokenManager;->ReInitRounds()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public ReInit(Lbsh/JavaCharStream;I)V
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Lbsh/ParserTokenManager;->ReInit(Lbsh/JavaCharStream;)V

    .line 17
    invoke-virtual {p0, p2}, Lbsh/ParserTokenManager;->SwitchTo(I)V

    return-void
.end method

.method public SkipLexicalActions(Lbsh/Token;)V
    .locals 0

    .line 1
    return-void
.end method

.method public SwitchTo(I)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ge p1, v0, :cond_0

    .line 3
    .line 4
    if-ltz p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lbsh/ParserTokenManager;->curLexState:I

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Lbsh/TokenMgrException;

    .line 10
    .line 11
    const-string v1, "Error: Ignoring invalid lexical state : "

    .line 12
    .line 13
    const-string v2, ". State unchanged."

    .line 14
    .line 15
    invoke-static {p1, v1, v2}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p1, v1}, Lbsh/TokenMgrException;-><init>(Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public TokenLexicalActions(Lbsh/Token;)V
    .locals 0

    .line 1
    return-void
.end method

.method public getNextToken()Lbsh/Token;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move-object v3, v2

    .line 7
    :cond_0
    :goto_0
    const/4 v4, 0x0

    .line 8
    :try_start_0
    iget-object v5, v0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 9
    .line 10
    invoke-virtual {v5}, Lbsh/JavaCharStream;->beginToken()C

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    iput v5, v0, Lbsh/ParserTokenManager;->curChar:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 15
    .line 16
    const v5, 0x7fffffff

    .line 17
    .line 18
    .line 19
    iput v5, v0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 20
    .line 21
    iput v4, v0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 22
    .line 23
    invoke-direct {v0}, Lbsh/ParserTokenManager;->jjMoveStringLiteralDfa0_0()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    iget v7, v0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 28
    .line 29
    const/4 v8, 0x1

    .line 30
    if-eq v7, v5, :cond_4

    .line 31
    .line 32
    iget v4, v0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 33
    .line 34
    add-int/lit8 v5, v4, 0x1

    .line 35
    .line 36
    if-ge v5, v6, :cond_1

    .line 37
    .line 38
    iget-object v5, v0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 39
    .line 40
    sub-int/2addr v6, v4

    .line 41
    sub-int/2addr v6, v8

    .line 42
    invoke-virtual {v5, v6}, Lbsh/AbstractCharStream;->backup(I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    sget-object v4, Lbsh/ParserTokenManager;->jjtoToken:[J

    .line 46
    .line 47
    iget v5, v0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 48
    .line 49
    shr-int/lit8 v6, v5, 0x6

    .line 50
    .line 51
    aget-wide v6, v4, v6

    .line 52
    .line 53
    and-int/lit8 v4, v5, 0x3f

    .line 54
    .line 55
    const-wide/16 v8, 0x1

    .line 56
    .line 57
    shl-long v10, v8, v4

    .line 58
    .line 59
    and-long/2addr v6, v10

    .line 60
    const-wide/16 v10, 0x0

    .line 61
    .line 62
    cmp-long v4, v6, v10

    .line 63
    .line 64
    if-eqz v4, :cond_2

    .line 65
    .line 66
    invoke-virtual {v0}, Lbsh/ParserTokenManager;->jjFillToken()Lbsh/Token;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iput-object v3, v1, Lbsh/Token;->specialToken:Lbsh/Token;

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_2
    sget-object v4, Lbsh/ParserTokenManager;->jjtoSpecial:[J

    .line 74
    .line 75
    shr-int/lit8 v6, v5, 0x6

    .line 76
    .line 77
    aget-wide v6, v4, v6

    .line 78
    .line 79
    and-int/lit8 v4, v5, 0x3f

    .line 80
    .line 81
    shl-long v4, v8, v4

    .line 82
    .line 83
    and-long/2addr v4, v6

    .line 84
    cmp-long v4, v4, v10

    .line 85
    .line 86
    if-eqz v4, :cond_0

    .line 87
    .line 88
    invoke-virtual {v0}, Lbsh/ParserTokenManager;->jjFillToken()Lbsh/Token;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    if-nez v3, :cond_3

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    iput-object v3, v4, Lbsh/Token;->specialToken:Lbsh/Token;

    .line 96
    .line 97
    iput-object v4, v3, Lbsh/Token;->next:Lbsh/Token;

    .line 98
    .line 99
    :goto_1
    move-object v3, v4

    .line 100
    goto :goto_0

    .line 101
    :cond_4
    iget-object v3, v0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 102
    .line 103
    invoke-virtual {v3}, Lbsh/AbstractCharStream;->getEndLine()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    iget-object v5, v0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 108
    .line 109
    invoke-virtual {v5}, Lbsh/AbstractCharStream;->getEndColumn()I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    :try_start_1
    iget-object v7, v0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 114
    .line 115
    invoke-virtual {v7}, Lbsh/JavaCharStream;->readChar()C

    .line 116
    .line 117
    .line 118
    iget-object v7, v0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 119
    .line 120
    invoke-virtual {v7, v8}, Lbsh/AbstractCharStream;->backup(I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 121
    .line 122
    .line 123
    move v12, v3

    .line 124
    move v10, v4

    .line 125
    move v13, v5

    .line 126
    goto :goto_5

    .line 127
    :catch_0
    if-gt v6, v8, :cond_5

    .line 128
    .line 129
    move-object v2, v1

    .line 130
    goto :goto_2

    .line 131
    :cond_5
    iget-object v2, v0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 132
    .line 133
    invoke-virtual {v2}, Lbsh/AbstractCharStream;->getImage()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    :goto_2
    iget v7, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 138
    .line 139
    const/16 v9, 0xa

    .line 140
    .line 141
    if-eq v7, v9, :cond_7

    .line 142
    .line 143
    const/16 v9, 0xd

    .line 144
    .line 145
    if-ne v7, v9, :cond_6

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_6
    add-int/lit8 v4, v5, 0x1

    .line 149
    .line 150
    :goto_3
    move v12, v3

    .line 151
    move v13, v4

    .line 152
    move v10, v8

    .line 153
    goto :goto_5

    .line 154
    :cond_7
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :goto_5
    if-nez v10, :cond_9

    .line 158
    .line 159
    iget-object v2, v0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 160
    .line 161
    invoke-virtual {v2, v8}, Lbsh/AbstractCharStream;->backup(I)V

    .line 162
    .line 163
    .line 164
    if-gt v6, v8, :cond_8

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_8
    iget-object v1, v0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 168
    .line 169
    invoke-virtual {v1}, Lbsh/AbstractCharStream;->getImage()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    :goto_6
    move-object v14, v1

    .line 174
    goto :goto_7

    .line 175
    :cond_9
    move-object v14, v2

    .line 176
    :goto_7
    new-instance v9, Lbsh/TokenMgrException;

    .line 177
    .line 178
    iget v11, v0, Lbsh/ParserTokenManager;->curLexState:I

    .line 179
    .line 180
    iget v15, v0, Lbsh/ParserTokenManager;->curChar:I

    .line 181
    .line 182
    const/16 v16, 0x0

    .line 183
    .line 184
    invoke-direct/range {v9 .. v16}, Lbsh/TokenMgrException;-><init>(ZIIILjava/lang/String;II)V

    .line 185
    .line 186
    .line 187
    throw v9

    .line 188
    :catch_1
    iput v4, v0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 189
    .line 190
    const/4 v1, -0x1

    .line 191
    iput v1, v0, Lbsh/ParserTokenManager;->jjmatchedPos:I

    .line 192
    .line 193
    invoke-virtual {v0}, Lbsh/ParserTokenManager;->jjFillToken()Lbsh/Token;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    iput-object v3, v1, Lbsh/Token;->specialToken:Lbsh/Token;

    .line 198
    .line 199
    return-object v1
.end method

.method public jjFillToken()Lbsh/Token;
    .locals 7

    .line 1
    sget-object v0, Lbsh/ParserTokenManager;->jjstrLiteralImages:[Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 4
    .line 5
    aget-object v0, v0, v1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 10
    .line 11
    invoke-virtual {v0}, Lbsh/AbstractCharStream;->getImage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    iget-object v1, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 16
    .line 17
    invoke-virtual {v1}, Lbsh/AbstractCharStream;->getBeginLine()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 22
    .line 23
    invoke-virtual {v2}, Lbsh/AbstractCharStream;->getBeginColumn()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iget-object v3, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 28
    .line 29
    invoke-virtual {v3}, Lbsh/AbstractCharStream;->getEndLine()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    iget-object v4, p0, Lbsh/ParserTokenManager;->input_stream:Lbsh/JavaCharStream;

    .line 34
    .line 35
    invoke-virtual {v4}, Lbsh/AbstractCharStream;->getEndColumn()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    iget v5, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 40
    .line 41
    invoke-static {v5}, Lbsh/Token;->newToken(I)Lbsh/Token;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    iget v6, p0, Lbsh/ParserTokenManager;->jjmatchedKind:I

    .line 46
    .line 47
    iput v6, v5, Lbsh/Token;->kind:I

    .line 48
    .line 49
    iput-object v0, v5, Lbsh/Token;->image:Ljava/lang/String;

    .line 50
    .line 51
    iput v1, v5, Lbsh/Token;->beginLine:I

    .line 52
    .line 53
    iput v3, v5, Lbsh/Token;->endLine:I

    .line 54
    .line 55
    iput v2, v5, Lbsh/Token;->beginColumn:I

    .line 56
    .line 57
    iput v4, v5, Lbsh/Token;->endColumn:I

    .line 58
    .line 59
    return-object v5
.end method
