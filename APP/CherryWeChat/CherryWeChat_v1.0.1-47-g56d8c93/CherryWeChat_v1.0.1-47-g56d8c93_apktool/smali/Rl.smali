.class public final LRl;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ltv;


# instance fields
.field public final synthetic a:LWl;


# direct methods
.method public constructor <init>(LWl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRl;->a:LWl;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)V
    .locals 9

    iget-object v0, p0, LRl;->a:LWl;

    iget-object v1, v0, LWl;->r:LK0;

    iget-object v2, v0, LWl;->w:Landroidx/core/view/GestureDetectorCompat;

    iget-object v2, v2, Landroidx/core/view/GestureDetectorCompat;->a:Landroid/view/GestureDetector;

    invoke-virtual {v2, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    iget-object v2, v0, LWl;->s:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_0

    invoke-virtual {v2, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_0
    iget v2, v0, LWl;->l:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    iget v4, v0, LWl;->l:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    if-ltz v4, :cond_2

    invoke-virtual {v0, v2, v4, p1}, LWl;->f(IILandroid/view/MotionEvent;)V

    :cond_2
    iget-object v5, v0, LWl;->c:Landroidx/recyclerview/widget/o;

    if-nez v5, :cond_3

    goto :goto_0

    :cond_3
    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v2, v7, :cond_9

    const/4 v8, 0x2

    if-eq v2, v8, :cond_7

    const/4 v1, 0x3

    if-eq v2, v1, :cond_6

    const/4 v1, 0x6

    if-eq v2, v1, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    iget v3, v0, LWl;->l:I

    if-ne v2, v3, :cond_8

    if-nez v1, :cond_5

    move v6, v7

    :cond_5
    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    iput v2, v0, LWl;->l:I

    iget v2, v0, LWl;->o:I

    invoke-virtual {v0, v2, v1, p1}, LWl;->o(IILandroid/view/MotionEvent;)V

    return-void

    :cond_6
    iget-object p1, v0, LWl;->s:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    goto :goto_1

    :cond_7
    if-ltz v4, :cond_8

    iget v2, v0, LWl;->o:I

    invoke-virtual {v0, v2, v4, p1}, LWl;->o(IILandroid/view/MotionEvent;)V

    invoke-virtual {v0, v5}, LWl;->l(Landroidx/recyclerview/widget/o;)V

    iget-object p1, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {v1}, LK0;->run()V

    iget-object p1, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_8
    :goto_0
    return-void

    :cond_9
    :goto_1
    const/4 p1, 0x0

    invoke-virtual {v0, p1, v6}, LWl;->n(Landroidx/recyclerview/widget/o;I)V

    iput v3, v0, LWl;->l:I

    return-void
.end method

.method public final b(Landroid/view/MotionEvent;)Z
    .locals 9

    iget-object v0, p0, LRl;->a:LWl;

    iget-object v1, v0, LWl;->w:Landroidx/core/view/GestureDetectorCompat;

    iget-object v1, v1, Landroidx/core/view/GestureDetectorCompat;->a:Landroid/view/GestureDetector;

    invoke-virtual {v1, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v1, :cond_5

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iput v1, v0, LWl;->l:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, LWl;->d:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, v0, LWl;->e:F

    iget-object v1, v0, LWl;->s:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    :cond_0
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v1

    iput-object v1, v0, LWl;->s:Landroid/view/VelocityTracker;

    iget-object v1, v0, LWl;->c:Landroidx/recyclerview/widget/o;

    if-nez v1, :cond_8

    iget-object v1, v0, LWl;->p:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p1}, LWl;->i(Landroid/view/MotionEvent;)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    sub-int/2addr v6, v3

    :goto_0
    if-ltz v6, :cond_3

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LSl;

    iget-object v8, v7, LSl;->e:Landroidx/recyclerview/widget/o;

    iget-object v8, v8, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    if-ne v8, v5, :cond_2

    move-object v2, v7

    goto :goto_1

    :cond_2
    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v2, :cond_8

    iget-object v1, v2, LSl;->e:Landroidx/recyclerview/widget/o;

    iget v5, v0, LWl;->d:F

    iget v6, v2, LSl;->i:F

    sub-float/2addr v5, v6

    iput v5, v0, LWl;->d:F

    iget v5, v0, LWl;->e:F

    iget v6, v2, LSl;->j:F

    sub-float/2addr v5, v6

    iput v5, v0, LWl;->e:F

    invoke-virtual {v0, v1, v3}, LWl;->h(Landroidx/recyclerview/widget/o;Z)V

    iget-object v5, v0, LWl;->a:Ljava/util/ArrayList;

    iget-object v6, v1, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object v5, v0, LWl;->m:LUl;

    iget-object v6, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, v6, v1}, LUl;->a(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o;)V

    :cond_4
    iget v2, v2, LSl;->f:I

    invoke-virtual {v0, v1, v2}, LWl;->n(Landroidx/recyclerview/widget/o;I)V

    iget v1, v0, LWl;->o:I

    invoke-virtual {v0, v1, v4, p1}, LWl;->o(IILandroid/view/MotionEvent;)V

    goto :goto_3

    :cond_5
    const/4 v5, 0x3

    const/4 v6, -0x1

    if-eq v1, v5, :cond_7

    if-ne v1, v3, :cond_6

    goto :goto_2

    :cond_6
    iget v2, v0, LWl;->l:I

    if-eq v2, v6, :cond_8

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    if-ltz v2, :cond_8

    invoke-virtual {v0, v1, v2, p1}, LWl;->f(IILandroid/view/MotionEvent;)V

    goto :goto_3

    :cond_7
    :goto_2
    iput v6, v0, LWl;->l:I

    invoke-virtual {v0, v2, v4}, LWl;->n(Landroidx/recyclerview/widget/o;I)V

    :cond_8
    :goto_3
    iget-object v1, v0, LWl;->s:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_9

    invoke-virtual {v1, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_9
    iget-object p1, v0, LWl;->c:Landroidx/recyclerview/widget/o;

    if-eqz p1, :cond_a

    return v3

    :cond_a
    return v4
.end method

.method public final c(Z)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, LRl;->a:LWl;

    invoke-virtual {v1, p1, v0}, LWl;->n(Landroidx/recyclerview/widget/o;I)V

    return-void
.end method
