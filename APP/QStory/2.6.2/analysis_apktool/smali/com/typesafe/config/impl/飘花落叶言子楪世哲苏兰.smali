.class public abstract Lcom/typesafe/config/impl/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/typesafe/config/impl/飘花落叶言子楪世苏兰哲;


# virtual methods
.method public abstract 飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
.end method

.method public final 飘花落叶言子楪哲世苏兰(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    new-instance p1, Lcom/typesafe/config/ConfigException$BugOrBroken;

    .line 8
    .line 9
    const-string p2, "Unexpected exception"

    .line 10
    .line 11
    invoke-direct {p1, p2, p0}, Lcom/typesafe/config/ConfigException$BugOrBroken;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    throw p1

    .line 15
    :catch_1
    move-exception p0

    .line 16
    throw p0
.end method
