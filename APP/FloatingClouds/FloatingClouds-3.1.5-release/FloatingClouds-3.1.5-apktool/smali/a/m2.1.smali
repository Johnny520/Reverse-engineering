.class public final synthetic La/m2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/github/libxposed/api/XposedInterface$Hooker;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La/m2;->a:I

    iput-object p2, p0, La/m2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/w8;Ljava/lang/Class;)V
    .locals 0

    .line 2
    const/4 p1, 0x5

    iput p1, p0, La/m2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/m2;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final intercept(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 10

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-string v4, "chain"

    iget v5, p0, La/m2;->a:I

    packed-switch v5, :pswitch_data_0

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La/A3;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p1}, La/A3;-><init>(ILjava/lang/Object;)V

    iget-object p1, p0, La/m2;->b:Ljava/lang/Object;

    check-cast p1, La/o6;

    invoke-static {p1, v0}, La/o6;->a(La/o6;La/s7;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/database/Cursor;

    if-eqz v0, :cond_0

    move-object v3, p1

    check-cast v3, Landroid/database/Cursor;

    :cond_0
    if-nez v3, :cond_1

    goto :goto_3

    :cond_1
    iget-object p1, p0, La/m2;->b:Ljava/lang/Object;

    check-cast p1, La/w8;

    invoke-static {}, La/w8;->c()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    instance-of v0, v3, La/Re;

    if-eqz v0, :cond_3

    :goto_0
    move-object p1, v3

    goto :goto_3

    :cond_3
    invoke-static {}, La/w8;->e()Ljava/util/HashSet;

    move-result-object v0

    const-string v1, "[HideSnsInteraction] snsMsg filter "

    iget-object p1, p1, La/w8;->a:Ljava/util/WeakHashMap;

    :try_start_0
    invoke-virtual {p1, v3}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/Re;

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Landroid/database/CursorWrapper;->isClosed()Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    :goto_1
    move-object p1, v4

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_5
    new-instance v4, La/Re;

    invoke-direct {v4, v3, v0}, La/Re;-><init>(Landroid/database/Cursor;Ljava/util/HashSet;)V

    invoke-virtual {p1, v3, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, v4, La/Re;->b:I

    if-lez p1, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "[HideSnsInteraction] snsMsg wrap fail: "

    invoke-static {v0, p1}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->e([Ljava/lang/Object;)V

    goto :goto_0

    :goto_3
    return-object p1

    :pswitch_1
    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, La/w8;->c()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, La/m2;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {}, La/w8;->e()Ljava/util/HashSet;

    move-result-object v1

    invoke-static {v0, v1}, La/w8;->a(Ljava/lang/Object;Ljava/util/HashSet;)I

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    goto :goto_5

    :cond_7
    :goto_4
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_5
    return-object p1

    :pswitch_2
    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_8

    check-cast p1, Landroid/view/View;

    goto :goto_6

    :cond_8
    move-object p1, v3

    :goto_6
    if-eqz p1, :cond_9

    iget-object v0, p0, La/m2;->b:Ljava/lang/Object;

    check-cast v0, La/u8;

    invoke-virtual {v0, p1}, La/u8;->c(Landroid/view/View;)V

    :cond_9
    return-object v3

    :pswitch_3
    iget-object v0, p0, La/m2;->b:Ljava/lang/Object;

    check-cast v0, La/s8;

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Integer;

    if-eqz v4, :cond_a

    check-cast v2, Ljava/lang/Integer;

    goto :goto_7

    :cond_a
    move-object v2, v3

    :goto_7
    if-eqz v2, :cond_19

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    invoke-static {}, La/s8;->b()Z

    move-result p1

    if-eqz p1, :cond_1a

    if-eqz v4, :cond_1a

    iget-object p1, v0, La/s8;->a:Ljava/lang/Object;

    if-nez p1, :cond_b

    goto/16 :goto_e

    :cond_b
    :try_start_1
    const-string v0, "data"

    invoke-static {p1, v0}, La/A1;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_c

    check-cast p1, Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_9

    :catchall_1
    move-exception p1

    goto :goto_8

    :cond_c
    move-object p1, v3

    goto :goto_9

    :goto_8
    invoke-static {p1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object p1

    :goto_9
    instance-of v0, p1, La/wd$a;

    if-eqz v0, :cond_d

    move-object p1, v3

    :cond_d
    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_e

    goto/16 :goto_e

    :cond_e
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lt v2, v0, :cond_f

    goto/16 :goto_e

    :cond_f
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_10

    goto/16 :goto_e

    :cond_10
    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "getUserName"

    invoke-static {p1, v2, v0}, La/A1;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v5, v0, Ljava/lang/String;

    if-eqz v5, :cond_11

    check-cast v0, Ljava/lang/String;

    goto :goto_a

    :cond_11
    move-object v0, v3

    :goto_a
    if-eqz v0, :cond_12

    goto :goto_c

    :cond_12
    const-string v0, "n"

    new-array v5, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v5}, La/A1;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_14

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v2, v0}, La/A1;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_13

    check-cast p1, Ljava/lang/String;

    move-object v0, p1

    goto :goto_b

    :cond_13
    move-object v0, v3

    :goto_b
    if-eqz v0, :cond_14

    goto :goto_c

    :cond_14
    move-object v0, v3

    :goto_c
    if-nez v0, :cond_15

    goto :goto_e

    :cond_15
    sget-object p1, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_16

    goto :goto_e

    :cond_16
    :try_start_2
    const-string p1, "itemView"

    invoke-static {v4, p1}, La/A1;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_17

    check-cast p1, Landroid/view/View;

    goto :goto_d

    :cond_17
    move-object p1, v3

    :goto_d
    if-nez p1, :cond_18

    goto :goto_e

    :cond_18
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_1a

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_e

    :cond_19
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    :catch_0
    :cond_1a
    :goto_e
    return-object v3

    :pswitch_4
    iget-object v5, p0, La/m2;->b:Ljava/lang/Object;

    check-cast v5, La/h8;

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v5, La/h8;->a:Ljava/lang/Object;

    iget-boolean v4, v5, La/h8;->c:Z

    if-eqz v4, :cond_1b

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_14

    :cond_1b
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Ljava/util/List;

    if-eqz v6, :cond_1c

    new-instance v6, Ljava/util/ArrayList;

    check-cast v4, Ljava/util/Collection;

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v6, v5, La/h8;->f:Ljava/util/ArrayList;

    :cond_1c
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, La/Kf;->b(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1d

    check-cast v4, Ljava/util/List;

    goto :goto_f

    :cond_1d
    move-object v4, v3

    :goto_f
    if-nez v4, :cond_1e

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_14

    :cond_1e
    sget-object v6, La/K3;->a:La/K3$a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v6

    if-eqz v6, :cond_24

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v6

    iget-boolean v6, v6, La/jc;->o:Z

    if-eqz v6, :cond_24

    sget-object v6, La/K3;->l:Ljava/lang/Boolean;

    if-eqz v6, :cond_1f

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto :goto_10

    :cond_1f
    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    sput-object v7, La/K3;->l:Ljava/lang/Boolean;

    :goto_10
    if-nez v6, :cond_24

    sget-object v6, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v6

    if-nez v6, :cond_24

    invoke-virtual {v5, v4}, La/h8;->c(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    sub-int/2addr v4, v8

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "HideContactList: e() total="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " hidden="

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, La/x1;->b([Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_23

    iput-boolean v2, v5, La/h8;->c:Z

    :try_start_3
    iget-object v2, v5, La/h8;->h:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_20

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_11

    :catchall_2
    move-exception p1

    goto :goto_13

    :cond_20
    move-object p1, v3

    :goto_11
    instance-of v2, p1, Ljava/util/List;

    if-eqz v2, :cond_21

    move-object v3, p1

    check-cast v3, Ljava/util/List;

    :cond_21
    if-eqz v3, :cond_22

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-nez p1, :cond_22

    iput-boolean v1, v5, La/h8;->c:Z

    move-object p1, v3

    goto :goto_14

    :cond_22
    :goto_12
    iput-boolean v1, v5, La/h8;->c:Z

    :cond_23
    move-object p1, v6

    goto :goto_14

    :goto_13
    :try_start_4
    const-string v2, "HideContactList: group-header remark failed, keep filtered"

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->e([Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_12

    :catchall_3
    move-exception p1

    iput-boolean v1, v5, La/h8;->c:Z

    throw p1

    :cond_24
    move-object p1, v4

    :goto_14
    return-object p1

    :pswitch_5
    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    invoke-static {}, La/K3$a;->l()Z

    move-result v3

    if-eqz v3, :cond_2a

    iget-boolean v0, v0, La/jc;->a:Z

    if-nez v0, :cond_25

    goto/16 :goto_16

    :cond_25
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_26

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    invoke-virtual {v5}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_15

    :cond_26
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_29

    iget-object v3, p0, La/m2;->b:Ljava/lang/Object;

    check-cast v3, La/x3;

    iget-object v3, v3, La/x3;->a:La/Me;

    invoke-virtual {v3}, La/Me;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/Wc;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "input"

    invoke-static {v0, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v3, La/Wc;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-nez v3, :cond_27

    const-string v3, "SELECT type, subtype, entity_id, aux_index, MAX(timestamp) as maxTime, count(aux_index) as msgCount, talker FROM FTS5MetaMessage"

    invoke-static {v0, v3, v1}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-nez v3, :cond_27

    const-string v3, "SELECT FTS5MetaMessage.docid, type, subtype, entity_id, aux_index, timestamp, talker FROM FTS5MetaMessage"

    invoke-static {v0, v3, v1}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_29

    :cond_27
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v3

    const-string v5, "getArgs(...)"

    invoke-static {v3, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, La/t3;->y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    new-instance v5, La/g2;

    const/4 v6, 0x4

    invoke-direct {v5, v6}, La/g2;-><init>(I)V

    const-string v6, ","

    const/16 v7, 0x1e

    invoke-static {v4, v6, v5, v7}, La/t3;->p0(Ljava/util/Collection;Ljava/lang/String;La/D7;I)Ljava/lang/String;

    move-result-object v4

    const-string v5, ";"

    invoke-virtual {v0, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_28

    invoke-static {v0}, La/Ce;->W(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_28
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "SELECT * FROM ("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") AS a WHERE aux_index NOT IN ("

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ");"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const-string v0, "sql hide hit:"

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/n9;->m([Ljava/lang/Object;)V

    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_17

    :cond_29
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    goto :goto_17

    :cond_2a
    :goto_16
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :goto_17
    return-object p1

    :pswitch_6
    iget-object v2, p0, La/m2;->b:Ljava/lang/Object;

    check-cast v2, La/o2;

    invoke-static {p1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v2, La/o2;->b:Ljava/lang/Object;

    iget-boolean v4, v2, La/o2;->a:Z

    if-eqz v4, :cond_2b

    invoke-static {}, La/o2;->e()Z

    move-result v4

    if-eqz v4, :cond_2b

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    const-string v4, "getThisObject(...)"

    invoke-static {p1, v4}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, La/K3;->a:La/K3$a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v4

    iget v4, v4, La/jc;->G:I

    const/16 v5, 0x64

    invoke-static {v4, v1, v5}, La/Oc;->C(III)I

    move-result v1

    invoke-virtual {v2, p1, v1, v0}, La/o2;->a(Ljava/lang/Object;II)V

    :cond_2b
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
