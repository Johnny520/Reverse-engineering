.class public final synthetic Lyyds/ᛴᛳᲇᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛴᛳᲇᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Object;
    .locals 6

    .line 1
    iget p0, p0, Lyyds/ᛴᛳᲇᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    sget-object v2, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 6
    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p0, Lyyds/ᛳᛱᲇ;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lyyds/ᲈᲇᛶᲇ;

    .line 16
    .line 17
    invoke-direct {v0}, Lyyds/ᲈᲇᛶᲇ;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lyyds/ᛶᛲᛷ;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lyyds/ᛶᛲᛷ;-><init>(Lyyds/ᲈᲇᛶᲇ;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lyyds/ᛳᛱᲇ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛷ;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    return-object v2

    .line 29
    :pswitch_1
    new-instance p0, Landroid/os/Handler;

    .line 30
    .line 31
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_2
    const-wide v2, -0x2af53e68a836eL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    sget-object v0, Lcom/tencent/mmkv/MMKV;->ᛲᲈᲁ:Ljava/util/EnumMap;

    .line 49
    .line 50
    new-instance v0, Lyyds/ᛸᛴᛷᛵ;

    .line 51
    .line 52
    const/4 v2, 0x5

    .line 53
    invoke-direct {v0, v2, v1}, Lyyds/ᛸᛴᛷᛵ;-><init>(IB)V

    .line 54
    .line 55
    .line 56
    const/4 v1, 0x2

    .line 57
    iput v1, v0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 58
    .line 59
    invoke-static {p0, v0}, Lcom/tencent/mmkv/MMKV;->ᛵᛸᛸᛷ(Ljava/lang/String;Lyyds/ᛸᛴᛷᛵ;)Lcom/tencent/mmkv/MMKV;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const-wide v0, -0x2af5fe68a836eL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_3
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_4
    new-instance p0, Landroid/os/Handler;

    .line 76
    .line 77
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 82
    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_5
    new-instance p0, Landroid/os/Handler;

    .line 86
    .line 87
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 92
    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_6
    invoke-static {}, Lyyds/ᛱᛶᛱᛴ;->ᛲᲈᲁ()Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :pswitch_7
    sget-object p0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 101
    .line 102
    const-wide v0, -0x25dd6e68a836eL

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    const-wide v2, -0x25dfce68a836eL

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Lyyds/ᛳᲈᲁᲀ;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_8
    sget-object p0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 120
    .line 121
    const-wide v0, -0x25da4e68a836eL

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    const-wide v2, -0x25dcde68a836eL

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, Lyyds/ᛳᲈᲁᲀ;

    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_9
    invoke-static {}, Lyyds/ᛷᛸ;->ᛲᛴᛳᛲ()Lyyds/ᲈᛱᛱᛴ;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    sget-object v0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 143
    .line 144
    const-wide v2, -0x25d60e68a836eL

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    const-wide v4, -0x25d72e68a836eL

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    invoke-static {v2, v3, v4, v5}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Lyyds/ᛳᲈᲁᲀ;

    .line 159
    .line 160
    if-eqz v0, :cond_0

    .line 161
    .line 162
    invoke-virtual {p0, v0}, Lyyds/ᲈᛱᛱᛴ;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    :cond_0
    const-wide v2, -0x25d7be68a836eL

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    const-wide v2, -0x25d9be68a836eL

    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    invoke-static {v0}, Lyyds/ᛷᛶᲇᲁ;->ᛲᛴᛳᛲ(Ljava/lang/String;)Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {p0, v0}, Lyyds/ᲈᛱᛱᛴ;->addAll(Ljava/util/Collection;)Z

    .line 187
    .line 188
    .line 189
    invoke-static {p0}, Lyyds/ᛷᛸ;->ᲇᲈᛵᛷ(Lyyds/ᲈᛱᛱᛴ;)Lyyds/ᲈᛱᛱᛴ;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    new-instance v0, Ljava/util/HashSet;

    .line 194
    .line 195
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 196
    .line 197
    .line 198
    new-instance v2, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0, v1}, Lyyds/ᲈᛱᛱᛴ;->listIterator(I)Ljava/util/ListIterator;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    :cond_1
    :goto_0
    move-object v1, p0

    .line 208
    check-cast v1, Lyyds/ᛲᛶᛳᲀ;

    .line 209
    .line 210
    invoke-virtual {v1}, Lyyds/ᛲᛶᛳᲀ;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-eqz v3, :cond_2

    .line 215
    .line 216
    invoke-virtual {v1}, Lyyds/ᛲᛶᛳᲀ;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    move-object v3, v1

    .line 221
    check-cast v3, Lyyds/ᛳᲈᲁᲀ;

    .line 222
    .line 223
    invoke-virtual {v3}, Lyyds/ᛳᲈᲁᲀ;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-eqz v3, :cond_1

    .line 232
    .line 233
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    goto :goto_0

    .line 237
    :cond_2
    return-object v2

    .line 238
    :pswitch_a
    sget-object p0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 239
    .line 240
    const-wide v0, -0x25e90e68a836eL

    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    const-wide v2, -0x25eaee68a836eL

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    check-cast p0, Lyyds/ᛳᲈᲁᲀ;

    .line 255
    .line 256
    return-object p0

    .line 257
    :pswitch_b
    sget-object p0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 258
    .line 259
    const-wide v0, -0x25e69e68a836eL

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    const-wide v2, -0x25e86e68a836eL

    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    check-cast p0, Lyyds/ᛳᲈᲁᲀ;

    .line 274
    .line 275
    return-object p0

    .line 276
    :pswitch_c
    sget-object p0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 277
    .line 278
    const-wide v0, -0x25e48e68a836eL

    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    const-wide v2, -0x25e61e68a836eL

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    check-cast p0, Lyyds/ᛳᲈᲁᲀ;

    .line 293
    .line 294
    return-object p0

    .line 295
    :pswitch_d
    sget-object p0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 296
    .line 297
    const-wide v1, -0x25e24e68a836eL

    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    const-wide v3, -0x25e3de68a836eL

    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    invoke-static {v1, v2, v3, v4}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    check-cast p0, Lyyds/ᲀᲀᛶᲈ;

    .line 312
    .line 313
    if-eqz p0, :cond_3

    .line 314
    .line 315
    iget-object v0, p0, Lyyds/ᲀᲀᛶᲈ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 316
    .line 317
    :cond_3
    return-object v0

    .line 318
    :pswitch_e
    sget-object p0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 319
    .line 320
    const-wide v0, -0x25e05e68a836eL

    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    const-wide v2, -0x25e1de68a836eL

    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    check-cast p0, Lyyds/ᛳᲈᲁᲀ;

    .line 335
    .line 336
    return-object p0

    .line 337
    :pswitch_f
    sget-object p0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 338
    .line 339
    const-wide v0, -0x25d3ce68a836eL

    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    const-wide v2, -0x25d59e68a836eL

    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    check-cast p0, Lyyds/ᛳᲈᲁᲀ;

    .line 354
    .line 355
    return-object p0

    .line 356
    :pswitch_10
    const-class p0, Lyyds/ᲀᛵᛲᲁ;

    .line 357
    .line 358
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    const-string v2, "android.os.Build"

    .line 363
    .line 364
    sget v3, Lyyds/ᛶᛷᛱᲈ;->ᛲᲈᲁ:I

    .line 365
    .line 366
    :try_start_0
    invoke-virtual {p0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 370
    if-eqz p0, :cond_4

    .line 371
    .line 372
    goto :goto_1

    .line 373
    :cond_4
    move-object p0, v0

    .line 374
    goto :goto_1

    .line 375
    :catchall_0
    move-exception p0

    .line 376
    new-instance v2, Lyyds/ᲈᛵᛵᛴ;

    .line 377
    .line 378
    invoke-direct {v2, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 379
    .line 380
    .line 381
    move-object p0, v2

    .line 382
    :goto_1
    instance-of v2, p0, Lyyds/ᲈᛵᛵᛴ;

    .line 383
    .line 384
    if-eqz v2, :cond_5

    .line 385
    .line 386
    goto :goto_2

    .line 387
    :cond_5
    move-object v0, p0

    .line 388
    :goto_2
    check-cast v0, Ljava/lang/Class;

    .line 389
    .line 390
    if-eqz v0, :cond_6

    .line 391
    .line 392
    const/4 v1, 0x1

    .line 393
    :cond_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    return-object p0

    .line 398
    nop

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
