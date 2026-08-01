.class public final Landroidx/lifecycle/飘花落叶言子苏世楪兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Landroidx/lifecycle/飘花落叶言子苏世楪哲兰;

.field public 飘花落叶言子楪哲兰苏世:Z

.field public final 飘花落叶言子楪哲苏兰世:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroidx/lifecycle/飘花落叶言子苏世楪哲兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/lifecycle/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/lifecycle/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/lifecycle/飘花落叶言子苏世楪哲兰;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/lifecycle/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰苏世:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Landroidx/lifecycle/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰苏世:Z

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Landroidx/lifecycle/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/lifecycle/飘花落叶言子苏世楪哲兰;

    .line 18
    .line 19
    iget-object p1, p1, Landroidx/lifecycle/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 20
    .line 21
    iget-object p1, p1, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Landroidx/fragment/app/飘花落叶言子楪兰哲世苏;

    .line 24
    .line 25
    iget-object p0, p0, Landroidx/lifecycle/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p2, p0, p1}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲苏兰;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string p0, "Already attached to lifecycleOwner"

    .line 32
    .line 33
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    iput-boolean p2, p0, Landroidx/lifecycle/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰苏世:Z

    .line 7
    .line 8
    invoke-interface {p1}, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;->getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p0}, Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
