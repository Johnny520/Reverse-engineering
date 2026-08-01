.class public final Lse1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lse1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lse1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    const-string v1, ""

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lse1;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lse1;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 32
    .line 33
    return-void
.end method

.method public static α()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    sget-object v0, Lx9;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    sget-object v0, Lx9;->θ:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_0
    return-object v0
.end method

.method public static β(Ljava/lang/ClassLoader;ZLjava/lang/String;Ljava/util/List;)Lqe1;
    .locals 51

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lse1;->ζ()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    move-object v3, v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v3, p3

    .line 14
    .line 15
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    new-instance v4, Lqe1;

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v9, 0x1

    .line 28
    const-string v10, "\u6ca1\u6709\u5df2\u8bc6\u522b\u7684\u5c0f\u706b\u4eba\u5355\u804a\u4f1a\u8bdd"

    .line 29
    .line 30
    invoke-direct/range {v4 .. v10}, Lqe1;-><init>(IIIIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v4

    .line 34
    :cond_1
    if-eqz p1, :cond_2

    .line 35
    .line 36
    const-string v0, "\u81ea\u52a8"

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const-string v0, "\u624b\u52a8"

    .line 40
    .line 41
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    new-instance v5, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v6, "\u5f00\u59cb"

    .line 48
    .line 49
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, "\u9886\u53d6\u4eb2\u5bc6\u5ea6 \u4f1a\u8bdd="

    .line 56
    .line 57
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, " module=Closeness(2)"

    .line 64
    .line 65
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v4, "rb4e434d444870f0e"

    .line 73
    .line 74
    const/4 v5, 0x0

    .line 75
    const/4 v6, 0x4

    .line 76
    invoke-static {v4, v0, v5, v6, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    const/4 v9, 0x0

    .line 84
    const/4 v11, 0x0

    .line 85
    const/4 v12, 0x0

    .line 86
    const/4 v13, 0x0

    .line 87
    const/4 v14, 0x0

    .line 88
    const/4 v15, 0x0

    .line 89
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    add-int/lit8 v10, v9, 0x1

    .line 96
    .line 97
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Lky1;

    .line 102
    .line 103
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 104
    .line 105
    .line 106
    move-result-object v16

    .line 107
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Thread;->isInterrupted()Z

    .line 108
    .line 109
    .line 110
    move-result v16

    .line 111
    if-nez v16, :cond_3

    .line 112
    .line 113
    if-eqz p1, :cond_4

    .line 114
    .line 115
    invoke-static {}, Lse1;->γ()Z

    .line 116
    .line 117
    .line 118
    move-result v16

    .line 119
    if-nez v16, :cond_4

    .line 120
    .line 121
    const-string v0, "\u81ea\u52a8\u4eb2\u5bc6\u5ea6\u9886\u53d6\u6267\u884c\u4e2d\u88ab\u5173\u95ed\uff0c\u505c\u6b62\u540e\u7eed\u4f1a\u8bdd"

    .line 122
    .line 123
    invoke-static {v4, v0, v5, v6, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_3
    :goto_3
    move/from16 v28, v11

    .line 127
    .line 128
    move/from16 v30, v12

    .line 129
    .line 130
    move/from16 v25, v13

    .line 131
    .line 132
    move/from16 v26, v14

    .line 133
    .line 134
    move/from16 v24, v15

    .line 135
    .line 136
    goto/16 :goto_1f

    .line 137
    .line 138
    :cond_4
    if-eqz p1, :cond_5

    .line 139
    .line 140
    invoke-static {}, Lse1;->α()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    invoke-static {v8, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    if-nez v8, :cond_5

    .line 149
    .line 150
    const-string v0, "\u81ea\u52a8\u4eb2\u5bc6\u5ea6\u9886\u53d6\u68c0\u6d4b\u5230\u8d26\u53f7\u53d8\u5316\uff0c\u505c\u6b62\u4f7f\u7528\u65e7\u4f1a\u8bdd"

    .line 151
    .line 152
    invoke-static {v4, v0, v5, v6, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_5
    sget-object v8, Lry1;->α:Lry1;

    .line 157
    .line 158
    invoke-static {v0}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    iget-wide v5, v0, Lky1;->β:J

    .line 163
    .line 164
    move-object/from16 v17, v3

    .line 165
    .line 166
    sget-object v3, Lpe1;->α:Lpe1;

    .line 167
    .line 168
    invoke-virtual {v3, v1, v5, v6}, Lpe1;->γ(Ljava/lang/ClassLoader;J)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    move-object/from16 v18, v7

    .line 173
    .line 174
    instance-of v7, v0, Leo1;

    .line 175
    .line 176
    const-wide/16 v19, 0x12c

    .line 177
    .line 178
    move-object/from16 v21, v0

    .line 179
    .line 180
    const-string v0, " shortId="

    .line 181
    .line 182
    move/from16 v22, v7

    .line 183
    .line 184
    if-eqz v22, :cond_8

    .line 185
    .line 186
    add-int/lit8 v15, v15, 0x1

    .line 187
    .line 188
    new-instance v3, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    const/16 v22, 0x1

    .line 191
    .line 192
    const-string v7, "\u4eb2\u5bc6\u5ea6\u8bfb\u53d6\u5931\u8d25 name="

    .line 193
    .line 194
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static/range {v21 .. v21}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    if-nez v3, :cond_6

    .line 215
    .line 216
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 217
    .line 218
    const-string v5, "\u4eb2\u5bc6\u5ea6\u8bfb\u53d6\u8fd4\u56de\u672a\u77e5\u9519\u8bef"

    .line 219
    .line 220
    invoke-direct {v3, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    :cond_6
    invoke-static {v4, v0, v3}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    add-int/lit8 v0, v0, -0x1

    .line 231
    .line 232
    if-ge v9, v0, :cond_7

    .line 233
    .line 234
    invoke-static/range {v19 .. v20}, Lse1;->ε(J)V

    .line 235
    .line 236
    .line 237
    :cond_7
    move v9, v10

    .line 238
    move-object/from16 v3, v17

    .line 239
    .line 240
    move-object/from16 v7, v18

    .line 241
    .line 242
    :goto_4
    const/4 v5, 0x0

    .line 243
    const/4 v6, 0x4

    .line 244
    goto/16 :goto_2

    .line 245
    .line 246
    :cond_8
    const/16 v22, 0x1

    .line 247
    .line 248
    invoke-static/range {v21 .. v21}, Li81;->Β(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    move-object/from16 v7, v21

    .line 252
    .line 253
    check-cast v7, Loe1;

    .line 254
    .line 255
    move/from16 v21, v10

    .line 256
    .line 257
    iget v10, v7, Loe1;->γ:I

    .line 258
    .line 259
    invoke-virtual {v7}, Loe1;->α()Z

    .line 260
    .line 261
    .line 262
    move-result v23

    .line 263
    move/from16 v24, v15

    .line 264
    .line 265
    const-string v15, " msg="

    .line 266
    .line 267
    move/from16 v25, v13

    .line 268
    .line 269
    const-string v13, " http="

    .line 270
    .line 271
    move/from16 v26, v14

    .line 272
    .line 273
    const-string v14, " bridge="

    .line 274
    .line 275
    const-string v27, ""

    .line 276
    .line 277
    move/from16 v28, v11

    .line 278
    .line 279
    const-string v11, " code="

    .line 280
    .line 281
    const/16 v29, -0x1

    .line 282
    .line 283
    if-nez v23, :cond_d

    .line 284
    .line 285
    const v3, 0xf2ad8

    .line 286
    .line 287
    .line 288
    if-ne v10, v3, :cond_9

    .line 289
    .line 290
    add-int/lit8 v14, v26, 0x1

    .line 291
    .line 292
    const-string v3, "\u4eb2\u5bc6\u5ea6\u9886\u53d6\u8df3\u8fc7 name="

    .line 293
    .line 294
    invoke-static {v3, v8, v5, v6, v0}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-string v3, " reason=pet_not_exist"

    .line 305
    .line 306
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    const/4 v3, 0x4

    .line 314
    const/4 v5, 0x0

    .line 315
    invoke-static {v4, v0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    move/from16 v30, v12

    .line 319
    .line 320
    move/from16 v15, v24

    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_9
    add-int/lit8 v3, v24, 0x1

    .line 324
    .line 325
    move/from16 v23, v3

    .line 326
    .line 327
    iget v3, v7, Loe1;->α:I

    .line 328
    .line 329
    move/from16 v30, v12

    .line 330
    .line 331
    iget-object v12, v7, Loe1;->β:Ljava/lang/Integer;

    .line 332
    .line 333
    if-eqz v12, :cond_a

    .line 334
    .line 335
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 336
    .line 337
    .line 338
    move-result v29

    .line 339
    :cond_a
    move/from16 v12, v29

    .line 340
    .line 341
    iget-object v7, v7, Loe1;->δ:Ljava/lang/String;

    .line 342
    .line 343
    if-nez v7, :cond_b

    .line 344
    .line 345
    move-object/from16 v7, v27

    .line 346
    .line 347
    :cond_b
    const-string v1, "\u4eb2\u5bc6\u5ea6\u8bfb\u53d6\u4e1a\u52a1\u5931\u8d25 name="

    .line 348
    .line 349
    invoke-static {v1, v8, v5, v6, v0}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    const/4 v3, 0x4

    .line 382
    const/4 v5, 0x0

    .line 383
    invoke-static {v4, v0, v5, v3, v5}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    move/from16 v15, v23

    .line 387
    .line 388
    move/from16 v14, v26

    .line 389
    .line 390
    :goto_5
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    add-int/lit8 v0, v0, -0x1

    .line 395
    .line 396
    if-ge v9, v0, :cond_c

    .line 397
    .line 398
    invoke-static/range {v19 .. v20}, Lse1;->ε(J)V

    .line 399
    .line 400
    .line 401
    :cond_c
    move-object/from16 v1, p0

    .line 402
    .line 403
    move-object/from16 v3, v17

    .line 404
    .line 405
    move-object/from16 v7, v18

    .line 406
    .line 407
    move/from16 v9, v21

    .line 408
    .line 409
    move/from16 v13, v25

    .line 410
    .line 411
    move/from16 v11, v28

    .line 412
    .line 413
    :goto_6
    move/from16 v12, v30

    .line 414
    .line 415
    goto/16 :goto_4

    .line 416
    .line 417
    :cond_d
    move/from16 v30, v12

    .line 418
    .line 419
    add-int/lit8 v1, v28, 0x1

    .line 420
    .line 421
    iget-object v7, v7, Loe1;->ε:Lne1;

    .line 422
    .line 423
    if-eqz v7, :cond_2e

    .line 424
    .line 425
    iget-object v10, v7, Lne1;->η:Ljava/util/List;

    .line 426
    .line 427
    new-instance v12, Ljava/util/ArrayList;

    .line 428
    .line 429
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 430
    .line 431
    .line 432
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 433
    .line 434
    .line 435
    move-result-object v10

    .line 436
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 437
    .line 438
    .line 439
    move-result v23

    .line 440
    if-eqz v23, :cond_f

    .line 441
    .line 442
    move/from16 v23, v1

    .line 443
    .line 444
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    move-object/from16 v28, v10

    .line 449
    .line 450
    move-object v10, v1

    .line 451
    check-cast v10, Lke1;

    .line 452
    .line 453
    iget-boolean v10, v10, Lke1;->δ:Z

    .line 454
    .line 455
    if-eqz v10, :cond_e

    .line 456
    .line 457
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    :cond_e
    move/from16 v1, v23

    .line 461
    .line 462
    move-object/from16 v10, v28

    .line 463
    .line 464
    goto :goto_7

    .line 465
    :cond_f
    move/from16 v23, v1

    .line 466
    .line 467
    new-instance v1, Ljava/util/HashSet;

    .line 468
    .line 469
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 470
    .line 471
    .line 472
    new-instance v10, Ljava/util/ArrayList;

    .line 473
    .line 474
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 478
    .line 479
    .line 480
    move-result-object v12

    .line 481
    :goto_8
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 482
    .line 483
    .line 484
    move-result v28

    .line 485
    if-eqz v28, :cond_11

    .line 486
    .line 487
    move-object/from16 v28, v12

    .line 488
    .line 489
    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v12

    .line 493
    move/from16 v31, v9

    .line 494
    .line 495
    move-object v9, v12

    .line 496
    check-cast v9, Lke1;

    .line 497
    .line 498
    iget v9, v9, Lke1;->α:I

    .line 499
    .line 500
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 501
    .line 502
    .line 503
    move-result-object v9

    .line 504
    invoke-virtual {v1, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v9

    .line 508
    if-eqz v9, :cond_10

    .line 509
    .line 510
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    :cond_10
    move-object/from16 v12, v28

    .line 514
    .line 515
    move/from16 v9, v31

    .line 516
    .line 517
    goto :goto_8

    .line 518
    :cond_11
    move/from16 v31, v9

    .line 519
    .line 520
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 521
    .line 522
    .line 523
    move-result v1

    .line 524
    const-string v9, " total="

    .line 525
    .line 526
    const-string v12, " level="

    .line 527
    .line 528
    const-wide/16 v32, -0x1

    .line 529
    .line 530
    if-eqz v1, :cond_14

    .line 531
    .line 532
    iget-object v1, v7, Lne1;->α:Ljava/lang/Integer;

    .line 533
    .line 534
    if-eqz v1, :cond_12

    .line 535
    .line 536
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 537
    .line 538
    .line 539
    move-result v1

    .line 540
    :goto_9
    move-object/from16 v28, v10

    .line 541
    .line 542
    goto :goto_a

    .line 543
    :cond_12
    move/from16 v1, v29

    .line 544
    .line 545
    goto :goto_9

    .line 546
    :goto_a
    iget-object v10, v7, Lne1;->ε:Ljava/lang/Long;

    .line 547
    .line 548
    if-eqz v10, :cond_13

    .line 549
    .line 550
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 551
    .line 552
    .line 553
    move-result-wide v34

    .line 554
    move-wide/from16 v49, v34

    .line 555
    .line 556
    move-object/from16 v34, v11

    .line 557
    .line 558
    move-wide/from16 v10, v49

    .line 559
    .line 560
    :goto_b
    move-object/from16 v35, v7

    .line 561
    .line 562
    goto :goto_c

    .line 563
    :cond_13
    move-object/from16 v34, v11

    .line 564
    .line 565
    move-wide/from16 v10, v32

    .line 566
    .line 567
    goto :goto_b

    .line 568
    :goto_c
    const-string v7, "\u4eb2\u5bc6\u5ea6\u65e0\u9700\u9886\u53d6 name="

    .line 569
    .line 570
    invoke-static {v7, v8, v5, v6, v0}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    const/4 v1, 0x4

    .line 591
    const/4 v7, 0x0

    .line 592
    invoke-static {v4, v0, v7, v1, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    goto :goto_d

    .line 596
    :cond_14
    move-object/from16 v35, v7

    .line 597
    .line 598
    move-object/from16 v28, v10

    .line 599
    .line 600
    move-object/from16 v34, v11

    .line 601
    .line 602
    :goto_d
    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    move-object/from16 v7, v35

    .line 607
    .line 608
    const/4 v10, 0x0

    .line 609
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    if-eqz v0, :cond_2c

    .line 614
    .line 615
    add-int/lit8 v11, v10, 0x1

    .line 616
    .line 617
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    move-object/from16 v35, v1

    .line 622
    .line 623
    move-object v1, v0

    .line 624
    check-cast v1, Lke1;

    .line 625
    .line 626
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    .line 631
    .line 632
    .line 633
    move-result v0

    .line 634
    if-nez v0, :cond_2c

    .line 635
    .line 636
    if-eqz p1, :cond_15

    .line 637
    .line 638
    invoke-static {}, Lse1;->γ()Z

    .line 639
    .line 640
    .line 641
    move-result v0

    .line 642
    if-eqz v0, :cond_2c

    .line 643
    .line 644
    :cond_15
    if-eqz p1, :cond_16

    .line 645
    .line 646
    invoke-static {}, Lse1;->α()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result v0

    .line 654
    if-nez v0, :cond_16

    .line 655
    .line 656
    const-string v0, "\u81ea\u52a8\u4eb2\u5bc6\u5ea6\u9886\u53d6\u884c\u4e3a\u9636\u6bb5\u68c0\u6d4b\u5230\u8d26\u53f7\u53d8\u5316\uff0c\u505c\u6b62\u5f53\u524d\u4f1a\u8bdd"

    .line 657
    .line 658
    const/4 v3, 0x4

    .line 659
    const/4 v5, 0x0

    .line 660
    invoke-static {v4, v0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 661
    .line 662
    .line 663
    goto/16 :goto_1e

    .line 664
    .line 665
    :cond_16
    iget-object v0, v7, Lne1;->η:Ljava/util/List;

    .line 666
    .line 667
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 668
    .line 669
    .line 670
    move-result v36

    .line 671
    const-string v2, " id="

    .line 672
    .line 673
    if-eqz v36, :cond_18

    .line 674
    .line 675
    :cond_17
    move-object/from16 v44, v3

    .line 676
    .line 677
    move-wide/from16 v40, v5

    .line 678
    .line 679
    move-object/from16 v39, v7

    .line 680
    .line 681
    move/from16 v36, v11

    .line 682
    .line 683
    move-object v5, v15

    .line 684
    move-object/from16 v3, v34

    .line 685
    .line 686
    goto/16 :goto_1d

    .line 687
    .line 688
    :cond_18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 693
    .line 694
    .line 695
    move-result v36

    .line 696
    if-eqz v36, :cond_17

    .line 697
    .line 698
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v36

    .line 702
    move-object/from16 v37, v0

    .line 703
    .line 704
    move-object/from16 v0, v36

    .line 705
    .line 706
    check-cast v0, Lke1;

    .line 707
    .line 708
    move/from16 v36, v11

    .line 709
    .line 710
    iget v11, v0, Lke1;->α:I

    .line 711
    .line 712
    move-object/from16 v38, v15

    .line 713
    .line 714
    iget v15, v1, Lke1;->α:I

    .line 715
    .line 716
    if-ne v11, v15, :cond_2b

    .line 717
    .line 718
    iget-boolean v0, v0, Lke1;->δ:Z

    .line 719
    .line 720
    if-eqz v0, :cond_2b

    .line 721
    .line 722
    iget-object v11, v7, Lne1;->α:Ljava/lang/Integer;

    .line 723
    .line 724
    const-wide/16 v39, 0x0

    .line 725
    .line 726
    cmp-long v0, v5, v39

    .line 727
    .line 728
    if-lez v0, :cond_1b

    .line 729
    .line 730
    if-lez v15, :cond_1a

    .line 731
    .line 732
    move-object/from16 v39, v7

    .line 733
    .line 734
    move-object/from16 v7, p0

    .line 735
    .line 736
    :try_start_0
    invoke-static {v7, v5, v6}, Lxn0;->σ(Ljava/lang/ClassLoader;J)Ljava/util/LinkedHashMap;

    .line 737
    .line 738
    .line 739
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 740
    move-wide/from16 v40, v5

    .line 741
    .line 742
    :try_start_1
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 743
    .line 744
    invoke-direct {v5, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 745
    .line 746
    .line 747
    const-string v6, "behavior_id"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 748
    .line 749
    move-object/from16 v37, v11

    .line 750
    .line 751
    :try_start_2
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 752
    .line 753
    .line 754
    move-result-object v11

    .line 755
    invoke-virtual {v5, v6, v11}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    const-string v6, "https://stark-gate.zijieapi.com/ttgame/social_pet/closeness/claim"

    .line 759
    .line 760
    invoke-static {v7, v6, v5, v0}, Lpe1;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Lle1;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    iget-object v5, v0, Lle1;->γ:Lorg/json/JSONObject;

    .line 765
    .line 766
    const/4 v6, 0x0

    .line 767
    invoke-static {v6, v5}, Lpe1;->δ(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 768
    .line 769
    .line 770
    move-result-object v11

    .line 771
    if-eqz v11, :cond_19

    .line 772
    .line 773
    invoke-virtual {v3, v11}, Lpe1;->η(Lorg/json/JSONObject;)Lne1;

    .line 774
    .line 775
    .line 776
    move-result-object v6

    .line 777
    goto :goto_10

    .line 778
    :catchall_0
    move-exception v0

    .line 779
    goto :goto_12

    .line 780
    :cond_19
    const/4 v6, 0x0

    .line 781
    :goto_10
    new-instance v42, Lme1;

    .line 782
    .line 783
    iget v11, v0, Lle1;->α:I

    .line 784
    .line 785
    iget-object v0, v0, Lle1;->β:Ljava/lang/Integer;

    .line 786
    .line 787
    invoke-static {v5, v6}, Lpe1;->α(Lorg/json/JSONObject;Lne1;)I

    .line 788
    .line 789
    .line 790
    move-result v45

    .line 791
    invoke-static {v5}, Lpe1;->β(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v46

    .line 795
    move-object/from16 v44, v0

    .line 796
    .line 797
    move-object/from16 v47, v6

    .line 798
    .line 799
    move/from16 v43, v11

    .line 800
    .line 801
    invoke-direct/range {v42 .. v47}, Lme1;-><init>(ILjava/lang/Integer;ILjava/lang/String;Lne1;)V

    .line 802
    .line 803
    .line 804
    move-object/from16 v5, v42

    .line 805
    .line 806
    goto :goto_13

    .line 807
    :catchall_1
    move-exception v0

    .line 808
    :goto_11
    move-object/from16 v37, v11

    .line 809
    .line 810
    goto :goto_12

    .line 811
    :catchall_2
    move-exception v0

    .line 812
    move-wide/from16 v40, v5

    .line 813
    .line 814
    goto :goto_11

    .line 815
    :cond_1a
    move-wide/from16 v40, v5

    .line 816
    .line 817
    move-object/from16 v39, v7

    .line 818
    .line 819
    move-object/from16 v37, v11

    .line 820
    .line 821
    move-object/from16 v7, p0

    .line 822
    .line 823
    const-string v0, "behaviorId \u5fc5\u987b\u5927\u4e8e 0"

    .line 824
    .line 825
    new-instance v5, Ljava/lang/IllegalArgumentException;

    .line 826
    .line 827
    invoke-direct {v5, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    throw v5

    .line 831
    :cond_1b
    move-wide/from16 v40, v5

    .line 832
    .line 833
    move-object/from16 v39, v7

    .line 834
    .line 835
    move-object/from16 v37, v11

    .line 836
    .line 837
    move-object/from16 v7, p0

    .line 838
    .line 839
    const-string v0, "conversationShortId \u5fc5\u987b\u5927\u4e8e 0"

    .line 840
    .line 841
    new-instance v5, Ljava/lang/IllegalArgumentException;

    .line 842
    .line 843
    invoke-direct {v5, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    throw v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 847
    :goto_12
    new-instance v5, Leo1;

    .line 848
    .line 849
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 850
    .line 851
    .line 852
    :goto_13
    instance-of v0, v5, Leo1;

    .line 853
    .line 854
    const-wide/16 v42, 0xc8

    .line 855
    .line 856
    if-eqz v0, :cond_1e

    .line 857
    .line 858
    add-int/lit8 v24, v24, 0x1

    .line 859
    .line 860
    new-instance v0, Ljava/lang/StringBuilder;

    .line 861
    .line 862
    const-string v1, "\u4eb2\u5bc6\u5ea6\u9886\u53d6\u5931\u8d25 name="

    .line 863
    .line 864
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 868
    .line 869
    .line 870
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 871
    .line 872
    .line 873
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 874
    .line 875
    .line 876
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v0

    .line 880
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 881
    .line 882
    .line 883
    move-result-object v1

    .line 884
    if-nez v1, :cond_1c

    .line 885
    .line 886
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 887
    .line 888
    const-string v2, "\u4eb2\u5bc6\u5ea6\u9886\u53d6\u8fd4\u56de\u672a\u77e5\u9519\u8bef"

    .line 889
    .line 890
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    :cond_1c
    invoke-static {v4, v0, v1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 894
    .line 895
    .line 896
    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayList;->size()I

    .line 897
    .line 898
    .line 899
    move-result v0

    .line 900
    add-int/lit8 v0, v0, -0x1

    .line 901
    .line 902
    if-ge v10, v0, :cond_1d

    .line 903
    .line 904
    invoke-static/range {v42 .. v43}, Lse1;->ε(J)V

    .line 905
    .line 906
    .line 907
    :cond_1d
    move-object/from16 v2, p2

    .line 908
    .line 909
    move-object/from16 v1, v35

    .line 910
    .line 911
    move/from16 v10, v36

    .line 912
    .line 913
    move-object/from16 v15, v38

    .line 914
    .line 915
    move-object/from16 v7, v39

    .line 916
    .line 917
    move-wide/from16 v5, v40

    .line 918
    .line 919
    goto/16 :goto_e

    .line 920
    .line 921
    :cond_1e
    invoke-static {v5}, Li81;->Β(Ljava/lang/Object;)V

    .line 922
    .line 923
    .line 924
    check-cast v5, Lme1;

    .line 925
    .line 926
    iget-object v0, v5, Lme1;->β:Ljava/lang/Integer;

    .line 927
    .line 928
    iget v6, v5, Lme1;->α:I

    .line 929
    .line 930
    iget v11, v5, Lme1;->γ:I

    .line 931
    .line 932
    move-object/from16 v44, v3

    .line 933
    .line 934
    move/from16 v3, v22

    .line 935
    .line 936
    if-ne v6, v3, :cond_26

    .line 937
    .line 938
    new-instance v3, Lxm0;

    .line 939
    .line 940
    move-object/from16 v45, v0

    .line 941
    .line 942
    const/16 v0, 0xc8

    .line 943
    .line 944
    const/16 v7, 0x12b

    .line 945
    .line 946
    move/from16 v46, v10

    .line 947
    .line 948
    const/4 v10, 0x1

    .line 949
    invoke-direct {v3, v0, v7, v10}, Lvm0;-><init>(III)V

    .line 950
    .line 951
    .line 952
    if-eqz v45, :cond_27

    .line 953
    .line 954
    invoke-virtual/range {v45 .. v45}, Ljava/lang/Integer;->intValue()I

    .line 955
    .line 956
    .line 957
    move-result v0

    .line 958
    invoke-virtual {v3, v0}, Lxm0;->α(I)Z

    .line 959
    .line 960
    .line 961
    move-result v0

    .line 962
    if-eqz v0, :cond_27

    .line 963
    .line 964
    const/4 v3, 0x0

    .line 965
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    const v7, 0xf3496

    .line 970
    .line 971
    .line 972
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 973
    .line 974
    .line 975
    move-result-object v10

    .line 976
    filled-new-array {v0, v10}, [Ljava/lang/Integer;

    .line 977
    .line 978
    .line 979
    move-result-object v0

    .line 980
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 985
    .line 986
    .line 987
    move-result-object v10

    .line 988
    invoke-interface {v0, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 989
    .line 990
    .line 991
    move-result v0

    .line 992
    if-eqz v0, :cond_27

    .line 993
    .line 994
    iget-object v0, v5, Lme1;->ε:Lne1;

    .line 995
    .line 996
    if-eqz v0, :cond_27

    .line 997
    .line 998
    if-ne v11, v7, :cond_1f

    .line 999
    .line 1000
    add-int/lit8 v25, v25, 0x1

    .line 1001
    .line 1002
    goto :goto_14

    .line 1003
    :cond_1f
    add-int/lit8 v30, v30, 0x1

    .line 1004
    .line 1005
    :goto_14
    iget-object v5, v1, Lke1;->β:Ljava/lang/String;

    .line 1006
    .line 1007
    if-nez v5, :cond_20

    .line 1008
    .line 1009
    move-object/from16 v5, v27

    .line 1010
    .line 1011
    :cond_20
    iget-object v1, v1, Lke1;->γ:Ljava/lang/Integer;

    .line 1012
    .line 1013
    if-eqz v1, :cond_21

    .line 1014
    .line 1015
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1016
    .line 1017
    .line 1018
    move-result v1

    .line 1019
    goto :goto_15

    .line 1020
    :cond_21
    move/from16 v1, v29

    .line 1021
    .line 1022
    :goto_15
    if-ne v11, v7, :cond_22

    .line 1023
    .line 1024
    const/4 v6, 0x1

    .line 1025
    goto :goto_16

    .line 1026
    :cond_22
    move v6, v3

    .line 1027
    :goto_16
    if-eqz v37, :cond_23

    .line 1028
    .line 1029
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Integer;->intValue()I

    .line 1030
    .line 1031
    .line 1032
    move-result v7

    .line 1033
    goto :goto_17

    .line 1034
    :cond_23
    move/from16 v7, v29

    .line 1035
    .line 1036
    :goto_17
    iget-object v10, v0, Lne1;->α:Ljava/lang/Integer;

    .line 1037
    .line 1038
    if-eqz v10, :cond_24

    .line 1039
    .line 1040
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 1041
    .line 1042
    .line 1043
    move-result v10

    .line 1044
    goto :goto_18

    .line 1045
    :cond_24
    move/from16 v10, v29

    .line 1046
    .line 1047
    :goto_18
    iget-object v11, v0, Lne1;->ε:Ljava/lang/Long;

    .line 1048
    .line 1049
    if-eqz v11, :cond_25

    .line 1050
    .line 1051
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 1052
    .line 1053
    .line 1054
    move-result-wide v47

    .line 1055
    move-object/from16 p3, v4

    .line 1056
    .line 1057
    move-wide/from16 v3, v47

    .line 1058
    .line 1059
    goto :goto_19

    .line 1060
    :cond_25
    move-object/from16 p3, v4

    .line 1061
    .line 1062
    move-wide/from16 v3, v32

    .line 1063
    .line 1064
    :goto_19
    const-string v11, "\u4eb2\u5bc6\u5ea6\u9886\u53d6\u6210\u529f name="

    .line 1065
    .line 1066
    move-object/from16 v37, v0

    .line 1067
    .line 1068
    const-string v0, " behaviorName="

    .line 1069
    .line 1070
    invoke-static {v15, v11, v8, v2, v0}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1075
    .line 1076
    .line 1077
    const-string v2, " amount="

    .line 1078
    .line 1079
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1083
    .line 1084
    .line 1085
    const-string v1, " idempotent="

    .line 1086
    .line 1087
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1097
    .line 1098
    .line 1099
    const-string v1, "->"

    .line 1100
    .line 1101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    move-object/from16 v4, p3

    .line 1118
    .line 1119
    const/4 v3, 0x4

    .line 1120
    const/4 v5, 0x0

    .line 1121
    invoke-static {v4, v0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1122
    .line 1123
    .line 1124
    move-object/from16 v3, v34

    .line 1125
    .line 1126
    move-object/from16 v7, v37

    .line 1127
    .line 1128
    move-object/from16 v5, v38

    .line 1129
    .line 1130
    goto :goto_1b

    .line 1131
    :cond_26
    move-object/from16 v45, v0

    .line 1132
    .line 1133
    move/from16 v46, v10

    .line 1134
    .line 1135
    :cond_27
    add-int/lit8 v24, v24, 0x1

    .line 1136
    .line 1137
    if-eqz v45, :cond_28

    .line 1138
    .line 1139
    invoke-virtual/range {v45 .. v45}, Ljava/lang/Integer;->intValue()I

    .line 1140
    .line 1141
    .line 1142
    move-result v0

    .line 1143
    goto :goto_1a

    .line 1144
    :cond_28
    move/from16 v0, v29

    .line 1145
    .line 1146
    :goto_1a
    iget-object v1, v5, Lme1;->δ:Ljava/lang/String;

    .line 1147
    .line 1148
    if-nez v1, :cond_29

    .line 1149
    .line 1150
    move-object/from16 v1, v27

    .line 1151
    .line 1152
    :cond_29
    const-string v3, "\u4eb2\u5bc6\u5ea6\u9886\u53d6\u4e1a\u52a1\u5931\u8d25 name="

    .line 1153
    .line 1154
    invoke-static {v15, v3, v8, v2, v14}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v2

    .line 1158
    move-object/from16 v3, v34

    .line 1159
    .line 1160
    invoke-static {v2, v6, v13, v0, v3}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1164
    .line 1165
    .line 1166
    move-object/from16 v5, v38

    .line 1167
    .line 1168
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v0

    .line 1178
    const/4 v1, 0x4

    .line 1179
    const/4 v7, 0x0

    .line 1180
    invoke-static {v4, v0, v7, v1, v7}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1181
    .line 1182
    .line 1183
    move-object/from16 v7, v39

    .line 1184
    .line 1185
    :goto_1b
    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayList;->size()I

    .line 1186
    .line 1187
    .line 1188
    move-result v0

    .line 1189
    const/16 v22, 0x1

    .line 1190
    .line 1191
    add-int/lit8 v0, v0, -0x1

    .line 1192
    .line 1193
    move/from16 v6, v46

    .line 1194
    .line 1195
    if-ge v6, v0, :cond_2a

    .line 1196
    .line 1197
    invoke-static/range {v42 .. v43}, Lse1;->ε(J)V

    .line 1198
    .line 1199
    .line 1200
    :cond_2a
    move-object/from16 v2, p2

    .line 1201
    .line 1202
    move-object/from16 v34, v3

    .line 1203
    .line 1204
    move-object v15, v5

    .line 1205
    move-object/from16 v1, v35

    .line 1206
    .line 1207
    move/from16 v10, v36

    .line 1208
    .line 1209
    :goto_1c
    move-wide/from16 v5, v40

    .line 1210
    .line 1211
    move-object/from16 v3, v44

    .line 1212
    .line 1213
    const/16 v22, 0x1

    .line 1214
    .line 1215
    goto/16 :goto_e

    .line 1216
    .line 1217
    :cond_2b
    move-object/from16 v44, v3

    .line 1218
    .line 1219
    move-wide/from16 v40, v5

    .line 1220
    .line 1221
    move-object/from16 v39, v7

    .line 1222
    .line 1223
    move v6, v10

    .line 1224
    move-object/from16 v3, v34

    .line 1225
    .line 1226
    move-object/from16 v5, v38

    .line 1227
    .line 1228
    move-object/from16 v34, v3

    .line 1229
    .line 1230
    move-object v15, v5

    .line 1231
    move v10, v6

    .line 1232
    move/from16 v11, v36

    .line 1233
    .line 1234
    move-object/from16 v0, v37

    .line 1235
    .line 1236
    move-object/from16 v7, v39

    .line 1237
    .line 1238
    move-wide/from16 v5, v40

    .line 1239
    .line 1240
    move-object/from16 v3, v44

    .line 1241
    .line 1242
    const/16 v22, 0x1

    .line 1243
    .line 1244
    goto/16 :goto_f

    .line 1245
    .line 1246
    :goto_1d
    iget v0, v1, Lke1;->α:I

    .line 1247
    .line 1248
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1249
    .line 1250
    const-string v6, "\u4eb2\u5bc6\u5ea6\u884c\u4e3a\u5df2\u7531\u6700\u65b0\u54cd\u5e94\u79fb\u9664\uff0c\u8df3\u8fc7 name="

    .line 1251
    .line 1252
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1256
    .line 1257
    .line 1258
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v0

    .line 1268
    const/4 v1, 0x4

    .line 1269
    const/4 v7, 0x0

    .line 1270
    invoke-static {v4, v0, v7, v1, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1271
    .line 1272
    .line 1273
    move-object/from16 v2, p2

    .line 1274
    .line 1275
    move-object/from16 v34, v3

    .line 1276
    .line 1277
    move-object v15, v5

    .line 1278
    move-object/from16 v1, v35

    .line 1279
    .line 1280
    move/from16 v10, v36

    .line 1281
    .line 1282
    move-object/from16 v7, v39

    .line 1283
    .line 1284
    goto :goto_1c

    .line 1285
    :cond_2c
    :goto_1e
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    .line 1286
    .line 1287
    .line 1288
    move-result v0

    .line 1289
    const/16 v22, 0x1

    .line 1290
    .line 1291
    add-int/lit8 v0, v0, -0x1

    .line 1292
    .line 1293
    move/from16 v8, v31

    .line 1294
    .line 1295
    if-ge v8, v0, :cond_2d

    .line 1296
    .line 1297
    invoke-static/range {v19 .. v20}, Lse1;->ε(J)V

    .line 1298
    .line 1299
    .line 1300
    :cond_2d
    move-object/from16 v1, p0

    .line 1301
    .line 1302
    move-object/from16 v2, p2

    .line 1303
    .line 1304
    move-object/from16 v3, v17

    .line 1305
    .line 1306
    move-object/from16 v7, v18

    .line 1307
    .line 1308
    move/from16 v9, v21

    .line 1309
    .line 1310
    move/from16 v11, v23

    .line 1311
    .line 1312
    move/from16 v15, v24

    .line 1313
    .line 1314
    move/from16 v13, v25

    .line 1315
    .line 1316
    move/from16 v14, v26

    .line 1317
    .line 1318
    goto/16 :goto_6

    .line 1319
    .line 1320
    :cond_2e
    const-string v0, "Required value was null."

    .line 1321
    .line 1322
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 1323
    .line 1324
    .line 1325
    const/16 v16, 0x0

    .line 1326
    .line 1327
    return-object v16

    .line 1328
    :goto_1f
    const-string v0, ", \u9886\u53d6 "

    .line 1329
    .line 1330
    const-string v1, ", \u5e42\u7b49 "

    .line 1331
    .line 1332
    const-string v2, "\u4eb2\u5bc6\u5ea6\u9886\u53d6\u5b8c\u6210: \u4f1a\u8bdd "

    .line 1333
    .line 1334
    move/from16 v11, v28

    .line 1335
    .line 1336
    move/from16 v12, v30

    .line 1337
    .line 1338
    invoke-static {v2, v11, v0, v12, v1}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v0

    .line 1342
    const-string v1, ", \u8df3\u8fc7 "

    .line 1343
    .line 1344
    const-string v2, ", \u5931\u8d25 "

    .line 1345
    .line 1346
    move/from16 v13, v25

    .line 1347
    .line 1348
    move/from16 v14, v26

    .line 1349
    .line 1350
    invoke-static {v0, v13, v1, v14, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 1351
    .line 1352
    .line 1353
    move/from16 v15, v24

    .line 1354
    .line 1355
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1356
    .line 1357
    .line 1358
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v0

    .line 1362
    const/4 v3, 0x4

    .line 1363
    const/4 v5, 0x0

    .line 1364
    invoke-static {v4, v0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1365
    .line 1366
    .line 1367
    new-instance v10, Lqe1;

    .line 1368
    .line 1369
    move-object/from16 v16, v0

    .line 1370
    .line 1371
    invoke-direct/range {v10 .. v16}, Lqe1;-><init>(IIIIILjava/lang/String;)V

    .line 1372
    .line 1373
    .line 1374
    return-object v10
.end method

.method public static γ()Z
    .locals 2

    .line 1
    invoke-static {}, Lx9;->η()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-static {}, Lui1;->Α()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v0, "pet_elf_closeness_auto_claim_enabled"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_1
    :goto_0
    return v1
.end method

.method public static δ(Landroid/app/Activity;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lse1;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lse1;->γ()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Lse1;->α()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-lez v0, :cond_1

    .line 30
    .line 31
    sget-object v0, Lse1;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    sget-object p0, Lse1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_2

    .line 53
    .line 54
    :goto_0
    return-void

    .line 55
    :cond_2
    new-instance p0, Ljava/lang/Thread;

    .line 56
    .line 57
    new-instance v0, Lfb0;

    .line 58
    .line 59
    const/16 v2, 0xe

    .line 60
    .line 61
    invoke-direct {v0, v2}, Lfb0;-><init>(I)V

    .line 62
    .line 63
    .line 64
    const-string v2, "rf4bb6f7ffb728a62"

    .line 65
    .line 66
    invoke-direct {p0, v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static ε(J)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static ζ()Ljava/util/List;
    .locals 4

    .line 1
    sget-object v0, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-static {v0}, Lex0;->Ο(Ljava/util/Map;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-static {v0}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lf71;

    .line 18
    .line 19
    const/16 v2, 0x1a

    .line 20
    .line 21
    invoke-direct {v1, v2}, Lf71;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Ly30;

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-direct {v2, v0, v3, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lib1;

    .line 31
    .line 32
    const/16 v1, 0x9

    .line 33
    .line 34
    invoke-direct {v0, v1}, Lib1;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1, v0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_0

    .line 53
    .line 54
    sget-object v0, Ljz;->ε:Ljz;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-static {v1}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_2

    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    move-object v0, v1

    .line 91
    :goto_1
    return-object v0
.end method

.method public static η(ILp70;)Z
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    int-to-long v2, p0

    .line 6
    const-wide/16 v4, 0x3e8

    .line 7
    .line 8
    mul-long/2addr v2, v4

    .line 9
    add-long/2addr v2, v0

    .line 10
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    cmp-long p0, v0, v2

    .line 15
    .line 16
    if-gez p0, :cond_2

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_0
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_1
    const-wide/16 v0, 0x1f4

    .line 45
    .line 46
    invoke-static {v0, v1}, Lse1;->ε(J)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    return p0
.end method
