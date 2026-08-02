.class public final Lw42;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Lcom/dokar/quickjs/QuickJs;

.field public o:J

.field public p:I

.field public final synthetic q:Lmn0;

.field public final synthetic r:[Ljava/lang/Object;

.field public final synthetic s:Lcom/dokar/quickjs/QuickJs;

.field public final synthetic t:J

.field public final synthetic u:J


# direct methods
.method public constructor <init>(Lmn0;[Ljava/lang/Object;Lcom/dokar/quickjs/QuickJs;JJLt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw42;->q:Lmn0;

    .line 2
    .line 3
    iput-object p2, p0, Lw42;->r:[Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lw42;->s:Lcom/dokar/quickjs/QuickJs;

    .line 6
    .line 7
    iput-wide p4, p0, Lw42;->t:J

    .line 8
    .line 9
    iput-wide p6, p0, Lw42;->u:J

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p8}, Ltw2;-><init>(ILt00;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lj20;

    .line 2
    .line 3
    check-cast p2, Lt00;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lw42;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lw42;

    .line 10
    .line 11
    sget-object p1, La83;->a:La83;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lw42;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 9

    .line 1
    new-instance v0, Lw42;

    .line 2
    .line 3
    iget-wide v4, p0, Lw42;->t:J

    .line 4
    .line 5
    iget-wide v6, p0, Lw42;->u:J

    .line 6
    .line 7
    iget-object v1, p0, Lw42;->q:Lmn0;

    .line 8
    .line 9
    iget-object v2, p0, Lw42;->r:[Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v3, p0, Lw42;->s:Lcom/dokar/quickjs/QuickJs;

    .line 12
    .line 13
    move-object v8, p1

    .line 14
    invoke-direct/range {v0 .. v8}, Lw42;-><init>(Lmn0;[Ljava/lang/Object;Lcom/dokar/quickjs/QuickJs;JJLt00;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lw42;->p:I

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object v6, v1, Lw42;->s:Lcom/dokar/quickjs/QuickJs;

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    sget-object v8, Lk20;->h:Lk20;

    .line 13
    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    if-eq v0, v5, :cond_4

    .line 17
    .line 18
    if-eq v0, v4, :cond_3

    .line 19
    .line 20
    if-eq v0, v3, :cond_2

    .line 21
    .line 22
    if-ne v0, v2, :cond_1

    .line 23
    .line 24
    iget-object v0, v1, Lw42;->m:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v6, v0

    .line 27
    check-cast v6, Lcom/dokar/quickjs/QuickJs;

    .line 28
    .line 29
    iget-object v0, v1, Lw42;->l:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lil1;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    move-object v1, v0

    .line 37
    goto/16 :goto_a

    .line 38
    .line 39
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v7

    .line 45
    :cond_2
    iget-wide v3, v1, Lw42;->o:J

    .line 46
    .line 47
    iget-object v0, v1, Lw42;->n:Lcom/dokar/quickjs/QuickJs;

    .line 48
    .line 49
    iget-object v5, v1, Lw42;->m:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, Lil1;

    .line 52
    .line 53
    iget-object v9, v1, Lw42;->l:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v9, Ljava/lang/Throwable;

    .line 56
    .line 57
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object v10, v0

    .line 61
    move-wide v15, v3

    .line 62
    goto/16 :goto_6

    .line 63
    .line 64
    :cond_3
    iget-wide v4, v1, Lw42;->o:J

    .line 65
    .line 66
    iget-object v0, v1, Lw42;->n:Lcom/dokar/quickjs/QuickJs;

    .line 67
    .line 68
    iget-object v9, v1, Lw42;->m:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v9, Lil1;

    .line 71
    .line 72
    iget-object v10, v1, Lw42;->l:Ljava/lang/Object;

    .line 73
    .line 74
    :try_start_0
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object v11, v0

    .line 78
    move-wide/from16 v16, v4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    move-object v9, v0

    .line 83
    goto/16 :goto_5

    .line 84
    .line 85
    :cond_4
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    move-object/from16 v0, p1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :try_start_1
    iget-object v0, v1, Lw42;->q:Lmn0;

    .line 95
    .line 96
    iget-object v9, v1, Lw42;->r:[Ljava/lang/Object;

    .line 97
    .line 98
    array-length v10, v9

    .line 99
    invoke-static {v4, v10}, Lci0;->X(II)Lc11;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v10}, Lc11;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    if-eqz v11, :cond_6

    .line 111
    .line 112
    const/4 v10, 0x0

    .line 113
    invoke-static {v9, v10, v10}, Lmg;->h0([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    goto :goto_0

    .line 118
    :cond_6
    iget v11, v10, La11;->h:I

    .line 119
    .line 120
    iget v10, v10, La11;->i:I

    .line 121
    .line 122
    add-int/2addr v10, v5

    .line 123
    invoke-static {v9, v11, v10}, Lmg;->h0([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    :goto_0
    iput v5, v1, Lw42;->p:I

    .line 128
    .line 129
    invoke-interface {v0, v9, v1}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    if-ne v0, v8, :cond_7

    .line 134
    .line 135
    goto/16 :goto_9

    .line 136
    .line 137
    :cond_7
    :goto_1
    invoke-static {v6}, Lcom/dokar/quickjs/QuickJs;->access$getJsMutex$p(Lcom/dokar/quickjs/QuickJs;)Lil1;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    iget-wide v9, v1, Lw42;->t:J

    .line 142
    .line 143
    iput-object v0, v1, Lw42;->l:Ljava/lang/Object;

    .line 144
    .line 145
    iput-object v5, v1, Lw42;->m:Ljava/lang/Object;

    .line 146
    .line 147
    iput-object v6, v1, Lw42;->n:Lcom/dokar/quickjs/QuickJs;

    .line 148
    .line 149
    iput-wide v9, v1, Lw42;->o:J

    .line 150
    .line 151
    iput v4, v1, Lw42;->p:I

    .line 152
    .line 153
    move-object v4, v5

    .line 154
    check-cast v4, Lkl1;

    .line 155
    .line 156
    invoke-virtual {v4, v1}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    if-ne v5, v8, :cond_8

    .line 161
    .line 162
    goto/16 :goto_9

    .line 163
    .line 164
    :cond_8
    move-object v11, v6

    .line 165
    move-wide/from16 v16, v9

    .line 166
    .line 167
    move-object v10, v0

    .line 168
    move-object v9, v4

    .line 169
    :goto_2
    :try_start_2
    invoke-virtual {v11}, Lcom/dokar/quickjs/QuickJs;->isClosed()Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-nez v0, :cond_9

    .line 174
    .line 175
    invoke-static {v11}, Lcom/dokar/quickjs/QuickJs;->access$getContext$p(Lcom/dokar/quickjs/QuickJs;)J

    .line 176
    .line 177
    .line 178
    move-result-wide v12

    .line 179
    invoke-static {v11}, Lcom/dokar/quickjs/QuickJs;->access$getGlobals$p(Lcom/dokar/quickjs/QuickJs;)J

    .line 180
    .line 181
    .line 182
    move-result-wide v14

    .line 183
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v18

    .line 187
    invoke-static/range {v11 .. v18}, Lcom/dokar/quickjs/QuickJs;->access$invokeJsFunction(Lcom/dokar/quickjs/QuickJs;JJJ[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :catchall_1
    move-exception v0

    .line 192
    goto :goto_4

    .line 193
    :cond_9
    :goto_3
    :try_start_3
    check-cast v9, Lkl1;

    .line 194
    .line 195
    invoke-virtual {v9, v7}, Lkl1;->f(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto :goto_8

    .line 199
    :goto_4
    check-cast v9, Lkl1;

    .line 200
    .line 201
    invoke-virtual {v9, v7}, Lkl1;->f(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 205
    :goto_5
    invoke-static {v6}, Lcom/dokar/quickjs/QuickJs;->access$getJsMutex$p(Lcom/dokar/quickjs/QuickJs;)Lil1;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    iput-object v9, v1, Lw42;->l:Ljava/lang/Object;

    .line 210
    .line 211
    iput-object v0, v1, Lw42;->m:Ljava/lang/Object;

    .line 212
    .line 213
    iput-object v6, v1, Lw42;->n:Lcom/dokar/quickjs/QuickJs;

    .line 214
    .line 215
    iget-wide v4, v1, Lw42;->u:J

    .line 216
    .line 217
    iput-wide v4, v1, Lw42;->o:J

    .line 218
    .line 219
    iput v3, v1, Lw42;->p:I

    .line 220
    .line 221
    check-cast v0, Lkl1;

    .line 222
    .line 223
    invoke-virtual {v0, v1}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    if-ne v3, v8, :cond_a

    .line 228
    .line 229
    goto :goto_9

    .line 230
    :cond_a
    move-wide v15, v4

    .line 231
    move-object v10, v6

    .line 232
    move-object v5, v0

    .line 233
    :goto_6
    :try_start_4
    invoke-virtual {v10}, Lcom/dokar/quickjs/QuickJs;->isClosed()Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-nez v0, :cond_b

    .line 238
    .line 239
    invoke-static {v10}, Lcom/dokar/quickjs/QuickJs;->access$getContext$p(Lcom/dokar/quickjs/QuickJs;)J

    .line 240
    .line 241
    .line 242
    move-result-wide v11

    .line 243
    invoke-static {v10}, Lcom/dokar/quickjs/QuickJs;->access$getGlobals$p(Lcom/dokar/quickjs/QuickJs;)J

    .line 244
    .line 245
    .line 246
    move-result-wide v13

    .line 247
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v17

    .line 251
    invoke-static/range {v10 .. v17}, Lcom/dokar/quickjs/QuickJs;->access$invokeJsFunction(Lcom/dokar/quickjs/QuickJs;JJJ[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 252
    .line 253
    .line 254
    goto :goto_7

    .line 255
    :catchall_2
    move-exception v0

    .line 256
    goto :goto_d

    .line 257
    :cond_b
    :goto_7
    check-cast v5, Lkl1;

    .line 258
    .line 259
    invoke-virtual {v5, v7}, Lkl1;->f(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :goto_8
    invoke-static {v6}, Lcom/dokar/quickjs/QuickJs;->access$getJsMutex$p(Lcom/dokar/quickjs/QuickJs;)Lil1;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    iput-object v0, v1, Lw42;->l:Ljava/lang/Object;

    .line 267
    .line 268
    iput-object v6, v1, Lw42;->m:Ljava/lang/Object;

    .line 269
    .line 270
    iput-object v7, v1, Lw42;->n:Lcom/dokar/quickjs/QuickJs;

    .line 271
    .line 272
    iput v2, v1, Lw42;->p:I

    .line 273
    .line 274
    check-cast v0, Lkl1;

    .line 275
    .line 276
    invoke-virtual {v0, v1}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    if-ne v1, v8, :cond_0

    .line 281
    .line 282
    :goto_9
    return-object v8

    .line 283
    :goto_a
    :try_start_5
    invoke-virtual {v6}, Lcom/dokar/quickjs/QuickJs;->isClosed()Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-nez v0, :cond_d

    .line 288
    .line 289
    :cond_c
    invoke-static {v6}, Lcom/dokar/quickjs/QuickJs;->access$getContext$p(Lcom/dokar/quickjs/QuickJs;)J

    .line 290
    .line 291
    .line 292
    move-result-wide v2

    .line 293
    invoke-static {v6}, Lcom/dokar/quickjs/QuickJs;->access$getGlobals$p(Lcom/dokar/quickjs/QuickJs;)J

    .line 294
    .line 295
    .line 296
    move-result-wide v4

    .line 297
    invoke-static {v6, v2, v3, v4, v5}, Lcom/dokar/quickjs/QuickJs;->access$executePendingJob(Lcom/dokar/quickjs/QuickJs;JJ)Z

    .line 298
    .line 299
    .line 300
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 301
    if-nez v0, :cond_c

    .line 302
    .line 303
    goto :goto_b

    .line 304
    :catchall_3
    move-exception v0

    .line 305
    goto :goto_c

    .line 306
    :cond_d
    :goto_b
    check-cast v1, Lkl1;

    .line 307
    .line 308
    invoke-virtual {v1, v7}, Lkl1;->f(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    sget-object v0, La83;->a:La83;

    .line 312
    .line 313
    return-object v0

    .line 314
    :goto_c
    check-cast v1, Lkl1;

    .line 315
    .line 316
    invoke-virtual {v1, v7}, Lkl1;->f(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    throw v0

    .line 320
    :goto_d
    check-cast v5, Lkl1;

    .line 321
    .line 322
    invoke-virtual {v5, v7}, Lkl1;->f(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    throw v0
.end method
