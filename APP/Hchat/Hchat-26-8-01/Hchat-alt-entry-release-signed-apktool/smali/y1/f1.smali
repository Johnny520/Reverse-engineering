.class public final Ly1/f1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Li0/o;

.field public final c:Landroidx/lifecycle/q;

.field public final d:Lu3/c;

.field public final e:Lc9/a1;

.field public final f:Ld2/c;

.field public final g:Ld2/d;

.field public final h:Landroid/content/res/Configuration;

.field public final i:Li0/a1;

.field public final j:Ly1/g;

.field public final k:Ly1/p0;

.field public final l:Ly1/i;

.field public final m:Ly1/h;

.field public final n:Lm2/c;

.field public final o:Li0/a1;

.field public final p:Ln1/a;

.field public final q:Ly1/q0;

.field public final r:Lx1/h0;

.field public final s:Ly1/v1;

.field public final t:Lf1/v;

.field public u:I

.field public final v:Ld1/c0;

.field public final w:Ly1/e1;


# direct methods
.method public constructor <init>(Ly1/f1;Landroid/view/View;Li0/o;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v1, p1, Ly1/f1;->a:Landroid/view/View;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v1, v0

    .line 14
    :goto_0
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Ly1/f1;->a:Landroid/view/View;

    .line 26
    .line 27
    iput-object p3, p0, Ly1/f1;->b:Li0/o;

    .line 28
    .line 29
    iput-object p4, p0, Ly1/f1;->c:Landroidx/lifecycle/q;

    .line 30
    .line 31
    iput-object p5, p0, Ly1/f1;->d:Lu3/c;

    .line 32
    .line 33
    iput-object p6, p0, Ly1/f1;->e:Lc9/a1;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object p3, p1, Ly1/f1;->f:Ld2/c;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    new-instance p3, Ld2/c;

    .line 44
    .line 45
    invoke-direct {p3}, Ld2/c;-><init>()V

    .line 46
    .line 47
    .line 48
    :goto_1
    iput-object p3, p0, Ly1/f1;->f:Ld2/c;

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    iget-object p3, p1, Ly1/f1;->g:Ld2/d;

    .line 53
    .line 54
    if-nez p3, :cond_3

    .line 55
    .line 56
    :cond_2
    new-instance p3, Ld2/d;

    .line 57
    .line 58
    invoke-direct {p3}, Ld2/d;-><init>()V

    .line 59
    .line 60
    .line 61
    :cond_3
    iput-object p3, p0, Ly1/f1;->g:Ld2/d;

    .line 62
    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object p3, p1, Ly1/f1;->h:Landroid/content/res/Configuration;

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    new-instance p3, Landroid/content/res/Configuration;

    .line 72
    .line 73
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object p4

    .line 77
    invoke-virtual {p4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object p4

    .line 81
    invoke-virtual {p4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 82
    .line 83
    .line 84
    move-result-object p4

    .line 85
    invoke-direct {p3, p4}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 86
    .line 87
    .line 88
    :goto_2
    iput-object p3, p0, Ly1/f1;->h:Landroid/content/res/Configuration;

    .line 89
    .line 90
    if-eqz v1, :cond_5

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object p3, p1, Ly1/f1;->i:Li0/a1;

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    new-instance p4, Landroid/content/res/Configuration;

    .line 99
    .line 100
    invoke-direct {p4, p3}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p4}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    :goto_3
    iput-object p3, p0, Ly1/f1;->i:Li0/a1;

    .line 108
    .line 109
    if-eqz v1, :cond_6

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object p3, p1, Ly1/f1;->j:Ly1/g;

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_6
    new-instance p3, Ly1/g;

    .line 118
    .line 119
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object p4

    .line 123
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 124
    .line 125
    .line 126
    const-string p5, "accessibility"

    .line 127
    .line 128
    invoke-virtual {p4, p5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p4

    .line 132
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    check-cast p4, Landroid/view/accessibility/AccessibilityManager;

    .line 136
    .line 137
    :goto_4
    iput-object p3, p0, Ly1/f1;->j:Ly1/g;

    .line 138
    .line 139
    if-eqz v1, :cond_7

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object p3, p1, Ly1/f1;->k:Ly1/p0;

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_7
    new-instance p3, Ly1/p0;

    .line 148
    .line 149
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object p4

    .line 153
    invoke-direct {p3, p4}, Ly1/p0;-><init>(Landroid/content/Context;)V

    .line 154
    .line 155
    .line 156
    :goto_5
    iput-object p3, p0, Ly1/f1;->k:Ly1/p0;

    .line 157
    .line 158
    if-eqz v1, :cond_8

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    iget-object p3, p1, Ly1/f1;->l:Ly1/i;

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_8
    new-instance p3, Ly1/i;

    .line 167
    .line 168
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 169
    .line 170
    .line 171
    move-result-object p4

    .line 172
    invoke-direct {p3, p4}, Ly1/i;-><init>(Landroid/content/Context;)V

    .line 173
    .line 174
    .line 175
    :goto_6
    iput-object p3, p0, Ly1/f1;->l:Ly1/i;

    .line 176
    .line 177
    if-eqz v1, :cond_9

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    iget-object p3, p1, Ly1/f1;->m:Ly1/h;

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_9
    new-instance p4, Ly1/h;

    .line 186
    .line 187
    invoke-direct {p4, p3}, Ly1/h;-><init>(Ly1/i;)V

    .line 188
    .line 189
    .line 190
    move-object p3, p4

    .line 191
    :goto_7
    iput-object p3, p0, Ly1/f1;->m:Ly1/h;

    .line 192
    .line 193
    if-eqz v1, :cond_a

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    iget-object p3, p1, Ly1/f1;->n:Lm2/c;

    .line 199
    .line 200
    goto :goto_8

    .line 201
    :cond_a
    new-instance p3, Ly1/r1;

    .line 202
    .line 203
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 204
    .line 205
    .line 206
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 207
    .line 208
    .line 209
    :goto_8
    iput-object p3, p0, Ly1/f1;->n:Lm2/c;

    .line 210
    .line 211
    if-eqz v1, :cond_b

    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    iget-object p3, p1, Ly1/f1;->o:Li0/a1;

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_b
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 220
    .line 221
    .line 222
    move-result-object p3

    .line 223
    invoke-static {p3}, Lig/a;->k(Landroid/content/Context;)Lm2/e;

    .line 224
    .line 225
    .line 226
    move-result-object p3

    .line 227
    sget-object p4, Li0/e;->k:Li0/e;

    .line 228
    .line 229
    new-instance p5, Li0/j1;

    .line 230
    .line 231
    invoke-direct {p5, p3, p4}, Li0/j1;-><init>(Ljava/lang/Object;Li0/e;)V

    .line 232
    .line 233
    .line 234
    move-object p3, p5

    .line 235
    :goto_9
    iput-object p3, p0, Ly1/f1;->o:Li0/a1;

    .line 236
    .line 237
    if-eqz p1, :cond_c

    .line 238
    .line 239
    iget-object v0, p1, Ly1/f1;->a:Landroid/view/View;

    .line 240
    .line 241
    :cond_c
    if-ne p2, v0, :cond_d

    .line 242
    .line 243
    iget-object p3, p1, Ly1/f1;->p:Ln1/a;

    .line 244
    .line 245
    goto :goto_a

    .line 246
    :cond_d
    new-instance p3, Ln1/c;

    .line 247
    .line 248
    invoke-direct {p3, p2}, Ln1/c;-><init>(Landroid/view/View;)V

    .line 249
    .line 250
    .line 251
    :goto_a
    iput-object p3, p0, Ly1/f1;->p:Ln1/a;

    .line 252
    .line 253
    if-eqz v1, :cond_e

    .line 254
    .line 255
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    iget-object p2, p1, Ly1/f1;->q:Ly1/q0;

    .line 259
    .line 260
    goto :goto_b

    .line 261
    :cond_e
    new-instance p3, Ly1/q0;

    .line 262
    .line 263
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 264
    .line 265
    .line 266
    move-result-object p2

    .line 267
    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    invoke-direct {p3, p2}, Ly1/q0;-><init>(Landroid/view/ViewConfiguration;)V

    .line 272
    .line 273
    .line 274
    move-object p2, p3

    .line 275
    :goto_b
    iput-object p2, p0, Ly1/f1;->q:Ly1/q0;

    .line 276
    .line 277
    if-eqz p1, :cond_f

    .line 278
    .line 279
    iget-object p2, p1, Ly1/f1;->r:Lx1/h0;

    .line 280
    .line 281
    if-nez p2, :cond_10

    .line 282
    .line 283
    :cond_f
    new-instance p2, Lx1/h0;

    .line 284
    .line 285
    invoke-direct {p2}, Lx1/h0;-><init>()V

    .line 286
    .line 287
    .line 288
    :cond_10
    iput-object p2, p0, Ly1/f1;->r:Lx1/h0;

    .line 289
    .line 290
    new-instance p2, Ly1/v1;

    .line 291
    .line 292
    invoke-direct {p2}, Ly1/v1;-><init>()V

    .line 293
    .line 294
    .line 295
    iput-object p2, p0, Ly1/f1;->s:Ly1/v1;

    .line 296
    .line 297
    if-eqz p1, :cond_11

    .line 298
    .line 299
    iget-object p1, p1, Ly1/f1;->t:Lf1/v;

    .line 300
    .line 301
    if-nez p1, :cond_12

    .line 302
    .line 303
    :cond_11
    new-instance p1, Lf1/v;

    .line 304
    .line 305
    invoke-direct {p1}, Lf1/v;-><init>()V

    .line 306
    .line 307
    .line 308
    :cond_12
    iput-object p1, p0, Ly1/f1;->t:Lf1/v;

    .line 309
    .line 310
    new-instance p1, Ld1/c0;

    .line 311
    .line 312
    const/16 p2, 0x14

    .line 313
    .line 314
    invoke-direct {p1, p0, p2}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 315
    .line 316
    .line 317
    iput-object p1, p0, Ly1/f1;->v:Ld1/c0;

    .line 318
    .line 319
    new-instance p1, Ly1/e1;

    .line 320
    .line 321
    invoke-direct {p1, p0}, Ly1/e1;-><init>(Ly1/f1;)V

    .line 322
    .line 323
    .line 324
    iput-object p1, p0, Ly1/f1;->w:Ly1/e1;

    .line 325
    .line 326
    return-void
.end method


# virtual methods
.method public final a(Ly1/t;Lfg/p;Li0/h0;I)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v5, p4

    .line 10
    .line 11
    const v0, 0x761ec9f

    .line 12
    .line 13
    .line 14
    invoke-virtual {v4, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v4, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

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
    or-int/2addr v0, v5

    .line 27
    invoke-virtual {v4, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_1

    .line 32
    .line 33
    const/16 v6, 0x20

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v6, 0x10

    .line 37
    .line 38
    :goto_1
    or-int/2addr v0, v6

    .line 39
    invoke-virtual {v4, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    const/16 v6, 0x100

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v6, 0x80

    .line 49
    .line 50
    :goto_2
    or-int/2addr v0, v6

    .line 51
    and-int/lit16 v6, v0, 0x93

    .line 52
    .line 53
    const/16 v7, 0x92

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x1

    .line 57
    if-eq v6, v7, :cond_3

    .line 58
    .line 59
    move v6, v9

    .line 60
    goto :goto_3

    .line 61
    :cond_3
    move v6, v8

    .line 62
    :goto_3
    and-int/2addr v0, v9

    .line 63
    invoke-virtual {v4, v0, v6}, Li0/h0;->S(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1a

    .line 68
    .line 69
    const v0, 0x7f06004a

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    instance-of v7, v6, Ljava/util/Set;

    .line 77
    .line 78
    const/4 v10, 0x0

    .line 79
    if-eqz v7, :cond_5

    .line 80
    .line 81
    instance-of v7, v6, Lhg/a;

    .line 82
    .line 83
    if-eqz v7, :cond_4

    .line 84
    .line 85
    instance-of v7, v6, Lhg/e;

    .line 86
    .line 87
    if-eqz v7, :cond_5

    .line 88
    .line 89
    :cond_4
    check-cast v6, Ljava/util/Set;

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_5
    move-object v6, v10

    .line 93
    :goto_4
    if-nez v6, :cond_a

    .line 94
    .line 95
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    instance-of v7, v6, Landroid/view/View;

    .line 100
    .line 101
    if-eqz v7, :cond_6

    .line 102
    .line 103
    check-cast v6, Landroid/view/View;

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_6
    move-object v6, v10

    .line 107
    :goto_5
    if-eqz v6, :cond_7

    .line 108
    .line 109
    invoke-virtual {v6, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    goto :goto_6

    .line 114
    :cond_7
    move-object v0, v10

    .line 115
    :goto_6
    instance-of v6, v0, Ljava/util/Set;

    .line 116
    .line 117
    if-eqz v6, :cond_9

    .line 118
    .line 119
    instance-of v6, v0, Lhg/a;

    .line 120
    .line 121
    if-eqz v6, :cond_8

    .line 122
    .line 123
    instance-of v6, v0, Lhg/e;

    .line 124
    .line 125
    if-eqz v6, :cond_9

    .line 126
    .line 127
    :cond_8
    move-object v6, v0

    .line 128
    check-cast v6, Ljava/util/Set;

    .line 129
    .line 130
    goto :goto_7

    .line 131
    :cond_9
    move-object v6, v10

    .line 132
    :cond_a
    :goto_7
    if-eqz v6, :cond_b

    .line 133
    .line 134
    invoke-virtual {v4}, Li0/h0;->y()Lx0/c;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-interface {v6, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    iput-boolean v9, v4, Li0/h0;->q:Z

    .line 142
    .line 143
    iput-boolean v9, v4, Li0/h0;->C:Z

    .line 144
    .line 145
    iget-object v0, v4, Li0/h0;->c:Ll0/h;

    .line 146
    .line 147
    invoke-virtual {v0}, Ll0/h;->c()V

    .line 148
    .line 149
    .line 150
    iget-object v0, v4, Li0/h0;->H:Ll0/h;

    .line 151
    .line 152
    invoke-virtual {v0}, Ll0/h;->c()V

    .line 153
    .line 154
    .line 155
    iget-object v0, v4, Li0/h0;->I:Ll0/k;

    .line 156
    .line 157
    iget-object v7, v0, Ll0/k;->a:Ll0/h;

    .line 158
    .line 159
    iget-object v11, v7, Ll0/h;->p:Ljava/util/HashMap;

    .line 160
    .line 161
    iput-object v11, v0, Ll0/k;->e:Ljava/util/HashMap;

    .line 162
    .line 163
    iget-object v7, v7, Ll0/h;->q:Lf/w;

    .line 164
    .line 165
    iput-object v7, v0, Ll0/k;->f:Lf/w;

    .line 166
    .line 167
    :cond_b
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    sget-object v7, Li0/l;->a:Li0/e;

    .line 172
    .line 173
    if-ne v0, v7, :cond_15

    .line 174
    .line 175
    iget-object v0, v1, Ly1/f1;->d:Lu3/c;

    .line 176
    .line 177
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    check-cast v7, Landroid/view/View;

    .line 185
    .line 186
    const v11, 0x7f060033

    .line 187
    .line 188
    .line 189
    invoke-virtual {v7, v11}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    instance-of v12, v11, Ljava/lang/String;

    .line 194
    .line 195
    if-eqz v12, :cond_c

    .line 196
    .line 197
    check-cast v11, Ljava/lang/String;

    .line 198
    .line 199
    goto :goto_8

    .line 200
    :cond_c
    move-object v11, v10

    .line 201
    :goto_8
    if-nez v11, :cond_d

    .line 202
    .line 203
    invoke-virtual {v7}, Landroid/view/View;->getId()I

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    :cond_d
    const-string v7, "SaveableStateRegistry:"

    .line 212
    .line 213
    invoke-static {v7, v11}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    invoke-interface {v0}, Lu3/c;->b()Lm/a;

    .line 218
    .line 219
    .line 220
    move-result-object v11

    .line 221
    invoke-virtual {v11, v7}, Lm/a;->l(Ljava/lang/String;)Landroid/os/Bundle;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    if-eqz v0, :cond_e

    .line 226
    .line 227
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 228
    .line 229
    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 233
    .line 234
    .line 235
    move-result-object v13

    .line 236
    check-cast v13, Ljava/lang/Iterable;

    .line 237
    .line 238
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object v13

    .line 242
    :goto_9
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v14

    .line 246
    if-eqz v14, :cond_f

    .line 247
    .line 248
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v14

    .line 252
    check-cast v14, Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {v0, v14}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 255
    .line 256
    .line 257
    move-result-object v15

    .line 258
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-interface {v12, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    goto :goto_9

    .line 265
    :cond_e
    move-object v12, v10

    .line 266
    :cond_f
    sget-object v0, Ly1/o;->k:Ly1/o;

    .line 267
    .line 268
    sget-object v13, Lv0/h;->a:Li0/m2;

    .line 269
    .line 270
    new-instance v13, Lv0/g;

    .line 271
    .line 272
    invoke-direct {v13, v12, v0}, Lv0/g;-><init>(Ljava/util/Map;Lfg/l;)V

    .line 273
    .line 274
    .line 275
    iget-object v0, v11, Lm/a;->h:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v0, Lpa/c;

    .line 278
    .line 279
    iget-object v12, v0, Lpa/c;->e:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v12, Luf/d;

    .line 282
    .line 283
    monitor-enter v12

    .line 284
    :try_start_0
    iget-object v0, v0, Lpa/c;->f:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v14

    .line 300
    if-eqz v14, :cond_12

    .line 301
    .line 302
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v14

    .line 306
    check-cast v14, Ljava/util/Map$Entry;

    .line 307
    .line 308
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v15

    .line 312
    check-cast v15, Ljava/lang/String;

    .line 313
    .line 314
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v14

    .line 318
    check-cast v14, Ly1/l1;

    .line 319
    .line 320
    invoke-static {v15, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 324
    if-eqz v15, :cond_11

    .line 325
    .line 326
    goto :goto_a

    .line 327
    :cond_11
    move-object v14, v10

    .line 328
    :goto_a
    if-eqz v14, :cond_10

    .line 329
    .line 330
    move-object v10, v14

    .line 331
    goto :goto_b

    .line 332
    :catchall_0
    move-exception v0

    .line 333
    goto :goto_e

    .line 334
    :cond_12
    :goto_b
    monitor-exit v12

    .line 335
    if-eqz v10, :cond_13

    .line 336
    .line 337
    goto :goto_d

    .line 338
    :cond_13
    :try_start_1
    new-instance v0, Ly1/l1;

    .line 339
    .line 340
    invoke-direct {v0, v13}, Ly1/l1;-><init>(Lv0/g;)V

    .line 341
    .line 342
    .line 343
    iget-object v10, v11, Lm/a;->h:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v10, Lpa/c;

    .line 346
    .line 347
    iget-object v12, v10, Lpa/c;->e:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v12, Luf/d;

    .line 350
    .line 351
    monitor-enter v12
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 352
    :try_start_2
    iget-object v14, v10, Lpa/c;->f:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v14, Ljava/util/LinkedHashMap;

    .line 355
    .line 356
    invoke-interface {v14, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v14

    .line 360
    if-nez v14, :cond_14

    .line 361
    .line 362
    iget-object v10, v10, Lpa/c;->f:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v10, Ljava/util/LinkedHashMap;

    .line 365
    .line 366
    invoke-interface {v10, v7, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 367
    .line 368
    .line 369
    :try_start_3
    monitor-exit v12
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0

    .line 370
    move v8, v9

    .line 371
    goto :goto_d

    .line 372
    :catchall_1
    move-exception v0

    .line 373
    goto :goto_c

    .line 374
    :cond_14
    :try_start_4
    const-string v0, "SavedStateProvider with the given key is already registered"

    .line 375
    .line 376
    new-instance v9, Ljava/lang/IllegalArgumentException;

    .line 377
    .line 378
    invoke-direct {v9, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    throw v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 382
    :goto_c
    :try_start_5
    monitor-exit v12

    .line 383
    throw v0
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_0

    .line 384
    :catch_0
    :goto_d
    new-instance v0, Ly1/k1;

    .line 385
    .line 386
    new-instance v9, Ly1/m1;

    .line 387
    .line 388
    invoke-direct {v9, v8, v11, v7}, Ly1/m1;-><init>(ZLm/a;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-direct {v0, v13, v9}, Ly1/k1;-><init>(Lv0/g;Ly1/m1;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v4, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    goto :goto_f

    .line 398
    :goto_e
    monitor-exit v12

    .line 399
    throw v0

    .line 400
    :cond_15
    :goto_f
    check-cast v0, Ly1/k1;

    .line 401
    .line 402
    sget-object v7, Lsf/n;->a:Lsf/n;

    .line 403
    .line 404
    invoke-virtual {v4, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v8

    .line 408
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v9

    .line 412
    if-nez v8, :cond_16

    .line 413
    .line 414
    sget-object v8, Li0/l;->a:Li0/e;

    .line 415
    .line 416
    if-ne v9, v8, :cond_17

    .line 417
    .line 418
    :cond_16
    new-instance v9, Lb1/f;

    .line 419
    .line 420
    const/16 v8, 0x18

    .line 421
    .line 422
    invoke-direct {v9, v0, v8}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v4, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    :cond_17
    check-cast v9, Lfg/l;

    .line 429
    .line 430
    invoke-static {v7, v9, v4}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 431
    .line 432
    .line 433
    sget-object v7, Ly1/h1;->w:Li0/u;

    .line 434
    .line 435
    invoke-virtual {v4, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v8

    .line 439
    check-cast v8, Ljava/lang/Boolean;

    .line 440
    .line 441
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 442
    .line 443
    .line 444
    move-result v8

    .line 445
    invoke-virtual {v2}, Ly1/t;->getScrollCaptureInProgress$ui()Z

    .line 446
    .line 447
    .line 448
    move-result v9

    .line 449
    or-int/2addr v8, v9

    .line 450
    invoke-virtual {v2}, Ly1/t;->getView()Landroid/view/View;

    .line 451
    .line 452
    .line 453
    move-result-object v9

    .line 454
    invoke-virtual {v4, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v9

    .line 458
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v10

    .line 462
    if-nez v9, :cond_18

    .line 463
    .line 464
    sget-object v9, Li0/l;->a:Li0/e;

    .line 465
    .line 466
    if-ne v10, v9, :cond_19

    .line 467
    .line 468
    :cond_18
    new-instance v10, Ly1/n2;

    .line 469
    .line 470
    invoke-virtual {v2}, Ly1/t;->getView()Landroid/view/View;

    .line 471
    .line 472
    .line 473
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v4, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    :cond_19
    check-cast v10, Ly1/n2;

    .line 480
    .line 481
    sget-object v9, Lo3/a;->a:Li0/p1;

    .line 482
    .line 483
    iget-object v11, v1, Ly1/f1;->c:Landroidx/lifecycle/q;

    .line 484
    .line 485
    invoke-virtual {v9, v11}, Li0/p1;->a(Ljava/lang/Object;)Li0/q1;

    .line 486
    .line 487
    .line 488
    move-result-object v12

    .line 489
    sget-object v9, Lv3/a;->a:Li0/p1;

    .line 490
    .line 491
    iget-object v11, v1, Ly1/f1;->d:Lu3/c;

    .line 492
    .line 493
    invoke-virtual {v9, v11}, Li0/p1;->a(Ljava/lang/Object;)Li0/q1;

    .line 494
    .line 495
    .line 496
    move-result-object v13

    .line 497
    sget-object v9, Ly1/i0;->d:Li0/m2;

    .line 498
    .line 499
    iget-object v11, v1, Ly1/f1;->f:Ld2/c;

    .line 500
    .line 501
    invoke-virtual {v9, v11}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 502
    .line 503
    .line 504
    move-result-object v14

    .line 505
    sget-object v9, Ly1/i0;->e:Li0/m2;

    .line 506
    .line 507
    iget-object v11, v1, Ly1/f1;->g:Ld2/d;

    .line 508
    .line 509
    invoke-virtual {v9, v11}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 510
    .line 511
    .line 512
    move-result-object v15

    .line 513
    sget-object v9, Ly1/i0;->b:Li0/m2;

    .line 514
    .line 515
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 516
    .line 517
    .line 518
    move-result-object v11

    .line 519
    invoke-virtual {v9, v11}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 520
    .line 521
    .line 522
    move-result-object v16

    .line 523
    sget-object v9, Lx0/g;->a:Li0/m2;

    .line 524
    .line 525
    invoke-virtual {v9, v6}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 526
    .line 527
    .line 528
    move-result-object v17

    .line 529
    sget-object v6, Ly1/i0;->a:Li0/u;

    .line 530
    .line 531
    invoke-virtual {v2}, Ly1/t;->getConfiguration()Landroid/content/res/Configuration;

    .line 532
    .line 533
    .line 534
    move-result-object v9

    .line 535
    invoke-virtual {v6, v9}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 536
    .line 537
    .line 538
    move-result-object v18

    .line 539
    sget-object v6, Lv0/h;->a:Li0/m2;

    .line 540
    .line 541
    invoke-virtual {v6, v0}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 542
    .line 543
    .line 544
    move-result-object v19

    .line 545
    sget-object v0, Ly1/i0;->f:Li0/m2;

    .line 546
    .line 547
    invoke-virtual {v2}, Ly1/t;->getView()Landroid/view/View;

    .line 548
    .line 549
    .line 550
    move-result-object v6

    .line 551
    invoke-virtual {v0, v6}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 552
    .line 553
    .line 554
    move-result-object v20

    .line 555
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-virtual {v7, v0}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 560
    .line 561
    .line 562
    move-result-object v21

    .line 563
    sget-object v0, Ly1/h1;->t:Li0/m2;

    .line 564
    .line 565
    invoke-virtual {v2}, Ly1/t;->getViewConfiguration()Ly1/l2;

    .line 566
    .line 567
    .line 568
    move-result-object v6

    .line 569
    invoke-virtual {v0, v6}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 570
    .line 571
    .line 572
    move-result-object v22

    .line 573
    sget-object v0, Li0/l0;->a:Li0/u;

    .line 574
    .line 575
    invoke-virtual {v0, v10}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 576
    .line 577
    .line 578
    move-result-object v23

    .line 579
    filled-new-array/range {v12 .. v23}, [Li0/q1;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    new-instance v6, Ly1/d1;

    .line 584
    .line 585
    invoke-direct {v6, v2, v1, v3}, Ly1/d1;-><init>(Ly1/t;Ly1/f1;Lfg/p;)V

    .line 586
    .line 587
    .line 588
    const v7, 0x4e86c15f

    .line 589
    .line 590
    .line 591
    invoke-static {v7, v6, v4}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 592
    .line 593
    .line 594
    move-result-object v6

    .line 595
    const/16 v7, 0x38

    .line 596
    .line 597
    invoke-static {v0, v6, v4, v7}, Li0/r;->b([Li0/q1;Lfg/p;Li0/h0;I)V

    .line 598
    .line 599
    .line 600
    goto :goto_10

    .line 601
    :cond_1a
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 602
    .line 603
    .line 604
    :goto_10
    invoke-virtual {v4}, Li0/h0;->t()Li0/r1;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    if-eqz v0, :cond_1b

    .line 609
    .line 610
    new-instance v4, Ly1/d1;

    .line 611
    .line 612
    invoke-direct {v4, v1, v2, v3, v5}, Ly1/d1;-><init>(Ly1/f1;Ly1/t;Lfg/p;I)V

    .line 613
    .line 614
    .line 615
    iput-object v4, v0, Li0/r1;->d:Lfg/p;

    .line 616
    .line 617
    :cond_1b
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget v0, p0, Ly1/f1;->u:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Ly1/f1;->u:I

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "ComposeViewContext"

    .line 10
    .line 11
    const-string v1, "View count has dropped below 0"

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Ly1/f1;->u:I

    .line 18
    .line 19
    :cond_0
    iget v0, p0, Ly1/f1;->u:I

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Ly1/f1;->a:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, p0, Ly1/f1;->w:Ly1/e1;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Ly1/f1;->s:Ly1/v1;

    .line 35
    .line 36
    iget-object v3, v1, Ly1/v1;->b:Li0/j1;

    .line 37
    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    iput-object v3, v1, Ly1/v1;->a:Lfg/a;

    .line 42
    .line 43
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->removeOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    return-void
.end method

.method public final c()V
    .locals 5

    .line 1
    iget v0, p0, Ly1/f1;->u:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Ly1/f1;->u:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Ly1/f1;->a:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Ly1/f1;->w:Ly1/e1;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p0, v1}, Ly1/f1;->d(Landroid/content/res/Configuration;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->hasWindowFocus()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget-object v3, p0, Ly1/f1;->s:Ly1/v1;

    .line 36
    .line 37
    iget-object v4, v3, Ly1/v1;->c:Li0/j1;

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v4, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v3, Ly1/v1;->b:Li0/j1;

    .line 47
    .line 48
    iget-object v4, p0, Ly1/f1;->v:Ld1/c0;

    .line 49
    .line 50
    if-nez v1, :cond_0

    .line 51
    .line 52
    iput-object v4, v3, Ly1/v1;->a:Lfg/a;

    .line 53
    .line 54
    :cond_0
    if-eqz v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {v4}, Ld1/c0;->invoke()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v1, v3}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->addOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    return-void
.end method

.method public final d(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ly1/f1;->h:Landroid/content/res/Configuration;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/content/res/Configuration;->updateFrom(Landroid/content/res/Configuration;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v1, p0, Ly1/f1;->f:Ld2/c;

    .line 10
    .line 11
    iget-object v1, v1, Ld2/c;->a:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ld2/a;

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget-object v1, p0, Ly1/f1;->i:Li0/a1;

    .line 50
    .line 51
    new-instance v2, Landroid/content/res/Configuration;

    .line 52
    .line 53
    invoke-direct {v2, p1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Ly1/f1;->g:Ld2/d;

    .line 60
    .line 61
    monitor-enter p1

    .line 62
    :try_start_0
    iget-object v1, p1, Ld2/d;->a:Lf/w;

    .line 63
    .line 64
    invoke-virtual {v1}, Lf/w;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    monitor-exit p1

    .line 68
    const/high16 p1, 0x10000000

    .line 69
    .line 70
    and-int/2addr p1, v0

    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    iget-object p1, p0, Ly1/f1;->o:Li0/a1;

    .line 74
    .line 75
    iget-object v1, p0, Ly1/f1;->a:Landroid/view/View;

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v1}, Lig/a;->k(Landroid/content/Context;)Lm2/e;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-interface {p1, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    const p1, -0x5000e280

    .line 89
    .line 90
    .line 91
    and-int/2addr p1, v0

    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    iget-object p1, p0, Ly1/f1;->s:Ly1/v1;

    .line 95
    .line 96
    iget-object v0, p0, Ly1/f1;->v:Ld1/c0;

    .line 97
    .line 98
    iget-object p1, p1, Ly1/v1;->b:Li0/j1;

    .line 99
    .line 100
    if-eqz p1, :cond_2

    .line 101
    .line 102
    invoke-virtual {v0}, Ld1/c0;->invoke()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {p1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :catchall_0
    move-exception v0

    .line 111
    monitor-exit p1

    .line 112
    throw v0

    .line 113
    :cond_2
    return-void
.end method
