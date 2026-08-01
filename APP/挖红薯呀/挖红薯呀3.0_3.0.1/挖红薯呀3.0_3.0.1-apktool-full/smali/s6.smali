.class public final Ls6;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lnk;


# instance fields
.field public final synthetic d:I

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/Choreographer;Lq6;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ls6;->d:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ls6;->e:Ljava/lang/Object;

    .line 19
    iput-object p2, p0, Ls6;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lit0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ls6;->d:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6;->e:Ljava/lang/Object;

    .line 21
    new-instance p1, Lr9;

    invoke-direct {p1}, Lr9;-><init>()V

    iput-object p1, p0, Ls6;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls6;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ls6;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ls6;->e:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance p1, Ld50;

    .line 10
    .line 11
    invoke-direct {p1}, Ld50;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ls6;->f:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final c(Lsw;Ljk;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Ls6;->d:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    instance-of v0, p2, Lxp0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    move-object v0, p2

    .line 13
    check-cast v0, Lxp0;

    .line 14
    .line 15
    iget v3, v0, Lxp0;->j:I

    .line 16
    .line 17
    const/high16 v4, -0x80000000

    .line 18
    .line 19
    and-int v5, v3, v4

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    sub-int/2addr v3, v4

    .line 24
    iput v3, v0, Lxp0;->j:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v0, Lxp0;

    .line 28
    .line 29
    invoke-direct {v0, p0, p2}, Lxp0;-><init>(Ls6;Ljk;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget-object p2, v0, Lxp0;->h:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object v3, Lzk;->d:Lzk;

    .line 35
    .line 36
    iget v4, v0, Lxp0;->j:I

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-eq v4, v2, :cond_2

    .line 42
    .line 43
    if-ne v4, v1, :cond_1

    .line 44
    .line 45
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_4

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    move-object p2, v5

    .line 55
    goto :goto_4

    .line 56
    :cond_2
    iget-object p1, v0, Lxp0;->g:Lsw;

    .line 57
    .line 58
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, Ls6;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p2, Ld50;

    .line 68
    .line 69
    iput-object p1, v0, Lxp0;->g:Lsw;

    .line 70
    .line 71
    iput v2, v0, Lxp0;->j:I

    .line 72
    .line 73
    iget-object v4, p2, Ld50;->b:Ljava/lang/Object;

    .line 74
    .line 75
    monitor-enter v4

    .line 76
    :try_start_0
    iget-boolean v6, p2, Ld50;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 77
    .line 78
    monitor-exit v4

    .line 79
    if-eqz v6, :cond_4

    .line 80
    .line 81
    sget-object p2, Lna1;->a:Lna1;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    new-instance v4, Lwc;

    .line 85
    .line 86
    invoke-static {v0}, Lrd0;->z(Lik;)Lik;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-direct {v4, v2, v6}, Lwc;-><init>(ILik;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, Lwc;->v()V

    .line 94
    .line 95
    .line 96
    iget-object v6, p2, Ld50;->b:Ljava/lang/Object;

    .line 97
    .line 98
    monitor-enter v6

    .line 99
    :try_start_1
    iget-object v7, p2, Ld50;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v7, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    .line 105
    .line 106
    monitor-exit v6

    .line 107
    new-instance v6, Lpx;

    .line 108
    .line 109
    invoke-direct {v6, v2, p2, v4}, Lpx;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v6}, Lwc;->y(Lsw;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4}, Lwc;->t()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    if-ne p2, v3, :cond_5

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    sget-object p2, Lna1;->a:Lna1;

    .line 123
    .line 124
    :goto_1
    if-ne p2, v3, :cond_6

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_6
    :goto_2
    iget-object p0, p0, Ls6;->e:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p0, Ls6;

    .line 130
    .line 131
    iput-object v5, v0, Lxp0;->g:Lsw;

    .line 132
    .line 133
    iput v1, v0, Lxp0;->j:I

    .line 134
    .line 135
    invoke-virtual {p0, p1, v0}, Ls6;->c(Lsw;Ljk;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    if-ne p2, v3, :cond_7

    .line 140
    .line 141
    :goto_3
    move-object p2, v3

    .line 142
    :cond_7
    :goto_4
    return-object p2

    .line 143
    :catchall_0
    move-exception p0

    .line 144
    monitor-exit v6

    .line 145
    throw p0

    .line 146
    :catchall_1
    move-exception p0

    .line 147
    monitor-exit v4

    .line 148
    throw p0

    .line 149
    :pswitch_0
    new-instance v0, Lwc;

    .line 150
    .line 151
    invoke-static {p2}, Lrd0;->z(Lik;)Lik;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-direct {v0, v2, p2}, Lwc;-><init>(ILik;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Lwc;->v()V

    .line 159
    .line 160
    .line 161
    iget-object p2, p0, Ls6;->f:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast p2, Lr9;

    .line 164
    .line 165
    new-instance v1, Lob;

    .line 166
    .line 167
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 168
    .line 169
    .line 170
    iput-object v0, v1, Lob;->a:Lwc;

    .line 171
    .line 172
    iput-object p1, v1, Lob;->b:Lsw;

    .line 173
    .line 174
    iget-object p0, p0, Ls6;->e:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, Lit0;

    .line 177
    .line 178
    invoke-virtual {p2, v1, p0}, Lr9;->d(Lq9;Lhw;)Lyc;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    new-instance p1, Lpb;

    .line 183
    .line 184
    const/4 p2, 0x0

    .line 185
    invoke-direct {p1, p2, p0}, Lpb;-><init>(ILjava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, p1}, Lwc;->y(Lsw;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Lwc;->t()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    return-object p0

    .line 196
    :pswitch_1
    iget-object v0, p0, Ls6;->f:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v0, Lq6;

    .line 199
    .line 200
    new-instance v3, Lwc;

    .line 201
    .line 202
    invoke-static {p2}, Lrd0;->z(Lik;)Lik;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    invoke-direct {v3, v2, p2}, Lwc;-><init>(ILik;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3}, Lwc;->v()V

    .line 210
    .line 211
    .line 212
    new-instance p2, Lr6;

    .line 213
    .line 214
    invoke-direct {p2, v3, p0, p1}, Lr6;-><init>(Lwc;Ls6;Lsw;)V

    .line 215
    .line 216
    .line 217
    iget-object p1, v0, Lq6;->f:Landroid/view/Choreographer;

    .line 218
    .line 219
    iget-object v4, p0, Ls6;->e:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v4, Landroid/view/Choreographer;

    .line 222
    .line 223
    invoke-static {p1, v4}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    if-eqz p1, :cond_9

    .line 228
    .line 229
    iget-object p0, v0, Lq6;->h:Ljava/lang/Object;

    .line 230
    .line 231
    monitor-enter p0

    .line 232
    :try_start_2
    iget-object p1, v0, Lq6;->j:Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    iget-boolean p1, v0, Lq6;->m:Z

    .line 238
    .line 239
    if-nez p1, :cond_8

    .line 240
    .line 241
    iput-boolean v2, v0, Lq6;->m:Z

    .line 242
    .line 243
    iget-object p1, v0, Lq6;->f:Landroid/view/Choreographer;

    .line 244
    .line 245
    iget-object v2, v0, Lq6;->n:Lp6;

    .line 246
    .line 247
    invoke-virtual {p1, v2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 248
    .line 249
    .line 250
    goto :goto_5

    .line 251
    :catchall_2
    move-exception p1

    .line 252
    goto :goto_6

    .line 253
    :cond_8
    :goto_5
    monitor-exit p0

    .line 254
    new-instance p0, Lo4;

    .line 255
    .line 256
    invoke-direct {p0, v1, v0, p2}, Lo4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v3, p0}, Lwc;->y(Lsw;)V

    .line 260
    .line 261
    .line 262
    goto :goto_7

    .line 263
    :goto_6
    monitor-exit p0

    .line 264
    throw p1

    .line 265
    :cond_9
    iget-object p1, p0, Ls6;->e:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast p1, Landroid/view/Choreographer;

    .line 268
    .line 269
    invoke-virtual {p1, p2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 270
    .line 271
    .line 272
    new-instance p1, Lo4;

    .line 273
    .line 274
    const/4 v0, 0x3

    .line 275
    invoke-direct {p1, v0, p0, p2}, Lo4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v3, p1}, Lwc;->y(Lsw;)V

    .line 279
    .line 280
    .line 281
    :goto_7
    invoke-virtual {v3}, Lwc;->t()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    return-object p0

    .line 286
    nop

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getKey()Lok;
    .locals 0

    .line 1
    sget-object p0, Ln2;->J:Ln2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Lpk;)Lpk;
    .locals 1

    .line 1
    iget v0, p0, Ls6;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lpf1;->J(Lnk;Lpk;)Lpk;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lpf1;->J(Lnk;Lpk;)Lpk;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lpf1;->J(Lnk;Lpk;)Lpk;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final l(Lok;)Lnk;
    .locals 1

    .line 1
    iget v0, p0, Ls6;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lpf1;->v(Lnk;Lok;)Lnk;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lpf1;->v(Lnk;Lok;)Lnk;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lpf1;->v(Lnk;Lok;)Lnk;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lww;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ls6;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2, p0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-interface {p1, p2, p0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-interface {p1, p2, p0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final t(Lok;)Lpk;
    .locals 1

    .line 1
    iget v0, p0, Ls6;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lpf1;->F(Lnk;Lok;)Lpk;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lpf1;->F(Lnk;Lok;)Lpk;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lpf1;->F(Lnk;Lok;)Lpk;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
