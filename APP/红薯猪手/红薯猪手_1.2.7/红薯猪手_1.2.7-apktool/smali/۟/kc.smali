.class public L۟/kc;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/kc$f;,
        L۟/kc$i;,
        L۟/kc$g;,
        L۟/kc$j;,
        L۟/kc$d;,
        L۟/kc$k;,
        L۟/kc$h;,
        L۟/kc$e;
    }
.end annotation


# static fields
.field public static final ۥۢۨ:[I

.field public static final ۥۣ:L۟/kc$a;

.field public static final ۥۣ۟:L۟/kc$b;


# instance fields
.field public ۥ:I

.field public final ۥ۟:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u06df/kc$e;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟:L۟/kc$e;

.field public final ۥ۟۠:Landroid/graphics/Rect;

.field public ۥ۟ۡ:L۟/p7;

.field public ۥ۟ۢ:I

.field public ۥۣ۟:I

.field public ۥ۟ۤ:Landroid/widget/Scroller;

.field public ۥ۟ۥ:Z

.field public ۥ۟ۦ:L۟/kc$i;

.field public ۥ۟ۧ:I

.field public ۥ۟ۨ:Landroid/graphics/drawable/Drawable;

.field public ۥ۠:I

.field public ۥ۠۟:I

.field public ۥ۠۠:F

.field public ۥ۠ۡ:F

.field public ۥ۠ۢ:I

.field public ۥۣ۠:Z

.field public ۥ۠ۤ:Z

.field public ۥ۠ۥ:Z

.field public ۥ۠ۦ:I

.field public ۥ۠ۧ:Z

.field public ۥ۠ۨ:Z

.field public ۥۡ:I

.field public ۥۡ۟:I

.field public ۥۡ۠:I

.field public ۥۡۡ:F

.field public ۥۡۢ:F

.field public ۥۣۡ:F

.field public ۥۡۤ:F

.field public ۥۡۥ:I

.field public ۥۡۦ:Landroid/view/VelocityTracker;

.field public ۥۡۧ:I

.field public ۥۡۨ:I

.field public ۥۢ:I

.field public ۥۢ۟:I

.field public ۥۢ۠:Landroid/widget/EdgeEffect;

.field public ۥۢۡ:Landroid/widget/EdgeEffect;

.field public ۥۢۢ:Z

.field public ۥۣۢ:Z

.field public ۥۢۤ:I

.field public ۥۢۥ:L۟/kc$h;

.field public final ۥۢۦ:L۟/kc$c;

.field public ۥۢۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x10100b3

    aput v2, v0, v1

    sput-object v0, L۟/kc;->ۥۢۨ:[I

    new-instance v0, L۟/kc$a;

    invoke-direct {v0}, L۟/kc$a;-><init>()V

    sput-object v0, L۟/kc;->ۥۣ:L۟/kc$a;

    new-instance v0, L۟/kc$b;

    invoke-direct {v0}, L۟/kc$b;-><init>()V

    sput-object v0, L۟/kc;->ۥۣ۟:L۟/kc$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    new-instance p1, L۟/kc$e;

    invoke-direct {p1}, L۟/kc$e;-><init>()V

    iput-object p1, p0, L۟/kc;->ۥ۟۟:L۟/kc$e;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, L۟/kc;->ۥ۟۠:Landroid/graphics/Rect;

    const/4 p1, -0x1

    iput p1, p0, L۟/kc;->ۥۣ۟:I

    const v0, -0x800001

    iput v0, p0, L۟/kc;->ۥ۠۠:F

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, L۟/kc;->ۥ۠ۡ:F

    const/4 v0, 0x1

    iput v0, p0, L۟/kc;->ۥ۠ۦ:I

    iput p1, p0, L۟/kc;->ۥۡۥ:I

    iput-boolean v0, p0, L۟/kc;->ۥۢۢ:Z

    new-instance p1, L۟/kc$c;

    invoke-direct {p1, p0}, L۟/kc$c;-><init>(L۟/kc;)V

    iput-object p1, p0, L۟/kc;->ۥۢۦ:L۟/kc$c;

    const/4 p1, 0x0

    iput p1, p0, L۟/kc;->ۥۢۧ:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    const/high16 p1, 0x40000

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v1, Landroid/widget/Scroller;

    sget-object v2, L۟/kc;->ۥۣ۟:L۟/kc$b;

    invoke-direct {v1, p1, v2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v1, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledPagingTouchSlop()I

    move-result v3

    iput v3, p0, L۟/kc;->ۥۡ۠:I

    const/high16 v3, 0x43c80000    # 400.0f

    mul-float/2addr v3, v2

    float-to-int v3, v3

    iput v3, p0, L۟/kc;->ۥۡۧ:I

    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v1

    iput v1, p0, L۟/kc;->ۥۡۨ:I

    new-instance v1, Landroid/widget/EdgeEffect;

    invoke-direct {v1, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, L۟/kc;->ۥۢ۠:Landroid/widget/EdgeEffect;

    new-instance v1, Landroid/widget/EdgeEffect;

    invoke-direct {v1, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, L۟/kc;->ۥۢۡ:Landroid/widget/EdgeEffect;

    const/high16 p1, 0x41c80000    # 25.0f

    mul-float/2addr p1, v2

    float-to-int p1, p1

    iput p1, p0, L۟/kc;->ۥۢ:I

    const/high16 p1, 0x40000000    # 2.0f

    mul-float/2addr p1, v2

    float-to-int p1, p1

    iput p1, p0, L۟/kc;->ۥۢ۟:I

    const/high16 p1, 0x41800000    # 16.0f

    mul-float/2addr v2, p1

    float-to-int p1, v2

    iput p1, p0, L۟/kc;->ۥۡ:I

    new-instance p1, L۟/kc$g;

    invoke-direct {p1, p0}, L۟/kc$g;-><init>(L۟/kc;)V

    invoke-static {p0, p1}, Landroidx/core/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroidx/core/view/AccessibilityDelegateCompat;)V

    invoke-static {p0}, Landroidx/core/view/ViewCompat;->getImportantForAccessibility(Landroid/view/View;)I

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p0, v0}, Landroidx/core/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    :cond_0
    new-instance p1, L۟/lc;

    invoke-direct {p1, p0}, L۟/lc;-><init>(L۟/kc;)V

    invoke-static {p0, p1}, Landroidx/core/view/ViewCompat;->setOnApplyWindowInsetsListener(Landroid/view/View;Landroidx/core/view/OnApplyWindowInsetsListener;)V

    return-void
.end method

.method private getClientWidth()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method private setScrollingCacheEnabled(Z)V
    .locals 1

    iget-boolean v0, p0, L۟/kc;->ۥ۠ۤ:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, L۟/kc;->ۥ۠ۤ:Z

    :cond_0
    return-void
.end method

.method public static ۥ۟۟(Landroid/view/View;ZIII)Z
    .locals 9

    instance-of v0, p0, Landroid/view/ViewGroup;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    sub-int/2addr v4, v1

    :goto_0
    if-ltz v4, :cond_1

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    add-int v6, p3, v2

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v7

    if-lt v6, v7, :cond_0

    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v7

    if-ge v6, v7, :cond_0

    add-int v7, p4, v3

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v8

    if-lt v7, v8, :cond_0

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v8

    if-ge v7, v8, :cond_0

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v8

    sub-int/2addr v6, v8

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v8

    sub-int/2addr v7, v8

    invoke-static {v5, v1, p2, v6, v7}, L۟/kc;->ۥ۟۟(Landroid/view/View;ZIII)Z

    move-result v5

    if-eqz v5, :cond_0

    return v1

    :cond_0
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    neg-int p1, p2

    invoke-virtual {p0, p1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method


# virtual methods
.method public final addFocusables(Ljava/util/ArrayList;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;II)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result v1

    const/high16 v2, 0x60000

    if-eq v1, v2, :cond_1

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v2, v3, :cond_1

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {p0, v3}, L۟/kc;->ۥۣ۟(Landroid/view/View;)L۟/kc$e;

    move-result-object v4

    if-eqz v4, :cond_0

    iget v4, v4, L۟/kc$e;->ۥ۟:I

    iget v5, p0, L۟/kc;->ۥ۟ۢ:I

    if-ne v4, v5, :cond_0

    invoke-virtual {v3, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/high16 p2, 0x40000

    if-ne v1, p2, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ne v0, p2, :cond_5

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    move-result p2

    if-nez p2, :cond_3

    return-void

    :cond_3
    const/4 p2, 0x1

    and-int/2addr p3, p2

    if-ne p3, p2, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->isFocusableInTouchMode()Z

    move-result p2

    if-nez p2, :cond_4

    return-void

    :cond_4
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    return-void
.end method

.method public final addTouchables(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, L۟/kc;->ۥۣ۟(Landroid/view/View;)L۟/kc$e;

    move-result-object v2

    if-eqz v2, :cond_0

    iget v2, v2, L۟/kc$e;->ۥ۟:I

    iget v3, p0, L۟/kc;->ۥ۟ۢ:I

    if-ne v2, v3, :cond_0

    invoke-virtual {v1, p1}, Landroid/view/View;->addTouchables(Ljava/util/ArrayList;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p3}, L۟/kc;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance p3, L۟/kc$f;

    .line 8
    .line 9
    invoke-direct {p3}, L۟/kc$f;-><init>()V

    .line 10
    .line 11
    .line 12
    :cond_0
    move-object v0, p3

    .line 13
    check-cast v0, L۟/kc$f;

    .line 14
    .line 15
    iget-boolean v1, v0, L۟/kc$f;->ۥ:Z

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-class v3, L۟/kc$d;

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x1

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    move v2, v3

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v2, 0x0

    .line 33
    :goto_0
    or-int/2addr v1, v2

    .line 34
    iput-boolean v1, v0, L۟/kc$f;->ۥ:Z

    .line 35
    .line 36
    iget-boolean v2, p0, L۟/kc;->ۥۣ۠:Z

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    iput-boolean v3, v0, L۟/kc$f;->ۥ۟۠:Z

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "Cannot add pager decor view during layout"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_3
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 57
    .line 58
    .line 59
    :goto_1
    return-void
.end method

.method public final canScrollHorizontally(I)Z
    .locals 4

    iget-object v0, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0}, L۟/kc;->getClientWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    const/4 v3, 0x1

    if-gez p1, :cond_2

    int-to-float p1, v0

    iget v0, p0, L۟/kc;->ۥ۠۠:F

    mul-float/2addr p1, v0

    float-to-int p1, p1

    if-le v2, p1, :cond_1

    move v1, v3

    :cond_1
    return v1

    :cond_2
    if-lez p1, :cond_3

    int-to-float p1, v0

    iget v0, p0, L۟/kc;->ۥ۠ۡ:F

    mul-float/2addr p1, v0

    float-to-int p1, p1

    if-ge v2, p1, :cond_3

    move v1, v3

    :cond_3
    return v1
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    instance-of v0, p1, L۟/kc$f;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final computeScroll()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, L۟/kc;->ۥ۟ۥ:Z

    iget-object v1, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->isFinished()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    iget-object v2, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual {v2}, Landroid/widget/Scroller;->getCurrX()I

    move-result v2

    iget-object v3, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual {v3}, Landroid/widget/Scroller;->getCurrY()I

    move-result v3

    if-ne v0, v2, :cond_0

    if-eq v1, v3, :cond_1

    :cond_0
    invoke-virtual {p0, v2, v3}, Landroid/view/View;->scrollTo(II)V

    invoke-virtual {p0, v2}, L۟/kc;->ۥ۠(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v3}, Landroid/view/View;->scrollTo(II)V

    :cond_1
    invoke-static {p0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    return-void

    :cond_2
    invoke-virtual {p0, v0}, L۟/kc;->ۥ۟۠(Z)V

    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v0, :cond_8

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_6

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v3, 0x15

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    if-eq v0, v3, :cond_4

    .line 23
    .line 24
    const/16 v3, 0x16

    .line 25
    .line 26
    if-eq v0, v3, :cond_2

    .line 27
    .line 28
    const/16 v3, 0x3d

    .line 29
    .line 30
    if-eq v0, v3, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0, v4}, L۟/kc;->ۥ۟(I)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    invoke-virtual {p1, v1}, Landroid/view/KeyEvent;->hasModifiers(I)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_6

    .line 49
    .line 50
    invoke-virtual {p0, v1}, L۟/kc;->ۥ۟(I)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    invoke-virtual {p1, v4}, Landroid/view/KeyEvent;->hasModifiers(I)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0}, L۟/kc;->ۥ۟ۨ()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    const/16 p1, 0x42

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    invoke-virtual {p1, v4}, Landroid/view/KeyEvent;->hasModifiers(I)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_5

    .line 74
    .line 75
    iget p1, p0, L۟/kc;->ۥ۟ۢ:I

    .line 76
    .line 77
    if-lez p1, :cond_6

    .line 78
    .line 79
    sub-int/2addr p1, v1

    .line 80
    iput-boolean v2, p0, L۟/kc;->ۥ۠ۥ:Z

    .line 81
    .line 82
    invoke-virtual {p0, p1, v2, v1, v2}, L۟/kc;->ۥ۠ۥ(IIZZ)V

    .line 83
    .line 84
    .line 85
    move p1, v1

    .line 86
    goto :goto_2

    .line 87
    :cond_5
    const/16 p1, 0x11

    .line 88
    .line 89
    :goto_0
    invoke-virtual {p0, p1}, L۟/kc;->ۥ۟(I)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    goto :goto_2

    .line 94
    :cond_6
    :goto_1
    move p1, v2

    .line 95
    :goto_2
    if-eqz p1, :cond_7

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_7
    move v1, v2

    .line 99
    :cond_8
    :goto_3
    return v1
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 6

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x1000

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {p0, v3}, L۟/kc;->ۥۣ۟(Landroid/view/View;)L۟/kc$e;

    move-result-object v4

    if-eqz v4, :cond_1

    iget v4, v4, L۟/kc$e;->ۥ۟:I

    iget v5, p0, L۟/kc;->ۥ۟ۢ:I

    if-ne v4, v5, :cond_1

    invoke-virtual {v3, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 7

    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/view/View;->getOverScrollMode()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    iget-object v0, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, L۟/p7;->ۥ۟()I

    move-result v0

    if-le v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, L۟/kc;->ۥۢ۠:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->finish()V

    iget-object p1, p0, L۟/kc;->ۥۢۡ:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->finish()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, L۟/kc;->ۥۢ۠:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    const/high16 v4, 0x43870000    # 270.0f

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    neg-int v4, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    add-int/2addr v5, v4

    int-to-float v4, v5

    iget v5, p0, L۟/kc;->ۥ۠۠:F

    int-to-float v6, v3

    mul-float/2addr v5, v6

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v4, p0, L۟/kc;->ۥۢ۠:Landroid/widget/EdgeEffect;

    invoke-virtual {v4, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v2, p0, L۟/kc;->ۥۢ۠:Landroid/widget/EdgeEffect;

    invoke-virtual {v2, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_2
    iget-object v0, p0, L۟/kc;->ۥۢۡ:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    const/high16 v4, 0x42b40000    # 90.0f

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    neg-int v4, v4

    int-to-float v4, v4

    iget v5, p0, L۟/kc;->ۥ۠ۡ:F

    const/high16 v6, 0x3f800000    # 1.0f

    add-float/2addr v5, v6

    neg-float v5, v5

    int-to-float v6, v2

    mul-float/2addr v5, v6

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v4, p0, L۟/kc;->ۥۢۡ:Landroid/widget/EdgeEffect;

    invoke-virtual {v4, v3, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v2, p0, L۟/kc;->ۥۢۡ:Landroid/widget/EdgeEffect;

    invoke-virtual {v2, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_3
    :goto_1
    if-eqz v1, :cond_4

    invoke-static {p0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    :cond_4
    return-void
.end method

.method public final drawableStateChanged()V
    .locals 2

    invoke-super {p0}, Landroid/view/ViewGroup;->drawableStateChanged()V

    iget-object v0, p0, L۟/kc;->ۥ۟ۨ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_0
    return-void
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    new-instance v0, L۟/kc$f;

    invoke-direct {v0}, L۟/kc$f;-><init>()V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    new-instance v0, L۟/kc$f;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, L۟/kc$f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    new-instance p1, L۟/kc$f;

    invoke-direct {p1}, L۟/kc$f;-><init>()V

    return-object p1
.end method

.method public getAdapter()L۟/p7;
    .locals 1

    iget-object v0, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    return-object v0
.end method

.method public final getChildDrawingOrder(II)I
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public getCurrentItem()I
    .locals 1

    iget v0, p0, L۟/kc;->ۥ۟ۢ:I

    return v0
.end method

.method public getOffscreenPageLimit()I
    .locals 1

    iget v0, p0, L۟/kc;->ۥ۠ۦ:I

    return v0
.end method

.method public getPageMargin()I
    .locals 1

    iget v0, p0, L۟/kc;->ۥ۟ۧ:I

    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    const/4 v0, 0x1

    iput-boolean v0, p0, L۟/kc;->ۥۢۢ:Z

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    iget-object v0, p0, L۟/kc;->ۥۢۦ:L۟/kc$c;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    :cond_0
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 17

    move-object/from16 v0, p0

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget v1, v0, L۟/kc;->ۥ۟ۧ:I

    if-lez v1, :cond_4

    iget-object v1, v0, L۟/kc;->ۥ۟ۨ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_4

    iget-object v1, v0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_4

    iget-object v1, v0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    if-eqz v1, :cond_4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v2

    iget v3, v0, L۟/kc;->ۥ۟ۧ:I

    int-to-float v3, v3

    int-to-float v4, v2

    div-float/2addr v3, v4

    iget-object v5, v0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, L۟/kc$e;

    iget v7, v5, L۟/kc$e;->ۥ۟ۡ:F

    iget-object v8, v0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    iget v9, v5, L۟/kc$e;->ۥ۟:I

    iget-object v10, v0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    add-int/lit8 v11, v8, -0x1

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, L۟/kc$e;

    iget v10, v10, L۟/kc$e;->ۥ۟:I

    :goto_0
    if-ge v9, v10, :cond_4

    :goto_1
    iget v11, v5, L۟/kc$e;->ۥ۟:I

    if-le v9, v11, :cond_0

    if-ge v6, v8, :cond_0

    iget-object v5, v0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, L۟/kc$e;

    goto :goto_1

    :cond_0
    if-ne v9, v11, :cond_1

    iget v7, v5, L۟/kc$e;->ۥ۟ۡ:F

    iget v11, v5, L۟/kc$e;->ۥ۟۠:F

    add-float v12, v7, v11

    mul-float/2addr v12, v4

    add-float/2addr v7, v11

    add-float/2addr v7, v3

    goto :goto_2

    :cond_1
    iget-object v11, v0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v11, 0x3f800000    # 1.0f

    add-float v12, v7, v11

    mul-float/2addr v12, v4

    add-float/2addr v11, v3

    add-float/2addr v11, v7

    move v7, v11

    :goto_2
    iget v11, v0, L۟/kc;->ۥ۟ۧ:I

    int-to-float v11, v11

    add-float/2addr v11, v12

    int-to-float v13, v1

    cmpl-float v11, v11, v13

    if-lez v11, :cond_2

    iget-object v11, v0, L۟/kc;->ۥ۟ۨ:Landroid/graphics/drawable/Drawable;

    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    move-result v13

    iget v14, v0, L۟/kc;->ۥ۠:I

    iget v15, v0, L۟/kc;->ۥ۟ۧ:I

    int-to-float v15, v15

    add-float/2addr v15, v12

    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    move-result v15

    move/from16 v16, v3

    iget v3, v0, L۟/kc;->ۥ۠۟:I

    invoke-virtual {v11, v13, v14, v15, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v3, v0, L۟/kc;->ۥ۟ۨ:Landroid/graphics/drawable/Drawable;

    move-object/from16 v11, p1

    invoke-virtual {v3, v11}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_3

    :cond_2
    move-object/from16 v11, p1

    move/from16 v16, v3

    :goto_3
    add-int v3, v1, v2

    int-to-float v3, v3

    cmpl-float v3, v12, v3

    if-lez v3, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v9, v9, 0x1

    move/from16 v3, v16

    goto :goto_0

    :cond_4
    :goto_4
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x3

    .line 9
    if-eq v0, v2, :cond_13

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_0
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-boolean v3, p0, L۟/kc;->ۥ۠ۧ:Z

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    iget-boolean v3, p0, L۟/kc;->ۥ۠ۨ:Z

    .line 24
    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    return v1

    .line 28
    :cond_2
    const/4 v3, 0x2

    .line 29
    if-eqz v0, :cond_e

    .line 30
    .line 31
    if-eq v0, v3, :cond_4

    .line 32
    .line 33
    const/4 v1, 0x6

    .line 34
    if-eq v0, v1, :cond_3

    .line 35
    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_3
    invoke-virtual {p0, p1}, L۟/kc;->ۥ۟ۧ(Landroid/view/MotionEvent;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_4
    iget v0, p0, L۟/kc;->ۥۡۥ:I

    .line 44
    .line 45
    const/4 v3, -0x1

    .line 46
    if-ne v0, v3, :cond_5

    .line 47
    .line 48
    goto/16 :goto_3

    .line 49
    .line 50
    :cond_5
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    iget v4, p0, L۟/kc;->ۥۡۡ:F

    .line 59
    .line 60
    sub-float v4, v3, v4

    .line 61
    .line 62
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget v6, p0, L۟/kc;->ۥۡۤ:F

    .line 71
    .line 72
    sub-float v6, v0, v6

    .line 73
    .line 74
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    const/4 v7, 0x0

    .line 79
    cmpl-float v8, v4, v7

    .line 80
    .line 81
    if-eqz v8, :cond_9

    .line 82
    .line 83
    iget v9, p0, L۟/kc;->ۥۡۡ:F

    .line 84
    .line 85
    iget v10, p0, L۟/kc;->ۥۡ۟:I

    .line 86
    .line 87
    int-to-float v10, v10

    .line 88
    cmpg-float v10, v9, v10

    .line 89
    .line 90
    if-gez v10, :cond_6

    .line 91
    .line 92
    if-gtz v8, :cond_7

    .line 93
    .line 94
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    iget v11, p0, L۟/kc;->ۥۡ۟:I

    .line 99
    .line 100
    sub-int/2addr v10, v11

    .line 101
    int-to-float v10, v10

    .line 102
    cmpl-float v9, v9, v10

    .line 103
    .line 104
    if-lez v9, :cond_8

    .line 105
    .line 106
    cmpg-float v7, v4, v7

    .line 107
    .line 108
    if-gez v7, :cond_8

    .line 109
    .line 110
    :cond_7
    move v7, v2

    .line 111
    goto :goto_0

    .line 112
    :cond_8
    move v7, v1

    .line 113
    :goto_0
    if-nez v7, :cond_9

    .line 114
    .line 115
    float-to-int v4, v4

    .line 116
    float-to-int v7, v3

    .line 117
    float-to-int v9, v0

    .line 118
    invoke-static {p0, v1, v4, v7, v9}, L۟/kc;->ۥ۟۟(Landroid/view/View;ZIII)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_9

    .line 123
    .line 124
    iput v3, p0, L۟/kc;->ۥۡۡ:F

    .line 125
    .line 126
    iput v0, p0, L۟/kc;->ۥۡۢ:F

    .line 127
    .line 128
    iput-boolean v2, p0, L۟/kc;->ۥ۠ۨ:Z

    .line 129
    .line 130
    return v1

    .line 131
    :cond_9
    iget v1, p0, L۟/kc;->ۥۡ۠:I

    .line 132
    .line 133
    int-to-float v1, v1

    .line 134
    cmpl-float v4, v5, v1

    .line 135
    .line 136
    if-lez v4, :cond_c

    .line 137
    .line 138
    const/high16 v4, 0x3f000000    # 0.5f

    .line 139
    .line 140
    mul-float/2addr v5, v4

    .line 141
    cmpl-float v4, v5, v6

    .line 142
    .line 143
    if-lez v4, :cond_c

    .line 144
    .line 145
    iput-boolean v2, p0, L۟/kc;->ۥ۠ۧ:Z

    .line 146
    .line 147
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    if-eqz v1, :cond_a

    .line 152
    .line 153
    invoke-interface {v1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 154
    .line 155
    .line 156
    :cond_a
    invoke-virtual {p0, v2}, L۟/kc;->setScrollState(I)V

    .line 157
    .line 158
    .line 159
    iget v1, p0, L۟/kc;->ۥۣۡ:F

    .line 160
    .line 161
    iget v4, p0, L۟/kc;->ۥۡ۠:I

    .line 162
    .line 163
    int-to-float v4, v4

    .line 164
    if-lez v8, :cond_b

    .line 165
    .line 166
    add-float/2addr v1, v4

    .line 167
    goto :goto_1

    .line 168
    :cond_b
    sub-float/2addr v1, v4

    .line 169
    :goto_1
    iput v1, p0, L۟/kc;->ۥۡۡ:F

    .line 170
    .line 171
    iput v0, p0, L۟/kc;->ۥۡۢ:F

    .line 172
    .line 173
    invoke-direct {p0, v2}, L۟/kc;->setScrollingCacheEnabled(Z)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_c
    cmpl-float v0, v6, v1

    .line 178
    .line 179
    if-lez v0, :cond_d

    .line 180
    .line 181
    iput-boolean v2, p0, L۟/kc;->ۥ۠ۨ:Z

    .line 182
    .line 183
    :cond_d
    :goto_2
    iget-boolean v0, p0, L۟/kc;->ۥ۠ۧ:Z

    .line 184
    .line 185
    if-eqz v0, :cond_11

    .line 186
    .line 187
    invoke-virtual {p0, v3}, L۟/kc;->ۥ۠۟(F)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_11

    .line 192
    .line 193
    invoke-static {p0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_e
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    iput v0, p0, L۟/kc;->ۥۣۡ:F

    .line 202
    .line 203
    iput v0, p0, L۟/kc;->ۥۡۡ:F

    .line 204
    .line 205
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    iput v0, p0, L۟/kc;->ۥۡۤ:F

    .line 210
    .line 211
    iput v0, p0, L۟/kc;->ۥۡۢ:F

    .line 212
    .line 213
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    iput v0, p0, L۟/kc;->ۥۡۥ:I

    .line 218
    .line 219
    iput-boolean v1, p0, L۟/kc;->ۥ۠ۨ:Z

    .line 220
    .line 221
    iput-boolean v2, p0, L۟/kc;->ۥ۟ۥ:Z

    .line 222
    .line 223
    iget-object v0, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    .line 224
    .line 225
    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 226
    .line 227
    .line 228
    iget v0, p0, L۟/kc;->ۥۢۧ:I

    .line 229
    .line 230
    if-ne v0, v3, :cond_10

    .line 231
    .line 232
    iget-object v0, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    .line 233
    .line 234
    invoke-virtual {v0}, Landroid/widget/Scroller;->getFinalX()I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    iget-object v3, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    .line 239
    .line 240
    invoke-virtual {v3}, Landroid/widget/Scroller;->getCurrX()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    sub-int/2addr v0, v3

    .line 245
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    iget v3, p0, L۟/kc;->ۥۢ۟:I

    .line 250
    .line 251
    if-le v0, v3, :cond_10

    .line 252
    .line 253
    iget-object v0, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    .line 254
    .line 255
    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 256
    .line 257
    .line 258
    iput-boolean v1, p0, L۟/kc;->ۥ۠ۥ:Z

    .line 259
    .line 260
    invoke-virtual {p0}, L۟/kc;->ۥ۠۠()V

    .line 261
    .line 262
    .line 263
    iput-boolean v2, p0, L۟/kc;->ۥ۠ۧ:Z

    .line 264
    .line 265
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    if-eqz v0, :cond_f

    .line 270
    .line 271
    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 272
    .line 273
    .line 274
    :cond_f
    invoke-virtual {p0, v2}, L۟/kc;->setScrollState(I)V

    .line 275
    .line 276
    .line 277
    goto :goto_3

    .line 278
    :cond_10
    invoke-virtual {p0, v1}, L۟/kc;->ۥ۟۠(Z)V

    .line 279
    .line 280
    .line 281
    iput-boolean v1, p0, L۟/kc;->ۥ۠ۧ:Z

    .line 282
    .line 283
    :cond_11
    :goto_3
    iget-object v0, p0, L۟/kc;->ۥۡۦ:Landroid/view/VelocityTracker;

    .line 284
    .line 285
    if-nez v0, :cond_12

    .line 286
    .line 287
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    iput-object v0, p0, L۟/kc;->ۥۡۦ:Landroid/view/VelocityTracker;

    .line 292
    .line 293
    :cond_12
    iget-object v0, p0, L۟/kc;->ۥۡۦ:Landroid/view/VelocityTracker;

    .line 294
    .line 295
    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 296
    .line 297
    .line 298
    iget-boolean p1, p0, L۟/kc;->ۥ۠ۧ:Z

    .line 299
    .line 300
    return p1

    .line 301
    :cond_13
    :goto_4
    invoke-virtual {p0}, L۟/kc;->ۥۣ۠()Z

    .line 302
    .line 303
    .line 304
    return v1
.end method

.method public final onLayout(ZIIII)V
    .locals 18

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    sub-int v2, p4, p2

    sub-int v3, p5, p3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v8

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    const/16 v12, 0x8

    if-ge v10, v1, :cond_7

    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    if-eq v14, v12, :cond_6

    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    check-cast v12, L۟/kc$f;

    iget-boolean v14, v12, L۟/kc$f;->ۥ:Z

    if-eqz v14, :cond_6

    iget v12, v12, L۟/kc$f;->ۥ۟:I

    and-int/lit8 v14, v12, 0x7

    and-int/lit8 v12, v12, 0x70

    const/4 v15, 0x1

    if-eq v14, v15, :cond_2

    const/4 v15, 0x3

    if-eq v14, v15, :cond_1

    const/4 v15, 0x5

    if-eq v14, v15, :cond_0

    move v14, v4

    goto :goto_2

    :cond_0
    sub-int v14, v2, v6

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    sub-int/2addr v14, v15

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    add-int/2addr v6, v15

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    add-int/2addr v14, v4

    goto :goto_2

    :cond_2
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    sub-int v14, v2, v14

    div-int/lit8 v14, v14, 0x2

    invoke-static {v14, v4}, Ljava/lang/Math;->max(II)I

    move-result v14

    :goto_1
    move/from16 v17, v14

    move v14, v4

    move/from16 v4, v17

    :goto_2
    const/16 v15, 0x10

    if-eq v12, v15, :cond_5

    const/16 v15, 0x30

    if-eq v12, v15, :cond_4

    const/16 v15, 0x50

    if-eq v12, v15, :cond_3

    move v12, v5

    goto :goto_4

    :cond_3
    sub-int v12, v3, v7

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    sub-int/2addr v12, v15

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    add-int/2addr v7, v15

    goto :goto_3

    :cond_4
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v12

    add-int/2addr v12, v5

    goto :goto_4

    :cond_5
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v12

    sub-int v12, v3, v12

    div-int/lit8 v12, v12, 0x2

    invoke-static {v12, v5}, Ljava/lang/Math;->max(II)I

    move-result v12

    :goto_3
    move/from16 v17, v12

    move v12, v5

    move/from16 v5, v17

    :goto_4
    add-int/2addr v4, v8

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    add-int/2addr v15, v4

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v16

    add-int v9, v16, v5

    invoke-virtual {v13, v4, v5, v15, v9}, Landroid/view/View;->layout(IIII)V

    add-int/lit8 v11, v11, 0x1

    move v5, v12

    move v4, v14

    :cond_6
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_7
    sub-int/2addr v2, v4

    sub-int/2addr v2, v6

    const/4 v6, 0x0

    :goto_5
    if-ge v6, v1, :cond_a

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v9

    if-eq v9, v12, :cond_9

    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, L۟/kc$f;

    iget-boolean v10, v9, L۟/kc$f;->ۥ:Z

    if-nez v10, :cond_9

    invoke-virtual {v0, v8}, L۟/kc;->ۥۣ۟(Landroid/view/View;)L۟/kc$e;

    move-result-object v10

    if-eqz v10, :cond_9

    int-to-float v13, v2

    iget v10, v10, L۟/kc$e;->ۥ۟ۡ:F

    mul-float/2addr v10, v13

    float-to-int v10, v10

    add-int/2addr v10, v4

    iget-boolean v14, v9, L۟/kc$f;->ۥ۟۠:Z

    if-eqz v14, :cond_8

    const/4 v14, 0x0

    iput-boolean v14, v9, L۟/kc$f;->ۥ۟۠:Z

    iget v9, v9, L۟/kc$f;->ۥ۟۟:F

    mul-float/2addr v13, v9

    float-to-int v9, v13

    const/high16 v13, 0x40000000    # 2.0f

    invoke-static {v9, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    sub-int v14, v3, v5

    sub-int/2addr v14, v7

    invoke-static {v14, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v13

    invoke-virtual {v8, v9, v13}, Landroid/view/View;->measure(II)V

    :cond_8
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    add-int/2addr v9, v10

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    add-int/2addr v13, v5

    invoke-virtual {v8, v10, v5, v9, v13}, Landroid/view/View;->layout(IIII)V

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_a
    iput v5, v0, L۟/kc;->ۥ۠:I

    sub-int/2addr v3, v7

    iput v3, v0, L۟/kc;->ۥ۠۟:I

    iput v11, v0, L۟/kc;->ۥۢۤ:I

    iget-boolean v1, v0, L۟/kc;->ۥۢۢ:Z

    if-eqz v1, :cond_b

    iget v1, v0, L۟/kc;->ۥ۟ۢ:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2, v2}, L۟/kc;->ۥ۠ۤ(IIZZ)V

    goto :goto_6

    :cond_b
    const/4 v2, 0x0

    :goto_6
    iput-boolean v2, v0, L۟/kc;->ۥۢۢ:Z

    return-void
.end method

.method public final onMeasure(II)V
    .locals 13

    const/4 v0, 0x0

    invoke-static {v0, p1}, Landroid/view/View;->getDefaultSize(II)I

    move-result p1

    invoke-static {v0, p2}, Landroid/view/View;->getDefaultSize(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    div-int/lit8 p2, p1, 0xa

    iget v1, p0, L۟/kc;->ۥۡ:I

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, L۟/kc;->ۥۡ۟:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    sub-int/2addr p2, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int/2addr p2, v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    move v2, v0

    :goto_0
    const/16 v3, 0x8

    const/4 v4, 0x1

    const/high16 v5, 0x40000000    # 2.0f

    if-ge v2, v1, :cond_c

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-eq v7, v3, :cond_b

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, L۟/kc$f;

    if-eqz v3, :cond_b

    iget-boolean v7, v3, L۟/kc$f;->ۥ:Z

    if-eqz v7, :cond_b

    iget v7, v3, L۟/kc$f;->ۥ۟:I

    and-int/lit8 v8, v7, 0x7

    and-int/lit8 v7, v7, 0x70

    const/16 v9, 0x30

    if-eq v7, v9, :cond_1

    const/16 v9, 0x50

    if-ne v7, v9, :cond_0

    goto :goto_1

    :cond_0
    move v7, v0

    goto :goto_2

    :cond_1
    :goto_1
    move v7, v4

    :goto_2
    const/4 v9, 0x3

    if-eq v8, v9, :cond_3

    const/4 v9, 0x5

    if-ne v8, v9, :cond_2

    goto :goto_3

    :cond_2
    move v4, v0

    :cond_3
    :goto_3
    const/high16 v8, -0x80000000

    if-eqz v7, :cond_4

    move v9, v8

    move v8, v5

    goto :goto_4

    :cond_4
    if-eqz v4, :cond_5

    move v9, v5

    goto :goto_4

    :cond_5
    move v9, v8

    :goto_4
    iget v10, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v11, -0x1

    const/4 v12, -0x2

    if-eq v10, v12, :cond_7

    if-eq v10, v11, :cond_6

    goto :goto_5

    :cond_6
    move v10, p1

    :goto_5
    move v8, v5

    goto :goto_6

    :cond_7
    move v10, p1

    :goto_6
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v3, v12, :cond_9

    if-eq v3, v11, :cond_8

    goto :goto_7

    :cond_8
    move v3, p2

    goto :goto_7

    :cond_9
    move v3, p2

    move v5, v9

    :goto_7
    invoke-static {v10, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    invoke-static {v3, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {v6, v8, v3}, Landroid/view/View;->measure(II)V

    if-eqz v7, :cond_a

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    sub-int/2addr p2, v3

    goto :goto_8

    :cond_a
    if-eqz v4, :cond_b

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    sub-int/2addr p1, v3

    :cond_b
    :goto_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_c
    invoke-static {p1, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    invoke-static {p2, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    iput p2, p0, L۟/kc;->ۥ۠ۢ:I

    iput-boolean v4, p0, L۟/kc;->ۥۣ۠:Z

    invoke-virtual {p0}, L۟/kc;->ۥ۠۠()V

    iput-boolean v0, p0, L۟/kc;->ۥۣ۠:Z

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    :goto_9
    if-ge v0, p2, :cond_f

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-eq v2, v3, :cond_e

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, L۟/kc$f;

    if-eqz v2, :cond_d

    iget-boolean v4, v2, L۟/kc$f;->ۥ:Z

    if-nez v4, :cond_e

    :cond_d
    int-to-float v4, p1

    iget v2, v2, L۟/kc$f;->ۥ۟۟:F

    mul-float/2addr v4, v2

    float-to-int v2, v4

    invoke-static {v2, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    iget v4, p0, L۟/kc;->ۥ۠ۢ:I

    invoke-virtual {v1, v2, v4}, Landroid/view/View;->measure(II)V

    :cond_e
    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_f
    return-void
.end method

.method public final onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 8

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    and-int/lit8 v1, p1, 0x2

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-eqz v1, :cond_0

    move v3, v0

    move v0, v2

    move v1, v4

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    move v1, v3

    :goto_0
    if-eq v0, v3, :cond_2

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {p0, v5}, L۟/kc;->ۥۣ۟(Landroid/view/View;)L۟/kc$e;

    move-result-object v6

    if-eqz v6, :cond_1

    iget v6, v6, L۟/kc$e;->ۥ۟:I

    iget v7, p0, L۟/kc;->ۥ۟ۢ:I

    if-ne v6, v7, :cond_1

    invoke-virtual {v5, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v5

    if-eqz v5, :cond_1

    return v4

    :cond_1
    add-int/2addr v0, v1

    goto :goto_0

    :cond_2
    return v2
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, L۟/kc$j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, L۟/kc$j;

    .line 10
    .line 11
    iget-object v0, p1, L۟/b;->ۥ:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 17
    .line 18
    iget p1, p1, L۟/kc$j;->ۥ۟۟:I

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {p0, p1, v1, v1, v0}, L۟/kc;->ۥ۠ۥ(IIZZ)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iput p1, p0, L۟/kc;->ۥۣ۟:I

    .line 29
    .line 30
    :goto_0
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, L۟/kc$j;

    invoke-direct {v1, v0}, L۟/kc$j;-><init>(Landroid/os/Parcelable;)V

    iget v0, p0, L۟/kc;->ۥ۟ۢ:I

    iput v0, v1, L۟/kc$j;->ۥ۟۟:I

    iget-object v0, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    iput-object v0, v1, L۟/kc$j;->ۥ۟۠:Landroid/os/Parcelable;

    :cond_0
    return-object v1
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    if-eq p1, p3, :cond_0

    iget p2, p0, L۟/kc;->ۥ۟ۧ:I

    invoke-virtual {p0, p1, p3, p2, p2}, L۟/kc;->ۥ۠ۢ(IIII)V

    :cond_0
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    iget-object v0, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 16
    .line 17
    if-eqz v0, :cond_13

    .line 18
    .line 19
    invoke-virtual {v0}, L۟/p7;->ۥ۟()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    goto/16 :goto_6

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, L۟/kc;->ۥۡۦ:Landroid/view/VelocityTracker;

    .line 28
    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, L۟/kc;->ۥۡۦ:Landroid/view/VelocityTracker;

    .line 36
    .line 37
    :cond_2
    iget-object v0, p0, L۟/kc;->ۥۡۦ:Landroid/view/VelocityTracker;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    and-int/lit16 v0, v0, 0xff

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    if-eqz v0, :cond_10

    .line 50
    .line 51
    const/4 v3, -0x1

    .line 52
    if-eq v0, v2, :cond_b

    .line 53
    .line 54
    const/4 v4, 0x2

    .line 55
    if-eq v0, v4, :cond_6

    .line 56
    .line 57
    const/4 v3, 0x3

    .line 58
    if-eq v0, v3, :cond_5

    .line 59
    .line 60
    const/4 v3, 0x5

    .line 61
    if-eq v0, v3, :cond_4

    .line 62
    .line 63
    const/4 v3, 0x6

    .line 64
    if-eq v0, v3, :cond_3

    .line 65
    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_3
    invoke-virtual {p0, p1}, L۟/kc;->ۥ۟ۧ(Landroid/view/MotionEvent;)V

    .line 69
    .line 70
    .line 71
    iget v0, p0, L۟/kc;->ۥۡۥ:I

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    iput p1, p0, L۟/kc;->ۥۡۡ:F

    .line 82
    .line 83
    goto/16 :goto_5

    .line 84
    .line 85
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    iput v3, p0, L۟/kc;->ۥۡۡ:F

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    goto/16 :goto_4

    .line 100
    .line 101
    :cond_5
    iget-boolean p1, p0, L۟/kc;->ۥ۠ۧ:Z

    .line 102
    .line 103
    if-eqz p1, :cond_11

    .line 104
    .line 105
    iget p1, p0, L۟/kc;->ۥ۟ۢ:I

    .line 106
    .line 107
    invoke-virtual {p0, p1, v1, v2, v1}, L۟/kc;->ۥ۠ۤ(IIZZ)V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_3

    .line 111
    .line 112
    :cond_6
    iget-boolean v0, p0, L۟/kc;->ۥ۠ۧ:Z

    .line 113
    .line 114
    if-nez v0, :cond_a

    .line 115
    .line 116
    iget v0, p0, L۟/kc;->ۥۡۥ:I

    .line 117
    .line 118
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-ne v0, v3, :cond_7

    .line 123
    .line 124
    goto/16 :goto_3

    .line 125
    .line 126
    :cond_7
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    iget v4, p0, L۟/kc;->ۥۡۡ:F

    .line 131
    .line 132
    sub-float v4, v3, v4

    .line 133
    .line 134
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    iget v5, p0, L۟/kc;->ۥۡۢ:F

    .line 143
    .line 144
    sub-float v5, v0, v5

    .line 145
    .line 146
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    iget v6, p0, L۟/kc;->ۥۡ۠:I

    .line 151
    .line 152
    int-to-float v6, v6

    .line 153
    cmpl-float v6, v4, v6

    .line 154
    .line 155
    if-lez v6, :cond_a

    .line 156
    .line 157
    cmpl-float v4, v4, v5

    .line 158
    .line 159
    if-lez v4, :cond_a

    .line 160
    .line 161
    iput-boolean v2, p0, L۟/kc;->ۥ۠ۧ:Z

    .line 162
    .line 163
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    if-eqz v4, :cond_8

    .line 168
    .line 169
    invoke-interface {v4, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 170
    .line 171
    .line 172
    :cond_8
    iget v4, p0, L۟/kc;->ۥۣۡ:F

    .line 173
    .line 174
    sub-float/2addr v3, v4

    .line 175
    const/4 v5, 0x0

    .line 176
    cmpl-float v3, v3, v5

    .line 177
    .line 178
    if-lez v3, :cond_9

    .line 179
    .line 180
    iget v3, p0, L۟/kc;->ۥۡ۠:I

    .line 181
    .line 182
    int-to-float v3, v3

    .line 183
    add-float/2addr v4, v3

    .line 184
    goto :goto_0

    .line 185
    :cond_9
    iget v3, p0, L۟/kc;->ۥۡ۠:I

    .line 186
    .line 187
    int-to-float v3, v3

    .line 188
    sub-float/2addr v4, v3

    .line 189
    :goto_0
    iput v4, p0, L۟/kc;->ۥۡۡ:F

    .line 190
    .line 191
    iput v0, p0, L۟/kc;->ۥۡۢ:F

    .line 192
    .line 193
    invoke-virtual {p0, v2}, L۟/kc;->setScrollState(I)V

    .line 194
    .line 195
    .line 196
    invoke-direct {p0, v2}, L۟/kc;->setScrollingCacheEnabled(Z)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    if-eqz v0, :cond_a

    .line 204
    .line 205
    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 206
    .line 207
    .line 208
    :cond_a
    iget-boolean v0, p0, L۟/kc;->ۥ۠ۧ:Z

    .line 209
    .line 210
    if-eqz v0, :cond_11

    .line 211
    .line 212
    iget v0, p0, L۟/kc;->ۥۡۥ:I

    .line 213
    .line 214
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    invoke-virtual {p0, p1}, L۟/kc;->ۥ۠۟(F)Z

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    or-int/2addr v1, p1

    .line 227
    goto/16 :goto_5

    .line 228
    .line 229
    :cond_b
    iget-boolean v0, p0, L۟/kc;->ۥ۠ۧ:Z

    .line 230
    .line 231
    if-eqz v0, :cond_11

    .line 232
    .line 233
    iget-object v0, p0, L۟/kc;->ۥۡۦ:Landroid/view/VelocityTracker;

    .line 234
    .line 235
    const/16 v4, 0x3e8

    .line 236
    .line 237
    iget v5, p0, L۟/kc;->ۥۡۨ:I

    .line 238
    .line 239
    int-to-float v5, v5

    .line 240
    invoke-virtual {v0, v4, v5}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 241
    .line 242
    .line 243
    iget v4, p0, L۟/kc;->ۥۡۥ:I

    .line 244
    .line 245
    invoke-virtual {v0, v4}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    float-to-int v0, v0

    .line 250
    iput-boolean v2, p0, L۟/kc;->ۥ۠ۥ:Z

    .line 251
    .line 252
    invoke-direct {p0}, L۟/kc;->getClientWidth()I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    invoke-virtual {p0}, L۟/kc;->ۥ۟ۤ()L۟/kc$e;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    iget v7, p0, L۟/kc;->ۥ۟ۧ:I

    .line 265
    .line 266
    int-to-float v7, v7

    .line 267
    int-to-float v4, v4

    .line 268
    div-float/2addr v7, v4

    .line 269
    iget v8, v6, L۟/kc$e;->ۥ۟:I

    .line 270
    .line 271
    int-to-float v5, v5

    .line 272
    div-float/2addr v5, v4

    .line 273
    iget v4, v6, L۟/kc$e;->ۥ۟ۡ:F

    .line 274
    .line 275
    sub-float/2addr v5, v4

    .line 276
    iget v4, v6, L۟/kc$e;->ۥ۟۠:F

    .line 277
    .line 278
    add-float/2addr v4, v7

    .line 279
    div-float/2addr v5, v4

    .line 280
    iget v4, p0, L۟/kc;->ۥۡۥ:I

    .line 281
    .line 282
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 287
    .line 288
    .line 289
    move-result p1

    .line 290
    iget v4, p0, L۟/kc;->ۥۣۡ:F

    .line 291
    .line 292
    sub-float/2addr p1, v4

    .line 293
    float-to-int p1, p1

    .line 294
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    iget v4, p0, L۟/kc;->ۥۢ:I

    .line 299
    .line 300
    if-le p1, v4, :cond_d

    .line 301
    .line 302
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 303
    .line 304
    .line 305
    move-result p1

    .line 306
    iget v4, p0, L۟/kc;->ۥۡۧ:I

    .line 307
    .line 308
    if-le p1, v4, :cond_d

    .line 309
    .line 310
    if-lez v0, :cond_c

    .line 311
    .line 312
    goto :goto_2

    .line 313
    :cond_c
    add-int/lit8 v8, v8, 0x1

    .line 314
    .line 315
    goto :goto_2

    .line 316
    :cond_d
    iget p1, p0, L۟/kc;->ۥ۟ۢ:I

    .line 317
    .line 318
    if-lt v8, p1, :cond_e

    .line 319
    .line 320
    const p1, 0x3ecccccd    # 0.4f

    .line 321
    .line 322
    .line 323
    goto :goto_1

    .line 324
    :cond_e
    const p1, 0x3f19999a    # 0.6f

    .line 325
    .line 326
    .line 327
    :goto_1
    add-float/2addr v5, p1

    .line 328
    float-to-int p1, v5

    .line 329
    add-int/2addr v8, p1

    .line 330
    :goto_2
    iget-object p1, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 333
    .line 334
    .line 335
    move-result p1

    .line 336
    if-lez p1, :cond_f

    .line 337
    .line 338
    iget-object p1, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    .line 339
    .line 340
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    check-cast p1, L۟/kc$e;

    .line 345
    .line 346
    iget-object v1, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    .line 347
    .line 348
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    add-int/2addr v4, v3

    .line 353
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    check-cast v1, L۟/kc$e;

    .line 358
    .line 359
    iget p1, p1, L۟/kc$e;->ۥ۟:I

    .line 360
    .line 361
    iget v1, v1, L۟/kc$e;->ۥ۟:I

    .line 362
    .line 363
    invoke-static {v8, v1}, Ljava/lang/Math;->min(II)I

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 368
    .line 369
    .line 370
    move-result v8

    .line 371
    :cond_f
    invoke-virtual {p0, v8, v0, v2, v2}, L۟/kc;->ۥ۠ۥ(IIZZ)V

    .line 372
    .line 373
    .line 374
    :goto_3
    invoke-virtual {p0}, L۟/kc;->ۥۣ۠()Z

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    goto :goto_5

    .line 379
    :cond_10
    iget-object v0, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    .line 380
    .line 381
    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 382
    .line 383
    .line 384
    iput-boolean v1, p0, L۟/kc;->ۥ۠ۥ:Z

    .line 385
    .line 386
    invoke-virtual {p0}, L۟/kc;->ۥ۠۠()V

    .line 387
    .line 388
    .line 389
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    iput v0, p0, L۟/kc;->ۥۣۡ:F

    .line 394
    .line 395
    iput v0, p0, L۟/kc;->ۥۡۡ:F

    .line 396
    .line 397
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    iput v0, p0, L۟/kc;->ۥۡۤ:F

    .line 402
    .line 403
    iput v0, p0, L۟/kc;->ۥۡۢ:F

    .line 404
    .line 405
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 406
    .line 407
    .line 408
    move-result p1

    .line 409
    :goto_4
    iput p1, p0, L۟/kc;->ۥۡۥ:I

    .line 410
    .line 411
    :cond_11
    :goto_5
    if-eqz v1, :cond_12

    .line 412
    .line 413
    invoke-static {p0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 414
    .line 415
    .line 416
    :cond_12
    return v2

    .line 417
    :cond_13
    :goto_6
    return v1
.end method

.method public final removeView(Landroid/view/View;)V
    .locals 1

    iget-boolean v0, p0, L۟/kc;->ۥۣ۠:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :goto_0
    return-void
.end method

.method public setAdapter(L۟/p7;)V
    .locals 6

    .line 1
    iget-object v0, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object v0, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move v0, v2

    .line 15
    :goto_0
    iget-object v3, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ge v0, v3, :cond_0

    .line 22
    .line 23
    iget-object v3, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, L۟/kc$e;

    .line 30
    .line 31
    iget-object v4, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 32
    .line 33
    iget v5, v3, L۟/kc$e;->ۥ۟:I

    .line 34
    .line 35
    iget-object v3, v3, L۟/kc$e;->ۥ:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {v4, p0, v3}, L۟/p7;->ۥ(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 51
    .line 52
    .line 53
    move v0, v2

    .line 54
    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-ge v0, v3, :cond_2

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, L۟/kc$f;

    .line 69
    .line 70
    iget-boolean v3, v3, L۟/kc$f;->ۥ:Z

    .line 71
    .line 72
    if-nez v3, :cond_1

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v0, v0, -0x1

    .line 78
    .line 79
    :cond_1
    add-int/2addr v0, v1

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    iput v2, p0, L۟/kc;->ۥ۟ۢ:I

    .line 82
    .line 83
    invoke-virtual {p0, v2, v2}, Landroid/view/View;->scrollTo(II)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :catchall_0
    move-exception p1

    .line 88
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    throw p1

    .line 90
    :cond_3
    :goto_2
    iput-object p1, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 91
    .line 92
    iput v2, p0, L۟/kc;->ۥ:I

    .line 93
    .line 94
    if-eqz p1, :cond_7

    .line 95
    .line 96
    iget-object p1, p0, L۟/kc;->ۥ۟ۦ:L۟/kc$i;

    .line 97
    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    new-instance p1, L۟/kc$i;

    .line 101
    .line 102
    invoke-direct {p1, p0}, L۟/kc$i;-><init>(L۟/kc;)V

    .line 103
    .line 104
    .line 105
    iput-object p1, p0, L۟/kc;->ۥ۟ۦ:L۟/kc$i;

    .line 106
    .line 107
    :cond_4
    iget-object p1, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 108
    .line 109
    monitor-enter p1

    .line 110
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 111
    iput-boolean v2, p0, L۟/kc;->ۥ۠ۥ:Z

    .line 112
    .line 113
    iget-boolean p1, p0, L۟/kc;->ۥۢۢ:Z

    .line 114
    .line 115
    iput-boolean v1, p0, L۟/kc;->ۥۢۢ:Z

    .line 116
    .line 117
    iget-object v0, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 118
    .line 119
    invoke-virtual {v0}, L۟/p7;->ۥ۟()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    iput v0, p0, L۟/kc;->ۥ:I

    .line 124
    .line 125
    iget v0, p0, L۟/kc;->ۥۣ۟:I

    .line 126
    .line 127
    if-ltz v0, :cond_5

    .line 128
    .line 129
    iget-object p1, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget p1, p0, L۟/kc;->ۥۣ۟:I

    .line 135
    .line 136
    invoke-virtual {p0, p1, v2, v2, v1}, L۟/kc;->ۥ۠ۥ(IIZZ)V

    .line 137
    .line 138
    .line 139
    const/4 p1, -0x1

    .line 140
    iput p1, p0, L۟/kc;->ۥۣ۟:I

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_5
    if-nez p1, :cond_6

    .line 144
    .line 145
    invoke-virtual {p0}, L۟/kc;->ۥ۠۠()V

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :catchall_1
    move-exception v0

    .line 154
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 155
    throw v0

    .line 156
    :cond_7
    :goto_3
    return-void
.end method

.method public setCurrentItem(I)V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, L۟/kc;->ۥ۠ۥ:Z

    iget-boolean v1, p0, L۟/kc;->ۥۢۢ:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, p1, v0, v1, v0}, L۟/kc;->ۥ۠ۥ(IIZZ)V

    return-void
.end method

.method public setOffscreenPageLimit(I)V
    .locals 3

    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Requested offscreen page limit "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " too small; defaulting to "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "ViewPager"

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move p1, v0

    :cond_0
    iget v0, p0, L۟/kc;->ۥ۠ۦ:I

    if-eq p1, v0, :cond_1

    iput p1, p0, L۟/kc;->ۥ۠ۦ:I

    invoke-virtual {p0}, L۟/kc;->ۥ۠۠()V

    :cond_1
    return-void
.end method

.method public setOnPageChangeListener(L۟/kc$h;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, L۟/kc;->ۥۢۥ:L۟/kc$h;

    return-void
.end method

.method public setPageMargin(I)V
    .locals 2

    iget v0, p0, L۟/kc;->ۥ۟ۧ:I

    iput p1, p0, L۟/kc;->ۥ۟ۧ:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0, v1, v1, p1, v0}, L۟/kc;->ۥ۠ۢ(IIII)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPageMarginDrawable(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, L۟/kc;->setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, L۟/kc;->ۥ۟ۨ:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setScrollState(I)V
    .locals 1

    iget v0, p0, L۟/kc;->ۥۢۧ:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, L۟/kc;->ۥۢۧ:I

    iget-object p1, p0, L۟/kc;->ۥۢۥ:L۟/kc$h;

    if-eqz p1, :cond_1

    invoke-interface {p1}, L۟/kc$h;->ۥ()V

    :cond_1
    return-void
.end method

.method public final verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, L۟/kc;->ۥ۟ۨ:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final ۥ(II)L۟/kc$e;
    .locals 2

    new-instance v0, L۟/kc$e;

    invoke-direct {v0}, L۟/kc$e;-><init>()V

    iput p1, v0, L۟/kc$e;->ۥ۟:I

    iget-object v1, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    invoke-virtual {v1, p0, p1}, L۟/p7;->ۥ۟۟(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, L۟/kc$e;->ۥ:Ljava/lang/Object;

    iget-object p1, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, v0, L۟/kc$e;->ۥ۟۠:F

    if-ltz p2, :cond_1

    iget-object p1, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lt p2, p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {p1, p2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    return-object v0
.end method

.method public final ۥ۟(I)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, p0, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    if-eqz v0, :cond_4

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    :goto_0
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 17
    .line 18
    if-eqz v4, :cond_2

    .line 19
    .line 20
    if-ne v3, p0, :cond_1

    .line 21
    .line 22
    move v3, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-interface {v3}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move v3, v1

    .line 30
    :goto_1
    if-nez v3, :cond_4

    .line 31
    .line 32
    new-instance v3, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :goto_2
    instance-of v4, v0, Landroid/view/ViewGroup;

    .line 53
    .line 54
    if-eqz v4, :cond_3

    .line 55
    .line 56
    const-string v4, " => "

    .line 57
    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    const-string v0, "arrowScroll tried to find focus based on non-child current focused view "

    .line 78
    .line 79
    invoke-static {v0}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v3, "ViewPager"

    .line 95
    .line 96
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    :goto_3
    const/4 v0, 0x0

    .line 100
    :cond_4
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v3, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    const/16 v4, 0x42

    .line 109
    .line 110
    const/16 v5, 0x11

    .line 111
    .line 112
    if-eqz v3, :cond_7

    .line 113
    .line 114
    if-eq v3, v0, :cond_7

    .line 115
    .line 116
    if-ne p1, v5, :cond_5

    .line 117
    .line 118
    iget-object v4, p0, L۟/kc;->ۥ۟۠:Landroid/graphics/Rect;

    .line 119
    .line 120
    invoke-virtual {p0, v4, v3}, L۟/kc;->ۥ۟ۢ(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    iget v4, v4, Landroid/graphics/Rect;->left:I

    .line 125
    .line 126
    iget-object v5, p0, L۟/kc;->ۥ۟۠:Landroid/graphics/Rect;

    .line 127
    .line 128
    invoke-virtual {p0, v5, v0}, L۟/kc;->ۥ۟ۢ(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    iget v5, v5, Landroid/graphics/Rect;->left:I

    .line 133
    .line 134
    if-eqz v0, :cond_6

    .line 135
    .line 136
    if-lt v4, v5, :cond_6

    .line 137
    .line 138
    iget v0, p0, L۟/kc;->ۥ۟ۢ:I

    .line 139
    .line 140
    if-lez v0, :cond_b

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_5
    if-ne p1, v4, :cond_b

    .line 144
    .line 145
    iget-object v1, p0, L۟/kc;->ۥ۟۠:Landroid/graphics/Rect;

    .line 146
    .line 147
    invoke-virtual {p0, v1, v3}, L۟/kc;->ۥ۟ۢ(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    iget v1, v1, Landroid/graphics/Rect;->left:I

    .line 152
    .line 153
    iget-object v2, p0, L۟/kc;->ۥ۟۠:Landroid/graphics/Rect;

    .line 154
    .line 155
    invoke-virtual {p0, v2, v0}, L۟/kc;->ۥ۟ۢ(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    iget v2, v2, Landroid/graphics/Rect;->left:I

    .line 160
    .line 161
    if-eqz v0, :cond_6

    .line 162
    .line 163
    if-gt v1, v2, :cond_6

    .line 164
    .line 165
    invoke-virtual {p0}, L۟/kc;->ۥ۟ۨ()Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    goto :goto_4

    .line 170
    :cond_6
    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    :goto_4
    move v1, v0

    .line 175
    goto :goto_7

    .line 176
    :cond_7
    if-eq p1, v5, :cond_a

    .line 177
    .line 178
    if-ne p1, v2, :cond_8

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_8
    if-eq p1, v4, :cond_9

    .line 182
    .line 183
    const/4 v0, 0x2

    .line 184
    if-ne p1, v0, :cond_b

    .line 185
    .line 186
    :cond_9
    invoke-virtual {p0}, L۟/kc;->ۥ۟ۨ()Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    goto :goto_7

    .line 191
    :cond_a
    :goto_5
    iget v0, p0, L۟/kc;->ۥ۟ۢ:I

    .line 192
    .line 193
    if-lez v0, :cond_b

    .line 194
    .line 195
    :goto_6
    sub-int/2addr v0, v2

    .line 196
    iput-boolean v1, p0, L۟/kc;->ۥ۠ۥ:Z

    .line 197
    .line 198
    invoke-virtual {p0, v0, v1, v2, v1}, L۟/kc;->ۥ۠ۥ(IIZZ)V

    .line 199
    .line 200
    .line 201
    move v1, v2

    .line 202
    :cond_b
    :goto_7
    if-eqz v1, :cond_c

    .line 203
    .line 204
    invoke-static {p1}, Landroid/view/SoundEffectConstants;->getContantForFocusDirection(I)I

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    invoke-virtual {p0, p1}, Landroid/view/View;->playSoundEffect(I)V

    .line 209
    .line 210
    .line 211
    :cond_c
    return v1
.end method

.method public final ۥ۟۠(Z)V
    .locals 7

    iget v0, p0, L۟/kc;->ۥۢۧ:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-direct {p0, v2}, L۟/kc;->setScrollingCacheEnabled(Z)V

    iget-object v3, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual {v3}, Landroid/widget/Scroller;->isFinished()Z

    move-result v3

    xor-int/2addr v3, v1

    if-eqz v3, :cond_2

    iget-object v3, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual {v3}, Landroid/widget/Scroller;->abortAnimation()V

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v4

    iget-object v5, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual {v5}, Landroid/widget/Scroller;->getCurrX()I

    move-result v5

    iget-object v6, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual {v6}, Landroid/widget/Scroller;->getCurrY()I

    move-result v6

    if-ne v3, v5, :cond_1

    if-eq v4, v6, :cond_2

    :cond_1
    invoke-virtual {p0, v5, v6}, Landroid/view/View;->scrollTo(II)V

    if-eq v5, v3, :cond_2

    invoke-virtual {p0, v5}, L۟/kc;->ۥ۠(I)Z

    :cond_2
    iput-boolean v2, p0, L۟/kc;->ۥ۠ۥ:Z

    move v3, v2

    :goto_1
    iget-object v4, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    iget-object v4, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, L۟/kc$e;

    iget-boolean v5, v4, L۟/kc$e;->ۥ۟۟:Z

    if-eqz v5, :cond_3

    iput-boolean v2, v4, L۟/kc$e;->ۥ۟۟:Z

    move v0, v1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    if-eqz v0, :cond_6

    if-eqz p1, :cond_5

    iget-object p1, p0, L۟/kc;->ۥۢۦ:L۟/kc$c;

    invoke-static {p0, p1}, Landroidx/core/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_5
    iget-object p1, p0, L۟/kc;->ۥۢۦ:L۟/kc$c;

    invoke-virtual {p1}, L۟/kc$c;->run()V

    :cond_6
    :goto_2
    return-void
.end method

.method public final ۥ۟ۡ()V
    .locals 7

    .line 1
    iget-object v0, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 2
    .line 3
    invoke-virtual {v0}, L۟/p7;->ۥ۟()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, L۟/kc;->ۥ:I

    .line 8
    .line 9
    iget-object v1, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget v2, p0, L۟/kc;->ۥ۠ۦ:I

    .line 16
    .line 17
    mul-int/lit8 v2, v2, 0x2

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    add-int/2addr v2, v3

    .line 21
    const/4 v4, 0x0

    .line 22
    if-ge v1, v2, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ge v1, v0, :cond_0

    .line 31
    .line 32
    move v0, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v0, v4

    .line 35
    :goto_0
    iget v1, p0, L۟/kc;->ۥ۟ۢ:I

    .line 36
    .line 37
    move v2, v4

    .line 38
    :goto_1
    iget-object v5, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-ge v2, v5, :cond_1

    .line 45
    .line 46
    iget-object v5, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    check-cast v5, L۟/kc$e;

    .line 53
    .line 54
    iget-object v6, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 55
    .line 56
    iget-object v5, v5, L۟/kc$e;->ۥ:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    iget-object v2, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    .line 65
    .line 66
    sget-object v5, L۟/kc;->ۥۣ:L۟/kc$a;

    .line 67
    .line 68
    invoke-static {v2, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 69
    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    move v2, v4

    .line 78
    :goto_2
    if-ge v2, v0, :cond_3

    .line 79
    .line 80
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    check-cast v5, L۟/kc$f;

    .line 89
    .line 90
    iget-boolean v6, v5, L۟/kc$f;->ۥ:Z

    .line 91
    .line 92
    if-nez v6, :cond_2

    .line 93
    .line 94
    const/4 v6, 0x0

    .line 95
    iput v6, v5, L۟/kc$f;->ۥ۟۟:F

    .line 96
    .line 97
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    invoke-virtual {p0, v1, v4, v4, v3}, L۟/kc;->ۥ۠ۥ(IIZZ)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 104
    .line 105
    .line 106
    :cond_4
    return-void
.end method

.method public final ۥ۟ۢ(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    :cond_0
    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p2, p2}, Landroid/graphics/Rect;->set(IIII)V

    return-object p1

    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->left:I

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->right:I

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    :goto_0
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    if-eq p2, p0, :cond_2

    check-cast p2, Landroid/view/ViewGroup;

    iget v0, p1, Landroid/graphics/Rect;->left:I

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p1, Landroid/graphics/Rect;->left:I

    iget v0, p1, Landroid/graphics/Rect;->right:I

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p1, Landroid/graphics/Rect;->right:I

    iget v0, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p1, Landroid/graphics/Rect;->top:I

    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method public final ۥۣ۟(Landroid/view/View;)L۟/kc$e;
    .locals 4

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, L۟/kc$e;

    iget-object v2, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    iget-object v3, v1, L۟/kc$e;->ۥ:Ljava/lang/Object;

    invoke-virtual {v2, p1, v3}, L۟/p7;->ۥ۟۠(Landroid/view/View;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۥ۟ۤ()L۟/kc$e;
    .locals 12

    invoke-direct {p0}, L۟/kc;->getClientWidth()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    int-to-float v2, v2

    int-to-float v3, v0

    div-float/2addr v2, v3

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-lez v0, :cond_1

    iget v3, p0, L۟/kc;->ۥ۟ۧ:I

    int-to-float v3, v3

    int-to-float v0, v0

    div-float/2addr v3, v0

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, 0x1

    move v8, v4

    move v7, v5

    move v9, v6

    move v5, v1

    :goto_2
    iget-object v10, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v8, v10, :cond_7

    iget-object v10, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, L۟/kc$e;

    if-nez v9, :cond_2

    iget v11, v10, L۟/kc$e;->ۥ۟:I

    add-int/2addr v7, v6

    if-eq v11, v7, :cond_2

    iget-object v10, p0, L۟/kc;->ۥ۟۟:L۟/kc$e;

    add-float/2addr v1, v5

    add-float/2addr v1, v3

    iput v1, v10, L۟/kc$e;->ۥ۟ۡ:F

    iput v7, v10, L۟/kc$e;->ۥ۟:I

    iget-object v1, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v10, L۟/kc$e;->ۥ۟۠:F

    add-int/lit8 v8, v8, -0x1

    :cond_2
    iget v1, v10, L۟/kc$e;->ۥ۟ۡ:F

    iget v5, v10, L۟/kc$e;->ۥ۟۠:F

    add-float/2addr v5, v1

    add-float/2addr v5, v3

    if-nez v9, :cond_4

    cmpl-float v7, v2, v1

    if-ltz v7, :cond_3

    goto :goto_3

    :cond_3
    return-object v0

    :cond_4
    :goto_3
    cmpg-float v0, v2, v5

    if-ltz v0, :cond_6

    iget-object v0, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v6

    if-ne v8, v0, :cond_5

    goto :goto_4

    :cond_5
    iget v7, v10, L۟/kc$e;->ۥ۟:I

    iget v5, v10, L۟/kc$e;->ۥ۟۠:F

    add-int/lit8 v8, v8, 0x1

    move v9, v4

    move-object v0, v10

    goto :goto_2

    :cond_6
    :goto_4
    return-object v10

    :cond_7
    return-object v0
.end method

.method public final ۥ۟ۥ(I)L۟/kc$e;
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, L۟/kc$e;

    iget v2, v1, L۟/kc$e;->ۥ۟:I

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۥ۟ۦ(IFI)V
    .locals 8

    .line 1
    iget p1, p0, L۟/kc;->ۥۢۤ:I

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    if-lez p1, :cond_5

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    if-ge v3, v2, :cond_5

    .line 28
    .line 29
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, L۟/kc$f;

    .line 38
    .line 39
    iget-boolean v6, v5, L۟/kc$f;->ۥ:Z

    .line 40
    .line 41
    if-nez v6, :cond_0

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_0
    iget v5, v5, L۟/kc$f;->ۥ۟:I

    .line 45
    .line 46
    and-int/lit8 v5, v5, 0x7

    .line 47
    .line 48
    if-eq v5, p2, :cond_3

    .line 49
    .line 50
    const/4 v6, 0x3

    .line 51
    if-eq v5, v6, :cond_2

    .line 52
    .line 53
    const/4 v6, 0x5

    .line 54
    if-eq v5, v6, :cond_1

    .line 55
    .line 56
    move v5, p3

    .line 57
    goto :goto_2

    .line 58
    :cond_1
    sub-int v5, v1, v0

    .line 59
    .line 60
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    sub-int/2addr v5, v6

    .line 65
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    add-int/2addr v0, v6

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    add-int/2addr v5, p3

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    sub-int v5, v1, v5

    .line 82
    .line 83
    div-int/lit8 v5, v5, 0x2

    .line 84
    .line 85
    invoke-static {v5, p3}, Ljava/lang/Math;->max(II)I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    :goto_1
    move v7, v5

    .line 90
    move v5, p3

    .line 91
    move p3, v7

    .line 92
    :goto_2
    add-int/2addr p3, p1

    .line 93
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    sub-int/2addr p3, v6

    .line 98
    if-eqz p3, :cond_4

    .line 99
    .line 100
    invoke-virtual {v4, p3}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 101
    .line 102
    .line 103
    :cond_4
    move p3, v5

    .line 104
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_5
    iget-object p1, p0, L۟/kc;->ۥۢۥ:L۟/kc$h;

    .line 108
    .line 109
    if-eqz p1, :cond_6

    .line 110
    .line 111
    invoke-interface {p1}, L۟/kc$h;->ۥ۟()V

    .line 112
    .line 113
    .line 114
    :cond_6
    iput-boolean p2, p0, L۟/kc;->ۥۣۢ:Z

    .line 115
    .line 116
    return-void
.end method

.method public final ۥ۟ۧ(Landroid/view/MotionEvent;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iget v2, p0, L۟/kc;->ۥۡۥ:I

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    iput v1, p0, L۟/kc;->ۥۡۡ:F

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, L۟/kc;->ۥۡۥ:I

    iget-object p1, p0, L۟/kc;->ۥۡۦ:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    :cond_1
    return-void
.end method

.method public final ۥ۟ۨ()Z
    .locals 4

    .line 1
    iget-object v0, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v2, p0, L۟/kc;->ۥ۟ۢ:I

    .line 7
    .line 8
    invoke-virtual {v0}, L۟/p7;->ۥ۟()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v3, 0x1

    .line 13
    sub-int/2addr v0, v3

    .line 14
    if-ge v2, v0, :cond_0

    .line 15
    .line 16
    iget v0, p0, L۟/kc;->ۥ۟ۢ:I

    .line 17
    .line 18
    add-int/2addr v0, v3

    .line 19
    iput-boolean v1, p0, L۟/kc;->ۥ۠ۥ:Z

    .line 20
    .line 21
    invoke-virtual {p0, v0, v1, v3, v1}, L۟/kc;->ۥ۠ۥ(IIZZ)V

    .line 22
    .line 23
    .line 24
    return v3

    .line 25
    :cond_0
    return v1
.end method

.method public final ۥ۠(I)Z
    .locals 7

    iget-object v0, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-string v1, "onPageScrolled did not call superclass implementation"

    const/4 v2, 0x0

    if-nez v0, :cond_2

    iget-boolean p1, p0, L۟/kc;->ۥۢۢ:Z

    if-eqz p1, :cond_0

    return v2

    :cond_0
    iput-boolean v2, p0, L۟/kc;->ۥۣۢ:Z

    const/4 p1, 0x0

    invoke-virtual {p0, v2, p1, v2}, L۟/kc;->ۥ۟ۦ(IFI)V

    iget-boolean p1, p0, L۟/kc;->ۥۣۢ:Z

    if-eqz p1, :cond_1

    return v2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p0}, L۟/kc;->ۥ۟ۤ()L۟/kc$e;

    move-result-object v0

    invoke-direct {p0}, L۟/kc;->getClientWidth()I

    move-result v3

    iget v4, p0, L۟/kc;->ۥ۟ۧ:I

    add-int v5, v3, v4

    int-to-float v4, v4

    int-to-float v3, v3

    div-float/2addr v4, v3

    iget v6, v0, L۟/kc$e;->ۥ۟:I

    int-to-float p1, p1

    div-float/2addr p1, v3

    iget v3, v0, L۟/kc$e;->ۥ۟ۡ:F

    sub-float/2addr p1, v3

    iget v0, v0, L۟/kc$e;->ۥ۟۠:F

    add-float/2addr v0, v4

    div-float/2addr p1, v0

    int-to-float v0, v5

    mul-float/2addr v0, p1

    float-to-int v0, v0

    iput-boolean v2, p0, L۟/kc;->ۥۣۢ:Z

    invoke-virtual {p0, v6, p1, v0}, L۟/kc;->ۥ۟ۦ(IFI)V

    iget-boolean p1, p0, L۟/kc;->ۥۣۢ:Z

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۠۟(F)Z
    .locals 9

    iget v0, p0, L۟/kc;->ۥۡۡ:F

    sub-float/2addr v0, p1

    iput p1, p0, L۟/kc;->ۥۡۡ:F

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr p1, v0

    invoke-direct {p0}, L۟/kc;->getClientWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, L۟/kc;->ۥ۠۠:F

    mul-float/2addr v1, v0

    iget v2, p0, L۟/kc;->ۥ۠ۡ:F

    mul-float/2addr v2, v0

    iget-object v3, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, L۟/kc$e;

    iget-object v5, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x1

    sub-int/2addr v6, v7

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, L۟/kc$e;

    iget v6, v3, L۟/kc$e;->ۥ۟:I

    if-eqz v6, :cond_0

    iget v1, v3, L۟/kc$e;->ۥ۟ۡ:F

    mul-float/2addr v1, v0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v7

    :goto_0
    iget v6, v5, L۟/kc$e;->ۥ۟:I

    iget-object v8, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    invoke-virtual {v8}, L۟/p7;->ۥ۟()I

    move-result v8

    sub-int/2addr v8, v7

    if-eq v6, v8, :cond_1

    iget v2, v5, L۟/kc$e;->ۥ۟ۡ:F

    mul-float/2addr v2, v0

    move v5, v4

    goto :goto_1

    :cond_1
    move v5, v7

    :goto_1
    cmpg-float v6, p1, v1

    if-gez v6, :cond_3

    if-eqz v3, :cond_2

    sub-float p1, v1, p1

    iget-object v2, p0, L۟/kc;->ۥۢ۠:Landroid/widget/EdgeEffect;

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    div-float/2addr p1, v0

    invoke-virtual {v2, p1}, Landroid/widget/EdgeEffect;->onPull(F)V

    move v4, v7

    :cond_2
    move p1, v1

    goto :goto_2

    :cond_3
    cmpl-float v1, p1, v2

    if-lez v1, :cond_5

    if-eqz v5, :cond_4

    sub-float/2addr p1, v2

    iget-object v1, p0, L۟/kc;->ۥۢۡ:Landroid/widget/EdgeEffect;

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    div-float/2addr p1, v0

    invoke-virtual {v1, p1}, Landroid/widget/EdgeEffect;->onPull(F)V

    move v4, v7

    :cond_4
    move p1, v2

    :cond_5
    :goto_2
    iget v0, p0, L۟/kc;->ۥۡۡ:F

    float-to-int v1, p1

    int-to-float v2, v1

    sub-float/2addr p1, v2

    add-float/2addr p1, v0

    iput p1, p0, L۟/kc;->ۥۡۡ:F

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p1

    invoke-virtual {p0, v1, p1}, Landroid/view/View;->scrollTo(II)V

    invoke-virtual {p0, v1}, L۟/kc;->ۥ۠(I)Z

    return v4
.end method

.method public final ۥ۠۠()V
    .locals 1

    iget v0, p0, L۟/kc;->ۥ۟ۢ:I

    invoke-virtual {p0, v0}, L۟/kc;->ۥ۠ۡ(I)V

    return-void
.end method

.method public final ۥ۠ۡ(I)V
    .locals 14

    iget v0, p0, L۟/kc;->ۥ۟ۢ:I

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, v0}, L۟/kc;->ۥ۟ۥ(I)L۟/kc$e;

    move-result-object v0

    iput p1, p0, L۟/kc;->ۥ۟ۢ:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object p1, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-boolean p1, p0, L۟/kc;->ۥ۠ۥ:Z

    if-eqz p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, L۟/kc;->ۥ۠ۦ:I

    iget v1, p0, L۟/kc;->ۥ۟ۢ:I

    sub-int/2addr v1, p1

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v3, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    invoke-virtual {v3}, L۟/p7;->ۥ۟()I

    move-result v3

    add-int/lit8 v4, v3, -0x1

    iget v5, p0, L۟/kc;->ۥ۟ۢ:I

    add-int/2addr v5, p1

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget v4, p0, L۟/kc;->ۥ:I

    if-ne v3, v4, :cond_2f

    :goto_1
    iget-object v4, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_5

    iget-object v4, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, L۟/kc$e;

    iget v5, v4, L۟/kc$e;->ۥ۟:I

    iget v6, p0, L۟/kc;->ۥ۟ۢ:I

    if-lt v5, v6, :cond_4

    if-ne v5, v6, :cond_5

    goto :goto_2

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_6

    if-lez v3, :cond_6

    iget v4, p0, L۟/kc;->ۥ۟ۢ:I

    invoke-virtual {p0, v4, v2}, L۟/kc;->ۥ(II)L۟/kc$e;

    move-result-object v4

    :cond_6
    const/4 v5, 0x0

    if-eqz v4, :cond_26

    add-int/lit8 v6, v2, -0x1

    if-ltz v6, :cond_7

    iget-object v7, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, L۟/kc$e;

    goto :goto_3

    :cond_7
    const/4 v7, 0x0

    :goto_3
    invoke-direct {p0}, L۟/kc;->getClientWidth()I

    move-result v8

    const/high16 v9, 0x40000000    # 2.0f

    if-gtz v8, :cond_8

    move v11, v5

    goto :goto_4

    :cond_8
    iget v10, v4, L۟/kc$e;->ۥ۟۠:F

    sub-float v10, v9, v10

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v11

    int-to-float v11, v11

    int-to-float v12, v8

    div-float/2addr v11, v12

    add-float/2addr v11, v10

    :goto_4
    iget v10, p0, L۟/kc;->ۥ۟ۢ:I

    add-int/lit8 v10, v10, -0x1

    move v12, v5

    :goto_5
    if-ltz v10, :cond_e

    cmpl-float v13, v12, v11

    if-ltz v13, :cond_a

    if-ge v10, v1, :cond_a

    if-nez v7, :cond_9

    goto :goto_8

    :cond_9
    iget v13, v7, L۟/kc$e;->ۥ۟:I

    if-ne v10, v13, :cond_d

    iget-boolean v13, v7, L۟/kc$e;->ۥ۟۟:Z

    if-nez v13, :cond_d

    iget-object v13, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iget-object v13, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    iget-object v7, v7, L۟/kc$e;->ۥ:Ljava/lang/Object;

    invoke-virtual {v13, p0, v7}, L۟/p7;->ۥ(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    add-int/lit8 v6, v6, -0x1

    add-int/lit8 v2, v2, -0x1

    if-ltz v6, :cond_c

    goto :goto_6

    :cond_a
    if-eqz v7, :cond_b

    iget v13, v7, L۟/kc$e;->ۥ۟:I

    if-ne v10, v13, :cond_b

    iget v7, v7, L۟/kc$e;->ۥ۟۠:F

    add-float/2addr v12, v7

    add-int/lit8 v6, v6, -0x1

    if-ltz v6, :cond_c

    goto :goto_6

    :cond_b
    add-int/lit8 v7, v6, 0x1

    invoke-virtual {p0, v10, v7}, L۟/kc;->ۥ(II)L۟/kc$e;

    move-result-object v7

    iget v7, v7, L۟/kc$e;->ۥ۟۠:F

    add-float/2addr v12, v7

    add-int/lit8 v2, v2, 0x1

    if-ltz v6, :cond_c

    :goto_6
    iget-object v7, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, L۟/kc$e;

    goto :goto_7

    :cond_c
    const/4 v7, 0x0

    :cond_d
    :goto_7
    add-int/lit8 v10, v10, -0x1

    goto :goto_5

    :cond_e
    :goto_8
    iget v1, v4, L۟/kc$e;->ۥ۟۠:F

    add-int/lit8 v6, v2, 0x1

    cmpg-float v7, v1, v9

    if-gez v7, :cond_16

    iget-object v7, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v6, v7, :cond_f

    iget-object v7, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, L۟/kc$e;

    goto :goto_9

    :cond_f
    const/4 v7, 0x0

    :goto_9
    if-gtz v8, :cond_10

    move v10, v5

    goto :goto_a

    :cond_10
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v10

    int-to-float v10, v10

    int-to-float v8, v8

    div-float/2addr v10, v8

    add-float/2addr v10, v9

    :goto_a
    iget v8, p0, L۟/kc;->ۥ۟ۢ:I

    add-int/lit8 v8, v8, 0x1

    move v9, v6

    :goto_b
    if-ge v8, v3, :cond_16

    cmpl-float v11, v1, v10

    if-ltz v11, :cond_12

    if-le v8, p1, :cond_12

    if-nez v7, :cond_11

    goto :goto_e

    :cond_11
    iget v11, v7, L۟/kc$e;->ۥ۟:I

    if-ne v8, v11, :cond_15

    iget-boolean v11, v7, L۟/kc$e;->ۥ۟۟:Z

    if-nez v11, :cond_15

    iget-object v11, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iget-object v11, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    iget-object v7, v7, L۟/kc$e;->ۥ:Ljava/lang/Object;

    invoke-virtual {v11, p0, v7}, L۟/p7;->ۥ(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    iget-object v7, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v9, v7, :cond_14

    goto :goto_c

    :cond_12
    if-eqz v7, :cond_13

    iget v11, v7, L۟/kc$e;->ۥ۟:I

    if-ne v8, v11, :cond_13

    iget v7, v7, L۟/kc$e;->ۥ۟۠:F

    add-float/2addr v1, v7

    add-int/lit8 v9, v9, 0x1

    iget-object v7, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v9, v7, :cond_14

    goto :goto_c

    :cond_13
    invoke-virtual {p0, v8, v9}, L۟/kc;->ۥ(II)L۟/kc$e;

    move-result-object v7

    add-int/lit8 v9, v9, 0x1

    iget v7, v7, L۟/kc$e;->ۥ۟۠:F

    add-float/2addr v1, v7

    iget-object v7, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v9, v7, :cond_14

    :goto_c
    iget-object v7, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, L۟/kc$e;

    goto :goto_d

    :cond_14
    const/4 v7, 0x0

    :cond_15
    :goto_d
    add-int/lit8 v8, v8, 0x1

    goto :goto_b

    .line 1
    :cond_16
    :goto_e
    iget-object p1, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    invoke-virtual {p1}, L۟/p7;->ۥ۟()I

    move-result p1

    invoke-direct {p0}, L۟/kc;->getClientWidth()I

    move-result v1

    if-lez v1, :cond_17

    iget v3, p0, L۟/kc;->ۥ۟ۧ:I

    int-to-float v3, v3

    int-to-float v1, v1

    div-float/2addr v3, v1

    goto :goto_f

    :cond_17
    move v3, v5

    :goto_f
    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_1d

    iget v7, v0, L۟/kc$e;->ۥ۟:I

    iget v8, v4, L۟/kc$e;->ۥ۟:I

    if-ge v7, v8, :cond_1a

    iget v8, v0, L۟/kc$e;->ۥ۟ۡ:F

    iget v0, v0, L۟/kc$e;->ۥ۟۠:F

    add-float/2addr v8, v0

    add-float/2addr v8, v3

    const/4 v0, 0x0

    :goto_10
    add-int/lit8 v7, v7, 0x1

    iget v9, v4, L۟/kc$e;->ۥ۟:I

    if-gt v7, v9, :cond_1d

    iget-object v9, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v0, v9, :cond_1d

    :goto_11
    iget-object v9, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, L۟/kc$e;

    iget v10, v9, L۟/kc$e;->ۥ۟:I

    if-le v7, v10, :cond_18

    iget-object v10, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    if-ge v0, v10, :cond_18

    add-int/lit8 v0, v0, 0x1

    goto :goto_11

    :cond_18
    :goto_12
    iget v10, v9, L۟/kc$e;->ۥ۟:I

    if-ge v7, v10, :cond_19

    iget-object v10, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-float v10, v1, v3

    add-float/2addr v8, v10

    add-int/lit8 v7, v7, 0x1

    goto :goto_12

    :cond_19
    iput v8, v9, L۟/kc$e;->ۥ۟ۡ:F

    iget v9, v9, L۟/kc$e;->ۥ۟۠:F

    add-float/2addr v9, v3

    add-float/2addr v8, v9

    goto :goto_10

    :cond_1a
    if-le v7, v8, :cond_1d

    iget-object v8, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    iget v0, v0, L۟/kc$e;->ۥ۟ۡ:F

    :goto_13
    add-int/lit8 v7, v7, -0x1

    iget v9, v4, L۟/kc$e;->ۥ۟:I

    if-lt v7, v9, :cond_1d

    if-ltz v8, :cond_1d

    :goto_14
    iget-object v9, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, L۟/kc$e;

    iget v10, v9, L۟/kc$e;->ۥ۟:I

    if-ge v7, v10, :cond_1b

    if-lez v8, :cond_1b

    add-int/lit8 v8, v8, -0x1

    goto :goto_14

    :cond_1b
    :goto_15
    iget v10, v9, L۟/kc$e;->ۥ۟:I

    if-le v7, v10, :cond_1c

    iget-object v10, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-float v10, v1, v3

    sub-float/2addr v0, v10

    add-int/lit8 v7, v7, -0x1

    goto :goto_15

    :cond_1c
    iget v10, v9, L۟/kc$e;->ۥ۟۠:F

    add-float/2addr v10, v3

    sub-float/2addr v0, v10

    iput v0, v9, L۟/kc$e;->ۥ۟ۡ:F

    goto :goto_13

    :cond_1d
    iget-object v0, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v7, v4, L۟/kc$e;->ۥ۟ۡ:F

    iget v8, v4, L۟/kc$e;->ۥ۟:I

    add-int/lit8 v9, v8, -0x1

    if-nez v8, :cond_1e

    move v10, v7

    goto :goto_16

    :cond_1e
    const v10, -0x800001

    :goto_16
    iput v10, p0, L۟/kc;->ۥ۠۠:F

    add-int/lit8 p1, p1, -0x1

    if-ne v8, p1, :cond_1f

    iget v8, v4, L۟/kc$e;->ۥ۟۠:F

    add-float/2addr v8, v7

    sub-float/2addr v8, v1

    goto :goto_17

    :cond_1f
    const v8, 0x7f7fffff    # Float.MAX_VALUE

    :goto_17
    iput v8, p0, L۟/kc;->ۥ۠ۡ:F

    add-int/lit8 v2, v2, -0x1

    :goto_18
    if-ltz v2, :cond_22

    iget-object v8, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, L۟/kc$e;

    :goto_19
    iget v10, v8, L۟/kc$e;->ۥ۟:I

    if-le v9, v10, :cond_20

    iget-object v10, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    add-int/lit8 v9, v9, -0x1

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-float v10, v1, v3

    sub-float/2addr v7, v10

    goto :goto_19

    :cond_20
    iget v11, v8, L۟/kc$e;->ۥ۟۠:F

    add-float/2addr v11, v3

    sub-float/2addr v7, v11

    iput v7, v8, L۟/kc$e;->ۥ۟ۡ:F

    if-nez v10, :cond_21

    iput v7, p0, L۟/kc;->ۥ۠۠:F

    :cond_21
    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v9, v9, -0x1

    goto :goto_18

    :cond_22
    iget v2, v4, L۟/kc$e;->ۥ۟ۡ:F

    iget v7, v4, L۟/kc$e;->ۥ۟۠:F

    add-float/2addr v2, v7

    add-float/2addr v2, v3

    iget v4, v4, L۟/kc$e;->ۥ۟:I

    :goto_1a
    add-int/lit8 v4, v4, 0x1

    if-ge v6, v0, :cond_25

    iget-object v7, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, L۟/kc$e;

    :goto_1b
    iget v8, v7, L۟/kc$e;->ۥ۟:I

    if-ge v4, v8, :cond_23

    iget-object v8, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-float v8, v1, v3

    add-float/2addr v2, v8

    goto :goto_1b

    :cond_23
    if-ne v8, p1, :cond_24

    iget v8, v7, L۟/kc$e;->ۥ۟۠:F

    add-float/2addr v8, v2

    sub-float/2addr v8, v1

    iput v8, p0, L۟/kc;->ۥ۠ۡ:F

    :cond_24
    iput v2, v7, L۟/kc$e;->ۥ۟ۡ:F

    iget v7, v7, L۟/kc$e;->ۥ۟۠:F

    add-float/2addr v7, v3

    add-float/2addr v2, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_1a

    .line 2
    :cond_25
    iget-object p1, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_26
    iget-object p1, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 v0, 0x0

    :goto_1c
    if-ge v0, p1, :cond_28

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, L۟/kc$f;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, v2, L۟/kc$f;->ۥ:Z

    if-nez v3, :cond_27

    iget v3, v2, L۟/kc$f;->ۥ۟۟:F

    cmpl-float v3, v3, v5

    if-nez v3, :cond_27

    invoke-virtual {p0, v1}, L۟/kc;->ۥۣ۟(Landroid/view/View;)L۟/kc$e;

    move-result-object v1

    if-eqz v1, :cond_27

    iget v3, v1, L۟/kc$e;->ۥ۟۠:F

    iput v3, v2, L۟/kc$f;->ۥ۟۟:F

    iget v1, v1, L۟/kc$e;->ۥ۟:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_27
    add-int/lit8 v0, v0, 0x1

    goto :goto_1c

    :cond_28
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result p1

    if-eqz p1, :cond_2e

    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2b

    .line 3
    :goto_1d
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_2a

    if-eqz v0, :cond_2b

    instance-of p1, v0, Landroid/view/View;

    if-nez p1, :cond_29

    goto :goto_1e

    :cond_29
    move-object p1, v0

    check-cast p1, Landroid/view/View;

    goto :goto_1d

    :cond_2a
    invoke-virtual {p0, p1}, L۟/kc;->ۥۣ۟(Landroid/view/View;)L۟/kc$e;

    move-result-object p1

    goto :goto_1f

    :cond_2b
    :goto_1e
    const/4 p1, 0x0

    :goto_1f
    if-eqz p1, :cond_2c

    .line 4
    iget p1, p1, L۟/kc$e;->ۥ۟:I

    iget v0, p0, L۟/kc;->ۥ۟ۢ:I

    if-eq p1, v0, :cond_2e

    :cond_2c
    const/4 p1, 0x0

    :goto_20
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge p1, v0, :cond_2e

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, L۟/kc;->ۥۣ۟(Landroid/view/View;)L۟/kc$e;

    move-result-object v1

    if-eqz v1, :cond_2d

    iget v1, v1, L۟/kc$e;->ۥ۟:I

    iget v2, p0, L۟/kc;->ۥ۟ۢ:I

    if-ne v1, v2, :cond_2d

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/view/View;->requestFocus(I)Z

    move-result v0

    if-eqz v0, :cond_2d

    goto :goto_21

    :cond_2d
    add-int/lit8 p1, p1, 0x1

    goto :goto_20

    :cond_2e
    :goto_21
    return-void

    :cond_2f
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_22

    :catch_0
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    :goto_22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The application\'s PagerAdapter changed the adapter\'s contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "

    .line 5
    invoke-static {v1}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, L۟/kc;->ۥ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " Pager id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " Pager class: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " Problematic adapter: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۠ۢ(IIII)V
    .locals 1

    if-lez p2, :cond_1

    iget-object v0, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual {p0}, L۟/kc;->getCurrentItem()I

    move-result p2

    invoke-direct {p0}, L۟/kc;->getClientWidth()I

    move-result p3

    mul-int/2addr p2, p3

    invoke-virtual {p1, p2}, Landroid/widget/Scroller;->setFinalX(I)V

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int/2addr p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    sub-int/2addr p1, v0

    add-int/2addr p1, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p3

    sub-int/2addr p2, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p3

    sub-int/2addr p2, p3

    add-int/2addr p2, p4

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p3

    int-to-float p3, p3

    int-to-float p2, p2

    div-float/2addr p3, p2

    int-to-float p1, p1

    mul-float/2addr p3, p1

    float-to-int p1, p3

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->scrollTo(II)V

    goto :goto_2

    :cond_1
    iget p2, p0, L۟/kc;->ۥ۟ۢ:I

    invoke-virtual {p0, p2}, L۟/kc;->ۥ۟ۥ(I)L۟/kc$e;

    move-result-object p2

    if-eqz p2, :cond_2

    iget p2, p2, L۟/kc$e;->ۥ۟ۡ:F

    iget p3, p0, L۟/kc;->ۥ۠ۡ:F

    invoke-static {p2, p3}, Ljava/lang/Math;->min(FF)F

    move-result p2

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p3

    sub-int/2addr p1, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p3

    sub-int/2addr p1, p3

    int-to-float p1, p1

    mul-float/2addr p2, p1

    float-to-int p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p2

    if-eq p1, p2, :cond_3

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, L۟/kc;->ۥ۟۠(Z)V

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public final ۥۣ۠()Z
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, L۟/kc;->ۥۡۥ:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, L۟/kc;->ۥ۠ۧ:Z

    .line 6
    .line 7
    iput-boolean v0, p0, L۟/kc;->ۥ۠ۨ:Z

    .line 8
    .line 9
    iget-object v1, p0, L۟/kc;->ۥۡۦ:Landroid/view/VelocityTracker;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, p0, L۟/kc;->ۥۡۦ:Landroid/view/VelocityTracker;

    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, L۟/kc;->ۥۢ۠:Landroid/widget/EdgeEffect;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, L۟/kc;->ۥۢۡ:Landroid/widget/EdgeEffect;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, L۟/kc;->ۥۢ۠:Landroid/widget/EdgeEffect;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    iget-object v1, p0, L۟/kc;->ۥۢۡ:Landroid/widget/EdgeEffect;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    :cond_1
    const/4 v0, 0x1

    .line 46
    :cond_2
    return v0
.end method

.method public final ۥ۠ۤ(IIZZ)V
    .locals 10

    invoke-virtual {p0, p1}, L۟/kc;->ۥ۟ۥ(I)L۟/kc$e;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0}, L۟/kc;->getClientWidth()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, L۟/kc;->ۥ۠۠:F

    iget v0, v0, L۟/kc$e;->ۥ۟ۡ:F

    iget v4, p0, L۟/kc;->ۥ۠ۡ:F

    invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    mul-float/2addr v0, v2

    float-to-int v0, v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz p3, :cond_7

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p3

    if-nez p3, :cond_1

    invoke-direct {p0, v1}, L۟/kc;->setScrollingCacheEnabled(Z)V

    goto/16 :goto_5

    :cond_1
    iget-object p3, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    const/4 v2, 0x1

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Landroid/widget/Scroller;->isFinished()Z

    move-result p3

    if-nez p3, :cond_2

    move p3, v2

    goto :goto_1

    :cond_2
    move p3, v1

    :goto_1
    if-eqz p3, :cond_4

    iget-boolean p3, p0, L۟/kc;->ۥ۟ۥ:Z

    if-eqz p3, :cond_3

    iget-object p3, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual {p3}, Landroid/widget/Scroller;->getCurrX()I

    move-result p3

    goto :goto_2

    :cond_3
    iget-object p3, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual {p3}, Landroid/widget/Scroller;->getStartX()I

    move-result p3

    :goto_2
    iget-object v3, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual {v3}, Landroid/widget/Scroller;->abortAnimation()V

    invoke-direct {p0, v1}, L۟/kc;->setScrollingCacheEnabled(Z)V

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p3

    :goto_3
    move v4, p3

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v5

    sub-int v6, v0, v4

    rsub-int/lit8 v7, v5, 0x0

    if-nez v6, :cond_5

    if-nez v7, :cond_5

    invoke-virtual {p0, v1}, L۟/kc;->ۥ۟۠(Z)V

    invoke-virtual {p0}, L۟/kc;->ۥ۠۠()V

    invoke-virtual {p0, v1}, L۟/kc;->setScrollState(I)V

    goto :goto_5

    :cond_5
    invoke-direct {p0, v2}, L۟/kc;->setScrollingCacheEnabled(Z)V

    const/4 p3, 0x2

    invoke-virtual {p0, p3}, L۟/kc;->setScrollState(I)V

    invoke-direct {p0}, L۟/kc;->getClientWidth()I

    move-result p3

    div-int/lit8 v0, p3, 0x2

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v2, v3

    int-to-float p3, p3

    div-float/2addr v2, p3

    invoke-static {v3, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    int-to-float v0, v0

    const/high16 v8, 0x3f000000    # 0.5f

    sub-float/2addr v2, v8

    const v8, 0x3ef1463b

    mul-float/2addr v2, v8

    float-to-double v8, v2

    .line 2
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    double-to-float v2, v8

    mul-float/2addr v2, v0

    add-float/2addr v2, v0

    .line 3
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-lez p2, :cond_6

    const/high16 p3, 0x447a0000    # 1000.0f

    int-to-float p2, p2

    div-float/2addr v2, p2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    mul-float/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    mul-int/lit8 p2, p2, 0x4

    goto :goto_4

    :cond_6
    iget-object p2, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    mul-float/2addr p3, v3

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result p2

    int-to-float p2, p2

    iget v0, p0, L۟/kc;->ۥ۟ۧ:I

    int-to-float v0, v0

    add-float/2addr p3, v0

    div-float/2addr p2, p3

    add-float/2addr p2, v3

    const/high16 p3, 0x42c80000    # 100.0f

    mul-float/2addr p2, p3

    float-to-int p2, p2

    :goto_4
    const/16 p3, 0x258

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result v8

    iput-boolean v1, p0, L۟/kc;->ۥ۟ۥ:Z

    iget-object v3, p0, L۟/kc;->ۥ۟ۤ:Landroid/widget/Scroller;

    invoke-virtual/range {v3 .. v8}, Landroid/widget/Scroller;->startScroll(IIIII)V

    invoke-static {p0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    :goto_5
    if-eqz p4, :cond_9

    .line 4
    iget-object p2, p0, L۟/kc;->ۥۢۥ:L۟/kc$h;

    if-eqz p2, :cond_9

    invoke-interface {p2, p1}, L۟/kc$h;->ۥ۟۟(I)V

    goto :goto_6

    :cond_7
    if-eqz p4, :cond_8

    iget-object p2, p0, L۟/kc;->ۥۢۥ:L۟/kc$h;

    if-eqz p2, :cond_8

    invoke-interface {p2, p1}, L۟/kc$h;->ۥ۟۟(I)V

    .line 5
    :cond_8
    invoke-virtual {p0, v1}, L۟/kc;->ۥ۟۠(Z)V

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->scrollTo(II)V

    invoke-virtual {p0, v0}, L۟/kc;->ۥ۠(I)Z

    :cond_9
    :goto_6
    return-void
.end method

.method public final ۥ۠ۥ(IIZZ)V
    .locals 4

    .line 1
    iget-object v0, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_9

    .line 5
    .line 6
    invoke-virtual {v0}, L۟/p7;->ۥ۟()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_3

    .line 13
    .line 14
    :cond_0
    if-nez p4, :cond_1

    .line 15
    .line 16
    iget p4, p0, L۟/kc;->ۥ۟ۢ:I

    .line 17
    .line 18
    if-ne p4, p1, :cond_1

    .line 19
    .line 20
    iget-object p4, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    if-eqz p4, :cond_1

    .line 27
    .line 28
    invoke-direct {p0, v1}, L۟/kc;->setScrollingCacheEnabled(Z)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const/4 p4, 0x1

    .line 33
    if-gez p1, :cond_2

    .line 34
    .line 35
    move p1, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    iget-object v0, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 38
    .line 39
    invoke-virtual {v0}, L۟/p7;->ۥ۟()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-lt p1, v0, :cond_3

    .line 44
    .line 45
    iget-object p1, p0, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 46
    .line 47
    invoke-virtual {p1}, L۟/p7;->ۥ۟()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    sub-int/2addr p1, p4

    .line 52
    :cond_3
    :goto_0
    iget v0, p0, L۟/kc;->ۥ۠ۦ:I

    .line 53
    .line 54
    iget v2, p0, L۟/kc;->ۥ۟ۢ:I

    .line 55
    .line 56
    add-int v3, v2, v0

    .line 57
    .line 58
    if-gt p1, v3, :cond_4

    .line 59
    .line 60
    sub-int/2addr v2, v0

    .line 61
    if-ge p1, v2, :cond_5

    .line 62
    .line 63
    :cond_4
    move v0, v1

    .line 64
    :goto_1
    iget-object v2, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-ge v0, v2, :cond_5

    .line 71
    .line 72
    iget-object v2, p0, L۟/kc;->ۥ۟:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, L۟/kc$e;

    .line 79
    .line 80
    iput-boolean p4, v2, L۟/kc$e;->ۥ۟۟:Z

    .line 81
    .line 82
    add-int/lit8 v0, v0, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    iget v0, p0, L۟/kc;->ۥ۟ۢ:I

    .line 86
    .line 87
    if-eq v0, p1, :cond_6

    .line 88
    .line 89
    move v1, p4

    .line 90
    :cond_6
    iget-boolean p4, p0, L۟/kc;->ۥۢۢ:Z

    .line 91
    .line 92
    if-eqz p4, :cond_8

    .line 93
    .line 94
    iput p1, p0, L۟/kc;->ۥ۟ۢ:I

    .line 95
    .line 96
    if-eqz v1, :cond_7

    .line 97
    .line 98
    iget-object p2, p0, L۟/kc;->ۥۢۥ:L۟/kc$h;

    .line 99
    .line 100
    if-eqz p2, :cond_7

    .line 101
    .line 102
    invoke-interface {p2, p1}, L۟/kc$h;->ۥ۟۟(I)V

    .line 103
    .line 104
    .line 105
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_8
    invoke-virtual {p0, p1}, L۟/kc;->ۥ۠ۡ(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, p1, p2, p3, v1}, L۟/kc;->ۥ۠ۤ(IIZZ)V

    .line 113
    .line 114
    .line 115
    :goto_2
    return-void

    .line 116
    :cond_9
    :goto_3
    invoke-direct {p0, v1}, L۟/kc;->setScrollingCacheEnabled(Z)V

    .line 117
    .line 118
    .line 119
    return-void
.end method
