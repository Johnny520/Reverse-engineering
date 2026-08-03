.class public final Lth/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lth/a;


# instance fields
.field public final a:Li1/b;

.field public final b:Lb0/l;

.field public final c:Li0/j1;

.field public d:F

.field public e:F

.field public f:Lvh/c;


# direct methods
.method public constructor <init>(Li1/b;Lb0/l;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lth/j;->a:Li1/b;

    .line 8
    .line 9
    iput-object p2, p0, Lth/j;->b:Lb0/l;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lth/j;->c:Li0/j1;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Lh1/d;Lu2/c;Lv1/t;Lfg/l;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v4, p2

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    move/from16 v8, p5

    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v2, v1, Lth/j;->c:Li0/j1;

    .line 19
    .line 20
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lv1/t;

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    :goto_0
    return-void

    .line 29
    :cond_1
    const-wide/16 v9, 0x0

    .line 30
    .line 31
    :try_start_0
    invoke-interface {v2, v0, v9, v10}, Lv1/t;->W(Lv1/t;J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    :goto_1
    move-wide v11, v2

    .line 36
    goto :goto_2

    .line 37
    :catch_0
    invoke-interface {v0, v9, v10}, Lv1/t;->m(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide v5

    .line 41
    invoke-interface {v2, v9, v10}, Lv1/t;->m(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    invoke-static {v5, v6, v2, v3}, Le1/b;->d(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    goto :goto_1

    .line 50
    :goto_2
    instance-of v0, v4, Lth/g;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    move-object v0, v4

    .line 55
    check-cast v0, Lth/g;

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_2
    const/4 v0, 0x0

    .line 59
    :goto_3
    if-eqz v0, :cond_3

    .line 60
    .line 61
    iget-wide v2, v0, Lth/g;->i:J

    .line 62
    .line 63
    :goto_4
    move-wide v5, v2

    .line 64
    goto :goto_5

    .line 65
    :cond_3
    invoke-interface/range {p1 .. p1}, Lh1/d;->a()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    goto :goto_4

    .line 70
    :goto_5
    invoke-interface/range {p1 .. p1}, Lh1/d;->z0()Lb5/c;

    .line 71
    .line 72
    .line 73
    move-result-object v13

    .line 74
    invoke-virtual {v13}, Lb5/c;->v()J

    .line 75
    .line 76
    .line 77
    move-result-wide v14

    .line 78
    invoke-virtual {v13}, Lb5/c;->p()Lf1/u;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-interface {v0}, Lf1/u;->e()V

    .line 83
    .line 84
    .line 85
    :try_start_1
    iget-object v0, v13, Lb5/c;->a:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v3, v0

    .line 88
    check-cast v3, Landroidx/lifecycle/x;

    .line 89
    .line 90
    if-eqz p4, :cond_4

    .line 91
    .line 92
    invoke-virtual {v1}, Lth/j;->e()Lvh/c;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    move-object/from16 v7, p4

    .line 97
    .line 98
    invoke-virtual/range {v2 .. v7}, Lvh/c;->e(Landroidx/lifecycle/x;Lu2/c;JLfg/l;)V

    .line 99
    .line 100
    .line 101
    goto :goto_6

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    goto :goto_8

    .line 104
    :cond_4
    :goto_6
    const/4 v0, 0x1

    .line 105
    const-wide v4, 0xffffffffL

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    const/16 v2, 0x20

    .line 111
    .line 112
    if-le v8, v0, :cond_5

    .line 113
    .line 114
    int-to-float v0, v8

    .line 115
    const/high16 v6, 0x3f800000    # 1.0f

    .line 116
    .line 117
    div-float/2addr v6, v0

    .line 118
    shr-long v7, v11, v2

    .line 119
    .line 120
    long-to-int v2, v7

    .line 121
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    mul-float/2addr v2, v6

    .line 126
    and-long/2addr v4, v11

    .line 127
    long-to-int v4, v4

    .line 128
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    mul-float/2addr v4, v6

    .line 133
    const/high16 v5, 0x3f000000    # 0.5f

    .line 134
    .line 135
    mul-float v7, v2, v5

    .line 136
    .line 137
    float-to-double v7, v7

    .line 138
    invoke-static {v7, v8}, Ljava/lang/Math;->rint(D)D

    .line 139
    .line 140
    .line 141
    move-result-wide v7

    .line 142
    double-to-float v7, v7

    .line 143
    float-to-int v7, v7

    .line 144
    int-to-float v7, v7

    .line 145
    const/high16 v8, 0x40000000    # 2.0f

    .line 146
    .line 147
    mul-float/2addr v7, v8

    .line 148
    mul-float/2addr v5, v4

    .line 149
    float-to-double v11, v5

    .line 150
    invoke-static {v11, v12}, Ljava/lang/Math;->rint(D)D

    .line 151
    .line 152
    .line 153
    move-result-wide v11

    .line 154
    double-to-float v5, v11

    .line 155
    float-to-int v5, v5

    .line 156
    int-to-float v5, v5

    .line 157
    mul-float/2addr v5, v8

    .line 158
    sub-float/2addr v2, v7

    .line 159
    mul-float/2addr v2, v0

    .line 160
    iput v2, v1, Lth/j;->d:F

    .line 161
    .line 162
    sub-float/2addr v4, v5

    .line 163
    mul-float/2addr v4, v0

    .line 164
    iput v4, v1, Lth/j;->e:F

    .line 165
    .line 166
    neg-float v0, v7

    .line 167
    neg-float v2, v5

    .line 168
    invoke-virtual {v3, v0, v2}, Landroidx/lifecycle/x;->c0(FF)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v6, v6, v9, v10}, Landroidx/lifecycle/x;->S(FFJ)V

    .line 172
    .line 173
    .line 174
    goto :goto_7

    .line 175
    :cond_5
    const/4 v0, 0x0

    .line 176
    iput v0, v1, Lth/j;->d:F

    .line 177
    .line 178
    iput v0, v1, Lth/j;->e:F

    .line 179
    .line 180
    shr-long v6, v11, v2

    .line 181
    .line 182
    long-to-int v0, v6

    .line 183
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    neg-float v0, v0

    .line 188
    and-long/2addr v4, v11

    .line 189
    long-to-int v2, v4

    .line 190
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    neg-float v2, v2

    .line 195
    invoke-virtual {v3, v0, v2}, Landroidx/lifecycle/x;->c0(FF)V

    .line 196
    .line 197
    .line 198
    :goto_7
    iget-object v0, v1, Lth/j;->a:Li1/b;

    .line 199
    .line 200
    move-object/from16 v2, p1

    .line 201
    .line 202
    invoke-static {v2, v0}, Loh/h;->u(Lh1/d;Li1/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    .line 204
    .line 205
    invoke-virtual {v13}, Lb5/c;->p()Lf1/u;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-interface {v0}, Lf1/u;->p()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v13, v14, v15}, Lb5/c;->U(J)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :goto_8
    invoke-virtual {v13}, Lb5/c;->p()Lf1/u;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-interface {v2}, Lf1/u;->p()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v13, v14, v15}, Lb5/c;->U(J)V

    .line 224
    .line 225
    .line 226
    throw v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final c()F
    .locals 1

    .line 1
    iget v0, p0, Lth/j;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public final d()F
    .locals 1

    .line 1
    iget v0, p0, Lth/j;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public final e()Lvh/c;
    .locals 4

    .line 1
    iget-object v0, p0, Lth/j;->f:Lvh/c;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput-wide v2, v0, Lvh/c;->g:J

    .line 13
    .line 14
    iput v1, v0, Lvh/c;->h:F

    .line 15
    .line 16
    iput v1, v0, Lvh/c;->i:F

    .line 17
    .line 18
    iput v1, v0, Lvh/c;->j:F

    .line 19
    .line 20
    iput v1, v0, Lvh/c;->k:F

    .line 21
    .line 22
    sget v1, Lf1/e0;->b:I

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    iput v1, v0, Lvh/c;->l:F

    .line 26
    .line 27
    sget-wide v1, Lf1/u0;->b:J

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    new-instance v0, Lvh/c;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-wide v2, v0, Lvh/c;->g:J

    .line 36
    .line 37
    iput v1, v0, Lvh/c;->h:F

    .line 38
    .line 39
    iput v1, v0, Lvh/c;->i:F

    .line 40
    .line 41
    iput v1, v0, Lvh/c;->j:F

    .line 42
    .line 43
    iput v1, v0, Lvh/c;->k:F

    .line 44
    .line 45
    sget v1, Lf1/e0;->b:I

    .line 46
    .line 47
    sget-wide v1, Lf1/u0;->b:J

    .line 48
    .line 49
    iput-object v0, p0, Lth/j;->f:Lvh/c;

    .line 50
    .line 51
    return-object v0
.end method
