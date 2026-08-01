.class public final L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏哲楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪兰苏哲;
.implements Lio/ktor/util/飘花落叶言子楪哲世兰苏;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/List;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lio/ktor/util/飘花落叶言子楪哲世兰苏;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lio/ktor/util/飘花落叶言子楪哲世兰苏;

    .line 11
    .line 12
    invoke-interface {p1}, Lio/ktor/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_2
    invoke-virtual {p0}, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p1}, Lio/ktor/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲()Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    mul-int/lit16 v0, v0, 0x3c1

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    add-int/2addr p0, v0

    .line 17
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final names()Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏(Ljava/lang/Object;)Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Parameters "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪世兰苏哲()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance v0, Landroidx/collection/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/collection/飘花落叶言子楪兰哲世苏;-><init>(L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏哲楪兰;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏(Ljava/lang/Object;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世兰哲(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p1, v0, p0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲世兰(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string p1, "sessionId"

    .line 2
    .line 3
    iget-object v0, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲楪苏世兰(Ljava/util/List;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/String;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method
