.class final Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lii;


# static fields
.field public static final synthetic φ:I


# instance fields
.field public ε:I

.field public ζ:I

.field public η:Lcom/example/dyhelper/ui/ζ;

.field public final θ:Landroid/graphics/Paint;

.field public final ι:Landroid/graphics/Path;

.field public final κ:Landroid/graphics/RectF;

.field public λ:Landroid/graphics/LinearGradient;

.field public μ:F

.field public ν:I

.field public final ξ:I

.field public final ο:I

.field public final π:Landroid/graphics/Paint;

.field public final ρ:Landroid/graphics/Paint;

.field public final σ:Landroid/graphics/Paint;

.field public τ:F

.field public υ:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lxx;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0xff

    .line 8
    .line 9
    iput v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ε:I

    .line 10
    .line 11
    const/high16 v0, -0x10000

    .line 12
    .line 13
    iput v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ζ:I

    .line 14
    .line 15
    new-instance v0, Landroid/graphics/Paint;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->θ:Landroid/graphics/Paint;

    .line 22
    .line 23
    new-instance v0, Landroid/graphics/Path;

    .line 24
    .line 25
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ι:Landroid/graphics/Path;

    .line 29
    .line 30
    new-instance v0, Landroid/graphics/RectF;

    .line 31
    .line 32
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->κ:Landroid/graphics/RectF;

    .line 36
    .line 37
    const/4 v0, -0x1

    .line 38
    iput v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ν:I

    .line 39
    .line 40
    iget-object v2, p2, Lxx;->γ:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    iput v2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ξ:I

    .line 47
    .line 48
    iget-object v2, p2, Lxx;->ε:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    iput v2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ο:I

    .line 55
    .line 56
    new-instance v2, Landroid/graphics/Paint;

    .line 57
    .line 58
    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 59
    .line 60
    .line 61
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1, v1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    int-to-float v4, v4

    .line 71
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 72
    .line 73
    .line 74
    iget-object p2, p2, Lxx;->δ:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 81
    .line 82
    .line 83
    iput-object v2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->π:Landroid/graphics/Paint;

    .line 84
    .line 85
    new-instance p2, Landroid/graphics/Paint;

    .line 86
    .line 87
    invoke-direct {p2, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 91
    .line 92
    .line 93
    const/4 v2, 0x2

    .line 94
    invoke-static {p1, v2}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    int-to-float p1, p1

    .line 99
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 103
    .line 104
    .line 105
    iput-object p2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ρ:Landroid/graphics/Paint;

    .line 106
    .line 107
    new-instance p1, Landroid/graphics/Paint;

    .line 108
    .line 109
    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 113
    .line 114
    .line 115
    const/high16 p2, -0x1000000

    .line 116
    .line 117
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 118
    .line 119
    .line 120
    const/16 p2, 0x5a

    .line 121
    .line 122
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 123
    .line 124
    .line 125
    iput-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->σ:Landroid/graphics/Paint;

    .line 126
    .line 127
    const/high16 p1, 0x3f800000    # 1.0f

    .line 128
    .line 129
    iput p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->τ:F

    .line 130
    .line 131
    const-string p1, "\u900f\u660e\u5ea6\u9009\u62e9\u8f68\u9053"

    .line 132
    .line 133
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 137
    .line 138
    .line 139
    return-void
.end method


# virtual methods
.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->υ:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->υ:Landroid/animation/ValueAnimator;

    .line 10
    .line 11
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    int-to-float v4, v0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-float v3, v0

    .line 17
    const/4 v0, 0x0

    .line 18
    cmpg-float v1, v4, v0

    .line 19
    .line 20
    if-lez v1, :cond_4

    .line 21
    .line 22
    cmpg-float v0, v3, v0

    .line 23
    .line 24
    if-gtz v0, :cond_0

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :cond_0
    const/high16 v0, 0x40000000    # 2.0f

    .line 29
    .line 30
    div-float v9, v3, v0

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    iget-object v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ι:Landroid/graphics/Path;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 39
    .line 40
    .line 41
    iget v5, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ξ:I

    .line 42
    .line 43
    iget v6, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ο:I

    .line 44
    .line 45
    move v2, v4

    .line 46
    iget-object v4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->θ:Landroid/graphics/Paint;

    .line 47
    .line 48
    move-object v1, p1

    .line 49
    invoke-static/range {v1 .. v6}, Lcom/example/dyhelper/ui/μ;->α(Landroid/graphics/Canvas;FFLandroid/graphics/Paint;II)V

    .line 50
    .line 51
    .line 52
    move v11, v3

    .line 53
    move-object v12, v4

    .line 54
    iget v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->μ:F

    .line 55
    .line 56
    cmpg-float v1, v2, v1

    .line 57
    .line 58
    if-nez v1, :cond_1

    .line 59
    .line 60
    iget v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ζ:I

    .line 61
    .line 62
    iget v3, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ν:I

    .line 63
    .line 64
    if-eq v1, v3, :cond_2

    .line 65
    .line 66
    :cond_1
    new-instance v1, Landroid/graphics/LinearGradient;

    .line 67
    .line 68
    iget v7, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ζ:I

    .line 69
    .line 70
    sget-object v8, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 71
    .line 72
    move v4, v2

    .line 73
    const/4 v2, 0x0

    .line 74
    const/4 v3, 0x0

    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x0

    .line 77
    invoke-direct/range {v1 .. v8}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 78
    .line 79
    .line 80
    move v2, v4

    .line 81
    iput-object v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->λ:Landroid/graphics/LinearGradient;

    .line 82
    .line 83
    iput v2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->μ:F

    .line 84
    .line 85
    iget v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ζ:I

    .line 86
    .line 87
    iput v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ν:I

    .line 88
    .line 89
    :cond_2
    iget-object v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->λ:Landroid/graphics/LinearGradient;

    .line 90
    .line 91
    invoke-virtual {v12, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 92
    .line 93
    .line 94
    move v4, v2

    .line 95
    const/4 v2, 0x0

    .line 96
    const/4 v3, 0x0

    .line 97
    move-object v1, p1

    .line 98
    move v5, v11

    .line 99
    move-object v6, v12

    .line 100
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 101
    .line 102
    .line 103
    move v2, v4

    .line 104
    move v3, v5

    .line 105
    move-object v4, v6

    .line 106
    const/4 p1, 0x0

    .line 107
    invoke-virtual {v4, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v10}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->π:Landroid/graphics/Paint;

    .line 114
    .line 115
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    div-float/2addr v4, v0

    .line 120
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    div-float/2addr v5, v0

    .line 125
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    div-float/2addr v6, v0

    .line 130
    sub-float v6, v2, v6

    .line 131
    .line 132
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    div-float/2addr v7, v0

    .line 137
    sub-float/2addr v3, v7

    .line 138
    iget-object v7, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->κ:Landroid/graphics/RectF;

    .line 139
    .line 140
    invoke-virtual {v7, v4, v5, v6, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v7, v9, v9, p1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    const/4 v3, 0x3

    .line 154
    invoke-static {p1, v3}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    int-to-float p1, p1

    .line 159
    sub-float p1, v9, p1

    .line 160
    .line 161
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    const/4 v4, 0x7

    .line 169
    invoke-static {v3, v4}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    int-to-float v3, v3

    .line 174
    cmpg-float v4, p1, v3

    .line 175
    .line 176
    if-gez v4, :cond_3

    .line 177
    .line 178
    move p1, v3

    .line 179
    :cond_3
    iget v3, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->τ:F

    .line 180
    .line 181
    mul-float/2addr p1, v3

    .line 182
    iget v3, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ε:I

    .line 183
    .line 184
    int-to-float v3, v3

    .line 185
    const/high16 v4, 0x437f0000    # 255.0f

    .line 186
    .line 187
    div-float/2addr v3, v4

    .line 188
    mul-float/2addr v3, v2

    .line 189
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    const/4 v5, 0x2

    .line 197
    invoke-static {v4, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    int-to-float v4, v4

    .line 202
    add-float/2addr v4, p1

    .line 203
    sub-float/2addr v2, p1

    .line 204
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-static {v6, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    int-to-float v5, v5

    .line 216
    sub-float/2addr v2, v5

    .line 217
    invoke-static {v3, v4, v2}, Lj81;->λ(FFF)F

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    const v3, 0x3ed70a3d    # 0.42f

    .line 222
    .line 223
    .line 224
    mul-float/2addr v3, p1

    .line 225
    iget-object v4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->σ:Landroid/graphics/Paint;

    .line 226
    .line 227
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    div-float/2addr v3, v0

    .line 235
    add-float/2addr v3, p1

    .line 236
    invoke-virtual {v1, v2, v9, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 237
    .line 238
    .line 239
    iget-object p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ρ:Landroid/graphics/Paint;

    .line 240
    .line 241
    invoke-virtual {v1, v2, v9, p1, p0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 242
    .line 243
    .line 244
    :cond_4
    :goto_0
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    int-to-float p2, p2

    .line 5
    const/high16 p3, 0x40000000    # 2.0f

    .line 6
    .line 7
    div-float p3, p2, p3

    .line 8
    .line 9
    iget-object p4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ι:Landroid/graphics/Path;

    .line 10
    .line 11
    invoke-virtual {p4}, Landroid/graphics/Path;->reset()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    int-to-float p1, p1

    .line 16
    iget-object p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->κ:Landroid/graphics/RectF;

    .line 17
    .line 18
    invoke-virtual {p0, v0, v0, p1, p2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 22
    .line 23
    invoke-virtual {p4, p0, p3, p3, p1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/example/dyhelper/ui/γ;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lcom/example/dyhelper/ui/γ;-><init>(Landroid/view/View;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1, v0}, Lcom/example/dyhelper/ui/μ;->β(Landroid/view/View;Landroid/view/MotionEvent;La80;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/4 v1, 0x1

    .line 21
    if-ne p1, v1, :cond_0

    .line 22
    .line 23
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 24
    .line 25
    .line 26
    :cond_0
    return v0
.end method

.method public final performClick()Z
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0
.end method

.method public final α(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->υ:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-eqz p1, :cond_1

    .line 9
    .line 10
    const p1, 0x3f970a3d    # 1.18f

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 15
    .line 16
    :goto_0
    iget v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->τ:F

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    new-array v1, v1, [F

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    aput v0, v1, v2

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    aput p1, v1, v0

    .line 26
    .line 27
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-wide/16 v0, 0x96

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 34
    .line 35
    .line 36
    new-instance v0, Lcom/example/dyhelper/ui/δ;

    .line 37
    .line 38
    invoke-direct {v0, p0, v2}, Lcom/example/dyhelper/ui/δ;-><init>(Landroid/view/View;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->υ:Landroid/animation/ValueAnimator;

    .line 48
    .line 49
    return-void
.end method
