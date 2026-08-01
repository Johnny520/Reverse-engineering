.class public final Landroidx/collection/飘花落叶言子世兰苏楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Iterator;
.implements L飘花落叶言世子哲苏楪兰/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Lkotlin/sequences/飘花落叶言子楪苏哲兰世;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroidx/collection/飘花落叶言子世兰苏哲楪;

.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Landroidx/collection/飘花落叶言子世兰苏哲楪;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/collection/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰苏世:Landroidx/collection/飘花落叶言子世兰苏哲楪;

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Landroidx/collection/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲苏兰世:I

    .line 8
    .line 9
    new-instance v0, Landroidx/collection/MutableSetWrapper$iterator$1$iterator$1;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p1, p0, v1}, Landroidx/collection/MutableSetWrapper$iterator$1$iterator$1;-><init>(Landroidx/collection/飘花落叶言子世兰苏哲楪;Landroidx/collection/飘花落叶言子世兰苏楪哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世苏哲楪兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Lkotlin/sequences/飘花落叶言子楪苏哲兰世;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Landroidx/collection/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:Lkotlin/sequences/飘花落叶言子楪苏哲兰世;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/collection/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:Lkotlin/sequences/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlin/sequences/飘花落叶言子楪苏哲兰世;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/collection/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:Lkotlin/sequences/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlin/sequences/飘花落叶言子楪苏哲兰世;->next()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/collection/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v2, p0, Landroidx/collection/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰苏世:Landroidx/collection/飘花落叶言子世兰苏哲楪;

    .line 7
    .line 8
    iget-object v2, v2, Landroidx/collection/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲兰世苏:Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲世苏兰(I)V

    .line 11
    .line 12
    .line 13
    iput v1, p0, Landroidx/collection/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲苏兰世:I

    .line 14
    .line 15
    :cond_0
    return-void
.end method
