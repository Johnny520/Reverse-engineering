.class public final La0/b;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 1
    iput p3, p0, La0/b;->g:I

    .line 2
    .line 3
    iput-object p1, p0, La0/b;->j:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lyf/h;-><init>(Lwf/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    iget v0, p0, La0/b;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La0/b;

    .line 7
    .line 8
    iget-object v1, p0, La0/b;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ls1/t;

    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    invoke-direct {v0, v1, p2, v2}, La0/b;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La0/b;->i:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La0/b;

    .line 20
    .line 21
    iget-object v1, p0, La0/b;->j:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lk/i;

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, p2, v2}, La0/b;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, La0/b;->i:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_1
    new-instance v0, La0/b;

    .line 33
    .line 34
    iget-object v1, p0, La0/b;->j:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lw/w;

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    invoke-direct {v0, v1, p2, v2}, La0/b;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 40
    .line 41
    .line 42
    iput-object p1, v0, La0/b;->i:Ljava/lang/Object;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_2
    new-instance v0, La0/b;

    .line 46
    .line 47
    iget-object v1, p0, La0/b;->j:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lfg/l;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-direct {v0, v1, p2, v2}, La0/b;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 53
    .line 54
    .line 55
    iput-object p1, v0, La0/b;->i:Ljava/lang/Object;

    .line 56
    .line 57
    return-object v0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, La0/b;->g:I

    .line 2
    .line 3
    check-cast p1, Ls1/k0;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La0/b;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, La0/b;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, La0/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La0/b;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, La0/b;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, La0/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La0/b;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, La0/b;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, La0/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 48
    .line 49
    return-object p1

    .line 50
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La0/b;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, La0/b;

    .line 55
    .line 56
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, La0/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, La0/b;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La0/b;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ls1/t;

    .line 9
    .line 10
    iget-object v1, p0, La0/b;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ls1/k0;

    .line 13
    .line 14
    iget v2, p0, La0/b;->h:I

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    iput-object v1, p0, La0/b;->i:Ljava/lang/Object;

    .line 37
    .line 38
    iput v3, p0, La0/b;->h:I

    .line 39
    .line 40
    sget-object p1, Ls1/l;->g:Ls1/l;

    .line 41
    .line 42
    invoke-virtual {v1, p1, p0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v2, Lxf/a;->g:Lxf/a;

    .line 47
    .line 48
    if-ne p1, v2, :cond_3

    .line 49
    .line 50
    move-object p1, v2

    .line 51
    goto/16 :goto_2

    .line 52
    .line 53
    :cond_3
    :goto_0
    check-cast p1, Ls1/k;

    .line 54
    .line 55
    iget-object p1, p1, Ls1/k;->a:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_5

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    move-object v4, v2

    .line 72
    check-cast v4, Ls1/t;

    .line 73
    .line 74
    iget-wide v4, v4, Ls1/t;->a:J

    .line 75
    .line 76
    iget-wide v6, v0, Ls1/t;->a:J

    .line 77
    .line 78
    invoke-static {v4, v5, v6, v7}, Ls1/s;->e(JJ)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_4

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    const/4 v2, 0x0

    .line 86
    :goto_1
    check-cast v2, Ls1/t;

    .line 87
    .line 88
    if-eqz v2, :cond_8

    .line 89
    .line 90
    iget-wide v4, v2, Ls1/t;->c:J

    .line 91
    .line 92
    iget-boolean p1, v2, Ls1/t;->d:Z

    .line 93
    .line 94
    if-nez p1, :cond_6

    .line 95
    .line 96
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_6
    const/16 p1, 0x20

    .line 100
    .line 101
    shr-long v6, v4, p1

    .line 102
    .line 103
    long-to-int v2, v6

    .line 104
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    iget-wide v6, v0, Ls1/t;->c:J

    .line 109
    .line 110
    shr-long/2addr v6, p1

    .line 111
    long-to-int p1, v6

    .line 112
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    sub-float/2addr v2, p1

    .line 117
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    invoke-virtual {v1}, Ls1/k0;->B()Ly1/l2;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-interface {v2}, Ly1/l2;->f()F

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    cmpl-float p1, p1, v2

    .line 130
    .line 131
    if-gtz p1, :cond_7

    .line 132
    .line 133
    const-wide v6, 0xffffffffL

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    and-long/2addr v4, v6

    .line 139
    long-to-int p1, v4

    .line 140
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    iget-wide v4, v0, Ls1/t;->c:J

    .line 145
    .line 146
    and-long/2addr v4, v6

    .line 147
    long-to-int v2, v4

    .line 148
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    sub-float/2addr p1, v2

    .line 153
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    invoke-virtual {v1}, Ls1/k0;->B()Ly1/l2;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-interface {v2}, Ly1/l2;->f()F

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    cmpl-float p1, p1, v2

    .line 166
    .line 167
    if-lez p1, :cond_2

    .line 168
    .line 169
    :cond_7
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_8
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 173
    .line 174
    :goto_2
    return-object p1

    .line 175
    :pswitch_0
    iget-object v0, p0, La0/b;->j:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Lk/i;

    .line 178
    .line 179
    iget v1, p0, La0/b;->h:I

    .line 180
    .line 181
    const/4 v2, 0x2

    .line 182
    const/4 v3, 0x1

    .line 183
    sget-object v4, Lxf/a;->g:Lxf/a;

    .line 184
    .line 185
    if-eqz v1, :cond_b

    .line 186
    .line 187
    if-eq v1, v3, :cond_a

    .line 188
    .line 189
    if-ne v1, v2, :cond_9

    .line 190
    .line 191
    iget-object v1, p0, La0/b;->i:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v1, Ls1/k0;

    .line 194
    .line 195
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_9
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 200
    .line 201
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    const/4 v4, 0x0

    .line 205
    goto/16 :goto_8

    .line 206
    .line 207
    :cond_a
    iget-object v1, p0, La0/b;->i:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v1, Ls1/k0;

    .line 210
    .line 211
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_b
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    iget-object p1, p0, La0/b;->i:Ljava/lang/Object;

    .line 219
    .line 220
    move-object v1, p1

    .line 221
    check-cast v1, Ls1/k0;

    .line 222
    .line 223
    iput-object v1, p0, La0/b;->i:Ljava/lang/Object;

    .line 224
    .line 225
    iput v3, p0, La0/b;->h:I

    .line 226
    .line 227
    invoke-static {v1, p0, v2}, Lm/y2;->b(Ls1/k0;Lwf/c;I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    if-ne p1, v4, :cond_c

    .line 232
    .line 233
    goto/16 :goto_8

    .line 234
    .line 235
    :cond_c
    :goto_3
    check-cast p1, Ls1/t;

    .line 236
    .line 237
    iget-wide v5, p1, Ls1/t;->a:J

    .line 238
    .line 239
    iput-wide v5, v0, Lk/i;->h:J

    .line 240
    .line 241
    iget-wide v5, p1, Ls1/t;->c:J

    .line 242
    .line 243
    iput-wide v5, v0, Lk/i;->b:J

    .line 244
    .line 245
    :cond_d
    iput-object v1, p0, La0/b;->i:Ljava/lang/Object;

    .line 246
    .line 247
    iput v2, p0, La0/b;->h:I

    .line 248
    .line 249
    sget-object p1, Ls1/l;->h:Ls1/l;

    .line 250
    .line 251
    invoke-virtual {v1, p1, p0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    if-ne p1, v4, :cond_e

    .line 256
    .line 257
    goto :goto_8

    .line 258
    :cond_e
    :goto_4
    check-cast p1, Ls1/k;

    .line 259
    .line 260
    iget-object p1, p1, Ls1/k;->a:Ljava/lang/Object;

    .line 261
    .line 262
    new-instance v3, Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 269
    .line 270
    .line 271
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    const/4 v6, 0x0

    .line 276
    move v7, v6

    .line 277
    :goto_5
    if-ge v7, v5, :cond_10

    .line 278
    .line 279
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    move-object v9, v8

    .line 284
    check-cast v9, Ls1/t;

    .line 285
    .line 286
    iget-boolean v9, v9, Ls1/t;->d:Z

    .line 287
    .line 288
    if-eqz v9, :cond_f

    .line 289
    .line 290
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    :cond_f
    add-int/lit8 v7, v7, 0x1

    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_10
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    :goto_6
    if-ge v6, p1, :cond_12

    .line 301
    .line 302
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    move-object v7, v5

    .line 307
    check-cast v7, Ls1/t;

    .line 308
    .line 309
    iget-wide v7, v7, Ls1/t;->a:J

    .line 310
    .line 311
    iget-wide v9, v0, Lk/i;->h:J

    .line 312
    .line 313
    invoke-static {v7, v8, v9, v10}, Ls1/s;->e(JJ)Z

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    if-eqz v7, :cond_11

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_11
    add-int/lit8 v6, v6, 0x1

    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_12
    const/4 v5, 0x0

    .line 324
    :goto_7
    check-cast v5, Ls1/t;

    .line 325
    .line 326
    if-nez v5, :cond_13

    .line 327
    .line 328
    invoke-static {v3}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    move-object v5, p1

    .line 333
    check-cast v5, Ls1/t;

    .line 334
    .line 335
    :cond_13
    if-eqz v5, :cond_14

    .line 336
    .line 337
    iget-wide v6, v5, Ls1/t;->a:J

    .line 338
    .line 339
    iput-wide v6, v0, Lk/i;->h:J

    .line 340
    .line 341
    iget-wide v5, v5, Ls1/t;->c:J

    .line 342
    .line 343
    iput-wide v5, v0, Lk/i;->b:J

    .line 344
    .line 345
    :cond_14
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 346
    .line 347
    .line 348
    move-result p1

    .line 349
    if-eqz p1, :cond_d

    .line 350
    .line 351
    const-wide/16 v1, -0x1

    .line 352
    .line 353
    iput-wide v1, v0, Lk/i;->h:J

    .line 354
    .line 355
    sget-object v4, Lsf/n;->a:Lsf/n;

    .line 356
    .line 357
    :goto_8
    return-object v4

    .line 358
    :pswitch_1
    iget v0, p0, La0/b;->h:I

    .line 359
    .line 360
    const/4 v1, 0x1

    .line 361
    if-eqz v0, :cond_16

    .line 362
    .line 363
    if-ne v0, v1, :cond_15

    .line 364
    .line 365
    iget-object v0, p0, La0/b;->i:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, Ls1/k0;

    .line 368
    .line 369
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    goto :goto_b

    .line 373
    :cond_15
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 374
    .line 375
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    const/4 p1, 0x0

    .line 379
    goto :goto_a

    .line 380
    :cond_16
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    iget-object p1, p0, La0/b;->i:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast p1, Ls1/k0;

    .line 386
    .line 387
    move-object v0, p1

    .line 388
    :goto_9
    iput-object v0, p0, La0/b;->i:Ljava/lang/Object;

    .line 389
    .line 390
    iput v1, p0, La0/b;->h:I

    .line 391
    .line 392
    sget-object p1, Ls1/l;->g:Ls1/l;

    .line 393
    .line 394
    invoke-virtual {v0, p1, p0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    sget-object v2, Lxf/a;->g:Lxf/a;

    .line 399
    .line 400
    if-ne p1, v2, :cond_17

    .line 401
    .line 402
    move-object p1, v2

    .line 403
    :goto_a
    return-object p1

    .line 404
    :cond_17
    :goto_b
    check-cast p1, Ls1/k;

    .line 405
    .line 406
    iget-object v2, p0, La0/b;->j:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v2, Lw/w;

    .line 409
    .line 410
    invoke-static {p1}, Lh0/e0;->a(Ls1/k;)Z

    .line 411
    .line 412
    .line 413
    move-result p1

    .line 414
    xor-int/2addr p1, v1

    .line 415
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 416
    .line 417
    .line 418
    move-result-object p1

    .line 419
    invoke-virtual {v2, p1}, Lw/w;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    goto :goto_9

    .line 423
    :pswitch_2
    iget v0, p0, La0/b;->h:I

    .line 424
    .line 425
    const/4 v1, 0x2

    .line 426
    const/4 v2, 0x1

    .line 427
    sget-object v3, Lxf/a;->g:Lxf/a;

    .line 428
    .line 429
    if-eqz v0, :cond_1a

    .line 430
    .line 431
    if-eq v0, v2, :cond_19

    .line 432
    .line 433
    if-ne v0, v1, :cond_18

    .line 434
    .line 435
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    goto :goto_d

    .line 439
    :cond_18
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 440
    .line 441
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    const/4 v3, 0x0

    .line 445
    goto :goto_e

    .line 446
    :cond_19
    iget-object v0, p0, La0/b;->i:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v0, Ls1/k0;

    .line 449
    .line 450
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    goto :goto_c

    .line 454
    :cond_1a
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    iget-object p1, p0, La0/b;->i:Ljava/lang/Object;

    .line 458
    .line 459
    move-object v0, p1

    .line 460
    check-cast v0, Ls1/k0;

    .line 461
    .line 462
    iput-object v0, p0, La0/b;->i:Ljava/lang/Object;

    .line 463
    .line 464
    iput v2, p0, La0/b;->h:I

    .line 465
    .line 466
    invoke-static {v0, p0}, La/a;->g(Ls1/k0;Lyf/a;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    if-ne p1, v3, :cond_1b

    .line 471
    .line 472
    goto :goto_e

    .line 473
    :cond_1b
    :goto_c
    check-cast p1, Ls1/t;

    .line 474
    .line 475
    invoke-virtual {p1}, Ls1/t;->a()V

    .line 476
    .line 477
    .line 478
    iget-object v2, p0, La0/b;->j:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v2, Lfg/l;

    .line 481
    .line 482
    iget-wide v4, p1, Ls1/t;->c:J

    .line 483
    .line 484
    new-instance p1, Le1/b;

    .line 485
    .line 486
    invoke-direct {p1, v4, v5}, Le1/b;-><init>(J)V

    .line 487
    .line 488
    .line 489
    invoke-interface {v2, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    const/4 p1, 0x0

    .line 493
    iput-object p1, p0, La0/b;->i:Ljava/lang/Object;

    .line 494
    .line 495
    iput v1, p0, La0/b;->h:I

    .line 496
    .line 497
    sget-object p1, Ls1/l;->h:Ls1/l;

    .line 498
    .line 499
    invoke-static {v0, p1, p0}, Lm/y2;->i(Ls1/k0;Ls1/l;Lyf/a;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object p1

    .line 503
    if-ne p1, v3, :cond_1c

    .line 504
    .line 505
    goto :goto_e

    .line 506
    :cond_1c
    :goto_d
    check-cast p1, Ls1/t;

    .line 507
    .line 508
    if-eqz p1, :cond_1d

    .line 509
    .line 510
    invoke-virtual {p1}, Ls1/t;->a()V

    .line 511
    .line 512
    .line 513
    :cond_1d
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 514
    .line 515
    :goto_e
    return-object v3

    .line 516
    nop

    .line 517
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
