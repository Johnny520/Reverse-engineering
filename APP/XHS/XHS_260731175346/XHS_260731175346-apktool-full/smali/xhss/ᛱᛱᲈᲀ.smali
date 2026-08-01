.class public final synthetic Lxhss/ᛱᛱᲈᲀ;
.super Ljava/lang/Object;

# interfaces
.implements Lxhss/ᛷᛴᛲᛲ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xc

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᛱᛱᲈᲀ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final native ᛷᛴᛷᛱ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method private final native ᛸᛴᛶᛳ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method private final native ᲀᲇᛳᲁ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method private final native ᲇᛶᛴᲀ(Ljava/lang/Object;)Ljava/lang/Object;
.end method


# virtual methods
.method public final ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lxhss/ᛱᛱᲈᲀ;->ᛱᛱᛲᲇ:I

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    const/16 v3, 0x17

    .line 8
    .line 9
    const/16 v4, 0x20

    .line 10
    .line 11
    const/16 v6, 0x40

    .line 12
    .line 13
    const-wide v7, -0xfd001b858845L

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const-wide v9, -0xfce91b858845L

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const-wide v11, -0xfcf11b858845L

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const/4 v13, 0x1

    .line 29
    const/4 v14, 0x0

    .line 30
    const/4 v15, 0x0

    .line 31
    packed-switch v1, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    move-object/from16 v0, p1

    .line 35
    .line 36
    check-cast v0, Lxhss/ᛸᲀᲇᛱ;

    .line 37
    .line 38
    const-wide v1, -0x1192c1b858845L

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    sget-object v1, Lxhss/ᛳᛱᛲᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛱᛲᛲ;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lxhss/ᛳᛱᛲᛲ;->ᛷᛵᛵᲈ()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    invoke-virtual {v0, v15}, Lxhss/ᛸᲀᲇᛱ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 61
    .line 62
    return-object v0

    .line 63
    :pswitch_0
    move-object/from16 v0, p1

    .line 64
    .line 65
    check-cast v0, Lxhss/ᛵᛴᛲᛵ;

    .line 66
    .line 67
    const-wide v1, -0x118f81b858845L

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    iget-object v0, v0, Lxhss/ᛵᛴᛲᛵ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 76
    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 80
    .line 81
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    sput-object v1, Lxhss/ᲈᛵᲈᛶ;->ᛳᲈᲈᛲ:Ljava/lang/ref/WeakReference;

    .line 85
    .line 86
    :cond_1
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_1
    move-object/from16 v0, p1

    .line 90
    .line 91
    check-cast v0, Lxhss/ᛸᲀᲇᛱ;

    .line 92
    .line 93
    const-wide v1, -0x118a21b858845L

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    iget-object v0, v0, Lxhss/ᛸᲀᲇᛱ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 102
    .line 103
    sput-object v0, Lxhss/ᛶᲈᛴᛲ;->ᲇᛸᛳᲁ:Ljava/lang/Object;

    .line 104
    .line 105
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 106
    .line 107
    return-object v0

    .line 108
    :pswitch_2
    move-object/from16 v0, p1

    .line 109
    .line 110
    check-cast v0, Landroid/view/View;

    .line 111
    .line 112
    const-wide v1, -0x119661b858845L

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    const-wide v1, -0x119691b858845L

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    return-object v0

    .line 146
    :pswitch_3
    move-object/from16 v0, p1

    .line 147
    .line 148
    check-cast v0, Lxhss/ᛵᛴᛲᛵ;

    .line 149
    .line 150
    const-wide v0, -0x119151b858845L

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    sget-object v0, Lxhss/ᲈᛵᲈᛶ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛵᲈᛶ;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-static {}, Lxhss/ᲈᛵᲈᛶ;->ᲁᛴᛴᛸ()V

    .line 164
    .line 165
    .line 166
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 167
    .line 168
    return-object v0

    .line 169
    :pswitch_4
    invoke-direct/range {p0 .. p1}, Lxhss/ᛱᛱᲈᲀ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    return-object v0

    .line 174
    :pswitch_5
    invoke-direct/range {p0 .. p1}, Lxhss/ᛱᛱᲈᲀ;->ᲀᲇᛳᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    return-object v0

    .line 179
    :pswitch_6
    move-object/from16 v0, p1

    .line 180
    .line 181
    check-cast v0, Landroid/view/View;

    .line 182
    .line 183
    const-wide v1, -0x123a31b858845L

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    const-wide v1, -0x123a61b858845L

    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    return-object v0

    .line 217
    :pswitch_7
    move-object/from16 v0, p1

    .line 218
    .line 219
    check-cast v0, Lxhss/ᛵᛴᛲᛵ;

    .line 220
    .line 221
    sget-object v1, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 222
    .line 223
    const-wide v2, -0x123321b858845L

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    iget-object v2, v0, Lxhss/ᛵᛴᛲᛵ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 238
    .line 239
    if-eqz v3, :cond_2

    .line 240
    .line 241
    move-object v15, v2

    .line 242
    check-cast v15, Landroid/view/ViewGroup;

    .line 243
    .line 244
    :cond_2
    if-nez v15, :cond_3

    .line 245
    .line 246
    goto/16 :goto_0

    .line 247
    .line 248
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    const-wide v5, -0x1233e1b858845L

    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v15}, Landroid/view/ViewGroup;->getChildCount()I

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-static {v2}, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    sget-object v2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 283
    .line 284
    iget-object v3, v0, Lxhss/ᛵᛴᛲᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 285
    .line 286
    const-wide v4, -0x123521b858845L

    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-static {v3, v4}, Lxhss/ᲇᲁᛱᛸ;->ᲇᛸᛳᲁ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    iget-object v0, v0, Lxhss/ᛵᛴᛲᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 303
    .line 304
    const-wide v3, -0x1235d1b858845L

    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    invoke-static {v0, v3}, Lxhss/ᲇᲁᛱᛸ;->ᲇᛸᛳᲁ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    new-instance v3, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    const-wide v4, -0x123671b858845L

    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    invoke-static {v2}, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    new-instance v2, Ljava/lang/StringBuilder;

    .line 342
    .line 343
    const-wide v3, -0x123801b858845L

    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-static {v0}, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    const-wide v2, -0xdf771b858845L

    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-static {v15, v0, v14}, Lxhss/ᛶᲈᛴᛲ;->ᛶᲇᲈᛸ(Landroid/view/View;Ljava/lang/String;I)V

    .line 375
    .line 376
    .line 377
    :goto_0
    return-object v1

    .line 378
    :pswitch_8
    move-object/from16 v0, p1

    .line 379
    .line 380
    check-cast v0, Lxhss/ᛵᛴᛲᛵ;

    .line 381
    .line 382
    const-wide v1, -0x124691b858845L

    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    iget-object v1, v0, Lxhss/ᛵᛴᛲᛵ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 391
    .line 392
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-static {v1, v2}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    if-eqz v1, :cond_4

    .line 405
    .line 406
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 407
    .line 408
    iput-object v1, v0, Lxhss/ᛵᛴᛲᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 409
    .line 410
    :cond_4
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 411
    .line 412
    return-object v0

    .line 413
    :pswitch_9
    invoke-direct/range {p0 .. p1}, Lxhss/ᛱᛱᲈᲀ;->ᲇᛶᛴᲀ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    return-object v0

    .line 418
    :pswitch_a
    move-object/from16 v0, p1

    .line 419
    .line 420
    check-cast v0, Lxhss/ᛵᛴᛲᛵ;

    .line 421
    .line 422
    sget-object v1, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 423
    .line 424
    const-wide v2, -0x128c71b858845L

    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    iget-object v0, v0, Lxhss/ᛵᛴᛲᛵ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 433
    .line 434
    instance-of v2, v0, Landroid/app/Activity;

    .line 435
    .line 436
    if-eqz v2, :cond_5

    .line 437
    .line 438
    move-object v15, v0

    .line 439
    check-cast v15, Landroid/app/Activity;

    .line 440
    .line 441
    :cond_5
    if-nez v15, :cond_6

    .line 442
    .line 443
    goto :goto_1

    .line 444
    :cond_6
    invoke-virtual {v15}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    new-instance v2, Lxhss/ᛳᛶᲈᛲ;

    .line 453
    .line 454
    invoke-direct {v2, v13, v15}, Lxhss/ᛳᛶᲈᛲ;-><init>(ILjava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 458
    .line 459
    .line 460
    :goto_1
    return-object v1

    .line 461
    :pswitch_b
    invoke-direct/range {p0 .. p1}, Lxhss/ᛱᛱᲈᲀ;->ᛷᛴᛷᛱ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    return-object v0

    .line 466
    :pswitch_c
    move-object/from16 v0, p1

    .line 467
    .line 468
    check-cast v0, Lxhss/ᛵᛴᛲᛵ;

    .line 469
    .line 470
    const-wide v0, -0x1084d1b858845L

    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    invoke-static {}, Lxhss/ᲁᛵᛸᛳ;->ᛸᛲᲀᛵ()Lxhss/ᲀᛴᛳᛸ;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    iget-object v1, v0, Lxhss/ᲀᛴᛳᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v1, Ljava/lang/String;

    .line 485
    .line 486
    iget-object v0, v0, Lxhss/ᲀᛴᛳᛸ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v0, Ljava/lang/String;

    .line 489
    .line 490
    sget-object v2, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 491
    .line 492
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ()Lcom/tencent/mmkv/MMKV;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    const-wide v4, -0x108591b858845L

    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v4

    .line 508
    invoke-virtual {v2, v4, v1}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 509
    .line 510
    .line 511
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ()Lcom/tencent/mmkv/MMKV;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    const-wide v4, -0x1085f1b858845L

    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    invoke-virtual {v1, v2, v0}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 525
    .line 526
    .line 527
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ()Lcom/tencent/mmkv/MMKV;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    const-wide v1, -0x108681b858845L

    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    invoke-static {}, Lxhss/ᲁᛵᛸᛳ;->ᛸᛴᛶᛳ()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    invoke-virtual {v0, v1, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 545
    .line 546
    .line 547
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    const-wide v1, -0x108781b858845L

    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    sget-object v2, Lxhss/ᲇᲀᛳᛸ;->ᲇᛴᲇᛵ:Lxhss/ᲇᲀᛳᛸ;

    .line 561
    .line 562
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    sget-object v2, Lxhss/ᲇᲀᛳᛸ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 566
    .line 567
    invoke-virtual {v0, v1, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 568
    .line 569
    .line 570
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    const-wide v1, -0x1087d1b858845L

    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    invoke-virtual {v0, v1, v3}, Lcom/tencent/mmkv/MMKV;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 584
    .line 585
    .line 586
    sget-boolean v0, Lxhss/ᲈᲀᲀᛱ;->ᲀᲇᛳᲁ:Z

    .line 587
    .line 588
    if-eqz v0, :cond_7

    .line 589
    .line 590
    sput-boolean v14, Lxhss/ᲈᲀᲀᛱ;->ᲀᲇᛳᲁ:Z

    .line 591
    .line 592
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 593
    .line 594
    .line 595
    move-result-wide v0

    .line 596
    sget-wide v2, Lxhss/ᲇᲀᛳᛸ;->ᲀᲇᛳᲁ:J

    .line 597
    .line 598
    sub-long/2addr v0, v2

    .line 599
    sput-wide v0, Lxhss/ᲈᲀᲀᛱ;->ᲇᛶᛴᲀ:J

    .line 600
    .line 601
    new-instance v0, Ljava/lang/StringBuilder;

    .line 602
    .line 603
    const-wide v1, -0x1088f1b858845L

    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    sget-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᲇᛶᛴᲀ:J

    .line 616
    .line 617
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    const-wide v1, -0x108961b858845L

    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    sget-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 633
    .line 634
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    const-wide v1, -0x1089f1b858845L

    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    sget-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 650
    .line 651
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    new-instance v1, Lxhss/ᛵᛴᲀᛸ;

    .line 659
    .line 660
    invoke-direct {v1}, Lxhss/ᛵᛴᲀᛸ;-><init>()V

    .line 661
    .line 662
    .line 663
    iput-object v0, v1, Lxhss/ᛵᛴᲀᛸ;->ᛷᛵᛵᲈ:Ljava/lang/CharSequence;

    .line 664
    .line 665
    invoke-static {v1}, Lxhss/ᲀᲈᛵᛸ;->ᲁᛴᲇᛲ(Lxhss/ᛵᛴᲀᛸ;)V

    .line 666
    .line 667
    .line 668
    :cond_7
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 669
    .line 670
    return-object v0

    .line 671
    :pswitch_d
    move-object/from16 v0, p1

    .line 672
    .line 673
    check-cast v0, Lxhss/ᛸᲀᲇᛱ;

    .line 674
    .line 675
    sget-object v1, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 676
    .line 677
    const-wide v2, -0x135491b858845L

    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    sget-object v2, Lxhss/ᛳᛱᛲᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛱᛲᛲ;

    .line 686
    .line 687
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    invoke-static {}, Lxhss/ᛳᛱᛲᛲ;->ᛱᛱᛲᲇ()Z

    .line 691
    .line 692
    .line 693
    move-result v2

    .line 694
    if-nez v2, :cond_8

    .line 695
    .line 696
    goto :goto_2

    .line 697
    :cond_8
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 698
    .line 699
    invoke-virtual {v0, v2}, Lxhss/ᛸᲀᲇᛱ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    :goto_2
    return-object v1

    .line 703
    :pswitch_e
    move-object/from16 v0, p1

    .line 704
    .line 705
    check-cast v0, Lxhss/ᛸᲀᲇᛱ;

    .line 706
    .line 707
    sget-object v1, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 708
    .line 709
    const-wide v2, -0x135251b858845L

    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    sget-object v2, Lxhss/ᛳᛱᛲᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛱᛲᛲ;

    .line 718
    .line 719
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 720
    .line 721
    .line 722
    invoke-static {}, Lxhss/ᛳᛱᛲᛲ;->ᛱᛱᛲᲇ()Z

    .line 723
    .line 724
    .line 725
    move-result v2

    .line 726
    if-nez v2, :cond_9

    .line 727
    .line 728
    goto :goto_3

    .line 729
    :cond_9
    iget-object v2, v0, Lxhss/ᛸᲀᲇᛱ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 730
    .line 731
    invoke-static {v2}, Lxhss/ᛷᲇᛵᛳ;->ᛱᲈᛳᛴ(Ljava/util/List;)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v2

    .line 735
    if-eqz v2, :cond_a

    .line 736
    .line 737
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v15

    .line 741
    :cond_a
    const-wide v2, -0x135321b858845L

    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    invoke-static {v15, v2}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 751
    .line 752
    .line 753
    move-result v2

    .line 754
    if-eqz v2, :cond_b

    .line 755
    .line 756
    invoke-virtual {v0, v1}, Lxhss/ᛸᲀᲇᛱ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    :cond_b
    :goto_3
    return-object v1

    .line 760
    :pswitch_f
    move-object/from16 v0, p1

    .line 761
    .line 762
    check-cast v0, Lxhss/ᛵᛴᛲᛵ;

    .line 763
    .line 764
    const-wide v1, -0x1346d1b858845L

    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    sget-object v1, Lxhss/ᲁᲁᲀᲇ;->ᲇᛴᲇᛵ:Ljava/util/ArrayList;

    .line 773
    .line 774
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 775
    .line 776
    .line 777
    sget v1, Lxhss/ᲇᲀᛵᲁ;->ᛷᛵᛵᲈ:I

    .line 778
    .line 779
    iget-object v0, v0, Lxhss/ᛵᛴᛲᛵ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 780
    .line 781
    invoke-static {v0}, Lxhss/ᲀᲈᛵᛸ;->ᲈᛲᛵᲁ(Ljava/lang/Object;)Lxhss/ᲇᛵᛲᲁ;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    invoke-virtual {v0}, Lxhss/ᲇᛵᛲᲁ;->ᛳᲈᲈᛲ()Lxhss/ᛷᛴᲀᛳ;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    const-wide v1, -0x1347d1b858845L

    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    iput-object v1, v0, Lxhss/ᛵᛷᛴᲁ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 799
    .line 800
    invoke-virtual {v0}, Lxhss/ᛵᛷᛴᲁ;->ᛱᛱᛲᲇ()V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v0}, Lxhss/ᛷᛴᲀᛳ;->ᛳᲁᲇᛸ()Ljava/util/List;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    invoke-static {v0}, Lxhss/ᛷᲇᛵᛳ;->ᛵᛷᛲᛸ(Ljava/util/List;)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    check-cast v0, Lxhss/ᛲᲀᛱ;

    .line 812
    .line 813
    new-array v1, v14, [Ljava/lang/Object;

    .line 814
    .line 815
    invoke-virtual {v0, v1}, Lxhss/ᛲᲀᛱ;->ᛱᲈᛳᛴ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    invoke-static {v0}, Lxhss/ᲀᲈᛵᛸ;->ᲈᛲᛵᲁ(Ljava/lang/Object;)Lxhss/ᲇᛵᛲᲁ;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    invoke-virtual {v0}, Lxhss/ᲇᛵᛲᲁ;->ᛳᲈᲈᛲ()Lxhss/ᛷᛴᲀᛳ;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    const-wide v1, -0x134871b858845L

    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    iput-object v1, v0, Lxhss/ᛵᛷᛴᲁ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 837
    .line 838
    invoke-virtual {v0}, Lxhss/ᛵᛷᛴᲁ;->ᛱᛱᛲᲇ()V

    .line 839
    .line 840
    .line 841
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    iput-object v1, v0, Lxhss/ᛷᛴᲀᛳ;->ᲈᛳᲀ:Ljava/lang/Integer;

    .line 846
    .line 847
    invoke-virtual {v0}, Lxhss/ᛷᛴᲀᛳ;->ᛳᲁᲇᛸ()Ljava/util/List;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    invoke-static {v0}, Lxhss/ᛷᲇᛵᛳ;->ᛵᛷᛲᛸ(Ljava/util/List;)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    check-cast v0, Lxhss/ᛲᲀᛱ;

    .line 856
    .line 857
    new-array v1, v14, [Ljava/lang/Object;

    .line 858
    .line 859
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 860
    .line 861
    .line 862
    :try_start_0
    invoke-static {v1, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v1

    .line 866
    invoke-virtual {v0}, Lxhss/ᛶᛵᛱ;->ᲁᛴᲇᛲ()V

    .line 867
    .line 868
    .line 869
    iget-object v2, v0, Lxhss/ᛲᲀᛱ;->ᛷᛴᛷᛱ:Ljava/lang/reflect/Method;

    .line 870
    .line 871
    iget-object v0, v0, Lxhss/ᛶᛸᲇᲀ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 872
    .line 873
    array-length v3, v1

    .line 874
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v1

    .line 878
    invoke-virtual {v2, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 882
    if-nez v0, :cond_c

    .line 883
    .line 884
    move-object v0, v15

    .line 885
    goto :goto_4

    .line 886
    :catchall_0
    move-exception v0

    .line 887
    new-instance v1, Lxhss/ᲈᛳᛱᲇ;

    .line 888
    .line 889
    invoke-direct {v1, v0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 890
    .line 891
    .line 892
    move-object v0, v1

    .line 893
    :cond_c
    :goto_4
    instance-of v1, v0, Lxhss/ᲈᛳᛱᲇ;

    .line 894
    .line 895
    if-eqz v1, :cond_d

    .line 896
    .line 897
    goto :goto_5

    .line 898
    :cond_d
    move-object v15, v0

    .line 899
    :goto_5
    check-cast v15, Landroid/view/View;

    .line 900
    .line 901
    const-wide v0, -0x1348f1b858845L

    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    check-cast v15, Landroid/view/ViewGroup;

    .line 910
    .line 911
    sget-object v0, Lxhss/ᲁᲁᲀᲇ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 912
    .line 913
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 914
    .line 915
    invoke-direct {v0, v15}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 916
    .line 917
    .line 918
    sput-object v0, Lxhss/ᲁᲁᲀᲇ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 919
    .line 920
    invoke-static {v15, v13}, Lxhss/ᲁᲁᲀᲇ;->ᛷᛵᛵᲈ(Landroid/view/ViewGroup;Z)V

    .line 921
    .line 922
    .line 923
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 924
    .line 925
    return-object v0

    .line 926
    :pswitch_10
    move-object/from16 v0, p1

    .line 927
    .line 928
    check-cast v0, Lxhss/ᛵᛴᛲᛵ;

    .line 929
    .line 930
    sget-object v1, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 931
    .line 932
    const-wide v2, -0x134cb1b858845L

    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    sget-object v2, Lxhss/ᛳᛱᛲᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛱᛲᛲ;

    .line 941
    .line 942
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    invoke-static {}, Lxhss/ᛳᛱᛲᛲ;->ᲀᲇᛳᲁ()Ljava/util/Set;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    const-wide v3, -0x134db1b858845L

    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 955
    .line 956
    .line 957
    move-result-object v3

    .line 958
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 959
    .line 960
    .line 961
    move-result v2

    .line 962
    invoke-static {}, Lxhss/ᛳᛱᛲᛲ;->ᲀᲇᛳᲁ()Ljava/util/Set;

    .line 963
    .line 964
    .line 965
    move-result-object v3

    .line 966
    const-wide v4, -0x134e41b858845L

    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object v4

    .line 975
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 976
    .line 977
    .line 978
    move-result v3

    .line 979
    invoke-static {}, Lxhss/ᛳᛱᛲᛲ;->ᲀᲇᛳᲁ()Ljava/util/Set;

    .line 980
    .line 981
    .line 982
    move-result-object v4

    .line 983
    const-wide v5, -0x134ee1b858845L

    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v5

    .line 992
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 993
    .line 994
    .line 995
    move-result v4

    .line 996
    iget-object v5, v0, Lxhss/ᛵᛴᛲᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 997
    .line 998
    instance-of v6, v5, Ljava/util/List;

    .line 999
    .line 1000
    if-eqz v6, :cond_e

    .line 1001
    .line 1002
    check-cast v5, Ljava/util/List;

    .line 1003
    .line 1004
    goto :goto_6

    .line 1005
    :cond_e
    move-object v5, v15

    .line 1006
    :goto_6
    if-nez v5, :cond_f

    .line 1007
    .line 1008
    goto/16 :goto_9

    .line 1009
    .line 1010
    :cond_f
    new-instance v6, Ljava/util/ArrayList;

    .line 1011
    .line 1012
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1013
    .line 1014
    .line 1015
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v7

    .line 1019
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1020
    .line 1021
    .line 1022
    move-result v8

    .line 1023
    if-eqz v8, :cond_14

    .line 1024
    .line 1025
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v8

    .line 1029
    sget-object v9, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 1030
    .line 1031
    const-wide v10, -0x134f91b858845L

    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    invoke-static {v10, v11}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v10

    .line 1040
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1041
    .line 1042
    .line 1043
    invoke-static {v8, v10}, Lxhss/ᲇᲁᛱᛸ;->ᛶᲇᲈᛸ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v9

    .line 1047
    const-wide v10, -0x134fe1b858845L

    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    invoke-static {v10, v11}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v10

    .line 1056
    const-wide v11, -0xccf81b858845L

    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    invoke-static {v8, v10}, Lxhss/ᲇᲁᛱᛸ;->ᲇᛸᛳᲁ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v10

    .line 1068
    instance-of v11, v10, Ljava/lang/Boolean;

    .line 1069
    .line 1070
    if-eqz v11, :cond_10

    .line 1071
    .line 1072
    check-cast v10, Ljava/lang/Boolean;

    .line 1073
    .line 1074
    goto :goto_8

    .line 1075
    :cond_10
    move-object v10, v15

    .line 1076
    :goto_8
    if-eqz v2, :cond_11

    .line 1077
    .line 1078
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1079
    .line 1080
    invoke-static {v10, v11}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1081
    .line 1082
    .line 1083
    move-result v10

    .line 1084
    if-eqz v10, :cond_11

    .line 1085
    .line 1086
    goto :goto_7

    .line 1087
    :cond_11
    if-eqz v3, :cond_12

    .line 1088
    .line 1089
    const-wide v10, -0x135031b858845L

    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    invoke-static {v10, v11}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v10

    .line 1098
    invoke-static {v9, v10}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v10

    .line 1102
    if-eqz v10, :cond_12

    .line 1103
    .line 1104
    goto :goto_7

    .line 1105
    :cond_12
    if-eqz v4, :cond_13

    .line 1106
    .line 1107
    const-wide v10, -0x135081b858845L

    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    invoke-static {v10, v11}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v10

    .line 1116
    invoke-static {v9, v10}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1117
    .line 1118
    .line 1119
    move-result v9

    .line 1120
    if-eqz v9, :cond_13

    .line 1121
    .line 1122
    goto :goto_7

    .line 1123
    :cond_13
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1124
    .line 1125
    .line 1126
    goto :goto_7

    .line 1127
    :cond_14
    iput-object v6, v0, Lxhss/ᛵᛴᛲᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 1128
    .line 1129
    const-wide v2, -0x1350e1b858845L

    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1138
    .line 1139
    .line 1140
    const-wide v2, -0x1351b1b858845L

    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1149
    .line 1150
    .line 1151
    const-wide v2, -0xfd081b858845L

    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1157
    .line 1158
    .line 1159
    :goto_9
    return-object v1

    .line 1160
    :pswitch_11
    move-object/from16 v0, p1

    .line 1161
    .line 1162
    check-cast v0, Lxhss/ᛵᛴᛲᛵ;

    .line 1163
    .line 1164
    sget-object v1, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 1165
    .line 1166
    const-wide v2, -0x13e6a1b858845L

    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1172
    .line 1173
    .line 1174
    sget-object v2, Lxhss/ᲈᲁᲈᲁ;->ᲇᛴᲇᛵ:Lxhss/ᲈᲁᲈᲁ;

    .line 1175
    .line 1176
    iget-object v0, v0, Lxhss/ᛵᛴᛲᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 1177
    .line 1178
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1179
    .line 1180
    .line 1181
    invoke-static {v0}, Lxhss/ᲈᲁᲈᲁ;->ᛳᛶᛷᲀ(Ljava/lang/Object;)Landroid/view/View;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v0

    .line 1185
    if-nez v0, :cond_17

    .line 1186
    .line 1187
    const-wide v2, -0x13e7a1b858845L

    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v0

    .line 1196
    invoke-static {v7, v8, v0, v9, v10}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛴᛶᛳ(JLjava/lang/String;J)I

    .line 1197
    .line 1198
    .line 1199
    move-result v2

    .line 1200
    if-nez v2, :cond_15

    .line 1201
    .line 1202
    goto/16 :goto_c

    .line 1203
    .line 1204
    :cond_15
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1205
    .line 1206
    .line 1207
    move-result v2

    .line 1208
    :goto_a
    if-ge v14, v2, :cond_1a

    .line 1209
    .line 1210
    add-int/lit16 v3, v14, 0x7d0

    .line 1211
    .line 1212
    if-le v3, v2, :cond_16

    .line 1213
    .line 1214
    move v3, v2

    .line 1215
    :cond_16
    invoke-virtual {v0, v14, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v4

    .line 1219
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1220
    .line 1221
    .line 1222
    sget-object v5, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 1223
    .line 1224
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1225
    .line 1226
    .line 1227
    invoke-static {v4}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 1228
    .line 1229
    .line 1230
    move v14, v3

    .line 1231
    goto :goto_a

    .line 1232
    :cond_17
    const-wide v2, -0x13ea11b858845L

    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v2

    .line 1241
    sget-object v3, Lxhss/ᲈᲁᲈᲁ;->ᛸᛴᛶᛳ:Ljava/util/WeakHashMap;

    .line 1242
    .line 1243
    monitor-enter v3

    .line 1244
    :try_start_1
    invoke-virtual {v3, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1245
    .line 1246
    .line 1247
    monitor-exit v3

    .line 1248
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1249
    .line 1250
    const-wide v3, -0x13ea41b858845L

    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v3

    .line 1259
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v3

    .line 1266
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v3

    .line 1270
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1274
    .line 1275
    .line 1276
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 1277
    .line 1278
    .line 1279
    move-result v0

    .line 1280
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1281
    .line 1282
    .line 1283
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v0

    .line 1287
    invoke-static {v7, v8, v0, v9, v10}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛴᛶᛳ(JLjava/lang/String;J)I

    .line 1288
    .line 1289
    .line 1290
    move-result v2

    .line 1291
    if-nez v2, :cond_18

    .line 1292
    .line 1293
    goto :goto_c

    .line 1294
    :cond_18
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1295
    .line 1296
    .line 1297
    move-result v2

    .line 1298
    :goto_b
    if-ge v14, v2, :cond_1a

    .line 1299
    .line 1300
    add-int/lit16 v3, v14, 0x7d0

    .line 1301
    .line 1302
    if-le v3, v2, :cond_19

    .line 1303
    .line 1304
    move v3, v2

    .line 1305
    :cond_19
    invoke-virtual {v0, v14, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v4

    .line 1309
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1310
    .line 1311
    .line 1312
    sget-object v5, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 1313
    .line 1314
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1315
    .line 1316
    .line 1317
    invoke-static {v4}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 1318
    .line 1319
    .line 1320
    move v14, v3

    .line 1321
    goto :goto_b

    .line 1322
    :cond_1a
    :goto_c
    return-object v1

    .line 1323
    :catchall_1
    move-exception v0

    .line 1324
    monitor-exit v3

    .line 1325
    throw v0

    .line 1326
    :pswitch_12
    move-object/from16 v0, p1

    .line 1327
    .line 1328
    check-cast v0, Lxhss/ᛵᛴᛲᛵ;

    .line 1329
    .line 1330
    const-wide v3, -0x13e321b858845L

    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1336
    .line 1337
    .line 1338
    sget-object v1, Lxhss/ᲈᲁᲈᲁ;->ᲇᛴᲇᛵ:Lxhss/ᲈᲁᲈᲁ;

    .line 1339
    .line 1340
    iget-object v0, v0, Lxhss/ᛵᛴᛲᛵ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 1341
    .line 1342
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v0

    .line 1346
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1347
    .line 1348
    .line 1349
    invoke-static {v0, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v0

    .line 1353
    invoke-static {v14, v0}, Lxhss/ᲈᲁᲈᲁ;->ᲁᛲᛴᛴ(Z[Ljava/lang/Object;)Lxhss/ᛱᛶᛳ;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v0

    .line 1357
    iget-object v1, v0, Lxhss/ᛱᛶᛳ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 1358
    .line 1359
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v3

    .line 1363
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1364
    .line 1365
    .line 1366
    move-result v4

    .line 1367
    if-eqz v4, :cond_1b

    .line 1368
    .line 1369
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v4

    .line 1373
    check-cast v4, Landroid/view/View;

    .line 1374
    .line 1375
    const-wide v5, -0x13e421b858845L

    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v5

    .line 1384
    sget-object v6, Lxhss/ᲈᲁᲈᲁ;->ᛸᛴᛶᛳ:Ljava/util/WeakHashMap;

    .line 1385
    .line 1386
    monitor-enter v6

    .line 1387
    :try_start_2
    invoke-virtual {v6, v4, v5}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1388
    .line 1389
    .line 1390
    monitor-exit v6

    .line 1391
    goto :goto_d

    .line 1392
    :catchall_2
    move-exception v0

    .line 1393
    monitor-exit v6

    .line 1394
    throw v0

    .line 1395
    :cond_1b
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1396
    .line 1397
    const-wide v4, -0x13e481b858845L

    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v4

    .line 1406
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1407
    .line 1408
    .line 1409
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1410
    .line 1411
    .line 1412
    move-result v1

    .line 1413
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1414
    .line 1415
    .line 1416
    const-wide v4, -0x13e671b858845L

    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v1

    .line 1425
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1426
    .line 1427
    .line 1428
    iget-object v0, v0, Lxhss/ᛱᛶᛳ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 1429
    .line 1430
    new-instance v1, Lxhss/ᛱᛱᲈᲀ;

    .line 1431
    .line 1432
    invoke-direct {v1, v2}, Lxhss/ᛱᛱᲈᲀ;-><init>(I)V

    .line 1433
    .line 1434
    .line 1435
    const/16 v2, 0x1f

    .line 1436
    .line 1437
    invoke-static {v0, v15, v1, v2}, Lxhss/ᛷᲇᛵᛳ;->ᛴᲀᛸᛵ(Ljava/util/Collection;Ljava/lang/String;Lxhss/ᛷᛴᛲᛲ;I)Ljava/lang/String;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v0

    .line 1441
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1442
    .line 1443
    .line 1444
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v0

    .line 1448
    invoke-static {v7, v8, v0, v9, v10}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛴᛶᛳ(JLjava/lang/String;J)I

    .line 1449
    .line 1450
    .line 1451
    move-result v1

    .line 1452
    if-nez v1, :cond_1c

    .line 1453
    .line 1454
    goto :goto_f

    .line 1455
    :cond_1c
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1456
    .line 1457
    .line 1458
    move-result v1

    .line 1459
    :goto_e
    if-ge v14, v1, :cond_1e

    .line 1460
    .line 1461
    add-int/lit16 v2, v14, 0x7d0

    .line 1462
    .line 1463
    if-le v2, v1, :cond_1d

    .line 1464
    .line 1465
    move v2, v1

    .line 1466
    :cond_1d
    invoke-virtual {v0, v14, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v3

    .line 1470
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1471
    .line 1472
    .line 1473
    sget-object v4, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 1474
    .line 1475
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1476
    .line 1477
    .line 1478
    invoke-static {v3}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 1479
    .line 1480
    .line 1481
    move v14, v2

    .line 1482
    goto :goto_e

    .line 1483
    :cond_1e
    :goto_f
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 1484
    .line 1485
    return-object v0

    .line 1486
    :pswitch_13
    move-object/from16 v0, p1

    .line 1487
    .line 1488
    check-cast v0, Landroid/view/View;

    .line 1489
    .line 1490
    const-wide v1, -0x13e2b1b858845L

    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1496
    .line 1497
    .line 1498
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1499
    .line 1500
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v2

    .line 1504
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v2

    .line 1508
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1509
    .line 1510
    .line 1511
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1512
    .line 1513
    .line 1514
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 1515
    .line 1516
    .line 1517
    move-result v0

    .line 1518
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1519
    .line 1520
    .line 1521
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    return-object v0

    .line 1526
    :pswitch_14
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 1527
    .line 1528
    move-object/from16 v1, p1

    .line 1529
    .line 1530
    check-cast v1, Lxhss/ᛵᛴᛲᛵ;

    .line 1531
    .line 1532
    const-wide v2, -0x140771b858845L

    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1538
    .line 1539
    .line 1540
    iget-object v1, v1, Lxhss/ᛵᛴᛲᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 1541
    .line 1542
    instance-of v2, v1, Landroid/view/View;

    .line 1543
    .line 1544
    if-eqz v2, :cond_1f

    .line 1545
    .line 1546
    move-object v15, v1

    .line 1547
    check-cast v15, Landroid/view/View;

    .line 1548
    .line 1549
    :cond_1f
    if-nez v15, :cond_20

    .line 1550
    .line 1551
    goto :goto_11

    .line 1552
    :cond_20
    sget-object v1, Lxhss/ᲈᲁᲈᲁ;->ᛸᛲᲀᛵ:Ljava/util/Set;

    .line 1553
    .line 1554
    monitor-enter v1

    .line 1555
    :try_start_3
    invoke-interface {v1, v15}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1556
    .line 1557
    .line 1558
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1559
    monitor-exit v1

    .line 1560
    if-eqz v2, :cond_23

    .line 1561
    .line 1562
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1563
    .line 1564
    const-wide v2, -0x140871b858845L

    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v2

    .line 1573
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1574
    .line 1575
    .line 1576
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v2

    .line 1580
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v2

    .line 1584
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1585
    .line 1586
    .line 1587
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1588
    .line 1589
    .line 1590
    invoke-static {v15}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 1591
    .line 1592
    .line 1593
    move-result v2

    .line 1594
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1595
    .line 1596
    .line 1597
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v1

    .line 1601
    invoke-static {v7, v8, v1, v9, v10}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛴᛶᛳ(JLjava/lang/String;J)I

    .line 1602
    .line 1603
    .line 1604
    move-result v2

    .line 1605
    if-nez v2, :cond_21

    .line 1606
    .line 1607
    goto :goto_11

    .line 1608
    :cond_21
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1609
    .line 1610
    .line 1611
    move-result v2

    .line 1612
    :goto_10
    if-ge v14, v2, :cond_23

    .line 1613
    .line 1614
    add-int/lit16 v3, v14, 0x7d0

    .line 1615
    .line 1616
    if-le v3, v2, :cond_22

    .line 1617
    .line 1618
    move v3, v2

    .line 1619
    :cond_22
    invoke-virtual {v1, v14, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v4

    .line 1623
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1624
    .line 1625
    .line 1626
    sget-object v5, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 1627
    .line 1628
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1629
    .line 1630
    .line 1631
    invoke-static {v4}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 1632
    .line 1633
    .line 1634
    move v14, v3

    .line 1635
    goto :goto_10

    .line 1636
    :cond_23
    :goto_11
    return-object v0

    .line 1637
    :catchall_3
    move-exception v0

    .line 1638
    monitor-exit v1

    .line 1639
    throw v0

    .line 1640
    :pswitch_15
    move-object/from16 v0, p1

    .line 1641
    .line 1642
    check-cast v0, Lxhss/ᛵᛴᛲᛵ;

    .line 1643
    .line 1644
    const-wide v1, -0x10c0d1b858845L

    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1650
    .line 1651
    .line 1652
    iget-object v1, v0, Lxhss/ᛵᛴᛲᛵ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 1653
    .line 1654
    iget-object v0, v0, Lxhss/ᛵᛴᛲᛵ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 1655
    .line 1656
    :try_start_4
    sget-object v2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 1657
    .line 1658
    const-wide v3, -0x10c1d1b858845L

    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v3

    .line 1667
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1668
    .line 1669
    .line 1670
    invoke-static {v0, v3}, Lxhss/ᲇᲁᛱᛸ;->ᲇᛸᛳᲁ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v2

    .line 1674
    instance-of v3, v2, Ljava/util/List;

    .line 1675
    .line 1676
    if-eqz v3, :cond_24

    .line 1677
    .line 1678
    check-cast v2, Ljava/util/List;

    .line 1679
    .line 1680
    goto :goto_12

    .line 1681
    :catch_0
    move-exception v0

    .line 1682
    goto :goto_15

    .line 1683
    :cond_24
    move-object v2, v15

    .line 1684
    :goto_12
    if-eqz v2, :cond_25

    .line 1685
    .line 1686
    invoke-static {v1}, Lxhss/ᛷᲇᛵᛳ;->ᛵᛷᛲᛸ(Ljava/util/List;)Ljava/lang/Object;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v3

    .line 1690
    const-wide v4, -0x10c261b858845L

    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1696
    .line 1697
    .line 1698
    check-cast v3, Ljava/lang/Integer;

    .line 1699
    .line 1700
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1701
    .line 1702
    .line 1703
    move-result v3

    .line 1704
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v2

    .line 1708
    goto :goto_13

    .line 1709
    :cond_25
    move-object v2, v15

    .line 1710
    :goto_13
    sput-object v2, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᲀᛵ:Ljava/lang/Object;

    .line 1711
    .line 1712
    const-wide v2, -0x10c561b858845L

    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v2

    .line 1721
    invoke-static {v0, v2}, Lxhss/ᲇᲁᛱᛸ;->ᲇᛸᛳᲁ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v0

    .line 1725
    instance-of v2, v0, Ljava/util/List;

    .line 1726
    .line 1727
    if-eqz v2, :cond_26

    .line 1728
    .line 1729
    check-cast v0, Ljava/util/List;

    .line 1730
    .line 1731
    goto :goto_14

    .line 1732
    :cond_26
    move-object v0, v15

    .line 1733
    :goto_14
    if-eqz v0, :cond_27

    .line 1734
    .line 1735
    invoke-static {v1}, Lxhss/ᛷᲇᛵᛳ;->ᛵᛷᛲᛸ(Ljava/util/List;)Ljava/lang/Object;

    .line 1736
    .line 1737
    .line 1738
    move-result-object v1

    .line 1739
    const-wide v2, -0x10c5d1b858845L

    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1745
    .line 1746
    .line 1747
    check-cast v1, Ljava/lang/Integer;

    .line 1748
    .line 1749
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1750
    .line 1751
    .line 1752
    move-result v1

    .line 1753
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v15

    .line 1757
    :cond_27
    sput-object v15, Lxhss/ᛶᲈᛴᛲ;->ᛸᛷᲈᲈ:Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 1758
    .line 1759
    goto :goto_17

    .line 1760
    :goto_15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1761
    .line 1762
    const-wide v2, -0x10c8d1b858845L

    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v2

    .line 1771
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1772
    .line 1773
    .line 1774
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v0

    .line 1778
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1779
    .line 1780
    .line 1781
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v0

    .line 1785
    invoke-static {v7, v8}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1786
    .line 1787
    .line 1788
    invoke-static {v9, v10}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1789
    .line 1790
    .line 1791
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1792
    .line 1793
    .line 1794
    move-result v1

    .line 1795
    if-nez v1, :cond_28

    .line 1796
    .line 1797
    goto :goto_17

    .line 1798
    :cond_28
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1799
    .line 1800
    .line 1801
    move-result v1

    .line 1802
    :goto_16
    if-ge v14, v1, :cond_2a

    .line 1803
    .line 1804
    add-int/lit16 v2, v14, 0x7d0

    .line 1805
    .line 1806
    if-le v2, v1, :cond_29

    .line 1807
    .line 1808
    move v2, v1

    .line 1809
    :cond_29
    invoke-virtual {v0, v14, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v3

    .line 1813
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1814
    .line 1815
    .line 1816
    sget-object v4, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 1817
    .line 1818
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1819
    .line 1820
    .line 1821
    invoke-static {v3}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 1822
    .line 1823
    .line 1824
    move v14, v2

    .line 1825
    goto :goto_16

    .line 1826
    :cond_2a
    :goto_17
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 1827
    .line 1828
    return-object v0

    .line 1829
    :pswitch_16
    move-object/from16 v0, p1

    .line 1830
    .line 1831
    check-cast v0, Lxhss/ᛸᲀᲇᛱ;

    .line 1832
    .line 1833
    const-wide v1, -0x10e651b858845L

    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1839
    .line 1840
    .line 1841
    iget-object v0, v0, Lxhss/ᛸᲀᲇᛱ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 1842
    .line 1843
    invoke-static {v0}, Lxhss/ᛷᲇᛵᛳ;->ᛱᲈᛳᛴ(Ljava/util/List;)Ljava/lang/Object;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v0

    .line 1847
    sput-object v0, Lxhss/ᛶᲈᛴᛲ;->ᲈᛳᲀ:Ljava/lang/Object;

    .line 1848
    .line 1849
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 1850
    .line 1851
    return-object v0

    .line 1852
    :pswitch_17
    move-object/from16 v0, p1

    .line 1853
    .line 1854
    check-cast v0, Lxhss/ᛵᛴᛲᛵ;

    .line 1855
    .line 1856
    sget-object v1, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 1857
    .line 1858
    const-wide v2, -0x107521b858845L

    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1864
    .line 1865
    .line 1866
    iget-object v0, v0, Lxhss/ᛵᛴᛲᛵ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 1867
    .line 1868
    const-wide v2, -0x1075e1b858845L

    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1874
    .line 1875
    .line 1876
    check-cast v0, Landroid/app/Activity;

    .line 1877
    .line 1878
    sget-object v2, Lxhss/ᛳᲀᲈᲀ;->ᲇᛴᲇᛵ:Lxhss/ᛳᲀᲈᲀ;

    .line 1879
    .line 1880
    iget-object v2, v2, Lxhss/ᲇᛱᲈᛸ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛷᛱ;

    .line 1881
    .line 1882
    invoke-virtual {v2}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v2

    .line 1886
    const-wide v3, -0x11f511b858845L

    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1892
    .line 1893
    .line 1894
    check-cast v2, Ljava/lang/String;

    .line 1895
    .line 1896
    sget-object v3, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 1897
    .line 1898
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1899
    .line 1900
    .line 1901
    sget-object v3, Lxhss/ᲇᲁᛱᛸ;->ᲈᛳᲀ:Lxhss/ᛴᛷᛱ;

    .line 1902
    .line 1903
    invoke-virtual {v3}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v3

    .line 1907
    const-wide v4, -0xcc8d1b858845L

    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1913
    .line 1914
    .line 1915
    check-cast v3, Ljava/lang/String;

    .line 1916
    .line 1917
    new-instance v4, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1918
    .line 1919
    invoke-direct {v4, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1920
    .line 1921
    .line 1922
    :try_start_5
    sput-object v4, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 1923
    .line 1924
    invoke-static {}, Lxhss/ᲈᲀᲀᛱ;->ᲈᛲᛵᲁ()Lxhss/ᲇᛴᲇᛴ;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v2

    .line 1928
    if-eqz v2, :cond_2b

    .line 1929
    .line 1930
    sget-object v3, Lxhss/ᲇᲁᛱᛸ;->ᛸᛴᛶᛳ:Ljava/lang/ClassLoader;

    .line 1931
    .line 1932
    invoke-static {v2, v3}, Lxhss/ᲇᛴᲇᛴ;->ᛱᛱᛲᲇ(Lxhss/ᲇᛴᲇᛴ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v2

    .line 1936
    goto :goto_18

    .line 1937
    :catchall_4
    move-exception v0

    .line 1938
    move-object v1, v0

    .line 1939
    goto :goto_1a

    .line 1940
    :cond_2b
    move-object v2, v15

    .line 1941
    :goto_18
    sput-object v2, Lxhss/ᛶᲈᛴᛲ;->ᛷᲁᲁ:Ljava/lang/reflect/Method;

    .line 1942
    .line 1943
    sput-object v15, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 1944
    .line 1945
    invoke-static {}, Lxhss/ᲁᛵᛸᛳ;->ᛸᛲᲀᛵ()Lxhss/ᲀᛴᛳᛸ;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v2

    .line 1949
    iget-object v3, v2, Lxhss/ᲀᛴᛳᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 1950
    .line 1951
    move-object v5, v3

    .line 1952
    check-cast v5, Ljava/lang/CharSequence;

    .line 1953
    .line 1954
    invoke-static {v5}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 1955
    .line 1956
    .line 1957
    move-result v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 1958
    if-eqz v5, :cond_2c

    .line 1959
    .line 1960
    invoke-virtual {v4}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    .line 1961
    .line 1962
    .line 1963
    goto :goto_19

    .line 1964
    :cond_2c
    :try_start_6
    sget-object v5, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 1965
    .line 1966
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1967
    .line 1968
    .line 1969
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ()Lcom/tencent/mmkv/MMKV;

    .line 1970
    .line 1971
    .line 1972
    move-result-object v5

    .line 1973
    const-wide v6, -0x107981b858845L

    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v6

    .line 1982
    check-cast v3, Ljava/lang/String;

    .line 1983
    .line 1984
    invoke-virtual {v5, v6, v3}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1985
    .line 1986
    .line 1987
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ()Lcom/tencent/mmkv/MMKV;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v3

    .line 1991
    const-wide v5, -0x1079e1b858845L

    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1997
    .line 1998
    .line 1999
    move-result-object v5

    .line 2000
    iget-object v2, v2, Lxhss/ᲀᛴᛳᛸ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2001
    .line 2002
    check-cast v2, Ljava/lang/String;

    .line 2003
    .line 2004
    invoke-virtual {v3, v5, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 2005
    .line 2006
    .line 2007
    invoke-static {v0}, Lxhss/ᲁᛵᛸᛳ;->ᛸᛲᛷᛱ(Landroid/content/Context;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 2008
    .line 2009
    .line 2010
    invoke-virtual {v4}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    .line 2011
    .line 2012
    .line 2013
    :goto_19
    return-object v1

    .line 2014
    :goto_1a
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 2015
    :catchall_5
    move-exception v0

    .line 2016
    invoke-static {v4, v1}, Lxhss/ᛶᛵᛱ;->ᛳᲁᲇᛸ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 2017
    .line 2018
    .line 2019
    throw v0

    .line 2020
    :pswitch_18
    move-object/from16 v0, p1

    .line 2021
    .line 2022
    check-cast v0, Lxhss/ᛵᛴᛲᛵ;

    .line 2023
    .line 2024
    const-wide v1, -0x138241b858845L

    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2030
    .line 2031
    .line 2032
    iget-object v1, v0, Lxhss/ᛵᛴᛲᛵ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 2033
    .line 2034
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2035
    .line 2036
    .line 2037
    move-result-object v1

    .line 2038
    const-wide v2, -0x138341b858845L

    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v2

    .line 2047
    invoke-static {v1, v2}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2048
    .line 2049
    .line 2050
    move-result v1

    .line 2051
    if-eqz v1, :cond_2e

    .line 2052
    .line 2053
    iget-object v0, v0, Lxhss/ᛵᛴᛲᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2054
    .line 2055
    const-wide v1, -0x138431b858845L

    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v1

    .line 2064
    invoke-static {v0, v1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2065
    .line 2066
    .line 2067
    move-result v0

    .line 2068
    sput-boolean v0, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᛷᛱ:Z

    .line 2069
    .line 2070
    if-eqz v0, :cond_2d

    .line 2071
    .line 2072
    const/4 v5, 0x2

    .line 2073
    goto :goto_1b

    .line 2074
    :cond_2d
    move v5, v13

    .line 2075
    :goto_1b
    sput v5, Lxhss/ᲇᛸᲀᛸ;->ᛸᛴᛶᛳ:I

    .line 2076
    .line 2077
    :cond_2e
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 2078
    .line 2079
    return-object v0

    .line 2080
    :pswitch_19
    move-object/from16 v0, p1

    .line 2081
    .line 2082
    check-cast v0, Lxhss/ᛸᲀᲇᛱ;

    .line 2083
    .line 2084
    sget-object v1, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 2085
    .line 2086
    const-wide v16, -0x137571b858845L

    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2092
    .line 2093
    .line 2094
    iget-object v0, v0, Lxhss/ᛸᲀᲇᛱ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 2095
    .line 2096
    const-wide v16, -0x137681b858845L

    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2102
    .line 2103
    .line 2104
    check-cast v0, Landroid/app/Application;

    .line 2105
    .line 2106
    sget-object v6, Lxhss/ᲇᲀᛳᛸ;->ᲇᛴᲇᛵ:Lxhss/ᲇᲀᛳᛸ;

    .line 2107
    .line 2108
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2109
    .line 2110
    .line 2111
    const-wide v16, -0x136b31b858845L

    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2117
    .line 2118
    .line 2119
    const-wide v16, -0x136bb1b858845L

    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v16

    .line 2128
    invoke-static/range {v16 .. v16}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 2129
    .line 2130
    .line 2131
    move/from16 v16, v2

    .line 2132
    .line 2133
    iget-object v2, v6, Lxhss/ᲇᛱᲈᛸ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛷᛱ;

    .line 2134
    .line 2135
    invoke-virtual {v2}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v2

    .line 2139
    check-cast v2, Lxhss/ᛶᲀᛴᲁ;

    .line 2140
    .line 2141
    invoke-virtual {v2}, Lxhss/ᛶᲀᛴᲁ;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v2

    .line 2145
    const/16 v17, 0x2

    .line 2146
    .line 2147
    new-instance v5, Ljava/lang/StringBuilder;

    .line 2148
    .line 2149
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 2150
    .line 2151
    .line 2152
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 2153
    .line 2154
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2155
    .line 2156
    .line 2157
    const-wide v18, -0x136c01b858845L

    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v2

    .line 2166
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2167
    .line 2168
    .line 2169
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v2

    .line 2173
    invoke-static {v0, v2}, Lcom/tencent/mmkv/MMKV;->ᲇᛴᲇᛵ(Landroid/app/Application;Ljava/lang/String;)V

    .line 2174
    .line 2175
    .line 2176
    sget-object v2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 2177
    .line 2178
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2179
    .line 2180
    .line 2181
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 2182
    .line 2183
    .line 2184
    move-result-object v2

    .line 2185
    iget-object v2, v2, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ:Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;

    .line 2186
    .line 2187
    if-eqz v2, :cond_2f

    .line 2188
    .line 2189
    goto :goto_1c

    .line 2190
    :cond_2f
    const-wide v18, -0x104401b858845L

    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2196
    .line 2197
    .line 2198
    move-object v2, v15

    .line 2199
    :goto_1c
    invoke-interface {v2}, Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;->getProcessName()Ljava/lang/String;

    .line 2200
    .line 2201
    .line 2202
    move-result-object v2

    .line 2203
    const-wide v18, -0x137a51b858845L

    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v5

    .line 2212
    invoke-static {v2, v5}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2213
    .line 2214
    .line 2215
    move-result v2

    .line 2216
    if-eqz v2, :cond_39

    .line 2217
    .line 2218
    sget-object v2, Lxhss/ᲇᲀᛳᛸ;->ᛷᛴᛷᛱ:[Ljava/lang/String;

    .line 2219
    .line 2220
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2221
    .line 2222
    .line 2223
    move-result-object v4

    .line 2224
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛷᲈᲈ()Landroid/content/pm/ApplicationInfo;

    .line 2225
    .line 2226
    .line 2227
    move-result-object v5

    .line 2228
    iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 2229
    .line 2230
    invoke-virtual {v4, v5, v14}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 2231
    .line 2232
    .line 2233
    move-result-object v4

    .line 2234
    invoke-virtual {v4}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 2235
    .line 2236
    .line 2237
    move-result-wide v4

    .line 2238
    new-instance v6, Ljava/lang/StringBuilder;

    .line 2239
    .line 2240
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛷᲈᲈ()Landroid/content/pm/ApplicationInfo;

    .line 2241
    .line 2242
    .line 2243
    move-result-object v13

    .line 2244
    iget-object v13, v13, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 2245
    .line 2246
    const-wide v16, -0x136c81b858845L

    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2252
    .line 2253
    .line 2254
    invoke-static {v13}, Lxhss/ᲇᲁᛱᛸ;->ᲈᛲᛵᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 2255
    .line 2256
    .line 2257
    move-result-object v13

    .line 2258
    invoke-static {v13}, Lxhss/ᛲᛱᛲᲀ;->ᛵᛴᛲᛵ(Ljava/lang/String;)Ljava/lang/String;

    .line 2259
    .line 2260
    .line 2261
    move-result-object v13

    .line 2262
    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2263
    .line 2264
    .line 2265
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2266
    .line 2267
    .line 2268
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v6

    .line 2272
    new-instance v13, Ljava/lang/StringBuilder;

    .line 2273
    .line 2274
    invoke-direct {v13, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2275
    .line 2276
    .line 2277
    invoke-virtual {v13, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2278
    .line 2279
    .line 2280
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2281
    .line 2282
    .line 2283
    move-result-object v4

    .line 2284
    sget-object v5, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 2285
    .line 2286
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2287
    .line 2288
    .line 2289
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 2290
    .line 2291
    .line 2292
    move-result-object v5

    .line 2293
    const-wide v16, -0x136d21b858845L

    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2299
    .line 2300
    .line 2301
    move-result-object v6

    .line 2302
    const-wide v16, -0x136d71b858845L

    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2308
    .line 2309
    .line 2310
    move-result-object v13

    .line 2311
    invoke-virtual {v5, v6, v13}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2312
    .line 2313
    .line 2314
    move-result-object v5

    .line 2315
    invoke-static {v5, v4}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2316
    .line 2317
    .line 2318
    move-result v4

    .line 2319
    if-eqz v4, :cond_31

    .line 2320
    .line 2321
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 2322
    .line 2323
    .line 2324
    move-result-object v4

    .line 2325
    const-wide v5, -0x136d81b858845L

    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2331
    .line 2332
    .line 2333
    move-result-object v5

    .line 2334
    invoke-virtual {v4, v5, v14}, Lcom/tencent/mmkv/MMKV;->getInt(Ljava/lang/String;I)I

    .line 2335
    .line 2336
    .line 2337
    move-result v4

    .line 2338
    if-ne v4, v3, :cond_31

    .line 2339
    .line 2340
    array-length v3, v2

    .line 2341
    move v4, v14

    .line 2342
    :goto_1d
    if-ge v4, v3, :cond_33

    .line 2343
    .line 2344
    aget-object v5, v2, v4

    .line 2345
    .line 2346
    sget-object v6, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 2347
    .line 2348
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2349
    .line 2350
    .line 2351
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 2352
    .line 2353
    .line 2354
    move-result-object v6

    .line 2355
    const-wide v16, -0x136ea1b858845L

    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2361
    .line 2362
    .line 2363
    move-result-object v13

    .line 2364
    invoke-virtual {v6, v5, v13}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v5

    .line 2368
    if-eqz v5, :cond_31

    .line 2369
    .line 2370
    invoke-static {v5}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 2371
    .line 2372
    .line 2373
    move-result v5

    .line 2374
    if-eqz v5, :cond_30

    .line 2375
    .line 2376
    goto :goto_1e

    .line 2377
    :cond_30
    add-int/lit8 v4, v4, 0x1

    .line 2378
    .line 2379
    goto :goto_1d

    .line 2380
    :cond_31
    :goto_1e
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 2381
    .line 2382
    .line 2383
    move-result-object v3

    .line 2384
    array-length v4, v2

    .line 2385
    move v5, v14

    .line 2386
    :goto_1f
    if-ge v5, v4, :cond_32

    .line 2387
    .line 2388
    aget-object v6, v2, v5

    .line 2389
    .line 2390
    invoke-virtual {v3, v6}, Lcom/tencent/mmkv/MMKV;->ᲇᛶᛴᲀ(Ljava/lang/String;)V

    .line 2391
    .line 2392
    .line 2393
    add-int/lit8 v5, v5, 0x1

    .line 2394
    .line 2395
    goto :goto_1f

    .line 2396
    :cond_32
    sget-object v2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 2397
    .line 2398
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2399
    .line 2400
    .line 2401
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛷᲈᲈ()Landroid/content/pm/ApplicationInfo;

    .line 2402
    .line 2403
    .line 2404
    move-result-object v2

    .line 2405
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 2406
    .line 2407
    const-wide v3, -0x136eb1b858845L

    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2413
    .line 2414
    .line 2415
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛶᲈᛶ()Landroid/content/pm/ApplicationInfo;

    .line 2416
    .line 2417
    .line 2418
    move-result-object v3

    .line 2419
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 2420
    .line 2421
    const-wide v4, -0x136f51b858845L

    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2427
    .line 2428
    .line 2429
    new-instance v4, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2430
    .line 2431
    invoke-direct {v4, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2432
    .line 2433
    .line 2434
    sput-object v4, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2435
    .line 2436
    :cond_33
    :try_start_8
    sget-object v2, Lxhss/ᲈᛵᲈᛶ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛵᲈᛶ;

    .line 2437
    .line 2438
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2439
    .line 2440
    .line 2441
    const-wide v3, -0x1163f1b858845L

    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2447
    .line 2448
    .line 2449
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2450
    .line 2451
    .line 2452
    move-result-object v0

    .line 2453
    sput-object v0, Lxhss/ᲈᛵᲈᛶ;->ᛷᲁᲁ:Landroid/content/Context;

    .line 2454
    .line 2455
    invoke-virtual {v2, v14}, Lxhss/ᲈᛵᲈᛶ;->ᲁᛲᛴᛴ(Z)Ljava/lang/reflect/Method;

    .line 2456
    .line 2457
    .line 2458
    const-wide v2, -0x1164b1b858845L

    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2464
    .line 2465
    .line 2466
    move-result-object v0

    .line 2467
    invoke-static {v7, v8}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2468
    .line 2469
    .line 2470
    invoke-static {v9, v10}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2471
    .line 2472
    .line 2473
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 2474
    .line 2475
    .line 2476
    move-result v2

    .line 2477
    if-nez v2, :cond_34

    .line 2478
    .line 2479
    goto :goto_21

    .line 2480
    :cond_34
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 2481
    .line 2482
    .line 2483
    move-result v2

    .line 2484
    :goto_20
    if-ge v14, v2, :cond_36

    .line 2485
    .line 2486
    add-int/lit16 v3, v14, 0x7d0

    .line 2487
    .line 2488
    if-le v3, v2, :cond_35

    .line 2489
    .line 2490
    move v3, v2

    .line 2491
    :cond_35
    invoke-virtual {v0, v14, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 2492
    .line 2493
    .line 2494
    move-result-object v4

    .line 2495
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2496
    .line 2497
    .line 2498
    sget-object v5, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 2499
    .line 2500
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2501
    .line 2502
    .line 2503
    invoke-static {v4}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 2504
    .line 2505
    .line 2506
    move v14, v3

    .line 2507
    goto :goto_20

    .line 2508
    :cond_36
    :goto_21
    sget-object v0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 2509
    .line 2510
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2511
    .line 2512
    .line 2513
    sget-object v0, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2514
    .line 2515
    if-eqz v0, :cond_37

    .line 2516
    .line 2517
    invoke-virtual {v0}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    .line 2518
    .line 2519
    .line 2520
    :cond_37
    sput-object v15, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2521
    .line 2522
    goto/16 :goto_2d

    .line 2523
    .line 2524
    :catchall_6
    move-exception v0

    .line 2525
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 2526
    .line 2527
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2528
    .line 2529
    .line 2530
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2531
    .line 2532
    if-eqz v1, :cond_38

    .line 2533
    .line 2534
    invoke-virtual {v1}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    .line 2535
    .line 2536
    .line 2537
    :cond_38
    sput-object v15, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2538
    .line 2539
    throw v0

    .line 2540
    :cond_39
    sget-object v2, Lxhss/ᲀᲈᛵᛸ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛴᲀᲁ;

    .line 2541
    .line 2542
    sget-object v5, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ:Landroid/app/Application;

    .line 2543
    .line 2544
    if-eqz v5, :cond_3a

    .line 2545
    .line 2546
    sget-object v5, Lxhss/ᲀᲈᛵᛸ;->ᲇᛴᲇᛵ:Lxhss/ᲀᛸᛵ;

    .line 2547
    .line 2548
    if-eqz v5, :cond_3a

    .line 2549
    .line 2550
    if-eqz v2, :cond_3a

    .line 2551
    .line 2552
    goto :goto_22

    .line 2553
    :cond_3a
    sput-object v0, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ:Landroid/app/Application;

    .line 2554
    .line 2555
    invoke-static {}, Lxhss/ᛴᛴᛲᛸ;->ᛷᛵᛵᲈ()Lxhss/ᛴᛴᛲᛸ;

    .line 2556
    .line 2557
    .line 2558
    move-result-object v5

    .line 2559
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2560
    .line 2561
    .line 2562
    invoke-virtual {v0, v5}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 2563
    .line 2564
    .line 2565
    new-instance v5, Lxhss/ᲀᛸᛵ;

    .line 2566
    .line 2567
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 2568
    .line 2569
    .line 2570
    sput-object v5, Lxhss/ᲀᲈᛵᛸ;->ᲇᛴᲇᛵ:Lxhss/ᲀᛸᛵ;

    .line 2571
    .line 2572
    sget-object v7, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ:Landroid/app/Application;

    .line 2573
    .line 2574
    iput-object v7, v5, Lxhss/ᲀᛸᛵ;->ᛷᛵᛵᲈ:Landroid/app/Application;

    .line 2575
    .line 2576
    if-nez v2, :cond_3b

    .line 2577
    .line 2578
    new-instance v2, Lxhss/ᛳᛴᲀᲁ;

    .line 2579
    .line 2580
    const/16 v5, 0x12

    .line 2581
    .line 2582
    invoke-direct {v2, v5}, Lxhss/ᛳᛴᲀᲁ;-><init>(I)V

    .line 2583
    .line 2584
    .line 2585
    :cond_3b
    sput-object v2, Lxhss/ᲀᲈᛵᛸ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛴᲀᲁ;

    .line 2586
    .line 2587
    :goto_22
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 2588
    .line 2589
    .line 2590
    move-result-object v2

    .line 2591
    invoke-static {v2}, Lxhss/ᲇᲁᛱᛸ;->ᛴᲈᛱᛴ(Landroid/content/Context;)V

    .line 2592
    .line 2593
    .line 2594
    const-wide v7, -0xe0791b858845L

    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    invoke-static {v7, v8}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2600
    .line 2601
    .line 2602
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2603
    .line 2604
    .line 2605
    move-result-object v2

    .line 2606
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 2607
    .line 2608
    .line 2609
    move-result-object v2

    .line 2610
    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    .line 2611
    .line 2612
    and-int/lit8 v2, v2, 0x30

    .line 2613
    .line 2614
    if-ne v2, v4, :cond_3c

    .line 2615
    .line 2616
    move/from16 v2, v17

    .line 2617
    .line 2618
    goto :goto_23

    .line 2619
    :cond_3c
    move v2, v13

    .line 2620
    :goto_23
    sput v2, Lxhss/ᲇᛸᲀᛸ;->ᛸᛴᛶᛳ:I

    .line 2621
    .line 2622
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛲᛵᲁ(Landroid/content/ContextWrapper;)V

    .line 2623
    .line 2624
    .line 2625
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2626
    .line 2627
    .line 2628
    move-result-object v2

    .line 2629
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛷᲈᲈ()Landroid/content/pm/ApplicationInfo;

    .line 2630
    .line 2631
    .line 2632
    move-result-object v5

    .line 2633
    iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 2634
    .line 2635
    invoke-virtual {v2, v5, v14}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 2636
    .line 2637
    .line 2638
    move-result-object v2

    .line 2639
    const-wide v7, -0x137c01b858845L

    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    invoke-static {v7, v8}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2645
    .line 2646
    .line 2647
    invoke-virtual {v2}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 2648
    .line 2649
    .line 2650
    move-result-wide v7

    .line 2651
    const-wide v9, -0xcdd71b858845L

    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    invoke-static {v9, v10}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2657
    .line 2658
    .line 2659
    :try_start_9
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2660
    .line 2661
    .line 2662
    move-result-object v5

    .line 2663
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2664
    .line 2665
    .line 2666
    move-result-object v9

    .line 2667
    invoke-virtual {v5, v9, v14}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 2668
    .line 2669
    .line 2670
    move-result-object v5

    .line 2671
    invoke-virtual {v5}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 2672
    .line 2673
    .line 2674
    move-result-wide v9
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 2675
    goto :goto_24

    .line 2676
    :catchall_7
    const-wide/16 v9, -0x1

    .line 2677
    .line 2678
    :goto_24
    sput-wide v9, Lxhss/ᲇᲁᛱᛸ;->ᛱᛱᛲᲇ:J

    .line 2679
    .line 2680
    sget-object v5, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 2681
    .line 2682
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2683
    .line 2684
    .line 2685
    const-wide v9, -0xcddf1b858845L

    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    invoke-static {v9, v10}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2691
    .line 2692
    .line 2693
    :try_start_a
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2694
    .line 2695
    .line 2696
    move-result-object v5

    .line 2697
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2698
    .line 2699
    .line 2700
    move-result-object v9

    .line 2701
    invoke-virtual {v5, v9, v14}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 2702
    .line 2703
    .line 2704
    move-result-object v5

    .line 2705
    iget-object v5, v5, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 2706
    .line 2707
    if-nez v5, :cond_3d

    .line 2708
    .line 2709
    const-wide v9, -0xcde71b858845L

    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    invoke-static {v9, v10}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 2715
    .line 2716
    .line 2717
    goto :goto_25

    .line 2718
    :catchall_8
    const-wide v9, -0xcde81b858845L

    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    invoke-static {v9, v10}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2724
    .line 2725
    .line 2726
    :cond_3d
    :goto_25
    const-wide v9, -0xcc061b858845L

    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    invoke-static {v9, v10}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2732
    .line 2733
    .line 2734
    sget-object v5, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 2735
    .line 2736
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2737
    .line 2738
    .line 2739
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ()Lcom/tencent/mmkv/MMKV;

    .line 2740
    .line 2741
    .line 2742
    move-result-object v5

    .line 2743
    const-wide v9, -0x137d41b858845L

    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    invoke-static {v9, v10}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2749
    .line 2750
    .line 2751
    move-result-object v9

    .line 2752
    sget-object v10, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 2753
    .line 2754
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2755
    .line 2756
    .line 2757
    sget-wide v10, Lxhss/ᲇᲁᛱᛸ;->ᛱᛱᛲᲇ:J

    .line 2758
    .line 2759
    invoke-virtual {v5, v9, v10, v11}, Lcom/tencent/mmkv/MMKV;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 2760
    .line 2761
    .line 2762
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛷᲈᲈ()Landroid/content/pm/ApplicationInfo;

    .line 2763
    .line 2764
    .line 2765
    move-result-object v5

    .line 2766
    new-instance v9, Ljava/lang/StringBuilder;

    .line 2767
    .line 2768
    iget-object v10, v5, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 2769
    .line 2770
    const-wide v11, -0x137e31b858845L

    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2776
    .line 2777
    .line 2778
    invoke-static {v10}, Lxhss/ᲇᲁᛱᛸ;->ᲈᛲᛵᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 2779
    .line 2780
    .line 2781
    move-result-object v10

    .line 2782
    invoke-static {v10}, Lxhss/ᛲᛱᛲᲀ;->ᛵᛴᛲᛵ(Ljava/lang/String;)Ljava/lang/String;

    .line 2783
    .line 2784
    .line 2785
    move-result-object v10

    .line 2786
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2787
    .line 2788
    .line 2789
    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2790
    .line 2791
    .line 2792
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2793
    .line 2794
    .line 2795
    move-result-object v9

    .line 2796
    new-instance v10, Ljava/lang/StringBuilder;

    .line 2797
    .line 2798
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2799
    .line 2800
    .line 2801
    invoke-virtual {v10, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2802
    .line 2803
    .line 2804
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2805
    .line 2806
    .line 2807
    move-result-object v10

    .line 2808
    sput-object v10, Lxhss/ᲇᲀᛳᛸ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 2809
    .line 2810
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 2811
    .line 2812
    .line 2813
    move-result-object v10

    .line 2814
    const-wide v11, -0x137ed1b858845L

    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2820
    .line 2821
    .line 2822
    move-result-object v11

    .line 2823
    const-wide v18, -0x137f21b858845L

    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2829
    .line 2830
    .line 2831
    move-result-object v12

    .line 2832
    invoke-virtual {v10, v11, v12}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2833
    .line 2834
    .line 2835
    move-result-object v10

    .line 2836
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 2837
    .line 2838
    .line 2839
    move-result-object v11

    .line 2840
    const-wide v18, -0x137f31b858845L

    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2846
    .line 2847
    .line 2848
    move-result-object v12

    .line 2849
    invoke-virtual {v11, v12, v14}, Lcom/tencent/mmkv/MMKV;->getInt(Ljava/lang/String;I)I

    .line 2850
    .line 2851
    .line 2852
    move-result v11

    .line 2853
    new-instance v12, Ljava/lang/StringBuilder;

    .line 2854
    .line 2855
    const-wide v18, -0x138051b858845L

    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    move-object/from16 v24, v15

    .line 2861
    .line 2862
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2863
    .line 2864
    .line 2865
    move-result-object v15

    .line 2866
    invoke-direct {v12, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2867
    .line 2868
    .line 2869
    iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 2870
    .line 2871
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2872
    .line 2873
    .line 2874
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2875
    .line 2876
    .line 2877
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2878
    .line 2879
    .line 2880
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2881
    .line 2882
    .line 2883
    invoke-virtual {v12, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2884
    .line 2885
    .line 2886
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2887
    .line 2888
    .line 2889
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 2890
    .line 2891
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2892
    .line 2893
    .line 2894
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2895
    .line 2896
    .line 2897
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2898
    .line 2899
    .line 2900
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2901
    .line 2902
    .line 2903
    sget-object v2, Lxhss/ᲇᲀᛳᛸ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 2904
    .line 2905
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2906
    .line 2907
    .line 2908
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2909
    .line 2910
    .line 2911
    move-result-object v2

    .line 2912
    invoke-static {v2}, Lxhss/ᲇᛱᲈᛸ;->ᲈᛳᲀ(Ljava/lang/String;)V

    .line 2913
    .line 2914
    .line 2915
    sget-object v2, Lxhss/ᲇᲀᛳᛸ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 2916
    .line 2917
    invoke-static {v10, v2}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2918
    .line 2919
    .line 2920
    move-result v2

    .line 2921
    if-eqz v2, :cond_3f

    .line 2922
    .line 2923
    if-eq v11, v3, :cond_3e

    .line 2924
    .line 2925
    goto :goto_26

    .line 2926
    :cond_3e
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 2927
    .line 2928
    .line 2929
    move-result-object v2

    .line 2930
    invoke-virtual {v2, v13}, Lcom/xingin/xhss/ModuleMain;->ᛱᛱᛲᲇ(Z)V

    .line 2931
    .line 2932
    .line 2933
    goto :goto_27

    .line 2934
    :cond_3f
    :goto_26
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 2935
    .line 2936
    .line 2937
    move-result-object v2

    .line 2938
    invoke-virtual {v2, v14}, Lcom/xingin/xhss/ModuleMain;->ᛱᛱᛲᲇ(Z)V

    .line 2939
    .line 2940
    .line 2941
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 2942
    .line 2943
    .line 2944
    move-result-object v2

    .line 2945
    invoke-virtual {v2}, Lcom/tencent/mmkv/MMKV;->clearAll()V

    .line 2946
    .line 2947
    .line 2948
    sput-boolean v13, Lxhss/ᲈᲀᲀᛱ;->ᲀᲇᛳᲁ:Z

    .line 2949
    .line 2950
    :goto_27
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛶᲈᛶ()Landroid/content/pm/ApplicationInfo;

    .line 2951
    .line 2952
    .line 2953
    move-result-object v2

    .line 2954
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 2955
    .line 2956
    sput-object v2, Lxhss/ᲁᛷᛸᛳ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 2957
    .line 2958
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 2959
    .line 2960
    .line 2961
    move-result-object v2

    .line 2962
    invoke-virtual {v2}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 2963
    .line 2964
    .line 2965
    move-result v2

    .line 2966
    if-nez v2, :cond_40

    .line 2967
    .line 2968
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛷᲈᲈ()Landroid/content/pm/ApplicationInfo;

    .line 2969
    .line 2970
    .line 2971
    move-result-object v2

    .line 2972
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 2973
    .line 2974
    const-wide v3, -0x138101b858845L

    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2980
    .line 2981
    .line 2982
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛶᲈᛶ()Landroid/content/pm/ApplicationInfo;

    .line 2983
    .line 2984
    .line 2985
    move-result-object v3

    .line 2986
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 2987
    .line 2988
    const-wide v4, -0x1381a1b858845L

    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2994
    .line 2995
    .line 2996
    new-instance v4, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2997
    .line 2998
    invoke-direct {v4, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2999
    .line 3000
    .line 3001
    sput-object v4, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 3002
    .line 3003
    :cond_40
    const-wide v2, -0x137401b858845L

    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 3009
    .line 3010
    .line 3011
    sget-object v2, Lcom/xingin/xhss/ModuleInit;->ᛷᛵᛵᲈ:Lcom/xingin/xhss/ModuleInit;

    .line 3012
    .line 3013
    const-wide v3, -0x1374c1b858845L

    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 3019
    .line 3020
    .line 3021
    move-result-object v18

    .line 3022
    sget-object v3, Lxhss/ᲇᲁᛱᛸ;->ᛸᛶᲈᛶ:Lxhss/ᛴᛷᛱ;

    .line 3023
    .line 3024
    invoke-virtual {v3}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 3025
    .line 3026
    .line 3027
    move-result-object v3

    .line 3028
    move-object/from16 v19, v3

    .line 3029
    .line 3030
    check-cast v19, Lxhss/ᛶᲀᛴᲁ;

    .line 3031
    .line 3032
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛷᲈᲈ()Landroid/content/pm/ApplicationInfo;

    .line 3033
    .line 3034
    .line 3035
    move-result-object v3

    .line 3036
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 3037
    .line 3038
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 3039
    .line 3040
    .line 3041
    move-result-object v21

    .line 3042
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ()Lcom/tencent/mmkv/MMKV;

    .line 3043
    .line 3044
    .line 3045
    move-result-object v22

    .line 3046
    move-object/from16 v23, v0

    .line 3047
    .line 3048
    move-object/from16 v20, v3

    .line 3049
    .line 3050
    filled-new-array/range {v18 .. v23}, [Ljava/lang/Object;

    .line 3051
    .line 3052
    .line 3053
    move-result-object v0

    .line 3054
    move-object/from16 v3, v23

    .line 3055
    .line 3056
    invoke-virtual {v2, v0}, Lcom/xingin/xhss/ModuleInit;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3057
    .line 3058
    .line 3059
    move-result-object v0

    .line 3060
    instance-of v2, v0, Ljava/lang/Boolean;

    .line 3061
    .line 3062
    if-eqz v2, :cond_41

    .line 3063
    .line 3064
    check-cast v0, Ljava/lang/Boolean;

    .line 3065
    .line 3066
    goto :goto_28

    .line 3067
    :cond_41
    move-object/from16 v0, v24

    .line 3068
    .line 3069
    :goto_28
    if-eqz v0, :cond_42

    .line 3070
    .line 3071
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3072
    .line 3073
    .line 3074
    move-result v0

    .line 3075
    goto :goto_29

    .line 3076
    :cond_42
    move v0, v14

    .line 3077
    :goto_29
    if-nez v0, :cond_43

    .line 3078
    .line 3079
    sget-object v0, Lxhss/ᛳᲀᲈᲀ;->ᲇᛴᲇᛵ:Lxhss/ᛳᲀᲈᲀ;

    .line 3080
    .line 3081
    invoke-virtual {v0}, Lxhss/ᲇᛱᲈᛸ;->ᛸᛶᲈᛶ()V

    .line 3082
    .line 3083
    .line 3084
    goto/16 :goto_2d

    .line 3085
    .line 3086
    :cond_43
    sget-object v0, Lxhss/ᲈᛵᲈᛶ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛵᲈᛶ;

    .line 3087
    .line 3088
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3089
    .line 3090
    .line 3091
    const-wide v4, -0x115d01b858845L

    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 3097
    .line 3098
    .line 3099
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 3100
    .line 3101
    .line 3102
    move-result-object v2

    .line 3103
    sput-object v2, Lxhss/ᲈᛵᲈᛶ;->ᛷᲁᲁ:Landroid/content/Context;

    .line 3104
    .line 3105
    sget-object v2, Lxhss/ᲈᛵᲈᛶ;->ᛸᛶᲈᛶ:Lxhss/ᛱᛶᛴᲁ;

    .line 3106
    .line 3107
    const/4 v4, 0x4

    .line 3108
    if-eqz v2, :cond_44

    .line 3109
    .line 3110
    goto :goto_2b

    .line 3111
    :cond_44
    new-instance v2, Lxhss/ᛱᛶᛴᲁ;

    .line 3112
    .line 3113
    invoke-direct {v2}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 3114
    .line 3115
    .line 3116
    new-instance v5, Landroid/content/IntentFilter;

    .line 3117
    .line 3118
    const-wide v7, -0x115dc1b858845L

    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    invoke-static {v7, v8}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 3124
    .line 3125
    .line 3126
    move-result-object v7

    .line 3127
    invoke-direct {v5, v7}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 3128
    .line 3129
    .line 3130
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3131
    .line 3132
    const/16 v8, 0x21

    .line 3133
    .line 3134
    if-lt v7, v8, :cond_45

    .line 3135
    .line 3136
    invoke-virtual {v3, v2, v5, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 3137
    .line 3138
    .line 3139
    goto :goto_2a

    .line 3140
    :cond_45
    invoke-virtual {v3, v2, v5}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 3141
    .line 3142
    .line 3143
    :goto_2a
    sput-object v2, Lxhss/ᲈᛵᲈᛶ;->ᛸᛶᲈᛶ:Lxhss/ᛱᛶᛴᲁ;

    .line 3144
    .line 3145
    :goto_2b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 3146
    .line 3147
    .line 3148
    move-result-wide v2

    .line 3149
    sput-wide v2, Lxhss/ᲇᲀᛳᛸ;->ᲀᲇᛳᲁ:J

    .line 3150
    .line 3151
    const/16 v2, 0x11

    .line 3152
    .line 3153
    new-array v2, v2, [Lxhss/ᲇᛱᲈᛸ;

    .line 3154
    .line 3155
    sget-object v3, Lxhss/ᲈᛱᲈᛱ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛱᲈᛱ;

    .line 3156
    .line 3157
    aput-object v3, v2, v14

    .line 3158
    .line 3159
    sget-object v3, Lxhss/ᛱᛸᛲᛶ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛸᛲᛶ;

    .line 3160
    .line 3161
    aput-object v3, v2, v13

    .line 3162
    .line 3163
    sget-object v3, Lxhss/ᛷᛲᛴᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛷᛲᛴᲁ;

    .line 3164
    .line 3165
    aput-object v3, v2, v17

    .line 3166
    .line 3167
    sget-object v3, Lxhss/ᛳᛷᛶᲇ;->ᲇᛴᲇᛵ:Lxhss/ᛳᛷᛶᲇ;

    .line 3168
    .line 3169
    const/4 v5, 0x3

    .line 3170
    aput-object v3, v2, v5

    .line 3171
    .line 3172
    sget-object v3, Lxhss/ᛸᛸᲇᛵ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛸᲇᛵ;

    .line 3173
    .line 3174
    aput-object v3, v2, v4

    .line 3175
    .line 3176
    sget-object v3, Lxhss/ᛷᛷᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛷᛷᛴ;

    .line 3177
    .line 3178
    const/4 v5, 0x5

    .line 3179
    aput-object v3, v2, v5

    .line 3180
    .line 3181
    sget-object v3, Lxhss/ᲇᛳᛸᲈ;->ᲇᛴᲇᛵ:Lxhss/ᲇᛳᛸᲈ;

    .line 3182
    .line 3183
    const/4 v5, 0x6

    .line 3184
    aput-object v3, v2, v5

    .line 3185
    .line 3186
    sget-object v3, Lxhss/ᲁᛴᲁᲁ;->ᲇᛴᲇᛵ:Lxhss/ᲁᛴᲁᲁ;

    .line 3187
    .line 3188
    const/4 v5, 0x7

    .line 3189
    aput-object v3, v2, v5

    .line 3190
    .line 3191
    sget-object v3, Lxhss/ᛱᛷᛶᛸ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛷᛶᛸ;

    .line 3192
    .line 3193
    const/16 v5, 0x8

    .line 3194
    .line 3195
    aput-object v3, v2, v5

    .line 3196
    .line 3197
    sget-object v3, Lxhss/ᛴᲈᛳᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛴᲈᛳᛲ;

    .line 3198
    .line 3199
    aput-object v3, v2, v16

    .line 3200
    .line 3201
    sget-object v3, Lxhss/ᛴᛷᲁᛳ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛷᲁᛳ;

    .line 3202
    .line 3203
    const/16 v5, 0xa

    .line 3204
    .line 3205
    aput-object v3, v2, v5

    .line 3206
    .line 3207
    sget-object v3, Lxhss/ᛴᛶᛷᛷ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛶᛷᛷ;

    .line 3208
    .line 3209
    const/16 v5, 0xb

    .line 3210
    .line 3211
    aput-object v3, v2, v5

    .line 3212
    .line 3213
    sget-object v3, Lxhss/ᛴᛶᛴᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛶᛴᛲ;

    .line 3214
    .line 3215
    const/16 v5, 0xc

    .line 3216
    .line 3217
    aput-object v3, v2, v5

    .line 3218
    .line 3219
    sget-object v3, Lxhss/ᛶᛸᛴᛸ;->ᲇᛴᲇᛵ:Lxhss/ᛶᛸᛴᛸ;

    .line 3220
    .line 3221
    const/16 v5, 0xd

    .line 3222
    .line 3223
    aput-object v3, v2, v5

    .line 3224
    .line 3225
    const/16 v3, 0xe

    .line 3226
    .line 3227
    aput-object v0, v2, v3

    .line 3228
    .line 3229
    sget-object v0, Lxhss/ᛴᛵᲁᛷ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛵᲁᛷ;

    .line 3230
    .line 3231
    const/16 v3, 0xf

    .line 3232
    .line 3233
    aput-object v0, v2, v3

    .line 3234
    .line 3235
    sget-object v0, Lxhss/ᲈᲁᲈᲁ;->ᲇᛴᲇᛵ:Lxhss/ᲈᲁᲈᲁ;

    .line 3236
    .line 3237
    const/16 v3, 0x10

    .line 3238
    .line 3239
    aput-object v0, v2, v3

    .line 3240
    .line 3241
    invoke-static {v2}, Lxhss/ᛱᲀᛷᛳ;->ᲁᲁᛴᲁ([Ljava/lang/Object;)Ljava/util/List;

    .line 3242
    .line 3243
    .line 3244
    move-result-object v0

    .line 3245
    :try_start_b
    invoke-static {}, Lxhss/ᲈᲀᲀᛱ;->ᲈᛲᛵᲁ()Lxhss/ᲇᛴᲇᛴ;

    .line 3246
    .line 3247
    .line 3248
    move-result-object v2

    .line 3249
    invoke-virtual {v6, v2}, Lxhss/ᲇᛱᲈᛸ;->ᲇᛸᛳᲁ(Lxhss/ᲇᛴᲇᛴ;)Ljava/lang/reflect/Method;

    .line 3250
    .line 3251
    .line 3252
    move-result-object v2

    .line 3253
    sput-object v2, Lxhss/ᛶᲈᛴᛲ;->ᛷᲁᲁ:Ljava/lang/reflect/Method;

    .line 3254
    .line 3255
    invoke-static {}, Lxhss/ᲈᲀᲀᛱ;->ᛸᛲᲀᛵ()Lxhss/ᲇᛴᲇᛴ;

    .line 3256
    .line 3257
    .line 3258
    move-result-object v2

    .line 3259
    invoke-virtual {v6, v2}, Lxhss/ᲇᛱᲈᛸ;->ᲇᛸᛳᲁ(Lxhss/ᲇᛴᲇᛴ;)Ljava/lang/reflect/Method;

    .line 3260
    .line 3261
    .line 3262
    move-result-object v2

    .line 3263
    sput-object v2, Lxhss/ᛶᲈᛴᛲ;->ᛸᛶᲈᛶ:Ljava/lang/reflect/Method;

    .line 3264
    .line 3265
    invoke-static {}, Lxhss/ᲈᲀᲀᛱ;->ᛳᛶᛷᲀ()Lxhss/ᲇᛴᲇᛴ;

    .line 3266
    .line 3267
    .line 3268
    move-result-object v2

    .line 3269
    new-instance v3, Lxhss/ᛱᛱᲈᲀ;

    .line 3270
    .line 3271
    invoke-direct {v3, v4}, Lxhss/ᛱᛱᲈᲀ;-><init>(I)V

    .line 3272
    .line 3273
    .line 3274
    invoke-virtual {v6, v2, v3}, Lxhss/ᲇᛱᲈᛸ;->ᲀᲇᛳᲁ(Lxhss/ᲇᛴᲇᛴ;Lxhss/ᛷᛴᛲᛲ;)V

    .line 3275
    .line 3276
    .line 3277
    sget-object v2, Lxhss/ᛷᛷᛲᛷ;->ᲇᛴᲇᛵ:Lxhss/ᛷᛷᛲᛷ;

    .line 3278
    .line 3279
    invoke-virtual {v2}, Lxhss/ᲇᛱᲈᛸ;->ᛸᛶᲈᛶ()V

    .line 3280
    .line 3281
    .line 3282
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3283
    .line 3284
    .line 3285
    move-result-object v0

    .line 3286
    :goto_2c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3287
    .line 3288
    .line 3289
    move-result v2

    .line 3290
    if-eqz v2, :cond_46

    .line 3291
    .line 3292
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3293
    .line 3294
    .line 3295
    move-result-object v2

    .line 3296
    check-cast v2, Lxhss/ᲇᛱᲈᛸ;

    .line 3297
    .line 3298
    invoke-virtual {v2}, Lxhss/ᲇᛱᲈᛸ;->ᛸᛶᲈᛶ()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 3299
    .line 3300
    .line 3301
    goto :goto_2c

    .line 3302
    :catchall_9
    move-exception v0

    .line 3303
    goto :goto_2e

    .line 3304
    :cond_46
    sget-object v0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 3305
    .line 3306
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3307
    .line 3308
    .line 3309
    sget-object v0, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 3310
    .line 3311
    if-eqz v0, :cond_47

    .line 3312
    .line 3313
    invoke-virtual {v0}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    .line 3314
    .line 3315
    .line 3316
    :cond_47
    sput-object v24, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 3317
    .line 3318
    :goto_2d
    return-object v1

    .line 3319
    :goto_2e
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 3320
    .line 3321
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3322
    .line 3323
    .line 3324
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 3325
    .line 3326
    if-eqz v1, :cond_48

    .line 3327
    .line 3328
    invoke-virtual {v1}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    .line 3329
    .line 3330
    .line 3331
    :cond_48
    sput-object v24, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 3332
    .line 3333
    throw v0

    .line 3334
    :pswitch_1a
    move-object/from16 v0, p1

    .line 3335
    .line 3336
    check-cast v0, Ljava/lang/Byte;

    .line 3337
    .line 3338
    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    .line 3339
    .line 3340
    .line 3341
    const-wide v1, -0x1f291b858845L

    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 3347
    .line 3348
    .line 3349
    move-result-object v1

    .line 3350
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 3351
    .line 3352
    .line 3353
    move-result-object v0

    .line 3354
    invoke-static {v0, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3355
    .line 3356
    .line 3357
    move-result-object v0

    .line 3358
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 3359
    .line 3360
    .line 3361
    move-result-object v0

    .line 3362
    const-wide v1, -0x1f2e1b858845L

    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 3368
    .line 3369
    .line 3370
    return-object v0

    .line 3371
    :pswitch_1b
    move-object/from16 v0, p1

    .line 3372
    .line 3373
    check-cast v0, Lxhss/ᛵᛴᛲᛵ;

    .line 3374
    .line 3375
    const-wide v1, -0x107ca1b858845L

    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 3381
    .line 3382
    .line 3383
    sget-object v1, Lxhss/ᛳᛱᛲᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛱᛲᛲ;

    .line 3384
    .line 3385
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3386
    .line 3387
    .line 3388
    invoke-static {}, Lxhss/ᛳᛱᛲᛲ;->ᲀᲇᛳᲁ()Ljava/util/Set;

    .line 3389
    .line 3390
    .line 3391
    move-result-object v1

    .line 3392
    const-wide v2, -0x107d61b858845L

    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 3398
    .line 3399
    .line 3400
    move-result-object v2

    .line 3401
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 3402
    .line 3403
    .line 3404
    move-result v1

    .line 3405
    if-eqz v1, :cond_49

    .line 3406
    .line 3407
    new-instance v1, Ljava/util/ArrayList;

    .line 3408
    .line 3409
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3410
    .line 3411
    .line 3412
    iput-object v1, v0, Lxhss/ᛵᛴᛲᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 3413
    .line 3414
    :cond_49
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 3415
    .line 3416
    return-object v0

    .line 3417
    :pswitch_1c
    move-object/from16 v24, v15

    .line 3418
    .line 3419
    move-object/from16 v0, p1

    .line 3420
    .line 3421
    check-cast v0, Lxhss/ᛸᲀᲇᛱ;

    .line 3422
    .line 3423
    const-wide v1, -0x107b21b858845L

    .line 3424
    .line 3425
    .line 3426
    .line 3427
    .line 3428
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 3429
    .line 3430
    .line 3431
    sget-object v1, Lxhss/ᛳᛱᛲᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛱᛲᛲ;

    .line 3432
    .line 3433
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3434
    .line 3435
    .line 3436
    invoke-static {}, Lxhss/ᛳᛱᛲᛲ;->ᲀᲇᛳᲁ()Ljava/util/Set;

    .line 3437
    .line 3438
    .line 3439
    move-result-object v1

    .line 3440
    const-wide v2, -0x107c31b858845L

    .line 3441
    .line 3442
    .line 3443
    .line 3444
    .line 3445
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 3446
    .line 3447
    .line 3448
    move-result-object v2

    .line 3449
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 3450
    .line 3451
    .line 3452
    move-result v1

    .line 3453
    if-eqz v1, :cond_4a

    .line 3454
    .line 3455
    move-object/from16 v1, v24

    .line 3456
    .line 3457
    invoke-virtual {v0, v1}, Lxhss/ᛸᲀᲇᛱ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)V

    .line 3458
    .line 3459
    .line 3460
    :cond_4a
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 3461
    .line 3462
    return-object v0

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
