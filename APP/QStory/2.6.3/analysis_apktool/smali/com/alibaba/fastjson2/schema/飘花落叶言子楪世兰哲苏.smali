.class public final Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰哲苏;
.super Lcom/alibaba/fastjson2/schema/JSONSchema;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# virtual methods
.method public final 飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰哲苏:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 14
    .line 15
    sget-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Boolean:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "expect type %s, but %s"

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {p0, v0, p1, v1}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 29
    .line 30
    .line 31
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏兰世()Lcom/alibaba/fastjson2/JSONObject;
    .locals 1

    .line 1
    const-string p0, "type"

    .line 2
    .line 3
    const-string v0, "boolean"

    .line 4
    .line 5
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/JSONObject;->of(Ljava/lang/String;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONObject;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲兰世()Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Boolean:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 2
    .line 3
    return-object p0
.end method
