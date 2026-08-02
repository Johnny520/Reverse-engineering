.class public final Lpd1;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lqd1;


# direct methods
.method public synthetic constructor <init>(Lqd1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpd1;->i:I

    .line 2
    .line 3
    iput-object p1, p0, Lpd1;->j:Lqd1;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lpd1;->i:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object p0, p0, Lpd1;->j:Lqd1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lqd1;->m:Lv61;

    .line 11
    .line 12
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lzn1;->Q0()Lmd1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-wide v2, p0, Lqd1;->E:J

    .line 24
    .line 25
    invoke-interface {v0, v2, v3}, Lif1;->e(J)Lsz1;

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :pswitch_0
    iget-object v0, p0, Lqd1;->m:Lv61;

    .line 30
    .line 31
    iget-object v2, v0, Lv61;->a:Lr61;

    .line 32
    .line 33
    invoke-static {v2}, Lfg1;->z(Lr61;)Z

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
    iget-boolean v2, v0, Lv61;->c:Z

    .line 41
    .line 42
    if-nez v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget-object v2, v2, Lzn1;->x:Lzn1;

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2}, Lzn1;->Q0()Lmd1;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    iget-object v3, v2, Lkd1;->s:Lld1;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget-object v2, v2, Lzn1;->x:Lzn1;

    .line 66
    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    iget-object v3, v2, Lkd1;->s:Lld1;

    .line 70
    .line 71
    :cond_1
    :goto_0
    if-nez v3, :cond_2

    .line 72
    .line 73
    iget-object v2, v0, Lv61;->a:Lr61;

    .line 74
    .line 75
    invoke-static {v2}, Lu61;->a(Lr61;)Lzv1;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Lb7;

    .line 80
    .line 81
    invoke-virtual {v2}, Lb7;->getPlacementScope()Lrz1;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    :cond_2
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Lzn1;->Q0()Lmd1;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-wide v4, p0, Lqd1;->u:J

    .line 97
    .line 98
    invoke-static {v3, v0, v4, v5}, Lrz1;->h(Lrz1;Lsz1;J)V

    .line 99
    .line 100
    .line 101
    return-object v1

    .line 102
    :pswitch_1
    iget-object v0, p0, Lqd1;->m:Lv61;

    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    iput v2, v0, Lv61;->h:I

    .line 106
    .line 107
    iget-object v3, v0, Lv61;->a:Lr61;

    .line 108
    .line 109
    invoke-virtual {v3}, Lr61;->y()Lzk1;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    iget-object v4, v3, Lzk1;->h:[Ljava/lang/Object;

    .line 114
    .line 115
    iget v3, v3, Lzk1;->j:I

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
    check-cast v7, Lr61;

    .line 126
    .line 127
    iget-object v7, v7, Lr61;->N:Lv61;

    .line 128
    .line 129
    iget-object v7, v7, Lv61;->q:Lqd1;

    .line 130
    .line 131
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget v8, v7, Lqd1;->p:I

    .line 135
    .line 136
    iput v8, v7, Lqd1;->o:I

    .line 137
    .line 138
    iput v6, v7, Lqd1;->p:I

    .line 139
    .line 140
    iget-object v6, v7, Lqd1;->q:Lp61;

    .line 141
    .line 142
    sget-object v8, Lp61;->i:Lp61;

    .line 143
    .line 144
    if-ne v6, v8, :cond_3

    .line 145
    .line 146
    sget-object v6, Lp61;->j:Lp61;

    .line 147
    .line 148
    iput-object v6, v7, Lqd1;->q:Lp61;

    .line 149
    .line 150
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    iget-object v3, v0, Lv61;->a:Lr61;

    .line 154
    .line 155
    iget-object v0, v0, Lv61;->a:Lr61;

    .line 156
    .line 157
    invoke-virtual {v3}, Lr61;->y()Lzk1;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    iget-object v4, v3, Lzk1;->h:[Ljava/lang/Object;

    .line 162
    .line 163
    iget v3, v3, Lzk1;->j:I

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
    check-cast v7, Lr61;

    .line 171
    .line 172
    iget-object v7, v7, Lr61;->N:Lv61;

    .line 173
    .line 174
    iget-object v7, v7, Lv61;->q:Lqd1;

    .line 175
    .line 176
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iget-object v7, v7, Lqd1;->x:Ls61;

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
    invoke-virtual {p0}, Lqd1;->n()Lqz0;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    iget-object v3, v3, Lqz0;->Z:Lpz0;

    .line 192
    .line 193
    if-eqz v3, :cond_7

    .line 194
    .line 195
    iget-boolean v3, v3, Lkd1;->r:Z

    .line 196
    .line 197
    invoke-virtual {v0}, Lr61;->n()Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    check-cast v4, Ljk1;

    .line 202
    .line 203
    iget-object v5, v4, Ljk1;->i:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v5, Lzk1;

    .line 206
    .line 207
    iget v5, v5, Lzk1;->j:I

    .line 208
    .line 209
    move v7, v2

    .line 210
    :goto_3
    if-ge v7, v5, :cond_7

    .line 211
    .line 212
    invoke-virtual {v4, v7}, Ljk1;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    check-cast v8, Lr61;

    .line 217
    .line 218
    iget-object v8, v8, Lr61;->M:Lvn1;

    .line 219
    .line 220
    iget-object v8, v8, Lvn1;->e:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v8, Lzn1;

    .line 223
    .line 224
    invoke-virtual {v8}, Lzn1;->Q0()Lmd1;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    if-eqz v8, :cond_6

    .line 229
    .line 230
    iput-boolean v3, v8, Lkd1;->r:Z

    .line 231
    .line 232
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_7
    invoke-virtual {p0}, Lqd1;->n()Lqz0;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    iget-object v3, v3, Lqz0;->Z:Lpz0;

    .line 240
    .line 241
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v3}, Lmd1;->A0()Lof1;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    invoke-interface {v3}, Lof1;->b()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0}, Lqd1;->n()Lqz0;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    iget-object p0, p0, Lqz0;->Z:Lpz0;

    .line 256
    .line 257
    if-eqz p0, :cond_9

    .line 258
    .line 259
    invoke-virtual {v0}, Lr61;->n()Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    check-cast p0, Ljk1;

    .line 264
    .line 265
    iget-object v3, p0, Ljk1;->i:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v3, Lzk1;

    .line 268
    .line 269
    iget v3, v3, Lzk1;->j:I

    .line 270
    .line 271
    move v4, v2

    .line 272
    :goto_4
    if-ge v4, v3, :cond_9

    .line 273
    .line 274
    invoke-virtual {p0, v4}, Ljk1;->get(I)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    check-cast v5, Lr61;

    .line 279
    .line 280
    iget-object v5, v5, Lr61;->M:Lvn1;

    .line 281
    .line 282
    iget-object v5, v5, Lvn1;->e:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v5, Lzn1;

    .line 285
    .line 286
    invoke-virtual {v5}, Lzn1;->Q0()Lmd1;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    if-eqz v5, :cond_8

    .line 291
    .line 292
    iput-boolean v2, v5, Lkd1;->r:Z

    .line 293
    .line 294
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_9
    invoke-virtual {v0}, Lr61;->y()Lzk1;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    iget-object v3, p0, Lzk1;->h:[Ljava/lang/Object;

    .line 302
    .line 303
    iget p0, p0, Lzk1;->j:I

    .line 304
    .line 305
    move v4, v2

    .line 306
    :goto_5
    if-ge v4, p0, :cond_b

    .line 307
    .line 308
    aget-object v5, v3, v4

    .line 309
    .line 310
    check-cast v5, Lr61;

    .line 311
    .line 312
    iget-object v5, v5, Lr61;->N:Lv61;

    .line 313
    .line 314
    iget-object v5, v5, Lv61;->q:Lqd1;

    .line 315
    .line 316
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    iget v7, v5, Lqd1;->o:I

    .line 320
    .line 321
    iget v8, v5, Lqd1;->p:I

    .line 322
    .line 323
    if-eq v7, v8, :cond_a

    .line 324
    .line 325
    if-ne v8, v6, :cond_a

    .line 326
    .line 327
    const/4 v7, 0x1

    .line 328
    invoke-virtual {v5, v7}, Lqd1;->m0(Z)V

    .line 329
    .line 330
    .line 331
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_b
    invoke-virtual {v0}, Lr61;->y()Lzk1;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    iget-object v0, p0, Lzk1;->h:[Ljava/lang/Object;

    .line 339
    .line 340
    iget p0, p0, Lzk1;->j:I

    .line 341
    .line 342
    move v3, v2

    .line 343
    :goto_6
    if-ge v3, p0, :cond_c

    .line 344
    .line 345
    aget-object v4, v0, v3

    .line 346
    .line 347
    check-cast v4, Lr61;

    .line 348
    .line 349
    iget-object v4, v4, Lr61;->N:Lv61;

    .line 350
    .line 351
    iget-object v4, v4, Lv61;->q:Lqd1;

    .line 352
    .line 353
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    iget-object v4, v4, Lqd1;->x:Ls61;

    .line 357
    .line 358
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    iput-boolean v2, v4, Ls61;->c:Z

    .line 362
    .line 363
    add-int/lit8 v3, v3, 0x1

    .line 364
    .line 365
    goto :goto_6

    .line 366
    :cond_c
    return-object v1

    .line 367
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
