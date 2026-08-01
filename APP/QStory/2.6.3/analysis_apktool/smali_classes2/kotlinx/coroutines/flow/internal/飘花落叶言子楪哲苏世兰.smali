.class public interface abstract Lkotlinx/coroutines/flow/internal/飘花落叶言子楪哲苏世兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;


# direct methods
.method public static synthetic 飘花落叶言子楪世苏兰哲(Lkotlinx/coroutines/flow/internal/飘花落叶言子楪哲苏世兰;L飘花落叶言世苏哲子楪兰/飘花落叶言子楪世哲兰苏;ILkotlinx/coroutines/channels/BufferOverflow;I)Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;
    .locals 1

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 v0, p4, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 p2, -0x3

    .line 12
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 13
    .line 14
    if-eqz p4, :cond_2

    .line 15
    .line 16
    sget-object p3, Lkotlinx/coroutines/channels/BufferOverflow;->SUSPEND:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 17
    .line 18
    :cond_2
    invoke-interface {p0, p1, p2, p3}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method


# virtual methods
.method public abstract 飘花落叶言子楪世兰苏哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;
.end method
