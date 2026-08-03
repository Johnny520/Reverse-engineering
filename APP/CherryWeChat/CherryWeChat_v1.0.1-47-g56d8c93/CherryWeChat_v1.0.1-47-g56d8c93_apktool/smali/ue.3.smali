.class public final synthetic Lue;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lue;->a:I

    iput-object p2, p0, Lue;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 7

    iget p1, p0, Lue;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lue;->b:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p2

    if-eqz p2, :cond_1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    const/4 v0, 0x3

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    :cond_1
    const p2, 0x3f333333    # 0.7f

    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    :goto_0
    const/4 p1, 0x0

    return p1

    :pswitch_0
    iget-object p1, p0, Lue;->b:Ljava/lang/Object;

    check-cast p1, LLe;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p2, v1, :cond_4

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iget-wide v4, p1, LLe;->o:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p2, v2, v4

    if-ltz p2, :cond_2

    const-wide/16 v4, 0x12c

    cmp-long p2, v2, v4

    if-lez p2, :cond_3

    :cond_2
    iput-boolean v0, p1, LLe;->m:Z

    :cond_3
    invoke-virtual {p1}, LLe;->t()V

    iput-boolean v1, p1, LLe;->m:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, p1, LLe;->o:J

    :cond_4
    return v0

    :pswitch_1
    iget-object p1, p0, Lue;->b:Ljava/lang/Object;

    check-cast p1, Lve;

    iget-object v0, p1, Lve;->n:LN2;

    iget-object v1, p1, Lve;->i:Landroid/os/Handler;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_d

    if-eq v2, v4, :cond_a

    const/4 v6, 0x2

    if-eq v2, v6, :cond_8

    const/4 p2, 0x3

    if-eq v2, p2, :cond_5

    move v4, v5

    goto :goto_1

    :cond_5
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-boolean p2, p1, Lve;->d:Z

    if-eqz p2, :cond_e

    iput-boolean v5, p1, Lve;->d:Z

    iput v3, p1, Lve;->f:F

    iget-object p2, p1, Lve;->m:Lfj;

    if-eqz p2, :cond_6

    invoke-interface {p2, p1}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-interface {p2, v5}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    goto :goto_1

    :cond_8
    iget-boolean v0, p1, Lve;->d:Z

    if-eqz v0, :cond_e

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p2

    iget v0, p1, Lve;->e:F

    sub-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, p1, Lve;->l:Lkotlin/jvm/functions/Function2;

    if-eqz v0, :cond_9

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lkotlin/jvm/functions/Function2;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    goto :goto_1

    :cond_a
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-boolean p2, p1, Lve;->d:Z

    if-eqz p2, :cond_e

    iput-boolean v5, p1, Lve;->d:Z

    iput v3, p1, Lve;->f:F

    iget-object p2, p1, Lve;->m:Lfj;

    if-eqz p2, :cond_b

    invoke-interface {p2, p1}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    if-eqz p2, :cond_c

    invoke-interface {p2, v5}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    goto :goto_1

    :cond_d
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p2

    iput p2, p1, Lve;->e:F

    invoke-virtual {p1}, Landroid/view/View;->getY()F

    iput-boolean v5, p1, Lve;->d:Z

    iput v3, p1, Lve;->f:F

    iget-wide p1, p1, Lve;->j:J

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_e
    :goto_1
    return v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
