.class public abstract Lff1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ltu2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln31;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ln31;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lp7;->C(Lxm0;)Lhx2;

    .line 9
    .line 10
    .line 11
    new-instance v0, Ln31;

    .line 12
    .line 13
    const/16 v1, 0xc

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ln31;-><init>(I)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Ltu2;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Le42;-><init>(Lxm0;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lff1;->a:Ltu2;

    .line 24
    .line 25
    return-void
.end method

.method public static final a(Lpu;Lli1;Lhq2;Lo63;Lkw;Lpx;I)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move/from16 v6, p6

    .line 12
    .line 13
    move-object/from16 v0, p5

    .line 14
    .line 15
    check-cast v0, Lgo0;

    .line 16
    .line 17
    const v7, 0x35e9c094

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v7}, Lgo0;->X(I)Lgo0;

    .line 21
    .line 22
    .line 23
    and-int/lit8 v7, v6, 0x6

    .line 24
    .line 25
    if-nez v7, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_0

    .line 32
    .line 33
    const/4 v7, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v7, 0x2

    .line 36
    :goto_0
    or-int/2addr v7, v6

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v7, v6

    .line 39
    :goto_1
    and-int/lit8 v8, v6, 0x30

    .line 40
    .line 41
    if-nez v8, :cond_3

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    if-eqz v8, :cond_2

    .line 48
    .line 49
    const/16 v8, 0x20

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v8, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v7, v8

    .line 55
    :cond_3
    and-int/lit16 v8, v6, 0x180

    .line 56
    .line 57
    if-nez v8, :cond_5

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v8, :cond_4

    .line 64
    .line 65
    const/16 v8, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v8, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v7, v8

    .line 71
    :cond_5
    and-int/lit16 v8, v6, 0xc00

    .line 72
    .line 73
    if-nez v8, :cond_7

    .line 74
    .line 75
    invoke-virtual {v0, v4}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_6

    .line 80
    .line 81
    const/16 v8, 0x800

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_6
    const/16 v8, 0x400

    .line 85
    .line 86
    :goto_4
    or-int/2addr v7, v8

    .line 87
    :cond_7
    and-int/lit16 v8, v6, 0x6000

    .line 88
    .line 89
    if-nez v8, :cond_9

    .line 90
    .line 91
    invoke-virtual {v0, v5}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_8

    .line 96
    .line 97
    const/16 v8, 0x4000

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_8
    const/16 v8, 0x2000

    .line 101
    .line 102
    :goto_5
    or-int/2addr v7, v8

    .line 103
    :cond_9
    and-int/lit16 v8, v7, 0x2493

    .line 104
    .line 105
    const/16 v9, 0x2492

    .line 106
    .line 107
    const/4 v10, 0x1

    .line 108
    if-eq v8, v9, :cond_a

    .line 109
    .line 110
    move v8, v10

    .line 111
    goto :goto_6

    .line 112
    :cond_a
    const/4 v8, 0x0

    .line 113
    :goto_6
    and-int/2addr v7, v10

    .line 114
    invoke-virtual {v0, v7, v8}, Lgo0;->O(IZ)Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-eqz v7, :cond_10

    .line 119
    .line 120
    invoke-virtual {v0}, Lgo0;->T()V

    .line 121
    .line 122
    .line 123
    and-int/lit8 v7, v6, 0x1

    .line 124
    .line 125
    if-eqz v7, :cond_c

    .line 126
    .line 127
    invoke-virtual {v0}, Lgo0;->y()Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-eqz v7, :cond_b

    .line 132
    .line 133
    goto :goto_7

    .line 134
    :cond_b
    invoke-virtual {v0}, Lgo0;->R()V

    .line 135
    .line 136
    .line 137
    :cond_c
    :goto_7
    invoke-virtual {v0}, Lgo0;->q()V

    .line 138
    .line 139
    .line 140
    sget-object v7, Lsa2;->a:Lmy;

    .line 141
    .line 142
    sget-wide v7, Lju;->g:J

    .line 143
    .line 144
    const/high16 v9, 0x7fc00000    # Float.NaN

    .line 145
    .line 146
    invoke-static {v9, v9}, Lza0;->b(FF)Z

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-eqz v9, :cond_d

    .line 151
    .line 152
    invoke-static {v7, v8, v7, v8}, Lju;->c(JJ)Z

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    if-eqz v9, :cond_d

    .line 157
    .line 158
    sget-object v7, Lsa2;->b:Lua2;

    .line 159
    .line 160
    goto :goto_8

    .line 161
    :cond_d
    new-instance v9, Lua2;

    .line 162
    .line 163
    invoke-direct {v9, v7, v8, v10}, Lua2;-><init>(JZ)V

    .line 164
    .line 165
    .line 166
    move-object v7, v9

    .line 167
    :goto_8
    iget-wide v8, v1, Lpu;->a:J

    .line 168
    .line 169
    invoke-virtual {v0, v8, v9}, Lgo0;->e(J)Z

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    if-nez v10, :cond_e

    .line 178
    .line 179
    sget-object v10, Lnx;->a:Leb;

    .line 180
    .line 181
    if-ne v11, v10, :cond_f

    .line 182
    .line 183
    :cond_e
    new-instance v11, Lg13;

    .line 184
    .line 185
    const v10, 0x3ecccccd    # 0.4f

    .line 186
    .line 187
    .line 188
    invoke-static {v10, v8, v9}, Lju;->b(FJ)J

    .line 189
    .line 190
    .line 191
    move-result-wide v12

    .line 192
    invoke-direct {v11, v8, v9, v12, v13}, Lg13;-><init>(JJ)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v11}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_f
    check-cast v11, Lg13;

    .line 199
    .line 200
    sget-object v8, Lru;->a:Ltu2;

    .line 201
    .line 202
    invoke-virtual {v8, v1}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 203
    .line 204
    .line 205
    move-result-object v12

    .line 206
    sget-object v8, Lff1;->a:Ltu2;

    .line 207
    .line 208
    invoke-virtual {v8, v2}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 209
    .line 210
    .line 211
    move-result-object v13

    .line 212
    sget-object v8, Lly0;->a:Lmy;

    .line 213
    .line 214
    invoke-virtual {v8, v7}, Lmy;->a(Ljava/lang/Object;)Lf42;

    .line 215
    .line 216
    .line 217
    move-result-object v14

    .line 218
    sget-object v7, Liq2;->a:Ltu2;

    .line 219
    .line 220
    invoke-virtual {v7, v3}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 221
    .line 222
    .line 223
    move-result-object v15

    .line 224
    sget-object v7, Lh13;->a:Lmy;

    .line 225
    .line 226
    invoke-virtual {v7, v11}, Lmy;->a(Ljava/lang/Object;)Lf42;

    .line 227
    .line 228
    .line 229
    move-result-object v16

    .line 230
    sget-object v7, Lp63;->a:Ltu2;

    .line 231
    .line 232
    invoke-virtual {v7, v4}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 233
    .line 234
    .line 235
    move-result-object v17

    .line 236
    filled-new-array/range {v12 .. v17}, [Lf42;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    new-instance v8, Lef1;

    .line 241
    .line 242
    invoke-direct {v8, v4, v5}, Lef1;-><init>(Lo63;Lkw;)V

    .line 243
    .line 244
    .line 245
    const v9, -0x68571c2c

    .line 246
    .line 247
    .line 248
    invoke-static {v9, v8, v0}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    const/16 v9, 0x38

    .line 253
    .line 254
    invoke-static {v7, v8, v0, v9}, Lci0;->b([Lf42;Lmn0;Lpx;I)V

    .line 255
    .line 256
    .line 257
    goto :goto_9

    .line 258
    :cond_10
    invoke-virtual {v0}, Lgo0;->R()V

    .line 259
    .line 260
    .line 261
    :goto_9
    invoke-virtual {v0}, Lgo0;->r()Lb62;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    if-eqz v7, :cond_11

    .line 266
    .line 267
    new-instance v0, Ldf1;

    .line 268
    .line 269
    invoke-direct/range {v0 .. v6}, Ldf1;-><init>(Lpu;Lli1;Lhq2;Lo63;Lkw;I)V

    .line 270
    .line 271
    .line 272
    iput-object v0, v7, Lb62;->d:Lmn0;

    .line 273
    .line 274
    :cond_11
    return-void
.end method

.method public static final b(Lpu;Lhq2;Lo63;Lkw;Lpx;I)V
    .locals 13

    .line 1
    move-object/from16 v5, p4

    .line 2
    .line 3
    check-cast v5, Lgo0;

    .line 4
    .line 5
    const v0, -0x1ace2e0b

    .line 6
    .line 7
    .line 8
    invoke-virtual {v5, v0}, Lgo0;->X(I)Lgo0;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v5, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x2

    .line 20
    :goto_0
    or-int v1, p5, v1

    .line 21
    .line 22
    or-int/lit8 v1, v1, 0x10

    .line 23
    .line 24
    invoke-virtual {v5, p2}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const/16 v2, 0x100

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/16 v2, 0x80

    .line 34
    .line 35
    :goto_1
    or-int/2addr v1, v2

    .line 36
    and-int/lit16 v2, v1, 0x493

    .line 37
    .line 38
    const/16 v4, 0x492

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/4 v2, 0x0

    .line 45
    :goto_2
    and-int/lit8 v4, v1, 0x1

    .line 46
    .line 47
    invoke-virtual {v5, v4, v2}, Lgo0;->O(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_5

    .line 52
    .line 53
    invoke-virtual {v5}, Lgo0;->T()V

    .line 54
    .line 55
    .line 56
    and-int/lit8 v2, p5, 0x1

    .line 57
    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    invoke-virtual {v5}, Lgo0;->y()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-virtual {v5}, Lgo0;->R()V

    .line 68
    .line 69
    .line 70
    and-int/lit8 v1, v1, -0x71

    .line 71
    .line 72
    move-object v2, p1

    .line 73
    goto :goto_4

    .line 74
    :cond_4
    :goto_3
    sget-object v2, Liq2;->a:Ltu2;

    .line 75
    .line 76
    invoke-virtual {v5, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Lhq2;

    .line 81
    .line 82
    and-int/lit8 v1, v1, -0x71

    .line 83
    .line 84
    :goto_4
    invoke-virtual {v5}, Lgo0;->q()V

    .line 85
    .line 86
    .line 87
    sget-object v4, Lff1;->a:Ltu2;

    .line 88
    .line 89
    invoke-virtual {v5, v4}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Lli1;

    .line 94
    .line 95
    and-int/lit8 v6, v1, 0xe

    .line 96
    .line 97
    shl-int/lit8 v1, v1, 0x3

    .line 98
    .line 99
    and-int/lit16 v1, v1, 0x1c00

    .line 100
    .line 101
    or-int/2addr v1, v6

    .line 102
    or-int/lit16 v6, v1, 0x6000

    .line 103
    .line 104
    move-object v0, p0

    .line 105
    move-object v3, p2

    .line 106
    move-object v1, v4

    .line 107
    move-object/from16 v4, p3

    .line 108
    .line 109
    invoke-static/range {v0 .. v6}, Lff1;->a(Lpu;Lli1;Lhq2;Lo63;Lkw;Lpx;I)V

    .line 110
    .line 111
    .line 112
    move-object v8, v2

    .line 113
    goto :goto_5

    .line 114
    :cond_5
    invoke-virtual {v5}, Lgo0;->R()V

    .line 115
    .line 116
    .line 117
    move-object v8, p1

    .line 118
    :goto_5
    invoke-virtual {v5}, Lgo0;->r()Lb62;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-eqz v0, :cond_6

    .line 123
    .line 124
    new-instance v6, Lv1;

    .line 125
    .line 126
    const/4 v12, 0x7

    .line 127
    move-object v7, p0

    .line 128
    move-object v9, p2

    .line 129
    move-object/from16 v10, p3

    .line 130
    .line 131
    move/from16 v11, p5

    .line 132
    .line 133
    invoke-direct/range {v6 .. v12}, Lv1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 134
    .line 135
    .line 136
    iput-object v6, v0, Lb62;->d:Lmn0;

    .line 137
    .line 138
    :cond_6
    return-void
.end method
