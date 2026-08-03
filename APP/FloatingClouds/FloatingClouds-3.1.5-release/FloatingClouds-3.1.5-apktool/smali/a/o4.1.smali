.class public final synthetic La/o4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/github/libxposed/api/XposedInterface$Hooker;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, La/o4;->a:I

    iput-object p1, p0, La/o4;->b:Ljava/lang/Object;

    iput-object p3, p0, La/o4;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;La/s4;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, La/o4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/o4;->c:Ljava/lang/Object;

    iput-object p2, p0, La/o4;->b:Ljava/lang/Object;

    return-void
.end method

.method private final a(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, La/o4;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/ClassLoader;

    iget-object v1, p0, La/o4;->c:Ljava/lang/Object;

    check-cast v1, La/h8;

    const-string v2, "chain"

    invoke-static {p1, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_e

    new-instance v4, La/fd;

    sget v5, La/B1;->a:I

    const/4 v6, 0x1

    const/4 v7, -0x1

    if-ne v5, v7, :cond_0

    :try_start_0
    sget-object v5, La/w1;->p:Landroid/content/Context;

    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    const-string v8, "com.tencent.mm"

    invoke-virtual {v5, v8, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v5

    iget v7, v5, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, La/x1;->a([Ljava/lang/Object;)V

    :goto_0
    sput v7, La/B1;->a:I

    :cond_0
    sget v5, La/B1;->a:I

    invoke-direct {v4, v5, v0}, La/fd;-><init>(ILjava/lang/ClassLoader;)V

    sget-object v0, La/hd;->a:La/hd;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "F004_contact_adapter_locator"

    invoke-static {v0, v4}, La/hd;->a(Ljava/lang/String;La/fd;)La/gd;

    move-result-object v0

    iget-object v4, v0, La/gd;->b:Ljava/lang/Class;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v5

    :goto_1
    if-eqz v4, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    :cond_2
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Landroid/view/View;

    if-eqz v8, :cond_3

    check-cast v7, Landroid/view/View;

    goto :goto_2

    :cond_3
    move-object v7, v5

    :goto_2
    if-nez v7, :cond_4

    move v5, v3

    goto :goto_8

    :cond_4
    :try_start_1
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    const-string v9, "getContext(...)"

    invoke-static {v8, v9}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    if-eqz v8, :cond_8

    instance-of v9, v8, La/X6;

    if-eqz v9, :cond_5

    move-object v5, v8

    check-cast v5, La/X6;

    goto :goto_5

    :cond_5
    instance-of v9, v8, Landroid/content/ContextWrapper;

    if-eqz v9, :cond_6

    check-cast v8, Landroid/content/ContextWrapper;

    goto :goto_4

    :cond_6
    move-object v8, v5

    :goto_4
    if-eqz v8, :cond_7

    invoke-virtual {v8}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v8

    goto :goto_3

    :cond_7
    move-object v8, v5

    goto :goto_3

    :cond_8
    :goto_5
    if-nez v5, :cond_9

    move v5, v3

    goto :goto_6

    :cond_9
    invoke-virtual {v5}, La/X6;->getSupportFragmentManager()La/e7;

    move-result-object v5

    const-string v8, "getSupportFragmentManager(...)"

    invoke-static {v5, v8}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v7, v5}, La/h8;->f(La/h8;Landroid/view/View;La/e7;)Z

    move-result v5

    :goto_6
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_7

    :catchall_0
    move-exception v5

    invoke-static {v5}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v5

    :goto_7
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v8, v5, La/wd$a;

    if-eqz v8, :cond_a

    move-object v5, v7

    :cond_a
    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    :goto_8
    if-eqz v5, :cond_c

    invoke-static {v2}, La/h8;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    :cond_b
    move v3, v6

    :cond_c
    if-eqz v3, :cond_e

    if-eqz v4, :cond_d

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    const-string v3, "ENGINE("

    const-string v5, ")"

    invoke-static {v3, v4, v5}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_9

    :cond_d
    const-string v3, "HOST_FRAGMENT"

    :goto_9
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, La/h8;->e:Ljava/lang/Object;

    iput-object v2, v1, La/h8;->d:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, La/gd;->d:La/cd;

    const-string v4, "HideContactList: captured contact adapter via setAdapter -> "

    const-string v5, " via="

    const-string v7, " path="

    invoke-static {v4, v2, v5, v3, v7}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, La/M2;

    const/16 v3, 0xb

    invoke-direct {v2, v3, v1}, La/M2;-><init>(ILjava/lang/Object;)V

    const-wide/16 v3, 0x3c

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_e
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final intercept(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "msg"

    const/16 v4, 0xa

    const/4 v5, 0x3

    const-string v6, "getMethods(...)"

    const/4 v7, 0x2

    const-string v0, "chain"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    iget v11, v1, La/o4;->a:I

    packed-switch v11, :pswitch_data_0

    iget-object v3, v1, La/o4;->b:Ljava/lang/Object;

    check-cast v3, La/s8;

    iget-object v4, v1, La/o4;->c:Ljava/lang/Object;

    check-cast v4, La/J8;

    invoke-static {v2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    if-eqz v0, :cond_6

    invoke-static {}, La/s8;->b()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v11, "sns"

    invoke-static {v2, v11, v9}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v11

    if-nez v11, :cond_1

    const-string v11, "Sns"

    invoke-static {v2, v11, v9}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v11

    if-nez v11, :cond_1

    sget-boolean v11, La/Ed;->a:Z

    sget-object v11, La/Ed;->m:Ljava/lang/Class;

    if-eqz v11, :cond_0

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    goto :goto_0

    :cond_0
    move-object v11, v8

    :goto_0
    invoke-virtual {v2, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    :cond_1
    iput-object v0, v3, La/s8;->a:Ljava/lang/Object;

    iget-boolean v2, v3, La/s8;->b:Z

    if-eqz v2, :cond_2

    goto :goto_3

    :cond_2
    iput-boolean v10, v3, La/s8;->b:Z

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static {v2, v6}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v6, v2

    :goto_1
    if-ge v9, v6, :cond_4

    aget-object v11, v2, v9

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    array-length v12, v12

    if-ne v12, v7, :cond_3

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    aget-object v12, v12, v10

    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v12, v13}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    goto :goto_2

    :cond_3
    add-int/2addr v9, v10

    goto :goto_1

    :cond_4
    move-object v11, v8

    :goto_2
    if-nez v11, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v11, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v4, v11}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object v2

    new-instance v4, La/m2;

    invoke-direct {v4, v5, v3}, La/m2;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v4}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    sget-object v2, La/E8;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "F006"

    const-string v3, "timelineBind"

    invoke-static {v2, v3, v0}, La/E8;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_3
    return-object v8

    :pswitch_0
    iget-object v3, v1, La/o4;->b:Ljava/lang/Object;

    check-cast v3, La/q8;

    iget-object v4, v1, La/o4;->c:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    const-string v5, "MyPlugin-DexKit: [RecentForward] adapter captured from WxRecyclerView ("

    invoke-static {v2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    :try_start_0
    invoke-static {}, La/q8;->j()Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_4

    :cond_7
    if-nez v6, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_4

    :cond_9
    instance-of v4, v0, Landroid/view/View;

    if-nez v4, :cond_a

    goto :goto_4

    :cond_a
    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, La/q8;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "com.tencent.mm.ui.mvvm.MvvmContactListUI"

    invoke-static {v0, v4}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_4

    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "), scheduling filter"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    invoke-virtual {v3, v6}, La/q8;->m(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v2, "MyPlugin-DexKit: [RecentForward] setAdapter filter err: "

    invoke-static {v2, v0}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    :goto_4
    return-object v8

    :pswitch_1
    invoke-direct/range {p0 .. p1}, La/o4;->a(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v6, v1, La/o4;->c:Ljava/lang/Object;

    const-string v0, "slChain"

    invoke-static {v2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v11, v0, Ljava/util/List;

    if-eqz v11, :cond_c

    check-cast v0, Ljava/util/List;

    move-object v11, v0

    goto :goto_5

    :cond_c
    move-object v11, v8

    :goto_5
    if-nez v11, :cond_d

    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_1e

    :cond_d
    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v0, v0, La/jc;->n:Z

    if-nez v0, :cond_e

    goto/16 :goto_1d

    :cond_e
    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_1e

    :cond_f
    sget-object v0, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v0

    if-nez v0, :cond_30

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v0

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v0, v4}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v12, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    invoke-virtual {v4}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_10
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v12}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_7
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2c

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    if-nez v14, :cond_11

    move-object/from16 v21, v6

    move-object/from16 v16, v8

    goto/16 :goto_1a

    :cond_11
    iget-object v0, v1, La/o4;->b:Ljava/lang/Object;

    check-cast v0, La/s4;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    move-object v15, v0

    move-object/from16 v16, v8

    move v8, v9

    :goto_8
    const-string v9, "field_username"

    const-class v7, Ljava/lang/Object;

    if-eqz v15, :cond_18

    :try_start_2
    invoke-virtual {v15, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    if-ge v8, v5, :cond_18

    invoke-virtual {v15}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-static {v0}, La/w1;->I([Ljava/lang/Object;)La/G1;

    move-result-object v7

    :goto_9
    invoke-virtual {v7}, La/G1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-virtual {v7}, La/G1;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/reflect/Field;

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_14

    invoke-virtual {v5, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    invoke-virtual {v5, v14}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_a
    move/from16 v19, v10

    goto :goto_b

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_a

    :goto_b
    :try_start_5
    instance-of v10, v0, La/wd$a;

    if-eqz v10, :cond_12

    move-object/from16 v0, v16

    :cond_12
    if-nez v0, :cond_15

    :cond_13
    move/from16 v10, v19

    :cond_14
    const/4 v5, 0x3

    goto :goto_9

    :cond_15
    instance-of v10, v0, Ljava/lang/String;

    if-eqz v10, :cond_16

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, La/yh;->a(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_16

    check-cast v0, Ljava/lang/String;

    :goto_c
    move-object/from16 v21, v6

    goto/16 :goto_18

    :catchall_2
    move-exception v0

    :goto_d
    move-object/from16 v21, v6

    goto/16 :goto_17

    :cond_16
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v9}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    instance-of v5, v0, Ljava/lang/String;

    if-eqz v5, :cond_13

    move-object v5, v0

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_13

    check-cast v0, Ljava/lang/String;

    goto :goto_c

    :catchall_3
    move-exception v0

    move/from16 v19, v10

    goto :goto_d

    :cond_17
    move/from16 v19, v10

    invoke-virtual {v15}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v15

    add-int/lit8 v8, v8, 0x1

    move/from16 v10, v19

    const/4 v5, 0x3

    const/4 v7, 0x2

    goto/16 :goto_8

    :cond_18
    move/from16 v19, v10

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    move-object v5, v0

    const/4 v8, 0x0

    :goto_e
    if-eqz v5, :cond_28

    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28

    const/4 v10, 0x2

    if-ge v8, v10, :cond_28

    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-static {v0}, La/w1;->I([Ljava/lang/Object;)La/G1;

    move-result-object v10

    :goto_f
    invoke-virtual {v10}, La/G1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-virtual {v10}, La/G1;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v15

    invoke-static {v15}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v15

    if-nez v15, :cond_1c

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Class;->isPrimitive()Z

    move-result v15

    if-nez v15, :cond_1c

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v15

    move-object/from16 v20, v5

    const-class v5, Ljava/lang/String;

    invoke-static {v15, v5}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_19

    move-object/from16 v5, v20

    goto :goto_f

    :cond_19
    move/from16 v5, v19

    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    invoke-virtual {v0, v14}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_10

    :catchall_4
    move-exception v0

    :try_start_7
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_10
    instance-of v5, v0, La/wd$a;

    if-eqz v5, :cond_1a

    move-object/from16 v5, v16

    goto :goto_11

    :cond_1a
    move-object v5, v0

    :goto_11
    if-nez v5, :cond_1d

    :cond_1b
    :goto_12
    move-object/from16 v5, v20

    :cond_1c
    :goto_13
    const/16 v19, 0x1

    goto :goto_f

    :cond_1d
    instance-of v0, v5, Ljava/util/List;

    if-nez v0, :cond_1b

    instance-of v0, v5, [Ljava/lang/Object;

    if-eqz v0, :cond_1e

    goto :goto_12

    :cond_1e
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    move-object v15, v0

    move-object/from16 v21, v6

    const/4 v6, 0x0

    :goto_14
    if-eqz v15, :cond_26

    :try_start_8
    invoke-virtual {v15, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    move-object/from16 v22, v7

    const/4 v7, 0x2

    if-ge v6, v7, :cond_25

    invoke-virtual {v15}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-static {v0}, La/w1;->I([Ljava/lang/Object;)La/G1;

    move-result-object v7

    :goto_15
    invoke-virtual {v7}, La/G1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-virtual {v7}, La/G1;->next()Ljava/lang/Object;

    move-result-object v0

    move/from16 v23, v6

    move-object v6, v0

    check-cast v6, Ljava/lang/reflect/Field;

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_23

    move-object/from16 v24, v7

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    :try_start_9
    invoke-virtual {v6, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_16

    :catchall_5
    move-exception v0

    :try_start_a
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_16
    instance-of v7, v0, La/wd$a;

    if-eqz v7, :cond_1f

    move-object/from16 v0, v16

    :cond_1f
    if-nez v0, :cond_21

    :cond_20
    move/from16 v6, v23

    move-object/from16 v7, v24

    goto :goto_15

    :cond_21
    instance-of v7, v0, Ljava/lang/String;

    if-eqz v7, :cond_22

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, La/yh;->a(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_22

    check-cast v0, Ljava/lang/String;

    goto/16 :goto_18

    :catchall_6
    move-exception v0

    goto :goto_17

    :cond_22
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v9}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_20

    instance-of v6, v0, Ljava/lang/String;

    if-eqz v6, :cond_20

    move-object v6, v0

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_20

    check-cast v0, Ljava/lang/String;

    goto :goto_18

    :cond_23
    move/from16 v6, v23

    goto :goto_15

    :cond_24
    move/from16 v23, v6

    invoke-virtual {v15}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v15

    const/16 v19, 0x1

    add-int/lit8 v6, v23, 0x1

    move-object/from16 v7, v22

    goto/16 :goto_14

    :cond_25
    move-object/from16 v5, v20

    move-object/from16 v6, v21

    move-object/from16 v7, v22

    goto/16 :goto_13

    :cond_26
    move-object/from16 v5, v20

    move-object/from16 v6, v21

    goto/16 :goto_13

    :cond_27
    move-object/from16 v20, v5

    move-object/from16 v21, v6

    move-object/from16 v22, v7

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v5
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    const/16 v19, 0x1

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v6, v21

    move-object/from16 v7, v22

    const/16 v19, 0x1

    goto/16 :goto_e

    :cond_28
    move-object/from16 v21, v6

    move-object/from16 v0, v16

    goto :goto_18

    :catchall_7
    move-exception v0

    move-object/from16 v21, v6

    move-object/from16 v16, v8

    :goto_17
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_18
    instance-of v5, v0, La/wd$a;

    if-eqz v5, :cond_29

    move-object/from16 v0, v16

    :cond_29
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_2b

    invoke-virtual {v4, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2a

    goto :goto_1a

    :cond_2a
    :goto_19
    move-object/from16 v8, v16

    move-object/from16 v6, v21

    const/4 v5, 0x3

    const/4 v7, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x1

    goto/16 :goto_7

    :cond_2b
    :goto_1a
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_19

    :cond_2c
    move-object/from16 v21, v6

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_2f

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "submitList FILTER: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " -> "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " (adapter="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "[ConvRV] "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    const-string v3, "getArgs(...)"

    invoke-static {v0, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v9, 0x0

    :goto_1b
    if-ge v9, v3, :cond_2e

    if-nez v9, :cond_2d

    move-object v5, v12

    goto :goto_1c

    :cond_2d
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    :goto_1c
    aput-object v5, v4, v9

    const/16 v19, 0x1

    add-int/lit8 v9, v9, 0x1

    goto :goto_1b

    :cond_2e
    invoke-interface {v2, v4}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1e

    :cond_2f
    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1e

    :cond_30
    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1e

    :cond_31
    :goto_1d
    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    :goto_1e
    return-object v0

    :pswitch_3
    move-object/from16 v16, v8

    iget-object v5, v1, La/o4;->b:Ljava/lang/Object;

    check-cast v5, La/s4;

    iget-object v7, v1, La/o4;->c:Ljava/lang/Object;

    check-cast v7, La/J8;

    invoke-static {v2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_33

    :cond_32
    :goto_1f
    move-object/from16 v20, v8

    goto/16 :goto_37

    :cond_33
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v0, "[SetAdapter] "

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    const-string v0, "android."

    const/4 v10, 0x0

    invoke-static {v2, v0, v10}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_32

    const-string v0, "androidx."

    invoke-static {v2, v0, v10}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_32

    const-string v0, "java."

    invoke-static {v2, v0, v10}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_34

    goto :goto_1f

    :cond_34
    const-string v0, "com.tencent.mm.ui.contact"

    invoke-static {v2, v0, v10}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_32

    const-string v0, "com.tencent.mm.plugin.fts"

    invoke-static {v2, v0, v10}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_35

    goto :goto_1f

    :cond_35
    sget-object v0, La/w1;->r:Ljava/lang/Object;

    if-eqz v0, :cond_36

    sget-object v0, La/w1;->s:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_36

    goto :goto_20

    :cond_36
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_b
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v10, 0x0

    invoke-static {v0, v9, v10}, La/s4;->A(Ljava/util/HashSet;Ljava/lang/Object;I)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    goto :goto_20

    :catchall_8
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_20
    iget-object v0, v5, La/s4;->d:Ljava/util/List;

    const-string v10, "["

    const-string v11, "] "

    const-string v12, "ConvRV"

    if-eqz v0, :cond_42

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_42

    sget-object v0, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v0

    if-nez v0, :cond_42

    :try_start_c
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v13, "e"

    invoke-virtual {v0, v13}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/util/ArrayList;

    if-eqz v2, :cond_37

    check-cast v0, Ljava/util/ArrayList;

    move-object v2, v0

    goto :goto_21

    :catchall_9
    move-exception v0

    move-object/from16 v20, v8

    goto/16 :goto_2b

    :cond_37
    move-object/from16 v2, v16

    :goto_21
    if-eqz v2, :cond_40

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_40

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v0

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v0, v4}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v13, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_38

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    invoke-virtual {v4}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_22

    :cond_38
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v13}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    move-result v13

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "lr.f1: "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " items, masked="

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    const-string v0, "iterator(...)"

    invoke-static {v14, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_23
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3d

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    if-eqz v15, :cond_3c

    :try_start_d
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_c

    move-object/from16 v18, v16

    :goto_24
    if-eqz v0, :cond_3a

    :try_start_e
    const-string v1, "a"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_b

    move-object/from16 v20, v8

    const/4 v8, 0x1

    :try_start_f
    invoke-virtual {v1, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v1, v15}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_39

    invoke-virtual {v5, v1}, La/s4;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_1
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    if-eqz v18, :cond_39

    goto :goto_25

    :catchall_a
    move-exception v0

    goto :goto_27

    :catchall_b
    move-exception v0

    move-object/from16 v20, v8

    goto :goto_27

    :catch_0
    move-object/from16 v20, v8

    :catch_1
    :cond_39
    :try_start_10
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v1, p0

    move-object/from16 v8, v20

    goto :goto_24

    :cond_3a
    move-object/from16 v20, v8

    :goto_25
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    :goto_26
    move-object/from16 v0, v18

    goto :goto_28

    :catchall_c
    move-exception v0

    move-object/from16 v20, v8

    move-object/from16 v18, v16

    :goto_27
    :try_start_11
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    goto :goto_26

    :goto_28
    if-eqz v0, :cond_3b

    invoke-virtual {v4, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3b

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "lr.f1 HIDE: "

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :cond_3b
    move-object/from16 v1, p0

    move-object/from16 v8, v20

    goto/16 :goto_23

    :catchall_d
    move-exception v0

    goto :goto_2b

    :cond_3c
    move-object/from16 v1, p0

    goto/16 :goto_23

    :cond_3d
    move-object/from16 v20, v8

    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_41

    instance-of v0, v2, La/q9;

    if-eqz v0, :cond_3f

    instance-of v0, v2, La/r9;

    if-eqz v0, :cond_3e

    goto :goto_29

    :cond_3e
    const-string v0, "kotlin.collections.MutableCollection"

    invoke-static {v2, v0}, La/Kf;->c(Ljava/lang/Object;Ljava/lang/String;)V

    throw v16

    :cond_3f
    :goto_29
    invoke-interface {v2, v13}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "notifyDataSetChanged"

    move-object/from16 v2, v16

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v9, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2a

    :cond_40
    move-object/from16 v20, v8

    :cond_41
    :goto_2a
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_d

    goto :goto_2c

    :goto_2b
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_2c
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_43

    const-string v1, "[ConvRV] lr.f1 process fail"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    goto :goto_2d

    :cond_42
    move-object/from16 v20, v8

    :cond_43
    :goto_2d
    iget-object v0, v5, La/s4;->u:Ljava/util/Set;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_44

    goto/16 :goto_37

    :cond_44
    iget-object v0, v5, La/s4;->u:Ljava/util/Set;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :try_start_12
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v6}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, v0

    const/4 v4, 0x0

    :goto_2e
    if-ge v4, v2, :cond_47

    aget-object v8, v0, v4

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v13

    const-string v14, "onBindViewHolder"

    invoke-static {v13, v14}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_46

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v13

    array-length v13, v13

    const/4 v14, 0x2

    if-ne v13, v14, :cond_45

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_45
    :goto_2f
    const/16 v19, 0x1

    goto :goto_30

    :catchall_e
    move-exception v0

    goto/16 :goto_32

    :cond_46
    const/4 v14, 0x2

    goto :goto_2f

    :goto_30
    add-int/lit8 v4, v4, 0x1

    goto :goto_2e

    :cond_47
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_48

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onBindViewHolder NOT found in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " hierarchy"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_31

    :cond_48
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "hooking onBindViewHolder in "

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " for adapter "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    invoke-virtual {v7, v0}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object v0

    new-instance v1, La/p4;

    const/4 v2, 0x1

    invoke-direct {v1, v5, v2}, La/p4;-><init>(La/s4;I)V

    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    :goto_31
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_e

    goto :goto_33

    :goto_32
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_33
    :try_start_13
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v6}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, v0

    const/4 v4, 0x0

    :goto_34
    if-ge v4, v2, :cond_4a

    aget-object v6, v0, v4

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v13, "submitList"

    invoke-static {v8, v13}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_49

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    array-length v8, v8

    const/4 v13, 0x1

    if-lt v8, v13, :cond_49

    const-class v8, Ljava/util/List;

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v13

    const/16 v17, 0x0

    aget-object v13, v13, v17

    invoke-virtual {v8, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_49

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_49
    const/16 v19, 0x1

    goto :goto_35

    :catchall_f
    move-exception v0

    goto :goto_36

    :goto_35
    add-int/lit8 v4, v4, 0x1

    goto :goto_34

    :cond_4a
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4b

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v7, v0}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object v0

    new-instance v1, La/o4;

    invoke-direct {v1, v9, v5}, La/o4;-><init>(Ljava/lang/Object;La/s4;)V

    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "hooked submitList on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :cond_4b
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_f

    goto :goto_37

    :goto_36
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_37
    return-object v20

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
