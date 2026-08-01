.class public final Lus;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lr50;


# instance fields
.field public final A:Ls2;

.field public r:Lb91;

.field public s:Lw81;

.field public t:Lw81;

.field public u:Lvs;

.field public v:Ljt;

.field public w:Lhw;

.field public x:Los;

.field public y:J

.field public z:Lha;


# direct methods
.method public constructor <init>(Lb91;Lw81;Lw81;Lvs;Ljt;Lhw;Los;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loe0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lus;->r:Lb91;

    .line 5
    .line 6
    iput-object p2, p0, Lus;->s:Lw81;

    .line 7
    .line 8
    iput-object p3, p0, Lus;->t:Lw81;

    .line 9
    .line 10
    iput-object p4, p0, Lus;->u:Lvs;

    .line 11
    .line 12
    iput-object p5, p0, Lus;->v:Ljt;

    .line 13
    .line 14
    iput-object p6, p0, Lus;->w:Lhw;

    .line 15
    .line 16
    iput-object p7, p0, Lus;->x:Los;

    .line 17
    .line 18
    const-wide p1, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, Lus;->y:J

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    const/16 p2, 0xf

    .line 27
    .line 28
    invoke-static {p1, p1, p2}, Lqj;->b(III)J

    .line 29
    .line 30
    .line 31
    new-instance p1, Ls2;

    .line 32
    .line 33
    const/16 p2, 0xa

    .line 34
    .line 35
    invoke-direct {p1, p2, p0}, Ls2;-><init>(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lus;->A:Ls2;

    .line 39
    .line 40
    new-instance p1, Lb71;

    .line 41
    .line 42
    invoke-direct {p1, p0}, Lb71;-><init>(Lus;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final G(Lyb0;Lsd0;I)I
    .locals 0

    .line 1
    invoke-interface {p2, p3}, Lsd0;->I(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final Y(Lzd0;Lsd0;J)Lyd0;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lus;->r:Lb91;

    .line 6
    .line 7
    invoke-virtual {v2}, Lb91;->c()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, v0, Lus;->r:Lb91;

    .line 12
    .line 13
    iget-object v3, v3, Lb91;->d:Lgp0;

    .line 14
    .line 15
    invoke-virtual {v3}, Lgp0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x0

    .line 20
    if-ne v2, v3, :cond_0

    .line 21
    .line 22
    iput-object v4, v0, Lus;->z:Lha;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v2, v0, Lus;->z:Lha;

    .line 26
    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Lus;->w0()Lha;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    sget-object v2, Ln2;->e:Lha;

    .line 36
    .line 37
    :cond_1
    iput-object v2, v0, Lus;->z:Lha;

    .line 38
    .line 39
    :cond_2
    :goto_0
    invoke-interface {v1}, Ll30;->m()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    sget-object v3, Lis;->d:Lis;

    .line 44
    .line 45
    const-wide v5, 0xffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    const/16 v7, 0x20

    .line 51
    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    invoke-interface/range {p2 .. p4}, Lsd0;->e(J)Lxq0;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget v4, v2, Lxq0;->d:I

    .line 59
    .line 60
    iget v8, v2, Lxq0;->e:I

    .line 61
    .line 62
    int-to-long v9, v4

    .line 63
    shl-long/2addr v9, v7

    .line 64
    int-to-long v11, v8

    .line 65
    and-long/2addr v11, v5

    .line 66
    or-long v8, v9, v11

    .line 67
    .line 68
    iput-wide v8, v0, Lus;->y:J

    .line 69
    .line 70
    shr-long v10, v8, v7

    .line 71
    .line 72
    long-to-int v0, v10

    .line 73
    and-long v4, v8, v5

    .line 74
    .line 75
    long-to-int v4, v4

    .line 76
    new-instance v5, Li3;

    .line 77
    .line 78
    const/4 v6, 0x2

    .line 79
    invoke-direct {v5, v2, v6}, Li3;-><init>(Lxq0;I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v1, v0, v4, v3, v5}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :cond_3
    iget-object v2, v0, Lus;->w:Lhw;

    .line 88
    .line 89
    invoke-interface {v2}, Lhw;->invoke()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_a

    .line 100
    .line 101
    iget-object v2, v0, Lus;->x:Los;

    .line 102
    .line 103
    iget-object v8, v2, Los;->a:Lw81;

    .line 104
    .line 105
    iget-object v9, v2, Los;->b:Lb91;

    .line 106
    .line 107
    iget-object v10, v2, Los;->c:Lvs;

    .line 108
    .line 109
    iget-object v2, v2, Los;->d:Ljt;

    .line 110
    .line 111
    const/4 v11, 0x0

    .line 112
    const/4 v12, 0x1

    .line 113
    if-eqz v8, :cond_4

    .line 114
    .line 115
    new-instance v13, Lps;

    .line 116
    .line 117
    invoke-direct {v13, v10, v2, v11}, Lps;-><init>(Lvs;Ljt;I)V

    .line 118
    .line 119
    .line 120
    new-instance v14, Lps;

    .line 121
    .line 122
    invoke-direct {v14, v10, v2, v12}, Lps;-><init>(Lvs;Ljt;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8, v13, v14}, Lw81;->a(Lsw;Lsw;)Lv81;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    goto :goto_1

    .line 130
    :cond_4
    move-object v2, v4

    .line 131
    :goto_1
    invoke-virtual {v9}, Lb91;->c()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    new-instance v8, Lrp;

    .line 135
    .line 136
    invoke-direct {v8, v2, v4, v4, v12}, Lrp;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 137
    .line 138
    .line 139
    invoke-interface/range {p2 .. p4}, Lsd0;->e(J)Lxq0;

    .line 140
    .line 141
    .line 142
    move-result-object v14

    .line 143
    iget v2, v14, Lxq0;->d:I

    .line 144
    .line 145
    iget v9, v14, Lxq0;->e:I

    .line 146
    .line 147
    move-wide v15, v5

    .line 148
    int-to-long v4, v2

    .line 149
    shl-long/2addr v4, v7

    .line 150
    move v2, v7

    .line 151
    move-object/from16 v19, v8

    .line 152
    .line 153
    int-to-long v7, v9

    .line 154
    and-long v6, v7, v15

    .line 155
    .line 156
    or-long/2addr v4, v6

    .line 157
    iget-wide v6, v0, Lus;->y:J

    .line 158
    .line 159
    const-wide v8, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    invoke-static {v6, v7, v8, v9}, Ld30;->a(JJ)Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-nez v6, :cond_5

    .line 169
    .line 170
    iget-wide v6, v0, Lus;->y:J

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_5
    move-wide v6, v4

    .line 174
    :goto_2
    iget-object v8, v0, Lus;->s:Lw81;

    .line 175
    .line 176
    if-eqz v8, :cond_6

    .line 177
    .line 178
    new-instance v9, Lts;

    .line 179
    .line 180
    invoke-direct {v9, v0, v6, v7, v11}, Lts;-><init>(Lus;JI)V

    .line 181
    .line 182
    .line 183
    iget-object v10, v0, Lus;->A:Ls2;

    .line 184
    .line 185
    invoke-virtual {v8, v10, v9}, Lw81;->a(Lsw;Lsw;)Lv81;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    goto :goto_3

    .line 190
    :cond_6
    const/4 v8, 0x0

    .line 191
    :goto_3
    if-eqz v8, :cond_7

    .line 192
    .line 193
    invoke-virtual {v8}, Lv81;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    check-cast v4, Ld30;

    .line 198
    .line 199
    iget-wide v4, v4, Ld30;->a:J

    .line 200
    .line 201
    :cond_7
    move-wide/from16 v8, p3

    .line 202
    .line 203
    invoke-static {v8, v9, v4, v5}, Lqj;->d(JJ)J

    .line 204
    .line 205
    .line 206
    move-result-wide v23

    .line 207
    iget-object v4, v0, Lus;->t:Lw81;

    .line 208
    .line 209
    const-wide/16 v8, 0x0

    .line 210
    .line 211
    if-eqz v4, :cond_8

    .line 212
    .line 213
    sget-object v5, Lp3;->o:Lp3;

    .line 214
    .line 215
    new-instance v10, Lts;

    .line 216
    .line 217
    invoke-direct {v10, v0, v6, v7, v12}, Lts;-><init>(Lus;JI)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4, v5, v10}, Lw81;->a(Lsw;Lsw;)Lv81;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-virtual {v4}, Lv81;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    check-cast v4, Lw20;

    .line 229
    .line 230
    iget-wide v4, v4, Lw20;->a:J

    .line 231
    .line 232
    move-wide/from16 v17, v4

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_8
    move-wide/from16 v17, v8

    .line 236
    .line 237
    :goto_4
    iget-object v0, v0, Lus;->z:Lha;

    .line 238
    .line 239
    if-eqz v0, :cond_9

    .line 240
    .line 241
    sget-object v25, Lk50;->d:Lk50;

    .line 242
    .line 243
    move-object/from16 v20, v0

    .line 244
    .line 245
    move-wide/from16 v21, v6

    .line 246
    .line 247
    invoke-virtual/range {v20 .. v25}, Lha;->a(JJLk50;)J

    .line 248
    .line 249
    .line 250
    move-result-wide v4

    .line 251
    goto :goto_5

    .line 252
    :cond_9
    move-wide v4, v8

    .line 253
    :goto_5
    invoke-static {v4, v5, v8, v9}, Lw20;->c(JJ)J

    .line 254
    .line 255
    .line 256
    move-result-wide v4

    .line 257
    shr-long v6, v23, v2

    .line 258
    .line 259
    long-to-int v0, v6

    .line 260
    and-long v6, v23, v15

    .line 261
    .line 262
    long-to-int v2, v6

    .line 263
    new-instance v13, Lss;

    .line 264
    .line 265
    move-wide v15, v4

    .line 266
    invoke-direct/range {v13 .. v19}, Lss;-><init>(Lxq0;JJLrp;)V

    .line 267
    .line 268
    .line 269
    invoke-interface {v1, v0, v2, v3, v13}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    return-object v0

    .line 274
    :cond_a
    move-wide/from16 v8, p3

    .line 275
    .line 276
    invoke-interface/range {p2 .. p4}, Lsd0;->e(J)Lxq0;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    iget v2, v0, Lxq0;->d:I

    .line 281
    .line 282
    iget v4, v0, Lxq0;->e:I

    .line 283
    .line 284
    new-instance v5, Li3;

    .line 285
    .line 286
    const/4 v6, 0x3

    .line 287
    invoke-direct {v5, v0, v6}, Li3;-><init>(Lxq0;I)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v1, v2, v4, v3, v5}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    return-object v0
.end method

.method public final d(Lyb0;Lsd0;I)I
    .locals 0

    .line 1
    invoke-interface {p2, p3}, Lsd0;->O(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final i(Lyb0;Lsd0;I)I
    .locals 0

    .line 1
    invoke-interface {p2, p3}, Lsd0;->f(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final o0()V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lus;->y:J

    .line 7
    .line 8
    return-void
.end method

.method public final s(Lyb0;Lsd0;I)I
    .locals 0

    .line 1
    invoke-interface {p2, p3}, Lsd0;->R(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final w0()Lha;
    .locals 3

    .line 1
    iget-object v0, p0, Lus;->r:Lb91;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb91;->f()Lx81;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lms;->d:Lms;

    .line 8
    .line 9
    sget-object v2, Lms;->e:Lms;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lx81;->a(Lms;Lms;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lus;->u:Lvs;

    .line 18
    .line 19
    iget-object v0, v0, Lvs;->a:Lc91;

    .line 20
    .line 21
    iget-object v0, v0, Lc91;->a:Lkd;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object p0, v0, Lkd;->a:Lha;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    iget-object p0, p0, Lus;->v:Ljt;

    .line 29
    .line 30
    iget-object p0, p0, Ljt;->a:Lc91;

    .line 31
    .line 32
    iget-object p0, p0, Lc91;->a:Lkd;

    .line 33
    .line 34
    if-eqz p0, :cond_3

    .line 35
    .line 36
    iget-object p0, p0, Lkd;->a:Lha;

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_1
    iget-object v0, p0, Lus;->v:Ljt;

    .line 40
    .line 41
    iget-object v0, v0, Ljt;->a:Lc91;

    .line 42
    .line 43
    iget-object v0, v0, Lc91;->a:Lkd;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-object p0, v0, Lkd;->a:Lha;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_2
    iget-object p0, p0, Lus;->u:Lvs;

    .line 51
    .line 52
    iget-object p0, p0, Lvs;->a:Lc91;

    .line 53
    .line 54
    iget-object p0, p0, Lc91;->a:Lkd;

    .line 55
    .line 56
    if-eqz p0, :cond_3

    .line 57
    .line 58
    iget-object p0, p0, Lkd;->a:Lha;

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_3
    const/4 p0, 0x0

    .line 62
    return-object p0
.end method
