.class public final Lcom/google/protobuf/飘花落叶言楪世苏哲兰子;
.super Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪世苏兰哲子;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/飘花落叶言楪世苏兰哲子;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪世苏哲兰子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪世苏兰哲子;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪世苏哲兰子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪世苏兰哲子;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言楪世苏兰哲子;->access$200(Lcom/google/protobuf/飘花落叶言楪世苏兰哲子;)Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言楪世苏兰哲子;->newBuilder(Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;)Lcom/google/protobuf/飘花落叶言楪世苏兰哲子$飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪世苏兰哲子$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/飘花落叶言楪世苏兰哲子;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :catch_0
    move-exception p1

    .line 20
    new-instance p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 21
    .line 22
    invoke-direct {p2, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪世苏兰哲子$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/飘花落叶言楪世苏兰哲子;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p2, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    throw p0

    .line 34
    :catch_1
    move-exception p1

    .line 35
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪世苏兰哲子$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/飘花落叶言楪世苏兰哲子;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    throw p0
.end method
