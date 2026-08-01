.class public final Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;
.super Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子世楪苏兰哲:Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p2}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;->飘花落叶言子世楪苏兰哲:Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世楪哲苏兰()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "AwaitContinuation"

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏兰世(Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;)Ljava/lang/Throwable;
    .locals 1

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;->飘花落叶言子世楪苏兰哲:Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子苏世楪哲兰()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Lkotlinx/coroutines/飘花落叶言子苏哲楪世兰;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p0

    .line 12
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子苏哲楪世兰;

    .line 13
    .line 14
    invoke-virtual {v0}, Lkotlinx/coroutines/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    instance-of v0, p0, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 26
    .line 27
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Throwable;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    invoke-virtual {p1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪兰哲苏世()Ljava/util/concurrent/CancellationException;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
