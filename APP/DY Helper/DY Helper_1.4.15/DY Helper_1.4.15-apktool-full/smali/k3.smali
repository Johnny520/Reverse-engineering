.class public final Lk3;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lsp;


# instance fields
.field public final synthetic ε:I

.field public final ζ:Ljava/lang/Object;

.field public final η:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/Choreographer;Lh3;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk3;->ε:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lk3;->ζ:Ljava/lang/Object;

    .line 22
    iput-object p2, p0, Lk3;->η:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldl1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lk3;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lk3;->ζ:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance p1, Lb8;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, v0}, Lb8;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lk3;->η:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lk3;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lk3;->ε:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3;->ζ:Ljava/lang/Object;

    .line 19
    new-instance p1, Lzz;

    invoke-direct {p1}, Lzz;-><init>()V

    iput-object p1, p0, Lk3;->η:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getKey()Ltp;
    .locals 0

    .line 1
    sget-object p0, Lxn0;->η:Lxn0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final α(La80;Lpp;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lk3;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Laa1;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Laa1;

    .line 12
    .line 13
    iget v1, v0, Laa1;->λ:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Laa1;->λ:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Laa1;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Laa1;-><init>(Lk3;Lpp;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Laa1;->ι:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, Lcq;->ε:Lcq;

    .line 33
    .line 34
    iget v2, v0, Laa1;->λ:I

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    const/4 v4, 0x1

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p2, 0x0

    .line 54
    goto :goto_4

    .line 55
    :cond_2
    iget-object p1, v0, Laa1;->θ:La80;

    .line 56
    .line 57
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p2, p0, Lk3;->η:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p2, Lzz;

    .line 67
    .line 68
    iput-object p1, v0, Laa1;->θ:La80;

    .line 69
    .line 70
    iput v4, v0, Laa1;->λ:I

    .line 71
    .line 72
    iget-object v2, p2, Lzz;->β:Ljava/lang/Object;

    .line 73
    .line 74
    monitor-enter v2

    .line 75
    :try_start_0
    iget-boolean v5, p2, Lzz;->α:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 76
    .line 77
    monitor-exit v2

    .line 78
    if-eqz v5, :cond_4

    .line 79
    .line 80
    sget-object p2, Ls62;->α:Ls62;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    new-instance v2, Lae;

    .line 84
    .line 85
    invoke-static {v0}, Lxb;->Θ(Lop;)Lop;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-direct {v2, v4, v5}, Lae;-><init>(ILop;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Lae;->τ()V

    .line 93
    .line 94
    .line 95
    iget-object v4, p2, Lzz;->β:Ljava/lang/Object;

    .line 96
    .line 97
    monitor-enter v4

    .line 98
    :try_start_1
    iget-object v5, p2, Lzz;->γ:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v5, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    .line 104
    .line 105
    monitor-exit v4

    .line 106
    new-instance v4, Lxv;

    .line 107
    .line 108
    const/4 v5, 0x2

    .line 109
    invoke-direct {v4, p2, v5, v2}, Lxv;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4}, Lae;->φ(La80;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Lae;->σ()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    if-ne p2, v1, :cond_5

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    sget-object p2, Ls62;->α:Ls62;

    .line 123
    .line 124
    :goto_1
    if-ne p2, v1, :cond_6

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_6
    :goto_2
    iget-object p0, p0, Lk3;->ζ:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p0, Lk3;

    .line 130
    .line 131
    const/4 p2, 0x0

    .line 132
    iput-object p2, v0, Laa1;->θ:La80;

    .line 133
    .line 134
    iput v3, v0, Laa1;->λ:I

    .line 135
    .line 136
    invoke-virtual {p0, p1, v0}, Lk3;->α(La80;Lpp;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    if-ne p2, v1, :cond_7

    .line 141
    .line 142
    :goto_3
    move-object p2, v1

    .line 143
    :cond_7
    :goto_4
    return-object p2

    .line 144
    :catchall_0
    move-exception p0

    .line 145
    monitor-exit v4

    .line 146
    throw p0

    .line 147
    :catchall_1
    move-exception p0

    .line 148
    monitor-exit v2

    .line 149
    throw p0

    .line 150
    :pswitch_0
    new-instance v0, Lae;

    .line 151
    .line 152
    invoke-static {p2}, Lxb;->Θ(Lop;)Lop;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    const/4 v1, 0x1

    .line 157
    invoke-direct {v0, v1, p2}, Lae;-><init>(ILop;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Lae;->τ()V

    .line 161
    .line 162
    .line 163
    iget-object p2, p0, Lk3;->η:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p2, Lb8;

    .line 166
    .line 167
    new-instance v1, Lnc;

    .line 168
    .line 169
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 170
    .line 171
    .line 172
    iput-object v0, v1, Lnc;->α:Lae;

    .line 173
    .line 174
    iput-object p1, v1, Lnc;->β:La80;

    .line 175
    .line 176
    iget-object p0, p0, Lk3;->ζ:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p0, Ldl1;

    .line 179
    .line 180
    invoke-virtual {p2, v1, p0}, Lb8;->δ(La8;Lp70;)Lbe;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    new-instance p1, Loc;

    .line 185
    .line 186
    const/4 p2, 0x0

    .line 187
    invoke-direct {p1, p2, p0}, Loc;-><init>(ILjava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, p1}, Lae;->φ(La80;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Lae;->σ()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    return-object p0

    .line 198
    :pswitch_1
    iget-object v0, p0, Lk3;->η:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, Lh3;

    .line 201
    .line 202
    new-instance v1, Lae;

    .line 203
    .line 204
    invoke-static {p2}, Lxb;->Θ(Lop;)Lop;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    const/4 v2, 0x1

    .line 209
    invoke-direct {v1, v2, p2}, Lae;-><init>(ILop;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Lae;->τ()V

    .line 213
    .line 214
    .line 215
    new-instance p2, Lj3;

    .line 216
    .line 217
    invoke-direct {p2, v1, p0, p1}, Lj3;-><init>(Lae;Lk3;La80;)V

    .line 218
    .line 219
    .line 220
    iget-object p1, v0, Lh3;->η:Landroid/view/Choreographer;

    .line 221
    .line 222
    iget-object v3, p0, Lk3;->ζ:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v3, Landroid/view/Choreographer;

    .line 225
    .line 226
    invoke-static {p1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    if-eqz p1, :cond_9

    .line 231
    .line 232
    iget-object p0, v0, Lh3;->ι:Ljava/lang/Object;

    .line 233
    .line 234
    monitor-enter p0

    .line 235
    :try_start_2
    iget-object p1, v0, Lh3;->λ:Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    iget-boolean p1, v0, Lh3;->ξ:Z

    .line 241
    .line 242
    if-nez p1, :cond_8

    .line 243
    .line 244
    iput-boolean v2, v0, Lh3;->ξ:Z

    .line 245
    .line 246
    iget-object p1, v0, Lh3;->η:Landroid/view/Choreographer;

    .line 247
    .line 248
    iget-object v2, v0, Lh3;->ο:Lg3;

    .line 249
    .line 250
    invoke-virtual {p1, v2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 251
    .line 252
    .line 253
    goto :goto_5

    .line 254
    :catchall_2
    move-exception p1

    .line 255
    goto :goto_6

    .line 256
    :cond_8
    :goto_5
    monitor-exit p0

    .line 257
    new-instance p0, Li3;

    .line 258
    .line 259
    const/4 p1, 0x0

    .line 260
    invoke-direct {p0, v0, p1, p2}, Li3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, p0}, Lae;->φ(La80;)V

    .line 264
    .line 265
    .line 266
    goto :goto_7

    .line 267
    :goto_6
    monitor-exit p0

    .line 268
    throw p1

    .line 269
    :cond_9
    iget-object p1, p0, Lk3;->ζ:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast p1, Landroid/view/Choreographer;

    .line 272
    .line 273
    invoke-virtual {p1, p2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 274
    .line 275
    .line 276
    new-instance p1, Li3;

    .line 277
    .line 278
    const/4 v0, 0x1

    .line 279
    invoke-direct {p1, p0, v0, p2}, Li3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1, p1}, Lae;->φ(La80;)V

    .line 283
    .line 284
    .line 285
    :goto_7
    invoke-virtual {v1}, Lae;->σ()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    return-object p0

    .line 290
    nop

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final η(Lup;)Lup;
    .locals 1

    .line 1
    iget v0, p0, Lk3;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lpd2;->Θ(Lsp;Lup;)Lup;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lpd2;->Θ(Lsp;Lup;)Lup;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lpd2;->Θ(Lsp;Lup;)Lup;

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

.method public final θ(Ltp;)Lsp;
    .locals 1

    .line 1
    iget v0, p0, Lk3;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lpd2;->υ(Lsp;Ltp;)Lsp;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lpd2;->υ(Lsp;Ltp;)Lsp;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lpd2;->υ(Lsp;Ltp;)Lsp;

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

.method public final λ(Le80;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lk3;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2, p0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-interface {p1, p2, p0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-interface {p1, p2, p0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public final ξ(Ltp;)Lup;
    .locals 1

    .line 1
    iget v0, p0, Lk3;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lpd2;->Δ(Lsp;Ltp;)Lup;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lpd2;->Δ(Lsp;Ltp;)Lup;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lpd2;->Δ(Lsp;Ltp;)Lup;

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
