.class public final Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;
.super Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;


# direct methods
.method public constructor <init>(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/typesafe/config/impl/TokenType;->VALUE:Lcom/typesafe/config/impl/TokenType;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {p0, v0, v1, p2, v2}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;-><init>(Lcom/typesafe/config/impl/TokenType;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
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
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->hashCode()I

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
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/typesafe/config/impl/ResolveStatus;->RESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 8
    .line 9
    const-string v2, ")"

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "\'"

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;->unwrapped()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, "\' ("

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;->valueType()Lcom/typesafe/config/ConfigValueType;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v1, "\'<unresolved value>\' ("

    .line 54
    .line 55
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p0}, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;->valueType()Lcom/typesafe/config/ConfigValueType;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;

    .line 2
    .line 3
    return p0
.end method
