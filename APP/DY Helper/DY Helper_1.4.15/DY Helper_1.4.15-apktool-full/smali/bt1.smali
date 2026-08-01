.class public final Lbt1;
.super Landroid/app/Fragment;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public ε:I

.field public ζ:Ljava/lang/String;

.field public η:Le80;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lbt1;->ε:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "DYHelper"

    .line 6
    .line 7
    const-string v3, "\u64cd\u4f5c\u5931\u8d25: "

    .line 8
    .line 9
    const-string v4, "\u7528\u6237\u914d\u7f6e\u5bfc\u51fa\u6210\u529f: "

    .line 10
    .line 11
    const-string v5, "\u7528\u6237\u914d\u7f6e\u5bfc\u5165\u5931\u8d25\u9879: "

    .line 12
    .line 13
    const-string v6, "\u5bfc\u5165\u5b8c\u6210\u4f46\u6709 "

    .line 14
    .line 15
    const-string v7, "\u7528\u6237\u914d\u7f6e\u5bfc\u5165\u6210\u529f\uff1a"

    .line 16
    .line 17
    invoke-super/range {p0 .. p3}, Landroid/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 18
    .line 19
    .line 20
    const/16 v8, 0x3eb

    .line 21
    .line 22
    if-eq v0, v8, :cond_0

    .line 23
    .line 24
    const/16 v9, 0x3ec

    .line 25
    .line 26
    if-eq v0, v9, :cond_0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    const/4 v9, -0x1

    .line 30
    const/4 v10, 0x1

    .line 31
    move/from16 v11, p2

    .line 32
    .line 33
    if-ne v11, v9, :cond_10

    .line 34
    .line 35
    const/4 v9, 0x0

    .line 36
    if-eqz p3, :cond_1

    .line 37
    .line 38
    invoke-virtual/range {p3 .. p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object v11

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v11, v9

    .line 44
    :goto_0
    if-nez v11, :cond_2

    .line 45
    .line 46
    goto/16 :goto_8

    .line 47
    .line 48
    :cond_2
    invoke-virtual {v1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    invoke-virtual/range {p3 .. p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 53
    .line 54
    .line 55
    move-result-object v12

    .line 56
    if-eqz v11, :cond_e

    .line 57
    .line 58
    if-nez v12, :cond_3

    .line 59
    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_3
    :try_start_0
    iget v13, v1, Lbt1;->ε:I

    .line 63
    .line 64
    const/4 v14, 0x4

    .line 65
    if-eq v13, v10, :cond_9

    .line 66
    .line 67
    if-ne v0, v8, :cond_4

    .line 68
    .line 69
    goto/16 :goto_2

    .line 70
    .line 71
    :cond_4
    invoke-virtual {v11}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0, v12}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 76
    .line 77
    .line 78
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    if-eqz v4, :cond_8

    .line 80
    .line 81
    :try_start_1
    new-instance v0, Ljava/lang/String;

    .line 82
    .line 83
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/io/InputStream;->available()I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    const/16 v12, 0x2000

    .line 90
    .line 91
    invoke-static {v12, v10}, Ljava/lang/Math;->max(II)I

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    invoke-direct {v8, v10}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-static {v4, v8, v12}, Lh62;->Δ(Ljava/io/InputStream;Ljava/io/OutputStream;I)J

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    sget-object v10, Lmf;->α:Ljava/nio/charset/Charset;

    .line 109
    .line 110
    invoke-direct {v0, v8, v10}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 111
    .line 112
    .line 113
    :try_start_2
    invoke-interface {v4}, Ljava/io/Closeable;->close()V

    .line 114
    .line 115
    .line 116
    invoke-static {}, Lui1;->Α()Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-nez v4, :cond_5

    .line 121
    .line 122
    invoke-virtual {v11}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-static {v4}, Lui1;->π(Landroid/content/Context;)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    goto/16 :goto_4

    .line 135
    .line 136
    :cond_5
    :goto_1
    invoke-static {v0}, Lui1;->ο(Ljava/lang/String;)Lti1;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget-object v15, v0, Lti1;->δ:Ljava/util/List;

    .line 141
    .line 142
    iget-boolean v4, v0, Lti1;->α:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 143
    .line 144
    iget-object v8, v1, Lbt1;->η:Le80;

    .line 145
    .line 146
    if-eqz v4, :cond_6

    .line 147
    .line 148
    if-eqz v8, :cond_b

    .line 149
    .line 150
    :try_start_3
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 151
    .line 152
    iget v5, v0, Lti1;->β:I

    .line 153
    .line 154
    iget v0, v0, Lti1;->γ:I

    .line 155
    .line 156
    new-instance v6, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v5, " \u4e2a\u914d\u7f6e\u6587\u4ef6\uff0c"

    .line 165
    .line 166
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v0, " \u4e2a\u9009\u9879"

    .line 173
    .line 174
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-interface {v8, v4, v0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    goto/16 :goto_3

    .line 185
    .line 186
    :cond_6
    if-eqz v8, :cond_7

    .line 187
    .line 188
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 189
    .line 190
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    new-instance v7, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string v4, " \u9879\u5931\u8d25\uff0c\u8bf7\u67e5\u770b DyLog"

    .line 203
    .line 204
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-interface {v8, v0, v4}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    :cond_7
    const-string v16, "; "

    .line 215
    .line 216
    const/16 v20, 0x0

    .line 217
    .line 218
    const/16 v21, 0x3e

    .line 219
    .line 220
    const/16 v17, 0x0

    .line 221
    .line 222
    const/16 v18, 0x0

    .line 223
    .line 224
    const/16 v19, 0x0

    .line 225
    .line 226
    invoke-static/range {v15 .. v21}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-static {v2, v0, v9, v14, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :catchall_1
    move-exception v0

    .line 239
    move-object v5, v0

    .line 240
    :try_start_4
    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 241
    :catchall_2
    move-exception v0

    .line 242
    :try_start_5
    invoke-static {v4, v5}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 243
    .line 244
    .line 245
    throw v0

    .line 246
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 247
    .line 248
    const-string v4, "\u65e0\u6cd5\u8bfb\u53d6\u6587\u4ef6"

    .line 249
    .line 250
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw v0

    .line 254
    :cond_9
    :goto_2
    iget-object v0, v1, Lbt1;->ζ:Ljava/lang/String;

    .line 255
    .line 256
    if-nez v0, :cond_a

    .line 257
    .line 258
    const-string v0, ""

    .line 259
    .line 260
    :cond_a
    invoke-virtual {v11}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    invoke-virtual {v5, v12}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 265
    .line 266
    .line 267
    move-result-object v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 268
    if-eqz v5, :cond_c

    .line 269
    .line 270
    :try_start_6
    sget-object v6, Lmf;->α:Ljava/nio/charset/Charset;

    .line 271
    .line 272
    invoke-virtual {v0, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v5, v0}, Ljava/io/OutputStream;->write([B)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v5}, Ljava/io/OutputStream;->flush()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 283
    .line 284
    .line 285
    :try_start_7
    invoke-interface {v5}, Ljava/io/Closeable;->close()V

    .line 286
    .line 287
    .line 288
    new-instance v0, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-static {v2, v0, v9, v14, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    iget-object v0, v1, Lbt1;->η:Le80;

    .line 304
    .line 305
    if-eqz v0, :cond_b

    .line 306
    .line 307
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 308
    .line 309
    const-string v5, "\u7528\u6237\u914d\u7f6e\u5bfc\u51fa\u6210\u529f"

    .line 310
    .line 311
    invoke-interface {v0, v4, v5}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 312
    .line 313
    .line 314
    :cond_b
    :goto_3
    invoke-virtual {v1}, Lbt1;->α()V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :catchall_3
    move-exception v0

    .line 319
    move-object v4, v0

    .line 320
    :try_start_8
    throw v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 321
    :catchall_4
    move-exception v0

    .line 322
    :try_start_9
    invoke-static {v5, v4}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 323
    .line 324
    .line 325
    throw v0

    .line 326
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 327
    .line 328
    const-string v4, "\u65e0\u6cd5\u6253\u5f00\u8f93\u51fa\u6d41"

    .line 329
    .line 330
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 334
    :goto_4
    :try_start_a
    const-string v4, "\u7528\u6237\u914d\u7f6e\u5bfc\u5165\u5bfc\u51fa\u5931\u8d25"

    .line 335
    .line 336
    invoke-static {v2, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 337
    .line 338
    .line 339
    iget-object v2, v1, Lbt1;->η:Le80;

    .line 340
    .line 341
    if-eqz v2, :cond_d

    .line 342
    .line 343
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    new-instance v5, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-interface {v2, v4, v0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 362
    .line 363
    .line 364
    goto :goto_5

    .line 365
    :catchall_5
    move-exception v0

    .line 366
    goto :goto_6

    .line 367
    :cond_d
    :goto_5
    invoke-virtual {v1}, Lbt1;->α()V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :goto_6
    invoke-virtual {v1}, Lbt1;->α()V

    .line 372
    .line 373
    .line 374
    throw v0

    .line 375
    :cond_e
    :goto_7
    iget-object v0, v1, Lbt1;->η:Le80;

    .line 376
    .line 377
    if-eqz v0, :cond_f

    .line 378
    .line 379
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 380
    .line 381
    const-string v3, "\u64cd\u4f5c\u5931\u8d25\uff1a\u4e0a\u4e0b\u6587\u4e3a\u7a7a"

    .line 382
    .line 383
    invoke-interface {v0, v2, v3}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    :cond_f
    invoke-virtual {v1}, Lbt1;->α()V

    .line 387
    .line 388
    .line 389
    return-void

    .line 390
    :cond_10
    :goto_8
    iget-object v0, v1, Lbt1;->η:Le80;

    .line 391
    .line 392
    if-eqz v0, :cond_12

    .line 393
    .line 394
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 395
    .line 396
    iget v3, v1, Lbt1;->ε:I

    .line 397
    .line 398
    if-ne v3, v10, :cond_11

    .line 399
    .line 400
    const-string v3, "\u5bfc\u51fa\u53d6\u6d88"

    .line 401
    .line 402
    goto :goto_9

    .line 403
    :cond_11
    const-string v3, "\u5bfc\u5165\u53d6\u6d88"

    .line 404
    .line 405
    :goto_9
    invoke-interface {v0, v2, v3}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    :cond_12
    invoke-virtual {v1}, Lbt1;->α()V

    .line 409
    .line 410
    .line 411
    return-void
.end method

.method public final α()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Fragment;->getFragmentManager()Landroid/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
