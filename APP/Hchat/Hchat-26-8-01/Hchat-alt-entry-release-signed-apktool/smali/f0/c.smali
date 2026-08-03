.class public final Lf0/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ln2/n;


# instance fields
.field public a:Lf0/p;

.field public b:Lqg/e1;

.field public c:Lf0/u;

.field public d:Ltg/r;


# virtual methods
.method public final a(Ln2/s;Ln2/j;Lb0/s;Lw/w;)V
    .locals 7

    .line 1
    new-instance v0, Leb/o;

    .line 2
    .line 3
    const/4 v6, 0x1

    .line 4
    move-object v2, p0

    .line 5
    move-object v1, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    invoke-direct/range {v0 .. v6}, Leb/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lf0/c;->j(Leb/o;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lf0/c;->j(Leb/o;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf0/c;->a:Lf0/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Ly1/h1;->q:Li0/m2;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ly1/g2;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast v0, Ly1/i1;

    .line 16
    .line 17
    invoke-virtual {v0}, Ly1/i1;->b()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 12

    .line 1
    iget-object v0, p0, Lf0/c;->b:Lqg/e1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, Lf0/c;->b:Lqg/e1;

    .line 10
    .line 11
    invoke-virtual {p0}, Lf0/c;->i()Ltg/n;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, Ltg/r;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    invoke-virtual {v1}, Ltg/r;->n()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    iget v0, v1, Ltg/r;->q:I

    .line 26
    .line 27
    int-to-long v4, v0

    .line 28
    add-long/2addr v2, v4

    .line 29
    iget-wide v4, v1, Ltg/r;->p:J

    .line 30
    .line 31
    invoke-virtual {v1}, Ltg/r;->n()J

    .line 32
    .line 33
    .line 34
    move-result-wide v6

    .line 35
    iget v0, v1, Ltg/r;->q:I

    .line 36
    .line 37
    int-to-long v8, v0

    .line 38
    add-long/2addr v6, v8

    .line 39
    invoke-virtual {v1}, Ltg/r;->n()J

    .line 40
    .line 41
    .line 42
    move-result-wide v8

    .line 43
    iget v0, v1, Ltg/r;->q:I

    .line 44
    .line 45
    int-to-long v10, v0

    .line 46
    add-long/2addr v8, v10

    .line 47
    iget v0, v1, Ltg/r;->r:I

    .line 48
    .line 49
    int-to-long v10, v0

    .line 50
    add-long/2addr v8, v10

    .line 51
    invoke-virtual/range {v1 .. v9}, Ltg/r;->t(JJJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    monitor-exit v1

    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    monitor-exit v1

    .line 58
    throw v0

    .line 59
    :cond_1
    return-void
.end method

.method public final e(Ln2/s;Ln2/s;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lf0/c;->c:Lf0/u;

    .line 2
    .line 3
    if-eqz v0, :cond_e

    .line 4
    .line 5
    iget-object v1, v0, Lf0/u;->h:Ln2/s;

    .line 6
    .line 7
    iget-wide v1, v1, Ln2/s;->b:J

    .line 8
    .line 9
    iget-wide v3, p2, Ln2/s;->b:J

    .line 10
    .line 11
    invoke-static {v1, v2, v3, v4}, Li2/m0;->b(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    iget-object v1, v0, Lf0/u;->h:Ln2/s;

    .line 19
    .line 20
    iget-object v1, v1, Ln2/s;->c:Li2/m0;

    .line 21
    .line 22
    iget-object v3, p2, Ln2/s;->c:Li2/m0;

    .line 23
    .line 24
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v1, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 34
    :goto_1
    iput-object p2, v0, Lf0/u;->h:Ln2/s;

    .line 35
    .line 36
    iget-object v3, v0, Lf0/u;->j:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    move v4, v2

    .line 43
    :goto_2
    if-ge v4, v3, :cond_3

    .line 44
    .line 45
    iget-object v5, v0, Lf0/u;->j:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Ljava/lang/ref/WeakReference;

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    check-cast v5, Lf0/v;

    .line 58
    .line 59
    if-eqz v5, :cond_2

    .line 60
    .line 61
    iput-object p2, v5, Lf0/v;->g:Ln2/s;

    .line 62
    .line 63
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    iget-object v3, v0, Lf0/u;->m:Lf0/r;

    .line 67
    .line 68
    iget-object v4, v3, Lf0/r;->c:Ljava/lang/Object;

    .line 69
    .line 70
    monitor-enter v4

    .line 71
    const/4 v5, 0x0

    .line 72
    :try_start_0
    iput-object v5, v3, Lf0/r;->j:Ln2/s;

    .line 73
    .line 74
    iput-object v5, v3, Lf0/r;->l:Lb5/k;

    .line 75
    .line 76
    iput-object v5, v3, Lf0/r;->k:Li2/k0;

    .line 77
    .line 78
    iput-object v5, v3, Lf0/r;->m:Le1/c;

    .line 79
    .line 80
    iput-object v5, v3, Lf0/r;->n:Le1/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    monitor-exit v4

    .line 83
    invoke-static {p1, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    const/4 v4, -0x1

    .line 88
    if-eqz v3, :cond_6

    .line 89
    .line 90
    if-eqz v1, :cond_e

    .line 91
    .line 92
    iget-object p1, v0, Lf0/u;->b:Lf0/n;

    .line 93
    .line 94
    iget-wide v1, p2, Ln2/s;->b:J

    .line 95
    .line 96
    invoke-static {v1, v2}, Li2/m0;->f(J)I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    iget-wide v1, p2, Ln2/s;->b:J

    .line 101
    .line 102
    invoke-static {v1, v2}, Li2/m0;->e(J)I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    iget-object p2, v0, Lf0/u;->h:Ln2/s;

    .line 107
    .line 108
    iget-object p2, p2, Ln2/s;->c:Li2/m0;

    .line 109
    .line 110
    if-eqz p2, :cond_4

    .line 111
    .line 112
    iget-wide v1, p2, Li2/m0;->a:J

    .line 113
    .line 114
    invoke-static {v1, v2}, Li2/m0;->f(J)I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    move v9, p2

    .line 119
    goto :goto_3

    .line 120
    :cond_4
    move v9, v4

    .line 121
    :goto_3
    iget-object p2, v0, Lf0/u;->h:Ln2/s;

    .line 122
    .line 123
    iget-object p2, p2, Ln2/s;->c:Li2/m0;

    .line 124
    .line 125
    if-eqz p2, :cond_5

    .line 126
    .line 127
    iget-wide v0, p2, Li2/m0;->a:J

    .line 128
    .line 129
    invoke-static {v0, v1}, Li2/m0;->e(J)I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    :cond_5
    move v10, v4

    .line 134
    invoke-virtual {p1}, Lf0/n;->a()Landroid/view/inputmethod/InputMethodManager;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    iget-object v6, p1, Lf0/n;->b:Landroid/view/View;

    .line 139
    .line 140
    invoke-virtual/range {v5 .. v10}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_6
    if-eqz p1, :cond_8

    .line 145
    .line 146
    iget-object v1, p1, Ln2/s;->a:Li2/g;

    .line 147
    .line 148
    iget-object v1, v1, Li2/g;->h:Ljava/lang/String;

    .line 149
    .line 150
    iget-object v3, p2, Ln2/s;->a:Li2/g;

    .line 151
    .line 152
    iget-object v3, v3, Li2/g;->h:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_7

    .line 159
    .line 160
    iget-wide v5, p1, Ln2/s;->b:J

    .line 161
    .line 162
    iget-wide v7, p2, Ln2/s;->b:J

    .line 163
    .line 164
    invoke-static {v5, v6, v7, v8}, Li2/m0;->b(JJ)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_8

    .line 169
    .line 170
    iget-object p1, p1, Ln2/s;->c:Li2/m0;

    .line 171
    .line 172
    iget-object p2, p2, Ln2/s;->c:Li2/m0;

    .line 173
    .line 174
    invoke-static {p1, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-nez p1, :cond_8

    .line 179
    .line 180
    :cond_7
    iget-object p1, v0, Lf0/u;->b:Lf0/n;

    .line 181
    .line 182
    invoke-virtual {p1}, Lf0/n;->a()Landroid/view/inputmethod/InputMethodManager;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    iget-object p1, p1, Lf0/n;->b:Landroid/view/View;

    .line 187
    .line 188
    invoke-virtual {p2, p1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_8
    iget-object p1, v0, Lf0/u;->j:Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    :goto_4
    if-ge v2, p1, :cond_e

    .line 199
    .line 200
    iget-object p2, v0, Lf0/u;->j:Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 207
    .line 208
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    check-cast p2, Lf0/v;

    .line 213
    .line 214
    if-eqz p2, :cond_d

    .line 215
    .line 216
    iget-object v1, v0, Lf0/u;->h:Ln2/s;

    .line 217
    .line 218
    iget-object v3, v0, Lf0/u;->b:Lf0/n;

    .line 219
    .line 220
    iget-boolean v5, p2, Lf0/v;->k:Z

    .line 221
    .line 222
    if-nez v5, :cond_9

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_9
    iput-object v1, p2, Lf0/v;->g:Ln2/s;

    .line 226
    .line 227
    iget-boolean v5, p2, Lf0/v;->i:Z

    .line 228
    .line 229
    if-eqz v5, :cond_a

    .line 230
    .line 231
    iget p2, p2, Lf0/v;->h:I

    .line 232
    .line 233
    invoke-static {v1}, Lf0/q;->d(Ln2/s;)Landroid/view/inputmethod/ExtractedText;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    invoke-virtual {v3}, Lf0/n;->a()Landroid/view/inputmethod/InputMethodManager;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    iget-object v7, v3, Lf0/n;->b:Landroid/view/View;

    .line 242
    .line 243
    invoke-virtual {v6, v7, p2, v5}, Landroid/view/inputmethod/InputMethodManager;->updateExtractedText(Landroid/view/View;ILandroid/view/inputmethod/ExtractedText;)V

    .line 244
    .line 245
    .line 246
    :cond_a
    iget-object p2, v1, Ln2/s;->c:Li2/m0;

    .line 247
    .line 248
    iget-wide v5, v1, Ln2/s;->b:J

    .line 249
    .line 250
    if-eqz p2, :cond_b

    .line 251
    .line 252
    iget-wide v7, p2, Li2/m0;->a:J

    .line 253
    .line 254
    invoke-static {v7, v8}, Li2/m0;->f(J)I

    .line 255
    .line 256
    .line 257
    move-result p2

    .line 258
    move v11, p2

    .line 259
    goto :goto_5

    .line 260
    :cond_b
    move v11, v4

    .line 261
    :goto_5
    iget-object p2, v1, Ln2/s;->c:Li2/m0;

    .line 262
    .line 263
    if-eqz p2, :cond_c

    .line 264
    .line 265
    iget-wide v7, p2, Li2/m0;->a:J

    .line 266
    .line 267
    invoke-static {v7, v8}, Li2/m0;->e(J)I

    .line 268
    .line 269
    .line 270
    move-result p2

    .line 271
    move v12, p2

    .line 272
    goto :goto_6

    .line 273
    :cond_c
    move v12, v4

    .line 274
    :goto_6
    invoke-static {v5, v6}, Li2/m0;->f(J)I

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    invoke-static {v5, v6}, Li2/m0;->e(J)I

    .line 279
    .line 280
    .line 281
    move-result v10

    .line 282
    invoke-virtual {v3}, Lf0/n;->a()Landroid/view/inputmethod/InputMethodManager;

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    iget-object v8, v3, Lf0/n;->b:Landroid/view/View;

    .line 287
    .line 288
    invoke-virtual/range {v7 .. v12}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    .line 289
    .line 290
    .line 291
    :cond_d
    :goto_7
    add-int/lit8 v2, v2, 0x1

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :catchall_0
    move-exception v0

    .line 295
    move-object p1, v0

    .line 296
    monitor-exit v4

    .line 297
    throw p1

    .line 298
    :cond_e
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf0/c;->a:Lf0/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Ly1/h1;->q:Li0/m2;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ly1/g2;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast v0, Ly1/i1;

    .line 16
    .line 17
    invoke-virtual {v0}, Ly1/i1;->a()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final g(Ln2/s;Lb5/k;Li2/k0;Li0/c;Le1/c;Le1/c;)V
    .locals 1

    .line 1
    iget-object p4, p0, Lf0/c;->c:Lf0/u;

    .line 2
    .line 3
    if-eqz p4, :cond_2

    .line 4
    .line 5
    iget-object p4, p4, Lf0/u;->m:Lf0/r;

    .line 6
    .line 7
    iget-object v0, p4, Lf0/r;->c:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iput-object p1, p4, Lf0/r;->j:Ln2/s;

    .line 11
    .line 12
    iput-object p2, p4, Lf0/r;->l:Lb5/k;

    .line 13
    .line 14
    iput-object p3, p4, Lf0/r;->k:Li2/k0;

    .line 15
    .line 16
    iput-object p5, p4, Lf0/r;->m:Le1/c;

    .line 17
    .line 18
    iput-object p6, p4, Lf0/r;->n:Le1/c;

    .line 19
    .line 20
    iget-boolean p1, p4, Lf0/r;->e:Z

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    iget-boolean p1, p4, Lf0/r;->d:Z

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    invoke-virtual {p4}, Lf0/r;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    :cond_1
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :goto_1
    monitor-exit v0

    .line 37
    throw p1

    .line 38
    :cond_2
    return-void
.end method

.method public final h(Le1/c;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lf0/c;->c:Lf0/u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Landroid/graphics/Rect;

    .line 6
    .line 7
    iget v2, p1, Le1/c;->a:F

    .line 8
    .line 9
    invoke-static {v2}, Lig/a;->X(F)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget v3, p1, Le1/c;->b:F

    .line 14
    .line 15
    invoke-static {v3}, Lig/a;->X(F)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    iget v4, p1, Le1/c;->c:F

    .line 20
    .line 21
    invoke-static {v4}, Lig/a;->X(F)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    iget p1, p1, Le1/c;->d:F

    .line 26
    .line 27
    invoke-static {p1}, Lig/a;->X(F)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-direct {v1, v2, v3, v4, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 32
    .line 33
    .line 34
    iput-object v1, v0, Lf0/u;->l:Landroid/graphics/Rect;

    .line 35
    .line 36
    iget-object p1, v0, Lf0/u;->j:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    iget-object p1, v0, Lf0/u;->l:Landroid/graphics/Rect;

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    iget-object v0, v0, Lf0/u;->a:Landroid/view/View;

    .line 49
    .line 50
    new-instance v1, Landroid/graphics/Rect;

    .line 51
    .line 52
    invoke-direct {v1, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void
.end method

.method public final i()Ltg/n;
    .locals 2

    .line 1
    iget-object v0, p0, Lf0/c;->d:Ltg/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    sget-boolean v0, Le0/e;->a:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return-object v0

    .line 12
    :cond_1
    sget-object v0, Lsg/a;->i:Lsg/a;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-static {v1, v0}, Ltg/s;->a(ILsg/a;)Ltg/r;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lf0/c;->d:Ltg/r;

    .line 20
    .line 21
    return-object v0
.end method

.method public final j(Leb/o;)V
    .locals 6

    .line 1
    iget-object v3, p0, Lf0/c;->a:Lf0/p;

    .line 2
    .line 3
    if-nez v3, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lci/e;

    .line 7
    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    move-object v2, p0

    .line 11
    move-object v1, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 13
    .line 14
    .line 15
    iget-boolean p1, v3, Ly0/n;->t:Z

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {v3}, Ly0/n;->Y0()Lqg/t;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance v1, Lci/j;

    .line 25
    .line 26
    const/4 v5, 0x4

    .line 27
    invoke-direct {v1, v3, v0, v4, v5}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-static {p1, v4, v1, v0}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    :goto_0
    iput-object v4, v2, Lf0/c;->b:Lqg/e1;

    .line 36
    .line 37
    return-void
.end method

.method public final k(Lf0/p;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf0/c;->a:Lf0/p;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    if-nez v0, :cond_1

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "Expected textInputModifierNode to be "

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p1, " but was "

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lf0/c;->a:Lf0/p;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, Lo/b;->c(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 p1, 0x0

    .line 38
    iput-object p1, p0, Lf0/c;->a:Lf0/p;

    .line 39
    .line 40
    return-void
.end method
