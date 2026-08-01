.class public final Lcom/google/protobuf/飘花落叶言子楪兰苏哲世;
.super Lcom/google/protobuf/飘花落叶言子楪兰哲苏世;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/ByteString;

.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Lcom/google/protobuf/ByteString;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/ByteString;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏兰世:I

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->size()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    if-ge v0, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()B
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    add-int/lit8 v1, v0, 0x1

    .line 8
    .line 9
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏兰世:I

    .line 10
    .line 11
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/ByteString;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/google/protobuf/ByteString;->internalByteAt(I)B

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method
