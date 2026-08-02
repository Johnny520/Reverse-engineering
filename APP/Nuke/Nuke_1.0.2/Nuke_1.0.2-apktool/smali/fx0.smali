.class public abstract Lfx0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Luh1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lrh1;->a:Lrh1;

    .line 2
    .line 3
    sget v1, Lte;->i:F

    .line 4
    .line 5
    invoke-static {v0, v1}, Lte;->g0(Luh1;F)Luh1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lfx0;->a:Luh1;

    .line 10
    .line 11
    return-void
.end method

.method public static final a(Lsx0;Luh1;JLpx;I)V
    .locals 12

    .line 1
    move/from16 v5, p5

    .line 2
    .line 3
    move-object/from16 v10, p4

    .line 4
    .line 5
    check-cast v10, Lgo0;

    .line 6
    .line 7
    const v0, -0x79033cc

    .line 8
    .line 9
    .line 10
    invoke-virtual {v10, v0}, Lgo0;->X(I)Lgo0;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v0, v5, 0x6

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v10, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x2

    .line 26
    :goto_0
    or-int/2addr v0, v5

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v0, v5

    .line 29
    :goto_1
    and-int/lit8 v1, v5, 0x30

    .line 30
    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v10, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const/16 v1, 0x20

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const/16 v1, 0x10

    .line 44
    .line 45
    :goto_2
    or-int/2addr v0, v1

    .line 46
    :cond_3
    and-int/lit16 v1, v5, 0x180

    .line 47
    .line 48
    if-nez v1, :cond_5

    .line 49
    .line 50
    invoke-virtual {v10, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    const/16 v1, 0x100

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_4
    const/16 v1, 0x80

    .line 60
    .line 61
    :goto_3
    or-int/2addr v0, v1

    .line 62
    :cond_5
    and-int/lit16 v1, v5, 0xc00

    .line 63
    .line 64
    if-nez v1, :cond_7

    .line 65
    .line 66
    invoke-virtual {v10, p2, p3}, Lgo0;->e(J)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_6

    .line 71
    .line 72
    const/16 v1, 0x800

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_6
    const/16 v1, 0x400

    .line 76
    .line 77
    :goto_4
    or-int/2addr v0, v1

    .line 78
    :cond_7
    and-int/lit16 v1, v0, 0x493

    .line 79
    .line 80
    const/16 v2, 0x492

    .line 81
    .line 82
    if-eq v1, v2, :cond_8

    .line 83
    .line 84
    const/4 v1, 0x1

    .line 85
    goto :goto_5

    .line 86
    :cond_8
    const/4 v1, 0x0

    .line 87
    :goto_5
    and-int/lit8 v2, v0, 0x1

    .line 88
    .line 89
    invoke-virtual {v10, v2, v1}, Lgo0;->O(IZ)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_b

    .line 94
    .line 95
    invoke-virtual {v10}, Lgo0;->T()V

    .line 96
    .line 97
    .line 98
    and-int/lit8 v1, v5, 0x1

    .line 99
    .line 100
    if-eqz v1, :cond_a

    .line 101
    .line 102
    invoke-virtual {v10}, Lgo0;->y()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_9

    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_9
    invoke-virtual {v10}, Lgo0;->R()V

    .line 110
    .line 111
    .line 112
    :cond_a
    :goto_6
    invoke-virtual {v10}, Lgo0;->q()V

    .line 113
    .line 114
    .line 115
    invoke-static {p0, v10}, Lv93;->c(Lsx0;Lpx;)Lu93;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    and-int/lit8 v1, v0, 0x70

    .line 120
    .line 121
    const/16 v2, 0x8

    .line 122
    .line 123
    or-int/2addr v1, v2

    .line 124
    and-int/lit16 v2, v0, 0x380

    .line 125
    .line 126
    or-int/2addr v1, v2

    .line 127
    and-int/lit16 v0, v0, 0x1c00

    .line 128
    .line 129
    or-int v11, v1, v0

    .line 130
    .line 131
    move-object v7, p1

    .line 132
    move-wide v8, p2

    .line 133
    invoke-static/range {v6 .. v11}, Lfx0;->b(Llw1;Luh1;JLpx;I)V

    .line 134
    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_b
    invoke-virtual {v10}, Lgo0;->R()V

    .line 138
    .line 139
    .line 140
    :goto_7
    invoke-virtual {v10}, Lgo0;->r()Lb62;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    if-eqz v7, :cond_c

    .line 145
    .line 146
    new-instance v0, Let0;

    .line 147
    .line 148
    const/4 v6, 0x1

    .line 149
    move-object v1, p0

    .line 150
    move-object v2, p1

    .line 151
    move-wide v3, p2

    .line 152
    invoke-direct/range {v0 .. v6}, Let0;-><init>(Ljava/lang/Object;Luh1;JII)V

    .line 153
    .line 154
    .line 155
    iput-object v0, v7, Lb62;->d:Lmn0;

    .line 156
    .line 157
    :cond_c
    return-void
.end method

.method public static final b(Llw1;Luh1;JLpx;I)V
    .locals 9

    .line 1
    check-cast p4, Lgo0;

    .line 2
    .line 3
    const v0, -0x7faffaf9

    .line 4
    .line 5
    .line 6
    invoke-virtual {p4, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p5, 0x6

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p4, p0}, Lgo0;->h(Ljava/lang/Object;)Z

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
    or-int/2addr v0, p5

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v0, p5

    .line 25
    :goto_1
    and-int/lit8 v1, p5, 0x30

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/16 v3, 0x20

    .line 29
    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    invoke-virtual {p4, v2}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    move v1, v3

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    const/16 v1, 0x10

    .line 41
    .line 42
    :goto_2
    or-int/2addr v0, v1

    .line 43
    :cond_3
    and-int/lit16 v1, p5, 0x180

    .line 44
    .line 45
    if-nez v1, :cond_5

    .line 46
    .line 47
    invoke-virtual {p4, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    const/16 v1, 0x100

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_4
    const/16 v1, 0x80

    .line 57
    .line 58
    :goto_3
    or-int/2addr v0, v1

    .line 59
    :cond_5
    and-int/lit16 v1, p5, 0xc00

    .line 60
    .line 61
    const/16 v4, 0x800

    .line 62
    .line 63
    if-nez v1, :cond_7

    .line 64
    .line 65
    invoke-virtual {p4, p2, p3}, Lgo0;->e(J)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_6

    .line 70
    .line 71
    move v1, v4

    .line 72
    goto :goto_4

    .line 73
    :cond_6
    const/16 v1, 0x400

    .line 74
    .line 75
    :goto_4
    or-int/2addr v0, v1

    .line 76
    :cond_7
    and-int/lit16 v1, v0, 0x493

    .line 77
    .line 78
    const/16 v5, 0x492

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    const/4 v7, 0x1

    .line 82
    if-eq v1, v5, :cond_8

    .line 83
    .line 84
    move v1, v7

    .line 85
    goto :goto_5

    .line 86
    :cond_8
    move v1, v6

    .line 87
    :goto_5
    and-int/lit8 v5, v0, 0x1

    .line 88
    .line 89
    invoke-virtual {p4, v5, v1}, Lgo0;->O(IZ)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_13

    .line 94
    .line 95
    invoke-virtual {p4}, Lgo0;->T()V

    .line 96
    .line 97
    .line 98
    and-int/lit8 v1, p5, 0x1

    .line 99
    .line 100
    if-eqz v1, :cond_a

    .line 101
    .line 102
    invoke-virtual {p4}, Lgo0;->y()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_9

    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_9
    invoke-virtual {p4}, Lgo0;->R()V

    .line 110
    .line 111
    .line 112
    :cond_a
    :goto_6
    invoke-virtual {p4}, Lgo0;->q()V

    .line 113
    .line 114
    .line 115
    and-int/lit16 v1, v0, 0x1c00

    .line 116
    .line 117
    xor-int/lit16 v1, v1, 0xc00

    .line 118
    .line 119
    if-le v1, v4, :cond_b

    .line 120
    .line 121
    invoke-virtual {p4, p2, p3}, Lgo0;->e(J)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_d

    .line 126
    .line 127
    :cond_b
    and-int/lit16 v0, v0, 0xc00

    .line 128
    .line 129
    if-ne v0, v4, :cond_c

    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_c
    move v7, v6

    .line 133
    :cond_d
    :goto_7
    invoke-virtual {p4}, Lgo0;->L()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-nez v7, :cond_e

    .line 138
    .line 139
    sget-object v1, Lnx;->a:Leb;

    .line 140
    .line 141
    if-ne v0, v1, :cond_10

    .line 142
    .line 143
    :cond_e
    sget-wide v0, Lju;->g:J

    .line 144
    .line 145
    invoke-static {p2, p3, v0, v1}, Lju;->c(JJ)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_f

    .line 150
    .line 151
    goto :goto_8

    .line 152
    :cond_f
    new-instance v2, Lcl;

    .line 153
    .line 154
    const/4 v0, 0x5

    .line 155
    invoke-direct {v2, p2, p3, v0}, Lcl;-><init>(JI)V

    .line 156
    .line 157
    .line 158
    :goto_8
    invoke-virtual {p4, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    move-object v0, v2

    .line 162
    :cond_10
    check-cast v0, Lcl;

    .line 163
    .line 164
    const v1, -0x1fff68c5

    .line 165
    .line 166
    .line 167
    invoke-virtual {p4, v1}, Lgo0;->W(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p4, v6}, Lgo0;->p(Z)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Llw1;->d()J

    .line 174
    .line 175
    .line 176
    move-result-wide v1

    .line 177
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    invoke-static {v1, v2, v4, v5}, Lgr2;->a(JJ)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    sget-object v2, Lrh1;->a:Lrh1;

    .line 187
    .line 188
    if-nez v1, :cond_12

    .line 189
    .line 190
    invoke-virtual {p0}, Llw1;->d()J

    .line 191
    .line 192
    .line 193
    move-result-wide v4

    .line 194
    shr-long v7, v4, v3

    .line 195
    .line 196
    long-to-int v1, v7

    .line 197
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-static {v1}, Ljava/lang/Float;->isInfinite(F)Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-eqz v1, :cond_11

    .line 206
    .line 207
    const-wide v7, 0xffffffffL

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    and-long v3, v4, v7

    .line 213
    .line 214
    long-to-int v1, v3

    .line 215
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    invoke-static {v1}, Ljava/lang/Float;->isInfinite(F)Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-eqz v1, :cond_11

    .line 224
    .line 225
    goto :goto_9

    .line 226
    :cond_11
    move-object v1, v2

    .line 227
    goto :goto_a

    .line 228
    :cond_12
    :goto_9
    sget-object v1, Lfx0;->a:Luh1;

    .line 229
    .line 230
    :goto_a
    invoke-interface {p1, v1}, Luh1;->c(Luh1;)Luh1;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-static {v1, p0, v0}, Lxe1;->Z(Luh1;Llw1;Lcl;)Luh1;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-interface {v0, v2}, Luh1;->c(Luh1;)Luh1;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-static {v0, p4, v6}, Ldm;->a(Luh1;Lpx;I)V

    .line 243
    .line 244
    .line 245
    goto :goto_b

    .line 246
    :cond_13
    invoke-virtual {p4}, Lgo0;->R()V

    .line 247
    .line 248
    .line 249
    :goto_b
    invoke-virtual {p4}, Lgo0;->r()Lb62;

    .line 250
    .line 251
    .line 252
    move-result-object p4

    .line 253
    if-eqz p4, :cond_14

    .line 254
    .line 255
    new-instance v0, Let0;

    .line 256
    .line 257
    const/4 v6, 0x2

    .line 258
    move-object v1, p0

    .line 259
    move-object v2, p1

    .line 260
    move-wide v3, p2

    .line 261
    move v5, p5

    .line 262
    invoke-direct/range {v0 .. v6}, Let0;-><init>(Ljava/lang/Object;Luh1;JII)V

    .line 263
    .line 264
    .line 265
    iput-object v0, p4, Lb62;->d:Lmn0;

    .line 266
    .line 267
    :cond_14
    return-void
.end method
