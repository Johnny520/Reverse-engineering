.class public final Loa;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ld22;

.field public final synthetic k:Lxk1;


# direct methods
.method public synthetic constructor <init>(Ld22;Lxk1;I)V
    .locals 0

    .line 1
    iput p3, p0, Loa;->i:I

    .line 2
    .line 3
    iput-object p1, p0, Loa;->j:Ld22;

    .line 4
    .line 5
    iput-object p2, p0, Loa;->k:Lxk1;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Loa;->i:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Loa;->k:Lxk1;

    .line 6
    .line 7
    iget-object p0, p0, Loa;->j:Ld22;

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
    check-cast p1, Lpx;

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
    check-cast p1, Lgo0;

    .line 32
    .line 33
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    sget-object p2, Lpa;->b:Lmy;

    .line 40
    .line 41
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {p2, v0}, Lmy;->a(Ljava/lang/Object;)Lf42;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    new-instance v0, Loa;

    .line 48
    .line 49
    invoke-direct {v0, p0, v2, v4}, Loa;-><init>(Ld22;Lxk1;I)V

    .line 50
    .line 51
    .line 52
    const p0, 0x3ceea85c

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v0, p1}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const/16 v0, 0x38

    .line 60
    .line 61
    invoke-static {p2, p0, p1, v0}, Lci0;->a(Lf42;Lkw;Lpx;I)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {p1}, Lgo0;->R()V

    .line 66
    .line 67
    .line 68
    :goto_1
    return-object v1

    .line 69
    :pswitch_0
    check-cast p1, Lpx;

    .line 70
    .line 71
    check-cast p2, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    and-int/lit8 v0, p2, 0x3

    .line 78
    .line 79
    if-eq v0, v3, :cond_2

    .line 80
    .line 81
    move v0, v5

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    move v0, v4

    .line 84
    :goto_2
    and-int/2addr p2, v5

    .line 85
    check-cast p1, Lgo0;

    .line 86
    .line 87
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    if-eqz p2, :cond_a

    .line 92
    .line 93
    invoke-virtual {p1}, Lgo0;->L()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    sget-object v0, Lnx;->a:Leb;

    .line 98
    .line 99
    if-ne p2, v0, :cond_3

    .line 100
    .line 101
    sget-object p2, Lv6;->q:Lv6;

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    check-cast p2, Lin0;

    .line 107
    .line 108
    sget-object v3, Lrh1;->a:Lrh1;

    .line 109
    .line 110
    invoke-static {v3, v4, p2}, Lnn2;->a(Luh1;ZLin0;)Luh1;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-virtual {p1, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-virtual {p1}, Lgo0;->L()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    if-nez v3, :cond_4

    .line 123
    .line 124
    if-ne v6, v0, :cond_5

    .line 125
    .line 126
    :cond_4
    new-instance v6, Lla;

    .line 127
    .line 128
    invoke-direct {v6, p0, v5}, Lla;-><init>(Ld22;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    check-cast v6, Lin0;

    .line 135
    .line 136
    invoke-static {p2, v6}, Lgf1;->G(Luh1;Lin0;)Luh1;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    invoke-virtual {p0}, Ld22;->getCanCalculatePosition()Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    const/high16 p2, 0x3f800000    # 1.0f

    .line 145
    .line 146
    if-eqz p0, :cond_6

    .line 147
    .line 148
    move v10, p2

    .line 149
    goto :goto_3

    .line 150
    :cond_6
    const/4 p0, 0x0

    .line 151
    move v10, p0

    .line 152
    :goto_3
    cmpg-float p0, v10, p2

    .line 153
    .line 154
    if-nez p0, :cond_7

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_7
    const/4 v11, 0x0

    .line 158
    const v12, 0x7effb

    .line 159
    .line 160
    .line 161
    const/4 v8, 0x0

    .line 162
    const/4 v9, 0x0

    .line 163
    invoke-static/range {v7 .. v12}, Lte;->N(Luh1;FFFLeq2;I)Luh1;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    :goto_4
    sget-object p0, Lpa;->a:Lmy;

    .line 168
    .line 169
    invoke-interface {v2}, Lgu2;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    check-cast p0, Lmn0;

    .line 174
    .line 175
    invoke-virtual {p1}, Lgo0;->L()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    if-ne p2, v0, :cond_8

    .line 180
    .line 181
    sget-object p2, Lk8;->c:Lk8;

    .line 182
    .line 183
    invoke-virtual {p1, p2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_8
    check-cast p2, Lnf1;

    .line 187
    .line 188
    iget-wide v2, p1, Lgo0;->T:J

    .line 189
    .line 190
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    invoke-virtual {p1}, Lgo0;->l()Lyy1;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-static {p1, v7}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    sget-object v6, Lhx;->c:Lgx;

    .line 203
    .line 204
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    sget-object v6, Lgx;->b:Ljy;

    .line 208
    .line 209
    invoke-virtual {p1}, Lgo0;->Z()V

    .line 210
    .line 211
    .line 212
    iget-boolean v7, p1, Lgo0;->S:Z

    .line 213
    .line 214
    if-eqz v7, :cond_9

    .line 215
    .line 216
    invoke-virtual {p1, v6}, Lgo0;->k(Lxm0;)V

    .line 217
    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_9
    invoke-virtual {p1}, Lgo0;->i0()V

    .line 221
    .line 222
    .line 223
    :goto_5
    sget-object v6, Lgx;->e:Llc;

    .line 224
    .line 225
    invoke-static {p1, v6, p2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    sget-object p2, Lgx;->d:Llc;

    .line 229
    .line 230
    invoke-static {p1, p2, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    sget-object v0, Lgx;->f:Llc;

    .line 238
    .line 239
    invoke-static {p1, v0, p2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    sget-object p2, Lgx;->g:Lv6;

    .line 243
    .line 244
    invoke-static {p1, p2}, Lyf3;->b(Lpx;Lin0;)V

    .line 245
    .line 246
    .line 247
    sget-object p2, Lgx;->c:Llc;

    .line 248
    .line 249
    invoke-static {p1, p2, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    invoke-interface {p0, p1, p2}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1, v5}, Lgo0;->p(Z)V

    .line 260
    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_a
    invoke-virtual {p1}, Lgo0;->R()V

    .line 264
    .line 265
    .line 266
    :goto_6
    return-object v1

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
