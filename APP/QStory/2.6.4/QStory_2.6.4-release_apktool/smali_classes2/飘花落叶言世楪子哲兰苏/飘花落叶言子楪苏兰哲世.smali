.class public final L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>(L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏世兰哲;Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏世兰哲;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final isEmpty()Z
    .locals 4

    .line 1
    iget-object v0, p0, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/util/Collection;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;

    .line 33
    .line 34
    invoke-interface {v1}, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object v3, p0, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;

    .line 41
    .line 42
    invoke-virtual {v3, v1}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    :cond_2
    :goto_0
    return v2
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏世兰哲;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;

    .line 24
    .line 25
    invoke-interface {v3}, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    iget-object v4, p0, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;

    .line 32
    .line 33
    invoke-virtual {v4, v3}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public final 飘花落叶言子世哲楪兰苏(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏世兰哲;

    .line 19
    .line 20
    invoke-interface {p0, p1}, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子世哲楪兰苏(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final 飘花落叶言子世哲苏楪兰(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏世兰哲;

    .line 19
    .line 20
    invoke-interface {p0, p1}, L飘花落叶言世楪子哲兰苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子世哲苏楪兰(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)L飘花落叶言世楪子哲兰苏/飘花落叶言子楪世苏兰哲;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method
