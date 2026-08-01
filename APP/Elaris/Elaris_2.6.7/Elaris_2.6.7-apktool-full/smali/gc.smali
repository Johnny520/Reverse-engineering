.class public final Lgc;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:Landroid/graphics/RectF;

.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/Paint;

.field public final d:I


# direct methods
.method public constructor <init>(IF)V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/RectF;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lgc;->a:Landroid/graphics/RectF;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Paint;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lgc;->b:Landroid/graphics/Paint;

    .line 18
    .line 19
    new-instance v2, Landroid/graphics/Paint;

    .line 20
    .line 21
    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object v2, p0, Lgc;->c:Landroid/graphics/Paint;

    .line 25
    .line 26
    const/high16 v3, 0x3f800000    # 1.0f

    .line 27
    .line 28
    invoke-static {v3, p2}, Ljava/lang/Math;->max(FF)F

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    const/high16 v3, 0x41e00000    # 28.0f

    .line 33
    .line 34
    mul-float/2addr p2, v3

    .line 35
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iput p2, p0, Lgc;->d:I

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 51
    .line 52
    .line 53
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 54
    .line 55
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, p0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-lez v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-gtz v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    int-to-float v1, v1

    .line 34
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    const v0, 0x3da7ef9e    # 0.082f

    .line 43
    .line 44
    .line 45
    mul-float/2addr v0, v1

    .line 46
    const v3, 0x3fd9999a    # 1.7f

    .line 47
    .line 48
    .line 49
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const v3, 0x3ecccccd    # 0.4f

    .line 54
    .line 55
    .line 56
    mul-float/2addr v3, v1

    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    iget-object v4, p0, Lgc;->b:Landroid/graphics/Paint;

    .line 63
    .line 64
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 65
    .line 66
    .line 67
    sub-float v0, v2, v3

    .line 68
    .line 69
    sub-float v6, v5, v3

    .line 70
    .line 71
    add-float v7, v2, v3

    .line 72
    .line 73
    add-float/2addr v3, v5

    .line 74
    iget-object v8, p0, Lgc;->a:Landroid/graphics/RectF;

    .line 75
    .line 76
    invoke-virtual {v8, v0, v6, v7, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v8, v4}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 80
    .line 81
    .line 82
    const v0, 0x3d89374c    # 0.067f

    .line 83
    .line 84
    .line 85
    mul-float/2addr v0, v1

    .line 86
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 87
    .line 88
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget-object v11, p0, Lgc;->c:Landroid/graphics/Paint;

    .line 93
    .line 94
    invoke-virtual {v11, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 95
    .line 96
    .line 97
    const p0, 0x3df5c28f    # 0.12f

    .line 98
    .line 99
    .line 100
    mul-float/2addr p0, v1

    .line 101
    sub-float p0, v2, p0

    .line 102
    .line 103
    const v0, 0x3dd70a3d    # 0.105f

    .line 104
    .line 105
    .line 106
    mul-float/2addr v0, v1

    .line 107
    sub-float v4, p0, v0

    .line 108
    .line 109
    add-float v6, p0, v0

    .line 110
    .line 111
    move v7, v5

    .line 112
    move-object v3, p1

    .line 113
    move-object v8, v11

    .line 114
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 115
    .line 116
    .line 117
    move-object v6, v3

    .line 118
    sub-float v8, v5, v0

    .line 119
    .line 120
    add-float v10, v5, v0

    .line 121
    .line 122
    move v9, p0

    .line 123
    move v7, p0

    .line 124
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 125
    .line 126
    .line 127
    const p0, 0x3e19999a    # 0.15f

    .line 128
    .line 129
    .line 130
    mul-float/2addr p0, v1

    .line 131
    add-float v7, p0, v2

    .line 132
    .line 133
    const p0, 0x3e0f5c29    # 0.14f

    .line 134
    .line 135
    .line 136
    mul-float/2addr p0, v1

    .line 137
    sub-float v8, v5, p0

    .line 138
    .line 139
    add-float/2addr p0, v5

    .line 140
    const p1, 0x3d8f5c29    # 0.07f

    .line 141
    .line 142
    .line 143
    mul-float/2addr p1, v1

    .line 144
    sub-float p1, v7, p1

    .line 145
    .line 146
    const v0, 0x3d99999a    # 0.075f

    .line 147
    .line 148
    .line 149
    mul-float/2addr v1, v0

    .line 150
    sub-float/2addr v5, v1

    .line 151
    move v9, v7

    .line 152
    move v10, v8

    .line 153
    move v7, p1

    .line 154
    move v8, v5

    .line 155
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 156
    .line 157
    .line 158
    move v7, v9

    .line 159
    move v8, v10

    .line 160
    move v10, p0

    .line 161
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 162
    .line 163
    .line 164
    :cond_1
    :goto_0
    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 0

    .line 1
    iget p0, p0, Lgc;->d:I

    .line 2
    .line 3
    return p0
.end method

.method public final getIntrinsicWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lgc;->d:I

    .line 2
    .line 3
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
    iget-object v0, p0, Lgc;->b:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgc;->c:Landroid/graphics/Paint;

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
    iget-object v0, p0, Lgc;->b:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgc;->c:Landroid/graphics/Paint;

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
