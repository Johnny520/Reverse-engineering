.class final Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lii;


# static fields
.field public static final synthetic χ:I


# instance fields
.field public ε:F

.field public ζ:F

.field public η:F

.field public θ:Lcom/example/dyhelper/ui/ι;

.field public ι:Landroid/graphics/LinearGradient;

.field public κ:Landroid/graphics/LinearGradient;

.field public final λ:Landroid/graphics/Paint;

.field public final μ:Landroid/graphics/Path;

.field public final ν:Landroid/graphics/RectF;

.field public final ξ:F

.field public final ο:Landroid/graphics/Paint;

.field public final π:Landroid/graphics/Paint;

.field public final ρ:Landroid/graphics/Paint;

.field public final σ:F

.field public final τ:F

.field public υ:F

.field public φ:Landroid/animation/ValueAnimator;


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
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    iput v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ζ:F

    .line 10
    .line 11
    iput v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->η:F

    .line 12
    .line 13
    new-instance v0, Landroid/graphics/Paint;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->λ:Landroid/graphics/Paint;

    .line 20
    .line 21
    new-instance v0, Landroid/graphics/Path;

    .line 22
    .line 23
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->μ:Landroid/graphics/Path;

    .line 27
    .line 28
    new-instance v0, Landroid/graphics/RectF;

    .line 29
    .line 30
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ν:Landroid/graphics/RectF;

    .line 34
    .line 35
    const/16 v0, 0xa

    .line 36
    .line 37
    invoke-static {p1, v0}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    int-to-float v2, v2

    .line 42
    iput v2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ξ:F

    .line 43
    .line 44
    new-instance v2, Landroid/graphics/Paint;

    .line 45
    .line 46
    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 47
    .line 48
    .line 49
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v1}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    int-to-float v4, v4

    .line 59
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p2, Lxx;->δ:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 69
    .line 70
    .line 71
    iput-object v2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ο:Landroid/graphics/Paint;

    .line 72
    .line 73
    new-instance p2, Landroid/graphics/Paint;

    .line 74
    .line 75
    invoke-direct {p2, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 79
    .line 80
    .line 81
    const/4 v2, 0x2

    .line 82
    invoke-static {p1, v2}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    int-to-float v2, v2

    .line 87
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 88
    .line 89
    .line 90
    const/4 v2, -0x1

    .line 91
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 92
    .line 93
    .line 94
    iput-object p2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->π:Landroid/graphics/Paint;

    .line 95
    .line 96
    new-instance p2, Landroid/graphics/Paint;

    .line 97
    .line 98
    invoke-direct {p2, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 102
    .line 103
    .line 104
    const/high16 v2, -0x1000000

    .line 105
    .line 106
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 107
    .line 108
    .line 109
    const/16 v2, 0x5a

    .line 110
    .line 111
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 112
    .line 113
    .line 114
    iput-object p2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ρ:Landroid/graphics/Paint;

    .line 115
    .line 116
    invoke-static {p1, v0}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    int-to-float p2, p2

    .line 121
    iput p2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->σ:F

    .line 122
    .line 123
    const/16 v0, 0xd

    .line 124
    .line 125
    invoke-static {p1, v0}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    int-to-float p1, p1

    .line 130
    iput p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->τ:F

    .line 131
    .line 132
    iput p2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->υ:F

    .line 133
    .line 134
    const-string p1, "\u9971\u548c\u5ea6\u548c\u660e\u5ea6\u9009\u62e9\u533a\u57df"

    .line 135
    .line 136
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 140
    .line 141
    .line 142
    return-void
.end method


# virtual methods
.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->φ:Landroid/animation/ValueAnimator;

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
    iput-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->φ:Landroid/animation/ValueAnimator;

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
    if-lez v1, :cond_1

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
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->μ:Landroid/graphics/Path;

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ι:Landroid/graphics/LinearGradient;

    .line 38
    .line 39
    iget-object v6, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->λ:Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 42
    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    const/4 v3, 0x0

    .line 46
    move-object v1, p1

    .line 47
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->κ:Landroid/graphics/LinearGradient;

    .line 51
    .line 52
    invoke-virtual {v6, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 53
    .line 54
    .line 55
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    invoke-virtual {v6, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ο:Landroid/graphics/Paint;

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/high16 v2, 0x40000000    # 2.0f

    .line 72
    .line 73
    div-float/2addr v0, v2

    .line 74
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    div-float/2addr v3, v2

    .line 79
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    div-float/2addr v6, v2

    .line 84
    sub-float v6, v4, v6

    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    div-float/2addr v7, v2

    .line 91
    sub-float v7, v5, v7

    .line 92
    .line 93
    iget-object v8, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ν:Landroid/graphics/RectF;

    .line 94
    .line 95
    invoke-virtual {v8, v0, v3, v6, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 96
    .line 97
    .line 98
    iget v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ξ:F

    .line 99
    .line 100
    invoke-virtual {v1, v8, v0, v0, p1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 101
    .line 102
    .line 103
    iget p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->υ:F

    .line 104
    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    const/4 v3, 0x2

    .line 113
    invoke-static {v0, v3}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    int-to-float v0, v0

    .line 118
    add-float/2addr p1, v0

    .line 119
    iget v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ζ:F

    .line 120
    .line 121
    mul-float/2addr v0, v4

    .line 122
    sub-float/2addr v4, p1

    .line 123
    invoke-static {v0, p1, v4}, Lj81;->λ(FFF)F

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    const/high16 v3, 0x3f800000    # 1.0f

    .line 128
    .line 129
    iget v4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->η:F

    .line 130
    .line 131
    sub-float/2addr v3, v4

    .line 132
    mul-float/2addr v3, v5

    .line 133
    sub-float/2addr v5, p1

    .line 134
    invoke-static {v3, p1, v5}, Lj81;->λ(FFF)F

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    iget v3, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->υ:F

    .line 139
    .line 140
    const v4, 0x3ed70a3d    # 0.42f

    .line 141
    .line 142
    .line 143
    mul-float/2addr v3, v4

    .line 144
    iget-object v4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ρ:Landroid/graphics/Paint;

    .line 145
    .line 146
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 147
    .line 148
    .line 149
    iget v3, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->υ:F

    .line 150
    .line 151
    invoke-virtual {v4}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    div-float/2addr v5, v2

    .line 156
    add-float/2addr v5, v3

    .line 157
    invoke-virtual {v1, v0, p1, v5, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 158
    .line 159
    .line 160
    iget v2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->υ:F

    .line 161
    .line 162
    iget-object p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->π:Landroid/graphics/Paint;

    .line 163
    .line 164
    invoke-virtual {v1, v0, p1, v2, p0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 165
    .line 166
    .line 167
    :cond_1
    :goto_0
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 13

    .line 1
    invoke-super/range {p0 .. p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->μ:Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 7
    .line 8
    .line 9
    int-to-float v4, p1

    .line 10
    int-to-float v9, p2

    .line 11
    iget-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ν:Landroid/graphics/RectF;

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-virtual {p1, p2, p2, v4, v9}, Landroid/graphics/RectF;->set(FFFF)V

    .line 15
    .line 16
    .line 17
    iget p2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ξ:F

    .line 18
    .line 19
    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2, p2, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 22
    .line 23
    .line 24
    new-instance v5, Landroid/graphics/LinearGradient;

    .line 25
    .line 26
    sget-object v12, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x0

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v10, 0x0

    .line 32
    const/high16 v11, -0x1000000

    .line 33
    .line 34
    invoke-direct/range {v5 .. v12}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 35
    .line 36
    .line 37
    iput-object v5, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->κ:Landroid/graphics/LinearGradient;

    .line 38
    .line 39
    new-instance v1, Landroid/graphics/LinearGradient;

    .line 40
    .line 41
    iget p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ε:F

    .line 42
    .line 43
    const/4 p2, 0x3

    .line 44
    new-array p2, p2, [F

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    aput p1, p2, v0

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    const/high16 v0, 0x3f800000    # 1.0f

    .line 51
    .line 52
    aput v0, p2, p1

    .line 53
    .line 54
    const/4 p1, 0x2

    .line 55
    aput v0, p2, p1

    .line 56
    .line 57
    invoke-static {p2}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    const/4 v2, 0x0

    .line 62
    const/4 v3, 0x0

    .line 63
    const/4 v5, 0x0

    .line 64
    const/4 v6, -0x1

    .line 65
    move-object v8, v12

    .line 66
    invoke-direct/range {v1 .. v8}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 67
    .line 68
    .line 69
    iput-object v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ι:Landroid/graphics/LinearGradient;

    .line 70
    .line 71
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
    const/4 v1, 0x2

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
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->φ:Landroid/animation/ValueAnimator;

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
    iget p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->τ:F

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    iget p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->σ:F

    .line 14
    .line 15
    :goto_0
    iget v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->υ:F

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    new-array v2, v1, [F

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aput v0, v2, v3

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    aput p1, v2, v0

    .line 25
    .line 26
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-wide/16 v2, 0x96

    .line 31
    .line 32
    invoke-virtual {p1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 33
    .line 34
    .line 35
    new-instance v0, Lcom/example/dyhelper/ui/δ;

    .line 36
    .line 37
    invoke-direct {v0, p0, v1}, Lcom/example/dyhelper/ui/δ;-><init>(Landroid/view/View;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->φ:Landroid/animation/ValueAnimator;

    .line 47
    .line 48
    return-void
.end method
