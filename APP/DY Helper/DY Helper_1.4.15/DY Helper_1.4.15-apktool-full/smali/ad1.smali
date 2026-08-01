.class public final Lad1;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lad1;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Lm01;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 7
    iput p1, p0, Lad1;->α:I

    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method

.method private final α(Lk01;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-static {p1, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    sget-object p1, Lry1;->α:Lry1;

    .line 18
    .line 19
    const-string p1, "getConversationId"

    .line 20
    .line 21
    invoke-static {p0, p1}, Lry1;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    instance-of v0, p1, Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    check-cast p1, Ljava/lang/String;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    :goto_0
    if-nez p1, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    const-string v0, "getSender"

    .line 37
    .line 38
    const-wide/16 v1, 0x0

    .line 39
    .line 40
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v0, p0, v3}, Lry1;->ν(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    sget-object p0, Lry1;->σ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 57
    .line 58
    .line 59
    move-result-wide v5

    .line 60
    cmp-long p0, v5, v1

    .line 61
    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    cmp-long p0, v3, v5

    .line 65
    .line 66
    if-nez p0, :cond_3

    .line 67
    .line 68
    invoke-static {p1}, Lry1;->Н(Ljava/lang/String;)Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    :cond_3
    :goto_1
    return-void

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    sget-object p1, Lry1;->α:Lry1;

    .line 74
    .line 75
    const-string p1, "\u81ea\u8eab\u6d88\u606f\u8ffd\u8e2a\u5f02\u5e38"

    .line 76
    .line 77
    invoke-static {p1, p0}, Lry1;->э(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lad1;->α:I

    .line 6
    .line 7
    const-string v3, "precise_time_enabled"

    .line 8
    .line 9
    const/high16 v6, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x3

    .line 13
    const/4 v9, 0x2

    .line 14
    const/4 v10, 0x1

    .line 15
    const/4 v11, 0x0

    .line 16
    const/4 v12, 0x0

    .line 17
    packed-switch v2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    :pswitch_0
    invoke-super/range {p0 .. p1}, Lm01;->afterHookedMethod(Lk01;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    invoke-direct/range {p0 .. p1}, Lad1;->α(Lk01;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v1, Lry1;->ω:Ljava/util/concurrent/atomic/AtomicReference;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    :try_start_0
    sget-object v2, Lry1;->α:Lry1;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    const-string v3, "getContent"

    .line 48
    .line 49
    invoke-static {v0, v3}, Lry1;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    instance-of v4, v3, Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    move-object v12, v3

    .line 58
    check-cast v12, Ljava/lang/String;

    .line 59
    .line 60
    :cond_1
    if-eqz v12, :cond_2

    .line 61
    .line 62
    const-string v3, "\"text\""

    .line 63
    .line 64
    invoke-static {v12, v3, v11}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    invoke-static {v0}, Lry1;->π(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Lry1;->ο()V

    .line 80
    .line 81
    .line 82
    const-string v0, "\u5df2\u4ece Message#setConversationId \u6355\u83b7\u6d88\u606f\u6a21\u677f"

    .line 83
    .line 84
    invoke-static {v0}, Lry1;->щ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    sget-object v1, Lry1;->α:Lry1;

    .line 90
    .line 91
    const-string v1, "\u6d88\u606f\u6a21\u677f\u6355\u83b7\u5f02\u5e38"

    .line 92
    .line 93
    invoke-static {v1, v0}, Lry1;->э(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    :goto_0
    return-void

    .line 97
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    sget-object v0, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 101
    .line 102
    iget-object v1, v1, Lk01;->β:Ljava/lang/Object;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget-object v0, Lry1;->α:Lry1;

    .line 108
    .line 109
    invoke-static {v1}, Lry1;->ξ(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    sget-object v0, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 117
    .line 118
    iget-object v1, v1, Lk01;->β:Ljava/lang/Object;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    sget-object v0, Lry1;->α:Lry1;

    .line 124
    .line 125
    invoke-static {v1}, Lry1;->ξ(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    const-string v0, "\u5df2\u4ece IMSdkContext.init \u6355\u83b7\u5b9e\u4f8b"

    .line 129
    .line 130
    invoke-static {v0}, Lry1;->ю(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    sget-object v0, Lbe0;->α:Lbe0;

    .line 138
    .line 139
    invoke-virtual {v0}, Lbe0;->η()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-nez v0, :cond_3

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_3
    :try_start_1
    iget-object v0, v1, Lk01;->ε:Ljava/lang/Object;

    .line 147
    .line 148
    instance-of v2, v0, Ljava/util/List;

    .line 149
    .line 150
    if-eqz v2, :cond_4

    .line 151
    .line 152
    check-cast v0, Ljava/util/List;

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_4
    move-object v0, v12

    .line 156
    :goto_1
    if-nez v0, :cond_5

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    invoke-static {v0}, Lvd0;->ε(Ljava/util/List;)Ltd0;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    iget-object v2, v0, Ltd0;->α:Ljava/util/ArrayList;

    .line 164
    .line 165
    iget-boolean v0, v0, Ltd0;->β:Z

    .line 166
    .line 167
    if-eqz v0, :cond_6

    .line 168
    .line 169
    move-object v12, v2

    .line 170
    :cond_6
    if-nez v12, :cond_7

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-direct {v0, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v0}, Lk01;->α(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    sget-object v0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :catchall_1
    move-exception v0

    .line 185
    new-instance v1, Leo1;

    .line 186
    .line 187
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    move-object v0, v1

    .line 191
    :goto_2
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    if-eqz v0, :cond_8

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    const-string v1, "share search callback failed: "

    .line 202
    .line 203
    const-string v2, "rac25e39d95f0abcc"

    .line 204
    .line 205
    invoke-static {v1, v0, v2}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    :cond_8
    :goto_3
    return-void

    .line 209
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 213
    .line 214
    instance-of v1, v0, Landroid/view/View;

    .line 215
    .line 216
    if-eqz v1, :cond_9

    .line 217
    .line 218
    move-object v12, v0

    .line 219
    check-cast v12, Landroid/view/View;

    .line 220
    .line 221
    :cond_9
    if-nez v12, :cond_a

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_a
    sget-object v0, Lqr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 225
    .line 226
    invoke-static {v12}, Lqr1;->α(Landroid/view/View;)V

    .line 227
    .line 228
    .line 229
    :goto_4
    return-void

    .line 230
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 234
    .line 235
    instance-of v1, v0, Landroid/view/View;

    .line 236
    .line 237
    if-eqz v1, :cond_b

    .line 238
    .line 239
    move-object v12, v0

    .line 240
    check-cast v12, Landroid/view/View;

    .line 241
    .line 242
    :cond_b
    if-nez v12, :cond_c

    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_c
    sget-object v0, Lqr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 246
    .line 247
    invoke-static {v12}, Lqr1;->α(Landroid/view/View;)V

    .line 248
    .line 249
    .line 250
    :goto_5
    return-void

    .line 251
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 255
    .line 256
    instance-of v1, v0, Landroid/view/View;

    .line 257
    .line 258
    if-eqz v1, :cond_d

    .line 259
    .line 260
    move-object v12, v0

    .line 261
    check-cast v12, Landroid/view/View;

    .line 262
    .line 263
    :cond_d
    if-nez v12, :cond_e

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_e
    sget-object v0, Lqr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 267
    .line 268
    sget-object v0, Lqr1;->β:Ljava/util/Set;

    .line 269
    .line 270
    invoke-interface {v0, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    invoke-static {v12}, Lqr1;->α(Landroid/view/View;)V

    .line 274
    .line 275
    .line 276
    :try_start_2
    new-instance v0, Ljb;

    .line 277
    .line 278
    invoke-direct {v0, v12}, Ljb;-><init>(Landroid/view/View;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 282
    .line 283
    .line 284
    :catchall_2
    :goto_6
    return-void

    .line 285
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 289
    .line 290
    instance-of v1, v0, Landroid/view/View;

    .line 291
    .line 292
    if-eqz v1, :cond_f

    .line 293
    .line 294
    check-cast v0, Landroid/view/View;

    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_f
    move-object v0, v12

    .line 298
    :goto_7
    if-nez v0, :cond_10

    .line 299
    .line 300
    goto :goto_8

    .line 301
    :cond_10
    sget-object v1, Lpr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 302
    .line 303
    :try_start_3
    instance-of v1, v0, Landroid/widget/ProgressBar;

    .line 304
    .line 305
    if-eqz v1, :cond_11

    .line 306
    .line 307
    move-object v12, v0

    .line 308
    check-cast v12, Landroid/widget/ProgressBar;

    .line 309
    .line 310
    :cond_11
    if-nez v12, :cond_12

    .line 311
    .line 312
    goto :goto_8

    .line 313
    :cond_12
    invoke-static {v0, v12}, Lpr1;->β(Landroid/view/View;Landroid/widget/ProgressBar;)Lor1;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    if-nez v1, :cond_13

    .line 318
    .line 319
    goto :goto_8

    .line 320
    :cond_13
    sget-object v2, Lpr1;->γ:Ljava/util/Map;

    .line 321
    .line 322
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    sput-object v1, Lpr1;->ε:Lor1;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 326
    .line 327
    :catchall_3
    :goto_8
    return-void

    .line 328
    :pswitch_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 332
    .line 333
    instance-of v2, v0, Landroid/view/View;

    .line 334
    .line 335
    if-eqz v2, :cond_14

    .line 336
    .line 337
    check-cast v0, Landroid/view/View;

    .line 338
    .line 339
    goto :goto_9

    .line 340
    :cond_14
    move-object v0, v12

    .line 341
    :goto_9
    if-nez v0, :cond_15

    .line 342
    .line 343
    goto/16 :goto_e

    .line 344
    .line 345
    :cond_15
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 346
    .line 347
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    invoke-static {v11, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    instance-of v2, v1, Landroid/graphics/Canvas;

    .line 355
    .line 356
    if-eqz v2, :cond_16

    .line 357
    .line 358
    check-cast v1, Landroid/graphics/Canvas;

    .line 359
    .line 360
    goto :goto_a

    .line 361
    :cond_16
    move-object v1, v12

    .line 362
    :goto_a
    if-nez v1, :cond_17

    .line 363
    .line 364
    goto/16 :goto_e

    .line 365
    .line 366
    :cond_17
    sget-object v2, Lpr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 367
    .line 368
    invoke-static {}, Lui1;->Α()Z

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    if-eqz v2, :cond_25

    .line 373
    .line 374
    const-string v2, "seekbar_time_enabled"

    .line 375
    .line 376
    invoke-static {v2, v11}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    if-eqz v2, :cond_25

    .line 381
    .line 382
    :try_start_4
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    if-nez v2, :cond_18

    .line 387
    .line 388
    goto/16 :goto_e

    .line 389
    .line 390
    :cond_18
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    cmpg-float v2, v2, v7

    .line 395
    .line 396
    if-gtz v2, :cond_19

    .line 397
    .line 398
    goto/16 :goto_e

    .line 399
    .line 400
    :cond_19
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    if-lez v2, :cond_25

    .line 405
    .line 406
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    if-gtz v2, :cond_1a

    .line 411
    .line 412
    goto/16 :goto_e

    .line 413
    .line 414
    :cond_1a
    instance-of v2, v0, Landroid/widget/ProgressBar;

    .line 415
    .line 416
    if-eqz v2, :cond_1b

    .line 417
    .line 418
    move-object v12, v0

    .line 419
    check-cast v12, Landroid/widget/ProgressBar;

    .line 420
    .line 421
    :cond_1b
    if-nez v12, :cond_1c

    .line 422
    .line 423
    goto/16 :goto_e

    .line 424
    .line 425
    :cond_1c
    invoke-static {v0, v12}, Lpr1;->β(Landroid/view/View;Landroid/widget/ProgressBar;)Lor1;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    if-nez v2, :cond_1d

    .line 430
    .line 431
    goto/16 :goto_e

    .line 432
    .line 433
    :cond_1d
    sget-object v3, Lpr1;->γ:Ljava/util/Map;

    .line 434
    .line 435
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    sput-object v2, Lpr1;->ε:Lor1;

    .line 439
    .line 440
    invoke-static {v0}, Lpr1;->θ(Landroid/view/View;)Lnr1;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    iget-object v3, v3, Lnr1;->α:Landroid/graphics/Paint;

    .line 445
    .line 446
    invoke-virtual {v3}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    invoke-virtual {v12}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    invoke-static {v5}, Lpr1;->μ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    .line 455
    .line 456
    .line 457
    move-result-object v5

    .line 458
    if-eqz v5, :cond_1e

    .line 459
    .line 460
    move-object v8, v0

    .line 461
    check-cast v8, Landroid/widget/ProgressBar;

    .line 462
    .line 463
    invoke-virtual {v8}, Landroid/view/View;->getPaddingLeft()I

    .line 464
    .line 465
    .line 466
    move-result v8

    .line 467
    iget v9, v5, Landroid/graphics/Rect;->left:I

    .line 468
    .line 469
    add-int/2addr v8, v9

    .line 470
    goto :goto_b

    .line 471
    :cond_1e
    move-object v8, v0

    .line 472
    check-cast v8, Landroid/widget/ProgressBar;

    .line 473
    .line 474
    invoke-virtual {v8}, Landroid/view/View;->getPaddingLeft()I

    .line 475
    .line 476
    .line 477
    move-result v8

    .line 478
    :goto_b
    if-gez v8, :cond_1f

    .line 479
    .line 480
    goto :goto_c

    .line 481
    :cond_1f
    move v11, v8

    .line 482
    :goto_c
    if-eqz v5, :cond_20

    .line 483
    .line 484
    move-object v8, v0

    .line 485
    check-cast v8, Landroid/widget/ProgressBar;

    .line 486
    .line 487
    invoke-virtual {v8}, Landroid/view/View;->getPaddingTop()I

    .line 488
    .line 489
    .line 490
    move-result v8

    .line 491
    int-to-float v8, v8

    .line 492
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 493
    .line 494
    int-to-float v5, v5

    .line 495
    add-float/2addr v8, v5

    .line 496
    goto :goto_d

    .line 497
    :cond_20
    move-object v5, v0

    .line 498
    check-cast v5, Landroid/widget/ProgressBar;

    .line 499
    .line 500
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 501
    .line 502
    .line 503
    move-result v5

    .line 504
    int-to-float v5, v5

    .line 505
    const/high16 v8, 0x3f000000    # 0.5f

    .line 506
    .line 507
    mul-float/2addr v8, v5

    .line 508
    :goto_d
    move-object v5, v0

    .line 509
    check-cast v5, Landroid/widget/ProgressBar;

    .line 510
    .line 511
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 512
    .line 513
    .line 514
    move-result v5

    .line 515
    int-to-float v5, v5

    .line 516
    invoke-static {v8, v7, v5}, Lj81;->λ(FFF)F

    .line 517
    .line 518
    .line 519
    move-result v5

    .line 520
    move-object v8, v0

    .line 521
    check-cast v8, Landroid/widget/ProgressBar;

    .line 522
    .line 523
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 524
    .line 525
    .line 526
    move-result-object v8

    .line 527
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 531
    .line 532
    .line 533
    move-result-object v8

    .line 534
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 535
    .line 536
    .line 537
    move-result-object v8

    .line 538
    const v9, 0x3f99999a    # 1.2f

    .line 539
    .line 540
    .line 541
    invoke-static {v10, v9, v8}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 542
    .line 543
    .line 544
    move-result v8

    .line 545
    add-float/2addr v5, v8

    .line 546
    move-object v8, v0

    .line 547
    check-cast v8, Landroid/widget/ProgressBar;

    .line 548
    .line 549
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 550
    .line 551
    .line 552
    move-result v8

    .line 553
    int-to-float v8, v8

    .line 554
    invoke-static {v5, v7, v8}, Lj81;->λ(FFF)F

    .line 555
    .line 556
    .line 557
    move-result v5

    .line 558
    move-object v8, v0

    .line 559
    check-cast v8, Landroid/widget/ProgressBar;

    .line 560
    .line 561
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 562
    .line 563
    .line 564
    move-result v8

    .line 565
    int-to-float v8, v8

    .line 566
    move-object v9, v0

    .line 567
    check-cast v9, Landroid/widget/ProgressBar;

    .line 568
    .line 569
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 570
    .line 571
    .line 572
    move-result-object v9

    .line 573
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 577
    .line 578
    .line 579
    move-result-object v9

    .line 580
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 581
    .line 582
    .line 583
    move-result-object v9

    .line 584
    invoke-static {v10, v6, v9}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 585
    .line 586
    .line 587
    move-result v6

    .line 588
    sub-float/2addr v8, v6

    .line 589
    cmpg-float v6, v8, v7

    .line 590
    .line 591
    if-gez v6, :cond_21

    .line 592
    .line 593
    move v8, v7

    .line 594
    :cond_21
    cmpg-float v6, v8, v5

    .line 595
    .line 596
    if-gtz v6, :cond_22

    .line 597
    .line 598
    goto :goto_e

    .line 599
    :cond_22
    iget v6, v4, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 600
    .line 601
    sub-float v6, v5, v6

    .line 602
    .line 603
    iget v4, v4, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 604
    .line 605
    sub-float/2addr v8, v4

    .line 606
    cmpl-float v9, v6, v8

    .line 607
    .line 608
    if-lez v9, :cond_23

    .line 609
    .line 610
    move v6, v8

    .line 611
    :cond_23
    add-float/2addr v4, v6

    .line 612
    cmpg-float v4, v4, v5

    .line 613
    .line 614
    if-gtz v4, :cond_24

    .line 615
    .line 616
    goto :goto_e

    .line 617
    :cond_24
    int-to-float v4, v11

    .line 618
    move-object v8, v0

    .line 619
    check-cast v8, Landroid/widget/ProgressBar;

    .line 620
    .line 621
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    .line 622
    .line 623
    .line 624
    move-result v8

    .line 625
    int-to-float v8, v8

    .line 626
    invoke-static {v4, v7, v8}, Lj81;->λ(FFF)F

    .line 627
    .line 628
    .line 629
    move-result v4

    .line 630
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 631
    .line 632
    .line 633
    :try_start_5
    move-object v8, v0

    .line 634
    check-cast v8, Landroid/widget/ProgressBar;

    .line 635
    .line 636
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    .line 637
    .line 638
    .line 639
    move-result v8

    .line 640
    int-to-float v8, v8

    .line 641
    check-cast v0, Landroid/widget/ProgressBar;

    .line 642
    .line 643
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 644
    .line 645
    .line 646
    move-result v0

    .line 647
    int-to-float v0, v0

    .line 648
    invoke-virtual {v1, v7, v5, v8, v0}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 649
    .line 650
    .line 651
    iget-object v0, v2, Lor1;->η:Ljava/lang/String;

    .line 652
    .line 653
    invoke-virtual {v1, v0, v4, v6, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 654
    .line 655
    .line 656
    :try_start_6
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 657
    .line 658
    .line 659
    goto :goto_e

    .line 660
    :catchall_4
    move-exception v0

    .line 661
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 662
    .line 663
    .line 664
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 665
    :catchall_5
    :cond_25
    :goto_e
    return-void

    .line 666
    :pswitch_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 670
    .line 671
    if-nez v0, :cond_26

    .line 672
    .line 673
    goto :goto_10

    .line 674
    :cond_26
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 675
    .line 676
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 677
    .line 678
    .line 679
    invoke-static {v11, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    instance-of v2, v1, Ljava/lang/Number;

    .line 684
    .line 685
    if-eqz v2, :cond_27

    .line 686
    .line 687
    check-cast v1, Ljava/lang/Number;

    .line 688
    .line 689
    goto :goto_f

    .line 690
    :cond_27
    move-object v1, v12

    .line 691
    :goto_f
    if-eqz v1, :cond_29

    .line 692
    .line 693
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 694
    .line 695
    .line 696
    move-result v1

    .line 697
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 698
    .line 699
    .line 700
    move-result-object v2

    .line 701
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 702
    .line 703
    .line 704
    move-result v1

    .line 705
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 706
    .line 707
    .line 708
    cmpg-float v1, v1, v3

    .line 709
    .line 710
    if-gtz v1, :cond_28

    .line 711
    .line 712
    move-object v12, v2

    .line 713
    :cond_28
    if-eqz v12, :cond_29

    .line 714
    .line 715
    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    .line 716
    .line 717
    .line 718
    move-result v1

    .line 719
    invoke-static {v1, v7, v6}, Lj81;->λ(FFF)F

    .line 720
    .line 721
    .line 722
    move-result v1

    .line 723
    sget-object v2, Lpr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 724
    .line 725
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 726
    .line 727
    .line 728
    move-result-object v1

    .line 729
    invoke-static {v0, v1}, Lpr1;->α(Ljava/lang/Object;Ljava/lang/Float;)V

    .line 730
    .line 731
    .line 732
    :cond_29
    :goto_10
    return-void

    .line 733
    :pswitch_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 737
    .line 738
    if-nez v0, :cond_2a

    .line 739
    .line 740
    goto :goto_11

    .line 741
    :cond_2a
    invoke-static {v0, v12}, Lpr1;->α(Ljava/lang/Object;Ljava/lang/Float;)V

    .line 742
    .line 743
    .line 744
    :goto_11
    return-void

    .line 745
    :pswitch_d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 746
    .line 747
    .line 748
    :try_start_7
    sget-object v0, Lvd0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 749
    .line 750
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 751
    .line 752
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 753
    .line 754
    .line 755
    invoke-static {v11, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    invoke-static {v0}, Lvd0;->τ(Ljava/lang/Object;)Lxd0;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    if-nez v0, :cond_2b

    .line 764
    .line 765
    goto :goto_13

    .line 766
    :cond_2b
    sget-object v2, Lxc0;->α:Lxc0;

    .line 767
    .line 768
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 769
    .line 770
    .line 771
    move-result-object v3

    .line 772
    invoke-virtual {v2, v3}, Lxc0;->δ(Ljava/util/List;)V

    .line 773
    .line 774
    .line 775
    sget-object v2, Lcn1;->α:Lcn1;

    .line 776
    .line 777
    iget-object v1, v1, Lk01;->β:Ljava/lang/Object;

    .line 778
    .line 779
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    invoke-static {v1}, Lcn1;->α(Ljava/lang/Object;)Landroid/widget/ImageView;

    .line 783
    .line 784
    .line 785
    move-result-object v1

    .line 786
    if-nez v1, :cond_2c

    .line 787
    .line 788
    goto :goto_13

    .line 789
    :cond_2c
    new-instance v2, Lζ;

    .line 790
    .line 791
    invoke-direct {v2, v1, v9, v0}, Lζ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 795
    .line 796
    .line 797
    sget-object v0, Ls62;->α:Ls62;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 798
    .line 799
    goto :goto_12

    .line 800
    :catchall_6
    move-exception v0

    .line 801
    new-instance v1, Leo1;

    .line 802
    .line 803
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 804
    .line 805
    .line 806
    move-object v0, v1

    .line 807
    :goto_12
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    if-eqz v0, :cond_2d

    .line 812
    .line 813
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    const-string v1, "more button bind callback failed: "

    .line 818
    .line 819
    const-string v2, "reae2c2e0c445b34d"

    .line 820
    .line 821
    invoke-static {v1, v0, v2}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 822
    .line 823
    .line 824
    :cond_2d
    :goto_13
    return-void

    .line 825
    :pswitch_e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 826
    .line 827
    .line 828
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 829
    .line 830
    instance-of v1, v0, Landroid/view/View;

    .line 831
    .line 832
    if-eqz v1, :cond_2e

    .line 833
    .line 834
    move-object v12, v0

    .line 835
    check-cast v12, Landroid/view/View;

    .line 836
    .line 837
    :cond_2e
    if-nez v12, :cond_2f

    .line 838
    .line 839
    goto :goto_14

    .line 840
    :cond_2f
    sget-object v0, Ldk1;->α:Ldk1;

    .line 841
    .line 842
    invoke-static {v12}, Ldk1;->ν(Landroid/view/View;)Z

    .line 843
    .line 844
    .line 845
    move-result v0

    .line 846
    if-eqz v0, :cond_30

    .line 847
    .line 848
    const-string v0, "onAttachedToWindow"

    .line 849
    .line 850
    invoke-static {v12, v0}, Ldk1;->α(Landroid/view/View;Ljava/lang/String;)V

    .line 851
    .line 852
    .line 853
    :cond_30
    :goto_14
    return-void

    .line 854
    :pswitch_f
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 855
    .line 856
    .line 857
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 858
    .line 859
    instance-of v1, v0, Landroid/view/View;

    .line 860
    .line 861
    if-eqz v1, :cond_31

    .line 862
    .line 863
    move-object v12, v0

    .line 864
    check-cast v12, Landroid/view/View;

    .line 865
    .line 866
    :cond_31
    if-nez v12, :cond_32

    .line 867
    .line 868
    goto :goto_15

    .line 869
    :cond_32
    sget-object v0, Ldk1;->α:Ldk1;

    .line 870
    .line 871
    invoke-static {v12}, Ldk1;->ν(Landroid/view/View;)Z

    .line 872
    .line 873
    .line 874
    move-result v0

    .line 875
    if-eqz v0, :cond_33

    .line 876
    .line 877
    const-string v0, "setOnClickListener"

    .line 878
    .line 879
    invoke-static {v12, v0}, Ldk1;->α(Landroid/view/View;Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    :cond_33
    :goto_15
    return-void

    .line 883
    :pswitch_10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 887
    .line 888
    instance-of v1, v0, Landroid/view/View;

    .line 889
    .line 890
    if-eqz v1, :cond_34

    .line 891
    .line 892
    move-object v12, v0

    .line 893
    check-cast v12, Landroid/view/View;

    .line 894
    .line 895
    :cond_34
    if-nez v12, :cond_35

    .line 896
    .line 897
    goto :goto_16

    .line 898
    :cond_35
    const-string v0, "constructor"

    .line 899
    .line 900
    invoke-static {v12, v0}, Ldk1;->α(Landroid/view/View;Ljava/lang/String;)V

    .line 901
    .line 902
    .line 903
    :goto_16
    return-void

    .line 904
    :pswitch_11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 905
    .line 906
    .line 907
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 908
    .line 909
    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 910
    .line 911
    .line 912
    invoke-static {v11, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    instance-of v3, v2, Landroid/view/View;

    .line 917
    .line 918
    if-eqz v3, :cond_36

    .line 919
    .line 920
    move-object v12, v2

    .line 921
    check-cast v12, Landroid/view/View;

    .line 922
    .line 923
    :cond_36
    if-nez v12, :cond_37

    .line 924
    .line 925
    goto :goto_17

    .line 926
    :cond_37
    invoke-static {v10, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v0

    .line 930
    sget-object v2, Luj1;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 931
    .line 932
    iget-object v1, v1, Lk01;->β:Ljava/lang/Object;

    .line 933
    .line 934
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    invoke-static {v12, v1}, Luj1;->θ(Landroid/view/View;Ljava/lang/Object;)Landroid/view/View;

    .line 938
    .line 939
    .line 940
    move-result-object v1

    .line 941
    if-nez v1, :cond_38

    .line 942
    .line 943
    const-string v0, "search_container"

    .line 944
    .line 945
    const-string v1, "\u641c\u7d22\u6846\u5bb9\u5668\u672a\u8bc6\u522b\uff0c\u4fdd\u7559\u5bbf\u4e3b\u900f\u660e\u5ea6"

    .line 946
    .line 947
    invoke-static {v0, v1}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 948
    .line 949
    .line 950
    goto :goto_17

    .line 951
    :cond_38
    sget-object v2, Lnj1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 952
    .line 953
    invoke-static {v0}, Luj1;->δ(Ljava/lang/Object;)Z

    .line 954
    .line 955
    .line 956
    move-result v0

    .line 957
    invoke-static {v1, v0}, Lnj1;->α(Landroid/view/View;Z)V

    .line 958
    .line 959
    .line 960
    :goto_17
    sget-object v0, Ls62;->α:Ls62;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 961
    .line 962
    goto :goto_18

    .line 963
    :catchall_7
    move-exception v0

    .line 964
    new-instance v1, Leo1;

    .line 965
    .line 966
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 967
    .line 968
    .line 969
    move-object v0, v1

    .line 970
    :goto_18
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    if-eqz v0, :cond_39

    .line 975
    .line 976
    sget-object v1, Lqj1;->α:Lqj1;

    .line 977
    .line 978
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    new-instance v1, Ljava/lang/StringBuilder;

    .line 983
    .line 984
    const-string v2, "search_after \u56de\u8c03\u5df2\u964d\u7ea7: "

    .line 985
    .line 986
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 987
    .line 988
    .line 989
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 990
    .line 991
    .line 992
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    const-string v1, "callback_search_after"

    .line 997
    .line 998
    invoke-static {v1, v0}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    :cond_39
    return-void

    .line 1002
    :pswitch_12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1006
    .line 1007
    :try_start_9
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1008
    .line 1009
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1010
    .line 1011
    .line 1012
    invoke-static {v11, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v1

    .line 1016
    instance-of v2, v1, Ljava/lang/Number;

    .line 1017
    .line 1018
    if-eqz v2, :cond_3a

    .line 1019
    .line 1020
    move-object v12, v1

    .line 1021
    check-cast v12, Ljava/lang/Number;

    .line 1022
    .line 1023
    :cond_3a
    if-eqz v12, :cond_3d

    .line 1024
    .line 1025
    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    .line 1026
    .line 1027
    .line 1028
    move-result v1

    .line 1029
    sget-object v2, Luj1;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1030
    .line 1031
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1032
    .line 1033
    .line 1034
    invoke-static {v0}, Luj1;->η(Ljava/lang/Object;)Landroid/view/View;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v2

    .line 1038
    if-nez v2, :cond_3b

    .line 1039
    .line 1040
    goto :goto_19

    .line 1041
    :cond_3b
    invoke-static {v0}, Luj1;->ε(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    if-nez v0, :cond_3c

    .line 1046
    .line 1047
    goto :goto_19

    .line 1048
    :cond_3c
    sget-object v3, Lnj1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1049
    .line 1050
    invoke-static {v0}, Luj1;->δ(Ljava/lang/Object;)Z

    .line 1051
    .line 1052
    .line 1053
    move-result v0

    .line 1054
    invoke-static {v2, v0, v1}, Lnj1;->γ(Landroid/view/View;ZF)V

    .line 1055
    .line 1056
    .line 1057
    :cond_3d
    :goto_19
    sget-object v0, Ls62;->α:Ls62;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 1058
    .line 1059
    goto :goto_1a

    .line 1060
    :catchall_8
    move-exception v0

    .line 1061
    new-instance v1, Leo1;

    .line 1062
    .line 1063
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1064
    .line 1065
    .line 1066
    move-object v0, v1

    .line 1067
    :goto_1a
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    if-eqz v0, :cond_3e

    .line 1072
    .line 1073
    sget-object v1, Lqj1;->α:Lqj1;

    .line 1074
    .line 1075
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1080
    .line 1081
    const-string v2, "comment_alpha_after \u56de\u8c03\u5df2\u964d\u7ea7: "

    .line 1082
    .line 1083
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    const-string v1, "callback_comment_alpha_after"

    .line 1094
    .line 1095
    invoke-static {v1, v0}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1096
    .line 1097
    .line 1098
    :cond_3e
    return-void

    .line 1099
    :pswitch_13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1100
    .line 1101
    .line 1102
    sget-object v0, Lmi1;->α:Lmi1;

    .line 1103
    .line 1104
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1105
    .line 1106
    iget-object v2, v1, Lk01;->ε:Ljava/lang/Object;

    .line 1107
    .line 1108
    invoke-static {v3, v11}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1109
    .line 1110
    .line 1111
    move-result v3

    .line 1112
    if-nez v3, :cond_3f

    .line 1113
    .line 1114
    goto/16 :goto_3f

    .line 1115
    .line 1116
    :cond_3f
    if-eqz v0, :cond_77

    .line 1117
    .line 1118
    if-nez v2, :cond_40

    .line 1119
    .line 1120
    goto/16 :goto_3f

    .line 1121
    .line 1122
    :cond_40
    sget-object v3, Lmi1;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1123
    .line 1124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v6

    .line 1128
    invoke-virtual {v3, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v7

    .line 1132
    if-nez v7, :cond_48

    .line 1133
    .line 1134
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v7

    .line 1138
    invoke-static {v7}, Lmi1;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v7

    .line 1142
    new-instance v13, Ljava/util/ArrayList;

    .line 1143
    .line 1144
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v7

    .line 1151
    :cond_41
    :goto_1b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1152
    .line 1153
    .line 1154
    move-result v14

    .line 1155
    if-eqz v14, :cond_42

    .line 1156
    .line 1157
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v14

    .line 1161
    move-object v15, v14

    .line 1162
    check-cast v15, Ljava/lang/reflect/Field;

    .line 1163
    .line 1164
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 1165
    .line 1166
    .line 1167
    move-result v15

    .line 1168
    invoke-static {v15}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1169
    .line 1170
    .line 1171
    move-result v15

    .line 1172
    if-nez v15, :cond_41

    .line 1173
    .line 1174
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1175
    .line 1176
    .line 1177
    goto :goto_1b

    .line 1178
    :cond_42
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v7

    .line 1182
    :cond_43
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1183
    .line 1184
    .line 1185
    move-result v13

    .line 1186
    if-eqz v13, :cond_44

    .line 1187
    .line 1188
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v13

    .line 1192
    move-object v14, v13

    .line 1193
    check-cast v14, Ljava/lang/reflect/Field;

    .line 1194
    .line 1195
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v15

    .line 1199
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v15

    .line 1203
    const-string v16, "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943129306BB91C862D3C2CDFB95A02E64AF3D92229B8488"

    .line 1204
    .line 1205
    const-wide/16 v17, 0x0

    .line 1206
    .line 1207
    invoke-static/range {v16 .. v16}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v4

    .line 1211
    invoke-virtual {v15, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v4

    .line 1215
    if-nez v4, :cond_45

    .line 1216
    .line 1217
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v4

    .line 1221
    const-string v5, "LJII"

    .line 1222
    .line 1223
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v4

    .line 1227
    if-nez v4, :cond_45

    .line 1228
    .line 1229
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v4

    .line 1233
    const-string v5, "comment"

    .line 1234
    .line 1235
    invoke-static {v4, v5}, Lx02;->Κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1236
    .line 1237
    .line 1238
    move-result v4

    .line 1239
    if-eqz v4, :cond_43

    .line 1240
    .line 1241
    goto :goto_1c

    .line 1242
    :cond_44
    const-wide/16 v17, 0x0

    .line 1243
    .line 1244
    move-object v13, v12

    .line 1245
    :cond_45
    :goto_1c
    check-cast v13, Ljava/lang/reflect/Field;

    .line 1246
    .line 1247
    if-eqz v13, :cond_46

    .line 1248
    .line 1249
    invoke-virtual {v13, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1250
    .line 1251
    .line 1252
    sget-object v4, Lox;->α:Ljava/lang/Object;

    .line 1253
    .line 1254
    sget-object v4, Lkx;->ж:Lkx;

    .line 1255
    .line 1256
    invoke-static {v4, v13}, Lox;->φ(Lkx;Ljava/lang/reflect/Field;)V

    .line 1257
    .line 1258
    .line 1259
    goto :goto_1d

    .line 1260
    :cond_46
    move-object v13, v12

    .line 1261
    :goto_1d
    invoke-virtual {v3, v6, v13}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v3

    .line 1265
    if-nez v3, :cond_47

    .line 1266
    .line 1267
    move-object v7, v13

    .line 1268
    goto :goto_1e

    .line 1269
    :cond_47
    move-object v7, v3

    .line 1270
    goto :goto_1e

    .line 1271
    :cond_48
    const-wide/16 v17, 0x0

    .line 1272
    .line 1273
    :goto_1e
    check-cast v7, Ljava/lang/reflect/Field;

    .line 1274
    .line 1275
    if-eqz v7, :cond_49

    .line 1276
    .line 1277
    :try_start_a
    invoke-virtual {v7, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 1281
    goto :goto_1f

    .line 1282
    :catchall_9
    move-exception v0

    .line 1283
    new-instance v3, Leo1;

    .line 1284
    .line 1285
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1286
    .line 1287
    .line 1288
    goto :goto_20

    .line 1289
    :cond_49
    move-object v0, v12

    .line 1290
    :goto_1f
    move-object v3, v0

    .line 1291
    :goto_20
    instance-of v0, v3, Leo1;

    .line 1292
    .line 1293
    if-eqz v0, :cond_4a

    .line 1294
    .line 1295
    move-object v3, v12

    .line 1296
    :cond_4a
    if-nez v3, :cond_4b

    .line 1297
    .line 1298
    goto/16 :goto_3f

    .line 1299
    .line 1300
    :cond_4b
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v4

    .line 1304
    sget-object v0, Lmi1;->ι:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1305
    .line 1306
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v5

    .line 1310
    invoke-virtual {v0, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v6

    .line 1314
    const-string v7, "getCreateTime"

    .line 1315
    .line 1316
    if-nez v6, :cond_55

    .line 1317
    .line 1318
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v6

    .line 1322
    invoke-static {v6}, Lmi1;->β(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v6

    .line 1326
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v6

    .line 1330
    :goto_21
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1331
    .line 1332
    .line 1333
    move-result v13

    .line 1334
    sget-object v14, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 1335
    .line 1336
    if-eqz v13, :cond_4e

    .line 1337
    .line 1338
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v13

    .line 1342
    move-object v15, v13

    .line 1343
    check-cast v15, Ljava/lang/reflect/Method;

    .line 1344
    .line 1345
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1346
    .line 1347
    .line 1348
    move-result v16

    .line 1349
    invoke-static/range {v16 .. v16}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1350
    .line 1351
    .line 1352
    move-result v16

    .line 1353
    if-nez v16, :cond_4c

    .line 1354
    .line 1355
    move/from16 v16, v9

    .line 1356
    .line 1357
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v9

    .line 1361
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1362
    .line 1363
    .line 1364
    array-length v9, v9

    .line 1365
    if-nez v9, :cond_4d

    .line 1366
    .line 1367
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v9

    .line 1371
    invoke-static {v9, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1372
    .line 1373
    .line 1374
    move-result v9

    .line 1375
    if-eqz v9, :cond_4d

    .line 1376
    .line 1377
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v9

    .line 1381
    invoke-static {v9, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1382
    .line 1383
    .line 1384
    move-result v9

    .line 1385
    if-nez v9, :cond_4f

    .line 1386
    .line 1387
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v9

    .line 1391
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1392
    .line 1393
    .line 1394
    const-string v15, "CreateTime"

    .line 1395
    .line 1396
    invoke-static {v9, v15, v11}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1397
    .line 1398
    .line 1399
    move-result v9

    .line 1400
    if-eqz v9, :cond_4d

    .line 1401
    .line 1402
    goto :goto_22

    .line 1403
    :cond_4c
    move/from16 v16, v9

    .line 1404
    .line 1405
    :cond_4d
    move/from16 v9, v16

    .line 1406
    .line 1407
    goto :goto_21

    .line 1408
    :cond_4e
    move/from16 v16, v9

    .line 1409
    .line 1410
    move-object v13, v12

    .line 1411
    :cond_4f
    :goto_22
    check-cast v13, Ljava/lang/reflect/Method;

    .line 1412
    .line 1413
    if-eqz v13, :cond_50

    .line 1414
    .line 1415
    invoke-virtual {v13, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1416
    .line 1417
    .line 1418
    goto :goto_24

    .line 1419
    :cond_50
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v6

    .line 1423
    invoke-static {v6}, Lmi1;->β(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v6

    .line 1427
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v6

    .line 1431
    :cond_51
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1432
    .line 1433
    .line 1434
    move-result v9

    .line 1435
    if-eqz v9, :cond_52

    .line 1436
    .line 1437
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v9

    .line 1441
    move-object v13, v9

    .line 1442
    check-cast v13, Ljava/lang/reflect/Method;

    .line 1443
    .line 1444
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1445
    .line 1446
    .line 1447
    move-result v15

    .line 1448
    invoke-static {v15}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1449
    .line 1450
    .line 1451
    move-result v15

    .line 1452
    if-nez v15, :cond_51

    .line 1453
    .line 1454
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v15

    .line 1458
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1459
    .line 1460
    .line 1461
    array-length v15, v15

    .line 1462
    if-nez v15, :cond_51

    .line 1463
    .line 1464
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v15

    .line 1468
    invoke-static {v15, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1469
    .line 1470
    .line 1471
    move-result v15

    .line 1472
    if-eqz v15, :cond_51

    .line 1473
    .line 1474
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v13

    .line 1478
    invoke-static {v13, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1479
    .line 1480
    .line 1481
    move-result v13

    .line 1482
    if-eqz v13, :cond_51

    .line 1483
    .line 1484
    goto :goto_23

    .line 1485
    :cond_52
    move-object v9, v12

    .line 1486
    :goto_23
    move-object v13, v9

    .line 1487
    check-cast v13, Ljava/lang/reflect/Method;

    .line 1488
    .line 1489
    if-eqz v13, :cond_53

    .line 1490
    .line 1491
    invoke-virtual {v13, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1492
    .line 1493
    .line 1494
    goto :goto_24

    .line 1495
    :cond_53
    move-object v13, v12

    .line 1496
    :goto_24
    invoke-virtual {v0, v5, v13}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v0

    .line 1500
    if-nez v0, :cond_54

    .line 1501
    .line 1502
    move-object v6, v13

    .line 1503
    goto :goto_25

    .line 1504
    :cond_54
    move-object v6, v0

    .line 1505
    goto :goto_25

    .line 1506
    :cond_55
    move/from16 v16, v9

    .line 1507
    .line 1508
    :goto_25
    check-cast v6, Ljava/lang/reflect/Method;

    .line 1509
    .line 1510
    if-eqz v6, :cond_59

    .line 1511
    .line 1512
    :try_start_b
    invoke-virtual {v6, v3, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v0

    .line 1516
    instance-of v3, v0, Ljava/lang/Long;

    .line 1517
    .line 1518
    if-eqz v3, :cond_56

    .line 1519
    .line 1520
    check-cast v0, Ljava/lang/Long;

    .line 1521
    .line 1522
    goto :goto_26

    .line 1523
    :catchall_a
    move-exception v0

    .line 1524
    goto :goto_28

    .line 1525
    :cond_56
    move-object v0, v12

    .line 1526
    :goto_26
    if-eqz v0, :cond_57

    .line 1527
    .line 1528
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1529
    .line 1530
    .line 1531
    move-result-wide v5

    .line 1532
    goto :goto_27

    .line 1533
    :cond_57
    move-wide/from16 v5, v17

    .line 1534
    .line 1535
    :goto_27
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 1539
    goto :goto_29

    .line 1540
    :goto_28
    new-instance v3, Leo1;

    .line 1541
    .line 1542
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1543
    .line 1544
    .line 1545
    move-object v0, v3

    .line 1546
    :goto_29
    instance-of v3, v0, Leo1;

    .line 1547
    .line 1548
    if-eqz v3, :cond_58

    .line 1549
    .line 1550
    goto :goto_2a

    .line 1551
    :cond_58
    move-object v4, v0

    .line 1552
    :goto_2a
    check-cast v4, Ljava/lang/Number;

    .line 1553
    .line 1554
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 1555
    .line 1556
    .line 1557
    move-result-wide v3

    .line 1558
    goto :goto_30

    .line 1559
    :cond_59
    :try_start_c
    new-array v0, v11, [Ljava/lang/Object;

    .line 1560
    .line 1561
    invoke-static {v3, v7, v0}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v0

    .line 1565
    instance-of v3, v0, Ljava/lang/Long;

    .line 1566
    .line 1567
    if-eqz v3, :cond_5a

    .line 1568
    .line 1569
    check-cast v0, Ljava/lang/Long;

    .line 1570
    .line 1571
    goto :goto_2b

    .line 1572
    :catchall_b
    move-exception v0

    .line 1573
    goto :goto_2d

    .line 1574
    :cond_5a
    move-object v0, v12

    .line 1575
    :goto_2b
    if-eqz v0, :cond_5b

    .line 1576
    .line 1577
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1578
    .line 1579
    .line 1580
    move-result-wide v5

    .line 1581
    goto :goto_2c

    .line 1582
    :cond_5b
    move-wide/from16 v5, v17

    .line 1583
    .line 1584
    :goto_2c
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .line 1588
    goto :goto_2e

    .line 1589
    :goto_2d
    new-instance v3, Leo1;

    .line 1590
    .line 1591
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1592
    .line 1593
    .line 1594
    move-object v0, v3

    .line 1595
    :goto_2e
    instance-of v3, v0, Leo1;

    .line 1596
    .line 1597
    if-eqz v3, :cond_5c

    .line 1598
    .line 1599
    goto :goto_2f

    .line 1600
    :cond_5c
    move-object v4, v0

    .line 1601
    :goto_2f
    check-cast v4, Ljava/lang/Number;

    .line 1602
    .line 1603
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 1604
    .line 1605
    .line 1606
    move-result-wide v3

    .line 1607
    :goto_30
    invoke-static {v3, v4}, Lmi1;->ι(J)J

    .line 1608
    .line 1609
    .line 1610
    move-result-wide v3

    .line 1611
    cmp-long v0, v3, v17

    .line 1612
    .line 1613
    if-gtz v0, :cond_5d

    .line 1614
    .line 1615
    goto/16 :goto_3f

    .line 1616
    .line 1617
    :cond_5d
    invoke-static {v3, v4}, Lmi1;->γ(J)Ljava/lang/String;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v3

    .line 1621
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1622
    .line 1623
    .line 1624
    move-result v0

    .line 1625
    if-eqz v0, :cond_5e

    .line 1626
    .line 1627
    goto/16 :goto_3f

    .line 1628
    .line 1629
    :cond_5e
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v0

    .line 1633
    sget-object v4, Lmi1;->η:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1634
    .line 1635
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v5

    .line 1639
    const-class v6, Ljava/lang/String;

    .line 1640
    .line 1641
    if-nez v5, :cond_63

    .line 1642
    .line 1643
    invoke-static {v0}, Lmi1;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v5

    .line 1647
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v5

    .line 1651
    :cond_5f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1652
    .line 1653
    .line 1654
    move-result v7

    .line 1655
    if-eqz v7, :cond_60

    .line 1656
    .line 1657
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v7

    .line 1661
    move-object v9, v7

    .line 1662
    check-cast v9, Ljava/lang/reflect/Field;

    .line 1663
    .line 1664
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 1665
    .line 1666
    .line 1667
    move-result v13

    .line 1668
    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1669
    .line 1670
    .line 1671
    move-result v13

    .line 1672
    if-nez v13, :cond_5f

    .line 1673
    .line 1674
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v9

    .line 1678
    invoke-static {v9, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1679
    .line 1680
    .line 1681
    move-result v9

    .line 1682
    if-eqz v9, :cond_5f

    .line 1683
    .line 1684
    goto :goto_31

    .line 1685
    :cond_60
    move-object v7, v12

    .line 1686
    :goto_31
    check-cast v7, Ljava/lang/reflect/Field;

    .line 1687
    .line 1688
    if-eqz v7, :cond_61

    .line 1689
    .line 1690
    invoke-virtual {v7, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1691
    .line 1692
    .line 1693
    goto :goto_32

    .line 1694
    :cond_61
    move-object v7, v12

    .line 1695
    :goto_32
    invoke-virtual {v4, v0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v0

    .line 1699
    if-nez v0, :cond_62

    .line 1700
    .line 1701
    move-object v5, v7

    .line 1702
    goto :goto_33

    .line 1703
    :cond_62
    move-object v5, v0

    .line 1704
    :cond_63
    :goto_33
    check-cast v5, Ljava/lang/reflect/Field;

    .line 1705
    .line 1706
    if-nez v5, :cond_64

    .line 1707
    .line 1708
    goto/16 :goto_3f

    .line 1709
    .line 1710
    :cond_64
    :try_start_d
    invoke-virtual {v5, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v0

    .line 1714
    instance-of v4, v0, Ljava/lang/String;

    .line 1715
    .line 1716
    if-eqz v4, :cond_65

    .line 1717
    .line 1718
    check-cast v0, Ljava/lang/String;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_c

    .line 1719
    .line 1720
    goto :goto_35

    .line 1721
    :catchall_c
    move-exception v0

    .line 1722
    goto :goto_34

    .line 1723
    :cond_65
    move-object v0, v12

    .line 1724
    goto :goto_35

    .line 1725
    :goto_34
    new-instance v4, Leo1;

    .line 1726
    .line 1727
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1728
    .line 1729
    .line 1730
    move-object v0, v4

    .line 1731
    :goto_35
    instance-of v4, v0, Leo1;

    .line 1732
    .line 1733
    if-eqz v4, :cond_66

    .line 1734
    .line 1735
    move-object v0, v12

    .line 1736
    :cond_66
    check-cast v0, Ljava/lang/String;

    .line 1737
    .line 1738
    invoke-static {v0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1739
    .line 1740
    .line 1741
    move-result v0

    .line 1742
    if-eqz v0, :cond_67

    .line 1743
    .line 1744
    goto/16 :goto_3f

    .line 1745
    .line 1746
    :cond_67
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v0

    .line 1750
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v4

    .line 1754
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1755
    .line 1756
    .line 1757
    new-instance v5, Ljava/util/ArrayList;

    .line 1758
    .line 1759
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1760
    .line 1761
    .line 1762
    array-length v7, v4

    .line 1763
    move v9, v11

    .line 1764
    :goto_36
    if-ge v9, v7, :cond_6a

    .line 1765
    .line 1766
    aget-object v13, v4, v9

    .line 1767
    .line 1768
    if-nez v13, :cond_68

    .line 1769
    .line 1770
    move-object v13, v12

    .line 1771
    :cond_68
    if-eqz v13, :cond_69

    .line 1772
    .line 1773
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1774
    .line 1775
    .line 1776
    :cond_69
    add-int/lit8 v9, v9, 0x1

    .line 1777
    .line 1778
    goto :goto_36

    .line 1779
    :cond_6a
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v4

    .line 1783
    :cond_6b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1784
    .line 1785
    .line 1786
    move-result v5

    .line 1787
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 1788
    .line 1789
    if-eqz v5, :cond_6c

    .line 1790
    .line 1791
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v5

    .line 1795
    move-object v9, v5

    .line 1796
    check-cast v9, Ljava/lang/reflect/Constructor;

    .line 1797
    .line 1798
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v9

    .line 1802
    array-length v13, v9

    .line 1803
    if-ne v13, v8, :cond_6b

    .line 1804
    .line 1805
    aget-object v13, v9, v11

    .line 1806
    .line 1807
    invoke-static {v13, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1808
    .line 1809
    .line 1810
    move-result v13

    .line 1811
    if-eqz v13, :cond_6b

    .line 1812
    .line 1813
    aget-object v13, v9, v10

    .line 1814
    .line 1815
    invoke-static {v13, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1816
    .line 1817
    .line 1818
    move-result v13

    .line 1819
    if-eqz v13, :cond_6b

    .line 1820
    .line 1821
    aget-object v9, v9, v16

    .line 1822
    .line 1823
    invoke-static {v9, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1824
    .line 1825
    .line 1826
    move-result v9

    .line 1827
    if-eqz v9, :cond_6b

    .line 1828
    .line 1829
    goto :goto_37

    .line 1830
    :cond_6c
    move-object v5, v12

    .line 1831
    :goto_37
    check-cast v5, Ljava/lang/reflect/Constructor;

    .line 1832
    .line 1833
    if-nez v5, :cond_6d

    .line 1834
    .line 1835
    goto/16 :goto_3f

    .line 1836
    .line 1837
    :cond_6d
    invoke-static {v0}, Lmi1;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v0

    .line 1841
    new-instance v4, Ljava/util/ArrayList;

    .line 1842
    .line 1843
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1844
    .line 1845
    .line 1846
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v0

    .line 1850
    :cond_6e
    :goto_38
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1851
    .line 1852
    .line 1853
    move-result v6

    .line 1854
    if-eqz v6, :cond_6f

    .line 1855
    .line 1856
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v6

    .line 1860
    move-object v8, v6

    .line 1861
    check-cast v8, Ljava/lang/reflect/Field;

    .line 1862
    .line 1863
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 1864
    .line 1865
    .line 1866
    move-result v9

    .line 1867
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1868
    .line 1869
    .line 1870
    move-result v9

    .line 1871
    if-nez v9, :cond_6e

    .line 1872
    .line 1873
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v8

    .line 1877
    invoke-static {v8, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1878
    .line 1879
    .line 1880
    move-result v8

    .line 1881
    if-eqz v8, :cond_6e

    .line 1882
    .line 1883
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1884
    .line 1885
    .line 1886
    goto :goto_38

    .line 1887
    :cond_6f
    :try_start_e
    invoke-static {v11, v4}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v0

    .line 1891
    check-cast v0, Ljava/lang/reflect/Field;

    .line 1892
    .line 1893
    if-eqz v0, :cond_70

    .line 1894
    .line 1895
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 1896
    .line 1897
    .line 1898
    move-result v0

    .line 1899
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    .line 1903
    goto :goto_3a

    .line 1904
    :catchall_d
    move-exception v0

    .line 1905
    goto :goto_39

    .line 1906
    :cond_70
    move-object v0, v12

    .line 1907
    goto :goto_3a

    .line 1908
    :goto_39
    new-instance v6, Leo1;

    .line 1909
    .line 1910
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1911
    .line 1912
    .line 1913
    move-object v0, v6

    .line 1914
    :goto_3a
    instance-of v6, v0, Leo1;

    .line 1915
    .line 1916
    if-eqz v6, :cond_71

    .line 1917
    .line 1918
    move-object v0, v12

    .line 1919
    :cond_71
    check-cast v0, Ljava/lang/Integer;

    .line 1920
    .line 1921
    if-eqz v0, :cond_72

    .line 1922
    .line 1923
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1924
    .line 1925
    .line 1926
    move-result v0

    .line 1927
    move v6, v0

    .line 1928
    goto :goto_3b

    .line 1929
    :cond_72
    move v6, v11

    .line 1930
    :goto_3b
    :try_start_f
    invoke-static {v10, v4}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v0

    .line 1934
    check-cast v0, Ljava/lang/reflect/Field;

    .line 1935
    .line 1936
    if-eqz v0, :cond_73

    .line 1937
    .line 1938
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 1939
    .line 1940
    .line 1941
    move-result v0

    .line 1942
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_e

    .line 1946
    goto :goto_3d

    .line 1947
    :catchall_e
    move-exception v0

    .line 1948
    goto :goto_3c

    .line 1949
    :cond_73
    move-object v0, v12

    .line 1950
    goto :goto_3d

    .line 1951
    :goto_3c
    new-instance v2, Leo1;

    .line 1952
    .line 1953
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1954
    .line 1955
    .line 1956
    move-object v0, v2

    .line 1957
    :goto_3d
    instance-of v2, v0, Leo1;

    .line 1958
    .line 1959
    if-eqz v2, :cond_74

    .line 1960
    .line 1961
    move-object v0, v12

    .line 1962
    :cond_74
    check-cast v0, Ljava/lang/Integer;

    .line 1963
    .line 1964
    if-eqz v0, :cond_75

    .line 1965
    .line 1966
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1967
    .line 1968
    .line 1969
    move-result v11

    .line 1970
    :cond_75
    :try_start_10
    invoke-virtual {v5, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1971
    .line 1972
    .line 1973
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v0

    .line 1977
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v2

    .line 1981
    filled-new-array {v3, v0, v2}, [Ljava/lang/Object;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v0

    .line 1985
    invoke-virtual {v5, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 1986
    .line 1987
    .line 1988
    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_f

    .line 1989
    goto :goto_3e

    .line 1990
    :catchall_f
    move-exception v0

    .line 1991
    new-instance v2, Leo1;

    .line 1992
    .line 1993
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1994
    .line 1995
    .line 1996
    move-object v0, v2

    .line 1997
    :goto_3e
    instance-of v2, v0, Leo1;

    .line 1998
    .line 1999
    if-eqz v2, :cond_76

    .line 2000
    .line 2001
    goto :goto_3f

    .line 2002
    :cond_76
    move-object v12, v0

    .line 2003
    :cond_77
    :goto_3f
    if-eqz v12, :cond_78

    .line 2004
    .line 2005
    invoke-virtual {v1, v12}, Lk01;->α(Ljava/lang/Object;)V

    .line 2006
    .line 2007
    .line 2008
    :cond_78
    return-void

    .line 2009
    :pswitch_14
    move/from16 v16, v9

    .line 2010
    .line 2011
    const-wide/16 v17, 0x0

    .line 2012
    .line 2013
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2014
    .line 2015
    .line 2016
    invoke-static {v3, v11}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 2017
    .line 2018
    .line 2019
    move-result v0

    .line 2020
    if-eqz v0, :cond_80

    .line 2021
    .line 2022
    iget-object v0, v1, Lk01;->ζ:Ljava/lang/Throwable;

    .line 2023
    .line 2024
    if-eqz v0, :cond_79

    .line 2025
    .line 2026
    move v0, v10

    .line 2027
    goto :goto_40

    .line 2028
    :cond_79
    move v0, v11

    .line 2029
    :goto_40
    iget-object v2, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 2030
    .line 2031
    if-eqz v0, :cond_7a

    .line 2032
    .line 2033
    goto :goto_41

    .line 2034
    :cond_7a
    array-length v0, v2

    .line 2035
    if-ge v0, v8, :cond_7b

    .line 2036
    .line 2037
    goto :goto_41

    .line 2038
    :cond_7b
    aget-object v0, v2, v11

    .line 2039
    .line 2040
    instance-of v3, v0, Ljava/lang/Number;

    .line 2041
    .line 2042
    if-eqz v3, :cond_7c

    .line 2043
    .line 2044
    move-object v12, v0

    .line 2045
    check-cast v12, Ljava/lang/Number;

    .line 2046
    .line 2047
    :cond_7c
    if-eqz v12, :cond_80

    .line 2048
    .line 2049
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 2050
    .line 2051
    .line 2052
    move-result-wide v3

    .line 2053
    invoke-static {v3, v4}, Lmi1;->ι(J)J

    .line 2054
    .line 2055
    .line 2056
    move-result-wide v3

    .line 2057
    cmp-long v0, v3, v17

    .line 2058
    .line 2059
    if-gtz v0, :cond_7d

    .line 2060
    .line 2061
    goto :goto_41

    .line 2062
    :cond_7d
    aget-object v0, v2, v10

    .line 2063
    .line 2064
    instance-of v0, v0, Ljava/lang/Boolean;

    .line 2065
    .line 2066
    if-eqz v0, :cond_80

    .line 2067
    .line 2068
    aget-object v0, v2, v16

    .line 2069
    .line 2070
    instance-of v0, v0, Ljava/lang/Number;

    .line 2071
    .line 2072
    if-nez v0, :cond_7e

    .line 2073
    .line 2074
    goto :goto_41

    .line 2075
    :cond_7e
    invoke-static {v3, v4}, Lmi1;->γ(J)Ljava/lang/String;

    .line 2076
    .line 2077
    .line 2078
    move-result-object v0

    .line 2079
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 2080
    .line 2081
    .line 2082
    move-result v2

    .line 2083
    if-eqz v2, :cond_7f

    .line 2084
    .line 2085
    goto :goto_41

    .line 2086
    :cond_7f
    iget-object v2, v1, Lk01;->ε:Ljava/lang/Object;

    .line 2087
    .line 2088
    instance-of v3, v2, Ljava/lang/String;

    .line 2089
    .line 2090
    if-eqz v3, :cond_80

    .line 2091
    .line 2092
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2093
    .line 2094
    .line 2095
    move-result v2

    .line 2096
    if-nez v2, :cond_80

    .line 2097
    .line 2098
    invoke-virtual {v1, v0}, Lk01;->α(Ljava/lang/Object;)V

    .line 2099
    .line 2100
    .line 2101
    :cond_80
    :goto_41
    return-void

    .line 2102
    :pswitch_15
    move/from16 v16, v9

    .line 2103
    .line 2104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2105
    .line 2106
    .line 2107
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 2108
    .line 2109
    aget-object v0, v0, v11

    .line 2110
    .line 2111
    instance-of v1, v0, Landroid/content/Context;

    .line 2112
    .line 2113
    if-eqz v1, :cond_81

    .line 2114
    .line 2115
    move-object v12, v0

    .line 2116
    check-cast v12, Landroid/content/Context;

    .line 2117
    .line 2118
    :cond_81
    if-nez v12, :cond_82

    .line 2119
    .line 2120
    goto/16 :goto_47

    .line 2121
    .line 2122
    :cond_82
    :try_start_11
    invoke-static {v12}, Lui1;->π(Landroid/content/Context;)V

    .line 2123
    .line 2124
    .line 2125
    sget-object v0, Ls62;->α:Ls62;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_10

    .line 2126
    .line 2127
    goto :goto_42

    .line 2128
    :catchall_10
    move-exception v0

    .line 2129
    new-instance v1, Leo1;

    .line 2130
    .line 2131
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2132
    .line 2133
    .line 2134
    move-object v0, v1

    .line 2135
    :goto_42
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v0

    .line 2139
    if-eqz v0, :cond_83

    .line 2140
    .line 2141
    sget-object v1, Lsh1;->α:Lsh1;

    .line 2142
    .line 2143
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2144
    .line 2145
    const-string v2, "PrefsManager.init failed: "

    .line 2146
    .line 2147
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2148
    .line 2149
    .line 2150
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2151
    .line 2152
    .line 2153
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2154
    .line 2155
    .line 2156
    move-result-object v0

    .line 2157
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 2158
    .line 2159
    .line 2160
    :cond_83
    sget-object v0, Ls00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2161
    .line 2162
    invoke-virtual {v12}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v0

    .line 2166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2167
    .line 2168
    .line 2169
    sget-object v1, Lr00;->ι:Lrz;

    .line 2170
    .line 2171
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2172
    .line 2173
    .line 2174
    new-instance v2, Lτ;

    .line 2175
    .line 2176
    invoke-direct {v2, v1}, Lτ;-><init>(Lχ;)V

    .line 2177
    .line 2178
    .line 2179
    :goto_43
    invoke-virtual {v2}, Lτ;->hasNext()Z

    .line 2180
    .line 2181
    .line 2182
    move-result v1

    .line 2183
    if-eqz v1, :cond_84

    .line 2184
    .line 2185
    invoke-virtual {v2}, Lτ;->next()Ljava/lang/Object;

    .line 2186
    .line 2187
    .line 2188
    move-result-object v1

    .line 2189
    check-cast v1, Lr00;

    .line 2190
    .line 2191
    invoke-static {v1, v0, v11}, Ls00;->δ(Lr00;Ljava/lang/ClassLoader;Z)V

    .line 2192
    .line 2193
    .line 2194
    goto :goto_43

    .line 2195
    :cond_84
    sget-object v0, Lx00;->α:Lx00;

    .line 2196
    .line 2197
    invoke-virtual {v12}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2198
    .line 2199
    .line 2200
    move-result-object v1

    .line 2201
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2202
    .line 2203
    .line 2204
    invoke-virtual {v0, v1}, Lx00;->δ(Ljava/lang/ClassLoader;)V

    .line 2205
    .line 2206
    .line 2207
    sget-object v0, Lt7;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2208
    .line 2209
    new-instance v1, Lny0;

    .line 2210
    .line 2211
    sget-object v3, Lsh1;->α:Lsh1;

    .line 2212
    .line 2213
    const/4 v7, 0x0

    .line 2214
    const/16 v8, 0x12

    .line 2215
    .line 2216
    const/4 v2, 0x1

    .line 2217
    const-class v4, Lsh1;

    .line 2218
    .line 2219
    const-string v5, "onNonVideoTimerElapsed"

    .line 2220
    .line 2221
    const-string v6, "onNonVideoTimerElapsed(Lcom/example/dyhelper/hook/feed/autoscroll/AutoScrollCoordinator$Trigger;)Lcom/example/dyhelper/hook/feed/autoscroll/AutoScrollCoordinator$TriggerResult;"

    .line 2222
    .line 2223
    invoke-direct/range {v1 .. v8}, Lny0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 2224
    .line 2225
    .line 2226
    sput-object v1, Lt7;->δ:Lny0;

    .line 2227
    .line 2228
    sget-object v0, Lt7;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2229
    .line 2230
    invoke-virtual {v0, v11, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 2231
    .line 2232
    .line 2233
    move-result v0

    .line 2234
    if-nez v0, :cond_85

    .line 2235
    .line 2236
    goto :goto_44

    .line 2237
    :cond_85
    sget-object v0, Lpq;->α:Lpq;

    .line 2238
    .line 2239
    sget-object v0, Lt7;->θ:Ln7;

    .line 2240
    .line 2241
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2242
    .line 2243
    .line 2244
    sget-object v1, Lpq;->κ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2245
    .line 2246
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 2247
    .line 2248
    .line 2249
    sget-object v0, Lui1;->α:Ljava/lang/Object;

    .line 2250
    .line 2251
    sget-object v0, Lt7;->ι:Ln7;

    .line 2252
    .line 2253
    invoke-static {v0}, Lui1;->β(La80;)V

    .line 2254
    .line 2255
    .line 2256
    new-instance v0, Lo7;

    .line 2257
    .line 2258
    move/from16 v1, v16

    .line 2259
    .line 2260
    invoke-direct {v0, v1}, Lo7;-><init>(I)V

    .line 2261
    .line 2262
    .line 2263
    invoke-static {v0}, Lt7;->δ(Lp70;)V

    .line 2264
    .line 2265
    .line 2266
    :goto_44
    invoke-virtual {v12}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2267
    .line 2268
    .line 2269
    move-result-object v0

    .line 2270
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2271
    .line 2272
    .line 2273
    sget-object v1, Lsh1;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2274
    .line 2275
    invoke-virtual {v1, v11, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 2276
    .line 2277
    .line 2278
    move-result v1

    .line 2279
    if-nez v1, :cond_86

    .line 2280
    .line 2281
    goto :goto_47

    .line 2282
    :cond_86
    sget-object v1, Lsh1;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2283
    .line 2284
    invoke-virtual {v1, v11, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 2285
    .line 2286
    .line 2287
    move-result v1

    .line 2288
    if-nez v1, :cond_87

    .line 2289
    .line 2290
    goto :goto_46

    .line 2291
    :cond_87
    invoke-static {v0}, Luh1;->ι(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 2292
    .line 2293
    .line 2294
    move-result-object v1

    .line 2295
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v1

    .line 2299
    :goto_45
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2300
    .line 2301
    .line 2302
    move-result v2

    .line 2303
    if-eqz v2, :cond_88

    .line 2304
    .line 2305
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2306
    .line 2307
    .line 2308
    move-result-object v2

    .line 2309
    check-cast v2, Ljava/lang/Class;

    .line 2310
    .line 2311
    sget-object v3, Lsh1;->α:Lsh1;

    .line 2312
    .line 2313
    invoke-virtual {v3, v2}, Lsh1;->θ(Ljava/lang/Class;)V

    .line 2314
    .line 2315
    .line 2316
    goto :goto_45

    .line 2317
    :cond_88
    :goto_46
    invoke-static {v0}, Luh1;->κ(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 2318
    .line 2319
    .line 2320
    move-result-object v1

    .line 2321
    invoke-static {v0, v1}, Lsh1;->η(Ljava/lang/ClassLoader;Ljava/util/List;)V

    .line 2322
    .line 2323
    .line 2324
    new-instance v1, Ljava/lang/Thread;

    .line 2325
    .line 2326
    new-instance v2, Loj;

    .line 2327
    .line 2328
    const/4 v3, 0x7

    .line 2329
    invoke-direct {v2, v0, v3}, Loj;-><init>(Ljava/lang/ClassLoader;I)V

    .line 2330
    .line 2331
    .line 2332
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 2333
    .line 2334
    .line 2335
    const-string v0, "rff9863a9a12f7ffb"

    .line 2336
    .line 2337
    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 2338
    .line 2339
    .line 2340
    invoke-virtual {v1, v10}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 2341
    .line 2342
    .line 2343
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 2344
    .line 2345
    .line 2346
    :goto_47
    return-void

    .line 2347
    :pswitch_16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2348
    .line 2349
    .line 2350
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 2351
    .line 2352
    invoke-static {v0}, Lsh1;->β(Ljava/lang/Object;)V

    .line 2353
    .line 2354
    .line 2355
    return-void

    .line 2356
    :pswitch_17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2357
    .line 2358
    .line 2359
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 2360
    .line 2361
    aget-object v0, v0, v11

    .line 2362
    .line 2363
    instance-of v1, v0, Landroid/view/MotionEvent;

    .line 2364
    .line 2365
    if-eqz v1, :cond_89

    .line 2366
    .line 2367
    move-object v12, v0

    .line 2368
    check-cast v12, Landroid/view/MotionEvent;

    .line 2369
    .line 2370
    :cond_89
    if-nez v12, :cond_8a

    .line 2371
    .line 2372
    goto :goto_48

    .line 2373
    :cond_8a
    sget-boolean v0, Lsh1;->λ:Z

    .line 2374
    .line 2375
    if-eqz v0, :cond_8b

    .line 2376
    .line 2377
    goto :goto_48

    .line 2378
    :cond_8b
    invoke-virtual {v12}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2379
    .line 2380
    .line 2381
    move-result v0

    .line 2382
    if-eq v0, v10, :cond_8c

    .line 2383
    .line 2384
    invoke-virtual {v12}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2385
    .line 2386
    .line 2387
    move-result v0

    .line 2388
    if-ne v0, v8, :cond_8d

    .line 2389
    .line 2390
    :cond_8c
    new-instance v0, Lo7;

    .line 2391
    .line 2392
    const/4 v1, 0x4

    .line 2393
    invoke-direct {v0, v1}, Lo7;-><init>(I)V

    .line 2394
    .line 2395
    .line 2396
    invoke-static {v0}, Lt7;->δ(Lp70;)V

    .line 2397
    .line 2398
    .line 2399
    :cond_8d
    :goto_48
    return-void

    .line 2400
    :pswitch_18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2401
    .line 2402
    .line 2403
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 2404
    .line 2405
    instance-of v1, v0, Landroid/app/Activity;

    .line 2406
    .line 2407
    if-eqz v1, :cond_8e

    .line 2408
    .line 2409
    check-cast v0, Landroid/app/Activity;

    .line 2410
    .line 2411
    goto :goto_49

    .line 2412
    :cond_8e
    move-object v0, v12

    .line 2413
    :goto_49
    if-nez v0, :cond_8f

    .line 2414
    .line 2415
    goto :goto_4b

    .line 2416
    :cond_8f
    sget-object v1, Lsh1;->κ:Ljava/lang/ref/WeakReference;

    .line 2417
    .line 2418
    if-eqz v1, :cond_90

    .line 2419
    .line 2420
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 2421
    .line 2422
    .line 2423
    move-result-object v1

    .line 2424
    check-cast v1, Landroid/app/Activity;

    .line 2425
    .line 2426
    goto :goto_4a

    .line 2427
    :cond_90
    move-object v1, v12

    .line 2428
    :goto_4a
    if-ne v1, v0, :cond_91

    .line 2429
    .line 2430
    sget-object v0, Lsh1;->α:Lsh1;

    .line 2431
    .line 2432
    sput-object v12, Lsh1;->κ:Ljava/lang/ref/WeakReference;

    .line 2433
    .line 2434
    :cond_91
    new-instance v0, Lo7;

    .line 2435
    .line 2436
    invoke-direct {v0, v8}, Lo7;-><init>(I)V

    .line 2437
    .line 2438
    .line 2439
    invoke-static {v0}, Lt7;->δ(Lp70;)V

    .line 2440
    .line 2441
    .line 2442
    :goto_4b
    return-void

    .line 2443
    :pswitch_19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2444
    .line 2445
    .line 2446
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 2447
    .line 2448
    instance-of v1, v0, Landroid/app/Activity;

    .line 2449
    .line 2450
    if-eqz v1, :cond_92

    .line 2451
    .line 2452
    move-object v12, v0

    .line 2453
    check-cast v12, Landroid/app/Activity;

    .line 2454
    .line 2455
    :cond_92
    if-nez v12, :cond_93

    .line 2456
    .line 2457
    goto :goto_4c

    .line 2458
    :cond_93
    sget-object v0, Lsh1;->α:Lsh1;

    .line 2459
    .line 2460
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2461
    .line 2462
    invoke-direct {v0, v12}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 2463
    .line 2464
    .line 2465
    sput-object v0, Lsh1;->κ:Ljava/lang/ref/WeakReference;

    .line 2466
    .line 2467
    new-instance v0, Lo7;

    .line 2468
    .line 2469
    invoke-direct {v0, v11}, Lo7;-><init>(I)V

    .line 2470
    .line 2471
    .line 2472
    invoke-static {v0}, Lt7;->δ(Lp70;)V

    .line 2473
    .line 2474
    .line 2475
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 2476
    .line 2477
    invoke-static {v12}, Los;->Γ(Landroid/app/Activity;)V

    .line 2478
    .line 2479
    .line 2480
    :goto_4c
    return-void

    .line 2481
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_0
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
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 3

    .line 1
    iget v0, p0, Lad1;->α:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Lm01;->beforeHookedMethod(Lk01;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :sswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    :try_start_0
    sget-object p0, Lry1;->ψ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p1, Lk01;->β:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    sget-object p0, Lry1;->ω:Ljava/util/concurrent/atomic/AtomicReference;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v1, p1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    sget-object v0, Lry1;->α:Lry1;

    .line 49
    .line 50
    invoke-static {p1}, Lry1;->π(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lry1;->ο()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    sget-object p1, Lry1;->α:Lry1;

    .line 65
    .line 66
    const-string p1, "\u53d1\u9001\u5165\u53e3 beforeHook \u5f02\u5e38"

    .line 67
    .line 68
    invoke-static {p1, p0}, Lry1;->э(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    :goto_0
    return-void

    .line 72
    :sswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 76
    .line 77
    sget-object p1, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-nez v0, :cond_3

    .line 84
    .line 85
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object p1, Lry1;->α:Lry1;

    .line 89
    .line 90
    invoke-static {p0}, Lry1;->ξ(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    return-void

    .line 94
    :sswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 98
    .line 99
    instance-of p1, p0, Landroid/view/View;

    .line 100
    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    move-object v2, p0

    .line 104
    check-cast v2, Landroid/view/View;

    .line 105
    .line 106
    :cond_4
    if-nez v2, :cond_5

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    sget-object p0, Lqr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 110
    .line 111
    invoke-static {v2}, Lqr1;->α(Landroid/view/View;)V

    .line 112
    .line 113
    .line 114
    :goto_1
    return-void

    .line 115
    :sswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 119
    .line 120
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 121
    .line 122
    instance-of v0, p1, Landroid/view/View;

    .line 123
    .line 124
    if-eqz v0, :cond_6

    .line 125
    .line 126
    move-object v2, p1

    .line 127
    check-cast v2, Landroid/view/View;

    .line 128
    .line 129
    :cond_6
    if-nez v2, :cond_7

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_7
    sget-object p1, Lqr1;->γ:Ljava/util/Set;

    .line 133
    .line 134
    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_8

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_8
    sget-object p1, Lqr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 142
    .line 143
    const-string p1, "default"

    .line 144
    .line 145
    invoke-static {}, Lui1;->Α()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_9

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_9
    const-string v0, "seekbar_visibility_mode"

    .line 153
    .line 154
    invoke-static {v0, p1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 159
    .line 160
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    :goto_2
    const-string v0, "show"

    .line 168
    .line 169
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_a

    .line 174
    .line 175
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    aput-object p1, p0, v1

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_a
    const-string v0, "hide"

    .line 183
    .line 184
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-eqz p1, :cond_b

    .line 189
    .line 190
    const/4 p1, 0x4

    .line 191
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    aput-object p1, p0, v1

    .line 196
    .line 197
    :cond_b
    :goto_3
    return-void

    .line 198
    :sswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    :try_start_1
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 202
    .line 203
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-static {v1, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    instance-of v0, p0, Landroid/view/View;

    .line 211
    .line 212
    if-eqz v0, :cond_c

    .line 213
    .line 214
    move-object v2, p0

    .line 215
    check-cast v2, Landroid/view/View;

    .line 216
    .line 217
    :cond_c
    if-nez v2, :cond_d

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_d
    sget-object p0, Luj1;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 221
    .line 222
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 223
    .line 224
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-static {v2, p0}, Luj1;->θ(Landroid/view/View;Ljava/lang/Object;)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    if-nez p0, :cond_e

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_e
    sget-object p1, Lnj1;->β:Ljava/lang/Object;

    .line 235
    .line 236
    monitor-enter p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 237
    :try_start_2
    sget-object v0, Lnj1;->γ:Ljava/util/WeakHashMap;

    .line 238
    .line 239
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    check-cast v0, Ljava/lang/Float;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 244
    .line 245
    :try_start_3
    monitor-exit p1

    .line 246
    if-eqz v0, :cond_f

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    invoke-static {p0, p1}, Lnj1;->θ(Landroid/view/View;F)V

    .line 253
    .line 254
    .line 255
    :cond_f
    :goto_4
    sget-object p0, Ls62;->α:Ls62;

    .line 256
    .line 257
    goto :goto_5

    .line 258
    :catchall_1
    move-exception p0

    .line 259
    monitor-exit p1

    .line 260
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 261
    :catchall_2
    move-exception p0

    .line 262
    new-instance p1, Leo1;

    .line 263
    .line 264
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 265
    .line 266
    .line 267
    move-object p0, p1

    .line 268
    :goto_5
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    if-eqz p0, :cond_10

    .line 273
    .line 274
    sget-object p1, Lqj1;->α:Lqj1;

    .line 275
    .line 276
    const-string p1, "callback_search_before"

    .line 277
    .line 278
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    new-instance v0, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    const-string v1, "search_before \u56de\u8c03\u5df2\u964d\u7ea7: "

    .line 285
    .line 286
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    invoke-static {p1, p0}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    :cond_10
    return-void

    .line 300
    :sswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 304
    .line 305
    if-nez p0, :cond_11

    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_11
    sget-object p1, Lsh1;->ο:Ljava/lang/ref/WeakReference;

    .line 309
    .line 310
    if-eqz p1, :cond_12

    .line 311
    .line 312
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    :cond_12
    if-ne v2, p0, :cond_13

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_13
    invoke-static {p0}, Lsh1;->β(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    :goto_6
    return-void

    .line 323
    :sswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 327
    .line 328
    aget-object p0, p0, v1

    .line 329
    .line 330
    instance-of p1, p0, Landroid/view/MotionEvent;

    .line 331
    .line 332
    if-eqz p1, :cond_14

    .line 333
    .line 334
    move-object v2, p0

    .line 335
    check-cast v2, Landroid/view/MotionEvent;

    .line 336
    .line 337
    :cond_14
    if-nez v2, :cond_15

    .line 338
    .line 339
    goto :goto_7

    .line 340
    :cond_15
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 341
    .line 342
    .line 343
    move-result p0

    .line 344
    if-nez p0, :cond_16

    .line 345
    .line 346
    sget-boolean p0, Lsh1;->λ:Z

    .line 347
    .line 348
    if-nez p0, :cond_16

    .line 349
    .line 350
    sget-object p0, Lsh1;->η:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 351
    .line 352
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 353
    .line 354
    .line 355
    new-instance p0, Lo7;

    .line 356
    .line 357
    const/4 p1, 0x5

    .line 358
    invoke-direct {p0, p1}, Lo7;-><init>(I)V

    .line 359
    .line 360
    .line 361
    invoke-static {p0}, Lt7;->δ(Lp70;)V

    .line 362
    .line 363
    .line 364
    :cond_16
    :goto_7
    return-void

    .line 365
    :sswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    :try_start_4
    sget-object p0, Lbd1;->α:Ljava/util/Set;

    .line 369
    .line 370
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 371
    .line 372
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    invoke-static {p0}, Lbd1;->ε([Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    sget-object p0, Ls62;->α:Ls62;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 379
    .line 380
    goto :goto_8

    .line 381
    :catchall_3
    move-exception p0

    .line 382
    new-instance p1, Leo1;

    .line 383
    .line 384
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 385
    .line 386
    .line 387
    move-object p0, p1

    .line 388
    :goto_8
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    if-eqz p0, :cond_17

    .line 393
    .line 394
    const-string p1, "rc2954fec18baf260"

    .line 395
    .line 396
    const-string v0, "\u89c2\u5bdf\u4e16\u754c\u4f1a\u8bdd\u4e0a\u4e0b\u6587\u5931\u8d25"

    .line 397
    .line 398
    invoke-static {p1, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 399
    .line 400
    .line 401
    :cond_17
    return-void

    .line 402
    :sswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    :try_start_5
    sget-object p0, Lbd1;->α:Ljava/util/Set;

    .line 406
    .line 407
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 408
    .line 409
    instance-of p1, p0, Landroid/app/Activity;

    .line 410
    .line 411
    if-eqz p1, :cond_18

    .line 412
    .line 413
    move-object v2, p0

    .line 414
    check-cast v2, Landroid/app/Activity;

    .line 415
    .line 416
    :cond_18
    invoke-static {v2}, Lbd1;->ζ(Landroid/app/Activity;)V

    .line 417
    .line 418
    .line 419
    sget-object p0, Ls62;->α:Ls62;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 420
    .line 421
    goto :goto_9

    .line 422
    :catchall_4
    move-exception p0

    .line 423
    new-instance p1, Leo1;

    .line 424
    .line 425
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 426
    .line 427
    .line 428
    move-object p0, p1

    .line 429
    :goto_9
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 430
    .line 431
    .line 432
    move-result-object p0

    .line 433
    if-eqz p0, :cond_19

    .line 434
    .line 435
    const-string p1, "rc2954fec18baf260"

    .line 436
    .line 437
    const-string v0, "\u89c2\u5bdf\u4e16\u754c\u542f\u52a8\u4e0a\u4e0b\u6587\u5931\u8d25"

    .line 438
    .line 439
    invoke-static {p1, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 440
    .line 441
    .line 442
    :cond_19
    return-void

    .line 443
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_8
        0x1 -> :sswitch_7
        0x4 -> :sswitch_6
        0x6 -> :sswitch_5
        0xb -> :sswitch_4
        0x15 -> :sswitch_3
        0x17 -> :sswitch_2
        0x1a -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method
