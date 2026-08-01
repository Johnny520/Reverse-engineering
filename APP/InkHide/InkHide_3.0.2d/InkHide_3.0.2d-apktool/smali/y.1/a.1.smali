.class public final Ly/a;
.super Landroid/view/View$AccessibilityDelegate;
.source "SourceFile"


# instance fields
.field public final a:Ly/b;


# direct methods
.method public constructor <init>(Ly/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly/a;->a:Ly/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly/a;->a:Ly/b;

    .line 2
    .line 3
    iget-object v0, v0, Ly/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 3

    .line 1
    iget-object v0, p0, Ly/a;->a:Ly/b;

    .line 2
    .line 3
    iget-object v0, v0, Ly/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View$AccessibilityDelegate;->getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    new-instance v1, LC/j;

    .line 13
    .line 14
    const/16 v2, 0x19

    .line 15
    .line 16
    invoke-direct {v1, v2, p1}, LC/j;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v1, v0

    .line 21
    :goto_0
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object p1, v1, LC/j;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    return-object v0
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly/a;->a:Ly/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ly/b;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v3, Lz/h;

    .line 6
    .line 7
    invoke-direct {v3, v1}, Lz/h;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 8
    .line 9
    .line 10
    sget-object v4, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const-class v5, Ljava/lang/Boolean;

    .line 15
    .line 16
    const/16 v6, 0x1c

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    if-lt v4, v6, :cond_0

    .line 20
    .line 21
    invoke-static {v0}, Ly/E;->d(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const v4, 0x7f09009f

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v4, v7

    .line 45
    :goto_0
    check-cast v4, Ljava/lang/Boolean;

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v4, v8

    .line 59
    :goto_1
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 60
    .line 61
    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"

    .line 62
    .line 63
    if-lt v9, v6, :cond_3

    .line 64
    .line 65
    invoke-static {v1, v4}, Landroidx/emoji2/text/b;->q(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 70
    .line 71
    .line 72
    move-result-object v11

    .line 73
    if-eqz v11, :cond_4

    .line 74
    .line 75
    invoke-virtual {v11, v10, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    and-int/lit8 v12, v12, -0x2

    .line 80
    .line 81
    or-int/2addr v4, v12

    .line 82
    invoke-virtual {v11, v10, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    :cond_4
    :goto_2
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 86
    .line 87
    if-lt v4, v6, :cond_5

    .line 88
    .line 89
    invoke-static {v0}, Ly/E;->c(Landroid/view/View;)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    goto :goto_3

    .line 98
    :cond_5
    const v4, 0x7f09009a

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_6

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_6
    move-object v4, v7

    .line 113
    :goto_3
    check-cast v4, Ljava/lang/Boolean;

    .line 114
    .line 115
    if-eqz v4, :cond_7

    .line 116
    .line 117
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_7

    .line 122
    .line 123
    const/4 v4, 0x1

    .line 124
    goto :goto_4

    .line 125
    :cond_7
    move v4, v8

    .line 126
    :goto_4
    if-lt v9, v6, :cond_8

    .line 127
    .line 128
    invoke-static {v1, v4}, Landroidx/emoji2/text/b;->w(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 129
    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_8
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    if-eqz v5, :cond_a

    .line 137
    .line 138
    invoke-virtual {v5, v10, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    and-int/lit8 v11, v11, -0x3

    .line 143
    .line 144
    if-eqz v4, :cond_9

    .line 145
    .line 146
    const/4 v4, 0x2

    .line 147
    goto :goto_5

    .line 148
    :cond_9
    move v4, v8

    .line 149
    :goto_5
    or-int/2addr v4, v11

    .line 150
    invoke-virtual {v5, v10, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 151
    .line 152
    .line 153
    :cond_a
    :goto_6
    const-class v4, Ljava/lang/CharSequence;

    .line 154
    .line 155
    if-lt v9, v6, :cond_b

    .line 156
    .line 157
    invoke-static {v0}, Ly/E;->b(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    goto :goto_7

    .line 162
    :cond_b
    const v5, 0x7f09009b

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-virtual {v4, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    if-eqz v10, :cond_c

    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_c
    move-object v5, v7

    .line 177
    :goto_7
    check-cast v5, Ljava/lang/CharSequence;

    .line 178
    .line 179
    if-lt v9, v6, :cond_d

    .line 180
    .line 181
    invoke-static {v1, v5}, Landroidx/emoji2/text/b;->p(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 182
    .line 183
    .line 184
    goto :goto_8

    .line 185
    :cond_d
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    .line 190
    .line 191
    invoke-virtual {v6, v10, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 192
    .line 193
    .line 194
    :goto_8
    const/16 v5, 0x1e

    .line 195
    .line 196
    if-lt v9, v5, :cond_e

    .line 197
    .line 198
    invoke-static {v0}, Ly/G;->b(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    goto :goto_9

    .line 203
    :cond_e
    const v6, 0x7f0900a0

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    invoke-virtual {v4, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    if-eqz v4, :cond_f

    .line 215
    .line 216
    move-object v4, v6

    .line 217
    goto :goto_9

    .line 218
    :cond_f
    move-object v4, v7

    .line 219
    :goto_9
    check-cast v4, Ljava/lang/CharSequence;

    .line 220
    .line 221
    if-lt v9, v5, :cond_10

    .line 222
    .line 223
    invoke-static {v1, v4}, Lz/d;->c(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 224
    .line 225
    .line 226
    :goto_a
    move-object/from16 v4, p0

    .line 227
    .line 228
    goto :goto_b

    .line 229
    :cond_10
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    .line 234
    .line 235
    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 236
    .line 237
    .line 238
    goto :goto_a

    .line 239
    :goto_b
    iget-object v5, v4, Ly/a;->a:Ly/b;

    .line 240
    .line 241
    invoke-virtual {v5, v0, v3}, Ly/b;->b(Landroid/view/View;Lz/h;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    const/16 v6, 0x1a

    .line 249
    .line 250
    if-ge v9, v6, :cond_19

    .line 251
    .line 252
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    const-string v9, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"

    .line 257
    .line 258
    invoke-virtual {v6, v9}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"

    .line 266
    .line 267
    invoke-virtual {v6, v10}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    const-string v11, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"

    .line 275
    .line 276
    invoke-virtual {v6, v11}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    const-string v12, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"

    .line 284
    .line 285
    invoke-virtual {v6, v12}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    const v6, 0x7f090099

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v13

    .line 295
    check-cast v13, Landroid/util/SparseArray;

    .line 296
    .line 297
    if-eqz v13, :cond_13

    .line 298
    .line 299
    new-instance v14, Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 302
    .line 303
    .line 304
    move v15, v8

    .line 305
    const/16 v16, 0x1

    .line 306
    .line 307
    :goto_c
    invoke-virtual {v13}, Landroid/util/SparseArray;->size()I

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    if-ge v15, v2, :cond_12

    .line 312
    .line 313
    invoke-virtual {v13, v15}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 318
    .line 319
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    if-nez v2, :cond_11

    .line 324
    .line 325
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    :cond_11
    add-int/lit8 v15, v15, 0x1

    .line 333
    .line 334
    goto :goto_c

    .line 335
    :cond_12
    move v2, v8

    .line 336
    :goto_d
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 337
    .line 338
    .line 339
    move-result v15

    .line 340
    if-ge v2, v15, :cond_14

    .line 341
    .line 342
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v15

    .line 346
    check-cast v15, Ljava/lang/Integer;

    .line 347
    .line 348
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 349
    .line 350
    .line 351
    move-result v15

    .line 352
    invoke-virtual {v13, v15}, Landroid/util/SparseArray;->remove(I)V

    .line 353
    .line 354
    .line 355
    add-int/lit8 v2, v2, 0x1

    .line 356
    .line 357
    goto :goto_d

    .line 358
    :cond_13
    const/16 v16, 0x1

    .line 359
    .line 360
    :cond_14
    instance-of v2, v5, Landroid/text/Spanned;

    .line 361
    .line 362
    if-eqz v2, :cond_15

    .line 363
    .line 364
    move-object v2, v5

    .line 365
    check-cast v2, Landroid/text/Spanned;

    .line 366
    .line 367
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 368
    .line 369
    .line 370
    move-result v7

    .line 371
    const-class v13, Landroid/text/style/ClickableSpan;

    .line 372
    .line 373
    invoke-interface {v2, v8, v7, v13}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    move-object v7, v2

    .line 378
    check-cast v7, [Landroid/text/style/ClickableSpan;

    .line 379
    .line 380
    :cond_15
    if-eqz v7, :cond_1a

    .line 381
    .line 382
    array-length v2, v7

    .line 383
    if-lez v2, :cond_1a

    .line 384
    .line 385
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    const-string v2, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"

    .line 390
    .line 391
    const v13, 0x7f090006

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1, v2, v13}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    check-cast v1, Landroid/util/SparseArray;

    .line 402
    .line 403
    if-nez v1, :cond_16

    .line 404
    .line 405
    new-instance v1, Landroid/util/SparseArray;

    .line 406
    .line 407
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, v6, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    :cond_16
    move v2, v8

    .line 414
    :goto_e
    array-length v6, v7

    .line 415
    if-ge v2, v6, :cond_1a

    .line 416
    .line 417
    aget-object v6, v7, v2

    .line 418
    .line 419
    move v13, v8

    .line 420
    :goto_f
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 421
    .line 422
    .line 423
    move-result v14

    .line 424
    if-ge v13, v14, :cond_18

    .line 425
    .line 426
    invoke-virtual {v1, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v14

    .line 430
    check-cast v14, Ljava/lang/ref/WeakReference;

    .line 431
    .line 432
    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v14

    .line 436
    check-cast v14, Landroid/text/style/ClickableSpan;

    .line 437
    .line 438
    invoke-virtual {v6, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v14

    .line 442
    if-eqz v14, :cond_17

    .line 443
    .line 444
    invoke-virtual {v1, v13}, Landroid/util/SparseArray;->keyAt(I)I

    .line 445
    .line 446
    .line 447
    move-result v6

    .line 448
    goto :goto_10

    .line 449
    :cond_17
    add-int/lit8 v13, v13, 0x1

    .line 450
    .line 451
    goto :goto_f

    .line 452
    :cond_18
    sget v6, Lz/h;->b:I

    .line 453
    .line 454
    add-int/lit8 v13, v6, 0x1

    .line 455
    .line 456
    sput v13, Lz/h;->b:I

    .line 457
    .line 458
    :goto_10
    new-instance v13, Ljava/lang/ref/WeakReference;

    .line 459
    .line 460
    aget-object v14, v7, v2

    .line 461
    .line 462
    invoke-direct {v13, v14}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v1, v6, v13}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    aget-object v13, v7, v2

    .line 469
    .line 470
    move-object v14, v5

    .line 471
    check-cast v14, Landroid/text/Spanned;

    .line 472
    .line 473
    invoke-virtual {v3, v9}, Lz/h;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 474
    .line 475
    .line 476
    move-result-object v15

    .line 477
    invoke-interface {v14, v13}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 478
    .line 479
    .line 480
    move-result v17

    .line 481
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 482
    .line 483
    .line 484
    move-result-object v8

    .line 485
    invoke-interface {v15, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    invoke-virtual {v3, v10}, Lz/h;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 489
    .line 490
    .line 491
    move-result-object v8

    .line 492
    invoke-interface {v14, v13}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 493
    .line 494
    .line 495
    move-result v15

    .line 496
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 497
    .line 498
    .line 499
    move-result-object v15

    .line 500
    invoke-interface {v8, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    invoke-virtual {v3, v11}, Lz/h;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 504
    .line 505
    .line 506
    move-result-object v8

    .line 507
    invoke-interface {v14, v13}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    .line 508
    .line 509
    .line 510
    move-result v13

    .line 511
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 512
    .line 513
    .line 514
    move-result-object v13

    .line 515
    invoke-interface {v8, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    invoke-virtual {v3, v12}, Lz/h;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 519
    .line 520
    .line 521
    move-result-object v8

    .line 522
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 523
    .line 524
    .line 525
    move-result-object v6

    .line 526
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    add-int/lit8 v2, v2, 0x1

    .line 530
    .line 531
    const/4 v8, 0x0

    .line 532
    goto :goto_e

    .line 533
    :cond_19
    const/16 v16, 0x1

    .line 534
    .line 535
    :cond_1a
    const v1, 0x7f090098

    .line 536
    .line 537
    .line 538
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    check-cast v0, Ljava/util/List;

    .line 543
    .line 544
    if-nez v0, :cond_1b

    .line 545
    .line 546
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 547
    .line 548
    :cond_1b
    const/4 v8, 0x0

    .line 549
    :goto_11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 550
    .line 551
    .line 552
    move-result v1

    .line 553
    if-ge v8, v1, :cond_1c

    .line 554
    .line 555
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    check-cast v1, Lz/c;

    .line 560
    .line 561
    iget-object v1, v1, Lz/c;->a:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 564
    .line 565
    iget-object v2, v3, Lz/h;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 566
    .line 567
    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 568
    .line 569
    .line 570
    add-int/lit8 v8, v8, 0x1

    .line 571
    .line 572
    goto :goto_11

    .line 573
    :cond_1c
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly/a;->a:Ly/b;

    .line 2
    .line 3
    iget-object v0, v0, Ly/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly/a;->a:Ly/b;

    .line 2
    .line 3
    iget-object v0, v0, Ly/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly/a;->a:Ly/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Ly/b;->c(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly/a;->a:Ly/b;

    .line 2
    .line 3
    iget-object v0, v0, Ly/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEvent(Landroid/view/View;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly/a;->a:Ly/b;

    .line 2
    .line 3
    iget-object v0, v0, Ly/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
