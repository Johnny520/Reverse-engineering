.class public LYue/ۥۡۡ۠ۢ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۡۢۦ$ۥ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۡ۠ۢ;->ۥ۟(LYue/ۥۢۡۢۦ$ۥ;)LYue/ۥۢۡۢۦ$ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e2\u06e1\u06e2\u06e6$\u06e5<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۡ:I = 0x1

.field public static final ۥ۟۟۟ۢ:I = 0x2

.field public static final ۥۣ۟۟۟:I = 0x3

.field public static final ۥ۟۟۟ۤ:I = 0x4


# instance fields
.field public final ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟;

.field public final ۥ۟:Ljava/util/concurrent/Executor;

.field public ۥ۟۟:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ۥ۟۟۟:Ljava/lang/Runnable;

.field public final synthetic ۥ۟۟۟۟:LYue/ۥۢۡۢۦ$ۥ;

.field public final synthetic ۥ۟۟۟۠:LYue/ۥۡۡ۠ۢ;


# direct methods
.method public constructor <init>(LYue/ۥۡۡ۠ۢ;LYue/ۥۢۡۢۦ$ۥ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ۟۟۟۠:LYue/ۥۡۡ۠ۢ;

    iput-object p2, p0, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ۟۟۟۟:LYue/ۥۢۡۢۦ$ۥ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, LYue/ۥۡۡ۠ۢ$ۥ۟۟;

    invoke-direct {p1}, LYue/ۥۡۡ۠ۢ$ۥ۟۟;-><init>()V

    iput-object p1, p0, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟;

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    iput-object p1, p0, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ۟:Ljava/util/concurrent/Executor;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ۟۟:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, LYue/ۥۡۡ۠ۢ$ۥ۟$ۥ;

    invoke-direct {p1, p0}, LYue/ۥۡۡ۠ۢ$ۥ۟$ۥ;-><init>(LYue/ۥۡۡ۠ۢ$ۥ۟;)V

    iput-object p1, p0, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ۟۟۟:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public ۥ(IIIII)V
    .locals 7

    const/4 v0, 0x2

    const/4 v6, 0x0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-static/range {v0 .. v6}, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ۟(IIIIIILjava/lang/Object;)LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ۟۟۟ۡ(LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;)V

    return-void
.end method

.method public ۥ۟(II)V
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0, p1, p2}, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ(III)LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ۟۟۟۠(LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;)V

    return-void
.end method

.method public ۥ۟۟(I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ۟۟(IILjava/lang/Object;)LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ۟۟۟ۡ(LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;)V

    return-void
.end method

.method public ۥ۟۟۟(LYue/ۥۣۣۢۡ$ۥ;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e1\u06e3\u06e3$\u06e5<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ۟۟(IILjava/lang/Object;)LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ۟۟۟۠(LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;)V

    return-void
.end method

.method public final ۥ۟۟۟۟()V
    .locals 3

    iget-object v0, p0, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ۟۟:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ۟:Ljava/util/concurrent/Executor;

    iget-object v1, p0, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ۟۟۟:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final ۥ۟۟۟۠(LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۡۡ۠ۢ$ۥ۟۟;->ۥ۟۟(LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;)V

    invoke-virtual {p0}, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ۟۟۟۟()V

    return-void
.end method

.method public final ۥ۟۟۟ۡ(LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۡۡ۠ۢ$ۥ۟۟;->ۥ۟۟۟(LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;)V

    invoke-virtual {p0}, LYue/ۥۡۡ۠ۢ$ۥ۟;->ۥ۟۟۟۟()V

    return-void
.end method
