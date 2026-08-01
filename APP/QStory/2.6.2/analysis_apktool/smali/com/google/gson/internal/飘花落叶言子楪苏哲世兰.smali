.class public final Lcom/google/gson/internal/飘花落叶言子楪苏哲世兰;
.super Ljava/util/AbstractSet;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Lcom/google/gson/internal/LinkedTreeMap;


# direct methods
.method public constructor <init>(Lcom/google/gson/internal/LinkedTreeMap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/gson/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/google/gson/internal/LinkedTreeMap;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/gson/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/google/gson/internal/LinkedTreeMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/gson/internal/LinkedTreeMap;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/gson/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/google/gson/internal/LinkedTreeMap;

    .line 6
    .line 7
    check-cast p1, Ljava/util/Map$Entry;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->findByEntry(Ljava/util/Map$Entry;)Lcom/google/gson/internal/飘花落叶言子楪苏兰世哲;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/gson/internal/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/gson/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/google/gson/internal/LinkedTreeMap;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, v1}, Lcom/google/gson/internal/飘花落叶言子楪苏世兰哲;-><init>(Lcom/google/gson/internal/LinkedTreeMap;I)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 7
    .line 8
    iget-object p0, p0, Lcom/google/gson/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/google/gson/internal/LinkedTreeMap;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->findByEntry(Ljava/util/Map$Entry;)Lcom/google/gson/internal/飘花落叶言子楪苏兰世哲;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p0, p1, v0}, Lcom/google/gson/internal/LinkedTreeMap;->removeInternal(Lcom/google/gson/internal/飘花落叶言子楪苏兰世哲;Z)V

    .line 20
    .line 21
    .line 22
    return v0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/gson/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/google/gson/internal/LinkedTreeMap;

    .line 2
    .line 3
    iget p0, p0, Lcom/google/gson/internal/LinkedTreeMap;->size:I

    .line 4
    .line 5
    return p0
.end method
