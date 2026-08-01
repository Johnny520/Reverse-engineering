.class public final Lul;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic h:I

.field public i:Lwt0;

.field public j:I

.field public final synthetic k:F

.field public l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lny0;


# direct methods
.method public constructor <init>(FLvl;Lhz0;Lik;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lul;->h:I

    .line 17
    iput p1, p0, Lul;->k:F

    iput-object p2, p0, Lul;->m:Ljava/lang/Object;

    iput-object p3, p0, Lul;->n:Lny0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lm51;-><init>(ILik;)V

    return-void
.end method

.method public constructor <init>(Lf21;FLsw;Lny0;Lik;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lul;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lul;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Lul;->k:F

    .line 7
    .line 8
    iput-object p3, p0, Lul;->m:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lul;->n:Lny0;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p5}, Lm51;-><init>(ILik;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 7

    .line 1
    iget p1, p0, Lul;->h:I

    .line 2
    .line 3
    iget-object v0, p0, Lul;->m:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, Lul;

    .line 9
    .line 10
    iget-object p1, p0, Lul;->l:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v2, p1

    .line 13
    check-cast v2, Lf21;

    .line 14
    .line 15
    move-object v4, v0

    .line 16
    check-cast v4, Lsw;

    .line 17
    .line 18
    iget-object v5, p0, Lul;->n:Lny0;

    .line 19
    .line 20
    iget v3, p0, Lul;->k:F

    .line 21
    .line 22
    move-object v6, p2

    .line 23
    invoke-direct/range {v1 .. v6}, Lul;-><init>(Lf21;FLsw;Lny0;Lik;)V

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :pswitch_0
    move-object v6, p2

    .line 28
    new-instance p1, Lul;

    .line 29
    .line 30
    check-cast v0, Lvl;

    .line 31
    .line 32
    iget-object p2, p0, Lul;->n:Lny0;

    .line 33
    .line 34
    check-cast p2, Lhz0;

    .line 35
    .line 36
    iget p0, p0, Lul;->k:F

    .line 37
    .line 38
    invoke-direct {p1, p0, v0, p2, v6}, Lul;-><init>(FLvl;Lhz0;Lik;)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lul;->h:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    check-cast p1, Lyk;

    .line 6
    .line 7
    check-cast p2, Lik;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lul;->g(Ljava/lang/Object;Lik;)Lik;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lul;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lul;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lul;->g(Ljava/lang/Object;Lik;)Lik;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lul;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lul;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lul;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    sget-object v7, Lzk;->d:Lzk;

    .line 7
    .line 8
    iget v3, p0, Lul;->k:F

    .line 9
    .line 10
    iget-object v4, p0, Lul;->m:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v10, v4

    .line 19
    check-cast v10, Lsw;

    .line 20
    .line 21
    iget-object v0, p0, Lul;->l:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lf21;

    .line 24
    .line 25
    iget-object v11, v0, Lf21;->a:Lj21;

    .line 26
    .line 27
    iget v4, p0, Lul;->j:I

    .line 28
    .line 29
    const/4 v12, 0x2

    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    if-eq v4, v9, :cond_1

    .line 33
    .line 34
    if-ne v4, v12, :cond_0

    .line 35
    .line 36
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move-object v0, p1

    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :cond_0
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    move-object v0, v8

    .line 46
    goto/16 :goto_2

    .line 47
    .line 48
    :cond_1
    iget-object v1, p0, Lul;->i:Lwt0;

    .line 49
    .line 50
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object v13, v1

    .line 54
    move-object v1, p1

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v2, v0, Lf21;->b:Lml;

    .line 60
    .line 61
    new-instance v4, Ly2;

    .line 62
    .line 63
    iget-object v2, v2, Lml;->a:Lx1;

    .line 64
    .line 65
    invoke-direct {v4, v2}, Ly2;-><init>(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance v2, Lx7;

    .line 69
    .line 70
    invoke-direct {v2, v6}, Lx7;-><init>(F)V

    .line 71
    .line 72
    .line 73
    new-instance v13, Lx7;

    .line 74
    .line 75
    invoke-direct {v13, v3}, Lx7;-><init>(F)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v2, v13}, Ly2;->j(Lb8;Lb8;)Lb8;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Lx7;

    .line 83
    .line 84
    iget v2, v2, Lx7;->a:F

    .line 85
    .line 86
    invoke-interface {v11, v3, v2}, Lj21;->a(FF)F

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_3

    .line 95
    .line 96
    const-string v4, "calculateApproachOffset returned NaN. Please use a valid value."

    .line 97
    .line 98
    invoke-static {v4}, Lz10;->c(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    new-instance v13, Lwt0;

    .line 102
    .line 103
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    mul-float/2addr v3, v2

    .line 115
    iput v3, v13, Lwt0;->d:F

    .line 116
    .line 117
    new-instance v2, Ljava/lang/Float;

    .line 118
    .line 119
    invoke-direct {v2, v3}, Ljava/lang/Float;-><init>(F)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v10, v2}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    iget v2, v13, Lwt0;->d:F

    .line 126
    .line 127
    new-instance v4, Lc21;

    .line 128
    .line 129
    invoke-direct {v4, v13, v10, v1}, Lc21;-><init>(Lwt0;Lsw;I)V

    .line 130
    .line 131
    .line 132
    iput-object v13, p0, Lul;->i:Lwt0;

    .line 133
    .line 134
    iput v9, p0, Lul;->j:I

    .line 135
    .line 136
    iget-object v1, p0, Lul;->n:Lny0;

    .line 137
    .line 138
    iget v3, p0, Lul;->k:F

    .line 139
    .line 140
    move-object v5, p0

    .line 141
    invoke-static/range {v0 .. v5}, Lf21;->b(Lf21;Lny0;FFLc21;Ljk;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    if-ne v1, v7, :cond_4

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_4
    :goto_0
    check-cast v1, Lw7;

    .line 149
    .line 150
    invoke-virtual {v1}, Lw7;->a()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v2, Ljava/lang/Number;

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    invoke-interface {v11, v2}, Lj21;->b(F)F

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-eqz v3, :cond_5

    .line 169
    .line 170
    const-string v3, "calculateSnapOffset returned NaN. Please use a valid value."

    .line 171
    .line 172
    invoke-static {v3}, Lz10;->c(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :cond_5
    iput v2, v13, Lwt0;->d:F

    .line 176
    .line 177
    const/16 v3, 0x1e

    .line 178
    .line 179
    invoke-static {v1, v6, v6, v3}, Lpf1;->q(Lw7;FFI)Lw7;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    iget-object v4, v0, Lf21;->c:Lo31;

    .line 184
    .line 185
    new-instance v0, Lc21;

    .line 186
    .line 187
    invoke-direct {v0, v13, v10, v9}, Lc21;-><init>(Lwt0;Lsw;I)V

    .line 188
    .line 189
    .line 190
    iput-object v8, p0, Lul;->i:Lwt0;

    .line 191
    .line 192
    iput v12, p0, Lul;->j:I

    .line 193
    .line 194
    move-object v1, v0

    .line 195
    iget-object v0, p0, Lul;->n:Lny0;

    .line 196
    .line 197
    move-object v5, v1

    .line 198
    move v1, v2

    .line 199
    move-object v6, p0

    .line 200
    invoke-static/range {v0 .. v6}, Lj50;->e(Lny0;FFLw7;Lo31;Lsw;Ljk;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    if-ne v0, v7, :cond_6

    .line 205
    .line 206
    :goto_1
    move-object v0, v7

    .line 207
    :cond_6
    :goto_2
    return-object v0

    .line 208
    :pswitch_0
    iget v0, p0, Lul;->j:I

    .line 209
    .line 210
    if-eqz v0, :cond_8

    .line 211
    .line 212
    if-ne v0, v9, :cond_7

    .line 213
    .line 214
    iget-object v0, p0, Lul;->l:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, Lw7;

    .line 217
    .line 218
    iget-object v1, p0, Lul;->i:Lwt0;

    .line 219
    .line 220
    :try_start_0
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 221
    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_7
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    move-object v7, v8

    .line 228
    goto :goto_4

    .line 229
    :cond_8
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    const/high16 v2, 0x3f800000    # 1.0f

    .line 237
    .line 238
    cmpl-float v0, v0, v2

    .line 239
    .line 240
    if-lez v0, :cond_a

    .line 241
    .line 242
    new-instance v0, Lwt0;

    .line 243
    .line 244
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 245
    .line 246
    .line 247
    iput v3, v0, Lwt0;->d:F

    .line 248
    .line 249
    new-instance v2, Lwt0;

    .line 250
    .line 251
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 252
    .line 253
    .line 254
    const/16 v8, 0x1c

    .line 255
    .line 256
    invoke-static {v6, v3, v8}, Lpf1;->a(FFI)Lw7;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    :try_start_1
    check-cast v4, Lvl;

    .line 261
    .line 262
    iget-object v6, v4, Lvl;->a:Lml;

    .line 263
    .line 264
    iget-object v8, p0, Lul;->n:Lny0;

    .line 265
    .line 266
    check-cast v8, Lhz0;

    .line 267
    .line 268
    new-instance v10, Lzj;

    .line 269
    .line 270
    invoke-direct {v10, v2, v8, v0, v4}, Lzj;-><init>(Lwt0;Lhz0;Lwt0;Lvl;)V

    .line 271
    .line 272
    .line 273
    iput-object v0, p0, Lul;->i:Lwt0;

    .line 274
    .line 275
    iput-object v3, p0, Lul;->l:Ljava/lang/Object;

    .line 276
    .line 277
    iput v9, p0, Lul;->j:I

    .line 278
    .line 279
    invoke-static {v3, v6, v1, v10, p0}, Lz60;->g(Lw7;Lml;ZLsw;Ljk;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 283
    if-ne v1, v7, :cond_9

    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_9
    move-object v1, v0

    .line 287
    goto :goto_3

    .line 288
    :catch_0
    move-object v1, v0

    .line 289
    move-object v0, v3

    .line 290
    :catch_1
    invoke-virtual {v0}, Lw7;->a()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    check-cast v0, Ljava/lang/Number;

    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    iput v0, v1, Lwt0;->d:F

    .line 301
    .line 302
    :goto_3
    iget v3, v1, Lwt0;->d:F

    .line 303
    .line 304
    :cond_a
    new-instance v7, Ljava/lang/Float;

    .line 305
    .line 306
    invoke-direct {v7, v3}, Ljava/lang/Float;-><init>(F)V

    .line 307
    .line 308
    .line 309
    :goto_4
    return-object v7

    .line 310
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
