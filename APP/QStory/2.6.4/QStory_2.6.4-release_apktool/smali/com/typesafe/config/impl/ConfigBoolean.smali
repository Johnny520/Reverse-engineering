.class final Lcom/typesafe/config/impl/ConfigBoolean;
.super Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x2L


# instance fields
.field private final value:Z


# direct methods
.method public constructor <init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lcom/typesafe/config/impl/ConfigBoolean;->value:Z

    .line 5
    .line 6
    return-void
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/SerializedConfigValue;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/typesafe/config/impl/SerializedConfigValue;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public newCopy(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/ConfigBoolean;
    .locals 1

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/ConfigBoolean;

    .line 2
    .line 3
    iget-boolean p0, p0, Lcom/typesafe/config/impl/ConfigBoolean;->value:Z

    .line 4
    .line 5
    invoke-direct {v0, p1, p0}, Lcom/typesafe/config/impl/ConfigBoolean;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Z)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic newCopy(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/ConfigBoolean;->newCopy(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/ConfigBoolean;

    move-result-object p0

    return-object p0
.end method

.method public transformToString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/typesafe/config/impl/ConfigBoolean;->value:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const-string p0, "true"

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "false"

    .line 9
    .line 10
    return-object p0
.end method

.method public unwrapped()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/typesafe/config/impl/ConfigBoolean;->value:Z

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public bridge synthetic unwrapped()Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0}, Lcom/typesafe/config/impl/ConfigBoolean;->unwrapped()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public valueType()Lcom/typesafe/config/ConfigValueType;
    .locals 0

    .line 1
    sget-object p0, Lcom/typesafe/config/ConfigValueType;->BOOLEAN:Lcom/typesafe/config/ConfigValueType;

    .line 2
    .line 3
    return-object p0
.end method
