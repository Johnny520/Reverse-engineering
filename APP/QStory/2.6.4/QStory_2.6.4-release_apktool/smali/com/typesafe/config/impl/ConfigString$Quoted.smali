.class final Lcom/typesafe/config/impl/ConfigString$Quoted;
.super Lcom/typesafe/config/impl/ConfigString;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/typesafe/config/impl/ConfigString;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Quoted"
.end annotation


# direct methods
.method public constructor <init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/typesafe/config/impl/ConfigString;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
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
.method public newCopy(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/ConfigString$Quoted;
    .locals 1

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/ConfigString$Quoted;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/typesafe/config/impl/ConfigString;->value:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, p1, p0}, Lcom/typesafe/config/impl/ConfigString$Quoted;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic newCopy(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/ConfigString$Quoted;->newCopy(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/ConfigString$Quoted;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic unwrapped()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/typesafe/config/impl/ConfigString;->unwrapped()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
