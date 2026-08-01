.class public final Lkotlin/sequences/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlin/sequences/飘花落叶言子楪苏哲世兰;
.implements Lkotlin/sequences/飘花落叶言子楪世哲苏兰;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:Lkotlin/sequences/飘花落叶言子楪苏哲世兰;


# direct methods
.method public constructor <init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lkotlin/sequences/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lkotlin/sequences/飘花落叶言子楪苏哲世兰;

    .line 8
    .line 9
    iput p2, p0, Lkotlin/sequences/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 10
    .line 11
    if-ltz p2, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "count must be non-negative, but was "

    .line 15
    .line 16
    const/16 p1, 0x2e

    .line 17
    .line 18
    invoke-static {p2, p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    throw p0
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lkotlin/collections/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lkotlin/collections/飘花落叶言子楪兰哲世苏;-><init>(Lkotlin/sequences/飘花落叶言子楪世苏兰哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏哲兰(I)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;
    .locals 1

    .line 1
    iget v0, p0, Lkotlin/sequences/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lkotlin/sequences/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lkotlin/sequences/飘花落叶言子楪世苏兰哲;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;I)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance p1, Lkotlin/sequences/飘花落叶言子楪世苏兰哲;

    .line 13
    .line 14
    iget-object p0, p0, Lkotlin/sequences/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lkotlin/sequences/飘花落叶言子楪苏哲世兰;

    .line 15
    .line 16
    invoke-direct {p1, p0, v0}, Lkotlin/sequences/飘花落叶言子楪世苏兰哲;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;I)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method
