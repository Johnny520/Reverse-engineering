.class public final synthetic Llr;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:Lxm0;

.field public final synthetic i:Ljava/lang/Long;

.field public final synthetic j:Ljava/lang/Long;

.field public final synthetic k:Lin0;

.field public final synthetic l:Lzq;

.field public final synthetic m:Lxk1;

.field public final synthetic n:Lxk1;

.field public final synthetic o:Lxk1;

.field public final synthetic p:Ljava/util/List;

.field public final synthetic q:Lxk1;

.field public final synthetic r:Lxk1;

.field public final synthetic s:Lxk1;

.field public final synthetic t:Lxk1;

.field public final synthetic u:Lxk1;

.field public final synthetic v:Ljava/lang/Integer;

.field public final synthetic w:Lxk1;

.field public final synthetic x:Z


# direct methods
.method public synthetic constructor <init>(Lxm0;Ljava/lang/Long;Ljava/lang/Long;Lin0;Lzq;Lxk1;Lxk1;Lxk1;Ljava/util/List;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Ljava/lang/Integer;Lxk1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llr;->h:Lxm0;

    .line 5
    .line 6
    iput-object p2, p0, Llr;->i:Ljava/lang/Long;

    .line 7
    .line 8
    iput-object p3, p0, Llr;->j:Ljava/lang/Long;

    .line 9
    .line 10
    iput-object p4, p0, Llr;->k:Lin0;

    .line 11
    .line 12
    iput-object p5, p0, Llr;->l:Lzq;

    .line 13
    .line 14
    iput-object p6, p0, Llr;->m:Lxk1;

    .line 15
    .line 16
    iput-object p7, p0, Llr;->n:Lxk1;

    .line 17
    .line 18
    iput-object p8, p0, Llr;->o:Lxk1;

    .line 19
    .line 20
    iput-object p9, p0, Llr;->p:Ljava/util/List;

    .line 21
    .line 22
    iput-object p10, p0, Llr;->q:Lxk1;

    .line 23
    .line 24
    iput-object p11, p0, Llr;->r:Lxk1;

    .line 25
    .line 26
    iput-object p12, p0, Llr;->s:Lxk1;

    .line 27
    .line 28
    iput-object p13, p0, Llr;->t:Lxk1;

    .line 29
    .line 30
    iput-object p14, p0, Llr;->u:Lxk1;

    .line 31
    .line 32
    iput-object p15, p0, Llr;->v:Ljava/lang/Integer;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Llr;->w:Lxk1;

    .line 37
    .line 38
    move/from16 p1, p17

    .line 39
    .line 40
    iput-boolean p1, p0, Llr;->x:Z

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lpb2;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Lpx;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v4, v3, 0x6

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    move-object v4, v2

    .line 27
    check-cast v4, Lgo0;

    .line 28
    .line 29
    invoke-virtual {v4, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v4, 0x2

    .line 38
    :goto_0
    or-int/2addr v3, v4

    .line 39
    :cond_1
    and-int/lit8 v4, v3, 0x13

    .line 40
    .line 41
    const/16 v5, 0x12

    .line 42
    .line 43
    const/4 v6, 0x1

    .line 44
    if-eq v4, v5, :cond_2

    .line 45
    .line 46
    move v4, v6

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    const/4 v4, 0x0

    .line 49
    :goto_1
    and-int/2addr v3, v6

    .line 50
    move-object v10, v2

    .line 51
    check-cast v10, Lgo0;

    .line 52
    .line 53
    invoke-virtual {v10, v3, v4}, Lgo0;->O(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    const v2, 0x790b0111

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v10}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    const/4 v11, 0x0

    .line 71
    const/16 v12, 0x38

    .line 72
    .line 73
    iget-object v6, v0, Llr;->h:Lxm0;

    .line 74
    .line 75
    const/4 v8, 0x0

    .line 76
    const/4 v9, 0x0

    .line 77
    invoke-static/range {v5 .. v12}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 78
    .line 79
    .line 80
    const v2, 0x790b014a

    .line 81
    .line 82
    .line 83
    invoke-static {v2, v10}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    iget-object v12, v0, Llr;->i:Ljava/lang/Long;

    .line 92
    .line 93
    invoke-virtual {v10, v12}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    iget-object v13, v0, Llr;->j:Ljava/lang/Long;

    .line 98
    .line 99
    invoke-virtual {v10, v13}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    or-int/2addr v1, v2

    .line 104
    iget-object v14, v0, Llr;->k:Lin0;

    .line 105
    .line 106
    invoke-virtual {v10, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    or-int/2addr v1, v2

    .line 111
    iget-object v15, v0, Llr;->l:Lzq;

    .line 112
    .line 113
    invoke-virtual {v10, v15}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    or-int/2addr v1, v2

    .line 118
    iget-object v2, v0, Llr;->m:Lxk1;

    .line 119
    .line 120
    invoke-virtual {v10, v2}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    or-int/2addr v1, v3

    .line 125
    iget-object v3, v0, Llr;->n:Lxk1;

    .line 126
    .line 127
    invoke-virtual {v10, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    or-int/2addr v1, v4

    .line 132
    iget-object v4, v0, Llr;->o:Lxk1;

    .line 133
    .line 134
    invoke-virtual {v10, v4}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    or-int/2addr v1, v6

    .line 139
    iget-object v6, v0, Llr;->p:Ljava/util/List;

    .line 140
    .line 141
    invoke-virtual {v10, v6}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    or-int/2addr v1, v8

    .line 146
    iget-object v8, v0, Llr;->q:Lxk1;

    .line 147
    .line 148
    invoke-virtual {v10, v8}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    or-int/2addr v1, v9

    .line 153
    iget-object v9, v0, Llr;->r:Lxk1;

    .line 154
    .line 155
    invoke-virtual {v10, v9}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    or-int/2addr v1, v11

    .line 160
    iget-object v11, v0, Llr;->s:Lxk1;

    .line 161
    .line 162
    invoke-virtual {v10, v11}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v16

    .line 166
    or-int v1, v1, v16

    .line 167
    .line 168
    move/from16 p1, v1

    .line 169
    .line 170
    iget-object v1, v0, Llr;->t:Lxk1;

    .line 171
    .line 172
    invoke-virtual {v10, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v16

    .line 176
    or-int v16, p1, v16

    .line 177
    .line 178
    move-object/from16 v24, v1

    .line 179
    .line 180
    iget-object v1, v0, Llr;->u:Lxk1;

    .line 181
    .line 182
    invoke-virtual {v10, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v17

    .line 186
    or-int v16, v16, v17

    .line 187
    .line 188
    move-object/from16 v25, v1

    .line 189
    .line 190
    iget-object v1, v0, Llr;->v:Ljava/lang/Integer;

    .line 191
    .line 192
    invoke-virtual {v10, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v17

    .line 196
    or-int v16, v16, v17

    .line 197
    .line 198
    move-object/from16 v17, v1

    .line 199
    .line 200
    iget-object v1, v0, Llr;->w:Lxk1;

    .line 201
    .line 202
    invoke-virtual {v10, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v18

    .line 206
    or-int v16, v16, v18

    .line 207
    .line 208
    move-object/from16 v26, v1

    .line 209
    .line 210
    invoke-virtual {v10}, Lgo0;->L()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    move-object/from16 v18, v2

    .line 215
    .line 216
    if-nez v16, :cond_3

    .line 217
    .line 218
    sget-object v2, Lnx;->a:Leb;

    .line 219
    .line 220
    if-ne v1, v2, :cond_4

    .line 221
    .line 222
    :cond_3
    move-object/from16 v23, v11

    .line 223
    .line 224
    new-instance v11, Lnr;

    .line 225
    .line 226
    move-object/from16 v19, v3

    .line 227
    .line 228
    move-object/from16 v20, v4

    .line 229
    .line 230
    move-object/from16 v16, v6

    .line 231
    .line 232
    move-object/from16 v21, v8

    .line 233
    .line 234
    move-object/from16 v22, v9

    .line 235
    .line 236
    invoke-direct/range {v11 .. v26}, Lnr;-><init>(Ljava/lang/Long;Ljava/lang/Long;Lin0;Lzq;Ljava/util/List;Ljava/lang/Integer;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v10, v11}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    move-object v1, v11

    .line 243
    :cond_4
    move-object v6, v1

    .line 244
    check-cast v6, Lxm0;

    .line 245
    .line 246
    const/4 v11, 0x0

    .line 247
    const/16 v12, 0x30

    .line 248
    .line 249
    iget-boolean v8, v0, Llr;->x:Z

    .line 250
    .line 251
    const/4 v9, 0x0

    .line 252
    invoke-static/range {v5 .. v12}, Lse;->q(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 253
    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_5
    invoke-virtual {v10}, Lgo0;->R()V

    .line 257
    .line 258
    .line 259
    :goto_2
    sget-object v0, La83;->a:La83;

    .line 260
    .line 261
    return-object v0
.end method
