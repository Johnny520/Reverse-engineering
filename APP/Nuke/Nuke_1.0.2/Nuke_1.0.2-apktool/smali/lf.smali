.class public final synthetic Llf;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lin0;

.field public final synthetic i:Lpf;

.field public final synthetic j:Lin0;

.field public final synthetic k:Lc73;

.field public final synthetic l:Ljava/util/LinkedHashMap;

.field public final synthetic m:Lx51;

.field public final synthetic n:Ljava/util/LinkedHashMap;

.field public final synthetic o:Lxk1;

.field public final synthetic p:Lju;

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lin0;Lpf;Lin0;Lc73;Ljava/util/LinkedHashMap;Lx51;Ljava/util/LinkedHashMap;Lxk1;Lju;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llf;->h:Lin0;

    .line 5
    .line 6
    iput-object p2, p0, Llf;->i:Lpf;

    .line 7
    .line 8
    iput-object p3, p0, Llf;->j:Lin0;

    .line 9
    .line 10
    iput-object p4, p0, Llf;->k:Lc73;

    .line 11
    .line 12
    iput-object p5, p0, Llf;->l:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    iput-object p6, p0, Llf;->m:Lx51;

    .line 15
    .line 16
    iput-object p7, p0, Llf;->n:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    iput-object p8, p0, Llf;->o:Lxk1;

    .line 19
    .line 20
    iput-object p9, p0, Llf;->p:Lju;

    .line 21
    .line 22
    iput-object p10, p0, Llf;->q:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lpx;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit8 v3, v2, 0x3

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x1

    .line 19
    const/4 v6, 0x2

    .line 20
    if-eq v3, v6, :cond_0

    .line 21
    .line 22
    move v3, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v3, v4

    .line 25
    :goto_0
    and-int/2addr v2, v5

    .line 26
    move-object v11, v1

    .line 27
    check-cast v11, Lgo0;

    .line 28
    .line 29
    invoke-virtual {v11, v2, v3}, Lgo0;->O(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    sget-object v1, Lte;->g:Lyi0;

    .line 36
    .line 37
    sget-object v2, Ltp0;->c:Lvf;

    .line 38
    .line 39
    sget-object v3, Lsn;->u:Lpk;

    .line 40
    .line 41
    invoke-static {v2, v3, v11, v4}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-wide v3, v11, Lgo0;->T:J

    .line 46
    .line 47
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-virtual {v11}, Lgo0;->l()Lyy1;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {v11, v1}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sget-object v7, Lhx;->c:Lgx;

    .line 60
    .line 61
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    sget-object v7, Lgx;->b:Ljy;

    .line 65
    .line 66
    invoke-virtual {v11}, Lgo0;->Z()V

    .line 67
    .line 68
    .line 69
    iget-boolean v8, v11, Lgo0;->S:Z

    .line 70
    .line 71
    if-eqz v8, :cond_1

    .line 72
    .line 73
    invoke-virtual {v11, v7}, Lgo0;->k(Lxm0;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    invoke-virtual {v11}, Lgo0;->i0()V

    .line 78
    .line 79
    .line 80
    :goto_1
    sget-object v7, Lgx;->e:Llc;

    .line 81
    .line 82
    invoke-static {v11, v7, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    sget-object v2, Lgx;->d:Llc;

    .line 86
    .line 87
    invoke-static {v11, v2, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    sget-object v3, Lgx;->f:Llc;

    .line 95
    .line 96
    invoke-static {v11, v3, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-object v2, Lgx;->g:Lv6;

    .line 100
    .line 101
    invoke-static {v11, v2}, Lyf3;->b(Lpx;Lin0;)V

    .line 102
    .line 103
    .line 104
    sget-object v2, Lgx;->c:Llc;

    .line 105
    .line 106
    invoke-static {v11, v2, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    const v1, 0x790b0110

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v11}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    const/4 v12, 0x0

    .line 117
    const/16 v13, 0x1e

    .line 118
    .line 119
    const/4 v8, 0x0

    .line 120
    const/4 v9, 0x0

    .line 121
    iget-object v10, v0, Llf;->h:Lin0;

    .line 122
    .line 123
    invoke-static/range {v7 .. v13}, Ltp0;->c(Ljava/lang/String;Luh1;Lnn0;Lin0;Lpx;II)V

    .line 124
    .line 125
    .line 126
    sget-object v1, Lte;->e:Lyi0;

    .line 127
    .line 128
    new-instance v2, Lg71;

    .line 129
    .line 130
    const/high16 v3, 0x3f800000    # 1.0f

    .line 131
    .line 132
    invoke-direct {v2, v3, v5}, Lg71;-><init>(FZ)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v1, v2}, Luh1;->c(Luh1;)Luh1;

    .line 136
    .line 137
    .line 138
    move-result-object v16

    .line 139
    invoke-static {}, Lfg1;->h()Ljw1;

    .line 140
    .line 141
    .line 142
    move-result-object v17

    .line 143
    new-instance v10, Lxf;

    .line 144
    .line 145
    new-instance v1, Ls;

    .line 146
    .line 147
    invoke-direct {v1, v6}, Ls;-><init>(I)V

    .line 148
    .line 149
    .line 150
    const/high16 v2, 0x41400000    # 12.0f

    .line 151
    .line 152
    invoke-direct {v10, v2, v1}, Lxf;-><init>(FLs;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, v0, Llf;->i:Lpf;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    invoke-virtual {v11, v2}, Lgo0;->d(I)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    iget-object v3, v0, Llf;->j:Lin0;

    .line 166
    .line 167
    invoke-virtual {v11, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    or-int/2addr v2, v4

    .line 172
    iget-object v4, v0, Llf;->k:Lc73;

    .line 173
    .line 174
    invoke-virtual {v11, v4}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    or-int/2addr v2, v6

    .line 179
    iget-object v6, v0, Llf;->l:Ljava/util/LinkedHashMap;

    .line 180
    .line 181
    invoke-virtual {v11, v6}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    or-int/2addr v2, v7

    .line 186
    iget-object v7, v0, Llf;->m:Lx51;

    .line 187
    .line 188
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    invoke-virtual {v11, v8}, Lgo0;->d(I)Z

    .line 193
    .line 194
    .line 195
    move-result v8

    .line 196
    or-int/2addr v2, v8

    .line 197
    iget-object v8, v0, Llf;->n:Ljava/util/LinkedHashMap;

    .line 198
    .line 199
    invoke-virtual {v11, v8}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v9

    .line 203
    or-int/2addr v2, v9

    .line 204
    iget-object v9, v0, Llf;->o:Lxk1;

    .line 205
    .line 206
    invoke-virtual {v11, v9}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    or-int/2addr v2, v12

    .line 211
    iget-object v12, v0, Llf;->p:Lju;

    .line 212
    .line 213
    invoke-virtual {v11, v12}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v13

    .line 217
    or-int/2addr v2, v13

    .line 218
    iget-object v0, v0, Llf;->q:Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {v11, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v13

    .line 224
    or-int/2addr v2, v13

    .line 225
    invoke-virtual {v11}, Lgo0;->L()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v13

    .line 229
    if-nez v2, :cond_2

    .line 230
    .line 231
    sget-object v2, Lnx;->a:Leb;

    .line 232
    .line 233
    if-ne v13, v2, :cond_3

    .line 234
    .line 235
    :cond_2
    new-instance v18, Lof;

    .line 236
    .line 237
    move-object/from16 v26, v0

    .line 238
    .line 239
    move-object/from16 v19, v1

    .line 240
    .line 241
    move-object/from16 v20, v3

    .line 242
    .line 243
    move-object/from16 v21, v4

    .line 244
    .line 245
    move-object/from16 v22, v6

    .line 246
    .line 247
    move-object/from16 v23, v7

    .line 248
    .line 249
    move-object/from16 v24, v8

    .line 250
    .line 251
    move-object/from16 v25, v9

    .line 252
    .line 253
    move-object/from16 v27, v12

    .line 254
    .line 255
    invoke-direct/range {v18 .. v27}, Lof;-><init>(Lpf;Lin0;Lc73;Ljava/util/LinkedHashMap;Lx51;Ljava/util/LinkedHashMap;Lxk1;Ljava/lang/String;Lju;)V

    .line 256
    .line 257
    .line 258
    move-object/from16 v13, v18

    .line 259
    .line 260
    invoke-virtual {v11, v13}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    :cond_3
    move-object v14, v13

    .line 264
    check-cast v14, Lin0;

    .line 265
    .line 266
    const/16 v7, 0x6180

    .line 267
    .line 268
    const/16 v8, 0x1ea

    .line 269
    .line 270
    const/4 v9, 0x0

    .line 271
    move-object v12, v11

    .line 272
    const/4 v11, 0x0

    .line 273
    const/4 v13, 0x0

    .line 274
    const/4 v15, 0x0

    .line 275
    const/16 v18, 0x0

    .line 276
    .line 277
    invoke-static/range {v7 .. v18}, Lrg3;->d(IILs8;Lyf;Lpk;Lpx;Ln50;Lin0;Ld91;Luh1;Ljw1;Z)V

    .line 278
    .line 279
    .line 280
    move-object v11, v12

    .line 281
    invoke-virtual {v11, v5}, Lgo0;->p(Z)V

    .line 282
    .line 283
    .line 284
    goto :goto_2

    .line 285
    :cond_4
    invoke-virtual {v11}, Lgo0;->R()V

    .line 286
    .line 287
    .line 288
    :goto_2
    sget-object v0, La83;->a:La83;

    .line 289
    .line 290
    return-object v0
.end method
