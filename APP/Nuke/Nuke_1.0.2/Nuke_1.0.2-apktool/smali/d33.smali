.class public final Ld33;
.super Lio1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final f:Ljn;

.field public g:Lzt2;


# direct methods
.method public constructor <init>(Lim2;Ljw;Le70;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lio1;-><init>(Lim2;Lmn0;Le70;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    const/4 p2, 0x6

    .line 6
    const p3, 0x7fffffff

    .line 7
    .line 8
    .line 9
    invoke-static {p3, p2, p1}, Lfg1;->a(IILhn;)Ljn;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Ld33;->f:Ljn;

    .line 14
    .line 15
    return-void
.end method

.method public static final c(Ld33;Lim2;Lb33;Lu00;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v6, v1, Lio1;->e:Lsz0;

    .line 11
    .line 12
    instance-of v3, v2, Lc33;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    move-object v3, v2

    .line 17
    check-cast v3, Lc33;

    .line 18
    .line 19
    iget v4, v3, Lc33;->m:I

    .line 20
    .line 21
    const/high16 v5, -0x80000000

    .line 22
    .line 23
    and-int v7, v4, v5

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    sub-int/2addr v4, v5

    .line 28
    iput v4, v3, Lc33;->m:I

    .line 29
    .line 30
    :goto_0
    move-object v7, v3

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    new-instance v3, Lc33;

    .line 33
    .line 34
    invoke-direct {v3, v1, v2}, Lc33;-><init>(Ld33;Lu00;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :goto_1
    iget-object v2, v7, Lc33;->k:Ljava/lang/Object;

    .line 39
    .line 40
    iget v3, v7, Lc33;->m:I

    .line 41
    .line 42
    const/4 v8, 0x2

    .line 43
    const/4 v9, 0x1

    .line 44
    sget-object v10, Lk20;->h:Lk20;

    .line 45
    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    if-eq v3, v9, :cond_2

    .line 49
    .line 50
    if-ne v3, v8, :cond_1

    .line 51
    .line 52
    invoke-static {v2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    return-object v0

    .line 64
    :cond_2
    invoke-static {v2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_2

    .line 68
    .line 69
    :cond_3
    invoke-static {v2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance v3, Lo72;

    .line 73
    .line 74
    invoke-direct {v3}, Lo72;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object v0, v3, Lo72;->i:Ljava/lang/Object;

    .line 78
    .line 79
    iget-wide v4, v0, Lb33;->b:J

    .line 80
    .line 81
    iget-wide v11, v0, Lb33;->a:J

    .line 82
    .line 83
    iget-object v0, v6, Lsz0;->i:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Lbb2;

    .line 86
    .line 87
    const/16 v2, 0x20

    .line 88
    .line 89
    shr-long v13, v11, v2

    .line 90
    .line 91
    long-to-int v13, v13

    .line 92
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 93
    .line 94
    .line 95
    move-result v13

    .line 96
    invoke-virtual {v0, v13, v4, v5}, Lbb2;->a(FJ)V

    .line 97
    .line 98
    .line 99
    iget-object v0, v6, Lsz0;->j:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Lbb2;

    .line 102
    .line 103
    const-wide v13, 0xffffffffL

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    and-long/2addr v11, v13

    .line 109
    long-to-int v11, v11

    .line 110
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    invoke-virtual {v0, v11, v4, v5}, Lbb2;->a(FJ)V

    .line 115
    .line 116
    .line 117
    iget-object v0, v1, Ld33;->f:Ljn;

    .line 118
    .line 119
    invoke-static {v0}, Ld33;->e(Ljn;)Lb33;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-eqz v0, :cond_4

    .line 124
    .line 125
    iget-wide v4, v0, Lb33;->b:J

    .line 126
    .line 127
    iget-wide v11, v0, Lb33;->a:J

    .line 128
    .line 129
    iget-object v15, v6, Lsz0;->i:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v15, Lbb2;

    .line 132
    .line 133
    move-wide/from16 p2, v13

    .line 134
    .line 135
    shr-long v13, v11, v2

    .line 136
    .line 137
    long-to-int v2, v13

    .line 138
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    invoke-virtual {v15, v2, v4, v5}, Lbb2;->a(FJ)V

    .line 143
    .line 144
    .line 145
    iget-object v2, v6, Lsz0;->j:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Lbb2;

    .line 148
    .line 149
    and-long v11, v11, p2

    .line 150
    .line 151
    long-to-int v11, v11

    .line 152
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    invoke-virtual {v2, v11, v4, v5}, Lbb2;->a(FJ)V

    .line 157
    .line 158
    .line 159
    iget-object v2, v3, Lo72;->i:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v2, Lb33;

    .line 162
    .line 163
    invoke-virtual {v2, v0}, Lb33;->a(Lb33;)Lb33;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iput-object v0, v3, Lo72;->i:Ljava/lang/Object;

    .line 168
    .line 169
    :cond_4
    new-instance v0, Lv0;

    .line 170
    .line 171
    const/4 v4, 0x0

    .line 172
    const/16 v5, 0x8

    .line 173
    .line 174
    move-object/from16 v2, p1

    .line 175
    .line 176
    invoke-direct/range {v0 .. v5}, Lv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 177
    .line 178
    .line 179
    iput v9, v7, Lc33;->m:I

    .line 180
    .line 181
    invoke-virtual {v1, v0, v7}, Lio1;->b(Lmn0;Lu00;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    if-ne v0, v10, :cond_5

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_5
    :goto_2
    iget-object v0, v1, Lio1;->b:Lmn0;

    .line 189
    .line 190
    iget-object v1, v6, Lsz0;->i:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v1, Lbb2;

    .line 193
    .line 194
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v2}, Lbb2;->b(F)F

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    iget-object v3, v6, Lsz0;->j:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v3, Lbb2;

    .line 204
    .line 205
    invoke-virtual {v3, v2}, Lbb2;->b(F)F

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    invoke-static {v1, v2}, Lea3;->a(FF)J

    .line 210
    .line 211
    .line 212
    move-result-wide v1

    .line 213
    new-instance v3, Lda3;

    .line 214
    .line 215
    invoke-direct {v3, v1, v2}, Lda3;-><init>(J)V

    .line 216
    .line 217
    .line 218
    iput v8, v7, Lc33;->m:I

    .line 219
    .line 220
    invoke-interface {v0, v3, v7}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    if-ne v0, v10, :cond_6

    .line 225
    .line 226
    :goto_3
    return-object v10

    .line 227
    :cond_6
    :goto_4
    sget-object v0, La83;->a:La83;

    .line 228
    .line 229
    return-object v0
.end method

.method public static e(Ljn;)Lb33;
    .locals 3

    .line 1
    new-instance v0, Lni1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lni1;-><init>(Lfq;I)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Llm0;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {p0, v0, v2, v1}, Llm0;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Ltp0;->B(Lmn0;)Lvo2;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-virtual {p0}, Lvo2;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lvo2;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lb33;

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    :goto_1
    move-object v2, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v2, v0}, Lb33;->a(Lb33;)Lb33;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    return-object v2
.end method


# virtual methods
.method public final d(Lh12;)Z
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lh12;->a:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {v2}, Ldu;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lo12;

    .line 12
    .line 13
    if-eqz v2, :cond_a

    .line 14
    .line 15
    iget-object v5, v2, Lo12;->m:Ljava/util/ArrayList;

    .line 16
    .line 17
    if-nez v5, :cond_0

    .line 18
    .line 19
    sget-object v5, Lbe0;->h:Lbe0;

    .line 20
    .line 21
    :cond_0
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x0

    .line 27
    :goto_0
    const/4 v9, 0x0

    .line 28
    iget-object v10, v0, Ld33;->f:Ljn;

    .line 29
    .line 30
    iget-object v11, v0, Lio1;->a:Lim2;

    .line 31
    .line 32
    const-wide v12, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    if-ge v7, v6, :cond_5

    .line 38
    .line 39
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v14

    .line 43
    check-cast v14, Lts0;

    .line 44
    .line 45
    const/4 v15, 0x1

    .line 46
    const/16 v16, 0x0

    .line 47
    .line 48
    iget-wide v3, v14, Lts0;->d:J

    .line 49
    .line 50
    xor-long/2addr v3, v12

    .line 51
    invoke-virtual {v11, v3, v4}, Lim2;->e(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v12

    .line 55
    invoke-virtual {v11, v12, v13}, Lim2;->i(J)F

    .line 56
    .line 57
    .line 58
    move-result v11

    .line 59
    cmpg-float v9, v11, v9

    .line 60
    .line 61
    if-nez v9, :cond_1

    .line 62
    .line 63
    move v9, v15

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move/from16 v9, v16

    .line 66
    .line 67
    :goto_1
    if-nez v9, :cond_4

    .line 68
    .line 69
    new-instance v17, Lb33;

    .line 70
    .line 71
    iget-wide v11, v14, Lts0;->a:J

    .line 72
    .line 73
    const/16 v22, 0x0

    .line 74
    .line 75
    move-wide/from16 v18, v3

    .line 76
    .line 77
    move-wide/from16 v20, v11

    .line 78
    .line 79
    invoke-direct/range {v17 .. v22}, Lb33;-><init>(JJZ)V

    .line 80
    .line 81
    .line 82
    move-object/from16 v3, v17

    .line 83
    .line 84
    invoke-interface {v10, v3}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    instance-of v3, v3, Loq;

    .line 89
    .line 90
    if-eqz v3, :cond_3

    .line 91
    .line 92
    if-eqz v8, :cond_2

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    move/from16 v8, v16

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_3
    :goto_2
    move v8, v15

    .line 99
    :cond_4
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    const/4 v15, 0x1

    .line 103
    const/16 v16, 0x0

    .line 104
    .line 105
    iget-wide v3, v2, Lo12;->l:J

    .line 106
    .line 107
    xor-long/2addr v3, v12

    .line 108
    iget v1, v1, Lh12;->f:I

    .line 109
    .line 110
    const/16 v5, 0xc

    .line 111
    .line 112
    if-ne v1, v5, :cond_6

    .line 113
    .line 114
    move/from16 v22, v15

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_6
    move/from16 v22, v16

    .line 118
    .line 119
    :goto_4
    invoke-virtual {v11, v3, v4}, Lim2;->e(J)J

    .line 120
    .line 121
    .line 122
    move-result-wide v5

    .line 123
    invoke-virtual {v11, v5, v6}, Lim2;->i(J)F

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    cmpg-float v1, v1, v9

    .line 128
    .line 129
    if-nez v1, :cond_7

    .line 130
    .line 131
    move v1, v15

    .line 132
    goto :goto_5

    .line 133
    :cond_7
    move/from16 v1, v16

    .line 134
    .line 135
    :goto_5
    if-eqz v1, :cond_8

    .line 136
    .line 137
    if-eqz v22, :cond_c

    .line 138
    .line 139
    :cond_8
    new-instance v17, Lb33;

    .line 140
    .line 141
    iget-wide v1, v2, Lo12;->b:J

    .line 142
    .line 143
    move-wide/from16 v20, v1

    .line 144
    .line 145
    move-wide/from16 v18, v3

    .line 146
    .line 147
    invoke-direct/range {v17 .. v22}, Lb33;-><init>(JJZ)V

    .line 148
    .line 149
    .line 150
    move-object/from16 v1, v17

    .line 151
    .line 152
    invoke-interface {v10, v1}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    instance-of v1, v1, Loq;

    .line 157
    .line 158
    if-eqz v1, :cond_9

    .line 159
    .line 160
    if-eqz v8, :cond_b

    .line 161
    .line 162
    :cond_9
    move v8, v15

    .line 163
    goto :goto_6

    .line 164
    :cond_a
    const/4 v15, 0x1

    .line 165
    const/16 v16, 0x0

    .line 166
    .line 167
    :cond_b
    move/from16 v8, v16

    .line 168
    .line 169
    :cond_c
    :goto_6
    if-nez v8, :cond_e

    .line 170
    .line 171
    iget-boolean v0, v0, Lio1;->d:Z

    .line 172
    .line 173
    if-eqz v0, :cond_d

    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_d
    return v16

    .line 177
    :cond_e
    :goto_7
    return v15
.end method
