.class public final Lq8/a;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:Landroid/graphics/RectF;

.field public final c:I


# direct methods
.method public constructor <init>(II)V
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
    iput-object v0, p0, Lq8/a;->a:Landroid/graphics/Paint;

    .line 11
    .line 12
    new-instance v1, Landroid/graphics/RectF;

    .line 13
    .line 14
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lq8/a;->b:Landroid/graphics/RectF;

    .line 18
    .line 19
    iput p2, p0, Lq8/a;->c:I

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 27
    .line 28
    .line 29
    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    int-to-float v1, v1

    .line 18
    const/4 v2, 0x0

    .line 19
    cmpg-float v2, v1, v2

    .line 20
    .line 21
    if-gtz v2, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 25
    .line 26
    int-to-float v2, v2

    .line 27
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    int-to-float v3, v3

    .line 32
    sub-float/2addr v3, v1

    .line 33
    const/high16 v4, 0x40000000    # 2.0f

    .line 34
    .line 35
    div-float/2addr v3, v4

    .line 36
    add-float/2addr v3, v2

    .line 37
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 38
    .line 39
    int-to-float v2, v2

    .line 40
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    int-to-float v0, v0

    .line 45
    sub-float/2addr v0, v1

    .line 46
    div-float/2addr v0, v4

    .line 47
    add-float/2addr v0, v2

    .line 48
    const v2, 0x3d6147ae    # 0.055f

    .line 49
    .line 50
    .line 51
    mul-float/2addr v2, v1

    .line 52
    invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    iget-object v9, p0, Lq8/a;->a:Landroid/graphics/Paint;

    .line 57
    .line 58
    invoke-virtual {v9, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 59
    .line 60
    .line 61
    const v2, 0x3e3851ec    # 0.18f

    .line 62
    .line 63
    .line 64
    mul-float/2addr v2, v1

    .line 65
    add-float v4, v3, v2

    .line 66
    .line 67
    add-float/2addr v2, v0

    .line 68
    const v5, 0x3f51eb85    # 0.82f

    .line 69
    .line 70
    .line 71
    mul-float/2addr v5, v1

    .line 72
    add-float v6, v3, v5

    .line 73
    .line 74
    add-float/2addr v5, v0

    .line 75
    iget-object v7, p0, Lq8/a;->b:Landroid/graphics/RectF;

    .line 76
    .line 77
    invoke-virtual {v7, v4, v2, v6, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 78
    .line 79
    .line 80
    iget v2, p0, Lq8/a;->c:I

    .line 81
    .line 82
    const/4 v4, 0x2

    .line 83
    if-ne v2, v4, :cond_1

    .line 84
    .line 85
    invoke-virtual {p1, v7, v9}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    const v2, 0x3e0f5c29    # 0.14f

    .line 90
    .line 91
    .line 92
    mul-float/2addr v2, v1

    .line 93
    invoke-virtual {p1, v7, v2, v2, v9}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 94
    .line 95
    .line 96
    :goto_0
    const v2, 0x3ec28f5c    # 0.38f

    .line 97
    .line 98
    .line 99
    mul-float/2addr v2, v1

    .line 100
    add-float v5, v2, v3

    .line 101
    .line 102
    const v2, 0x3f1eb852    # 0.62f

    .line 103
    .line 104
    .line 105
    mul-float/2addr v2, v1

    .line 106
    add-float/2addr v2, v3

    .line 107
    const v3, 0x3eb33333    # 0.35f

    .line 108
    .line 109
    .line 110
    mul-float/2addr v3, v1

    .line 111
    add-float v6, v3, v0

    .line 112
    .line 113
    const/high16 v3, 0x3f000000    # 0.5f

    .line 114
    .line 115
    mul-float/2addr v3, v1

    .line 116
    add-float/2addr v3, v0

    .line 117
    const v4, 0x3f266666    # 0.65f

    .line 118
    .line 119
    .line 120
    mul-float/2addr v1, v4

    .line 121
    add-float v8, v1, v0

    .line 122
    .line 123
    move v7, v5

    .line 124
    move-object v4, p1

    .line 125
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 126
    .line 127
    .line 128
    move p1, v5

    .line 129
    move v7, v2

    .line 130
    move v5, v2

    .line 131
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 132
    .line 133
    .line 134
    move v8, v3

    .line 135
    move v6, v3

    .line 136
    move v7, v5

    .line 137
    move v5, p1

    .line 138
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 1
    const/16 v0, 0x60

    .line 2
    .line 3
    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 1
    const/16 v0, 0x60

    .line 2
    .line 3
    return v0
.end method

.method public final getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq8/a;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq8/a;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
