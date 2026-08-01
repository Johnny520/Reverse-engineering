.class public abstract Lkotlinx/coroutines/飘花落叶言子楪世苏哲兰;
.super Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
.implements Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p3}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;-><init>(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    sget-object p2, Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;

    .line 7
    .line 8
    invoke-interface {p1, p2}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 13
    .line 14
    invoke-virtual {p0, p2}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子苏世哲兰楪(Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-interface {p1, p0}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lkotlinx/coroutines/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, v0, v1}, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/Throwable;Z)V

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子苏哲楪兰世(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪哲兰(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final 飘花落叶言子世哲楪兰苏()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, " was cancelled"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final 飘花落叶言子世哲苏兰楪()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public 飘花落叶言子哲世楪兰苏(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public 飘花落叶言子哲世楪苏兰(Ljava/lang/Throwable;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子苏世哲楪兰(Lkotlinx/coroutines/CompletionHandlerException;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子苏兰楪世哲(Ljava/lang/Object;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 6
    .line 7
    iget-object v0, p1, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Throwable;

    .line 8
    .line 9
    sget-object v1, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v1, 0x1

    .line 16
    if-ne p1, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    invoke-virtual {p0, v0, v1}, Lkotlinx/coroutines/飘花落叶言子楪世苏哲兰;->飘花落叶言子哲世楪苏兰(Ljava/lang/Throwable;Z)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/飘花落叶言子楪世苏哲兰;->飘花落叶言子哲世楪兰苏(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
