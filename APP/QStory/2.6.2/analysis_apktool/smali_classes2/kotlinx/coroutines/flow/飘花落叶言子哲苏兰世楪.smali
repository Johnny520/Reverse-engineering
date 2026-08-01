.class public final Lkotlinx/coroutines/flow/飘花落叶言子哲苏兰世楪;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子兰世楪哲苏;
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;
.implements Lkotlinx/coroutines/flow/internal/飘花落叶言子楪哲苏世兰;


# instance fields
.field private final job:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/flow/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 5
    .line 6
    iput-object p2, p0, Lkotlinx/coroutines/flow/飘花落叶言子哲苏兰世楪;->job:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/flow/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;
    .locals 1

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-ge p2, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, -0x2

    .line 8
    if-ne p2, v0, :cond_1

    .line 9
    .line 10
    :goto_0
    sget-object v0, Lkotlinx/coroutines/channels/BufferOverflow;->DROP_OLDEST:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 11
    .line 12
    if-ne p3, v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    if-eqz p2, :cond_2

    .line 16
    .line 17
    const/4 v0, -0x3

    .line 18
    if-ne p2, v0, :cond_3

    .line 19
    .line 20
    :cond_2
    sget-object v0, Lkotlinx/coroutines/channels/BufferOverflow;->SUSPEND:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 21
    .line 22
    if-ne p3, v0, :cond_3

    .line 23
    .line 24
    :goto_1
    return-object p0

    .line 25
    :cond_3
    new-instance v0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏世哲兰;

    .line 26
    .line 27
    invoke-direct {v0, p0, p1, p2, p3}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世兰哲苏;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ILkotlinx/coroutines/channels/BufferOverflow;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/flow/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
