.class public final Lvy0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lam2;

.field public b:Lqy0;

.field public c:Lty0;

.field public d:Lsy0;

.field public e:Lry0;

.field public f:Lp40;

.field public g:Lhh1;

.field public h:J

.field public i:Lms0;

.field public final j:Ldk;

.field public final k:Ldk;

.field public l:J


# direct methods
.method public constructor <init>(Lam2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvy0;->a:Lam2;

    .line 5
    .line 6
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, Lvy0;->h:J

    .line 12
    .line 13
    new-instance p1, Ldk;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    const/4 v1, 0x5

    .line 17
    invoke-direct {p1, v0, v1}, Ldk;-><init>(BI)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Llk1;

    .line 21
    .line 22
    invoke-direct {v1}, Llk1;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, p1, Ldk;->j:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object p1, p0, Lvy0;->j:Ldk;

    .line 28
    .line 29
    new-instance p1, Ldk;

    .line 30
    .line 31
    const/16 v1, 0x8

    .line 32
    .line 33
    invoke-direct {p1, v0, v1}, Ldk;-><init>(BI)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lck1;

    .line 37
    .line 38
    invoke-direct {v0}, Lck1;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p1, Ldk;->j:Ljava/lang/Object;

    .line 42
    .line 43
    iput-object p1, p0, Lvy0;->k:Ldk;

    .line 44
    .line 45
    const-wide/16 v0, 0x0

    .line 46
    .line 47
    iput-wide v0, p0, Lvy0;->l:J

    .line 48
    .line 49
    return-void
.end method

.method public static c(Lvy0;Loy0;JJI)V
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
    iget-object p6, p0, Lvy0;->a:Lam2;

    .line 8
    .line 9
    iget-object v0, p0, Lvy0;->d:Lsy0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lsy0;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    iput-object v2, v0, Lsy0;->n:Loy0;

    .line 21
    .line 22
    const-wide v2, 0x7fffffffffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    iput-wide v2, v0, Lsy0;->o:J

    .line 28
    .line 29
    iput-boolean v1, v0, Lsy0;->p:Z

    .line 30
    .line 31
    iput-object v0, p0, Lvy0;->d:Lsy0;

    .line 32
    .line 33
    :cond_1
    iput-object p1, v0, Lsy0;->n:Loy0;

    .line 34
    .line 35
    iput-wide p2, v0, Lsy0;->o:J

    .line 36
    .line 37
    iget-object p1, p0, Lvy0;->i:Lms0;

    .line 38
    .line 39
    iget-object p2, p6, Lam2;->x:Lqv1;

    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    new-instance p1, Lms0;

    .line 44
    .line 45
    invoke-direct {p1, p2}, Lms0;-><init>(Lqv1;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lvy0;->i:Lms0;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    iput-object p2, p1, Lms0;->b:Ljava/lang/Object;

    .line 52
    .line 53
    iput-wide p4, p1, Lms0;->a:J

    .line 54
    .line 55
    :goto_0
    iput-boolean v1, v0, Lsy0;->p:Z

    .line 56
    .line 57
    iput-object v0, p0, Lvy0;->f:Lp40;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lvy0;->b:Lqy0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lpy0;->j:Lpy0;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lqy0;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v0, Lqy0;->n:Lpy0;

    .line 14
    .line 15
    iput-boolean v1, v0, Lqy0;->o:Z

    .line 16
    .line 17
    iput-object v0, p0, Lvy0;->b:Lqy0;

    .line 18
    .line 19
    :cond_0
    iput-object v2, v0, Lqy0;->n:Lpy0;

    .line 20
    .line 21
    iput-boolean v1, v0, Lqy0;->o:Z

    .line 22
    .line 23
    iput-object v0, p0, Lvy0;->f:Lp40;

    .line 24
    .line 25
    return-void
.end method

.method public final b(Loy0;JLms0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lvy0;->e:Lry0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lry0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, Lry0;->n:Loy0;

    .line 12
    .line 13
    const-wide v1, 0x7fffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v1, v0, Lry0;->o:J

    .line 19
    .line 20
    iput-object v0, p0, Lvy0;->e:Lry0;

    .line 21
    .line 22
    :cond_0
    iput-object p1, v0, Lry0;->n:Loy0;

    .line 23
    .line 24
    iput-wide p2, v0, Lry0;->o:J

    .line 25
    .line 26
    const-wide/16 p1, 0x0

    .line 27
    .line 28
    iput-wide p1, p4, Lms0;->a:J

    .line 29
    .line 30
    iput-object v0, p0, Lvy0;->f:Lp40;

    .line 31
    .line 32
    return-void
.end method

.method public final d()Lhh1;
    .locals 0

    .line 1
    iget-object p0, p0, Lvy0;->g:Lhh1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Velocity Tracker not initialized."

    .line 7
    .line 8
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final e(Loy0;Lny0;J)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p3

    .line 4
    .line 5
    iget-object v3, v0, Lvy0;->a:Lam2;

    .line 6
    .line 7
    invoke-static {v3}, Lsp0;->b0(Lt60;)Lzn1;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    const-wide/16 v5, 0x0

    .line 12
    .line 13
    invoke-virtual {v4, v5, v6}, Lzn1;->c(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    iget-wide v6, v0, Lvy0;->h:J

    .line 18
    .line 19
    const-wide v8, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v6, v7, v8, v9}, Lrs1;->b(JJ)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-nez v6, :cond_0

    .line 29
    .line 30
    iget-wide v6, v0, Lvy0;->h:J

    .line 31
    .line 32
    invoke-static {v4, v5, v6, v7}, Lrs1;->b(JJ)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-nez v6, :cond_0

    .line 37
    .line 38
    iget-wide v6, v0, Lvy0;->h:J

    .line 39
    .line 40
    invoke-static {v4, v5, v6, v7}, Lrs1;->d(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    iget-wide v8, v0, Lvy0;->l:J

    .line 45
    .line 46
    invoke-static {v8, v9, v6, v7}, Lrs1;->e(JJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    iput-wide v6, v0, Lvy0;->l:J

    .line 51
    .line 52
    :cond_0
    iput-wide v4, v0, Lvy0;->h:J

    .line 53
    .line 54
    iget-object v4, v3, Lam2;->x:Lqv1;

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    sget-object v5, Lqv1;->h:Lqv1;

    .line 60
    .line 61
    const/16 v6, 0x20

    .line 62
    .line 63
    const-wide v7, 0xffffffffL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    if-ne v4, v5, :cond_1

    .line 69
    .line 70
    and-long v4, v1, v7

    .line 71
    .line 72
    :goto_0
    long-to-int v4, v4

    .line 73
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    shr-long v4, v1, v6

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :goto_1
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    const/high16 v5, 0x40000000    # 2.0f

    .line 86
    .line 87
    cmpl-float v4, v4, v5

    .line 88
    .line 89
    if-lez v4, :cond_7

    .line 90
    .line 91
    invoke-virtual {v0}, Lvy0;->d()Lhh1;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    iget-object v11, v3, Lam2;->x:Lqv1;

    .line 96
    .line 97
    iget-object v13, v0, Lvy0;->j:Ldk;

    .line 98
    .line 99
    iget-wide v14, v0, Lvy0;->l:J

    .line 100
    .line 101
    move-object/from16 v10, p1

    .line 102
    .line 103
    move-object/from16 v12, p2

    .line 104
    .line 105
    invoke-static/range {v9 .. v15}, Lci0;->s(Lhh1;Loy0;Lqv1;Lny0;Ldk;J)V

    .line 106
    .line 107
    .line 108
    new-instance v4, Lnb0;

    .line 109
    .line 110
    iget-object v0, v0, Lvy0;->k:Ldk;

    .line 111
    .line 112
    iget-object v5, v0, Ldk;->j:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v5, Lck1;

    .line 115
    .line 116
    iget v9, v5, Lck1;->b:I

    .line 117
    .line 118
    const/4 v10, 0x3

    .line 119
    if-ne v9, v10, :cond_3

    .line 120
    .line 121
    iget v11, v0, Ldk;->i:I

    .line 122
    .line 123
    add-int/lit8 v12, v11, 0x1

    .line 124
    .line 125
    iput v12, v0, Ldk;->i:I

    .line 126
    .line 127
    if-ltz v11, :cond_2

    .line 128
    .line 129
    if-ge v11, v9, :cond_2

    .line 130
    .line 131
    iget-object v9, v5, Lck1;->a:[J

    .line 132
    .line 133
    aget-wide v12, v9, v11

    .line 134
    .line 135
    aput-wide v1, v9, v11

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_2
    const-string v0, "Index must be between 0 and size"

    .line 139
    .line 140
    invoke-static {v0}, Ls;->d(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_3
    invoke-virtual {v5, v1, v2}, Lck1;->a(J)V

    .line 145
    .line 146
    .line 147
    :goto_2
    iget v1, v0, Ldk;->i:I

    .line 148
    .line 149
    const/4 v2, 0x0

    .line 150
    if-ne v1, v10, :cond_4

    .line 151
    .line 152
    iput v2, v0, Ldk;->i:I

    .line 153
    .line 154
    :cond_4
    iget-object v0, v5, Lck1;->a:[J

    .line 155
    .line 156
    iget v1, v5, Lck1;->b:I

    .line 157
    .line 158
    const/4 v9, 0x0

    .line 159
    move v10, v2

    .line 160
    move v11, v9

    .line 161
    :goto_3
    if-ge v10, v1, :cond_5

    .line 162
    .line 163
    aget-wide v12, v0, v10

    .line 164
    .line 165
    shr-long/2addr v12, v6

    .line 166
    long-to-int v12, v12

    .line 167
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 168
    .line 169
    .line 170
    move-result v12

    .line 171
    add-float/2addr v11, v12

    .line 172
    add-int/lit8 v10, v10, 0x1

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_5
    iget v0, v5, Lck1;->b:I

    .line 176
    .line 177
    int-to-float v1, v0

    .line 178
    div-float/2addr v11, v1

    .line 179
    iget-object v1, v5, Lck1;->a:[J

    .line 180
    .line 181
    :goto_4
    if-ge v2, v0, :cond_6

    .line 182
    .line 183
    aget-wide v12, v1, v2

    .line 184
    .line 185
    and-long/2addr v12, v7

    .line 186
    long-to-int v10, v12

    .line 187
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    add-float/2addr v9, v10

    .line 192
    add-int/lit8 v2, v2, 0x1

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_6
    iget v0, v5, Lck1;->b:I

    .line 196
    .line 197
    int-to-float v0, v0

    .line 198
    div-float/2addr v9, v0

    .line 199
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    int-to-long v0, v0

    .line 204
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    int-to-long v9, v2

    .line 209
    shl-long/2addr v0, v6

    .line 210
    and-long v5, v9, v7

    .line 211
    .line 212
    or-long/2addr v0, v5

    .line 213
    const/4 v2, 0x1

    .line 214
    invoke-direct {v4, v0, v1, v2}, Lnb0;-><init>(JZ)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3, v4}, Lam2;->W0(Lqb0;)V

    .line 218
    .line 219
    .line 220
    :cond_7
    return-void
.end method

.method public final f(Loy0;Loy0;Lny0;J)V
    .locals 10

    .line 1
    iget-object v0, p0, Lvy0;->g:Lhh1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lhh1;

    .line 6
    .line 7
    const/16 v1, 0x1c

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lhh1;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lvy0;->g:Lhh1;

    .line 13
    .line 14
    :cond_0
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    iput-wide v0, p0, Lvy0;->l:J

    .line 17
    .line 18
    invoke-virtual {p0}, Lvy0;->d()Lhh1;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v9, p0, Lvy0;->a:Lam2;

    .line 23
    .line 24
    iget-object v4, v9, Lam2;->x:Lqv1;

    .line 25
    .line 26
    iget-object v6, p0, Lvy0;->j:Ldk;

    .line 27
    .line 28
    iget-wide v7, p0, Lvy0;->l:J

    .line 29
    .line 30
    move-object v3, p1

    .line 31
    move-object v5, p3

    .line 32
    invoke-static/range {v2 .. v8}, Lci0;->s(Lhh1;Loy0;Lqv1;Lny0;Ldk;J)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v9, Lam2;->x:Lqv1;

    .line 36
    .line 37
    invoke-static {p2, p1, v5}, Lci0;->T(Loy0;Lqv1;Lny0;)J

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    invoke-static {p1, p2, p4, p5}, Lrs1;->d(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    iget-object p3, v9, Lam2;->y:Lml2;

    .line 46
    .line 47
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v9}, Lsp0;->b0(Lt60;)Lzn1;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    invoke-virtual {p3, v0, v1}, Lzn1;->c(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide p3

    .line 58
    iput-wide p3, p0, Lvy0;->h:J

    .line 59
    .line 60
    new-instance p3, Lob0;

    .line 61
    .line 62
    invoke-direct {p3, p1, p2}, Lob0;-><init>(J)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v9, p3}, Lam2;->W0(Lqb0;)V

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, Lvy0;->k:Ldk;

    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    iput p1, p0, Ldk;->i:I

    .line 72
    .line 73
    iget-object p0, p0, Ldk;->j:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, Lck1;

    .line 76
    .line 77
    iput p1, p0, Lck1;->b:I

    .line 78
    .line 79
    return-void
.end method
