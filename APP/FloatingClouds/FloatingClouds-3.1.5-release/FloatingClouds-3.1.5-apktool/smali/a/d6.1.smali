.class public final La/d6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/mmjz/floatingclouds/plugin/IPlugin;


# virtual methods
.method public final handleHook(La/J8;)V
    .locals 5

    const-string v0, "session"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v0, "android.app.Activity"

    const-string v1, "onCreate"

    const-class v2, Landroid/os/Bundle;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    new-instance v3, La/g2;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, La/g2;-><init>(I)V

    invoke-static {p1, v0, v1, v2, v3}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_0
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "hook Activity.onCreate for blockEnterChat fail"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    new-instance v1, La/t;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p1, v2}, La/t;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;Ljava/lang/Object;I)V

    const-string v2, "com.tencent.mm.ui.chatting.ChattingUIProxy"

    const-string v3, "onEnterBegin"

    invoke-static {p1, v2, v3, v0, v1}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    return-void
.end method
