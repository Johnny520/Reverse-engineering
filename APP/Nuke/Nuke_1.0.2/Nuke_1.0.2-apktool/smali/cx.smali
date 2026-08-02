.class public final Lcx;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroid/view/ScrollCaptureCallback;


# instance fields
.field public final a:Lqn2;

.field public final b:Ld11;

.field public final c:Lhh1;

.field public final d:Lb7;

.field public final e:Ls00;

.field public final f:Leu0;


# direct methods
.method public constructor <init>(Lqn2;Ld11;Ls00;Lhh1;Lb7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcx;->a:Lqn2;

    .line 5
    .line 6
    iput-object p2, p0, Lcx;->b:Ld11;

    .line 7
    .line 8
    iput-object p4, p0, Lcx;->c:Lhh1;

    .line 9
    .line 10
    iput-object p5, p0, Lcx;->d:Lb7;

    .line 11
    .line 12
    new-instance p1, Ls00;

    .line 13
    .line 14
    iget-object p3, p3, Ls00;->h:La20;

    .line 15
    .line 16
    sget-object p4, Lx80;->i:Lx80;

    .line 17
    .line 18
    invoke-interface {p3, p4}, La20;->k(La20;)La20;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-direct {p1, p3}, Ls00;-><init>(La20;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcx;->e:Ls00;

    .line 26
    .line 27
    new-instance p1, Leu0;

    .line 28
    .line 29
    iget p3, p2, Ld11;->d:I

    .line 30
    .line 31
    iget p2, p2, Ld11;->b:I

    .line 32
    .line 33
    sub-int/2addr p3, p2

    .line 34
    new-instance p2, Lbx;

    .line 35
    .line 36
    const/4 p4, 0x0

    .line 37
    invoke-direct {p2, p0, p4}, Lbx;-><init>(Lcx;Lt00;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p1, p3, p2}, Leu0;-><init>(ILbx;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lcx;->f:Leu0;

    .line 44
    .line 45
    return-void
.end method

.method public static final a(Lcx;Landroid/view/ScrollCaptureSession;Ld11;Lu00;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, Lax;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lax;

    .line 7
    .line 8
    iget v1, v0, Lax;->q:I

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
    iput v1, v0, Lax;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lax;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lax;-><init>(Lcx;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lax;->o:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lax;->q:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x2

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
    if-ne v1, v4, :cond_1

    .line 39
    .line 40
    iget p1, v0, Lax;->n:I

    .line 41
    .line 42
    iget p2, v0, Lax;->m:I

    .line 43
    .line 44
    iget-object v1, v0, Lax;->l:Ld11;

    .line 45
    .line 46
    iget-object v0, v0, Lax;->k:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-static {v0}, Ll7;->e(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v2

    .line 63
    :cond_2
    iget p1, v0, Lax;->n:I

    .line 64
    .line 65
    iget p2, v0, Lax;->m:I

    .line 66
    .line 67
    iget-object v1, v0, Lax;->l:Ld11;

    .line 68
    .line 69
    iget-object v2, v0, Lax;->k:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-static {v2}, Ll7;->e(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move p3, p2

    .line 79
    move-object p2, v1

    .line 80
    move v1, p1

    .line 81
    move-object p1, v2

    .line 82
    goto :goto_3

    .line 83
    :cond_3
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget p3, p2, Ld11;->b:I

    .line 87
    .line 88
    iget v1, p2, Ld11;->d:I

    .line 89
    .line 90
    iget-object v6, p0, Lcx;->f:Leu0;

    .line 91
    .line 92
    iput-object p1, v0, Lax;->k:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p2, v0, Lax;->l:Ld11;

    .line 95
    .line 96
    iput p3, v0, Lax;->m:I

    .line 97
    .line 98
    iput v1, v0, Lax;->n:I

    .line 99
    .line 100
    iput v3, v0, Lax;->q:I

    .line 101
    .line 102
    iget v3, v6, Leu0;->a:I

    .line 103
    .line 104
    if-gt p3, v1, :cond_b

    .line 105
    .line 106
    sub-int v7, v1, p3

    .line 107
    .line 108
    if-gt v7, v3, :cond_a

    .line 109
    .line 110
    int-to-float v2, p3

    .line 111
    iget v8, v6, Leu0;->b:F

    .line 112
    .line 113
    cmpl-float v2, v2, v8

    .line 114
    .line 115
    sget-object v9, La83;->a:La83;

    .line 116
    .line 117
    if-ltz v2, :cond_4

    .line 118
    .line 119
    int-to-float v2, v1

    .line 120
    int-to-float v10, v3

    .line 121
    add-float/2addr v10, v8

    .line 122
    cmpg-float v2, v2, v10

    .line 123
    .line 124
    if-gtz v2, :cond_4

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    div-int/2addr v7, v4

    .line 128
    add-int/2addr v7, p3

    .line 129
    div-int/2addr v3, v4

    .line 130
    sub-int/2addr v7, v3

    .line 131
    int-to-float v2, v7

    .line 132
    sub-float/2addr v2, v8

    .line 133
    invoke-virtual {v6, v2, v0}, Leu0;->b(FLu00;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    if-ne v2, v5, :cond_5

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_5
    move-object v2, v9

    .line 141
    :goto_1
    if-ne v2, v5, :cond_6

    .line 142
    .line 143
    move-object v9, v2

    .line 144
    :cond_6
    :goto_2
    if-ne v9, v5, :cond_7

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_7
    :goto_3
    sget-object v2, Lv6;->z:Lv6;

    .line 148
    .line 149
    iput-object p1, v0, Lax;->k:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object p2, v0, Lax;->l:Ld11;

    .line 152
    .line 153
    iput p3, v0, Lax;->m:I

    .line 154
    .line 155
    iput v1, v0, Lax;->n:I

    .line 156
    .line 157
    iput v4, v0, Lax;->q:I

    .line 158
    .line 159
    iget-object v3, v0, Lu00;->i:La20;

    .line 160
    .line 161
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-static {v3}, Lqp0;->A(La20;)Lxb;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-virtual {v3, v2, v0}, Lxb;->a(Lin0;Lt00;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    if-ne v0, v5, :cond_8

    .line 173
    .line 174
    :goto_4
    return-object v5

    .line 175
    :cond_8
    move-object v0, p1

    .line 176
    move p1, v1

    .line 177
    move-object v1, p2

    .line 178
    move p2, p3

    .line 179
    :goto_5
    iget-object p3, p0, Lcx;->f:Leu0;

    .line 180
    .line 181
    iget v2, p3, Leu0;->b:F

    .line 182
    .line 183
    invoke-static {v2}, Lgf1;->Q(F)I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    sub-int/2addr p2, v2

    .line 188
    iget p3, p3, Leu0;->a:I

    .line 189
    .line 190
    const/4 v2, 0x0

    .line 191
    invoke-static {p2, v2, p3}, Lci0;->D(III)I

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    iget-object p3, p0, Lcx;->f:Leu0;

    .line 196
    .line 197
    iget v3, p3, Leu0;->b:F

    .line 198
    .line 199
    invoke-static {v3}, Lgf1;->Q(F)I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    sub-int/2addr p1, v3

    .line 204
    iget p3, p3, Leu0;->a:I

    .line 205
    .line 206
    invoke-static {p1, v2, p3}, Lci0;->D(III)I

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    iget p3, v1, Ld11;->a:I

    .line 211
    .line 212
    iget v1, v1, Ld11;->c:I

    .line 213
    .line 214
    if-ne p2, p1, :cond_9

    .line 215
    .line 216
    sget-object p0, Ld11;->e:Ld11;

    .line 217
    .line 218
    return-object p0

    .line 219
    :cond_9
    invoke-static {v0}, Ll7;->g(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v2}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    :try_start_0
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 228
    .line 229
    .line 230
    int-to-float v3, p3

    .line 231
    neg-float v3, v3

    .line 232
    int-to-float v4, p2

    .line 233
    neg-float v4, v4

    .line 234
    invoke-virtual {v2, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 235
    .line 236
    .line 237
    iget-object v3, p0, Lcx;->b:Ld11;

    .line 238
    .line 239
    iget v4, v3, Ld11;->a:I

    .line 240
    .line 241
    int-to-float v4, v4

    .line 242
    neg-float v4, v4

    .line 243
    iget v3, v3, Ld11;->b:I

    .line 244
    .line 245
    int-to-float v3, v3

    .line 246
    neg-float v3, v3

    .line 247
    invoke-virtual {v2, v4, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 248
    .line 249
    .line 250
    iget-object v3, p0, Lcx;->d:Lb7;

    .line 251
    .line 252
    invoke-virtual {v3}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-virtual {v3, v2}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 257
    .line 258
    .line 259
    invoke-static {v0}, Ll7;->y(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0, v2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 264
    .line 265
    .line 266
    iget-object p0, p0, Lcx;->f:Leu0;

    .line 267
    .line 268
    iget p0, p0, Leu0;->b:F

    .line 269
    .line 270
    invoke-static {p0}, Lgf1;->Q(F)I

    .line 271
    .line 272
    .line 273
    move-result p0

    .line 274
    new-instance v0, Ld11;

    .line 275
    .line 276
    add-int/2addr p2, p0

    .line 277
    add-int/2addr p1, p0

    .line 278
    invoke-direct {v0, p3, p2, v1, p1}, Ld11;-><init>(IIII)V

    .line 279
    .line 280
    .line 281
    return-object v0

    .line 282
    :catchall_0
    move-exception p0

    .line 283
    invoke-static {v0}, Ll7;->y(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    invoke-virtual {p1, v2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 288
    .line 289
    .line 290
    throw p0

    .line 291
    :cond_a
    const-string p0, "Expected range ("

    .line 292
    .line 293
    const-string p1, ") to be \u2264 viewportSize="

    .line 294
    .line 295
    invoke-static {p0, v7, p1, v3}, Lvi0;->h(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    invoke-static {p0}, Ls;->c(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    return-object v2

    .line 303
    :cond_b
    const-string p0, "Expected min="

    .line 304
    .line 305
    const-string p1, " \u2264 max="

    .line 306
    .line 307
    invoke-static {p0, p3, p1, v1}, Lvi0;->h(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    invoke-static {p0}, Ls;->c(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    return-object v2
.end method


# virtual methods
.method public final onScrollCaptureEnd(Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    sget-object v0, Lfo1;->i:Lfo1;

    .line 2
    .line 3
    new-instance v1, La2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0xb

    .line 7
    .line 8
    invoke-direct {v1, p0, p1, v2, v3}, La2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    iget-object p0, p0, Lcx;->e:Ls00;

    .line 13
    .line 14
    invoke-static {p0, v0, v1, p1}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onScrollCaptureImageRequest(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V
    .locals 7

    .line 1
    new-instance v0, Lk9;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v6, 0x3

    .line 5
    move-object v1, p0

    .line 6
    move-object v2, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    invoke-direct/range {v0 .. v6}, Lk9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    const/4 p1, 0x3

    .line 14
    iget-object p3, v1, Lcx;->e:Ls00;

    .line 15
    .line 16
    invoke-static {p3, p0, v0, p1}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, Lv5;

    .line 21
    .line 22
    const/16 p3, 0x8

    .line 23
    .line 24
    invoke-direct {p1, p3, p2}, Lv5;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lr21;->t(Lin0;)Lca0;

    .line 28
    .line 29
    .line 30
    new-instance p1, Ldx;

    .line 31
    .line 32
    const/4 p3, 0x0

    .line 33
    invoke-direct {p1, p3, p0}, Ldx;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p1}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final onScrollCaptureSearch(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcx;->b:Ld11;

    .line 2
    .line 3
    invoke-static {p0}, Lrp0;->n0(Ld11;)Landroid/graphics/Rect;

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
    iget-object p1, p0, Lcx;->f:Leu0;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    iput p2, p1, Leu0;->b:F

    .line 5
    .line 6
    iget-object p0, p0, Lcx;->c:Lhh1;

    .line 7
    .line 8
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lnx1;

    .line 11
    .line 12
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    .line 18
    .line 19
    .line 20
    return-void
.end method
