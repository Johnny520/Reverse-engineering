.class public final Llf1;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lmf1;


# direct methods
.method public synthetic constructor <init>(Lmf1;I)V
    .locals 0

    .line 1
    iput p2, p0, Llf1;->i:I

    .line 2
    .line 3
    iput-object p1, p0, Llf1;->j:Lmf1;

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
    .locals 10

    .line 1
    iget v0, p0, Llf1;->i:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object p0, p0, Llf1;->j:Lmf1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lmf1;->m:Lv61;

    .line 11
    .line 12
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v2, v2, Lzn1;->x:Lzn1;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iget-object v2, v2, Lkd1;->s:Lld1;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    :cond_0
    iget-object v2, v0, Lv61;->a:Lr61;

    .line 25
    .line 26
    invoke-static {v2}, Lu61;->a(Lr61;)Lzv1;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lb7;

    .line 31
    .line 32
    invoke-virtual {v2}, Lb7;->getPlacementScope()Lrz1;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :cond_1
    iget-object v3, p0, Lmf1;->M:Lin0;

    .line 37
    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-wide v3, p0, Lmf1;->N:J

    .line 45
    .line 46
    iget p0, p0, Lmf1;->O:F

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v0}, Lrz1;->a(Lrz1;Lsz1;)V

    .line 52
    .line 53
    .line 54
    iget-wide v5, v0, Lsz1;->l:J

    .line 55
    .line 56
    invoke-static {v3, v4, v5, v6}, Lz01;->c(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-virtual {v0, v2, v3, p0, v4}, Lsz1;->f0(JFLin0;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-wide v4, p0, Lmf1;->N:J

    .line 70
    .line 71
    iget p0, p0, Lmf1;->O:F

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v2, v0}, Lrz1;->a(Lrz1;Lsz1;)V

    .line 77
    .line 78
    .line 79
    iget-wide v6, v0, Lsz1;->l:J

    .line 80
    .line 81
    invoke-static {v4, v5, v6, v7}, Lz01;->c(JJ)J

    .line 82
    .line 83
    .line 84
    move-result-wide v4

    .line 85
    invoke-virtual {v0, v4, v5, p0, v3}, Lsz1;->f0(JFLin0;)V

    .line 86
    .line 87
    .line 88
    :goto_0
    return-object v1

    .line 89
    :pswitch_0
    iget-object v0, p0, Lmf1;->m:Lv61;

    .line 90
    .line 91
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-wide v2, p0, Lmf1;->H:J

    .line 96
    .line 97
    invoke-interface {v0, v2, v3}, Lif1;->e(J)Lsz1;

    .line 98
    .line 99
    .line 100
    return-object v1

    .line 101
    :pswitch_1
    iget-object v0, p0, Lmf1;->m:Lv61;

    .line 102
    .line 103
    const/4 v2, 0x0

    .line 104
    iput v2, v0, Lv61;->i:I

    .line 105
    .line 106
    iget-object v3, v0, Lv61;->a:Lr61;

    .line 107
    .line 108
    invoke-virtual {v3}, Lr61;->y()Lzk1;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    iget-object v4, v3, Lzk1;->h:[Ljava/lang/Object;

    .line 113
    .line 114
    iget v3, v3, Lzk1;->j:I

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
    check-cast v7, Lr61;

    .line 125
    .line 126
    iget-object v7, v7, Lr61;->N:Lv61;

    .line 127
    .line 128
    iget-object v7, v7, Lv61;->p:Lmf1;

    .line 129
    .line 130
    iget v8, v7, Lmf1;->p:I

    .line 131
    .line 132
    iput v8, v7, Lmf1;->o:I

    .line 133
    .line 134
    iput v6, v7, Lmf1;->p:I

    .line 135
    .line 136
    iput-boolean v2, v7, Lmf1;->z:Z

    .line 137
    .line 138
    iget-object v6, v7, Lmf1;->s:Lp61;

    .line 139
    .line 140
    sget-object v8, Lp61;->i:Lp61;

    .line 141
    .line 142
    if-ne v6, v8, :cond_3

    .line 143
    .line 144
    sget-object v6, Lp61;->j:Lp61;

    .line 145
    .line 146
    iput-object v6, v7, Lmf1;->s:Lp61;

    .line 147
    .line 148
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_4
    iget-object v3, v0, Lv61;->a:Lr61;

    .line 152
    .line 153
    iget-object v0, v0, Lv61;->a:Lr61;

    .line 154
    .line 155
    invoke-virtual {v3}, Lr61;->y()Lzk1;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    iget-object v4, v3, Lzk1;->h:[Ljava/lang/Object;

    .line 160
    .line 161
    iget v3, v3, Lzk1;->j:I

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
    check-cast v7, Lr61;

    .line 169
    .line 170
    iget-object v7, v7, Lr61;->N:Lv61;

    .line 171
    .line 172
    iget-object v7, v7, Lv61;->p:Lmf1;

    .line 173
    .line 174
    iget-object v7, v7, Lmf1;->D:Ls61;

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
    invoke-virtual {p0}, Lmf1;->n()Lqz0;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    iget-boolean v3, v3, Lkd1;->r:Z

    .line 187
    .line 188
    if-eqz v3, :cond_6

    .line 189
    .line 190
    invoke-virtual {v0}, Lr61;->n()Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    check-cast v3, Ljk1;

    .line 195
    .line 196
    iget-object v4, v3, Ljk1;->i:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v4, Lzk1;

    .line 199
    .line 200
    iget v4, v4, Lzk1;->j:I

    .line 201
    .line 202
    move v5, v2

    .line 203
    :goto_3
    if-ge v5, v4, :cond_6

    .line 204
    .line 205
    invoke-virtual {v3, v5}, Ljk1;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    check-cast v7, Lr61;

    .line 210
    .line 211
    iget-object v7, v7, Lr61;->M:Lvn1;

    .line 212
    .line 213
    iget-object v7, v7, Lvn1;->e:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v7, Lzn1;

    .line 216
    .line 217
    const/4 v8, 0x1

    .line 218
    iput-boolean v8, v7, Lkd1;->r:Z

    .line 219
    .line 220
    add-int/lit8 v5, v5, 0x1

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_6
    invoke-virtual {p0}, Lmf1;->n()Lqz0;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v3}, Lzn1;->A0()Lof1;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-interface {v3}, Lof1;->b()V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0}, Lmf1;->n()Lqz0;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    iget-boolean p0, p0, Lkd1;->r:Z

    .line 239
    .line 240
    if-eqz p0, :cond_7

    .line 241
    .line 242
    invoke-virtual {v0}, Lr61;->n()Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    check-cast p0, Ljk1;

    .line 247
    .line 248
    iget-object v3, p0, Ljk1;->i:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v3, Lzk1;

    .line 251
    .line 252
    iget v3, v3, Lzk1;->j:I

    .line 253
    .line 254
    move v4, v2

    .line 255
    :goto_4
    if-ge v4, v3, :cond_7

    .line 256
    .line 257
    invoke-virtual {p0, v4}, Ljk1;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    check-cast v5, Lr61;

    .line 262
    .line 263
    iget-object v5, v5, Lr61;->M:Lvn1;

    .line 264
    .line 265
    iget-object v5, v5, Lvn1;->e:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v5, Lzn1;

    .line 268
    .line 269
    iput-boolean v2, v5, Lkd1;->r:Z

    .line 270
    .line 271
    add-int/lit8 v4, v4, 0x1

    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_7
    invoke-virtual {v0}, Lr61;->y()Lzk1;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    iget-object v3, p0, Lzk1;->h:[Ljava/lang/Object;

    .line 279
    .line 280
    iget p0, p0, Lzk1;->j:I

    .line 281
    .line 282
    move v4, v2

    .line 283
    :goto_5
    if-ge v4, p0, :cond_b

    .line 284
    .line 285
    aget-object v5, v3, v4

    .line 286
    .line 287
    check-cast v5, Lr61;

    .line 288
    .line 289
    iget-object v7, v5, Lr61;->N:Lv61;

    .line 290
    .line 291
    iget-object v8, v7, Lv61;->p:Lmf1;

    .line 292
    .line 293
    iget v8, v8, Lmf1;->o:I

    .line 294
    .line 295
    invoke-virtual {v5}, Lr61;->v()I

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    if-eq v8, v9, :cond_a

    .line 300
    .line 301
    invoke-virtual {v0}, Lr61;->O()V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Lr61;->C()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v5}, Lr61;->v()I

    .line 308
    .line 309
    .line 310
    move-result v8

    .line 311
    if-ne v8, v6, :cond_a

    .line 312
    .line 313
    iget-boolean v8, v7, Lv61;->c:Z

    .line 314
    .line 315
    if-nez v8, :cond_8

    .line 316
    .line 317
    invoke-static {v5}, Lfg1;->z(Lr61;)Z

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    if-eqz v5, :cond_9

    .line 322
    .line 323
    :cond_8
    iget-object v5, v7, Lv61;->q:Lqd1;

    .line 324
    .line 325
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v5, v2}, Lqd1;->m0(Z)V

    .line 329
    .line 330
    .line 331
    :cond_9
    iget-object v5, v7, Lv61;->p:Lmf1;

    .line 332
    .line 333
    invoke-virtual {v5}, Lmf1;->n0()V

    .line 334
    .line 335
    .line 336
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 337
    .line 338
    goto :goto_5

    .line 339
    :cond_b
    invoke-virtual {v0}, Lr61;->y()Lzk1;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    iget-object v0, p0, Lzk1;->h:[Ljava/lang/Object;

    .line 344
    .line 345
    iget p0, p0, Lzk1;->j:I

    .line 346
    .line 347
    move v3, v2

    .line 348
    :goto_6
    if-ge v3, p0, :cond_c

    .line 349
    .line 350
    aget-object v4, v0, v3

    .line 351
    .line 352
    check-cast v4, Lr61;

    .line 353
    .line 354
    iget-object v4, v4, Lr61;->N:Lv61;

    .line 355
    .line 356
    iget-object v4, v4, Lv61;->p:Lmf1;

    .line 357
    .line 358
    iget-object v4, v4, Lmf1;->D:Ls61;

    .line 359
    .line 360
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    iput-boolean v2, v4, Ls61;->c:Z

    .line 364
    .line 365
    add-int/lit8 v3, v3, 0x1

    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_c
    return-object v1

    .line 369
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
