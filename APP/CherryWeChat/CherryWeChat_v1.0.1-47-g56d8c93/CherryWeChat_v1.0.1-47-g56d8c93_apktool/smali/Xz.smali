.class public final LXz;
.super Landroid/view/View;
.source ""


# instance fields
.field public a:Z

.field public b:F

.field public c:F

.field public d:F

.field public final e:Landroid/graphics/Paint;

.field public final f:Landroid/graphics/Paint;

.field public g:Lfj;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-wide v0, -0x1c078fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, LXz;->e:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, LXz;->f:Landroid/graphics/Paint;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    const p1, -0x333334

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    const-wide v0, -0x1c000fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-boolean v0, p0, LXz;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, LXz;->b:F

    sub-float/2addr v0, v1

    goto :goto_0

    :cond_0
    iget v0, p0, LXz;->b:F

    :goto_0
    iput v0, p0, LXz;->d:F

    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, LXz;->b:F

    const/4 v2, 0x2

    int-to-float v2, v2

    mul-float v3, v1, v2

    mul-float/2addr v3, v2

    mul-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v3, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget v1, p0, LXz;->b:F

    iget-object v2, p0, LXz;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget v0, p0, LXz;->d:F

    iget v1, p0, LXz;->b:F

    iget v2, p0, LXz;->c:F

    iget-object v3, p0, LXz;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/16 v0, 0x19

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    mul-int/lit8 p2, p1, 0x2

    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    int-to-float p1, p1

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    iput p1, p0, LXz;->b:F

    const p2, 0x3f4ccccd    # 0.8f

    mul-float/2addr p2, p1

    iput p2, p0, LXz;->c:F

    iget-boolean p2, p0, LXz;->a:Z

    if-eqz p2, :cond_0

    const/4 p2, 0x2

    int-to-float p2, p2

    mul-float/2addr p1, p2

    :cond_0
    iput p1, p0, LXz;->d:F

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    const-wide v0, -0x1c007fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, LXz;->a:Z

    xor-int/lit8 v1, v0, 0x1

    iput-boolean v1, p0, LXz;->a:Z

    if-nez v0, :cond_1

    const-wide v0, -0x1c00dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_1
    const v0, -0x333334

    :goto_0
    iget-object v1, p0, LXz;->f:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, LXz;->g:Lfj;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, LXz;->a:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :goto_1
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_3
    return v1
.end method

.method public final setChecked(Z)V
    .locals 2

    iput-boolean p1, p0, LXz;->a:Z

    if-eqz p1, :cond_0

    const-wide v0, -0x1c01efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const p1, -0x333334

    :goto_0
    iget-object v0, p0, LXz;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setOnCheckedChangeListener(Lfj;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj;",
            ")V"
        }
    .end annotation

    const-wide v0, -0x1c015fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iput-object p1, p0, LXz;->g:Lfj;

    return-void
.end method
