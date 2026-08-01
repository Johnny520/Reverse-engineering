.class public Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/TokenType;


# direct methods
.method public constructor <init>(Lcom/typesafe/config/impl/TokenType;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/TokenType;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Lcom/typesafe/config/impl/TokenType;Ljava/lang/String;Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;
    .locals 2

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1, p2, p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;-><init>(Lcom/typesafe/config/impl/TokenType;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/TokenType;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/TokenType;

    .line 16
    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/TokenType;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/TokenType;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public 飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
