.class public final synthetic La/j2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ca$d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, La/j2;->a:I

    iput-object p2, p0, La/j2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La/ca$a;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget v2, p0, La/j2;->a:I

    packed-switch v2, :pswitch_data_0

    instance-of p1, p1, La/ca$a$a;

    if-eqz p1, :cond_0

    iget-object p1, p0, La/j2;->b:Ljava/lang/Object;

    check-cast p1, La/ra;

    iget-object v1, p1, La/ra;->a:Landroid/app/Activity;

    new-instance v2, La/ma;

    invoke-direct {v2, p1, v0}, La/ma;-><init>(La/ra;I)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, La/j2;->b:Ljava/lang/Object;

    check-cast v0, La/h8;

    instance-of v2, p1, La/ca$a$a;

    if-eqz v2, :cond_1

    iget-object v2, v0, La/h8;->a:Ljava/lang/Object;

    if-eqz v2, :cond_1

    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v2

    iget-boolean v2, v2, La/jc;->o:Z

    if-eqz v2, :cond_1

    check-cast p1, La/ca$a$a;

    iget-object v2, p1, La/ca$a$a;->b:La/ca$b;

    iget-object p1, p1, La/ca$a$a;->a:La/ca$b;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "HideContactList: HideStateChanged "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " -> "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", refresh contact list"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    invoke-virtual {v0}, La/h8;->j()V

    :cond_1
    return-void

    :pswitch_1
    iget-object v2, p0, La/j2;->b:Ljava/lang/Object;

    check-cast v2, La/v5;

    instance-of v3, p1, La/ca$a$b;

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    :try_start_0
    invoke-static {}, La/v5;->f()Z

    move-result v3

    if-eqz v3, :cond_5

    move-object v3, p1

    check-cast v3, La/ca$a$b;

    iget-boolean v3, v3, La/ca$a$b;->b:Z

    if-nez v3, :cond_5

    iget-object v3, v2, La/v5;->b:Ljava/util/LinkedHashSet;

    check-cast p1, La/ca$a$b;

    iget-object p1, p1, La/ca$a$b;->a:Ljava/lang/String;

    invoke-interface {v3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-boolean p1, v2, La/v5;->a:Z

    if-nez p1, :cond_4

    iput-boolean v1, v2, La/v5;->a:Z

    iget-object p1, v2, La/v5;->c:Landroid/view/View;

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance v1, La/t5;

    invoke-direct {v1, p1, v0}, La/t5;-><init>(Landroid/view/View;I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_4
    :goto_0
    invoke-virtual {v2}, La/v5;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_5
    :goto_1
    return-void

    :pswitch_2
    iget-object v0, p0, La/j2;->b:Ljava/lang/Object;

    check-cast v0, La/s4;

    const-string v2, "MSG-REHIDE talker="

    const-string v3, "MSG-REHIDE deferred: dbWriteInProgress=true, talker="

    instance-of v4, p1, La/ca$a$b;

    if-nez v4, :cond_6

    goto/16 :goto_2

    :cond_6
    :try_start_1
    sget-object v4, La/K3;->a:La/K3$a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v4

    iget-boolean v4, v4, La/jc;->n:Z

    if-nez v4, :cond_7

    goto/16 :goto_2

    :cond_7
    sget-object v4, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v4

    if-eqz v4, :cond_8

    goto/16 :goto_2

    :cond_8
    move-object v4, p1

    check-cast v4, La/ca$a$b;

    iget-boolean v4, v4, La/ca$a$b;->b:Z

    if-eqz v4, :cond_9

    goto/16 :goto_2

    :cond_9
    check-cast p1, La/ca$a$b;

    iget-object p1, p1, La/ca$a$b;->a:Ljava/lang/String;

    sget-boolean v4, La/s4;->J:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-string v5, "[ConvRV] "

    const-string v6, "msg"

    if-eqz v4, :cond_a

    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    iget-object v0, v0, La/s4;->B:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_a
    const-string v3, "wxid"

    invoke-static {p1, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, La/f4;->b(Ljava/lang/String;Z)Z

    move-result v3

    sget-object v4, La/Gb;->a:La/Gb;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La/Gb;->l:La/Me;

    invoke-virtual {v4}, La/Me;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Handler;

    new-instance v7, La/Fb;

    invoke-direct {v7, p1, v1}, La/Fb;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v4, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ok="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    if-eqz v3, :cond_b

    iget-object v1, v0, La/s4;->k:Ljava/lang/ClassLoader;

    if-eqz v1, :cond_b

    iget-object v0, v0, La/s4;->f:Landroid/os/Handler;

    new-instance v2, La/P0;

    const/4 v3, 0x3

    invoke-direct {v2, v1, v3, p1}, La/P0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :cond_b
    :goto_2
    return-void

    :pswitch_3
    iget-object v0, p0, La/j2;->b:Ljava/lang/Object;

    check-cast v0, La/o2;

    instance-of v1, p1, La/ca$a$b;

    if-nez v1, :cond_c

    goto :goto_3

    :cond_c
    :try_start_3
    invoke-static {}, La/o2;->e()Z

    move-result v1

    if-eqz v1, :cond_e

    move-object v1, p1

    check-cast v1, La/ca$a$b;

    iget-boolean v1, v1, La/ca$a$b;->b:Z

    if-nez v1, :cond_e

    iget-object v1, v0, La/o2;->c:Ljava/util/LinkedHashSet;

    check-cast p1, La/ca$a$b;

    iget-object p1, p1, La/ca$a$b;->a:Ljava/lang/String;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-boolean p1, v0, La/o2;->a:Z

    if-nez p1, :cond_d

    invoke-virtual {v0}, La/o2;->g()V

    :cond_d
    invoke-virtual {v0}, La/o2;->i()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    :cond_e
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
