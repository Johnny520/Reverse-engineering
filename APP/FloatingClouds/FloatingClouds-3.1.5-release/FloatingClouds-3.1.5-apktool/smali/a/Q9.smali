.class public final synthetic La/Q9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/T9;


# direct methods
.method public synthetic constructor <init>(La/T9;I)V
    .locals 0

    iput p2, p0, La/Q9;->a:I

    iput-object p1, p0, La/Q9;->b:La/T9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget v0, p0, La/Q9;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/Q9;->b:La/T9;

    iget-boolean v1, v0, La/T9;->p:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, La/T9;->p:Z

    iput-boolean v1, v0, La/T9;->o:Z

    iget-object v1, v0, La/T9;->t:Landroid/os/Handler;

    iget-object v0, v0, La/T9;->u:La/Q9;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, La/Q9;->b:La/T9;

    iget-boolean v1, v0, La/T9;->o:Z

    if-eqz v1, :cond_6

    const/4 v1, 0x0

    iput-boolean v1, v0, La/T9;->o:Z

    const/4 v2, 0x1

    iput-boolean v2, v0, La/T9;->q:Z

    iget-boolean v3, v0, La/T9;->p:Z

    const-string v4, "LC_TRACE"

    if-eqz v3, :cond_1

    iput-boolean v1, v0, La/T9;->p:Z

    iget-object v3, v0, La/T9;->t:Landroid/os/Handler;

    iget-object v5, v0, La/T9;->v:La/Q9;

    invoke-virtual {v3, v5}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-string v3, ">>> [PATH3_CANCEL_TOLERANCE] long-press completed within tolerance window"

    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {v0}, La/T9;->b()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, v0, La/T9;->a:Landroid/widget/ListView;

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    const/4 v5, 0x2

    new-array v5, v5, [I

    :try_start_0
    invoke-virtual {v3, v5}, Landroid/view/View;->getLocationOnScreen([I)V

    sget-object v6, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v6

    invoke-static {v6}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v6

    :goto_0
    instance-of v6, v6, La/wd$a;

    if-eqz v6, :cond_4

    goto :goto_1

    :cond_4
    iget v6, v0, La/T9;->r:F

    aget v1, v5, v1

    int-to-float v1, v1

    sub-float/2addr v6, v1

    iget v0, v0, La/T9;->s:F

    aget v1, v5, v2

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v1, v6

    float-to-int v0, v0

    invoke-virtual {v3, v1, v0}, Landroid/widget/AbsListView;->pointToPosition(II)I

    move-result v0

    if-gez v0, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ">>> [PATH3_SKIP] pointToPosition="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ">>> [PATH3_HIT] Window.Callback long-press, position="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v3, v3, v0}, La/T9;->f(Landroid/widget/AdapterView;Landroid/view/View;I)Z

    :cond_6
    :goto_1
    return-void

    :pswitch_1
    iget-object v0, p0, La/Q9;->b:La/T9;

    iget-boolean v1, v0, La/T9;->i:Z

    if-eqz v1, :cond_7

    const/4 v1, 0x0

    iput-boolean v1, v0, La/T9;->i:Z

    invoke-virtual {v0}, La/T9;->a()V

    :cond_7
    return-void

    :pswitch_2
    iget-object v0, p0, La/Q9;->b:La/T9;

    iget-boolean v1, v0, La/T9;->b:Z

    if-eqz v1, :cond_d

    const/4 v1, 0x0

    iput-boolean v1, v0, La/T9;->b:Z

    const/4 v2, 0x1

    iput-boolean v2, v0, La/T9;->c:Z

    iget-boolean v2, v0, La/T9;->i:Z

    const-string v3, "LC_TRACE"

    if-eqz v2, :cond_8

    iput-boolean v1, v0, La/T9;->i:Z

    iget-object v1, v0, La/T9;->f:Landroid/os/Handler;

    iget-object v2, v0, La/T9;->j:La/Q9;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-string v1, ">>> [PATH2_CANCEL_TOLERANCE] long-press completed within tolerance window"

    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    invoke-virtual {v0}, La/T9;->b()Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_3

    :cond_9
    iget-object v1, v0, La/T9;->a:Landroid/widget/ListView;

    if-nez v1, :cond_a

    goto :goto_3

    :cond_a
    iget v2, v0, La/T9;->d:F

    float-to-int v2, v2

    iget v0, v0, La/T9;->e:F

    float-to-int v0, v0

    invoke-virtual {v1, v2, v0}, Landroid/widget/AbsListView;->pointToPosition(II)I

    move-result v0

    if-gez v0, :cond_b

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ">>> [PATH2_SKIP] pointToPosition="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_b
    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_c
    const/4 v2, 0x0

    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, ">>> [PATH2_HIT] dispatchTouchEvent long-press, position="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " adapter="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v1, v1, v0}, La/T9;->f(Landroid/widget/AdapterView;Landroid/view/View;I)Z

    :cond_d
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
