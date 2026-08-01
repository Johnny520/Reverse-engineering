.class public final Lkotlinx/coroutines/flow/飘花落叶言子兰世苏哲楪;
.super Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世哲苏兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世苏哲兰;)[Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 2
    .line 3
    iget-object p0, p0, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 10
    .line 11
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世苏哲兰;)Z
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 2
    .line 3
    iget-object p0, p0, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_0
    sget-object p1, Lkotlinx/coroutines/flow/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0
.end method
