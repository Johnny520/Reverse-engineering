.class public final synthetic Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰楪苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lkotlin/jvm/internal/Ref$FloatRef;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$FloatRef;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲兰世苏:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲兰世苏:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 4
    .line 5
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectVerticalDragGestures$5;->飘花落叶言子楪世哲兰苏(Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;F)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->飘花落叶言子楪世哲兰苏(Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;F)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
