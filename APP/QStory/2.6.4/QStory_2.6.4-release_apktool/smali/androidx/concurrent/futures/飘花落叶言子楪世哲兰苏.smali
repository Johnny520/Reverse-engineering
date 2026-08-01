.class public final Landroidx/concurrent/futures/飘花落叶言子楪世哲兰苏;
.super Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public final 飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public final 飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public final 飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public final 飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/concurrent/futures/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/concurrent/futures/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/concurrent/futures/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/concurrent/futures/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/concurrent/futures/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世哲兰楪苏(Landroidx/concurrent/futures/飘花落叶言子楪世兰哲苏;Ljava/lang/Thread;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/concurrent/futures/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子世哲楪兰苏(Landroidx/concurrent/futures/飘花落叶言子楪世兰哲苏;Landroidx/concurrent/futures/飘花落叶言子楪世兰哲苏;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/concurrent/futures/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲(Landroidx/concurrent/futures/飘花落叶言子楪苏世哲兰;Landroidx/concurrent/futures/飘花落叶言子楪世兰哲苏;Landroidx/concurrent/futures/飘花落叶言子楪世兰哲苏;)Z
    .locals 2

    .line 1
    :cond_0
    iget-object v0, p0, Landroidx/concurrent/futures/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eq v0, p2, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Landroidx/concurrent/futures/飘花落叶言子楪苏世哲兰;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    :cond_0
    iget-object v0, p0, Landroidx/concurrent/futures/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eq v0, p2, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Landroidx/concurrent/futures/飘花落叶言子楪苏世哲兰;Landroidx/concurrent/futures/飘花落叶言子楪世哲苏兰;)Z
    .locals 2

    .line 1
    :cond_0
    iget-object v0, p0, Landroidx/concurrent/futures/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    sget-object v1, Landroidx/concurrent/futures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroidx/concurrent/futures/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eq v0, p2, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0
.end method
