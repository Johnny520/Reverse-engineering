.class public final Lm/b1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lm/p0;

.field public b:Lm/w0;

.field public c:Lm/z0;

.field public d:Lm/y0;

.field public e:Lm/x0;

.field public f:La7/a;

.field public g:Lm/a;

.field public h:J

.field public i:Lm/a3;

.field public final j:La5/a;

.field public final k:La5/a;

.field public l:J


# direct methods
.method public constructor <init>(Lm/p0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm/b1;->a:Lm/p0;

    .line 5
    .line 6
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, Lm/b1;->h:J

    .line 12
    .line 13
    new-instance p1, La5/a;

    .line 14
    .line 15
    const/4 v0, 0x7

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {p1, v1, v0}, La5/a;-><init>(BI)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lf/f0;

    .line 21
    .line 22
    invoke-direct {v0}, Lf/f0;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p1, La5/a;->i:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object p1, p0, Lm/b1;->j:La5/a;

    .line 28
    .line 29
    new-instance p1, La5/a;

    .line 30
    .line 31
    const/16 v0, 0x8

    .line 32
    .line 33
    invoke-direct {p1, v1, v0}, La5/a;-><init>(BI)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lf/y;

    .line 37
    .line 38
    invoke-direct {v0}, Lf/y;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p1, La5/a;->i:Ljava/lang/Object;

    .line 42
    .line 43
    iput-object p1, p0, Lm/b1;->k:La5/a;

    .line 44
    .line 45
    const-wide/16 v0, 0x0

    .line 46
    .line 47
    iput-wide v0, p0, Lm/b1;->l:J

    .line 48
    .line 49
    return-void
.end method

.method public static c(Lm/b1;Lp1/b;JJI)V
    .locals 4

    .line 1
    and-int/lit8 p6, p6, 0x4

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const-wide/16 p4, 0x0

    .line 6
    .line 7
    :cond_0
    iget-object p6, p0, Lm/b1;->a:Lm/p0;

    .line 8
    .line 9
    iget-object v0, p0, Lm/b1;->d:Lm/y0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lm/y0;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    iput-object v2, v0, Lm/y0;->b:Lp1/b;

    .line 21
    .line 22
    const-wide v2, 0x7fffffffffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    iput-wide v2, v0, Lm/y0;->c:J

    .line 28
    .line 29
    iput-boolean v1, v0, Lm/y0;->d:Z

    .line 30
    .line 31
    iput-object v0, p0, Lm/b1;->d:Lm/y0;

    .line 32
    .line 33
    :cond_1
    iput-object p1, v0, Lm/y0;->b:Lp1/b;

    .line 34
    .line 35
    iput-wide p2, v0, Lm/y0;->c:J

    .line 36
    .line 37
    iget-object p1, p0, Lm/b1;->i:Lm/a3;

    .line 38
    .line 39
    iget-object p2, p6, Lm/p0;->w:Lm/p1;

    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    new-instance p1, Lm/a3;

    .line 44
    .line 45
    invoke-direct {p1, p2}, Lm/a3;-><init>(Lm/p1;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lm/b1;->i:Lm/a3;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    iput-object p2, p1, Lm/a3;->a:Lm/p1;

    .line 52
    .line 53
    iput-wide p4, p1, Lm/a3;->b:J

    .line 54
    .line 55
    :goto_0
    iput-boolean v1, v0, Lm/y0;->d:Z

    .line 56
    .line 57
    iput-object v0, p0, Lm/b1;->f:La7/a;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b1;->b:Lm/w0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lm/v0;->i:Lm/v0;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lm/w0;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v0, Lm/w0;->b:Lm/v0;

    .line 14
    .line 15
    iput-boolean v1, v0, Lm/w0;->c:Z

    .line 16
    .line 17
    iput-object v0, p0, Lm/b1;->b:Lm/w0;

    .line 18
    .line 19
    :cond_0
    iput-object v2, v0, Lm/w0;->b:Lm/v0;

    .line 20
    .line 21
    iput-boolean v1, v0, Lm/w0;->c:Z

    .line 22
    .line 23
    iput-object v0, p0, Lm/b1;->f:La7/a;

    .line 24
    .line 25
    return-void
.end method

.method public final b(Lp1/b;JLm/a3;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b1;->e:Lm/x0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lm/x0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, Lm/x0;->b:Lp1/b;

    .line 12
    .line 13
    const-wide v1, 0x7fffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v1, v0, Lm/x0;->c:J

    .line 19
    .line 20
    iput-object v0, p0, Lm/b1;->e:Lm/x0;

    .line 21
    .line 22
    :cond_0
    iput-object p1, v0, Lm/x0;->b:Lp1/b;

    .line 23
    .line 24
    iput-wide p2, v0, Lm/x0;->c:J

    .line 25
    .line 26
    const-wide/16 p1, 0x0

    .line 27
    .line 28
    iput-wide p1, p4, Lm/a3;->b:J

    .line 29
    .line 30
    iput-object v0, p0, Lm/b1;->f:La7/a;

    .line 31
    .line 32
    return-void
.end method

.method public final d()Lm/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b1;->g:Lm/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "Velocity Tracker not initialized."

    .line 7
    .line 8
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final e(Lp1/b;Lp1/a;J)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p3

    .line 4
    .line 5
    iget-object v3, v0, Lm/b1;->a:Lm/p0;

    .line 6
    .line 7
    invoke-static {v3}, Lx1/k;->v(Lx1/i;)Lx1/i1;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    const-wide/16 v5, 0x0

    .line 12
    .line 13
    invoke-virtual {v4, v5, v6}, Lx1/i1;->P(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    iget-wide v6, v0, Lm/b1;->h:J

    .line 18
    .line 19
    const-wide v8, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v6, v7, v8, v9}, Le1/b;->b(JJ)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-nez v6, :cond_0

    .line 29
    .line 30
    iget-wide v6, v0, Lm/b1;->h:J

    .line 31
    .line 32
    invoke-static {v4, v5, v6, v7}, Le1/b;->b(JJ)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-nez v6, :cond_0

    .line 37
    .line 38
    iget-wide v6, v0, Lm/b1;->h:J

    .line 39
    .line 40
    invoke-static {v4, v5, v6, v7}, Le1/b;->d(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    iget-wide v8, v0, Lm/b1;->l:J

    .line 45
    .line 46
    invoke-static {v8, v9, v6, v7}, Le1/b;->e(JJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    iput-wide v6, v0, Lm/b1;->l:J

    .line 51
    .line 52
    :cond_0
    iput-wide v4, v0, Lm/b1;->h:J

    .line 53
    .line 54
    iget-object v4, v3, Lm/p0;->w:Lm/p1;

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    sget-object v5, Lm/s0;->a:Lm/r0;

    .line 60
    .line 61
    sget-object v5, Lm/p1;->g:Lm/p1;

    .line 62
    .line 63
    const/16 v6, 0x20

    .line 64
    .line 65
    const-wide v7, 0xffffffffL

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    if-ne v4, v5, :cond_1

    .line 71
    .line 72
    and-long v4, v1, v7

    .line 73
    .line 74
    :goto_0
    long-to-int v4, v4

    .line 75
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    shr-long v4, v1, v6

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :goto_1
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    const/high16 v5, 0x40000000    # 2.0f

    .line 88
    .line 89
    cmpl-float v4, v4, v5

    .line 90
    .line 91
    if-lez v4, :cond_7

    .line 92
    .line 93
    invoke-virtual {v0}, Lm/b1;->d()Lm/a;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    iget-object v11, v3, Lm/p0;->w:Lm/p1;

    .line 98
    .line 99
    iget-object v13, v0, Lm/b1;->j:La5/a;

    .line 100
    .line 101
    iget-wide v14, v0, Lm/b1;->l:J

    .line 102
    .line 103
    move-object/from16 v10, p1

    .line 104
    .line 105
    move-object/from16 v12, p2

    .line 106
    .line 107
    invoke-static/range {v9 .. v15}, Lac/p;->b(Lm/a;Lp1/b;Lm/p1;Lp1/a;La5/a;J)V

    .line 108
    .line 109
    .line 110
    new-instance v4, Lm/y;

    .line 111
    .line 112
    iget-object v5, v0, Lm/b1;->k:La5/a;

    .line 113
    .line 114
    iget-object v9, v5, La5/a;->i:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v9, Lf/y;

    .line 117
    .line 118
    iget v10, v9, Lf/y;->b:I

    .line 119
    .line 120
    const/4 v11, 0x3

    .line 121
    if-ne v10, v11, :cond_3

    .line 122
    .line 123
    iget v12, v5, La5/a;->h:I

    .line 124
    .line 125
    add-int/lit8 v13, v12, 0x1

    .line 126
    .line 127
    iput v13, v5, La5/a;->h:I

    .line 128
    .line 129
    if-ltz v12, :cond_2

    .line 130
    .line 131
    if-ge v12, v10, :cond_2

    .line 132
    .line 133
    iget-object v10, v9, Lf/y;->a:[J

    .line 134
    .line 135
    aget-wide v13, v10, v12

    .line 136
    .line 137
    aput-wide v1, v10, v12

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_2
    const-string v1, "Index must be between 0 and size"

    .line 141
    .line 142
    invoke-static {v1}, Lokio/a;->i(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_3
    invoke-virtual {v9, v1, v2}, Lf/y;->a(J)V

    .line 147
    .line 148
    .line 149
    :goto_2
    iget v1, v5, La5/a;->h:I

    .line 150
    .line 151
    const/4 v2, 0x0

    .line 152
    if-ne v1, v11, :cond_4

    .line 153
    .line 154
    iput v2, v5, La5/a;->h:I

    .line 155
    .line 156
    :cond_4
    iget-object v1, v9, Lf/y;->a:[J

    .line 157
    .line 158
    iget v5, v9, Lf/y;->b:I

    .line 159
    .line 160
    const/4 v10, 0x0

    .line 161
    move v11, v2

    .line 162
    move v12, v10

    .line 163
    :goto_3
    if-ge v11, v5, :cond_5

    .line 164
    .line 165
    aget-wide v13, v1, v11

    .line 166
    .line 167
    shr-long/2addr v13, v6

    .line 168
    long-to-int v13, v13

    .line 169
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    add-float/2addr v12, v13

    .line 174
    add-int/lit8 v11, v11, 0x1

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_5
    iget v1, v9, Lf/y;->b:I

    .line 178
    .line 179
    int-to-float v5, v1

    .line 180
    div-float/2addr v12, v5

    .line 181
    iget-object v5, v9, Lf/y;->a:[J

    .line 182
    .line 183
    :goto_4
    if-ge v2, v1, :cond_6

    .line 184
    .line 185
    aget-wide v13, v5, v2

    .line 186
    .line 187
    and-long/2addr v13, v7

    .line 188
    long-to-int v11, v13

    .line 189
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    add-float/2addr v10, v11

    .line 194
    add-int/lit8 v2, v2, 0x1

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_6
    iget v1, v9, Lf/y;->b:I

    .line 198
    .line 199
    int-to-float v1, v1

    .line 200
    div-float/2addr v10, v1

    .line 201
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    int-to-long v1, v1

    .line 206
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    int-to-long v9, v5

    .line 211
    shl-long/2addr v1, v6

    .line 212
    and-long v5, v9, v7

    .line 213
    .line 214
    or-long/2addr v1, v5

    .line 215
    const/4 v5, 0x1

    .line 216
    invoke-direct {v4, v1, v2, v5}, Lm/y;-><init>(JZ)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3, v4}, Lm/p0;->v1(Lm/b0;)V

    .line 220
    .line 221
    .line 222
    :cond_7
    return-void
.end method

.method public final f(Lp1/b;Lp1/b;Lp1/a;J)V
    .locals 10

    .line 1
    iget-object v0, p0, Lm/b1;->g:Lm/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lm/a;

    .line 6
    .line 7
    const/16 v1, 0x11

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lm/a;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lm/b1;->g:Lm/a;

    .line 13
    .line 14
    :cond_0
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    iput-wide v0, p0, Lm/b1;->l:J

    .line 17
    .line 18
    invoke-virtual {p0}, Lm/b1;->d()Lm/a;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v9, p0, Lm/b1;->a:Lm/p0;

    .line 23
    .line 24
    iget-object v4, v9, Lm/p0;->w:Lm/p1;

    .line 25
    .line 26
    iget-object v6, p0, Lm/b1;->j:La5/a;

    .line 27
    .line 28
    iget-wide v7, p0, Lm/b1;->l:J

    .line 29
    .line 30
    move-object v3, p1

    .line 31
    move-object v5, p3

    .line 32
    invoke-static/range {v2 .. v8}, Lac/p;->b(Lm/a;Lp1/b;Lm/p1;Lp1/a;La5/a;J)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v9, Lm/p0;->w:Lm/p1;

    .line 36
    .line 37
    invoke-static {p2, p1, v5}, Lac/p;->I(Lp1/b;Lm/p1;Lp1/a;)J

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    invoke-static {p1, p2, p4, p5}, Le1/b;->d(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    iget-object p3, v9, Lm/p0;->x:Lfg/l;

    .line 46
    .line 47
    new-instance p4, Ls1/d0;

    .line 48
    .line 49
    const/4 p5, 0x1

    .line 50
    invoke-direct {p4, p5}, Ls1/d0;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p3, p4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    check-cast p3, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-eqz p3, :cond_1

    .line 64
    .line 65
    invoke-static {v9}, Lx1/k;->v(Lx1/i;)Lx1/i1;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {p3, v0, v1}, Lx1/i1;->P(J)J

    .line 70
    .line 71
    .line 72
    move-result-wide p3

    .line 73
    iput-wide p3, p0, Lm/b1;->h:J

    .line 74
    .line 75
    new-instance p3, Lm/z;

    .line 76
    .line 77
    invoke-direct {p3, p1, p2}, Lm/z;-><init>(J)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v9, p3}, Lm/p0;->v1(Lm/b0;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    iget-object p1, p0, Lm/b1;->k:La5/a;

    .line 84
    .line 85
    const/4 p2, 0x0

    .line 86
    iput p2, p1, La5/a;->h:I

    .line 87
    .line 88
    iget-object p1, p1, La5/a;->i:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, Lf/y;

    .line 91
    .line 92
    iput p2, p1, Lf/y;->b:I

    .line 93
    .line 94
    return-void
.end method
