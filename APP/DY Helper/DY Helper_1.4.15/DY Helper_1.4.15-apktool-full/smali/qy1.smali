.class public final Lqy1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lqy1;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Lib2;I)V
    .locals 0

    .line 7
    iput p2, p0, Lqy1;->α:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 1
    iget p0, p0, Lqy1;->α:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p2, Ljava/lang/reflect/Method;

    .line 8
    .line 9
    invoke-static {p2}, Lib2;->Θ(Ljava/lang/reflect/Method;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p1, Ljava/lang/reflect/Method;

    .line 18
    .line 19
    invoke-static {p1}, Lib2;->Θ(Ljava/lang/reflect/Method;)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    :pswitch_0
    check-cast p2, Ljava/lang/reflect/Method;

    .line 33
    .line 34
    invoke-static {p2}, Lib2;->Ι(Ljava/lang/reflect/Method;)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p1, Ljava/lang/reflect/Method;

    .line 43
    .line 44
    invoke-static {p1}, Lib2;->Ι(Ljava/lang/reflect/Method;)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :pswitch_1
    check-cast p2, Ljava/lang/reflect/Method;

    .line 58
    .line 59
    invoke-static {p2}, Lib2;->Θ(Ljava/lang/reflect/Method;)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p1, Ljava/lang/reflect/Method;

    .line 68
    .line 69
    invoke-static {p1}, Lib2;->Θ(Ljava/lang/reflect/Method;)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    return p0

    .line 82
    :pswitch_2
    check-cast p1, Lt92;

    .line 83
    .line 84
    check-cast p2, Lt92;

    .line 85
    .line 86
    iget p0, p1, Lt92;->α:I

    .line 87
    .line 88
    iget p1, p2, Lt92;->α:I

    .line 89
    .line 90
    sub-int/2addr p0, p1

    .line 91
    return p0

    .line 92
    :pswitch_3
    check-cast p1, Lk52;

    .line 93
    .line 94
    iget p0, p1, Lk52;->γ:I

    .line 95
    .line 96
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p2, Lk52;

    .line 101
    .line 102
    iget p1, p2, Lk52;->γ:I

    .line 103
    .line 104
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    return p0

    .line 113
    :pswitch_4
    check-cast p1, Lj52;

    .line 114
    .line 115
    iget p0, p1, Lj52;->γ:I

    .line 116
    .line 117
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p2, Lj52;

    .line 122
    .line 123
    iget p1, p2, Lj52;->γ:I

    .line 124
    .line 125
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    return p0

    .line 134
    :pswitch_5
    check-cast p1, Le52;

    .line 135
    .line 136
    sget-object p0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 137
    .line 138
    iget-object p0, p1, Le52;->ε:Lf52;

    .line 139
    .line 140
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    const/4 p1, 0x1

    .line 145
    const/4 v1, 0x2

    .line 146
    if-eqz p0, :cond_2

    .line 147
    .line 148
    if-eq p0, p1, :cond_1

    .line 149
    .line 150
    if-ne p0, v1, :cond_0

    .line 151
    .line 152
    move p0, p1

    .line 153
    goto :goto_0

    .line 154
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_1
    move p0, v1

    .line 159
    goto :goto_0

    .line 160
    :cond_2
    move p0, v0

    .line 161
    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    check-cast p2, Le52;

    .line 166
    .line 167
    iget-object p2, p2, Le52;->ε:Lf52;

    .line 168
    .line 169
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    if-eqz p2, :cond_4

    .line 174
    .line 175
    if-eq p2, p1, :cond_3

    .line 176
    .line 177
    if-ne p2, v1, :cond_0

    .line 178
    .line 179
    move v0, p1

    .line 180
    goto :goto_1

    .line 181
    :cond_3
    move v0, v1

    .line 182
    :cond_4
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    :goto_2
    return v0

    .line 191
    :pswitch_6
    check-cast p2, Lky1;

    .line 192
    .line 193
    iget-boolean p0, p2, Lky1;->ζ:Z

    .line 194
    .line 195
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    check-cast p1, Lky1;

    .line 200
    .line 201
    iget-boolean p1, p1, Lky1;->ζ:Z

    .line 202
    .line 203
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 208
    .line 209
    .line 210
    move-result p0

    .line 211
    return p0

    .line 212
    :pswitch_7
    check-cast p2, Ll91;

    .line 213
    .line 214
    iget-object p0, p2, Ll91;->ζ:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast p0, Ljava/lang/Integer;

    .line 217
    .line 218
    check-cast p1, Ll91;

    .line 219
    .line 220
    iget-object p1, p1, Ll91;->ζ:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast p1, Ljava/lang/Integer;

    .line 223
    .line 224
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    return p0

    .line 229
    :pswitch_8
    check-cast p2, Ljava/lang/reflect/Method;

    .line 230
    .line 231
    sget-object p0, Lry1;->α:Lry1;

    .line 232
    .line 233
    invoke-static {p2}, Lry1;->ｆ(Ljava/lang/reflect/Method;)I

    .line 234
    .line 235
    .line 236
    move-result p0

    .line 237
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    check-cast p1, Ljava/lang/reflect/Method;

    .line 242
    .line 243
    invoke-static {p1}, Lry1;->ｆ(Ljava/lang/reflect/Method;)I

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 252
    .line 253
    .line 254
    move-result p0

    .line 255
    return p0

    .line 256
    :pswitch_9
    check-cast p2, Ll91;

    .line 257
    .line 258
    iget-object p0, p2, Ll91;->ζ:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast p0, Ljava/lang/Integer;

    .line 261
    .line 262
    check-cast p1, Ll91;

    .line 263
    .line 264
    iget-object p1, p1, Ll91;->ζ:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast p1, Ljava/lang/Integer;

    .line 267
    .line 268
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    return p0

    .line 273
    :pswitch_a
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    array-length v1, p0

    .line 283
    move v2, v0

    .line 284
    move v3, v2

    .line 285
    :goto_3
    const-string v4, "IRequestListener"

    .line 286
    .line 287
    if-ge v2, v1, :cond_6

    .line 288
    .line 289
    aget-object v5, p0, v2

    .line 290
    .line 291
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    invoke-static {v5, v4, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    if-eqz v4, :cond_5

    .line 300
    .line 301
    add-int/lit8 v3, v3, 0x1

    .line 302
    .line 303
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 304
    .line 305
    goto :goto_3

    .line 306
    :cond_6
    mul-int/lit8 v3, v3, 0xa

    .line 307
    .line 308
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    array-length p0, p0

    .line 313
    add-int/2addr v3, p0

    .line 314
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    check-cast p2, Ljava/lang/reflect/Constructor;

    .line 319
    .line 320
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    array-length v1, p1

    .line 328
    move v2, v0

    .line 329
    move v3, v2

    .line 330
    :goto_4
    if-ge v2, v1, :cond_8

    .line 331
    .line 332
    aget-object v5, p1, v2

    .line 333
    .line 334
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    invoke-static {v5, v4, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    if-eqz v5, :cond_7

    .line 343
    .line 344
    add-int/lit8 v3, v3, 0x1

    .line 345
    .line 346
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_8
    mul-int/lit8 v3, v3, 0xa

    .line 350
    .line 351
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    array-length p1, p1

    .line 356
    add-int/2addr v3, p1

    .line 357
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 362
    .line 363
    .line 364
    move-result p0

    .line 365
    return p0

    .line 366
    nop

    .line 367
    :pswitch_data_0
    .packed-switch 0x0
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
