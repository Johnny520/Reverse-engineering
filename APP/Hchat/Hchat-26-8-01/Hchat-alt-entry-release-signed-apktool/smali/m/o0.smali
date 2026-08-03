.class public final Lm/o0;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:Lgg/u;

.field public j:Lgg/u;

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lm/p0;


# direct methods
.method public constructor <init>(Lgg/u;Lm/p0;Lwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lm/o0;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lm/o0;->j:Lgg/u;

    .line 5
    .line 6
    iput-object p2, p0, Lm/o0;->m:Lm/p0;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lm/p0;Lwf/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lm/o0;->h:I

    .line 13
    iput-object p1, p0, Lm/o0;->m:Lm/p0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    iget v0, p0, Lm/o0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm/o0;

    .line 7
    .line 8
    iget-object v1, p0, Lm/o0;->m:Lm/p0;

    .line 9
    .line 10
    invoke-direct {v0, v1, p2}, Lm/o0;-><init>(Lm/p0;Lwf/c;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Lm/o0;->l:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    new-instance v0, Lm/o0;

    .line 17
    .line 18
    iget-object v1, p0, Lm/o0;->j:Lgg/u;

    .line 19
    .line 20
    iget-object v2, p0, Lm/o0;->m:Lm/p0;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2, p2}, Lm/o0;-><init>(Lgg/u;Lm/p0;Lwf/c;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, Lm/o0;->l:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lm/o0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lqg/t;

    .line 7
    .line 8
    check-cast p2, Lwf/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lm/o0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lm/o0;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lm/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lfg/l;

    .line 24
    .line 25
    check-cast p2, Lwf/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lm/o0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lm/o0;

    .line 32
    .line 33
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lm/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lm/o0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lm/o0;->k:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object v2, p0, Lm/o0;->m:Lm/p0;

    .line 10
    .line 11
    sget-object v3, Lxf/a;->g:Lxf/a;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_1

    .line 14
    .line 15
    .line 16
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    goto/16 :goto_8

    .line 23
    .line 24
    :pswitch_0
    iget-object v0, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lqg/t;

    .line 27
    .line 28
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :pswitch_1
    iget-object v0, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lqg/t;

    .line 35
    .line 36
    :goto_0
    :try_start_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :pswitch_2
    iget-object v0, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lqg/t;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    :goto_1
    move-object v5, v0

    .line 46
    goto :goto_2

    .line 47
    :pswitch_3
    iget-object v0, p0, Lm/o0;->i:Lgg/u;

    .line 48
    .line 49
    iget-object v4, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v4, Lqg/t;

    .line 52
    .line 53
    :try_start_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 54
    .line 55
    .line 56
    :cond_1
    move-object v5, v4

    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :catch_0
    move-object v0, v4

    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :pswitch_4
    iget-object v0, p0, Lm/o0;->i:Lgg/u;

    .line 63
    .line 64
    iget-object v4, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v4, Lqg/t;

    .line 67
    .line 68
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_5

    .line 72
    :pswitch_5
    iget-object v0, p0, Lm/o0;->j:Lgg/u;

    .line 73
    .line 74
    iget-object v4, p0, Lm/o0;->i:Lgg/u;

    .line 75
    .line 76
    iget-object v5, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v5, Lqg/t;

    .line 79
    .line 80
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :pswitch_6
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Lqg/t;

    .line 90
    .line 91
    move-object v5, p1

    .line 92
    :cond_2
    :goto_2
    invoke-static {v5}, Lqg/v;->o(Lqg/t;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_7

    .line 97
    .line 98
    new-instance v0, Lgg/u;

    .line 99
    .line 100
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 101
    .line 102
    .line 103
    iget-object p1, v2, Lm/p0;->B:Lsg/c;

    .line 104
    .line 105
    if-eqz p1, :cond_4

    .line 106
    .line 107
    iput-object v5, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object v0, p0, Lm/o0;->i:Lgg/u;

    .line 110
    .line 111
    iput-object v0, p0, Lm/o0;->j:Lgg/u;

    .line 112
    .line 113
    const/4 v4, 0x1

    .line 114
    iput v4, p0, Lm/o0;->k:I

    .line 115
    .line 116
    invoke-virtual {p1, p0}, Lsg/c;->f(Lwf/c;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-ne p1, v3, :cond_3

    .line 121
    .line 122
    goto/16 :goto_8

    .line 123
    .line 124
    :cond_3
    move-object v4, v0

    .line 125
    :goto_3
    check-cast p1, Lm/b0;

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_4
    move-object v4, v0

    .line 129
    move-object p1, v1

    .line 130
    :goto_4
    iput-object p1, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 131
    .line 132
    iget-object p1, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 133
    .line 134
    instance-of v0, p1, Lm/z;

    .line 135
    .line 136
    if-eqz v0, :cond_2

    .line 137
    .line 138
    check-cast p1, Lm/z;

    .line 139
    .line 140
    iput-object v5, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 141
    .line 142
    iput-object v4, p0, Lm/o0;->i:Lgg/u;

    .line 143
    .line 144
    iput-object v1, p0, Lm/o0;->j:Lgg/u;

    .line 145
    .line 146
    const/4 v0, 0x2

    .line 147
    iput v0, p0, Lm/o0;->k:I

    .line 148
    .line 149
    invoke-static {v2, p1, p0}, Lm/p0;->o1(Lm/p0;Lm/z;Lyf/c;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    if-ne p1, v3, :cond_5

    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_5
    move-object v0, v4

    .line 157
    move-object v4, v5

    .line 158
    :goto_5
    :try_start_2
    new-instance p1, Lm/o0;

    .line 159
    .line 160
    invoke-direct {p1, v0, v2, v1}, Lm/o0;-><init>(Lgg/u;Lm/p0;Lwf/c;)V

    .line 161
    .line 162
    .line 163
    iput-object v4, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 164
    .line 165
    iput-object v0, p0, Lm/o0;->i:Lgg/u;

    .line 166
    .line 167
    const/4 v5, 0x3

    .line 168
    iput v5, p0, Lm/o0;->k:I

    .line 169
    .line 170
    invoke-virtual {v2, p1, p0}, Lm/p0;->r1(Lm/o0;Lm/o0;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 174
    if-ne p1, v3, :cond_1

    .line 175
    .line 176
    goto :goto_8

    .line 177
    :goto_6
    :try_start_3
    iget-object p1, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 178
    .line 179
    instance-of v0, p1, Lm/a0;

    .line 180
    .line 181
    if-eqz v0, :cond_6

    .line 182
    .line 183
    check-cast p1, Lm/a0;

    .line 184
    .line 185
    iput-object v5, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object v1, p0, Lm/o0;->i:Lgg/u;

    .line 188
    .line 189
    const/4 v0, 0x4

    .line 190
    iput v0, p0, Lm/o0;->k:I

    .line 191
    .line 192
    invoke-static {v2, p1, p0}, Lm/p0;->p1(Lm/p0;Lm/a0;Lyf/c;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    if-ne p1, v3, :cond_2

    .line 197
    .line 198
    goto :goto_8

    .line 199
    :catch_1
    move-object v0, v5

    .line 200
    goto :goto_7

    .line 201
    :cond_6
    instance-of p1, p1, Lm/x;

    .line 202
    .line 203
    if-eqz p1, :cond_2

    .line 204
    .line 205
    iput-object v5, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 206
    .line 207
    iput-object v1, p0, Lm/o0;->i:Lgg/u;

    .line 208
    .line 209
    const/4 p1, 0x5

    .line 210
    iput p1, p0, Lm/o0;->k:I

    .line 211
    .line 212
    invoke-static {v2, p0}, Lm/p0;->n1(Lm/p0;Lyf/c;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 216
    if-ne p1, v3, :cond_2

    .line 217
    .line 218
    goto :goto_8

    .line 219
    :catch_2
    :goto_7
    iput-object v0, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 220
    .line 221
    iput-object v1, p0, Lm/o0;->i:Lgg/u;

    .line 222
    .line 223
    const/4 p1, 0x6

    .line 224
    iput p1, p0, Lm/o0;->k:I

    .line 225
    .line 226
    invoke-static {v2, p0}, Lm/p0;->n1(Lm/p0;Lyf/c;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    if-ne p1, v3, :cond_0

    .line 231
    .line 232
    goto :goto_8

    .line 233
    :cond_7
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 234
    .line 235
    :goto_8
    return-object v3

    .line 236
    :pswitch_7
    iget-object v0, p0, Lm/o0;->j:Lgg/u;

    .line 237
    .line 238
    iget v1, p0, Lm/o0;->k:I

    .line 239
    .line 240
    const/4 v2, 0x1

    .line 241
    if-eqz v1, :cond_9

    .line 242
    .line 243
    if-ne v1, v2, :cond_8

    .line 244
    .line 245
    iget-object v1, p0, Lm/o0;->i:Lgg/u;

    .line 246
    .line 247
    iget-object v3, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v3, Lfg/l;

    .line 250
    .line 251
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    goto :goto_b

    .line 255
    :cond_8
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 256
    .line 257
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    const/4 p1, 0x0

    .line 261
    goto :goto_d

    .line 262
    :cond_9
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    iget-object p1, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast p1, Lfg/l;

    .line 268
    .line 269
    move-object v3, p1

    .line 270
    :goto_9
    iget-object p1, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 271
    .line 272
    instance-of v1, p1, Lm/a0;

    .line 273
    .line 274
    if-nez v1, :cond_e

    .line 275
    .line 276
    instance-of v1, p1, Lm/x;

    .line 277
    .line 278
    if-nez v1, :cond_e

    .line 279
    .line 280
    instance-of v1, p1, Lm/y;

    .line 281
    .line 282
    const/4 v4, 0x0

    .line 283
    if-eqz v1, :cond_a

    .line 284
    .line 285
    check-cast p1, Lm/y;

    .line 286
    .line 287
    goto :goto_a

    .line 288
    :cond_a
    move-object p1, v4

    .line 289
    :goto_a
    if-eqz p1, :cond_b

    .line 290
    .line 291
    invoke-interface {v3, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    :cond_b
    iget-object p1, p0, Lm/o0;->m:Lm/p0;

    .line 295
    .line 296
    iget-object p1, p1, Lm/p0;->B:Lsg/c;

    .line 297
    .line 298
    if-eqz p1, :cond_d

    .line 299
    .line 300
    iput-object v3, p0, Lm/o0;->l:Ljava/lang/Object;

    .line 301
    .line 302
    iput-object v0, p0, Lm/o0;->i:Lgg/u;

    .line 303
    .line 304
    iput v2, p0, Lm/o0;->k:I

    .line 305
    .line 306
    invoke-virtual {p1, p0}, Lsg/c;->f(Lwf/c;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    sget-object v1, Lxf/a;->g:Lxf/a;

    .line 311
    .line 312
    if-ne p1, v1, :cond_c

    .line 313
    .line 314
    move-object p1, v1

    .line 315
    goto :goto_d

    .line 316
    :cond_c
    move-object v1, v0

    .line 317
    :goto_b
    move-object v4, p1

    .line 318
    check-cast v4, Lm/b0;

    .line 319
    .line 320
    goto :goto_c

    .line 321
    :cond_d
    move-object v1, v0

    .line 322
    :goto_c
    iput-object v4, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 323
    .line 324
    goto :goto_9

    .line 325
    :cond_e
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 326
    .line 327
    :goto_d
    return-object p1

    .line 328
    nop

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
    .end packed-switch

    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
