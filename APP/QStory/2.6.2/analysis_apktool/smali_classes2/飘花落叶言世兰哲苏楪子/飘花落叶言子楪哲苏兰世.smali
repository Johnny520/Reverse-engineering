.class public final L飘花落叶言世兰哲苏楪子/飘花落叶言子楪哲苏兰世;
.super Lkotlin/collections/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:[I

.field public final 飘花落叶言子楪哲苏兰世:[Lokio/ByteString;


# direct methods
.method public constructor <init>([Lokio/ByteString;[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:[Lokio/ByteString;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:[I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lokio/ByteString;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lokio/ByteString;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:[Lokio/ByteString;

    .line 2
    .line 3
    aget-object p0, p0, p1

    .line 4
    .line 5
    return-object p0
.end method

.method public final getSize()I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:[Lokio/ByteString;

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lokio/ByteString;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lokio/ByteString;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lkotlin/collections/飘花落叶言子楪世兰哲苏;->indexOf(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lokio/ByteString;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lokio/ByteString;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lkotlin/collections/飘花落叶言子楪世兰哲苏;->lastIndexOf(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
