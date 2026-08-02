.class public final Lxb;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ly10;


# instance fields
.field public final synthetic h:I

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/Choreographer;Lvb;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lxb;->h:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lxb;->i:Ljava/lang/Object;

    .line 22
    iput-object p2, p0, Lxb;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lc62;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lxb;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxb;->i:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance p1, Lcj;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, v0}, Lcj;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lxb;->j:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lxb;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lxb;->h:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxb;->i:Ljava/lang/Object;

    .line 19
    new-instance p1, Lf90;

    invoke-direct {p1}, Lf90;-><init>()V

    iput-object p1, p0, Lxb;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lin0;Lt00;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lxb;->h:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    instance-of v0, p2, Lry1;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p2

    .line 12
    check-cast v0, Lry1;

    .line 13
    .line 14
    iget v2, v0, Lry1;->n:I

    .line 15
    .line 16
    const/high16 v3, -0x80000000

    .line 17
    .line 18
    and-int v4, v2, v3

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    sub-int/2addr v2, v3

    .line 23
    iput v2, v0, Lry1;->n:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Lry1;

    .line 27
    .line 28
    invoke-direct {v0, p0, p2}, Lry1;-><init>(Lxb;Lt00;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p2, v0, Lry1;->l:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v2, Lk20;->h:Lk20;

    .line 34
    .line 35
    iget v3, v0, Lry1;->n:I

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x2

    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    if-eq v3, v1, :cond_2

    .line 42
    .line 43
    if-ne v3, v5, :cond_1

    .line 44
    .line 45
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_4

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    move-object p2, v4

    .line 55
    goto :goto_4

    .line 56
    :cond_2
    iget-object p1, v0, Lry1;->k:Lin0;

    .line 57
    .line 58
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, Lxb;->j:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p2, Lf90;

    .line 68
    .line 69
    iput-object p1, v0, Lry1;->k:Lin0;

    .line 70
    .line 71
    iput v1, v0, Lry1;->n:I

    .line 72
    .line 73
    iget-object v3, p2, Lf90;->b:Ljava/lang/Object;

    .line 74
    .line 75
    monitor-enter v3

    .line 76
    :try_start_0
    iget-boolean v6, p2, Lf90;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 77
    .line 78
    monitor-exit v3

    .line 79
    if-eqz v6, :cond_4

    .line 80
    .line 81
    sget-object p2, La83;->a:La83;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    new-instance v3, Lmp;

    .line 85
    .line 86
    invoke-static {v0}, Lgf1;->z(Lt00;)Lt00;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-direct {v3, v1, v6}, Lmp;-><init>(ILt00;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Lmp;->u()V

    .line 94
    .line 95
    .line 96
    iget-object v1, p2, Lf90;->b:Ljava/lang/Object;

    .line 97
    .line 98
    monitor-enter v1

    .line 99
    :try_start_1
    iget-object v6, p2, Lf90;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v6, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    .line 105
    .line 106
    monitor-exit v1

    .line 107
    new-instance v1, Lzh;

    .line 108
    .line 109
    const/4 v6, 0x6

    .line 110
    invoke-direct {v1, v6, p2, v3}, Lzh;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v1}, Lmp;->w(Lin0;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Lmp;->t()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    if-ne p2, v2, :cond_5

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_5
    sget-object p2, La83;->a:La83;

    .line 124
    .line 125
    :goto_1
    if-ne p2, v2, :cond_6

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_6
    :goto_2
    iget-object p0, p0, Lxb;->i:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p0, Lxb;

    .line 131
    .line 132
    iput-object v4, v0, Lry1;->k:Lin0;

    .line 133
    .line 134
    iput v5, v0, Lry1;->n:I

    .line 135
    .line 136
    invoke-virtual {p0, p1, v0}, Lxb;->a(Lin0;Lt00;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    if-ne p2, v2, :cond_7

    .line 141
    .line 142
    :goto_3
    move-object p2, v2

    .line 143
    :cond_7
    :goto_4
    return-object p2

    .line 144
    :catchall_0
    move-exception p0

    .line 145
    monitor-exit v1

    .line 146
    throw p0

    .line 147
    :catchall_1
    move-exception p0

    .line 148
    monitor-exit v3

    .line 149
    throw p0

    .line 150
    :pswitch_0
    new-instance v0, Lmp;

    .line 151
    .line 152
    invoke-static {p2}, Lgf1;->z(Lt00;)Lt00;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-direct {v0, v1, p2}, Lmp;-><init>(ILt00;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Lmp;->u()V

    .line 160
    .line 161
    .line 162
    iget-object p2, p0, Lxb;->j:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast p2, Lcj;

    .line 165
    .line 166
    new-instance v1, Lym;

    .line 167
    .line 168
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 169
    .line 170
    .line 171
    iput-object v0, v1, Lym;->a:Lmp;

    .line 172
    .line 173
    iput-object p1, v1, Lym;->b:Lin0;

    .line 174
    .line 175
    iget-object p0, p0, Lxb;->i:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast p0, Lc62;

    .line 178
    .line 179
    invoke-virtual {p2, v1, p0}, Lcj;->d(Lbj;Lxm0;)Lnp;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    new-instance p1, Lzm;

    .line 184
    .line 185
    const/4 p2, 0x0

    .line 186
    invoke-direct {p1, p2, p0}, Lzm;-><init>(ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, p1}, Lmp;->w(Lin0;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Lmp;->t()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    return-object p0

    .line 197
    :pswitch_1
    iget-object v0, p0, Lxb;->j:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, Lvb;

    .line 200
    .line 201
    new-instance v2, Lmp;

    .line 202
    .line 203
    invoke-static {p2}, Lgf1;->z(Lt00;)Lt00;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    invoke-direct {v2, v1, p2}, Lmp;-><init>(ILt00;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Lmp;->u()V

    .line 211
    .line 212
    .line 213
    new-instance p2, Lwb;

    .line 214
    .line 215
    invoke-direct {p2, v2, p0, p1}, Lwb;-><init>(Lmp;Lxb;Lin0;)V

    .line 216
    .line 217
    .line 218
    iget-object p1, v0, Lvb;->j:Landroid/view/Choreographer;

    .line 219
    .line 220
    iget-object v3, p0, Lxb;->i:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v3, Landroid/view/Choreographer;

    .line 223
    .line 224
    invoke-static {p1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-eqz p1, :cond_9

    .line 229
    .line 230
    iget-object p0, v0, Lvb;->l:Ljava/lang/Object;

    .line 231
    .line 232
    monitor-enter p0

    .line 233
    :try_start_2
    iget-object p1, v0, Lvb;->n:Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    iget-boolean p1, v0, Lvb;->q:Z

    .line 239
    .line 240
    if-nez p1, :cond_8

    .line 241
    .line 242
    iput-boolean v1, v0, Lvb;->q:Z

    .line 243
    .line 244
    iget-object p1, v0, Lvb;->j:Landroid/view/Choreographer;

    .line 245
    .line 246
    iget-object v1, v0, Lvb;->r:Lub;

    .line 247
    .line 248
    invoke-virtual {p1, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 249
    .line 250
    .line 251
    goto :goto_5

    .line 252
    :catchall_2
    move-exception p1

    .line 253
    goto :goto_6

    .line 254
    :cond_8
    :goto_5
    monitor-exit p0

    .line 255
    new-instance p0, Lfa;

    .line 256
    .line 257
    const/4 p1, 0x3

    .line 258
    invoke-direct {p0, p1, v0, p2}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, p0}, Lmp;->w(Lin0;)V

    .line 262
    .line 263
    .line 264
    goto :goto_7

    .line 265
    :goto_6
    monitor-exit p0

    .line 266
    throw p1

    .line 267
    :cond_9
    iget-object p1, p0, Lxb;->i:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast p1, Landroid/view/Choreographer;

    .line 270
    .line 271
    invoke-virtual {p1, p2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 272
    .line 273
    .line 274
    new-instance p1, Lfa;

    .line 275
    .line 276
    const/4 v0, 0x4

    .line 277
    invoke-direct {p1, v0, p0, p2}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, p1}, Lmp;->w(Lin0;)V

    .line 281
    .line 282
    .line 283
    :goto_7
    invoke-virtual {v2}, Lmp;->t()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    return-object p0

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getKey()Lz10;
    .locals 0

    .line 1
    sget-object p0, Lgd3;->A:Lgd3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k(La20;)La20;
    .locals 1

    .line 1
    iget v0, p0, Lxb;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lxe1;->f0(Ly10;La20;)La20;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lxe1;->f0(Ly10;La20;)La20;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lxe1;->f0(Ly10;La20;)La20;

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

.method public final o(Lz10;)Ly10;
    .locals 1

    .line 1
    iget v0, p0, Lxb;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lxe1;->u(Ly10;Lz10;)Ly10;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lxe1;->u(Ly10;Lz10;)Ly10;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lxe1;->u(Ly10;Lz10;)Ly10;

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

.method public final r(Lmn0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lxb;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2, p0}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-interface {p1, p2, p0}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-interface {p1, p2, p0}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public final u(Lz10;)La20;
    .locals 1

    .line 1
    iget v0, p0, Lxb;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lxe1;->W(Ly10;Lz10;)La20;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lxe1;->W(Ly10;Lz10;)La20;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lxe1;->W(Ly10;Lz10;)La20;

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
