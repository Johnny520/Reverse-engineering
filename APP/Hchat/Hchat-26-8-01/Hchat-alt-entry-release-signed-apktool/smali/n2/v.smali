.class public final Ln2/v;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ln2/n;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lb5/c;

.field public final c:Ln2/w;

.field public d:Z

.field public e:Lfg/l;

.field public f:Lfg/l;

.field public g:Ln2/s;

.field public h:Ln2/j;

.field public final i:Ljava/util/ArrayList;

.field public final j:Ljava/lang/Object;

.field public k:Landroid/graphics/Rect;

.field public final l:Ln2/c;

.field public final m:Lj0/b;

.field public n:La1/a;


# direct methods
.method public constructor <init>(Landroid/view/View;Ly1/t;)V
    .locals 5

    .line 1
    new-instance v0, Lb5/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v1, Ld1/c0;

    .line 9
    .line 10
    const/16 v2, 0xa

    .line 11
    .line 12
    invoke-direct {v1, v0, v2}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Lsf/d;->h:Lsf/d;

    .line 16
    .line 17
    invoke-static {v2, v1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, v0, Lb5/c;->b:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v1, Landroidx/lifecycle/x;

    .line 24
    .line 25
    invoke-direct {v1, p1}, Landroidx/lifecycle/x;-><init>(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, v0, Lb5/c;->c:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v2, Ln2/w;

    .line 35
    .line 36
    invoke-direct {v2, v1}, Ln2/w;-><init>(Landroid/view/Choreographer;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Ln2/v;->a:Landroid/view/View;

    .line 43
    .line 44
    iput-object v0, p0, Ln2/v;->b:Lb5/c;

    .line 45
    .line 46
    iput-object v2, p0, Ln2/v;->c:Ln2/w;

    .line 47
    .line 48
    sget-object p1, Ln2/b;->j:Ln2/b;

    .line 49
    .line 50
    iput-object p1, p0, Ln2/v;->e:Lfg/l;

    .line 51
    .line 52
    sget-object p1, Ln2/b;->k:Ln2/b;

    .line 53
    .line 54
    iput-object p1, p0, Ln2/v;->f:Lfg/l;

    .line 55
    .line 56
    new-instance p1, Ln2/s;

    .line 57
    .line 58
    sget-wide v1, Li2/m0;->b:J

    .line 59
    .line 60
    const/4 v3, 0x4

    .line 61
    const-string v4, ""

    .line 62
    .line 63
    invoke-direct {p1, v3, v4, v1, v2}, Ln2/s;-><init>(ILjava/lang/String;J)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Ln2/v;->g:Ln2/s;

    .line 67
    .line 68
    sget-object p1, Ln2/j;->g:Ln2/j;

    .line 69
    .line 70
    iput-object p1, p0, Ln2/v;->h:Ln2/j;

    .line 71
    .line 72
    new-instance p1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Ln2/v;->i:Ljava/util/ArrayList;

    .line 78
    .line 79
    new-instance p1, Ld1/c0;

    .line 80
    .line 81
    const/16 v1, 0xb

    .line 82
    .line 83
    invoke-direct {p1, p0, v1}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 84
    .line 85
    .line 86
    sget-object v1, Lsf/d;->h:Lsf/d;

    .line 87
    .line 88
    invoke-static {v1, p1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, Ln2/v;->j:Ljava/lang/Object;

    .line 93
    .line 94
    new-instance p1, Ln2/c;

    .line 95
    .line 96
    invoke-direct {p1, p2, v0}, Ln2/c;-><init>(Ly1/t;Lb5/c;)V

    .line 97
    .line 98
    .line 99
    iput-object p1, p0, Ln2/v;->l:Ln2/c;

    .line 100
    .line 101
    new-instance p1, Lj0/b;

    .line 102
    .line 103
    const/16 p2, 0x10

    .line 104
    .line 105
    new-array p2, p2, [Ln2/u;

    .line 106
    .line 107
    invoke-direct {p1, p2}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iput-object p1, p0, Ln2/v;->m:Lj0/b;

    .line 111
    .line 112
    return-void
.end method


# virtual methods
.method public final a(Ln2/s;Ln2/j;Lb0/s;Lw/w;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ln2/v;->d:Z

    .line 3
    .line 4
    iput-object p1, p0, Ln2/v;->g:Ln2/s;

    .line 5
    .line 6
    iput-object p2, p0, Ln2/v;->h:Ln2/j;

    .line 7
    .line 8
    iput-object p3, p0, Ln2/v;->e:Lfg/l;

    .line 9
    .line 10
    iput-object p4, p0, Ln2/v;->f:Lfg/l;

    .line 11
    .line 12
    sget-object p1, Ln2/u;->g:Ln2/u;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ln2/v;->i(Ln2/u;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    sget-object v0, Ln2/u;->g:Ln2/u;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ln2/v;->i(Ln2/u;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    sget-object v0, Ln2/u;->i:Ln2/u;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ln2/v;->i(Ln2/u;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ln2/v;->d:Z

    .line 3
    .line 4
    sget-object v0, Ln2/b;->l:Ln2/b;

    .line 5
    .line 6
    iput-object v0, p0, Ln2/v;->e:Lfg/l;

    .line 7
    .line 8
    sget-object v0, Ln2/b;->m:Ln2/b;

    .line 9
    .line 10
    iput-object v0, p0, Ln2/v;->f:Lfg/l;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Ln2/v;->k:Landroid/graphics/Rect;

    .line 14
    .line 15
    sget-object v0, Ln2/u;->h:Ln2/u;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ln2/v;->i(Ln2/u;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final e(Ln2/s;Ln2/s;)V
    .locals 12

    .line 1
    iget-object v0, p0, Ln2/v;->g:Ln2/s;

    .line 2
    .line 3
    iget-wide v0, v0, Ln2/s;->b:J

    .line 4
    .line 5
    iget-wide v2, p2, Ln2/s;->b:J

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, Li2/m0;->b(JJ)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Ln2/v;->g:Ln2/s;

    .line 15
    .line 16
    iget-object v0, v0, Ln2/s;->c:Li2/m0;

    .line 17
    .line 18
    iget-object v2, p2, Ln2/s;->c:Li2/m0;

    .line 19
    .line 20
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 30
    :goto_1
    iput-object p2, p0, Ln2/v;->g:Ln2/s;

    .line 31
    .line 32
    iget-object v2, p0, Ln2/v;->i:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    move v3, v1

    .line 39
    :goto_2
    if-ge v3, v2, :cond_3

    .line 40
    .line 41
    iget-object v4, p0, Ln2/v;->i:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Ln2/o;

    .line 54
    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    iput-object p2, v4, Ln2/o;->d:Ln2/s;

    .line 58
    .line 59
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    iget-object v2, p0, Ln2/v;->l:Ln2/c;

    .line 63
    .line 64
    iget-object v3, v2, Ln2/c;->c:Ljava/lang/Object;

    .line 65
    .line 66
    monitor-enter v3

    .line 67
    const/4 v4, 0x0

    .line 68
    :try_start_0
    iput-object v4, v2, Ln2/c;->j:Ln2/s;

    .line 69
    .line 70
    iput-object v4, v2, Ln2/c;->l:Lb5/k;

    .line 71
    .line 72
    iput-object v4, v2, Ln2/c;->k:Li2/k0;

    .line 73
    .line 74
    sget-object v5, Ln2/b;->h:Ln2/b;

    .line 75
    .line 76
    iput-object v5, v2, Ln2/c;->m:Lfg/l;

    .line 77
    .line 78
    iput-object v4, v2, Ln2/c;->n:Le1/c;

    .line 79
    .line 80
    iput-object v4, v2, Ln2/c;->o:Le1/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    monitor-exit v3

    .line 83
    invoke-static {p1, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    const/4 v3, -0x1

    .line 88
    if-eqz v2, :cond_6

    .line 89
    .line 90
    if-eqz v0, :cond_e

    .line 91
    .line 92
    iget-object p1, p0, Ln2/v;->b:Lb5/c;

    .line 93
    .line 94
    iget-wide v0, p2, Ln2/s;->b:J

    .line 95
    .line 96
    invoke-static {v0, v1}, Li2/m0;->f(J)I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    iget-wide v0, p2, Ln2/s;->b:J

    .line 101
    .line 102
    invoke-static {v0, v1}, Li2/m0;->e(J)I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    iget-object p2, p0, Ln2/v;->g:Ln2/s;

    .line 107
    .line 108
    iget-object p2, p2, Ln2/s;->c:Li2/m0;

    .line 109
    .line 110
    if-eqz p2, :cond_4

    .line 111
    .line 112
    iget-wide v0, p2, Li2/m0;->a:J

    .line 113
    .line 114
    invoke-static {v0, v1}, Li2/m0;->f(J)I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    move v8, p2

    .line 119
    goto :goto_3

    .line 120
    :cond_4
    move v8, v3

    .line 121
    :goto_3
    iget-object p2, p0, Ln2/v;->g:Ln2/s;

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
    move-result v3

    .line 133
    :cond_5
    move v9, v3

    .line 134
    iget-object p2, p1, Lb5/c;->b:Ljava/lang/Object;

    .line 135
    .line 136
    invoke-interface {p2}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    move-object v4, p2

    .line 141
    check-cast v4, Landroid/view/inputmethod/InputMethodManager;

    .line 142
    .line 143
    iget-object p1, p1, Lb5/c;->a:Ljava/lang/Object;

    .line 144
    .line 145
    move-object v5, p1

    .line 146
    check-cast v5, Landroid/view/View;

    .line 147
    .line 148
    invoke-virtual/range {v4 .. v9}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_6
    if-eqz p1, :cond_8

    .line 153
    .line 154
    iget-object v0, p1, Ln2/s;->a:Li2/g;

    .line 155
    .line 156
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v2, p2, Ln2/s;->a:Li2/g;

    .line 159
    .line 160
    iget-object v2, v2, Li2/g;->h:Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_7

    .line 167
    .line 168
    iget-wide v4, p1, Ln2/s;->b:J

    .line 169
    .line 170
    iget-wide v6, p2, Ln2/s;->b:J

    .line 171
    .line 172
    invoke-static {v4, v5, v6, v7}, Li2/m0;->b(JJ)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_8

    .line 177
    .line 178
    iget-object p1, p1, Ln2/s;->c:Li2/m0;

    .line 179
    .line 180
    iget-object p2, p2, Ln2/s;->c:Li2/m0;

    .line 181
    .line 182
    invoke-static {p1, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-nez p1, :cond_8

    .line 187
    .line 188
    :cond_7
    iget-object p1, p0, Ln2/v;->b:Lb5/c;

    .line 189
    .line 190
    iget-object p2, p1, Lb5/c;->b:Ljava/lang/Object;

    .line 191
    .line 192
    invoke-interface {p2}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    check-cast p2, Landroid/view/inputmethod/InputMethodManager;

    .line 197
    .line 198
    iget-object p1, p1, Lb5/c;->a:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast p1, Landroid/view/View;

    .line 201
    .line 202
    invoke-virtual {p2, p1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :cond_8
    iget-object p1, p0, Ln2/v;->i:Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    :goto_4
    if-ge v1, p1, :cond_e

    .line 213
    .line 214
    iget-object p2, p0, Ln2/v;->i:Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 221
    .line 222
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    check-cast p2, Ln2/o;

    .line 227
    .line 228
    if-eqz p2, :cond_d

    .line 229
    .line 230
    iget-object v0, p0, Ln2/v;->g:Ln2/s;

    .line 231
    .line 232
    iget-object v2, p0, Ln2/v;->b:Lb5/c;

    .line 233
    .line 234
    iget-boolean v4, p2, Ln2/o;->h:Z

    .line 235
    .line 236
    if-nez v4, :cond_9

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_9
    iput-object v0, p2, Ln2/o;->d:Ln2/s;

    .line 240
    .line 241
    iget-boolean v4, p2, Ln2/o;->f:Z

    .line 242
    .line 243
    if-eqz v4, :cond_a

    .line 244
    .line 245
    iget p2, p2, Ln2/o;->e:I

    .line 246
    .line 247
    invoke-static {v0}, Lfb/v0;->N(Ln2/s;)Landroid/view/inputmethod/ExtractedText;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    iget-object v5, v2, Lb5/c;->b:Ljava/lang/Object;

    .line 252
    .line 253
    invoke-interface {v5}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    check-cast v5, Landroid/view/inputmethod/InputMethodManager;

    .line 258
    .line 259
    iget-object v6, v2, Lb5/c;->a:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v6, Landroid/view/View;

    .line 262
    .line 263
    invoke-virtual {v5, v6, p2, v4}, Landroid/view/inputmethod/InputMethodManager;->updateExtractedText(Landroid/view/View;ILandroid/view/inputmethod/ExtractedText;)V

    .line 264
    .line 265
    .line 266
    :cond_a
    iget-object p2, v0, Ln2/s;->c:Li2/m0;

    .line 267
    .line 268
    iget-wide v4, v0, Ln2/s;->b:J

    .line 269
    .line 270
    if-eqz p2, :cond_b

    .line 271
    .line 272
    iget-wide v6, p2, Li2/m0;->a:J

    .line 273
    .line 274
    invoke-static {v6, v7}, Li2/m0;->f(J)I

    .line 275
    .line 276
    .line 277
    move-result p2

    .line 278
    move v10, p2

    .line 279
    goto :goto_5

    .line 280
    :cond_b
    move v10, v3

    .line 281
    :goto_5
    iget-object p2, v0, Ln2/s;->c:Li2/m0;

    .line 282
    .line 283
    if-eqz p2, :cond_c

    .line 284
    .line 285
    iget-wide v6, p2, Li2/m0;->a:J

    .line 286
    .line 287
    invoke-static {v6, v7}, Li2/m0;->e(J)I

    .line 288
    .line 289
    .line 290
    move-result p2

    .line 291
    move v11, p2

    .line 292
    goto :goto_6

    .line 293
    :cond_c
    move v11, v3

    .line 294
    :goto_6
    invoke-static {v4, v5}, Li2/m0;->f(J)I

    .line 295
    .line 296
    .line 297
    move-result v8

    .line 298
    invoke-static {v4, v5}, Li2/m0;->e(J)I

    .line 299
    .line 300
    .line 301
    move-result v9

    .line 302
    iget-object p2, v2, Lb5/c;->b:Ljava/lang/Object;

    .line 303
    .line 304
    invoke-interface {p2}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object p2

    .line 308
    move-object v6, p2

    .line 309
    check-cast v6, Landroid/view/inputmethod/InputMethodManager;

    .line 310
    .line 311
    iget-object p2, v2, Lb5/c;->a:Ljava/lang/Object;

    .line 312
    .line 313
    move-object v7, p2

    .line 314
    check-cast v7, Landroid/view/View;

    .line 315
    .line 316
    invoke-virtual/range {v6 .. v11}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    .line 317
    .line 318
    .line 319
    :cond_d
    :goto_7
    add-int/lit8 v1, v1, 0x1

    .line 320
    .line 321
    goto :goto_4

    .line 322
    :cond_e
    return-void

    .line 323
    :catchall_0
    move-exception v0

    .line 324
    move-object p1, v0

    .line 325
    monitor-exit v3

    .line 326
    throw p1
.end method

.method public final f()V
    .locals 1

    .line 1
    sget-object v0, Ln2/u;->j:Ln2/u;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ln2/v;->i(Ln2/u;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(Ln2/s;Lb5/k;Li2/k0;Li0/c;Le1/c;Le1/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ln2/v;->l:Ln2/c;

    .line 2
    .line 3
    iget-object v1, v0, Ln2/c;->c:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iput-object p1, v0, Ln2/c;->j:Ln2/s;

    .line 7
    .line 8
    iput-object p2, v0, Ln2/c;->l:Lb5/k;

    .line 9
    .line 10
    iput-object p3, v0, Ln2/c;->k:Li2/k0;

    .line 11
    .line 12
    iput-object p4, v0, Ln2/c;->m:Lfg/l;

    .line 13
    .line 14
    iput-object p5, v0, Ln2/c;->n:Le1/c;

    .line 15
    .line 16
    iput-object p6, v0, Ln2/c;->o:Le1/c;

    .line 17
    .line 18
    iget-boolean p1, v0, Ln2/c;->e:Z

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    iget-boolean p1, v0, Ln2/c;->d:Z

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ln2/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    :cond_1
    monitor-exit v1

    .line 33
    return-void

    .line 34
    :goto_1
    monitor-exit v1

    .line 35
    throw p1
.end method

.method public final h(Le1/c;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    iget v1, p1, Le1/c;->a:F

    .line 4
    .line 5
    invoke-static {v1}, Lig/a;->X(F)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p1, Le1/c;->b:F

    .line 10
    .line 11
    invoke-static {v2}, Lig/a;->X(F)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget v3, p1, Le1/c;->c:F

    .line 16
    .line 17
    invoke-static {v3}, Lig/a;->X(F)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iget p1, p1, Le1/c;->d:F

    .line 22
    .line 23
    invoke-static {p1}, Lig/a;->X(F)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-direct {v0, v1, v2, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Ln2/v;->k:Landroid/graphics/Rect;

    .line 31
    .line 32
    iget-object p1, p0, Ln2/v;->i:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    iget-object p1, p0, Ln2/v;->k:Landroid/graphics/Rect;

    .line 41
    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    new-instance v0, Landroid/graphics/Rect;

    .line 45
    .line 46
    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Ln2/v;->a:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method

.method public final i(Ln2/u;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln2/v;->m:Lj0/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ln2/v;->n:La1/a;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    new-instance p1, La1/a;

    .line 11
    .line 12
    const/16 v0, 0x19

    .line 13
    .line 14
    invoke-direct {p1, p0, v0}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Ln2/v;->c:Ln2/w;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ln2/w;->execute(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ln2/v;->n:La1/a;

    .line 23
    .line 24
    :cond_0
    return-void
.end method
