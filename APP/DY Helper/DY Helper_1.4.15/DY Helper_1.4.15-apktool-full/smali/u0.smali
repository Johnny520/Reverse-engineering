.class public final Lu0;
.super Lq01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lzr1;
.implements Lqp0;
.implements Lx52;


# instance fields
.field public final τ:Lb0;

.field public final synthetic υ:Landroidx/compose/ui/platform/AndroidComposeView;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lu0;->υ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    invoke-direct {p0}, Lq01;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lb0;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p1, v0, p0}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lu0;->τ:Lb0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final Φ(Ldw0;Lkx0;J)Lqx0;
    .locals 6

    .line 1
    invoke-interface {p2, p3, p4}, Lkx0;->ζ(J)Lch1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget v1, p2, Lch1;->ε:I

    .line 6
    .line 7
    iget v2, p2, Lch1;->ζ:I

    .line 8
    .line 9
    new-instance v5, Lt0;

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    invoke-direct {v5, p2, p3}, Lt0;-><init>(Lch1;I)V

    .line 13
    .line 14
    .line 15
    sget-object v3, Lkz;->ε:Lkz;

    .line 16
    .line 17
    iget-object v4, p0, Lu0;->τ:Lb0;

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    invoke-virtual/range {v0 .. v5}, Ldw0;->Ν(IILjava/util/Map;La80;La80;)Lqx0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final Ω(Ljs1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final λ()Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p0, "androidx.compose.ui.layout.WindowInsetsRulers"

    .line 2
    .line 3
    return-object p0
.end method

.method public final В(Landroid/view/KeyEvent;)Z
    .locals 12

    .line 1
    sget-object v0, Lr40;->α:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lh62;->α(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    sget-wide v2, Lwo0;->β:J

    .line 12
    .line 13
    invoke-static {v0, v1, v2, v3}, Lwo0;->α(JJ)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x5

    .line 18
    const/4 v4, 0x6

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x3

    .line 21
    const/4 v7, 0x4

    .line 22
    const/4 v8, 0x1

    .line 23
    const/4 v9, 0x2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    new-instance v0, Lq40;

    .line 27
    .line 28
    invoke-direct {v0, v9}, Lq40;-><init>(I)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :cond_0
    sget-wide v10, Lwo0;->γ:J

    .line 34
    .line 35
    invoke-static {v0, v1, v10, v11}, Lwo0;->α(JJ)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    new-instance v0, Lq40;

    .line 42
    .line 43
    invoke-direct {v0, v8}, Lq40;-><init>(I)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_5

    .line 47
    .line 48
    :cond_1
    sget-wide v10, Lwo0;->ι:J

    .line 49
    .line 50
    invoke-static {v0, v1, v10, v11}, Lwo0;->α(JJ)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    move v0, v9

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move v0, v8

    .line 65
    :goto_0
    new-instance v1, Lq40;

    .line 66
    .line 67
    invoke-direct {v1, v0}, Lq40;-><init>(I)V

    .line 68
    .line 69
    .line 70
    move-object v0, v1

    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_3
    sget-wide v10, Lwo0;->η:J

    .line 74
    .line 75
    invoke-static {v0, v1, v10, v11}, Lwo0;->α(JJ)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    new-instance v0, Lq40;

    .line 82
    .line 83
    invoke-direct {v0, v7}, Lq40;-><init>(I)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_5

    .line 87
    .line 88
    :cond_4
    sget-wide v10, Lwo0;->ζ:J

    .line 89
    .line 90
    invoke-static {v0, v1, v10, v11}, Lwo0;->α(JJ)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_5

    .line 95
    .line 96
    new-instance v0, Lq40;

    .line 97
    .line 98
    invoke-direct {v0, v6}, Lq40;-><init>(I)V

    .line 99
    .line 100
    .line 101
    goto/16 :goto_5

    .line 102
    .line 103
    :cond_5
    sget-wide v10, Lwo0;->δ:J

    .line 104
    .line 105
    invoke-static {v0, v1, v10, v11}, Lwo0;->α(JJ)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-nez v2, :cond_d

    .line 110
    .line 111
    sget-wide v10, Lwo0;->μ:J

    .line 112
    .line 113
    invoke-static {v0, v1, v10, v11}, Lwo0;->α(JJ)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_6

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_6
    sget-wide v10, Lwo0;->ε:J

    .line 121
    .line 122
    invoke-static {v0, v1, v10, v11}, Lwo0;->α(JJ)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-nez v2, :cond_c

    .line 127
    .line 128
    sget-wide v10, Lwo0;->ν:J

    .line 129
    .line 130
    invoke-static {v0, v1, v10, v11}, Lwo0;->α(JJ)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_7

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_7
    sget-wide v10, Lwo0;->θ:J

    .line 138
    .line 139
    invoke-static {v0, v1, v10, v11}, Lwo0;->α(JJ)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-nez v2, :cond_b

    .line 144
    .line 145
    sget-wide v10, Lwo0;->κ:J

    .line 146
    .line 147
    invoke-static {v0, v1, v10, v11}, Lwo0;->α(JJ)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-nez v2, :cond_b

    .line 152
    .line 153
    sget-wide v10, Lwo0;->ξ:J

    .line 154
    .line 155
    invoke-static {v0, v1, v10, v11}, Lwo0;->α(JJ)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_8

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_8
    sget-wide v10, Lwo0;->α:J

    .line 163
    .line 164
    invoke-static {v0, v1, v10, v11}, Lwo0;->α(JJ)Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-nez v2, :cond_a

    .line 169
    .line 170
    sget-wide v10, Lwo0;->λ:J

    .line 171
    .line 172
    invoke-static {v0, v1, v10, v11}, Lwo0;->α(JJ)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_9

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_9
    move-object v0, v5

    .line 180
    goto :goto_5

    .line 181
    :cond_a
    :goto_1
    new-instance v0, Lq40;

    .line 182
    .line 183
    const/16 v1, 0x8

    .line 184
    .line 185
    invoke-direct {v0, v1}, Lq40;-><init>(I)V

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_b
    :goto_2
    new-instance v0, Lq40;

    .line 190
    .line 191
    const/4 v1, 0x7

    .line 192
    invoke-direct {v0, v1}, Lq40;-><init>(I)V

    .line 193
    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_c
    :goto_3
    new-instance v0, Lq40;

    .line 197
    .line 198
    invoke-direct {v0, v4}, Lq40;-><init>(I)V

    .line 199
    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_d
    :goto_4
    new-instance v0, Lq40;

    .line 203
    .line 204
    invoke-direct {v0, v3}, Lq40;-><init>(I)V

    .line 205
    .line 206
    .line 207
    :goto_5
    const/4 v1, 0x0

    .line 208
    if-eqz v0, :cond_1b

    .line 209
    .line 210
    iget v2, v0, Lq40;->α:I

    .line 211
    .line 212
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    if-eqz p1, :cond_e

    .line 217
    .line 218
    return v1

    .line 219
    :cond_e
    iget-object p0, p0, Lu0;->υ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 220
    .line 221
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    check-cast p1, Ly40;

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getEmbeddedViewFocusRect()Lml1;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    new-instance v11, Lb0;

    .line 239
    .line 240
    invoke-direct {v11, v8, v0}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    check-cast v10, Ly40;

    .line 244
    .line 245
    invoke-virtual {v10, v2, p1, v11}, Ly40;->ε(ILml1;La80;)Ljava/lang/Boolean;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    if-eqz p1, :cond_f

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    goto :goto_6

    .line 256
    :cond_f
    move p1, v8

    .line 257
    :goto_6
    if-eqz p1, :cond_10

    .line 258
    .line 259
    return v8

    .line 260
    :cond_10
    if-ne v2, v8, :cond_11

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_11
    if-ne v2, v9, :cond_12

    .line 264
    .line 265
    :goto_7
    move p1, v8

    .line 266
    goto :goto_8

    .line 267
    :cond_12
    move p1, v1

    .line 268
    :goto_8
    if-eqz p1, :cond_1b

    .line 269
    .line 270
    if-ne v2, v3, :cond_13

    .line 271
    .line 272
    const/16 p1, 0x21

    .line 273
    .line 274
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    goto :goto_9

    .line 279
    :cond_13
    if-ne v2, v4, :cond_14

    .line 280
    .line 281
    const/16 p1, 0x82

    .line 282
    .line 283
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    goto :goto_9

    .line 288
    :cond_14
    if-ne v2, v6, :cond_15

    .line 289
    .line 290
    const/16 p1, 0x11

    .line 291
    .line 292
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    goto :goto_9

    .line 297
    :cond_15
    if-ne v2, v7, :cond_16

    .line 298
    .line 299
    const/16 p1, 0x42

    .line 300
    .line 301
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object v5

    .line 305
    goto :goto_9

    .line 306
    :cond_16
    if-ne v2, v8, :cond_17

    .line 307
    .line 308
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v5

    .line 312
    goto :goto_9

    .line 313
    :cond_17
    if-ne v2, v9, :cond_18

    .line 314
    .line 315
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    :cond_18
    :goto_9
    if-eqz v5, :cond_19

    .line 320
    .line 321
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 322
    .line 323
    .line 324
    move-result v9

    .line 325
    :cond_19
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    check-cast v0, Landroid/view/ViewGroup;

    .line 337
    .line 338
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    invoke-virtual {p1, v0, v3, v9}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    if-eqz p1, :cond_1a

    .line 347
    .line 348
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result p1

    .line 352
    if-eqz p1, :cond_1b

    .line 353
    .line 354
    :cond_1a
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    check-cast p0, Ly40;

    .line 359
    .line 360
    invoke-virtual {p0, v2}, Ly40;->η(I)Z

    .line 361
    .line 362
    .line 363
    move-result p0

    .line 364
    return p0

    .line 365
    :cond_1b
    return v1
.end method
