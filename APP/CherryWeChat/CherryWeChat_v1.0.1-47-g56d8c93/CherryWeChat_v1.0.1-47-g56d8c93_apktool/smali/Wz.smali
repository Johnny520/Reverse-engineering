.class public final LWz;
.super Landroid/view/ViewGroup;
.source ""

# interfaces
.implements LIs;
.implements LHs;


# static fields
.field public static final K:[I


# instance fields
.field public A:LRz;

.field public B:LRz;

.field public C:LSz;

.field public D:LSz;

.field public E:Z

.field public F:I

.field public G:Z

.field public final H:LQz;

.field public final I:LRz;

.field public final J:LRz;

.field public a:Landroid/view/View;

.field public b:LUz;

.field public c:Z

.field public final d:I

.field public e:F

.field public f:F

.field public final g:LJs;

.field public final h:LGs;

.field public final i:[I

.field public final j:[I

.field public final k:[I

.field public l:Z

.field public final m:I

.field public n:I

.field public o:F

.field public p:F

.field public q:Z

.field public r:I

.field public final s:Landroid/view/animation/DecelerateInterpolator;

.field public final t:Ls9;

.field public u:I

.field public v:I

.field public final w:I

.field public final x:I

.field public y:I

.field public final z:Lw9;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const v0, 0x101000e

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LWz;->K:[I

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 7

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v1, 0x0

    iput-boolean v1, p0, LWz;->c:Z

    const/high16 v2, -0x40800000    # -1.0f

    iput v2, p0, LWz;->e:F

    const/4 v2, 0x2

    new-array v3, v2, [I

    iput-object v3, p0, LWz;->i:[I

    new-array v3, v2, [I

    iput-object v3, p0, LWz;->j:[I

    new-array v3, v2, [I

    iput-object v3, p0, LWz;->k:[I

    const/4 v3, -0x1

    iput v3, p0, LWz;->r:I

    iput v3, p0, LWz;->u:I

    new-instance v3, LQz;

    invoke-direct {v3, p0, v1}, LQz;-><init>(Landroid/view/ViewGroup;I)V

    iput-object v3, p0, LWz;->H:LQz;

    new-instance v3, LRz;

    invoke-direct {v3, p0, v2}, LRz;-><init>(LWz;I)V

    iput-object v3, p0, LWz;->I:LRz;

    new-instance v2, LRz;

    const/4 v3, 0x3

    invoke-direct {v2, p0, v3}, LRz;-><init>(LWz;I)V

    iput-object v2, p0, LWz;->J:LRz;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v2

    iput v2, p0, LWz;->d:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x10e0001

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v2

    iput v2, p0, LWz;->m:I

    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v3, 0x40000000    # 2.0f

    invoke-direct {v2, v3}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    iput-object v2, p0, LWz;->s:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    const/high16 v3, 0x42200000    # 40.0f

    iget v4, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v4, v3

    float-to-int v3, v4

    iput v3, p0, LWz;->F:I

    new-instance v3, Ls9;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    sget-object v6, LTu;->a:[I

    invoke-virtual {v5, v6}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v5

    const v6, -0x50506

    invoke-virtual {v5, v1, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    iput v6, v3, Ls9;->b:I

    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v5, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v6, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v6}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    invoke-direct {v5, v6}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    const/high16 v6, 0x40800000    # 4.0f

    mul-float/2addr v4, v6

    sget-object v6, LlE;->a:Ljava/util/WeakHashMap;

    invoke-static {v3, v4}, LeE;->k(Landroid/view/View;F)V

    invoke-virtual {v5}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v4

    iget v6, v3, Ls9;->b:I

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v3, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iput-object v3, p0, LWz;->t:Ls9;

    new-instance v3, Lw9;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Lw9;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, LWz;->z:Lw9;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lw9;->c(I)V

    iget-object v3, p0, LWz;->t:Ls9;

    iget-object v5, p0, LWz;->z:Lw9;

    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v3, p0, LWz;->t:Ls9;

    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, p0, LWz;->t:Ls9;

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    const/high16 v3, 0x42800000    # 64.0f

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    iput v2, p0, LWz;->x:I

    int-to-float v2, v2

    iput v2, p0, LWz;->e:F

    new-instance v2, LJs;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, LWz;->g:LJs;

    new-instance v2, LGs;

    invoke-direct {v2, p0}, LGs;-><init>(Landroid/view/ViewGroup;)V

    iput-object v2, p0, LWz;->h:LGs;

    invoke-virtual {p0, v4}, LWz;->setNestedScrollingEnabled(Z)V

    iget v2, p0, LWz;->F:I

    neg-int v2, v2

    iput v2, p0, LWz;->n:I

    iput v2, p0, LWz;->w:I

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p0, v2}, LWz;->k(F)V

    sget-object v2, LWz;->K:[I

    invoke-virtual {p1, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, LWz;->setEnabled(Z)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private setColorViewAlpha(I)V
    .locals 1

    iget-object v0, p0, LWz;->t:Ls9;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    iget-object v0, p0, LWz;->z:Lw9;

    invoke-virtual {v0, p1}, Lw9;->setAlpha(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    if-nez p4, :cond_0

    invoke-virtual {p0, p1, p2, p3}, LWz;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public final b(Landroid/view/View;I)V
    .locals 0

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, LWz;->onStopNestedScroll(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final c(Landroid/view/View;II[II)V
    .locals 0

    if-nez p5, :cond_0

    invoke-virtual {p0, p1, p2, p3, p4}, LWz;->onNestedPreScroll(Landroid/view/View;II[I)V

    :cond_0
    return-void
.end method

.method public final d(Landroid/view/View;IIIII[I)V
    .locals 9

    if-eqz p6, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x1

    aget v0, p7, p1

    if-nez p6, :cond_1

    iget-object v1, p0, LWz;->h:LGs;

    iget-object v6, p0, LWz;->j:[I

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v7, p6

    move-object/from16 v8, p7

    invoke-virtual/range {v1 .. v8}, LGs;->d(IIII[II[I)Z

    :cond_1
    aget p2, p7, p1

    sub-int/2addr p2, v0

    sub-int p2, p5, p2

    if-nez p2, :cond_2

    iget-object p3, p0, LWz;->j:[I

    aget p3, p3, p1

    add-int/2addr p5, p3

    goto :goto_0

    :cond_2
    move p5, p2

    :goto_0
    if-gez p5, :cond_3

    invoke-virtual {p0}, LWz;->g()Z

    move-result p3

    if-nez p3, :cond_3

    iget p3, p0, LWz;->f:F

    invoke-static {p5}, Ljava/lang/Math;->abs(I)I

    move-result p4

    int-to-float p4, p4

    add-float/2addr p3, p4

    iput p3, p0, LWz;->f:F

    invoke-virtual {p0, p3}, LWz;->j(F)V

    aget p3, p7, p1

    add-int/2addr p3, p2

    aput p3, p7, p1

    :cond_3
    :goto_1
    return-void
.end method

.method public final dispatchNestedFling(FFZ)Z
    .locals 1

    iget-object v0, p0, LWz;->h:LGs;

    invoke-virtual {v0, p1, p2, p3}, LGs;->a(FFZ)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedPreFling(FF)Z
    .locals 1

    iget-object v0, p0, LWz;->h:LGs;

    invoke-virtual {v0, p1, p2}, LGs;->b(FF)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedPreScroll(II[I[I)Z
    .locals 6

    iget-object v0, p0, LWz;->h:LGs;

    const/4 v5, 0x0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, LGs;->c(II[I[II)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedScroll(IIII[I)Z
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v0, p0, LWz;->h:LGs;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v7}, LGs;->d(IIII[II[I)Z

    move-result p1

    return p1
.end method

.method public final e(Landroid/view/View;IIIII)V
    .locals 8

    iget-object v7, p0, LWz;->k:[I

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v7}, LWz;->d(Landroid/view/View;IIIII[I)V

    return-void
.end method

.method public final f(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    if-nez p4, :cond_0

    invoke-virtual {p0, p1, p2, p3}, LWz;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final g()Z
    .locals 3

    iget-object v0, p0, LWz;->a:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/ListView;

    const/4 v2, -0x1

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->canScrollList(I)Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    return v0
.end method

.method public final getChildDrawingOrder(II)I
    .locals 1

    iget v0, p0, LWz;->u:I

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x1

    if-ne p2, p1, :cond_1

    return v0

    :cond_1
    if-lt p2, v0, :cond_2

    add-int/lit8 p2, p2, 0x1

    :cond_2
    :goto_0
    return p2
.end method

.method public getNestedScrollAxes()I
    .locals 2

    iget-object v0, p0, LWz;->g:LJs;

    iget v1, v0, LJs;->a:I

    iget v0, v0, LJs;->b:I

    or-int/2addr v0, v1

    return v0
.end method

.method public getProgressCircleDiameter()I
    .locals 1

    iget v0, p0, LWz;->F:I

    return v0
.end method

.method public getProgressViewEndOffset()I
    .locals 1

    iget v0, p0, LWz;->x:I

    return v0
.end method

.method public getProgressViewStartOffset()I
    .locals 1

    iget v0, p0, LWz;->w:I

    return v0
.end method

.method public final h()V
    .locals 3

    iget-object v0, p0, LWz;->a:Landroid/view/View;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, LWz;->t:Ls9;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iput-object v1, p0, LWz;->a:Landroid/view/View;

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final hasNestedScrollingParent()Z
    .locals 2

    iget-object v0, p0, LWz;->h:LGs;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LGs;->f(I)Z

    move-result v0

    return v0
.end method

.method public final i(F)V
    .locals 4

    iget v0, p0, LWz;->e:F

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1, p1}, LWz;->m(ZZ)V

    return-void

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, LWz;->c:Z

    iget-object v0, p0, LWz;->z:Lw9;

    iget-object v1, v0, Lw9;->a:Lv9;

    const/4 v2, 0x0

    iput v2, v1, Lv9;->e:F

    iput v2, v1, Lv9;->f:F

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    new-instance v0, LQz;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, LQz;-><init>(Landroid/view/ViewGroup;I)V

    iget v1, p0, LWz;->n:I

    iput v1, p0, LWz;->v:I

    iget-object v1, p0, LWz;->J:LRz;

    invoke-virtual {v1}, Landroid/view/animation/Animation;->reset()V

    const-wide/16 v2, 0xc8

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object v2, p0, LWz;->s:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    iget-object v2, p0, LWz;->t:Ls9;

    iput-object v0, v2, Ls9;->a:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {v2}, Landroid/view/View;->clearAnimation()V

    iget-object v0, p0, LWz;->t:Ls9;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    iget-object v0, p0, LWz;->z:Lw9;

    iget-object v1, v0, Lw9;->a:Lv9;

    iget-boolean v2, v1, Lv9;->n:Z

    if-eqz v2, :cond_1

    iput-boolean p1, v1, Lv9;->n:Z

    :cond_1
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    iget-object v0, p0, LWz;->h:LGs;

    iget-boolean v0, v0, LGs;->d:Z

    return v0
.end method

.method public final j(F)V
    .locals 11

    iget-object v0, p0, LWz;->z:Lw9;

    iget-object v1, v0, Lw9;->a:Lv9;

    iget-boolean v2, v1, Lv9;->n:Z

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    iput-boolean v3, v1, Lv9;->n:Z

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    iget v0, p0, LWz;->e:F

    div-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    float-to-double v2, v0

    const-wide v4, 0x3fd999999999999aL    # 0.4

    sub-double/2addr v2, v4

    const-wide/16 v4, 0x0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    double-to-float v2, v2

    const/high16 v3, 0x40a00000    # 5.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x40400000    # 3.0f

    div-float/2addr v2, v3

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, LWz;->e:F

    sub-float/2addr v3, v4

    iget v4, p0, LWz;->y:I

    if-lez v4, :cond_1

    :goto_0
    int-to-float v4, v4

    goto :goto_1

    :cond_1
    iget v4, p0, LWz;->x:I

    goto :goto_0

    :goto_1
    const/high16 v5, 0x40000000    # 2.0f

    mul-float v6, v4, v5

    invoke-static {v3, v6}, Ljava/lang/Math;->min(FF)F

    move-result v3

    div-float/2addr v3, v4

    const/4 v6, 0x0

    invoke-static {v6, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    const/high16 v7, 0x40800000    # 4.0f

    div-float/2addr v3, v7

    float-to-double v7, v3

    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v9

    sub-double/2addr v7, v9

    double-to-float v3, v7

    mul-float/2addr v3, v5

    mul-float v7, v4, v3

    mul-float/2addr v7, v5

    mul-float/2addr v4, v0

    add-float/2addr v4, v7

    float-to-int v0, v4

    iget v4, p0, LWz;->w:I

    add-int/2addr v4, v0

    iget-object v0, p0, LWz;->t:Ls9;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LWz;->t:Ls9;

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    iget-object v0, p0, LWz;->t:Ls9;

    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleX(F)V

    iget-object v0, p0, LWz;->t:Ls9;

    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleY(F)V

    iget v0, p0, LWz;->e:F

    cmpg-float p1, p1, v0

    const/4 v0, 0x0

    const-wide/16 v7, 0x12c

    if-gez p1, :cond_4

    iget-object p1, p0, LWz;->z:Lw9;

    iget-object p1, p1, Lw9;->a:Lv9;

    iget p1, p1, Lv9;->t:I

    const/16 v9, 0x4c

    if-le p1, v9, :cond_6

    iget-object p1, p0, LWz;->C:LSz;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    iget-object p1, p0, LWz;->z:Lw9;

    iget-object p1, p1, Lw9;->a:Lv9;

    iget p1, p1, Lv9;->t:I

    new-instance v10, LSz;

    invoke-direct {v10, p0, p1, v9}, LSz;-><init>(LWz;II)V

    invoke-virtual {v10, v7, v8}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object p1, p0, LWz;->t:Ls9;

    iput-object v0, p1, Ls9;->a:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    iget-object p1, p0, LWz;->t:Ls9;

    invoke-virtual {p1, v10}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    iput-object v10, p0, LWz;->C:LSz;

    goto :goto_2

    :cond_4
    iget-object p1, p0, LWz;->z:Lw9;

    iget-object p1, p1, Lw9;->a:Lv9;

    iget p1, p1, Lv9;->t:I

    const/16 v9, 0xff

    if-ge p1, v9, :cond_6

    iget-object p1, p0, LWz;->D:LSz;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    iget-object p1, p0, LWz;->z:Lw9;

    iget-object p1, p1, Lw9;->a:Lv9;

    iget p1, p1, Lv9;->t:I

    new-instance v10, LSz;

    invoke-direct {v10, p0, p1, v9}, LSz;-><init>(LWz;II)V

    invoke-virtual {v10, v7, v8}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object p1, p0, LWz;->t:Ls9;

    iput-object v0, p1, Ls9;->a:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    iget-object p1, p0, LWz;->t:Ls9;

    invoke-virtual {p1, v10}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    iput-object v10, p0, LWz;->D:LSz;

    :cond_6
    :goto_2
    const p1, 0x3f4ccccd    # 0.8f

    mul-float v0, v2, p1

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    iget-object v0, p0, LWz;->z:Lw9;

    iget-object v7, v0, Lw9;->a:Lv9;

    iput v6, v7, Lv9;->e:F

    iput p1, v7, Lv9;->f:F

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    iget-object v0, p0, LWz;->z:Lw9;

    iget-object v1, v0, Lw9;->a:Lv9;

    iget v6, v1, Lv9;->p:F

    cmpl-float v6, p1, v6

    if-eqz v6, :cond_7

    iput p1, v1, Lv9;->p:F

    :cond_7
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    const p1, 0x3ecccccd    # 0.4f

    mul-float/2addr v2, p1

    const/high16 p1, -0x41800000    # -0.25f

    add-float/2addr v2, p1

    mul-float/2addr v3, v5

    add-float/2addr v3, v2

    const/high16 p1, 0x3f000000    # 0.5f

    mul-float/2addr v3, p1

    iget-object p1, p0, LWz;->z:Lw9;

    iget-object v0, p1, Lw9;->a:Lv9;

    iput v3, v0, Lv9;->g:F

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    iget p1, p0, LWz;->n:I

    sub-int/2addr v4, p1

    invoke-virtual {p0, v4}, LWz;->setTargetOffsetTopAndBottom(I)V

    return-void
.end method

.method public final k(F)V
    .locals 2

    iget v0, p0, LWz;->v:I

    iget v1, p0, LWz;->w:I

    sub-int/2addr v1, v0

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int p1, v1

    add-int/2addr v0, p1

    iget-object p1, p0, LWz;->t:Ls9;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    sub-int/2addr v0, p1

    invoke-virtual {p0, v0}, LWz;->setTargetOffsetTopAndBottom(I)V

    return-void
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, LWz;->t:Ls9;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    iget-object v0, p0, LWz;->z:Lw9;

    invoke-virtual {v0}, Lw9;->stop()V

    iget-object v0, p0, LWz;->t:Ls9;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/16 v0, 0xff

    invoke-direct {p0, v0}, LWz;->setColorViewAlpha(I)V

    iget v0, p0, LWz;->w:I

    iget v1, p0, LWz;->n:I

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, LWz;->setTargetOffsetTopAndBottom(I)V

    iget-object v0, p0, LWz;->t:Ls9;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p0, LWz;->n:I

    return-void
.end method

.method public final m(ZZ)V
    .locals 2

    iget-boolean v0, p0, LWz;->c:Z

    if-eq v0, p1, :cond_2

    iput-boolean p2, p0, LWz;->E:Z

    invoke-virtual {p0}, LWz;->h()V

    iput-boolean p1, p0, LWz;->c:Z

    iget-object p2, p0, LWz;->H:LQz;

    if-eqz p1, :cond_1

    iget p1, p0, LWz;->n:I

    iput p1, p0, LWz;->v:I

    iget-object p1, p0, LWz;->I:LRz;

    invoke-virtual {p1}, Landroid/view/animation/Animation;->reset()V

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object v0, p0, LWz;->s:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    if-eqz p2, :cond_0

    iget-object v0, p0, LWz;->t:Ls9;

    iput-object p2, v0, Ls9;->a:Landroid/view/animation/Animation$AnimationListener;

    :cond_0
    iget-object p2, p0, LWz;->t:Ls9;

    invoke-virtual {p2}, Landroid/view/View;->clearAnimation()V

    iget-object p2, p0, LWz;->t:Ls9;

    invoke-virtual {p2, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void

    :cond_1
    new-instance p1, LRz;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, LRz;-><init>(LWz;I)V

    iput-object p1, p0, LWz;->B:LRz;

    const-wide/16 v0, 0x96

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object p1, p0, LWz;->t:Ls9;

    iput-object p2, p1, Ls9;->a:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    iget-object p1, p0, LWz;->t:Ls9;

    iget-object p2, p0, LWz;->B:LRz;

    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_2
    return-void
.end method

.method public final n(F)V
    .locals 2

    iget v0, p0, LWz;->p:F

    sub-float/2addr p1, v0

    iget v1, p0, LWz;->d:I

    int-to-float v1, v1

    cmpl-float p1, p1, v1

    if-lez p1, :cond_0

    iget-boolean p1, p0, LWz;->q:Z

    if-nez p1, :cond_0

    add-float/2addr v0, v1

    iput v0, p0, LWz;->o:F

    const/4 p1, 0x1

    iput-boolean p1, p0, LWz;->q:Z

    iget-object p1, p0, LWz;->z:Lw9;

    const/16 v0, 0x4c

    invoke-virtual {p1, v0}, Lw9;->setAlpha(I)V

    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    invoke-virtual {p0}, LWz;->l()V

    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    invoke-virtual {p0}, LWz;->h()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_a

    invoke-virtual {p0}, LWz;->g()Z

    move-result v1

    if-nez v1, :cond_a

    iget-boolean v1, p0, LWz;->c:Z

    if-nez v1, :cond_a

    iget-boolean v1, p0, LWz;->l:Z

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    if-eqz v0, :cond_7

    const/4 v1, 0x1

    const/4 v3, -0x1

    if-eq v0, v1, :cond_6

    const/4 v4, 0x2

    if-eq v0, v4, :cond_3

    const/4 v4, 0x3

    if-eq v0, v4, :cond_6

    const/4 v3, 0x6

    if-eq v0, v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    iget v4, p0, LWz;->r:I

    if-ne v3, v4, :cond_9

    if-nez v0, :cond_2

    move v2, v1

    :cond_2
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, LWz;->r:I

    goto :goto_0

    :cond_3
    iget v0, p0, LWz;->r:I

    if-ne v0, v3, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    invoke-virtual {p0, p1}, LWz;->n(F)V

    goto :goto_0

    :cond_6
    iput-boolean v2, p0, LWz;->q:Z

    iput v3, p0, LWz;->r:I

    goto :goto_0

    :cond_7
    iget-object v0, p0, LWz;->t:Ls9;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iget v1, p0, LWz;->w:I

    sub-int/2addr v1, v0

    invoke-virtual {p0, v1}, LWz;->setTargetOffsetTopAndBottom(I)V

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, LWz;->r:I

    iput-boolean v2, p0, LWz;->q:Z

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_8

    goto :goto_1

    :cond_8
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iput p1, p0, LWz;->p:F

    :cond_9
    :goto_0
    iget-boolean p1, p0, LWz;->q:Z

    return p1

    :cond_a
    :goto_1
    return v2
.end method

.method public final onLayout(ZIIII)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p3, p0, LWz;->a:Landroid/view/View;

    if-nez p3, :cond_1

    invoke-virtual {p0}, LWz;->h()V

    :cond_1
    iget-object p3, p0, LWz;->a:Landroid/view/View;

    if-nez p3, :cond_2

    :goto_0
    return-void

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int v0, p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    sub-int/2addr p2, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int/2addr p2, v1

    add-int/2addr v0, p4

    add-int/2addr p2, p5

    invoke-virtual {p3, p4, p5, v0, p2}, Landroid/view/View;->layout(IIII)V

    iget-object p2, p0, LWz;->t:Ls9;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    iget-object p3, p0, LWz;->t:Ls9;

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    div-int/lit8 p1, p1, 0x2

    div-int/lit8 p2, p2, 0x2

    sub-int p4, p1, p2

    iget p5, p0, LWz;->n:I

    add-int/2addr p1, p2

    add-int/2addr p3, p5

    iget-object p2, p0, LWz;->t:Ls9;

    invoke-virtual {p2, p4, p5, p1, p3}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    iget-object p1, p0, LWz;->a:Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p0}, LWz;->h()V

    :cond_0
    iget-object p1, p0, LWz;->a:Landroid/view/View;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    sub-int/2addr p2, v0

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p1, p2, v1}, Landroid/view/View;->measure(II)V

    iget p1, p0, LWz;->F:I

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    iget p2, p0, LWz;->F:I

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    iget-object v0, p0, LWz;->t:Ls9;

    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    const/4 p1, -0x1

    iput p1, p0, LWz;->u:I

    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-ge p1, p2, :cond_3

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    iget-object v0, p0, LWz;->t:Ls9;

    if-ne p2, v0, :cond_2

    iput p1, p0, LWz;->u:I

    return-void

    :cond_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    iget-object p1, p0, LWz;->h:LGs;

    invoke-virtual {p1, p2, p3, p4}, LGs;->a(FFZ)Z

    move-result p1

    return p1
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    iget-object p1, p0, LWz;->h:LGs;

    invoke-virtual {p1, p2, p3}, LGs;->b(FF)Z

    move-result p1

    return p1
.end method

.method public final onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 4

    const/4 p1, 0x1

    if-lez p3, :cond_1

    iget v0, p0, LWz;->f:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-lez v2, :cond_1

    int-to-float v2, p3

    cmpl-float v3, v2, v0

    if-lez v3, :cond_0

    float-to-int v0, v0

    aput v0, p4, p1

    iput v1, p0, LWz;->f:F

    goto :goto_0

    :cond_0
    sub-float/2addr v0, v2

    iput v0, p0, LWz;->f:F

    aput p3, p4, p1

    :goto_0
    iget v0, p0, LWz;->f:F

    invoke-virtual {p0, v0}, LWz;->j(F)V

    :cond_1
    const/4 v0, 0x0

    aget v1, p4, v0

    sub-int/2addr p2, v1

    aget v1, p4, p1

    sub-int/2addr p3, v1

    const/4 v1, 0x0

    iget-object v2, p0, LWz;->i:[I

    invoke-virtual {p0, p2, p3, v2, v1}, LWz;->dispatchNestedPreScroll(II[I[I)Z

    move-result p2

    if-eqz p2, :cond_2

    aget p2, p4, v0

    aget p3, v2, v0

    add-int/2addr p2, p3

    aput p2, p4, v0

    aget p2, p4, p1

    aget p3, v2, p1

    add-int/2addr p2, p3

    aput p2, p4, p1

    :cond_2
    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIII)V
    .locals 8

    const/4 v6, 0x0

    iget-object v7, p0, LWz;->k:[I

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v7}, LWz;->d(Landroid/view/View;IIIII[I)V

    return-void
.end method

.method public final onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    iget-object p1, p0, LWz;->g:LJs;

    iput p3, p1, LJs;->a:I

    and-int/lit8 p1, p3, 0x2

    invoke-virtual {p0, p1}, LWz;->startNestedScroll(I)Z

    const/4 p1, 0x0

    iput p1, p0, LWz;->f:F

    const/4 p1, 0x1

    iput-boolean p1, p0, LWz;->l:Z

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    check-cast p1, LVz;

    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-boolean p1, p1, LVz;->a:Z

    invoke-virtual {p0, p1}, LWz;->setRefreshing(Z)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, LVz;

    iget-boolean v2, p0, LWz;->c:Z

    invoke-direct {v1, v0, v2}, LVz;-><init>(Landroid/os/Parcelable;Z)V

    return-object v1
.end method

.method public final onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, LWz;->c:Z

    if-nez p1, :cond_0

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onStopNestedScroll(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, LWz;->g:LJs;

    const/4 v0, 0x0

    iput v0, p1, LJs;->a:I

    iput-boolean v0, p0, LWz;->l:Z

    iget p1, p0, LWz;->f:F

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-lez v1, :cond_0

    invoke-virtual {p0, p1}, LWz;->i(F)V

    iput v0, p0, LWz;->f:F

    :cond_0
    invoke-virtual {p0}, LWz;->stopNestedScroll()V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_c

    invoke-virtual {p0}, LWz;->g()Z

    move-result v1

    if-nez v1, :cond_c

    iget-boolean v1, p0, LWz;->c:Z

    if-nez v1, :cond_c

    iget-boolean v1, p0, LWz;->l:Z

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v1, 0x1

    if-eqz v0, :cond_b

    const/high16 v3, 0x3f000000    # 0.5f

    if-eq v0, v1, :cond_8

    const/4 v4, 0x2

    if-eq v0, v4, :cond_5

    const/4 v3, 0x3

    if-eq v0, v3, :cond_c

    const/4 v3, 0x5

    if-eq v0, v3, :cond_3

    const/4 v3, 0x6

    if-eq v0, v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    iget v4, p0, LWz;->r:I

    if-ne v3, v4, :cond_7

    if-nez v0, :cond_2

    move v2, v1

    :cond_2
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, LWz;->r:I

    return v1

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    if-gez v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, LWz;->r:I

    return v1

    :cond_5
    iget v0, p0, LWz;->r:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    invoke-virtual {p0, p1}, LWz;->n(F)V

    iget-boolean v0, p0, LWz;->q:Z

    if-eqz v0, :cond_7

    iget v0, p0, LWz;->o:F

    sub-float/2addr p1, v0

    mul-float/2addr p1, v3

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_c

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    invoke-virtual {p0, p1}, LWz;->j(F)V

    :cond_7
    :goto_0
    return v1

    :cond_8
    iget v0, p0, LWz;->r:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_9

    goto :goto_1

    :cond_9
    iget-boolean v1, p0, LWz;->q:Z

    if-eqz v1, :cond_a

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iget v0, p0, LWz;->o:F

    sub-float/2addr p1, v0

    mul-float/2addr p1, v3

    iput-boolean v2, p0, LWz;->q:Z

    invoke-virtual {p0, p1}, LWz;->i(F)V

    :cond_a
    const/4 p1, -0x1

    iput p1, p0, LWz;->r:I

    return v2

    :cond_b
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, LWz;->r:I

    iput-boolean v2, p0, LWz;->q:Z

    return v1

    :cond_c
    :goto_1
    return v2
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 2

    iget-object v0, p0, LWz;->a:Landroid/view/View;

    if-eqz v0, :cond_2

    sget-object v1, LlE;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, LeE;->h(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, LWz;->G:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public setAnimationProgress(F)V
    .locals 1

    iget-object v0, p0, LWz;->t:Ls9;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    iget-object v0, p0, LWz;->t:Ls9;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method

.method public varargs setColorScheme([I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, LWz;->setColorSchemeResources([I)V

    return-void
.end method

.method public varargs setColorSchemeColors([I)V
    .locals 2

    invoke-virtual {p0}, LWz;->h()V

    iget-object v0, p0, LWz;->z:Lw9;

    iget-object v1, v0, Lw9;->a:Lv9;

    iput-object p1, v1, Lv9;->i:[I

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lv9;->a(I)V

    invoke-virtual {v1, p1}, Lv9;->a(I)V

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public varargs setColorSchemeResources([I)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    array-length v1, p1

    new-array v1, v1, [I

    const/4 v2, 0x0

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_0

    aget v3, p1, v2

    invoke-virtual {v0, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, LWz;->setColorSchemeColors([I)V

    return-void
.end method

.method public setDistanceToTriggerSync(I)V
    .locals 0

    int-to-float p1, p1

    iput p1, p0, LWz;->e:F

    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, LWz;->l()V

    :cond_0
    return-void
.end method

.method public setLegacyRequestDisallowInterceptTouchEventEnabled(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-boolean p1, p0, LWz;->G:Z

    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 3

    iget-object v0, p0, LWz;->h:LGs;

    iget-boolean v1, v0, LGs;->d:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, LGs;->c:Landroid/view/ViewGroup;

    sget-object v2, LlE;->a:Ljava/util/WeakHashMap;

    invoke-static {v1}, LeE;->m(Landroid/view/View;)V

    :cond_0
    iput-boolean p1, v0, LGs;->d:Z

    return-void
.end method

.method public setOnChildScrollUpCallback(LTz;)V
    .locals 0

    return-void
.end method

.method public setOnRefreshListener(LUz;)V
    .locals 0

    iput-object p1, p0, LWz;->b:LUz;

    return-void
.end method

.method public setProgressBackgroundColor(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, LWz;->setProgressBackgroundColorSchemeResource(I)V

    return-void
.end method

.method public setProgressBackgroundColorSchemeColor(I)V
    .locals 1

    iget-object v0, p0, LWz;->t:Ls9;

    invoke-virtual {v0, p1}, Ls9;->setBackgroundColor(I)V

    return-void
.end method

.method public setProgressBackgroundColorSchemeResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, LWz;->setProgressBackgroundColorSchemeColor(I)V

    return-void
.end method

.method public setRefreshing(Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-boolean v1, p0, LWz;->c:Z

    if-eq v1, p1, :cond_1

    iput-boolean p1, p0, LWz;->c:Z

    iget p1, p0, LWz;->x:I

    iget v1, p0, LWz;->w:I

    add-int/2addr p1, v1

    iget v1, p0, LWz;->n:I

    sub-int/2addr p1, v1

    invoke-virtual {p0, p1}, LWz;->setTargetOffsetTopAndBottom(I)V

    iput-boolean v0, p0, LWz;->E:Z

    iget-object p1, p0, LWz;->t:Ls9;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, LWz;->z:Lw9;

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Lw9;->setAlpha(I)V

    new-instance p1, LRz;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, LRz;-><init>(LWz;I)V

    iput-object p1, p0, LWz;->A:LRz;

    iget v0, p0, LWz;->m:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object p1, p0, LWz;->H:LQz;

    if-eqz p1, :cond_0

    iget-object v0, p0, LWz;->t:Ls9;

    iput-object p1, v0, Ls9;->a:Landroid/view/animation/Animation$AnimationListener;

    :cond_0
    iget-object p1, p0, LWz;->t:Ls9;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    iget-object p1, p0, LWz;->t:Ls9;

    iget-object v0, p0, LWz;->A:LRz;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void

    :cond_1
    invoke-virtual {p0, p1, v0}, LWz;->m(ZZ)V

    return-void
.end method

.method public setSize(I)V
    .locals 2

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    if-nez p1, :cond_1

    const/high16 v1, 0x42600000    # 56.0f

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, LWz;->F:I

    goto :goto_0

    :cond_1
    const/high16 v1, 0x42200000    # 40.0f

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, LWz;->F:I

    :goto_0
    iget-object v0, p0, LWz;->t:Ls9;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, LWz;->z:Lw9;

    invoke-virtual {v0, p1}, Lw9;->c(I)V

    iget-object p1, p0, LWz;->t:Ls9;

    iget-object v0, p0, LWz;->z:Lw9;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setSlingshotDistance(I)V
    .locals 0

    iput p1, p0, LWz;->y:I

    return-void
.end method

.method public setTargetOffsetTopAndBottom(I)V
    .locals 2

    iget-object v0, p0, LWz;->t:Ls9;

    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    sget-object v1, LlE;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result p1

    iput p1, p0, LWz;->n:I

    return-void
.end method

.method public final startNestedScroll(I)Z
    .locals 2

    iget-object v0, p0, LWz;->h:LGs;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, LGs;->g(II)Z

    move-result p1

    return p1
.end method

.method public final stopNestedScroll()V
    .locals 2

    iget-object v0, p0, LWz;->h:LGs;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LGs;->h(I)V

    return-void
.end method
