.class public final Lyyds/ᲁᲀᛷᛶ;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Landroid/graphics/Matrix;

.field public final ᛲᲈᲁ:Landroid/graphics/Paint;

.field public final ᛵᛸᛸᛷ:I

.field public final ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᲁᲀᛷᛶ;->ᲇᲈᛵᛷ:Landroid/graphics/Path;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lyyds/ᲁᲀᛷᛶ;->ᛲᛴᛳᛲ:Landroid/graphics/Matrix;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/Paint;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lyyds/ᲁᲀᛷᛶ;->ᛲᲈᲁ:Landroid/graphics/Paint;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 27
    .line 28
    .line 29
    const v1, 0x660400c3

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v1}, Lyyds/ᛲᛷᛵᲇ;->ᛲᛳᛶᲁ(Landroid/content/Context;I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 37
    .line 38
    .line 39
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const v0, 0x66070056

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iput v0, p0, Lyyds/ᲁᲀᛷᛶ;->ᛵᛸᛸᛷ:I

    .line 56
    .line 57
    const v0, 0x66070055    # 1.593814E23f

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iput p1, p0, Lyyds/ᲁᲀᛷᛶ;->ᲀᛲᛳᲀ:I

    .line 65
    .line 66
    return-void
.end method

.method public static ᛲᲈᲁ(Landroid/graphics/Path;FFFFF)V
    .locals 8

    .line 1
    sub-float v1, p1, p3

    .line 2
    .line 3
    sub-float v2, p2, p3

    .line 4
    .line 5
    add-float v3, p1, p3

    .line 6
    .line 7
    add-float v4, p2, p3

    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move v5, p4

    .line 12
    move v6, p5

    .line 13
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Path;->arcTo(FFFFFFZ)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᲁᲀᛷᛶ;->ᲇᲈᛵᛷ:Landroid/graphics/Path;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲁᲀᛷᛶ;->ᛲᲈᲁ:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {p1, v0, p0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final getOpacity()I
    .locals 0

    .line 1
    const/4 p0, -0x3

    .line 2
    return p0
.end method

.method public final getOutline(Landroid/graphics/Outline;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᲀᛷᛶ;->ᲇᲈᛵᛷ:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getPadding(Landroid/graphics/Rect;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lyyds/ᲁᲀᛷᛶ;->ᛵᛸᛸᛷ:I

    .line 6
    .line 7
    iget p0, p0, Lyyds/ᲁᲀᛷᛶ;->ᲀᛲᛳᲀ:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v0, v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, p0, v2, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p1, v1, v2, p0, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 18
    .line 19
    .line 20
    :goto_0
    return v3
.end method

.method public final isAutoMirrored()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᲁᲀᛷᛶ;->ᛵᛸᛸᛷ()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onLayoutDirectionChanged(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᲁᲀᛷᛶ;->ᛵᛸᛸᛷ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0
.end method

.method public final setAlpha(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 11

    .line 1
    iget-object v0, p0, Lyyds/ᲁᲀᛷᛶ;->ᲇᲈᛵᛷ:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 7
    .line 8
    .line 9
    move-result-object v6

    .line 10
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    int-to-float v1, v1

    .line 15
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    int-to-float v2, v2

    .line 20
    const/high16 v7, 0x40000000    # 2.0f

    .line 21
    .line 22
    div-float/2addr v2, v7

    .line 23
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 24
    .line 25
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    double-to-float v8, v3

    .line 30
    mul-float v9, v8, v2

    .line 31
    .line 32
    add-float v3, v2, v9

    .line 33
    .line 34
    invoke-static {v3, v1}, Ljava/lang/Math;->max(FF)F

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    const/high16 v4, 0x42b40000    # 90.0f

    .line 39
    .line 40
    const/high16 v5, 0x43340000    # 180.0f

    .line 41
    .line 42
    move v1, v2

    .line 43
    move v3, v1

    .line 44
    invoke-static/range {v0 .. v5}, Lyyds/ᲁᲀᛷᛶ;->ᛲᲈᲁ(Landroid/graphics/Path;FFFFF)V

    .line 45
    .line 46
    .line 47
    sub-float v1, v10, v9

    .line 48
    .line 49
    const/high16 v4, -0x3d4c0000    # -90.0f

    .line 50
    .line 51
    const/high16 v5, 0x42340000    # 45.0f

    .line 52
    .line 53
    move v3, v2

    .line 54
    invoke-static/range {v0 .. v5}, Lyyds/ᲁᲀᛷᛶ;->ᛲᲈᲁ(Landroid/graphics/Path;FFFFF)V

    .line 55
    .line 56
    .line 57
    move v9, v1

    .line 58
    const/high16 v1, 0x40a00000    # 5.0f

    .line 59
    .line 60
    div-float v3, v2, v1

    .line 61
    .line 62
    mul-float/2addr v8, v3

    .line 63
    sub-float v1, v10, v8

    .line 64
    .line 65
    const/high16 v4, -0x3dcc0000    # -45.0f

    .line 66
    .line 67
    const/high16 v5, 0x42b40000    # 90.0f

    .line 68
    .line 69
    invoke-static/range {v0 .. v5}, Lyyds/ᲁᲀᛷᛶ;->ᛲᲈᲁ(Landroid/graphics/Path;FFFFF)V

    .line 70
    .line 71
    .line 72
    const/high16 v4, 0x42340000    # 45.0f

    .line 73
    .line 74
    const/high16 v5, 0x42340000    # 45.0f

    .line 75
    .line 76
    move v3, v2

    .line 77
    move v1, v9

    .line 78
    invoke-static/range {v0 .. v5}, Lyyds/ᲁᲀᛷᛶ;->ᛲᲈᲁ(Landroid/graphics/Path;FFFFF)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    const/4 v2, 0x1

    .line 89
    if-ne v1, v2, :cond_0

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    const/4 v2, 0x0

    .line 93
    :goto_0
    iget-object p0, p0, Lyyds/ᲁᲀᛷᛶ;->ᛲᛴᛳᛲ:Landroid/graphics/Matrix;

    .line 94
    .line 95
    if-eqz v2, :cond_1

    .line 96
    .line 97
    div-float/2addr v10, v7

    .line 98
    const/4 v1, 0x0

    .line 99
    const/high16 v2, -0x40800000    # -1.0f

    .line 100
    .line 101
    const/high16 v3, 0x3f800000    # 1.0f

    .line 102
    .line 103
    invoke-virtual {p0, v2, v3, v10, v1}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Matrix;->reset()V

    .line 108
    .line 109
    .line 110
    :goto_1
    iget v1, v6, Landroid/graphics/Rect;->left:I

    .line 111
    .line 112
    int-to-float v1, v1

    .line 113
    iget v2, v6, Landroid/graphics/Rect;->top:I

    .line 114
    .line 115
    int-to-float v2, v2

    .line 116
    invoke-virtual {p0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, p0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method
