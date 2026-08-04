.class public final Lyyds/ᛴᛲᛴᛳ;
.super Landroid/view/View;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/util/ArrayList;

.field public final ᛶᛷᛲᲁ:F

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final ᲇᲇᲇᛱ:Landroid/graphics/Paint;

.field public ᲇᲈᛵᛷ:[I


# direct methods
.method public constructor <init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V
    .locals 4

    .line 1
    iput p2, p0, Lyyds/ᛴᛲᛴᛳ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-wide v2, -0x10ef5e68a836eL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    new-array p1, v1, [I

    .line 20
    .line 21
    iput-object p1, p0, Lyyds/ᛴᛲᛴᛳ;->ᲇᲈᛵᛷ:[I

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lyyds/ᛴᛲᛴᛳ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance p1, Landroid/graphics/Paint;

    .line 31
    .line 32
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lyyds/ᛴᛲᛴᛳ;->ᲇᲇᲇᛱ:Landroid/graphics/Paint;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 46
    .line 47
    iput p1, p0, Lyyds/ᛴᛲᛴᛳ;->ᛶᛷᛲᲁ:F

    .line 48
    .line 49
    const/4 p1, 0x2

    .line 50
    const/4 p2, 0x0

    .line 51
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_0
    const-wide v2, -0x60cdbe68a836eL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    new-array p1, v1, [I

    .line 67
    .line 68
    iput-object p1, p0, Lyyds/ᛴᛲᛴᛳ;->ᲇᲈᛵᛷ:[I

    .line 69
    .line 70
    new-instance p1, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lyyds/ᛴᛲᛴᛳ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 76
    .line 77
    new-instance p1, Landroid/graphics/Paint;

    .line 78
    .line 79
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lyyds/ᛴᛲᛴᛳ;->ᲇᲇᲇᛱ:Landroid/graphics/Paint;

    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 93
    .line 94
    iput p1, p0, Lyyds/ᛴᛲᛴᛳ;->ᛶᛷᛲᲁ:F

    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lyyds/ᛴᛲᛴᛳ;->ᲀᛲᛳᲀ:I

    .line 6
    .line 7
    iget-object v3, v0, Lyyds/ᛴᛲᛴᛳ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 8
    .line 9
    packed-switch v2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const-wide v4, -0x60cebe68a836eL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-wide v4, -0x60cf2e68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const-wide v5, -0x60d00e68a836eL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    check-cast v4, Lyyds/ᛱᛷᲈ;

    .line 54
    .line 55
    iget v5, v4, Lyyds/ᛱᛷᲈ;->ᛶᛷᛲᲁ:I

    .line 56
    .line 57
    iget v6, v4, Lyyds/ᛱᛷᲈ;->ᛱᲈᲁ:I

    .line 58
    .line 59
    add-int/lit8 v6, v6, 0x1

    .line 60
    .line 61
    iput v6, v4, Lyyds/ᛱᛷᲈ;->ᛱᲈᲁ:I

    .line 62
    .line 63
    if-lt v6, v5, :cond_0

    .line 64
    .line 65
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    iget v6, v4, Lyyds/ᛱᛷᲈ;->ᛲᲈᲁ:F

    .line 70
    .line 71
    iget v7, v4, Lyyds/ᛱᛷᲈ;->ᲀᛲᛳᲀ:F

    .line 72
    .line 73
    add-float/2addr v6, v7

    .line 74
    iput v6, v4, Lyyds/ᛱᛷᲈ;->ᛲᲈᲁ:F

    .line 75
    .line 76
    iget v6, v4, Lyyds/ᛱᛷᲈ;->ᛵᛸᛸᛷ:F

    .line 77
    .line 78
    iget v8, v4, Lyyds/ᛱᛷᲈ;->ᲇᲈᛵᛷ:F

    .line 79
    .line 80
    add-float/2addr v6, v8

    .line 81
    iput v6, v4, Lyyds/ᛱᛷᲈ;->ᛵᛸᛸᛷ:F

    .line 82
    .line 83
    const v6, 0x3eb33333    # 0.35f

    .line 84
    .line 85
    .line 86
    iget v9, v0, Lyyds/ᛴᛲᛴᛳ;->ᛶᛷᛲᲁ:F

    .line 87
    .line 88
    mul-float/2addr v9, v6

    .line 89
    add-float/2addr v9, v8

    .line 90
    iput v9, v4, Lyyds/ᛱᛷᲈ;->ᲇᲈᛵᛷ:F

    .line 91
    .line 92
    const v6, 0x3f7c28f6    # 0.985f

    .line 93
    .line 94
    .line 95
    mul-float/2addr v7, v6

    .line 96
    iput v7, v4, Lyyds/ᛱᛷᲈ;->ᲀᛲᛳᲀ:F

    .line 97
    .line 98
    iget v6, v4, Lyyds/ᛱᛷᲈ;->ᲇᲇᲇᛱ:I

    .line 99
    .line 100
    iget-object v7, v0, Lyyds/ᛴᛲᛴᛳ;->ᲇᲇᲇᛱ:Landroid/graphics/Paint;

    .line 101
    .line 102
    invoke-virtual {v7, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 103
    .line 104
    .line 105
    iget v6, v4, Lyyds/ᛱᛷᲈ;->ᛱᲈᲁ:I

    .line 106
    .line 107
    int-to-float v6, v6

    .line 108
    int-to-float v5, v5

    .line 109
    div-float/2addr v6, v5

    .line 110
    const/high16 v5, 0x3f800000    # 1.0f

    .line 111
    .line 112
    sub-float/2addr v5, v6

    .line 113
    const/high16 v6, 0x437f0000    # 255.0f

    .line 114
    .line 115
    mul-float/2addr v5, v6

    .line 116
    float-to-int v5, v5

    .line 117
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 118
    .line 119
    .line 120
    iget v5, v4, Lyyds/ᛱᛷᲈ;->ᛲᲈᲁ:F

    .line 121
    .line 122
    iget v6, v4, Lyyds/ᛱᛷᲈ;->ᛵᛸᛸᛷ:F

    .line 123
    .line 124
    iget v4, v4, Lyyds/ᛱᛷᲈ;->ᛲᛴᛳᛲ:F

    .line 125
    .line 126
    invoke-virtual {v1, v5, v6, v4, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_1
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-nez v1, :cond_2

    .line 135
    .line 136
    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 137
    .line 138
    .line 139
    :cond_2
    return-void

    .line 140
    :pswitch_0
    const-wide v4, -0x10f03e68a836eL

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-eqz v2, :cond_3

    .line 156
    .line 157
    invoke-virtual {v0}, Lyyds/ᛴᛲᛴᛳ;->ᛲᲈᲁ()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_3

    .line 165
    .line 166
    goto/16 :goto_2

    .line 167
    .line 168
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    int-to-float v7, v2

    .line 173
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    int-to-float v8, v2

    .line 178
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 179
    .line 180
    .line 181
    const/4 v2, 0x0

    .line 182
    invoke-virtual {v1, v2, v2, v7, v8}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    iget-object v6, v0, Lyyds/ᛴᛲᛴᛳ;->ᲇᲇᲇᛱ:Landroid/graphics/Paint;

    .line 194
    .line 195
    if-eqz v2, :cond_8

    .line 196
    .line 197
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    check-cast v2, Lyyds/ᛳᲈᛲᛶ;

    .line 202
    .line 203
    iget v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᛲᲈᲁ:F

    .line 204
    .line 205
    iget v4, v2, Lyyds/ᛳᲈᛲᛶ;->ᛲᛴᛳᛲ:F

    .line 206
    .line 207
    add-float/2addr v3, v4

    .line 208
    iput v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᛲᲈᲁ:F

    .line 209
    .line 210
    iget v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᛵᛸᛸᛷ:F

    .line 211
    .line 212
    iget v4, v2, Lyyds/ᛳᲈᛲᛶ;->ᲇᲇᲇᛱ:F

    .line 213
    .line 214
    add-float/2addr v3, v4

    .line 215
    iput v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᛵᛸᛸᛷ:F

    .line 216
    .line 217
    iget v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᛱᲈᲁ:F

    .line 218
    .line 219
    const v4, 0x3c03126f    # 0.008f

    .line 220
    .line 221
    .line 222
    add-float/2addr v3, v4

    .line 223
    iput v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᛱᲈᲁ:F

    .line 224
    .line 225
    iget v4, v2, Lyyds/ᛳᲈᛲᛶ;->ᲇᲈᛵᛷ:F

    .line 226
    .line 227
    float-to-double v10, v3

    .line 228
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    .line 229
    .line 230
    .line 231
    move-result-wide v10

    .line 232
    double-to-float v3, v10

    .line 233
    const v5, 0x3e3851ec    # 0.18f

    .line 234
    .line 235
    .line 236
    mul-float/2addr v3, v5

    .line 237
    const v5, 0x3f51eb85    # 0.82f

    .line 238
    .line 239
    .line 240
    add-float/2addr v3, v5

    .line 241
    mul-float/2addr v3, v4

    .line 242
    iput v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᲀᛲᛳᲀ:F

    .line 243
    .line 244
    iget v4, v2, Lyyds/ᛳᲈᛲᛶ;->ᛲᲈᲁ:F

    .line 245
    .line 246
    neg-float v3, v3

    .line 247
    const v5, 0x3e99999a    # 0.3f

    .line 248
    .line 249
    .line 250
    mul-float/2addr v3, v5

    .line 251
    cmpg-float v3, v4, v3

    .line 252
    .line 253
    if-gez v3, :cond_4

    .line 254
    .line 255
    iget v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᛲᛴᛳᛲ:F

    .line 256
    .line 257
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    iput v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᛲᛴᛳᛲ:F

    .line 262
    .line 263
    :cond_4
    iget v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᛲᲈᲁ:F

    .line 264
    .line 265
    iget v4, v2, Lyyds/ᛳᲈᛲᛶ;->ᲀᛲᛳᲀ:F

    .line 266
    .line 267
    mul-float/2addr v4, v5

    .line 268
    add-float/2addr v4, v7

    .line 269
    cmpl-float v3, v3, v4

    .line 270
    .line 271
    if-lez v3, :cond_5

    .line 272
    .line 273
    iget v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᛲᛴᛳᛲ:F

    .line 274
    .line 275
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    neg-float v3, v3

    .line 280
    iput v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᛲᛴᛳᛲ:F

    .line 281
    .line 282
    :cond_5
    iget v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᛵᛸᛸᛷ:F

    .line 283
    .line 284
    iget v4, v2, Lyyds/ᛳᲈᛲᛶ;->ᲀᛲᛳᲀ:F

    .line 285
    .line 286
    neg-float v4, v4

    .line 287
    mul-float/2addr v4, v5

    .line 288
    cmpg-float v3, v3, v4

    .line 289
    .line 290
    if-gez v3, :cond_6

    .line 291
    .line 292
    iget v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᲇᲇᲇᛱ:F

    .line 293
    .line 294
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    iput v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᲇᲇᲇᛱ:F

    .line 299
    .line 300
    :cond_6
    iget v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᛵᛸᛸᛷ:F

    .line 301
    .line 302
    iget v4, v2, Lyyds/ᛳᲈᛲᛶ;->ᲀᛲᛳᲀ:F

    .line 303
    .line 304
    mul-float/2addr v4, v5

    .line 305
    add-float/2addr v4, v8

    .line 306
    cmpl-float v3, v3, v4

    .line 307
    .line 308
    if-lez v3, :cond_7

    .line 309
    .line 310
    iget v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᲇᲇᲇᛱ:F

    .line 311
    .line 312
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    neg-float v3, v3

    .line 317
    iput v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᲇᲇᲇᛱ:F

    .line 318
    .line 319
    :cond_7
    new-instance v10, Landroid/graphics/RadialGradient;

    .line 320
    .line 321
    iget v11, v2, Lyyds/ᛳᲈᛲᛶ;->ᛲᲈᲁ:F

    .line 322
    .line 323
    iget v12, v2, Lyyds/ᛳᲈᛲᛶ;->ᛵᛸᛸᛷ:F

    .line 324
    .line 325
    iget v13, v2, Lyyds/ᛳᲈᛲᛶ;->ᲀᛲᛳᲀ:F

    .line 326
    .line 327
    iget v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᛶᛷᛲᲁ:I

    .line 328
    .line 329
    const v4, 0xffffff

    .line 330
    .line 331
    .line 332
    and-int/2addr v3, v4

    .line 333
    const/high16 v4, 0x18000000

    .line 334
    .line 335
    or-int/2addr v4, v3

    .line 336
    const/high16 v5, 0x6000000

    .line 337
    .line 338
    or-int/2addr v3, v5

    .line 339
    const/4 v5, 0x0

    .line 340
    filled-new-array {v4, v3, v5}, [I

    .line 341
    .line 342
    .line 343
    move-result-object v14

    .line 344
    const/4 v3, 0x3

    .line 345
    new-array v15, v3, [F

    .line 346
    .line 347
    fill-array-data v15, :array_0

    .line 348
    .line 349
    .line 350
    sget-object v16, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 351
    .line 352
    invoke-direct/range {v10 .. v16}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v6, v10}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 356
    .line 357
    .line 358
    const/16 v3, 0xff

    .line 359
    .line 360
    invoke-virtual {v6, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 361
    .line 362
    .line 363
    iget v3, v2, Lyyds/ᛳᲈᛲᛶ;->ᛲᲈᲁ:F

    .line 364
    .line 365
    iget v4, v2, Lyyds/ᛳᲈᛲᛶ;->ᲀᛲᛳᲀ:F

    .line 366
    .line 367
    sub-float v5, v3, v4

    .line 368
    .line 369
    iget v2, v2, Lyyds/ᛳᲈᛲᛶ;->ᛵᛸᛸᛷ:F

    .line 370
    .line 371
    move v10, v3

    .line 372
    sub-float v3, v2, v4

    .line 373
    .line 374
    add-float/2addr v10, v4

    .line 375
    add-float/2addr v2, v4

    .line 376
    move v4, v5

    .line 377
    move v5, v2

    .line 378
    move v2, v4

    .line 379
    move v4, v10

    .line 380
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 381
    .line 382
    .line 383
    move-object/from16 v1, p1

    .line 384
    .line 385
    goto/16 :goto_1

    .line 386
    .line 387
    :cond_8
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 388
    .line 389
    .line 390
    const/4 v1, 0x0

    .line 391
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 395
    .line 396
    .line 397
    :goto_2
    return-void

    .line 398
    nop

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public onSizeChanged(IIII)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛴᛲᛴᛳ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lyyds/ᛴᛲᛴᛳ;->ᛲᲈᲁ()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ᛲᲈᲁ()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v1, v0, Lyyds/ᛴᛲᛴᛳ;->ᲇᲈᛵᛷ:[I

    .line 16
    .line 17
    array-length v1, v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v1, v0, Lyyds/ᛴᛲᛴᛳ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 24
    .line 25
    .line 26
    iget-object v2, v0, Lyyds/ᛴᛲᛴᛳ;->ᲇᲈᛵᛷ:[I

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    int-to-float v3, v3

    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    int-to-float v4, v4

    .line 38
    const/4 v5, 0x0

    .line 39
    :goto_0
    const/4 v6, 0x5

    .line 40
    if-ge v5, v6, :cond_1

    .line 41
    .line 42
    array-length v6, v2

    .line 43
    rem-int v6, v5, v6

    .line 44
    .line 45
    aget v6, v2, v6

    .line 46
    .line 47
    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const v8, 0x3dcccccd    # 0.1f

    .line 52
    .line 53
    .line 54
    int-to-float v9, v5

    .line 55
    mul-float/2addr v9, v8

    .line 56
    const v8, 0x3eb33333    # 0.35f

    .line 57
    .line 58
    .line 59
    add-float/2addr v9, v8

    .line 60
    mul-float/2addr v9, v7

    .line 61
    const/high16 v7, 0x42f00000    # 120.0f

    .line 62
    .line 63
    iget v10, v0, Lyyds/ᛴᛲᛴᛳ;->ᛶᛷᛲᲁ:F

    .line 64
    .line 65
    mul-float/2addr v7, v10

    .line 66
    const/high16 v11, 0x44160000    # 600.0f

    .line 67
    .line 68
    mul-float/2addr v11, v10

    .line 69
    invoke-static {v9, v7, v11}, Lyyds/ᛳᛵᲀ;->ᛵᛸᛸᛷ(FFF)F

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    new-instance v9, Lyyds/ᛳᲈᛲᛶ;

    .line 74
    .line 75
    sget-object v11, Lyyds/ᲇᛸᛴᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛳᛲᛷ;

    .line 76
    .line 77
    invoke-virtual {v11}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    mul-float/2addr v12, v3

    .line 82
    invoke-virtual {v11}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 83
    .line 84
    .line 85
    move-result v13

    .line 86
    mul-float/2addr v13, v4

    .line 87
    invoke-virtual {v11}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 88
    .line 89
    .line 90
    move-result v14

    .line 91
    const/high16 v15, 0x3f000000    # 0.5f

    .line 92
    .line 93
    sub-float/2addr v14, v15

    .line 94
    mul-float/2addr v14, v8

    .line 95
    mul-float/2addr v14, v10

    .line 96
    invoke-virtual {v11}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 97
    .line 98
    .line 99
    move-result v16

    .line 100
    sub-float v16, v16, v15

    .line 101
    .line 102
    mul-float v16, v16, v8

    .line 103
    .line 104
    mul-float v8, v16, v10

    .line 105
    .line 106
    invoke-virtual {v11}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    const/high16 v11, 0x447a0000    # 1000.0f

    .line 111
    .line 112
    mul-float/2addr v10, v11

    .line 113
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 114
    .line 115
    .line 116
    iput v12, v9, Lyyds/ᛳᲈᛲᛶ;->ᛲᲈᲁ:F

    .line 117
    .line 118
    iput v13, v9, Lyyds/ᛳᲈᛲᛶ;->ᛵᛸᛸᛷ:F

    .line 119
    .line 120
    iput v7, v9, Lyyds/ᛳᲈᛲᛶ;->ᲀᛲᛳᲀ:F

    .line 121
    .line 122
    iput v7, v9, Lyyds/ᛳᲈᛲᛶ;->ᲇᲈᛵᛷ:F

    .line 123
    .line 124
    iput v14, v9, Lyyds/ᛳᲈᛲᛶ;->ᛲᛴᛳᛲ:F

    .line 125
    .line 126
    iput v8, v9, Lyyds/ᛳᲈᛲᛶ;->ᲇᲇᲇᛱ:F

    .line 127
    .line 128
    iput v6, v9, Lyyds/ᛳᲈᛲᛶ;->ᛶᛷᛲᲁ:I

    .line 129
    .line 130
    iput v10, v9, Lyyds/ᛳᲈᛲᛶ;->ᛱᲈᲁ:F

    .line 131
    .line 132
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    add-int/lit8 v5, v5, 0x1

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_1
    :goto_1
    return-void
.end method

.method public ᛵᛸᛸᛷ(FF)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᛴᛲᛴᛳ;->ᲇᲈᛵᛷ:[I

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :cond_0
    if-nez v1, :cond_1

    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    const/4 v2, 0x0

    .line 13
    :goto_0
    const/16 v3, 0x16

    .line 14
    .line 15
    if-ge v2, v3, :cond_2

    .line 16
    .line 17
    sget-object v3, Lyyds/ᲇᛸᛴᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛳᛲᛷ;

    .line 18
    .line 19
    sget-object v4, Lyyds/ᲇᛸᛴᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛷᛶᛲ;

    .line 20
    .line 21
    invoke-virtual {v4}, Lyyds/ᛳᛷᛶᛲ;->ᲇᲇᲇᛱ()Ljava/util/Random;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v5}, Ljava/util/Random;->nextDouble()D

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    .line 30
    .line 31
    mul-double/2addr v5, v7

    .line 32
    const-wide v7, 0x400921fb54442d18L    # Math.PI

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    mul-double/2addr v5, v7

    .line 38
    invoke-virtual {v3}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    const/high16 v8, 0x41100000    # 9.0f

    .line 43
    .line 44
    mul-float/2addr v7, v8

    .line 45
    const/high16 v8, 0x40000000    # 2.0f

    .line 46
    .line 47
    add-float/2addr v7, v8

    .line 48
    iget v9, v0, Lyyds/ᛴᛲᛴᛳ;->ᛶᛷᛲᲁ:F

    .line 49
    .line 50
    mul-float/2addr v7, v9

    .line 51
    new-instance v10, Lyyds/ᛱᛷᲈ;

    .line 52
    .line 53
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 54
    .line 55
    .line 56
    move-result-wide v11

    .line 57
    float-to-double v13, v7

    .line 58
    mul-double/2addr v11, v13

    .line 59
    double-to-float v7, v11

    .line 60
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 61
    .line 62
    .line 63
    move-result-wide v5

    .line 64
    mul-double/2addr v5, v13

    .line 65
    double-to-float v5, v5

    .line 66
    const/high16 v6, 0x40600000    # 3.5f

    .line 67
    .line 68
    mul-float/2addr v6, v9

    .line 69
    sub-float v14, v5, v6

    .line 70
    .line 71
    invoke-virtual {v3}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    const/high16 v5, 0x40400000    # 3.0f

    .line 76
    .line 77
    mul-float/2addr v3, v5

    .line 78
    add-float/2addr v3, v8

    .line 79
    mul-float v15, v3, v9

    .line 80
    .line 81
    array-length v3, v1

    .line 82
    invoke-virtual {v4, v3}, Lyyds/ᛳᛷᛶᛲ;->ᛶᛷᛲᲁ(I)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    aget v16, v1, v3

    .line 87
    .line 88
    const/16 v3, 0x14

    .line 89
    .line 90
    invoke-virtual {v4, v3}, Lyyds/ᛳᛷᛶᛲ;->ᛶᛷᛲᲁ(I)I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    add-int/lit8 v17, v3, 0x1c

    .line 95
    .line 96
    move/from16 v11, p1

    .line 97
    .line 98
    move/from16 v12, p2

    .line 99
    .line 100
    move v13, v7

    .line 101
    invoke-direct/range {v10 .. v17}, Lyyds/ᛱᛷᲈ;-><init>(FFFFFII)V

    .line 102
    .line 103
    .line 104
    iget-object v3, v0, Lyyds/ᛴᛲᛴᛳ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    add-int/lit8 v2, v2, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 113
    .line 114
    .line 115
    return-void
.end method
