.class public final Lp7;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/ClassLoader;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    iput-object p2, p0, Lp7;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    iput-object p3, p0, Lp7;->c:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lp7;->d:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iput-object p5, p0, Lp7;->e:Ljava/lang/String;

    .line 10
    .line 11
    const/16 p1, 0x64

    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lp7;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/util/Set;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :catchall_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 27
    .line 28
    :try_start_0
    invoke-virtual {v2}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;->unhook()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v0, p0, Lp7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    array-length v0, p1

    .line 42
    if-lez v0, :cond_1

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    aget-object p1, p1, v0

    .line 46
    .line 47
    instance-of v0, p1, Landroid/content/Context;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    check-cast p1, Landroid/content/Context;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object p1, v1

    .line 55
    :goto_1
    if-nez p1, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :goto_2
    iget-object p1, p0, Lp7;->e:Ljava/lang/String;

    .line 63
    .line 64
    const-string v0, ".attachBaseContext"

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object p0, p0, Lp7;->c:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v1, p0, p1}, Li5;->x(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lp7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lq7;

    .line 11
    .line 12
    iget-object v2, p0, Lp7;->c:Ljava/lang/String;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lq7;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-class v1, Ldalvik/system/BaseDexClassLoader;

    .line 18
    .line 19
    invoke-static {v1, v0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lp7;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    array-length v0, p1

    .line 33
    if-lez v0, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    aget-object p1, p1, v0

    .line 37
    .line 38
    instance-of v0, p1, Landroid/content/Context;

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    check-cast p1, Landroid/content/Context;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    :goto_0
    const-string v0, "QFix.attachBaseContext"

    .line 47
    .line 48
    invoke-static {p1, v0}, Lcom/mr/elaris/HookEntry;->reloadRuntimeConfig(Landroid/content/Context;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string p1, "block_host_hot_update"

    .line 52
    .line 53
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_1

    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    iget-object p1, p0, Lp7;->d:Ljava/lang/ClassLoader;

    .line 61
    .line 62
    invoke-static {p1}, Lx7;->c(Ljava/lang/ClassLoader;)I

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lx7;->b(Ljava/lang/ClassLoader;)I

    .line 66
    .line 67
    .line 68
    new-instance p1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v0, "host hot update early hooks active: process="

    .line 71
    .line 72
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v0, ", entry="

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    iget-object p0, p0, Lp7;->e:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method
