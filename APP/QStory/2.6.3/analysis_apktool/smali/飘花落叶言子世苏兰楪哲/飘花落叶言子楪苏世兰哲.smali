.class public final L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏世兰哲;
.super Lkotlin/collections/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;


# direct methods
.method public constructor <init>(L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
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

.method public final clear()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-virtual {p0}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->containsValue(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 6

    .line 1
    new-instance v0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    new-array v2, v1, [L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    if-ge v3, v1, :cond_0

    .line 9
    .line 10
    new-instance v4, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪哲世苏兰;

    .line 11
    .line 12
    const/4 v5, 0x2

    .line 13
    invoke-direct {v4, v5}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪哲世苏兰;-><init>(I)V

    .line 14
    .line 15
    .line 16
    aput-object v4, v2, v3

    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;

    .line 22
    .line 23
    invoke-direct {v0, p0, v2}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世兰苏哲;-><init>(L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;[L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰哲世;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏哲兰()I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    iget p0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:I

    .line 4
    .line 5
    return p0
.end method
