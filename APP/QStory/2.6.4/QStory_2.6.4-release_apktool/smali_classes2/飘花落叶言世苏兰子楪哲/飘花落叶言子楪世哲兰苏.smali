.class public final L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;
.super Lkotlinx/coroutines/飘花落叶言子苏楪世兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;

.field public static final 飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    sget-object v0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪苏兰世哲;

    .line 9
    .line 10
    sget v1, Lkotlinx/coroutines/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 11
    .line 12
    const/16 v2, 0x40

    .line 13
    .line 14
    if-ge v2, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v2

    .line 18
    :goto_0
    const/16 v2, 0xc

    .line 19
    .line 20
    const-string v3, "kotlinx.coroutines.io.parallelism"

    .line 21
    .line 22
    invoke-static {v1, v2, v3}, Lkotlinx/coroutines/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰哲世(IILjava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏兰哲楪(I)Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Cannot be invoked on Dispatchers.IO"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪哲兰苏世(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰苏世(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏兰世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
