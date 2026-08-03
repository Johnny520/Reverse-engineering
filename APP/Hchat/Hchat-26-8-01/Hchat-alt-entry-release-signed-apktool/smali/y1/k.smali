.class public final Ly1/k;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lc2/a;
.implements Lx1/z1;
.implements Lq1/e;
.implements Lx1/v;
.implements Lx1/e2;


# instance fields
.field public final u:Lb1/f;

.field public final synthetic v:Ly1/t;


# direct methods
.method public constructor <init>(Ly1/t;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ly1/k;->v:Ly1/t;

    .line 2
    .line 3
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lb1/f;

    .line 7
    .line 8
    const/16 v0, 0x15

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ly1/k;->u:Lb1/f;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final A0(Lx1/i1;Lc1/b;Lyf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Lx1/i1;->m0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p2}, Lc1/b;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Le1/c;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Le1/c;->i(J)Le1/c;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    if-eqz p1, :cond_1

    .line 22
    .line 23
    new-instance p2, Landroid/graphics/Rect;

    .line 24
    .line 25
    iget p3, p1, Le1/c;->a:F

    .line 26
    .line 27
    float-to-int p3, p3

    .line 28
    iget v0, p1, Le1/c;->b:F

    .line 29
    .line 30
    float-to-int v0, v0

    .line 31
    iget v1, p1, Le1/c;->c:F

    .line 32
    .line 33
    float-to-int v1, v1

    .line 34
    iget p1, p1, Le1/c;->d:F

    .line 35
    .line 36
    float-to-int p1, p1

    .line 37
    invoke-direct {p2, p3, v0, v1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    iget-object p3, p0, Ly1/k;->v:Ly1/t;

    .line 42
    .line 43
    invoke-virtual {p3, p2, p1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;Z)Z

    .line 44
    .line 45
    .line 46
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 47
    .line 48
    return-object p1
.end method

.method public final C(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final F()Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "androidx.compose.ui.layout.WindowInsetsRulers"

    .line 2
    .line 3
    return-object v0
.end method

.method public final W(Landroid/view/KeyEvent;)Z
    .locals 9

    .line 1
    sget-object v0, Ld1/h;->a:[I

    .line 2
    .line 3
    invoke-static {p1}, Lq1/d;->b(Landroid/view/KeyEvent;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sget-wide v2, Lq1/a;->b:J

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lq1/a;->a(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    new-instance v0, Ld1/f;

    .line 18
    .line 19
    invoke-direct {v0, v4}, Ld1/f;-><init>(I)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_5

    .line 23
    .line 24
    :cond_0
    sget-wide v5, Lq1/a;->c:J

    .line 25
    .line 26
    invoke-static {v0, v1, v5, v6}, Lq1/a;->a(JJ)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    new-instance v0, Ld1/f;

    .line 33
    .line 34
    invoke-direct {v0, v3}, Ld1/f;-><init>(I)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :cond_1
    sget-wide v5, Lq1/a;->p:J

    .line 40
    .line 41
    invoke-static {v0, v1, v5, v6}, Lq1/a;->a(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    move v0, v4

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move v0, v3

    .line 56
    :goto_0
    new-instance v1, Ld1/f;

    .line 57
    .line 58
    invoke-direct {v1, v0}, Ld1/f;-><init>(I)V

    .line 59
    .line 60
    .line 61
    move-object v0, v1

    .line 62
    goto/16 :goto_5

    .line 63
    .line 64
    :cond_3
    sget-wide v5, Lq1/a;->g:J

    .line 65
    .line 66
    invoke-static {v0, v1, v5, v6}, Lq1/a;->a(JJ)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_4

    .line 71
    .line 72
    new-instance v0, Ld1/f;

    .line 73
    .line 74
    const/4 v1, 0x4

    .line 75
    invoke-direct {v0, v1}, Ld1/f;-><init>(I)V

    .line 76
    .line 77
    .line 78
    goto/16 :goto_5

    .line 79
    .line 80
    :cond_4
    sget-wide v5, Lq1/a;->f:J

    .line 81
    .line 82
    invoke-static {v0, v1, v5, v6}, Lq1/a;->a(JJ)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_5

    .line 87
    .line 88
    new-instance v0, Ld1/f;

    .line 89
    .line 90
    const/4 v1, 0x3

    .line 91
    invoke-direct {v0, v1}, Ld1/f;-><init>(I)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_5

    .line 95
    .line 96
    :cond_5
    sget-wide v5, Lq1/a;->d:J

    .line 97
    .line 98
    invoke-static {v0, v1, v5, v6}, Lq1/a;->a(JJ)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_d

    .line 103
    .line 104
    sget-wide v5, Lq1/a;->C:J

    .line 105
    .line 106
    invoke-static {v0, v1, v5, v6}, Lq1/a;->a(JJ)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_6

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    sget-wide v5, Lq1/a;->e:J

    .line 114
    .line 115
    invoke-static {v0, v1, v5, v6}, Lq1/a;->a(JJ)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-nez v2, :cond_c

    .line 120
    .line 121
    sget-wide v5, Lq1/a;->D:J

    .line 122
    .line 123
    invoke-static {v0, v1, v5, v6}, Lq1/a;->a(JJ)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_7

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_7
    sget-wide v5, Lq1/a;->h:J

    .line 131
    .line 132
    invoke-static {v0, v1, v5, v6}, Lq1/a;->a(JJ)Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-nez v2, :cond_b

    .line 137
    .line 138
    sget-wide v5, Lq1/a;->r:J

    .line 139
    .line 140
    invoke-static {v0, v1, v5, v6}, Lq1/a;->a(JJ)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-nez v2, :cond_b

    .line 145
    .line 146
    sget-wide v5, Lq1/a;->E:J

    .line 147
    .line 148
    invoke-static {v0, v1, v5, v6}, Lq1/a;->a(JJ)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_8

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_8
    sget-wide v5, Lq1/a;->a:J

    .line 156
    .line 157
    invoke-static {v0, v1, v5, v6}, Lq1/a;->a(JJ)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-nez v2, :cond_a

    .line 162
    .line 163
    sget-wide v5, Lq1/a;->u:J

    .line 164
    .line 165
    invoke-static {v0, v1, v5, v6}, Lq1/a;->a(JJ)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_9

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_9
    const/4 v0, 0x0

    .line 173
    goto :goto_5

    .line 174
    :cond_a
    :goto_1
    new-instance v0, Ld1/f;

    .line 175
    .line 176
    const/16 v1, 0x8

    .line 177
    .line 178
    invoke-direct {v0, v1}, Ld1/f;-><init>(I)V

    .line 179
    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_b
    :goto_2
    new-instance v0, Ld1/f;

    .line 183
    .line 184
    const/4 v1, 0x7

    .line 185
    invoke-direct {v0, v1}, Ld1/f;-><init>(I)V

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_c
    :goto_3
    new-instance v0, Ld1/f;

    .line 190
    .line 191
    const/4 v1, 0x6

    .line 192
    invoke-direct {v0, v1}, Ld1/f;-><init>(I)V

    .line 193
    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_d
    :goto_4
    new-instance v0, Ld1/f;

    .line 197
    .line 198
    const/4 v1, 0x5

    .line 199
    invoke-direct {v0, v1}, Ld1/f;-><init>(I)V

    .line 200
    .line 201
    .line 202
    :goto_5
    const/4 v1, 0x0

    .line 203
    if-eqz v0, :cond_15

    .line 204
    .line 205
    iget v2, v0, Ld1/f;->a:I

    .line 206
    .line 207
    invoke-static {p1}, Lq1/d;->c(Landroid/view/KeyEvent;)I

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    if-ne p1, v4, :cond_15

    .line 212
    .line 213
    iget-object p1, p0, Ly1/k;->v:Ly1/t;

    .line 214
    .line 215
    invoke-virtual {p1}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    check-cast v5, Ld1/p;

    .line 220
    .line 221
    invoke-virtual {v5}, Ld1/p;->f()Ld1/b0;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    if-eqz v5, :cond_e

    .line 226
    .line 227
    iget-boolean v5, v5, Ld1/b0;->u:Z

    .line 228
    .line 229
    if-ne v5, v3, :cond_e

    .line 230
    .line 231
    invoke-virtual {p1, v2}, Ly1/t;->z(I)Z

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    if-eqz v5, :cond_e

    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_e
    invoke-virtual {p1}, Ly1/t;->getEmbeddedViewFocusRect()Le1/c;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    invoke-virtual {p1}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    new-instance v7, Lb1/f;

    .line 247
    .line 248
    const/16 v8, 0x14

    .line 249
    .line 250
    invoke-direct {v7, v0, v8}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 251
    .line 252
    .line 253
    check-cast v6, Ld1/p;

    .line 254
    .line 255
    invoke-virtual {v6, v2, v5, v7}, Ld1/p;->e(ILe1/c;Lfg/l;)Ljava/lang/Boolean;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-eqz v0, :cond_f

    .line 260
    .line 261
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    goto :goto_6

    .line 266
    :cond_f
    move v0, v3

    .line 267
    :goto_6
    if-eqz v0, :cond_10

    .line 268
    .line 269
    :goto_7
    return v3

    .line 270
    :cond_10
    if-ne v2, v3, :cond_11

    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_11
    if-ne v2, v4, :cond_12

    .line 274
    .line 275
    goto :goto_8

    .line 276
    :cond_12
    move v3, v1

    .line 277
    :goto_8
    if-eqz v3, :cond_15

    .line 278
    .line 279
    invoke-static {v2}, Ld1/h;->c(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    if-eqz v0, :cond_13

    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    :cond_13
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    check-cast v3, Landroid/view/ViewGroup;

    .line 301
    .line 302
    invoke-virtual {p1}, Ly1/t;->getView()Landroid/view/View;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    invoke-virtual {v0, v3, v5, v4}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    if-eqz v0, :cond_14

    .line 311
    .line 312
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-eqz v0, :cond_15

    .line 317
    .line 318
    :cond_14
    invoke-virtual {p1}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    check-cast p1, Ld1/p;

    .line 323
    .line 324
    invoke-virtual {p1, v2}, Ld1/p;->h(I)Z

    .line 325
    .line 326
    .line 327
    move-result p1

    .line 328
    return p1

    .line 329
    :cond_15
    return v1
.end method

.method public final X0(Lf2/y;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final j(Lv1/p0;Lv1/m0;J)Lv1/o0;
    .locals 6

    .line 1
    invoke-interface {p2, p3, p4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget v1, p2, Lv1/b1;->g:I

    .line 6
    .line 7
    iget v2, p2, Lv1/b1;->h:I

    .line 8
    .line 9
    new-instance v5, Lc1/n;

    .line 10
    .line 11
    const/4 p3, 0x5

    .line 12
    invoke-direct {v5, p2, p3}, Lc1/n;-><init>(Lv1/b1;I)V

    .line 13
    .line 14
    .line 15
    sget-object v3, Ltf/u;->g:Ltf/u;

    .line 16
    .line 17
    iget-object v4, p0, Ly1/k;->u:Lb1/f;

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    invoke-interface/range {v0 .. v5}, Lv1/p0;->D0(IILjava/util/Map;Lfg/l;Lfg/l;)Lv1/o0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method
