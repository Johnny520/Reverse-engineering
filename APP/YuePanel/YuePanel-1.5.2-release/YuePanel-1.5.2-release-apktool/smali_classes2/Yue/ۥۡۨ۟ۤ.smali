.class public final LYue/ۥۡۨ۟ۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۡۨ۟;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 6 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 7 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n+ 8 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n*L\n1#1,304:1\n1#2:305\n351#3,2:306\n371#3,4:313\n155#3,2:342\n155#3,2:381\n332#4,5:308\n71#5,2:317\n25#5,3:319\n28#5,11:329\n73#5:340\n45#5:341\n46#5,8:344\n71#5,2:356\n25#5,3:358\n28#5,11:368\n73#5:379\n45#5:380\n46#5,8:383\n106#6,7:322\n106#6,7:361\n276#7:352\n276#7:354\n268#7:355\n279#7:391\n268#7:392\n276#7:393\n19#8:353\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n*L\n155#1:306,2\n183#1:313,4\n198#1:342,2\n222#1:381,2\n170#1:308,5\n198#1:317,2\n198#1:319,3\n198#1:329,11\n198#1:340\n198#1:341\n198#1:344,8\n222#1:356,2\n222#1:358,3\n222#1:368,11\n222#1:379\n222#1:380\n222#1:383,8\n198#1:322,7\n222#1:361,7\n202#1:352\n208#1:354\n213#1:355\n227#1:391\n233#1:392\n236#1:393\n203#1:353\n*E\n"
.end annotation


# static fields
.field public static final synthetic ۥ۟۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ۥ۟۟۟۠:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic ۥ۟۟۟ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field volatile synthetic _availablePermits:I
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private volatile synthetic deqIdx:J
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private volatile synthetic enqIdx:J
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private volatile synthetic head:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private volatile synthetic tail:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ:I

.field public final ۥ۟:LYue/ۥۣ۠ۡ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "head"

    const-class v1, LYue/ۥۡۨ۟ۤ;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥۡۨ۟ۤ;->ۥ۟۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "deqIdx"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "tail"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "enqIdx"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟۠:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "_availablePermits"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LYue/ۥۡۨ۟ۤ;->ۥ:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LYue/ۥۡۨ۟ۤ;->deqIdx:J

    iput-wide v0, p0, LYue/ۥۡۨ۟ۤ;->enqIdx:J

    if-lez p1, :cond_1

    if-ltz p2, :cond_0

    if-gt p2, p1, :cond_0

    new-instance v2, LYue/ۥۡۨ۟ۦ;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v2, v0, v1, v3, v4}, LYue/ۥۡۨ۟ۦ;-><init>(JLYue/ۥۡۨ۟ۦ;I)V

    iput-object v2, p0, LYue/ۥۡۨ۟ۤ;->head:Ljava/lang/Object;

    iput-object v2, p0, LYue/ۥۡۨ۟ۤ;->tail:Ljava/lang/Object;

    sub-int/2addr p1, p2

    iput p1, p0, LYue/ۥۡۨ۟ۤ;->_availablePermits:I

    new-instance p1, LYue/ۥۡۨ۟ۤ$ۥ;

    invoke-direct {p1, p0}, LYue/ۥۡۨ۟ۤ$ۥ;-><init>(LYue/ۥۡۨ۟ۤ;)V

    iput-object p1, p0, LYue/ۥۡۨ۟ۤ;->ۥ۟:LYue/ۥۣ۠ۡ۟;

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "The number of acquired permits should be in 0.."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Semaphore should have at least 1 permit, but had "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final synthetic ۥ۟۟۟(LYue/ۥۡۨ۟ۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟۟(LYue/ۥۡۨ۟ۤ;LYue/ۥۣ۟ۨ۟;)Z
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟ۢ(LYue/ۥۣ۟ۨ۟;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic ۥ۟۟۟۠(LYue/ۥۡۨ۟ۤ;)LYue/ۥۣ۠ۡ۟;
    .locals 0

    iget-object p0, p0, LYue/ۥۡۨ۟ۤ;->ۥ۟:LYue/ۥۣ۠ۡ۟;

    return-object p0
.end method


# virtual methods
.method public release()V
    .locals 3

    :cond_0
    iget v0, p0, LYue/ۥۡۨ۟ۤ;->_availablePermits:I

    iget v1, p0, LYue/ۥۡۨ۟ۤ;->ۥ:I

    if-ge v0, v1, :cond_2

    add-int/lit8 v1, v0, 0x1

    sget-object v2, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    if-ltz v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The number of released permits cannot be greater than "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥۡۨ۟ۤ;->ۥ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public ۥ()I
    .locals 2

    iget v0, p0, LYue/ۥۡۨ۟ۤ;->_availablePermits:I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p1    # LYue/ۥ۟ۧۤۢ;
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
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    move-result v0

    if-lez v0, :cond_0

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟۟()Z
    .locals 3

    :cond_0
    iget v0, p0, LYue/ۥۡۨ۟ۤ;->_availablePermits:I

    if-gtz v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    sget-object v1, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0
.end method

.method public final ۥ۟۟۟ۡ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣ۟ۨۢ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥۣ۟ۨ۠;

    move-result-object v0

    :cond_0
    invoke-static {p0, v0}, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟۟(LYue/ۥۡۨ۟ۤ;LYue/ۥۣ۟ۨ۟;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    move-result v1

    if-lez v1, :cond_0

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-static {p0}, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟۠(LYue/ۥۡۨ۟ۤ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟۟(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)V

    :cond_1
    invoke-virtual {v0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟۠ۨ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    invoke-static {p1}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_2
    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_3

    return-object v0

    :cond_3
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public final ۥ۟۟۟ۢ(LYue/ۥۣ۟ۨ۟;)Z
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۨ۟ۤ;->tail:Ljava/lang/Object;

    check-cast v0, LYue/ۥۡۨ۟ۦ;

    sget-object v1, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟۠:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    invoke-static {}, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟ۢ()I

    move-result v3

    int-to-long v3, v3

    div-long v3, v1, v3

    :goto_0
    move-object v5, v0

    :cond_0
    :goto_1
    invoke-virtual {v5}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠()J

    move-result-wide v6

    cmp-long v6, v6, v3

    if-ltz v6, :cond_2

    invoke-virtual {v5}, LYue/ۥۡۧۨ۟;->ۥ۟۟۟ۡ()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {v5}, LYue/ۥۡۧۨ۠;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_3

    :cond_2
    :goto_2
    invoke-static {v5}, LYue/ۥ۟ۦۥۨ;->ۥ(LYue/ۥ۟ۦۥۨ;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {}, LYue/ۥ۟ۦۥۧ;->ۥ()LYue/ۥۢ۠ۦۢ;

    move-result-object v7

    if-ne v6, v7, :cond_a

    invoke-static {}, LYue/ۥ۟ۦۥۧ;->ۥ()LYue/ۥۢ۠ۦۢ;

    move-result-object v5

    invoke-static {v5}, LYue/ۥۡۧۨ۠;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    :goto_3
    invoke-static {v5}, LYue/ۥۡۧۨ۠;->ۥ۟۟۟ۢ(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    invoke-static {v5}, LYue/ۥۡۧۨ۠;->ۥ۟۟۟۠(Ljava/lang/Object;)LYue/ۥۡۧۨ۟;

    move-result-object v6

    :cond_3
    :goto_4
    iget-object v7, p0, LYue/ۥۡۨ۟ۤ;->tail:Ljava/lang/Object;

    check-cast v7, LYue/ۥۡۧۨ۟;

    invoke-virtual {v7}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠()J

    move-result-wide v8

    invoke-virtual {v6}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠()J

    move-result-wide v10

    cmp-long v8, v8, v10

    if-ltz v8, :cond_4

    goto :goto_5

    :cond_4
    invoke-virtual {v6}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠ۡ()Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_0

    :cond_5
    sget-object v8, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v8, p0, v7, v6}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {v7}, LYue/ۥۡۧۨ۟;->ۥ۟۟۟ۨ()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v7}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۦ()V

    goto :goto_5

    :cond_6
    invoke-virtual {v6}, LYue/ۥۡۧۨ۟;->ۥ۟۟۟ۨ()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v6}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۦ()V

    goto :goto_4

    :cond_7
    :goto_5
    invoke-static {v5}, LYue/ۥۡۧۨ۠;->ۥ۟۟۟۠(Ljava/lang/Object;)LYue/ۥۡۧۨ۟;

    move-result-object v0

    check-cast v0, LYue/ۥۡۨ۟ۦ;

    invoke-static {}, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟ۢ()I

    move-result v3

    int-to-long v3, v3

    rem-long/2addr v1, v3

    long-to-int v1, v1

    iget-object v2, v0, LYue/ۥۡۨ۟ۦ;->ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/4 v3, 0x0

    invoke-static {v2, v1, v3, p1}, LYue/ۥ۟ۦۦ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_8

    new-instance v2, LYue/ۥۣ۟ۧۨ;

    invoke-direct {v2, v0, v1}, LYue/ۥۣ۟ۧۨ;-><init>(LYue/ۥۡۨ۟ۦ;I)V

    invoke-interface {p1, v2}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟۟(LYue/ۥۣ۠ۡ۟;)V

    return v3

    :cond_8
    invoke-static {}, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟ۡ()LYue/ۥۢ۠ۦۢ;

    move-result-object v2

    invoke-static {}, LYue/ۥۡۨ۟ۥ;->ۥۣ۟۟۟()LYue/ۥۢ۠ۦۢ;

    move-result-object v4

    iget-object v0, v0, LYue/ۥۡۨ۟ۦ;->ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-static {v0, v1, v2, v4}, LYue/ۥ۟ۦۦ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    iget-object v1, p0, LYue/ۥۡۨ۟ۤ;->ۥ۟:LYue/ۥۣ۠ۡ۟;

    invoke-interface {p1, v0, v1}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟۟(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)V

    return v3

    :cond_9
    const/4 p1, 0x0

    return p1

    :cond_a
    check-cast v6, LYue/ۥ۟ۦۥۨ;

    check-cast v6, LYue/ۥۡۧۨ۟;

    if-eqz v6, :cond_c

    :cond_b
    :goto_6
    move-object v5, v6

    goto/16 :goto_1

    :cond_c
    invoke-virtual {v5}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠()J

    move-result-wide v6

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    move-object v8, v5

    check-cast v8, LYue/ۥۡۨ۟ۦ;

    invoke-static {v6, v7, v8}, LYue/ۥۡۨ۟ۥ;->ۥ۟۟(JLYue/ۥۡۨ۟ۦ;)LYue/ۥۡۨ۟ۦ;

    move-result-object v6

    invoke-virtual {v5, v6}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۧ(LYue/ۥ۟ۦۥۨ;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v5}, LYue/ۥۡۧۨ۟;->ۥ۟۟۟ۡ()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-virtual {v5}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۦ()V

    goto :goto_6
.end method

.method public final ۥۣ۟۟۟(LYue/ۥۣ۟ۨ۟;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)Z"
        }
    .end annotation

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    const/4 v1, 0x0

    iget-object v2, p0, LYue/ۥۡۨ۟ۤ;->ۥ۟:LYue/ۥۣ۠ۡ۟;

    invoke-interface {p1, v0, v1, v2}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {p1, v0}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟ۧ(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ۥ۟۟۟ۤ()Z
    .locals 12

    iget-object v0, p0, LYue/ۥۡۨ۟ۤ;->head:Ljava/lang/Object;

    check-cast v0, LYue/ۥۡۨ۟ۦ;

    sget-object v1, LYue/ۥۡۨ۟ۤ;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    invoke-static {}, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟ۢ()I

    move-result v3

    int-to-long v3, v3

    div-long v3, v1, v3

    :goto_0
    move-object v5, v0

    :cond_0
    :goto_1
    invoke-virtual {v5}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠()J

    move-result-wide v6

    cmp-long v6, v6, v3

    if-ltz v6, :cond_2

    invoke-virtual {v5}, LYue/ۥۡۧۨ۟;->ۥ۟۟۟ۡ()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {v5}, LYue/ۥۡۧۨ۠;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_3

    :cond_2
    :goto_2
    invoke-static {v5}, LYue/ۥ۟ۦۥۨ;->ۥ(LYue/ۥ۟ۦۥۨ;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {}, LYue/ۥ۟ۦۥۧ;->ۥ()LYue/ۥۢ۠ۦۢ;

    move-result-object v7

    if-ne v6, v7, :cond_d

    invoke-static {}, LYue/ۥ۟ۦۥۧ;->ۥ()LYue/ۥۢ۠ۦۢ;

    move-result-object v5

    invoke-static {v5}, LYue/ۥۡۧۨ۠;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    :goto_3
    invoke-static {v5}, LYue/ۥۡۧۨ۠;->ۥ۟۟۟ۢ(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    invoke-static {v5}, LYue/ۥۡۧۨ۠;->ۥ۟۟۟۠(Ljava/lang/Object;)LYue/ۥۡۧۨ۟;

    move-result-object v6

    :cond_3
    :goto_4
    iget-object v7, p0, LYue/ۥۡۨ۟ۤ;->head:Ljava/lang/Object;

    check-cast v7, LYue/ۥۡۧۨ۟;

    invoke-virtual {v7}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠()J

    move-result-wide v8

    invoke-virtual {v6}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠()J

    move-result-wide v10

    cmp-long v8, v8, v10

    if-ltz v8, :cond_4

    goto :goto_5

    :cond_4
    invoke-virtual {v6}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠ۡ()Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_0

    :cond_5
    sget-object v8, LYue/ۥۡۨ۟ۤ;->ۥ۟۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v8, p0, v7, v6}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {v7}, LYue/ۥۡۧۨ۟;->ۥ۟۟۟ۨ()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v7}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۦ()V

    goto :goto_5

    :cond_6
    invoke-virtual {v6}, LYue/ۥۡۧۨ۟;->ۥ۟۟۟ۨ()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v6}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۦ()V

    goto :goto_4

    :cond_7
    :goto_5
    invoke-static {v5}, LYue/ۥۡۧۨ۠;->ۥ۟۟۟۠(Ljava/lang/Object;)LYue/ۥۡۧۨ۟;

    move-result-object v0

    check-cast v0, LYue/ۥۡۨ۟ۦ;

    invoke-virtual {v0}, LYue/ۥ۟ۦۥۨ;->ۥ۟()V

    invoke-virtual {v0}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠()J

    move-result-wide v5

    cmp-long v3, v5, v3

    const/4 v4, 0x0

    if-lez v3, :cond_8

    return v4

    :cond_8
    invoke-static {}, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟ۢ()I

    move-result v3

    int-to-long v5, v3

    rem-long/2addr v1, v5

    long-to-int v1, v1

    invoke-static {}, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟ۡ()LYue/ۥۢ۠ۦۢ;

    move-result-object v2

    iget-object v3, v0, LYue/ۥۡۨ۟ۦ;->ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_b

    invoke-static {}, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟۠()I

    move-result v2

    :goto_6
    const/4 v3, 0x1

    if-ge v4, v2, :cond_a

    iget-object v5, v0, LYue/ۥۡۨ۟ۦ;->ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v5, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {}, LYue/ۥۡۨ۟ۥ;->ۥۣ۟۟۟()LYue/ۥۢ۠ۦۢ;

    move-result-object v6

    if-ne v5, v6, :cond_9

    return v3

    :cond_9
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_a
    invoke-static {}, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟ۡ()LYue/ۥۢ۠ۦۢ;

    move-result-object v2

    invoke-static {}, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟()LYue/ۥۢ۠ۦۢ;

    move-result-object v4

    iget-object v0, v0, LYue/ۥۡۨ۟ۦ;->ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-static {v0, v1, v2, v4}, LYue/ۥ۟ۦۦ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v3

    return v0

    :cond_b
    invoke-static {}, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟۟()LYue/ۥۢ۠ۦۢ;

    move-result-object v0

    if-ne v2, v0, :cond_c

    return v4

    :cond_c
    check-cast v2, LYue/ۥۣ۟ۨ۟;

    invoke-virtual {p0, v2}, LYue/ۥۡۨ۟ۤ;->ۥۣ۟۟۟(LYue/ۥۣ۟ۨ۟;)Z

    move-result v0

    return v0

    :cond_d
    check-cast v6, LYue/ۥ۟ۦۥۨ;

    check-cast v6, LYue/ۥۡۧۨ۟;

    if-eqz v6, :cond_f

    :cond_e
    :goto_7
    move-object v5, v6

    goto/16 :goto_1

    :cond_f
    invoke-virtual {v5}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠()J

    move-result-wide v6

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    move-object v8, v5

    check-cast v8, LYue/ۥۡۨ۟ۦ;

    invoke-static {v6, v7, v8}, LYue/ۥۡۨ۟ۥ;->ۥ۟۟(JLYue/ۥۡۨ۟ۦ;)LYue/ۥۡۨ۟ۦ;

    move-result-object v6

    invoke-virtual {v5, v6}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۧ(LYue/ۥ۟ۦۥۨ;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v5}, LYue/ۥۡۧۨ۟;->ۥ۟۟۟ۡ()Z

    move-result v7

    if-eqz v7, :cond_e

    invoke-virtual {v5}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۦ()V

    goto :goto_7
.end method
