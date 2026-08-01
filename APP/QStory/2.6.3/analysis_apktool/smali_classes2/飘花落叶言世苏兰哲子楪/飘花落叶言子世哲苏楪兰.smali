.class public abstract L飘花落叶言世苏兰哲子楪/飘花落叶言子世哲苏楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;


# direct methods
.method public constructor <init>(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, L飘花落叶言世苏兰哲子楪/飘花落叶言子世哲苏楪兰;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, L飘花落叶言世苏兰哲子楪/飘花落叶言子世哲苏楪兰;

    .line 10
    .line 11
    iget-object v0, p1, L飘花落叶言世苏兰哲子楪/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 12
    .line 13
    iget-object v1, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-interface {p0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p1}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    :goto_0
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public final getKind()L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    invoke-interface {p0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

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
    invoke-interface {p0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x28

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 p0, 0x29

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪哲兰世(Ljava/lang/String;)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :cond_0
    const-string p0, " is not a valid list index"

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final 飘花落叶言子楪苏世兰哲(I)L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string v0, "Illegal index "

    .line 7
    .line 8
    const-string v1, ", "

    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, " expects only non-negative indices"

    .line 19
    .line 20
    invoke-static {p1, p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(I)Ljava/util/List;
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string v0, "Illegal index "

    .line 7
    .line 8
    const-string v1, ", "

    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, " expects only non-negative indices"

    .line 19
    .line 20
    invoke-static {p1, p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲世兰(I)Z
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    const-string v0, "Illegal index "

    .line 6
    .line 7
    const-string v1, ", "

    .line 8
    .line 9
    invoke-static {p1, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, " expects only non-negative indices"

    .line 18
    .line 19
    invoke-static {p1, p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0
.end method
