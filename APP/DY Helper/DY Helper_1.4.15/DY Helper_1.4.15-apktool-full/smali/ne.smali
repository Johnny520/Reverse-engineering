.class public final Lne;
.super Ly12;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ι:I

.field public κ:I

.field public λ:Ljava/lang/Object;

.field public μ:Ljava/lang/Object;

.field public final synthetic ν:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lop;I)V
    .locals 0

    .line 1
    iput p4, p0, Lne;->ι:I

    .line 2
    .line 3
    iput-object p1, p0, Lne;->μ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lne;->ν:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Ly12;-><init>(ILop;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lwc;Lop;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lne;->ι:I

    .line 12
    iput-object p1, p0, Lne;->ν:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ly12;-><init>(ILop;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lne;->ι:I

    .line 2
    .line 3
    check-cast p1, Lbq;

    .line 4
    .line 5
    check-cast p2, Lop;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p2, p1}, Lne;->η(Lop;Ljava/lang/Object;)Lop;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lne;

    .line 15
    .line 16
    sget-object p1, Ls62;->α:Ls62;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lne;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lne;->η(Lop;Ljava/lang/Object;)Lop;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lne;

    .line 28
    .line 29
    sget-object p1, Ls62;->α:Ls62;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lne;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Lne;->η(Lop;Ljava/lang/Object;)Lop;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Lne;

    .line 41
    .line 42
    sget-object p1, Ls62;->α:Ls62;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lne;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final η(Lop;Ljava/lang/Object;)Lop;
    .locals 3

    .line 1
    iget v0, p0, Lne;->ι:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lne;

    .line 7
    .line 8
    iget-object v1, p0, Lne;->μ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljl1;

    .line 11
    .line 12
    iget-object p0, p0, Lne;->ν:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lk3;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v0, v1, p0, p1, v2}, Lne;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lop;I)V

    .line 18
    .line 19
    .line 20
    iput-object p2, v0, Lne;->λ:Ljava/lang/Object;

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p2, Lne;

    .line 24
    .line 25
    iget-object p0, p0, Lne;->ν:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lwc;

    .line 28
    .line 29
    invoke-direct {p2, p0, p1}, Lne;-><init>(Lwc;Lop;)V

    .line 30
    .line 31
    .line 32
    return-object p2

    .line 33
    :pswitch_1
    new-instance v0, Lne;

    .line 34
    .line 35
    iget-object v1, p0, Lne;->μ:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lg40;

    .line 38
    .line 39
    iget-object p0, p0, Lne;->ν:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lse;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-direct {v0, v1, p0, p1, v2}, Lne;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lop;I)V

    .line 45
    .line 46
    .line 47
    iput-object p2, v0, Lne;->λ:Ljava/lang/Object;

    .line 48
    .line 49
    return-object v0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lne;->ι:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcq;->ε:Lcq;

    .line 7
    .line 8
    iget v1, p0, Lne;->κ:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Ls62;->α:Ls62;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lne;->λ:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lbq;

    .line 34
    .line 35
    iget-object v1, p0, Lne;->μ:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Ljl1;

    .line 38
    .line 39
    iget-object v3, p0, Lne;->ν:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Lk3;

    .line 42
    .line 43
    iput v2, p0, Lne;->κ:I

    .line 44
    .line 45
    invoke-virtual {v1, p1, v3, p0}, Ljl1;->α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :goto_0
    return-object v0

    .line 49
    :pswitch_0
    sget-object v0, Lcq;->ε:Lcq;

    .line 50
    .line 51
    iget v1, p0, Lne;->κ:I

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    const/4 v3, 0x1

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    if-ne v1, v3, :cond_2

    .line 58
    .line 59
    iget-object v1, p0, Lne;->μ:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Lvc;

    .line 62
    .line 63
    iget-object v4, p0, Lne;->λ:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v4, Lme;

    .line 66
    .line 67
    :try_start_0
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    goto :goto_4

    .line 73
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    goto :goto_3

    .line 80
    :cond_3
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lne;->ν:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v4, p1

    .line 86
    check-cast v4, Lwc;

    .line 87
    .line 88
    :try_start_1
    new-instance p1, Lvc;

    .line 89
    .line 90
    invoke-direct {p1, v4}, Lvc;-><init>(Lwc;)V

    .line 91
    .line 92
    .line 93
    move-object v1, p1

    .line 94
    :cond_4
    :goto_1
    iput-object v4, p0, Lne;->λ:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v1, p0, Lne;->μ:Ljava/lang/Object;

    .line 97
    .line 98
    iput v3, p0, Lne;->κ:I

    .line 99
    .line 100
    invoke-virtual {v1, p0}, Lvc;->β(Lpp;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-ne p1, v0, :cond_5

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_5
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_7

    .line 114
    .line 115
    invoke-virtual {v1}, Lvc;->γ()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Ls62;

    .line 120
    .line 121
    sget-object p1, Lta0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 122
    .line 123
    const/4 v5, 0x0

    .line 124
    invoke-virtual {p1, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 125
    .line 126
    .line 127
    sget-object p1, Lax1;->γ:Ljava/lang/Object;

    .line 128
    .line 129
    monitor-enter p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    :try_start_2
    sget-object v6, Lax1;->κ:Lsa0;

    .line 131
    .line 132
    iget-object v6, v6, Lf21;->θ:Lc21;

    .line 133
    .line 134
    if-eqz v6, :cond_6

    .line 135
    .line 136
    invoke-virtual {v6}, Lc21;->θ()Z

    .line 137
    .line 138
    .line 139
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 140
    if-ne v6, v3, :cond_6

    .line 141
    .line 142
    move v5, v3

    .line 143
    :cond_6
    :try_start_3
    monitor-exit p1

    .line 144
    if-eqz v5, :cond_4

    .line 145
    .line 146
    invoke-static {}, Lax1;->α()V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :catchall_1
    move-exception p0

    .line 151
    monitor-exit p1

    .line 152
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 153
    :cond_7
    invoke-interface {v4, v2}, Lme;->ν(Ljava/util/concurrent/CancellationException;)V

    .line 154
    .line 155
    .line 156
    sget-object v0, Ls62;->α:Ls62;

    .line 157
    .line 158
    :goto_3
    return-object v0

    .line 159
    :goto_4
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 160
    :catchall_2
    move-exception p1

    .line 161
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 162
    .line 163
    if-eqz v0, :cond_8

    .line 164
    .line 165
    move-object v2, p0

    .line 166
    check-cast v2, Ljava/util/concurrent/CancellationException;

    .line 167
    .line 168
    :cond_8
    if-nez v2, :cond_9

    .line 169
    .line 170
    const-string v0, "Channel was consumed, consumer had failed"

    .line 171
    .line 172
    new-instance v2, Ljava/util/concurrent/CancellationException;

    .line 173
    .line 174
    invoke-direct {v2, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 178
    .line 179
    .line 180
    :cond_9
    invoke-interface {v4, v2}, Lme;->ν(Ljava/util/concurrent/CancellationException;)V

    .line 181
    .line 182
    .line 183
    throw p1

    .line 184
    :pswitch_1
    sget-object v0, Ls62;->α:Ls62;

    .line 185
    .line 186
    sget-object v1, Lcq;->ε:Lcq;

    .line 187
    .line 188
    iget v2, p0, Lne;->κ:I

    .line 189
    .line 190
    const/4 v3, 0x1

    .line 191
    if-eqz v2, :cond_b

    .line 192
    .line 193
    if-ne v2, v3, :cond_a

    .line 194
    .line 195
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_a
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 200
    .line 201
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    const/4 v0, 0x0

    .line 205
    goto :goto_6

    .line 206
    :cond_b
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    iget-object p1, p0, Lne;->λ:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast p1, Lbq;

    .line 212
    .line 213
    iget-object v2, p0, Lne;->μ:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v2, Lg40;

    .line 216
    .line 217
    iget-object v4, p0, Lne;->ν:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v4, Lse;

    .line 220
    .line 221
    iget-object v5, v4, Lse;->ε:Lup;

    .line 222
    .line 223
    iget v6, v4, Lse;->ζ:I

    .line 224
    .line 225
    const/4 v7, -0x3

    .line 226
    if-ne v6, v7, :cond_c

    .line 227
    .line 228
    const/4 v6, -0x2

    .line 229
    :cond_c
    iget-object v7, v4, Lse;->η:Luc;

    .line 230
    .line 231
    sget-object v8, Leq;->η:Leq;

    .line 232
    .line 233
    new-instance v9, Loe;

    .line 234
    .line 235
    const/4 v10, 0x0

    .line 236
    const/4 v11, 0x0

    .line 237
    invoke-direct {v9, v4, v11, v10}, Loe;-><init>(Ljava/lang/Object;Lop;I)V

    .line 238
    .line 239
    .line 240
    const/4 v4, 0x4

    .line 241
    invoke-static {v6, v7, v4}, Lln0;->β(ILuc;I)Lwc;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    invoke-interface {p1}, Lbq;->δ()Lup;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-static {p1, v5, v3}, Ls1;->κ(Lup;Lup;Z)Lup;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    sget-object v5, Llt;->α:Ljr;

    .line 254
    .line 255
    if-eq p1, v5, :cond_d

    .line 256
    .line 257
    sget-object v6, Lx;->Γ:Lx;

    .line 258
    .line 259
    invoke-interface {p1, v6}, Lup;->θ(Ltp;)Lsp;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    if-nez v6, :cond_d

    .line 264
    .line 265
    invoke-interface {p1, v5}, Lup;->η(Lup;)Lup;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    :cond_d
    new-instance v5, Lxi1;

    .line 270
    .line 271
    invoke-direct {v5, p1, v4}, Lxi1;-><init>(Lup;Lwc;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v5, v8, v5, v9}, Lο;->в(Leq;Lο;Le80;)V

    .line 275
    .line 276
    .line 277
    iput v3, p0, Lne;->κ:I

    .line 278
    .line 279
    invoke-static {v2, v5, v3, p0}, Lyh;->ω(Lg40;Lxi1;ZLpp;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    if-ne p0, v1, :cond_e

    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_e
    move-object p0, v0

    .line 287
    :goto_5
    if-ne p0, v1, :cond_f

    .line 288
    .line 289
    move-object v0, v1

    .line 290
    :cond_f
    :goto_6
    return-object v0

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
