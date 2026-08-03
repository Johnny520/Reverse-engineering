.class public final Lci/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk/k1;


# instance fields
.field public a:F

.field public b:F

.field public c:Lci/r;

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public final h:Lci/p0;

.field public final i:Lci/p0;

.field public j:Lqg/r0;

.field public k:Lqg/r0;

.field public l:Lci/q;

.field public m:Lci/r;

.field public n:Lci/r;

.field public final o:Lci/s;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lci/p0;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lci/p;->h:Lci/p0;

    .line 10
    .line 11
    new-instance v0, Lci/p0;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lci/p;->i:Lci/p0;

    .line 17
    .line 18
    new-instance v0, Lci/s;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lci/s;-><init>(Lci/p;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lci/p;->o:Lci/s;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(JLm/n2;Lyf/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p4, Lci/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lci/m;

    .line 7
    .line 8
    iget v1, v0, Lci/m;->j:I

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
    iput v1, v0, Lci/m;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lci/m;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lci/m;-><init>(Lci/p;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lci/m;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lci/m;->j:I

    .line 28
    .line 29
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v3, :cond_1

    .line 35
    .line 36
    iget-wide p1, v0, Lci/m;->g:J

    .line 37
    .line 38
    invoke-static {p4}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_6

    .line 42
    .line 43
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    return-object p1

    .line 50
    :cond_2
    invoke-static {p4}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget p4, p0, Lci/p;->b:F

    .line 54
    .line 55
    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    .line 56
    .line 57
    .line 58
    move-result p4

    .line 59
    const/high16 v1, 0x3f800000    # 1.0f

    .line 60
    .line 61
    cmpl-float p4, p4, v1

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    if-lez p4, :cond_3

    .line 65
    .line 66
    move p4, v3

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    move p4, v4

    .line 69
    :goto_1
    iget v5, p0, Lci/p;->a:F

    .line 70
    .line 71
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    cmpl-float v1, v5, v1

    .line 76
    .line 77
    if-lez v1, :cond_4

    .line 78
    .line 79
    move v4, v3

    .line 80
    :cond_4
    iget-object v1, p0, Lci/p;->m:Lci/r;

    .line 81
    .line 82
    if-eqz v1, :cond_5

    .line 83
    .line 84
    invoke-virtual {v1}, Lci/r;->invoke()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_5
    iget-object v1, p0, Lci/p;->k:Lqg/r0;

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    if-eqz v1, :cond_6

    .line 91
    .line 92
    invoke-interface {v1, v5}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 93
    .line 94
    .line 95
    :cond_6
    iget-object v1, p0, Lci/p;->j:Lqg/r0;

    .line 96
    .line 97
    if-eqz v1, :cond_7

    .line 98
    .line 99
    invoke-interface {v1, v5}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 100
    .line 101
    .line 102
    :cond_7
    const v1, 0x4008887b

    .line 103
    .line 104
    .line 105
    const/4 v5, 0x0

    .line 106
    if-eqz p4, :cond_a

    .line 107
    .line 108
    invoke-static {p1, p2}, Lu2/q;->c(J)F

    .line 109
    .line 110
    .line 111
    move-result p4

    .line 112
    cmpg-float p4, p4, v5

    .line 113
    .line 114
    if-nez p4, :cond_8

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_8
    invoke-static {p1, p2}, Lu2/q;->c(J)F

    .line 118
    .line 119
    .line 120
    move-result p4

    .line 121
    invoke-static {p4}, Ljava/lang/Math;->signum(F)F

    .line 122
    .line 123
    .line 124
    move-result p4

    .line 125
    iget v6, p0, Lci/p;->b:F

    .line 126
    .line 127
    invoke-static {v6}, Ljava/lang/Math;->signum(F)F

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    cmpg-float p4, p4, v6

    .line 132
    .line 133
    if-nez p4, :cond_9

    .line 134
    .line 135
    invoke-static {p1, p2}, Lu2/q;->c(J)F

    .line 136
    .line 137
    .line 138
    move-result p4

    .line 139
    invoke-virtual {p0, p4}, Lci/p;->j(F)V

    .line 140
    .line 141
    .line 142
    invoke-static {p1, p2}, Lu2/q;->b(J)F

    .line 143
    .line 144
    .line 145
    move-result p4

    .line 146
    invoke-static {p4, v5}, La/a;->d(FF)J

    .line 147
    .line 148
    .line 149
    move-result-wide v6

    .line 150
    goto :goto_3

    .line 151
    :cond_9
    invoke-static {p1, p2}, Lu2/q;->c(J)F

    .line 152
    .line 153
    .line 154
    move-result p4

    .line 155
    invoke-virtual {p0, p4}, Lci/p;->j(F)V

    .line 156
    .line 157
    .line 158
    invoke-static {p1, p2}, Lu2/q;->b(J)F

    .line 159
    .line 160
    .line 161
    move-result p4

    .line 162
    invoke-static {p1, p2}, Lu2/q;->c(J)F

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    div-float/2addr v6, v1

    .line 167
    invoke-static {p4, v6}, La/a;->d(FF)J

    .line 168
    .line 169
    .line 170
    move-result-wide v6

    .line 171
    goto :goto_3

    .line 172
    :cond_a
    :goto_2
    move-wide v6, p1

    .line 173
    :goto_3
    if-eqz v4, :cond_d

    .line 174
    .line 175
    invoke-static {p1, p2}, Lu2/q;->b(J)F

    .line 176
    .line 177
    .line 178
    move-result p4

    .line 179
    cmpg-float p4, p4, v5

    .line 180
    .line 181
    if-nez p4, :cond_b

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_b
    invoke-static {p1, p2}, Lu2/q;->b(J)F

    .line 185
    .line 186
    .line 187
    move-result p4

    .line 188
    invoke-static {p4}, Ljava/lang/Math;->signum(F)F

    .line 189
    .line 190
    .line 191
    move-result p4

    .line 192
    iget v4, p0, Lci/p;->a:F

    .line 193
    .line 194
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    cmpg-float p4, p4, v4

    .line 199
    .line 200
    if-nez p4, :cond_c

    .line 201
    .line 202
    invoke-static {p1, p2}, Lu2/q;->b(J)F

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    invoke-virtual {p0, p1}, Lci/p;->i(F)V

    .line 207
    .line 208
    .line 209
    invoke-static {v6, v7}, Lu2/q;->c(J)F

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    invoke-static {v5, p1}, La/a;->d(FF)J

    .line 214
    .line 215
    .line 216
    move-result-wide p1

    .line 217
    goto :goto_5

    .line 218
    :cond_c
    invoke-static {p1, p2}, Lu2/q;->b(J)F

    .line 219
    .line 220
    .line 221
    move-result p4

    .line 222
    invoke-virtual {p0, p4}, Lci/p;->i(F)V

    .line 223
    .line 224
    .line 225
    invoke-static {p1, p2}, Lu2/q;->b(J)F

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    div-float/2addr p1, v1

    .line 230
    invoke-static {v6, v7}, Lu2/q;->c(J)F

    .line 231
    .line 232
    .line 233
    move-result p2

    .line 234
    invoke-static {p1, p2}, La/a;->d(FF)J

    .line 235
    .line 236
    .line 237
    move-result-wide p1

    .line 238
    goto :goto_5

    .line 239
    :cond_d
    :goto_4
    move-wide p1, v6

    .line 240
    :goto_5
    iput-wide p1, v0, Lci/m;->g:J

    .line 241
    .line 242
    iput v3, v0, Lci/m;->j:I

    .line 243
    .line 244
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    new-instance p4, Lm/n2;

    .line 248
    .line 249
    iget-object p3, p3, Lm/n2;->k:Lm/o2;

    .line 250
    .line 251
    invoke-direct {p4, p3, v0}, Lm/n2;-><init>(Lm/o2;Lwf/c;)V

    .line 252
    .line 253
    .line 254
    iput-wide p1, p4, Lm/n2;->j:J

    .line 255
    .line 256
    invoke-virtual {p4, v2}, Lm/n2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p4

    .line 260
    sget-object p3, Lxf/a;->g:Lxf/a;

    .line 261
    .line 262
    if-ne p4, p3, :cond_e

    .line 263
    .line 264
    return-object p3

    .line 265
    :cond_e
    :goto_6
    check-cast p4, Lu2/q;

    .line 266
    .line 267
    iget-wide p3, p4, Lu2/q;->a:J

    .line 268
    .line 269
    invoke-static {p1, p2, p3, p4}, Lu2/q;->d(JJ)J

    .line 270
    .line 271
    .line 272
    move-result-wide p1

    .line 273
    invoke-static {p1, p2}, Lu2/q;->c(J)F

    .line 274
    .line 275
    .line 276
    move-result p3

    .line 277
    const p4, 0x3fc44428

    .line 278
    .line 279
    .line 280
    div-float/2addr p3, p4

    .line 281
    invoke-virtual {p0, p3}, Lci/p;->j(F)V

    .line 282
    .line 283
    .line 284
    invoke-static {p1, p2}, Lu2/q;->b(J)F

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    div-float/2addr p1, p4

    .line 289
    invoke-virtual {p0, p1}, Lci/p;->i(F)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p0}, Lci/p;->k()V

    .line 293
    .line 294
    .line 295
    return-object v2
.end method

.method public final b(JILb0/d0;)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object/from16 v3, p4

    .line 9
    .line 10
    iget-object v3, v3, Lb0/d0;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Lm/o2;

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    move/from16 v5, p3

    .line 16
    .line 17
    if-ne v5, v4, :cond_11

    .line 18
    .line 19
    iget-object v4, v0, Lci/p;->m:Lci/r;

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v4}, Lci/r;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v4, v0, Lci/p;->k:Lqg/r0;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    invoke-interface {v4, v5}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v4, v0, Lci/p;->j:Lqg/r0;

    .line 35
    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    invoke-interface {v4, v5}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    const-wide v4, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long v6, v1, v4

    .line 47
    .line 48
    long-to-int v6, v6

    .line 49
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    iget v8, v0, Lci/p;->b:F

    .line 54
    .line 55
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    const/high16 v9, 0x3f800000    # 1.0f

    .line 60
    .line 61
    cmpl-float v8, v8, v9

    .line 62
    .line 63
    const/4 v10, 0x0

    .line 64
    if-lez v8, :cond_7

    .line 65
    .line 66
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    cmpg-float v8, v8, v10

    .line 71
    .line 72
    if-nez v8, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    invoke-static {v8}, Ljava/lang/Math;->signum(F)F

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    iget v11, v0, Lci/p;->e:F

    .line 84
    .line 85
    invoke-static {v11}, Ljava/lang/Math;->signum(F)F

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    cmpg-float v8, v8, v11

    .line 90
    .line 91
    if-nez v8, :cond_4

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    iget v7, v0, Lci/p;->e:F

    .line 95
    .line 96
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    cmpg-float v7, v7, v8

    .line 109
    .line 110
    if-gtz v7, :cond_5

    .line 111
    .line 112
    iget v7, v0, Lci/p;->e:F

    .line 113
    .line 114
    neg-float v7, v7

    .line 115
    goto :goto_0

    .line 116
    :cond_5
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    :goto_0
    iget v8, v0, Lci/p;->e:F

    .line 121
    .line 122
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    cmpg-float v8, v8, v11

    .line 135
    .line 136
    if-gtz v8, :cond_6

    .line 137
    .line 138
    invoke-virtual {v0, v10}, Lci/p;->h(F)V

    .line 139
    .line 140
    .line 141
    iput v10, v0, Lci/p;->e:F

    .line 142
    .line 143
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    sub-float/2addr v6, v7

    .line 148
    move v15, v7

    .line 149
    move v7, v6

    .line 150
    move v6, v15

    .line 151
    goto :goto_2

    .line 152
    :cond_6
    invoke-virtual {v0, v7}, Lci/p;->f(F)V

    .line 153
    .line 154
    .line 155
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    move v6, v7

    .line 160
    move v7, v10

    .line 161
    goto :goto_2

    .line 162
    :cond_7
    :goto_1
    move v6, v10

    .line 163
    :goto_2
    const/16 v8, 0x20

    .line 164
    .line 165
    shr-long/2addr v1, v8

    .line 166
    long-to-int v1, v1

    .line 167
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    iget v11, v0, Lci/p;->a:F

    .line 172
    .line 173
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 174
    .line 175
    .line 176
    move-result v11

    .line 177
    cmpl-float v9, v11, v9

    .line 178
    .line 179
    if-lez v9, :cond_c

    .line 180
    .line 181
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    cmpg-float v9, v9, v10

    .line 186
    .line 187
    if-nez v9, :cond_8

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_8
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 191
    .line 192
    .line 193
    move-result v9

    .line 194
    invoke-static {v9}, Ljava/lang/Math;->signum(F)F

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    iget v11, v0, Lci/p;->d:F

    .line 199
    .line 200
    invoke-static {v11}, Ljava/lang/Math;->signum(F)F

    .line 201
    .line 202
    .line 203
    move-result v11

    .line 204
    cmpg-float v9, v9, v11

    .line 205
    .line 206
    if-nez v9, :cond_9

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_9
    iget v2, v0, Lci/p;->d:F

    .line 210
    .line 211
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 216
    .line 217
    .line 218
    move-result v9

    .line 219
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    cmpg-float v2, v2, v9

    .line 224
    .line 225
    if-gtz v2, :cond_a

    .line 226
    .line 227
    iget v2, v0, Lci/p;->d:F

    .line 228
    .line 229
    neg-float v2, v2

    .line 230
    goto :goto_3

    .line 231
    :cond_a
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    :goto_3
    iget v9, v0, Lci/p;->d:F

    .line 236
    .line 237
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 242
    .line 243
    .line 244
    move-result v11

    .line 245
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 246
    .line 247
    .line 248
    move-result v11

    .line 249
    cmpg-float v9, v9, v11

    .line 250
    .line 251
    if-gtz v9, :cond_b

    .line 252
    .line 253
    invoke-virtual {v0, v10}, Lci/p;->g(F)V

    .line 254
    .line 255
    .line 256
    iput v10, v0, Lci/p;->d:F

    .line 257
    .line 258
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    sub-float/2addr v1, v2

    .line 263
    move v15, v2

    .line 264
    move v2, v1

    .line 265
    move v1, v15

    .line 266
    goto :goto_5

    .line 267
    :cond_b
    invoke-virtual {v0, v2}, Lci/p;->e(F)V

    .line 268
    .line 269
    .line 270
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    move v1, v2

    .line 275
    move v2, v10

    .line 276
    goto :goto_5

    .line 277
    :cond_c
    :goto_4
    move v1, v10

    .line 278
    :goto_5
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    int-to-long v11, v2

    .line 283
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    int-to-long v13, v2

    .line 288
    shl-long/2addr v11, v8

    .line 289
    and-long/2addr v13, v4

    .line 290
    or-long/2addr v11, v13

    .line 291
    iget-object v2, v3, Lm/o2;->k:Lm/u1;

    .line 292
    .line 293
    iget v7, v3, Lm/o2;->j:I

    .line 294
    .line 295
    invoke-virtual {v3, v2, v11, v12, v7}, Lm/o2;->c(Lm/u1;JI)J

    .line 296
    .line 297
    .line 298
    move-result-wide v2

    .line 299
    new-instance v7, Le1/b;

    .line 300
    .line 301
    invoke-direct {v7, v2, v3}, Le1/b;-><init>(J)V

    .line 302
    .line 303
    .line 304
    iget-wide v2, v7, Le1/b;->a:J

    .line 305
    .line 306
    invoke-static {v11, v12, v2, v3}, Le1/b;->d(JJ)J

    .line 307
    .line 308
    .line 309
    move-result-wide v11

    .line 310
    and-long v13, v11, v4

    .line 311
    .line 312
    long-to-int v7, v13

    .line 313
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    cmpg-float v9, v9, v10

    .line 318
    .line 319
    if-nez v9, :cond_d

    .line 320
    .line 321
    goto :goto_6

    .line 322
    :cond_d
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 323
    .line 324
    .line 325
    move-result v9

    .line 326
    invoke-virtual {v0, v9}, Lci/p;->f(F)V

    .line 327
    .line 328
    .line 329
    :goto_6
    shr-long/2addr v11, v8

    .line 330
    long-to-int v9, v11

    .line 331
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 332
    .line 333
    .line 334
    move-result v11

    .line 335
    cmpg-float v11, v11, v10

    .line 336
    .line 337
    if-nez v11, :cond_e

    .line 338
    .line 339
    goto :goto_7

    .line 340
    :cond_e
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 341
    .line 342
    .line 343
    move-result v11

    .line 344
    invoke-virtual {v0, v11}, Lci/p;->e(F)V

    .line 345
    .line 346
    .line 347
    :goto_7
    invoke-virtual {v0}, Lci/p;->k()V

    .line 348
    .line 349
    .line 350
    shr-long v11, v2, v8

    .line 351
    .line 352
    long-to-int v11, v11

    .line 353
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 354
    .line 355
    .line 356
    move-result v11

    .line 357
    add-float/2addr v11, v1

    .line 358
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    cmpg-float v1, v1, v10

    .line 363
    .line 364
    if-nez v1, :cond_f

    .line 365
    .line 366
    move v1, v10

    .line 367
    goto :goto_8

    .line 368
    :cond_f
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    :goto_8
    add-float/2addr v11, v1

    .line 373
    and-long v1, v2, v4

    .line 374
    .line 375
    long-to-int v1, v1

    .line 376
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    add-float/2addr v1, v6

    .line 381
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    cmpg-float v2, v2, v10

    .line 386
    .line 387
    if-nez v2, :cond_10

    .line 388
    .line 389
    goto :goto_9

    .line 390
    :cond_10
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 391
    .line 392
    .line 393
    move-result v10

    .line 394
    :goto_9
    add-float/2addr v1, v10

    .line 395
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 396
    .line 397
    .line 398
    move-result v2

    .line 399
    int-to-long v2, v2

    .line 400
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    int-to-long v6, v1

    .line 405
    shl-long v1, v2, v8

    .line 406
    .line 407
    and-long v3, v6, v4

    .line 408
    .line 409
    or-long/2addr v1, v3

    .line 410
    return-wide v1

    .line 411
    :cond_11
    iget-object v4, v3, Lm/o2;->k:Lm/u1;

    .line 412
    .line 413
    iget v5, v3, Lm/o2;->j:I

    .line 414
    .line 415
    invoke-virtual {v3, v4, v1, v2, v5}, Lm/o2;->c(Lm/u1;JI)J

    .line 416
    .line 417
    .line 418
    move-result-wide v1

    .line 419
    new-instance v3, Le1/b;

    .line 420
    .line 421
    invoke-direct {v3, v1, v2}, Le1/b;-><init>(J)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0}, Lci/p;->k()V

    .line 425
    .line 426
    .line 427
    iget-wide v1, v3, Le1/b;->a:J

    .line 428
    .line 429
    return-wide v1
.end method

.method public final c()Lx1/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lci/p;->o:Lci/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget v0, p0, Lci/p;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpl-float v0, v0, v1

    .line 10
    .line 11
    if-gtz v0, :cond_1

    .line 12
    .line 13
    iget v0, p0, Lci/p;->b:F

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    cmpl-float v0, v0, v1

    .line 20
    .line 21
    if-lez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0

    .line 26
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 27
    return v0
.end method

.method public final e(F)V
    .locals 8

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
    iget v1, p0, Lci/p;->g:F

    .line 8
    .line 9
    cmpg-float v2, v1, v0

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    iget v2, p0, Lci/p;->d:F

    .line 15
    .line 16
    add-float/2addr v2, p1

    .line 17
    iput v2, p0, Lci/p;->d:F

    .line 18
    .line 19
    neg-float p1, v1

    .line 20
    invoke-static {v2, p1, v1}, Lr9/e0;->q(FFF)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, Lci/p;->d:F

    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iget v1, p0, Lci/p;->g:F

    .line 31
    .line 32
    div-float/2addr p1, v1

    .line 33
    const/high16 v1, 0x3f800000    # 1.0f

    .line 34
    .line 35
    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget v2, p0, Lci/p;->d:F

    .line 40
    .line 41
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    iget v3, p0, Lci/p;->g:F

    .line 46
    .line 47
    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    float-to-double v0, p1

    .line 56
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 57
    .line 58
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    sub-double v4, v0, v4

    .line 63
    .line 64
    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    .line 65
    .line 66
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    div-double/2addr v0, v6

    .line 71
    add-double/2addr v0, v4

    .line 72
    float-to-double v3, v3

    .line 73
    mul-double/2addr v0, v3

    .line 74
    double-to-float p1, v0

    .line 75
    mul-float/2addr v2, p1

    .line 76
    invoke-virtual {p0, v2}, Lci/p;->g(F)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final f(F)V
    .locals 8

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
    iget v1, p0, Lci/p;->f:F

    .line 8
    .line 9
    cmpg-float v2, v1, v0

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    iget v2, p0, Lci/p;->e:F

    .line 15
    .line 16
    add-float/2addr v2, p1

    .line 17
    iput v2, p0, Lci/p;->e:F

    .line 18
    .line 19
    neg-float p1, v1

    .line 20
    invoke-static {v2, p1, v1}, Lr9/e0;->q(FFF)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, Lci/p;->e:F

    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iget v1, p0, Lci/p;->f:F

    .line 31
    .line 32
    div-float/2addr p1, v1

    .line 33
    const/high16 v1, 0x3f800000    # 1.0f

    .line 34
    .line 35
    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget v2, p0, Lci/p;->e:F

    .line 40
    .line 41
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    iget v3, p0, Lci/p;->f:F

    .line 46
    .line 47
    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    float-to-double v0, p1

    .line 56
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 57
    .line 58
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    sub-double v4, v0, v4

    .line 63
    .line 64
    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    .line 65
    .line 66
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    div-double/2addr v0, v6

    .line 71
    add-double/2addr v0, v4

    .line 72
    float-to-double v3, v3

    .line 73
    mul-double/2addr v0, v3

    .line 74
    double-to-float p1, v0

    .line 75
    mul-float/2addr v2, p1

    .line 76
    invoke-virtual {p0, v2}, Lci/p;->h(F)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final g(F)V
    .locals 1

    .line 1
    iget v0, p0, Lci/p;->a:F

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
    iput p1, p0, Lci/p;->a:F

    .line 9
    .line 10
    iget-object p1, p0, Lci/p;->c:Lci/r;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lci/r;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    return-void
.end method

.method public final h(F)V
    .locals 1

    .line 1
    iget v0, p0, Lci/p;->b:F

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
    iput p1, p0, Lci/p;->b:F

    .line 9
    .line 10
    iget-object p1, p0, Lci/p;->c:Lci/r;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lci/r;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    return-void
.end method

.method public final i(F)V
    .locals 4

    .line 1
    iget v0, p0, Lci/p;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

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
    cmpg-float v1, p1, v0

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lci/p;->g(F)V

    .line 19
    .line 20
    .line 21
    iput v0, p0, Lci/p;->d:F

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Lci/p;->j:Lqg/r0;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-interface {v0, v1}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lci/p;->l:Lci/q;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    new-instance v2, Lci/o;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-direct {v2, p0, p1, v1, v3}, Lci/o;-><init>(Ljava/lang/Object;FLwf/c;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Lci/q;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    move-object v1, p1

    .line 47
    check-cast v1, Lqg/r0;

    .line 48
    .line 49
    :cond_2
    iput-object v1, p0, Lci/p;->j:Lqg/r0;

    .line 50
    .line 51
    return-void
.end method

.method public final j(F)V
    .locals 4

    .line 1
    iget v0, p0, Lci/p;->b:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

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
    cmpg-float v1, p1, v0

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lci/p;->h(F)V

    .line 19
    .line 20
    .line 21
    iput v0, p0, Lci/p;->e:F

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Lci/p;->k:Lqg/r0;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-interface {v0, v1}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lci/p;->l:Lci/q;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    new-instance v2, Lci/o;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-direct {v2, p0, p1, v1, v3}, Lci/o;-><init>(Ljava/lang/Object;FLwf/c;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Lci/q;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    move-object v1, p1

    .line 47
    check-cast v1, Lqg/r0;

    .line 48
    .line 49
    :cond_2
    iput-object v1, p0, Lci/p;->k:Lqg/r0;

    .line 50
    .line 51
    return-void
.end method

.method public final k()V
    .locals 3

    .line 1
    iget-object v0, p0, Lci/p;->n:Lci/r;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lci/r;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lci/z;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lci/p;->d()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0}, Lci/z;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eq v2, v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lci/z;->b(Z)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method
