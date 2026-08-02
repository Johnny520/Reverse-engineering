.class public final synthetic Lpr1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic A:Lgu2;

.field public final synthetic B:Lgu2;

.field public final synthetic C:Lgu2;

.field public final synthetic D:Lgu2;

.field public final synthetic E:Lmn0;

.field public final synthetic F:Lgu2;

.field public final synthetic G:Lmn0;

.field public final synthetic H:Lgu2;

.field public final synthetic I:Ljava/lang/String;

.field public final synthetic h:Luh1;

.field public final synthetic i:J

.field public final synthetic j:Z

.field public final synthetic k:Llp1;

.field public final synthetic l:Lya1;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Z

.field public final synthetic o:Lin0;

.field public final synthetic p:Z

.field public final synthetic q:Lm51;

.field public final synthetic r:Lk51;

.field public final synthetic s:I

.field public final synthetic t:I

.field public final synthetic u:Lwb3;

.field public final synthetic v:Lxk1;

.field public final synthetic w:Lgu2;

.field public final synthetic x:Lgu2;

.field public final synthetic y:Z

.field public final synthetic z:Lgu2;


# direct methods
.method public synthetic constructor <init>(Luh1;JZLlp1;Lya1;Ljava/lang/String;ZLin0;ZLm51;Lk51;IILwb3;Lxk1;Lgu2;Lgu2;ZLgu2;Lgu2;Lgu2;Lgu2;Lgu2;Lmn0;Lgu2;Lmn0;Lgu2;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpr1;->h:Luh1;

    iput-wide p2, p0, Lpr1;->i:J

    iput-boolean p4, p0, Lpr1;->j:Z

    iput-object p5, p0, Lpr1;->k:Llp1;

    iput-object p6, p0, Lpr1;->l:Lya1;

    iput-object p7, p0, Lpr1;->m:Ljava/lang/String;

    iput-boolean p8, p0, Lpr1;->n:Z

    iput-object p9, p0, Lpr1;->o:Lin0;

    iput-boolean p10, p0, Lpr1;->p:Z

    iput-object p11, p0, Lpr1;->q:Lm51;

    iput-object p12, p0, Lpr1;->r:Lk51;

    iput p13, p0, Lpr1;->s:I

    iput p14, p0, Lpr1;->t:I

    iput-object p15, p0, Lpr1;->u:Lwb3;

    move-object/from16 p1, p16

    iput-object p1, p0, Lpr1;->v:Lxk1;

    move-object/from16 p1, p17

    iput-object p1, p0, Lpr1;->w:Lgu2;

    move-object/from16 p1, p18

    iput-object p1, p0, Lpr1;->x:Lgu2;

    move/from16 p1, p19

    iput-boolean p1, p0, Lpr1;->y:Z

    move-object/from16 p1, p20

    iput-object p1, p0, Lpr1;->z:Lgu2;

    move-object/from16 p1, p21

    iput-object p1, p0, Lpr1;->A:Lgu2;

    move-object/from16 p1, p22

    iput-object p1, p0, Lpr1;->B:Lgu2;

    move-object/from16 p1, p23

    iput-object p1, p0, Lpr1;->C:Lgu2;

    move-object/from16 p1, p24

    iput-object p1, p0, Lpr1;->D:Lgu2;

    move-object/from16 p1, p25

    iput-object p1, p0, Lpr1;->E:Lmn0;

    move-object/from16 p1, p26

    iput-object p1, p0, Lpr1;->F:Lgu2;

    move-object/from16 p1, p27

    iput-object p1, p0, Lpr1;->G:Lmn0;

    move-object/from16 p1, p28

    iput-object p1, p0, Lpr1;->H:Lgu2;

    move-object/from16 p1, p29

    iput-object p1, p0, Lpr1;->I:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lpx;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit8 v3, v2, 0x3

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const/4 v5, 0x1

    .line 19
    if-eq v3, v4, :cond_0

    .line 20
    .line 21
    move v3, v5

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v3, 0x0

    .line 24
    :goto_0
    and-int/2addr v2, v5

    .line 25
    check-cast v1, Lgo0;

    .line 26
    .line 27
    invoke-virtual {v1, v2, v3}, Lgo0;->O(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_5

    .line 32
    .line 33
    sget-object v2, Lte;->e:Lyi0;

    .line 34
    .line 35
    iget-object v3, v0, Lpr1;->h:Luh1;

    .line 36
    .line 37
    invoke-interface {v3, v2}, Luh1;->c(Luh1;)Luh1;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const/16 v4, 0x12

    .line 46
    .line 47
    iget-object v5, v0, Lpr1;->v:Lxk1;

    .line 48
    .line 49
    sget-object v6, Lnx;->a:Leb;

    .line 50
    .line 51
    if-ne v3, v6, :cond_1

    .line 52
    .line 53
    new-instance v3, Lpr;

    .line 54
    .line 55
    invoke-direct {v3, v5, v4}, Lpr;-><init>(Lxk1;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    check-cast v3, Lin0;

    .line 62
    .line 63
    invoke-static {v2, v3}, Lgf1;->F(Luh1;Lin0;)Luh1;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    new-instance v3, Lft2;

    .line 68
    .line 69
    iget-wide v7, v0, Lpr1;->i:J

    .line 70
    .line 71
    invoke-direct {v3, v7, v8}, Lft2;-><init>(J)V

    .line 72
    .line 73
    .line 74
    move-wide/from16 v20, v7

    .line 75
    .line 76
    iget-boolean v7, v0, Lpr1;->j:Z

    .line 77
    .line 78
    iget-object v8, v0, Lpr1;->k:Llp1;

    .line 79
    .line 80
    if-eqz v7, :cond_2

    .line 81
    .line 82
    iget-wide v9, v8, Llp1;->e:J

    .line 83
    .line 84
    :goto_1
    move-wide/from16 v23, v9

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    iget-wide v9, v8, Llp1;->f:J

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :goto_2
    const/16 v9, 0xe

    .line 91
    .line 92
    invoke-static {v9}, Lrg3;->D(I)J

    .line 93
    .line 94
    .line 95
    move-result-wide v25

    .line 96
    invoke-static {v4}, Lrg3;->D(I)J

    .line 97
    .line 98
    .line 99
    move-result-wide v31

    .line 100
    sget-object v27, Lim0;->k:Lim0;

    .line 101
    .line 102
    new-instance v33, Lw02;

    .line 103
    .line 104
    invoke-direct/range {v33 .. v33}, Lw02;-><init>()V

    .line 105
    .line 106
    .line 107
    new-instance v22, Lm13;

    .line 108
    .line 109
    const/16 v30, 0x0

    .line 110
    .line 111
    const v35, 0xe5fff8

    .line 112
    .line 113
    .line 114
    const-wide/16 v28, 0x0

    .line 115
    .line 116
    iget-object v4, v0, Lpr1;->l:Lya1;

    .line 117
    .line 118
    move-object/from16 v34, v4

    .line 119
    .line 120
    invoke-direct/range {v22 .. v35}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 121
    .line 122
    .line 123
    move-object/from16 v4, v22

    .line 124
    .line 125
    iget-boolean v12, v0, Lpr1;->n:Z

    .line 126
    .line 127
    invoke-virtual {v1, v12}, Lgo0;->g(Z)Z

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    iget-object v10, v0, Lpr1;->o:Lin0;

    .line 132
    .line 133
    invoke-virtual {v1, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    or-int/2addr v9, v11

    .line 138
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    if-nez v9, :cond_3

    .line 143
    .line 144
    if-ne v11, v6, :cond_4

    .line 145
    .line 146
    :cond_3
    new-instance v11, Lij;

    .line 147
    .line 148
    invoke-direct {v11, v10, v12}, Lij;-><init>(Lin0;Z)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v11}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_4
    move-object/from16 v26, v11

    .line 155
    .line 156
    check-cast v26, Lin0;

    .line 157
    .line 158
    move-object/from16 v25, v5

    .line 159
    .line 160
    new-instance v5, Lrr1;

    .line 161
    .line 162
    move-object/from16 v22, v8

    .line 163
    .line 164
    iget-object v8, v0, Lpr1;->w:Lgu2;

    .line 165
    .line 166
    iget-object v9, v0, Lpr1;->x:Lgu2;

    .line 167
    .line 168
    iget-boolean v10, v0, Lpr1;->y:Z

    .line 169
    .line 170
    iget-object v11, v0, Lpr1;->z:Lgu2;

    .line 171
    .line 172
    move v6, v12

    .line 173
    iget-object v12, v0, Lpr1;->A:Lgu2;

    .line 174
    .line 175
    iget-object v13, v0, Lpr1;->B:Lgu2;

    .line 176
    .line 177
    iget-object v14, v0, Lpr1;->C:Lgu2;

    .line 178
    .line 179
    iget-object v15, v0, Lpr1;->D:Lgu2;

    .line 180
    .line 181
    move-object/from16 p1, v2

    .line 182
    .line 183
    iget-object v2, v0, Lpr1;->E:Lmn0;

    .line 184
    .line 185
    move-object/from16 v16, v2

    .line 186
    .line 187
    iget-object v2, v0, Lpr1;->F:Lgu2;

    .line 188
    .line 189
    move-object/from16 v17, v2

    .line 190
    .line 191
    iget-object v2, v0, Lpr1;->G:Lmn0;

    .line 192
    .line 193
    move-object/from16 v18, v2

    .line 194
    .line 195
    iget-object v2, v0, Lpr1;->H:Lgu2;

    .line 196
    .line 197
    move-object/from16 v19, v2

    .line 198
    .line 199
    iget-object v2, v0, Lpr1;->I:Ljava/lang/String;

    .line 200
    .line 201
    move-object/from16 v24, v2

    .line 202
    .line 203
    move-object/from16 v23, v34

    .line 204
    .line 205
    invoke-direct/range {v5 .. v25}, Lrr1;-><init>(ZZLgu2;Lgu2;ZLgu2;Lgu2;Lgu2;Lgu2;Lgu2;Lmn0;Lgu2;Lmn0;Lgu2;JLlp1;Lya1;Ljava/lang/String;Lxk1;)V

    .line 206
    .line 207
    .line 208
    const v2, -0xad7f34d

    .line 209
    .line 210
    .line 211
    invoke-static {v2, v5, v1}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 212
    .line 213
    .line 214
    move-result-object v18

    .line 215
    const/16 v20, 0x0

    .line 216
    .line 217
    move-object/from16 v22, v4

    .line 218
    .line 219
    iget-object v4, v0, Lpr1;->m:Ljava/lang/String;

    .line 220
    .line 221
    iget-boolean v8, v0, Lpr1;->p:Z

    .line 222
    .line 223
    iget-object v10, v0, Lpr1;->q:Lm51;

    .line 224
    .line 225
    iget-object v11, v0, Lpr1;->r:Lk51;

    .line 226
    .line 227
    iget v13, v0, Lpr1;->s:I

    .line 228
    .line 229
    iget v14, v0, Lpr1;->t:I

    .line 230
    .line 231
    iget-object v15, v0, Lpr1;->u:Lwb3;

    .line 232
    .line 233
    const/16 v16, 0x0

    .line 234
    .line 235
    move-object/from16 v19, v1

    .line 236
    .line 237
    move-object/from16 v17, v3

    .line 238
    .line 239
    move v12, v6

    .line 240
    move-object/from16 v9, v22

    .line 241
    .line 242
    move-object/from16 v5, v26

    .line 243
    .line 244
    move-object/from16 v6, p1

    .line 245
    .line 246
    invoke-static/range {v4 .. v20}, Lik;->a(Ljava/lang/String;Lin0;Luh1;ZZLm13;Lm51;Lk51;ZIILwb3;Lin0;Lft2;Lkw;Lpx;I)V

    .line 247
    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_5
    move-object/from16 v19, v1

    .line 251
    .line 252
    invoke-virtual/range {v19 .. v19}, Lgo0;->R()V

    .line 253
    .line 254
    .line 255
    :goto_3
    sget-object v0, La83;->a:La83;

    .line 256
    .line 257
    return-object v0
.end method
