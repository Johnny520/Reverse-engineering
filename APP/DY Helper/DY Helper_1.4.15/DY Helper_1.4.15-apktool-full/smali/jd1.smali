.class public final Ljd1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Ljd1;->α:I

    iput-object p2, p0, Ljd1;->β:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ljd1;->α:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ljd1;->β:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 1
    iget v0, p0, Ljd1;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ljd1;->β:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lqy1;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lqy1;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    check-cast p1, Le52;

    .line 18
    .line 19
    iget-wide p0, p1, Le52;->ζ:J

    .line 20
    .line 21
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p2, Le52;

    .line 26
    .line 27
    iget-wide p1, p2, Le52;->ζ:J

    .line 28
    .line 29
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    :goto_0
    return p0

    .line 38
    :pswitch_0
    iget-object p0, p0, Ljd1;->β:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Liz1;

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Liz1;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    check-cast p2, Lky1;

    .line 50
    .line 51
    iget p0, p2, Lky1;->ε:I

    .line 52
    .line 53
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p1, Lky1;

    .line 58
    .line 59
    iget p1, p1, Lky1;->ε:I

    .line 60
    .line 61
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    :goto_1
    return p0

    .line 70
    :pswitch_1
    iget-object p0, p0, Ljd1;->β:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, Lib1;

    .line 73
    .line 74
    invoke-virtual {p0, p1, p2}, Lib1;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_2

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    array-length p0, p0

    .line 88
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p2, Ljava/lang/reflect/Constructor;

    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    array-length p1, p1

    .line 99
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    :goto_2
    return p0

    .line 108
    :pswitch_2
    iget-object p0, p0, Ljd1;->β:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p0, Ljd1;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, Ljd1;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-eqz p0, :cond_3

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_3
    check-cast p1, Ljava/lang/String;

    .line 120
    .line 121
    check-cast p2, Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {p1, p2}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    :goto_3
    return p0

    .line 128
    :pswitch_3
    const v0, 0x7fffffff

    .line 129
    .line 130
    .line 131
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast p1, Ljava/lang/String;

    .line 136
    .line 137
    iget-object p0, p0, Ljd1;->β:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-interface {p0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    const/4 v2, 0x0

    .line 148
    if-ltz p1, :cond_4

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_4
    move-object v1, v2

    .line 152
    :goto_4
    if-eqz v1, :cond_5

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_5
    move-object v1, v0

    .line 156
    :goto_5
    check-cast p2, Ljava/lang/String;

    .line 157
    .line 158
    invoke-interface {p0, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-ltz p0, :cond_6

    .line 167
    .line 168
    move-object v2, p1

    .line 169
    :cond_6
    if-eqz v2, :cond_7

    .line 170
    .line 171
    move-object v0, v2

    .line 172
    :cond_7
    invoke-static {v1, v0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    return p0

    .line 177
    :pswitch_4
    iget-object p0, p0, Ljd1;->β:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p0, Ljd1;

    .line 180
    .line 181
    invoke-virtual {p0, p1, p2}, Ljd1;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    if-eqz p0, :cond_8

    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_8
    check-cast p1, Ljava/lang/String;

    .line 189
    .line 190
    const-string p0, "default"

    .line 191
    .line 192
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    const-string v1, ""

    .line 197
    .line 198
    if-eqz v0, :cond_9

    .line 199
    .line 200
    move-object p1, v1

    .line 201
    :cond_9
    check-cast p2, Ljava/lang/String;

    .line 202
    .line 203
    invoke-static {p2, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    if-eqz p0, :cond_a

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_a
    move-object v1, p2

    .line 211
    :goto_6
    invoke-static {p1, v1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    :goto_7
    return p0

    .line 216
    :pswitch_5
    const v0, 0x7fffffff

    .line 217
    .line 218
    .line 219
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast p1, Ljava/lang/String;

    .line 224
    .line 225
    iget-object p0, p0, Ljd1;->β:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast p0, Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 230
    .line 231
    .line 232
    move-result p1

    .line 233
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    const/4 v2, 0x0

    .line 238
    if-ltz p1, :cond_b

    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_b
    move-object v1, v2

    .line 242
    :goto_8
    if-eqz v1, :cond_c

    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_c
    move-object v1, v0

    .line 246
    :goto_9
    check-cast p2, Ljava/lang/String;

    .line 247
    .line 248
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 249
    .line 250
    .line 251
    move-result p0

    .line 252
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    if-ltz p0, :cond_d

    .line 257
    .line 258
    move-object v2, p1

    .line 259
    :cond_d
    if-eqz v2, :cond_e

    .line 260
    .line 261
    move-object v0, v2

    .line 262
    :cond_e
    invoke-static {v1, v0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    return p0

    .line 267
    :pswitch_6
    iget-object p0, p0, Ljd1;->β:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast p0, Ljd1;

    .line 270
    .line 271
    invoke-virtual {p0, p1, p2}, Ljd1;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 272
    .line 273
    .line 274
    move-result p0

    .line 275
    if-eqz p0, :cond_f

    .line 276
    .line 277
    goto :goto_a

    .line 278
    :cond_f
    check-cast p1, Lbs1;

    .line 279
    .line 280
    iget p0, p1, Lbs1;->ζ:I

    .line 281
    .line 282
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    check-cast p2, Lbs1;

    .line 287
    .line 288
    iget p1, p2, Lbs1;->ζ:I

    .line 289
    .line 290
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 295
    .line 296
    .line 297
    move-result p0

    .line 298
    :goto_a
    return p0

    .line 299
    :pswitch_7
    iget-object p0, p0, Ljd1;->β:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast p0, Ljava/util/Comparator;

    .line 302
    .line 303
    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 304
    .line 305
    .line 306
    move-result p0

    .line 307
    if-eqz p0, :cond_10

    .line 308
    .line 309
    goto :goto_b

    .line 310
    :cond_10
    check-cast p1, Lbs1;

    .line 311
    .line 312
    iget-object p0, p1, Lbs1;->γ:Lyp0;

    .line 313
    .line 314
    check-cast p2, Lbs1;

    .line 315
    .line 316
    iget-object p1, p2, Lbs1;->γ:Lyp0;

    .line 317
    .line 318
    sget-object p2, Lyp0;->Χ:Lo9;

    .line 319
    .line 320
    invoke-virtual {p2, p0, p1}, Lo9;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 321
    .line 322
    .line 323
    move-result p0

    .line 324
    :goto_b
    return p0

    .line 325
    :pswitch_8
    check-cast p2, Ljava/lang/reflect/Method;

    .line 326
    .line 327
    iget-object p0, p0, Ljd1;->β:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast p0, Lcj1;

    .line 330
    .line 331
    invoke-static {p0, p2}, Lcj1;->α(Lcj1;Ljava/lang/reflect/Method;)I

    .line 332
    .line 333
    .line 334
    move-result p2

    .line 335
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 336
    .line 337
    .line 338
    move-result-object p2

    .line 339
    check-cast p1, Ljava/lang/reflect/Method;

    .line 340
    .line 341
    invoke-static {p0, p1}, Lcj1;->α(Lcj1;Ljava/lang/reflect/Method;)I

    .line 342
    .line 343
    .line 344
    move-result p0

    .line 345
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    invoke-static {p2, p0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 350
    .line 351
    .line 352
    move-result p0

    .line 353
    return p0

    .line 354
    :pswitch_9
    iget-object p0, p0, Ljd1;->β:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast p0, Lye;

    .line 357
    .line 358
    invoke-virtual {p0, p1, p2}, Lye;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 359
    .line 360
    .line 361
    move-result p0

    .line 362
    if-eqz p0, :cond_11

    .line 363
    .line 364
    goto :goto_c

    .line 365
    :cond_11
    check-cast p1, Lid1;

    .line 366
    .line 367
    iget p0, p1, Lid1;->α:I

    .line 368
    .line 369
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    check-cast p2, Lid1;

    .line 374
    .line 375
    iget p1, p2, Lid1;->α:I

    .line 376
    .line 377
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 382
    .line 383
    .line 384
    move-result p0

    .line 385
    :goto_c
    return p0

    .line 386
    nop

    .line 387
    :pswitch_data_0
    .packed-switch 0x0
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
