.class public final Landroidx/compose/ui/viewinterop/飘花落叶言子楪哲世苏兰;
.super Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/ui/node/飘花落叶言子苏世哲兰楪;
.implements Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;


# instance fields
.field public 飘花落叶言子世苏哲楪兰:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

.field public final 飘花落叶言子世苏楪兰哲:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 5
    .line 6
    new-instance v1, Landroidx/compose/ui/viewinterop/FocusTargetInteropNode$focusTargetNode$1;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Landroidx/compose/ui/viewinterop/FocusTargetInteropNode$focusTargetNode$1;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/16 v2, 0x9

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v0, v3, v1, v2}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;-><init>(IL飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子哲兰世苏楪(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子苏哲楪兰世()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/compose/ui/viewinterop/FocusTargetInteropNode$retrievePinnableContainer$1;

    .line 7
    .line 8
    invoke-direct {v1, v0, p0}, Landroidx/compose/ui/viewinterop/FocusTargetInteropNode$retrievePinnableContainer$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/viewinterop/飘花落叶言子楪哲世苏兰;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroidx/compose/ui/layout/飘花落叶言子苏世哲兰楪;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子兰楪苏世哲()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusStateImpl;->isFocused()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 35
    .line 36
    .line 37
    :cond_0
    if-eqz v0, :cond_1

    .line 38
    .line 39
    check-cast v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰()Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    :goto_0
    iput-object v0, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 47
    .line 48
    :cond_2
    return-void
.end method
