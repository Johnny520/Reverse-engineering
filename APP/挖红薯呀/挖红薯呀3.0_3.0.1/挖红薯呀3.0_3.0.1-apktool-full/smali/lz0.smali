.class public final Llz0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public a:Lez0;

.field public b:Lj5;

.field public c:Lyt;

.field public d:Lum0;

.field public e:Z

.field public f:Ly2;

.field public final g:Ldz0;

.field public final h:Lzy0;

.field public i:Z

.field public j:I

.field public k:Lny0;

.field public final l:Ljz0;

.field public final m:Lo;


# direct methods
.method public constructor <init>(Lez0;Lj5;Lyt;Lum0;ZLy2;Ldz0;Lzy0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llz0;->a:Lez0;

    .line 5
    .line 6
    iput-object p2, p0, Llz0;->b:Lj5;

    .line 7
    .line 8
    iput-object p3, p0, Llz0;->c:Lyt;

    .line 9
    .line 10
    iput-object p4, p0, Llz0;->d:Lum0;

    .line 11
    .line 12
    iput-boolean p5, p0, Llz0;->e:Z

    .line 13
    .line 14
    iput-object p6, p0, Llz0;->f:Ly2;

    .line 15
    .line 16
    iput-object p7, p0, Llz0;->g:Ldz0;

    .line 17
    .line 18
    iput-object p8, p0, Llz0;->h:Lzy0;

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput p1, p0, Llz0;->j:I

    .line 22
    .line 23
    sget-object p1, Lwy0;->b:Lty0;

    .line 24
    .line 25
    iput-object p1, p0, Llz0;->k:Lny0;

    .line 26
    .line 27
    new-instance p1, Ljz0;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Ljz0;-><init>(Llz0;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Llz0;->l:Ljz0;

    .line 33
    .line 34
    new-instance p1, Lo;

    .line 35
    .line 36
    const/16 p2, 0x14

    .line 37
    .line 38
    invoke-direct {p1, p2, p0}, Lo;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Llz0;->m:Lo;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a(JLjk;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lgz0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lgz0;

    .line 7
    .line 8
    iget v1, v0, Lgz0;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lgz0;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lgz0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lgz0;-><init>(Llz0;Ljk;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lgz0;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lgz0;->j:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p1, v0, Lgz0;->g:Lyt0;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    move-object v5, p0

    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    move-object v5, p0

    .line 45
    goto :goto_3

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance v6, Lyt0;

    .line 57
    .line 58
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-wide p1, v6, Lyt0;->d:J

    .line 62
    .line 63
    iput-boolean v3, p0, Llz0;->i:Z

    .line 64
    .line 65
    :try_start_1
    sget-object p3, Lvh0;->d:Lvh0;

    .line 66
    .line 67
    new-instance v4, Liz0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    move-object v5, p0

    .line 71
    move-wide v7, p1

    .line 72
    :try_start_2
    invoke-direct/range {v4 .. v9}, Liz0;-><init>(Llz0;Lyt0;JLik;)V

    .line 73
    .line 74
    .line 75
    iput-object v6, v0, Lgz0;->g:Lyt0;

    .line 76
    .line 77
    iput v3, v0, Lgz0;->j:I

    .line 78
    .line 79
    invoke-virtual {v5, p3, v4, v0}, Llz0;->f(Lvh0;Lww;Ljk;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 83
    sget-object p1, Lzk;->d:Lzk;

    .line 84
    .line 85
    if-ne p0, p1, :cond_3

    .line 86
    .line 87
    return-object p1

    .line 88
    :cond_3
    move-object p1, v6

    .line 89
    :goto_1
    iput-boolean v2, v5, Llz0;->i:Z

    .line 90
    .line 91
    iget-wide p0, p1, Lyt0;->d:J

    .line 92
    .line 93
    new-instance p2, Lrb1;

    .line 94
    .line 95
    invoke-direct {p2, p0, p1}, Lrb1;-><init>(J)V

    .line 96
    .line 97
    .line 98
    return-object p2

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    :goto_2
    move-object p1, v0

    .line 101
    goto :goto_3

    .line 102
    :catchall_2
    move-exception v0

    .line 103
    move-object v5, p0

    .line 104
    goto :goto_2

    .line 105
    :goto_3
    iput-boolean v2, v5, Llz0;->i:Z

    .line 106
    .line 107
    throw p1
.end method

.method public final b(JZLm51;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lna1;->a:Lna1;

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Llz0;->c:Lyt;

    .line 6
    .line 7
    sget-object v1, Lwy0;->a:Lsx0;

    .line 8
    .line 9
    instance-of p3, p3, Lvl;

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    iget-object p3, p0, Llz0;->d:Lum0;

    .line 15
    .line 16
    sget-object v1, Lum0;->e:Lum0;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-ne p3, v1, :cond_1

    .line 20
    .line 21
    const/4 p3, 0x1

    .line 22
    :goto_0
    invoke-static {p1, p2, v2, v2, p3}, Lrb1;->a(JFFI)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 p3, 0x2

    .line 28
    goto :goto_0

    .line 29
    :goto_1
    new-instance p3, Lkz0;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {p3, p0, v1}, Lkz0;-><init>(Llz0;Lik;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Llz0;->b:Lj5;

    .line 36
    .line 37
    sget-object v2, Lzk;->d:Lzk;

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    iget-object v3, p0, Llz0;->a:Lez0;

    .line 42
    .line 43
    invoke-interface {v3}, Lez0;->c()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    iget-object p0, p0, Llz0;->a:Lez0;

    .line 50
    .line 51
    invoke-interface {p0}, Lez0;->a()Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_3

    .line 56
    .line 57
    :cond_2
    invoke-virtual {v1, p1, p2, p3, p4}, Lj5;->b(JLkz0;Ljk;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-ne p0, v2, :cond_4

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_3
    new-instance p0, Lkz0;

    .line 65
    .line 66
    iget-object p3, p3, Lkz0;->k:Llz0;

    .line 67
    .line 68
    invoke-direct {p0, p3, p4}, Lkz0;-><init>(Llz0;Lik;)V

    .line 69
    .line 70
    .line 71
    iput-wide p1, p0, Lkz0;->j:J

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Lkz0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-ne p0, v2, :cond_4

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_4
    :goto_2
    return-object v0
.end method

.method public final c(Lny0;JI)J
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    iget-object v3, v0, Llz0;->f:Ly2;

    .line 6
    .line 7
    iget-object v3, v3, Ly2;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lgj0;

    .line 10
    .line 11
    const/16 v4, 0x10

    .line 12
    .line 13
    const-class v5, Lgj0;

    .line 14
    .line 15
    const-string v6, "visitAncestors called on an unattached node"

    .line 16
    .line 17
    const/high16 v7, 0x40000

    .line 18
    .line 19
    const/4 v9, 0x1

    .line 20
    const/4 v10, 0x0

    .line 21
    if-eqz v3, :cond_c

    .line 22
    .line 23
    iget-boolean v11, v3, Loe0;->q:Z

    .line 24
    .line 25
    if-eqz v11, :cond_c

    .line 26
    .line 27
    iget-object v11, v3, Loe0;->d:Loe0;

    .line 28
    .line 29
    iget-boolean v11, v11, Loe0;->q:Z

    .line 30
    .line 31
    if-nez v11, :cond_0

    .line 32
    .line 33
    invoke-static {v6}, Lw10;->b(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v11, v3, Loe0;->d:Loe0;

    .line 37
    .line 38
    iget-object v11, v11, Loe0;->h:Loe0;

    .line 39
    .line 40
    invoke-static {v3}, Lpf1;->Q(Lrm;)Lb60;

    .line 41
    .line 42
    .line 43
    move-result-object v12

    .line 44
    :goto_0
    if-eqz v12, :cond_b

    .line 45
    .line 46
    iget-object v13, v12, Lb60;->I:Lmj0;

    .line 47
    .line 48
    iget-object v13, v13, Lmj0;->f:Loe0;

    .line 49
    .line 50
    iget v13, v13, Loe0;->g:I

    .line 51
    .line 52
    and-int/2addr v13, v7

    .line 53
    if-eqz v13, :cond_9

    .line 54
    .line 55
    :goto_1
    if-eqz v11, :cond_9

    .line 56
    .line 57
    iget v13, v11, Loe0;->f:I

    .line 58
    .line 59
    and-int/2addr v13, v7

    .line 60
    if-eqz v13, :cond_8

    .line 61
    .line 62
    move-object v14, v10

    .line 63
    move-object v13, v11

    .line 64
    :goto_2
    if-eqz v13, :cond_8

    .line 65
    .line 66
    instance-of v15, v13, Lh91;

    .line 67
    .line 68
    if-eqz v15, :cond_1

    .line 69
    .line 70
    check-cast v13, Lh91;

    .line 71
    .line 72
    invoke-virtual {v3}, Lgj0;->k()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v15

    .line 76
    move/from16 v16, v7

    .line 77
    .line 78
    invoke-interface {v13}, Lh91;->k()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-static {v15, v7}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-eqz v7, :cond_7

    .line 87
    .line 88
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    if-ne v5, v7, :cond_7

    .line 93
    .line 94
    goto/16 :goto_7

    .line 95
    .line 96
    :cond_1
    move/from16 v16, v7

    .line 97
    .line 98
    iget v7, v13, Loe0;->f:I

    .line 99
    .line 100
    and-int v7, v7, v16

    .line 101
    .line 102
    if-eqz v7, :cond_7

    .line 103
    .line 104
    instance-of v7, v13, Lsm;

    .line 105
    .line 106
    if-eqz v7, :cond_7

    .line 107
    .line 108
    move-object v7, v13

    .line 109
    check-cast v7, Lsm;

    .line 110
    .line 111
    iget-object v7, v7, Lsm;->s:Loe0;

    .line 112
    .line 113
    const/4 v15, 0x0

    .line 114
    :goto_3
    if-eqz v7, :cond_6

    .line 115
    .line 116
    iget v8, v7, Loe0;->f:I

    .line 117
    .line 118
    and-int v8, v8, v16

    .line 119
    .line 120
    if-eqz v8, :cond_5

    .line 121
    .line 122
    add-int/lit8 v15, v15, 0x1

    .line 123
    .line 124
    if-ne v15, v9, :cond_2

    .line 125
    .line 126
    move-object v13, v7

    .line 127
    goto :goto_4

    .line 128
    :cond_2
    if-nez v14, :cond_3

    .line 129
    .line 130
    new-instance v14, Lsh0;

    .line 131
    .line 132
    new-array v8, v4, [Loe0;

    .line 133
    .line 134
    invoke-direct {v14, v8}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_3
    if-eqz v13, :cond_4

    .line 138
    .line 139
    invoke-virtual {v14, v13}, Lsh0;->b(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    move-object v13, v10

    .line 143
    :cond_4
    invoke-virtual {v14, v7}, Lsh0;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_5
    :goto_4
    iget-object v7, v7, Loe0;->i:Loe0;

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_6
    if-ne v15, v9, :cond_7

    .line 150
    .line 151
    :goto_5
    move/from16 v7, v16

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_7
    invoke-static {v14}, Lpf1;->f(Lsh0;)Loe0;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    goto :goto_5

    .line 159
    :cond_8
    move/from16 v16, v7

    .line 160
    .line 161
    iget-object v11, v11, Loe0;->h:Loe0;

    .line 162
    .line 163
    move/from16 v7, v16

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_9
    move/from16 v16, v7

    .line 167
    .line 168
    invoke-virtual {v12}, Lb60;->v()Lb60;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    if-eqz v12, :cond_a

    .line 173
    .line 174
    iget-object v7, v12, Lb60;->I:Lmj0;

    .line 175
    .line 176
    if-eqz v7, :cond_a

    .line 177
    .line 178
    iget-object v7, v7, Lmj0;->e:Ld61;

    .line 179
    .line 180
    move-object v11, v7

    .line 181
    goto :goto_6

    .line 182
    :cond_a
    move-object v11, v10

    .line 183
    :goto_6
    move/from16 v7, v16

    .line 184
    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_b
    move/from16 v16, v7

    .line 188
    .line 189
    move-object v13, v10

    .line 190
    :goto_7
    check-cast v13, Lgj0;

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_c
    move/from16 v16, v7

    .line 194
    .line 195
    move-object v13, v10

    .line 196
    :goto_8
    move/from16 v3, p4

    .line 197
    .line 198
    if-eqz v13, :cond_d

    .line 199
    .line 200
    invoke-virtual {v13, v3, v1, v2}, Lgj0;->b0(IJ)J

    .line 201
    .line 202
    .line 203
    move-result-wide v11

    .line 204
    goto :goto_9

    .line 205
    :cond_d
    const-wide/16 v11, 0x0

    .line 206
    .line 207
    :goto_9
    invoke-static {v1, v2, v11, v12}, Lok0;->d(JJ)J

    .line 208
    .line 209
    .line 210
    move-result-wide v1

    .line 211
    iget-object v13, v0, Llz0;->d:Lum0;

    .line 212
    .line 213
    sget-object v14, Lum0;->e:Lum0;

    .line 214
    .line 215
    if-ne v13, v14, :cond_e

    .line 216
    .line 217
    invoke-static {v9, v1, v2}, Lok0;->a(IJ)J

    .line 218
    .line 219
    .line 220
    move-result-wide v13

    .line 221
    goto :goto_a

    .line 222
    :cond_e
    const/4 v13, 0x2

    .line 223
    invoke-static {v13, v1, v2}, Lok0;->a(IJ)J

    .line 224
    .line 225
    .line 226
    move-result-wide v13

    .line 227
    :goto_a
    invoke-virtual {v0, v13, v14}, Llz0;->e(J)J

    .line 228
    .line 229
    .line 230
    move-result-wide v13

    .line 231
    invoke-virtual {v0, v13, v14}, Llz0;->g(J)F

    .line 232
    .line 233
    .line 234
    move-result v13

    .line 235
    move-object/from16 v14, p1

    .line 236
    .line 237
    invoke-interface {v14, v13}, Lny0;->a(F)F

    .line 238
    .line 239
    .line 240
    move-result v13

    .line 241
    invoke-virtual {v0, v13}, Llz0;->h(F)J

    .line 242
    .line 243
    .line 244
    move-result-wide v13

    .line 245
    invoke-virtual {v0, v13, v14}, Llz0;->e(J)J

    .line 246
    .line 247
    .line 248
    move-result-wide v13

    .line 249
    iget-object v15, v0, Llz0;->g:Ldz0;

    .line 250
    .line 251
    iget-boolean v7, v15, Loe0;->q:Z

    .line 252
    .line 253
    if-nez v7, :cond_f

    .line 254
    .line 255
    goto :goto_b

    .line 256
    :cond_f
    invoke-static {v15}, Lpf1;->R(Lrm;)Ldn0;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    check-cast v7, Lw3;

    .line 261
    .line 262
    invoke-virtual {v7}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    :try_start_0
    sget-object v8, Lw3;->O0:Ljava/lang/reflect/Method;

    .line 267
    .line 268
    if-nez v8, :cond_10

    .line 269
    .line 270
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    const-string v15, "dispatchOnScrollChanged"

    .line 275
    .line 276
    invoke-virtual {v8, v15, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 277
    .line 278
    .line 279
    move-result-object v8

    .line 280
    invoke-virtual {v8, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 281
    .line 282
    .line 283
    sput-object v8, Lw3;->O0:Ljava/lang/reflect/Method;

    .line 284
    .line 285
    :cond_10
    sget-object v8, Lw3;->O0:Ljava/lang/reflect/Method;

    .line 286
    .line 287
    if-eqz v8, :cond_11

    .line 288
    .line 289
    invoke-virtual {v8, v7, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 290
    .line 291
    .line 292
    :catch_0
    :cond_11
    :goto_b
    invoke-static {v1, v2, v13, v14}, Lok0;->d(JJ)J

    .line 293
    .line 294
    .line 295
    move-result-wide v21

    .line 296
    iget-object v0, v0, Llz0;->f:Ly2;

    .line 297
    .line 298
    iget-object v0, v0, Ly2;->d:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v0, Lgj0;

    .line 301
    .line 302
    if-eqz v0, :cond_1e

    .line 303
    .line 304
    iget-boolean v1, v0, Loe0;->q:Z

    .line 305
    .line 306
    if-eqz v1, :cond_1e

    .line 307
    .line 308
    iget-object v1, v0, Loe0;->d:Loe0;

    .line 309
    .line 310
    iget-boolean v1, v1, Loe0;->q:Z

    .line 311
    .line 312
    if-nez v1, :cond_12

    .line 313
    .line 314
    invoke-static {v6}, Lw10;->b(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    :cond_12
    iget-object v1, v0, Loe0;->d:Loe0;

    .line 318
    .line 319
    iget-object v1, v1, Loe0;->h:Loe0;

    .line 320
    .line 321
    invoke-static {v0}, Lpf1;->Q(Lrm;)Lb60;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    :goto_c
    if-eqz v2, :cond_1d

    .line 326
    .line 327
    iget-object v6, v2, Lb60;->I:Lmj0;

    .line 328
    .line 329
    iget-object v6, v6, Lmj0;->f:Loe0;

    .line 330
    .line 331
    iget v6, v6, Loe0;->g:I

    .line 332
    .line 333
    and-int v6, v6, v16

    .line 334
    .line 335
    if-eqz v6, :cond_1b

    .line 336
    .line 337
    :goto_d
    if-eqz v1, :cond_1b

    .line 338
    .line 339
    iget v6, v1, Loe0;->f:I

    .line 340
    .line 341
    and-int v6, v6, v16

    .line 342
    .line 343
    if-eqz v6, :cond_1a

    .line 344
    .line 345
    move-object v6, v1

    .line 346
    move-object v7, v10

    .line 347
    :goto_e
    if-eqz v6, :cond_1a

    .line 348
    .line 349
    instance-of v8, v6, Lh91;

    .line 350
    .line 351
    if-eqz v8, :cond_13

    .line 352
    .line 353
    check-cast v6, Lh91;

    .line 354
    .line 355
    invoke-virtual {v0}, Lgj0;->k()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v8

    .line 359
    invoke-interface {v6}, Lh91;->k()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v15

    .line 363
    invoke-static {v8, v15}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v8

    .line 367
    if-eqz v8, :cond_19

    .line 368
    .line 369
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    move-result-object v8

    .line 373
    if-ne v5, v8, :cond_19

    .line 374
    .line 375
    move-object v10, v6

    .line 376
    goto :goto_13

    .line 377
    :cond_13
    iget v8, v6, Loe0;->f:I

    .line 378
    .line 379
    and-int v8, v8, v16

    .line 380
    .line 381
    if-eqz v8, :cond_19

    .line 382
    .line 383
    instance-of v8, v6, Lsm;

    .line 384
    .line 385
    if-eqz v8, :cond_19

    .line 386
    .line 387
    move-object v8, v6

    .line 388
    check-cast v8, Lsm;

    .line 389
    .line 390
    iget-object v8, v8, Lsm;->s:Loe0;

    .line 391
    .line 392
    const/4 v15, 0x0

    .line 393
    :goto_f
    if-eqz v8, :cond_18

    .line 394
    .line 395
    iget v10, v8, Loe0;->f:I

    .line 396
    .line 397
    and-int v10, v10, v16

    .line 398
    .line 399
    if-eqz v10, :cond_17

    .line 400
    .line 401
    add-int/lit8 v15, v15, 0x1

    .line 402
    .line 403
    if-ne v15, v9, :cond_14

    .line 404
    .line 405
    move-object v6, v8

    .line 406
    goto :goto_10

    .line 407
    :cond_14
    if-nez v7, :cond_15

    .line 408
    .line 409
    new-instance v7, Lsh0;

    .line 410
    .line 411
    new-array v10, v4, [Loe0;

    .line 412
    .line 413
    invoke-direct {v7, v10}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    :cond_15
    if-eqz v6, :cond_16

    .line 417
    .line 418
    invoke-virtual {v7, v6}, Lsh0;->b(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    const/4 v6, 0x0

    .line 422
    :cond_16
    invoke-virtual {v7, v8}, Lsh0;->b(Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    :cond_17
    :goto_10
    iget-object v8, v8, Loe0;->i:Loe0;

    .line 426
    .line 427
    const/4 v10, 0x0

    .line 428
    goto :goto_f

    .line 429
    :cond_18
    if-ne v15, v9, :cond_19

    .line 430
    .line 431
    :goto_11
    const/4 v10, 0x0

    .line 432
    goto :goto_e

    .line 433
    :cond_19
    invoke-static {v7}, Lpf1;->f(Lsh0;)Loe0;

    .line 434
    .line 435
    .line 436
    move-result-object v6

    .line 437
    goto :goto_11

    .line 438
    :cond_1a
    iget-object v1, v1, Loe0;->h:Loe0;

    .line 439
    .line 440
    const/4 v10, 0x0

    .line 441
    goto :goto_d

    .line 442
    :cond_1b
    invoke-virtual {v2}, Lb60;->v()Lb60;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    if-eqz v2, :cond_1c

    .line 447
    .line 448
    iget-object v1, v2, Lb60;->I:Lmj0;

    .line 449
    .line 450
    if-eqz v1, :cond_1c

    .line 451
    .line 452
    iget-object v1, v1, Lmj0;->e:Ld61;

    .line 453
    .line 454
    goto :goto_12

    .line 455
    :cond_1c
    const/4 v1, 0x0

    .line 456
    :goto_12
    const/4 v10, 0x0

    .line 457
    goto/16 :goto_c

    .line 458
    .line 459
    :cond_1d
    const/4 v10, 0x0

    .line 460
    :goto_13
    check-cast v10, Lgj0;

    .line 461
    .line 462
    move-object/from16 v17, v10

    .line 463
    .line 464
    goto :goto_14

    .line 465
    :cond_1e
    const/16 v17, 0x0

    .line 466
    .line 467
    :goto_14
    if-eqz v17, :cond_1f

    .line 468
    .line 469
    move/from16 v18, v3

    .line 470
    .line 471
    move-wide/from16 v19, v13

    .line 472
    .line 473
    invoke-virtual/range {v17 .. v22}, Lgj0;->A(IJJ)J

    .line 474
    .line 475
    .line 476
    move-result-wide v7

    .line 477
    move-wide/from16 v0, v19

    .line 478
    .line 479
    goto :goto_15

    .line 480
    :cond_1f
    move-wide v0, v13

    .line 481
    const-wide/16 v7, 0x0

    .line 482
    .line 483
    :goto_15
    invoke-static {v11, v12, v0, v1}, Lok0;->e(JJ)J

    .line 484
    .line 485
    .line 486
    move-result-wide v0

    .line 487
    invoke-static {v0, v1, v7, v8}, Lok0;->e(JJ)J

    .line 488
    .line 489
    .line 490
    move-result-wide v0

    .line 491
    return-wide v0
.end method

.method public final d(F)F
    .locals 0

    .line 1
    iget-boolean p0, p0, Llz0;->e:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/high16 p0, -0x40800000    # -1.0f

    .line 6
    .line 7
    mul-float/2addr p1, p0

    .line 8
    :cond_0
    return p1
.end method

.method public final e(J)J
    .locals 0

    .line 1
    iget-boolean p0, p0, Llz0;->e:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/high16 p0, -0x40800000    # -1.0f

    .line 6
    .line 7
    invoke-static {p0, p1, p2}, Lok0;->f(FJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0

    .line 12
    :cond_0
    return-wide p1
.end method

.method public final f(Lvh0;Lww;Ljk;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Llz0;->a:Lez0;

    .line 2
    .line 3
    new-instance v1, Li;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0xa

    .line 7
    .line 8
    invoke-direct {v1, p0, p2, v2, v3}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1, v1, p3}, Lez0;->d(Lvh0;Lww;Ljk;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, Lzk;->d:Lzk;

    .line 16
    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Lna1;->a:Lna1;

    .line 21
    .line 22
    return-object p0
.end method

.method public final g(J)F
    .locals 2

    .line 1
    iget-object p0, p0, Llz0;->d:Lum0;

    .line 2
    .line 3
    sget-object v0, Lum0;->e:Lum0;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0x20

    .line 8
    .line 9
    shr-long p0, p1, p0

    .line 10
    .line 11
    :goto_0
    long-to-int p0, p0

    .line 12
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const-wide v0, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long p0, p1, v0

    .line 23
    .line 24
    goto :goto_0
.end method

.method public final h(F)J
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    const-wide/16 p0, 0x0

    .line 7
    .line 8
    return-wide p0

    .line 9
    :cond_0
    iget-object p0, p0, Llz0;->d:Lum0;

    .line 10
    .line 11
    sget-object v1, Lum0;->e:Lum0;

    .line 12
    .line 13
    const-wide v2, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const/16 v4, 0x20

    .line 19
    .line 20
    if-ne p0, v1, :cond_1

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    int-to-long p0, p0

    .line 27
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-long v0, v0

    .line 32
    shl-long/2addr p0, v4

    .line 33
    and-long/2addr v0, v2

    .line 34
    or-long/2addr p0, v0

    .line 35
    return-wide p0

    .line 36
    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    int-to-long v0, p0

    .line 41
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    int-to-long p0, p0

    .line 46
    shl-long/2addr v0, v4

    .line 47
    and-long/2addr p0, v2

    .line 48
    or-long/2addr p0, v0

    .line 49
    return-wide p0
.end method

.method public final i(J)F
    .locals 5

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long/2addr v0, p1

    .line 7
    long-to-int v0, v0

    .line 8
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x20

    .line 17
    .line 18
    shr-long/2addr p1, v2

    .line 19
    long-to-int p1, p1

    .line 20
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    float-to-double v1, v1

    .line 29
    float-to-double v3, p2

    .line 30
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    double-to-float p2, v1

    .line 35
    float-to-double v1, p2

    .line 36
    const-wide v3, 0x3fe921fb54442d18L    # 0.7853981633974483

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    cmpl-double p2, v1, v3

    .line 42
    .line 43
    iget-object p0, p0, Llz0;->d:Lum0;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    if-ltz p2, :cond_1

    .line 47
    .line 48
    sget-object p1, Lum0;->d:Lum0;

    .line 49
    .line 50
    if-ne p0, p1, :cond_0

    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :cond_0
    return v1

    .line 58
    :cond_1
    sget-object p2, Lum0;->e:Lum0;

    .line 59
    .line 60
    if-ne p0, p2, :cond_2

    .line 61
    .line 62
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0

    .line 67
    :cond_2
    return v1
.end method
