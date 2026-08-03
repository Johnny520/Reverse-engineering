.class public final Le2/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/ScrollCaptureCallback;


# instance fields
.field public final a:Lf2/q;

.field public final b:Lu2/k;

.field public final c:Landroidx/lifecycle/x;

.field public final d:Ly1/t;

.field public final e:Lvg/c;

.field public final f:Le2/g;


# direct methods
.method public constructor <init>(Lf2/q;Lu2/k;Lvg/c;Landroidx/lifecycle/x;Ly1/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le2/c;->a:Lf2/q;

    .line 5
    .line 6
    iput-object p2, p0, Le2/c;->b:Lu2/k;

    .line 7
    .line 8
    iput-object p4, p0, Le2/c;->c:Landroidx/lifecycle/x;

    .line 9
    .line 10
    iput-object p5, p0, Le2/c;->d:Ly1/t;

    .line 11
    .line 12
    new-instance p1, Lvg/c;

    .line 13
    .line 14
    iget-object p3, p3, Lvg/c;->g:Lwf/g;

    .line 15
    .line 16
    sget-object p4, Le2/e;->g:Le2/e;

    .line 17
    .line 18
    invoke-interface {p3, p4}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-direct {p1, p3}, Lvg/c;-><init>(Lwf/g;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Le2/c;->e:Lvg/c;

    .line 26
    .line 27
    new-instance p1, Le2/g;

    .line 28
    .line 29
    invoke-virtual {p2}, Lu2/k;->a()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    new-instance p3, Lci/m0;

    .line 34
    .line 35
    const/4 p4, 0x0

    .line 36
    invoke-direct {p3, p0, p4}, Lci/m0;-><init>(Le2/c;Lwf/c;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p1, p2, p3}, Le2/g;-><init>(ILci/m0;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Le2/c;->f:Le2/g;

    .line 43
    .line 44
    return-void
.end method

.method public static final a(Le2/c;Landroid/view/ScrollCaptureSession;Lu2/k;Lyf/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, Le2/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Le2/a;

    .line 7
    .line 8
    iget v1, v0, Le2/a;->m:I

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
    iput v1, v0, Le2/a;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Le2/a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Le2/a;-><init>(Le2/c;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Le2/a;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Le2/a;->m:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x2

    .line 31
    sget-object v4, Lxf/a;->g:Lxf/a;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v2, :cond_2

    .line 36
    .line 37
    if-ne v1, v3, :cond_1

    .line 38
    .line 39
    iget p1, v0, Le2/a;->j:I

    .line 40
    .line 41
    iget p2, v0, Le2/a;->i:I

    .line 42
    .line 43
    iget-object v1, v0, Le2/a;->h:Lu2/k;

    .line 44
    .line 45
    iget-object v0, v0, Le2/a;->g:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {v0}, La1/c;->j(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_1
    const/4 p0, 0x0

    .line 62
    return-object p0

    .line 63
    :cond_2
    iget p1, v0, Le2/a;->j:I

    .line 64
    .line 65
    iget p2, v0, Le2/a;->i:I

    .line 66
    .line 67
    iget-object v1, v0, Le2/a;->h:Lu2/k;

    .line 68
    .line 69
    iget-object v2, v0, Le2/a;->g:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-static {v2}, La1/c;->j(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

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
    goto :goto_4

    .line 83
    :cond_3
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget p3, p2, Lu2/k;->b:I

    .line 87
    .line 88
    iget v1, p2, Lu2/k;->d:I

    .line 89
    .line 90
    iget-object v5, p0, Le2/c;->f:Le2/g;

    .line 91
    .line 92
    iput-object p1, v0, Le2/a;->g:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p2, v0, Le2/a;->h:Lu2/k;

    .line 95
    .line 96
    iput p3, v0, Le2/a;->i:I

    .line 97
    .line 98
    iput v1, v0, Le2/a;->j:I

    .line 99
    .line 100
    iput v2, v0, Le2/a;->m:I

    .line 101
    .line 102
    iget v2, v5, Le2/g;->a:I

    .line 103
    .line 104
    if-gt p3, v1, :cond_b

    .line 105
    .line 106
    sub-int v6, v1, p3

    .line 107
    .line 108
    if-gt v6, v2, :cond_a

    .line 109
    .line 110
    int-to-float v7, p3

    .line 111
    iget v8, v5, Le2/g;->b:F

    .line 112
    .line 113
    cmpl-float v7, v7, v8

    .line 114
    .line 115
    sget-object v9, Lsf/n;->a:Lsf/n;

    .line 116
    .line 117
    if-ltz v7, :cond_4

    .line 118
    .line 119
    int-to-float v7, v1

    .line 120
    int-to-float v10, v2

    .line 121
    add-float/2addr v10, v8

    .line 122
    cmpg-float v7, v7, v10

    .line 123
    .line 124
    if-gtz v7, :cond_4

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    div-int/2addr v6, v3

    .line 128
    add-int/2addr v6, p3

    .line 129
    div-int/2addr v2, v3

    .line 130
    sub-int/2addr v6, v2

    .line 131
    int-to-float v2, v6

    .line 132
    sub-float/2addr v2, v8

    .line 133
    invoke-virtual {v5, v2, v0}, Le2/g;->b(FLyf/c;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    if-ne v2, v4, :cond_5

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    move-object v2, v9

    .line 141
    :goto_2
    if-ne v2, v4, :cond_6

    .line 142
    .line 143
    move-object v9, v2

    .line 144
    :cond_6
    :goto_3
    if-ne v9, v4, :cond_7

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_7
    :goto_4
    sget-object v2, Le2/b;->h:Le2/b;

    .line 148
    .line 149
    iput-object p1, v0, Le2/a;->g:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object p2, v0, Le2/a;->h:Lu2/k;

    .line 152
    .line 153
    iput p3, v0, Le2/a;->i:I

    .line 154
    .line 155
    iput v1, v0, Le2/a;->j:I

    .line 156
    .line 157
    iput v3, v0, Le2/a;->m:I

    .line 158
    .line 159
    invoke-interface {v0}, Lwf/c;->getContext()Lwf/g;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-static {v3}, Li0/r;->s(Lwf/g;)Li0/d;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v3, v2, v0}, Li0/d;->d(Lfg/l;Lwf/c;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    if-ne v0, v4, :cond_8

    .line 172
    .line 173
    :goto_5
    return-object v4

    .line 174
    :cond_8
    move-object v0, p1

    .line 175
    move p1, v1

    .line 176
    move-object v1, p2

    .line 177
    move p2, p3

    .line 178
    :goto_6
    iget-object p3, p0, Le2/c;->f:Le2/g;

    .line 179
    .line 180
    iget v2, p3, Le2/g;->b:F

    .line 181
    .line 182
    invoke-static {v2}, Lig/a;->X(F)I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    sub-int/2addr p2, v2

    .line 187
    iget p3, p3, Le2/g;->a:I

    .line 188
    .line 189
    const/4 v2, 0x0

    .line 190
    invoke-static {p2, v2, p3}, Lr9/e0;->r(III)I

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    iget-object p3, p0, Le2/c;->f:Le2/g;

    .line 195
    .line 196
    iget v3, p3, Le2/g;->b:F

    .line 197
    .line 198
    invoke-static {v3}, Lig/a;->X(F)I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    sub-int/2addr p1, v3

    .line 203
    iget p3, p3, Le2/g;->a:I

    .line 204
    .line 205
    invoke-static {p1, v2, p3}, Lr9/e0;->r(III)I

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    iget p3, v1, Lu2/k;->a:I

    .line 210
    .line 211
    iget v1, v1, Lu2/k;->c:I

    .line 212
    .line 213
    if-ne p2, p1, :cond_9

    .line 214
    .line 215
    sget-object p0, Lu2/k;->e:Lu2/k;

    .line 216
    .line 217
    return-object p0

    .line 218
    :cond_9
    invoke-static {v0}, La1/c;->l(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-virtual {v2}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    :try_start_0
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 227
    .line 228
    .line 229
    int-to-float v3, p3

    .line 230
    neg-float v3, v3

    .line 231
    int-to-float v4, p2

    .line 232
    neg-float v4, v4

    .line 233
    invoke-virtual {v2, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 234
    .line 235
    .line 236
    iget-object v3, p0, Le2/c;->b:Lu2/k;

    .line 237
    .line 238
    iget v4, v3, Lu2/k;->a:I

    .line 239
    .line 240
    int-to-float v4, v4

    .line 241
    neg-float v4, v4

    .line 242
    iget v3, v3, Lu2/k;->b:I

    .line 243
    .line 244
    int-to-float v3, v3

    .line 245
    neg-float v3, v3

    .line 246
    invoke-virtual {v2, v4, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 247
    .line 248
    .line 249
    iget-object v3, p0, Le2/c;->d:Ly1/t;

    .line 250
    .line 251
    invoke-virtual {v3}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    invoke-virtual {v3, v2}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 256
    .line 257
    .line 258
    invoke-static {v0}, La1/c;->l(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0, v2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 263
    .line 264
    .line 265
    iget-object p0, p0, Le2/c;->f:Le2/g;

    .line 266
    .line 267
    iget p0, p0, Le2/g;->b:F

    .line 268
    .line 269
    invoke-static {p0}, Lig/a;->X(F)I

    .line 270
    .line 271
    .line 272
    move-result p0

    .line 273
    new-instance v0, Lu2/k;

    .line 274
    .line 275
    add-int/2addr p2, p0

    .line 276
    add-int/2addr p1, p0

    .line 277
    invoke-direct {v0, p3, p2, v1, p1}, Lu2/k;-><init>(IIII)V

    .line 278
    .line 279
    .line 280
    return-object v0

    .line 281
    :catchall_0
    move-exception p0

    .line 282
    invoke-static {v0}, La1/c;->l(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    invoke-virtual {p1, v2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 287
    .line 288
    .line 289
    throw p0

    .line 290
    :cond_a
    const-string p0, "Expected range ("

    .line 291
    .line 292
    const-string p1, ") to be \u2264 viewportSize="

    .line 293
    .line 294
    invoke-static {v6, p0, p1, v2}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    goto/16 :goto_1

    .line 302
    .line 303
    :cond_b
    const-string p0, "Expected min="

    .line 304
    .line 305
    const-string p1, " \u2264 max="

    .line 306
    .line 307
    invoke-static {p3, p0, p1, v1}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_1
.end method


# virtual methods
.method public final onScrollCaptureEnd(Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    sget-object v0, Lqg/b1;->h:Lqg/b1;

    .line 2
    .line 3
    new-instance v1, Lci/j;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v1, p0, p1, v2, v3}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    iget-object v2, p0, Le2/c;->e:Lvg/c;

    .line 12
    .line 13
    invoke-static {v2, v0, v1, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onScrollCaptureImageRequest(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V
    .locals 7

    .line 1
    new-instance v0, Lci/e;

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
    invoke-direct/range {v0 .. v6}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    const/4 p3, 0x3

    .line 14
    iget-object p4, v1, Le2/c;->e:Lvg/c;

    .line 15
    .line 16
    invoke-static {p4, p1, v0, p3}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance p3, Lb1/f;

    .line 21
    .line 22
    const/4 p4, 0x3

    .line 23
    invoke-direct {p3, p2, p4}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p3}, Lqg/y0;->o(Lfg/l;)Lqg/d0;

    .line 27
    .line 28
    .line 29
    new-instance p3, Le2/d;

    .line 30
    .line 31
    const/4 p4, 0x0

    .line 32
    invoke-direct {p3, p1, p4}, Le2/d;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p3}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final onScrollCaptureSearch(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V
    .locals 0

    .line 1
    iget-object p1, p0, Le2/c;->b:Lu2/k;

    .line 2
    .line 3
    invoke-static {p1}, Lf1/c0;->t(Lu2/k;)Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p2, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onScrollCaptureStart(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Le2/c;->f:Le2/g;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    iput p2, p1, Le2/g;->b:F

    .line 5
    .line 6
    iget-object p1, p0, Le2/c;->c:Landroidx/lifecycle/x;

    .line 7
    .line 8
    iget-object p1, p1, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Li0/j1;

    .line 11
    .line 12
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    .line 18
    .line 19
    .line 20
    return-void
.end method
