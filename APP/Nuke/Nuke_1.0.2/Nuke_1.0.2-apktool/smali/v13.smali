.class public final Lv13;
.super Lw92;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic j:I

.field public k:Ljava/lang/Object;

.field public l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj20;Lx22;Lnn0;Lj10;Lt00;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lv13;->j:I

    .line 3
    .line 4
    iput-object p1, p0, Lv13;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lv13;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lv13;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lv13;->p:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-direct {p0, v0, p5}, Lw92;-><init>(ILt00;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Lxk1;Lxk1;Lxk1;Lt00;I)V
    .locals 0

    .line 16
    iput p5, p0, Lv13;->j:I

    iput-object p1, p0, Lv13;->n:Ljava/lang/Object;

    iput-object p2, p0, Lv13;->o:Ljava/lang/Object;

    iput-object p3, p0, Lv13;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw92;-><init>(ILt00;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lv13;->j:I

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
    invoke-virtual {p0, p2, p1}, Lv13;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lv13;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lv13;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lv13;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lv13;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lv13;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Lv13;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lv13;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lv13;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 11

    .line 1
    iget v0, p0, Lv13;->j:I

    .line 2
    .line 3
    iget-object v1, p0, Lv13;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lv13;->o:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lv13;->n:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v4, Lv13;

    .line 13
    .line 14
    iget-object p0, p0, Lv13;->k:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v5, p0

    .line 17
    check-cast v5, Lj20;

    .line 18
    .line 19
    move-object v6, v3

    .line 20
    check-cast v6, Lx22;

    .line 21
    .line 22
    move-object v7, v2

    .line 23
    check-cast v7, Lnn0;

    .line 24
    .line 25
    move-object v8, v1

    .line 26
    check-cast v8, Lj10;

    .line 27
    .line 28
    move-object v9, p1

    .line 29
    invoke-direct/range {v4 .. v9}, Lv13;-><init>(Lj20;Lx22;Lnn0;Lj10;Lt00;)V

    .line 30
    .line 31
    .line 32
    iput-object p2, v4, Lv13;->m:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v4

    .line 35
    :pswitch_0
    move-object v9, p1

    .line 36
    new-instance v5, Lv13;

    .line 37
    .line 38
    move-object v6, v3

    .line 39
    check-cast v6, Lxk1;

    .line 40
    .line 41
    move-object v7, v2

    .line 42
    check-cast v7, Lxk1;

    .line 43
    .line 44
    move-object v8, v1

    .line 45
    check-cast v8, Lxk1;

    .line 46
    .line 47
    const/4 v10, 0x1

    .line 48
    invoke-direct/range {v5 .. v10}, Lv13;-><init>(Lxk1;Lxk1;Lxk1;Lt00;I)V

    .line 49
    .line 50
    .line 51
    iput-object p2, v5, Lv13;->m:Ljava/lang/Object;

    .line 52
    .line 53
    return-object v5

    .line 54
    :pswitch_1
    move-object v9, p1

    .line 55
    new-instance v5, Lv13;

    .line 56
    .line 57
    move-object v6, v3

    .line 58
    check-cast v6, Lxk1;

    .line 59
    .line 60
    move-object v7, v2

    .line 61
    check-cast v7, Lxk1;

    .line 62
    .line 63
    move-object v8, v1

    .line 64
    check-cast v8, Lxk1;

    .line 65
    .line 66
    const/4 v10, 0x0

    .line 67
    invoke-direct/range {v5 .. v10}, Lv13;-><init>(Lxk1;Lxk1;Lxk1;Lt00;I)V

    .line 68
    .line 69
    .line 70
    iput-object p2, v5, Lv13;->m:Ljava/lang/Object;

    .line 71
    .line 72
    return-object v5

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget v0, v5, Lv13;->j:I

    .line 4
    .line 5
    sget-object v1, Li12;->i:Li12;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    sget-object v6, La83;->a:La83;

    .line 9
    .line 10
    iget-object v3, v5, Lv13;->p:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v4, v5, Lv13;->o:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v7, v5, Lv13;->n:Ljava/lang/Object;

    .line 15
    .line 16
    const-string v8, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    sget-object v9, Lk20;->h:Lk20;

    .line 19
    .line 20
    const/4 v10, 0x1

    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    iget v0, v5, Lv13;->l:I

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    if-ne v0, v10, :cond_0

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v8}, Ls;->l(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v5, Lv13;->m:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lyw2;

    .line 45
    .line 46
    iget-object v1, v5, Lv13;->k:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lj20;

    .line 49
    .line 50
    move-object v2, v7

    .line 51
    check-cast v2, Lx22;

    .line 52
    .line 53
    check-cast v4, Lnn0;

    .line 54
    .line 55
    check-cast v3, Lj10;

    .line 56
    .line 57
    iput v10, v5, Lv13;->l:I

    .line 58
    .line 59
    move-object/from16 v16, v4

    .line 60
    .line 61
    move-object v4, v3

    .line 62
    move-object/from16 v3, v16

    .line 63
    .line 64
    invoke-static/range {v0 .. v5}, Lay2;->f(Lyw2;Lj20;Lx22;Lnn0;Lj10;Lrj;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-ne v0, v9, :cond_2

    .line 69
    .line 70
    move-object v6, v9

    .line 71
    :cond_2
    :goto_0
    return-object v6

    .line 72
    :pswitch_0
    move-object v0, v3

    .line 73
    check-cast v0, Lxk1;

    .line 74
    .line 75
    move-object v12, v4

    .line 76
    check-cast v12, Lxk1;

    .line 77
    .line 78
    move-object v13, v7

    .line 79
    check-cast v13, Lxk1;

    .line 80
    .line 81
    iget-object v3, v5, Lv13;->m:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v3, Lyw2;

    .line 84
    .line 85
    iget v4, v5, Lv13;->l:I

    .line 86
    .line 87
    if-eqz v4, :cond_5

    .line 88
    .line 89
    if-eq v4, v10, :cond_4

    .line 90
    .line 91
    if-ne v4, v2, :cond_3

    .line 92
    .line 93
    iget-object v4, v5, Lv13;->k:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v4, Lo12;

    .line 96
    .line 97
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move-object/from16 v7, p1

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_3
    invoke-static {v8}, Ls;->l(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const/4 v6, 0x0

    .line 107
    goto/16 :goto_7

    .line 108
    .line 109
    :cond_4
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    move-object/from16 v4, p1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iput-object v3, v5, Lv13;->m:Ljava/lang/Object;

    .line 119
    .line 120
    iput v10, v5, Lv13;->l:I

    .line 121
    .line 122
    invoke-static {v3, v5, v2}, Lay2;->b(Lyw2;Lrj;I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    if-ne v4, v9, :cond_6

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_6
    :goto_1
    check-cast v4, Lo12;

    .line 130
    .line 131
    invoke-virtual {v4}, Lo12;->a()V

    .line 132
    .line 133
    .line 134
    iget-wide v7, v4, Lo12;->c:J

    .line 135
    .line 136
    invoke-static {v13, v12, v0, v7, v8}, Lgf1;->m(Lxk1;Lxk1;Lxk1;J)V

    .line 137
    .line 138
    .line 139
    :goto_2
    iput-object v3, v5, Lv13;->m:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object v4, v5, Lv13;->k:Ljava/lang/Object;

    .line 142
    .line 143
    iput v2, v5, Lv13;->l:I

    .line 144
    .line 145
    invoke-virtual {v3, v1, v5}, Lyw2;->a(Li12;Lrj;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    if-ne v7, v9, :cond_7

    .line 150
    .line 151
    :goto_3
    move-object v6, v9

    .line 152
    goto :goto_7

    .line 153
    :cond_7
    :goto_4
    check-cast v7, Lh12;

    .line 154
    .line 155
    iget-object v7, v7, Lh12;->a:Ljava/util/List;

    .line 156
    .line 157
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    if-eqz v8, :cond_9

    .line 166
    .line 167
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    move-object v10, v8

    .line 172
    check-cast v10, Lo12;

    .line 173
    .line 174
    iget-wide v14, v10, Lo12;->a:J

    .line 175
    .line 176
    move-object/from16 p1, v3

    .line 177
    .line 178
    iget-wide v2, v4, Lo12;->a:J

    .line 179
    .line 180
    invoke-static {v14, v15, v2, v3}, Lup0;->s(JJ)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-eqz v2, :cond_8

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_8
    move-object/from16 v3, p1

    .line 188
    .line 189
    const/4 v2, 0x2

    .line 190
    goto :goto_5

    .line 191
    :cond_9
    move-object/from16 p1, v3

    .line 192
    .line 193
    const/4 v8, 0x0

    .line 194
    :goto_6
    check-cast v8, Lo12;

    .line 195
    .line 196
    if-nez v8, :cond_a

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_a
    iget-wide v2, v8, Lo12;->c:J

    .line 200
    .line 201
    invoke-static {v13, v12, v0, v2, v3}, Lgf1;->m(Lxk1;Lxk1;Lxk1;J)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v8}, Lo12;->a()V

    .line 205
    .line 206
    .line 207
    iget-boolean v2, v8, Lo12;->d:Z

    .line 208
    .line 209
    if-nez v2, :cond_b

    .line 210
    .line 211
    :goto_7
    return-object v6

    .line 212
    :cond_b
    move-object/from16 v3, p1

    .line 213
    .line 214
    const/4 v2, 0x2

    .line 215
    goto :goto_2

    .line 216
    :pswitch_1
    check-cast v3, Lxk1;

    .line 217
    .line 218
    check-cast v4, Lxk1;

    .line 219
    .line 220
    check-cast v7, Lxk1;

    .line 221
    .line 222
    iget-object v0, v5, Lv13;->m:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, Lyw2;

    .line 225
    .line 226
    iget v2, v5, Lv13;->l:I

    .line 227
    .line 228
    if-eqz v2, :cond_e

    .line 229
    .line 230
    if-eq v2, v10, :cond_d

    .line 231
    .line 232
    const/4 v10, 0x2

    .line 233
    if-ne v2, v10, :cond_c

    .line 234
    .line 235
    iget-object v2, v5, Lv13;->k:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v2, Lo12;

    .line 238
    .line 239
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    move-object/from16 v8, p1

    .line 243
    .line 244
    const/4 v10, 0x2

    .line 245
    goto :goto_b

    .line 246
    :cond_c
    invoke-static {v8}, Ls;->l(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    const/4 v6, 0x0

    .line 250
    goto :goto_e

    .line 251
    :cond_d
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    move-object/from16 v2, p1

    .line 255
    .line 256
    const/4 v10, 0x2

    .line 257
    goto :goto_8

    .line 258
    :cond_e
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    iput-object v0, v5, Lv13;->m:Ljava/lang/Object;

    .line 262
    .line 263
    iput v10, v5, Lv13;->l:I

    .line 264
    .line 265
    const/4 v10, 0x2

    .line 266
    invoke-static {v0, v5, v10}, Lay2;->b(Lyw2;Lrj;I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    if-ne v2, v9, :cond_f

    .line 271
    .line 272
    goto :goto_a

    .line 273
    :cond_f
    :goto_8
    check-cast v2, Lo12;

    .line 274
    .line 275
    invoke-virtual {v2}, Lo12;->a()V

    .line 276
    .line 277
    .line 278
    iget-wide v12, v2, Lo12;->c:J

    .line 279
    .line 280
    invoke-static {v7, v4, v3, v12, v13}, Lgf1;->l(Lxk1;Lxk1;Lxk1;J)V

    .line 281
    .line 282
    .line 283
    :goto_9
    iput-object v0, v5, Lv13;->m:Ljava/lang/Object;

    .line 284
    .line 285
    iput-object v2, v5, Lv13;->k:Ljava/lang/Object;

    .line 286
    .line 287
    iput v10, v5, Lv13;->l:I

    .line 288
    .line 289
    invoke-virtual {v0, v1, v5}, Lyw2;->a(Li12;Lrj;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    if-ne v8, v9, :cond_10

    .line 294
    .line 295
    :goto_a
    move-object v6, v9

    .line 296
    goto :goto_e

    .line 297
    :cond_10
    :goto_b
    check-cast v8, Lh12;

    .line 298
    .line 299
    iget-object v8, v8, Lh12;->a:Ljava/util/List;

    .line 300
    .line 301
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    :goto_c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v12

    .line 309
    if-eqz v12, :cond_12

    .line 310
    .line 311
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v12

    .line 315
    move-object v13, v12

    .line 316
    check-cast v13, Lo12;

    .line 317
    .line 318
    iget-wide v13, v13, Lo12;->a:J

    .line 319
    .line 320
    iget-wide v10, v2, Lo12;->a:J

    .line 321
    .line 322
    invoke-static {v13, v14, v10, v11}, Lup0;->s(JJ)Z

    .line 323
    .line 324
    .line 325
    move-result v10

    .line 326
    if-eqz v10, :cond_11

    .line 327
    .line 328
    goto :goto_d

    .line 329
    :cond_11
    const/4 v10, 0x2

    .line 330
    goto :goto_c

    .line 331
    :cond_12
    const/4 v12, 0x0

    .line 332
    :goto_d
    check-cast v12, Lo12;

    .line 333
    .line 334
    if-nez v12, :cond_13

    .line 335
    .line 336
    goto :goto_e

    .line 337
    :cond_13
    iget-wide v10, v12, Lo12;->c:J

    .line 338
    .line 339
    invoke-static {v7, v4, v3, v10, v11}, Lgf1;->l(Lxk1;Lxk1;Lxk1;J)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12}, Lo12;->a()V

    .line 343
    .line 344
    .line 345
    iget-boolean v8, v12, Lo12;->d:Z

    .line 346
    .line 347
    if-nez v8, :cond_14

    .line 348
    .line 349
    :goto_e
    return-object v6

    .line 350
    :cond_14
    const/4 v10, 0x2

    .line 351
    goto :goto_9

    .line 352
    nop

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
