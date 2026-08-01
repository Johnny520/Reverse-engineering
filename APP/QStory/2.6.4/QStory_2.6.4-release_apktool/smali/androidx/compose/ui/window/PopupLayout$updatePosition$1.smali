.class final Landroidx/compose/ui/window/PopupLayout$updatePosition$1;
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
.field final synthetic $parentBounds:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;

.field final synthetic $popupContentSize:J

.field final synthetic $popupPosition:Lkotlin/jvm/internal/Ref$LongRef;

.field final synthetic $windowSize:J

.field final synthetic this$0:Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$LongRef;Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout$updatePosition$1;->$popupPosition:Lkotlin/jvm/internal/Ref$LongRef;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/window/PopupLayout$updatePosition$1;->this$0:Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/ui/window/PopupLayout$updatePosition$1;->$parentBounds:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;

    .line 6
    .line 7
    iput-wide p4, p0, Landroidx/compose/ui/window/PopupLayout$updatePosition$1;->$windowSize:J

    .line 8
    .line 9
    iput-wide p6, p0, Landroidx/compose/ui/window/PopupLayout$updatePosition$1;->$popupContentSize:J

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 28
    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout$updatePosition$1;->invoke()V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke()V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout$updatePosition$1;->$popupPosition:Lkotlin/jvm/internal/Ref$LongRef;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout$updatePosition$1;->this$0:Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->getPositionProvider()Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v3, p0, Landroidx/compose/ui/window/PopupLayout$updatePosition$1;->$parentBounds:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;

    .line 10
    .line 11
    iget-wide v4, p0, Landroidx/compose/ui/window/PopupLayout$updatePosition$1;->$windowSize:J

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout$updatePosition$1;->this$0:Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->getParentLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    iget-wide v7, p0, Landroidx/compose/ui/window/PopupLayout$updatePosition$1;->$popupContentSize:J

    .line 20
    .line 21
    invoke-interface/range {v2 .. v8}, Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏哲世兰(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;JLandroidx/compose/ui/unit/LayoutDirection;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    iput-wide v1, v0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 26
    .line 27
    return-void
.end method
