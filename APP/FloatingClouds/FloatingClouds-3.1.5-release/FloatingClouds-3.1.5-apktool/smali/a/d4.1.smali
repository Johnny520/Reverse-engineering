.class public final synthetic La/d4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/e4;


# direct methods
.method public synthetic constructor <init>(La/e4;I)V
    .locals 0

    iput p2, p0, La/d4;->a:I

    iput-object p1, p0, La/d4;->b:La/e4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "chain"

    iget v4, p0, La/d4;->a:I

    packed-switch v4, :pswitch_data_0

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Landroid/view/MenuItem;

    if-eqz v2, :cond_0

    move-object v1, v0

    check-cast v1, Landroid/view/MenuItem;

    :cond_0
    if-eqz v1, :cond_1

    iget-object v0, p0, La/d4;->b:La/e4;

    invoke-static {v1}, La/e4;->b(Landroid/view/MenuItem;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, La/e4;->a()V

    :cond_1
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Landroid/view/MenuItem;

    if-eqz v2, :cond_2

    move-object v1, v0

    check-cast v1, Landroid/view/MenuItem;

    :cond_2
    if-eqz v1, :cond_3

    iget-object v0, p0, La/d4;->b:La/e4;

    invoke-static {v1}, La/e4;->b(Landroid/view/MenuItem;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, La/e4;->a()V

    :cond_3
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v4, p0, La/d4;->b:La/e4;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Landroid/view/ContextMenu;

    if-eqz v5, :cond_4

    check-cast v3, Landroid/view/ContextMenu;

    goto :goto_0

    :cond_4
    move-object v3, v1

    :goto_0
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Landroid/view/View;

    if-eqz v6, :cond_5

    check-cast v5, Landroid/view/View;

    goto :goto_1

    :cond_5
    move-object v5, v1

    :goto_1
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x2

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Landroid/view/ContextMenu$ContextMenuInfo;

    if-eqz v7, :cond_6

    check-cast v6, Landroid/view/ContextMenu$ContextMenuInfo;

    goto :goto_2

    :cond_6
    move-object v6, v1

    :goto_2
    if-eqz v3, :cond_1b

    if-eqz v5, :cond_1b

    instance-of v7, v6, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    if-eqz v7, :cond_7

    check-cast v6, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    goto :goto_3

    :cond_7
    move-object v6, v1

    :goto_3
    if-eqz v6, :cond_8

    iget v6, v6, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    goto :goto_4

    :cond_8
    const/4 v6, -0x1

    :goto_4
    sget-object v7, La/K3;->a:La/K3$a;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v7

    iget-boolean v7, v7, La/jc;->A:Z

    if-eqz v7, :cond_1b

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iget-wide v9, v4, La/e4;->b:J

    sub-long v9, v7, v9

    const-wide/16 v11, 0x1f4

    cmp-long v9, v9, v11

    if-gez v9, :cond_9

    goto/16 :goto_12

    :cond_9
    iput-wide v7, v4, La/e4;->b:J

    move-object v7, v5

    :goto_5
    if-eqz v7, :cond_c

    instance-of v8, v7, Landroid/widget/ListView;

    if-eqz v8, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    instance-of v8, v7, Landroid/view/View;

    if-eqz v8, :cond_b

    check-cast v7, Landroid/view/View;

    goto :goto_5

    :cond_b
    move-object v7, v1

    goto :goto_5

    :cond_c
    move-object v7, v1

    :goto_6
    if-nez v7, :cond_e

    :cond_d
    :goto_7
    move-object v7, v1

    goto/16 :goto_e

    :cond_e
    move-object v8, v7

    check-cast v8, Landroid/widget/ListView;

    invoke-virtual {v8}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v9

    if-nez v9, :cond_f

    goto :goto_7

    :cond_f
    invoke-virtual {v8}, Landroid/widget/ListView;->getHeaderViewsCount()I

    move-result v8

    :try_start_0
    check-cast v7, Landroid/widget/ListView;

    invoke-virtual {v7, v6}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_8

    :catchall_0
    move-exception v7

    invoke-static {v7}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v7

    :goto_8
    new-instance v10, La/wd;

    invoke-direct {v10, v7}, La/wd;-><init>(Ljava/lang/Object;)V

    invoke-static {v10}, La/e4;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_10

    invoke-static {v7}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_16

    :cond_10
    if-lez v8, :cond_11

    if-lt v6, v8, :cond_11

    sub-int v7, v6, v8

    :try_start_1
    invoke-interface {v9, v7}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_9

    :catchall_1
    move-exception v7

    invoke-static {v7}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v7

    :goto_9
    new-instance v8, La/wd;

    invoke-direct {v8, v7}, La/wd;-><init>(Ljava/lang/Object;)V

    invoke-static {v8}, La/e4;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_11

    invoke-static {v7}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_16

    :cond_11
    :try_start_2
    invoke-interface {v9, v6}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_a

    :catchall_2
    move-exception v6

    invoke-static {v6}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v6

    :goto_a
    new-instance v7, La/wd;

    invoke-direct {v7, v6}, La/wd;-><init>(Ljava/lang/Object;)V

    invoke-static {v7}, La/e4;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_12

    invoke-static {v7}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_16

    :cond_12
    move v7, v2

    move-object v6, v5

    :goto_b
    if-eqz v6, :cond_d

    const/16 v8, 0xf

    if-ge v7, v8, :cond_d

    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_14

    invoke-static {v8}, La/e4;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_14

    invoke-static {v8}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_13

    goto :goto_c

    :cond_13
    move-object v7, v8

    goto :goto_e

    :cond_14
    :goto_c
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    instance-of v8, v6, Landroid/view/View;

    if-eqz v8, :cond_15

    check-cast v6, Landroid/view/View;

    goto :goto_d

    :cond_15
    move-object v6, v1

    :goto_d
    add-int/2addr v7, v0

    goto :goto_b

    :cond_16
    :goto_e
    const-string v0, "CAM"

    if-eqz v7, :cond_1a

    invoke-static {v7}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_17

    goto :goto_11

    :cond_17
    iput-object v7, v4, La/e4;->a:Ljava/lang/String;

    sget-object v5, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v7}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_18

    const-string v6, "\u53d6\u6d88\u5bc6\u53cb"

    goto :goto_f

    :cond_18
    sget-object v6, La/K3;->a:La/K3$a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v6

    iget-object v6, v6, La/jc;->C:Ljava/lang/String;

    invoke-static {v6}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_19

    const-string v6, "\u52a0\u5165\u5bc6\u53cb"

    :cond_19
    :goto_f
    const v8, 0x6d617101

    :try_start_3
    invoke-interface {v3, v2, v8, v2, v6}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "inject OK: \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\' wxid="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " masked="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_10

    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "inject fail: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_10
    iget-object v0, v4, La/e4;->c:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, v4, La/e4;->c:Landroid/os/Handler;

    new-instance v1, La/M2;

    const/4 v2, 0x5

    invoke-direct {v1, v2, v4}, La/M2;-><init>(ILjava/lang/Object;)V

    const-wide/16 v2, 0x3a98

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_12

    :cond_1a
    :goto_11
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "inject: no wxid from view="

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1b
    :goto_12
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
