.class public final Lc7/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ld7/m;


# direct methods
.method public constructor <init>(Ld7/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc7/b;->a:Ld7/m;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ld7/d;
    .locals 11

    .line 1
    iget-object v0, p0, Lc7/b;->a:Ld7/m;

    .line 2
    .line 3
    iget-object v1, v0, Ld7/m;->u:Ld7/d;

    .line 4
    .line 5
    if-nez v1, :cond_9

    .line 6
    .line 7
    new-instance v1, Ld7/d;

    .line 8
    .line 9
    invoke-direct {v1}, Ld7/d;-><init>()V

    .line 10
    .line 11
    .line 12
    sget-object v2, Lc7/g;->h:Lc7/g;

    .line 13
    .line 14
    invoke-virtual {v1}, Lr7/b;->p()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x4

    .line 20
    if-ge v2, v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v2, v1, Lr7/b;->k:[B

    .line 24
    .line 25
    const v5, 0x2014b50

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v3, v5}, Lk7/a;->D([BII)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-virtual {v0, v4}, Ld7/s;->O(I)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {v1, v4, v2}, Ld7/s;->R(II)V

    .line 36
    .line 37
    .line 38
    iget-wide v5, v0, Ld7/g;->s:J

    .line 39
    .line 40
    invoke-virtual {v0}, Lr7/b;->p()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    int-to-long v7, v2

    .line 45
    sub-long/2addr v5, v7

    .line 46
    invoke-virtual {v1}, Ld7/d;->h0()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/16 v7, 0x2a

    .line 51
    .line 52
    if-nez v2, :cond_2

    .line 53
    .line 54
    invoke-static {v5, v6}, Ld7/g;->i0(J)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {v1, v7, v5, v6}, Ld7/s;->Q(IJ)V

    .line 62
    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ld7/g;->Z()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    const/16 v8, 0x8

    .line 70
    .line 71
    const/16 v9, 0xc

    .line 72
    .line 73
    if-lt v2, v9, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    invoke-virtual {v1}, Ld7/g;->b0()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    add-int/lit8 v2, v2, 0x3a

    .line 81
    .line 82
    invoke-virtual {v1}, Ld7/d;->W()I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    add-int/2addr v10, v2

    .line 87
    invoke-virtual {v1, v10, v3}, Lr7/b;->M(IZ)V

    .line 88
    .line 89
    .line 90
    add-int/lit8 v2, v8, 0x16

    .line 91
    .line 92
    invoke-virtual {v1, v2, v9}, Ld7/s;->R(II)V

    .line 93
    .line 94
    .line 95
    :goto_2
    const/4 v2, -0x1

    .line 96
    iget-object v3, v1, Lr7/b;->k:[B

    .line 97
    .line 98
    invoke-static {v3, v7, v2}, Lk7/a;->D([BII)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ld7/g;->b0()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    add-int/lit8 v3, v2, 0x32

    .line 106
    .line 107
    iget-object v7, v1, Lr7/b;->k:[B

    .line 108
    .line 109
    add-int/lit8 v2, v2, 0x3a

    .line 110
    .line 111
    array-length v9, v7

    .line 112
    if-le v2, v9, :cond_4

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_4
    :goto_3
    if-ge v3, v2, :cond_5

    .line 116
    .line 117
    const-wide/16 v9, 0xff

    .line 118
    .line 119
    and-long/2addr v9, v5

    .line 120
    long-to-int v9, v9

    .line 121
    int-to-byte v9, v9

    .line 122
    aput-byte v9, v7, v3

    .line 123
    .line 124
    ushr-long/2addr v5, v8

    .line 125
    add-int/lit8 v3, v3, 0x1

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    :goto_4
    iget-object v2, v0, Ld7/g;->q:La5/a;

    .line 129
    .line 130
    iget-object v3, v2, La5/a;->i:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v3, Ld7/g;

    .line 133
    .line 134
    iget v2, v2, La5/a;->h:I

    .line 135
    .line 136
    invoke-virtual {v3, v2}, Ld7/s;->O(I)I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    iget-object v3, v1, Ld7/g;->q:La5/a;

    .line 141
    .line 142
    iget-object v5, v3, La5/a;->i:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v5, Ld7/g;

    .line 145
    .line 146
    iget v6, v3, La5/a;->h:I

    .line 147
    .line 148
    invoke-virtual {v5, v6}, Ld7/s;->O(I)I

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    if-ne v2, v7, :cond_6

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_6
    invoke-virtual {v3}, La5/a;->g()Z

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    invoke-virtual {v5, v6, v2}, Ld7/s;->R(II)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3}, La5/a;->g()Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-eq v7, v2, :cond_7

    .line 167
    .line 168
    invoke-virtual {v5}, Ld7/g;->j0()V

    .line 169
    .line 170
    .line 171
    :cond_7
    :goto_5
    invoke-virtual {v0}, Ld7/g;->c0()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    iget v3, v1, Ld7/g;->p:I

    .line 176
    .line 177
    add-int/lit8 v5, v3, 0x2

    .line 178
    .line 179
    invoke-virtual {v1, v5, v2}, Ld7/s;->R(II)V

    .line 180
    .line 181
    .line 182
    iget v2, v0, Ld7/g;->p:I

    .line 183
    .line 184
    add-int/2addr v2, v4

    .line 185
    invoke-virtual {v0, v2}, Ld7/s;->N(I)J

    .line 186
    .line 187
    .line 188
    move-result-wide v4

    .line 189
    const-wide/16 v6, -0x1

    .line 190
    .line 191
    cmp-long v2, v4, v6

    .line 192
    .line 193
    if-eqz v2, :cond_8

    .line 194
    .line 195
    add-int/lit8 v2, v3, 0x4

    .line 196
    .line 197
    invoke-virtual {v1, v2, v4, v5}, Ld7/s;->Q(IJ)V

    .line 198
    .line 199
    .line 200
    :cond_8
    invoke-virtual {v0}, Ld7/m;->Y()J

    .line 201
    .line 202
    .line 203
    move-result-wide v4

    .line 204
    invoke-virtual {v1, v4, v5}, Ld7/g;->l0(J)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Ld7/m;->X()J

    .line 208
    .line 209
    .line 210
    move-result-wide v4

    .line 211
    invoke-virtual {v1}, Ld7/g;->d0()I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    invoke-virtual {v1, v2, v4, v5}, Ld7/s;->Q(IJ)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Ld7/m;->e0()J

    .line 219
    .line 220
    .line 221
    move-result-wide v4

    .line 222
    add-int/lit8 v3, v3, 0x10

    .line 223
    .line 224
    invoke-virtual {v1, v3, v4, v5}, Ld7/s;->Q(IJ)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Ld7/g;->a0()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-virtual {v1, v2}, Ld7/g;->m0(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v1}, Ld7/m;->n0(Ld7/d;)V

    .line 235
    .line 236
    .line 237
    :cond_9
    return-object v1
.end method

.method public final b()J
    .locals 3

    .line 1
    iget-object v0, p0, Lc7/b;->a:Ld7/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld7/g;->c0()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x8

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ld7/m;->e0()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    invoke-virtual {v0}, Ld7/m;->X()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lc7/b;->a:Ld7/m;

    .line 9
    .line 10
    iget-wide v2, v1, Ld7/g;->s:J

    .line 11
    .line 12
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, "] "

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ld7/g;->a0()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lc7/b;->a()Ld7/d;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ld7/d;->n0()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ld7/m;->Y()J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    const/16 v3, 0x8

    .line 43
    .line 44
    const-string v4, " 0x"

    .line 45
    .line 46
    invoke-static {v3, v4, v1, v2}, Ly7/a;->m(ILjava/lang/String;J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
.end method
