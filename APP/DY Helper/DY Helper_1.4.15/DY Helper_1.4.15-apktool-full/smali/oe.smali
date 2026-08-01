.class public final Loe;
.super Ly12;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ι:I

.field public κ:I

.field public synthetic λ:Ljava/lang/Object;

.field public final synthetic μ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lop;I)V
    .locals 0

    .line 1
    iput p4, p0, Loe;->ι:I

    .line 2
    .line 3
    iput-object p1, p0, Loe;->λ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Loe;->μ:Ljava/lang/Object;

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

.method public synthetic constructor <init>(Ljava/lang/Object;Lop;I)V
    .locals 0

    .line 12
    iput p3, p0, Loe;->ι:I

    iput-object p1, p0, Loe;->μ:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ly12;-><init>(ILop;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Loe;->ι:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lbq;

    .line 7
    .line 8
    check-cast p2, Lop;

    .line 9
    .line 10
    invoke-virtual {p0, p2, p1}, Loe;->η(Lop;Ljava/lang/Object;)Lop;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Loe;

    .line 15
    .line 16
    sget-object p1, Ls62;->α:Ls62;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Loe;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p2, Lop;

    .line 24
    .line 25
    invoke-virtual {p0, p2, p1}, Loe;->η(Lop;Ljava/lang/Object;)Lop;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Loe;

    .line 30
    .line 31
    sget-object p1, Ls62;->α:Ls62;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Loe;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_1
    check-cast p1, Lbq;

    .line 39
    .line 40
    check-cast p2, Lop;

    .line 41
    .line 42
    invoke-virtual {p0, p2, p1}, Loe;->η(Lop;Ljava/lang/Object;)Lop;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Loe;

    .line 47
    .line 48
    sget-object p1, Ls62;->α:Ls62;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Loe;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    sget-object p0, Lcq;->ε:Lcq;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_2
    check-cast p1, Lg40;

    .line 57
    .line 58
    check-cast p2, Lop;

    .line 59
    .line 60
    invoke-virtual {p0, p2, p1}, Loe;->η(Lop;Ljava/lang/Object;)Lop;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Loe;

    .line 65
    .line 66
    sget-object p1, Ls62;->α:Ls62;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Loe;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_3
    check-cast p1, Lxi1;

    .line 74
    .line 75
    check-cast p2, Lop;

    .line 76
    .line 77
    invoke-virtual {p0, p2, p1}, Loe;->η(Lop;Ljava/lang/Object;)Lop;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, Loe;

    .line 82
    .line 83
    sget-object p1, Ls62;->α:Ls62;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Loe;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final η(Lop;Ljava/lang/Object;)Lop;
    .locals 2

    .line 1
    iget v0, p0, Loe;->ι:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p2, Loe;

    .line 7
    .line 8
    iget-object v0, p0, Loe;->λ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lkl1;

    .line 11
    .line 12
    iget-object p0, p0, Loe;->μ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Landroid/view/View;

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    invoke-direct {p2, v0, p0, p1, v1}, Loe;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lop;I)V

    .line 18
    .line 19
    .line 20
    return-object p2

    .line 21
    :pswitch_0
    new-instance v0, Loe;

    .line 22
    .line 23
    iget-object p0, p0, Loe;->μ:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lg40;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, p0, p1, v1}, Loe;-><init>(Ljava/lang/Object;Lop;I)V

    .line 29
    .line 30
    .line 31
    iput-object p2, v0, Loe;->λ:Ljava/lang/Object;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_1
    new-instance p2, Loe;

    .line 35
    .line 36
    iget-object v0, p0, Loe;->λ:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ld02;

    .line 39
    .line 40
    iget-object p0, p0, Loe;->μ:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lz01;

    .line 43
    .line 44
    const/4 v1, 0x2

    .line 45
    invoke-direct {p2, v0, p0, p1, v1}, Loe;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lop;I)V

    .line 46
    .line 47
    .line 48
    return-object p2

    .line 49
    :pswitch_2
    new-instance v0, Loe;

    .line 50
    .line 51
    iget-object p0, p0, Loe;->μ:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Lse;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-direct {v0, p0, p1, v1}, Loe;-><init>(Ljava/lang/Object;Lop;I)V

    .line 57
    .line 58
    .line 59
    iput-object p2, v0, Loe;->λ:Ljava/lang/Object;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_3
    new-instance v0, Loe;

    .line 63
    .line 64
    iget-object p0, p0, Loe;->μ:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Lse;

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-direct {v0, p0, p1, v1}, Loe;-><init>(Ljava/lang/Object;Lop;I)V

    .line 70
    .line 71
    .line 72
    iput-object p2, v0, Loe;->λ:Ljava/lang/Object;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Loe;->ι:I

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, Loe;->μ:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    sget-object v4, Ls62;->α:Ls62;

    .line 9
    .line 10
    sget-object v5, Lcq;->ε:Lcq;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Loe;->λ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lkl1;

    .line 19
    .line 20
    check-cast v2, Landroid/view/View;

    .line 21
    .line 22
    iget v7, p0, Loe;->κ:I

    .line 23
    .line 24
    const v8, 0x7f090041

    .line 25
    .line 26
    .line 27
    if-eqz v7, :cond_1

    .line 28
    .line 29
    if-ne v7, v3, :cond_0

    .line 30
    .line 31
    :try_start_0
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_3

    .line 37
    :cond_0
    invoke-static {v1}, Lγ;->ρ(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    move-object v4, v6

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :try_start_1
    iput v3, p0, Loe;->κ:I

    .line 46
    .line 47
    iget-object p1, v0, Lkl1;->φ:Lf02;

    .line 48
    .line 49
    new-instance v1, Lgl1;

    .line 50
    .line 51
    const/4 v3, 0x2

    .line 52
    const/4 v7, 0x0

    .line 53
    invoke-direct {v1, v3, v6, v7}, Lgl1;-><init>(ILop;I)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v1, p0}, Lbd;->σ(Lf40;Le80;Lpp;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    if-ne p0, v5, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move-object p0, v4

    .line 64
    :goto_0
    if-ne p0, v5, :cond_3

    .line 65
    .line 66
    move-object v4, v5

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    :goto_1
    invoke-static {v2}, Ldd2;->α(Landroid/view/View;)Lun;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-ne p0, v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {v2, v8, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    :goto_2
    return-object v4

    .line 78
    :goto_3
    invoke-static {v2}, Ldd2;->α(Landroid/view/View;)Lun;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v0, :cond_5

    .line 83
    .line 84
    invoke-virtual {v2, v8, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_5
    throw p0

    .line 88
    :pswitch_0
    iget v0, p0, Loe;->κ:I

    .line 89
    .line 90
    if-eqz v0, :cond_7

    .line 91
    .line 92
    if-ne v0, v3, :cond_6

    .line 93
    .line 94
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_6
    invoke-static {v1}, Lγ;->ρ(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    move-object v4, v6

    .line 102
    goto :goto_4

    .line 103
    :cond_7
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Loe;->λ:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Lg40;

    .line 109
    .line 110
    iput v3, p0, Loe;->κ:I

    .line 111
    .line 112
    invoke-interface {v2, p1, p0}, Lg40;->δ(Ljava/lang/Object;Lop;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-ne p0, v5, :cond_8

    .line 117
    .line 118
    move-object v4, v5

    .line 119
    :cond_8
    :goto_4
    return-object v4

    .line 120
    :pswitch_1
    iget v0, p0, Loe;->κ:I

    .line 121
    .line 122
    if-eqz v0, :cond_a

    .line 123
    .line 124
    if-eq v0, v3, :cond_9

    .line 125
    .line 126
    invoke-static {v1}, Lγ;->ρ(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    move-object v5, v6

    .line 130
    goto :goto_5

    .line 131
    :cond_9
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_a
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, Loe;->λ:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p1, Ld02;

    .line 141
    .line 142
    new-instance v0, Ly01;

    .line 143
    .line 144
    check-cast v2, Lz01;

    .line 145
    .line 146
    invoke-direct {v0, v2}, Ly01;-><init>(Lz01;)V

    .line 147
    .line 148
    .line 149
    iput v3, p0, Loe;->κ:I

    .line 150
    .line 151
    invoke-interface {p1, v0, p0}, Lf40;->γ(Lg40;Lop;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    if-ne p0, v5, :cond_b

    .line 156
    .line 157
    :goto_5
    return-object v5

    .line 158
    :cond_b
    :goto_6
    new-instance p0, Lpm;

    .line 159
    .line 160
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 161
    .line 162
    .line 163
    throw p0

    .line 164
    :pswitch_2
    iget v0, p0, Loe;->κ:I

    .line 165
    .line 166
    if-eqz v0, :cond_d

    .line 167
    .line 168
    if-ne v0, v3, :cond_c

    .line 169
    .line 170
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    goto :goto_7

    .line 174
    :cond_c
    invoke-static {v1}, Lγ;->ρ(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    move-object v4, v6

    .line 178
    goto :goto_7

    .line 179
    :cond_d
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    iget-object p1, p0, Loe;->λ:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast p1, Lg40;

    .line 185
    .line 186
    check-cast v2, Lse;

    .line 187
    .line 188
    iput v3, p0, Loe;->κ:I

    .line 189
    .line 190
    invoke-virtual {v2, p1, p0}, Lse;->α(Lg40;Lpp;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    if-ne p0, v5, :cond_e

    .line 195
    .line 196
    move-object v4, v5

    .line 197
    :cond_e
    :goto_7
    return-object v4

    .line 198
    :pswitch_3
    iget v0, p0, Loe;->κ:I

    .line 199
    .line 200
    if-eqz v0, :cond_10

    .line 201
    .line 202
    if-ne v0, v3, :cond_f

    .line 203
    .line 204
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    goto :goto_9

    .line 208
    :cond_f
    invoke-static {v1}, Lγ;->ρ(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    move-object v4, v6

    .line 212
    goto :goto_9

    .line 213
    :cond_10
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    iget-object p1, p0, Loe;->λ:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast p1, Lxi1;

    .line 219
    .line 220
    check-cast v2, Lse;

    .line 221
    .line 222
    iput v3, p0, Loe;->κ:I

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    new-instance v0, Lrs1;

    .line 228
    .line 229
    invoke-direct {v0, p1}, Lrs1;-><init>(Lxi1;)V

    .line 230
    .line 231
    .line 232
    check-cast p0, Lpp;

    .line 233
    .line 234
    invoke-virtual {v2, v0, p0}, Lse;->α(Lg40;Lpp;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    if-ne p0, v5, :cond_11

    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_11
    move-object p0, v4

    .line 242
    :goto_8
    if-ne p0, v5, :cond_12

    .line 243
    .line 244
    move-object v4, v5

    .line 245
    :cond_12
    :goto_9
    return-object v4

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
