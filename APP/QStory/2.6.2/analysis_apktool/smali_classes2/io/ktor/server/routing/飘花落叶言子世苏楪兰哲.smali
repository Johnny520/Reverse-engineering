.class public final Lio/ktor/server/routing/飘花落叶言子世苏楪兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lio/ktor/server/application/飘花落叶言子楪世兰哲苏;


# virtual methods
.method public final getKey()Lio/ktor/util/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    sget-object p0, Lio/ktor/server/routing/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲苏兰楪:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lio/ktor/util/pipeline/飘花落叶言子楪世哲苏兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p0, Lio/ktor/server/routing/飘花落叶言子世苏哲楪兰;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lio/ktor/server/routing/飘花落叶言子世苏哲楪兰;-><init>(Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    new-instance p2, Lio/ktor/server/routing/RoutingRoot$Plugin$install$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p2, p0, v0}, Lio/ktor/server/routing/RoutingRoot$Plugin$install$1;-><init>(Lio/ktor/server/routing/飘花落叶言子世苏哲楪兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lio/ktor/server/application/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲兰苏:Lio/ktor/util/pipeline/飘花落叶言子楪世兰哲苏;

    .line 21
    .line 22
    invoke-virtual {p1, v0, p2}, Lio/ktor/util/pipeline/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(Lio/ktor/util/pipeline/飘花落叶言子楪世兰哲苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method
