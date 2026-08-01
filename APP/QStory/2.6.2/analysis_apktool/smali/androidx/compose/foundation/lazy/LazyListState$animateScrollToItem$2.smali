.class final Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u696a\u4e16\u82cf\u5170;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u696a\u4e16\u82cf\u5170;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2"
    f = "LazyListState.kt"
    l = {
        0x24b
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $index:I

.field final synthetic $scrollOffset:I

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/lazy/飘花落叶言子世楪苏哲兰;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/飘花落叶言子世楪苏哲兰;IILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
            "II",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->this$0:Landroidx/compose/foundation/lazy/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    iput p2, p0, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->$index:I

    .line 4
    .line 5
    iput p3, p0, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->$scrollOffset:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "*>;)",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->this$0:Landroidx/compose/foundation/lazy/飘花落叶言子世楪苏哲兰;

    .line 4
    .line 5
    iget v2, p0, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->$index:I

    .line 6
    .line 7
    iget p0, p0, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->$scrollOffset:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0, p2}, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;-><init>(Landroidx/compose/foundation/lazy/飘花落叶言子世楪苏哲兰;IILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u696a\u4e16\u82cf\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->invoke(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->L$0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->this$0:Landroidx/compose/foundation/lazy/飘花落叶言子世楪苏哲兰;

    .line 29
    .line 30
    new-instance v3, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰苏世哲;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct {v3, p1, v1, v4}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰苏世哲;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世楪兰;I)V

    .line 34
    .line 35
    .line 36
    iget v4, p0, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->$index:I

    .line 37
    .line 38
    iget v5, p0, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->$scrollOffset:I

    .line 39
    .line 40
    iget-object p1, v1, Landroidx/compose/foundation/lazy/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世兰哲苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 41
    .line 42
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Landroidx/compose/foundation/lazy/飘花落叶言子楪哲兰苏世;

    .line 49
    .line 50
    iget-object v7, p1, Landroidx/compose/foundation/lazy/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 51
    .line 52
    iput v2, p0, Landroidx/compose/foundation/lazy/LazyListState$animateScrollToItem$2;->label:I

    .line 53
    .line 54
    const/16 v6, 0x64

    .line 55
    .line 56
    move-object v8, p0

    .line 57
    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰哲苏(Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;IIIL飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-ne p0, v0, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 65
    .line 66
    return-object p0
.end method
