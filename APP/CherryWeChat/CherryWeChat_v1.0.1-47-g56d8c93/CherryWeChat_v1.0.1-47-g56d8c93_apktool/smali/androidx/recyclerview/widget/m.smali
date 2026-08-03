.class public abstract Landroidx/recyclerview/widget/m;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private mLayoutManager:Landroidx/recyclerview/widget/i;

.field private mPendingInitialRun:Z

.field private mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private final mRecyclingAction:Landroidx/recyclerview/widget/l;

.field private mRunning:Z

.field private mStarted:Z

.field private mTargetPosition:I

.field private mTargetView:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/m;->mTargetPosition:I

    new-instance v1, Landroidx/recyclerview/widget/l;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput v0, v1, Landroidx/recyclerview/widget/l;->d:I

    const/4 v0, 0x0

    iput-boolean v0, v1, Landroidx/recyclerview/widget/l;->f:Z

    iput v0, v1, Landroidx/recyclerview/widget/l;->a:I

    iput v0, v1, Landroidx/recyclerview/widget/l;->b:I

    const/high16 v0, -0x80000000

    iput v0, v1, Landroidx/recyclerview/widget/l;->c:I

    const/4 v0, 0x0

    iput-object v0, v1, Landroidx/recyclerview/widget/l;->e:Landroid/view/animation/Interpolator;

    iput-object v1, p0, Landroidx/recyclerview/widget/m;->mRecyclingAction:Landroidx/recyclerview/widget/l;

    return-void
.end method


# virtual methods
.method public computeScrollVectorForPosition(I)Landroid/graphics/PointF;
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/m;->getLayoutManager()Landroidx/recyclerview/widget/i;

    move-result-object v0

    instance-of v1, v0, Lzv;

    if-eqz v1, :cond_0

    check-cast v0, Lzv;

    invoke-interface {v0, p1}, Lzv;->computeScrollVectorForPosition(I)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public findViewByPosition(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/m;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mLayout:Landroidx/recyclerview/widget/i;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/i;->findViewByPosition(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getChildCount()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/m;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mLayout:Landroidx/recyclerview/widget/i;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/i;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getChildPosition(Landroid/view/View;)I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/m;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    move-result p1

    return p1
.end method

.method public getLayoutManager()Landroidx/recyclerview/widget/i;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/m;->mLayoutManager:Landroidx/recyclerview/widget/i;

    return-object v0
.end method

.method public getTargetPosition()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/m;->mTargetPosition:I

    return v0
.end method

.method public instantScrollToPosition(I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/m;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    return-void
.end method

.method public isPendingInitialRun()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/m;->mPendingInitialRun:Z

    return v0
.end method

.method public isRunning()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/m;->mRunning:Z

    return v0
.end method

.method public normalize(Landroid/graphics/PointF;)V
    .locals 2

    iget v0, p1, Landroid/graphics/PointF;->x:F

    mul-float/2addr v0, v0

    iget v1, p1, Landroid/graphics/PointF;->y:F

    mul-float/2addr v1, v1

    add-float/2addr v1, v0

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    iget v1, p1, Landroid/graphics/PointF;->x:F

    div-float/2addr v1, v0

    iput v1, p1, Landroid/graphics/PointF;->x:F

    iget v1, p1, Landroid/graphics/PointF;->y:F

    div-float/2addr v1, v0

    iput v1, p1, Landroid/graphics/PointF;->y:F

    return-void
.end method

.method public onAnimation(II)V
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/m;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget v1, p0, Landroidx/recyclerview/widget/m;->mTargetPosition:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/m;->stop()V

    :cond_1
    iget-boolean v1, p0, Landroidx/recyclerview/widget/m;->mPendingInitialRun:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroidx/recyclerview/widget/m;->mTargetView:Landroid/view/View;

    if-nez v1, :cond_3

    iget-object v1, p0, Landroidx/recyclerview/widget/m;->mLayoutManager:Landroidx/recyclerview/widget/i;

    if-eqz v1, :cond_3

    iget v1, p0, Landroidx/recyclerview/widget/m;->mTargetPosition:I

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/m;->computeScrollVectorForPosition(I)Landroid/graphics/PointF;

    move-result-object v1

    if-eqz v1, :cond_3

    iget v3, v1, Landroid/graphics/PointF;->x:F

    const/4 v4, 0x0

    cmpl-float v5, v3, v4

    if-nez v5, :cond_2

    iget v5, v1, Landroid/graphics/PointF;->y:F

    cmpl-float v4, v5, v4

    if-eqz v4, :cond_3

    :cond_2
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v3

    float-to-int v3, v3

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v3, v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->scrollStep(II[I)V

    :cond_3
    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/recyclerview/widget/m;->mPendingInitialRun:Z

    iget-object v3, p0, Landroidx/recyclerview/widget/m;->mTargetView:Landroid/view/View;

    if-eqz v3, :cond_5

    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/m;->getChildPosition(Landroid/view/View;)I

    move-result v3

    iget v4, p0, Landroidx/recyclerview/widget/m;->mTargetPosition:I

    if-ne v3, v4, :cond_4

    iget-object v2, p0, Landroidx/recyclerview/widget/m;->mTargetView:Landroid/view/View;

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iget-object v4, p0, Landroidx/recyclerview/widget/m;->mRecyclingAction:Landroidx/recyclerview/widget/l;

    invoke-virtual {p0, v2, v3, v4}, Landroidx/recyclerview/widget/m;->onTargetFound(Landroid/view/View;LAv;Landroidx/recyclerview/widget/l;)V

    iget-object v2, p0, Landroidx/recyclerview/widget/m;->mRecyclingAction:Landroidx/recyclerview/widget/l;

    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/l;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/m;->stop()V

    goto :goto_0

    :cond_4
    iput-object v2, p0, Landroidx/recyclerview/widget/m;->mTargetView:Landroid/view/View;

    :cond_5
    :goto_0
    iget-boolean v2, p0, Landroidx/recyclerview/widget/m;->mRunning:Z

    if-eqz v2, :cond_7

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iget-object v3, p0, Landroidx/recyclerview/widget/m;->mRecyclingAction:Landroidx/recyclerview/widget/l;

    invoke-virtual {p0, p1, p2, v2, v3}, Landroidx/recyclerview/widget/m;->onSeekTargetStep(IILAv;Landroidx/recyclerview/widget/l;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/m;->mRecyclingAction:Landroidx/recyclerview/widget/l;

    iget p2, p1, Landroidx/recyclerview/widget/l;->d:I

    const/4 v2, 0x1

    if-ltz p2, :cond_6

    move v1, v2

    :cond_6
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/l;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    if-eqz v1, :cond_7

    iget-boolean p1, p0, Landroidx/recyclerview/widget/m;->mRunning:Z

    if-eqz p1, :cond_7

    iput-boolean v2, p0, Landroidx/recyclerview/widget/m;->mPendingInitialRun:Z

    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView;->mViewFlinger:Landroidx/recyclerview/widget/n;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/n;->b()V

    :cond_7
    return-void
.end method

.method public onChildAttachedToWindow(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/m;->getChildPosition(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/m;->getTargetPosition()I

    move-result v1

    if-ne v0, v1, :cond_0

    iput-object p1, p0, Landroidx/recyclerview/widget/m;->mTargetView:Landroid/view/View;

    sget p1, Landroidx/recyclerview/widget/RecyclerView;->HORIZONTAL:I

    :cond_0
    return-void
.end method

.method public abstract onSeekTargetStep(IILAv;Landroidx/recyclerview/widget/l;)V
.end method

.method public abstract onStart()V
.end method

.method public abstract onStop()V
.end method

.method public abstract onTargetFound(Landroid/view/View;LAv;Landroidx/recyclerview/widget/l;)V
.end method

.method public setTargetPosition(I)V
    .locals 0

    iput p1, p0, Landroidx/recyclerview/widget/m;->mTargetPosition:I

    return-void
.end method

.method public start(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/i;)V
    .locals 2

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->mViewFlinger:Landroidx/recyclerview/widget/n;

    iget-object v1, v0, Landroidx/recyclerview/widget/n;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, v0, Landroidx/recyclerview/widget/n;->c:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    iput-object p1, p0, Landroidx/recyclerview/widget/m;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Landroidx/recyclerview/widget/m;->mLayoutManager:Landroidx/recyclerview/widget/i;

    iget p2, p0, Landroidx/recyclerview/widget/m;->mTargetPosition:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iput p2, p1, LAv;->a:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/m;->mRunning:Z

    iput-boolean p1, p0, Landroidx/recyclerview/widget/m;->mPendingInitialRun:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/m;->getTargetPosition()I

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/m;->findViewByPosition(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/recyclerview/widget/m;->mTargetView:Landroid/view/View;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/m;->onStart()V

    iget-object p2, p0, Landroidx/recyclerview/widget/m;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->mViewFlinger:Landroidx/recyclerview/widget/n;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/n;->b()V

    iput-boolean p1, p0, Landroidx/recyclerview/widget/m;->mStarted:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid target position"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final stop()V
    .locals 3

    iget-boolean v0, p0, Landroidx/recyclerview/widget/m;->mRunning:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/m;->mRunning:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/m;->onStop()V

    iget-object v1, p0, Landroidx/recyclerview/widget/m;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    const/4 v2, -0x1

    iput v2, v1, LAv;->a:I

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/recyclerview/widget/m;->mTargetView:Landroid/view/View;

    iput v2, p0, Landroidx/recyclerview/widget/m;->mTargetPosition:I

    iput-boolean v0, p0, Landroidx/recyclerview/widget/m;->mPendingInitialRun:Z

    iget-object v0, p0, Landroidx/recyclerview/widget/m;->mLayoutManager:Landroidx/recyclerview/widget/i;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/i;->onSmoothScrollerStopped(Landroidx/recyclerview/widget/m;)V

    iput-object v1, p0, Landroidx/recyclerview/widget/m;->mLayoutManager:Landroidx/recyclerview/widget/i;

    iput-object v1, p0, Landroidx/recyclerview/widget/m;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method
