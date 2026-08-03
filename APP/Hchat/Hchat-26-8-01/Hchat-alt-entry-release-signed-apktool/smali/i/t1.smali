.class public final Li/t1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li/p1;


# instance fields
.field public final g:Lf/v;

.field public final h:Lf/w;

.field public final i:Li/v;

.field public j:[I

.field public k:[F

.field public l:Li/q;

.field public m:Li/q;

.field public n:Li/q;

.field public o:Li/q;

.field public p:[F

.field public q:[F

.field public r:Landroidx/lifecycle/x;


# direct methods
.method public constructor <init>(Lf/v;Lf/w;Li/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li/t1;->g:Lf/v;

    .line 5
    .line 6
    iput-object p2, p0, Li/t1;->h:Lf/w;

    .line 7
    .line 8
    iput-object p3, p0, Li/t1;->i:Li/v;

    .line 9
    .line 10
    sget-object p1, Li/o1;->a:[I

    .line 11
    .line 12
    iput-object p1, p0, Li/t1;->j:[I

    .line 13
    .line 14
    sget-object p1, Li/o1;->b:[F

    .line 15
    .line 16
    iput-object p1, p0, Li/t1;->k:[F

    .line 17
    .line 18
    iput-object p1, p0, Li/t1;->p:[F

    .line 19
    .line 20
    iput-object p1, p0, Li/t1;->q:[F

    .line 21
    .line 22
    sget-object p1, Li/o1;->c:Landroidx/lifecycle/x;

    .line 23
    .line 24
    iput-object p1, p0, Li/t1;->r:Landroidx/lifecycle/x;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final c(I)I
    .locals 5

    .line 1
    iget-object v0, p0, Li/t1;->g:Lf/v;

    .line 2
    .line 3
    iget v1, v0, Lf/v;->b:I

    .line 4
    .line 5
    if-lez v1, :cond_4

    .line 6
    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-gt v2, v1, :cond_1

    .line 11
    .line 12
    add-int v3, v2, v1

    .line 13
    .line 14
    ushr-int/lit8 v3, v3, 0x1

    .line 15
    .line 16
    iget-object v4, v0, Lf/v;->a:[I

    .line 17
    .line 18
    aget v4, v4, v3

    .line 19
    .line 20
    if-ge v4, p1, :cond_0

    .line 21
    .line 22
    add-int/lit8 v2, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-le v4, p1, :cond_2

    .line 26
    .line 27
    add-int/lit8 v1, v3, -0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    neg-int v3, v2

    .line 33
    :cond_2
    const/4 p1, -0x1

    .line 34
    if-ge v3, p1, :cond_3

    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x2

    .line 37
    .line 38
    neg-int p1, v3

    .line 39
    return p1

    .line 40
    :cond_3
    return v3

    .line 41
    :cond_4
    const-string p1, ""

    .line 42
    .line 43
    invoke-static {p1}, Lokio/a;->i(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    return p1
.end method

.method public final d(IIZ)F
    .locals 4

    .line 1
    iget-object v0, p0, Li/t1;->g:Lf/v;

    .line 2
    .line 3
    iget v1, v0, Lf/v;->b:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, -0x1

    .line 6
    .line 7
    const-wide/16 v2, 0x3e8

    .line 8
    .line 9
    if-lt p1, v1, :cond_0

    .line 10
    .line 11
    int-to-float p1, p2

    .line 12
    :goto_0
    long-to-float p2, v2

    .line 13
    div-float/2addr p1, p2

    .line 14
    return p1

    .line 15
    :cond_0
    invoke-virtual {v0, p1}, Lf/v;->c(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lf/v;->c(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-ne p2, v1, :cond_1

    .line 26
    .line 27
    int-to-float p1, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    sub-int/2addr p1, v1

    .line 30
    iget-object v0, p0, Li/t1;->h:Lf/w;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lf/k;->b(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Li/s1;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    iget-object v0, v0, Li/s1;->b:Li/v;

    .line 41
    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    :cond_2
    iget-object v0, p0, Li/t1;->i:Li/v;

    .line 45
    .line 46
    :cond_3
    sub-int/2addr p2, v1

    .line 47
    int-to-float p2, p2

    .line 48
    int-to-float p1, p1

    .line 49
    div-float/2addr p2, p1

    .line 50
    invoke-interface {v0, p2}, Li/v;->b(F)F

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p3, :cond_4

    .line 55
    .line 56
    return p2

    .line 57
    :cond_4
    mul-float/2addr p1, p2

    .line 58
    int-to-float p2, v1

    .line 59
    add-float/2addr p1, p2

    .line 60
    goto :goto_0
.end method

.method public final e(Li/q;Li/q;Li/q;)V
    .locals 10

    .line 1
    iget-object v0, p0, Li/t1;->r:Landroidx/lifecycle/x;

    .line 2
    .line 3
    sget-object v1, Li/o1;->c:Landroidx/lifecycle/x;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v2

    .line 11
    :goto_0
    iget-object v1, p0, Li/t1;->l:Li/q;

    .line 12
    .line 13
    iget-object v3, p0, Li/t1;->h:Lf/w;

    .line 14
    .line 15
    iget-object v4, p0, Li/t1;->g:Lf/v;

    .line 16
    .line 17
    if-nez v1, :cond_3

    .line 18
    .line 19
    invoke-virtual {p1}, Li/q;->c()Li/q;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, Li/t1;->l:Li/q;

    .line 24
    .line 25
    invoke-virtual {p3}, Li/q;->c()Li/q;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    iput-object p3, p0, Li/t1;->m:Li/q;

    .line 30
    .line 31
    iget p3, v4, Lf/v;->b:I

    .line 32
    .line 33
    new-array v1, p3, [F

    .line 34
    .line 35
    move v5, v2

    .line 36
    :goto_1
    if-ge v5, p3, :cond_1

    .line 37
    .line 38
    invoke-virtual {v4, v5}, Lf/v;->c(I)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    int-to-float v6, v6

    .line 43
    const-wide/16 v7, 0x3e8

    .line 44
    .line 45
    long-to-float v7, v7

    .line 46
    div-float/2addr v6, v7

    .line 47
    aput v6, v1, v5

    .line 48
    .line 49
    add-int/lit8 v5, v5, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    iput-object v1, p0, Li/t1;->k:[F

    .line 53
    .line 54
    iget p3, v4, Lf/v;->b:I

    .line 55
    .line 56
    new-array v1, p3, [I

    .line 57
    .line 58
    move v5, v2

    .line 59
    :goto_2
    if-ge v5, p3, :cond_2

    .line 60
    .line 61
    invoke-virtual {v4, v5}, Lf/v;->c(I)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    invoke-virtual {v3, v6}, Lf/k;->b(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    check-cast v6, Li/s1;

    .line 70
    .line 71
    aput v2, v1, v5

    .line 72
    .line 73
    add-int/lit8 v5, v5, 0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    iput-object v1, p0, Li/t1;->j:[I

    .line 77
    .line 78
    :cond_3
    if-nez v0, :cond_4

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    iget-object p3, p0, Li/t1;->r:Landroidx/lifecycle/x;

    .line 82
    .line 83
    sget-object v0, Li/o1;->c:Landroidx/lifecycle/x;

    .line 84
    .line 85
    if-eq p3, v0, :cond_6

    .line 86
    .line 87
    iget-object p3, p0, Li/t1;->n:Li/q;

    .line 88
    .line 89
    invoke-static {p3, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    if-eqz p3, :cond_6

    .line 94
    .line 95
    iget-object p3, p0, Li/t1;->o:Li/q;

    .line 96
    .line 97
    invoke-static {p3, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    if-nez p3, :cond_5

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_5
    :goto_3
    return-void

    .line 105
    :cond_6
    :goto_4
    iput-object p1, p0, Li/t1;->n:Li/q;

    .line 106
    .line 107
    iput-object p2, p0, Li/t1;->o:Li/q;

    .line 108
    .line 109
    invoke-virtual {p1}, Li/q;->b()I

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    rem-int/lit8 p3, p3, 0x2

    .line 114
    .line 115
    invoke-virtual {p1}, Li/q;->b()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    add-int/2addr v0, p3

    .line 120
    new-array p3, v0, [F

    .line 121
    .line 122
    iput-object p3, p0, Li/t1;->p:[F

    .line 123
    .line 124
    new-array p3, v0, [F

    .line 125
    .line 126
    iput-object p3, p0, Li/t1;->q:[F

    .line 127
    .line 128
    iget p3, v4, Lf/v;->b:I

    .line 129
    .line 130
    new-array v1, p3, [[F

    .line 131
    .line 132
    move v5, v2

    .line 133
    :goto_5
    if-ge v5, p3, :cond_b

    .line 134
    .line 135
    invoke-virtual {v4, v5}, Lf/v;->c(I)I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    invoke-virtual {v3, v6}, Lf/k;->b(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    check-cast v7, Li/s1;

    .line 144
    .line 145
    if-nez v6, :cond_7

    .line 146
    .line 147
    if-nez v7, :cond_7

    .line 148
    .line 149
    new-array v6, v0, [F

    .line 150
    .line 151
    move v7, v2

    .line 152
    :goto_6
    if-ge v7, v0, :cond_a

    .line 153
    .line 154
    invoke-virtual {p1, v7}, Li/q;->a(I)F

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    aput v8, v6, v7

    .line 159
    .line 160
    add-int/lit8 v7, v7, 0x1

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_7
    const/16 v8, 0x12c

    .line 164
    .line 165
    if-ne v6, v8, :cond_8

    .line 166
    .line 167
    if-nez v7, :cond_8

    .line 168
    .line 169
    new-array v6, v0, [F

    .line 170
    .line 171
    move v7, v2

    .line 172
    :goto_7
    if-ge v7, v0, :cond_a

    .line 173
    .line 174
    invoke-virtual {p2, v7}, Li/q;->a(I)F

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    aput v8, v6, v7

    .line 179
    .line 180
    add-int/lit8 v7, v7, 0x1

    .line 181
    .line 182
    goto :goto_7

    .line 183
    :cond_8
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    iget-object v6, v7, Li/s1;->a:Li/q;

    .line 187
    .line 188
    new-array v7, v0, [F

    .line 189
    .line 190
    move v8, v2

    .line 191
    :goto_8
    if-ge v8, v0, :cond_9

    .line 192
    .line 193
    invoke-virtual {v6, v8}, Li/q;->a(I)F

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    aput v9, v7, v8

    .line 198
    .line 199
    add-int/lit8 v8, v8, 0x1

    .line 200
    .line 201
    goto :goto_8

    .line 202
    :cond_9
    move-object v6, v7

    .line 203
    :cond_a
    aput-object v6, v1, v5

    .line 204
    .line 205
    add-int/lit8 v5, v5, 0x1

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_b
    new-instance p1, Landroidx/lifecycle/x;

    .line 209
    .line 210
    iget-object p2, p0, Li/t1;->j:[I

    .line 211
    .line 212
    iget-object p3, p0, Li/t1;->k:[F

    .line 213
    .line 214
    invoke-direct {p1, p2, p3, v1}, Landroidx/lifecycle/x;-><init>([I[F[[F)V

    .line 215
    .line 216
    .line 217
    iput-object p1, p0, Li/t1;->r:Landroidx/lifecycle/x;

    .line 218
    .line 219
    return-void
.end method

.method public final n(JLi/q;Li/q;Li/q;)Li/q;
    .locals 14

    .line 1
    move-object/from16 v5, p5

    .line 2
    .line 3
    const-wide/32 v6, 0xf4240

    .line 4
    .line 5
    .line 6
    div-long v0, p1, v6

    .line 7
    .line 8
    sget-object v2, Li/o1;->a:[I

    .line 9
    .line 10
    const/4 v8, 0x0

    .line 11
    int-to-long v2, v8

    .line 12
    sub-long/2addr v0, v2

    .line 13
    const/16 v2, 0x12c

    .line 14
    .line 15
    int-to-long v2, v2

    .line 16
    const-wide/16 v9, 0x0

    .line 17
    .line 18
    cmp-long v4, v0, v9

    .line 19
    .line 20
    if-gez v4, :cond_0

    .line 21
    .line 22
    move-wide v0, v9

    .line 23
    :cond_0
    cmp-long v4, v0, v2

    .line 24
    .line 25
    if-lez v4, :cond_1

    .line 26
    .line 27
    move-wide v11, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-wide v11, v0

    .line 30
    :goto_0
    cmp-long v0, v11, v9

    .line 31
    .line 32
    if-gez v0, :cond_2

    .line 33
    .line 34
    return-object v5

    .line 35
    :cond_2
    move-object/from16 v3, p3

    .line 36
    .line 37
    move-object/from16 v4, p4

    .line 38
    .line 39
    invoke-virtual {p0, v3, v4, v5}, Li/t1;->e(Li/q;Li/q;Li/q;)V

    .line 40
    .line 41
    .line 42
    iget-object v9, p0, Li/t1;->m:Li/q;

    .line 43
    .line 44
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Li/t1;->r:Landroidx/lifecycle/x;

    .line 48
    .line 49
    sget-object v1, Li/o1;->c:Landroidx/lifecycle/x;

    .line 50
    .line 51
    if-eq v0, v1, :cond_a

    .line 52
    .line 53
    long-to-int v0, v11

    .line 54
    invoke-virtual {p0, v0}, Li/t1;->c(I)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p0, v1, v0, v8}, Li/t1;->d(IIZ)F

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v1, p0, Li/t1;->q:[F

    .line 63
    .line 64
    iget-object v2, p0, Li/t1;->r:Landroidx/lifecycle/x;

    .line 65
    .line 66
    iget-object v2, v2, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, [[Li/r;

    .line 69
    .line 70
    aget-object v3, v2, v8

    .line 71
    .line 72
    aget-object v3, v3, v8

    .line 73
    .line 74
    iget v3, v3, Li/r;->a:F

    .line 75
    .line 76
    array-length v4, v2

    .line 77
    const/4 v5, 0x1

    .line 78
    sub-int/2addr v4, v5

    .line 79
    aget-object v4, v2, v4

    .line 80
    .line 81
    aget-object v4, v4, v8

    .line 82
    .line 83
    iget v4, v4, Li/r;->b:F

    .line 84
    .line 85
    cmpg-float v6, v0, v3

    .line 86
    .line 87
    if-gez v6, :cond_3

    .line 88
    .line 89
    move v0, v3

    .line 90
    :cond_3
    cmpl-float v3, v0, v4

    .line 91
    .line 92
    if-lez v3, :cond_4

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    move v4, v0

    .line 96
    :goto_1
    array-length v0, v1

    .line 97
    array-length v3, v2

    .line 98
    move v6, v8

    .line 99
    move v7, v6

    .line 100
    :goto_2
    if-ge v6, v3, :cond_9

    .line 101
    .line 102
    move v10, v8

    .line 103
    move v11, v10

    .line 104
    :goto_3
    add-int/lit8 v12, v0, -0x1

    .line 105
    .line 106
    if-ge v10, v12, :cond_7

    .line 107
    .line 108
    aget-object v12, v2, v6

    .line 109
    .line 110
    aget-object v12, v12, v11

    .line 111
    .line 112
    iget v13, v12, Li/r;->b:F

    .line 113
    .line 114
    cmpg-float v13, v4, v13

    .line 115
    .line 116
    if-gtz v13, :cond_6

    .line 117
    .line 118
    iget-boolean v7, v12, Li/r;->p:Z

    .line 119
    .line 120
    if-eqz v7, :cond_5

    .line 121
    .line 122
    iget v7, v12, Li/r;->q:F

    .line 123
    .line 124
    aput v7, v1, v10

    .line 125
    .line 126
    add-int/lit8 v7, v10, 0x1

    .line 127
    .line 128
    iget v12, v12, Li/r;->r:F

    .line 129
    .line 130
    aput v12, v1, v7

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_5
    invoke-virtual {v12, v4}, Li/r;->c(F)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12}, Li/r;->a()F

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    aput v7, v1, v10

    .line 141
    .line 142
    add-int/lit8 v7, v10, 0x1

    .line 143
    .line 144
    invoke-virtual {v12}, Li/r;->b()F

    .line 145
    .line 146
    .line 147
    move-result v12

    .line 148
    aput v12, v1, v7

    .line 149
    .line 150
    :goto_4
    move v7, v5

    .line 151
    :cond_6
    add-int/lit8 v10, v10, 0x2

    .line 152
    .line 153
    add-int/lit8 v11, v11, 0x1

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_7
    if-eqz v7, :cond_8

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_9
    :goto_5
    array-length v0, v1

    .line 163
    :goto_6
    if-ge v8, v0, :cond_b

    .line 164
    .line 165
    aget v2, v1, v8

    .line 166
    .line 167
    invoke-virtual {v9, v8, v2}, Li/q;->e(IF)V

    .line 168
    .line 169
    .line 170
    add-int/lit8 v8, v8, 0x1

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_a
    const-wide/16 v0, 0x1

    .line 174
    .line 175
    sub-long v0, v11, v0

    .line 176
    .line 177
    mul-long v1, v0, v6

    .line 178
    .line 179
    move-object v0, p0

    .line 180
    invoke-virtual/range {v0 .. v5}, Li/t1;->w(JLi/q;Li/q;Li/q;)Li/q;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    mul-long v1, v11, v6

    .line 185
    .line 186
    move-object/from16 v3, p3

    .line 187
    .line 188
    move-object/from16 v4, p4

    .line 189
    .line 190
    move-object/from16 v5, p5

    .line 191
    .line 192
    invoke-virtual/range {v0 .. v5}, Li/t1;->w(JLi/q;Li/q;Li/q;)Li/q;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {v10}, Li/q;->b()I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    :goto_7
    if-ge v8, v0, :cond_b

    .line 201
    .line 202
    invoke-virtual {v10, v8}, Li/q;->a(I)F

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    invoke-virtual {v1, v8}, Li/q;->a(I)F

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    sub-float/2addr v2, v3

    .line 211
    const/high16 v3, 0x447a0000    # 1000.0f

    .line 212
    .line 213
    mul-float/2addr v2, v3

    .line 214
    invoke-virtual {v9, v8, v2}, Li/q;->e(IF)V

    .line 215
    .line 216
    .line 217
    add-int/lit8 v8, v8, 0x1

    .line 218
    .line 219
    goto :goto_7

    .line 220
    :cond_b
    return-object v9
.end method

.method public final s()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final v()I
    .locals 1

    .line 1
    const/16 v0, 0x12c

    .line 2
    .line 3
    return v0
.end method

.method public final w(JLi/q;Li/q;Li/q;)Li/q;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    const-wide/32 v3, 0xf4240

    .line 8
    .line 9
    .line 10
    div-long v3, p1, v3

    .line 11
    .line 12
    sget-object v5, Li/o1;->a:[I

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    int-to-long v6, v5

    .line 16
    sub-long/2addr v3, v6

    .line 17
    const/16 v6, 0x12c

    .line 18
    .line 19
    int-to-long v7, v6

    .line 20
    const-wide/16 v9, 0x0

    .line 21
    .line 22
    cmp-long v11, v3, v9

    .line 23
    .line 24
    if-gez v11, :cond_0

    .line 25
    .line 26
    move-wide v3, v9

    .line 27
    :cond_0
    cmp-long v9, v3, v7

    .line 28
    .line 29
    if-lez v9, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move-wide v7, v3

    .line 33
    :goto_0
    long-to-int v3, v7

    .line 34
    iget-object v4, v0, Li/t1;->h:Lf/w;

    .line 35
    .line 36
    invoke-virtual {v4, v3}, Lf/k;->b(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    check-cast v7, Li/s1;

    .line 41
    .line 42
    if-eqz v7, :cond_2

    .line 43
    .line 44
    iget-object v1, v7, Li/s1;->a:Li/q;

    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_2
    if-lt v3, v6, :cond_3

    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_3
    if-gtz v3, :cond_4

    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_4
    move-object/from16 v6, p5

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2, v6}, Li/t1;->e(Li/q;Li/q;Li/q;)V

    .line 56
    .line 57
    .line 58
    iget-object v6, v0, Li/t1;->l:Li/q;

    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v7, v0, Li/t1;->r:Landroidx/lifecycle/x;

    .line 64
    .line 65
    sget-object v8, Li/o1;->c:Landroidx/lifecycle/x;

    .line 66
    .line 67
    const/4 v9, 0x1

    .line 68
    if-eq v7, v8, :cond_e

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Li/t1;->c(I)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-virtual {v0, v1, v3, v5}, Li/t1;->d(IIZ)F

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iget-object v2, v0, Li/t1;->p:[F

    .line 79
    .line 80
    iget-object v3, v0, Li/t1;->r:Landroidx/lifecycle/x;

    .line 81
    .line 82
    iget-object v3, v3, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v3, [[Li/r;

    .line 85
    .line 86
    array-length v4, v3

    .line 87
    sub-int/2addr v4, v9

    .line 88
    aget-object v7, v3, v5

    .line 89
    .line 90
    aget-object v7, v7, v5

    .line 91
    .line 92
    iget v7, v7, Li/r;->a:F

    .line 93
    .line 94
    aget-object v8, v3, v4

    .line 95
    .line 96
    aget-object v8, v8, v5

    .line 97
    .line 98
    iget v8, v8, Li/r;->b:F

    .line 99
    .line 100
    array-length v10, v2

    .line 101
    cmpg-float v11, v1, v7

    .line 102
    .line 103
    if-ltz v11, :cond_5

    .line 104
    .line 105
    cmpl-float v11, v1, v8

    .line 106
    .line 107
    if-lez v11, :cond_6

    .line 108
    .line 109
    :cond_5
    move/from16 p2, v9

    .line 110
    .line 111
    goto/16 :goto_5

    .line 112
    .line 113
    :cond_6
    array-length v4, v3

    .line 114
    move v7, v5

    .line 115
    move v8, v7

    .line 116
    :goto_1
    if-ge v7, v4, :cond_d

    .line 117
    .line 118
    move v11, v5

    .line 119
    move v12, v11

    .line 120
    :goto_2
    add-int/lit8 v13, v10, -0x1

    .line 121
    .line 122
    if-ge v11, v13, :cond_9

    .line 123
    .line 124
    aget-object v13, v3, v7

    .line 125
    .line 126
    aget-object v13, v13, v12

    .line 127
    .line 128
    iget v14, v13, Li/r;->b:F

    .line 129
    .line 130
    cmpg-float v14, v1, v14

    .line 131
    .line 132
    if-gtz v14, :cond_8

    .line 133
    .line 134
    iget-boolean v8, v13, Li/r;->p:Z

    .line 135
    .line 136
    if-eqz v8, :cond_7

    .line 137
    .line 138
    iget v8, v13, Li/r;->a:F

    .line 139
    .line 140
    sub-float v14, v1, v8

    .line 141
    .line 142
    iget v15, v13, Li/r;->k:F

    .line 143
    .line 144
    mul-float/2addr v14, v15

    .line 145
    iget v5, v13, Li/r;->c:F

    .line 146
    .line 147
    move/from16 p2, v9

    .line 148
    .line 149
    iget v9, v13, Li/r;->e:F

    .line 150
    .line 151
    sub-float/2addr v9, v5

    .line 152
    mul-float/2addr v9, v14

    .line 153
    add-float/2addr v9, v5

    .line 154
    aput v9, v2, v11

    .line 155
    .line 156
    add-int/lit8 v5, v11, 0x1

    .line 157
    .line 158
    sub-float v8, v1, v8

    .line 159
    .line 160
    mul-float/2addr v8, v15

    .line 161
    iget v9, v13, Li/r;->d:F

    .line 162
    .line 163
    iget v13, v13, Li/r;->f:F

    .line 164
    .line 165
    sub-float/2addr v13, v9

    .line 166
    mul-float/2addr v13, v8

    .line 167
    add-float/2addr v13, v9

    .line 168
    aput v13, v2, v5

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_7
    move/from16 p2, v9

    .line 172
    .line 173
    invoke-virtual {v13, v1}, Li/r;->c(F)V

    .line 174
    .line 175
    .line 176
    iget v5, v13, Li/r;->q:F

    .line 177
    .line 178
    iget v8, v13, Li/r;->n:F

    .line 179
    .line 180
    iget v9, v13, Li/r;->h:F

    .line 181
    .line 182
    mul-float/2addr v8, v9

    .line 183
    add-float/2addr v8, v5

    .line 184
    aput v8, v2, v11

    .line 185
    .line 186
    add-int/lit8 v5, v11, 0x1

    .line 187
    .line 188
    iget v8, v13, Li/r;->r:F

    .line 189
    .line 190
    iget v9, v13, Li/r;->o:F

    .line 191
    .line 192
    iget v13, v13, Li/r;->i:F

    .line 193
    .line 194
    mul-float/2addr v9, v13

    .line 195
    add-float/2addr v9, v8

    .line 196
    aput v9, v2, v5

    .line 197
    .line 198
    :goto_3
    move/from16 v8, p2

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_8
    move/from16 p2, v9

    .line 202
    .line 203
    :goto_4
    add-int/lit8 v11, v11, 0x2

    .line 204
    .line 205
    add-int/lit8 v12, v12, 0x1

    .line 206
    .line 207
    move/from16 v9, p2

    .line 208
    .line 209
    const/4 v5, 0x0

    .line 210
    goto :goto_2

    .line 211
    :cond_9
    move/from16 p2, v9

    .line 212
    .line 213
    if-eqz v8, :cond_a

    .line 214
    .line 215
    goto/16 :goto_9

    .line 216
    .line 217
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 218
    .line 219
    move/from16 v9, p2

    .line 220
    .line 221
    const/4 v5, 0x0

    .line 222
    goto :goto_1

    .line 223
    :goto_5
    cmpl-float v5, v1, v8

    .line 224
    .line 225
    if-lez v5, :cond_b

    .line 226
    .line 227
    move v7, v8

    .line 228
    goto :goto_6

    .line 229
    :cond_b
    const/4 v4, 0x0

    .line 230
    :goto_6
    sub-float/2addr v1, v7

    .line 231
    const/4 v5, 0x0

    .line 232
    const/4 v8, 0x0

    .line 233
    :goto_7
    add-int/lit8 v9, v10, -0x1

    .line 234
    .line 235
    if-ge v5, v9, :cond_d

    .line 236
    .line 237
    aget-object v9, v3, v4

    .line 238
    .line 239
    aget-object v9, v9, v8

    .line 240
    .line 241
    iget-boolean v11, v9, Li/r;->p:Z

    .line 242
    .line 243
    iget v12, v9, Li/r;->r:F

    .line 244
    .line 245
    iget v13, v9, Li/r;->q:F

    .line 246
    .line 247
    if-eqz v11, :cond_c

    .line 248
    .line 249
    iget v11, v9, Li/r;->a:F

    .line 250
    .line 251
    sub-float v14, v7, v11

    .line 252
    .line 253
    iget v15, v9, Li/r;->k:F

    .line 254
    .line 255
    mul-float/2addr v14, v15

    .line 256
    move/from16 p3, v1

    .line 257
    .line 258
    iget v1, v9, Li/r;->c:F

    .line 259
    .line 260
    move/from16 p4, v1

    .line 261
    .line 262
    iget v1, v9, Li/r;->e:F

    .line 263
    .line 264
    sub-float v1, v1, p4

    .line 265
    .line 266
    mul-float/2addr v1, v14

    .line 267
    add-float v1, v1, p4

    .line 268
    .line 269
    mul-float v13, v13, p3

    .line 270
    .line 271
    add-float/2addr v13, v1

    .line 272
    aput v13, v2, v5

    .line 273
    .line 274
    add-int/lit8 v1, v5, 0x1

    .line 275
    .line 276
    sub-float v11, v7, v11

    .line 277
    .line 278
    mul-float/2addr v11, v15

    .line 279
    iget v13, v9, Li/r;->d:F

    .line 280
    .line 281
    iget v9, v9, Li/r;->f:F

    .line 282
    .line 283
    sub-float/2addr v9, v13

    .line 284
    mul-float/2addr v9, v11

    .line 285
    add-float/2addr v9, v13

    .line 286
    mul-float v11, p3, v12

    .line 287
    .line 288
    add-float/2addr v11, v9

    .line 289
    aput v11, v2, v1

    .line 290
    .line 291
    goto :goto_8

    .line 292
    :cond_c
    move/from16 p3, v1

    .line 293
    .line 294
    invoke-virtual {v9, v7}, Li/r;->c(F)V

    .line 295
    .line 296
    .line 297
    iget v1, v9, Li/r;->n:F

    .line 298
    .line 299
    iget v11, v9, Li/r;->h:F

    .line 300
    .line 301
    mul-float/2addr v1, v11

    .line 302
    add-float/2addr v1, v13

    .line 303
    invoke-virtual {v9}, Li/r;->a()F

    .line 304
    .line 305
    .line 306
    move-result v11

    .line 307
    mul-float v11, v11, p3

    .line 308
    .line 309
    add-float/2addr v11, v1

    .line 310
    aput v11, v2, v5

    .line 311
    .line 312
    add-int/lit8 v1, v5, 0x1

    .line 313
    .line 314
    iget v11, v9, Li/r;->o:F

    .line 315
    .line 316
    iget v13, v9, Li/r;->i:F

    .line 317
    .line 318
    mul-float/2addr v11, v13

    .line 319
    add-float/2addr v11, v12

    .line 320
    invoke-virtual {v9}, Li/r;->b()F

    .line 321
    .line 322
    .line 323
    move-result v9

    .line 324
    mul-float v9, v9, p3

    .line 325
    .line 326
    add-float/2addr v9, v11

    .line 327
    aput v9, v2, v1

    .line 328
    .line 329
    :goto_8
    add-int/lit8 v5, v5, 0x2

    .line 330
    .line 331
    add-int/lit8 v8, v8, 0x1

    .line 332
    .line 333
    move/from16 v1, p3

    .line 334
    .line 335
    goto :goto_7

    .line 336
    :cond_d
    :goto_9
    array-length v1, v2

    .line 337
    const/4 v5, 0x0

    .line 338
    :goto_a
    if-ge v5, v1, :cond_13

    .line 339
    .line 340
    aget v3, v2, v5

    .line 341
    .line 342
    invoke-virtual {v6, v5, v3}, Li/q;->e(IF)V

    .line 343
    .line 344
    .line 345
    add-int/lit8 v5, v5, 0x1

    .line 346
    .line 347
    goto :goto_a

    .line 348
    :cond_e
    move/from16 p2, v9

    .line 349
    .line 350
    invoke-virtual {v0, v3}, Li/t1;->c(I)I

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    move/from16 v7, p2

    .line 355
    .line 356
    invoke-virtual {v0, v5, v3, v7}, Li/t1;->d(IIZ)F

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    iget-object v7, v0, Li/t1;->g:Lf/v;

    .line 361
    .line 362
    invoke-virtual {v7, v5}, Lf/v;->c(I)I

    .line 363
    .line 364
    .line 365
    move-result v8

    .line 366
    invoke-virtual {v4, v8}, Lf/k;->b(I)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v8

    .line 370
    check-cast v8, Li/s1;

    .line 371
    .line 372
    if-eqz v8, :cond_10

    .line 373
    .line 374
    iget-object v8, v8, Li/s1;->a:Li/q;

    .line 375
    .line 376
    if-nez v8, :cond_f

    .line 377
    .line 378
    goto :goto_b

    .line 379
    :cond_f
    move-object v1, v8

    .line 380
    :cond_10
    :goto_b
    const/4 v8, 0x1

    .line 381
    add-int/2addr v5, v8

    .line 382
    invoke-virtual {v7, v5}, Lf/v;->c(I)I

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    invoke-virtual {v4, v5}, Lf/k;->b(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    check-cast v4, Li/s1;

    .line 391
    .line 392
    if-eqz v4, :cond_12

    .line 393
    .line 394
    iget-object v4, v4, Li/s1;->a:Li/q;

    .line 395
    .line 396
    if-nez v4, :cond_11

    .line 397
    .line 398
    goto :goto_c

    .line 399
    :cond_11
    move-object v2, v4

    .line 400
    :cond_12
    :goto_c
    invoke-virtual {v6}, Li/q;->b()I

    .line 401
    .line 402
    .line 403
    move-result v4

    .line 404
    const/4 v5, 0x0

    .line 405
    :goto_d
    if-ge v5, v4, :cond_13

    .line 406
    .line 407
    invoke-virtual {v1, v5}, Li/q;->a(I)F

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    invoke-virtual {v2, v5}, Li/q;->a(I)F

    .line 412
    .line 413
    .line 414
    move-result v8

    .line 415
    const/4 v9, 0x1

    .line 416
    int-to-float v10, v9

    .line 417
    sub-float/2addr v10, v3

    .line 418
    mul-float/2addr v10, v7

    .line 419
    mul-float/2addr v8, v3

    .line 420
    add-float/2addr v8, v10

    .line 421
    invoke-virtual {v6, v5, v8}, Li/q;->e(IF)V

    .line 422
    .line 423
    .line 424
    add-int/lit8 v5, v5, 0x1

    .line 425
    .line 426
    goto :goto_d

    .line 427
    :cond_13
    return-object v6
.end method
