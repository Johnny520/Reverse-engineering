.class public final Lgj0;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lh91;
.implements Laj0;


# instance fields
.field public r:Laj0;

.field public s:Ly2;

.field public t:Lgj0;

.field public final u:Ljava/lang/String;


# direct methods
.method public constructor <init>(Laj0;Ly2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loe0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgj0;->r:Laj0;

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    new-instance p2, Ly2;

    .line 9
    .line 10
    invoke-direct {p2}, Ly2;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object p2, p0, Lgj0;->s:Ly2;

    .line 14
    .line 15
    const-string p1, "androidx.compose.ui.input.nestedscroll.NestedScrollNode"

    .line 16
    .line 17
    iput-object p1, p0, Lgj0;->u:Ljava/lang/String;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final A(IJJ)J
    .locals 12

    .line 1
    iget-object v0, p0, Lgj0;->r:Laj0;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide/from16 v4, p4

    .line 6
    .line 7
    invoke-interface/range {v0 .. v5}, Laj0;->A(IJJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide v6

    .line 11
    iget-boolean v0, p0, Loe0;->q:Z

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_c

    .line 15
    .line 16
    if-eqz v0, :cond_c

    .line 17
    .line 18
    iget-object v0, p0, Loe0;->d:Loe0;

    .line 19
    .line 20
    iget-boolean v0, v0, Loe0;->q:Z

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const-string v0, "visitAncestors called on an unattached node"

    .line 25
    .line 26
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Loe0;->d:Loe0;

    .line 30
    .line 31
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 32
    .line 33
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    :goto_0
    if-eqz v2, :cond_b

    .line 38
    .line 39
    iget-object v3, v2, Lb60;->I:Lmj0;

    .line 40
    .line 41
    iget-object v3, v3, Lmj0;->f:Loe0;

    .line 42
    .line 43
    iget v3, v3, Loe0;->g:I

    .line 44
    .line 45
    const/high16 v4, 0x40000

    .line 46
    .line 47
    and-int/2addr v3, v4

    .line 48
    if-eqz v3, :cond_9

    .line 49
    .line 50
    :goto_1
    if-eqz v0, :cond_9

    .line 51
    .line 52
    iget v3, v0, Loe0;->f:I

    .line 53
    .line 54
    and-int/2addr v3, v4

    .line 55
    if-eqz v3, :cond_8

    .line 56
    .line 57
    move-object v3, v0

    .line 58
    move-object v5, v1

    .line 59
    :goto_2
    if-eqz v3, :cond_8

    .line 60
    .line 61
    instance-of v8, v3, Lh91;

    .line 62
    .line 63
    if-eqz v8, :cond_1

    .line 64
    .line 65
    check-cast v3, Lh91;

    .line 66
    .line 67
    invoke-virtual {p0}, Lgj0;->k()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    invoke-interface {v3}, Lh91;->k()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    invoke-static {v8, v9}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_7

    .line 80
    .line 81
    const-class v8, Lgj0;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    if-ne v8, v9, :cond_7

    .line 88
    .line 89
    move-object v1, v3

    .line 90
    goto :goto_5

    .line 91
    :cond_1
    iget v8, v3, Loe0;->f:I

    .line 92
    .line 93
    and-int/2addr v8, v4

    .line 94
    if-eqz v8, :cond_7

    .line 95
    .line 96
    instance-of v8, v3, Lsm;

    .line 97
    .line 98
    if-eqz v8, :cond_7

    .line 99
    .line 100
    move-object v8, v3

    .line 101
    check-cast v8, Lsm;

    .line 102
    .line 103
    iget-object v8, v8, Lsm;->s:Loe0;

    .line 104
    .line 105
    const/4 v9, 0x0

    .line 106
    :goto_3
    const/4 v10, 0x1

    .line 107
    if-eqz v8, :cond_6

    .line 108
    .line 109
    iget v11, v8, Loe0;->f:I

    .line 110
    .line 111
    and-int/2addr v11, v4

    .line 112
    if-eqz v11, :cond_5

    .line 113
    .line 114
    add-int/lit8 v9, v9, 0x1

    .line 115
    .line 116
    if-ne v9, v10, :cond_2

    .line 117
    .line 118
    move-object v3, v8

    .line 119
    goto :goto_4

    .line 120
    :cond_2
    if-nez v5, :cond_3

    .line 121
    .line 122
    new-instance v5, Lsh0;

    .line 123
    .line 124
    const/16 v10, 0x10

    .line 125
    .line 126
    new-array v10, v10, [Loe0;

    .line 127
    .line 128
    invoke-direct {v5, v10}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_3
    if-eqz v3, :cond_4

    .line 132
    .line 133
    invoke-virtual {v5, v3}, Lsh0;->b(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    move-object v3, v1

    .line 137
    :cond_4
    invoke-virtual {v5, v8}, Lsh0;->b(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_5
    :goto_4
    iget-object v8, v8, Loe0;->i:Loe0;

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_6
    if-ne v9, v10, :cond_7

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_7
    invoke-static {v5}, Lpf1;->f(Lsh0;)Loe0;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    goto :goto_2

    .line 151
    :cond_8
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_9
    invoke-virtual {v2}, Lb60;->v()Lb60;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    if-eqz v2, :cond_a

    .line 159
    .line 160
    iget-object v0, v2, Lb60;->I:Lmj0;

    .line 161
    .line 162
    if-eqz v0, :cond_a

    .line 163
    .line 164
    iget-object v0, v0, Lmj0;->e:Ld61;

    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :cond_a
    move-object v0, v1

    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_b
    :goto_5
    check-cast v1, Lgj0;

    .line 172
    .line 173
    :cond_c
    move-object v0, v1

    .line 174
    if-eqz v0, :cond_d

    .line 175
    .line 176
    invoke-static {p2, p3, v6, v7}, Lok0;->e(JJ)J

    .line 177
    .line 178
    .line 179
    move-result-wide v2

    .line 180
    move-wide/from16 v4, p4

    .line 181
    .line 182
    invoke-static {v4, v5, v6, v7}, Lok0;->d(JJ)J

    .line 183
    .line 184
    .line 185
    move-result-wide v4

    .line 186
    move v1, p1

    .line 187
    invoke-virtual/range {v0 .. v5}, Lgj0;->A(IJJ)J

    .line 188
    .line 189
    .line 190
    move-result-wide p0

    .line 191
    goto :goto_6

    .line 192
    :cond_d
    const-wide/16 p0, 0x0

    .line 193
    .line 194
    :goto_6
    invoke-static {v6, v7, p0, p1}, Lok0;->e(JJ)J

    .line 195
    .line 196
    .line 197
    move-result-wide p0

    .line 198
    return-wide p0
.end method

.method public final O(JLik;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, Lfj0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lfj0;

    .line 7
    .line 8
    iget v1, v0, Lfj0;->j:I

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
    iput v1, v0, Lfj0;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lfj0;

    .line 21
    .line 22
    check-cast p3, Ljk;

    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lfj0;-><init>(Lgj0;Ljk;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, v0, Lfj0;->h:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, Lfj0;->j:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x2

    .line 33
    const/4 v4, 0x1

    .line 34
    sget-object v5, Lzk;->d:Lzk;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v4, :cond_2

    .line 39
    .line 40
    if-ne v1, v3, :cond_1

    .line 41
    .line 42
    iget-wide p0, v0, Lfj0;->g:J

    .line 43
    .line 44
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_a

    .line 48
    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :cond_2
    iget-wide p1, v0, Lfj0;->g:J

    .line 56
    .line 57
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_3
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-boolean p3, p0, Loe0;->q:Z

    .line 66
    .line 67
    if-eqz p3, :cond_10

    .line 68
    .line 69
    if-eqz p3, :cond_10

    .line 70
    .line 71
    iget-object p3, p0, Loe0;->d:Loe0;

    .line 72
    .line 73
    iget-boolean p3, p3, Loe0;->q:Z

    .line 74
    .line 75
    if-nez p3, :cond_4

    .line 76
    .line 77
    const-string p3, "visitAncestors called on an unattached node"

    .line 78
    .line 79
    invoke-static {p3}, Lw10;->b(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    iget-object p3, p0, Loe0;->d:Loe0;

    .line 83
    .line 84
    iget-object p3, p3, Loe0;->h:Loe0;

    .line 85
    .line 86
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :goto_1
    if-eqz v1, :cond_f

    .line 91
    .line 92
    iget-object v6, v1, Lb60;->I:Lmj0;

    .line 93
    .line 94
    iget-object v6, v6, Lmj0;->f:Loe0;

    .line 95
    .line 96
    iget v6, v6, Loe0;->g:I

    .line 97
    .line 98
    const/high16 v7, 0x40000

    .line 99
    .line 100
    and-int/2addr v6, v7

    .line 101
    if-eqz v6, :cond_d

    .line 102
    .line 103
    :goto_2
    if-eqz p3, :cond_d

    .line 104
    .line 105
    iget v6, p3, Loe0;->f:I

    .line 106
    .line 107
    and-int/2addr v6, v7

    .line 108
    if-eqz v6, :cond_c

    .line 109
    .line 110
    move-object v6, p3

    .line 111
    move-object v8, v2

    .line 112
    :goto_3
    if-eqz v6, :cond_c

    .line 113
    .line 114
    instance-of v9, v6, Lh91;

    .line 115
    .line 116
    if-eqz v9, :cond_5

    .line 117
    .line 118
    check-cast v6, Lh91;

    .line 119
    .line 120
    invoke-virtual {p0}, Lgj0;->k()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-interface {v6}, Lh91;->k()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-static {v9, v10}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-eqz v9, :cond_b

    .line 133
    .line 134
    const-class v9, Lgj0;

    .line 135
    .line 136
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    if-ne v9, v10, :cond_b

    .line 141
    .line 142
    move-object v2, v6

    .line 143
    goto :goto_6

    .line 144
    :cond_5
    iget v9, v6, Loe0;->f:I

    .line 145
    .line 146
    and-int/2addr v9, v7

    .line 147
    if-eqz v9, :cond_b

    .line 148
    .line 149
    instance-of v9, v6, Lsm;

    .line 150
    .line 151
    if-eqz v9, :cond_b

    .line 152
    .line 153
    move-object v9, v6

    .line 154
    check-cast v9, Lsm;

    .line 155
    .line 156
    iget-object v9, v9, Lsm;->s:Loe0;

    .line 157
    .line 158
    const/4 v10, 0x0

    .line 159
    :goto_4
    if-eqz v9, :cond_a

    .line 160
    .line 161
    iget v11, v9, Loe0;->f:I

    .line 162
    .line 163
    and-int/2addr v11, v7

    .line 164
    if-eqz v11, :cond_9

    .line 165
    .line 166
    add-int/lit8 v10, v10, 0x1

    .line 167
    .line 168
    if-ne v10, v4, :cond_6

    .line 169
    .line 170
    move-object v6, v9

    .line 171
    goto :goto_5

    .line 172
    :cond_6
    if-nez v8, :cond_7

    .line 173
    .line 174
    new-instance v8, Lsh0;

    .line 175
    .line 176
    const/16 v11, 0x10

    .line 177
    .line 178
    new-array v11, v11, [Loe0;

    .line 179
    .line 180
    invoke-direct {v8, v11}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_7
    if-eqz v6, :cond_8

    .line 184
    .line 185
    invoke-virtual {v8, v6}, Lsh0;->b(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    move-object v6, v2

    .line 189
    :cond_8
    invoke-virtual {v8, v9}, Lsh0;->b(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    :cond_9
    :goto_5
    iget-object v9, v9, Loe0;->i:Loe0;

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_a
    if-ne v10, v4, :cond_b

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_b
    invoke-static {v8}, Lpf1;->f(Lsh0;)Loe0;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    goto :goto_3

    .line 203
    :cond_c
    iget-object p3, p3, Loe0;->h:Loe0;

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_d
    invoke-virtual {v1}, Lb60;->v()Lb60;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    if-eqz v1, :cond_e

    .line 211
    .line 212
    iget-object p3, v1, Lb60;->I:Lmj0;

    .line 213
    .line 214
    if-eqz p3, :cond_e

    .line 215
    .line 216
    iget-object p3, p3, Lmj0;->e:Ld61;

    .line 217
    .line 218
    goto/16 :goto_1

    .line 219
    .line 220
    :cond_e
    move-object p3, v2

    .line 221
    goto/16 :goto_1

    .line 222
    .line 223
    :cond_f
    :goto_6
    check-cast v2, Lgj0;

    .line 224
    .line 225
    :cond_10
    if-eqz v2, :cond_12

    .line 226
    .line 227
    iput-wide p1, v0, Lfj0;->g:J

    .line 228
    .line 229
    iput v4, v0, Lfj0;->j:I

    .line 230
    .line 231
    invoke-virtual {v2, p1, p2, v0}, Lgj0;->O(JLik;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p3

    .line 235
    if-ne p3, v5, :cond_11

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_11
    :goto_7
    check-cast p3, Lrb1;

    .line 239
    .line 240
    iget-wide v1, p3, Lrb1;->a:J

    .line 241
    .line 242
    goto :goto_8

    .line 243
    :cond_12
    const-wide/16 v1, 0x0

    .line 244
    .line 245
    :goto_8
    iget-object p0, p0, Lgj0;->r:Laj0;

    .line 246
    .line 247
    invoke-static {p1, p2, v1, v2}, Lrb1;->d(JJ)J

    .line 248
    .line 249
    .line 250
    move-result-wide p1

    .line 251
    iput-wide v1, v0, Lfj0;->g:J

    .line 252
    .line 253
    iput v3, v0, Lfj0;->j:I

    .line 254
    .line 255
    invoke-interface {p0, p1, p2, v0}, Laj0;->O(JLik;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p3

    .line 259
    if-ne p3, v5, :cond_13

    .line 260
    .line 261
    :goto_9
    return-object v5

    .line 262
    :cond_13
    move-wide p0, v1

    .line 263
    :goto_a
    check-cast p3, Lrb1;

    .line 264
    .line 265
    iget-wide p2, p3, Lrb1;->a:J

    .line 266
    .line 267
    invoke-static {p0, p1, p2, p3}, Lrb1;->e(JJ)J

    .line 268
    .line 269
    .line 270
    move-result-wide p0

    .line 271
    new-instance p2, Lrb1;

    .line 272
    .line 273
    invoke-direct {p2, p0, p1}, Lrb1;-><init>(J)V

    .line 274
    .line 275
    .line 276
    return-object p2
.end method

.method public final R(JJLik;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    instance-of v2, v1, Lej0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lej0;

    .line 11
    .line 12
    iget v3, v2, Lej0;->k:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lej0;->k:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lej0;

    .line 26
    .line 27
    check-cast v1, Ljk;

    .line 28
    .line 29
    invoke-direct {v2, v0, v1}, Lej0;-><init>(Lgj0;Ljk;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v1, v8, Lej0;->i:Ljava/lang/Object;

    .line 34
    .line 35
    iget v2, v8, Lej0;->k:I

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x2

    .line 39
    const/4 v11, 0x1

    .line 40
    sget-object v12, Lzk;->d:Lzk;

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    if-eq v2, v11, :cond_2

    .line 45
    .line 46
    if-ne v2, v10, :cond_1

    .line 47
    .line 48
    iget-wide v2, v8, Lej0;->g:J

    .line 49
    .line 50
    invoke-static {v1}, Lw60;->M(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_f

    .line 54
    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v9

    .line 61
    :cond_2
    iget-wide v2, v8, Lej0;->h:J

    .line 62
    .line 63
    iget-wide v4, v8, Lej0;->g:J

    .line 64
    .line 65
    invoke-static {v1}, Lw60;->M(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    invoke-static {v1}, Lw60;->M(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v3, v0, Lgj0;->r:Laj0;

    .line 73
    .line 74
    move-wide/from16 v4, p1

    .line 75
    .line 76
    iput-wide v4, v8, Lej0;->g:J

    .line 77
    .line 78
    move-wide/from16 v6, p3

    .line 79
    .line 80
    iput-wide v6, v8, Lej0;->h:J

    .line 81
    .line 82
    iput v11, v8, Lej0;->k:I

    .line 83
    .line 84
    invoke-interface/range {v3 .. v8}, Laj0;->R(JJLik;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-ne v1, v12, :cond_4

    .line 89
    .line 90
    goto/16 :goto_e

    .line 91
    .line 92
    :cond_4
    move-wide/from16 v4, p1

    .line 93
    .line 94
    move-wide/from16 v2, p3

    .line 95
    .line 96
    :goto_2
    check-cast v1, Lrb1;

    .line 97
    .line 98
    iget-wide v6, v1, Lrb1;->a:J

    .line 99
    .line 100
    iget-boolean v1, v0, Loe0;->q:Z

    .line 101
    .line 102
    if-eqz v1, :cond_13

    .line 103
    .line 104
    if-eqz v1, :cond_12

    .line 105
    .line 106
    if-eqz v1, :cond_12

    .line 107
    .line 108
    iget-object v1, v0, Loe0;->d:Loe0;

    .line 109
    .line 110
    iget-boolean v1, v1, Loe0;->q:Z

    .line 111
    .line 112
    if-nez v1, :cond_5

    .line 113
    .line 114
    const-string v1, "visitAncestors called on an unattached node"

    .line 115
    .line 116
    invoke-static {v1}, Lw10;->b(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_5
    iget-object v1, v0, Loe0;->d:Loe0;

    .line 120
    .line 121
    iget-object v1, v1, Loe0;->h:Loe0;

    .line 122
    .line 123
    invoke-static {v0}, Lpf1;->Q(Lrm;)Lb60;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    :goto_3
    if-eqz v13, :cond_11

    .line 128
    .line 129
    iget-object v14, v13, Lb60;->I:Lmj0;

    .line 130
    .line 131
    iget-object v14, v14, Lmj0;->f:Loe0;

    .line 132
    .line 133
    iget v14, v14, Loe0;->g:I

    .line 134
    .line 135
    const/high16 v15, 0x40000

    .line 136
    .line 137
    and-int/2addr v14, v15

    .line 138
    if-eqz v14, :cond_f

    .line 139
    .line 140
    :goto_4
    if-eqz v1, :cond_f

    .line 141
    .line 142
    iget v14, v1, Loe0;->f:I

    .line 143
    .line 144
    and-int/2addr v14, v15

    .line 145
    if-eqz v14, :cond_e

    .line 146
    .line 147
    move-object v14, v1

    .line 148
    move-object/from16 v16, v9

    .line 149
    .line 150
    :goto_5
    if-eqz v14, :cond_e

    .line 151
    .line 152
    instance-of v9, v14, Lh91;

    .line 153
    .line 154
    if-eqz v9, :cond_7

    .line 155
    .line 156
    check-cast v14, Lh91;

    .line 157
    .line 158
    invoke-virtual {v0}, Lgj0;->k()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    move/from16 p1, v15

    .line 163
    .line 164
    invoke-interface {v14}, Lh91;->k()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v15

    .line 168
    invoke-static {v9, v15}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    if-eqz v9, :cond_6

    .line 173
    .line 174
    const-class v9, Lgj0;

    .line 175
    .line 176
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-result-object v15

    .line 180
    if-ne v9, v15, :cond_6

    .line 181
    .line 182
    move-object v9, v14

    .line 183
    goto/16 :goto_c

    .line 184
    .line 185
    :cond_6
    move v9, v11

    .line 186
    goto :goto_a

    .line 187
    :cond_7
    move/from16 p1, v15

    .line 188
    .line 189
    iget v9, v14, Loe0;->f:I

    .line 190
    .line 191
    and-int v9, v9, p1

    .line 192
    .line 193
    if-eqz v9, :cond_6

    .line 194
    .line 195
    instance-of v9, v14, Lsm;

    .line 196
    .line 197
    if-eqz v9, :cond_6

    .line 198
    .line 199
    move-object v9, v14

    .line 200
    check-cast v9, Lsm;

    .line 201
    .line 202
    iget-object v9, v9, Lsm;->s:Loe0;

    .line 203
    .line 204
    const/4 v15, 0x0

    .line 205
    :goto_6
    if-eqz v9, :cond_c

    .line 206
    .line 207
    iget v10, v9, Loe0;->f:I

    .line 208
    .line 209
    and-int v10, v10, p1

    .line 210
    .line 211
    if-eqz v10, :cond_b

    .line 212
    .line 213
    add-int/lit8 v15, v15, 0x1

    .line 214
    .line 215
    if-ne v15, v11, :cond_8

    .line 216
    .line 217
    move-object v14, v9

    .line 218
    goto :goto_8

    .line 219
    :cond_8
    if-nez v16, :cond_9

    .line 220
    .line 221
    new-instance v10, Lsh0;

    .line 222
    .line 223
    const/16 v11, 0x10

    .line 224
    .line 225
    new-array v11, v11, [Loe0;

    .line 226
    .line 227
    invoke-direct {v10, v11}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_9
    move-object/from16 v10, v16

    .line 232
    .line 233
    :goto_7
    if-eqz v14, :cond_a

    .line 234
    .line 235
    invoke-virtual {v10, v14}, Lsh0;->b(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    const/4 v14, 0x0

    .line 239
    :cond_a
    invoke-virtual {v10, v9}, Lsh0;->b(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    move-object/from16 v16, v10

    .line 243
    .line 244
    :cond_b
    :goto_8
    iget-object v9, v9, Loe0;->i:Loe0;

    .line 245
    .line 246
    const/4 v10, 0x2

    .line 247
    const/4 v11, 0x1

    .line 248
    goto :goto_6

    .line 249
    :cond_c
    move v9, v11

    .line 250
    if-ne v15, v9, :cond_d

    .line 251
    .line 252
    :goto_9
    move/from16 v15, p1

    .line 253
    .line 254
    move v11, v9

    .line 255
    const/4 v9, 0x0

    .line 256
    const/4 v10, 0x2

    .line 257
    goto :goto_5

    .line 258
    :cond_d
    :goto_a
    invoke-static/range {v16 .. v16}, Lpf1;->f(Lsh0;)Loe0;

    .line 259
    .line 260
    .line 261
    move-result-object v14

    .line 262
    goto :goto_9

    .line 263
    :cond_e
    move v9, v11

    .line 264
    move/from16 p1, v15

    .line 265
    .line 266
    iget-object v1, v1, Loe0;->h:Loe0;

    .line 267
    .line 268
    move/from16 v15, p1

    .line 269
    .line 270
    move v11, v9

    .line 271
    const/4 v9, 0x0

    .line 272
    const/4 v10, 0x2

    .line 273
    goto/16 :goto_4

    .line 274
    .line 275
    :cond_f
    move v9, v11

    .line 276
    invoke-virtual {v13}, Lb60;->v()Lb60;

    .line 277
    .line 278
    .line 279
    move-result-object v13

    .line 280
    if-eqz v13, :cond_10

    .line 281
    .line 282
    iget-object v1, v13, Lb60;->I:Lmj0;

    .line 283
    .line 284
    if-eqz v1, :cond_10

    .line 285
    .line 286
    iget-object v1, v1, Lmj0;->e:Ld61;

    .line 287
    .line 288
    goto :goto_b

    .line 289
    :cond_10
    const/4 v1, 0x0

    .line 290
    :goto_b
    move v11, v9

    .line 291
    const/4 v9, 0x0

    .line 292
    const/4 v10, 0x2

    .line 293
    goto/16 :goto_3

    .line 294
    .line 295
    :cond_11
    const/4 v9, 0x0

    .line 296
    :goto_c
    check-cast v9, Lgj0;

    .line 297
    .line 298
    goto :goto_d

    .line 299
    :cond_12
    const/4 v9, 0x0

    .line 300
    goto :goto_d

    .line 301
    :cond_13
    iget-object v9, v0, Lgj0;->t:Lgj0;

    .line 302
    .line 303
    :goto_d
    if-eqz v9, :cond_15

    .line 304
    .line 305
    invoke-static {v4, v5, v6, v7}, Lrb1;->e(JJ)J

    .line 306
    .line 307
    .line 308
    move-result-wide v0

    .line 309
    invoke-static {v2, v3, v6, v7}, Lrb1;->d(JJ)J

    .line 310
    .line 311
    .line 312
    move-result-wide v2

    .line 313
    iput-wide v6, v8, Lej0;->g:J

    .line 314
    .line 315
    const/4 v4, 0x2

    .line 316
    iput v4, v8, Lej0;->k:I

    .line 317
    .line 318
    move-wide/from16 p1, v0

    .line 319
    .line 320
    move-wide/from16 p3, v2

    .line 321
    .line 322
    move-object/from16 p5, v8

    .line 323
    .line 324
    move-object/from16 p0, v9

    .line 325
    .line 326
    invoke-virtual/range {p0 .. p5}, Lgj0;->R(JJLik;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    if-ne v1, v12, :cond_14

    .line 331
    .line 332
    :goto_e
    return-object v12

    .line 333
    :cond_14
    move-wide v2, v6

    .line 334
    :goto_f
    check-cast v1, Lrb1;

    .line 335
    .line 336
    iget-wide v0, v1, Lrb1;->a:J

    .line 337
    .line 338
    move-wide v6, v2

    .line 339
    goto :goto_10

    .line 340
    :cond_15
    const-wide/16 v0, 0x0

    .line 341
    .line 342
    :goto_10
    invoke-static {v6, v7, v0, v1}, Lrb1;->e(JJ)J

    .line 343
    .line 344
    .line 345
    move-result-wide v0

    .line 346
    new-instance v2, Lrb1;

    .line 347
    .line 348
    invoke-direct {v2, v0, v1}, Lrb1;-><init>(J)V

    .line 349
    .line 350
    .line 351
    return-object v2
.end method

.method public final b0(IJ)J
    .locals 10

    .line 1
    iget-boolean v0, p0, Loe0;->q:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_c

    .line 5
    .line 6
    if-eqz v0, :cond_c

    .line 7
    .line 8
    iget-object v0, p0, Loe0;->d:Loe0;

    .line 9
    .line 10
    iget-boolean v0, v0, Loe0;->q:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string v0, "visitAncestors called on an unattached node"

    .line 15
    .line 16
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Loe0;->d:Loe0;

    .line 20
    .line 21
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 22
    .line 23
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :goto_0
    if-eqz v2, :cond_b

    .line 28
    .line 29
    iget-object v3, v2, Lb60;->I:Lmj0;

    .line 30
    .line 31
    iget-object v3, v3, Lmj0;->f:Loe0;

    .line 32
    .line 33
    iget v3, v3, Loe0;->g:I

    .line 34
    .line 35
    const/high16 v4, 0x40000

    .line 36
    .line 37
    and-int/2addr v3, v4

    .line 38
    if-eqz v3, :cond_9

    .line 39
    .line 40
    :goto_1
    if-eqz v0, :cond_9

    .line 41
    .line 42
    iget v3, v0, Loe0;->f:I

    .line 43
    .line 44
    and-int/2addr v3, v4

    .line 45
    if-eqz v3, :cond_8

    .line 46
    .line 47
    move-object v3, v0

    .line 48
    move-object v5, v1

    .line 49
    :goto_2
    if-eqz v3, :cond_8

    .line 50
    .line 51
    instance-of v6, v3, Lh91;

    .line 52
    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    check-cast v3, Lh91;

    .line 56
    .line 57
    invoke-virtual {p0}, Lgj0;->k()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-interface {v3}, Lh91;->k()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-static {v6, v7}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-eqz v6, :cond_7

    .line 70
    .line 71
    const-class v6, Lgj0;

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    if-ne v6, v7, :cond_7

    .line 78
    .line 79
    move-object v1, v3

    .line 80
    goto :goto_5

    .line 81
    :cond_1
    iget v6, v3, Loe0;->f:I

    .line 82
    .line 83
    and-int/2addr v6, v4

    .line 84
    if-eqz v6, :cond_7

    .line 85
    .line 86
    instance-of v6, v3, Lsm;

    .line 87
    .line 88
    if-eqz v6, :cond_7

    .line 89
    .line 90
    move-object v6, v3

    .line 91
    check-cast v6, Lsm;

    .line 92
    .line 93
    iget-object v6, v6, Lsm;->s:Loe0;

    .line 94
    .line 95
    const/4 v7, 0x0

    .line 96
    :goto_3
    const/4 v8, 0x1

    .line 97
    if-eqz v6, :cond_6

    .line 98
    .line 99
    iget v9, v6, Loe0;->f:I

    .line 100
    .line 101
    and-int/2addr v9, v4

    .line 102
    if-eqz v9, :cond_5

    .line 103
    .line 104
    add-int/lit8 v7, v7, 0x1

    .line 105
    .line 106
    if-ne v7, v8, :cond_2

    .line 107
    .line 108
    move-object v3, v6

    .line 109
    goto :goto_4

    .line 110
    :cond_2
    if-nez v5, :cond_3

    .line 111
    .line 112
    new-instance v5, Lsh0;

    .line 113
    .line 114
    const/16 v8, 0x10

    .line 115
    .line 116
    new-array v8, v8, [Loe0;

    .line 117
    .line 118
    invoke-direct {v5, v8}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_3
    if-eqz v3, :cond_4

    .line 122
    .line 123
    invoke-virtual {v5, v3}, Lsh0;->b(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    move-object v3, v1

    .line 127
    :cond_4
    invoke-virtual {v5, v6}, Lsh0;->b(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    :goto_4
    iget-object v6, v6, Loe0;->i:Loe0;

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    if-ne v7, v8, :cond_7

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_7
    invoke-static {v5}, Lpf1;->f(Lsh0;)Loe0;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    goto :goto_2

    .line 141
    :cond_8
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_9
    invoke-virtual {v2}, Lb60;->v()Lb60;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    if-eqz v2, :cond_a

    .line 149
    .line 150
    iget-object v0, v2, Lb60;->I:Lmj0;

    .line 151
    .line 152
    if-eqz v0, :cond_a

    .line 153
    .line 154
    iget-object v0, v0, Lmj0;->e:Ld61;

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_a
    move-object v0, v1

    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_b
    :goto_5
    check-cast v1, Lgj0;

    .line 162
    .line 163
    :cond_c
    if-eqz v1, :cond_d

    .line 164
    .line 165
    invoke-virtual {v1, p1, p2, p3}, Lgj0;->b0(IJ)J

    .line 166
    .line 167
    .line 168
    move-result-wide v0

    .line 169
    goto :goto_6

    .line 170
    :cond_d
    const-wide/16 v0, 0x0

    .line 171
    .line 172
    :goto_6
    iget-object p0, p0, Lgj0;->r:Laj0;

    .line 173
    .line 174
    invoke-static {p2, p3, v0, v1}, Lok0;->d(JJ)J

    .line 175
    .line 176
    .line 177
    move-result-wide p2

    .line 178
    invoke-interface {p0, p1, p2, p3}, Laj0;->b0(IJ)J

    .line 179
    .line 180
    .line 181
    move-result-wide p0

    .line 182
    invoke-static {v0, v1, p0, p1}, Lok0;->e(JJ)J

    .line 183
    .line 184
    .line 185
    move-result-wide p0

    .line 186
    return-wide p0
.end method

.method public final k()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lgj0;->u:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgj0;->s:Ly2;

    .line 2
    .line 3
    iput-object p0, v0, Ly2;->d:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, v0, Ly2;->e:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object v1, p0, Lgj0;->t:Lgj0;

    .line 9
    .line 10
    new-instance v1, Li7;

    .line 11
    .line 12
    const/4 v2, 0x7

    .line 13
    invoke-direct {v1, v2, p0}, Li7;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, v0, Ly2;->f:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {p0}, Loe0;->k0()Lyk;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iput-object p0, v0, Ly2;->g:Ljava/lang/Object;

    .line 23
    .line 24
    return-void
.end method

.method public final p0()V
    .locals 12

    .line 1
    new-instance v0, Lzt0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lo3;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-direct {v1, v2, v0}, Lo3;-><init>(ILzt0;)V

    .line 10
    .line 11
    .line 12
    move-object v3, p0

    .line 13
    check-cast v3, Loe0;

    .line 14
    .line 15
    iget-object v4, v3, Loe0;->d:Loe0;

    .line 16
    .line 17
    iget-boolean v4, v4, Loe0;->q:Z

    .line 18
    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    const-string v4, "visitAncestors called on an unattached node"

    .line 22
    .line 23
    invoke-static {v4}, Lw10;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v3, v3, Loe0;->d:Loe0;

    .line 27
    .line 28
    iget-object v3, v3, Loe0;->h:Loe0;

    .line 29
    .line 30
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    :goto_0
    const/4 v5, 0x0

    .line 35
    if-eqz v4, :cond_c

    .line 36
    .line 37
    iget-object v6, v4, Lb60;->I:Lmj0;

    .line 38
    .line 39
    iget-object v6, v6, Lmj0;->f:Loe0;

    .line 40
    .line 41
    iget v6, v6, Loe0;->g:I

    .line 42
    .line 43
    const/high16 v7, 0x40000

    .line 44
    .line 45
    and-int/2addr v6, v7

    .line 46
    if-eqz v6, :cond_a

    .line 47
    .line 48
    :goto_1
    if-eqz v3, :cond_a

    .line 49
    .line 50
    iget v6, v3, Loe0;->f:I

    .line 51
    .line 52
    and-int/2addr v6, v7

    .line 53
    if-eqz v6, :cond_9

    .line 54
    .line 55
    move-object v6, v3

    .line 56
    move-object v8, v5

    .line 57
    :goto_2
    if-eqz v6, :cond_9

    .line 58
    .line 59
    instance-of v9, v6, Lh91;

    .line 60
    .line 61
    if-eqz v9, :cond_2

    .line 62
    .line 63
    check-cast v6, Lh91;

    .line 64
    .line 65
    invoke-interface {p0}, Lh91;->k()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-interface {v6}, Lh91;->k()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    invoke-static {v9, v10}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-eqz v9, :cond_1

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    if-ne v9, v10, :cond_1

    .line 88
    .line 89
    invoke-interface {v1, v6}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    check-cast v6, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    goto :goto_3

    .line 100
    :cond_1
    move v6, v2

    .line 101
    :goto_3
    if-nez v6, :cond_8

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_2
    iget v9, v6, Loe0;->f:I

    .line 105
    .line 106
    and-int/2addr v9, v7

    .line 107
    if-eqz v9, :cond_8

    .line 108
    .line 109
    instance-of v9, v6, Lsm;

    .line 110
    .line 111
    if-eqz v9, :cond_8

    .line 112
    .line 113
    move-object v9, v6

    .line 114
    check-cast v9, Lsm;

    .line 115
    .line 116
    iget-object v9, v9, Lsm;->s:Loe0;

    .line 117
    .line 118
    const/4 v10, 0x0

    .line 119
    :goto_4
    if-eqz v9, :cond_7

    .line 120
    .line 121
    iget v11, v9, Loe0;->f:I

    .line 122
    .line 123
    and-int/2addr v11, v7

    .line 124
    if-eqz v11, :cond_6

    .line 125
    .line 126
    add-int/lit8 v10, v10, 0x1

    .line 127
    .line 128
    if-ne v10, v2, :cond_3

    .line 129
    .line 130
    move-object v6, v9

    .line 131
    goto :goto_5

    .line 132
    :cond_3
    if-nez v8, :cond_4

    .line 133
    .line 134
    new-instance v8, Lsh0;

    .line 135
    .line 136
    const/16 v11, 0x10

    .line 137
    .line 138
    new-array v11, v11, [Loe0;

    .line 139
    .line 140
    invoke-direct {v8, v11}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_4
    if-eqz v6, :cond_5

    .line 144
    .line 145
    invoke-virtual {v8, v6}, Lsh0;->b(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    move-object v6, v5

    .line 149
    :cond_5
    invoke-virtual {v8, v9}, Lsh0;->b(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_6
    :goto_5
    iget-object v9, v9, Loe0;->i:Loe0;

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_7
    if-ne v10, v2, :cond_8

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_8
    invoke-static {v8}, Lpf1;->f(Lsh0;)Loe0;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    goto :goto_2

    .line 163
    :cond_9
    iget-object v3, v3, Loe0;->h:Loe0;

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_a
    invoke-virtual {v4}, Lb60;->v()Lb60;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    if-eqz v4, :cond_b

    .line 171
    .line 172
    iget-object v3, v4, Lb60;->I:Lmj0;

    .line 173
    .line 174
    if-eqz v3, :cond_b

    .line 175
    .line 176
    iget-object v3, v3, Lmj0;->e:Ld61;

    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_b
    move-object v3, v5

    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_c
    :goto_6
    iget-object v0, v0, Lzt0;->d:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Lh91;

    .line 186
    .line 187
    check-cast v0, Lgj0;

    .line 188
    .line 189
    iput-object v0, p0, Lgj0;->t:Lgj0;

    .line 190
    .line 191
    iget-object v1, p0, Lgj0;->s:Ly2;

    .line 192
    .line 193
    iput-object v0, v1, Ly2;->e:Ljava/lang/Object;

    .line 194
    .line 195
    iget-object v0, v1, Ly2;->d:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, Lgj0;

    .line 198
    .line 199
    if-ne v0, p0, :cond_d

    .line 200
    .line 201
    iput-object v5, v1, Ly2;->d:Ljava/lang/Object;

    .line 202
    .line 203
    :cond_d
    return-void
.end method

.method public final w0()Lyk;
    .locals 10

    .line 1
    iget-boolean v0, p0, Loe0;->q:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    iget-object v0, p0, Loe0;->d:Loe0;

    .line 8
    .line 9
    iget-boolean v0, v0, Loe0;->q:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string v0, "visitAncestors called on an unattached node"

    .line 14
    .line 15
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Loe0;->d:Loe0;

    .line 19
    .line 20
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 21
    .line 22
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :goto_0
    if-eqz v3, :cond_b

    .line 27
    .line 28
    iget-object v4, v3, Lb60;->I:Lmj0;

    .line 29
    .line 30
    iget-object v4, v4, Lmj0;->f:Loe0;

    .line 31
    .line 32
    iget v4, v4, Loe0;->g:I

    .line 33
    .line 34
    const/high16 v5, 0x40000

    .line 35
    .line 36
    and-int/2addr v4, v5

    .line 37
    if-eqz v4, :cond_9

    .line 38
    .line 39
    :goto_1
    if-eqz v0, :cond_9

    .line 40
    .line 41
    iget v4, v0, Loe0;->f:I

    .line 42
    .line 43
    and-int/2addr v4, v5

    .line 44
    if-eqz v4, :cond_8

    .line 45
    .line 46
    move-object v4, v0

    .line 47
    move-object v6, v2

    .line 48
    :goto_2
    if-eqz v4, :cond_8

    .line 49
    .line 50
    instance-of v7, v4, Lh91;

    .line 51
    .line 52
    if-eqz v7, :cond_1

    .line 53
    .line 54
    check-cast v4, Lh91;

    .line 55
    .line 56
    invoke-virtual {p0}, Lgj0;->k()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-interface {v4}, Lh91;->k()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-static {v7, v8}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_7

    .line 69
    .line 70
    const-class v7, Lgj0;

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    if-ne v7, v8, :cond_7

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_1
    iget v7, v4, Loe0;->f:I

    .line 80
    .line 81
    and-int/2addr v7, v5

    .line 82
    if-eqz v7, :cond_7

    .line 83
    .line 84
    instance-of v7, v4, Lsm;

    .line 85
    .line 86
    if-eqz v7, :cond_7

    .line 87
    .line 88
    move-object v7, v4

    .line 89
    check-cast v7, Lsm;

    .line 90
    .line 91
    iget-object v7, v7, Lsm;->s:Loe0;

    .line 92
    .line 93
    const/4 v8, 0x0

    .line 94
    :goto_3
    if-eqz v7, :cond_6

    .line 95
    .line 96
    iget v9, v7, Loe0;->f:I

    .line 97
    .line 98
    and-int/2addr v9, v5

    .line 99
    if-eqz v9, :cond_5

    .line 100
    .line 101
    add-int/lit8 v8, v8, 0x1

    .line 102
    .line 103
    if-ne v8, v1, :cond_2

    .line 104
    .line 105
    move-object v4, v7

    .line 106
    goto :goto_4

    .line 107
    :cond_2
    if-nez v6, :cond_3

    .line 108
    .line 109
    new-instance v6, Lsh0;

    .line 110
    .line 111
    const/16 v9, 0x10

    .line 112
    .line 113
    new-array v9, v9, [Loe0;

    .line 114
    .line 115
    invoke-direct {v6, v9}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_3
    if-eqz v4, :cond_4

    .line 119
    .line 120
    invoke-virtual {v6, v4}, Lsh0;->b(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    move-object v4, v2

    .line 124
    :cond_4
    invoke-virtual {v6, v7}, Lsh0;->b(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_5
    :goto_4
    iget-object v7, v7, Loe0;->i:Loe0;

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_6
    if-ne v8, v1, :cond_7

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_7
    invoke-static {v6}, Lpf1;->f(Lsh0;)Loe0;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    goto :goto_2

    .line 138
    :cond_8
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_9
    invoke-virtual {v3}, Lb60;->v()Lb60;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    if-eqz v3, :cond_a

    .line 146
    .line 147
    iget-object v0, v3, Lb60;->I:Lmj0;

    .line 148
    .line 149
    if-eqz v0, :cond_a

    .line 150
    .line 151
    iget-object v0, v0, Lmj0;->e:Ld61;

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_a
    move-object v0, v2

    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_b
    move-object v4, v2

    .line 158
    :goto_5
    check-cast v4, Lgj0;

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_c
    move-object v4, v2

    .line 162
    :goto_6
    if-eqz v4, :cond_d

    .line 163
    .line 164
    invoke-virtual {v4}, Lgj0;->w0()Lyk;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    goto :goto_7

    .line 169
    :cond_d
    move-object v0, v2

    .line 170
    :goto_7
    if-eqz v0, :cond_e

    .line 171
    .line 172
    invoke-static {v0}, Lp30;->K(Lyk;)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-ne v3, v1, :cond_e

    .line 177
    .line 178
    return-object v0

    .line 179
    :cond_e
    iget-object p0, p0, Lgj0;->s:Ly2;

    .line 180
    .line 181
    iget-object p0, p0, Ly2;->g:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p0, Lyk;

    .line 184
    .line 185
    if-eqz p0, :cond_f

    .line 186
    .line 187
    return-object p0

    .line 188
    :cond_f
    const-string p0, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    .line 189
    .line 190
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    return-object v2
.end method
