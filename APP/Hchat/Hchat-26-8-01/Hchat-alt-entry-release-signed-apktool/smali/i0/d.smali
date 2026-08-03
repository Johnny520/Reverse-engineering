.class public final Li0/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lwf/e;


# instance fields
.field public final synthetic g:I

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/Choreographer;Ly1/n0;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Li0/d;->g:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Li0/d;->h:Ljava/lang/Object;

    .line 22
    iput-object p2, p0, Li0/d;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li0/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li0/d;->g:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/d;->h:Ljava/lang/Object;

    .line 19
    new-instance p1, Lj8/f;

    invoke-direct {p1}, Lj8/f;-><init>()V

    iput-object p1, p0, Li0/d;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li0/s1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Li0/d;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Li0/d;->h:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance p1, Lbe/k;

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    invoke-direct {p1, v0}, Lbe/k;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Li0/d;->i:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final d(Lfg/l;Lwf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Li0/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li0/d;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ly1/n0;

    .line 9
    .line 10
    new-instance v1, Lqg/g;

    .line 11
    .line 12
    invoke-static {p2}, Lfb/v0;->x(Lwf/c;)Lwf/c;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v1, v2, p2}, Lqg/g;-><init>(ILwf/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lqg/g;->p()V

    .line 21
    .line 22
    .line 23
    new-instance p2, Ly1/o0;

    .line 24
    .line 25
    invoke-direct {p2, v1, p0, p1}, Ly1/o0;-><init>(Lqg/g;Li0/d;Lfg/l;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, v0, Ly1/n0;->i:Landroid/view/Choreographer;

    .line 29
    .line 30
    iget-object v3, p0, Li0/d;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Landroid/view/Choreographer;

    .line 33
    .line 34
    invoke-static {p1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, Ly1/n0;->k:Ljava/lang/Object;

    .line 41
    .line 42
    monitor-enter p1

    .line 43
    :try_start_0
    iget-object v3, v0, Ly1/n0;->m:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    iget-boolean v3, v0, Ly1/n0;->p:Z

    .line 49
    .line 50
    if-nez v3, :cond_0

    .line 51
    .line 52
    iput-boolean v2, v0, Ly1/n0;->p:Z

    .line 53
    .line 54
    iget-object v2, v0, Ly1/n0;->i:Landroid/view/Choreographer;

    .line 55
    .line 56
    iget-object v3, v0, Ly1/n0;->q:Ly1/m0;

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception p2

    .line 63
    goto :goto_1

    .line 64
    :cond_0
    :goto_0
    monitor-exit p1

    .line 65
    new-instance p1, Lf1/p;

    .line 66
    .line 67
    const/16 v2, 0x9

    .line 68
    .line 69
    invoke-direct {p1, v0, v2, p2}, Lf1/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, p1}, Lqg/g;->r(Lfg/l;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :goto_1
    monitor-exit p1

    .line 77
    throw p2

    .line 78
    :cond_1
    iget-object p1, p0, Li0/d;->h:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, Landroid/view/Choreographer;

    .line 81
    .line 82
    invoke-virtual {p1, p2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 83
    .line 84
    .line 85
    new-instance p1, Lf1/p;

    .line 86
    .line 87
    const/16 v0, 0xa

    .line 88
    .line 89
    invoke-direct {p1, p0, v0, p2}, Lf1/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, p1}, Lqg/g;->r(Lfg/l;)V

    .line 93
    .line 94
    .line 95
    :goto_2
    invoke-virtual {v1}, Lqg/g;->o()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1

    .line 100
    :pswitch_0
    instance-of v0, p2, Li0/k1;

    .line 101
    .line 102
    if-eqz v0, :cond_2

    .line 103
    .line 104
    move-object v0, p2

    .line 105
    check-cast v0, Li0/k1;

    .line 106
    .line 107
    iget v1, v0, Li0/k1;->j:I

    .line 108
    .line 109
    const/high16 v2, -0x80000000

    .line 110
    .line 111
    and-int v3, v1, v2

    .line 112
    .line 113
    if-eqz v3, :cond_2

    .line 114
    .line 115
    sub-int/2addr v1, v2

    .line 116
    iput v1, v0, Li0/k1;->j:I

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_2
    new-instance v0, Li0/k1;

    .line 120
    .line 121
    invoke-direct {v0, p0, p2}, Li0/k1;-><init>(Li0/d;Lwf/c;)V

    .line 122
    .line 123
    .line 124
    :goto_3
    iget-object p2, v0, Li0/k1;->h:Ljava/lang/Object;

    .line 125
    .line 126
    sget-object v1, Lxf/a;->g:Lxf/a;

    .line 127
    .line 128
    iget v2, v0, Li0/k1;->j:I

    .line 129
    .line 130
    const/4 v3, 0x2

    .line 131
    const/4 v4, 0x1

    .line 132
    if-eqz v2, :cond_5

    .line 133
    .line 134
    if-eq v2, v4, :cond_4

    .line 135
    .line 136
    if-ne v2, v3, :cond_3

    .line 137
    .line 138
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_7

    .line 142
    :cond_3
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 143
    .line 144
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    const/4 p2, 0x0

    .line 148
    goto :goto_7

    .line 149
    :cond_4
    iget-object p1, v0, Li0/k1;->g:Lfg/l;

    .line 150
    .line 151
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_5
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    iget-object p2, p0, Li0/d;->i:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p2, Lj8/f;

    .line 161
    .line 162
    iput-object p1, v0, Li0/k1;->g:Lfg/l;

    .line 163
    .line 164
    iput v4, v0, Li0/k1;->j:I

    .line 165
    .line 166
    iget-object v2, p2, Lj8/f;->b:Ljava/lang/Object;

    .line 167
    .line 168
    monitor-enter v2

    .line 169
    :try_start_1
    iget-boolean v5, p2, Lj8/f;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 170
    .line 171
    monitor-exit v2

    .line 172
    if-eqz v5, :cond_6

    .line 173
    .line 174
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_6
    new-instance v2, Lqg/g;

    .line 178
    .line 179
    invoke-static {v0}, Lfb/v0;->x(Lwf/c;)Lwf/c;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    invoke-direct {v2, v4, v5}, Lqg/g;-><init>(ILwf/c;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Lqg/g;->p()V

    .line 187
    .line 188
    .line 189
    iget-object v4, p2, Lj8/f;->b:Ljava/lang/Object;

    .line 190
    .line 191
    monitor-enter v4

    .line 192
    :try_start_2
    iget-object v5, p2, Lj8/f;->c:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v5, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 197
    .line 198
    .line 199
    monitor-exit v4

    .line 200
    new-instance v4, Li0/q0;

    .line 201
    .line 202
    const/4 v5, 0x0

    .line 203
    invoke-direct {v4, p2, v5, v2}, Li0/q0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v4}, Lqg/g;->r(Lfg/l;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2}, Lqg/g;->o()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    if-ne p2, v1, :cond_7

    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_7
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 217
    .line 218
    :goto_4
    if-ne p2, v1, :cond_8

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_8
    :goto_5
    iget-object p2, p0, Li0/d;->h:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p2, Li0/d;

    .line 224
    .line 225
    const/4 v2, 0x0

    .line 226
    iput-object v2, v0, Li0/k1;->g:Lfg/l;

    .line 227
    .line 228
    iput v3, v0, Li0/k1;->j:I

    .line 229
    .line 230
    invoke-virtual {p2, p1, v0}, Li0/d;->d(Lfg/l;Lwf/c;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    if-ne p2, v1, :cond_9

    .line 235
    .line 236
    :goto_6
    move-object p2, v1

    .line 237
    :cond_9
    :goto_7
    return-object p2

    .line 238
    :catchall_1
    move-exception p1

    .line 239
    monitor-exit v4

    .line 240
    throw p1

    .line 241
    :catchall_2
    move-exception p1

    .line 242
    monitor-exit v2

    .line 243
    throw p1

    .line 244
    :pswitch_1
    new-instance v0, Lqg/g;

    .line 245
    .line 246
    invoke-static {p2}, Lfb/v0;->x(Lwf/c;)Lwf/c;

    .line 247
    .line 248
    .line 249
    move-result-object p2

    .line 250
    const/4 v1, 0x1

    .line 251
    invoke-direct {v0, v1, p2}, Lqg/g;-><init>(ILwf/c;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Lqg/g;->p()V

    .line 255
    .line 256
    .line 257
    iget-object p2, p0, Li0/d;->i:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast p2, Lbe/k;

    .line 260
    .line 261
    new-instance v1, Li0/b;

    .line 262
    .line 263
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 264
    .line 265
    .line 266
    iput-object v0, v1, Li0/b;->a:Lqg/g;

    .line 267
    .line 268
    iput-object p1, v1, Li0/b;->b:Lfg/l;

    .line 269
    .line 270
    iget-object p1, p0, Li0/d;->h:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast p1, Li0/s1;

    .line 273
    .line 274
    invoke-virtual {p2, v1, p1}, Lbe/k;->d(Ls0/b;Lfg/a;)Li0/f;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    new-instance p2, Li0/c;

    .line 279
    .line 280
    const/4 v1, 0x0

    .line 281
    invoke-direct {p2, p1, v1}, Li0/c;-><init>(Ljava/lang/Object;I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, p2}, Lqg/g;->r(Lfg/l;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Lqg/g;->o()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    return-object p1

    .line 292
    nop

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Lwf/g;)Lwf/g;
    .locals 1

    .line 1
    iget v0, p0, Li0/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lf8/i;->q0(Lwf/e;Lwf/g;)Lwf/g;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lf8/i;->q0(Lwf/e;Lwf/g;)Lwf/g;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lf8/i;->q0(Lwf/e;Lwf/g;)Lwf/g;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getKey()Lwf/f;
    .locals 1

    .line 1
    sget-object v0, Li0/e;->i:Li0/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Li0/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-interface {p1, p2, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :pswitch_1
    invoke-interface {p1, p2, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final s(Lwf/f;)Lwf/e;
    .locals 1

    .line 1
    iget v0, p0, Li0/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lf8/i;->w(Lwf/e;Lwf/f;)Lwf/e;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lf8/i;->w(Lwf/e;Lwf/f;)Lwf/e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lf8/i;->w(Lwf/e;Lwf/f;)Lwf/e;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final t(Lwf/f;)Lwf/g;
    .locals 1

    .line 1
    iget v0, p0, Li0/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lf8/i;->l0(Lwf/e;Lwf/f;)Lwf/g;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lf8/i;->l0(Lwf/e;Lwf/f;)Lwf/g;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lf8/i;->l0(Lwf/e;Lwf/f;)Lwf/g;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
