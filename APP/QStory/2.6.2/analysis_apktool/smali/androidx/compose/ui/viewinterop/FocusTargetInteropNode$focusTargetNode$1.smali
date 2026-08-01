.class final synthetic Landroidx/compose/ui/viewinterop/FocusTargetInteropNode$focusTargetNode$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v5, "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x2

    .line 5
    const-class v3, Landroidx/compose/ui/viewinterop/飘花落叶言子楪哲世苏兰;

    .line 6
    .line 7
    const-string v4, "onFocusStateChange"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 62
    check-cast p1, Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;

    check-cast p2, Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/viewinterop/FocusTargetInteropNode$focusTargetNode$1;->invoke(Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪哲世苏兰;

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p2}, Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;->isFocused()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-interface {p1}, Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;->isFocused()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-ne p2, p1, :cond_1

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_1
    const/4 p1, 0x0

    .line 22
    if-eqz p2, :cond_3

    .line 23
    .line 24
    new-instance p2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 25
    .line 26
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v0, Landroidx/compose/ui/viewinterop/FocusTargetInteropNode$retrievePinnableContainer$1;

    .line 30
    .line 31
    invoke-direct {v0, p2, p0}, Landroidx/compose/ui/viewinterop/FocusTargetInteropNode$retrievePinnableContainer$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/viewinterop/飘花落叶言子楪哲世苏兰;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 35
    .line 36
    .line 37
    iget-object p2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p2, Landroidx/compose/ui/layout/飘花落叶言子苏世哲兰楪;

    .line 40
    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    move-object p1, p2

    .line 44
    check-cast p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰()Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 47
    .line 48
    .line 49
    :cond_2
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    iget-object p2, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 53
    .line 54
    if-eqz p2, :cond_4

    .line 55
    .line 56
    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 57
    .line 58
    .line 59
    :cond_4
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 60
    .line 61
    return-void
.end method
