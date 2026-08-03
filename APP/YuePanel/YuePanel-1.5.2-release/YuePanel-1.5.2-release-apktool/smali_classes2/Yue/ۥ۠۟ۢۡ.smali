.class public final LYue/ۥ۠۟ۢۡ;
.super LYue/ۥۡۧۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e1\u06e7\u06e5<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBuilders.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/DispatchedCoroutine\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,272:1\n351#2,2:273\n351#2,2:275\n*S KotlinDebug\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/DispatchedCoroutine\n*L\n232#1:273,2\n242#1:275,2\n*E\n"
.end annotation


# static fields
.field public static final synthetic ۥ۟۟۠ۦ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic _decision:I
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LYue/ۥ۠۟ۢۡ;

    const-string v1, "_decision"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥ۠۟ۢۡ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, LYue/ۥۡۧۥ;-><init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۤۢ;)V

    const/4 p1, 0x0

    iput p1, p0, LYue/ۥ۠۟ۢۡ;->_decision:I

    return-void
.end method

.method private final ۥۣ۟۠۠()Z
    .locals 4

    :cond_0
    iget v0, p0, LYue/ۥ۠۟ۢۡ;->_decision:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already resumed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object v0, LYue/ۥ۠۟ۢۡ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v3, 0x2

    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2
.end method

.method private final ۥ۟۠۠ۤ()Z
    .locals 3

    :cond_0
    iget v0, p0, LYue/ۥ۠۟ۢۡ;->_decision:I

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already suspended"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object v0, LYue/ۥ۠۟ۢۡ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2
.end method


# virtual methods
.method public ۥۣ۟۟ۢ(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, LYue/ۥ۠۟ۢۡ;->ۥ۟۠۟ۧ(Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۠۟ۧ(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥ۠۟ۢۡ;->ۥۣ۟۠۠()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥۡۧۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۤۢ;

    invoke-static {v0}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۧۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۤۢ;

    invoke-static {p1, v1}, LYue/ۥ۟ۦۣۨ;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, LYue/ۥ۠۟ۢ۠;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۤۢ;Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)V

    return-void
.end method

.method public final ۥ۟۠۠ۢ()Ljava/lang/Object;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-direct {p0}, LYue/ۥ۠۟ۢۡ;->ۥ۟۠۠ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۦۣ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۦ۠۠;->ۥ۟۟۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LYue/ۥ۟ۦۣۢ;

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    check-cast v0, LYue/ۥ۟ۦۣۢ;

    iget-object v0, v0, LYue/ۥ۟ۦۣۢ;->ۥ:Ljava/lang/Throwable;

    throw v0
.end method
