.class public final Llx;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lyx;

.field public final c:Lia1;

.field public final d:Ltc2;

.field public final e:Llb3;

.field public final f:Lvx0;

.field public final g:Ll92;

.field public final h:Landroid/content/res/Configuration;

.field public final i:Lxk1;

.field public final j:La6;

.field public final k:Lz8;

.field public final l:Lj6;

.field public final m:Li6;

.field public final n:Lwl0;

.field public final o:Lxk1;

.field public final p:Lbs0;

.field public final q:Lzb;

.field public final r:Lt61;

.field public final s:Lk91;

.field public final t:Ltp;

.field public u:I

.field public final v:Lkx;


# direct methods
.method public constructor <init>(Llx;Landroid/view/View;Lyx;Lia1;Ltc2;Llb3;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v1, p1, Llx;->a:Landroid/view/View;

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
    invoke-static {v1, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Llx;->a:Landroid/view/View;

    .line 26
    .line 27
    iput-object p3, p0, Llx;->b:Lyx;

    .line 28
    .line 29
    iput-object p4, p0, Llx;->c:Lia1;

    .line 30
    .line 31
    iput-object p5, p0, Llx;->d:Ltc2;

    .line 32
    .line 33
    iput-object p6, p0, Llx;->e:Llb3;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object p3, p1, Llx;->f:Lvx0;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    new-instance p3, Lvx0;

    .line 44
    .line 45
    invoke-direct {p3}, Lvx0;-><init>()V

    .line 46
    .line 47
    .line 48
    :goto_1
    iput-object p3, p0, Llx;->f:Lvx0;

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    iget-object p3, p1, Llx;->g:Ll92;

    .line 53
    .line 54
    if-nez p3, :cond_3

    .line 55
    .line 56
    :cond_2
    new-instance p3, Ll92;

    .line 57
    .line 58
    invoke-direct {p3}, Ll92;-><init>()V

    .line 59
    .line 60
    .line 61
    :cond_3
    iput-object p3, p0, Llx;->g:Ll92;

    .line 62
    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object p3, p1, Llx;->h:Landroid/content/res/Configuration;

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
    iput-object p3, p0, Llx;->h:Landroid/content/res/Configuration;

    .line 89
    .line 90
    if-eqz v1, :cond_5

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object p3, p1, Llx;->i:Lxk1;

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
    invoke-static {p4}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    :goto_3
    iput-object p3, p0, Llx;->i:Lxk1;

    .line 108
    .line 109
    if-eqz v1, :cond_6

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object p3, p1, Llx;->j:La6;

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_6
    new-instance p3, La6;

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
    iput-object p3, p0, Llx;->j:La6;

    .line 138
    .line 139
    if-eqz v1, :cond_7

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object p3, p1, Llx;->k:Lz8;

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_7
    new-instance p3, Lz8;

    .line 148
    .line 149
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    const/4 p4, 0x1

    .line 153
    invoke-direct {p3, p4}, Lz8;-><init>(I)V

    .line 154
    .line 155
    .line 156
    :goto_5
    iput-object p3, p0, Llx;->k:Lz8;

    .line 157
    .line 158
    if-eqz v1, :cond_8

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    iget-object p3, p1, Llx;->l:Lj6;

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_8
    new-instance p3, Lj6;

    .line 167
    .line 168
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 169
    .line 170
    .line 171
    move-result-object p4

    .line 172
    invoke-direct {p3, p4}, Lj6;-><init>(Landroid/content/Context;)V

    .line 173
    .line 174
    .line 175
    :goto_6
    iput-object p3, p0, Llx;->l:Lj6;

    .line 176
    .line 177
    if-eqz v1, :cond_9

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    iget-object p3, p1, Llx;->m:Li6;

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_9
    new-instance p4, Li6;

    .line 186
    .line 187
    invoke-direct {p4, p3}, Li6;-><init>(Lj6;)V

    .line 188
    .line 189
    .line 190
    move-object p3, p4

    .line 191
    :goto_7
    iput-object p3, p0, Llx;->m:Li6;

    .line 192
    .line 193
    if-eqz v1, :cond_a

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    iget-object p3, p1, Llx;->n:Lwl0;

    .line 199
    .line 200
    goto :goto_8

    .line 201
    :cond_a
    new-instance p3, Lz8;

    .line 202
    .line 203
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 204
    .line 205
    .line 206
    const/4 p4, 0x0

    .line 207
    invoke-direct {p3, p4}, Lz8;-><init>(I)V

    .line 208
    .line 209
    .line 210
    :goto_8
    iput-object p3, p0, Llx;->n:Lwl0;

    .line 211
    .line 212
    if-eqz v1, :cond_b

    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    iget-object p3, p1, Llx;->o:Lxk1;

    .line 218
    .line 219
    goto :goto_9

    .line 220
    :cond_b
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 221
    .line 222
    .line 223
    move-result-object p3

    .line 224
    invoke-static {p3}, Leu;->D(Landroid/content/Context;)Lyl0;

    .line 225
    .line 226
    .line 227
    move-result-object p3

    .line 228
    sget-object p4, Lsn;->P:Lsn;

    .line 229
    .line 230
    new-instance p5, Lnx1;

    .line 231
    .line 232
    invoke-direct {p5, p3, p4}, Lnx1;-><init>(Ljava/lang/Object;Lks2;)V

    .line 233
    .line 234
    .line 235
    move-object p3, p5

    .line 236
    :goto_9
    iput-object p3, p0, Llx;->o:Lxk1;

    .line 237
    .line 238
    if-eqz p1, :cond_c

    .line 239
    .line 240
    iget-object v0, p1, Llx;->a:Landroid/view/View;

    .line 241
    .line 242
    :cond_c
    if-ne p2, v0, :cond_d

    .line 243
    .line 244
    iget-object p3, p1, Llx;->p:Lbs0;

    .line 245
    .line 246
    goto :goto_a

    .line 247
    :cond_d
    new-instance p3, Lb02;

    .line 248
    .line 249
    invoke-direct {p3, p2}, Lb02;-><init>(Landroid/view/View;)V

    .line 250
    .line 251
    .line 252
    :goto_a
    iput-object p3, p0, Llx;->p:Lbs0;

    .line 253
    .line 254
    if-eqz v1, :cond_e

    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    iget-object p2, p1, Llx;->q:Lzb;

    .line 260
    .line 261
    goto :goto_b

    .line 262
    :cond_e
    new-instance p3, Lzb;

    .line 263
    .line 264
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 265
    .line 266
    .line 267
    move-result-object p2

    .line 268
    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    invoke-direct {p3, p2}, Lzb;-><init>(Landroid/view/ViewConfiguration;)V

    .line 273
    .line 274
    .line 275
    move-object p2, p3

    .line 276
    :goto_b
    iput-object p2, p0, Llx;->q:Lzb;

    .line 277
    .line 278
    if-eqz p1, :cond_f

    .line 279
    .line 280
    iget-object p2, p1, Llx;->r:Lt61;

    .line 281
    .line 282
    if-nez p2, :cond_10

    .line 283
    .line 284
    :cond_f
    new-instance p2, Lt61;

    .line 285
    .line 286
    invoke-direct {p2}, Lt61;-><init>()V

    .line 287
    .line 288
    .line 289
    :cond_10
    iput-object p2, p0, Llx;->r:Lt61;

    .line 290
    .line 291
    new-instance p2, Lk91;

    .line 292
    .line 293
    invoke-direct {p2}, Lk91;-><init>()V

    .line 294
    .line 295
    .line 296
    iput-object p2, p0, Llx;->s:Lk91;

    .line 297
    .line 298
    if-eqz p1, :cond_11

    .line 299
    .line 300
    iget-object p1, p1, Llx;->t:Ltp;

    .line 301
    .line 302
    if-nez p1, :cond_12

    .line 303
    .line 304
    :cond_11
    new-instance p1, Ltp;

    .line 305
    .line 306
    invoke-direct {p1}, Ltp;-><init>()V

    .line 307
    .line 308
    .line 309
    :cond_12
    iput-object p1, p0, Llx;->t:Ltp;

    .line 310
    .line 311
    new-instance p1, Lea;

    .line 312
    .line 313
    const/4 p2, 0x6

    .line 314
    invoke-direct {p1, p2, p0}, Lea;-><init>(ILjava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    new-instance p1, Lkx;

    .line 318
    .line 319
    invoke-direct {p1, p0}, Lkx;-><init>(Llx;)V

    .line 320
    .line 321
    .line 322
    iput-object p1, p0, Llx;->v:Lkx;

    .line 323
    .line 324
    return-void
.end method


# virtual methods
.method public final a(Lb7;Lmn0;Lpx;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p3

    .line 10
    .line 11
    check-cast v4, Lgo0;

    .line 12
    .line 13
    const v5, 0x761ec9f

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v5}, Lgo0;->X(I)Lgo0;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    const/4 v5, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v5, 0x2

    .line 28
    :goto_0
    or-int/2addr v5, v3

    .line 29
    invoke-virtual {v4, v2}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    const/16 v6, 0x20

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v6, 0x10

    .line 39
    .line 40
    :goto_1
    or-int/2addr v5, v6

    .line 41
    invoke-virtual {v4, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_2

    .line 46
    .line 47
    const/16 v6, 0x100

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v6, 0x80

    .line 51
    .line 52
    :goto_2
    or-int/2addr v5, v6

    .line 53
    and-int/lit16 v6, v5, 0x93

    .line 54
    .line 55
    const/16 v7, 0x92

    .line 56
    .line 57
    const/4 v9, 0x1

    .line 58
    if-eq v6, v7, :cond_3

    .line 59
    .line 60
    move v6, v9

    .line 61
    goto :goto_3

    .line 62
    :cond_3
    const/4 v6, 0x0

    .line 63
    :goto_3
    and-int/2addr v5, v9

    .line 64
    invoke-virtual {v4, v5, v6}, Lgo0;->O(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_15

    .line 69
    .line 70
    const v5, 0x79080045

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    instance-of v7, v6, Ljava/util/Set;

    .line 78
    .line 79
    const/4 v10, 0x0

    .line 80
    if-eqz v7, :cond_5

    .line 81
    .line 82
    instance-of v7, v6, Lq41;

    .line 83
    .line 84
    if-eqz v7, :cond_4

    .line 85
    .line 86
    instance-of v7, v6, Lt41;

    .line 87
    .line 88
    if-eqz v7, :cond_5

    .line 89
    .line 90
    :cond_4
    check-cast v6, Ljava/util/Set;

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    move-object v6, v10

    .line 94
    :goto_4
    if-nez v6, :cond_a

    .line 95
    .line 96
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    instance-of v7, v6, Landroid/view/View;

    .line 101
    .line 102
    if-eqz v7, :cond_6

    .line 103
    .line 104
    check-cast v6, Landroid/view/View;

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_6
    move-object v6, v10

    .line 108
    :goto_5
    if-eqz v6, :cond_7

    .line 109
    .line 110
    invoke-virtual {v6, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    goto :goto_6

    .line 115
    :cond_7
    move-object v5, v10

    .line 116
    :goto_6
    instance-of v6, v5, Ljava/util/Set;

    .line 117
    .line 118
    if-eqz v6, :cond_9

    .line 119
    .line 120
    instance-of v6, v5, Lq41;

    .line 121
    .line 122
    if-eqz v6, :cond_8

    .line 123
    .line 124
    instance-of v6, v5, Lt41;

    .line 125
    .line 126
    if-eqz v6, :cond_9

    .line 127
    .line 128
    :cond_8
    move-object v6, v5

    .line 129
    check-cast v6, Ljava/util/Set;

    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_9
    move-object v6, v10

    .line 133
    :cond_a
    :goto_7
    if-eqz v6, :cond_b

    .line 134
    .line 135
    invoke-virtual {v4}, Lgo0;->w()Lay;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-interface {v6, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    iput-boolean v9, v4, Lgo0;->q:Z

    .line 143
    .line 144
    iput-boolean v9, v4, Lgo0;->C:Z

    .line 145
    .line 146
    iget-object v5, v4, Lgo0;->c:Lqr2;

    .line 147
    .line 148
    invoke-virtual {v5}, Lqr2;->b()V

    .line 149
    .line 150
    .line 151
    iget-object v5, v4, Lgo0;->H:Lqr2;

    .line 152
    .line 153
    invoke-virtual {v5}, Lqr2;->b()V

    .line 154
    .line 155
    .line 156
    iget-object v5, v4, Lgo0;->I:Ltr2;

    .line 157
    .line 158
    iget-object v7, v5, Ltr2;->a:Lqr2;

    .line 159
    .line 160
    iget-object v11, v7, Lqr2;->q:Ljava/util/HashMap;

    .line 161
    .line 162
    iput-object v11, v5, Ltr2;->e:Ljava/util/HashMap;

    .line 163
    .line 164
    iget-object v7, v7, Lqr2;->r:Lzj1;

    .line 165
    .line 166
    iput-object v7, v5, Ltr2;->f:Lzj1;

    .line 167
    .line 168
    :cond_b
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    iget-object v7, v0, Llx;->d:Ltc2;

    .line 173
    .line 174
    sget-object v11, Lnx;->a:Leb;

    .line 175
    .line 176
    if-ne v5, v11, :cond_10

    .line 177
    .line 178
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    check-cast v5, Landroid/view/View;

    .line 186
    .line 187
    const v12, 0x79080033

    .line 188
    .line 189
    .line 190
    invoke-virtual {v5, v12}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v12

    .line 194
    instance-of v13, v12, Ljava/lang/String;

    .line 195
    .line 196
    if-eqz v13, :cond_c

    .line 197
    .line 198
    check-cast v12, Ljava/lang/String;

    .line 199
    .line 200
    goto :goto_8

    .line 201
    :cond_c
    move-object v12, v10

    .line 202
    :goto_8
    if-nez v12, :cond_d

    .line 203
    .line 204
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    :cond_d
    const-string v5, "SaveableStateRegistry:"

    .line 213
    .line 214
    invoke-static {v5, v12}, Lvi0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-interface {v7}, Ltc2;->getSavedStateRegistry()Lqc2;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    invoke-virtual {v12, v5}, Lqc2;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 223
    .line 224
    .line 225
    move-result-object v13

    .line 226
    if-eqz v13, :cond_e

    .line 227
    .line 228
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 229
    .line 230
    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v13}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    check-cast v14, Ljava/lang/Iterable;

    .line 238
    .line 239
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v14

    .line 243
    :goto_9
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v15

    .line 247
    if-eqz v15, :cond_e

    .line 248
    .line 249
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v15

    .line 253
    check-cast v15, Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v13, v15}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-interface {v10, v15, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    goto :goto_9

    .line 266
    :cond_e
    sget-object v8, Lv6;->G:Lv6;

    .line 267
    .line 268
    sget-object v13, Lhc2;->a:Ltu2;

    .line 269
    .line 270
    new-instance v13, Lgc2;

    .line 271
    .line 272
    invoke-direct {v13, v10, v8}, Lgc2;-><init>(Ljava/util/Map;Lin0;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v5}, Lqc2;->b(Ljava/lang/String;)Lpc2;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    if-eqz v8, :cond_f

    .line 280
    .line 281
    :catch_0
    const/4 v8, 0x0

    .line 282
    goto :goto_a

    .line 283
    :cond_f
    :try_start_0
    new-instance v8, Luv;

    .line 284
    .line 285
    invoke-direct {v8, v9, v13}, Luv;-><init>(ILjava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12, v5, v8}, Lqc2;->c(Ljava/lang/String;Lpc2;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 289
    .line 290
    .line 291
    move v8, v9

    .line 292
    :goto_a
    new-instance v9, Lda0;

    .line 293
    .line 294
    new-instance v10, Lea0;

    .line 295
    .line 296
    invoke-direct {v10, v8, v12, v5}, Lea0;-><init>(ZLqc2;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    invoke-direct {v9, v13, v10}, Lda0;-><init>(Lgc2;Lea0;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v4, v9}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    move-object v5, v9

    .line 306
    :cond_10
    check-cast v5, Lda0;

    .line 307
    .line 308
    invoke-virtual {v4, v5}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v8

    .line 312
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    if-nez v8, :cond_11

    .line 317
    .line 318
    if-ne v9, v11, :cond_12

    .line 319
    .line 320
    :cond_11
    new-instance v9, Lv5;

    .line 321
    .line 322
    const/16 v8, 0x9

    .line 323
    .line 324
    invoke-direct {v9, v8, v5}, Lv5;-><init>(ILjava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v4, v9}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    :cond_12
    check-cast v9, Lin0;

    .line 331
    .line 332
    sget-object v8, La83;->a:La83;

    .line 333
    .line 334
    invoke-static {v8, v9, v4}, Leu;->c(Ljava/lang/Object;Lin0;Lpx;)V

    .line 335
    .line 336
    .line 337
    sget-object v8, Lly;->w:Lmy;

    .line 338
    .line 339
    invoke-virtual {v4, v8}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    check-cast v9, Ljava/lang/Boolean;

    .line 344
    .line 345
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 346
    .line 347
    .line 348
    move-result v9

    .line 349
    invoke-virtual {v1}, Lb7;->getScrollCaptureInProgress$ui()Z

    .line 350
    .line 351
    .line 352
    move-result v10

    .line 353
    or-int/2addr v9, v10

    .line 354
    invoke-virtual {v1}, Lb7;->getView()Landroid/view/View;

    .line 355
    .line 356
    .line 357
    move-result-object v10

    .line 358
    invoke-virtual {v4, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v10

    .line 362
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v12

    .line 366
    if-nez v10, :cond_13

    .line 367
    .line 368
    if-ne v12, v11, :cond_14

    .line 369
    .line 370
    :cond_13
    new-instance v12, Lqb3;

    .line 371
    .line 372
    invoke-virtual {v1}, Lb7;->getView()Landroid/view/View;

    .line 373
    .line 374
    .line 375
    move-result-object v10

    .line 376
    invoke-direct {v12, v10}, Lqb3;-><init>(Landroid/view/View;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v4, v12}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    :cond_14
    check-cast v12, Lqb3;

    .line 383
    .line 384
    sget-object v10, Lzb1;->a:Ltu2;

    .line 385
    .line 386
    iget-object v11, v0, Llx;->c:Lia1;

    .line 387
    .line 388
    invoke-virtual {v10, v11}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 389
    .line 390
    .line 391
    move-result-object v13

    .line 392
    sget-object v10, Lfc1;->a:Le42;

    .line 393
    .line 394
    invoke-virtual {v10, v7}, Le42;->a(Ljava/lang/Object;)Lf42;

    .line 395
    .line 396
    .line 397
    move-result-object v14

    .line 398
    sget-object v7, Lr7;->d:Ltu2;

    .line 399
    .line 400
    iget-object v10, v0, Llx;->f:Lvx0;

    .line 401
    .line 402
    invoke-virtual {v7, v10}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 403
    .line 404
    .line 405
    move-result-object v15

    .line 406
    sget-object v7, Lr7;->e:Ltu2;

    .line 407
    .line 408
    iget-object v10, v0, Llx;->g:Ll92;

    .line 409
    .line 410
    invoke-virtual {v7, v10}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 411
    .line 412
    .line 413
    move-result-object v16

    .line 414
    sget-object v7, Lr7;->b:Ltu2;

    .line 415
    .line 416
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 417
    .line 418
    .line 419
    move-result-object v10

    .line 420
    invoke-virtual {v7, v10}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 421
    .line 422
    .line 423
    move-result-object v17

    .line 424
    sget-object v7, Lk01;->a:Ltu2;

    .line 425
    .line 426
    invoke-virtual {v7, v6}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 427
    .line 428
    .line 429
    move-result-object v18

    .line 430
    sget-object v6, Lr7;->a:Lmy;

    .line 431
    .line 432
    invoke-virtual {v1}, Lb7;->getConfiguration()Landroid/content/res/Configuration;

    .line 433
    .line 434
    .line 435
    move-result-object v7

    .line 436
    invoke-virtual {v6, v7}, Lmy;->a(Ljava/lang/Object;)Lf42;

    .line 437
    .line 438
    .line 439
    move-result-object v19

    .line 440
    sget-object v6, Lhc2;->a:Ltu2;

    .line 441
    .line 442
    invoke-virtual {v6, v5}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 443
    .line 444
    .line 445
    move-result-object v20

    .line 446
    sget-object v5, Lr7;->f:Ltu2;

    .line 447
    .line 448
    invoke-virtual {v1}, Lb7;->getView()Landroid/view/View;

    .line 449
    .line 450
    .line 451
    move-result-object v6

    .line 452
    invoke-virtual {v5, v6}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 453
    .line 454
    .line 455
    move-result-object v21

    .line 456
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    invoke-virtual {v8, v5}, Lmy;->a(Ljava/lang/Object;)Lf42;

    .line 461
    .line 462
    .line 463
    move-result-object v22

    .line 464
    sget-object v5, Lly;->t:Ltu2;

    .line 465
    .line 466
    invoke-virtual {v1}, Lb7;->getViewConfiguration()Lza3;

    .line 467
    .line 468
    .line 469
    move-result-object v6

    .line 470
    invoke-virtual {v5, v6}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 471
    .line 472
    .line 473
    move-result-object v23

    .line 474
    sget-object v5, Lmu0;->a:Lmy;

    .line 475
    .line 476
    invoke-virtual {v5, v12}, Lmy;->a(Ljava/lang/Object;)Lf42;

    .line 477
    .line 478
    .line 479
    move-result-object v24

    .line 480
    filled-new-array/range {v13 .. v24}, [Lf42;

    .line 481
    .line 482
    .line 483
    move-result-object v5

    .line 484
    new-instance v6, Ljx;

    .line 485
    .line 486
    invoke-direct {v6, v1, v0, v2}, Ljx;-><init>(Lb7;Llx;Lmn0;)V

    .line 487
    .line 488
    .line 489
    const v7, 0x4e86c15f

    .line 490
    .line 491
    .line 492
    invoke-static {v7, v6, v4}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 493
    .line 494
    .line 495
    move-result-object v6

    .line 496
    const/16 v7, 0x38

    .line 497
    .line 498
    invoke-static {v5, v6, v4, v7}, Lci0;->b([Lf42;Lmn0;Lpx;I)V

    .line 499
    .line 500
    .line 501
    goto :goto_b

    .line 502
    :cond_15
    invoke-virtual {v4}, Lgo0;->R()V

    .line 503
    .line 504
    .line 505
    :goto_b
    invoke-virtual {v4}, Lgo0;->r()Lb62;

    .line 506
    .line 507
    .line 508
    move-result-object v4

    .line 509
    if-eqz v4, :cond_16

    .line 510
    .line 511
    new-instance v5, Ljx;

    .line 512
    .line 513
    invoke-direct {v5, v0, v1, v2, v3}, Ljx;-><init>(Llx;Lb7;Lmn0;I)V

    .line 514
    .line 515
    .line 516
    iput-object v5, v4, Lb62;->d:Lmn0;

    .line 517
    .line 518
    :cond_16
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget v0, p0, Llx;->u:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Llx;->u:I

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
    iput v0, p0, Llx;->u:I

    .line 18
    .line 19
    :cond_0
    iget v0, p0, Llx;->u:I

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Llx;->a:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, p0, Llx;->v:Lkx;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Llx;->s:Lk91;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0, v2}, Landroid/view/ViewTreeObserver;->removeOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget v0, p0, Llx;->u:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Llx;->u:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Llx;->a:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Llx;->v:Lkx;

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
    invoke-virtual {p0, v1}, Llx;->d(Landroid/content/res/Configuration;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->hasWindowFocus()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget-object p0, p0, Llx;->s:Lk91;

    .line 36
    .line 37
    iget-object p0, p0, Lk91;->a:Lnx1;

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p0, v1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0, v2}, Landroid/view/ViewTreeObserver;->addOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method

.method public final d(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    iget-object v0, p0, Llx;->h:Landroid/content/res/Configuration;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/content/res/Configuration;->updateFrom(Landroid/content/res/Configuration;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-object v1, p0, Llx;->f:Lvx0;

    .line 10
    .line 11
    iget-object v1, v1, Lvx0;->a:Ljava/util/HashMap;

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
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

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
    check-cast v2, Ltx0;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    iget v2, v2, Ltx0;->b:I

    .line 48
    .line 49
    invoke-static {v0, v2}, Landroid/content/res/Configuration;->needNewResources(II)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    iget-object v1, p0, Llx;->i:Lxk1;

    .line 60
    .line 61
    new-instance v2, Landroid/content/res/Configuration;

    .line 62
    .line 63
    invoke-direct {v2, p1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v1, v2}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Llx;->g:Ll92;

    .line 70
    .line 71
    monitor-enter p1

    .line 72
    :try_start_0
    iget-object v1, p1, Ll92;->a:Lzj1;

    .line 73
    .line 74
    invoke-virtual {v1}, Lzj1;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    .line 77
    monitor-exit p1

    .line 78
    const/high16 p1, 0x10000000

    .line 79
    .line 80
    and-int/2addr p1, v0

    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    iget-object p1, p0, Llx;->o:Lxk1;

    .line 84
    .line 85
    iget-object v1, p0, Llx;->a:Landroid/view/View;

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1}, Leu;->D(Landroid/content/Context;)Lyl0;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {p1, v1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    const p1, -0x5000e280

    .line 99
    .line 100
    .line 101
    and-int/2addr p1, v0

    .line 102
    if-eqz p1, :cond_4

    .line 103
    .line 104
    iget-object p0, p0, Llx;->s:Lk91;

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :catchall_0
    move-exception p0

    .line 111
    monitor-exit p1

    .line 112
    throw p0

    .line 113
    :cond_4
    return-void
.end method
