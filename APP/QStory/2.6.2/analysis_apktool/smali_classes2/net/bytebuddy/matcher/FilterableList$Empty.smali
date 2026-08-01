.class public Lnet/bytebuddy/matcher/FilterableList$Empty;
.super Ljava/util/AbstractList;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/matcher/FilterableList;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/matcher/FilterableList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Empty"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "S::",
        "Lnet/bytebuddy/matcher/FilterableList<",
        "TT;TS;>;>",
        "Ljava/util/AbstractList<",
        "TT;>;",
        "Lnet/bytebuddy/matcher/FilterableList<",
        "TT;TS;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-TT;>;)TS;"
        }
    .end annotation

    .line 1
    return-object p0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 2
    .line 3
    const-string v0, "index = "

    .line 4
    .line 5
    invoke-static {p1, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw p0
.end method

.method public getOnly()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "size = 0"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public size()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 29
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/matcher/FilterableList$Empty;->subList(II)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object p0

    return-object p0
.end method

.method public subList(II)Lnet/bytebuddy/matcher/FilterableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)TS;"
        }
    .end annotation

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    if-le p1, p2, :cond_1

    .line 7
    .line 8
    const-string p0, ") > toIndex("

    .line 9
    .line 10
    const-string v0, ")"

    .line 11
    .line 12
    const-string v1, "fromIndex("

    .line 13
    .line 14
    invoke-static {v1, p1, p0, p2, v0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;ILjava/lang/Object;ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_1
    const-string p0, "fromIndex = "

    .line 20
    .line 21
    invoke-static {p1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0
.end method
