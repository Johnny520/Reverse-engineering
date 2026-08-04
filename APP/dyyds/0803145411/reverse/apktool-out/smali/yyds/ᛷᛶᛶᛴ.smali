.class public final synthetic Lyyds/ᛷᛶᛶᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛶᛷᛳᛷ;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛷᛶᛶᛴ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛷᛶᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᛷᛶᛶᛴ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)Z
    .locals 8

    .line 1
    iget v0, p0, Lyyds/ᛷᛶᛶᛴ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lyyds/ᛷᛶᛶᛴ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛷᛶᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Ljava/util/List;

    .line 13
    .line 14
    check-cast v3, Lyyds/ᛱᛱᛴ;

    .line 15
    .line 16
    check-cast p1, Lyyds/ᛴᛱᛱᛸ;

    .line 17
    .line 18
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    move-object v5, v4

    .line 40
    check-cast v5, Lkotlin/Pair;

    .line 41
    .line 42
    invoke-virtual {v5}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    const-wide v6, -0x5d06e68a836eL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    check-cast v5, Landroid/widget/Switch;

    .line 55
    .line 56
    invoke-virtual {v5}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_0

    .line 61
    .line 62
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 67
    .line 68
    const/16 v4, 0xa

    .line 69
    .line 70
    invoke-static {v0, v4}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-direct {p0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_2

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    check-cast v4, Lkotlin/Pair;

    .line 92
    .line 93
    invoke-virtual {v4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    invoke-static {p0}, Lyyds/ᛷᛷᛶᲇ;->ᛶᛵᛸᛲ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    const-wide v4, -0x1a44e68a836eL

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᛷᛲᛶᲁ:Lyyds/ᛳᲀᛲ;

    .line 119
    .line 120
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 121
    .line 122
    const/16 v4, 0xcb

    .line 123
    .line 124
    aget-object v4, v0, v4

    .line 125
    .line 126
    invoke-virtual {p1, v4, p0}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    sget-object p0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 130
    .line 131
    iget-object p1, v3, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p1, Landroid/widget/RadioGroup;

    .line 134
    .line 135
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    const v3, 0x66090587

    .line 140
    .line 141
    .line 142
    if-ne p1, v3, :cond_3

    .line 143
    .line 144
    move v1, v2

    .line 145
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    sget-object p0, Lyyds/ᛷᛳᛲᛳ;->ᛴᛳᲈᛳ:Lyyds/ᛳᲀᛲ;

    .line 149
    .line 150
    const/16 p1, 0xcc

    .line 151
    .line 152
    aget-object p1, v0, p1

    .line 153
    .line 154
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {p0, p1, v0}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    const-wide p0, -0x5d16e68a836eL

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    return v2

    .line 174
    :pswitch_0
    check-cast p0, Lyyds/ᛱᛷᛸᲈ;

    .line 175
    .line 176
    check-cast v3, Landroid/widget/TextView;

    .line 177
    .line 178
    check-cast p1, Lyyds/ᛴᛱᛱᛸ;

    .line 179
    .line 180
    iget-object p0, p0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast p0, Landroid/widget/SeekBar;

    .line 183
    .line 184
    if-eqz p0, :cond_4

    .line 185
    .line 186
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    int-to-float p0, p0

    .line 191
    const/high16 p1, 0x41200000    # 10.0f

    .line 192
    .line 193
    div-float/2addr p0, p1

    .line 194
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᲈᛳᛶᛱ:Lyyds/ᛳᲀᛲ;

    .line 200
    .line 201
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 202
    .line 203
    const/16 v4, 0x91

    .line 204
    .line 205
    aget-object v0, v0, v4

    .line 206
    .line 207
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-virtual {p1, v0, v4}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    const-wide v4, -0xa533e68a836eL

    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    const-wide v4, -0xa538e68a836eL

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    invoke-static {p0, v1, p1, v4, v5}, Lyyds/ᲀᲁᲈᲇ;->ᛲᛲᲈᲈ([Ljava/lang/Object;ILjava/lang/String;J)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    const-string p1, "x"

    .line 241
    .line 242
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-virtual {v3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 247
    .line 248
    .line 249
    const-wide p0, -0xa544e68a836eL

    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 259
    .line 260
    .line 261
    :cond_4
    return v2

    .line 262
    :pswitch_1
    check-cast p0, Lyyds/ᲇᛵᲁᛳ;

    .line 263
    .line 264
    check-cast v3, Lyyds/ᛸᛷᲇᛲ;

    .line 265
    .line 266
    check-cast p1, Lyyds/ᛵᲀᲀᛱ;

    .line 267
    .line 268
    new-instance p1, Lyyds/ᛴᛵᛵᛸ;

    .line 269
    .line 270
    const/4 v0, 0x2

    .line 271
    const/4 v1, 0x0

    .line 272
    invoke-direct {p1, v3, v1, v0}, Lyyds/ᛴᛵᛵᛸ;-><init>(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 273
    .line 274
    .line 275
    const/4 v0, 0x3

    .line 276
    invoke-static {p0, v1, p1, v0}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 277
    .line 278
    .line 279
    return v2

    .line 280
    :pswitch_2
    check-cast p0, Lyyds/ᛵᛸᛵᲀ;

    .line 281
    .line 282
    check-cast v3, Lyyds/ᛱᛷᛸᲈ;

    .line 283
    .line 284
    check-cast p1, Lyyds/ᛴᛱᛱᛸ;

    .line 285
    .line 286
    iget-object p1, v3, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 287
    .line 288
    invoke-virtual {p0, p1}, Lyyds/ᛵᛸᛵᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    return v2

    .line 292
    :pswitch_3
    check-cast p0, Ljava/lang/String;

    .line 293
    .line 294
    check-cast v3, Lyyds/ᛸᛷᲇᛲ;

    .line 295
    .line 296
    check-cast p1, Lyyds/ᛵᲀᲀᛱ;

    .line 297
    .line 298
    :try_start_0
    invoke-static {}, Lcom/ss/android/ugc/aweme/utils/ActivityStack;->getTopActivity()Landroid/app/Activity;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 303
    .line 304
    new-instance v4, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 307
    .line 308
    .line 309
    const-wide v5, -0x364a0e68a836eL

    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    sget-object v5, Lyyds/ᛳᛶᛱᛸ;->ᛷᲇᛲᛱ:Ljava/lang/String;

    .line 322
    .line 323
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    invoke-virtual {v0, v4}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    sget-object v0, Landroid/os/Environment;->DIRECTORY_MUSIC:Ljava/lang/String;

    .line 334
    .line 335
    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    const-wide v4, -0x364aee68a836eL

    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    const-wide v4, -0x364c3e68a836eL

    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    new-instance v5, Lyyds/ᛵᲀᛵᛸ;

    .line 361
    .line 362
    invoke-direct {v5, p0, v1, v3}, Lyyds/ᛵᲀᛵᛸ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    invoke-static {p1, v0, v4, v5}, Lyyds/ᲀᛴᛱᛷ;->ᲈᲀᛲᲀ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᲇᲁᛴ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 366
    .line 367
    .line 368
    goto :goto_2

    .line 369
    :catch_0
    move-exception p0

    .line 370
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 371
    .line 372
    new-instance v0, Ljava/lang/StringBuilder;

    .line 373
    .line 374
    const-wide v3, -0x364c8e68a836eL

    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-virtual {p1, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    new-instance p1, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    const-wide v0, -0x364dae68a836eL

    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object p0

    .line 421
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    :goto_2
    return v2

    .line 425
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
