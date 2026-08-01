.class public final synthetic Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲苏兰;

    .line 9
    .line 10
    new-instance v0, Landroid/view/inputmethod/BaseInputConnection;

    .line 11
    .line 12
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    check-cast p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰苏世哲;

    .line 20
    .line 21
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v0, "input_method"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_1
    check-cast p0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 40
    .line 41
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode$startCursorJob$1;->飘花落叶言子楪世苏兰哲(Lkotlin/jvm/internal/Ref$IntRef;)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :pswitch_2
    check-cast p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲苏世兰;

    .line 51
    .line 52
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoController$startOrStopMonitoring$1;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲苏世兰;)Landroid/view/inputmethod/CursorAnchorInfo;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
