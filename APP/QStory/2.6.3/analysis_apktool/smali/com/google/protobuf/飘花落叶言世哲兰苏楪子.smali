.class public final Lcom/google/protobuf/飘花落叶言世哲兰苏楪子;
.super Lcom/google/protobuf/飘花落叶言子楪兰哲苏世;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/飘花落叶言子世楪哲苏兰;

.field public final 飘花落叶言子楪哲苏兰世:Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/RopeByteString;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;-><init>(Lcom/google/protobuf/ByteString;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世哲兰苏楪子;->飘花落叶言子楪哲苏兰世:Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/ByteString$LeafByteString;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->iterator()Lcom/google/protobuf/飘花落叶言子世楪哲苏兰;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_0
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世哲兰苏楪子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/飘花落叶言子世楪哲苏兰;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世哲兰苏楪子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()B
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世哲兰苏楪子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲()B

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世哲兰苏楪子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/飘花落叶言子世楪哲苏兰;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世哲兰苏楪子;->飘花落叶言子楪哲苏兰世:Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/ByteString$LeafByteString;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lcom/google/protobuf/ByteString;->iterator()Lcom/google/protobuf/飘花落叶言子世楪哲苏兰;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v1, 0x0

    .line 35
    :goto_0
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言世哲兰苏楪子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/飘花落叶言子世楪哲苏兰;

    .line 36
    .line 37
    :cond_1
    return v0

    .line 38
    :cond_2
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return p0
.end method
