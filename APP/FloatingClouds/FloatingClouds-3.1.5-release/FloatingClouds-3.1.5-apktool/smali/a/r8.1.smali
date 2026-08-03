.class public final La/r8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/mmjz/floatingclouds/plugin/IPlugin;


# instance fields
.field public final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Field;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, La/r8;->a:Ljava/util/HashMap;

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 5

    sget-object v0, La/yc;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    const-class v3, La/fh;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ltop/mmjz/floatingclouds/plugin/IPlugin;

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Ltop/mmjz/floatingclouds/plugin/IPlugin;

    if-nez v1, :cond_2

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "Plugin not found: "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "PluginProviders"

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    move-object v2, v1

    :goto_1
    check-cast v2, La/fh;

    const/4 v0, 0x0

    if-eqz v2, :cond_6

    iget-object v1, v2, La/fh;->a:Ljava/util/ArrayList;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, "iterator(...)"

    invoke-static {v1, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-static {v2}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {v2}, La/Be;->V(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2, v0}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 p0, 0x1

    return p0

    :cond_6
    return v0
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Z
    .locals 9

    sget-object v0, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    const-string v0, ""

    invoke-static {v0}, La/fh$a;->a(Ljava/lang/String;)Z

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, La/r8;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x1

    if-nez v3, :cond_3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-eqz v0, :cond_2

    const-class v5, Ljava/lang/Object;

    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v5

    invoke-static {v5}, La/w1;->I([Ljava/lang/Object;)La/G1;

    move-result-object v5

    :cond_0
    :goto_1
    invoke-virtual {v5}, La/G1;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5}, La/G1;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/reflect/Field;

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Ljava/lang/String;

    invoke-static {v7, v8}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v6, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Field;

    :try_start_0
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_5

    check-cast v1, Ljava/lang/String;

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v1}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {v1}, La/r8;->a(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_4

    return v4

    :cond_7
    const/4 p1, 0x0

    return p1
.end method

.method public final handleHook(La/J8;)V
    .locals 14

    const/4 v1, 0x2

    const/4 v2, 0x1

    const-string v0, "session"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, La/fd;

    sget v0, La/B1;->a:I

    const/4 v4, 0x0

    const/4 v5, -0x1

    if-ne v0, v5, :cond_0

    :try_start_0
    sget-object v0, La/w1;->p:Landroid/content/Context;

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v6, "com.tencent.mm"

    invoke-virtual {v0, v6, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v5, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :goto_0
    sput v5, La/B1;->a:I

    :cond_0
    sget v0, La/B1;->a:I

    iget-object v5, p1, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-direct {v3, v0, v5}, La/fd;-><init>(ILjava/lang/ClassLoader;)V

    sget-object v0, La/hd;->a:La/hd;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "F014_fts_adapter"

    invoke-static {v0, v3}, La/hd;->a(Ljava/lang/String;La/fd;)La/gd;

    move-result-object v0

    iget-boolean v3, v0, La/gd;->a:Z

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v6, "F014"

    const-string v7, "HideSearchList"

    if-eqz v3, :cond_1

    iget-object v3, v0, La/gd;->b:Ljava/lang/Class;

    if-nez v3, :cond_2

    :cond_1
    move-object v8, p1

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Resolver: f0 adapter \u2192 "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v7, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    const-class v0, Landroid/view/View;

    const-class v2, Landroid/view/ViewGroup;

    filled-new-array {v5, v0, v2}, [Ljava/lang/Class;

    move-result-object v11

    new-instance v12, La/l4;

    invoke-direct {v12, p0, v1, v3}, La/l4;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    const-string v8, "F014"

    const-string v10, "getView"

    move-object v7, p1

    invoke-static/range {v7 .. v12}, La/J8;->d(La/J8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)V

    sget-object p1, La/E8;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getView"

    invoke-static {v6, v0, p1}, La/E8;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    :goto_1
    iget-object p1, v0, La/gd;->c:La/j6;

    const/4 v3, 0x0

    if-eqz p1, :cond_3

    iget-object p1, p1, La/j6;->c:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object p1, v3

    :goto_2
    const-string v9, "Resolver: f0 adapter not resolved: "

    invoke-static {v9, p1}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v7, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->e([Ljava/lang/Object;)V

    sget-object p1, La/E8;->a:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object p1, v0, La/gd;->c:La/j6;

    if-eqz p1, :cond_4

    iget-object p1, p1, La/j6;->c:Ljava/lang/String;

    if-nez p1, :cond_5

    :cond_4
    const-string p1, "unknown"

    :cond_5
    const-string v0, "ftsAdapter"

    const-string v9, "f0"

    invoke-static {v6, v0, v9, p1}, La/E8;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    const-string p1, "com.tencent.mm.view.recyclerview.WxRecyclerAdapter"

    iget-object v0, v8, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v0, p1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    if-nez p1, :cond_6

    goto/16 :goto_7

    :cond_6
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v9, "getDeclaredMethods(...)"

    invoke-static {v0, v9}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v9, v0

    move v10, v4

    :goto_3
    if-ge v10, v9, :cond_8

    aget-object v11, v0, v10

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    array-length v12, v12

    if-ne v12, v1, :cond_7

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    aget-object v12, v12, v2

    invoke-static {v12, v5}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    aget-object v12, v12, v4

    invoke-virtual {v12}, Ljava/lang/Class;->isPrimitive()Z

    move-result v12

    if-nez v12, :cond_7

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    aget-object v12, v12, v4

    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    const-string v13, "android"

    invoke-static {v12, v13, v4}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v12

    if-nez v12, :cond_7

    move-object v3, v11

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_7
    add-int/2addr v10, v2

    goto :goto_3

    :cond_8
    :goto_4
    if-nez v3, :cond_9

    goto :goto_7

    :cond_9
    const-string v9, "F014"

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v11

    const-string v0, "getName(...)"

    invoke-static {v11, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    aget-object v0, v0, v4

    filled-new-array {v0, v5}, [Ljava/lang/Class;

    move-result-object v12

    new-instance v13, La/t;

    const/4 v0, 0x3

    invoke-direct {v13, v0, p0}, La/t;-><init>(ILjava/lang/Object;)V

    invoke-static/range {v8 .. v13}, La/J8;->d(La/J8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)V

    sget-object v0, La/E8;->a:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v0, "recyclerBind"

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v6, v0, p1}, La/E8;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fallback: hooked WxRecyclerAdapter."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v7, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    sget-object p1, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_6

    :goto_5
    invoke-static {p1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object p1

    :goto_6
    invoke-static {p1}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Recycler fallback failed: "

    invoke-static {v0, p1}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v7, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->e([Ljava/lang/Object;)V

    :cond_a
    :goto_7
    return-void
.end method
