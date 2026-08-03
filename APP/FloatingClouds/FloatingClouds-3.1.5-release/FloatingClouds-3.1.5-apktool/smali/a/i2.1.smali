.class public final La/i2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/mmjz/floatingclouds/plugin/IPlugin;


# virtual methods
.method public final handleHook(La/J8;)V
    .locals 2

    const-string v0, "session"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, La/if;->a:La/if;

    iget-object v1, p1, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, p1}, La/if;->b(Ljava/lang/ClassLoader;La/J8;)V

    sget-object p1, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object p1

    :goto_0
    invoke-static {p1}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "[BlockHotUpdate] diagnose FAILED"

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->a([Ljava/lang/Object;)V

    :cond_0
    const-string p1, "[BlockHotUpdate] diagnostic Part DONE"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    return-void
.end method
