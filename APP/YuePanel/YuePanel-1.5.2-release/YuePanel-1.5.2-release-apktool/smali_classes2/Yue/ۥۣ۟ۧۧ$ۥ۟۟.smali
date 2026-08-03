.class public final LYue/ۥۣ۟ۧۧ$ۥ۟۟;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۧۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,981:1\n287#2:982\n288#2:985\n275#2:986\n289#2,4:987\n294#2:991\n284#2,2:994\n270#2:997\n279#2:998\n273#2:999\n270#2:1000\n468#3,2:983\n1#4:992\n82#5:993\n20#6:996\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n645#1:982\n645#1:985\n645#1:986\n645#1:987,4\n659#1:991\n764#1:994,2\n812#1:997\n838#1:998\n838#1:999\n908#1:1000\n645#1:983,2\n747#1:993\n808#1:996\n*E\n"
.end annotation


# static fields
.field public static final synthetic ۥ۟۟ۡ۟:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile indexInArray:I

.field private volatile nextParkedWorker:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field volatile synthetic workerCtl:I
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥۣ۟۟۠:LYue/ۥۢۦ۟ۦ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:J

.field public ۥ۟۟۠ۦ:J

.field public ۥ۟۟۠ۧ:I

.field public ۥ۟۟۠ۨ:Z
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public final synthetic ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;

    const-string v1, "workerCtl"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ۟:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣ۟ۧۧ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 3
    new-instance p1, LYue/ۥۢۦ۟ۦ;

    invoke-direct {p1}, LYue/ۥۢۦ۟ۦ;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۦ۟ۦ;

    .line 4
    sget-object p1, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    iput-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->workerCtl:I

    .line 6
    sget-object p1, LYue/ۥۣ۟ۧۧ;->ۥۣ۟۟ۡ:LYue/ۥۢ۠ۦۢ;

    iput-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->nextParkedWorker:Ljava/lang/Object;

    .line 7
    sget-object p1, LYue/ۥۡۥۨۤ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ$ۥ;

    invoke-virtual {p1}, LYue/ۥۡۥۨۤ$ۥ;->ۥ۟۟۟ۦ()I

    move-result p1

    iput p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۧ:I

    return-void
.end method

.method public constructor <init>(LYue/ۥۣ۟ۧۧ;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;-><init>(LYue/ۥۣ۟ۧۧ;)V

    .line 9
    invoke-virtual {p0, p2}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠۟(I)V

    return-void
.end method

.method public static final synthetic ۥ(LYue/ۥۣ۟ۧۧ$ۥ۟۟;)LYue/ۥۣ۟ۧۧ;
    .locals 0

    iget-object p0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    return-object p0
.end method


# virtual methods
.method public run()V
    .locals 0

    invoke-virtual {p0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠()V

    return-void
.end method

.method public final ۥ۟(I)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    sget-object v0, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۡۡ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide/32 v1, -0x200000

    invoke-virtual {v0, p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    iget-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    sget-object v0, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    if-eq p1, v0, :cond_1

    sget-object p1, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    iput-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    :cond_1
    return-void
.end method

.method public final ۥ۟۟(I)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    sget-object p1, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥۣ۟۟۠(LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۤۤ()V

    :cond_1
    return-void
.end method

.method public final ۥ۟۟۟(LYue/ۥۢ۠ۨۧ;)V
    .locals 2

    iget-object v0, p1, LYue/ۥۢ۠ۨۧ;->ۥ۟۟۠ۤ:LYue/ۥۢ۠ۨۨ;

    invoke-interface {v0}, LYue/ۥۢ۠ۨۨ;->ۥۣ۟۟ۤ()I

    move-result v0

    invoke-virtual {p0, v0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۟ۤ(I)V

    invoke-virtual {p0, v0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟(I)V

    iget-object v1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    invoke-virtual {v1, p1}, LYue/ۥۣ۟ۧۧ;->ۥۣ۟۟۠(LYue/ۥۢ۠ۨۧ;)V

    invoke-virtual {p0, v0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟(I)V

    return-void
.end method

.method public final ۥ۟۟۟۟(Z)LYue/ۥۢ۠ۨۧ;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    iget-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    iget p1, p1, LYue/ۥۣ۟ۧۧ;->ۥۣ۟۟۠:I

    mul-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۟ۦ(I)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۟ۨ()LYue/ۥۢ۠ۨۧ;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    iget-object v1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۦ۟ۦ;

    invoke-virtual {v1}, LYue/ۥۢۦ۟ۦ;->ۥ۟۟۟ۢ()LYue/ۥۢ۠ۨۧ;

    move-result-object v1

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    if-nez p1, :cond_4

    invoke-virtual {p0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۟ۨ()LYue/ۥۢ۠ۨۧ;

    move-result-object p1

    if-eqz p1, :cond_4

    return-object p1

    :cond_3
    invoke-virtual {p0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۟ۨ()LYue/ۥۢ۠ۨۧ;

    move-result-object p1

    if-eqz p1, :cond_4

    return-object p1

    :cond_4
    invoke-virtual {p0, v0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ(Z)LYue/ۥۢ۠ۨۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟۠(Z)LYue/ۥۢ۠ۨۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۟۟(Z)LYue/ۥۢ۠ۨۧ;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    iget-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۦ۟ۦ;

    invoke-virtual {p1}, LYue/ۥۢۦ۟ۦ;->ۥ۟۟۟ۢ()LYue/ۥۢ۠ۨۧ;

    move-result-object p1

    if-nez p1, :cond_2

    iget-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    iget-object p1, p1, LYue/ۥۣ۟ۧۧ;->ۥ۟۟۠ۨ:LYue/ۥۣ۠ۥۨ;

    invoke-virtual {p1}, LYue/ۥ۠ۨ۠ۧ;->ۥ۟۟۟ۡ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۢ۠ۨۧ;

    goto :goto_0

    :cond_1
    iget-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    iget-object p1, p1, LYue/ۥۣ۟ۧۧ;->ۥ۟۟۠ۨ:LYue/ۥۣ۠ۥۨ;

    invoke-virtual {p1}, LYue/ۥ۠ۨ۠ۧ;->ۥ۟۟۟ۡ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۢ۠ۨۧ;

    :cond_2
    :goto_0
    if-nez p1, :cond_3

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ(Z)LYue/ۥۢ۠ۨۧ;

    move-result-object p1

    :cond_3
    return-object p1
.end method

.method public final ۥ۟۟۟ۡ()I
    .locals 1

    iget v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->indexInArray:I

    return v0
.end method

.method public final ۥ۟۟۟ۢ()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->nextParkedWorker:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۥۣ۟۟۟()LYue/ۥۣ۟ۧۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ(LYue/ۥۣ۟ۧۧ$ۥ۟۟;)LYue/ۥۣ۟ۧۧ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟ۤ(I)V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۥ:J

    iget-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    sget-object v0, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    if-ne p1, v0, :cond_0

    sget-object p1, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    iput-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    :cond_0
    return-void
.end method

.method public final ۥ۟۟۟ۥ()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->nextParkedWorker:Ljava/lang/Object;

    sget-object v1, LYue/ۥۣ۟ۧۧ;->ۥۣ۟۟ۡ:LYue/ۥۢ۠ۦۢ;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟۟ۦ(I)I
    .locals 3

    iget v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۧ:I

    shl-int/lit8 v1, v0, 0xd

    xor-int/2addr v0, v1

    shr-int/lit8 v1, v0, 0x11

    xor-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x5

    xor-int/2addr v0, v1

    iput v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۧ:I

    add-int/lit8 v1, p1, -0x1

    and-int v2, v1, p1

    if-nez v2, :cond_0

    and-int p1, v0, v1

    return p1

    :cond_0
    const v1, 0x7fffffff

    and-int/2addr v0, v1

    rem-int/2addr v0, p1

    return v0
.end method

.method public final ۥ۟۟۟ۧ()V
    .locals 6

    iget-wide v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۥ:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v4, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    iget-wide v4, v4, LYue/ۥۣ۟ۧۧ;->ۥ۟۟۠ۥ:J

    add-long/2addr v0, v4

    iput-wide v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۥ:J

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    iget-wide v0, v0, LYue/ۥۣ۟ۧۧ;->ۥ۟۟۠ۥ:J

    invoke-static {v0, v1}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v4, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۥ:J

    sub-long/2addr v0, v4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    iput-wide v2, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۥ:J

    invoke-virtual {p0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۥ()V

    :cond_1
    return-void
.end method

.method public final ۥ۟۟۟ۨ()LYue/ۥۢ۠ۨۧ;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۟ۦ(I)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    iget-object v0, v0, LYue/ۥۣ۟ۧۧ;->ۥ۟۟۠ۧ:LYue/ۥۣ۠ۥۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨ۠ۧ;->ۥ۟۟۟ۡ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۠ۨۧ;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    iget-object v0, v0, LYue/ۥۣ۟ۧۧ;->ۥ۟۟۠ۨ:LYue/ۥۣ۠ۥۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨ۠ۧ;->ۥ۟۟۟ۡ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۠ۨۧ;

    return-object v0

    :cond_1
    iget-object v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    iget-object v0, v0, LYue/ۥۣ۟ۧۧ;->ۥ۟۟۠ۨ:LYue/ۥۣ۠ۥۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨ۠ۧ;->ۥ۟۟۟ۡ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۠ۨۧ;

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    iget-object v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    iget-object v0, v0, LYue/ۥۣ۟ۧۧ;->ۥ۟۟۠ۧ:LYue/ۥۣ۠ۥۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨ۠ۧ;->ۥ۟۟۟ۡ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۠ۨۧ;

    return-object v0
.end method

.method public final ۥ۟۟۠()V
    .locals 7

    const/4 v0, 0x0

    :goto_0
    move v1, v0

    :goto_1
    iget-object v2, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    invoke-virtual {v2}, LYue/ۥۣ۟ۧۧ;->isTerminated()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    sget-object v3, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    if-eq v2, v3, :cond_3

    iget-boolean v2, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۨ:Z

    invoke-virtual {p0, v2}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۟۠(Z)LYue/ۥۢ۠ۨۧ;

    move-result-object v2

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_0

    iput-wide v3, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۦ:J

    invoke-virtual {p0, v2}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۟(LYue/ۥۢ۠ۨۧ;)V

    goto :goto_0

    :cond_0
    iput-boolean v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۨ:Z

    iget-wide v5, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۦ:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_2

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    sget-object v1, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    invoke-virtual {p0, v1}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥۣ۟۟۠(LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;)Z

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    iget-wide v1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۦ:J

    invoke-static {v1, v2}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    iput-wide v3, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۦ:J

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۢ()V

    goto :goto_1

    :cond_3
    sget-object v0, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    invoke-virtual {p0, v0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥۣ۟۟۠(LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;)Z

    return-void
.end method

.method public final ۥ۟۟۠۟(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    iget-object v1, v1, LYue/ۥۣ۟ۧۧ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-worker-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_0

    const-string v1, "TERMINATED"

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    iput p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->indexInArray:I

    return-void
.end method

.method public final ۥ۟۟۠۠(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->nextParkedWorker:Ljava/lang/Object;

    return-void
.end method

.method public final ۥ۟۟۠ۡ()Z
    .locals 9

    iget-object v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    sget-object v1, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    :cond_1
    iget-wide v5, v0, LYue/ۥۣ۟ۧۧ;->controlState:J

    const-wide v3, 0x7ffffc0000000000L

    and-long/2addr v3, v5

    const/16 v1, 0x2a

    shr-long/2addr v3, v1

    long-to-int v1, v3

    if-nez v1, :cond_2

    const/4 v2, 0x0

    goto :goto_0

    :cond_2
    const-wide v3, 0x40000000000L

    sub-long v7, v5, v3

    sget-object v3, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۡۡ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object v4, v0

    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    iput-object v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    :goto_0
    return v2
.end method

.method public final ۥ۟۟۠ۢ()V
    .locals 3

    invoke-virtual {p0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۟ۥ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    invoke-virtual {v0, p0}, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۢۧ(LYue/ۥۣ۟ۧۧ$ۥ۟۟;)Z

    return-void

    :cond_0
    const/4 v0, -0x1

    iput v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->workerCtl:I

    :goto_0
    invoke-virtual {p0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۟ۥ()Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->workerCtl:I

    if-ne v1, v0, :cond_2

    iget-object v1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    invoke-virtual {v1}, LYue/ۥۣ۟ۧۧ;->isTerminated()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    sget-object v2, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    invoke-virtual {p0, v1}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥۣ۟۟۠(LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;)Z

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    invoke-virtual {p0}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۟ۧ()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final ۥۣ۟۟۠(LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;)Z
    .locals 6
    .param p1    # LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    sget-object v1, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v2, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    sget-object v3, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۡۡ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide v4, 0x40000000000L

    invoke-virtual {v3, v2, v4, v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    :cond_1
    if-eq v0, p1, :cond_2

    iput-object p1, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    :cond_2
    return v1
.end method

.method public final ۥ۟۟۠ۤ(Z)LYue/ۥۢ۠ۨۧ;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    iget-wide v1, v1, LYue/ۥۣ۟ۧۧ;->controlState:J

    const-wide/32 v3, 0x1fffff

    and-long/2addr v1, v3

    long-to-int v1, v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-ge v1, v2, :cond_0

    return-object v3

    :cond_0
    invoke-virtual {v0, v1}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۟ۦ(I)I

    move-result v2

    iget-object v4, v0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    const-wide v5, 0x7fffffffffffffffL

    const/4 v7, 0x0

    move-wide v8, v5

    :goto_0
    const-wide/16 v10, 0x0

    if-ge v7, v1, :cond_5

    const/4 v12, 0x1

    add-int/2addr v2, v12

    if-le v2, v1, :cond_1

    move v2, v12

    :cond_1
    iget-object v12, v4, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۡ:LYue/ۥۡۦۦ;

    invoke-virtual {v12, v2}, LYue/ۥۡۦۦ;->ۥ۟(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LYue/ۥۣ۟ۧۧ$ۥ۟۟;

    if-eqz v12, :cond_4

    if-eq v12, v0, :cond_4

    if-eqz p1, :cond_2

    iget-object v13, v0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۦ۟ۦ;

    iget-object v12, v12, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۦ۟ۦ;

    invoke-virtual {v13, v12}, LYue/ۥۢۦ۟ۦ;->ۥ۟۟۟ۥ(LYue/ۥۢۦ۟ۦ;)J

    move-result-wide v12

    goto :goto_1

    :cond_2
    iget-object v13, v0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۦ۟ۦ;

    iget-object v12, v12, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۦ۟ۦ;

    invoke-virtual {v13, v12}, LYue/ۥۢۦ۟ۦ;->ۥ۟۟۟ۦ(LYue/ۥۢۦ۟ۦ;)J

    move-result-wide v12

    :goto_1
    const-wide/16 v14, -0x1

    cmp-long v14, v12, v14

    if-nez v14, :cond_3

    iget-object v1, v0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۦ۟ۦ;

    invoke-virtual {v1}, LYue/ۥۢۦ۟ۦ;->ۥ۟۟۟ۢ()LYue/ۥۢ۠ۨۧ;

    move-result-object v1

    return-object v1

    :cond_3
    cmp-long v10, v12, v10

    if-lez v10, :cond_4

    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_5
    cmp-long v1, v8, v5

    if-eqz v1, :cond_6

    goto :goto_2

    :cond_6
    move-wide v8, v10

    :goto_2
    iput-wide v8, v0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۦ:J

    return-object v3
.end method

.method public final ۥ۟۟۠ۥ()V
    .locals 8

    iget-object v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۟ۧۧ;

    iget-object v1, v0, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۡ:LYue/ۥۡۦۦ;

    monitor-enter v1

    :try_start_0
    invoke-virtual {v0}, LYue/ۥۣ۟ۧۧ;->isTerminated()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    monitor-exit v1

    return-void

    :cond_0
    :try_start_1
    iget-wide v2, v0, LYue/ۥۣ۟ۧۧ;->controlState:J

    const-wide/32 v4, 0x1fffff

    and-long/2addr v2, v4

    long-to-int v2, v2

    iget v3, v0, LYue/ۥۣ۟ۧۧ;->ۥۣ۟۟۠:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gt v2, v3, :cond_1

    monitor-exit v1

    return-void

    :cond_1
    :try_start_2
    sget-object v2, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟ۡ۟:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v3, -0x1

    const/4 v6, 0x1

    invoke-virtual {v2, p0, v3, v6}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v2, :cond_2

    monitor-exit v1

    return-void

    :cond_2
    :try_start_3
    iget v2, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->indexInArray:I

    const/4 v3, 0x0

    invoke-virtual {p0, v3}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠۟(I)V

    invoke-virtual {v0, p0, v2, v3}, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۢۨ(LYue/ۥۣ۟ۧۧ$ۥ۟۟;II)V

    sget-object v3, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۡۡ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    move-result-wide v6

    and-long v3, v6, v4

    long-to-int v3, v3

    if-eq v3, v2, :cond_3

    iget-object v4, v0, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۡ:LYue/ۥۡۦۦ;

    invoke-virtual {v4, v3}, LYue/ۥۡۦۦ;->ۥ۟(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    check-cast v4, LYue/ۥۣ۟ۧۧ$ۥ۟۟;

    iget-object v5, v0, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۡ:LYue/ۥۡۦۦ;

    invoke-virtual {v5, v2, v4}, LYue/ۥۡۦۦ;->ۥ۟۟(ILjava/lang/Object;)V

    invoke-virtual {v4, v2}, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠۟(I)V

    invoke-virtual {v0, v4, v3, v2}, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۢۨ(LYue/ۥۣ۟ۧۧ$ۥ۟۟;II)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_3
    :goto_0
    iget-object v0, v0, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۡ:LYue/ۥۡۦۦ;

    const/4 v2, 0x0

    invoke-virtual {v0, v3, v2}, LYue/ۥۡۦۦ;->ۥ۟۟(ILjava/lang/Object;)V

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v1

    sget-object v0, LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    iput-object v0, p0, LYue/ۥۣ۟ۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۧۧ$ۥ۟۟۟;

    return-void

    :goto_1
    monitor-exit v1

    throw v0
.end method
