.class public Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;


# static fields
.field public static final synthetic 飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic _interestedOps:I

.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final 飘花落叶言子楪哲兰苏世:Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/nio/channels/spi/AbstractSelectableChannel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    const-string v1, "_interestedOps"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Ljava/nio/channels/spi/AbstractSelectableChannel;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Ljava/nio/channels/spi/AbstractSelectableChannel;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    new-instance p1, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;

    .line 20
    .line 21
    iput v0, p0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->_interestedOps:I

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public close()V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iput v2, p0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->_interestedOps:I

    .line 13
    .line 14
    iget-object p0, p0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;

    .line 15
    .line 16
    sget-object v0, Lio/ktor/network/selector/SelectInterest;->Companion:Lio/ktor/network/selector/飘花落叶言子楪苏世兰哲;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lio/ktor/network/selector/SelectInterest;->access$getAllInterests$cp()[Lio/ktor/network/selector/SelectInterest;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    array-length v1, v0

    .line 26
    :goto_0
    if-ge v2, v1, :cond_2

    .line 27
    .line 28
    aget-object v3, v0, v2

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v4, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:[Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    aget-object v3, v4, v3

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-virtual {v3, p0, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 50
    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    new-instance v4, Lio/ktor/network/selector/ClosedChannelCancellationException;

    .line 54
    .line 55
    invoke-direct {v4}, Lio/ktor/network/selector/ClosedChannelCancellationException;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance v5, Lkotlin/Result$Failure;

    .line 59
    .line 60
    invoke-direct {v5, v4}, Lkotlin/Result$Failure;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-interface {v3, v4}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->resumeWith(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    :goto_1
    return-void
.end method

.method public dispose()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->close()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final isClosed()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子世楪兰哲苏()Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子苏世兰楪哲()I
    .locals 0

    .line 1
    iget p0, p0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->_interestedOps:I

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子苏兰楪哲世(Lio/ktor/network/selector/SelectInterest;Z)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lio/ktor/network/selector/SelectInterest;->getFlag()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    :cond_0
    iget v0, p0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->_interestedOps:I

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    or-int v1, v0, p1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    not-int v1, p1

    .line 16
    and-int/2addr v1, v0

    .line 17
    :goto_0
    sget-object v2, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 18
    .line 19
    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    return-void
.end method

.method public 飘花落叶言子苏楪哲兰世()Ljava/nio/channels/SelectableChannel;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Ljava/nio/channels/spi/AbstractSelectableChannel;

    .line 2
    .line 3
    return-object p0
.end method
