.class public abstract Lxh/v;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwb/pp;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Lwb/pp;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Li0/s0;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Li0/s0;-><init>(Lfg/a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final a(ZLy0/o;Lsh/y;Lsh/g0;ZLfg/a;Lfg/a;FLs0/d;Li0/h0;I)V
    .locals 13

    .line 1
    move-object/from16 v6, p5

    .line 2
    .line 3
    move-object/from16 v10, p8

    .line 4
    .line 5
    move-object/from16 v8, p9

    .line 6
    .line 7
    move/from16 v11, p10

    .line 8
    .line 9
    const v0, -0x7755a556

    .line 10
    .line 11
    .line 12
    invoke-virtual {v8, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v0, v11, 0x6

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v8, p0}, Li0/h0;->g(Z)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x2

    .line 28
    :goto_0
    or-int/2addr v0, v11

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v11

    .line 31
    :goto_1
    or-int/lit16 v0, v0, 0x1b0

    .line 32
    .line 33
    and-int/lit16 v1, v11, 0xc00

    .line 34
    .line 35
    if-nez v1, :cond_3

    .line 36
    .line 37
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {v8, v1}, Li0/h0;->d(I)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    const/16 v1, 0x800

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v1, 0x400

    .line 51
    .line 52
    :goto_2
    or-int/2addr v0, v1

    .line 53
    :cond_3
    or-int/lit16 v0, v0, 0x6000

    .line 54
    .line 55
    const/high16 v1, 0x30000

    .line 56
    .line 57
    and-int/2addr v1, v11

    .line 58
    if-nez v1, :cond_5

    .line 59
    .line 60
    invoke-virtual {v8, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    const/high16 v1, 0x20000

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/high16 v1, 0x10000

    .line 70
    .line 71
    :goto_3
    or-int/2addr v0, v1

    .line 72
    :cond_5
    const/high16 v1, 0x180000

    .line 73
    .line 74
    and-int/2addr v1, v11

    .line 75
    move-object/from16 v5, p6

    .line 76
    .line 77
    if-nez v1, :cond_7

    .line 78
    .line 79
    invoke-virtual {v8, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_6

    .line 84
    .line 85
    const/high16 v1, 0x100000

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_6
    const/high16 v1, 0x80000

    .line 89
    .line 90
    :goto_4
    or-int/2addr v0, v1

    .line 91
    :cond_7
    const/high16 v1, 0xc00000

    .line 92
    .line 93
    and-int/2addr v1, v11

    .line 94
    if-nez v1, :cond_9

    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    invoke-virtual {v8, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_8

    .line 102
    .line 103
    const/high16 v1, 0x800000

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_8
    const/high16 v1, 0x400000

    .line 107
    .line 108
    :goto_5
    or-int/2addr v0, v1

    .line 109
    :cond_9
    const/high16 v1, 0x6000000

    .line 110
    .line 111
    or-int/2addr v0, v1

    .line 112
    const/high16 v1, 0x30000000

    .line 113
    .line 114
    and-int/2addr v1, v11

    .line 115
    if-nez v1, :cond_b

    .line 116
    .line 117
    invoke-virtual {v8, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_a

    .line 122
    .line 123
    const/high16 v1, 0x20000000

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_a
    const/high16 v1, 0x10000000

    .line 127
    .line 128
    :goto_6
    or-int/2addr v0, v1

    .line 129
    :cond_b
    const v1, 0x12492493

    .line 130
    .line 131
    .line 132
    and-int/2addr v1, v0

    .line 133
    const v2, 0x12492492

    .line 134
    .line 135
    .line 136
    const/4 v12, 0x1

    .line 137
    if-eq v1, v2, :cond_c

    .line 138
    .line 139
    move v1, v12

    .line 140
    goto :goto_7

    .line 141
    :cond_c
    const/4 v1, 0x0

    .line 142
    :goto_7
    and-int/lit8 v2, v0, 0x1

    .line 143
    .line 144
    invoke-virtual {v8, v2, v1}, Li0/h0;->S(IZ)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_d

    .line 149
    .line 150
    sget-object v2, Lsh/z;->g:Lsh/y;

    .line 151
    .line 152
    const/16 p1, 0xc8

    .line 153
    .line 154
    int-to-float p1, p1

    .line 155
    invoke-static {v6, v8}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    new-instance v3, Lxh/q;

    .line 160
    .line 161
    const/4 v4, 0x1

    .line 162
    invoke-direct {v3, v1, v4}, Lxh/q;-><init>(Li0/a1;I)V

    .line 163
    .line 164
    .line 165
    const v4, 0x42181807

    .line 166
    .line 167
    .line 168
    invoke-static {v4, v3, v8}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    new-instance v4, Lxh/l;

    .line 173
    .line 174
    const/4 v7, 0x2

    .line 175
    invoke-direct {v4, v1, v10, v7}, Lxh/l;-><init>(Li0/a1;Ls0/d;I)V

    .line 176
    .line 177
    .line 178
    const v1, -0x68849000

    .line 179
    .line 180
    .line 181
    invoke-static {v1, v4, v8}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    and-int/lit8 v1, v0, 0xe

    .line 186
    .line 187
    or-int/lit8 v1, v1, 0x30

    .line 188
    .line 189
    shl-int/lit8 v0, v0, 0x3

    .line 190
    .line 191
    and-int/lit16 v4, v0, 0x380

    .line 192
    .line 193
    or-int/2addr v1, v4

    .line 194
    and-int/lit16 v4, v0, 0x1c00

    .line 195
    .line 196
    or-int/2addr v1, v4

    .line 197
    const v4, 0xe000

    .line 198
    .line 199
    .line 200
    and-int/2addr v4, v0

    .line 201
    or-int/2addr v1, v4

    .line 202
    const/high16 v4, 0x70000

    .line 203
    .line 204
    and-int/2addr v4, v0

    .line 205
    or-int/2addr v1, v4

    .line 206
    const/high16 v4, 0x380000

    .line 207
    .line 208
    and-int/2addr v4, v0

    .line 209
    or-int/2addr v1, v4

    .line 210
    const/high16 v4, 0x1c00000

    .line 211
    .line 212
    and-int/2addr v4, v0

    .line 213
    or-int/2addr v1, v4

    .line 214
    const/high16 v4, 0xe000000

    .line 215
    .line 216
    and-int/2addr v4, v0

    .line 217
    or-int/2addr v1, v4

    .line 218
    const/high16 v4, 0x70000000

    .line 219
    .line 220
    and-int/2addr v0, v4

    .line 221
    or-int v9, v1, v0

    .line 222
    .line 223
    move v0, p0

    .line 224
    move-object v1, v3

    .line 225
    move-object v4, v6

    .line 226
    move v6, p1

    .line 227
    move-object/from16 v3, p3

    .line 228
    .line 229
    invoke-static/range {v0 .. v9}, Lig/a;->a(ZLs0/d;Lsh/y;Lsh/g0;Lfg/a;Lfg/a;FLs0/d;Li0/h0;I)V

    .line 230
    .line 231
    .line 232
    sget-object p1, Ly0/l;->a:Ly0/l;

    .line 233
    .line 234
    move-object v3, v2

    .line 235
    move v8, v6

    .line 236
    move v5, v12

    .line 237
    :goto_8
    move-object v2, p1

    .line 238
    goto :goto_9

    .line 239
    :cond_d
    invoke-virtual/range {p9 .. p9}, Li0/h0;->V()V

    .line 240
    .line 241
    .line 242
    move-object v3, p2

    .line 243
    move/from16 v5, p4

    .line 244
    .line 245
    move/from16 v8, p7

    .line 246
    .line 247
    goto :goto_8

    .line 248
    :goto_9
    invoke-virtual/range {p9 .. p9}, Li0/h0;->t()Li0/r1;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    if-eqz p1, :cond_e

    .line 253
    .line 254
    new-instance v0, Lxh/u;

    .line 255
    .line 256
    move v1, p0

    .line 257
    move-object/from16 v4, p3

    .line 258
    .line 259
    move-object/from16 v6, p5

    .line 260
    .line 261
    move-object/from16 v7, p6

    .line 262
    .line 263
    move-object v9, v10

    .line 264
    move v10, v11

    .line 265
    invoke-direct/range {v0 .. v10}, Lxh/u;-><init>(ZLy0/o;Lsh/y;Lsh/g0;ZLfg/a;Lfg/a;FLs0/d;I)V

    .line 266
    .line 267
    .line 268
    iput-object v0, p1, Li0/r1;->d:Lfg/p;

    .line 269
    .line 270
    :cond_e
    return-void
.end method
