.class public abstract Lf2/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Le1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Le1/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x41200000    # 10.0f

    .line 5
    .line 6
    invoke-direct {v0, v1, v1, v2, v2}, Le1/c;-><init>(FFFF)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lf2/t;->a:Le1/c;

    .line 10
    .line 11
    return-void
.end method

.method public static final a(Lx1/f0;Z)Lf2/q;
    .locals 8

    .line 1
    iget-object v0, p0, Lx1/f0;->L:Lx1/b1;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/b1;->f:Ly0/n;

    .line 4
    .line 5
    iget v1, v0, Ly0/n;->j:I

    .line 6
    .line 7
    and-int/lit8 v1, v1, 0x8

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_8

    .line 11
    .line 12
    :goto_0
    if-eqz v0, :cond_8

    .line 13
    .line 14
    iget v1, v0, Ly0/n;->i:I

    .line 15
    .line 16
    and-int/lit8 v1, v1, 0x8

    .line 17
    .line 18
    if-eqz v1, :cond_7

    .line 19
    .line 20
    move-object v1, v0

    .line 21
    move-object v3, v2

    .line 22
    :goto_1
    if-eqz v1, :cond_7

    .line 23
    .line 24
    instance-of v4, v1, Lx1/z1;

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    move-object v2, v1

    .line 29
    goto :goto_4

    .line 30
    :cond_0
    iget v4, v1, Ly0/n;->i:I

    .line 31
    .line 32
    and-int/lit8 v4, v4, 0x8

    .line 33
    .line 34
    if-eqz v4, :cond_6

    .line 35
    .line 36
    instance-of v4, v1, Lx1/j;

    .line 37
    .line 38
    if-eqz v4, :cond_6

    .line 39
    .line 40
    move-object v4, v1

    .line 41
    check-cast v4, Lx1/j;

    .line 42
    .line 43
    iget-object v4, v4, Lx1/j;->v:Ly0/n;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    :goto_2
    const/4 v6, 0x1

    .line 47
    if-eqz v4, :cond_5

    .line 48
    .line 49
    iget v7, v4, Ly0/n;->i:I

    .line 50
    .line 51
    and-int/lit8 v7, v7, 0x8

    .line 52
    .line 53
    if-eqz v7, :cond_4

    .line 54
    .line 55
    add-int/lit8 v5, v5, 0x1

    .line 56
    .line 57
    if-ne v5, v6, :cond_1

    .line 58
    .line 59
    move-object v1, v4

    .line 60
    goto :goto_3

    .line 61
    :cond_1
    if-nez v3, :cond_2

    .line 62
    .line 63
    new-instance v3, Lj0/b;

    .line 64
    .line 65
    const/16 v6, 0x10

    .line 66
    .line 67
    new-array v6, v6, [Ly0/n;

    .line 68
    .line 69
    invoke-direct {v3, v6}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-virtual {v3, v1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object v1, v2

    .line 78
    :cond_3
    invoke-virtual {v3, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    :goto_3
    iget-object v4, v4, Ly0/n;->l:Ly0/n;

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    if-ne v5, v6, :cond_6

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_6
    invoke-static {v3}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    goto :goto_1

    .line 92
    :cond_7
    iget v1, v0, Ly0/n;->j:I

    .line 93
    .line 94
    and-int/lit8 v1, v1, 0x8

    .line 95
    .line 96
    if-eqz v1, :cond_8

    .line 97
    .line 98
    iget-object v0, v0, Ly0/n;->l:Ly0/n;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_8
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    check-cast v2, Lx1/z1;

    .line 105
    .line 106
    check-cast v2, Ly0/n;

    .line 107
    .line 108
    iget-object v0, v2, Ly0/n;->g:Ly0/n;

    .line 109
    .line 110
    invoke-virtual {p0}, Lx1/f0;->w()Lf2/m;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    if-nez v1, :cond_9

    .line 115
    .line 116
    new-instance v1, Lf2/m;

    .line 117
    .line 118
    invoke-direct {v1}, Lf2/m;-><init>()V

    .line 119
    .line 120
    .line 121
    :cond_9
    new-instance v2, Lf2/q;

    .line 122
    .line 123
    invoke-direct {v2, v0, p1, p0, v1}, Lf2/q;-><init>(Ly0/n;ZLx1/f0;Lf2/m;)V

    .line 124
    .line 125
    .line 126
    return-object v2
.end method

.method public static final b(Lf2/s;Lfg/l;)Lf/w;
    .locals 7

    .line 1
    const-string v0, "getAllUncoveredSemanticsNodesToIntObjectMap"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Lf2/s;->a()Lf2/q;

    .line 7
    .line 8
    .line 9
    move-result-object v4

    .line 10
    iget-object p0, v4, Lf2/q;->c:Lx1/f0;

    .line 11
    .line 12
    invoke-virtual {p0}, Lx1/f0;->H()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lx1/f0;->G()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v4}, Lf2/q;->g()Le1/c;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v3, Lf/w;

    .line 30
    .line 31
    const/16 v0, 0x30

    .line 32
    .line 33
    invoke-direct {v3, v0}, Lf/w;-><init>(I)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Landroidx/lifecycle/x;

    .line 37
    .line 38
    const/16 v0, 0xb

    .line 39
    .line 40
    invoke-direct {v2, v0}, Landroidx/lifecycle/x;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, Loh/h;->Q(Le1/c;)Lu2/k;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v2, p0}, Landroidx/lifecycle/x;->W(Lu2/k;)V

    .line 48
    .line 49
    .line 50
    new-instance v1, Landroidx/lifecycle/x;

    .line 51
    .line 52
    const/16 p0, 0xb

    .line 53
    .line 54
    invoke-direct {v1, p0}, Landroidx/lifecycle/x;-><init>(I)V

    .line 55
    .line 56
    .line 57
    move-object v5, v4

    .line 58
    move-object v6, p1

    .line 59
    invoke-static/range {v1 .. v6}, Lf2/t;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/x;Lf/w;Lf2/q;Lf2/q;Lfg/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 63
    .line 64
    .line 65
    return-object v3

    .line 66
    :cond_1
    :goto_0
    :try_start_1
    sget-object p0, Lf/l;->a:Lf/w;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    move-object p0, v0

    .line 77
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 78
    .line 79
    .line 80
    throw p0
.end method

.method public static final c(Landroidx/lifecycle/x;Landroidx/lifecycle/x;Lf/w;Lf2/q;Lf2/q;Lfg/l;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p4

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/graphics/Region;

    .line 8
    .line 9
    move-object/from16 v2, p1

    .line 10
    .line 11
    iget-object v3, v2, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v7, v3

    .line 14
    check-cast v7, Landroid/graphics/Region;

    .line 15
    .line 16
    iget-object v3, v6, Lf2/q;->c:Lx1/f0;

    .line 17
    .line 18
    iget-object v4, v6, Lf2/q;->c:Lx1/f0;

    .line 19
    .line 20
    invoke-virtual {v3}, Lx1/f0;->H()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_8

    .line 25
    .line 26
    invoke-virtual {v4}, Lx1/f0;->G()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_8

    .line 31
    .line 32
    invoke-virtual {v7}, Landroid/graphics/Region;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_0
    invoke-virtual {v6}, Lf2/q;->m()Le1/c;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Le1/c;->f()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const/4 v8, 0x1

    .line 49
    if-eqz v5, :cond_4

    .line 50
    .line 51
    invoke-virtual {v6}, Lf2/q;->f()Lx1/z1;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const/4 v5, 0x0

    .line 56
    if-nez v3, :cond_1

    .line 57
    .line 58
    iget-object v3, v4, Lx1/f0;->L:Lx1/b1;

    .line 59
    .line 60
    iget-object v3, v3, Lx1/b1;->c:Lx1/r;

    .line 61
    .line 62
    invoke-static {v3}, Lv1/w;->h(Lv1/t;)Lv1/t;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-interface {v4, v3, v5}, Lv1/t;->k0(Lv1/t;Z)Le1/c;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    check-cast v3, Ly0/n;

    .line 72
    .line 73
    iget-object v3, v3, Ly0/n;->g:Ly0/n;

    .line 74
    .line 75
    iget-object v4, v6, Lf2/q;->d:Lf2/m;

    .line 76
    .line 77
    sget-object v9, Lf2/l;->b:Lf2/x;

    .line 78
    .line 79
    iget-object v4, v4, Lf2/m;->g:Lf/k0;

    .line 80
    .line 81
    invoke-virtual {v4, v9}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-nez v4, :cond_2

    .line 86
    .line 87
    const/4 v4, 0x0

    .line 88
    :cond_2
    if-eqz v4, :cond_3

    .line 89
    .line 90
    move v4, v8

    .line 91
    goto :goto_0

    .line 92
    :cond_3
    move v4, v5

    .line 93
    :goto_0
    invoke-static {v3, v4, v5}, Lx1/k;->i(Ly0/n;ZZ)Le1/c;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    :cond_4
    :goto_1
    invoke-static {v3}, Loh/h;->Q(Le1/c;)Lu2/k;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-virtual {v0, v9}, Landroidx/lifecycle/x;->W(Lu2/k;)V

    .line 102
    .line 103
    .line 104
    sget-object v3, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    .line 105
    .line 106
    invoke-virtual {v1, v7, v3}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_9

    .line 111
    .line 112
    iget v3, v6, Lf2/q;->f:I

    .line 113
    .line 114
    move-object/from16 v4, p3

    .line 115
    .line 116
    iget v5, v4, Lf2/q;->f:I

    .line 117
    .line 118
    const/4 v10, -0x1

    .line 119
    if-ne v3, v5, :cond_5

    .line 120
    .line 121
    move v3, v10

    .line 122
    :cond_5
    new-instance v5, Lf2/r;

    .line 123
    .line 124
    invoke-virtual {v1}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    new-instance v11, Lu2/k;

    .line 129
    .line 130
    iget v12, v1, Landroid/graphics/Rect;->left:I

    .line 131
    .line 132
    iget v13, v1, Landroid/graphics/Rect;->top:I

    .line 133
    .line 134
    iget v14, v1, Landroid/graphics/Rect;->right:I

    .line 135
    .line 136
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 137
    .line 138
    invoke-direct {v11, v12, v13, v14, v1}, Lu2/k;-><init>(IIII)V

    .line 139
    .line 140
    .line 141
    invoke-direct {v5, v6, v11}, Lf2/r;-><init>(Lf2/q;Lu2/k;)V

    .line 142
    .line 143
    .line 144
    move-object/from16 v1, p2

    .line 145
    .line 146
    invoke-virtual {v1, v3, v5}, Lf/w;->h(ILjava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    const/4 v3, 0x4

    .line 150
    invoke-static {v3, v6}, Lf2/q;->j(ILf2/q;)Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    sub-int/2addr v3, v8

    .line 159
    move v8, v3

    .line 160
    :goto_2
    if-ge v10, v8, :cond_7

    .line 161
    .line 162
    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    move-object/from16 v5, p5

    .line 167
    .line 168
    invoke-interface {v5, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    check-cast v3, Ljava/lang/Boolean;

    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_6

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_6
    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, Lf2/q;

    .line 186
    .line 187
    move-object v15, v2

    .line 188
    move-object v2, v1

    .line 189
    move-object v1, v15

    .line 190
    move-object v15, v4

    .line 191
    move-object v4, v3

    .line 192
    move-object v3, v15

    .line 193
    invoke-static/range {v0 .. v5}, Lf2/t;->c(Landroidx/lifecycle/x;Landroidx/lifecycle/x;Lf/w;Lf2/q;Lf2/q;Lfg/l;)V

    .line 194
    .line 195
    .line 196
    :goto_3
    add-int/lit8 v8, v8, -0x1

    .line 197
    .line 198
    move-object/from16 v0, p0

    .line 199
    .line 200
    move-object/from16 v2, p1

    .line 201
    .line 202
    move-object/from16 v1, p2

    .line 203
    .line 204
    move-object/from16 v4, p3

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_7
    invoke-static {v6}, Lf2/t;->h(Lf2/q;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_9

    .line 212
    .line 213
    iget v0, v9, Lu2/k;->a:I

    .line 214
    .line 215
    iget v1, v9, Lu2/k;->b:I

    .line 216
    .line 217
    iget v2, v9, Lu2/k;->c:I

    .line 218
    .line 219
    iget v3, v9, Lu2/k;->d:I

    .line 220
    .line 221
    sget-object v4, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 222
    .line 223
    move/from16 p1, v0

    .line 224
    .line 225
    move/from16 p2, v1

    .line 226
    .line 227
    move/from16 p3, v2

    .line 228
    .line 229
    move/from16 p4, v3

    .line 230
    .line 231
    move-object/from16 p5, v4

    .line 232
    .line 233
    move-object/from16 p0, v7

    .line 234
    .line 235
    invoke-virtual/range {p0 .. p5}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :cond_8
    :goto_4
    invoke-virtual {v6}, Lf2/q;->o()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_9

    .line 244
    .line 245
    invoke-static/range {p2 .. p4}, Lf2/t;->d(Lf/w;Lf2/q;Lf2/q;)V

    .line 246
    .line 247
    .line 248
    :cond_9
    return-void
.end method

.method public static final d(Lf/w;Lf2/q;Lf2/q;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lf2/q;->l()Lf2/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, Lf2/q;->c:Lx1/f0;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lx1/f0;->H()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lf2/q;->g()Le1/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object v0, Lf2/t;->a:Le1/c;

    .line 24
    .line 25
    :goto_0
    iget v1, p2, Lf2/q;->f:I

    .line 26
    .line 27
    iget p1, p1, Lf2/q;->f:I

    .line 28
    .line 29
    if-ne v1, p1, :cond_1

    .line 30
    .line 31
    const/4 v1, -0x1

    .line 32
    :cond_1
    new-instance p1, Lf2/r;

    .line 33
    .line 34
    invoke-static {v0}, Loh/h;->Q(Le1/c;)Lu2/k;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-direct {p1, p2, v0}, Lf2/r;-><init>(Lf2/q;Lu2/k;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1, p1}, Lf/w;->h(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static final e(Landroidx/lifecycle/x;Landroidx/lifecycle/x;Lf/w;Lf2/q;Lf2/q;Lfg/l;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v6, p4

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v5, p5

    .line 10
    .line 11
    iget v1, v3, Lf2/q;->f:I

    .line 12
    .line 13
    iget-object v4, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Landroid/graphics/Region;

    .line 16
    .line 17
    move-object/from16 v7, p1

    .line 18
    .line 19
    iget-object v8, v7, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v8, Landroid/graphics/Region;

    .line 22
    .line 23
    iget-object v9, v6, Lf2/q;->c:Lx1/f0;

    .line 24
    .line 25
    iget-object v10, v6, Lf2/q;->d:Lf2/m;

    .line 26
    .line 27
    iget-object v11, v6, Lf2/q;->c:Lx1/f0;

    .line 28
    .line 29
    iget v12, v6, Lf2/q;->f:I

    .line 30
    .line 31
    invoke-virtual {v9}, Lx1/f0;->H()Z

    .line 32
    .line 33
    .line 34
    move-result v9

    .line 35
    if-eqz v9, :cond_1

    .line 36
    .line 37
    invoke-virtual {v11}, Lx1/f0;->G()Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-nez v9, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v9, 0x0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    const/4 v9, 0x1

    .line 47
    :goto_1
    invoke-virtual {v8}, Landroid/graphics/Region;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v15

    .line 51
    if-eqz v15, :cond_2

    .line 52
    .line 53
    if-ne v12, v1, :cond_18

    .line 54
    .line 55
    :cond_2
    if-eqz v9, :cond_3

    .line 56
    .line 57
    invoke-virtual {v6}, Lf2/q;->o()Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-nez v9, :cond_3

    .line 62
    .line 63
    goto/16 :goto_13

    .line 64
    .line 65
    :cond_3
    invoke-virtual {v6}, Lf2/q;->m()Le1/c;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-static {v9}, Loh/h;->Q(Le1/c;)Lu2/k;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-virtual {v0, v9}, Landroidx/lifecycle/x;->W(Lu2/k;)V

    .line 74
    .line 75
    .line 76
    if-ne v12, v1, :cond_4

    .line 77
    .line 78
    const/4 v12, -0x1

    .line 79
    :cond_4
    sget-object v1, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    .line 80
    .line 81
    invoke-virtual {v4, v8, v1}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_16

    .line 86
    .line 87
    new-instance v1, Lf2/r;

    .line 88
    .line 89
    invoke-virtual {v4}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    const/16 v16, 0x1

    .line 94
    .line 95
    new-instance v14, Lu2/k;

    .line 96
    .line 97
    iget v15, v4, Landroid/graphics/Rect;->left:I

    .line 98
    .line 99
    iget v13, v4, Landroid/graphics/Rect;->top:I

    .line 100
    .line 101
    iget v0, v4, Landroid/graphics/Rect;->right:I

    .line 102
    .line 103
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 104
    .line 105
    invoke-direct {v14, v15, v13, v0, v4}, Lu2/k;-><init>(IIII)V

    .line 106
    .line 107
    .line 108
    invoke-direct {v1, v6, v14}, Lf2/r;-><init>(Lf2/q;Lu2/k;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v12, v1}, Lf/w;->h(ILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    const/4 v0, 0x4

    .line 115
    invoke-static {v0, v6}, Lf2/q;->j(ILf2/q;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v12

    .line 119
    iget-boolean v0, v10, Lf2/m;->i:Z

    .line 120
    .line 121
    if-eqz v0, :cond_e

    .line 122
    .line 123
    invoke-virtual {v6}, Lf2/q;->l()Lf2/q;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    :goto_2
    if-eqz v0, :cond_6

    .line 128
    .line 129
    iget-object v4, v0, Lf2/q;->d:Lf2/m;

    .line 130
    .line 131
    iget-object v4, v4, Lf2/m;->g:Lf/k0;

    .line 132
    .line 133
    sget-object v13, Lf2/u;->v:Lf2/x;

    .line 134
    .line 135
    invoke-virtual {v4, v13}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    if-nez v13, :cond_7

    .line 140
    .line 141
    sget-object v13, Lf2/u;->u:Lf2/x;

    .line 142
    .line 143
    invoke-virtual {v4, v13}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-eqz v4, :cond_5

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_5
    invoke-virtual {v0}, Lf2/q;->l()Lf2/q;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    goto :goto_2

    .line 155
    :cond_6
    const/4 v0, 0x0

    .line 156
    :cond_7
    :goto_3
    if-eqz v0, :cond_d

    .line 157
    .line 158
    invoke-virtual {v6}, Lf2/q;->d()Lx1/i1;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    if-eqz v4, :cond_9

    .line 163
    .line 164
    invoke-virtual {v4}, Lx1/i1;->r1()Ly0/n;

    .line 165
    .line 166
    .line 167
    move-result-object v13

    .line 168
    iget-boolean v13, v13, Ly0/n;->t:Z

    .line 169
    .line 170
    if-eqz v13, :cond_8

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_8
    const/4 v4, 0x0

    .line 174
    :goto_4
    if-eqz v4, :cond_9

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_9
    const/4 v4, 0x0

    .line 178
    :goto_5
    invoke-virtual {v0}, Lf2/q;->d()Lx1/i1;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-eqz v0, :cond_b

    .line 183
    .line 184
    invoke-virtual {v0}, Lx1/i1;->r1()Ly0/n;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    iget-boolean v13, v13, Ly0/n;->t:Z

    .line 189
    .line 190
    if-eqz v13, :cond_a

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_a
    const/4 v0, 0x0

    .line 194
    :goto_6
    if-eqz v0, :cond_b

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_b
    const/4 v0, 0x0

    .line 198
    :goto_7
    if-eqz v4, :cond_d

    .line 199
    .line 200
    if-nez v0, :cond_c

    .line 201
    .line 202
    goto :goto_8

    .line 203
    :cond_c
    const/4 v13, 0x0

    .line 204
    invoke-virtual {v0, v4, v13}, Lx1/i1;->k0(Lv1/t;Z)Le1/c;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    iget-wide v13, v0, Lv1/b1;->i:J

    .line 209
    .line 210
    invoke-static {v13, v14}, Lr9/e0;->q0(J)J

    .line 211
    .line 212
    .line 213
    move-result-wide v13

    .line 214
    const-wide/16 v1, 0x0

    .line 215
    .line 216
    invoke-static {v1, v2, v13, v14}, Lac/p;->a(JJ)Le1/c;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v4, v1}, Le1/c;->e(Le1/c;)Le1/c;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-virtual {v4, v1}, Le1/c;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    xor-int/lit8 v1, v1, 0x1

    .line 229
    .line 230
    goto :goto_9

    .line 231
    :cond_d
    :goto_8
    const/4 v1, 0x0

    .line 232
    :goto_9
    if-eqz v1, :cond_e

    .line 233
    .line 234
    move/from16 v1, v16

    .line 235
    .line 236
    goto :goto_a

    .line 237
    :cond_e
    const/4 v1, 0x0

    .line 238
    :goto_a
    if-eqz v1, :cond_13

    .line 239
    .line 240
    new-instance v1, Landroidx/lifecycle/x;

    .line 241
    .line 242
    const/16 v2, 0xb

    .line 243
    .line 244
    invoke-direct {v1, v2}, Landroidx/lifecycle/x;-><init>(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6}, Lf2/q;->f()Lx1/z1;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    if-nez v2, :cond_f

    .line 252
    .line 253
    iget-object v0, v11, Lx1/f0;->L:Lx1/b1;

    .line 254
    .line 255
    iget-object v0, v0, Lx1/b1;->c:Lx1/r;

    .line 256
    .line 257
    invoke-static {v0}, Lv1/w;->h(Lv1/t;)Lv1/t;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    const/4 v13, 0x0

    .line 262
    invoke-interface {v2, v0, v13}, Lv1/t;->k0(Lv1/t;Z)Le1/c;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    goto :goto_e

    .line 267
    :cond_f
    check-cast v2, Ly0/n;

    .line 268
    .line 269
    iget-object v2, v2, Ly0/n;->g:Ly0/n;

    .line 270
    .line 271
    sget-object v4, Lf2/l;->b:Lf2/x;

    .line 272
    .line 273
    iget-object v7, v10, Lf2/m;->g:Lf/k0;

    .line 274
    .line 275
    invoke-virtual {v7, v4}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    if-nez v4, :cond_10

    .line 280
    .line 281
    const/4 v0, 0x0

    .line 282
    goto :goto_b

    .line 283
    :cond_10
    move-object v0, v4

    .line 284
    :goto_b
    if-eqz v0, :cond_11

    .line 285
    .line 286
    move/from16 v13, v16

    .line 287
    .line 288
    :goto_c
    const/4 v0, 0x0

    .line 289
    goto :goto_d

    .line 290
    :cond_11
    const/4 v13, 0x0

    .line 291
    goto :goto_c

    .line 292
    :goto_d
    invoke-static {v2, v13, v0}, Lx1/k;->i(Ly0/n;ZZ)Le1/c;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    :goto_e
    invoke-static {v0}, Loh/h;->Q(Le1/c;)Lu2/k;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v1, v0}, Landroidx/lifecycle/x;->W(Lu2/k;)V

    .line 301
    .line 302
    .line 303
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    add-int/lit8 v0, v0, -0x1

    .line 308
    .line 309
    move v7, v0

    .line 310
    :goto_f
    const/4 v0, -0x1

    .line 311
    if-ge v0, v7, :cond_15

    .line 312
    .line 313
    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-interface {v5, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    check-cast v0, Ljava/lang/Boolean;

    .line 322
    .line 323
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-eqz v0, :cond_12

    .line 328
    .line 329
    goto :goto_10

    .line 330
    :cond_12
    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    move-object v4, v0

    .line 335
    check-cast v4, Lf2/q;

    .line 336
    .line 337
    new-instance v0, Landroidx/lifecycle/x;

    .line 338
    .line 339
    const/16 v2, 0xb

    .line 340
    .line 341
    invoke-direct {v0, v2}, Landroidx/lifecycle/x;-><init>(I)V

    .line 342
    .line 343
    .line 344
    move-object/from16 v2, p2

    .line 345
    .line 346
    invoke-static/range {v0 .. v5}, Lf2/t;->c(Landroidx/lifecycle/x;Landroidx/lifecycle/x;Lf/w;Lf2/q;Lf2/q;Lfg/l;)V

    .line 347
    .line 348
    .line 349
    :goto_10
    add-int/lit8 v7, v7, -0x1

    .line 350
    .line 351
    move-object/from16 v3, p3

    .line 352
    .line 353
    goto :goto_f

    .line 354
    :cond_13
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    add-int/lit8 v0, v0, -0x1

    .line 359
    .line 360
    move v10, v0

    .line 361
    :goto_11
    const/4 v0, -0x1

    .line 362
    if-ge v0, v10, :cond_15

    .line 363
    .line 364
    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-interface {v5, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    check-cast v0, Ljava/lang/Boolean;

    .line 373
    .line 374
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    if-eqz v0, :cond_14

    .line 379
    .line 380
    move-object/from16 v2, p2

    .line 381
    .line 382
    goto :goto_12

    .line 383
    :cond_14
    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    move-object v4, v0

    .line 388
    check-cast v4, Lf2/q;

    .line 389
    .line 390
    move-object/from16 v0, p0

    .line 391
    .line 392
    move-object/from16 v2, p2

    .line 393
    .line 394
    move-object/from16 v3, p3

    .line 395
    .line 396
    move-object v1, v7

    .line 397
    invoke-static/range {v0 .. v5}, Lf2/t;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/x;Lf/w;Lf2/q;Lf2/q;Lfg/l;)V

    .line 398
    .line 399
    .line 400
    :goto_12
    add-int/lit8 v10, v10, -0x1

    .line 401
    .line 402
    move-object/from16 v7, p1

    .line 403
    .line 404
    move-object/from16 v5, p5

    .line 405
    .line 406
    goto :goto_11

    .line 407
    :cond_15
    invoke-static {v6}, Lf2/t;->h(Lf2/q;)Z

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    if-eqz v0, :cond_18

    .line 412
    .line 413
    iget v0, v9, Lu2/k;->a:I

    .line 414
    .line 415
    iget v1, v9, Lu2/k;->b:I

    .line 416
    .line 417
    iget v2, v9, Lu2/k;->c:I

    .line 418
    .line 419
    iget v3, v9, Lu2/k;->d:I

    .line 420
    .line 421
    sget-object v4, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 422
    .line 423
    move/from16 p1, v0

    .line 424
    .line 425
    move/from16 p2, v1

    .line 426
    .line 427
    move/from16 p3, v2

    .line 428
    .line 429
    move/from16 p4, v3

    .line 430
    .line 431
    move-object/from16 p5, v4

    .line 432
    .line 433
    move-object/from16 p0, v8

    .line 434
    .line 435
    invoke-virtual/range {p0 .. p5}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    .line 436
    .line 437
    .line 438
    return-void

    .line 439
    :cond_16
    invoke-virtual {v6}, Lf2/q;->o()Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-eqz v0, :cond_17

    .line 444
    .line 445
    invoke-static/range {p2 .. p4}, Lf2/t;->d(Lf/w;Lf2/q;Lf2/q;)V

    .line 446
    .line 447
    .line 448
    return-void

    .line 449
    :cond_17
    const/4 v0, -0x1

    .line 450
    if-ne v12, v0, :cond_18

    .line 451
    .line 452
    new-instance v0, Lf2/r;

    .line 453
    .line 454
    invoke-virtual {v4}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    new-instance v3, Lu2/k;

    .line 459
    .line 460
    iget v4, v1, Landroid/graphics/Rect;->left:I

    .line 461
    .line 462
    iget v5, v1, Landroid/graphics/Rect;->top:I

    .line 463
    .line 464
    iget v7, v1, Landroid/graphics/Rect;->right:I

    .line 465
    .line 466
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 467
    .line 468
    invoke-direct {v3, v4, v5, v7, v1}, Lu2/k;-><init>(IIII)V

    .line 469
    .line 470
    .line 471
    invoke-direct {v0, v6, v3}, Lf2/r;-><init>(Lf2/q;Lu2/k;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2, v12, v0}, Lf/w;->h(ILjava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    :cond_18
    :goto_13
    return-void
.end method

.method public static final f(Lf2/m;Lf2/x;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lf2/m;->g:Lf/k0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    :cond_0
    return-object p0
.end method

.method public static final g(Lf2/q;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lf2/q;->d()Lx1/i1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lf2/q;->d:Lf2/m;

    .line 6
    .line 7
    iget-object p0, p0, Lf2/m;->g:Lf/k0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lx1/i1;->z1()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v1

    .line 18
    :goto_0
    if-nez v0, :cond_2

    .line 19
    .line 20
    sget-object v0, Lf2/u;->p:Lf2/x;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    sget-object v0, Lf2/u;->o:Lf2/x;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    return v1

    .line 38
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 39
    return p0
.end method

.method public static final h(Lf2/q;)Z
    .locals 14

    .line 1
    invoke-static {p0}, Lf2/t;->g(Lf2/q;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_4

    .line 7
    .line 8
    iget-object p0, p0, Lf2/q;->d:Lf2/m;

    .line 9
    .line 10
    iget-boolean v0, p0, Lf2/m;->i:Z

    .line 11
    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object p0, p0, Lf2/m;->g:Lf/k0;

    .line 15
    .line 16
    iget-object v0, p0, Lf/k0;->b:[Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v2, p0, Lf/k0;->c:[Ljava/lang/Object;

    .line 19
    .line 20
    iget-object p0, p0, Lf/k0;->a:[J

    .line 21
    .line 22
    array-length v3, p0

    .line 23
    add-int/lit8 v3, v3, -0x2

    .line 24
    .line 25
    if-ltz v3, :cond_4

    .line 26
    .line 27
    move v4, v1

    .line 28
    :goto_0
    aget-wide v5, p0, v4

    .line 29
    .line 30
    not-long v7, v5

    .line 31
    const/4 v9, 0x7

    .line 32
    shl-long/2addr v7, v9

    .line 33
    and-long/2addr v7, v5

    .line 34
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v7, v9

    .line 40
    cmp-long v7, v7, v9

    .line 41
    .line 42
    if-eqz v7, :cond_2

    .line 43
    .line 44
    sub-int v7, v4, v3

    .line 45
    .line 46
    not-int v7, v7

    .line 47
    ushr-int/lit8 v7, v7, 0x1f

    .line 48
    .line 49
    const/16 v8, 0x8

    .line 50
    .line 51
    rsub-int/lit8 v7, v7, 0x8

    .line 52
    .line 53
    move v9, v1

    .line 54
    :goto_1
    if-ge v9, v7, :cond_1

    .line 55
    .line 56
    const-wide/16 v10, 0xff

    .line 57
    .line 58
    and-long/2addr v10, v5

    .line 59
    const-wide/16 v12, 0x80

    .line 60
    .line 61
    cmp-long v10, v10, v12

    .line 62
    .line 63
    if-gez v10, :cond_0

    .line 64
    .line 65
    shl-int/lit8 v10, v4, 0x3

    .line 66
    .line 67
    add-int/2addr v10, v9

    .line 68
    aget-object v11, v0, v10

    .line 69
    .line 70
    aget-object v10, v2, v10

    .line 71
    .line 72
    check-cast v11, Lf2/x;

    .line 73
    .line 74
    iget-boolean v10, v11, Lf2/x;->c:Z

    .line 75
    .line 76
    if-eqz v10, :cond_0

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_0
    shr-long/2addr v5, v8

    .line 80
    add-int/lit8 v9, v9, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    if-ne v7, v8, :cond_4

    .line 84
    .line 85
    :cond_2
    if-eq v4, v3, :cond_4

    .line 86
    .line 87
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    :goto_2
    const/4 p0, 0x1

    .line 91
    return p0

    .line 92
    :cond_4
    return v1
.end method
