.class public final synthetic Ljk2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lcq1;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Lxk1;

.field public final synthetic n:Lxk1;

.field public final synthetic o:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lcq1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxk1;Lxk1;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljk2;->h:Lcq1;

    .line 5
    .line 6
    iput-object p2, p0, Ljk2;->i:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Ljk2;->j:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Ljk2;->k:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Ljk2;->l:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Ljk2;->m:Lxk1;

    .line 15
    .line 16
    iput-object p7, p0, Ljk2;->n:Lxk1;

    .line 17
    .line 18
    iput-object p8, p0, Ljk2;->o:Lxk1;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ljk2;->h:Lcq1;

    .line 4
    .line 5
    iget-object v2, v1, Lcq1;->j:Ljava/util/List;

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    check-cast v3, Lpx;

    .line 10
    .line 11
    move-object/from16 v4, p2

    .line 12
    .line 13
    check-cast v4, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    and-int/lit8 v5, v4, 0x3

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    const/4 v7, 0x1

    .line 23
    const/4 v8, 0x0

    .line 24
    if-eq v5, v6, :cond_0

    .line 25
    .line 26
    move v5, v7

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v5, v8

    .line 29
    :goto_0
    and-int/2addr v4, v7

    .line 30
    check-cast v3, Lgo0;

    .line 31
    .line 32
    invoke-virtual {v3, v4, v5}, Lgo0;->O(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_b

    .line 37
    .line 38
    const v4, 0x790b01f8

    .line 39
    .line 40
    .line 41
    invoke-static {v4, v3}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    iget-object v4, v1, Lcq1;->i:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    const/4 v6, 0x0

    .line 52
    if-nez v5, :cond_1

    .line 53
    .line 54
    move-object v10, v4

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object v10, v6

    .line 57
    :goto_1
    if-eqz v10, :cond_2

    .line 58
    .line 59
    const/4 v14, 0x0

    .line 60
    const/16 v15, 0x3e

    .line 61
    .line 62
    iget-object v11, v0, Ljk2;->i:Ljava/lang/String;

    .line 63
    .line 64
    const/4 v12, 0x0

    .line 65
    const/4 v13, 0x0

    .line 66
    invoke-static/range {v10 .. v15}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    :cond_2
    if-nez v6, :cond_3

    .line 71
    .line 72
    const v4, -0x5696e7b1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v4}, Lgo0;->W(I)V

    .line 76
    .line 77
    .line 78
    const v4, 0x790b0207

    .line 79
    .line 80
    .line 81
    invoke-static {v4, v3}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    :goto_2
    invoke-virtual {v3, v8}, Lgo0;->p(Z)V

    .line 86
    .line 87
    .line 88
    move-object v11, v6

    .line 89
    goto :goto_3

    .line 90
    :cond_3
    const v4, -0x5697015d

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v4}, Lgo0;->W(I)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :goto_3
    const/16 v19, 0x0

    .line 98
    .line 99
    const/16 v20, 0x1fa

    .line 100
    .line 101
    const/4 v10, 0x0

    .line 102
    const/4 v12, 0x0

    .line 103
    const/4 v13, 0x0

    .line 104
    const/4 v14, 0x0

    .line 105
    const/4 v15, 0x0

    .line 106
    const/16 v16, 0x0

    .line 107
    .line 108
    const/16 v17, 0x0

    .line 109
    .line 110
    move-object/from16 v18, v3

    .line 111
    .line 112
    invoke-static/range {v9 .. v20}, Lsp0;->g(Ljava/lang/String;Luh1;Ljava/lang/String;Lmn0;Lmn0;Lmn0;ZLxm0;Lin0;Lpx;II)V

    .line 113
    .line 114
    .line 115
    move-object/from16 v9, v18

    .line 116
    .line 117
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-nez v3, :cond_a

    .line 122
    .line 123
    const v3, -0x7c42023a

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9, v3}, Lgo0;->W(I)V

    .line 127
    .line 128
    .line 129
    const v3, 0x790b01f6

    .line 130
    .line 131
    .line 132
    invoke-static {v3, v9}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    iget-object v3, v0, Ljk2;->j:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v9, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    sget-object v11, Lnx;->a:Leb;

    .line 147
    .line 148
    if-nez v4, :cond_4

    .line 149
    .line 150
    if-ne v5, v11, :cond_5

    .line 151
    .line 152
    :cond_4
    new-instance v5, Lv;

    .line 153
    .line 154
    const/16 v4, 0x1a

    .line 155
    .line 156
    invoke-direct {v5, v4, v3}, Lv;-><init>(ILjava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v9, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_5
    move-object v6, v5

    .line 163
    check-cast v6, Lin0;

    .line 164
    .line 165
    const/16 v7, 0x1e

    .line 166
    .line 167
    const-string v3, "\n"

    .line 168
    .line 169
    const/4 v4, 0x0

    .line 170
    const/4 v5, 0x0

    .line 171
    invoke-static/range {v2 .. v7}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    iget-boolean v2, v1, Lcq1;->k:Z

    .line 176
    .line 177
    if-eqz v2, :cond_6

    .line 178
    .line 179
    iget-object v3, v0, Ljk2;->k:Ljava/lang/String;

    .line 180
    .line 181
    :goto_4
    move-object v14, v3

    .line 182
    goto :goto_5

    .line 183
    :cond_6
    iget-object v3, v0, Ljk2;->l:Ljava/lang/String;

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :goto_5
    if-eqz v2, :cond_7

    .line 187
    .line 188
    const v2, -0x7c3588be

    .line 189
    .line 190
    .line 191
    invoke-virtual {v9, v2}, Lgo0;->W(I)V

    .line 192
    .line 193
    .line 194
    sget-object v2, Lur1;->a:Ltu2;

    .line 195
    .line 196
    invoke-virtual {v9, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    check-cast v2, Llp1;

    .line 201
    .line 202
    iget-wide v2, v2, Llp1;->f:J

    .line 203
    .line 204
    invoke-virtual {v9, v8}, Lgo0;->p(Z)V

    .line 205
    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_7
    const v2, -0x7c33c817

    .line 209
    .line 210
    .line 211
    invoke-virtual {v9, v2}, Lgo0;->W(I)V

    .line 212
    .line 213
    .line 214
    sget-object v2, Lur1;->a:Ltu2;

    .line 215
    .line 216
    invoke-virtual {v9, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    check-cast v2, Llp1;

    .line 221
    .line 222
    iget-wide v2, v2, Llp1;->g:J

    .line 223
    .line 224
    invoke-virtual {v9, v8}, Lgo0;->p(Z)V

    .line 225
    .line 226
    .line 227
    :goto_6
    invoke-virtual {v9, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    if-nez v4, :cond_8

    .line 236
    .line 237
    if-ne v5, v11, :cond_9

    .line 238
    .line 239
    :cond_8
    new-instance v5, Ldz0;

    .line 240
    .line 241
    iget-object v4, v0, Ljk2;->m:Lxk1;

    .line 242
    .line 243
    iget-object v6, v0, Ljk2;->n:Lxk1;

    .line 244
    .line 245
    iget-object v0, v0, Ljk2;->o:Lxk1;

    .line 246
    .line 247
    invoke-direct {v5, v1, v4, v6, v0}, Ldz0;-><init>(Lcq1;Lxk1;Lxk1;Lxk1;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v9, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :cond_9
    check-cast v5, Lxm0;

    .line 254
    .line 255
    new-instance v15, Lju;

    .line 256
    .line 257
    invoke-direct {v15, v2, v3}, Lju;-><init>(J)V

    .line 258
    .line 259
    .line 260
    const/16 v19, 0x0

    .line 261
    .line 262
    const/16 v20, 0x194

    .line 263
    .line 264
    const/4 v11, 0x0

    .line 265
    const/4 v13, 0x0

    .line 266
    const/16 v16, 0x0

    .line 267
    .line 268
    const/16 v17, 0x0

    .line 269
    .line 270
    move-object/from16 v18, v9

    .line 271
    .line 272
    move-object v9, v10

    .line 273
    move-object v10, v5

    .line 274
    invoke-static/range {v9 .. v20}, Lqp0;->h(Ljava/lang/String;Lxm0;Luh1;Ljava/lang/String;Lmn0;Ljava/lang/String;Lju;ZLin0;Lpx;II)V

    .line 275
    .line 276
    .line 277
    move-object/from16 v9, v18

    .line 278
    .line 279
    invoke-virtual {v9, v8}, Lgo0;->p(Z)V

    .line 280
    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_a
    const v0, -0x7c2450b0

    .line 284
    .line 285
    .line 286
    invoke-virtual {v9, v0}, Lgo0;->W(I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v9, v8}, Lgo0;->p(Z)V

    .line 290
    .line 291
    .line 292
    goto :goto_7

    .line 293
    :cond_b
    move-object v9, v3

    .line 294
    invoke-virtual {v9}, Lgo0;->R()V

    .line 295
    .line 296
    .line 297
    :goto_7
    sget-object v0, La83;->a:La83;

    .line 298
    .line 299
    return-object v0
.end method
