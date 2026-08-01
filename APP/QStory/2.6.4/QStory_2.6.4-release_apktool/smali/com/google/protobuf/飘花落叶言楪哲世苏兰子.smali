.class public final Lcom/google/protobuf/飘花落叶言楪哲世苏兰子;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰世哲苏()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪哲世苏兰子;->飘花落叶言子楪哲苏兰世:Ljava/util/Iterator;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪哲世苏兰子;->飘花落叶言子楪哲苏兰世:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪哲世苏兰子;->飘花落叶言子楪哲苏兰世:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/Map$Entry;

    .line 8
    .line 9
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪哲世苏子兰;

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, p0}, Lcom/google/protobuf/飘花落叶言楪哲世苏子兰;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
