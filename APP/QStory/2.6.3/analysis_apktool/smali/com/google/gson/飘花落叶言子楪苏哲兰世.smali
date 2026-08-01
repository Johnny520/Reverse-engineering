.class public abstract Lcom/google/gson/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    invoke-direct {v1, v0}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏兰哲;-><init>(Ljava/io/Writer;)V

    .line 9
    .line 10
    .line 11
    sget-object v2, Lcom/google/gson/Strictness;->LENIENT:Lcom/google/gson/Strictness;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏(Lcom/google/gson/Strictness;)V

    .line 14
    .line 15
    .line 16
    sget-object v2, L飘花落叶言楪哲子苏世兰/飘花落叶言子苏世哲兰楪;->飘花落叶言子世楪苏兰哲:L飘花落叶言楪哲子苏世兰/飘花落叶言子楪哲世兰苏;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {v1, p0}, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏(L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏兰哲;Lcom/google/gson/飘花落叶言子楪苏哲兰世;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    return-object p0

    .line 29
    :catch_0
    move-exception p0

    .line 30
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method
