.class final synthetic Landroidx/compose/foundation/gestures/ScrollableNode$ensureMouseWheelScrollingLogicInitialized$1;
.super Lkotlin/jvm/internal/AdaptedFunctionReference;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/AdaptedFunctionReference;",
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
    const-string v5, "onWheelScrollStopped-TH1AsA0(J)V"

    .line 2
    .line 3
    const/4 v6, 0x4

    .line 4
    const/4 v1, 0x2

    .line 5
    const-class v3, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏楪兰世;

    .line 6
    .line 7
    const-string v4, "onWheelScrollStopped"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/AdaptedFunctionReference;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    iget-wide v0, p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, p2}, Landroidx/compose/foundation/gestures/ScrollableNode$ensureMouseWheelScrollingLogicInitialized$1;->invoke-sF-c-tU(JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final invoke-sF-c-tU(JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lkotlin/jvm/internal/AdaptedFunctionReference;->receiver:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏楪兰世;

    .line 4
    .line 5
    iget-object p3, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏楪兰世;->飘花落叶言子苏楪兰世哲:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    invoke-virtual {p3}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲()Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    new-instance v0, Landroidx/compose/foundation/gestures/ScrollableNode$onWheelScrollStopped$1;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, p1, p2, v1}, Landroidx/compose/foundation/gestures/ScrollableNode$onWheelScrollStopped$1;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子哲苏楪兰世;JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x3

    .line 18
    invoke-static {p3, v1, v1, v0, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 19
    .line 20
    .line 21
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 22
    .line 23
    return-object p0
.end method
