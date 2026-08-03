.class public final L۟/x8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ۟۠:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final ۥ:L۟/z7;

.field public final ۥ۟:L۟/w8$a;

.field public ۥ۟۟:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, L۟/x8;->ۥ۟۠:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(L۟/z7;Landroid/net/Uri;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L۟/x8;->ۥ:L۟/z7;

    new-instance v0, L۟/w8$a;

    iget-object p1, p1, L۟/z7;->ۥ۟ۦ:Landroid/graphics/Bitmap$Config;

    invoke-direct {v0, p2, p1}, L۟/w8$a;-><init>(Landroid/net/Uri;Landroid/graphics/Bitmap$Config;)V

    iput-object v0, p0, L۟/x8;->ۥ۟:L۟/w8$a;

    return-void
.end method


# virtual methods
.method public final ۥ(Landroid/widget/ImageView;L۟/f0;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    sget-object v4, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    if-ne v4, v5, :cond_0

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v4, 0x0

    .line 28
    :goto_0
    if-eqz v4, :cond_f

    .line 29
    .line 30
    iget-object v4, v0, L۟/x8;->ۥ۟:L۟/w8$a;

    .line 31
    .line 32
    iget-object v5, v4, L۟/w8$a;->ۥ:Landroid/net/Uri;

    .line 33
    .line 34
    if-nez v5, :cond_2

    .line 35
    .line 36
    iget v4, v4, L۟/w8$a;->ۥ۟:I

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 v4, 0x0

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    :goto_1
    const/4 v4, 0x1

    .line 44
    :goto_2
    const/4 v5, 0x0

    .line 45
    if-nez v4, :cond_4

    .line 46
    .line 47
    iget-object v1, v0, L۟/x8;->ۥ:L۟/z7;

    .line 48
    .line 49
    invoke-virtual {v1, v3}, L۟/z7;->ۥ(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object v1, L۟/a8;->ۥ۟ۤ:Landroid/graphics/Paint;

    .line 53
    .line 54
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual/range {p1 .. p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    instance-of v1, v1, Landroid/graphics/drawable/AnimationDrawable;

    .line 62
    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-virtual/range {p1 .. p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Landroid/graphics/drawable/AnimationDrawable;

    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 72
    .line 73
    .line 74
    :cond_3
    return-void

    .line 75
    :cond_4
    sget-object v4, L۟/x8;->ۥ۟۠:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    iget-object v5, v0, L۟/x8;->ۥ۟:L۟/w8$a;

    .line 82
    .line 83
    iget v8, v5, L۟/w8$a;->ۥ۟۠:I

    .line 84
    .line 85
    if-nez v8, :cond_5

    .line 86
    .line 87
    const/4 v8, 0x2

    .line 88
    iput v8, v5, L۟/w8$a;->ۥ۟۠:I

    .line 89
    .line 90
    :cond_5
    new-instance v8, L۟/w8;

    .line 91
    .line 92
    iget-object v15, v5, L۟/w8$a;->ۥ:Landroid/net/Uri;

    .line 93
    .line 94
    iget v14, v5, L۟/w8$a;->ۥ۟:I

    .line 95
    .line 96
    const/4 v13, 0x0

    .line 97
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    const/4 v12, 0x0

    .line 101
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v11, v5, L۟/w8$a;->ۥ۟۟:Landroid/graphics/Bitmap$Config;

    .line 105
    .line 106
    iget v5, v5, L۟/w8$a;->ۥ۟۠:I

    .line 107
    .line 108
    move-object v9, v8

    .line 109
    move-object v10, v15

    .line 110
    move-object/from16 v16, v11

    .line 111
    .line 112
    move v11, v14

    .line 113
    move/from16 v17, v12

    .line 114
    .line 115
    move v12, v13

    .line 116
    move v6, v13

    .line 117
    move/from16 v13, v17

    .line 118
    .line 119
    move v7, v14

    .line 120
    move-object/from16 v14, v16

    .line 121
    .line 122
    move-object/from16 v16, v15

    .line 123
    .line 124
    move v15, v5

    .line 125
    invoke-direct/range {v9 .. v15}, L۟/w8;-><init>(Landroid/net/Uri;IIILandroid/graphics/Bitmap$Config;I)V

    .line 126
    .line 127
    .line 128
    iput v4, v8, L۟/w8;->ۥ:I

    .line 129
    .line 130
    iput-wide v1, v8, L۟/w8;->ۥ۟:J

    .line 131
    .line 132
    iget-object v1, v0, L۟/x8;->ۥ:L۟/z7;

    .line 133
    .line 134
    iget-boolean v1, v1, L۟/z7;->ۥ۟ۨ:Z

    .line 135
    .line 136
    if-eqz v1, :cond_6

    .line 137
    .line 138
    invoke-virtual {v8}, L۟/w8;->ۥ۟۠()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v8}, L۟/w8;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    :cond_6
    iget-object v1, v0, L۟/x8;->ۥ:L۟/z7;

    .line 145
    .line 146
    iget-object v1, v1, L۟/z7;->ۥ:L۟/z7$f;

    .line 147
    .line 148
    check-cast v1, L۟/z7$f$a;

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    sget-object v1, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const/16 v2, 0x32

    .line 156
    .line 157
    if-eqz v16, :cond_7

    .line 158
    .line 159
    invoke-virtual/range {v16 .. v16}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    add-int/2addr v5, v2

    .line 168
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->ensureCapacity(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_7
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->ensureCapacity(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    :goto_3
    const/16 v2, 0xa

    .line 182
    .line 183
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const/4 v4, 0x0

    .line 187
    cmpl-float v5, v4, v4

    .line 188
    .line 189
    const/16 v7, 0x78

    .line 190
    .line 191
    if-eqz v5, :cond_8

    .line 192
    .line 193
    const-string v5, "rotation:"

    .line 194
    .line 195
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    :cond_8
    invoke-virtual {v8}, L۟/w8;->ۥ()Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-eqz v4, :cond_9

    .line 209
    .line 210
    const-string v4, "resize:"

    .line 211
    .line 212
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    move/from16 v4, v17

    .line 222
    .line 223
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    :cond_9
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    sget-object v1, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 234
    .line 235
    const/4 v2, 0x0

    .line 236
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 237
    .line 238
    .line 239
    iget-object v1, v0, L۟/x8;->ۥ:L۟/z7;

    .line 240
    .line 241
    iget-object v4, v1, L۟/z7;->ۥ۟ۡ:L۟/e0;

    .line 242
    .line 243
    check-cast v4, L۟/h5;

    .line 244
    .line 245
    invoke-virtual {v4, v5}, L۟/h5;->ۥ(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    iget-object v1, v1, L۟/z7;->ۥ۟ۢ:L۟/fa;

    .line 250
    .line 251
    if-eqz v4, :cond_a

    .line 252
    .line 253
    iget-object v1, v1, L۟/fa;->ۥ۟:L۟/fa$a;

    .line 254
    .line 255
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 256
    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_a
    iget-object v1, v1, L۟/fa;->ۥ۟:L۟/fa$a;

    .line 260
    .line 261
    const/4 v2, 0x1

    .line 262
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 263
    .line 264
    .line 265
    :goto_4
    if-eqz v4, :cond_d

    .line 266
    .line 267
    iget-object v1, v0, L۟/x8;->ۥ:L۟/z7;

    .line 268
    .line 269
    invoke-virtual {v1, v3}, L۟/z7;->ۥ(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    iget-object v1, v0, L۟/x8;->ۥ:L۟/z7;

    .line 273
    .line 274
    iget-object v2, v1, L۟/z7;->ۥ۟۟:Landroid/content/Context;

    .line 275
    .line 276
    sget-object v7, L۟/z7$e;->ۥ۟:L۟/z7$e;

    .line 277
    .line 278
    iget-boolean v5, v0, L۟/x8;->ۥ۟۟:Z

    .line 279
    .line 280
    iget-boolean v6, v1, L۟/z7;->ۥ۟ۧ:Z

    .line 281
    .line 282
    move-object/from16 v1, p1

    .line 283
    .line 284
    move-object v3, v4

    .line 285
    move-object v4, v7

    .line 286
    invoke-static/range {v1 .. v6}, L۟/a8;->ۥ۟(Landroid/widget/ImageView;Landroid/content/Context;Landroid/graphics/Bitmap;L۟/z7$e;ZZ)V

    .line 287
    .line 288
    .line 289
    iget-object v1, v0, L۟/x8;->ۥ:L۟/z7;

    .line 290
    .line 291
    iget-boolean v1, v1, L۟/z7;->ۥ۟ۨ:Z

    .line 292
    .line 293
    if-eqz v1, :cond_b

    .line 294
    .line 295
    invoke-virtual {v8}, L۟/w8;->ۥ۟۠()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    :cond_b
    if-eqz p2, :cond_c

    .line 302
    .line 303
    invoke-interface/range {p2 .. p2}, L۟/f0;->ۥ۟()V

    .line 304
    .line 305
    .line 306
    :cond_c
    return-void

    .line 307
    :cond_d
    sget-object v1, L۟/a8;->ۥ۟ۤ:Landroid/graphics/Paint;

    .line 308
    .line 309
    const/4 v1, 0x0

    .line 310
    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {p1 .. p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    instance-of v1, v1, Landroid/graphics/drawable/AnimationDrawable;

    .line 318
    .line 319
    if-eqz v1, :cond_e

    .line 320
    .line 321
    invoke-virtual/range {p1 .. p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    check-cast v1, Landroid/graphics/drawable/AnimationDrawable;

    .line 326
    .line 327
    invoke-virtual {v1}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 328
    .line 329
    .line 330
    :cond_e
    new-instance v9, L۟/b4;

    .line 331
    .line 332
    iget-object v2, v0, L۟/x8;->ۥ:L۟/z7;

    .line 333
    .line 334
    iget-boolean v7, v0, L۟/x8;->ۥ۟۟:Z

    .line 335
    .line 336
    move-object v1, v9

    .line 337
    move-object/from16 v3, p1

    .line 338
    .line 339
    move-object v4, v8

    .line 340
    move-object/from16 v6, p2

    .line 341
    .line 342
    invoke-direct/range {v1 .. v7}, L۟/b4;-><init>(L۟/z7;Landroid/widget/ImageView;L۟/w8;Ljava/lang/String;L۟/f0;Z)V

    .line 343
    .line 344
    .line 345
    iget-object v1, v0, L۟/x8;->ۥ:L۟/z7;

    .line 346
    .line 347
    invoke-virtual {v1, v9}, L۟/z7;->ۥ۟۟(L۟/f;)V

    .line 348
    .line 349
    .line 350
    return-void

    .line 351
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 352
    .line 353
    const-string v2, "Method call should happen from the main thread."

    .line 354
    .line 355
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    throw v1
.end method
