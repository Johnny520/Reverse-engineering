.class public abstract Lio/ktor/server/engine/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lio/ktor/server/request/飘花落叶言子楪世兰苏哲;


# instance fields
.field private volatile synthetic receiveChannel:Ljava/lang/Object;

.field public final 飘花落叶言子楪哲兰世苏:Lkotlin/飘花落叶言子楪苏世哲兰;

.field public final 飘花落叶言子楪哲兰苏世:Lio/ktor/server/request/飘花落叶言子楪世苏兰哲;

.field public final 飘花落叶言子楪哲苏兰世:Lio/ktor/server/cio/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Lio/ktor/server/cio/飘花落叶言子楪世苏哲兰;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/ktor/server/engine/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/server/cio/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lio/ktor/server/engine/飘花落叶言子楪世兰哲苏;->receiveChannel:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance v1, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 10
    .line 11
    const/16 v2, 0x9

    .line 12
    .line 13
    invoke-direct {v1, p0, v2}, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, p0, Lio/ktor/server/engine/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 21
    .line 22
    new-instance v1, Lio/ktor/server/request/飘花落叶言子楪世苏兰哲;

    .line 23
    .line 24
    iget-object v2, p1, Lio/ktor/server/cio/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;

    .line 25
    .line 26
    iget-boolean v2, v2, Lio/ktor/server/application/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:Z

    .line 27
    .line 28
    invoke-direct {v1, v2}, Lio/ktor/server/request/飘花落叶言子楪世苏兰哲;-><init>(Z)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p1, Lio/ktor/server/cio/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;

    .line 32
    .line 33
    iget-object p1, p1, Lio/ktor/server/application/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:Lio/ktor/server/request/飘花落叶言子楪世苏兰哲;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v2, v1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 41
    .line 42
    .line 43
    iget v2, v1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 44
    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Lio/ktor/util/pipeline/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Lio/ktor/util/pipeline/飘花落叶言子楪世哲苏兰;)Z

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, Lio/ktor/server/engine/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lio/ktor/server/request/飘花落叶言子楪世苏兰哲;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    const-string p0, "Check failed."

    .line 54
    .line 55
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏()Lio/ktor/server/request/飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/server/engine/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lio/ktor/server/request/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge synthetic 飘花落叶言子楪世哲苏兰()Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/server/engine/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/server/cio/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰世哲苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/server/engine/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰世哲苏;

    .line 8
    .line 9
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世兰哲()Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/ktor/server/engine/飘花落叶言子楪世兰哲苏;->receiveChannel:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lio/ktor/server/cio/飘花落叶言子楪世兰苏哲;

    .line 8
    .line 9
    iget-object p0, p0, Lio/ktor/server/cio/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    return-object v0
.end method
