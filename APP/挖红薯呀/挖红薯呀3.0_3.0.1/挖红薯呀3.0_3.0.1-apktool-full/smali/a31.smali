.class public final La31;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Landroid/net/Uri;Lne1;Lvb;Landroid/content/Context;Lik;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, La31;->h:I

    .line 3
    .line 4
    iput-object p1, p0, La31;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La31;->m:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La31;->n:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, La31;->o:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, La31;->p:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, Lm51;-><init>(ILik;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Li7;Lik;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La31;->h:I

    .line 19
    iput-object p1, p0, La31;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lm51;-><init>(ILik;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 9

    .line 1
    iget v0, p0, La31;->h:I

    .line 2
    .line 3
    iget-object v1, p0, La31;->p:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La31;

    .line 9
    .line 10
    iget-object v0, p0, La31;->l:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, v0

    .line 13
    check-cast v3, Landroid/content/ContentResolver;

    .line 14
    .line 15
    iget-object v0, p0, La31;->m:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v4, v0

    .line 18
    check-cast v4, Landroid/net/Uri;

    .line 19
    .line 20
    iget-object v0, p0, La31;->n:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v5, v0

    .line 23
    check-cast v5, Lne1;

    .line 24
    .line 25
    iget-object p0, p0, La31;->o:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v6, p0

    .line 28
    check-cast v6, Lvb;

    .line 29
    .line 30
    move-object v7, v1

    .line 31
    check-cast v7, Landroid/content/Context;

    .line 32
    .line 33
    move-object v8, p2

    .line 34
    invoke-direct/range {v2 .. v8}, La31;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Lne1;Lvb;Landroid/content/Context;Lik;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v2, La31;->j:Ljava/lang/Object;

    .line 38
    .line 39
    return-object v2

    .line 40
    :pswitch_0
    move-object v8, p2

    .line 41
    new-instance p0, La31;

    .line 42
    .line 43
    check-cast v1, Li7;

    .line 44
    .line 45
    invoke-direct {p0, v1, v8}, La31;-><init>(Li7;Lik;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, La31;->o:Ljava/lang/Object;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, La31;->h:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    check-cast p1, Liu;

    .line 6
    .line 7
    check-cast p2, Lik;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, La31;->g(Ljava/lang/Object;Lik;)Lik;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La31;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, La31;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La31;->g(Ljava/lang/Object;Lik;)Lik;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La31;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, La31;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object p0, Lzk;->d:Lzk;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, La31;->h:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La31;->n:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lne1;

    .line 15
    .line 16
    iget-object v6, v0, La31;->l:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v6, Landroid/content/ContentResolver;

    .line 19
    .line 20
    sget-object v7, Lzk;->d:Lzk;

    .line 21
    .line 22
    iget v8, v0, La31;->i:I

    .line 23
    .line 24
    if-eqz v8, :cond_2

    .line 25
    .line 26
    if-eq v8, v3, :cond_1

    .line 27
    .line 28
    if-ne v8, v4, :cond_0

    .line 29
    .line 30
    iget-object v2, v0, La31;->k:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Lub;

    .line 33
    .line 34
    iget-object v5, v0, La31;->j:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v5, Liu;

    .line 37
    .line 38
    :try_start_0
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    move-object v8, v2

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_1
    iget-object v2, v0, La31;->k:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Lub;

    .line 55
    .line 56
    iget-object v5, v0, La31;->j:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v5, Liu;

    .line 59
    .line 60
    :try_start_1
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    move-object v8, v2

    .line 64
    move-object/from16 v2, p1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v5, v0, La31;->j:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v5, Liu;

    .line 73
    .line 74
    iget-object v8, v0, La31;->m:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v8, Landroid/net/Uri;

    .line 77
    .line 78
    invoke-virtual {v6, v8, v2, v1}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 79
    .line 80
    .line 81
    :try_start_2
    iget-object v2, v0, La31;->o:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Lvb;

    .line 84
    .line 85
    new-instance v8, Lub;

    .line 86
    .line 87
    invoke-direct {v8, v2}, Lub;-><init>(Lvb;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    :goto_0
    iput-object v5, v0, La31;->j:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v8, v0, La31;->k:Ljava/lang/Object;

    .line 93
    .line 94
    iput v3, v0, La31;->i:I

    .line 95
    .line 96
    invoke-virtual {v8, v0}, Lub;->b(Ljk;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    if-ne v2, v7, :cond_4

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    :goto_1
    check-cast v2, Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_5

    .line 110
    .line 111
    invoke-virtual {v8}, Lub;->c()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    iget-object v2, v0, La31;->p:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v2, Landroid/content/Context;

    .line 117
    .line 118
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    const-string v9, "animator_duration_scale"

    .line 123
    .line 124
    const/high16 v10, 0x3f800000    # 1.0f

    .line 125
    .line 126
    invoke-static {v2, v9, v10}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    new-instance v9, Ljava/lang/Float;

    .line 131
    .line 132
    invoke-direct {v9, v2}, Ljava/lang/Float;-><init>(F)V

    .line 133
    .line 134
    .line 135
    iput-object v5, v0, La31;->j:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object v8, v0, La31;->k:Ljava/lang/Object;

    .line 138
    .line 139
    iput v4, v0, La31;->i:I

    .line 140
    .line 141
    invoke-interface {v5, v9, v0}, Liu;->f(Ljava/lang/Object;Lik;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 145
    if-ne v2, v7, :cond_3

    .line 146
    .line 147
    :goto_2
    move-object v5, v7

    .line 148
    goto :goto_3

    .line 149
    :cond_5
    invoke-virtual {v6, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 150
    .line 151
    .line 152
    sget-object v5, Lna1;->a:Lna1;

    .line 153
    .line 154
    :goto_3
    return-object v5

    .line 155
    :goto_4
    invoke-virtual {v6, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 156
    .line 157
    .line 158
    throw v0

    .line 159
    :pswitch_0
    sget-object v1, Lzk;->d:Lzk;

    .line 160
    .line 161
    iget v6, v0, La31;->i:I

    .line 162
    .line 163
    const/16 v7, 0x8

    .line 164
    .line 165
    const/4 v8, 0x3

    .line 166
    if-eqz v6, :cond_9

    .line 167
    .line 168
    if-eq v6, v3, :cond_8

    .line 169
    .line 170
    if-eq v6, v4, :cond_7

    .line 171
    .line 172
    if-ne v6, v8, :cond_6

    .line 173
    .line 174
    iget-object v6, v0, La31;->j:Ljava/lang/Object;

    .line 175
    .line 176
    iget-object v9, v0, La31;->n:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v9, Lyk0;

    .line 179
    .line 180
    iget-object v10, v0, La31;->m:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v10, Lmd;

    .line 183
    .line 184
    iget-object v11, v0, La31;->l:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v11, Lsw;

    .line 187
    .line 188
    iget-object v12, v0, La31;->k:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v12, Lkh0;

    .line 191
    .line 192
    iget-object v13, v0, La31;->o:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v13, Liu;

    .line 195
    .line 196
    :try_start_3
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 197
    .line 198
    .line 199
    move-object v3, v6

    .line 200
    move v6, v7

    .line 201
    move v4, v8

    .line 202
    goto/16 :goto_11

    .line 203
    .line 204
    :catchall_1
    move-exception v0

    .line 205
    goto/16 :goto_16

    .line 206
    .line 207
    :cond_6
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 208
    .line 209
    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_10

    .line 213
    .line 214
    :cond_7
    iget-object v6, v0, La31;->j:Ljava/lang/Object;

    .line 215
    .line 216
    iget-object v9, v0, La31;->n:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v9, Lyk0;

    .line 219
    .line 220
    iget-object v10, v0, La31;->m:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v10, Lmd;

    .line 223
    .line 224
    iget-object v11, v0, La31;->l:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v11, Lsw;

    .line 227
    .line 228
    iget-object v12, v0, La31;->k:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v12, Lkh0;

    .line 231
    .line 232
    iget-object v13, v0, La31;->o:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v13, Liu;

    .line 235
    .line 236
    :try_start_4
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 237
    .line 238
    .line 239
    move-object/from16 v14, p1

    .line 240
    .line 241
    goto/16 :goto_6

    .line 242
    .line 243
    :cond_8
    iget-object v6, v0, La31;->j:Ljava/lang/Object;

    .line 244
    .line 245
    iget-object v9, v0, La31;->n:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v9, Lyk0;

    .line 248
    .line 249
    iget-object v10, v0, La31;->m:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v10, Lmd;

    .line 252
    .line 253
    iget-object v11, v0, La31;->l:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v11, Lsw;

    .line 256
    .line 257
    iget-object v12, v0, La31;->k:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v12, Lkh0;

    .line 260
    .line 261
    iget-object v13, v0, La31;->o:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v13, Liu;

    .line 264
    .line 265
    :try_start_5
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 266
    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_9
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    iget-object v6, v0, La31;->o:Ljava/lang/Object;

    .line 273
    .line 274
    move-object v13, v6

    .line 275
    check-cast v13, Liu;

    .line 276
    .line 277
    new-instance v12, Lkh0;

    .line 278
    .line 279
    invoke-direct {v12}, Lkh0;-><init>()V

    .line 280
    .line 281
    .line 282
    new-instance v11, Lo;

    .line 283
    .line 284
    const/16 v6, 0x15

    .line 285
    .line 286
    invoke-direct {v11, v6, v12}, Lo;-><init>(ILjava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    const v6, 0x7fffffff

    .line 290
    .line 291
    .line 292
    const/4 v9, 0x6

    .line 293
    invoke-static {v6, v9, v5}, Lo30;->e(IILtb;)Lvb;

    .line 294
    .line 295
    .line 296
    move-result-object v10

    .line 297
    new-instance v6, Lya;

    .line 298
    .line 299
    invoke-direct {v6, v7, v10}, Lya;-><init>(ILjava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    sget-object v9, Lt21;->a:Lsx0;

    .line 303
    .line 304
    invoke-static {v9}, Lt21;->e(Lsw;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    sget-object v9, Lt21;->c:Ljava/lang/Object;

    .line 308
    .line 309
    monitor-enter v9

    .line 310
    :try_start_6
    sget-object v14, Lt21;->h:Ljava/util/List;

    .line 311
    .line 312
    invoke-static {v14, v6}, Lye;->R(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 313
    .line 314
    .line 315
    move-result-object v14

    .line 316
    sput-object v14, Lt21;->h:Ljava/util/List;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_9

    .line 317
    .line 318
    monitor-exit v9

    .line 319
    new-instance v9, Lyk0;

    .line 320
    .line 321
    invoke-direct {v9, v6}, Lyk0;-><init>(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :try_start_7
    invoke-static {}, Lt21;->j()Ll21;

    .line 325
    .line 326
    .line 327
    move-result-object v6

    .line 328
    invoke-virtual {v6, v11}, Ll21;->u(Lsw;)Ll21;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    iget-object v14, v0, La31;->p:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v14, Li7;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 335
    .line 336
    :try_start_8
    invoke-virtual {v6}, Ll21;->j()Ll21;

    .line 337
    .line 338
    .line 339
    move-result-object v15
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 340
    :try_start_9
    invoke-virtual {v14}, Li7;->invoke()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v14
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 344
    :try_start_a
    invoke-static {v15}, Ll21;->q(Ll21;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 345
    .line 346
    .line 347
    :try_start_b
    invoke-virtual {v6}, Ll21;->c()V

    .line 348
    .line 349
    .line 350
    iput-object v13, v0, La31;->o:Ljava/lang/Object;

    .line 351
    .line 352
    iput-object v12, v0, La31;->k:Ljava/lang/Object;

    .line 353
    .line 354
    iput-object v11, v0, La31;->l:Ljava/lang/Object;

    .line 355
    .line 356
    iput-object v10, v0, La31;->m:Ljava/lang/Object;

    .line 357
    .line 358
    iput-object v9, v0, La31;->n:Ljava/lang/Object;

    .line 359
    .line 360
    iput-object v14, v0, La31;->j:Ljava/lang/Object;

    .line 361
    .line 362
    iput v3, v0, La31;->i:I

    .line 363
    .line 364
    invoke-interface {v13, v14, v0}, Liu;->f(Ljava/lang/Object;Lik;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    if-ne v6, v1, :cond_a

    .line 369
    .line 370
    goto/16 :goto_f

    .line 371
    .line 372
    :cond_a
    move-object v6, v14

    .line 373
    :goto_5
    iput-object v13, v0, La31;->o:Ljava/lang/Object;

    .line 374
    .line 375
    iput-object v12, v0, La31;->k:Ljava/lang/Object;

    .line 376
    .line 377
    iput-object v11, v0, La31;->l:Ljava/lang/Object;

    .line 378
    .line 379
    iput-object v10, v0, La31;->m:Ljava/lang/Object;

    .line 380
    .line 381
    iput-object v9, v0, La31;->n:Ljava/lang/Object;

    .line 382
    .line 383
    iput-object v6, v0, La31;->j:Ljava/lang/Object;

    .line 384
    .line 385
    iput v4, v0, La31;->i:I

    .line 386
    .line 387
    invoke-interface {v10, v0}, Lmd;->m(Lm51;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v14

    .line 391
    if-ne v14, v1, :cond_b

    .line 392
    .line 393
    goto/16 :goto_f

    .line 394
    .line 395
    :cond_b
    :goto_6
    check-cast v14, Ljava/util/Set;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 396
    .line 397
    move v15, v2

    .line 398
    :goto_7
    if-nez v15, :cond_12

    .line 399
    .line 400
    :try_start_c
    iget-object v15, v12, Lkh0;->b:[Ljava/lang/Object;

    .line 401
    .line 402
    iget-object v2, v12, Lkh0;->a:[J

    .line 403
    .line 404
    array-length v3, v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 405
    sub-int/2addr v3, v4

    .line 406
    if-ltz v3, :cond_10

    .line 407
    .line 408
    move-object/from16 p1, v9

    .line 409
    .line 410
    const/4 v4, 0x0

    .line 411
    :goto_8
    :try_start_d
    aget-wide v8, v2, v4

    .line 412
    .line 413
    move-object/from16 v16, v6

    .line 414
    .line 415
    not-long v5, v8

    .line 416
    const/16 v17, 0x7

    .line 417
    .line 418
    shl-long v5, v5, v17

    .line 419
    .line 420
    and-long/2addr v5, v8

    .line 421
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    and-long v5, v5, v17

    .line 427
    .line 428
    cmp-long v5, v5, v17

    .line 429
    .line 430
    if-eqz v5, :cond_f

    .line 431
    .line 432
    sub-int v5, v4, v3

    .line 433
    .line 434
    not-int v5, v5

    .line 435
    ushr-int/lit8 v5, v5, 0x1f

    .line 436
    .line 437
    rsub-int/lit8 v5, v5, 0x8

    .line 438
    .line 439
    const/4 v6, 0x0

    .line 440
    :goto_9
    if-ge v6, v5, :cond_e

    .line 441
    .line 442
    const-wide/16 v17, 0xff

    .line 443
    .line 444
    and-long v17, v8, v17

    .line 445
    .line 446
    const-wide/16 v19, 0x80

    .line 447
    .line 448
    cmp-long v17, v17, v19

    .line 449
    .line 450
    if-gez v17, :cond_c

    .line 451
    .line 452
    shl-int/lit8 v17, v4, 0x3

    .line 453
    .line 454
    add-int v17, v17, v6

    .line 455
    .line 456
    move/from16 v18, v7

    .line 457
    .line 458
    aget-object v7, v15, v17

    .line 459
    .line 460
    invoke-interface {v14, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v7

    .line 464
    if-eqz v7, :cond_d

    .line 465
    .line 466
    move/from16 v6, v18

    .line 467
    .line 468
    goto :goto_c

    .line 469
    :cond_c
    move/from16 v18, v7

    .line 470
    .line 471
    :cond_d
    shr-long v8, v8, v18

    .line 472
    .line 473
    add-int/lit8 v6, v6, 0x1

    .line 474
    .line 475
    move/from16 v7, v18

    .line 476
    .line 477
    goto :goto_9

    .line 478
    :cond_e
    move v6, v7

    .line 479
    if-ne v5, v6, :cond_11

    .line 480
    .line 481
    goto :goto_a

    .line 482
    :cond_f
    move v6, v7

    .line 483
    :goto_a
    if-eq v4, v3, :cond_11

    .line 484
    .line 485
    add-int/lit8 v4, v4, 0x1

    .line 486
    .line 487
    move v7, v6

    .line 488
    move-object/from16 v6, v16

    .line 489
    .line 490
    const/4 v5, 0x0

    .line 491
    goto :goto_8

    .line 492
    :cond_10
    move-object/from16 v16, v6

    .line 493
    .line 494
    move v6, v7

    .line 495
    move-object/from16 p1, v9

    .line 496
    .line 497
    :cond_11
    const/4 v15, 0x0

    .line 498
    goto :goto_d

    .line 499
    :catchall_2
    move-exception v0

    .line 500
    move-object/from16 p1, v9

    .line 501
    .line 502
    :goto_b
    move-object/from16 v9, p1

    .line 503
    .line 504
    goto/16 :goto_16

    .line 505
    .line 506
    :cond_12
    move-object/from16 v16, v6

    .line 507
    .line 508
    move v6, v7

    .line 509
    move-object/from16 p1, v9

    .line 510
    .line 511
    :goto_c
    const/4 v15, 0x1

    .line 512
    :goto_d
    invoke-interface {v10}, Lmd;->q()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    instance-of v3, v2, Lvd;

    .line 517
    .line 518
    if-nez v3, :cond_13

    .line 519
    .line 520
    goto :goto_e

    .line 521
    :cond_13
    const/4 v2, 0x0

    .line 522
    :goto_e
    move-object v14, v2

    .line 523
    check-cast v14, Ljava/util/Set;

    .line 524
    .line 525
    if-nez v14, :cond_17

    .line 526
    .line 527
    if-eqz v15, :cond_16

    .line 528
    .line 529
    invoke-virtual {v12}, Lkh0;->b()V

    .line 530
    .line 531
    .line 532
    invoke-static {}, Lt21;->j()Ll21;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    invoke-virtual {v2, v11}, Ll21;->u(Lsw;)Ll21;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    iget-object v3, v0, La31;->p:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v3, Li7;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 543
    .line 544
    :try_start_e
    invoke-virtual {v2}, Ll21;->j()Ll21;

    .line 545
    .line 546
    .line 547
    move-result-object v4
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 548
    :try_start_f
    invoke-virtual {v3}, Li7;->invoke()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 552
    :try_start_10
    invoke-static {v4}, Ll21;->q(Ll21;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 553
    .line 554
    .line 555
    :try_start_11
    invoke-virtual {v2}, Ll21;->c()V

    .line 556
    .line 557
    .line 558
    move-object/from16 v2, v16

    .line 559
    .line 560
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v4

    .line 564
    if-nez v4, :cond_15

    .line 565
    .line 566
    iput-object v13, v0, La31;->o:Ljava/lang/Object;

    .line 567
    .line 568
    iput-object v12, v0, La31;->k:Ljava/lang/Object;

    .line 569
    .line 570
    iput-object v11, v0, La31;->l:Ljava/lang/Object;

    .line 571
    .line 572
    iput-object v10, v0, La31;->m:Ljava/lang/Object;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 573
    .line 574
    move-object/from16 v9, p1

    .line 575
    .line 576
    :try_start_12
    iput-object v9, v0, La31;->n:Ljava/lang/Object;

    .line 577
    .line 578
    iput-object v3, v0, La31;->j:Ljava/lang/Object;

    .line 579
    .line 580
    const/4 v4, 0x3

    .line 581
    iput v4, v0, La31;->i:I

    .line 582
    .line 583
    invoke-interface {v13, v3, v0}, Liu;->f(Ljava/lang/Object;Lik;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 587
    if-ne v2, v1, :cond_14

    .line 588
    .line 589
    :goto_f
    move-object v5, v1

    .line 590
    :goto_10
    return-object v5

    .line 591
    :cond_14
    :goto_11
    move v8, v4

    .line 592
    move v7, v6

    .line 593
    const/4 v2, 0x0

    .line 594
    const/4 v4, 0x2

    .line 595
    const/4 v5, 0x0

    .line 596
    move-object v6, v3

    .line 597
    const/4 v3, 0x1

    .line 598
    goto/16 :goto_5

    .line 599
    .line 600
    :catchall_3
    move-exception v0

    .line 601
    goto :goto_b

    .line 602
    :cond_15
    :goto_12
    move-object/from16 v9, p1

    .line 603
    .line 604
    const/4 v4, 0x3

    .line 605
    goto :goto_14

    .line 606
    :catchall_4
    move-exception v0

    .line 607
    move-object/from16 v9, p1

    .line 608
    .line 609
    goto :goto_13

    .line 610
    :catchall_5
    move-exception v0

    .line 611
    move-object/from16 v9, p1

    .line 612
    .line 613
    :try_start_13
    invoke-static {v4}, Ll21;->q(Ll21;)V

    .line 614
    .line 615
    .line 616
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 617
    :catchall_6
    move-exception v0

    .line 618
    :goto_13
    :try_start_14
    invoke-virtual {v2}, Ll21;->c()V

    .line 619
    .line 620
    .line 621
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    .line 622
    :cond_16
    move-object/from16 v2, v16

    .line 623
    .line 624
    goto :goto_12

    .line 625
    :goto_14
    move v8, v4

    .line 626
    move v7, v6

    .line 627
    const/4 v3, 0x1

    .line 628
    const/4 v4, 0x2

    .line 629
    const/4 v5, 0x0

    .line 630
    move-object v6, v2

    .line 631
    const/4 v2, 0x0

    .line 632
    goto/16 :goto_5

    .line 633
    .line 634
    :cond_17
    move-object/from16 v9, p1

    .line 635
    .line 636
    move v7, v6

    .line 637
    move-object/from16 v6, v16

    .line 638
    .line 639
    const/4 v2, 0x0

    .line 640
    const/4 v3, 0x1

    .line 641
    const/4 v4, 0x2

    .line 642
    const/4 v5, 0x0

    .line 643
    const/4 v8, 0x3

    .line 644
    goto/16 :goto_7

    .line 645
    .line 646
    :catchall_7
    move-exception v0

    .line 647
    goto :goto_15

    .line 648
    :catchall_8
    move-exception v0

    .line 649
    :try_start_15
    invoke-static {v15}, Ll21;->q(Ll21;)V

    .line 650
    .line 651
    .line 652
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_7

    .line 653
    :goto_15
    :try_start_16
    invoke-virtual {v6}, Ll21;->c()V

    .line 654
    .line 655
    .line 656
    throw v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_1

    .line 657
    :goto_16
    invoke-virtual {v9}, Lyk0;->a()V

    .line 658
    .line 659
    .line 660
    throw v0

    .line 661
    :catchall_9
    move-exception v0

    .line 662
    monitor-exit v9

    .line 663
    throw v0

    .line 664
    nop

    .line 665
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
