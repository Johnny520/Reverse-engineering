.class public final Lm9;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:Landroid/graphics/RectF;

.field public final c:F

.field public d:I


# direct methods
.method public constructor <init>(F)V
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
    iput-object v0, p0, Lm9;->a:Landroid/graphics/Paint;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/RectF;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lm9;->b:Landroid/graphics/RectF;

    .line 18
    .line 19
    const/16 v0, 0xff

    .line 20
    .line 21
    iput v0, p0, Lm9;->d:I

    .line 22
    .line 23
    const v0, 0x3fe66666    # 1.8f

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const/high16 v0, 0x3f800000    # 1.0f

    .line 31
    .line 32
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iput p1, p0, Lm9;->c:F

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;IFFFFFFF)V
    .locals 3

    .line 1
    const/high16 v0, 0x42580000    # 54.0f

    .line 2
    .line 3
    sub-float/2addr p6, v0

    .line 4
    iget v1, p0, Lm9;->c:F

    .line 5
    .line 6
    mul-float/2addr p6, v1

    .line 7
    add-float/2addr p6, v0

    .line 8
    sub-float/2addr p7, v0

    .line 9
    mul-float/2addr p7, v1

    .line 10
    add-float/2addr p7, v0

    .line 11
    mul-float/2addr p8, v1

    .line 12
    mul-float/2addr p9, v1

    .line 13
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 14
    .line 15
    iget-object v2, p0, Lm9;->a:Landroid/graphics/Paint;

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    .line 22
    .line 23
    iget p2, p0, Lm9;->d:I

    .line 24
    .line 25
    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 26
    .line 27
    .line 28
    mul-float p2, p6, p5

    .line 29
    .line 30
    add-float/2addr p2, p3

    .line 31
    mul-float v0, p7, p5

    .line 32
    .line 33
    add-float/2addr v0, p4

    .line 34
    add-float/2addr p6, p8

    .line 35
    mul-float/2addr p6, p5

    .line 36
    add-float/2addr p6, p3

    .line 37
    add-float/2addr p7, p9

    .line 38
    mul-float/2addr p7, p5

    .line 39
    add-float/2addr p7, p4

    .line 40
    iget-object p0, p0, Lm9;->b:Landroid/graphics/RectF;

    .line 41
    .line 42
    invoke-virtual {p0, p2, v0, p6, p7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 43
    .line 44
    .line 45
    const/high16 p2, 0x40600000    # 3.5f

    .line 46
    .line 47
    mul-float/2addr p2, v1

    .line 48
    mul-float/2addr p2, p5

    .line 49
    invoke-virtual {p1, p0, p2, p2, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 16

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    int-to-float v1, v1

    .line 22
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    int-to-float v2, v2

    .line 27
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iget v4, v0, Landroid/graphics/Rect;->left:I

    .line 32
    .line 33
    int-to-float v4, v4

    .line 34
    sub-float/2addr v1, v3

    .line 35
    const/high16 v5, 0x40000000    # 2.0f

    .line 36
    .line 37
    div-float/2addr v1, v5

    .line 38
    add-float v9, v1, v4

    .line 39
    .line 40
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 41
    .line 42
    int-to-float v0, v0

    .line 43
    sub-float/2addr v2, v3

    .line 44
    div-float/2addr v2, v5

    .line 45
    add-float v10, v2, v0

    .line 46
    .line 47
    const/high16 v0, 0x42d80000    # 108.0f

    .line 48
    .line 49
    div-float v11, v3, v0

    .line 50
    .line 51
    const/16 v0, 0xd1

    .line 52
    .line 53
    const/16 v1, 0x95

    .line 54
    .line 55
    const/16 v2, 0x49

    .line 56
    .line 57
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    const/high16 v14, 0x416c0000    # 14.75f

    .line 62
    .line 63
    const/high16 v15, 0x42130000    # 36.75f

    .line 64
    .line 65
    const/high16 v12, 0x41fc0000    # 31.5f

    .line 66
    .line 67
    const/high16 v13, 0x42190000    # 38.25f

    .line 68
    .line 69
    move-object/from16 v6, p0

    .line 70
    .line 71
    move-object/from16 v7, p1

    .line 72
    .line 73
    invoke-virtual/range {v6 .. v15}, Lm9;->a(Landroid/graphics/Canvas;IFFFFFFF)V

    .line 74
    .line 75
    .line 76
    const/16 v0, 0xae

    .line 77
    .line 78
    const/16 v1, 0x39

    .line 79
    .line 80
    const/16 v2, 0xfe

    .line 81
    .line 82
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    const/high16 v14, 0x41900000    # 18.0f

    .line 87
    .line 88
    const/high16 v15, 0x41f80000    # 31.0f

    .line 89
    .line 90
    const/high16 v12, 0x426a0000    # 58.5f

    .line 91
    .line 92
    const/high16 v13, 0x42310000    # 44.25f

    .line 93
    .line 94
    invoke-virtual/range {v6 .. v15}, Lm9;->a(Landroid/graphics/Canvas;IFFFFFFF)V

    .line 95
    .line 96
    .line 97
    const/16 v0, 0x7f

    .line 98
    .line 99
    const/16 v1, 0xe0

    .line 100
    .line 101
    const/16 v2, 0x4e

    .line 102
    .line 103
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    const/high16 v14, 0x418e0000    # 17.75f

    .line 108
    .line 109
    const/high16 v15, 0x422a0000    # 42.5f

    .line 110
    .line 111
    const/high16 v12, 0x42320000    # 44.5f

    .line 112
    .line 113
    const/high16 v13, 0x42020000    # 32.5f

    .line 114
    .line 115
    invoke-virtual/range {v6 .. v15}, Lm9;->a(Landroid/graphics/Canvas;IFFFFFFF)V

    .line 116
    .line 117
    .line 118
    :cond_2
    :goto_0
    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 0

    .line 1
    const/16 p0, 0x6c

    .line 2
    .line 3
    return p0
.end method

.method public final getIntrinsicWidth()I
    .locals 0

    .line 1
    const/16 p0, 0x6c

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
    const/16 v0, 0xff

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lm9;->d:I

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm9;->a:Landroid/graphics/Paint;

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
