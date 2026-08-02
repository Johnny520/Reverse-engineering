.class public final Lf2;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public m:I

.field public final synthetic n:J

.field public o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLt00;Lp02;Ljava/lang/CharSequence;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lf2;->l:I

    .line 17
    iput-object p4, p0, Lf2;->p:Ljava/lang/Object;

    iput-object p5, p0, Lf2;->q:Ljava/lang/Object;

    iput-wide p1, p0, Lf2;->n:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JLjava/lang/Object;Lt00;I)V
    .locals 0

    .line 18
    iput p6, p0, Lf2;->l:I

    iput-object p1, p0, Lf2;->p:Ljava/lang/Object;

    iput-wide p2, p0, Lf2;->n:J

    iput-object p4, p0, Lf2;->q:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ltw2;-><init>(ILt00;)V

    return-void
.end method

.method public constructor <init>(Lvy2;JLzy2;Luy2;Lt00;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lf2;->l:I

    .line 3
    .line 4
    iput-object p1, p0, Lf2;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p2, p0, Lf2;->n:J

    .line 7
    .line 8
    iput-object p4, p0, Lf2;->p:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p5, p0, Lf2;->q:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p6}, Ltw2;-><init>(ILt00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lf2;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lj20;

    .line 9
    .line 10
    check-cast p2, Lt00;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lf2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lf2;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lf2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lgm2;

    .line 24
    .line 25
    check-cast p2, Lt00;

    .line 26
    .line 27
    invoke-virtual {p0, p2, p1}, Lf2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lf2;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lf2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_1
    check-cast p1, Landroid/view/textclassifier/TextClassifier;

    .line 39
    .line 40
    check-cast p2, Lt00;

    .line 41
    .line 42
    invoke-virtual {p0, p2, p1}, Lf2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lf2;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lf2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_2
    check-cast p1, Lj20;

    .line 54
    .line 55
    check-cast p2, Lt00;

    .line 56
    .line 57
    invoke-virtual {p0, p2, p1}, Lf2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Lf2;

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Lf2;->r(Ljava/lang/Object;)Ljava/lang/Object;

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

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 11

    .line 1
    iget v0, p0, Lf2;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Lf2;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lf2;->p:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, Lf2;

    .line 11
    .line 12
    iget-object p2, p0, Lf2;->o:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, p2

    .line 15
    check-cast v4, Lvy2;

    .line 16
    .line 17
    move-object v7, v2

    .line 18
    check-cast v7, Lzy2;

    .line 19
    .line 20
    move-object v8, v1

    .line 21
    check-cast v8, Luy2;

    .line 22
    .line 23
    iget-wide v5, p0, Lf2;->n:J

    .line 24
    .line 25
    move-object v9, p1

    .line 26
    invoke-direct/range {v3 .. v9}, Lf2;-><init>(Lvy2;JLzy2;Luy2;Lt00;)V

    .line 27
    .line 28
    .line 29
    return-object v3

    .line 30
    :pswitch_0
    move-object v9, p1

    .line 31
    new-instance v4, Lf2;

    .line 32
    .line 33
    move-object v5, v2

    .line 34
    check-cast v5, Lim2;

    .line 35
    .line 36
    move-object v8, v1

    .line 37
    check-cast v8, Lz62;

    .line 38
    .line 39
    const/4 v10, 0x2

    .line 40
    iget-wide v6, p0, Lf2;->n:J

    .line 41
    .line 42
    invoke-direct/range {v4 .. v10}, Lf2;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lt00;I)V

    .line 43
    .line 44
    .line 45
    iput-object p2, v4, Lf2;->o:Ljava/lang/Object;

    .line 46
    .line 47
    return-object v4

    .line 48
    :pswitch_1
    move-object v9, p1

    .line 49
    new-instance v4, Lf2;

    .line 50
    .line 51
    move-object v8, v2

    .line 52
    check-cast v8, Lp02;

    .line 53
    .line 54
    check-cast v1, Ljava/lang/CharSequence;

    .line 55
    .line 56
    iget-wide v5, p0, Lf2;->n:J

    .line 57
    .line 58
    move-object v7, v9

    .line 59
    move-object v9, v1

    .line 60
    invoke-direct/range {v4 .. v9}, Lf2;-><init>(JLt00;Lp02;Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    iput-object p2, v4, Lf2;->o:Ljava/lang/Object;

    .line 64
    .line 65
    return-object v4

    .line 66
    :pswitch_2
    move-object v9, p1

    .line 67
    new-instance v4, Lf2;

    .line 68
    .line 69
    move-object v5, v2

    .line 70
    check-cast v5, Lk21;

    .line 71
    .line 72
    move-object v8, v1

    .line 73
    check-cast v8, Lbk1;

    .line 74
    .line 75
    const/4 v10, 0x0

    .line 76
    iget-wide v6, p0, Lf2;->n:J

    .line 77
    .line 78
    invoke-direct/range {v4 .. v10}, Lf2;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lt00;I)V

    .line 79
    .line 80
    .line 81
    return-object v4

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget v0, v5, Lf2;->l:I

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    iget-wide v2, v5, Lf2;->n:J

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    iget-object v6, v5, Lf2;->q:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v7, v5, Lf2;->p:Ljava/lang/Object;

    .line 12
    .line 13
    const-string v8, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    sget-object v9, Lk20;->h:Lk20;

    .line 16
    .line 17
    const/4 v10, 0x1

    .line 18
    sget-object v11, La83;->a:La83;

    .line 19
    .line 20
    const/4 v12, 0x0

    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    iget v0, v5, Lf2;->m:I

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    if-eq v0, v10, :cond_1

    .line 29
    .line 30
    if-ne v0, v4, :cond_0

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-static {v8}, Ls;->l(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    move-object v9, v12

    .line 40
    goto :goto_2

    .line 41
    :cond_1
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v5, Lf2;->o:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lvy2;

    .line 51
    .line 52
    iget-object v0, v0, Lvy2;->x:Luz2;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iput v10, v5, Lf2;->m:I

    .line 57
    .line 58
    new-instance v1, Luz2;

    .line 59
    .line 60
    iget-object v0, v0, Luz2;->n:Lb03;

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-direct {v1, v0, v5, v2}, Luz2;-><init>(Lb03;Lt00;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v11}, Luz2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-ne v0, v9, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :goto_0
    check-cast v7, Lzy2;

    .line 74
    .line 75
    check-cast v6, Luy2;

    .line 76
    .line 77
    iput v4, v5, Lf2;->m:I

    .line 78
    .line 79
    invoke-interface {v7, v6, v5}, Lzy2;->a(Lry2;Ltw2;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-ne v0, v9, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    :goto_1
    move-object v9, v11

    .line 87
    :goto_2
    return-object v9

    .line 88
    :pswitch_0
    check-cast v7, Lim2;

    .line 89
    .line 90
    iget v0, v5, Lf2;->m:I

    .line 91
    .line 92
    if-eqz v0, :cond_7

    .line 93
    .line 94
    if-ne v0, v10, :cond_6

    .line 95
    .line 96
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_5
    move-object v9, v11

    .line 100
    goto/16 :goto_5

    .line 101
    .line 102
    :cond_6
    invoke-static {v8}, Ls;->l(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    move-object v9, v12

    .line 106
    goto/16 :goto_5

    .line 107
    .line 108
    :cond_7
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, v5, Lf2;->o:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Lgm2;

    .line 114
    .line 115
    invoke-virtual {v7, v2, v3}, Lim2;->g(J)F

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    check-cast v6, Lz62;

    .line 120
    .line 121
    new-instance v3, Ltt0;

    .line 122
    .line 123
    const/16 v4, 0xa

    .line 124
    .line 125
    invoke-direct {v3, v6, v7, v0, v4}, Ltt0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    iput v10, v5, Lf2;->m:I

    .line 129
    .line 130
    const/4 v0, 0x7

    .line 131
    const/4 v4, 0x0

    .line 132
    invoke-static {v4, v4, v12, v0}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 133
    .line 134
    .line 135
    move-result-object v14

    .line 136
    sget-object v15, Lrg3;->n:Ln43;

    .line 137
    .line 138
    new-instance v0, Ljava/lang/Float;

    .line 139
    .line 140
    invoke-direct {v0, v4}, Ljava/lang/Float;-><init>(F)V

    .line 141
    .line 142
    .line 143
    new-instance v6, Ljava/lang/Float;

    .line 144
    .line 145
    invoke-direct {v6, v2}, Ljava/lang/Float;-><init>(F)V

    .line 146
    .line 147
    .line 148
    new-instance v2, Ljava/lang/Float;

    .line 149
    .line 150
    invoke-direct {v2, v4}, Ljava/lang/Float;-><init>(F)V

    .line 151
    .line 152
    .line 153
    iget-object v4, v15, Ln43;->a:Lin0;

    .line 154
    .line 155
    invoke-interface {v4, v2}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    check-cast v2, Lnd;

    .line 160
    .line 161
    if-nez v2, :cond_8

    .line 162
    .line 163
    invoke-interface {v4, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    check-cast v2, Lnd;

    .line 168
    .line 169
    invoke-virtual {v2}, Lnd;->c()Lnd;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    :cond_8
    move-object/from16 v18, v2

    .line 174
    .line 175
    new-instance v13, Lcy2;

    .line 176
    .line 177
    move-object/from16 v16, v0

    .line 178
    .line 179
    move-object/from16 v17, v6

    .line 180
    .line 181
    invoke-direct/range {v13 .. v18}, Lcy2;-><init>(Lhd;Ln43;Ljava/lang/Object;Ljava/lang/Object;Lnd;)V

    .line 182
    .line 183
    .line 184
    move-object/from16 v2, v18

    .line 185
    .line 186
    new-instance v4, Lid;

    .line 187
    .line 188
    const/16 v6, 0x38

    .line 189
    .line 190
    invoke-direct {v4, v15, v0, v2, v6}, Lid;-><init>(Ln43;Ljava/lang/Object;Lnd;I)V

    .line 191
    .line 192
    .line 193
    move-object v0, v4

    .line 194
    new-instance v4, Lxq2;

    .line 195
    .line 196
    invoke-direct {v4, v1, v3}, Lxq2;-><init>(ILjava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    const-wide/high16 v2, -0x8000000000000000L

    .line 200
    .line 201
    move-object v1, v13

    .line 202
    invoke-static/range {v0 .. v5}, Lte;->m(Lid;Led;JLin0;Lt00;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    if-ne v0, v9, :cond_9

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_9
    move-object v0, v11

    .line 210
    :goto_3
    if-ne v0, v9, :cond_a

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_a
    move-object v0, v11

    .line 214
    :goto_4
    if-ne v0, v9, :cond_5

    .line 215
    .line 216
    :goto_5
    return-object v9

    .line 217
    :pswitch_1
    iget v0, v5, Lf2;->m:I

    .line 218
    .line 219
    if-eqz v0, :cond_c

    .line 220
    .line 221
    if-ne v0, v10, :cond_b

    .line 222
    .line 223
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_b
    invoke-static {v8}, Ls;->l(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    move-object v9, v12

    .line 231
    goto :goto_7

    .line 232
    :cond_c
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    iget-object v0, v5, Lf2;->o:Ljava/lang/Object;

    .line 236
    .line 237
    move-object v4, v0

    .line 238
    check-cast v4, Landroid/view/textclassifier/TextClassifier;

    .line 239
    .line 240
    move-object v0, v7

    .line 241
    check-cast v0, Lp02;

    .line 242
    .line 243
    move-object v1, v6

    .line 244
    check-cast v1, Ljava/lang/CharSequence;

    .line 245
    .line 246
    iput v10, v5, Lf2;->m:I

    .line 247
    .line 248
    iget-wide v2, v5, Lf2;->n:J

    .line 249
    .line 250
    invoke-static/range {v0 .. v5}, Lp02;->a(Lp02;Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Lu00;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    if-ne v0, v9, :cond_d

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_d
    :goto_6
    move-object v9, v11

    .line 258
    :goto_7
    return-object v9

    .line 259
    :pswitch_2
    check-cast v6, Lbk1;

    .line 260
    .line 261
    iget v0, v5, Lf2;->m:I

    .line 262
    .line 263
    if-eqz v0, :cond_11

    .line 264
    .line 265
    if-eq v0, v10, :cond_10

    .line 266
    .line 267
    if-eq v0, v4, :cond_f

    .line 268
    .line 269
    if-ne v0, v1, :cond_e

    .line 270
    .line 271
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    goto :goto_a

    .line 275
    :cond_e
    invoke-static {v8}, Ls;->l(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    move-object v9, v12

    .line 279
    goto :goto_b

    .line 280
    :cond_f
    iget-object v0, v5, Lf2;->o:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v0, La32;

    .line 283
    .line 284
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    goto :goto_9

    .line 288
    :cond_10
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    goto :goto_8

    .line 292
    :cond_11
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    check-cast v7, Lk21;

    .line 296
    .line 297
    iput v10, v5, Lf2;->m:I

    .line 298
    .line 299
    invoke-interface {v7, v5}, Lk21;->A(Lu00;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    if-ne v0, v9, :cond_12

    .line 304
    .line 305
    goto :goto_b

    .line 306
    :cond_12
    :goto_8
    new-instance v0, Lz22;

    .line 307
    .line 308
    invoke-direct {v0, v2, v3}, Lz22;-><init>(J)V

    .line 309
    .line 310
    .line 311
    new-instance v2, La32;

    .line 312
    .line 313
    invoke-direct {v2, v0}, La32;-><init>(Lz22;)V

    .line 314
    .line 315
    .line 316
    iput-object v2, v5, Lf2;->o:Ljava/lang/Object;

    .line 317
    .line 318
    iput v4, v5, Lf2;->m:I

    .line 319
    .line 320
    invoke-virtual {v6, v0, v5}, Lbk1;->a(Lj11;Lt00;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    if-ne v0, v9, :cond_13

    .line 325
    .line 326
    goto :goto_b

    .line 327
    :cond_13
    move-object v0, v2

    .line 328
    :goto_9
    iput-object v12, v5, Lf2;->o:Ljava/lang/Object;

    .line 329
    .line 330
    iput v1, v5, Lf2;->m:I

    .line 331
    .line 332
    invoke-virtual {v6, v0, v5}, Lbk1;->a(Lj11;Lt00;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    if-ne v0, v9, :cond_14

    .line 337
    .line 338
    goto :goto_b

    .line 339
    :cond_14
    :goto_a
    move-object v9, v11

    .line 340
    :goto_b
    return-object v9

    .line 341
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
