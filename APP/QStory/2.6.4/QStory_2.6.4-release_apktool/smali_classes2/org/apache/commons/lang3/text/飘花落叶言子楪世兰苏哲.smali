.class public final Lorg/apache/commons/lang3/text/飘花落叶言子楪世兰苏哲;
.super Lorg/apache/commons/lang3/text/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪苏世哲兰:[C


# direct methods
.method public constructor <init>([C)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, [C->clone()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, [C

    .line 9
    .line 10
    invoke-static {p1}, Ljava/util/Arrays;->sort([C)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰:[C

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(I[C)I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/lang3/text/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰:[C

    .line 2
    .line 3
    aget-char p1, p2, p1

    .line 4
    .line 5
    invoke-static {p0, p1}, Ljava/util/Arrays;->binarySearch([CC)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-ltz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method
