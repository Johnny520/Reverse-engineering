.class public final synthetic Lyyds/ᲈᛳᛲᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 8
    iput p1, p0, Lyyds/ᲈᛳᛲᛶ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    const/4 p1, 0x6

    .line 2
    iput p1, p0, Lyyds/ᲈᛳᛲᛶ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final ᛲᲈᲁ(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 13

    .line 1
    iget p0, p0, Lyyds/ᲈᛳᛲᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const-wide v0, -0x8a81e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v2, -0x8a77e68a836eL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const-wide v4, -0x8a73e68a836eL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const-wide v6, -0x8a52e68a836eL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const-wide v8, -0x8a2ee68a836eL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const/16 v10, 0x19d3

    .line 29
    .line 30
    const/4 v11, 0x3

    .line 31
    const/4 v12, 0x1

    .line 32
    packed-switch p0, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    sget-object p0, Lyyds/ᛱᛵᲈᲁ;->ᛲᛳᛶᲁ:Landroid/app/Dialog;

    .line 36
    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void

    .line 43
    :pswitch_0
    sget-object p0, Lyyds/ᛱᛱᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛳᛶ;

    .line 44
    .line 45
    invoke-static {}, Lyyds/ᛱᛱᛳᛶ;->ᛲᲈᲁ()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_1
    sget-object p0, Lyyds/ᛱᛱᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛳᛶ;

    .line 50
    .line 51
    invoke-static {}, Lyyds/ᛱᛱᛳᛶ;->ᛲᲈᲁ()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_2
    const-wide p0, -0x8ee3e68a836eL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    new-instance p0, Lyyds/ᛱᛷᛸᲈ;

    .line 64
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    new-instance p1, Lyyds/ᛴᛱᛱᛸ;

    .line 69
    .line 70
    invoke-direct {p1}, Lyyds/ᛴᛱᛱᛸ;-><init>()V

    .line 71
    .line 72
    .line 73
    const-wide v0, -0x8eebe68a836eL

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p1, Lyyds/ᛴᛱᛱᛸ;->ᛲᛳᛴᛸ:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {p1}, Lyyds/ᛴᛱᛱᛸ;->ᲁᛵᲁᲁ()V

    .line 85
    .line 86
    .line 87
    new-instance v0, Lyyds/ᲁᲇᛳᛸ;

    .line 88
    .line 89
    invoke-direct {v0, p0, v12}, Lyyds/ᲁᲇᛳᛸ;-><init>(Lyyds/ᛱᛷᛸᲈ;I)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p1, Lyyds/ᛴᛱᛱᛸ;->ᛵᲀᛵᛸ:Lyyds/ᛸᲀᛷᲀ;

    .line 93
    .line 94
    invoke-virtual {p1}, Lyyds/ᛴᛱᛱᛸ;->ᲁᛵᲁᲁ()V

    .line 95
    .line 96
    .line 97
    const-wide v0, -0x8ef0e68a836eL

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    new-instance v1, Lyyds/ᲁᲀᲀᲈ;

    .line 107
    .line 108
    invoke-direct {v1, v11, p0}, Lyyds/ᲁᲀᲀᲈ;-><init>(ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v0, v1}, Lyyds/ᛴᛱᛱᛸ;->ᛴᛸᛴᛸ(Ljava/lang/String;Lyyds/ᛶᛷᛳᛷ;)V

    .line 112
    .line 113
    .line 114
    const-wide v0, -0x8ef3e68a836eL

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p1, p0}, Lyyds/ᛴᛱᛱᛸ;->ᛳᛷᛶᛲ(Ljava/lang/CharSequence;)Lyyds/ᛴᛱᛱᛸ;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Lyyds/ᛴᛱᛱᛸ;->ᛶᛵᛸᛲ()V

    .line 127
    .line 128
    .line 129
    :pswitch_3
    return-void

    .line 130
    :pswitch_4
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    sget-object v0, Landroid/os/Environment;->DIRECTORY_MUSIC:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {p0, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const-wide v0, -0x31229e68a836eL

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    const-wide v0, -0x31239e68a836eL

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    const-wide v0, -0x3124ee68a836eL

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 174
    .line 175
    invoke-direct {v1, v11}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 176
    .line 177
    .line 178
    invoke-static {p1, p0, v0, v1}, Lyyds/ᲀᛴᛱᛷ;->ᲈᲀᛲᲀ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᲇᲁᛴ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    .line 180
    .line 181
    goto :goto_0

    .line 182
    :catch_0
    move-exception p0

    .line 183
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 184
    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    const-wide v1, -0x31253e68a836eL

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    new-instance p1, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    const-wide v0, -0x31265e68a836eL

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :goto_0
    return-void

    .line 238
    :pswitch_5
    invoke-static {}, Lcom/ss/android/ugc/aweme/utils/ActivityStack;->getTopActivity()Landroid/app/Activity;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    if-nez p0, :cond_1

    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_1
    new-instance p1, Landroid/content/Intent;

    .line 246
    .line 247
    const-wide v0, -0x9ac3e68a836eL

    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const-wide v0, -0x9ae5e68a836eL

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 269
    .line 270
    .line 271
    const-wide v0, -0x9aede68a836eL

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 281
    .line 282
    .line 283
    const-wide v0, -0x9b0ee68a836eL

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    :try_start_1
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-static {p1, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    const/16 v0, 0x19d2

    .line 297
    .line 298
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 299
    .line 300
    .line 301
    goto :goto_1

    .line 302
    :catch_1
    move-exception p0

    .line 303
    const-wide v0, -0x9b15e68a836eL

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    invoke-static {p1}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 313
    .line 314
    .line 315
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 316
    .line 317
    const-wide v0, -0x9b1fe68a836eL

    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᲇᲇᲇᛱ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 327
    .line 328
    .line 329
    :goto_1
    return-void

    .line 330
    :pswitch_6
    :try_start_2
    sget-object p0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 331
    .line 332
    new-instance v0, Ljava/lang/StringBuilder;

    .line 333
    .line 334
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 335
    .line 336
    .line 337
    const-wide v1, -0x365cae68a836eL

    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    sget-object v1, Lyyds/ᛳᛶᛱᛸ;->ᛷᲇᛲᛱ:Ljava/lang/String;

    .line 350
    .line 351
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-virtual {p0, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    sget-object v0, Landroid/os/Environment;->DIRECTORY_MUSIC:Ljava/lang/String;

    .line 366
    .line 367
    invoke-virtual {p0, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    const-wide v0, -0x365d8e68a836eL

    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    const-wide v0, -0x365e8e68a836eL

    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    const-wide v0, -0x365fde68a836eL

    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 405
    .line 406
    invoke-direct {v1, v12}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 407
    .line 408
    .line 409
    invoke-static {p1, p0, v0, v1}, Lyyds/ᲀᛴᛱᛷ;->ᲈᲀᛲᲀ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᲇᲁᛴ;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 410
    .line 411
    .line 412
    goto :goto_2

    .line 413
    :catch_2
    move-exception p0

    .line 414
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 415
    .line 416
    new-instance v0, Ljava/lang/StringBuilder;

    .line 417
    .line 418
    const-wide v1, -0x36602e68a836eL

    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {p1, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    new-instance p1, Ljava/lang/StringBuilder;

    .line 441
    .line 442
    const-wide v0, -0x36614e68a836eL

    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    :goto_2
    return-void

    .line 469
    :pswitch_7
    sget-object p0, Lyyds/ᛵᛴᛶᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᛶᛲ;

    .line 470
    .line 471
    invoke-static {}, Lcom/ss/android/ugc/aweme/utils/ActivityStack;->getTopActivity()Landroid/app/Activity;

    .line 472
    .line 473
    .line 474
    move-result-object p0

    .line 475
    if-nez p0, :cond_2

    .line 476
    .line 477
    goto :goto_3

    .line 478
    :cond_2
    new-instance p1, Landroid/content/Intent;

    .line 479
    .line 480
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    invoke-direct {p1, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v6

    .line 491
    invoke-virtual {p1, v6}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 492
    .line 493
    .line 494
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    invoke-virtual {p1, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 499
    .line 500
    .line 501
    :try_start_3
    invoke-virtual {p0, p1, v10}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 502
    .line 503
    .line 504
    goto :goto_3

    .line 505
    :catch_3
    move-exception p0

    .line 506
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    invoke-static {p1}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 511
    .line 512
    .line 513
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 514
    .line 515
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᲇᲇᲇᛱ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 520
    .line 521
    .line 522
    :goto_3
    return-void

    .line 523
    :pswitch_8
    sget-object p0, Lyyds/ᛵᛴᛶᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛵᛴᛶᛲ;

    .line 524
    .line 525
    invoke-static {}, Lcom/ss/android/ugc/aweme/utils/ActivityStack;->getTopActivity()Landroid/app/Activity;

    .line 526
    .line 527
    .line 528
    move-result-object p1

    .line 529
    if-nez p1, :cond_3

    .line 530
    .line 531
    goto :goto_5

    .line 532
    :cond_3
    sget-object v11, Lyyds/ᛵᛴᛶᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᛶᛲ;

    .line 533
    .line 534
    if-ne p0, v11, :cond_4

    .line 535
    .line 536
    goto :goto_4

    .line 537
    :cond_4
    const/16 v10, 0x19d4

    .line 538
    .line 539
    :goto_4
    new-instance p0, Landroid/content/Intent;

    .line 540
    .line 541
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v8

    .line 545
    invoke-direct {p0, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    invoke-virtual {p0, v6}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 553
    .line 554
    .line 555
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v4

    .line 559
    invoke-virtual {p0, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 560
    .line 561
    .line 562
    :try_start_4
    invoke-virtual {p1, p0, v10}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 563
    .line 564
    .line 565
    goto :goto_5

    .line 566
    :catch_4
    move-exception p0

    .line 567
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object p1

    .line 571
    invoke-static {p1}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 572
    .line 573
    .line 574
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 575
    .line 576
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᲇᲇᲇᛱ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 581
    .line 582
    .line 583
    :goto_5
    return-void

    .line 584
    nop

    .line 585
    :pswitch_data_0
    .packed-switch 0x0
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
