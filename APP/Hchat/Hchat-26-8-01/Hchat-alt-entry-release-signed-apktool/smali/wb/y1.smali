.class public final synthetic Lwb/y1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/y1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/y1;->h:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/y1;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/y1;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/y1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 p2, p1, 0x3

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    const/4 v10, 0x0

    .line 19
    const/4 v11, 0x1

    .line 20
    if-eq p2, v0, :cond_0

    .line 21
    .line 22
    move p2, v11

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p2, v10

    .line 25
    :goto_0
    and-int/2addr p1, v11

    .line 26
    invoke-virtual {v6, p1, p2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_a

    .line 31
    .line 32
    iget-object p1, p0, Lwb/y1;->h:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v1, p0, Lwb/y1;->i:Li0/a1;

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v3, v0

    .line 52
    check-cast v3, Lq9/g;

    .line 53
    .line 54
    iget-object v3, v3, Lq9/g;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move-object v0, v2

    .line 70
    :goto_1
    check-cast v0, Lq9/g;

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    iget-object v2, v0, Lq9/g;->b:Ljava/lang/String;

    .line 75
    .line 76
    :cond_3
    if-nez v2, :cond_4

    .line 77
    .line 78
    const-string v2, ""

    .line 79
    .line 80
    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    invoke-direct {v3, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    if-eqz p2, :cond_6

    .line 98
    .line 99
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    check-cast p2, Lq9/g;

    .line 104
    .line 105
    iget-object v0, p2, Lq9/g;->b:Ljava/lang/String;

    .line 106
    .line 107
    iget-object p2, p2, Lq9/g;->a:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_5

    .line 114
    .line 115
    move-object v0, p2

    .line 116
    :cond_5
    new-instance v4, Lwb/dq;

    .line 117
    .line 118
    invoke-direct {v4, p2, v0}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_6
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    move-object v4, p1

    .line 130
    check-cast v4, Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v6, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    sget-object v0, Li0/l;->a:Li0/e;

    .line 141
    .line 142
    if-nez p1, :cond_7

    .line 143
    .line 144
    if-ne p2, v0, :cond_8

    .line 145
    .line 146
    :cond_7
    new-instance p2, Lwb/gi;

    .line 147
    .line 148
    const/16 p1, 0xf

    .line 149
    .line 150
    invoke-direct {p2, v1, p1}, Lwb/gi;-><init>(Li0/a1;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :cond_8
    move-object v5, p2

    .line 157
    check-cast v5, Lfg/l;

    .line 158
    .line 159
    const/4 v8, 0x6

    .line 160
    const/16 v9, 0x20

    .line 161
    .line 162
    const-string v1, "\u9009\u62e9\u6a21\u677f"

    .line 163
    .line 164
    move-object v7, v6

    .line 165
    const/4 v6, 0x0

    .line 166
    invoke-static/range {v1 .. v9}, Lwb/ho;->I2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;ZLi0/h0;II)V

    .line 167
    .line 168
    .line 169
    const/4 p1, 0x0

    .line 170
    invoke-static {p1, v7, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Lwb/y1;->j:Li0/a1;

    .line 174
    .line 175
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    move-object v3, p2

    .line 180
    check-cast v3, Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    if-ne p2, v0, :cond_9

    .line 187
    .line 188
    new-instance p2, Lwb/gi;

    .line 189
    .line 190
    const/16 v0, 0x10

    .line 191
    .line 192
    invoke-direct {p2, p1, v0}, Lwb/gi;-><init>(Li0/a1;I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_9
    move-object v5, p2

    .line 199
    check-cast v5, Lfg/l;

    .line 200
    .line 201
    move-object v6, v7

    .line 202
    const/16 v7, 0x6036

    .line 203
    .line 204
    const/16 v8, 0x8

    .line 205
    .line 206
    const-string v1, "\u641c\u7d22\u76d1\u542c\u7fa4"

    .line 207
    .line 208
    const-string v2, "\u7fa4\u540d\u79f0 / \u7fa4\u804a\u5907\u6ce8 / \u7fa4\u53f7"

    .line 209
    .line 210
    const/4 v4, 0x0

    .line 211
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_a
    move-object v7, v6

    .line 216
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 217
    .line 218
    .line 219
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 220
    .line 221
    return-object p1

    .line 222
    :pswitch_0
    check-cast p1, Li0/h0;

    .line 223
    .line 224
    check-cast p2, Ljava/lang/Integer;

    .line 225
    .line 226
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    and-int/lit8 v0, p2, 0x3

    .line 231
    .line 232
    const/4 v1, 0x2

    .line 233
    const/4 v2, 0x0

    .line 234
    const/4 v3, 0x1

    .line 235
    if-eq v0, v1, :cond_b

    .line 236
    .line 237
    move v0, v3

    .line 238
    goto :goto_4

    .line 239
    :cond_b
    move v0, v2

    .line 240
    :goto_4
    and-int/2addr p2, v3

    .line 241
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 242
    .line 243
    .line 244
    move-result p2

    .line 245
    if-eqz p2, :cond_e

    .line 246
    .line 247
    iget-object p2, p0, Lwb/y1;->i:Li0/a1;

    .line 248
    .line 249
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    iget-object v3, p0, Lwb/y1;->j:Li0/a1;

    .line 260
    .line 261
    invoke-virtual {p1, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    or-int/2addr v1, v4

    .line 266
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    if-nez v1, :cond_c

    .line 271
    .line 272
    sget-object v1, Li0/l;->a:Li0/e;

    .line 273
    .line 274
    if-ne v4, v1, :cond_d

    .line 275
    .line 276
    :cond_c
    new-instance v4, Lsh/m1;

    .line 277
    .line 278
    const/16 v1, 0xd

    .line 279
    .line 280
    invoke-direct {v4, v1, p2, v3}, Lsh/m1;-><init>(ILi0/a1;Li0/a1;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    :cond_d
    check-cast v4, Lfg/l;

    .line 287
    .line 288
    iget-object p2, p0, Lwb/y1;->h:Ljava/util/List;

    .line 289
    .line 290
    invoke-static {p2, v0, v4, p1, v2}, Lwb/ho;->Z(Ljava/util/List;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 291
    .line 292
    .line 293
    goto :goto_5

    .line 294
    :cond_e
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 295
    .line 296
    .line 297
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 298
    .line 299
    return-object p1

    .line 300
    :pswitch_1
    check-cast p1, Li0/h0;

    .line 301
    .line 302
    check-cast p2, Ljava/lang/Integer;

    .line 303
    .line 304
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 305
    .line 306
    .line 307
    move-result p2

    .line 308
    and-int/lit8 v0, p2, 0x3

    .line 309
    .line 310
    const/4 v1, 0x2

    .line 311
    const/4 v2, 0x0

    .line 312
    const/4 v3, 0x1

    .line 313
    if-eq v0, v1, :cond_f

    .line 314
    .line 315
    move v0, v3

    .line 316
    goto :goto_6

    .line 317
    :cond_f
    move v0, v2

    .line 318
    :goto_6
    and-int/2addr p2, v3

    .line 319
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 320
    .line 321
    .line 322
    move-result p2

    .line 323
    if-eqz p2, :cond_12

    .line 324
    .line 325
    iget-object p2, p0, Lwb/y1;->i:Li0/a1;

    .line 326
    .line 327
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    check-cast v0, Ljava/lang/String;

    .line 332
    .line 333
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    iget-object v3, p0, Lwb/y1;->j:Li0/a1;

    .line 338
    .line 339
    invoke-virtual {p1, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    or-int/2addr v1, v4

    .line 344
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    if-nez v1, :cond_10

    .line 349
    .line 350
    sget-object v1, Li0/l;->a:Li0/e;

    .line 351
    .line 352
    if-ne v4, v1, :cond_11

    .line 353
    .line 354
    :cond_10
    new-instance v4, Lsh/m1;

    .line 355
    .line 356
    const/4 v1, 0x1

    .line 357
    invoke-direct {v4, v1, p2, v3}, Lsh/m1;-><init>(ILi0/a1;Li0/a1;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {p1, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    :cond_11
    check-cast v4, Lfg/l;

    .line 364
    .line 365
    iget-object p2, p0, Lwb/y1;->h:Ljava/util/List;

    .line 366
    .line 367
    invoke-static {p2, v0, v4, p1, v2}, Lwb/ho;->Z(Ljava/util/List;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 368
    .line 369
    .line 370
    goto :goto_7

    .line 371
    :cond_12
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 372
    .line 373
    .line 374
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 375
    .line 376
    return-object p1

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
