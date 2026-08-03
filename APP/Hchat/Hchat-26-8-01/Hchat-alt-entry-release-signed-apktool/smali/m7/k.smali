.class public final Lm7/k;
.super Lo7/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final m:Lm7/v;

.field public final n:Lm7/t;

.field public final o:Ld7/b;

.field public final p:Lm7/l;

.field public final q:Ld7/b;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-direct {p0, v0}, Lo7/e;-><init>(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Ld7/b;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v2, v1}, Ld7/b;-><init>(Lk7/f;I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lm7/v;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lm7/v;-><init>(Ld7/b;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lm7/k;->m:Lm7/v;

    .line 18
    .line 19
    new-instance v3, Lm7/l;

    .line 20
    .line 21
    invoke-direct {v3}, Lm7/l;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v4, Lm7/t;

    .line 25
    .line 26
    invoke-direct {v4, v3}, Lm7/t;-><init>(Lm7/l;)V

    .line 27
    .line 28
    .line 29
    iput-object v4, p0, Lm7/k;->n:Lm7/t;

    .line 30
    .line 31
    new-instance v5, Ld7/b;

    .line 32
    .line 33
    const/4 v6, 0x2

    .line 34
    invoke-direct {v5, v2, v6}, Ld7/b;-><init>(Lk7/f;I)V

    .line 35
    .line 36
    .line 37
    iput-object v5, p0, Lm7/k;->o:Ld7/b;

    .line 38
    .line 39
    iput-object v3, p0, Lm7/k;->p:Lm7/l;

    .line 40
    .line 41
    iput-object v0, p0, Lm7/k;->q:Ld7/b;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-virtual {p0, v2, v1}, Lo7/e;->P(ILk7/a;)V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-virtual {p0, v1, v4}, Lo7/e;->P(ILk7/a;)V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x2

    .line 52
    invoke-virtual {p0, v1, v5}, Lo7/e;->P(ILk7/a;)V

    .line 53
    .line 54
    .line 55
    const/4 v1, 0x3

    .line 56
    invoke-virtual {p0, v1, v3}, Lo7/e;->P(ILk7/a;)V

    .line 57
    .line 58
    .line 59
    const/4 v1, 0x4

    .line 60
    invoke-virtual {p0, v1, v0}, Lo7/e;->P(ILk7/a;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 13

    .line 1
    new-instance v0, Lz7/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lz7/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    move v2, v1

    .line 8
    :goto_0
    invoke-virtual {p1}, Lq7/b;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_12

    .line 13
    .line 14
    invoke-static {p1}, Lp7/b;->T(Lq7/b;)Lp7/b;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-class v4, Lm7/j;

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x1

    .line 22
    const/16 v7, 0x9

    .line 23
    .line 24
    const/4 v8, 0x5

    .line 25
    const/16 v9, 0x8

    .line 26
    .line 27
    const/4 v10, 0x7

    .line 28
    const/4 v11, 0x6

    .line 29
    if-nez v1, :cond_7

    .line 30
    .line 31
    invoke-virtual {v3}, Lp7/a;->Q()I

    .line 32
    .line 33
    .line 34
    move-result v12

    .line 35
    if-ne v12, v10, :cond_0

    .line 36
    .line 37
    iget-object v5, p0, Lm7/k;->n:Lm7/t;

    .line 38
    .line 39
    move v1, v6

    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :cond_0
    if-eq v12, v9, :cond_6

    .line 43
    .line 44
    if-ne v12, v8, :cond_2

    .line 45
    .line 46
    iget-object v3, p0, Lm7/k;->m:Lm7/v;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v4, Lm7/m;

    .line 52
    .line 53
    invoke-direct {v4}, Lm7/m;-><init>()V

    .line 54
    .line 55
    .line 56
    new-instance v5, Lm7/u;

    .line 57
    .line 58
    invoke-direct {v5, v4}, Lm7/u;-><init>(Lm7/m;)V

    .line 59
    .line 60
    .line 61
    iget-object v6, v5, Lm7/u;->s:Lm7/m;

    .line 62
    .line 63
    if-ne v6, v4, :cond_1

    .line 64
    .line 65
    iput-object v5, v4, Lm7/m;->q:Lm7/u;

    .line 66
    .line 67
    invoke-virtual {v3, v5}, Lo7/b;->M(Lk7/a;)Z

    .line 68
    .line 69
    .line 70
    iget-object v3, v3, Lm7/v;->n:Ld7/b;

    .line 71
    .line 72
    invoke-virtual {v3, v4}, Lo7/b;->M(Lk7/a;)Z

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v6}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto/16 :goto_2

    .line 79
    .line 80
    :cond_1
    const-string p1, "Invalid start namespace: "

    .line 81
    .line 82
    invoke-static {v5, p1}, Lg1/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    if-ne v12, v11, :cond_4

    .line 87
    .line 88
    invoke-virtual {v0}, Lz7/c;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-nez v3, :cond_3

    .line 93
    .line 94
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    sub-int/2addr v3, v6

    .line 99
    invoke-virtual {v0, v3}, Lz7/c;->remove(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    move-object v5, v3

    .line 104
    check-cast v5, Lm7/m;

    .line 105
    .line 106
    :cond_3
    if-nez v5, :cond_10

    .line 107
    .line 108
    new-instance v5, Ll7/j;

    .line 109
    .line 110
    const/4 v1, 0x1

    .line 111
    invoke-direct {v5, v1}, Ll7/j;-><init>(I)V

    .line 112
    .line 113
    .line 114
    move v1, v6

    .line 115
    move v2, v1

    .line 116
    goto/16 :goto_2

    .line 117
    .line 118
    :cond_4
    if-ne v12, v7, :cond_5

    .line 119
    .line 120
    invoke-virtual {p0, v4}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, Lm7/j;

    .line 125
    .line 126
    invoke-virtual {v3}, Lm7/i;->S()Lm7/i;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    new-instance v5, Lm7/x;

    .line 134
    .line 135
    new-instance v4, Lm7/w;

    .line 136
    .line 137
    invoke-direct {v4}, Lm7/w;-><init>()V

    .line 138
    .line 139
    .line 140
    const/4 v6, 0x0

    .line 141
    invoke-direct {v5, v4, v6}, Lm7/x;-><init>(Lk7/c;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3}, Lm7/i;->R()Ld7/b;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v3, v5}, Lo7/b;->M(Lk7/a;)Z

    .line 149
    .line 150
    .line 151
    goto/16 :goto_2

    .line 152
    .line 153
    :cond_5
    const-string p1, "Unexpected chunk: "

    .line 154
    .line 155
    invoke-static {v3, p1}, Lj8/o;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_6
    const-string p1, "END element detected before START: "

    .line 160
    .line 161
    invoke-static {v3, p1}, Lj8/o;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_7
    if-nez v2, :cond_f

    .line 166
    .line 167
    invoke-virtual {v3}, Lp7/a;->Q()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-ne v3, v9, :cond_8

    .line 172
    .line 173
    iget-object v5, p0, Lm7/k;->p:Lm7/l;

    .line 174
    .line 175
    move v2, v6

    .line 176
    goto/16 :goto_2

    .line 177
    .line 178
    :cond_8
    if-ne v3, v11, :cond_a

    .line 179
    .line 180
    invoke-virtual {v0}, Lz7/c;->isEmpty()Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-nez v3, :cond_9

    .line 185
    .line 186
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    sub-int/2addr v3, v6

    .line 191
    invoke-virtual {v0, v3}, Lz7/c;->remove(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    move-object v5, v3

    .line 196
    check-cast v5, Lm7/m;

    .line 197
    .line 198
    :cond_9
    if-nez v5, :cond_10

    .line 199
    .line 200
    new-instance v5, Ll7/j;

    .line 201
    .line 202
    const/4 v3, 0x1

    .line 203
    invoke-direct {v5, v3}, Ll7/j;-><init>(I)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_2

    .line 207
    .line 208
    :cond_a
    if-eq v3, v10, :cond_e

    .line 209
    .line 210
    if-ne v3, v8, :cond_b

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_b
    if-ne v3, v7, :cond_c

    .line 214
    .line 215
    invoke-virtual {p0, v4}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    check-cast v3, Lm7/j;

    .line 220
    .line 221
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    new-instance v5, Lm7/x;

    .line 225
    .line 226
    new-instance v4, Lm7/w;

    .line 227
    .line 228
    invoke-direct {v4}, Lm7/w;-><init>()V

    .line 229
    .line 230
    .line 231
    const/4 v6, 0x0

    .line 232
    invoke-direct {v5, v4, v6}, Lm7/x;-><init>(Lk7/c;I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3}, Lm7/j;->R()Ld7/b;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-virtual {v3, v5}, Lo7/b;->M(Lk7/a;)Z

    .line 240
    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_c
    const/4 v5, 0x4

    .line 244
    if-ne v3, v5, :cond_d

    .line 245
    .line 246
    invoke-virtual {p0, v4}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    check-cast v3, Lm7/j;

    .line 251
    .line 252
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    new-instance v5, Lm7/f;

    .line 256
    .line 257
    invoke-direct {v5}, Lm7/f;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3}, Lm7/j;->R()Ld7/b;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-virtual {v3, v5}, Lo7/b;->M(Lk7/a;)Z

    .line 265
    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_d
    invoke-virtual {p0, v4}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    check-cast v3, Lm7/j;

    .line 273
    .line 274
    invoke-virtual {v3, v6}, Lm7/i;->T(I)Lm7/x;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    goto :goto_2

    .line 279
    :cond_e
    :goto_1
    invoke-virtual {p0, v4}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    check-cast v3, Lm7/j;

    .line 284
    .line 285
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    new-instance v5, Lm7/j;

    .line 289
    .line 290
    new-instance v4, Lm7/k;

    .line 291
    .line 292
    invoke-direct {v4}, Lm7/k;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-direct {v5, v4}, Lm7/q;-><init>(Lk7/c;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3}, Lm7/j;->R()Ld7/b;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    invoke-virtual {v3, v5}, Lo7/b;->M(Lk7/a;)Z

    .line 303
    .line 304
    .line 305
    goto :goto_2

    .line 306
    :cond_f
    invoke-virtual {v0}, Lz7/c;->isEmpty()Z

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    if-nez v4, :cond_10

    .line 311
    .line 312
    invoke-virtual {v3}, Lp7/a;->Q()I

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    if-ne v3, v11, :cond_10

    .line 317
    .line 318
    invoke-virtual {v0}, Lz7/c;->isEmpty()Z

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    if-nez v3, :cond_10

    .line 323
    .line 324
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    sub-int/2addr v3, v6

    .line 329
    invoke-virtual {v0, v3}, Lz7/c;->remove(I)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    move-object v5, v3

    .line 334
    check-cast v5, Lm7/m;

    .line 335
    .line 336
    :cond_10
    :goto_2
    if-nez v5, :cond_11

    .line 337
    .line 338
    goto :goto_3

    .line 339
    :cond_11
    invoke-virtual {v5, p1}, Lk7/a;->G(Lq7/b;)V

    .line 340
    .line 341
    .line 342
    goto/16 :goto_0

    .line 343
    .line 344
    :cond_12
    :goto_3
    return-void
.end method
