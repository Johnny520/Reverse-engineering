.class public final Lwb/fr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lwb/fr;

.field public static final b:Landroid/os/Handler;

.field public static final c:Ljava/util/WeakHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwb/fr;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwb/fr;->a:Lwb/fr;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lwb/fr;->b:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance v0, Ljava/util/WeakHashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lwb/fr;->c:Ljava/util/WeakHashMap;

    .line 25
    .line 26
    return-void
.end method

.method public static c(Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/ViewGroup;ILandroid/view/ViewGroup$LayoutParams;Landroid/graphics/drawable/Drawable;Landroid/view/View;Ljava/util/ArrayList;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)V
    .locals 4

    .line 1
    invoke-virtual {p8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, p8}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {p9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 20
    .line 21
    .line 22
    move-result-object p8

    .line 23
    instance-of v0, p8, Landroid/view/ViewGroup;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    check-cast p8, Landroid/view/ViewGroup;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move-object p8, v2

    .line 31
    :goto_1
    if-eqz p8, :cond_3

    .line 32
    .line 33
    invoke-virtual {p8, p9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    :cond_3
    new-instance p8, Lwb/e2;

    .line 37
    .line 38
    const/16 p9, 0x9

    .line 39
    .line 40
    invoke-direct {p8, p9}, Lwb/e2;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-static {p7, p8}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p7

    .line 47
    invoke-interface {p7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p7

    .line 51
    :goto_2
    invoke-interface {p7}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result p8

    .line 55
    const/4 p9, 0x0

    .line 56
    if-eqz p8, :cond_6

    .line 57
    .line 58
    invoke-interface {p7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p8

    .line 62
    check-cast p8, Lwb/br;

    .line 63
    .line 64
    iget-object v0, p8, Lwb/br;->a:Landroid/view/View;

    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    instance-of v3, v1, Landroid/view/ViewGroup;

    .line 71
    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    check-cast v1, Landroid/view/ViewGroup;

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    move-object v1, v2

    .line 78
    :goto_3
    if-eqz v1, :cond_5

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    :cond_5
    iget v1, p8, Lwb/br;->b:I

    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-static {v1, p9, v3}, Lr9/e0;->r(III)I

    .line 90
    .line 91
    .line 92
    move-result p9

    .line 93
    iget-object p8, p8, Lwb/br;->c:Landroid/view/ViewGroup$LayoutParams;

    .line 94
    .line 95
    invoke-virtual {p1, v0, p9, p8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    instance-of p7, p1, Landroid/view/ViewGroup;

    .line 104
    .line 105
    if-eqz p7, :cond_7

    .line 106
    .line 107
    check-cast p1, Landroid/view/ViewGroup;

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_7
    move-object p1, v2

    .line 111
    :goto_4
    if-eqz p1, :cond_8

    .line 112
    .line 113
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    :cond_8
    invoke-virtual {p6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    instance-of p7, p1, Landroid/view/ViewGroup;

    .line 121
    .line 122
    if-eqz p7, :cond_9

    .line 123
    .line 124
    check-cast p1, Landroid/view/ViewGroup;

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_9
    move-object p1, v2

    .line 128
    :goto_5
    if-ne p1, p2, :cond_c

    .line 129
    .line 130
    invoke-virtual {p2, p6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 131
    .line 132
    .line 133
    move-result p7

    .line 134
    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object p8

    .line 138
    if-ltz p7, :cond_a

    .line 139
    .line 140
    const/4 p7, 0x1

    .line 141
    goto :goto_6

    .line 142
    :cond_a
    move p7, p9

    .line 143
    :goto_6
    if-eqz p7, :cond_b

    .line 144
    .line 145
    move-object v2, p8

    .line 146
    :cond_b
    if-eqz v2, :cond_c

    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result p3

    .line 152
    :cond_c
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 153
    .line 154
    .line 155
    move-result p7

    .line 156
    invoke-static {p3, p9, p7}, Lr9/e0;->r(III)I

    .line 157
    .line 158
    .line 159
    move-result p3

    .line 160
    if-eqz p1, :cond_d

    .line 161
    .line 162
    invoke-virtual {p1, p6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 163
    .line 164
    .line 165
    :cond_d
    invoke-virtual {p0, p5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2, p0, p3, p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 169
    .line 170
    .line 171
    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;ILwb/er;Li0/h0;I)V
    .locals 19

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v5, p4

    .line 8
    .line 9
    move-object/from16 v9, p5

    .line 10
    .line 11
    const v0, 0x6911ab06

    .line 12
    .line 13
    .line 14
    invoke-virtual {v9, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v9, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x2

    .line 26
    :goto_0
    or-int v0, p6, v0

    .line 27
    .line 28
    invoke-virtual {v9, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    const/16 v1, 0x20

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/16 v1, 0x10

    .line 38
    .line 39
    :goto_1
    or-int/2addr v0, v1

    .line 40
    invoke-virtual {v9, v4}, Li0/h0;->d(I)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    const/16 v1, 0x100

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v1, 0x80

    .line 50
    .line 51
    :goto_2
    or-int/2addr v0, v1

    .line 52
    invoke-virtual {v9, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    const/16 v1, 0x800

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const/16 v1, 0x400

    .line 62
    .line 63
    :goto_3
    or-int/2addr v0, v1

    .line 64
    and-int/lit16 v1, v0, 0x493

    .line 65
    .line 66
    const/16 v6, 0x492

    .line 67
    .line 68
    const/4 v12, 0x0

    .line 69
    const/4 v13, 0x1

    .line 70
    if-eq v1, v6, :cond_4

    .line 71
    .line 72
    move v1, v13

    .line 73
    goto :goto_4

    .line 74
    :cond_4
    move v1, v12

    .line 75
    :goto_4
    and-int/2addr v0, v13

    .line 76
    invoke-virtual {v9, v0, v1}, Li0/h0;->S(IZ)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_9

    .line 81
    .line 82
    sget-object v0, Ly1/h1;->h:Li0/m2;

    .line 83
    .line 84
    invoke-virtual {v9, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lu2/c;

    .line 89
    .line 90
    invoke-interface {v0, v4}, Lu2/c;->i0(I)F

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    const/4 v1, 0x3

    .line 95
    const/4 v6, 0x0

    .line 96
    invoke-static {v6, v9, v12, v1}, Lth/c;->e(Li1/b;Li0/h0;II)Lth/j;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    sget-object v14, Lp/h1;->c:Lp/a0;

    .line 101
    .line 102
    sget-object v6, Ly0/b;->g:Ly0/g;

    .line 103
    .line 104
    invoke-static {v6, v12}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    iget-wide v7, v9, Li0/h0;->T:J

    .line 109
    .line 110
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    invoke-virtual {v9}, Li0/h0;->l()Ls0/h;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    invoke-static {v9, v14}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    sget-object v11, Lx1/g;->f:Lx1/f;

    .line 123
    .line 124
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    sget-object v15, Lx1/f;->b:Lx1/y;

    .line 128
    .line 129
    invoke-virtual {v9}, Li0/h0;->d0()V

    .line 130
    .line 131
    .line 132
    iget-boolean v11, v9, Li0/h0;->S:Z

    .line 133
    .line 134
    if-eqz v11, :cond_5

    .line 135
    .line 136
    invoke-virtual {v9, v15}, Li0/h0;->k(Lfg/a;)V

    .line 137
    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_5
    invoke-virtual {v9}, Li0/h0;->n0()V

    .line 141
    .line 142
    .line 143
    :goto_5
    sget-object v11, Lx1/f;->e:Lx1/e;

    .line 144
    .line 145
    invoke-static {v11, v9, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    sget-object v6, Lx1/f;->d:Lx1/e;

    .line 149
    .line 150
    invoke-static {v6, v9, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    sget-object v8, Lx1/f;->f:Lx1/e;

    .line 158
    .line 159
    invoke-static {v8, v9, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    sget-object v7, Lx1/f;->g:Lx1/d;

    .line 163
    .line 164
    invoke-static {v7, v9}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 165
    .line 166
    .line 167
    sget-object v13, Lx1/f;->c:Lx1/e;

    .line 168
    .line 169
    invoke-static {v13, v9, v10}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v9, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v12

    .line 180
    if-nez v10, :cond_6

    .line 181
    .line 182
    sget-object v10, Li0/l;->a:Li0/e;

    .line 183
    .line 184
    if-ne v12, v10, :cond_7

    .line 185
    .line 186
    :cond_6
    new-instance v12, Lwb/ar;

    .line 187
    .line 188
    const/4 v10, 0x0

    .line 189
    invoke-direct {v12, v2, v10}, Lwb/ar;-><init>(Landroid/widget/FrameLayout;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v9, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_7
    check-cast v12, Lfg/l;

    .line 196
    .line 197
    move-object v10, v7

    .line 198
    invoke-static {v14, v1}, Lth/c;->d(Ly0/o;Lth/j;)Ly0/o;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    move-object/from16 v16, v10

    .line 203
    .line 204
    const/4 v10, 0x0

    .line 205
    move-object/from16 v17, v11

    .line 206
    .line 207
    const/4 v11, 0x4

    .line 208
    move-object/from16 v18, v8

    .line 209
    .line 210
    const/4 v8, 0x0

    .line 211
    move-object/from16 v2, v16

    .line 212
    .line 213
    move/from16 v16, v0

    .line 214
    .line 215
    move-object v0, v6

    .line 216
    move-object v6, v12

    .line 217
    move-object/from16 v12, v17

    .line 218
    .line 219
    move-object/from16 v17, v1

    .line 220
    .line 221
    move-object/from16 v1, v18

    .line 222
    .line 223
    invoke-static/range {v6 .. v11}, Lx2/i;->b(Lfg/l;Ly0/o;Lfg/l;Li0/h0;II)V

    .line 224
    .line 225
    .line 226
    iget v7, v5, Lwb/er;->c:F

    .line 227
    .line 228
    iget v10, v5, Lwb/er;->d:F

    .line 229
    .line 230
    const/4 v11, 0x2

    .line 231
    const/4 v8, 0x0

    .line 232
    move v9, v7

    .line 233
    move-object v6, v14

    .line 234
    move-object/from16 v14, p5

    .line 235
    .line 236
    invoke-static/range {v6 .. v11}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    sget-object v7, Ly0/b;->n:Ly0/g;

    .line 241
    .line 242
    const/4 v8, 0x0

    .line 243
    invoke-static {v7, v8}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    iget-wide v8, v14, Li0/h0;->T:J

    .line 248
    .line 249
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 250
    .line 251
    .line 252
    move-result v8

    .line 253
    invoke-virtual {v14}, Li0/h0;->l()Ls0/h;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    invoke-static {v14, v6}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    invoke-virtual {v14}, Li0/h0;->d0()V

    .line 262
    .line 263
    .line 264
    iget-boolean v10, v14, Li0/h0;->S:Z

    .line 265
    .line 266
    if-eqz v10, :cond_8

    .line 267
    .line 268
    invoke-virtual {v14, v15}, Li0/h0;->k(Lfg/a;)V

    .line 269
    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_8
    invoke-virtual {v14}, Li0/h0;->n0()V

    .line 273
    .line 274
    .line 275
    :goto_6
    invoke-static {v12, v14, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    invoke-static {v0, v14, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-static {v8, v14, v1, v14, v2}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 282
    .line 283
    .line 284
    invoke-static {v13, v14, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    iget-boolean v7, v5, Lwb/er;->a:Z

    .line 288
    .line 289
    const/high16 v0, 0x3f800000    # 1.0f

    .line 290
    .line 291
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 292
    .line 293
    invoke-static {v1, v0}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    const/16 v1, 0x8

    .line 298
    .line 299
    int-to-float v1, v1

    .line 300
    add-float v1, v16, v1

    .line 301
    .line 302
    invoke-static {v0, v1}, Lp/h1;->e(Ly0/o;F)Ly0/o;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    new-instance v0, Lf0/h;

    .line 307
    .line 308
    const/16 v1, 0xd

    .line 309
    .line 310
    invoke-direct {v0, v3, v1}, Lf0/h;-><init>(Ljava/lang/Object;I)V

    .line 311
    .line 312
    .line 313
    const v1, 0x5ceb46dd

    .line 314
    .line 315
    .line 316
    invoke-static {v1, v0, v14}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 317
    .line 318
    .line 319
    move-result-object v9

    .line 320
    const/16 v11, 0xc00

    .line 321
    .line 322
    move-object v10, v14

    .line 323
    move-object/from16 v6, v17

    .line 324
    .line 325
    invoke-static/range {v6 .. v11}, Lwb/o3;->d(Lth/j;ZLy0/o;Ls0/d;Li0/h0;I)V

    .line 326
    .line 327
    .line 328
    move-object v9, v10

    .line 329
    const/4 v0, 0x1

    .line 330
    invoke-virtual {v9, v0}, Li0/h0;->p(Z)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v9, v0}, Li0/h0;->p(Z)V

    .line 334
    .line 335
    .line 336
    goto :goto_7

    .line 337
    :cond_9
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 338
    .line 339
    .line 340
    :goto_7
    invoke-virtual {v9}, Li0/h0;->t()Li0/r1;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    if-eqz v7, :cond_a

    .line 345
    .line 346
    new-instance v0, Ls0/c;

    .line 347
    .line 348
    move-object/from16 v1, p0

    .line 349
    .line 350
    move-object/from16 v2, p1

    .line 351
    .line 352
    move/from16 v6, p6

    .line 353
    .line 354
    invoke-direct/range {v0 .. v6}, Ls0/c;-><init>(Lwb/fr;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;ILwb/er;I)V

    .line 355
    .line 356
    .line 357
    iput-object v0, v7, Li0/r1;->d:Lfg/p;

    .line 358
    .line 359
    :cond_a
    return-void
.end method

.method public final b(Landroid/app/Activity;Ls0/d;Li0/h0;I)V
    .locals 7

    .line 1
    const v0, 0x5662c263

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p4

    .line 17
    and-int/lit8 v1, v0, 0x13

    .line 18
    .line 19
    const/16 v2, 0x12

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    if-eq v1, v2, :cond_1

    .line 23
    .line 24
    move v1, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/4 v1, 0x0

    .line 27
    :goto_1
    and-int/2addr v0, v3

    .line 28
    invoke-virtual {p3, v0, v1}, Li0/h0;->S(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 43
    .line 44
    and-int/lit8 v0, v0, 0x30

    .line 45
    .line 46
    const/16 v1, 0x20

    .line 47
    .line 48
    if-ne v0, v1, :cond_2

    .line 49
    .line 50
    invoke-static {}, Lbi/d;->a()Lbi/b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    invoke-static {}, Lbi/d;->b()Lbi/b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_2
    const/4 v2, 0x0

    .line 60
    const/16 v5, 0xc00

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    move-object v3, p2

    .line 64
    move-object v4, p3

    .line 65
    invoke-static/range {v0 .. v5}, Lig/a;->b(Lbi/b;Lbi/l;ZLs0/d;Li0/h0;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    invoke-virtual {p3}, Li0/h0;->V()V

    .line 70
    .line 71
    .line 72
    :goto_3
    invoke-virtual {p3}, Li0/h0;->t()Li0/r1;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    new-instance v1, Lwb/rj;

    .line 79
    .line 80
    const/16 v6, 0xd

    .line 81
    .line 82
    move-object v2, p0

    .line 83
    move-object v3, p1

    .line 84
    move-object v4, p2

    .line 85
    move v5, p4

    .line 86
    invoke-direct/range {v1 .. v6}, Lwb/rj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 87
    .line 88
    .line 89
    iput-object v1, v0, Li0/r1;->d:Lfg/p;

    .line 90
    .line 91
    :cond_4
    return-void
.end method
