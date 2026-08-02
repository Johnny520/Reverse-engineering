.class public final synthetic Lht0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Lzt0;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Z

.field public final synthetic l:Z

.field public final synthetic m:Lin0;


# direct methods
.method public synthetic constructor <init>(ZLzt0;Ljava/lang/String;ZZLin0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lht0;->h:Z

    .line 5
    .line 6
    iput-object p2, p0, Lht0;->i:Lzt0;

    .line 7
    .line 8
    iput-object p3, p0, Lht0;->j:Ljava/lang/String;

    .line 9
    .line 10
    iput-boolean p4, p0, Lht0;->k:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lht0;->l:Z

    .line 13
    .line 14
    iput-object p6, p0, Lht0;->m:Lin0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

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
    const/4 v4, 0x2

    .line 18
    const/4 v5, 0x1

    .line 19
    const/4 v6, 0x0

    .line 20
    if-eq v3, v4, :cond_0

    .line 21
    .line 22
    move v3, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v3, v6

    .line 25
    :goto_0
    and-int/2addr v2, v5

    .line 26
    move-object v14, v1

    .line 27
    check-cast v14, Lgo0;

    .line 28
    .line 29
    invoke-virtual {v14, v2, v3}, Lgo0;->O(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_6

    .line 34
    .line 35
    sget-object v1, Lsn;->t:Lqk;

    .line 36
    .line 37
    sget-object v2, Ltp0;->a:Luf;

    .line 38
    .line 39
    const/16 v3, 0x30

    .line 40
    .line 41
    invoke-static {v2, v1, v14, v3}, Lnb2;->a(Lwf;Lqk;Lpx;I)Lob2;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-wide v2, v14, Lgo0;->T:J

    .line 46
    .line 47
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-virtual {v14}, Lgo0;->l()Lyy1;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    sget-object v4, Lrh1;->a:Lrh1;

    .line 56
    .line 57
    invoke-static {v14, v4}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    sget-object v8, Lhx;->c:Lgx;

    .line 62
    .line 63
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    sget-object v8, Lgx;->b:Ljy;

    .line 67
    .line 68
    invoke-virtual {v14}, Lgo0;->Z()V

    .line 69
    .line 70
    .line 71
    iget-boolean v9, v14, Lgo0;->S:Z

    .line 72
    .line 73
    if-eqz v9, :cond_1

    .line 74
    .line 75
    invoke-virtual {v14, v8}, Lgo0;->k(Lxm0;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-virtual {v14}, Lgo0;->i0()V

    .line 80
    .line 81
    .line 82
    :goto_1
    sget-object v8, Lgx;->e:Llc;

    .line 83
    .line 84
    invoke-static {v14, v8, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object v1, Lgx;->d:Llc;

    .line 88
    .line 89
    invoke-static {v14, v1, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    sget-object v2, Lgx;->f:Llc;

    .line 97
    .line 98
    invoke-static {v14, v2, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    sget-object v1, Lgx;->g:Lv6;

    .line 102
    .line 103
    invoke-static {v14, v1}, Lyf3;->b(Lpx;Lin0;)V

    .line 104
    .line 105
    .line 106
    sget-object v1, Lgx;->c:Llc;

    .line 107
    .line 108
    invoke-static {v14, v1, v7}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-boolean v1, v0, Lht0;->h:Z

    .line 112
    .line 113
    if-eqz v1, :cond_2

    .line 114
    .line 115
    const v1, -0x5c41fc91

    .line 116
    .line 117
    .line 118
    invoke-virtual {v14, v1}, Lgo0;->W(I)V

    .line 119
    .line 120
    .line 121
    iget-object v1, v0, Lht0;->i:Lzt0;

    .line 122
    .line 123
    invoke-static {v1, v14, v6}, Ls11;->m(Lzt0;Lpx;I)V

    .line 124
    .line 125
    .line 126
    const/high16 v1, 0x41000000    # 8.0f

    .line 127
    .line 128
    invoke-static {v4, v1}, Lte;->q0(Luh1;F)Luh1;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {v14, v1}, Lrp0;->O(Lpx;Luh1;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v14, v6}, Lgo0;->p(Z)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_2
    const v1, -0x5c3fb6b6

    .line 140
    .line 141
    .line 142
    invoke-virtual {v14, v1}, Lgo0;->W(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v14, v6}, Lgo0;->p(Z)V

    .line 146
    .line 147
    .line 148
    :goto_2
    iget-object v7, v0, Lht0;->j:Ljava/lang/String;

    .line 149
    .line 150
    iget-boolean v1, v0, Lht0;->k:Z

    .line 151
    .line 152
    if-eqz v7, :cond_5

    .line 153
    .line 154
    const v0, -0x5c3e7554

    .line 155
    .line 156
    .line 157
    invoke-virtual {v14, v0}, Lgo0;->W(I)V

    .line 158
    .line 159
    .line 160
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 161
    .line 162
    const/high16 v2, 0x42c00000    # 96.0f

    .line 163
    .line 164
    invoke-static {v4, v0, v2}, Lte;->r0(Luh1;FF)Luh1;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    new-instance v15, Lm13;

    .line 169
    .line 170
    sget-object v0, Lur1;->a:Ltu2;

    .line 171
    .line 172
    invoke-virtual {v14, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, Llp1;

    .line 177
    .line 178
    iget-wide v2, v2, Llp1;->f:J

    .line 179
    .line 180
    if-eqz v1, :cond_3

    .line 181
    .line 182
    const v9, 0x3f5c28f6    # 0.86f

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_3
    const v9, 0x3ed70a3d    # 0.42f

    .line 187
    .line 188
    .line 189
    :goto_3
    invoke-static {v9, v2, v3}, Lju;->b(FJ)J

    .line 190
    .line 191
    .line 192
    move-result-wide v16

    .line 193
    const/16 v2, 0xc

    .line 194
    .line 195
    invoke-static {v2}, Lrg3;->D(I)J

    .line 196
    .line 197
    .line 198
    move-result-wide v18

    .line 199
    sget-object v20, Lim0;->k:Lim0;

    .line 200
    .line 201
    const/16 v27, 0x0

    .line 202
    .line 203
    const v28, 0xfffff8

    .line 204
    .line 205
    .line 206
    const-wide/16 v21, 0x0

    .line 207
    .line 208
    const/16 v23, 0x0

    .line 209
    .line 210
    const-wide/16 v24, 0x0

    .line 211
    .line 212
    const/16 v26, 0x0

    .line 213
    .line 214
    invoke-direct/range {v15 .. v28}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 215
    .line 216
    .line 217
    const v2, 0x186030

    .line 218
    .line 219
    .line 220
    const/16 v16, 0x3a8

    .line 221
    .line 222
    const/4 v10, 0x2

    .line 223
    const/4 v11, 0x0

    .line 224
    const/4 v12, 0x1

    .line 225
    const/4 v13, 0x0

    .line 226
    move-object v9, v15

    .line 227
    move v15, v2

    .line 228
    invoke-static/range {v7 .. v16}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 229
    .line 230
    .line 231
    const/high16 v2, 0x40800000    # 4.0f

    .line 232
    .line 233
    invoke-static {v4, v2}, Lte;->q0(Luh1;F)Luh1;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    invoke-static {v14, v2}, Lrp0;->O(Lpx;Luh1;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v14, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    check-cast v0, Llp1;

    .line 245
    .line 246
    iget-wide v2, v0, Llp1;->g:J

    .line 247
    .line 248
    if-eqz v1, :cond_4

    .line 249
    .line 250
    const v0, 0x3f3851ec    # 0.72f

    .line 251
    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_4
    const v0, 0x3eae147b    # 0.34f

    .line 255
    .line 256
    .line 257
    :goto_4
    invoke-static {v0, v2, v3}, Lju;->b(FJ)J

    .line 258
    .line 259
    .line 260
    move-result-wide v0

    .line 261
    const/4 v2, 0x0

    .line 262
    invoke-static {v2, v0, v1, v14, v6}, Lqp0;->g(Luh1;JLpx;I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v14, v6}, Lgo0;->p(Z)V

    .line 266
    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_5
    const v2, -0x5c2fbc87

    .line 270
    .line 271
    .line 272
    invoke-virtual {v14, v2}, Lgo0;->W(I)V

    .line 273
    .line 274
    .line 275
    const/4 v13, 0x0

    .line 276
    move-object v12, v14

    .line 277
    const/16 v14, 0x34

    .line 278
    .line 279
    iget-boolean v7, v0, Lht0;->l:Z

    .line 280
    .line 281
    iget-object v8, v0, Lht0;->m:Lin0;

    .line 282
    .line 283
    const/4 v9, 0x0

    .line 284
    const/4 v11, 0x0

    .line 285
    move v10, v1

    .line 286
    invoke-static/range {v7 .. v14}, Lsp0;->i(ZLin0;Luh1;ZILpx;II)V

    .line 287
    .line 288
    .line 289
    move-object v14, v12

    .line 290
    invoke-virtual {v14, v6}, Lgo0;->p(Z)V

    .line 291
    .line 292
    .line 293
    :goto_5
    invoke-virtual {v14, v5}, Lgo0;->p(Z)V

    .line 294
    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_6
    invoke-virtual {v14}, Lgo0;->R()V

    .line 298
    .line 299
    .line 300
    :goto_6
    sget-object v0, La83;->a:La83;

    .line 301
    .line 302
    return-object v0
.end method
