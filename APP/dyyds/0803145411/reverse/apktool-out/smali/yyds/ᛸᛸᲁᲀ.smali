.class public final Lyyds/ᛸᛸᲁᲀ;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# instance fields
.field public ᛱᲈᲁ:F

.field public final ᛲᛳᛶᲁ:Landroid/animation/ValueAnimator;

.field public final ᛲᛴᛳᛲ:Landroid/graphics/Paint;

.field public final ᛶᛷᛲᲁ:Landroid/graphics/RectF;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛲᲇᲁᛴ;

.field public final ᲇᲇᲇᛱ:Landroid/graphics/Path;

.field public final ᲇᲈᛵᛷ:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(IILyyds/ᛲᲇᲁᛴ;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lyyds/ᛸᛸᲁᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲇᲁᛴ;

    .line 5
    .line 6
    new-instance p3, Landroid/graphics/Paint;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    iput-object p3, p0, Lyyds/ᛸᛸᲁᲀ;->ᲇᲈᛵᛷ:Landroid/graphics/Paint;

    .line 16
    .line 17
    new-instance p1, Landroid/graphics/Paint;

    .line 18
    .line 19
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lyyds/ᛸᛸᲁᲀ;->ᛲᛴᛳᛲ:Landroid/graphics/Paint;

    .line 26
    .line 27
    new-instance p1, Landroid/graphics/Path;

    .line 28
    .line 29
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lyyds/ᛸᛸᲁᲀ;->ᲇᲇᲇᛱ:Landroid/graphics/Path;

    .line 33
    .line 34
    new-instance p1, Landroid/graphics/RectF;

    .line 35
    .line 36
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lyyds/ᛸᛸᲁᲀ;->ᛶᛷᛲᲁ:Landroid/graphics/RectF;

    .line 40
    .line 41
    const/4 p1, 0x2

    .line 42
    new-array p2, p1, [F

    .line 43
    .line 44
    fill-array-data p2, :array_0

    .line 45
    .line 46
    .line 47
    invoke-static {p2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    const-wide/16 v0, 0x47e

    .line 52
    .line 53
    invoke-virtual {p2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 54
    .line 55
    .line 56
    const/4 p3, -0x1

    .line 57
    invoke-virtual {p2, p3}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 58
    .line 59
    .line 60
    new-instance p3, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 61
    .line 62
    invoke-direct {p3}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, p3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 66
    .line 67
    .line 68
    new-instance p3, Lyyds/ᲇᛲᛷᲀ;

    .line 69
    .line 70
    invoke-direct {p3, p1, p0}, Lyyds/ᲇᛲᛷᲀ;-><init>(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, p3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 74
    .line 75
    .line 76
    iput-object p2, p0, Lyyds/ᛸᛸᲁᲀ;->ᛲᛳᛶᲁ:Landroid/animation/ValueAnimator;

    .line 77
    .line 78
    return-void

    .line 79
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    const-wide v0, -0x76d0e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-wide v1, -0x76d7e68a836eL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    int-to-float v1, v1

    .line 33
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    int-to-float v2, v2

    .line 38
    const/high16 v3, 0x40000000    # 2.0f

    .line 39
    .line 40
    div-float v9, v1, v3

    .line 41
    .line 42
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 43
    .line 44
    int-to-float v5, v1

    .line 45
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 46
    .line 47
    int-to-float v6, v1

    .line 48
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 49
    .line 50
    int-to-float v7, v1

    .line 51
    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 52
    .line 53
    int-to-float v8, v1

    .line 54
    iget-object v11, p0, Lyyds/ᛸᛸᲁᲀ;->ᲇᲈᛵᛷ:Landroid/graphics/Paint;

    .line 55
    .line 56
    move v10, v9

    .line 57
    move-object v4, p1

    .line 58
    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 59
    .line 60
    .line 61
    const p1, 0x3eb33333    # 0.35f

    .line 62
    .line 63
    .line 64
    mul-float/2addr p1, v2

    .line 65
    add-float/2addr v2, p1

    .line 66
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 67
    .line 68
    int-to-float v1, v1

    .line 69
    sub-float/2addr v1, p1

    .line 70
    iget v3, p0, Lyyds/ᛸᛸᲁᲀ;->ᛱᲈᲁ:F

    .line 71
    .line 72
    mul-float/2addr v3, v2

    .line 73
    add-float v5, v3, v1

    .line 74
    .line 75
    add-float v7, v5, p1

    .line 76
    .line 77
    invoke-virtual {v4}, Landroid/graphics/Canvas;->save()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    iget-object v1, p0, Lyyds/ᛸᛸᲁᲀ;->ᲇᲇᲇᛱ:Landroid/graphics/Path;

    .line 82
    .line 83
    invoke-virtual {v4, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 84
    .line 85
    .line 86
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 87
    .line 88
    int-to-float v6, v1

    .line 89
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 90
    .line 91
    int-to-float v8, v0

    .line 92
    iget-object v11, p0, Lyyds/ᛸᛸᲁᲀ;->ᛲᛴᛳᛲ:Landroid/graphics/Paint;

    .line 93
    .line 94
    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, p1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final getOpacity()I
    .locals 0

    .line 1
    const/4 p0, -0x3

    .line 2
    return p0
.end method

.method public final isRunning()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛸᲁᲀ;->ᛲᛳᛶᲁ:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 5

    .line 1
    const-wide v0, -0x76c9e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-float v0, v0

    .line 17
    const/high16 v1, 0x40000000    # 2.0f

    .line 18
    .line 19
    div-float/2addr v0, v1

    .line 20
    iget-object v1, p0, Lyyds/ᛸᛸᲁᲀ;->ᲇᲇᲇᛱ:Landroid/graphics/Path;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 23
    .line 24
    .line 25
    iget v2, p1, Landroid/graphics/Rect;->left:I

    .line 26
    .line 27
    int-to-float v2, v2

    .line 28
    iget v3, p1, Landroid/graphics/Rect;->top:I

    .line 29
    .line 30
    int-to-float v3, v3

    .line 31
    iget v4, p1, Landroid/graphics/Rect;->right:I

    .line 32
    .line 33
    int-to-float v4, v4

    .line 34
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 35
    .line 36
    int-to-float p1, p1

    .line 37
    iget-object p0, p0, Lyyds/ᛸᛸᲁᲀ;->ᛶᛷᛲᲁ:Landroid/graphics/RectF;

    .line 38
    .line 39
    invoke-virtual {p0, v2, v3, v4, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 40
    .line 41
    .line 42
    sget-object p1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 43
    .line 44
    invoke-virtual {v1, p0, v0, v0, p1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛸᛸᲁᲀ;->ᲇᲈᛵᛷ:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyyds/ᛸᛸᲁᲀ;->ᛲᛴᛳᛲ:Landroid/graphics/Paint;

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
    iget-object v0, p0, Lyyds/ᛸᛸᲁᲀ;->ᲇᲈᛵᛷ:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyyds/ᛸᛸᲁᲀ;->ᛲᛴᛳᛲ:Landroid/graphics/Paint;

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

.method public final start()V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛸᲁᲀ;->ᛲᛳᛶᲁ:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final stop()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛸᛸᲁᲀ;->ᛲᛳᛶᲁ:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyyds/ᛸᛸᲁᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲇᲁᛴ;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget p0, p0, Lyyds/ᛸᛸᲁᲀ;->ᛱᲈᲁ:F

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/high16 v2, 0x3f800000    # 1.0f

    .line 14
    .line 15
    invoke-static {p0, v1, v2}, Lyyds/ᛳᛵᲀ;->ᛵᛸᛸᛷ(FFF)F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-interface {v0, p0, v1}, Lyyds/ᛲᲇᲁᛴ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method
