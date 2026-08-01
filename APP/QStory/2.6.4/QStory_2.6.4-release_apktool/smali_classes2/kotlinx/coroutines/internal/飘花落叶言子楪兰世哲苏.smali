.class public final Lkotlinx/coroutines/internal/飘花落叶言子楪兰世哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子哲世楪兰苏;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

.field public final 飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/internal/飘花落叶言子楪兰苏世哲;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    new-instance p1, Lkotlinx/coroutines/internal/飘花落叶言子楪兰苏世哲;

    .line 9
    .line 10
    invoke-direct {p1, p2}, Lkotlinx/coroutines/internal/飘花落叶言子楪兰苏世哲;-><init>(Ljava/lang/ThreadLocal;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/internal/飘花落叶言子楪兰苏世哲;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/internal/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/internal/飘花落叶言子楪兰苏世哲;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final getKey()Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/internal/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final minusKey(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/internal/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/internal/飘花落叶言子楪兰苏世哲;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public final plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    invoke-static {p1, p0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ThreadLocal(value="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", threadLocal = "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 p0, 0x29

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言子哲楪苏世兰(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子苏哲世楪兰()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object p0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v1
.end method
