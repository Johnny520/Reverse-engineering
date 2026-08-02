.class public final Lvb0;
.super Lw92;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic j:I

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Lun0;

.field public final synthetic p:Lun0;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldy;Lwt0;Ls9;Ldd1;Lv;Lt00;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lvb0;->j:I

    .line 3
    .line 4
    iput-object p1, p0, Lvb0;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lvb0;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lvb0;->o:Lun0;

    .line 9
    .line 10
    iput-object p4, p0, Lvb0;->p:Lun0;

    .line 11
    .line 12
    iput-object p5, p0, Lvb0;->q:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, Lw92;-><init>(ILt00;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lj20;Lqz2;Lpr;Lx22;Lt00;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lvb0;->j:I

    .line 19
    iput-object p1, p0, Lvb0;->n:Ljava/lang/Object;

    iput-object p2, p0, Lvb0;->o:Lun0;

    iput-object p3, p0, Lvb0;->p:Lun0;

    iput-object p4, p0, Lvb0;->q:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lw92;-><init>(ILt00;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lvb0;->j:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    check-cast p1, Lyw2;

    .line 6
    .line 7
    check-cast p2, Lt00;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lvb0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lvb0;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lvb0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lvb0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lvb0;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lvb0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 13

    .line 1
    iget v0, p0, Lvb0;->j:I

    .line 2
    .line 3
    iget-object v1, p0, Lvb0;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lvb0;->p:Lun0;

    .line 6
    .line 7
    iget-object v3, p0, Lvb0;->o:Lun0;

    .line 8
    .line 9
    iget-object v4, p0, Lvb0;->n:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v5, Lvb0;

    .line 15
    .line 16
    move-object v6, v4

    .line 17
    check-cast v6, Lj20;

    .line 18
    .line 19
    move-object v7, v3

    .line 20
    check-cast v7, Lqz2;

    .line 21
    .line 22
    move-object v8, v2

    .line 23
    check-cast v8, Lpr;

    .line 24
    .line 25
    move-object v9, v1

    .line 26
    check-cast v9, Lx22;

    .line 27
    .line 28
    move-object v10, p1

    .line 29
    invoke-direct/range {v5 .. v10}, Lvb0;-><init>(Lj20;Lqz2;Lpr;Lx22;Lt00;)V

    .line 30
    .line 31
    .line 32
    iput-object p2, v5, Lvb0;->l:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v5

    .line 35
    :pswitch_0
    move-object v10, p1

    .line 36
    new-instance v6, Lvb0;

    .line 37
    .line 38
    iget-object p0, p0, Lvb0;->m:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v7, p0

    .line 41
    check-cast v7, Ldy;

    .line 42
    .line 43
    move-object v8, v4

    .line 44
    check-cast v8, Lwt0;

    .line 45
    .line 46
    move-object v9, v3

    .line 47
    check-cast v9, Ls9;

    .line 48
    .line 49
    check-cast v2, Ldd1;

    .line 50
    .line 51
    move-object v11, v1

    .line 52
    check-cast v11, Lv;

    .line 53
    .line 54
    move-object v12, v10

    .line 55
    move-object v10, v2

    .line 56
    invoke-direct/range {v6 .. v12}, Lvb0;-><init>(Ldy;Lwt0;Ls9;Ldd1;Lv;Lt00;)V

    .line 57
    .line 58
    .line 59
    iput-object p2, v6, Lvb0;->l:Ljava/lang/Object;

    .line 60
    .line 61
    return-object v6

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget v0, v7, Lvb0;->j:I

    .line 4
    .line 5
    sget-object v8, La83;->a:La83;

    .line 6
    .line 7
    iget-object v1, v7, Lvb0;->p:Lun0;

    .line 8
    .line 9
    iget-object v2, v7, Lvb0;->o:Lun0;

    .line 10
    .line 11
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    sget-object v9, Lk20;->h:Lk20;

    .line 14
    .line 15
    iget-object v4, v7, Lvb0;->q:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v5, 0x2

    .line 18
    iget-object v6, v7, Lvb0;->n:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x1

    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast v6, Lj20;

    .line 27
    .line 28
    move-object v15, v4

    .line 29
    check-cast v15, Lx22;

    .line 30
    .line 31
    iget v0, v7, Lvb0;->k:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    if-eq v0, v12, :cond_1

    .line 37
    .line 38
    if-ne v0, v5, :cond_0

    .line 39
    .line 40
    iget-object v0, v7, Lvb0;->l:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lk21;

    .line 43
    .line 44
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object/from16 v3, p1

    .line 48
    .line 49
    move-object v2, v4

    .line 50
    goto :goto_3

    .line 51
    :cond_0
    invoke-static {v3}, Ls;->l(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    move-object v8, v11

    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_1
    iget-object v0, v7, Lvb0;->m:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lzt2;

    .line 60
    .line 61
    iget-object v3, v7, Lvb0;->l:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v3, Lyw2;

    .line 64
    .line 65
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object/from16 v11, p1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, v7, Lvb0;->l:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v3, v0

    .line 77
    check-cast v3, Lyw2;

    .line 78
    .line 79
    new-instance v0, Lvx2;

    .line 80
    .line 81
    invoke-direct {v0, v15, v4, v10}, Lvx2;-><init>(Lx22;Lt00;I)V

    .line 82
    .line 83
    .line 84
    invoke-static {v6, v4, v0, v12}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v3, v7, Lvb0;->l:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object v0, v7, Lvb0;->m:Ljava/lang/Object;

    .line 91
    .line 92
    iput v12, v7, Lvb0;->k:I

    .line 93
    .line 94
    const/4 v11, 0x3

    .line 95
    invoke-static {v3, v7, v11}, Lay2;->b(Lyw2;Lrj;I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    if-ne v11, v9, :cond_3

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    :goto_0
    move-object/from16 v16, v11

    .line 103
    .line 104
    check-cast v16, Lo12;

    .line 105
    .line 106
    invoke-virtual/range {v16 .. v16}, Lo12;->a()V

    .line 107
    .line 108
    .line 109
    move-object v14, v2

    .line 110
    check-cast v14, Lqz2;

    .line 111
    .line 112
    sget-object v2, Lay2;->a:Lrx2;

    .line 113
    .line 114
    if-eq v14, v2, :cond_4

    .line 115
    .line 116
    new-instance v13, Lb2;

    .line 117
    .line 118
    const/16 v18, 0x15

    .line 119
    .line 120
    move-object/from16 v17, v4

    .line 121
    .line 122
    invoke-direct/range {v13 .. v18}, Lb2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 123
    .line 124
    .line 125
    move-object/from16 v2, v17

    .line 126
    .line 127
    invoke-static {v6, v0, v13}, Lay2;->e(Lj20;Lk21;Lmn0;)Lzt2;

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_4
    move-object v2, v4

    .line 132
    :goto_1
    iput-object v0, v7, Lvb0;->l:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v2, v7, Lvb0;->m:Ljava/lang/Object;

    .line 135
    .line 136
    iput v5, v7, Lvb0;->k:I

    .line 137
    .line 138
    sget-object v4, Li12;->i:Li12;

    .line 139
    .line 140
    invoke-static {v3, v4, v7}, Lay2;->h(Lyw2;Li12;Lrj;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    if-ne v3, v9, :cond_5

    .line 145
    .line 146
    :goto_2
    move-object v8, v9

    .line 147
    goto :goto_4

    .line 148
    :cond_5
    :goto_3
    check-cast v3, Lo12;

    .line 149
    .line 150
    if-nez v3, :cond_6

    .line 151
    .line 152
    new-instance v1, Lux2;

    .line 153
    .line 154
    invoke-direct {v1, v15, v2, v10}, Lux2;-><init>(Lx22;Lt00;I)V

    .line 155
    .line 156
    .line 157
    invoke-static {v6, v0, v1}, Lay2;->e(Lj20;Lk21;Lmn0;)Lzt2;

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_6
    invoke-virtual {v3}, Lo12;->a()V

    .line 162
    .line 163
    .line 164
    new-instance v4, Lux2;

    .line 165
    .line 166
    invoke-direct {v4, v15, v2, v12}, Lux2;-><init>(Lx22;Lt00;I)V

    .line 167
    .line 168
    .line 169
    invoke-static {v6, v0, v4}, Lay2;->e(Lj20;Lk21;Lmn0;)Lzt2;

    .line 170
    .line 171
    .line 172
    check-cast v1, Lpr;

    .line 173
    .line 174
    iget-wide v2, v3, Lo12;->c:J

    .line 175
    .line 176
    new-instance v0, Lrs1;

    .line 177
    .line 178
    invoke-direct {v0, v2, v3}, Lrs1;-><init>(J)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v0}, Lpr;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    :goto_4
    return-object v8

    .line 185
    :pswitch_0
    iget v0, v7, Lvb0;->k:I

    .line 186
    .line 187
    if-eqz v0, :cond_9

    .line 188
    .line 189
    if-eq v0, v12, :cond_8

    .line 190
    .line 191
    if-ne v0, v5, :cond_7

    .line 192
    .line 193
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_7
    invoke-static {v3}, Ls;->l(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    move-object v8, v11

    .line 201
    goto :goto_7

    .line 202
    :cond_8
    iget-object v0, v7, Lvb0;->l:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, Lyw2;

    .line 205
    .line 206
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    move-object/from16 v3, p1

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_9
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    iget-object v0, v7, Lvb0;->l:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, Lyw2;

    .line 218
    .line 219
    iput-object v0, v7, Lvb0;->l:Ljava/lang/Object;

    .line 220
    .line 221
    iput v12, v7, Lvb0;->k:I

    .line 222
    .line 223
    sget-object v3, Li12;->h:Li12;

    .line 224
    .line 225
    invoke-static {v0, v10, v3, v7}, Lay2;->a(Lyw2;ZLi12;Lrj;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    if-ne v3, v9, :cond_a

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_a
    :goto_5
    check-cast v3, Lo12;

    .line 233
    .line 234
    iget-object v10, v7, Lvb0;->m:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v10, Ldy;

    .line 237
    .line 238
    check-cast v6, Lwt0;

    .line 239
    .line 240
    check-cast v2, Ls9;

    .line 241
    .line 242
    check-cast v1, Ldd1;

    .line 243
    .line 244
    check-cast v4, Lv;

    .line 245
    .line 246
    iput-object v11, v7, Lvb0;->l:Ljava/lang/Object;

    .line 247
    .line 248
    iput v5, v7, Lvb0;->k:I

    .line 249
    .line 250
    move-object v5, v1

    .line 251
    move-object v1, v3

    .line 252
    move-object v3, v6

    .line 253
    move-object v6, v4

    .line 254
    move-object v4, v2

    .line 255
    move-object v2, v10

    .line 256
    invoke-static/range {v0 .. v7}, Lyb0;->g(Lyw2;Lo12;Ldy;Lwt0;Ls9;Ldd1;Lv;Lrj;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-ne v0, v9, :cond_b

    .line 261
    .line 262
    :goto_6
    move-object v8, v9

    .line 263
    :cond_b
    :goto_7
    return-object v8

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
