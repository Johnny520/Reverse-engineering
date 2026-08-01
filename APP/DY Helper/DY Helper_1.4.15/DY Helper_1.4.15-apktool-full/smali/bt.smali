.class public final Lbt;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lbt;->α:I

    .line 3
    .line 4
    sget-object v0, Lif0;->α:Ljava/util/List;

    .line 5
    .line 6
    iput-object p1, p0, Lbt;->β:Ljava/lang/String;

    .line 7
    .line 8
    invoke-direct {p0}, Lm01;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 12
    iput p2, p0, Lbt;->α:I

    iput-object p1, p0, Lbt;->β:Ljava/lang/String;

    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 7

    .line 1
    iget v0, p0, Lbt;->α:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/high16 v2, 0x40400000    # 3.0f

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    :pswitch_0
    invoke-super {p0, p1}, Lm01;->afterHookedMethod(Lk01;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 19
    .line 20
    aget-object v0, v0, v3

    .line 21
    .line 22
    instance-of v1, v0, Ljava/lang/Float;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    move-object v4, v0

    .line 27
    check-cast v4, Ljava/lang/Float;

    .line 28
    .line 29
    :cond_0
    if-eqz v4, :cond_2

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    cmpg-float v0, v0, v2

    .line 36
    .line 37
    if-gtz v0, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    sget-object v0, Ln82;->α:[Ljava/lang/String;

    .line 41
    .line 42
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lbt;->β:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {p1, p0}, Ln82;->β(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    return-void

    .line 53
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v0, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    array-length v2, p1

    .line 67
    :goto_1
    if-ge v3, v2, :cond_4

    .line 68
    .line 69
    aget-object v5, p1, v3

    .line 70
    .line 71
    instance-of v6, v5, Ljava/lang/Float;

    .line 72
    .line 73
    if-eqz v6, :cond_3

    .line 74
    .line 75
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    iget-object p0, p0, Lbt;->β:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    const-string v2, "rfe847aaa60ab2d90"

    .line 104
    .line 105
    new-instance v3, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v5, "\ud83d\udce6 new "

    .line 108
    .line 109
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v5, "(speed="

    .line 116
    .line 117
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v0, ")"

    .line 124
    .line 125
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v2, v0, v4, v1, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    return-void

    .line 137
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object v0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 141
    .line 142
    aget-object v0, v0, v3

    .line 143
    .line 144
    instance-of v1, v0, Ljava/lang/Float;

    .line 145
    .line 146
    if-eqz v1, :cond_6

    .line 147
    .line 148
    move-object v4, v0

    .line 149
    check-cast v4, Ljava/lang/Float;

    .line 150
    .line 151
    :cond_6
    if-eqz v4, :cond_8

    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    cmpg-float v0, v0, v2

    .line 158
    .line 159
    if-gtz v0, :cond_7

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_7
    sget-object v0, Ln82;->α:[Ljava/lang/String;

    .line 163
    .line 164
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    iget-object p0, p0, Lbt;->β:Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {p1, p0}, Ln82;->β(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    :cond_8
    :goto_3
    return-void

    .line 175
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iget-object p0, p0, Lbt;->β:Ljava/lang/String;

    .line 179
    .line 180
    const-string p1, "cache_loader"

    .line 181
    .line 182
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    if-nez p0, :cond_9

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_9
    sget p0, Ljx0;->σ:I

    .line 190
    .line 191
    sget-object p1, Lxn0;->λ:Lxn0;

    .line 192
    .line 193
    monitor-enter p1

    .line 194
    :try_start_0
    sget-object v0, Lxn0;->ν:Ljava/lang/Integer;

    .line 195
    .line 196
    if-nez v0, :cond_a

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eq v0, p0, :cond_b

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_b
    sput-object v4, Lxn0;->ν:Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    sput-object v0, Lxn0;->μ:Ljava/lang/Integer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 213
    .line 214
    const/4 v3, 0x1

    .line 215
    :goto_4
    monitor-exit p1

    .line 216
    if-nez v3, :cond_c

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_c
    sget-object p1, Lui1;->α:Ljava/lang/Object;

    .line 220
    .line 221
    const-string p1, "offline_cache_applied_count"

    .line 222
    .line 223
    const/16 v0, 0xa

    .line 224
    .line 225
    const/16 v1, 0x1f4

    .line 226
    .line 227
    invoke-static {p0, v0, v1}, Lj81;->μ(III)I

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    invoke-static {p1, v0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 232
    .line 233
    .line 234
    new-instance p1, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    const-string v0, "[rebuild] applied count="

    .line 237
    .line 238
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    const-string p1, "DYH-OfflineCache"

    .line 249
    .line 250
    invoke-static {p1, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    :goto_5
    return-void

    .line 254
    :catchall_0
    move-exception p0

    .line 255
    monitor-exit p1

    .line 256
    throw p0

    .line 257
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 261
    .line 262
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 263
    .line 264
    if-eqz v0, :cond_d

    .line 265
    .line 266
    check-cast p1, Landroid/view/ViewGroup;

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_d
    move-object p1, v4

    .line 270
    :goto_6
    if-nez p1, :cond_e

    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_e
    sget-object v0, Lif0;->α:Ljava/util/List;

    .line 274
    .line 275
    :try_start_1
    invoke-static {}, Lgf0;->α()I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    invoke-static {p1, v0}, Lif0;->δ(Landroid/view/View;I)V

    .line 280
    .line 281
    .line 282
    sget-object p1, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 283
    .line 284
    goto :goto_7

    .line 285
    :catchall_1
    move-exception p1

    .line 286
    new-instance v0, Leo1;

    .line 287
    .line 288
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 289
    .line 290
    .line 291
    move-object p1, v0

    .line 292
    :goto_7
    iget-object p0, p0, Lbt;->β:Ljava/lang/String;

    .line 293
    .line 294
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    if-eqz p1, :cond_f

    .line 299
    .line 300
    const-string v0, "r3a3868dbf7747834"

    .line 301
    .line 302
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    const-string v2, "\u540c\u6b65\u957f\u6309\u500d\u901f\u63d0\u793a\u5931\u8d25: "

    .line 307
    .line 308
    const-string v3, ", "

    .line 309
    .line 310
    invoke-static {v2, p0, v3, p1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    invoke-static {v0, p0, v4, v1, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    :cond_f
    :goto_8
    return-void

    .line 318
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    iget-object p0, p0, Lbt;->β:Ljava/lang/String;

    .line 322
    .line 323
    :try_start_2
    invoke-static {p1, p0}, Lct;->α(Lk01;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    sget-object p1, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 327
    .line 328
    goto :goto_9

    .line 329
    :catchall_2
    move-exception p1

    .line 330
    new-instance v0, Leo1;

    .line 331
    .line 332
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 333
    .line 334
    .line 335
    move-object p1, v0

    .line 336
    :goto_9
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    if-eqz p1, :cond_10

    .line 341
    .line 342
    const-string v0, "rf839340cfbdf7ea6"

    .line 343
    .line 344
    new-instance v1, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    const-string v2, "\u9ab0\u5b50 "

    .line 347
    .line 348
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    const-string p0, " Hook \u56de\u8c03\u5931\u8d25\uff0c\u4fdd\u7559\u539f\u59cb\u7ed3\u679c"

    .line 355
    .line 356
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    invoke-static {v0, p0, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 364
    .line 365
    .line 366
    :cond_10
    return-void

    .line 367
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 11

    .line 1
    iget v0, p0, Lbt;->α:I

    .line 2
    .line 3
    const-string v1, "\u25b6 "

    .line 4
    .line 5
    const-string v2, ".setPlaySpeed("

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const-string v4, ")"

    .line 9
    .line 10
    const-string v5, "rfe847aaa60ab2d90"

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    :pswitch_0
    invoke-super {p0, p1}, Lm01;->beforeHookedMethod(Lk01;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lbt;->β:Ljava/lang/String;

    .line 25
    .line 26
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 27
    .line 28
    aget-object p1, p1, v7

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "\u25b6 [\u52a8\u6001] "

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {v5, p0, v6, v3, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 61
    .line 62
    aget-object p1, p1, v7

    .line 63
    .line 64
    if-nez p1, :cond_0

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    array-length v2, v0

    .line 79
    :goto_0
    if-ge v7, v2, :cond_2

    .line 80
    .line 81
    aget-object v8, v0, v7

    .line 82
    .line 83
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 88
    .line 89
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    if-eqz v9, :cond_1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    move-object v8, v6

    .line 100
    :goto_1
    if-eqz v8, :cond_3

    .line 101
    .line 102
    const/4 v0, 0x1

    .line 103
    invoke-virtual {v8, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 104
    .line 105
    .line 106
    :cond_3
    if-eqz v8, :cond_4

    .line 107
    .line 108
    invoke-virtual {v8, p1}, Ljava/lang/reflect/Field;->getFloat(Ljava/lang/Object;)F

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    move-object p1, v6

    .line 118
    :goto_2
    iget-object p0, p0, Lbt;->β:Ljava/lang/String;

    .line 119
    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string p0, ".setPlaybackParameters(speed="

    .line 132
    .line 133
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {v5, p0, v6, v3, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    .line 148
    .line 149
    :catchall_0
    :goto_3
    return-void

    .line 150
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iget-object p0, p0, Lbt;->β:Ljava/lang/String;

    .line 154
    .line 155
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 156
    .line 157
    aget-object p1, p1, v7

    .line 158
    .line 159
    new-instance v0, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-static {v5, p0, v6, v3, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    sget-boolean v0, Ljx0;->ρ:Z

    .line 188
    .line 189
    if-nez v0, :cond_5

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_5
    iget-object v0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-static {v7, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    instance-of v1, v0, Ljava/lang/Integer;

    .line 202
    .line 203
    if-eqz v1, :cond_6

    .line 204
    .line 205
    move-object v6, v0

    .line 206
    check-cast v6, Ljava/lang/Integer;

    .line 207
    .line 208
    :cond_6
    if-eqz v6, :cond_9

    .line 209
    .line 210
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-gtz v0, :cond_7

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_7
    sget v1, Ljx0;->σ:I

    .line 218
    .line 219
    if-ne v0, v1, :cond_8

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_8
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 223
    .line 224
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    aput-object v2, p1, v7

    .line 229
    .line 230
    sget-object p1, Lm41;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 231
    .line 232
    iget-object p0, p0, Lbt;->β:Ljava/lang/String;

    .line 233
    .line 234
    const-string p1, " original="

    .line 235
    .line 236
    const-string v2, " custom="

    .line 237
    .line 238
    const-string v3, "[override] role="

    .line 239
    .line 240
    invoke-static {v0, v3, p0, p1, v2}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    invoke-static {p0}, Lm41;->γ(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    :cond_9
    :goto_4
    return-void

    .line 255
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
