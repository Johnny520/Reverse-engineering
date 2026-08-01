.class public final Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰世哲;
.super Lcom/alibaba/fastjson2/schema/JSONSchema;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# virtual methods
.method public final 飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 7
    .line 8
    sget-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Null:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "expect type %s, but %s"

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {p0, v0, p1, v1}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲兰世()Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Null:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 2
    .line 3
    return-object p0
.end method
