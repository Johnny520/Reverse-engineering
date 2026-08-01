.class public final Lw9;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/RectF;

.field public final d:F


# direct methods
.method public constructor <init>(F)V
    .locals 4

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
    iput-object v0, p0, Lw9;->a:Landroid/graphics/Paint;

    .line 11
    .line 12
    new-instance v2, Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v2, p0, Lw9;->b:Landroid/graphics/Paint;

    .line 18
    .line 19
    new-instance v3, Landroid/graphics/RectF;

    .line 20
    .line 21
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v3, p0, Lw9;->c:Landroid/graphics/RectF;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    cmpg-float v3, p1, v3

    .line 28
    .line 29
    if-gtz v3, :cond_0

    .line 30
    .line 31
    const/high16 p1, 0x3f800000    # 1.0f

    .line 32
    .line 33
    :cond_0
    iput p1, p0, Lw9;->d:F

    .line 34
    .line 35
    sget-object p0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 38
    .line 39
    .line 40
    const p0, -0xed570b

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 49
    .line 50
    .line 51
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 52
    .line 53
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 60
    .line 61
    invoke-virtual {v2, p0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 65
    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-lez v1, :cond_2

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-gtz v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    int-to-float v1, v1

    .line 37
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 38
    .line 39
    int-to-float v2, v2

    .line 40
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    int-to-float v3, v3

    .line 45
    const/high16 v4, 0x40000000    # 2.0f

    .line 46
    .line 47
    div-float/2addr v3, v4

    .line 48
    add-float/2addr v3, v2

    .line 49
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 50
    .line 51
    int-to-float v2, v2

    .line 52
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    int-to-float v0, v0

    .line 57
    div-float/2addr v0, v4

    .line 58
    add-float/2addr v0, v2

    .line 59
    const/high16 v2, 0x3f800000    # 1.0f

    .line 60
    .line 61
    iget v5, p0, Lw9;->d:F

    .line 62
    .line 63
    mul-float/2addr v2, v5

    .line 64
    const v6, 0x3d7df3b6    # 0.062f

    .line 65
    .line 66
    .line 67
    mul-float/2addr v6, v1

    .line 68
    invoke-static {v2, v6}, Ljava/lang/Math;->max(FF)F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    div-float v6, v1, v4

    .line 73
    .line 74
    div-float v7, v2, v4

    .line 75
    .line 76
    sub-float/2addr v6, v7

    .line 77
    const/4 v7, 0x0

    .line 78
    invoke-static {v7, v6}, Ljava/lang/Math;->max(FF)F

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    iget-object v7, p0, Lw9;->a:Landroid/graphics/Paint;

    .line 83
    .line 84
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 85
    .line 86
    .line 87
    sub-float v2, v3, v6

    .line 88
    .line 89
    sub-float v8, v0, v6

    .line 90
    .line 91
    add-float v9, v3, v6

    .line 92
    .line 93
    add-float/2addr v6, v0

    .line 94
    iget-object v10, p0, Lw9;->c:Landroid/graphics/RectF;

    .line 95
    .line 96
    invoke-virtual {v10, v2, v8, v9, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v10, v7}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 100
    .line 101
    .line 102
    const/high16 v2, 0x41000000    # 8.0f

    .line 103
    .line 104
    mul-float/2addr v5, v2

    .line 105
    const v2, 0x3ee147ae    # 0.44f

    .line 106
    .line 107
    .line 108
    mul-float/2addr v1, v2

    .line 109
    invoke-static {v5, v1}, Ljava/lang/Math;->max(FF)F

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    iget-object p0, p0, Lw9;->b:Landroid/graphics/Paint;

    .line 114
    .line 115
    invoke-virtual {p0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget v2, v1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 123
    .line 124
    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 125
    .line 126
    add-float/2addr v2, v1

    .line 127
    div-float/2addr v2, v4

    .line 128
    sub-float/2addr v0, v2

    .line 129
    const-string v1, "+1"

    .line 130
    .line 131
    invoke-virtual {p1, v1, v3, v0, p0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 132
    .line 133
    .line 134
    :cond_2
    :goto_0
    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 1
    const/high16 v0, 0x41c80000    # 25.0f

    .line 2
    .line 3
    iget p0, p0, Lw9;->d:F

    .line 4
    .line 5
    mul-float/2addr p0, v0

    .line 6
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 1
    const/high16 v0, 0x41c80000    # 25.0f

    .line 2
    .line 3
    iget p0, p0, Lw9;->d:F

    .line 4
    .line 5
    mul-float/2addr p0, v0

    .line 6
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final getOpacity()I
    .locals 0

    .line 1
    const/4 p0, -0x3

    .line 2
    return p0
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw9;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw9;->b:Landroid/graphics/Paint;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw9;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw9;->b:Landroid/graphics/Paint;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
