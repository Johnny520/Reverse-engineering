.class public final synthetic Lz7;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Luh1;

.field public final synthetic j:J


# direct methods
.method public synthetic constructor <init>(JLuh1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lz7;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lz7;->j:J

    .line 8
    .line 9
    iput-object p3, p0, Lz7;->i:Luh1;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Luh1;JII)V
    .locals 0

    .line 12
    iput p5, p0, Lz7;->h:I

    iput-object p1, p0, Lz7;->i:Luh1;

    iput-wide p2, p0, Lz7;->j:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lz7;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lz7;->i:Luh1;

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-wide v4, p0, Lz7;->j:J

    .line 9
    .line 10
    check-cast p1, Lpx;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v3}, Lpp0;->N(I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {v1, v4, v5, p1, p0}, Ltp0;->e(Luh1;JLpx;I)V

    .line 25
    .line 26
    .line 27
    return-object v2

    .line 28
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v3}, Lpp0;->N(I)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {v1, v4, v5, p1, p0}, Leu;->l(Luh1;JLpx;I)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {v3}, Lpp0;->N(I)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {v1, v4, v5, p1, p0}, Leu;->k(Luh1;JLpx;I)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {v3}, Lpp0;->N(I)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {v1, v4, v5, p1, p0}, Lqp0;->g(Luh1;JLpx;I)V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    and-int/lit8 v0, p2, 0x3

    .line 66
    .line 67
    const/4 v1, 0x2

    .line 68
    const/4 v6, 0x0

    .line 69
    if-eq v0, v1, :cond_0

    .line 70
    .line 71
    move v0, v3

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move v0, v6

    .line 74
    :goto_0
    and-int/2addr p2, v3

    .line 75
    check-cast p1, Lgo0;

    .line 76
    .line 77
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-eqz p2, :cond_3

    .line 82
    .line 83
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    cmp-long p2, v4, v0

    .line 89
    .line 90
    iget-object v7, p0, Lz7;->i:Luh1;

    .line 91
    .line 92
    if-eqz p2, :cond_2

    .line 93
    .line 94
    const p0, -0x4a262578

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p0}, Lgo0;->W(I)V

    .line 98
    .line 99
    .line 100
    const/16 p0, 0x20

    .line 101
    .line 102
    shr-long v0, v4, p0

    .line 103
    .line 104
    long-to-int p0, v0

    .line 105
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    const-wide v0, 0xffffffffL

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    and-long/2addr v0, v4

    .line 115
    long-to-int p0, v0

    .line 116
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    const/4 v11, 0x0

    .line 121
    const/16 v12, 0xc

    .line 122
    .line 123
    const/4 v10, 0x0

    .line 124
    invoke-static/range {v7 .. v12}, Lte;->b0(Luh1;FFFFI)Luh1;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    sget-object p2, Lsn;->k:Lrk;

    .line 129
    .line 130
    invoke-static {p2, v6}, Ldm;->d(Lr5;Z)Lnf1;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    iget-wide v0, p1, Lgo0;->T:J

    .line 135
    .line 136
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    invoke-virtual {p1}, Lgo0;->l()Lyy1;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-static {p1, p0}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    sget-object v4, Lhx;->c:Lgx;

    .line 149
    .line 150
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    sget-object v4, Lgx;->b:Ljy;

    .line 154
    .line 155
    invoke-virtual {p1}, Lgo0;->Z()V

    .line 156
    .line 157
    .line 158
    iget-boolean v5, p1, Lgo0;->S:Z

    .line 159
    .line 160
    if-eqz v5, :cond_1

    .line 161
    .line 162
    invoke-virtual {p1, v4}, Lgo0;->k(Lxm0;)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_1
    invoke-virtual {p1}, Lgo0;->i0()V

    .line 167
    .line 168
    .line 169
    :goto_1
    sget-object v4, Lgx;->e:Llc;

    .line 170
    .line 171
    invoke-static {p1, v4, p2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    sget-object p2, Lgx;->d:Llc;

    .line 175
    .line 176
    invoke-static {p1, p2, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    sget-object v0, Lgx;->f:Llc;

    .line 184
    .line 185
    invoke-static {p1, v0, p2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    sget-object p2, Lgx;->g:Lv6;

    .line 189
    .line 190
    invoke-static {p1, p2}, Lyf3;->b(Lpx;Lin0;)V

    .line 191
    .line 192
    .line 193
    sget-object p2, Lgx;->c:Llc;

    .line 194
    .line 195
    invoke-static {p1, p2, p0}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    const/4 p0, 0x0

    .line 199
    invoke-static {p0, p1, v6, v3}, Le8;->b(Luh1;Lpx;II)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v3}, Lgo0;->p(Z)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, v6}, Lgo0;->p(Z)V

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_2
    const p0, -0x4a2083ba

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1, p0}, Lgo0;->W(I)V

    .line 213
    .line 214
    .line 215
    invoke-static {v7, p1, v6, v6}, Le8;->b(Luh1;Lpx;II)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, v6}, Lgo0;->p(Z)V

    .line 219
    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_3
    invoke-virtual {p1}, Lgo0;->R()V

    .line 223
    .line 224
    .line 225
    :goto_2
    return-object v2

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
