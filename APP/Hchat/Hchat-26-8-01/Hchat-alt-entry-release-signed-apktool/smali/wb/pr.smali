.class public final synthetic Lwb/pr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Lfb/c;

.field public final synthetic h:Z

.field public final synthetic i:I

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:J

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Z

.field public final synthetic n:Z

.field public final synthetic o:Lfg/l;

.field public final synthetic p:Lfg/l;

.field public final synthetic q:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lfb/c;ZILjava/util/List;JLjava/lang/String;ZZLfg/l;Lfg/l;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/pr;->g:Lfb/c;

    .line 5
    .line 6
    iput-boolean p2, p0, Lwb/pr;->h:Z

    .line 7
    .line 8
    iput p3, p0, Lwb/pr;->i:I

    .line 9
    .line 10
    iput-object p4, p0, Lwb/pr;->j:Ljava/util/List;

    .line 11
    .line 12
    iput-wide p5, p0, Lwb/pr;->k:J

    .line 13
    .line 14
    iput-object p7, p0, Lwb/pr;->l:Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p8, p0, Lwb/pr;->m:Z

    .line 17
    .line 18
    iput-boolean p9, p0, Lwb/pr;->n:Z

    .line 19
    .line 20
    iput-object p10, p0, Lwb/pr;->o:Lfg/l;

    .line 21
    .line 22
    iput-object p11, p0, Lwb/pr;->p:Lfg/l;

    .line 23
    .line 24
    iput-object p12, p0, Lwb/pr;->q:Li0/a1;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v2, v0, Lwb/pr;->g:Lfb/c;

    .line 4
    .line 5
    iget-object v1, v2, Lfb/c;->a:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v2, Lfb/c;->n:Ljava/lang/String;

    .line 8
    .line 9
    move-object/from16 v4, p1

    .line 10
    .line 11
    check-cast v4, Lr/d;

    .line 12
    .line 13
    move-object/from16 v11, p2

    .line 14
    .line 15
    check-cast v11, Li0/h0;

    .line 16
    .line 17
    move-object/from16 v5, p3

    .line 18
    .line 19
    check-cast v5, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    and-int/lit8 v4, v5, 0x11

    .line 29
    .line 30
    const/16 v6, 0x10

    .line 31
    .line 32
    const/4 v7, 0x1

    .line 33
    if-eq v4, v6, :cond_0

    .line 34
    .line 35
    move v4, v7

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v4, 0x0

    .line 38
    :goto_0
    and-int/2addr v5, v7

    .line 39
    invoke-virtual {v11, v5, v4}, Li0/h0;->S(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_10

    .line 44
    .line 45
    sget-object v4, Lwb/y2;->n:Lwb/y2;

    .line 46
    .line 47
    iget-boolean v5, v0, Lwb/pr;->h:Z

    .line 48
    .line 49
    iget v6, v0, Lwb/pr;->i:I

    .line 50
    .line 51
    iget-object v9, v0, Lwb/pr;->j:Ljava/util/List;

    .line 52
    .line 53
    if-eqz v5, :cond_1

    .line 54
    .line 55
    invoke-static {v9}, La/a;->b0(Ljava/util/List;)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-ne v6, v5, :cond_1

    .line 60
    .line 61
    move v5, v7

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    const/4 v5, 0x0

    .line 64
    :goto_1
    iget-boolean v10, v0, Lwb/pr;->m:Z

    .line 65
    .line 66
    if-eqz v10, :cond_2

    .line 67
    .line 68
    const-string v10, "tool"

    .line 69
    .line 70
    invoke-static {v1, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    if-nez v10, :cond_2

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    const/4 v7, 0x0

    .line 78
    :goto_2
    invoke-virtual {v11, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    sget-object v13, Li0/l;->a:Li0/e;

    .line 87
    .line 88
    if-nez v10, :cond_3

    .line 89
    .line 90
    if-ne v12, v13, :cond_4

    .line 91
    .line 92
    :cond_3
    new-instance v12, Lwb/xi;

    .line 93
    .line 94
    const/16 v10, 0x10

    .line 95
    .line 96
    iget-object v14, v0, Lwb/pr;->q:Li0/a1;

    .line 97
    .line 98
    invoke-direct {v12, v2, v10, v14}, Lwb/xi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    check-cast v12, Lfg/a;

    .line 105
    .line 106
    iget-boolean v10, v0, Lwb/pr;->n:Z

    .line 107
    .line 108
    const-string v15, "error"

    .line 109
    .line 110
    const-string v14, "interrupted"

    .line 111
    .line 112
    if-nez v10, :cond_5

    .line 113
    .line 114
    invoke-static {v3, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v16

    .line 118
    if-nez v16, :cond_6

    .line 119
    .line 120
    invoke-static {v3, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v16

    .line 124
    if-eqz v16, :cond_5

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_5
    move-object/from16 v16, v2

    .line 128
    .line 129
    :goto_3
    const/4 v2, 0x0

    .line 130
    goto :goto_7

    .line 131
    :cond_6
    :goto_4
    add-int/lit8 v8, v6, 0x1

    .line 132
    .line 133
    invoke-static {v8, v9}, Ltf/m;->q1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-eqz v9, :cond_8

    .line 142
    .line 143
    :cond_7
    move-object/from16 v16, v2

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_8
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    if-eqz v9, :cond_7

    .line 155
    .line 156
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    check-cast v9, Lfb/c;

    .line 161
    .line 162
    iget-object v9, v9, Lfb/c;->a:Ljava/lang/String;

    .line 163
    .line 164
    move-object/from16 v16, v2

    .line 165
    .line 166
    const-string v2, "user"

    .line 167
    .line 168
    invoke-static {v9, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_9

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_9
    move-object/from16 v2, v16

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :goto_6
    const v2, 0x16f09226

    .line 179
    .line 180
    .line 181
    invoke-virtual {v11, v2}, Li0/h0;->a0(I)V

    .line 182
    .line 183
    .line 184
    iget-object v2, v0, Lwb/pr;->o:Lfg/l;

    .line 185
    .line 186
    invoke-virtual {v11, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    invoke-virtual {v11, v6}, Li0/h0;->d(I)Z

    .line 191
    .line 192
    .line 193
    move-result v9

    .line 194
    or-int/2addr v8, v9

    .line 195
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    if-nez v8, :cond_a

    .line 200
    .line 201
    if-ne v9, v13, :cond_b

    .line 202
    .line 203
    :cond_a
    new-instance v9, Lwb/wg;

    .line 204
    .line 205
    const/4 v8, 0x6

    .line 206
    invoke-direct {v9, v6, v8, v2}, Lwb/wg;-><init>(IILfg/l;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v11, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    :cond_b
    check-cast v9, Lfg/a;

    .line 213
    .line 214
    const/4 v2, 0x0

    .line 215
    invoke-virtual {v11, v2}, Li0/h0;->p(Z)V

    .line 216
    .line 217
    .line 218
    goto :goto_8

    .line 219
    :goto_7
    const v8, 0x16f23f4d

    .line 220
    .line 221
    .line 222
    invoke-virtual {v11, v8}, Li0/h0;->a0(I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v11, v2}, Li0/h0;->p(Z)V

    .line 226
    .line 227
    .line 228
    const/4 v9, 0x0

    .line 229
    :goto_8
    if-nez v10, :cond_c

    .line 230
    .line 231
    const-string v2, "assistant"

    .line 232
    .line 233
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-eqz v1, :cond_c

    .line 238
    .line 239
    invoke-static {v3, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-nez v1, :cond_d

    .line 244
    .line 245
    invoke-static {v3, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    if-eqz v1, :cond_c

    .line 250
    .line 251
    goto :goto_9

    .line 252
    :cond_c
    const/4 v2, 0x0

    .line 253
    goto :goto_b

    .line 254
    :cond_d
    :goto_9
    const v1, 0x16f698a4

    .line 255
    .line 256
    .line 257
    invoke-virtual {v11, v1}, Li0/h0;->a0(I)V

    .line 258
    .line 259
    .line 260
    iget-object v1, v0, Lwb/pr;->p:Lfg/l;

    .line 261
    .line 262
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    invoke-virtual {v11, v6}, Li0/h0;->d(I)Z

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    or-int/2addr v2, v3

    .line 271
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    if-nez v2, :cond_e

    .line 276
    .line 277
    if-ne v3, v13, :cond_f

    .line 278
    .line 279
    :cond_e
    new-instance v3, Lwb/wg;

    .line 280
    .line 281
    const/4 v2, 0x7

    .line 282
    invoke-direct {v3, v6, v2, v1}, Lwb/wg;-><init>(IILfg/l;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v11, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    :cond_f
    move-object v14, v3

    .line 289
    check-cast v14, Lfg/a;

    .line 290
    .line 291
    const/4 v2, 0x0

    .line 292
    invoke-virtual {v11, v2}, Li0/h0;->p(Z)V

    .line 293
    .line 294
    .line 295
    move-object v10, v14

    .line 296
    :goto_a
    move-object v8, v12

    .line 297
    goto :goto_c

    .line 298
    :goto_b
    const v1, 0x16f84d4d

    .line 299
    .line 300
    .line 301
    invoke-virtual {v11, v1}, Li0/h0;->a0(I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v11, v2}, Li0/h0;->p(Z)V

    .line 305
    .line 306
    .line 307
    const/4 v10, 0x0

    .line 308
    goto :goto_a

    .line 309
    :goto_c
    const/high16 v12, 0x6000000

    .line 310
    .line 311
    move-object v1, v4

    .line 312
    move v3, v5

    .line 313
    iget-wide v4, v0, Lwb/pr;->k:J

    .line 314
    .line 315
    iget-object v6, v0, Lwb/pr;->l:Ljava/lang/String;

    .line 316
    .line 317
    move-object/from16 v2, v16

    .line 318
    .line 319
    invoke-virtual/range {v1 .. v12}, Lwb/y2;->b0(Lfb/c;ZJLjava/lang/String;ZLfg/a;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 320
    .line 321
    .line 322
    goto :goto_d

    .line 323
    :cond_10
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 324
    .line 325
    .line 326
    :goto_d
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 327
    .line 328
    return-object v1
.end method
