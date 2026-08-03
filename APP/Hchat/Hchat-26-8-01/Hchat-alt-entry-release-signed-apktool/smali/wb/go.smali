.class public final Lwb/go;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public g:Ls1/t;

.field public h:F

.field public i:F

.field public j:I

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lwb/t4;

.field public final synthetic n:Lfg/l;


# direct methods
.method public constructor <init>(Lwb/t4;Lfg/l;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwb/go;->m:Lwb/t4;

    .line 2
    .line 3
    iput-object p2, p0, Lwb/go;->n:Lfg/l;

    .line 4
    .line 5
    invoke-direct {p0, p3}, Lyf/h;-><init>(Lwf/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    new-instance v0, Lwb/go;

    .line 2
    .line 3
    iget-object v1, p0, Lwb/go;->m:Lwb/t4;

    .line 4
    .line 5
    iget-object v2, p0, Lwb/go;->n:Lfg/l;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lwb/go;-><init>(Lwb/t4;Lfg/l;Lwf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lwb/go;->l:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ls1/k0;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lwb/go;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lwb/go;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lwb/go;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lwb/go;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ls1/k0;

    .line 6
    .line 7
    iget v2, v0, Lwb/go;->k:I

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v7, 0x1

    .line 12
    sget-object v8, Lxf/a;->g:Lxf/a;

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    if-eq v2, v7, :cond_1

    .line 17
    .line 18
    if-ne v2, v4, :cond_0

    .line 19
    .line 20
    iget v2, v0, Lwb/go;->j:I

    .line 21
    .line 22
    iget v9, v0, Lwb/go;->i:F

    .line 23
    .line 24
    iget v10, v0, Lwb/go;->h:F

    .line 25
    .line 26
    iget-object v11, v0, Lwb/go;->g:Ls1/t;

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object/from16 v12, p1

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_0
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v5

    .line 40
    :cond_1
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object/from16 v2, p1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iput-object v1, v0, Lwb/go;->l:Ljava/lang/Object;

    .line 50
    .line 51
    iput v7, v0, Lwb/go;->k:I

    .line 52
    .line 53
    invoke-static {v1, v0, v4}, Lm/y2;->b(Ls1/k0;Lwf/c;I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-ne v2, v8, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    :goto_0
    check-cast v2, Ls1/t;

    .line 61
    .line 62
    move-object v11, v2

    .line 63
    const/4 v2, 0x0

    .line 64
    const/4 v9, 0x0

    .line 65
    const/4 v10, 0x0

    .line 66
    :goto_1
    iput-object v1, v0, Lwb/go;->l:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object v11, v0, Lwb/go;->g:Ls1/t;

    .line 69
    .line 70
    iput v10, v0, Lwb/go;->h:F

    .line 71
    .line 72
    iput v9, v0, Lwb/go;->i:F

    .line 73
    .line 74
    iput v2, v0, Lwb/go;->j:I

    .line 75
    .line 76
    iput v4, v0, Lwb/go;->k:I

    .line 77
    .line 78
    sget-object v12, Ls1/l;->h:Ls1/l;

    .line 79
    .line 80
    invoke-virtual {v1, v12, v0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v12

    .line 84
    if-ne v12, v8, :cond_4

    .line 85
    .line 86
    :goto_2
    return-object v8

    .line 87
    :cond_4
    :goto_3
    check-cast v12, Ls1/k;

    .line 88
    .line 89
    iget-object v12, v12, Ls1/k;->a:Ljava/lang/Object;

    .line 90
    .line 91
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v12

    .line 95
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v13

    .line 99
    if-eqz v13, :cond_6

    .line 100
    .line 101
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v13

    .line 105
    move-object v14, v13

    .line 106
    check-cast v14, Ls1/t;

    .line 107
    .line 108
    iget-wide v14, v14, Ls1/t;->a:J

    .line 109
    .line 110
    iget-wide v4, v11, Ls1/t;->a:J

    .line 111
    .line 112
    invoke-static {v14, v15, v4, v5}, Ls1/s;->e(JJ)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_5

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_5
    const/4 v4, 0x2

    .line 120
    const/4 v5, 0x0

    .line 121
    goto :goto_4

    .line 122
    :cond_6
    const/4 v13, 0x0

    .line 123
    :goto_5
    check-cast v13, Ls1/t;

    .line 124
    .line 125
    if-eqz v13, :cond_a

    .line 126
    .line 127
    iget-wide v4, v13, Ls1/t;->g:J

    .line 128
    .line 129
    iget-wide v14, v13, Ls1/t;->c:J

    .line 130
    .line 131
    const/16 v12, 0x20

    .line 132
    .line 133
    move/from16 v17, v7

    .line 134
    .line 135
    const/16 v16, 0x0

    .line 136
    .line 137
    shr-long v6, v14, v12

    .line 138
    .line 139
    long-to-int v6, v6

    .line 140
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    move-wide/from16 v18, v4

    .line 145
    .line 146
    shr-long v3, v18, v12

    .line 147
    .line 148
    long-to-int v3, v3

    .line 149
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    sub-float/2addr v6, v3

    .line 154
    const-wide v3, 0xffffffffL

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    and-long/2addr v14, v3

    .line 160
    long-to-int v5, v14

    .line 161
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    and-long v3, v18, v3

    .line 166
    .line 167
    long-to-int v3, v3

    .line 168
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    sub-float/2addr v5, v3

    .line 173
    add-float/2addr v10, v6

    .line 174
    add-float/2addr v9, v5

    .line 175
    if-nez v2, :cond_7

    .line 176
    .line 177
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    const/high16 v4, 0x41c00000    # 24.0f

    .line 182
    .line 183
    cmpl-float v3, v3, v4

    .line 184
    .line 185
    if-lez v3, :cond_7

    .line 186
    .line 187
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    const v5, 0x3faccccd    # 1.35f

    .line 196
    .line 197
    .line 198
    mul-float/2addr v4, v5

    .line 199
    cmpl-float v3, v3, v4

    .line 200
    .line 201
    if-lez v3, :cond_7

    .line 202
    .line 203
    move/from16 v2, v17

    .line 204
    .line 205
    :cond_7
    if-eqz v2, :cond_8

    .line 206
    .line 207
    invoke-virtual {v13}, Ls1/t;->a()V

    .line 208
    .line 209
    .line 210
    :cond_8
    iget-boolean v3, v13, Ls1/t;->d:Z

    .line 211
    .line 212
    if-nez v3, :cond_9

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_9
    move/from16 v7, v17

    .line 216
    .line 217
    const/4 v4, 0x2

    .line 218
    const/4 v5, 0x0

    .line 219
    goto/16 :goto_1

    .line 220
    .line 221
    :cond_a
    move/from16 v17, v7

    .line 222
    .line 223
    const/16 v16, 0x0

    .line 224
    .line 225
    :goto_6
    if-eqz v2, :cond_c

    .line 226
    .line 227
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    const/high16 v2, 0x42ac0000    # 86.0f

    .line 232
    .line 233
    cmpl-float v1, v1, v2

    .line 234
    .line 235
    if-lez v1, :cond_c

    .line 236
    .line 237
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    const v3, 0x3f99999a    # 1.2f

    .line 246
    .line 247
    .line 248
    mul-float/2addr v2, v3

    .line 249
    cmpl-float v1, v1, v2

    .line 250
    .line 251
    if-lez v1, :cond_c

    .line 252
    .line 253
    cmpg-float v1, v10, v16

    .line 254
    .line 255
    sget-object v2, Lwb/t4;->l:Lzf/b;

    .line 256
    .line 257
    iget-object v3, v0, Lwb/go;->m:Lwb/t4;

    .line 258
    .line 259
    if-gez v1, :cond_b

    .line 260
    .line 261
    sget-object v1, Lwb/ho;->a:Log/k;

    .line 262
    .line 263
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    add-int/lit8 v1, v1, 0x1

    .line 268
    .line 269
    invoke-static {v2}, La/a;->b0(Ljava/util/List;)I

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    const/4 v7, 0x0

    .line 274
    :goto_7
    invoke-static {v1, v7, v4}, Lr9/e0;->r(III)I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    invoke-virtual {v2, v1}, Lzf/b;->get(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    check-cast v1, Lwb/t4;

    .line 283
    .line 284
    goto :goto_8

    .line 285
    :cond_b
    const/4 v7, 0x0

    .line 286
    sget-object v1, Lwb/ho;->a:Log/k;

    .line 287
    .line 288
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    add-int/lit8 v1, v1, -0x1

    .line 293
    .line 294
    invoke-static {v2}, La/a;->b0(Ljava/util/List;)I

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    goto :goto_7

    .line 299
    :goto_8
    if-eq v1, v3, :cond_c

    .line 300
    .line 301
    iget-object v2, v0, Lwb/go;->n:Lfg/l;

    .line 302
    .line 303
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    :cond_c
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 307
    .line 308
    return-object v1
.end method
