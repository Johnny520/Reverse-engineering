.class public final Lb0/g;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lb0/g;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lb0/g;->j:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lb0/g;->k:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Lwf/c;)Lwf/c;
    .locals 4

    .line 1
    iget v0, p0, Lb0/g;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb0/g;

    .line 7
    .line 8
    iget-object v1, p0, Lb0/g;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Li/c;

    .line 11
    .line 12
    iget-object v2, p0, Lb0/g;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Li0/f1;

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    invoke-direct {v0, v1, v2, p1, v3}, Lb0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    new-instance v0, Lb0/g;

    .line 22
    .line 23
    iget-object v1, p0, Lb0/g;->j:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ld0/c;

    .line 26
    .line 27
    iget-object v2, p0, Lb0/g;->k:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Ld0/b;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-direct {v0, v1, v2, p1, v3}, Lb0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_1
    new-instance v0, Lb0/g;

    .line 37
    .line 38
    iget-object v1, p0, Lb0/g;->j:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lb0/h;

    .line 41
    .line 42
    iget-object v2, p0, Lb0/g;->k:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ld0/d;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-direct {v0, v1, v2, p1, v3}, Lb0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lb0/g;->h:I

    .line 2
    .line 3
    check-cast p1, Lwf/c;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lb0/g;->create(Lwf/c;)Lwf/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lb0/g;

    .line 13
    .line 14
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lb0/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, Lb0/g;->create(Lwf/c;)Lwf/c;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lb0/g;

    .line 26
    .line 27
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lb0/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, Lb0/g;->create(Lwf/c;)Lwf/c;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lb0/g;

    .line 39
    .line 40
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lb0/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lb0/g;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb0/g;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Li0/f1;

    .line 9
    .line 10
    iget v1, p0, Lb0/g;->i:I

    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    const/16 v3, 0x96

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x1

    .line 17
    const/4 v6, 0x0

    .line 18
    sget-object v7, Lxf/a;->g:Lxf/a;

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    if-eq v1, v5, :cond_1

    .line 23
    .line 24
    if-ne v1, v4, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object v12, p0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    move-object v12, p0

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v12, p0

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lb0/g;->j:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v8, p1

    .line 50
    check-cast v8, Li/c;

    .line 51
    .line 52
    new-instance v9, Ljava/lang/Float;

    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    invoke-direct {v9, p1}, Ljava/lang/Float;-><init>(F)V

    .line 56
    .line 57
    .line 58
    invoke-static {v3, v2, v6}, Li/d;->p(IILi/v;)Li/l1;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    iput v5, p0, Lb0/g;->i:I

    .line 63
    .line 64
    const/4 v11, 0x0

    .line 65
    const/16 v13, 0xc

    .line 66
    .line 67
    move-object v12, p0

    .line 68
    invoke-static/range {v8 .. v13}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v7, :cond_3

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    :goto_0
    invoke-virtual {v0}, Li0/f1;->g()F

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    invoke-static {v3, v2, v6}, Li/d;->p(IILi/v;)Li/l1;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    new-instance v11, Lwb/jj;

    .line 84
    .line 85
    const/4 p1, 0x4

    .line 86
    invoke-direct {v11, v0, p1}, Lwb/jj;-><init>(Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    iput v4, v12, Lb0/g;->i:I

    .line 90
    .line 91
    const/high16 v9, 0x3f800000    # 1.0f

    .line 92
    .line 93
    const/4 v13, 0x4

    .line 94
    invoke-static/range {v8 .. v13}, Li/d;->e(FFLi/l1;Lfg/p;Lyf/i;I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-ne p1, v7, :cond_4

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    :goto_1
    sget-object v7, Lsf/n;->a:Lsf/n;

    .line 102
    .line 103
    :goto_2
    return-object v7

    .line 104
    :pswitch_0
    move-object v12, p0

    .line 105
    iget-object v0, v12, Lb0/g;->k:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Ld0/b;

    .line 108
    .line 109
    iget-object v1, v12, Lb0/g;->j:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, Ld0/c;

    .line 112
    .line 113
    iget-object v1, v1, Ld0/c;->c:Li0/j1;

    .line 114
    .line 115
    iget v2, v12, Lb0/g;->i:I

    .line 116
    .line 117
    const/4 v3, 0x0

    .line 118
    sget-object v4, Lsf/n;->a:Lsf/n;

    .line 119
    .line 120
    const/4 v5, 0x1

    .line 121
    if-eqz v2, :cond_6

    .line 122
    .line 123
    if-ne v2, v5, :cond_5

    .line 124
    .line 125
    :try_start_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :catchall_0
    move-exception v0

    .line 130
    move-object p1, v0

    .line 131
    goto :goto_6

    .line 132
    :cond_5
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 133
    .line 134
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const/4 v4, 0x0

    .line 138
    goto :goto_5

    .line 139
    :cond_6
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :try_start_1
    invoke-virtual {v1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iput v5, v12, Lb0/g;->i:I

    .line 146
    .line 147
    iget-object p1, v0, Ld0/b;->b:Lsg/c;

    .line 148
    .line 149
    invoke-virtual {p1, p0}, Lsg/c;->f(Lwf/c;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 153
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 154
    .line 155
    if-ne p1, v0, :cond_7

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_7
    move-object p1, v4

    .line 159
    :goto_3
    if-ne p1, v0, :cond_8

    .line 160
    .line 161
    move-object v4, v0

    .line 162
    goto :goto_5

    .line 163
    :cond_8
    :goto_4
    invoke-virtual {v1, v3}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :goto_5
    return-object v4

    .line 167
    :goto_6
    invoke-virtual {v1, v3}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    throw p1

    .line 171
    :pswitch_1
    move-object v12, p0

    .line 172
    iget-object v0, v12, Lb0/g;->j:Ljava/lang/Object;

    .line 173
    .line 174
    move-object v1, v0

    .line 175
    check-cast v1, Lb0/h;

    .line 176
    .line 177
    iget-object v2, v1, Lb0/h;->e:Lw0/s;

    .line 178
    .line 179
    iget-object v3, v1, Lb0/h;->a:Landroid/view/View;

    .line 180
    .line 181
    iget v0, v12, Lb0/g;->i:I

    .line 182
    .line 183
    sget-object v4, Lsf/n;->a:Lsf/n;

    .line 184
    .line 185
    const/4 v5, 0x1

    .line 186
    const/4 v6, 0x0

    .line 187
    if-eqz v0, :cond_a

    .line 188
    .line 189
    if-ne v0, v5, :cond_9

    .line 190
    .line 191
    :try_start_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 192
    .line 193
    .line 194
    goto/16 :goto_b

    .line 195
    .line 196
    :catchall_1
    move-exception v0

    .line 197
    move-object p1, v0

    .line 198
    goto/16 :goto_f

    .line 199
    .line 200
    :cond_9
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 201
    .line 202
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    const/4 v4, 0x0

    .line 206
    goto/16 :goto_e

    .line 207
    .line 208
    :cond_a
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    new-instance p1, Lb0/f;

    .line 212
    .line 213
    invoke-direct {p1}, Lb0/f;-><init>()V

    .line 214
    .line 215
    .line 216
    iget-object v0, v12, Lb0/g;->k:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, Ld0/d;

    .line 219
    .line 220
    new-instance v7, Lb0/e;

    .line 221
    .line 222
    new-instance v8, Lb0/b;

    .line 223
    .line 224
    const/4 v9, 0x0

    .line 225
    invoke-direct {v8, v1, v0, v9}, Lb0/b;-><init>(Lb0/h;Ld0/d;I)V

    .line 226
    .line 227
    .line 228
    new-instance v9, Lb0/b;

    .line 229
    .line 230
    const/4 v10, 0x1

    .line 231
    invoke-direct {v9, v1, v0, v10}, Lb0/b;-><init>(Lb0/h;Ld0/d;I)V

    .line 232
    .line 233
    .line 234
    invoke-direct {v7, p1, v8, v9, v3}, Lb0/e;-><init>(Lb0/f;Lb0/b;Lb0/b;Landroid/view/View;)V

    .line 235
    .line 236
    .line 237
    iget-object v0, v1, Lb0/h;->b:Lfg/l;

    .line 238
    .line 239
    if-eqz v0, :cond_c

    .line 240
    .line 241
    invoke-interface {v0, v7}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    check-cast v0, Lb0/e;

    .line 246
    .line 247
    if-nez v0, :cond_b

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_b
    move-object v7, v0

    .line 251
    :cond_c
    :goto_7
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v3}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    if-eqz v8, :cond_d

    .line 260
    .line 261
    invoke-virtual {v8}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    goto :goto_8

    .line 266
    :cond_d
    move-object v8, v6

    .line 267
    :goto_8
    if-eq v0, v8, :cond_f

    .line 268
    .line 269
    iget-object v0, v1, Lb0/h;->i:Lac/l;

    .line 270
    .line 271
    if-nez v0, :cond_e

    .line 272
    .line 273
    new-instance v0, Lac/l;

    .line 274
    .line 275
    const/4 v8, 0x1

    .line 276
    invoke-direct {v0, v1, v7, p1, v8}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 277
    .line 278
    .line 279
    iput-object v0, v1, Lb0/h;->i:Lac/l;

    .line 280
    .line 281
    :cond_e
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 282
    .line 283
    .line 284
    goto :goto_9

    .line 285
    :cond_f
    new-instance v0, Lb0/x;

    .line 286
    .line 287
    invoke-direct {v0, v7}, Lb0/x;-><init>(Lb0/e;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v3, v0, v5}, Landroid/view/View;->startActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    if-nez v0, :cond_10

    .line 295
    .line 296
    goto :goto_e

    .line 297
    :cond_10
    iput-object v0, v1, Lb0/h;->h:Landroid/view/ActionMode;

    .line 298
    .line 299
    :goto_9
    :try_start_3
    iput v5, v12, Lb0/g;->i:I

    .line 300
    .line 301
    iget-object p1, p1, Lb0/f;->a:Lsg/c;

    .line 302
    .line 303
    invoke-virtual {p1, p0}, Lsg/c;->f(Lwf/c;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 307
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 308
    .line 309
    if-ne p1, v0, :cond_11

    .line 310
    .line 311
    goto :goto_a

    .line 312
    :cond_11
    move-object p1, v4

    .line 313
    :goto_a
    if-ne p1, v0, :cond_12

    .line 314
    .line 315
    move-object v4, v0

    .line 316
    goto :goto_e

    .line 317
    :cond_12
    :goto_b
    invoke-virtual {v2}, Lw0/s;->a()V

    .line 318
    .line 319
    .line 320
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-virtual {v3}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    if-eqz v0, :cond_13

    .line 329
    .line 330
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    goto :goto_c

    .line 335
    :cond_13
    move-object v0, v6

    .line 336
    :goto_c
    if-eq p1, v0, :cond_15

    .line 337
    .line 338
    iget-object p1, v1, Lb0/h;->j:Ljava/lang/Runnable;

    .line 339
    .line 340
    if-nez p1, :cond_14

    .line 341
    .line 342
    new-instance p1, La1/a;

    .line 343
    .line 344
    const/4 v0, 0x3

    .line 345
    invoke-direct {p1, v1, v0}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 346
    .line 347
    .line 348
    iput-object p1, v1, Lb0/h;->j:Ljava/lang/Runnable;

    .line 349
    .line 350
    :cond_14
    invoke-virtual {v3, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 351
    .line 352
    .line 353
    goto :goto_d

    .line 354
    :cond_15
    iget-object p1, v1, Lb0/h;->h:Landroid/view/ActionMode;

    .line 355
    .line 356
    if-eqz p1, :cond_16

    .line 357
    .line 358
    invoke-virtual {p1}, Landroid/view/ActionMode;->finish()V

    .line 359
    .line 360
    .line 361
    :cond_16
    :goto_d
    iget-object p1, v1, Lb0/h;->i:Lac/l;

    .line 362
    .line 363
    if-eqz p1, :cond_17

    .line 364
    .line 365
    invoke-virtual {v3, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 366
    .line 367
    .line 368
    :cond_17
    iput-object v6, v1, Lb0/h;->h:Landroid/view/ActionMode;

    .line 369
    .line 370
    :goto_e
    return-object v4

    .line 371
    :goto_f
    invoke-virtual {v2}, Lw0/s;->a()V

    .line 372
    .line 373
    .line 374
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-virtual {v3}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    if-eqz v2, :cond_18

    .line 383
    .line 384
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    goto :goto_10

    .line 389
    :cond_18
    move-object v2, v6

    .line 390
    :goto_10
    if-eq v0, v2, :cond_1a

    .line 391
    .line 392
    iget-object v0, v1, Lb0/h;->j:Ljava/lang/Runnable;

    .line 393
    .line 394
    if-nez v0, :cond_19

    .line 395
    .line 396
    new-instance v0, La1/a;

    .line 397
    .line 398
    const/4 v2, 0x3

    .line 399
    invoke-direct {v0, v1, v2}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 400
    .line 401
    .line 402
    iput-object v0, v1, Lb0/h;->j:Ljava/lang/Runnable;

    .line 403
    .line 404
    :cond_19
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 405
    .line 406
    .line 407
    goto :goto_11

    .line 408
    :cond_1a
    iget-object v0, v1, Lb0/h;->h:Landroid/view/ActionMode;

    .line 409
    .line 410
    if-eqz v0, :cond_1b

    .line 411
    .line 412
    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 413
    .line 414
    .line 415
    :cond_1b
    :goto_11
    iget-object v0, v1, Lb0/h;->i:Lac/l;

    .line 416
    .line 417
    if-eqz v0, :cond_1c

    .line 418
    .line 419
    invoke-virtual {v3, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 420
    .line 421
    .line 422
    :cond_1c
    iput-object v6, v1, Lb0/h;->h:Landroid/view/ActionMode;

    .line 423
    .line 424
    throw p1

    .line 425
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
