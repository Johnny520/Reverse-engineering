.class public final Lt1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lt1;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lt1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm40;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, v0, Lm40;->a:I

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, v0, Lm40;->b:I

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iput v1, v0, Lm40;->c:I

    .line 28
    .line 29
    if-lez v1, :cond_0

    .line 30
    .line 31
    new-array v1, v1, [I

    .line 32
    .line 33
    iput-object v1, v0, Lm40;->d:[I

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iput v1, v0, Lm40;->e:I

    .line 43
    .line 44
    if-lez v1, :cond_1

    .line 45
    .line 46
    new-array v1, v1, [I

    .line 47
    .line 48
    iput-object v1, v0, Lm40;->f:[I

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    const/4 v2, 0x0

    .line 58
    const/4 v3, 0x1

    .line 59
    if-ne v1, v3, :cond_2

    .line 60
    .line 61
    move v1, v3

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move v1, v2

    .line 64
    :goto_0
    iput-boolean v1, v0, Lm40;->h:Z

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-ne v1, v3, :cond_3

    .line 71
    .line 72
    move v1, v3

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    move v1, v2

    .line 75
    :goto_1
    iput-boolean v1, v0, Lm40;->i:Z

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-ne v1, v3, :cond_4

    .line 82
    .line 83
    move v2, v3

    .line 84
    :cond_4
    iput-boolean v2, v0, Lm40;->j:Z

    .line 85
    .line 86
    const-class v1, Ll40;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iput-object p1, v0, Lm40;->g:Ljava/util/ArrayList;

    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_0
    new-instance v0, Ll40;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    iput v1, v0, Ll40;->a:I

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    iput v1, v0, Ll40;->b:I

    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    const/4 v2, 0x1

    .line 121
    if-ne v1, v2, :cond_5

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    const/4 v2, 0x0

    .line 125
    :goto_2
    iput-boolean v2, v0, Ll40;->d:Z

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-lez v1, :cond_6

    .line 132
    .line 133
    new-array v1, v1, [I

    .line 134
    .line 135
    iput-object v1, v0, Ll40;->c:[I

    .line 136
    .line 137
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 138
    .line 139
    .line 140
    :cond_6
    return-object v0

    .line 141
    :pswitch_1
    new-instance v0, Landroidx/versionedparcelable/ParcelImpl;

    .line 142
    .line 143
    invoke-direct {v0, p1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 144
    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_2
    new-instance v0, Lhw;

    .line 148
    .line 149
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    iput p1, v0, Lhw;->a:I

    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    invoke-static {v0, p1}, Lzv;->a(II)Lzv;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    return-object p1

    .line 172
    :pswitch_4
    new-instance v0, Lwt;

    .line 173
    .line 174
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 175
    .line 176
    .line 177
    const-class v1, Lwt;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    check-cast p1, Ljava/lang/Integer;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    iput p1, v0, Lwt;->a:I

    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_5
    new-instance v0, Lxq;

    .line 197
    .line 198
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    iput v1, v0, Lxq;->a:I

    .line 206
    .line 207
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    iput v1, v0, Lxq;->b:I

    .line 212
    .line 213
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    const/4 v1, 0x1

    .line 218
    if-ne p1, v1, :cond_7

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_7
    const/4 v1, 0x0

    .line 222
    :goto_3
    iput-boolean v1, v0, Lxq;->c:Z

    .line 223
    .line 224
    return-object v0

    .line 225
    :pswitch_6
    new-instance v0, Lcm;

    .line 226
    .line 227
    invoke-direct {v0, p1}, Lcm;-><init>(Landroid/os/Parcel;)V

    .line 228
    .line 229
    .line 230
    return-object v0

    .line 231
    :pswitch_7
    new-instance v0, Lzl;

    .line 232
    .line 233
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 234
    .line 235
    .line 236
    const/4 v1, 0x0

    .line 237
    iput-object v1, v0, Lzl;->e:Ljava/lang/String;

    .line 238
    .line 239
    new-instance v1, Ljava/util/ArrayList;

    .line 240
    .line 241
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 242
    .line 243
    .line 244
    iput-object v1, v0, Lzl;->f:Ljava/util/ArrayList;

    .line 245
    .line 246
    new-instance v1, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 249
    .line 250
    .line 251
    iput-object v1, v0, Lzl;->g:Ljava/util/ArrayList;

    .line 252
    .line 253
    sget-object v1, Lcm;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 254
    .line 255
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    iput-object v1, v0, Lzl;->a:Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    iput-object v1, v0, Lzl;->b:Ljava/util/ArrayList;

    .line 266
    .line 267
    sget-object v1, Lc7;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 268
    .line 269
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    check-cast v1, [Lc7;

    .line 274
    .line 275
    iput-object v1, v0, Lzl;->c:[Lc7;

    .line 276
    .line 277
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    iput v1, v0, Lzl;->d:I

    .line 282
    .line 283
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    iput-object v1, v0, Lzl;->e:Ljava/lang/String;

    .line 288
    .line 289
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    iput-object v1, v0, Lzl;->f:Ljava/util/ArrayList;

    .line 294
    .line 295
    sget-object v1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 296
    .line 297
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    iput-object v1, v0, Lzl;->g:Ljava/util/ArrayList;

    .line 302
    .line 303
    sget-object v1, Lvl;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 304
    .line 305
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    iput-object p1, v0, Lzl;->h:Ljava/util/ArrayList;

    .line 310
    .line 311
    return-object v0

    .line 312
    :pswitch_8
    new-instance v0, Lvl;

    .line 313
    .line 314
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    iput-object v1, v0, Lvl;->a:Ljava/lang/String;

    .line 322
    .line 323
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 324
    .line 325
    .line 326
    move-result p1

    .line 327
    iput p1, v0, Lvl;->b:I

    .line 328
    .line 329
    return-object v0

    .line 330
    :pswitch_9
    new-instance v0, Lcf;

    .line 331
    .line 332
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 333
    .line 334
    .line 335
    move-result-wide v1

    .line 336
    invoke-direct {v0, v1, v2}, Lcf;-><init>(J)V

    .line 337
    .line 338
    .line 339
    return-object v0

    .line 340
    :pswitch_a
    const-class v0, Lzv;

    .line 341
    .line 342
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    move-object v3, v1

    .line 351
    check-cast v3, Lzv;

    .line 352
    .line 353
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    move-object v4, v1

    .line 362
    check-cast v4, Lzv;

    .line 363
    .line 364
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    move-object v6, v0

    .line 373
    check-cast v6, Lzv;

    .line 374
    .line 375
    const-class v0, Lcf;

    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    move-object v5, v0

    .line 386
    check-cast v5, Lcf;

    .line 387
    .line 388
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 389
    .line 390
    .line 391
    move-result v7

    .line 392
    new-instance v2, Lc8;

    .line 393
    .line 394
    invoke-direct/range {v2 .. v7}, Lc8;-><init>(Lzv;Lzv;Lcf;Lzv;I)V

    .line 395
    .line 396
    .line 397
    return-object v2

    .line 398
    :pswitch_b
    new-instance v0, Lc7;

    .line 399
    .line 400
    invoke-direct {v0, p1}, Lc7;-><init>(Landroid/os/Parcel;)V

    .line 401
    .line 402
    .line 403
    return-object v0

    .line 404
    :pswitch_c
    new-instance v0, Lt4;

    .line 405
    .line 406
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 410
    .line 411
    .line 412
    move-result p1

    .line 413
    if-eqz p1, :cond_8

    .line 414
    .line 415
    const/4 p1, 0x1

    .line 416
    goto :goto_4

    .line 417
    :cond_8
    const/4 p1, 0x0

    .line 418
    :goto_4
    iput-boolean p1, v0, Lt4;->a:Z

    .line 419
    .line 420
    return-object v0

    .line 421
    :pswitch_d
    new-instance v0, Lu1;

    .line 422
    .line 423
    invoke-direct {v0, p1}, Lu1;-><init>(Landroid/os/Parcel;)V

    .line 424
    .line 425
    .line 426
    return-object v0

    .line 427
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lt1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lm40;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Ll40;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lhw;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lzv;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lwt;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lxq;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lcm;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Lzl;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lvl;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Lcf;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Lc8;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Lc7;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Lt4;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Lu1;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
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
