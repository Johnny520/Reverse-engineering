.class public final Landroidx/compose/foundation/飘花落叶言子苏哲世楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

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
    iput-object v0, p0, Landroidx/compose/foundation/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    new-instance v0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 13
    .line 14
    invoke-direct {v0}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/compose/foundation/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 18
    .line 19
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/飘花落叶言子苏哲世楪兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Landroidx/compose/foundation/MutatePriority;->Default:Landroidx/compose/foundation/MutatePriority;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/compose/foundation/MutatorMutex$mutate$2;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, v0, p0, p1, v2}, Landroidx/compose/foundation/MutatorMutex$mutate$2;-><init>(Landroidx/compose/foundation/MutatePriority;Landroidx/compose/foundation/飘花落叶言子苏哲世楪兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v1, p2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世苏兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/飘花落叶言子苏哲世楪兰;Landroidx/compose/foundation/飘花落叶言子苏哲楪兰世;)V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/飘花落叶言子苏哲楪兰世;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v1, p1, Landroidx/compose/foundation/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/MutatePriority;

    .line 12
    .line 13
    iget-object v2, v0, Landroidx/compose/foundation/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/MutatePriority;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ltz v1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 23
    .line 24
    const-string p1, "Current mutation had a higher priority"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    :cond_1
    :goto_1
    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget-object p0, v0, Landroidx/compose/foundation/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;

    .line 39
    .line 40
    new-instance p1, Landroidx/compose/foundation/MutationInterruptedException;

    .line 41
    .line 42
    invoke-direct {p1}, Landroidx/compose/foundation/MutationInterruptedException;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-interface {p0, p1}, Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲世苏兰(Ljava/util/concurrent/CancellationException;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void

    .line 49
    :cond_3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eq v1, v0, :cond_1

    .line 54
    .line 55
    goto :goto_0
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Landroidx/compose/foundation/gestures/飘花落叶言子世楪苏哲兰;Landroidx/compose/foundation/MutatePriority;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Landroidx/compose/foundation/MutatorMutex$mutateWith$2;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v2, p0

    .line 5
    move-object v4, p1

    .line 6
    move-object v1, p2

    .line 7
    move-object v3, p3

    .line 8
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/MutatorMutex$mutateWith$2;-><init>(Landroidx/compose/foundation/MutatePriority;Landroidx/compose/foundation/飘花落叶言子苏哲世楪兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p4}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世苏兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
