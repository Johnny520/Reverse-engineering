.class public final Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世苏楪哲兰;
.super Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:L飘花落叶言世苏子兰楪哲/飘花落叶言子楪哲世兰苏;

.field public final 飘花落叶言子楪兰世苏哲:Z

.field public final 飘花落叶言子楪兰苏世哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

.field public final 飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲兰苏楪;

.field public final 飘花落叶言子楪哲兰苏世:Ljava/util/List;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲兰苏楪;Ljava/util/List;ZL飘花落叶言世苏子兰楪哲/飘花落叶言子楪哲世兰苏;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲兰苏楪;

    .line 14
    .line 15
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ljava/util/List;

    .line 16
    .line 17
    iput-boolean p3, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 18
    .line 19
    iput-object p4, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪兰世哲苏:L飘花落叶言世苏子兰楪哲/飘花落叶言子楪哲世兰苏;

    .line 20
    .line 21
    iput-object p5, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 22
    .line 23
    instance-of p0, p4, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;

    .line 24
    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    instance-of p0, p4, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪苏哲兰世;

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    new-instance p2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string p3, "SimpleTypeImpl should not be created for error type: "

    .line 37
    .line 38
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const/16 p3, 0xa

    .line 45
    .line 46
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世兰苏楪哲(Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏世哲兰;)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子苏楪兰哲世;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    invoke-interface {v0, p1}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    return-object p1
.end method

.method public final 飘花落叶言子世楪哲兰苏()Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲兰苏楪;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲兰苏楪;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子世楪苏兰哲()Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;
    .locals 0

    .line 1
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;

    .line 7
    .line 8
    return-object p0
.end method

.method public final 飘花落叶言子世苏哲楪兰()L飘花落叶言世苏子兰楪哲/飘花落叶言子楪哲世兰苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪兰世哲苏:L飘花落叶言世苏子兰楪哲/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子世苏楪兰哲(Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏世哲兰;)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏兰哲;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    invoke-interface {v0, p1}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    return-object p1
.end method

.method public final 飘花落叶言子世苏楪哲兰()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪兰哲世苏()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子苏世兰哲楪(Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世苏楪兰哲;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世苏楪兰哲;-><init>(Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final 飘花落叶言子苏世兰楪哲(Z)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰苏哲;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, v0}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰苏哲;-><init>(Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_1
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰苏哲;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, v0}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰苏哲;-><init>(Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;I)V

    .line 19
    .line 20
    .line 21
    return-object p1
.end method
