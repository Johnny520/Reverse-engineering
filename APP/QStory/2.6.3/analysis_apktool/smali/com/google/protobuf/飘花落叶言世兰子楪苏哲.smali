.class public final Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/ByteString$LeafByteString;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/ByteString;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lcom/google/protobuf/RopeByteString;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lcom/google/protobuf/RopeByteString;

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayDeque;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/protobuf/RopeByteString;->getTreeDepth()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayDeque;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lcom/google/protobuf/RopeByteString;->access$400(Lcom/google/protobuf/RopeByteString;)Lcom/google/protobuf/ByteString;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    instance-of v0, p1, Lcom/google/protobuf/RopeByteString;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    check-cast p1, Lcom/google/protobuf/RopeByteString;

    .line 33
    .line 34
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayDeque;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lcom/google/protobuf/RopeByteString;->access$400(Lcom/google/protobuf/RopeByteString;)Lcom/google/protobuf/ByteString;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    check-cast p1, Lcom/google/protobuf/ByteString$LeafByteString;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/ByteString$LeafByteString;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayDeque;

    .line 51
    .line 52
    check-cast p1, Lcom/google/protobuf/ByteString$LeafByteString;

    .line 53
    .line 54
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/ByteString$LeafByteString;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/ByteString$LeafByteString;

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

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/ByteString$LeafByteString;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final remove()V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/ByteString$LeafByteString;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/ByteString$LeafByteString;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    :cond_0
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayDeque;

    .line 7
    .line 8
    if-eqz v2, :cond_3

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lcom/google/protobuf/RopeByteString;

    .line 22
    .line 23
    invoke-static {v3}, Lcom/google/protobuf/RopeByteString;->access$500(Lcom/google/protobuf/RopeByteString;)Lcom/google/protobuf/ByteString;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    :goto_0
    instance-of v4, v3, Lcom/google/protobuf/RopeByteString;

    .line 28
    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    check-cast v3, Lcom/google/protobuf/RopeByteString;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v3}, Lcom/google/protobuf/RopeByteString;->access$400(Lcom/google/protobuf/RopeByteString;)Lcom/google/protobuf/ByteString;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    check-cast v3, Lcom/google/protobuf/ByteString$LeafByteString;

    .line 42
    .line 43
    invoke-virtual {v3}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    move-object v1, v3

    .line 50
    :cond_3
    :goto_1
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言世兰子楪苏哲;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/ByteString$LeafByteString;

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_4
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 54
    .line 55
    .line 56
    return-object v1
.end method
