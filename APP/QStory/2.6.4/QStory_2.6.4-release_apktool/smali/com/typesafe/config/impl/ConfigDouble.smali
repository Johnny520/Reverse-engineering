.class final Lcom/typesafe/config/impl/ConfigDouble;
.super Lcom/typesafe/config/impl/ConfigNumber;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x2L


# instance fields
.field private final value:D


# direct methods
.method public constructor <init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;DLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p4}, Lcom/typesafe/config/impl/ConfigNumber;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-wide p2, p0, Lcom/typesafe/config/impl/ConfigDouble;->value:D

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
.method public doubleValue()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/typesafe/config/impl/ConfigDouble;->value:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public longValue()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/typesafe/config/impl/ConfigDouble;->value:D

    .line 2
    .line 3
    double-to-long v0, v0

    .line 4
    return-wide v0
.end method

.method public newCopy(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/ConfigDouble;
    .locals 3

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/ConfigDouble;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/typesafe/config/impl/ConfigDouble;->value:D

    .line 4
    .line 5
    iget-object p0, p0, Lcom/typesafe/config/impl/ConfigNumber;->originalText:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v0, p1, v1, v2, p0}, Lcom/typesafe/config/impl/ConfigDouble;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;DLjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic newCopy(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 11
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/ConfigDouble;->newCopy(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/ConfigDouble;

    move-result-object p0

    return-object p0
.end method

.method public transformToString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/typesafe/config/impl/ConfigNumber;->transformToString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Lcom/typesafe/config/impl/ConfigDouble;->value:D

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    return-object v0
.end method

.method public unwrapped()Ljava/lang/Double;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/typesafe/config/impl/ConfigDouble;->value:D

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public bridge synthetic unwrapped()Ljava/lang/Number;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lcom/typesafe/config/impl/ConfigDouble;->unwrapped()Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic unwrapped()Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0}, Lcom/typesafe/config/impl/ConfigDouble;->unwrapped()Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public valueType()Lcom/typesafe/config/ConfigValueType;
    .locals 0

    .line 1
    sget-object p0, Lcom/typesafe/config/ConfigValueType;->NUMBER:Lcom/typesafe/config/ConfigValueType;

    .line 2
    .line 3
    return-object p0
.end method
