.class public final Lak;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lh01;


# instance fields
.field public h:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lak;->h:I

    .line 5
    .line 6
    if-lez p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "maxSchemaBytes must be positive."

    .line 10
    .line 11
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    throw p0
.end method


# virtual methods
.method public a(Lsz0;Lth2;Lu00;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lof2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lof2;

    .line 7
    .line 8
    iget v1, v0, Lof2;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lof2;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lof2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lof2;-><init>(Lak;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lof2;->m:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lof2;->o:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    sget-object v5, Lk20;->h:Lk20;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v4

    .line 50
    :cond_2
    iget-object p2, v0, Lof2;->l:Lth2;

    .line 51
    .line 52
    iget-object p1, v0, Lof2;->k:Lsz0;

    .line 53
    .line 54
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p3, p2, Lth2;->j:Ljava/lang/String;

    .line 62
    .line 63
    if-nez p3, :cond_4

    .line 64
    .line 65
    return-object v4

    .line 66
    :cond_4
    iput-object p1, v0, Lof2;->k:Lsz0;

    .line 67
    .line 68
    iput-object p2, v0, Lof2;->l:Lth2;

    .line 69
    .line 70
    iput v3, v0, Lof2;->o:I

    .line 71
    .line 72
    iget-object p3, p1, Lsz0;->i:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p3, Lc20;

    .line 75
    .line 76
    new-instance v1, Lu80;

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-direct {v1, p1, v4, v3}, Lu80;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 80
    .line 81
    .line 82
    invoke-static {p3, v1, v0}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    if-ne p3, v5, :cond_5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    :goto_1
    check-cast p3, Ljava/util/List;

    .line 90
    .line 91
    iput-object v4, v0, Lof2;->k:Lsz0;

    .line 92
    .line 93
    iput-object v4, v0, Lof2;->l:Lth2;

    .line 94
    .line 95
    iput v2, v0, Lof2;->o:I

    .line 96
    .line 97
    invoke-virtual {p0, p1, p2, p3, v0}, Lak;->b(Lsz0;Lth2;Ljava/util/List;Lu00;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    if-ne p3, v5, :cond_6

    .line 102
    .line 103
    :goto_2
    return-object v5

    .line 104
    :cond_6
    :goto_3
    check-cast p3, Lmf2;

    .line 105
    .line 106
    iget-object p0, p3, Lmf2;->a:Llf2;

    .line 107
    .line 108
    return-object p0
.end method

.method public b(Lsz0;Lth2;Ljava/util/List;Lu00;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    iget v2, p0, Lak;->h:I

    .line 4
    .line 5
    instance-of v3, v0, Lpf2;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v0

    .line 10
    check-cast v3, Lpf2;

    .line 11
    .line 12
    iget v4, v3, Lpf2;->o:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Lpf2;->o:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Lpf2;

    .line 25
    .line 26
    invoke-direct {v3, p0, v0}, Lpf2;-><init>(Lak;Lu00;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p0, v3, Lpf2;->m:Ljava/lang/Object;

    .line 30
    .line 31
    iget v0, v3, Lpf2;->o:I

    .line 32
    .line 33
    sget-object v6, Lsi2;->j:Lsi2;

    .line 34
    .line 35
    const-string v4, " bytes."

    .line 36
    .line 37
    const-string v5, "Config schema exceeds the maximum of "

    .line 38
    .line 39
    const/4 v7, 0x2

    .line 40
    const/4 v8, 0x1

    .line 41
    const/4 v9, 0x0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    if-eq v0, v8, :cond_2

    .line 45
    .line 46
    if-ne v0, v7, :cond_1

    .line 47
    .line 48
    iget-object p1, v3, Lpf2;->l:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v1, v3, Lpf2;->k:Lth2;

    .line 51
    .line 52
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :catchall_0
    move-exception v0

    .line 58
    move-object p0, v0

    .line 59
    move-object v11, p0

    .line 60
    move-object v9, p1

    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v9

    .line 69
    :cond_2
    iget-object p1, v3, Lpf2;->l:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v1, v3, Lpf2;->k:Lth2;

    .line 72
    .line 73
    :try_start_1
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object p0, p2, Lth2;->j:Ljava/lang/String;

    .line 81
    .line 82
    if-nez p0, :cond_4

    .line 83
    .line 84
    new-instance p0, Lmf2;

    .line 85
    .line 86
    const/4 p1, 0x0

    .line 87
    invoke-direct {p0, v9, p1}, Lmf2;-><init>(Llf2;I)V

    .line 88
    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_4
    new-instance v0, Loi2;

    .line 92
    .line 93
    invoke-direct {v0, p0}, Loi2;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    move-object v9, p3

    .line 97
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_c

    .line 102
    .line 103
    sget-object v0, Lk20;->h:Lk20;

    .line 104
    .line 105
    if-eqz p1, :cond_6

    .line 106
    .line 107
    :try_start_2
    iput-object p2, v3, Lpf2;->k:Lth2;

    .line 108
    .line 109
    iput-object p0, v3, Lpf2;->l:Ljava/lang/String;

    .line 110
    .line 111
    iput v8, v3, Lpf2;->o:I

    .line 112
    .line 113
    invoke-virtual {p1, p0, v2, v3}, Lsz0;->K(Ljava/lang/String;ILu00;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 117
    if-ne p1, v0, :cond_5

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    move-object v1, p1

    .line 121
    move-object p1, p0

    .line 122
    move-object p0, v1

    .line 123
    move-object v1, p2

    .line 124
    :goto_1
    :try_start_3
    check-cast p0, Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 125
    .line 126
    :goto_2
    move-object v7, p1

    .line 127
    goto :goto_5

    .line 128
    :catchall_1
    move-exception v0

    .line 129
    move-object p1, v0

    .line 130
    move-object v9, p0

    .line 131
    move-object v11, p1

    .line 132
    move-object v1, p2

    .line 133
    goto :goto_6

    .line 134
    :cond_6
    :try_start_4
    iput-object p2, v3, Lpf2;->k:Lth2;

    .line 135
    .line 136
    iput-object p0, v3, Lpf2;->l:Ljava/lang/String;

    .line 137
    .line 138
    iput v7, v3, Lpf2;->o:I

    .line 139
    .line 140
    const v7, 0x7fffffff

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, p0, v7, v3}, Lsz0;->K(Ljava/lang/String;ILu00;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 147
    if-ne p1, v0, :cond_7

    .line 148
    .line 149
    :goto_3
    return-object v0

    .line 150
    :cond_7
    move-object v1, p1

    .line 151
    move-object p1, p0

    .line 152
    move-object p0, v1

    .line 153
    move-object v1, p2

    .line 154
    :goto_4
    :try_start_5
    check-cast p0, Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :goto_5
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    array-length p1, p1

    .line 170
    if-gt p1, v2, :cond_9

    .line 171
    .line 172
    :try_start_6
    invoke-static {p0}, Lnf2;->i(Ljava/lang/String;)Llf2;

    .line 173
    .line 174
    .line 175
    move-result-object p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 176
    new-instance v0, Lmf2;

    .line 177
    .line 178
    invoke-direct {v0, p0, p1}, Lmf2;-><init>(Llf2;I)V

    .line 179
    .line 180
    .line 181
    return-object v0

    .line 182
    :catchall_2
    move-exception v0

    .line 183
    move-object v9, v0

    .line 184
    new-instance v4, Ldg2;

    .line 185
    .line 186
    iget-object v5, v1, Lth2;->c:Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    if-nez p0, :cond_8

    .line 193
    .line 194
    const-string p0, "Invalid config schema."

    .line 195
    .line 196
    :cond_8
    move-object v8, p0

    .line 197
    invoke-direct/range {v4 .. v9}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    throw v4

    .line 201
    :cond_9
    new-instance p0, Ldg2;

    .line 202
    .line 203
    iget-object p1, v1, Lth2;->c:Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {v2, v5, v4}, Lhk1;->g(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    const/4 v9, 0x0

    .line 210
    const/16 v10, 0x10

    .line 211
    .line 212
    move-object v4, p0

    .line 213
    move-object v5, p1

    .line 214
    invoke-direct/range {v4 .. v10}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 215
    .line 216
    .line 217
    throw v4

    .line 218
    :goto_6
    instance-of p0, v11, Ljava/util/concurrent/CancellationException;

    .line 219
    .line 220
    if-nez p0, :cond_b

    .line 221
    .line 222
    instance-of p0, v11, Lbh2;

    .line 223
    .line 224
    if-eqz p0, :cond_a

    .line 225
    .line 226
    move-object p0, v11

    .line 227
    check-cast p0, Lbh2;

    .line 228
    .line 229
    iget p0, p0, Lbh2;->h:I

    .line 230
    .line 231
    invoke-static {p0, v5, v4}, Lhk1;->g(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    :goto_7
    move-object v10, p0

    .line 236
    goto :goto_8

    .line 237
    :cond_a
    const-string p0, "Unable to read config schema as UTF-8."

    .line 238
    .line 239
    goto :goto_7

    .line 240
    :goto_8
    new-instance v6, Ldg2;

    .line 241
    .line 242
    iget-object v7, v1, Lth2;->c:Ljava/lang/String;

    .line 243
    .line 244
    sget-object v8, Lsi2;->i:Lsi2;

    .line 245
    .line 246
    invoke-direct/range {v6 .. v11}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 247
    .line 248
    .line 249
    throw v6

    .line 250
    :cond_b
    throw v11

    .line 251
    :cond_c
    new-instance v4, Ldg2;

    .line 252
    .line 253
    iget-object v5, p2, Lth2;->c:Ljava/lang/String;

    .line 254
    .line 255
    const/4 v9, 0x0

    .line 256
    const/16 v10, 0x10

    .line 257
    .line 258
    const-string v8, "Config schema declared by the manifest does not exist."

    .line 259
    .line 260
    move-object v7, p0

    .line 261
    invoke-direct/range {v4 .. v10}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 262
    .line 263
    .line 264
    throw v4
.end method

.method public c(Lj23;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lak;->f(Li01;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d(Lxz1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lak;->f(Li01;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public e(Lwz1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lak;->f(Li01;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public f(Li01;)V
    .locals 4

    .line 1
    iget-object v0, p1, Li01;->j:Lr72;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, v0, Lr72;->h:I

    .line 6
    .line 7
    invoke-virtual {v0}, Lr72;->d()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int/2addr v0, v1

    .line 12
    iget v1, p0, Lak;->h:I

    .line 13
    .line 14
    if-le v0, v1, :cond_0

    .line 15
    .line 16
    iput v0, p0, Lak;->h:I

    .line 17
    .line 18
    :cond_0
    iget-object p1, p1, Li01;->k:Ls72;

    .line 19
    .line 20
    iget-object v0, p1, Lkj0;->i:[Ljava/lang/Object;

    .line 21
    .line 22
    array-length v0, v0

    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    if-ge v1, v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Lkj0;->e(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lr72;

    .line 31
    .line 32
    iget v3, v2, Lr72;->h:I

    .line 33
    .line 34
    invoke-virtual {v2}, Lr72;->d()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/2addr v2, v3

    .line 39
    iget v3, p0, Lak;->h:I

    .line 40
    .line 41
    if-le v2, v3, :cond_1

    .line 42
    .line 43
    iput v2, p0, Lak;->h:I

    .line 44
    .line 45
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    return-void
.end method

.method public h(Lk23;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lak;->f(Li01;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
