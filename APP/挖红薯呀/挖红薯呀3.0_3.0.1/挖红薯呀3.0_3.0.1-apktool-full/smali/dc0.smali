.class public final Ldc0;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lec0;


# direct methods
.method public synthetic constructor <init>(Lec0;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldc0;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Ldc0;->e:Lec0;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Ldc0;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    iget-object p0, p0, Ldc0;->e:Lec0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lec0;->i:Lf60;

    .line 11
    .line 12
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lqj0;->E0()Lac0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-wide v2, p0, Lec0;->A:J

    .line 24
    .line 25
    invoke-interface {v0, v2, v3}, Lsd0;->e(J)Lxq0;

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :pswitch_0
    iget-object v0, p0, Lec0;->i:Lf60;

    .line 30
    .line 31
    iget-object v2, v0, Lf60;->a:Lb60;

    .line 32
    .line 33
    invoke-static {v2}, Lg60;->p(Lb60;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v3, 0x0

    .line 38
    if-nez v2, :cond_0

    .line 39
    .line 40
    iget-boolean v2, v0, Lf60;->c:Z

    .line 41
    .line 42
    if-nez v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget-object v2, v2, Lqj0;->t:Lqj0;

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2}, Lqj0;->E0()Lac0;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    iget-object v3, v2, Lyb0;->o:Lzb0;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget-object v2, v2, Lqj0;->t:Lqj0;

    .line 66
    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    iget-object v3, v2, Lyb0;->o:Lzb0;

    .line 70
    .line 71
    :cond_1
    :goto_0
    if-nez v3, :cond_2

    .line 72
    .line 73
    iget-object v2, v0, Lf60;->a:Lb60;

    .line 74
    .line 75
    invoke-static {v2}, Le60;->a(Lb60;)Ldn0;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Lw3;

    .line 80
    .line 81
    invoke-virtual {v2}, Lw3;->getPlacementScope()Lwq0;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    :cond_2
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Lqj0;->E0()Lac0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-wide v4, p0, Lec0;->q:J

    .line 97
    .line 98
    invoke-static {v3, v0, v4, v5}, Lwq0;->j(Lwq0;Lxq0;J)V

    .line 99
    .line 100
    .line 101
    return-object v1

    .line 102
    :pswitch_1
    iget-object v0, p0, Lec0;->i:Lf60;

    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    iput v2, v0, Lf60;->h:I

    .line 106
    .line 107
    iget-object v3, v0, Lf60;->a:Lb60;

    .line 108
    .line 109
    invoke-virtual {v3}, Lb60;->z()Lsh0;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    iget-object v4, v3, Lsh0;->d:[Ljava/lang/Object;

    .line 114
    .line 115
    iget v3, v3, Lsh0;->f:I

    .line 116
    .line 117
    move v5, v2

    .line 118
    :goto_1
    const v6, 0x7fffffff

    .line 119
    .line 120
    .line 121
    if-ge v5, v3, :cond_4

    .line 122
    .line 123
    aget-object v7, v4, v5

    .line 124
    .line 125
    check-cast v7, Lb60;

    .line 126
    .line 127
    iget-object v7, v7, Lb60;->J:Lf60;

    .line 128
    .line 129
    iget-object v7, v7, Lf60;->q:Lec0;

    .line 130
    .line 131
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget v8, v7, Lec0;->l:I

    .line 135
    .line 136
    iput v8, v7, Lec0;->k:I

    .line 137
    .line 138
    iput v6, v7, Lec0;->l:I

    .line 139
    .line 140
    iget-object v6, v7, Lec0;->m:Lz50;

    .line 141
    .line 142
    sget-object v8, Lz50;->e:Lz50;

    .line 143
    .line 144
    if-ne v6, v8, :cond_3

    .line 145
    .line 146
    sget-object v6, Lz50;->f:Lz50;

    .line 147
    .line 148
    iput-object v6, v7, Lec0;->m:Lz50;

    .line 149
    .line 150
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    iget-object v3, v0, Lf60;->a:Lb60;

    .line 154
    .line 155
    iget-object v0, v0, Lf60;->a:Lb60;

    .line 156
    .line 157
    invoke-virtual {v3}, Lb60;->z()Lsh0;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    iget-object v4, v3, Lsh0;->d:[Ljava/lang/Object;

    .line 162
    .line 163
    iget v3, v3, Lsh0;->f:I

    .line 164
    .line 165
    move v5, v2

    .line 166
    :goto_2
    if-ge v5, v3, :cond_5

    .line 167
    .line 168
    aget-object v7, v4, v5

    .line 169
    .line 170
    check-cast v7, Lb60;

    .line 171
    .line 172
    iget-object v7, v7, Lb60;->J:Lf60;

    .line 173
    .line 174
    iget-object v7, v7, Lf60;->q:Lec0;

    .line 175
    .line 176
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iget-object v7, v7, Lec0;->t:Lc60;

    .line 180
    .line 181
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    add-int/lit8 v5, v5, 0x1

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_5
    invoke-virtual {p0}, Lec0;->r()Lc20;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    iget-object v3, v3, Lc20;->U:Lb20;

    .line 192
    .line 193
    if-eqz v3, :cond_7

    .line 194
    .line 195
    iget-boolean v3, v3, Lyb0;->n:Z

    .line 196
    .line 197
    invoke-virtual {v0}, Lb60;->n()Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    check-cast v4, Lph0;

    .line 202
    .line 203
    iget-object v5, v4, Lph0;->d:Lsh0;

    .line 204
    .line 205
    iget v5, v5, Lsh0;->f:I

    .line 206
    .line 207
    move v7, v2

    .line 208
    :goto_3
    if-ge v7, v5, :cond_7

    .line 209
    .line 210
    invoke-virtual {v4, v7}, Lph0;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    check-cast v8, Lb60;

    .line 215
    .line 216
    iget-object v8, v8, Lb60;->I:Lmj0;

    .line 217
    .line 218
    iget-object v8, v8, Lmj0;->d:Lqj0;

    .line 219
    .line 220
    invoke-virtual {v8}, Lqj0;->E0()Lac0;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    if-eqz v8, :cond_6

    .line 225
    .line 226
    iput-boolean v3, v8, Lyb0;->n:Z

    .line 227
    .line 228
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_7
    invoke-virtual {p0}, Lec0;->r()Lc20;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    iget-object v3, v3, Lc20;->U:Lb20;

    .line 236
    .line 237
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v3}, Lac0;->o0()Lyd0;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    invoke-interface {v3}, Lyd0;->b()V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0}, Lec0;->r()Lc20;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    iget-object p0, p0, Lc20;->U:Lb20;

    .line 252
    .line 253
    if-eqz p0, :cond_9

    .line 254
    .line 255
    invoke-virtual {v0}, Lb60;->n()Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    check-cast p0, Lph0;

    .line 260
    .line 261
    iget-object v3, p0, Lph0;->d:Lsh0;

    .line 262
    .line 263
    iget v3, v3, Lsh0;->f:I

    .line 264
    .line 265
    move v4, v2

    .line 266
    :goto_4
    if-ge v4, v3, :cond_9

    .line 267
    .line 268
    invoke-virtual {p0, v4}, Lph0;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    check-cast v5, Lb60;

    .line 273
    .line 274
    iget-object v5, v5, Lb60;->I:Lmj0;

    .line 275
    .line 276
    iget-object v5, v5, Lmj0;->d:Lqj0;

    .line 277
    .line 278
    invoke-virtual {v5}, Lqj0;->E0()Lac0;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    if-eqz v5, :cond_8

    .line 283
    .line 284
    iput-boolean v2, v5, Lyb0;->n:Z

    .line 285
    .line 286
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_9
    invoke-virtual {v0}, Lb60;->z()Lsh0;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    iget-object v3, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 294
    .line 295
    iget p0, p0, Lsh0;->f:I

    .line 296
    .line 297
    move v4, v2

    .line 298
    :goto_5
    if-ge v4, p0, :cond_b

    .line 299
    .line 300
    aget-object v5, v3, v4

    .line 301
    .line 302
    check-cast v5, Lb60;

    .line 303
    .line 304
    iget-object v5, v5, Lb60;->J:Lf60;

    .line 305
    .line 306
    iget-object v5, v5, Lf60;->q:Lec0;

    .line 307
    .line 308
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    iget v7, v5, Lec0;->k:I

    .line 312
    .line 313
    iget v8, v5, Lec0;->l:I

    .line 314
    .line 315
    if-eq v7, v8, :cond_a

    .line 316
    .line 317
    if-ne v8, v6, :cond_a

    .line 318
    .line 319
    const/4 v7, 0x1

    .line 320
    invoke-virtual {v5, v7}, Lec0;->c0(Z)V

    .line 321
    .line 322
    .line 323
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 324
    .line 325
    goto :goto_5

    .line 326
    :cond_b
    invoke-virtual {v0}, Lb60;->z()Lsh0;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    iget-object v0, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 331
    .line 332
    iget p0, p0, Lsh0;->f:I

    .line 333
    .line 334
    move v3, v2

    .line 335
    :goto_6
    if-ge v3, p0, :cond_c

    .line 336
    .line 337
    aget-object v4, v0, v3

    .line 338
    .line 339
    check-cast v4, Lb60;

    .line 340
    .line 341
    iget-object v4, v4, Lb60;->J:Lf60;

    .line 342
    .line 343
    iget-object v4, v4, Lf60;->q:Lec0;

    .line 344
    .line 345
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    iget-object v4, v4, Lec0;->t:Lc60;

    .line 349
    .line 350
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    iput-boolean v2, v4, Lc60;->c:Z

    .line 354
    .line 355
    add-int/lit8 v3, v3, 0x1

    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_c
    return-object v1

    .line 359
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
