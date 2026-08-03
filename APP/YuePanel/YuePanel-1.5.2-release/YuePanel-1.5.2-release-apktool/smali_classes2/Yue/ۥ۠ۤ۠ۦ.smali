.class public final LYue/ۥ۠ۤ۠ۦ;
.super LYue/ۥ۠ۤ۠ۧ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۨۨ;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,212:1\n1#2:213\n17#3:214\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n*L\n147#1:214\n*E\n"
.end annotation


# instance fields
.field private volatile _immediate:LYue/ۥ۠ۤ۠ۦ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥۣ۟۟۠:Landroid/os/Handler;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:Z

.field public final ۥ۟۟۠ۦ:LYue/ۥ۠ۤ۠ۦ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/os/Handler;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p1, p2, v0}, LYue/ۥ۠ۤ۠ۦ;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Handler;Ljava/lang/String;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2}, LYue/ۥ۠ۤ۠ۦ;-><init>(Landroid/os/Handler;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, LYue/ۥ۠ۤ۠ۧ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    .line 2
    iput-object p1, p0, LYue/ۥ۠ۤ۠ۦ;->ۥۣ۟۟۠:Landroid/os/Handler;

    .line 3
    iput-object p2, p0, LYue/ۥ۠ۤ۠ۦ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, LYue/ۥ۠ۤ۠ۦ;->ۥ۟۟۠ۥ:Z

    if-eqz p3, :cond_0

    move-object v0, p0

    .line 5
    :cond_0
    iput-object v0, p0, LYue/ۥ۠ۤ۠ۦ;->_immediate:LYue/ۥ۠ۤ۠ۦ;

    .line 6
    iget-object p3, p0, LYue/ۥ۠ۤ۠ۦ;->_immediate:LYue/ۥ۠ۤ۠ۦ;

    if-nez p3, :cond_1

    .line 7
    new-instance p3, LYue/ۥ۠ۤ۠ۦ;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, LYue/ۥ۠ۤ۠ۦ;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    iput-object p3, p0, LYue/ۥ۠ۤ۠ۦ;->_immediate:LYue/ۥ۠ۤ۠ۦ;

    .line 8
    :cond_1
    iput-object p3, p0, LYue/ۥ۠ۤ۠ۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤ۠ۦ;

    return-void
.end method

.method public static synthetic ۥ۟۟ۧۢ(LYue/ۥ۠ۤ۠ۦ;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0, p1}, LYue/ۥ۠ۤ۠ۦ;->ۥ۟۟ۧۦ(LYue/ۥ۠ۤ۠ۦ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static final synthetic ۥۣ۟۟ۧ(LYue/ۥ۠ۤ۠ۦ;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, LYue/ۥ۠ۤ۠ۦ;->ۥۣ۟۟۠:Landroid/os/Handler;

    return-object p0
.end method

.method public static final ۥ۟۟ۧۦ(LYue/ۥ۠ۤ۠ۦ;Ljava/lang/Runnable;)V
    .locals 0

    iget-object p0, p0, LYue/ۥ۠ۤ۠ۦ;->ۥۣ۟۟۠:Landroid/os/Handler;

    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۠ۤ۠ۦ;->ۥۣ۟۟۠:Landroid/os/Handler;

    invoke-virtual {v0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۤ۠ۦ;->ۥ۟۟ۧۤ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    instance-of v0, p1, LYue/ۥ۠ۤ۠ۦ;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥ۠ۤ۠ۦ;

    iget-object p1, p1, LYue/ۥ۠ۤ۠ۦ;->ۥۣ۟۟۠:Landroid/os/Handler;

    iget-object v0, p0, LYue/ۥ۠ۤ۠ۦ;->ۥۣ۟۟۠:Landroid/os/Handler;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤ۠ۦ;->ۥۣ۟۟۠:Landroid/os/Handler;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isDispatchNeeded(LYue/ۥ۟ۧۦۥ;)Z
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iget-boolean p1, p0, LYue/ۥ۠ۤ۠ۦ;->ۥ۟۟۠ۥ:Z

    if-eqz p1, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۤ۠ۦ;->ۥۣ۟۟۠:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۨۥۥ;->ۥ۟۟ۧ۠()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۤ۠ۦ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۤ۠ۦ;->ۥۣ۟۟۠:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    iget-boolean v1, p0, LYue/ۥ۠ۤ۠ۦ;->ۥ۟۟۠ۥ:Z

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".immediate"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public ۥۣ۟۟(JLjava/lang/Runnable;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣۣ۠۟;
    .locals 3
    .param p3    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤ۠ۦ;->ۥۣ۟۟۠:Landroid/os/Handler;

    const-wide v1, 0x3fffffffffffffffL    # 1.9999999999999998

    invoke-static {p1, p2, v1, v2}, LYue/ۥۡۦ۟;->ۥ۟۟ۡۡ(JJ)J

    move-result-wide p1

    invoke-virtual {v0, p3, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, LYue/ۥ۠ۤ۠ۥ;

    invoke-direct {p1, p0, p3}, LYue/ۥ۠ۤ۠ۥ;-><init>(LYue/ۥ۠ۤ۠ۦ;Ljava/lang/Runnable;)V

    return-object p1

    :cond_0
    invoke-virtual {p0, p4, p3}, LYue/ۥ۠ۤ۠ۦ;->ۥ۟۟ۧۤ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    sget-object p1, LYue/ۥۡۢۤۡ;->ۥۣ۟۟۠:LYue/ۥۡۢۤۡ;

    return-object p1
.end method

.method public ۥ۟۟ۤۥ(JLYue/ۥۣ۟ۨ۟;)V
    .locals 4
    .param p3    # LYue/ۥۣ۟ۨ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۤ۠ۦ$ۥ;

    invoke-direct {v0, p3, p0}, LYue/ۥ۠ۤ۠ۦ$ۥ;-><init>(LYue/ۥۣ۟ۨ۟;LYue/ۥ۠ۤ۠ۦ;)V

    iget-object v1, p0, LYue/ۥ۠ۤ۠ۦ;->ۥۣ۟۟۠:Landroid/os/Handler;

    const-wide v2, 0x3fffffffffffffffL    # 1.9999999999999998

    invoke-static {p1, p2, v2, v3}, LYue/ۥۡۦ۟;->ۥ۟۟ۡۡ(JJ)J

    move-result-wide p1

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, LYue/ۥ۠ۤ۠ۦ$ۥ۟;

    invoke-direct {p1, p0, v0}, LYue/ۥ۠ۤ۠ۦ$ۥ۟;-><init>(LYue/ۥ۠ۤ۠ۦ;Ljava/lang/Runnable;)V

    invoke-interface {p3, p1}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟۟(LYue/ۥۣ۠ۡ۟;)V

    goto :goto_0

    :cond_0
    invoke-interface {p3}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, LYue/ۥ۠ۤ۠ۦ;->ۥ۟۟ۧۤ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic ۥ۟۟ۧ۟()LYue/ۥ۠ۨۥۥ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۤ۠ۦ;->ۥ۟۟ۧۥ()LYue/ۥ۠ۤ۠ۦ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟ۧۡ()LYue/ۥ۠ۤ۠ۧ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۤ۠ۦ;->ۥ۟۟ۧۥ()LYue/ۥ۠ۤ۠ۦ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟ۧۤ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V
    .locals 3

    new-instance v0, Ljava/util/concurrent/CancellationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The task was rejected, the handler underlying the dispatcher \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' was closed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟۟۠(LYue/ۥ۟ۧۦۥ;Ljava/util/concurrent/CancellationException;)V

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟()LYue/ۥ۟ۧۦۨ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LYue/ۥ۟ۧۦۨ;->dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public ۥ۟۟ۧۥ()LYue/ۥ۠ۤ۠ۦ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤ۠ۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤ۠ۦ;

    return-object v0
.end method
