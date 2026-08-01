.class public final Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/Map$Entry;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/Map$Entry;


# direct methods
.method public constructor <init>(Ljava/util/Map$Entry;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲苏兰世:Ljava/util/Map$Entry;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getKey()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲苏兰世:Ljava/util/Map$Entry;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲苏兰世:Ljava/util/Map$Entry;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/飘花落叶言世子哲楪兰苏;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世子哲楪兰苏;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲苏兰世:Ljava/util/Map$Entry;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/google/protobuf/飘花落叶言世子哲楪兰苏;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言世子哲楪兰苏;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 14
    .line 15
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲苏兰世:Ljava/util/Map$Entry;

    .line 16
    .line 17
    new-instance v1, Lcom/google/protobuf/飘花落叶言世子哲楪兰苏;

    .line 18
    .line 19
    check-cast p1, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 20
    .line 21
    invoke-direct {v1, p1}, Lcom/google/protobuf/飘花落叶言世子哲楪兰苏;-><init>(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0, v1}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    const-string p0, "Lazy field only supports MessageLite values."

    .line 29
    .line 30
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method
