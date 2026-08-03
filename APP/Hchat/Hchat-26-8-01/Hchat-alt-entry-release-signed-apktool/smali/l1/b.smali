.class public final Ll1/b;
.super Lk1/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final e:Lf1/r0;

.field public final f:Ll1/d;

.field public final g:Lb/e;

.field public h:F

.field public i:Lf1/n;


# direct methods
.method public constructor <init>(Lf1/r0;Ll1/d;Lb/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk1/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll1/b;->e:Lf1/r0;

    .line 5
    .line 6
    iput-object p2, p0, Ll1/b;->f:Ll1/d;

    .line 7
    .line 8
    iput-object p3, p0, Ll1/b;->g:Lb/e;

    .line 9
    .line 10
    const/high16 p1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iput p1, p0, Ll1/b;->h:F

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 0

    .line 1
    iput p1, p0, Ll1/b;->h:F

    .line 2
    .line 3
    return-void
.end method

.method public final b(Lf1/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll1/b;->i:Lf1/n;

    .line 2
    .line 3
    return-void
.end method

.method public final d()J
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
.end method

.method public final e(Lx1/h0;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    iget-object v2, v1, Ll1/b;->g:Lb/e;

    .line 6
    .line 7
    iget-object v0, v1, Ll1/b;->e:Lf1/r0;

    .line 8
    .line 9
    iget-object v4, v3, Lx1/h0;->g:Lh1/b;

    .line 10
    .line 11
    invoke-interface {v4}, Lh1/d;->a()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    invoke-virtual {v3}, Lx1/h0;->getLayoutDirection()Lu2/m;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    iget-object v7, v1, Ll1/b;->f:Ll1/d;

    .line 20
    .line 21
    monitor-enter v2

    .line 22
    :try_start_0
    iget-object v8, v2, Lb/e;->i:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v8, Ll1/a;

    .line 25
    .line 26
    if-nez v8, :cond_0

    .line 27
    .line 28
    new-instance v9, Ll1/a;

    .line 29
    .line 30
    sget-object v10, Lf1/c0;->b:Lf1/m0;

    .line 31
    .line 32
    sget-object v13, Lu2/m;->g:Lu2/m;

    .line 33
    .line 34
    const/high16 v14, 0x3f800000    # 1.0f

    .line 35
    .line 36
    const/4 v15, 0x0

    .line 37
    const-wide/16 v11, 0x0

    .line 38
    .line 39
    invoke-direct/range {v9 .. v15}, Ll1/a;-><init>(Lf1/r0;JLu2/m;FLl1/d;)V

    .line 40
    .line 41
    .line 42
    iput-object v9, v2, Lb/e;->i:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v8, v9

    .line 45
    :cond_0
    iput-object v0, v8, Ll1/a;->a:Lf1/r0;

    .line 46
    .line 47
    iput-wide v4, v8, Ll1/a;->b:J

    .line 48
    .line 49
    iput-object v6, v8, Ll1/a;->c:Lu2/m;

    .line 50
    .line 51
    iget-object v9, v3, Lx1/h0;->g:Lh1/b;

    .line 52
    .line 53
    invoke-virtual {v9}, Lh1/b;->d()F

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    iput v9, v8, Ll1/a;->d:F

    .line 58
    .line 59
    new-instance v10, Ll1/d;

    .line 60
    .line 61
    iget v11, v7, Ll1/d;->a:F

    .line 62
    .line 63
    iget v12, v7, Ll1/d;->b:F

    .line 64
    .line 65
    iget-wide v13, v7, Ll1/d;->d:J

    .line 66
    .line 67
    iget v15, v7, Ll1/d;->e:F

    .line 68
    .line 69
    iget v9, v7, Ll1/d;->c:I

    .line 70
    .line 71
    move/from16 v16, v9

    .line 72
    .line 73
    invoke-direct/range {v10 .. v16}, Ll1/d;-><init>(FFJFI)V

    .line 74
    .line 75
    .line 76
    iput-object v10, v8, Ll1/a;->e:Ll1/d;

    .line 77
    .line 78
    iget-object v9, v2, Lb/e;->h:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v9, Lf/k0;

    .line 81
    .line 82
    if-nez v9, :cond_1

    .line 83
    .line 84
    new-instance v9, Lf/k0;

    .line 85
    .line 86
    invoke-direct {v9}, Lf/k0;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v9, v2, Lb/e;->h:Ljava/lang/Object;

    .line 90
    .line 91
    :cond_1
    invoke-virtual {v9, v8}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    check-cast v9, Ll1/c;

    .line 96
    .line 97
    if-nez v9, :cond_3

    .line 98
    .line 99
    invoke-interface {v0, v4, v5, v6, v3}, Lf1/r0;->a(JLu2/m;Lu2/c;)Lf1/c0;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v9, Ll1/c;

    .line 104
    .line 105
    invoke-direct {v9, v7, v0}, Ll1/c;-><init>(Ll1/d;Lf1/c0;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, v2, Lb/e;->h:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Lf/k0;

    .line 111
    .line 112
    if-nez v0, :cond_2

    .line 113
    .line 114
    new-instance v0, Lf/k0;

    .line 115
    .line 116
    invoke-direct {v0}, Lf/k0;-><init>()V

    .line 117
    .line 118
    .line 119
    iput-object v0, v2, Lb/e;->h:Ljava/lang/Object;

    .line 120
    .line 121
    :cond_2
    iget-object v11, v8, Ll1/a;->a:Lf1/r0;

    .line 122
    .line 123
    iget-wide v12, v8, Ll1/a;->b:J

    .line 124
    .line 125
    iget-object v14, v8, Ll1/a;->c:Lu2/m;

    .line 126
    .line 127
    iget v15, v8, Ll1/a;->d:F

    .line 128
    .line 129
    iget-object v4, v8, Ll1/a;->e:Ll1/d;

    .line 130
    .line 131
    new-instance v10, Ll1/a;

    .line 132
    .line 133
    move-object/from16 v16, v4

    .line 134
    .line 135
    invoke-direct/range {v10 .. v16}, Ll1/a;-><init>(Lf1/r0;JLu2/m;FLl1/d;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v10, v9}, Lf/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :catchall_0
    move-exception v0

    .line 143
    goto :goto_1

    .line 144
    :cond_3
    :goto_0
    monitor-exit v2

    .line 145
    iget-object v0, v1, Ll1/b;->f:Ll1/d;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    const-wide/16 v4, 0x0

    .line 151
    .line 152
    long-to-int v0, v4

    .line 153
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    invoke-virtual {v3, v0}, Lx1/h0;->x0(F)F

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    iget-object v0, v1, Ll1/b;->f:Ll1/d;

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    long-to-int v0, v4

    .line 167
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    invoke-virtual {v3, v0}, Lx1/h0;->x0(F)F

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    iget-object v0, v3, Lx1/h0;->g:Lh1/b;

    .line 176
    .line 177
    iget-object v0, v0, Lh1/b;->h:Lb5/c;

    .line 178
    .line 179
    iget-object v0, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Landroidx/lifecycle/x;

    .line 182
    .line 183
    invoke-virtual {v0, v11, v12}, Landroidx/lifecycle/x;->c0(FF)V

    .line 184
    .line 185
    .line 186
    :try_start_1
    iget-object v4, v1, Ll1/b;->i:Lf1/n;

    .line 187
    .line 188
    iget-object v0, v3, Lx1/h0;->g:Lh1/b;

    .line 189
    .line 190
    invoke-interface {v0}, Lh1/d;->a()J

    .line 191
    .line 192
    .line 193
    move-result-wide v5

    .line 194
    iget-object v0, v9, Ll1/c;->i:Ll1/d;

    .line 195
    .line 196
    iget-wide v7, v0, Ll1/d;->d:J

    .line 197
    .line 198
    iget v2, v1, Ll1/b;->h:F

    .line 199
    .line 200
    iget v0, v0, Ll1/d;->e:F

    .line 201
    .line 202
    mul-float/2addr v2, v0

    .line 203
    const/4 v0, 0x0

    .line 204
    const/high16 v10, 0x3f800000    # 1.0f

    .line 205
    .line 206
    invoke-static {v2, v0, v10}, Lr9/e0;->q(FFF)F

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    iget-object v2, v9, Ll1/c;->i:Ll1/d;

    .line 211
    .line 212
    iget v10, v2, Ll1/d;->c:I

    .line 213
    .line 214
    move-object v2, v9

    .line 215
    move v9, v0

    .line 216
    invoke-virtual/range {v2 .. v10}, Ll1/c;->a(Lx1/h0;Lf1/n;JJFI)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 217
    .line 218
    .line 219
    iget-object v0, v3, Lx1/h0;->g:Lh1/b;

    .line 220
    .line 221
    iget-object v0, v0, Lh1/b;->h:Lb5/c;

    .line 222
    .line 223
    iget-object v0, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, Landroidx/lifecycle/x;

    .line 226
    .line 227
    neg-float v2, v11

    .line 228
    neg-float v3, v12

    .line 229
    invoke-virtual {v0, v2, v3}, Landroidx/lifecycle/x;->c0(FF)V

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :catchall_1
    move-exception v0

    .line 234
    iget-object v2, v3, Lx1/h0;->g:Lh1/b;

    .line 235
    .line 236
    iget-object v2, v2, Lh1/b;->h:Lb5/c;

    .line 237
    .line 238
    iget-object v2, v2, Lb5/c;->a:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v2, Landroidx/lifecycle/x;

    .line 241
    .line 242
    neg-float v3, v11

    .line 243
    neg-float v4, v12

    .line 244
    invoke-virtual {v2, v3, v4}, Landroidx/lifecycle/x;->c0(FF)V

    .line 245
    .line 246
    .line 247
    throw v0

    .line 248
    :goto_1
    monitor-exit v2

    .line 249
    throw v0
.end method
