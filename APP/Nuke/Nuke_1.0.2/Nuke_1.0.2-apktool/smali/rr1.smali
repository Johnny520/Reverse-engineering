.class public final synthetic Lrr1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:Lgu2;

.field public final synthetic k:Lgu2;

.field public final synthetic l:Z

.field public final synthetic m:Lgu2;

.field public final synthetic n:Lgu2;

.field public final synthetic o:Lgu2;

.field public final synthetic p:Lgu2;

.field public final synthetic q:Lgu2;

.field public final synthetic r:Lmn0;

.field public final synthetic s:Lgu2;

.field public final synthetic t:Lmn0;

.field public final synthetic u:Lgu2;

.field public final synthetic v:J

.field public final synthetic w:Llp1;

.field public final synthetic x:Lya1;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lxk1;


# direct methods
.method public synthetic constructor <init>(ZZLgu2;Lgu2;ZLgu2;Lgu2;Lgu2;Lgu2;Lgu2;Lmn0;Lgu2;Lmn0;Lgu2;JLlp1;Lya1;Ljava/lang/String;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lrr1;->h:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lrr1;->i:Z

    .line 7
    .line 8
    iput-object p3, p0, Lrr1;->j:Lgu2;

    .line 9
    .line 10
    iput-object p4, p0, Lrr1;->k:Lgu2;

    .line 11
    .line 12
    iput-boolean p5, p0, Lrr1;->l:Z

    .line 13
    .line 14
    iput-object p6, p0, Lrr1;->m:Lgu2;

    .line 15
    .line 16
    iput-object p7, p0, Lrr1;->n:Lgu2;

    .line 17
    .line 18
    iput-object p8, p0, Lrr1;->o:Lgu2;

    .line 19
    .line 20
    iput-object p9, p0, Lrr1;->p:Lgu2;

    .line 21
    .line 22
    iput-object p10, p0, Lrr1;->q:Lgu2;

    .line 23
    .line 24
    iput-object p11, p0, Lrr1;->r:Lmn0;

    .line 25
    .line 26
    iput-object p12, p0, Lrr1;->s:Lgu2;

    .line 27
    .line 28
    iput-object p13, p0, Lrr1;->t:Lmn0;

    .line 29
    .line 30
    iput-object p14, p0, Lrr1;->u:Lgu2;

    .line 31
    .line 32
    move-wide p1, p15

    .line 33
    iput-wide p1, p0, Lrr1;->v:J

    .line 34
    .line 35
    move-object/from16 p1, p17

    .line 36
    .line 37
    iput-object p1, p0, Lrr1;->w:Llp1;

    .line 38
    .line 39
    move-object/from16 p1, p18

    .line 40
    .line 41
    iput-object p1, p0, Lrr1;->x:Lya1;

    .line 42
    .line 43
    move-object/from16 p1, p19

    .line 44
    .line 45
    iput-object p1, p0, Lrr1;->y:Ljava/lang/String;

    .line 46
    .line 47
    move-object/from16 p1, p20

    .line 48
    .line 49
    iput-object p1, p0, Lrr1;->z:Lxk1;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    check-cast v12, Lmn0;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Lpx;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v3, v2, 0x6

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    move-object v3, v1

    .line 28
    check-cast v3, Lgo0;

    .line 29
    .line 30
    invoke-virtual {v3, v12}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    const/4 v3, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v3, v4

    .line 39
    :goto_0
    or-int/2addr v2, v3

    .line 40
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 41
    .line 42
    const/16 v5, 0x12

    .line 43
    .line 44
    const/4 v6, 0x1

    .line 45
    if-eq v3, v5, :cond_2

    .line 46
    .line 47
    move v3, v6

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const/4 v3, 0x0

    .line 50
    :goto_1
    and-int/2addr v2, v6

    .line 51
    move-object v14, v1

    .line 52
    check-cast v14, Lgo0;

    .line 53
    .line 54
    invoke-virtual {v14, v2, v3}, Lgo0;->O(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_8

    .line 59
    .line 60
    new-instance v15, Lkr1;

    .line 61
    .line 62
    iget-object v1, v0, Lrr1;->m:Lgu2;

    .line 63
    .line 64
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Lza0;

    .line 69
    .line 70
    iget v1, v1, Lza0;->h:F

    .line 71
    .line 72
    invoke-direct {v15, v1}, Lkr1;-><init>(F)V

    .line 73
    .line 74
    .line 75
    sget-object v1, Lte;->e:Lyi0;

    .line 76
    .line 77
    iget-boolean v2, v0, Lrr1;->h:Z

    .line 78
    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    const/high16 v3, 0x42280000    # 42.0f

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    const/high16 v3, 0x42400000    # 48.0f

    .line 85
    .line 86
    :goto_2
    const/4 v5, 0x0

    .line 87
    invoke-static {v1, v3, v5, v4}, Lte;->P(Luh1;FFI)Luh1;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-boolean v3, v0, Lrr1;->i:Z

    .line 92
    .line 93
    invoke-virtual {v14, v3}, Lgo0;->g(Z)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    iget-object v6, v0, Lrr1;->j:Lgu2;

    .line 98
    .line 99
    invoke-virtual {v14, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    or-int/2addr v5, v7

    .line 104
    iget-object v7, v0, Lrr1;->k:Lgu2;

    .line 105
    .line 106
    invoke-virtual {v14, v7}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    or-int/2addr v5, v8

    .line 111
    invoke-virtual {v14}, Lgo0;->L()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    if-nez v5, :cond_4

    .line 116
    .line 117
    sget-object v5, Lnx;->a:Leb;

    .line 118
    .line 119
    if-ne v8, v5, :cond_5

    .line 120
    .line 121
    :cond_4
    new-instance v8, Ldt0;

    .line 122
    .line 123
    invoke-direct {v8, v4, v6, v7, v3}, Ldt0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v14, v8}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    check-cast v8, Lin0;

    .line 130
    .line 131
    invoke-static {v1, v8}, Lte;->L(Luh1;Lin0;)Luh1;

    .line 132
    .line 133
    .line 134
    move-result-object v16

    .line 135
    iget-object v1, v0, Lrr1;->n:Lgu2;

    .line 136
    .line 137
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    check-cast v1, Lju;

    .line 142
    .line 143
    iget-wide v3, v1, Lju;->a:J

    .line 144
    .line 145
    iget-object v1, v0, Lrr1;->o:Lgu2;

    .line 146
    .line 147
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, Lju;

    .line 152
    .line 153
    iget-wide v5, v1, Lju;->a:J

    .line 154
    .line 155
    iget-object v1, v0, Lrr1;->p:Lgu2;

    .line 156
    .line 157
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    check-cast v1, Lza0;

    .line 162
    .line 163
    iget v1, v1, Lza0;->h:F

    .line 164
    .line 165
    if-eqz v2, :cond_6

    .line 166
    .line 167
    const/high16 v2, 0x41100000    # 9.0f

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_6
    const/high16 v2, 0x41300000    # 11.0f

    .line 171
    .line 172
    :goto_3
    new-instance v7, Ljw1;

    .line 173
    .line 174
    const/high16 v8, 0x41400000    # 12.0f

    .line 175
    .line 176
    invoke-direct {v7, v8, v2, v8, v2}, Ljw1;-><init>(FFFF)V

    .line 177
    .line 178
    .line 179
    move/from16 v22, v1

    .line 180
    .line 181
    iget-boolean v1, v0, Lrr1;->l:Z

    .line 182
    .line 183
    if-eqz v1, :cond_7

    .line 184
    .line 185
    sget-object v2, Lsn;->j:Lrk;

    .line 186
    .line 187
    :goto_4
    move-object/from16 v24, v2

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_7
    sget-object v2, Lsn;->m:Lrk;

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :goto_5
    new-instance v2, Lsr1;

    .line 194
    .line 195
    move-object v8, v2

    .line 196
    iget-object v2, v0, Lrr1;->q:Lgu2;

    .line 197
    .line 198
    move-wide v9, v3

    .line 199
    iget-object v3, v0, Lrr1;->r:Lmn0;

    .line 200
    .line 201
    iget-object v4, v0, Lrr1;->s:Lgu2;

    .line 202
    .line 203
    move-wide/from16 v20, v5

    .line 204
    .line 205
    iget-object v5, v0, Lrr1;->t:Lmn0;

    .line 206
    .line 207
    iget-object v6, v0, Lrr1;->u:Lgu2;

    .line 208
    .line 209
    move-object/from16 v23, v7

    .line 210
    .line 211
    move-object v11, v8

    .line 212
    iget-wide v7, v0, Lrr1;->v:J

    .line 213
    .line 214
    move-wide/from16 v17, v9

    .line 215
    .line 216
    iget-object v9, v0, Lrr1;->w:Llp1;

    .line 217
    .line 218
    iget-object v10, v0, Lrr1;->x:Lya1;

    .line 219
    .line 220
    move-object v13, v11

    .line 221
    iget-object v11, v0, Lrr1;->y:Ljava/lang/String;

    .line 222
    .line 223
    iget-object v0, v0, Lrr1;->z:Lxk1;

    .line 224
    .line 225
    move-object/from16 v29, v13

    .line 226
    .line 227
    move-object v13, v0

    .line 228
    move-object/from16 v0, v29

    .line 229
    .line 230
    invoke-direct/range {v0 .. v13}, Lsr1;-><init>(ZLgu2;Lmn0;Lgu2;Lmn0;Lgu2;JLlp1;Lya1;Ljava/lang/String;Lmn0;Lxk1;)V

    .line 231
    .line 232
    .line 233
    move-object v13, v0

    .line 234
    const v0, -0x87d39dc

    .line 235
    .line 236
    .line 237
    invoke-static {v0, v13, v14}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 238
    .line 239
    .line 240
    move-result-object v25

    .line 241
    const/high16 v27, 0x30000000

    .line 242
    .line 243
    const/16 v28, 0x18

    .line 244
    .line 245
    move-wide/from16 v9, v17

    .line 246
    .line 247
    const-wide/16 v17, 0x0

    .line 248
    .line 249
    const/16 v19, 0x0

    .line 250
    .line 251
    move-object/from16 v26, v14

    .line 252
    .line 253
    move-object v14, v15

    .line 254
    move-object/from16 v13, v16

    .line 255
    .line 256
    move-wide v15, v9

    .line 257
    invoke-static/range {v13 .. v28}, Lci0;->h(Luh1;Lkr1;JJFJFLjw1;Lr5;Lkw;Lpx;II)V

    .line 258
    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_8
    move-object/from16 v26, v14

    .line 262
    .line 263
    invoke-virtual/range {v26 .. v26}, Lgo0;->R()V

    .line 264
    .line 265
    .line 266
    :goto_6
    sget-object v0, La83;->a:La83;

    .line 267
    .line 268
    return-object v0
.end method
