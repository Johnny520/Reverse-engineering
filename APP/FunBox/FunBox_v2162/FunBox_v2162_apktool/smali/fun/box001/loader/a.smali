.class final Lfun/box001/loader/a;
.super La/b;
.source "SourceFile"


# virtual methods
.method public final n(Lo/a;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    aget-object v0, p3, v0

    check-cast v0, Landroid/content/pm/ApplicationInfo;

    const/4 v1, 0x1

    aget-object v1, p3, v1

    check-cast v1, Ljava/lang/ClassLoader;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    sget-object v2, Lfun/box001/shared/Env;->package_name:Ljava/lang/String;

    iget-object v3, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0, v1}, Lfun/box001/loader/ZygiskEntry;->a(Landroid/content/pm/ApplicationInfo;Ljava/lang/ClassLoader;)V

    :cond_0
    sget-object v0, Lcom/shooker/SHooker;->a:Ljava/util/HashMap;

    iget-object p1, p1, Lo/a;->b:Ljava/lang/reflect/Method;

    invoke-virtual {p1, p2, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
