.class public final Lcom/google/gson/飘花落叶言子楪苏兰世哲;
.super Lcom/google/gson/飘花落叶言子楪苏哲世兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Lcom/google/gson/internal/LinkedTreeMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/gson/internal/LinkedTreeMap;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lcom/google/gson/internal/LinkedTreeMap;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/gson/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Lcom/google/gson/internal/LinkedTreeMap;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eq p1, p0, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lcom/google/gson/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lcom/google/gson/飘花落叶言子楪苏兰世哲;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/google/gson/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Lcom/google/gson/internal/LinkedTreeMap;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/google/gson/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Lcom/google/gson/internal/LinkedTreeMap;

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/gson/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Lcom/google/gson/internal/LinkedTreeMap;

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
