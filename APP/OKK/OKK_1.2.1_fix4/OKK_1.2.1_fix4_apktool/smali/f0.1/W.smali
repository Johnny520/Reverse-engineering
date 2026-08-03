.class public final synthetic Lf0/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/ClassLoader;I)V
    .locals 0

    .line 1
    iput p3, p0, Lf0/W;->a:I

    iput-object p1, p0, Lf0/W;->b:Landroid/content/Context;

    iput-object p2, p0, Lf0/W;->c:Ljava/lang/ClassLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V
    .locals 0

    .line 2
    iput p4, p0, Lf0/W;->a:I

    iput-object p1, p0, Lf0/W;->b:Landroid/content/Context;

    iput-object p2, p0, Lf0/W;->c:Ljava/lang/ClassLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/ClassLoader;Landroid/content/Context;)V
    .locals 1

    .line 3
    const/16 v0, 0xa

    iput v0, p0, Lf0/W;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/W;->c:Ljava/lang/ClassLoader;

    iput-object p2, p0, Lf0/W;->b:Landroid/content/Context;

    return-void
.end method

.method private final a()Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-string v0, "$ctx"

    iget-object v5, v1, Lf0/W;->b:Landroid/content/Context;

    invoke-static {v5, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v1, Lf0/W;->c:Ljava/lang/ClassLoader;

    const-string v0, "$cl"

    invoke-static {v5, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/e0;->a:Lc0/e0;

    sget-object v6, LD0/l;->a:LD0/l;

    const-string v7, "getDeclaredMethods(...)"

    sget-object v0, Lc0/e0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_11

    :cond_0
    const-string v0, "installing..."

    invoke-static {v0}, Lc0/e0;->e(Ljava/lang/String;)V

    const-string v0, "java.lang.String"

    const-string v8, "getParameterTypes(...)"

    :try_start_0
    const-string v10, "com.tencent.mm.sdk.platformtools.u6"

    invoke-static {v10, v3, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v11

    invoke-static {v11, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v12, v11

    move v13, v3

    :goto_0
    if-ge v13, v12, :cond_5

    aget-object v14, v11, v13

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v15

    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v15, v9}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterCount()I

    move-result v9

    const/4 v15, 0x5

    if-ne v9, v15, :cond_4

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    invoke-static {v9, v8}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v9}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Class;

    if-eqz v9, :cond_1

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    const/4 v9, 0x0

    :goto_1
    const-string v15, "android.content.Context"

    invoke-static {v9, v15}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    invoke-static {v9, v8}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v9}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Class;

    if-eqz v9, :cond_2

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    goto :goto_2

    :cond_2
    const/4 v9, 0x0

    :goto_2
    invoke-static {v9, v0}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    invoke-static {v9, v8}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v9}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Class;

    if-eqz v9, :cond_3

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    goto :goto_3

    :cond_3
    const/4 v9, 0x0

    :goto_3
    invoke-static {v9, v0}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    goto :goto_4

    :cond_4
    add-int/2addr v13, v4

    goto :goto_0

    :cond_5
    const/4 v14, 0x0

    :goto_4
    if-nez v14, :cond_6

    const-string v0, "ScopedStorageUtil.c not found"

    invoke-static {v0}, Lc0/e0;->e(Ljava/lang/String;)V

    goto :goto_7

    :cond_6
    new-instance v0, Lc0/d0;

    invoke-direct {v0, v3}, Lc0/d0;-><init>(I)V

    invoke-static {v14, v0}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "hooked ScopedStorageUtil.c "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/e0;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v6

    goto :goto_6

    :goto_5
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_6
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "locate ScopedStorageUtil fail: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/e0;->e(Ljava/lang/String;)V

    :cond_7
    :goto_7
    :try_start_1
    const-string v0, "com.tencent.mm.platformtools.ExportFileUtil"

    invoke-static {v0, v3, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v0

    move v8, v3

    :goto_8
    if-ge v8, v5, :cond_9

    aget-object v9, v0, v8

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v10

    const-string v11, "m"

    invoke-static {v10, v11}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterCount()I

    move-result v10

    if-ne v10, v2, :cond_8

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v10

    aget-object v10, v10, v3

    const-class v11, Landroid/content/Context;

    invoke-static {v10, v11}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v10

    aget-object v10, v10, v4

    const-class v11, Ljava/lang/String;

    invoke-static {v10, v11}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    goto :goto_9

    :catchall_1
    move-exception v0

    goto :goto_a

    :cond_8
    add-int/2addr v8, v4

    goto :goto_8

    :cond_9
    const/4 v9, 0x0

    :goto_9
    if-eqz v9, :cond_a

    new-instance v0, Lc0/d0;

    invoke-direct {v0, v4}, Lc0/d0;-><init>(I)V

    invoke-static {v9, v0}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    const-string v0, "hooked ExportFileUtil.m"

    invoke-static {v0}, Lc0/e0;->e(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_a
    move-object v0, v6

    goto :goto_b

    :goto_a
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_b
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "locate ExportFileUtil fail: "

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/e0;->e(Ljava/lang/String;)V

    :cond_b
    :try_start_2
    const-class v0, Landroid/widget/Toast;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    array-length v7, v0

    :goto_c
    if-ge v3, v7, :cond_d

    aget-object v8, v0, v3

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    const-string v10, "makeText"

    invoke-static {v9, v10}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    array-length v9, v9

    if-lt v9, v2, :cond_c

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    aget-object v9, v9, v4

    const-class v10, Ljava/lang/CharSequence;

    invoke-static {v9, v10}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :catchall_2
    move-exception v0

    goto :goto_f

    :cond_c
    :goto_d
    add-int/2addr v3, v4

    goto :goto_c

    :cond_d
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Method;

    invoke-static {v3}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v4, Lc0/d0;

    invoke-direct {v4, v2}, Lc0/d0;-><init>(I)V

    invoke-static {v3, v4}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    goto :goto_e

    :cond_e
    const-string v0, "hooked Toast.makeText"

    invoke-static {v0}, Lc0/e0;->e(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v0, v6

    goto :goto_10

    :goto_f
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_10
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "locate Toast.makeText fail: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/e0;->e(Ljava/lang/String;)V

    :cond_f
    :goto_11
    return-object v6
.end method

.method private final c()Ljava/lang/Object;
    .locals 9

    const/4 v0, 0x1

    const-string v1, "$ctx"

    iget-object v2, p0, Lf0/W;->b:Landroid/content/Context;

    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lf0/W;->c:Ljava/lang/ClassLoader;

    const-string v2, "$cl"

    invoke-static {v1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lc0/I;->a:Lc0/I;

    sget-object v2, Lc0/I;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-static {}, Lc0/y;->d()Z

    move-result v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "install hideTitle="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lc0/I;->d(Ljava/lang/String;)V

    const-string v2, "onAttachedToWindow"

    :try_start_0
    const-string v4, "com.tencent.mm.ui.LauncherUIBottomTabView"

    invoke-static {v1, v4}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v1

    :goto_0
    instance-of v4, v1, LD0/f;

    if-eqz v4, :cond_1

    const/4 v1, 0x0

    :cond_1
    check-cast v1, Ljava/lang/Class;

    if-nez v1, :cond_2

    const-string v0, "class not found: com.tencent.mm.ui.LauncherUIBottomTabView"

    invoke-static {v0}, Lc0/I;->d(Ljava/lang/String;)V

    goto :goto_5

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v4

    const-string v5, "getDeclaredConstructors(...)"

    invoke-static {v4, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v4

    :goto_1
    sget-object v6, Lc0/I;->a:Lc0/I;

    if-ge v3, v5, :cond_3

    aget-object v6, v4, v3

    :try_start_1
    invoke-static {v6}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v7, Lc0/j;

    const/16 v8, 0xd

    invoke-direct {v7, v8}, Lc0/j;-><init>(I)V

    invoke-static {v6, v7}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v6

    invoke-static {v6}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_2
    add-int/2addr v3, v0

    goto :goto_1

    :cond_3
    :try_start_2
    new-instance v0, Lc0/j;

    const/16 v3, 0xe

    invoke-direct {v0, v3}, Lc0/j;-><init>(I)V

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v2, v0}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_3
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_4

    :try_start_3
    const-class v0, Landroid/view/View;

    new-instance v1, Lc0/j;

    const/16 v3, 0xf

    invoke-direct {v1, v3}, Lc0/j;-><init>(I)V

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v2, v1}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_4
    :goto_4
    const-string v0, "hooked com.tencent.mm.ui.LauncherUIBottomTabView constructors/attach"

    invoke-static {v0}, Lc0/I;->d(Ljava/lang/String;)V

    :goto_5
    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0
.end method

.method private final d()Ljava/lang/Object;
    .locals 14

    const/4 v0, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "$ctx"

    iget-object v4, p0, Lf0/W;->b:Landroid/content/Context;

    invoke-static {v4, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lf0/W;->c:Ljava/lang/ClassLoader;

    const-string v4, "$cl"

    invoke-static {v3, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lc0/J1;->a:Lc0/J1;

    const-class v4, Ljava/lang/String;

    sget-object v5, LD0/l;->a:LD0/l;

    const-class v6, Landroid/app/Activity;

    const-class v7, Landroid/os/Bundle;

    const-string v8, "NewChattingTabUI.f fail: "

    sget-object v9, Lc0/J1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v9, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v9

    if-nez v9, :cond_0

    goto/16 :goto_4

    :cond_0
    sget-object v9, Lc0/G1;->a:Ljava/lang/Object;

    new-instance v9, Lc0/D1;

    invoke-direct {v9, v2}, Lc0/D1;-><init>(I)V

    sget-object v10, Lc0/B1;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v10, v9}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    sget-object v9, Lc0/B1;->a:Lc0/B1;

    invoke-static {v1}, Lc0/B1;->g(Z)V

    invoke-virtual {v9}, Lc0/B1;->e()Z

    move-result v10

    invoke-virtual {v9}, Lc0/B1;->a()F

    move-result v9

    invoke-static {v2}, Lc0/B1;->g(Z)V

    sget-object v11, Lc0/B1;->f:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "install wekit-style en="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v10, " a="

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v9, " path="

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lc0/J1;->c(Ljava/lang/String;)V

    :try_start_0
    const-string v9, "onResume"

    new-instance v10, Lc0/H1;

    invoke-direct {v10, v1}, Lc0/H1;-><init>(I)V

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6, v9, v10}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v9, "hooked Activity.onResume"

    invoke-static {v9}, Lc0/J1;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v9, v5

    goto :goto_0

    :catchall_0
    move-exception v9

    invoke-static {v9}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v9

    :goto_0
    invoke-static {v9}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v9

    if-eqz v9, :cond_1

    sget-object v10, Lc0/J1;->a:Lc0/J1;

    invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "onResume fail: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lc0/J1;->c(Ljava/lang/String;)V

    :cond_1
    :try_start_1
    const-string v9, "com.tencent.mm.ui.LauncherUI"

    invoke-static {v3, v9}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const-string v10, "onCreate"

    new-instance v11, Lc0/I1;

    invoke-direct {v11, v2, v2}, Lc0/I1;-><init>(IZ)V

    filled-new-array {v7, v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9, v10, v11}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v10, "hooked LauncherUI.onCreate"

    invoke-static {v10}, Lc0/J1;->c(Ljava/lang/String;)V

    const-string v10, "closeChatting"

    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    new-instance v12, Lc0/I1;

    invoke-direct {v12, v1, v2}, Lc0/I1;-><init>(IZ)V

    filled-new-array {v11, v12}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9, v10, v1}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v1, "hooked LauncherUI.closeChatting"

    invoke-static {v1}, Lc0/J1;->c(Ljava/lang/String;)V

    const-string v1, "startChatting"

    new-instance v10, Lc0/H1;

    const/4 v12, 0x2

    invoke-direct {v10, v12}, Lc0/H1;-><init>(I)V

    filled-new-array {v4, v7, v11, v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9, v1, v10}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v1, "hooked LauncherUI.startChatting"

    invoke-static {v1}, Lc0/J1;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    const-string v1, "com.tencent.mm.ui.NewChattingTabUI"

    invoke-static {v3, v1}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v3, "r"

    new-instance v9, Lc0/H1;

    invoke-direct {v9, v0}, Lc0/H1;-><init>(I)V

    filled-new-array {v4, v7, v11, v9}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v3, v4}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v3, "hooked NewChattingTabUI.r"

    invoke-static {v3}, Lc0/J1;->c(Ljava/lang/String;)V

    const-string v3, "q"

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-instance v7, Lc0/H1;

    const/4 v9, 0x4

    invoke-direct {v7, v9}, Lc0/H1;-><init>(I)V

    filled-new-array {v4, v7}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v3, v4}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v3, "hooked NewChattingTabUI.q"

    invoke-static {v3}, Lc0/J1;->c(Ljava/lang/String;)V

    const-string v3, "f"

    new-instance v4, Lc0/H1;

    const/4 v7, 0x5

    invoke-direct {v4, v7}, Lc0/H1;-><init>(I)V

    filled-new-array {v11, v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v3, v4}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v1, "hooked NewChattingTabUI.f"

    invoke-static {v1}, Lc0/J1;->c(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v1, v5

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_3
    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v1

    :goto_1
    invoke-static {v1}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc0/J1;->c(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v1

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_2
    :goto_2
    :try_start_4
    const-string v1, "onActivityResult"

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v4, Landroid/content/Intent;

    new-instance v7, Lc0/H1;

    invoke-direct {v7, v2}, Lc0/H1;-><init>(I)V

    filled-new-array {v3, v3, v4, v7}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6, v1, v2}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v1

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_3
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lc0/z;

    invoke-direct {v2, v0}, Lc0/z;-><init>(I)V

    const-wide/16 v3, 0x708

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_4
    return-object v5
.end method

.method private final e()Ljava/lang/Object;
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, Lf0/W;->b:Landroid/content/Context;

    iget-object v3, p0, Lf0/W;->c:Ljava/lang/ClassLoader;

    const-string v4, "$ctx"

    invoke-static {v2, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "$cl"

    invoke-static {v3, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lc0/I0;->a:Lc0/I0;

    const-string v4, "getDeclaredConstructors(...)"

    sget-object v5, LD0/l;->a:LD0/l;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v6

    :goto_0
    sput-object v2, Lc0/I0;->g:Landroid/content/Context;

    sget-object v2, Lc0/I0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_b

    :cond_1
    :try_start_0
    const-string v2, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"

    invoke-static {v3, v2}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-static {v6, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v7, v6

    move v8, v0

    :goto_1
    if-ge v8, v7, :cond_2

    aget-object v9, v6, v8

    invoke-static {v9}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v10, Lc0/G0;

    invoke-direct {v10, v0}, Lc0/G0;-><init>(I)V

    invoke-static {v9, v10}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    add-int/2addr v8, v1

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v2

    array-length v2, v2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "hooked ChatFooter constructors: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lc0/I0;->j(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, v5

    goto :goto_3

    :goto_2
    invoke-static {v2}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v2

    :goto_3
    invoke-static {v2}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    sget-object v6, Lc0/I0;->a:Lc0/I0;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ChatFooter hook skipped: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lc0/I0;->j(Ljava/lang/String;)V

    :cond_3
    :try_start_1
    const-string v2, "com.tencent.mm.ui.widget.cedit.api.MMFlexEditText"

    invoke-static {v3, v2}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-static {v6, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v4, v6

    :goto_4
    if-ge v0, v4, :cond_4

    aget-object v7, v6, v0

    invoke-static {v7}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v8, Lc0/G0;

    invoke-direct {v8, v1}, Lc0/G0;-><init>(I)V

    invoke-static {v7, v8}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    add-int/2addr v0, v1

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_5

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    array-length v0, v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "hooked MMFlexEditText constructors: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/I0;->j(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v0, v5

    goto :goto_6

    :goto_5
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_6
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "MMFlexEditText hook skipped: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/I0;->j(Ljava/lang/String;)V

    :cond_5
    :try_start_2
    const-class v0, Landroid/widget/TextView;

    const-string v2, "setHint"

    const-class v4, Ljava/lang/CharSequence;

    new-instance v6, Lc0/G0;

    const/4 v7, 0x2

    invoke-direct {v6, v7}, Lc0/G0;-><init>(I)V

    filled-new-array {v4, v6}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v0, v2, v4}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked TextView.setHint(CharSequence)"

    invoke-static {v0}, Lc0/I0;->j(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v0, v5

    goto :goto_7

    :catchall_2
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_7
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "TextView.setHint hook skipped: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/I0;->j(Ljava/lang/String;)V

    :cond_6
    sget-object v0, Lc0/I0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_7

    goto/16 :goto_a

    :cond_7
    const-string v2, "com.tencent.wcdb.database.SQLiteDatabase"

    const-string v4, "android.database.sqlite.SQLiteDatabase"

    filled-new-array {v2, v4}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v6, 0x0

    if-eqz v4, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    :try_start_3
    invoke-static {v3, v4}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_8

    :catchall_3
    move-exception v4

    invoke-static {v4}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v4

    :goto_8
    instance-of v7, v4, LD0/f;

    if-eqz v7, :cond_9

    goto :goto_9

    :cond_9
    move-object v6, v4

    :goto_9
    check-cast v6, Ljava/lang/Class;

    if-eqz v6, :cond_8

    :cond_a
    if-nez v6, :cond_b

    const-string v0, "database class not ready"

    invoke-static {v0}, Lc0/I0;->j(Ljava/lang/String;)V

    goto :goto_a

    :cond_b
    const-class v2, Ljava/lang/String;

    const-class v3, Landroid/content/ContentValues;

    filled-new-array {v2, v2, v3}, [Ljava/lang/Class;

    move-result-object v4

    const-string v7, "insert"

    invoke-static {v6, v7, v4}, Lc0/I0;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)I

    move-result v4

    const-string v7, "insertOrThrow"

    filled-new-array {v2, v2, v3}, [Ljava/lang/Class;

    move-result-object v8

    invoke-static {v6, v7, v8}, Lc0/I0;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)I

    move-result v7

    add-int/2addr v4, v7

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v7}, LQ0/g;->b(Ljava/lang/Object;)V

    filled-new-array {v2, v2, v3, v7}, [Ljava/lang/Class;

    move-result-object v2

    const-string v3, "insertWithOnConflict"

    invoke-static {v6, v3, v2}, Lc0/I0;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)I

    move-result v2

    add-int/2addr v4, v2

    if-lez v4, :cond_c

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "hooked "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " DB insert methods on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/I0;->j(Ljava/lang/String;)V

    :cond_c
    :goto_a
    const-string v0, "installed"

    invoke-static {v0}, Lc0/I0;->j(Ljava/lang/String;)V

    :goto_b
    return-object v5
.end method

.method private final f()Ljava/lang/Object;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "$ctx"

    iget-object v3, p0, Lf0/W;->b:Landroid/content/Context;

    invoke-static {v3, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lf0/W;->c:Ljava/lang/ClassLoader;

    const-string v3, "$cl"

    invoke-static {v2, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lc0/d1;->a:Lc0/d1;

    sget-object v3, Lc0/d1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v3

    sget-object v4, LD0/l;->a:LD0/l;

    if-nez v3, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-static {}, Lc0/d1;->a()Z

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "install enabled="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lc0/d1;->b(Ljava/lang/String;)V

    :try_start_0
    const-string v3, "com.tencent.mm.plugin.sns.storage.ADInfo"

    invoke-static {v2, v3}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-static {v3}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v3

    move v5, v0

    :goto_0
    invoke-virtual {v3}, LE0/c;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v3}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/reflect/Constructor;

    invoke-static {v6}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v7, Lc0/c1;

    invoke-direct {v7, v0}, Lc0/c1;-><init>(I)V

    invoke-static {v6, v7}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    add-int/2addr v5, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static {v2}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-virtual {v2}, LE0/c;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v2}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Method;

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v6

    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Ljava/lang/Boolean;

    invoke-static {v6, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "getName(...)"

    invoke-static {v6, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "toLowerCase(...)"

    invoke-static {v6, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "ad"

    invoke-static {v6, v7, v0}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v7

    if-nez v7, :cond_4

    const-string v7, "advert"

    invoke-static {v6, v7, v0}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-eqz v6, :cond_2

    :cond_4
    new-instance v6, Lc0/c1;

    invoke-direct {v6, v1}, Lc0/c1;-><init>(I)V

    invoke-static {v3, v6}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    add-int/2addr v5, v1

    goto :goto_1

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "hooked ADInfo paths count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/d1;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v4

    goto :goto_3

    :goto_2
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_3
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_6

    sget-object v1, Lc0/d1;->a:Lc0/d1;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ADInfo hook fail: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/d1;->b(Ljava/lang/String;)V

    :cond_6
    :goto_4
    return-object v4
.end method

.method private final g()Ljava/lang/Object;
    .locals 12

    const/4 v0, 0x2

    const/4 v1, 0x1

    iget-object v2, p0, Lf0/W;->b:Landroid/content/Context;

    const-string v3, "$ctx"

    invoke-static {v2, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lf0/W;->c:Ljava/lang/ClassLoader;

    const-string v4, "$cl"

    invoke-static {v3, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lc0/c0;->a:Lc0/c0;

    sget-object v4, LD0/l;->a:LD0/l;

    sget-object v5, Lc0/c0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v6, 0x0

    invoke-virtual {v5, v6, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_9

    :cond_0
    invoke-static {}, Lc0/c0;->a()Z

    move-result v5

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "install enabled="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lc0/c0;->b(Ljava/lang/String;)V

    const-string v5, "getName(...)"

    :try_start_0
    const-string v7, "com.tencent.tinker.loader.shareutil.ShareTinkerInternals"

    invoke-static {v3, v7}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-static {v7}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v7

    move v8, v6

    :cond_1
    :goto_0
    invoke-virtual {v7}, LE0/c;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v7}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/reflect/Method;

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "isTinkerEnabled"

    invoke-static {v10, v11, v6}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v10

    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v11}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v10

    const-class v11, Ljava/lang/Boolean;

    invoke-static {v10, v11}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    goto :goto_0

    :catchall_0
    move-exception v7

    goto :goto_1

    :cond_2
    new-instance v10, Lc0/m;

    invoke-direct {v10, v0}, Lc0/m;-><init>(I)V

    invoke-static {v9, v10}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    add-int/2addr v8, v1

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "hooked "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lc0/c0;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "ShareTinkerInternals hooks="

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lc0/c0;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v7, v4

    goto :goto_2

    :goto_1
    invoke-static {v7}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v7

    :goto_2
    invoke-static {v7}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v7

    sget-object v8, Lc0/c0;->a:Lc0/c0;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "TinkerInternals fail: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lc0/c0;->b(Ljava/lang/String;)V

    :cond_4
    :try_start_1
    const-string v7, "com.tencent.tinker.loader.TinkerLoader"

    invoke-static {v3, v7}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-static {v3}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v3

    :cond_5
    :goto_3
    invoke-virtual {v3}, LE0/c;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-virtual {v3}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/reflect/Method;

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "tryLoad"

    invoke-static {v8, v9, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "load"

    invoke-static {v7, v8, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v3

    invoke-static {v3}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_6
    invoke-static {}, Lc0/c0;->a()Z

    move-result v3

    if-eqz v3, :cond_10

    new-instance v3, Ljava/io/File;

    const-string v5, "/data/data/com.tencent.mm/tinker"

    invoke-direct {v3, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v5, Ljava/io/File;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v7

    if-eqz v7, :cond_7

    iget-object v7, v7, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    if-nez v7, :cond_8

    :cond_7
    const-string v7, ""

    :cond_8
    const-string v8, "tinker"

    invoke-direct {v5, v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v7, Ljava/io/File;

    const-string v8, "/data/user/0/com.tencent.mm/tinker"

    invoke-direct {v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    filled-new-array {v3, v5, v7}, [Ljava/io/File;

    move-result-object v3

    invoke-static {v3}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_9
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/io/File;

    :try_start_2
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_9

    new-instance v7, LN0/i;

    invoke-direct {v7, v5}, LN0/i;-><init>(Ljava/io/File;)V

    new-instance v8, LN0/g;

    invoke-direct {v8, v7}, LN0/g;-><init>(LN0/i;)V

    :goto_5
    move v7, v1

    :goto_6
    invoke-virtual {v8}, LE0/b;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-virtual {v8}, LE0/b;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/io/File;

    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    move-result v10

    if-nez v10, :cond_a

    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v9

    if-nez v9, :cond_b

    :cond_a
    if-eqz v7, :cond_b

    goto :goto_5

    :cond_b
    move v7, v6

    goto :goto_6

    :cond_c
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "wiped "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lc0/c0;->b(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v5

    invoke-static {v5}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_4

    :cond_d
    const-string v3, "component "

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    if-nez v2, :cond_e

    goto :goto_9

    :cond_e
    sget-object v5, Lc0/c0;->b:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_f
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    :try_start_3
    new-instance v8, Landroid/content/ComponentName;

    const-string v9, "com.tencent.mm"

    invoke-direct {v8, v9, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v8, v0, v1}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " enabled="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lc0/c0;->b(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-object v8, v4

    goto :goto_8

    :catchall_3
    move-exception v8

    invoke-static {v8}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v8

    :goto_8
    invoke-static {v8}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v8

    if-eqz v8, :cond_f

    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " fail: "

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lc0/c0;->b(Ljava/lang/String;)V

    goto :goto_7

    :cond_10
    :goto_9
    return-object v4
.end method

.method private final h()Ljava/lang/Object;
    .locals 24

    move-object/from16 v1, p0

    const/4 v3, 0x5

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x1

    iget-object v8, v1, Lf0/W;->c:Ljava/lang/ClassLoader;

    iget-object v9, v1, Lf0/W;->b:Landroid/content/Context;

    const-string v0, "$classLoader"

    invoke-static {v8, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$appContext"

    invoke-static {v9, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf0/f0;->a:Lf0/f0;

    sget-object v0, Lf0/f0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v5, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    sget-object v10, LD0/l;->a:LD0/l;

    if-nez v0, :cond_0

    goto/16 :goto_33

    :cond_0
    :try_start_0
    invoke-static {v9}, LU/S;->d0(Landroid/content/Context;)Lb0/s;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v11, v0

    invoke-static {v11}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_0
    instance-of v11, v0, LD0/f;

    const/4 v12, 0x0

    if-eqz v11, :cond_1

    move-object v0, v12

    :cond_1
    check-cast v0, Lb0/s;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lb0/s;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    const-string v0, "n/a"

    :cond_3
    const-string v11, "install begin ver="

    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    sget-object v0, Lf0/f0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v5, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    sget-object v11, Lf0/f0;->a:Lf0/f0;

    if-nez v0, :cond_4

    :goto_1
    move v4, v5

    goto/16 :goto_a

    :cond_4
    const-string v0, "hy3.d"

    :try_start_1
    invoke-static {v0, v5, v8}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v11, v0

    invoke-static {v11}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_2
    instance-of v11, v0, LD0/f;

    if-eqz v11, :cond_5

    move-object v0, v12

    :cond_5
    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_6

    :goto_3
    move-object v11, v0

    goto :goto_4

    :cond_6
    sget-object v0, Lb0/c;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-object v0, Lf0/P;->a:Ljava/lang/String;

    const-string v11, "get data, size : "

    const-string v13, "MicroMsg.SettingDataSource"

    filled-new-array {v13, v11}, [Ljava/lang/String;

    move-result-object v11

    invoke-static {v9, v8, v0, v11}, Lb0/c;->a(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_7

    sget-object v0, Lf0/P;->a:Ljava/lang/String;

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v11

    invoke-static {v9, v8, v0, v11}, Lb0/c;->a(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :cond_7
    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    move-object v11, v12

    :goto_4
    if-nez v11, :cond_9

    const-string v0, "modern settings list injection disabled; dataSource missing"

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    goto :goto_1

    :cond_9
    :try_start_2
    const-string v0, "onCreate"

    new-instance v13, Lc0/I1;

    invoke-direct {v13, v6}, Lc0/I1;-><init>(I)V

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v13

    invoke-static {v11, v0, v13}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move v13, v7

    goto :goto_6

    :catchall_2
    move-exception v0

    move v13, v7

    goto :goto_5

    :catchall_3
    move-exception v0

    move v13, v5

    :goto_5
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_6
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "modern cleanup onCreate hook fail: "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    :cond_a
    invoke-virtual {v11}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v14

    :goto_7
    invoke-virtual {v14}, LE0/c;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {v14}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterCount()I

    move-result v15

    if-ltz v15, :cond_c

    if-ge v15, v6, :cond_c

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v15

    if-le v15, v4, :cond_b

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v15

    const-string v4, "a"

    invoke-static {v15, v4}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v15, "c"

    invoke-static {v4, v15}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v15, "getData"

    invoke-static {v4, v15}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    :cond_b
    :try_start_4
    new-instance v4, Lc0/I1;

    invoke-direct {v4, v3}, Lc0/I1;-><init>(I)V

    invoke-static {v0, v4}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    add-int/2addr v13, v7

    :cond_c
    :goto_8
    const/4 v4, 0x2

    goto :goto_7

    :catchall_4
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_8

    :cond_d
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v11, "modern settings list injection disabled; cleanup hooks="

    invoke-direct {v4, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, " dataSource="

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    if-lez v13, :cond_e

    move v0, v7

    goto :goto_9

    :cond_e
    move v0, v5

    :goto_9
    move v4, v0

    :goto_a
    const-string v0, "legacy settings list injection disabled"

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    sget-object v0, Lb0/c;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-object v0, Lf0/P;->a:Ljava/lang/String;

    const-string v11, "MicroMsg.PlusSubMenuHelper"

    filled-new-array {v11}, [Ljava/lang/String;

    move-result-object v11

    invoke-static {v9, v8, v0, v11}, Lb0/c;->b(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v17

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const-class v13, Landroid/widget/BaseAdapter;

    const-class v14, Landroid/util/SparseArray;

    const-class v15, Landroid/app/Activity;

    if-eqz v11, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Class;

    invoke-virtual {v15, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v18

    if-eqz v18, :cond_f

    goto/16 :goto_e

    :cond_f
    invoke-virtual {v11}, Ljava/lang/Class;->isInterface()Z

    move-result v18

    if-nez v18, :cond_16

    invoke-virtual {v11}, Ljava/lang/Class;->isAnnotation()Z

    move-result v18

    if-nez v18, :cond_16

    invoke-virtual {v11}, Ljava/lang/Class;->isEnum()Z

    move-result v18

    if-eqz v18, :cond_10

    goto :goto_e

    :cond_10
    move/from16 v19, v5

    move/from16 v20, v19

    move/from16 v21, v20

    move-object/from16 v18, v11

    :goto_c
    if-eqz v18, :cond_15

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v22

    invoke-static/range {v22 .. v22}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v22

    :goto_d
    invoke-virtual/range {v22 .. v22}, LE0/c;->hasNext()Z

    move-result v23

    if-eqz v23, :cond_14

    invoke-virtual/range {v22 .. v22}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Ljava/lang/reflect/Field;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v23

    if-eqz v23, :cond_11

    move/from16 v19, v7

    :cond_11
    invoke-virtual {v13, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v23

    if-eqz v23, :cond_12

    move/from16 v20, v7

    :cond_12
    const-class v3, Landroid/view/LayoutInflater;

    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_13

    move/from16 v21, v7

    :cond_13
    const/4 v3, 0x5

    goto :goto_d

    :cond_14
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v18

    const/4 v3, 0x5

    goto :goto_c

    :cond_15
    if-eqz v19, :cond_16

    if-eqz v20, :cond_16

    if-eqz v21, :cond_16

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "plus helper resolved via DexKit: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    goto :goto_10

    :cond_16
    :goto_e
    const/4 v3, 0x5

    goto/16 :goto_b

    :cond_17
    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v7

    if-eqz v0, :cond_18

    new-instance v0, Lf0/Y;

    const/16 v2, 0x17

    invoke-direct {v0, v2}, Lf0/Y;-><init>(I)V

    const/16 v20, 0x0

    const/16 v22, 0x1f

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v21, v0

    invoke-static/range {v17 .. v22}, LE0/l;->r0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LP0/l;I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "plus helper DexKit candidates rejected: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    :cond_18
    const-string v0, "com.tencent.mm.ui.rg"

    :try_start_5
    invoke-static {v0, v5, v8}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_f

    :catchall_5
    move-exception v0

    move-object v2, v0

    invoke-static {v2}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_f
    instance-of v2, v0, LD0/f;

    if-eqz v2, :cond_19

    move-object v0, v12

    :cond_19
    move-object v11, v0

    check-cast v11, Ljava/lang/Class;

    :goto_10
    if-nez v11, :cond_1a

    const-string v0, "plus helper class not resolved (DexKit + fallback both failed)"

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    goto/16 :goto_2e

    :cond_1a
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "plus helper class resolved="

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    new-instance v0, Lb0/o;

    invoke-direct {v0, v11, v12}, Lb0/o;-><init>(Ljava/lang/Class;LH0/a;)V

    new-instance v2, LE0/k;

    invoke-direct {v2, v6, v0}, LE0/k;-><init>(ILjava/lang/Object;)V

    new-instance v0, Lf0/Y;

    const/4 v3, 0x5

    invoke-direct {v0, v3}, Lf0/Y;-><init>(I)V

    invoke-static {v2, v0}, LV0/j;->y0(LE0/k;LP0/l;)LV0/f;

    move-result-object v0

    new-instance v2, Lf0/Y;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Lf0/Y;-><init>(I)V

    new-instance v3, LV0/e;

    invoke-direct {v3, v0, v7, v2}, LV0/e;-><init>(LV0/h;ZLP0/l;)V

    new-instance v2, LV0/d;

    invoke-direct {v2, v3}, LV0/d;-><init>(LV0/e;)V

    move v3, v5

    :goto_11
    invoke-virtual {v2}, LV0/d;->hasNext()Z

    move-result v0

    const-string v6, ": "

    const-string v12, "."

    if-eqz v0, :cond_1c

    invoke-virtual {v2}, LV0/d;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/reflect/Method;

    :try_start_6
    invoke-virtual {v5, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v0, Lf0/e0;

    const/4 v7, 0x0

    invoke-direct {v0, v11, v8, v7}, Lf0/e0;-><init>(Ljava/lang/Class;Ljava/lang/ClassLoader;I)V

    invoke-static {v5, v0}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    const/4 v7, 0x1

    add-int/2addr v3, v7

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    move-object/from16 v21, v2

    :try_start_7
    const-string v2, "plus menu display hooked "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    move-object v0, v10

    goto :goto_13

    :catchall_6
    move-exception v0

    goto :goto_12

    :catchall_7
    move-exception v0

    move-object/from16 v21, v2

    :goto_12
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_13
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "plus display hook fail "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    :cond_1b
    move-object/from16 v1, p0

    move-object/from16 v2, v21

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x1

    const/4 v12, 0x0

    goto/16 :goto_11

    :cond_1c
    new-instance v0, Lb0/o;

    const/4 v1, 0x0

    invoke-direct {v0, v11, v1}, Lb0/o;-><init>(Ljava/lang/Class;LH0/a;)V

    new-instance v1, LE0/k;

    const/4 v2, 0x4

    invoke-direct {v1, v2, v0}, LE0/k;-><init>(ILjava/lang/Object;)V

    new-instance v0, Lf0/Y;

    const/16 v2, 0x14

    invoke-direct {v0, v2}, Lf0/Y;-><init>(I)V

    invoke-static {v1, v0}, LV0/j;->y0(LE0/k;LP0/l;)LV0/f;

    move-result-object v0

    new-instance v1, Lf0/Y;

    const/16 v2, 0x15

    invoke-direct {v1, v2}, Lf0/Y;-><init>(I)V

    new-instance v2, LV0/e;

    const/4 v5, 0x1

    invoke-direct {v2, v0, v5, v1}, LV0/e;-><init>(LV0/h;ZLP0/l;)V

    new-instance v1, LV0/d;

    invoke-direct {v1, v2}, LV0/d;-><init>(LV0/e;)V

    :goto_14
    invoke-virtual {v1}, LV0/d;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-virtual {v1}, LV0/d;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    :try_start_8
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v2, Lf0/e0;

    invoke-direct {v2, v11, v8, v5}, Lf0/e0;-><init>(Ljava/lang/Class;Ljava/lang/ClassLoader;I)V

    invoke-static {v0, v2}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    add-int/2addr v3, v5

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "plus adapter factory hooked "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    move-object v0, v10

    goto :goto_15

    :catchall_8
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_15
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "plus adapter factory hook fail: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    :cond_1d
    const/4 v5, 0x1

    goto :goto_14

    :cond_1e
    invoke-virtual {v11}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v1

    :cond_1f
    :goto_16
    invoke-virtual {v1}, LE0/c;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-virtual {v1}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v5, "onItemClick"

    invoke-static {v2, v5}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    array-length v2, v2

    const/4 v5, 0x4

    if-eq v2, v5, :cond_20

    goto :goto_16

    :cond_20
    :try_start_9
    new-instance v2, Lc0/m;

    const/16 v5, 0x9

    invoke-direct {v2, v5}, Lc0/m;-><init>(I)V

    invoke-static {v0, v2}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_a

    const/4 v2, 0x1

    add-int/lit8 v7, v3, 0x1

    :try_start_a
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    move v3, v7

    goto :goto_18

    :catchall_9
    move-exception v0

    move v3, v7

    goto :goto_17

    :catchall_a
    move-exception v0

    :goto_17
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_18
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "plus click hook fail: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    goto :goto_16

    :cond_21
    if-lez v3, :cond_22

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "home plus menu hooked count="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    :cond_22
    new-instance v0, Lb0/o;

    const/4 v1, 0x0

    invoke-direct {v0, v11, v1}, Lb0/o;-><init>(Ljava/lang/Class;LH0/a;)V

    new-instance v1, LE0/k;

    const/4 v2, 0x4

    invoke-direct {v1, v2, v0}, LE0/k;-><init>(ILjava/lang/Object;)V

    new-instance v0, Lf0/Y;

    const/16 v2, 0x12

    invoke-direct {v0, v2}, Lf0/Y;-><init>(I)V

    invoke-static {v1, v0}, LV0/j;->y0(LE0/k;LP0/l;)LV0/f;

    move-result-object v0

    new-instance v1, LV0/d;

    invoke-direct {v1, v0}, LV0/d;-><init>(LV0/f;)V

    :cond_23
    invoke-virtual {v1}, LV0/d;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-virtual {v1}, LV0/d;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/reflect/Method;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    const-string v7, "getParameterTypes(...)"

    invoke-static {v5, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v5

    if-nez v5, :cond_23

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v13, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_23

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2, v13}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_23

    goto :goto_19

    :cond_24
    const/4 v0, 0x0

    :goto_19
    check-cast v0, Ljava/lang/reflect/Method;

    if-eqz v0, :cond_25

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_25

    move-object v1, v0

    const/4 v7, 0x0

    goto :goto_1b

    :cond_25
    const-string v0, "com.tencent.mm.ui.mg"

    const/4 v7, 0x0

    :try_start_b
    invoke-static {v0, v7, v8}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    goto :goto_1a

    :catchall_b
    move-exception v0

    move-object v1, v0

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1a
    instance-of v1, v0, LD0/f;

    if-eqz v1, :cond_26

    const/4 v0, 0x0

    :cond_26
    check-cast v0, Ljava/lang/Class;

    move-object v1, v0

    :goto_1b
    if-nez v1, :cond_27

    const-string v0, "plus adapter class not resolved"

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    goto/16 :goto_20

    :cond_27
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "plus adapter class resolved="

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    new-instance v0, Lb0/o;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb0/o;-><init>(Ljava/lang/Class;LH0/a;)V

    new-instance v2, LE0/k;

    const/4 v5, 0x4

    invoke-direct {v2, v5, v0}, LE0/k;-><init>(ILjava/lang/Object;)V

    new-instance v0, Lf0/Y;

    const/16 v5, 0x18

    invoke-direct {v0, v5}, Lf0/Y;-><init>(I)V

    invoke-static {v2, v0}, LV0/j;->y0(LE0/k;LP0/l;)LV0/f;

    move-result-object v0

    new-instance v2, Lf0/Y;

    const/16 v5, 0x19

    invoke-direct {v2, v5}, Lf0/Y;-><init>(I)V

    new-instance v5, LV0/e;

    const/4 v13, 0x1

    invoke-direct {v5, v0, v13, v2}, LV0/e;-><init>(LV0/h;ZLP0/l;)V

    new-instance v2, LV0/d;

    invoke-direct {v2, v5}, LV0/d;-><init>(LV0/e;)V

    move v5, v7

    :goto_1c
    invoke-virtual {v2}, LV0/d;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-virtual {v2}, LV0/d;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    :try_start_c
    invoke-virtual {v0, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v7, Lf0/e0;

    const/4 v13, 0x2

    invoke-direct {v7, v11, v8, v13}, Lf0/e0;-><init>(Ljava/lang/Class;Ljava/lang/ClassLoader;I)V

    invoke-static {v0, v7}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    const/4 v7, 0x1

    add-int/2addr v5, v7

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "plus adapter count hooked "

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    move-object v0, v10

    goto :goto_1d

    :catchall_c
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1d
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_28

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v13, "plus adapter count hook fail: "

    invoke-direct {v7, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    :cond_28
    const/4 v7, 0x0

    const/4 v13, 0x1

    goto :goto_1c

    :cond_29
    new-instance v0, Lb0/o;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb0/o;-><init>(Ljava/lang/Class;LH0/a;)V

    new-instance v1, LE0/k;

    const/4 v2, 0x4

    invoke-direct {v1, v2, v0}, LE0/k;-><init>(ILjava/lang/Object;)V

    new-instance v0, Lf0/Y;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Lf0/Y;-><init>(I)V

    invoke-static {v1, v0}, LV0/j;->y0(LE0/k;LP0/l;)LV0/f;

    move-result-object v0

    new-instance v1, Lf0/Y;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lf0/Y;-><init>(I)V

    new-instance v2, LV0/e;

    const/4 v7, 0x1

    invoke-direct {v2, v0, v7, v1}, LV0/e;-><init>(LV0/h;ZLP0/l;)V

    new-instance v1, LV0/d;

    invoke-direct {v1, v2}, LV0/d;-><init>(LV0/e;)V

    :goto_1e
    invoke-virtual {v1}, LV0/d;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2b

    invoke-virtual {v1}, LV0/d;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    :try_start_d
    invoke-virtual {v0, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v2, Lf0/e0;

    const/4 v13, 0x3

    invoke-direct {v2, v11, v8, v13}, Lf0/e0;-><init>(Ljava/lang/Class;Ljava/lang/ClassLoader;I)V

    invoke-static {v0, v2}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    add-int/2addr v5, v7

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "plus adapter view hooked "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    move-object v0, v10

    goto :goto_1f

    :catchall_d
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1f
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v7, "plus adapter view hook fail: "

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    :cond_2a
    const/4 v7, 0x1

    goto :goto_1e

    :cond_2b
    if-lez v5, :cond_2c

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "home plus adapter hooked count="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    :cond_2c
    move v7, v5

    :goto_20
    add-int/2addr v3, v7

    const-string v1, "getDeclaredFields(...)"

    :try_start_e
    sget-object v0, Lb0/c;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-object v0, Lf0/P;->a:Ljava/lang/String;

    const-string v2, "MicroMsg.PlusMenaDataManager"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v9, v8, v0, v2}, Lb0/c;->b(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_31

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/Class;

    invoke-virtual {v15, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-nez v7, :cond_2f

    invoke-virtual {v5}, Ljava/lang/Class;->isInterface()Z

    move-result v7

    if-nez v7, :cond_2f

    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v7

    invoke-static {v7, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v9, v7

    const/4 v13, 0x0

    :goto_22
    if-ge v13, v9, :cond_2f

    aget-object v16, v7, v13

    move-object/from16 v21, v0

    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v0

    const/4 v7, 0x0

    :goto_23
    if-ge v7, v5, :cond_30

    aget-object v9, v0, v7

    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v9

    const-class v13, Ljava/util/ArrayList;

    invoke-static {v9, v13}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2d

    goto :goto_24

    :cond_2d
    const/4 v9, 0x1

    add-int/2addr v7, v9

    goto :goto_23

    :catchall_e
    move-exception v0

    goto :goto_25

    :cond_2e
    const/16 v16, 0x1

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, v21

    goto :goto_22

    :cond_2f
    move-object/from16 v21, v0

    :cond_30
    move-object/from16 v0, v21

    goto :goto_21

    :cond_31
    const/4 v2, 0x0

    :goto_24
    check-cast v2, Ljava/lang/Class;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    if-eqz v2, :cond_32

    goto/16 :goto_29

    :goto_25
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_32
    new-instance v0, Lb0/o;

    const/4 v2, 0x0

    invoke-direct {v0, v11, v2}, Lb0/o;-><init>(Ljava/lang/Class;LH0/a;)V

    new-instance v2, LE0/k;

    const/4 v5, 0x4

    invoke-direct {v2, v5, v0}, LE0/k;-><init>(ILjava/lang/Object;)V

    new-instance v0, Lf0/Y;

    const/16 v5, 0x13

    invoke-direct {v0, v5}, Lf0/Y;-><init>(I)V

    invoke-static {v2, v0}, LV0/j;->y0(LE0/k;LP0/l;)LV0/f;

    move-result-object v0

    new-instance v2, LV0/d;

    invoke-direct {v2, v0}, LV0/d;-><init>(LV0/f;)V

    :cond_33
    invoke-virtual {v2}, LV0/d;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_35

    invoke-virtual {v2}, LV0/d;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/reflect/Field;

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    move-result v7

    if-nez v7, :cond_33

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v7

    const-class v9, Ljava/lang/String;

    invoke-static {v7, v9}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_33

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v5

    invoke-static {v5, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v7, v5

    const/4 v9, 0x0

    :goto_26
    if-ge v9, v7, :cond_33

    aget-object v11, v5, v9

    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v14, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_34

    move-object v1, v0

    goto :goto_27

    :cond_34
    const/4 v11, 0x1

    add-int/2addr v9, v11

    goto :goto_26

    :cond_35
    const/4 v1, 0x0

    :goto_27
    check-cast v1, Ljava/lang/reflect/Field;

    if-eqz v1, :cond_36

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    goto :goto_28

    :cond_36
    const/4 v1, 0x0

    :goto_28
    move-object v2, v1

    :goto_29
    if-nez v2, :cond_37

    const/4 v2, 0x0

    const/4 v7, 0x1

    goto/16 :goto_2c

    :cond_37
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "plus data manager resolved="

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    new-instance v0, Lb0/o;

    const/4 v1, 0x0

    invoke-direct {v0, v2, v1}, Lb0/o;-><init>(Ljava/lang/Class;LH0/a;)V

    new-instance v1, LE0/k;

    const/4 v2, 0x4

    invoke-direct {v1, v2, v0}, LE0/k;-><init>(ILjava/lang/Object;)V

    new-instance v0, Lf0/Y;

    const/16 v2, 0x8

    invoke-direct {v0, v2}, Lf0/Y;-><init>(I)V

    invoke-static {v1, v0}, LV0/j;->y0(LE0/k;LP0/l;)LV0/f;

    move-result-object v0

    new-instance v1, Lf0/Y;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lf0/Y;-><init>(I)V

    new-instance v2, LV0/e;

    const/4 v7, 0x1

    invoke-direct {v2, v0, v7, v1}, LV0/e;-><init>(LV0/h;ZLP0/l;)V

    new-instance v1, LV0/d;

    invoke-direct {v1, v2}, LV0/d;-><init>(LV0/e;)V

    const/4 v2, 0x0

    :cond_38
    :goto_2a
    invoke-virtual {v1}, LV0/d;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_39

    invoke-virtual {v1}, LV0/d;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/reflect/Method;

    :try_start_f
    invoke-virtual {v5, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v0, Lc0/I1;

    invoke-direct {v0, v8}, Lc0/I1;-><init>(Ljava/lang/ClassLoader;)V

    invoke-static {v5, v0}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    add-int/2addr v2, v7

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "plus data manager rebuild hooked "

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    move-object v0, v10

    goto :goto_2b

    :catchall_f
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_2b
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_38

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v13, "plus data manager hook fail "

    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    goto :goto_2a

    :cond_39
    if-lez v2, :cond_3a

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "plus data manager hooked count="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    :cond_3a
    :goto_2c
    add-int/2addr v3, v2

    if-lez v3, :cond_3b

    move v0, v7

    goto :goto_2d

    :cond_3b
    const/4 v0, 0x0

    :goto_2d
    move v5, v0

    :goto_2e
    add-int/2addr v4, v5

    if-lez v5, :cond_3c

    const-string v0, "OK"

    goto :goto_2f

    :cond_3c
    const-string v0, "FAIL"

    :goto_2f
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "settings entry hooks installed count="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " plusMenu="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    if-nez v5, :cond_3d

    const-string v0, "FATAL: plus menu entry unavailable on this build; OKK has no visible entry"

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    :try_start_10
    sget-object v0, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    const-string v1, "\u4e25\u91cd\uff1a\u52a0\u53f7\u83dc\u5355\u5165\u53e3\u6ce8\u5165\u5931\u8d25\uff0c\u6a21\u5757\u5c06\u6ca1\u6709\u53ef\u89c1\u5165\u53e3"

    invoke-virtual {v0, v1}, Lcom/abc/core/hooks/ModuleLog;->i(Ljava/lang/String;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_10

    goto :goto_30

    :catchall_10
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_3d
    :goto_30
    sget-object v0, Le0/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    if-lez v5, :cond_3e

    goto :goto_31

    :cond_3e
    const/4 v7, 0x0

    :goto_31
    if-lez v5, :cond_3f

    const-string v0, "\u52a0\u53f7\u83dc\u5355\u5165\u53e3\u5df2\u6ce8\u5165"

    goto :goto_32

    :cond_3f
    const-string v0, "\u52a0\u53f7\u83dc\u5355\u5165\u53e3\u6ce8\u5165\u5931\u8d25\uff0c\u6a21\u5757\u65e0\u53ef\u89c1\u5165\u53e3"

    :goto_32
    const-string v1, "SettingsEntry"

    invoke-static {v1, v0, v7}, Le0/c;->g(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_33
    return-object v10
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    const-string v2, "com.tencent.mm.ui.conversation.MainUI"

    const-class v3, Landroid/widget/AbsListView;

    const-string v4, "com.tencent.mm.ui.conversation.ConversationListView"

    const-string v5, "getDeclaredMethods(...)"

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v8, "onResume"

    const/4 v9, 0x3

    const-string v10, "install enabled="

    const-string v0, "$cl"

    const-string v11, "$ctx"

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x1

    iget v15, v1, Lf0/W;->a:I

    packed-switch v15, :pswitch_data_0

    iget-object v2, v1, Lf0/W;->b:Landroid/content/Context;

    iget-object v0, v1, Lf0/W;->c:Ljava/lang/ClassLoader;

    const-string v3, "$appContext"

    invoke-static {v2, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$classLoader"

    invoke-static {v0, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lf0/i;->a:Lf0/i;

    sget-object v3, Lf0/i;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v13, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v3

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    if-nez v4, :cond_0

    move-object v4, v2

    :cond_0
    sput-object v4, Lf0/i;->h:Landroid/content/Context;

    sput-object v0, Lf0/i;->i:Ljava/lang/ClassLoader;

    sget-boolean v0, LU/S;->i:Z

    if-eqz v0, :cond_1

    sget-object v0, Lf0/i;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v0, Lf0/i;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_1
    sget-boolean v0, LU/S;->i:Z

    sget-boolean v4, LU/S;->h:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v10, "install first="

    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v10, " interactive="

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " pendingDialog="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/i;->g(Ljava/lang/String;)V

    if-eqz v3, :cond_6

    const-class v3, Landroid/app/Activity;

    new-instance v0, Lc0/I1;

    invoke-direct {v0, v9, v13}, Lc0/I1;-><init>(IZ)V

    :try_start_0
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v8, v0}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_0
    :try_start_1
    const-string v0, "onWindowFocusChanged"

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    new-instance v5, Lc0/I1;

    invoke-direct {v5, v12}, Lc0/I1;-><init>(I)V

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v0, v4}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_1
    instance-of v0, v2, Landroid/app/Application;

    if-eqz v0, :cond_2

    move-object v0, v2

    check-cast v0, Landroid/app/Application;

    goto :goto_2

    :cond_2
    move-object v0, v7

    :goto_2
    if-nez v0, :cond_5

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v2, v0, Landroid/app/Application;

    if-eqz v2, :cond_3

    move-object v7, v0

    check-cast v7, Landroid/app/Application;

    :cond_3
    if-nez v7, :cond_4

    goto :goto_3

    :cond_4
    move-object v0, v7

    :cond_5
    :try_start_2
    new-instance v2, Lf0/h;

    sget-object v3, Lf0/i;->a:Lf0/i;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_6
    :goto_3
    sget-object v0, Lf0/i;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v13}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    new-instance v0, Landroidx/emoji2/text/m;

    invoke-direct {v0, v14}, Landroidx/emoji2/text/m;-><init>(I)V

    sget-object v2, Lf0/i;->b:Landroid/os/Handler;

    const-wide/16 v3, 0x258

    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v0, Lc0/z;

    invoke-direct {v0, v6}, Lc0/z;-><init>(I)V

    const-wide/16 v3, 0x4b0

    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v0, Lc0/z;

    const/4 v3, 0x5

    invoke-direct {v0, v3}, Lc0/z;-><init>(I)V

    const-wide/16 v3, 0xbb8

    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v0, Lc0/z;

    const/4 v3, 0x6

    invoke-direct {v0, v3}, Lc0/z;-><init>(I)V

    const-wide/16 v3, 0x1770

    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_0
    invoke-direct/range {p0 .. p0}, Lf0/W;->h()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-direct/range {p0 .. p0}, Lf0/W;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v2, v1, Lf0/W;->b:Landroid/content/Context;

    invoke-static {v2, v11}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lf0/W;->c:Ljava/lang/ClassLoader;

    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/f1;->a:Lc0/f1;

    sget-object v3, Lc0/f1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v13, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    invoke-static {}, Lc0/f1;->b()Z

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lc0/f1;->d(Ljava/lang/String;)V

    const-string v3, "com.tencent.mm.plugin.profile.ui.ContactInfoUI"

    invoke-virtual {v0, v2, v3}, Lc0/f1;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    const-string v3, "com.tencent.mm.chatroom.ui.ChatroomInfoUI"

    invoke-virtual {v0, v2, v3}, Lc0/f1;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    :goto_4
    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_3
    invoke-direct/range {p0 .. p0}, Lf0/W;->f()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-direct/range {p0 .. p0}, Lf0/W;->e()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-direct/range {p0 .. p0}, Lf0/W;->d()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-direct/range {p0 .. p0}, Lf0/W;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-direct/range {p0 .. p0}, Lf0/W;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v2, v1, Lf0/W;->b:Landroid/content/Context;

    invoke-static {v2, v11}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lf0/W;->c:Ljava/lang/ClassLoader;

    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/w;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-object v0, Lc0/w;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v13, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_c

    :cond_8
    invoke-static {}, Lc0/r;->a()Lc0/x;

    move-result-object v0

    iget-boolean v3, v0, Lc0/x;->a:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " sync="

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v3, v0, Lc0/x;->b:Z

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " showDev="

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v3, v0, Lc0/x;->c:Z

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " autoDev="

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v3, v0, Lc0/x;->d:Z

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " click="

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, v0, Lc0/x;->e:Z

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/w;->d(Ljava/lang/String;)V

    :try_start_3
    const-string v0, "com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI"

    invoke-static {v2, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_5
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    sget-object v3, Lc0/w;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-nez v2, :cond_1c

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static {v2, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    array-length v4, v2

    move v6, v13

    :goto_6
    const-class v7, Landroid/os/Bundle;

    const-string v8, "onCreate"

    if-ge v6, v4, :cond_a

    aget-object v9, v2, v6

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v8}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    array-length v8, v8

    if-ne v8, v14, :cond_9

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    aget-object v8, v8, v13

    invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    add-int/2addr v6, v14

    goto :goto_6

    :cond_a
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    const-string v3, "getMethods(...)"

    invoke-static {v2, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    array-length v4, v2

    move v6, v13

    :goto_7
    if-ge v6, v4, :cond_d

    aget-object v9, v2, v6

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v10

    array-length v10, v10

    if-ne v10, v14, :cond_c

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v10

    aget-object v10, v10, v13

    invoke-virtual {v7, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v8}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_b

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v10

    invoke-static {v10, v0}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    :cond_b
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    add-int/2addr v6, v14

    goto :goto_7

    :cond_d
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_e
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    sget-object v6, Lc0/w;->b:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    const-string v7, "."

    const-string v8, "hooked "

    if-eqz v4, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Method;

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-static {v4}, Lc0/w;->c(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    new-instance v6, Lc0/u;

    invoke-direct {v6, v4, v14, v13}, Lc0/u;-><init>(Ljava/lang/reflect/Method;IZ)V

    invoke-static {v4, v6}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lc0/w;->d(Ljava/lang/String;)V

    goto :goto_8

    :cond_f
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_10

    const-string v2, "no onCreate method found on com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI"

    invoke-static {v2}, Lc0/w;->d(Ljava/lang/String;)V

    :cond_10
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    array-length v3, v0

    move v4, v13

    :goto_9
    const-string v5, "init"

    const-string v9, "initView"

    if-ge v4, v3, :cond_14

    aget-object v10, v0, v4

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    const-string v15, "getParameterTypes(...)"

    invoke-static {v11, v15}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v11, v11

    if-nez v11, :cond_13

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v11

    sget-object v15, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v11, v15}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_11

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v11

    const-class v15, Ljava/lang/Void;

    invoke-static {v11, v15}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_13

    :cond_11
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v9}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_12

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v5}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v9, "a"

    invoke-static {v5, v9, v13}, LW0/r;->D0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-nez v5, :cond_12

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-gt v5, v12, :cond_13

    :cond_12
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    add-int/2addr v4, v14

    goto :goto_9

    :cond_14
    new-instance v0, Lc0/s;

    invoke-direct {v0, v13}, Lc0/s;-><init>(I)V

    new-instance v3, Lc0/t;

    invoke-direct {v3, v14, v0}, Lc0/t;-><init>(ILjava/lang/Object;)V

    new-instance v0, Lc0/t;

    invoke-direct {v0, v13, v3}, Lc0/t;-><init>(ILjava/lang/Object;)V

    invoke-static {v2, v0}, LE0/l;->t0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_15
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/reflect/Method;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v9}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_16

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_15

    :cond_16
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_17
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_18

    sget-object v2, LE0/u;->a:LE0/u;

    :cond_18
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_19
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Method;

    invoke-static {v3}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-static {v3}, Lc0/w;->c(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_19

    new-instance v4, Lc0/u;

    invoke-direct {v4, v3, v13, v13}, Lc0/u;-><init>(Ljava/lang/reflect/Method;IZ)V

    invoke-static {v3, v4}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "()"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lc0/w;->d(Ljava/lang/String;)V

    goto :goto_b

    :cond_1a
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1b

    const-string v0, "initView not found; rely on onCreate post click"

    invoke-static {v0}, Lc0/w;->d(Ljava/lang/String;)V

    :cond_1b
    const-string v0, "hooks ready for com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI"

    invoke-static {v0}, Lc0/w;->d(Ljava/lang/String;)V

    goto :goto_c

    :cond_1c
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "class not found: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/w;->d(Ljava/lang/String;)V

    :goto_c
    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_9
    iget-object v7, v1, Lf0/W;->b:Landroid/content/Context;

    iget-object v8, v1, Lf0/W;->c:Ljava/lang/ClassLoader;

    invoke-static {v7, v11}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/q0;->a:Lc0/q0;

    const-string v7, "h"

    const-class v11, Landroid/view/View;

    sget-object v15, LD0/l;->a:LD0/l;

    sget-object v0, Lc0/q0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v13, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_1d

    goto/16 :goto_1c

    :cond_1d
    invoke-static {v14}, Lc0/q0;->j(Z)V

    sget-boolean v0, Lc0/q0;->c:Z

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " (HIDE sticky overlay, keep list item)"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V

    :try_start_4
    invoke-static {v8, v4}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v9, "setFoldBanner"

    new-instance v10, Lc0/p0;

    invoke-direct {v10, v13}, Lc0/p0;-><init>(I)V

    filled-new-array {v11, v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-static {v0, v9, v10}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked ConversationListView.setFoldBanner"

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    move-object v0, v15

    goto :goto_d

    :catchall_4
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_d
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    sget-object v9, Lc0/q0;->a:Lc0/q0;

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "setFoldBanner: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V

    :cond_1e
    :try_start_5
    const-string v0, "setVisibility"

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-instance v10, Lc0/j;

    const/16 v14, 0x15

    invoke-direct {v10, v14}, Lc0/j;-><init>(I)V

    filled-new-array {v9, v10}, [Ljava/lang/Object;

    move-result-object v9

    invoke-static {v11, v0, v9}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked View.setVisibility"

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    move-object v0, v15

    goto :goto_e

    :catchall_5
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_e
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "setVisibility: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V

    :cond_1f
    :try_start_6
    const-string v0, "setTranslationY"

    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    new-instance v10, Lc0/p0;

    invoke-direct {v10, v6}, Lc0/p0;-><init>(I)V

    filled-new-array {v9, v10}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v11, v0, v6}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked View.setTranslationY"

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    move-object v0, v15

    goto :goto_f

    :catchall_6
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_f
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v9, "setTranslationY: "

    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V

    :cond_20
    :try_start_7
    const-string v0, "setAlpha"

    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    new-instance v9, Lc0/j;

    const/16 v10, 0x16

    invoke-direct {v9, v10}, Lc0/j;-><init>(I)V

    filled-new-array {v6, v9}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v11, v0, v6}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked View.setAlpha"

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    move-object v0, v15

    goto :goto_10

    :catchall_7
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_10
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v9, "setAlpha: "

    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V

    :cond_21
    :try_start_8
    invoke-static {v8, v4}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v4, "onScroll"

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-instance v9, Lc0/j;

    const/16 v10, 0x17

    invoke-direct {v9, v10}, Lc0/j;-><init>(I)V

    filled-new-array {v3, v6, v6, v6, v9}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v4, v3}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v3, "layoutChildren"

    new-instance v4, Lc0/j;

    const/16 v6, 0x18

    invoke-direct {v4, v6}, Lc0/j;-><init>(I)V

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v0, v3, v4}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked ConversationListView.onScroll/layoutChildren"

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    move-object v0, v15

    goto :goto_11

    :catchall_8
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_11
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_22

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "list hooks: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V

    :cond_22
    :try_start_9
    const-string v0, "com.tencent.mm.ui.conversation.l5"

    invoke-static {v8, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-static {v3}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v3

    move v4, v13

    :cond_23
    :goto_12
    invoke-virtual {v3}, LE0/c;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_24

    invoke-virtual {v3}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/reflect/Method;

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    array-length v9, v9

    if-ne v9, v12, :cond_23

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    aget-object v9, v9, v13

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v9, v10}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_23

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    const/4 v10, 0x1

    aget-object v9, v9, v10

    sget-object v14, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v9, v14}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_23

    new-instance v9, Lc0/p0;

    invoke-direct {v9, v10}, Lc0/p0;-><init>(I)V

    invoke-static {v6, v9}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    add-int/2addr v4, v10

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "hooked FolderHelper."

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "(int,boolean)"

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lc0/q0;->l(Ljava/lang/String;)V

    goto :goto_12

    :catchall_9
    move-exception v0

    goto/16 :goto_14

    :cond_24
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-static {v0}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v0

    :cond_25
    :goto_13
    invoke-virtual {v0}, LE0/c;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_28

    invoke-virtual {v0}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Field;

    const-class v6, Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-nez v6, :cond_26

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v11, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_25

    :cond_26
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v9, "f200744h"

    invoke-static {v6, v9}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_27

    invoke-static {v6, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_27

    invoke-static {v6}, LQ0/g;->b(Ljava/lang/Object;)V

    const-string v9, "banner"

    const/4 v10, 0x1

    invoke-static {v6, v9, v10}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_27

    const-string v9, "fold"

    invoke-static {v6, v9, v10}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_27

    invoke-static {v6, v7}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_25

    :cond_27
    sget-object v9, Lc0/q0;->g:Ljava/lang/String;

    if-nez v9, :cond_25

    sput-object v6, Lc0/q0;->g:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "pre-resolve banner field="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " type="

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lc0/q0;->l(Ljava/lang/String;)V

    goto :goto_13

    :cond_28
    if-nez v4, :cond_29

    const-string v0, "FolderHelper: no g(int,boolean) found"

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    :cond_29
    move-object v0, v15

    goto :goto_15

    :goto_14
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_15
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "FolderHelper g: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V

    :cond_2a
    :try_start_a
    invoke-static {v8, v2}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v16, "onTabCreate"

    const-string v17, "onResume"

    const-string v18, "onActivityCreated"

    const-string v19, "onShow"

    const-string v20, "onEnter"

    const-string v21, "onHiddenChanged"

    filled-new-array/range {v16 .. v21}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-static {v4, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    array-length v7, v4

    move v8, v13

    :goto_16
    if-ge v8, v7, :cond_2d

    aget-object v9, v4, v8

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2c

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2c
    const/4 v9, 0x1

    goto :goto_17

    :catchall_a
    move-exception v0

    goto :goto_19

    :goto_17
    add-int/2addr v8, v9

    goto :goto_16

    :cond_2d
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_18
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Method;

    invoke-static {v4}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v6, Lc0/p0;

    invoke-direct {v6, v12}, Lc0/p0;-><init>(I)V

    invoke-static {v4, v6}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    goto :goto_18

    :cond_2e
    const-string v0, "hooked MainUI lifecycle for lt5"

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    move-object v0, v15

    goto :goto_1a

    :goto_19
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1a
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2f

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "MainUI: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V

    :cond_2f
    :try_start_b
    const-class v0, Landroid/view/ViewGroup;

    const-string v2, "addView"

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v4, Landroid/view/ViewGroup$LayoutParams;

    new-instance v5, Lc0/p0;

    const/4 v6, 0x3

    invoke-direct {v5, v6}, Lc0/p0;-><init>(I)V

    filled-new-array {v11, v3, v4, v5}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v2, v3}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked ViewGroup.addView for lt5"

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    move-object v0, v15

    goto :goto_1b

    :catchall_b
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1b
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_30

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "addView: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/q0;->l(Ljava/lang/String;)V

    :cond_30
    :goto_1c
    return-object v15

    :pswitch_a
    iget-object v5, v1, Lf0/W;->b:Landroid/content/Context;

    iget-object v6, v1, Lf0/W;->c:Ljava/lang/ClassLoader;

    invoke-static {v5, v11}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/s0;->a:Lc0/s0;

    const-string v9, "dz8"

    sget-object v0, Lc0/s0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v12, 0x1

    invoke-virtual {v0, v13, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    sget-object v12, LD0/l;->a:LD0/l;

    if-nez v0, :cond_31

    goto/16 :goto_2c

    :cond_31
    :try_start_c
    sget-object v0, Lc0/h1;->a:Lc0/h1;

    const-string v0, "hide_home_divider"

    invoke-static {v0, v13}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    goto :goto_1d

    :catchall_c
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1d
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v15, v0, LD0/f;

    if-eqz v15, :cond_32

    move-object v0, v14

    :cond_32
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sput-boolean v0, Lc0/s0;->f:Z

    const-string v0, "com.tencent.mm.R$id"

    :try_start_d
    invoke-static {v6, v0}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    goto :goto_1e

    :catchall_d
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1e
    instance-of v14, v0, LD0/f;

    if-eqz v14, :cond_33

    move-object v0, v11

    :cond_33
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    if-eqz v0, :cond_34

    goto :goto_1f

    :cond_34
    move-object v14, v7

    :goto_1f
    if-eqz v14, :cond_35

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_22

    :cond_35
    :try_start_e
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v5, "id"

    const-string v14, "com.tencent.mm"

    invoke-virtual {v0, v9, v5, v14}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    goto :goto_20

    :catchall_e
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_20
    instance-of v5, v0, LD0/f;

    if-eqz v5, :cond_36

    goto :goto_21

    :cond_36
    move-object v11, v0

    :goto_21
    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v0

    :goto_22
    sput v0, Lc0/s0;->e:I

    const-string v5, "getDeclaredFields(...)"

    :try_start_f
    invoke-static {v6, v2}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_11

    :try_start_10
    invoke-static {v6, v4}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_f

    goto :goto_23

    :catchall_f
    move-exception v0

    move-object v4, v0

    :try_start_11
    invoke-static {v4}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_23
    instance-of v4, v0, LD0/f;

    if-eqz v4, :cond_37

    move-object v0, v7

    :cond_37
    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-static {v4, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v11, v4

    move v14, v13

    :goto_24
    if-ge v14, v11, :cond_3a

    aget-object v15, v4, v14
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_11

    if-eqz v0, :cond_38

    :try_start_12
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_10

    const/4 v13, 0x1

    if-ne v7, v13, :cond_39

    goto :goto_25

    :catchall_10
    move-exception v0

    const/4 v13, 0x1

    goto :goto_28

    :cond_38
    const/4 v13, 0x1

    :cond_39
    add-int/2addr v14, v13

    const/4 v7, 0x0

    const/4 v13, 0x0

    goto :goto_24

    :catchall_11
    move-exception v0

    goto :goto_28

    :cond_3a
    const/4 v15, 0x0

    :goto_25
    if-nez v15, :cond_3e

    :try_start_13
    invoke-virtual {v9}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-static {v0, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v4, v0

    const/4 v13, 0x0

    :goto_26
    if-ge v13, v4, :cond_3d

    aget-object v5, v0, v13

    const-class v7, Landroid/widget/ListView;

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-nez v7, :cond_3c

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_11

    if-eqz v7, :cond_3b

    goto :goto_27

    :cond_3b
    const/4 v7, 0x1

    add-int/2addr v13, v7

    goto :goto_26

    :cond_3c
    :goto_27
    move-object v15, v5

    goto :goto_29

    :cond_3d
    const/4 v15, 0x0

    goto :goto_29

    :goto_28
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v15

    :cond_3e
    :goto_29
    instance-of v0, v15, LD0/f;

    if-eqz v0, :cond_3f

    const/4 v15, 0x0

    :cond_3f
    check-cast v15, Ljava/lang/reflect/Field;

    if-eqz v15, :cond_40

    const/4 v3, 0x1

    invoke-virtual {v15, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    move-object v7, v15

    goto :goto_2a

    :cond_40
    const/4 v7, 0x0

    :goto_2a
    sput-object v7, Lc0/s0;->b:Ljava/lang/reflect/Field;

    sget-boolean v0, Lc0/s0;->f:Z

    sget v3, Lc0/s0;->e:I

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lc0/s0;->b:Ljava/lang/reflect/Field;

    if-eqz v4, :cond_41

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_42

    :cond_41
    const-string v4, "none"

    :cond_42
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " dz8=0x"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " listField="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/s0;->c(Ljava/lang/String;)V

    sget-boolean v0, Lc0/s0;->f:Z

    if-nez v0, :cond_43

    goto :goto_2c

    :cond_43
    :try_start_14
    invoke-static {v6, v2}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    new-instance v2, Lc0/m;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lc0/m;-><init>(I)V

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v8, v2}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    const-string v0, "hooked com.tencent.mm.ui.conversation.MainUI.onResume only"

    invoke-static {v0}, Lc0/s0;->c(Ljava/lang/String;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_12

    move-object v0, v12

    goto :goto_2b

    :catchall_12
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_2b
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_44

    sget-object v2, Lc0/s0;->a:Lc0/s0;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "MainUI.onResume hook failed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/s0;->c(Ljava/lang/String;)V

    :cond_44
    :goto_2c
    return-object v12

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
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
.end method
