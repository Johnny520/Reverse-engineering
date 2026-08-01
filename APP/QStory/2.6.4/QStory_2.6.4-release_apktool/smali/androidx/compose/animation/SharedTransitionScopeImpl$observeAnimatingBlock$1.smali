.class final Landroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/animation/飘花落叶言子苏世哲兰楪;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/飘花落叶言子苏世哲兰楪;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1;->this$0:Landroidx/compose/animation/飘花落叶言子苏世哲兰楪;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 44
    invoke-virtual {p0}, Landroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1;->invoke()V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke()V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1;->this$0:Landroidx/compose/animation/飘花落叶言子苏世哲兰楪;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪兰世哲苏:Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰苏世哲;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏兰哲()Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世哲苏;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object p0, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    invoke-virtual {p0}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Landroidx/compose/animation/飘花落叶言子苏楪世哲兰;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    throw p0

    .line 43
    :cond_1
    :goto_0
    return-void
.end method
