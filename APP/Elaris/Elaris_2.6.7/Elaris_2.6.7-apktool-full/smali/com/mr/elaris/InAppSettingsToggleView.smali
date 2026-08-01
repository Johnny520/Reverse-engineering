.class Lcom/mr/elaris/InAppSettingsToggleView;
.super Landroid/view/View;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field private static final TOGGLE_ANIMATION_MS:J = 0xaaL


# instance fields
.field private checkAnimator:Landroid/animation/ValueAnimator;

.field private checked:Z

.field private final paint:Landroid/graphics/Paint;

.field private final settings:Lcom/mr/elaris/InAppSettings;

.field private final strokeBounds:Landroid/graphics/RectF;

.field private thumbFraction:F

.field private final trackBounds:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Landroid/graphics/RectF;

    .line 5
    .line 6
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsToggleView;->trackBounds:Landroid/graphics/RectF;

    .line 10
    .line 11
    new-instance p2, Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsToggleView;->strokeBounds:Landroid/graphics/RectF;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsToggleView;->settings:Lcom/mr/elaris/InAppSettings;

    .line 19
    .line 20
    new-instance p2, Landroid/graphics/Paint;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsToggleView;->paint:Landroid/graphics/Paint;

    .line 27
    .line 28
    invoke-virtual {p0, v0, p2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 29
    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    invoke-virtual {p0, p2}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    const/high16 v0, 0x3f800000    # 1.0f

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p2}, Landroid/view/View;->setClickable(Z)V

    .line 47
    .line 48
    .line 49
    const/high16 p2, 0x42200000    # 40.0f

    .line 50
    .line 51
    invoke-virtual {p1, p2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    invoke-virtual {p0, p2}, Landroid/view/View;->setMinimumWidth(I)V

    .line 56
    .line 57
    .line 58
    const/high16 p2, 0x41b00000    # 22.0f

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {p0, p1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public static bridge synthetic a(Lcom/mr/elaris/InAppSettingsToggleView;F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mr/elaris/InAppSettingsToggleView;->thumbFraction:F

    .line 2
    .line 3
    return-void
.end method

.method private static blendColor(IIF)I
    .locals 5

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0, p2}, Ljava/lang/Math;->min(FF)F

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-float v0, v0

    .line 17
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    sub-int/2addr v1, v2

    .line 26
    int-to-float v1, v1

    .line 27
    mul-float/2addr v1, p2

    .line 28
    add-float/2addr v1, v0

    .line 29
    float-to-int v0, v1

    .line 30
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    int-to-float v1, v1

    .line 35
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    sub-int/2addr v2, v3

    .line 44
    int-to-float v2, v2

    .line 45
    mul-float/2addr v2, p2

    .line 46
    add-float/2addr v2, v1

    .line 47
    float-to-int v1, v2

    .line 48
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    int-to-float v2, v2

    .line 53
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    sub-int/2addr v3, v4

    .line 62
    int-to-float v3, v3

    .line 63
    mul-float/2addr v3, p2

    .line 64
    add-float/2addr v3, v2

    .line 65
    float-to-int v2, v3

    .line 66
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    int-to-float v3, v3

    .line 71
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    sub-int/2addr p1, p0

    .line 80
    int-to-float p0, p1

    .line 81
    mul-float/2addr p0, p2

    .line 82
    add-float/2addr p0, v3

    .line 83
    float-to-int p0, p0

    .line 84
    invoke-static {v0, v1, v2, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    return p0
.end method

.method private cancelCheckAnimator()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsToggleView;->checkAnimator:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/mr/elaris/InAppSettingsToggleView;->checkAnimator:Landroid/animation/ValueAnimator;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private offTrackColor()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsToggleView;->settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/mr/elaris/InAppSettings;->toggleOffBackgroundColor()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    sget p0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->SWITCH_OFF_COLOR:I

    .line 15
    .line 16
    return p0
.end method

.method private onTrackColor()I
    .locals 0

    .line 1
    sget p0, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public isChecked()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/mr/elaris/InAppSettingsToggleView;->checked:Z

    .line 2
    .line 3
    return p0
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettingsToggleView;->cancelCheckAnimator()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    int-to-float v0, v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    int-to-float v1, v1

    .line 14
    const/high16 v2, 0x40000000    # 2.0f

    .line 15
    .line 16
    div-float v3, v1, v2

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettingsToggleView;->offTrackColor()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettingsToggleView;->onTrackColor()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    iget v6, p0, Lcom/mr/elaris/InAppSettingsToggleView;->thumbFraction:F

    .line 27
    .line 28
    invoke-static {v4, v5, v6}, Lcom/mr/elaris/InAppSettingsToggleView;->blendColor(IIF)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    iget-object v5, p0, Lcom/mr/elaris/InAppSettingsToggleView;->paint:Landroid/graphics/Paint;

    .line 33
    .line 34
    sget-object v6, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 35
    .line 36
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 37
    .line 38
    .line 39
    iget-object v5, p0, Lcom/mr/elaris/InAppSettingsToggleView;->paint:Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 42
    .line 43
    .line 44
    iget-object v5, p0, Lcom/mr/elaris/InAppSettingsToggleView;->trackBounds:Landroid/graphics/RectF;

    .line 45
    .line 46
    const/4 v7, 0x0

    .line 47
    invoke-virtual {v5, v7, v7, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 48
    .line 49
    .line 50
    iget-object v5, p0, Lcom/mr/elaris/InAppSettingsToggleView;->trackBounds:Landroid/graphics/RectF;

    .line 51
    .line 52
    iget-object v8, p0, Lcom/mr/elaris/InAppSettingsToggleView;->paint:Landroid/graphics/Paint;

    .line 53
    .line 54
    invoke-virtual {p1, v5, v3, v3, v8}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 55
    .line 56
    .line 57
    iget-object v5, p0, Lcom/mr/elaris/InAppSettingsToggleView;->paint:Landroid/graphics/Paint;

    .line 58
    .line 59
    sget-object v8, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 60
    .line 61
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 62
    .line 63
    .line 64
    iget-object v5, p0, Lcom/mr/elaris/InAppSettingsToggleView;->paint:Landroid/graphics/Paint;

    .line 65
    .line 66
    iget-object v8, p0, Lcom/mr/elaris/InAppSettingsToggleView;->settings:Lcom/mr/elaris/InAppSettings;

    .line 67
    .line 68
    const/high16 v9, 0x3f800000    # 1.0f

    .line 69
    .line 70
    invoke-virtual {v8, v9}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    int-to-float v8, v8

    .line 75
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 76
    .line 77
    .line 78
    iget-object v5, p0, Lcom/mr/elaris/InAppSettingsToggleView;->paint:Landroid/graphics/Paint;

    .line 79
    .line 80
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 81
    .line 82
    .line 83
    iget-object v4, p0, Lcom/mr/elaris/InAppSettingsToggleView;->settings:Lcom/mr/elaris/InAppSettings;

    .line 84
    .line 85
    const/high16 v5, 0x3f000000    # 0.5f

    .line 86
    .line 87
    invoke-virtual {v4, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    int-to-float v4, v4

    .line 92
    iget-object v8, p0, Lcom/mr/elaris/InAppSettingsToggleView;->strokeBounds:Landroid/graphics/RectF;

    .line 93
    .line 94
    sub-float v10, v0, v4

    .line 95
    .line 96
    sub-float/2addr v1, v4

    .line 97
    invoke-virtual {v8, v4, v4, v10, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsToggleView;->strokeBounds:Landroid/graphics/RectF;

    .line 101
    .line 102
    iget-object v4, p0, Lcom/mr/elaris/InAppSettingsToggleView;->paint:Landroid/graphics/Paint;

    .line 103
    .line 104
    invoke-virtual {p1, v1, v3, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsToggleView;->settings:Lcom/mr/elaris/InAppSettings;

    .line 108
    .line 109
    const/high16 v4, 0x41880000    # 17.0f

    .line 110
    .line 111
    invoke-virtual {v1, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    int-to-float v1, v1

    .line 116
    div-float/2addr v1, v2

    .line 117
    sub-float/2addr v0, v3

    .line 118
    sub-float/2addr v0, v3

    .line 119
    iget v2, p0, Lcom/mr/elaris/InAppSettingsToggleView;->thumbFraction:F

    .line 120
    .line 121
    mul-float/2addr v0, v2

    .line 122
    add-float/2addr v0, v3

    .line 123
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsToggleView;->paint:Landroid/graphics/Paint;

    .line 124
    .line 125
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 126
    .line 127
    .line 128
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsToggleView;->paint:Landroid/graphics/Paint;

    .line 129
    .line 130
    const/4 v4, -0x1

    .line 131
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 132
    .line 133
    .line 134
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsToggleView;->paint:Landroid/graphics/Paint;

    .line 135
    .line 136
    iget-object v4, p0, Lcom/mr/elaris/InAppSettingsToggleView;->settings:Lcom/mr/elaris/InAppSettings;

    .line 137
    .line 138
    invoke-virtual {v4, v9}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    int-to-float v4, v4

    .line 143
    iget-object v6, p0, Lcom/mr/elaris/InAppSettingsToggleView;->settings:Lcom/mr/elaris/InAppSettings;

    .line 144
    .line 145
    invoke-virtual {v6, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    int-to-float v5, v5

    .line 150
    const/16 v6, 0x56

    .line 151
    .line 152
    const/16 v8, 0x60

    .line 153
    .line 154
    const/16 v9, 0x14

    .line 155
    .line 156
    const/16 v10, 0x50

    .line 157
    .line 158
    invoke-static {v9, v10, v6, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    invoke-virtual {v2, v4, v7, v5, v6}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 163
    .line 164
    .line 165
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsToggleView;->paint:Landroid/graphics/Paint;

    .line 166
    .line 167
    invoke-virtual {p1, v0, v3, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 168
    .line 169
    .line 170
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsToggleView;->paint:Landroid/graphics/Paint;

    .line 171
    .line 172
    invoke-virtual {p0}, Landroid/graphics/Paint;->clearShadowLayer()V

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsToggleView;->settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    const/high16 v1, 0x42200000    # 40.0f

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsToggleView;->settings:Lcom/mr/elaris/InAppSettings;

    .line 18
    .line 19
    const/high16 v2, 0x41b00000    # 22.0f

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-static {v1, p2}, Landroid/view/View;->resolveSize(II)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public setChecked(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/mr/elaris/InAppSettingsToggleView;->checked:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Lcom/mr/elaris/InAppSettingsToggleView;->checked:Z

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    const/high16 p1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 p1, 0x0

    .line 14
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettingsToggleView;->cancelCheckAnimator()V

    .line 21
    .line 22
    .line 23
    iput p1, p0, Lcom/mr/elaris/InAppSettingsToggleView;->thumbFraction:F

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettingsToggleView;->cancelCheckAnimator()V

    .line 30
    .line 31
    .line 32
    iget v0, p0, Lcom/mr/elaris/InAppSettingsToggleView;->thumbFraction:F

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    new-array v1, v1, [F

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    aput v0, v1, v2

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    aput p1, v1, v0

    .line 42
    .line 43
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-wide/16 v0, 0xaa

    .line 48
    .line 49
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 50
    .line 51
    .line 52
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 53
    .line 54
    const/high16 v1, 0x3fc00000    # 1.5f

    .line 55
    .line 56
    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Lcom/mr/elaris/InAppSettingsToggleView$1;

    .line 63
    .line 64
    invoke-direct {v0, p0}, Lcom/mr/elaris/InAppSettingsToggleView$1;-><init>(Lcom/mr/elaris/InAppSettingsToggleView;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsToggleView;->checkAnimator:Landroid/animation/ValueAnimator;

    .line 74
    .line 75
    return-void
.end method
