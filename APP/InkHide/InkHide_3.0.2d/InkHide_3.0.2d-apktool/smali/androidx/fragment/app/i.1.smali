.class public final Landroidx/fragment/app/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/ViewGroup;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/fragment/app/i;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/fragment/app/i;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Landroidx/fragment/app/i;->d:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Landroidx/fragment/app/i;->e:Z

    .line 22
    .line 23
    iput-object p1, p0, Landroidx/fragment/app/i;->a:Landroid/view/ViewGroup;

    .line 24
    .line 25
    return-void
.end method

.method public static f(Landroid/view/ViewGroup;LG/d;)Landroidx/fragment/app/i;
    .locals 3

    .line 1
    const v0, 0x7f090090

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    instance-of v2, v1, Landroidx/fragment/app/i;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    check-cast v1, Landroidx/fragment/app/i;

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance p1, Landroidx/fragment/app/i;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Landroidx/fragment/app/i;-><init>(Landroid/view/ViewGroup;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method


# virtual methods
.method public final a(IILandroidx/fragment/app/F;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/i;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Lu/c;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v2, p3, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Landroidx/fragment/app/i;->d(Landroidx/fragment/app/l;)Landroidx/fragment/app/K;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2, p1, p2}, Landroidx/fragment/app/K;->c(II)V

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Landroidx/fragment/app/K;

    .line 25
    .line 26
    invoke-direct {v2, p1, p2, p3, v1}, Landroidx/fragment/app/K;-><init>(IILandroidx/fragment/app/F;Lu/c;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Landroidx/fragment/app/i;->b:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    new-instance p1, Landroidx/fragment/app/J;

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-direct {p1, p0, v2, p2}, Landroidx/fragment/app/J;-><init>(Landroidx/fragment/app/i;Landroidx/fragment/app/K;I)V

    .line 38
    .line 39
    .line 40
    iget-object p2, v2, Landroidx/fragment/app/K;->d:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    new-instance p1, Landroidx/fragment/app/J;

    .line 46
    .line 47
    const/4 p2, 0x1

    .line 48
    invoke-direct {p1, p0, v2, p2}, Landroidx/fragment/app/J;-><init>(Landroidx/fragment/app/i;Landroidx/fragment/app/K;I)V

    .line 49
    .line 50
    .line 51
    iget-object p2, v2, Landroidx/fragment/app/K;->d:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    monitor-exit v0

    .line 57
    return-void

    .line 58
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw p1
.end method

.method public final b(Ljava/util/ArrayList;Z)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v4, v3

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    const/4 v6, 0x3

    .line 16
    const/4 v7, 0x1

    .line 17
    const/4 v8, 0x2

    .line 18
    if-eqz v5, :cond_3

    .line 19
    .line 20
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, Landroidx/fragment/app/K;

    .line 25
    .line 26
    iget-object v9, v5, Landroidx/fragment/app/K;->c:Landroidx/fragment/app/l;

    .line 27
    .line 28
    iget-object v9, v9, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 29
    .line 30
    invoke-static {v9}, Landroidx/fragment/app/L;->c(Landroid/view/View;)I

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    iget v10, v5, Landroidx/fragment/app/K;->a:I

    .line 35
    .line 36
    invoke-static {v10}, Landroidx/fragment/app/L;->d(I)I

    .line 37
    .line 38
    .line 39
    move-result v10

    .line 40
    if-eqz v10, :cond_2

    .line 41
    .line 42
    if-eq v10, v7, :cond_1

    .line 43
    .line 44
    if-eq v10, v8, :cond_2

    .line 45
    .line 46
    if-eq v10, v6, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    if-eq v9, v8, :cond_0

    .line 50
    .line 51
    move-object v4, v5

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    if-ne v9, v8, :cond_0

    .line 54
    .line 55
    if-nez v3, :cond_0

    .line 56
    .line 57
    move-object v3, v5

    .line 58
    goto :goto_0

    .line 59
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v5, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance v9, Ljava/util/ArrayList;

    .line 70
    .line 71
    move-object/from16 v10, p1

    .line 72
    .line 73
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    const/4 v12, 0x0

    .line 85
    if-eqz v11, :cond_c

    .line 86
    .line 87
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v11

    .line 91
    check-cast v11, Landroidx/fragment/app/K;

    .line 92
    .line 93
    new-instance v13, Lu/c;

    .line 94
    .line 95
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v11}, Landroidx/fragment/app/K;->d()V

    .line 99
    .line 100
    .line 101
    iget-object v14, v11, Landroidx/fragment/app/K;->e:Ljava/util/HashSet;

    .line 102
    .line 103
    invoke-virtual {v14, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    new-instance v15, Landroidx/fragment/app/f;

    .line 107
    .line 108
    invoke-direct {v15, v11, v13}, Landroidx/fragment/app/g;-><init>(Landroidx/fragment/app/K;Lu/c;)V

    .line 109
    .line 110
    .line 111
    iput-boolean v12, v15, Landroidx/fragment/app/f;->d:Z

    .line 112
    .line 113
    iput-boolean v1, v15, Landroidx/fragment/app/f;->c:Z

    .line 114
    .line 115
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    new-instance v13, Lu/c;

    .line 119
    .line 120
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v11}, Landroidx/fragment/app/K;->d()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v14, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    new-instance v14, Landroidx/fragment/app/h;

    .line 130
    .line 131
    if-eqz v1, :cond_4

    .line 132
    .line 133
    if-ne v11, v3, :cond_5

    .line 134
    .line 135
    :goto_2
    move v12, v7

    .line 136
    goto :goto_3

    .line 137
    :cond_4
    if-ne v11, v4, :cond_5

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    :goto_3
    invoke-direct {v14, v11, v13}, Landroidx/fragment/app/g;-><init>(Landroidx/fragment/app/K;Lu/c;)V

    .line 141
    .line 142
    .line 143
    iget v13, v11, Landroidx/fragment/app/K;->a:I

    .line 144
    .line 145
    iget-object v15, v11, Landroidx/fragment/app/K;->c:Landroidx/fragment/app/l;

    .line 146
    .line 147
    if-ne v13, v8, :cond_8

    .line 148
    .line 149
    if-eqz v1, :cond_6

    .line 150
    .line 151
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_6
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    :goto_4
    if-eqz v1, :cond_7

    .line 159
    .line 160
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_7
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_8
    if-eqz v1, :cond_9

    .line 169
    .line 170
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_9
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    :goto_5
    if-eqz v12, :cond_b

    .line 178
    .line 179
    if-eqz v1, :cond_a

    .line 180
    .line 181
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_a
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    :cond_b
    :goto_6
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    new-instance v12, Landroidx/fragment/app/c;

    .line 192
    .line 193
    invoke-direct {v12, v0, v9, v11}, Landroidx/fragment/app/c;-><init>(Landroidx/fragment/app/i;Ljava/util/ArrayList;Landroidx/fragment/app/K;)V

    .line 194
    .line 195
    .line 196
    iget-object v11, v11, Landroidx/fragment/app/K;->d:Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_c
    new-instance v1, Ljava/util/HashMap;

    .line 203
    .line 204
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-eqz v4, :cond_d

    .line 216
    .line 217
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    check-cast v4, Landroidx/fragment/app/h;

    .line 222
    .line 223
    iget-object v4, v4, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v4, Landroidx/fragment/app/K;

    .line 226
    .line 227
    iget-object v10, v4, Landroidx/fragment/app/K;->c:Landroidx/fragment/app/l;

    .line 228
    .line 229
    iget-object v10, v10, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 230
    .line 231
    invoke-static {v10}, Landroidx/fragment/app/L;->c(Landroid/view/View;)I

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    iget v4, v4, Landroidx/fragment/app/K;->a:I

    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_d
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    if-eqz v4, :cond_e

    .line 247
    .line 248
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    check-cast v4, Landroidx/fragment/app/h;

    .line 253
    .line 254
    iget-object v5, v4, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v5, Landroidx/fragment/app/K;

    .line 257
    .line 258
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 259
    .line 260
    invoke-virtual {v1, v5, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v4}, Landroidx/fragment/app/g;->d()V

    .line 264
    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_e
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 268
    .line 269
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->containsValue(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    iget-object v14, v0, Landroidx/fragment/app/i;->a:Landroid/view/ViewGroup;

    .line 274
    .line 275
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    new-instance v5, Ljava/util/ArrayList;

    .line 280
    .line 281
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    move v10, v12

    .line 289
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 290
    .line 291
    .line 292
    move-result v11

    .line 293
    const-string v13, "FragmentManager"

    .line 294
    .line 295
    if-eqz v11, :cond_17

    .line 296
    .line 297
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v11

    .line 301
    check-cast v11, Landroidx/fragment/app/f;

    .line 302
    .line 303
    iget-object v15, v11, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v15, Landroidx/fragment/app/K;

    .line 306
    .line 307
    iget-object v12, v15, Landroidx/fragment/app/K;->c:Landroidx/fragment/app/l;

    .line 308
    .line 309
    iget-object v12, v12, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 310
    .line 311
    invoke-static {v12}, Landroidx/fragment/app/L;->c(Landroid/view/View;)I

    .line 312
    .line 313
    .line 314
    move-result v12

    .line 315
    iget v15, v15, Landroidx/fragment/app/K;->a:I

    .line 316
    .line 317
    if-eq v12, v15, :cond_f

    .line 318
    .line 319
    if-eq v12, v8, :cond_10

    .line 320
    .line 321
    if-eq v15, v8, :cond_10

    .line 322
    .line 323
    :cond_f
    move/from16 v19, v8

    .line 324
    .line 325
    goto/16 :goto_d

    .line 326
    .line 327
    :cond_10
    invoke-virtual {v11, v4}, Landroidx/fragment/app/f;->j(Landroid/content/Context;)LH/a;

    .line 328
    .line 329
    .line 330
    move-result-object v12

    .line 331
    if-nez v12, :cond_11

    .line 332
    .line 333
    invoke-virtual {v11}, Landroidx/fragment/app/g;->d()V

    .line 334
    .line 335
    .line 336
    :goto_a
    move/from16 v19, v8

    .line 337
    .line 338
    goto/16 :goto_e

    .line 339
    .line 340
    :cond_11
    iget-object v12, v12, LH/a;->c:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v12, Landroid/animation/Animator;

    .line 343
    .line 344
    if-nez v12, :cond_12

    .line 345
    .line 346
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    goto :goto_a

    .line 350
    :cond_12
    iget-object v15, v11, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v15, Landroidx/fragment/app/K;

    .line 353
    .line 354
    move/from16 v19, v8

    .line 355
    .line 356
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 357
    .line 358
    invoke-virtual {v1, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    invoke-virtual {v8, v7}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v7

    .line 366
    iget-object v8, v15, Landroidx/fragment/app/K;->c:Landroidx/fragment/app/l;

    .line 367
    .line 368
    if-eqz v7, :cond_14

    .line 369
    .line 370
    invoke-static/range {v19 .. v19}, Landroidx/fragment/app/z;->E(I)Z

    .line 371
    .line 372
    .line 373
    move-result v7

    .line 374
    if-eqz v7, :cond_13

    .line 375
    .line 376
    new-instance v7, Ljava/lang/StringBuilder;

    .line 377
    .line 378
    const-string v12, "Ignoring Animator set on "

    .line 379
    .line 380
    invoke-direct {v7, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    const-string v8, " as this Fragment was involved in a Transition."

    .line 387
    .line 388
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v7

    .line 395
    invoke-static {v13, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 396
    .line 397
    .line 398
    :cond_13
    invoke-virtual {v11}, Landroidx/fragment/app/g;->d()V

    .line 399
    .line 400
    .line 401
    goto :goto_e

    .line 402
    :cond_14
    iget v7, v15, Landroidx/fragment/app/K;->a:I

    .line 403
    .line 404
    if-ne v7, v6, :cond_15

    .line 405
    .line 406
    const/16 v16, 0x1

    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_15
    const/16 v16, 0x0

    .line 410
    .line 411
    :goto_b
    if-eqz v16, :cond_16

    .line 412
    .line 413
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    :cond_16
    iget-object v7, v8, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 417
    .line 418
    invoke-virtual {v14, v7}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 419
    .line 420
    .line 421
    new-instance v13, Landroidx/fragment/app/d;

    .line 422
    .line 423
    move-object/from16 v18, v11

    .line 424
    .line 425
    move-object/from16 v17, v15

    .line 426
    .line 427
    move-object v15, v7

    .line 428
    invoke-direct/range {v13 .. v18}, Landroidx/fragment/app/d;-><init>(Landroid/view/ViewGroup;Landroid/view/View;ZLandroidx/fragment/app/K;Landroidx/fragment/app/f;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12, v13}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v15}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12}, Landroid/animation/Animator;->start()V

    .line 438
    .line 439
    .line 440
    new-instance v7, LC/j;

    .line 441
    .line 442
    const/16 v8, 0xa

    .line 443
    .line 444
    invoke-direct {v7, v8, v12}, LC/j;-><init>(ILjava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    iget-object v8, v11, Landroidx/fragment/app/g;->b:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v8, Lu/c;

    .line 450
    .line 451
    invoke-virtual {v8, v7}, Lu/c;->a(Lu/b;)V

    .line 452
    .line 453
    .line 454
    move/from16 v8, v19

    .line 455
    .line 456
    const/4 v7, 0x1

    .line 457
    const/4 v10, 0x1

    .line 458
    :goto_c
    const/4 v12, 0x0

    .line 459
    goto/16 :goto_9

    .line 460
    .line 461
    :goto_d
    invoke-virtual {v11}, Landroidx/fragment/app/g;->d()V

    .line 462
    .line 463
    .line 464
    :goto_e
    move/from16 v8, v19

    .line 465
    .line 466
    const/4 v7, 0x1

    .line 467
    goto :goto_c

    .line 468
    :cond_17
    move/from16 v19, v8

    .line 469
    .line 470
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    if-eqz v2, :cond_1d

    .line 479
    .line 480
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    check-cast v2, Landroidx/fragment/app/f;

    .line 485
    .line 486
    iget-object v5, v2, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v5, Landroidx/fragment/app/K;

    .line 489
    .line 490
    iget-object v6, v5, Landroidx/fragment/app/K;->c:Landroidx/fragment/app/l;

    .line 491
    .line 492
    const-string v7, "Ignoring Animation set on "

    .line 493
    .line 494
    if-eqz v3, :cond_19

    .line 495
    .line 496
    invoke-static/range {v19 .. v19}, Landroidx/fragment/app/z;->E(I)Z

    .line 497
    .line 498
    .line 499
    move-result v5

    .line 500
    if-eqz v5, :cond_18

    .line 501
    .line 502
    new-instance v5, Ljava/lang/StringBuilder;

    .line 503
    .line 504
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    const-string v6, " as Animations cannot run alongside Transitions."

    .line 511
    .line 512
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    invoke-static {v13, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 520
    .line 521
    .line 522
    :cond_18
    invoke-virtual {v2}, Landroidx/fragment/app/g;->d()V

    .line 523
    .line 524
    .line 525
    goto :goto_f

    .line 526
    :cond_19
    if-eqz v10, :cond_1b

    .line 527
    .line 528
    invoke-static/range {v19 .. v19}, Landroidx/fragment/app/z;->E(I)Z

    .line 529
    .line 530
    .line 531
    move-result v5

    .line 532
    if-eqz v5, :cond_1a

    .line 533
    .line 534
    new-instance v5, Ljava/lang/StringBuilder;

    .line 535
    .line 536
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    const-string v6, " as Animations cannot run alongside Animators."

    .line 543
    .line 544
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v5

    .line 551
    invoke-static {v13, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 552
    .line 553
    .line 554
    :cond_1a
    invoke-virtual {v2}, Landroidx/fragment/app/g;->d()V

    .line 555
    .line 556
    .line 557
    goto :goto_f

    .line 558
    :cond_1b
    iget-object v6, v6, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 559
    .line 560
    invoke-virtual {v2, v4}, Landroidx/fragment/app/f;->j(Landroid/content/Context;)LH/a;

    .line 561
    .line 562
    .line 563
    move-result-object v7

    .line 564
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    iget-object v7, v7, LH/a;->b:Ljava/lang/Object;

    .line 568
    .line 569
    check-cast v7, Landroid/view/animation/Animation;

    .line 570
    .line 571
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    iget v5, v5, Landroidx/fragment/app/K;->a:I

    .line 575
    .line 576
    const/4 v8, 0x1

    .line 577
    if-eq v5, v8, :cond_1c

    .line 578
    .line 579
    invoke-virtual {v6, v7}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v2}, Landroidx/fragment/app/g;->d()V

    .line 583
    .line 584
    .line 585
    goto :goto_10

    .line 586
    :cond_1c
    invoke-virtual {v14, v6}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 587
    .line 588
    .line 589
    new-instance v5, Landroidx/fragment/app/p;

    .line 590
    .line 591
    invoke-direct {v5, v7, v14, v6}, Landroidx/fragment/app/p;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 592
    .line 593
    .line 594
    new-instance v7, Landroidx/fragment/app/e;

    .line 595
    .line 596
    invoke-direct {v7, v14, v6, v2}, Landroidx/fragment/app/e;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/f;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v5, v7}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v6, v5}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 603
    .line 604
    .line 605
    :goto_10
    new-instance v5, LC/h;

    .line 606
    .line 607
    invoke-direct {v5, v6, v14, v2}, LC/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    iget-object v2, v2, Landroidx/fragment/app/g;->b:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v2, Lu/c;

    .line 613
    .line 614
    invoke-virtual {v2, v5}, Lu/c;->a(Lu/b;)V

    .line 615
    .line 616
    .line 617
    goto/16 :goto_f

    .line 618
    .line 619
    :cond_1d
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 624
    .line 625
    .line 626
    move-result v2

    .line 627
    if-eqz v2, :cond_1e

    .line 628
    .line 629
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v2

    .line 633
    check-cast v2, Landroidx/fragment/app/K;

    .line 634
    .line 635
    iget-object v3, v2, Landroidx/fragment/app/K;->c:Landroidx/fragment/app/l;

    .line 636
    .line 637
    iget-object v3, v3, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 638
    .line 639
    iget v2, v2, Landroidx/fragment/app/K;->a:I

    .line 640
    .line 641
    invoke-static {v3, v2}, Landroidx/fragment/app/L;->a(Landroid/view/View;I)V

    .line 642
    .line 643
    .line 644
    goto :goto_11

    .line 645
    :cond_1e
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 646
    .line 647
    .line 648
    return-void
.end method

.method public final c()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/i;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/i;->a:Landroid/view/ViewGroup;

    .line 7
    .line 8
    sget-object v1, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/i;->e()V

    .line 18
    .line 19
    .line 20
    iput-boolean v1, p0, Landroidx/fragment/app/i;->d:Z

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/i;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    monitor-enter v0

    .line 26
    :try_start_0
    iget-object v2, p0, Landroidx/fragment/app/i;->b:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_6

    .line 33
    .line 34
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    iget-object v3, p0, Landroidx/fragment/app/i;->c:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 39
    .line 40
    .line 41
    iget-object v3, p0, Landroidx/fragment/app/i;->c:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_4

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Landroidx/fragment/app/K;

    .line 61
    .line 62
    const/4 v4, 0x2

    .line 63
    invoke-static {v4}, Landroidx/fragment/app/z;->E(I)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    const-string v4, "FragmentManager"

    .line 70
    .line 71
    new-instance v5, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v6, "SpecialEffectsController: Cancelling operation "

    .line 77
    .line 78
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception v1

    .line 93
    goto :goto_3

    .line 94
    :cond_3
    :goto_1
    invoke-virtual {v3}, Landroidx/fragment/app/K;->a()V

    .line 95
    .line 96
    .line 97
    iget-boolean v4, v3, Landroidx/fragment/app/K;->g:Z

    .line 98
    .line 99
    if-nez v4, :cond_2

    .line 100
    .line 101
    iget-object v4, p0, Landroidx/fragment/app/i;->c:Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/i;->g()V

    .line 108
    .line 109
    .line 110
    new-instance v2, Ljava/util/ArrayList;

    .line 111
    .line 112
    iget-object v3, p0, Landroidx/fragment/app/i;->b:Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 115
    .line 116
    .line 117
    iget-object v3, p0, Landroidx/fragment/app/i;->b:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 120
    .line 121
    .line 122
    iget-object v3, p0, Landroidx/fragment/app/i;->c:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_5

    .line 136
    .line 137
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Landroidx/fragment/app/K;

    .line 142
    .line 143
    invoke-virtual {v4}, Landroidx/fragment/app/K;->d()V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_5
    iget-boolean v3, p0, Landroidx/fragment/app/i;->d:Z

    .line 148
    .line 149
    invoke-virtual {p0, v2, v3}, Landroidx/fragment/app/i;->b(Ljava/util/ArrayList;Z)V

    .line 150
    .line 151
    .line 152
    iput-boolean v1, p0, Landroidx/fragment/app/i;->d:Z

    .line 153
    .line 154
    :cond_6
    monitor-exit v0

    .line 155
    return-void

    .line 156
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    throw v1
.end method

.method public final d(Landroidx/fragment/app/l;)Landroidx/fragment/app/K;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/i;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/fragment/app/K;

    .line 18
    .line 19
    iget-object v2, v1, Landroidx/fragment/app/K;->c:Landroidx/fragment/app/l;

    .line 20
    .line 21
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-boolean v2, v1, Landroidx/fragment/app/K;->f:Z

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    return-object p1
.end method

.method public final e()V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/i;->a:Landroid/view/ViewGroup;

    .line 2
    .line 3
    sget-object v1, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Landroidx/fragment/app/i;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/i;->g()V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Landroidx/fragment/app/i;->b:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Landroidx/fragment/app/K;

    .line 32
    .line 33
    invoke-virtual {v3}, Landroidx/fragment/app/K;->d()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 41
    .line 42
    iget-object v3, p0, Landroidx/fragment/app/i;->c:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    const/4 v4, 0x2

    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Landroidx/fragment/app/K;

    .line 63
    .line 64
    invoke-static {v4}, Landroidx/fragment/app/z;->E(I)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_2

    .line 69
    .line 70
    const-string v4, "FragmentManager"

    .line 71
    .line 72
    new-instance v5, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string v6, "SpecialEffectsController: "

    .line 78
    .line 79
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    const-string v6, ""

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v7, "Container "

    .line 93
    .line 94
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object v7, p0, Landroidx/fragment/app/i;->a:Landroid/view/ViewGroup;

    .line 98
    .line 99
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v7, " is not attached to window. "

    .line 103
    .line 104
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    :goto_2
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v6, "Cancelling running operation "

    .line 115
    .line 116
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    :cond_2
    invoke-virtual {v3}, Landroidx/fragment/app/K;->a()V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 134
    .line 135
    iget-object v3, p0, Landroidx/fragment/app/i;->b:Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-eqz v3, :cond_6

    .line 149
    .line 150
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, Landroidx/fragment/app/K;

    .line 155
    .line 156
    invoke-static {v4}, Landroidx/fragment/app/z;->E(I)Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-eqz v5, :cond_5

    .line 161
    .line 162
    const-string v5, "FragmentManager"

    .line 163
    .line 164
    new-instance v6, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    const-string v7, "SpecialEffectsController: "

    .line 170
    .line 171
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    if-eqz v0, :cond_4

    .line 175
    .line 176
    const-string v7, ""

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_4
    new-instance v7, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    const-string v8, "Container "

    .line 185
    .line 186
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    iget-object v8, p0, Landroidx/fragment/app/i;->a:Landroid/view/ViewGroup;

    .line 190
    .line 191
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v8, " is not attached to window. "

    .line 195
    .line 196
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    :goto_4
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const-string v7, "Cancelling pending operation "

    .line 207
    .line 208
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 219
    .line 220
    .line 221
    :cond_5
    invoke-virtual {v3}, Landroidx/fragment/app/K;->a()V

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_6
    monitor-exit v1

    .line 226
    return-void

    .line 227
    :goto_5
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 228
    throw v0
.end method

.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/i;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/fragment/app/K;

    .line 18
    .line 19
    iget v2, v1, Landroidx/fragment/app/K;->b:I

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    if-ne v2, v3, :cond_0

    .line 23
    .line 24
    iget-object v2, v1, Landroidx/fragment/app/K;->c:Landroidx/fragment/app/l;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroidx/fragment/app/l;->n()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {v2}, Landroidx/fragment/app/L;->b(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-virtual {v1, v2, v3}, Landroidx/fragment/app/K;->c(II)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-void
.end method
