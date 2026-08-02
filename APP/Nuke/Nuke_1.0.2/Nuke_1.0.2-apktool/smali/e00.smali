.class public final Le00;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public m:I

.field public final synthetic n:J

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lp02;Ljava/lang/String;JLf13;Lb03;Lus1;Lt00;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Le00;->l:I

    .line 3
    .line 4
    iput-object p1, p0, Le00;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Le00;->p:Ljava/lang/Object;

    .line 7
    .line 8
    iput-wide p3, p0, Le00;->n:J

    .line 9
    .line 10
    iput-object p5, p0, Le00;->q:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p6, p0, Le00;->r:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p7, p0, Le00;->s:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    invoke-direct {p0, p1, p8}, Ltw2;-><init>(ILt00;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Lp83;Lg00;Lvm;JLk21;Lt00;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le00;->l:I

    .line 21
    iput-object p1, p0, Le00;->p:Ljava/lang/Object;

    iput-object p2, p0, Le00;->q:Ljava/lang/Object;

    iput-object p3, p0, Le00;->r:Ljava/lang/Object;

    iput-wide p4, p0, Le00;->n:J

    iput-object p6, p0, Le00;->s:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ltw2;-><init>(ILt00;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Le00;->l:I

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
    invoke-virtual {p0, p2, p1}, Le00;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Le00;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Le00;->r(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p2, p1}, Le00;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Le00;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Le00;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 14

    .line 1
    iget v0, p0, Le00;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Le00;->s:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Le00;->r:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Le00;->q:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Le00;->p:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v5, Le00;

    .line 15
    .line 16
    iget-object v0, p0, Le00;->o:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v6, v0

    .line 19
    check-cast v6, Lp02;

    .line 20
    .line 21
    move-object v7, v4

    .line 22
    check-cast v7, Ljava/lang/String;

    .line 23
    .line 24
    move-object v10, v3

    .line 25
    check-cast v10, Lf13;

    .line 26
    .line 27
    move-object v11, v2

    .line 28
    check-cast v11, Lb03;

    .line 29
    .line 30
    move-object v12, v1

    .line 31
    check-cast v12, Lus1;

    .line 32
    .line 33
    iget-wide v8, p0, Le00;->n:J

    .line 34
    .line 35
    move-object v13, p1

    .line 36
    invoke-direct/range {v5 .. v13}, Le00;-><init>(Lp02;Ljava/lang/String;JLf13;Lb03;Lus1;Lt00;)V

    .line 37
    .line 38
    .line 39
    return-object v5

    .line 40
    :pswitch_0
    new-instance v6, Le00;

    .line 41
    .line 42
    move-object v7, v4

    .line 43
    check-cast v7, Lp83;

    .line 44
    .line 45
    move-object v8, v3

    .line 46
    check-cast v8, Lg00;

    .line 47
    .line 48
    move-object v9, v2

    .line 49
    check-cast v9, Lvm;

    .line 50
    .line 51
    iget-wide v10, p0, Le00;->n:J

    .line 52
    .line 53
    move-object v12, v1

    .line 54
    check-cast v12, Lk21;

    .line 55
    .line 56
    move-object v13, p1

    .line 57
    invoke-direct/range {v6 .. v13}, Le00;-><init>(Lp83;Lg00;Lvm;JLk21;Lt00;)V

    .line 58
    .line 59
    .line 60
    move-object/from16 p0, p2

    .line 61
    .line 62
    iput-object p0, v6, Le00;->o:Ljava/lang/Object;

    .line 63
    .line 64
    return-object v6

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Le00;->l:I

    .line 4
    .line 5
    iget-object v2, v0, Le00;->q:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x7

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    sget-object v5, Lk20;->h:Lk20;

    .line 11
    .line 12
    iget-object v6, v0, Le00;->r:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    iget-object v8, v0, Le00;->p:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v9, v0, Le00;->s:Ljava/lang/Object;

    .line 18
    .line 19
    sget-object v10, La83;->a:La83;

    .line 20
    .line 21
    const/4 v11, 0x0

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast v9, Lus1;

    .line 26
    .line 27
    move-object/from16 v17, v8

    .line 28
    .line 29
    check-cast v17, Ljava/lang/String;

    .line 30
    .line 31
    check-cast v6, Lb03;

    .line 32
    .line 33
    iget v1, v0, Le00;->m:I

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    if-ne v1, v7, :cond_0

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object/from16 v0, p1

    .line 43
    .line 44
    move-object/from16 v8, v17

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_0
    invoke-static {v4}, Ls;->l(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    move-object v5, v11

    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_1
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v0, Le00;->o:Ljava/lang/Object;

    .line 57
    .line 58
    move-object/from16 v16, v1

    .line 59
    .line 60
    check-cast v16, Lp02;

    .line 61
    .line 62
    iput v7, v0, Le00;->m:I

    .line 63
    .line 64
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_2

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    iget-wide v13, v0, Le00;->n:J

    .line 75
    .line 76
    invoke-static {v13, v14}, Lf13;->c(J)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    :goto_0
    move-object v0, v11

    .line 83
    move-object/from16 v8, v17

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    new-instance v12, Lo02;

    .line 87
    .line 88
    const/4 v15, 0x0

    .line 89
    invoke-direct/range {v12 .. v17}, Lo02;-><init>(JLt00;Lp02;Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    move-object/from16 v1, v16

    .line 93
    .line 94
    move-object/from16 v8, v17

    .line 95
    .line 96
    iget-object v4, v1, Lp02;->a:La20;

    .line 97
    .line 98
    new-instance v7, Lk9;

    .line 99
    .line 100
    invoke-direct {v7, v1, v12, v11, v3}, Lk9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 101
    .line 102
    .line 103
    invoke-static {v4, v7, v0}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :goto_1
    if-ne v0, v5, :cond_4

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_4
    :goto_2
    check-cast v0, Lf13;

    .line 111
    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    iget-wide v0, v0, Lf13;->a:J

    .line 115
    .line 116
    const/16 v3, 0x20

    .line 117
    .line 118
    shr-long v3, v0, v3

    .line 119
    .line 120
    long-to-int v3, v3

    .line 121
    invoke-interface {v9, v3}, Lus1;->n(I)I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    const-wide v4, 0xffffffffL

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    and-long/2addr v0, v4

    .line 131
    long-to-int v0, v0

    .line 132
    invoke-interface {v9, v0}, Lus1;->n(I)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    invoke-static {v3, v0}, Lfg1;->i(II)J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    check-cast v2, Lf13;

    .line 141
    .line 142
    invoke-static {v0, v1, v2}, Lf13;->a(JLjava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-nez v2, :cond_5

    .line 147
    .line 148
    invoke-virtual {v6}, Lb03;->n()Lk03;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    iget-object v2, v2, Lk03;->a:Lsd;

    .line 153
    .line 154
    iget-object v2, v2, Lsd;->i:Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {v2, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v2, :cond_5

    .line 161
    .line 162
    iget-object v2, v6, Lb03;->b:Lus1;

    .line 163
    .line 164
    if-ne v9, v2, :cond_5

    .line 165
    .line 166
    iget-object v2, v6, Lb03;->c:Lin0;

    .line 167
    .line 168
    invoke-virtual {v6}, Lb03;->n()Lk03;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    iget-object v3, v3, Lk03;->a:Lsd;

    .line 173
    .line 174
    invoke-static {v3, v0, v1}, Lb03;->e(Lsd;J)Lk03;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-interface {v2, v3}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    new-instance v2, Lf13;

    .line 182
    .line 183
    invoke-direct {v2, v0, v1}, Lf13;-><init>(J)V

    .line 184
    .line 185
    .line 186
    iput-object v2, v6, Lb03;->w:Lf13;

    .line 187
    .line 188
    :cond_5
    move-object v5, v10

    .line 189
    :goto_3
    return-object v5

    .line 190
    :pswitch_0
    check-cast v6, Lvm;

    .line 191
    .line 192
    check-cast v2, Lg00;

    .line 193
    .line 194
    check-cast v8, Lp83;

    .line 195
    .line 196
    iget v1, v0, Le00;->m:I

    .line 197
    .line 198
    if-eqz v1, :cond_7

    .line 199
    .line 200
    if-ne v1, v7, :cond_6

    .line 201
    .line 202
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_6
    invoke-static {v4}, Ls;->l(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    move-object v5, v11

    .line 210
    goto :goto_5

    .line 211
    :cond_7
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    iget-object v1, v0, Le00;->o:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v1, Lgm2;

    .line 217
    .line 218
    iget-wide v11, v0, Le00;->n:J

    .line 219
    .line 220
    invoke-static {v2, v6, v11, v12}, Lg00;->M0(Lg00;Lvm;J)F

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    iput v4, v8, Lp83;->e:F

    .line 225
    .line 226
    check-cast v9, Lk21;

    .line 227
    .line 228
    new-instance v4, Lm0;

    .line 229
    .line 230
    invoke-direct {v4, v2, v8, v9, v1}, Lm0;-><init>(Lg00;Lp83;Lk21;Lgm2;)V

    .line 231
    .line 232
    .line 233
    new-instance v1, Ls1;

    .line 234
    .line 235
    invoke-direct {v1, v2, v8, v6, v3}, Ls1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 236
    .line 237
    .line 238
    iput v7, v0, Le00;->m:I

    .line 239
    .line 240
    invoke-virtual {v8, v4, v1, v0}, Lp83;->a(Lm0;Ls1;Lu00;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    if-ne v0, v5, :cond_8

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_8
    :goto_4
    move-object v5, v10

    .line 248
    :goto_5
    return-object v5

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
