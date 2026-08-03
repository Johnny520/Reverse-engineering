.class public final La/ch;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/mmjz/floatingclouds/plugin/IPlugin;


# virtual methods
.method public final handleHook(La/J8;)V
    .locals 11

    const-string v0, "session"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, La/J8;->a:Ljava/lang/ClassLoader;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v2, v1

    goto :goto_0

    :cond_0
    const-string v2, "com.tencent.wcdb.database.SQLiteDatabase"

    invoke-static {v0, v2}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    return-void

    :cond_1
    if-nez v0, :cond_2

    move-object v6, v1

    goto :goto_1

    :cond_2
    const-string v3, "com.tencent.wcdb.database.SQLiteCipherSpec"

    invoke-static {v0, v3}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    move-object v6, v3

    :goto_1
    if-nez v0, :cond_3

    move-object v7, v1

    goto :goto_2

    :cond_3
    const-string v3, "com.tencent.wcdb.database.SQLiteDatabase$CursorFactory"

    invoke-static {v0, v3}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    move-object v7, v3

    :goto_2
    if-nez v0, :cond_4

    :goto_3
    move-object v9, v1

    goto :goto_4

    :cond_4
    const-string v1, "com.tencent.wcdb.DatabaseErrorHandler"

    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    goto :goto_3

    :goto_4
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    const-class v5, [B

    move-object v10, v8

    filled-new-array/range {v4 .. v10}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "openDatabase"

    invoke-static {v2, v1, v0}, La/A1;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-nez v0, :cond_5

    const-string p1, "WXDbPlugin: openDatabase method not found"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->e([Ljava/lang/Object;)V

    return-void

    :cond_5
    invoke-virtual {p1, v0}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p1

    new-instance v0, La/v8;

    invoke-direct {v0}, La/v8;-><init>()V

    invoke-interface {p1, v0}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    return-void
.end method
