.class final Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;
.super Landroid/view/View;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ColorPaletteView"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView$Listener;
    }
.end annotation


# static fields
.field private static final RAINBOW:[I


# instance fields
.field private final bounds:Landroid/graphics/RectF;

.field private hue:F

.field private hueShader:Landroid/graphics/Shader;

.field private listener:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView$Listener;

.field private final paint:Landroid/graphics/Paint;

.field private saturation:F

.field private saturationShader:Landroid/graphics/Shader;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->RAINBOW:[I

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/graphics/Paint;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->paint:Landroid/graphics/Paint;

    .line 11
    .line 12
    new-instance p1, Landroid/graphics/RectF;

    .line 13
    .line 14
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->bounds:Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 23
    .line 24
    .line 25
    const-string p1, "\u65f6\u95f4\u989c\u8272\u53d6\u8272\u677f"

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private dp(F)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    mul-float/2addr p1, p0

    .line 12
    return p1
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 7

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
    const/4 v2, 0x0

    .line 15
    cmpg-float v3, v0, v2

    .line 16
    .line 17
    if-lez v3, :cond_1

    .line 18
    .line 19
    cmpg-float v3, v1, v2

    .line 20
    .line 21
    if-gtz v3, :cond_0

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_0
    iget-object v3, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->bounds:Landroid/graphics/RectF;

    .line 26
    .line 27
    invoke-virtual {v3, v2, v2, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->paint:Landroid/graphics/Paint;

    .line 31
    .line 32
    iget-object v3, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->hueShader:Landroid/graphics/Shader;

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->bounds:Landroid/graphics/RectF;

    .line 38
    .line 39
    const/high16 v3, 0x41200000    # 10.0f

    .line 40
    .line 41
    invoke-direct {p0, v3}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->dp(F)F

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-direct {p0, v3}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->dp(F)F

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    iget-object v6, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->paint:Landroid/graphics/Paint;

    .line 50
    .line 51
    invoke-virtual {p1, v2, v4, v5, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->paint:Landroid/graphics/Paint;

    .line 55
    .line 56
    iget-object v4, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->saturationShader:Landroid/graphics/Shader;

    .line 57
    .line 58
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 59
    .line 60
    .line 61
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->bounds:Landroid/graphics/RectF;

    .line 62
    .line 63
    invoke-direct {p0, v3}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->dp(F)F

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-direct {p0, v3}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->dp(F)F

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    iget-object v5, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->paint:Landroid/graphics/Paint;

    .line 72
    .line 73
    invoke-virtual {p1, v2, v4, v3, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->paint:Landroid/graphics/Paint;

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 80
    .line 81
    .line 82
    iget v2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->hue:F

    .line 83
    .line 84
    const/high16 v3, 0x43b40000    # 360.0f

    .line 85
    .line 86
    div-float/2addr v2, v3

    .line 87
    mul-float/2addr v2, v0

    .line 88
    iget v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->saturation:F

    .line 89
    .line 90
    mul-float/2addr v0, v1

    .line 91
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->paint:Landroid/graphics/Paint;

    .line 92
    .line 93
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 94
    .line 95
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->paint:Landroid/graphics/Paint;

    .line 99
    .line 100
    const/high16 v3, 0x40800000    # 4.0f

    .line 101
    .line 102
    invoke-direct {p0, v3}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->dp(F)F

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->paint:Landroid/graphics/Paint;

    .line 110
    .line 111
    const/16 v3, 0x96

    .line 112
    .line 113
    const/4 v4, 0x0

    .line 114
    invoke-static {v3, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 119
    .line 120
    .line 121
    const/high16 v1, 0x41000000    # 8.0f

    .line 122
    .line 123
    invoke-direct {p0, v1}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->dp(F)F

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    iget-object v4, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->paint:Landroid/graphics/Paint;

    .line 128
    .line 129
    invoke-virtual {p1, v2, v0, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 130
    .line 131
    .line 132
    iget-object v3, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->paint:Landroid/graphics/Paint;

    .line 133
    .line 134
    const/high16 v4, 0x40000000    # 2.0f

    .line 135
    .line 136
    invoke-direct {p0, v4}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->dp(F)F

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 141
    .line 142
    .line 143
    iget-object v3, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->paint:Landroid/graphics/Paint;

    .line 144
    .line 145
    const/4 v4, -0x1

    .line 146
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 147
    .line 148
    .line 149
    invoke-direct {p0, v1}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->dp(F)F

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    iget-object v3, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->paint:Landroid/graphics/Paint;

    .line 154
    .line 155
    invoke-virtual {p1, v2, v0, v1, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 156
    .line 157
    .line 158
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->paint:Landroid/graphics/Paint;

    .line 159
    .line 160
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 161
    .line 162
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 163
    .line 164
    .line 165
    :cond_1
    :goto_0
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-super/range {p0 .. p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 8
    .line 9
    .line 10
    if-lez v1, :cond_1

    .line 11
    .line 12
    if-gtz v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v3, Landroid/graphics/LinearGradient;

    .line 16
    .line 17
    int-to-float v6, v1

    .line 18
    sget-object v8, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->RAINBOW:[I

    .line 19
    .line 20
    sget-object v16, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v9, 0x0

    .line 26
    move-object/from16 v10, v16

    .line 27
    .line 28
    invoke-direct/range {v3 .. v10}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 29
    .line 30
    .line 31
    iput-object v3, v0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->hueShader:Landroid/graphics/Shader;

    .line 32
    .line 33
    new-instance v9, Landroid/graphics/LinearGradient;

    .line 34
    .line 35
    int-to-float v13, v2

    .line 36
    const/4 v14, -0x1

    .line 37
    const/4 v15, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    invoke-direct/range {v9 .. v16}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 42
    .line 43
    .line 44
    iput-object v9, v0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->saturationShader:Landroid/graphics/Shader;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 48
    iput-object v1, v0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->hueShader:Landroid/graphics/Shader;

    .line 49
    .line 50
    iput-object v1, v0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->saturationShader:Landroid/graphics/Shader;

    .line 51
    .line 52
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    int-to-float v2, v2

    .line 27
    const/high16 v3, 0x3f800000    # 1.0f

    .line 28
    .line 29
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    int-to-float v4, v4

    .line 38
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const/4 v5, 0x0

    .line 51
    invoke-static {v5, v4}, Ljava/lang/Math;->max(FF)F

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-static {v3, p1}, Ljava/lang/Math;->min(FF)F

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-static {v5, p1}, Ljava/lang/Math;->max(FF)F

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    div-float/2addr v4, v2

    .line 68
    const/high16 v2, 0x43b40000    # 360.0f

    .line 69
    .line 70
    mul-float/2addr v4, v2

    .line 71
    iput v4, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->hue:F

    .line 72
    .line 73
    cmpl-float v2, v4, v2

    .line 74
    .line 75
    if-ltz v2, :cond_2

    .line 76
    .line 77
    const v2, 0x43b3ffdf    # 359.999f

    .line 78
    .line 79
    .line 80
    iput v2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->hue:F

    .line 81
    .line 82
    :cond_2
    div-float/2addr p1, v3

    .line 83
    iput p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->saturation:F

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->listener:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView$Listener;

    .line 89
    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    iget v2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->hue:F

    .line 93
    .line 94
    iget v3, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->saturation:F

    .line 95
    .line 96
    invoke-interface {p1, v2, v3}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView$Listener;->onColorChanged(FF)V

    .line 97
    .line 98
    .line 99
    :cond_3
    if-ne v0, v1, :cond_4

    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->performClick()Z

    .line 102
    .line 103
    .line 104
    :cond_4
    return v1
.end method

.method public performClick()Z
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

.method public setColor(I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    invoke-static {p1, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    aget p1, v0, p1

    .line 9
    .line 10
    iput p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->hue:F

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    aget p1, v0, p1

    .line 14
    .line 15
    iput p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->saturation:F

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setListener(Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView$Listener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->listener:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView$Listener;

    .line 2
    .line 3
    return-void
.end method
