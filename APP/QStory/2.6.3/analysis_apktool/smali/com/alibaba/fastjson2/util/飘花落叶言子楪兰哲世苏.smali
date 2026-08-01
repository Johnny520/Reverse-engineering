.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰哲世苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;


# virtual methods
.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    check-cast p2, Ljava/sql/Clob;

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p2}, Ljava/sql/Clob;->getCharacterStream()Ljava/io/Reader;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_1

    .line 7
    iget-char p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世苏兰哲(C)V

    .line 10
    .line 11
    .line 12
    const/16 p3, 0x800

    .line 13
    .line 14
    :try_start_1
    new-array p4, p3, [C

    .line 15
    .line 16
    :cond_0
    :goto_0
    const/4 p5, 0x0

    .line 17
    invoke-virtual {p0, p4, p5, p3}, Ljava/io/Reader;->read([CII)I

    .line 18
    .line 19
    .line 20
    move-result p5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 21
    if-gez p5, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世苏兰哲(C)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    if-lez p5, :cond_0

    .line 28
    .line 29
    :try_start_2
    invoke-virtual {p1, p5, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子兰苏世哲(I[C)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception p0

    .line 34
    const-string p1, "read string from reader error"

    .line 35
    .line 36
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_1
    move-exception p0

    .line 41
    const-string p1, "Clob.getCharacterStream error"

    .line 42
    .line 43
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
