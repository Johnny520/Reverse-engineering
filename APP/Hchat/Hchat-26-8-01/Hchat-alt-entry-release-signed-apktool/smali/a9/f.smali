.class public final La9/f;
.super Landroid/text/style/ReplacementSpan;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La9/f;->g:I

    .line 5
    .line 6
    iput p2, p0, La9/f;->h:I

    .line 7
    .line 8
    iput p3, p0, La9/f;->i:I

    .line 9
    .line 10
    iput p4, p0, La9/f;->j:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p5

    .line 4
    .line 5
    move-object/from16 v7, p9

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v7}, Landroid/graphics/Paint;->getColor()I

    .line 17
    .line 18
    .line 19
    move-result v8

    .line 20
    invoke-virtual {v7}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    .line 21
    .line 22
    .line 23
    move-result-object v9

    .line 24
    invoke-virtual {v7}, Landroid/graphics/Paint;->isFakeBoldText()Z

    .line 25
    .line 26
    .line 27
    move-result v10

    .line 28
    invoke-virtual {v7}, Landroid/graphics/Paint;->getTextSize()F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const v3, 0x3ee66666    # 0.45f

    .line 33
    .line 34
    .line 35
    mul-float/2addr v2, v3

    .line 36
    const/high16 v3, 0x3f000000    # 0.5f

    .line 37
    .line 38
    add-float/2addr v2, v3

    .line 39
    float-to-int v2, v2

    .line 40
    int-to-float v2, v2

    .line 41
    move-object/from16 v3, p2

    .line 42
    .line 43
    move/from16 v4, p3

    .line 44
    .line 45
    move/from16 v5, p4

    .line 46
    .line 47
    invoke-virtual {v7, v3, v4, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    const/4 v11, 0x2

    .line 52
    int-to-float v11, v11

    .line 53
    mul-float/2addr v11, v2

    .line 54
    add-float/2addr v11, v6

    .line 55
    new-instance v6, Landroid/graphics/RectF;

    .line 56
    .line 57
    move/from16 v12, p6

    .line 58
    .line 59
    int-to-float v12, v12

    .line 60
    invoke-virtual {v7}, Landroid/graphics/Paint;->getTextSize()F

    .line 61
    .line 62
    .line 63
    move-result v13

    .line 64
    const v14, 0x3d4ccccd    # 0.05f

    .line 65
    .line 66
    .line 67
    mul-float/2addr v13, v14

    .line 68
    add-float/2addr v13, v12

    .line 69
    add-float/2addr v11, v1

    .line 70
    move/from16 v12, p8

    .line 71
    .line 72
    int-to-float v12, v12

    .line 73
    invoke-virtual {v7}, Landroid/graphics/Paint;->getTextSize()F

    .line 74
    .line 75
    .line 76
    move-result v15

    .line 77
    mul-float/2addr v15, v14

    .line 78
    sub-float/2addr v12, v15

    .line 79
    invoke-direct {v6, v1, v13, v11, v12}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7}, Landroid/graphics/Paint;->getTextSize()F

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    const v12, 0x3e8f5c29    # 0.28f

    .line 87
    .line 88
    .line 89
    mul-float/2addr v11, v12

    .line 90
    iget v12, v0, La9/f;->h:I

    .line 91
    .line 92
    iget v14, v0, La9/f;->g:I

    .line 93
    .line 94
    if-eq v14, v12, :cond_0

    .line 95
    .line 96
    new-instance v15, Landroid/graphics/LinearGradient;

    .line 97
    .line 98
    iget v12, v6, Landroid/graphics/RectF;->left:F

    .line 99
    .line 100
    iget v13, v6, Landroid/graphics/RectF;->right:F

    .line 101
    .line 102
    iget v1, v0, La9/f;->h:I

    .line 103
    .line 104
    sget-object v22, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 105
    .line 106
    const/16 v17, 0x0

    .line 107
    .line 108
    const/16 v19, 0x0

    .line 109
    .line 110
    move/from16 v21, v1

    .line 111
    .line 112
    iget v1, v0, La9/f;->g:I

    .line 113
    .line 114
    move/from16 v20, v1

    .line 115
    .line 116
    move/from16 v16, v12

    .line 117
    .line 118
    move/from16 v18, v13

    .line 119
    .line 120
    invoke-direct/range {v15 .. v22}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_0
    const/4 v15, 0x0

    .line 125
    :goto_0
    invoke-virtual {v7, v15}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7, v14}, Landroid/graphics/Paint;->setColor(I)V

    .line 129
    .line 130
    .line 131
    move-object/from16 v1, p1

    .line 132
    .line 133
    invoke-virtual {v1, v6, v11, v11, v7}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 134
    .line 135
    .line 136
    iget v11, v0, La9/f;->j:I

    .line 137
    .line 138
    iget v12, v0, La9/f;->i:I

    .line 139
    .line 140
    if-eq v12, v11, :cond_1

    .line 141
    .line 142
    new-instance v13, Landroid/graphics/LinearGradient;

    .line 143
    .line 144
    iget v14, v6, Landroid/graphics/RectF;->left:F

    .line 145
    .line 146
    iget v6, v6, Landroid/graphics/RectF;->right:F

    .line 147
    .line 148
    iget v11, v0, La9/f;->j:I

    .line 149
    .line 150
    sget-object v20, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 151
    .line 152
    const/16 v17, 0x0

    .line 153
    .line 154
    iget v15, v0, La9/f;->i:I

    .line 155
    .line 156
    move/from16 v16, v6

    .line 157
    .line 158
    move/from16 v19, v11

    .line 159
    .line 160
    move/from16 v18, v15

    .line 161
    .line 162
    const/4 v15, 0x0

    .line 163
    invoke-direct/range {v13 .. v20}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_1
    const/4 v13, 0x0

    .line 168
    :goto_1
    invoke-virtual {v7, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7, v12}, Landroid/graphics/Paint;->setColor(I)V

    .line 172
    .line 173
    .line 174
    const/4 v6, 0x1

    .line 175
    invoke-virtual {v7, v6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 176
    .line 177
    .line 178
    add-float v2, p5, v2

    .line 179
    .line 180
    move/from16 v6, p7

    .line 181
    .line 182
    int-to-float v6, v6

    .line 183
    move/from16 v23, v5

    .line 184
    .line 185
    move v5, v2

    .line 186
    move-object v2, v3

    .line 187
    move v3, v4

    .line 188
    move/from16 v4, v23

    .line 189
    .line 190
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v7, v9}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v7, v10}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 200
    .line 201
    .line 202
    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const v1, 0x3ee66666    # 0.45f

    .line 12
    .line 13
    .line 14
    mul-float/2addr v0, v1

    .line 15
    const/high16 v1, 0x3f000000    # 0.5f

    .line 16
    .line 17
    add-float/2addr v0, v1

    .line 18
    float-to-int v0, v0

    .line 19
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const v3, 0x3e0f5c29    # 0.14f

    .line 24
    .line 25
    .line 26
    mul-float/2addr v2, v3

    .line 27
    add-float/2addr v2, v1

    .line 28
    float-to-int v1, v2

    .line 29
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz p5, :cond_0

    .line 34
    .line 35
    iget v3, v2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 36
    .line 37
    sub-int/2addr v3, v1

    .line 38
    iput v3, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 39
    .line 40
    iget v3, v2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 41
    .line 42
    add-int/2addr v3, v1

    .line 43
    iput v3, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 44
    .line 45
    iget v3, v2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 46
    .line 47
    sub-int/2addr v3, v1

    .line 48
    iput v3, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 49
    .line 50
    iget v2, v2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 51
    .line 52
    add-int/2addr v2, v1

    .line 53
    iput v2, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 54
    .line 55
    :cond_0
    invoke-virtual {p1, p2, p3, p4}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    mul-int/lit8 v0, v0, 0x2

    .line 60
    .line 61
    int-to-float p2, v0

    .line 62
    add-float/2addr p1, p2

    .line 63
    float-to-int p1, p1

    .line 64
    return p1
.end method
