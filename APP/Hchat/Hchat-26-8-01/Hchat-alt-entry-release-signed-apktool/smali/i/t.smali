.class public final Li/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li/g;


# instance fields
.field public final a:Lhb/c;

.field public final b:Li/m1;

.field public final c:Ljava/lang/Object;

.field public final d:Li/q;

.field public final e:Li/q;

.field public final f:Li/q;

.field public final g:Ljava/lang/Object;

.field public final h:J


# direct methods
.method public constructor <init>(Li/u;Li/m1;Ljava/lang/Object;Li/q;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    new-instance v4, Lhb/c;

    .line 10
    .line 11
    move-object/from16 v5, p1

    .line 12
    .line 13
    iget-object v5, v5, Li/u;->a:Landroidx/lifecycle/x;

    .line 14
    .line 15
    invoke-direct {v4, v5}, Lhb/c;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v4, v0, Li/t;->a:Lhb/c;

    .line 22
    .line 23
    iput-object v1, v0, Li/t;->b:Li/m1;

    .line 24
    .line 25
    iput-object v2, v0, Li/t;->c:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v5, v1, Li/m1;->a:Lfg/l;

    .line 28
    .line 29
    invoke-interface {v5, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Li/q;

    .line 34
    .line 35
    iput-object v2, v0, Li/t;->d:Li/q;

    .line 36
    .line 37
    invoke-static {v3}, Li/d;->i(Li/q;)Li/q;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iput-object v5, v0, Li/t;->e:Li/q;

    .line 42
    .line 43
    iget-object v1, v1, Li/m1;->b:Lfg/l;

    .line 44
    .line 45
    iget-object v5, v4, Lhb/c;->j:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v5, Li/q;

    .line 48
    .line 49
    if-nez v5, :cond_0

    .line 50
    .line 51
    invoke-virtual {v2}, Li/q;->c()Li/q;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    iput-object v5, v4, Lhb/c;->j:Ljava/lang/Object;

    .line 56
    .line 57
    :cond_0
    iget-object v5, v4, Lhb/c;->j:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v5, Li/q;

    .line 60
    .line 61
    const-string v7, "targetVector"

    .line 62
    .line 63
    if-eqz v5, :cond_8

    .line 64
    .line 65
    invoke-virtual {v5}, Li/q;->b()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    const/4 v9, 0x0

    .line 70
    :goto_0
    iget-object v10, v4, Lhb/c;->j:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v10, Li/q;

    .line 73
    .line 74
    if-ge v9, v5, :cond_2

    .line 75
    .line 76
    if-eqz v10, :cond_1

    .line 77
    .line 78
    iget-object v13, v4, Lhb/c;->g:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v13, Landroidx/lifecycle/x;

    .line 81
    .line 82
    invoke-virtual {v2, v9}, Li/q;->a(I)F

    .line 83
    .line 84
    .line 85
    move-result v14

    .line 86
    invoke-virtual {v3, v9}, Li/q;->a(I)F

    .line 87
    .line 88
    .line 89
    move-result v15

    .line 90
    iget-object v13, v13, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v13, Lh/v0;

    .line 93
    .line 94
    invoke-virtual {v13, v15}, Lh/v0;->b(F)D

    .line 95
    .line 96
    .line 97
    move-result-wide v16

    .line 98
    const/16 p1, 0x0

    .line 99
    .line 100
    sget v6, Lh/w0;->a:F

    .line 101
    .line 102
    const-wide/high16 p2, 0x3ff0000000000000L    # 1.0

    .line 103
    .line 104
    float-to-double v11, v6

    .line 105
    sub-double v18, v11, p2

    .line 106
    .line 107
    iget v6, v13, Lh/v0;->a:F

    .line 108
    .line 109
    iget v13, v13, Lh/v0;->b:F

    .line 110
    .line 111
    mul-float/2addr v6, v13

    .line 112
    move/from16 v20, v9

    .line 113
    .line 114
    float-to-double v8, v6

    .line 115
    div-double v11, v11, v18

    .line 116
    .line 117
    mul-double v11, v11, v16

    .line 118
    .line 119
    invoke-static {v11, v12}, Ljava/lang/Math;->exp(D)D

    .line 120
    .line 121
    .line 122
    move-result-wide v11

    .line 123
    mul-double/2addr v11, v8

    .line 124
    double-to-float v6, v11

    .line 125
    invoke-static {v15}, Ljava/lang/Math;->signum(F)F

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    mul-float/2addr v8, v6

    .line 130
    add-float/2addr v8, v14

    .line 131
    move/from16 v6, v20

    .line 132
    .line 133
    invoke-virtual {v10, v6, v8}, Li/q;->e(IF)V

    .line 134
    .line 135
    .line 136
    add-int/lit8 v9, v6, 0x1

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_1
    const/16 p1, 0x0

    .line 140
    .line 141
    invoke-static {v7}, Lgg/l;->g(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_2
    const/16 p1, 0x0

    .line 146
    .line 147
    const-wide/high16 p2, 0x3ff0000000000000L    # 1.0

    .line 148
    .line 149
    if-eqz v10, :cond_7

    .line 150
    .line 151
    invoke-interface {v1, v10}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    iput-object v1, v0, Li/t;->g:Ljava/lang/Object;

    .line 156
    .line 157
    iget-object v1, v0, Li/t;->a:Lhb/c;

    .line 158
    .line 159
    iget-object v2, v0, Li/t;->d:Li/q;

    .line 160
    .line 161
    iget-object v4, v1, Lhb/c;->i:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v4, Li/q;

    .line 164
    .line 165
    if-nez v4, :cond_3

    .line 166
    .line 167
    invoke-virtual {v2}, Li/q;->c()Li/q;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    iput-object v4, v1, Lhb/c;->i:Ljava/lang/Object;

    .line 172
    .line 173
    :cond_3
    iget-object v4, v1, Lhb/c;->i:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v4, Li/q;

    .line 176
    .line 177
    if-eqz v4, :cond_6

    .line 178
    .line 179
    invoke-virtual {v4}, Li/q;->b()I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    const-wide/16 v5, 0x0

    .line 184
    .line 185
    const/4 v7, 0x0

    .line 186
    :goto_1
    if-ge v7, v4, :cond_4

    .line 187
    .line 188
    iget-object v8, v1, Lhb/c;->g:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v8, Landroidx/lifecycle/x;

    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v7}, Li/q;->a(I)F

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    iget-object v8, v8, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v8, Lh/v0;

    .line 202
    .line 203
    invoke-virtual {v8, v9}, Lh/v0;->b(F)D

    .line 204
    .line 205
    .line 206
    move-result-wide v8

    .line 207
    sget v10, Lh/w0;->a:F

    .line 208
    .line 209
    float-to-double v10, v10

    .line 210
    sub-double v10, v10, p2

    .line 211
    .line 212
    div-double/2addr v8, v10

    .line 213
    invoke-static {v8, v9}, Ljava/lang/Math;->exp(D)D

    .line 214
    .line 215
    .line 216
    move-result-wide v8

    .line 217
    const-wide v10, 0x408f400000000000L    # 1000.0

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    mul-double/2addr v8, v10

    .line 223
    double-to-long v8, v8

    .line 224
    const-wide/32 v10, 0xf4240

    .line 225
    .line 226
    .line 227
    mul-long/2addr v8, v10

    .line 228
    invoke-static {v5, v6, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 229
    .line 230
    .line 231
    move-result-wide v5

    .line 232
    add-int/lit8 v7, v7, 0x1

    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_4
    iput-wide v5, v0, Li/t;->h:J

    .line 236
    .line 237
    iget-object v1, v0, Li/t;->a:Lhb/c;

    .line 238
    .line 239
    iget-object v2, v0, Li/t;->d:Li/q;

    .line 240
    .line 241
    invoke-virtual {v1, v5, v6, v2, v3}, Lhb/c;->k(JLi/q;Li/q;)Li/q;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-static {v1}, Li/d;->i(Li/q;)Li/q;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    iput-object v1, v0, Li/t;->f:Li/q;

    .line 250
    .line 251
    invoke-virtual {v1}, Li/q;->b()I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    const/4 v8, 0x0

    .line 256
    :goto_2
    if-ge v8, v1, :cond_5

    .line 257
    .line 258
    iget-object v2, v0, Li/t;->f:Li/q;

    .line 259
    .line 260
    invoke-virtual {v2, v8}, Li/q;->a(I)F

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    iget-object v4, v0, Li/t;->a:Lhb/c;

    .line 265
    .line 266
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    iget-object v4, v0, Li/t;->a:Lhb/c;

    .line 270
    .line 271
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    const/4 v4, 0x0

    .line 275
    const/high16 v5, -0x80000000

    .line 276
    .line 277
    invoke-static {v3, v5, v4}, Lr9/e0;->q(FFF)F

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    invoke-virtual {v2, v8, v3}, Li/q;->e(IF)V

    .line 282
    .line 283
    .line 284
    add-int/lit8 v8, v8, 0x1

    .line 285
    .line 286
    goto :goto_2

    .line 287
    :cond_5
    return-void

    .line 288
    :cond_6
    const-string v1, "velocityVector"

    .line 289
    .line 290
    invoke-static {v1}, Lgg/l;->g(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    throw p1

    .line 294
    :cond_7
    invoke-static {v7}, Lgg/l;->g(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw p1

    .line 298
    :cond_8
    const/16 p1, 0x0

    .line 299
    .line 300
    invoke-static {v7}, Lgg/l;->g(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw p1
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Li/t;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c()Li/m1;
    .locals 1

    .line 1
    iget-object v0, p0, Li/t;->b:Li/m1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(J)Li/q;
    .locals 3

    .line 1
    invoke-interface {p0, p1, p2}, Li/g;->e(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Li/t;->d:Li/q;

    .line 8
    .line 9
    iget-object v1, p0, Li/t;->e:Li/q;

    .line 10
    .line 11
    iget-object v2, p0, Li/t;->a:Lhb/c;

    .line 12
    .line 13
    invoke-virtual {v2, p1, p2, v0, v1}, Lhb/c;->k(JLi/q;Li/q;)Li/q;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object p1, p0, Li/t;->f:Li/q;

    .line 19
    .line 20
    return-object p1
.end method

.method public final f(J)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p0 .. p2}, Li/g;->e(J)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_6

    .line 8
    .line 9
    iget-object v1, v0, Li/t;->b:Li/m1;

    .line 10
    .line 11
    iget-object v1, v1, Li/m1;->b:Lfg/l;

    .line 12
    .line 13
    iget-object v2, v0, Li/t;->a:Lhb/c;

    .line 14
    .line 15
    iget-object v3, v2, Lhb/c;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Li/q;

    .line 18
    .line 19
    iget-object v4, v0, Li/t;->d:Li/q;

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v4}, Li/q;->c()Li/q;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iput-object v3, v2, Lhb/c;->h:Ljava/lang/Object;

    .line 28
    .line 29
    :cond_0
    iget-object v3, v2, Lhb/c;->h:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Li/q;

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    const-string v6, "valueVector"

    .line 35
    .line 36
    if-eqz v3, :cond_5

    .line 37
    .line 38
    invoke-virtual {v3}, Li/q;->b()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v7, 0x0

    .line 43
    :goto_0
    iget-object v8, v2, Lhb/c;->h:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v8, Li/q;

    .line 46
    .line 47
    if-ge v7, v3, :cond_3

    .line 48
    .line 49
    if-eqz v8, :cond_2

    .line 50
    .line 51
    iget-object v9, v2, Lhb/c;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v9, Landroidx/lifecycle/x;

    .line 54
    .line 55
    invoke-virtual {v4, v7}, Li/q;->a(I)F

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    iget-object v11, v0, Li/t;->e:Li/q;

    .line 60
    .line 61
    invoke-virtual {v11, v7}, Li/q;->a(I)F

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    const-wide/32 v12, 0xf4240

    .line 66
    .line 67
    .line 68
    div-long v12, p1, v12

    .line 69
    .line 70
    iget-object v9, v9, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v9, Lh/v0;

    .line 73
    .line 74
    invoke-virtual {v9, v11}, Lh/v0;->a(F)Lh/u0;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    iget-wide v14, v9, Lh/u0;->c:J

    .line 79
    .line 80
    const-wide/16 v16, 0x0

    .line 81
    .line 82
    cmp-long v11, v14, v16

    .line 83
    .line 84
    if-lez v11, :cond_1

    .line 85
    .line 86
    long-to-float v11, v12

    .line 87
    long-to-float v12, v14

    .line 88
    div-float/2addr v11, v12

    .line 89
    goto :goto_1

    .line 90
    :cond_1
    const/high16 v11, 0x3f800000    # 1.0f

    .line 91
    .line 92
    :goto_1
    iget v12, v9, Lh/u0;->b:F

    .line 93
    .line 94
    iget v9, v9, Lh/u0;->a:F

    .line 95
    .line 96
    invoke-static {v9}, Ljava/lang/Math;->signum(F)F

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    mul-float/2addr v9, v12

    .line 101
    invoke-static {v11}, Lh/b;->a(F)Lh/a;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    iget v11, v11, Lh/a;->a:F

    .line 106
    .line 107
    mul-float/2addr v9, v11

    .line 108
    add-float/2addr v9, v10

    .line 109
    invoke-virtual {v8, v7, v9}, Li/q;->e(IF)V

    .line 110
    .line 111
    .line 112
    add-int/lit8 v7, v7, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_2
    invoke-static {v6}, Lgg/l;->g(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v5

    .line 119
    :cond_3
    if-eqz v8, :cond_4

    .line 120
    .line 121
    invoke-interface {v1, v8}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    return-object v1

    .line 126
    :cond_4
    invoke-static {v6}, Lgg/l;->g(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v5

    .line 130
    :cond_5
    invoke-static {v6}, Lgg/l;->g(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v5

    .line 134
    :cond_6
    iget-object v1, v0, Li/t;->g:Ljava/lang/Object;

    .line 135
    .line 136
    return-object v1
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Li/t;->g:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
