.class final Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field private final color:I

.field private final paint:Landroid/graphics/Paint;

.field private final settings:Lcom/mr/elaris/InAppSettings;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->paint:Landroid/graphics/Paint;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->settings:Lcom/mr/elaris/InAppSettings;

    .line 13
    .line 14
    iput p2, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->color:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->settings:Lcom/mr/elaris/InAppSettings;

    .line 11
    .line 12
    const/high16 v2, 0x3f800000    # 1.0f

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    int-to-float v1, v1

    .line 19
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->paint:Landroid/graphics/Paint;

    .line 24
    .line 25
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->paint:Landroid/graphics/Paint;

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->paint:Landroid/graphics/Paint;

    .line 36
    .line 37
    sget-object v2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->paint:Landroid/graphics/Paint;

    .line 43
    .line 44
    sget-object v2, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->paint:Landroid/graphics/Paint;

    .line 50
    .line 51
    iget v2, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->color:I

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->settings:Lcom/mr/elaris/InAppSettings;

    .line 57
    .line 58
    const v2, 0x3fb33333    # 1.4f

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    int-to-float v1, v1

    .line 66
    new-instance v2, Landroid/graphics/RectF;

    .line 67
    .line 68
    iget v3, v0, Landroid/graphics/RectF;->left:F

    .line 69
    .line 70
    add-float/2addr v3, v1

    .line 71
    iget v4, v0, Landroid/graphics/RectF;->top:F

    .line 72
    .line 73
    add-float/2addr v4, v1

    .line 74
    iget v5, v0, Landroid/graphics/RectF;->right:F

    .line 75
    .line 76
    sub-float/2addr v5, v1

    .line 77
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 78
    .line 79
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->settings:Lcom/mr/elaris/InAppSettings;

    .line 80
    .line 81
    const/high16 v6, 0x40800000    # 4.0f

    .line 82
    .line 83
    invoke-virtual {v1, v6}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    int-to-float v1, v1

    .line 88
    sub-float/2addr v0, v1

    .line 89
    invoke-direct {v2, v3, v4, v5, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->settings:Lcom/mr/elaris/InAppSettings;

    .line 93
    .line 94
    const/high16 v1, 0x40a00000    # 5.0f

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    int-to-float v0, v0

    .line 101
    iget-object v3, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->settings:Lcom/mr/elaris/InAppSettings;

    .line 102
    .line 103
    invoke-virtual {v3, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    int-to-float v1, v1

    .line 108
    iget-object v3, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->paint:Landroid/graphics/Paint;

    .line 109
    .line 110
    invoke-virtual {p1, v2, v0, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 111
    .line 112
    .line 113
    iget v0, v2, Landroid/graphics/RectF;->left:F

    .line 114
    .line 115
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    const v3, 0x3ea3d70a    # 0.32f

    .line 120
    .line 121
    .line 122
    mul-float/2addr v1, v3

    .line 123
    add-float v4, v1, v0

    .line 124
    .line 125
    iget v5, v2, Landroid/graphics/RectF;->bottom:F

    .line 126
    .line 127
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->settings:Lcom/mr/elaris/InAppSettings;

    .line 128
    .line 129
    const/high16 v1, 0x40000000    # 2.0f

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    int-to-float v0, v0

    .line 136
    sub-float v6, v4, v0

    .line 137
    .line 138
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->settings:Lcom/mr/elaris/InAppSettings;

    .line 139
    .line 140
    const v9, 0x402ccccd    # 2.7f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v9}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    int-to-float v0, v0

    .line 148
    add-float v7, v5, v0

    .line 149
    .line 150
    iget-object v8, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->paint:Landroid/graphics/Paint;

    .line 151
    .line 152
    move-object v3, p1

    .line 153
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->settings:Lcom/mr/elaris/InAppSettings;

    .line 157
    .line 158
    invoke-virtual {p1, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    int-to-float p1, p1

    .line 163
    sub-float v6, v4, p1

    .line 164
    .line 165
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->settings:Lcom/mr/elaris/InAppSettings;

    .line 166
    .line 167
    invoke-virtual {p1, v9}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    int-to-float p1, p1

    .line 172
    add-float v7, v5, p1

    .line 173
    .line 174
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->settings:Lcom/mr/elaris/InAppSettings;

    .line 175
    .line 176
    const v0, 0x40266666    # 2.6f

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    int-to-float p1, p1

    .line 184
    add-float v8, v4, p1

    .line 185
    .line 186
    iget-object v10, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->paint:Landroid/graphics/Paint;

    .line 187
    .line 188
    move v9, v5

    .line 189
    move-object v5, v3

    .line 190
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 191
    .line 192
    .line 193
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->paint:Landroid/graphics/Paint;

    .line 194
    .line 195
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 196
    .line 197
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 198
    .line 199
    .line 200
    iget p1, v2, Landroid/graphics/RectF;->left:F

    .line 201
    .line 202
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    const v1, 0x3eb33333    # 0.35f

    .line 207
    .line 208
    .line 209
    mul-float/2addr v0, v1

    .line 210
    add-float/2addr v0, p1

    .line 211
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->settings:Lcom/mr/elaris/InAppSettings;

    .line 216
    .line 217
    const v4, 0x3f666666    # 0.9f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    int-to-float v1, v1

    .line 225
    iget-object v5, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->paint:Landroid/graphics/Paint;

    .line 226
    .line 227
    invoke-virtual {v3, v0, p1, v1, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->settings:Lcom/mr/elaris/InAppSettings;

    .line 239
    .line 240
    invoke-virtual {v1, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    int-to-float v1, v1

    .line 245
    iget-object v5, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->paint:Landroid/graphics/Paint;

    .line 246
    .line 247
    invoke-virtual {v3, p1, v0, v1, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 248
    .line 249
    .line 250
    iget p1, v2, Landroid/graphics/RectF;->left:F

    .line 251
    .line 252
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    const v1, 0x3f266666    # 0.65f

    .line 257
    .line 258
    .line 259
    mul-float/2addr v0, v1

    .line 260
    add-float/2addr v0, p1

    .line 261
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->settings:Lcom/mr/elaris/InAppSettings;

    .line 266
    .line 267
    invoke-virtual {v1, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    int-to-float v1, v1

    .line 272
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->paint:Landroid/graphics/Paint;

    .line 273
    .line 274
    invoke-virtual {v3, v0, p1, v1, p0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 275
    .line 276
    .line 277
    return-void
.end method

.method public getOpacity()I
    .locals 0

    .line 1
    const/4 p0, -0x3

    .line 2
    return p0
.end method

.method public setAlpha(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->paint:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;->paint:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    return-void
.end method
