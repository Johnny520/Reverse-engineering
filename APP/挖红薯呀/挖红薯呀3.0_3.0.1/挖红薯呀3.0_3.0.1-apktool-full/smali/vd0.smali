.class public final Lvd0;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lwd0;


# direct methods
.method public synthetic constructor <init>(Lwd0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lvd0;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lvd0;->e:Lwd0;

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
    .locals 10

    .line 1
    iget v0, p0, Lvd0;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    iget-object p0, p0, Lvd0;->e:Lwd0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lwd0;->i:Lf60;

    .line 11
    .line 12
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v2, v2, Lqj0;->t:Lqj0;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iget-object v2, v2, Lyb0;->o:Lzb0;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    :cond_0
    iget-object v2, v0, Lf60;->a:Lb60;

    .line 25
    .line 26
    invoke-static {v2}, Le60;->a(Lb60;)Ldn0;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lw3;

    .line 31
    .line 32
    invoke-virtual {v2}, Lw3;->getPlacementScope()Lwq0;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :cond_1
    iget-object v3, p0, Lwd0;->I:Lsw;

    .line 37
    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-wide v3, p0, Lwd0;->J:J

    .line 45
    .line 46
    iget p0, p0, Lwd0;->K:F

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v0}, Lwq0;->a(Lwq0;Lxq0;)V

    .line 52
    .line 53
    .line 54
    iget-wide v5, v0, Lxq0;->h:J

    .line 55
    .line 56
    invoke-static {v3, v4, v5, v6}, Lw20;->c(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-virtual {v0, v2, v3, p0, v4}, Lxq0;->X(JFLsw;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-wide v4, p0, Lwd0;->J:J

    .line 70
    .line 71
    iget p0, p0, Lwd0;->K:F

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v2, v0}, Lwq0;->a(Lwq0;Lxq0;)V

    .line 77
    .line 78
    .line 79
    iget-wide v6, v0, Lxq0;->h:J

    .line 80
    .line 81
    invoke-static {v4, v5, v6, v7}, Lw20;->c(JJ)J

    .line 82
    .line 83
    .line 84
    move-result-wide v4

    .line 85
    invoke-virtual {v0, v4, v5, p0, v3}, Lxq0;->X(JFLsw;)V

    .line 86
    .line 87
    .line 88
    :goto_0
    return-object v1

    .line 89
    :pswitch_0
    iget-object v0, p0, Lwd0;->i:Lf60;

    .line 90
    .line 91
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-wide v2, p0, Lwd0;->D:J

    .line 96
    .line 97
    invoke-interface {v0, v2, v3}, Lsd0;->e(J)Lxq0;

    .line 98
    .line 99
    .line 100
    return-object v1

    .line 101
    :pswitch_1
    iget-object v0, p0, Lwd0;->i:Lf60;

    .line 102
    .line 103
    const/4 v2, 0x0

    .line 104
    iput v2, v0, Lf60;->i:I

    .line 105
    .line 106
    iget-object v3, v0, Lf60;->a:Lb60;

    .line 107
    .line 108
    invoke-virtual {v3}, Lb60;->z()Lsh0;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    iget-object v4, v3, Lsh0;->d:[Ljava/lang/Object;

    .line 113
    .line 114
    iget v3, v3, Lsh0;->f:I

    .line 115
    .line 116
    move v5, v2

    .line 117
    :goto_1
    const v6, 0x7fffffff

    .line 118
    .line 119
    .line 120
    if-ge v5, v3, :cond_4

    .line 121
    .line 122
    aget-object v7, v4, v5

    .line 123
    .line 124
    check-cast v7, Lb60;

    .line 125
    .line 126
    iget-object v7, v7, Lb60;->J:Lf60;

    .line 127
    .line 128
    iget-object v7, v7, Lf60;->p:Lwd0;

    .line 129
    .line 130
    iget v8, v7, Lwd0;->l:I

    .line 131
    .line 132
    iput v8, v7, Lwd0;->k:I

    .line 133
    .line 134
    iput v6, v7, Lwd0;->l:I

    .line 135
    .line 136
    iput-boolean v2, v7, Lwd0;->v:Z

    .line 137
    .line 138
    iget-object v6, v7, Lwd0;->o:Lz50;

    .line 139
    .line 140
    sget-object v8, Lz50;->e:Lz50;

    .line 141
    .line 142
    if-ne v6, v8, :cond_3

    .line 143
    .line 144
    sget-object v6, Lz50;->f:Lz50;

    .line 145
    .line 146
    iput-object v6, v7, Lwd0;->o:Lz50;

    .line 147
    .line 148
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_4
    iget-object v3, v0, Lf60;->a:Lb60;

    .line 152
    .line 153
    iget-object v0, v0, Lf60;->a:Lb60;

    .line 154
    .line 155
    invoke-virtual {v3}, Lb60;->z()Lsh0;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    iget-object v4, v3, Lsh0;->d:[Ljava/lang/Object;

    .line 160
    .line 161
    iget v3, v3, Lsh0;->f:I

    .line 162
    .line 163
    move v5, v2

    .line 164
    :goto_2
    if-ge v5, v3, :cond_5

    .line 165
    .line 166
    aget-object v7, v4, v5

    .line 167
    .line 168
    check-cast v7, Lb60;

    .line 169
    .line 170
    iget-object v7, v7, Lb60;->J:Lf60;

    .line 171
    .line 172
    iget-object v7, v7, Lf60;->p:Lwd0;

    .line 173
    .line 174
    iget-object v7, v7, Lwd0;->z:Lc60;

    .line 175
    .line 176
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    add-int/lit8 v5, v5, 0x1

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_5
    invoke-virtual {p0}, Lwd0;->r()Lc20;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    iget-boolean v3, v3, Lyb0;->n:Z

    .line 187
    .line 188
    if-eqz v3, :cond_6

    .line 189
    .line 190
    invoke-virtual {v0}, Lb60;->n()Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    check-cast v3, Lph0;

    .line 195
    .line 196
    iget-object v4, v3, Lph0;->d:Lsh0;

    .line 197
    .line 198
    iget v4, v4, Lsh0;->f:I

    .line 199
    .line 200
    move v5, v2

    .line 201
    :goto_3
    if-ge v5, v4, :cond_6

    .line 202
    .line 203
    invoke-virtual {v3, v5}, Lph0;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    check-cast v7, Lb60;

    .line 208
    .line 209
    iget-object v7, v7, Lb60;->I:Lmj0;

    .line 210
    .line 211
    iget-object v7, v7, Lmj0;->d:Lqj0;

    .line 212
    .line 213
    const/4 v8, 0x1

    .line 214
    iput-boolean v8, v7, Lyb0;->n:Z

    .line 215
    .line 216
    add-int/lit8 v5, v5, 0x1

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_6
    invoke-virtual {p0}, Lwd0;->r()Lc20;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-virtual {v3}, Lqj0;->o0()Lyd0;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-interface {v3}, Lyd0;->b()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, Lwd0;->r()Lc20;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    iget-boolean p0, p0, Lyb0;->n:Z

    .line 235
    .line 236
    if-eqz p0, :cond_7

    .line 237
    .line 238
    invoke-virtual {v0}, Lb60;->n()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    check-cast p0, Lph0;

    .line 243
    .line 244
    iget-object v3, p0, Lph0;->d:Lsh0;

    .line 245
    .line 246
    iget v3, v3, Lsh0;->f:I

    .line 247
    .line 248
    move v4, v2

    .line 249
    :goto_4
    if-ge v4, v3, :cond_7

    .line 250
    .line 251
    invoke-virtual {p0, v4}, Lph0;->get(I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    check-cast v5, Lb60;

    .line 256
    .line 257
    iget-object v5, v5, Lb60;->I:Lmj0;

    .line 258
    .line 259
    iget-object v5, v5, Lmj0;->d:Lqj0;

    .line 260
    .line 261
    iput-boolean v2, v5, Lyb0;->n:Z

    .line 262
    .line 263
    add-int/lit8 v4, v4, 0x1

    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_7
    invoke-virtual {v0}, Lb60;->z()Lsh0;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    iget-object v3, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 271
    .line 272
    iget p0, p0, Lsh0;->f:I

    .line 273
    .line 274
    move v4, v2

    .line 275
    :goto_5
    if-ge v4, p0, :cond_b

    .line 276
    .line 277
    aget-object v5, v3, v4

    .line 278
    .line 279
    check-cast v5, Lb60;

    .line 280
    .line 281
    iget-object v7, v5, Lb60;->J:Lf60;

    .line 282
    .line 283
    iget-object v8, v7, Lf60;->p:Lwd0;

    .line 284
    .line 285
    iget v8, v8, Lwd0;->k:I

    .line 286
    .line 287
    invoke-virtual {v5}, Lb60;->w()I

    .line 288
    .line 289
    .line 290
    move-result v9

    .line 291
    if-eq v8, v9, :cond_a

    .line 292
    .line 293
    invoke-virtual {v0}, Lb60;->O()V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Lb60;->C()V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v5}, Lb60;->w()I

    .line 300
    .line 301
    .line 302
    move-result v8

    .line 303
    if-ne v8, v6, :cond_a

    .line 304
    .line 305
    iget-boolean v8, v7, Lf60;->c:Z

    .line 306
    .line 307
    if-nez v8, :cond_8

    .line 308
    .line 309
    invoke-static {v5}, Lg60;->p(Lb60;)Z

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    if-eqz v5, :cond_9

    .line 314
    .line 315
    :cond_8
    iget-object v5, v7, Lf60;->q:Lec0;

    .line 316
    .line 317
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v5, v2}, Lec0;->c0(Z)V

    .line 321
    .line 322
    .line 323
    :cond_9
    iget-object v5, v7, Lf60;->p:Lwd0;

    .line 324
    .line 325
    invoke-virtual {v5}, Lwd0;->d0()V

    .line 326
    .line 327
    .line 328
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_b
    invoke-virtual {v0}, Lb60;->z()Lsh0;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    iget-object v0, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 336
    .line 337
    iget p0, p0, Lsh0;->f:I

    .line 338
    .line 339
    move v3, v2

    .line 340
    :goto_6
    if-ge v3, p0, :cond_c

    .line 341
    .line 342
    aget-object v4, v0, v3

    .line 343
    .line 344
    check-cast v4, Lb60;

    .line 345
    .line 346
    iget-object v4, v4, Lb60;->J:Lf60;

    .line 347
    .line 348
    iget-object v4, v4, Lf60;->p:Lwd0;

    .line 349
    .line 350
    iget-object v4, v4, Lwd0;->z:Lc60;

    .line 351
    .line 352
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    iput-boolean v2, v4, Lc60;->c:Z

    .line 356
    .line 357
    add-int/lit8 v3, v3, 0x1

    .line 358
    .line 359
    goto :goto_6

    .line 360
    :cond_c
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
