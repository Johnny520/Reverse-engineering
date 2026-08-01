.class public final Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;
.super Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Z

.field public final 飘花落叶言子楪世兰苏哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/String;

.field public final 飘花落叶言子楪苏世哲兰:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/typesafe/config/impl/TokenType;->PROBLEM:Lcom/typesafe/config/impl/TokenType;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, p1, v1, v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;-><init>(Lcom/typesafe/config/impl/TokenType;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p4, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏:Z

    .line 12
    .line 13
    iput-object p5, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰:Ljava/lang/Throwable;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

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
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;

    .line 8
    .line 9
    iget-object v0, p1, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p1, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-boolean v0, p1, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏:Z

    .line 30
    .line 31
    iget-boolean v1, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏:Z

    .line 32
    .line 33
    if-ne v0, v1, :cond_0

    .line 34
    .line 35
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰:Ljava/lang/Throwable;

    .line 36
    .line 37
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰:Ljava/lang/Throwable;

    .line 38
    .line 39
    invoke-static {p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_0
    const/4 p0, 0x0

    .line 48
    return p0
.end method

.method public final hashCode()I
    .locals 3

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
    const/16 v1, 0x29

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    mul-int/2addr v0, v1

    .line 11
    iget-object v2, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v2, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-boolean v2, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏:Z

    .line 24
    .line 25
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    add-int/2addr v2, v0

    .line 34
    mul-int/2addr v2, v1

    .line 35
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰:Ljava/lang/Throwable;

    .line 36
    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    add-int/2addr p0, v2

    .line 44
    mul-int/2addr p0, v1

    .line 45
    return p0

    .line 46
    :cond_0
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\' ("

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 19
    .line 20
    const-string v1, ")"

    .line 21
    .line 22
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lcom/typesafe/config/impl/飘花落叶言子世哲苏兰楪;

    .line 2
    .line 3
    return p0
.end method
