.class public final synthetic Lau0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lin0;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lun0;


# direct methods
.method public synthetic constructor <init>(Lkf2;Ljava/lang/String;Ljava/lang/String;Lin0;Lxm0;Lxm0;I)V
    .locals 0

    .line 20
    const/4 p7, 0x1

    iput p7, p0, Lau0;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lau0;->j:Ljava/lang/Object;

    iput-object p2, p0, Lau0;->k:Ljava/lang/Object;

    iput-object p3, p0, Lau0;->l:Ljava/lang/Object;

    iput-object p4, p0, Lau0;->i:Lin0;

    iput-object p5, p0, Lau0;->m:Ljava/lang/Object;

    iput-object p6, p0, Lau0;->n:Lun0;

    return-void
.end method

.method public synthetic constructor <init>(Lwm0;Lin0;Ljava/util/List;Landroid/view/View;Lrs2;Lmn0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lau0;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lau0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lau0;->i:Lin0;

    .line 10
    .line 11
    iput-object p3, p0, Lau0;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lau0;->l:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lau0;->m:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Lau0;->n:Lun0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lau0;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    iget-object v3, v0, Lau0;->n:Lun0;

    .line 8
    .line 9
    iget-object v4, v0, Lau0;->m:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lau0;->l:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Lau0;->k:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, Lau0;->j:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object v8, v7

    .line 21
    check-cast v8, Lkf2;

    .line 22
    .line 23
    move-object v9, v6

    .line 24
    check-cast v9, Ljava/lang/String;

    .line 25
    .line 26
    move-object v10, v5

    .line 27
    check-cast v10, Ljava/lang/String;

    .line 28
    .line 29
    move-object v12, v4

    .line 30
    check-cast v12, Lxm0;

    .line 31
    .line 32
    move-object v13, v3

    .line 33
    check-cast v13, Lxm0;

    .line 34
    .line 35
    move-object/from16 v14, p1

    .line 36
    .line 37
    check-cast v14, Lpx;

    .line 38
    .line 39
    move-object/from16 v1, p2

    .line 40
    .line 41
    check-cast v1, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const/16 v1, 0x6c01

    .line 47
    .line 48
    invoke-static {v1}, Lpp0;->N(I)I

    .line 49
    .line 50
    .line 51
    move-result v15

    .line 52
    iget-object v11, v0, Lau0;->i:Lin0;

    .line 53
    .line 54
    invoke-static/range {v8 .. v15}, Lrg3;->e(Lkf2;Ljava/lang/String;Ljava/lang/String;Lin0;Lxm0;Lxm0;Lpx;I)V

    .line 55
    .line 56
    .line 57
    return-object v2

    .line 58
    :pswitch_0
    check-cast v7, Lwm0;

    .line 59
    .line 60
    check-cast v6, Ljava/util/List;

    .line 61
    .line 62
    check-cast v5, Landroid/view/View;

    .line 63
    .line 64
    check-cast v4, Lrs2;

    .line 65
    .line 66
    check-cast v3, Lmn0;

    .line 67
    .line 68
    move-object/from16 v1, p1

    .line 69
    .line 70
    check-cast v1, Lpx;

    .line 71
    .line 72
    move-object/from16 v8, p2

    .line 73
    .line 74
    check-cast v8, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    and-int/lit8 v9, v8, 0x3

    .line 81
    .line 82
    const/4 v10, 0x2

    .line 83
    const/4 v11, 0x0

    .line 84
    const/4 v12, 0x1

    .line 85
    if-eq v9, v10, :cond_0

    .line 86
    .line 87
    move v9, v12

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    move v9, v11

    .line 90
    :goto_0
    and-int/2addr v8, v12

    .line 91
    check-cast v1, Lgo0;

    .line 92
    .line 93
    invoke-virtual {v1, v8, v9}, Lgo0;->O(IZ)Z

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-eqz v8, :cond_4

    .line 98
    .line 99
    sget-object v8, Lte;->g:Lyi0;

    .line 100
    .line 101
    sget-object v9, Ltp0;->c:Lvf;

    .line 102
    .line 103
    sget-object v13, Lsn;->u:Lpk;

    .line 104
    .line 105
    invoke-static {v9, v13, v1, v11}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    iget-wide v13, v1, Lgo0;->T:J

    .line 110
    .line 111
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    invoke-virtual {v1}, Lgo0;->l()Lyy1;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    invoke-static {v1, v8}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    sget-object v14, Lhx;->c:Lgx;

    .line 124
    .line 125
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    sget-object v14, Lgx;->b:Ljy;

    .line 129
    .line 130
    invoke-virtual {v1}, Lgo0;->Z()V

    .line 131
    .line 132
    .line 133
    iget-boolean v15, v1, Lgo0;->S:Z

    .line 134
    .line 135
    if-eqz v15, :cond_1

    .line 136
    .line 137
    invoke-virtual {v1, v14}, Lgo0;->k(Lxm0;)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_1
    invoke-virtual {v1}, Lgo0;->i0()V

    .line 142
    .line 143
    .line 144
    :goto_1
    sget-object v14, Lgx;->e:Llc;

    .line 145
    .line 146
    invoke-static {v1, v14, v9}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    sget-object v9, Lgx;->d:Llc;

    .line 150
    .line 151
    invoke-static {v1, v9, v13}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    sget-object v11, Lgx;->f:Llc;

    .line 159
    .line 160
    invoke-static {v1, v11, v9}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    sget-object v9, Lgx;->g:Lv6;

    .line 164
    .line 165
    invoke-static {v1, v9}, Lyf3;->b(Lpx;Lin0;)V

    .line 166
    .line 167
    .line 168
    sget-object v9, Lgx;->c:Llc;

    .line 169
    .line 170
    invoke-static {v1, v9, v8}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    iget v8, v7, Lwm0;->h:I

    .line 174
    .line 175
    invoke-static {v8, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v13

    .line 179
    const/16 v18, 0x0

    .line 180
    .line 181
    const/16 v19, 0x1e

    .line 182
    .line 183
    const/4 v14, 0x0

    .line 184
    const/4 v15, 0x0

    .line 185
    iget-object v0, v0, Lau0;->i:Lin0;

    .line 186
    .line 187
    move-object/from16 v16, v0

    .line 188
    .line 189
    move-object/from16 v17, v1

    .line 190
    .line 191
    invoke-static/range {v13 .. v19}, Ltp0;->c(Ljava/lang/String;Luh1;Lnn0;Lin0;Lpx;II)V

    .line 192
    .line 193
    .line 194
    sget-object v0, Lte;->e:Lyi0;

    .line 195
    .line 196
    new-instance v8, Lg71;

    .line 197
    .line 198
    const/high16 v9, 0x3f800000    # 1.0f

    .line 199
    .line 200
    invoke-direct {v8, v9, v12}, Lg71;-><init>(FZ)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v0, v8}, Luh1;->c(Luh1;)Luh1;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-static {}, Lfg1;->h()Ljw1;

    .line 208
    .line 209
    .line 210
    move-result-object v23

    .line 211
    new-instance v8, Lxf;

    .line 212
    .line 213
    new-instance v9, Ls;

    .line 214
    .line 215
    invoke-direct {v9, v10}, Ls;-><init>(I)V

    .line 216
    .line 217
    .line 218
    const/high16 v10, 0x41400000    # 12.0f

    .line 219
    .line 220
    invoke-direct {v8, v10, v9}, Lxf;-><init>(FLs;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v6}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    invoke-virtual {v1, v10}, Lgo0;->d(I)Z

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    or-int/2addr v9, v10

    .line 236
    invoke-virtual {v1, v5}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    or-int/2addr v9, v10

    .line 241
    invoke-virtual {v1, v4}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    or-int/2addr v9, v10

    .line 246
    invoke-virtual {v1, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    or-int/2addr v9, v10

    .line 251
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v10

    .line 255
    if-nez v9, :cond_2

    .line 256
    .line 257
    sget-object v9, Lnx;->a:Leb;

    .line 258
    .line 259
    if-ne v10, v9, :cond_3

    .line 260
    .line 261
    :cond_2
    new-instance v16, Lh9;

    .line 262
    .line 263
    const/16 v22, 0x1

    .line 264
    .line 265
    move-object/from16 v21, v3

    .line 266
    .line 267
    move-object/from16 v20, v4

    .line 268
    .line 269
    move-object/from16 v19, v5

    .line 270
    .line 271
    move-object/from16 v17, v6

    .line 272
    .line 273
    move-object/from16 v18, v7

    .line 274
    .line 275
    invoke-direct/range {v16 .. v22}, Lh9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 276
    .line 277
    .line 278
    move-object/from16 v10, v16

    .line 279
    .line 280
    invoke-virtual {v1, v10}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :cond_3
    move-object/from16 v20, v10

    .line 284
    .line 285
    check-cast v20, Lin0;

    .line 286
    .line 287
    const/16 v13, 0x6180

    .line 288
    .line 289
    const/16 v14, 0x1ea

    .line 290
    .line 291
    const/4 v15, 0x0

    .line 292
    const/16 v17, 0x0

    .line 293
    .line 294
    const/16 v19, 0x0

    .line 295
    .line 296
    const/16 v21, 0x0

    .line 297
    .line 298
    const/16 v24, 0x0

    .line 299
    .line 300
    move-object/from16 v22, v0

    .line 301
    .line 302
    move-object/from16 v18, v1

    .line 303
    .line 304
    move-object/from16 v16, v8

    .line 305
    .line 306
    invoke-static/range {v13 .. v24}, Lrg3;->d(IILs8;Lyf;Lpk;Lpx;Ln50;Lin0;Ld91;Luh1;Ljw1;Z)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1, v12}, Lgo0;->p(Z)V

    .line 310
    .line 311
    .line 312
    goto :goto_2

    .line 313
    :cond_4
    invoke-virtual {v1}, Lgo0;->R()V

    .line 314
    .line 315
    .line 316
    :goto_2
    return-object v2

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
