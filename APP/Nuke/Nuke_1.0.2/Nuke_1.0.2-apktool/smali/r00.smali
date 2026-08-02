.class public abstract Lr00;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lm00;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    sget-object v0, Lpa;->a:Lmy;

    .line 2
    .line 3
    new-instance v1, Lm00;

    .line 4
    .line 5
    sget-wide v2, Lju;->c:J

    .line 6
    .line 7
    sget-wide v4, Lju;->b:J

    .line 8
    .line 9
    const v0, 0x3ec28f5c    # 0.38f

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v4, v5}, Lju;->b(FJ)J

    .line 13
    .line 14
    .line 15
    move-result-wide v8

    .line 16
    invoke-static {v0, v4, v5}, Lju;->b(FJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v10

    .line 20
    move-wide v6, v4

    .line 21
    invoke-direct/range {v1 .. v11}, Lm00;-><init>(JJJJJ)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Lr00;->a:Lm00;

    .line 25
    .line 26
    return-void
.end method

.method public static final a(Lm00;Luh1;Lkw;Lpx;I)V
    .locals 8

    .line 1
    check-cast p3, Lgo0;

    .line 2
    .line 3
    const v0, -0x1f76910f

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p4, 0x6

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p3, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x2

    .line 22
    :goto_0
    or-int/2addr v0, p4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v0, p4

    .line 25
    :goto_1
    and-int/lit8 v1, p4, 0x30

    .line 26
    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    invoke-virtual {p3, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/16 v1, 0x20

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v1, 0x10

    .line 39
    .line 40
    :goto_2
    or-int/2addr v0, v1

    .line 41
    :cond_3
    and-int/lit16 v1, p4, 0x180

    .line 42
    .line 43
    if-nez v1, :cond_5

    .line 44
    .line 45
    invoke-virtual {p3, p2}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    const/16 v1, 0x100

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    const/16 v1, 0x80

    .line 55
    .line 56
    :goto_3
    or-int/2addr v0, v1

    .line 57
    :cond_5
    and-int/lit16 v1, v0, 0x93

    .line 58
    .line 59
    const/16 v2, 0x92

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    const/4 v4, 0x1

    .line 63
    if-eq v1, v2, :cond_6

    .line 64
    .line 65
    move v1, v4

    .line 66
    goto :goto_4

    .line 67
    :cond_6
    move v1, v3

    .line 68
    :goto_4
    and-int/lit8 v2, v0, 0x1

    .line 69
    .line 70
    invoke-virtual {p3, v2, v1}, Lgo0;->O(IZ)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_8

    .line 75
    .line 76
    sget-object v1, Lo00;->a:Lqk;

    .line 77
    .line 78
    const/high16 v1, 0x40800000    # 4.0f

    .line 79
    .line 80
    invoke-static {v1}, Lgb2;->a(F)Lfb2;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const/16 v2, 0x1c

    .line 85
    .line 86
    const/high16 v5, 0x40400000    # 3.0f

    .line 87
    .line 88
    invoke-static {p1, v5, v1, v2}, Lfg1;->O(Luh1;FLeq2;I)Luh1;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iget-wide v5, p0, Lm00;->a:J

    .line 93
    .line 94
    sget-object v2, Lsp0;->h:Liu0;

    .line 95
    .line 96
    invoke-static {v1, v5, v6, v2}, Lgf1;->n(Luh1;JLeq2;)Luh1;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v1}, Lrp0;->q0(Luh1;)Luh1;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    const/4 v2, 0x0

    .line 105
    sget v5, Lo00;->d:F

    .line 106
    .line 107
    invoke-static {v1, v2, v5, v4}, Lfg1;->E(Luh1;FFI)Luh1;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {p3}, Lgf1;->P(Lpx;)Lnl2;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v1, v2}, Lgf1;->b0(Luh1;Lnl2;)Luh1;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    shl-int/lit8 v0, v0, 0x3

    .line 120
    .line 121
    and-int/lit16 v0, v0, 0x1c00

    .line 122
    .line 123
    sget-object v2, Ltp0;->c:Lvf;

    .line 124
    .line 125
    sget-object v5, Lsn;->u:Lpk;

    .line 126
    .line 127
    invoke-static {v2, v5, p3, v3}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iget-wide v5, p3, Lgo0;->T:J

    .line 132
    .line 133
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    invoke-virtual {p3}, Lgo0;->l()Lyy1;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-static {p3, v1}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    sget-object v6, Lhx;->c:Lgx;

    .line 146
    .line 147
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    sget-object v6, Lgx;->b:Ljy;

    .line 151
    .line 152
    invoke-virtual {p3}, Lgo0;->Z()V

    .line 153
    .line 154
    .line 155
    iget-boolean v7, p3, Lgo0;->S:Z

    .line 156
    .line 157
    if-eqz v7, :cond_7

    .line 158
    .line 159
    invoke-virtual {p3, v6}, Lgo0;->k(Lxm0;)V

    .line 160
    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_7
    invoke-virtual {p3}, Lgo0;->i0()V

    .line 164
    .line 165
    .line 166
    :goto_5
    sget-object v6, Lgx;->e:Llc;

    .line 167
    .line 168
    invoke-static {p3, v6, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    sget-object v2, Lgx;->d:Llc;

    .line 172
    .line 173
    invoke-static {p3, v2, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    sget-object v3, Lgx;->f:Llc;

    .line 181
    .line 182
    invoke-static {p3, v3, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    sget-object v2, Lgx;->g:Lv6;

    .line 186
    .line 187
    invoke-static {p3, v2}, Lyf3;->b(Lpx;Lin0;)V

    .line 188
    .line 189
    .line 190
    sget-object v2, Lgx;->c:Llc;

    .line 191
    .line 192
    invoke-static {p3, v2, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    shr-int/lit8 v0, v0, 0x6

    .line 196
    .line 197
    and-int/lit8 v0, v0, 0x70

    .line 198
    .line 199
    or-int/lit8 v0, v0, 0x6

    .line 200
    .line 201
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    sget-object v1, Lbv;->a:Lbv;

    .line 206
    .line 207
    invoke-virtual {p2, v1, p3, v0}, Lkw;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p3, v4}, Lgo0;->p(Z)V

    .line 211
    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_8
    invoke-virtual {p3}, Lgo0;->R()V

    .line 215
    .line 216
    .line 217
    :goto_6
    invoke-virtual {p3}, Lgo0;->r()Lb62;

    .line 218
    .line 219
    .line 220
    move-result-object p3

    .line 221
    if-eqz p3, :cond_9

    .line 222
    .line 223
    new-instance v0, Lva;

    .line 224
    .line 225
    const/4 v5, 0x5

    .line 226
    move-object v1, p0

    .line 227
    move-object v2, p1

    .line 228
    move-object v3, p2

    .line 229
    move v4, p4

    .line 230
    invoke-direct/range {v0 .. v5}, Lva;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lun0;II)V

    .line 231
    .line 232
    .line 233
    iput-object v0, p3, Lb62;->d:Lmn0;

    .line 234
    .line 235
    :cond_9
    return-void
.end method

.method public static final b(Luh1;Lm00;Lin0;Lpx;II)V
    .locals 9

    .line 1
    check-cast p3, Lgo0;

    .line 2
    .line 3
    const v0, -0x2548d191

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p5, 0x1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    or-int/lit8 v1, p4, 0x6

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p3, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v1, 0x2

    .line 25
    :goto_0
    or-int/2addr v1, p4

    .line 26
    :goto_1
    and-int/lit8 v2, p5, 0x2

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    or-int/lit8 v1, v1, 0x30

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_2
    invoke-virtual {p3, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    const/16 v3, 0x20

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    const/16 v3, 0x10

    .line 43
    .line 44
    :goto_2
    or-int/2addr v1, v3

    .line 45
    :goto_3
    invoke-virtual {p3, p2}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    const/16 v3, 0x100

    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_4
    const/16 v3, 0x80

    .line 55
    .line 56
    :goto_4
    or-int/2addr v1, v3

    .line 57
    and-int/lit16 v3, v1, 0x93

    .line 58
    .line 59
    const/16 v4, 0x92

    .line 60
    .line 61
    if-eq v3, v4, :cond_5

    .line 62
    .line 63
    const/4 v3, 0x1

    .line 64
    goto :goto_5

    .line 65
    :cond_5
    const/4 v3, 0x0

    .line 66
    :goto_5
    and-int/lit8 v4, v1, 0x1

    .line 67
    .line 68
    invoke-virtual {p3, v4, v3}, Lgo0;->O(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_8

    .line 73
    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    sget-object p0, Lrh1;->a:Lrh1;

    .line 77
    .line 78
    :cond_6
    if-eqz v2, :cond_7

    .line 79
    .line 80
    sget-object p1, Lr00;->a:Lm00;

    .line 81
    .line 82
    :cond_7
    new-instance v0, Lx;

    .line 83
    .line 84
    const/16 v2, 0x8

    .line 85
    .line 86
    invoke-direct {v0, v2, p2, p1}, Lx;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    const v2, -0xeebf658

    .line 90
    .line 91
    .line 92
    invoke-static {v2, v0, p3}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    shr-int/lit8 v2, v1, 0x3

    .line 97
    .line 98
    and-int/lit8 v2, v2, 0xe

    .line 99
    .line 100
    or-int/lit16 v2, v2, 0x180

    .line 101
    .line 102
    shl-int/lit8 v1, v1, 0x3

    .line 103
    .line 104
    and-int/lit8 v1, v1, 0x70

    .line 105
    .line 106
    or-int/2addr v1, v2

    .line 107
    invoke-static {p1, p0, v0, p3, v1}, Lr00;->a(Lm00;Luh1;Lkw;Lpx;I)V

    .line 108
    .line 109
    .line 110
    :goto_6
    move-object v3, p0

    .line 111
    move-object v4, p1

    .line 112
    goto :goto_7

    .line 113
    :cond_8
    invoke-virtual {p3}, Lgo0;->R()V

    .line 114
    .line 115
    .line 116
    goto :goto_6

    .line 117
    :goto_7
    invoke-virtual {p3}, Lgo0;->r()Lb62;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-eqz p0, :cond_9

    .line 122
    .line 123
    new-instance v2, Lva;

    .line 124
    .line 125
    const/4 v8, 0x4

    .line 126
    move-object v5, p2

    .line 127
    move v6, p4

    .line 128
    move v7, p5

    .line 129
    invoke-direct/range {v2 .. v8}, Lva;-><init>(Luh1;Ljava/lang/Object;Ljava/lang/Object;III)V

    .line 130
    .line 131
    .line 132
    iput-object v2, p0, Lb62;->d:Lmn0;

    .line 133
    .line 134
    :cond_9
    return-void
.end method

.method public static final c(Ljava/lang/String;ZLm00;Luh1;Lnn0;Lxm0;Lpx;I)V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v10, p1

    .line 4
    .line 5
    move-object/from16 v11, p2

    .line 6
    .line 7
    move-object/from16 v12, p3

    .line 8
    .line 9
    move-object/from16 v13, p4

    .line 10
    .line 11
    move-object/from16 v14, p5

    .line 12
    .line 13
    move/from16 v15, p7

    .line 14
    .line 15
    move-object/from16 v7, p6

    .line 16
    .line 17
    check-cast v7, Lgo0;

    .line 18
    .line 19
    const v1, -0x774762b3

    .line 20
    .line 21
    .line 22
    invoke-virtual {v7, v1}, Lgo0;->X(I)Lgo0;

    .line 23
    .line 24
    .line 25
    and-int/lit8 v1, v15, 0x6

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v7, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v1, v2

    .line 39
    :goto_0
    or-int/2addr v1, v15

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v1, v15

    .line 42
    :goto_1
    and-int/lit8 v3, v15, 0x30

    .line 43
    .line 44
    const/16 v4, 0x20

    .line 45
    .line 46
    if-nez v3, :cond_3

    .line 47
    .line 48
    invoke-virtual {v7, v10}, Lgo0;->g(Z)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    move v3, v4

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v3, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v1, v3

    .line 59
    :cond_3
    and-int/lit16 v3, v15, 0x180

    .line 60
    .line 61
    if-nez v3, :cond_5

    .line 62
    .line 63
    invoke-virtual {v7, v11}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    const/16 v3, 0x100

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    const/16 v3, 0x80

    .line 73
    .line 74
    :goto_3
    or-int/2addr v1, v3

    .line 75
    :cond_5
    and-int/lit16 v3, v15, 0xc00

    .line 76
    .line 77
    if-nez v3, :cond_7

    .line 78
    .line 79
    invoke-virtual {v7, v12}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_6

    .line 84
    .line 85
    const/16 v3, 0x800

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_6
    const/16 v3, 0x400

    .line 89
    .line 90
    :goto_4
    or-int/2addr v1, v3

    .line 91
    :cond_7
    and-int/lit16 v3, v15, 0x6000

    .line 92
    .line 93
    if-nez v3, :cond_9

    .line 94
    .line 95
    invoke-virtual {v7, v13}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_8

    .line 100
    .line 101
    const/16 v3, 0x4000

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_8
    const/16 v3, 0x2000

    .line 105
    .line 106
    :goto_5
    or-int/2addr v1, v3

    .line 107
    :cond_9
    const/high16 v3, 0x30000

    .line 108
    .line 109
    and-int/2addr v3, v15

    .line 110
    const/high16 v5, 0x20000

    .line 111
    .line 112
    if-nez v3, :cond_b

    .line 113
    .line 114
    invoke-virtual {v7, v14}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_a

    .line 119
    .line 120
    move v3, v5

    .line 121
    goto :goto_6

    .line 122
    :cond_a
    const/high16 v3, 0x10000

    .line 123
    .line 124
    :goto_6
    or-int/2addr v1, v3

    .line 125
    :cond_b
    const v3, 0x12493

    .line 126
    .line 127
    .line 128
    and-int/2addr v3, v1

    .line 129
    const v6, 0x12492

    .line 130
    .line 131
    .line 132
    if-eq v3, v6, :cond_c

    .line 133
    .line 134
    const/4 v3, 0x1

    .line 135
    goto :goto_7

    .line 136
    :cond_c
    const/4 v3, 0x0

    .line 137
    :goto_7
    and-int/lit8 v6, v1, 0x1

    .line 138
    .line 139
    invoke-virtual {v7, v6, v3}, Lgo0;->O(IZ)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_16

    .line 144
    .line 145
    sget-object v3, Lo00;->a:Lqk;

    .line 146
    .line 147
    sget v6, Lo00;->c:F

    .line 148
    .line 149
    new-instance v9, Lxf;

    .line 150
    .line 151
    new-instance v8, Ls;

    .line 152
    .line 153
    invoke-direct {v8, v2}, Ls;-><init>(I)V

    .line 154
    .line 155
    .line 156
    invoke-direct {v9, v6, v8}, Lxf;-><init>(FLs;)V

    .line 157
    .line 158
    .line 159
    and-int/lit8 v8, v1, 0x70

    .line 160
    .line 161
    if-ne v8, v4, :cond_d

    .line 162
    .line 163
    const/4 v4, 0x1

    .line 164
    goto :goto_8

    .line 165
    :cond_d
    const/4 v4, 0x0

    .line 166
    :goto_8
    const/high16 v8, 0x70000

    .line 167
    .line 168
    and-int/2addr v8, v1

    .line 169
    if-ne v8, v5, :cond_e

    .line 170
    .line 171
    const/4 v5, 0x1

    .line 172
    goto :goto_9

    .line 173
    :cond_e
    const/4 v5, 0x0

    .line 174
    :goto_9
    or-int/2addr v4, v5

    .line 175
    invoke-virtual {v7}, Lgo0;->L()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    if-nez v4, :cond_f

    .line 180
    .line 181
    sget-object v4, Lnx;->a:Leb;

    .line 182
    .line 183
    if-ne v5, v4, :cond_10

    .line 184
    .line 185
    :cond_f
    new-instance v5, Lp00;

    .line 186
    .line 187
    const/4 v4, 0x0

    .line 188
    invoke-direct {v5, v4, v14, v10}, Lp00;-><init>(ILjava/lang/Object;Z)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v7, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :cond_10
    check-cast v5, Lxm0;

    .line 195
    .line 196
    invoke-static {v12, v10, v0, v5}, Lte;->s(Luh1;ZLjava/lang/String;Lxm0;)Luh1;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    sget-object v5, Lte;->e:Lyi0;

    .line 201
    .line 202
    invoke-interface {v4, v5}, Luh1;->c(Luh1;)Luh1;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    new-instance v16, Lkr2;

    .line 207
    .line 208
    const/16 v21, 0x1

    .line 209
    .line 210
    const/high16 v17, 0x42e00000    # 112.0f

    .line 211
    .line 212
    const/high16 v18, 0x42400000    # 48.0f

    .line 213
    .line 214
    const/high16 v19, 0x438c0000    # 280.0f

    .line 215
    .line 216
    const/high16 v20, 0x42400000    # 48.0f

    .line 217
    .line 218
    invoke-direct/range {v16 .. v21}, Lkr2;-><init>(FFFFZ)V

    .line 219
    .line 220
    .line 221
    move-object/from16 v5, v16

    .line 222
    .line 223
    invoke-interface {v4, v5}, Luh1;->c(Luh1;)Luh1;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    const/4 v5, 0x0

    .line 228
    invoke-static {v4, v6, v5, v2}, Lfg1;->E(Luh1;FFI)Luh1;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    const/16 v4, 0x36

    .line 233
    .line 234
    invoke-static {v9, v3, v7, v4}, Lnb2;->a(Lwf;Lqk;Lpx;I)Lob2;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    iget-wide v4, v7, Lgo0;->T:J

    .line 239
    .line 240
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    invoke-virtual {v7}, Lgo0;->l()Lyy1;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    invoke-static {v7, v2}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    sget-object v6, Lhx;->c:Lgx;

    .line 253
    .line 254
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    sget-object v6, Lgx;->b:Ljy;

    .line 258
    .line 259
    invoke-virtual {v7}, Lgo0;->Z()V

    .line 260
    .line 261
    .line 262
    iget-boolean v8, v7, Lgo0;->S:Z

    .line 263
    .line 264
    if-eqz v8, :cond_11

    .line 265
    .line 266
    invoke-virtual {v7, v6}, Lgo0;->k(Lxm0;)V

    .line 267
    .line 268
    .line 269
    goto :goto_a

    .line 270
    :cond_11
    invoke-virtual {v7}, Lgo0;->i0()V

    .line 271
    .line 272
    .line 273
    :goto_a
    sget-object v8, Lgx;->e:Llc;

    .line 274
    .line 275
    invoke-static {v7, v8, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    sget-object v3, Lgx;->d:Llc;

    .line 279
    .line 280
    invoke-static {v7, v3, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    sget-object v5, Lgx;->f:Llc;

    .line 288
    .line 289
    invoke-static {v7, v5, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    sget-object v4, Lgx;->g:Lv6;

    .line 293
    .line 294
    invoke-static {v7, v4}, Lyf3;->b(Lpx;Lin0;)V

    .line 295
    .line 296
    .line 297
    sget-object v9, Lgx;->c:Llc;

    .line 298
    .line 299
    invoke-static {v7, v9, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    if-nez v13, :cond_12

    .line 303
    .line 304
    const v2, -0x5f3ebcd6

    .line 305
    .line 306
    .line 307
    invoke-virtual {v7, v2}, Lgo0;->W(I)V

    .line 308
    .line 309
    .line 310
    const/4 v4, 0x0

    .line 311
    invoke-virtual {v7, v4}, Lgo0;->p(Z)V

    .line 312
    .line 313
    .line 314
    move/from16 v16, v1

    .line 315
    .line 316
    goto :goto_d

    .line 317
    :cond_12
    const v2, -0x5f3ebcd5

    .line 318
    .line 319
    .line 320
    invoke-virtual {v7, v2}, Lgo0;->W(I)V

    .line 321
    .line 322
    .line 323
    sget v17, Lo00;->e:F

    .line 324
    .line 325
    const/16 v18, 0x0

    .line 326
    .line 327
    const/16 v21, 0x2

    .line 328
    .line 329
    sget-object v16, Lrh1;->a:Lrh1;

    .line 330
    .line 331
    move/from16 v19, v17

    .line 332
    .line 333
    move/from16 v20, v17

    .line 334
    .line 335
    invoke-static/range {v16 .. v21}, Lte;->b0(Luh1;FFFFI)Luh1;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    sget-object v0, Lsn;->j:Lrk;

    .line 340
    .line 341
    move/from16 v16, v1

    .line 342
    .line 343
    const/4 v1, 0x0

    .line 344
    invoke-static {v0, v1}, Ldm;->d(Lr5;Z)Lnf1;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    iget-wide v14, v7, Lgo0;->T:J

    .line 349
    .line 350
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    invoke-virtual {v7}, Lgo0;->l()Lyy1;

    .line 355
    .line 356
    .line 357
    move-result-object v14

    .line 358
    invoke-static {v7, v2}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    invoke-virtual {v7}, Lgo0;->Z()V

    .line 363
    .line 364
    .line 365
    iget-boolean v15, v7, Lgo0;->S:Z

    .line 366
    .line 367
    if-eqz v15, :cond_13

    .line 368
    .line 369
    invoke-virtual {v7, v6}, Lgo0;->k(Lxm0;)V

    .line 370
    .line 371
    .line 372
    goto :goto_b

    .line 373
    :cond_13
    invoke-virtual {v7}, Lgo0;->i0()V

    .line 374
    .line 375
    .line 376
    :goto_b
    invoke-static {v7, v8, v0}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    invoke-static {v7, v3, v14}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    invoke-static {v1, v7, v5, v7, v4}, Lvi0;->q(ILgo0;Llc;Lgo0;Lv6;)V

    .line 383
    .line 384
    .line 385
    invoke-static {v7, v9, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    if-eqz v10, :cond_14

    .line 389
    .line 390
    iget-wide v0, v11, Lm00;->c:J

    .line 391
    .line 392
    goto :goto_c

    .line 393
    :cond_14
    iget-wide v0, v11, Lm00;->e:J

    .line 394
    .line 395
    :goto_c
    new-instance v2, Lju;

    .line 396
    .line 397
    invoke-direct {v2, v0, v1}, Lju;-><init>(J)V

    .line 398
    .line 399
    .line 400
    const/4 v4, 0x0

    .line 401
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-interface {v13, v2, v7, v0}, Lnn0;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    const/4 v0, 0x1

    .line 409
    invoke-virtual {v7, v0}, Lgo0;->p(Z)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v7, v4}, Lgo0;->p(Z)V

    .line 413
    .line 414
    .line 415
    :goto_d
    if-eqz v10, :cond_15

    .line 416
    .line 417
    iget-wide v0, v11, Lm00;->b:J

    .line 418
    .line 419
    :goto_e
    move-wide/from16 v18, v0

    .line 420
    .line 421
    goto :goto_f

    .line 422
    :cond_15
    iget-wide v0, v11, Lm00;->d:J

    .line 423
    .line 424
    goto :goto_e

    .line 425
    :goto_f
    sget v25, Lo00;->b:I

    .line 426
    .line 427
    sget-wide v20, Lo00;->h:J

    .line 428
    .line 429
    sget-object v22, Lo00;->i:Lim0;

    .line 430
    .line 431
    sget-wide v26, Lo00;->j:J

    .line 432
    .line 433
    sget-wide v23, Lo00;->k:J

    .line 434
    .line 435
    new-instance v17, Lm13;

    .line 436
    .line 437
    const/16 v29, 0x0

    .line 438
    .line 439
    const v30, 0xfd7f78

    .line 440
    .line 441
    .line 442
    const/16 v28, 0x0

    .line 443
    .line 444
    invoke-direct/range {v17 .. v30}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 445
    .line 446
    .line 447
    new-instance v1, Lg71;

    .line 448
    .line 449
    const/high16 v0, 0x3f800000    # 1.0f

    .line 450
    .line 451
    const/4 v2, 0x1

    .line 452
    invoke-direct {v1, v0, v2}, Lg71;-><init>(FZ)V

    .line 453
    .line 454
    .line 455
    and-int/lit8 v0, v16, 0xe

    .line 456
    .line 457
    const/high16 v3, 0x180000

    .line 458
    .line 459
    or-int v8, v0, v3

    .line 460
    .line 461
    const/16 v9, 0x3b8

    .line 462
    .line 463
    const/4 v3, 0x0

    .line 464
    const/4 v4, 0x0

    .line 465
    const/4 v5, 0x1

    .line 466
    const/4 v6, 0x0

    .line 467
    move-object/from16 v0, p0

    .line 468
    .line 469
    move v14, v2

    .line 470
    move-object/from16 v2, v17

    .line 471
    .line 472
    invoke-static/range {v0 .. v9}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v7, v14}, Lgo0;->p(Z)V

    .line 476
    .line 477
    .line 478
    goto :goto_10

    .line 479
    :cond_16
    invoke-virtual {v7}, Lgo0;->R()V

    .line 480
    .line 481
    .line 482
    :goto_10
    invoke-virtual {v7}, Lgo0;->r()Lb62;

    .line 483
    .line 484
    .line 485
    move-result-object v8

    .line 486
    if-eqz v8, :cond_17

    .line 487
    .line 488
    new-instance v0, Lq00;

    .line 489
    .line 490
    move-object/from16 v1, p0

    .line 491
    .line 492
    move-object/from16 v6, p5

    .line 493
    .line 494
    move/from16 v7, p7

    .line 495
    .line 496
    move v2, v10

    .line 497
    move-object v3, v11

    .line 498
    move-object v4, v12

    .line 499
    move-object v5, v13

    .line 500
    invoke-direct/range {v0 .. v7}, Lq00;-><init>(Ljava/lang/String;ZLm00;Luh1;Lnn0;Lxm0;I)V

    .line 501
    .line 502
    .line 503
    iput-object v0, v8, Lb62;->d:Lmn0;

    .line 504
    .line 505
    :cond_17
    return-void
.end method
