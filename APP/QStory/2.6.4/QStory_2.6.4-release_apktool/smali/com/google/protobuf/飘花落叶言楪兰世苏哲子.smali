.class public final Lcom/google/protobuf/飘花落叶言楪兰世苏哲子;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageLite$飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Lcom/google/protobuf/GeneratedMessageLite$飘花落叶言子楪世苏哲兰;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰世哲苏()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/util/Map$Entry;

    .line 21
    .line 22
    :cond_0
    return-void
.end method
