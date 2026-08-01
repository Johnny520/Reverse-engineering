.class final Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
        "invoke",
        "(Landroidx/compose/ui/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;I)Landroidx/compose/ui/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
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
.field final synthetic $boundsTransform:Landroidx/compose/animation/飘花落叶言子楪哲兰苏世;

.field final synthetic $clipInOverlayDuringTransition:Landroidx/compose/animation/飘花落叶言子苏楪哲兰世;

.field final synthetic $parentTransition:Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u696a\u5170;"
        }
    .end annotation
.end field

.field final synthetic $placeholderSize:Landroidx/compose/animation/飘花落叶言子苏楪兰世哲;

.field final synthetic $renderInOverlayDuringTransition:Z

.field final synthetic $renderOnlyWhenVisible:Z

.field final synthetic $sharedContentState:Landroidx/compose/animation/飘花落叶言子苏世楪哲兰;

.field final synthetic $visible:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
        }
    .end annotation
.end field

.field final synthetic $zIndexInOverlay:F

.field final synthetic this$0:Landroidx/compose/animation/飘花落叶言子苏世哲兰楪;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/飘花落叶言子苏世楪哲兰;Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Landroidx/compose/animation/飘花落叶言子苏世哲兰楪;Landroidx/compose/animation/飘花落叶言子苏楪兰世哲;ZLandroidx/compose/animation/飘花落叶言子苏楪哲兰世;FZLandroidx/compose/animation/飘花落叶言子楪哲兰苏世;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u696a\u54f2\u5170;",
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u696a\u5170;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "Landroidx/compose/animation/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u54f2\u5170\u696a;",
            "Landroidx/compose/animation/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u696a\u5170\u4e16\u54f2;",
            "Z",
            "Landroidx/compose/animation/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u696a\u54f2\u5170\u4e16;",
            "FZ",
            "Landroidx/compose/animation/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u82cf\u4e16;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1;->$parentTransition:Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;

    .line 2
    .line 3
    iput-object p3, p0, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1;->$visible:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    iput-object p4, p0, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1;->this$0:Landroidx/compose/animation/飘花落叶言子苏世哲兰楪;

    .line 6
    .line 7
    iput-boolean p6, p0, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1;->$renderOnlyWhenVisible:Z

    .line 8
    .line 9
    iput-object p7, p0, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1;->$clipInOverlayDuringTransition:Landroidx/compose/animation/飘花落叶言子苏楪哲兰世;

    .line 10
    .line 11
    iput p8, p0, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1;->$zIndexInOverlay:F

    .line 12
    .line 13
    iput-boolean p9, p0, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1;->$renderInOverlayDuringTransition:Z

    .line 14
    .line 15
    iput-object p10, p0, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1;->$boundsTransform:Landroidx/compose/animation/飘花落叶言子楪哲兰苏世;

    .line 16
    .line 17
    const/4 p1, 0x3

    .line 18
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;
    .locals 0

    const p0, -0x5bc2fdb1

    .line 16
    check-cast p2, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    invoke-virtual {p2, p0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世哲兰(I)V

    const/4 p0, 0x0

    throw p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    check-cast p2, Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1;->invoke(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
