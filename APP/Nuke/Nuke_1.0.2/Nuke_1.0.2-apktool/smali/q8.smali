.class public final Lq8;
.super Lw92;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic j:I

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lt00;I)V
    .locals 0

    .line 1
    iput p3, p0, Lq8;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lq8;->m:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lw92;-><init>(ILt00;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lq8;->j:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    check-cast p1, Lyw2;

    .line 6
    .line 7
    check-cast p2, Lt00;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lq8;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lq8;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lq8;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object p0, Lk20;->h:Lk20;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lq8;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lq8;

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lq8;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Lq8;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Lq8;

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Lq8;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 2

    .line 1
    iget v0, p0, Lq8;->j:I

    .line 2
    .line 3
    iget-object p0, p0, Lq8;->m:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lq8;

    .line 9
    .line 10
    check-cast p0, Ln10;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lq8;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 14
    .line 15
    .line 16
    iput-object p2, v0, Lq8;->l:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, Lq8;

    .line 20
    .line 21
    check-cast p0, Lin0;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-direct {v0, p0, p1, v1}, Lq8;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 25
    .line 26
    .line 27
    iput-object p2, v0, Lq8;->l:Ljava/lang/Object;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance v0, Lq8;

    .line 31
    .line 32
    check-cast p0, Ls8;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {v0, p0, p1, v1}, Lq8;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 36
    .line 37
    .line 38
    iput-object p2, v0, Lq8;->l:Ljava/lang/Object;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lq8;->j:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    sget-object v2, Li12;->i:Li12;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    iget-object v4, p0, Lq8;->m:Ljava/lang/Object;

    .line 9
    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    sget-object v6, Lk20;->h:Lk20;

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget v0, p0, Lq8;->k:I

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    if-ne v0, v7, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lq8;->l:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lyw2;

    .line 28
    .line 29
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v6, v8

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lq8;->l:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lyw2;

    .line 44
    .line 45
    move-object v0, p1

    .line 46
    :goto_0
    iput-object v0, p0, Lq8;->l:Ljava/lang/Object;

    .line 47
    .line 48
    iput v7, p0, Lq8;->k:I

    .line 49
    .line 50
    sget-object p1, Li12;->h:Li12;

    .line 51
    .line 52
    invoke-virtual {v0, p1, p0}, Lyw2;->a(Li12;Lrj;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v6, :cond_2

    .line 57
    .line 58
    :goto_1
    return-object v6

    .line 59
    :cond_2
    :goto_2
    check-cast p1, Lh12;

    .line 60
    .line 61
    move-object v1, v4

    .line 62
    check-cast v1, Ln10;

    .line 63
    .line 64
    invoke-static {p1}, Ldn2;->a(Lh12;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    xor-int/2addr p1, v7

    .line 69
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v1, p1}, Ln10;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_0
    iget v0, p0, Lq8;->k:I

    .line 78
    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    if-eq v0, v7, :cond_4

    .line 82
    .line 83
    if-ne v0, v3, :cond_3

    .line 84
    .line 85
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_3
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    move-object v1, v8

    .line 93
    goto :goto_6

    .line 94
    :cond_4
    iget-object v0, p0, Lq8;->l:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lyw2;

    .line 97
    .line 98
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, p0, Lq8;->l:Ljava/lang/Object;

    .line 106
    .line 107
    move-object v0, p1

    .line 108
    check-cast v0, Lyw2;

    .line 109
    .line 110
    iput-object v0, p0, Lq8;->l:Ljava/lang/Object;

    .line 111
    .line 112
    iput v7, p0, Lq8;->k:I

    .line 113
    .line 114
    invoke-static {v0, p0}, Lrg3;->i(Lyw2;Lrj;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-ne p1, v6, :cond_6

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_6
    :goto_3
    check-cast p1, Lo12;

    .line 122
    .line 123
    invoke-virtual {p1}, Lo12;->a()V

    .line 124
    .line 125
    .line 126
    check-cast v4, Lin0;

    .line 127
    .line 128
    iget-wide v9, p1, Lo12;->c:J

    .line 129
    .line 130
    new-instance p1, Lrs1;

    .line 131
    .line 132
    invoke-direct {p1, v9, v10}, Lrs1;-><init>(J)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v4, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    iput-object v8, p0, Lq8;->l:Ljava/lang/Object;

    .line 139
    .line 140
    iput v3, p0, Lq8;->k:I

    .line 141
    .line 142
    invoke-static {v0, v2, p0}, Lay2;->h(Lyw2;Li12;Lrj;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-ne p1, v6, :cond_7

    .line 147
    .line 148
    :goto_4
    move-object v1, v6

    .line 149
    goto :goto_6

    .line 150
    :cond_7
    :goto_5
    check-cast p1, Lo12;

    .line 151
    .line 152
    if-eqz p1, :cond_8

    .line 153
    .line 154
    invoke-virtual {p1}, Lo12;->a()V

    .line 155
    .line 156
    .line 157
    :cond_8
    :goto_6
    return-object v1

    .line 158
    :pswitch_1
    check-cast v4, Ls8;

    .line 159
    .line 160
    iget v0, p0, Lq8;->k:I

    .line 161
    .line 162
    if-eqz v0, :cond_b

    .line 163
    .line 164
    if-eq v0, v7, :cond_a

    .line 165
    .line 166
    if-ne v0, v3, :cond_9

    .line 167
    .line 168
    iget-object v0, p0, Lq8;->l:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, Lyw2;

    .line 171
    .line 172
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_9

    .line 176
    :cond_9
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    move-object v1, v8

    .line 180
    goto/16 :goto_d

    .line 181
    .line 182
    :cond_a
    iget-object v0, p0, Lq8;->l:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v0, Lyw2;

    .line 185
    .line 186
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_b
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iget-object p1, p0, Lq8;->l:Ljava/lang/Object;

    .line 194
    .line 195
    move-object v0, p1

    .line 196
    check-cast v0, Lyw2;

    .line 197
    .line 198
    iput-object v0, p0, Lq8;->l:Ljava/lang/Object;

    .line 199
    .line 200
    iput v7, p0, Lq8;->k:I

    .line 201
    .line 202
    invoke-static {v0, p0, v3}, Lay2;->b(Lyw2;Lrj;I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    if-ne p1, v6, :cond_c

    .line 207
    .line 208
    goto :goto_8

    .line 209
    :cond_c
    :goto_7
    check-cast p1, Lo12;

    .line 210
    .line 211
    iget-wide v9, p1, Lo12;->a:J

    .line 212
    .line 213
    iput-wide v9, v4, Ls8;->h:J

    .line 214
    .line 215
    iget-wide v9, p1, Lo12;->c:J

    .line 216
    .line 217
    iput-wide v9, v4, Ls8;->b:J

    .line 218
    .line 219
    :cond_d
    iput-object v0, p0, Lq8;->l:Ljava/lang/Object;

    .line 220
    .line 221
    iput v3, p0, Lq8;->k:I

    .line 222
    .line 223
    invoke-virtual {v0, v2, p0}, Lyw2;->a(Li12;Lrj;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    if-ne p1, v6, :cond_e

    .line 228
    .line 229
    :goto_8
    move-object v1, v6

    .line 230
    goto :goto_d

    .line 231
    :cond_e
    :goto_9
    check-cast p1, Lh12;

    .line 232
    .line 233
    iget-object p1, p1, Lh12;->a:Ljava/util/List;

    .line 234
    .line 235
    new-instance v5, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 242
    .line 243
    .line 244
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    const/4 v9, 0x0

    .line 249
    move v10, v9

    .line 250
    :goto_a
    if-ge v10, v7, :cond_10

    .line 251
    .line 252
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v11

    .line 256
    move-object v12, v11

    .line 257
    check-cast v12, Lo12;

    .line 258
    .line 259
    iget-boolean v12, v12, Lo12;->d:Z

    .line 260
    .line 261
    if-eqz v12, :cond_f

    .line 262
    .line 263
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    :cond_f
    add-int/lit8 v10, v10, 0x1

    .line 267
    .line 268
    goto :goto_a

    .line 269
    :cond_10
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    :goto_b
    if-ge v9, p1, :cond_12

    .line 274
    .line 275
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    move-object v10, v7

    .line 280
    check-cast v10, Lo12;

    .line 281
    .line 282
    iget-wide v10, v10, Lo12;->a:J

    .line 283
    .line 284
    iget-wide v12, v4, Ls8;->h:J

    .line 285
    .line 286
    invoke-static {v10, v11, v12, v13}, Lup0;->s(JJ)Z

    .line 287
    .line 288
    .line 289
    move-result v10

    .line 290
    if-eqz v10, :cond_11

    .line 291
    .line 292
    goto :goto_c

    .line 293
    :cond_11
    add-int/lit8 v9, v9, 0x1

    .line 294
    .line 295
    goto :goto_b

    .line 296
    :cond_12
    move-object v7, v8

    .line 297
    :goto_c
    check-cast v7, Lo12;

    .line 298
    .line 299
    if-nez v7, :cond_13

    .line 300
    .line 301
    invoke-static {v5}, Ldu;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    move-object v7, p1

    .line 306
    check-cast v7, Lo12;

    .line 307
    .line 308
    :cond_13
    if-eqz v7, :cond_14

    .line 309
    .line 310
    iget-wide v9, v7, Lo12;->a:J

    .line 311
    .line 312
    iput-wide v9, v4, Ls8;->h:J

    .line 313
    .line 314
    iget-wide v9, v7, Lo12;->c:J

    .line 315
    .line 316
    iput-wide v9, v4, Ls8;->b:J

    .line 317
    .line 318
    :cond_14
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 319
    .line 320
    .line 321
    move-result p1

    .line 322
    if-eqz p1, :cond_d

    .line 323
    .line 324
    const-wide/16 p0, -0x1

    .line 325
    .line 326
    iput-wide p0, v4, Ls8;->h:J

    .line 327
    .line 328
    :goto_d
    return-object v1

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
