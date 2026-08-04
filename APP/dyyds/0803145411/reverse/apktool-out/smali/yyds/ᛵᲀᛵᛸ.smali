.class public final synthetic Lyyds/ᛵᲀᛵᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Lyyds/ᛵᲀᛵᛸ;->ᲀᛲᛳᲀ:I

    iput-object p1, p0, Lyyds/ᛵᲀᛵᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᛵᲀᛵᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᛲᲈᛷᛳ;Landroid/app/Dialog;Ljava/lang/Object;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    iput p1, p0, Lyyds/ᛵᲀᛵᛸ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lyyds/ᛵᲀᛵᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lyyds/ᛵᲀᛵᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lyyds/ᛵᲀᛵᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyyds/ᛵᲀᛵᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Landroid/app/Dialog;

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᛵᲀᛵᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroid/content/Context;

    .line 14
    .line 15
    check-cast p2, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    const-wide v2, -0x3c8bae68a836eL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    :try_start_0
    sget-object v0, Lyyds/ᲀᛴᛶᛸ;->ᲇᲇᲇᛱ:Lyyds/ᲀᛴᛶᛸ;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Lyyds/ᲀᛴᛶᛸ;->ᛸᛸᛷᛱ(Ljava/lang/Object;)Lyyds/ᛶᛴᲇ;

    .line 32
    .line 33
    .line 34
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    move-object p0, v0

    .line 38
    new-instance v0, Lyyds/ᲈᛵᛵᛴ;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    move-object p0, v0

    .line 44
    :goto_0
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    sget-object v2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 51
    .line 52
    const-wide v3, -0x3c8c2e68a836eL

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v2, v3, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    new-instance p0, Lyyds/ᛶᛴᲇ;

    .line 72
    .line 73
    const-wide v2, -0x3c8cce68a836eL

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    const-wide v3, -0x3c8d2e68a836eL

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    new-instance v4, Lyyds/ᛷᲁᲁᲇ;

    .line 92
    .line 93
    const-wide v5, -0x3c8d7e68a836eL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    const-wide v6, -0x3c8dae68a836eL

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    if-nez v7, :cond_2

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    :cond_2
    new-instance v0, Lkotlin/Pair;

    .line 126
    .line 127
    invoke-direct {v0, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-direct {v4, v5, v0}, Lyyds/ᛷᲁᲁᲇ;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-wide v4, -0x3c8dde68a836eL

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-direct {p0, v2, v3, v0, v4}, Lyyds/ᛶᛴᲇ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :goto_1
    check-cast p0, Lyyds/ᛶᛴᲇ;

    .line 154
    .line 155
    if-eqz v1, :cond_3

    .line 156
    .line 157
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 158
    .line 159
    .line 160
    :cond_3
    new-instance v0, Landroid/os/Handler;

    .line 161
    .line 162
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 167
    .line 168
    .line 169
    new-instance v1, Lyyds/ᛸᲁᛳᲁ;

    .line 170
    .line 171
    const/4 v2, 0x1

    .line 172
    invoke-direct {v1, p1, p0, p2, v2}, Lyyds/ᛸᲁᛳᲁ;-><init>(Landroid/content/Context;Ljava/lang/Object;ZI)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 176
    .line 177
    .line 178
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 179
    .line 180
    return-object p0

    .line 181
    :pswitch_0
    iget-object v0, p0, Lyyds/ᛵᲀᛵᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v0, Ljava/lang/String;

    .line 184
    .line 185
    iget-object p0, p0, Lyyds/ᛵᲀᛵᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p0, Lyyds/ᛸᛷᲇᛲ;

    .line 188
    .line 189
    check-cast p1, Ljava/io/File;

    .line 190
    .line 191
    check-cast p2, Landroid/app/AlertDialog;

    .line 192
    .line 193
    const-wide v1, -0x36452e68a836eL

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    const-wide v1, -0x36457e68a836eL

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    :try_start_1
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 210
    .line 211
    new-instance v2, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    const-wide v3, -0x3645ee68a836eL

    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    const-wide v3, -0x3646ee68a836eL

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-virtual {v1, v2}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    new-instance v2, Ljava/io/File;

    .line 258
    .line 259
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-static {p1, v2}, Lyyds/ᲈᛵᲁᛱ;->ᛵᲀᲈᛴ(Ljava/io/File;Ljava/io/File;)V

    .line 263
    .line 264
    .line 265
    new-instance p1, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 268
    .line 269
    .line 270
    const-wide v3, -0x3647ce68a836eL

    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {v1, p1}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    const-wide v0, -0x36482e68a836eL

    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-static {p1}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 302
    .line 303
    .line 304
    sget-object p1, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 305
    .line 306
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    invoke-static {p0}, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ(Lyyds/ᛸᛷᲇᛲ;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p2}, Landroid/app/Dialog;->dismiss()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 313
    .line 314
    .line 315
    goto :goto_2

    .line 316
    :catch_0
    move-exception v0

    .line 317
    move-object p0, v0

    .line 318
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 319
    .line 320
    new-instance p2, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    const-wide v0, -0x36487e68a836eL

    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p2

    .line 341
    invoke-virtual {p1, p2, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 342
    .line 343
    .line 344
    new-instance p1, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    const-wide v0, -0x3649ae68a836eL

    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p2

    .line 355
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    :goto_2
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 373
    .line 374
    return-object p0

    .line 375
    :pswitch_1
    iget-object v0, p0, Lyyds/ᛵᲀᛵᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v0, Lyyds/ᛷᲀᲇᲈ;

    .line 378
    .line 379
    iget-object p0, p0, Lyyds/ᛵᲀᛵᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast p0, Lyyds/ᛱᛷᛸᲈ;

    .line 382
    .line 383
    check-cast p1, Lyyds/ᛲᛴᛳᛲ;

    .line 384
    .line 385
    check-cast p2, Ljava/lang/Boolean;

    .line 386
    .line 387
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 388
    .line 389
    .line 390
    move-result v3

    .line 391
    const-wide v1, -0xc380e68a836eL

    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    sget-object p2, Lyyds/ᲀᛲᛲᲇ;->ᛲᲈᲁ:Lyyds/ᲀᛲᛲᲇ;

    .line 400
    .line 401
    iget-object p1, p1, Lyyds/ᛲᛴᛳᛲ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 402
    .line 403
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    const-wide v1, -0x22393e68a836eL

    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    sget-object p2, Lyyds/ᲀᛲᛲᲇ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 415
    .line 416
    monitor-enter p2

    .line 417
    :try_start_2
    invoke-static {}, Lyyds/ᲀᛲᛲᲇ;->ᛵᛸᛸᛷ()Ljava/util/Map;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    check-cast v1, Lyyds/ᲇᲈᛵᛷ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 426
    .line 427
    if-nez v1, :cond_4

    .line 428
    .line 429
    monitor-exit p2

    .line 430
    goto :goto_3

    .line 431
    :cond_4
    :try_start_3
    invoke-static {}, Lyyds/ᲀᛲᛲᲇ;->ᛵᛸᛸᛷ()Ljava/util/Map;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 436
    .line 437
    invoke-direct {v7, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 438
    .line 439
    .line 440
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 441
    .line 442
    .line 443
    move-result-wide v4

    .line 444
    const/4 v6, 0x7

    .line 445
    const/4 v2, 0x0

    .line 446
    invoke-static/range {v1 .. v6}, Lyyds/ᲇᲈᛵᛷ;->ᛲᲈᲁ(Lyyds/ᲇᲈᛵᛷ;Ljava/lang/String;ZJI)Lyyds/ᲇᲈᛵᛷ;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    invoke-interface {v7, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    invoke-static {v7}, Lyyds/ᲀᛲᛲᲇ;->ᛷᲈᲈᲁ(Ljava/util/LinkedHashMap;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 454
    .line 455
    .line 456
    monitor-exit p2

    .line 457
    :goto_3
    iget-object p0, p0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 458
    .line 459
    if-nez p0, :cond_5

    .line 460
    .line 461
    const-wide p0, -0xc386e68a836eL

    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    const/4 p0, 0x0

    .line 470
    goto :goto_4

    .line 471
    :cond_5
    check-cast p0, Lyyds/ᛲᛳᛶᲁ;

    .line 472
    .line 473
    :goto_4
    invoke-static {v0, p0}, Lyyds/ᲀᲀᛸᛱ;->ᛲᛲᲈᲈ(Lyyds/ᛷᲀᲇᲈ;Lyyds/ᛲᛳᛶᲁ;)V

    .line 474
    .line 475
    .line 476
    if-eqz v3, :cond_6

    .line 477
    .line 478
    const-wide p0, -0xc38ee68a836eL

    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    :goto_5
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object p0

    .line 487
    goto :goto_6

    .line 488
    :cond_6
    const-wide p0, -0xc39ee68a836eL

    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    goto :goto_5

    .line 494
    :goto_6
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 495
    .line 496
    .line 497
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 498
    .line 499
    return-object p0

    .line 500
    :catchall_1
    move-exception v0

    .line 501
    move-object p0, v0

    .line 502
    monitor-exit p2

    .line 503
    throw p0

    .line 504
    nop

    .line 505
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
