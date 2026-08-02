.class public final synthetic Lct0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lct0;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lct0;->i:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p3, p0, Lct0;->j:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lct0;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lct0;->i:Ljava/lang/String;

    iput-object p2, p0, Lct0;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lct0;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, Lpx;

    .line 14
    .line 15
    move-object/from16 v4, p2

    .line 16
    .line 17
    check-cast v4, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v3}, Lpp0;->N(I)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    iget-object v4, v0, Lct0;->i:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v0, v0, Lct0;->j:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v4, v0, v1, v3}, Lci0;->o(Ljava/lang/String;Ljava/lang/String;Lpx;I)V

    .line 31
    .line 32
    .line 33
    return-object v2

    .line 34
    :pswitch_0
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, Lpx;

    .line 37
    .line 38
    move-object/from16 v4, p2

    .line 39
    .line 40
    check-cast v4, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    and-int/lit8 v5, v4, 0x3

    .line 47
    .line 48
    const/4 v6, 0x2

    .line 49
    const/4 v7, 0x0

    .line 50
    if-eq v5, v6, :cond_0

    .line 51
    .line 52
    move v5, v3

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v5, v7

    .line 55
    :goto_0
    and-int/2addr v4, v3

    .line 56
    move-object v15, v1

    .line 57
    check-cast v15, Lgo0;

    .line 58
    .line 59
    invoke-virtual {v15, v4, v5}, Lgo0;->O(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    sget-object v1, Lte;->e:Lyi0;

    .line 66
    .line 67
    const/high16 v4, 0x41900000    # 18.0f

    .line 68
    .line 69
    invoke-static {v1, v4, v4}, Lfg1;->D(Luh1;FF)Luh1;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    sget-object v4, Ltp0;->c:Lvf;

    .line 74
    .line 75
    sget-object v5, Lsn;->u:Lpk;

    .line 76
    .line 77
    invoke-static {v4, v5, v15, v7}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    iget-wide v5, v15, Lgo0;->T:J

    .line 82
    .line 83
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    invoke-virtual {v15}, Lgo0;->l()Lyy1;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-static {v15, v1}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    sget-object v7, Lhx;->c:Lgx;

    .line 96
    .line 97
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    sget-object v7, Lgx;->b:Ljy;

    .line 101
    .line 102
    invoke-virtual {v15}, Lgo0;->Z()V

    .line 103
    .line 104
    .line 105
    iget-boolean v8, v15, Lgo0;->S:Z

    .line 106
    .line 107
    if-eqz v8, :cond_1

    .line 108
    .line 109
    invoke-virtual {v15, v7}, Lgo0;->k(Lxm0;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    invoke-virtual {v15}, Lgo0;->i0()V

    .line 114
    .line 115
    .line 116
    :goto_1
    sget-object v7, Lgx;->e:Llc;

    .line 117
    .line 118
    invoke-static {v15, v7, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    sget-object v4, Lgx;->d:Llc;

    .line 122
    .line 123
    invoke-static {v15, v4, v6}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    sget-object v5, Lgx;->f:Llc;

    .line 131
    .line 132
    invoke-static {v15, v5, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    sget-object v4, Lgx;->g:Lv6;

    .line 136
    .line 137
    invoke-static {v15, v4}, Lyf3;->b(Lpx;Lin0;)V

    .line 138
    .line 139
    .line 140
    sget-object v4, Lgx;->c:Llc;

    .line 141
    .line 142
    invoke-static {v15, v4, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    sget-object v1, Lur1;->a:Ltu2;

    .line 146
    .line 147
    invoke-virtual {v15, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    check-cast v4, Llp1;

    .line 152
    .line 153
    iget-wide v4, v4, Llp1;->e:J

    .line 154
    .line 155
    const/16 v6, 0xf

    .line 156
    .line 157
    invoke-static {v6}, Lrg3;->D(I)J

    .line 158
    .line 159
    .line 160
    move-result-wide v19

    .line 161
    const/16 v6, 0x14

    .line 162
    .line 163
    invoke-static {v6}, Lrg3;->D(I)J

    .line 164
    .line 165
    .line 166
    move-result-wide v25

    .line 167
    sget-object v21, Lim0;->l:Lim0;

    .line 168
    .line 169
    new-instance v16, Lm13;

    .line 170
    .line 171
    const/16 v28, 0x0

    .line 172
    .line 173
    const v29, 0xfdfff8

    .line 174
    .line 175
    .line 176
    const-wide/16 v22, 0x0

    .line 177
    .line 178
    const/16 v24, 0x0

    .line 179
    .line 180
    const/16 v27, 0x0

    .line 181
    .line 182
    move-wide/from16 v17, v4

    .line 183
    .line 184
    invoke-direct/range {v16 .. v29}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 185
    .line 186
    .line 187
    const/4 v4, 0x0

    .line 188
    const/16 v17, 0x3fa

    .line 189
    .line 190
    iget-object v8, v0, Lct0;->i:Ljava/lang/String;

    .line 191
    .line 192
    const/4 v9, 0x0

    .line 193
    const/4 v11, 0x0

    .line 194
    const/4 v12, 0x0

    .line 195
    const/4 v13, 0x0

    .line 196
    const/4 v14, 0x0

    .line 197
    move-object/from16 v10, v16

    .line 198
    .line 199
    move/from16 v16, v4

    .line 200
    .line 201
    invoke-static/range {v8 .. v17}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 202
    .line 203
    .line 204
    const/4 v8, 0x0

    .line 205
    const/16 v9, 0xd

    .line 206
    .line 207
    sget-object v4, Lrh1;->a:Lrh1;

    .line 208
    .line 209
    const/4 v5, 0x0

    .line 210
    const/high16 v6, 0x40a00000    # 5.0f

    .line 211
    .line 212
    const/4 v7, 0x0

    .line 213
    invoke-static/range {v4 .. v9}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    invoke-virtual {v15, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    check-cast v1, Llp1;

    .line 222
    .line 223
    iget-wide v4, v1, Llp1;->f:J

    .line 224
    .line 225
    const/16 v1, 0xd

    .line 226
    .line 227
    invoke-static {v1}, Lrg3;->D(I)J

    .line 228
    .line 229
    .line 230
    move-result-wide v19

    .line 231
    const/16 v1, 0x12

    .line 232
    .line 233
    invoke-static {v1}, Lrg3;->D(I)J

    .line 234
    .line 235
    .line 236
    move-result-wide v25

    .line 237
    sget-object v21, Lim0;->j:Lim0;

    .line 238
    .line 239
    new-instance v16, Lm13;

    .line 240
    .line 241
    move-wide/from16 v17, v4

    .line 242
    .line 243
    invoke-direct/range {v16 .. v29}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 244
    .line 245
    .line 246
    const/16 v1, 0x30

    .line 247
    .line 248
    const/16 v17, 0x3f8

    .line 249
    .line 250
    iget-object v8, v0, Lct0;->j:Ljava/lang/String;

    .line 251
    .line 252
    move-object/from16 v10, v16

    .line 253
    .line 254
    move/from16 v16, v1

    .line 255
    .line 256
    invoke-static/range {v8 .. v17}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v15, v3}, Lgo0;->p(Z)V

    .line 260
    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_2
    invoke-virtual {v15}, Lgo0;->R()V

    .line 264
    .line 265
    .line 266
    :goto_2
    return-object v2

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
