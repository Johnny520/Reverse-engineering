.class public final synthetic Lwb/f3;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lxb/i;


# direct methods
.method public synthetic constructor <init>(Lxb/i;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/f3;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/f3;->h:Lxb/i;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/f3;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Li/c;

    .line 7
    .line 8
    iget-object p1, p0, Lwb/f3;->h:Lxb/i;

    .line 9
    .line 10
    iget-object v0, p1, Lxb/i;->q:Lm/a;

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-virtual {p1}, Lxb/i;->c()F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    int-to-long v3, v3

    .line 25
    const/4 v5, 0x0

    .line 26
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    int-to-long v5, v5

    .line 31
    const/16 v7, 0x20

    .line 32
    .line 33
    shl-long/2addr v3, v7

    .line 34
    const-wide v7, 0xffffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v5, v7

    .line 40
    or-long/2addr v3, v5

    .line 41
    iget-object v5, v0, Lm/a;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v5, Lt1/b;

    .line 44
    .line 45
    invoke-virtual {v5, v1, v2, v3, v4}, Lt1/b;->a(JJ)V

    .line 46
    .line 47
    .line 48
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v1}, La/a;->d(FF)J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    invoke-virtual {v0, v1, v2}, Lm/a;->j(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    invoke-static {v0, v1}, Lu2/q;->b(J)F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-object v1, p1, Lxb/i;->b:Llg/a;

    .line 64
    .line 65
    iget v2, v1, Llg/a;->b:F

    .line 66
    .line 67
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    iget v1, v1, Llg/a;->a:F

    .line 76
    .line 77
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    sub-float/2addr v2, v1

    .line 86
    div-float/2addr v0, v2

    .line 87
    iget-object v1, p1, Lxb/i;->a:Lqg/t;

    .line 88
    .line 89
    new-instance v2, Lxb/a;

    .line 90
    .line 91
    const/4 v3, 0x2

    .line 92
    const/4 v4, 0x0

    .line 93
    invoke-direct {v2, p1, v0, v4, v3}, Lxb/a;-><init>(Lxb/i;FLwf/c;I)V

    .line 94
    .line 95
    .line 96
    const/4 p1, 0x3

    .line 97
    invoke-static {v1, v4, v2, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 98
    .line 99
    .line 100
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 101
    .line 102
    return-object p1

    .line 103
    :pswitch_0
    check-cast p1, Ls1/t;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Lwb/f3;->h:Lxb/i;

    .line 109
    .line 110
    iget-object v0, p1, Lxb/i;->d:Lhb/w;

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Lhb/w;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    iget-object v0, p1, Lxb/i;->a:Lqg/t;

    .line 116
    .line 117
    new-instance v1, Lci/j;

    .line 118
    .line 119
    const/16 v2, 0x18

    .line 120
    .line 121
    const/4 v3, 0x0

    .line 122
    invoke-direct {v1, p1, v3, v2}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 123
    .line 124
    .line 125
    const/4 p1, 0x3

    .line 126
    invoke-static {v0, v3, v1, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :pswitch_1
    check-cast p1, Ls1/t;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    iget-object p1, p0, Lwb/f3;->h:Lxb/i;

    .line 136
    .line 137
    iget-object v0, p1, Lxb/i;->q:Lm/a;

    .line 138
    .line 139
    iget-object v0, v0, Lm/a;->h:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, Lt1/b;

    .line 142
    .line 143
    iget-object v1, v0, Lt1/b;->a:Lt1/d;

    .line 144
    .line 145
    iget-object v2, v1, Lt1/d;->d:[Lt1/a;

    .line 146
    .line 147
    const/4 v3, 0x0

    .line 148
    invoke-static {v3, v2}, Ltf/l;->x0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    const/4 v2, 0x0

    .line 152
    iput v2, v1, Lt1/d;->e:I

    .line 153
    .line 154
    iget-object v1, v0, Lt1/b;->b:Lt1/d;

    .line 155
    .line 156
    iget-object v4, v1, Lt1/d;->d:[Lt1/a;

    .line 157
    .line 158
    invoke-static {v3, v4}, Ltf/l;->x0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    iput v2, v1, Lt1/d;->e:I

    .line 162
    .line 163
    const-wide/16 v1, 0x0

    .line 164
    .line 165
    iput-wide v1, v0, Lt1/b;->c:J

    .line 166
    .line 167
    iget-object v0, p1, Lxb/i;->a:Lqg/t;

    .line 168
    .line 169
    new-instance v1, Lci/u;

    .line 170
    .line 171
    const/4 v2, 0x7

    .line 172
    invoke-direct {v1, p1, v3, v2}, Lci/u;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 173
    .line 174
    .line 175
    const/4 p1, 0x3

    .line 176
    invoke-static {v0, v3, v1, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 177
    .line 178
    .line 179
    goto :goto_0

    .line 180
    :pswitch_2
    check-cast p1, Lth/g;

    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iget-object v0, p0, Lwb/f3;->h:Lxb/i;

    .line 186
    .line 187
    invoke-virtual {v0}, Lxb/i;->a()F

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    const/16 v1, 0xa

    .line 192
    .line 193
    int-to-float v1, v1

    .line 194
    iget v2, p1, Lth/g;->g:F

    .line 195
    .line 196
    mul-float/2addr v1, v2

    .line 197
    mul-float/2addr v1, v0

    .line 198
    const/16 v3, 0xe

    .line 199
    .line 200
    int-to-float v3, v3

    .line 201
    mul-float/2addr v2, v3

    .line 202
    mul-float/2addr v2, v0

    .line 203
    const/4 v0, 0x1

    .line 204
    const/high16 v3, 0x3f000000    # 0.5f

    .line 205
    .line 206
    invoke-static {p1, v1, v2, v0, v3}, La/a;->w0(Lth/g;FFZF)V

    .line 207
    .line 208
    .line 209
    goto :goto_0

    .line 210
    :pswitch_3
    check-cast p1, Lf1/d0;

    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-interface {p1}, Lf1/d0;->a()J

    .line 216
    .line 217
    .line 218
    move-result-wide v0

    .line 219
    const/16 v2, 0x20

    .line 220
    .line 221
    shr-long/2addr v0, v2

    .line 222
    long-to-int v0, v0

    .line 223
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    const/high16 v1, 0x3f800000    # 1.0f

    .line 228
    .line 229
    cmpg-float v2, v0, v1

    .line 230
    .line 231
    if-gez v2, :cond_0

    .line 232
    .line 233
    move v0, v1

    .line 234
    :cond_0
    const/16 v2, 0x10

    .line 235
    .line 236
    int-to-float v2, v2

    .line 237
    invoke-interface {p1}, Lu2/c;->d()F

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    mul-float/2addr v3, v2

    .line 242
    div-float/2addr v3, v0

    .line 243
    add-float/2addr v3, v1

    .line 244
    iget-object v0, p0, Lwb/f3;->h:Lxb/i;

    .line 245
    .line 246
    invoke-virtual {v0}, Lxb/i;->a()F

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    invoke-static {v1, v3, v0}, Lfb/v0;->C(FFF)F

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    invoke-interface {p1, v0}, Lf1/d0;->q(F)V

    .line 255
    .line 256
    .line 257
    invoke-interface {p1, v0}, Lf1/d0;->i(F)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_0

    .line 261
    .line 262
    :pswitch_4
    check-cast p1, Lf1/d0;

    .line 263
    .line 264
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    iget-object v0, p0, Lwb/f3;->h:Lxb/i;

    .line 268
    .line 269
    iget-object v1, v0, Lxb/i;->n:Li/c;

    .line 270
    .line 271
    invoke-virtual {v1}, Li/c;->d()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    check-cast v1, Ljava/lang/Number;

    .line 276
    .line 277
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    invoke-interface {p1, v1}, Lf1/d0;->q(F)V

    .line 282
    .line 283
    .line 284
    iget-object v1, v0, Lxb/i;->o:Li/c;

    .line 285
    .line 286
    invoke-virtual {v1}, Li/c;->d()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    check-cast v1, Ljava/lang/Number;

    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    invoke-interface {p1, v1}, Lf1/d0;->i(F)V

    .line 297
    .line 298
    .line 299
    iget-object v0, v0, Lxb/i;->l:Li/c;

    .line 300
    .line 301
    invoke-virtual {v0}, Li/c;->d()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    check-cast v0, Ljava/lang/Number;

    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    const/high16 v1, 0x41200000    # 10.0f

    .line 312
    .line 313
    div-float/2addr v0, v1

    .line 314
    invoke-interface {p1}, Lf1/d0;->b()F

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    const/high16 v2, 0x3f400000    # 0.75f

    .line 319
    .line 320
    mul-float/2addr v2, v0

    .line 321
    const v3, -0x41b33333    # -0.2f

    .line 322
    .line 323
    .line 324
    cmpg-float v4, v2, v3

    .line 325
    .line 326
    if-gez v4, :cond_1

    .line 327
    .line 328
    move v2, v3

    .line 329
    :cond_1
    const v4, 0x3e4ccccd    # 0.2f

    .line 330
    .line 331
    .line 332
    cmpl-float v5, v2, v4

    .line 333
    .line 334
    if-lez v5, :cond_2

    .line 335
    .line 336
    move v2, v4

    .line 337
    :cond_2
    const/high16 v5, 0x3f800000    # 1.0f

    .line 338
    .line 339
    sub-float v2, v5, v2

    .line 340
    .line 341
    div-float/2addr v1, v2

    .line 342
    invoke-interface {p1, v1}, Lf1/d0;->q(F)V

    .line 343
    .line 344
    .line 345
    invoke-interface {p1}, Lf1/d0;->v()F

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    const/high16 v2, 0x3e800000    # 0.25f

    .line 350
    .line 351
    mul-float/2addr v0, v2

    .line 352
    cmpg-float v2, v0, v3

    .line 353
    .line 354
    if-gez v2, :cond_3

    .line 355
    .line 356
    goto :goto_1

    .line 357
    :cond_3
    move v3, v0

    .line 358
    :goto_1
    cmpl-float v0, v3, v4

    .line 359
    .line 360
    if-lez v0, :cond_4

    .line 361
    .line 362
    goto :goto_2

    .line 363
    :cond_4
    move v4, v3

    .line 364
    :goto_2
    sub-float/2addr v5, v4

    .line 365
    mul-float/2addr v5, v1

    .line 366
    invoke-interface {p1, v5}, Lf1/d0;->i(F)V

    .line 367
    .line 368
    .line 369
    goto/16 :goto_0

    .line 370
    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
