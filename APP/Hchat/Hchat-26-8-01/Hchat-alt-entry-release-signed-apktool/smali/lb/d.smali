.class public final Llb/d;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:F

.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 13
    .line 14
    iput v0, p0, Llb/d;->a:F

    .line 15
    .line 16
    new-instance v0, Landroid/graphics/Paint;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 31
    .line 32
    and-int/lit8 p1, p1, 0x30

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    if-ne p1, v2, :cond_0

    .line 37
    .line 38
    const/4 p1, -0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/16 p1, 0x33

    .line 41
    .line 42
    invoke-static {p1, p1, p1}, Landroid/graphics/Color;->rgb(III)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 52
    .line 53
    .line 54
    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 57
    .line 58
    .line 59
    sget-object p1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Llb/d;->b:Landroid/graphics/Paint;

    .line 65
    .line 66
    new-instance p1, Landroid/graphics/Paint;

    .line 67
    .line 68
    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 76
    .line 77
    .line 78
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 81
    .line 82
    .line 83
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Llb/d;->c:Landroid/graphics/Paint;

    .line 89
    .line 90
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    int-to-float v1, v1

    .line 24
    const/4 v2, 0x0

    .line 25
    cmpg-float v2, v1, v2

    .line 26
    .line 27
    if-gtz v2, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const v3, 0x3fcccccd    # 1.6f

    .line 39
    .line 40
    .line 41
    iget v4, p0, Llb/d;->a:F

    .line 42
    .line 43
    mul-float/2addr v4, v3

    .line 44
    const v3, 0x3d851eb8    # 0.065f

    .line 45
    .line 46
    .line 47
    mul-float/2addr v3, v1

    .line 48
    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    iget-object v4, p0, Llb/d;->b:Landroid/graphics/Paint;

    .line 53
    .line 54
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 55
    .line 56
    .line 57
    const v3, 0x3ec28f5c    # 0.38f

    .line 58
    .line 59
    .line 60
    mul-float/2addr v3, v1

    .line 61
    invoke-virtual {p1, v2, v0, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 62
    .line 63
    .line 64
    const v3, 0x3eae147b    # 0.34f

    .line 65
    .line 66
    .line 67
    mul-float/2addr v1, v3

    .line 68
    iget-object v3, p0, Llb/d;->c:Landroid/graphics/Paint;

    .line 69
    .line 70
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget v4, v1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 78
    .line 79
    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 80
    .line 81
    add-float/2addr v4, v1

    .line 82
    const/high16 v1, 0x40000000    # 2.0f

    .line 83
    .line 84
    div-float/2addr v4, v1

    .line 85
    sub-float/2addr v0, v4

    .line 86
    const-string v1, "+1"

    .line 87
    .line 88
    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 2

    .line 1
    const/high16 v0, 0x42000000    # 32.0f

    .line 2
    .line 3
    iget v1, p0, Llb/d;->a:F

    .line 4
    .line 5
    mul-float/2addr v1, v0

    .line 6
    float-to-int v0, v1

    .line 7
    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 2

    .line 1
    const/high16 v0, 0x42000000    # 32.0f

    .line 2
    .line 3
    iget v1, p0, Llb/d;->a:F

    .line 4
    .line 5
    mul-float/2addr v1, v0

    .line 6
    float-to-int v0, v1

    .line 7
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
    iget-object v0, p0, Llb/d;->b:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llb/d;->c:Landroid/graphics/Paint;

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
    iget-object v0, p0, Llb/d;->b:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llb/d;->c:Landroid/graphics/Paint;

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
