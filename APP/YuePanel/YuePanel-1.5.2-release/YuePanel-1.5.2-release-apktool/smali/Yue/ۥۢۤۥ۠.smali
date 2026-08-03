.class public LYue/ۥۢۤۥ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۤۥ۠$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۧ:Ljava/lang/String; = "ViewDragHelper"

.field public static final ۥ۟۟۠ۨ:I = -0x1

.field public static final ۥ۟۟ۡ:I = 0x0

.field public static final ۥ۟۟ۡ۟:I = 0x1

.field public static final ۥ۟۟ۡ۠:I = 0x2

.field public static final ۥ۟۟ۡۡ:I = 0x1

.field public static final ۥ۟۟ۡۢ:I = 0x2

.field public static final ۥۣ۟۟ۡ:I = 0x4

.field public static final ۥ۟۟ۡۤ:I = 0x8

.field public static final ۥ۟۟ۡۥ:I = 0xf

.field public static final ۥ۟۟ۡۦ:I = 0x1

.field public static final ۥ۟۟ۡۧ:I = 0x2

.field public static final ۥ۟۟ۡۨ:I = 0x3

.field public static final ۥ۟۟ۢ:I = 0x14

.field public static final ۥ۟۟ۢ۟:I = 0x100

.field public static final ۥ۟۟ۢ۠:I = 0x258

.field public static final ۥ۟۟ۢۡ:Landroid/view/animation/Interpolator;


# instance fields
.field public ۥ:I

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۟۟:[F

.field public ۥ۟۟۟۟:[F

.field public ۥ۟۟۟۠:[F

.field public ۥ۟۟۟ۡ:[F

.field public ۥ۟۟۟ۢ:[I

.field public ۥۣ۟۟۟:[I

.field public ۥ۟۟۟ۤ:[I

.field public ۥ۟۟۟ۥ:I

.field public ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

.field public ۥ۟۟۟ۧ:F

.field public ۥ۟۟۟ۨ:F

.field public ۥ۟۟۠:I

.field public final ۥ۟۟۠۟:I

.field public ۥ۟۟۠۠:I

.field public ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

.field public final ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

.field public ۥۣ۟۟۠:Landroid/view/View;

.field public ۥ۟۟۠ۤ:Z

.field public final ۥ۟۟۠ۥ:Landroid/view/ViewGroup;

.field public final ۥ۟۟۠ۦ:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۢۤۥ۠$ۥ;

    invoke-direct {v0}, LYue/ۥۢۤۥ۠$ۥ;-><init>()V

    sput-object v0, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۡ:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;LYue/ۥۢۤۥ۠$ۥ۟۟;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # LYue/ۥۢۤۥ۠$ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    new-instance v0, LYue/ۥۢۤۥ۠$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۢۤۥ۠$ۥ۟;-><init>(LYue/ۥۢۤۥ۠;)V

    iput-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۦ:Ljava/lang/Runnable;

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    iput-object p2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ:Landroid/view/ViewGroup;

    iput-object p3, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    const/high16 v0, 0x41a00000    # 20.0f

    mul-float/2addr p3, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p3, v0

    float-to-int p3, p3

    iput p3, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠۟:I

    iput p3, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠:I

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p3

    iput p3, p0, LYue/ۥۢۤۥ۠;->ۥ۟:I

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result p3

    int-to-float p3, p3

    iput p3, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۧ:F

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۨ:F

    new-instance p2, Landroid/widget/OverScroller;

    sget-object p3, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۡ:Landroid/view/animation/Interpolator;

    invoke-direct {p2, p1, p3}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object p2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Callback may not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Parent view may not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۥ۟۟۠۟(Landroid/view/ViewGroup;FLYue/ۥۢۤۥ۠$ۥ۟۟;)LYue/ۥۢۤۥ۠;
    .locals 1
    .param p0    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۤۥ۠$ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p2}, LYue/ۥۢۤۥ۠;->ۥ۟۟۠۠(Landroid/view/ViewGroup;LYue/ۥۢۤۥ۠$ۥ۟۟;)LYue/ۥۢۤۥ۠;

    move-result-object p0

    iget p2, p0, LYue/ۥۢۤۥ۠;->ۥ۟:I

    int-to-float p2, p2

    const/high16 v0, 0x3f800000    # 1.0f

    div-float/2addr v0, p1

    mul-float/2addr p2, v0

    float-to-int p1, p2

    iput p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟:I

    return-object p0
.end method

.method public static ۥ۟۟۠۠(Landroid/view/ViewGroup;LYue/ۥۢۤۥ۠$ۥ۟۟;)LYue/ۥۢۤۥ۠;
    .locals 2
    .param p0    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢۤۥ۠$ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    new-instance v0, LYue/ۥۢۤۥ۠;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0, p1}, LYue/ۥۢۤۥ۠;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;LYue/ۥۢۤۥ۠$ۥ۟۟;)V

    return-object v0
.end method


# virtual methods
.method public ۥ()V
    .locals 9

    invoke-virtual {p0}, LYue/ۥۢۤۥ۠;->ۥ۟۟()V

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v0

    iget-object v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v1

    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->abortAnimation()V

    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v5

    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v6

    iget-object v3, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    iget-object v4, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    sub-int v7, v5, v0

    sub-int v8, v6, v1

    invoke-virtual/range {v3 .. v8}, LYue/ۥۢۤۥ۠$ۥ۟۟;->onViewPositionChanged(Landroid/view/View;IIII)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۥ(I)V

    return-void
.end method

.method public ۥ۟(Landroid/view/View;ZIIII)Z
    .locals 13
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    move-object v0, p1

    instance-of v1, v0, Landroid/view/ViewGroup;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    sub-int/2addr v5, v2

    :goto_0
    if-ltz v5, :cond_1

    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    add-int v6, p5, v3

    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v8

    if-lt v6, v8, :cond_0

    invoke-virtual {v7}, Landroid/view/View;->getRight()I

    move-result v8

    if-ge v6, v8, :cond_0

    add-int v8, p6, v4

    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v9

    if-lt v8, v9, :cond_0

    invoke-virtual {v7}, Landroid/view/View;->getBottom()I

    move-result v9

    if-ge v8, v9, :cond_0

    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v9

    sub-int v11, v6, v9

    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v6

    sub-int v12, v8, v6

    const/4 v8, 0x1

    move-object v6, p0

    move/from16 v9, p3

    move/from16 v10, p4

    invoke-virtual/range {v6 .. v12}, LYue/ۥۢۤۥ۠;->ۥ۟(Landroid/view/View;ZIIII)Z

    move-result v6

    if-eqz v6, :cond_0

    return v2

    :cond_0
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    move/from16 v1, p3

    neg-int v1, v1

    invoke-virtual {p1, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v1

    if-nez v1, :cond_3

    move/from16 v1, p4

    neg-int v1, v1

    invoke-virtual {p1, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :cond_3
    :goto_1
    return v2
.end method

.method public ۥ۟۟()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    invoke-virtual {p0}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۥ()V

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟(Landroid/view/View;I)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ:Landroid/view/ViewGroup;

    if-ne v0, v1, :cond_0

    iput-object p1, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    iput p2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    invoke-virtual {v0, p1, p2}, LYue/ۥۢۤۥ۠$ۥ۟۟;->onViewCaptured(Landroid/view/View;I)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۥ(I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view ("

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ:Landroid/view/ViewGroup;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۟۟(FFII)Z
    .locals 3

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۢ:[I

    aget v0, v0, p3

    and-int/2addr v0, p4

    const/4 v1, 0x0

    if-ne v0, p4, :cond_2

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠۠:I

    and-int/2addr v0, p4

    if-eqz v0, :cond_2

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۤ:[I

    aget v0, v0, p3

    and-int/2addr v0, p4

    if-eq v0, p4, :cond_2

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۟:[I

    aget v0, v0, p3

    and-int/2addr v0, p4

    if-eq v0, p4, :cond_2

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟:I

    int-to-float v2, v0

    cmpg-float v2, p1, v2

    if-gtz v2, :cond_0

    int-to-float v0, v0

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f000000    # 0.5f

    mul-float/2addr p2, v0

    cmpg-float p2, p1, p2

    if-gez p2, :cond_1

    iget-object p2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    invoke-virtual {p2, p4}, LYue/ۥۢۤۥ۠$ۥ۟۟;->onEdgeLock(I)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۤ:[I

    aget p2, p1, p3

    or-int/2addr p2, p4

    aput p2, p1, p3

    return v1

    :cond_1
    iget-object p2, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۟:[I

    aget p2, p2, p3

    and-int/2addr p2, p4

    if-nez p2, :cond_2

    iget p2, p0, LYue/ۥۢۤۥ۠;->ۥ۟:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    :goto_0
    return v1
.end method

.method public ۥ۟۟۟۠(I)Z
    .locals 4

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟:[F

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, p1, v2}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۡ(II)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public ۥ۟۟۟ۡ(II)Z
    .locals 6

    invoke-virtual {p0, p2}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۡۨ(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    and-int/lit8 v0, p1, 0x1

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    const/4 v3, 0x2

    and-int/2addr p1, v3

    if-ne p1, v3, :cond_2

    move p1, v2

    goto :goto_1

    :cond_2
    move p1, v1

    :goto_1
    iget-object v3, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۠:[F

    aget v3, v3, p2

    iget-object v4, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟:[F

    aget v4, v4, p2

    sub-float/2addr v3, v4

    iget-object v4, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۡ:[F

    aget v4, v4, p2

    iget-object v5, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۟:[F

    aget p2, v5, p2

    sub-float/2addr v4, p2

    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    mul-float/2addr v3, v3

    mul-float/2addr v4, v4

    add-float/2addr v3, v4

    iget p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟:I

    mul-int/2addr p1, p1

    int-to-float p1, p1

    cmpl-float p1, v3, p1

    if-lez p1, :cond_3

    move v1, v2

    :cond_3
    return v1

    :cond_4
    if-eqz v0, :cond_6

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget p2, p0, LYue/ۥۢۤۥ۠;->ۥ۟:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_5

    move v1, v2

    :cond_5
    return v1

    :cond_6
    if-eqz p1, :cond_7

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget p2, p0, LYue/ۥۢۤۥ۠;->ۥ۟:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_7

    move v1, v2

    :cond_7
    return v1
.end method

.method public final ۥ۟۟۟ۢ(Landroid/view/View;FF)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    invoke-virtual {v1, p1}, LYue/ۥۢۤۥ۠$ۥ۟۟;->getViewHorizontalDragRange(Landroid/view/View;)I

    move-result v1

    const/4 v2, 0x1

    if-lez v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    iget-object v3, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    invoke-virtual {v3, p1}, LYue/ۥۢۤۥ۠$ۥ۟۟;->getViewVerticalDragRange(Landroid/view/View;)I

    move-result p1

    if-lez p1, :cond_2

    move p1, v2

    goto :goto_1

    :cond_2
    move p1, v0

    :goto_1
    if-eqz v1, :cond_4

    if-eqz p1, :cond_4

    mul-float/2addr p2, p2

    mul-float/2addr p3, p3

    add-float/2addr p2, p3

    iget p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟:I

    mul-int/2addr p1, p1

    int-to-float p1, p1

    cmpl-float p1, p2, p1

    if-lez p1, :cond_3

    move v0, v2

    :cond_3
    return v0

    :cond_4
    if-eqz v1, :cond_6

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget p2, p0, LYue/ۥۢۤۥ۠;->ۥ۟:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_5

    move v0, v2

    :cond_5
    return v0

    :cond_6
    if-eqz p1, :cond_7

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget p2, p0, LYue/ۥۢۤۥ۠;->ۥ۟:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_7

    move v0, v2

    :cond_7
    return v0
.end method

.method public final ۥۣ۟۟۟(FFF)F
    .locals 2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float p2, v0, p2

    const/4 v1, 0x0

    if-gez p2, :cond_0

    return v1

    :cond_0
    cmpl-float p2, v0, p3

    if-lez p2, :cond_2

    cmpl-float p1, p1, v1

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    neg-float p3, p3

    :goto_0
    return p3

    :cond_2
    return p1
.end method

.method public final ۥ۟۟۟ۤ(III)I
    .locals 1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    if-ge v0, p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-le v0, p3, :cond_2

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    neg-int p3, p3

    :goto_0
    return p3

    :cond_2
    return p1
.end method

.method public final ۥ۟۟۟ۥ()V
    .locals 2

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟:[F

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۟:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۠:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۡ:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۢ:[I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۟:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۤ:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iput v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۥ:I

    return-void
.end method

.method public final ۥ۟۟۟ۦ(I)V
    .locals 2

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟:[F

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۡۨ(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟:[F

    const/4 v1, 0x0

    aput v1, v0, p1

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۟:[F

    aput v1, v0, p1

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۠:[F

    aput v1, v0, p1

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۡ:[F

    aput v1, v0, p1

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۢ:[I

    const/4 v1, 0x0

    aput v1, v0, p1

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۟:[I

    aput v1, v0, p1

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۤ:[I

    aput v1, v0, p1

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۥ:I

    const/4 v1, 0x1

    shl-int p1, v1, p1

    not-int p1, p1

    and-int/2addr p1, v0

    iput p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۥ:I

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۥ۟۟۟ۧ(III)I
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v1, v0, 0x2

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    int-to-float v2, v2

    int-to-float v0, v0

    div-float/2addr v2, v0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    int-to-float v1, v1

    invoke-virtual {p0, v2}, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ(F)F

    move-result v2

    mul-float/2addr v2, v1

    add-float/2addr v1, v2

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-lez p2, :cond_1

    int-to-float p1, p2

    div-float/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 p2, 0x447a0000    # 1000.0f

    mul-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    mul-int/lit8 p1, p1, 0x4

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    int-to-float p2, p3

    div-float/2addr p1, p2

    add-float/2addr p1, v0

    const/high16 p2, 0x43800000    # 256.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    :goto_0
    const/16 p2, 0x258

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۟ۨ(Landroid/view/View;IIII)I
    .locals 6

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۨ:F

    float-to-int v0, v0

    iget v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۧ:F

    float-to-int v1, v1

    invoke-virtual {p0, p4, v0, v1}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۤ(III)I

    move-result p4

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۨ:F

    float-to-int v0, v0

    iget v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۧ:F

    float-to-int v1, v1

    invoke-virtual {p0, p5, v0, v1}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۤ(III)I

    move-result p5

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    move-result v2

    invoke-static {p5}, Ljava/lang/Math;->abs(I)I

    move-result v3

    add-int v4, v2, v3

    add-int v5, v0, v1

    if-eqz p4, :cond_0

    int-to-float v0, v2

    int-to-float v2, v4

    :goto_0
    div-float/2addr v0, v2

    goto :goto_1

    :cond_0
    int-to-float v0, v0

    int-to-float v2, v5

    goto :goto_0

    :goto_1
    if-eqz p5, :cond_1

    int-to-float v1, v3

    int-to-float v2, v4

    :goto_2
    div-float/2addr v1, v2

    goto :goto_3

    :cond_1
    int-to-float v1, v1

    int-to-float v2, v5

    goto :goto_2

    :goto_3
    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    invoke-virtual {v2, p1}, LYue/ۥۢۤۥ۠$ۥ۟۟;->getViewHorizontalDragRange(Landroid/view/View;)I

    move-result v2

    invoke-virtual {p0, p2, p4, v2}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۧ(III)I

    move-result p2

    iget-object p4, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    invoke-virtual {p4, p1}, LYue/ۥۢۤۥ۠$ۥ۟۟;->getViewVerticalDragRange(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p0, p3, p5, p1}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۧ(III)I

    move-result p1

    int-to-float p2, p2

    mul-float/2addr p2, v0

    int-to-float p1, p1

    mul-float/2addr p1, v1

    add-float/2addr p2, p1

    float-to-int p1, p2

    return p1
.end method

.method public ۥ۟۟۠(Z)Z
    .locals 11

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_6

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v0

    iget-object v3, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v3

    iget-object v4, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

    invoke-virtual {v4}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v10

    iget-object v4, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v4

    sub-int v8, v3, v4

    iget-object v4, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v4

    sub-int v9, v10, v4

    if-eqz v8, :cond_0

    iget-object v4, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-static {v4, v8}, LYue/ۥۢۤۤۦ;->ۥ۟۟ۨۨ(Landroid/view/View;I)V

    :cond_0
    if-eqz v9, :cond_1

    iget-object v4, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-static {v4, v9}, LYue/ۥۢۤۤۦ;->ۥ۟۠(Landroid/view/View;I)V

    :cond_1
    if-nez v8, :cond_2

    if-eqz v9, :cond_3

    :cond_2
    iget-object v4, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    iget-object v5, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    move v6, v3

    move v7, v10

    invoke-virtual/range {v4 .. v9}, LYue/ۥۢۤۥ۠$ۥ۟۟;->onViewPositionChanged(Landroid/view/View;IIII)V

    :cond_3
    if-eqz v0, :cond_4

    iget-object v4, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

    invoke-virtual {v4}, Landroid/widget/OverScroller;->getFinalX()I

    move-result v4

    if-ne v3, v4, :cond_4

    iget-object v3, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

    invoke-virtual {v3}, Landroid/widget/OverScroller;->getFinalY()I

    move-result v3

    if-ne v10, v3, :cond_4

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    move v0, v1

    :cond_4
    if-nez v0, :cond_6

    if-eqz p1, :cond_5

    iget-object p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ:Landroid/view/ViewGroup;

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۦ:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_5
    invoke-virtual {p0, v1}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۥ(I)V

    :cond_6
    :goto_0
    iget p1, p0, LYue/ۥۢۤۥ۠;->ۥ:I

    if-ne p1, v2, :cond_7

    const/4 v1, 0x1

    :cond_7
    return v1
.end method

.method public final ۥ۟۟۠ۡ(FF)V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۤ:Z

    iget-object v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {v1, v2, p1, p2}, LYue/ۥۢۤۥ۠$ۥ۟۟;->onViewReleased(Landroid/view/View;FF)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۤ:Z

    iget p2, p0, LYue/ۥۢۤۥ۠;->ۥ:I

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۥ(I)V

    :cond_0
    return-void
.end method

.method public final ۥ۟۟۠ۢ(F)F
    .locals 2

    const/high16 v0, 0x3f000000    # 0.5f

    sub-float/2addr p1, v0

    const v0, 0x3ef1463b

    mul-float/2addr p1, v0

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1
.end method

.method public final ۥۣ۟۟۠(IIII)V
    .locals 10

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    if-eqz p3, :cond_0

    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    iget-object v3, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {v2, v3, p1, p3}, LYue/ۥۢۤۥ۠$ۥ۟۟;->clampViewPositionHorizontal(Landroid/view/View;II)I

    move-result p1

    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    sub-int v3, p1, v0

    invoke-static {v2, v3}, LYue/ۥۢۤۤۦ;->ۥ۟۟ۨۨ(Landroid/view/View;I)V

    :cond_0
    move v6, p1

    if-eqz p4, :cond_1

    iget-object p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {p1, v2, p2, p4}, LYue/ۥۢۤۥ۠$ۥ۟۟;->clampViewPositionVertical(Landroid/view/View;II)I

    move-result p2

    iget-object p1, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    sub-int v2, p2, v1

    invoke-static {p1, v2}, LYue/ۥۢۤۤۦ;->ۥ۟۠(Landroid/view/View;I)V

    :cond_1
    move v7, p2

    if-nez p3, :cond_2

    if-eqz p4, :cond_3

    :cond_2
    sub-int v8, v6, v0

    sub-int v9, v7, v1

    iget-object v4, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    iget-object v5, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual/range {v4 .. v9}, LYue/ۥۢۤۥ۠$ۥ۟۟;->onViewPositionChanged(Landroid/view/View;IIII)V

    :cond_3
    return-void
.end method

.method public final ۥ۟۟۠ۤ(I)V
    .locals 9

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟:[F

    if-eqz v0, :cond_0

    array-length v1, v0

    if-gt v1, p1, :cond_2

    :cond_0
    add-int/lit8 p1, p1, 0x1

    new-array v1, p1, [F

    new-array v2, p1, [F

    new-array v3, p1, [F

    new-array v4, p1, [F

    new-array v5, p1, [I

    new-array v6, p1, [I

    new-array p1, p1, [I

    if-eqz v0, :cond_1

    array-length v7, v0

    const/4 v8, 0x0

    invoke-static {v0, v8, v1, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۟:[F

    array-length v7, v0

    invoke-static {v0, v8, v2, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۠:[F

    array-length v7, v0

    invoke-static {v0, v8, v3, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۡ:[F

    array-length v7, v0

    invoke-static {v0, v8, v4, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۢ:[I

    array-length v7, v0

    invoke-static {v0, v8, v5, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۟:[I

    array-length v7, v0

    invoke-static {v0, v8, v6, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۤ:[I

    array-length v7, v0

    invoke-static {v0, v8, p1, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    iput-object v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟:[F

    iput-object v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۟:[F

    iput-object v3, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۠:[F

    iput-object v4, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۡ:[F

    iput-object v5, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۢ:[I

    iput-object v6, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۟:[I

    iput-object p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۤ:[I

    :cond_2
    return-void
.end method

.method public ۥ۟۟۠ۥ(II)Landroid/view/View;
    .locals 3
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ:Landroid/view/ViewGroup;

    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    invoke-virtual {v2, v0}, LYue/ۥۢۤۥ۠$ۥ۟۟;->getOrderedChildIndex(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v2

    if-lt p1, v2, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v2

    if-ge p1, v2, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    if-lt p2, v2, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v2

    if-ge p2, v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟۠ۦ(IIII)V
    .locals 10

    iget-boolean v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۤ:Z

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v2

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v3

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

    iget v4, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    invoke-virtual {v0, v4}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v0

    float-to-int v4, v0

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

    iget v5, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    invoke-virtual {v0, v5}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v0

    float-to-int v5, v0

    move v6, p1

    move v7, p3

    move v8, p2

    move v9, p4

    invoke-virtual/range {v1 .. v9}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۥ(I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot flingCapturedView outside of a call to Callback#onViewReleased"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۠ۧ(IIII)Z
    .locals 10

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v2

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int/2addr p1, v2

    sub-int/2addr p2, v3

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    iget-object p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->abortAnimation()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۥ(I)V

    return p1

    :cond_0
    iget-object v5, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    move-object v4, p0

    move v6, p1

    move v7, p2

    move v8, p3

    move v9, p4

    invoke-virtual/range {v4 .. v9}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۨ(Landroid/view/View;IIII)I

    move-result v6

    iget-object v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ:Landroid/widget/OverScroller;

    move v4, p1

    move v5, p2

    invoke-virtual/range {v1 .. v6}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۥ(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public ۥ۟۟۠ۨ()I
    .locals 1

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    return v0
.end method

.method public ۥ۟۟ۡ()Landroid/view/View;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    return-object v0
.end method

.method public ۥ۟۟ۡ۟()I
    .locals 1
    .annotation build LYue/ۥۡۥۤۤ;
    .end annotation

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠۟:I

    return v0
.end method

.method public ۥ۟۟ۡ۠()I
    .locals 1
    .annotation build LYue/ۥۡۥۤۤ;
    .end annotation

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠:I

    return v0
.end method

.method public final ۥ۟۟ۡۡ(II)I
    .locals 3

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    iget v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠:I

    add-int/2addr v0, v1

    if-ge p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    iget v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠:I

    add-int/2addr v1, v2

    if-ge p2, v1, :cond_1

    or-int/lit8 v0, v0, 0x4

    :cond_1
    iget-object v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    iget v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠:I

    sub-int/2addr v1, v2

    if-le p1, v1, :cond_2

    or-int/lit8 v0, v0, 0x2

    :cond_2
    iget-object p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    iget v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠:I

    sub-int/2addr p1, v1

    if-le p2, p1, :cond_3

    or-int/lit8 v0, v0, 0x8

    :cond_3
    return v0
.end method

.method public ۥ۟۟ۡۢ()F
    .locals 1

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۨ:F

    return v0
.end method

.method public ۥۣ۟۟ۡ()I
    .locals 1
    .annotation build LYue/ۥۡۥۤۤ;
    .end annotation

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟:I

    return v0
.end method

.method public ۥ۟۟ۡۤ()I
    .locals 1

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ:I

    return v0
.end method

.method public ۥ۟۟ۡۥ(II)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {p0, v0, p1, p2}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢ۟(Landroid/view/View;II)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟ۡۦ(I)Z
    .locals 4

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۢ:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, p1, v2}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۡۧ(II)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public ۥ۟۟ۡۧ(II)Z
    .locals 1

    invoke-virtual {p0, p2}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۡۨ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۢ:[I

    aget p2, v0, p2

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟ۡۨ(I)Z
    .locals 2

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۥ:I

    const/4 v1, 0x1

    shl-int p1, v1, p1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final ۥ۟۟ۢ(I)Z
    .locals 2

    invoke-virtual {p0, p1}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۡۨ(I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ignoring pointerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ViewDragHelper"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public ۥ۟۟ۢ۟(Landroid/view/View;II)Z
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    if-lt p2, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    if-ge p2, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p2

    if-lt p3, p2, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    if-ge p3, p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public ۥ۟۟ۢ۠(Landroid/view/MotionEvent;)V
    .locals 9
    .param p1    # Landroid/view/MotionEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۤۥ۠;->ۥ۟۟()V

    :cond_0
    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

    if-nez v2, :cond_1

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v2

    iput-object v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

    :cond_1
    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

    invoke-virtual {v2, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    const/4 v2, 0x0

    if-eqz v0, :cond_14

    const/4 v3, 0x1

    if-eq v0, v3, :cond_12

    const/4 v4, 0x2

    if-eq v0, v4, :cond_b

    const/4 v4, 0x3

    if-eq v0, v4, :cond_9

    const/4 v4, 0x5

    if-eq v0, v4, :cond_7

    const/4 v4, 0x6

    if-eq v0, v4, :cond_2

    goto/16 :goto_6

    :cond_2
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iget v1, p0, LYue/ۥۢۤۥ۠;->ۥ:I

    if-ne v1, v3, :cond_6

    iget v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    :goto_0
    const/4 v3, -0x1

    if-ge v2, v1, :cond_5

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    iget v5, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    if-ne v4, v5, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    float-to-int v5, v5

    float-to-int v6, v6

    invoke-virtual {p0, v5, v6}, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ(II)Landroid/view/View;

    move-result-object v5

    iget-object v6, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    if-ne v5, v6, :cond_4

    invoke-virtual {p0, v6, v4}, LYue/ۥۢۤۥ۠;->ۥۣ۟۟ۡ(Landroid/view/View;I)Z

    move-result v4

    if-eqz v4, :cond_4

    iget p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    goto :goto_2

    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    move p1, v3

    :goto_2
    if-ne p1, v3, :cond_6

    invoke-virtual {p0}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۡ()V

    :cond_6
    invoke-virtual {p0, v0}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ(I)V

    goto/16 :goto_6

    :cond_7
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    invoke-virtual {p0, v2, p1, v0}, LYue/ۥۢۤۥ۠;->ۥۣ۟۟ۢ(FFI)V

    iget v1, p0, LYue/ۥۢۤۥ۠;->ۥ:I

    if-nez v1, :cond_8

    float-to-int v1, v2

    float-to-int p1, p1

    invoke-virtual {p0, v1, p1}, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ(II)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, LYue/ۥۢۤۥ۠;->ۥۣ۟۟ۡ(Landroid/view/View;I)Z

    iget-object p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۢ:[I

    aget p1, p1, v0

    iget v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠۠:I

    and-int v2, p1, v1

    if-eqz v2, :cond_15

    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    and-int/2addr p1, v1

    invoke-virtual {v2, p1, v0}, LYue/ۥۢۤۥ۠$ۥ۟۟;->onEdgeTouched(II)V

    goto/16 :goto_6

    :cond_8
    float-to-int v1, v2

    float-to-int p1, p1

    invoke-virtual {p0, v1, p1}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۡۥ(II)Z

    move-result p1

    if-eqz p1, :cond_15

    iget-object p1, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {p0, p1, v0}, LYue/ۥۢۤۥ۠;->ۥۣ۟۟ۡ(Landroid/view/View;I)Z

    goto/16 :goto_6

    :cond_9
    iget p1, p0, LYue/ۥۢۤۥ۠;->ۥ:I

    if-ne p1, v3, :cond_a

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ(FF)V

    :cond_a
    invoke-virtual {p0}, LYue/ۥۢۤۥ۠;->ۥ۟۟()V

    goto/16 :goto_6

    :cond_b
    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ:I

    if-ne v0, v3, :cond_d

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    invoke-virtual {p0, v0}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢ(I)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_6

    :cond_c
    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۠:[F

    iget v3, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    aget v2, v2, v3

    sub-float/2addr v1, v2

    float-to-int v1, v1

    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۡ:[F

    aget v2, v2, v3

    sub-float/2addr v0, v2

    float-to-int v0, v0

    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    add-int/2addr v2, v1

    iget-object v3, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {p0, v2, v3, v1, v0}, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠(IIII)V

    invoke-virtual {p0, p1}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۤ(Landroid/view/MotionEvent;)V

    goto/16 :goto_6

    :cond_d
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    :goto_3
    if-ge v2, v0, :cond_11

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    invoke-virtual {p0, v1}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢ(I)Z

    move-result v4

    if-nez v4, :cond_e

    goto :goto_4

    :cond_e
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v5

    iget-object v6, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟:[F

    aget v6, v6, v1

    sub-float v6, v4, v6

    iget-object v7, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۟:[F

    aget v7, v7, v1

    sub-float v7, v5, v7

    invoke-virtual {p0, v6, v7, v1}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۢ(FFI)V

    iget v8, p0, LYue/ۥۢۤۥ۠;->ۥ:I

    if-ne v8, v3, :cond_f

    goto :goto_5

    :cond_f
    float-to-int v4, v4

    float-to-int v5, v5

    invoke-virtual {p0, v4, v5}, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ(II)Landroid/view/View;

    move-result-object v4

    invoke-virtual {p0, v4, v6, v7}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۢ(Landroid/view/View;FF)Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-virtual {p0, v4, v1}, LYue/ۥۢۤۥ۠;->ۥۣ۟۟ۡ(Landroid/view/View;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_5

    :cond_10
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_11
    :goto_5
    invoke-virtual {p0, p1}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۤ(Landroid/view/MotionEvent;)V

    goto :goto_6

    :cond_12
    iget p1, p0, LYue/ۥۢۤۥ۠;->ۥ:I

    if-ne p1, v3, :cond_13

    invoke-virtual {p0}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۡ()V

    :cond_13
    invoke-virtual {p0}, LYue/ۥۢۤۥ۠;->ۥ۟۟()V

    goto :goto_6

    :cond_14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    float-to-int v2, v0

    float-to-int v3, v1

    invoke-virtual {p0, v2, v3}, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ(II)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0, v1, p1}, LYue/ۥۢۤۥ۠;->ۥۣ۟۟ۢ(FFI)V

    invoke-virtual {p0, v2, p1}, LYue/ۥۢۤۥ۠;->ۥۣ۟۟ۡ(Landroid/view/View;I)Z

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۢ:[I

    aget v0, v0, p1

    iget v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠۠:I

    and-int v2, v0, v1

    if-eqz v2, :cond_15

    iget-object v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    and-int/2addr v0, v1

    invoke-virtual {v2, v0, p1}, LYue/ۥۢۤۥ۠$ۥ۟۟;->onEdgeTouched(II)V

    :cond_15
    :goto_6
    return-void
.end method

.method public final ۥ۟۟ۢۡ()V
    .locals 4

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

    const/16 v1, 0x3e8

    iget v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۧ:F

    invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

    iget v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v0

    iget v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۨ:F

    iget v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۧ:F

    invoke-virtual {p0, v0, v1, v2}, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۟(FFF)F

    move-result v0

    iget-object v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

    iget v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v1

    iget v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۨ:F

    iget v3, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۧ:F

    invoke-virtual {p0, v1, v2, v3}, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۟(FFF)F

    move-result v1

    invoke-virtual {p0, v0, v1}, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۡ(FF)V

    return-void
.end method

.method public final ۥ۟۟ۢۢ(FFI)V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۟(FFII)Z

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p0, p2, p1, p3, v1}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۟(FFII)Z

    move-result v1

    if-eqz v1, :cond_0

    or-int/lit8 v0, v0, 0x4

    :cond_0
    const/4 v1, 0x2

    invoke-virtual {p0, p1, p2, p3, v1}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۟(FFII)Z

    move-result v1

    if-eqz v1, :cond_1

    or-int/lit8 v0, v0, 0x2

    :cond_1
    const/16 v1, 0x8

    invoke-virtual {p0, p2, p1, p3, v1}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۟(FFII)Z

    move-result p1

    if-eqz p1, :cond_2

    or-int/lit8 v0, v0, 0x8

    :cond_2
    if-eqz v0, :cond_3

    iget-object p1, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۟:[I

    aget p2, p1, p3

    or-int/2addr p2, v0

    aput p2, p1, p3

    iget-object p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    invoke-virtual {p1, v0, p3}, LYue/ۥۢۤۥ۠$ۥ۟۟;->onEdgeDragStarted(II)V

    :cond_3
    return-void
.end method

.method public final ۥۣ۟۟ۢ(FFI)V
    .locals 2

    invoke-virtual {p0, p3}, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۤ(I)V

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟:[F

    iget-object v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۠:[F

    aput p1, v1, p3

    aput p1, v0, p3

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۟:[F

    iget-object v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۡ:[F

    aput p2, v1, p3

    aput p2, v0, p3

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۢ:[I

    float-to-int p1, p1

    float-to-int p2, p2

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۡۡ(II)I

    move-result p1

    aput p1, v0, p3

    iget p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۥ:I

    const/4 p2, 0x1

    shl-int/2addr p2, p3

    or-int/2addr p1, p2

    iput p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۥ:I

    return-void
.end method

.method public final ۥ۟۟ۢۤ(Landroid/view/MotionEvent;)V
    .locals 6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    invoke-virtual {p0, v2}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢ(I)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v4

    iget-object v5, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۠:[F

    aput v3, v5, v2

    iget-object v3, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۡ:[F

    aput v4, v3, v2

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public ۥ۟۟ۢۥ(I)V
    .locals 2

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ:Landroid/view/ViewGroup;

    iget-object v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۦ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ:I

    if-eq v0, p1, :cond_0

    iput p1, p0, LYue/ۥۢۤۥ۠;->ۥ:I

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۢۤۥ۠$ۥ۟۟;->onViewDragStateChanged(I)V

    iget p1, p0, LYue/ۥۢۤۥ۠;->ۥ:I

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public ۥ۟۟ۢۦ(I)V
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation

        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param

    iput p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠:I

    return-void
.end method

.method public ۥ۟۟ۢۧ(I)V
    .locals 0

    iput p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠۠:I

    return-void
.end method

.method public ۥ۟۟ۢۨ(F)V
    .locals 0

    iput p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۨ:F

    return-void
.end method

.method public ۥۣ۟۟(II)Z
    .locals 3

    iget-boolean v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۤ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

    iget v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v0

    float-to-int v0, v0

    iget-object v1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

    iget v2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p0, p1, p2, v0, v1}, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۧ(IIII)Z

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥۣ۟۟۟(Landroid/view/MotionEvent;)Z
    .locals 16
    .param p1    # Landroid/view/MotionEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v3

    if-nez v2, :cond_0

    invoke-virtual/range {p0 .. p0}, LYue/ۥۢۤۥ۠;->ۥ۟۟()V

    :cond_0
    iget-object v4, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

    if-nez v4, :cond_1

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v4

    iput-object v4, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

    :cond_1
    iget-object v4, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ:Landroid/view/VelocityTracker;

    invoke-virtual {v4, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    const/4 v4, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_10

    if-eq v2, v6, :cond_f

    if-eq v2, v4, :cond_6

    const/4 v7, 0x3

    if-eq v2, v7, :cond_f

    const/4 v7, 0x5

    if-eq v2, v7, :cond_4

    const/4 v4, 0x6

    if-eq v2, v4, :cond_3

    :cond_2
    :goto_0
    const/4 v5, 0x0

    goto/16 :goto_5

    :cond_3
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    invoke-virtual {v0, v1}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۦ(I)V

    goto :goto_0

    :cond_4
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v7

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    invoke-virtual {v0, v7, v1, v2}, LYue/ۥۢۤۥ۠;->ۥۣ۟۟ۢ(FFI)V

    iget v3, v0, LYue/ۥۢۤۥ۠;->ۥ:I

    if-nez v3, :cond_5

    iget-object v1, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۢ:[I

    aget v1, v1, v2

    iget v3, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠۠:I

    and-int v4, v1, v3

    if-eqz v4, :cond_2

    iget-object v4, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    and-int/2addr v1, v3

    invoke-virtual {v4, v1, v2}, LYue/ۥۢۤۥ۠$ۥ۟۟;->onEdgeTouched(II)V

    goto :goto_0

    :cond_5
    if-ne v3, v4, :cond_2

    float-to-int v3, v7

    float-to-int v1, v1

    invoke-virtual {v0, v3, v1}, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ(II)Landroid/view/View;

    move-result-object v1

    iget-object v3, v0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    if-ne v1, v3, :cond_2

    invoke-virtual {v0, v1, v2}, LYue/ۥۢۤۥ۠;->ۥۣ۟۟ۡ(Landroid/view/View;I)Z

    goto :goto_0

    :cond_6
    iget-object v2, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟:[F

    if-eqz v2, :cond_2

    iget-object v2, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۟:[F

    if-nez v2, :cond_7

    goto :goto_0

    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_e

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    invoke-virtual {v0, v4}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢ(I)Z

    move-result v7

    if-nez v7, :cond_8

    goto/16 :goto_3

    :cond_8
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v7

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v8

    iget-object v9, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟:[F

    aget v9, v9, v4

    sub-float v9, v7, v9

    iget-object v10, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟۟:[F

    aget v10, v10, v4

    sub-float v10, v8, v10

    float-to-int v7, v7

    float-to-int v8, v8

    invoke-virtual {v0, v7, v8}, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ(II)Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_9

    invoke-virtual {v0, v7, v9, v10}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۢ(Landroid/view/View;FF)Z

    move-result v8

    if-eqz v8, :cond_9

    move v8, v6

    goto :goto_2

    :cond_9
    const/4 v8, 0x0

    :goto_2
    if-eqz v8, :cond_b

    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v11

    float-to-int v12, v9

    add-int v13, v11, v12

    iget-object v14, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    invoke-virtual {v14, v7, v13, v12}, LYue/ۥۢۤۥ۠$ۥ۟۟;->clampViewPositionHorizontal(Landroid/view/View;II)I

    move-result v12

    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v13

    float-to-int v14, v10

    add-int v15, v13, v14

    iget-object v5, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    invoke-virtual {v5, v7, v15, v14}, LYue/ۥۢۤۥ۠$ۥ۟۟;->clampViewPositionVertical(Landroid/view/View;II)I

    move-result v5

    iget-object v14, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    invoke-virtual {v14, v7}, LYue/ۥۢۤۥ۠$ۥ۟۟;->getViewHorizontalDragRange(Landroid/view/View;)I

    move-result v14

    iget-object v15, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    invoke-virtual {v15, v7}, LYue/ۥۢۤۥ۠$ۥ۟۟;->getViewVerticalDragRange(Landroid/view/View;)I

    move-result v15

    if-eqz v14, :cond_a

    if-lez v14, :cond_b

    if-ne v12, v11, :cond_b

    :cond_a
    if-eqz v15, :cond_e

    if-lez v15, :cond_b

    if-ne v5, v13, :cond_b

    goto :goto_4

    :cond_b
    invoke-virtual {v0, v9, v10, v4}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۢ(FFI)V

    iget v5, v0, LYue/ۥۢۤۥ۠;->ۥ:I

    if-ne v5, v6, :cond_c

    goto :goto_4

    :cond_c
    if-eqz v8, :cond_d

    invoke-virtual {v0, v7, v4}, LYue/ۥۢۤۥ۠;->ۥۣ۟۟ۡ(Landroid/view/View;I)Z

    move-result v4

    if-eqz v4, :cond_d

    goto :goto_4

    :cond_d
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_e
    :goto_4
    invoke-virtual/range {p0 .. p1}, LYue/ۥۢۤۥ۠;->ۥ۟۟ۢۤ(Landroid/view/MotionEvent;)V

    goto/16 :goto_0

    :cond_f
    invoke-virtual/range {p0 .. p0}, LYue/ۥۢۤۥ۠;->ۥ۟۟()V

    goto/16 :goto_0

    :cond_10
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    invoke-virtual {v0, v2, v3, v1}, LYue/ۥۢۤۥ۠;->ۥۣ۟۟ۢ(FFI)V

    float-to-int v2, v2

    float-to-int v3, v3

    invoke-virtual {v0, v2, v3}, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۥ(II)Landroid/view/View;

    move-result-object v2

    iget-object v3, v0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    if-ne v2, v3, :cond_11

    iget v3, v0, LYue/ۥۢۤۥ۠;->ۥ:I

    if-ne v3, v4, :cond_11

    invoke-virtual {v0, v2, v1}, LYue/ۥۢۤۥ۠;->ۥۣ۟۟ۡ(Landroid/view/View;I)Z

    :cond_11
    iget-object v2, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۟ۢ:[I

    aget v2, v2, v1

    iget v3, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠۠:I

    and-int v4, v2, v3

    if-eqz v4, :cond_12

    iget-object v4, v0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    and-int/2addr v2, v3

    invoke-virtual {v4, v2, v1}, LYue/ۥۢۤۥ۠$ۥ۟۟;->onEdgeTouched(II)V

    :cond_12
    :goto_5
    iget v1, v0, LYue/ۥۢۤۥ۠;->ۥ:I

    if-ne v1, v6, :cond_13

    move v5, v6

    :cond_13
    return v5
.end method

.method public ۥۣ۟۟۠(Landroid/view/View;II)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    const/4 p1, -0x1

    iput p1, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p3, p1, p1}, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۧ(IIII)Z

    move-result p1

    if-nez p1, :cond_0

    iget p2, p0, LYue/ۥۢۤۥ۠;->ۥ:I

    if-nez p2, :cond_0

    iget-object p2, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    iput-object p2, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    :cond_0
    return p1
.end method

.method public ۥۣ۟۟ۡ(Landroid/view/View;I)Z
    .locals 2

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥۣ۟۟۠:Landroid/view/View;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    iget v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    if-ne v0, p2, :cond_0

    return v1

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟۠ۢ:LYue/ۥۢۤۥ۠$ۥ۟۟;

    invoke-virtual {v0, p1, p2}, LYue/ۥۢۤۥ۠$ۥ۟۟;->tryCaptureView(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_1

    iput p2, p0, LYue/ۥۢۤۥ۠;->ۥ۟۟:I

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۤۥ۠;->ۥ۟۟۟(Landroid/view/View;I)V

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
