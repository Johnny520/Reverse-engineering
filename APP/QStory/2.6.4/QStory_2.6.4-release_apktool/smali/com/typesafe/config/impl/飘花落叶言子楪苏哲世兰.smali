.class public abstract Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "hardcoded value"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/typesafe/config/impl/ConfigBoolean;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, v0, v2}, Lcom/typesafe/config/impl/ConfigBoolean;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Z)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lcom/typesafe/config/impl/ConfigBoolean;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, v0, v2}, Lcom/typesafe/config/impl/ConfigBoolean;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Z)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Lcom/typesafe/config/impl/ConfigNull;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lcom/typesafe/config/impl/ConfigNull;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lcom/typesafe/config/impl/SimpleConfigList;

    .line 25
    .line 26
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 27
    .line 28
    invoke-direct {v1, v0, v2}, Lcom/typesafe/config/impl/SimpleConfigList;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/typesafe/config/impl/SimpleConfigObject;->empty(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static 飘花落叶言子楪世哲兰苏()Z
    .locals 3

    .line 1
    :try_start_0
    sget-boolean v0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Z
    :try_end_0
    .catch Ljava/lang/ExceptionInInitializerError; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    return v0

    .line 4
    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    instance-of v2, v1, Lcom/typesafe/config/ConfigException;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    check-cast v1, Lcom/typesafe/config/ConfigException;

    .line 16
    .line 17
    throw v1

    .line 18
    :cond_0
    throw v0
.end method

.method public static 飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(ILjava/lang/String;)V
    .locals 2

    .line 1
    :goto_0
    if-lez p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 4
    .line 5
    const-string v1, "  "

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    add-int/lit8 p0, p0, -0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;Lcom/typesafe/config/ConfigException$NotResolved;)Lcom/typesafe/config/ConfigException$NotResolved;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, " has not been resolved, you need to call Config#resolve(), see API docs for Config#resolve()"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance v0, Lcom/typesafe/config/ConfigException$NotResolved;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/typesafe/config/ConfigException$NotResolved;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method
