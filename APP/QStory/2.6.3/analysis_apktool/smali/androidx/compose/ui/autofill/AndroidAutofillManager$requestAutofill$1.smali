.class final Landroidx/compose/ui/autofill/AndroidAutofillManager$requestAutofill$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰苏世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u82cf\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "left",
        "top",
        "right",
        "bottom",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(IIII)V",
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
.field final synthetic $semanticsInfo:Landroidx/compose/ui/semantics/飘花落叶言子楪哲世苏兰;

.field final synthetic this$0:Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/semantics/飘花落叶言子楪哲世苏兰;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/autofill/AndroidAutofillManager$requestAutofill$1;->this$0:Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/autofill/AndroidAutofillManager$requestAutofill$1;->$semanticsInfo:Landroidx/compose/ui/semantics/飘花落叶言子楪哲世苏兰;

    .line 4
    .line 5
    const/4 p1, 0x4

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    check-cast p3, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    check-cast p4, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/ui/autofill/AndroidAutofillManager$requestAutofill$1;->invoke(IIII)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 29
    .line 30
    return-object p0
.end method

.method public final invoke(IIII)V
    .locals 1

    .line 31
    iget-object v0, p0, Landroidx/compose/ui/autofill/AndroidAutofillManager$requestAutofill$1;->this$0:Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;

    .line 32
    iget-object v0, v0, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Landroid/graphics/Rect;

    .line 33
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 34
    iget-object p1, p0, Landroidx/compose/ui/autofill/AndroidAutofillManager$requestAutofill$1;->this$0:Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;

    .line 35
    iget-object p2, p1, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 36
    iget-object p3, p1, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 37
    iget-object p0, p0, Landroidx/compose/ui/autofill/AndroidAutofillManager$requestAutofill$1;->$semanticsInfo:Landroidx/compose/ui/semantics/飘花落叶言子楪哲世苏兰;

    check-cast p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 38
    iget p0, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 39
    iget-object p1, p1, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Landroid/graphics/Rect;

    .line 40
    iget-object p2, p2, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    check-cast p2, Landroid/view/autofill/AutofillManager;

    .line 41
    invoke-virtual {p2, p3, p0, p1}, Landroid/view/autofill/AutofillManager;->requestAutofill(Landroid/view/View;ILandroid/graphics/Rect;)V

    return-void
.end method
