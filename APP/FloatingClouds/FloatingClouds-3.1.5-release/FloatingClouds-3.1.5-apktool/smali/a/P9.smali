.class public final synthetic La/P9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/T9;


# direct methods
.method public synthetic constructor <init>(La/T9;I)V
    .locals 0

    iput p2, p0, La/P9;->a:I

    iput-object p1, p0, La/P9;->b:La/T9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, La/P9;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/P9;->b:La/T9;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    const-string v1, "chain"

    invoke-static {p1, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Landroid/widget/ListView;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Landroid/widget/ListView;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-nez v1, :cond_1

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_3

    :cond_1
    iget-object v2, v0, La/T9;->a:Landroid/widget/ListView;

    if-eq v1, v2, :cond_2

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_3

    :cond_2
    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v2

    iget-boolean v2, v2, La/jc;->j:Z

    if-nez v2, :cond_3

    goto/16 :goto_2

    :cond_3
    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v2

    iget-boolean v2, v2, La/jc;->k:Z

    if-nez v2, :cond_4

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_3

    :cond_4
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v2

    const-string v4, "getArgs(...)"

    invoke-static {v2, v4}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v2, v4}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Landroid/view/MotionEvent;

    if-eqz v5, :cond_5

    move-object v3, v2

    check-cast v3, Landroid/view/MotionEvent;

    :cond_5
    if-nez v3, :cond_6

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_3

    :cond_6
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v5, 0x1

    if-eqz v2, :cond_b

    if-eq v2, v5, :cond_9

    const/4 v4, 0x2

    if-eq v2, v4, :cond_8

    const/4 v1, 0x3

    if-eq v2, v1, :cond_7

    goto/16 :goto_1

    :cond_7
    iput-boolean v5, v0, La/T9;->i:Z

    iget-object v1, v0, La/T9;->f:Landroid/os/Handler;

    iget-object v2, v0, La/T9;->j:La/Q9;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, v0, La/T9;->f:Landroid/os/Handler;

    iget-object v2, v0, La/T9;->j:La/Q9;

    iget-wide v3, v0, La/T9;->k:J

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    :cond_8
    iget-boolean v2, v0, La/T9;->b:Z

    if-eqz v2, :cond_c

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iget v4, v0, La/T9;->d:F

    sub-float/2addr v2, v4

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iget v4, v0, La/T9;->e:F

    sub-float/2addr v3, v4

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    mul-float/2addr v2, v2

    mul-float/2addr v3, v3

    add-float/2addr v3, v2

    mul-int/2addr v1, v1

    int-to-float v1, v1

    cmpl-float v1, v3, v1

    if-lez v1, :cond_c

    invoke-virtual {v0}, La/T9;->a()V

    goto :goto_1

    :cond_9
    iget-boolean v1, v0, La/T9;->i:Z

    if-eqz v1, :cond_a

    iput-boolean v4, v0, La/T9;->i:Z

    iget-object v1, v0, La/T9;->f:Landroid/os/Handler;

    iget-object v2, v0, La/T9;->j:La/Q9;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_a
    invoke-virtual {v0}, La/T9;->a()V

    iget-boolean v1, v0, La/T9;->c:Z

    if-eqz v1, :cond_c

    iput-boolean v4, v0, La/T9;->c:Z

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_3

    :cond_b
    iput-boolean v4, v0, La/T9;->c:Z

    iput-boolean v4, v0, La/T9;->i:Z

    iget-object v1, v0, La/T9;->f:Landroid/os/Handler;

    iget-object v2, v0, La/T9;->j:La/Q9;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iput-boolean v5, v0, La/T9;->b:Z

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, La/T9;->d:F

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, v0, La/T9;->e:F

    iget-object v1, v0, La/T9;->f:Landroid/os/Handler;

    iget-object v2, v0, La/T9;->g:La/Q9;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, v0, La/T9;->f:Landroid/os/Handler;

    iget-object v2, v0, La/T9;->g:La/Q9;

    iget v0, v0, La/T9;->h:I

    int-to-long v3, v0

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_c
    :goto_1
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    goto :goto_3

    :cond_d
    :goto_2
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_3
    return-object p1

    :pswitch_0
    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_e

    check-cast v0, Landroid/app/Activity;

    goto :goto_4

    :cond_e
    const/4 v0, 0x0

    :goto_4
    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_f

    new-instance v2, La/P0;

    iget-object v3, p0, La/P9;->b:La/T9;

    const/16 v4, 0x9

    invoke-direct {v2, v3, v4, v0}, La/P0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_f
    const-string v0, "LongClickInject: SnsUserUI.onResume -> inject posted"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :cond_10
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/P9;->b:La/T9;

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v1

    const-string v2, "getArgs(...)"

    invoke-static {v1, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-static {v1, v3}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Landroid/widget/AdapterView$OnItemLongClickListener;

    if-eqz v4, :cond_11

    check-cast v1, Landroid/widget/AdapterView$OnItemLongClickListener;

    goto :goto_5

    :cond_11
    const/4 v1, 0x0

    :goto_5
    new-instance v4, La/R9;

    invoke-direct {v4, v0, v1}, La/R9;-><init>(La/T9;Landroid/widget/AdapterView$OnItemLongClickListener;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, La/t3;->y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
