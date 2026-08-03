.class public final Lfh/k;
.super Lx6/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:Lgh/c;

.field public h:Lfh/a;

.field public i:Lfh/a;

.field public j:Lfh/j;

.field public k:Ljava/util/List;

.field public l:Ljava/util/ArrayList;

.field public m:Lfh/l;

.field public n:Lfh/l;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lkh/b;->b(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Llh/d;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Llh/d;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, v0, Llh/d;->h:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v1, Lgh/c;

    .line 19
    .line 20
    const/4 v2, 0x5

    .line 21
    invoke-direct {v1, p1, v2}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lfh/k;->g:Lgh/c;

    .line 25
    .line 26
    const/4 p1, 0x6

    .line 27
    and-int/lit8 p1, p1, 0x2

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x5

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    :goto_0
    iget-object v1, v0, Llh/d;->g:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0, p1, v1}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, v0, Llh/d;->j:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p0, p1}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v0, Llh/d;->i:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v0, Lfh/j;

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-direct {v0, v1}, Lfh/j;-><init>(I)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Ljava/util/ArrayList;

    .line 56
    .line 57
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 60
    .line 61
    .line 62
    iput-object v1, v0, Lfh/j;->h:Ljava/util/List;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Ljava/lang/String;

    .line 79
    .line 80
    if-eqz v1, :cond_1

    .line 81
    .line 82
    new-instance v2, Lfh/m;

    .line 83
    .line 84
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-static {v2, v1}, Lfh/m;->k0(Lfh/m;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_1
    const/4 v2, 0x0

    .line 92
    :goto_2
    invoke-virtual {v0, v2}, Lfh/j;->k0(Lfh/m;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    iput-object v0, p0, Lfh/k;->j:Lfh/j;

    .line 97
    .line 98
    return-void
.end method

.method public static q0(Lfh/k;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lfh/a;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    invoke-virtual {v0, v1, p1}, Lfh/a;->m0(ILjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lfh/k;->i:Lfh/a;

    .line 14
    .line 15
    return-void
.end method

.method public static u0(Lfh/k;Ljava/util/Collection;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/lang/Iterable;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/String;

    .line 30
    .line 31
    new-instance v2, Lgh/c;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-direct {v2, v1, v3}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lfh/k;->k:Ljava/util/List;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final G(Lg6/b;)I
    .locals 14

    .line 1
    iget-object v0, p0, Lfh/k;->g:Lgh/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lgh/c;->G(Lg6/b;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    iget-object v2, p0, Lfh/k;->h:Lfh/a;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v2, p1}, Lfh/a;->G(Lg6/b;)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v2, v1

    .line 22
    :goto_1
    iget-object v3, p0, Lfh/k;->i:Lfh/a;

    .line 23
    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {v3, p1}, Lfh/a;->G(Lg6/b;)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    move v3, v1

    .line 32
    :goto_2
    iget-object v4, p0, Lfh/k;->j:Lfh/j;

    .line 33
    .line 34
    if-eqz v4, :cond_3

    .line 35
    .line 36
    invoke-virtual {v4, p1}, Lfh/j;->G(Lg6/b;)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move v4, v1

    .line 42
    :goto_3
    iget-object v5, p0, Lfh/k;->k:Ljava/util/List;

    .line 43
    .line 44
    if-eqz v5, :cond_5

    .line 45
    .line 46
    new-instance v6, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-static {v5}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    check-cast v7, Lgh/c;

    .line 70
    .line 71
    invoke-virtual {v7, p1}, Lgh/c;->G(Lg6/b;)I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_4
    invoke-static {v6}, Ltf/m;->O1(Ljava/util/ArrayList;)[I

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {p1, v5}, Lg6/b;->f([I)I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    goto :goto_5

    .line 92
    :cond_5
    move v5, v1

    .line 93
    :goto_5
    iget-object v6, p0, Lfh/k;->l:Ljava/util/ArrayList;

    .line 94
    .line 95
    const/4 v7, -0x1

    .line 96
    const/4 v8, 0x1

    .line 97
    if-eqz v6, :cond_a

    .line 98
    .line 99
    new-instance v9, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-static {v6}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    if-eqz v10, :cond_7

    .line 117
    .line 118
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    check-cast v10, Lgh/b;

    .line 123
    .line 124
    iget v10, v10, Lgh/b;->b:I

    .line 125
    .line 126
    if-eqz v10, :cond_6

    .line 127
    .line 128
    packed-switch v10, :pswitch_data_0

    .line 129
    .line 130
    .line 131
    const/4 p1, 0x0

    .line 132
    throw p1

    .line 133
    :pswitch_0
    const/4 v10, 0x6

    .line 134
    goto :goto_7

    .line 135
    :pswitch_1
    const/4 v10, 0x5

    .line 136
    goto :goto_7

    .line 137
    :pswitch_2
    const/4 v10, 0x4

    .line 138
    goto :goto_7

    .line 139
    :pswitch_3
    const/4 v10, 0x3

    .line 140
    goto :goto_7

    .line 141
    :pswitch_4
    const/4 v10, 0x2

    .line 142
    goto :goto_7

    .line 143
    :pswitch_5
    const/4 v10, 0x1

    .line 144
    :goto_7
    new-instance v11, Lsf/l;

    .line 145
    .line 146
    invoke-direct {v11, v10}, Lsf/l;-><init>(B)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_6
    const/4 p1, 0x0

    .line 154
    throw p1

    .line 155
    :cond_7
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    new-array v10, v6, [B

    .line 160
    .line 161
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    move v11, v1

    .line 166
    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v12

    .line 170
    if-eqz v12, :cond_8

    .line 171
    .line 172
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    check-cast v12, Lsf/l;

    .line 177
    .line 178
    iget-byte v12, v12, Lsf/l;->g:B

    .line 179
    .line 180
    add-int/lit8 v13, v11, 0x1

    .line 181
    .line 182
    aput-byte v12, v10, v11

    .line 183
    .line 184
    move v11, v13

    .line 185
    goto :goto_8

    .line 186
    :cond_8
    invoke-virtual {p1, v8, v6, v8}, Lg6/b;->o(III)V

    .line 187
    .line 188
    .line 189
    sub-int/2addr v6, v8

    .line 190
    :goto_9
    if-ge v7, v6, :cond_9

    .line 191
    .line 192
    aget-byte v9, v10, v6

    .line 193
    .line 194
    invoke-virtual {p1, v9}, Lg6/b;->a(B)V

    .line 195
    .line 196
    .line 197
    add-int/lit8 v6, v6, -0x1

    .line 198
    .line 199
    goto :goto_9

    .line 200
    :cond_9
    invoke-virtual {p1}, Lg6/b;->h()I

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    goto :goto_a

    .line 205
    :cond_a
    move v6, v1

    .line 206
    :goto_a
    iget-object v9, p0, Lfh/k;->l:Ljava/util/ArrayList;

    .line 207
    .line 208
    const/4 v10, 0x4

    .line 209
    if-eqz v9, :cond_d

    .line 210
    .line 211
    new-instance v11, Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-static {v9}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 214
    .line 215
    .line 216
    move-result v12

    .line 217
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    :goto_b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    if-eqz v12, :cond_b

    .line 229
    .line 230
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    check-cast v12, Lgh/b;

    .line 235
    .line 236
    iget-object v12, v12, Lgh/b;->a:Lfh/b;

    .line 237
    .line 238
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, p1}, Lx6/d;->G(Lg6/b;)I

    .line 242
    .line 243
    .line 244
    move-result v12

    .line 245
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v12

    .line 249
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    goto :goto_b

    .line 253
    :cond_b
    invoke-static {v11}, Ltf/m;->O1(Ljava/util/ArrayList;)[I

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    array-length v11, v9

    .line 258
    invoke-virtual {p1, v10, v11, v10}, Lg6/b;->o(III)V

    .line 259
    .line 260
    .line 261
    array-length v11, v9

    .line 262
    sub-int/2addr v11, v8

    .line 263
    :goto_c
    if-ge v7, v11, :cond_c

    .line 264
    .line 265
    aget v12, v9, v11

    .line 266
    .line 267
    invoke-virtual {p1, v12}, Lg6/b;->b(I)V

    .line 268
    .line 269
    .line 270
    add-int/lit8 v11, v11, -0x1

    .line 271
    .line 272
    goto :goto_c

    .line 273
    :cond_c
    invoke-virtual {p1}, Lg6/b;->h()I

    .line 274
    .line 275
    .line 276
    move-result v7

    .line 277
    goto :goto_d

    .line 278
    :cond_d
    move v7, v1

    .line 279
    :goto_d
    iget-object v9, p0, Lfh/k;->m:Lfh/l;

    .line 280
    .line 281
    if-eqz v9, :cond_e

    .line 282
    .line 283
    invoke-virtual {v9, p1}, Lfh/l;->G(Lg6/b;)I

    .line 284
    .line 285
    .line 286
    move-result v9

    .line 287
    goto :goto_e

    .line 288
    :cond_e
    move v9, v1

    .line 289
    :goto_e
    iget-object v11, p0, Lfh/k;->n:Lfh/l;

    .line 290
    .line 291
    if-eqz v11, :cond_f

    .line 292
    .line 293
    invoke-virtual {v11, p1}, Lfh/l;->G(Lg6/b;)I

    .line 294
    .line 295
    .line 296
    move-result v11

    .line 297
    goto :goto_f

    .line 298
    :cond_f
    move v11, v1

    .line 299
    :goto_f
    const/16 v12, 0xd

    .line 300
    .line 301
    invoke-virtual {p1, v12}, Lg6/b;->n(I)V

    .line 302
    .line 303
    .line 304
    const/16 v12, 0xc

    .line 305
    .line 306
    invoke-virtual {p1, v12, v11}, Lg6/b;->c(II)V

    .line 307
    .line 308
    .line 309
    const/16 v11, 0xb

    .line 310
    .line 311
    invoke-virtual {p1, v11, v9}, Lg6/b;->c(II)V

    .line 312
    .line 313
    .line 314
    const/16 v9, 0xa

    .line 315
    .line 316
    invoke-virtual {p1, v9, v7}, Lg6/b;->c(II)V

    .line 317
    .line 318
    .line 319
    const/16 v7, 0x9

    .line 320
    .line 321
    invoke-virtual {p1, v7, v6}, Lg6/b;->c(II)V

    .line 322
    .line 323
    .line 324
    const/16 v6, 0x8

    .line 325
    .line 326
    invoke-virtual {p1, v6, v1}, Lg6/b;->c(II)V

    .line 327
    .line 328
    .line 329
    const/4 v6, 0x7

    .line 330
    invoke-virtual {p1, v6, v5}, Lg6/b;->c(II)V

    .line 331
    .line 332
    .line 333
    const/4 v5, 0x6

    .line 334
    invoke-virtual {p1, v5, v1}, Lg6/b;->c(II)V

    .line 335
    .line 336
    .line 337
    const/4 v5, 0x5

    .line 338
    invoke-virtual {p1, v5, v1}, Lg6/b;->c(II)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {p1, v10, v4}, Lg6/b;->c(II)V

    .line 342
    .line 343
    .line 344
    const/4 v4, 0x3

    .line 345
    invoke-virtual {p1, v4, v3}, Lg6/b;->c(II)V

    .line 346
    .line 347
    .line 348
    const/4 v3, 0x2

    .line 349
    invoke-virtual {p1, v3, v2}, Lg6/b;->c(II)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {p1, v8, v1}, Lg6/b;->c(II)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {p1, v1, v0}, Lg6/b;->c(II)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {p1}, Lg6/b;->g()I

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    invoke-virtual {p1, v0}, Lg6/b;->i(I)V

    .line 363
    .line 364
    .line 365
    return v0

    .line 366
    nop

    .line 367
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final k0(Ljava/lang/Class;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lfh/k;->j:Lfh/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lfh/j;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1}, Lfh/j;-><init>(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iput-object v0, p0, Lfh/k;->j:Lfh/j;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    new-instance v1, Lfh/m;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Lfh/a;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lkh/b;->d(Ljava/lang/Class;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v3, 0x5

    .line 30
    invoke-virtual {v2, v3, p1}, Lfh/a;->m0(ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iput-object v2, v1, Lfh/m;->g:Lfh/a;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    invoke-virtual {v0, v1}, Lfh/j;->k0(Lfh/m;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final l0(ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    new-instance v0, Lfh/a;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lfh/a;->m0(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lfh/k;->h:Lfh/a;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    throw p1
.end method

.method public final m0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lfh/k;->j:Lfh/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lfh/j;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1}, Lfh/j;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lfh/k;->j:Lfh/j;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lfh/k;->j:Lfh/j;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v1, Lgh/a;

    .line 19
    .line 20
    invoke-direct {v1, p1}, Lgh/a;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, Lfh/j;->i:Lgh/a;

    .line 24
    .line 25
    return-void
.end method

.method public final varargs n0([Ljava/lang/Class;)V
    .locals 7

    .line 1
    new-instance v0, Lfh/j;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lfh/j;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, v0, Lfh/j;->h:Ljava/util/List;

    .line 15
    .line 16
    array-length v1, p1

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v1, :cond_1

    .line 19
    .line 20
    aget-object v3, p1, v2

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    new-instance v4, Lfh/m;

    .line 25
    .line 26
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v5, Lfh/a;

    .line 30
    .line 31
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {v3}, Lkh/b;->d(Ljava/lang/Class;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const/4 v6, 0x5

    .line 39
    invoke-virtual {v5, v6, v3}, Lfh/a;->m0(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iput-object v5, v4, Lfh/m;->g:Lfh/a;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    const/4 v4, 0x0

    .line 46
    :goto_1
    invoke-virtual {v0, v4}, Lfh/j;->k0(Lfh/m;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iput-object v0, p0, Lfh/k;->j:Lfh/j;

    .line 53
    .line 54
    return-void
.end method

.method public final varargs o0([Ljava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Lfh/j;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lfh/j;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, v0, Lfh/j;->h:Ljava/util/List;

    .line 15
    .line 16
    array-length v1, p1

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v1, :cond_1

    .line 19
    .line 20
    aget-object v3, p1, v2

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    new-instance v4, Lfh/m;

    .line 25
    .line 26
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {v4, v3}, Lfh/m;->k0(Lfh/m;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const/4 v4, 0x0

    .line 34
    :goto_1
    invoke-virtual {v0, v4}, Lfh/j;->k0(Lfh/m;)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iput-object v0, p0, Lfh/k;->j:Lfh/j;

    .line 41
    .line 42
    return-void
.end method

.method public final p0(Ljava/lang/Class;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lfh/a;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lkh/b;->d(Ljava/lang/Class;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v1, 0x5

    .line 14
    invoke-virtual {v0, v1, p1}, Lfh/a;->m0(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lfh/k;->i:Lfh/a;

    .line 18
    .line 19
    return-void
.end method

.method public final varargs r0([Ljava/lang/String;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, p1, v2

    .line 12
    .line 13
    new-instance v4, Lgh/c;

    .line 14
    .line 15
    const/4 v5, 0x5

    .line 16
    invoke-direct {v4, v3, v5}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lfh/k;->k:Ljava/util/List;

    .line 31
    .line 32
    return-void
.end method

.method public final varargs s0([Ljava/lang/Number;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_6

    .line 10
    .line 11
    aget-object v3, p1, v2

    .line 12
    .line 13
    new-instance v4, Lgh/b;

    .line 14
    .line 15
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    instance-of v5, v3, Ljava/lang/Byte;

    .line 22
    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Number;->byteValue()B

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    new-instance v5, Lfh/c;

    .line 30
    .line 31
    invoke-direct {v5, v3}, Lfh/c;-><init>(B)V

    .line 32
    .line 33
    .line 34
    iput-object v5, v4, Lgh/b;->a:Lfh/b;

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    iput v3, v4, Lgh/b;->b:I

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    instance-of v5, v3, Ljava/lang/Short;

    .line 41
    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Number;->shortValue()S

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    new-instance v5, Lfh/h;

    .line 49
    .line 50
    invoke-direct {v5, v3}, Lfh/h;-><init>(S)V

    .line 51
    .line 52
    .line 53
    iput-object v5, v4, Lgh/b;->a:Lfh/b;

    .line 54
    .line 55
    const/4 v3, 0x2

    .line 56
    iput v3, v4, Lgh/b;->b:I

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    instance-of v5, v3, Ljava/lang/Integer;

    .line 60
    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    new-instance v5, Lfh/f;

    .line 68
    .line 69
    invoke-direct {v5, v3}, Lfh/f;-><init>(I)V

    .line 70
    .line 71
    .line 72
    iput-object v5, v4, Lgh/b;->a:Lfh/b;

    .line 73
    .line 74
    const/4 v3, 0x3

    .line 75
    iput v3, v4, Lgh/b;->b:I

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    instance-of v5, v3, Ljava/lang/Long;

    .line 79
    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    new-instance v3, Lfh/g;

    .line 87
    .line 88
    invoke-direct {v3, v5, v6}, Lfh/g;-><init>(J)V

    .line 89
    .line 90
    .line 91
    iput-object v3, v4, Lgh/b;->a:Lfh/b;

    .line 92
    .line 93
    const/4 v3, 0x4

    .line 94
    iput v3, v4, Lgh/b;->b:I

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    instance-of v5, v3, Ljava/lang/Float;

    .line 98
    .line 99
    if-eqz v5, :cond_4

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    new-instance v5, Lfh/e;

    .line 106
    .line 107
    invoke-direct {v5, v3}, Lfh/e;-><init>(F)V

    .line 108
    .line 109
    .line 110
    iput-object v5, v4, Lgh/b;->a:Lfh/b;

    .line 111
    .line 112
    const/4 v3, 0x5

    .line 113
    iput v3, v4, Lgh/b;->b:I

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    instance-of v5, v3, Ljava/lang/Double;

    .line 117
    .line 118
    if-eqz v5, :cond_5

    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 121
    .line 122
    .line 123
    move-result-wide v5

    .line 124
    new-instance v3, Lfh/d;

    .line 125
    .line 126
    invoke-direct {v3, v5, v6}, Lfh/d;-><init>(D)V

    .line 127
    .line 128
    .line 129
    iput-object v3, v4, Lgh/b;->a:Lfh/b;

    .line 130
    .line 131
    const/4 v3, 0x6

    .line 132
    iput v3, v4, Lgh/b;->b:I

    .line 133
    .line 134
    :cond_5
    :goto_1
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    add-int/lit8 v2, v2, 0x1

    .line 138
    .line 139
    goto/16 :goto_0

    .line 140
    .line 141
    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 144
    .line 145
    .line 146
    iput-object p1, p0, Lfh/k;->l:Ljava/util/ArrayList;

    .line 147
    .line 148
    return-void
.end method

.method public final t0(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
