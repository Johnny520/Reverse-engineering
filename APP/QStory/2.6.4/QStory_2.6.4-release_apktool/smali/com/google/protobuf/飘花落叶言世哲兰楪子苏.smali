.class public final Lcom/google/protobuf/飘花落叶言世哲兰楪子苏;
.super Ljava/util/AbstractList;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世哲兰楪子苏;->飘花落叶言子楪哲苏兰世:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世哲兰楪子苏;->飘花落叶言子楪哲苏兰世:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪哲世苏兰(IZ)Lcom/google/protobuf/GeneratedMessage;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世哲兰楪子苏;->飘花落叶言子楪哲苏兰世:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 1

    .line 1
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 6
    .line 7
    return-void
.end method
