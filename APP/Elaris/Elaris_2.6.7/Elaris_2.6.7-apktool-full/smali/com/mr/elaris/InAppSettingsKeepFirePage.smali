.class final Lcom/mr/elaris/InAppSettingsKeepFirePage;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field private static final COLUMN_GAP_DP:F = 8.0f

.field private static final CONTROL_HEIGHT_DP:F = 36.0f

.field private static final STATS_HEIGHT_DP:F = 34.0f


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic a(Lcom/mr/elaris/InAppSettings;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsKeepFirePage;->showDialog(Lcom/mr/elaris/InAppSettings;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 4

    .line 1
    new-instance v0, Lcom/mr/elaris/InAppSettingsKeepFirePage$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/mr/elaris/InAppSettingsKeepFirePage$1;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "keep_fire_enabled"

    .line 7
    .line 8
    const-string v2, "\u7eed\u706b\u5b9a\u65f6\u6d88\u606f"

    .line 9
    .line 10
    const-string v3, "\u6bcf\u5929 00:00 \u540e\u53d1\u4e00\u6b21\uff0c\u70b9\u5f00\u914d\u7f6e"

    .line 11
    .line 12
    invoke-static {p0, v1, v2, v3, v0}, Lcom/mr/elaris/InAppSettingsWidgets;->switchDetailRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private static showDialog(Lcom/mr/elaris/InAppSettings;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "\u4e0b\u6b21 "

    .line 4
    .line 5
    :try_start_0
    new-instance v7, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    iget-object v2, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 8
    .line 9
    invoke-direct {v7, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    const/4 v8, 0x1

    .line 13
    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 14
    .line 15
    .line 16
    const-string v2, "elaris_dialog_surface"

    .line 17
    .line 18
    invoke-virtual {v7, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/high16 v2, 0x41800000    # 16.0f

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/high16 v3, 0x41500000    # 13.0f

    .line 28
    .line 29
    invoke-virtual {v1, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/high16 v4, 0x41300000    # 11.0f

    .line 34
    .line 35
    invoke-virtual {v1, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-virtual {v7, v2, v3, v2, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/mr/elaris/InAppSettings;->dialogPanel()Landroid/graphics/drawable/GradientDrawable;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v7, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 47
    .line 48
    .line 49
    const-string v2, "\u7eed\u706b\u5b9a\u65f6\u6d88\u606f"

    .line 50
    .line 51
    sget v3, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 52
    .line 53
    const/16 v4, 0x11

    .line 54
    .line 55
    invoke-virtual {v1, v2, v4, v3, v8}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v7, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lcom/mr/elaris/f;->z()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    sget v3, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 67
    .line 68
    invoke-virtual {v1, v2, v3}, Lcom/mr/elaris/InAppSettings;->statPill(Ljava/lang/String;I)Landroid/widget/TextView;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-static {}, Lcom/mr/elaris/f;->l()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sget v2, Lcom/mr/elaris/InAppSettings;->GREEN:I

    .line 81
    .line 82
    invoke-virtual {v1, v0, v2}, Lcom/mr/elaris/InAppSettings;->statPill(Ljava/lang/String;I)Landroid/widget/TextView;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    const/4 v9, 0x0

    .line 87
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 91
    .line 92
    .line 93
    new-instance v0, Landroid/widget/LinearLayout;

    .line 94
    .line 95
    iget-object v2, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 96
    .line 97
    invoke-direct {v0, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 101
    .line 102
    .line 103
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 104
    .line 105
    const/high16 v3, 0x42080000    # 34.0f

    .line 106
    .line 107
    invoke-virtual {v1, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    const/high16 v10, 0x3f800000    # 1.0f

    .line 112
    .line 113
    invoke-direct {v2, v9, v6, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    .line 118
    .line 119
    new-instance v2, Landroid/widget/Space;

    .line 120
    .line 121
    iget-object v6, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 122
    .line 123
    invoke-direct {v2, v6}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 124
    .line 125
    .line 126
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 127
    .line 128
    const/high16 v11, 0x41000000    # 8.0f

    .line 129
    .line 130
    invoke-virtual {v1, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    invoke-direct {v6, v12, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 138
    .line 139
    .line 140
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 141
    .line 142
    invoke-virtual {v1, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    invoke-direct {v2, v9, v3, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 150
    .line 151
    .line 152
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 153
    .line 154
    const/4 v12, -0x2

    .line 155
    const/4 v13, -0x1

    .line 156
    invoke-direct {v2, v13, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 164
    .line 165
    invoke-virtual {v7, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, Lcom/mr/elaris/InAppSettings;->keepFireTargetsCompactPreview()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    sget v2, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 173
    .line 174
    const/16 v3, 0xd

    .line 175
    .line 176
    invoke-virtual {v1, v0, v3, v2, v9}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    const/high16 v0, 0x40c00000    # 6.0f

    .line 181
    .line 182
    invoke-virtual {v1, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    invoke-virtual {v6, v9, v0, v9, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 190
    .line 191
    .line 192
    const-string v0, "\u9009\u597d\u53cb"

    .line 193
    .line 194
    invoke-virtual {v1, v0, v9}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    const-string v2, "\u9009\u7fa4"

    .line 199
    .line 200
    invoke-virtual {v1, v2, v9}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    new-instance v3, Lcom/mr/elaris/InAppSettingsKeepFirePage$2;

    .line 205
    .line 206
    invoke-direct {v3, v1, v4, v6}, Lcom/mr/elaris/InAppSettingsKeepFirePage$2;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    .line 211
    .line 212
    new-instance v3, Lcom/mr/elaris/InAppSettingsKeepFirePage$3;

    .line 213
    .line 214
    invoke-direct {v3, v1, v4, v6}, Lcom/mr/elaris/InAppSettingsKeepFirePage$3;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 218
    .line 219
    .line 220
    new-instance v3, Landroid/widget/LinearLayout;

    .line 221
    .line 222
    iget-object v14, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 223
    .line 224
    invoke-direct {v3, v14}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v3, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 228
    .line 229
    .line 230
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 231
    .line 232
    const/high16 v15, 0x42100000    # 36.0f

    .line 233
    .line 234
    invoke-virtual {v1, v15}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 235
    .line 236
    .line 237
    move-result v12

    .line 238
    invoke-direct {v14, v9, v12, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3, v0, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 242
    .line 243
    .line 244
    new-instance v0, Landroid/widget/Space;

    .line 245
    .line 246
    iget-object v12, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 247
    .line 248
    invoke-direct {v0, v12}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 249
    .line 250
    .line 251
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 252
    .line 253
    invoke-virtual {v1, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 254
    .line 255
    .line 256
    move-result v14

    .line 257
    invoke-direct {v12, v14, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3, v0, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 261
    .line 262
    .line 263
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 264
    .line 265
    invoke-virtual {v1, v15}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 266
    .line 267
    .line 268
    move-result v12

    .line 269
    invoke-direct {v0, v9, v12, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v3, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 273
    .line 274
    .line 275
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 276
    .line 277
    const/4 v2, -0x2

    .line 278
    invoke-direct {v0, v13, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 286
    .line 287
    invoke-virtual {v7, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 288
    .line 289
    .line 290
    const-string v0, "00:00"

    .line 291
    .line 292
    invoke-static {}, Lcom/mr/elaris/f;->A()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    invoke-virtual {v1, v0, v2}, Lcom/mr/elaris/InAppSettings;->input(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/EditText;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    const-string v0, "\u6d88\u606f"

    .line 301
    .line 302
    const-string v3, "keep_fire_message"

    .line 303
    .line 304
    const-string v12, ""

    .line 305
    .line 306
    invoke-static {v3, v12}, Lcom/mr/elaris/f;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-virtual {v1, v0, v3}, Lcom/mr/elaris/InAppSettings;->input(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/EditText;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    new-instance v0, Landroid/widget/LinearLayout;

    .line 315
    .line 316
    iget-object v12, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 317
    .line 318
    invoke-direct {v0, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 322
    .line 323
    .line 324
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 325
    .line 326
    const/high16 v14, 0x42c00000    # 96.0f

    .line 327
    .line 328
    invoke-virtual {v1, v14}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 329
    .line 330
    .line 331
    move-result v14

    .line 332
    invoke-virtual {v1, v15}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 333
    .line 334
    .line 335
    move-result v13

    .line 336
    invoke-direct {v12, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v2, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 340
    .line 341
    .line 342
    new-instance v12, Landroid/widget/Space;

    .line 343
    .line 344
    iget-object v13, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 345
    .line 346
    invoke-direct {v12, v13}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 347
    .line 348
    .line 349
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 350
    .line 351
    invoke-virtual {v1, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 352
    .line 353
    .line 354
    move-result v14

    .line 355
    invoke-direct {v13, v14, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0, v12, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 359
    .line 360
    .line 361
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 362
    .line 363
    invoke-virtual {v1, v15}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 364
    .line 365
    .line 366
    move-result v13

    .line 367
    invoke-direct {v12, v9, v13, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0, v3, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 371
    .line 372
    .line 373
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 374
    .line 375
    const/4 v13, -0x2

    .line 376
    const/4 v14, -0x1

    .line 377
    invoke-direct {v12, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v1, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 381
    .line 382
    .line 383
    move-result v13

    .line 384
    iput v13, v12, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 385
    .line 386
    invoke-virtual {v7, v0, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 387
    .line 388
    .line 389
    const-string v0, "\u4fdd\u5b58"

    .line 390
    .line 391
    invoke-virtual {v1, v0, v8}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 392
    .line 393
    .line 394
    move-result-object v12

    .line 395
    const-string v0, "\u7acb\u5373\u53d1\u9001"

    .line 396
    .line 397
    invoke-virtual {v1, v0, v9}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 398
    .line 399
    .line 400
    move-result-object v13

    .line 401
    new-instance v0, Lcom/mr/elaris/InAppSettingsKeepFirePage$4;

    .line 402
    .line 403
    invoke-direct/range {v0 .. v6}, Lcom/mr/elaris/InAppSettingsKeepFirePage$4;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 404
    .line 405
    .line 406
    :try_start_1
    invoke-virtual {v12, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 407
    .line 408
    .line 409
    new-instance v0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 410
    .line 411
    move-object/from16 v1, p0

    .line 412
    .line 413
    :try_start_2
    invoke-direct/range {v0 .. v6}, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v13, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 417
    .line 418
    .line 419
    new-instance v0, Landroid/widget/LinearLayout;

    .line 420
    .line 421
    iget-object v2, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 422
    .line 423
    invoke-direct {v0, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 427
    .line 428
    .line 429
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 430
    .line 431
    invoke-virtual {v1, v15}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    invoke-direct {v2, v9, v3, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v12, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 439
    .line 440
    .line 441
    new-instance v2, Landroid/widget/Space;

    .line 442
    .line 443
    iget-object v3, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 444
    .line 445
    invoke-direct {v2, v3}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 446
    .line 447
    .line 448
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 449
    .line 450
    invoke-virtual {v1, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 451
    .line 452
    .line 453
    move-result v4

    .line 454
    invoke-direct {v3, v4, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 458
    .line 459
    .line 460
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 461
    .line 462
    invoke-virtual {v1, v15}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 463
    .line 464
    .line 465
    move-result v3

    .line 466
    invoke-direct {v2, v9, v3, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v0, v13, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 470
    .line 471
    .line 472
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 473
    .line 474
    const/4 v13, -0x2

    .line 475
    const/4 v14, -0x1

    .line 476
    invoke-direct {v2, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 477
    .line 478
    .line 479
    const/high16 v3, 0x41200000    # 10.0f

    .line 480
    .line 481
    invoke-virtual {v1, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 486
    .line 487
    invoke-virtual {v7, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 488
    .line 489
    .line 490
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 491
    .line 492
    iget-object v2, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 493
    .line 494
    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 498
    .line 499
    .line 500
    move-result-object v9

    .line 501
    new-instance v10, Landroid/widget/ScrollView;

    .line 502
    .line 503
    iget-object v0, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 504
    .line 505
    invoke-direct {v10, v0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v10, v8}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 509
    .line 510
    .line 511
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 512
    .line 513
    const/4 v13, -0x2

    .line 514
    const/4 v14, -0x1

    .line 515
    invoke-direct {v0, v14, v13}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v10, v7, v0}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 519
    .line 520
    .line 521
    const/4 v13, 0x0

    .line 522
    const/4 v14, 0x0

    .line 523
    const/4 v11, 0x0

    .line 524
    const/4 v12, 0x0

    .line 525
    invoke-virtual/range {v9 .. v14}, Landroid/app/AlertDialog;->setView(Landroid/view/View;IIII)V

    .line 526
    .line 527
    .line 528
    new-instance v0, Lcom/mr/elaris/InAppSettingsKeepFirePage$6;

    .line 529
    .line 530
    invoke-direct {v0, v1, v9}, Lcom/mr/elaris/InAppSettingsKeepFirePage$6;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v9, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v9}, Landroid/app/Dialog;->show()V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v1, v9}, Lcom/mr/elaris/InAppSettings;->applyDialogWindowStyle(Landroid/app/AlertDialog;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 540
    .line 541
    .line 542
    return-void

    .line 543
    :catchall_0
    move-exception v0

    .line 544
    goto :goto_0

    .line 545
    :catchall_1
    move-exception v0

    .line 546
    move-object/from16 v1, p0

    .line 547
    .line 548
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 549
    .line 550
    const-string v3, "keep fire settings dialog failed: "

    .line 551
    .line 552
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    const-string v3, ": "

    .line 556
    .line 557
    invoke-static {v0, v2, v3}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    const-string v0, "\u7eed\u706b\u8bbe\u7f6e\u6253\u5f00\u5931\u8d25"

    .line 561
    .line 562
    invoke-virtual {v1, v0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    return-void
.end method
