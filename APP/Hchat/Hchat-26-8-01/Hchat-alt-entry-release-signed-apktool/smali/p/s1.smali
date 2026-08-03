.class public final Lp/s1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final v:Ljava/util/WeakHashMap;


# instance fields
.field public final a:Lp/b;

.field public final b:Lp/b;

.field public final c:Lp/b;

.field public final d:Lp/b;

.field public final e:Lp/b;

.field public final f:Lp/b;

.field public final g:Lp/b;

.field public final h:Lp/b;

.field public final i:Lp/b;

.field public final j:Lp/o1;

.field public final k:Li0/j1;

.field public final l:Lp/o1;

.field public final m:Lp/o1;

.field public final n:Lp/o1;

.field public final o:Lp/o1;

.field public final p:Lp/o1;

.field public final q:Lp/o1;

.field public final r:Lp/o1;

.field public final s:Z

.field public t:I

.field public final u:Lp/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp/s1;->v:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "captionBar"

    .line 7
    .line 8
    const/4 v2, 0x4

    .line 9
    invoke-static {v2, v1}, Lp/c;->c(ILjava/lang/String;)Lp/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, v0, Lp/s1;->a:Lp/b;

    .line 14
    .line 15
    const-string v3, "displayCutout"

    .line 16
    .line 17
    const/16 v4, 0x80

    .line 18
    .line 19
    invoke-static {v4, v3}, Lp/c;->c(ILjava/lang/String;)Lp/b;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iput-object v3, v0, Lp/s1;->b:Lp/b;

    .line 24
    .line 25
    const-string v5, "ime"

    .line 26
    .line 27
    const/16 v6, 0x8

    .line 28
    .line 29
    invoke-static {v6, v5}, Lp/c;->c(ILjava/lang/String;)Lp/b;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iput-object v5, v0, Lp/s1;->c:Lp/b;

    .line 34
    .line 35
    const-string v7, "mandatorySystemGestures"

    .line 36
    .line 37
    const/16 v8, 0x20

    .line 38
    .line 39
    invoke-static {v8, v7}, Lp/c;->c(ILjava/lang/String;)Lp/b;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    iput-object v7, v0, Lp/s1;->d:Lp/b;

    .line 44
    .line 45
    const-string v9, "navigationBars"

    .line 46
    .line 47
    const/4 v10, 0x2

    .line 48
    invoke-static {v10, v9}, Lp/c;->c(ILjava/lang/String;)Lp/b;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    iput-object v9, v0, Lp/s1;->e:Lp/b;

    .line 53
    .line 54
    const-string v11, "statusBars"

    .line 55
    .line 56
    const/4 v12, 0x1

    .line 57
    invoke-static {v12, v11}, Lp/c;->c(ILjava/lang/String;)Lp/b;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    iput-object v11, v0, Lp/s1;->f:Lp/b;

    .line 62
    .line 63
    const-string v13, "systemBars"

    .line 64
    .line 65
    const/16 v14, 0x207

    .line 66
    .line 67
    invoke-static {v14, v13}, Lp/c;->c(ILjava/lang/String;)Lp/b;

    .line 68
    .line 69
    .line 70
    move-result-object v13

    .line 71
    iput-object v13, v0, Lp/s1;->g:Lp/b;

    .line 72
    .line 73
    const-string v15, "systemGestures"

    .line 74
    .line 75
    const/16 v8, 0x10

    .line 76
    .line 77
    invoke-static {v8, v15}, Lp/c;->c(ILjava/lang/String;)Lp/b;

    .line 78
    .line 79
    .line 80
    move-result-object v15

    .line 81
    iput-object v15, v0, Lp/s1;->h:Lp/b;

    .line 82
    .line 83
    const-string v8, "tappableElement"

    .line 84
    .line 85
    const/16 v6, 0x40

    .line 86
    .line 87
    invoke-static {v6, v8}, Lp/c;->c(ILjava/lang/String;)Lp/b;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    iput-object v8, v0, Lp/s1;->i:Lp/b;

    .line 92
    .line 93
    new-instance v4, Lp/o1;

    .line 94
    .line 95
    new-instance v6, Lp/k0;

    .line 96
    .line 97
    const/4 v14, 0x0

    .line 98
    invoke-direct {v6, v14, v14, v14, v14}, Lp/k0;-><init>(IIII)V

    .line 99
    .line 100
    .line 101
    const-string v14, "waterfall"

    .line 102
    .line 103
    invoke-direct {v4, v6, v14}, Lp/o1;-><init>(Lp/k0;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iput-object v4, v0, Lp/s1;->j:Lp/o1;

    .line 107
    .line 108
    const/4 v6, 0x0

    .line 109
    invoke-static {v6}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 110
    .line 111
    .line 112
    move-result-object v14

    .line 113
    iput-object v14, v0, Lp/s1;->k:Li0/j1;

    .line 114
    .line 115
    new-instance v14, Lp/l1;

    .line 116
    .line 117
    invoke-direct {v14, v13, v5}, Lp/l1;-><init>(Lp/r1;Lp/r1;)V

    .line 118
    .line 119
    .line 120
    new-instance v6, Lp/l1;

    .line 121
    .line 122
    invoke-direct {v6, v14, v3}, Lp/l1;-><init>(Lp/r1;Lp/r1;)V

    .line 123
    .line 124
    .line 125
    new-instance v14, Lp/l1;

    .line 126
    .line 127
    invoke-direct {v14, v8, v7}, Lp/l1;-><init>(Lp/r1;Lp/r1;)V

    .line 128
    .line 129
    .line 130
    new-instance v12, Lp/l1;

    .line 131
    .line 132
    invoke-direct {v12, v14, v15}, Lp/l1;-><init>(Lp/r1;Lp/r1;)V

    .line 133
    .line 134
    .line 135
    new-instance v14, Lp/l1;

    .line 136
    .line 137
    invoke-direct {v14, v12, v4}, Lp/l1;-><init>(Lp/r1;Lp/r1;)V

    .line 138
    .line 139
    .line 140
    new-instance v4, Lp/l1;

    .line 141
    .line 142
    invoke-direct {v4, v6, v14}, Lp/l1;-><init>(Lp/r1;Lp/r1;)V

    .line 143
    .line 144
    .line 145
    const-string v4, "captionBarIgnoringVisibility"

    .line 146
    .line 147
    invoke-static {v2, v4}, Lp/c;->d(ILjava/lang/String;)Lp/o1;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    iput-object v4, v0, Lp/s1;->l:Lp/o1;

    .line 152
    .line 153
    const-string v4, "navigationBarsIgnoringVisibility"

    .line 154
    .line 155
    invoke-static {v10, v4}, Lp/c;->d(ILjava/lang/String;)Lp/o1;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    iput-object v4, v0, Lp/s1;->m:Lp/o1;

    .line 160
    .line 161
    const-string v4, "statusBarsIgnoringVisibility"

    .line 162
    .line 163
    const/4 v6, 0x1

    .line 164
    invoke-static {v6, v4}, Lp/c;->d(ILjava/lang/String;)Lp/o1;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    iput-object v4, v0, Lp/s1;->n:Lp/o1;

    .line 169
    .line 170
    const-string v4, "systemBarsIgnoringVisibility"

    .line 171
    .line 172
    const/16 v6, 0x207

    .line 173
    .line 174
    invoke-static {v6, v4}, Lp/c;->d(ILjava/lang/String;)Lp/o1;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    iput-object v4, v0, Lp/s1;->o:Lp/o1;

    .line 179
    .line 180
    const-string v4, "tappableElementIgnoringVisibility"

    .line 181
    .line 182
    const/16 v6, 0x40

    .line 183
    .line 184
    invoke-static {v6, v4}, Lp/c;->d(ILjava/lang/String;)Lp/o1;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    iput-object v4, v0, Lp/s1;->p:Lp/o1;

    .line 189
    .line 190
    new-instance v4, Lp/o1;

    .line 191
    .line 192
    new-instance v6, Lp/k0;

    .line 193
    .line 194
    const/4 v12, 0x0

    .line 195
    invoke-direct {v6, v12, v12, v12, v12}, Lp/k0;-><init>(IIII)V

    .line 196
    .line 197
    .line 198
    const-string v14, "imeAnimationTarget"

    .line 199
    .line 200
    invoke-direct {v4, v6, v14}, Lp/o1;-><init>(Lp/k0;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    iput-object v4, v0, Lp/s1;->q:Lp/o1;

    .line 204
    .line 205
    new-instance v4, Lp/o1;

    .line 206
    .line 207
    new-instance v6, Lp/k0;

    .line 208
    .line 209
    invoke-direct {v6, v12, v12, v12, v12}, Lp/k0;-><init>(IIII)V

    .line 210
    .line 211
    .line 212
    const-string v14, "imeAnimationSource"

    .line 213
    .line 214
    invoke-direct {v4, v6, v14}, Lp/o1;-><init>(Lp/k0;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    iput-object v4, v0, Lp/s1;->r:Lp/o1;

    .line 218
    .line 219
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    instance-of v6, v4, Landroid/view/View;

    .line 224
    .line 225
    if-eqz v6, :cond_0

    .line 226
    .line 227
    check-cast v4, Landroid/view/View;

    .line 228
    .line 229
    goto :goto_0

    .line 230
    :cond_0
    const/4 v4, 0x0

    .line 231
    :goto_0
    if-eqz v4, :cond_1

    .line 232
    .line 233
    const v6, 0x7f060034

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    goto :goto_1

    .line 241
    :cond_1
    const/4 v4, 0x0

    .line 242
    :goto_1
    instance-of v6, v4, Ljava/lang/Boolean;

    .line 243
    .line 244
    if-eqz v6, :cond_2

    .line 245
    .line 246
    move-object v6, v4

    .line 247
    check-cast v6, Ljava/lang/Boolean;

    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_2
    const/4 v6, 0x0

    .line 251
    :goto_2
    if-eqz v6, :cond_3

    .line 252
    .line 253
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 254
    .line 255
    .line 256
    move-result v14

    .line 257
    goto :goto_3

    .line 258
    :cond_3
    move v14, v12

    .line 259
    :goto_3
    iput-boolean v14, v0, Lp/s1;->s:Z

    .line 260
    .line 261
    new-instance v4, Lp/f0;

    .line 262
    .line 263
    invoke-direct {v4, v0}, Lp/f0;-><init>(Lp/s1;)V

    .line 264
    .line 265
    .line 266
    iput-object v4, v0, Lp/s1;->u:Lp/f0;

    .line 267
    .line 268
    sget v4, Lg3/q;->a:I

    .line 269
    .line 270
    invoke-static/range {p1 .. p1}, Lg3/n;->a(Landroid/view/View;)Lg3/r0;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    if-eqz v4, :cond_4

    .line 275
    .line 276
    iget-object v4, v4, Lg3/r0;->a:Lg3/n0;

    .line 277
    .line 278
    invoke-virtual {v4, v2}, Lg3/n0;->q(I)Z

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    invoke-virtual {v1, v2}, Lp/b;->f(Z)V

    .line 283
    .line 284
    .line 285
    const/16 v1, 0x80

    .line 286
    .line 287
    invoke-virtual {v4, v1}, Lg3/n0;->q(I)Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    invoke-virtual {v3, v1}, Lp/b;->f(Z)V

    .line 292
    .line 293
    .line 294
    const/16 v1, 0x8

    .line 295
    .line 296
    invoke-virtual {v4, v1}, Lg3/n0;->q(I)Z

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    invoke-virtual {v5, v1}, Lp/b;->f(Z)V

    .line 301
    .line 302
    .line 303
    const/16 v1, 0x20

    .line 304
    .line 305
    invoke-virtual {v4, v1}, Lg3/n0;->q(I)Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    invoke-virtual {v7, v1}, Lp/b;->f(Z)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4, v10}, Lg3/n0;->q(I)Z

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    invoke-virtual {v9, v1}, Lp/b;->f(Z)V

    .line 317
    .line 318
    .line 319
    const/4 v6, 0x1

    .line 320
    invoke-virtual {v4, v6}, Lg3/n0;->q(I)Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    invoke-virtual {v11, v1}, Lp/b;->f(Z)V

    .line 325
    .line 326
    .line 327
    const/16 v6, 0x207

    .line 328
    .line 329
    invoke-virtual {v4, v6}, Lg3/n0;->q(I)Z

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    invoke-virtual {v13, v1}, Lp/b;->f(Z)V

    .line 334
    .line 335
    .line 336
    const/16 v1, 0x10

    .line 337
    .line 338
    invoke-virtual {v4, v1}, Lg3/n0;->q(I)Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    invoke-virtual {v15, v1}, Lp/b;->f(Z)V

    .line 343
    .line 344
    .line 345
    const/16 v6, 0x40

    .line 346
    .line 347
    invoke-virtual {v4, v6}, Lg3/n0;->q(I)Z

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    invoke-virtual {v8, v1}, Lp/b;->f(Z)V

    .line 352
    .line 353
    .line 354
    :cond_4
    return-void
.end method

.method public static b(Lp/s1;Lg3/r0;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lp/s1;->a:Lp/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Lp/b;->g(Lg3/r0;I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lp/s1;->c:Lp/b;

    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, Lp/b;->g(Lg3/r0;I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lp/s1;->b:Lp/b;

    .line 13
    .line 14
    invoke-virtual {v0, p1, v1}, Lp/b;->g(Lg3/r0;I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lp/s1;->e:Lp/b;

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1}, Lp/b;->g(Lg3/r0;I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lp/s1;->f:Lp/b;

    .line 23
    .line 24
    invoke-virtual {v0, p1, v1}, Lp/b;->g(Lg3/r0;I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lp/s1;->g:Lp/b;

    .line 28
    .line 29
    invoke-virtual {v0, p1, v1}, Lp/b;->g(Lg3/r0;I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lp/s1;->h:Lp/b;

    .line 33
    .line 34
    invoke-virtual {v0, p1, v1}, Lp/b;->g(Lg3/r0;I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lp/s1;->i:Lp/b;

    .line 38
    .line 39
    invoke-virtual {v0, p1, v1}, Lp/b;->g(Lg3/r0;I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lp/s1;->d:Lp/b;

    .line 43
    .line 44
    invoke-virtual {v0, p1, v1}, Lp/b;->g(Lg3/r0;I)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lp/s1;->l:Lp/o1;

    .line 48
    .line 49
    const/4 v2, 0x4

    .line 50
    iget-object v3, p1, Lg3/r0;->a:Lg3/n0;

    .line 51
    .line 52
    invoke-virtual {v3, v2}, Lg3/n0;->h(I)Lb3/a;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v2}, Lp/d;->q(Lb3/a;)Lp/k0;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v2}, Lp/o1;->f(Lp/k0;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lp/s1;->m:Lp/o1;

    .line 64
    .line 65
    iget-object v2, p1, Lg3/r0;->a:Lg3/n0;

    .line 66
    .line 67
    const/4 v3, 0x2

    .line 68
    invoke-virtual {v2, v3}, Lg3/n0;->h(I)Lb3/a;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v2}, Lp/d;->q(Lb3/a;)Lp/k0;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v0, v2}, Lp/o1;->f(Lp/k0;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lp/s1;->n:Lp/o1;

    .line 80
    .line 81
    iget-object v2, p1, Lg3/r0;->a:Lg3/n0;

    .line 82
    .line 83
    const/4 v3, 0x1

    .line 84
    invoke-virtual {v2, v3}, Lg3/n0;->h(I)Lb3/a;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v2}, Lp/d;->q(Lb3/a;)Lp/k0;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v0, v2}, Lp/o1;->f(Lp/k0;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lp/s1;->o:Lp/o1;

    .line 96
    .line 97
    const/16 v2, 0x207

    .line 98
    .line 99
    iget-object v4, p1, Lg3/r0;->a:Lg3/n0;

    .line 100
    .line 101
    invoke-virtual {v4, v2}, Lg3/n0;->h(I)Lb3/a;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-static {v2}, Lp/d;->q(Lb3/a;)Lp/k0;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v0, v2}, Lp/o1;->f(Lp/k0;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lp/s1;->p:Lp/o1;

    .line 113
    .line 114
    const/16 v2, 0x40

    .line 115
    .line 116
    iget-object v4, p1, Lg3/r0;->a:Lg3/n0;

    .line 117
    .line 118
    invoke-virtual {v4, v2}, Lg3/n0;->h(I)Lb3/a;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-static {v2}, Lp/d;->q(Lb3/a;)Lp/k0;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v0, v2}, Lp/o1;->f(Lp/k0;)V

    .line 127
    .line 128
    .line 129
    iget-object p1, p1, Lg3/r0;->a:Lg3/n0;

    .line 130
    .line 131
    invoke-virtual {p1}, Lg3/n0;->f()Lg3/d;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iget-object v0, p0, Lp/s1;->j:Lp/o1;

    .line 136
    .line 137
    if-eqz p1, :cond_0

    .line 138
    .line 139
    invoke-virtual {p1}, Lg3/d;->a()Lb3/a;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    goto :goto_0

    .line 144
    :cond_0
    sget-object v2, Lb3/a;->e:Lb3/a;

    .line 145
    .line 146
    :goto_0
    invoke-static {v2}, Lp/d;->q(Lb3/a;)Lp/k0;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v0, v2}, Lp/o1;->f(Lp/k0;)V

    .line 151
    .line 152
    .line 153
    const/4 v0, 0x0

    .line 154
    if-eqz p1, :cond_2

    .line 155
    .line 156
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 157
    .line 158
    const/16 v4, 0x1f

    .line 159
    .line 160
    if-lt v2, v4, :cond_1

    .line 161
    .line 162
    iget-object p1, p1, Lg3/d;->a:Landroid/view/DisplayCutout;

    .line 163
    .line 164
    invoke-static {p1}, Lg3/c;->a(Landroid/view/DisplayCutout;)Landroid/graphics/Path;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    goto :goto_1

    .line 169
    :cond_1
    move-object p1, v0

    .line 170
    :goto_1
    if-eqz p1, :cond_2

    .line 171
    .line 172
    new-instance v0, Lf1/j;

    .line 173
    .line 174
    invoke-direct {v0, p1}, Lf1/j;-><init>(Landroid/graphics/Path;)V

    .line 175
    .line 176
    .line 177
    :cond_2
    iget-object p0, p0, Lp/s1;->k:Li0/j1;

    .line 178
    .line 179
    invoke-virtual {p0, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    sget-object p0, Lw0/m;->c:Ljava/lang/Object;

    .line 183
    .line 184
    monitor-enter p0

    .line 185
    :try_start_0
    sget-object p1, Lw0/m;->j:Lw0/a;

    .line 186
    .line 187
    iget-object p1, p1, Lw0/b;->h:Lf/l0;

    .line 188
    .line 189
    if-eqz p1, :cond_3

    .line 190
    .line 191
    invoke-virtual {p1}, Lf/l0;->h()Z

    .line 192
    .line 193
    .line 194
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    if-ne p1, v3, :cond_3

    .line 196
    .line 197
    move v1, v3

    .line 198
    :cond_3
    monitor-exit p0

    .line 199
    if-eqz v1, :cond_4

    .line 200
    .line 201
    invoke-static {}, Lw0/m;->a()V

    .line 202
    .line 203
    .line 204
    :cond_4
    return-void

    .line 205
    :catchall_0
    move-exception p1

    .line 206
    monitor-exit p0

    .line 207
    throw p1
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 2

    .line 1
    iget v0, p0, Lp/s1;->t:I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget v0, Lg3/q;->a:I

    .line 6
    .line 7
    iget-object v0, p0, Lp/s1;->u:Lp/f0;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lg3/m;->b(Landroid/view/View;Lg3/e;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0}, Lg3/q;->b(Landroid/view/View;Lg3/s;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget p1, p0, Lp/s1;->t:I

    .line 28
    .line 29
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    iput p1, p0, Lp/s1;->t:I

    .line 32
    .line 33
    return-void
.end method
