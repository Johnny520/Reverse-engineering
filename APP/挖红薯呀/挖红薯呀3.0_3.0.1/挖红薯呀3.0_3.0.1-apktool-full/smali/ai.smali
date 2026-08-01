.class public final Lai;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/ScrollCaptureCallback;


# instance fields
.field public final a:Lxz0;

.field public final b:La30;

.field public final c:Li90;

.field public final d:Lw3;

.field public final e:Lhk;

.field public final f:Lhu0;


# direct methods
.method public constructor <init>(Lxz0;La30;Lhk;Li90;Lw3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lai;->a:Lxz0;

    .line 5
    .line 6
    iput-object p2, p0, Lai;->b:La30;

    .line 7
    .line 8
    iput-object p4, p0, Lai;->c:Li90;

    .line 9
    .line 10
    iput-object p5, p0, Lai;->d:Lw3;

    .line 11
    .line 12
    new-instance p1, Lhk;

    .line 13
    .line 14
    iget-object p3, p3, Lhk;->d:Lpk;

    .line 15
    .line 16
    sget-object p4, Lco;->e:Lco;

    .line 17
    .line 18
    invoke-interface {p3, p4}, Lpk;->h(Lpk;)Lpk;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-direct {p1, p3}, Lhk;-><init>(Lpk;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lai;->e:Lhk;

    .line 26
    .line 27
    new-instance p1, Lhu0;

    .line 28
    .line 29
    iget p3, p2, La30;->d:I

    .line 30
    .line 31
    iget p2, p2, La30;->b:I

    .line 32
    .line 33
    sub-int/2addr p3, p2

    .line 34
    new-instance p2, Lh81;

    .line 35
    .line 36
    const/4 p4, 0x0

    .line 37
    invoke-direct {p2, p0, p4}, Lh81;-><init>(Lai;Lik;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p1, p3, p2}, Lhu0;-><init>(ILh81;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lai;->f:Lhu0;

    .line 44
    .line 45
    return-void
.end method

.method public static final a(Lai;Landroid/view/ScrollCaptureSession;La30;Ljk;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, Lzh;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lzh;

    .line 7
    .line 8
    iget v1, v0, Lzh;->m:I

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
    iput v1, v0, Lzh;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lzh;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lzh;-><init>(Lai;Ljk;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lzh;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lzh;->m:I

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Lzk;->d:Lzk;

    .line 33
    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    if-eq v1, v4, :cond_3

    .line 37
    .line 38
    if-eq v1, v3, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    iget p1, v0, Lzh;->j:I

    .line 43
    .line 44
    iget p2, v0, Lzh;->i:I

    .line 45
    .line 46
    iget-object v1, v0, Lzh;->h:La30;

    .line 47
    .line 48
    iget-object v0, v0, Lzh;->g:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {v0}, Lf3;->j(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return-object p0

    .line 66
    :cond_2
    iget p1, v0, Lzh;->j:I

    .line 67
    .line 68
    iget p2, v0, Lzh;->i:I

    .line 69
    .line 70
    iget-object v1, v0, Lzh;->h:La30;

    .line 71
    .line 72
    iget-object v3, v0, Lzh;->g:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-static {v3}, Lf3;->j(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_3
    iget p1, v0, Lzh;->j:I

    .line 83
    .line 84
    iget p2, v0, Lzh;->i:I

    .line 85
    .line 86
    iget-object v1, v0, Lzh;->h:La30;

    .line 87
    .line 88
    iget-object v3, v0, Lzh;->g:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-static {v3}, Lf3;->j(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    move p3, p2

    .line 98
    move-object p2, v1

    .line 99
    move v1, p1

    .line 100
    move-object p1, v3

    .line 101
    goto :goto_3

    .line 102
    :cond_4
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget p3, p2, La30;->b:I

    .line 106
    .line 107
    iget v1, p2, La30;->d:I

    .line 108
    .line 109
    iget-object v6, p0, Lai;->f:Lhu0;

    .line 110
    .line 111
    iput-object p1, v0, Lzh;->g:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object p2, v0, Lzh;->h:La30;

    .line 114
    .line 115
    iput p3, v0, Lzh;->i:I

    .line 116
    .line 117
    iput v1, v0, Lzh;->j:I

    .line 118
    .line 119
    iput v4, v0, Lzh;->m:I

    .line 120
    .line 121
    iget v4, v6, Lhu0;->a:I

    .line 122
    .line 123
    if-gt p3, v1, :cond_c

    .line 124
    .line 125
    sub-int v7, v1, p3

    .line 126
    .line 127
    if-gt v7, v4, :cond_b

    .line 128
    .line 129
    int-to-float v8, p3

    .line 130
    iget v9, v6, Lhu0;->c:F

    .line 131
    .line 132
    cmpl-float v8, v8, v9

    .line 133
    .line 134
    sget-object v10, Lna1;->a:Lna1;

    .line 135
    .line 136
    if-ltz v8, :cond_5

    .line 137
    .line 138
    int-to-float v8, v1

    .line 139
    int-to-float v11, v4

    .line 140
    add-float/2addr v11, v9

    .line 141
    cmpg-float v8, v8, v11

    .line 142
    .line 143
    if-gtz v8, :cond_5

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    div-int/2addr v7, v3

    .line 147
    add-int/2addr v7, p3

    .line 148
    div-int/2addr v4, v3

    .line 149
    sub-int/2addr v7, v4

    .line 150
    int-to-float v3, v7

    .line 151
    sub-float/2addr v3, v9

    .line 152
    invoke-virtual {v6, v3, v0}, Lhu0;->a(FLjk;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    if-ne v3, v5, :cond_6

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_6
    move-object v3, v10

    .line 160
    :goto_1
    if-ne v3, v5, :cond_7

    .line 161
    .line 162
    move-object v10, v3

    .line 163
    :cond_7
    :goto_2
    if-ne v10, v5, :cond_8

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_8
    :goto_3
    move-object v3, p1

    .line 167
    move p1, v1

    .line 168
    move-object v1, p2

    .line 169
    move p2, p3

    .line 170
    :goto_4
    sget-object p3, Lp3;->k:Lp3;

    .line 171
    .line 172
    iput-object v3, v0, Lzh;->g:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v1, v0, Lzh;->h:La30;

    .line 175
    .line 176
    iput p2, v0, Lzh;->i:I

    .line 177
    .line 178
    iput p1, v0, Lzh;->j:I

    .line 179
    .line 180
    iput v2, v0, Lzh;->m:I

    .line 181
    .line 182
    invoke-interface {v0}, Lik;->e()Lpk;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-static {v2}, Lv50;->l(Lpk;)Ls6;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-virtual {v2, p3, v0}, Ls6;->c(Lsw;Ljk;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p3

    .line 194
    if-ne p3, v5, :cond_9

    .line 195
    .line 196
    :goto_5
    return-object v5

    .line 197
    :cond_9
    move-object v0, v3

    .line 198
    :goto_6
    iget-object p3, p0, Lai;->f:Lhu0;

    .line 199
    .line 200
    iget v2, p3, Lhu0;->c:F

    .line 201
    .line 202
    invoke-static {v2}, Lrd0;->Q(F)I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    sub-int/2addr p2, v2

    .line 207
    iget p3, p3, Lhu0;->a:I

    .line 208
    .line 209
    const/4 v2, 0x0

    .line 210
    invoke-static {p2, v2, p3}, Lw60;->n(III)I

    .line 211
    .line 212
    .line 213
    move-result p2

    .line 214
    iget-object p3, p0, Lai;->f:Lhu0;

    .line 215
    .line 216
    iget v3, p3, Lhu0;->c:F

    .line 217
    .line 218
    invoke-static {v3}, Lrd0;->Q(F)I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    sub-int/2addr p1, v3

    .line 223
    iget p3, p3, Lhu0;->a:I

    .line 224
    .line 225
    invoke-static {p1, v2, p3}, Lw60;->n(III)I

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    iget p3, v1, La30;->a:I

    .line 230
    .line 231
    iget v1, v1, La30;->c:I

    .line 232
    .line 233
    if-ne p2, p1, :cond_a

    .line 234
    .line 235
    sget-object p0, La30;->e:La30;

    .line 236
    .line 237
    return-object p0

    .line 238
    :cond_a
    invoke-static {v0}, Lf3;->l(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-virtual {v2}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    :try_start_0
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 247
    .line 248
    .line 249
    int-to-float v3, p3

    .line 250
    neg-float v3, v3

    .line 251
    int-to-float v4, p2

    .line 252
    neg-float v4, v4

    .line 253
    invoke-virtual {v2, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 254
    .line 255
    .line 256
    iget-object v3, p0, Lai;->b:La30;

    .line 257
    .line 258
    iget v4, v3, La30;->a:I

    .line 259
    .line 260
    int-to-float v4, v4

    .line 261
    neg-float v4, v4

    .line 262
    iget v3, v3, La30;->b:I

    .line 263
    .line 264
    int-to-float v3, v3

    .line 265
    neg-float v3, v3

    .line 266
    invoke-virtual {v2, v4, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 267
    .line 268
    .line 269
    iget-object v3, p0, Lai;->d:Lw3;

    .line 270
    .line 271
    invoke-virtual {v3}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-virtual {v3, v2}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 276
    .line 277
    .line 278
    invoke-static {v0}, Lf3;->B(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-virtual {v0, v2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 283
    .line 284
    .line 285
    iget-object p0, p0, Lai;->f:Lhu0;

    .line 286
    .line 287
    iget p0, p0, Lhu0;->c:F

    .line 288
    .line 289
    invoke-static {p0}, Lrd0;->Q(F)I

    .line 290
    .line 291
    .line 292
    move-result p0

    .line 293
    new-instance v0, La30;

    .line 294
    .line 295
    add-int/2addr p2, p0

    .line 296
    add-int/2addr p1, p0

    .line 297
    invoke-direct {v0, p3, p2, v1, p1}, La30;-><init>(IIII)V

    .line 298
    .line 299
    .line 300
    return-object v0

    .line 301
    :catchall_0
    move-exception p0

    .line 302
    invoke-static {v0}, Lf3;->B(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-virtual {p1, v2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 307
    .line 308
    .line 309
    throw p0

    .line 310
    :cond_b
    const-string p0, "Expected range ("

    .line 311
    .line 312
    const-string p1, ") to be \u2264 viewportSize="

    .line 313
    .line 314
    invoke-static {v7, v4, p0, p1}, Lt1;->k(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 319
    .line 320
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    throw p1

    .line 328
    :cond_c
    const-string p0, "Expected min="

    .line 329
    .line 330
    const-string p1, " \u2264 max="

    .line 331
    .line 332
    invoke-static {p3, v1, p0, p1}, Lt1;->k(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 337
    .line 338
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    throw p1
.end method


# virtual methods
.method public final onScrollCaptureEnd(Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    sget-object v0, Lwj0;->e:Lwj0;

    .line 2
    .line 3
    new-instance v1, Le;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x4

    .line 7
    invoke-direct {v1, p0, p1, v2, v3}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    iget-object p0, p0, Lai;->e:Lhk;

    .line 12
    .line 13
    invoke-static {p0, v0, v1, p1}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onScrollCaptureImageRequest(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V
    .locals 7

    .line 1
    new-instance v0, Ld7;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v6, 0x1

    .line 5
    move-object v1, p0

    .line 6
    move-object v2, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    invoke-direct/range {v0 .. v6}, Ld7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    const/4 p1, 0x3

    .line 14
    iget-object p3, v1, Lai;->e:Lhk;

    .line 15
    .line 16
    invoke-static {p3, p0, v0, p1}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, Ls2;

    .line 21
    .line 22
    const/4 p3, 0x7

    .line 23
    invoke-direct {p1, p3, p2}, Ls2;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lj40;->r(Lsw;)Lpo;

    .line 27
    .line 28
    .line 29
    new-instance p1, Lbi;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Lbi;-><init>(Lr31;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, p1}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final onScrollCaptureSearch(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lai;->b:La30;

    .line 2
    .line 3
    invoke-static {p0}, Lu50;->B(La30;)Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p2, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onScrollCaptureStart(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lai;->f:Lhu0;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    iput p2, p1, Lhu0;->c:F

    .line 5
    .line 6
    iget-object p0, p0, Lai;->c:Li90;

    .line 7
    .line 8
    iget-object p0, p0, Li90;->a:Lgp0;

    .line 9
    .line 10
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    .line 16
    .line 17
    .line 18
    return-void
.end method
