.class public final Lj;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lj;->α:I

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
    .locals 3

    .line 1
    iget p0, p0, Lj;->α:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Luz1;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Luz1;->ε:I

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Luz1;->ζ:I

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p0, Luz1;->η:I

    .line 28
    .line 29
    if-lez v0, :cond_0

    .line 30
    .line 31
    new-array v0, v0, [I

    .line 32
    .line 33
    iput-object v0, p0, Luz1;->θ:[I

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readIntArray([I)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iput v0, p0, Luz1;->ι:I

    .line 43
    .line 44
    if-lez v0, :cond_1

    .line 45
    .line 46
    new-array v0, v0, [I

    .line 47
    .line 48
    iput-object v0, p0, Luz1;->κ:[I

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readIntArray([I)V

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    const/4 v1, 0x0

    .line 58
    const/4 v2, 0x1

    .line 59
    if-ne v0, v2, :cond_2

    .line 60
    .line 61
    move v0, v2

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move v0, v1

    .line 64
    :goto_0
    iput-boolean v0, p0, Luz1;->μ:Z

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-ne v0, v2, :cond_3

    .line 71
    .line 72
    move v0, v2

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    move v0, v1

    .line 75
    :goto_1
    iput-boolean v0, p0, Luz1;->ν:Z

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-ne v0, v2, :cond_4

    .line 82
    .line 83
    move v1, v2

    .line 84
    :cond_4
    iput-boolean v1, p0, Luz1;->ξ:Z

    .line 85
    .line 86
    const-class v0, Ltz1;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iput-object p1, p0, Luz1;->λ:Ljava/util/ArrayList;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_0
    new-instance p0, Ltz1;

    .line 100
    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iput v0, p0, Ltz1;->ε:I

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iput v0, p0, Ltz1;->ζ:I

    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    const/4 v1, 0x1

    .line 121
    if-ne v0, v1, :cond_5

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    const/4 v1, 0x0

    .line 125
    :goto_2
    iput-boolean v1, p0, Ltz1;->θ:Z

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-lez v0, :cond_6

    .line 132
    .line 133
    new-array v0, v0, [I

    .line 134
    .line 135
    iput-object v0, p0, Ltz1;->η:[I

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readIntArray([I)V

    .line 138
    .line 139
    .line 140
    :cond_6
    return-object p0

    .line 141
    :pswitch_1
    new-instance p0, Lv91;

    .line 142
    .line 143
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 144
    .line 145
    .line 146
    move-result-wide v0

    .line 147
    invoke-direct {p0, v0, v1}, Lv91;-><init>(J)V

    .line 148
    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_2
    new-instance p0, Lu91;

    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    invoke-direct {p0, p1}, Lu91;-><init>(I)V

    .line 158
    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_3
    new-instance p0, Lt91;

    .line 162
    .line 163
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    invoke-direct {p0, p1}, Lt91;-><init>(F)V

    .line 168
    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_4
    new-instance p0, Landroidx/versionedparcelable/ParcelImpl;

    .line 172
    .line 173
    invoke-direct {p0, p1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 174
    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_5
    new-instance p0, La31;

    .line 178
    .line 179
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    iput p1, p0, La31;->ε:I

    .line 187
    .line 188
    return-object p0

    .line 189
    :pswitch_6
    new-instance p0, Lcs0;

    .line 190
    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    iput v0, p0, Lcs0;->ε:I

    .line 199
    .line 200
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    iput v0, p0, Lcs0;->ζ:I

    .line 205
    .line 206
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    const/4 v0, 0x1

    .line 211
    if-ne p1, v0, :cond_7

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_7
    const/4 v0, 0x0

    .line 215
    :goto_3
    iput-boolean v0, p0, Lcs0;->η:Z

    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_7
    new-instance p0, Ll70;

    .line 219
    .line 220
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    iput-object p1, p0, Ll70;->ε:Ljava/lang/String;

    .line 228
    .line 229
    return-object p0

    .line 230
    :pswitch_8
    new-instance p0, Lh70;

    .line 231
    .line 232
    invoke-direct {p0, p1}, Lh70;-><init>(Landroid/os/Parcel;)V

    .line 233
    .line 234
    .line 235
    return-object p0

    .line 236
    :pswitch_9
    new-instance p0, Lc70;

    .line 237
    .line 238
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 239
    .line 240
    .line 241
    const/4 v0, 0x0

    .line 242
    iput-object v0, p0, Lc70;->ι:Ljava/lang/String;

    .line 243
    .line 244
    new-instance v0, Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 247
    .line 248
    .line 249
    iput-object v0, p0, Lc70;->κ:Ljava/util/ArrayList;

    .line 250
    .line 251
    new-instance v0, Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 254
    .line 255
    .line 256
    iput-object v0, p0, Lc70;->λ:Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    iput-object v0, p0, Lc70;->ε:Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    iput-object v0, p0, Lc70;->ζ:Ljava/util/ArrayList;

    .line 269
    .line 270
    sget-object v0, Ll8;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 271
    .line 272
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    check-cast v0, [Ll8;

    .line 277
    .line 278
    iput-object v0, p0, Lc70;->η:[Ll8;

    .line 279
    .line 280
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    iput v0, p0, Lc70;->θ:I

    .line 285
    .line 286
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    iput-object v0, p0, Lc70;->ι:Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    iput-object v0, p0, Lc70;->κ:Ljava/util/ArrayList;

    .line 297
    .line 298
    sget-object v0, Lm8;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 299
    .line 300
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    iput-object v0, p0, Lc70;->λ:Ljava/util/ArrayList;

    .line 305
    .line 306
    sget-object v0, Ly60;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 307
    .line 308
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    iput-object p1, p0, Lc70;->μ:Ljava/util/ArrayList;

    .line 313
    .line 314
    return-object p0

    .line 315
    :pswitch_a
    new-instance p0, Ly60;

    .line 316
    .line 317
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    iput-object v0, p0, Ly60;->ε:Ljava/lang/String;

    .line 325
    .line 326
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 327
    .line 328
    .line 329
    move-result p1

    .line 330
    iput p1, p0, Ly60;->ζ:I

    .line 331
    .line 332
    return-object p0

    .line 333
    :pswitch_b
    new-instance p0, Lm8;

    .line 334
    .line 335
    invoke-direct {p0, p1}, Lm8;-><init>(Landroid/os/Parcel;)V

    .line 336
    .line 337
    .line 338
    return-object p0

    .line 339
    :pswitch_c
    new-instance p0, Ll8;

    .line 340
    .line 341
    invoke-direct {p0, p1}, Ll8;-><init>(Landroid/os/Parcel;)V

    .line 342
    .line 343
    .line 344
    return-object p0

    .line 345
    :pswitch_d
    new-instance p0, Lw5;

    .line 346
    .line 347
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 351
    .line 352
    .line 353
    move-result p1

    .line 354
    if-eqz p1, :cond_8

    .line 355
    .line 356
    const/4 p1, 0x1

    .line 357
    goto :goto_4

    .line 358
    :cond_8
    const/4 p1, 0x0

    .line 359
    :goto_4
    iput-boolean p1, p0, Lw5;->ε:Z

    .line 360
    .line 361
    return-object p0

    .line 362
    :pswitch_e
    new-instance p0, Lk;

    .line 363
    .line 364
    invoke-direct {p0, p1}, Lk;-><init>(Landroid/os/Parcel;)V

    .line 365
    .line 366
    .line 367
    return-object p0

    .line 368
    nop

    .line 369
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lj;->α:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Luz1;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Ltz1;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lv91;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lu91;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lt91;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [La31;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lcs0;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Ll70;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lh70;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lc70;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Ly60;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lm8;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Ll8;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lw5;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lk;

    .line 52
    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
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
