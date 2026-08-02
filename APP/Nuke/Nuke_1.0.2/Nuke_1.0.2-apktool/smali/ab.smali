.class public final synthetic Lab;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:J

.field public final synthetic i:Z

.field public final synthetic j:Luh1;

.field public final synthetic k:Lws1;


# direct methods
.method public synthetic constructor <init>(JZLuh1;Lws1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lab;->h:J

    .line 5
    .line 6
    iput-boolean p3, p0, Lab;->i:Z

    .line 7
    .line 8
    iput-object p4, p0, Lab;->j:Luh1;

    .line 9
    .line 10
    iput-object p5, p0, Lab;->k:Lws1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Lpx;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v3

    .line 19
    :goto_0
    and-int/2addr p2, v2

    .line 20
    check-cast p1, Lgo0;

    .line 21
    .line 22
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_8

    .line 27
    .line 28
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iget-wide v4, p0, Lab;->h:J

    .line 34
    .line 35
    cmp-long p2, v4, v0

    .line 36
    .line 37
    iget-boolean v0, p0, Lab;->i:Z

    .line 38
    .line 39
    iget-object v6, p0, Lab;->j:Luh1;

    .line 40
    .line 41
    iget-object p0, p0, Lab;->k:Lws1;

    .line 42
    .line 43
    sget-object v1, Lnx;->a:Leb;

    .line 44
    .line 45
    if-eqz p2, :cond_5

    .line 46
    .line 47
    const p2, 0x34c4c6

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2}, Lgo0;->W(I)V

    .line 51
    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    sget-object p2, Lsp0;->b:Luf;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    sget-object p2, Lsp0;->a:Luf;

    .line 59
    .line 60
    :goto_1
    const/16 v7, 0x20

    .line 61
    .line 62
    shr-long v7, v4, v7

    .line 63
    .line 64
    long-to-int v7, v7

    .line 65
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    const-wide v8, 0xffffffffL

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    and-long/2addr v4, v8

    .line 75
    long-to-int v4, v4

    .line 76
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    const/4 v10, 0x0

    .line 81
    const/16 v11, 0xc

    .line 82
    .line 83
    const/4 v9, 0x0

    .line 84
    invoke-static/range {v6 .. v11}, Lte;->b0(Luh1;FFFFI)Luh1;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    sget-object v5, Lsn;->s:Lqk;

    .line 89
    .line 90
    invoke-static {p2, v5, p1, v3}, Lnb2;->a(Lwf;Lqk;Lpx;I)Lob2;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iget-wide v5, p1, Lgo0;->T:J

    .line 95
    .line 96
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-virtual {p1}, Lgo0;->l()Lyy1;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-static {p1, v4}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    sget-object v7, Lhx;->c:Lgx;

    .line 109
    .line 110
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sget-object v7, Lgx;->b:Ljy;

    .line 114
    .line 115
    invoke-virtual {p1}, Lgo0;->Z()V

    .line 116
    .line 117
    .line 118
    iget-boolean v8, p1, Lgo0;->S:Z

    .line 119
    .line 120
    if-eqz v8, :cond_2

    .line 121
    .line 122
    invoke-virtual {p1, v7}, Lgo0;->k(Lxm0;)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_2
    invoke-virtual {p1}, Lgo0;->i0()V

    .line 127
    .line 128
    .line 129
    :goto_2
    sget-object v7, Lgx;->e:Llc;

    .line 130
    .line 131
    invoke-static {p1, v7, p2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sget-object p2, Lgx;->d:Llc;

    .line 135
    .line 136
    invoke-static {p1, p2, v6}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    sget-object v5, Lgx;->f:Llc;

    .line 144
    .line 145
    invoke-static {p1, v5, p2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    sget-object p2, Lgx;->g:Lv6;

    .line 149
    .line 150
    invoke-static {p1, p2}, Lyf3;->b(Lpx;Lin0;)V

    .line 151
    .line 152
    .line 153
    sget-object p2, Lgx;->c:Llc;

    .line 154
    .line 155
    invoke-static {p1, p2, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    invoke-virtual {p1}, Lgo0;->L()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    if-nez p2, :cond_3

    .line 167
    .line 168
    if-ne v4, v1, :cond_4

    .line 169
    .line 170
    :cond_3
    new-instance v4, Lbb;

    .line 171
    .line 172
    invoke-direct {v4, p0, v3}, Lbb;-><init>(Lws1;I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_4
    check-cast v4, Lxm0;

    .line 179
    .line 180
    const/4 p0, 0x6

    .line 181
    sget-object p2, Lrh1;->a:Lrh1;

    .line 182
    .line 183
    invoke-static {p2, v4, v0, p1, p0}, Lrp0;->M(Luh1;Lxm0;ZLpx;I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, v2}, Lgo0;->p(Z)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v3}, Lgo0;->p(Z)V

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_5
    const p2, 0x42f938

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, p2}, Lgo0;->W(I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result p2

    .line 203
    invoke-virtual {p1}, Lgo0;->L()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    if-nez p2, :cond_6

    .line 208
    .line 209
    if-ne v4, v1, :cond_7

    .line 210
    .line 211
    :cond_6
    new-instance v4, Lbb;

    .line 212
    .line 213
    invoke-direct {v4, p0, v2}, Lbb;-><init>(Lws1;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :cond_7
    check-cast v4, Lxm0;

    .line 220
    .line 221
    invoke-static {v6, v4, v0, p1, v3}, Lrp0;->M(Luh1;Lxm0;ZLpx;I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, v3}, Lgo0;->p(Z)V

    .line 225
    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_8
    invoke-virtual {p1}, Lgo0;->R()V

    .line 229
    .line 230
    .line 231
    :goto_3
    sget-object p0, La83;->a:La83;

    .line 232
    .line 233
    return-object p0
.end method
