.class public final synthetic Lge0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Lin0;


# direct methods
.method public synthetic constructor <init>(IILin0;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    iput p2, p0, Lge0;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lge0;->i:I

    .line 8
    .line 9
    iput-object p3, p0, Lge0;->j:Lin0;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(ILin0;)V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lge0;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lge0;->i:I

    iput-object p2, p0, Lge0;->j:Lin0;

    return-void
.end method

.method public synthetic constructor <init>(Lin0;I)V
    .locals 1

    .line 13
    const/4 v0, 0x2

    iput v0, p0, Lge0;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lge0;->j:Lin0;

    iput p2, p0, Lge0;->i:I

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lge0;->h:I

    .line 4
    .line 5
    iget-object v2, v0, Lge0;->j:Lin0;

    .line 6
    .line 7
    sget-object v3, La83;->a:La83;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    iget v5, v0, Lge0;->i:I

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v0, p1

    .line 16
    .line 17
    check-cast v0, Lpx;

    .line 18
    .line 19
    move-object/from16 v1, p2

    .line 20
    .line 21
    check-cast v1, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    or-int/lit8 v1, v5, 0x1

    .line 27
    .line 28
    invoke-static {v1}, Lpp0;->N(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {v2, v0, v1}, Ltp0;->d(Lin0;Lpx;I)V

    .line 33
    .line 34
    .line 35
    return-object v3

    .line 36
    :pswitch_0
    move-object/from16 v0, p1

    .line 37
    .line 38
    check-cast v0, Lpx;

    .line 39
    .line 40
    move-object/from16 v1, p2

    .line 41
    .line 42
    check-cast v1, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v4}, Lpp0;->N(I)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {v5, v2, v0, v1}, Lup0;->b(ILin0;Lpx;I)V

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :pswitch_1
    move-object/from16 v1, p1

    .line 56
    .line 57
    check-cast v1, Lpx;

    .line 58
    .line 59
    move-object/from16 v2, p2

    .line 60
    .line 61
    check-cast v2, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    and-int/lit8 v6, v2, 0x3

    .line 68
    .line 69
    const/4 v7, 0x2

    .line 70
    const/4 v8, 0x0

    .line 71
    if-eq v6, v7, :cond_0

    .line 72
    .line 73
    move v6, v4

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    move v6, v8

    .line 76
    :goto_0
    and-int/2addr v2, v4

    .line 77
    move-object v13, v1

    .line 78
    check-cast v13, Lgo0;

    .line 79
    .line 80
    invoke-virtual {v13, v2, v6}, Lgo0;->O(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    sget-object v1, Lte;->g:Lyi0;

    .line 87
    .line 88
    sget-object v2, Ltp0;->c:Lvf;

    .line 89
    .line 90
    sget-object v6, Lsn;->u:Lpk;

    .line 91
    .line 92
    invoke-static {v2, v6, v13, v8}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    iget-wide v6, v13, Lgo0;->T:J

    .line 97
    .line 98
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    invoke-virtual {v13}, Lgo0;->l()Lyy1;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-static {v13, v1}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    sget-object v10, Lhx;->c:Lgx;

    .line 111
    .line 112
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    sget-object v10, Lgx;->b:Ljy;

    .line 116
    .line 117
    invoke-virtual {v13}, Lgo0;->Z()V

    .line 118
    .line 119
    .line 120
    iget-boolean v11, v13, Lgo0;->S:Z

    .line 121
    .line 122
    if-eqz v11, :cond_1

    .line 123
    .line 124
    invoke-virtual {v13, v10}, Lgo0;->k(Lxm0;)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_1
    invoke-virtual {v13}, Lgo0;->i0()V

    .line 129
    .line 130
    .line 131
    :goto_1
    sget-object v11, Lgx;->e:Llc;

    .line 132
    .line 133
    invoke-static {v13, v11, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    sget-object v2, Lgx;->d:Llc;

    .line 137
    .line 138
    invoke-static {v13, v2, v7}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    sget-object v7, Lgx;->f:Llc;

    .line 146
    .line 147
    invoke-static {v13, v7, v6}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    sget-object v6, Lgx;->g:Lv6;

    .line 151
    .line 152
    invoke-static {v13, v6}, Lyf3;->b(Lpx;Lin0;)V

    .line 153
    .line 154
    .line 155
    sget-object v12, Lgx;->c:Llc;

    .line 156
    .line 157
    invoke-static {v13, v12, v9}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v5, v13}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    const/4 v14, 0x0

    .line 165
    const/16 v15, 0x1e

    .line 166
    .line 167
    move-object/from16 v16, v10

    .line 168
    .line 169
    const/4 v10, 0x0

    .line 170
    move-object/from16 v17, v11

    .line 171
    .line 172
    const/4 v11, 0x0

    .line 173
    iget-object v0, v0, Lge0;->j:Lin0;

    .line 174
    .line 175
    move-object/from16 v18, v12

    .line 176
    .line 177
    move-object/from16 v4, v17

    .line 178
    .line 179
    move-object v12, v0

    .line 180
    move-object/from16 v0, v16

    .line 181
    .line 182
    invoke-static/range {v9 .. v15}, Ltp0;->c(Ljava/lang/String;Luh1;Lnn0;Lin0;Lpx;II)V

    .line 183
    .line 184
    .line 185
    const/high16 v9, 0x41900000    # 18.0f

    .line 186
    .line 187
    const/high16 v10, 0x41600000    # 14.0f

    .line 188
    .line 189
    invoke-static {v1, v9, v10}, Lfg1;->D(Luh1;FF)Luh1;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    sget-object v9, Lsn;->j:Lrk;

    .line 194
    .line 195
    invoke-static {v9, v8}, Ldm;->d(Lr5;Z)Lnf1;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    iget-wide v9, v13, Lgo0;->T:J

    .line 200
    .line 201
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    invoke-virtual {v13}, Lgo0;->l()Lyy1;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    invoke-static {v13, v1}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {v13}, Lgo0;->Z()V

    .line 214
    .line 215
    .line 216
    iget-boolean v11, v13, Lgo0;->S:Z

    .line 217
    .line 218
    if-eqz v11, :cond_2

    .line 219
    .line 220
    invoke-virtual {v13, v0}, Lgo0;->k(Lxm0;)V

    .line 221
    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_2
    invoke-virtual {v13}, Lgo0;->i0()V

    .line 225
    .line 226
    .line 227
    :goto_2
    invoke-static {v13, v4, v8}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v13, v2, v10}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-static {v9, v13, v7, v13, v6}, Lvi0;->q(ILgo0;Llc;Lgo0;Lv6;)V

    .line 234
    .line 235
    .line 236
    move-object/from16 v0, v18

    .line 237
    .line 238
    invoke-static {v13, v0, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    invoke-static {v5, v13}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v10

    .line 245
    const v0, 0x790b0119

    .line 246
    .line 247
    .line 248
    invoke-static {v0, v13}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v11

    .line 252
    move-object v12, v13

    .line 253
    const/4 v13, 0x0

    .line 254
    const/4 v14, 0x1

    .line 255
    const/4 v9, 0x0

    .line 256
    invoke-static/range {v9 .. v14}, Lci0;->g(Luh1;Ljava/lang/String;Ljava/lang/String;Lpx;II)V

    .line 257
    .line 258
    .line 259
    move-object v13, v12

    .line 260
    const/4 v0, 0x1

    .line 261
    invoke-virtual {v13, v0}, Lgo0;->p(Z)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v13, v0}, Lgo0;->p(Z)V

    .line 265
    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_3
    invoke-virtual {v13}, Lgo0;->R()V

    .line 269
    .line 270
    .line 271
    :goto_3
    return-object v3

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
