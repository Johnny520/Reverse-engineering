.class public final synthetic La/q4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/github/libxposed/api/XposedInterface$Hooker;


# instance fields
.field public final synthetic a:La/s4;

.field public final synthetic b:La/J8;

.field public final synthetic c:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(La/s4;La/J8;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/q4;->a:La/s4;

    iput-object p2, p0, La/q4;->b:La/J8;

    iput-object p3, p0, La/q4;->c:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final intercept(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, La/q4;->b:La/J8;

    iget-object v1, p0, La/q4;->c:Ljava/lang/Class;

    const-string v2, "Chat_User"

    const-string v3, "chain"

    invoke-static {p1, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, La/K3;->a:La/K3$a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v4

    if-eqz v4, :cond_a

    sget-object v4, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_a

    :cond_0
    const/4 v4, 0x0

    :try_start_0
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v5

    const-string v6, "getArgs(...)"

    invoke-static {v5, v6}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Landroid/os/Bundle;

    if-eqz v7, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v5

    move-object v6, v4

    goto :goto_3

    :cond_2
    move-object v6, v4

    :goto_0
    instance-of v5, v6, Landroid/os/Bundle;

    if-eqz v5, :cond_3

    check-cast v6, Landroid/os/Bundle;

    goto :goto_1

    :cond_3
    move-object v6, v4

    :goto_1
    if-eqz v6, :cond_4

    invoke-virtual {v6, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_4
    move-object v5, v4

    :goto_2
    :try_start_1
    sget-object v6, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v6

    move-object v8, v6

    move-object v6, v5

    move-object v5, v8

    :goto_3
    invoke-static {v5}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-object v5, v6

    :goto_4
    if-nez v5, :cond_9

    :try_start_2
    const-string v6, "com.tencent.mm.ui.chatting.BaseChattingUIFragment"

    iget-object v0, v0, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v0, v6}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v1, v0}, La/A1;->c(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    goto :goto_5

    :catchall_2
    move-exception p1

    goto :goto_8

    :cond_5
    :goto_5
    if-eqz v0, :cond_6

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_6

    :cond_6
    move-object p1, v4

    :goto_6
    const-string v0, "getArguments"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, La/A1;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_7

    check-cast p1, Landroid/os/Bundle;

    goto :goto_7

    :cond_7
    move-object p1, v4

    :goto_7
    if-eqz p1, :cond_8

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_8
    :try_start_3
    sget-object p1, La/Wf;->a:La/Wf;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-object v5, v4

    goto :goto_9

    :catchall_3
    move-exception p1

    move-object v5, v4

    :goto_8
    invoke-static {p1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object p1

    :goto_9
    invoke-static {p1}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_9

    const-string v0, "get Chat_User from fragment field fail"

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    :cond_9
    iget-object p1, p0, La/q4;->a:La/s4;

    const-string v0, "onEnterBegin"

    invoke-virtual {p1, v5, v0}, La/s4;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_a
    :goto_a
    return-object v3
.end method
