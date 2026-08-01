.class final synthetic Landroidx/compose/ui/platform/AndroidComposeView$dragAndDropManager$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
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
    const-string v5, "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x3

    .line 5
    const-class v3, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 6
    .line 7
    const-string v4, "startDrag"

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
.method public synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    check-cast p2, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 4
    .line 5
    iget-wide p1, p2, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:J

    .line 6
    .line 7
    check-cast p3, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/compose/ui/platform/AndroidComposeView$dragAndDropManager$1;->invoke-12SF9DM(Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏哲兰世;JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public final invoke-12SF9DM(Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏哲兰世;JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Boolean;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/draganddrop/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;",
            "J",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            ")",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    sget-object v0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子兰世楪哲苏:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 26
    .line 27
    new-instance v2, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲兰苏;

    .line 28
    .line 29
    invoke-direct {v2, v1, v0}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲兰苏;-><init>(FF)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲苏兰;

    .line 33
    .line 34
    invoke-direct {v0, v2, p2, p3, p4}, Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲兰苏;JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 35
    .line 36
    .line 37
    sget-object p2, Landroidx/compose/ui/platform/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/platform/飘花落叶言子世楪哲苏兰;

    .line 38
    .line 39
    invoke-virtual {p2, p0, p1, v0}, Landroidx/compose/ui/platform/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰(Landroid/view/View;Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏哲兰世;Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲苏兰;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method
