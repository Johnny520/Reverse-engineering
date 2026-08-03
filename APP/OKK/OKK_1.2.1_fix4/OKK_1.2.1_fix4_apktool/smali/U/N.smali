.class public final LU/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public a:I

.field public b:I

.field public c:Landroid/widget/OverScroller;

.field public d:Landroid/view/animation/Interpolator;

.field public e:Z

.field public f:Z

.field public final synthetic g:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU/N;->g:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->m0:LL/d;

    iput-object v0, p0, LU/N;->d:Landroid/view/animation/Interpolator;

    const/4 v1, 0x0

    iput-boolean v1, p0, LU/N;->e:Z

    iput-boolean v1, p0, LU/N;->f:Z

    new-instance v1, Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v1, p0, LU/N;->c:Landroid/widget/OverScroller;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-boolean v0, p0, LU/N;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LU/N;->f:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LU/N;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    sget-object v1, LD/Q;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final b(IIILandroid/view/animation/Interpolator;)V
    .locals 11

    const/high16 v0, -0x80000000

    iget-object v1, p0, LU/N;->g:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v2, 0x0

    if-ne p3, v0, :cond_4

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p3

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v0

    if-le p3, v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    int-to-double v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-int v4, v4

    mul-int v5, p1, p1

    mul-int v6, p2, p2

    add-int/2addr v6, v5

    int-to-double v5, v6

    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v5

    double-to-int v5, v5

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v6

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v6

    :goto_1
    div-int/lit8 v7, v6, 0x2

    int-to-float v5, v5

    const/high16 v8, 0x3f800000    # 1.0f

    mul-float/2addr v5, v8

    int-to-float v6, v6

    div-float/2addr v5, v6

    invoke-static {v8, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    int-to-float v7, v7

    const/high16 v9, 0x3f000000    # 0.5f

    sub-float/2addr v5, v9

    const v9, 0x3ef1463b

    mul-float/2addr v5, v9

    float-to-double v9, v5

    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v9

    double-to-float v5, v9

    mul-float/2addr v5, v7

    add-float/2addr v5, v7

    if-lez v4, :cond_2

    int-to-float p3, v4

    div-float/2addr v5, p3

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result p3

    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr p3, v0

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    mul-int/lit8 p3, p3, 0x4

    goto :goto_3

    :cond_2
    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    move p3, v0

    :goto_2
    int-to-float p3, p3

    div-float/2addr p3, v6

    add-float/2addr p3, v8

    const/high16 v0, 0x43960000    # 300.0f

    mul-float/2addr p3, v0

    float-to-int p3, p3

    :goto_3
    const/16 v0, 0x7d0

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    :cond_4
    move v8, p3

    if-nez p4, :cond_5

    sget-object p4, Landroidx/recyclerview/widget/RecyclerView;->m0:LL/d;

    :cond_5
    iget-object p3, p0, LU/N;->d:Landroid/view/animation/Interpolator;

    if-eq p3, p4, :cond_6

    iput-object p4, p0, LU/N;->d:Landroid/view/animation/Interpolator;

    new-instance p3, Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0, p4}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object p3, p0, LU/N;->c:Landroid/widget/OverScroller;

    :cond_6
    iput v2, p0, LU/N;->b:I

    iput v2, p0, LU/N;->a:I

    const/4 p3, 0x2

    invoke-virtual {v1, p3}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    iget-object v3, p0, LU/N;->c:Landroid/widget/OverScroller;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p1

    move v7, p2

    invoke-virtual/range {v3 .. v8}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    invoke-virtual {p0}, LU/N;->a()V

    return-void
.end method

.method public final run()V
    .locals 18

    move-object/from16 v0, p0

    iget-object v9, v0, LU/N;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v9, Landroidx/recyclerview/widget/RecyclerView;->j:LU/C;

    if-nez v1, :cond_0

    invoke-virtual {v9, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, v0, LU/N;->c:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    return-void

    :cond_0
    const/4 v10, 0x0

    iput-boolean v10, v0, LU/N;->f:Z

    const/4 v11, 0x1

    iput-boolean v11, v0, LU/N;->e:Z

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView;->g()V

    iget-object v12, v0, LU/N;->c:Landroid/widget/OverScroller;

    invoke-virtual {v12}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-virtual {v12}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v1

    invoke-virtual {v12}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v2

    iget v3, v0, LU/N;->a:I

    sub-int v7, v1, v3

    iget v3, v0, LU/N;->b:I

    sub-int v8, v2, v3

    iput v1, v0, LU/N;->a:I

    iput v2, v0, LU/N;->b:I

    iget-object v4, v9, Landroidx/recyclerview/widget/RecyclerView;->h0:[I

    aput v10, v4, v10

    aput v10, v4, v11

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, v9

    move v2, v7

    move v3, v8

    invoke-virtual/range {v1 .. v6}, Landroidx/recyclerview/widget/RecyclerView;->j(II[I[II)Z

    move-result v1

    iget-object v13, v9, Landroidx/recyclerview/widget/RecyclerView;->h0:[I

    if-eqz v1, :cond_1

    aget v1, v13, v10

    sub-int/2addr v7, v1

    aget v1, v13, v11

    sub-int/2addr v8, v1

    :cond_1
    move v14, v7

    move v15, v8

    invoke-virtual {v9}, Landroid/view/View;->getOverScrollMode()I

    move-result v1

    const/4 v8, 0x2

    if-eq v1, v8, :cond_2

    invoke-virtual {v9, v14, v15}, Landroidx/recyclerview/widget/RecyclerView;->f(II)V

    :cond_2
    iget-object v1, v9, Landroidx/recyclerview/widget/RecyclerView;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v9}, Landroid/view/View;->invalidate()V

    :cond_3
    iget-object v7, v9, Landroidx/recyclerview/widget/RecyclerView;->h0:[I

    aput v10, v7, v10

    aput v10, v7, v11

    const/4 v6, 0x0

    const/16 v16, 0x1

    move-object v1, v9

    move v2, v10

    move v3, v10

    move v4, v14

    move v5, v15

    move-object/from16 v17, v7

    move/from16 v7, v16

    move-object/from16 v8, v17

    invoke-virtual/range {v1 .. v8}, Landroidx/recyclerview/widget/RecyclerView;->k(IIII[II[I)V

    aget v1, v13, v10

    sub-int/2addr v14, v1

    aget v1, v13, v11

    sub-int/2addr v15, v1

    invoke-static {v9}, Landroidx/recyclerview/widget/RecyclerView;->c(Landroidx/recyclerview/widget/RecyclerView;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v9}, Landroid/view/View;->invalidate()V

    :cond_4
    invoke-virtual {v12}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v1

    invoke-virtual {v12}, Landroid/widget/OverScroller;->getFinalX()I

    move-result v2

    if-ne v1, v2, :cond_5

    move v1, v11

    goto :goto_0

    :cond_5
    move v1, v10

    :goto_0
    invoke-virtual {v12}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v2

    invoke-virtual {v12}, Landroid/widget/OverScroller;->getFinalY()I

    move-result v3

    if-ne v2, v3, :cond_6

    move v2, v11

    goto :goto_1

    :cond_6
    move v2, v10

    :goto_1
    invoke-virtual {v12}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v3

    if-nez v3, :cond_9

    if-nez v1, :cond_7

    if-eqz v14, :cond_8

    :cond_7
    if-nez v2, :cond_9

    if-eqz v15, :cond_8

    goto :goto_2

    :cond_8
    move v1, v10

    goto :goto_3

    :cond_9
    :goto_2
    move v1, v11

    :goto_3
    iget-object v2, v9, Landroidx/recyclerview/widget/RecyclerView;->j:LU/C;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v1, :cond_14

    invoke-virtual {v9}, Landroid/view/View;->getOverScrollMode()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_13

    invoke-virtual {v12}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v1

    float-to-int v1, v1

    if-gez v14, :cond_a

    neg-int v2, v1

    goto :goto_4

    :cond_a
    if-lez v14, :cond_b

    move v2, v1

    goto :goto_4

    :cond_b
    move v2, v10

    :goto_4
    if-gez v15, :cond_c

    neg-int v1, v1

    goto :goto_5

    :cond_c
    if-lez v15, :cond_d

    goto :goto_5

    :cond_d
    move v1, v10

    :goto_5
    if-gez v2, :cond_e

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView;->m()V

    iget-object v3, v9, Landroidx/recyclerview/widget/RecyclerView;->B:Landroid/widget/EdgeEffect;

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-eqz v3, :cond_f

    iget-object v3, v9, Landroidx/recyclerview/widget/RecyclerView;->B:Landroid/widget/EdgeEffect;

    neg-int v4, v2

    invoke-virtual {v3, v4}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_6

    :cond_e
    if-lez v2, :cond_f

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView;->n()V

    iget-object v3, v9, Landroidx/recyclerview/widget/RecyclerView;->D:Landroid/widget/EdgeEffect;

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-eqz v3, :cond_f

    iget-object v3, v9, Landroidx/recyclerview/widget/RecyclerView;->D:Landroid/widget/EdgeEffect;

    invoke-virtual {v3, v2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_f
    :goto_6
    if-gez v1, :cond_10

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView;->o()V

    iget-object v3, v9, Landroidx/recyclerview/widget/RecyclerView;->C:Landroid/widget/EdgeEffect;

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-eqz v3, :cond_11

    iget-object v3, v9, Landroidx/recyclerview/widget/RecyclerView;->C:Landroid/widget/EdgeEffect;

    neg-int v4, v1

    invoke-virtual {v3, v4}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_7

    :cond_10
    if-lez v1, :cond_11

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView;->l()V

    iget-object v3, v9, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-eqz v3, :cond_11

    iget-object v3, v9, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v3, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_11
    :goto_7
    if-nez v2, :cond_12

    if-eqz v1, :cond_13

    :cond_12
    sget-object v1, LD/Q;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v9}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_13
    iget-object v1, v9, Landroidx/recyclerview/widget/RecyclerView;->V:LU/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    iput v2, v1, LU/l;->c:I

    goto :goto_8

    :cond_14
    invoke-virtual/range {p0 .. p0}, LU/N;->a()V

    iget-object v1, v9, Landroidx/recyclerview/widget/RecyclerView;->U:LU/n;

    if-eqz v1, :cond_15

    invoke-virtual {v1, v9, v10, v10}, LU/n;->a(Landroidx/recyclerview/widget/RecyclerView;II)V

    :cond_15
    :goto_8
    iget-object v1, v9, Landroidx/recyclerview/widget/RecyclerView;->j:LU/C;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-boolean v10, v0, LU/N;->e:Z

    iget-boolean v1, v0, LU/N;->f:Z

    if-eqz v1, :cond_16

    invoke-virtual {v9, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    sget-object v1, LD/Q;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v9, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    goto :goto_9

    :cond_16
    invoke-virtual {v9, v10}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    invoke-virtual {v9, v11}, Landroidx/recyclerview/widget/RecyclerView;->K(I)V

    :goto_9
    return-void
.end method
