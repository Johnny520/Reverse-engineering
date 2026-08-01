.class final Lcom/mr/elaris/InAppSettingsClockInPage;
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
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsClockInPage;->showDialog(Lcom/mr/elaris/InAppSettings;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 4

    .line 1
    new-instance v0, Lcom/mr/elaris/InAppSettingsClockInPage$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/mr/elaris/InAppSettingsClockInPage$1;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "enable_auto_clock_in"

    .line 7
    .line 8
    const-string v2, "\u81ea\u52a8\u7fa4\u6253\u5361"

    .line 9
    .line 10
    const-string v3, "\u6bcf\u5929 00:00 \u540e\u68c0\u67e5\u672a\u6253\u5361\u7fa4\uff0c\u70b9\u5f00\u914d\u7f6e"

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
    .locals 14

    .line 1
    const-string v0, "\u4e0b\u6b21 "

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Landroid/widget/LinearLayout;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 12
    .line 13
    .line 14
    const-string v3, "elaris_dialog_surface"

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/high16 v3, 0x41800000    # 16.0f

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/high16 v4, 0x41500000    # 13.0f

    .line 26
    .line 27
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/high16 v5, 0x41300000    # 11.0f

    .line 32
    .line 33
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-virtual {v1, v3, v4, v3, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->dialogPanel()Landroid/graphics/drawable/GradientDrawable;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    const-string v3, "\u81ea\u52a8\u7fa4\u6253\u5361"

    .line 48
    .line 49
    sget v4, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 50
    .line 51
    const/16 v5, 0x11

    .line 52
    .line 53
    invoke-virtual {p0, v3, v5, v4, v2}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->clockInCountText()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    sget v4, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 65
    .line 66
    invoke-virtual {p0, v3, v4}, Lcom/mr/elaris/InAppSettings;->statPill(Ljava/lang/String;I)Landroid/widget/TextView;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {}, La7;->t()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sget v4, Lcom/mr/elaris/InAppSettings;->GREEN:I

    .line 79
    .line 80
    invoke-virtual {p0, v0, v4}, Lcom/mr/elaris/InAppSettings;->statPill(Ljava/lang/String;I)Landroid/widget/TextView;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const/4 v4, 0x0

    .line 85
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 89
    .line 90
    .line 91
    new-instance v5, Landroid/widget/LinearLayout;

    .line 92
    .line 93
    iget-object v6, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 94
    .line 95
    invoke-direct {v5, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 99
    .line 100
    .line 101
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 102
    .line 103
    const/high16 v7, 0x42080000    # 34.0f

    .line 104
    .line 105
    invoke-virtual {p0, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    const/high16 v9, 0x3f800000    # 1.0f

    .line 110
    .line 111
    invoke-direct {v6, v4, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5, v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 115
    .line 116
    .line 117
    new-instance v6, Landroid/widget/Space;

    .line 118
    .line 119
    iget-object v8, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 120
    .line 121
    invoke-direct {v6, v8}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 122
    .line 123
    .line 124
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 125
    .line 126
    const/high16 v10, 0x41000000    # 8.0f

    .line 127
    .line 128
    invoke-virtual {p0, v10}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 129
    .line 130
    .line 131
    move-result v11

    .line 132
    invoke-direct {v8, v11, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5, v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 136
    .line 137
    .line 138
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 139
    .line 140
    invoke-virtual {p0, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    invoke-direct {v6, v4, v7, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5, v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 148
    .line 149
    .line 150
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 151
    .line 152
    const/4 v6, -0x2

    .line 153
    const/4 v7, -0x1

    .line 154
    invoke-direct {v0, v7, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, v10}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    iput v8, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 162
    .line 163
    invoke-virtual {v1, v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 164
    .line 165
    .line 166
    const-string v0, "00:00 \u540e\u68c0\u67e5\u672a\u6253\u5361\u7fa4\uff1b\u9700\u8981\u65f6\u53ef\u7acb\u5373\u6267\u884c"

    .line 167
    .line 168
    sget v5, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 169
    .line 170
    const/16 v8, 0xc

    .line 171
    .line 172
    invoke-virtual {p0, v0, v8, v5, v4}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    const/high16 v5, 0x40c00000    # 6.0f

    .line 177
    .line 178
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    invoke-virtual {v0, v4, v5, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->selectedGroupsPreview()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    sget v5, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 193
    .line 194
    invoke-virtual {p0, v0, v8, v5, v4}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 199
    .line 200
    .line 201
    sget-object v5, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 202
    .line 203
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 204
    .line 205
    .line 206
    const/high16 v5, 0x40400000    # 3.0f

    .line 207
    .line 208
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    invoke-virtual {v0, v4, v5, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 216
    .line 217
    .line 218
    const-string v5, "\u9009\u62e9\u7fa4"

    .line 219
    .line 220
    invoke-virtual {p0, v5, v4}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    const-string v8, "\u7acb\u5373\u6267\u884c"

    .line 225
    .line 226
    invoke-virtual {p0, v8, v2}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    new-instance v11, Lcom/mr/elaris/InAppSettingsClockInPage$2;

    .line 231
    .line 232
    invoke-direct {v11, p0, v3, v0}, Lcom/mr/elaris/InAppSettingsClockInPage$2;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v5, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 236
    .line 237
    .line 238
    new-instance v0, Lcom/mr/elaris/InAppSettingsClockInPage$3;

    .line 239
    .line 240
    invoke-direct {v0, p0, v3}, Lcom/mr/elaris/InAppSettingsClockInPage$3;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v8, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 244
    .line 245
    .line 246
    new-instance v0, Landroid/widget/LinearLayout;

    .line 247
    .line 248
    iget-object v3, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 249
    .line 250
    invoke-direct {v0, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 254
    .line 255
    .line 256
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 257
    .line 258
    const/high16 v11, 0x42100000    # 36.0f

    .line 259
    .line 260
    invoke-virtual {p0, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 261
    .line 262
    .line 263
    move-result v12

    .line 264
    invoke-direct {v3, v4, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 268
    .line 269
    .line 270
    new-instance v3, Landroid/widget/Space;

    .line 271
    .line 272
    iget-object v5, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 273
    .line 274
    invoke-direct {v3, v5}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 275
    .line 276
    .line 277
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 278
    .line 279
    invoke-virtual {p0, v10}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    invoke-direct {v5, v10, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 287
    .line 288
    .line 289
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 290
    .line 291
    invoke-virtual {p0, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    invoke-direct {v3, v4, v5, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v8, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 299
    .line 300
    .line 301
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 302
    .line 303
    invoke-direct {v3, v7, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 304
    .line 305
    .line 306
    const/high16 v4, 0x41200000    # 10.0f

    .line 307
    .line 308
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 313
    .line 314
    invoke-virtual {v1, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 315
    .line 316
    .line 317
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 318
    .line 319
    iget-object v3, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 320
    .line 321
    invoke-direct {v0, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 325
    .line 326
    .line 327
    move-result-object v8

    .line 328
    new-instance v9, Landroid/widget/ScrollView;

    .line 329
    .line 330
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 331
    .line 332
    invoke-direct {v9, v0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v9, v2}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 336
    .line 337
    .line 338
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 339
    .line 340
    invoke-direct {v0, v7, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v9, v1, v0}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 344
    .line 345
    .line 346
    const/4 v12, 0x0

    .line 347
    const/4 v13, 0x0

    .line 348
    const/4 v10, 0x0

    .line 349
    const/4 v11, 0x0

    .line 350
    invoke-virtual/range {v8 .. v13}, Landroid/app/AlertDialog;->setView(Landroid/view/View;IIII)V

    .line 351
    .line 352
    .line 353
    new-instance v0, Lcom/mr/elaris/InAppSettingsClockInPage$4;

    .line 354
    .line 355
    invoke-direct {v0, p0, v8}, Lcom/mr/elaris/InAppSettingsClockInPage$4;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v8, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v8}, Landroid/app/Dialog;->show()V

    .line 362
    .line 363
    .line 364
    invoke-virtual {p0, v8}, Lcom/mr/elaris/InAppSettings;->applyDialogWindowStyle(Landroid/app/AlertDialog;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 365
    .line 366
    .line 367
    return-void

    .line 368
    :catchall_0
    move-exception v0

    .line 369
    new-instance v1, Ljava/lang/StringBuilder;

    .line 370
    .line 371
    const-string v2, "clock in settings dialog failed: "

    .line 372
    .line 373
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    const-string v2, ": "

    .line 377
    .line 378
    invoke-static {v0, v1, v2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    const-string v0, "\u6253\u5361\u8bbe\u7f6e\u6253\u5f00\u5931\u8d25"

    .line 382
    .line 383
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    return-void
.end method
