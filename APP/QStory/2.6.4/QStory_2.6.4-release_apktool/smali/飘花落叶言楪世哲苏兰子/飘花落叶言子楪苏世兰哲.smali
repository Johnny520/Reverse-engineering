.class public final L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏世哲兰;
.implements Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/HashSet;

    .line 10
    .line 11
    iput-object p1, p0, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public onDestroy(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;)V
    .locals 2
    .annotation runtime Landroidx/lifecycle/飘花落叶言子世兰楪哲苏;
        value = .enum Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;
    .end annotation

    .line 1
    iget-object v0, p0, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世兰苏哲子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏哲世兰;

    .line 22
    .line 23
    invoke-interface {v1}, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-interface {p1}, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;->getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1, p0}, Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public onStart(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;)V
    .locals 0
    .annotation runtime Landroidx/lifecycle/飘花落叶言子世兰楪哲苏;
        value = .enum Landroidx/lifecycle/Lifecycle$Event;->ON_START:Landroidx/lifecycle/Lifecycle$Event;
    .end annotation

    .line 1
    iget-object p0, p0, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世兰苏哲子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏哲世兰;

    .line 22
    .line 23
    invoke-interface {p1}, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public onStop(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;)V
    .locals 0
    .annotation runtime Landroidx/lifecycle/飘花落叶言子世兰楪哲苏;
        value = .enum Landroidx/lifecycle/Lifecycle$Event;->ON_STOP:Landroidx/lifecycle/Lifecycle$Event;
    .end annotation

    .line 1
    iget-object p0, p0, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世兰苏哲子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏哲世兰;

    .line 22
    .line 23
    invoke-interface {p1}, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲(L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏哲世兰;)V
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 7
    .line 8
    check-cast p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 11
    .line 12
    sget-object v0, Landroidx/lifecycle/Lifecycle$State;->DESTROYED:Landroidx/lifecycle/Lifecycle$State;

    .line 13
    .line 14
    if-ne p0, v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    sget-object v0, Landroidx/lifecycle/Lifecycle$State;->STARTED:Landroidx/lifecycle/Lifecycle$State;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroidx/lifecycle/Lifecycle$State;->isAtLeast(Landroidx/lifecycle/Lifecycle$State;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-interface {p1}, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏哲世兰;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
