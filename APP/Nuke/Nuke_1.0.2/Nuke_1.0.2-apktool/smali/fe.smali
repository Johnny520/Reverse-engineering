.class public final synthetic Lfe;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lxm0;

.field public final synthetic j:Lin0;

.field public final synthetic k:Lxk1;

.field public final synthetic l:Z

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lxm0;Lin0;Lxk1;Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p6, p0, Lfe;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lfe;->i:Lxm0;

    .line 4
    .line 5
    iput-object p2, p0, Lfe;->j:Lin0;

    .line 6
    .line 7
    iput-object p3, p0, Lfe;->k:Lxk1;

    .line 8
    .line 9
    iput-object p4, p0, Lfe;->m:Ljava/lang/Object;

    .line 10
    .line 11
    iput-boolean p5, p0, Lfe;->l:Z

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lfe;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    sget-object v3, Lnx;->a:Leb;

    .line 8
    .line 9
    const v4, 0x790b014a

    .line 10
    .line 11
    .line 12
    const v5, 0x790b0111

    .line 13
    .line 14
    .line 15
    const/16 v6, 0x12

    .line 16
    .line 17
    const/4 v8, 0x4

    .line 18
    const/4 v9, 0x0

    .line 19
    iget-object v10, v0, Lfe;->m:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v11, v0, Lfe;->k:Lxk1;

    .line 22
    .line 23
    iget-object v12, v0, Lfe;->j:Lin0;

    .line 24
    .line 25
    const/4 v13, 0x1

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    check-cast v10, Ljava/lang/Integer;

    .line 30
    .line 31
    move-object/from16 v1, p1

    .line 32
    .line 33
    check-cast v1, Lpb2;

    .line 34
    .line 35
    move-object/from16 v14, p2

    .line 36
    .line 37
    check-cast v14, Lpx;

    .line 38
    .line 39
    move-object/from16 v15, p3

    .line 40
    .line 41
    check-cast v15, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v15

    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    and-int/lit8 v16, v15, 0x6

    .line 51
    .line 52
    if-nez v16, :cond_1

    .line 53
    .line 54
    move-object v7, v14

    .line 55
    check-cast v7, Lgo0;

    .line 56
    .line 57
    invoke-virtual {v7, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_0

    .line 62
    .line 63
    move v7, v8

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const/4 v7, 0x2

    .line 66
    :goto_0
    or-int/2addr v15, v7

    .line 67
    :cond_1
    and-int/lit8 v7, v15, 0x13

    .line 68
    .line 69
    if-eq v7, v6, :cond_2

    .line 70
    .line 71
    move v9, v13

    .line 72
    :cond_2
    and-int/lit8 v6, v15, 0x1

    .line 73
    .line 74
    check-cast v14, Lgo0;

    .line 75
    .line 76
    invoke-virtual {v14, v6, v9}, Lgo0;->O(IZ)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_5

    .line 81
    .line 82
    invoke-static {v5, v14}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v15

    .line 86
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 87
    .line 88
    .line 89
    move-result-object v17

    .line 90
    const/16 v21, 0x0

    .line 91
    .line 92
    const/16 v22, 0x38

    .line 93
    .line 94
    iget-object v5, v0, Lfe;->i:Lxm0;

    .line 95
    .line 96
    const/16 v18, 0x0

    .line 97
    .line 98
    const/16 v19, 0x0

    .line 99
    .line 100
    move-object/from16 v16, v5

    .line 101
    .line 102
    move-object/from16 v20, v14

    .line 103
    .line 104
    invoke-static/range {v15 .. v22}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 105
    .line 106
    .line 107
    invoke-static {v4, v14}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v15

    .line 111
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 112
    .line 113
    .line 114
    move-result-object v17

    .line 115
    invoke-virtual {v14, v12}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-virtual {v14, v11}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    or-int/2addr v1, v4

    .line 124
    invoke-virtual {v14, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    or-int/2addr v1, v4

    .line 129
    invoke-virtual {v14}, Lgo0;->L()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    if-nez v1, :cond_3

    .line 134
    .line 135
    if-ne v4, v3, :cond_4

    .line 136
    .line 137
    :cond_3
    new-instance v4, Ls1;

    .line 138
    .line 139
    const/16 v1, 0xf

    .line 140
    .line 141
    invoke-direct {v4, v12, v10, v11, v1}, Ls1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v14, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :cond_4
    move-object/from16 v16, v4

    .line 148
    .line 149
    check-cast v16, Lxm0;

    .line 150
    .line 151
    const/16 v21, 0x0

    .line 152
    .line 153
    const/16 v22, 0x30

    .line 154
    .line 155
    iget-boolean v0, v0, Lfe;->l:Z

    .line 156
    .line 157
    const/16 v19, 0x0

    .line 158
    .line 159
    move/from16 v18, v0

    .line 160
    .line 161
    move-object/from16 v20, v14

    .line 162
    .line 163
    invoke-static/range {v15 .. v22}, Lse;->q(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_5
    move-object/from16 v20, v14

    .line 168
    .line 169
    invoke-virtual/range {v20 .. v20}, Lgo0;->R()V

    .line 170
    .line 171
    .line 172
    :goto_1
    return-object v2

    .line 173
    :pswitch_0
    check-cast v10, Lxk1;

    .line 174
    .line 175
    move-object/from16 v1, p1

    .line 176
    .line 177
    check-cast v1, Lpb2;

    .line 178
    .line 179
    move-object/from16 v7, p2

    .line 180
    .line 181
    check-cast v7, Lpx;

    .line 182
    .line 183
    move-object/from16 v14, p3

    .line 184
    .line 185
    check-cast v14, Ljava/lang/Integer;

    .line 186
    .line 187
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 188
    .line 189
    .line 190
    move-result v14

    .line 191
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    and-int/lit8 v15, v14, 0x6

    .line 195
    .line 196
    if-nez v15, :cond_7

    .line 197
    .line 198
    move-object v15, v7

    .line 199
    check-cast v15, Lgo0;

    .line 200
    .line 201
    invoke-virtual {v15, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v15

    .line 205
    if-eqz v15, :cond_6

    .line 206
    .line 207
    move/from16 v16, v8

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_6
    const/16 v16, 0x2

    .line 211
    .line 212
    :goto_2
    or-int v14, v14, v16

    .line 213
    .line 214
    :cond_7
    and-int/lit8 v8, v14, 0x13

    .line 215
    .line 216
    if-eq v8, v6, :cond_8

    .line 217
    .line 218
    move v9, v13

    .line 219
    :cond_8
    and-int/lit8 v6, v14, 0x1

    .line 220
    .line 221
    check-cast v7, Lgo0;

    .line 222
    .line 223
    invoke-virtual {v7, v6, v9}, Lgo0;->O(IZ)Z

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    if-eqz v6, :cond_b

    .line 228
    .line 229
    invoke-static {v5, v7}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v14

    .line 233
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 234
    .line 235
    .line 236
    move-result-object v16

    .line 237
    const/16 v20, 0x0

    .line 238
    .line 239
    const/16 v21, 0x38

    .line 240
    .line 241
    iget-object v15, v0, Lfe;->i:Lxm0;

    .line 242
    .line 243
    const/16 v17, 0x0

    .line 244
    .line 245
    const/16 v18, 0x0

    .line 246
    .line 247
    move-object/from16 v19, v7

    .line 248
    .line 249
    invoke-static/range {v14 .. v21}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 250
    .line 251
    .line 252
    invoke-static {v4, v7}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v14

    .line 256
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 257
    .line 258
    .line 259
    move-result-object v16

    .line 260
    invoke-virtual {v7, v12}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    invoke-virtual {v7, v11}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    or-int/2addr v1, v4

    .line 269
    invoke-virtual {v7, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    or-int/2addr v1, v4

    .line 274
    invoke-virtual {v7}, Lgo0;->L()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    if-nez v1, :cond_9

    .line 279
    .line 280
    if-ne v4, v3, :cond_a

    .line 281
    .line 282
    :cond_9
    new-instance v4, Ls1;

    .line 283
    .line 284
    invoke-direct {v4, v12, v11, v10, v13}, Ls1;-><init>(Ljava/lang/Object;Lxk1;Lxk1;I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    :cond_a
    move-object v15, v4

    .line 291
    check-cast v15, Lxm0;

    .line 292
    .line 293
    const/16 v20, 0x0

    .line 294
    .line 295
    const/16 v21, 0x30

    .line 296
    .line 297
    iget-boolean v0, v0, Lfe;->l:Z

    .line 298
    .line 299
    const/16 v18, 0x0

    .line 300
    .line 301
    move/from16 v17, v0

    .line 302
    .line 303
    move-object/from16 v19, v7

    .line 304
    .line 305
    invoke-static/range {v14 .. v21}, Lse;->q(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 306
    .line 307
    .line 308
    goto :goto_3

    .line 309
    :cond_b
    move-object/from16 v19, v7

    .line 310
    .line 311
    invoke-virtual/range {v19 .. v19}, Lgo0;->R()V

    .line 312
    .line 313
    .line 314
    :goto_3
    return-object v2

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
