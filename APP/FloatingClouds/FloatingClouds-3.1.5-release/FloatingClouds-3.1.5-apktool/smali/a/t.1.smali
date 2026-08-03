.class public final synthetic La/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La/t;->a:I

    iput-object p2, p0, La/t;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, La/t;->a:I

    iput-object p2, p0, La/t;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    const/16 v0, 0x8

    const/4 v1, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-string v4, "chain"

    const/4 v5, 0x0

    iget v6, p0, La/t;->a:I

    packed-switch v6, :pswitch_data_0

    iget-object v0, p0, La/t;->b:Ljava/lang/Object;

    check-cast v0, Ltop/mmjz/floatingclouds/XposedEntry;

    check-cast p1, Ljava/lang/reflect/Executable;

    invoke-static {v0, p1}, Ltop/mmjz/floatingclouds/XposedEntry;->f(Ltop/mmjz/floatingclouds/XposedEntry;Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, La/fd;

    const-string v0, "ctx"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->a:La/Cd;

    iget-object v1, p0, La/t;->b:Ljava/lang/Object;

    check-cast v1, La/qb;

    invoke-virtual {v0, v1, p1}, La/Cd;->b(La/qb;La/fd;)La/gd;

    move-result-object p1

    iget-object p1, p1, La/gd;->b:Ljava/lang/Class;

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, La/t;->b:Ljava/lang/Object;

    check-cast v0, La/ya;

    iget-object v0, v0, La/ya;->a:La/Z7;

    iget-object v1, v0, La/Z7;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/regex/Matcher;

    invoke-virtual {v1, p1}, Ljava/util/regex/Matcher;->start(I)I

    move-result v2

    invoke-virtual {v1, p1}, Ljava/util/regex/Matcher;->end(I)I

    move-result v1

    invoke-static {v2, v1}, La/Oc;->D(II)La/f9;

    move-result-object v1

    iget v2, v1, La/d9;->a:I

    if-ltz v2, :cond_0

    new-instance v5, La/wa;

    iget-object v0, v0, La/Z7;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "group(...)"

    invoke-static {p1, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, p1, v1}, La/wa;-><init>(Ljava/lang/String;La/f9;)V

    :cond_0
    return-object v5

    :pswitch_2
    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, La/t;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, La/K3;->a:La/K3$a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v1

    iget-boolean v1, v1, La/jc;->d:Z

    if-eqz v1, :cond_3

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Landroid/app/Activity;

    if-eqz v1, :cond_2

    move-object v5, p1

    check-cast v5, Landroid/app/Activity;

    :cond_2
    if-eqz v5, :cond_3

    iget-object p1, p0, La/t;->b:Ljava/lang/Object;

    invoke-static {v5, p1}, La/A8;->c(Landroid/app/Activity;Ljava/util/List;)Z

    :cond_3
    return-object v0

    :pswitch_4
    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    instance-of v4, p1, Landroid/app/Activity;

    if-eqz v4, :cond_4

    check-cast p1, Landroid/app/Activity;

    goto :goto_0

    :cond_4
    move-object p1, v5

    :goto_0
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    goto :goto_1

    :cond_5
    move-object p1, v5

    :goto_1
    if-eqz p1, :cond_7

    new-array v4, v1, [J

    fill-array-data v4, :array_0

    :goto_2
    iget-object v6, p0, La/t;->b:Ljava/lang/Object;

    check-cast v6, La/u8;

    if-ge v3, v1, :cond_6

    aget-wide v7, v4, v3

    new-instance v9, La/P0;

    invoke-direct {v9, v6, v0, p1}, La/P0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p1, v9, v7, v8}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    add-int/2addr v3, v2

    goto :goto_2

    :cond_6
    invoke-virtual {v6, p1}, La/u8;->c(Landroid/view/View;)V

    :cond_7
    return-object v5

    :pswitch_5
    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, La/t;->b:Ljava/lang/Object;

    check-cast v1, La/r8;

    sget-object v4, La/K3;->a:La/K3$a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v4

    iget-boolean v4, v4, La/jc;->a:Z

    if-eqz v4, :cond_12

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v4

    const-string v6, "data"

    invoke-static {v4, v6}, La/A1;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Ljava/util/ArrayList;

    if-eqz v6, :cond_8

    check-cast v4, Ljava/util/ArrayList;

    goto :goto_3

    :cond_8
    move-object v4, v5

    :goto_3
    if-nez v4, :cond_9

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v5

    goto/16 :goto_7

    :cond_9
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v6, v2, Ljava/lang/Integer;

    if-eqz v6, :cond_a

    check-cast v2, Ljava/lang/Integer;

    goto :goto_4

    :cond_a
    move-object v2, v5

    :goto_4
    if-eqz v2, :cond_11

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ltz v2, :cond_10

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lt v2, v6, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_c

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v5

    goto :goto_7

    :cond_c
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    invoke-virtual {v1, v2}, La/r8;->b(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_d

    goto :goto_7

    :cond_d
    const-string v1, "itemView"

    invoke-static {p1, v1}, La/A1;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Landroid/view/View;

    if-eqz v1, :cond_e

    check-cast p1, Landroid/view/View;

    goto :goto_5

    :cond_e
    move-object p1, v5

    :goto_5
    if-nez p1, :cond_f

    goto :goto_7

    :cond_f
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_13

    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_7

    :cond_10
    :goto_6
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v5

    goto :goto_7

    :cond_11
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v5

    goto :goto_7

    :cond_12
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v5

    :cond_13
    :goto_7
    return-object v5

    :pswitch_6
    iget-object v0, p0, La/t;->b:Ljava/lang/Object;

    check-cast v0, La/J8;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, La/K3;->a:La/K3$a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v1

    if-nez v1, :cond_14

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v5

    goto/16 :goto_d

    :cond_14
    invoke-static {}, La/K3$a;->k()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v5

    goto/16 :goto_d

    :cond_15
    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v1

    iget-boolean v1, v1, La/jc;->s:Z

    if-nez v1, :cond_16

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v5

    goto/16 :goto_d

    :cond_16
    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v5

    goto/16 :goto_d

    :cond_17
    sget-object v1, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v1

    if-nez v1, :cond_23

    sget-boolean v1, La/s4;->F:Z

    if-eqz v1, :cond_18

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v5

    goto/16 :goto_d

    :cond_18
    :try_start_0
    const-string v1, "com.tencent.mm.ui.chatting.ChattingUIProxy"

    iget-object v4, v0, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v4, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_19

    goto/16 :goto_a

    :cond_19
    const-string v4, "com.tencent.mm.ui.chatting.BaseChattingUIFragment"

    iget-object v0, v0, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v0, v4}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_1a

    goto :goto_a

    :cond_1a
    invoke-static {v1, v0}, La/A1;->c(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    move-result-object v0

    if-nez v0, :cond_1b

    goto :goto_a

    :cond_1b
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1c

    goto :goto_a

    :cond_1c
    const-string v1, "getArguments"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, La/A1;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Landroid/os/Bundle;

    if-eqz v2, :cond_1d

    check-cast v1, Landroid/os/Bundle;

    goto :goto_8

    :catchall_0
    move-exception v0

    goto :goto_b

    :cond_1d
    move-object v1, v5

    :goto_8
    if-nez v1, :cond_1e

    goto :goto_a

    :cond_1e
    const-string v2, "Chat_User"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_21

    invoke-static {v1}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1f

    goto :goto_a

    :cond_1f
    sget-object v2, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v1}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_21

    const-string v1, "getActivity"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, La/A1;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_20

    check-cast v0, Landroid/app/Activity;

    goto :goto_9

    :cond_20
    move-object v0, v5

    :goto_9
    if-eqz v0, :cond_24

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_d

    :cond_21
    :goto_a
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_c

    :goto_b
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_c
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_22

    const-string v1, "blockEnterChat: onEnterBegin error"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :cond_22
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v5

    goto :goto_d

    :cond_23
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v5

    :cond_24
    :goto_d
    return-object v5

    :pswitch_7
    iget-object v0, p0, La/t;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_25

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    :cond_25
    return-object v1

    :pswitch_8
    iget-object v0, p0, La/t;->b:Ljava/lang/Object;

    check-cast v0, La/u;

    if-ne p1, v0, :cond_26

    const-string p1, "(this Collection)"

    goto :goto_e

    :cond_26
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_e
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :array_0
    .array-data 8
        0xc8
        0x258
        0x4b0
    .end array-data
.end method
