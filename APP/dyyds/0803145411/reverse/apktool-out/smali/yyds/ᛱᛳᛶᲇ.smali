.class public final Lyyds/ᛱᛳᛶᲇ;
.super Landroid/view/View;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/util/ArrayList;

.field public final ᲀᛲᛳᲀ:[Ljava/lang/String;

.field public ᲇᲇᲇᛱ:Landroid/animation/ValueAnimator;

.field public final ᲇᲈᛵᛷ:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide v1, -0x4b9ace68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    move-object/from16 v2, p1

    .line 13
    .line 14
    invoke-direct {v0, v2, v1}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    .line 16
    .line 17
    const-wide v1, -0x4b9b4e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-wide v1, -0x4b9b6e68a836eL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const-wide v1, -0x4b9b9e68a836eL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    const-wide v1, -0x4b9bbe68a836eL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    const-wide v1, -0x4b9bee68a836eL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    const-wide v1, -0x4b9c1e68a836eL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    const-wide v1, -0x4b9c4e68a836eL

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    const-wide v1, -0x4b9c8e68a836eL

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    filled-new-array/range {v3 .. v10}, [Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iput-object v1, v0, Lyyds/ᛱᛳᛶᲇ;->ᲀᛲᛳᲀ:[Ljava/lang/String;

    .line 94
    .line 95
    new-instance v1, Landroid/graphics/Paint;

    .line 96
    .line 97
    const/4 v2, 0x1

    .line 98
    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    .line 99
    .line 100
    .line 101
    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 104
    .line 105
    .line 106
    iput-object v1, v0, Lyyds/ᛱᛳᛶᲇ;->ᲇᲈᛵᛷ:Landroid/graphics/Paint;

    .line 107
    .line 108
    new-instance v1, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    iput-object v1, v0, Lyyds/ᛱᛳᛶᲇ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 124
    .line 125
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    iget v2, v2, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 134
    .line 135
    const/4 v3, 0x0

    .line 136
    :goto_0
    const/16 v4, 0xb

    .line 137
    .line 138
    if-ge v3, v4, :cond_0

    .line 139
    .line 140
    iget-object v4, v0, Lyyds/ᛱᛳᛶᲇ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 141
    .line 142
    new-instance v5, Lyyds/ᲁᲁᛷᛴ;

    .line 143
    .line 144
    iget-object v6, v0, Lyyds/ᛱᛳᛶᲇ;->ᲀᛲᛳᲀ:[Ljava/lang/String;

    .line 145
    .line 146
    sget-object v7, Lyyds/ᲇᛸᛴᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛳᛲᛷ;

    .line 147
    .line 148
    array-length v8, v6

    .line 149
    sget-object v9, Lyyds/ᲇᛸᛴᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛷᛶᛲ;

    .line 150
    .line 151
    invoke-virtual {v9, v8}, Lyyds/ᛳᛷᛶᛲ;->ᛶᛷᛲᲁ(I)I

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    aget-object v6, v6, v8

    .line 156
    .line 157
    move-object v8, v7

    .line 158
    invoke-virtual {v8}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    move-object v10, v8

    .line 163
    invoke-virtual {v10}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    invoke-virtual {v10}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    const/high16 v12, 0x41200000    # 10.0f

    .line 172
    .line 173
    mul-float/2addr v11, v12

    .line 174
    const/high16 v12, 0x41700000    # 15.0f

    .line 175
    .line 176
    add-float/2addr v11, v12

    .line 177
    mul-float/2addr v11, v2

    .line 178
    const/16 v12, 0x12

    .line 179
    .line 180
    invoke-virtual {v9, v12}, Lyyds/ᛳᛷᛶᛲ;->ᛶᛷᛲᲁ(I)I

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    add-int/lit8 v9, v9, 0x10

    .line 185
    .line 186
    invoke-virtual {v10}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 187
    .line 188
    .line 189
    move-result v12

    .line 190
    const v13, 0x40c90fdb

    .line 191
    .line 192
    .line 193
    mul-float/2addr v12, v13

    .line 194
    invoke-virtual {v10}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 195
    .line 196
    .line 197
    move-result v13

    .line 198
    const/high16 v14, 0x3f000000    # 0.5f

    .line 199
    .line 200
    mul-float/2addr v13, v14

    .line 201
    const v14, 0x3eb33333    # 0.35f

    .line 202
    .line 203
    .line 204
    add-float/2addr v13, v14

    .line 205
    invoke-virtual {v10}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 206
    .line 207
    .line 208
    move-result v14

    .line 209
    const/high16 v15, 0x40c00000    # 6.0f

    .line 210
    .line 211
    mul-float/2addr v14, v15

    .line 212
    const/high16 v15, 0x40800000    # 4.0f

    .line 213
    .line 214
    add-float/2addr v14, v15

    .line 215
    mul-float/2addr v14, v1

    .line 216
    invoke-virtual {v10}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 217
    .line 218
    .line 219
    move-result v15

    .line 220
    const/high16 v16, 0x40e00000    # 7.0f

    .line 221
    .line 222
    mul-float v15, v15, v16

    .line 223
    .line 224
    const/high16 v16, 0x40a00000    # 5.0f

    .line 225
    .line 226
    add-float v15, v15, v16

    .line 227
    .line 228
    mul-float/2addr v15, v1

    .line 229
    invoke-virtual {v10}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    const/high16 v17, 0x41000000    # 8.0f

    .line 234
    .line 235
    mul-float v10, v10, v17

    .line 236
    .line 237
    add-float v10, v10, v16

    .line 238
    .line 239
    move/from16 v18, v10

    .line 240
    .line 241
    move v10, v9

    .line 242
    move v9, v11

    .line 243
    move v11, v12

    .line 244
    move v12, v13

    .line 245
    move v13, v14

    .line 246
    move v14, v15

    .line 247
    move/from16 v15, v18

    .line 248
    .line 249
    invoke-direct/range {v5 .. v15}, Lyyds/ᲁᲁᛷᛴ;-><init>(Ljava/lang/String;FFFIFFFFF)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    add-int/lit8 v3, v3, 0x1

    .line 256
    .line 257
    goto :goto_0

    .line 258
    :cond_0
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    const-wide v0, -0x4b9cbe68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-float v0, v0

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    int-to-float v1, v1

    .line 22
    const/4 v2, 0x0

    .line 23
    cmpg-float v3, v0, v2

    .line 24
    .line 25
    if-lez v3, :cond_1

    .line 26
    .line 27
    cmpg-float v3, v1, v2

    .line 28
    .line 29
    if-gtz v3, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    long-to-float v3, v3

    .line 37
    const/high16 v4, 0x447a0000    # 1000.0f

    .line 38
    .line 39
    div-float/2addr v3, v4

    .line 40
    iget-object v4, p0, Lyyds/ᛱᛳᛶᲇ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Lyyds/ᲁᲁᛷᛴ;

    .line 57
    .line 58
    iget v6, v5, Lyyds/ᲁᲁᛷᛴ;->ᛶᛷᛲᲁ:F

    .line 59
    .line 60
    iget v7, v5, Lyyds/ᲁᲁᛷᛴ;->ᲇᲈᛵᛷ:F

    .line 61
    .line 62
    iget v8, v5, Lyyds/ᲁᲁᛷᛴ;->ᲇᲇᲇᛱ:F

    .line 63
    .line 64
    mul-float v9, v3, v6

    .line 65
    .line 66
    add-float/2addr v9, v8

    .line 67
    float-to-double v9, v9

    .line 68
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    .line 69
    .line 70
    .line 71
    move-result-wide v9

    .line 72
    double-to-float v9, v9

    .line 73
    iget v10, v5, Lyyds/ᲁᲁᛷᛴ;->ᛱᲈᲁ:F

    .line 74
    .line 75
    mul-float/2addr v9, v10

    .line 76
    mul-float/2addr v6, v3

    .line 77
    const v10, 0x3f666666    # 0.9f

    .line 78
    .line 79
    .line 80
    mul-float/2addr v10, v6

    .line 81
    const v11, 0x3fa66666    # 1.3f

    .line 82
    .line 83
    .line 84
    mul-float/2addr v11, v8

    .line 85
    add-float/2addr v11, v10

    .line 86
    float-to-double v10, v11

    .line 87
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    .line 88
    .line 89
    .line 90
    move-result-wide v10

    .line 91
    double-to-float v10, v10

    .line 92
    iget v11, v5, Lyyds/ᲁᲁᛷᛴ;->ᛲᛳᛶᲁ:F

    .line 93
    .line 94
    mul-float/2addr v10, v11

    .line 95
    const v11, 0x3f333333    # 0.7f

    .line 96
    .line 97
    .line 98
    mul-float/2addr v6, v11

    .line 99
    add-float/2addr v6, v8

    .line 100
    float-to-double v11, v6

    .line 101
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    .line 102
    .line 103
    .line 104
    move-result-wide v11

    .line 105
    double-to-float v6, v11

    .line 106
    iget v8, v5, Lyyds/ᲁᲁᛷᛴ;->ᛷᲈᲈᲁ:F

    .line 107
    .line 108
    mul-float/2addr v6, v8

    .line 109
    iget-object v8, p0, Lyyds/ᛱᛳᛶᲇ;->ᲇᲈᛵᛷ:Landroid/graphics/Paint;

    .line 110
    .line 111
    invoke-virtual {v8, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 112
    .line 113
    .line 114
    iget v11, v5, Lyyds/ᲁᲁᛷᛴ;->ᛲᛴᛳᛲ:I

    .line 115
    .line 116
    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 120
    .line 121
    .line 122
    iget v11, v5, Lyyds/ᲁᲁᛷᛴ;->ᛵᛸᛸᛷ:F

    .line 123
    .line 124
    mul-float/2addr v11, v0

    .line 125
    add-float/2addr v11, v9

    .line 126
    iget v9, v5, Lyyds/ᲁᲁᛷᛴ;->ᲀᛲᛳᲀ:F

    .line 127
    .line 128
    mul-float/2addr v9, v1

    .line 129
    add-float/2addr v9, v10

    .line 130
    invoke-virtual {p1, v11, v9}, Landroid/graphics/Canvas;->translate(FF)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->rotate(F)V

    .line 134
    .line 135
    .line 136
    iget-object v5, v5, Lyyds/ᲁᲁᛷᛴ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 137
    .line 138
    const v6, 0x3eb33333    # 0.35f

    .line 139
    .line 140
    .line 141
    mul-float/2addr v7, v6

    .line 142
    invoke-virtual {p1, v5, v2, v7, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_1
    :goto_1
    return-void
.end method
