.class public final Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;
.super Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;ZLjava/util/ArrayList;)V
    .locals 1

    .line 1
    sget-object p2, Lcom/typesafe/config/impl/TokenType;->SUBSTITUTION:Lcom/typesafe/config/impl/TokenType;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p2, p1, v0, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;-><init>(Lcom/typesafe/config/impl/TokenType;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

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

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/TokenType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, 0x29

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x29

    .line 10
    .line 11
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, "\'${"

    .line 35
    .line 36
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, "}\'"

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;

    .line 2
    .line 3
    return p0
.end method
