.class public final Lio/ktor/server/engine/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子世楪苏哲兰;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;


# direct methods
.method public constructor <init>(L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-direct {v0, p1, v1}, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lio/ktor/server/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getKey()Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;
    .locals 0

    .line 1
    sget-object p0, Lkotlinx/coroutines/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    return-object p0
.end method

.method public final handleException(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of v0, p2, Ljava/util/concurrent/CancellationException;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    instance-of v0, p2, Ljava/io/IOException;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;

    .line 18
    .line 19
    invoke-interface {p1, v0}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_2
    iget-object p0, p0, Lio/ktor/server/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 32
    .line 33
    iget-object p0, p0, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 36
    .line 37
    new-instance p1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v1, "Unhandled exception caught for "

    .line 40
    .line 41
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p0, p1, p2}, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final minusKey(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪兰苏哲(Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    invoke-static {p1, p0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏哲楪兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
