.class public final Luw1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lm13;

.field public c:Lxl0;

.field public d:I

.field public e:Z

.field public f:I

.field public g:I

.field public h:J

.field public i:Le70;

.field public j:Lt9;

.field public k:Z

.field public l:J

.field public m:Lbh1;

.field public n:Ltw1;

.field public o:Ld61;

.field public p:J

.field public q:I

.field public r:I

.field public s:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lm13;Lxl0;IZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Luw1;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Luw1;->b:Lm13;

    .line 7
    .line 8
    iput-object p3, p0, Luw1;->c:Lxl0;

    .line 9
    .line 10
    iput p4, p0, Luw1;->d:I

    .line 11
    .line 12
    iput-boolean p5, p0, Luw1;->e:Z

    .line 13
    .line 14
    iput p6, p0, Luw1;->f:I

    .line 15
    .line 16
    iput p7, p0, Luw1;->g:I

    .line 17
    .line 18
    sget-wide p1, Loz0;->a:J

    .line 19
    .line 20
    iput-wide p1, p0, Luw1;->h:J

    .line 21
    .line 22
    const-wide/16 p1, 0x0

    .line 23
    .line 24
    iput-wide p1, p0, Luw1;->l:J

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-static {p1, p1, p1, p1}, Lgz;->h(IIII)J

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    iput-wide p1, p0, Luw1;->p:J

    .line 32
    .line 33
    const/4 p1, -0x1

    .line 34
    iput p1, p0, Luw1;->q:I

    .line 35
    .line 36
    iput p1, p0, Luw1;->r:I

    .line 37
    .line 38
    return-void
.end method

.method public static f(Luw1;JLd61;)J
    .locals 11

    .line 1
    iget-object v0, p0, Luw1;->b:Lm13;

    .line 2
    .line 3
    iget-object v1, p0, Luw1;->m:Lbh1;

    .line 4
    .line 5
    iget-object v2, p0, Luw1;->i:Le70;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v3, p0, Luw1;->c:Lxl0;

    .line 11
    .line 12
    invoke-static {v1, p3, v0, v2, v3}, Lci0;->I(Lbh1;Ld61;Lm13;Le70;Lxl0;)Lbh1;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    iput-object p3, p0, Luw1;->m:Lbh1;

    .line 17
    .line 18
    iget p0, p0, Luw1;->g:I

    .line 19
    .line 20
    iget-object v4, p3, Lbh1;->c:Lh70;

    .line 21
    .line 22
    iget v0, p3, Lbh1;->g:F

    .line 23
    .line 24
    iget v1, p3, Lbh1;->f:F

    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v8, 0x0

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    :cond_0
    sget-object v0, Lch1;->a:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v1, p3, Lbh1;->e:Lm13;

    .line 42
    .line 43
    const/16 v9, 0xf

    .line 44
    .line 45
    invoke-static {v8, v8, v8, v8, v9}, Lgz;->b(IIIII)J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    iget-object v5, p3, Lbh1;->d:Lxl0;

    .line 50
    .line 51
    const/4 v6, 0x1

    .line 52
    const/16 v7, 0x60

    .line 53
    .line 54
    invoke-static/range {v0 .. v7}, Lci0;->r(Ljava/lang/String;Lm13;JLe70;Lxl0;II)Lt9;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lt9;->b()F

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    sget-object v0, Lch1;->b:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v1, p3, Lbh1;->e:Lm13;

    .line 65
    .line 66
    invoke-static {v8, v8, v8, v8, v9}, Lgz;->b(IIIII)J

    .line 67
    .line 68
    .line 69
    move-result-wide v2

    .line 70
    iget-object v5, p3, Lbh1;->d:Lxl0;

    .line 71
    .line 72
    const/4 v6, 0x2

    .line 73
    invoke-static/range {v0 .. v7}, Lci0;->r(Ljava/lang/String;Lm13;JLe70;Lxl0;II)Lt9;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lt9;->b()F

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    sub-float v1, v0, v10

    .line 82
    .line 83
    iput v10, p3, Lbh1;->g:F

    .line 84
    .line 85
    iput v1, p3, Lbh1;->f:F

    .line 86
    .line 87
    move v0, v10

    .line 88
    :cond_1
    const/4 p3, 0x1

    .line 89
    if-eq p0, p3, :cond_3

    .line 90
    .line 91
    sub-int/2addr p0, p3

    .line 92
    int-to-float p0, p0

    .line 93
    mul-float/2addr v1, p0

    .line 94
    add-float/2addr v1, v0

    .line 95
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-gez p0, :cond_2

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    move v8, p0

    .line 103
    :goto_0
    invoke-static {p1, p2}, Lfz;->g(J)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-le v8, p0, :cond_4

    .line 108
    .line 109
    move v8, p0

    .line 110
    goto :goto_1

    .line 111
    :cond_3
    invoke-static {p1, p2}, Lfz;->i(J)I

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    :cond_4
    :goto_1
    invoke-static {p1, p2}, Lfz;->g(J)I

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    invoke-static {p1, p2}, Lfz;->j(J)I

    .line 120
    .line 121
    .line 122
    move-result p3

    .line 123
    invoke-static {p1, p2}, Lfz;->h(J)I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-static {p3, p1, v8, p0}, Lgz;->a(IIII)J

    .line 128
    .line 129
    .line 130
    move-result-wide p0

    .line 131
    return-wide p0
.end method


# virtual methods
.method public final a(ILd61;)I
    .locals 12

    .line 1
    iget v0, p0, Luw1;->q:I

    .line 2
    .line 3
    iget v1, p0, Luw1;->r:I

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-eq v0, v2, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const v0, 0x7fffffff

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {v1, p1, v1, v0}, Lgz;->a(IIII)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iget v2, p0, Luw1;->g:I

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    if-le v2, v3, :cond_1

    .line 23
    .line 24
    invoke-static {p0, v0, v1, p2}, Luw1;->f(Luw1;JLd61;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    :cond_1
    invoke-virtual {p0, p2}, Luw1;->e(Ld61;)Ltw1;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iget-boolean v2, p0, Luw1;->e:Z

    .line 33
    .line 34
    iget v4, p0, Luw1;->d:I

    .line 35
    .line 36
    invoke-interface {p2}, Ltw1;->c()F

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    invoke-static {v0, v1, v2, v4, v5}, Lxe1;->q(JZIF)J

    .line 41
    .line 42
    .line 43
    move-result-wide v10

    .line 44
    iget-boolean v2, p0, Luw1;->e:Z

    .line 45
    .line 46
    iget v9, p0, Luw1;->d:I

    .line 47
    .line 48
    iget v4, p0, Luw1;->f:I

    .line 49
    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    if-ne v9, v2, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const/4 v2, 0x4

    .line 57
    if-ne v9, v2, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const/4 v2, 0x5

    .line 61
    if-ne v9, v2, :cond_4

    .line 62
    .line 63
    :goto_0
    move v8, v3

    .line 64
    goto :goto_1

    .line 65
    :cond_4
    if-ge v4, v3, :cond_5

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_5
    move v8, v4

    .line 69
    :goto_1
    new-instance v6, Lt9;

    .line 70
    .line 71
    move-object v7, p2

    .line 72
    check-cast v7, Lx9;

    .line 73
    .line 74
    invoke-direct/range {v6 .. v11}, Lt9;-><init>(Lx9;IIJ)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6}, Lt9;->b()F

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    invoke-static {p2}, Lqp0;->l(F)I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    invoke-static {v0, v1}, Lfz;->i(J)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-ge p2, v0, :cond_6

    .line 90
    .line 91
    move p2, v0

    .line 92
    :cond_6
    iput p1, p0, Luw1;->q:I

    .line 93
    .line 94
    iput p2, p0, Luw1;->r:I

    .line 95
    .line 96
    return p2
.end method

.method public final b(JLd61;)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-wide v2, v0, Luw1;->s:J

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    shl-long/2addr v2, v4

    .line 9
    const-wide/16 v5, 0x3

    .line 10
    .line 11
    or-long/2addr v2, v5

    .line 12
    iput-wide v2, v0, Luw1;->s:J

    .line 13
    .line 14
    iget v2, v0, Luw1;->g:I

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-le v2, v3, :cond_0

    .line 18
    .line 19
    invoke-static/range {p0 .. p3}, Luw1;->f(Luw1;JLd61;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-wide/from16 v5, p1

    .line 25
    .line 26
    :goto_0
    iget-object v2, v0, Luw1;->j:Lt9;

    .line 27
    .line 28
    const/4 v7, 0x3

    .line 29
    const/4 v8, 0x0

    .line 30
    const-wide v9, 0xffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    const/16 v11, 0x20

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_1
    iget-object v12, v0, Luw1;->n:Ltw1;

    .line 42
    .line 43
    if-nez v12, :cond_2

    .line 44
    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_2
    invoke-interface {v12}, Ltw1;->b()Z

    .line 48
    .line 49
    .line 50
    move-result v12

    .line 51
    if-eqz v12, :cond_3

    .line 52
    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :cond_3
    iget-object v12, v0, Luw1;->o:Ld61;

    .line 56
    .line 57
    if-eq v1, v12, :cond_4

    .line 58
    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_4
    iget-wide v12, v0, Luw1;->p:J

    .line 62
    .line 63
    invoke-static {v5, v6, v12, v13}, Lfz;->b(JJ)Z

    .line 64
    .line 65
    .line 66
    move-result v12

    .line 67
    if-eqz v12, :cond_5

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_5
    invoke-static {v5, v6}, Lfz;->h(J)I

    .line 71
    .line 72
    .line 73
    move-result v12

    .line 74
    iget-wide v13, v0, Luw1;->p:J

    .line 75
    .line 76
    invoke-static {v13, v14}, Lfz;->h(J)I

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    if-eq v12, v13, :cond_6

    .line 81
    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_6
    invoke-static {v5, v6}, Lfz;->j(J)I

    .line 85
    .line 86
    .line 87
    move-result v12

    .line 88
    iget-wide v13, v0, Luw1;->p:J

    .line 89
    .line 90
    invoke-static {v13, v14}, Lfz;->j(J)I

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    if-eq v12, v13, :cond_7

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_7
    invoke-static {v5, v6}, Lfz;->g(J)I

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    int-to-float v12, v12

    .line 102
    invoke-virtual {v2}, Lt9;->b()F

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    cmpg-float v12, v12, v13

    .line 107
    .line 108
    if-ltz v12, :cond_d

    .line 109
    .line 110
    iget-object v2, v2, Lt9;->d:Lw03;

    .line 111
    .line 112
    iget-boolean v2, v2, Lw03;->d:Z

    .line 113
    .line 114
    if-eqz v2, :cond_8

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_8
    :goto_1
    iget-wide v1, v0, Luw1;->p:J

    .line 118
    .line 119
    invoke-static {v5, v6, v1, v2}, Lfz;->b(JJ)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-nez v1, :cond_c

    .line 124
    .line 125
    iget-object v1, v0, Luw1;->j:Lt9;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object v2, v1, Lt9;->a:Lx9;

    .line 131
    .line 132
    iget-object v2, v2, Lx9;->i:Lg61;

    .line 133
    .line 134
    invoke-virtual {v2}, Lg61;->c()F

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    invoke-virtual {v1}, Lt9;->d()F

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    invoke-static {v2}, Lqp0;->l(F)I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    invoke-virtual {v1}, Lt9;->b()F

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    invoke-static {v4}, Lqp0;->l(F)I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    int-to-long v12, v2

    .line 159
    shl-long/2addr v12, v11

    .line 160
    int-to-long v14, v4

    .line 161
    and-long/2addr v14, v9

    .line 162
    or-long/2addr v12, v14

    .line 163
    invoke-static {v5, v6, v12, v13}, Lgz;->d(JJ)J

    .line 164
    .line 165
    .line 166
    move-result-wide v12

    .line 167
    iput-wide v12, v0, Luw1;->l:J

    .line 168
    .line 169
    iget v2, v0, Luw1;->d:I

    .line 170
    .line 171
    if-ne v2, v7, :cond_9

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_9
    shr-long v14, v12, v11

    .line 175
    .line 176
    long-to-int v2, v14

    .line 177
    int-to-float v2, v2

    .line 178
    invoke-virtual {v1}, Lt9;->d()F

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    cmpg-float v2, v2, v4

    .line 183
    .line 184
    if-ltz v2, :cond_b

    .line 185
    .line 186
    and-long/2addr v9, v12

    .line 187
    long-to-int v2, v9

    .line 188
    int-to-float v2, v2

    .line 189
    invoke-virtual {v1}, Lt9;->b()F

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    cmpg-float v1, v2, v1

    .line 194
    .line 195
    if-gez v1, :cond_a

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_a
    :goto_2
    move v3, v8

    .line 199
    :cond_b
    :goto_3
    iput-boolean v3, v0, Luw1;->k:Z

    .line 200
    .line 201
    iput-wide v5, v0, Luw1;->p:J

    .line 202
    .line 203
    :cond_c
    return v8

    .line 204
    :cond_d
    :goto_4
    invoke-virtual {v0, v1}, Luw1;->e(Ld61;)Ltw1;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    iget-boolean v2, v0, Luw1;->e:Z

    .line 209
    .line 210
    iget v12, v0, Luw1;->d:I

    .line 211
    .line 212
    invoke-interface {v1}, Ltw1;->c()F

    .line 213
    .line 214
    .line 215
    move-result v13

    .line 216
    invoke-static {v5, v6, v2, v12, v13}, Lxe1;->q(JZIF)J

    .line 217
    .line 218
    .line 219
    move-result-wide v18

    .line 220
    iget-boolean v2, v0, Luw1;->e:Z

    .line 221
    .line 222
    iget v12, v0, Luw1;->d:I

    .line 223
    .line 224
    iget v13, v0, Luw1;->f:I

    .line 225
    .line 226
    if-nez v2, :cond_10

    .line 227
    .line 228
    if-ne v12, v4, :cond_e

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_e
    const/4 v2, 0x4

    .line 232
    if-ne v12, v2, :cond_f

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_f
    const/4 v2, 0x5

    .line 236
    if-ne v12, v2, :cond_10

    .line 237
    .line 238
    :goto_5
    move/from16 v16, v3

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_10
    if-ge v13, v3, :cond_11

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_11
    move/from16 v16, v13

    .line 245
    .line 246
    :goto_6
    new-instance v14, Lt9;

    .line 247
    .line 248
    move-object v15, v1

    .line 249
    check-cast v15, Lx9;

    .line 250
    .line 251
    move/from16 v17, v12

    .line 252
    .line 253
    invoke-direct/range {v14 .. v19}, Lt9;-><init>(Lx9;IIJ)V

    .line 254
    .line 255
    .line 256
    iput-wide v5, v0, Luw1;->p:J

    .line 257
    .line 258
    invoke-virtual {v14}, Lt9;->d()F

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    invoke-static {v1}, Lqp0;->l(F)I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    invoke-virtual {v14}, Lt9;->b()F

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    invoke-static {v2}, Lqp0;->l(F)I

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    int-to-long v12, v1

    .line 275
    shl-long/2addr v12, v11

    .line 276
    int-to-long v1, v2

    .line 277
    and-long/2addr v1, v9

    .line 278
    or-long/2addr v1, v12

    .line 279
    invoke-static {v5, v6, v1, v2}, Lgz;->d(JJ)J

    .line 280
    .line 281
    .line 282
    move-result-wide v1

    .line 283
    iput-wide v1, v0, Luw1;->l:J

    .line 284
    .line 285
    iget v4, v0, Luw1;->d:I

    .line 286
    .line 287
    if-ne v4, v7, :cond_12

    .line 288
    .line 289
    goto :goto_7

    .line 290
    :cond_12
    shr-long v4, v1, v11

    .line 291
    .line 292
    long-to-int v4, v4

    .line 293
    int-to-float v4, v4

    .line 294
    invoke-virtual {v14}, Lt9;->d()F

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    cmpg-float v4, v4, v5

    .line 299
    .line 300
    if-ltz v4, :cond_13

    .line 301
    .line 302
    and-long/2addr v1, v9

    .line 303
    long-to-int v1, v1

    .line 304
    int-to-float v1, v1

    .line 305
    invoke-virtual {v14}, Lt9;->b()F

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    cmpg-float v1, v1, v2

    .line 310
    .line 311
    if-gez v1, :cond_14

    .line 312
    .line 313
    :cond_13
    move v8, v3

    .line 314
    :cond_14
    :goto_7
    iput-boolean v8, v0, Luw1;->k:Z

    .line 315
    .line 316
    iput-object v14, v0, Luw1;->j:Lt9;

    .line 317
    .line 318
    return v3
.end method

.method public final c()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Luw1;->j:Lt9;

    .line 3
    .line 4
    iput-object v0, p0, Luw1;->n:Ltw1;

    .line 5
    .line 6
    iput-object v0, p0, Luw1;->o:Ld61;

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Luw1;->q:I

    .line 10
    .line 11
    iput v0, p0, Luw1;->r:I

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-static {v0, v0, v0, v0}, Lgz;->h(IIII)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    iput-wide v1, p0, Luw1;->p:J

    .line 19
    .line 20
    const-wide/16 v1, 0x0

    .line 21
    .line 22
    iput-wide v1, p0, Luw1;->l:J

    .line 23
    .line 24
    iput-boolean v0, p0, Luw1;->k:Z

    .line 25
    .line 26
    return-void
.end method

.method public final d(Le70;)V
    .locals 5

    .line 1
    iget-object v0, p0, Luw1;->i:Le70;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget v1, Loz0;->b:I

    .line 6
    .line 7
    invoke-interface {p1}, Le70;->b()F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-interface {p1}, Le70;->m()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v1, v2}, Loz0;->a(FF)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-wide v1, Loz0;->a:J

    .line 21
    .line 22
    :goto_0
    if-nez v0, :cond_1

    .line 23
    .line 24
    iput-object p1, p0, Luw1;->i:Le70;

    .line 25
    .line 26
    iput-wide v1, p0, Luw1;->h:J

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-wide v3, p0, Luw1;->h:J

    .line 32
    .line 33
    cmp-long v0, v3, v1

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    iput-object p1, p0, Luw1;->i:Le70;

    .line 39
    .line 40
    iput-wide v1, p0, Luw1;->h:J

    .line 41
    .line 42
    iget-wide v0, p0, Luw1;->s:J

    .line 43
    .line 44
    const/4 p1, 0x2

    .line 45
    shl-long/2addr v0, p1

    .line 46
    const-wide/16 v2, 0x1

    .line 47
    .line 48
    or-long/2addr v0, v2

    .line 49
    iput-wide v0, p0, Luw1;->s:J

    .line 50
    .line 51
    invoke-virtual {p0}, Luw1;->c()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final e(Ld61;)Ltw1;
    .locals 9

    .line 1
    iget-object v0, p0, Luw1;->n:Ltw1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Luw1;->o:Ld61;

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Ltw1;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    :cond_0
    iput-object p1, p0, Luw1;->o:Ld61;

    .line 16
    .line 17
    iget-object v3, p0, Luw1;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v0, p0, Luw1;->b:Lm13;

    .line 20
    .line 21
    invoke-static {v0, p1}, Lxe1;->k0(Lm13;Ld61;)Lm13;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    iget-object v8, p0, Luw1;->i:Le70;

    .line 26
    .line 27
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v7, p0, Luw1;->c:Lxl0;

    .line 31
    .line 32
    new-instance v2, Lx9;

    .line 33
    .line 34
    sget-object v5, Lbe0;->h:Lbe0;

    .line 35
    .line 36
    move-object v6, v5

    .line 37
    invoke-direct/range {v2 .. v8}, Lx9;-><init>(Ljava/lang/String;Lm13;Ljava/util/List;Ljava/util/List;Lxl0;Le70;)V

    .line 38
    .line 39
    .line 40
    move-object v0, v2

    .line 41
    :cond_1
    iput-object v0, p0, Luw1;->n:Ltw1;

    .line 42
    .line 43
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ParagraphLayoutCache(paragraph="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Luw1;->j:Lt9;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const-string v1, "<paragraph>"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "null"

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", lastDensity="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-wide v1, p0, Luw1;->h:J

    .line 26
    .line 27
    invoke-static {v1, v2}, Loz0;->b(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, ", history="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-wide v1, p0, Luw1;->s:J

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, ", constraints=$)"

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method
