.class public final L飘花落叶言苏子兰世哲楪/飘花落叶言子楪苏世哲兰;
.super L飘花落叶言苏子兰世哲楪/飘花落叶言子楪世哲苏兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:I

.field public final 飘花落叶言子楪世苏兰哲:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, L飘花落叶言苏子兰世哲楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 5
    .line 6
    iput p2, p0, L飘花落叶言苏子兰世哲楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(ILjava/io/StringWriter;)Z
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言苏子兰世哲楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    if-lt p1, v0, :cond_1

    .line 4
    .line 5
    iget p0, p0, L飘花落叶言苏子兰世哲楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 6
    .line 7
    if-le p1, p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string p0, "&#"

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/16 p0, 0xa

    .line 16
    .line 17
    invoke-static {p1, p0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p2, p0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/16 p0, 0x3b

    .line 25
    .line 26
    invoke-virtual {p2, p0}, Ljava/io/Writer;->write(I)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method
