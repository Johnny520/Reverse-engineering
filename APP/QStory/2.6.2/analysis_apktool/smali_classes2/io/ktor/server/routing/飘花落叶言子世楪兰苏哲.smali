.class public final Lio/ktor/server/routing/飘花落叶言子世楪兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

.field public 飘花落叶言子楪世哲兰苏:Lio/ktor/server/routing/飘花落叶言子世楪哲兰苏;

.field public 飘花落叶言子楪世哲苏兰:Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;

.field public final 飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/List;


# direct methods
.method public constructor <init>(Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lio/ktor/server/routing/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 11
    .line 12
    new-instance p1, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

    .line 13
    .line 14
    const/4 p2, 0x2

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p1, p2, v0}, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;-><init>(IZ)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lio/ktor/server/routing/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

    .line 20
    .line 21
    new-instance p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lio/ktor/server/routing/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Trace for "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lio/ktor/server/routing/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/ktor/server/routing/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Lio/ktor/server/routing/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲苏兰:Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p0, v0, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏世哲楪兰(Ljava/util/List;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 41
    .line 42
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    const-string p0, "Unable to peek an element into empty stack"

    .line 47
    .line 48
    invoke-static {p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
