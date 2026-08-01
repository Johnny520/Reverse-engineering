.class final Landroidx/compose/ui/platform/InputMethodSession$createInputConnection$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/text/input/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170;",
        "closedConnection",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(Landroidx/compose/ui/text/input/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170;)V",
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
.field final synthetic this$0:Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/InputMethodSession$createInputConnection$1$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 62
    check-cast p1, Landroidx/compose/ui/text/input/飘花落叶言子楪哲世苏兰;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/InputMethodSession$createInputConnection$1$1;->invoke(Landroidx/compose/ui/text/input/飘花落叶言子楪哲世苏兰;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/text/input/飘花落叶言子楪哲世苏兰;)V
    .locals 4

    .line 1
    check-cast p1, Landroidx/compose/ui/text/input/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Landroid/view/inputmethod/InputConnection;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Landroid/view/inputmethod/InputConnection;->closeConnection()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Landroid/view/inputmethod/InputConnection;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/InputMethodSession$createInputConnection$1$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;

    .line 14
    .line 15
    iget-object v0, v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲兰苏:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    iget-object v1, v0, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 18
    .line 19
    iget v0, v0, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    if-ge v2, v0, :cond_2

    .line 23
    .line 24
    aget-object v3, v1, v2

    .line 25
    .line 26
    check-cast v3, Landroidx/compose/ui/node/飘花落叶言子哲楪兰世苏;

    .line 27
    .line 28
    invoke-static {v3, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/4 v2, -0x1

    .line 39
    :goto_1
    if-ltz v2, :cond_3

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/compose/ui/platform/InputMethodSession$createInputConnection$1$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;

    .line 42
    .line 43
    iget-object p1, p1, Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲兰苏:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :cond_3
    iget-object p0, p0, Landroidx/compose/ui/platform/InputMethodSession$createInputConnection$1$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;

    .line 49
    .line 50
    iget-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲兰苏:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 51
    .line 52
    iget p1, p1, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 53
    .line 54
    if-nez p1, :cond_4

    .line 55
    .line 56
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 57
    .line 58
    invoke-interface {p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :cond_4
    return-void
.end method
