.class public final Lio/ktor/util/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Map;
.implements L飘花落叶言世子哲苏楪兰/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Lio/ktor/util/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lio/ktor/util/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    iget-object p0, p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->containsValue(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 4

    .line 1
    new-instance v0, Lio/ktor/util/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    iget-object p0, p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v1, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 10
    .line 11
    const/16 v2, 0x1b

    .line 12
    .line 13
    invoke-direct {v1, v2}, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;-><init>(I)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 17
    .line 18
    const/16 v3, 0x1c

    .line 19
    .line 20
    invoke-direct {v2, v3}, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p0, v1, v2}, Lio/ktor/util/飘花落叶言子楪苏哲兰世;-><init>(Ljava/util/Set;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lio/ktor/util/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    check-cast p1, Lio/ktor/util/飘花落叶言子楪世哲兰苏;

    .line 9
    .line 10
    iget-object p1, p1, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    iget-object p0, p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-static {p1, p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Lio/ktor/util/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lio/ktor/util/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

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

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 4

    .line 1
    new-instance v0, Lio/ktor/util/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    iget-object p0, p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v1, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 10
    .line 11
    const/16 v2, 0x1d

    .line 12
    .line 13
    invoke-direct {v1, v2}, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;-><init>(I)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v2, v3}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p0, v1, v2}, Lio/ktor/util/飘花落叶言子楪苏哲兰世;-><init>(Ljava/util/Set;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lio/ktor/util/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lio/ktor/util/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-interface {p0, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/util/Map$Entry;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v2, Lio/ktor/util/飘花落叶言子楪世兰苏哲;

    .line 41
    .line 42
    invoke-direct {v2, v1}, Lio/ktor/util/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Lio/ktor/util/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lio/ktor/util/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-interface {p0, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final values()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
