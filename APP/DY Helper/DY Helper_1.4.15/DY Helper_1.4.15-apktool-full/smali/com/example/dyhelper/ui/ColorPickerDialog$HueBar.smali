.class final Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lii;


# static fields
.field public static final synthetic π:I


# instance fields
.field public ε:F

.field public ζ:Lcom/example/dyhelper/ui/ζ;

.field public final η:Landroid/graphics/Paint;

.field public final θ:Landroid/graphics/Path;

.field public final ι:Landroid/graphics/RectF;

.field public κ:Landroid/graphics/LinearGradient;

.field public final λ:Landroid/graphics/Paint;

.field public final μ:Landroid/graphics/Paint;

.field public final ν:Landroid/graphics/Paint;

.field public ξ:F

.field public ο:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lxx;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Paint;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->η:Landroid/graphics/Paint;

    .line 14
    .line 15
    new-instance v0, Landroid/graphics/Path;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->θ:Landroid/graphics/Path;

    .line 21
    .line 22
    new-instance v0, Landroid/graphics/RectF;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ι:Landroid/graphics/RectF;

    .line 28
    .line 29
    new-instance v0, Landroid/graphics/Paint;

    .line 30
    .line 31
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 32
    .line 33
    .line 34
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    int-to-float v3, v3

    .line 44
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 45
    .line 46
    .line 47
    iget-object p2, p2, Lxx;->δ:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->λ:Landroid/graphics/Paint;

    .line 57
    .line 58
    new-instance p2, Landroid/graphics/Paint;

    .line 59
    .line 60
    invoke-direct {p2, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x2

    .line 67
    invoke-static {p1, v0}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    int-to-float p1, p1

    .line 72
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 73
    .line 74
    .line 75
    const/4 p1, -0x1

    .line 76
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 77
    .line 78
    .line 79
    iput-object p2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->μ:Landroid/graphics/Paint;

    .line 80
    .line 81
    new-instance p1, Landroid/graphics/Paint;

    .line 82
    .line 83
    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 87
    .line 88
    .line 89
    const/high16 p2, -0x1000000

    .line 90
    .line 91
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 92
    .line 93
    .line 94
    const/16 p2, 0x5a

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 97
    .line 98
    .line 99
    iput-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ν:Landroid/graphics/Paint;

    .line 100
    .line 101
    const/high16 p1, 0x3f800000    # 1.0f

    .line 102
    .line 103
    iput p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ξ:F

    .line 104
    .line 105
    const-string p1, "\u8272\u76f8\u9009\u62e9\u8f68\u9053"

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 111
    .line 112
    .line 113
    return-void
.end method


# virtual methods
.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ο:Landroid/animation/ValueAnimator;

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
    iput-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ο:Landroid/animation/ValueAnimator;

    .line 10
    .line 11
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 9

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
    int-to-float v5, v0

    .line 17
    const/4 v0, 0x0

    .line 18
    cmpg-float v1, v4, v0

    .line 19
    .line 20
    if-lez v1, :cond_2

    .line 21
    .line 22
    cmpg-float v0, v5, v0

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
    div-float v7, v5, v0

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    iget-object v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->θ:Landroid/graphics/Path;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->κ:Landroid/graphics/LinearGradient;

    .line 42
    .line 43
    iget-object v6, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->η:Landroid/graphics/Paint;

    .line 44
    .line 45
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    const/4 v3, 0x0

    .line 50
    move-object v1, p1

    .line 51
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    invoke-virtual {v6, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v8}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->λ:Landroid/graphics/Paint;

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    div-float/2addr v2, v0

    .line 68
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    div-float/2addr v3, v0

    .line 73
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    div-float/2addr v6, v0

    .line 78
    sub-float v6, v4, v6

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    div-float/2addr v8, v0

    .line 85
    sub-float/2addr v5, v8

    .line 86
    iget-object v8, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ι:Landroid/graphics/RectF;

    .line 87
    .line 88
    invoke-virtual {v8, v2, v3, v6, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v8, v7, v7, p1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    const/4 v2, 0x3

    .line 102
    invoke-static {p1, v2}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    int-to-float p1, p1

    .line 107
    sub-float p1, v7, p1

    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    const/4 v3, 0x7

    .line 117
    invoke-static {v2, v3}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    int-to-float v2, v2

    .line 122
    cmpg-float v3, p1, v2

    .line 123
    .line 124
    if-gez v3, :cond_1

    .line 125
    .line 126
    move p1, v2

    .line 127
    :cond_1
    iget v2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ξ:F

    .line 128
    .line 129
    mul-float/2addr p1, v2

    .line 130
    iget v2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ε:F

    .line 131
    .line 132
    const/high16 v3, 0x43b40000    # 360.0f

    .line 133
    .line 134
    div-float/2addr v2, v3

    .line 135
    mul-float/2addr v2, v4

    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    const/4 v5, 0x2

    .line 144
    invoke-static {v3, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    int-to-float v3, v3

    .line 149
    add-float/2addr v3, p1

    .line 150
    sub-float/2addr v4, p1

    .line 151
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-static {v6, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    int-to-float v5, v5

    .line 163
    sub-float/2addr v4, v5

    .line 164
    invoke-static {v2, v3, v4}, Lj81;->λ(FFF)F

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    const v3, 0x3ed70a3d    # 0.42f

    .line 169
    .line 170
    .line 171
    mul-float/2addr v3, p1

    .line 172
    iget-object v4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ν:Landroid/graphics/Paint;

    .line 173
    .line 174
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    div-float/2addr v3, v0

    .line 182
    add-float/2addr v3, p1

    .line 183
    invoke-virtual {v1, v2, v7, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 184
    .line 185
    .line 186
    iget-object p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->μ:Landroid/graphics/Paint;

    .line 187
    .line 188
    invoke-virtual {v1, v2, v7, p1, p0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 189
    .line 190
    .line 191
    :cond_2
    :goto_0
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 8

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
    iget-object p4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->θ:Landroid/graphics/Path;

    .line 10
    .line 11
    invoke-virtual {p4}, Landroid/graphics/Path;->reset()V

    .line 12
    .line 13
    .line 14
    int-to-float v3, p1

    .line 15
    iget-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ι:Landroid/graphics/RectF;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0, v0, v3, p2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 19
    .line 20
    .line 21
    sget-object p2, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 22
    .line 23
    invoke-virtual {p4, p1, p3, p3, p2}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Landroid/graphics/LinearGradient;

    .line 27
    .line 28
    const/4 p1, 0x7

    .line 29
    new-array v5, p1, [I

    .line 30
    .line 31
    fill-array-data v5, :array_0

    .line 32
    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->κ:Landroid/graphics/LinearGradient;

    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :array_0
    .array-data 4
        -0x10000
        -0x100
        -0xff0100
        -0xff0001
        -0xffff01
        -0xff01
        -0x10000
    .end array-data
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
    const/4 v1, 0x1

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
    iget-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ο:Landroid/animation/ValueAnimator;

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
    iget v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ξ:F

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
    const-wide/16 v1, 0x96

    .line 32
    .line 33
    invoke-virtual {p1, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 34
    .line 35
    .line 36
    new-instance v1, Lcom/example/dyhelper/ui/δ;

    .line 37
    .line 38
    invoke-direct {v1, p0, v0}, Lcom/example/dyhelper/ui/δ;-><init>(Landroid/view/View;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ο:Landroid/animation/ValueAnimator;

    .line 48
    .line 49
    return-void
.end method
