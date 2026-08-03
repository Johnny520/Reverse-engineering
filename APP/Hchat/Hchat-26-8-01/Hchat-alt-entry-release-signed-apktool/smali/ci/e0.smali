.class public final Lci/e0;
.super Lx1/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/h;
.implements Lx1/v;
.implements Lr1/a;


# instance fields
.field public A:Lqg/e1;

.field public final B:F

.field public C:F

.field public D:F

.field public E:F

.field public F:Lu2/c;

.field public G:Ly1/o2;

.field public w:Z

.field public x:Z

.field public final y:Lr1/d;

.field public final z:Lci/p0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lx1/j;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lci/e0;->w:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lci/e0;->x:Z

    .line 8
    .line 9
    new-instance v0, Lr1/d;

    .line 10
    .line 11
    invoke-direct {v0}, Lr1/d;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lci/e0;->y:Lr1/d;

    .line 15
    .line 16
    new-instance v0, Lci/p0;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lci/e0;->z:Lci/p0;

    .line 22
    .line 23
    const/high16 v0, 0x3f800000    # 1.0f

    .line 24
    .line 25
    iput v0, p0, Lci/e0;->B:F

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final M(JLwf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, Lci/d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lci/d0;

    .line 7
    .line 8
    iget v1, v0, Lci/d0;->j:I

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
    iput v1, v0, Lci/d0;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lci/d0;

    .line 21
    .line 22
    check-cast p3, Lyf/c;

    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lci/d0;-><init>(Lci/e0;Lyf/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, v0, Lci/d0;->h:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, Lci/d0;->j:I

    .line 30
    .line 31
    iget v2, p0, Lci/e0;->B:F

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v4, :cond_2

    .line 38
    .line 39
    if-ne v1, v3, :cond_1

    .line 40
    .line 41
    iget-wide p1, v0, Lci/d0;->g:J

    .line 42
    .line 43
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    return-object p1

    .line 54
    :cond_2
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-object p3

    .line 58
    :cond_3
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-boolean p3, p0, Ly0/n;->t:Z

    .line 62
    .line 63
    const-wide/16 v5, 0x0

    .line 64
    .line 65
    if-nez p3, :cond_4

    .line 66
    .line 67
    new-instance p1, Lu2/q;

    .line 68
    .line 69
    invoke-direct {p1, v5, v6}, Lu2/q;-><init>(J)V

    .line 70
    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_4
    iget p3, p0, Lci/e0;->C:F

    .line 74
    .line 75
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    cmpl-float p3, p3, v2

    .line 80
    .line 81
    if-lez p3, :cond_5

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_5
    const/4 v4, 0x0

    .line 85
    :goto_1
    invoke-virtual {p0}, Lci/e0;->o1()Lci/z;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    invoke-virtual {p3}, Lci/z;->a()Z

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    if-eq p3, v4, :cond_6

    .line 94
    .line 95
    invoke-virtual {p0}, Lci/e0;->o1()Lci/z;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-virtual {p3, v4}, Lci/z;->b(Z)V

    .line 100
    .line 101
    .line 102
    :cond_6
    sget-object p3, Lsh/h0;->a:Li0/u;

    .line 103
    .line 104
    invoke-static {p0, p3}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    if-nez p3, :cond_f

    .line 109
    .line 110
    iget-object p3, p0, Lci/e0;->A:Lqg/e1;

    .line 111
    .line 112
    if-eqz p3, :cond_7

    .line 113
    .line 114
    const/4 v1, 0x0

    .line 115
    invoke-virtual {p3, v1}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 116
    .line 117
    .line 118
    :cond_7
    iget-boolean p3, p0, Lci/e0;->x:Z

    .line 119
    .line 120
    if-eqz p3, :cond_9

    .line 121
    .line 122
    iput-wide p1, v0, Lci/d0;->g:J

    .line 123
    .line 124
    iput v3, v0, Lci/d0;->j:I

    .line 125
    .line 126
    iget-object p3, p0, Lci/e0;->y:Lr1/d;

    .line 127
    .line 128
    invoke-virtual {p3, p1, p2, v0}, Lr1/d;->c(JLyf/c;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 133
    .line 134
    if-ne p3, v0, :cond_8

    .line 135
    .line 136
    return-object v0

    .line 137
    :cond_8
    :goto_2
    check-cast p3, Lu2/q;

    .line 138
    .line 139
    iget-wide v5, p3, Lu2/q;->a:J

    .line 140
    .line 141
    :cond_9
    invoke-static {p1, p2, v5, v6}, Lu2/q;->d(JJ)J

    .line 142
    .line 143
    .line 144
    move-result-wide p1

    .line 145
    iget-boolean p3, p0, Lci/e0;->w:Z

    .line 146
    .line 147
    if-eqz p3, :cond_a

    .line 148
    .line 149
    invoke-static {p1, p2}, Lu2/q;->c(J)F

    .line 150
    .line 151
    .line 152
    move-result p3

    .line 153
    goto :goto_3

    .line 154
    :cond_a
    invoke-static {p1, p2}, Lu2/q;->b(J)F

    .line 155
    .line 156
    .line 157
    move-result p3

    .line 158
    :goto_3
    iget v0, p0, Lci/e0;->C:F

    .line 159
    .line 160
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    cmpl-float v0, v0, v2

    .line 165
    .line 166
    if-lez v0, :cond_e

    .line 167
    .line 168
    invoke-static {p3}, Ljava/lang/Math;->signum(F)F

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    iget v1, p0, Lci/e0;->C:F

    .line 173
    .line 174
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    cmpg-float v0, v0, v1

    .line 179
    .line 180
    const/4 v1, 0x0

    .line 181
    if-nez v0, :cond_c

    .line 182
    .line 183
    invoke-virtual {p0, p3}, Lci/e0;->r1(F)V

    .line 184
    .line 185
    .line 186
    iget-boolean p3, p0, Lci/e0;->w:Z

    .line 187
    .line 188
    if-eqz p3, :cond_b

    .line 189
    .line 190
    invoke-static {p1, p2}, Lu2/q;->c(J)F

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    invoke-static {v1, p1}, La/a;->d(FF)J

    .line 195
    .line 196
    .line 197
    move-result-wide p1

    .line 198
    goto :goto_4

    .line 199
    :cond_b
    invoke-static {p1, p2}, Lu2/q;->b(J)F

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    invoke-static {p1, v1}, La/a;->d(FF)J

    .line 204
    .line 205
    .line 206
    move-result-wide p1

    .line 207
    :goto_4
    invoke-static {v5, v6, p1, p2}, Lu2/q;->e(JJ)J

    .line 208
    .line 209
    .line 210
    move-result-wide p1

    .line 211
    new-instance p3, Lu2/q;

    .line 212
    .line 213
    invoke-direct {p3, p1, p2}, Lu2/q;-><init>(J)V

    .line 214
    .line 215
    .line 216
    return-object p3

    .line 217
    :cond_c
    invoke-virtual {p0, p3}, Lci/e0;->r1(F)V

    .line 218
    .line 219
    .line 220
    iget-boolean p3, p0, Lci/e0;->w:Z

    .line 221
    .line 222
    const v0, 0x4008887b

    .line 223
    .line 224
    .line 225
    if-eqz p3, :cond_d

    .line 226
    .line 227
    invoke-static {p1, p2}, Lu2/q;->c(J)F

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    div-float/2addr p1, v0

    .line 232
    invoke-static {v1, p1}, La/a;->d(FF)J

    .line 233
    .line 234
    .line 235
    move-result-wide p1

    .line 236
    goto :goto_5

    .line 237
    :cond_d
    invoke-static {p1, p2}, Lu2/q;->b(J)F

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    div-float/2addr p1, v0

    .line 242
    invoke-static {p1, v1}, La/a;->d(FF)J

    .line 243
    .line 244
    .line 245
    move-result-wide p1

    .line 246
    :goto_5
    invoke-static {v5, v6, p1, p2}, Lu2/q;->e(JJ)J

    .line 247
    .line 248
    .line 249
    move-result-wide p1

    .line 250
    new-instance p3, Lu2/q;

    .line 251
    .line 252
    invoke-direct {p3, p1, p2}, Lu2/q;-><init>(J)V

    .line 253
    .line 254
    .line 255
    return-object p3

    .line 256
    :cond_e
    new-instance p1, Lu2/q;

    .line 257
    .line 258
    invoke-direct {p1, v5, v6}, Lu2/q;-><init>(J)V

    .line 259
    .line 260
    .line 261
    return-object p1

    .line 262
    :cond_f
    invoke-static {}, Lah/a;->d()V

    .line 263
    .line 264
    .line 265
    const/4 p1, 0x0

    .line 266
    return-object p1
.end method

.method public final M0(JJI)J
    .locals 9

    .line 1
    iget-boolean v0, p0, Ly0/n;->t:Z

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-wide v1

    .line 8
    :cond_0
    iget v0, p0, Lci/e0;->C:F

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v3, p0, Lci/e0;->B:F

    .line 15
    .line 16
    cmpl-float v0, v0, v3

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-lez v0, :cond_1

    .line 20
    .line 21
    move v0, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    invoke-virtual {p0}, Lci/e0;->o1()Lci/z;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Lci/z;->a()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eq v4, v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Lci/e0;->o1()Lci/z;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v4, v0}, Lci/z;->b(Z)V

    .line 39
    .line 40
    .line 41
    :cond_2
    sget-object v0, Lsh/h0;->a:Li0/u;

    .line 42
    .line 43
    invoke-static {p0, v0}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_8

    .line 48
    .line 49
    if-ne p5, v3, :cond_7

    .line 50
    .line 51
    iget-object v0, p0, Lci/e0;->A:Lqg/e1;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-virtual {v0, v3}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    iget-boolean v0, p0, Lci/e0;->x:Z

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-object v3, p0, Lci/e0;->y:Lr1/d;

    .line 64
    .line 65
    move-wide v4, p1

    .line 66
    move-wide v6, p3

    .line 67
    move v8, p5

    .line 68
    invoke-virtual/range {v3 .. v8}, Lr1/d;->b(JJI)J

    .line 69
    .line 70
    .line 71
    move-result-wide v1

    .line 72
    goto :goto_1

    .line 73
    :cond_4
    move-wide v6, p3

    .line 74
    :goto_1
    invoke-static {v6, v7, v1, v2}, Le1/b;->d(JJ)J

    .line 75
    .line 76
    .line 77
    move-result-wide p1

    .line 78
    iget-boolean p3, p0, Lci/e0;->w:Z

    .line 79
    .line 80
    const/16 p4, 0x20

    .line 81
    .line 82
    const-wide v3, 0xffffffffL

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    if-eqz p3, :cond_5

    .line 88
    .line 89
    and-long/2addr p1, v3

    .line 90
    :goto_2
    long-to-int p1, p1

    .line 91
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    goto :goto_3

    .line 96
    :cond_5
    shr-long/2addr p1, p4

    .line 97
    goto :goto_2

    .line 98
    :goto_3
    invoke-virtual {p0, p1}, Lci/e0;->n1(F)V

    .line 99
    .line 100
    .line 101
    iget-boolean p1, p0, Lci/e0;->w:Z

    .line 102
    .line 103
    if-eqz p1, :cond_6

    .line 104
    .line 105
    shr-long p1, v1, p4

    .line 106
    .line 107
    long-to-int p1, p1

    .line 108
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    and-long p2, v6, v3

    .line 113
    .line 114
    long-to-int p2, p2

    .line 115
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    int-to-long v0, p1

    .line 124
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    int-to-long p1, p1

    .line 129
    shl-long p3, v0, p4

    .line 130
    .line 131
    and-long/2addr p1, v3

    .line 132
    or-long/2addr p1, p3

    .line 133
    return-wide p1

    .line 134
    :cond_6
    shr-long p1, v6, p4

    .line 135
    .line 136
    long-to-int p1, p1

    .line 137
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    and-long p2, v1, v3

    .line 142
    .line 143
    long-to-int p2, p2

    .line 144
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    int-to-long v0, p1

    .line 153
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    int-to-long p1, p1

    .line 158
    shl-long p3, v0, p4

    .line 159
    .line 160
    and-long/2addr p1, v3

    .line 161
    or-long/2addr p1, p3

    .line 162
    return-wide p1

    .line 163
    :cond_7
    move-wide v4, p1

    .line 164
    move-wide v6, p3

    .line 165
    move v8, p5

    .line 166
    iget-object v3, p0, Lci/e0;->y:Lr1/d;

    .line 167
    .line 168
    invoke-virtual/range {v3 .. v8}, Lr1/d;->b(JJI)J

    .line 169
    .line 170
    .line 171
    move-result-wide p1

    .line 172
    return-wide p1

    .line 173
    :cond_8
    invoke-static {}, Lah/a;->d()V

    .line 174
    .line 175
    .line 176
    const-wide/16 p1, 0x0

    .line 177
    .line 178
    return-wide p1
.end method

.method public final c1()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lci/e0;->s1()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr1/i;

    .line 5
    .line 6
    iget-object v1, p0, Lci/e0;->y:Lr1/d;

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Lr1/i;-><init>(Lr1/a;Lr1/d;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d1()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lci/e0;->p1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final f0(IJ)J
    .locals 8

    .line 1
    iget-boolean v0, p0, Ly0/n;->t:Z

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-wide v1

    .line 8
    :cond_0
    iget v0, p0, Lci/e0;->C:F

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v3, p0, Lci/e0;->B:F

    .line 15
    .line 16
    cmpl-float v0, v0, v3

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    if-lez v0, :cond_1

    .line 20
    .line 21
    move v0, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    invoke-virtual {p0}, Lci/e0;->o1()Lci/z;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-virtual {v5}, Lci/z;->a()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eq v5, v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Lci/e0;->o1()Lci/z;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v5, v0}, Lci/z;->b(Z)V

    .line 39
    .line 40
    .line 41
    :cond_2
    sget-object v0, Lsh/h0;->a:Li0/u;

    .line 42
    .line 43
    invoke-static {p0, v0}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_e

    .line 48
    .line 49
    iget-object v0, p0, Lci/e0;->y:Lr1/d;

    .line 50
    .line 51
    if-ne p1, v4, :cond_d

    .line 52
    .line 53
    iget-object v4, p0, Lci/e0;->A:Lqg/e1;

    .line 54
    .line 55
    if-eqz v4, :cond_3

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    invoke-virtual {v4, v5}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    iget-boolean v4, p0, Lci/e0;->x:Z

    .line 62
    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {v0, p1, p2, p3}, Lr1/d;->d(IJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    :cond_4
    invoke-static {p2, p3, v1, v2}, Le1/b;->d(JJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    iget-boolean p1, p0, Lci/e0;->w:Z

    .line 74
    .line 75
    const/16 v0, 0x20

    .line 76
    .line 77
    const-wide v6, 0xffffffffL

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    if-eqz p1, :cond_5

    .line 83
    .line 84
    and-long/2addr v4, v6

    .line 85
    :goto_1
    long-to-int p1, v4

    .line 86
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    goto :goto_2

    .line 91
    :cond_5
    shr-long/2addr v4, v0

    .line 92
    goto :goto_1

    .line 93
    :goto_2
    iget v4, p0, Lci/e0;->C:F

    .line 94
    .line 95
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    cmpg-float v3, v4, v3

    .line 100
    .line 101
    if-lez v3, :cond_c

    .line 102
    .line 103
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    iget v4, p0, Lci/e0;->D:F

    .line 108
    .line 109
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    cmpg-float v3, v3, v4

    .line 114
    .line 115
    if-nez v3, :cond_6

    .line 116
    .line 117
    goto/16 :goto_5

    .line 118
    .line 119
    :cond_6
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    iget v4, p0, Lci/e0;->D:F

    .line 124
    .line 125
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    cmpg-float v3, v3, v4

    .line 130
    .line 131
    if-nez v3, :cond_8

    .line 132
    .line 133
    invoke-virtual {p0, p1}, Lci/e0;->n1(F)V

    .line 134
    .line 135
    .line 136
    iget-boolean p1, p0, Lci/e0;->w:Z

    .line 137
    .line 138
    if-eqz p1, :cond_7

    .line 139
    .line 140
    shr-long/2addr v1, v0

    .line 141
    long-to-int p1, v1

    .line 142
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    and-long/2addr p2, v6

    .line 147
    long-to-int p2, p2

    .line 148
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    int-to-long v1, p1

    .line 157
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    int-to-long p1, p1

    .line 162
    shl-long v0, v1, v0

    .line 163
    .line 164
    and-long/2addr p1, v6

    .line 165
    or-long/2addr p1, v0

    .line 166
    return-wide p1

    .line 167
    :cond_7
    shr-long p1, p2, v0

    .line 168
    .line 169
    long-to-int p1, p1

    .line 170
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    and-long p2, v1, v6

    .line 175
    .line 176
    long-to-int p2, p2

    .line 177
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    int-to-long v1, p1

    .line 186
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    int-to-long p1, p1

    .line 191
    shl-long v0, v1, v0

    .line 192
    .line 193
    and-long/2addr p1, v6

    .line 194
    or-long/2addr p1, v0

    .line 195
    return-wide p1

    .line 196
    :cond_8
    iget p2, p0, Lci/e0;->D:F

    .line 197
    .line 198
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 203
    .line 204
    .line 205
    move-result p3

    .line 206
    cmpg-float p2, p2, p3

    .line 207
    .line 208
    if-gtz p2, :cond_9

    .line 209
    .line 210
    iget p2, p0, Lci/e0;->D:F

    .line 211
    .line 212
    neg-float p2, p2

    .line 213
    goto :goto_3

    .line 214
    :cond_9
    move p2, p1

    .line 215
    :goto_3
    iget p3, p0, Lci/e0;->D:F

    .line 216
    .line 217
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 218
    .line 219
    .line 220
    move-result p3

    .line 221
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    cmpg-float p1, p3, p1

    .line 226
    .line 227
    if-gtz p1, :cond_a

    .line 228
    .line 229
    invoke-virtual {p0}, Lci/e0;->p1()V

    .line 230
    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_a
    invoke-virtual {p0, p2}, Lci/e0;->n1(F)V

    .line 234
    .line 235
    .line 236
    :goto_4
    iget-boolean p1, p0, Lci/e0;->w:Z

    .line 237
    .line 238
    if-eqz p1, :cond_b

    .line 239
    .line 240
    shr-long v3, v1, v0

    .line 241
    .line 242
    long-to-int p1, v3

    .line 243
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    and-long/2addr v1, v6

    .line 248
    long-to-int p3, v1

    .line 249
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 250
    .line 251
    .line 252
    move-result p3

    .line 253
    add-float/2addr p3, p2

    .line 254
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    int-to-long p1, p1

    .line 259
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 260
    .line 261
    .line 262
    move-result p3

    .line 263
    int-to-long v1, p3

    .line 264
    shl-long/2addr p1, v0

    .line 265
    and-long v0, v1, v6

    .line 266
    .line 267
    or-long/2addr p1, v0

    .line 268
    return-wide p1

    .line 269
    :cond_b
    shr-long v3, v1, v0

    .line 270
    .line 271
    long-to-int p1, v3

    .line 272
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    add-float/2addr p1, p2

    .line 277
    and-long p2, v1, v6

    .line 278
    .line 279
    long-to-int p2, p2

    .line 280
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 281
    .line 282
    .line 283
    move-result p2

    .line 284
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    int-to-long v1, p1

    .line 289
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    int-to-long p1, p1

    .line 294
    shl-long v0, v1, v0

    .line 295
    .line 296
    and-long/2addr p1, v6

    .line 297
    or-long/2addr p1, v0

    .line 298
    return-wide p1

    .line 299
    :cond_c
    :goto_5
    return-wide v1

    .line 300
    :cond_d
    invoke-virtual {v0, p1, p2, p3}, Lr1/d;->d(IJ)J

    .line 301
    .line 302
    .line 303
    move-result-wide p1

    .line 304
    return-wide p1

    .line 305
    :cond_e
    invoke-static {}, Lah/a;->d()V

    .line 306
    .line 307
    .line 308
    const-wide/16 p1, 0x0

    .line 309
    .line 310
    return-wide p1
.end method

.method public final j(Lv1/p0;Lv1/m0;J)Lv1/o0;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lci/e0;->s1()V

    .line 5
    .line 6
    .line 7
    invoke-interface {p2, p3, p4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget p3, p2, Lv1/b1;->g:I

    .line 12
    .line 13
    iget p4, p2, Lv1/b1;->h:I

    .line 14
    .line 15
    new-instance v0, Lc9/i;

    .line 16
    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    invoke-direct {v0, p2, v1, p0}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object p2, Ltf/u;->g:Ltf/u;

    .line 23
    .line 24
    invoke-interface {p1, p3, p4, p2, v0}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public final m0(JJLyf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p5, Lci/c0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lci/c0;

    .line 7
    .line 8
    iget v1, v0, Lci/c0;->j:I

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
    iput v1, v0, Lci/c0;->j:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lci/c0;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Lci/c0;-><init>(Lci/e0;Lyf/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v6, Lci/c0;->h:Ljava/lang/Object;

    .line 28
    .line 29
    iget v0, v6, Lci/c0;->j:I

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    if-eq v0, v2, :cond_2

    .line 36
    .line 37
    if-ne v0, v1, :cond_1

    .line 38
    .line 39
    iget-wide p3, v6, Lci/c0;->g:J

    .line 40
    .line 41
    invoke-static {p5}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    return-object p1

    .line 52
    :cond_2
    invoke-static {p5}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object p5

    .line 56
    :cond_3
    invoke-static {p5}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-boolean p5, p0, Ly0/n;->t:Z

    .line 60
    .line 61
    const-wide/16 v3, 0x0

    .line 62
    .line 63
    if-nez p5, :cond_4

    .line 64
    .line 65
    new-instance p1, Lu2/q;

    .line 66
    .line 67
    invoke-direct {p1, v3, v4}, Lu2/q;-><init>(J)V

    .line 68
    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_4
    iget p5, p0, Lci/e0;->C:F

    .line 72
    .line 73
    invoke-static {p5}, Ljava/lang/Math;->abs(F)F

    .line 74
    .line 75
    .line 76
    move-result p5

    .line 77
    iget v0, p0, Lci/e0;->B:F

    .line 78
    .line 79
    cmpl-float p5, p5, v0

    .line 80
    .line 81
    if-lez p5, :cond_5

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    const/4 v2, 0x0

    .line 85
    :goto_2
    invoke-virtual {p0}, Lci/e0;->o1()Lci/z;

    .line 86
    .line 87
    .line 88
    move-result-object p5

    .line 89
    invoke-virtual {p5}, Lci/z;->a()Z

    .line 90
    .line 91
    .line 92
    move-result p5

    .line 93
    if-eq p5, v2, :cond_6

    .line 94
    .line 95
    invoke-virtual {p0}, Lci/e0;->o1()Lci/z;

    .line 96
    .line 97
    .line 98
    move-result-object p5

    .line 99
    invoke-virtual {p5, v2}, Lci/z;->b(Z)V

    .line 100
    .line 101
    .line 102
    :cond_6
    sget-object p5, Lsh/h0;->a:Li0/u;

    .line 103
    .line 104
    invoke-static {p0, p5}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p5

    .line 108
    if-nez p5, :cond_c

    .line 109
    .line 110
    iget-object p5, p0, Lci/e0;->A:Lqg/e1;

    .line 111
    .line 112
    if-eqz p5, :cond_7

    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    invoke-virtual {p5, v0}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 116
    .line 117
    .line 118
    :cond_7
    iget-boolean p5, p0, Lci/e0;->x:Z

    .line 119
    .line 120
    if-eqz p5, :cond_9

    .line 121
    .line 122
    iput-wide p3, v6, Lci/c0;->g:J

    .line 123
    .line 124
    iput v1, v6, Lci/c0;->j:I

    .line 125
    .line 126
    iget-object v1, p0, Lci/e0;->y:Lr1/d;

    .line 127
    .line 128
    move-wide v2, p1

    .line 129
    move-wide v4, p3

    .line 130
    invoke-virtual/range {v1 .. v6}, Lr1/d;->a(JJLyf/c;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p5

    .line 134
    move-wide p1, v4

    .line 135
    sget-object p3, Lxf/a;->g:Lxf/a;

    .line 136
    .line 137
    if-ne p5, p3, :cond_8

    .line 138
    .line 139
    return-object p3

    .line 140
    :cond_8
    move-wide p3, p1

    .line 141
    :goto_3
    check-cast p5, Lu2/q;

    .line 142
    .line 143
    iget-wide v3, p5, Lu2/q;->a:J

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_9
    move-wide p1, p3

    .line 147
    :goto_4
    invoke-static {p3, p4, v3, v4}, Lu2/q;->d(JJ)J

    .line 148
    .line 149
    .line 150
    move-result-wide p1

    .line 151
    iget-boolean p3, p0, Lci/e0;->w:Z

    .line 152
    .line 153
    if-eqz p3, :cond_a

    .line 154
    .line 155
    invoke-static {p1, p2}, Lu2/q;->c(J)F

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    goto :goto_5

    .line 160
    :cond_a
    invoke-static {p1, p2}, Lu2/q;->b(J)F

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    :goto_5
    const p2, 0x3fc44428

    .line 165
    .line 166
    .line 167
    div-float/2addr p1, p2

    .line 168
    invoke-virtual {p0, p1}, Lci/e0;->r1(F)V

    .line 169
    .line 170
    .line 171
    iget-boolean p2, p0, Lci/e0;->w:Z

    .line 172
    .line 173
    const/4 p3, 0x0

    .line 174
    if-eqz p2, :cond_b

    .line 175
    .line 176
    invoke-static {p3, p1}, La/a;->d(FF)J

    .line 177
    .line 178
    .line 179
    move-result-wide p1

    .line 180
    goto :goto_6

    .line 181
    :cond_b
    invoke-static {p1, p3}, La/a;->d(FF)J

    .line 182
    .line 183
    .line 184
    move-result-wide p1

    .line 185
    :goto_6
    invoke-static {v3, v4, p1, p2}, Lu2/q;->e(JJ)J

    .line 186
    .line 187
    .line 188
    move-result-wide p1

    .line 189
    new-instance p3, Lu2/q;

    .line 190
    .line 191
    invoke-direct {p3, p1, p2}, Lu2/q;-><init>(J)V

    .line 192
    .line 193
    .line 194
    return-object p3

    .line 195
    :cond_c
    invoke-static {}, Lah/a;->d()V

    .line 196
    .line 197
    .line 198
    const/4 p1, 0x0

    .line 199
    return-object p1
.end method

.method public final n1(F)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget v1, p0, Lci/e0;->D:F

    .line 8
    .line 9
    add-float/2addr v1, p1

    .line 10
    iput v1, p0, Lci/e0;->D:F

    .line 11
    .line 12
    iget p1, p0, Lci/e0;->E:F

    .line 13
    .line 14
    neg-float v2, p1

    .line 15
    invoke-static {v1, v2, p1}, Lr9/e0;->q(FFF)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Lci/e0;->D:F

    .line 20
    .line 21
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget v1, p0, Lci/e0;->E:F

    .line 26
    .line 27
    div-float/2addr p1, v1

    .line 28
    const/high16 v1, 0x3f800000    # 1.0f

    .line 29
    .line 30
    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget v2, p0, Lci/e0;->E:F

    .line 35
    .line 36
    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    float-to-double v0, p1

    .line 45
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 46
    .line 47
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    sub-double v3, v0, v3

    .line 52
    .line 53
    const-wide/high16 v5, 0x4008000000000000L    # 3.0

    .line 54
    .line 55
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    div-double/2addr v0, v5

    .line 60
    add-double/2addr v0, v3

    .line 61
    float-to-double v2, v2

    .line 62
    mul-double/2addr v0, v2

    .line 63
    double-to-float p1, v0

    .line 64
    iget v0, p0, Lci/e0;->D:F

    .line 65
    .line 66
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    mul-float/2addr v0, p1

    .line 71
    invoke-virtual {p0, v0}, Lci/e0;->q1(F)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final o1()Lci/z;
    .locals 1

    .line 1
    sget-object v0, Lci/b0;->a:Li0/u;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lci/z;

    .line 8
    .line 9
    return-object v0
.end method

.method public final p1()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lci/e0;->q1(F)V

    .line 3
    .line 4
    .line 5
    iput v0, p0, Lci/e0;->D:F

    .line 6
    .line 7
    iget-boolean v0, p0, Ly0/n;->t:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lci/e0;->o1()Lci/z;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Lci/z;->b(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final q1(F)V
    .locals 1

    .line 1
    iget v0, p0, Lci/e0;->C:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iput p1, p0, Lci/e0;->C:F

    .line 9
    .line 10
    iget-boolean p1, p0, Ly0/n;->t:Z

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, v0}, Lx1/f0;->U(Z)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
.end method

.method public final r1(F)V
    .locals 4

    .line 1
    iget v0, p0, Lci/e0;->C:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lci/e0;->B:F

    .line 8
    .line 9
    cmpg-float v0, v0, v1

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    cmpg-float v0, p1, v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lci/e0;->p1()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Lci/e0;->A:Lqg/e1;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v2, Lci/o;

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    invoke-direct {v2, p0, p1, v1, v3}, Lci/o;-><init>(Ljava/lang/Object;FLwf/c;I)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x3

    .line 41
    invoke-static {v0, v1, v2, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lci/e0;->A:Lqg/e1;

    .line 46
    .line 47
    return-void
.end method

.method public final s1()V
    .locals 3

    .line 1
    sget-object v0, Ly1/h1;->h:Li0/m2;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lu2/c;

    .line 8
    .line 9
    sget-object v1, Ly1/h1;->u:Li0/m2;

    .line 10
    .line 11
    invoke-static {p0, v1}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ly1/o2;

    .line 16
    .line 17
    iget-object v2, p0, Lci/e0;->F:Lu2/c;

    .line 18
    .line 19
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    iget-object v2, p0, Lci/e0;->G:Ly1/o2;

    .line 26
    .line 27
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iput-object v0, p0, Lci/e0;->F:Lu2/c;

    .line 35
    .line 36
    iput-object v1, p0, Lci/e0;->G:Ly1/o2;

    .line 37
    .line 38
    iget-boolean v2, p0, Lci/e0;->w:Z

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    check-cast v1, Ly1/v1;

    .line 43
    .line 44
    invoke-virtual {v1}, Ly1/v1;->a()J

    .line 45
    .line 46
    .line 47
    move-result-wide v1

    .line 48
    invoke-static {v1, v2}, Lu2/h;->a(J)F

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-interface {v0, v1}, Lu2/c;->x0(F)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    check-cast v1, Ly1/v1;

    .line 58
    .line 59
    invoke-virtual {v1}, Ly1/v1;->a()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    invoke-static {v1, v2}, Lu2/h;->b(J)F

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-interface {v0, v1}, Lu2/c;->x0(F)F

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    :goto_0
    iput v0, p0, Lci/e0;->E:F

    .line 72
    .line 73
    return-void
.end method
