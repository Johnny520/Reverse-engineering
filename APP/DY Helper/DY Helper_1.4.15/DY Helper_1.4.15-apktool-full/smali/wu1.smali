.class public final Lwu1;
.super Landroid/widget/BaseAdapter;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public ε:Ljava/lang/Object;

.field public final synthetic ζ:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwu1;->ζ:Landroid/view/LayoutInflater;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object p1, Ljz;->ε:Ljz;

    .line 7
    .line 8
    iput-object p1, p0, Lwu1;->ε:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lwu1;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lwu1;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getItemId(I)J
    .locals 2

    .line 1
    iget-object p0, p0, Lwu1;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {p1, p0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lux$α;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lux$α;->ξ()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-virtual {p0}, Lux$α;->κ()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    int-to-long p0, p0

    .line 24
    xor-long/2addr p0, v0

    .line 25
    return-wide p0

    .line 26
    :cond_0
    int-to-long p0, p1

    .line 27
    return-wide p0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 12

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Lwu1;->ζ:Landroid/view/LayoutInflater;

    .line 8
    .line 9
    const v1, 0x7f0c004c

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance p3, Lvu1;

    .line 20
    .line 21
    invoke-direct {p3, p2}, Lvu1;-><init>(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    check-cast p3, Lvu1;

    .line 36
    .line 37
    :goto_0
    iget-object v1, p3, Lvu1;->δ:Landroid/widget/TextView;

    .line 38
    .line 39
    iget-object v2, p3, Lvu1;->γ:Landroid/widget/TextView;

    .line 40
    .line 41
    iget-object v3, p3, Lvu1;->α:Landroid/widget/TextView;

    .line 42
    .line 43
    iget-object v4, p3, Lvu1;->β:Landroid/widget/TextView;

    .line 44
    .line 45
    iget-object p3, p3, Lvu1;->ε:Landroid/widget/TextView;

    .line 46
    .line 47
    iget-object p0, p0, Lwu1;->ε:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Lux$α;

    .line 54
    .line 55
    invoke-virtual {p0}, Lux$α;->ι()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v5, "E"

    .line 60
    .line 61
    invoke-static {p1, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    const/4 v7, 0x0

    .line 66
    const-string v8, "D"

    .line 67
    .line 68
    const-string v9, "theme"

    .line 69
    .line 70
    if-eqz v6, :cond_2

    .line 71
    .line 72
    sget-object p1, Lbv1;->δ:Lqu1;

    .line 73
    .line 74
    if-eqz p1, :cond_1

    .line 75
    .line 76
    iget-object p1, p1, Lqu1;->π:Ljava/lang/String;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v7

    .line 83
    :cond_2
    invoke-static {p1, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_4

    .line 88
    .line 89
    sget-object p1, Lbv1;->δ:Lqu1;

    .line 90
    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    iget-object p1, p1, Lqu1;->μ:Ljava/lang/String;

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v7

    .line 100
    :cond_4
    sget-object p1, Lbv1;->δ:Lqu1;

    .line 101
    .line 102
    if-eqz p1, :cond_11

    .line 103
    .line 104
    iget-object p1, p1, Lqu1;->κ:Ljava/lang/String;

    .line 105
    .line 106
    :goto_1
    invoke-virtual {p0}, Lux$α;->ι()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-static {v6, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-eqz v5, :cond_6

    .line 115
    .line 116
    sget-object v5, Lbv1;->δ:Lqu1;

    .line 117
    .line 118
    if-eqz v5, :cond_5

    .line 119
    .line 120
    iget-object v5, v5, Lqu1;->ρ:Ljava/lang/String;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v7

    .line 127
    :cond_6
    invoke-static {v6, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-eqz v5, :cond_8

    .line 132
    .line 133
    sget-object v5, Lbv1;->δ:Lqu1;

    .line 134
    .line 135
    if-eqz v5, :cond_7

    .line 136
    .line 137
    iget-object v5, v5, Lqu1;->ν:Ljava/lang/String;

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v7

    .line 144
    :cond_8
    sget-object v5, Lbv1;->δ:Lqu1;

    .line 145
    .line 146
    if-eqz v5, :cond_10

    .line 147
    .line 148
    iget-object v5, v5, Lqu1;->λ:Ljava/lang/String;

    .line 149
    .line 150
    :goto_2
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 151
    .line 152
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 153
    .line 154
    .line 155
    sget-object v8, Lbv1;->α:Lbv1;

    .line 156
    .line 157
    sget-object v8, Lbv1;->δ:Lqu1;

    .line 158
    .line 159
    if-eqz v8, :cond_f

    .line 160
    .line 161
    iget-object v8, v8, Lqu1;->γ:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    const/16 v10, 0xa

    .line 178
    .line 179
    invoke-static {v8, v10}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    int-to-float v8, v8

    .line 184
    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    const/4 v10, 0x1

    .line 195
    invoke-static {v8, v10}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    sget-object v10, Lbv1;->δ:Lqu1;

    .line 200
    .line 201
    if-eqz v10, :cond_e

    .line 202
    .line 203
    iget-object v10, v10, Lqu1;->φ:Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    invoke-virtual {v6, v8, v10}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p2, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Lux$α;->ξ()J

    .line 216
    .line 217
    .line 218
    move-result-wide v10

    .line 219
    invoke-static {v10, v11}, Lux;->ο(J)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    .line 225
    .line 226
    sget-object v6, Lbv1;->δ:Lqu1;

    .line 227
    .line 228
    if-eqz v6, :cond_d

    .line 229
    .line 230
    iget-object v6, v6, Lqu1;->ι:Ljava/lang/String;

    .line 231
    .line 232
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0}, Lux$α;->ι()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 244
    .line 245
    .line 246
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 251
    .line 252
    .line 253
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    .line 254
    .line 255
    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    invoke-virtual {p1, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    const/4 v5, 0x7

    .line 273
    invoke-static {v3, v5}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    int-to-float v3, v3

    .line 278
    invoke-virtual {p1, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v4, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p0}, Lux$α;->λ()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 289
    .line 290
    .line 291
    sget-object p1, Lbv1;->δ:Lqu1;

    .line 292
    .line 293
    if-eqz p1, :cond_c

    .line 294
    .line 295
    iget-object p1, p1, Lqu1;->θ:Ljava/lang/String;

    .line 296
    .line 297
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 298
    .line 299
    .line 300
    move-result p1

    .line 301
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0}, Lux$α;->μ()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-virtual {p0}, Lux$α;->κ()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    new-instance v3, Ljava/lang/StringBuilder;

    .line 313
    .line 314
    const-string v4, "["

    .line 315
    .line 316
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    const-string p1, "] "

    .line 323
    .line 324
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 335
    .line 336
    .line 337
    sget-object p1, Lbv1;->δ:Lqu1;

    .line 338
    .line 339
    if-eqz p1, :cond_b

    .line 340
    .line 341
    iget-object p1, p1, Lqu1;->η:Ljava/lang/String;

    .line 342
    .line 343
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p0}, Lux$α;->ν()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    if-eqz p1, :cond_9

    .line 367
    .line 368
    const/16 p0, 0x8

    .line 369
    .line 370
    invoke-virtual {p3, p0}, Landroid/view/View;->setVisibility(I)V

    .line 371
    .line 372
    .line 373
    const-string p0, ""

    .line 374
    .line 375
    invoke-virtual {p3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 376
    .line 377
    .line 378
    return-object p2

    .line 379
    :cond_9
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {p3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 383
    .line 384
    .line 385
    sget-object p0, Lbv1;->δ:Lqu1;

    .line 386
    .line 387
    if-eqz p0, :cond_a

    .line 388
    .line 389
    iget-object p0, p0, Lqu1;->π:Ljava/lang/String;

    .line 390
    .line 391
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 392
    .line 393
    .line 394
    move-result p0

    .line 395
    invoke-virtual {p3, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 396
    .line 397
    .line 398
    return-object p2

    .line 399
    :cond_a
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw v7

    .line 403
    :cond_b
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    throw v7

    .line 407
    :cond_c
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw v7

    .line 411
    :cond_d
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw v7

    .line 415
    :cond_e
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    throw v7

    .line 419
    :cond_f
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    throw v7

    .line 423
    :cond_10
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    throw v7

    .line 427
    :cond_11
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    throw v7
.end method
