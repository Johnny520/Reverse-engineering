.class public final Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世苏兰哲:Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;

.field public 飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroidx/lifecycle/Lifecycle$Event;->getTargetState()Landroidx/lifecycle/Lifecycle$State;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-gez v2, :cond_0

    .line 17
    .line 18
    move-object v1, v0

    .line 19
    :cond_0
    iput-object v1, p0, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;

    .line 22
    .line 23
    invoke-interface {v1, p1, p2}, Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏世兰哲(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/Lifecycle$Event;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 27
    .line 28
    return-void
.end method
