.class public final LYue/ۥۣ۟ۧ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/common/util/concurrent/ListenableFuture;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/common/util/concurrent/ListenableFuture<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "LYue/\u06e5\u06df\u06e3\u06e7$\u06e5<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:LYue/ۥ۟۟ۢ۠;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06df\u06e2\u06e0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۧ$ۥ;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e3\u06e7$\u06e5<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LYue/ۥۣ۟ۧ$ۥ۟۟۟$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۣ۟ۧ$ۥ۟۟۟$ۥ;-><init>(LYue/ۥۣ۟ۧ$ۥ۟۟۟;)V

    iput-object v0, p0, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۢ۠;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۢ۠;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۟۟ۢ۠;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public cancel(Z)Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۟ۧ$ۥ;

    iget-object v1, p0, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۢ۠;

    invoke-virtual {v1, p1}, LYue/ۥ۟۟ۢ۠;->cancel(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟()V

    :cond_0
    return p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۢ۠;

    invoke-virtual {v0}, LYue/ۥ۟۟ۢ۠;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .param p3    # Ljava/util/concurrent/TimeUnit;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۢ۠;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥ۟۟ۢ۠;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isCancelled()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۢ۠;

    invoke-virtual {v0}, LYue/ۥ۟۟ۢ۠;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public isDone()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۢ۠;

    invoke-virtual {v0}, LYue/ۥ۟۟ۢ۠;->isDone()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۢ۠;

    invoke-virtual {v0}, LYue/ۥ۟۟ۢ۠;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(Z)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥ۟۟ۢ۠;->cancel(Z)Z

    move-result p1

    return p1
.end method

.method public ۥ۟(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥ۟۟ۢ۠;->ۥ۟۟۠۟(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥ۟۟ۢ۠;->ۥ۟۟۠۠(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
