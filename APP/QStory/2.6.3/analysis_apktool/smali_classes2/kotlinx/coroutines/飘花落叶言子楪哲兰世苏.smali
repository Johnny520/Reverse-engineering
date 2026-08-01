.class public final Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;
.super Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子苏世哲兰楪(Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子哲世楪苏兰(Ljava/lang/Throwable;)Z
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/Throwable;Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子苏哲楪世兰(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final 飘花落叶言子楪哲世苏兰()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子苏世楪哲兰()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lkotlinx/coroutines/飘花落叶言子苏楪哲世兰;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p0, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏兰哲楪(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 19
    .line 20
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Throwable;

    .line 21
    .line 22
    throw p0

    .line 23
    :cond_1
    const-string p0, "This job has not completed yet"

    .line 24
    .line 25
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method
