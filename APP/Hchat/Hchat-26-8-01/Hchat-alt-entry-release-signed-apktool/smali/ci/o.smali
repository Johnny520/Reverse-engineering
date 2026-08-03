.class public final Lci/o;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:Lgg/t;

.field public j:I

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:F


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;FLwf/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lci/o;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lci/o;->l:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Lci/o;->m:F

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 4

    .line 1
    iget v0, p0, Lci/o;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lci/o;

    .line 7
    .line 8
    iget-object v1, p0, Lci/o;->l:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lci/e0;

    .line 11
    .line 12
    iget v2, p0, Lci/o;->m:F

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    invoke-direct {v0, v1, v2, p2, v3}, Lci/o;-><init>(Ljava/lang/Object;FLwf/c;I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, Lci/o;->k:Ljava/lang/Object;

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    new-instance v0, Lci/o;

    .line 22
    .line 23
    iget-object v1, p0, Lci/o;->l:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lci/p;

    .line 26
    .line 27
    iget v2, p0, Lci/o;->m:F

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-direct {v0, v1, v2, p2, v3}, Lci/o;-><init>(Ljava/lang/Object;FLwf/c;I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, v0, Lci/o;->k:Ljava/lang/Object;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_1
    new-instance v0, Lci/o;

    .line 37
    .line 38
    iget-object v1, p0, Lci/o;->l:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lci/p;

    .line 41
    .line 42
    iget v2, p0, Lci/o;->m:F

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-direct {v0, v1, v2, p2, v3}, Lci/o;-><init>(Ljava/lang/Object;FLwf/c;I)V

    .line 46
    .line 47
    .line 48
    iput-object p1, v0, Lci/o;->k:Ljava/lang/Object;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lci/o;->h:I

    .line 2
    .line 3
    check-cast p1, Lqg/t;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lci/o;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lci/o;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lci/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lci/o;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lci/o;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lci/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lci/o;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lci/o;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lci/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lci/o;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lci/o;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lci/e0;

    .line 9
    .line 10
    iget v1, v0, Lci/e0;->B:F

    .line 11
    .line 12
    iget-object v2, p0, Lci/o;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lqg/t;

    .line 15
    .line 16
    iget v3, p0, Lci/o;->j:I

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    iget-object v3, p0, Lci/o;->i:Lgg/t;

    .line 24
    .line 25
    :try_start_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_2

    .line 31
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, v0, Lci/e0;->z:Lci/p0;

    .line 43
    .line 44
    iget v3, v0, Lci/e0;->C:F

    .line 45
    .line 46
    iget v5, p0, Lci/o;->m:F

    .line 47
    .line 48
    invoke-virtual {p1, v3, v5}, Lci/p0;->a(FF)V

    .line 49
    .line 50
    .line 51
    new-instance p1, Lgg/t;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    const-wide/16 v5, -0x1

    .line 57
    .line 58
    iput-wide v5, p1, Lgg/t;->g:J

    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    :goto_0
    if-nez v3, :cond_4

    .line 62
    .line 63
    :try_start_1
    invoke-static {v2}, Lqg/v;->o(Lqg/t;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    new-instance v3, Lc9/i;

    .line 70
    .line 71
    const/16 v5, 0x9

    .line 72
    .line 73
    invoke-direct {v3, p1, v5, v0}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iput-object v2, p0, Lci/o;->k:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object p1, p0, Lci/o;->i:Lgg/t;

    .line 79
    .line 80
    iput v4, p0, Lci/o;->j:I

    .line 81
    .line 82
    invoke-interface {p0}, Lwf/c;->getContext()Lwf/g;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {v5}, Li0/r;->s(Lwf/g;)Li0/d;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v5, v3, p0}, Li0/d;->d(Lfg/l;Lwf/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    sget-object v5, Lxf/a;->g:Lxf/a;

    .line 95
    .line 96
    if-ne v3, v5, :cond_2

    .line 97
    .line 98
    move-object p1, v5

    .line 99
    goto :goto_3

    .line 100
    :cond_2
    move-object v8, v3

    .line 101
    move-object v3, p1

    .line 102
    move-object p1, v8

    .line 103
    :goto_1
    :try_start_2
    check-cast p1, Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 106
    .line 107
    .line 108
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 109
    move-object v8, v3

    .line 110
    move v3, p1

    .line 111
    move-object p1, v8

    .line 112
    goto :goto_0

    .line 113
    :goto_2
    iget v2, v0, Lci/e0;->C:F

    .line 114
    .line 115
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    cmpg-float v1, v2, v1

    .line 120
    .line 121
    if-gtz v1, :cond_3

    .line 122
    .line 123
    invoke-virtual {v0}, Lci/e0;->p1()V

    .line 124
    .line 125
    .line 126
    :cond_3
    throw p1

    .line 127
    :cond_4
    iget p1, v0, Lci/e0;->C:F

    .line 128
    .line 129
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    cmpg-float p1, p1, v1

    .line 134
    .line 135
    if-gtz p1, :cond_5

    .line 136
    .line 137
    invoke-virtual {v0}, Lci/e0;->p1()V

    .line 138
    .line 139
    .line 140
    :cond_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 141
    .line 142
    :goto_3
    return-object p1

    .line 143
    :pswitch_0
    iget-object v0, p0, Lci/o;->l:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, Lci/p;

    .line 146
    .line 147
    iget-object v1, p0, Lci/o;->k:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v1, Lqg/t;

    .line 150
    .line 151
    iget v2, p0, Lci/o;->j:I

    .line 152
    .line 153
    const/4 v3, 0x0

    .line 154
    const/high16 v4, 0x3f800000    # 1.0f

    .line 155
    .line 156
    const/4 v5, 0x1

    .line 157
    if-eqz v2, :cond_7

    .line 158
    .line 159
    if-ne v2, v5, :cond_6

    .line 160
    .line 161
    iget-object v2, p0, Lci/o;->i:Lgg/t;

    .line 162
    .line 163
    :try_start_3
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 164
    .line 165
    .line 166
    goto :goto_5

    .line 167
    :catchall_1
    move-exception p1

    .line 168
    goto :goto_6

    .line 169
    :cond_6
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 170
    .line 171
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    const/4 p1, 0x0

    .line 175
    goto/16 :goto_7

    .line 176
    .line 177
    :cond_7
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    iget-object p1, v0, Lci/p;->i:Lci/p0;

    .line 181
    .line 182
    iget v2, v0, Lci/p;->b:F

    .line 183
    .line 184
    iget v6, p0, Lci/o;->m:F

    .line 185
    .line 186
    invoke-virtual {p1, v2, v6}, Lci/p0;->a(FF)V

    .line 187
    .line 188
    .line 189
    new-instance p1, Lgg/t;

    .line 190
    .line 191
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 192
    .line 193
    .line 194
    const-wide/16 v6, -0x1

    .line 195
    .line 196
    iput-wide v6, p1, Lgg/t;->g:J

    .line 197
    .line 198
    const/4 v2, 0x0

    .line 199
    :goto_4
    if-nez v2, :cond_a

    .line 200
    .line 201
    :try_start_4
    invoke-static {v1}, Lqg/v;->o(Lqg/t;)Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    if-eqz v2, :cond_a

    .line 206
    .line 207
    new-instance v2, Lci/n;

    .line 208
    .line 209
    const/4 v6, 0x1

    .line 210
    invoke-direct {v2, p1, v0, v6}, Lci/n;-><init>(Lgg/t;Lci/p;I)V

    .line 211
    .line 212
    .line 213
    iput-object v1, p0, Lci/o;->k:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object p1, p0, Lci/o;->i:Lgg/t;

    .line 216
    .line 217
    iput v5, p0, Lci/o;->j:I

    .line 218
    .line 219
    invoke-interface {p0}, Lwf/c;->getContext()Lwf/g;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    invoke-static {v6}, Li0/r;->s(Lwf/g;)Li0/d;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    invoke-virtual {v6, v2, p0}, Li0/d;->d(Lfg/l;Lwf/c;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 231
    sget-object v6, Lxf/a;->g:Lxf/a;

    .line 232
    .line 233
    if-ne v2, v6, :cond_8

    .line 234
    .line 235
    move-object p1, v6

    .line 236
    goto :goto_7

    .line 237
    :cond_8
    move-object v8, v2

    .line 238
    move-object v2, p1

    .line 239
    move-object p1, v8

    .line 240
    :goto_5
    :try_start_5
    check-cast p1, Ljava/lang/Boolean;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 243
    .line 244
    .line 245
    move-result p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 246
    move-object v8, v2

    .line 247
    move v2, p1

    .line 248
    move-object p1, v8

    .line 249
    goto :goto_4

    .line 250
    :goto_6
    iget v1, v0, Lci/p;->b:F

    .line 251
    .line 252
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    cmpg-float v1, v1, v4

    .line 257
    .line 258
    if-gtz v1, :cond_9

    .line 259
    .line 260
    invoke-virtual {v0, v3}, Lci/p;->h(F)V

    .line 261
    .line 262
    .line 263
    iput v3, v0, Lci/p;->e:F

    .line 264
    .line 265
    :cond_9
    throw p1

    .line 266
    :cond_a
    iget p1, v0, Lci/p;->b:F

    .line 267
    .line 268
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 269
    .line 270
    .line 271
    move-result p1

    .line 272
    cmpg-float p1, p1, v4

    .line 273
    .line 274
    if-gtz p1, :cond_b

    .line 275
    .line 276
    invoke-virtual {v0, v3}, Lci/p;->h(F)V

    .line 277
    .line 278
    .line 279
    iput v3, v0, Lci/p;->e:F

    .line 280
    .line 281
    :cond_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 282
    .line 283
    :goto_7
    return-object p1

    .line 284
    :pswitch_1
    iget-object v0, p0, Lci/o;->l:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v0, Lci/p;

    .line 287
    .line 288
    iget-object v1, p0, Lci/o;->k:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v1, Lqg/t;

    .line 291
    .line 292
    iget v2, p0, Lci/o;->j:I

    .line 293
    .line 294
    const/4 v3, 0x0

    .line 295
    const/high16 v4, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const/4 v5, 0x1

    .line 298
    if-eqz v2, :cond_d

    .line 299
    .line 300
    if-ne v2, v5, :cond_c

    .line 301
    .line 302
    iget-object v2, p0, Lci/o;->i:Lgg/t;

    .line 303
    .line 304
    :try_start_6
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 305
    .line 306
    .line 307
    goto :goto_9

    .line 308
    :catchall_2
    move-exception p1

    .line 309
    goto :goto_a

    .line 310
    :cond_c
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 311
    .line 312
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    const/4 p1, 0x0

    .line 316
    goto/16 :goto_b

    .line 317
    .line 318
    :cond_d
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    iget-object p1, v0, Lci/p;->h:Lci/p0;

    .line 322
    .line 323
    iget v2, v0, Lci/p;->a:F

    .line 324
    .line 325
    iget v6, p0, Lci/o;->m:F

    .line 326
    .line 327
    invoke-virtual {p1, v2, v6}, Lci/p0;->a(FF)V

    .line 328
    .line 329
    .line 330
    new-instance p1, Lgg/t;

    .line 331
    .line 332
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 333
    .line 334
    .line 335
    const-wide/16 v6, -0x1

    .line 336
    .line 337
    iput-wide v6, p1, Lgg/t;->g:J

    .line 338
    .line 339
    const/4 v2, 0x0

    .line 340
    :goto_8
    if-nez v2, :cond_10

    .line 341
    .line 342
    :try_start_7
    invoke-static {v1}, Lqg/v;->o(Lqg/t;)Z

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    if-eqz v2, :cond_10

    .line 347
    .line 348
    new-instance v2, Lci/n;

    .line 349
    .line 350
    const/4 v6, 0x0

    .line 351
    invoke-direct {v2, p1, v0, v6}, Lci/n;-><init>(Lgg/t;Lci/p;I)V

    .line 352
    .line 353
    .line 354
    iput-object v1, p0, Lci/o;->k:Ljava/lang/Object;

    .line 355
    .line 356
    iput-object p1, p0, Lci/o;->i:Lgg/t;

    .line 357
    .line 358
    iput v5, p0, Lci/o;->j:I

    .line 359
    .line 360
    invoke-interface {p0}, Lwf/c;->getContext()Lwf/g;

    .line 361
    .line 362
    .line 363
    move-result-object v6

    .line 364
    invoke-static {v6}, Li0/r;->s(Lwf/g;)Li0/d;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    invoke-virtual {v6, v2, p0}, Li0/d;->d(Lfg/l;Lwf/c;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 372
    sget-object v6, Lxf/a;->g:Lxf/a;

    .line 373
    .line 374
    if-ne v2, v6, :cond_e

    .line 375
    .line 376
    move-object p1, v6

    .line 377
    goto :goto_b

    .line 378
    :cond_e
    move-object v8, v2

    .line 379
    move-object v2, p1

    .line 380
    move-object p1, v8

    .line 381
    :goto_9
    :try_start_8
    check-cast p1, Ljava/lang/Boolean;

    .line 382
    .line 383
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 384
    .line 385
    .line 386
    move-result p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 387
    move-object v8, v2

    .line 388
    move v2, p1

    .line 389
    move-object p1, v8

    .line 390
    goto :goto_8

    .line 391
    :goto_a
    iget v1, v0, Lci/p;->a:F

    .line 392
    .line 393
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    cmpg-float v1, v1, v4

    .line 398
    .line 399
    if-gtz v1, :cond_f

    .line 400
    .line 401
    invoke-virtual {v0, v3}, Lci/p;->g(F)V

    .line 402
    .line 403
    .line 404
    iput v3, v0, Lci/p;->d:F

    .line 405
    .line 406
    :cond_f
    throw p1

    .line 407
    :cond_10
    iget p1, v0, Lci/p;->a:F

    .line 408
    .line 409
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 410
    .line 411
    .line 412
    move-result p1

    .line 413
    cmpg-float p1, p1, v4

    .line 414
    .line 415
    if-gtz p1, :cond_11

    .line 416
    .line 417
    invoke-virtual {v0, v3}, Lci/p;->g(F)V

    .line 418
    .line 419
    .line 420
    iput v3, v0, Lci/p;->d:F

    .line 421
    .line 422
    :cond_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 423
    .line 424
    :goto_b
    return-object p1

    .line 425
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
