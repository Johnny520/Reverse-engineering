.class public final Lc0/F;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public b:F

.field public c:Z


# virtual methods
.method public final b(Lde/robv/android/xposed/b;)V
    .locals 5

    sget-object v0, Lc0/G;->c:Ld0/s;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lc0/y;->b()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v2, "args"

    invoke-static {v1, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-static {v2, v1}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Landroid/view/MotionEvent;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    check-cast v1, Landroid/view/MotionEvent;

    goto :goto_0

    :cond_2
    move-object v1, v4

    :goto_0
    if-nez v1, :cond_3

    return-void

    :cond_3
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v3, p1, Landroid/view/View;

    if-eqz v3, :cond_4

    move-object v4, p1

    check-cast v4, Landroid/view/View;

    :cond_4
    if-nez v4, :cond_5

    return-void

    :cond_5
    sget-object p1, Lc0/G;->a:Lc0/G;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v3, "getContext(...)"

    invoke-static {p1, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lc0/G;->r(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_6

    return-void

    :cond_6
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-eqz p1, :cond_b

    const/4 v2, 0x1

    if-eq p1, v2, :cond_a

    const/4 v3, 0x2

    if-eq p1, v3, :cond_7

    const/4 v1, 0x3

    if-eq p1, v1, :cond_a

    goto :goto_1

    :cond_7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iget v1, p0, Lc0/F;->b:F

    sub-float/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 v1, 0x41900000    # 18.0f

    cmpl-float p1, p1, v1

    if-lez p1, :cond_c

    iput-boolean v2, p0, Lc0/F;->c:Z

    iget-boolean p1, v0, Ld0/s;->G:Z

    if-eqz p1, :cond_8

    goto :goto_1

    :cond_8
    iput-boolean v2, v0, Ld0/s;->G:Z

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result p1

    const/high16 v1, 0x42480000    # 50.0f

    invoke-virtual {v0, v1}, Ld0/s;->c(F)I

    move-result v1

    if-ge p1, v1, :cond_9

    move p1, v1

    :cond_9
    const/high16 v1, 0x42200000    # 40.0f

    invoke-virtual {v0, v1}, Ld0/s;->c(F)I

    move-result v1

    add-int/2addr v1, p1

    int-to-float p1, v1

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const-wide/16 v0, 0xdc

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v1, 0x3e4ccccd    # 0.2f

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v1, v3}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_1

    :cond_a
    iget-boolean p1, p0, Lc0/F;->c:Z

    if-eqz p1, :cond_c

    new-instance p1, LA0/d;

    const/4 v1, 0x5

    invoke-direct {p1, v1, v0}, LA0/d;-><init>(ILjava/lang/Object;)V

    const-wide/16 v0, 0x320

    invoke-virtual {v4, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    :cond_b
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Lc0/F;->b:F

    iput-boolean v2, p0, Lc0/F;->c:Z

    :cond_c
    :goto_1
    return-void
.end method
