.class public final La/u5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ltop/mmjz/floatingclouds/plugin/IPlugin;


# direct methods
.method public synthetic constructor <init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V
    .locals 0

    iput p2, p0, La/u5;->a:I

    iput-object p1, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    const-wide/16 v0, 0x190

    const-string v2, " checks)"

    const/16 v3, 0x8

    const/4 v4, 0x1

    iget v5, p0, La/u5;->a:I

    packed-switch v5, :pswitch_data_0

    iget-object v5, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v5, La/o2;

    iget-object v5, v5, La/o2;->f:Ljava/lang/Runnable;

    if-eq p0, v5, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v5, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v5, La/o2;

    iget v5, v5, La/o2;->g:I

    iget-object v6, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v6, La/o2;

    add-int/2addr v5, v4

    iput v5, v6, La/o2;->g:I

    iget-object v5, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v5, La/o2;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/o2;->e()Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v5, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v5, La/o2;

    iget-boolean v5, v5, La/o2;->a:Z

    if-eqz v5, :cond_3

    iget-object v5, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v5, La/o2;

    iget v5, v5, La/o2;->g:I

    if-le v5, v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v3, La/o2;

    invoke-virtual {v3}, La/o2;->l()V

    iget-object v3, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v3, La/o2;

    iget-object v3, v3, La/o2;->c:Ljava/util/LinkedHashSet;

    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/o2;

    invoke-virtual {v0}, La/o2;->k()V

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/o2;

    invoke-virtual {v0}, La/o2;->j()V

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/o2;

    iget v0, v0, La/o2;->g:I

    const-string v1, "BoldBottomTab: fast-recheck: all read, bold reset (after "

    invoke-static {v0, v1, v2}, La/z;->c(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v2, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v2, La/o2;

    invoke-virtual {v2}, La/o2;->k()V

    iget-object v2, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v2, La/o2;

    iget-object v2, v2, La/o2;->e:Landroid/os/Handler;

    invoke-virtual {v2, p0, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    :cond_3
    :goto_0
    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/o2;

    invoke-virtual {v0}, La/o2;->j()V

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/o2;

    iget-boolean v0, v0, La/o2;->a:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/o2;

    invoke-virtual {v0}, La/o2;->i()V

    :cond_4
    :goto_1
    return-void

    :pswitch_0
    iget-object v5, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v5, La/v5;

    iget-object v5, v5, La/v5;->e:Ljava/lang/Runnable;

    if-eq p0, v5, :cond_5

    goto/16 :goto_3

    :cond_5
    iget-object v5, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v5, La/v5;

    iget v5, v5, La/v5;->f:I

    iget-object v6, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v6, La/v5;

    add-int/2addr v5, v4

    iput v5, v6, La/v5;->f:I

    iget-object v5, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v5, La/v5;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/v5;->f()Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object v5, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v5, La/v5;

    iget-boolean v5, v5, La/v5;->a:Z

    if-eqz v5, :cond_8

    iget-object v5, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v5, La/v5;

    iget v5, v5, La/v5;->f:I

    if-le v5, v3, :cond_6

    goto :goto_2

    :cond_6
    iget-object v3, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v3, La/v5;

    invoke-virtual {v3}, La/v5;->l()V

    iget-object v3, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v3, La/v5;

    iget-object v3, v3, La/v5;->b:Ljava/util/LinkedHashSet;

    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    invoke-virtual {v0}, La/v5;->k()V

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    invoke-virtual {v0}, La/v5;->j()V

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    iget v0, v0, La/v5;->f:I

    const-string v1, "DotIndicator: fast-recheck: all read, dot hidden (after "

    invoke-static {v0, v1, v2}, La/z;->c(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    iget-object v2, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v2, La/v5;

    invoke-virtual {v2}, La/v5;->k()V

    iget-object v2, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v2, La/v5;

    iget-object v2, v2, La/v5;->d:Landroid/os/Handler;

    invoke-virtual {v2, p0, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_3

    :cond_8
    :goto_2
    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    invoke-virtual {v0}, La/v5;->j()V

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    iget-boolean v0, v0, La/v5;->a:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    invoke-virtual {v0}, La/v5;->i()V

    :cond_9
    :goto_3
    return-void

    :pswitch_1
    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    iget-object v0, v0, La/v5;->e:Ljava/lang/Runnable;

    if-eq p0, v0, :cond_a

    goto/16 :goto_6

    :cond_a
    sget-object v0, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v0

    const-wide/16 v1, 0x1388

    if-eqz v0, :cond_b

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    iget-object v0, v0, La/v5;->d:Landroid/os/Handler;

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_6

    :cond_b
    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    iget v0, v0, La/v5;->f:I

    iget-object v3, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v3, La/v5;

    add-int/2addr v0, v4

    iput v0, v3, La/v5;->f:I

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    iget v0, v0, La/v5;->f:I

    const/16 v3, 0x3c

    if-gt v0, v3, :cond_c

    const-wide/16 v1, 0x3e8

    :cond_c
    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/v5;->f()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    iget-boolean v0, v0, La/v5;->a:Z

    if-nez v0, :cond_d

    goto :goto_5

    :cond_d
    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    invoke-virtual {v0}, La/v5;->l()V

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    iget-object v0, v0, La/v5;->b:Ljava/util/LinkedHashSet;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    invoke-virtual {v0}, La/v5;->k()V

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    invoke-virtual {v0}, La/v5;->j()V

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    iget v0, v0, La/v5;->f:I

    if-gt v0, v3, :cond_e

    const-string v0, "fast"

    goto :goto_4

    :cond_e
    const-string v0, "slow"

    :goto_4
    iget-object v1, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v1, La/v5;

    iget v1, v1, La/v5;->f:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "DotIndicator: DB checker: all read, dot hidden (after "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " checks, "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_6

    :cond_f
    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    invoke-virtual {v0}, La/v5;->k()V

    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    iget-object v0, v0, La/v5;->d:Landroid/os/Handler;

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_6

    :cond_10
    :goto_5
    iget-object v0, p0, La/u5;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v0, La/v5;

    invoke-virtual {v0}, La/v5;->j()V

    :goto_6
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
