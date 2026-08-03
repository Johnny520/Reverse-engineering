.class public final La/Y7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/mmjz/floatingclouds/plugin/IPlugin;


# static fields
.field public static volatile c:La/Y7;


# instance fields
.field public volatile a:Landroid/app/Activity;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "La/D7<",
            "Landroid/app/Activity;",
            "La/Wf;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, La/Y7;->b:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static a(Landroid/view/ViewGroup;La/V7;)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {p1, v2}, La/V7;->f(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_0

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2, p1}, La/Y7;->a(Landroid/view/ViewGroup;La/V7;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final b(Landroid/app/Activity;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "Sns"

    invoke-static {v0, v2, v1}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "[GlobalLifecycle] Activity: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    :cond_0
    iget-object v1, p0, La/Y7;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/D7;

    :try_start_0
    invoke-interface {v1, p1}, La/D7;->f(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final handleHook(La/J8;)V
    .locals 5

    const-string v0, "session"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p0, La/Y7;->c:La/Y7;

    const-class v0, Landroid/os/Bundle;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    new-instance v1, La/U7;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, La/U7;-><init>(La/Y7;I)V

    const-string v2, "onCreate"

    const-string v3, "android.app.Activity"

    invoke-static {p1, v3, v2, v0, v1}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Class;

    new-instance v2, La/U7;

    const/4 v4, 0x1

    invoke-direct {v2, p0, v4}, La/U7;-><init>(La/Y7;I)V

    const-string v4, "onResume"

    invoke-static {p1, v3, v4, v1, v2}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    new-array v0, v0, [Ljava/lang/Class;

    new-instance v1, La/U7;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, La/U7;-><init>(La/Y7;I)V

    const-string v2, "onDestroy"

    invoke-static {p1, v3, v2, v0, v1}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    const-string p1, "[GlobalLifecycle] hooked Activity lifecycle"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    return-void
.end method
