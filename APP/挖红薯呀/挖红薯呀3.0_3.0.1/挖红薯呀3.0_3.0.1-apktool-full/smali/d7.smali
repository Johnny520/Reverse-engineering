.class public final Ld7;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhu;Lz31;Ljava/lang/Float;Lik;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ld7;->h:I

    .line 16
    iput-object p1, p0, Ld7;->k:Ljava/lang/Object;

    iput-object p2, p0, Ld7;->l:Ljava/lang/Object;

    iput-object p3, p0, Ld7;->m:Ljava/lang/Object;

    invoke-direct {p0, v0, p4}, Lm51;-><init>(ILik;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V
    .locals 0

    .line 1
    iput p6, p0, Ld7;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Ld7;->j:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ld7;->k:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Ld7;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Ld7;->m:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p5}, Lm51;-><init>(ILik;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 12

    .line 1
    iget v0, p0, Ld7;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Ld7;->m:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Ld7;->l:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Ld7;->k:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v4, Ld7;

    .line 13
    .line 14
    iget-object p0, p0, Ld7;->j:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v5, p0

    .line 17
    check-cast v5, Lv31;

    .line 18
    .line 19
    move-object v6, v3

    .line 20
    check-cast v6, Lhu;

    .line 21
    .line 22
    move-object v7, v2

    .line 23
    check-cast v7, Lz31;

    .line 24
    .line 25
    move-object v8, v1

    .line 26
    check-cast v8, Ljava/lang/Float;

    .line 27
    .line 28
    const/4 v10, 0x3

    .line 29
    move-object v9, p2

    .line 30
    invoke-direct/range {v4 .. v10}, Ld7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 31
    .line 32
    .line 33
    return-object v4

    .line 34
    :pswitch_0
    move-object v10, p2

    .line 35
    new-instance p0, Ld7;

    .line 36
    .line 37
    check-cast v3, Lhu;

    .line 38
    .line 39
    check-cast v2, Lz31;

    .line 40
    .line 41
    check-cast v1, Ljava/lang/Float;

    .line 42
    .line 43
    invoke-direct {p0, v3, v2, v1, v10}, Ld7;-><init>(Lhu;Lz31;Ljava/lang/Float;Lik;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Ld7;->j:Ljava/lang/Object;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_1
    move-object v10, p2

    .line 50
    new-instance v5, Ld7;

    .line 51
    .line 52
    iget-object p0, p0, Ld7;->j:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v6, p0

    .line 55
    check-cast v6, Lai;

    .line 56
    .line 57
    move-object v7, v3

    .line 58
    check-cast v7, Landroid/view/ScrollCaptureSession;

    .line 59
    .line 60
    move-object v8, v2

    .line 61
    check-cast v8, Landroid/graphics/Rect;

    .line 62
    .line 63
    move-object v9, v1

    .line 64
    check-cast v9, Ljava/util/function/Consumer;

    .line 65
    .line 66
    const/4 v11, 0x1

    .line 67
    invoke-direct/range {v5 .. v11}, Ld7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 68
    .line 69
    .line 70
    return-object v5

    .line 71
    :pswitch_2
    move-object v10, p2

    .line 72
    new-instance v5, Ld7;

    .line 73
    .line 74
    iget-object v6, p0, Ld7;->j:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v7, v3

    .line 77
    check-cast v7, Lb7;

    .line 78
    .line 79
    move-object v8, v2

    .line 80
    check-cast v8, Loh0;

    .line 81
    .line 82
    move-object v9, v1

    .line 83
    check-cast v9, Loh0;

    .line 84
    .line 85
    const/4 v11, 0x0

    .line 86
    invoke-direct/range {v5 .. v11}, Ld7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 87
    .line 88
    .line 89
    return-object v5

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ld7;->h:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lyk;

    .line 9
    .line 10
    check-cast p2, Lik;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Ld7;->g(Ljava/lang/Object;Lik;)Lik;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ld7;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ld7;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lh11;

    .line 24
    .line 25
    check-cast p2, Lik;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Ld7;->g(Ljava/lang/Object;Lik;)Lik;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ld7;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Ld7;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_1
    check-cast p1, Lyk;

    .line 39
    .line 40
    check-cast p2, Lik;

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Ld7;->g(Ljava/lang/Object;Lik;)Lik;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Ld7;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Ld7;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_2
    check-cast p1, Lyk;

    .line 54
    .line 55
    check-cast p2, Lik;

    .line 56
    .line 57
    invoke-virtual {p0, p1, p2}, Ld7;->g(Ljava/lang/Object;Lik;)Lik;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Ld7;

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Ld7;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    iget v0, v4, Ld7;->h:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    iget-object v6, v4, Ld7;->m:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    sget-object v7, Lzk;->d:Lzk;

    .line 11
    .line 12
    iget-object v3, v4, Ld7;->l:Ljava/lang/Object;

    .line 13
    .line 14
    sget-object v8, Lna1;->a:Lna1;

    .line 15
    .line 16
    iget-object v5, v4, Ld7;->k:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v9, 0x1

    .line 19
    const/4 v10, 0x0

    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v5, Lhu;

    .line 24
    .line 25
    check-cast v3, Lz31;

    .line 26
    .line 27
    iget v0, v4, Ld7;->i:I

    .line 28
    .line 29
    const/4 v11, 0x4

    .line 30
    const/4 v12, 0x3

    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    if-eq v0, v9, :cond_0

    .line 34
    .line 35
    if-eq v0, v1, :cond_3

    .line 36
    .line 37
    if-eq v0, v12, :cond_0

    .line 38
    .line 39
    if-ne v0, v11, :cond_2

    .line 40
    .line 41
    :cond_0
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    move-object v7, v8

    .line 45
    goto/16 :goto_3

    .line 46
    .line 47
    :cond_2
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    move-object v7, v10

    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_3
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, v4, Ld7;->j:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lv31;

    .line 63
    .line 64
    sget-object v2, Li11;->a:Ljo0;

    .line 65
    .line 66
    if-ne v0, v2, :cond_5

    .line 67
    .line 68
    iput v9, v4, Ld7;->i:I

    .line 69
    .line 70
    invoke-interface {v5, v3, v4}, Lhu;->b(Liu;Lik;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-ne v0, v7, :cond_1

    .line 75
    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :cond_5
    sget-object v2, Li11;->b:Ljo0;

    .line 79
    .line 80
    if-ne v0, v2, :cond_7

    .line 81
    .line 82
    invoke-virtual {v3}, Lm0;->h()Lb51;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    new-instance v2, Lpu;

    .line 87
    .line 88
    invoke-direct {v2, v1, v10}, Lm51;-><init>(ILik;)V

    .line 89
    .line 90
    .line 91
    iput v1, v4, Ld7;->i:I

    .line 92
    .line 93
    invoke-static {v0, v2, v4}, Lrd0;->r(Lhu;Lww;Ljk;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    if-ne v0, v7, :cond_6

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_6
    :goto_0
    iput v12, v4, Ld7;->i:I

    .line 101
    .line 102
    invoke-interface {v5, v3, v4}, Lhu;->b(Liu;Lik;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-ne v0, v7, :cond_1

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_7
    invoke-virtual {v3}, Lm0;->h()Lb51;

    .line 110
    .line 111
    .line 112
    move-result-object v14

    .line 113
    new-instance v13, Lu31;

    .line 114
    .line 115
    invoke-direct {v13, v0, v10}, Lu31;-><init>(Lv31;Lik;)V

    .line 116
    .line 117
    .line 118
    sget v0, Lmu;->a:I

    .line 119
    .line 120
    new-instance v12, Ltd;

    .line 121
    .line 122
    sget-object v15, Lfs;->d:Lfs;

    .line 123
    .line 124
    const/16 v16, -0x2

    .line 125
    .line 126
    sget-object v17, Ltb;->d:Ltb;

    .line 127
    .line 128
    invoke-direct/range {v12 .. v17}, Ltd;-><init>(Lxw;Lhu;Lpk;ILtb;)V

    .line 129
    .line 130
    .line 131
    new-instance v0, Lkt0;

    .line 132
    .line 133
    invoke-direct {v0, v1, v10, v9}, Lkt0;-><init>(ILik;I)V

    .line 134
    .line 135
    .line 136
    new-instance v1, Ld;

    .line 137
    .line 138
    invoke-direct {v1, v11, v12, v0}, Ld;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v1}, Lrd0;->n(Lhu;)Lhu;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {v0}, Lrd0;->n(Lhu;)Lhu;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    new-instance v1, Ld7;

    .line 150
    .line 151
    check-cast v6, Ljava/lang/Float;

    .line 152
    .line 153
    invoke-direct {v1, v5, v3, v6, v10}, Ld7;-><init>(Lhu;Lz31;Ljava/lang/Float;Lik;)V

    .line 154
    .line 155
    .line 156
    iput v11, v4, Ld7;->i:I

    .line 157
    .line 158
    new-instance v2, Llu;

    .line 159
    .line 160
    invoke-direct {v2, v1, v10}, Llu;-><init>(Ld7;Lik;)V

    .line 161
    .line 162
    .line 163
    move-object/from16 v18, v15

    .line 164
    .line 165
    new-instance v15, Ltd;

    .line 166
    .line 167
    const/16 v19, -0x2

    .line 168
    .line 169
    move-object/from16 v16, v2

    .line 170
    .line 171
    move-object/from16 v20, v17

    .line 172
    .line 173
    move-object/from16 v17, v0

    .line 174
    .line 175
    invoke-direct/range {v15 .. v20}, Ltd;-><init>(Lxw;Lhu;Lpk;ILtb;)V

    .line 176
    .line 177
    .line 178
    move-object/from16 v0, v18

    .line 179
    .line 180
    move-object/from16 v1, v20

    .line 181
    .line 182
    const/4 v2, 0x0

    .line 183
    invoke-interface {v15, v0, v2, v1}, Lix;->c(Lpk;ILtb;)Lhu;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    sget-object v1, Lyj0;->d:Lyj0;

    .line 188
    .line 189
    invoke-interface {v0, v1, v4}, Lhu;->b(Liu;Lik;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    if-ne v0, v7, :cond_8

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_8
    move-object v0, v8

    .line 197
    :goto_1
    if-ne v0, v7, :cond_9

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_9
    move-object v0, v8

    .line 201
    :goto_2
    if-ne v0, v7, :cond_1

    .line 202
    .line 203
    :goto_3
    return-object v7

    .line 204
    :pswitch_0
    check-cast v3, Lz31;

    .line 205
    .line 206
    iget v0, v4, Ld7;->i:I

    .line 207
    .line 208
    if-eqz v0, :cond_b

    .line 209
    .line 210
    if-ne v0, v9, :cond_a

    .line 211
    .line 212
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_a
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    :goto_4
    move-object v7, v10

    .line 220
    goto :goto_6

    .line 221
    :cond_b
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    iget-object v0, v4, Ld7;->j:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v0, Lh11;

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_e

    .line 233
    .line 234
    if-eq v0, v9, :cond_f

    .line 235
    .line 236
    if-ne v0, v1, :cond_d

    .line 237
    .line 238
    check-cast v6, Ljava/lang/Float;

    .line 239
    .line 240
    sget-object v0, Lkl;->v:Lzr;

    .line 241
    .line 242
    if-eq v6, v0, :cond_c

    .line 243
    .line 244
    invoke-virtual {v3, v10, v6}, Lz31;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_c
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 249
    .line 250
    const-string v1, "MutableStateFlow.resetReplayCache is not supported"

    .line 251
    .line 252
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw v0

    .line 256
    :cond_d
    invoke-static {}, Lxc;->j()V

    .line 257
    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_e
    check-cast v5, Lhu;

    .line 261
    .line 262
    iput v9, v4, Ld7;->i:I

    .line 263
    .line 264
    invoke-interface {v5, v3, v4}, Lhu;->b(Liu;Lik;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    if-ne v0, v7, :cond_f

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_f
    :goto_5
    move-object v7, v8

    .line 272
    :goto_6
    return-object v7

    .line 273
    :pswitch_1
    iget v0, v4, Ld7;->i:I

    .line 274
    .line 275
    if-eqz v0, :cond_11

    .line 276
    .line 277
    if-ne v0, v9, :cond_10

    .line 278
    .line 279
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    move-object/from16 v0, p1

    .line 283
    .line 284
    goto :goto_7

    .line 285
    :cond_10
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    move-object v7, v10

    .line 289
    goto :goto_8

    .line 290
    :cond_11
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    iget-object v0, v4, Ld7;->j:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v0, Lai;

    .line 296
    .line 297
    check-cast v5, Landroid/view/ScrollCaptureSession;

    .line 298
    .line 299
    check-cast v3, Landroid/graphics/Rect;

    .line 300
    .line 301
    new-instance v1, La30;

    .line 302
    .line 303
    iget v2, v3, Landroid/graphics/Rect;->left:I

    .line 304
    .line 305
    iget v10, v3, Landroid/graphics/Rect;->top:I

    .line 306
    .line 307
    iget v11, v3, Landroid/graphics/Rect;->right:I

    .line 308
    .line 309
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 310
    .line 311
    invoke-direct {v1, v2, v10, v11, v3}, La30;-><init>(IIII)V

    .line 312
    .line 313
    .line 314
    iput v9, v4, Ld7;->i:I

    .line 315
    .line 316
    invoke-static {v0, v5, v1, v4}, Lai;->a(Lai;Landroid/view/ScrollCaptureSession;La30;Ljk;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    if-ne v0, v7, :cond_12

    .line 321
    .line 322
    goto :goto_8

    .line 323
    :cond_12
    :goto_7
    check-cast v0, La30;

    .line 324
    .line 325
    check-cast v6, Ljava/util/function/Consumer;

    .line 326
    .line 327
    invoke-static {v0}, Lu50;->B(La30;)Landroid/graphics/Rect;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-interface {v6, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    move-object v7, v8

    .line 335
    :goto_8
    return-object v7

    .line 336
    :pswitch_2
    move-object v11, v5

    .line 337
    check-cast v11, Lb7;

    .line 338
    .line 339
    iget v0, v4, Ld7;->i:I

    .line 340
    .line 341
    if-eqz v0, :cond_14

    .line 342
    .line 343
    if-ne v0, v9, :cond_13

    .line 344
    .line 345
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    goto :goto_9

    .line 349
    :cond_13
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    move-object v7, v10

    .line 353
    goto :goto_a

    .line 354
    :cond_14
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    iget-object v0, v4, Ld7;->j:Ljava/lang/Object;

    .line 358
    .line 359
    iget-object v1, v11, Lb7;->e:Lgp0;

    .line 360
    .line 361
    invoke-virtual {v1}, Lgp0;->getValue()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-nez v0, :cond_16

    .line 370
    .line 371
    move-object v0, v5

    .line 372
    check-cast v0, Lb7;

    .line 373
    .line 374
    iget-object v1, v4, Ld7;->j:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v3, Loh0;

    .line 377
    .line 378
    sget-object v2, Lf7;->a:Lo31;

    .line 379
    .line 380
    invoke-interface {v3}, Lw31;->getValue()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    check-cast v2, Lv7;

    .line 385
    .line 386
    iput v9, v4, Ld7;->i:I

    .line 387
    .line 388
    const/4 v3, 0x0

    .line 389
    const/16 v5, 0xc

    .line 390
    .line 391
    invoke-static/range {v0 .. v5}, Lb7;->c(Lb7;Ljava/lang/Object;Lv7;Lsw;Lm51;I)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    if-ne v0, v7, :cond_15

    .line 396
    .line 397
    goto :goto_a

    .line 398
    :cond_15
    :goto_9
    check-cast v6, Loh0;

    .line 399
    .line 400
    sget-object v0, Lf7;->a:Lo31;

    .line 401
    .line 402
    invoke-interface {v6}, Lw31;->getValue()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    check-cast v0, Lsw;

    .line 407
    .line 408
    if-eqz v0, :cond_16

    .line 409
    .line 410
    invoke-virtual {v11}, Lb7;->d()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-interface {v0, v1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    :cond_16
    move-object v7, v8

    .line 418
    :goto_a
    return-object v7

    .line 419
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
