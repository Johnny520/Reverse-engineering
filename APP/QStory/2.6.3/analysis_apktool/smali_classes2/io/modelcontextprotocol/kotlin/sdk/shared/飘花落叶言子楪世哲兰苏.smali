.class public final synthetic Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏兰世楪;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Exception;

    .line 4
    .line 5
    iget-object p0, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p2}, Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/Throwable;)Z

    .line 10
    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-object p2, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪兰苏世;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p2, 0x0

    .line 19
    :goto_0
    if-eqz p2, :cond_2

    .line 20
    .line 21
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    iget-object p1, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪兰苏世;

    .line 24
    .line 25
    invoke-virtual {p1}, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪兰苏世;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p2}, Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/Throwable;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object p1, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子苏哲楪世兰(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/Throwable;)Z

    .line 50
    .line 51
    .line 52
    :goto_1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 53
    .line 54
    return-object p0
.end method
