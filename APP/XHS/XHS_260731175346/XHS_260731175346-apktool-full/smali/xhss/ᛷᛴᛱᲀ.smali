.class public final Lxhss/ᛷᛴᛱᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

.field public ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

.field public ᛷᛴᛷᛱ:Lxhss/ᲀᛴᛱᛷ;

.field public ᛷᛵᛵᲈ:Z

.field public ᛸᛲᲀᛵ:Lxhss/ᛸᲀᲈᛳ;

.field public ᛸᛴᛶᛳ:Z

.field public ᲀᲇᛳᲁ:I

.field public ᲇᛴᲇᛵ:Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

.field public ᲇᛶᛴᲀ:Lxhss/ᲇᲇᛱ;


# virtual methods
.method public final ᛱᛱᛲᲇ(Lxhss/ᲀᛳᛲᛶ;Lxhss/ᲇᲇᛱ;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    iget-object p1, p1, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Lxhss/ᛵᛸᛱ;->ᛸᛴᛶᛳ(I)Lxhss/ᲀᲈᲈᛸ;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1, v1}, Lxhss/ᛵᛸᛱ;->ᛳᲈᲈᛲ(I)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x1

    .line 18
    const/4 v5, 0x0

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    iget v2, v2, Lxhss/ᲀᲈᲈᛸ;->ᲇᛴᲇᛵ:I

    .line 22
    .line 23
    if-lez v2, :cond_0

    .line 24
    .line 25
    move v2, v4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v2, v5

    .line 28
    :goto_0
    iput-boolean v2, v0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛴᛷᛱ:Z

    .line 29
    .line 30
    iput-object p2, p0, Lxhss/ᛷᛴᛱᲀ;->ᲇᛶᛴᲀ:Lxhss/ᲇᲇᛱ;

    .line 31
    .line 32
    invoke-virtual {p1}, Lxhss/ᛵᛸᛱ;->ᲀᲇᛳᲁ()Lxhss/ᛷᛵᛳᛸ;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, Lxhss/ᛷᛵᛳᛸ;->ᛷᛵᛵᲈ:Landroid/view/DisplayCutout;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/DisplayCutout;->getSafeInsetTop()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v0}, Landroid/view/DisplayCutout;->getSafeInsetLeft()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {v0}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-virtual {v0}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move v0, v5

    .line 58
    move v2, v0

    .line 59
    move v3, v2

    .line 60
    move v6, v3

    .line 61
    :goto_1
    const/16 v7, 0x20f

    .line 62
    .line 63
    invoke-virtual {p1, v7}, Lxhss/ᛵᛸᛱ;->ᛸᛴᛶᛳ(I)Lxhss/ᲀᲈᲈᛸ;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    iget v8, v7, Lxhss/ᲀᲈᲈᛸ;->ᛷᛵᛵᲈ:I

    .line 68
    .line 69
    iget v9, v7, Lxhss/ᲀᲈᲈᛸ;->ᛱᛱᛲᲇ:I

    .line 70
    .line 71
    iget v10, v7, Lxhss/ᲀᲈᲈᛸ;->ᲇᛴᲇᛵ:I

    .line 72
    .line 73
    iget v11, v7, Lxhss/ᲀᲈᲈᛸ;->ᛳᲁᲇᛸ:I

    .line 74
    .line 75
    iget-object v12, p0, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 76
    .line 77
    invoke-virtual {v12}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    invoke-virtual {v12}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v1}, Lxhss/ᛵᛸᛱ;->ᛳᲈᲈᛲ(I)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    const/4 v12, 0x2

    .line 89
    if-nez v1, :cond_3

    .line 90
    .line 91
    invoke-virtual {p1, v12}, Lxhss/ᛵᛸᛱ;->ᛳᲈᲈᛲ(I)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_2

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    move v1, v5

    .line 99
    goto :goto_3

    .line 100
    :cond_3
    :goto_2
    move v1, v10

    .line 101
    :goto_3
    invoke-virtual {p1, v4}, Lxhss/ᛵᛸᛱ;->ᛳᲈᲈᛲ(I)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_4

    .line 106
    .line 107
    move p1, v9

    .line 108
    goto :goto_4

    .line 109
    :cond_4
    move p1, v5

    .line 110
    :goto_4
    if-nez v9, :cond_b

    .line 111
    .line 112
    if-nez v10, :cond_b

    .line 113
    .line 114
    iget v7, v7, Lxhss/ᲀᲈᲈᛸ;->ᛷᛵᛵᲈ:I

    .line 115
    .line 116
    if-nez v7, :cond_b

    .line 117
    .line 118
    if-nez v11, :cond_b

    .line 119
    .line 120
    sget p1, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛴᲈᛱᛴ:I

    .line 121
    .line 122
    iget-object p1, p0, Lxhss/ᛷᛴᛱᲀ;->ᲇᛴᲇᛵ:Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 123
    .line 124
    if-nez p1, :cond_5

    .line 125
    .line 126
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ()Landroid/app/Activity;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    goto :goto_5

    .line 131
    :cond_5
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    :goto_5
    if-nez p1, :cond_6

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 147
    .line 148
    if-ne v0, v12, :cond_8

    .line 149
    .line 150
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eq p1, v4, :cond_8

    .line 163
    .line 164
    const/4 v0, 0x3

    .line 165
    if-eq p1, v0, :cond_7

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_7
    invoke-virtual {p0}, Lxhss/ᛷᛴᛱᲀ;->ᛷᛴᛷᛱ()I

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    iput p1, p2, Lxhss/ᲇᲇᛱ;->ᛳᲁᲇᛸ:I

    .line 173
    .line 174
    invoke-virtual {p0}, Lxhss/ᛷᛴᛱᲀ;->ᲇᛴᲇᛵ()I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    iput p1, p2, Lxhss/ᲇᲇᛱ;->ᛷᛵᛵᲈ:I

    .line 179
    .line 180
    goto :goto_7

    .line 181
    :cond_8
    :goto_6
    invoke-virtual {p0}, Lxhss/ᛷᛴᛱᲀ;->ᛷᛴᛷᛱ()I

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    iput p1, p2, Lxhss/ᲇᲇᛱ;->ᛱᛱᛲᲇ:I

    .line 186
    .line 187
    invoke-virtual {p0}, Lxhss/ᛷᛴᛱᲀ;->ᲇᛴᲇᛵ()I

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    iput p1, p2, Lxhss/ᲇᲇᛱ;->ᲇᛴᲇᛵ:I

    .line 192
    .line 193
    :goto_7
    iput-boolean v4, p0, Lxhss/ᛷᛴᛱᲀ;->ᛸᛴᛶᛳ:Z

    .line 194
    .line 195
    invoke-virtual {p0}, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ()Landroid/view/View;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    if-nez p1, :cond_9

    .line 200
    .line 201
    goto/16 :goto_a

    .line 202
    .line 203
    :cond_9
    iget-object v0, p0, Lxhss/ᛷᛴᛱᲀ;->ᛸᛲᲀᛵ:Lxhss/ᛸᲀᲈᛳ;

    .line 204
    .line 205
    if-eqz v0, :cond_a

    .line 206
    .line 207
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    iget-object v1, p0, Lxhss/ᛷᛴᛱᲀ;->ᛸᛲᲀᛵ:Lxhss/ᛸᲀᲈᛳ;

    .line 212
    .line 213
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 214
    .line 215
    .line 216
    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    new-instance v1, Lxhss/ᛸᲀᲈᛳ;

    .line 221
    .line 222
    invoke-direct {v1, p0, p1}, Lxhss/ᛸᲀᲈᛳ;-><init>(Lxhss/ᛷᛴᛱᲀ;Landroid/view/View;)V

    .line 223
    .line 224
    .line 225
    iput-object v1, p0, Lxhss/ᛷᛴᛱᲀ;->ᛸᛲᲀᛵ:Lxhss/ᛸᲀᲈᛳ;

    .line 226
    .line 227
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 228
    .line 229
    .line 230
    goto :goto_a

    .line 231
    :cond_b
    iput-boolean v5, p0, Lxhss/ᛷᛴᛱᲀ;->ᛸᛴᛶᛳ:Z

    .line 232
    .line 233
    iget-object v7, p0, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

    .line 234
    .line 235
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    iget v7, p2, Lxhss/ᲇᲇᛱ;->ᛱᛱᛲᲇ:I

    .line 239
    .line 240
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    add-int/2addr p1, v7

    .line 245
    iput p1, p2, Lxhss/ᲇᲇᛱ;->ᛱᛱᛲᲇ:I

    .line 246
    .line 247
    iget-object p1, p0, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    iget p1, p2, Lxhss/ᲇᲇᛱ;->ᲇᛴᲇᛵ:I

    .line 253
    .line 254
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    add-int/2addr v0, p1

    .line 259
    iput v0, p2, Lxhss/ᲇᲇᛱ;->ᲇᛴᲇᛵ:I

    .line 260
    .line 261
    iget-object p1, p0, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 262
    .line 263
    sget v0, Lxhss/ᛷᛱᛴᛴ;->ᛷᛵᛵᲈ:I

    .line 264
    .line 265
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    if-ne p1, v4, :cond_c

    .line 270
    .line 271
    goto :goto_8

    .line 272
    :cond_c
    move v4, v5

    .line 273
    :goto_8
    iget-object p1, p0, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget p1, p2, Lxhss/ᲇᲇᛱ;->ᛷᛵᛵᲈ:I

    .line 279
    .line 280
    if-eqz v4, :cond_d

    .line 281
    .line 282
    invoke-static {v11, v6}, Ljava/lang/Math;->max(II)I

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    add-int/2addr v0, p1

    .line 287
    iput v0, p2, Lxhss/ᲇᲇᛱ;->ᛷᛵᛵᲈ:I

    .line 288
    .line 289
    goto :goto_9

    .line 290
    :cond_d
    invoke-static {v8, v3}, Ljava/lang/Math;->max(II)I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    add-int/2addr v0, p1

    .line 295
    iput v0, p2, Lxhss/ᲇᲇᛱ;->ᛷᛵᛵᲈ:I

    .line 296
    .line 297
    :goto_9
    iget-object p1, p0, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

    .line 298
    .line 299
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    iget p1, p2, Lxhss/ᲇᲇᛱ;->ᛳᲁᲇᛸ:I

    .line 303
    .line 304
    if-eqz v4, :cond_e

    .line 305
    .line 306
    invoke-static {v8, v3}, Ljava/lang/Math;->max(II)I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    add-int/2addr v0, p1

    .line 311
    iput v0, p2, Lxhss/ᲇᲇᛱ;->ᛳᲁᲇᛸ:I

    .line 312
    .line 313
    goto :goto_a

    .line 314
    :cond_e
    invoke-static {v11, v6}, Ljava/lang/Math;->max(II)I

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    add-int/2addr v0, p1

    .line 319
    iput v0, p2, Lxhss/ᲇᲇᛱ;->ᛳᲁᲇᛸ:I

    .line 320
    .line 321
    :goto_a
    invoke-virtual {p0, p2}, Lxhss/ᛷᛴᛱᲀ;->ᛷᛵᛵᲈ(Lxhss/ᲇᲇᛱ;)V

    .line 322
    .line 323
    .line 324
    :cond_f
    return-void
.end method

.method public final ᛳᲁᲇᛸ()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛴᛱᲀ;->ᲇᛴᲇᛵ:Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    if-nez p0, :cond_1

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return-object p0

    .line 18
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final ᛷᛴᛷᛱ()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lxhss/ᛷᛴᛱᲀ;->ᲇᛶᛴᲀ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getWindowInsetsController()Landroid/view/WindowInsetsController;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Landroid/view/WindowInsetsController;->getSystemBarsBehavior()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    and-int/lit16 v0, v0, 0x2000

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    iget-object v0, p0, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    iget-object p0, p0, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    :goto_0
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    :goto_1
    const-string v0, "dimen"

    .line 60
    .line 61
    const-string v1, "android"

    .line 62
    .line 63
    const-string v2, "status_bar_height"

    .line 64
    .line 65
    invoke-virtual {p0, v2, v0, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-lez v0, :cond_4

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    return p0

    .line 76
    :cond_4
    :goto_2
    const/4 p0, 0x0

    .line 77
    return p0
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᲇᲇᛱ;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v1, p1, Lxhss/ᲇᲇᛱ;->ᛷᛵᛵᲈ:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {v0, v2}, Lxhss/ᲇᛵᛲᲁ;->ᛸᛶᲈᛶ(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/2addr v0, v1

    .line 14
    iput v0, p1, Lxhss/ᲇᲇᛱ;->ᛷᛵᛵᲈ:I

    .line 15
    .line 16
    iget v0, p1, Lxhss/ᲇᲇᛱ;->ᛱᛱᛲᲇ:I

    .line 17
    .line 18
    iget-object v1, p0, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-virtual {v1, v2}, Lxhss/ᲇᛵᛲᲁ;->ᛸᛶᲈᛶ(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/2addr v1, v0

    .line 26
    iput v1, p1, Lxhss/ᲇᲇᛱ;->ᛱᛱᛲᲇ:I

    .line 27
    .line 28
    iget v0, p1, Lxhss/ᲇᲇᛱ;->ᛳᲁᲇᛸ:I

    .line 29
    .line 30
    iget-object v1, p0, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

    .line 31
    .line 32
    const/4 v3, 0x3

    .line 33
    invoke-virtual {v1, v3}, Lxhss/ᲇᛵᛲᲁ;->ᛸᛶᲈᛶ(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v1, v0

    .line 38
    iput v1, p1, Lxhss/ᲇᲇᛱ;->ᛳᲁᲇᛸ:I

    .line 39
    .line 40
    iget v0, p1, Lxhss/ᲇᲇᛱ;->ᲇᛴᲇᛵ:I

    .line 41
    .line 42
    iget-object v1, p0, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

    .line 43
    .line 44
    const/4 v3, 0x4

    .line 45
    invoke-virtual {v1, v3}, Lxhss/ᲇᛵᛲᲁ;->ᛸᛶᲈᛶ(I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    add-int/2addr v1, v0

    .line 50
    iput v1, p1, Lxhss/ᲇᲇᛱ;->ᲇᛴᲇᛵ:I

    .line 51
    .line 52
    iget-object v0, p0, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iget v3, p1, Lxhss/ᲇᲇᛱ;->ᛷᛵᛵᲈ:I

    .line 58
    .line 59
    iget v4, p1, Lxhss/ᲇᲇᛱ;->ᛱᛱᛲᲇ:I

    .line 60
    .line 61
    iget v5, p1, Lxhss/ᲇᲇᛱ;->ᛳᲁᲇᛸ:I

    .line 62
    .line 63
    sget v6, Lxhss/ᛷᛱᛴᛴ;->ᛷᛵᛵᲈ:I

    .line 64
    .line 65
    invoke-virtual {v0, v3, v4, v5, v1}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 66
    .line 67
    .line 68
    :goto_0
    iget v0, p1, Lxhss/ᲇᲇᛱ;->ᛷᛵᛵᲈ:I

    .line 69
    .line 70
    iget v1, p1, Lxhss/ᲇᲇᛱ;->ᛱᛱᛲᲇ:I

    .line 71
    .line 72
    iget v3, p1, Lxhss/ᲇᲇᛱ;->ᛳᲁᲇᛸ:I

    .line 73
    .line 74
    iget p1, p1, Lxhss/ᲇᲇᛱ;->ᲇᛴᲇᛵ:I

    .line 75
    .line 76
    iget-boolean v4, p0, Lxhss/ᛷᛴᛱᲀ;->ᛸᛴᛶᛳ:Z

    .line 77
    .line 78
    iget v5, p0, Lxhss/ᛷᛴᛱᲀ;->ᲀᲇᛳᲁ:I

    .line 79
    .line 80
    sget v6, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛴᲈᛱᛴ:I

    .line 81
    .line 82
    iget-object p0, p0, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

    .line 83
    .line 84
    if-eqz v4, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    const/4 v5, 0x0

    .line 88
    :goto_1
    add-int/2addr p1, v5

    .line 89
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 92
    .line 93
    iget-object v4, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲈᲈᛲ:Landroid/graphics/Rect;

    .line 94
    .line 95
    if-nez v4, :cond_3

    .line 96
    .line 97
    new-instance v4, Landroid/graphics/Rect;

    .line 98
    .line 99
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v4, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲈᲈᛲ:Landroid/graphics/Rect;

    .line 103
    .line 104
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    const/4 v5, 0x0

    .line 109
    if-eqz v4, :cond_5

    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-static {v5, v4}, Lxhss/ᲀᛳᛲᛶ;->ᛱᛱᛲᲇ(Landroid/view/View;Landroid/view/WindowInsets;)Lxhss/ᲀᛳᛲᛶ;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    iget-object v4, v4, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 120
    .line 121
    invoke-virtual {v4, v2}, Lxhss/ᛵᛸᛱ;->ᛳᲈᲈᛲ(I)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    const/16 v6, 0x8

    .line 126
    .line 127
    invoke-virtual {v4, v6}, Lxhss/ᛵᛸᛱ;->ᛳᲈᲈᛲ(I)Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-nez v6, :cond_5

    .line 132
    .line 133
    if-eqz v2, :cond_5

    .line 134
    .line 135
    const/16 v2, 0x207

    .line 136
    .line 137
    invoke-virtual {v4, v2}, Lxhss/ᛵᛸᛱ;->ᛸᛴᛶᛳ(I)Lxhss/ᲀᲈᲈᛸ;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    iget v4, v2, Lxhss/ᲀᲈᲈᛸ;->ᲇᛴᲇᛵ:I

    .line 142
    .line 143
    if-ne v4, p1, :cond_4

    .line 144
    .line 145
    iget v4, v2, Lxhss/ᲀᲈᲈᛸ;->ᛱᛱᛲᲇ:I

    .line 146
    .line 147
    if-ne v4, v1, :cond_4

    .line 148
    .line 149
    iget v4, v2, Lxhss/ᲀᲈᲈᛸ;->ᛷᛵᛵᲈ:I

    .line 150
    .line 151
    if-ne v4, v0, :cond_4

    .line 152
    .line 153
    iget v4, v2, Lxhss/ᲀᲈᲈᛸ;->ᛳᲁᲇᛸ:I

    .line 154
    .line 155
    if-ne v4, v3, :cond_4

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_4
    move-object v5, v2

    .line 159
    :cond_5
    :goto_2
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲈᲈᛲ:Landroid/graphics/Rect;

    .line 160
    .line 161
    if-eqz v5, :cond_6

    .line 162
    .line 163
    iget v4, v5, Lxhss/ᲀᲈᲈᛸ;->ᛷᛵᛵᲈ:I

    .line 164
    .line 165
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    iput v0, v2, Landroid/graphics/Rect;->left:I

    .line 170
    .line 171
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲈᲈᛲ:Landroid/graphics/Rect;

    .line 172
    .line 173
    iget v2, v5, Lxhss/ᲀᲈᲈᛸ;->ᛱᛱᛲᲇ:I

    .line 174
    .line 175
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 180
    .line 181
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲈᲈᛲ:Landroid/graphics/Rect;

    .line 182
    .line 183
    iget v1, v5, Lxhss/ᲀᲈᲈᛸ;->ᛳᲁᲇᛸ:I

    .line 184
    .line 185
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 190
    .line 191
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲈᲈᛲ:Landroid/graphics/Rect;

    .line 192
    .line 193
    iget v1, v5, Lxhss/ᲀᲈᲈᛸ;->ᲇᛴᲇᛵ:I

    .line 194
    .line 195
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    iput p1, v0, Landroid/graphics/Rect;->bottom:I

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_6
    iput v0, v2, Landroid/graphics/Rect;->left:I

    .line 203
    .line 204
    iput v1, v2, Landroid/graphics/Rect;->top:I

    .line 205
    .line 206
    iput v3, v2, Landroid/graphics/Rect;->right:I

    .line 207
    .line 208
    iput p1, v2, Landroid/graphics/Rect;->bottom:I

    .line 209
    .line 210
    :goto_3
    iget-object p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲈᲈᛲ:Landroid/graphics/Rect;

    .line 211
    .line 212
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 213
    .line 214
    iget v1, p1, Landroid/graphics/Rect;->top:I

    .line 215
    .line 216
    iget v2, p1, Landroid/graphics/Rect;->right:I

    .line 217
    .line 218
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 219
    .line 220
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛴᛷᛱ(IIII)V

    .line 221
    .line 222
    .line 223
    return-void
.end method

.method public final ᲇᛴᲇᛵ()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lxhss/ᛷᛴᛱᲀ;->ᲇᛶᛴᲀ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_4

    .line 7
    .line 8
    invoke-virtual {p0}, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getWindowInsetsController()Landroid/view/WindowInsetsController;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Landroid/view/WindowInsetsController;->getSystemBarsBehavior()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    and-int/lit8 v0, v0, 0x10

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    sget p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛴᲈᛱᛴ:I

    .line 34
    .line 35
    return v1

    .line 36
    :cond_1
    iget-object v0, p0, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iget-object p0, p0, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    :goto_0
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :goto_1
    const-string v0, "dimen"

    .line 63
    .line 64
    const-string v2, "android"

    .line 65
    .line 66
    const-string v3, "navigation_bar_height"

    .line 67
    .line 68
    invoke-virtual {p0, v3, v0, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-lez v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    return p0

    .line 79
    :cond_4
    :goto_2
    return v1
.end method

.method public final ᲇᛶᛴᲀ()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛴᛱᲀ;->ᲇᛴᲇᛵ:Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    if-nez p0, :cond_1

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 26
    .line 27
    and-int/lit16 v0, v0, 0x400

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    and-int/lit8 p0, p0, 0x4

    .line 45
    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    :goto_1
    const/4 p0, 0x1

    .line 49
    return p0

    .line 50
    :cond_3
    :goto_2
    const/4 p0, 0x0

    .line 51
    return p0
.end method
