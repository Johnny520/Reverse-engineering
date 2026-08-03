.class public final LYue/ۥ۠ۤۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n314#2,11:213\n314#2,9:224\n323#2,2:234\n17#3:233\n1#4:236\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n189#1:213,11\n194#1:224,9\n194#1:234,2\n195#1:233\n*E\n"
.end annotation


# static fields
.field private static volatile choreographer:Landroid/view/Choreographer; = null
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public static final ۥ:J = 0x3fffffffffffffffL

.field public static final ۥ۟:LYue/ۥ۠ۤ۠ۧ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    new-instance v1, LYue/ۥ۠ۤ۠ۦ;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, LYue/ۥ۠ۤۡ;->ۥ۟۟۟(Landroid/os/Looper;Z)Landroid/os/Handler;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v1, v2, v0, v3, v0}, LYue/ۥ۠ۤ۠ۦ;-><init>(Landroid/os/Handler;Ljava/lang/String;ILYue/ۥ۟ۨۥۢ;)V

    invoke-static {v1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    sget-object v2, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {v1}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    invoke-static {v1}, LYue/ۥۡۦۧۤ;->ۥۣ۟۟۟(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    move-object v0, v1

    :goto_1
    check-cast v0, LYue/ۥ۠ۤ۠ۧ;

    sput-object v0, LYue/ۥ۠ۤۡ;->ۥ۟:LYue/ۥ۠ۤ۠ۧ;

    return-void
.end method

.method public static synthetic ۥ(LYue/ۥۣ۟ۨ۟;J)V
    .locals 0

    invoke-static {p0, p1, p2}, LYue/ۥ۠ۤۡ;->ۥ۟۟۟ۥ(LYue/ۥۣ۟ۨ۟;J)V

    return-void
.end method

.method public static final synthetic ۥ۟(Landroid/view/Choreographer;LYue/ۥۣ۟ۨ۟;)V
    .locals 0

    invoke-static {p0, p1}, LYue/ۥ۠ۤۡ;->ۥ۟۟۟ۤ(Landroid/view/Choreographer;LYue/ۥۣ۟ۨ۟;)V

    return-void
.end method

.method public static final synthetic ۥ۟۟(LYue/ۥۣ۟ۨ۟;)V
    .locals 0

    invoke-static {p0}, LYue/ۥ۠ۤۡ;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۨ۟;)V

    return-void
.end method

.method public static final ۥ۟۟۟(Landroid/os/Looper;Z)Landroid/os/Handler;
    .locals 4
    .param p0    # Landroid/os/Looper;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    if-eqz p1, :cond_2

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    const/4 v1, 0x0

    const-class v2, Landroid/os/Looper;

    const-class v3, Landroid/os/Handler;

    if-lt p1, v0, :cond_1

    const-string p1, "createAsync"

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v3, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    check-cast p0, Landroid/os/Handler;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.os.Handler"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :try_start_0
    const-class p1, Landroid/os/Handler$Callback;

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v2, p1, v0}, [Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    filled-new-array {p0, v1, v0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/Handler;

    return-object p0

    :catch_0
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object p1

    :cond_2
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object p1
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, LYue/ۥ۠ۤۡ;->choreographer:Landroid/view/Choreographer;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    new-instance v2, LYue/ۥۣ۟ۨ۠;

    invoke-static {p0}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v3

    invoke-direct {v2, v3, v1}, LYue/ۥۣ۟ۨ۠;-><init>(LYue/ۥ۟ۧۤۢ;I)V

    invoke-virtual {v2}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟ۢ۟()V

    invoke-static {v0, v2}, LYue/ۥ۠ۤۡ;->ۥ۟(Landroid/view/Choreographer;LYue/ۥۣ۟ۨ۟;)V

    invoke-virtual {v2}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟۠ۨ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_0
    return-object v0

    :cond_1
    new-instance v0, LYue/ۥۣ۟ۨ۠;

    invoke-static {p0}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v2

    invoke-direct {v0, v2, v1}, LYue/ۥۣ۟ۨ۠;-><init>(LYue/ۥ۟ۧۤۢ;I)V

    invoke-virtual {v0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟ۢ۟()V

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟۟()LYue/ۥ۠ۨۥۥ;

    move-result-object v1

    sget-object v2, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    new-instance v3, LYue/ۥ۠ۤۡ$ۥ;

    invoke-direct {v3, v0}, LYue/ۥ۠ۤۡ$ۥ;-><init>(LYue/ۥۣ۟ۨ۟;)V

    invoke-virtual {v1, v2, v3}, LYue/ۥ۟ۧۦۨ;->dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    invoke-virtual {v0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟۠ۨ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    invoke-static {p0}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_2
    return-object v0
.end method

.method public static final ۥ۟۟۟۠(Landroid/os/Handler;)LYue/ۥ۠ۤ۠ۧ;
    .locals 2
    .param p0    # Landroid/os/Handler;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "from"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, LYue/ۥ۠ۤۡ;->ۥ۟۟۟ۢ(Landroid/os/Handler;Ljava/lang/String;ILjava/lang/Object;)LYue/ۥ۠ۤ۠ۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۡ(Landroid/os/Handler;Ljava/lang/String;)LYue/ۥ۠ۤ۠ۧ;
    .locals 1
    .param p0    # Landroid/os/Handler;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "from"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۠ۤ۠ۦ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۤ۠ۦ;-><init>(Landroid/os/Handler;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic ۥ۟۟۟ۢ(Landroid/os/Handler;Ljava/lang/String;ILjava/lang/Object;)LYue/ۥ۠ۤ۠ۧ;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۠ۤۡ;->ۥ۟۟۟ۡ(Landroid/os/Handler;Ljava/lang/String;)LYue/ۥ۠ۤ۠ۧ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥۣ۟۟۟()V
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Use Dispatchers.Main instead"
    .end annotation

    return-void
.end method

.method public static final ۥ۟۟۟ۤ(Landroid/view/Choreographer;LYue/ۥۣ۟ۨ۟;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/Choreographer;",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "-",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۤ۠ۨ;

    invoke-direct {v0, p1}, LYue/ۥ۠ۤ۠ۨ;-><init>(LYue/ۥۣ۟ۨ۟;)V

    invoke-virtual {p0, v0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method

.method public static final ۥ۟۟۟ۥ(LYue/ۥۣ۟ۨ۟;J)V
    .locals 1

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟۟()LYue/ۥ۠ۨۥۥ;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, v0, p1}, LYue/ۥۣ۟ۨ۟;->ۥ۟۟۠۠(LYue/ۥ۟ۧۦۨ;Ljava/lang/Object;)V

    return-void
.end method

.method public static final ۥ۟۟۟ۦ(LYue/ۥۣ۟ۨ۟;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "-",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    sget-object v0, LYue/ۥ۠ۤۡ;->choreographer:Landroid/view/Choreographer;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    sput-object v0, LYue/ۥ۠ۤۡ;->choreographer:Landroid/view/Choreographer;

    :cond_0
    invoke-static {v0, p0}, LYue/ۥ۠ۤۡ;->ۥ۟۟۟ۤ(Landroid/view/Choreographer;LYue/ۥۣ۟ۨ۟;)V

    return-void
.end method
