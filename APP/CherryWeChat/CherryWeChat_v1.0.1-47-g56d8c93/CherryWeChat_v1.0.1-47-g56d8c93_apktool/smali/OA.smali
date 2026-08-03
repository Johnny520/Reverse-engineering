.class public final LOA;
.super Landroid/widget/ImageView;
.source ""


# instance fields
.field public final a:Landroid/graphics/Matrix;

.field public final b:[F

.field public final c:Landroid/view/ScaleGestureDetector;

.field public final d:Landroid/view/GestureDetector;

.field public e:F

.field public final f:F

.field public final g:F

.field public h:F

.field public i:F

.field public j:Z

.field public k:I

.field public l:I

.field public m:I

.field public n:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-wide v0, -0x1be6ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LOA;->a:Landroid/graphics/Matrix;

    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, LOA;->b:[F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, LOA;->e:F

    iput v0, p0, LOA;->f:F

    const/high16 v0, 0x40800000    # 4.0f

    iput v0, p0, LOA;->g:F

    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    new-instance v0, Landroid/view/ScaleGestureDetector;

    new-instance v1, LNA;

    invoke-direct {v1, p0}, LNA;-><init>(LOA;)V

    invoke-direct {v0, p1, v1}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, LOA;->c:Landroid/view/ScaleGestureDetector;

    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, LMA;

    invoke-direct {v1, p0}, LMA;-><init>(LOA;)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, LOA;->d:Landroid/view/GestureDetector;

    return-void
.end method


# virtual methods
.method public final a(FFF)V
    .locals 7

    iget v1, p0, LOA;->e:F

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v6

    const-wide/16 v2, 0xfa

    invoke-virtual {v6, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v6, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v0, LLA;

    move-object v3, p0

    move v2, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, LLA;-><init>(FFLOA;FF)V

    invoke-virtual {v6, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v6}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final b()V
    .locals 9

    iget-object v0, p0, LOA;->a:Landroid/graphics/Matrix;

    iget-object v1, p0, LOA;->b:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 v2, 0x2

    aget v2, v1, v2

    const/4 v3, 0x5

    aget v3, v1, v3

    const/4 v4, 0x0

    aget v1, v1, v4

    iget v4, p0, LOA;->m:I

    int-to-float v4, v4

    mul-float/2addr v4, v1

    iget v5, p0, LOA;->n:I

    int-to-float v5, v5

    mul-float/2addr v5, v1

    iget v1, p0, LOA;->k:I

    int-to-float v6, v1

    cmpl-float v6, v4, v6

    const/high16 v7, 0x40000000    # 2.0f

    const/4 v8, 0x0

    if-lez v6, :cond_2

    cmpl-float v6, v2, v8

    if-lez v6, :cond_0

    neg-float v1, v2

    goto :goto_1

    :cond_0
    add-float/2addr v2, v4

    int-to-float v4, v1

    cmpg-float v4, v2, v4

    if-gez v4, :cond_1

    int-to-float v1, v1

    :goto_0
    sub-float/2addr v1, v2

    goto :goto_1

    :cond_1
    move v1, v8

    goto :goto_1

    :cond_2
    int-to-float v1, v1

    sub-float/2addr v1, v4

    div-float/2addr v1, v7

    goto :goto_0

    :goto_1
    iget v2, p0, LOA;->l:I

    int-to-float v4, v2

    cmpl-float v4, v5, v4

    if-lez v4, :cond_4

    cmpl-float v4, v3, v8

    if-lez v4, :cond_3

    neg-float v8, v3

    goto :goto_3

    :cond_3
    add-float/2addr v3, v5

    int-to-float v4, v2

    cmpg-float v4, v3, v4

    if-gez v4, :cond_5

    int-to-float v2, v2

    :goto_2
    sub-float v8, v2, v3

    goto :goto_3

    :cond_4
    int-to-float v2, v2

    sub-float/2addr v2, v5

    div-float/2addr v2, v7

    goto :goto_2

    :cond_5
    :goto_3
    invoke-virtual {v0, v1, v8}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    return-void
.end method

.method public final c()V
    .locals 6

    iget v0, p0, LOA;->k:I

    if-eqz v0, :cond_1

    iget v1, p0, LOA;->l:I

    if-eqz v1, :cond_1

    iget v2, p0, LOA;->m:I

    if-eqz v2, :cond_1

    iget v3, p0, LOA;->n:I

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    int-to-float v0, v0

    int-to-float v2, v2

    div-float/2addr v0, v2

    int-to-float v1, v1

    int-to-float v2, v3

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iget-object v1, p0, LOA;->a:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0, v0}, Landroid/graphics/Matrix;->setScale(FF)V

    iput v0, p0, LOA;->e:F

    iget v2, p0, LOA;->k:I

    int-to-float v2, v2

    iget v3, p0, LOA;->m:I

    int-to-float v3, v3

    mul-float/2addr v3, v0

    sub-float/2addr v2, v3

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float/2addr v2, v3

    iget v4, p0, LOA;->l:I

    int-to-float v4, v4

    iget v5, p0, LOA;->n:I

    int-to-float v5, v5

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    div-float/2addr v4, v3

    invoke-virtual {v1, v2, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iput p1, p0, LOA;->k:I

    iput p2, p0, LOA;->l:I

    invoke-virtual {p0}, LOA;->c()V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    const-wide v0, -0x1be77fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, p0, LOA;->c:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    iget-object v0, p0, LOA;->d:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    iget v2, p0, LOA;->f:F

    const/4 v3, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v3, :cond_2

    const/4 v4, 0x2

    if-eq v0, v4, :cond_0

    const/4 p1, 0x3

    if-eq v0, p1, :cond_2

    goto/16 :goto_0

    :cond_0
    iget-boolean v0, p0, LOA;->j:Z

    if-eqz v0, :cond_5

    iget v0, p0, LOA;->e:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v2, p0, LOA;->h:F

    sub-float/2addr v0, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iget v4, p0, LOA;->i:F

    sub-float/2addr v2, v4

    iget-object v4, p0, LOA;->a:Landroid/graphics/Matrix;

    invoke-virtual {v4, v0, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    invoke-virtual {p0}, LOA;->b()V

    invoke-virtual {p0, v4}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, LOA;->h:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, LOA;->i:F

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    move-object v1, p1

    check-cast v1, Landroid/view/ViewGroup;

    :cond_1
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    return v3

    :cond_2
    const/4 p1, 0x0

    iput-boolean p1, p0, LOA;->j:Z

    return v3

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, LOA;->h:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, LOA;->i:F

    iput-boolean v3, p0, LOA;->j:Z

    iget p1, p0, LOA;->e:F

    cmpl-float p1, p1, v2

    if-lez p1, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_4

    move-object v1, p1

    check-cast v1, Landroid/view/ViewGroup;

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_5
    :goto_0
    return v3
.end method

.method public final setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    iput v0, p0, LOA;->m:I

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    iput p1, p0, LOA;->n:I

    invoke-virtual {p0}, LOA;->c()V

    :cond_0
    return-void
.end method
