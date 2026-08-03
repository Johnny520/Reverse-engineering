.class public final synthetic Lwb/n7;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 34
    iput p8, p0, Lwb/n7;->g:I

    iput-object p1, p0, Lwb/n7;->n:Ljava/lang/Object;

    iput-object p2, p0, Lwb/n7;->j:Ljava/lang/Object;

    iput-object p3, p0, Lwb/n7;->h:Ljava/lang/Object;

    iput-object p4, p0, Lwb/n7;->i:Ljava/lang/Object;

    iput-object p5, p0, Lwb/n7;->k:Ljava/lang/Object;

    iput-object p6, p0, Lwb/n7;->l:Ljava/lang/Object;

    iput-object p7, p0, Lwb/n7;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Landroid/content/Context;Lfg/l;Li0/a1;Li0/a1;Li0/a1;Ljava/util/List;)V
    .locals 1

    .line 33
    const/4 v0, 0x1

    iput v0, p0, Lwb/n7;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/n7;->h:Ljava/lang/Object;

    iput-object p2, p0, Lwb/n7;->i:Ljava/lang/Object;

    iput-object p3, p0, Lwb/n7;->j:Ljava/lang/Object;

    iput-object p4, p0, Lwb/n7;->k:Ljava/lang/Object;

    iput-object p5, p0, Lwb/n7;->l:Ljava/lang/Object;

    iput-object p6, p0, Lwb/n7;->m:Ljava/lang/Object;

    iput-object p7, p0, Lwb/n7;->n:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lwb/k6;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/String;Li0/j1;Landroid/content/Context;Lwb/yt;Li0/a1;I)V
    .locals 0

    .line 1
    iput p8, p0, Lwb/n7;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lwb/n7;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p2, p0, Lwb/n7;->j:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, Lwb/n7;->h:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch p8, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iput-object p4, p0, Lwb/n7;->k:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p5, p0, Lwb/n7;->i:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p6, p0, Lwb/n7;->m:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p7, p0, Lwb/n7;->l:Ljava/lang/Object;

    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iput-object p4, p0, Lwb/n7;->l:Ljava/lang/Object;

    .line 25
    .line 26
    iput-object p5, p0, Lwb/n7;->i:Ljava/lang/Object;

    .line 27
    .line 28
    iput-object p6, p0, Lwb/n7;->m:Ljava/lang/Object;

    .line 29
    .line 30
    iput-object p7, p0, Lwb/n7;->k:Ljava/lang/Object;

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/n7;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/n7;->n:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    iget-object v1, p0, Lwb/n7;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/app/Activity;

    .line 13
    .line 14
    iget-object v2, p0, Lwb/n7;->h:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v4, v2

    .line 17
    check-cast v4, Lgg/u;

    .line 18
    .line 19
    iget-object v2, p0, Lwb/n7;->i:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v5, v2

    .line 22
    check-cast v5, Landroid/widget/FrameLayout;

    .line 23
    .line 24
    iget-object v2, p0, Lwb/n7;->k:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v6, v2

    .line 27
    check-cast v6, Lc9/a1;

    .line 28
    .line 29
    iget-object v2, p0, Lwb/n7;->l:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v7, v2

    .line 32
    check-cast v7, Landroid/view/ViewGroup;

    .line 33
    .line 34
    iget-object v2, p0, Lwb/n7;->m:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v8, v2

    .line 37
    check-cast v8, Lfg/a;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v3, Lc9/r0;

    .line 49
    .line 50
    invoke-direct/range {v3 .. v8}, Lc9/r0;-><init>(Lgg/u;Landroid/widget/FrameLayout;Lc9/a1;Landroid/view/ViewGroup;Lfg/a;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    invoke-virtual {v3}, Lc9/r0;->invoke()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    new-instance v0, Lwb/cr;

    .line 72
    .line 73
    const/4 v2, 0x2

    .line 74
    invoke-direct {v0, v3, v2}, Lwb/cr;-><init>(Ljava/lang/Object;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 78
    .line 79
    .line 80
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_0
    iget-object v0, p0, Lwb/n7;->n:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Lwb/k6;

    .line 86
    .line 87
    iget-object v1, p0, Lwb/n7;->j:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v2, v1

    .line 90
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 91
    .line 92
    iget-object v1, p0, Lwb/n7;->h:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v3, v1

    .line 95
    check-cast v3, Ljava/lang/String;

    .line 96
    .line 97
    iget-object v1, p0, Lwb/n7;->l:Ljava/lang/Object;

    .line 98
    .line 99
    move-object v4, v1

    .line 100
    check-cast v4, Li0/j1;

    .line 101
    .line 102
    iget-object v1, p0, Lwb/n7;->i:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v5, v1

    .line 105
    check-cast v5, Landroid/content/Context;

    .line 106
    .line 107
    iget-object v1, p0, Lwb/n7;->m:Ljava/lang/Object;

    .line 108
    .line 109
    move-object v6, v1

    .line 110
    check-cast v6, Lwb/yt;

    .line 111
    .line 112
    iget-object v1, p0, Lwb/n7;->k:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v7, v1

    .line 115
    check-cast v7, Li0/a1;

    .line 116
    .line 117
    invoke-static/range {v2 .. v7}, Lwb/y2;->n1(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/String;Li0/a1;Landroid/content/Context;Lwb/yt;Li0/a1;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lwb/k6;->invoke()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 124
    .line 125
    return-object v0

    .line 126
    :pswitch_1
    iget-object v0, p0, Lwb/n7;->n:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Lwb/k6;

    .line 129
    .line 130
    iget-object v1, p0, Lwb/n7;->j:Ljava/lang/Object;

    .line 131
    .line 132
    move-object v2, v1

    .line 133
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 134
    .line 135
    iget-object v1, p0, Lwb/n7;->h:Ljava/lang/Object;

    .line 136
    .line 137
    move-object v3, v1

    .line 138
    check-cast v3, Ljava/lang/String;

    .line 139
    .line 140
    iget-object v1, p0, Lwb/n7;->k:Ljava/lang/Object;

    .line 141
    .line 142
    move-object v4, v1

    .line 143
    check-cast v4, Li0/a1;

    .line 144
    .line 145
    iget-object v1, p0, Lwb/n7;->i:Ljava/lang/Object;

    .line 146
    .line 147
    move-object v5, v1

    .line 148
    check-cast v5, Landroid/content/Context;

    .line 149
    .line 150
    iget-object v1, p0, Lwb/n7;->m:Ljava/lang/Object;

    .line 151
    .line 152
    move-object v6, v1

    .line 153
    check-cast v6, Lwb/yt;

    .line 154
    .line 155
    iget-object v1, p0, Lwb/n7;->l:Ljava/lang/Object;

    .line 156
    .line 157
    move-object v7, v1

    .line 158
    check-cast v7, Li0/a1;

    .line 159
    .line 160
    invoke-static/range {v2 .. v7}, Lwb/y2;->n1(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/String;Li0/a1;Landroid/content/Context;Lwb/yt;Li0/a1;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Lwb/k6;->invoke()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :pswitch_2
    iget-object v0, p0, Lwb/n7;->n:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Lwb/b4;

    .line 170
    .line 171
    iget-object v1, p0, Lwb/n7;->j:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v1, Landroid/content/SharedPreferences;

    .line 174
    .line 175
    iget-object v2, p0, Lwb/n7;->h:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v2, Ljava/util/Map;

    .line 178
    .line 179
    iget-object v3, p0, Lwb/n7;->i:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v3, Landroid/content/Context;

    .line 182
    .line 183
    iget-object v4, p0, Lwb/n7;->k:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v4, Li0/a1;

    .line 186
    .line 187
    iget-object v5, p0, Lwb/n7;->l:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v5, Li0/a1;

    .line 190
    .line 191
    iget-object v6, p0, Lwb/n7;->m:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v6, Li0/a1;

    .line 194
    .line 195
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    check-cast v7, Ljava/lang/String;

    .line 200
    .line 201
    invoke-static {v7}, Lwb/ho;->y6(Ljava/lang/String;)Ljava/util/Set;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    check-cast v0, Lwb/z3;

    .line 206
    .line 207
    iget-object v0, v0, Lwb/z3;->a:Ljava/lang/String;

    .line 208
    .line 209
    invoke-static {v7, v0}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    invoke-static {v7}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v8

    .line 221
    check-cast v8, Ljava/util/List;

    .line 222
    .line 223
    new-instance v9, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    :cond_2
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    if-eqz v10, :cond_3

    .line 237
    .line 238
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v10

    .line 242
    move-object v11, v10

    .line 243
    check-cast v11, Lo9/r;

    .line 244
    .line 245
    iget-object v11, v11, Lo9/r;->a:Ljava/lang/String;

    .line 246
    .line 247
    invoke-static {v11, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    if-nez v11, :cond_2

    .line 252
    .line 253
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_3
    invoke-static {v1, v0, v7, v9}, Lwb/ho;->i5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v4, v7}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-interface {v5, v9}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    const-string v0, "\u7fa4\u914d\u7f6e\u5df2\u5220\u9664"

    .line 270
    .line 271
    const/4 v1, 0x0

    .line 272
    invoke-static {v3, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 277
    .line 278
    .line 279
    const/4 v0, 0x0

    .line 280
    invoke-interface {v6, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    goto/16 :goto_1

    .line 284
    .line 285
    :pswitch_3
    iget-object v0, p0, Lwb/n7;->h:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, Ljava/util/List;

    .line 288
    .line 289
    iget-object v1, p0, Lwb/n7;->i:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v1, Landroid/content/Context;

    .line 292
    .line 293
    iget-object v2, p0, Lwb/n7;->j:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v2, Lfg/l;

    .line 296
    .line 297
    iget-object v3, p0, Lwb/n7;->k:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v3, Li0/a1;

    .line 300
    .line 301
    iget-object v4, p0, Lwb/n7;->l:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v4, Li0/a1;

    .line 304
    .line 305
    iget-object v5, p0, Lwb/n7;->m:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v5, Li0/a1;

    .line 308
    .line 309
    iget-object v6, p0, Lwb/n7;->n:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v6, Ljava/util/List;

    .line 312
    .line 313
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    const/4 v7, 0x0

    .line 318
    if-eqz v0, :cond_4

    .line 319
    .line 320
    const-string v0, "\u8bf7\u5148\u65b0\u589e\u6a21\u677f"

    .line 321
    .line 322
    invoke-static {v1, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 327
    .line 328
    .line 329
    goto/16 :goto_8

    .line 330
    .line 331
    :cond_4
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    check-cast v0, Ljava/lang/String;

    .line 336
    .line 337
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_5

    .line 342
    .line 343
    const-string v0, "\u8bf7\u5148\u9009\u62e9\u6a21\u677f"

    .line 344
    .line 345
    invoke-static {v1, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 350
    .line 351
    .line 352
    goto/16 :goto_8

    .line 353
    .line 354
    :cond_5
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    check-cast v0, Ljava/util/Set;

    .line 359
    .line 360
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    if-eqz v0, :cond_6

    .line 365
    .line 366
    const-string v0, "\u8bf7\u5148\u9009\u62e9\u7fa4"

    .line 367
    .line 368
    invoke-static {v1, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 373
    .line 374
    .line 375
    goto/16 :goto_8

    .line 376
    .line 377
    :cond_6
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    check-cast v0, Ljava/util/List;

    .line 382
    .line 383
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    invoke-static {v1}, Ltf/y;->a0(I)I

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    const/16 v5, 0x10

    .line 392
    .line 393
    if-ge v1, v5, :cond_7

    .line 394
    .line 395
    move v1, v5

    .line 396
    :cond_7
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 397
    .line 398
    invoke-direct {v5, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 399
    .line 400
    .line 401
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-eqz v1, :cond_9

    .line 410
    .line 411
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    check-cast v1, Lwb/s0;

    .line 416
    .line 417
    iget-object v7, v1, Lwb/s0;->a:Ljava/lang/String;

    .line 418
    .line 419
    iget-object v8, v1, Lwb/s0;->b:Ljava/lang/String;

    .line 420
    .line 421
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 422
    .line 423
    .line 424
    move-result v9

    .line 425
    if-eqz v9, :cond_8

    .line 426
    .line 427
    iget-object v8, v1, Lwb/s0;->a:Ljava/lang/String;

    .line 428
    .line 429
    :cond_8
    invoke-interface {v5, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    goto :goto_3

    .line 433
    :cond_9
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    check-cast v0, Ljava/util/Set;

    .line 438
    .line 439
    check-cast v0, Ljava/lang/Iterable;

    .line 440
    .line 441
    new-instance v1, Ljava/util/ArrayList;

    .line 442
    .line 443
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 444
    .line 445
    .line 446
    move-result v4

    .line 447
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 448
    .line 449
    .line 450
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result v4

    .line 458
    if-eqz v4, :cond_f

    .line 459
    .line 460
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    check-cast v4, Ljava/lang/String;

    .line 465
    .line 466
    invoke-virtual {v5, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v7

    .line 470
    check-cast v7, Ljava/lang/String;

    .line 471
    .line 472
    if-eqz v7, :cond_a

    .line 473
    .line 474
    goto :goto_7

    .line 475
    :cond_a
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 476
    .line 477
    .line 478
    move-result-object v7

    .line 479
    :cond_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 480
    .line 481
    .line 482
    move-result v8

    .line 483
    const/4 v9, 0x0

    .line 484
    if-eqz v8, :cond_c

    .line 485
    .line 486
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v8

    .line 490
    move-object v10, v8

    .line 491
    check-cast v10, Lo9/r;

    .line 492
    .line 493
    iget-object v10, v10, Lo9/r;->a:Ljava/lang/String;

    .line 494
    .line 495
    invoke-static {v10, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v10

    .line 499
    if-eqz v10, :cond_b

    .line 500
    .line 501
    goto :goto_5

    .line 502
    :cond_c
    move-object v8, v9

    .line 503
    :goto_5
    check-cast v8, Lo9/r;

    .line 504
    .line 505
    if-eqz v8, :cond_d

    .line 506
    .line 507
    iget-object v7, v8, Lo9/r;->b:Ljava/lang/String;

    .line 508
    .line 509
    goto :goto_6

    .line 510
    :cond_d
    move-object v7, v9

    .line 511
    :goto_6
    if-eqz v7, :cond_e

    .line 512
    .line 513
    goto :goto_7

    .line 514
    :cond_e
    move-object v7, v4

    .line 515
    :goto_7
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v8

    .line 519
    check-cast v8, Ljava/lang/String;

    .line 520
    .line 521
    new-instance v9, Lo9/r;

    .line 522
    .line 523
    invoke-direct {v9, v4, v7, v8}, Lo9/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    goto :goto_4

    .line 530
    :cond_f
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    :goto_8
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 534
    .line 535
    return-object v0

    .line 536
    :pswitch_4
    iget-object v0, p0, Lwb/n7;->n:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v0, Ljava/util/ArrayList;

    .line 539
    .line 540
    iget-object v1, p0, Lwb/n7;->j:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v1, Lfg/l;

    .line 543
    .line 544
    iget-object v2, p0, Lwb/n7;->h:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast v2, Ljava/util/List;

    .line 547
    .line 548
    iget-object v3, p0, Lwb/n7;->i:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v3, Landroid/content/Context;

    .line 551
    .line 552
    iget-object v4, p0, Lwb/n7;->k:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v4, Li0/a1;

    .line 555
    .line 556
    iget-object v5, p0, Lwb/n7;->l:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v5, Li0/a1;

    .line 559
    .line 560
    iget-object v6, p0, Lwb/n7;->m:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v6, Li0/a1;

    .line 563
    .line 564
    new-instance v7, Ljava/util/HashSet;

    .line 565
    .line 566
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 570
    .line 571
    .line 572
    move-result-object v8

    .line 573
    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 574
    .line 575
    .line 576
    move-result v9

    .line 577
    if-eqz v9, :cond_10

    .line 578
    .line 579
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v9

    .line 583
    check-cast v9, Le9/c;

    .line 584
    .line 585
    iget-object v9, v9, Le9/c;->b:Ljava/lang/String;

    .line 586
    .line 587
    invoke-virtual {v7, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    goto :goto_9

    .line 591
    :cond_10
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 592
    .line 593
    invoke-interface {v4, v8}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    invoke-interface {v5, v8}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    sget-object v4, Ltf/v;->g:Ltf/v;

    .line 600
    .line 601
    invoke-interface {v6, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 602
    .line 603
    .line 604
    new-instance v4, Ljava/util/ArrayList;

    .line 605
    .line 606
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 607
    .line 608
    .line 609
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    :cond_11
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 614
    .line 615
    .line 616
    move-result v5

    .line 617
    if-eqz v5, :cond_12

    .line 618
    .line 619
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v5

    .line 623
    move-object v6, v5

    .line 624
    check-cast v6, Le9/c;

    .line 625
    .line 626
    iget-object v6, v6, Le9/c;->b:Ljava/lang/String;

    .line 627
    .line 628
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    move-result v6

    .line 632
    if-nez v6, :cond_11

    .line 633
    .line 634
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    goto :goto_a

    .line 638
    :cond_12
    invoke-interface {v1, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 642
    .line 643
    .line 644
    move-result v0

    .line 645
    const-string v1, "\u5df2\u5220\u9664 "

    .line 646
    .line 647
    const-string v2, " \u4e2a\u4f1a\u8bdd\u89c4\u5219"

    .line 648
    .line 649
    const/4 v4, 0x0

    .line 650
    invoke-static {v1, v0, v2, v3, v4}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 651
    .line 652
    .line 653
    goto/16 :goto_1

    .line 654
    .line 655
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
