.class public final synthetic Llk2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lin0;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Lxk1;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lj20;

.field public final synthetic r:Lxk1;

.field public final synthetic s:Lxk1;

.field public final synthetic t:Lxk1;

.field public final synthetic u:Lxk1;

.field public final synthetic v:Lxk1;

.field public final synthetic w:Lxk1;

.field public final synthetic x:Lxk1;

.field public final synthetic y:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lin0;Landroid/content/Context;Lxk1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj20;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llk2;->h:Lin0;

    iput-object p2, p0, Llk2;->i:Landroid/content/Context;

    iput-object p3, p0, Llk2;->j:Lxk1;

    iput-object p4, p0, Llk2;->k:Ljava/lang/String;

    iput-object p5, p0, Llk2;->l:Ljava/lang/String;

    iput-object p6, p0, Llk2;->m:Ljava/lang/String;

    iput-object p7, p0, Llk2;->n:Ljava/lang/String;

    iput-object p8, p0, Llk2;->o:Ljava/lang/String;

    iput-object p9, p0, Llk2;->p:Ljava/lang/String;

    iput-object p10, p0, Llk2;->q:Lj20;

    iput-object p11, p0, Llk2;->r:Lxk1;

    iput-object p12, p0, Llk2;->s:Lxk1;

    iput-object p13, p0, Llk2;->t:Lxk1;

    iput-object p14, p0, Llk2;->u:Lxk1;

    iput-object p15, p0, Llk2;->v:Lxk1;

    move-object/from16 p1, p16

    iput-object p1, p0, Llk2;->w:Lxk1;

    move-object/from16 p1, p17

    iput-object p1, p0, Llk2;->x:Lxk1;

    move-object/from16 p1, p18

    iput-object p1, p0, Llk2;->y:Lxk1;

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

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
    const v1, 0x790b014b

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
    iget-object v10, v0, Llk2;->h:Lin0;

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
    iget-object v1, v0, Llk2;->i:Landroid/content/Context;

    .line 156
    .line 157
    invoke-virtual {v11, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    iget-object v3, v0, Llk2;->j:Lxk1;

    .line 162
    .line 163
    invoke-virtual {v11, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    or-int/2addr v2, v4

    .line 168
    iget-object v4, v0, Llk2;->k:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v11, v4}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    or-int/2addr v2, v6

    .line 175
    iget-object v6, v0, Llk2;->l:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v11, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    or-int/2addr v2, v7

    .line 182
    iget-object v7, v0, Llk2;->m:Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {v11, v7}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    or-int/2addr v2, v8

    .line 189
    iget-object v8, v0, Llk2;->n:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v11, v8}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v9

    .line 195
    or-int/2addr v2, v9

    .line 196
    iget-object v9, v0, Llk2;->o:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v11, v9}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v12

    .line 202
    or-int/2addr v2, v12

    .line 203
    iget-object v12, v0, Llk2;->p:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {v11, v12}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    or-int/2addr v2, v13

    .line 210
    iget-object v13, v0, Llk2;->q:Lj20;

    .line 211
    .line 212
    invoke-virtual {v11, v13}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v14

    .line 216
    or-int/2addr v2, v14

    .line 217
    iget-object v14, v0, Llk2;->r:Lxk1;

    .line 218
    .line 219
    invoke-virtual {v11, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v15

    .line 223
    or-int/2addr v2, v15

    .line 224
    invoke-virtual {v11}, Lgo0;->L()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v15

    .line 228
    if-nez v2, :cond_2

    .line 229
    .line 230
    sget-object v2, Lnx;->a:Leb;

    .line 231
    .line 232
    if-ne v15, v2, :cond_3

    .line 233
    .line 234
    :cond_2
    new-instance v18, Lbk2;

    .line 235
    .line 236
    iget-object v2, v0, Llk2;->s:Lxk1;

    .line 237
    .line 238
    iget-object v15, v0, Llk2;->t:Lxk1;

    .line 239
    .line 240
    iget-object v5, v0, Llk2;->u:Lxk1;

    .line 241
    .line 242
    move-object/from16 v19, v1

    .line 243
    .line 244
    iget-object v1, v0, Llk2;->v:Lxk1;

    .line 245
    .line 246
    move-object/from16 v32, v1

    .line 247
    .line 248
    iget-object v1, v0, Llk2;->w:Lxk1;

    .line 249
    .line 250
    move-object/from16 v33, v1

    .line 251
    .line 252
    iget-object v1, v0, Llk2;->x:Lxk1;

    .line 253
    .line 254
    iget-object v0, v0, Llk2;->y:Lxk1;

    .line 255
    .line 256
    move-object/from16 v35, v0

    .line 257
    .line 258
    move-object/from16 v34, v1

    .line 259
    .line 260
    move-object/from16 v29, v2

    .line 261
    .line 262
    move-object/from16 v20, v3

    .line 263
    .line 264
    move-object/from16 v22, v4

    .line 265
    .line 266
    move-object/from16 v31, v5

    .line 267
    .line 268
    move-object/from16 v23, v6

    .line 269
    .line 270
    move-object/from16 v24, v7

    .line 271
    .line 272
    move-object/from16 v25, v8

    .line 273
    .line 274
    move-object/from16 v26, v9

    .line 275
    .line 276
    move-object/from16 v27, v12

    .line 277
    .line 278
    move-object/from16 v28, v13

    .line 279
    .line 280
    move-object/from16 v21, v14

    .line 281
    .line 282
    move-object/from16 v30, v15

    .line 283
    .line 284
    invoke-direct/range {v18 .. v35}, Lbk2;-><init>(Landroid/content/Context;Lxk1;Lxk1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj20;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;)V

    .line 285
    .line 286
    .line 287
    move-object/from16 v15, v18

    .line 288
    .line 289
    invoke-virtual {v11, v15}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    :cond_3
    move-object v14, v15

    .line 293
    check-cast v14, Lin0;

    .line 294
    .line 295
    const/16 v7, 0x6180

    .line 296
    .line 297
    const/16 v8, 0x1ea

    .line 298
    .line 299
    const/4 v9, 0x0

    .line 300
    move-object v12, v11

    .line 301
    const/4 v11, 0x0

    .line 302
    const/4 v13, 0x0

    .line 303
    const/4 v15, 0x0

    .line 304
    const/16 v18, 0x0

    .line 305
    .line 306
    invoke-static/range {v7 .. v18}, Lrg3;->d(IILs8;Lyf;Lpk;Lpx;Ln50;Lin0;Ld91;Luh1;Ljw1;Z)V

    .line 307
    .line 308
    .line 309
    move-object v11, v12

    .line 310
    const/4 v0, 0x1

    .line 311
    invoke-virtual {v11, v0}, Lgo0;->p(Z)V

    .line 312
    .line 313
    .line 314
    goto :goto_2

    .line 315
    :cond_4
    invoke-virtual {v11}, Lgo0;->R()V

    .line 316
    .line 317
    .line 318
    :goto_2
    sget-object v0, La83;->a:La83;

    .line 319
    .line 320
    return-object v0
.end method
