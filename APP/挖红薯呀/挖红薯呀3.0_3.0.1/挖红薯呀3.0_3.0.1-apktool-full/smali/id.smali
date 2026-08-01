.class public final Lid;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lmh;


# direct methods
.method public synthetic constructor <init>(Lmh;I)V
    .locals 0

    .line 1
    iput p2, p0, Lid;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lid;->e:Lmh;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lid;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    sget-object v2, Lme0;->a:Lme0;

    .line 6
    .line 7
    iget-object p0, p0, Lid;->e:Lmh;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Lji;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    and-int/lit8 v0, p2, 0x3

    .line 24
    .line 25
    if-eq v0, v3, :cond_0

    .line 26
    .line 27
    move v0, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v4

    .line 30
    :goto_0
    and-int/2addr p2, v5

    .line 31
    check-cast p1, Lpi;

    .line 32
    .line 33
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_4

    .line 38
    .line 39
    sget-object p2, Ln2;->e:Lha;

    .line 40
    .line 41
    invoke-static {p2, v4}, Lza;->d(Lha;Z)Lxd0;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-static {p1}, Lo30;->p(Lji;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-virtual {p1}, Lpi;->l()Lfq0;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {p1, v2}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    sget-object v6, Lfi;->b:Lei;

    .line 58
    .line 59
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    sget-object v6, Lei;->b:Lcj;

    .line 63
    .line 64
    invoke-virtual {p1}, Lpi;->Z()V

    .line 65
    .line 66
    .line 67
    iget-boolean v7, p1, Lpi;->S:Z

    .line 68
    .line 69
    if-eqz v7, :cond_1

    .line 70
    .line 71
    invoke-virtual {p1, v6}, Lpi;->k(Lhw;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual {p1}, Lpi;->j0()V

    .line 76
    .line 77
    .line 78
    :goto_1
    sget-object v6, Lei;->e:Lm7;

    .line 79
    .line 80
    invoke-static {p1, v6, p2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object p2, Lei;->d:Lm7;

    .line 84
    .line 85
    invoke-static {p1, p2, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object p2, Lei;->f:Lm7;

    .line 89
    .line 90
    iget-boolean v3, p1, Lpi;->S:Z

    .line 91
    .line 92
    if-nez v3, :cond_2

    .line 93
    .line 94
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-static {v3, v6}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-nez v3, :cond_3

    .line 107
    .line 108
    :cond_2
    invoke-static {v0, p1, v0, p2}, Lt1;->o(ILpi;ILm7;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    sget-object p2, Lei;->c:Lm7;

    .line 112
    .line 113
    invoke-static {p1, p2, v2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-virtual {p0, p1, p2}, Lmh;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v5}, Lpi;->p(Z)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    invoke-virtual {p1}, Lpi;->R()V

    .line 128
    .line 129
    .line 130
    :goto_2
    return-object v1

    .line 131
    :pswitch_0
    check-cast p1, Lji;

    .line 132
    .line 133
    check-cast p2, Ljava/lang/Number;

    .line 134
    .line 135
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    and-int/lit8 v0, p2, 0x3

    .line 140
    .line 141
    if-eq v0, v3, :cond_5

    .line 142
    .line 143
    move v0, v5

    .line 144
    goto :goto_3

    .line 145
    :cond_5
    move v0, v4

    .line 146
    :goto_3
    and-int/2addr p2, v5

    .line 147
    check-cast p1, Lpi;

    .line 148
    .line 149
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-eqz p2, :cond_9

    .line 154
    .line 155
    sget-object p2, Ln2;->q:Lfa;

    .line 156
    .line 157
    invoke-static {p2, p1, v4}, Ltf;->a(Lfa;Lji;I)Lvf;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-static {p1}, Lo30;->p(Lji;)I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    invoke-virtual {p1}, Lpi;->l()Lfq0;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-static {p1, v2}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    sget-object v4, Lfi;->b:Lei;

    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    sget-object v4, Lei;->b:Lcj;

    .line 179
    .line 180
    invoke-virtual {p1}, Lpi;->Z()V

    .line 181
    .line 182
    .line 183
    iget-boolean v6, p1, Lpi;->S:Z

    .line 184
    .line 185
    if-eqz v6, :cond_6

    .line 186
    .line 187
    invoke-virtual {p1, v4}, Lpi;->k(Lhw;)V

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_6
    invoke-virtual {p1}, Lpi;->j0()V

    .line 192
    .line 193
    .line 194
    :goto_4
    sget-object v4, Lei;->e:Lm7;

    .line 195
    .line 196
    invoke-static {p1, v4, p2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    sget-object p2, Lei;->d:Lm7;

    .line 200
    .line 201
    invoke-static {p1, p2, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    sget-object p2, Lei;->f:Lm7;

    .line 205
    .line 206
    iget-boolean v3, p1, Lpi;->S:Z

    .line 207
    .line 208
    if-nez v3, :cond_7

    .line 209
    .line 210
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    invoke-static {v3, v4}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-nez v3, :cond_8

    .line 223
    .line 224
    :cond_7
    invoke-static {v0, p1, v0, p2}, Lt1;->o(ILpi;ILm7;)V

    .line 225
    .line 226
    .line 227
    :cond_8
    sget-object p2, Lei;->c:Lm7;

    .line 228
    .line 229
    invoke-static {p1, p2, v2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    const/4 p2, 0x6

    .line 233
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    sget-object v0, Lxf;->a:Lxf;

    .line 238
    .line 239
    invoke-virtual {p0, v0, p1, p2}, Lmh;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1, v5}, Lpi;->p(Z)V

    .line 243
    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_9
    invoke-virtual {p1}, Lpi;->R()V

    .line 247
    .line 248
    .line 249
    :goto_5
    return-object v1

    .line 250
    nop

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
